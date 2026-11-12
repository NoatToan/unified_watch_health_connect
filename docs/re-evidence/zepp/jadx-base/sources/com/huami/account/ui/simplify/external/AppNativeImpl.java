package com.huami.account.ui.simplify.external;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huami.account.HMLoginManager;
import com.huami.account.api.model.HMWebAccess;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.discovery.bridge.AppNativeFunctionCallback;
import com.huami.discovery.bridge.BridgeCallbackBinder;
import com.huami.discovery.bridge.jsbridge.JsBridgeError;
import com.huami.discovery.bridge.jsbridge.api.JsBridgeApi;
import com.huami.discovery.bridge.jsbridge.util.IOUtil;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.huami.web.service.WebItem;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AppNativeImpl implements AppNativeFunctionCallback {
    private static final String a = "AppNativeImpl";
    private static final float b = -1000.0f;
    private static final String c = "mi";
    private static final String d = "huami";
    private static final String e = "wechat";
    private static final int f = 1;

    public static class b {

        @SerializedName("fullHeight")
        public float a;

        @SerializedName("fullWidth")
        public float b;

        @SerializedName("statusBarHeight")
        public float c;

        @SerializedName("bottomToTabHeight")
        public float d;

        private b() {
        }
    }

    public static class c {

        @SerializedName("uid")
        public String a;

        @SerializedName("token")
        public String b;

        @SerializedName("openType")
        public String c;

        @SerializedName("openId")
        public String d;

        private c() {
        }
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public void debugMsg(String str, String str2) {
        HMLog.d(str, str2, new Object[0]);
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public String getDeviceScreenInfo(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("containerHeight", BridgeCallbackBinder.getInstance().getReactRootViewHeight());
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public String getDevicesInfo(Context context) {
        return null;
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public int getStatusBarHeight(Context context) {
        return 0;
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public boolean isLiveEnvironment() {
        return HMServerDef.isProductUrl();
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public String locationInfo() {
        return "";
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public String navigateTo(Context context, String str) {
        HMLog.i(a, "navigateTo: " + str, new Object[0]);
        JsBridgeApi jsBridgeApi = BridgeCallbackBinder.getInstance().getmJsBridgeApi();
        if (jsBridgeApi != null) {
            str = jsBridgeApi.navigateTo(context, str);
        }
        return !TextUtils.isEmpty(str) ? IOUtil.getGson().toJson(new JsBridgeError(4040601L, str)) : "{\"status\":\"success\"}";
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public void openInNative(Context context, String str, boolean z) {
        WebItem webItem = new WebItem();
        webItem.url = str;
        webItem.isShouldPreVerify = z;
        WebHelper.launch(webItem);
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public String openMiniProgram(Context context, String str, int i, String str2, String str3) {
        return null;
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public void outputMsg(String str, String str2) {
        HMLog.i(str, str2, new Object[0]);
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public void thirdMonitor(String str, boolean z, String str2) {
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public String userAgent(Context context) {
        return "huami-account-module";
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public String userInfo() {
        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", userInfo.getUserid());
            if (HMLoginManager.isHuamiSDKLogin()) {
                jSONObject.put("openType", "huami");
            } else if (HMLoginManager.isOldAccount()) {
                jSONObject.put("openType", "mi");
            }
            jSONObject.put(WebAPI.PARAM_SHARE_INVITE_AVATAR, userInfo.getAvatar());
            jSONObject.put("nickname", userInfo.getNickname());
            jSONObject.put("gender", userInfo.getGender());
            jSONObject.put("birthday", userInfo.getBirthday());
            jSONObject.put("height", userInfo.getHeight());
            jSONObject.put("weight", userInfo.getHeight());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public String usertoken() {
        String token = null;
        c cVar = new c();
        if (HMLoginManager.isUnInit()) {
            cVar.a = "";
            cVar.b = "";
        } else {
            String lastLoginProvider = HMAccountKeeper.INSTANCE.getLastLoginProvider("xiaomi");
            cVar.a = HMLoginManager.getHuamiId();
            if (HMLoginManager.isOldAccount()) {
                cVar.c = "mi";
                token = HMLoginManager.getSecurity();
            } else if (HMLoginManager.isHuamiSDKLogin()) {
                token = HMWebAccess.getToken();
                if (TextUtils.isEmpty(token)) {
                    HMLog.i(a, "get token error", new Object[0]);
                }
                if ("wechat".equals(lastLoginProvider)) {
                    cVar.c = "wechat";
                } else if ("xiaomi".equals(lastLoginProvider)) {
                    cVar.c = "mi";
                } else {
                    cVar.c = "huami";
                }
            }
            cVar.b = token;
            cVar.d = HMLoginManager.getThirdId();
        }
        return HMHttpUtils.getGson().toJson(cVar);
    }
}
