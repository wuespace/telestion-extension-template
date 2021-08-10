# telestion-extension-template

An extension template to quickly deploy Telestion extensions for your needs. 

## Usage

1. Go to the GitHub repository: \
   https://github.com/wuespace/telestion-extension-template

2. Click "Use this template" in the GitHub UI. \
   !["Use this template" button in the GitHub UI](https://user-images.githubusercontent.com/52416718/128894030-f6fd0427-d561-405b-9448-055bf79f8ee8.png)

3. Enter your new extension information and press "Create repository from template". \
   ![Repository creation from GitHub Template](https://user-images.githubusercontent.com/52416718/128894072-f109429c-4a0a-41df-af9c-ac85fd11a456.png)

4. When the creation has finished, go to the actions page. \
   ![GitHub Actions Page](https://user-images.githubusercontent.com/52416718/128932587-4f6a9923-62dc-4c4b-ae8f-29c1e3f0637c.png)

5. Search for the "Initialize" action and select it in the sidebar. \
   ![The "Initialize" action in the actions sidebar](https://user-images.githubusercontent.com/52416718/128932669-2ff00819-29a1-44f5-a23c-98deb13be763.png)

6. Select "Run workflow" and enter your preferences before clicking the green "Run workflow" button. \
   ![Screenshot_20210810_204402](https://user-images.githubusercontent.com/52416718/128932740-e359c68d-c3e9-4639-af37-1d4a4433b525.png)

7. Let the magic happen. :wink:

8. Before you begin, please add a personal access token to the GitHub secrets 
   with `packages:read` scope and name it `READ_PACKAGES`.
   It allows the Actions to access the telestion-core packages in the GitHub Maven package registry.

9. Finished!

## Contributing

For the documentation on contributing to this repository,
please take a look at the [Contributing Guidelines](./CONTRIBUTING.md).

## About

This is part of [Telestion](https://telestion.wuespace.de/), a project by [WüSpace e.V.](https://www.wuespace.de/).
