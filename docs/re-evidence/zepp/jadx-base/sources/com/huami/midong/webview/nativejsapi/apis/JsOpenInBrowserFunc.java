package com.huami.midong.webview.nativejsapi.apis;

import android.content.Intent;
import android.net.Uri;
import com.google.gson.Gson;
import com.huami.midong.webview.jsbridge.JsBridgeError;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.midong.webview.nativejsapi.jsshare.JSShareCreator;
import com.huami.watch.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class JsOpenInBrowserFunc extends JsBridgeFunc {
    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, JsCallBackFunction jsCallBackFunction) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("url")) {
                jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.missParamError("url")));
                return;
            }
            String strOptString = jSONObject.optString("url");
            if (JSShareCreator.isValidUrl(strOptString)) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)));
                jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
            } else {
                jsCallBackFunction.onCallBack(new Gson().toJson(new JsBridgeError(4010401L, new String[0])));
            }
        } catch (JSONException e) {
            jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.jsonParseError()));
            Log.e(JsBridgeFunc.TAG, e.getMessage(), e, new Object[0]);
        }
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_OPEN_IN_BROWSER;
    }
}
