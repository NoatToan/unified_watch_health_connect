package fb1;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import l72.x0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f70239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f70240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f70241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f70242e;

    public /* synthetic */ g0(int i14, String str, String str2, String str3, String str4) {
        this.f70238a = i14;
        this.f70239b = str;
        this.f70240c = str2;
        this.f70241d = str3;
        this.f70242e = str4;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f70238a;
        String str = this.f70240c;
        String str2 = this.f70242e;
        switch (i14) {
            case 0:
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.m.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.m.f40713m;
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    x0 x0Var = x0.f111346a;
                    String strQ = gl1.y.Q(mVar, R.string.lbl_minimum);
                    b92.a aVarA = wz1.a.a(str);
                    int i15 = b92.a.f16960b;
                    int i16 = (iIntValue & 14) | (x0.f111348c << 24);
                    x0Var.a(i16, 60, aVarA, t2Var, null, null, this.f70239b, strQ, null, null, mVar);
                    x0Var.a(i16, 60, wz1.a.a(str2), t2Var, null, null, this.f70241d, gl1.y.Q(mVar, R.string.lbl_maximum), null, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                t2 t2Var2 = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i17 = iIntValue2;
                    x0 x0Var2 = x0.f111346a;
                    int i18 = (x0.f111348c << 24) | (i17 & 14) | 12582912;
                    x0Var2.a(i18, 60, null, t2Var2, null, null, this.f70239b, this.f70240c, null, null, mVar2);
                    x0Var2.a(i18, 60, null, t2Var2, null, null, this.f70241d, this.f70242e, null, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                t2 t2Var3 = (t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    int i19 = iIntValue3;
                    x0 x0Var3 = x0.f111346a;
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("merge", str2);
                    b92.a aVarB = c0235a.b();
                    int i24 = i19 & 14;
                    int i25 = b92.a.f16960b;
                    int i26 = x0.f111348c;
                    x0Var3.a((i26 << 24) | i24, 52, aVarB, t2Var3, null, null, this.f70239b, this.f70240c, this.f70241d, null, mVar3);
                    x0Var3.h(t2Var3, mVar3, i24 | (i26 << 3));
                } else {
                    mVar3.e();
                }
                break;
            default:
                t2 t2Var4 = (t2) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                t2Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(t2Var4) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    int i27 = iIntValue4;
                    x0 x0Var4 = x0.f111346a;
                    String strQ2 = gl1.y.Q(mVar4, R.string.goal_transition);
                    b92.a aVarA2 = wz1.a.a(str);
                    int i28 = i27 & 14;
                    int i29 = b92.a.f16960b;
                    int i30 = i28 | (x0.f111348c << 24);
                    x0Var4.a(i30, 60, aVarA2, t2Var4, null, null, this.f70239b, strQ2, null, null, mVar4);
                    x0Var4.a(i30, 60, wz1.a.a(str2), t2Var4, null, null, this.f70241d, gl1.y.Q(mVar4, R.string.actual_transition), null, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
