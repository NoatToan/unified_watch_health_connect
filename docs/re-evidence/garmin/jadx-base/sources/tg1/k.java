package tg1;

import c2.b0;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import f5.z0;
import h5.e0;
import i3.mh;
import i3.ve;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import u1.y0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sg1.b f164525b;

    public /* synthetic */ k(sg1.b bVar, int i14) {
        this.f164524a = i14;
        this.f164525b = bVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f164524a;
        sg1.b bVar = this.f164525b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    ve.a(null, null, vb.h.e(d92.b.f58623a, mVar), 0L, 0.0f, 0.0f, null, z3.f.c(-1782998189, new k(bVar, i15), mVar), mVar, 12582912, 123);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarD = x2.d(aVar, 1.0f);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarD, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar2);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    f.a(u.f22885a.c(x2.f(aVar, 1.0f), h4.d.a.f81528f), bVar, mVar2, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    long jG = d92.b.a(mVar3).c().g();
                    g6.f.a aVar3 = g6.f.f75994b;
                    ve.a(null, k2.i.a(10), jG, 0L, 0.0f, 0.0f, null, z3.f.c(1388007827, new k(bVar, 3), mVar3), mVar3, 12582912, 121);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode2 = Long.hashCode(mVar4.getU());
                    i2 i2VarX2 = mVar4.x();
                    h4.r rVarC2 = h4.k.c(aVar4, mVar4);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar5);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                    b0 b0Var = b0.f22601a;
                    t4.d dVarA = n5.c.a(2131231871, mVar4, 0);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97921f;
                    h4.r rVarY = c2.l.y(aVar4, f14);
                    h4.g.a aVar6 = h4.d.a.f81537o;
                    y0.a(dVarA, "", b0Var.b(rVarY, aVar6), null, null, 0.0f, null, mVar4, 48, 120);
                    String str = bVar.f159200j;
                    d6.h.f57752b.getClass();
                    int i16 = d6.h.f57755e;
                    d92.b.f58624b.getClass();
                    mh.c(str, b0Var.b(c2.l.B(aVar4, f14, eVar.f97918c, f14, f14), aVar6), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar4), mVar4, 0, 0, 130044);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    String str2 = bVar.f159199i;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar5), mVar5, 0, 0, 131070);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
        }
    }
}
