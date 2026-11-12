package ew1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.g3;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f66329b;

    public /* synthetic */ b0(d0 d0Var, int i14) {
        this.f66328a = i14;
        this.f66329b = d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0284  */
    /* JADX WARN: Code duplicated, block: B:114:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:119:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:124:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:129:0x0318  */
    /* JADX WARN: Code duplicated, block: B:134:0x0336  */
    /* JADX WARN: Code duplicated, block: B:139:0x0353  */
    /* JADX WARN: Code duplicated, block: B:144:0x0370  */
    /* JADX WARN: Code duplicated, block: B:149:0x038d  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z14;
        boolean z15;
        List<tw1.m> list;
        ww1.d0 trainingPlanSubType;
        List<tw1.m> list2;
        ww1.d0 trainingPlanSubType2;
        int i14 = this.f66328a;
        vt1.o oVar = null;
        d0 d0Var = this.f66329b;
        final int i15 = 2;
        final int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                d0.a aVar = d0.f66371e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1164102474, new b0(d0Var, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                d0.a aVar2 = d0.f66371e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    final Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    Unit unit = Unit.INSTANCE;
                    final d0 d0Var2 = this.f66329b;
                    boolean zR = mVar2.r(d0Var2);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        objQ = new d0.d(d0Var2, null);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new d0.d(d0Var2, null);
                            mVar2.K(objQ);
                        }
                    }
                    p3.l0.e((e23.p) objQ, unit, mVar2);
                    p3.p1 p1VarG = o53.f0.G(d0Var2.w6().A5(), mVar2);
                    p3.p1 p1VarG2 = o53.f0.G((androidx.lifecycle.s0) d0Var2.w6().R0.getValue(), mVar2);
                    final p3.p1 p1VarC = s9.c.c(d0Var2.w6().f13393z1, mVar2);
                    g.h hVar = new g.h();
                    boolean zR2 = mVar2.r(d0Var2);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new z(d0Var2, 4);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new z(d0Var2, 4);
                            mVar2.K(objQ2);
                        }
                    }
                    final c.q qVarC = c.w.c(hVar, (e23.l) objQ2, mVar2, 0);
                    boolean zV5 = d0Var2.w6().V5();
                    boolean zU5 = d0Var2.w6().U5();
                    boolean zW5 = d0Var2.w6().W5();
                    xw1.o oVarF = vt1.o.f180175f.f(context);
                    xw1.o oVarF2 = vt1.o.f180176g.f(context);
                    xw1.o oVarF3 = vt1.o.f180178i.f(context);
                    xw1.o oVarF4 = vt1.o.f180179j.f(context);
                    vt1.o oVarS5 = d0Var2.w6().S5();
                    boolean zR5 = d0Var2.w6().R5();
                    int iC5 = d0Var2.w6().C5("FBTCoachSelectionComposeFragment");
                    int iY5 = d0Var2.w6().Y5();
                    boolean z16 = d0Var2.w6().b8() || (d0Var2.w6().U6() && d0Var2.w6().Z6());
                    boolean z17 = d0Var2.w6().a8() || (d0Var2.w6().S6() && d0Var2.w6().Z6());
                    boolean zU6 = d0Var2.w6().U6();
                    aw1.h hVarW6 = d0Var2.w6();
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    boolean zL0 = com.garmin.android.apps.connectmobile.k1.f37122a.l0();
                    if (!hVarW6.R6() || zL0 || ((list2 = hVarW6.f13388u1) != null && list2.isEmpty())) {
                        z14 = false;
                    } else {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                tw1.m mVar3 = (tw1.m) it.next();
                                tw1.n trainingPlanType = mVar3.getTrainingPlanType();
                                if ((trainingPlanType != null ? trainingPlanType.b() : oVar) == vt1.o.f180179j && (trainingPlanSubType2 = mVar3.getTrainingPlanSubType()) != null && trainingPlanSubType2.b(ww1.l.FITNESS_OPEN_LOOP)) {
                                    z14 = true;
                                } else {
                                    oVar = null;
                                }
                            } else {
                                z14 = false;
                            }
                        }
                    }
                    boolean z18 = d0Var2.w6().f13383p1;
                    aw1.h hVarW7 = d0Var2.w6();
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    boolean zL1 = com.garmin.android.apps.connectmobile.k1.f37122a.l0();
                    if (!hVarW7.R6() || !((rt1.m) hVarW7.f13390w1.getValue()).E() || zL1 || ((list = hVarW7.f13388u1) != null && list.isEmpty())) {
                        z15 = false;
                    } else {
                        Iterator<T> it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                tw1.m mVar4 = (tw1.m) it3.next();
                                tw1.n trainingPlanType2 = mVar4.getTrainingPlanType();
                                if ((trainingPlanType2 != null ? trainingPlanType2.b() : null) == vt1.o.f180180k && (trainingPlanSubType = mVar4.getTrainingPlanSubType()) != null && trainingPlanSubType.b(ww1.l.FROG_OPEN_LOOP)) {
                                    z15 = true;
                                }
                            } else {
                                z15 = false;
                            }
                        }
                    }
                    boolean z19 = d0Var2.w6().s5(vt1.o.f180179j) && !((Boolean) p1VarC.getF182175a()).booleanValue();
                    boolean z24 = d0Var2.w6().s5(vt1.o.f180180k) && !((Boolean) p1VarC.getF182175a()).booleanValue();
                    boolean zR3 = mVar2.r(d0Var2);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new e23.a() { // from class: ew1.a0
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i16;
                                d0 d0Var3 = d0Var2;
                                switch (i17) {
                                    case 0:
                                        d0.a aVar4 = d0.f66371e;
                                        aw1.h hVarW8 = d0Var3.w6();
                                        ge1.b.T(androidx.lifecycle.v1.a(hVarW8), null, null, new aw1.b0(hVarW8, null), 3);
                                        break;
                                    case 1:
                                        d0.a aVar5 = d0.f66371e;
                                        fy1.c.f73884a.getClass();
                                        fy1.c.b("GarminCoachRunCoachPlanSelected");
                                        d0Var3.w6().o7(true);
                                        break;
                                    case 2:
                                        d0.a aVar6 = d0.f66371e;
                                        fy1.c.f73884a.getClass();
                                        fy1.c.b("GarminCoachCyclingCoachPlanSelected");
                                        d0Var3.w6().o7(false);
                                        break;
                                    default:
                                        d0.a aVar7 = d0.f66371e;
                                        fy1.c.f73884a.getClass();
                                        fy1.c.b("GarminCoachTriathlonCoachPlanSelected");
                                        aw1.h hVarW9 = d0Var3.w6();
                                        hVarW9.f8(null);
                                        hVarW9.g8(null);
                                        hVarW9.i8(vt1.m.FBT_ADAPTIVE);
                                        hVarW9.S7(vt1.o.f180178i, null);
                                        jv1.s sVarI6 = hVarW9.i6();
                                        hVarW9.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 511) : null);
                                        hVarW9.F6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ3);
                    } else {
                        aVar3.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: ew1.a0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i17 = i16;
                                    d0 d0Var3 = d0Var2;
                                    switch (i17) {
                                        case 0:
                                            d0.a aVar4 = d0.f66371e;
                                            aw1.h hVarW8 = d0Var3.w6();
                                            ge1.b.T(androidx.lifecycle.v1.a(hVarW8), null, null, new aw1.b0(hVarW8, null), 3);
                                            break;
                                        case 1:
                                            d0.a aVar5 = d0.f66371e;
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachRunCoachPlanSelected");
                                            d0Var3.w6().o7(true);
                                            break;
                                        case 2:
                                            d0.a aVar6 = d0.f66371e;
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachCyclingCoachPlanSelected");
                                            d0Var3.w6().o7(false);
                                            break;
                                        default:
                                            d0.a aVar7 = d0.f66371e;
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachTriathlonCoachPlanSelected");
                                            aw1.h hVarW9 = d0Var3.w6();
                                            hVarW9.f8(null);
                                            hVarW9.g8(null);
                                            hVarW9.i8(vt1.m.FBT_ADAPTIVE);
                                            hVarW9.S7(vt1.o.f180178i, null);
                                            jv1.s sVarI6 = hVarW9.i6();
                                            hVarW9.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 511) : null);
                                            hVarW9.F6();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ3);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ3;
                    boolean zR4 = mVar2.r(d0Var2);
                    Object objQ4 = mVar2.q();
                    if (zR4) {
                        objQ4 = new e23.a() { // from class: ew1.a0
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i15;
                                d0 d0Var3 = d0Var2;
                                switch (i17) {
                                    case 0:
                                        d0.a aVar5 = d0.f66371e;
                                        aw1.h hVarW8 = d0Var3.w6();
                                        ge1.b.T(androidx.lifecycle.v1.a(hVarW8), null, null, new aw1.b0(hVarW8, null), 3);
                                        break;
                                    case 1:
                                        d0.a aVar6 = d0.f66371e;
                                        fy1.c.f73884a.getClass();
                                        fy1.c.b("GarminCoachRunCoachPlanSelected");
                                        d0Var3.w6().o7(true);
                                        break;
                                    case 2:
                                        d0.a aVar7 = d0.f66371e;
                                        fy1.c.f73884a.getClass();
                                        fy1.c.b("GarminCoachCyclingCoachPlanSelected");
                                        d0Var3.w6().o7(false);
                                        break;
                                    default:
                                        d0.a aVar8 = d0.f66371e;
                                        fy1.c.f73884a.getClass();
                                        fy1.c.b("GarminCoachTriathlonCoachPlanSelected");
                                        aw1.h hVarW9 = d0Var3.w6();
                                        hVarW9.f8(null);
                                        hVarW9.g8(null);
                                        hVarW9.i8(vt1.m.FBT_ADAPTIVE);
                                        hVarW9.S7(vt1.o.f180178i, null);
                                        jv1.s sVarI6 = hVarW9.i6();
                                        hVarW9.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 511) : null);
                                        hVarW9.F6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ4);
                    } else {
                        aVar3.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new e23.a() { // from class: ew1.a0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i17 = i15;
                                    d0 d0Var3 = d0Var2;
                                    switch (i17) {
                                        case 0:
                                            d0.a aVar5 = d0.f66371e;
                                            aw1.h hVarW8 = d0Var3.w6();
                                            ge1.b.T(androidx.lifecycle.v1.a(hVarW8), null, null, new aw1.b0(hVarW8, null), 3);
                                            break;
                                        case 1:
                                            d0.a aVar6 = d0.f66371e;
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachRunCoachPlanSelected");
                                            d0Var3.w6().o7(true);
                                            break;
                                        case 2:
                                            d0.a aVar7 = d0.f66371e;
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachCyclingCoachPlanSelected");
                                            d0Var3.w6().o7(false);
                                            break;
                                        default:
                                            d0.a aVar8 = d0.f66371e;
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachTriathlonCoachPlanSelected");
                                            aw1.h hVarW9 = d0Var3.w6();
                                            hVarW9.f8(null);
                                            hVarW9.g8(null);
                                            hVarW9.i8(vt1.m.FBT_ADAPTIVE);
                                            hVarW9.S7(vt1.o.f180178i, null);
                                            jv1.s sVarI6 = hVarW9.i6();
                                            hVarW9.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 511) : null);
                                            hVarW9.F6();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ4);
                        }
                    }
                    e23.a aVar5 = (e23.a) objQ4;
                    boolean zR6 = mVar2.r(d0Var2);
                    Object objQ5 = mVar2.q();
                    final int i17 = 3;
                    if (zR6) {
                        objQ5 = new e23.a() { // from class: ew1.a0
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i17;
                                d0 d0Var3 = d0Var2;
                                switch (i18) {
                                    case 0:
                                        d0.a aVar6 = d0.f66371e;
                                        aw1.h hVarW8 = d0Var3.w6();
                                        ge1.b.T(androidx.lifecycle.v1.a(hVarW8), null, null, new aw1.b0(hVarW8, null), 3);
                                        break;
                                    case 1:
                                        d0.a aVar7 = d0.f66371e;
                                        fy1.c.f73884a.getClass();
                                        fy1.c.b("GarminCoachRunCoachPlanSelected");
                                        d0Var3.w6().o7(true);
                                        break;
                                    case 2:
                                        d0.a aVar8 = d0.f66371e;
                                        fy1.c.f73884a.getClass();
                                        fy1.c.b("GarminCoachCyclingCoachPlanSelected");
                                        d0Var3.w6().o7(false);
                                        break;
                                    default:
                                        d0.a aVar9 = d0.f66371e;
                                        fy1.c.f73884a.getClass();
                                        fy1.c.b("GarminCoachTriathlonCoachPlanSelected");
                                        aw1.h hVarW9 = d0Var3.w6();
                                        hVarW9.f8(null);
                                        hVarW9.g8(null);
                                        hVarW9.i8(vt1.m.FBT_ADAPTIVE);
                                        hVarW9.S7(vt1.o.f180178i, null);
                                        jv1.s sVarI6 = hVarW9.i6();
                                        hVarW9.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 511) : null);
                                        hVarW9.F6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ5);
                    } else {
                        aVar3.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new e23.a() { // from class: ew1.a0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = i17;
                                    d0 d0Var3 = d0Var2;
                                    switch (i18) {
                                        case 0:
                                            d0.a aVar6 = d0.f66371e;
                                            aw1.h hVarW8 = d0Var3.w6();
                                            ge1.b.T(androidx.lifecycle.v1.a(hVarW8), null, null, new aw1.b0(hVarW8, null), 3);
                                            break;
                                        case 1:
                                            d0.a aVar7 = d0.f66371e;
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachRunCoachPlanSelected");
                                            d0Var3.w6().o7(true);
                                            break;
                                        case 2:
                                            d0.a aVar8 = d0.f66371e;
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachCyclingCoachPlanSelected");
                                            d0Var3.w6().o7(false);
                                            break;
                                        default:
                                            d0.a aVar9 = d0.f66371e;
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachTriathlonCoachPlanSelected");
                                            aw1.h hVarW9 = d0Var3.w6();
                                            hVarW9.f8(null);
                                            hVarW9.g8(null);
                                            hVarW9.i8(vt1.m.FBT_ADAPTIVE);
                                            hVarW9.S7(vt1.o.f180178i, null);
                                            jv1.s sVarI6 = hVarW9.i6();
                                            hVarW9.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 511) : null);
                                            hVarW9.F6();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ5);
                        }
                    }
                    e23.a aVar6 = (e23.a) objQ5;
                    boolean zR7 = mVar2.r(d0Var2) | mVar2.B(p1VarC) | mVar2.r(qVarC) | mVar2.r(context);
                    Object objQ6 = mVar2.q();
                    if (zR7) {
                        final int i18 = 0;
                        objQ6 = new e23.a() { // from class: ew1.c0
                            @Override // e23.a
                            public final Object invoke() {
                                int i19 = i18;
                                x3 x3Var = p1VarC;
                                Context context2 = context;
                                c.q qVar = qVarC;
                                d0 d0Var3 = d0Var2;
                                switch (i19) {
                                    case 0:
                                        d0.a aVar7 = d0.f66371e;
                                        aw1.h hVarW8 = d0Var3.w6();
                                        vt1.o oVar2 = vt1.o.f180179j;
                                        if (!hVarW8.s5(oVar2) || ((Boolean) x3Var.getF182175a()).booleanValue()) {
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachFitnessCoachPlanSelected");
                                            aw1.h hVarW9 = d0Var3.w6();
                                            hVarW9.f8(null);
                                            hVarW9.g8(null);
                                            hVarW9.i8(vt1.m.FBT_ADAPTIVE);
                                            hVarW9.S7(oVar2, null);
                                            jv1.s sVarI6 = hVarW9.i6();
                                            hVarW9.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 511) : null);
                                            hVarW9.F6();
                                        } else {
                                            qVar.a(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context2, c80.q.LIVE_ACTIVITY, false), null);
                                        }
                                        break;
                                    default:
                                        d0.a aVar8 = d0.f66371e;
                                        aw1.h hVarW10 = d0Var3.w6();
                                        vt1.o oVar3 = vt1.o.f180180k;
                                        if (!hVarW10.s5(oVar3) || ((Boolean) x3Var.getF182175a()).booleanValue()) {
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachFrogCoachPlanSelected");
                                            aw1.h hVarW11 = d0Var3.w6();
                                            hVarW11.f8(null);
                                            hVarW11.g8(null);
                                            hVarW11.i8(vt1.m.FBT_ADAPTIVE);
                                            hVarW11.S7(oVar3, null);
                                            wt1.q.f187120f.getClass();
                                            hVarW11.e8(wt1.q.a.g(), false);
                                            hVarW11.F6();
                                        } else {
                                            qVar.a(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context2, c80.q.LIVE_ACTIVITY, false), null);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ6);
                    } else {
                        aVar3.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            final int i19 = 0;
                            objQ6 = new e23.a() { // from class: ew1.c0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i110 = i19;
                                    x3 x3Var = p1VarC;
                                    Context context2 = context;
                                    c.q qVar = qVarC;
                                    d0 d0Var3 = d0Var2;
                                    switch (i110) {
                                        case 0:
                                            d0.a aVar7 = d0.f66371e;
                                            aw1.h hVarW8 = d0Var3.w6();
                                            vt1.o oVar2 = vt1.o.f180179j;
                                            if (!hVarW8.s5(oVar2) || ((Boolean) x3Var.getF182175a()).booleanValue()) {
                                                fy1.c.f73884a.getClass();
                                                fy1.c.b("GarminCoachFitnessCoachPlanSelected");
                                                aw1.h hVarW9 = d0Var3.w6();
                                                hVarW9.f8(null);
                                                hVarW9.g8(null);
                                                hVarW9.i8(vt1.m.FBT_ADAPTIVE);
                                                hVarW9.S7(oVar2, null);
                                                jv1.s sVarI6 = hVarW9.i6();
                                                hVarW9.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 511) : null);
                                                hVarW9.F6();
                                            } else {
                                                qVar.a(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context2, c80.q.LIVE_ACTIVITY, false), null);
                                            }
                                            break;
                                        default:
                                            d0.a aVar8 = d0.f66371e;
                                            aw1.h hVarW10 = d0Var3.w6();
                                            vt1.o oVar3 = vt1.o.f180180k;
                                            if (!hVarW10.s5(oVar3) || ((Boolean) x3Var.getF182175a()).booleanValue()) {
                                                fy1.c.f73884a.getClass();
                                                fy1.c.b("GarminCoachFrogCoachPlanSelected");
                                                aw1.h hVarW11 = d0Var3.w6();
                                                hVarW11.f8(null);
                                                hVarW11.g8(null);
                                                hVarW11.i8(vt1.m.FBT_ADAPTIVE);
                                                hVarW11.S7(oVar3, null);
                                                wt1.q.f187120f.getClass();
                                                hVarW11.e8(wt1.q.a.g(), false);
                                                hVarW11.F6();
                                            } else {
                                                qVar.a(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context2, c80.q.LIVE_ACTIVITY, false), null);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ6);
                        }
                    }
                    e23.a aVar7 = (e23.a) objQ6;
                    boolean zR8 = mVar2.r(d0Var2) | mVar2.B(p1VarC) | mVar2.r(qVarC) | mVar2.r(context);
                    Object objQ7 = mVar2.q();
                    if (zR8) {
                        final int i24 = 1;
                        objQ7 = new e23.a() { // from class: ew1.c0
                            @Override // e23.a
                            public final Object invoke() {
                                int i110 = i24;
                                x3 x3Var = p1VarC;
                                Context context2 = context;
                                c.q qVar = qVarC;
                                d0 d0Var3 = d0Var2;
                                switch (i110) {
                                    case 0:
                                        d0.a aVar8 = d0.f66371e;
                                        aw1.h hVarW8 = d0Var3.w6();
                                        vt1.o oVar2 = vt1.o.f180179j;
                                        if (!hVarW8.s5(oVar2) || ((Boolean) x3Var.getF182175a()).booleanValue()) {
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachFitnessCoachPlanSelected");
                                            aw1.h hVarW9 = d0Var3.w6();
                                            hVarW9.f8(null);
                                            hVarW9.g8(null);
                                            hVarW9.i8(vt1.m.FBT_ADAPTIVE);
                                            hVarW9.S7(oVar2, null);
                                            jv1.s sVarI6 = hVarW9.i6();
                                            hVarW9.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 511) : null);
                                            hVarW9.F6();
                                        } else {
                                            qVar.a(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context2, c80.q.LIVE_ACTIVITY, false), null);
                                        }
                                        break;
                                    default:
                                        d0.a aVar9 = d0.f66371e;
                                        aw1.h hVarW10 = d0Var3.w6();
                                        vt1.o oVar3 = vt1.o.f180180k;
                                        if (!hVarW10.s5(oVar3) || ((Boolean) x3Var.getF182175a()).booleanValue()) {
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachFrogCoachPlanSelected");
                                            aw1.h hVarW11 = d0Var3.w6();
                                            hVarW11.f8(null);
                                            hVarW11.g8(null);
                                            hVarW11.i8(vt1.m.FBT_ADAPTIVE);
                                            hVarW11.S7(oVar3, null);
                                            wt1.q.f187120f.getClass();
                                            hVarW11.e8(wt1.q.a.g(), false);
                                            hVarW11.F6();
                                        } else {
                                            qVar.a(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context2, c80.q.LIVE_ACTIVITY, false), null);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ7);
                    } else {
                        aVar3.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            final int i25 = 1;
                            objQ7 = new e23.a() { // from class: ew1.c0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i110 = i25;
                                    x3 x3Var = p1VarC;
                                    Context context2 = context;
                                    c.q qVar = qVarC;
                                    d0 d0Var3 = d0Var2;
                                    switch (i110) {
                                        case 0:
                                            d0.a aVar8 = d0.f66371e;
                                            aw1.h hVarW8 = d0Var3.w6();
                                            vt1.o oVar2 = vt1.o.f180179j;
                                            if (!hVarW8.s5(oVar2) || ((Boolean) x3Var.getF182175a()).booleanValue()) {
                                                fy1.c.f73884a.getClass();
                                                fy1.c.b("GarminCoachFitnessCoachPlanSelected");
                                                aw1.h hVarW9 = d0Var3.w6();
                                                hVarW9.f8(null);
                                                hVarW9.g8(null);
                                                hVarW9.i8(vt1.m.FBT_ADAPTIVE);
                                                hVarW9.S7(oVar2, null);
                                                jv1.s sVarI6 = hVarW9.i6();
                                                hVarW9.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 511) : null);
                                                hVarW9.F6();
                                            } else {
                                                qVar.a(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context2, c80.q.LIVE_ACTIVITY, false), null);
                                            }
                                            break;
                                        default:
                                            d0.a aVar9 = d0.f66371e;
                                            aw1.h hVarW10 = d0Var3.w6();
                                            vt1.o oVar3 = vt1.o.f180180k;
                                            if (!hVarW10.s5(oVar3) || ((Boolean) x3Var.getF182175a()).booleanValue()) {
                                                fy1.c.f73884a.getClass();
                                                fy1.c.b("GarminCoachFrogCoachPlanSelected");
                                                aw1.h hVarW11 = d0Var3.w6();
                                                hVarW11.f8(null);
                                                hVarW11.g8(null);
                                                hVarW11.i8(vt1.m.FBT_ADAPTIVE);
                                                hVarW11.S7(oVar3, null);
                                                wt1.q.f187120f.getClass();
                                                hVarW11.e8(wt1.q.a.g(), false);
                                                hVarW11.F6();
                                            } else {
                                                qVar.a(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context2, c80.q.LIVE_ACTIVITY, false), null);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ7);
                        }
                    }
                    e23.a aVar8 = (e23.a) objQ7;
                    boolean zR9 = mVar2.r(d0Var2);
                    Object objQ8 = mVar2.q();
                    if (zR9) {
                        objQ8 = new z(d0Var2, 1);
                        mVar2.K(objQ8);
                    } else {
                        aVar3.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new z(d0Var2, 1);
                            mVar2.K(objQ8);
                        }
                    }
                    e23.l lVar = (e23.l) objQ8;
                    boolean zR10 = mVar2.r(d0Var2);
                    Object objQ9 = mVar2.q();
                    if (zR10) {
                        objQ9 = new z(d0Var2, 2);
                        mVar2.K(objQ9);
                    } else {
                        aVar3.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new z(d0Var2, 2);
                            mVar2.K(objQ9);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ9;
                    boolean zR11 = mVar2.r(d0Var2);
                    Object objQ10 = mVar2.q();
                    if (zR11) {
                        objQ10 = new z(d0Var2, 3);
                        mVar2.K(objQ10);
                    } else {
                        aVar3.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new z(d0Var2, 3);
                            mVar2.K(objQ10);
                        }
                    }
                    e23.l lVar3 = (e23.l) objQ10;
                    boolean zR12 = mVar2.r(d0Var2);
                    Object objQ11 = mVar2.q();
                    if (zR12) {
                        final int i26 = 0;
                        objQ11 = new e23.a() { // from class: ew1.a0
                            @Override // e23.a
                            public final Object invoke() {
                                int i110 = i26;
                                d0 d0Var3 = d0Var2;
                                switch (i110) {
                                    case 0:
                                        d0.a aVar9 = d0.f66371e;
                                        aw1.h hVarW8 = d0Var3.w6();
                                        ge1.b.T(androidx.lifecycle.v1.a(hVarW8), null, null, new aw1.b0(hVarW8, null), 3);
                                        break;
                                    case 1:
                                        d0.a aVar10 = d0.f66371e;
                                        fy1.c.f73884a.getClass();
                                        fy1.c.b("GarminCoachRunCoachPlanSelected");
                                        d0Var3.w6().o7(true);
                                        break;
                                    case 2:
                                        d0.a aVar11 = d0.f66371e;
                                        fy1.c.f73884a.getClass();
                                        fy1.c.b("GarminCoachCyclingCoachPlanSelected");
                                        d0Var3.w6().o7(false);
                                        break;
                                    default:
                                        d0.a aVar12 = d0.f66371e;
                                        fy1.c.f73884a.getClass();
                                        fy1.c.b("GarminCoachTriathlonCoachPlanSelected");
                                        aw1.h hVarW9 = d0Var3.w6();
                                        hVarW9.f8(null);
                                        hVarW9.g8(null);
                                        hVarW9.i8(vt1.m.FBT_ADAPTIVE);
                                        hVarW9.S7(vt1.o.f180178i, null);
                                        jv1.s sVarI6 = hVarW9.i6();
                                        hVarW9.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 511) : null);
                                        hVarW9.F6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ11);
                    } else {
                        aVar3.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            final int i27 = 0;
                            objQ11 = new e23.a() { // from class: ew1.a0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i110 = i27;
                                    d0 d0Var3 = d0Var2;
                                    switch (i110) {
                                        case 0:
                                            d0.a aVar9 = d0.f66371e;
                                            aw1.h hVarW8 = d0Var3.w6();
                                            ge1.b.T(androidx.lifecycle.v1.a(hVarW8), null, null, new aw1.b0(hVarW8, null), 3);
                                            break;
                                        case 1:
                                            d0.a aVar10 = d0.f66371e;
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachRunCoachPlanSelected");
                                            d0Var3.w6().o7(true);
                                            break;
                                        case 2:
                                            d0.a aVar11 = d0.f66371e;
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachCyclingCoachPlanSelected");
                                            d0Var3.w6().o7(false);
                                            break;
                                        default:
                                            d0.a aVar12 = d0.f66371e;
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachTriathlonCoachPlanSelected");
                                            aw1.h hVarW9 = d0Var3.w6();
                                            hVarW9.f8(null);
                                            hVarW9.g8(null);
                                            hVarW9.i8(vt1.m.FBT_ADAPTIVE);
                                            hVarW9.S7(vt1.o.f180178i, null);
                                            jv1.s sVarI6 = hVarW9.i6();
                                            hVarW9.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 511) : null);
                                            hVarW9.F6();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ11);
                        }
                    }
                    e23.a aVar9 = (e23.a) objQ11;
                    boolean zR13 = mVar2.r(d0Var2);
                    Object objQ12 = mVar2.q();
                    if (zR13) {
                        objQ12 = new b0(d0Var2, i15);
                        mVar2.K(objQ12);
                    } else {
                        aVar3.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new b0(d0Var2, i15);
                            mVar2.K(objQ12);
                        }
                    }
                    e3 e3Var = new e3(null, null, zV5, zU5, zW5, oVarF, oVarF2, oVarF3, oVarF4, null, aVar4, aVar5, aVar6, aVar7, aVar8, lVar, lVar2, lVar3, aVar9, (e23.p) objQ12, oVarS5, zR5, iC5, iY5, z16, z17, zU6, z14, z18, z15, z19, z24, 515, null);
                    if (d0Var2.w6().Z6()) {
                        mVar2.C(2011235485);
                        androidx.fragment.app.m mVarRequireActivity = d0Var2.requireActivity();
                        mVarRequireActivity.getClass();
                        i0.a(mVarRequireActivity, true, e3Var, mVar2, 48);
                        mVar2.f();
                    } else if (d0Var2.w6().e7()) {
                        mVar2.C(2011244239);
                        androidx.fragment.app.m mVarRequireActivity2 = d0Var2.requireActivity();
                        mVarRequireActivity2.getClass();
                        i0.a(mVarRequireActivity2, false, e3.a(e3Var, new jv1.f(vt1.o.f180178i, null, null, null, false, false, null, 126, null), null, -2), mVar2, 48);
                        mVar2.f();
                    } else {
                        mVar2.C(-2075545104);
                        g3 g3Var = (g3) p1VarG.getF182175a();
                        fw.p pVar = g3Var != null ? g3Var.f35300a : null;
                        int i28 = pVar == null ? -1 : d0.b.f66375a[pVar.ordinal()];
                        if (i28 == 1) {
                            mVar2.C(-2075509733);
                            mVar2.f();
                            g22.e.l(d0Var2);
                            Unit unit2 = Unit.INSTANCE;
                        } else if (i28 == 2) {
                            mVar2.C(-2075353710);
                            g22.e.f(d0Var2);
                            g3 g3Var2 = (g3) p1VarG.getF182175a();
                            e3Var = e3.a(e3Var, g3Var2 != null ? (jv1.f) g3Var2.f35301b : null, null, -2);
                            androidx.fragment.app.m mVarRequireActivity3 = d0Var2.requireActivity();
                            mVarRequireActivity3.getClass();
                            i0.a(mVarRequireActivity3, false, e3Var, mVar2, 48);
                            mVar2.f();
                            Unit unit3 = Unit.INSTANCE;
                        } else if (i28 != 3) {
                            mVar2.C(2011291086);
                            mVar2.f();
                            Unit unit4 = Unit.INSTANCE;
                        } else {
                            mVar2.C(-2074827392);
                            mVar2.f();
                            g22.e.f(d0Var2);
                            g22.e.a(d0Var2, null);
                            d0Var2.w6().l5();
                            Unit unit5 = Unit.INSTANCE;
                        }
                        g3 g3Var3 = (g3) p1VarG2.getF182175a();
                        fw.p pVar2 = g3Var3 != null ? g3Var3.f35300a : null;
                        int i29 = pVar2 != null ? d0.b.f66375a[pVar2.ordinal()] : -1;
                        if (i29 == 1) {
                            mVar2.C(-2074154661);
                            mVar2.f();
                            g22.e.l(d0Var2);
                        } else if (i29 == 2) {
                            mVar2.C(-2073998204);
                            g22.e.f(d0Var2);
                            g3 g3Var4 = (g3) p1VarG2.getF182175a();
                            e3 e3VarA = e3.a(e3Var, null, g3Var4 != null ? (jv1.f) g3Var4.f35301b : null, -3);
                            androidx.fragment.app.m mVarRequireActivity4 = d0Var2.requireActivity();
                            mVarRequireActivity4.getClass();
                            i0.a(mVarRequireActivity4, false, e3VarA, mVar2, 48);
                            mVar2.f();
                        } else if (i29 != 3) {
                            mVar2.C(2011332622);
                            mVar2.f();
                        } else {
                            mVar2.C(-2073460974);
                            mVar2.f();
                            g22.e.f(d0Var2);
                            g22.e.a(d0Var2, null);
                            d0Var2.w6().q6().m(null);
                        }
                        mVar2.f();
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                break;
            default:
                xw1.h hVar2 = (xw1.h) obj;
                vt1.f fVar = (vt1.f) obj2;
                d0.a aVar10 = d0.f66371e;
                hVar2.getClass();
                d0Var.f66373c = true;
                aw1.h hVarW8 = d0Var.w6();
                if (fVar != null) {
                    hVarW8.D7(fVar);
                    hVarW8.E7(null);
                }
                hVarW8.g8(null);
                hVarW8.f8(hVar2);
                hVarW8.i8(vt1.m.STATIC);
                hVarW8.F6();
                break;
        }
        return Unit.INSTANCE;
    }
}
