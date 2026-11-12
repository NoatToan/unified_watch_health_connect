package com.facebook.yrn.manager;

import com.facebook.react.a;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.systrace.Systrace;
import com.facebook.yrn.cxx.bridge.YRNCatalystInstanceImpl;
import com.facebook.yrn.cxx.v8executor.YRNRuntimeConfig;
import com.facebook.yrn.cxx.v8executor.YRNV8ExecutorFactory;
import com.facebook.yrn.manager.uimodule.YRNNativeModuleRegistryBuilder;
import defpackage.sk1;
import defpackage.xhg;

/* JADX INFO: loaded from: classes4.dex */
public class YRNFrameworkInstance implements a.j {
    YRNInstanceManager mManager;
    private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    private NativeModuleRegistry mNativeModuleRegistry;
    private YRNCatalystInstanceImpl mYRNCatalystInstanceImpl;

    public YRNFrameworkInstance(YRNInstanceManager yRNInstanceManager) {
        sk1.c(yRNInstanceManager);
        this.mManager = yRNInstanceManager;
    }

    @Override // com.facebook.react.a.j
    public CatalystInstance createCatalystInstance(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, JSBundleLoader jSBundleLoader, NativeModuleRegistry nativeModuleRegistry) {
        ReactQueueConfigurationImpl reactQueueConfiguration = this.mManager.getReactQueueConfiguration();
        JavaScriptExecutor javaScriptExecutorCreate = new YRNV8ExecutorFactory(new YRNRuntimeConfig(this.mManager.getYRNV8Env(), null, null)).create();
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutorCreate.getName());
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        this.mNativeModuleRegistry = nativeModuleRegistry;
        YRNCatalystInstanceImpl.Builder nativeModuleCallExceptionHandler2 = new YRNCatalystInstanceImpl.Builder().setReactQueueConfigurationImpl(reactQueueConfiguration).setJSExecutor(javaScriptExecutorCreate).setRegistry(nativeModuleRegistry).setJSBundleLoader(jSBundleLoader).setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        Systrace.c(0L, "createYRNCommonCatalystInstance");
        try {
            YRNCatalystInstanceImpl yRNCatalystInstanceImplBuild = nativeModuleCallExceptionHandler2.build();
            Systrace.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            this.mYRNCatalystInstanceImpl = yRNCatalystInstanceImplBuild;
            return yRNCatalystInstanceImplBuild;
        } catch (Throwable th) {
            Systrace.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th;
        }
    }

    @Override // com.facebook.react.a.j
    public xhg createNativeModuleRegistryBuilder(ReactApplicationContext reactApplicationContext, a aVar) {
        return new YRNNativeModuleRegistryBuilder(reactApplicationContext, aVar);
    }

    public NativeModuleCallExceptionHandler getNativeModuleCallExceptionHandler() {
        return this.mNativeModuleCallExceptionHandler;
    }

    public NativeModuleRegistry getNativeModuleRegistry() {
        return this.mNativeModuleRegistry;
    }

    public YRNCatalystInstanceImpl getYRNCatalystInstanceImpl() {
        return this.mYRNCatalystInstanceImpl;
    }
}
