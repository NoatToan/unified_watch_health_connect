package f2;

import g2.z0;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.b2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf2/h;", "Lg2/f;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements g2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f68203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g0 f68204b;

    @Override // g2.f
    public final boolean a() {
        return !o().e().isEmpty();
    }

    @Override // g2.f
    public final int b(int i14) {
        int iL = l() + i14;
        List<m> listE = o().e();
        ArrayList arrayList = new ArrayList(listE.size());
        int size = listE.size();
        for (int i15 = 0; i15 < size; i15++) {
            m mVar = listE.get(i15);
            m mVar2 = mVar;
            if ((o().getF68341r() == b2.Vertical ? mVar2.getF68170w() : mVar2.getF68171x()) == iL) {
                arrayList.add(mVar);
            }
        }
        int size2 = arrayList.size();
        int iMax = 0;
        for (int i16 = 0; i16 < size2; i16++) {
            iMax = Math.max(z1.e.b((m) arrayList.get(i16), o().getF68341r()), iMax);
        }
        return iMax;
    }

    @Override // g2.f
    public final int c() {
        y yVarO = o();
        return (int) (yVarO.getF68341r() == b2.Vertical ? yVarO.a() & 4294967295L : yVarO.a() >> 32);
    }

    @Override // g2.f
    public final int d() {
        return o().getF68339p();
    }

    @Override // g2.f
    public final List<z0.b> e(int i14, e23.p<? super Integer, ? super Integer, Unit> pVar) {
        g0 g0Var = this.f68204b;
        if (g0Var != null) {
            return g0Var.a(i14, new g(pVar, i14, 0));
        }
        p005kotlin.jvm.internal.s.m("prefetchScope");
        throw null;
    }

    @Override // g2.f
    public final int f(int i14) {
        return l() + i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g2.f
    public final int g(int i14) {
        y yVarO = o();
        z zVar = yVarO instanceof z ? (z) yVarO : null;
        if (zVar == null) {
            return -1;
        }
        List<o13.p<Integer, g6.a>> listInvoke = zVar.f68334k.invoke(Integer.valueOf(i14));
        if (listInvoke.isEmpty()) {
            return -1;
        }
        return (listInvoke.size() + ((Number) ((o13.p) p13.h0.b0(listInvoke)).f128594a).intValue()) - 1;
    }

    @Override // g2.f
    public final g6.c getDensity() {
        y yVarO = o();
        z zVar = yVarO instanceof z ? (z) yVarO : null;
        if (zVar != null) {
            return zVar.f68332i;
        }
        return null;
    }

    @Override // g2.f
    public final int h() {
        int iB = o().b() + z1.e.a((m) p13.h0.b0(o().e()), o().getF68341r());
        if (iB > 0) {
            iB = 0;
        }
        return Math.abs(iB);
    }

    @Override // g2.f
    public final int i() {
        m mVar = (m) p13.h0.m0(o().e());
        return Math.abs((o().getF68343t() + (z1.e.b(mVar, o().getF68341r()) + z1.e.a(mVar, o().getF68341r()))) - o().getF68338o());
    }

    @Override // g2.f
    public final Object j(int i14) {
        Object f62570l;
        int iL = l() + i14;
        List<m> listE = o().e();
        ArrayList arrayList = new ArrayList(listE.size());
        int size = listE.size();
        for (int i15 = 0; i15 < size; i15++) {
            m mVar = listE.get(i15);
            m mVar2 = mVar;
            if ((o().getF68341r() == b2.Vertical ? mVar2.getF68170w() : mVar2.getF68171x()) == iL) {
                arrayList.add(mVar);
            }
        }
        m mVar3 = (m) p13.h0.d0(arrayList);
        return (mVar3 == null || (f62570l = mVar3.getF62570l()) == null) ? g2.g.f75116c : f62570l;
    }

    @Override // g2.f
    public final int k() {
        y yVarO = o();
        z zVar = yVarO instanceof z ? (z) yVarO : null;
        if (zVar == null || d() == 0) {
            return -1;
        }
        return zVar.f68335l.invoke(Integer.valueOf(d() - 1)).intValue();
    }

    @Override // g2.f
    public final int l() {
        m mVar = (m) p13.h0.b0(o().e());
        return o().getF68341r() == b2.Vertical ? mVar.getF68170w() : mVar.getF68171x();
    }

    @Override // g2.f
    public final int m() {
        return (n() - l()) + 1;
    }

    @Override // g2.f
    public final int n() {
        m mVar = (m) p13.h0.m0(o().e());
        return o().getF68341r() == b2.Vertical ? mVar.getF68170w() : mVar.getF68171x();
    }

    public final y o() {
        y yVar = this.f68203a;
        if (yVar != null) {
            return yVar;
        }
        p005kotlin.jvm.internal.s.m("layoutInfo");
        throw null;
    }
}
