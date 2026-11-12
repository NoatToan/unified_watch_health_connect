package defpackage;

import com.xiaomi.fitness.device.manager.export.scan.ScannedDeviceInfo;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity;

/* JADX INFO: loaded from: classes8.dex */
public class wcl extends gj1 {
    public wcl(Object[] objArr) {
        super(objArr);
    }

    @Override // defpackage.gj1
    public Object d(Object[] objArr) {
        Object[] objArr2 = this.f19043a;
        ScanDeviceActivity scanDeviceActivity = (ScanDeviceActivity) objArr2[0];
        ScannedDeviceInfo scannedDeviceInfo = (ScannedDeviceInfo) objArr2[1];
        scanDeviceActivity.launchToBind(1, scannedDeviceInfo);
        return null;
    }
}
