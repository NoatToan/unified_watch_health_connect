package com.huami.midong.webview.nativejsapi.apis;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huami.midong.webview.jsbridge.JsBridgeError;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.watch.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class JsSyncWatchSkinFunc extends JsBridgeFunc {
    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, JsCallBackFunction jsCallBackFunction) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("device_type", "unKnown");
            String strOptString2 = jSONObject.optString("name", "unKnown");
            String strOptString3 = jSONObject.optString("skin_bin", null);
            Log.d(JsBridgeFunc.TAG, " device type " + strOptString + "  filename " + strOptString2 + "   addressurl " + strOptString3, new Object[0]);
            if (TextUtils.isEmpty(strOptString3)) {
                jsCallBackFunction.onCallBack(new Gson().toJson(new JsBridgeError(JsBridgeError.ERR_CODE_NULL_DOWNURL, new String[0])));
            } else {
                if (this.mNativeApi.getSyncWatchSkinCallback() != null) {
                    this.mNativeApi.getSyncWatchSkinCallback().syncWatchSkin(str);
                }
                jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
            }
        } catch (JSONException e) {
            jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.jsonParseError()));
            Log.e(JsBridgeFunc.TAG, e.getMessage(), e, new Object[0]);
        }
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_SYNC_WATCH_SKIN;
    }
}
