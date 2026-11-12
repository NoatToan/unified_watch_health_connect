package j21;

import c2.u;
import c2.x2;
import f5.z0;
import i3.i7;
import o4.e0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import u1.y0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u4.d f96707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f96708c;

    public /* synthetic */ r(u4.d dVar, long j8, int i14) {
        this.f96706a = 2;
        this.f96707b = dVar;
        this.f96708c = j8;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f96706a;
        long j8 = this.f96708c;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    mVar.C(1961000618);
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    y0.b(this.f96707b, "", x2.q(c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), eVar.f97920e), e0.a.a(e0.f128843b, j8), mVar, 48, 56);
                    mVar.f();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    i7.b(this.f96707b, null, null, this.f96708c, mVar2, 48, 4);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                oo0.h.f(this.f96707b, j8, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    g6.f.a aVar3 = g6.f.f75994b;
                    h4.r rVarQ = x2.q(u1.n.e(aVar2, d92.b.a(mVar3).e().g(), k2.i.f102406a), 48);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    h4.r rVarC = h4.k.c(rVarQ, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar4);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                    float f14 = 24;
                    i7.b(this.f96707b, null, u.f22885a.c(x2.u(x2.h(aVar2, f14), f14), h4.d.a.f81528f), this.f96708c, mVar3, 48, 0);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ r(u4.d dVar, long j8, int i14, byte b14) {
        this.f96706a = i14;
        this.f96707b = dVar;
        this.f96708c = j8;
    }
}
