package com.huami.midong.webview.nativejsapi.apis;

import com.facebook.internal.ServerProtocol;
import com.google.gson.Gson;
import com.huami.midong.webview.jsbridge.JsBridgeError;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.watch.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class JsTitleVisibilityFunc extends JsBridgeFunc {
    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, JsCallBackFunction jsCallBackFunction) {
        try {
            Log.d(JsBridgeFunc.TAG, "FUNC_SET_TITLE_VISIBLE", new Object[0]);
            boolean z = new JSONObject(str).getBoolean(ServerProtocol.DIALOG_PARAM_DISPLAY);
            if (this.mNativeApi.getJsTitleCallback() != null) {
                this.mNativeApi.getJsTitleCallback().setTitleVisibility(z);
            }
            jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
        } catch (JSONException e) {
            jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.jsonParseError()));
            Log.e(JsBridgeFunc.TAG, e.getMessage(), e, new Object[0]);
        }
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_SET_TITLE_VISIBLE;
    }
}
