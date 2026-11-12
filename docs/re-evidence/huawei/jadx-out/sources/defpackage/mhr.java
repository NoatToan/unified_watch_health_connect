package defpackage;

import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
class mhr {
    mhr() {
    }

    public static void e(boolean z, String str, int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("DEVMGR_SwitchSendCommandUtil", "sendSetSwitchStatusCmd serviceId = ", Integer.valueOf(i), ",commandId = ", Integer.valueOf(i2));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(i);
        deviceCommand.setCommandID(i2);
        if (!TextUtils.isEmpty(str)) {
            deviceCommand.setmIdentify(str);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(3);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 1);
        if (z) {
            byteBufferAllocate.put((byte) 1);
        } else {
            byteBufferAllocate.put((byte) 0);
        }
        if (iBaseResponseCallback != null) {
            luh.a(i2, iBaseResponseCallback);
        }
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        lvb.e().c(deviceCommand);
    }

    public static void c(byte[] bArr, String str, int i, int i2) {
        ReleaseLogUtil.d("DEVMGR_SwitchSendCommandUtil", "sendSetSwitchStatusCmd2 serviceId = ", Integer.valueOf(i), ",commandId = ", Integer.valueOf(i2));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(i);
        deviceCommand.setCommandID(i2);
        deviceCommand.setDataLen(bArr.length);
        deviceCommand.setDataContent(bArr);
        if (!TextUtils.isEmpty(str)) {
            deviceCommand.setmIdentify(str);
        }
        lvb.e().c(deviceCommand);
    }

    public static void a(int i, String str, String str2) {
        try {
            int i2 = Integer.parseInt(str);
            StringBuffer stringBuffer = new StringBuffer(16);
            stringBuffer.append(eeq.d(1) + eeq.d(4) + eeq.c(i)).append(eeq.d(2) + eeq.d(1) + eeq.d(i2));
            c(eeq.c(stringBuffer.toString()), str2, 1, 57);
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.a("DEVMGR_SwitchSendCommandUtil", "sendSettingSwitchCommand NumberFormatException");
        }
    }

    public static void d(String str, String str2, long j, String str3) {
        DeviceInfo deviceInfoD = mgg.d("SwitchSendCommandUtil");
        if (deviceInfoD == null || TextUtils.isEmpty(str3)) {
            ReleaseLogUtil.e("DEVMGR_SwitchSendCommandUtil", "sendSettingDeviceCommand deviceInfo is null or switchStatus isEmpty");
            return;
        }
        if (deviceInfoD.getDeviceConnectState() != 2) {
            ReleaseLogUtil.e("DEVMGR_SwitchSendCommandUtil", "sendSettingDeviceCommand device is not connected");
            return;
        }
        ReleaseLogUtil.d("DEVMGR_SwitchSendCommandUtil", "sendSettingDeviceCommand switchStatus = ", str3);
        eef eefVar = new eef();
        eefVar.setSrcPkgName(str);
        eefVar.setWearPkgName(str2);
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(j);
        eegVar.d(eeq.c(eeq.d(1) + eeq.d(str3.length()) + eeq.d("1".equals(str3) ? 1 : 0)));
        eegVar.b(1);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        ReleaseLogUtil.d("DEVMGR_SwitchSendCommandUtil", "sendSettingDeviceCommand sampleConfig = ", eefVar.toString());
        edc.e().sendSampleConfigCommand(deviceInfoD, eefVar, "SwitchSendCommandUtil");
    }
}
