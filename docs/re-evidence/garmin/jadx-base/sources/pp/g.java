package pp;

import android.content.Context;
import b63.o;
import c2.q;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import e23.l;
import e23.p;
import f5.g0;
import f5.z0;
import gv0.o0;
import h4.k;
import h4.r;
import h5.e0;
import i3.m8;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l72.c1;
import l72.i3;
import l72.j0;
import l72.p2;
import l72.w;
import l72.x0;
import lc.m0;
import mp.j;
import o53.b0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.u0;
import p13.x;
import p13.y;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import q42.i;
import q42.v;
import qk0.t;
import r70.z;
import s70.c0;
import u1.a2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f139524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f139525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f139526d;

    public /* synthetic */ g(Object obj, int i14, Object obj2, Object obj3) {
        this.f139523a = i14;
        this.f139524b = obj;
        this.f139525c = obj2;
        this.f139526d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:117:0x040d  */
    /* JADX WARN: Code duplicated, block: B:140:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:145:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:186:0x060f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0678  */
    /* JADX WARN: Code duplicated, block: B:218:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:233:0x074c  */
    /* JADX WARN: Code duplicated, block: B:268:0x0833  */
    /* JADX WARN: Code duplicated, block: B:283:0x0898  */
    /* JADX WARN: Code duplicated, block: B:55:0x0212  */
    /* JADX WARN: Code duplicated, block: B:62:0x026b  */
    /* JADX WARN: Code duplicated, block: B:81:0x02e8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strP;
        int i14;
        int i15;
        String strP2;
        int i16 = this.f139523a;
        int i17 = 11;
        int i18 = 7;
        m.a aVar = m.f135153a;
        int i19 = 3;
        int i24 = 2;
        final int i25 = 0;
        final int i26 = 1;
        Object obj3 = this.f139526d;
        Object obj4 = this.f139525c;
        Object obj5 = this.f139524b;
        switch (i16) {
            case 0:
                i53.c cVar = (i53.c) obj5;
                p pVar = (p) obj4;
                o82.g gVar = (o82.g) obj3;
                List list = (List) obj;
                ((Integer) obj2).intValue();
                list.getClass();
                ArrayList arrayList = new ArrayList(y.r(cVar, 10));
                for (Object obj6 : cVar) {
                    int i27 = i25 + 1;
                    if (i25 < 0) {
                        x.q();
                        throw null;
                    }
                    arrayList.add(new o13.p((j) obj6, Boolean.valueOf(((j0) list.get(i25)).f111076e)));
                    i25 = i27;
                }
                pVar.invoke(gVar, u0.l(arrayList));
                return Unit.INSTANCE;
            case 1:
                r rVar = (r) obj5;
                p1 p1Var = (p1) obj4;
                z3.e eVar = (z3.e) obj3;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    Object objQ = mVar.q();
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new b(p1Var, i24);
                        mVar.K(objQ);
                    }
                    r rVarF = g0.f(rVar, (l) objQ);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, true);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = k.c(rVarF, mVar);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
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
                    b4.c(h5.g.a.f81810g, z0VarD, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    b4.a(mVar, Integer.valueOf(iHashCode), h5.g.a.f81813j);
                    b4.b(h5.g.a.f81814k, mVar);
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    u uVar = u.f22885a;
                    eVar.invoke(mVar, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                q42.e.a((i) obj5, (e23.a) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ((q81.i) obj5).h((Map.Entry) obj4, (r) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                x3 x3Var = (x3) obj5;
                e23.a aVar3 = (e23.a) obj4;
                x3 x3Var2 = (x3) obj3;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    z02.d.a(((Boolean) x3Var.getF182175a()).booleanValue(), z3.f.c(-449218722, new p40.r(aVar3, i17), mVar2), null, null, null, z3.f.c(-1395690022, new dv0.l(x3Var2, i19), mVar2), mVar2, 196656, 28);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                qk0.g.a((t) obj5, (e23.a) obj4, (e23.a) obj3, (m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 6:
                p1 p1Var2 = (p1) obj5;
                e23.a aVar4 = (e23.a) obj4;
                p1 p1Var3 = (p1) obj3;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    w wVar = w.f111301a;
                    String strQ = gl1.y.Q(mVar3, R.string.lbl_apply);
                    boolean zB = mVar3.B(p1Var2) | mVar3.B(aVar4);
                    Object objQ2 = mVar3.q();
                    if (zB) {
                        objQ2 = new o0(p1Var2, p1Var3, aVar4, 8);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new o0(p1Var2, p1Var3, aVar4, 8);
                            mVar3.K(objQ2);
                        }
                    }
                    wVar.j(0, (e23.a) objQ2, strQ, mVar3);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 7:
                m0 m0Var = (m0) obj5;
                o oVar = (o) obj4;
                e23.a aVar5 = (e23.a) obj3;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    qn0.l lVar = qn0.l.INSTANCE;
                    boolean zR = mVar4.r(oVar) | mVar4.r(m0Var) | mVar4.B(aVar5);
                    Object objQ3 = mVar4.q();
                    if (zR) {
                        objQ3 = new p90.h(oVar, 13, aVar5, m0Var);
                        mVar4.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new p90.h(oVar, 13, aVar5, m0Var);
                            mVar4.K(objQ3);
                        }
                    }
                    nc.y.a(m0Var, lVar, null, null, null, null, null, null, null, (l) objQ3, mVar4, 48, 2044);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 8:
                FBTProgressReportActivity fBTProgressReportActivity = (FBTProgressReportActivity) obj5;
                vv1.c cVar2 = (vv1.c) obj4;
                m0 m0Var2 = (m0) obj3;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                FBTProgressReportActivity.a aVar6 = FBTProgressReportActivity.f45512b;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    qv1.b bVarCa = fBTProgressReportActivity.ca();
                    uv1.c cVar3 = cVar2.f180515h;
                    if (cVar3 == null) {
                        cVar3 = uv1.c.OPEN_LOOP;
                    }
                    wv1.b.a(fBTProgressReportActivity, bVarCa, cVar3, cVar2, m0Var2, mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 9:
                rx.a aVar7 = (rx.a) obj5;
                bx.b bVar = (bx.b) obj4;
                gs1.t tVar = (gs1.t) obj3;
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    x0 x0Var = x0.f111346a;
                    g6.f.a aVar8 = g6.f.f75994b;
                    x0Var.e(c2.l.y(r.S, 16), z3.f.c(-890925256, new ng2.i(aVar7, 12, bVar, tVar), mVar6), mVar6, (x0.f111348c << 6) | 54, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 10:
                String str = (String) obj5;
                e23.a aVar9 = (e23.a) obj4;
                p1 p1Var4 = (p1) obj3;
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    i53.f fVarA = i53.a.a(new i3("exit", gl1.y.Q(mVar7, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB2 = mVar7.B(p1Var4);
                    Object objQ4 = mVar7.q();
                    if (zB2) {
                        objQ4 = new b(p1Var4, i18);
                        mVar7.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new b(p1Var4, i18);
                            mVar7.K(objQ4);
                        }
                    }
                    z02.f.d(str, null, null, aVar9, fVarA, null, (l) objQ4, mVar7, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 11:
                z3.e eVar2 = (z3.e) obj5;
                e23.a aVar10 = (e23.a) obj4;
                p1 p1Var5 = (p1) obj3;
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    eVar2.invoke(mVar8, 0);
                    if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                        mVar8.C(1946605236);
                        boolean zB3 = mVar8.B(p1Var5);
                        Object objQ5 = mVar8.q();
                        if (zB3) {
                            objQ5 = new qk0.m(p1Var5, 2);
                            mVar8.K(objQ5);
                        } else {
                            aVar.getClass();
                            if (objQ5 == m.a.f135155b) {
                                objQ5 = new qk0.m(p1Var5, 2);
                                mVar8.K(objQ5);
                            }
                        }
                        oi0.c.b(aVar10, (e23.a) objQ5, mVar8, 0);
                        mVar8.f();
                    } else {
                        mVar8.C(1946798397);
                        mVar8.f();
                    }
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 12:
                x3 x3Var3 = (x3) obj5;
                MultiDayActivitiesEditActivity multiDayActivitiesEditActivity = (MultiDayActivitiesEditActivity) obj4;
                x3 x3Var4 = (x3) obj3;
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                MultiDayActivitiesEditActivity.a aVar11 = MultiDayActivitiesEditActivity.f39291b;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    i53.f fVar = (i53.f) x3Var4.getF182175a();
                    sy0.f fVar2 = ((sy0.j) x3Var3.getF182175a()).f161230e;
                    boolean zR2 = mVar9.r(multiDayActivitiesEditActivity);
                    Object objQ6 = mVar9.q();
                    if (zR2) {
                        objQ6 = new qy0.f(multiDayActivitiesEditActivity, 5);
                        mVar9.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new qy0.f(multiDayActivitiesEditActivity, 5);
                            mVar9.K(objQ6);
                        }
                    }
                    jy0.i.b(fVar, fVar2, (l) objQ6, mVar9, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 13:
                s11.d dVar = (s11.d) obj5;
                NutritionActivity.g gVar2 = (NutritionActivity.g) obj4;
                e23.a aVar12 = (e23.a) obj3;
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    String strT = gl1.d.T(dVar.f155896r, mVar10, 0);
                    i53.f fVarA2 = i53.a.a(new i3("SAVE", gl1.y.Q(mVar10, R.string.lbl_save), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB4 = mVar10.B(aVar12);
                    Object objQ7 = mVar10.q();
                    if (zB4) {
                        objQ7 = new m8(aVar12, 26);
                        mVar10.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new m8(aVar12, 26);
                            mVar10.K(objQ7);
                        }
                    }
                    z02.f.d(strT, null, null, gVar2, fVarA2, null, (l) objQ7, mVar10, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 14:
                Set set = (Set) obj5;
                q11.a aVar13 = (q11.a) obj4;
                e23.a aVar14 = (e23.a) obj3;
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    if (set.isEmpty()) {
                        mVar11.C(1353528375);
                        q11.a.INSTANCE.getClass();
                        aVar13.getClass();
                        int i28 = q11.a.Companion.C2667a.f142075a[aVar13.ordinal()];
                        if (i28 == 1) {
                            i14 = 122682538;
                            i15 = R.string.label_move;
                        } else if (i28 == 2) {
                            i14 = 122684616;
                            i15 = R.string.lbl_copy;
                        } else {
                            if (i28 != 3) {
                                throw n23.j.m(mVar11, 122681511);
                            }
                            i14 = 122686705;
                            i15 = R.string.lbl_common_remove;
                        }
                        strP = sn.a.h(mVar11, i14, i15, mVar11);
                        mVar11.f();
                    } else {
                        mVar11.C(1353592576);
                        strP = gl1.y.P(R.string.common_selected_number_1, new Object[]{Integer.valueOf(set.size())}, mVar11);
                        mVar11.f();
                    }
                    z02.f.c(0, 54, null, aVar14, null, strP, mVar11, null);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                r21.a.b((r) obj5, (l01.a) obj4, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                final r22.e0 e0Var = (r22.e0) obj3;
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                r22.e0.a aVar15 = r22.e0.f149637b;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    c1 c1Var = c1.f110940a;
                    if (str2.length() == 0) {
                        strP2 = sn.a.h(mVar12, 1207257774, R.string.activity_edit_delete_button_title, mVar12);
                    } else {
                        mVar12.C(1207363050);
                        strP2 = gl1.y.P(R.string.lbl_delete_item, new Object[]{str2}, mVar12);
                        mVar12.f();
                    }
                    String str4 = strP2;
                    String strQ2 = gl1.y.Q(mVar12, R.string.lbl_delete);
                    String strQ3 = gl1.y.Q(mVar12, R.string.lbl_cancel);
                    boolean zR3 = mVar12.r(e0Var);
                    Object objQ8 = mVar12.q();
                    if (zR3) {
                        objQ8 = new e23.a() { // from class: r22.d0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        e0 e0Var2 = e0Var;
                                        e23.a<Unit> aVar16 = e0Var2.f149638a;
                                        if (aVar16 != null) {
                                            aVar16.invoke();
                                        }
                                        e0Var2.dismiss();
                                        break;
                                    default:
                                        e0Var.dismiss();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == m.a.f135155b) {
                            objQ8 = new e23.a() { // from class: r22.d0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i25) {
                                        case 0:
                                            e0 e0Var2 = e0Var;
                                            e23.a<Unit> aVar16 = e0Var2.f149638a;
                                            if (aVar16 != null) {
                                                aVar16.invoke();
                                            }
                                            e0Var2.dismiss();
                                            break;
                                        default:
                                            e0Var.dismiss();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar12.K(objQ8);
                        }
                    }
                    e23.a<Unit> aVar16 = (e23.a) objQ8;
                    boolean zR4 = mVar12.r(e0Var);
                    Object objQ9 = mVar12.q();
                    if (zR4) {
                        objQ9 = new e23.a() { // from class: r22.d0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        e0 e0Var2 = e0Var;
                                        e23.a<Unit> aVar17 = e0Var2.f149638a;
                                        if (aVar17 != null) {
                                            aVar17.invoke();
                                        }
                                        e0Var2.dismiss();
                                        break;
                                    default:
                                        e0Var.dismiss();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == m.a.f135155b) {
                            objQ9 = new e23.a() { // from class: r22.d0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            e0 e0Var2 = e0Var;
                                            e23.a<Unit> aVar17 = e0Var2.f149638a;
                                            if (aVar17 != null) {
                                                aVar17.invoke();
                                            }
                                            e0Var2.dismiss();
                                            break;
                                        default:
                                            e0Var.dismiss();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar12.K(objQ9);
                        }
                    }
                    c1Var.a(false, str4, str3, null, null, strQ2, true, false, aVar16, strQ3, (e23.a) objQ9, mVar12, 1572864, 0, 153);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 17:
                DashboardActivity dashboardActivity = (DashboardActivity) obj5;
                DashboardRoute dashboardRoute = (DashboardRoute) obj4;
                p1 p1Var6 = (p1) obj3;
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                int i29 = DashboardActivity.f33444q;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    dashboardActivity.ea(((Boolean) p1Var6.getF182175a()).booleanValue());
                    com.garmin.android.apps.connectmobile.dashboard.presentation.d dVarNa = dashboardActivity.na();
                    z zVar = (z) dashboardActivity.f33446f.getValue();
                    u70.i iVar = (u70.i) dashboardActivity.f33447g.getValue();
                    t70.q qVar = (t70.q) dashboardActivity.f33448h.getValue();
                    n70.g gVar3 = dashboardActivity.f33449i;
                    boolean zR5 = mVar13.r(dashboardActivity);
                    Object objQ10 = mVar13.q();
                    if (zR5) {
                        objQ10 = new qw0.y(dashboardActivity, 10);
                        mVar13.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == m.a.f135155b) {
                            objQ10 = new qw0.y(dashboardActivity, 10);
                            mVar13.K(objQ10);
                        }
                    }
                    l lVar2 = (l) objQ10;
                    boolean zR6 = mVar13.r(dashboardActivity);
                    Object objQ11 = mVar13.q();
                    if (zR6) {
                        objQ11 = new r70.e(dashboardActivity, 0);
                        mVar13.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == m.a.f135155b) {
                            objQ11 = new r70.e(dashboardActivity, 0);
                            mVar13.K(objQ11);
                        }
                    }
                    e23.a aVar17 = (e23.a) objQ11;
                    Object objQ12 = mVar13.q();
                    aVar.getClass();
                    if (objQ12 == m.a.f135155b) {
                        objQ12 = new b(p1Var6, i17);
                        mVar13.K(objQ12);
                    }
                    DashboardRoute.Companion companion = DashboardRoute.INSTANCE;
                    v70.c.a(dashboardRoute, dVarNa, zVar, qVar, iVar, gVar3, lVar2, aVar17, (l) objQ12, mVar13, 100663296);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.dashboard.presentation.a.b((com.garmin.android.apps.connectmobile.dashboard.presentation.d) obj5, (l) obj4, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                com.garmin.android.apps.connectmobile.dashboard.presentation.d dVar2 = (com.garmin.android.apps.connectmobile.dashboard.presentation.d) obj5;
                e23.a aVar18 = (e23.a) obj4;
                p1 p1Var7 = (p1) obj3;
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    Object objQ13 = mVar14.q();
                    aVar.getClass();
                    if (objQ13 == m.a.f135155b) {
                        objQ13 = new qk0.m(p1Var7, 24);
                        mVar14.K(objQ13);
                    }
                    c0.c(dVar2, null, (e23.a) objQ13, aVar18, mVar14, 384, 2);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                rk0.h.e((r) obj5, (ArrayList) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                HelpActivity helpActivity = (HelpActivity) obj5;
                b92.a aVar19 = (b92.a) obj4;
                p1 p1Var8 = (p1) obj3;
                m mVar15 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                HelpActivity.a aVar20 = HelpActivity.f36653a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    String str5 = (String) p1Var8.getF182175a();
                    boolean zR7 = mVar15.r(helpActivity);
                    Object objQ14 = mVar15.q();
                    if (zR7) {
                        objQ14 = new ro0.g(helpActivity, i25);
                        mVar15.K(objQ14);
                    } else {
                        aVar.getClass();
                        if (objQ14 == m.a.f135155b) {
                            objQ14 = new ro0.g(helpActivity, i25);
                            mVar15.K(objQ14);
                        }
                    }
                    int i30 = b92.a.f16960b;
                    z02.f.c(0, 38, aVar19, (e23.a) objQ14, null, str5, mVar15, null);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 22:
                p1 p1Var9 = (p1) obj5;
                Context context = (Context) obj4;
                b0 b0Var = (b0) obj3;
                m mVar16 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    int i34 = ro0.t.a.f153886a[((g3) p1Var9.getF182175a()).f35300a.ordinal()];
                    if (i34 == 1) {
                        mVar16.C(-40098434);
                        mVar16.f();
                    } else if (i34 == 2) {
                        mVar16.C(-40001869);
                        r.a aVar21 = r.S;
                        float f14 = 16;
                        g6.f.a aVar22 = g6.f.f75994b;
                        c2.l.f(c2.l.C(aVar21, 0.0f, f14, 0.0f, 0.0f, 13), mVar16);
                        r rVarB = a2.b(x2.f(aVar21, 1.0f), a2.a(mVar16), true);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar16, 0);
                        int iHashCode2 = Long.hashCode(mVar16.getU());
                        i2 i2VarX2 = mVar16.x();
                        r rVarC2 = k.c(rVarB, mVar16);
                        h5.g.V.getClass();
                        e0.a aVar23 = h5.g.a.f81805b;
                        if (mVar16.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar16.z();
                        if (mVar16.getT()) {
                            mVar16.M(aVar23);
                        } else {
                            mVar16.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar16);
                        b4.c(h5.g.a.f81809f, i2VarX2, mVar16);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar16.getT() || !s.g(mVar16.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar16, iHashCode2, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar16);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        List<bm2.c> list2 = (List) ((g3) p1Var9.getF182175a()).f35301b;
                        if (list2 == null) {
                            mVar16.C(1604278544);
                            mVar16.f();
                        } else {
                            mVar16.C(1604278545);
                            for (bm2.c cVar4 : list2) {
                                p2 p2Var = p2.f111205a;
                                String f143516f = cVar4.getF143516f();
                                if (f143516f == null) {
                                    f143516f = "";
                                }
                                String str6 = f143516f;
                                ro0.b.f153750a.getClass();
                                z3.e eVar3 = ro0.b.f153751b;
                                boolean zR8 = mVar16.r(b0Var) | mVar16.r(context) | mVar16.r(cVar4);
                                Object objQ15 = mVar16.q();
                                if (zR8) {
                                    objQ15 = new v(b0Var, 17, context, cVar4);
                                    mVar16.K(objQ15);
                                } else {
                                    aVar.getClass();
                                    if (objQ15 == m.a.f135155b) {
                                        objQ15 = new v(b0Var, 17, context, cVar4);
                                        mVar16.K(objQ15);
                                    }
                                }
                                p2Var.g(str6, null, null, null, eVar3, false, false, (e23.a) objQ15, mVar16, 24576, 238);
                            }
                            mVar16.f();
                        }
                        c2.l.f(c2.l.C(r.S, 0.0f, f14, 0.0f, 0.0f, 13), mVar16);
                        p2 p2Var2 = p2.f111205a;
                        String strQ4 = gl1.y.Q(mVar16, R.string.wear_and_care_tips);
                        ro0.b.f153750a.getClass();
                        z3.e eVar4 = ro0.b.f153752c;
                        boolean zR9 = mVar16.r(context);
                        Object objQ16 = mVar16.q();
                        if (zR9) {
                            objQ16 = new o72.f(context, 29);
                            mVar16.K(objQ16);
                        } else {
                            aVar.getClass();
                            if (objQ16 == m.a.f135155b) {
                                objQ16 = new o72.f(context, 29);
                                mVar16.K(objQ16);
                            }
                        }
                        p2Var2.g(strQ4, null, null, null, eVar4, false, false, (e23.a) objQ16, mVar16, 24576, 238);
                        mVar16.y();
                        mVar16.f();
                    } else {
                        if (i34 != 3) {
                            throw n23.j.m(mVar16, 2076916603);
                        }
                        mVar16.C(-38022178);
                        mVar16.f();
                    }
                    x1 x1Var17 = n.f135158a;
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                rr0.j.a((Integer) obj5, (Integer) obj4, (Integer) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                rv1.i.c((vt1.o) obj5, (List) obj4, (vv1.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                rv1.p.b((yw1.c) obj5, (yw1.c) obj4, (yw1.c) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                rv1.p.c((yw1.d) obj5, (yw1.d) obj4, (yw1.d) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                rw0.f.a((r) obj5, (l) obj4, (l) obj3, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                rw1.d.a((androidx.fragment.app.m) obj5, (r) obj4, (sw1.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                rx1.b.a((r) obj5, (dy1.b) obj4, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f139523a = i15;
        this.f139524b = obj;
        this.f139525c = obj2;
        this.f139526d = obj3;
    }
}
