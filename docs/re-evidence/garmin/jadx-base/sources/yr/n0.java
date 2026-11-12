package yr;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198888a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nr.g.q.b f198889b;

    /* JADX WARN: Code duplicated, block: B:51:0x0255  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f198888a;
        nr.g.q.b bVar = this.f198889b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar2 = h4.d.a.f81536n;
                    c2.z zVarA = c2.y.a(kVar, aVar2, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(aVar, mVar);
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
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    float f14 = 16;
                    g6.f.a aVar4 = g6.f.f75994b;
                    h4.r rVarY = c2.l.y(aVar, f14);
                    s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, mVar, 48);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarY, mVar);
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
                    b4.c(eVar, s2VarA, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, mVar);
                    u2 u2Var = u2.f22900a;
                    u1.y0.a(n5.c.a(R.drawable.shotview_app_icon, mVar, 0), gl1.y.Q(mVar, R.string.shotview_app_title), x2.q(aVar, wz1.b.f188181a), null, null, 0.0f, null, mVar, 0, 120);
                    h4.r rVarA = u2Var.a(aVar, 1.0f, true);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97920e;
                    h4.r rVarC3 = c2.l.C(rVarA, f15, 0.0f, f15, 0.0f, 10);
                    c2.z zVarA2 = c2.y.a(kVar, aVar2, mVar, 0);
                    int iHashCode3 = Long.hashCode(mVar.getU());
                    i2 i2VarX3 = mVar.x();
                    h4.r rVarC4 = h4.k.c(rVarC3, mVar);
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
                    b4.c(eVar, zVarA2, mVar);
                    b4.c(c1623g, i2VarX3, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC4, mVar);
                    String strQ = gl1.y.Q(mVar, R.string.shotview_app_title);
                    d92.b.f58624b.getClass();
                    mh.c(strQ, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, 8, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar), mVar, 48, 0, 131068);
                    mh.c(gl1.y.Q(mVar, R.string.shotview_app_promo_card_app_not_installed_subtitle), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar), mVar, 0, 0, 131070);
                    mVar.y();
                    mVar.y();
                    t4.d dVarA = n5.c.a(bVar.f127118a, mVar, 0);
                    h4.r rVarB = b0Var.b(c2.l.y(aVar, f14), h4.d.a.f81537o);
                    boolean zB = mVar.B(bVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new o0(bVar, 0);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new o0(bVar, 0);
                            mVar.K(objQ);
                        }
                    }
                    u1.y0.a(dVarA, null, u1.w.d(rVarB, false, null, null, (e23.a) objQ, 15), null, null, 0.0f, null, mVar, 48, 120);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                p0.b(bVar, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
        }
    }
}
