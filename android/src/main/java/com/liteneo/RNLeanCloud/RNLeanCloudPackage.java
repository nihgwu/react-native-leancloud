package com.liteneo.RNLeanCloud;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RNLeanCloudPackage implements ReactPackage {

  private String mAppId;
  private String mAppKey;

  public RNLeanCloudPackage(String appId, String appKey) {
    this.mAppId = appId;
    this.mAppKey = appKey;
  }

  @Override
  public List<NativeModule> createNativeModules(
                              ReactApplicationContext reactContext) {
    List<NativeModule> modules = new ArrayList<>();

    modules.add(new RNLeanCloudModule(reactContext, this.mAppId, this.mAppKey));

    return modules;
  }

  @Override
  public List<Class<? extends JavaScriptModule>> createJSModules() {
  	return Collections.emptyList();
  }

  @Override
  public List<ViewManager> createViewManagers(
                            ReactApplicationContext reactContext) {
  	return Collections.emptyList();
  }

}
