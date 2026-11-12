package b21;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import i3.fe;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e9 implements e23.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14649b;

    public /* synthetic */ e9(Object obj, int i14) {
        this.f14648a = i14;
        this.f14649b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:8:0x0041  */
    @Override // e23.u
    public final Object m(androidx.lifecycle.u1 u1Var, Object obj, Object obj2, Object obj3, Object obj4, p3.m mVar, Integer num) {
        int i14 = this.f14648a;
        boolean z14 = true;
        p3.m.a aVar = p3.m.f135153a;
        Object obj5 = this.f14649b;
        switch (i14) {
            case 0:
                NutritionActivity.f fVar = (NutritionActivity.f) obj5;
                e23.l lVar = (e23.l) obj2;
                int iIntValue = num.intValue();
                ((s21.a0) obj).getClass();
                lVar.getClass();
                ((e23.a) obj3).getClass();
                ((fe) obj4).getClass();
                p3.x1 x1Var = p3.n.f135158a;
                if ((((iIntValue & 896) ^ 384) <= 256 || !mVar.B(lVar)) && (iIntValue & 384) != 256) {
                    z14 = false;
                }
                Object objQ = mVar.q();
                if (z14) {
                    objQ = new a40.a(lVar, 9);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a40.a(lVar, 9);
                        mVar.K(objQ);
                    }
                }
                t21.f1.a((e23.a) objQ, fVar, mVar, 0);
                break;
            case 1:
                NutritionActivity.f fVar2 = (NutritionActivity.f) obj5;
                e23.l lVar2 = (e23.l) obj2;
                fe feVar = (fe) obj4;
                int iIntValue2 = num.intValue();
                ((s21.a0) obj).getClass();
                lVar2.getClass();
                ((e23.a) obj3).getClass();
                feVar.getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                String strQ = gl1.y.Q(mVar, R.string.nutrition);
                if ((((iIntValue2 & 896) ^ 384) <= 256 || !mVar.B(lVar2)) && (iIntValue2 & 384) != 256) {
                    z14 = false;
                }
                Object objQ2 = mVar.q();
                if (z14) {
                    objQ2 = new a40.a(lVar2, 11);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a40.a(lVar2, 11);
                        mVar.K(objQ2);
                    }
                }
                t21.t0.a(strQ, feVar, (e23.a) objQ2, fVar2, mVar, (iIntValue2 >> 9) & 112);
                break;
            default:
                lc.m0 m0Var = (lc.m0) obj5;
                s21.a0 a0Var = (s21.a0) obj;
                a0Var.getClass();
                ((e23.l) obj2).getClass();
                ((e23.a) obj3).getClass();
                ((fe) obj4).getClass();
                p3.x1 x1Var3 = p3.n.f135158a;
                l4 l4Var = a0Var.f156036a;
                boolean zR = mVar.r(a0Var) | mVar.r(m0Var);
                Object objQ3 = mVar.q();
                if (zR) {
                    objQ3 = new v9(a0Var, m0Var, null);
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new v9(a0Var, m0Var, null);
                        mVar.K(objQ3);
                    }
                }
                p3.l0.e((e23.p) objQ3, l4Var, mVar);
                boolean z15 = a0Var.f156060y;
                a.f14484a.getClass();
                g02.s0.a(null, z15, a.f14485b, mVar, 384, 1);
                break;
        }
        return Unit.INSTANCE;
    }
}
