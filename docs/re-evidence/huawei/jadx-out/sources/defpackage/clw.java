package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.haf.store.SharedStoreManager;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class clw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f1753c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AtomicBoolean f1752b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Set<String> f1751a = new HashSet();
    private static boolean d = false;

    private static void e(String str, DeviceInfo deviceInfo) {
        b(str, str + "_deviceInfo", new Gson().toJson(deviceInfo));
        LogUtil.b("UdsMmvkUtil", "insertDeviceInfo deviceName:", deviceInfo.getDeviceName());
    }

    public static void d(boolean z) {
        d = z;
    }

    public static void c(String str, DeviceInfo deviceInfo) {
        if (f1751a == null || TextUtils.isEmpty(str) || deviceInfo == null) {
            LogUtil.d("UdsMmvkUtil", "sIdentitySet or identity or deviceInfo is null, updateDeviceInfo failed.");
            return;
        }
        synchronized (f1753c) {
            if (!f(str)) {
                e(str, deviceInfo);
            } else {
                e(str + "_deviceInfo", new Gson().toJson(deviceInfo));
                LogUtil.b("UdsMmvkUtil", "update DeviceInfo.");
            }
        }
        LogUtil.b("UdsMmvkUtil", "updateDeviceInfo deviceName: ", deviceInfo.getDeviceName());
    }

    private static void a(String str, cmo cmoVar) {
        b(str, str + "_deviceStatus", new Gson().toJson(cmoVar));
        LogUtil.b("UdsMmvkUtil", "insert devicestatus.");
    }

    public static void c(String str, cmo cmoVar) {
        if (f1751a == null || TextUtils.isEmpty(str) || cmoVar == null) {
            LogUtil.d("UdsMmvkUtil", "sIdentitySet or identity or deviceInfo is null, updateDeviceStatusData failed.");
            return;
        }
        synchronized (f1753c) {
            if (!f(str)) {
                a(str, cmoVar);
            } else {
                e(str + "_deviceStatus", new Gson().toJson(cmoVar));
                LogUtil.b("UdsMmvkUtil", "update devicestatus");
            }
        }
    }

    private static void b(String str, ExternalDeviceCapability externalDeviceCapability) {
        b(str, str + "_deviceCapability", new Gson().toJson(externalDeviceCapability));
        LogUtil.b("UdsMmvkUtil", "insert ExternalDeviceCapability.");
    }

    public static void e(String str, ExternalDeviceCapability externalDeviceCapability) {
        if (f1751a == null || TextUtils.isEmpty(str) || externalDeviceCapability == null) {
            LogUtil.d("UdsMmvkUtil", "sIdentitySet or identity or deviceInfo is null, updateExternalDeviceCapability failed.");
            return;
        }
        synchronized (f1753c) {
            if (!f(str)) {
                b(str, externalDeviceCapability);
            } else {
                e(str + "_deviceCapability", new Gson().toJson(externalDeviceCapability));
                LogUtil.b("UdsMmvkUtil", "update ExternalDeviceCapability.");
            }
        }
    }

    public static void b(String str) {
        if (f1751a == null || TextUtils.isEmpty(str)) {
            LogUtil.d("UdsMmvkUtil", "deleteStorageData sIdentitySet or identity is null");
            return;
        }
        LogUtil.b("UdsMmvkUtil", "delete identitty.");
        synchronized (f1753c) {
            e(str);
            f1751a.remove(str);
            if (f1751a.isEmpty()) {
                d("identitys");
            } else {
                e("identitys", new Gson().toJson(f1751a));
            }
        }
    }

    private static boolean f(String str) {
        Set<String> set;
        if (!f1752b.get() && (set = f1751a) != null && set.isEmpty()) {
            b();
        }
        Set<String> set2 = f1751a;
        if (set2 == null) {
            LogUtil.d("UdsMmvkUtil", "database is not create");
            return false;
        }
        return set2.contains(str);
    }

    private static void b() {
        try {
            Set<String> set = (Set) new Gson().fromJson(a("identitys"), HashSet.class);
            f1751a = set;
            if (set != null) {
                ReleaseLogUtil.c("DEVMGR_UdsMmvkUtil", "loadedIdentitySet sIdentitySet size: ", Integer.valueOf(set.size()));
            }
        } catch (JsonSyntaxException unused) {
            LogUtil.d("UdsMmvkUtil", "handleCursorData sIdentitySet fromJson error0");
        }
    }

    public static boolean e() {
        Set set;
        try {
            String strA = a("identitys");
            if (!TextUtils.isEmpty(strA) && !"[]".equals(strA)) {
                set = (Set) new Gson().fromJson(a("identitys"), HashSet.class);
                return (set == null || set.isEmpty()) ? false : true;
            }
            return false;
        } catch (Exception unused) {
            LogUtil.d("UdsMmvkUtil", "isHasDevice sIdentitySet fromJson error");
            set = null;
        }
    }

    public static void c() {
        LogUtil.b("UdsMmvkUtil", "get Data From Database");
        synchronized (f1753c) {
            if (d) {
                Map<String, DeviceInfo> mapB = cnk.c().b();
                for (String str : mapB.keySet()) {
                    cnk.c().b(mapB.get(str));
                    cno.a().e(mapB.get(str));
                }
                a();
                d = false;
                return;
            }
            if (f1752b.get()) {
                LogUtil.e("UdsMmvkUtil", "Database is loaded.");
                return;
            }
            d();
            if (!f1752b.get()) {
                LogUtil.e("UdsMmvkUtil", "SyncData not OK.");
            } else {
                a();
            }
        }
    }

    private static void a() {
        b();
        Set<String> set = f1751a;
        if (set == null) {
            LogUtil.e("UdsMmvkUtil", "sIdentityList is null.");
            return;
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    private static void d() {
        SharedPreferences sharedPreferencesA = SharedStoreManager.a("keyvaldb_encrypt_udsdevice");
        if ("ok".equals(sharedPreferencesA.getString("sync_data", ""))) {
            f1752b.set(true);
            return;
        }
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(500L);
                if ("ok".equals(sharedPreferencesA.getString("sync_data", ""))) {
                    f1752b.set(true);
                    return;
                }
            } catch (InterruptedException unused) {
                LogUtil.d("UdsMmvkUtil", "waitSyncData InterruptedException");
                return;
            }
        }
    }

    private static void c(String str) {
        String strA = a(str + "_deviceInfo");
        DeviceInfo deviceInfo = new DeviceInfo();
        if (strA != null) {
            try {
                deviceInfo = (DeviceInfo) new Gson().fromJson(strA, DeviceInfo.class);
            } catch (JsonSyntaxException unused) {
                LogUtil.d("UdsMmvkUtil", "handleCursorData DeviceInfo fromJson error1");
            }
        }
        LogUtil.b("UdsMmvkUtil", "handleCursorData DeviceInfo fromJson:", deviceInfo.toString());
        if (deviceInfo.getDeviceConnectState() == 1 || deviceInfo.getDeviceConnectState() == 2) {
            deviceInfo.setDeviceConnectState(3);
        }
        cnk.c().b(str, deviceInfo);
        String strA2 = a(str + "_deviceStatus");
        if (strA2 == null) {
            LogUtil.d("UdsMmvkUtil", "handleCursorData deviceStatusStr is null");
        } else {
            try {
                cnk.c().e(str, (cmo) new Gson().fromJson(strA2, cmo.class));
            } catch (JsonSyntaxException unused2) {
                LogUtil.d("UdsMmvkUtil", "handleCursorData DeviceStatus fromJson error2");
            }
        }
        String strA3 = a(str + "_deviceCapability");
        if (strA3 != null) {
            try {
                LogUtil.b("UdsMmvkUtil", "handleCursorData deviceCapabilityStr is not null.");
                cnk.c().c(str, (ExternalDeviceCapability) new Gson().fromJson(strA3, ExternalDeviceCapability.class));
            } catch (JsonSyntaxException unused3) {
                LogUtil.d("UdsMmvkUtil", "handleCursorData ExternalDeviceCapability fromJson error3");
            }
        }
        cno.a().d(deviceInfo);
    }

    private static String a(String str) {
        if (str == null) {
            LogUtil.e("UdsMmvkUtil", "getValue, key is null");
            return "[]";
        }
        return SharedStoreManager.a("keyvaldb_encrypt_udsdevice").getString(str, "[]");
    }

    private static void e(String str, String str2) {
        if (str == null) {
            LogUtil.e("UdsMmvkUtil", "setValue, key is null");
            return;
        }
        SharedPreferences.Editor editorEdit = SharedStoreManager.a("keyvaldb_encrypt_udsdevice").edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    private static void b(String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = SharedStoreManager.a("keyvaldb_encrypt_udsdevice").edit();
        f1751a.add(str);
        editorEdit.putString("identitys", new Gson().toJson(f1751a));
        editorEdit.putString(str2, str3);
        editorEdit.commit();
    }

    private static void d(String str) {
        if (str == null) {
            LogUtil.e("UdsMmvkUtil", "deleteKey, key is null");
            return;
        }
        SharedPreferences.Editor editorEdit = SharedStoreManager.a("keyvaldb_encrypt_udsdevice").edit();
        editorEdit.remove(str);
        editorEdit.commit();
    }

    private static void e(String str) {
        SharedPreferences.Editor editorEdit = SharedStoreManager.a("keyvaldb_encrypt_udsdevice").edit();
        editorEdit.remove(str + "_deviceInfo");
        editorEdit.remove(str + "_deviceStatus");
        editorEdit.remove(str + "_deviceCapability");
        editorEdit.commit();
    }

    public static void a(Collection<DeviceInfo> collection) {
        e(collection, "ble_reconnect_devices");
    }

    public static void b(Collection<DeviceInfo> collection) {
        e(collection, "br_reconnect_devices");
    }

    private static void e(Collection<DeviceInfo> collection, String str) {
        HashMap map = new HashMap(collection.size());
        for (DeviceInfo deviceInfo : collection) {
            HashMap map2 = new HashMap(16);
            map2.put("deviceBtType", Integer.toString(deviceInfo.getDeviceBtType()));
            map2.put("deviceBtMode", deviceInfo.getDeviceBtMode());
            map.put(deviceInfo.getDeviceMac(), map2);
        }
        SharedPreferences.Editor editorEdit = SharedStoreManager.a("keyvaldb_encrypt_udsdevice").edit();
        editorEdit.putString(str, new Gson().toJson(map));
        editorEdit.commit();
    }

    public static void c(String str, Collection<com.huawei.health.devicemgr.business.entity.DeviceInfo> collection) {
        if (!"reconnectDevices".equals(str)) {
            LogUtil.b("UdsMmvkUtil", "saveOldReconnectDeviceList not reconnectDevices");
            return;
        }
        HashMap map = new HashMap(collection.size());
        HashMap map2 = new HashMap(collection.size());
        for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo : collection) {
            HashMap map3 = new HashMap(16);
            map3.put("deviceBtType", Integer.toString(deviceInfo.getDeviceBluetoothType()));
            map3.put("deviceBtMode", deviceInfo.getManufacture());
            if (deviceInfo.getDeviceBluetoothType() == 2) {
                map.put(deviceInfo.getDeviceIdentify(), map3);
            } else {
                map2.put(deviceInfo.getDeviceIdentify(), map3);
            }
        }
        SharedPreferences.Editor editorEdit = SharedStoreManager.a("keyvaldb_encrypt_udsdevice").edit();
        editorEdit.putString("old_ble_reconnect_devices", new Gson().toJson(map));
        editorEdit.putString("old_br_reconnect_devices", new Gson().toJson(map2));
        editorEdit.commit();
    }
}
