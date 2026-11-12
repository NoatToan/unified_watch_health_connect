package com.huawei.hms.activity.internal;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ForegroundInnerHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f12696c;

    public void fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f12694a = JsonUtil.getIntValue(jSONObject, "apkVersion");
            this.f12695b = JsonUtil.getStringValue(jSONObject, "action");
            this.f12696c = JsonUtil.getStringValue(jSONObject, "responseCallbackKey");
        } catch (JSONException e) {
            HMSLog.e("ForegroundInnerHeader", "fromJson failed: " + e.getMessage());
        }
    }

    public String getAction() {
        return this.f12695b;
    }

    public int getApkVersion() {
        return this.f12694a;
    }

    public String getResponseCallbackKey() {
        return this.f12696c;
    }

    public void setAction(String str) {
        this.f12695b = str;
    }

    public void setApkVersion(int i) {
        this.f12694a = i;
    }

    public void setResponseCallbackKey(String str) {
        this.f12696c = str;
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("apkVersion", this.f12694a);
            jSONObject.put("action", this.f12695b);
            jSONObject.put("responseCallbackKey", this.f12696c);
        } catch (JSONException e) {
            HMSLog.e("ForegroundInnerHeader", "ForegroundInnerHeader toJson failed: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "apkVersion:" + this.f12694a + ", action:" + this.f12695b + ", responseCallbackKey:" + this.f12696c;
    }
}
