package gt1;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f72.t0;
import g02.h0;
import h5.e0;
import i3.mh;
import i3.ve;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;
import u1.a2;
import u1.y0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f78999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f79000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f79001d;

    public /* synthetic */ t(String str, e23.a aVar, e23.a aVar2) {
        this.f78998a = 6;
        this.f79000c = str;
        this.f78999b = aVar;
        this.f79001d = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:82:0x04cc  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f78998a;
        int i15 = 1;
        e23.a aVar = this.f79001d;
        e23.a aVar2 = this.f78999b;
        String str = this.f79000c;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    long jZ = fb1.c.z(d92.b.f58623a, mVar);
                    g6.f.a aVar3 = g6.f.f75994b;
                    ve.a(null, k2.i.a(10), jZ, 0L, 0.0f, 0.0f, null, z3.f.c(-378756484, new t(aVar2, str, aVar, i15), mVar), mVar, 12582912, 121);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97921f;
                    float f15 = eVar.f97918c;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.r.a aVar4 = h4.r.S;
                    h4.r rVarZ = c2.l.z(aVar4, f15, f15);
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(iVarI, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarZ, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    h4.r rVarF = x2.f(aVar4, 1.0f);
                    boolean zB = mVar2.B(aVar2);
                    Object objQ = mVar2.q();
                    p3.m.a aVar6 = p3.m.f135153a;
                    if (zB) {
                        objQ = new h0(aVar2, 28);
                        mVar2.K(objQ);
                    } else {
                        aVar6.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h0(aVar2, 28);
                            mVar2.K(objQ);
                        }
                    }
                    ys1.b.a(rVarF, null, (e23.a) objQ, mVar2, 6, 2);
                    t4.d dVarA = n5.c.a(2131231871, mVar2, 0);
                    String strQ = gl1.y.Q(mVar2, R.string.success_exclamation);
                    h4.r rVarA = c2.l.A(aVar4, f14, 0.0f, 2);
                    h4.g.a aVar7 = h4.d.a.f81537o;
                    y0.a(dVarA, strQ, x2.q(b0Var.b(rVarA, aVar7), wz1.b.f188181a), null, null, 0.0f, null, mVar2, 0, 120);
                    String strQ2 = gl1.y.Q(mVar2, R.string.trail_send_to_device_popup_title);
                    h4.r rVarA2 = c2.l.A(b0Var.b(aVar4, aVar7), f14, 0.0f, 2);
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97929f, mVar2), mVar2, 0, 0, 131068);
                    String strP = gl1.y.P(R.string.trail_send_to_device_popup_message, new Object[]{str}, mVar2);
                    h4.r rVarA3 = c2.l.A(b0Var.b(aVar4, aVar7), f14, 0.0f, 2);
                    d6.h.f57752b.getClass();
                    d6.h hVarA = d6.h.a(d6.h.f57755e);
                    x0 x0Var = j92.f.f97932i;
                    mh.c(strP, rVarA3, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar2), mVar2, 0, 0, 130044);
                    String strQ3 = gl1.y.Q(mVar2, R.string.common_learn_more);
                    h4.r rVarC2 = c2.l.C(c2.l.A(b0Var.b(aVar4, aVar7), f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
                    boolean zB2 = mVar2.B(aVar);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new h0(aVar, 29);
                        mVar2.K(objQ2);
                    } else {
                        aVar6.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new h0(aVar, 29);
                            mVar2.K(objQ2);
                        }
                    }
                    mh.c(strQ3, u1.w.d(rVarC2, false, null, null, (e23.a) objQ2, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var, ds.e0.e(mVar2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar2, 0, 0, 131068);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                h62.k.b(str, aVar2, aVar, (p3.m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ib0.d.c(str, aVar2, aVar, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ky0.s.a(str, aVar2, aVar, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ll0.c.a(str, aVar2, aVar, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.d(aVar8, 1.0f), vb.h.e(d92.b.f58623a, mVar3), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode2 = Long.hashCode(mVar3.getU());
                    i2 i2VarX2 = mVar3.x();
                    h4.r rVarC3 = h4.k.c(rVarE, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar9);
                    } else {
                        mVar3.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA2, mVar3);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar3);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC3, mVar3);
                    h4.r rVarA4 = b0.f22601a.a(a2.b(aVar8, a2.a(mVar3), true), 1.0f, true);
                    z zVarA3 = y.a(kVar, h4.d.a.f81537o, mVar3, 54);
                    int iHashCode3 = Long.hashCode(mVar3.getU());
                    i2 i2VarX3 = mVar3.x();
                    h4.r rVarC4 = h4.k.c(rVarA4, mVar3);
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar9);
                    } else {
                        mVar3.c();
                    }
                    b4.c(eVar2, zVarA3, mVar3);
                    b4.c(c1623g, i2VarX3, mVar3);
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar3, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC4, mVar3);
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f16 = eVar3.f97921f;
                    float f17 = eVar3.f97920e;
                    h4.r rVarA5 = c2.l.A(c2.l.C(aVar8, 0.0f, f16, 0.0f, 0.0f, 13), f17, 0.0f, 2);
                    s62.a.f157643a.getClass();
                    g02.i.a(rVarA5, t0.a(t62.c.f162799a), d92.b.a(mVar3).f().c(), fb1.c.i(gl.c.f77766a, mVar3), j92.b.f97901d.f97907f, 0.0f, null, mVar3, 0, 224);
                    h4.r rVarA6 = c2.l.A(c2.l.C(aVar8, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), f17, 0.0f, 2);
                    String strQ4 = gl1.y.Q(mVar3, R.string.train_for_an_event);
                    d92.b.f58624b.getClass();
                    mh.c(strQ4, rVarA6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar3), mVar3, 0, 0, 131068);
                    h4.r rVarA7 = c2.l.A(c2.l.C(x2.f(aVar8, 1.0f), 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13), f17, 0.0f, 2);
                    d6.h.f57752b.getClass();
                    int i16 = d6.h.f57755e;
                    String strP2 = gl1.y.P(R.string.train_for_primary_event_question, new Object[]{str}, mVar3);
                    x0 x0Var2 = j92.f.f97932i;
                    mh.c(strP2, rVarA7, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, mVar3), mVar3, 0, 0, 130044);
                    mh.c(gl1.y.Q(mVar3, R.string.select_continue_to_change_event_priority), c2.l.A(c2.l.C(x2.f(aVar8, 1.0f), 0.0f, eVar3.f97921f, 0.0f, 0.0f, 13), f17, 0.0f, 2), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, mVar3), mVar3, 0, 0, 130044);
                    mVar3.y();
                    b82.c.b(null, null, z3.f.c(713409907, new at1.f(aVar2, aVar, 28), mVar3), null, d92.b.a(mVar3).c().c(), mVar3, 384, 11);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                wv0.i.k(str, aVar2, aVar, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                y22.e.b(str, aVar2, aVar, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                yy1.a.a(str, aVar2, aVar, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                zj1.k.a(str, aVar2, aVar, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ t(e23.a aVar, String str, e23.a aVar2, int i14) {
        this.f78998a = i14;
        this.f78999b = aVar;
        this.f79000c = str;
        this.f79001d = aVar2;
    }

    public /* synthetic */ t(String str, e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f78998a = i15;
        this.f79000c = str;
        this.f78999b = aVar;
        this.f79001d = aVar2;
    }
}
