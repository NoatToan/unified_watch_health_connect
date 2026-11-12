package com.huawei.hms.support.api.entity.account;

import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.api.account.AccountGetTokenOptions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AccountSignInRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    AccountAuthParams f16500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    AccountGetTokenOptions f16501b;

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        AccountAuthParams accountAuthParams = this.f16500a;
        if (accountAuthParams != null) {
            jSONObject.put("huaweiIdSignInOptions", accountAuthParams.toJsonObject());
        }
        AccountGetTokenOptions accountGetTokenOptions = this.f16501b;
        if (accountGetTokenOptions != null) {
            jSONObject.put("accountGetTokenOptions", accountGetTokenOptions.toJsonObject());
        }
        return jSONObject.toString();
    }

    public static AccountSignInRequest fromJson(String str) throws JSONException {
        if (str == null) {
            return null;
        }
        return new AccountSignInRequest().objectFromJson(new JSONObject(str));
    }

    protected AccountSignInRequest objectFromJson(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONObject jSONObject3 = jSONObject.getJSONObject("huaweiIdSignInOptions");
        if (jSONObject3 != null) {
            this.f16500a = AccountAuthParams.fromJsonObject(jSONObject3);
        }
        if (jSONObject.has("huaweiIdGetTokenOptions") && (jSONObject2 = jSONObject.getJSONObject("accountGetTokenOptions")) != null && jSONObject2.length() > 0) {
            this.f16501b = AccountGetTokenOptions.fromJsonObject(jSONObject2);
        }
        return this;
    }

    public AccountAuthParams getAccountAuthParams() {
        return this.f16500a;
    }

    public void setAccountAuthParams(AccountAuthParams accountAuthParams) {
        this.f16500a = accountAuthParams;
    }

    public AccountGetTokenOptions getAccountGetTokenOptions() {
        return this.f16501b;
    }

    public void setAccountGetTokenOptions(AccountGetTokenOptions accountGetTokenOptions) {
        this.f16501b = accountGetTokenOptions;
    }
}
