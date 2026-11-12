package defpackage;

import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mxo {
    public static void e(int i, DeviceInfo deviceInfo) {
        mkf.e(BaseApplication.getContext()).sendDeviceData(mif.b(i, deviceInfo));
    }

    public static void b(DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(45);
        deviceCommand.setCommandID(2);
        String strD = eeq.d(1);
        String strB = eeq.b(1);
        String strD2 = eeq.d(1);
        StringBuilder sb = new StringBuilder(0);
        sb.append(strD2);
        sb.append(strB);
        sb.append(strD);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("BreathingSendCommandUtil", "setClearSleepBreatheCommand command data :", eeq.e(deviceCommand.getDataContent()));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }
}
