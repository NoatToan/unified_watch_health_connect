package defpackage;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xjj {
    public static void a(List<HiHealthClient> list) {
        if (njy.e(list)) {
            return;
        }
        HashSet<Integer> hashSetD = d("02B");
        Iterator<HiHealthClient> it = list.iterator();
        while (it.hasNext()) {
            HiHealthClient next = it.next();
            if (next.getHiDeviceInfo() != null) {
                int deviceType = next.getHiDeviceInfo().getDeviceType();
                if (hashSetD.contains(Integer.valueOf(deviceType)) || deviceType == 68) {
                    it.remove();
                }
            }
        }
    }

    public static HashSet<Integer> d(String str) {
        HashSet<Integer> hashSet = new HashSet<>(16);
        if (!TextUtils.isEmpty(str)) {
            for (ProductMapInfo productMapInfo : ProductMap.e()) {
                if (str.equals(productMapInfo.e())) {
                    hashSet.add(Integer.valueOf(productMapInfo.c()));
                }
            }
        }
        return hashSet;
    }

    public static String e(HiDeviceInfo hiDeviceInfo) {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference("privacy_data_source_device_name_4F32F873AE094ACAA75E35D53690B72C");
        HiUserPreference userPreference2 = HiHealthManager.d(BaseApplication.b()).getUserPreference("privacy_data_source_nfc_scan_D85D9FAF0AA347F39179FA0DC65CC9D7");
        Map map = userPreference != null ? (Map) HiJsonUtil.d(userPreference.getValue(), new TypeToken<Map<String, Object>>() { // from class: com.huawei.utils.AllDataUtil$1
        }.getType()) : null;
        Map map2 = userPreference2 != null ? (Map) HiJsonUtil.d(userPreference2.getValue(), new TypeToken<Map<String, Object>>() { // from class: com.huawei.utils.AllDataUtil$2
        }.getType()) : null;
        String deviceUniqueCode = hiDeviceInfo.getDeviceUniqueCode();
        if (d(map, deviceUniqueCode)) {
            return String.valueOf(map.get(deviceUniqueCode));
        }
        if (d(map2, deviceUniqueCode)) {
            return String.valueOf(map2.get(deviceUniqueCode));
        }
        String deviceName = hiDeviceInfo.getDeviceName();
        return "Sport Health Manual".equals(deviceName) ? "UNKNOWN" : deviceName;
    }

    private static boolean d(Map<String, Object> map, String str) {
        return (map == null || !map.containsKey(str) || map.get(str) == null) ? false : true;
    }

    public static void a(HiHealthClient hiHealthClient) {
        HiDeviceInfo hiDeviceInfo = hiHealthClient.getHiDeviceInfo();
        if (!e(hiDeviceInfo.getDeviceUniqueCode()) || hiDeviceInfo.getDeviceType() == 32) {
            return;
        }
        hiDeviceInfo.setDeviceName(e(hiDeviceInfo));
    }

    private static boolean e(String str) {
        return !"-1".equals(str);
    }
}
