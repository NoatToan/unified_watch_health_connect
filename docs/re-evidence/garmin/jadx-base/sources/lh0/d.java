package lh0;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Double f112399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ih0.i f112400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Double f112401d;

    public /* synthetic */ d(Double d14, ih0.i iVar, Double d15, int i14) {
        this.f112398a = i14;
        this.f112399b = d14;
        this.f112400c = iVar;
        this.f112401d = d15;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p3.m mVar;
        p3.m mVar2;
        int i14 = this.f112398a;
        Double d14 = this.f112401d;
        ih0.i iVar = this.f112400c;
        Double d15 = this.f112399b;
        switch (i14) {
            case 0:
                l22.a aVar = iVar.f93454a;
                t2 t2Var = (t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar3.B(t2Var) ? 4 : 2;
                }
                int i15 = iIntValue;
                if (mVar3.n(i15 & 1, (i15 & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    if (d15 == null || d15.doubleValue() <= 0.0d) {
                        mVar = mVar3;
                        mVar.C(860361866);
                        n.d(t2Var, mVar, i15 & 14);
                        mVar.f();
                    } else {
                        mVar3.C(860189382);
                        n.a(t2Var, aVar.getString(R.string.workout_target), ih0.i.d(d15), null, mVar3, i15 & 14, 4);
                        mVar = mVar3;
                        mVar.f();
                    }
                    int i16 = i15 & 14;
                    n.e(t2Var, aVar.getString(R.string.lbl_avg_bmi), (d14 == null || d14.doubleValue() <= 0.0d) ? aVar.getString(R.string.no_value_card) : ih0.i.d(d14), null, mVar, i16, 4);
                    n.d(t2Var, mVar, i16);
                } else {
                    mVar3.e();
                }
                break;
            default:
                l22.a aVar2 = iVar.f93454a;
                t2 t2Var2 = (t2) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar4.B(t2Var2) ? 4 : 2;
                }
                int i17 = iIntValue2;
                if (mVar4.n(i17 & 1, (i17 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (d15 == null || d15.doubleValue() <= 0.0d) {
                        mVar2 = mVar4;
                        mVar2.C(-868450532);
                        n.d(t2Var2, mVar2, i17 & 14);
                        mVar2.f();
                    } else {
                        mVar4.C(-868675871);
                        n.a(t2Var2, aVar2.getString(R.string.workout_target), iVar.a(d15, false), aVar2.getString(R.string.lbl_percentage_simple), mVar4, i17 & 14, 0);
                        mVar2 = mVar4;
                        mVar2.f();
                    }
                    int i18 = i17 & 14;
                    n.e(t2Var2, aVar2.getString(R.string.lbl_avg_body_fat), (d14 == null || d14.doubleValue() <= 0.0d) ? aVar2.getString(R.string.no_value_card) : iVar.a(d14, false), aVar2.getString(R.string.lbl_percentage_simple), mVar2, i18, 0);
                    n.d(t2Var2, mVar2, i18);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
