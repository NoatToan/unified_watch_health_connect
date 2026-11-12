package com.xiaomi.hm.health.device.amazfit_watch;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.amazfit_watch.model.DeviceCloudConfig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class DeviceCloudConfigUtils {
    private static final String a = "band";
    private static final String b = "scale";
    private static final String c = "value";
    private static final String d = "on";

    public static DeviceCloudConfig transformCloudDeviceConfig(String str, String str2) {
        DeviceCloudConfig deviceCloudConfig = new DeviceCloudConfig();
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(new JSONObject(str2).optString(str)).optString(str));
            HashMap<HMDeviceType, Boolean> map = new HashMap<>();
            if ("on".equals(jSONObject.optJSONObject(a).optString("value"))) {
                map.put(HMDeviceType.MILI, Boolean.TRUE);
            }
            if ("on".equals(jSONObject.optJSONObject("scale").optString("value"))) {
                map.put(HMDeviceType.WEIGHT, Boolean.TRUE);
            }
            deviceCloudConfig.setDeviceBindHashMap(map);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return deviceCloudConfig;
    }
}
