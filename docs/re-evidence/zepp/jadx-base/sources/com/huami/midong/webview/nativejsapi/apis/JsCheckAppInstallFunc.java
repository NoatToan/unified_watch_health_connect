package com.huami.midong.webview.nativejsapi.apis;

import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huami.midong.webview.jsbridge.JsBridgeError;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.watch.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class JsCheckAppInstallFunc extends JsBridgeFunc {
    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, JsCallBackFunction jsCallBackFunction) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("packageName");
            if (!jSONObject.has("packageName")) {
                jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.missParamError("packageName")));
                return;
            }
            if (TextUtils.isEmpty(strOptString)) {
                jsCallBackFunction.onCallBack("{installed:false}");
                return;
            }
            boolean z = true;
            try {
                str2 = this.mNativeApi.getContext().getPackageManager().getPackageInfo(strOptString, 1).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str2 = "";
                z = false;
            }
            jsCallBackFunction.onCallBack("{installed:" + z + ", version:\"" + str2 + "\"}");
        } catch (JSONException e) {
            jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.jsonParseError()));
            Log.e(JsBridgeFunc.TAG, e.getMessage(), e, new Object[0]);
        }
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_CHECK_APP_INSTALL;
    }
}
