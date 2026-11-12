package com.facebook.react.modules.deviceinfo;

import android.content.Context;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import defpackage.e4q;
import defpackage.iz6;
import defpackage.ndj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = DeviceInfoModule.NAME)
public class DeviceInfoModule extends BaseJavaModule implements LifecycleEventListener, e4q {
    public static final String NAME = "DeviceInfo";
    private float mFontScale;
    private ReactApplicationContext mReactApplicationContext;

    public DeviceInfoModule(ReactApplicationContext reactApplicationContext) {
        this((Context) reactApplicationContext);
        this.mReactApplicationContext = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public void emitUpdateDimensionsEvent() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext == null) {
            return;
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("didUpdateDimensions", iz6.b(this.mFontScale));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("Dimensions", iz6.a(this.mFontScale));
        return map;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public void invalidate() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext == null) {
            return;
        }
        float f = reactApplicationContext.getResources().getConfiguration().fontScale;
        if (this.mFontScale != f) {
            this.mFontScale = f;
            emitUpdateDimensionsEvent();
        }
    }

    public DeviceInfoModule(Context context) {
        this.mReactApplicationContext = null;
        iz6.h(context);
        this.mFontScale = context.getResources().getConfiguration().fontScale;
    }
}
