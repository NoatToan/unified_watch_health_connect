package kq;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f106135b;

    public /* synthetic */ u0(v0 v0Var, int i14) {
        this.f106134a = i14;
        this.f106135b = v0Var;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f106134a;
        v0 v0Var = this.f106135b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = v0.f106138f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    v0Var.g(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = v0.f106138f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    v0Var.g(mVar2, h82.c.f82429e);
                } else {
                    mVar2.e();
                }
                break;
            default:
                h82.r rVar = (h82.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i17 = v0.f106138f;
                rVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(rVar) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    int i18 = (iIntValue3 << 3) & 112;
                    rVar.D(R.string.lbl_pace, mVar3, i18);
                    int i19 = (iIntValue3 << 6) & 896;
                    rVar.l(R.string.activities_pace_help_description2, i19, 2, null, mVar3);
                    rVar.t(R.string.activities_avg_pace_help_subtitle, mVar3, i18);
                    rVar.o(R.string.activities_avg_pace_help_description2, i19, 2, null, mVar3);
                    rVar.t(R.string.activities_avg_moving_pace_help_subtitle, mVar3, i18);
                    rVar.o(R.string.activities_avg_moving_pace_help_description, i19, 2, null, mVar3);
                    if (p005kotlin.jvm.internal.s.g(v0Var.f82432c, "INCLUDING_AVG_GRADE_ADJUSTED_PACE")) {
                        mVar3.C(1205369450);
                        String strP = gl1.y.P(R.string.activities_avg_grade_adj_pace_placeholder_help_subtitle, new Object[]{gl1.y.Q(mVar3, R.string.lbl_grade_adjusted_pace_abbreviation)}, mVar3);
                        String strP2 = gl1.y.P(R.string.activities_avg_grade_adj_pace_placeholder_help_description_v2, new Object[]{gl1.y.Q(mVar3, R.string.lbl_grade_adjusted_pace_abbreviation)}, mVar3);
                        rVar.s(i19, 2, strP, null, mVar3);
                        i19 = i19;
                        rVar.q(strP2, mVar3, i18);
                        mVar3.f();
                    } else {
                        mVar3.C(1205978724);
                        mVar3.f();
                    }
                    rVar.t(R.string.activity_details_best_pace, mVar3, i18);
                    rVar.o(R.string.activities_best_pace_help_description2, i19, 2, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
