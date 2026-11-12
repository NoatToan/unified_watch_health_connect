package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import com.google.gson.Gson;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.store.SharedStoreManager;
import health.compact.a.LogUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class yho {
    private static String a(String str) {
        if (str == null) {
            LogUtil.e("ReconnectDeviceUtil", "getValue, key is null");
            return "[]";
        }
        return SharedStoreManager.a("keyvaldb_encrypt_udsdevice").getString(str, "[]");
    }

    private static Map<String, Map<String, String>> c(String str) {
        return (Map) new Gson().fromJson(a(str), HashMap.class);
    }

    public static Map<String, Map<String, String>> d() {
        Map<String, Map<String, String>> mapC = c();
        mapC.putAll(a());
        return mapC;
    }

    public static Map<String, Map<String, String>> c() {
        Map<String, Map<String, String>> mapC = c("ble_reconnect_devices");
        mapC.putAll(c("old_ble_reconnect_devices"));
        return mapC;
    }

    public static Map<String, Map<String, String>> a() {
        Map<String, Map<String, String>> mapC = c("br_reconnect_devices");
        mapC.putAll(c("old_br_reconnect_devices"));
        return mapC;
    }

    public static boolean b() {
        HashSet<String> hashSetH = h();
        if (hashSetH == null || hashSetH.isEmpty()) {
            LogUtil.b("ReconnectDeviceUtil", "hasBondedDevices devices isEmpty");
            return false;
        }
        Set<BluetoothDevice> setE = e();
        if (setE == null || setE.isEmpty()) {
            LogUtil.b("ReconnectDeviceUtil", "hasBondedDevices bondedDevices isEmpty");
            return false;
        }
        Iterator<BluetoothDevice> it = setE.iterator();
        while (it.hasNext()) {
            if (hashSetH.contains(it.next().getAddress())) {
                LogUtil.b("ReconnectDeviceUtil", "hasBondedDevices true");
                return true;
            }
        }
        BluetoothManager bluetoothManager = (BluetoothManager) BaseApplication.b().getSystemService("bluetooth");
        if (bluetoothManager != null) {
            Iterator<BluetoothDevice> it2 = bluetoothManager.getConnectedDevices(7).iterator();
            while (it2.hasNext()) {
                if (hashSetH.contains(it2.next().getAddress())) {
                    LogUtil.b("ReconnectDeviceUtil", "hasConnectedDevices true");
                    return true;
                }
            }
        }
        LogUtil.b("ReconnectDeviceUtil", "hasBondedDevices false");
        return false;
    }

    private static HashSet<String> h() {
        try {
            HashSet<String> hashSet = (HashSet) new Gson().fromJson(a("identitys"), HashSet.class);
            Map<String, String> mapE = SharedPreferenceManager.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), String.valueOf(1000));
            if (mapE == null) {
                LogUtil.b("ReconnectDeviceUtil", "maps is null.");
                return hashSet;
            }
            Iterator<Map.Entry<String, String>> it = mapE.entrySet().iterator();
            while (it.hasNext()) {
                Map map = (Map) new Gson().fromJson(it.next().getValue(), HashMap.class);
                if (map != null) {
                    hashSet.add((String) map.get("mDeviceIdentify"));
                }
            }
            LogUtil.b("ReconnectDeviceUtil", "getDevices devices size : ", Integer.valueOf(hashSet.size()));
            return hashSet;
        } catch (Exception unused) {
            LogUtil.d("ReconnectDeviceUtil", "getDevices gson internal error.");
            return null;
        }
    }

    private static Set<BluetoothDevice> e() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return Collections.EMPTY_SET;
        }
        try {
            return defaultAdapter.getBondedDevices();
        } catch (SecurityException unused) {
            LogUtil.d("ReconnectDeviceUtil", "getBondedDevices error.");
            return null;
        }
    }
}
