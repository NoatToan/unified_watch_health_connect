package c2;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc2/s;", "Lf5/z0;", "Lh4/d;", "alignment", "", "propagateMinConstraints", "<init>", "(Lh4/d;Z)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class s implements f5.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.d f22864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22865b;

    public s(h4.d dVar, boolean z14) {
        this.f22864a = dVar;
        this.f22865b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.f22864a, sVar.f22864a) && this.f22865b == sVar.f22865b;
    }

    @Override // f5.z0
    public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
        long j14;
        int iL;
        int iK;
        f5.v1 v1VarQ;
        if (list.isEmpty()) {
            return f5.b1.h0(b1Var, g6.a.l(j8), g6.a.k(j8), new bt1.s(24));
        }
        if (this.f22865b) {
            j14 = j8;
        } else {
            j14 = j8 & (-8589934589L);
            g6.a.C1525a c1525a = g6.a.f75987b;
        }
        if (list.size() == 1) {
            f5.y0 y0Var = list.get(0);
            p1.t0<h4.d, f5.z0> t0Var = q.f22829a;
            Object f81969t = y0Var.getF81969t();
            o oVar = f81969t instanceof o ? (o) f81969t : null;
            if (oVar != null ? oVar.f22790b : false) {
                iL = g6.a.l(j8);
                iK = g6.a.k(j8);
                g6.a.C1525a c1525a2 = g6.a.f75987b;
                int iL2 = g6.a.l(j8);
                int iK2 = g6.a.k(j8);
                c1525a2.getClass();
                v1VarQ = y0Var.Q(g6.a.C1525a.c(iL2, iK2));
            } else {
                v1VarQ = y0Var.Q(j14);
                iL = Math.max(g6.a.l(j8), v1VarQ.f69144a);
                iK = Math.max(g6.a.k(j8), v1VarQ.f69145b);
            }
            int i14 = iK;
            int i15 = iL;
            return f5.b1.h0(b1Var, i15, i14, new r(v1VarQ, y0Var, b1Var, i15, i14, this));
        }
        f5.v1[] v1VarArr = new f5.v1[list.size()];
        p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
        p0Var.f105807a = g6.a.l(j8);
        p005kotlin.jvm.internal.p0 p0Var2 = new p005kotlin.jvm.internal.p0();
        p0Var2.f105807a = g6.a.k(j8);
        int size = list.size();
        boolean z14 = false;
        for (int i16 = 0; i16 < size; i16++) {
            f5.y0 y0Var2 = list.get(i16);
            p1.t0<h4.d, f5.z0> t0Var2 = q.f22829a;
            Object f81969t2 = y0Var2.getF81969t();
            o oVar2 = f81969t2 instanceof o ? (o) f81969t2 : null;
            if (oVar2 != null ? oVar2.f22790b : false) {
                z14 = true;
            } else {
                f5.v1 v1VarQ2 = y0Var2.Q(j14);
                v1VarArr[i16] = v1VarQ2;
                p0Var.f105807a = Math.max(p0Var.f105807a, v1VarQ2.f69144a);
                p0Var2.f105807a = Math.max(p0Var2.f105807a, v1VarQ2.f69145b);
            }
        }
        if (z14) {
            int i17 = p0Var.f105807a;
            int i18 = i17 != Integer.MAX_VALUE ? i17 : 0;
            int i19 = p0Var2.f105807a;
            long jA = g6.b.a(i18, i17, i19 != Integer.MAX_VALUE ? i19 : 0, i19);
            int size2 = list.size();
            for (int i24 = 0; i24 < size2; i24++) {
                f5.y0 y0Var3 = list.get(i24);
                p1.t0<h4.d, f5.z0> t0Var3 = q.f22829a;
                Object f81969t3 = y0Var3.getF81969t();
                o oVar3 = f81969t3 instanceof o ? (o) f81969t3 : null;
                if (oVar3 != null ? oVar3.f22790b : false) {
                    v1VarArr[i24] = y0Var3.Q(jA);
                }
            }
        }
        return f5.b1.h0(b1Var, p0Var.f105807a, p0Var2.f105807a, new aa2.p(v1VarArr, list, b1Var, p0Var, p0Var2, this, 2));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22865b) + (this.f22864a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb3.append(this.f22864a);
        sb3.append(", propagateMinConstraints=");
        return am.j.t(sb3, this.f22865b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
