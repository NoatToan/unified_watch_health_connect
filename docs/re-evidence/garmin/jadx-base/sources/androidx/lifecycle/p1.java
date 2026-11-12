package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.exoplayer2.util.MimeTypes;
import java.lang.reflect.Constructor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\tB%\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/p1;", "Landroidx/lifecycle/x1$e;", "Landroidx/lifecycle/x1$c;", "<init>", "()V", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "Lnd/e;", "owner", "(Landroid/app/Application;Lnd/e;)V", "Landroid/os/Bundle;", "defaultArgs", "(Landroid/app/Application;Lnd/e;Landroid/os/Bundle;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p1 extends x1.e implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f7987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1.a f7988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f7989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f7990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nd.c f7991e;

    @SuppressLint({"LambdaLast"})
    public p1(Application application, nd.e eVar, Bundle bundle) {
        x1.a aVar;
        eVar.getClass();
        this.f7991e = eVar.getSavedStateRegistry();
        this.f7990d = eVar.getF158016a();
        this.f7989c = bundle;
        this.f7987a = application;
        if (application != null) {
            x1.a.f8073d.getClass();
            if (x1.a.f8074e == null) {
                x1.a.f8074e = new x1.a(application);
            }
            aVar = x1.a.f8074e;
            aVar.getClass();
        } else {
            aVar = new x1.a();
        }
        this.f7988b = aVar;
    }

    @Override // androidx.lifecycle.x1.e
    public final void a(u1 u1Var) {
        b0 b0Var = this.f7990d;
        if (b0Var != null) {
            nd.c cVar = this.f7991e;
            cVar.getClass();
            z.a(u1Var, cVar, b0Var);
        }
    }

    public final u1 b(Class cls, String str) {
        cls.getClass();
        b0 b0Var = this.f7990d;
        if (b0Var == null) {
            org.apache.commons.lang3.e.w("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Application application = this.f7987a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? q1.a(q1.f7998b, cls) : q1.a(q1.f7997a, cls);
        if (constructorA == null) {
            if (application != null) {
                return this.f7988b.create(cls);
            }
            x1.d.f8078a.getClass();
            if (x1.d.f8079b == null) {
                x1.d.f8079b = new x1.d();
            }
            x1.d dVar = x1.d.f8079b;
            dVar.getClass();
            return dVar.create(cls);
        }
        nd.c cVar = this.f7991e;
        cVar.getClass();
        z zVar = z.f8081a;
        Bundle bundleA = cVar.a(str);
        j1.f7943c.getClass();
        l1 l1Var = new l1(str, j1.a.a(bundleA, this.f7989c));
        l1Var.a(b0Var, cVar);
        z.f8081a.getClass();
        z.b(b0Var, cVar);
        j1 j1Var = l1Var.f7957b;
        u1 u1VarB = (!zIsAssignableFrom || application == null) ? q1.b(cls, constructorA, j1Var) : q1.b(cls, constructorA, application, j1Var);
        u1VarB.addCloseable("androidx.lifecycle.savedstate.vm.tag", l1Var);
        return u1VarB;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls, CreationExtras creationExtras) {
        String str = (String) creationExtras.a(x1.f8071c);
        if (str == null) {
            vb.h.z("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (creationExtras.a(m1.f7960a) == null || creationExtras.a(m1.f7961b) == null) {
            if (this.f7990d != null) {
                return (T) b(cls, str);
            }
            vb.h.z("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) creationExtras.a(x1.a.f8075f);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? q1.a(q1.f7998b, cls) : q1.a(q1.f7997a, cls);
        if (constructorA == null) {
            return (T) this.f7988b.create(cls, creationExtras);
        }
        return (!zIsAssignableFrom || application == null) ? (T) q1.b(cls, constructorA, m1.a(creationExtras)) : (T) q1.b(cls, constructorA, application, m1.a(creationExtras));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p1(Application application, nd.e eVar) {
        this(application, eVar, null);
        eVar.getClass();
    }

    public p1() {
        this.f7988b = new x1.a();
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(k23.d<T> dVar, CreationExtras creationExtras) {
        dVar.getClass();
        return (T) create(dh.b.u(dVar), creationExtras);
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(cls, canonicalName);
        }
        vb.h.s("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
