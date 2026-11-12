package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes4.dex */
public class JSIModuleHolder {
    private JSIModule mModule;
    private final JSIModuleSpec mSpec;

    public JSIModuleHolder(JSIModuleSpec jSIModuleSpec) {
        this.mSpec = jSIModuleSpec;
    }

    public JSIModule getJSIModule() {
        if (this.mModule == null) {
            synchronized (this) {
                try {
                    JSIModule jSIModule = this.mModule;
                    if (jSIModule != null) {
                        return jSIModule;
                    }
                    JSIModule jSIModule2 = this.mSpec.getJSIModuleProvider().get();
                    this.mModule = jSIModule2;
                    jSIModule2.initialize();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.mModule;
    }

    public void notifyJSInstanceDestroy() {
        JSIModule jSIModule = this.mModule;
        if (jSIModule != null) {
            jSIModule.onCatalystInstanceDestroy();
        }
    }
}
