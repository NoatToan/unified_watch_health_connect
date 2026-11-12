package defpackage;

import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HEXUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mps {
    public static DeviceCommand b(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("Step_HwBasicDataCommandUtil", "sendGetTodayTotalCmd enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(3);
        byte[] bArrE = mpc.e();
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        return deviceCommand;
    }

    public static DeviceCommand a(long j, long j2, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicDataCommandUtil", "sendGetHealthDataByFrameCountCmd enter start:", Long.valueOf(j), " end:", Long.valueOf(j2));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(4);
        byte[] bArrC = mpc.c(j, j2);
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setNeedAck(true);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        return deviceCommand;
    }

    public static DeviceCommand d(int i, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicDataCommandUtil", "sendGetHealthDataByFrameCompressedCmd enter index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(5);
        byte[] bArrA = mpc.a(i);
        deviceCommand.setDataLen(bArrA.length);
        deviceCommand.setDataContent(bArrA);
        deviceCommand.setNeedAck(true);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        return deviceCommand;
    }

    public static DeviceCommand a(int i, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicDataCommandUtil", "sendGetHealthDataByFrameCmd enter index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(8);
        byte[] bArrD = mpc.d(i, i);
        deviceCommand.setDataLen(bArrD.length);
        deviceCommand.setDataContent(bArrD);
        deviceCommand.setNeedAck(true);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        return deviceCommand;
    }

    public static DeviceCommand c(long j, long j2) {
        ReleaseLogUtil.d("Step_HwBasicDataCommandUtil", "sendGetSampleFrameCountCmd enter startTime:", Long.valueOf(j), ", endTime:", Long.valueOf(j2));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(10);
        byte[] bArrA = mpc.a(j, j2);
        deviceCommand.setDataLen(bArrA.length);
        deviceCommand.setDataContent(bArrA);
        deviceCommand.setNeedAck(true);
        return deviceCommand;
    }

    public static DeviceCommand b(int i, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicDataCommandUtil", "sendGetSampleFrameCmd enter index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(11);
        byte[] bArrB = mpc.b(i);
        deviceCommand.setDataLen(bArrB.length);
        deviceCommand.setDataContent(bArrB);
        deviceCommand.setNeedAck(true);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        return deviceCommand;
    }

    public static DeviceCommand e(long j, long j2) {
        LogUtil.a("HwBasicDataCommandUtil", "sendGetStatusFrameCountCmd enter start:", Long.valueOf(j), " end:", Long.valueOf(j2));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(12);
        byte[] bArrD = mpc.d(j, j2);
        deviceCommand.setDataLen(bArrD.length);
        deviceCommand.setDataContent(bArrD);
        deviceCommand.setNeedAck(true);
        return deviceCommand;
    }

    public static DeviceCommand e(int i, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicDataCommandUtil", "sendGetStatusFrameCmd enter index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(13);
        byte[] bArrC = mpc.c(i);
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setNeedAck(true);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        return deviceCommand;
    }

    public static DeviceCommand d(List<mhl> list) {
        LogUtil.a("HwBasicDataCommandUtil", "sendSetDeviceReportThreshold thresholdList: ", list);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(14);
        byte[] bArrE = mpc.e(list);
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        return deviceCommand;
    }

    public static DeviceCommand b() {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(15);
        byte[] bArrA = mpc.a();
        deviceCommand.setDataLen(bArrA.length);
        deviceCommand.setDataContent(bArrA);
        return deviceCommand;
    }

    public static DeviceCommand c(long j, long j2, int i) {
        LogUtil.a("HwBasicDataCommandUtil", "sendGetDesFrameCountCmd enter startTime:", Long.valueOf(j), " endTime:", Long.valueOf(j2));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(31);
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(HEXUtils.b(2)).append(HEXUtils.b(4)).append(HEXUtils.d(j));
        stringBuffer.append(HEXUtils.b(3)).append(HEXUtils.b(4)).append(HEXUtils.d(j2));
        stringBuffer.append(HEXUtils.b(4)).append(HEXUtils.b(1)).append(HEXUtils.b(i));
        deviceCommand.setDataLen(stringBuffer.length() / 2);
        deviceCommand.setDataContent(HEXUtils.a(stringBuffer.toString()));
        deviceCommand.setNeedAck(true);
        return deviceCommand;
    }

    public static DeviceCommand c(int i, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicDataCommandUtil", "sendGetDesFrameCmd enter index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(32);
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(HEXUtils.b(1)).append(HEXUtils.b(2)).append(HEXUtils.a(i));
        deviceCommand.setDataLen(stringBuffer.length() / 2);
        deviceCommand.setDataContent(HEXUtils.a(stringBuffer.toString()));
        deviceCommand.setNeedAck(true);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        return deviceCommand;
    }
}
