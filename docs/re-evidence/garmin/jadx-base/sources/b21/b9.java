package b21;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.google.android.exoplayer2.C;
import i3.fe;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b9 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f14546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f14551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f14552h;

    public /* synthetic */ b9(lc.m0 m0Var, r53.o2 o2Var, b63.o oVar, o82.g gVar, boolean z14, x01.a aVar, NutritionActivity.g gVar2) {
        this.f14545a = 6;
        this.f14546b = m0Var;
        this.f14548d = o2Var;
        this.f14549e = oVar;
        this.f14550f = gVar;
        this.f14547c = z14;
        this.f14551g = aVar;
        this.f14552h = gVar2;
    }

    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f14545a;
        Object obj5 = this.f14552h;
        e23.a aVar = this.f14551g;
        Object obj6 = this.f14550f;
        Object obj7 = this.f14549e;
        Object obj8 = this.f14548d;
        final int i15 = 3;
        switch (i14) {
            case 0:
                final NutritionActivity.f fVar = (NutritionActivity.f) aVar;
                final v21.e eVar = (v21.e) obj5;
                final lc.v vVar = (lc.v) obj2;
                p3.m mVar = (p3.m) obj3;
                int iB = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar);
                p3.x1 x1Var = p3.n.f135158a;
                final int i16 = 1;
                final lc.m0 m0Var = this.f14546b;
                u9.a(vVar, m0Var, this.f14547c, (x01.b) obj8, (x01.c) obj7, (x01.b) obj6, z3.f.c(817821120, new e23.u() { // from class: b21.j9
                    /* JADX WARN: Code duplicated, block: B:13:0x009a  */
                    /* JADX WARN: Code duplicated, block: B:20:0x011e  */
                    /* JADX WARN: Code duplicated, block: B:27:0x0196  */
                    /* JADX WARN: Code duplicated, block: B:32:0x01ce  */
                    /* JADX WARN: Code duplicated, block: B:39:0x020e  */
                    /* JADX WARN: Code duplicated, block: B:44:0x0243  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0280  */
                    /* JADX WARN: Code duplicated, block: B:67:0x02eb  */
                    /* JADX WARN: Code duplicated, block: B:8:0x005b  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.u
                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj9, Object obj10, Object obj11, Object obj12, p3.m mVar2, Integer num) {
                        Object obj13;
                        int i17 = i16;
                        p3.m.a aVar2 = p3.m.f135153a;
                        lc.v vVar2 = vVar;
                        switch (i17) {
                            case 0:
                                u21.u0 u0Var = (u21.u0) u1Var;
                                s21.a0 a0Var = (s21.a0) obj9;
                                Object obj14 = (e23.l) obj10;
                                e23.a aVar3 = (e23.a) obj11;
                                fe feVar = (fe) obj12;
                                int iIntValue = num.intValue();
                                a0Var.getClass();
                                obj14.getClass();
                                aVar3.getClass();
                                feVar.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                s21.s sVar = a0Var.f156041f;
                                boolean zR = mVar2.r(a0Var) | mVar2.k(sVar.ordinal());
                                Object objQ = mVar2.q();
                                if (zR) {
                                    objQ = new ao1.i(25, a0Var, sVar);
                                    mVar2.K(objQ);
                                } else {
                                    aVar2.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new ao1.i(25, a0Var, sVar);
                                        mVar2.K(objQ);
                                    }
                                }
                                e23.a aVar4 = (e23.a) objQ;
                                mVar2.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar2);
                                if (viewModelStoreOwnerA == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.o0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar2, 0), aVar4);
                                mVar2.R();
                                u21.o0 o0Var = (u21.o0) u1VarResolveViewModel;
                                p3.p1 p1VarC = s9.c.c(o0Var.f168063h, mVar2);
                                p3.p1 p1VarG = o53.f0.G(vVar2.a().b("caloriesGoalResult"), mVar2);
                                Integer num2 = (Integer) p1VarG.getF182175a();
                                boolean zB = mVar2.B(p1VarG) | mVar2.r(o0Var) | mVar2.r(vVar2);
                                Object objQ2 = mVar2.q();
                                if (zB) {
                                    objQ2 = new la(o0Var, vVar2, p1VarG, null);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new la(o0Var, vVar2, p1VarG, null);
                                        mVar2.K(objQ2);
                                    }
                                }
                                p3.l0.e((e23.p) objQ2, num2, mVar2);
                                p3.p1 p1VarG2 = o53.f0.G(vVar2.a().b("warningShownResult"), mVar2);
                                Boolean bool = (Boolean) p1VarG2.getF182175a();
                                boolean zB2 = mVar2.B(p1VarG2) | mVar2.r(o0Var);
                                Object objQ3 = mVar2.q();
                                if (zB2) {
                                    objQ3 = new ma(o0Var, p1VarG2, null);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new ma(o0Var, p1VarG2, null);
                                        mVar2.K(objQ3);
                                    }
                                }
                                p3.l0.e((e23.p) objQ3, bool, mVar2);
                                p3.p1 p1VarG3 = o53.f0.G(vVar2.a().b("macrosGoalsResult"), mVar2);
                                s21.h hVar = (s21.h) p1VarG3.getF182175a();
                                boolean zB3 = mVar2.B(p1VarG3) | mVar2.r(o0Var) | mVar2.r(vVar2);
                                Object objQ4 = mVar2.q();
                                if (zB3) {
                                    obj13 = null;
                                    objQ4 = new na(p1VarG3, o0Var, vVar2, null);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar2.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        obj13 = null;
                                        objQ4 = new na(p1VarG3, o0Var, vVar2, null);
                                        mVar2.K(objQ4);
                                    } else {
                                        obj13 = null;
                                    }
                                }
                                p3.l0.e((e23.p) objQ4, hVar, mVar2);
                                p3.p1 p1VarN = n23.j.n(vVar2, "micronutrientsSettingsResult", obj13, mVar2);
                                s21.o oVar = (s21.o) p1VarN.getF182175a();
                                boolean zB4 = mVar2.B(p1VarN) | mVar2.r(o0Var) | mVar2.r(vVar2);
                                Object objQ5 = mVar2.q();
                                if (zB4) {
                                    objQ5 = new oa(p1VarN, o0Var, vVar2, null);
                                    mVar2.K(objQ5);
                                } else {
                                    aVar2.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new oa(p1VarN, o0Var, vVar2, null);
                                        mVar2.K(objQ5);
                                    }
                                }
                                p3.l0.e((e23.p) objQ5, oVar, mVar2);
                                p3.p1 p1VarG4 = o53.f0.G(vVar2.a().b("activityLevelResult"), mVar2);
                                s21.b bVar = (s21.b) p1VarG4.getF182175a();
                                boolean zB5 = mVar2.B(p1VarG4) | mVar2.r(o0Var) | mVar2.r(vVar2);
                                Object objQ6 = mVar2.q();
                                if (zB5) {
                                    objQ6 = new pa(p1VarG4, o0Var, vVar2, null);
                                    mVar2.K(objQ6);
                                } else {
                                    aVar2.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new pa(p1VarG4, o0Var, vVar2, null);
                                        mVar2.K(objQ6);
                                    }
                                }
                                p3.l0.e((e23.p) objQ6, bVar, mVar2);
                                s21.v vVar3 = ((s21.x) p1VarC.getF182175a()).f156202k ? s21.v.DISABLED : s21.v.ENABLED;
                                String strQ = gl1.y.Q(mVar2, R.string.lbl_recommendations);
                                String strQ2 = gl1.y.Q(mVar2, R.string.lbl_next);
                                i53.h<s21.z> hVarA4 = u0Var.A4();
                                boolean z14 = ((s21.x) p1VarC.getF182175a()).f156202k;
                                boolean zR2 = mVar2.r(u0Var) | mVar2.B(p1VarC) | ((((iIntValue & 896) ^ 384) > 256 && mVar2.B(obj14)) || (iIntValue & 384) == 256);
                                Object objQ7 = mVar2.q();
                                if (zR2) {
                                    objQ7 = new ak0.m(u0Var, 12, obj14, p1VarC);
                                    mVar2.K(objQ7);
                                } else {
                                    aVar2.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new ak0.m(u0Var, 12, obj14, p1VarC);
                                        mVar2.K(objQ7);
                                    }
                                }
                                v21.e eVar2 = eVar;
                                lc.m0 m0Var2 = m0Var;
                                t21.d1.a(strQ, feVar, m0Var2, strQ2, z14, false, null, null, (e23.a) objQ7, vVar3, hVarA4, false, aVar3, fVar, z3.f.c(1871092961, new ak0.j(sVar, eVar2, o0Var, m0Var2, p1VarC, 5), mVar2), mVar2, (iIntValue >> 9) & 112, ((iIntValue >> 3) & 896) | 24576, 2272);
                                return Unit.INSTANCE;
                            default:
                                u21.u0 u0Var2 = (u21.u0) u1Var;
                                s21.a0 a0Var2 = (s21.a0) obj9;
                                fe feVar2 = (fe) obj12;
                                int iIntValue2 = num.intValue();
                                a0Var2.getClass();
                                ((e23.l) obj10).getClass();
                                ((e23.a) obj11).getClass();
                                feVar2.getClass();
                                p3.x1 x1Var3 = p3.n.f135158a;
                                l4.e0 e0Var = (l4.e0) lc.w.a(vVar2, p005kotlin.jvm.internal.s0.f105811a.b(l4.e0.class));
                                Unit unit = Unit.INSTANCE;
                                boolean zR3 = mVar2.r(u0Var2) | mVar2.r(e0Var);
                                Object objQ8 = mVar2.q();
                                if (zR3) {
                                    objQ8 = new w9(u0Var2, e0Var, null);
                                    mVar2.K(objQ8);
                                } else {
                                    aVar2.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new w9(u0Var2, e0Var, null);
                                        mVar2.K(objQ8);
                                    }
                                }
                                p3.l0.e((e23.p) objQ8, unit, mVar2);
                                String strQ3 = gl1.y.Q(mVar2, R.string.nutrition_plan);
                                j53.j jVarB = j53.l.b();
                                i53.h<s21.z> hVarA5 = u0Var2.A4();
                                s21.v vVar4 = s21.v.INVISIBLE;
                                boolean zR4 = mVar2.r(e0Var);
                                lc.m0 m0Var3 = m0Var;
                                boolean zR5 = zR4 | mVar2.r(m0Var3);
                                NutritionActivity.f fVar2 = fVar;
                                boolean zB6 = zR5 | mVar2.B(fVar2);
                                Object objQ9 = mVar2.q();
                                if (zB6) {
                                    objQ9 = new ak0.m(e0Var, 11, m0Var3, fVar2);
                                    mVar2.K(objQ9);
                                } else {
                                    aVar2.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new ak0.m(e0Var, 11, m0Var3, fVar2);
                                        mVar2.K(objQ9);
                                    }
                                }
                                t21.d1.a(strQ3, feVar2, m0Var3, null, false, false, jVarB, null, null, vVar4, hVarA5, true, fVar2, (e23.a) objQ9, z3.f.c(141047209, new w8(u0Var2, a0Var2, m0Var3, eVar, 0), mVar2), mVar2, ((iIntValue2 >> 9) & 112) | 809172992, 24624, 408);
                                return unit;
                        }
                    }
                }, mVar), mVar, 1572864 | ((iB >> 3) & 14));
                break;
            case 1:
                final NutritionActivity.f fVar2 = (NutritionActivity.f) aVar;
                final v21.e eVar2 = (v21.e) obj5;
                lc.v vVar2 = (lc.v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                int iB2 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar2);
                p3.x1 x1Var2 = p3.n.f135158a;
                final lc.m0 m0Var2 = this.f14546b;
                u9.a(vVar2, m0Var2, this.f14547c, (x01.b) obj8, (x01.c) obj7, (x01.b) obj6, z3.f.c(-1684683836, new e23.u() { // from class: b21.g9
                    /* JADX WARN: Code duplicated, block: B:112:0x038b  */
                    /* JADX WARN: Code duplicated, block: B:125:0x0438  */
                    /* JADX WARN: Code duplicated, block: B:142:0x0518  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
                    /* JADX WARN: Code duplicated, block: B:40:0x0135  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0179  */
                    /* JADX WARN: Code duplicated, block: B:60:0x01c4  */
                    /* JADX WARN: Code duplicated, block: B:71:0x0220  */
                    /* JADX WARN: Code duplicated, block: B:81:0x02ad  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0054  */
                    /* JADX WARN: Code duplicated, block: B:96:0x0331  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.u
                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj9, Object obj10, Object obj11, Object obj12, p3.m mVar3, Integer num) {
                        int i17;
                        int i18;
                        p3.p1 p1Var;
                        fe feVar;
                        u21.t tVar;
                        lc.m0 m0Var3;
                        p3.p1 p1Var2;
                        int i19 = i15;
                        final int i24 = 0;
                        p3.m.a aVar2 = p3.m.f135153a;
                        switch (i19) {
                            case 0:
                                u21.u0 u0Var = (u21.u0) u1Var;
                                e23.l lVar = (e23.l) obj10;
                                e23.a aVar3 = (e23.a) obj11;
                                fe feVar2 = (fe) obj12;
                                int iIntValue = num.intValue();
                                ((s21.a0) obj9).getClass();
                                lVar.getClass();
                                aVar3.getClass();
                                feVar2.getClass();
                                p3.x1 x1Var3 = p3.n.f135158a;
                                mVar3.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar3);
                                if (viewModelStoreOwnerA == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.n0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar3, 0), null);
                                mVar3.R();
                                p3.p1 p1VarC = s9.c.c(((u21.n0) u1VarResolveViewModel).f168046a, mVar3);
                                String strQ = gl1.y.Q(mVar3, R.string.personal_details);
                                String strQ2 = gl1.y.Q(mVar3, R.string.lbl_next);
                                s21.v vVar3 = s21.v.ENABLED;
                                i53.h<s21.z> hVarA4 = u0Var.A4();
                                boolean z14 = (((iIntValue & 896) ^ 384) > 256 && mVar3.B(lVar)) || (iIntValue & 384) == 256;
                                Object objQ = mVar3.q();
                                if (z14) {
                                    objQ = new a40.a(lVar, 10);
                                    mVar3.K(objQ);
                                } else {
                                    aVar2.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new a40.a(lVar, 10);
                                        mVar3.K(objQ);
                                    }
                                }
                                t21.d1.a(strQ, feVar2, m0Var2, strQ2, false, false, null, null, (e23.a) objQ, vVar3, hVarA4, false, aVar3, fVar2, z3.f.c(974861791, new aa2.f(6, eVar2, p1VarC), mVar3), mVar3, ((iIntValue >> 9) & 112) | C.ENCODING_PCM_32BIT, ((iIntValue >> 3) & 896) | 24576, 2288);
                                return Unit.INSTANCE;
                            case 1:
                                u21.u0 u0Var2 = (u21.u0) u1Var;
                                s21.a0 a0Var = (s21.a0) obj9;
                                e23.a aVar4 = (e23.a) obj11;
                                fe feVar3 = (fe) obj12;
                                int iIntValue2 = num.intValue();
                                a0Var.getClass();
                                ((e23.l) obj10).getClass();
                                aVar4.getClass();
                                feVar3.getClass();
                                p3.x1 x1Var4 = p3.n.f135158a;
                                String strQ3 = gl1.y.Q(mVar3, R.string.review_plan);
                                if (p005kotlin.jvm.internal.s.g(a0Var.f156037b, Boolean.TRUE)) {
                                    i17 = 242810688;
                                    i18 = R.string.common_confirm;
                                } else {
                                    i17 = 242903409;
                                    i18 = R.string.onboarding_device_setup_title;
                                }
                                String strH = sn.a.h(mVar3, i17, i18, mVar3);
                                i53.h<s21.z> hVarA5 = u0Var2.A4();
                                boolean z15 = a0Var.f156060y;
                                boolean zR = mVar3.r(u0Var2);
                                Object objQ2 = mVar3.q();
                                if (zR) {
                                    objQ2 = new u8(u0Var2, 3);
                                    mVar3.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new u8(u0Var2, 3);
                                        mVar3.K(objQ2);
                                    }
                                }
                                e23.a aVar5 = (e23.a) objQ2;
                                lc.m0 m0Var4 = m0Var2;
                                t21.d1.a(strQ3, feVar3, m0Var4, strH, z15, false, null, null, aVar5, null, hVarA5, false, aVar4, fVar2, z3.f.c(-1975758750, new w8(u0Var2, a0Var, m0Var4, eVar2, 1), mVar3), mVar3, ((iIntValue2 >> 9) & 112) | 196608, ((iIntValue2 >> 3) & 896) | 24576, 2752);
                                return Unit.INSTANCE;
                            case 2:
                                u21.u0 u0Var3 = (u21.u0) u1Var;
                                final s21.a0 a0Var2 = (s21.a0) obj9;
                                e23.l lVar2 = (e23.l) obj10;
                                e23.a aVar6 = (e23.a) obj11;
                                fe feVar4 = (fe) obj12;
                                int iIntValue3 = num.intValue();
                                a0Var2.getClass();
                                lVar2.getClass();
                                aVar6.getClass();
                                feVar4.getClass();
                                p3.x1 x1Var5 = p3.n.f135158a;
                                boolean zR2 = mVar3.r(a0Var2);
                                Object objQ3 = mVar3.q();
                                if (zR2) {
                                    final int i25 = 1;
                                    objQ3 = new e23.a() { // from class: b21.t8
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i25) {
                                                case 0:
                                                    s21.a0 a0Var3 = a0Var2;
                                                    Integer num2 = a0Var3.f156054s;
                                                    s21.s sVar = a0Var3.f156041f;
                                                    s21.e eVar3 = null;
                                                    if (num2 == null || sVar == s21.s.NO_GOAL) {
                                                        num2 = null;
                                                    }
                                                    s21.e eVar4 = a0Var3.f156055t;
                                                    if (eVar4 != null && sVar != s21.s.NO_GOAL) {
                                                        eVar3 = eVar4;
                                                    }
                                                    return ParametersHolderKt.parametersOf(num2, eVar3, Boolean.FALSE);
                                                default:
                                                    s21.a0 a0Var4 = a0Var2;
                                                    return ParametersHolderKt.parametersOf(new u21.j1(a0Var4.f156040e, a0Var4.f156041f, a0Var4.f156046k, a0Var4.f156047l));
                                            }
                                        }
                                    };
                                    mVar3.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        final int i26 = 1;
                                        objQ3 = new e23.a() { // from class: b21.t8
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i26) {
                                                    case 0:
                                                        s21.a0 a0Var3 = a0Var2;
                                                        Integer num2 = a0Var3.f156054s;
                                                        s21.s sVar = a0Var3.f156041f;
                                                        s21.e eVar3 = null;
                                                        if (num2 == null || sVar == s21.s.NO_GOAL) {
                                                            num2 = null;
                                                        }
                                                        s21.e eVar4 = a0Var3.f156055t;
                                                        if (eVar4 != null && sVar != s21.s.NO_GOAL) {
                                                            eVar3 = eVar4;
                                                        }
                                                        return ParametersHolderKt.parametersOf(num2, eVar3, Boolean.FALSE);
                                                    default:
                                                        s21.a0 a0Var4 = a0Var2;
                                                        return ParametersHolderKt.parametersOf(new u21.j1(a0Var4.f156040e, a0Var4.f156041f, a0Var4.f156046k, a0Var4.f156047l));
                                                }
                                            }
                                        };
                                        mVar3.K(objQ3);
                                    }
                                }
                                e23.a aVar7 = (e23.a) objQ3;
                                mVar3.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar3);
                                if (viewModelStoreOwnerA2 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.e1.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar3, 0), aVar7);
                                mVar3.R();
                                u21.e1 e1Var = (u21.e1) u1VarResolveViewModel2;
                                p3.p1 p1VarC2 = s9.c.c(e1Var.f167946e, mVar3);
                                Boolean boolValueOf = Boolean.valueOf(((s21.b0) p1VarC2.getF182175a()).f156078m);
                                boolean zB = mVar3.B(p1VarC2) | mVar3.r(u0Var3) | mVar3.r(e1Var) | ((((iIntValue3 & 896) ^ 384) > 256 && mVar3.B(lVar2)) || (iIntValue3 & 384) == 256);
                                Object objQ4 = mVar3.q();
                                if (zB) {
                                    Object kaVar = new ka(u0Var3, e1Var, lVar2, p1VarC2, null);
                                    mVar3.K(kaVar);
                                    objQ4 = kaVar;
                                } else {
                                    aVar2.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        Object kaVar2 = new ka(u0Var3, e1Var, lVar2, p1VarC2, null);
                                        mVar3.K(kaVar2);
                                        objQ4 = kaVar2;
                                    }
                                }
                                p3.l0.e((e23.p) objQ4, boolValueOf, mVar3);
                                s21.s sVar = e1Var.f167942a.f168020b;
                                s21.s sVar2 = s21.s.MAINTAIN_WEIGHT;
                                r53.p2 p2Var = e1Var.f167945d;
                                s21.v vVar4 = (sVar != sVar2 ? ((s21.b0) p2Var.getValue()).f156066a == null || ((s21.b0) p2Var.getValue()).f156067b == null : ((s21.b0) p2Var.getValue()).f156066a == null) ? s21.v.DISABLED : s21.v.ENABLED;
                                String strQ4 = gl1.y.Q(mVar3, R.string.lbl_weight);
                                i53.h<s21.z> hVarA6 = u0Var3.A4();
                                boolean zR3 = mVar3.r(e1Var);
                                Object objQ5 = mVar3.q();
                                if (zR3) {
                                    objQ5 = new s4(e1Var, 10);
                                    mVar3.K(objQ5);
                                } else {
                                    aVar2.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new s4(e1Var, 10);
                                        mVar3.K(objQ5);
                                    }
                                }
                                t21.d1.a(strQ4, feVar4, m0Var2, null, false, false, null, null, (e23.a) objQ5, vVar4, hVarA6, false, aVar6, fVar2, z3.f.c(1422977376, new a42.y(a0Var2, e1Var, eVar2, p1VarC2, 9), mVar3), mVar3, (iIntValue3 >> 9) & 112, ((iIntValue3 >> 3) & 896) | 24576, 2296);
                                return Unit.INSTANCE;
                            default:
                                u21.u0 u0Var4 = (u21.u0) u1Var;
                                final s21.a0 a0Var3 = (s21.a0) obj9;
                                e23.l lVar3 = (e23.l) obj10;
                                e23.a aVar8 = (e23.a) obj11;
                                fe feVar5 = (fe) obj12;
                                int iIntValue4 = num.intValue();
                                a0Var3.getClass();
                                lVar3.getClass();
                                aVar8.getClass();
                                feVar5.getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                Context context = (Context) mVar3.A(AndroidCompositionLocals_androidKt.f6042b);
                                boolean zR4 = mVar3.r(a0Var3);
                                Object objQ6 = mVar3.q();
                                if (zR4) {
                                    objQ6 = new e23.a() { // from class: b21.t8
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i24) {
                                                case 0:
                                                    s21.a0 a0Var4 = a0Var3;
                                                    Integer num2 = a0Var4.f156054s;
                                                    s21.s sVar3 = a0Var4.f156041f;
                                                    s21.e eVar3 = null;
                                                    if (num2 == null || sVar3 == s21.s.NO_GOAL) {
                                                        num2 = null;
                                                    }
                                                    s21.e eVar4 = a0Var4.f156055t;
                                                    if (eVar4 != null && sVar3 != s21.s.NO_GOAL) {
                                                        eVar3 = eVar4;
                                                    }
                                                    return ParametersHolderKt.parametersOf(num2, eVar3, Boolean.FALSE);
                                                default:
                                                    s21.a0 a0Var5 = a0Var3;
                                                    return ParametersHolderKt.parametersOf(new u21.j1(a0Var5.f156040e, a0Var5.f156041f, a0Var5.f156046k, a0Var5.f156047l));
                                            }
                                        }
                                    };
                                    mVar3.K(objQ6);
                                } else {
                                    aVar2.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new e23.a() { // from class: b21.t8
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i24) {
                                                    case 0:
                                                        s21.a0 a0Var4 = a0Var3;
                                                        Integer num2 = a0Var4.f156054s;
                                                        s21.s sVar3 = a0Var4.f156041f;
                                                        s21.e eVar3 = null;
                                                        if (num2 == null || sVar3 == s21.s.NO_GOAL) {
                                                            num2 = null;
                                                        }
                                                        s21.e eVar4 = a0Var4.f156055t;
                                                        if (eVar4 != null && sVar3 != s21.s.NO_GOAL) {
                                                            eVar3 = eVar4;
                                                        }
                                                        return ParametersHolderKt.parametersOf(num2, eVar3, Boolean.FALSE);
                                                    default:
                                                        s21.a0 a0Var5 = a0Var3;
                                                        return ParametersHolderKt.parametersOf(new u21.j1(a0Var5.f156040e, a0Var5.f156041f, a0Var5.f156046k, a0Var5.f156047l));
                                                }
                                            }
                                        };
                                        mVar3.K(objQ6);
                                    }
                                }
                                e23.a aVar9 = (e23.a) objQ6;
                                mVar3.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar3);
                                if (viewModelStoreOwnerA3 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.t.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar3, 0), aVar9);
                                mVar3.R();
                                u21.t tVar2 = (u21.t) u1VarResolveViewModel3;
                                p3.p1 p1VarC3 = s9.c.c(tVar2.f168141k, mVar3);
                                Integer num2 = ((u21.s) p1VarC3.getF182175a()).f168127p;
                                int i27 = (57344 & iIntValue4) ^ 24576;
                                boolean zB2 = mVar3.B(p1VarC3) | ((i27 > 16384 && mVar3.B(feVar5)) || (iIntValue4 & 24576) == 16384) | mVar3.r(context) | mVar3.r(tVar2);
                                Object objQ7 = mVar3.q();
                                if (zB2) {
                                    objQ7 = new ca(p1VarC3, feVar5, context, tVar2, null);
                                    p1Var = p1VarC3;
                                    feVar = feVar5;
                                    tVar = tVar2;
                                    mVar3.K(objQ7);
                                } else {
                                    aVar2.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new ca(p1VarC3, feVar5, context, tVar2, null);
                                        p1Var = p1VarC3;
                                        feVar = feVar5;
                                        tVar = tVar2;
                                        mVar3.K(objQ7);
                                    } else {
                                        p1Var = p1VarC3;
                                        tVar = tVar2;
                                        feVar = feVar5;
                                    }
                                }
                                p3.l0.e((e23.p) objQ7, num2, mVar3);
                                Boolean boolValueOf2 = Boolean.valueOf(((u21.s) p1Var.getF182175a()).f168126o);
                                boolean zB3 = ((i27 > 16384 && mVar3.B(feVar)) || (iIntValue4 & 24576) == 16384) | mVar3.B(p1Var) | mVar3.r(context) | mVar3.r(tVar);
                                lc.m0 m0Var5 = m0Var2;
                                boolean zR5 = zB3 | mVar3.r(m0Var5);
                                Object objQ8 = mVar3.q();
                                if (zR5) {
                                    objQ8 = new da(feVar, context, tVar, m0Var5, p1Var, null);
                                    m0Var3 = m0Var5;
                                    mVar3.K(objQ8);
                                } else {
                                    aVar2.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new da(feVar, context, tVar, m0Var5, p1Var, null);
                                        m0Var3 = m0Var5;
                                        mVar3.K(objQ8);
                                    } else {
                                        m0Var3 = m0Var5;
                                    }
                                }
                                p3.l0.e((e23.p) objQ8, boolValueOf2, mVar3);
                                Boolean boolValueOf3 = Boolean.valueOf(((u21.s) p1Var.getF182175a()).f168125n);
                                boolean zB4 = mVar3.B(p1Var) | mVar3.r(m0Var3) | mVar3.r(tVar);
                                Object objQ9 = mVar3.q();
                                if (zB4) {
                                    objQ9 = new ea(m0Var3, tVar, p1Var, null);
                                    mVar3.K(objQ9);
                                } else {
                                    aVar2.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new ea(m0Var3, tVar, p1Var, null);
                                        mVar3.K(objQ9);
                                    }
                                }
                                p3.l0.e((e23.p) objQ9, boolValueOf3, mVar3);
                                s21.d0 d0Var = ((u21.s) p1Var.getF182175a()).f168121j;
                                boolean zB5 = mVar3.B(p1Var) | mVar3.r(u0Var4) | ((((iIntValue4 & 896) ^ 384) > 256 && mVar3.B(lVar3)) || (iIntValue4 & 384) == 256) | mVar3.r(tVar);
                                Object objQ10 = mVar3.q();
                                if (zB5) {
                                    p1Var2 = p1Var;
                                    Object faVar = new fa(u0Var4, lVar3, tVar, p1Var2, null);
                                    mVar3.K(faVar);
                                    objQ10 = faVar;
                                } else {
                                    aVar2.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        p1Var2 = p1Var;
                                        Object faVar2 = new fa(u0Var4, lVar3, tVar, p1Var2, null);
                                        mVar3.K(faVar2);
                                        objQ10 = faVar2;
                                    } else {
                                        p1Var2 = p1Var;
                                    }
                                }
                                p3.l0.e((e23.p) objQ10, d0Var, mVar3);
                                c22.x0.f23314a.getClass();
                                String strW = gl1.d.W(c22.x0.f23479je);
                                String strQ5 = gl1.y.Q(mVar3, R.string.lbl_next);
                                s21.v vVar5 = (((u21.s) p1Var2.getF182175a()).f168112a || !((u21.s) p1Var2.getF182175a()).f168122k) ? s21.v.DISABLED : s21.v.ENABLED;
                                i53.h<s21.z> hVarA7 = u0Var4.A4();
                                boolean z16 = ((u21.s) p1Var2.getF182175a()).f168112a;
                                boolean zR6 = mVar3.r(tVar);
                                Object objQ11 = mVar3.q();
                                if (zR6) {
                                    objQ11 = new h(tVar, 4);
                                    mVar3.K(objQ11);
                                } else {
                                    aVar2.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new h(tVar, 4);
                                        mVar3.K(objQ11);
                                    }
                                }
                                lc.m0 m0Var6 = m0Var3;
                                t21.d1.a(strW, feVar, m0Var6, strQ5, z16, false, null, null, (e23.a) objQ11, vVar5, hVarA7, false, aVar8, fVar2, z3.f.c(1933509549, new a42.y(eVar2, tVar, m0Var6, p1Var2, 8), mVar3), mVar3, (iIntValue4 >> 9) & 112, ((iIntValue4 >> 3) & 896) | 24576, 2272);
                                return Unit.INSTANCE;
                        }
                    }
                }, mVar2), mVar2, 1572864 | ((iB2 >> 3) & 14));
                break;
            case 2:
                final NutritionActivity.f fVar3 = (NutritionActivity.f) aVar;
                final v21.e eVar3 = (v21.e) obj5;
                lc.v vVar3 = (lc.v) obj2;
                p3.m mVar3 = (p3.m) obj3;
                int iB3 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar3);
                p3.x1 x1Var3 = p3.n.f135158a;
                final int i17 = 0;
                final lc.m0 m0Var3 = this.f14546b;
                u9.a(vVar3, m0Var3, this.f14547c, (x01.b) obj8, (x01.c) obj7, (x01.b) obj6, z3.f.c(1550882536, new e23.u() { // from class: b21.g9
                    /* JADX WARN: Code duplicated, block: B:112:0x038b  */
                    /* JADX WARN: Code duplicated, block: B:125:0x0438  */
                    /* JADX WARN: Code duplicated, block: B:142:0x0518  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
                    /* JADX WARN: Code duplicated, block: B:40:0x0135  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0179  */
                    /* JADX WARN: Code duplicated, block: B:60:0x01c4  */
                    /* JADX WARN: Code duplicated, block: B:71:0x0220  */
                    /* JADX WARN: Code duplicated, block: B:81:0x02ad  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0054  */
                    /* JADX WARN: Code duplicated, block: B:96:0x0331  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.u
                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj9, Object obj10, Object obj11, Object obj12, p3.m mVar4, Integer num) {
                        int i18;
                        int i19;
                        p3.p1 p1Var;
                        fe feVar;
                        u21.t tVar;
                        lc.m0 m0Var4;
                        p3.p1 p1Var2;
                        int i110 = i17;
                        final int i24 = 0;
                        p3.m.a aVar2 = p3.m.f135153a;
                        switch (i110) {
                            case 0:
                                u21.u0 u0Var = (u21.u0) u1Var;
                                e23.l lVar = (e23.l) obj10;
                                e23.a aVar3 = (e23.a) obj11;
                                fe feVar2 = (fe) obj12;
                                int iIntValue = num.intValue();
                                ((s21.a0) obj9).getClass();
                                lVar.getClass();
                                aVar3.getClass();
                                feVar2.getClass();
                                p3.x1 x1Var4 = p3.n.f135158a;
                                mVar4.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar4);
                                if (viewModelStoreOwnerA == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.n0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar4, 0), null);
                                mVar4.R();
                                p3.p1 p1VarC = s9.c.c(((u21.n0) u1VarResolveViewModel).f168046a, mVar4);
                                String strQ = gl1.y.Q(mVar4, R.string.personal_details);
                                String strQ2 = gl1.y.Q(mVar4, R.string.lbl_next);
                                s21.v vVar4 = s21.v.ENABLED;
                                i53.h<s21.z> hVarA4 = u0Var.A4();
                                boolean z14 = (((iIntValue & 896) ^ 384) > 256 && mVar4.B(lVar)) || (iIntValue & 384) == 256;
                                Object objQ = mVar4.q();
                                if (z14) {
                                    objQ = new a40.a(lVar, 10);
                                    mVar4.K(objQ);
                                } else {
                                    aVar2.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new a40.a(lVar, 10);
                                        mVar4.K(objQ);
                                    }
                                }
                                t21.d1.a(strQ, feVar2, m0Var3, strQ2, false, false, null, null, (e23.a) objQ, vVar4, hVarA4, false, aVar3, fVar3, z3.f.c(974861791, new aa2.f(6, eVar3, p1VarC), mVar4), mVar4, ((iIntValue >> 9) & 112) | C.ENCODING_PCM_32BIT, ((iIntValue >> 3) & 896) | 24576, 2288);
                                return Unit.INSTANCE;
                            case 1:
                                u21.u0 u0Var2 = (u21.u0) u1Var;
                                s21.a0 a0Var = (s21.a0) obj9;
                                e23.a aVar4 = (e23.a) obj11;
                                fe feVar3 = (fe) obj12;
                                int iIntValue2 = num.intValue();
                                a0Var.getClass();
                                ((e23.l) obj10).getClass();
                                aVar4.getClass();
                                feVar3.getClass();
                                p3.x1 x1Var5 = p3.n.f135158a;
                                String strQ3 = gl1.y.Q(mVar4, R.string.review_plan);
                                if (p005kotlin.jvm.internal.s.g(a0Var.f156037b, Boolean.TRUE)) {
                                    i18 = 242810688;
                                    i19 = R.string.common_confirm;
                                } else {
                                    i18 = 242903409;
                                    i19 = R.string.onboarding_device_setup_title;
                                }
                                String strH = sn.a.h(mVar4, i18, i19, mVar4);
                                i53.h<s21.z> hVarA5 = u0Var2.A4();
                                boolean z15 = a0Var.f156060y;
                                boolean zR = mVar4.r(u0Var2);
                                Object objQ2 = mVar4.q();
                                if (zR) {
                                    objQ2 = new u8(u0Var2, 3);
                                    mVar4.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new u8(u0Var2, 3);
                                        mVar4.K(objQ2);
                                    }
                                }
                                e23.a aVar5 = (e23.a) objQ2;
                                lc.m0 m0Var5 = m0Var3;
                                t21.d1.a(strQ3, feVar3, m0Var5, strH, z15, false, null, null, aVar5, null, hVarA5, false, aVar4, fVar3, z3.f.c(-1975758750, new w8(u0Var2, a0Var, m0Var5, eVar3, 1), mVar4), mVar4, ((iIntValue2 >> 9) & 112) | 196608, ((iIntValue2 >> 3) & 896) | 24576, 2752);
                                return Unit.INSTANCE;
                            case 2:
                                u21.u0 u0Var3 = (u21.u0) u1Var;
                                final s21.a0 a0Var2 = (s21.a0) obj9;
                                e23.l lVar2 = (e23.l) obj10;
                                e23.a aVar6 = (e23.a) obj11;
                                fe feVar4 = (fe) obj12;
                                int iIntValue3 = num.intValue();
                                a0Var2.getClass();
                                lVar2.getClass();
                                aVar6.getClass();
                                feVar4.getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                boolean zR2 = mVar4.r(a0Var2);
                                Object objQ3 = mVar4.q();
                                if (zR2) {
                                    final int i26 = 1;
                                    objQ3 = new e23.a() { // from class: b21.t8
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i26) {
                                                case 0:
                                                    s21.a0 a0Var4 = a0Var2;
                                                    Integer num2 = a0Var4.f156054s;
                                                    s21.s sVar3 = a0Var4.f156041f;
                                                    s21.e eVar4 = null;
                                                    if (num2 == null || sVar3 == s21.s.NO_GOAL) {
                                                        num2 = null;
                                                    }
                                                    s21.e eVar5 = a0Var4.f156055t;
                                                    if (eVar5 != null && sVar3 != s21.s.NO_GOAL) {
                                                        eVar4 = eVar5;
                                                    }
                                                    return ParametersHolderKt.parametersOf(num2, eVar4, Boolean.FALSE);
                                                default:
                                                    s21.a0 a0Var5 = a0Var2;
                                                    return ParametersHolderKt.parametersOf(new u21.j1(a0Var5.f156040e, a0Var5.f156041f, a0Var5.f156046k, a0Var5.f156047l));
                                            }
                                        }
                                    };
                                    mVar4.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        final int i27 = 1;
                                        objQ3 = new e23.a() { // from class: b21.t8
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i27) {
                                                    case 0:
                                                        s21.a0 a0Var4 = a0Var2;
                                                        Integer num2 = a0Var4.f156054s;
                                                        s21.s sVar3 = a0Var4.f156041f;
                                                        s21.e eVar4 = null;
                                                        if (num2 == null || sVar3 == s21.s.NO_GOAL) {
                                                            num2 = null;
                                                        }
                                                        s21.e eVar5 = a0Var4.f156055t;
                                                        if (eVar5 != null && sVar3 != s21.s.NO_GOAL) {
                                                            eVar4 = eVar5;
                                                        }
                                                        return ParametersHolderKt.parametersOf(num2, eVar4, Boolean.FALSE);
                                                    default:
                                                        s21.a0 a0Var5 = a0Var2;
                                                        return ParametersHolderKt.parametersOf(new u21.j1(a0Var5.f156040e, a0Var5.f156041f, a0Var5.f156046k, a0Var5.f156047l));
                                                }
                                            }
                                        };
                                        mVar4.K(objQ3);
                                    }
                                }
                                e23.a aVar7 = (e23.a) objQ3;
                                mVar4.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar4);
                                if (viewModelStoreOwnerA2 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.e1.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar4, 0), aVar7);
                                mVar4.R();
                                u21.e1 e1Var = (u21.e1) u1VarResolveViewModel2;
                                p3.p1 p1VarC2 = s9.c.c(e1Var.f167946e, mVar4);
                                Boolean boolValueOf = Boolean.valueOf(((s21.b0) p1VarC2.getF182175a()).f156078m);
                                boolean zB = mVar4.B(p1VarC2) | mVar4.r(u0Var3) | mVar4.r(e1Var) | ((((iIntValue3 & 896) ^ 384) > 256 && mVar4.B(lVar2)) || (iIntValue3 & 384) == 256);
                                Object objQ4 = mVar4.q();
                                if (zB) {
                                    Object kaVar2 = new ka(u0Var3, e1Var, lVar2, p1VarC2, null);
                                    mVar4.K(kaVar2);
                                    objQ4 = kaVar2;
                                } else {
                                    aVar2.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        Object kaVar3 = new ka(u0Var3, e1Var, lVar2, p1VarC2, null);
                                        mVar4.K(kaVar3);
                                        objQ4 = kaVar3;
                                    }
                                }
                                p3.l0.e((e23.p) objQ4, boolValueOf, mVar4);
                                s21.s sVar = e1Var.f167942a.f168020b;
                                s21.s sVar2 = s21.s.MAINTAIN_WEIGHT;
                                r53.p2 p2Var = e1Var.f167945d;
                                s21.v vVar5 = (sVar != sVar2 ? ((s21.b0) p2Var.getValue()).f156066a == null || ((s21.b0) p2Var.getValue()).f156067b == null : ((s21.b0) p2Var.getValue()).f156066a == null) ? s21.v.DISABLED : s21.v.ENABLED;
                                String strQ4 = gl1.y.Q(mVar4, R.string.lbl_weight);
                                i53.h<s21.z> hVarA6 = u0Var3.A4();
                                boolean zR3 = mVar4.r(e1Var);
                                Object objQ5 = mVar4.q();
                                if (zR3) {
                                    objQ5 = new s4(e1Var, 10);
                                    mVar4.K(objQ5);
                                } else {
                                    aVar2.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new s4(e1Var, 10);
                                        mVar4.K(objQ5);
                                    }
                                }
                                t21.d1.a(strQ4, feVar4, m0Var3, null, false, false, null, null, (e23.a) objQ5, vVar5, hVarA6, false, aVar6, fVar3, z3.f.c(1422977376, new a42.y(a0Var2, e1Var, eVar3, p1VarC2, 9), mVar4), mVar4, (iIntValue3 >> 9) & 112, ((iIntValue3 >> 3) & 896) | 24576, 2296);
                                return Unit.INSTANCE;
                            default:
                                u21.u0 u0Var4 = (u21.u0) u1Var;
                                final s21.a0 a0Var3 = (s21.a0) obj9;
                                e23.l lVar3 = (e23.l) obj10;
                                e23.a aVar8 = (e23.a) obj11;
                                fe feVar5 = (fe) obj12;
                                int iIntValue4 = num.intValue();
                                a0Var3.getClass();
                                lVar3.getClass();
                                aVar8.getClass();
                                feVar5.getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                Context context = (Context) mVar4.A(AndroidCompositionLocals_androidKt.f6042b);
                                boolean zR4 = mVar4.r(a0Var3);
                                Object objQ6 = mVar4.q();
                                if (zR4) {
                                    objQ6 = new e23.a() { // from class: b21.t8
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i24) {
                                                case 0:
                                                    s21.a0 a0Var4 = a0Var3;
                                                    Integer num2 = a0Var4.f156054s;
                                                    s21.s sVar3 = a0Var4.f156041f;
                                                    s21.e eVar4 = null;
                                                    if (num2 == null || sVar3 == s21.s.NO_GOAL) {
                                                        num2 = null;
                                                    }
                                                    s21.e eVar5 = a0Var4.f156055t;
                                                    if (eVar5 != null && sVar3 != s21.s.NO_GOAL) {
                                                        eVar4 = eVar5;
                                                    }
                                                    return ParametersHolderKt.parametersOf(num2, eVar4, Boolean.FALSE);
                                                default:
                                                    s21.a0 a0Var5 = a0Var3;
                                                    return ParametersHolderKt.parametersOf(new u21.j1(a0Var5.f156040e, a0Var5.f156041f, a0Var5.f156046k, a0Var5.f156047l));
                                            }
                                        }
                                    };
                                    mVar4.K(objQ6);
                                } else {
                                    aVar2.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new e23.a() { // from class: b21.t8
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i24) {
                                                    case 0:
                                                        s21.a0 a0Var4 = a0Var3;
                                                        Integer num2 = a0Var4.f156054s;
                                                        s21.s sVar3 = a0Var4.f156041f;
                                                        s21.e eVar4 = null;
                                                        if (num2 == null || sVar3 == s21.s.NO_GOAL) {
                                                            num2 = null;
                                                        }
                                                        s21.e eVar5 = a0Var4.f156055t;
                                                        if (eVar5 != null && sVar3 != s21.s.NO_GOAL) {
                                                            eVar4 = eVar5;
                                                        }
                                                        return ParametersHolderKt.parametersOf(num2, eVar4, Boolean.FALSE);
                                                    default:
                                                        s21.a0 a0Var5 = a0Var3;
                                                        return ParametersHolderKt.parametersOf(new u21.j1(a0Var5.f156040e, a0Var5.f156041f, a0Var5.f156046k, a0Var5.f156047l));
                                                }
                                            }
                                        };
                                        mVar4.K(objQ6);
                                    }
                                }
                                e23.a aVar9 = (e23.a) objQ6;
                                mVar4.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar4);
                                if (viewModelStoreOwnerA3 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.t.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar4, 0), aVar9);
                                mVar4.R();
                                u21.t tVar2 = (u21.t) u1VarResolveViewModel3;
                                p3.p1 p1VarC3 = s9.c.c(tVar2.f168141k, mVar4);
                                Integer num2 = ((u21.s) p1VarC3.getF182175a()).f168127p;
                                int i28 = (57344 & iIntValue4) ^ 24576;
                                boolean zB2 = mVar4.B(p1VarC3) | ((i28 > 16384 && mVar4.B(feVar5)) || (iIntValue4 & 24576) == 16384) | mVar4.r(context) | mVar4.r(tVar2);
                                Object objQ7 = mVar4.q();
                                if (zB2) {
                                    objQ7 = new ca(p1VarC3, feVar5, context, tVar2, null);
                                    p1Var = p1VarC3;
                                    feVar = feVar5;
                                    tVar = tVar2;
                                    mVar4.K(objQ7);
                                } else {
                                    aVar2.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new ca(p1VarC3, feVar5, context, tVar2, null);
                                        p1Var = p1VarC3;
                                        feVar = feVar5;
                                        tVar = tVar2;
                                        mVar4.K(objQ7);
                                    } else {
                                        p1Var = p1VarC3;
                                        tVar = tVar2;
                                        feVar = feVar5;
                                    }
                                }
                                p3.l0.e((e23.p) objQ7, num2, mVar4);
                                Boolean boolValueOf2 = Boolean.valueOf(((u21.s) p1Var.getF182175a()).f168126o);
                                boolean zB3 = ((i28 > 16384 && mVar4.B(feVar)) || (iIntValue4 & 24576) == 16384) | mVar4.B(p1Var) | mVar4.r(context) | mVar4.r(tVar);
                                lc.m0 m0Var6 = m0Var3;
                                boolean zR5 = zB3 | mVar4.r(m0Var6);
                                Object objQ8 = mVar4.q();
                                if (zR5) {
                                    objQ8 = new da(feVar, context, tVar, m0Var6, p1Var, null);
                                    m0Var4 = m0Var6;
                                    mVar4.K(objQ8);
                                } else {
                                    aVar2.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new da(feVar, context, tVar, m0Var6, p1Var, null);
                                        m0Var4 = m0Var6;
                                        mVar4.K(objQ8);
                                    } else {
                                        m0Var4 = m0Var6;
                                    }
                                }
                                p3.l0.e((e23.p) objQ8, boolValueOf2, mVar4);
                                Boolean boolValueOf3 = Boolean.valueOf(((u21.s) p1Var.getF182175a()).f168125n);
                                boolean zB4 = mVar4.B(p1Var) | mVar4.r(m0Var4) | mVar4.r(tVar);
                                Object objQ9 = mVar4.q();
                                if (zB4) {
                                    objQ9 = new ea(m0Var4, tVar, p1Var, null);
                                    mVar4.K(objQ9);
                                } else {
                                    aVar2.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new ea(m0Var4, tVar, p1Var, null);
                                        mVar4.K(objQ9);
                                    }
                                }
                                p3.l0.e((e23.p) objQ9, boolValueOf3, mVar4);
                                s21.d0 d0Var = ((u21.s) p1Var.getF182175a()).f168121j;
                                boolean zB5 = mVar4.B(p1Var) | mVar4.r(u0Var4) | ((((iIntValue4 & 896) ^ 384) > 256 && mVar4.B(lVar3)) || (iIntValue4 & 384) == 256) | mVar4.r(tVar);
                                Object objQ10 = mVar4.q();
                                if (zB5) {
                                    p1Var2 = p1Var;
                                    Object faVar2 = new fa(u0Var4, lVar3, tVar, p1Var2, null);
                                    mVar4.K(faVar2);
                                    objQ10 = faVar2;
                                } else {
                                    aVar2.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        p1Var2 = p1Var;
                                        Object faVar3 = new fa(u0Var4, lVar3, tVar, p1Var2, null);
                                        mVar4.K(faVar3);
                                        objQ10 = faVar3;
                                    } else {
                                        p1Var2 = p1Var;
                                    }
                                }
                                p3.l0.e((e23.p) objQ10, d0Var, mVar4);
                                c22.x0.f23314a.getClass();
                                String strW = gl1.d.W(c22.x0.f23479je);
                                String strQ5 = gl1.y.Q(mVar4, R.string.lbl_next);
                                s21.v vVar6 = (((u21.s) p1Var2.getF182175a()).f168112a || !((u21.s) p1Var2.getF182175a()).f168122k) ? s21.v.DISABLED : s21.v.ENABLED;
                                i53.h<s21.z> hVarA7 = u0Var4.A4();
                                boolean z16 = ((u21.s) p1Var2.getF182175a()).f168112a;
                                boolean zR6 = mVar4.r(tVar);
                                Object objQ11 = mVar4.q();
                                if (zR6) {
                                    objQ11 = new h(tVar, 4);
                                    mVar4.K(objQ11);
                                } else {
                                    aVar2.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new h(tVar, 4);
                                        mVar4.K(objQ11);
                                    }
                                }
                                lc.m0 m0Var7 = m0Var4;
                                t21.d1.a(strW, feVar, m0Var7, strQ5, z16, false, null, null, (e23.a) objQ11, vVar6, hVarA7, false, aVar8, fVar3, z3.f.c(1933509549, new a42.y(eVar3, tVar, m0Var7, p1Var2, 8), mVar4), mVar4, (iIntValue4 >> 9) & 112, ((iIntValue4 >> 3) & 896) | 24576, 2272);
                                return Unit.INSTANCE;
                        }
                    }
                }, mVar3), mVar3, 1572864 | ((iB3 >> 3) & 14));
                break;
            case 3:
                final NutritionActivity.f fVar4 = (NutritionActivity.f) aVar;
                final v21.e eVar4 = (v21.e) obj5;
                lc.v vVar4 = (lc.v) obj2;
                p3.m mVar4 = (p3.m) obj3;
                int iB4 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar4);
                p3.x1 x1Var4 = p3.n.f135158a;
                final int i18 = 2;
                final lc.m0 m0Var4 = this.f14546b;
                u9.a(vVar4, m0Var4, this.f14547c, (x01.b) obj8, (x01.c) obj7, (x01.b) obj6, z3.f.c(1998998121, new e23.u() { // from class: b21.g9
                    /* JADX WARN: Code duplicated, block: B:112:0x038b  */
                    /* JADX WARN: Code duplicated, block: B:125:0x0438  */
                    /* JADX WARN: Code duplicated, block: B:142:0x0518  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
                    /* JADX WARN: Code duplicated, block: B:40:0x0135  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0179  */
                    /* JADX WARN: Code duplicated, block: B:60:0x01c4  */
                    /* JADX WARN: Code duplicated, block: B:71:0x0220  */
                    /* JADX WARN: Code duplicated, block: B:81:0x02ad  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0054  */
                    /* JADX WARN: Code duplicated, block: B:96:0x0331  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.u
                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj9, Object obj10, Object obj11, Object obj12, p3.m mVar5, Integer num) {
                        int i19;
                        int i110;
                        p3.p1 p1Var;
                        fe feVar;
                        u21.t tVar;
                        lc.m0 m0Var5;
                        p3.p1 p1Var2;
                        int i111 = i18;
                        final int i24 = 0;
                        p3.m.a aVar2 = p3.m.f135153a;
                        switch (i111) {
                            case 0:
                                u21.u0 u0Var = (u21.u0) u1Var;
                                e23.l lVar = (e23.l) obj10;
                                e23.a aVar3 = (e23.a) obj11;
                                fe feVar2 = (fe) obj12;
                                int iIntValue = num.intValue();
                                ((s21.a0) obj9).getClass();
                                lVar.getClass();
                                aVar3.getClass();
                                feVar2.getClass();
                                p3.x1 x1Var5 = p3.n.f135158a;
                                mVar5.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar5);
                                if (viewModelStoreOwnerA == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.n0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar5, 0), null);
                                mVar5.R();
                                p3.p1 p1VarC = s9.c.c(((u21.n0) u1VarResolveViewModel).f168046a, mVar5);
                                String strQ = gl1.y.Q(mVar5, R.string.personal_details);
                                String strQ2 = gl1.y.Q(mVar5, R.string.lbl_next);
                                s21.v vVar5 = s21.v.ENABLED;
                                i53.h<s21.z> hVarA4 = u0Var.A4();
                                boolean z14 = (((iIntValue & 896) ^ 384) > 256 && mVar5.B(lVar)) || (iIntValue & 384) == 256;
                                Object objQ = mVar5.q();
                                if (z14) {
                                    objQ = new a40.a(lVar, 10);
                                    mVar5.K(objQ);
                                } else {
                                    aVar2.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new a40.a(lVar, 10);
                                        mVar5.K(objQ);
                                    }
                                }
                                t21.d1.a(strQ, feVar2, m0Var4, strQ2, false, false, null, null, (e23.a) objQ, vVar5, hVarA4, false, aVar3, fVar4, z3.f.c(974861791, new aa2.f(6, eVar4, p1VarC), mVar5), mVar5, ((iIntValue >> 9) & 112) | C.ENCODING_PCM_32BIT, ((iIntValue >> 3) & 896) | 24576, 2288);
                                return Unit.INSTANCE;
                            case 1:
                                u21.u0 u0Var2 = (u21.u0) u1Var;
                                s21.a0 a0Var = (s21.a0) obj9;
                                e23.a aVar4 = (e23.a) obj11;
                                fe feVar3 = (fe) obj12;
                                int iIntValue2 = num.intValue();
                                a0Var.getClass();
                                ((e23.l) obj10).getClass();
                                aVar4.getClass();
                                feVar3.getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                String strQ3 = gl1.y.Q(mVar5, R.string.review_plan);
                                if (p005kotlin.jvm.internal.s.g(a0Var.f156037b, Boolean.TRUE)) {
                                    i19 = 242810688;
                                    i110 = R.string.common_confirm;
                                } else {
                                    i19 = 242903409;
                                    i110 = R.string.onboarding_device_setup_title;
                                }
                                String strH = sn.a.h(mVar5, i19, i110, mVar5);
                                i53.h<s21.z> hVarA5 = u0Var2.A4();
                                boolean z15 = a0Var.f156060y;
                                boolean zR = mVar5.r(u0Var2);
                                Object objQ2 = mVar5.q();
                                if (zR) {
                                    objQ2 = new u8(u0Var2, 3);
                                    mVar5.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new u8(u0Var2, 3);
                                        mVar5.K(objQ2);
                                    }
                                }
                                e23.a aVar5 = (e23.a) objQ2;
                                lc.m0 m0Var6 = m0Var4;
                                t21.d1.a(strQ3, feVar3, m0Var6, strH, z15, false, null, null, aVar5, null, hVarA5, false, aVar4, fVar4, z3.f.c(-1975758750, new w8(u0Var2, a0Var, m0Var6, eVar4, 1), mVar5), mVar5, ((iIntValue2 >> 9) & 112) | 196608, ((iIntValue2 >> 3) & 896) | 24576, 2752);
                                return Unit.INSTANCE;
                            case 2:
                                u21.u0 u0Var3 = (u21.u0) u1Var;
                                final s21.a0 a0Var2 = (s21.a0) obj9;
                                e23.l lVar2 = (e23.l) obj10;
                                e23.a aVar6 = (e23.a) obj11;
                                fe feVar4 = (fe) obj12;
                                int iIntValue3 = num.intValue();
                                a0Var2.getClass();
                                lVar2.getClass();
                                aVar6.getClass();
                                feVar4.getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                boolean zR2 = mVar5.r(a0Var2);
                                Object objQ3 = mVar5.q();
                                if (zR2) {
                                    final int i27 = 1;
                                    objQ3 = new e23.a() { // from class: b21.t8
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i27) {
                                                case 0:
                                                    s21.a0 a0Var4 = a0Var2;
                                                    Integer num2 = a0Var4.f156054s;
                                                    s21.s sVar3 = a0Var4.f156041f;
                                                    s21.e eVar5 = null;
                                                    if (num2 == null || sVar3 == s21.s.NO_GOAL) {
                                                        num2 = null;
                                                    }
                                                    s21.e eVar6 = a0Var4.f156055t;
                                                    if (eVar6 != null && sVar3 != s21.s.NO_GOAL) {
                                                        eVar5 = eVar6;
                                                    }
                                                    return ParametersHolderKt.parametersOf(num2, eVar5, Boolean.FALSE);
                                                default:
                                                    s21.a0 a0Var5 = a0Var2;
                                                    return ParametersHolderKt.parametersOf(new u21.j1(a0Var5.f156040e, a0Var5.f156041f, a0Var5.f156046k, a0Var5.f156047l));
                                            }
                                        }
                                    };
                                    mVar5.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        final int i28 = 1;
                                        objQ3 = new e23.a() { // from class: b21.t8
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i28) {
                                                    case 0:
                                                        s21.a0 a0Var4 = a0Var2;
                                                        Integer num2 = a0Var4.f156054s;
                                                        s21.s sVar3 = a0Var4.f156041f;
                                                        s21.e eVar5 = null;
                                                        if (num2 == null || sVar3 == s21.s.NO_GOAL) {
                                                            num2 = null;
                                                        }
                                                        s21.e eVar6 = a0Var4.f156055t;
                                                        if (eVar6 != null && sVar3 != s21.s.NO_GOAL) {
                                                            eVar5 = eVar6;
                                                        }
                                                        return ParametersHolderKt.parametersOf(num2, eVar5, Boolean.FALSE);
                                                    default:
                                                        s21.a0 a0Var5 = a0Var2;
                                                        return ParametersHolderKt.parametersOf(new u21.j1(a0Var5.f156040e, a0Var5.f156041f, a0Var5.f156046k, a0Var5.f156047l));
                                                }
                                            }
                                        };
                                        mVar5.K(objQ3);
                                    }
                                }
                                e23.a aVar7 = (e23.a) objQ3;
                                mVar5.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar5);
                                if (viewModelStoreOwnerA2 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.e1.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar5, 0), aVar7);
                                mVar5.R();
                                u21.e1 e1Var = (u21.e1) u1VarResolveViewModel2;
                                p3.p1 p1VarC2 = s9.c.c(e1Var.f167946e, mVar5);
                                Boolean boolValueOf = Boolean.valueOf(((s21.b0) p1VarC2.getF182175a()).f156078m);
                                boolean zB = mVar5.B(p1VarC2) | mVar5.r(u0Var3) | mVar5.r(e1Var) | ((((iIntValue3 & 896) ^ 384) > 256 && mVar5.B(lVar2)) || (iIntValue3 & 384) == 256);
                                Object objQ4 = mVar5.q();
                                if (zB) {
                                    Object kaVar3 = new ka(u0Var3, e1Var, lVar2, p1VarC2, null);
                                    mVar5.K(kaVar3);
                                    objQ4 = kaVar3;
                                } else {
                                    aVar2.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        Object kaVar4 = new ka(u0Var3, e1Var, lVar2, p1VarC2, null);
                                        mVar5.K(kaVar4);
                                        objQ4 = kaVar4;
                                    }
                                }
                                p3.l0.e((e23.p) objQ4, boolValueOf, mVar5);
                                s21.s sVar = e1Var.f167942a.f168020b;
                                s21.s sVar2 = s21.s.MAINTAIN_WEIGHT;
                                r53.p2 p2Var = e1Var.f167945d;
                                s21.v vVar6 = (sVar != sVar2 ? ((s21.b0) p2Var.getValue()).f156066a == null || ((s21.b0) p2Var.getValue()).f156067b == null : ((s21.b0) p2Var.getValue()).f156066a == null) ? s21.v.DISABLED : s21.v.ENABLED;
                                String strQ4 = gl1.y.Q(mVar5, R.string.lbl_weight);
                                i53.h<s21.z> hVarA6 = u0Var3.A4();
                                boolean zR3 = mVar5.r(e1Var);
                                Object objQ5 = mVar5.q();
                                if (zR3) {
                                    objQ5 = new s4(e1Var, 10);
                                    mVar5.K(objQ5);
                                } else {
                                    aVar2.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new s4(e1Var, 10);
                                        mVar5.K(objQ5);
                                    }
                                }
                                t21.d1.a(strQ4, feVar4, m0Var4, null, false, false, null, null, (e23.a) objQ5, vVar6, hVarA6, false, aVar6, fVar4, z3.f.c(1422977376, new a42.y(a0Var2, e1Var, eVar4, p1VarC2, 9), mVar5), mVar5, (iIntValue3 >> 9) & 112, ((iIntValue3 >> 3) & 896) | 24576, 2296);
                                return Unit.INSTANCE;
                            default:
                                u21.u0 u0Var4 = (u21.u0) u1Var;
                                final s21.a0 a0Var3 = (s21.a0) obj9;
                                e23.l lVar3 = (e23.l) obj10;
                                e23.a aVar8 = (e23.a) obj11;
                                fe feVar5 = (fe) obj12;
                                int iIntValue4 = num.intValue();
                                a0Var3.getClass();
                                lVar3.getClass();
                                aVar8.getClass();
                                feVar5.getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                Context context = (Context) mVar5.A(AndroidCompositionLocals_androidKt.f6042b);
                                boolean zR4 = mVar5.r(a0Var3);
                                Object objQ6 = mVar5.q();
                                if (zR4) {
                                    objQ6 = new e23.a() { // from class: b21.t8
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i24) {
                                                case 0:
                                                    s21.a0 a0Var4 = a0Var3;
                                                    Integer num2 = a0Var4.f156054s;
                                                    s21.s sVar3 = a0Var4.f156041f;
                                                    s21.e eVar5 = null;
                                                    if (num2 == null || sVar3 == s21.s.NO_GOAL) {
                                                        num2 = null;
                                                    }
                                                    s21.e eVar6 = a0Var4.f156055t;
                                                    if (eVar6 != null && sVar3 != s21.s.NO_GOAL) {
                                                        eVar5 = eVar6;
                                                    }
                                                    return ParametersHolderKt.parametersOf(num2, eVar5, Boolean.FALSE);
                                                default:
                                                    s21.a0 a0Var5 = a0Var3;
                                                    return ParametersHolderKt.parametersOf(new u21.j1(a0Var5.f156040e, a0Var5.f156041f, a0Var5.f156046k, a0Var5.f156047l));
                                            }
                                        }
                                    };
                                    mVar5.K(objQ6);
                                } else {
                                    aVar2.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new e23.a() { // from class: b21.t8
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i24) {
                                                    case 0:
                                                        s21.a0 a0Var4 = a0Var3;
                                                        Integer num2 = a0Var4.f156054s;
                                                        s21.s sVar3 = a0Var4.f156041f;
                                                        s21.e eVar5 = null;
                                                        if (num2 == null || sVar3 == s21.s.NO_GOAL) {
                                                            num2 = null;
                                                        }
                                                        s21.e eVar6 = a0Var4.f156055t;
                                                        if (eVar6 != null && sVar3 != s21.s.NO_GOAL) {
                                                            eVar5 = eVar6;
                                                        }
                                                        return ParametersHolderKt.parametersOf(num2, eVar5, Boolean.FALSE);
                                                    default:
                                                        s21.a0 a0Var5 = a0Var3;
                                                        return ParametersHolderKt.parametersOf(new u21.j1(a0Var5.f156040e, a0Var5.f156041f, a0Var5.f156046k, a0Var5.f156047l));
                                                }
                                            }
                                        };
                                        mVar5.K(objQ6);
                                    }
                                }
                                e23.a aVar9 = (e23.a) objQ6;
                                mVar5.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar5);
                                if (viewModelStoreOwnerA3 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.t.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar5, 0), aVar9);
                                mVar5.R();
                                u21.t tVar2 = (u21.t) u1VarResolveViewModel3;
                                p3.p1 p1VarC3 = s9.c.c(tVar2.f168141k, mVar5);
                                Integer num2 = ((u21.s) p1VarC3.getF182175a()).f168127p;
                                int i29 = (57344 & iIntValue4) ^ 24576;
                                boolean zB2 = mVar5.B(p1VarC3) | ((i29 > 16384 && mVar5.B(feVar5)) || (iIntValue4 & 24576) == 16384) | mVar5.r(context) | mVar5.r(tVar2);
                                Object objQ7 = mVar5.q();
                                if (zB2) {
                                    objQ7 = new ca(p1VarC3, feVar5, context, tVar2, null);
                                    p1Var = p1VarC3;
                                    feVar = feVar5;
                                    tVar = tVar2;
                                    mVar5.K(objQ7);
                                } else {
                                    aVar2.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new ca(p1VarC3, feVar5, context, tVar2, null);
                                        p1Var = p1VarC3;
                                        feVar = feVar5;
                                        tVar = tVar2;
                                        mVar5.K(objQ7);
                                    } else {
                                        p1Var = p1VarC3;
                                        tVar = tVar2;
                                        feVar = feVar5;
                                    }
                                }
                                p3.l0.e((e23.p) objQ7, num2, mVar5);
                                Boolean boolValueOf2 = Boolean.valueOf(((u21.s) p1Var.getF182175a()).f168126o);
                                boolean zB3 = ((i29 > 16384 && mVar5.B(feVar)) || (iIntValue4 & 24576) == 16384) | mVar5.B(p1Var) | mVar5.r(context) | mVar5.r(tVar);
                                lc.m0 m0Var7 = m0Var4;
                                boolean zR5 = zB3 | mVar5.r(m0Var7);
                                Object objQ8 = mVar5.q();
                                if (zR5) {
                                    objQ8 = new da(feVar, context, tVar, m0Var7, p1Var, null);
                                    m0Var5 = m0Var7;
                                    mVar5.K(objQ8);
                                } else {
                                    aVar2.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new da(feVar, context, tVar, m0Var7, p1Var, null);
                                        m0Var5 = m0Var7;
                                        mVar5.K(objQ8);
                                    } else {
                                        m0Var5 = m0Var7;
                                    }
                                }
                                p3.l0.e((e23.p) objQ8, boolValueOf2, mVar5);
                                Boolean boolValueOf3 = Boolean.valueOf(((u21.s) p1Var.getF182175a()).f168125n);
                                boolean zB4 = mVar5.B(p1Var) | mVar5.r(m0Var5) | mVar5.r(tVar);
                                Object objQ9 = mVar5.q();
                                if (zB4) {
                                    objQ9 = new ea(m0Var5, tVar, p1Var, null);
                                    mVar5.K(objQ9);
                                } else {
                                    aVar2.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new ea(m0Var5, tVar, p1Var, null);
                                        mVar5.K(objQ9);
                                    }
                                }
                                p3.l0.e((e23.p) objQ9, boolValueOf3, mVar5);
                                s21.d0 d0Var = ((u21.s) p1Var.getF182175a()).f168121j;
                                boolean zB5 = mVar5.B(p1Var) | mVar5.r(u0Var4) | ((((iIntValue4 & 896) ^ 384) > 256 && mVar5.B(lVar3)) || (iIntValue4 & 384) == 256) | mVar5.r(tVar);
                                Object objQ10 = mVar5.q();
                                if (zB5) {
                                    p1Var2 = p1Var;
                                    Object faVar3 = new fa(u0Var4, lVar3, tVar, p1Var2, null);
                                    mVar5.K(faVar3);
                                    objQ10 = faVar3;
                                } else {
                                    aVar2.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        p1Var2 = p1Var;
                                        Object faVar4 = new fa(u0Var4, lVar3, tVar, p1Var2, null);
                                        mVar5.K(faVar4);
                                        objQ10 = faVar4;
                                    } else {
                                        p1Var2 = p1Var;
                                    }
                                }
                                p3.l0.e((e23.p) objQ10, d0Var, mVar5);
                                c22.x0.f23314a.getClass();
                                String strW = gl1.d.W(c22.x0.f23479je);
                                String strQ5 = gl1.y.Q(mVar5, R.string.lbl_next);
                                s21.v vVar7 = (((u21.s) p1Var2.getF182175a()).f168112a || !((u21.s) p1Var2.getF182175a()).f168122k) ? s21.v.DISABLED : s21.v.ENABLED;
                                i53.h<s21.z> hVarA7 = u0Var4.A4();
                                boolean z16 = ((u21.s) p1Var2.getF182175a()).f168112a;
                                boolean zR6 = mVar5.r(tVar);
                                Object objQ11 = mVar5.q();
                                if (zR6) {
                                    objQ11 = new h(tVar, 4);
                                    mVar5.K(objQ11);
                                } else {
                                    aVar2.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new h(tVar, 4);
                                        mVar5.K(objQ11);
                                    }
                                }
                                lc.m0 m0Var8 = m0Var5;
                                t21.d1.a(strW, feVar, m0Var8, strQ5, z16, false, null, null, (e23.a) objQ11, vVar7, hVarA7, false, aVar8, fVar4, z3.f.c(1933509549, new a42.y(eVar4, tVar, m0Var8, p1Var2, 8), mVar5), mVar5, (iIntValue4 >> 9) & 112, ((iIntValue4 >> 3) & 896) | 24576, 2272);
                                return Unit.INSTANCE;
                        }
                    }
                }, mVar4), mVar4, 1572864 | ((iB4 >> 3) & 14));
                break;
            case 4:
                final NutritionActivity.f fVar5 = (NutritionActivity.f) aVar;
                final v21.e eVar5 = (v21.e) obj5;
                final lc.v vVar5 = (lc.v) obj2;
                p3.m mVar5 = (p3.m) obj3;
                int iB5 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar5);
                p3.x1 x1Var5 = p3.n.f135158a;
                final int i19 = 0;
                final lc.m0 m0Var5 = this.f14546b;
                u9.a(vVar5, m0Var5, this.f14547c, (x01.b) obj8, (x01.c) obj7, (x01.b) obj6, z3.f.c(-1847853590, new e23.u() { // from class: b21.j9
                    /* JADX WARN: Code duplicated, block: B:13:0x009a  */
                    /* JADX WARN: Code duplicated, block: B:20:0x011e  */
                    /* JADX WARN: Code duplicated, block: B:27:0x0196  */
                    /* JADX WARN: Code duplicated, block: B:32:0x01ce  */
                    /* JADX WARN: Code duplicated, block: B:39:0x020e  */
                    /* JADX WARN: Code duplicated, block: B:44:0x0243  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0280  */
                    /* JADX WARN: Code duplicated, block: B:67:0x02eb  */
                    /* JADX WARN: Code duplicated, block: B:8:0x005b  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.u
                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj9, Object obj10, Object obj11, Object obj12, p3.m mVar6, Integer num) {
                        Object obj13;
                        int i110 = i19;
                        p3.m.a aVar2 = p3.m.f135153a;
                        lc.v vVar6 = vVar5;
                        switch (i110) {
                            case 0:
                                u21.u0 u0Var = (u21.u0) u1Var;
                                s21.a0 a0Var = (s21.a0) obj9;
                                Object obj14 = (e23.l) obj10;
                                e23.a aVar3 = (e23.a) obj11;
                                fe feVar = (fe) obj12;
                                int iIntValue = num.intValue();
                                a0Var.getClass();
                                obj14.getClass();
                                aVar3.getClass();
                                feVar.getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                s21.s sVar = a0Var.f156041f;
                                boolean zR = mVar6.r(a0Var) | mVar6.k(sVar.ordinal());
                                Object objQ = mVar6.q();
                                if (zR) {
                                    objQ = new ao1.i(25, a0Var, sVar);
                                    mVar6.K(objQ);
                                } else {
                                    aVar2.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new ao1.i(25, a0Var, sVar);
                                        mVar6.K(objQ);
                                    }
                                }
                                e23.a aVar4 = (e23.a) objQ;
                                mVar6.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar6);
                                if (viewModelStoreOwnerA == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.o0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar6, 0), aVar4);
                                mVar6.R();
                                u21.o0 o0Var = (u21.o0) u1VarResolveViewModel;
                                p3.p1 p1VarC = s9.c.c(o0Var.f168063h, mVar6);
                                p3.p1 p1VarG = o53.f0.G(vVar6.a().b("caloriesGoalResult"), mVar6);
                                Integer num2 = (Integer) p1VarG.getF182175a();
                                boolean zB = mVar6.B(p1VarG) | mVar6.r(o0Var) | mVar6.r(vVar6);
                                Object objQ2 = mVar6.q();
                                if (zB) {
                                    objQ2 = new la(o0Var, vVar6, p1VarG, null);
                                    mVar6.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new la(o0Var, vVar6, p1VarG, null);
                                        mVar6.K(objQ2);
                                    }
                                }
                                p3.l0.e((e23.p) objQ2, num2, mVar6);
                                p3.p1 p1VarG2 = o53.f0.G(vVar6.a().b("warningShownResult"), mVar6);
                                Boolean bool = (Boolean) p1VarG2.getF182175a();
                                boolean zB2 = mVar6.B(p1VarG2) | mVar6.r(o0Var);
                                Object objQ3 = mVar6.q();
                                if (zB2) {
                                    objQ3 = new ma(o0Var, p1VarG2, null);
                                    mVar6.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new ma(o0Var, p1VarG2, null);
                                        mVar6.K(objQ3);
                                    }
                                }
                                p3.l0.e((e23.p) objQ3, bool, mVar6);
                                p3.p1 p1VarG3 = o53.f0.G(vVar6.a().b("macrosGoalsResult"), mVar6);
                                s21.h hVar = (s21.h) p1VarG3.getF182175a();
                                boolean zB3 = mVar6.B(p1VarG3) | mVar6.r(o0Var) | mVar6.r(vVar6);
                                Object objQ4 = mVar6.q();
                                if (zB3) {
                                    obj13 = null;
                                    objQ4 = new na(p1VarG3, o0Var, vVar6, null);
                                    mVar6.K(objQ4);
                                } else {
                                    aVar2.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        obj13 = null;
                                        objQ4 = new na(p1VarG3, o0Var, vVar6, null);
                                        mVar6.K(objQ4);
                                    } else {
                                        obj13 = null;
                                    }
                                }
                                p3.l0.e((e23.p) objQ4, hVar, mVar6);
                                p3.p1 p1VarN = n23.j.n(vVar6, "micronutrientsSettingsResult", obj13, mVar6);
                                s21.o oVar = (s21.o) p1VarN.getF182175a();
                                boolean zB4 = mVar6.B(p1VarN) | mVar6.r(o0Var) | mVar6.r(vVar6);
                                Object objQ5 = mVar6.q();
                                if (zB4) {
                                    objQ5 = new oa(p1VarN, o0Var, vVar6, null);
                                    mVar6.K(objQ5);
                                } else {
                                    aVar2.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new oa(p1VarN, o0Var, vVar6, null);
                                        mVar6.K(objQ5);
                                    }
                                }
                                p3.l0.e((e23.p) objQ5, oVar, mVar6);
                                p3.p1 p1VarG4 = o53.f0.G(vVar6.a().b("activityLevelResult"), mVar6);
                                s21.b bVar = (s21.b) p1VarG4.getF182175a();
                                boolean zB5 = mVar6.B(p1VarG4) | mVar6.r(o0Var) | mVar6.r(vVar6);
                                Object objQ6 = mVar6.q();
                                if (zB5) {
                                    objQ6 = new pa(p1VarG4, o0Var, vVar6, null);
                                    mVar6.K(objQ6);
                                } else {
                                    aVar2.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new pa(p1VarG4, o0Var, vVar6, null);
                                        mVar6.K(objQ6);
                                    }
                                }
                                p3.l0.e((e23.p) objQ6, bVar, mVar6);
                                s21.v vVar7 = ((s21.x) p1VarC.getF182175a()).f156202k ? s21.v.DISABLED : s21.v.ENABLED;
                                String strQ = gl1.y.Q(mVar6, R.string.lbl_recommendations);
                                String strQ2 = gl1.y.Q(mVar6, R.string.lbl_next);
                                i53.h<s21.z> hVarA4 = u0Var.A4();
                                boolean z14 = ((s21.x) p1VarC.getF182175a()).f156202k;
                                boolean zR2 = mVar6.r(u0Var) | mVar6.B(p1VarC) | ((((iIntValue & 896) ^ 384) > 256 && mVar6.B(obj14)) || (iIntValue & 384) == 256);
                                Object objQ7 = mVar6.q();
                                if (zR2) {
                                    objQ7 = new ak0.m(u0Var, 12, obj14, p1VarC);
                                    mVar6.K(objQ7);
                                } else {
                                    aVar2.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new ak0.m(u0Var, 12, obj14, p1VarC);
                                        mVar6.K(objQ7);
                                    }
                                }
                                v21.e eVar6 = eVar5;
                                lc.m0 m0Var6 = m0Var5;
                                t21.d1.a(strQ, feVar, m0Var6, strQ2, z14, false, null, null, (e23.a) objQ7, vVar7, hVarA4, false, aVar3, fVar5, z3.f.c(1871092961, new ak0.j(sVar, eVar6, o0Var, m0Var6, p1VarC, 5), mVar6), mVar6, (iIntValue >> 9) & 112, ((iIntValue >> 3) & 896) | 24576, 2272);
                                return Unit.INSTANCE;
                            default:
                                u21.u0 u0Var2 = (u21.u0) u1Var;
                                s21.a0 a0Var2 = (s21.a0) obj9;
                                fe feVar2 = (fe) obj12;
                                int iIntValue2 = num.intValue();
                                a0Var2.getClass();
                                ((e23.l) obj10).getClass();
                                ((e23.a) obj11).getClass();
                                feVar2.getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                l4.e0 e0Var = (l4.e0) lc.w.a(vVar6, p005kotlin.jvm.internal.s0.f105811a.b(l4.e0.class));
                                Unit unit = Unit.INSTANCE;
                                boolean zR3 = mVar6.r(u0Var2) | mVar6.r(e0Var);
                                Object objQ8 = mVar6.q();
                                if (zR3) {
                                    objQ8 = new w9(u0Var2, e0Var, null);
                                    mVar6.K(objQ8);
                                } else {
                                    aVar2.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new w9(u0Var2, e0Var, null);
                                        mVar6.K(objQ8);
                                    }
                                }
                                p3.l0.e((e23.p) objQ8, unit, mVar6);
                                String strQ3 = gl1.y.Q(mVar6, R.string.nutrition_plan);
                                j53.j jVarB = j53.l.b();
                                i53.h<s21.z> hVarA5 = u0Var2.A4();
                                s21.v vVar8 = s21.v.INVISIBLE;
                                boolean zR4 = mVar6.r(e0Var);
                                lc.m0 m0Var7 = m0Var5;
                                boolean zR5 = zR4 | mVar6.r(m0Var7);
                                NutritionActivity.f fVar6 = fVar5;
                                boolean zB6 = zR5 | mVar6.B(fVar6);
                                Object objQ9 = mVar6.q();
                                if (zB6) {
                                    objQ9 = new ak0.m(e0Var, 11, m0Var7, fVar6);
                                    mVar6.K(objQ9);
                                } else {
                                    aVar2.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new ak0.m(e0Var, 11, m0Var7, fVar6);
                                        mVar6.K(objQ9);
                                    }
                                }
                                t21.d1.a(strQ3, feVar2, m0Var7, null, false, false, jVarB, null, null, vVar8, hVarA5, true, fVar6, (e23.a) objQ9, z3.f.c(141047209, new w8(u0Var2, a0Var2, m0Var7, eVar5, 0), mVar6), mVar6, ((iIntValue2 >> 9) & 112) | 809172992, 24624, 408);
                                return unit;
                        }
                    }
                }, mVar5), mVar5, 1572864 | ((iB5 >> 3) & 14));
                break;
            case 5:
                final NutritionActivity.f fVar6 = (NutritionActivity.f) aVar;
                final v21.e eVar6 = (v21.e) obj5;
                lc.v vVar6 = (lc.v) obj2;
                p3.m mVar6 = (p3.m) obj3;
                int iB6 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar6);
                p3.x1 x1Var6 = p3.n.f135158a;
                final int i24 = 1;
                final lc.m0 m0Var6 = this.f14546b;
                u9.a(vVar6, m0Var6, this.f14547c, (x01.b) obj8, (x01.c) obj7, (x01.b) obj6, z3.f.c(-1399738005, new e23.u() { // from class: b21.g9
                    /* JADX WARN: Code duplicated, block: B:112:0x038b  */
                    /* JADX WARN: Code duplicated, block: B:125:0x0438  */
                    /* JADX WARN: Code duplicated, block: B:142:0x0518  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
                    /* JADX WARN: Code duplicated, block: B:40:0x0135  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0179  */
                    /* JADX WARN: Code duplicated, block: B:60:0x01c4  */
                    /* JADX WARN: Code duplicated, block: B:71:0x0220  */
                    /* JADX WARN: Code duplicated, block: B:81:0x02ad  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0054  */
                    /* JADX WARN: Code duplicated, block: B:96:0x0331  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.u
                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj9, Object obj10, Object obj11, Object obj12, p3.m mVar7, Integer num) {
                        int i110;
                        int i111;
                        p3.p1 p1Var;
                        fe feVar;
                        u21.t tVar;
                        lc.m0 m0Var7;
                        p3.p1 p1Var2;
                        int i112 = i24;
                        final int i25 = 0;
                        p3.m.a aVar2 = p3.m.f135153a;
                        switch (i112) {
                            case 0:
                                u21.u0 u0Var = (u21.u0) u1Var;
                                e23.l lVar = (e23.l) obj10;
                                e23.a aVar3 = (e23.a) obj11;
                                fe feVar2 = (fe) obj12;
                                int iIntValue = num.intValue();
                                ((s21.a0) obj9).getClass();
                                lVar.getClass();
                                aVar3.getClass();
                                feVar2.getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                mVar7.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar7);
                                if (viewModelStoreOwnerA == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.n0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar7, 0), null);
                                mVar7.R();
                                p3.p1 p1VarC = s9.c.c(((u21.n0) u1VarResolveViewModel).f168046a, mVar7);
                                String strQ = gl1.y.Q(mVar7, R.string.personal_details);
                                String strQ2 = gl1.y.Q(mVar7, R.string.lbl_next);
                                s21.v vVar7 = s21.v.ENABLED;
                                i53.h<s21.z> hVarA4 = u0Var.A4();
                                boolean z14 = (((iIntValue & 896) ^ 384) > 256 && mVar7.B(lVar)) || (iIntValue & 384) == 256;
                                Object objQ = mVar7.q();
                                if (z14) {
                                    objQ = new a40.a(lVar, 10);
                                    mVar7.K(objQ);
                                } else {
                                    aVar2.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new a40.a(lVar, 10);
                                        mVar7.K(objQ);
                                    }
                                }
                                t21.d1.a(strQ, feVar2, m0Var6, strQ2, false, false, null, null, (e23.a) objQ, vVar7, hVarA4, false, aVar3, fVar6, z3.f.c(974861791, new aa2.f(6, eVar6, p1VarC), mVar7), mVar7, ((iIntValue >> 9) & 112) | C.ENCODING_PCM_32BIT, ((iIntValue >> 3) & 896) | 24576, 2288);
                                return Unit.INSTANCE;
                            case 1:
                                u21.u0 u0Var2 = (u21.u0) u1Var;
                                s21.a0 a0Var = (s21.a0) obj9;
                                e23.a aVar4 = (e23.a) obj11;
                                fe feVar3 = (fe) obj12;
                                int iIntValue2 = num.intValue();
                                a0Var.getClass();
                                ((e23.l) obj10).getClass();
                                aVar4.getClass();
                                feVar3.getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                String strQ3 = gl1.y.Q(mVar7, R.string.review_plan);
                                if (p005kotlin.jvm.internal.s.g(a0Var.f156037b, Boolean.TRUE)) {
                                    i110 = 242810688;
                                    i111 = R.string.common_confirm;
                                } else {
                                    i110 = 242903409;
                                    i111 = R.string.onboarding_device_setup_title;
                                }
                                String strH = sn.a.h(mVar7, i110, i111, mVar7);
                                i53.h<s21.z> hVarA5 = u0Var2.A4();
                                boolean z15 = a0Var.f156060y;
                                boolean zR = mVar7.r(u0Var2);
                                Object objQ2 = mVar7.q();
                                if (zR) {
                                    objQ2 = new u8(u0Var2, 3);
                                    mVar7.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new u8(u0Var2, 3);
                                        mVar7.K(objQ2);
                                    }
                                }
                                e23.a aVar5 = (e23.a) objQ2;
                                lc.m0 m0Var8 = m0Var6;
                                t21.d1.a(strQ3, feVar3, m0Var8, strH, z15, false, null, null, aVar5, null, hVarA5, false, aVar4, fVar6, z3.f.c(-1975758750, new w8(u0Var2, a0Var, m0Var8, eVar6, 1), mVar7), mVar7, ((iIntValue2 >> 9) & 112) | 196608, ((iIntValue2 >> 3) & 896) | 24576, 2752);
                                return Unit.INSTANCE;
                            case 2:
                                u21.u0 u0Var3 = (u21.u0) u1Var;
                                final s21.a0 a0Var2 = (s21.a0) obj9;
                                e23.l lVar2 = (e23.l) obj10;
                                e23.a aVar6 = (e23.a) obj11;
                                fe feVar4 = (fe) obj12;
                                int iIntValue3 = num.intValue();
                                a0Var2.getClass();
                                lVar2.getClass();
                                aVar6.getClass();
                                feVar4.getClass();
                                p3.x1 x1Var9 = p3.n.f135158a;
                                boolean zR2 = mVar7.r(a0Var2);
                                Object objQ3 = mVar7.q();
                                if (zR2) {
                                    final int i28 = 1;
                                    objQ3 = new e23.a() { // from class: b21.t8
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i28) {
                                                case 0:
                                                    s21.a0 a0Var4 = a0Var2;
                                                    Integer num2 = a0Var4.f156054s;
                                                    s21.s sVar3 = a0Var4.f156041f;
                                                    s21.e eVar7 = null;
                                                    if (num2 == null || sVar3 == s21.s.NO_GOAL) {
                                                        num2 = null;
                                                    }
                                                    s21.e eVar8 = a0Var4.f156055t;
                                                    if (eVar8 != null && sVar3 != s21.s.NO_GOAL) {
                                                        eVar7 = eVar8;
                                                    }
                                                    return ParametersHolderKt.parametersOf(num2, eVar7, Boolean.FALSE);
                                                default:
                                                    s21.a0 a0Var5 = a0Var2;
                                                    return ParametersHolderKt.parametersOf(new u21.j1(a0Var5.f156040e, a0Var5.f156041f, a0Var5.f156046k, a0Var5.f156047l));
                                            }
                                        }
                                    };
                                    mVar7.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        final int i29 = 1;
                                        objQ3 = new e23.a() { // from class: b21.t8
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i29) {
                                                    case 0:
                                                        s21.a0 a0Var4 = a0Var2;
                                                        Integer num2 = a0Var4.f156054s;
                                                        s21.s sVar3 = a0Var4.f156041f;
                                                        s21.e eVar7 = null;
                                                        if (num2 == null || sVar3 == s21.s.NO_GOAL) {
                                                            num2 = null;
                                                        }
                                                        s21.e eVar8 = a0Var4.f156055t;
                                                        if (eVar8 != null && sVar3 != s21.s.NO_GOAL) {
                                                            eVar7 = eVar8;
                                                        }
                                                        return ParametersHolderKt.parametersOf(num2, eVar7, Boolean.FALSE);
                                                    default:
                                                        s21.a0 a0Var5 = a0Var2;
                                                        return ParametersHolderKt.parametersOf(new u21.j1(a0Var5.f156040e, a0Var5.f156041f, a0Var5.f156046k, a0Var5.f156047l));
                                                }
                                            }
                                        };
                                        mVar7.K(objQ3);
                                    }
                                }
                                e23.a aVar7 = (e23.a) objQ3;
                                mVar7.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar7);
                                if (viewModelStoreOwnerA2 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.e1.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar7, 0), aVar7);
                                mVar7.R();
                                u21.e1 e1Var = (u21.e1) u1VarResolveViewModel2;
                                p3.p1 p1VarC2 = s9.c.c(e1Var.f167946e, mVar7);
                                Boolean boolValueOf = Boolean.valueOf(((s21.b0) p1VarC2.getF182175a()).f156078m);
                                boolean zB = mVar7.B(p1VarC2) | mVar7.r(u0Var3) | mVar7.r(e1Var) | ((((iIntValue3 & 896) ^ 384) > 256 && mVar7.B(lVar2)) || (iIntValue3 & 384) == 256);
                                Object objQ4 = mVar7.q();
                                if (zB) {
                                    Object kaVar4 = new ka(u0Var3, e1Var, lVar2, p1VarC2, null);
                                    mVar7.K(kaVar4);
                                    objQ4 = kaVar4;
                                } else {
                                    aVar2.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        Object kaVar5 = new ka(u0Var3, e1Var, lVar2, p1VarC2, null);
                                        mVar7.K(kaVar5);
                                        objQ4 = kaVar5;
                                    }
                                }
                                p3.l0.e((e23.p) objQ4, boolValueOf, mVar7);
                                s21.s sVar = e1Var.f167942a.f168020b;
                                s21.s sVar2 = s21.s.MAINTAIN_WEIGHT;
                                r53.p2 p2Var = e1Var.f167945d;
                                s21.v vVar8 = (sVar != sVar2 ? ((s21.b0) p2Var.getValue()).f156066a == null || ((s21.b0) p2Var.getValue()).f156067b == null : ((s21.b0) p2Var.getValue()).f156066a == null) ? s21.v.DISABLED : s21.v.ENABLED;
                                String strQ4 = gl1.y.Q(mVar7, R.string.lbl_weight);
                                i53.h<s21.z> hVarA6 = u0Var3.A4();
                                boolean zR3 = mVar7.r(e1Var);
                                Object objQ5 = mVar7.q();
                                if (zR3) {
                                    objQ5 = new s4(e1Var, 10);
                                    mVar7.K(objQ5);
                                } else {
                                    aVar2.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new s4(e1Var, 10);
                                        mVar7.K(objQ5);
                                    }
                                }
                                t21.d1.a(strQ4, feVar4, m0Var6, null, false, false, null, null, (e23.a) objQ5, vVar8, hVarA6, false, aVar6, fVar6, z3.f.c(1422977376, new a42.y(a0Var2, e1Var, eVar6, p1VarC2, 9), mVar7), mVar7, (iIntValue3 >> 9) & 112, ((iIntValue3 >> 3) & 896) | 24576, 2296);
                                return Unit.INSTANCE;
                            default:
                                u21.u0 u0Var4 = (u21.u0) u1Var;
                                final s21.a0 a0Var3 = (s21.a0) obj9;
                                e23.l lVar3 = (e23.l) obj10;
                                e23.a aVar8 = (e23.a) obj11;
                                fe feVar5 = (fe) obj12;
                                int iIntValue4 = num.intValue();
                                a0Var3.getClass();
                                lVar3.getClass();
                                aVar8.getClass();
                                feVar5.getClass();
                                p3.x1 x1Var10 = p3.n.f135158a;
                                Context context = (Context) mVar7.A(AndroidCompositionLocals_androidKt.f6042b);
                                boolean zR4 = mVar7.r(a0Var3);
                                Object objQ6 = mVar7.q();
                                if (zR4) {
                                    objQ6 = new e23.a() { // from class: b21.t8
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i25) {
                                                case 0:
                                                    s21.a0 a0Var4 = a0Var3;
                                                    Integer num2 = a0Var4.f156054s;
                                                    s21.s sVar3 = a0Var4.f156041f;
                                                    s21.e eVar7 = null;
                                                    if (num2 == null || sVar3 == s21.s.NO_GOAL) {
                                                        num2 = null;
                                                    }
                                                    s21.e eVar8 = a0Var4.f156055t;
                                                    if (eVar8 != null && sVar3 != s21.s.NO_GOAL) {
                                                        eVar7 = eVar8;
                                                    }
                                                    return ParametersHolderKt.parametersOf(num2, eVar7, Boolean.FALSE);
                                                default:
                                                    s21.a0 a0Var5 = a0Var3;
                                                    return ParametersHolderKt.parametersOf(new u21.j1(a0Var5.f156040e, a0Var5.f156041f, a0Var5.f156046k, a0Var5.f156047l));
                                            }
                                        }
                                    };
                                    mVar7.K(objQ6);
                                } else {
                                    aVar2.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new e23.a() { // from class: b21.t8
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i25) {
                                                    case 0:
                                                        s21.a0 a0Var4 = a0Var3;
                                                        Integer num2 = a0Var4.f156054s;
                                                        s21.s sVar3 = a0Var4.f156041f;
                                                        s21.e eVar7 = null;
                                                        if (num2 == null || sVar3 == s21.s.NO_GOAL) {
                                                            num2 = null;
                                                        }
                                                        s21.e eVar8 = a0Var4.f156055t;
                                                        if (eVar8 != null && sVar3 != s21.s.NO_GOAL) {
                                                            eVar7 = eVar8;
                                                        }
                                                        return ParametersHolderKt.parametersOf(num2, eVar7, Boolean.FALSE);
                                                    default:
                                                        s21.a0 a0Var5 = a0Var3;
                                                        return ParametersHolderKt.parametersOf(new u21.j1(a0Var5.f156040e, a0Var5.f156041f, a0Var5.f156046k, a0Var5.f156047l));
                                                }
                                            }
                                        };
                                        mVar7.K(objQ6);
                                    }
                                }
                                e23.a aVar9 = (e23.a) objQ6;
                                mVar7.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar7);
                                if (viewModelStoreOwnerA3 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.t.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar7, 0), aVar9);
                                mVar7.R();
                                u21.t tVar2 = (u21.t) u1VarResolveViewModel3;
                                p3.p1 p1VarC3 = s9.c.c(tVar2.f168141k, mVar7);
                                Integer num2 = ((u21.s) p1VarC3.getF182175a()).f168127p;
                                int i210 = (57344 & iIntValue4) ^ 24576;
                                boolean zB2 = mVar7.B(p1VarC3) | ((i210 > 16384 && mVar7.B(feVar5)) || (iIntValue4 & 24576) == 16384) | mVar7.r(context) | mVar7.r(tVar2);
                                Object objQ7 = mVar7.q();
                                if (zB2) {
                                    objQ7 = new ca(p1VarC3, feVar5, context, tVar2, null);
                                    p1Var = p1VarC3;
                                    feVar = feVar5;
                                    tVar = tVar2;
                                    mVar7.K(objQ7);
                                } else {
                                    aVar2.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new ca(p1VarC3, feVar5, context, tVar2, null);
                                        p1Var = p1VarC3;
                                        feVar = feVar5;
                                        tVar = tVar2;
                                        mVar7.K(objQ7);
                                    } else {
                                        p1Var = p1VarC3;
                                        tVar = tVar2;
                                        feVar = feVar5;
                                    }
                                }
                                p3.l0.e((e23.p) objQ7, num2, mVar7);
                                Boolean boolValueOf2 = Boolean.valueOf(((u21.s) p1Var.getF182175a()).f168126o);
                                boolean zB3 = ((i210 > 16384 && mVar7.B(feVar)) || (iIntValue4 & 24576) == 16384) | mVar7.B(p1Var) | mVar7.r(context) | mVar7.r(tVar);
                                lc.m0 m0Var9 = m0Var6;
                                boolean zR5 = zB3 | mVar7.r(m0Var9);
                                Object objQ8 = mVar7.q();
                                if (zR5) {
                                    objQ8 = new da(feVar, context, tVar, m0Var9, p1Var, null);
                                    m0Var7 = m0Var9;
                                    mVar7.K(objQ8);
                                } else {
                                    aVar2.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new da(feVar, context, tVar, m0Var9, p1Var, null);
                                        m0Var7 = m0Var9;
                                        mVar7.K(objQ8);
                                    } else {
                                        m0Var7 = m0Var9;
                                    }
                                }
                                p3.l0.e((e23.p) objQ8, boolValueOf2, mVar7);
                                Boolean boolValueOf3 = Boolean.valueOf(((u21.s) p1Var.getF182175a()).f168125n);
                                boolean zB4 = mVar7.B(p1Var) | mVar7.r(m0Var7) | mVar7.r(tVar);
                                Object objQ9 = mVar7.q();
                                if (zB4) {
                                    objQ9 = new ea(m0Var7, tVar, p1Var, null);
                                    mVar7.K(objQ9);
                                } else {
                                    aVar2.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new ea(m0Var7, tVar, p1Var, null);
                                        mVar7.K(objQ9);
                                    }
                                }
                                p3.l0.e((e23.p) objQ9, boolValueOf3, mVar7);
                                s21.d0 d0Var = ((u21.s) p1Var.getF182175a()).f168121j;
                                boolean zB5 = mVar7.B(p1Var) | mVar7.r(u0Var4) | ((((iIntValue4 & 896) ^ 384) > 256 && mVar7.B(lVar3)) || (iIntValue4 & 384) == 256) | mVar7.r(tVar);
                                Object objQ10 = mVar7.q();
                                if (zB5) {
                                    p1Var2 = p1Var;
                                    Object faVar4 = new fa(u0Var4, lVar3, tVar, p1Var2, null);
                                    mVar7.K(faVar4);
                                    objQ10 = faVar4;
                                } else {
                                    aVar2.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        p1Var2 = p1Var;
                                        Object faVar5 = new fa(u0Var4, lVar3, tVar, p1Var2, null);
                                        mVar7.K(faVar5);
                                        objQ10 = faVar5;
                                    } else {
                                        p1Var2 = p1Var;
                                    }
                                }
                                p3.l0.e((e23.p) objQ10, d0Var, mVar7);
                                c22.x0.f23314a.getClass();
                                String strW = gl1.d.W(c22.x0.f23479je);
                                String strQ5 = gl1.y.Q(mVar7, R.string.lbl_next);
                                s21.v vVar9 = (((u21.s) p1Var2.getF182175a()).f168112a || !((u21.s) p1Var2.getF182175a()).f168122k) ? s21.v.DISABLED : s21.v.ENABLED;
                                i53.h<s21.z> hVarA7 = u0Var4.A4();
                                boolean z16 = ((u21.s) p1Var2.getF182175a()).f168112a;
                                boolean zR6 = mVar7.r(tVar);
                                Object objQ11 = mVar7.q();
                                if (zR6) {
                                    objQ11 = new h(tVar, 4);
                                    mVar7.K(objQ11);
                                } else {
                                    aVar2.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new h(tVar, 4);
                                        mVar7.K(objQ11);
                                    }
                                }
                                lc.m0 m0Var10 = m0Var7;
                                t21.d1.a(strW, feVar, m0Var10, strQ5, z16, false, null, null, (e23.a) objQ11, vVar9, hVarA7, false, aVar8, fVar6, z3.f.c(1933509549, new a42.y(eVar6, tVar, m0Var10, p1Var2, 8), mVar7), mVar7, (iIntValue4 >> 9) & 112, ((iIntValue4 >> 3) & 896) | 24576, 2272);
                                return Unit.INSTANCE;
                        }
                    }
                }, mVar6), mVar6, 1572864 | ((iB6 >> 3) & 14));
                break;
            default:
                NutritionActivity.g gVar = (NutritionActivity.g) obj5;
                lc.v vVar7 = (lc.v) obj2;
                p3.m mVar7 = (p3.m) obj3;
                int iB7 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar7);
                p3.x1 x1Var7 = p3.n.f135158a;
                lc.m0 m0Var7 = this.f14546b;
                d1.a(vVar7, m0Var7, z3.f.c(-1002134168, new s0(vVar7, (r53.o2) obj8, m0Var7, (b63.o) obj7, (o82.g) obj6, this.f14547c, (x01.a) aVar, gVar), mVar7), mVar7, ((iB7 >> 3) & 14) | 384);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b9(lc.m0 m0Var, boolean z14, x01.b bVar, x01.c cVar, x01.b bVar2, NutritionActivity.f fVar, v21.e eVar, int i14) {
        this.f14545a = i14;
        this.f14546b = m0Var;
        this.f14547c = z14;
        this.f14548d = bVar;
        this.f14549e = cVar;
        this.f14550f = bVar2;
        this.f14551g = fVar;
        this.f14552h = eVar;
    }
}
