package com.facebook.yrn.cxx.bridge;

import android.content.res.AssetManager;
import android.os.AsyncTask;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.JSIModuleRegistry;
import com.facebook.react.bridge.JSIModuleSpec;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.JavaModuleWrapper;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.JavaScriptModuleRegistry;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeArrayInterface;
import com.facebook.react.bridge.NativeDeltaClient;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.Systrace;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.YRNModuleRegistryDelegate;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.modules.core.Timing;
import com.facebook.react.turbomodule.core.JSCallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.TraceListener;
import com.facebook.yrn.manager.utils.YRNConvertUtils;
import defpackage.cm8;
import defpackage.e4q;
import defpackage.edj;
import defpackage.ndj;
import defpackage.sk1;
import defpackage.v07;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class YRNCatalystInstanceImpl implements CatalystInstance {
    private static final AtomicInteger sNextInstanceIdForTrace;
    private volatile boolean mAcceptCalls;
    private final CopyOnWriteArrayList<NotThreadSafeBridgeIdleDebugListener> mBridgeIdleListeners;
    private volatile boolean mDestroyed;
    private final HybridData mHybridData;
    private boolean mInitialized;
    private boolean mJSBundleHasLoaded;
    private final JSBundleLoader mJSBundleLoader;
    private final ArrayList<PendingJSCall> mJSCallsPendingInit;
    private final Object mJSCallsPendingInitLock;
    private final JSIModuleRegistry mJSIModuleRegistry;
    private final JavaScriptModuleRegistry mJSModuleRegistry;
    private JavaScriptContextHolder mJavaScriptContextHolder;
    private final String mJsPendingCallsTitleForTrace;
    private final NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    private final NativeModuleRegistry mNativeModuleRegistry;
    private final MessageQueueThread mNativeModulesQueueThread;
    private final AtomicInteger mPendingJSCalls;
    private final ReactQueueConfigurationImpl mReactQueueConfiguration;
    private String mSourceURL;
    private final TraceListener mTraceListener;
    private TurboModuleRegistry mTurboModuleRegistry;

    /* JADX INFO: renamed from: com.facebook.yrn.cxx.bridge.YRNCatalystInstanceImpl$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ Callback val$callback;

        /* JADX INFO: renamed from: com.facebook.yrn.cxx.bridge.YRNCatalystInstanceImpl$1$1, reason: invalid class name and collision with other inner class name */
        public class RunnableC01731 implements Runnable {
            final /* synthetic */ JSIModule val$turboModuleManager;

            public RunnableC01731(JSIModule jSIModule) {
                this.val$turboModuleManager = jSIModule;
            }

            @Override // java.lang.Runnable
            public void run() {
                JSIModule jSIModule = this.val$turboModuleManager;
                if (jSIModule != null) {
                    jSIModule.onCatalystInstanceDestroy();
                }
                YRNCatalystInstanceImpl.this.getReactQueueConfiguration().getUIQueueThread().runOnQueue(new Runnable() { // from class: com.facebook.yrn.cxx.bridge.YRNCatalystInstanceImpl.1.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AsyncTask.execute(new Runnable() { // from class: com.facebook.yrn.cxx.bridge.YRNCatalystInstanceImpl.1.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                YRNCatalystInstanceImpl.this.mJavaScriptContextHolder.clear();
                                YRNCatalystInstanceImpl.this.mHybridData.a();
                                Callback callback = AnonymousClass1.this.val$callback;
                                if (callback != null) {
                                    callback.invoke(new Object[0]);
                                }
                                ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END);
                            }
                        });
                    }
                });
            }
        }

        public AnonymousClass1(Callback callback) {
            this.val$callback = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            YRNModuleRegistryDelegate.notifyJSInstanceDestroy(YRNCatalystInstanceImpl.this.mNativeModuleRegistry);
            YRNCatalystInstanceImpl.this.mJSIModuleRegistry.notifyJSInstanceDestroy();
            boolean z = YRNCatalystInstanceImpl.this.mPendingJSCalls.getAndSet(0) == 0;
            if (!YRNCatalystInstanceImpl.this.mBridgeIdleListeners.isEmpty()) {
                for (NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener : YRNCatalystInstanceImpl.this.mBridgeIdleListeners) {
                    if (!z) {
                        notThreadSafeBridgeIdleDebugListener.onTransitionToBridgeIdle();
                    }
                    notThreadSafeBridgeIdleDebugListener.onBridgeDestroyed();
                }
            }
            YRNCatalystInstanceImpl.this.getReactQueueConfiguration().getJSQueueThread().runOnQueue(new RunnableC01731(edj.f16533b ? YRNCatalystInstanceImpl.this.mJSIModuleRegistry.getModule(JSIModuleType.TurboModuleManager) : null));
        }
    }

    public static class Builder {
        private YRNCatalystInstanceImpl mCommonYRNCatalystInstanceImpl;
        private JSBundleLoader mJSBundleLoader;
        private JavaScriptExecutor mJSExecutor;
        private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
        private ReactQueueConfigurationImpl mReactQueueConfigurationImpl;
        private NativeModuleRegistry mRegistry;

        public YRNCatalystInstanceImpl build() {
            return new YRNCatalystInstanceImpl((ReactQueueConfigurationImpl) sk1.c(this.mReactQueueConfigurationImpl), (JavaScriptExecutor) sk1.c(this.mJSExecutor), (NativeModuleRegistry) sk1.c(this.mRegistry), (JSBundleLoader) sk1.c(this.mJSBundleLoader), (NativeModuleCallExceptionHandler) sk1.c(this.mNativeModuleCallExceptionHandler), this.mCommonYRNCatalystInstanceImpl, null);
        }

        public Builder setCommonYRNCatalystInstanceImpl(YRNCatalystInstanceImpl yRNCatalystInstanceImpl) {
            this.mCommonYRNCatalystInstanceImpl = yRNCatalystInstanceImpl;
            return this;
        }

        public Builder setJSBundleLoader(JSBundleLoader jSBundleLoader) {
            this.mJSBundleLoader = jSBundleLoader;
            return this;
        }

        public Builder setJSExecutor(JavaScriptExecutor javaScriptExecutor) {
            this.mJSExecutor = javaScriptExecutor;
            return this;
        }

        public Builder setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
            this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
            return this;
        }

        public Builder setReactQueueConfigurationImpl(ReactQueueConfigurationImpl reactQueueConfigurationImpl) {
            this.mReactQueueConfigurationImpl = reactQueueConfigurationImpl;
            return this;
        }

        public Builder setRegistry(NativeModuleRegistry nativeModuleRegistry) {
            this.mRegistry = nativeModuleRegistry;
            return this;
        }
    }

    public static class JSProfilerTraceListener implements TraceListener {
        private final WeakReference<YRNCatalystInstanceImpl> mOuter;

        public JSProfilerTraceListener(YRNCatalystInstanceImpl yRNCatalystInstanceImpl) {
            this.mOuter = new WeakReference<>(yRNCatalystInstanceImpl);
        }

        public void onTraceStarted() {
            YRNCatalystInstanceImpl yRNCatalystInstanceImpl = this.mOuter.get();
            if (yRNCatalystInstanceImpl != null) {
                ((Systrace) yRNCatalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(true);
            }
        }

        public void onTraceStopped() {
            YRNCatalystInstanceImpl yRNCatalystInstanceImpl = this.mOuter.get();
            if (yRNCatalystInstanceImpl != null) {
                ((Systrace) yRNCatalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(false);
            }
        }
    }

    public class NativeExceptionHandler implements QueueThreadExceptionHandler {
        public NativeExceptionHandler() {
        }

        @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
        public void handleException(Exception exc) {
            YRNCatalystInstanceImpl.this.onNativeException(exc);
        }
    }

    public static class PendingJSCall {
        public NativeArray mArguments;
        public String mMethod;
        public String mModule;

        public PendingJSCall(String str, String str2, NativeArray nativeArray) {
            this.mModule = str;
            this.mMethod = str2;
            this.mArguments = nativeArray;
        }

        public void call(YRNCatalystInstanceImpl yRNCatalystInstanceImpl) {
            NativeArray writableNativeArray = this.mArguments;
            if (writableNativeArray == null) {
                writableNativeArray = new WritableNativeArray();
            }
            synchronized (PendingJSCall.class) {
                if (yRNCatalystInstanceImpl != null) {
                    try {
                        yRNCatalystInstanceImpl.jniCallJSFunction(this.mModule, this.mMethod, writableNativeArray);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.mModule);
            sb.append(".");
            sb.append(this.mMethod);
            sb.append("(");
            NativeArray nativeArray = this.mArguments;
            sb.append(nativeArray == null ? "" : nativeArray.toString());
            sb.append(")");
            return sb.toString();
        }
    }

    public static class YRNBridgeCallback implements YRNReactCallback {
        private final WeakReference<YRNCatalystInstanceImpl> mOuter;

        public YRNBridgeCallback(YRNCatalystInstanceImpl yRNCatalystInstanceImpl) {
            this.mOuter = new WeakReference<>(yRNCatalystInstanceImpl);
        }

        @Override // com.facebook.yrn.cxx.bridge.YRNReactCallback
        public void decrementPendingJSCalls() {
            YRNCatalystInstanceImpl yRNCatalystInstanceImpl = this.mOuter.get();
            if (yRNCatalystInstanceImpl != null) {
                yRNCatalystInstanceImpl.decrementPendingJSCalls();
            }
        }

        @Override // com.facebook.yrn.cxx.bridge.YRNReactCallback
        public void incrementPendingJSCalls() {
            YRNCatalystInstanceImpl yRNCatalystInstanceImpl = this.mOuter.get();
            if (yRNCatalystInstanceImpl != null) {
                yRNCatalystInstanceImpl.incrementPendingJSCalls();
            }
        }

        @Override // com.facebook.yrn.cxx.bridge.YRNReactCallback
        public void onBatchComplete() {
            YRNCatalystInstanceImpl yRNCatalystInstanceImpl = this.mOuter.get();
            if (yRNCatalystInstanceImpl != null) {
                yRNCatalystInstanceImpl.mNativeModuleRegistry.onBatchComplete();
            }
        }
    }

    static {
        ReactBridge.staticInit();
        SoLoader.q("yrnbridge");
        sNextInstanceIdForTrace = new AtomicInteger(1);
    }

    public /* synthetic */ YRNCatalystInstanceImpl(ReactQueueConfigurationImpl reactQueueConfigurationImpl, JavaScriptExecutor javaScriptExecutor, NativeModuleRegistry nativeModuleRegistry, JSBundleLoader jSBundleLoader, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, YRNCatalystInstanceImpl yRNCatalystInstanceImpl, AnonymousClass1 anonymousClass1) {
        this(reactQueueConfigurationImpl, javaScriptExecutor, nativeModuleRegistry, jSBundleLoader, nativeModuleCallExceptionHandler, yRNCatalystInstanceImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementPendingJSCalls() {
        int iDecrementAndGet = this.mPendingJSCalls.decrementAndGet();
        boolean z = iDecrementAndGet == 0;
        com.facebook.systrace.Systrace.k(0L, this.mJsPendingCallsTitleForTrace, iDecrementAndGet);
        if (!z || this.mBridgeIdleListeners.isEmpty()) {
            return;
        }
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.yrn.cxx.bridge.YRNCatalystInstanceImpl.5
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = YRNCatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                while (it.hasNext()) {
                    ((NotThreadSafeBridgeIdleDebugListener) it.next()).onTransitionToBridgeIdle();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void destroyWithoutShutDownThread(boolean z);

    private native Object[] getGlobalArrayValue(String str);

    private native long getJavaScriptContext();

    private <T extends NativeModule> String getNameFromAnnotation(Class<T> cls) {
        ndj ndjVar = (ndj) cls.getAnnotation(ndj.class);
        if (ndjVar != null) {
            return ndjVar.name();
        }
        throw new IllegalArgumentException("Could not find @ReactModule annotation in " + cls.getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void incrementPendingJSCalls() {
        int andIncrement = this.mPendingJSCalls.getAndIncrement();
        boolean z = andIncrement == 0;
        com.facebook.systrace.Systrace.k(0L, this.mJsPendingCallsTitleForTrace, andIncrement + 1);
        if (!z || this.mBridgeIdleListeners.isEmpty()) {
            return;
        }
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.yrn.cxx.bridge.YRNCatalystInstanceImpl.4
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = YRNCatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                while (it.hasNext()) {
                    ((NotThreadSafeBridgeIdleDebugListener) it.next()).onTransitionToBridgeBusy();
                }
            }
        });
    }

    private static native HybridData initHybrid();

    private native void initializeBridge(YRNReactCallback yRNReactCallback, JavaScriptExecutor javaScriptExecutor, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2, YRNModuleRegistryHolder yRNModuleRegistryHolder);

    private native void jniCallJSCallback(int i, NativeArray nativeArray);

    /* JADX INFO: Access modifiers changed from: private */
    public native void jniCallJSFunction(String str, String str2, NativeArray nativeArray);

    private native void jniExtendNativeModules(Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

    private native void jniHandleMemoryPressure(int i);

    private native void jniLoadScriptFromAssets(AssetManager assetManager, String str, boolean z);

    private native void jniLoadScriptFromDeltaBundle(String str, NativeDeltaClient nativeDeltaClient, boolean z);

    private native void jniLoadScriptFromFile(String str, String str2, boolean z);

    private native void jniRegisterSegment(int i, String str);

    private native void jniSetSourceURL(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public void onNativeException(Exception exc) {
        this.mNativeModuleCallExceptionHandler.handleException(exc);
        this.mReactQueueConfiguration.getUIQueueThread().runOnQueue(new Runnable() { // from class: com.facebook.yrn.cxx.bridge.YRNCatalystInstanceImpl.6
            @Override // java.lang.Runnable
            public void run() {
                YRNCatalystInstanceImpl.this.destroy();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCurrentTimers() {
        Object[] globalArrayValue = getGlobalArrayValue("__yrn_timers__");
        if (globalArrayValue == null || globalArrayValue.length <= 0) {
            return;
        }
        for (Object obj : globalArrayValue) {
            int floorIntByObject = YRNConvertUtils.getFloorIntByObject(obj);
            if (floorIntByObject != -1) {
                ((Timing) getNativeModule(Timing.class)).deleteTimer(floorIntByObject);
            }
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.add(notThreadSafeBridgeIdleDebugListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addJSIModules(List<JSIModuleSpec> list) {
        this.mJSIModuleRegistry.registerModules(list);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void callFunction(String str, String str2, NativeArray nativeArray) {
        callFunction(new PendingJSCall(str, str2, nativeArray));
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void destroy() {
    }

    public void destroyInstance(Callback callback) {
        UiThreadUtil.assertOnUiThread();
        if (this.mDestroyed) {
            return;
        }
        ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START);
        this.mDestroyed = true;
        this.mNativeModulesQueueThread.runOnQueue(new AnonymousClass1(callback));
        com.facebook.systrace.Systrace.m(this.mTraceListener);
    }

    public void destroyWithoutShutDownQueueThread(final boolean z) {
        ArrayList<PendingJSCall> arrayList = this.mJSCallsPendingInit;
        if (arrayList != null) {
            arrayList.clear();
        }
        getReactQueueConfiguration().getJSQueueThread().runOnQueue(new Runnable() { // from class: com.facebook.yrn.cxx.bridge.YRNCatalystInstanceImpl.2
            @Override // java.lang.Runnable
            public void run() {
                YRNCatalystInstanceImpl.this.removeCurrentTimers();
                YRNCatalystInstanceImpl.this.destroyWithoutShutDownThread(z);
                YRNCatalystInstanceImpl.this.mJavaScriptContextHolder.clear();
                YRNCatalystInstanceImpl.this.mHybridData.a();
                ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END);
            }
        });
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void extendNativeModules(NativeModuleRegistry nativeModuleRegistry) {
        YRNModuleRegistryDelegate.registerModules(this.mNativeModuleRegistry, nativeModuleRegistry);
        jniExtendNativeModules(YRNModuleRegistryDelegate.getJavaModules(this.mNativeModuleRegistry, this), YRNModuleRegistryDelegate.getCxxModules(this.mNativeModuleRegistry));
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public native JSCallInvokerHolderImpl getJSCallInvokerHolder();

    @Override // com.facebook.react.bridge.CatalystInstance
    public JSIModule getJSIModule(JSIModuleType jSIModuleType) {
        return this.mJSIModuleRegistry.getModule(jSIModuleType);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        return (T) this.mJSModuleRegistry.getJavaScriptModule(this, cls);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mJavaScriptContextHolder;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        return (T) getNativeModule(getNameFromAnnotation(cls));
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public Collection<NativeModule> getNativeModules() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mNativeModuleRegistry.getAllModules());
        TurboModuleRegistry turboModuleRegistry = this.mTurboModuleRegistry;
        if (turboModuleRegistry != null) {
            Iterator<e4q> it = turboModuleRegistry.c().iterator();
            while (it.hasNext()) {
                arrayList.add((NativeModule) it.next());
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public ReactQueueConfiguration getReactQueueConfiguration() {
        return this.mReactQueueConfiguration;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public String getSourceURL() {
        return this.mSourceURL;
    }

    public native YRNModuleRegistryHolder getYRNModuleRegistryHolder();

    @Override // com.facebook.react.bridge.MemoryPressureListener
    public void handleMemoryPressure(int i) {
        if (this.mDestroyed) {
            return;
        }
        jniHandleMemoryPressure(i);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        String nameFromAnnotation = getNameFromAnnotation(cls);
        TurboModuleRegistry turboModuleRegistry = this.mTurboModuleRegistry;
        if (turboModuleRegistry == null || !turboModuleRegistry.a(nameFromAnnotation)) {
            return this.mNativeModuleRegistry.hasModule(nameFromAnnotation);
        }
        return true;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean hasRunJSBundle() {
        boolean z;
        synchronized (this.mJSCallsPendingInitLock) {
            try {
                z = this.mJSBundleHasLoaded && this.mAcceptCalls;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void initialize() {
        sk1.b(!this.mInitialized, "This catalyst instance has already been initialized");
        sk1.b(this.mAcceptCalls, "RunJSBundle hasn't completed.");
        this.mInitialized = true;
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.yrn.cxx.bridge.YRNCatalystInstanceImpl.3
            @Override // java.lang.Runnable
            public void run() {
                YRNModuleRegistryDelegate.notifyJSInstanceInitialized(YRNCatalystInstanceImpl.this.mNativeModuleRegistry);
            }
        });
    }

    @Override // com.facebook.react.bridge.CatalystInstance, com.facebook.react.bridge.JSInstance
    public void invokeCallback(int i, NativeArrayInterface nativeArrayInterface) {
        if (this.mDestroyed) {
            cm8.C("ReactNative", "Invoking JS callback after bridge has been destroyed.");
        } else {
            jniCallJSCallback(i, (NativeArray) nativeArrayInterface);
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromAssets(assetManager, str, z);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromDeltaBundle(String str, NativeDeltaClient nativeDeltaClient, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromDeltaBundle(str, nativeDeltaClient, z);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromFile(String str, String str2, boolean z) {
        this.mSourceURL = str2;
        jniLoadScriptFromFile(str, str2, z);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void registerSegment(int i, String str) {
        jniRegisterSegment(i, str);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.remove(notThreadSafeBridgeIdleDebugListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void runJSBundle() {
        sk1.b(!this.mJSBundleHasLoaded, "JS bundle was already loaded!");
        this.mJSBundleLoader.loadScript(this);
        synchronized (this.mJSCallsPendingInitLock) {
            try {
                this.mAcceptCalls = true;
                Iterator<PendingJSCall> it = this.mJSCallsPendingInit.iterator();
                while (it.hasNext()) {
                    it.next().call(this);
                }
                this.mJSCallsPendingInit.clear();
                this.mJSBundleHasLoaded = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.facebook.systrace.Systrace.i(this.mTraceListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public native void setGlobalVariable(String str, String str2);

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void setSourceURLs(String str, String str2) {
        this.mSourceURL = str;
        jniSetSourceURL(str2);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setTurboModuleManager(JSIModule jSIModule) {
        this.mTurboModuleRegistry = (TurboModuleRegistry) jSIModule;
    }

    private YRNCatalystInstanceImpl(ReactQueueConfigurationImpl reactQueueConfigurationImpl, JavaScriptExecutor javaScriptExecutor, NativeModuleRegistry nativeModuleRegistry, JSBundleLoader jSBundleLoader, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, YRNCatalystInstanceImpl yRNCatalystInstanceImpl) {
        this.mPendingJSCalls = new AtomicInteger(0);
        this.mJsPendingCallsTitleForTrace = "pending_js_calls_instance" + sNextInstanceIdForTrace.getAndIncrement();
        this.mDestroyed = false;
        this.mJSCallsPendingInit = new ArrayList<>();
        this.mJSCallsPendingInitLock = new Object();
        this.mJSIModuleRegistry = new JSIModuleRegistry();
        this.mInitialized = false;
        this.mAcceptCalls = false;
        this.mTurboModuleRegistry = null;
        com.facebook.systrace.Systrace.c(0L, "createYRNCatalystInstanceImpl");
        this.mHybridData = initHybrid();
        this.mReactQueueConfiguration = reactQueueConfigurationImpl;
        this.mBridgeIdleListeners = new CopyOnWriteArrayList<>();
        this.mNativeModuleRegistry = nativeModuleRegistry;
        this.mJSModuleRegistry = new JavaScriptModuleRegistry();
        this.mJSBundleLoader = jSBundleLoader;
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        MessageQueueThread nativeModulesQueueThread = reactQueueConfigurationImpl.getNativeModulesQueueThread();
        this.mNativeModulesQueueThread = nativeModulesQueueThread;
        this.mTraceListener = new JSProfilerTraceListener(this);
        com.facebook.systrace.Systrace.g(0L);
        com.facebook.systrace.Systrace.c(0L, "initializeCxxBridge");
        initializeBridge(new YRNBridgeCallback(this), javaScriptExecutor, reactQueueConfigurationImpl.getJSQueueThread(), nativeModulesQueueThread, YRNModuleRegistryDelegate.getJavaModules(nativeModuleRegistry, this), YRNModuleRegistryDelegate.getCxxModules(nativeModuleRegistry), yRNCatalystInstanceImpl == null ? null : yRNCatalystInstanceImpl.getYRNModuleRegistryHolder());
        com.facebook.systrace.Systrace.g(0L);
        this.mJavaScriptContextHolder = new JavaScriptContextHolder(getJavaScriptContext());
    }

    public void callFunction(PendingJSCall pendingJSCall) {
        if (this.mDestroyed) {
            cm8.C("ReactNative", "Calling JS function after bridge has been destroyed: " + pendingJSCall.toString());
            return;
        }
        if (!this.mAcceptCalls) {
            synchronized (this.mJSCallsPendingInitLock) {
                try {
                    if (!this.mAcceptCalls) {
                        this.mJSCallsPendingInit.add(pendingJSCall);
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        pendingJSCall.call(this);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeModule getNativeModule(String str) {
        e4q e4qVarB;
        TurboModuleRegistry turboModuleRegistry = this.mTurboModuleRegistry;
        return (turboModuleRegistry == null || (e4qVarB = turboModuleRegistry.b(str)) == null) ? this.mNativeModuleRegistry.getModule(str) : (NativeModule) e4qVarB;
    }
}
