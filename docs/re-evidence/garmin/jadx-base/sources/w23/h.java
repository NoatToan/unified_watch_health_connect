package w23;

import java.util.Collection;
import java.util.List;
import p43.d2;
import p43.m1;
import t23.c1;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends p implements c1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f181601i = {p005kotlin.jvm.internal.s0.f105811a.h(new p005kotlin.jvm.internal.i0(h.class, "constructors", "getConstructors()Ljava/util/Collection;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o43.n f181602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t23.r f181603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<? extends d1> f181604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f181605h;

    public static final class a implements m1 {
        public a() {
        }

        @Override // p43.m1
        public final boolean C() {
            return true;
        }

        @Override // p43.m1
        public final Collection<p43.n0> b() {
            Collection<p43.n0> collectionB = ((n43.i0) h.this).z0().F0().b();
            collectionB.getClass();
            return collectionB;
        }

        @Override // p43.m1
        public final p005kotlin.reflect.jvm.internal.impl.builtins.d e() {
            return f43.e.e(h.this);
        }

        @Override // p43.m1
        public final List<d1> getParameters() {
            return h.this.D0();
        }

        @Override // p43.m1
        public final t23.h t() {
            return h.this;
        }

        public final String toString() {
            return "[typealias " + h.this.getName().b() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o43.n nVar, t23.l lVar, u23.h hVar, x33.f fVar, t23.y0 y0Var, t23.r rVar) {
        super(lVar, hVar, fVar, y0Var);
        nVar.getClass();
        lVar.getClass();
        hVar.getClass();
        fVar.getClass();
        y0Var.getClass();
        rVar.getClass();
        this.f181602e = nVar;
        this.f181603f = rVar;
        nVar.g(new e(this));
        this.f181605h = new a();
    }

    public abstract List<d1> D0();

    @Override // t23.l
    public final <R, D> R K(t23.n<R, D> nVar, D d14) {
        return (R) nVar.m(this, d14);
    }

    @Override // t23.z
    public final boolean O() {
        return false;
    }

    @Override // w23.p
    /* JADX INFO: renamed from: T */
    public final t23.m a() {
        return this;
    }

    @Override // w23.p, w23.o, t23.l
    public final t23.h a() {
        return this;
    }

    @Override // w23.p, w23.o, t23.l
    public final t23.l a() {
        return this;
    }

    @Override // t23.z, t23.o
    public final t23.r getVisibility() {
        return this.f181603f;
    }

    @Override // t23.h
    public final m1 h() {
        return this.f181605h;
    }

    @Override // t23.z
    public final boolean isExternal() {
        return false;
    }

    @Override // t23.i
    public final boolean l() {
        return d2.d(((n43.i0) this).z0(), new f(this), null);
    }

    @Override // t23.i
    public final List<d1> q() {
        List list = this.f181604g;
        if (list != null) {
            return list;
        }
        p005kotlin.jvm.internal.s.m("declaredTypeParametersImpl");
        throw null;
    }

    @Override // t23.z
    public final boolean q0() {
        return false;
    }

    @Override // w23.o
    public final String toString() {
        return "typealias " + getName().b();
    }
}
