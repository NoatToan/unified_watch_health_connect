package com.huawei.hms.common.internal;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.tencent.connect.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ResponseWrap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ResponseHeader f13071b;

    public ResponseWrap(ResponseHeader responseHeader) {
        this.f13071b = responseHeader;
    }

    public boolean fromJson(String str) {
        if (this.f13071b == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f13071b.setStatusCode(JsonUtil.getIntValue(jSONObject, "status_code"));
            this.f13071b.setErrorCode(JsonUtil.getIntValue(jSONObject, "error_code"));
            this.f13071b.setErrorReason(JsonUtil.getStringValue(jSONObject, "error_reason"));
            this.f13071b.setSrvName(JsonUtil.getStringValue(jSONObject, "srv_name"));
            this.f13071b.setApiName(JsonUtil.getStringValue(jSONObject, "api_name"));
            this.f13071b.setAppID(JsonUtil.getStringValue(jSONObject, "app_id"));
            this.f13071b.setPkgName(JsonUtil.getStringValue(jSONObject, Constants.PARAM_PKG_NAME));
            this.f13071b.setSessionId(JsonUtil.getStringValue(jSONObject, "session_id"));
            this.f13071b.setTransactionId(JsonUtil.getStringValue(jSONObject, "transaction_id"));
            this.f13071b.setResolution(JsonUtil.getStringValue(jSONObject, "resolution"));
            this.f13070a = JsonUtil.getStringValue(jSONObject, TtmlNode.TAG_BODY);
            return true;
        } catch (JSONException e) {
            HMSLog.e("ResponseWrap", "fromJson failed: " + e.getMessage());
            return false;
        }
    }

    public String getBody() {
        if (TextUtils.isEmpty(this.f13070a)) {
            this.f13070a = new JSONObject().toString();
        }
        return this.f13070a;
    }

    public ResponseHeader getResponseHeader() {
        return this.f13071b;
    }

    public void setBody(String str) {
        this.f13070a = str;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.f13071b = responseHeader;
    }

    public String toJson() {
        if (this.f13071b == null) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status_code", this.f13071b.getStatusCode());
            jSONObject.put("error_code", this.f13071b.getErrorCode());
            jSONObject.put("error_reason", this.f13071b.getErrorReason());
            jSONObject.put("srv_name", this.f13071b.getSrvName());
            jSONObject.put("api_name", this.f13071b.getApiName());
            jSONObject.put("app_id", this.f13071b.getAppID());
            jSONObject.put(Constants.PARAM_PKG_NAME, this.f13071b.getPkgName());
            jSONObject.put("transaction_id", this.f13071b.getTransactionId());
            jSONObject.put("resolution", this.f13071b.getResolution());
            String sessionId = this.f13071b.getSessionId();
            if (!TextUtils.isEmpty(sessionId)) {
                jSONObject.put("session_id", sessionId);
            }
            if (!TextUtils.isEmpty(this.f13070a)) {
                jSONObject.put(TtmlNode.TAG_BODY, this.f13070a);
            }
        } catch (JSONException e) {
            HMSLog.e("ResponseWrap", "toJson failed: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "ResponseWrap{body='" + this.f13070a + "', responseHeader=" + this.f13071b + '}';
    }
}
