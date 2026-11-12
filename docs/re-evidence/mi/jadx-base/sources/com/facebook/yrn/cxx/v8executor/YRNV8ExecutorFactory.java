package com.facebook.yrn.cxx.v8executor;

import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import defpackage.sk1;

/* JADX INFO: loaded from: classes4.dex */
public class YRNV8ExecutorFactory implements JavaScriptExecutorFactory {
    YRNRuntimeConfig yrnRuntimeConfig;

    private YRNV8ExecutorFactory() {
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() {
        return new YRNV8Executor(this.yrnRuntimeConfig);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        throw new UnsupportedOperationException("Starting sampling profiler not supported on " + toString());
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String str) {
        throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + toString());
    }

    public String toString() {
        return "JSIExecutor+V8Runtime+YRN";
    }

    public YRNV8ExecutorFactory(YRNRuntimeConfig yRNRuntimeConfig) {
        sk1.c(yRNRuntimeConfig);
        this.yrnRuntimeConfig = yRNRuntimeConfig;
    }
}
