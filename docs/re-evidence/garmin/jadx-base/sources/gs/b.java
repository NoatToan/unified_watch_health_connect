package gs;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import l72.x0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r22.p f78590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r22.p f78591c;

    public /* synthetic */ b(r22.p pVar, r22.p pVar2, int i14) {
        this.f78589a = i14;
        this.f78590b = pVar;
        this.f78591c = pVar2;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f78589a;
        r22.p pVar = this.f78591c;
        r22.p pVar2 = this.f78590b;
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
                    if (pVar2 == null) {
                        mVar.C(-1731255084);
                        mVar.f();
                    } else {
                        mVar.C(-1731255083);
                        x0.f111346a.a((iIntValue & 14) | (x0.f111348c << 24), 116, null, t2Var, null, null, pVar2.f149774a, pVar2.f149776c, pVar2.f149775b, null, mVar);
                        mVar.f();
                    }
                    if (pVar == null) {
                        mVar = mVar;
                        mVar.C(-1730982284);
                        mVar.f();
                    } else {
                        mVar = mVar;
                        mVar.C(-1730982283);
                        x0.f111346a.a((iIntValue & 14) | (x0.f111348c << 24), 116, null, t2Var, null, null, pVar.f149774a, pVar.f149776c, pVar.f149775b, null, mVar);
                        mVar.f();
                    }
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
                    x0 x0Var = x0.f111346a;
                    String strH = pVar2 != null ? pVar2.f149774a : null;
                    if (strH == null) {
                        strH = sn.a.h(mVar2, 1072352559, R.string.no_value, mVar2);
                    } else {
                        mVar2.C(1072351939);
                        mVar2.f();
                    }
                    String str = strH;
                    String str2 = pVar2 != null ? pVar2.f149776c : null;
                    String str3 = pVar2 != null ? pVar2.f149775b : null;
                    int i15 = (iIntValue2 & 14) | (x0.f111348c << 24);
                    x0Var.f(i15, 116, null, t2Var2, null, null, str, str2, str3, null, mVar2);
                    String strH2 = pVar != null ? pVar.f149774a : null;
                    if (strH2 == null) {
                        strH2 = sn.a.h(mVar2, 1072361455, R.string.no_value, mVar2);
                    } else {
                        mVar2.C(1072360804);
                        mVar2.f();
                    }
                    x0Var.f(i15, 116, null, t2Var2, null, null, strH2, pVar != null ? pVar.f149776c : null, pVar != null ? pVar.f149775b : null, null, mVar2);
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
                    x0 x0Var2 = x0.f111346a;
                    String strH3 = pVar2 != null ? pVar2.f149774a : null;
                    if (strH3 == null) {
                        strH3 = sn.a.h(mVar3, 1863586711, R.string.no_value, mVar3);
                    } else {
                        mVar3.C(1863586060);
                        mVar3.f();
                    }
                    String str4 = strH3;
                    String str5 = pVar2 != null ? pVar2.f149776c : null;
                    String str6 = pVar2 != null ? pVar2.f149775b : null;
                    int i16 = (iIntValue3 & 14) | (x0.f111348c << 24);
                    x0Var2.a(i16, 116, null, t2Var3, null, null, str4, str5, str6, null, mVar3);
                    String strH4 = pVar != null ? pVar.f149774a : null;
                    if (strH4 == null) {
                        strH4 = sn.a.h(mVar3, 1863594711, R.string.no_value, mVar3);
                    } else {
                        mVar3.C(1863594091);
                        mVar3.f();
                    }
                    x0Var2.a(i16, 116, null, t2Var3, null, null, strH4, pVar != null ? pVar.f149776c : null, pVar != null ? pVar.f149775b : null, null, mVar3);
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
                    int i17 = iIntValue4;
                    x0 x0Var3 = x0.f111346a;
                    String strH5 = pVar2 != null ? pVar2.f149774a : null;
                    if (strH5 == null) {
                        strH5 = sn.a.h(mVar4, 1918973525, R.string.no_value, mVar4);
                    } else {
                        mVar4.C(1918972905);
                        mVar4.f();
                    }
                    String str7 = strH5;
                    String str8 = pVar2 != null ? pVar2.f149776c : null;
                    String str9 = pVar2 != null ? pVar2.f149775b : null;
                    int i18 = (i17 & 14) | (x0.f111348c << 24);
                    x0Var3.a(i18, 116, null, t2Var4, null, null, str7, str8, str9, null, mVar4);
                    String strH6 = pVar != null ? pVar.f149774a : null;
                    if (strH6 == null) {
                        strH6 = sn.a.h(mVar4, 1918979573, R.string.no_value, mVar4);
                    } else {
                        mVar4.C(1918978922);
                        mVar4.f();
                    }
                    x0Var3.a(i18, 116, null, t2Var4, null, null, strH6, pVar != null ? pVar.f149776c : null, pVar != null ? pVar.f149775b : null, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
