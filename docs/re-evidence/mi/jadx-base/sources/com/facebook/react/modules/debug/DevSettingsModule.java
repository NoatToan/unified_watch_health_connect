package com.facebook.react.modules.debug;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.n06;
import defpackage.ndj;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = DevSettingsModule.NAME)
public class DevSettingsModule extends BaseJavaModule {
    public static final String NAME = "DevSettings";
    private final n06 mDevSupportManager;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DevSettingsModule.this.mDevSupportManager.handleReloadJS();
        }
    }

    public DevSettingsModule(n06 n06Var) {
        this.mDevSupportManager = n06Var;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void reload() {
        if (this.mDevSupportManager.getDevSupportEnabled()) {
            UiThreadUtil.runOnUiThread(new a());
        }
    }

    @ReactMethod
    public void setHotLoadingEnabled(boolean z) {
        this.mDevSupportManager.setHotModuleReplacementEnabled(z);
    }

    @ReactMethod
    public void setIsDebuggingRemotely(boolean z) {
        this.mDevSupportManager.setRemoteJSDebugEnabled(z);
    }

    @ReactMethod
    public void setLiveReloadEnabled(boolean z) {
        this.mDevSupportManager.setReloadOnJSChangeEnabled(z);
    }

    @ReactMethod
    public void setProfilingEnabled(boolean z) {
        this.mDevSupportManager.setFpsDebugEnabled(z);
    }

    @ReactMethod
    public void toggleElementInspector() {
        this.mDevSupportManager.toggleElementInspector();
    }
}
