package pg1;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.settings.devices.backup.DeviceBackupActivity;
import e23.l;
import e23.p;
import gl1.y;
import lc.m0;
import lc.v0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceBackupActivity f137597b;

    public /* synthetic */ a(DeviceBackupActivity deviceBackupActivity, int i14) {
        this.f137596a = i14;
        this.f137597b = deviceBackupActivity;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f137596a;
        int i15 = 1;
        DeviceBackupActivity deviceBackupActivity = this.f137597b;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                DeviceBackupActivity.a aVar = DeviceBackupActivity.f42558c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(685771292, new a(deviceBackupActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                DeviceBackupActivity.a aVar2 = DeviceBackupActivity.f42558c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    m0 m0VarI = y.I(new v0[0], mVar2);
                    String str = deviceBackupActivity.f42560b == -1 ? "allBackups" : "deviceBackups";
                    boolean zR = mVar2.r(deviceBackupActivity) | mVar2.r(m0VarI);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new o50.a(29, deviceBackupActivity, m0VarI);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new o50.a(29, deviceBackupActivity, m0VarI);
                            mVar2.K(objQ);
                        }
                    }
                    nc.y.b(m0VarI, str, null, null, null, null, null, null, (l) objQ, mVar2, 0, 1020);
                } else {
                    mVar2.e();
                }
                break;
            default:
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) obj2).longValue();
                DeviceBackupActivity.a aVar3 = DeviceBackupActivity.f42558c;
                ug1.c cVarGa = deviceBackupActivity.ga();
                cVarGa.getClass();
                ge1.b.T(v1.a(cVarGa), null, null, new ug1.b(cVarGa, jLongValue, jLongValue2, "DeviceBackupsOutsideBICRestore", null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
