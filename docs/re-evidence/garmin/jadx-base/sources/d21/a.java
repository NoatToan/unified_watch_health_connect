package d21;

import com.garmin.android.apps.connectmobile.nutrition.presentation.reminders.screen.NutritionRemindersActivity;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NutritionRemindersActivity f57286b;

    public /* synthetic */ a(NutritionRemindersActivity nutritionRemindersActivity, int i14) {
        this.f57285a = i14;
        this.f57286b = nutritionRemindersActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f57285a;
        NutritionRemindersActivity nutritionRemindersActivity = this.f57286b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i17 = NutritionRemindersActivity.f39632a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(1341206053, new a(nutritionRemindersActivity, i16), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i18 = NutritionRemindersActivity.f39632a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    v.a(g02.d.f74342a.c(nutritionRemindersActivity.getOnBackPressedDispatcher()), z3.f.c(1560965861, new a(nutritionRemindersActivity, i15), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i19 = NutritionRemindersActivity.f39632a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    boolean zR = mVar3.r(nutritionRemindersActivity);
                    Object objQ = mVar3.q();
                    if (zR) {
                        objQ = new cq0.g(nutritionRemindersActivity, 7);
                        mVar3.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new cq0.g(nutritionRemindersActivity, 7);
                            mVar3.K(objQ);
                        }
                    }
                    i.a(null, (e23.a) objQ, mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
