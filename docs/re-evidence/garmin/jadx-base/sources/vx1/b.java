package vx1;

import android.content.Context;
import b5.a0;
import b63.u;
import b82.k1;
import c2.k3;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import e23.l;
import e23.p;
import e23.q;
import f5.z0;
import gl1.y;
import h2.j0;
import h5.e0;
import h82.r;
import i3.mc;
import i3.mh;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
import k23.g;
import ky0.w;
import l72.b2;
import l72.c2;
import l72.f0;
import l72.h3;
import l72.i3;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q0;
import p005kotlin.jvm.internal.s;
import p006l2.l1;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import sl1.h;
import sz1.t;
import ta0.j;
import ty1.g2;
import u82.f;
import v62.q6;
import vz1.k;
import w51.h0;
import w51.v;
import z10.l0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f180651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f180652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f180653d;

    public /* synthetic */ b(Object obj, int i14, Object obj2, Object obj3) {
        this.f180650a = i14;
        this.f180651b = obj;
        this.f180652c = obj2;
        this.f180653d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0390  */
    /* JADX WARN: Code duplicated, block: B:123:0x041c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0549  */
    /* JADX WARN: Code duplicated, block: B:15:0x0085  */
    /* JADX WARN: Code duplicated, block: B:206:0x0771  */
    /* JADX WARN: Code duplicated, block: B:227:0x0869  */
    /* JADX WARN: Code duplicated, block: B:232:0x0893  */
    /* JADX WARN: Code duplicated, block: B:248:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:296:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:313:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:331:0x0a99  */
    /* JADX WARN: Code duplicated, block: B:355:0x0b2b  */
    /* JADX WARN: Code duplicated, block: B:46:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x0244  */
    /* JADX WARN: Code duplicated, block: B:74:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:88:0x0321  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        o82.a aVar;
        p1 p1VarC;
        f fVar;
        i53.c cVarB;
        int i14 = this.f180650a;
        int i15 = 25;
        int i16 = 28;
        int i17 = 22;
        m.a aVar2 = m.f135153a;
        boolean z14 = false;
        final int i18 = 1;
        Object obj3 = this.f180653d;
        Object obj4 = this.f180652c;
        Object obj5 = this.f180651b;
        switch (i14) {
            case 0:
                r rVar = (r) obj5;
                Context context = (Context) obj4;
                d dVar = (d) obj3;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i19 = d.f180657g;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    boolean zR = mVar.r(context) | mVar.r(dVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new c(context, dVar);
                        mVar.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new c(context, dVar);
                            mVar.K(objQ);
                        }
                    }
                    rVar.B(R.string.lbl_stp_set_benchmarks_help_learn_more_about_benchmark_exercises, null, false, (e23.a) objQ, mVar, 0, 6);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                MoreActivity moreActivity = (MoreActivity) obj5;
                p1 p1Var = (p1) obj4;
                p1 p1Var2 = (p1) obj3;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i24 = MoreActivity.f39378g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        moreActivity.checkConsentBannerStatus(l0.APP_SETTINGS, R.string.msg_consent_feature_unavailability);
                    } else {
                        moreActivity.hideConsentBanner();
                    }
                    ty0.b bVar = (ty0.b) moreActivity.f39379e.getValue();
                    boolean zR2 = mVar2.r(moreActivity);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new vu1.b(moreActivity, 3);
                        mVar2.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new vu1.b(moreActivity, 3);
                            mVar2.K(objQ2);
                        }
                    }
                    l lVar = (l) objQ2;
                    Object objQ3 = mVar2.q();
                    aVar2.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = new vd0.d(p1Var, 11);
                        mVar2.K(objQ3);
                    }
                    l lVar2 = (l) objQ3;
                    Object objQ4 = mVar2.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new vd0.d(p1Var2, 12);
                        mVar2.K(objQ4);
                    }
                    l lVar3 = (l) objQ4;
                    boolean zR3 = mVar2.r(moreActivity);
                    Object objQ5 = mVar2.q();
                    if (zR3 || objQ5 == c2565a) {
                        objQ5 = new vy0.f(moreActivity, i18);
                        mVar2.K(objQ5);
                    }
                    com.garmin.android.apps.connectmobile.navigation.more.c.a(bVar, lVar, lVar2, lVar3, (e23.a) objQ5, mVar2, 3456);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                String str = (String) obj5;
                i3 i3Var = (i3) obj4;
                l lVar4 = (l) obj3;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    if (str.length() == 0) {
                        return Unit.INSTANCE;
                    }
                    i53.f fVarA = i53.a.a(i3Var);
                    boolean zB = mVar3.B(lVar4);
                    Object objQ6 = mVar3.q();
                    if (zB) {
                        objQ6 = new j(lVar4, i17);
                        mVar3.K(objQ6);
                    } else {
                        aVar2.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new j(lVar4, i17);
                            mVar3.K(objQ6);
                        }
                    }
                    h3.a(null, fVarA, null, null, (l) objQ6, mVar3, 3520);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p2 p2Var = (p2) obj5;
                g41.a aVar3 = (g41.a) obj4;
                x3 x3Var = (x3) obj3;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    y31.a aVar4 = ((o41.b) x3Var.getF182175a()).f129072a;
                    boolean zR4 = mVar4.r(p2Var) | mVar4.r(aVar3);
                    Object objQ7 = mVar4.q();
                    if (zR4) {
                        objQ7 = new g2(i16, p2Var, aVar3);
                        mVar4.K(objQ7);
                    } else {
                        aVar2.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new g2(i16, p2Var, aVar3);
                            mVar4.K(objQ7);
                        }
                    }
                    k.a(aVar4, (l) objQ7, mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                DateTime dateTime = (DateTime) obj5;
                DateTime dateTime2 = (DateTime) obj4;
                t tVar = (t) obj3;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    if (dateTime != null) {
                        u uVarZ = g22.k.z(dateTime);
                        if (dateTime2 != null) {
                            aVar = new o82.a(uVarZ.b(), g22.k.z(dateTime2).b());
                        } else {
                            aVar = null;
                        }
                    } else {
                        aVar = null;
                    }
                    if (aVar == null) {
                        mVar5.C(776967765);
                        mVar5.f();
                        fVar = null;
                    } else {
                        mVar5.C(776967766);
                        u82.a aVar5 = tVar != null ? tVar.f161581h : null;
                        if (aVar5 == null) {
                            mVar5.C(392137940);
                            mVar5.f();
                            p1VarC = null;
                        } else {
                            mVar5.C(-2065560371);
                            p1VarC = aVar5.c(aVar, mVar5);
                            mVar5.f();
                        }
                        fVar = p1VarC != null ? (f) p1VarC.getF182175a() : null;
                        mVar5.f();
                    }
                    LocalDate localDate = dateTime != null ? dateTime.toLocalDate() : null;
                    if (localDate == null) {
                        mVar5.C(777234520);
                        mVar5.f();
                    } else {
                        mVar5.C(777234521);
                        LocalDate localDate2 = dateTime2 != null ? dateTime2.toLocalDate() : null;
                        if (localDate2 == null) {
                            mVar5.C(1292469584);
                            mVar5.f();
                        } else {
                            mVar5.C(1292469585);
                            xr1.d.a(0, fVar != null ? (List) fVar.a() : null, localDate, localDate2, mVar5);
                            mVar5.f();
                            Unit unit = Unit.INSTANCE;
                        }
                        mVar5.f();
                    }
                    xr1.a.a(kr1.b.a(fVar != null ? (List) fVar.a() : null), mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                rm1.j jVar = (rm1.j) obj5;
                CustomCombinedChart customCombinedChart = (CustomCombinedChart) obj4;
                h hVar = (h) obj3;
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    rm1.b bVar2 = jVar.D;
                    if (bVar2 == null || !(!s.g(bVar2.f153534c, bVar2.f153535d))) {
                        mVar6.C(1658605020);
                        mVar6.f();
                    } else {
                        mVar6.C(1658457026);
                        h4.r.a aVar6 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        vz1.r.b(c2.l.C(aVar6, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14), mVar6, 0);
                        mVar6.f();
                    }
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97920e;
                    h4.r rVarC = c2.l.C(aVar7, f14, f14, f14, 0.0f, 8);
                    String strQ = y.Q(mVar6, R.string.lbl_sleep_timeline);
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar6), mVar6, 0, 0, 131068);
                    g6.f.a aVar8 = g6.f.f75994b;
                    h4.r rVarH = x2.h(x2.f(aVar7, 1.0f), 350);
                    boolean zR5 = mVar6.r(customCombinedChart);
                    Object objQ8 = mVar6.q();
                    if (zR5) {
                        objQ8 = new hn1.j(customCombinedChart, 9);
                        mVar6.K(objQ8);
                    } else {
                        aVar2.getClass();
                        if (objQ8 == m.a.f135155b) {
                            objQ8 = new hn1.j(customCombinedChart, 9);
                            mVar6.K(objQ8);
                        }
                    }
                    l lVar5 = (l) objQ8;
                    boolean zR6 = mVar6.r(hVar) | mVar6.r(jVar) | mVar6.B(null);
                    Object objQ9 = mVar6.q();
                    if (zR6) {
                        objQ9 = new g2(29, hVar, jVar);
                        mVar6.K(objQ9);
                    } else {
                        aVar2.getClass();
                        if (objQ9 == m.a.f135155b) {
                            objQ9 = new g2(29, hVar, jVar);
                            mVar6.K(objQ9);
                        }
                    }
                    p002j6.c.b(lVar5, rVarH, (l) objQ9, mVar6, 48, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                i53.c cVar = (i53.c) obj5;
                l lVar6 = (l) obj4;
                p1 p1Var3 = (p1) obj3;
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    int iOrdinal = ((x11.a) p1Var3.getF182175a()).ordinal();
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarC2 = c2.l.C(c2.l.A(rVarF, eVar.f97920e, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                    boolean zB2 = mVar7.B(lVar6);
                    Object objQ10 = mVar7.q();
                    if (zB2) {
                        objQ10 = new j(lVar6, i15);
                        mVar7.K(objQ10);
                    } else {
                        aVar2.getClass();
                        if (objQ10 == m.a.f135155b) {
                            objQ10 = new j(lVar6, i15);
                            mVar7.K(objQ10);
                        }
                    }
                    k1.a(cVar, iOrdinal, rVarC2, null, 0.0f, (l) objQ10, mVar7, 0, 24);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                w11.d.e((h4.r) obj5, (z3.e) obj4, (z3.e) obj3, (m) obj, p0.t(439));
                return Unit.INSTANCE;
            case 8:
                w12.a aVar9 = (w12.a) obj5;
                Context context2 = (Context) obj4;
                e23.a aVar10 = (e23.a) obj3;
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    z02.f.c(0, 54, null, aVar10, null, aVar9.f181251b.b(new l22.a(context2)), mVar8, null);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 9:
                q0 q0Var = (q0) obj5;
                w2.n nVar = (w2.n) obj4;
                a0 a0Var = (a0) obj;
                long j8 = n4.c.j(q0Var.f105808a, ((n4.c) obj2).f123544a);
                q0Var.f105808a = j8;
                nVar.G(l1.Cursor, n4.c.j(((q0) obj3).f105808a, j8));
                if (nVar.A(nVar.s())) {
                    a0Var.a();
                    w4.a aVar11 = nVar.f181376l;
                    if (aVar11 != null) {
                        w4.b.f181904b.getClass();
                        aVar11.a(w4.b.a.b());
                    }
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ((w31.h) obj5).d((y31.a) obj4, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                v.a((h0) obj5, (w) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                u uVar = (u) obj5;
                int iIntValue9 = ((Integer) obj).intValue();
                int iIntValue10 = ((Integer) obj2).intValue();
                ((p1) obj3).setValue(Boolean.FALSE);
                int year = uVar.f16216a.getYear();
                LocalDateTime localDateTime = uVar.f16216a;
                Month month = localDateTime.getMonth();
                month.getClass();
                ((l) obj4).invoke(new u(year, b63.b.b(b63.c.a(month)), localDateTime.getDayOfMonth(), iIntValue9, iIntValue10, 0, 0));
                return Unit.INSTANCE;
            case 13:
                r rVar2 = (r) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                m mVar9 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                w61.a aVar12 = w61.a.f183133a;
                if (mVar9.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    rVar2.t(R.string.gcm_training_status_altitude_acclimation_header_2, mVar9, 0);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    rVar2.q(y.P(R.string.gcm_training_status_altitude_acclimation_description_2, new Object[]{am.j.o(StringUtils.SPACE, str3, sb3)}, mVar9), mVar9, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                wg2.l.c((u4.d) obj5, (e23.a) obj4, (k3) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                wl.e.a((u82.d) obj5, (e23.a) obj4, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                e23.a aVar13 = (e23.a) obj5;
                nk0.l lVar7 = (nk0.l) obj4;
                nk0.l lVar8 = (nk0.l) obj3;
                m mVar10 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    String strQ2 = y.Q(mVar10, R.string.lbl_health_status);
                    i53.f fVarA2 = i53.a.a(new i3("HELP", y.Q(mVar10, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new i3("STATUS_ALERTS", y.Q(mVar10, R.string.lbl_status_alerts), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB3 = mVar10.B(lVar7) | mVar10.B(lVar8);
                    Object objQ11 = mVar10.q();
                    if (zB3) {
                        objQ11 = new w02.b(18, lVar7, lVar8);
                        mVar10.K(objQ11);
                    } else {
                        aVar2.getClass();
                        if (objQ11 == m.a.f135155b) {
                            objQ11 = new w02.b(18, lVar7, lVar8);
                            mVar10.K(objQ11);
                        }
                    }
                    z02.f.d(strQ2, null, null, aVar13, null, fVarA2, (l) objQ11, mVar10, 2097152, 54);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                wq0.k.a((wq0.l) obj5, (l) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                wt0.e.a((h4.r) obj5, (tt0.b) obj4, (e23.a) obj3, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                wv0.d.a((mc) obj5, (e23.a) obj4, (q) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                wv0.q.a((i53.c) obj5, (l) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                h4.r rVar3 = (h4.r) obj5;
                x1.e eVar2 = (x1.e) obj4;
                l lVar9 = (l) obj3;
                m mVar11 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    x1.l.b(rVar3, eVar2, lVar9, mVar11, 0, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 22:
                aa1.c cVar2 = (aa1.c) obj5;
                e23.a aVar14 = (e23.a) obj4;
                e23.a aVar15 = (e23.a) obj3;
                m mVar12 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    String strQ3 = y.Q(mVar12, R.string.lbl_manual_pr);
                    i53.f fVarA3 = i53.a.a(new i3("menu_item_save", y.Q(mVar12, R.string.lbl_save), (cVar2.f2240h == null || cVar2.f2246n) ? false : true, (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
                    boolean zB4 = mVar12.B(aVar15);
                    Object objQ12 = mVar12.q();
                    if (zB4) {
                        objQ12 = new rx1.m(aVar15, i15);
                        mVar12.K(objQ12);
                    } else {
                        aVar2.getClass();
                        if (objQ12 == m.a.f135155b) {
                            objQ12 = new rx1.m(aVar15, i15);
                            mVar12.K(objQ12);
                        }
                    }
                    z02.f.d(strQ3, null, null, aVar14, fVarA3, null, (l) objQ12, mVar12, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 23:
                aa1.e eVar3 = (aa1.e) obj5;
                e23.a aVar16 = (e23.a) obj4;
                e23.a aVar17 = (e23.a) obj3;
                m mVar13 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    String str4 = eVar3.f2263e;
                    i53.f fVarA4 = i53.a.a(new i3("MENU_HELP", y.Q(mVar13, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB5 = mVar13.B(aVar17);
                    Object objQ13 = mVar13.q();
                    if (zB5) {
                        objQ13 = new rx1.m(aVar17, 27);
                        mVar13.K(objQ13);
                    } else {
                        aVar2.getClass();
                        if (objQ13 == m.a.f135155b) {
                            objQ13 = new rx1.m(aVar17, 27);
                            mVar13.K(objQ13);
                        }
                    }
                    z02.f.d(str4, null, null, aVar16, fVarA4, null, (l) objQ13, mVar13, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 24:
                e23.a aVar18 = (e23.a) obj5;
                aa1.h hVar2 = (aa1.h) obj4;
                e23.a aVar19 = (e23.a) obj3;
                m mVar14 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    String strQ4 = y.Q(mVar14, R.string.lbl_edit);
                    i53.f fVarA5 = i53.a.a(new i3("menu_item_save", y.Q(mVar14, R.string.lbl_save), hVar2.f2298j, (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
                    boolean zB6 = mVar14.B(aVar19);
                    Object objQ14 = mVar14.q();
                    if (zB6) {
                        objQ14 = new rx1.m(aVar19, i16);
                        mVar14.K(objQ14);
                    } else {
                        aVar2.getClass();
                        if (objQ14 == m.a.f135155b) {
                            objQ14 = new rx1.m(aVar19, i16);
                            mVar14.K(objQ14);
                        }
                    }
                    z02.f.d(strQ4, null, null, aVar18, fVarA5, null, (l) objQ14, mVar14, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 25:
                aa1.h hVar3 = (aa1.h) obj5;
                j0 j0Var = (j0) obj4;
                l lVar10 = (l) obj3;
                m mVar15 = (m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (mVar15.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    String strQ5 = y.Q(mVar15, R.string.concept_personal_records);
                    b.u uVar2 = (b.u) mVar15.A(g02.d.f74342a);
                    boolean zR7 = mVar15.r(uVar2);
                    Object objQ15 = mVar15.q();
                    if (zR7) {
                        objQ15 = new x91.t(uVar2);
                        mVar15.K(objQ15);
                    } else {
                        aVar2.getClass();
                        if (objQ15 == m.a.f135155b) {
                            objQ15 = new x91.t(uVar2);
                            mVar15.K(objQ15);
                        }
                    }
                    e23.a aVar20 = (e23.a) ((g) objQ15);
                    if (hVar3.f2290b) {
                        mVar15.C(-876810709);
                        mVar15.f();
                        cVarB = j53.l.b();
                    } else {
                        mVar15.C(-876951077);
                        cVarB = i53.a.a(new i3("menu_item_edit", y.Q(mVar15, R.string.lbl_edit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        mVar15.f();
                    }
                    i53.c cVar3 = cVarB;
                    boolean zR8 = mVar15.r(hVar3) | mVar15.B(j0Var) | mVar15.B(lVar10);
                    Object objQ16 = mVar15.q();
                    if (zR8) {
                        objQ16 = new wn2.f(hVar3, 6, j0Var, lVar10);
                        mVar15.K(objQ16);
                    } else {
                        aVar2.getClass();
                        if (objQ16 == m.a.f135155b) {
                            objQ16 = new wn2.f(hVar3, 6, j0Var, lVar10);
                            mVar15.K(objQ16);
                        }
                    }
                    z02.f.d(strQ5, null, null, aVar20, cVar3, null, (l) objQ16, mVar15, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                xa0.a.c((q90.c) obj5, (l) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                final xg0.n nVar2 = (xg0.n) obj5;
                final wg0.k kVar = (wg0.k) obj4;
                wf.f fVar2 = (wf.f) obj3;
                m mVar16 = (m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    h4.r.a aVar21 = h4.r.S;
                    h4.r rVarD = x2.d(aVar21, 1.0f);
                    boolean zR9 = mVar16.r(nVar2) | mVar16.B(kVar);
                    Object objQ17 = mVar16.q();
                    if (zR9) {
                        final int i25 = z14 ? 1 : 0;
                        objQ17 = new e23.a() { // from class: xg0.e0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        nVar2.R3(kVar);
                                        break;
                                    default:
                                        nVar2.R3(kVar);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar16.K(objQ17);
                    } else {
                        aVar2.getClass();
                        if (objQ17 == m.a.f135155b) {
                            final int i26 = z14 ? 1 : 0;
                            objQ17 = new e23.a() { // from class: xg0.e0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            nVar2.R3(kVar);
                                            break;
                                        default:
                                            nVar2.R3(kVar);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar16.K(objQ17);
                        }
                    }
                    h4.r rVarD2 = u1.w.d(rVarD, false, null, null, (e23.a) objQ17, 15);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar16.getU());
                    i2 i2VarX = mVar16.x();
                    h4.r rVarC3 = h4.k.c(rVarD2, mVar16);
                    h5.g.V.getClass();
                    e0.a aVar22 = h5.g.a.f81805b;
                    if (mVar16.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar16.z();
                    if (mVar16.getT()) {
                        mVar16.M(aVar22);
                    } else {
                        mVar16.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar16);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar16);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar16.getT() || !s.g(mVar16.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar16, iHashCode, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar16);
                    c2.u uVar3 = c2.u.f22885a;
                    h4.r rVarD3 = x2.d(aVar21, 1.0f);
                    h4.g gVar = h4.d.a.f81528f;
                    h4.r rVarC4 = uVar3.c(rVarD3, gVar);
                    f5.k.f68985a.getClass();
                    jf.r.a(fVar2, null, rVarC4, null, null, f5.k.a.f68987b, null, mVar16, 1572912, 1976);
                    f0 f0Var = f0.f110999a;
                    h4.r rVarC5 = uVar3.c(aVar21, gVar);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = q6.a(t62.b.f162798a);
                    c2 c2Var = c2.OVERLAY;
                    b2 b2Var = b2.MEDIUM;
                    boolean zR10 = mVar16.r(nVar2) | mVar16.B(kVar);
                    Object objQ18 = mVar16.q();
                    if (zR10) {
                        objQ18 = new e23.a() { // from class: xg0.e0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        nVar2.R3(kVar);
                                        break;
                                    default:
                                        nVar2.R3(kVar);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar16.K(objQ18);
                    } else {
                        aVar2.getClass();
                        if (objQ18 == m.a.f135155b) {
                            objQ18 = new e23.a() { // from class: xg0.e0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            nVar2.R3(kVar);
                                            break;
                                        default:
                                            nVar2.R3(kVar);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar16.K(objQ18);
                        }
                    }
                    f0Var.c(rVarC5, dVarA, c2Var, b2Var, false, null, null, (e23.a) objQ18, mVar16, 3456, 112);
                    mVar16.y();
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 28:
                xg0.n nVar3 = (xg0.n) obj5;
                wg0.g gVar2 = (wg0.g) obj4;
                wf.f fVar3 = (wf.f) obj3;
                m mVar17 = (m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (mVar17.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                    f5.k.f68985a.getClass();
                    f5.k.a.e eVar4 = f5.k.a.f68988c;
                    h4.r rVarD4 = x2.d(h4.r.S, 1.0f);
                    boolean zR11 = mVar17.r(nVar3) | mVar17.B(gVar2);
                    Object objQ19 = mVar17.q();
                    if (zR11) {
                        objQ19 = new wz1.c(i17, nVar3, gVar2);
                        mVar17.K(objQ19);
                    } else {
                        aVar2.getClass();
                        if (objQ19 == m.a.f135155b) {
                            objQ19 = new wz1.c(i17, nVar3, gVar2);
                            mVar17.K(objQ19);
                        }
                    }
                    jf.r.a(fVar3, null, u1.w.d(rVarD4, false, null, null, (e23.a) objQ19, 15), null, null, eVar4, null, mVar17, 1572912, 1976);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                xh0.f.a((xh0.h) obj5, (e23.a) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f180650a = i15;
        this.f180651b = obj;
        this.f180652c = obj2;
        this.f180653d = obj3;
    }
}
