package de.wuespace.telestion.extension.template;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.wuespace.telestion.api.verticle.TelestionConfiguration;
import de.wuespace.telestion.api.verticle.TelestionVerticle;
import de.wuespace.telestion.api.verticle.trait.WithEventBus;
import de.wuespace.telestion.api.verticle.trait.WithTiming;
import de.wuespace.telestion.extension.template.message.Position;
import io.vertx.core.Vertx;

import java.time.Duration;

/**
 * Template verticle which publishes a position in regular intervals.
 */
@SuppressWarnings("unused")
public class TemplateVerticle extends TelestionVerticle<TemplateVerticle.Configuration>
        implements WithTiming, WithEventBus {

    public static void main(String[] args) {
        var vertx = Vertx.vertx();
        vertx.deployVerticle(new TemplateVerticle());
    }

    public record Configuration(
            @JsonProperty int delay,
            @JsonProperty String outAddress
    ) implements TelestionConfiguration {
        public Configuration() {
            this(2, "position");
        }
    }

    @Override
    public void onStart() {
        interval(Duration.ofSeconds(getConfig().delay()), id -> {
            publish(getConfig().outAddress(), new Position(0.3, 7.2, 8.0));
        });
    }
}
