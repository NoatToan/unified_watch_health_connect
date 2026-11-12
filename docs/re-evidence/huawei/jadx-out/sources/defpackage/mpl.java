package defpackage;

import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mpl {
    public static void a() {
        LogUtil.a("FitnessSendCommandAw70Util", "sendGetTodayTotalCommand enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(3);
        byte[] bArrE = mpc.e();
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(e());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void a(long j, long j2) {
        LogUtil.a("FitnessSendCommandAw70Util", "sendGetSampleFrameCountCommand enter start:", Long.valueOf(j), " end:", Long.valueOf(j2));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(10);
        byte[] bArrA = mpc.a(j, j2);
        deviceCommand.setDataLen(bArrA.length);
        deviceCommand.setDataContent(bArrA);
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(e());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void b(int i) {
        LogUtil.a("FitnessSendCommandAw70Util", "sendGetSampleFrameCommand enter index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(11);
        byte[] bArrB = mpc.b(i);
        deviceCommand.setDataLen(bArrB.length);
        deviceCommand.setDataContent(bArrB);
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(e());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void b(long j, long j2) {
        LogUtil.a("FitnessSendCommandAw70Util", "sendGetStatusFrameCountCommand enter start:", Long.valueOf(j), " end:", Long.valueOf(j2));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(12);
        byte[] bArrD = mpc.d(j, j2);
        deviceCommand.setDataLen(bArrD.length);
        deviceCommand.setDataContent(bArrD);
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(e());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void d(int i) {
        LogUtil.a("FitnessSendCommandAw70Util", "sendGetStatusFrameCommand enter index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(13);
        byte[] bArrC = mpc.c(i);
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(e());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void d(List<mhl> list) {
        LogUtil.d("FitnessSendCommandAw70Util", " sendSetDeviceReportThreshold deviceReportThresholdList:", list);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(14);
        byte[] bArrE = mpc.e(list);
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setmIdentify(e());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void e(long j, long j2, int i) {
        LogUtil.a("FitnessSendCommandAw70Util", "sendDataFrameCommand enter start:", Long.valueOf(j), " end:", Long.valueOf(j2));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(31);
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(eeq.d(2)).append(eeq.d(4)).append(eeq.c(j));
        stringBuffer.append(eeq.d(3)).append(eeq.d(4)).append(eeq.c(j2));
        stringBuffer.append(eeq.d(4)).append(eeq.d(1)).append(eeq.d(i));
        deviceCommand.setDataLen(stringBuffer.length() / 2);
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(e());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void c(int i) {
        LogUtil.a("FitnessSendCommandAw70Util", "sendSamplePointDataCommand enter index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(32);
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(eeq.d(1)).append(eeq.d(2)).append(eeq.e(i));
        deviceCommand.setDataLen(stringBuffer.length() / 2);
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(e());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static String e() {
        DeviceInfo deviceInfoB = mpz.b("FitnessSendCommandAw70Util");
        if (deviceInfoB != null) {
            return deviceInfoB.getDeviceIdentify();
        }
        return "";
    }
}
