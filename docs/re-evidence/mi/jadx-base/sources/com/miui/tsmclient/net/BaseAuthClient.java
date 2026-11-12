package com.miui.tsmclient.net;

import android.text.TextUtils;
import com.miui.tsmclient.util.LogUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseAuthClient implements IAuthClient {
    public Object handleResult(String str, AuthRequest.RespContentType respContentType) throws AuthApiException {
        if (TextUtils.isEmpty(str)) {
            throw new AuthApiException(16);
        }
        if (respContentType != AuthRequest.RespContentType.json) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt(IAuthClient.KEY_ERR_CODE);
            if (iOptInt == 200) {
                return jSONObject.opt("data");
            }
            throw new AuthApiException(iOptInt, jSONObject.optString("errDesc"), jSONObject.opt(IAuthClient.KEY_ERR_INFO));
        } catch (JSONException e) {
            LogUtils.e("failed to parse tsm api response", e);
            throw new AuthApiException(16);
        }
    }
}
