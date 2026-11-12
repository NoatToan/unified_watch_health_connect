package com.huawei.operation.utils;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.s.e;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwcommonmodel.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.adapter.PluginOperationAdapter;
import com.huawei.operation.adapter.SendCurrentUrlCallback;
import com.huawei.operation.beans.TitleBean;
import com.huawei.operation.h5pro.H5MiniProgramSecurityHelper;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import defpackage.gxt;
import defpackage.lon;
import defpackage.ltg;
import defpackage.njy;
import defpackage.pee;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.WhiteBoxManager;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class OperationUtils {
    private static final String AI_MARKETING_TWO_COUNTRIES_LOCAL_LIST = "marketing/ai_marketing_two_countries_local_list.json";
    private static final String AI_MARKETING_TWO_MODULE = "ai-marketing-two-001";
    private static final String AI_VMALL_MODULE = "ai-vmall-001";
    private static final String ALL_VERSION = "0";
    private static final int APP_SECRET_TYPE = 1;
    private static final String COUNTRY_LIST_COLON_REGEX = ":";
    private static final String COUNTRY_LIST_REGEX = ",";
    private static final int INTERFACE_VERSION = 2;
    private static final String JSON_KEY_ABROAD_COUNTRY_LIST = "abroad_oversea_list";
    public static final String JSON_KEY_ABROAD_OVERSEA_LIST_BETA = "abroad_oversea_list_beta";
    private static final String NOT_RELEASE_VERSION = "1";
    private static final int REQUEST_CODE = 2001;
    private static final String SP_NAME = "30004";
    private static final int SUCCESS_RESULT_CODE = 0;
    private static final String TAG = "PluginOperation_OperationUtils";
    private static final int TIME_MILLIS_UNIT = 1000;
    private String mHuaweiHost;
    private WhiteBoxManager mWhiteBoxUtil;

    public static int getInterfaceVersion() {
        return 2;
    }

    private OperationUtils() {
        this.mWhiteBoxUtil = WhiteBoxManager.b();
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainWwwHuawei");
        this.mHuaweiHost = url;
        if (TextUtils.isEmpty(url)) {
            LogUtil.j(TAG, "OperationUtils mHuaweiHost is empty");
        }
        LogUtil.d(TAG, "OperationUtils mHuaweiHost = ", this.mHuaweiHost);
    }

    public static OperationUtils getInstance() {
        return Instance.INSTANCE;
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class Instance {
        public static final OperationUtils INSTANCE = new OperationUtils();

        private Instance() {
        }
    }

    public static String getAppId(Context context) {
        if (context != null) {
            if (LoginInit.getInstance(context).isLoginedByWear()) {
                return "com.huawei.bone";
            }
            return context.getPackageName();
        }
        return "";
    }

    public static String getSysVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getTokenType() {
        return String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue());
    }

    public static long getUtc() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(14, -(calendar.get(15) + calendar.get(16)));
        return calendar.getTimeInMillis();
    }

    public static void share(Context context, gxt gxtVar, boolean z) {
        SocialShareCenterApi socialShareCenterApi = (SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class);
        gxtVar.e(z);
        socialShareCenterApi.exeShare(gxtVar, context);
    }

    public static final <T> T fromJson(String str, TypeToken<T> typeToken) {
        try {
            return (T) new Gson().fromJson(str, typeToken.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.a(TAG, "Gson to List error");
            return null;
        }
    }

    public static TitleBean getTitleBean(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "getTitleBean: url is empty");
            return null;
        }
        TitleBean titleBean = new TitleBean();
        titleBean.configSetUrl(str);
        titleBean.configSetLeftBtn(str2);
        titleBean.configSetRightBtn(str3);
        titleBean.configSetShoppingCartUrl("");
        titleBean.configSetFeatureUrl("");
        titleBean.configSetOrderManagerUrl("");
        return titleBean;
    }

    private String getScopeByType(int i) {
        switch (i) {
            case 3:
                return this.mHuaweiHost + UriConstants.READ_SLEEP_DATA;
            case 4:
                return this.mHuaweiHost + UriConstants.READ_BLOOD_SUGAR;
            case 5:
                return this.mHuaweiHost + UriConstants.READ_BLOOD_PRESSURE;
            case 6:
            default:
                return "";
            case 7:
                return this.mHuaweiHost + UriConstants.READ_HEART_RATE;
            case 8:
                return this.mHuaweiHost + UriConstants.READ_WEIGHT;
            case 9:
                return this.mHuaweiHost + UriConstants.READ_SLEEP_DATA;
            case 10:
                return this.mHuaweiHost + UriConstants.READ_PRESSURE;
        }
    }

    public static long getUtcTime() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeInMillis);
        return calendar.getTimeInMillis();
    }

    private HashMap<String, String> initParamsRequest(Context context, String str) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        HashMap<String, String> map = new HashMap<>(16);
        if (LoginInit.getInstance(context).isLoginedByWear()) {
            map.put("appId", "com.huawei.bone");
        } else {
            map.put("appId", BaseApplication.getAppPackage());
        }
        String deviceId = LoginInit.getInstance(context).getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            deviceId = "clientnull";
        }
        map.put("deviceId", deviceId);
        map.put("bindDeviceType", String.valueOf(CommonUtil.h(context)));
        map.put("upDeviceType", LoginInit.getInstance(context).getDeviceType());
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008);
        if (!TextUtils.isEmpty(accountInfo)) {
            try {
                map.put("token", URLEncoder.encode(accountInfo, StandardCharsets.UTF_8.name()));
            } catch (UnsupportedEncodingException e) {
                LogUtil.e(TAG, "token encode Exception ", e.toString());
            }
        }
        map.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        map.put("iVersion", "1");
        map.put("phoneType", PhoneInfoUtils.getPhoneType());
        map.put("deviceType", PhoneInfoUtils.getDeviceModel());
        map.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put("wearType", "");
        map.put("ts", String.valueOf(getUtcTime()));
        map.put("language", "language");
        map.put("accessToken", str);
        return map;
    }

    private boolean isHuidValid(Context context, String str) {
        if (context == null) {
            return false;
        }
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        HashMap map = new HashMap(16);
        map.put("x-huid", accountInfo);
        map.put("x-version", CommonUtil.c(context));
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainHealthcommonHicloud");
        if (TextUtils.isEmpty(url)) {
            LogUtil.j(TAG, "isHuidValid urlAuthInfoDomain is empty");
            return false;
        }
        String strA = ltg.a(url + Constants.URL_AUTH_TOKEN, initParamsRequest(context, str), map);
        if (strA == null) {
            LogUtil.a(TAG, "The result is null! ");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strA);
            int i = jSONObject.getInt("resultCode");
            if (i == 0) {
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.RESPONSE_AUTH_INFO);
                    if (!jSONObject2.isNull("uid") && jSONObject2.getString("uid").equals(accountInfo)) {
                        return true;
                    }
                    LogUtil.a(TAG, "Error! The uid is illegal!");
                    return false;
                } catch (JSONException e) {
                    LogUtil.a(TAG, "parse param json fail! AuthInfo exception is ", e.getMessage());
                    return false;
                }
            }
            LogUtil.a(TAG, "Error! The result resCode is ", Integer.valueOf(i));
            return false;
        } catch (JSONException e2) {
            LogUtil.a(TAG, "parse param json fail! e is ", e2.getMessage());
            return false;
        }
    }

    private HashMap<String, String> initParam(String str) {
        HashMap<String, String> map = new HashMap<>(16);
        map.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_OPENID, "OPENID");
        map.put(com.tencent.connect.common.Constants.PARAM_ACCESS_TOKEN, str);
        return map;
    }

    private HashMap<String, String> initHeader(String str) {
        HashMap<String, String> map = new HashMap<>(16);
        map.put("Content-Type", "text/xml");
        map.put("Host", str);
        map.put("Connection", "Keep-Alive");
        map.put("User-Agent", "Apache-HttpClient/4.1.1 (java 1.5)");
        return map;
    }

    public boolean doAccessTokenCheck(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.a(TAG, "(accessTokenParam is null) || (scope is null)");
            return false;
        }
        try {
            String strEncode = URLEncoder.encode(str.trim(), "UTF-8");
            if (!isHuidValid(context, strEncode)) {
                LogUtil.a(TAG, "The token does not suit!");
                return false;
            }
            String tokenKeyUrlSp = WebViewUtils.getTokenKeyUrlSp(context);
            String strA = ltg.a(tokenKeyUrlSp + "/rest.php?nsp_ts=" + (System.currentTimeMillis() / 1000) + "&nsp_svc=huawei.oauth2.user.getTokenInfo", initParam(strEncode), initHeader(Utils.getHostByJdk(tokenKeyUrlSp)));
            LogUtil.d(TAG, "doAccessTokenCheck after postRequest");
            if (strA == null) {
                return false;
            }
            try {
                String string = new JSONObject(strA).getString("scope");
                LogUtil.d(TAG, "cloudScope = ", string);
                if (string == null) {
                    LogUtil.a(TAG, "cloudScope is null");
                    return false;
                }
                String[] strArrSplit = string.split(" ");
                LogUtil.a(TAG, "scopes.length = ", Integer.valueOf(strArrSplit.length));
                for (String str3 : strArrSplit) {
                    if (str3.equals(str2)) {
                        return true;
                    }
                }
                LogUtil.a(TAG, "scope is not exit cloudScope!");
                return false;
            } catch (JSONException e) {
                LogUtil.e(TAG, "parse param json fail! exception is ", e.getMessage());
                return false;
            }
        } catch (UnsupportedEncodingException e2) {
            LogUtil.e(TAG, "doHttpPost exception is ", e2.getMessage());
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        if (r10.startsWith(r5 + "/") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        if (r10.startsWith(r4 + "/") != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isMiaoUrl(SendCurrentUrlCallback sendCurrentUrlCallback) {
        if (sendCurrentUrlCallback == null) {
            return false;
        }
        String currentUrl = sendCurrentUrlCallback.getCurrentUrl();
        if (TextUtils.isEmpty(currentUrl)) {
            LogUtil.a(TAG, "isMiaoUrl url is : empty");
            return false;
        }
        String strD = lon.c().d("domain_mlhwm_miaohealth_net");
        String strD2 = lon.c().d("domain_mlhwmtest_miaohealth_net");
        String strD3 = lon.c().d("domain_pay_miaohealth_net");
        String strD4 = lon.c().d("domain_paytest_miaohealth_net");
        if (CommonUtil.cl()) {
            if (!currentUrl.startsWith(strD2 + "/")) {
            }
            return true;
        }
        if (!currentUrl.startsWith(strD + "/")) {
        }
        return true;
        LogUtil.a(TAG, "isMiaoUrl url is : false");
        return false;
    }

    public Map<String, Object> jsonToMap(String str) {
        HashMap map = new HashMap(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                if (string == null) {
                    map.put(next, "");
                } else {
                    map.put(next, string);
                }
            }
        } catch (JSONException e) {
            LogUtil.e(TAG, e.getMessage());
        }
        LogUtil.d(TAG, "jsonToMap");
        return map;
    }

    public boolean checkFunctionIsLegal(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter, String str) {
        int i;
        String string = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            string = jSONObject.getString("accessToken");
            i = jSONObject.getInt("type");
        } catch (JSONException e) {
            LogUtil.e(TAG, "getHealthData JSONException param fail exception = ", e.getMessage());
            i = 0;
        }
        return checkUrlIsLegalNewForWeb(context, sendCurrentUrlCallback, pluginOperationAdapter, string, getScopeByType(i));
    }

    public boolean checkUrlIsLegalNewForWeb(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter, String str, String str2) {
        if (!Utils.needAuth(context)) {
            LogUtil.a(TAG, "checkUrlIsLegalNew do not need auth version!");
            return true;
        }
        if (sendCurrentUrlCallback == null || pluginOperationAdapter == null) {
            return false;
        }
        if (pluginOperationAdapter.checkWhiteUrl(sendCurrentUrlCallback.getWebViewUrl())) {
            LogUtil.a(TAG, "checkUrlIsLegalNew is White url");
            return true;
        }
        if (H5MiniProgramSecurityHelper.isSuperTrustedMiniProgram(sendCurrentUrlCallback.getWebViewUrl())) {
            LogUtil.a(TAG, "checkUrlIsLegalNew is isSuperTrustedMiniProgram");
            return true;
        }
        return getInstance().doAccessTokenCheck(context, str, str2);
    }

    public boolean checkUrlIsLegalForWeb(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter, String str) {
        String host;
        if (!Utils.needAuth(context)) {
            LogUtil.a(TAG, "checkUrlIsLegal do not need auth version!");
            return true;
        }
        if (sendCurrentUrlCallback == null || pluginOperationAdapter == null) {
            return false;
        }
        String webViewUrl = sendCurrentUrlCallback.getWebViewUrl();
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        if (webViewUrl.startsWith("https://") || webViewUrl.startsWith("http://")) {
            LogUtil.a(TAG, "url.startsWith(\"https://\") || url.startsWith(\"http://\")");
            host = Uri.parse(webViewUrl).getHost();
        } else {
            host = null;
        }
        if (PluginOperation.getInstance(context).getActivityFlag()) {
            LogUtil.a(TAG, "checkUrlIsLegal WebViewActivity.getActiveFlag() = true");
            if (str != null && str.equals(host)) {
                LogUtil.a(TAG, "(mUrlLoginHost != null) && (mUrlCheckHost != null)");
                webViewUrl = Constants.HEALTH_LOGIN + webViewUrl;
            }
        } else {
            LogUtil.a(TAG, "checkUrlIsLegal WebViewActivity.getActiveFlag() = false");
        }
        return pluginOperationAdapter.checkCurrentUrlAuth(webViewUrl, accountInfo);
    }

    public boolean checkPersonalPrivacySettingsUrlIsLegal(Context context, SendCurrentUrlCallback sendCurrentUrlCallback, PluginOperationAdapter pluginOperationAdapter, String str) {
        String string;
        LogUtil.a(TAG, "checkPersonalPrivacySettingsUrlIsLegal");
        try {
            string = new JSONObject(str).getString("accessToken");
        } catch (JSONException e) {
            LogUtil.e(TAG, "checkIsLegal JSONException param fail exception = ", e.getMessage());
            string = "";
        }
        return checkUrlIsLegalNewForWeb(context, sendCurrentUrlCallback, pluginOperationAdapter, string, this.mHuaweiHost + UriConstants.READ_PERSONAL_PROFILE);
    }

    public String parseJsonFromShop(String str, String str2) {
        String str3;
        String str4;
        if (Constants.SHOP_TYPE_MIAO.equals(str2)) {
            str3 = "mpqlf0xjydgwtp9es7";
            StringBuilder sb = new StringBuilder(16);
            sb.append(this.mWhiteBoxUtil.a(1, 1) + this.mWhiteBoxUtil.a(1, 1001) + this.mWhiteBoxUtil.a(1, 2001));
            try {
                str4 = new String(this.mWhiteBoxUtil.a(Base64.decode(sb.toString(), 0)), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                LogUtil.e(TAG, e.getMessage());
                str4 = "";
            }
        } else {
            str3 = "";
            str4 = str3;
        }
        StringBuilder sb2 = new StringBuilder(16);
        TreeMap treeMap = new TreeMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                if (string == null) {
                    treeMap.put(next, "");
                } else {
                    treeMap.put(next, string);
                }
            }
        } catch (JSONException e2) {
            LogUtil.e(TAG, e2.getMessage());
        }
        treeMap.put("open_appid", str3);
        for (Map.Entry entry : treeMap.entrySet()) {
            sb2.append((String) entry.getKey());
            sb2.append("=");
            sb2.append((String) entry.getValue());
            sb2.append("&");
        }
        String str5 = sb2.substring(0, sb2.length() - 1) + str4;
        LogUtil.d(TAG, str5);
        return str5;
    }

    public static String getShopHomePageUrl() {
        String string = "";
        try {
            string = getVmallRules().getString("homePage");
            LogUtil.d(TAG, "homePageUrl: ", string);
            return string;
        } catch (JSONException unused) {
            LogUtil.j(TAG, "getShopCenterUrl JSONException.");
            return string;
        }
    }

    public static boolean isVmallWrapSwitch() {
        try {
            boolean z = getVmallRules().getBoolean("enableVmallWrap");
            LogUtil.d(TAG, "getVmallWrapSwitch isVmallSwitchOpen:", Boolean.valueOf(z));
            return z;
        } catch (JSONException unused) {
            LogUtil.j(TAG, "getShopCenterUrl JSONException.");
            return false;
        }
    }

    public static String newPathConcat(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "newPathConcat oldUrl is empty");
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.contains("?")) {
            sb.append("&");
        } else {
            sb.append("?");
        }
        sb.append(str2);
        sb.append("=");
        sb.append(str3);
        LogUtil.d(TAG, "newPathConcat newUrl is ", sb.toString());
        return sb.toString();
    }

    public static JSONObject getVmallRules() {
        String strE = SharedPreferenceManager.e(com.huawei.haf.application.BaseApplication.b(), SP_NAME, AI_VMALL_MODULE);
        JSONObject jSONObject = new JSONObject();
        try {
            return new JSONObject(strE).getJSONObject(e.n);
        } catch (JSONException unused) {
            LogUtil.e(TAG, "JSONException");
            return jSONObject;
        }
    }

    public static boolean isOperation(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e(TAG, "countryCode is empty");
            return false;
        }
        ArrayList<String> cloudRules = getCloudRules("ai-operation-001");
        if (cloudRules == null) {
            LogUtil.j(TAG, "isOperation() operationCountryList is null.");
            try {
                String[] stringArray = BaseApplication.getContext().getResources().getStringArray(R.array.operation_code);
                ArrayList<String> arrayList = new ArrayList<>();
                Collections.addAll(arrayList, stringArray);
                cloudRules = arrayList;
            } catch (Resources.NotFoundException | IllegalArgumentException | UnsupportedOperationException e) {
                LogUtil.e(TAG, "isOperation() meet exception: ", e.getMessage());
                return false;
            }
        }
        Iterator<String> it = cloudRules.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean switchToMarketingTwo() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.a(TAG, "switchToMarketingTwo countryCode");
            return true;
        }
        ArrayList<String> cloudRules = getCloudRules(AI_MARKETING_TWO_MODULE);
        LogUtil.a(TAG, "marketingTwoCountryList: ", cloudRules);
        if (njy.e(cloudRules)) {
            LogUtil.a(TAG, "switchToMarketingTwo marketingTwoCountryList is empty");
            return false;
        }
        return cloudRules.contains(accountInfo);
    }

    public static boolean isModuleOperatedToOversea(String str) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.j(TAG, "isModuleOperatedToOversea countryCode");
            return true;
        }
        ArrayList<String> cloudRules = getCloudRules(str);
        LogUtil.a(TAG, "isModuleOperatedToOversea: ", cloudRules);
        if (njy.e(cloudRules)) {
            LogUtil.j(TAG, "isModuleOperatedToOversea countryList is empty");
            return false;
        }
        return cloudRules.contains(accountInfo);
    }

    public static boolean isSupportCountry(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e(TAG, "countryCode is empty");
            return false;
        }
        ArrayList<String> cloudRules = getCloudRules(str2);
        if (cloudRules == null) {
            LogUtil.j(TAG, "isOperation() operationCountryList is null.");
            try {
                String[] stringArray = BaseApplication.getContext().getResources().getStringArray(i);
                ArrayList<String> arrayList = new ArrayList<>();
                Collections.addAll(arrayList, stringArray);
                cloudRules = arrayList;
            } catch (Resources.NotFoundException | IllegalArgumentException | UnsupportedOperationException e) {
                LogUtil.e(TAG, "isOperation() meet exception: ", e.getMessage());
                return false;
            }
        }
        Iterator<String> it = cloudRules.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    private static String getCloudRulesJson(String str) {
        Context contextB = com.huawei.haf.application.BaseApplication.b();
        String strE = SharedPreferenceManager.e(contextB, String.valueOf(30004), str);
        return (AI_MARKETING_TWO_MODULE.equals(str) && TextUtils.isEmpty(strE)) ? pee.a(contextB, AI_MARKETING_TWO_COUNTRIES_LOCAL_LIST) : strE;
    }

    private static ArrayList<String> getCloudRules(String str) {
        String[] strArrSplit;
        String cloudRulesJson = getCloudRulesJson(str);
        if (!TextUtils.isEmpty(cloudRulesJson)) {
            ArrayList<String> arrayList = new ArrayList<>();
            try {
                JSONObject jSONObject = new JSONObject(cloudRulesJson).getJSONObject(e.n);
                if (jSONObject.has(JSON_KEY_ABROAD_COUNTRY_LIST)) {
                    String string = jSONObject.getString(JSON_KEY_ABROAD_COUNTRY_LIST);
                    if (string == null) {
                        LogUtil.j(TAG, "getCloudRules() overseaCountryString is null");
                        return null;
                    }
                    String[] strArrSplit2 = string.split(",");
                    if (strArrSplit2 == null) {
                        LogUtil.j(TAG, "getCloudRules() countryIncludeFlagList is null");
                        return null;
                    }
                    for (String str2 : strArrSplit2) {
                        if (str2 != null && (strArrSplit = str2.split(":")) != null && strArrSplit.length > 0) {
                            String str3 = strArrSplit.length > 1 ? strArrSplit[1] : "0";
                            if (!CommonUtil.bu() || TextUtils.isEmpty(str3) || !"1".equals(str3)) {
                                arrayList.add(strArrSplit[0]);
                            }
                        }
                    }
                    return arrayList;
                }
            } catch (JSONException unused) {
                LogUtil.e(TAG, "getCloudRules() JSONException");
                return null;
            }
        }
        return null;
    }

    public static String getUserPrivacyFromCloud(String str) {
        Map<String, String> cloudRulesByPrivacy = getCloudRulesByPrivacy(str);
        if (cloudRulesByPrivacy == null) {
            ReleaseLogUtil.d(TAG, "getUserPrivacyFromCloud map is null");
            return "";
        }
        String accountInfo = LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).getAccountInfo(1010);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.d(TAG, "getUserPrivacyFromCloud countryCode ", accountInfo);
            return "";
        }
        if (!cloudRulesByPrivacy.containsKey(accountInfo)) {
            ReleaseLogUtil.d(TAG, "getUserPrivacyFromCloud countryCode ", accountInfo, " map ", cloudRulesByPrivacy);
            return "";
        }
        return cloudRulesByPrivacy.get(accountInfo);
    }

    private static Map<String, String> getCloudRulesByPrivacy(String str) {
        String strOptString;
        String cloudRulesJson = getCloudRulesJson(str);
        if (TextUtils.isEmpty(cloudRulesJson)) {
            ReleaseLogUtil.d(TAG, "getCloudRulesByPrivacy json ", cloudRulesJson);
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(cloudRulesJson);
            if (!jSONObject.optBoolean(k.g)) {
                ReleaseLogUtil.d(TAG, "getCloudRulesByPrivacy isEnable false");
                return Collections.EMPTY_MAP;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(e.n);
            if (jSONObjectOptJSONObject == null) {
                ReleaseLogUtil.d(TAG, "getCloudRulesByPrivacy params is null");
                return null;
            }
            if (CommonUtil.bu()) {
                strOptString = "";
            } else {
                strOptString = jSONObjectOptJSONObject.optString(JSON_KEY_ABROAD_OVERSEA_LIST_BETA);
            }
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObjectOptJSONObject.optString(JSON_KEY_ABROAD_COUNTRY_LIST);
            }
            if (TextUtils.isEmpty(strOptString)) {
                return Collections.EMPTY_MAP;
            }
            String[] strArrSplit = strOptString.split(",");
            HashMap map = new HashMap();
            for (String str2 : strArrSplit) {
                if (!TextUtils.isEmpty(str2)) {
                    String[] strArrSplit2 = str2.split(":");
                    if (strArrSplit2.length >= 2) {
                        map.put(strArrSplit2[0], strArrSplit2[1]);
                    }
                }
            }
            return map;
        } catch (JSONException e) {
            ReleaseLogUtil.b(TAG, "getCloudRulesByPrivacy exception ", ExceptionUtils.c(e));
            return null;
        }
    }
}
