package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.HwAddDeviceInterface;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mkh implements HwAddDeviceInterface {
    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.HwAddDeviceInterface
    public void addDeviceHelper(DeviceParameter deviceParameter) {
        if (deviceParameter == null) {
            LogUtil.j("HwAddBleDevice", "addBrDevice deviceParameter null.");
            return;
        }
        int iH = BTDeviceMgrUtil.c().h();
        boolean zA = mko.a();
        LogUtil.a("HwAddBleDevice", "addBleDevice enter btSwitchState: ", Integer.valueOf(iH), "isGpsOpen:", Boolean.valueOf(zA));
        if (iH == 1) {
            if (zA) {
                mko.d(1, 3, deviceParameter);
                return;
            } else {
                mko.d(1, 1, deviceParameter);
                return;
            }
        }
        if (iH != 3) {
            LogUtil.a("HwAddBleDevice", "switch other status");
        } else if (zA) {
            mko.d(3, 3, deviceParameter);
        } else {
            mko.d(1, 2, deviceParameter);
        }
    }
}
