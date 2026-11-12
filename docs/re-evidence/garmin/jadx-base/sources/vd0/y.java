package vd0;

import c2.q2;
import c2.s2;
import c2.u2;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177430a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pe0.i f177431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l22.a f177432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f177433d;

    public /* synthetic */ y(int i14, l22.a aVar, pe0.i iVar, boolean z14) {
        this.f177431b = iVar;
        this.f177432c = aVar;
        this.f177433d = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f177430a;
        boolean z14 = this.f177433d;
        l22.a aVar = this.f177432c;
        pe0.i iVar = this.f177431b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97917b;
                    float f15 = eVar.f97918c;
                    float f16 = eVar.f97920e;
                    h4.r rVarA = c2.l.A(aVar2, 0.0f, f14, 1);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarA, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r rVarZ = c2.l.z(aVar2, f16, f15);
                    s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar, 0);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarZ, mVar);
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, s2VarA, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, mVar);
                    u2 u2Var = u2.f22900a;
                    c22.x0.f23314a.getClass();
                    String strW = gl1.d.W(c22.x0.Z7);
                    d92.b.f58624b.getClass();
                    mh.c(strW, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar), mVar, 0, 0, 131070);
                    mVar.y();
                    l72.x0 x0Var = l72.x0.f111346a;
                    h4.r rVarZ2 = c2.l.z(aVar2, f16, f15);
                    int i15 = 0;
                    z3.e eVarC = z3.f.c(2082111254, new z(i15, aVar, iVar, z14), mVar);
                    int i16 = (l72.x0.f111348c << 6) | 48;
                    x0Var.e(rVarZ2, eVarC, mVar, i16, 0);
                    x0Var.e(c2.l.z(aVar2, f16, f15), z3.f.c(628147853, new a0(aVar, iVar, i15), mVar), mVar, i16, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                b1.b(iVar, aVar, z14, (p3.m) obj, p3.p0.t(449));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ y(l22.a aVar, pe0.i iVar, boolean z14) {
        this.f177432c = aVar;
        this.f177431b = iVar;
        this.f177433d = z14;
    }
}
