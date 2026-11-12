package androidx.lifecycle;

import java.util.HashSet;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/z;", "", "<init>", "()V", "a", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f8081a = new z();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/z$a;", "Lnd/c$a;", "<init>", "()V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements nd.c.a {
        @Override // nd.c.a
        public final void a(nd.e eVar) {
            if (!(eVar instanceof ViewModelStoreOwner)) {
                o2.c.s(eVar, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                return;
            }
            y1 viewModelStore = ((ViewModelStoreOwner) eVar).getViewModelStore();
            nd.c savedStateRegistry = eVar.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.f8080a;
            for (String str : new HashSet(linkedHashMap.keySet())) {
                str.getClass();
                u1 u1Var = (u1) linkedHashMap.get(str);
                if (u1Var != null) {
                    z.a(u1Var, savedStateRegistry, eVar.getF158016a());
                }
            }
            if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.d();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/z$b", "Landroidx/lifecycle/k0;", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f8082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ nd.c f8083b;

        public b(b0 b0Var, nd.c cVar) {
            this.f8082a = b0Var;
            this.f8083b = cVar;
        }

        @Override // androidx.lifecycle.k0
        public final void onStateChanged(n0 n0Var, b0.a aVar) {
            if (aVar == b0.a.ON_START) {
                this.f8082a.d(this);
                this.f8083b.d();
            }
        }
    }

    private z() {
    }

    public static final void a(u1 u1Var, nd.c cVar, b0 b0Var) {
        cVar.getClass();
        b0Var.getClass();
        l1 l1Var = (l1) u1Var.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (l1Var == null || l1Var.f7958c) {
            return;
        }
        l1Var.a(b0Var, cVar);
        f8081a.getClass();
        b(b0Var, cVar);
    }

    public static void b(b0 b0Var, nd.c cVar) {
        b0.b f7973d = b0Var.getF7973d();
        if (f7973d == b0.b.INITIALIZED || f7973d.a(b0.b.STARTED)) {
            cVar.d();
        } else {
            b0Var.a(new b(b0Var, cVar));
        }
    }
}
