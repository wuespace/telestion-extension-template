# ##REPO_NAME##

##REPO_DESCRIPTION##

## Install

First, add the extension package registry to your gradle repositories:

```groovy
repositories {
    maven {
        name = "GitHubExtensionRepo"
        url = uri("https://maven.pkg.github.com/##REPO_USER##/##REPO_NAME##/")
        credentials {
            username = System.getenv("GITHUB_ACTOR") == null ? GITHUB_ACTOR : System.getenv("GITHUB_ACTOR")
            password = System.getenv("GITHUB_TOKEN") == null ? GITHUB_TOKEN : System.getenv("GITHUB_TOKEN")
        }
    }
}
```

Next, add the extension to the project dependency list:

```groovy
dependencies {
    // ...
    implementation '##GROUP_ID##:##ARTIFACT_ID##:0.1.0'
    // ...
}
```

And synchronize gradle.

Finished!

## Usage

Coming soon :wink:

## Contributing

For the documentation on contributing to this repository,
please take a look at the [Contributing Guidelines](./CONTRIBUTING.md).

## About

This is part of [Telestion](https://telestion.wuespace.de/), a project by [WüSpace e.V.](https://www.wuespace.de/).
