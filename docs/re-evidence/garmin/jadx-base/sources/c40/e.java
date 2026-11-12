package c40;

import c2.t2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e50.i f24320b;

    public /* synthetic */ e(e50.i iVar, int i14) {
        this.f24319a = i14;
        this.f24320b = iVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f24319a;
        e50.i iVar = this.f24320b;
        switch (i14) {
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
                    k.a(t2Var, y.Q(mVar, R.string.unpaved), iVar.f63035b.intValue(), iVar.f63036c.doubleValue(), iVar.f63043j, mVar, iIntValue & 14);
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
                    x0.f23314a.getClass();
                    k.a(t2Var2, gl1.d.W(x0.f23462ic), iVar.f63037d.intValue(), iVar.f63038e.doubleValue(), iVar.f63043j, mVar2, iIntValue2 & 14);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                t2 t2Var3 = (t2) obj;
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = n.f135158a;
                    l72.x0.f111346a.a((l72.x0.f111348c << 24) | (iIntValue3 & 14), 124, null, t2Var3, null, null, String.valueOf(iVar.f63044k.intValue()), y.Q(mVar3, R.string.lbl_map_settings_hazards), null, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                t2 t2Var4 = (t2) obj;
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                t2Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(t2Var4) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = n.f135158a;
                    k.a(t2Var4, y.Q(mVar4, R.string.unpaved), iVar.f63035b.intValue(), iVar.f63036c.doubleValue(), iVar.f63043j, mVar4, iIntValue4 & 14);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                t2 t2Var5 = (t2) obj;
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                t2Var5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(t2Var5) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = n.f135158a;
                    x0.f23314a.getClass();
                    k.a(t2Var5, gl1.d.W(x0.f23462ic), iVar.f63037d.intValue(), iVar.f63038e.doubleValue(), iVar.f63043j, mVar5, iIntValue5 & 14);
                } else {
                    mVar5.e();
                }
                break;
            default:
                t2 t2Var6 = (t2) obj;
                m mVar6 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                t2Var6.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(t2Var6) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = n.f135158a;
                    l72.x0.f111346a.a((iIntValue6 & 14) | (l72.x0.f111348c << 24), 124, null, t2Var6, null, null, String.valueOf(iVar.f63044k.intValue()), y.Q(mVar6, R.string.lbl_map_settings_hazards), null, null, mVar6);
                } else {
                    mVar6.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
