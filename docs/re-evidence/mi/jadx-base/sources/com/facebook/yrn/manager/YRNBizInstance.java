package com.facebook.yrn.manager;

import com.facebook.react.a;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.systrace.Systrace;
import com.facebook.yrn.cxx.bridge.YRNCatalystInstanceImpl;
import com.facebook.yrn.cxx.v8executor.YRNRuntimeConfig;
import com.facebook.yrn.cxx.v8executor.YRNV8ExecutorFactory;
import com.facebook.yrn.manager.utils.YRNInstanceIdGenerator;
import com.facebook.yrn.manager.utils.YRNLogUtils;
import defpackage.sk1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public class YRNBizInstance implements Serializable {
    private boolean isReloading;
    CatalystInstance mCatalystInstance;
    private YRNOptionsConfig mConfig;
    private final Collection<OnYRNInstanceListener> mEventListeners = Collections.synchronizedList(new ArrayList());
    YRNFrameworkInstance mFrameworkInstance;
    a mFrameworkReactInstanceManager;
    private boolean mInstanceCreated;
    private JSBundleLoader mJSBundleLoader;
    YRNInstanceManager mYRNInstanceManager;
    private boolean needDestroy;

    public YRNBizInstance(YRNInstanceManager yRNInstanceManager, JSBundleLoader jSBundleLoader, YRNOptionsConfig yRNOptionsConfig) {
        sk1.c(yRNInstanceManager);
        sk1.c(jSBundleLoader);
        sk1.c(yRNOptionsConfig);
        this.mYRNInstanceManager = yRNInstanceManager;
        this.mJSBundleLoader = jSBundleLoader;
        this.mConfig = yRNOptionsConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CatalystInstance createCatalystInstance() {
        YRNLogUtils.d(YRNInstanceManager.TAG, "create Biz CatalystInstance");
        YRNCatalystInstanceImpl yRNCatalystInstanceImplBuild = null;
        if (isNeedDestroy() || this.mFrameworkInstance == null || this.mYRNInstanceManager == null) {
            return null;
        }
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, "Biz Bridge");
        YRNCatalystInstanceImpl yRNCatalystInstanceImpl = this.mFrameworkInstance.getYRNCatalystInstanceImpl();
        ReactQueueConfigurationImpl reactQueueConfiguration = this.mYRNInstanceManager.getReactQueueConfiguration();
        this.mConfig.putString(YRNOptionsConfig.INSTANCE_ID, String.valueOf(YRNInstanceIdGenerator.getNextRootViewTag()));
        JavaScriptExecutor javaScriptExecutorCreate = new YRNV8ExecutorFactory(new YRNRuntimeConfig(this.mYRNInstanceManager.getYRNV8Env(), yRNCatalystInstanceImpl.getJavaScriptContextHolder(), this.mConfig)).create();
        NativeModuleRegistry nativeModuleRegistry = this.mFrameworkInstance.getNativeModuleRegistry();
        YRNCatalystInstanceImpl.Builder nativeModuleCallExceptionHandler = new YRNCatalystInstanceImpl.Builder().setReactQueueConfigurationImpl(reactQueueConfiguration).setJSExecutor(javaScriptExecutorCreate).setRegistry(nativeModuleRegistry).setJSBundleLoader(this.mJSBundleLoader).setCommonYRNCatalystInstanceImpl(yRNCatalystInstanceImpl).setNativeModuleCallExceptionHandler(this.mFrameworkInstance.getNativeModuleCallExceptionHandler());
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        Systrace.c(0L, "createBizCatalystInstance");
        try {
            try {
                yRNCatalystInstanceImplBuild = nativeModuleCallExceptionHandler.build();
            } catch (Exception e) {
                e.printStackTrace();
            }
            Systrace.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            if (yRNCatalystInstanceImplBuild != null) {
                ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
                Systrace.c(0L, "runJSBundle");
                yRNCatalystInstanceImplBuild.runJSBundle();
                Systrace.g(0L);
            }
            this.mInstanceCreated = true;
            this.isReloading = false;
            notifyListeners();
            return yRNCatalystInstanceImplBuild;
        } catch (Throwable th) {
            Systrace.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createInstanceAfterFrameworkRunJSBundle() {
        a aVar;
        YRNLogUtils.d(YRNInstanceManager.TAG, "createInstanceAfterFrameworkRunJSBundle");
        if (isNeedDestroy() || (aVar = this.mFrameworkReactInstanceManager) == null || aVar.C() == null || this.mFrameworkReactInstanceManager.C().getCatalystInstance() == null) {
            return;
        }
        if (this.mFrameworkReactInstanceManager.C().getCatalystInstance().hasRunJSBundle()) {
            createInstanceOnJSThread();
        } else {
            this.isReloading = false;
        }
    }

    private void createInstanceOnJSThread() {
        YRNLogUtils.d(YRNInstanceManager.TAG, "createInstanceOnJSThread");
        if (isNeedDestroy()) {
            return;
        }
        YRNInstanceManager yRNInstanceManager = this.mYRNInstanceManager;
        if (yRNInstanceManager == null || yRNInstanceManager.getReactQueueConfiguration() == null || this.mYRNInstanceManager.getReactQueueConfiguration().getJSQueueThread() == null) {
            this.isReloading = false;
        } else {
            this.mYRNInstanceManager.getReactQueueConfiguration().getJSQueueThread().runOnQueue(new Runnable() { // from class: com.facebook.yrn.manager.YRNBizInstance.2
                @Override // java.lang.Runnable
                public void run() {
                    YRNBizInstance yRNBizInstance = YRNBizInstance.this;
                    yRNBizInstance.mCatalystInstance = yRNBizInstance.createCatalystInstance();
                }
            });
        }
    }

    private boolean isNeedDestroy() {
        if (this.needDestroy) {
            YRNLogUtils.d(YRNInstanceManager.TAG, "isNeedDestroy");
        }
        return this.needDestroy;
    }

    private void notifyListeners() {
        YRNLogUtils.d(YRNInstanceManager.TAG, "notifyListeners");
        final OnYRNInstanceListener[] onYRNInstanceListenerArr = (OnYRNInstanceListener[]) this.mEventListeners.toArray(new OnYRNInstanceListener[this.mEventListeners.size()]);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.yrn.manager.YRNBizInstance.3
            @Override // java.lang.Runnable
            public void run() {
                for (OnYRNInstanceListener onYRNInstanceListener : onYRNInstanceListenerArr) {
                    onYRNInstanceListener.onInstanceInitialized();
                }
            }
        });
    }

    public void addYRNBizInstanceListener(OnYRNInstanceListener onYRNInstanceListener) {
        this.mEventListeners.add(onYRNInstanceListener);
    }

    public void createInstanceAfterFrameworkReactContextCreate() {
        YRNLogUtils.d(YRNInstanceManager.TAG, "createInstanceAfterFrameworkReactContextCreate");
        if (isNeedDestroy()) {
            return;
        }
        UiThreadUtil.assertOnUiThread();
        this.mFrameworkInstance = this.mYRNInstanceManager.getFrameworkInstance();
        this.mFrameworkReactInstanceManager = this.mYRNInstanceManager.getFrameworkReactInstanceManager();
        sk1.c(this.mFrameworkInstance);
        sk1.c(this.mFrameworkReactInstanceManager);
        a aVar = this.mFrameworkReactInstanceManager;
        if (aVar != null) {
            if (aVar.C() == null) {
                this.mFrameworkReactInstanceManager.q(new a.l() { // from class: com.facebook.yrn.manager.YRNBizInstance.1
                    @Override // com.facebook.react.a.l
                    public void onReactContextInitialized(ReactContext reactContext) {
                        YRNLogUtils.d(YRNInstanceManager.TAG, "onReactContextInitialized");
                        YRNBizInstance.this.createInstanceAfterFrameworkRunJSBundle();
                        YRNBizInstance.this.mFrameworkReactInstanceManager.e0(this);
                    }
                });
            } else {
                YRNLogUtils.d(YRNInstanceManager.TAG, "getCurrentReactContext is not null");
                createInstanceAfterFrameworkRunJSBundle();
            }
        }
    }

    public void destroy(boolean z) {
        Collection<OnYRNInstanceListener> collection;
        YRNLogUtils.d(YRNInstanceManager.TAG, "destroy biz instance ,and cleanListener is " + z);
        boolean z2 = true;
        this.needDestroy = true;
        if (this.mInstanceCreated) {
            if (z && (collection = this.mEventListeners) != null) {
                collection.clear();
            }
            this.mInstanceCreated = false;
            this.isReloading = false;
            if (this.mCatalystInstance instanceof YRNCatalystInstanceImpl) {
                a aVar = this.mFrameworkReactInstanceManager;
                if (aVar != null && aVar.C() != null && this.mFrameworkReactInstanceManager.C().getCatalystInstance() != null) {
                    z2 = false;
                }
                ((YRNCatalystInstanceImpl) this.mCatalystInstance).destroyWithoutShutDownQueueThread(z2);
            }
        }
    }

    public void enqueueJSCall(String str, String str2, NativeArray nativeArray) {
        CatalystInstance catalystInstance;
        if (isNeedDestroy() || (catalystInstance = this.mCatalystInstance) == null) {
            return;
        }
        catalystInstance.callFunction(str, str2, nativeArray);
    }

    public boolean hasInstanceCreated() {
        return this.mInstanceCreated;
    }

    public void reload() {
        if (this.isReloading) {
            YRNLogUtils.d(YRNInstanceManager.TAG, "reload is in process");
            return;
        }
        this.isReloading = true;
        UiThreadUtil.assertOnUiThread();
        destroy(false);
        this.needDestroy = false;
        createInstanceAfterFrameworkReactContextCreate();
    }

    public void removeYRNInstanceEventListener(OnYRNInstanceListener onYRNInstanceListener) {
        this.mEventListeners.remove(onYRNInstanceListener);
    }
}
