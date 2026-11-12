package com.facebook.react.bridge;

import android.content.res.AssetManager;
import android.os.AsyncTask;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.turbomodule.core.JSCallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.systrace.TraceListener;
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
public class CatalystInstanceImpl implements CatalystInstance {
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

    /* JADX INFO: renamed from: com.facebook.react.bridge.CatalystInstanceImpl$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: com.facebook.react.bridge.CatalystInstanceImpl$1$1, reason: invalid class name and collision with other inner class name */
        public class RunnableC01561 implements Runnable {
            final /* synthetic */ JSIModule val$turboModuleManager;

            public RunnableC01561(JSIModule jSIModule) {
                this.val$turboModuleManager = jSIModule;
            }

            @Override // java.lang.Runnable
            public void run() {
                JSIModule jSIModule = this.val$turboModuleManager;
                if (jSIModule != null) {
                    jSIModule.onCatalystInstanceDestroy();
                }
                CatalystInstanceImpl.this.getReactQueueConfiguration().getUIQueueThread().runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.1.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AsyncTask.execute(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.1.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                CatalystInstanceImpl.this.mJavaScriptContextHolder.clear();
                                CatalystInstanceImpl.this.mHybridData.a();
                                CatalystInstanceImpl.this.getReactQueueConfiguration().destroy();
                                ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END);
                            }
                        });
                    }
                });
            }
        }

        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceDestroy();
            CatalystInstanceImpl.this.mJSIModuleRegistry.notifyJSInstanceDestroy();
            boolean z = CatalystInstanceImpl.this.mPendingJSCalls.getAndSet(0) == 0;
            if (!CatalystInstanceImpl.this.mBridgeIdleListeners.isEmpty()) {
                for (NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener : CatalystInstanceImpl.this.mBridgeIdleListeners) {
                    if (!z) {
                        notThreadSafeBridgeIdleDebugListener.onTransitionToBridgeIdle();
                    }
                    notThreadSafeBridgeIdleDebugListener.onBridgeDestroyed();
                }
            }
            CatalystInstanceImpl.this.getReactQueueConfiguration().getJSQueueThread().runOnQueue(new RunnableC01561(edj.f16533b ? CatalystInstanceImpl.this.mJSIModuleRegistry.getModule(JSIModuleType.TurboModuleManager) : null));
        }
    }

    public static class BridgeCallback implements ReactCallback {
        private final WeakReference<CatalystInstanceImpl> mOuter;

        public BridgeCallback(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void decrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.decrementPendingJSCalls();
            }
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void incrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.incrementPendingJSCalls();
            }
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void onBatchComplete() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.mNativeModuleRegistry.onBatchComplete();
            }
        }
    }

    public static class Builder {
        private JSBundleLoader mJSBundleLoader;
        private JavaScriptExecutor mJSExecutor;
        private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
        private ReactQueueConfigurationSpec mReactQueueConfigurationSpec;
        private NativeModuleRegistry mRegistry;

        public CatalystInstanceImpl build() {
            return new CatalystInstanceImpl((ReactQueueConfigurationSpec) sk1.c(this.mReactQueueConfigurationSpec), (JavaScriptExecutor) sk1.c(this.mJSExecutor), (NativeModuleRegistry) sk1.c(this.mRegistry), (JSBundleLoader) sk1.c(this.mJSBundleLoader), (NativeModuleCallExceptionHandler) sk1.c(this.mNativeModuleCallExceptionHandler), null);
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

        public Builder setReactQueueConfigurationSpec(ReactQueueConfigurationSpec reactQueueConfigurationSpec) {
            this.mReactQueueConfigurationSpec = reactQueueConfigurationSpec;
            return this;
        }

        public Builder setRegistry(NativeModuleRegistry nativeModuleRegistry) {
            this.mRegistry = nativeModuleRegistry;
            return this;
        }
    }

    public static class JSProfilerTraceListener implements TraceListener {
        private final WeakReference<CatalystInstanceImpl> mOuter;

        public JSProfilerTraceListener(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }

        public void onTraceStarted() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(true);
            }
        }

        public void onTraceStopped() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(false);
            }
        }
    }

    public class NativeExceptionHandler implements QueueThreadExceptionHandler {
        private NativeExceptionHandler() {
        }

        @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
        public void handleException(Exception exc) {
            CatalystInstanceImpl.this.onNativeException(exc);
        }

        public /* synthetic */ NativeExceptionHandler(CatalystInstanceImpl catalystInstanceImpl, AnonymousClass1 anonymousClass1) {
            this();
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

        public void call(CatalystInstanceImpl catalystInstanceImpl) {
            NativeArray writableNativeArray = this.mArguments;
            if (writableNativeArray == null) {
                writableNativeArray = new WritableNativeArray();
            }
            catalystInstanceImpl.jniCallJSFunction(this.mModule, this.mMethod, writableNativeArray);
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

    static {
        ReactBridge.staticInit();
        sNextInstanceIdForTrace = new AtomicInteger(1);
    }

    public /* synthetic */ CatalystInstanceImpl(ReactQueueConfigurationSpec reactQueueConfigurationSpec, JavaScriptExecutor javaScriptExecutor, NativeModuleRegistry nativeModuleRegistry, JSBundleLoader jSBundleLoader, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, AnonymousClass1 anonymousClass1) {
        this(reactQueueConfigurationSpec, javaScriptExecutor, nativeModuleRegistry, jSBundleLoader, nativeModuleCallExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementPendingJSCalls() {
        int iDecrementAndGet = this.mPendingJSCalls.decrementAndGet();
        boolean z = iDecrementAndGet == 0;
        com.facebook.systrace.Systrace.k(0L, this.mJsPendingCallsTitleForTrace, iDecrementAndGet);
        if (!z || this.mBridgeIdleListeners.isEmpty()) {
            return;
        }
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.4
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                while (it.hasNext()) {
                    ((NotThreadSafeBridgeIdleDebugListener) it.next()).onTransitionToBridgeIdle();
                }
            }
        });
    }

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
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.3
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                while (it.hasNext()) {
                    ((NotThreadSafeBridgeIdleDebugListener) it.next()).onTransitionToBridgeBusy();
                }
            }
        });
    }

    private static native HybridData initHybrid();

    private native void initializeBridge(ReactCallback reactCallback, JavaScriptExecutor javaScriptExecutor, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

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
        this.mReactQueueConfiguration.getUIQueueThread().runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.5
            @Override // java.lang.Runnable
            public void run() {
                CatalystInstanceImpl.this.destroy();
            }
        });
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
        UiThreadUtil.assertOnUiThread();
        if (this.mDestroyed) {
            return;
        }
        ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START);
        this.mDestroyed = true;
        this.mNativeModulesQueueThread.runOnQueue(new AnonymousClass1());
        com.facebook.systrace.Systrace.m(this.mTraceListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void extendNativeModules(NativeModuleRegistry nativeModuleRegistry) {
        this.mNativeModuleRegistry.registerModules(nativeModuleRegistry);
        jniExtendNativeModules(nativeModuleRegistry.getJavaModules(this), nativeModuleRegistry.getCxxModules());
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
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.2
            @Override // java.lang.Runnable
            public void run() {
                CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceInitialized();
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

    private CatalystInstanceImpl(ReactQueueConfigurationSpec reactQueueConfigurationSpec, JavaScriptExecutor javaScriptExecutor, NativeModuleRegistry nativeModuleRegistry, JSBundleLoader jSBundleLoader, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mPendingJSCalls = new AtomicInteger(0);
        this.mJsPendingCallsTitleForTrace = "pending_js_calls_instance" + sNextInstanceIdForTrace.getAndIncrement();
        this.mDestroyed = false;
        this.mJSCallsPendingInit = new ArrayList<>();
        this.mJSCallsPendingInitLock = new Object();
        this.mJSIModuleRegistry = new JSIModuleRegistry();
        this.mInitialized = false;
        this.mAcceptCalls = false;
        this.mTurboModuleRegistry = null;
        com.facebook.systrace.Systrace.c(0L, "createCatalystInstanceImpl");
        this.mHybridData = initHybrid();
        ReactQueueConfigurationImpl reactQueueConfigurationImplCreate = ReactQueueConfigurationImpl.create(reactQueueConfigurationSpec, new NativeExceptionHandler(this, null));
        this.mReactQueueConfiguration = reactQueueConfigurationImplCreate;
        this.mBridgeIdleListeners = new CopyOnWriteArrayList<>();
        this.mNativeModuleRegistry = nativeModuleRegistry;
        this.mJSModuleRegistry = new JavaScriptModuleRegistry();
        this.mJSBundleLoader = jSBundleLoader;
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        MessageQueueThread nativeModulesQueueThread = reactQueueConfigurationImplCreate.getNativeModulesQueueThread();
        this.mNativeModulesQueueThread = nativeModulesQueueThread;
        this.mTraceListener = new JSProfilerTraceListener(this);
        com.facebook.systrace.Systrace.g(0L);
        com.facebook.systrace.Systrace.c(0L, "initializeCxxBridge");
        initializeBridge(new BridgeCallback(this), javaScriptExecutor, reactQueueConfigurationImplCreate.getJSQueueThread(), nativeModulesQueueThread, nativeModuleRegistry.getJavaModules(this), nativeModuleRegistry.getCxxModules());
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
