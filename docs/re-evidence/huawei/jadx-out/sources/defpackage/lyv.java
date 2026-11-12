package defpackage;

import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.fitnessdatatype.MotionGoal;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lyv {
    private static boolean e() {
        return true;
    }

    public static void a(List<MotionGoal> list) {
        LogUtil.a("FitnessSendCommandAw70Util", "sendSetMotionGoalCommand enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(1);
        byte[] bArrA = lxp.a(list);
        deviceCommand.setDataLen(bArrA.length);
        deviceCommand.setDataContent(bArrA);
        deviceCommand.setmIdentify(a());
        lvb.e().c(deviceCommand);
    }

    public static void c(UserInfomation userInfomation) {
        if (mgi.d("FitnessSendCommandAw70Util") == null) {
            LogUtil.j("FitnessSendCommandAw70Util", "sendSetUserInfoCommand is not aw70");
            return;
        }
        LogUtil.a("FitnessSendCommandAw70Util", "sendSetUserInfoCommand enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setCommandID(2);
        if (e()) {
            LogUtil.a("FitnessSendCommandAw70Util", "sendSetUserInfoCommand need encrypt enter");
            deviceCommand.setNeedEncrypt(true);
        } else {
            deviceCommand.setNeedEncrypt(false);
        }
        deviceCommand.setServiceID(7);
        byte[] bArrE = lxp.e(userInfomation, mgi.c("FitnessSendCommandAw70Util"));
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setmIdentify(a());
        lvb.e().c(deviceCommand);
    }

    public static void b() {
        LogUtil.a("FitnessSendCommandAw70Util", "sendGetTodayTotalCommand enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(3);
        byte[] bArrD = lxp.d();
        deviceCommand.setDataLen(bArrD.length);
        deviceCommand.setDataContent(bArrD);
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(a());
        lvb.e().c(deviceCommand);
    }

    public static void d(long j, long j2) {
        LogUtil.a("FitnessSendCommandAw70Util", "sendGetSampleFrameCountCommand enter start:", Long.valueOf(j), " end:", Long.valueOf(j2));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(10);
        byte[] bArrD = lxp.d(j, j2);
        deviceCommand.setDataLen(bArrD.length);
        deviceCommand.setDataContent(bArrD);
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(a());
        lvb.e().c(deviceCommand);
    }

    public static void d(int i) {
        LogUtil.a("FitnessSendCommandAw70Util", "sendGetSampleFrameCommand enter index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(11);
        byte[] bArrB = lxp.b(i);
        deviceCommand.setDataLen(bArrB.length);
        deviceCommand.setDataContent(bArrB);
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(a());
        lvb.e().c(deviceCommand);
    }

    public static void a(long j, long j2) {
        LogUtil.a("FitnessSendCommandAw70Util", "sendGetStatusFrameCountCommand enter start:", Long.valueOf(j), " end:", Long.valueOf(j2));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(12);
        byte[] bArrE = lxp.e(j, j2);
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(a());
        lvb.e().c(deviceCommand);
    }

    public static void a(int i) {
        LogUtil.a("FitnessSendCommandAw70Util", "sendGetStatusFrameCommand enter index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(13);
        byte[] bArrC = lxp.c(i);
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(a());
        lvb.e().c(deviceCommand);
    }

    public static void b(List<lyg> list) {
        LogUtil.d("FitnessSendCommandAw70Util", " sendSetDeviceReportThreshold deviceReportThresholdList:", list);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(14);
        byte[] bArrC = lxp.c(list);
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setmIdentify(a());
        lvb.e().c(deviceCommand);
    }

    public static void d() {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(21);
        byte[] bArrA = lxp.a();
        deviceCommand.setDataLen(bArrA.length);
        deviceCommand.setDataContent(bArrA);
        deviceCommand.setmIdentify(a());
        lvb.e().c(deviceCommand);
    }

    public static void b(long j, long j2, int i) {
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
        deviceCommand.setmIdentify(a());
        lvb.e().c(deviceCommand);
    }

    public static void c(int i) {
        LogUtil.a("FitnessSendCommandAw70Util", "sendSamplePointDataCommand enter index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(32);
        byte[] bArrE = new cqj().i(1, i).e();
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(a());
        lvb.e().c(deviceCommand);
    }

    public static String a() {
        DeviceInfo deviceInfoD = mgi.d("FitnessSendCommandAw70Util");
        if (deviceInfoD != null) {
            return deviceInfoD.getDeviceIdentify();
        }
        return "";
    }
}
