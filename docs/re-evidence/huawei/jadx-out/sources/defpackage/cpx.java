package defpackage;

import android.text.TextUtils;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class cpx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[][] f31245c = {new int[]{1, 61}, new int[]{1, 62}, new int[]{1, 5}, new int[]{1, 50}, new int[]{1, 53}, new int[]{1, 63}, new int[]{1, 59}};

    public static boolean e() {
        return false;
    }

    public static boolean a(int i, int i2, String str, String str2) {
        if (e() || !"assistant_relationship".equalsIgnoreCase(c(str)) || b(str) != 2) {
            return false;
        }
        for (int[] iArr : f31245c) {
            if (i == iArr[0] && i2 == iArr[1]) {
                return false;
            }
        }
        LogUtil.e("ShieldAssistantDeviceUtil", "isShieldCommand serviceId: ", Integer.valueOf(i), " commandId: ", Integer.valueOf(i2), " tag: ", str2, cpl.a(str));
        return true;
    }

    private static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("ShieldAssistantDeviceUtil", "getUnderConnectState identify is empty");
            return 0;
        }
        for (UniteDevice uniteDevice : cju.d().getDeviceList().values()) {
            if (uniteDevice != null && uniteDevice.getDeviceInfo() != null && str.equals(uniteDevice.getDeviceInfo().getDeviceMac())) {
                return uniteDevice.getDeviceInfo().getDeviceConnectState();
            }
        }
        return 0;
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("ShieldAssistantDeviceUtil", "identify is empty");
            return null;
        }
        String deviceRelation = xgx.d().getDeviceRelation(str);
        if (TextUtils.isEmpty(deviceRelation)) {
            LogUtil.e("ShieldAssistantDeviceUtil", "getRelation failed relation is empty: ", cpl.a(str));
        }
        return deviceRelation;
    }
}
