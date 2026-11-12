package com.huawei.hms.support.api.hwid;

import android.text.TextUtils;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.feature.result.AccountPickerCommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class SignOutResult extends Result {
    public boolean isSuccess() {
        return getStatus().isSuccess();
    }

    public SignOutResult fromJson(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        jsonToSuper(new JSONObject(str));
        return this;
    }

    protected void jsonToSuper(JSONObject jSONObject) {
        String strOptString;
        if (jSONObject.has("errorCode")) {
            int iOptInt = jSONObject.optInt("errorCode");
            if (!jSONObject.has("errorMsg")) {
                strOptString = "";
            } else {
                strOptString = jSONObject.optString("errorMsg");
            }
            setStatus(new Status(iOptInt, strOptString));
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("status");
        if (jSONObjectOptJSONObject != null) {
            setStatus(new Status(jSONObjectOptJSONObject.optInt("statusCode"), jSONObjectOptJSONObject.optString(AccountPickerCommonConstant.KEY_STATUS_MESSAGE, null)));
        }
    }
}
