package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.HwAddDeviceInterface;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mkk implements HwAddDeviceInterface {
    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.HwAddDeviceInterface
    public void addDeviceHelper(DeviceParameter deviceParameter) {
        if (deviceParameter == null) {
            LogUtil.j("HwAddAwDevice", "addBrDevice deviceParameter null.");
            return;
        }
        int iH = BTDeviceMgrUtil.c().h();
        LogUtil.a("HwAddAwDevice", "addBrDevice enter btSwitchState: ", Integer.valueOf(iH));
        if (iH == 1) {
            mko.d(1, 3, deviceParameter);
        } else if (iH != 3) {
            LogUtil.a("HwAddAwDevice", "switch other status");
        } else {
            deviceParameter.setMac("AndroidWear");
            mkm.d().b(deviceParameter);
        }
    }
}
