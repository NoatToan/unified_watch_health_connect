package b21;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.ConsentActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import i3.fe;
import i3.mc;
import i3.pc;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z8 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f15452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f15453h;

    public /* synthetic */ z8(String str, boolean z14, String str2, String str3, String str4, an0.d dVar, kotlin.m3 m3Var) {
        this.f15446a = 1;
        this.f15448c = str;
        this.f15447b = z14;
        this.f15449d = str2;
        this.f15450e = str3;
        this.f15451f = str4;
        this.f15452g = dVar;
        this.f15453h = m3Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        LocalDate localDate;
        int i14 = this.f15446a;
        boolean z14 = this.f15447b;
        int i15 = 0;
        Object obj2 = this.f15453h;
        Object obj3 = this.f15452g;
        Object obj4 = this.f15451f;
        Object obj5 = this.f15450e;
        Object obj6 = this.f15449d;
        Object obj7 = this.f15448c;
        switch (i14) {
            case 0:
                final lc.m0 m0Var = (lc.m0) obj7;
                final v21.e eVar = (v21.e) obj6;
                final x01.b bVar = (x01.b) obj5;
                final x01.c cVar = (x01.c) obj4;
                final x01.b bVar2 = (x01.b) obj3;
                final NutritionActivity.f fVar = (NutritionActivity.f) obj2;
                lc.k0 k0Var = (lc.k0) obj;
                k0Var.getClass();
                final boolean z15 = this.f15447b;
                z3.e eVar2 = new z3.e(-2093811553, true, new a9(m0Var, z15, bVar, cVar, bVar2, 0));
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var, t0Var.b(l4.i0.class), k0Var2, j0Var, null, null, null, null, eVar2);
                final int i16 = 0;
                nc.n.a(k0Var, t0Var.b(l4.m0.class), k0Var2, j0Var, null, null, null, null, new z3.e(40486614, true, new e23.r() { // from class: b21.d9
                    @Override // e23.r
                    public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                        int i17 = i16;
                        final int i18 = 0;
                        final int i19 = 1;
                        final NutritionActivity.f fVar2 = fVar;
                        r1.l lVar = (r1.l) obj8;
                        lc.v vVar = (lc.v) obj9;
                        p3.m mVar = (p3.m) obj10;
                        switch (i17) {
                            case 0:
                                int iB = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var = p3.n.f135158a;
                                u9.a(vVar, m0Var, z15, bVar, cVar, bVar2, z3.f.c(-689695389, new e9(fVar2, i19), mVar), mVar, ((iB >> 3) & 14) | 1572864);
                                break;
                            case 1:
                                int iB2 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var2 = p3.n.f135158a;
                                u9.a(vVar, m0Var, z15, bVar, cVar, bVar2, z3.f.c(-241579804, new e9(fVar2, i18), mVar), mVar, ((iB2 >> 3) & 14) | 1572864);
                                break;
                            case 2:
                                int iB3 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var3 = p3.n.f135158a;
                                final lc.m0 m0Var2 = m0Var;
                                u9.a(vVar, m0Var2, z15, bVar, cVar, bVar2, z3.f.c(206535781, new e23.u() { // from class: b21.h9
                                    /* JADX WARN: Code duplicated, block: B:22:0x010e  */
                                    /* JADX WARN: Code duplicated, block: B:31:0x0152  */
                                    @Override // e23.u
                                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj12, Object obj13, Object obj14, Object obj15, p3.m mVar2, Integer num) {
                                        i53.f fVarA;
                                        switch (i18) {
                                            case 0:
                                                u21.u0 u0Var = (u21.u0) u1Var;
                                                s21.a0 a0Var = (s21.a0) obj12;
                                                fe feVar = (fe) obj15;
                                                int iIntValue = num.intValue();
                                                a0Var.getClass();
                                                ((e23.l) obj13).getClass();
                                                ((e23.a) obj14).getClass();
                                                feVar.getClass();
                                                p3.x1 x1Var4 = p3.n.f135158a;
                                                String strQ = gl1.y.Q(mVar2, R.string.generic_error_message);
                                                s21.c0 c0Var = a0Var.f156038c;
                                                boolean zR = mVar2.r(a0Var) | ((((57344 & iIntValue) ^ 24576) > 16384 && mVar2.B(feVar)) || (iIntValue & 24576) == 16384) | mVar2.B(strQ);
                                                Object objQ = mVar2.q();
                                                p3.m.a aVar = p3.m.f135153a;
                                                if (zR) {
                                                    objQ = new ga(a0Var, feVar, strQ, null);
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new ga(a0Var, feVar, strQ, null);
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ, c0Var, mVar2);
                                                String strQ2 = gl1.y.Q(mVar2, R.string.nutrition);
                                                String strQ3 = gl1.y.Q(mVar2, R.string.lbl_common_continue);
                                                boolean z16 = a0Var.f156060y;
                                                j53.j jVarB = j53.l.b();
                                                i53.h<s21.z> hVarA4 = u0Var.A4();
                                                s21.v vVar2 = c0Var != null ? s21.v.ENABLED : s21.v.DISABLED;
                                                String strQ4 = gl1.y.Q(mVar2, R.string.continue_agree_disconnect_myfitnesspal);
                                                boolean zR2 = mVar2.r(u0Var);
                                                Object objQ2 = mVar2.q();
                                                if (zR2) {
                                                    objQ2 = new u8(u0Var, 0);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new u8(u0Var, 0);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                t21.d1.a(strQ2, feVar, m0Var2, strQ3, z16, false, jVarB, strQ4, (e23.a) objQ2, vVar2, hVarA4, false, null, fVar2, z3.f.c(-369484964, new a71.n(a0Var, 7), mVar2), mVar2, ((iIntValue >> 9) & 112) | 3866624, 24576, 6144);
                                                break;
                                            default:
                                                u21.u0 u0Var2 = (u21.u0) u1Var;
                                                s21.a0 a0Var2 = (s21.a0) obj12;
                                                e23.l lVar2 = (e23.l) obj13;
                                                e23.a aVar2 = (e23.a) obj14;
                                                fe feVar2 = (fe) obj15;
                                                int iIntValue2 = num.intValue();
                                                a0Var2.getClass();
                                                lVar2.getClass();
                                                aVar2.getClass();
                                                feVar2.getClass();
                                                p3.x1 x1Var5 = p3.n.f135158a;
                                                String strQ5 = gl1.y.Q(mVar2, R.string.nutrition);
                                                if (a0Var2.f156036a instanceof l4.n0) {
                                                    mVar2.C(325783033);
                                                    mVar2.f();
                                                    fVarA = j53.l.b();
                                                } else {
                                                    mVar2.C(325857092);
                                                    fVarA = i53.a.a(new l72.i3("EXIT", gl1.y.Q(mVar2, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                                                    mVar2.f();
                                                }
                                                t21.d1.a(strQ5, feVar2, m0Var2, null, a0Var2.f156060y, false, fVarA, null, null, s21.v.INVISIBLE, u0Var2.A4(), false, aVar2, fVar2, z3.f.c(526746206, new aa2.f(5, u0Var2, lVar2), mVar2), mVar2, ((iIntValue2 >> 9) & 112) | 807600128, ((iIntValue2 >> 3) & 896) | 24576, 2440);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, ((iB3 >> 3) & 14) | 1572864);
                                break;
                            case 3:
                                int iB4 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var4 = p3.n.f135158a;
                                lc.m0 m0Var3 = m0Var;
                                u9.a(vVar, m0Var3, z15, bVar, cVar, bVar2, z3.f.c(654651366, new l9(vVar, m0Var3, fVar2, i19), mVar), mVar, ((iB4 >> 3) & 14) | 1572864);
                                break;
                            default:
                                int iB5 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var5 = p3.n.f135158a;
                                final lc.m0 m0Var4 = m0Var;
                                u9.a(vVar, m0Var4, z15, bVar, cVar, bVar2, z3.f.c(1102766951, new e23.u() { // from class: b21.h9
                                    /* JADX WARN: Code duplicated, block: B:22:0x010e  */
                                    /* JADX WARN: Code duplicated, block: B:31:0x0152  */
                                    @Override // e23.u
                                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj12, Object obj13, Object obj14, Object obj15, p3.m mVar2, Integer num) {
                                        i53.f fVarA;
                                        switch (i19) {
                                            case 0:
                                                u21.u0 u0Var = (u21.u0) u1Var;
                                                s21.a0 a0Var = (s21.a0) obj12;
                                                fe feVar = (fe) obj15;
                                                int iIntValue = num.intValue();
                                                a0Var.getClass();
                                                ((e23.l) obj13).getClass();
                                                ((e23.a) obj14).getClass();
                                                feVar.getClass();
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                String strQ = gl1.y.Q(mVar2, R.string.generic_error_message);
                                                s21.c0 c0Var = a0Var.f156038c;
                                                boolean zR = mVar2.r(a0Var) | ((((57344 & iIntValue) ^ 24576) > 16384 && mVar2.B(feVar)) || (iIntValue & 24576) == 16384) | mVar2.B(strQ);
                                                Object objQ = mVar2.q();
                                                p3.m.a aVar = p3.m.f135153a;
                                                if (zR) {
                                                    objQ = new ga(a0Var, feVar, strQ, null);
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new ga(a0Var, feVar, strQ, null);
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ, c0Var, mVar2);
                                                String strQ2 = gl1.y.Q(mVar2, R.string.nutrition);
                                                String strQ3 = gl1.y.Q(mVar2, R.string.lbl_common_continue);
                                                boolean z16 = a0Var.f156060y;
                                                j53.j jVarB = j53.l.b();
                                                i53.h<s21.z> hVarA4 = u0Var.A4();
                                                s21.v vVar2 = c0Var != null ? s21.v.ENABLED : s21.v.DISABLED;
                                                String strQ4 = gl1.y.Q(mVar2, R.string.continue_agree_disconnect_myfitnesspal);
                                                boolean zR2 = mVar2.r(u0Var);
                                                Object objQ2 = mVar2.q();
                                                if (zR2) {
                                                    objQ2 = new u8(u0Var, 0);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new u8(u0Var, 0);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                t21.d1.a(strQ2, feVar, m0Var4, strQ3, z16, false, jVarB, strQ4, (e23.a) objQ2, vVar2, hVarA4, false, null, fVar2, z3.f.c(-369484964, new a71.n(a0Var, 7), mVar2), mVar2, ((iIntValue >> 9) & 112) | 3866624, 24576, 6144);
                                                break;
                                            default:
                                                u21.u0 u0Var2 = (u21.u0) u1Var;
                                                s21.a0 a0Var2 = (s21.a0) obj12;
                                                e23.l lVar2 = (e23.l) obj13;
                                                e23.a aVar2 = (e23.a) obj14;
                                                fe feVar2 = (fe) obj15;
                                                int iIntValue2 = num.intValue();
                                                a0Var2.getClass();
                                                lVar2.getClass();
                                                aVar2.getClass();
                                                feVar2.getClass();
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                String strQ5 = gl1.y.Q(mVar2, R.string.nutrition);
                                                if (a0Var2.f156036a instanceof l4.n0) {
                                                    mVar2.C(325783033);
                                                    mVar2.f();
                                                    fVarA = j53.l.b();
                                                } else {
                                                    mVar2.C(325857092);
                                                    fVarA = i53.a.a(new l72.i3("EXIT", gl1.y.Q(mVar2, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                                                    mVar2.f();
                                                }
                                                t21.d1.a(strQ5, feVar2, m0Var4, null, a0Var2.f156060y, false, fVarA, null, null, s21.v.INVISIBLE, u0Var2.A4(), false, aVar2, fVar2, z3.f.c(526746206, new aa2.f(5, u0Var2, lVar2), mVar2), mVar2, ((iIntValue2 >> 9) & 112) | 807600128, ((iIntValue2 >> 3) & 896) | 24576, 2440);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, ((iB5 >> 3) & 14) | 1572864);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i17 = 1;
                nc.n.a(k0Var, t0Var.b(l4.k0.class), k0Var2, j0Var, null, null, null, null, new z3.e(488602199, true, new e23.r() { // from class: b21.d9
                    @Override // e23.r
                    public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                        int i18 = i17;
                        final int i19 = 0;
                        final int i110 = 1;
                        final NutritionActivity.f fVar2 = fVar;
                        r1.l lVar = (r1.l) obj8;
                        lc.v vVar = (lc.v) obj9;
                        p3.m mVar = (p3.m) obj10;
                        switch (i18) {
                            case 0:
                                int iB = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var = p3.n.f135158a;
                                u9.a(vVar, m0Var, z15, bVar, cVar, bVar2, z3.f.c(-689695389, new e9(fVar2, i110), mVar), mVar, ((iB >> 3) & 14) | 1572864);
                                break;
                            case 1:
                                int iB2 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var2 = p3.n.f135158a;
                                u9.a(vVar, m0Var, z15, bVar, cVar, bVar2, z3.f.c(-241579804, new e9(fVar2, i19), mVar), mVar, ((iB2 >> 3) & 14) | 1572864);
                                break;
                            case 2:
                                int iB3 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var3 = p3.n.f135158a;
                                final lc.m0 m0Var2 = m0Var;
                                u9.a(vVar, m0Var2, z15, bVar, cVar, bVar2, z3.f.c(206535781, new e23.u() { // from class: b21.h9
                                    /* JADX WARN: Code duplicated, block: B:22:0x010e  */
                                    /* JADX WARN: Code duplicated, block: B:31:0x0152  */
                                    @Override // e23.u
                                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj12, Object obj13, Object obj14, Object obj15, p3.m mVar2, Integer num) {
                                        i53.f fVarA;
                                        switch (i19) {
                                            case 0:
                                                u21.u0 u0Var = (u21.u0) u1Var;
                                                s21.a0 a0Var = (s21.a0) obj12;
                                                fe feVar = (fe) obj15;
                                                int iIntValue = num.intValue();
                                                a0Var.getClass();
                                                ((e23.l) obj13).getClass();
                                                ((e23.a) obj14).getClass();
                                                feVar.getClass();
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                String strQ = gl1.y.Q(mVar2, R.string.generic_error_message);
                                                s21.c0 c0Var = a0Var.f156038c;
                                                boolean zR = mVar2.r(a0Var) | ((((57344 & iIntValue) ^ 24576) > 16384 && mVar2.B(feVar)) || (iIntValue & 24576) == 16384) | mVar2.B(strQ);
                                                Object objQ = mVar2.q();
                                                p3.m.a aVar = p3.m.f135153a;
                                                if (zR) {
                                                    objQ = new ga(a0Var, feVar, strQ, null);
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new ga(a0Var, feVar, strQ, null);
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ, c0Var, mVar2);
                                                String strQ2 = gl1.y.Q(mVar2, R.string.nutrition);
                                                String strQ3 = gl1.y.Q(mVar2, R.string.lbl_common_continue);
                                                boolean z16 = a0Var.f156060y;
                                                j53.j jVarB = j53.l.b();
                                                i53.h<s21.z> hVarA4 = u0Var.A4();
                                                s21.v vVar2 = c0Var != null ? s21.v.ENABLED : s21.v.DISABLED;
                                                String strQ4 = gl1.y.Q(mVar2, R.string.continue_agree_disconnect_myfitnesspal);
                                                boolean zR2 = mVar2.r(u0Var);
                                                Object objQ2 = mVar2.q();
                                                if (zR2) {
                                                    objQ2 = new u8(u0Var, 0);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new u8(u0Var, 0);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                t21.d1.a(strQ2, feVar, m0Var2, strQ3, z16, false, jVarB, strQ4, (e23.a) objQ2, vVar2, hVarA4, false, null, fVar2, z3.f.c(-369484964, new a71.n(a0Var, 7), mVar2), mVar2, ((iIntValue >> 9) & 112) | 3866624, 24576, 6144);
                                                break;
                                            default:
                                                u21.u0 u0Var2 = (u21.u0) u1Var;
                                                s21.a0 a0Var2 = (s21.a0) obj12;
                                                e23.l lVar2 = (e23.l) obj13;
                                                e23.a aVar2 = (e23.a) obj14;
                                                fe feVar2 = (fe) obj15;
                                                int iIntValue2 = num.intValue();
                                                a0Var2.getClass();
                                                lVar2.getClass();
                                                aVar2.getClass();
                                                feVar2.getClass();
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                String strQ5 = gl1.y.Q(mVar2, R.string.nutrition);
                                                if (a0Var2.f156036a instanceof l4.n0) {
                                                    mVar2.C(325783033);
                                                    mVar2.f();
                                                    fVarA = j53.l.b();
                                                } else {
                                                    mVar2.C(325857092);
                                                    fVarA = i53.a.a(new l72.i3("EXIT", gl1.y.Q(mVar2, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                                                    mVar2.f();
                                                }
                                                t21.d1.a(strQ5, feVar2, m0Var2, null, a0Var2.f156060y, false, fVarA, null, null, s21.v.INVISIBLE, u0Var2.A4(), false, aVar2, fVar2, z3.f.c(526746206, new aa2.f(5, u0Var2, lVar2), mVar2), mVar2, ((iIntValue2 >> 9) & 112) | 807600128, ((iIntValue2 >> 3) & 896) | 24576, 2440);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, ((iB3 >> 3) & 14) | 1572864);
                                break;
                            case 3:
                                int iB4 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var4 = p3.n.f135158a;
                                lc.m0 m0Var3 = m0Var;
                                u9.a(vVar, m0Var3, z15, bVar, cVar, bVar2, z3.f.c(654651366, new l9(vVar, m0Var3, fVar2, i110), mVar), mVar, ((iB4 >> 3) & 14) | 1572864);
                                break;
                            default:
                                int iB5 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var5 = p3.n.f135158a;
                                final lc.m0 m0Var4 = m0Var;
                                u9.a(vVar, m0Var4, z15, bVar, cVar, bVar2, z3.f.c(1102766951, new e23.u() { // from class: b21.h9
                                    /* JADX WARN: Code duplicated, block: B:22:0x010e  */
                                    /* JADX WARN: Code duplicated, block: B:31:0x0152  */
                                    @Override // e23.u
                                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj12, Object obj13, Object obj14, Object obj15, p3.m mVar2, Integer num) {
                                        i53.f fVarA;
                                        switch (i110) {
                                            case 0:
                                                u21.u0 u0Var = (u21.u0) u1Var;
                                                s21.a0 a0Var = (s21.a0) obj12;
                                                fe feVar = (fe) obj15;
                                                int iIntValue = num.intValue();
                                                a0Var.getClass();
                                                ((e23.l) obj13).getClass();
                                                ((e23.a) obj14).getClass();
                                                feVar.getClass();
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                String strQ = gl1.y.Q(mVar2, R.string.generic_error_message);
                                                s21.c0 c0Var = a0Var.f156038c;
                                                boolean zR = mVar2.r(a0Var) | ((((57344 & iIntValue) ^ 24576) > 16384 && mVar2.B(feVar)) || (iIntValue & 24576) == 16384) | mVar2.B(strQ);
                                                Object objQ = mVar2.q();
                                                p3.m.a aVar = p3.m.f135153a;
                                                if (zR) {
                                                    objQ = new ga(a0Var, feVar, strQ, null);
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new ga(a0Var, feVar, strQ, null);
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ, c0Var, mVar2);
                                                String strQ2 = gl1.y.Q(mVar2, R.string.nutrition);
                                                String strQ3 = gl1.y.Q(mVar2, R.string.lbl_common_continue);
                                                boolean z16 = a0Var.f156060y;
                                                j53.j jVarB = j53.l.b();
                                                i53.h<s21.z> hVarA4 = u0Var.A4();
                                                s21.v vVar2 = c0Var != null ? s21.v.ENABLED : s21.v.DISABLED;
                                                String strQ4 = gl1.y.Q(mVar2, R.string.continue_agree_disconnect_myfitnesspal);
                                                boolean zR2 = mVar2.r(u0Var);
                                                Object objQ2 = mVar2.q();
                                                if (zR2) {
                                                    objQ2 = new u8(u0Var, 0);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new u8(u0Var, 0);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                t21.d1.a(strQ2, feVar, m0Var4, strQ3, z16, false, jVarB, strQ4, (e23.a) objQ2, vVar2, hVarA4, false, null, fVar2, z3.f.c(-369484964, new a71.n(a0Var, 7), mVar2), mVar2, ((iIntValue >> 9) & 112) | 3866624, 24576, 6144);
                                                break;
                                            default:
                                                u21.u0 u0Var2 = (u21.u0) u1Var;
                                                s21.a0 a0Var2 = (s21.a0) obj12;
                                                e23.l lVar2 = (e23.l) obj13;
                                                e23.a aVar2 = (e23.a) obj14;
                                                fe feVar2 = (fe) obj15;
                                                int iIntValue2 = num.intValue();
                                                a0Var2.getClass();
                                                lVar2.getClass();
                                                aVar2.getClass();
                                                feVar2.getClass();
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                String strQ5 = gl1.y.Q(mVar2, R.string.nutrition);
                                                if (a0Var2.f156036a instanceof l4.n0) {
                                                    mVar2.C(325783033);
                                                    mVar2.f();
                                                    fVarA = j53.l.b();
                                                } else {
                                                    mVar2.C(325857092);
                                                    fVarA = i53.a.a(new l72.i3("EXIT", gl1.y.Q(mVar2, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                                                    mVar2.f();
                                                }
                                                t21.d1.a(strQ5, feVar2, m0Var4, null, a0Var2.f156060y, false, fVarA, null, null, s21.v.INVISIBLE, u0Var2.A4(), false, aVar2, fVar2, z3.f.c(526746206, new aa2.f(5, u0Var2, lVar2), mVar2), mVar2, ((iIntValue2 >> 9) & 112) | 807600128, ((iIntValue2 >> 3) & 896) | 24576, 2440);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, ((iB5 >> 3) & 14) | 1572864);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i18 = 2;
                nc.n.a(k0Var, t0Var.b(l4.l0.class), k0Var2, j0Var, null, null, null, null, new z3.e(936717784, true, new e23.r() { // from class: b21.d9
                    @Override // e23.r
                    public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                        int i19 = i18;
                        final int i110 = 0;
                        final int i111 = 1;
                        final NutritionActivity.f fVar2 = fVar;
                        r1.l lVar = (r1.l) obj8;
                        lc.v vVar = (lc.v) obj9;
                        p3.m mVar = (p3.m) obj10;
                        switch (i19) {
                            case 0:
                                int iB = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var = p3.n.f135158a;
                                u9.a(vVar, m0Var, z15, bVar, cVar, bVar2, z3.f.c(-689695389, new e9(fVar2, i111), mVar), mVar, ((iB >> 3) & 14) | 1572864);
                                break;
                            case 1:
                                int iB2 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var2 = p3.n.f135158a;
                                u9.a(vVar, m0Var, z15, bVar, cVar, bVar2, z3.f.c(-241579804, new e9(fVar2, i110), mVar), mVar, ((iB2 >> 3) & 14) | 1572864);
                                break;
                            case 2:
                                int iB3 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var3 = p3.n.f135158a;
                                final lc.m0 m0Var2 = m0Var;
                                u9.a(vVar, m0Var2, z15, bVar, cVar, bVar2, z3.f.c(206535781, new e23.u() { // from class: b21.h9
                                    /* JADX WARN: Code duplicated, block: B:22:0x010e  */
                                    /* JADX WARN: Code duplicated, block: B:31:0x0152  */
                                    @Override // e23.u
                                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj12, Object obj13, Object obj14, Object obj15, p3.m mVar2, Integer num) {
                                        i53.f fVarA;
                                        switch (i110) {
                                            case 0:
                                                u21.u0 u0Var = (u21.u0) u1Var;
                                                s21.a0 a0Var = (s21.a0) obj12;
                                                fe feVar = (fe) obj15;
                                                int iIntValue = num.intValue();
                                                a0Var.getClass();
                                                ((e23.l) obj13).getClass();
                                                ((e23.a) obj14).getClass();
                                                feVar.getClass();
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                String strQ = gl1.y.Q(mVar2, R.string.generic_error_message);
                                                s21.c0 c0Var = a0Var.f156038c;
                                                boolean zR = mVar2.r(a0Var) | ((((57344 & iIntValue) ^ 24576) > 16384 && mVar2.B(feVar)) || (iIntValue & 24576) == 16384) | mVar2.B(strQ);
                                                Object objQ = mVar2.q();
                                                p3.m.a aVar = p3.m.f135153a;
                                                if (zR) {
                                                    objQ = new ga(a0Var, feVar, strQ, null);
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new ga(a0Var, feVar, strQ, null);
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ, c0Var, mVar2);
                                                String strQ2 = gl1.y.Q(mVar2, R.string.nutrition);
                                                String strQ3 = gl1.y.Q(mVar2, R.string.lbl_common_continue);
                                                boolean z16 = a0Var.f156060y;
                                                j53.j jVarB = j53.l.b();
                                                i53.h<s21.z> hVarA4 = u0Var.A4();
                                                s21.v vVar2 = c0Var != null ? s21.v.ENABLED : s21.v.DISABLED;
                                                String strQ4 = gl1.y.Q(mVar2, R.string.continue_agree_disconnect_myfitnesspal);
                                                boolean zR2 = mVar2.r(u0Var);
                                                Object objQ2 = mVar2.q();
                                                if (zR2) {
                                                    objQ2 = new u8(u0Var, 0);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new u8(u0Var, 0);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                t21.d1.a(strQ2, feVar, m0Var2, strQ3, z16, false, jVarB, strQ4, (e23.a) objQ2, vVar2, hVarA4, false, null, fVar2, z3.f.c(-369484964, new a71.n(a0Var, 7), mVar2), mVar2, ((iIntValue >> 9) & 112) | 3866624, 24576, 6144);
                                                break;
                                            default:
                                                u21.u0 u0Var2 = (u21.u0) u1Var;
                                                s21.a0 a0Var2 = (s21.a0) obj12;
                                                e23.l lVar2 = (e23.l) obj13;
                                                e23.a aVar2 = (e23.a) obj14;
                                                fe feVar2 = (fe) obj15;
                                                int iIntValue2 = num.intValue();
                                                a0Var2.getClass();
                                                lVar2.getClass();
                                                aVar2.getClass();
                                                feVar2.getClass();
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                String strQ5 = gl1.y.Q(mVar2, R.string.nutrition);
                                                if (a0Var2.f156036a instanceof l4.n0) {
                                                    mVar2.C(325783033);
                                                    mVar2.f();
                                                    fVarA = j53.l.b();
                                                } else {
                                                    mVar2.C(325857092);
                                                    fVarA = i53.a.a(new l72.i3("EXIT", gl1.y.Q(mVar2, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                                                    mVar2.f();
                                                }
                                                t21.d1.a(strQ5, feVar2, m0Var2, null, a0Var2.f156060y, false, fVarA, null, null, s21.v.INVISIBLE, u0Var2.A4(), false, aVar2, fVar2, z3.f.c(526746206, new aa2.f(5, u0Var2, lVar2), mVar2), mVar2, ((iIntValue2 >> 9) & 112) | 807600128, ((iIntValue2 >> 3) & 896) | 24576, 2440);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, ((iB3 >> 3) & 14) | 1572864);
                                break;
                            case 3:
                                int iB4 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var4 = p3.n.f135158a;
                                lc.m0 m0Var3 = m0Var;
                                u9.a(vVar, m0Var3, z15, bVar, cVar, bVar2, z3.f.c(654651366, new l9(vVar, m0Var3, fVar2, i111), mVar), mVar, ((iB4 >> 3) & 14) | 1572864);
                                break;
                            default:
                                int iB5 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var5 = p3.n.f135158a;
                                final lc.m0 m0Var4 = m0Var;
                                u9.a(vVar, m0Var4, z15, bVar, cVar, bVar2, z3.f.c(1102766951, new e23.u() { // from class: b21.h9
                                    /* JADX WARN: Code duplicated, block: B:22:0x010e  */
                                    /* JADX WARN: Code duplicated, block: B:31:0x0152  */
                                    @Override // e23.u
                                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj12, Object obj13, Object obj14, Object obj15, p3.m mVar2, Integer num) {
                                        i53.f fVarA;
                                        switch (i111) {
                                            case 0:
                                                u21.u0 u0Var = (u21.u0) u1Var;
                                                s21.a0 a0Var = (s21.a0) obj12;
                                                fe feVar = (fe) obj15;
                                                int iIntValue = num.intValue();
                                                a0Var.getClass();
                                                ((e23.l) obj13).getClass();
                                                ((e23.a) obj14).getClass();
                                                feVar.getClass();
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                String strQ = gl1.y.Q(mVar2, R.string.generic_error_message);
                                                s21.c0 c0Var = a0Var.f156038c;
                                                boolean zR = mVar2.r(a0Var) | ((((57344 & iIntValue) ^ 24576) > 16384 && mVar2.B(feVar)) || (iIntValue & 24576) == 16384) | mVar2.B(strQ);
                                                Object objQ = mVar2.q();
                                                p3.m.a aVar = p3.m.f135153a;
                                                if (zR) {
                                                    objQ = new ga(a0Var, feVar, strQ, null);
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new ga(a0Var, feVar, strQ, null);
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ, c0Var, mVar2);
                                                String strQ2 = gl1.y.Q(mVar2, R.string.nutrition);
                                                String strQ3 = gl1.y.Q(mVar2, R.string.lbl_common_continue);
                                                boolean z16 = a0Var.f156060y;
                                                j53.j jVarB = j53.l.b();
                                                i53.h<s21.z> hVarA4 = u0Var.A4();
                                                s21.v vVar2 = c0Var != null ? s21.v.ENABLED : s21.v.DISABLED;
                                                String strQ4 = gl1.y.Q(mVar2, R.string.continue_agree_disconnect_myfitnesspal);
                                                boolean zR2 = mVar2.r(u0Var);
                                                Object objQ2 = mVar2.q();
                                                if (zR2) {
                                                    objQ2 = new u8(u0Var, 0);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new u8(u0Var, 0);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                t21.d1.a(strQ2, feVar, m0Var4, strQ3, z16, false, jVarB, strQ4, (e23.a) objQ2, vVar2, hVarA4, false, null, fVar2, z3.f.c(-369484964, new a71.n(a0Var, 7), mVar2), mVar2, ((iIntValue >> 9) & 112) | 3866624, 24576, 6144);
                                                break;
                                            default:
                                                u21.u0 u0Var2 = (u21.u0) u1Var;
                                                s21.a0 a0Var2 = (s21.a0) obj12;
                                                e23.l lVar2 = (e23.l) obj13;
                                                e23.a aVar2 = (e23.a) obj14;
                                                fe feVar2 = (fe) obj15;
                                                int iIntValue2 = num.intValue();
                                                a0Var2.getClass();
                                                lVar2.getClass();
                                                aVar2.getClass();
                                                feVar2.getClass();
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                String strQ5 = gl1.y.Q(mVar2, R.string.nutrition);
                                                if (a0Var2.f156036a instanceof l4.n0) {
                                                    mVar2.C(325783033);
                                                    mVar2.f();
                                                    fVarA = j53.l.b();
                                                } else {
                                                    mVar2.C(325857092);
                                                    fVarA = i53.a.a(new l72.i3("EXIT", gl1.y.Q(mVar2, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                                                    mVar2.f();
                                                }
                                                t21.d1.a(strQ5, feVar2, m0Var4, null, a0Var2.f156060y, false, fVarA, null, null, s21.v.INVISIBLE, u0Var2.A4(), false, aVar2, fVar2, z3.f.c(526746206, new aa2.f(5, u0Var2, lVar2), mVar2), mVar2, ((iIntValue2 >> 9) & 112) | 807600128, ((iIntValue2 >> 3) & 896) | 24576, 2440);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, ((iB5 >> 3) & 14) | 1572864);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                k23.p pVarB = p005kotlin.jvm.internal.s0.b(l01.k.class);
                n63.b.a aVar = n63.b.f123892d;
                final int i19 = 3;
                nc.n.a(k0Var, t0Var.b(l4.o0.class), p13.t0.b(new o13.p(pVarB, new ya(aVar))), j0Var, null, null, null, null, new z3.e(1384833369, true, new e23.r() { // from class: b21.d9
                    @Override // e23.r
                    public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                        int i110 = i19;
                        final int i111 = 0;
                        final int i112 = 1;
                        final NutritionActivity.f fVar2 = fVar;
                        r1.l lVar = (r1.l) obj8;
                        lc.v vVar = (lc.v) obj9;
                        p3.m mVar = (p3.m) obj10;
                        switch (i110) {
                            case 0:
                                int iB = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var = p3.n.f135158a;
                                u9.a(vVar, m0Var, z15, bVar, cVar, bVar2, z3.f.c(-689695389, new e9(fVar2, i112), mVar), mVar, ((iB >> 3) & 14) | 1572864);
                                break;
                            case 1:
                                int iB2 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var2 = p3.n.f135158a;
                                u9.a(vVar, m0Var, z15, bVar, cVar, bVar2, z3.f.c(-241579804, new e9(fVar2, i111), mVar), mVar, ((iB2 >> 3) & 14) | 1572864);
                                break;
                            case 2:
                                int iB3 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var3 = p3.n.f135158a;
                                final lc.m0 m0Var2 = m0Var;
                                u9.a(vVar, m0Var2, z15, bVar, cVar, bVar2, z3.f.c(206535781, new e23.u() { // from class: b21.h9
                                    /* JADX WARN: Code duplicated, block: B:22:0x010e  */
                                    /* JADX WARN: Code duplicated, block: B:31:0x0152  */
                                    @Override // e23.u
                                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj12, Object obj13, Object obj14, Object obj15, p3.m mVar2, Integer num) {
                                        i53.f fVarA;
                                        switch (i111) {
                                            case 0:
                                                u21.u0 u0Var = (u21.u0) u1Var;
                                                s21.a0 a0Var = (s21.a0) obj12;
                                                fe feVar = (fe) obj15;
                                                int iIntValue = num.intValue();
                                                a0Var.getClass();
                                                ((e23.l) obj13).getClass();
                                                ((e23.a) obj14).getClass();
                                                feVar.getClass();
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                String strQ = gl1.y.Q(mVar2, R.string.generic_error_message);
                                                s21.c0 c0Var = a0Var.f156038c;
                                                boolean zR = mVar2.r(a0Var) | ((((57344 & iIntValue) ^ 24576) > 16384 && mVar2.B(feVar)) || (iIntValue & 24576) == 16384) | mVar2.B(strQ);
                                                Object objQ = mVar2.q();
                                                p3.m.a aVar2 = p3.m.f135153a;
                                                if (zR) {
                                                    objQ = new ga(a0Var, feVar, strQ, null);
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new ga(a0Var, feVar, strQ, null);
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ, c0Var, mVar2);
                                                String strQ2 = gl1.y.Q(mVar2, R.string.nutrition);
                                                String strQ3 = gl1.y.Q(mVar2, R.string.lbl_common_continue);
                                                boolean z16 = a0Var.f156060y;
                                                j53.j jVarB = j53.l.b();
                                                i53.h<s21.z> hVarA4 = u0Var.A4();
                                                s21.v vVar2 = c0Var != null ? s21.v.ENABLED : s21.v.DISABLED;
                                                String strQ4 = gl1.y.Q(mVar2, R.string.continue_agree_disconnect_myfitnesspal);
                                                boolean zR2 = mVar2.r(u0Var);
                                                Object objQ2 = mVar2.q();
                                                if (zR2) {
                                                    objQ2 = new u8(u0Var, 0);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new u8(u0Var, 0);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                t21.d1.a(strQ2, feVar, m0Var2, strQ3, z16, false, jVarB, strQ4, (e23.a) objQ2, vVar2, hVarA4, false, null, fVar2, z3.f.c(-369484964, new a71.n(a0Var, 7), mVar2), mVar2, ((iIntValue >> 9) & 112) | 3866624, 24576, 6144);
                                                break;
                                            default:
                                                u21.u0 u0Var2 = (u21.u0) u1Var;
                                                s21.a0 a0Var2 = (s21.a0) obj12;
                                                e23.l lVar2 = (e23.l) obj13;
                                                e23.a aVar3 = (e23.a) obj14;
                                                fe feVar2 = (fe) obj15;
                                                int iIntValue2 = num.intValue();
                                                a0Var2.getClass();
                                                lVar2.getClass();
                                                aVar3.getClass();
                                                feVar2.getClass();
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                String strQ5 = gl1.y.Q(mVar2, R.string.nutrition);
                                                if (a0Var2.f156036a instanceof l4.n0) {
                                                    mVar2.C(325783033);
                                                    mVar2.f();
                                                    fVarA = j53.l.b();
                                                } else {
                                                    mVar2.C(325857092);
                                                    fVarA = i53.a.a(new l72.i3("EXIT", gl1.y.Q(mVar2, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                                                    mVar2.f();
                                                }
                                                t21.d1.a(strQ5, feVar2, m0Var2, null, a0Var2.f156060y, false, fVarA, null, null, s21.v.INVISIBLE, u0Var2.A4(), false, aVar3, fVar2, z3.f.c(526746206, new aa2.f(5, u0Var2, lVar2), mVar2), mVar2, ((iIntValue2 >> 9) & 112) | 807600128, ((iIntValue2 >> 3) & 896) | 24576, 2440);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, ((iB3 >> 3) & 14) | 1572864);
                                break;
                            case 3:
                                int iB4 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var4 = p3.n.f135158a;
                                lc.m0 m0Var3 = m0Var;
                                u9.a(vVar, m0Var3, z15, bVar, cVar, bVar2, z3.f.c(654651366, new l9(vVar, m0Var3, fVar2, i112), mVar), mVar, ((iB4 >> 3) & 14) | 1572864);
                                break;
                            default:
                                int iB5 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var5 = p3.n.f135158a;
                                final lc.m0 m0Var4 = m0Var;
                                u9.a(vVar, m0Var4, z15, bVar, cVar, bVar2, z3.f.c(1102766951, new e23.u() { // from class: b21.h9
                                    /* JADX WARN: Code duplicated, block: B:22:0x010e  */
                                    /* JADX WARN: Code duplicated, block: B:31:0x0152  */
                                    @Override // e23.u
                                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj12, Object obj13, Object obj14, Object obj15, p3.m mVar2, Integer num) {
                                        i53.f fVarA;
                                        switch (i112) {
                                            case 0:
                                                u21.u0 u0Var = (u21.u0) u1Var;
                                                s21.a0 a0Var = (s21.a0) obj12;
                                                fe feVar = (fe) obj15;
                                                int iIntValue = num.intValue();
                                                a0Var.getClass();
                                                ((e23.l) obj13).getClass();
                                                ((e23.a) obj14).getClass();
                                                feVar.getClass();
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                String strQ = gl1.y.Q(mVar2, R.string.generic_error_message);
                                                s21.c0 c0Var = a0Var.f156038c;
                                                boolean zR = mVar2.r(a0Var) | ((((57344 & iIntValue) ^ 24576) > 16384 && mVar2.B(feVar)) || (iIntValue & 24576) == 16384) | mVar2.B(strQ);
                                                Object objQ = mVar2.q();
                                                p3.m.a aVar2 = p3.m.f135153a;
                                                if (zR) {
                                                    objQ = new ga(a0Var, feVar, strQ, null);
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new ga(a0Var, feVar, strQ, null);
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ, c0Var, mVar2);
                                                String strQ2 = gl1.y.Q(mVar2, R.string.nutrition);
                                                String strQ3 = gl1.y.Q(mVar2, R.string.lbl_common_continue);
                                                boolean z16 = a0Var.f156060y;
                                                j53.j jVarB = j53.l.b();
                                                i53.h<s21.z> hVarA4 = u0Var.A4();
                                                s21.v vVar2 = c0Var != null ? s21.v.ENABLED : s21.v.DISABLED;
                                                String strQ4 = gl1.y.Q(mVar2, R.string.continue_agree_disconnect_myfitnesspal);
                                                boolean zR2 = mVar2.r(u0Var);
                                                Object objQ2 = mVar2.q();
                                                if (zR2) {
                                                    objQ2 = new u8(u0Var, 0);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new u8(u0Var, 0);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                t21.d1.a(strQ2, feVar, m0Var4, strQ3, z16, false, jVarB, strQ4, (e23.a) objQ2, vVar2, hVarA4, false, null, fVar2, z3.f.c(-369484964, new a71.n(a0Var, 7), mVar2), mVar2, ((iIntValue >> 9) & 112) | 3866624, 24576, 6144);
                                                break;
                                            default:
                                                u21.u0 u0Var2 = (u21.u0) u1Var;
                                                s21.a0 a0Var2 = (s21.a0) obj12;
                                                e23.l lVar2 = (e23.l) obj13;
                                                e23.a aVar3 = (e23.a) obj14;
                                                fe feVar2 = (fe) obj15;
                                                int iIntValue2 = num.intValue();
                                                a0Var2.getClass();
                                                lVar2.getClass();
                                                aVar3.getClass();
                                                feVar2.getClass();
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                String strQ5 = gl1.y.Q(mVar2, R.string.nutrition);
                                                if (a0Var2.f156036a instanceof l4.n0) {
                                                    mVar2.C(325783033);
                                                    mVar2.f();
                                                    fVarA = j53.l.b();
                                                } else {
                                                    mVar2.C(325857092);
                                                    fVarA = i53.a.a(new l72.i3("EXIT", gl1.y.Q(mVar2, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                                                    mVar2.f();
                                                }
                                                t21.d1.a(strQ5, feVar2, m0Var4, null, a0Var2.f156060y, false, fVarA, null, null, s21.v.INVISIBLE, u0Var2.A4(), false, aVar3, fVar2, z3.f.c(526746206, new aa2.f(5, u0Var2, lVar2), mVar2), mVar2, ((iIntValue2 >> 9) & 112) | 807600128, ((iIntValue2 >> 3) & 896) | 24576, 2440);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, ((iB5 >> 3) & 14) | 1572864);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i24 = 4;
                nc.n.a(k0Var, t0Var.b(l4.n0.class), k0Var2, j0Var, null, null, null, null, new z3.e(1832948954, true, new e23.r() { // from class: b21.d9
                    @Override // e23.r
                    public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                        int i110 = i24;
                        final int i111 = 0;
                        final int i112 = 1;
                        final NutritionActivity.f fVar2 = fVar;
                        r1.l lVar = (r1.l) obj8;
                        lc.v vVar = (lc.v) obj9;
                        p3.m mVar = (p3.m) obj10;
                        switch (i110) {
                            case 0:
                                int iB = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var = p3.n.f135158a;
                                u9.a(vVar, m0Var, z15, bVar, cVar, bVar2, z3.f.c(-689695389, new e9(fVar2, i112), mVar), mVar, ((iB >> 3) & 14) | 1572864);
                                break;
                            case 1:
                                int iB2 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var2 = p3.n.f135158a;
                                u9.a(vVar, m0Var, z15, bVar, cVar, bVar2, z3.f.c(-241579804, new e9(fVar2, i111), mVar), mVar, ((iB2 >> 3) & 14) | 1572864);
                                break;
                            case 2:
                                int iB3 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var3 = p3.n.f135158a;
                                final lc.m0 m0Var2 = m0Var;
                                u9.a(vVar, m0Var2, z15, bVar, cVar, bVar2, z3.f.c(206535781, new e23.u() { // from class: b21.h9
                                    /* JADX WARN: Code duplicated, block: B:22:0x010e  */
                                    /* JADX WARN: Code duplicated, block: B:31:0x0152  */
                                    @Override // e23.u
                                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj12, Object obj13, Object obj14, Object obj15, p3.m mVar2, Integer num) {
                                        i53.f fVarA;
                                        switch (i111) {
                                            case 0:
                                                u21.u0 u0Var = (u21.u0) u1Var;
                                                s21.a0 a0Var = (s21.a0) obj12;
                                                fe feVar = (fe) obj15;
                                                int iIntValue = num.intValue();
                                                a0Var.getClass();
                                                ((e23.l) obj13).getClass();
                                                ((e23.a) obj14).getClass();
                                                feVar.getClass();
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                String strQ = gl1.y.Q(mVar2, R.string.generic_error_message);
                                                s21.c0 c0Var = a0Var.f156038c;
                                                boolean zR = mVar2.r(a0Var) | ((((57344 & iIntValue) ^ 24576) > 16384 && mVar2.B(feVar)) || (iIntValue & 24576) == 16384) | mVar2.B(strQ);
                                                Object objQ = mVar2.q();
                                                p3.m.a aVar2 = p3.m.f135153a;
                                                if (zR) {
                                                    objQ = new ga(a0Var, feVar, strQ, null);
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new ga(a0Var, feVar, strQ, null);
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ, c0Var, mVar2);
                                                String strQ2 = gl1.y.Q(mVar2, R.string.nutrition);
                                                String strQ3 = gl1.y.Q(mVar2, R.string.lbl_common_continue);
                                                boolean z16 = a0Var.f156060y;
                                                j53.j jVarB = j53.l.b();
                                                i53.h<s21.z> hVarA4 = u0Var.A4();
                                                s21.v vVar2 = c0Var != null ? s21.v.ENABLED : s21.v.DISABLED;
                                                String strQ4 = gl1.y.Q(mVar2, R.string.continue_agree_disconnect_myfitnesspal);
                                                boolean zR2 = mVar2.r(u0Var);
                                                Object objQ2 = mVar2.q();
                                                if (zR2) {
                                                    objQ2 = new u8(u0Var, 0);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new u8(u0Var, 0);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                t21.d1.a(strQ2, feVar, m0Var2, strQ3, z16, false, jVarB, strQ4, (e23.a) objQ2, vVar2, hVarA4, false, null, fVar2, z3.f.c(-369484964, new a71.n(a0Var, 7), mVar2), mVar2, ((iIntValue >> 9) & 112) | 3866624, 24576, 6144);
                                                break;
                                            default:
                                                u21.u0 u0Var2 = (u21.u0) u1Var;
                                                s21.a0 a0Var2 = (s21.a0) obj12;
                                                e23.l lVar2 = (e23.l) obj13;
                                                e23.a aVar3 = (e23.a) obj14;
                                                fe feVar2 = (fe) obj15;
                                                int iIntValue2 = num.intValue();
                                                a0Var2.getClass();
                                                lVar2.getClass();
                                                aVar3.getClass();
                                                feVar2.getClass();
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                String strQ5 = gl1.y.Q(mVar2, R.string.nutrition);
                                                if (a0Var2.f156036a instanceof l4.n0) {
                                                    mVar2.C(325783033);
                                                    mVar2.f();
                                                    fVarA = j53.l.b();
                                                } else {
                                                    mVar2.C(325857092);
                                                    fVarA = i53.a.a(new l72.i3("EXIT", gl1.y.Q(mVar2, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                                                    mVar2.f();
                                                }
                                                t21.d1.a(strQ5, feVar2, m0Var2, null, a0Var2.f156060y, false, fVarA, null, null, s21.v.INVISIBLE, u0Var2.A4(), false, aVar3, fVar2, z3.f.c(526746206, new aa2.f(5, u0Var2, lVar2), mVar2), mVar2, ((iIntValue2 >> 9) & 112) | 807600128, ((iIntValue2 >> 3) & 896) | 24576, 2440);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, ((iB3 >> 3) & 14) | 1572864);
                                break;
                            case 3:
                                int iB4 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var4 = p3.n.f135158a;
                                lc.m0 m0Var3 = m0Var;
                                u9.a(vVar, m0Var3, z15, bVar, cVar, bVar2, z3.f.c(654651366, new l9(vVar, m0Var3, fVar2, i112), mVar), mVar, ((iB4 >> 3) & 14) | 1572864);
                                break;
                            default:
                                int iB5 = androidx.room.a0.b((Integer) obj11, lVar, vVar);
                                p3.x1 x1Var5 = p3.n.f135158a;
                                final lc.m0 m0Var4 = m0Var;
                                u9.a(vVar, m0Var4, z15, bVar, cVar, bVar2, z3.f.c(1102766951, new e23.u() { // from class: b21.h9
                                    /* JADX WARN: Code duplicated, block: B:22:0x010e  */
                                    /* JADX WARN: Code duplicated, block: B:31:0x0152  */
                                    @Override // e23.u
                                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj12, Object obj13, Object obj14, Object obj15, p3.m mVar2, Integer num) {
                                        i53.f fVarA;
                                        switch (i112) {
                                            case 0:
                                                u21.u0 u0Var = (u21.u0) u1Var;
                                                s21.a0 a0Var = (s21.a0) obj12;
                                                fe feVar = (fe) obj15;
                                                int iIntValue = num.intValue();
                                                a0Var.getClass();
                                                ((e23.l) obj13).getClass();
                                                ((e23.a) obj14).getClass();
                                                feVar.getClass();
                                                p3.x1 x1Var6 = p3.n.f135158a;
                                                String strQ = gl1.y.Q(mVar2, R.string.generic_error_message);
                                                s21.c0 c0Var = a0Var.f156038c;
                                                boolean zR = mVar2.r(a0Var) | ((((57344 & iIntValue) ^ 24576) > 16384 && mVar2.B(feVar)) || (iIntValue & 24576) == 16384) | mVar2.B(strQ);
                                                Object objQ = mVar2.q();
                                                p3.m.a aVar2 = p3.m.f135153a;
                                                if (zR) {
                                                    objQ = new ga(a0Var, feVar, strQ, null);
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new ga(a0Var, feVar, strQ, null);
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ, c0Var, mVar2);
                                                String strQ2 = gl1.y.Q(mVar2, R.string.nutrition);
                                                String strQ3 = gl1.y.Q(mVar2, R.string.lbl_common_continue);
                                                boolean z16 = a0Var.f156060y;
                                                j53.j jVarB = j53.l.b();
                                                i53.h<s21.z> hVarA4 = u0Var.A4();
                                                s21.v vVar2 = c0Var != null ? s21.v.ENABLED : s21.v.DISABLED;
                                                String strQ4 = gl1.y.Q(mVar2, R.string.continue_agree_disconnect_myfitnesspal);
                                                boolean zR2 = mVar2.r(u0Var);
                                                Object objQ2 = mVar2.q();
                                                if (zR2) {
                                                    objQ2 = new u8(u0Var, 0);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new u8(u0Var, 0);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                t21.d1.a(strQ2, feVar, m0Var4, strQ3, z16, false, jVarB, strQ4, (e23.a) objQ2, vVar2, hVarA4, false, null, fVar2, z3.f.c(-369484964, new a71.n(a0Var, 7), mVar2), mVar2, ((iIntValue >> 9) & 112) | 3866624, 24576, 6144);
                                                break;
                                            default:
                                                u21.u0 u0Var2 = (u21.u0) u1Var;
                                                s21.a0 a0Var2 = (s21.a0) obj12;
                                                e23.l lVar2 = (e23.l) obj13;
                                                e23.a aVar3 = (e23.a) obj14;
                                                fe feVar2 = (fe) obj15;
                                                int iIntValue2 = num.intValue();
                                                a0Var2.getClass();
                                                lVar2.getClass();
                                                aVar3.getClass();
                                                feVar2.getClass();
                                                p3.x1 x1Var7 = p3.n.f135158a;
                                                String strQ5 = gl1.y.Q(mVar2, R.string.nutrition);
                                                if (a0Var2.f156036a instanceof l4.n0) {
                                                    mVar2.C(325783033);
                                                    mVar2.f();
                                                    fVarA = j53.l.b();
                                                } else {
                                                    mVar2.C(325857092);
                                                    fVarA = i53.a.a(new l72.i3("EXIT", gl1.y.Q(mVar2, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                                                    mVar2.f();
                                                }
                                                t21.d1.a(strQ5, feVar2, m0Var4, null, a0Var2.f156060y, false, fVarA, null, null, s21.v.INVISIBLE, u0Var2.A4(), false, aVar3, fVar2, z3.f.c(526746206, new aa2.f(5, u0Var2, lVar2), mVar2), mVar2, ((iIntValue2 >> 9) & 112) | 807600128, ((iIntValue2 >> 3) & 896) | 24576, 2440);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, ((iB5 >> 3) & 14) | 1572864);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                nc.n.a(k0Var, t0Var.b(l4.q0.class), k0Var2, j0Var, null, null, null, null, new z3.e(-2013902757, true, new b9(m0Var, z15, bVar, cVar, bVar2, fVar, eVar, 2)));
                nc.n.a(k0Var, t0Var.b(l4.t0.class), k0Var2, j0Var, null, null, null, null, new z3.e(-1565787172, true, new b9(m0Var, z15, bVar, cVar, bVar2, fVar, eVar, 3)));
                nc.n.a(k0Var, t0Var.b(l4.r0.class), k0Var2, j0Var, null, null, null, null, new z3.e(-1117671587, true, new b9(m0Var, z15, bVar, cVar, bVar2, fVar, eVar, 4)));
                nc.n.a(k0Var, t0Var.b(l4.s0.class), k0Var2, j0Var, null, null, null, null, new z3.e(-669556002, true, new b9(m0Var, z15, bVar, cVar, bVar2, fVar, eVar, 5)));
                nc.n.a(k0Var, t0Var.b(l4.j0.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.b(l01.k.class), new za(aVar))), j0Var, null, null, null, null, new z3.e(1530511148, true, new a9(m0Var, z15, bVar, cVar, bVar2, 1)));
                nc.n.a(k0Var, t0Var.b(l4.e0.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.b(l01.k.class), new ab(aVar))), j0Var, null, null, null, null, new z3.e(1978626733, true, new b9(m0Var, z15, bVar, cVar, bVar2, fVar, eVar, 0)));
                final int i25 = 0;
                nc.n.a(k0Var, t0Var.b(l4.a0.class), k0Var2, j0Var, null, null, null, null, new z3.e(-1868224978, true, new e23.r() { // from class: b21.c9
                    @Override // e23.r
                    public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                        int i26 = i25;
                        v21.e eVar3 = eVar;
                        lc.v vVar = (lc.v) obj9;
                        p3.m mVar = (p3.m) obj10;
                        int iB = androidx.room.a0.b((Integer) obj11, (r1.l) obj8, vVar);
                        switch (i26) {
                            case 0:
                                p3.x1 x1Var = p3.n.f135158a;
                                lc.m0 m0Var2 = m0Var;
                                u9.a(vVar, m0Var2, z15, bVar, cVar, bVar2, z3.f.c(1265936705, new f9(vVar, m0Var2, eVar3), mVar), mVar, ((iB >> 3) & 14) | 1572864);
                                break;
                            case 1:
                                p3.x1 x1Var2 = p3.n.f135158a;
                                lc.m0 m0Var3 = m0Var;
                                u9.a(vVar, m0Var3, z15, bVar, cVar, bVar2, z3.f.c(1714052290, new f9(vVar, eVar3, m0Var3, 0), mVar), mVar, ((iB >> 3) & 14) | 1572864);
                                break;
                            default:
                                p3.x1 x1Var3 = p3.n.f135158a;
                                lc.m0 m0Var4 = m0Var;
                                u9.a(vVar, m0Var4, z15, bVar, cVar, bVar2, z3.f.c(-2132799421, new f9(vVar, eVar3, m0Var4, 2), mVar), mVar, ((iB >> 3) & 14) | 1572864);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i26 = 1;
                nc.n.a(k0Var, t0Var.b(l4.b0.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.b(s21.g.class), new bb(aVar))), j0Var, null, null, null, null, new z3.e(-1420109393, true, new e23.r() { // from class: b21.c9
                    @Override // e23.r
                    public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                        int i27 = i26;
                        v21.e eVar3 = eVar;
                        lc.v vVar = (lc.v) obj9;
                        p3.m mVar = (p3.m) obj10;
                        int iB = androidx.room.a0.b((Integer) obj11, (r1.l) obj8, vVar);
                        switch (i27) {
                            case 0:
                                p3.x1 x1Var = p3.n.f135158a;
                                lc.m0 m0Var2 = m0Var;
                                u9.a(vVar, m0Var2, z15, bVar, cVar, bVar2, z3.f.c(1265936705, new f9(vVar, m0Var2, eVar3), mVar), mVar, ((iB >> 3) & 14) | 1572864);
                                break;
                            case 1:
                                p3.x1 x1Var2 = p3.n.f135158a;
                                lc.m0 m0Var3 = m0Var;
                                u9.a(vVar, m0Var3, z15, bVar, cVar, bVar2, z3.f.c(1714052290, new f9(vVar, eVar3, m0Var3, 0), mVar), mVar, ((iB >> 3) & 14) | 1572864);
                                break;
                            default:
                                p3.x1 x1Var3 = p3.n.f135158a;
                                lc.m0 m0Var4 = m0Var;
                                u9.a(vVar, m0Var4, z15, bVar, cVar, bVar2, z3.f.c(-2132799421, new f9(vVar, eVar3, m0Var4, 2), mVar), mVar, ((iB >> 3) & 14) | 1572864);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                nc.n.a(k0Var, t0Var.b(l4.d0.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.b(s21.o.class), new cb(aVar))), j0Var, qa.f15182a, ra.f15209a, sa.f15242a, ta.f15267a, new z3.e(1257981172, true, new e(m0Var, eVar, 4)));
                nc.n.a(k0Var, t0Var.b(l4.c0.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.b(s21.o.class), new db(aVar))), j0Var, ua.f15289a, va.f15332a, wa.f15370a, xa.f15399a, new z3.e(-112176661, true, new m(m0Var, 2)));
                final int i27 = 2;
                nc.n.a(k0Var, t0Var.b(l4.z.class), k0Var2, j0Var, null, null, null, null, new z3.e(-971993808, true, new e23.r() { // from class: b21.c9
                    @Override // e23.r
                    public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                        int i28 = i27;
                        v21.e eVar3 = eVar;
                        lc.v vVar = (lc.v) obj9;
                        p3.m mVar = (p3.m) obj10;
                        int iB = androidx.room.a0.b((Integer) obj11, (r1.l) obj8, vVar);
                        switch (i28) {
                            case 0:
                                p3.x1 x1Var = p3.n.f135158a;
                                lc.m0 m0Var2 = m0Var;
                                u9.a(vVar, m0Var2, z15, bVar, cVar, bVar2, z3.f.c(1265936705, new f9(vVar, m0Var2, eVar3), mVar), mVar, ((iB >> 3) & 14) | 1572864);
                                break;
                            case 1:
                                p3.x1 x1Var2 = p3.n.f135158a;
                                lc.m0 m0Var3 = m0Var;
                                u9.a(vVar, m0Var3, z15, bVar, cVar, bVar2, z3.f.c(1714052290, new f9(vVar, eVar3, m0Var3, 0), mVar), mVar, ((iB >> 3) & 14) | 1572864);
                                break;
                            default:
                                p3.x1 x1Var3 = p3.n.f135158a;
                                lc.m0 m0Var4 = m0Var;
                                u9.a(vVar, m0Var4, z15, bVar, cVar, bVar2, z3.f.c(-2132799421, new f9(vVar, eVar3, m0Var4, 2), mVar), mVar, ((iB >> 3) & 14) | 1572864);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                nc.n.a(k0Var, t0Var.b(l4.p0.class), k0Var2, j0Var, null, null, null, null, new z3.e(-523878223, true, new b9(m0Var, z15, bVar, cVar, bVar2, fVar, eVar, 1)));
                m0Var.getClass();
                eVar.getClass();
                ge1.b.U(k0Var, t0Var.b(c.g.class), c.e.INSTANCE, k0Var2, new l(m0Var, eVar, 0));
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj7;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                an0.d dVar = (an0.d) obj3;
                kotlin.m3 m3Var = (kotlin.m3) obj2;
                p5.k0 k0Var3 = (p5.k0) obj;
                i3.y5.f90403b.getClass();
                if (p005kotlin.jvm.internal.s.g(str, i3.y5.f90406e)) {
                    p5.l.f136032b.getClass();
                    p5.h0.w(k0Var3, 0);
                    if (!z14) {
                        str2 = str3;
                    }
                    p5.h0.z(k0Var3, str2);
                    p5.h0.n(k0Var3, str4);
                } else {
                    p5.l.f136032b.getClass();
                    p5.h0.w(k0Var3, p5.l.f136038h);
                }
                p5.h0.i(k0Var3, null, new i3.d6(dVar, i15, str, m3Var));
                return Unit.INSTANCE;
            case 2:
                mc mcVar = (mc) obj7;
                String str5 = (String) obj6;
                String str6 = (String) obj5;
                String str7 = (String) obj4;
                e23.a aVar2 = (e23.a) obj3;
                o53.b0 b0Var = (o53.b0) obj2;
                p5.k0 k0Var4 = (p5.k0) obj;
                if (z14) {
                    p5.h0.c(k0Var4, str5, new gt1.s(aVar2, 21));
                    pc pcVarC = mcVar.c();
                    pc pcVar = pc.PartiallyExpanded;
                    if (pcVarC == pcVar) {
                        p5.h0.d(k0Var4, str6, new i3.d6(mcVar, 1, b0Var, mcVar));
                    } else if (mcVar.f88996e.e().d(pcVar)) {
                        p5.h0.a(k0Var4, str7, new cn1.t(mcVar, b0Var, 19));
                    }
                }
                return Unit.INSTANCE;
            case 3:
                i53.c cVar2 = (i53.c) obj7;
                kl1.a aVar3 = (kl1.a) obj6;
                jl1.g gVar = (jl1.g) obj5;
                w02.p pVar = (w02.p) obj;
                pVar.getClass();
                jl1.b.f99470a.getClass();
                e2.f0.b(pVar, null, jl1.b.f99471b, 3);
                e2.f0.b(pVar, null, jl1.b.f99472c, 3);
                pVar.l(cVar2.size(), new jl1.f.g(new in2.e((byte) 0, 18), cVar2), new jl1.f.h(cVar2), new z3.e(-2133055206, true, new jl1.f.i(cVar2, aVar3, this.f15447b, gVar, cVar2, (p3.p1) obj4)));
                e2.f0.b(pVar, null, jl1.b.f99473d, 3);
                e2.f0.b(pVar, null, new z3.e(329985688, true, new fb0.b(aVar3, gVar, (p3.p1) obj3, (p3.n1) obj2, 15)), 3);
                return Unit.INSTANCE;
            case 4:
                o53.b0 b0Var2 = (o53.b0) obj7;
                oe0.d dVar2 = (oe0.d) obj6;
                Context context = (Context) obj5;
                fe feVar = (fe) obj4;
                String str8 = (String) obj3;
                String str9 = (String) obj2;
                l72.i3 i3Var = (l72.i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "SAVE")) {
                    if (z14) {
                        ge1.b.T(b0Var2, null, null, new vd0.f(feVar, str8, str9, null), 3);
                    } else {
                        r53.p2 p2Var = dVar2.f131259d;
                        if (!((oe0.a) p2Var.getValue()).f131247a) {
                            do {
                                value = p2Var.getValue();
                            } while (!p2Var.b(value, oe0.a.a((oe0.a) value, true, false, 2)));
                            ge1.b.T(androidx.lifecycle.v1.a(dVar2), null, null, new oe0.c(dVar2, context, null), 3);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 5:
                o53.b0 b0Var3 = (o53.b0) obj7;
                oe0.s sVar = (oe0.s) obj6;
                Context context2 = (Context) obj5;
                fe feVar2 = (fe) obj4;
                String str10 = (String) obj3;
                String str11 = (String) obj2;
                l72.i3 i3Var2 = (l72.i3) obj;
                i3Var2.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var2.f111063a, "SAVE")) {
                    if (z14) {
                        ge1.b.T(b0Var3, null, null, new vd0.i1(feVar2, str10, str11, null), 3);
                    } else {
                        r53.p2 p2Var2 = sVar.f131410f;
                        if (!((oe0.o) p2Var2.getValue()).f131390b) {
                            do {
                                value2 = p2Var2.getValue();
                            } while (!p2Var2.b(value2, oe0.o.a((oe0.o) value2, false, true, false, false, false, 245)));
                            ge1.b.T(androidx.lifecycle.v1.a(sVar), null, null, new oe0.t(sVar, context2, null), 3);
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                NutritionActivity nutritionActivity = (NutritionActivity) obj7;
                final v21.e eVar3 = (v21.e) obj6;
                x01.k kVar = (x01.k) obj5;
                DateTime dateTime = (DateTime) obj4;
                o82.g gVar2 = (o82.g) obj3;
                lc.k0 k0Var5 = (lc.k0) obj;
                NutritionActivity.a aVar4 = NutritionActivity.f39581f;
                k0Var5.getClass();
                z3.e eVar4 = new z3.e(2143626257, true, new o72.m1(21, (p3.x3) obj2, nutritionActivity));
                p13.k0 k0Var6 = p13.k0.f134949a;
                k0Var6.getClass();
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var5, t0Var2.b(fb.f.class), k0Var6, j0Var2, null, null, null, null, eVar4);
                lc.m0 m0Var2 = nutritionActivity.f39582e;
                if (m0Var2 == null) {
                    p005kotlin.jvm.internal.s.m("navHostController");
                    throw null;
                }
                NutritionActivity.f fVar2 = new NutritionActivity.f(nutritionActivity.getOnBackPressedDispatcher());
                x01.b bVar3 = new x01.b(nutritionActivity, 0);
                x01.b bVar4 = new x01.b(nutritionActivity, 1);
                x01.c cVar3 = new x01.c(nutritionActivity, 0);
                eVar3.getClass();
                ge1.b.U(k0Var5, t0Var2.b(fb.e.class), l4.i0.INSTANCE, k0Var6, new z8(0, m0Var2, eVar3, bVar4, cVar3, bVar3, fVar2, this.f15447b));
                final lc.m0 m0Var3 = nutritionActivity.f39582e;
                if (m0Var3 == null) {
                    p005kotlin.jvm.internal.s.m("navHostController");
                    throw null;
                }
                final r53.b2 b2Var = kVar.f188298l;
                final l4.y0 y0Var = l4.y0.INSTANCE;
                final b63.o oVarD = (dateTime == null || (localDate = dateTime.toLocalDate()) == null) ? g22.l.d(b63.o.INSTANCE) : g22.k.t(localDate);
                if (gVar2 == null) {
                    gVar2 = o82.g.f130850c;
                }
                final o82.g gVar3 = gVar2;
                final boolean zHa = nutritionActivity.ha();
                final x01.a aVar5 = new x01.a(kVar, 2);
                final NutritionActivity.g gVar4 = new NutritionActivity.g(nutritionActivity.getOnBackPressedDispatcher());
                b2Var.getClass();
                y0Var.getClass();
                gVar3.getClass();
                ge1.b.U(k0Var5, t0Var2.b(fb.c.class), y0Var, k0Var6, new e23.l() { // from class: b21.v0
                    @Override // e23.l
                    public final Object invoke(Object obj8) {
                        lc.k0 k0Var7 = (lc.k0) obj8;
                        k0Var7.getClass();
                        l4 l4Var = y0Var;
                        l4.m mVar = l4Var instanceof l4.m ? (l4.m) l4Var : null;
                        final lc.m0 m0Var4 = m0Var3;
                        m0Var4.getClass();
                        v21.e eVar5 = eVar3;
                        eVar5.getClass();
                        if (mVar == null) {
                            mVar = new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(b63.u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null);
                        }
                        final NutritionActivity.g gVar5 = gVar4;
                        a4.a aVar6 = new a4.a(m0Var4, 14, gVar5, eVar5);
                        p13.k0 k0Var8 = p13.k0.f134949a;
                        k0Var8.getClass();
                        p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                        ge1.b.U(k0Var7, t0Var3.b(fb.b.class), mVar, k0Var8, aVar6);
                        final r53.o2 o2Var = b2Var;
                        z3.e eVar6 = new z3.e(217023678, true, new b9(m0Var4, o2Var, oVarD, gVar3, zHa, aVar5, gVar5));
                        p13.j0 j0Var3 = p13.j0.f134944a;
                        nc.n.a(k0Var7, t0Var3.b(l4.y0.class), k0Var8, j0Var3, null, null, null, null, eVar6);
                        k23.p pVarC = p005kotlin.jvm.internal.s0.c(b11.m.class);
                        n63.b.a aVar7 = n63.b.f123892d;
                        nc.n.a(k0Var7, t0Var3.b(l4.a.class), p13.t0.b(new o13.p(pVarC, new c4(aVar7))), j0Var3, h2.f14710a, s2.f15224a, d3.f14604a, f3.f14658a, new z3.e(-365229421, true, new p0(m0Var4, gVar5, 8)));
                        final int i28 = 0;
                        nc.n.a(k0Var7, t0Var3.b(l4.k.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(b11.m.class), new d4(aVar7))), j0Var3, g3.f14686a, h3.f14711a, i3.f14740a, j3.f14765a, new z3.e(-1494800374, true, new e23.r() { // from class: b21.m0
                            @Override // e23.r
                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                r1.l lVar = (r1.l) obj9;
                                switch (i28) {
                                    case 0:
                                        lc.v vVar = (lc.v) obj10;
                                        p3.m mVar2 = (p3.m) obj11;
                                        int iB = androidx.room.a0.b((Integer) obj12, lVar, vVar);
                                        p3.x1 x1Var = p3.n.f135158a;
                                        r53.o2 o2Var2 = o2Var;
                                        NutritionActivity.g gVar6 = gVar5;
                                        lc.m0 m0Var5 = m0Var4;
                                        d1.a(vVar, m0Var5, z3.f.c(-523651916, new w0(vVar, o2Var2, gVar6, m0Var5, 2), mVar2), mVar2, ((iB >> 3) & 14) | 384);
                                        break;
                                    case 1:
                                        lc.v vVar2 = (lc.v) obj10;
                                        p3.m mVar3 = (p3.m) obj11;
                                        int iB2 = androidx.room.a0.b((Integer) obj12, lVar, vVar2);
                                        p3.x1 x1Var2 = p3.n.f135158a;
                                        r53.o2 o2Var3 = o2Var;
                                        lc.m0 m0Var6 = m0Var4;
                                        d1.a(vVar2, m0Var6, z3.f.c(-1440922954, new w0(vVar2, o2Var3, m0Var6, gVar5), mVar3), mVar3, ((iB2 >> 3) & 14) | 384);
                                        break;
                                    default:
                                        lc.v vVar3 = (lc.v) obj10;
                                        p3.m mVar4 = (p3.m) obj11;
                                        int iB3 = androidx.room.a0.b((Integer) obj12, lVar, vVar3);
                                        p3.x1 x1Var3 = p3.n.f135158a;
                                        r53.o2 o2Var4 = o2Var;
                                        NutritionActivity.g gVar7 = gVar5;
                                        lc.m0 m0Var7 = m0Var4;
                                        d1.a(vVar3, m0Var7, z3.f.c(-2095950737, new w0(vVar3, o2Var4, gVar7, m0Var7, 0), mVar4), mVar4, ((iB3 >> 3) & 14) | 384);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }));
                        nc.n.a(k0Var7, t0Var3.b(l4.h.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.b(b11.m.class), new e4(aVar7))), j0Var3, k3.f14795a, x1.f15377a, y1.f15404a, z1.f15429a, new z3.e(-1953435893, true, new p0(m0Var4, gVar5, 0)));
                        final int i29 = 1;
                        nc.n.a(k0Var7, t0Var3.b(l4.v0.class), k0Var8, j0Var3, s3.f15225a, t3.f15251a, u3.f15276a, v3.f15305a, new z3.e(1882895884, true, new e23.r() { // from class: b21.m0
                            @Override // e23.r
                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                r1.l lVar = (r1.l) obj9;
                                switch (i29) {
                                    case 0:
                                        lc.v vVar = (lc.v) obj10;
                                        p3.m mVar2 = (p3.m) obj11;
                                        int iB = androidx.room.a0.b((Integer) obj12, lVar, vVar);
                                        p3.x1 x1Var = p3.n.f135158a;
                                        r53.o2 o2Var2 = o2Var;
                                        NutritionActivity.g gVar6 = gVar5;
                                        lc.m0 m0Var5 = m0Var4;
                                        d1.a(vVar, m0Var5, z3.f.c(-523651916, new w0(vVar, o2Var2, gVar6, m0Var5, 2), mVar2), mVar2, ((iB >> 3) & 14) | 384);
                                        break;
                                    case 1:
                                        lc.v vVar2 = (lc.v) obj10;
                                        p3.m mVar3 = (p3.m) obj11;
                                        int iB2 = androidx.room.a0.b((Integer) obj12, lVar, vVar2);
                                        p3.x1 x1Var2 = p3.n.f135158a;
                                        r53.o2 o2Var3 = o2Var;
                                        lc.m0 m0Var6 = m0Var4;
                                        d1.a(vVar2, m0Var6, z3.f.c(-1440922954, new w0(vVar2, o2Var3, m0Var6, gVar5), mVar3), mVar3, ((iB2 >> 3) & 14) | 384);
                                        break;
                                    default:
                                        lc.v vVar3 = (lc.v) obj10;
                                        p3.m mVar4 = (p3.m) obj11;
                                        int iB3 = androidx.room.a0.b((Integer) obj12, lVar, vVar3);
                                        p3.x1 x1Var3 = p3.n.f135158a;
                                        r53.o2 o2Var4 = o2Var;
                                        NutritionActivity.g gVar7 = gVar5;
                                        lc.m0 m0Var7 = m0Var4;
                                        d1.a(vVar3, m0Var7, z3.f.c(-2095950737, new w0(vVar3, o2Var4, gVar7, m0Var7, 0), mVar4), mVar4, ((iB3 >> 3) & 14) | 384);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }));
                        nc.n.a(k0Var7, t0Var3.b(l4.y.class), k0Var8, j0Var3, w3.f15343a, x3.f15379a, y3.f15406a, z3.f15431a, new z3.e(1424260365, true, new q0(m0Var4, gVar5, eVar5)));
                        nc.n.a(k0Var7, t0Var3.b(l4.w0.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(b11.m.class), new f4(aVar7))), j0Var3, a2.f14490a, b2.f14532a, c2.f14569a, d2.f14603a, new z3.e(965624846, true, new p0(m0Var4, gVar5, 1)));
                        nc.n.a(k0Var7, t0Var3.b(l4.r.class), k0Var8, j0Var3, a4.f14492a, l3.f14828a, m3.f15039a, n3.f15062a, new z3.e(506989327, true, new p0(m0Var4, gVar5, 2)));
                        nc.n.a(k0Var7, t0Var3.b(l4.i.class), k0Var8, j0Var3, o3.f15094a, p3.f15132a, q3.f15168a, r3.f15192a, new z3.e(48353808, true, new p0(m0Var4, gVar5, 3)));
                        nc.n.a(k0Var7, t0Var3.b(l4.j.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(b11.m.class), new g4(aVar7))), j0Var3, e2.f14637a, f2.f14657a, g2.f14685a, i2.f14739a, new z3.e(-410281711, true, new p0(m0Var4, gVar5, 4)));
                        nc.n.a(k0Var7, t0Var3.b(l4.g.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(b11.m.class), new h4(aVar7))), j0Var3, j2.f14764a, k2.f14794a, l2.f14827a, m2.f15038a, new z3.e(-868917230, true, new p0(m0Var4, gVar5, 5)));
                        nc.n.a(k0Var7, t0Var3.b(l4.f.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(b11.m.class), new i4(aVar7))), j0Var3, n2.f15061a, o2.f15093a, p2.f15131a, q2.f15167a, new z3.e(-760875306, true, new q0(m0Var4, eVar5, gVar5, 1)));
                        nc.n.a(k0Var7, t0Var3.b(l4.b.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(b11.m.class), new j4(aVar7))), j0Var3, r2.f15191a, t2.f15250a, u2.f15275a, v2.f15304a, new z3.e(-1219510825, true, new p0(m0Var4, gVar5, 6)));
                        nc.n.a(k0Var7, t0Var3.b(l4.c.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(b11.m.class), new k4(aVar7))), j0Var3, w2.f15342a, x2.f15378a, y2.f15405a, z2.f15430a, new z3.e(-1678146344, true, new p0(m0Var4, gVar5, 7)));
                        final int i30 = 2;
                        nc.n.a(k0Var7, t0Var3.b(l4.l.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(b11.m.class), new b4(aVar7))), j0Var3, a3.f14491a, b3.f14533a, c3.f14570a, e3.f14638a, new z3.e(-2136781863, true, new e23.r() { // from class: b21.m0
                            @Override // e23.r
                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                r1.l lVar = (r1.l) obj9;
                                switch (i30) {
                                    case 0:
                                        lc.v vVar = (lc.v) obj10;
                                        p3.m mVar2 = (p3.m) obj11;
                                        int iB = androidx.room.a0.b((Integer) obj12, lVar, vVar);
                                        p3.x1 x1Var = p3.n.f135158a;
                                        r53.o2 o2Var2 = o2Var;
                                        NutritionActivity.g gVar6 = gVar5;
                                        lc.m0 m0Var5 = m0Var4;
                                        d1.a(vVar, m0Var5, z3.f.c(-523651916, new w0(vVar, o2Var2, gVar6, m0Var5, 2), mVar2), mVar2, ((iB >> 3) & 14) | 384);
                                        break;
                                    case 1:
                                        lc.v vVar2 = (lc.v) obj10;
                                        p3.m mVar3 = (p3.m) obj11;
                                        int iB2 = androidx.room.a0.b((Integer) obj12, lVar, vVar2);
                                        p3.x1 x1Var2 = p3.n.f135158a;
                                        r53.o2 o2Var3 = o2Var;
                                        lc.m0 m0Var6 = m0Var4;
                                        d1.a(vVar2, m0Var6, z3.f.c(-1440922954, new w0(vVar2, o2Var3, m0Var6, gVar5), mVar3), mVar3, ((iB2 >> 3) & 14) | 384);
                                        break;
                                    default:
                                        lc.v vVar3 = (lc.v) obj10;
                                        p3.m mVar4 = (p3.m) obj11;
                                        int iB3 = androidx.room.a0.b((Integer) obj12, lVar, vVar3);
                                        p3.x1 x1Var3 = p3.n.f135158a;
                                        r53.o2 o2Var4 = o2Var;
                                        NutritionActivity.g gVar7 = gVar5;
                                        lc.m0 m0Var7 = m0Var4;
                                        d1.a(vVar3, m0Var7, z3.f.c(-2095950737, new w0(vVar3, o2Var4, gVar7, m0Var7, 0), mVar4), mVar4, ((iB3 >> 3) & 14) | 384);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }));
                        ConsentActivity.f32155r.getClass();
                        lc.b bVar5 = new lc.b((lc.a) k0Var7.f111792h.b(lc.a.class), t0Var3.b(l4.u0.class), p13.u0.h(p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(z10.f0.class), new com.garmin.android.apps.connectmobile.consent.c())), k0Var8));
                        bVar5.f111721i = t0Var3.b(ConsentActivity.class);
                        k0Var7.f111797m.add(bVar5.a());
                        return Unit.INSTANCE;
                    }
                });
                lc.m0 m0Var4 = nutritionActivity.f39582e;
                if (m0Var4 == null) {
                    p005kotlin.jvm.internal.s.m("navHostController");
                    throw null;
                }
                ge1.b.U(k0Var5, t0Var2.b(fb.d.class), l4.g0.INSTANCE, k0Var6, new a4.a(m0Var4, 15, new x01.b(nutritionActivity, 2), eVar3));
                nc.n.a(k0Var5, t0Var2.b(fb.a.class), k0Var6, j0Var2, NutritionActivity.i.f39590a, NutritionActivity.j.f39591a, NutritionActivity.k.f39592a, NutritionActivity.l.f39593a, new z3.e(1675411110, true, new a6.c(nutritionActivity, 20)));
                HelpActivity.f36653a.getClass();
                lc.b bVar5 = new lc.b((lc.a) k0Var5.f111792h.b(lc.a.class), t0Var2.b(l4.n.class), p13.u0.h(p13.t0.b(HelpActivity.a.c()), k0Var6));
                bVar5.f111721i = t0Var2.b(HelpActivity.class);
                k0Var5.f111797m.add(bVar5.a());
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ z8(int i14, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z14) {
        this.f15446a = i14;
        this.f15448c = obj;
        this.f15449d = obj2;
        this.f15447b = z14;
        this.f15450e = obj3;
        this.f15451f = obj4;
        this.f15452g = obj5;
        this.f15453h = obj6;
    }

    public /* synthetic */ z8(boolean z14, mc mcVar, String str, String str2, String str3, e23.a aVar, o53.b0 b0Var) {
        this.f15446a = 2;
        this.f15447b = z14;
        this.f15448c = mcVar;
        this.f15449d = str;
        this.f15450e = str2;
        this.f15451f = str3;
        this.f15452g = aVar;
        this.f15453h = b0Var;
    }

    public /* synthetic */ z8(boolean z14, o53.b0 b0Var, androidx.lifecycle.u1 u1Var, boolean z15, Context context, fe feVar, String str, String str2, int i14) {
        this.f15446a = i14;
        this.f15447b = z14;
        this.f15448c = b0Var;
        this.f15449d = u1Var;
        this.f15450e = context;
        this.f15451f = feVar;
        this.f15452g = str;
        this.f15453h = str2;
    }
}
