package com.huami.watch.companion.cloud;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.passport.AccountManager;
import com.huami.passport.entity.Token;
import com.huami.watch.util.AppUtil;
import com.huami.watch.util.I18nUtil;
import com.huami.watch.util.Log;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes16.dex */
public class Cloud {
    private static final String A = "/devices/WATCH/hasNewVersion";
    private static final String A0 = "/pages/huami.watch.sync";
    private static final String B = "/apps/%s/settings";
    private static final String B0 = "/users/%s/events";
    private static final String C = "/users/%s/apps/%s/fileAccessURIs";
    private static final String C0 = "/users/%s/apps/%s/fileUploadURIs";
    private static final String D = "/apps/%s/fileTypes/%s/files";
    private static final String D0 = "/users/%s/rrPeak";
    private static final String E = "/users/%s/devices";
    private static final String E0 = "/users/%s/ppg/afResult";
    private static final String F = "/users/%s/mobileAppActivities?activityType=LOGIN_TAG";
    private static final String F0 = "/users/%s/ECGHealthData";
    public static final String FILE_TYPE_AGPS_ALM_ZIP = "AGPS_ALM";
    public static final String FILE_TYPE_AGPS_ZIP = "AGPSZIP";
    public static final String FILE_TYPE_QUALCOMM = "QUALCOMM";
    private static final String G = "/v1/sport/third/certification.json";
    private static final String G0 = "/users/%s/stateTags/%s";
    private static final String H = "/users/%s/deviceTypes/%s/data";
    private static final String H0 = "/users/%s/apps/%s/fileUploadURIs";
    private static final String I = "/users/%s/latestEffectiveUpdateTime";
    private static final String I0 = "/users/%s/ECGHealthData/upload";
    private static final String J = "/users/%s/heartRate";
    private static final String J0 = "/t/posts/watch?meta_key=tag&category=%s&meta_value=faq";
    private static final String K = "/watch/users/%s/WatchSportStatistics/%s";
    private static final String K0 = "/market/watch/apps/%s";
    private static final String L = "/watch/users/%s/WatchSportStatistics/NEWEST_FIRSTBEAT_DATA";
    private static final String L0 = "/oauth2/access_token?";
    private static final String M = "/v1/sport/run/history.json";
    private static final String N = "/v1/sport/run/detail.json";
    private static final String O = "/v1/sport/run/stat.json";
    private static final String P = "/v1/sport/run/summary.json";
    private static final String Q = "/user/%s/sortedValues";
    private static final String R = "/v1/thirdParties/auth.json";
    private static final String S = "/huami.partner.bindThirdApp.json";
    private static final String T = "/huami.partner.getAppToken.json";
    public static final String THIRD_PRODUCTION_HOST = "https://thirdparty-us-v2.huami.com";
    public static final String THIRD_TEST_HOST = "https://api-thirdpart-staging-us.huami.com";
    private static final String U = "/city/search";
    public static final String URL_GET_TOKEN = "/thirdParties/oauth2/list";
    public static final String URL_REFRESH_TOKEN = "/oauth2/refresh_token";
    public static final String URL_THIRD_REVOKE = "/oauth2/revoke";
    private static final String V = "/weather/current";
    private static final String W = "/weather/forecast";
    private static final String X = "/weather/aqi/current";
    private static final String Y = "/city/search";
    private static final String Z = "/weather/alerts";
    private static final String a0 = "/miot/bind";
    private static final String b0 = "/miot/unbind";
    private static final String c0 = "/miot/getVoiceCtrlToken";
    private static final String d0 = "/users/%s/romPublicPreview";
    private static final String e0 = "/pages/huami.watch.room.flash";
    private static final String f0 = "/pages/huami.watch.help.list";
    private static final String g0 = "/pages/huami.watch.help.device.v2";
    private static final String h0 = "/v1/info/users.json";
    private static final String i = "Cloud";
    private static final String i0 = "/v1/bind/qrcode.json";
    public static final String j = "https://api-watch.huami.com";
    private static final String j0 = "/t/amazfit.watch.skins";
    private static final String k = "https://api-watch-staging.huami.com";
    private static final String k0 = "/t/amazfit.watch.skins.tripartite.%s";
    public static final String l = "https://api-mifit.huami.com";
    private static final String l0 = "/apps/pageVersions";
    private static final String m = "https://api-mifit-staging.huami.com";
    private static final String m0 = "/apps/redirectPages";
    public static final String n = "https://api.amazfit.com";
    private static final String n0 = "/users/%s/minorAuthorization";
    private static final String o = "https://api-staging.amazfit.com";
    private static final String o0 = "/t/reconfirmation";
    private static final String p = "https://huami-irun-sdk-swagger.mi-ae.net";
    private static final String p0 = "/t/reconfirmation_disney";
    private static final transient String q = "https://weixin.amazfit.com";
    private static final String q0 = "/users/%s/gdpr/state";
    private static final transient String r = "https://api-watch-staging.huami.com";
    private static final String r0 = "/discovery/%s/discovery/%s";
    private static final String s = "https://weather-xm.mi-ae.net";
    private static final String s0 = "/apps/%s/files/%s/diagnoseFileAccessURIs";
    private static final String t = "source=mihealth";
    private static final String t0 = "/apps/%s/files/%s/diagnoseFileUpload";
    private static Cloud u = null;
    private static final String u0 = "/t/posts/mifit?meta_key=aid&category=1&adcode=%s&userid=%s&meta_value=%s";
    private static ConfigCallBack v = null;
    private static final String v0 = "/t/posts/%s/version";
    private static final String w = "/users";
    private static final String w0 = "/pages/huami.watch.unionpay.faq";
    private static final String x = "/v1/watch/user_info.json";
    private static final String x0 = "/nfc/bindings";
    private static final String y = "/users/%s/properties";
    private static final String y0 = "/pages/huami.watch.connect.android";
    private static final String z = "/apps/%s/hasNewVersion";
    private static final String z0 = "/pages/huami.watch.manual.connect.error.android";
    private OkHttpClient a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    public interface ConfigCallBack {
        Context getContext();

        List<Interceptor> getNetworkInterceptors();

        String getUserAgent();

        boolean isAccountOversea();

        boolean isTestHosts();
    }

    public static final class SysParams {
        public static final String ANDROID_PHONE = "android_phone";
        public static String APP_NAME = "com.huami.midong";
        public static final String CONSTANT_APPNAME = "appname";
        public static final String CONSTANT_APPPLATFORM = "appplatform";
        public static final String CONSTANT_APPTOKEN = "apptoken";
        public static final String CONSTANT_CALLID = "callid";
        public static final String CONSTANT_CHANNEL = "channel";
        public static final String CONSTANT_COUNTRY = "country";
        public static final String CONSTANT_CV = "cv";
        public static final String CONSTANT_LANG = "lang";
        public static final String CONSTANT_PRIVACY_CEIP = "hm-privacy-ceip";
        public static final String CONSTANT_PRIVACY_DIAGNOSTICS = "hm-privacy-diagnostics";
        public static final String CONSTANT_TIMEZONE = "timezone";
        public static final String CONSTANT_USER_ID = "userid";
        public static final String CONSTANT_V = "v";
        private static final String a = "1.0";
        private static Map<String, String> b;

        private SysParams() {
        }

        private static void a(@NonNull Context context, Map<String, String> map) {
            String str = APP_NAME;
            String metaDataChannel = AppUtil.getMetaDataChannel(context);
            String str2 = AppUtil.getVersionCode(context) + "_" + AppUtil.getVersionName(context);
            map.put("appname", str);
            map.put("channel", metaDataChannel);
            map.put("appplatform", "android_phone");
            map.put("cv", str2);
            map.put("v", "1.0");
            map.put("hm-privacy-diagnostics", String.valueOf(false));
            map.put("hm-privacy-ceip", String.valueOf(false));
        }

        @NonNull
        public static synchronized Map<String, String> get(@NonNull Context context) {
            if (b == null) {
                HashMap map = new HashMap();
                b = map;
                a(context, map);
            }
            String localeCountry = I18nUtil.getLocaleCountry(context);
            String localeStr = I18nUtil.getLocaleStr(context);
            String id = TimeZone.getDefault().getID();
            b.put("country", localeCountry);
            b.put("lang", localeStr);
            b.put("timezone", id);
            return b;
        }

        @NonNull
        public static Map<String, String> newHeaders(@NonNull Context context, String str) {
            HashMap map = new HashMap(get(context));
            map.put("callid", String.valueOf(System.currentTimeMillis()));
            map.put("apptoken", str);
            return map;
        }

        @NonNull
        public static Map<String, String> newQueryParams(String str) {
            HashMap map = new HashMap();
            map.put("userid", str);
            return map;
        }

        public static void setAppName(String str) {
            APP_NAME = str;
        }
    }

    private Cloud() {
        this.a = new OkHttpClient();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderAddInterceptor = builder.connectTimeout(60L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).addInterceptor(new HeaderInterceptor(v.getUserAgent()));
        Iterator<Interceptor> it2 = v.getNetworkInterceptors().iterator();
        while (it2.hasNext()) {
            builderAddInterceptor.addNetworkInterceptor(it2.next());
        }
        this.a = builderAddInterceptor.build();
        ConfigCallBack configCallBack = v;
        boolean z2 = configCallBack != null && configCallBack.isAccountOversea();
        ConfigCallBack configCallBack2 = v;
        updateHosts(z2, configCallBack2 != null && configCallBack2.isTestHosts());
    }

    public static void config(ConfigCallBack configCallBack) {
        v = configCallBack;
    }

    public static synchronized Cloud get() {
        if (u == null) {
            u = new Cloud();
        }
        return u;
    }

    @NonNull
    @WorkerThread
    public static Token getToken() {
        return AccountManager.getDefault(v.getContext()).getToken();
    }

    public static String getUID() {
        return AccountManager.getDefault(v.getContext()).getCurrentUid();
    }

    public static String getUrlThirdWatchface(String str) {
        return get().b + String.format(k0, str);
    }

    @NonNull
    public static Map<String, String> newHeaders(Token token) {
        return token == null ? new HashMap() : SysParams.newHeaders(v.getContext(), token.getAccessToken());
    }

    @NonNull
    public static Map<String, String> newQueryParams(String str) {
        return SysParams.newQueryParams(str);
    }

    public static String urlAGPSDataAPI(String str) {
        return get().b + String.format(D, SysParams.APP_NAME, str);
    }

    public static String urlAGpsDataQualcomm() {
        return "http://xtrapath1.izatcloud.net/xtra3grcej.bin";
    }

    public static String urlAccountConsole() {
        return get().b + "/t/account.console.watch";
    }

    public static String urlAfResult(String str) {
        return get().c + String.format(E0, str);
    }

    public static String urlAgreement(Context context, String str, String str2, String str3) {
        HashMap map = new HashMap(SysParams.get(context));
        map.put(HMAccountWebAPI.PARAM_REDIRECT_TYPE, str);
        if (!TextUtils.isEmpty(str2)) {
            map.put("country", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            map.put("lang", str3);
        }
        String string = CloudClient.OkHttp.newGet(urlRedirectPages(), map).url().toString();
        Log.d(i, "Agreement Url : " + string, new Object[0]);
        return string;
    }

    public static String urlAgreementPageVersion() {
        return get().b + l0;
    }

    public static String urlAlipayAuth() {
        return get().b + R;
    }

    public static String urlAlipayUserInfo() {
        return get().b + T;
    }

    public static String urlAppHelp() {
        return get().b + "/pages/huami.watch.app.help.android";
    }

    public static String urlAppSettingsAPI() {
        return get().b + String.format("/apps/%s/settings", SysParams.APP_NAME);
    }

    public static String urlBusCardInvoice(String str, String str2, String str3) {
        return get().b + String.format(u0, str, str2, str3);
    }

    public static String urlCommonHelp() {
        return get().b + "/pages/huami.watch.help.faq.android";
    }

    public static String urlConnectionHelp() {
        return get().b + z0;
    }

    public static String urlDelHeartRate(String str, long j2) {
        return get().b + String.format("/users/%s/heartRate/%s", str, Long.valueOf(j2));
    }

    public static String urlDevChannelAPI(String str) {
        return get().b + String.format(d0, str);
    }

    public static String urlDeviceBindAPI(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(get().b);
        sb.append(String.format(E, str));
        String string = sb.toString();
        if (strArr != null && strArr.length > 0) {
            for (String str2 : strArr) {
                string = string + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2;
            }
        }
        return string;
    }

    public static String urlDiscoveryAPI(String str, String str2) {
        return get().b + String.format(r0, str, str2);
    }

    public static String urlDisneyGuardian() {
        return get().b + p0;
    }

    public static String urlESIMMoreFAQ(String str) {
        return get().b + "/t/posts/watch?category=27&meta_key=tag&meta_value=faq&userid=" + str;
    }

    public static String urlESIMSeparate() {
        return get().b + "/t/faq.esim.new.mobile.url";
    }

    public static String urlESIMShare() {
        return get().b + "/t/faq.esim.common.mobile.url";
    }

    public static String urlEcg(String str) {
        return get().c + String.format(F0, str);
    }

    public static String urlEcgFileUri(String str, String str2) {
        return get().c + String.format("/users/%s/apps/%s/fileUploadURIs", str, str2);
    }

    public static String urlEcgHelp(int i2) {
        return get().b + String.format(J0, Integer.valueOf(i2));
    }

    public static String urlEcgTag(String str, String str2) {
        return get().c + String.format(G0, str, str2);
    }

    public static String urlEnCommonHelp() {
        return get().b + "/pages/huami.watch.help.appfaq.en";
    }

    public static String urlEvents(String str) {
        return get().c + String.format(B0, str);
    }

    public static String urlEverestHelpAuto() {
        return get().b + "/t/watch.amazfit2.faq.url";
    }

    public static String urlFaceStore() {
        return get().b + j0;
    }

    public static String urlFileUpload(String str, String str2) {
        return get().b + String.format(C, str, str2);
    }

    public static String urlFirstbeat(String str, String str2) {
        return get().b + String.format(K, str, str2);
    }

    public static String urlFirstbeatConfig(String str) {
        return get().b + String.format(L, str);
    }

    public static String urlGdprState(String str) {
        return get().b + String.format(q0, str);
    }

    public static String urlGuardian() {
        return get().b + o0;
    }

    public static String urlHealthData(String str, int i2) {
        return get().b + String.format(H, str, Integer.valueOf(i2));
    }

    public static String urlHealthDataSyncTime(String str) {
        return get().b + String.format(I, str);
    }

    public static String urlHeartRateData(String str) {
        return get().b + String.format(J, str);
    }

    public static String urlHelp() {
        return get().b + f0;
    }

    public static String urlHowToFlashRom() {
        return get().b + e0;
    }

    public static String urlHuangheHelp() {
        return get().b + "/t/watch.amazfit1.faq.url";
    }

    public static String urlMarketApps(String str) {
        return get().b + String.format(K0, str);
    }

    public static String urlMiUserInfoAPI() {
        return get().d + x;
    }

    public static String urlMiotGetToken() {
        return get().b + c0;
    }

    public static String urlMiotPostBind() {
        return get().b + a0;
    }

    public static String urlMiotPostUnBind() {
        return get().b + b0;
    }

    public static String urlOpenedBusCardAPI(String str) {
        return get().b + String.format("/devices/%s/openedBusCardCities", str);
    }

    public static String urlPai(String str) {
        return get().b + String.format(B0, str);
    }

    public static String urlPersonalBest(String str) {
        return get().e + String.format(Q, str);
    }

    public static String urlPpgFileUri(String str, String str2) {
        return get().c + String.format("/users/%s/apps/%s/fileUploadURIs", str, str2);
    }

    public static String urlQogirHelp() {
        return get().b + "/t/watch.amazfit.faq.url";
    }

    public static String urlQueryWeixinQrcode() {
        return get().g + i0;
    }

    public static String urlQueryWeixinStatus() {
        return get().g + h0;
    }

    public static String urlRedirectPages() {
        return get().b + m0;
    }

    public static String urlRomUpgradeAPI() {
        return get().b + A;
    }

    public static String urlRrPeak(String str) {
        return get().c + String.format(D0, str);
    }

    public static String urlRunThirdParty() {
        return get().e + G;
    }

    public static String urlSportDetail() {
        return get().e + N;
    }

    public static String urlSportHistory() {
        return get().e + M;
    }

    public static String urlSportStatistics() {
        return get().e + O;
    }

    public static String urlSportSummary() {
        return get().e + P;
    }

    public static String urlStatistics(String str) {
        return get().b + String.format(F, str);
    }

    public static String urlSyncingDataHelp() {
        return get().b + A0;
    }

    public static String urlThirdGetToken() {
        return get().b + URL_GET_TOKEN;
    }

    public static String urlThirdRefreshToken() {
        return get().h + URL_REFRESH_TOKEN;
    }

    public static String urlThirdRevoke() {
        return get().h + URL_THIRD_REVOKE;
    }

    public static String urlThirdToken() {
        return get().h + L0;
    }

    public static String urlUnbindAlipay() {
        return get().b + S;
    }

    public static String urlUnionPayCards() {
        return get().b + "/nfc/bindings";
    }

    public static String urlUnionPayFaq() {
        return get().b + w0;
    }

    public static String urlUnionPayProtocol(String str) {
        return get().b + String.format(v0, str);
    }

    public static String urlUnlockFailedHelp() {
        return get().b + y0;
    }

    public static String urlUploadEcg(String str) {
        return get().c + String.format(I0, str);
    }

    public static String urlUploadLoginFailLog(String str, String str2) {
        return get().b + String.format(t0, str, str2);
    }

    public static String urlUploadLoginFailLogAccess(String str, String str2) {
        return get().b + String.format(s0, str, str2);
    }

    public static String urlUserAgeCheck(String str) {
        return get().b + String.format(n0, str);
    }

    public static String urlUserForceUpgradeAPI() {
        return get().b + String.format(z, SysParams.APP_NAME);
    }

    public static String urlUserInfoAPI() {
        return get().c + w;
    }

    public static String urlUserSettingsAPI(String str) {
        return get().b + String.format(y, str);
    }

    public static String urlWeatherAQIRealtime() {
        return get().f + X;
    }

    public static String urlWeatherAlerts() {
        return get().f + Z;
    }

    public static String urlWeatherCity() {
        return get().f + "/city/search";
    }

    public static String urlWeatherForecast() {
        return get().f + W;
    }

    public static String urlWeatherRealtime() {
        return get().f + V;
    }

    public static String urlWeatherSearchCities() {
        return get().f + "/city/search";
    }

    public static String urlXihuHelp() {
        return get().b + "/t/watch.amazfitsmart2.faq.url";
    }

    public String getAmazfitHost() {
        return this.c;
    }

    public OkHttpClient getClient() {
        return this.a;
    }

    public String getHost() {
        return this.b;
    }

    public void updateHosts(boolean z2, boolean z3) {
        String host = HMServerDef.getHost();
        if (!TextUtils.isEmpty(host) && host.endsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
            host = host.substring(0, host.length() - 1);
        }
        Log.d(i, "appHost:" + host, new Object[0]);
        if (z3) {
            Log.d(i, "Using Test Hosts!!", new Object[0]);
            this.b = host;
            this.e = host;
            this.c = o;
            this.d = m;
            this.g = "https://api-watch-staging.huami.com";
            this.h = THIRD_TEST_HOST;
        } else {
            Log.d(i, "Using Normal Hosts!!", new Object[0]);
            this.b = host;
            this.e = host;
            this.d = HostManager.getMiHost();
            this.c = HostManager.getAmazfitHost();
            this.g = q;
            this.h = THIRD_PRODUCTION_HOST;
        }
        this.f = this.b;
    }

    public static String urlFileUpload(String str) {
        return urlFileUpload(str, SysParams.APP_NAME);
    }

    public static String urlUserInfoAPI(String str) {
        return get().c + String.format("/users/%s", str);
    }
}
