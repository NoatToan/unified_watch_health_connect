package com.huami.midong.webview.nativejsapi.apis;

import android.graphics.Color;
import com.google.gson.Gson;
import com.huami.midong.webview.jsbridge.JsBridgeError;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.watch.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class JsTitleFgColorFunc extends JsBridgeFunc {
    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, JsCallBackFunction jsCallBackFunction) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("r", -1);
            int iOptInt2 = jSONObject.optInt("g", -1);
            int iOptInt3 = jSONObject.optInt("b", -1);
            float fOptDouble = (float) jSONObject.optDouble("a", -1.0d);
            if (iOptInt >= 0 && iOptInt <= 255 && iOptInt2 >= 0 && iOptInt2 <= 255 && iOptInt3 >= 0 && iOptInt3 <= 255) {
                if (fOptDouble <= 1.0f && fOptDouble >= 0.0f) {
                    int iArgb = Color.argb((int) (fOptDouble * 255.0f), iOptInt, iOptInt2, iOptInt3);
                    if (this.mNativeApi.getJsTitleCallback() != null) {
                        this.mNativeApi.getJsTitleCallback().setTitleFgColor(iArgb);
                    }
                    jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
                    return;
                }
                jsCallBackFunction.onCallBack(new Gson().toJson(new JsBridgeError(4020202L, new String[0])));
                return;
            }
            jsCallBackFunction.onCallBack(new Gson().toJson(new JsBridgeError(4020201L, new String[0])));
        } catch (JSONException e) {
            jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.jsonParseError()));
            Log.e(JsBridgeFunc.TAG, "param to json error", e, new Object[0]);
        }
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_SET_TITLE_FG_COLOR;
    }
}
