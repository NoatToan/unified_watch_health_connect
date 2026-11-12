package defpackage;

import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mif {
    public static DeviceCommand b(int i, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(45);
        deviceCommand.setCommandID(1);
        String strD = eeq.d(i);
        String strB = eeq.b(1);
        String strD2 = eeq.d(1);
        StringBuilder sb = new StringBuilder(0);
        sb.append(strD2);
        sb.append(strB);
        sb.append(strD);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        LogUtil.a("BreatheSendCommandGenerator", "setSleepBreatheSwitch command data :", eeq.e(deviceCommand.getDataContent()));
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        return deviceCommand;
    }
}
