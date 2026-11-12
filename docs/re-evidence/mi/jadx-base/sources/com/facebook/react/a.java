package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeDeltaClient;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.NullShadowNodeExceptionHandler;
import com.facebook.react.bridge.ProxyJavaScriptExecutor;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.RedBoxHandler;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.fabric.ReactFabric;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.Systrace;
import defpackage.avq;
import defpackage.c9i;
import defpackage.cej;
import defpackage.cm8;
import defpackage.edj;
import defpackage.eej;
import defpackage.fv5;
import defpackage.iz6;
import defpackage.jdj;
import defpackage.k06;
import defpackage.kdj;
import defpackage.kr5;
import defpackage.lej;
import defpackage.mhh;
import defpackage.n06;
import defpackage.nok;
import defpackage.o06;
import defpackage.p06;
import defpackage.ppf;
import defpackage.pyo;
import defpackage.q7q;
import defpackage.rl4;
import defpackage.sk1;
import defpackage.wqk;
import defpackage.xhg;
import defpackage.ycj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile LifecycleState f7152b;
    public k c;
    public volatile Thread d;
    public final JavaScriptExecutorFactory e;
    public final JSBundleLoader f;
    public final String g;
    public final List<cej> h;
    public final n06 i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final NotThreadSafeBridgeIdleDebugListener f7153k;
    public volatile ReactContext m;
    public final Context n;
    public fv5 o;
    public Activity p;
    public final ppf t;
    public final NativeModuleCallExceptionHandler u;
    public final NullShadowNodeExceptionHandler v;
    public final JSIModulePackage w;
    public List<ViewManager> x;
    public j y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<lej> f7151a = Collections.synchronizedSet(new HashSet());
    public final Object l = new Object();
    public final Collection<l> q = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile boolean f7154r = false;
    public volatile Boolean s = Boolean.FALSE;

    /* JADX INFO: renamed from: com.facebook.react.a$a, reason: collision with other inner class name */
    public class C0152a implements fv5 {
        public C0152a() {
        }

        @Override // defpackage.fv5
        public void invokeDefaultOnBackPressed() {
            a.this.J();
        }
    }

    public class b implements kdj {
        public b() {
        }

        @Override // defpackage.kdj
        public JavaScriptExecutorFactory a() {
            return a.this.E();
        }

        @Override // defpackage.kdj
        public void b(NativeDeltaClient nativeDeltaClient) {
            a.this.W(nativeDeltaClient);
        }

        @Override // defpackage.kdj
        public void c(JavaJSExecutor.Factory factory) {
            a.this.Y(factory);
        }

        @Override // defpackage.kdj
        public Activity d() {
            return a.this.p;
        }

        @Override // defpackage.kdj
        public void toggleElementInspector() {
            a.this.k0();
        }
    }

    public class c implements mhh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p06 f7157a;

        /* JADX INFO: renamed from: com.facebook.react.a$c$a, reason: collision with other inner class name */
        public class RunnableC0153a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f7159a;

            public RunnableC0153a(boolean z) {
                this.f7159a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f7159a) {
                    a.this.i.handleReloadJS();
                } else if (a.this.i.hasUpToDateJSBundleInCache() && !c.this.f7157a.b()) {
                    a.this.W(null);
                } else {
                    c.this.f7157a.setRemoteJSDebugEnabled(false);
                    a.this.c0();
                }
            }
        }

        public c(p06 p06Var) {
            this.f7157a = p06Var;
        }

        @Override // defpackage.mhh
        public void a(boolean z) {
            UiThreadUtil.runOnUiThread(new RunnableC0153a(z));
        }
    }

    public class d implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7161a;

        public d(View view) {
            this.f7161a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f7161a.removeOnAttachStateChangeListener(this);
            a.this.i.setDevSupportEnabled(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f7163a;

        /* JADX INFO: renamed from: com.facebook.react.a$e$a, reason: collision with other inner class name */
        public class RunnableC0154a implements Runnable {
            public RunnableC0154a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.c != null) {
                    a aVar = a.this;
                    aVar.f0(aVar.c);
                    a.this.c = null;
                }
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ReactApplicationContext f7166a;

            public b(ReactApplicationContext reactApplicationContext) {
                this.f7166a = reactApplicationContext;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.h0(this.f7166a);
                } catch (Exception e) {
                    a.this.i.handleException(e);
                }
            }
        }

        public e(k kVar) {
            this.f7163a = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
            synchronized (a.this.s) {
                while (a.this.s.booleanValue()) {
                    try {
                        a.this.s.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            a.this.f7154r = true;
            try {
                Process.setThreadPriority(-4);
                ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
                ReactApplicationContext reactApplicationContextW = a.this.w(this.f7163a.b().create(), this.f7163a.a());
                a.this.d = null;
                ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START);
                RunnableC0154a runnableC0154a = new RunnableC0154a();
                reactApplicationContextW.runOnNativeModulesQueueThread(new b(reactApplicationContextW));
                UiThreadUtil.runOnUiThread(runnableC0154a);
            } catch (Exception e) {
                a.this.i.handleException(e);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l[] f7168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReactApplicationContext f7169b;

        public f(l[] lVarArr, ReactApplicationContext reactApplicationContext) {
            this.f7168a = lVarArr;
            this.f7169b = reactApplicationContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (l lVar : this.f7168a) {
                lVar.onReactContextInitialized(this.f7169b);
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(0);
            ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(0);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lej f7173b;

        public i(int i, lej lejVar) {
            this.f7172a = i;
            this.f7173b = lejVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Systrace.e(0L, "pre_rootView.onAttachedToReactInstance", this.f7172a);
            this.f7173b.a(101);
        }
    }

    public interface j {
        CatalystInstance createCatalystInstance(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, JSBundleLoader jSBundleLoader, NativeModuleRegistry nativeModuleRegistry);

        xhg createNativeModuleRegistryBuilder(ReactApplicationContext reactApplicationContext, a aVar);
    }

    public class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JavaScriptExecutorFactory f7174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final JSBundleLoader f7175b;

        public k(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            this.f7174a = (JavaScriptExecutorFactory) sk1.c(javaScriptExecutorFactory);
            this.f7175b = (JSBundleLoader) sk1.c(jSBundleLoader);
        }

        public JSBundleLoader a() {
            return this.f7175b;
        }

        public JavaScriptExecutorFactory b() {
            return this.f7174a;
        }
    }

    public interface l {
        void onReactContextInitialized(ReactContext reactContext);
    }

    public a(Context context, Activity activity, fv5 fv5Var, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List<cej> list, boolean z, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, com.facebook.react.uimanager.c cVar, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, NullShadowNodeExceptionHandler nullShadowNodeExceptionHandler, RedBoxHandler redBoxHandler, boolean z2, k06 k06Var, int i2, int i3, JSIModulePackage jSIModulePackage, Map<String, nok> map) {
        I(context);
        iz6.h(context);
        this.n = context;
        this.p = activity;
        this.o = fv5Var;
        this.e = javaScriptExecutorFactory;
        this.f = jSBundleLoader;
        this.g = str;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.j = z;
        Systrace.c(0L, "ReactInstanceManager.initDevSupportManager");
        n06 n06VarA = o06.a(context, v(), str, z, redBoxHandler, k06Var, i2, map);
        this.i = n06VarA;
        Systrace.g(0L);
        this.f7153k = notThreadSafeBridgeIdleDebugListener;
        this.f7152b = lifecycleState;
        this.t = new ppf(context);
        this.u = nativeModuleCallExceptionHandler;
        this.v = nullShadowNodeExceptionHandler;
        synchronized (arrayList) {
            try {
                c9i.a().a(ycj.c, "RNCore: Use Split Packages");
                arrayList.add(new rl4(this, new C0152a(), cVar, z2, i3));
                if (z) {
                    arrayList.add(new kr5());
                }
                arrayList.addAll(list);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.w = jSIModulePackage;
        ReactChoreographer.j();
        if (z) {
            n06VarA.startInspector();
        }
    }

    public static void I(Context context) {
        SoLoader.m(context, false);
    }

    public static jdj t() {
        return new jdj();
    }

    public void A(lej lejVar) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f7151a) {
            try {
                if (this.f7151a.contains(lejVar)) {
                    ReactContext reactContextC = C();
                    this.f7151a.remove(lejVar);
                    if (reactContextC != null && reactContextC.hasActiveCatalystInstance()) {
                        B(lejVar, reactContextC.getCatalystInstance());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(lej lejVar, CatalystInstance catalystInstance) {
        UiThreadUtil.assertOnUiThread();
        if (lejVar.getUIManagerType() == 2) {
            ((ReactFabric) catalystInstance.getJSModule(ReactFabric.class)).unmountComponentAtNode(lejVar.getRootViewTag());
        } else {
            ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(lejVar.getRootViewTag());
        }
    }

    public ReactContext C() {
        ReactContext reactContext;
        synchronized (this.l) {
            reactContext = this.m;
        }
        return reactContext;
    }

    public n06 D() {
        return this.i;
    }

    public final JavaScriptExecutorFactory E() {
        return this.e;
    }

    public LifecycleState F() {
        return this.f7152b;
    }

    public List<ViewManager> G(ReactApplicationContext reactApplicationContext) {
        List<ViewManager> list;
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        Systrace.c(0L, "createAllViewManagers");
        try {
            if (this.x == null) {
                synchronized (this.h) {
                    try {
                        if (this.x == null) {
                            this.x = new ArrayList();
                            Iterator<cej> it = this.h.iterator();
                            while (it.hasNext()) {
                                this.x.addAll(it.next().createViewManagers(reactApplicationContext));
                            }
                            list = this.x;
                        } else {
                            list = this.x;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                list = this.x;
            }
            Systrace.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            return list;
        } catch (Throwable th2) {
            Systrace.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            throw th2;
        }
    }

    public List<String> H() {
        ArrayList arrayList;
        List<String> listA;
        Systrace.c(0L, "ReactInstanceManager.getViewManagerNames");
        synchronized (this.l) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) C();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveCatalystInstance()) {
                synchronized (this.h) {
                    try {
                        HashSet hashSet = new HashSet();
                        for (cej cejVar : this.h) {
                            pyo.a(0L, "ReactInstanceManager.getViewManagerName").b("Package", cejVar.getClass().getSimpleName()).c();
                            if ((cejVar instanceof avq) && (listA = ((avq) cejVar).a(reactApplicationContext)) != null) {
                                hashSet.addAll(listA);
                            }
                            pyo.b(0L).c();
                        }
                        Systrace.g(0L);
                        arrayList = new ArrayList(hashSet);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return arrayList;
            }
            return null;
        }
    }

    public final void J() {
        UiThreadUtil.assertOnUiThread();
        fv5 fv5Var = this.o;
        if (fv5Var != null) {
            fv5Var.invokeDefaultOnBackPressed();
        }
    }

    public final synchronized void K() {
        if (this.f7152b == LifecycleState.RESUMED) {
            N(true);
        }
    }

    public final synchronized void L() {
        try {
            ReactContext reactContextC = C();
            if (reactContextC != null) {
                if (this.f7152b == LifecycleState.RESUMED) {
                    reactContextC.onHostPause();
                    this.f7152b = LifecycleState.BEFORE_RESUME;
                }
                if (this.f7152b == LifecycleState.BEFORE_RESUME) {
                    reactContextC.onHostDestroy();
                }
            }
            this.f7152b = LifecycleState.BEFORE_CREATE;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void M() {
        try {
            ReactContext reactContextC = C();
            if (reactContextC != null) {
                if (this.f7152b == LifecycleState.BEFORE_CREATE) {
                    reactContextC.onHostResume(this.p);
                    reactContextC.onHostPause();
                } else if (this.f7152b == LifecycleState.RESUMED) {
                    reactContextC.onHostPause();
                }
            }
            this.f7152b = LifecycleState.BEFORE_RESUME;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void N(boolean z) {
        try {
            ReactContext reactContextC = C();
            if (reactContextC != null && (z || this.f7152b == LifecycleState.BEFORE_RESUME || this.f7152b == LifecycleState.BEFORE_CREATE)) {
                reactContextC.onHostResume(this.p);
            }
            this.f7152b = LifecycleState.RESUMED;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void O(Activity activity, int i2, int i3, Intent intent) {
        ReactContext reactContextC = C();
        if (reactContextC != null) {
            reactContextC.onActivityResult(activity, i2, i3, intent);
        }
    }

    public void P() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.m;
        if (reactContext != null) {
            ((DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class)).emitHardwareBackPressed();
        } else {
            cm8.C("ReactNative", "Instance detached from instance manager");
            J();
        }
    }

    public void Q() {
        UiThreadUtil.assertOnUiThread();
        if (this.j) {
            this.i.setDevSupportEnabled(false);
        }
        L();
        this.p = null;
    }

    public void R(Activity activity) {
        if (activity == this.p) {
            Q();
        }
    }

    public void S() {
        UiThreadUtil.assertOnUiThread();
        this.o = null;
        if (this.j) {
            this.i.setDevSupportEnabled(false);
        }
        M();
    }

    public void T(Activity activity) {
        sk1.c(this.p);
        sk1.b(activity == this.p, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + this.p.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
        S();
    }

    public void U(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.p = activity;
        if (this.j) {
            View decorView = activity.getWindow().getDecorView();
            if (androidx.core.view.c.T(decorView)) {
                this.i.setDevSupportEnabled(true);
            } else {
                decorView.addOnAttachStateChangeListener(new d(decorView));
            }
        }
        N(false);
    }

    public void V(Activity activity, fv5 fv5Var) {
        UiThreadUtil.assertOnUiThread();
        this.o = fv5Var;
        U(activity);
    }

    public final void W(NativeDeltaClient nativeDeltaClient) {
        b0(this.e, nativeDeltaClient == null ? JSBundleLoader.createCachedBundleFromNetworkLoader(this.i.getSourceUrl(), this.i.getDownloadedJSBundleFile()) : JSBundleLoader.createDeltaFromNetworkLoader(this.i.getSourceUrl(), nativeDeltaClient));
    }

    public void X(Intent intent) {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextC = C();
        if (reactContextC == null) {
            cm8.C("ReactNative", "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if ("android.intent.action.VIEW".equals(action) && data != null) {
            ((DeviceEventManagerModule) reactContextC.getNativeModule(DeviceEventManagerModule.class)).emitNewIntentReceived(data);
        }
        reactContextC.onNewIntent(this.p, intent);
    }

    public final void Y(JavaJSExecutor.Factory factory) {
        b0(new ProxyJavaScriptExecutor.Factory(factory), JSBundleLoader.createRemoteDebuggerBundleLoader(this.i.getJSBundleURLForRemoteDebugging(), this.i.getSourceUrl()));
    }

    public final void Z(cej cejVar, xhg xhgVar) {
        pyo.a(0L, "processPackage").b("className", cejVar.getClass().getSimpleName()).c();
        boolean z = cejVar instanceof eej;
        if (z) {
            ((eej) cejVar).b();
        }
        xhgVar.processPackage(cejVar);
        if (z) {
            ((eej) cejVar).a();
        }
        pyo.b(0L).c();
    }

    public final NativeModuleRegistry a0(ReactApplicationContext reactApplicationContext, List<cej> list, boolean z) {
        xhg xhgVar = new xhg(reactApplicationContext, this);
        j jVar = this.y;
        if (jVar != null) {
            xhgVar = jVar.createNativeModuleRegistryBuilder(reactApplicationContext, this);
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.h) {
            try {
                Iterator<cej> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        cej next = it.next();
                        if (!z || !this.h.contains(next)) {
                            Systrace.c(0L, "createAndProcessCustomReactPackage");
                            if (z) {
                                try {
                                    this.h.add(next);
                                } catch (Throwable th) {
                                    Systrace.g(0L);
                                    throw th;
                                }
                            }
                            Z(next, xhgVar);
                            Systrace.g(0L);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        Systrace.c(0L, "buildNativeModuleRegistry");
        try {
            return xhgVar.build();
        } finally {
            Systrace.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    public final void b0(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        UiThreadUtil.assertOnUiThread();
        k kVar = new k(javaScriptExecutorFactory, jSBundleLoader);
        if (this.d == null) {
            f0(kVar);
        } else {
            this.c = kVar;
        }
    }

    public final void c0() {
        c9i.a().a(ycj.c, "RNCore: load from BundleLoader");
        b0(this.e, this.f);
    }

    public final void d0() {
        c9i.a().a(ycj.c, "RNCore: recreateReactContextInBackground");
        UiThreadUtil.assertOnUiThread();
        if (this.j && this.g != null) {
            p06 devSettings = this.i.getDevSettings();
            if (!Systrace.h(0L)) {
                if (this.f == null) {
                    this.i.handleReloadJS();
                    return;
                } else {
                    this.i.isPackagerRunning(new c(devSettings));
                    return;
                }
            }
        }
        c0();
    }

    public void e0(l lVar) {
        this.q.remove(lVar);
    }

    public final void f0(k kVar) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f7151a) {
            synchronized (this.l) {
                try {
                    if (this.m != null) {
                        j0(this.m);
                        this.m = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.d = new Thread(null, new e(kVar), "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.d.start();
    }

    public void g0(j jVar) {
        this.y = jVar;
    }

    public final void h0(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        Systrace.c(0L, "setupReactContext");
        synchronized (this.f7151a) {
            try {
                synchronized (this.l) {
                    this.m = (ReactContext) sk1.c(reactApplicationContext);
                }
                CatalystInstance catalystInstance = (CatalystInstance) sk1.c(reactApplicationContext.getCatalystInstance());
                catalystInstance.initialize();
                this.i.onNewReactContextCreated(reactApplicationContext);
                this.t.a(catalystInstance);
                K();
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
                Iterator<lej> it = this.f7151a.iterator();
                while (it.hasNext()) {
                    s(it.next());
                }
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
            } catch (Throwable th) {
                throw th;
            }
        }
        UiThreadUtil.runOnUiThread(new f((l[]) this.q.toArray(new l[this.q.size()]), reactApplicationContext));
        Systrace.g(0L);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        reactApplicationContext.runOnJSQueueThread(new g());
        reactApplicationContext.runOnNativeModulesQueueThread(new h());
    }

    public void i0() {
        UiThreadUtil.assertOnUiThread();
        this.i.showDevOptionsDialog();
    }

    public final void j0(ReactContext reactContext) {
        UiThreadUtil.assertOnUiThread();
        if (this.f7152b == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.f7151a) {
            try {
                Iterator<lej> it = this.f7151a.iterator();
                while (it.hasNext()) {
                    u(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        reactContext.destroy();
        this.i.onReactInstanceDestroyed(reactContext);
        this.t.d(reactContext.getCatalystInstance());
    }

    public final void k0() {
        ReactContext reactContextC = C();
        if (reactContextC != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextC.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("toggleElementInspector", null);
        }
    }

    public void q(l lVar) {
        this.q.add(lVar);
    }

    public void r(lej lejVar) {
        UiThreadUtil.assertOnUiThread();
        this.f7151a.add(lejVar);
        u(lejVar);
        ReactContext reactContextC = C();
        if (this.d != null || reactContextC == null) {
            return;
        }
        s(lejVar);
    }

    public final void s(lej lejVar) {
        Systrace.c(0L, "attachRootViewToInstance");
        UIManager uIManagerA = q7q.a(this.m, lejVar.getUIManagerType());
        Bundle appProperties = lejVar.getAppProperties();
        int iAddRootView = uIManagerA.addRootView(lejVar.getRootViewGroup(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties), lejVar.getInitialUITemplate());
        lejVar.setRootViewTag(iAddRootView);
        if (lejVar.getUIManagerType() == 2) {
            uIManagerA.updateRootLayoutSpecs(iAddRootView, lejVar.getWidthMeasureSpec(), lejVar.getHeightMeasureSpec());
            lejVar.setShouldLogContentAppeared(true);
        } else {
            lejVar.b();
        }
        Systrace.a(0L, "pre_rootView.onAttachedToReactInstance", iAddRootView);
        UiThreadUtil.runOnUiThread(new i(iAddRootView, lejVar));
        Systrace.g(0L);
    }

    public final void u(lej lejVar) {
        lejVar.getRootViewGroup().removeAllViews();
        lejVar.getRootViewGroup().setId(-1);
    }

    public final kdj v() {
        return new b();
    }

    public final ReactApplicationContext w(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        CatalystInstance catalystInstanceBuild;
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        ReactApplicationContext reactApplicationContext = new ReactApplicationContext(this.n);
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.u;
        if (nativeModuleCallExceptionHandler == null) {
            nativeModuleCallExceptionHandler = this.i;
        }
        reactApplicationContext.setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        reactApplicationContext.setNullShadowNodeExceptionHandler(this.v);
        NativeModuleRegistry nativeModuleRegistryA0 = a0(reactApplicationContext, this.h, false);
        j jVar = this.y;
        if (jVar != null) {
            catalystInstanceBuild = jVar.createCatalystInstance(nativeModuleCallExceptionHandler, jSBundleLoader, nativeModuleRegistryA0);
        } else {
            CatalystInstanceImpl.Builder nativeModuleCallExceptionHandler2 = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(nativeModuleRegistryA0).setJSBundleLoader(jSBundleLoader).setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
            Systrace.c(0L, "createCatalystInstance");
            try {
                catalystInstanceBuild = nativeModuleCallExceptionHandler2.build();
                Systrace.g(0L);
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            } catch (Throwable th) {
                Systrace.g(0L);
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
                throw th;
            }
        }
        reactApplicationContext.initializeWithInstance(catalystInstanceBuild);
        JSIModulePackage jSIModulePackage = this.w;
        if (jSIModulePackage != null) {
            catalystInstanceBuild.addJSIModules(jSIModulePackage.getJSIModules(reactApplicationContext, catalystInstanceBuild.getJavaScriptContextHolder()));
            if (edj.f16533b) {
                catalystInstanceBuild.setTurboModuleManager(catalystInstanceBuild.getJSIModule(JSIModuleType.TurboModuleManager));
            }
        }
        NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f7153k;
        if (notThreadSafeBridgeIdleDebugListener != null) {
            catalystInstanceBuild.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
        }
        if (Systrace.h(0L)) {
            catalystInstanceBuild.setGlobalVariable("__RCTProfileIsProfiling", "true");
        }
        ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
        Systrace.c(0L, "runJSBundle");
        catalystInstanceBuild.runJSBundle();
        Systrace.g(0L);
        return reactApplicationContext;
    }

    public void x() {
        UiThreadUtil.assertOnUiThread();
        if (this.f7154r) {
            return;
        }
        this.f7154r = true;
        d0();
    }

    public ViewManager y(String str) {
        ViewManager viewManagerB;
        synchronized (this.l) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) C();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveCatalystInstance()) {
                synchronized (this.h) {
                    try {
                        for (cej cejVar : this.h) {
                            if ((cejVar instanceof avq) && (viewManagerB = ((avq) cejVar).b(reactApplicationContext, str)) != null) {
                                return viewManagerB;
                            }
                        }
                        return null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return null;
        }
    }

    public void z() {
        UiThreadUtil.assertOnUiThread();
        c9i.a().a(ycj.c, "RNCore: Destroy");
        this.s = Boolean.TRUE;
        if (this.j) {
            this.i.setDevSupportEnabled(false);
            this.i.stopInspector();
        }
        L();
        if (this.d != null) {
            this.d = null;
        }
        this.t.b(this.n);
        synchronized (this.l) {
            try {
                if (this.m != null) {
                    this.m.destroy();
                    this.m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7154r = false;
        this.p = null;
        wqk.b().a();
        this.s = Boolean.FALSE;
        synchronized (this.s) {
            this.s.notifyAll();
        }
    }
}
