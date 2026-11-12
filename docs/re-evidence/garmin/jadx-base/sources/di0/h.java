package di0;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import l72.x0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f59719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b92.a f59720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f59721d;

    public /* synthetic */ h(b92.a aVar, String str, String str2) {
        this.f59718a = 2;
        this.f59719b = str;
        this.f59721d = str2;
        this.f59720c = aVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f59718a) {
            case 0:
                t2 t2Var = (t2) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    x0 x0Var = x0.f111346a;
                    String strQ = y.Q(mVar, R.string.lbl_weekly_avg_climbed);
                    int i14 = b92.a.f16960b;
                    int i15 = (x0.f111348c << 24) | (iIntValue & 14);
                    x0Var.a(i15, 60, this.f59720c, t2Var, null, null, this.f59719b, strQ, null, null, mVar);
                    x0Var.a(i15, 124, null, t2Var, null, null, this.f59721d, y.Q(mVar, R.string.lbl_total_floors_climbed), null, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                t2 t2Var2 = (t2) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    x0 x0Var2 = x0.f111346a;
                    String strQ2 = y.Q(mVar2, R.string.lbl_weekly_avg_descended);
                    int i16 = b92.a.f16960b;
                    int i17 = (x0.f111348c << 24) | (iIntValue2 & 14);
                    x0Var2.a(i17, 60, this.f59720c, t2Var2, null, null, this.f59719b, strQ2, null, null, mVar2);
                    x0Var2.a(i17, 124, null, t2Var2, null, null, this.f59721d, y.Q(mVar2, R.string.lbl_total_floors_descended), null, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            default:
                t2 t2Var3 = (t2) obj;
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = n.f135158a;
                    int i18 = iIntValue3;
                    x0 x0Var3 = x0.f111346a;
                    int i19 = i18 & 14;
                    int i24 = b92.a.f16960b;
                    int i25 = x0.f111348c;
                    x0Var3.a(i19 | (i25 << 24), 60, this.f59720c, t2Var3, null, null, this.f59719b, this.f59721d, null, null, mVar3);
                    x0Var3.h(t2Var3, mVar3, i19 | (i25 << 3));
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h(String str, b92.a aVar, String str2, int i14) {
        this.f59718a = i14;
        this.f59719b = str;
        this.f59720c = aVar;
        this.f59721d = str2;
    }
}
