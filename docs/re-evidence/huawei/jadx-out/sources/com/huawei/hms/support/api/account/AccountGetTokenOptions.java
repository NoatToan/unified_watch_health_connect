package com.huawei.hms.support.api.account;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AccountGetTokenOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16497b;

    public AccountGetTokenOptions(String str, boolean z) {
        this.f16496a = str;
        this.f16497b = z;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f16496a)) {
            jSONObject.put("accountName", this.f16496a);
        }
        jSONObject.put("fromGetToken", this.f16497b);
        return jSONObject;
    }

    public static AccountGetTokenOptions fromJsonObject(JSONObject jSONObject) throws JSONException {
        return new AccountGetTokenOptions(jSONObject.optString("accountName"), jSONObject.optBoolean("fromGetToken", false));
    }

    public String getAccountName() {
        return this.f16496a;
    }

    public void setAccountName(String str) {
        this.f16496a = str;
    }

    public boolean isFromGetToken() {
        return this.f16497b;
    }

    public void setFromGetToken(boolean z) {
        this.f16497b = z;
    }
}
