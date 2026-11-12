package au0;

import c2.x2;
import i3.mh;
import i3.ve;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f12959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f12962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f12963f;

    public /* synthetic */ l0(m0 m0Var, String str, String str2, String str3, String str4, int i14) {
        this.f12958a = i14;
        this.f12959b = m0Var;
        this.f12960c = str;
        this.f12961d = str2;
        this.f12962e = str3;
        this.f12963f = str4;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12958a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m0.b bVar = m0.f12967d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    k2.h hVarA = k2.i.a(j92.b.f97900c.f97911c);
                    long jC = com.nimbusds.jose.shaded.gson.internal.a.c(mVar);
                    i3.a.f87402a.getClass();
                    ve.a(null, hVarA, jC, 0L, i3.a.f87403b, 0.0f, null, z3.f.c(1364016637, new l0(this.f12959b, this.f12960c, this.f12961d, this.f12962e, this.f12963f, 1), mVar), mVar, 12582912, 105);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m0.b bVar2 = m0.f12967d;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarF = x2.f(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarC = c2.l.C(rVarF, 0.0f, eVar.f97921f, 0.0f, eVar.f97918c, 5);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar2 = h4.d.a.f81536n;
                    c2.z zVarA = c2.y.a(kVar, aVar2, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar3);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar2);
                    h4.r rVarA = c2.l.A(c2.b0.f22601a.a(aVar, 1.0f, false), eVar.f97921f, 0.0f, 2);
                    c2.z zVarA2 = c2.y.a(kVar, aVar2, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC3 = h4.k.c(rVarA, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar2, zVarA2, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar3);
                    }
                    b4.c(fVar, rVarC3, mVar2);
                    String str = this.f12962e;
                    str.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131070);
                    String str2 = this.f12963f;
                    str2.getClass();
                    mh.c(str2, c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131068);
                    mVar2.y();
                    String str3 = this.f12960c;
                    str3.getClass();
                    String str4 = this.f12961d;
                    str4.getClass();
                    this.f12959b.w6(str3, str4, mVar2, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
