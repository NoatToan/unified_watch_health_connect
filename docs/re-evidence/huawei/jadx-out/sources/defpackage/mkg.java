package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.HwAddDeviceInterface;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mkg implements HwAddDeviceInterface {
    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.HwAddDeviceInterface
    public void addDeviceHelper(DeviceParameter deviceParameter) {
        if (deviceParameter == null) {
            LogUtil.j("HwAddBrDevice", "addBrDevice deviceParameter null.");
            return;
        }
        int iH = BTDeviceMgrUtil.c().h();
        boolean z = !mko.c(deviceParameter.getBluetoothType()) || mko.a();
        boolean zD = BTDeviceMgrUtil.c().d(deviceParameter.getNameFilter());
        LogUtil.a("HwAddBrDevice", "addBrDevice enter btSwitchState: ", Integer.valueOf(iH), "isGpsOpen: ", Boolean.valueOf(z), "isSystermDevice:", Boolean.valueOf(zD));
        if (iH == 1) {
            if (z) {
                mko.d(1, 3, deviceParameter);
                return;
            } else {
                mko.d(1, 1, deviceParameter);
                return;
            }
        }
        if (iH != 3) {
            LogUtil.a("HwAddBrDevice", "switch other status");
            return;
        }
        if (!z) {
            mko.d(1, 2, deviceParameter);
        } else if (zD) {
            LogUtil.a("HwAddBrDevice", "Has wanted BR device.");
            mko.d(1, 4, deviceParameter);
        } else {
            mko.d(3, 3, deviceParameter);
        }
    }
}
