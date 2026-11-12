package defpackage;

import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class myh {
    public static void e(int i, int i2, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(32);
        deviceCommand.setCommandID(1);
        String strC = eeq.c(i);
        String str = eeq.d(3) + eeq.d(strC.length() / 2) + strC;
        String strC2 = eeq.c(i2);
        String str2 = eeq.d(4) + eeq.d(strC2.length() / 2) + strC2;
        String str3 = eeq.d(129) + eeq.d((str.length() / 2) + (str2.length() / 2)) + str + str2;
        deviceCommand.setDataLen(eeq.c(str3).length);
        deviceCommand.setDataContent(eeq.c(str3));
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("StressSendCommandUtil", "getStressRecordFrameListIndex deviceCommand:", eeq.d(deviceCommand.getServiceID()), eeq.d(deviceCommand.getCommandID()), eeq.e(deviceCommand.getDataContent()));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void b(int i, DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("BTSYNC_StressSendCommandUtil", "getStressRecordDetail index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(32);
        deviceCommand.setCommandID(2);
        String strD = eeq.d(129);
        String strB = eeq.b(4);
        String strD2 = eeq.d(2);
        String strE = eeq.e(i);
        String strB2 = eeq.b(strE.length() / 2);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD);
        sb.append(strB);
        sb.append(strD2);
        sb.append(strB2);
        sb.append(strE);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("StressSendCommandUtil", "getStressRecordDetail deviceCommand:", eeq.d(deviceCommand.getServiceID()), eeq.d(deviceCommand.getCommandID()), eeq.e(deviceCommand.getDataContent()));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void c(int i, int i2, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(32);
        deviceCommand.setCommandID(3);
        String strC = eeq.c(i);
        String str = eeq.d(3) + eeq.d(strC.length() / 2) + strC;
        String strC2 = eeq.c(i2);
        String str2 = eeq.d(4) + eeq.d(strC2.length() / 2) + strC2;
        String str3 = eeq.d(129) + eeq.d((str.length() / 2) + (str2.length() / 2)) + str + str2;
        deviceCommand.setDataLen(eeq.c(str3).length);
        deviceCommand.setDataContent(eeq.c(str3));
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("StressSendCommandUtil", "getRelaxRecordFrameListIndex deviceCommand:", eeq.d(deviceCommand.getServiceID()), eeq.d(deviceCommand.getCommandID()), eeq.e(deviceCommand.getDataContent()));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void a(int i, DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("BTSYNC_StressSendCommandUtil", "getRelaxRecordDetail index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(32);
        deviceCommand.setCommandID(4);
        String strD = eeq.d(129);
        String strB = eeq.b(4);
        String strD2 = eeq.d(2);
        String strE = eeq.e(i);
        String strB2 = eeq.b(strE.length() / 2);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD);
        sb.append(strB);
        sb.append(strD2);
        sb.append(strB2);
        sb.append(strE);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("StressSendCommandUtil", "getRelaxRecordDetail deviceCommand:", eeq.d(deviceCommand.getServiceID()), eeq.d(deviceCommand.getCommandID()), eeq.e(deviceCommand.getDataContent()));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }
}
