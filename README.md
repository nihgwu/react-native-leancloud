# react-native-leancloud

a react native component for [leancloud javascript-sdk](https://github.com/leancloud/javascript-sdk)

this component simply move the `appId` and `appKey` from the javascript file to native code as it's really easy to get those values from the `js.bundle` in released app.

## Install

**you have to install [leancloud javascript-sdk](https://github.com/leancloud/javascript-sdk) first**

```shell
npm install nihgwu/react-native-leancloud --save
```

## Automatically link

#### With React Native 0.27+

```shell
react-native link react-native-leancloud
```

#### With older versions of React Native

You need [`rnpm`](https://github.com/rnpm/rnpm) (`npm install -g rnpm`)

```shell
rnpm link react-native-leancloud
```

## Manually link

### iOS

In XCode, in the project navigator:
- Right click _Libraries_
- Add Files to _[your project's name]_
- Go to `node_modules/react-native-leancloud/ios`
- Add the `.xcodeproj` file

In XCode, in the project navigator, select your project.
- Add the `libRNLeanCloud.a` from the _deviceinfo_ project to your project's _Build Phases ➜ Link Binary With Libraries_
- Click `.xcodeproj` file you added before in the project navigator and go the _Build Settings_ tab. Make sure _All_ is toggled on (instead of _Basic_).
- Look for _Header Search Paths_ and make sure it contains both `$(SRCROOT)/../react-native/React` and `$(SRCROOT)/../../React` 
- Mark both as recursive (should be OK by default).

Run your project (Cmd+R)

### Android

#### With React Native 0.29+

- in `MainApplication.java`:

```diff
+ import com.liteneo.RNLeanCloud.RNLeanCloudPackage;

  public class MainApplication extends Application implements ReactApplication {
    //......

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
+         new RNLeanCloudPackage("your leancloud appId", "your leancloud appKey"),
          new MainReactPackage()
      );
    }
    
    ......
  }
```

#### With older versions of React Native:

- in `MainActivity.java`:

```diff
+ import com.liteneo.RNLeanCloud.RNLeanCloudPackage;

  public class MainActivity extends ReactActivity {
    ......

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
+       new RNLeanCloudPackage("your leancloud appId", "your leancloud appKey"),
        new MainReactPackage()
      );
    }
  }
```

## Configuration

### iOS

- in `info.plist`

```diff
+   <key>LeanCloudAppId</key>
+   <string>your leancloud appId</string>
+   <key>LeanCloudAppKey</key>
+   <string>your leancloud appKey</string>
```

### Android

see [Manually link for Android](#android)

## Usage

```js
import AV from 'leancloud-storage';
import RNLeanCloud from 'react-native-leancloud';

AV.init({
  appId: RNLeanCloud.appId,
  appKey: RNLeanCloud.appKey,
});
```