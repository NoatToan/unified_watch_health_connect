package defpackage;

import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HEXUtils;

/* JADX INFO: loaded from: classes11.dex */
public class myn {
    public static DeviceCommand c(long j, long j2, boolean z) {
        LogUtil.a("HwBasicDataCommandUtil", "getHeartRateRaise enter.supportDownRate: ", Boolean.valueOf(z));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(30);
        byte[] bArrE = new cqj().j(1, (int) j).j(2, (int) j2).g(13, 1 ^ (z ? 1 : 0)).e();
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        return deviceCommand;
    }

    public static DeviceCommand c(long j, long j2) {
        LogUtil.a("HwBasicDataCommandUtil", "getBloodOxygenDownRemindCount enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        if (j >= j2) {
            LogUtil.j("HwBasicDataCommandUtil", "getBloodOxygenDownRemindCount time is error");
            return deviceCommand;
        }
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(38);
        StringBuilder sb = new StringBuilder(16);
        StringBuilder sb2 = new StringBuilder(16);
        sb.append(HEXUtils.b(1));
        sb.append(HEXUtils.b(4));
        sb.append(HEXUtils.d(j));
        sb2.append(HEXUtils.b(2));
        sb2.append(HEXUtils.b(4));
        sb2.append(HEXUtils.d(j2));
        byte[] bArrA = HEXUtils.a(sb.toString() + sb2.toString());
        deviceCommand.setDataLen(bArrA.length);
        deviceCommand.setDataContent(bArrA);
        LogUtil.a("HwBasicDataCommandUtil", "getBloodOxygenDownRemindCount dataInfos: ", HEXUtils.a(bArrA));
        return deviceCommand;
    }

    public static DeviceCommand c(int i, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicDataCommandUtil", "getBloodOxygenDownRemindDetail enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(39);
        byte[] bArrE = new cqj().i(1, i).e();
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        cpl.d("HwBasicDataCommandUtil", bArrE, "getBloodOxygenDownRemindDetail dataInfos: ");
        return deviceCommand;
    }
}
