package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.UploadSmartLifeApi;
import com.huawei.profile.profile.DeviceProfile;
import com.huawei.profile.profile.ServiceCharacteristicProfile;
import com.huawei.profile.profile.ServiceProfile;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class enm {
    public static void c(enf enfVar) {
        b(enfVar, -1);
    }

    public static void b(final enf enfVar, final int i) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: enp
            @Override // java.lang.Runnable
            public final void run() {
                enm.a(enfVar, i);
            }
        });
    }

    static /* synthetic */ void a(enf enfVar, int i) {
        if (!new eng().d(enfVar, b()) || i < 0) {
            return;
        }
        b(enfVar.a().getId(), i);
    }

    public static void c(String str, String str2, String str3) {
        dmu dmuVarA = dmu.a(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str2));
        if (dmuVarA != null) {
            ((UploadSmartLifeApi) Services.b("PluginDeviceOpenModule", UploadSmartLifeApi.class)).upload(str, str2, str3, dmuVarA);
        }
    }

    public static void b(final String str, final int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("smartlife_IntellLifeUtils", "reportDeviceConnectStatus deviceId is empty.");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: enk
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    int i2 = i;
                    ReleaseLogUtil.d("DEVMGR_EcologyDevice_smartlife_IntellLifeUtils", "peer connection status:", Integer.valueOf(i2), ",result:", Boolean.valueOf(new eng().e(str2, i2)));
                }
            });
        }
    }

    public static String d(String str) {
        return new eng().b(str);
    }

    public static Map<String, String> a(List<String> list) {
        return new eng().c(list);
    }

    public static void d(final String str, final String str2) {
        if (Utils.o()) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: eno
            @Override // java.lang.Runnable
            public final void run() {
                new eng().c(str, str2, enm.b());
            }
        });
    }

    public static void a(Map<String, enf> map, List<String> list) {
        if (!Utils.o()) {
            new eng().d(map, list);
        }
        LogUtil.a("smartlife_IntellLifeUtils", "syncDeviceInfoToSmartLife enter");
    }

    public static ServiceProfile c(DeviceProfile deviceProfile, String str, String str2) {
        String id = deviceProfile.getId();
        ServiceProfile serviceProfile = new ServiceProfile();
        serviceProfile.setIsNeedCloud(true);
        serviceProfile.setDeviceId(id);
        serviceProfile.setId(str);
        serviceProfile.setType(str2);
        HashMap map = new HashMap(10);
        map.put("serviceId", str);
        map.put("type", str2);
        serviceProfile.addEntities(map);
        return serviceProfile;
    }

    public static ServiceCharacteristicProfile e(Map<String, Object> map) {
        ServiceCharacteristicProfile serviceCharacteristicProfile = new ServiceCharacteristicProfile();
        serviceCharacteristicProfile.setIsNeedCloud(true);
        if (map == null || map.isEmpty()) {
            serviceCharacteristicProfile.addEntityInfo("timestamp", Long.valueOf(System.currentTimeMillis()));
            return serviceCharacteristicProfile;
        }
        serviceCharacteristicProfile.addEntities(map);
        serviceCharacteristicProfile.addEntityInfo("timestamp", Long.valueOf(System.currentTimeMillis()));
        return serviceCharacteristicProfile;
    }

    public static boolean e(ServiceProfile serviceProfile) {
        if (serviceProfile == null) {
            LogUtil.j("smartlife_IntellLifeUtils", "checkServiceProfile, profile is null");
            return false;
        }
        if (TextUtils.isEmpty(serviceProfile.getDeviceId())) {
            LogUtil.j("smartlife_IntellLifeUtils", "checkServiceProfile, illegal device id");
            return false;
        }
        if (!TextUtils.isEmpty(serviceProfile.getId())) {
            return true;
        }
        LogUtil.j("smartlife_IntellLifeUtils", "checkServiceProfile, illegal service id");
        return false;
    }

    public static String a() {
        return CommonUtil.k(BaseApplication.getContext());
    }

    public static String b() {
        return CommonUtil.k(BaseApplication.getContext());
    }

    public static boolean e(String str) {
        if (str != null && !Constants.NULL.equalsIgnoreCase(str) && !"".equalsIgnoreCase(str)) {
            return false;
        }
        LogUtil.j("smartlife_IntellLifeUtils", "isEmptyCharacterValue characterValue is null");
        return true;
    }

    public static String b(String str, String str2, String str3) {
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

    public static void b(Map<String, DeviceProfile> map, List<DeviceProfile> list, List<String> list2) {
        if (map == null || list == null || list2 == null) {
            LogUtil.a("smartlife_IntellLifeUtils", "saveDeviceCloudProfiles deviceCloudProfileMap or deviceCloudProfiles or filteredDevices null");
            return;
        }
        LogUtil.a("smartlife_IntellLifeUtils", "initCloudDeviceMap deviceCloudProfiles size ", Integer.valueOf(list.size()), ",initCloudDeviceMap deviceCloudProfileMap's size", Integer.valueOf(map.size()));
        StringBuffer stringBuffer = new StringBuffer();
        for (DeviceProfile deviceProfile : list) {
            Map<String, Object> profile = deviceProfile.getProfile();
            try {
                if (list2.contains(a(deviceProfile))) {
                    String str = (profile.containsKey("devType") && (profile.get("devType") instanceof String)) ? (String) profile.get("devType") : null;
                    if (str == null) {
                        LogUtil.j("smartlife_IntellLifeUtils", "cloudDevice type is null");
                    } else {
                        String id = deviceProfile.getId();
                        stringBuffer.append(id);
                        stringBuffer.append(" ");
                        stringBuffer.append(str);
                        stringBuffer.append(";");
                        if (!TextUtils.isEmpty(id)) {
                            map.put(id, deviceProfile);
                        }
                    }
                }
            } catch (ClassCastException unused) {
                LogUtil.e("smartlife_IntellLifeUtils", "initDeviceMap() ClassCastException");
            } catch (NumberFormatException unused2) {
                LogUtil.e("smartlife_IntellLifeUtils", "initDeviceMap() NumberFormatException");
            }
        }
    }

    private static String a(DeviceProfile deviceProfile) {
        if (deviceProfile == null) {
            LogUtil.j("smartlife_IntellLifeUtils", "getDeviceModel illegal arguments");
            return null;
        }
        Map<String, Object> profile = deviceProfile.getProfile();
        if (profile.containsKey("prodId") && (profile.get("prodId") instanceof String)) {
            return (String) profile.get("prodId");
        }
        return null;
    }

    public static String e(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return "";
        }
        LogUtil.a("smartlife_IntellLifeUtils", "filterServiceCharacter ", etk.c(str2));
        if (!str.contains(str2)) {
            int length = str.length();
            LogUtil.j("smartlife_IntellLifeUtils", "characterValueList length", Integer.valueOf(length), " not contain value :", etk.c(str2));
            return str;
        }
        return b(str, str2, ",");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("smartlife_IntellLifeUtils", "convertIntoValidSerialNumber number isEmpty");
            return " ";
        }
        if (!"unknown".equalsIgnoreCase(str) && !Constants.NULL.equalsIgnoreCase(str)) {
            return str;
        }
        LogUtil.j("smartlife_IntellLifeUtils", "convertIntoValidSerialNumber number is null, number:", str);
        return " ";
    }

    public static String c(String str, String str2) {
        if (e(str)) {
            return str2;
        }
        if (str.contains(str2)) {
            return str;
        }
        return str + "," + str2;
    }

    public static ServiceCharacteristicProfile e(Map<String, Object> map, String[] strArr) {
        if (strArr == null || strArr.length < 2) {
            LogUtil.j("smartlife_IntellLifeUtils", "buildManagerNodeServiceCharacteristic illegal arguments");
            return null;
        }
        if (map != null) {
            map.put("characteristic.managerIdentifierList", strArr[0]);
            map.put("characteristic.managerIdentifierList2", strArr[1]);
        }
        return e(map);
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        if (str.equals(w9.h)) {
            return "bt.connection";
        }
        if (str.equals("managerNode")) {
            return "managerNode";
        }
        LogUtil.j("smartlife_IntellLifeUtils", "getServiceTypeById unknown service id");
        return null;
    }
}
