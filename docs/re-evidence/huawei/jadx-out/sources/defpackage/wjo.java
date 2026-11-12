package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.google.gson.Gson;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.main.model.AppLangItem;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.HealthAccessTokenUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.VastAttribute;
import health.compact.a.GRSManager;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes19.dex */
public class wjo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f52104b;
    private Context d;
    private String e = "";

    public wjo(Context context, String str) {
        this.d = context;
        this.f52104b = str;
        LogUtil.a("HMSAuth_CloudAuthUtil", "getUserAccessToken:  " + str);
    }

    private int b(final String str, final String str2, final String str3) {
        this.e = "";
        LogUtil.a("HMSAuth_CloudAuthUtil", "Start getHttpsReq");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ThreadPoolManager.c().execute(new Runnable() { // from class: wjo.1
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("HMSAuth_CloudAuthUtil", "Start get httpResult");
                wjo.this.e = vzn.c(str3, str, str2);
                wjo wjoVar = wjo.this;
                if (wjoVar.b(wjoVar.e)) {
                    LogUtil.a("HMSAuth_CloudAuthUtil", "get httpResult again, userAt after refresh", wjo.this.f52104b);
                    wjo wjoVar2 = wjo.this;
                    wjoVar2.e = vzn.c(str3, wjoVar2.f52104b, str2);
                }
                LogUtil.a("HMSAuth_CloudAuthUtil", "httpResult:", wjo.this.e);
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS);
            LogUtil.a("HMSAuth_CloudAuthUtil", "get http needs ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), " ms");
            return 1;
        } catch (InterruptedException unused) {
            LogUtil.e("HMSAuth_CloudAuthUtil", "InterruptedException");
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        LogUtil.d("HMSAuth_CloudAuthUtil", "isUserAtExpired check jsonResult");
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(VastAttribute.ERROR) && "401".equals(jSONObject.getString(VastAttribute.ERROR))) {
                    this.f52104b = HealthAccessTokenUtil.getAtInstance().refreshAccessToken();
                    return true;
                }
            } catch (JSONException unused) {
                LogUtil.e("HMSAuth_CloudAuthUtil", "http response jsonObject == null");
                return false;
            }
        }
        LogUtil.d("HMSAuth_CloudAuthUtil", "jsonResult is empty.", this.f52104b);
        return false;
    }

    public String a() {
        Locale locale = this.d.getResources().getConfiguration().locale;
        return locale.getLanguage().toLowerCase() + Constants.LINK + locale.getCountry().toLowerCase();
    }

    public List<AppLangItem> e(String str, String str2, String str3) {
        if (b(str, str2, str3) == 1) {
            LogUtil.d("HMSAuth_CloudAuthUtil", "getAppLangItem after getReq");
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str4 = this.e;
            if (str4 == null || TextUtils.isEmpty(str4)) {
                LogUtil.d("HMSAuth_CloudAuthUtil", "httpsResult is null.");
                return null;
            }
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(this.e);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    AppLangItem appLangItem = new AppLangItem();
                    if (jSONObject.has(VastAttribute.ERROR)) {
                        return null;
                    }
                    appLangItem.setAppId(jSONObject.getString("appId"));
                    appLangItem.setAppName(jSONObject.getString("appName"));
                    appLangItem.setAppIconPath(jSONObject.getString("appIconPath"));
                    arrayList.add(appLangItem);
                }
                LogUtil.d("HMSAuth_CloudAuthUtil", "getAppLangItem api needs ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), " ms");
                return arrayList;
            } catch (JSONException unused) {
                LogUtil.e("HMSAuth_CloudAuthUtil", "getAppLangItem parse param json fail!");
                return null;
            }
        }
        LogUtil.d("HMSAuth_CloudAuthUtil", "getHttpsReq in getAppLangItem failed.");
        return null;
    }

    public fwp c(String str, String str2, String str3) {
        if (b(str, str2, str3) == 1) {
            LogUtil.d("HMSAuth_CloudAuthUtil", "getScopeLangItem after getReq");
            String str4 = this.e;
            if (str4 == null || TextUtils.isEmpty(str4)) {
                LogUtil.d("HMSAuth_CloudAuthUtil", "httpsResult is null.");
                return null;
            }
            return (fwp) new Gson().fromJson(this.e, fwp.class);
        }
        LogUtil.d("HMSAuth_CloudAuthUtil", "getHttpsReq in getScopeLangItem fail.");
        return null;
    }

    public boolean d(String str, String str2, String str3) {
        if (b(str, str2, str3) == 1) {
            LogUtil.d("HMSAuth_CloudAuthUtil", "deleteAllItem after getReq");
            String str4 = this.e;
            if (str4 == null || TextUtils.isEmpty(str4)) {
                LogUtil.d("HMSAuth_CloudAuthUtil", "httpsResult is null.");
            }
            return true;
        }
        LogUtil.e("HMSAuth_CloudAuthUtil", "deleteAllItem req fail!");
        return false;
    }

    public boolean a(String str, String str2, String str3) {
        if (b(str, str2, str3) == 1) {
            LogUtil.d("HMSAuth_CloudAuthUtil", "typeItemDelete after getReq");
            String str4 = this.e;
            if (str4 == null || TextUtils.isEmpty(str4)) {
                LogUtil.d("HMSAuth_CloudAuthUtil", "httpsResult is null.");
            }
            return true;
        }
        LogUtil.e("HMSAuth_CloudAuthUtil", "typeItemDelete req fail!");
        return false;
    }

    public String e() {
        String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl(HealthEngineRequestManager.GRS_KEY, "com.huawei.health" + lcz.f39935a, "");
        if (TextUtils.isEmpty(noCheckUrl)) {
            return "";
        }
        if (noCheckUrl.startsWith("https://")) {
            return noCheckUrl + "/healthkit/v1/consents";
        }
        return "https://" + noCheckUrl + "/healthkit/v1/consents";
    }

    public String e(String str, String str2) {
        if (str.isEmpty()) {
            LogUtil.a("HMSAuth_CloudAuthUtil", "Url is null.");
            return null;
        }
        if (str2.isEmpty()) {
            str2 = "2";
        }
        StringBuilder sb = new StringBuilder(e());
        sb.append("?lang=");
        sb.append(str);
        sb.append("&careType=");
        sb.append(str2);
        LogUtil.a("HMSAuth_CloudAuthUtil", "getAppLangItemUrl in util: " + sb.toString());
        return sb.toString();
    }

    public String d(String str, String str2) {
        LogUtil.a("HMSAuth_CloudAuthUtil", "getScopeLangItemUrl");
        if (str.isEmpty() || str2.isEmpty()) {
            LogUtil.a("HMSAuth_CloudAuthUtil", "WRONG INPUT URL.");
            return null;
        }
        StringBuilder sb = new StringBuilder(e());
        sb.append("/");
        sb.append(str);
        sb.append("?lang=");
        sb.append(str2);
        LogUtil.a("HMSAuth_CloudAuthUtil", "getScopeLangItemUrl in util: " + sb.toString());
        return sb.toString();
    }

    public String e(String str) {
        LogUtil.a("HMSAuth_CloudAuthUtil", "getDeleteAllItemUrl");
        if (str.isEmpty()) {
            LogUtil.a("HMSAuth_CloudAuthUtil", "WRONG INPUT URL at getDeleteAllItemUrl.");
            return null;
        }
        StringBuilder sb = new StringBuilder(e());
        sb.append("/");
        sb.append(str);
        LogUtil.a("HMSAuth_CloudAuthUtil", "getDeleteAllItemUrl in util: " + sb.toString());
        return sb.toString();
    }

    public String a(String str, String str2) {
        LogUtil.a("HMSAuth_CloudAuthUtil", "getTypeDeleteItemUrl");
        if (str.isEmpty() || str2.isEmpty()) {
            LogUtil.a("HMSAuth_CloudAuthUtil", "WRONG INPUT URL.");
            return null;
        }
        try {
            String strReplace = URLEncoder.encode(str2, "UTF-8").replace(Marker.ANY_NON_NULL_MARKER, com.huawei.operation.utils.Constants.PERCENT_20);
            StringBuilder sb = new StringBuilder(e());
            sb.append("/");
            sb.append(str);
            sb.append("?scopesUrl=");
            sb.append(strReplace);
            LogUtil.a("HMSAuth_CloudAuthUtil", "getTypeDeleteItemUrl in util: " + sb.toString());
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            LogUtil.d("HMSAuth_CloudAuthUtil", "Exception in getTypeDeleteItemUrl");
            return null;
        }
    }
}
