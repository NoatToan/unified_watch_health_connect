package px1;

import com.garmin.android.apps.connectmobile.training.stp.presentation.activity.SetupStrengthTrainingPlanActivity;
import e23.p;
import ov1.u;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p3.m;
import p3.n;
import p3.x1;
import w2.a0;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f141776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SetupStrengthTrainingPlanActivity f141777c;

    public /* synthetic */ a(r0 r0Var, SetupStrengthTrainingPlanActivity setupStrengthTrainingPlanActivity, int i14) {
        this.f141775a = i14;
        this.f141776b = r0Var;
        this.f141777c = setupStrengthTrainingPlanActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f141775a;
        SetupStrengthTrainingPlanActivity setupStrengthTrainingPlanActivity = this.f141777c;
        r0 r0Var = this.f141776b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                SetupStrengthTrainingPlanActivity.a aVar = SetupStrengthTrainingPlanActivity.f45640a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(450124023, new a(r0Var, setupStrengthTrainingPlanActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                SetupStrengthTrainingPlanActivity.a aVar2 = SetupStrengthTrainingPlanActivity.f45640a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    Long l14 = (Long) r0Var.f105810a;
                    boolean zR = mVar2.r(setupStrengthTrainingPlanActivity);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new u(setupStrengthTrainingPlanActivity, 24);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new u(setupStrengthTrainingPlanActivity, 24);
                            mVar2.K(objQ);
                        }
                    }
                    a0.c(l14, null, (e23.a) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
