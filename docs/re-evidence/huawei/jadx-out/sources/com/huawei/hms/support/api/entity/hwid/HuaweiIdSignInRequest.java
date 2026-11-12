package com.huawei.hms.support.api.entity.hwid;

import com.huawei.hms.support.api.hwid.HuaweiIdGetTokenOptions;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HuaweiIdSignInRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    HuaweiIdAuthParams f16509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    HuaweiIdGetTokenOptions f16510b;

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        HuaweiIdAuthParams huaweiIdAuthParams = this.f16509a;
        if (huaweiIdAuthParams != null) {
            jSONObject.put("huaweiIdSignInOptions", huaweiIdAuthParams.toJsonObject());
        }
        HuaweiIdGetTokenOptions huaweiIdGetTokenOptions = this.f16510b;
        if (huaweiIdGetTokenOptions != null) {
            jSONObject.put("huaweiIdGetTokenOptions", huaweiIdGetTokenOptions.toJsonObject());
        }
        return jSONObject.toString();
    }

    public static HuaweiIdSignInRequest fromJson(String str) throws JSONException {
        if (str == null) {
            return null;
        }
        return new HuaweiIdSignInRequest().objectFromJson(new JSONObject(str));
    }

    protected HuaweiIdSignInRequest objectFromJson(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONObject jSONObject3 = jSONObject.getJSONObject("huaweiIdSignInOptions");
        if (jSONObject3 != null) {
            this.f16509a = HuaweiIdAuthParams.fromJsonObject(jSONObject3);
        }
        if (jSONObject.has("huaweiIdGetTokenOptions") && (jSONObject2 = jSONObject.getJSONObject("huaweiIdGetTokenOptions")) != null && jSONObject2.length() > 0) {
            this.f16510b = HuaweiIdGetTokenOptions.fromJsonObject(jSONObject2);
        }
        return this;
    }

    public HuaweiIdAuthParams getHuaweiIdAuthParams() {
        return this.f16509a;
    }

    public void setHuaweiIdAuthParams(HuaweiIdAuthParams huaweiIdAuthParams) {
        this.f16509a = huaweiIdAuthParams;
    }

    public HuaweiIdGetTokenOptions getHuaweiIdGetTokenOptions() {
        return this.f16510b;
    }

    public void setHuaweiIdGetTokenOptions(HuaweiIdGetTokenOptions huaweiIdGetTokenOptions) {
        this.f16510b = huaweiIdGetTokenOptions;
    }
}
