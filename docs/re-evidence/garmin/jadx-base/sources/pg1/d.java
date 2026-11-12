package pg1;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.settings.devices.backup.DeviceBackupActivity;
import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceBackupActivity f137604b;

    public /* synthetic */ d(DeviceBackupActivity deviceBackupActivity, int i14) {
        this.f137603a = i14;
        this.f137604b = deviceBackupActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f137603a;
        DeviceBackupActivity deviceBackupActivity = this.f137604b;
        switch (i14) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                DeviceBackupActivity.a aVar = DeviceBackupActivity.f42558c;
                ug1.c cVarGa = deviceBackupActivity.ga();
                ge1.b.T(v1.a(cVarGa), null, null, new ug1.d(cVarGa, (sg1.d) cVarGa.f170648e.getValue(), jLongValue, null), 3);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                DeviceBackupActivity.a aVar2 = DeviceBackupActivity.f42558c;
                if (zBooleanValue) {
                    deviceBackupActivity.showProgressOverlay();
                } else {
                    deviceBackupActivity.hideProgressOverlay();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
