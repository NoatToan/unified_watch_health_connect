package com.huawei.hwcloudmodel.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hms.network.embedded.j2;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.up.utils.HttpConnectionAdaptor;
import com.huawei.up.utils.NSPException;
import defpackage.lqr;
import defpackage.nqh;
import defpackage.ofe;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbsNspClient {
    protected static final String APP_ID = "appId";
    protected static final String BI_UPLOAD_ENABLE = "improveState";
    protected static final String CURRENT_MANUFACTURER = "currentManufacturer";
    protected static final String DEVICE_IMEI = "deviceId";
    protected static final String DEVICE_TYPE = "deviceType";
    private static final int FILE_TAIL = -1;
    protected static final String GZIP = "gzip";
    private static final int GZIP_BUFFER_SIZE = 8192;
    protected static final String IS_MANUALLY = "isManually";
    protected static final String IS_TRACKING_ENABLED = "isTrackingEnabled";
    protected static final String I_VERSION = "iVersion";
    protected static final String LANGUAGE = "language";
    protected static final String OAID = "oaId";
    private static final int OTHER_BUFFER_SIZE = 1024;
    protected static final int PRIVACY_GOODS = 10;
    private static final int RESPONSE_REDIRECT = 302;
    private static final int RESPONSE_SUCCESS = 200;
    protected static final String SITE_ID = "siteId";
    protected static final String SOURCE = "source";
    protected static final String SYS_VERSION = "sysVersion";
    private static final String TAG = "UIME_AbsNspClient";
    protected static final String TOKEN = "token";
    protected static final String TOKEN_TYPE = "tokenType";
    protected static final String TS = "ts";
    public static final int TYPE_SPORT_HEALTH_DATA = 2;
    protected static final String UP_DEVICE_TYPE = "upDeviceType";
    public static final int URL_TYPE = 1;
    public static final int URL_TYPE_WIFI_SERVICE = 2;
    protected static final String USER_PRIVACY_KEY = "cloud_user_privacy";

    protected abstract lqr callService(String str, Map<String, Object> map, int i, int i2, int i3) throws NSPException;

    protected abstract lqr callService(String str, Map<String, Object> map, int i, int i2, int i3, int i4) throws NSPException;

    public String call(String str, Map<String, Object> map, int i, int i2, int i3) throws NSPException {
        lqr lqrVarCallService = callService(str, map, i, i2, i3);
        if (lqrVarCallService.a() == null) {
            LogUtil.j(TAG, "call param 5 Request failed.");
            throw new NSPException(lqrVarCallService.b(), "call param 5 Request failed.");
        }
        try {
            return Utils.d(lqrVarCallService.a());
        } catch (Exception e) {
            LogUtil.e(TAG, "call param 5 Parse failed.");
            throw new NSPException(lqrVarCallService.b(), "call param 5 Parse failed.", e);
        }
    }

    public String wifiCall(String str, Map<String, Object> map, int i, int i2, int i3) throws NSPException {
        lqr lqrVarCallService = callService(str, map, i, i2, i3, 2);
        if (lqrVarCallService.a() == null) {
            LogUtil.j(TAG, "wifiCall param 5 Request failed.");
            throw new NSPException(lqrVarCallService.b(), "wifiCall param 5 Request failed.");
        }
        try {
            String strD = Utils.d(lqrVarCallService.a());
            if (strD != null) {
                LogUtil.d(TAG, "wifiCall = ", strD.replaceAll("\"devId\":\".*?\"", "\"devId\";\"***\"").replaceAll("\"psk\":\".*?\"", "\"psk\";\"***\"").replaceAll("\"mac\":\".*?\"", "\"mac\";\"***\"").replaceAll("\"sn\":\".*?\"", "\"sn\";\"***\"").replaceAll("\"verifyCode\":\".*?\"", "\"verifyCode\";\"***\""));
            }
            return strD;
        } catch (Exception e) {
            LogUtil.e(TAG, "wifiCall param 5 Parse failed.");
            throw new NSPException(lqrVarCallService.b(), "wifiCall param 5 Parse failed.", e);
        }
    }

    protected lqr request(Context context, String str, String str2, int i, int i2, int i3) throws NSPException {
        nqh limitedHttpClient;
        HttpClient httpClient;
        try {
            if (i3 == 2) {
                httpClient = null;
                limitedHttpClient = HttpConnectionAdaptor.getLimitedHttpClient(context, str);
            } else {
                limitedHttpClient = null;
                httpClient = HttpConnectionAdaptor.getHttpClient(context, str);
            }
            HttpPost httpPost = HttpConnectionAdaptor.getHttpPost(str, i, i2, false);
            HttpHost httpHost = HttpConnectionAdaptor.getHttpHost(str);
            if (httpPost == null) {
                throw new NSPException(2, "Service unavailable.");
            }
            httpPost.addHeader(j2.v, "gzip");
            httpPost.addHeader("Content-Encoding", "gzip");
            setHttpHeader(context, httpPost);
            lqr lqrVar = new lqr();
            try {
                try {
                    try {
                        try {
                            try {
                                sendHttpRequest(limitedHttpClient, null, httpPost, str2, httpClient, lqrVar, httpHost, i3);
                                if (!httpPost.isAborted()) {
                                    httpPost.abort();
                                }
                                checkResponseCode(lqrVar);
                                return lqrVar;
                            } catch (Throwable th) {
                                if (!httpPost.isAborted()) {
                                    httpPost.abort();
                                }
                                throw th;
                            }
                        } catch (NullPointerException e) {
                            LogUtil.e(TAG, "request param 6 Service NullPointerException ", e.getMessage());
                            throw new NSPException(6, NSPException.EXP_NET_ERROR_STR, e);
                        }
                    } catch (IOException e2) {
                        LogUtil.e(TAG, "request param 6 Service IOException ", e2.getMessage());
                        throw new NSPException(6, NSPException.EXP_NET_ERROR_STR, e2);
                    }
                } catch (RuntimeException e3) {
                    throw e3;
                }
            } catch (Exception e4) {
                LogUtil.e(TAG, "request param 6 Service unavailable Exception");
                throw new NSPException(6, NSPException.EXP_NET_ERROR_STR, e4);
            }
        } catch (Exception e5) {
            LogUtil.e(TAG, "request getHttpClient Exception");
            throw new NSPException(6, NSPException.EXP_NET_ERROR_STR, e5);
        }
    }

    private void setHttpHeader(Context context, HttpPost httpPost) throws NSPException {
        String strC = KeyValDbManager.d(context).c("user_id");
        httpPost.setHeader("x-huid", strC);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j(TAG, "setHttpHeader huid isEmpty");
            LoginInit.getInstance(context).moveInfoFromSPTODB();
            throw new NSPException(1, "huid is empty.");
        }
        if ("0".equals(strC)) {
            LogUtil.e(TAG, "setHttpHeader huid is 0");
            throw new NSPException(1, "huid is 0.");
        }
        httpPost.setHeader("x-version", dealAiLifeBetaName(context));
        httpPost.setHeader("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        httpPost.setHeader("Connection", w9.j);
    }

    private String dealAiLifeBetaName(Context context) {
        String strC = CommonUtil.c(context);
        String strE = SharedPreferenceManager.e(context, String.valueOf(10008), "key_download_config");
        return (strE == null || !strE.contains("lfhealthtest2")) ? strC : "and_health_10.1.1.999";
    }

    private void sendHttpRequest(nqh nqhVar, HttpResponse httpResponse, HttpPost httpPost, String str, HttpClient httpClient, lqr lqrVar, HttpHost httpHost, int i) throws Exception {
        HttpResponse httpResponseExecute;
        if (str == null) {
            LogUtil.e(TAG, "sendHttpRequest,request data is null!");
            return;
        }
        httpPost.setEntity(new ByteArrayEntity(ofe.e(str.getBytes("UTF-8"))));
        if (i == 2) {
            httpResponseExecute = nqhVar.ao_(httpHost, httpPost);
        } else {
            httpResponseExecute = httpClient.execute(httpHost, httpPost);
        }
        LogUtil.a(TAG, "httpResponse status =", Integer.valueOf(httpResponseExecute.getStatusLine().getStatusCode()));
        if (httpResponseExecute.getStatusLine().getStatusCode() == 200 || httpResponseExecute.getStatusLine().getStatusCode() == 302) {
            if (httpResponseExecute.getEntity() == null) {
                LogUtil.j(TAG, "httpResponse.getEntity is null");
            } else {
                lqrVar.d(parseHttpResponse(httpResponseExecute));
            }
        }
    }

    private void checkResponseCode(lqr lqrVar) throws NSPException {
        if (lqrVar.d() > 0) {
            String strD = Utils.d(lqrVar.a());
            if (strD == null) {
                throw new NSPException(lqrVar.d(), "Unknown error");
            }
            throw new NSPException(lqrVar.d(), strD);
        }
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00c5: MOVE (r5 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:41:0x00c5 */
    protected byte[] parseHttpResponse(HttpResponse httpResponse) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Closeable closeable;
        byte[] bArr;
        HttpEntity entity = httpResponse.getEntity();
        if (entity == null) {
            LogUtil.j(TAG, "parseHttpResponse entity = null.");
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Closeable closeable2 = null;
        try {
            try {
                Header contentEncoding = entity.getContentEncoding();
                String value = contentEncoding != null ? contentEncoding.getValue() : null;
                if ("gzip".equals(value) || "z".equals(value)) {
                    LogUtil.d(TAG, "parseHttpResponse Gzip support");
                    bArr = new byte[8192];
                    bufferedInputStream = new BufferedInputStream(new GZIPInputStream(entity.getContent()));
                } else {
                    LogUtil.d(TAG, "parseHttpResponse Gzip not support");
                    bArr = new byte[1024];
                    bufferedInputStream = new BufferedInputStream(entity.getContent());
                }
                while (true) {
                    try {
                        int i = bufferedInputStream.read(bArr);
                        if (i != -1) {
                            byteArrayOutputStream.write(bArr, 0, i);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            FileUtils.a(bufferedInputStream);
                            FileUtils.a(byteArrayOutputStream);
                            return byteArray;
                        }
                    } catch (IOException e) {
                        e = e;
                        LogUtil.e(TAG, "parseHttpResponse2 error:", e.getMessage());
                        FileUtils.a(bufferedInputStream);
                        FileUtils.a(byteArrayOutputStream);
                        return null;
                    } catch (IllegalStateException e2) {
                        e = e2;
                        LogUtil.e(TAG, "parseHttpResponse1 error:", e.getMessage());
                        FileUtils.a(bufferedInputStream);
                        FileUtils.a(byteArrayOutputStream);
                        return null;
                    } catch (Exception unused) {
                        LogUtil.e(TAG, "parseHttpResponse AbsNspClient Exception");
                        FileUtils.a(bufferedInputStream);
                        FileUtils.a(byteArrayOutputStream);
                        return null;
                    }
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                FileUtils.a(closeable2);
                FileUtils.a(byteArrayOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedInputStream = null;
        } catch (IllegalStateException e4) {
            e = e4;
            bufferedInputStream = null;
        } catch (Exception unused2) {
            bufferedInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            FileUtils.a(closeable2);
            FileUtils.a(byteArrayOutputStream);
            throw th;
        }
    }
}
