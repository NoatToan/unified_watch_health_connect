package com.huawei.hms.mlsdk.asr.engine.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.ml.grs.GrsListener;
import com.huawei.hms.ml.grs.GrsRegionUtils;
import com.huawei.hms.ml.grs.GrsUtils;
import com.huawei.hms.mlsdk.asr.o.l;
import com.huawei.hms.mlsdk.common.MLApplication;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactory;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactoryNew;
import com.huawei.secure.android.common.ssl.SecureX509TrustManager;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class HttpUtils {
    private static final String HMS_PACKAGE_NAME = "com.huawei.hwid";
    private static final String HMS_SERVICE = "com.huawei.hms.core.aidlservice";
    private static final int NET_TIMEOUT_SECONDS = 10000;
    private static final String SUCCESS = "0";
    private static final String TAG = "HttpUtils";
    private static final String TAG_LANGUAGES = "languages";
    private static final String TAG_RETCODE = "retCode";
    private static final String TAG_RETMSG = "retMsg";

    final class a implements GrsListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HttpClient f14391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callback f14392c;

        a(String str, HttpClient httpClient, Callback callback) {
            this.f14390a = str;
            this.f14391b = httpClient;
            this.f14392c = callback;
        }

        @Override // com.huawei.hms.ml.grs.GrsListener
        public final void onAsynGrsUrls(List<String> list) {
            if (list != null) {
                Logger.i(HttpUtils.TAG, "requestSpeaker GRS:[" + list.size() + "]" + list, Boolean.TRUE);
            }
            this.f14391b.newSubmit(HttpUtils.this.buildGetRequest(this.f14391b, HttpUtils.formate(((list == null || list.size() <= 0) ? "" : list.get(0)) + this.f14390a))).enqueue(this.f14392c);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final HttpUtils f14393a = new HttpUtils(null);
    }

    /* synthetic */ HttpUtils(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Request buildGetRequest(HttpClient httpClient, String str) {
        Request.Builder builderNewRequest = httpClient.newRequest();
        builderNewRequest.url(str);
        SmartLogger.i(TAG, "requestSpeaker domian: " + str);
        for (Map.Entry<String, String> entry : getDefaultHeader().entrySet()) {
            builderNewRequest.addHeader(entry.getKey(), entry.getValue());
        }
        builderNewRequest.method("GET");
        return builderNewRequest.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String formate(String str) {
        String strTrim = str.trim();
        if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
            strTrim = "https://".concat(strTrim);
        }
        int iIndexOf = strTrim.indexOf("//");
        return strTrim.substring(0, iIndexOf) + "//" + strTrim.substring(iIndexOf + 2).replaceAll("/+", "/");
    }

    private Map<String, String> getDefaultHeader() {
        HashMap map = new HashMap();
        MLApplication mLApplication = MLApplication.getInstance();
        MLApplicationSetting appSetting = mLApplication.getAppSetting();
        if (appSetting == null) {
            return map;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        map.put("X-Request-ID", String.valueOf(uuidRandomUUID));
        SmartLogger.i(TAG, "X-Request-ID: " + uuidRandomUUID);
        map.put("X-User-Agent", "X-User-Agent");
        map.put("appId", appSetting.getAppId());
        map.put("HMS-APPLICATION-ID", appSetting.getAppId());
        map.put("X-Package-Name", appSetting.getPackageName());
        map.put("X-Country-Code", new l(mLApplication.getAppContext()).a());
        map.put("supplierId", "supplierId");
        map.put("accept", "application/json");
        map.put("certFingerprint", appSetting.getCertFingerprint());
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + MLApplication.getInstance().getAuthorizationToken());
        map.put("X-Mlkit-Version", "3.18.6.304");
        SmartLogger.i(TAG, "X-Mlkit-Version: " + appSetting.getMLSdkVersion());
        Pair<String, ResolveInfo> hmsCoreInfo = getHmsCoreInfo();
        if (hmsCoreInfo == null) {
            map.put("isHmsCore", isPackageInternal(mLApplication.getAppContext(), "com.huawei.hwid") ? "1" : "0");
            return map;
        }
        String str = (String) hmsCoreInfo.first;
        Log.d(TAG, "HMScore PackageName is :" + str);
        map.put("isHmsCore", isPackageInternal(mLApplication.getAppContext(), str) ? "1" : "0");
        return map;
    }

    private static Pair<String, ResolveInfo> getHmsCoreInfo() {
        try {
            List<ResolveInfo> listQueryIntentServices = MLApplication.getInstance().getAppContext().getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
            if (listQueryIntentServices.size() != 0) {
                Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                if (it.hasNext()) {
                    ResolveInfo next = it.next();
                    return new Pair<>(next.serviceInfo.applicationInfo.packageName, next);
                }
            }
            return null;
        } catch (RuntimeException e) {
            SmartLogger.e(TAG, "getHmsCoreInfo RuntimeException e: " + e);
            return null;
        } catch (Exception e2) {
            SmartLogger.e(TAG, "getHmsCoreInfo Exception e: " + e2);
            return null;
        }
    }

    public static final HttpUtils getInstance() {
        return b.f14393a;
    }

    private boolean isPackageInternal(Context context, String str) {
        try {
            return (context.getPackageManager().getPackageInfo(str, 0).applicationInfo.flags & 1) != 0;
        } catch (RuntimeException e) {
            SmartLogger.e(TAG, "isPackageInternal Exception e: " + e);
            return false;
        } catch (Exception e2) {
            SmartLogger.e(TAG, "isPackageInternal Exception e: " + e2);
            return false;
        }
    }

    public HttpClient getOkHttpClient() {
        return getOkHttpClient(10000);
    }

    public boolean isLegalJson(String str) {
        if (TextUtils.isEmpty(str)) {
            SmartLogger.e(TAG, "Language list isEmpty.");
            return false;
        }
        JSONObject json = JsonUtil.parseJson(str);
        if (json == null) {
            SmartLogger.e(TAG, "Response json incorrect format.");
            return false;
        }
        if (!"0".equals(JsonUtil.getJsonStringField(json, "retCode"))) {
            SmartLogger.e(TAG, "Response error! errcode=[" + JsonUtil.getJsonStringField(json, "retCode") + "] retMsg=[" + JsonUtil.getJsonStringField(json, TAG_RETMSG) + "]");
            return false;
        }
        try {
            JSONArray jsonArray = JsonUtil.getJsonArray(json.getJSONObject("result"), TAG_LANGUAGES);
            if (jsonArray != null && jsonArray.length() != 0) {
                return true;
            }
            SmartLogger.e(TAG, "Response json not contain languages");
            return false;
        } catch (JSONException e) {
            SmartLogger.e(TAG, "JSONException", e);
            return true;
        }
    }

    public void requestSupportLanguages(HttpClient httpClient, String str, Callback callback) {
        GrsUtils.setGrsListener(new a(str, httpClient, callback));
        String grsCountryCode = GrsRegionUtils.getGrsCountryCode();
        SmartLogger.i(TAG, "Grs-CountryCode:" + grsCountryCode);
        if (grsCountryCode != null) {
            GrsUtils.getAsrVisionSearchUrls(GrsUtils.initGrsVisionSearchClientWithCountry(MLApplication.getInstance().getAppContext(), grsCountryCode));
        } else {
            GrsUtils.getAsrUrls(MLApplication.getInstance().getAppContext(), false);
        }
    }

    private HttpUtils() {
    }

    public HttpClient getOkHttpClient(int i) {
        Context appContext = MLApplication.getInstance().getAppContext();
        HttpClient.Builder builder = new HttpClient.Builder();
        try {
            builder.sslSocketFactory((SSLSocketFactory) SecureSSLSocketFactoryNew.getInstance(appContext, new SecureRandom()), (X509TrustManager) new SecureX509TrustManager(appContext));
        } catch (IOException e) {
            SmartLogger.e(TAG, e.getMessage());
        } catch (IllegalAccessException e2) {
            SmartLogger.e(TAG, e2.getMessage());
        } catch (KeyManagementException e3) {
            SmartLogger.e(TAG, e3.getMessage());
        } catch (KeyStoreException e4) {
            SmartLogger.e(TAG, e4.getMessage());
        } catch (NoSuchAlgorithmException e5) {
            SmartLogger.e(TAG, e5.getMessage());
        } catch (CertificateException e6) {
            SmartLogger.e(TAG, e6.getMessage());
        }
        builder.hostnameVerifier((HostnameVerifier) SecureSSLSocketFactory.STRICT_HOSTNAME_VERIFIER).connectTimeout(i).callTimeout(i).readTimeout(i);
        NetworkKit.getInstance().initConnectionPool(5, 5L, TimeUnit.SECONDS);
        return builder.build();
    }
}
