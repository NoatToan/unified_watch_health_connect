package gs;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import l72.x0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r22.p f78624b;

    public /* synthetic */ i(r22.p pVar, int i14) {
        this.f78623a = i14;
        this.f78624b = pVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f78623a;
        r22.p pVar = this.f78624b;
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
                    x0 x0Var = x0.f111346a;
                    String strH = pVar != null ? pVar.f149774a : null;
                    if (strH == null) {
                        strH = sn.a.h(mVar, 1316453870, R.string.no_value, mVar);
                    } else {
                        mVar.C(1316453250);
                        mVar.f();
                    }
                    x0Var.f((x0.f111348c << 24) | (iIntValue & 14), 116, null, t2Var, null, null, strH, pVar != null ? pVar.f149776c : null, pVar != null ? pVar.f149775b : null, null, mVar);
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
                    String strH2 = pVar != null ? pVar.f149774a : null;
                    if (strH2 == null) {
                        strH2 = sn.a.h(mVar2, 808443184, R.string.no_value, mVar2);
                    } else {
                        mVar2.C(808442564);
                        mVar2.f();
                    }
                    n.c(t2Var2, strH2, pVar != null ? pVar.f149776c : null, pVar != null ? pVar.f149775b : null, null, mVar2, iIntValue2 & 14);
                } else {
                    mVar2.e();
                }
                break;
            default:
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
                    String str = pVar.f149774a;
                    String str2 = pVar.f149776c;
                    int i15 = iIntValue3 & 14;
                    int i16 = x0.f111348c;
                    x0Var2.a(i15 | (i16 << 24), 124, null, t2Var3, null, null, str, str2, null, null, mVar3);
                    x0Var2.h(t2Var3, mVar3, i15 | (i16 << 3));
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
