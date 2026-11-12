package com.facebook.react.modules.core;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import defpackage.fv5;
import defpackage.ndj;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = DeviceEventManagerModule.NAME)
public class DeviceEventManagerModule extends ReactContextBaseJavaModule {
    public static final String NAME = "DeviceEventManager";
    private final Runnable mInvokeDefaultBackPressRunnable;

    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fv5 f7374a;

        public a(fv5 fv5Var) {
            this.f7374a = fv5Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            UiThreadUtil.assertOnUiThread();
            this.f7374a.invokeDefaultOnBackPressed();
        }
    }

    public DeviceEventManagerModule(ReactApplicationContext reactApplicationContext, fv5 fv5Var) {
        super(reactApplicationContext);
        this.mInvokeDefaultBackPressRunnable = new a(fv5Var);
    }

    public void emitHardwareBackPressed() {
        ((RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("hardwareBackPress", null);
    }

    public void emitNewIntentReceived(Uri uri) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("url", uri.toString());
        ((RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("url", writableMapCreateMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void invokeDefaultBackPressHandler() {
        getReactApplicationContext().runOnUiQueueThread(this.mInvokeDefaultBackPressRunnable);
    }
}
