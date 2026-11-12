package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.outofprocess.mgr.device.ProfileAgent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.client.profile.ProfileClient;
import com.huawei.profile.profile.DeviceProfile;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class net {
    public static String e(String str, DeviceInfo deviceInfo) {
        DeviceProfile deviceProfile;
        Map<String, Object> profile;
        if (deviceInfo == null) {
            LogUtil.a("CloudDeviceUtil", "source tag: ", str, ", getCloudDeviceName device is null.");
            return "";
        }
        String deviceName = deviceInfo.getDeviceName();
        String strB = b(deviceInfo);
        LogUtil.a("CloudDeviceUtil", "source tag: ", str, ", getCloudDeviceName original deviceName: ", deviceInfo.getDeviceName());
        List<DeviceProfile> devicesById = ProfileAgent.PROFILE_AGENT.getClientAgent().getDevicesById(strB, false, Collections.singletonList(ProfileClient.DEFAULT_TRUST_DOMAIN));
        if (njy.e(devicesById) || (deviceProfile = devicesById.get(0)) == null || (profile = deviceProfile.getProfile()) == null || profile.isEmpty()) {
            return deviceName;
        }
        String str2 = (String) profile.get("deviceName");
        LogUtil.a("CloudDeviceUtil", "source tag: ", str, ", getCloudDeviceName localProfiles is not null, deviceName: ", str2);
        return str2;
    }

    public static String c(String str, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("CloudDeviceUtil", "source tag: ", str, ", getCloudDeviceNameFromSp deviceInfo null.");
            return "";
        }
        String deviceName = deviceInfo.getDeviceName();
        String strE = lua.e("cloud_device_name", b(deviceInfo), deviceName);
        LogUtil.a("CloudDeviceUtil", "source tag: ", str, ", getCloudDeviceNameFromSp deviceName: ", deviceName, "spName: ", strE);
        return TextUtils.isEmpty(strE) ? deviceName : strE;
    }

    public static void b(String str, String str2, String str3) {
        lua.f("cloud_device_name", str2, str3);
        LogUtil.a("CloudDeviceUtil", "source tag: ", str, ", setDeviceName success. deviceName: ", str3);
    }

    public static String b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_CloudDeviceUtil", "getDeviceId deviceInfo is null.");
            return "";
        }
        if (!TextUtils.isEmpty(deviceInfo.getDeviceUdid())) {
            return deviceInfo.getDeviceUdid();
        }
        return c(deviceInfo.getSecurityUuid());
    }

    private static String c(String str) {
        return str + "#ANDROID21";
    }
}
