package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.watchface.utils.HwLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class x {
    private static final int SUCCESS_CODE = 0;
    public static final String SUCCESS_CODE_STRING = "0";
    private static final String TAG = "BaseResp";
    private t3 result;
    public String retCode = "";

    public t3 getResult() {
        return this.result;
    }

    public boolean isSuccess() {
        t3 t3Var = this.result;
        return t3Var != null && t3Var.a() == 0;
    }

    public void parseResult(String str) {
        t3 t3Var = new t3(-1);
        setResult(t3Var);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("result");
            if (jSONObjectOptJSONObject != null) {
                t3Var.a(jSONObjectOptJSONObject.optInt("resultCode", -1));
                t3Var.a(jSONObjectOptJSONObject.optString("resultInfo"));
            }
        } catch (JSONException unused) {
            HwLog.i(TAG, "parseResult error");
        }
    }

    public void setResult(t3 t3Var) {
        this.result = t3Var;
    }
}
