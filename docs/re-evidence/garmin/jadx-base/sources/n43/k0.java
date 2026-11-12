package n43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l43.p0;
import l43.x0;
import lc.u0;
import p43.g2;
import p43.n0;
import t23.b1;
import t23.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends w23.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l43.p f123647k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s33.u f123648l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f123649m;

    /* JADX WARN: Illegal instructions before constructor call */
    public k0(l43.p pVar, s33.u uVar, int i14) {
        g2 g2Var;
        pVar.getClass();
        uVar.getClass();
        l43.n nVar = pVar.f110085a;
        o43.n nVar2 = nVar.f110051a;
        t23.l lVar = pVar.f110087c;
        u23.h.f168226x0.getClass();
        u23.h.a.C3153a c3153a = u23.h.a.f168228b;
        x33.f fVarD = x33.f.d(pVar.f110086b.getString(uVar.f156938e));
        p0 p0Var = p0.f110094a;
        s33.u.c cVar = uVar.f156940g;
        cVar.getClass();
        p0Var.getClass();
        int i15 = p0.a.f110097c[cVar.ordinal()];
        if (i15 == 1) {
            g2Var = g2.IN_VARIANCE;
        } else if (i15 == 2) {
            g2Var = g2.OUT_VARIANCE;
        } else {
            if (i15 != 3) {
                u0.r();
                throw null;
            }
            g2Var = g2.INVARIANT;
        }
        super(nVar2, lVar, c3153a, fVarD, g2Var, uVar.f156939f, i14, y0.f162076a, b1.a.f161998a);
        this.f123647k = pVar;
        this.f123648l = uVar;
        this.f123649m = new a(nVar.f110051a, new j0(this));
    }

    @Override // w23.i
    public final void E0(n0 n0Var) {
        n0Var.getClass();
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    @Override // w23.i
    public final List<n0> F0() {
        l43.p pVar = this.f123647k;
        List<s33.s> listM = u33.g.m(this.f123648l, pVar.f110088d);
        if (listM.isEmpty()) {
            return p13.w.c(f43.e.e(this).n());
        }
        x0 x0Var = pVar.f110092h;
        ArrayList arrayList = new ArrayList(p13.y.r(listM, 10));
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(x0Var.g((s33.s) it.next()));
        }
        return arrayList;
    }

    @Override // u23.b, u23.a
    public final u23.h getAnnotations() {
        return this.f123649m;
    }
}
