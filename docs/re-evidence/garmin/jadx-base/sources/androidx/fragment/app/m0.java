package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.m1;
import androidx.lifecycle.p1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;

/* JADX INFO: loaded from: classes.dex */
public class m0 implements androidx.lifecycle.y, nd.e, ViewModelStoreOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f7294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1 f7295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f7296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x1.c f7297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.o0 f7298e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public nd.d f7299f = null;

    public m0(Fragment fragment, y1 y1Var, Runnable runnable) {
        this.f7294a = fragment;
        this.f7295b = y1Var;
        this.f7296c = runnable;
    }

    public final void a(androidx.lifecycle.b0.a aVar) {
        this.f7298e.g(aVar);
    }

    public final void b() {
        if (this.f7298e == null) {
            this.f7298e = new androidx.lifecycle.o0(this);
            nd.d.f125385c.getClass();
            nd.d dVarA = nd.d.a.a(this);
            this.f7299f = dVarA;
            dVarA.f125386a.a();
            this.f7296c.run();
        }
    }

    @Override // androidx.lifecycle.y
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f7294a;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        androidx.lifecycle.viewmodel.a aVar = new androidx.lifecycle.viewmodel.a();
        if (application != null) {
            aVar.b(x1.a.f8075f, application);
        }
        aVar.b(m1.f7960a, fragment);
        aVar.b(m1.f7961b, this);
        if (fragment.getArguments() != null) {
            aVar.b(m1.f7962c, fragment.getArguments());
        }
        return aVar;
    }

    @Override // androidx.lifecycle.y
    public final x1.c getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f7294a;
        x1.c defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f7297d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f7297d == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f7297d = new p1(application, fragment, fragment.getArguments());
        }
        return this.f7297d;
    }

    @Override // androidx.lifecycle.n0
    /* JADX INFO: renamed from: getLifecycle */
    public final androidx.lifecycle.b0 getF158016a() {
        b();
        return this.f7298e;
    }

    @Override // nd.e
    public final nd.c getSavedStateRegistry() {
        b();
        return this.f7299f.f125387b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    /* JADX INFO: renamed from: getViewModelStore */
    public final y1 getF189591b() {
        b();
        return this.f7295b;
    }
}
