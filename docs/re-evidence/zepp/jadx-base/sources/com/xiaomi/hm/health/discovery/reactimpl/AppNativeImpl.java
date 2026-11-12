package com.xiaomi.hm.health.discovery.reactimpl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import cn.com.smartdevices.bracelet.rom.AliveUtils;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import com.huami.account.HMLoginManager;
import com.huami.account.api.model.HMWebAccess;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.ad.AdRepository;
import com.huami.discovery.bridge.AppNativeFunctionCallback;
import com.huami.discovery.bridge.BridgeCallbackBinder;
import com.huami.discovery.bridge.jsbridge.JsBridgeError;
import com.huami.discovery.bridge.jsbridge.api.JsBridgeApi;
import com.huami.discovery.bridge.jsbridge.util.IOUtil;
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.nfc.web.Constant;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.util.ThirdPartUtil;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.discovery.WebActivityUtil;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.discovery.jsbridge.function.TreadmillNoticeHandler;
import com.xiaomi.hm.health.discovery.reactimpl.AppNativeImpl;
import com.xiaomi.hm.health.locweather.LocWeatherKeeper;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.wxapi.WeChatAPI;
import com.xiaomi.market.sdk.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AppNativeImpl implements AppNativeFunctionCallback {
    private static final String a = "AppNativeImpl";
    private static final float b = -1000.0f;
    private static final String c = "mi";
    private static final String d = "huami";
    private static final String e = "wechat";
    private static final int f = 1;
    private static final List<String> g = Collections.singletonList("sleep:rhythm_h5");

    public static class a {

        @SerializedName("bottomToTabHeight")
        public float a;

        private a() {
        }
    }

    public static class b {

        @SerializedName("uid")
        public String a;

        @SerializedName("token")
        public String b;

        @SerializedName("openType")
        public String c;

        @SerializedName("openId")
        public String d;

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(String str) {
        return "js call pushNotice data is " + str;
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public void debugMsg(String tag, String msg) {
        HMLog.d(tag, msg, new Object[0]);
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public String getDeviceScreenInfo(Context context) {
        a aVar = new a();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        try {
            Display.class.getMethod("getRealMetrics", DisplayMetrics.class).invoke(((WindowManager) context.getSystemService("window")).getDefaultDisplay(), displayMetrics);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        try {
            aVar.a = context.getResources().getDimensionPixelSize(R.dimen.tab_indicator_height) / displayMetrics.density;
        } catch (Exception e2) {
            HMLog.e(a, e2);
        }
        return Utils.getGson().toJson(aVar);
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public String getDevicesInfo(Context context) {
        AliveUtils aliveUtils = AliveUtils.getInstance();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.JSON_VERSION, 1);
            jSONObject.put("version", Build.VERSION.RELEASE);
            jSONObject.put(com.tencent.connect.common.Constants.PARAM_PLATFORM, aliveUtils.getCurrentROM().getRomName() + aliveUtils.getCurrentROM().getHelper().getVersionCode());
            jSONObject.put("brand", aliveUtils.getManufacturer().getPhoneBrand());
            jSONObject.put("model", aliveUtils.getManufacturer().getPhoneModel());
            jSONObject.put("imei", AdRepository.getInstance().getDeviceId());
            jSONObject.put("usid", Analytics.getHmStatAnonymousId(context));
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public int getStatusBarHeight(Context context) {
        return ViewUtils.getStatusBarHeight(context);
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public boolean isLiveEnvironment() {
        return HMServerDef.isProductUrl();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public String locationInfo() {
        String str;
        String str2;
        String str3;
        float f2;
        String locationAddressCode = LocWeatherManager.getInstance().getLocationAddressCode();
        String lastLocationStr = LocWeatherKeeper.getLastLocationStr();
        String str4 = "";
        if (TextUtils.isEmpty(lastLocationStr)) {
            str = "";
            str2 = str;
        } else {
            String[] strArrSplit = lastLocationStr.split(",");
            if (strArrSplit.length > 1) {
                str2 = strArrSplit[0];
                str = strArrSplit[1];
            } else {
                str = "";
                str2 = str;
            }
        }
        String lastLocationDetail = LocWeatherKeeper.getLastLocationDetail();
        boolean zIsEmpty = TextUtils.isEmpty(lastLocationDetail);
        float f3 = b;
        if (zIsEmpty) {
            str3 = "";
            f2 = b;
        } else {
            String[] strArrSplit2 = lastLocationDetail.split(",");
            if (strArrSplit2.length > 3) {
                try {
                    float f4 = Float.parseFloat(strArrSplit2[0]);
                    try {
                        float f5 = Float.parseFloat(strArrSplit2[1]);
                        try {
                            str4 = strArrSplit2[2];
                            try {
                                str3 = strArrSplit2[3];
                                str4 = str4;
                                f3 = f4;
                                f2 = f5;
                            } catch (NumberFormatException e2) {
                                e = e2;
                                f3 = f4;
                                f2 = f5;
                                e.printStackTrace();
                                str3 = "";
                                str4 = str4;
                            }
                        } catch (NumberFormatException e3) {
                            e = e3;
                            str4 = "";
                        }
                    } catch (NumberFormatException e4) {
                        e = e4;
                        f3 = f4;
                        f2 = b;
                        e.printStackTrace();
                        str3 = "";
                        str4 = str4;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Constant.KEY_LATITUDE, f3);
                        jSONObject.put(Constant.KEY_LONGITUDE, f2);
                        jSONObject.put("country", str4);
                        jSONObject.put("province", str2);
                        jSONObject.put("city", str);
                        jSONObject.put("adcode", locationAddressCode);
                        jSONObject.put(IntegrityManager.INTEGRITY_TYPE_ADDRESS, str3);
                        HMLog.d(a, "getLocation:" + jSONObject.toString(), new Object[0]);
                        return jSONObject.toString();
                    }
                } catch (NumberFormatException e5) {
                    e = e5;
                }
            } else {
                str3 = "";
                f2 = b;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(Constant.KEY_LATITUDE, f3);
            jSONObject2.put(Constant.KEY_LONGITUDE, f2);
            jSONObject2.put("country", str4);
            jSONObject2.put("province", str2);
            jSONObject2.put("city", str);
            jSONObject2.put("adcode", locationAddressCode);
            jSONObject2.put(IntegrityManager.INTEGRITY_TYPE_ADDRESS, str3);
        } catch (JSONException e6) {
            HMLog.d(a, "JSONException:" + e6.getMessage(), new Object[0]);
            e6.printStackTrace();
        }
        HMLog.d(a, "getLocation:" + jSONObject2.toString(), new Object[0]);
        return jSONObject2.toString();
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public String navigateTo(Context context, String data) {
        HMLog.i(a, "navigateTo: " + data, new Object[0]);
        if (g.contains(data) && PolicyTipUtil.isNeedIntercept()) {
            PolicyTipUtil.showTip();
            return "{\"status\":\"success\"}";
        }
        JsBridgeApi jsBridgeApi = BridgeCallbackBinder.getInstance().getmJsBridgeApi();
        if (jsBridgeApi != null) {
            data = jsBridgeApi.navigateTo(context, data);
        }
        return !TextUtils.isEmpty(data) ? IOUtil.getGson().toJson(new JsBridgeError(4040601L, data)) : "{\"status\":\"success\"}";
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public void openInNative(Context context, String url, boolean isPreVerify) {
        WebHelper.launch(url, false, isPreVerify);
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public String openMiniProgram(Context context, String type, int miniProgramType, String userName, String path) {
        new WeChatAPI(context).launchMiniProgram(ThirdPartUtil.getWeixinId(), userName, path, miniProgramType);
        return "{\"message \": \"success\"}";
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public void outputMsg(String tag, String msg) {
        HMLog.i(tag, msg, new Object[0]);
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public String pushNotice(final String data) {
        HMLog.info(a, new Function0() { // from class: gh
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return AppNativeImpl.b(data);
            }
        });
        JsonObject asJsonObject = new JsonParser().parse(data).getAsJsonObject();
        JsonObject jsonObject = new JsonObject();
        try {
            if (!asJsonObject.getAsJsonObject().get("type").getAsString().equals("LOGIN_MODAL")) {
                jsonObject.addProperty("errorCode", TreadmillNoticeHandler.ERROR_CODE_MSG_FORMAT_WRONG);
                jsonObject.addProperty("errorMessage", "Invalid payload");
                return jsonObject.toString();
            }
            boolean zIsAnonymousUser = PolicyTipUtil.anonymousPolicyApi().isAnonymousUser();
            jsonObject.addProperty("status", "success");
            jsonObject.addProperty("isAnonymous", Boolean.valueOf(zIsAnonymousUser));
            return jsonObject.toString();
        } catch (Exception unused) {
            HMLog.w("pushNotice", "un handle push notice", new Object[0]);
            jsonObject.addProperty("errorCode", TreadmillNoticeHandler.ERROR_CODE_MSG_FORMAT_WRONG);
            jsonObject.addProperty("errorMessage", "Invalid payload");
            return jsonObject.toString();
        }
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public void thirdMonitor(String adid, boolean onlyShow, String json) {
        AdRepository.getInstance().requestMonitor(json, adid, onlyShow);
    }

    @Override // com.huami.discovery.bridge.AppNativeFunctionCallback
    public String userAgent(Context context) {
        return WebSettings.getDefaultUserAgent(context) + WebActivityUtil.getExtraUAString();
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
        b bVar = new b();
        if (HMLoginManager.isUnInit()) {
            bVar.a = "";
            bVar.b = "";
        } else {
            String lastLoginProvider = HMAccountKeeper.INSTANCE.getLastLoginProvider("xiaomi");
            bVar.a = HMLoginManager.getHuamiId();
            if (HMLoginManager.isOldAccount()) {
                bVar.c = "mi";
                token = HMLoginManager.getSecurity();
            } else if (HMLoginManager.isHuamiSDKLogin()) {
                token = HMWebAccess.getToken();
                if (TextUtils.isEmpty(token)) {
                    HMLog.i(a, "get token error", new Object[0]);
                }
                if ("wechat".equals(lastLoginProvider)) {
                    bVar.c = "wechat";
                } else if ("xiaomi".equals(lastLoginProvider)) {
                    bVar.c = "mi";
                } else {
                    bVar.c = "huami";
                }
            }
            bVar.b = token;
            bVar.d = HMLoginManager.getThirdId();
        }
        return Utils.getGson().toJson(bVar);
    }
}
