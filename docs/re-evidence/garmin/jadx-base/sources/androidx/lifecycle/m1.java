package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.Arrays;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f7961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f7962c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/m1$a", "Landroidx/lifecycle/x1$c;", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements x1.c {
        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(k23.d<T> dVar, CreationExtras creationExtras) {
            dVar.getClass();
            return new o1();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/m1$b", "Landroidx/lifecycle/viewmodel/CreationExtras$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements CreationExtras.c<nd.e> {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/m1$c", "Landroidx/lifecycle/viewmodel/CreationExtras$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements CreationExtras.c<ViewModelStoreOwner> {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/m1$d", "Landroidx/lifecycle/viewmodel/CreationExtras$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements CreationExtras.c<Bundle> {
    }

    static {
        int i14 = CreationExtras.f8054b;
        f7960a = new b();
        f7961b = new c();
        f7962c = new d();
    }

    public static final j1 a(CreationExtras creationExtras) {
        creationExtras.getClass();
        nd.e eVar = (nd.e) creationExtras.a(f7960a);
        if (eVar == null) {
            vb.h.s("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) creationExtras.a(f7961b);
        if (viewModelStoreOwner == null) {
            vb.h.s("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) creationExtras.a(f7962c);
        String str = (String) creationExtras.a(x1.f8071c);
        if (str == null) {
            vb.h.s("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        nd.c.b bVarB = eVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle2 = null;
        n1 n1Var = bVarB instanceof n1 ? (n1) bVarB : null;
        if (n1Var == null) {
            vb.h.z("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = c(viewModelStoreOwner).f7982a;
        j1 j1Var = (j1) linkedHashMap.get(str);
        if (j1Var != null) {
            return j1Var;
        }
        j1.a aVar = j1.f7943c;
        n1Var.b();
        Bundle bundle3 = n1Var.f7965c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                p13.k0.f134949a.getClass();
                bundle4 = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                n1Var.f7965c = null;
            }
            bundle2 = bundle4;
        }
        aVar.getClass();
        j1 j1VarA = j1.a.a(bundle2, bundle);
        linkedHashMap.put(str, j1VarA);
        return j1VarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends nd.e & ViewModelStoreOwner> void b(T t7) {
        t7.getClass();
        b0.b f7973d = t7.getF158016a().getF7973d();
        if (f7973d != b0.b.INITIALIZED && f7973d != b0.b.CREATED) {
            vb.h.s("Failed requirement.");
        } else if (t7.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            n1 n1Var = new n1(t7.getSavedStateRegistry(), t7);
            t7.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", n1Var);
            t7.getF158016a().a(new k1(n1Var));
        }
    }

    public static final o1 c(ViewModelStoreOwner viewModelStoreOwner) {
        x1 x1VarC = x1.b.c(x1.f8070b, viewModelStoreOwner, new a(), 4);
        return (o1) x1VarC.f8072a.a("androidx.lifecycle.internal.SavedStateHandlesVM", p005kotlin.jvm.internal.s0.f105811a.b(o1.class));
    }
}
