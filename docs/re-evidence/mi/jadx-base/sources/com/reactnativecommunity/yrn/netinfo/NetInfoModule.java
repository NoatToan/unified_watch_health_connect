package com.reactnativecommunity.yrn.netinfo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import defpackage.cf4;
import defpackage.ndj;
import defpackage.zjg;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = "RNCNetInfo")
public class NetInfoModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RNCNetInfo";
    private Boolean isJSBridgeReady;
    private Boolean isMainActivityReady;
    private Boolean isRegister;
    private final cf4 mConnectivityReceiver;

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Boolean bool = Boolean.FALSE;
        this.isMainActivityReady = bool;
        this.isJSBridgeReady = bool;
        this.isRegister = bool;
        this.mConnectivityReceiver = new zjg(reactApplicationContext);
    }

    private void _register() {
        if (this.isMainActivityReady.booleanValue() && this.isJSBridgeReady.booleanValue() && !this.isRegister.booleanValue()) {
            this.mConnectivityReceiver.e();
            this.isRegister = Boolean.TRUE;
        }
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
        this.isJSBridgeReady = Boolean.TRUE;
        _register();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mConnectivityReceiver.g();
        this.isRegister = Boolean.FALSE;
    }

    public void registerModule() {
        _register();
    }

    public void setMainActivityReady(boolean z) {
        this.isMainActivityReady = Boolean.valueOf(z);
        if (z) {
            _register();
        }
    }
}
