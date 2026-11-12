package com.xiaomi.mitv.airkan.sdk.util;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class JSONBuilder {
    private JSONObject a;

    public JSONBuilder() {
        this.a = new JSONObject();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[Catch: JSONException -> 0x0029, TryCatch #0 {JSONException -> 0x0029, blocks: (B:4:0x0005, B:6:0x000f, B:8:0x001b, B:10:0x0026, B:9:0x0021), top: B:15:0x0005 }] */
    public JSONBuilder(String str) {
        JSONObject jSONObject;
        if (str != null) {
            try {
                if (str.trim().isEmpty() || str.toLowerCase().equals("null")) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(str);
                }
            } catch (JSONException e) {
                Logger.i("create empty jsonObj for failed msg %s", e.getMessage());
                this.a = new JSONObject();
                return;
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.a = jSONObject;
    }

    public JSONBuilder(JSONObject jSONObject) {
        if (jSONObject == null) {
            this.a = new JSONObject();
        } else {
            this.a = jSONObject;
        }
    }

    public static JSONBuilder create(String str) {
        return new JSONBuilder(str);
    }

    public JSONBuilder put(String str, double d) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.a.put(str, d);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public JSONBuilder put(String str, int i) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.a.put(str, i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public JSONBuilder put(String str, long j) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.a.put(str, j);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public JSONBuilder put(String str, Object obj) {
        try {
            if (!TextUtils.isEmpty(str) && obj != null) {
                this.a.put(str, obj);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public JSONBuilder put(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                this.a.put(str, str2);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public JSONBuilder put(String str, boolean z) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.a.put(str, z);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public JSONObject toJSONObject() {
        return this.a;
    }

    public String toString() {
        return this.a.toString();
    }
}
