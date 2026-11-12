package com.xiaomi.hm.health.dataprocess;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class SportIndex {
    public int lenght;
    public int startIndex;
    public int stopIndex;

    public SportIndex() {
        this.startIndex = 0;
        this.stopIndex = 0;
        this.lenght = 0;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("startIndex", this.startIndex * 4);
            jSONObject.put("stopIndex", this.stopIndex * 4);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return "index:" + this.startIndex + "->" + this.stopIndex;
    }

    public SportIndex(int i, int i2) {
        this.startIndex = 0;
        this.stopIndex = 0;
        this.lenght = 0;
        this.startIndex = i;
        this.stopIndex = i2;
    }
}
