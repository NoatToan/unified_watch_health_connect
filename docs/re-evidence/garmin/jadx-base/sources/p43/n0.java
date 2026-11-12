package p43;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n0 implements u23.a, t43.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f135892a;

    public /* synthetic */ n0(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public abstract List<t1> D0();

    public abstract k1 E0();

    public abstract m1 F0();

    public abstract boolean G0();

    public abstract n0 H0(q43.f fVar);

    public abstract f2 I0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (G0() != n0Var.G0()) {
            return false;
        }
        q43.t tVar = q43.t.f142814a;
        f2 f2VarI0 = I0();
        f2 f2VarI1 = n0Var.I0();
        tVar.getClass();
        d dVar = d.f135809a;
        q43.s sVar = q43.s.f142813a;
        dVar.getClass();
        sVar.getClass();
        return d.c(sVar, f2VarI0, f2VarI1);
    }

    @Override // u23.a
    public final u23.h getAnnotations() {
        return r.a(E0());
    }

    public final int hashCode() {
        int iHashCode;
        int i14 = this.f135892a;
        if (i14 != 0) {
            return i14;
        }
        if (o72.t.R(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (G0() ? 1 : 0) + ((D0().hashCode() + (F0().hashCode() * 31)) * 31);
        }
        this.f135892a = iHashCode;
        return iHashCode;
    }

    public abstract i43.l i();

    private n0() {
    }
}
