package com.huawei.hms.hwid;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f13548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f13549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f13550c;
    protected String d;

    public void b(String str) {
        this.f13548a = str;
    }

    public void c(String str) {
        this.f13549b = str;
    }

    public long a() {
        return this.f13550c;
    }

    public void a(long j) {
        this.f13550c = j;
    }

    public String b() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public String c() throws JSONException {
        return d().toString();
    }

    protected JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("appId", this.f13548a);
        jSONObject.putOpt("packageName", this.f13549b);
        jSONObject.put("hmsSdkVersion", this.f13550c);
        jSONObject.putOpt("subAppId", this.d);
        return jSONObject;
    }

    public String toString() {
        return "HuaweiIdCpClientInfo{appId='" + this.f13548a + "', packageName='" + this.f13549b + "', hmsSdkVersion=" + this.f13550c + "', subAppId=" + this.d + '}';
    }
}
