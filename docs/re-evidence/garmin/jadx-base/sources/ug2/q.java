package ug2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c80.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.ActivityTypesActivity;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesActivity;
import i3.fe;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l72.i3;
import lc.m0;
import lc.v;
import o13.p;
import o72.m1;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p008y1.h3;
import p008y1.n1;
import p13.x;
import p3.m;
import p3.p1;
import p3.x1;
import p3.x3;
import pg2.d;
import r1.l;
import rv1.h;
import tu1.i;
import tw1.n;
import v2.b1;
import v2.e1;
import vd0.c1;
import vd0.x0;
import vt1.o;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class q implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f170915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f170916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f170917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f170918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f170919f;

    public /* synthetic */ q(za0.i iVar, Context context, a4.a aVar, e23.l lVar, c.q qVar) {
        this.f170914a = 16;
        this.f170915b = iVar;
        this.f170916c = context;
        this.f170917d = aVar;
        this.f170918e = lVar;
        this.f170919f = qVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v27, types: [T, y1.n1$a] */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        e23.a<Unit> aVar;
        e23.l<i.c, Unit> lVar;
        Double d14;
        int i14 = this.f170914a;
        int i15 = 28;
        int i16 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        arrayList = null;
        ArrayList arrayList = null;
        final int i17 = 1;
        Object obj2 = this.f170919f;
        Object obj3 = this.f170918e;
        Object obj4 = this.f170917d;
        Object obj5 = this.f170915b;
        Object obj6 = this.f170916c;
        switch (i14) {
            case 0:
                Context context = (Context) obj6;
                o53.b0 b0Var = (o53.b0) obj5;
                p1 p1Var = (p1) obj3;
                fe feVar = (fe) obj2;
                ((f.a) obj).getClass();
                if (((Boolean) ((x3) obj4).getF182175a()).booleanValue() && !((Boolean) p1Var.getF182175a()).booleanValue() && zg2.d.a(context)) {
                    ge1.b.T(b0Var, null, null, new p0(feVar, context, null), 3);
                }
                return Unit.INSTANCE;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj6;
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                f0Var.a(arrayList2.size(), null, new ut0.d(arrayList2), new z3.e(2039820996, true, new ut0.e(arrayList2, arrayList2, (List) obj4, (e23.l) obj3, (o53.b0) obj5, (e2.i0) obj2)));
                return Unit.INSTANCE;
            case 2:
                dy1.r rVar = (dy1.r) obj6;
                i.c cVar = (i.c) obj5;
                p1 p1Var2 = (p1) obj3;
                p1 p1Var3 = (p1) obj4;
                p1 p1Var4 = (p1) obj2;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                String str = i3Var.f111063a;
                switch (str.hashCode()) {
                    case -1595235956:
                        if (str.equals("SKIP_DELOAD_WEEK")) {
                            p1Var3.setValue(Boolean.TRUE);
                        }
                        break;
                    case 2213697:
                        if (str.equals("HELP") && rVar != null && (aVar = rVar.f61630v) != null) {
                            aVar.invoke();
                        }
                        break;
                    case 298400537:
                        if (str.equals("QUIT_PLAN")) {
                            p1Var4.setValue(Boolean.TRUE);
                        }
                        break;
                    case 1500639097:
                        if (str.equals("RESTART_PLAN") && cVar != null && rVar != null && (lVar = rVar.f61632x) != null) {
                            lVar.invoke(cVar);
                        }
                        break;
                    case 1888846340:
                        if (str.equals("REMOVE_PLAN")) {
                            p1Var2.setValue(Boolean.TRUE);
                        }
                        break;
                }
                return Unit.INSTANCE;
            case 3:
                e1 e1Var = (e1) obj;
                b1.a aVar2 = ((v2.b) obj5).f174890a;
                e1Var.f174967h = (x5.l0) obj6;
                e1Var.f174968i = (x5.q) obj4;
                e1Var.f174962c = (k62.k) obj3;
                e1Var.f174963d = (e23.l) obj2;
                e1Var.f174964e = aVar2 != null ? aVar2.getF175265b() : null;
                e1Var.f174965f = aVar2 != null ? aVar2.getF175266c() : null;
                e1Var.f174966g = aVar2 != null ? aVar2.getViewConfiguration() : null;
                return Unit.INSTANCE;
            case 4:
                o53.b0 b0Var2 = (o53.b0) obj5;
                e23.a aVar3 = (e23.a) obj6;
                x0 x0Var = (x0) obj4;
                e23.l lVar2 = (e23.l) obj2;
                ((i3) obj).getClass();
                Uri uri = (Uri) ((p1) obj3).getF182175a();
                if (uri != null) {
                    ge1.b.T(b0Var2, null, null, new c1.a(x0Var, uri, lVar2, aVar3, null), 3);
                } else {
                    aVar3.invoke();
                }
                return Unit.INSTANCE;
            case 5:
                x11.f fVar = (x11.f) obj6;
                i53.c cVar2 = (i53.c) obj5;
                e23.l lVar3 = (e23.l) obj4;
                v21.e eVar = (v21.e) obj3;
                e23.l lVar4 = (e23.l) obj2;
                e2.f0 f0Var2 = (e2.f0) obj;
                f0Var2.getClass();
                w11.a.f181194a.getClass();
                e2.f0.b(f0Var2, null, w11.a.f181195b, 3);
                if (p005kotlin.jvm.internal.s.g(fVar.f188412h, Boolean.FALSE)) {
                    e2.f0.b(f0Var2, null, new z3.e(1337332589, true, new vv0.e(7, fVar, lVar3)), 3);
                }
                e2.f0.b(f0Var2, null, new z3.e(334719505, true, new vd0.s0(fVar, 6, eVar, lVar4)), 3);
                e2.f0.f(f0Var2, cVar2.size(), null, new z3.e(1264560831, true, new m1(17, cVar2, eVar)), 6);
                return Unit.INSTANCE;
            case 6:
                e2.f0 f0Var3 = (e2.f0) obj;
                f0Var3.getClass();
                i53.c<v11.b> cVar3 = ((x11.k) obj6).f188433d;
                f0Var3.a(cVar3.size(), null, new w11.p(w11.o.f181238a, cVar3), new z3.e(802480018, true, new w11.q(cVar3, (e23.a) obj5, (v21.e) obj4, (e23.l) obj3, (e23.p) obj2)));
                return Unit.INSTANCE;
            case 7:
                e23.a aVar4 = (e23.a) obj6;
                e23.a aVar5 = (e23.a) obj5;
                x21.c cVar4 = (x21.c) obj4;
                p1 p1Var5 = (p1) obj3;
                p1 p1Var6 = (p1) obj2;
                if (((Boolean) obj).booleanValue()) {
                    w21.m.k(aVar5, p1Var5, p1Var6, cVar4);
                } else {
                    aVar4.invoke();
                    w21.m.j(p1Var5, true);
                    w21.m.h(p1Var6, false);
                }
                return Unit.INSTANCE;
            case 8:
                e23.a aVar6 = (e23.a) obj5;
                x21.c cVar5 = (x21.c) obj4;
                p1 p1Var7 = (p1) obj3;
                p1 p1Var8 = (p1) obj2;
                ((f.a) obj).getClass();
                if (a7.b.checkSelfPermission((Context) obj6, "android.permission.RECORD_AUDIO") == 0) {
                    w21.m.k(aVar6, p1Var7, p1Var8, cVar5);
                } else {
                    w21.m.j(p1Var7, true);
                    w21.m.h(p1Var8, false);
                }
                return Unit.INSTANCE;
            case 9:
                e23.a aVar7 = (e23.a) obj6;
                e23.a aVar8 = (e23.a) obj5;
                e23.p pVar = (e23.p) obj4;
                final PendingActivitiesActivity pendingActivitiesActivity = (PendingActivitiesActivity) obj2;
                lc.k0 k0Var = (lc.k0) obj;
                PendingActivitiesActivity.a aVar9 = PendingActivitiesActivity.f39793d;
                k0Var.getClass();
                ky0.w wVar = new ky0.w((lc.m0) obj3, i15);
                aVar7.getClass();
                z3.e eVar2 = new z3.e(-343631138, true, new m1(18, wVar, aVar7));
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var, t0Var.b(com.garmin.android.apps.connectmobile.pending.activities.presentation.a.C0723a.class), k0Var2, j0Var, null, null, null, null, eVar2);
                e23.q qVar = new e23.q() { // from class: w51.d
                    @Override // e23.q
                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        int i18 = i17;
                        PendingActivitiesActivity pendingActivitiesActivity2 = pendingActivitiesActivity;
                        am.x0 x0Var2 = (am.x0) obj7;
                        Long l14 = (Long) obj8;
                        List list = (List) obj9;
                        switch (i18) {
                            case 0:
                                PendingActivitiesActivity.a aVar10 = PendingActivitiesActivity.f39793d;
                                list.getClass();
                                f.c<Intent> cVar6 = pendingActivitiesActivity2.f39796c;
                                ActivityTypesActivity.a aVar11 = ActivityTypesActivity.f28779c;
                                String string = pendingActivitiesActivity2.getString(R.string.lbl_choose_activity_type);
                                aVar11.getClass();
                                cVar6.a(ActivityTypesActivity.a.a(pendingActivitiesActivity2, x0Var2, string, l14, list), null);
                                break;
                            default:
                                PendingActivitiesActivity.a aVar12 = PendingActivitiesActivity.f39793d;
                                list.getClass();
                                f.c<Intent> cVar7 = pendingActivitiesActivity2.f39796c;
                                ActivityTypesActivity.a aVar13 = ActivityTypesActivity.f28779c;
                                String string2 = pendingActivitiesActivity2.getString(R.string.lbl_choose_activity_type);
                                aVar13.getClass();
                                cVar7.a(ActivityTypesActivity.a.a(pendingActivitiesActivity2, x0Var2, string2, l14, list), null);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                aVar8.getClass();
                pVar.getClass();
                nc.n.a(k0Var, t0Var.b(com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(z51.h.class), new w51.h(n63.b.f123892d))), j0Var, null, null, null, null, new z3.e(334021683, true, new qw.b(aVar7, qVar, pVar, aVar8, 11)));
                final Object[] objArr3 = objArr == true ? 1 : 0;
                nc.n.a(k0Var, t0Var.b(com.garmin.android.apps.connectmobile.pending.activities.presentation.a.b.class), k0Var2, j0Var, null, null, null, null, new z3.e(-1057940210, true, new qw.b(aVar7, new e23.q() { // from class: w51.d
                    @Override // e23.q
                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        int i18 = objArr3;
                        PendingActivitiesActivity pendingActivitiesActivity2 = pendingActivitiesActivity;
                        am.x0 x0Var2 = (am.x0) obj7;
                        Long l14 = (Long) obj8;
                        List list = (List) obj9;
                        switch (i18) {
                            case 0:
                                PendingActivitiesActivity.a aVar10 = PendingActivitiesActivity.f39793d;
                                list.getClass();
                                f.c<Intent> cVar6 = pendingActivitiesActivity2.f39796c;
                                ActivityTypesActivity.a aVar11 = ActivityTypesActivity.f28779c;
                                String string = pendingActivitiesActivity2.getString(R.string.lbl_choose_activity_type);
                                aVar11.getClass();
                                cVar6.a(ActivityTypesActivity.a.a(pendingActivitiesActivity2, x0Var2, string, l14, list), null);
                                break;
                            default:
                                PendingActivitiesActivity.a aVar12 = PendingActivitiesActivity.f39793d;
                                list.getClass();
                                f.c<Intent> cVar7 = pendingActivitiesActivity2.f39796c;
                                ActivityTypesActivity.a aVar13 = ActivityTypesActivity.f28779c;
                                String string2 = pendingActivitiesActivity2.getString(R.string.lbl_choose_activity_type);
                                aVar13.getClass();
                                cVar7.a(ActivityTypesActivity.a.a(pendingActivitiesActivity2, x0Var2, string2, l14, list), null);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, pVar, aVar8, 12)));
                return Unit.INSTANCE;
            case 10:
                final qv1.b bVar = (qv1.b) obj6;
                final Activity activity = (Activity) obj5;
                final lc.m0 m0Var = (lc.m0) obj2;
                lc.k0 k0Var3 = (lc.k0) obj;
                k0Var3.getClass();
                nc.n.b(k0Var3, wv1.c.b.f187459b.f187457a, null, null, null, null, null, null, new z3.e(-1531894367, true, new v70.a((u1) bVar, (Object) activity, obj4, obj3, m0Var, 5)), 254);
                String str2 = wv1.c.a.f187458b.f187457a;
                final Object[] objArr4 = objArr2 == true ? 1 : 0;
                nc.n.b(k0Var3, str2, null, null, null, null, null, null, new z3.e(1122814360, true, new e23.r() { // from class: wv1.a
                    /* JADX WARN: Code duplicated, block: B:16:0x0069  */
                    /* JADX WARN: Code duplicated, block: B:21:0x0085  */
                    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
                    /* JADX WARN: Code duplicated, block: B:73:0x01a3  */
                    /* JADX WARN: Code duplicated, block: B:78:0x01c1  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        LocalDate localDatePlusWeeks;
                        n trainingPlanType;
                        o oVarB;
                        n trainingPlanType2;
                        n trainingPlanType3;
                        int i18 = objArr4;
                        m.a aVar10 = m.f135153a;
                        m0 m0Var2 = m0Var;
                        Activity activity2 = activity;
                        int i19 = 6;
                        switch (i18) {
                            case 0:
                                m mVar = (m) obj9;
                                ((Integer) obj10).getClass();
                                ((l) obj7).getClass();
                                ((v) obj8).getClass();
                                x1 x1Var = p3.n.f135158a;
                                o.a aVar11 = o.f180174e;
                                qv1.b bVar2 = bVar;
                                tw1.m mVar2 = bVar2.f147952t;
                                o oVarB2 = (mVar2 == null || (trainingPlanType2 = mVar2.getTrainingPlanType()) == null) ? null : trainingPlanType2.b();
                                aVar11.getClass();
                                boolean z14 = oVarB2 != null && x.k(o.f180179j, o.f180180k).contains(oVarB2);
                                tw1.m mVar3 = bVar2.f147952t;
                                String strE = (mVar3 == null || (trainingPlanType = mVar3.getTrainingPlanType()) == null || (oVarB = trainingPlanType.b()) == null) ? null : oVarB.e(activity2);
                                LocalDate localDateNow = LocalDate.now();
                                tw1.m mVar4 = bVar2.f147952t;
                                p pVar2 = (mVar4 == null || !(mVar4.f0() || mVar4.j0())) ? new p(localDateNow.plusWeeks(6), localDateNow.plusWeeks(52)) : new p(localDateNow.plusWeeks(4), localDateNow.plusWeeks(12));
                                LocalDate localDate = (LocalDate) pVar2.f128594a;
                                LocalDate localDate2 = (LocalDate) pVar2.f128595b;
                                bVar2.f147946m.k(null, Boolean.TRUE);
                                if (strE == null) {
                                    strE = "";
                                }
                                LocalDate localDateNow2 = LocalDate.now();
                                tw1.m mVar5 = bVar2.f147952t;
                                if (mVar5 == null || !(mVar5.f0() || mVar5.j0())) {
                                    localDatePlusWeeks = localDateNow2.plusWeeks(16);
                                    localDatePlusWeeks.getClass();
                                } else {
                                    localDatePlusWeeks = localDateNow2.plusWeeks(8);
                                    localDatePlusWeeks.getClass();
                                }
                                i.f166483a.getClass();
                                i53.c cVarH = i.a.h(activity2, true, z14);
                                boolean zR = mVar.r(bVar2) | mVar.r(m0Var2);
                                Object objQ = mVar.q();
                                if (zR) {
                                    objQ = new w02.b(21, bVar2, m0Var2);
                                    mVar.K(objQ);
                                } else {
                                    aVar10.getClass();
                                    if (objQ == m.a.f135155b) {
                                        objQ = new w02.b(21, bVar2, m0Var2);
                                        mVar.K(objQ);
                                    }
                                }
                                e23.l lVar5 = (e23.l) objQ;
                                boolean zR2 = mVar.r(activity2);
                                Object objQ2 = mVar.q();
                                if (zR2) {
                                    objQ2 = new by1.l(activity2, i19);
                                    mVar.K(objQ2);
                                } else {
                                    aVar10.getClass();
                                    if (objQ2 == m.a.f135155b) {
                                        objQ2 = new by1.l(activity2, i19);
                                        mVar.K(objQ2);
                                    }
                                }
                                rv1.c.a(null, strE, localDate, localDate2, localDatePlusWeeks, cVarH, lVar5, (e23.a) objQ2, mVar, 0);
                                break;
                            default:
                                m mVar6 = (m) obj9;
                                ((Integer) obj10).getClass();
                                ((l) obj7).getClass();
                                ((v) obj8).getClass();
                                x1 x1Var2 = p3.n.f135158a;
                                qv1.b bVar3 = bVar;
                                tw1.m mVar7 = bVar3.f147952t;
                                o oVarB3 = (mVar7 == null || (trainingPlanType3 = mVar7.getTrainingPlanType()) == null) ? null : trainingPlanType3.b();
                                if (oVarB3 == null) {
                                    mVar6.C(970377909);
                                    mVar6.f();
                                } else {
                                    mVar6.C(970377910);
                                    bVar3.f147946m.k(null, Boolean.FALSE);
                                    boolean zR3 = mVar6.r(activity2);
                                    Object objQ3 = mVar6.q();
                                    if (zR3) {
                                        objQ3 = new d(activity2, 6);
                                        mVar6.K(objQ3);
                                    } else {
                                        aVar10.getClass();
                                        if (objQ3 == m.a.f135155b) {
                                            objQ3 = new d(activity2, 6);
                                            mVar6.K(objQ3);
                                        }
                                    }
                                    e23.l lVar6 = (e23.l) objQ3;
                                    boolean zR4 = mVar6.r(bVar3);
                                    Object objQ4 = mVar6.q();
                                    if (zR4) {
                                        objQ4 = new wd.c(bVar3, 16);
                                        mVar6.K(objQ4);
                                    } else {
                                        aVar10.getClass();
                                        if (objQ4 == m.a.f135155b) {
                                            objQ4 = new wd.c(bVar3, 16);
                                            mVar6.K(objQ4);
                                        }
                                    }
                                    e23.a aVar12 = (e23.a) objQ4;
                                    boolean zR5 = mVar6.r(m0Var2);
                                    Object objQ5 = mVar6.q();
                                    if (zR5) {
                                        objQ5 = new ug2.x(m0Var2, 22);
                                        mVar6.K(objQ5);
                                    } else {
                                        aVar10.getClass();
                                        if (objQ5 == m.a.f135155b) {
                                            objQ5 = new ug2.x(m0Var2, 22);
                                            mVar6.K(objQ5);
                                        }
                                    }
                                    h.a(bVar3, oVarB3, lVar6, aVar12, (e23.a) objQ5, mVar6, 0);
                                    mVar6.f();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 254);
                nc.n.b(k0Var3, wv1.c.C3487c.f187460b.f187457a, null, null, null, null, null, null, new z3.e(-1082828007, true, new e23.r() { // from class: wv1.a
                    /* JADX WARN: Code duplicated, block: B:16:0x0069  */
                    /* JADX WARN: Code duplicated, block: B:21:0x0085  */
                    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
                    /* JADX WARN: Code duplicated, block: B:73:0x01a3  */
                    /* JADX WARN: Code duplicated, block: B:78:0x01c1  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        LocalDate localDatePlusWeeks;
                        n trainingPlanType;
                        o oVarB;
                        n trainingPlanType2;
                        n trainingPlanType3;
                        int i18 = i17;
                        m.a aVar10 = m.f135153a;
                        m0 m0Var2 = m0Var;
                        Activity activity2 = activity;
                        int i19 = 6;
                        switch (i18) {
                            case 0:
                                m mVar = (m) obj9;
                                ((Integer) obj10).getClass();
                                ((l) obj7).getClass();
                                ((v) obj8).getClass();
                                x1 x1Var = p3.n.f135158a;
                                o.a aVar11 = o.f180174e;
                                qv1.b bVar2 = bVar;
                                tw1.m mVar2 = bVar2.f147952t;
                                o oVarB2 = (mVar2 == null || (trainingPlanType2 = mVar2.getTrainingPlanType()) == null) ? null : trainingPlanType2.b();
                                aVar11.getClass();
                                boolean z14 = oVarB2 != null && x.k(o.f180179j, o.f180180k).contains(oVarB2);
                                tw1.m mVar3 = bVar2.f147952t;
                                String strE = (mVar3 == null || (trainingPlanType = mVar3.getTrainingPlanType()) == null || (oVarB = trainingPlanType.b()) == null) ? null : oVarB.e(activity2);
                                LocalDate localDateNow = LocalDate.now();
                                tw1.m mVar4 = bVar2.f147952t;
                                p pVar2 = (mVar4 == null || !(mVar4.f0() || mVar4.j0())) ? new p(localDateNow.plusWeeks(6), localDateNow.plusWeeks(52)) : new p(localDateNow.plusWeeks(4), localDateNow.plusWeeks(12));
                                LocalDate localDate = (LocalDate) pVar2.f128594a;
                                LocalDate localDate2 = (LocalDate) pVar2.f128595b;
                                bVar2.f147946m.k(null, Boolean.TRUE);
                                if (strE == null) {
                                    strE = "";
                                }
                                LocalDate localDateNow2 = LocalDate.now();
                                tw1.m mVar5 = bVar2.f147952t;
                                if (mVar5 == null || !(mVar5.f0() || mVar5.j0())) {
                                    localDatePlusWeeks = localDateNow2.plusWeeks(16);
                                    localDatePlusWeeks.getClass();
                                } else {
                                    localDatePlusWeeks = localDateNow2.plusWeeks(8);
                                    localDatePlusWeeks.getClass();
                                }
                                i.f166483a.getClass();
                                i53.c cVarH = i.a.h(activity2, true, z14);
                                boolean zR = mVar.r(bVar2) | mVar.r(m0Var2);
                                Object objQ = mVar.q();
                                if (zR) {
                                    objQ = new w02.b(21, bVar2, m0Var2);
                                    mVar.K(objQ);
                                } else {
                                    aVar10.getClass();
                                    if (objQ == m.a.f135155b) {
                                        objQ = new w02.b(21, bVar2, m0Var2);
                                        mVar.K(objQ);
                                    }
                                }
                                e23.l lVar5 = (e23.l) objQ;
                                boolean zR2 = mVar.r(activity2);
                                Object objQ2 = mVar.q();
                                if (zR2) {
                                    objQ2 = new by1.l(activity2, i19);
                                    mVar.K(objQ2);
                                } else {
                                    aVar10.getClass();
                                    if (objQ2 == m.a.f135155b) {
                                        objQ2 = new by1.l(activity2, i19);
                                        mVar.K(objQ2);
                                    }
                                }
                                rv1.c.a(null, strE, localDate, localDate2, localDatePlusWeeks, cVarH, lVar5, (e23.a) objQ2, mVar, 0);
                                break;
                            default:
                                m mVar6 = (m) obj9;
                                ((Integer) obj10).getClass();
                                ((l) obj7).getClass();
                                ((v) obj8).getClass();
                                x1 x1Var2 = p3.n.f135158a;
                                qv1.b bVar3 = bVar;
                                tw1.m mVar7 = bVar3.f147952t;
                                o oVarB3 = (mVar7 == null || (trainingPlanType3 = mVar7.getTrainingPlanType()) == null) ? null : trainingPlanType3.b();
                                if (oVarB3 == null) {
                                    mVar6.C(970377909);
                                    mVar6.f();
                                } else {
                                    mVar6.C(970377910);
                                    bVar3.f147946m.k(null, Boolean.FALSE);
                                    boolean zR3 = mVar6.r(activity2);
                                    Object objQ3 = mVar6.q();
                                    if (zR3) {
                                        objQ3 = new d(activity2, 6);
                                        mVar6.K(objQ3);
                                    } else {
                                        aVar10.getClass();
                                        if (objQ3 == m.a.f135155b) {
                                            objQ3 = new d(activity2, 6);
                                            mVar6.K(objQ3);
                                        }
                                    }
                                    e23.l lVar6 = (e23.l) objQ3;
                                    boolean zR4 = mVar6.r(bVar3);
                                    Object objQ4 = mVar6.q();
                                    if (zR4) {
                                        objQ4 = new wd.c(bVar3, 16);
                                        mVar6.K(objQ4);
                                    } else {
                                        aVar10.getClass();
                                        if (objQ4 == m.a.f135155b) {
                                            objQ4 = new wd.c(bVar3, 16);
                                            mVar6.K(objQ4);
                                        }
                                    }
                                    e23.a aVar12 = (e23.a) objQ4;
                                    boolean zR5 = mVar6.r(m0Var2);
                                    Object objQ5 = mVar6.q();
                                    if (zR5) {
                                        objQ5 = new ug2.x(m0Var2, 22);
                                        mVar6.K(objQ5);
                                    } else {
                                        aVar10.getClass();
                                        if (objQ5 == m.a.f135155b) {
                                            objQ5 = new ug2.x(m0Var2, 22);
                                            mVar6.K(objQ5);
                                        }
                                    }
                                    h.a(bVar3, oVarB3, lVar6, aVar12, (e23.a) objQ5, mVar6, 0);
                                    mVar6.f();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 254);
                return Unit.INSTANCE;
            case 11:
                aa1.i iVar = (aa1.i) obj6;
                e2.f0 f0Var4 = (e2.f0) obj;
                f0Var4.getClass();
                i53.c<aa1.g> cVar6 = iVar.f2299a;
                f0Var4.a(cVar6.size(), new x91.s.e(new x91.j(i16), cVar6), new x91.s.f(x91.s.d.f189649a, cVar6), new z3.e(802480018, true, new x91.s.g(cVar6, (e23.l) obj5, (e23.l) obj4, (e23.q) obj3, (e23.p) obj2)));
                String str3 = iVar.f2300b;
                if (str3 != null) {
                    e2.f0.b(f0Var4, str3, new z3.e(1572088, true, new j21.p(str3, i15)), 2);
                }
                return Unit.INSTANCE;
            case 12:
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                g6.f.a aVar10 = g6.f.f75994b;
                List listG0 = p13.h0.G0((ArrayList) obj6);
                o4.u1.f129010b.getClass();
                m92.c0.e(fVar2, 2, new m92.m.b(listG0, o4.u1.f129011c, null), false, 0.0f, null, null, (ArrayList) obj5, (Float) obj4, null, null, (Float) obj3, (Float) obj2, null, true, null, 21304);
                return Unit.INSTANCE;
            case 13:
                jq1.i iVar2 = (jq1.i) obj6;
                LocalDate localDate = (LocalDate) obj5;
                LocalDate localDate2 = (LocalDate) obj4;
                p1 p1Var9 = (p1) obj2;
                ((CustomBarChart) obj).getClass();
                rz.a aVar11 = (rz.a) ((p1) obj3).getF182175a();
                if (iVar2 != null) {
                    List<Long> list = pq1.i.f139597a;
                    List<jq1.j> list2 = iVar2.f100019a;
                    if (list2 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (jq1.j jVar : list2) {
                            String str4 = jVar.f100022a;
                            LocalDate localDateV = str4 != null ? g22.k.v(str4, "yyyy-MM-dd") : null;
                            jq1.j.d dVar = jVar.f100023b;
                            arrayList3.add(new wq1.a(localDateV, (dVar == null || (d14 = dVar.f100025a) == null) ? null : Integer.valueOf((int) d14.doubleValue()), null, 4, null));
                        }
                        arrayList = arrayList3;
                    }
                }
                wq1.b bVar2 = new wq1.b(localDate, localDate2, arrayList, null, 8, null);
                Context context2 = ((pq1.d) p1Var9.getF182175a()).f139569a;
                String string = context2.getString(R.string.common_no_certain_data, context2.getString(R.string.lbl_steps));
                string.getClass();
                qz.a.b(aVar11, bVar2, string, 4);
                return Unit.INSTANCE;
            case 14:
                dy1.g gVar = (dy1.g) obj6;
                e2.f0 f0Var5 = (e2.f0) obj;
                f0Var5.getClass();
                i53.c<dy1.h> cVar7 = gVar.f61555b;
                f0Var5.a(cVar7.size(), new xx1.f.d(new xd2.m0(13), cVar7), new xx1.f.e(xx1.f.c.f192573a, cVar7), new z3.e(802480018, true, new xx1.f.C3595f(cVar7, (j02.h0) obj5, gVar, (p1) obj3, (p1) obj4, (e23.l) obj2)));
                return Unit.INSTANCE;
            case 15:
                n1 n1Var = (n1) obj6;
                p005kotlin.jvm.internal.r0 r0Var = (p005kotlin.jvm.internal.r0) obj5;
                p005kotlin.jvm.internal.o0 o0Var = (p005kotlin.jvm.internal.o0) obj4;
                h3 h3Var = (h3) obj3;
                p005kotlin.jvm.internal.m0 m0Var2 = (p005kotlin.jvm.internal.m0) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                n1.a aVarF = n1.f(n1Var.f193441e);
                if (aVarF != null) {
                    n1Var.g(aVarF);
                    ?? A = ((n1.a) r0Var.f105810a).a(aVarF);
                    long j8 = A.f193445a;
                    r0Var.f105810a = A;
                    float fK = u1.g0.f167502i ? h3Var.k(h3Var.g(j8)) : h3Var.i(h3Var.g(j8));
                    o0Var.f105806a = fK;
                    m0Var2.f105804a = !p008y1.m1.a(fK - fFloatValue);
                }
                return Boolean.valueOf(aVarF != null);
            case 16:
                za0.i iVar3 = (za0.i) obj5;
                Context context3 = (Context) obj6;
                a4.a aVar12 = (a4.a) obj4;
                e23.l lVar5 = (e23.l) obj3;
                c.q qVar2 = (c.q) obj2;
                Map map = (Map) obj;
                map.getClass();
                j22.b.f96736a.getClass();
                int i18 = za0.u.a.f203279a[j22.b.F(map).ordinal()];
                if (i18 == 1) {
                    context3.getClass();
                    ge1.b.T(v1.a(iVar3), null, null, new za0.l(context3, null), 3);
                    aVar12.invoke(Boolean.TRUE);
                } else if (i18 != 2) {
                    aVar12.invoke(Boolean.FALSE);
                } else {
                    lVar5.invoke(qVar2);
                }
                return Unit.INSTANCE;
            default:
                zd0.u0 u0Var = (zd0.u0) obj6;
                c80.s0 s0Var = (c80.s0) obj5;
                y0 y0Var = (y0) obj4;
                Context context4 = (Context) obj;
                int i19 = zd0.u0.f204141p;
                context4.getClass();
                i2.f36769a.getClass();
                i2.a.k(a2.PROMOTIONS, "PromosManager", "Promo tapped in " + s0Var);
                u0Var.f204146e.a(ht.q.TAP, y0Var.f25637a, s0Var);
                ((zd0.j0) obj3).a(context4);
                c80.k0 k0Var4 = y0Var.f25647k;
                if (k0Var4.f25402b && k0Var4.f25403c) {
                    zd0.u0.z(u0Var, y0Var, s0Var, false, 4);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ q(Object obj, Object obj2, p1 p1Var, p1 p1Var2, Object obj3, int i14) {
        this.f170914a = i14;
        this.f170916c = obj;
        this.f170915b = obj2;
        this.f170918e = p1Var;
        this.f170917d = p1Var2;
        this.f170919f = obj3;
    }

    public /* synthetic */ q(ArrayList arrayList, List list, e23.l lVar, o53.b0 b0Var, e2.i0 i0Var) {
        this.f170914a = 1;
        this.f170916c = arrayList;
        this.f170917d = list;
        this.f170918e = lVar;
        this.f170915b = b0Var;
        this.f170919f = i0Var;
    }

    public /* synthetic */ q(o53.b0 b0Var, e23.a aVar, p1 p1Var, x0 x0Var, e23.l lVar) {
        this.f170914a = 4;
        this.f170915b = b0Var;
        this.f170916c = aVar;
        this.f170918e = p1Var;
        this.f170917d = x0Var;
        this.f170919f = lVar;
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f170914a = i14;
        this.f170916c = obj;
        this.f170915b = obj2;
        this.f170917d = obj3;
        this.f170918e = obj4;
        this.f170919f = obj5;
    }
}
