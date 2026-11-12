package com.huami.midong.webview.nativejsapi.apis;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.facebook.appevents.UserDataStore;
import com.google.gson.Gson;
import com.huami.midong.webview.jsbridge.JsBridgeError;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.midong.webview.utils.JsBridgeUtil;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class JsOpenExternalAppFunc extends JsBridgeFunc {
    private static final String CMCC_PACKAGE_NAME = "com.greenpoint.android.mc10086.activity";
    private static final String CT_PACKAGE_NAME = "com.ct.client";
    private static final String HEDUOHAO_PACKAGE_NAME1 = "com.cmic.heduohao";
    private static final String HEDUOHAO_PACKAGE_NAME2 = "com.cmcc.numberportable";
    private static final String UNICOM_PACKAGE_NAME = "com.sinovatech.unicom.ui";
    private Context context;

    public JsOpenExternalAppFunc(Context context) {
        this.context = context;
    }

    private String getCmccEsimAppPackageName() {
        PackageManager packageManager = this.context.getPackageManager();
        if (JsBridgeUtil.isPackageInstalled(HEDUOHAO_PACKAGE_NAME1, packageManager)) {
            return HEDUOHAO_PACKAGE_NAME1;
        }
        HMLog.i(JsBridgeFunc.TAG, "installed com.cmcc.numberportable: " + JsBridgeUtil.isPackageInstalled(HEDUOHAO_PACKAGE_NAME2, packageManager), new Object[0]);
        return HEDUOHAO_PACKAGE_NAME2;
    }

    private void handlerESIM(String str) throws ActivityNotFoundException {
        String cmccEsimAppPackageName;
        Intent launchIntentForPackage;
        if ("cu".equalsIgnoreCase(str)) {
            cmccEsimAppPackageName = UNICOM_PACKAGE_NAME;
        } else if ("cm".equalsIgnoreCase(str)) {
            cmccEsimAppPackageName = getCmccEsimAppPackageName();
        } else if (UserDataStore.CITY.equalsIgnoreCase(str)) {
            cmccEsimAppPackageName = CT_PACKAGE_NAME;
        } else {
            cmccEsimAppPackageName = "cm-separate".equalsIgnoreCase(str) ? CMCC_PACKAGE_NAME : null;
        }
        if (cmccEsimAppPackageName == null || (launchIntentForPackage = this.mNativeApi.getContext().getPackageManager().getLaunchIntentForPackage(cmccEsimAppPackageName)) == null) {
            return;
        }
        launchIntentForPackage.setFlags(268435456);
        startActivity(launchIntentForPackage);
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, JsCallBackFunction jsCallBackFunction) {
        try {
            Log.d(JsBridgeFunc.TAG, "FUNC_OPEN_EXTERNAL_APP data:" + str, new Object[0]);
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("protocol")) {
                jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.missParamError("protocol")));
                return;
            }
            if (!jSONObject.has("behavior")) {
                jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.missParamError("behavior")));
                return;
            }
            String string = jSONObject.getString("protocol");
            String string2 = jSONObject.getString("behavior");
            if ("esim".equalsIgnoreCase(string2)) {
                handlerESIM(string);
            } else {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string + "://" + string2)));
            }
            jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
        } catch (ActivityNotFoundException unused) {
            jsCallBackFunction.onCallBack(new Gson().toJson(new JsBridgeError(4040701L, new String[0])));
        } catch (JSONException e) {
            jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.jsonParseError()));
            Log.e(JsBridgeFunc.TAG, e.getMessage(), e, new Object[0]);
        }
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_OPEN_EXTERNAL_APP;
    }
}
