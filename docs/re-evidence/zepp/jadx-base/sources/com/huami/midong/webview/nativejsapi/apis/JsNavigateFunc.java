package com.huami.midong.webview.nativejsapi.apis;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huami.midong.webview.JsBridgeDelegate;
import com.huami.midong.webview.jsbridge.JsBridgeError;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.watch.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class JsNavigateFunc extends JsBridgeFunc {
    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, JsCallBackFunction jsCallBackFunction) {
        try {
            Log.d(JsBridgeFunc.TAG, "FUNC_NAVIGATE_TO data:" + str, new Object[0]);
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("position");
            String strOptString2 = jSONObject.optString("fallbackEvent");
            if (("login".equals(strOptString) || "discovery".equals(strOptString) || "status".equals(strOptString) || "mine".equals(strOptString) || "smartplay".equals(strOptString)) && !"exit".equals(strOptString2)) {
                jsCallBackFunction.onCallBack(new Gson().toJson(new JsBridgeError(4040603L, strOptString, strOptString2)));
                return;
            }
            if (!"exit".equals(strOptString2) && !"keep".equals(strOptString2) && !"refresh".equals(strOptString2)) {
                jsCallBackFunction.onCallBack(new Gson().toJson(new JsBridgeError(4040602L, strOptString2)));
                return;
            }
            String strNavigateTo = JsBridgeDelegate.getJsBridgeCallback().navigateTo(strOptString);
            if (!TextUtils.isEmpty(strNavigateTo)) {
                jsCallBackFunction.onCallBack(new Gson().toJson(new JsBridgeError(4040601L, strNavigateTo)));
                return;
            }
            if ("exit".equals(strOptString2)) {
                if (this.mNativeApi.getJsTitleCallback() != null) {
                    this.mNativeApi.getJsTitleCallback().onExit();
                }
            } else if ("keep".equals(strOptString2)) {
                Log.d(JsBridgeFunc.TAG, "webView out keep", new Object[0]);
            } else {
                "refresh".equals(strOptString2);
            }
            jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
        } catch (JSONException e) {
            Log.e(JsBridgeFunc.TAG, e.getMessage(), e, new Object[0]);
            jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.jsonParseError()));
        }
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_NAVIGATE_TO;
    }
}
