package com.liteneo.RNLeanCloud;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

import java.util.HashMap;
import java.util.Map;

public class RNLeanCloudModule extends ReactContextBaseJavaModule {

  private String mAppId;
  private String mAppKey;

  public RNLeanCloudModule(ReactApplicationContext reactContext, String appId, String appKey) {
    super(reactContext);
    this.mAppId = appId;
    this.mAppKey = appKey;
  }

  @Override
  public String getName() {
    return "RNLeanCloud";
  }

  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    constants.put("appId", mAppId);
    constants.put("appKey", mAppKey);
    return constants;
  }
}
