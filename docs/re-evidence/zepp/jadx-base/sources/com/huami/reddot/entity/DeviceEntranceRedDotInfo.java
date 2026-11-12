package com.huami.reddot.entity;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import com.huami.reddot.RedDotProvider;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class DeviceEntranceRedDotInfo {
    private static final String b = "deviceSource";
    private static final String c = "redDot";
    private static DeviceEntranceRedDotInfo d;
    private SparseBooleanArray a = new SparseBooleanArray();

    private DeviceEntranceRedDotInfo() {
        String deviceEntranceRedDotInfo = RedDotProvider.getProvider().getDeviceEntranceRedDotInfo();
        if (TextUtils.isEmpty(deviceEntranceRedDotInfo)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(deviceEntranceRedDotInfo);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int iOptInt = jSONObject.optInt("deviceSource", -1);
                if (iOptInt != -1) {
                    this.a.put(iOptInt, jSONObject.optBoolean(c, false));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clear() {
        d = null;
    }

    public static DeviceEntranceRedDotInfo getInstance() {
        if (d == null) {
            synchronized (DeviceEntranceRedDotInfo.class) {
                if (d == null) {
                    d = new DeviceEntranceRedDotInfo();
                }
            }
        }
        return d;
    }

    public boolean getShowRedDot(int i) {
        return this.a.get(i);
    }

    public void setShowRedDot(int i, boolean z) {
        if (z == getShowRedDot(i)) {
            return;
        }
        this.a.put(i, z);
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("deviceSource", this.a.keyAt(i2));
                jSONObject.put(c, this.a.valueAt(i2));
                jSONArray.put(jSONObject);
            }
            RedDotProvider.getProvider().setDeviceEntranceRedDotInfo(jSONArray.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
