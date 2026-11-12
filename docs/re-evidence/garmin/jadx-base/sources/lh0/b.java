package lh0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f112392b;

    public /* synthetic */ b(r rVar, int i14) {
        this.f112391a = i14;
        this.f112392b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f112391a;
        r rVar = this.f112392b;
        int i15 = 1;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    rVar.i(R.string.lbl_help_achieve_goal, mVar, 0);
                    rVar.d(z3.f.c(205029011, new b(rVar, i15), mVar), mVar, 6);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    rVar.b(R.string.msg_healthy_weight_loss_suggestion, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    rVar.i(R.string.lbl_to_reduce_rhr, mVar, 0);
                    rVar.d(z3.f.c(2053875207, new b(rVar, 3), mVar), mVar, 6);
                } else {
                    mVar.e();
                }
                break;
            case 3:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    rVar.b(R.string.lbl_reduce_rhr_step_1, mVar, 0);
                    rVar.b(R.string.lbl_reduce_rhr_step_2, mVar, 0);
                    rVar.b(R.string.lbl_reduce_rhr_step_3, mVar, 0);
                    rVar.b(R.string.lbl_reduce_rhr_step_4, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 4:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    rVar.i(R.string.lbl_help_achieve_goal, mVar, 0);
                    rVar.d(z3.f.c(-562909661, new b(rVar, 5), mVar), mVar, 6);
                } else {
                    mVar.e();
                }
                break;
            case 5:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    rVar.b(R.string.msg_vigorous_days_continuous_activity, mVar, 0);
                    rVar.b(R.string.msg_vigorous_days_aim_for_more, mVar, 0);
                    rVar.b(R.string.msg_not_to_overexert, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 6:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    rVar.i(R.string.lbl_help_achieve_goal, mVar, 0);
                    rVar.d(z3.f.c(-1044491341, new b(rVar, 7), mVar), mVar, 6);
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    rVar.b(R.string.msg_effort_vigorous_intensity, mVar, 0);
                    rVar.b(R.string.lbl_target_specific_heart_rate, mVar, 0);
                    rVar.b(R.string.msg_not_to_overexert, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
