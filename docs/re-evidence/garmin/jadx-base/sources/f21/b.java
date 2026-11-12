package f21;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import l72.x0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f68481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f68482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f68483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f68484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f68485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f68486g;

    public /* synthetic */ b(String str, int i14, String str2, String str3, String str4, String str5, String str6) {
        this.f68480a = i14;
        this.f68481b = str;
        this.f68482c = str2;
        this.f68483d = str3;
        this.f68484e = str4;
        this.f68485f = str5;
        this.f68486g = str6;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f68480a;
        String str = this.f68486g;
        String str2 = this.f68483d;
        switch (i14) {
            case 0:
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    int i15 = iIntValue;
                    x0 x0Var = x0.f111346a;
                    b92.a aVarA = wz1.a.a(str2);
                    int i16 = b92.a.f16960b;
                    int i17 = (i15 & 14) | (x0.f111348c << 24);
                    x0Var.a(i17, 60, aVarA, t2Var, null, null, this.f68481b, this.f68482c, null, null, mVar);
                    x0Var.a(i17, 60, wz1.a.a(str), t2Var, null, null, this.f68484e, this.f68485f, null, null, mVar);
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
                    int i18 = iIntValue2;
                    x0 x0Var2 = x0.f111346a;
                    b92.a aVarA2 = wz1.a.a(str2);
                    int i19 = b92.a.f16960b;
                    int i24 = (i18 & 14) | (x0.f111348c << 24);
                    x0Var2.a(i24, 60, aVarA2, t2Var2, null, null, this.f68481b, this.f68482c, null, null, mVar2);
                    x0Var2.a(i24, 60, wz1.a.a(str), t2Var2, null, null, this.f68484e, this.f68485f, null, null, mVar2);
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
                    x0 x0Var3 = x0.f111346a;
                    String strQ = gl1.y.Q(mVar3, R.string.unit_g);
                    b92.a aVarA3 = wz1.a.a(str2);
                    int i25 = b92.a.f16960b;
                    int i26 = (x0.f111348c << 24) | (iIntValue3 & 14);
                    x0Var3.a(i26, 52, aVarA3, t2Var3, null, null, this.f68481b, this.f68482c, strQ, null, mVar3);
                    x0Var3.a(i26, 52, wz1.a.a(str), t2Var3, null, null, this.f68484e, this.f68485f, gl1.y.Q(mVar3, R.string.unit_g), null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                t2 t2Var4 = (t2) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                t2Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(t2Var4) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    x0 x0Var4 = x0.f111346a;
                    String strQ2 = gl1.y.Q(mVar4, R.string.unit_g);
                    b92.a aVarA4 = wz1.a.a(str2);
                    int i27 = b92.a.f16960b;
                    int i28 = (iIntValue4 & 14) | (x0.f111348c << 24);
                    x0Var4.a(i28, 52, aVarA4, t2Var4, null, null, this.f68481b, this.f68482c, strQ2, null, mVar4);
                    x0Var4.a(i28, 60, wz1.a.a(str), t2Var4, null, null, this.f68484e, this.f68485f, null, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                t2 t2Var5 = (t2) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                t2Var5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(t2Var5) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    x0 x0Var5 = x0.f111346a;
                    String str3 = this.f68481b;
                    str3.getClass();
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    String str4 = this.f68482c;
                    c0235a.f16962a.put("merge", j20.x.d(str4, ", ", str3, ", ", str2));
                    b92.a aVarB = c0235a.b();
                    int i29 = b92.a.f16960b;
                    int i30 = (iIntValue5 & 14) | (x0.f111348c << 24);
                    x0Var5.a(i30, 52, aVarB, t2Var5, null, null, str3, str4, this.f68484e, null, mVar5);
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                    String str5 = this.f68486g;
                    String str6 = this.f68485f;
                    c0235a2.f16962a.put("merge", e5.g(str5, ", ", str6));
                    x0Var5.a(i30, 60, c0235a2.b(), t2Var5, null, null, str6, str5, null, null, mVar5);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                t2 t2Var6 = (t2) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                t2Var6.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(t2Var6) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    x0 x0Var6 = x0.f111346a;
                    b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                    String str7 = this.f68482c;
                    String str8 = this.f68481b;
                    c0235a3.f16962a.put("merge", j20.x.d(str7, ", ", str8, ", ", str2));
                    b92.a aVarB2 = c0235a3.b();
                    int i34 = b92.a.f16960b;
                    int i35 = (iIntValue6 & 14) | (x0.f111348c << 24);
                    x0Var6.a(i35, 52, aVarB2, t2Var6, null, null, str8, str7, this.f68484e, null, mVar6);
                    b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                    String str9 = this.f68486g;
                    String str10 = this.f68485f;
                    c0235a4.f16962a.put("merge", e5.g(str9, ", ", str10));
                    x0Var6.a(i35, 60, c0235a4.b(), t2Var6, null, null, str10, str9, null, null, mVar6);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                t2 t2Var7 = (t2) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                t2Var7.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar7.B(t2Var7) ? 4 : 2;
                }
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var7 = p3.n.f135158a;
                    x0 x0Var7 = x0.f111346a;
                    b92.a.C0235a c0235a5 = new b92.a.C0235a(null, 1, null);
                    String str11 = this.f68482c;
                    String str12 = this.f68481b;
                    c0235a5.f16962a.put("merge", j20.x.d(str11, ", ", str12, ", ", str2));
                    b92.a aVarB3 = c0235a5.b();
                    int i36 = b92.a.f16960b;
                    int i37 = (iIntValue7 & 14) | (x0.f111348c << 24);
                    x0Var7.a(i37, 52, aVarB3, t2Var7, null, null, str12, str11, this.f68484e, null, mVar7);
                    b92.a.C0235a c0235a6 = new b92.a.C0235a(null, 1, null);
                    String str13 = this.f68486g;
                    String str14 = this.f68485f;
                    c0235a6.f16962a.put("merge", e5.g(str13, ", ", str14));
                    x0Var7.a(i37, 60, c0235a6.b(), t2Var7, null, null, str14, str13, null, null, mVar7);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                t2 t2Var8 = (t2) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                t2Var8.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(t2Var8) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var8 = p3.n.f135158a;
                    x0 x0Var8 = x0.f111346a;
                    b92.a.C0235a c0235a7 = new b92.a.C0235a(null, 1, null);
                    String str15 = this.f68482c;
                    String str16 = this.f68481b;
                    c0235a7.f16962a.put("merge", j20.x.d(str15, ", ", str16, ", ", str2));
                    b92.a aVarB4 = c0235a7.b();
                    int i38 = b92.a.f16960b;
                    int i39 = (iIntValue8 & 14) | (x0.f111348c << 24);
                    x0Var8.a(i39, 52, aVarB4, t2Var8, null, null, str16, str15, this.f68484e, null, mVar8);
                    b92.a.C0235a c0235a8 = new b92.a.C0235a(null, 1, null);
                    String str17 = this.f68486g;
                    String str18 = this.f68485f;
                    c0235a8.f16962a.put("merge", e5.g(str17, ", ", str18));
                    x0Var8.a(i39, 60, c0235a8.b(), t2Var8, null, null, str18, str17, null, null, mVar8);
                } else {
                    mVar8.e();
                }
                break;
            case 8:
                t2 t2Var9 = (t2) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                t2Var9.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar9.B(t2Var9) ? 4 : 2;
                }
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var9 = p3.n.f135158a;
                    x0 x0Var9 = x0.f111346a;
                    b92.a.C0235a c0235a9 = new b92.a.C0235a(null, 1, null);
                    String str19 = this.f68482c;
                    String str20 = this.f68481b;
                    c0235a9.f16962a.put("merge", j20.x.d(str19, ", ", str20, ", ", str2));
                    b92.a aVarB5 = c0235a9.b();
                    int i44 = b92.a.f16960b;
                    int i45 = (iIntValue9 & 14) | (x0.f111348c << 24);
                    x0Var9.a(i45, 52, aVarB5, t2Var9, null, null, str20, str19, this.f68484e, null, mVar9);
                    b92.a.C0235a c0235a10 = new b92.a.C0235a(null, 1, null);
                    String str21 = this.f68486g;
                    String str22 = this.f68485f;
                    c0235a10.f16962a.put("merge", e5.g(str21, ", ", str22));
                    x0Var9.a(i45, 60, c0235a10.b(), t2Var9, null, null, str22, str21, null, null, mVar9);
                } else {
                    mVar9.e();
                }
                break;
            case 9:
                t2 t2Var10 = (t2) obj;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                t2Var10.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar10.B(t2Var10) ? 4 : 2;
                }
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var10 = p3.n.f135158a;
                    x0 x0Var10 = x0.f111346a;
                    b92.a.C0235a c0235a11 = new b92.a.C0235a(null, 1, null);
                    String str23 = this.f68482c;
                    String str24 = this.f68481b;
                    c0235a11.f16962a.put("merge", j20.x.d(str23, ", ", str24, " , ", str2));
                    b92.a aVarB6 = c0235a11.b();
                    int i46 = b92.a.f16960b;
                    int i47 = (iIntValue10 & 14) | (x0.f111348c << 24);
                    x0Var10.a(i47, 52, aVarB6, t2Var10, null, null, str24, str23, this.f68484e, null, mVar10);
                    b92.a.C0235a c0235a12 = new b92.a.C0235a(null, 1, null);
                    String str25 = this.f68486g;
                    String str26 = this.f68485f;
                    c0235a12.f16962a.put("merge", e5.g(str25, ", ", str26));
                    x0Var10.a(i47, 60, c0235a12.b(), t2Var10, null, null, str26, str25, null, null, mVar10);
                } else {
                    mVar10.e();
                }
                break;
            case 10:
                t2 t2Var11 = (t2) obj;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                t2Var11.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar11.B(t2Var11) ? 4 : 2;
                }
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    x1 x1Var11 = p3.n.f135158a;
                    x0 x0Var11 = x0.f111346a;
                    b92.a.C0235a c0235a13 = new b92.a.C0235a(null, 1, null);
                    String str27 = this.f68482c;
                    String str28 = this.f68481b;
                    c0235a13.f16962a.put("merge", j20.x.d(str27, ", ", str28, ", ", str2));
                    b92.a aVarB7 = c0235a13.b();
                    int i48 = b92.a.f16960b;
                    int i49 = (iIntValue11 & 14) | (x0.f111348c << 24);
                    x0Var11.a(i49, 52, aVarB7, t2Var11, null, null, str28, str27, this.f68484e, null, mVar11);
                    b92.a.C0235a c0235a14 = new b92.a.C0235a(null, 1, null);
                    String str29 = this.f68486g;
                    String str30 = this.f68485f;
                    c0235a14.f16962a.put("merge", e5.g(str29, ", ", str30));
                    x0Var11.a(i49, 60, c0235a14.b(), t2Var11, null, null, str30, str29, null, null, mVar11);
                } else {
                    mVar11.e();
                }
                break;
            default:
                t2 t2Var12 = (t2) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                t2Var12.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar12.B(t2Var12) ? 4 : 2;
                }
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var12 = p3.n.f135158a;
                    x0 x0Var12 = x0.f111346a;
                    b92.a aVarA5 = wz1.a.a(str2);
                    int i54 = b92.a.f16960b;
                    int i55 = (iIntValue12 & 14) | (x0.f111348c << 24);
                    x0Var12.a(i55, 60, aVarA5, t2Var12, null, null, this.f68481b, this.f68482c, null, null, mVar12);
                    x0Var12.a(i55, 60, wz1.a.a(str), t2Var12, null, null, this.f68484e, this.f68485f, null, null, mVar12);
                } else {
                    mVar12.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
