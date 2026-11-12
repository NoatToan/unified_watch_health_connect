package com.facebook.yrn.cxx.v8executor;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.yrn.manager.YRNOptionsConfig;
import defpackage.sk1;

/* JADX INFO: loaded from: classes4.dex */
public class YRNRuntimeConfig {
    private final JavaScriptContextHolder javaScriptContextHolder;
    private final YRNOptionsConfig yrnOptions;
    private final YRNV8Env yrnv8Env;

    public YRNRuntimeConfig(YRNV8Env yRNV8Env, JavaScriptContextHolder javaScriptContextHolder, YRNOptionsConfig yRNOptionsConfig) {
        this.javaScriptContextHolder = javaScriptContextHolder;
        this.yrnv8Env = yRNV8Env;
        if (javaScriptContextHolder != null) {
            sk1.b(yRNOptionsConfig != null, "Biz bundle should not had empty yrn Options,or polyfill will not execute!");
        }
        this.yrnOptions = yRNOptionsConfig;
    }

    private WritableNativeMap cloneMap(YRNOptionsConfig yRNOptionsConfig) {
        return Arguments.makeNativeMap(yRNOptionsConfig.toHashMap());
    }

    public long getJsContextNativePointer() {
        JavaScriptContextHolder javaScriptContextHolder = this.javaScriptContextHolder;
        if (javaScriptContextHolder == null) {
            return 0L;
        }
        return javaScriptContextHolder.get();
    }

    public WritableNativeMap getYRNOptionsConfig() {
        YRNOptionsConfig yRNOptionsConfig = this.yrnOptions;
        return yRNOptionsConfig == null ? (WritableNativeMap) Arguments.createMap() : cloneMap(yRNOptionsConfig);
    }

    public YRNV8Env getYRNV8Env() {
        return this.yrnv8Env;
    }
}
