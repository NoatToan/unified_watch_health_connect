package com.baidu.ocr.sdk.utils;

import com.baidu.ocr.sdk.exception.SDKError;
import com.baidu.ocr.sdk.model.AccessToken;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AccessTokenParser implements Parser<AccessToken> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.baidu.ocr.sdk.utils.Parser
    public AccessToken parse(String str) throws SDKError {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.isNull("status")) {
                throw new SDKError(283505, "Server illegal response " + str);
            }
            int iOptInt = jSONObject.optInt("status");
            if (iOptInt != 0) {
                throw new SDKError(iOptInt, jSONObject.optString("message") + " logId: " + Long.valueOf(jSONObject.optLong("log_id")));
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            AccessToken accessToken = new AccessToken();
            accessToken.setTokenJson(str);
            accessToken.setAccessToken(jSONObjectOptJSONObject.getString("access_token"));
            if (jSONObjectOptJSONObject.has("lic")) {
                accessToken.setLic(jSONObjectOptJSONObject.getString("lic"));
            }
            accessToken.setExpiresIn(jSONObjectOptJSONObject.optInt("expires_in"));
            return accessToken;
        } catch (JSONException e) {
            throw new SDKError(283505, "Server illegal response " + str, e);
        }
    }
}
