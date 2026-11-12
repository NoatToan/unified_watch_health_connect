package com.huawei.operation.h5pro.jsmodules;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.pluginhealthzone.FamilyHealthZoneApi;
import com.huawei.health.pluginhealthzone.UserInfoCallback;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwidauth.datatype.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.gqd;
import defpackage.qqt;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class Social extends JsBaseModule {
    private static final int DEFAULT_SIZE = 10240;
    private static final int MAX_LINE = 2048;
    private static final long NO_CALLBACK = -1;
    private static final int TIME_OUT = 1000;
    private static final int TIME_OUT_CODE = -2;
    private static final String TIME_OUT_RESULT = "time_out_result";
    private String mCookie;

    @JavascriptInterface
    public void getSnsToken(final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        LogUtil.a(this.TAG, "start wait");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.Social$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.m1582lambda$getSnsToken$0$comhuaweioperationh5projsmodulesSocial(j, countDownLatch);
            }
        });
        try {
            boolean zAwait = countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
            LogUtil.a(this.TAG, "wait end");
            if (zAwait) {
                return;
            }
            LogUtil.a(this.TAG, "wait out");
            callbackFail(-2, TIME_OUT_RESULT, j);
        } catch (InterruptedException unused) {
            callbackFail(-2, TIME_OUT_RESULT, j);
        }
    }

    /* JADX INFO: renamed from: lambda$getSnsToken$0$com-huawei-operation-h5pro-jsmodules-Social, reason: not valid java name */
    /* synthetic */ void m1582lambda$getSnsToken$0$comhuaweioperationh5projsmodulesSocial(long j, CountDownLatch countDownLatch) throws Throwable {
        getSnsTokenSync(j);
        countDownLatch.countDown();
    }

    @JavascriptInterface
    public void findUser(final long j, String str) {
        try {
            ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).requestFindUserInfo(0, new JSONObject(str).optString("search"), new UserInfoCallback<gqd.c>() { // from class: com.huawei.operation.h5pro.jsmodules.Social.1
                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                public void infoCallback(gqd.c cVar) {
                    LogUtil.j(Social.this.TAG, "findUser success !");
                    try {
                        JSONObject jSONObject = new JSONObject(qqt.a(cVar, gqd.c.class));
                        jSONObject.put(HwPayConstant.KEY_USER_ID, String.valueOf(jSONObject.getLong(HwPayConstant.KEY_USER_ID)));
                        Social.this.callbackSuccess(jSONObject, j);
                    } catch (JSONException e) {
                        Social.this.callbackFail(-1, "find user fail", j);
                        LogUtil.j(Social.this.TAG, "findUser JSONException ", e.getMessage());
                    }
                }

                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                public void errorCallback(int i) {
                    LogUtil.j(Social.this.TAG, "findUser fail !", Integer.valueOf(i));
                    if (i == 1005) {
                        Social.this.callbackFail(-1, "find fail", j);
                    } else if (i == -1) {
                        Social.this.callbackFail(1003, "find fail", j);
                    } else {
                        Social.this.callbackFail(i, "find fail", j);
                    }
                }
            });
        } catch (JSONException unused) {
            callbackFail(-1, "getUserInfoSync fail:param invalid", j);
        }
    }

    @JavascriptInterface
    public void getUserInfo(final long j, String str) {
        try {
            ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).requestFindUserInfo(2, new JSONObject(str).optString("huid"), new UserInfoCallback<gqd.c>() { // from class: com.huawei.operation.h5pro.jsmodules.Social.2
                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                public void infoCallback(gqd.c cVar) {
                    LogUtil.j(Social.this.TAG, "getUserInfo success !");
                    try {
                        JSONObject jSONObject = new JSONObject(qqt.a(cVar, gqd.c.class));
                        jSONObject.put(HwPayConstant.KEY_USER_ID, String.valueOf(jSONObject.getLong(HwPayConstant.KEY_USER_ID)));
                        Social.this.callbackSuccess(jSONObject, j);
                    } catch (JSONException e) {
                        Social.this.callbackFail(-1, "getUserInfo fail ！", j);
                        LogUtil.j(Social.this.TAG, "getUserInfo JSONException ", e.getMessage());
                    }
                }

                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                public void errorCallback(int i) {
                    LogUtil.j(Social.this.TAG, "getUserInfo fail !");
                    Social.this.callbackFail(i, "getUserInfo fail", j);
                }
            });
        } catch (JSONException unused) {
            callbackFail(-1, "getUserInfoSync fail:param invalid", j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    private void getSnsTokenSync(long j) throws Throwable {
        Exception e;
        HttpURLConnection httpURLConnection = null;
        Closeable closeable = null;
        httpURLConnection = null;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(getSnsDomain() + "/SNS/client/ISNS/loginSNS").openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                callbackFail(-1, "visit url fail", j);
                closeQuietly(null);
                return;
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                postRequest(httpURLConnection2, getLoginBody());
                int responseCode = httpURLConnection2.getResponseCode();
                InputStream inputStream = httpURLConnection2.getInputStream();
                if (responseCode == 200) {
                    String strCookieToSessionId = cookieToSessionId(httpURLConnection2.getHeaderField("Set-Cookie"));
                    if (!TextUtils.isEmpty(strCookieToSessionId)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("JSESSIONID", strCookieToSessionId);
                        callbackSuccess(jSONObject, j);
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        closeQuietly(inputStream);
                        return;
                    }
                }
                LogUtil.e(this.TAG, "getSnsToken error:" + responseCode);
                callbackFail(responseCode, isToString(inputStream), j);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                closeQuietly(inputStream);
            } catch (IOException e2) {
                e = e2;
                httpURLConnection = httpURLConnection2;
                try {
                    LogUtil.e(this.TAG, "get sns token exception:", e.getMessage());
                    callbackFail(-1, e.getMessage(), j);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    closeQuietly(null);
                } catch (Throwable th) {
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    closeQuietly(closeable);
                    throw th;
                }
            } catch (JSONException e3) {
                e = e3;
                httpURLConnection = httpURLConnection2;
                LogUtil.e(this.TAG, "get sns token exception:", e.getMessage());
                callbackFail(-1, e.getMessage(), j);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                closeQuietly(null);
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                closeQuietly(closeable);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            e = e;
            LogUtil.e(this.TAG, "get sns token exception:", e.getMessage());
            callbackFail(-1, e.getMessage(), j);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            closeQuietly(null);
        } catch (JSONException e5) {
            e = e5;
            e = e;
            LogUtil.e(this.TAG, "get sns token exception:", e.getMessage());
            callbackFail(-1, e.getMessage(), j);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            closeQuietly(null);
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void callbackSuccess(T t, long j) {
        if (j != -1) {
            onSuccessCallback(j, t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackFail(int i, String str, long j) {
        if (j != -1) {
            onFailureCallback(j, str, i);
        }
    }

    private void postRequest(HttpURLConnection httpURLConnection, String str) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        if (!TextUtils.isEmpty(this.mCookie)) {
            httpURLConnection.setRequestProperty("Cookie", this.mCookie);
        }
        String str2 = this.TAG.hashCode() + Constants.LINK + System.currentTimeMillis();
        LogUtil.a(this.TAG, "traceId is : ", str2);
        httpURLConnection.setRequestProperty("x-traceID", str2);
        httpURLConnection.setDoOutput(true);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
        closeQuietly(outputStream);
    }

    private String getLoginBody() {
        JSONObject jSONObject = new JSONObject();
        try {
            String strE = SharedPreferenceManager.e(this.mContext, "push_token_caching", "push_token");
            LogUtil.a(this.TAG, "pushToken:", Boolean.valueOf(TextUtils.isEmpty(strE)));
            LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
            jSONObject.put(DeviceInfo.TAG_DEVICE_ID, loginInit.getDeviceId());
            jSONObject.put("deviceType", loginInit.getDeviceType());
            jSONObject.put("appID", "com.huawei.health");
            jSONObject.put("channel", 45000001);
            jSONObject.put(CommonUtil.PARAM_PUSH_TOKEN, strE);
            jSONObject.put("2".equals(loginInit.getAccountInfo(1012)) ? "accessToken" : "serviceToken", loginInit.getAccountInfo(1008));
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private String isToString(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder(10240);
            int i = 0;
            do {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    i++;
                }
                return sb.toString();
            } while (i <= 2048);
            LogUtil.e(this.TAG, "exceed max line");
            return sb.toString();
        } catch (IOException unused) {
            LogUtil.e(this.TAG, "isToString fail");
            return "";
        }
    }

    private String cookieToSessionId(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strReplace = str.replace(" ", "").replace(";Path=/SNS;HttpOnly", "");
        this.mCookie = strReplace;
        return strReplace.replace("JSESSIONID=", "");
    }

    private String getSnsDomain() {
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainSnsHicloud");
        if (!TextUtils.isEmpty(url) && url.contains("%")) {
            int i = Integer.parseInt(LoginInit.getInstance(this.mContext).getAccountInfo(1009));
            if (i > 0) {
                return String.format(Locale.ENGLISH, url, Integer.valueOf(i));
            }
            LogUtil.j(this.TAG, "formatUrl() AccountInfo is null or site id <= 0");
        }
        return url;
    }

    private void closeQuietly(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
            LogUtil.j(this.TAG, "close stream fail");
        }
    }
}
