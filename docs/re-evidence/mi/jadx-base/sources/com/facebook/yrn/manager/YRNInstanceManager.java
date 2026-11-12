package com.facebook.yrn.manager;

import com.facebook.react.a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.yrn.cxx.v8executor.YRNV8Env;
import com.facebook.yrn.manager.utils.YRNLogUtils;
import defpackage.sk1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class YRNInstanceManager {
    public static final String TAG = "YRNInstanceManager";
    private YRNFrameworkInstance mFrameworkInstance;
    private a mFrameworkReactInstanceManager;
    private ReactQueueConfigurationImpl mQueueConfig;
    YRNV8Env mYRNV8Env;
    private final List<YRNBizInstance> mBizInstanceList = new ArrayList();
    private final ArrayList<YRNBizInstance> mPendingBizInitList = new ArrayList<>();
    private final Object mPendingInitLock = new Object();
    private volatile boolean mDestroyed = false;
    private volatile boolean mDestroyedInstance = false;

    public class YRNNativeExceptionHandler implements QueueThreadExceptionHandler {
        private YRNNativeExceptionHandler() {
        }

        @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
        public void handleException(Exception exc) {
            YRNInstanceManager.this.onNativeException(exc);
        }
    }

    public YRNInstanceManager(final a aVar, final boolean z) {
        sk1.b(aVar != null, "Framework manager should not be null!");
        YRNLogUtils.d(TAG, "begin init");
        ReactQueueConfigurationImpl reactQueueConfigurationImplCreate = ReactQueueConfigurationImpl.create(ReactQueueConfigurationSpec.createDefault(), new YRNNativeExceptionHandler());
        this.mQueueConfig = reactQueueConfigurationImplCreate;
        if (reactQueueConfigurationImplCreate == null || reactQueueConfigurationImplCreate.getJSQueueThread() == null || this.mQueueConfig.getUIQueueThread() == null) {
            YRNLogUtils.e(TAG, "queueConfig is null,pls check!");
        } else {
            this.mQueueConfig.getJSQueueThread().runOnQueue(new Runnable() { // from class: com.facebook.yrn.manager.YRNInstanceManager.1
                @Override // java.lang.Runnable
                public void run() {
                    YRNLogUtils.d(YRNInstanceManager.TAG, "create YRNV8Env");
                    YRNInstanceManager.this.mYRNV8Env = new YRNV8Env();
                    YRNInstanceManager.this.mQueueConfig.getUIQueueThread().runOnQueue(new Runnable() { // from class: com.facebook.yrn.manager.YRNInstanceManager.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            YRNInstanceManager.this.initFrameworkInstance(aVar, z);
                            YRNInstanceManager.this.initPendingBizList();
                        }
                    });
                }
            });
        }
    }

    private void addPendingBizInit(YRNBizInstance yRNBizInstance) {
        synchronized (this.mPendingInitLock) {
            this.mPendingBizInitList.add(yRNBizInstance);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initFrameworkInstance(a aVar, boolean z) {
        UiThreadUtil.assertOnUiThread();
        sk1.c(aVar);
        this.mFrameworkReactInstanceManager = aVar;
        YRNFrameworkInstance yRNFrameworkInstance = new YRNFrameworkInstance(this);
        this.mFrameworkInstance = yRNFrameworkInstance;
        aVar.g0(yRNFrameworkInstance);
        if (z) {
            aVar.x();
        }
        YRNLogUtils.d(TAG, "initFrameworkInstance");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initPendingBizList() {
        synchronized (this.mPendingInitLock) {
            try {
                Iterator<YRNBizInstance> it = this.mPendingBizInitList.iterator();
                while (it.hasNext()) {
                    it.next().createInstanceAfterFrameworkReactContextCreate();
                }
                this.mPendingBizInitList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNativeException(Exception exc) {
        YRNFrameworkInstance yRNFrameworkInstance = this.mFrameworkInstance;
        if (yRNFrameworkInstance == null || yRNFrameworkInstance.getNativeModuleCallExceptionHandler() == null) {
            return;
        }
        this.mFrameworkInstance.getNativeModuleCallExceptionHandler().handleException(exc);
    }

    public void destroy() {
        YRNLogUtils.d(TAG, "YRNInstanceManager.destroy() start");
        UiThreadUtil.assertOnUiThread();
        if (this.mDestroyed) {
            return;
        }
        this.mDestroyed = true;
        ArrayList<YRNBizInstance> arrayList = this.mPendingBizInitList;
        if (arrayList != null) {
            arrayList.clear();
        }
        List<YRNBizInstance> list = this.mBizInstanceList;
        if (list != null) {
            Iterator<YRNBizInstance> it = list.iterator();
            while (it.hasNext()) {
                it.next().destroy(true);
            }
            this.mBizInstanceList.clear();
        }
        ReactQueueConfigurationImpl reactQueueConfigurationImpl = this.mQueueConfig;
        if (reactQueueConfigurationImpl != null) {
            reactQueueConfigurationImpl.getUIQueueThread().runOnQueue(new Runnable() { // from class: com.facebook.yrn.manager.YRNInstanceManager.3
                @Override // java.lang.Runnable
                public void run() {
                    if (YRNInstanceManager.this.mFrameworkInstance != null && YRNInstanceManager.this.mFrameworkInstance.getYRNCatalystInstanceImpl() != null) {
                        YRNInstanceManager.this.mFrameworkInstance.getYRNCatalystInstanceImpl().destroyInstance(new Callback() { // from class: com.facebook.yrn.manager.YRNInstanceManager.3.1
                            @Override // com.facebook.react.bridge.Callback
                            public void invoke(Object... objArr) {
                                YRNV8Env yRNV8Env = YRNInstanceManager.this.mYRNV8Env;
                                if (yRNV8Env != null) {
                                    yRNV8Env.destroy();
                                }
                                if (YRNInstanceManager.this.mQueueConfig != null) {
                                    YRNInstanceManager.this.mQueueConfig.destroy();
                                }
                                YRNInstanceManager yRNInstanceManager = YRNInstanceManager.this;
                                yRNInstanceManager.mYRNV8Env = null;
                                yRNInstanceManager.mQueueConfig = null;
                            }
                        });
                    }
                    YRNLogUtils.d(YRNInstanceManager.TAG, "YRNInstanceManager.destroy() end");
                }
            });
        }
    }

    public void destroyInstance() {
        YRNLogUtils.d(TAG, "YRNInstanceManager.destroyInstance() start");
        UiThreadUtil.assertOnUiThread();
        if (this.mDestroyedInstance) {
            return;
        }
        this.mDestroyedInstance = true;
        ArrayList<YRNBizInstance> arrayList = this.mPendingBizInitList;
        if (arrayList != null) {
            arrayList.clear();
        }
        List<YRNBizInstance> list = this.mBizInstanceList;
        if (list != null) {
            Iterator<YRNBizInstance> it = list.iterator();
            while (it.hasNext()) {
                it.next().destroy(true);
            }
            this.mBizInstanceList.clear();
        }
        ReactQueueConfigurationImpl reactQueueConfigurationImpl = this.mQueueConfig;
        if (reactQueueConfigurationImpl != null) {
            reactQueueConfigurationImpl.getUIQueueThread().runOnQueue(new Runnable() { // from class: com.facebook.yrn.manager.YRNInstanceManager.2
                @Override // java.lang.Runnable
                public void run() {
                    if (YRNInstanceManager.this.mFrameworkInstance != null && YRNInstanceManager.this.mFrameworkInstance.getYRNCatalystInstanceImpl() != null) {
                        YRNInstanceManager.this.mFrameworkInstance.getYRNCatalystInstanceImpl().destroyInstance(null);
                    }
                    YRNLogUtils.d(YRNInstanceManager.TAG, "YRNInstanceManager.destroyInstance() end");
                }
            });
        }
    }

    public YRNFrameworkInstance getFrameworkInstance() {
        return this.mFrameworkInstance;
    }

    public a getFrameworkReactInstanceManager() {
        return this.mFrameworkReactInstanceManager;
    }

    public ReactQueueConfigurationImpl getReactQueueConfiguration() {
        return this.mQueueConfig;
    }

    public YRNV8Env getYRNV8Env() {
        return this.mYRNV8Env;
    }

    public YRNBizInstance initBizInstance(JSBundleLoader jSBundleLoader, YRNOptionsConfig yRNOptionsConfig) {
        YRNLogUtils.d(TAG, "initBizInstance");
        UiThreadUtil.assertOnUiThread();
        sk1.b(jSBundleLoader != null, "Biz JSBundleLoader should not be null!");
        sk1.b(yRNOptionsConfig != null, "Biz Bundle Config should not be null!");
        YRNBizInstance yRNBizInstance = new YRNBizInstance(this, jSBundleLoader, yRNOptionsConfig);
        if (this.mFrameworkInstance != null) {
            yRNBizInstance.createInstanceAfterFrameworkReactContextCreate();
            YRNLogUtils.d(TAG, "create biz instance now");
        } else {
            addPendingBizInit(yRNBizInstance);
            YRNLogUtils.d(TAG, "add biz instance create call to pendingList");
        }
        this.mBizInstanceList.add(yRNBizInstance);
        return yRNBizInstance;
    }
}
