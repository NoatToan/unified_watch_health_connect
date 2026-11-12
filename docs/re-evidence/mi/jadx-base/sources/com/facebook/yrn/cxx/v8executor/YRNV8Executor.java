package com.facebook.yrn.cxx.v8executor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.soloader.SoLoader;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class YRNV8Executor extends JavaScriptExecutor {
    static {
        SoLoader.q("yrnv8executor");
    }

    public YRNV8Executor(YRNRuntimeConfig yRNRuntimeConfig) {
        super(initHybrid(yRNRuntimeConfig.getYRNV8Env(), yRNRuntimeConfig.getJsContextNativePointer(), yRNRuntimeConfig.getYRNOptionsConfig()));
    }

    private static native HybridData initHybrid(YRNV8Env yRNV8Env, long j, WritableNativeMap writableNativeMap);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "YRNV8Executor";
    }
}
