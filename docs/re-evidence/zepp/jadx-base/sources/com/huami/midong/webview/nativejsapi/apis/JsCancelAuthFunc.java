package com.huami.midong.webview.nativejsapi.apis;

import com.facebook.internal.ServerProtocol;
import com.google.gson.Gson;
import com.huami.midong.webview.jsbridge.JsBridgeError;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.midong.webview.widget.WebToolBar;
import com.huami.watch.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class JsCancelAuthFunc extends JsBridgeFunc {
    private String getErrorCallback() {
        return new Gson().toJson(new JsBridgeError(4010401L, "app not handle this action"));
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, JsCallBackFunction jsCallBackFunction) {
        try {
            Log.d(JsBridgeFunc.TAG, "FUNC_SET_CANCEL_AUTH data:" + str, new Object[0]);
            if (this.mNativeApi.getJsTitleCallback() == null) {
                jsCallBackFunction.onCallBack(getErrorCallback());
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            WebToolBar.MenuBuilder menuBuilder = new WebToolBar.MenuBuilder();
            if (jSONObject.optBoolean(ServerProtocol.DIALOG_PARAM_DISPLAY)) {
                menuBuilder.addAuth(jSONObject.optString("url"));
            }
            this.mNativeApi.getJsTitleCallback().setMenu(menuBuilder.build());
            jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
        } catch (JSONException e) {
            jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.jsonParseError()));
            Log.e(JsBridgeFunc.TAG, e.getMessage(), e, new Object[0]);
        }
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_SET_CANCEL_AUTH;
    }
}
