package defpackage;

import android.app.Activity;
import android.app.Application;
import com.facebook.react.a;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.NullShadowNodeExceptionHandler;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.RedBoxHandler;
import com.facebook.react.uimanager.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class jdj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22675b;
    public JSBundleLoader c;
    public String d;
    public NotThreadSafeBridgeIdleDebugListener e;
    public Application f;
    public boolean g;
    public LifecycleState h;
    public c i;
    public NativeModuleCallExceptionHandler j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public NullShadowNodeExceptionHandler f22676k;
    public Activity l;
    public fv5 m;
    public RedBoxHandler n;
    public boolean o;
    public k06 p;
    public JavaScriptExecutorFactory q;
    public JSIModulePackage t;
    public Map<String, nok> u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<cej> f22674a = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22677r = 1;
    public int s = -1;

    public jdj a(cej cejVar) {
        this.f22674a.add(cejVar);
        return this;
    }

    public jdj b(List<cej> list) {
        this.f22674a.addAll(list);
        return this;
    }

    public a c() {
        String str;
        sk1.d(this.f, "Application property has not been set with this builder");
        if (this.h == LifecycleState.RESUMED) {
            sk1.d(this.l, "Activity needs to be set if initial lifecycle state is resumed");
        }
        boolean z = true;
        sk1.b((!this.g && this.f22675b == null && this.c == null) ? false : true, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.d == null && this.f22675b == null && this.c == null) {
            z = false;
        }
        sk1.b(z, "Either MainModulePath or JS Bundle File needs to be provided");
        if (this.i == null) {
            this.i = new c();
        }
        String packageName = this.f.getPackageName();
        String strD = ia1.d();
        Application application = this.f;
        Activity activity = this.l;
        fv5 fv5Var = this.m;
        JavaScriptExecutorFactory javaScriptExecutorFactory = this.q;
        JavaScriptExecutorFactory javaScriptExecutorFactoryD = javaScriptExecutorFactory == null ? d(packageName, strD) : javaScriptExecutorFactory;
        JSBundleLoader jSBundleLoaderCreateAssetLoader = this.c;
        if (jSBundleLoaderCreateAssetLoader == null && (str = this.f22675b) != null) {
            jSBundleLoaderCreateAssetLoader = JSBundleLoader.createAssetLoader(this.f, str, false);
        }
        return new a(application, activity, fv5Var, javaScriptExecutorFactoryD, jSBundleLoaderCreateAssetLoader, this.d, this.f22674a, this.g, this.e, (LifecycleState) sk1.d(this.h, "Initial lifecycle state was not set"), this.i, this.j, this.f22676k, this.n, this.o, this.p, this.f22677r, this.s, this.t, this.u);
    }

    public final JavaScriptExecutorFactory d(String str, String str2) {
        return new pmq();
    }

    public jdj e(Application application) {
        this.f = application;
        return this;
    }

    public jdj f(Activity activity) {
        this.l = activity;
        return this;
    }

    public jdj g(fv5 fv5Var) {
        this.m = fv5Var;
        return this;
    }

    public jdj h(LifecycleState lifecycleState) {
        this.h = lifecycleState;
        return this;
    }

    public jdj i(String str) {
        if (!str.startsWith("assets://")) {
            return j(JSBundleLoader.createFileLoader(str));
        }
        this.f22675b = str;
        this.c = null;
        return this;
    }

    public jdj j(JSBundleLoader jSBundleLoader) {
        this.c = jSBundleLoader;
        this.f22675b = null;
        return this;
    }

    public jdj k(String str) {
        this.d = str;
        return this;
    }

    public jdj l(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.j = nativeModuleCallExceptionHandler;
        return this;
    }

    public jdj m(boolean z) {
        this.g = z;
        return this;
    }
}
