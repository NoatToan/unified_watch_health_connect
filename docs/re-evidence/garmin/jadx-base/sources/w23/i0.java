package w23;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import p005kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends o implements t23.c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o43.n f181621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005kotlin.reflect.jvm.internal.impl.builtins.d f181622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<t23.b0<?>, Object> f181623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l0 f181624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f181625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t23.i0 f181626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f181627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o43.h<x33.c, t23.n0> f181628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o13.t f181629k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(x33.f fVar, o43.n nVar, p005kotlin.reflect.jvm.internal.impl.builtins.d dVar, y33.a aVar, Map<t23.b0<?>, ? extends Object> map, x33.f fVar2) {
        super(u23.h.a.f168228b, fVar);
        fVar.getClass();
        nVar.getClass();
        dVar.getClass();
        map.getClass();
        u23.h.f168226x0.getClass();
        this.f181621c = nVar;
        this.f181622d = dVar;
        if (!fVar.f188606b) {
            com.google.firebase.messaging.l.j(fVar, "Module name must be special: ");
            throw null;
        }
        this.f181623e = map;
        l0.f181644a.getClass();
        l0 l0Var = (l0) A(l0.a.f181646b);
        this.f181624f = l0Var == null ? l0.b.f181647b : l0Var;
        this.f181627i = true;
        this.f181628j = nVar.e(new g0(this));
        this.f181629k = o13.m.b(new h0(this));
    }

    @Override // t23.c0
    public final <T> T A(t23.b0<T> b0Var) {
        b0Var.getClass();
        T t7 = (T) this.f181623e.get(b0Var);
        if (t7 == null) {
            return null;
        }
        return t7;
    }

    @Override // t23.c0
    public final List<t23.c0> B() {
        f0 f0Var = this.f181625g;
        if (f0Var != null) {
            return f0Var.f181597c;
        }
        String str = getName().f188605a;
        str.getClass();
        p6.b.o("Dependencies of module ", str, " were not set");
        return null;
    }

    @Override // t23.c0
    public final boolean D(t23.c0 c0Var) {
        c0Var.getClass();
        if (equals(c0Var)) {
            return true;
        }
        f0 f0Var = this.f181625g;
        f0Var.getClass();
        return p13.h0.R(f0Var.f181596b, c0Var) || B().contains(c0Var) || c0Var.B().contains(this);
    }

    @Override // t23.l
    public final <R, D> R K(t23.n<R, D> nVar, D d14) {
        return (R) nVar.h(this, d14);
    }

    public final void T() {
        if (this.f181627i) {
            return;
        }
        t23.y yVar = (t23.y) A(t23.x.f162075a);
        if (yVar != null) {
            yVar.a();
        } else {
            throw new InvalidModuleException("Accessing invalid module descriptor " + this);
        }
    }

    @Override // t23.l
    public final /* bridge */ t23.l d() {
        return null;
    }

    @Override // t23.c0
    public final t23.n0 d0(x33.c cVar) {
        cVar.getClass();
        T();
        return (t23.n0) ((o43.e.k) this.f181628j).invoke(cVar);
    }

    @Override // t23.c0
    public final p005kotlin.reflect.jvm.internal.impl.builtins.d e() {
        return this.f181622d;
    }

    @Override // t23.c0
    public final Collection<x33.c> j(x33.c cVar, e23.l<? super x33.f, Boolean> lVar) {
        cVar.getClass();
        lVar.getClass();
        T();
        T();
        return ((n) this.f181629k.getValue()).j(cVar, lVar);
    }

    @Override // w23.o
    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(o.N(this));
        if (!this.f181627i) {
            sb3.append(" !isValid");
        }
        sb3.append(" packageFragmentProvider: ");
        t23.i0 i0Var = this.f181626h;
        sb3.append(i0Var != null ? i0Var.getClass().getSimpleName() : null);
        return sb3.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i0(x33.f fVar, o43.n nVar, p005kotlin.reflect.jvm.internal.impl.builtins.d dVar, y33.a aVar) {
        this(fVar, nVar, dVar, aVar, null, null, 48, null);
        fVar.getClass();
        nVar.getClass();
        dVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i0(x33.f fVar, o43.n nVar, p005kotlin.reflect.jvm.internal.impl.builtins.d dVar, y33.a aVar, Map map, x33.f fVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        aVar = (i14 & 8) != 0 ? null : aVar;
        if ((i14 & 16) != 0) {
            map = p13.k0.f134949a;
            map.getClass();
        }
        this(fVar, nVar, dVar, aVar, map, (i14 & 32) != 0 ? null : fVar2);
    }
}
