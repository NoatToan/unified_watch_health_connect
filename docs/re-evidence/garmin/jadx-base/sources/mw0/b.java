package mw0;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import l72.x0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f121246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aw0.a f121247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f121248d;

    public /* synthetic */ b(String str, aw0.a aVar, String str2, int i14) {
        this.f121245a = i14;
        this.f121246b = str;
        this.f121247c = aVar;
        this.f121248d = str2;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f121245a;
        aw0.a aVar = this.f121247c;
        switch (i14) {
            case 0:
                l22.b bVar = aVar.f13319a;
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    x0 x0Var = x0.f111346a;
                    String string = bVar.getString(R.string.lbl_days_logged_yes);
                    int i15 = (iIntValue & 14) | 12582912 | (x0.f111348c << 24);
                    x0Var.a(i15, 60, null, t2Var, null, null, this.f121246b, string, null, null, mVar);
                    x0Var.a(i15, 60, null, t2Var, null, null, this.f121248d, bVar.getString(R.string.lbl_days_logged_no), null, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                l22.b bVar2 = aVar.f13319a;
                t2 t2Var2 = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x0 x0Var2 = x0.f111346a;
                    String string2 = bVar2.getString(R.string.lbl_avg_when_yes);
                    int i16 = (iIntValue2 & 14) | 12582912 | (x0.f111348c << 24);
                    x0Var2.a(i16, 60, null, t2Var2, null, null, this.f121246b, string2, null, null, mVar2);
                    x0Var2.a(i16, 60, null, t2Var2, null, null, this.f121248d, bVar2.getString(R.string.lbl_avg_when_no), null, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            default:
                l22.b bVar3 = aVar.f13319a;
                t2 t2Var3 = (t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    x0 x0Var3 = x0.f111346a;
                    String string3 = bVar3.getString(R.string.lbl_days_logged_yes);
                    int i17 = (iIntValue3 & 14) | 12582912 | (x0.f111348c << 24);
                    x0Var3.a(i17, 60, null, t2Var3, null, null, this.f121246b, string3, null, null, mVar3);
                    x0Var3.a(i17, 60, null, t2Var3, null, null, this.f121248d, bVar3.getString(R.string.lbl_days_logged_no), null, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
