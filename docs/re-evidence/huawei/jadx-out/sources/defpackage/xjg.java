package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes20.dex */
public class xjg {
    public static UniteDevice d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("CommonConfigUtil", "getUniteDevice identify is invalid.");
            return null;
        }
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setDeviceMac(str);
        UniteDevice uniteDevice = new UniteDevice();
        uniteDevice.setIdentify(str);
        uniteDevice.setDeviceInfo(deviceInfo);
        return uniteDevice;
    }
}
