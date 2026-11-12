package defpackage;

import android.bluetooth.BluetoothAdapter;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.ecologydevice.connectivity.ScanFilter;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class efn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private efm f32882b;

    public boolean a(dmm dmmVar, ScanFilter scanFilter, IDeviceEventHandler iDeviceEventHandler) {
        if (PermissionUtil.e(BaseApplication.j(), PermissionDialogHelper.c()) != PermissionUtil.PermissionResult.GRANTED) {
            LogUtil.e("DeviceScanManager", "no scan permission");
            return false;
        }
        LogUtil.a("DeviceScanManager", "Enter scanDevice");
        if (dmmVar == null && iDeviceEventHandler == null) {
            return false;
        }
        this.f32882b = new efm();
        dxw.c(new d(dmmVar, scanFilter, iDeviceEventHandler));
        return true;
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IDeviceEventHandler f32883a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private dmm f32885c;
        private ScanFilter e;

        d(dmm dmmVar, ScanFilter scanFilter, IDeviceEventHandler iDeviceEventHandler) {
            this.f32885c = dmmVar;
            this.e = scanFilter;
            this.f32883a = iDeviceEventHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iC = this.f32885c.c();
            if (iC == 1 || iC == 2) {
                for (int i = 0; i < 10; i++) {
                    try {
                        if (BluetoothAdapter.getDefaultAdapter().getState() == 12) {
                            break;
                        } else {
                            Thread.sleep(500L);
                        }
                    } catch (InterruptedException unused) {
                        LogUtil.e("DeviceScanManager", "wait bluetooth state InterruptedException");
                    }
                }
                if (BluetoothAdapter.getDefaultAdapter().getState() == 10) {
                    LogUtil.j("DeviceScanManager", "bluetooth state is off");
                    this.f32883a.onScanFailed(3);
                    return;
                }
            }
            if (!enq.d().c()) {
                if (efn.this.f32882b != null) {
                    efn.this.f32882b.e(this.f32885c, this.e, this.f32883a);
                    return;
                }
                return;
            }
            this.f32883a.onStateChanged(1001);
        }
    }

    public void c() {
        efm efmVar = this.f32882b;
        if (efmVar != null) {
            efmVar.j();
        }
    }
}
