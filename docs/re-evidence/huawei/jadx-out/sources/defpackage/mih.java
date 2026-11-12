package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mih {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f41708b = false;

    public static boolean e() {
        return e(mgg.d("CommandDispatchController"));
    }

    public static boolean e(DeviceInfo deviceInfo) {
        int i;
        DeviceCapability deviceCapabilityC;
        if (deviceInfo == null) {
            LogUtil.a("CommandDispatchController", "isWalletOpenCard:", "deviceInfo == null");
            deviceCapabilityC = eej.c();
            i = 1;
        } else {
            DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
            i = 2;
            if (deviceCapabilityA == null) {
                Map<String, DeviceCapability> mapD = lvb.e().d(1, deviceInfo.getDeviceIdentify(), "CommandDispatchController");
                if (mapD != null && !mapD.isEmpty()) {
                    deviceCapabilityA = mapD.get(deviceInfo.getDeviceIdentify());
                    i = 3;
                }
                if (deviceCapabilityA != null) {
                    eej.a(deviceInfo.getDeviceIdentify(), deviceCapabilityA);
                }
            }
            deviceCapabilityC = deviceCapabilityA;
        }
        if (deviceCapabilityC == null) {
            if (CommonUtil.ap() && !f41708b) {
                f41708b = true;
                xjt.af("isWalletOpenCard deviceCapability is null, riskState: " + i);
            }
            LogUtil.j("CommandDispatchController", "isWalletOpenCard deviceCapability == null");
            return false;
        }
        LogUtil.a("CommandDispatchController", "isWalletOpenCard:", Boolean.valueOf(deviceCapabilityC.isSupportWalletOpenCard()), " isSupportAppId:", Boolean.valueOf(deviceCapabilityC.isSupportAppId()));
        return deviceCapabilityC.isSupportWalletOpenCard() && deviceCapabilityC.isSupportAppId();
    }

    public static boolean b(byte[] bArr) {
        return bArr != null && bArr.length >= 6 && bArr[2] == 123 && bArr[5] == 3;
    }

    public static boolean a(byte[] bArr) {
        if (bArr == null || bArr.length < 6 || bArr[2] != 123) {
            return false;
        }
        byte b2 = bArr[5];
        return b2 == 4 || b2 == 5;
    }

    public static boolean d(byte[] bArr) {
        if (bArr == null || bArr.length <= 1) {
            LogUtil.j("CommandDispatchController", "data illegal");
            return false;
        }
        byte b2 = bArr[1];
        return b2 >= 1 && b2 <= 9;
    }

    public static boolean a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 1) {
            LogUtil.j("CommandDispatchController", "data illegal");
            return false;
        }
        byte b2 = bArr[1];
        return b2 == 1 || b2 == 5 || b2 == 8 || b2 == 9 || (i == 1 && b2 == 2);
    }
}
