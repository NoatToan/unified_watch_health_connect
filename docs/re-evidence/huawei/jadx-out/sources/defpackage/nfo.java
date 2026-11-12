package defpackage;

import com.google.gson.Gson;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public class nfo {
    public static Map<String, Object> a(Object obj, String str) {
        HashMap map = new HashMap(16);
        Gson gson = new Gson();
        if (obj != null) {
            if ((obj instanceof String) || (obj instanceof JSONArray)) {
                map.put("value", obj.toString());
            } else {
                map.put("value", gson.toJson(obj));
            }
        }
        if (!map.containsKey("code")) {
            map.put("code", 100000);
        }
        map.put("funcName", str);
        return map;
    }

    public static boolean b(List<DeviceInfo> list) {
        if (list == null) {
            return false;
        }
        LogUtil.a("RemoteUtils", "getCurrentDeviceInfo() deviceInfoList.size(): ", Integer.valueOf(list.size()));
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo.getDeviceActiveState() == 1 && deviceInfo.getProductType() == 11) {
                return true;
            }
        }
        LogUtil.j("RemoteUtils", "getCurrentDeviceInfo() deviceInfo's ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE");
        return false;
    }

    public static int d(List<DeviceInfo> list) {
        LogUtil.a("RemoteUtils", "getTrackTypeByClassification() enter");
        int i = -1;
        if (list == null) {
            LogUtil.j("RemoteUtils", "deviceInfoList is null.");
            return -1;
        }
        int iA = a(list);
        LogUtil.a("RemoteUtils", "getTrackTypeByClassification() deviceClassification: ", Integer.valueOf(iA));
        if (iA == 1) {
            i = 4;
        } else if (iA == 2) {
            i = 5;
        } else if (iA != 3) {
            LogUtil.j("RemoteUtils", "getTrackTypeByClassification() no this trackType: ", -1);
        } else {
            i = 6;
        }
        LogUtil.a("RemoteUtils", "getTrackTypeByClassification() trackType: ", Integer.valueOf(i));
        return i;
    }

    private static int a(List<DeviceInfo> list) {
        DeviceInfo next;
        Iterator<DeviceInfo> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getDeviceActiveState() == 1 && !eel.d(next.getProductType())) {
                break;
            }
        }
        int iB = next != null ? mko.b(next.getProductType()) : -1;
        LogUtil.a("RemoteUtils", "getConncetedDeviceClassification() deviceInfoList.size()", Integer.valueOf(list.size()), " deviceClassification", Integer.valueOf(iB));
        return iB;
    }
}
