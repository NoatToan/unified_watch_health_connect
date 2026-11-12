package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.profile.profile.DeviceProfile;
import com.huawei.profile.profile.ServiceCharacteristicProfile;
import com.huawei.profile.profile.ServiceProfile;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class eak {
    public static DeviceProfile e(DeviceInfo deviceInfo) {
        HashMap map = new HashMap(10);
        if (!a(map, deviceInfo)) {
            LogUtil.j("WeightIntellLifeUtils", "can not build entities !");
            return null;
        }
        DeviceProfile deviceProfile = new DeviceProfile();
        deviceProfile.setId(deviceInfo.getUuid());
        deviceProfile.setIsNeedCloud(true);
        Object obj = map.get("devType");
        if (obj instanceof String) {
            deviceProfile.setType((String) obj);
        }
        deviceProfile.addEntities(map);
        LogUtil.d("WeightIntellLifeUtils", "putDeviceProfile deviceProfile: ", deviceProfile.toString());
        return deviceProfile;
    }

    private static boolean a(Map<String, Object> map, DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getDeviceName() == null) {
            LogUtil.j("WeightIntellLifeUtils", "setBasicProfileInfo getDeviceName is null");
            return false;
        }
        eaf eafVarD = d(deviceInfo);
        if (eafVarD == null) {
            LogUtil.j("WeightIntellLifeUtils", "setBasicProfileInfo unknown device");
            return false;
        }
        map.put("model", eafVarD.d());
        map.put("devType", eafVarD.a());
        map.put("prodId", eafVarD.c());
        map.put(ProfileRequestConstants.MANU, d(deviceInfo.getProductType()));
        map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        map.put(ProfileRequestConstants.HIV, "1");
        map.put("deviceName", deviceInfo.getDeviceName());
        map.put("udid", deviceInfo.getUuid());
        LogUtil.a("WeightIntellLifeUtils", "setBasicProfileInfo uuid: ", dyg.d(deviceInfo.getUuid()));
        String strB = b(deviceInfo);
        if (TextUtils.isEmpty(strB)) {
            LogUtil.a("WeightIntellLifeUtils", "setBasicProfileInfo subMac is null");
            return false;
        }
        LogUtil.a("WeightIntellLifeUtils", "setBasicProfileInfo subMac: ", dyg.d(strB));
        map.put("mac", strB);
        map.put(ProfileRequestConstants.PROT_TYPE, Integer.valueOf("M0CJ".equals(eafVarD.c()) ? 4 : 1));
        return true;
    }

    public static eaf d(DeviceInfo deviceInfo) {
        eaf eafVar;
        int productType = deviceInfo.getProductType();
        LogUtil.a("WeightIntellLifeUtils", "getDeviceModeInfo type:", Integer.valueOf(productType), " deviceNameKey:", deviceInfo.getDeviceName());
        if (productType == 94) {
            LogUtil.a("WeightIntellLifeUtils", "getLikeByMap device is HUAWEI Band hagrid");
            eafVar = new eaf("HAG-B19", "007B", "025");
        } else if (productType != 106) {
            if (productType == 140) {
                LogUtil.a("WeightIntellLifeUtils", "getLikeByMap device is HUAWEI Band herms");
                eafVar = new eaf("HEM-B19", "M00D", "025");
            } else if (productType == 385) {
                LogUtil.a("WeightIntellLifeUtils", "getLikeByMap device is HUAWEI Band hagrid2021");
                eafVar = new eaf("HAG-B19", "M00F", "025");
            } else if (productType == 672) {
                LogUtil.a("WeightIntellLifeUtils", "getLikeByMap device is HUAWEI Band dobby");
                eafVar = new eaf("DOBBY-B19", "M0CJ", "A2B");
            } else {
                LogUtil.j("WeightIntellLifeUtils", "getDeviceModeInfo unknow type: ", Integer.valueOf(productType));
                eafVar = null;
            }
        } else if (dxn.e(BaseApplication.getContext(), deviceInfo.getUuid())) {
            LogUtil.a("WeightIntellLifeUtils", "getLikeByMap device is isNewWeightHonor mini");
            eafVar = new eaf("LUP-B39", "N001", "025");
        } else {
            LogUtil.a("WeightIntellLifeUtils", "getLikeByMap device is honor Band MINI");
            eafVar = new eaf("LUP-B19", "N001", "025");
        }
        LogUtil.d("WeightIntellLifeUtils", "deviceModeInfo:", eafVar == null ? Constants.NULL : eafVar.toString());
        return eafVar;
    }

    private static String d(int i) {
        int i2 = (i == 94 || i == 140 || i == 385 || i == 672) ? 1 : 0;
        LogUtil.a("WeightIntellLifeUtils", "ManufactureId is ", Integer.valueOf(i2));
        if (i2 == 1) {
            return "001";
        }
        return "002";
    }

    private static String b(DeviceInfo deviceInfo) {
        String strReplaceAll = deviceInfo.getDeviceIdentify().replaceAll(":", "");
        int length = strReplaceAll.length();
        if (length > 3) {
            return strReplaceAll.substring(length - 3, length);
        }
        return null;
    }

    public static ServiceProfile b(DeviceInfo deviceInfo, String str, String str2) {
        String uuid = deviceInfo.getUuid();
        ServiceProfile serviceProfile = new ServiceProfile();
        serviceProfile.setIsNeedCloud(true);
        serviceProfile.setDeviceId(uuid);
        serviceProfile.setId(str);
        serviceProfile.setType(str2);
        HashMap map = new HashMap(10);
        map.put("serviceId", str);
        map.put("type", str2);
        serviceProfile.addEntities(map);
        return serviceProfile;
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WeightIntellLifeUtils", "getServiceTypeById serviceId is null");
            return null;
        }
        str.hashCode();
        if (str.equals(w9.h)) {
            return "bt.connection";
        }
        if (str.equals("managerNode")) {
            return "managerNode";
        }
        LogUtil.j("WeightIntellLifeUtils", "getServiceTypeById know service id");
        return null;
    }

    public static ServiceCharacteristicProfile b(Map<String, Object> map) {
        ServiceCharacteristicProfile serviceCharacteristicProfile = new ServiceCharacteristicProfile();
        serviceCharacteristicProfile.addEntityInfo("timestamp", Long.valueOf(System.currentTimeMillis()));
        serviceCharacteristicProfile.setIsNeedCloud(true);
        if (map != null && !map.isEmpty()) {
            serviceCharacteristicProfile.addEntities(map);
        }
        return serviceCharacteristicProfile;
    }

    public static Map<String, Object> e(DeviceInfo deviceInfo, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WeightIntellLifeUtils", "getServiceTypeById serviceId is null");
            return null;
        }
        HashMap map = new HashMap(10);
        str.hashCode();
        if (str.equals(w9.h)) {
            map.put("characteristic.bt.connectionStatus", "0");
            return map;
        }
        if (str.equals("managerNode")) {
            map.put("type", deviceInfo.getDeviceBluetoothType() == 2 ? "local" : "cloud");
            return map;
        }
        LogUtil.j("WeightIntellLifeUtils", "getServiceTypeById know service id");
        return map;
    }

    public static boolean e(ServiceProfile serviceProfile) {
        if (serviceProfile == null) {
            LogUtil.j("WeightIntellLifeUtils", "checkServiceProfile profile is null");
            return false;
        }
        if (TextUtils.isEmpty(serviceProfile.getDeviceId())) {
            LogUtil.j("WeightIntellLifeUtils", "checkServiceProfile illegal devcie id");
            return false;
        }
        if (!TextUtils.isEmpty(serviceProfile.getId())) {
            return true;
        }
        LogUtil.j("WeightIntellLifeUtils", "checkServiceProfile illegal service id");
        return false;
    }

    public static String b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d();
        }
        return CommonUtil.ah();
    }

    private static String d() {
        return ("abc" + (Build.BOARD == null ? 0 : Build.BOARD.length() % 10) + (Build.BRAND == null ? 0 : Build.BRAND.length() % 10) + (Build.CPU_ABI == null ? 0 : Build.CPU_ABI.length() % 10) + (Build.DEVICE == null ? 0 : Build.DEVICE.length() % 10) + (Build.DISPLAY == null ? 0 : Build.DISPLAY.length() % 10) + (Build.HOST == null ? 0 : Build.HOST.length() % 10) + (Build.ID == null ? 0 : Build.ID.length() % 10) + (Build.MANUFACTURER == null ? 0 : Build.MANUFACTURER.length() % 10) + (Build.MODEL == null ? 0 : Build.MODEL.length() % 10) + (Build.PRODUCT == null ? 0 : Build.PRODUCT.length() % 10) + (Build.TAGS == null ? 0 : Build.TAGS.length() % 10) + (Build.TYPE == null ? 0 : Build.TYPE.length() % 10) + (Build.USER != null ? Build.USER.length() % 10 : 0)).toUpperCase(Locale.ENGLISH);
    }

    public static boolean a(String str) {
        if (str != null && !Constants.NULL.equalsIgnoreCase(str) && !"".equalsIgnoreCase(str)) {
            return false;
        }
        LogUtil.j("WeightIntellLifeUtils", "isEmptyCharacterValue characterValue is null");
        return true;
    }

    public static String e(String str, String str2, String str3) {
        if (str2 == null || str == null || str3 == null) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(10);
        for (String str4 : str.split(str3)) {
            if (!str2.equalsIgnoreCase(str4)) {
                stringBuffer.append(str4);
                stringBuffer.append(str3);
            }
        }
        if (stringBuffer.length() - str3.length() < 0) {
            return "";
        }
        return stringBuffer.substring(0, stringBuffer.length() - str3.length());
    }

    public static String d(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            LogUtil.j("WeightIntellLifeUtils", "filterServiceCharacter illegal characterValue");
            return str;
        }
        LogUtil.a("WeightIntellLifeUtils", "filterServiceCharacter ", dyg.d(str2));
        if (!str.contains(str2)) {
            LogUtil.j("WeightIntellLifeUtils", "characterValueList length", Integer.valueOf(str.length()), " not contain value :", dyg.d(str2));
            return str;
        }
        LogUtil.a("WeightIntellLifeUtils", " filterServiceCharacter length before ", Integer.valueOf(str.length()));
        String strE = e(str, str2, ",");
        LogUtil.a("WeightIntellLifeUtils", " filterServiceCharacter length after ", strE == null ? Constants.NULL : Integer.valueOf(strE.length()));
        return strE;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WeightIntellLifeUtils", "checkInvalidSerialNumber number isEmpty");
            return " ";
        }
        if (!"unknown".equalsIgnoreCase(str) && !Constants.NULL.equalsIgnoreCase(str)) {
            return str;
        }
        LogUtil.j("WeightIntellLifeUtils", "checkInvalidSerialNumber number is null , number:", str);
        return " ";
    }

    public static String c(String str, String str2) {
        LogUtil.a("WeightIntellLifeUtils", "addCharacterValueIfNotExist targetString ", dyg.d(str2));
        if (a(str)) {
            return str2;
        }
        if (str.contains(str2)) {
            return str;
        }
        return str + "," + str2;
    }

    public static ServiceCharacteristicProfile a(DeviceInfo deviceInfo, String[] strArr) {
        if (strArr == null || strArr.length < 2) {
            LogUtil.j("WeightIntellLifeUtils", "buildManagerNodeServiceCharacteristic illegal arguments");
            return null;
        }
        Map<String, Object> mapE = e(deviceInfo, "managerNode");
        if (mapE != null) {
            mapE.put("characteristic.managerIdentifierList", strArr[0]);
            mapE.put("characteristic.managerIdentifierList2", strArr[1]);
        }
        return b(mapE);
    }

    public static String e() {
        return CommonUtil.k(BaseApplication.getContext());
    }
}
