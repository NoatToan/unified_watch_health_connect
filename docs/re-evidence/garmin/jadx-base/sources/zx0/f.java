package zx0;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.moveiq.MoveIQEventDetailsActivity;
import e23.q;
import gl1.y;
import l72.x0;
import p005kotlin.Unit;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207350a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f207351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f207352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f207353d;

    public /* synthetic */ f(Integer num, Integer num2, String str) {
        this.f207351b = num;
        this.f207352c = num2;
        this.f207353d = str;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f207350a;
        Integer num = this.f207352c;
        Integer num2 = this.f207351b;
        switch (i14) {
            case 0:
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                MoveIQEventDetailsActivity.a aVar = MoveIQEventDetailsActivity.f39211k;
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    x0 x0Var = x0.f111346a;
                    String strValueOf = String.valueOf(num2 != null ? num2.intValue() : 0);
                    String strQ = y.Q(mVar, R.string.lbl_intensity_moderate_short);
                    int i15 = iIntValue & 14;
                    int i16 = x0.f111348c << 24;
                    String str = this.f207353d;
                    x0Var.a(i15 | i16, 116, null, t2Var, null, null, strValueOf, strQ, str, null, mVar);
                    String strValueOf2 = String.valueOf(num != null ? num.intValue() : 0);
                    String strQ2 = y.Q(mVar, R.string.lbl_intensity_vigorous_short);
                    a.f207337a.getClass();
                    x0Var.a(i16 | i15 | 196608, 100, null, t2Var, a.f207338b, null, strValueOf2, strQ2, str, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            default:
                t2 t2Var2 = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                MoveIQEventDetailsActivity.a aVar2 = MoveIQEventDetailsActivity.f39211k;
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    int i17 = iIntValue2;
                    x0 x0Var2 = x0.f111346a;
                    String strValueOf3 = String.valueOf(oe2.f.y(num2, num));
                    String strQ3 = y.Q(mVar2, R.string.lbl_total);
                    int i18 = i17 & 14;
                    int i19 = x0.f111348c;
                    x0Var2.a(i18 | (i19 << 24), 116, null, t2Var2, null, null, strValueOf3, strQ3, this.f207353d, null, mVar2);
                    x0Var2.h(t2Var2, mVar2, i18 | (i19 << 3));
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(Integer num, String str, Integer num2) {
        this.f207351b = num;
        this.f207353d = str;
        this.f207352c = num2;
    }
}
