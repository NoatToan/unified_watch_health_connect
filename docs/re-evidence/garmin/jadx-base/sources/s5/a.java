package s5;

import am.a2;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.health.presentation.HealthFullScreenChartActivity;
import com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotActivity;
import com.garmin.android.apps.connectmobile.calories.presentation.CaloriesReportsActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.managecard.FitPayCardDetailsActivity;
import com.garmin.feature.garminpay.ui.userwallet.CardDetailsActivity;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.t1;
import o4.l1;
import o53.p1;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p3.x1;
import p3.y3;
import r1.q2;
import r53.p2;
import s70.q1;
import ta0.i1;
import v62.s9;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f157122b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f157121a = i14;
        this.f157122b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0321  */
    /* JADX WARN: Code duplicated, block: B:116:0x032a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0535  */
    /* JADX WARN: Code duplicated, block: B:157:0x0551  */
    /* JADX WARN: Code duplicated, block: B:174:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:218:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:236:0x0749  */
    /* JADX WARN: Code duplicated, block: B:250:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:278:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:288:0x08cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:319:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:87:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:90:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:95:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:96:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:99:0x0301  */
    /* JADX WARN: Instruction removed from duplicated block: B:291:0x08d3, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v102, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        double d14;
        Object obj3;
        boolean z14;
        boolean z15;
        t70.p0 p0Var;
        boolean z16;
        ArrayList arrayList;
        int i14 = this.f157121a;
        int i15 = -1;
        int i16 = 9;
        int i17 = 12;
        p3.m.a aVar = p3.m.f135153a;
        ?? r14 = 0;
        int i18 = 2;
        boolean z17 = false;
        Object obj4 = this.f157122b;
        switch (i14) {
            case 0:
                return Boolean.valueOf(((n0) obj4).a(l1.k((RectF) obj), l1.k((RectF) obj2)));
            case 1:
                ((Integer) obj2).getClass();
                int i19 = s52.g.f157408g;
                ((s52.g) obj4).g((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.workouts.data.model.b bVar = (com.garmin.android.apps.connectmobile.workouts.data.model.b) obj4;
                com.garmin.android.apps.connectmobile.workouts.data.model.l lVar = (com.garmin.android.apps.connectmobile.workouts.data.model.l) obj;
                com.garmin.android.apps.connectmobile.workouts.data.model.l lVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.l) obj2;
                String strF = bVar.getBenchmarkCategoryKey();
                String strG = bVar.getBenchmarkKey();
                return Integer.valueOf((p005kotlin.jvm.internal.s.g(lVar.getCategoryKey(), strF) && p005kotlin.jvm.internal.s.g(lVar.getExerciseKey(), strG)) ? -1 : (p005kotlin.jvm.internal.s.g(lVar.getCategoryKey(), strF) && p005kotlin.jvm.internal.s.g(lVar2.getExerciseKey(), strG)) ? 1 : 0);
            case 3:
                int iIntValue = ((Integer) obj).intValue();
                t13.g.a aVar2 = (t13.g.a) obj2;
                t13.g.b<?> key = aVar2.getKey();
                t13.g.a aVar3 = ((s53.x) obj4).f157602b.get(key);
                if (key == o53.l1.f129368i0) {
                    o53.l1 l1Var = (o53.l1) aVar3;
                    o53.l1 parent = (o53.l1) aVar2;
                    while (parent != null) {
                        if (parent != l1Var && (parent instanceof u53.t)) {
                            o53.o oVar = (o53.o) p1.f129382b.get((u53.t) parent);
                            parent = oVar != null ? oVar.getParent() : null;
                        } else {
                            r14 = parent;
                            if (r14 == l1Var) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + r14 + ", expected child of " + l1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (l1Var != null) {
                                iIntValue++;
                            }
                        }
                    }
                    if (r14 == l1Var) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + r14 + ", expected child of " + l1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (l1Var != null) {
                        iIntValue++;
                    }
                } else if (aVar2 != aVar3) {
                    iIntValue = Integer.MIN_VALUE;
                } else {
                    iIntValue++;
                }
                return Integer.valueOf(iIntValue);
            case 4:
                ((Integer) obj2).getClass();
                s70.c0.g((o70.a0) obj4, (p3.m) obj, p3.p0.t(9));
                return Unit.INSTANCE;
            case 5:
                s70.g0 g0Var = (s70.g0) obj4;
                androidx.lifecycle.b0.a aVar4 = (androidx.lifecycle.b0.a) obj2;
                ((androidx.lifecycle.n0) obj).getClass();
                aVar4.getClass();
                if (aVar4 == androidx.lifecycle.b0.a.ON_RESUME) {
                    p2 p2Var = g0Var.f157698a.f194659a.f124431d.f124473d;
                    p2Var.k(null, Boolean.valueOf(!((Boolean) p2Var.getValue()).booleanValue()));
                }
                return Unit.INSTANCE;
            case 6:
                j70.r rVar = (j70.r) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    c2.j.i iVarI2 = c2.j.i(eVar.f97917b);
                    g6.f.a aVar5 = g6.f.f75994b;
                    c2.t0.a(c2.l.A(h4.r.S, 0.0f, 10, 1), iVarI, iVarI2, null, 0, 0, z3.f.c(1879498187, new q1(rVar, z17 ? 1 : 0), mVar), mVar, 1572870, 56);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 7:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                wa2.b bVar2 = sa2.c.f158325a;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                ((pg2.d) obj4).invoke(Boolean.TRUE);
                return Unit.INSTANCE;
            case 8:
                sg0.q0 q0Var = (sg0.q0) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_child_account);
                    boolean zB = mVar2.B(q0Var);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new ro0.g(q0Var, 23);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ro0.g(q0Var, 23);
                            mVar2.K(objQ);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ, null, strQ, mVar2, null);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 9:
                sg0.q0 q0Var2 = (sg0.q0) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    boolean zB2 = mVar3.B(q0Var2);
                    Object objQ2 = mVar3.q();
                    if (zB2) {
                        objQ2 = new ro0.g(q0Var2, 25);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ro0.g(q0Var2, 25);
                            mVar3.K(objQ2);
                        }
                    }
                    z02.f.c(6, 54, null, (e23.a) objQ2, null, "_Child", mVar3, null);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                og.a.b((sg0.p0) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                og2.k.i((sg0.p0) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 12:
                rk0.y yVar = (rk0.y) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    String strQ2 = gl1.y.Q(mVar4, R.string.lbl_child_accounts);
                    boolean zB3 = mVar4.B(yVar);
                    Object objQ3 = mVar4.q();
                    if (zB3) {
                        objQ3 = new sg0.w0(yVar, z17 ? 1 : 0);
                        mVar4.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new sg0.w0(yVar, z17 ? 1 : 0);
                            mVar4.K(objQ3);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ3, null, strQ2, mVar4, null);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                si1.h.d((ti1.b) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 14:
                gg1.o0 o0Var = (gg1.o0) obj4;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    NumberFormat integerInstance = NumberFormat.getIntegerInstance();
                    int i24 = sk0.p.b.f159796a[o0Var.ordinal()];
                    if (i24 == 1 || i24 == 2) {
                        l3.f23124b.getClass();
                        d14 = 1.000001299968E9d;
                    } else {
                        if (i24 != 3) {
                            lc.u0.r();
                            return null;
                        }
                        l3.f23124b.getClass();
                        d14 = 9.99999E8d;
                    }
                    double d15 = d14;
                    uk0.i iVar = uk0.i.f171830a;
                    integerInstance.getClass();
                    iVar.getClass();
                    sk0.p.f(uk0.i.e(d15, o0Var, integerInstance, mVar5, 3072), mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 15:
                GearActivity.w wVar = (GearActivity.w) obj4;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    z02.f.c(0, 54, null, wVar, null, gl1.y.Q(mVar6, R.string.lbl_select_gear_type), mVar6, null);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 16:
                SleepReportsActivity sleepReportsActivity = (SleepReportsActivity) obj4;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                SleepReportsActivity.a aVar6 = SleepReportsActivity.f44239b;
                if (mVar7.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    lc.m0 m0VarI = gl1.y.I(new lc.v0[0], mVar7);
                    sm1.l lVar3 = sm1.l.INSTANCE;
                    boolean zR = mVar7.r(sleepReportsActivity) | mVar7.r(m0VarI);
                    Object objQ4 = mVar7.q();
                    if (zR) {
                        obj3 = objQ4;
                        rk0.g gVar = new rk0.g(26, sleepReportsActivity, m0VarI);
                        mVar7.K(gVar);
                        obj3 = gVar;
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            obj3 = objQ4;
                            rk0.g gVar2 = new rk0.g(26, sleepReportsActivity, m0VarI);
                            mVar7.K(gVar2);
                            obj3 = gVar2;
                        }
                    }
                    obj3 = objQ4;
                    nc.y.a(m0VarI, lVar3, null, null, null, null, null, null, null, (e23.l) obj3, mVar7, 48, 2044);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                sn0.e.d((in0.m) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 18:
                CaloriesReportsActivity caloriesReportsActivity = (CaloriesReportsActivity) obj4;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i25 = CaloriesReportsActivity.f31240b;
                if (mVar8.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    sy.k kVar = (sy.k) caloriesReportsActivity.f31241a.getValue();
                    boolean zR2 = mVar8.r(caloriesReportsActivity);
                    Object objQ5 = mVar8.q();
                    if (zR2) {
                        objQ5 = new sg0.w0(caloriesReportsActivity, 7);
                        mVar8.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new sg0.w0(caloriesReportsActivity, 7);
                            mVar8.K(objQ5);
                        }
                    }
                    e23.a aVar7 = (e23.a) objQ5;
                    boolean zR3 = mVar8.r(caloriesReportsActivity);
                    Object objQ6 = mVar8.q();
                    if (zR3) {
                        objQ6 = new s70.b0(caloriesReportsActivity, i17);
                        mVar8.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new s70.b0(caloriesReportsActivity, i17);
                            mVar8.K(objQ6);
                        }
                    }
                    sy.j.a(kVar, aVar7, (e23.l) objQ6, mVar8, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 19:
                sz1.q qVar = (sz1.q) obj4;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    g6.f.a aVar8 = g6.f.f75994b;
                    h4.r rVarH = x2.h(c2.l.A(rVarF, eVar2.f97920e, 0.0f, 2), 300);
                    i53.c<m92.h0.e.a> cVar = qVar.f161568a;
                    float f15 = eVar2.f97916a;
                    gl.c.f77766a.getClass();
                    m92.m.d dVar = new m92.m.d(gl.c.a(mVar9).f(), r14);
                    float f16 = j92.b.f97900c.f97910b;
                    long jF = gl.c.a(mVar9).f();
                    n92.j jVar2 = new n92.j(new d02.c(), qVar.f161571d, qVar.f161570c, 0, 8, null);
                    i53.c<String> cVar2 = qVar.f161569b;
                    y3 y3Var = t1.f91493k;
                    w5.q.b bVar3 = (w5.q.b) mVar9.A(y3Var);
                    y3 y3Var2 = t1.f91490h;
                    g6.d dVar2 = new g6.d(((g6.c) mVar9.A(y3Var2)).getF69050b(), 1.0f);
                    y3 y3Var3 = t1.f91496n;
                    s0 s0Var = new s0(bVar3, dVar2, (g6.o) mVar9.A(y3Var3), 0, 8, null);
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97935l;
                    m92.c0.a(rVarH, "", f15, dVar, true, f16, o4.d0.a(jF), cVar, null, null, false, gl1.y.Q(mVar9, R.string.common_no_data), new n92.a(jVar2, null, new n92.g(q2.f(mVar9), new s0((w5.q.b) mVar9.A(y3Var), new g6.d(((g6.c) mVar9.A(y3Var2)).getF69050b(), 1.0f), (g6.o) mVar9.A(y3Var3), 0, 8, null), d92.c.f(x0Var, mVar9), null, 8, null), new n92.i(cVar2, true, true, s0Var, d92.c.f(x0Var, mVar9), null, 0.0f, 0.0f, 224, null), 2, null), null, null, mVar9, 24624, 0, 110336);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 20:
                u21.o oVar2 = (u21.o) obj4;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    if (oVar2.f168055i) {
                        mVar10.C(659481851);
                        mVar10.f();
                    } else {
                        mVar10.C(659214848);
                        h4.r.a aVar9 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarQ = x2.q(aVar9, j92.b.f97901d.f97904c);
                        s62.a.f157643a.getClass();
                        u1.y0.b(s9.a(t62.b.f162798a), null, rVarQ, null, mVar10, 48, 120);
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                t21.s0.a((s21.c0) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 22:
                t70.x0 x0Var2 = (t70.x0) obj4;
                i02.f fVar = (i02.f) obj;
                i02.f fVar2 = (i02.f) obj2;
                fVar.getClass();
                fVar2.getClass();
                ArrayList arrayList2 = x0Var2.f163069y;
                p2 p2Var2 = x0Var2.f163049c;
                List list = (List) p2Var2.getValue();
                int i26 = fVar.f86851a;
                boolean z18 = p13.h0.e0(i26, list) instanceof t70.p0.d;
                Iterator it = ((List) p2Var2.getValue()).iterator();
                int i27 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i27 = -1;
                    } else if (!p005kotlin.jvm.internal.s.g(((t70.p0) it.next()).f162944a, fVar2.f86852b)) {
                        i27++;
                    }
                }
                Iterator it3 = ((List) p2Var2.getValue()).iterator();
                int i28 = 0;
                while (it3.hasNext()) {
                    if (p005kotlin.jvm.internal.s.g(((t70.p0) it3.next()).f162944a, fVar.f86852b)) {
                        i15 = i28;
                        if ((p13.h0.e0(i15, (List) p2Var2.getValue()) instanceof t70.p0.b) || i15 >= i27) {
                            z14 = false;
                        } else {
                            Object objE0 = p13.h0.e0(i15, (List) p2Var2.getValue());
                            objE0.getClass();
                            if (((t70.p0.b) objE0).f162948c) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                        if (p13.h0.e0(i26, (List) p2Var2.getValue()) instanceof t70.p0.a) {
                            Iterable iterable = (Iterable) p2Var2.getValue();
                            arrayList = new ArrayList();
                            for (Object obj5 : iterable) {
                                if (obj5 instanceof t70.p0.d) {
                                    arrayList.add(obj5);
                                }
                            }
                            if (p13.h0.U(arrayList, arrayList2.size()).isEmpty()) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        } else {
                            z15 = false;
                        }
                        p0Var = (t70.p0) p13.h0.e0(i15, (List) p2Var2.getValue());
                        if (p005kotlin.jvm.internal.s.g(p0Var != null ? p0Var.f162944a : null, "HEADER_STATS_ADDITIONAL") || ((i15 >= i27 || arrayList2.size() % 2 != 0) && (i15 <= i27 || arrayList2.size() % 2 == 0))) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        return Boolean.valueOf(!z18 || z14 || z15 || z16);
                    }
                    i28++;
                }
                if (p13.h0.e0(i15, (List) p2Var2.getValue()) instanceof t70.p0.b) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                if (p13.h0.e0(i26, (List) p2Var2.getValue()) instanceof t70.p0.a) {
                    Iterable iterable2 = (Iterable) p2Var2.getValue();
                    arrayList = new ArrayList();
                    while (r2.hasNext()) {
                        if (obj5 instanceof t70.p0.d) {
                            arrayList.add(obj5);
                        }
                    }
                    if (p13.h0.U(arrayList, arrayList2.size()).isEmpty()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                } else {
                    z15 = false;
                }
                p0Var = (t70.p0) p13.h0.e0(i15, (List) p2Var2.getValue());
                if (p005kotlin.jvm.internal.s.g(p0Var != null ? p0Var.f162944a : null, "HEADER_STATS_ADDITIONAL")) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                return Boolean.valueOf(!z18 || z14 || z15 || z16);
            case 23:
                ((Integer) obj2).getClass();
                i1.a((ca0.u0) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 24:
                l90.k kVar2 = (l90.k) obj4;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    o90.a aVar10 = kVar2.f111582f.f111526k;
                    h4.r.a aVar11 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    da0.f.b(aVar10, x2.q(aVar11, j92.b.f97901d.f97905d), mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 25:
                sg1.c cVar3 = (sg1.c) obj4;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    String str = cVar3.f159203a;
                    String str2 = cVar3.f159204b;
                    g6.f.a aVar12 = g6.f.f75994b;
                    jf.r.b(str, str2, x2.q(h4.r.S, 72), n5.c.a(2131231499, mVar12, 0), n5.c.a(2131231499, mVar12, 0), null, null, null, null, null, null, null, mVar12, 384, 0, 32736);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                tl.e.a((yl.b) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 27:
                HealthSnapshotActivity healthSnapshotActivity = (HealthSnapshotActivity) obj4;
                int iIntValue14 = ((Integer) obj).intValue();
                List list2 = (List) obj2;
                HealthSnapshotActivity.a aVar13 = HealthSnapshotActivity.f29015d;
                list2.getClass();
                HealthFullScreenChartActivity.a aVar14 = HealthFullScreenChartActivity.f29014p;
                im.e eVar3 = new im.e(iIntValue14);
                aVar14.getClass();
                Intent intent = new Intent(healthSnapshotActivity, (Class<?>) HealthFullScreenChartActivity.class);
                Bundle bundle = new Bundle();
                a2.a("CHART_LIST_EXTRAS", bundle, list2);
                a2.b(bundle, "extra_activity_chart_type", eVar3);
                intent.putExtras(bundle);
                healthSnapshotActivity.startActivity(intent);
                return Unit.INSTANCE;
            case 28:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                FitPayCardDetailsActivity.a aVar15 = FitPayCardDetailsActivity.F;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                ((tp2.a) obj4).invoke();
                return Unit.INSTANCE;
            default:
                DialogInterface dialogInterface3 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                CardDetailsActivity.b bVar4 = CardDetailsActivity.f52166n;
                dialogInterface3.getClass();
                dialogInterface3.dismiss();
                vr2.c cVar4 = ((CardDetailsActivity) obj4).f52170i;
                if (cVar4 == null) {
                    p005kotlin.jvm.internal.s.m("cardDetailsViewModel");
                    throw null;
                }
                androidx.lifecycle.y0<Boolean> y0Var = cVar4.f179573k;
                y0Var.m(Boolean.TRUE);
                List<? extends fs2.a> list3 = cVar4.f179565c;
                if (list3 == null) {
                    p005kotlin.jvm.internal.s.m("deviceWalletItems");
                    throw null;
                }
                Set setU = c53.c0.u(c53.c0.o(c53.c0.h(p13.h0.M(p13.h0.N0(list3, new vr2.d())), new vn2.b1(i17)), new vn2.b1(13)));
                ArrayList arrayList3 = (ArrayList) cVar4.f179563a.d();
                List listS = arrayList3 != null ? c53.c0.s(c53.c0.o(c53.c0.h(new p13.g0(arrayList3), new a61.f(setU, i18)), new vn2.b1(i16))) : null;
                op2.e eVar4 = cVar4.f179566d;
                if (eVar4 != null) {
                    tn2.s0 s0Var2 = new tn2.s0(cVar4, 17, setU, listS);
                    setU.getClass();
                    if (eVar4.a()) {
                        aq2.b.f12463a.getClass();
                        if (aq2.b.f12464b) {
                            op2.e.f133186f.debug("removeCard: fitpay API is under maintenance, can not remove card");
                            s0Var2.invoke(wr2.q.b.API_UNDER_MAINTENANCE);
                        } else {
                            x53.c cVar5 = o53.s0.f129406a;
                            ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new op2.g(setU, eVar4, s0Var2, null), 3);
                        }
                    } else {
                        s0Var2.invoke(wr2.q.b.REMOVE_PRECONDITIONS_FAILED);
                    }
                } else {
                    y0Var.m(Boolean.FALSE);
                    Logger logger = vr2.c.f179562o;
                    List<? extends fs2.a> list4 = cVar4.f179565c;
                    if (list4 == null) {
                        p005kotlin.jvm.internal.s.m("deviceWalletItems");
                        throw null;
                    }
                    fs2.a aVar16 = (fs2.a) p13.h0.d0(list4);
                    logger.warn("Couldn't retrieve card remove operation manager for wallet item with provider type: " + (aVar16 != null ? aVar16.f73427b : null));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(Object obj, int i14, int i15) {
        this.f157121a = i15;
        this.f157122b = obj;
    }
}
