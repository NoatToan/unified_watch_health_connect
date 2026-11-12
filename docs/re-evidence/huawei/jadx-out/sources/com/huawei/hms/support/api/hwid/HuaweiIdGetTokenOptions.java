package com.huawei.hms.support.api.hwid;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HuaweiIdGetTokenOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16515b;

    public HuaweiIdGetTokenOptions(String str, boolean z) {
        this.f16514a = str;
        this.f16515b = z;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f16514a)) {
            jSONObject.put("accountName", this.f16514a);
        }
        jSONObject.put("fromGetToken", this.f16515b);
        return jSONObject;
    }

    public static HuaweiIdGetTokenOptions fromJsonObject(JSONObject jSONObject) throws JSONException {
        return new HuaweiIdGetTokenOptions(jSONObject.optString("accountName"), jSONObject.optBoolean("fromGetToken", false));
    }

    public void setAccountName(String str) {
        this.f16514a = str;
    }

    public String getAccountName() {
        return this.f16514a;
    }

    public void setFromGetToken(boolean z) {
        this.f16515b = z;
    }

    public boolean isFromGetToken() {
        return this.f16515b;
    }
}
