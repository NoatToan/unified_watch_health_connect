package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class xaf {
    private static boolean c(DeviceInfo deviceInfo, xcp xcpVar) {
        String strB = HEXUtils.b(deviceInfo.getUuid());
        String uniqueId = xcpVar.getUniqueId();
        StringBuilder sb = new StringBuilder();
        sb.append(strB);
        sb.append("#ANDROID21");
        return uniqueId.equalsIgnoreCase(sb.toString()) || xcpVar.getUniqueId().equals(strB);
    }

    public static boolean c(xcp xcpVar) {
        Iterator<DeviceInfo> it = wzz.d().iterator();
        while (it.hasNext()) {
            if (c(it.next(), xcpVar)) {
                LogUtil.a("WX_DeviceUtils", "device is exist at local :", xcpVar.getDeviceName());
                return true;
            }
        }
        return false;
    }

    public static xcp e(DeviceInfo deviceInfo, List<xcp> list) {
        for (xcp xcpVar : list) {
            if (c(deviceInfo, xcpVar)) {
                LogUtil.a("WX_DeviceUtils", "Contain device = ", deviceInfo.getDeviceName());
                return xcpVar;
            }
        }
        return null;
    }

    public static boolean b(DeviceInfo deviceInfo, com.huawei.hwcloudmodel.model.userprofile.DeviceInfo deviceInfo2) {
        if (deviceInfo == null || deviceInfo2 == null) {
            return false;
        }
        if (!deviceInfo2.getUniqueId().equalsIgnoreCase(HEXUtils.b(deviceInfo.getUuid()) + "#ANDROID21")) {
            return false;
        }
        if (TextUtils.isEmpty(deviceInfo.getHiLinkDeviceId()) || TextUtils.isEmpty(deviceInfo2.getProdId()) || deviceInfo.getHiLinkDeviceId().equalsIgnoreCase(deviceInfo2.getProdId())) {
            return true;
        }
        LogUtil.j("WX_DeviceUtils", "prodid not same");
        return false;
    }

    public static DeviceInfo b(String str) {
        LogUtil.d("WX_DeviceUtils", "findDeviceAtLocal identify  = ", CommonUtil.n(str));
        for (DeviceInfo deviceInfo : wzz.d()) {
            if (deviceInfo.getDeviceIdentify().equalsIgnoreCase(str)) {
                LogUtil.d("WX_DeviceUtils", "findDeviceAtLocal return  = ", deviceInfo.getDeviceName());
                return deviceInfo;
            }
        }
        LogUtil.e("WX_DeviceUtils", "findDeviceAtLocal failed , return empty");
        return new DeviceInfo();
    }
}
