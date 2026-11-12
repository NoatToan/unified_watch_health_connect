package com.facebook.v8.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;

/* JADX INFO: loaded from: classes4.dex */
public class V8Executor extends JavaScriptExecutor {
    static {
        SoLoader.q("v8executor");
    }

    public V8Executor(String str) {
        super(initHybrid(str));
    }

    private static native HybridData initHybrid(String str);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "V8Executor";
    }
}
