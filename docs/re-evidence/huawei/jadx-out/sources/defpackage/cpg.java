package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.LogUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class cpg {
    public static Map<String, UniteDevice> c(Map<String, DeviceInfo> map, Map<String, ExternalDeviceCapability> map2) {
        HashMap map3 = new HashMap(16);
        if (map != null && !map.isEmpty() && map2 != null) {
            for (Map.Entry<String, DeviceInfo> entry : map.entrySet()) {
                String key = entry.getKey();
                DeviceInfo value = entry.getValue();
                UniteDevice uniteDevice = new UniteDevice();
                uniteDevice.setIdentify(key);
                uniteDevice.setDeviceInfo(value);
                uniteDevice.setCapability(map2.get(key));
                map3.put(key, uniteDevice);
            }
        }
        return map3;
    }

    public static UniteDevice b(String str, String str2) {
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setDeviceMac(str);
        deviceInfo.setDeviceName(str2);
        UniteDevice uniteDevice = new UniteDevice();
        uniteDevice.setIdentify(str);
        uniteDevice.setDeviceInfo(deviceInfo);
        return uniteDevice;
    }

    public static String d() {
        return UUID.randomUUID().toString().replace(Constants.LINK, "").toUpperCase(Locale.ROOT);
    }

    public static String a(String str, String str2) {
        LogUtil.b("EntityConversionUtil", "getDeviceUdid enter");
        if (str == null) {
            return str;
        }
        String str3 = str2 + str;
        if (!str.equals(str2)) {
            str = str3;
        }
        String strC = cqm.c(str);
        if (strC == null) {
            LogUtil.e("EntityConversionUtil", "shaDeviceId is null");
        }
        return strC;
    }

    public static String d(Integer num, Integer num2) {
        cmu cmuVar = new cmu();
        if (num != null) {
            cmuVar.a(num.intValue());
        }
        if (num2 != null) {
            cmuVar.e(num2.intValue());
        }
        return new Gson().toJson(cmuVar);
    }

    public static boolean b(DeviceInfo deviceInfo) {
        ExternalDeviceCapability externalDeviceCapabilityB;
        DeviceCapability compatibleCapacity;
        if (deviceInfo == null) {
            return false;
        }
        if (deviceInfo.getSportVersion() == 1) {
            return true;
        }
        return (deviceInfo.getSportVersion() == 0 || (externalDeviceCapabilityB = cnk.c().b(deviceInfo.getDeviceMac())) == null || (compatibleCapacity = externalDeviceCapabilityB.getCompatibleCapacity()) == null || !compatibleCapacity.isSupportSmartWatchVersionStatus()) ? false : true;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.contains(":") || str.length() <= 12) {
            return str.replace(":", "");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            String strB = cqv.b(messageDigest.digest());
            return strB.length() >= 24 ? strB.replace("/", SampleEvent.SEPARATOR) : strB;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
