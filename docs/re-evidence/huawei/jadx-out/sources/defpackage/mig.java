package defpackage;

import android.content.ContentValues;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class mig {
    public static boolean d(DeviceInfo deviceInfo, DeviceInfo deviceInfo2) {
        if (deviceInfo != null && Objects.equals(deviceInfo.getClass(), deviceInfo2.getClass())) {
            return Objects.equals(deviceInfo.getDeviceIdentify(), deviceInfo2.getDeviceIdentify());
        }
        return false;
    }

    public static boolean c(DeviceInfo deviceInfo, DeviceInfo deviceInfo2) {
        return (d(deviceInfo, deviceInfo2) && Objects.equals(Integer.valueOf(deviceInfo.getDeviceConnectState()), Integer.valueOf(deviceInfo2.getDeviceConnectState())) && Objects.equals(Long.valueOf(deviceInfo.getLastConnectedTime()), Long.valueOf(deviceInfo2.getLastConnectedTime()))) ? false : true;
    }

    public static boolean b(ContentValues contentValues, ContentValues contentValues2) {
        if (contentValues == null) {
            return false;
        }
        return Objects.equals(contentValues.getAsString("uniqueId"), contentValues2.getAsString("uniqueId"));
    }
}
