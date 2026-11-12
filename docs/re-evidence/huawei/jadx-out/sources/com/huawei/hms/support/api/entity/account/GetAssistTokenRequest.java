package com.huawei.hms.support.api.entity.account;

import android.text.TextUtils;
import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class GetAssistTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f16504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16505c;

    public GetAssistTokenRequest(String str) {
        this.f16503a = str;
    }

    public String getUserIdentify() {
        return this.f16504b;
    }

    public void setUserIdentify(String str) {
        this.f16504b = str;
    }

    public String getSessionId() {
        return this.f16505c;
    }

    public void setSessionId(String str) {
        this.f16505c = str;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f16503a)) {
            jSONObject.putOpt("accessToken", this.f16503a);
        }
        if (!TextUtils.isEmpty(this.f16504b)) {
            jSONObject.putOpt(CommonConstant.KEY_USER_IDENTIFY, this.f16504b);
        }
        if (!TextUtils.isEmpty(this.f16505c)) {
            jSONObject.putOpt("sessionId", this.f16505c);
        }
        return jSONObject.toString();
    }
}
