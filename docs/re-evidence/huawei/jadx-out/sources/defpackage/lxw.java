package defpackage;

import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.datatype.RunPaceZoneConfig;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwcommonmodel.fitnessdatatype.MotionGoal;
import com.huawei.hwcommonmodel.fitnessdatatype.StudentHeartRateZoneMgr;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lxw {
    public static void b(List<MotionGoal> list) {
        LogUtil.a("FitnessSendCommandUtil", "sendSetMotionGoalCmd enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(1);
        byte[] bArrA = lxp.a(list);
        deviceCommand.setDataLen(bArrA.length);
        deviceCommand.setDataContent(bArrA);
        lvb.e().c(deviceCommand);
    }

    private static boolean e(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            LogUtil.a("FitnessSendCommandUtil", "isNeedEncrypt Encrypt type:", Integer.valueOf(deviceInfo.getEncryptType()));
            return deviceInfo.getEncryptType() == 1;
        }
        LogUtil.j("FitnessSendCommandUtil", "deviceInfo is null");
        return false;
    }

    public static void e(UserInfomation userInfomation, DeviceInfo deviceInfo) {
        LogUtil.a("FitnessSendCommandUtil", "sendSetUserInfoCmd enter");
        if (deviceInfo == null || userInfomation == null) {
            LogUtil.j("FitnessSendCommandUtil", "sendSetUserInfoCmd params error");
        } else if (lxc.c() && lxc.a(deviceInfo.getDeviceIdentify())) {
            LogUtil.a("FitnessSendCommandUtil", "sendSetUserInfoCmd pair mode is family.");
        } else {
            c(userInfomation, deviceInfo);
        }
    }

    public static void c(UserInfomation userInfomation, DeviceInfo deviceInfo) {
        LogUtil.a("FitnessSendCommandUtil", "sendSetUserInfoCommandDetail enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setCommandID(2);
        if (e(deviceInfo)) {
            LogUtil.a("FitnessSendCommandUtil", "sendSetUserInfoCommandDetail need encrypt enter");
            deviceCommand.setNeedEncrypt(true);
        } else {
            deviceCommand.setNeedEncrypt(false);
        }
        deviceCommand.setServiceID(7);
        byte[] bArrE = lxp.e(userInfomation, deviceInfo);
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        lvb.e().c(deviceCommand);
    }

    public static void b(DeviceInfo deviceInfo) {
        LogUtil.a("FitnessSendCommandUtil", "queryStudentInfoCommand enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(2);
        if (e(deviceInfo)) {
            LogUtil.a("FitnessSendCommandUtil", "queryStudentInfoCommand need encrypt enter");
            deviceCommand.setNeedEncrypt(true);
        } else {
            deviceCommand.setNeedEncrypt(false);
        }
        byte[] bArrC = lxp.c();
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        lvb.e().c(deviceCommand);
    }

    public static void c(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("DEVMGR_FitnessSendCommandUtil", "sendGetTodayTotalCmd enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(3);
        byte[] bArrD = lxp.d();
        deviceCommand.setDataLen(bArrD.length);
        deviceCommand.setDataContent(bArrD);
        deviceCommand.setNeedAck(true);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        mik.b("FitnessSendCommandUtil", deviceCommand.getServiceID(), deviceCommand.getCommandID());
        lvb.e().c(deviceCommand);
    }

    public static void e(long j, long j2, DeviceInfo deviceInfo) {
        LogUtil.a("FitnessSendCommandUtil", "sendGetHealthDataByFrameCountCmd enter start:", Long.valueOf(j), " end:", Long.valueOf(j2));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(4);
        byte[] bArrB = lxp.b(j, j2);
        deviceCommand.setDataLen(bArrB.length);
        deviceCommand.setDataContent(bArrB);
        deviceCommand.setNeedAck(true);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        lvb.e().c(deviceCommand);
    }

    public static void a(int i, DeviceInfo deviceInfo) {
        LogUtil.a("FitnessSendCommandUtil", "sendGetHealthDataByFrameCompressedCmd enter index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(5);
        byte[] bArrE = lxp.e(i);
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setNeedAck(true);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        lvb.e().c(deviceCommand);
    }

    public static void d(int i, DeviceInfo deviceInfo) {
        LogUtil.a("FitnessSendCommandUtil", "sendGetHealthDataByFrameCmd enter index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(8);
        byte[] bArrA = lxp.a(i, i);
        deviceCommand.setDataLen(bArrA.length);
        deviceCommand.setDataContent(bArrA);
        deviceCommand.setNeedAck(true);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        lvb.e().c(deviceCommand);
    }

    public static void b(long j, long j2) {
        ReleaseLogUtil.d("DEVMGR_FitnessSendCommandUtil", "sendGetSampleFrameCountCmd enter startTime:", Long.valueOf(j), ", endTime:", Long.valueOf(j2));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(10);
        byte[] bArrD = lxp.d(j, j2);
        deviceCommand.setDataLen(bArrD.length);
        deviceCommand.setDataContent(bArrD);
        deviceCommand.setNeedAck(true);
        lvb.e().c(deviceCommand);
    }

    public static void c(int i, DeviceInfo deviceInfo) {
        LogUtil.a("FitnessSendCommandUtil", "sendGetSampleFrameCmd enter index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(11);
        byte[] bArrB = lxp.b(i);
        deviceCommand.setDataLen(bArrB.length);
        deviceCommand.setDataContent(bArrB);
        deviceCommand.setNeedAck(true);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        lvb.e().c(deviceCommand);
    }

    public static void a(long j, long j2) {
        LogUtil.a("FitnessSendCommandUtil", "sendGetStatusFrameCountCmd enter start:", Long.valueOf(j), " end:", Long.valueOf(j2));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(12);
        byte[] bArrE = lxp.e(j, j2);
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setNeedAck(true);
        lvb.e().c(deviceCommand);
    }

    public static void e(int i, DeviceInfo deviceInfo) {
        LogUtil.a("FitnessSendCommandUtil", "sendGetStatusFrameCmd enter index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(13);
        byte[] bArrC = lxp.c(i);
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setNeedAck(true);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        lvb.e().c(deviceCommand);
    }

    public static void e(List<lyg> list) {
        LogUtil.a("FitnessSendCommandUtil", "sendSetDeviceReportThreshold thresholdList: ", list);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(14);
        byte[] bArrC = lxp.c(list);
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        lvb.e().c(deviceCommand);
    }

    public static void d(boolean z) {
        LogUtil.a("FitnessSendCommandUtil", "sendSetDeviceCouldSummaryEnable enter isEnable:", Boolean.valueOf(z));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(16);
        byte[] bArrC = eeq.c(eeq.d(1) + eeq.d(1) + eeq.d(z ? 1 : 0));
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        lvb.e().c(deviceCommand);
    }

    public static void b(HeartZoneConf heartZoneConf, StudentHeartRateZoneMgr studentHeartRateZoneMgr, boolean z) {
        int classifyMethod;
        LogUtil.a("FitnessSendCommandUtil", "sendSetHeartZoneConfigCmd enter ", heartZoneConf);
        if (gcn.c().sentHeartZoneSplicingMessages()) {
            return;
        }
        DeviceInfo deviceInfoC = mgg.c("FitnessSendCommandUtil");
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceInfoC == null) {
            LogUtil.j("FitnessSendCommandUtil", "sendSetHeartZoneConfigCmd deviceInfo is null.");
            return;
        }
        if (heartZoneConf != null && heartZoneConf.getClassifyMethod() == 3) {
            heartZoneConf.setClassifyMethod(0);
        }
        if (deviceCapabilityC != null && deviceCapabilityC.getIsSupportHrrHeartRateCapability()) {
            c(heartZoneConf, studentHeartRateZoneMgr, z, deviceInfoC);
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(19);
        if (deviceInfoC.getProductType() == 20 || deviceInfoC.getProductType() == 21) {
            classifyMethod = heartZoneConf.getClassifyMethod();
            LogUtil.a("FitnessSendCommandUtil", "sendSetHeartZoneConfigCmd classifyMethod: ", Integer.valueOf(classifyMethod));
        } else {
            classifyMethod = 0;
        }
        byte[] bArrD = lxp.d(heartZoneConf, classifyMethod, false);
        deviceCommand.setDataLen(bArrD.length);
        deviceCommand.setDataContent(bArrD);
        deviceCommand.setmIdentify(deviceInfoC.getDeviceIdentify());
        LogUtil.a("FitnessSendCommandUtil", "sendSetHeartZoneConfigCmd deviceCommand: ", deviceCommand.toString());
        lvb.e().c(deviceCommand);
    }

    private static void c(HeartZoneConf heartZoneConf, StudentHeartRateZoneMgr studentHeartRateZoneMgr, boolean z, DeviceInfo deviceInfo) {
        byte[] bArrD;
        LogUtil.a("FitnessSendCommandUtil", "sendSetMaxAndReserveHeartZoneConfigCmd enter ", heartZoneConf);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(33);
        if (z) {
            bArrD = lxp.b(studentHeartRateZoneMgr.getStudentHeartRateThresholdData());
        } else {
            bArrD = lxp.d(heartZoneConf, 0, true);
        }
        deviceCommand.setDataLen(bArrD.length);
        deviceCommand.setDataContent(bArrD);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("FitnessSendCommandUtil", "sendSetMaxAndReserveHeartZoneConfigCmd deviceCommand: ", deviceCommand.toString());
        lvb.e().c(deviceCommand);
    }

    public static void d(DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(33);
        byte[] bArrE = lxp.e();
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        LogUtil.a("FitnessSendCommandUtil", "queryHeartZoneConfigCmd deviceCommand: ", deviceCommand.toString());
        lvb.e().c(deviceCommand);
    }

    public static void c(RunPaceZoneConfig runPaceZoneConfig) {
        LogUtil.a("FitnessSendCommandUtil", "sendRunPaceConfigCommand enter ", runPaceZoneConfig);
        if (mgg.c("FitnessSendCommandUtil") == null) {
            LogUtil.j("FitnessSendCommandUtil", "sendSetHeartZoneConfigCmd deviceInfo is null.");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(40);
        byte[] bArrE = lxp.e(runPaceZoneConfig);
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        LogUtil.a("FitnessSendCommandUtil", "sendRunPaceConfigCommand deviceCommand: ", deviceCommand.toString());
        lvb.e().c(deviceCommand);
    }

    public static void h(int i, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommandB = mif.b(i, deviceInfo);
        LogUtil.a("FitnessSendCommandUtil", "setSleepBreatheSwitch openOrClose: ", Integer.valueOf(i));
        lvb.e().c(deviceCommandB);
    }

    public static void d(int i) {
        ReleaseLogUtil.d("DEVMGR_FitnessSendCommandUtil", "sendSetCoreSleepEnableCmd enabled:", Integer.valueOf(i));
        byte[] bArrD = lxp.d(i);
        LogUtil.a("FitnessSendCommandUtil", "sendSetCoreSleepEnableCmd dataInfos :", Arrays.toString(bArrD));
        mhs.a().sendSetSwitchSettingCmd(bArrD, "", 7, 22);
    }

    public static void e(int i) {
        ReleaseLogUtil.d("DEVMGR_FitnessSendCommandUtil", "sendSetHeartRateEnableCmd enabled:", Integer.valueOf(i));
        byte[] bArrJ = lxp.j(i);
        LogUtil.a("FitnessSendCommandUtil", "sendSetHeartRateEnableCmd dataInfos :", Arrays.toString(bArrJ));
        mhs.a().sendSetSwitchSettingCmd(bArrJ, "", 7, 23);
    }

    public static void b(int i, Map<Integer, String> map, DeviceInfo deviceInfo) {
        if (map == null || map.size() > 1) {
            LogUtil.j("FitnessSendCommandUtil", "sendSleepDeviceData parameter is error.");
            return;
        }
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        String value = "";
        while (it.hasNext()) {
            value = it.next().getValue();
        }
        if (TextUtils.isEmpty(value)) {
            LogUtil.j("FitnessSendCommandUtil", "sendSleepDeviceData parameter value is null");
            return;
        }
        if (i == 24) {
            c(Integer.parseInt(value));
        } else if (i != 25) {
            LogUtil.j("FitnessSendCommandUtil", "sendSleepDeviceData enter other, commandId is :", Integer.valueOf(i));
        } else {
            j(Integer.parseInt(value), deviceInfo);
        }
    }

    public static void c(int i) {
        LogUtil.a("FitnessSendCommandUtil", "sendSleepStateCmd enabled:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(24);
        byte[] bArrA = lxp.a(i);
        deviceCommand.setDataLen(bArrA.length);
        deviceCommand.setDataContent(bArrA);
        LogUtil.a("FitnessSendCommandUtil", "sendSleepStateCmd dataInfos :", Arrays.toString(bArrA));
        lvb.e().c(deviceCommand);
    }

    public static void a(int i) {
        ReleaseLogUtil.d("DEVMGR_FitnessSendCommandUtil", "sendSetContinueMeasureHeartRateEnableCmd status:", Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(16);
        sb.append(eeq.d(1));
        sb.append(eeq.d(1));
        sb.append(eeq.d(i));
        byte[] bArrC = eeq.c(sb.toString());
        LogUtil.a("FitnessSendCommandUtil", "sendSetContinueMeasureHeartRateEnableCmd dataInfos :", Arrays.toString(bArrC));
        mhs.a().sendSetSwitchSettingCmd(bArrC, "", 7, 28);
    }

    public static void c(int i, int i2) {
        ReleaseLogUtil.d("DEVMGR_FitnessSendCommandUtil", "sendHeartRateRemindCmd enable:", Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(16);
        StringBuilder sb2 = new StringBuilder(16);
        sb.append(eeq.d(1));
        sb.append(eeq.d(1));
        sb.append(eeq.d(i));
        if (i == 1) {
            sb2.append(eeq.d(2));
            sb2.append(eeq.d(1));
            sb2.append(eeq.d(i2));
        }
        byte[] bArrC = eeq.c(sb.toString() + sb2.toString());
        LogUtil.a("FitnessSendCommandUtil", "sendHeartRateRemindCmd dataInfos:", Arrays.toString(bArrC));
        mhs.a().sendSetSwitchSettingCmd(bArrC, "", 7, 29);
    }

    public static void a(int i, int i2) {
        ReleaseLogUtil.d("DEVMGR_FitnessSendCommandUtil", "sendHeartRateRemindCmdDown enable:", Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(16);
        StringBuilder sb2 = new StringBuilder(16);
        sb.append(eeq.d(1));
        sb.append(eeq.d(1));
        sb.append(eeq.d(i));
        if (i == 1) {
            sb2.append(eeq.d(2));
            sb2.append(eeq.d(1));
            sb2.append(eeq.d(i2));
        }
        byte[] bArrC = eeq.c(sb.toString() + sb2.toString());
        LogUtil.a("FitnessSendCommandUtil", "sendHeartRateRemindCommandDown dataInfos:", Arrays.toString(bArrC));
        mhs.a().sendSetSwitchSettingCmd(bArrC, "", 7, 34);
    }

    public static void b(int i) {
        ReleaseLogUtil.d("DEVMGR_FitnessSendCommandUtil", "sendCycleBloodOxygenEnableCmd status:", Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(16);
        sb.append(eeq.d(1));
        sb.append(eeq.d(1));
        sb.append(eeq.d(i));
        byte[] bArrC = eeq.c(sb.toString());
        LogUtil.a("FitnessSendCommandUtil", "sendCycleBloodOxygenEnableCommand dataInfos :", eeq.e(bArrC));
        mhs.a().sendSetSwitchSettingCmd(bArrC, "", 7, 36);
    }

    public static void b(int i, int i2) {
        ReleaseLogUtil.d("DEVMGR_FitnessSendCommandUtil", "sendBloodOxygenDownRemindCmd enable:", Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(16);
        StringBuilder sb2 = new StringBuilder(16);
        sb.append(eeq.d(1));
        sb.append(eeq.d(1));
        sb.append(eeq.d(i));
        if (i == 1) {
            sb2.append(eeq.d(2));
            sb2.append(eeq.d(1));
            sb2.append(eeq.d(i2));
        }
        byte[] bArrC = eeq.c(sb.toString() + sb2.toString());
        LogUtil.a("FitnessSendCommandUtil", "sendBloodOxygenDownRemindCommand dataInfos:", eeq.e(bArrC));
        mhs.a().sendSetSwitchSettingCmd(bArrC, "", 7, 37);
    }

    public static void a(DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(21);
        byte[] bArrA = lxp.a();
        deviceCommand.setDataLen(bArrA.length);
        deviceCommand.setDataContent(bArrA);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        lvb.e().c(deviceCommand);
    }

    public static void e(int i, UserInfomation userInfomation, int i2) {
        LogUtil.a("FitnessSendCommandUtil", "sendV0SetUserInfoFirstCmd enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(i);
        byte[] bArrD = lxp.d(userInfomation, i2);
        deviceCommand.setDataLen(bArrD.length);
        deviceCommand.setDataContent(bArrD);
        lvb.e().c(deviceCommand);
    }

    public static void i(int i, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(26);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(3);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put(eeq.c(eeq.d(i)));
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        lvb.e().c(deviceCommand);
    }

    public static void j(int i, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(25);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(3);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put(eeq.c(eeq.d(i)));
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        lvb.e().c(deviceCommand);
    }

    public static void d(long j, long j2, int i) {
        LogUtil.a("FitnessSendCommandUtil", "sendGetDesFrameCountCmd enter startTime:", Long.valueOf(j), " endTime:", Long.valueOf(j2));
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
        lvb.e().c(deviceCommand);
    }

    public static void b(int i, DeviceInfo deviceInfo) {
        LogUtil.a("FitnessSendCommandUtil", "sendGetDesFrameCmd enter index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(32);
        byte[] bArrE = new cqj().i(1, i).e();
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setNeedAck(true);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        lvb.e().c(deviceCommand);
    }

    public static void b(int i, int i2, int i3) {
        LogUtil.a("FitnessSendCommandUtil", "sendTempSwitchInfo enter");
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(eeq.d(1)).append(eeq.d(1)).append(eeq.d(i));
        stringBuffer.append(eeq.d(2)).append(eeq.d(1)).append(eeq.d(i2));
        String strE = eeq.e(i3);
        if (i3 != 0) {
            stringBuffer.append(eeq.d(3)).append(eeq.d(strE.length() / 2)).append(strE);
        }
        mhs.a().sendSetSwitchSettingCmd(eeq.c(stringBuffer.toString()), "", 7, 42);
    }
}
