package com.reactnativecommunity.netinfo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import defpackage.df4;
import defpackage.ndj;
import defpackage.xjg;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = "RNCNetInfo")
public class NetInfoModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RNCNetInfo";
    private final df4 mConnectivityReceiver;

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mConnectivityReceiver = new xjg(reactApplicationContext);
    }

    @ReactMethod
    public void getCurrentState(Promise promise) {
        this.mConnectivityReceiver.c(promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCNetInfo";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mConnectivityReceiver.e();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mConnectivityReceiver.g();
    }
}
