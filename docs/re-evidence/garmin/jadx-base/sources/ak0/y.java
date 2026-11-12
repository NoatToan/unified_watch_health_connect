package ak0;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.mh;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f3690b;

    public /* synthetic */ y(u uVar, int i14) {
        this.f3689a = i14;
        this.f3690b = uVar;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0227  */
    /* JADX WARN: Code duplicated, block: B:64:0x0287  */
    /* JADX WARN: Code duplicated, block: B:65:0x0292  */
    /* JADX WARN: Code duplicated, block: B:67:0x0296  */
    /* JADX WARN: Code duplicated, block: B:68:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x02da  */
    /* JADX WARN: Code duplicated, block: B:79:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x0315  */
    /* JADX WARN: Code duplicated, block: B:88:0x0332  */
    /* JADX WARN: Code duplicated, block: B:90:0x0368  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        int i15;
        String strH;
        Object objQ;
        p3.m.a.C2565a c2565a;
        com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.d dVar;
        int i16;
        String strP;
        com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.b bVar;
        int i17;
        long jD;
        Object objQ2;
        int i18 = this.f3689a;
        u uVar = this.f3690b;
        switch (i18) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), vb.h.e(d92.b.f58623a, mVar), m1.f128891a);
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97921f;
                    float f15 = eVar.f97920e;
                    h4.r rVarB = c2.l.B(rVarE, f15, f14, f15, f15);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarB, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    zx2.a aVar3 = uVar.f3679a;
                    com.garmin.android.apps.connectmobile.gcplus.presentation.home.j jVar = uVar.f3683e;
                    int i19 = com.garmin.android.apps.connectmobile.gcplus.presentation.home.d.b.f35406a[aVar3.ordinal()];
                    if (i19 != 1) {
                        if (i19 == 2) {
                            i14 = -473862529;
                            i15 = R.string.lbl_monthly_subscription;
                        } else {
                            if (i19 != 3) {
                                throw n23.j.m(mVar, -473867641);
                            }
                            mVar.C(-1804735947);
                            mVar.f();
                            strH = "";
                        }
                        String strP2 = gl1.y.P(R.string.string_space_string_pattern, new Object[]{gl1.y.Q(mVar, R.string.lbl_garmin_connect_plus), strH}, mVar);
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), mVar);
                        objQ = mVar.q();
                        p3.m.f135153a.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new a81.m(20);
                            mVar.K(objQ);
                        }
                        mh.c(strP2, p5.v.c((e23.l) objQ, aVar, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 131068);
                        c2.l.f(x2.h(aVar, eVar.f97917b), mVar);
                        if (jVar instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.c) {
                            strP = sn.a.h(mVar, -1598107649, R.string.activation_in_progress, mVar);
                        } else if (jVar instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.a) {
                            mVar.C(-1597987183);
                            strP = gl1.y.P(R.string.msg_subscription_expires_on_date_due_to_billing_issue, new Object[]{((com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.a) jVar).f35494a}, mVar);
                            mVar.f();
                        } else if (jVar instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.b) {
                            mVar.C(-1597820837);
                            bVar = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.b) jVar;
                            if (bVar.f35495a) {
                                i17 = R.string.msg_free_trial_ends_and_becomes_paid_subscription;
                            } else {
                                i17 = R.string.msg_free_trial_ends_on_date;
                            }
                            strP = gl1.y.P(i17, new Object[]{bVar.f35496b}, mVar);
                            mVar.f();
                        } else {
                            if (jVar instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.d) {
                                throw n23.j.m(mVar, -1437026322);
                            }
                            mVar.C(-1597483960);
                            dVar = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.d) jVar;
                            if (dVar.f35498a) {
                                i16 = R.string.msg_subscription_renews_on_date;
                            } else {
                                i16 = R.string.msg_subscription_expires_on_date;
                            }
                            strP = gl1.y.P(i16, new Object[]{dVar.f35499b}, mVar);
                            mVar.f();
                        }
                        if (jVar instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.a) {
                            mVar.C(-1842200697);
                            jD = d92.b.a(mVar).k().e();
                            mVar.f();
                        } else {
                            mVar.C(-1842155995);
                            jD = d92.b.a(mVar).k().d();
                            mVar.f();
                        }
                        x0 x0Var = j92.f.f97933j;
                        objQ2 = mVar.q();
                        if (objQ2 == c2565a) {
                            objQ2 = new a81.m(21);
                            mVar.K(objQ2);
                        }
                        mh.c(strP, p5.v.c((e23.l) objQ2, aVar, false), jD, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar, 0, 0, 131064);
                        mVar.y();
                    } else {
                        i14 = -473865639;
                        i15 = R.string.lbl_annual_subscription;
                    }
                    strH = sn.a.h(mVar, i14, i15, mVar);
                    String strP3 = gl1.y.P(R.string.string_space_string_pattern, new Object[]{gl1.y.Q(mVar, R.string.lbl_garmin_connect_plus), strH}, mVar);
                    d92.b.f58624b.getClass();
                    x0 x0VarB2 = d92.c.b(d92.c.e(j92.f.f97931h), mVar);
                    objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new a81.m(20);
                        mVar.K(objQ);
                    }
                    mh.c(strP3, p5.v.c((e23.l) objQ, aVar, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar, 0, 0, 131068);
                    c2.l.f(x2.h(aVar, eVar.f97917b), mVar);
                    if (jVar instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.c) {
                        strP = sn.a.h(mVar, -1598107649, R.string.activation_in_progress, mVar);
                    } else if (jVar instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.a) {
                        mVar.C(-1597987183);
                        strP = gl1.y.P(R.string.msg_subscription_expires_on_date_due_to_billing_issue, new Object[]{((com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.a) jVar).f35494a}, mVar);
                        mVar.f();
                    } else if (jVar instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.b) {
                        mVar.C(-1597820837);
                        bVar = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.b) jVar;
                        if (bVar.f35495a) {
                            i17 = R.string.msg_free_trial_ends_and_becomes_paid_subscription;
                        } else {
                            i17 = R.string.msg_free_trial_ends_on_date;
                        }
                        strP = gl1.y.P(i17, new Object[]{bVar.f35496b}, mVar);
                        mVar.f();
                    } else {
                        if (jVar instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.d) {
                            throw n23.j.m(mVar, -1437026322);
                        }
                        mVar.C(-1597483960);
                        dVar = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.d) jVar;
                        if (dVar.f35498a) {
                            i16 = R.string.msg_subscription_renews_on_date;
                        } else {
                            i16 = R.string.msg_subscription_expires_on_date;
                        }
                        strP = gl1.y.P(i16, new Object[]{dVar.f35499b}, mVar);
                        mVar.f();
                    }
                    if (jVar instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.a) {
                        mVar.C(-1842200697);
                        jD = d92.b.a(mVar).k().e();
                        mVar.f();
                    } else {
                        mVar.C(-1842155995);
                        jD = d92.b.a(mVar).k().d();
                        mVar.f();
                    }
                    x0 x0Var2 = j92.f.f97933j;
                    objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new a81.m(21);
                        mVar.K(objQ2);
                    }
                    mh.c(strP, p5.v.c((e23.l) objQ2, aVar, false), jD, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, mVar, 0, 0, 131064);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar3 = h4.d.a.f81534l;
                    c2.j jVar2 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f16 = j92.b.f97899b.f97920e;
                    jVar2.getClass();
                    c2.j.i iVarI = c2.j.i(f16);
                    h4.r.a aVar4 = h4.r.S;
                    s2 s2VarA = q2.a(iVarI, bVar3, mVar2, 48);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(aVar4, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
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
                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    u2 u2Var = u2.f22900a;
                    if (uVar.f3683e instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.j.a) {
                        mVar2.C(-1677614484);
                        i7.a(n5.c.a(R.drawable.ic_exclamation, mVar2, 0), null, u1.n.e(l4.k.b(x2.q(aVar4, j92.b.f97901d.f97903b), k2.i.f102406a), d92.b.a(mVar2).f().f(), m1.f128891a), 0L, mVar2, 48, 8);
                        mVar2.f();
                    } else {
                        mVar2.C(-1677205377);
                        mVar2.f();
                    }
                    i7.a(n5.c.a(R.drawable.exterior_link, mVar2, 0), null, x2.q(aVar4, j92.b.f97901d.f97903b), sn.a.b(mVar2), mVar2, 48, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
