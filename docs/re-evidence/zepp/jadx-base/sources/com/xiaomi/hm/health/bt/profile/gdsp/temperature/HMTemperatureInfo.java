package com.xiaomi.hm.health.bt.profile.gdsp.temperature;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class HMTemperatureInfo {
    public ArrayList<HMTemperatureData> a = new ArrayList<>();

    public HMTemperatureInfo(ArrayList<HMTemperatureData> datas) {
        if (datas == null || datas.size() <= 0) {
            return;
        }
        this.a.addAll(datas);
    }

    public ArrayList<HMTemperatureData> getData() {
        return this.a;
    }

    public boolean isValid() {
        ArrayList<HMTemperatureData> arrayList = this.a;
        return arrayList != null && arrayList.size() > 0;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList<HMTemperatureData> arrayList = this.a;
            if (arrayList != null && arrayList.size() > 0) {
                int size = 6;
                if (this.a.size() <= 6) {
                    size = this.a.size();
                }
                for (int i = 0; i < size; i++) {
                    HMTemperatureData hMTemperatureData = this.a.get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("timestamp", hMTemperatureData.getCalendar().getTimeInMillis());
                    jSONObject2.put("value", hMTemperatureData.getTemperature());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("data", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
