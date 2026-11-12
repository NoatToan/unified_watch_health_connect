package com.huawei.hms.common.internal.bean;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractCpPickerClientInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f13077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f13078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f13079c;
    protected String d;

    public String getAppId() {
        return this.f13077a;
    }

    public void setAppId(String str) {
        this.f13077a = str;
    }

    public String getPackageName() {
        return this.f13078b;
    }

    public void setPackageName(String str) {
        this.f13078b = str;
    }

    public long getHmsSdkVersion() {
        return this.f13079c;
    }

    public void setHmsSdkVersion(long j) {
        this.f13079c = j;
    }

    public String getSubAppId() {
        return this.d;
    }

    public void setSubAppId(String str) {
        this.d = str;
    }

    public String toJson() throws JSONException {
        return a().toString();
    }

    private JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("appId", this.f13077a);
        jSONObject.putOpt("packageName", this.f13078b);
        jSONObject.put("hmsSdkVersion", this.f13079c);
        jSONObject.putOpt("subAppId", this.d);
        return jSONObject;
    }

    public String toString() {
        return "CpClientInfo{appId='" + this.f13077a + "', packageName='" + this.f13078b + "', hmsSdkVersion=" + this.f13079c + "', subAppId=" + this.d + '}';
    }
}
