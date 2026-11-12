package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwidauth.datatype.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginhealthzone.cloud.HttpDataCallback;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class pfq {
    private static String d() {
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainSnsHicloud");
        if (!TextUtils.isEmpty(url) && url.contains("%")) {
            int iN = CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
            if (iN > 0) {
                return String.format(Locale.ENGLISH, url, Integer.valueOf(iN));
            }
            LogUtil.j("HttpRequest", "formatUrl() AccountInfo is null or site id <= 0");
        }
        return url;
    }

    private static String e() {
        JSONObject jSONObject = new JSONObject();
        try {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "push_token_caching", "push_token");
            LogUtil.a("HttpRequest", "pushToken:", Boolean.valueOf(TextUtils.isEmpty(strE)));
            LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
            jSONObject.put(DeviceInfo.TAG_DEVICE_ID, loginInit.getDeviceId());
            jSONObject.put("deviceType", loginInit.getDeviceType());
            jSONObject.put("appID", "com.huawei.health");
            jSONObject.put("channel", 45000001);
            jSONObject.put(com.huawei.health.messagecenter.model.CommonUtil.PARAM_PUSH_TOKEN, strE);
            jSONObject.put("2".equals(loginInit.getAccountInfo(1012)) ? "accessToken" : "serviceToken", loginInit.getAccountInfo(1008));
            return jSONObject.toString();
        } catch (JSONException e) {
            LogUtil.j("HttpRequest", e.getMessage());
            return "";
        }
    }

    private static void c(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
            LogUtil.j("HttpRequest", "close stream fail");
        }
    }

    private static void b(HttpURLConnection httpURLConnection, String str) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        String str2 = "-676921145-" + System.currentTimeMillis();
        LogUtil.a("HttpRequest", "traceId is : ", str2);
        httpURLConnection.setRequestProperty("x-traceID", str2);
        httpURLConnection.setDoOutput(true);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
        c(outputStream);
    }

    private static long e(HttpURLConnection httpURLConnection) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), StandardCharsets.UTF_8));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    Object obj = new JSONObject(sb.toString()).getJSONObject("LoginSNSRsp").get("sessionValidTime");
                    long jIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0L;
                    try {
                        bufferedReader.close();
                        return jIntValue;
                    } catch (IOException e) {
                        ReleaseLogUtil.e("R_HttpRequest", ExceptionUtils.c(e));
                        return jIntValue;
                    }
                } catch (Exception e2) {
                    e = e2;
                    bufferedReader2 = bufferedReader;
                    ReleaseLogUtil.a("R_HttpRequest", ExceptionUtils.c(e));
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e3) {
                            ReleaseLogUtil.e("R_HttpRequest", ExceptionUtils.c(e3));
                        }
                    }
                    return 0L;
                } catch (Throwable th) {
                    th = th;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            ReleaseLogUtil.e("R_HttpRequest", ExceptionUtils.c(e4));
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = bufferedReader2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00c7: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:39:0x00c6 */
    private static String b() throws Throwable {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3 = null;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(d() + "/SNS/client/ISNS/loginSNS").openConnection();
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    ReleaseLogUtil.a("R_HttpRequest", "err connection type");
                    c(null);
                    return "";
                }
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    b(httpURLConnection, e());
                    int responseCode = httpURLConnection.getResponseCode();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (responseCode == 200) {
                        String headerField = httpURLConnection.getHeaderField("Set-Cookie");
                        lua.a("push_token_caching", "xcookie_expires_time", e(httpURLConnection));
                        lua.f("push_token_caching", "sns_xcookie_key", headerField);
                        lua.a("push_token_caching", "sns_xcookie_expires", System.currentTimeMillis());
                        if (!TextUtils.isEmpty(headerField)) {
                            new JSONObject().put("JSESSIONID", headerField);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c(inputStream);
                            return headerField;
                        }
                    }
                    ReleaseLogUtil.a("R_HttpRequest", "getSnsToken error:" + responseCode);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    c(inputStream);
                    return "";
                } catch (IOException e) {
                    e = e;
                    ReleaseLogUtil.a("R_HttpRequest", "get sns token exception:", e.getMessage());
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    c(null);
                    return "";
                } catch (JSONException e2) {
                    e = e2;
                    ReleaseLogUtil.a("R_HttpRequest", "get sns token exception:", e.getMessage());
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    c(null);
                    return "";
                }
            } catch (Throwable th) {
                th = th;
                httpURLConnection3 = httpURLConnection2;
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
                c(0);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            ReleaseLogUtil.a("R_HttpRequest", "get sns token exception:", e.getMessage());
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            c(null);
            return "";
        } catch (JSONException e4) {
            e = e4;
            httpURLConnection = null;
            ReleaseLogUtil.a("R_HttpRequest", "get sns token exception:", e.getMessage());
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            c(null);
            return "";
        } catch (Throwable th2) {
            th = th2;
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
            }
            c(0);
            throw th;
        }
    }

    private static Map<String, String> d(boolean z) {
        HashMap map = new HashMap(16);
        map.put("Content-type", HealthEngineRequestManager.CONTENT_TYPE);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (!TextUtils.isEmpty(accountInfo)) {
            map.put("x-huid", accountInfo);
        }
        String strC = CommonUtil.c(BaseApplication.getContext());
        if (!TextUtils.isEmpty(strC)) {
            map.put("x-version", strC);
        }
        if (z) {
            long jD = lua.d("push_token_caching", "sns_xcookie_expires", 0L);
            String strE = "";
            String strE2 = lua.e("push_token_caching", "sns_xcookie_key", "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jD2 = lua.d("push_token_caching", "xcookie_expires_time", 0L) - 60;
            ReleaseLogUtil.d("R_HttpRequest", "currentTime is ", Long.valueOf(jCurrentTimeMillis), " expiresTime is ", Long.valueOf(jD2), " preTime is ", Long.valueOf(jD));
            long j = jCurrentTimeMillis - jD;
            if (j < 0 || j >= jD2 * 1000 || TextUtils.isEmpty(strE2)) {
                ReleaseLogUtil.d("R_HttpRequest", "go to getSnsTokenSync");
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                ThreadPoolManager.c().execute(new Runnable() { // from class: pfr
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        pfq.e(countDownLatch);
                    }
                });
                try {
                    boolean zAwait = countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
                    ReleaseLogUtil.d("R_HttpRequest", "wait end");
                    if (zAwait) {
                        ReleaseLogUtil.d("R_HttpRequest", "get cookie");
                        strE = lua.e("push_token_caching", "sns_xcookie_key", "");
                    } else {
                        ReleaseLogUtil.e("R_HttpRequest", "is timeout");
                    }
                    strE2 = strE;
                } catch (InterruptedException e) {
                    ReleaseLogUtil.a("R_HttpRequest", ExceptionUtils.c(e));
                }
                if (!TextUtils.isEmpty(strE2)) {
                    LogUtil.a("HttpRequest", "x-cookie is ", strE2);
                    map.put("x-cookie", strE2);
                }
            } else {
                LogUtil.a("HttpRequest", "x-cookie is ", strE2);
                map.put("x-cookie", strE2);
                return map;
            }
        }
        return map;
    }

    static /* synthetic */ void e(CountDownLatch countDownLatch) throws Throwable {
        b();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00be  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    public static void c(String str, long j, Throwable th, HttpDataCallback httpDataCallback) {
        int i;
        String strD;
        int i2;
        LogUtil.e("HttpRequest", str, LogAnonymous.b(th));
        if ((th instanceof SocketTimeoutException) || ((th instanceof SSLException) && th.getMessage().contains("Connection timed out"))) {
            i = AwarenessConstants.ERROR_NO_PERMISSION_CODE;
            strD = pfo.d(AwarenessConstants.ERROR_NO_PERMISSION_CODE);
        } else if ((th instanceof ConnectException) || (th instanceof UnknownHostException)) {
            i = AwarenessConstants.ERROR_INVALID_FREQUENCY_CODE;
            strD = pfo.d(AwarenessConstants.ERROR_INVALID_FREQUENCY_CODE);
        } else if ((th instanceof IOException) && th.getMessage() != null && th.getMessage().contains("Canceled")) {
            i = AwarenessConstants.ERROR_LIMITED_REGISTRY_CODE;
            strD = pfo.d(AwarenessConstants.ERROR_LIMITED_REGISTRY_CODE);
        } else if (th.getMessage() != null) {
            i2 = 500;
            if (th.getMessage().contains(pfo.d(500))) {
                strD = pfo.d(500);
            } else {
                if (th.getMessage() != null) {
                    i2 = 503;
                    if (th.getMessage().contains(pfo.d(503))) {
                        strD = pfo.d(503);
                    }
                }
                if (th.getMessage() == null && th.getMessage().contains("reach max quota limit")) {
                    i = 30000001;
                    strD = pfo.d(30000001);
                } else if (th.getMessage() == null && th.getMessage().contains("reach max follow limit")) {
                    i = 30000002;
                    strD = pfo.d(30000002);
                } else if (th.getMessage() == null && th.getMessage().contains("reach max authorization limit")) {
                    i = 30000008;
                    strD = pfo.d(30000008);
                } else {
                    i = 9999;
                    strD = pfo.d(9999);
                }
            }
            i = i2;
        } else {
            if (th.getMessage() != null) {
                i2 = 503;
                if (th.getMessage().contains(pfo.d(503))) {
                    strD = pfo.d(503);
                    i = i2;
                }
            }
            if (th.getMessage() == null) {
                if (th.getMessage() == null) {
                    if (th.getMessage() == null) {
                        i = 9999;
                        strD = pfo.d(9999);
                    } else {
                        i = 9999;
                        strD = pfo.d(9999);
                    }
                } else if (th.getMessage() == null) {
                    i = 9999;
                    strD = pfo.d(9999);
                } else {
                    i = 9999;
                    strD = pfo.d(9999);
                }
            } else if (th.getMessage() == null) {
                if (th.getMessage() == null) {
                    i = 9999;
                    strD = pfo.d(9999);
                } else {
                    i = 9999;
                    strD = pfo.d(9999);
                }
            } else if (th.getMessage() == null) {
                i = 9999;
                strD = pfo.d(9999);
            } else {
                i = 9999;
                strD = pfo.d(9999);
            }
        }
        d(i, j, System.currentTimeMillis(), false);
        if (httpDataCallback != null) {
            httpDataCallback.onFailure(i, strD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, long j, String str2, HttpDataCallback httpDataCallback) {
        JSONObject jSONObject;
        LogUtil.a("HttpRequest", str, " request onSuccess.");
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            c(str, j, e, httpDataCallback);
            jSONObject = null;
        }
        if (jSONObject != null) {
            httpDataCallback.onSuccess(jSONObject);
        }
        d(200, j, System.currentTimeMillis(), true);
    }

    public static void c(final String str, JSONObject jSONObject, final HttpDataCallback httpDataCallback, boolean z) {
        if (!a(str)) {
            LogUtil.j("HttpRequest", "url is invalid");
            httpDataCallback.onFailure(AwarenessConstants.ERROR_UNKNOWN_CODE, "parameter invalid");
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> mapD = d(z);
        if (z && !mapD.containsKey("x-cookie")) {
            ReleaseLogUtil.a("R_HttpRequest", "cant get x-cookie");
        } else {
            LogUtil.a("HttpRequest", Constants.SUFFIX_URL, str, "commonHead= ", mapD, " body = ", jSONObject.toString());
            oet.d().c(str, mapD, jSONObject.toString(), String.class, new ResultCallback<String>() { // from class: pfq.3
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str2) {
                    pfq.e(str, jCurrentTimeMillis, str2, httpDataCallback);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    pfq.c(str, jCurrentTimeMillis, th, httpDataCallback);
                }
            });
        }
    }

    private static void d(int i, long j, long j2, boolean z) {
        String str;
        long j3 = j2 - j;
        if (j3 >= 5000) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
            linkedHashMap.put("module", String.valueOf(4));
            if (z) {
                str = "0";
            } else {
                str = "1";
            }
            linkedHashMap.put("status", str);
            linkedHashMap.put(OpAnalyticsConstants.DELAY, String.valueOf(j3));
            linkedHashMap.put(OpAnalyticsConstants.ERROR_CODE, String.valueOf(i));
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_REQUEST_MODULE_85030001.value(), linkedHashMap);
        }
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFKC);
        return strNormalize.startsWith("http://") || strNormalize.startsWith("https://");
    }
}
