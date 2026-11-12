package defpackage;

import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactoryNew;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes10.dex */
public class lte {
    public static int a(String str, HashMap<String, String> map, HashMap<String, String> map2, final HttpResCallback httpResCallback) {
        LogUtil.a("HwCommonModelHttps", "entry Https.postReq");
        if (!TextUtils.isEmpty(str) && map != null && map2 != null && httpResCallback != null) {
            HttpURLConnection httpURLConnectionB = lth.b(str);
            if (!(httpURLConnectionB instanceof HttpsURLConnection)) {
                return -1;
            }
            final HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnectionB;
            b(httpsURLConnection);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setUseCaches(false);
            try {
                httpsURLConnection.setRequestMethod("POST");
                ltg.d(httpsURLConnection, map2);
                final String strA = ltg.a(map);
                LogUtil.d("HwCommonModelHttps", "postReq-->strBody:", strA);
                ThreadPoolManager.c().execute(new Runnable() { // from class: lte.1
                    @Override // java.lang.Runnable
                    public void run() throws Throwable {
                        lte.d(strA, httpsURLConnection, httpResCallback);
                    }
                });
                LogUtil.a("HwCommonModelHttps", "exit AchieveHttps.postReq");
                return 0;
            } catch (ProtocolException e) {
                LogUtil.e("HwCommonModelHttps", e.getMessage());
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static void d(String str, HttpsURLConnection httpsURLConnection, HttpResCallback httpResCallback) throws Throwable {
        InputStream inputStream;
        OutputStream outputStream;
        String str2;
        OutputStream outputStream2;
        InputStream inputStream2;
        int i = -1;
        OutputStream outputStream3 = null;
        inputStream = null;
        InputStream inputStream3 = null;
        InputStream inputStream4 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                outputStream2 = null;
            } else {
                outputStream2 = httpsURLConnection.getOutputStream();
                try {
                    outputStream2.write(str.getBytes("UTF-8"));
                    outputStream2.flush();
                } catch (IOException e) {
                    e = e;
                    inputStream2 = null;
                    str2 = null;
                    inputStream4 = inputStream2;
                    outputStream = outputStream2;
                    try {
                        ReleaseLogUtil.a("HwCommonModelHttps", "postReq postReqRun ", e.getClass().getSimpleName(), ", request failed");
                        ltg.b(outputStream);
                        ltg.e(inputStream4);
                        if (httpResCallback != null) {
                            httpResCallback.onFinished(i, str2);
                        }
                    } catch (Throwable th) {
                        th = th;
                        InputStream inputStream5 = inputStream4;
                        outputStream3 = outputStream;
                        inputStream = inputStream5;
                        ltg.b(outputStream3);
                        ltg.e(inputStream);
                        throw th;
                    }
                } catch (NullPointerException e2) {
                    e = e2;
                    inputStream2 = null;
                    str2 = null;
                    inputStream4 = inputStream2;
                    outputStream = outputStream2;
                    ReleaseLogUtil.a("HwCommonModelHttps", "postReq postReqRun ", e.getClass().getSimpleName(), ", request failed");
                    ltg.b(outputStream);
                    ltg.e(inputStream4);
                    if (httpResCallback != null) {
                        httpResCallback.onFinished(i, str2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream3;
                    outputStream3 = outputStream2;
                    ltg.b(outputStream3);
                    ltg.e(inputStream);
                    throw th;
                }
            }
            httpsURLConnection.connect();
            int responseCode = httpsURLConnection.getResponseCode();
            LogUtil.a("HwCommonModelHttps", "postReq-->responseCode:", Integer.valueOf(responseCode));
            if (responseCode == 200) {
                inputStream2 = httpsURLConnection.getInputStream();
                try {
                    try {
                        str2 = new String(ltg.c(inputStream2), "UTF-8");
                        try {
                            LogUtil.d("HwCommonModelHttps", "postReq-->jsonResult :", str2);
                            i = responseCode;
                            inputStream4 = inputStream2;
                        } catch (IOException e3) {
                            e = e3;
                            inputStream4 = inputStream2;
                            outputStream = outputStream2;
                            ReleaseLogUtil.a("HwCommonModelHttps", "postReq postReqRun ", e.getClass().getSimpleName(), ", request failed");
                            ltg.b(outputStream);
                        } catch (NullPointerException e4) {
                            e = e4;
                            inputStream4 = inputStream2;
                            outputStream = outputStream2;
                            ReleaseLogUtil.a("HwCommonModelHttps", "postReq postReqRun ", e.getClass().getSimpleName(), ", request failed");
                            ltg.b(outputStream);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream3 = inputStream2;
                        inputStream = inputStream3;
                        outputStream3 = outputStream2;
                        ltg.b(outputStream3);
                        ltg.e(inputStream);
                        throw th;
                    }
                } catch (IOException | NullPointerException e5) {
                    e = e5;
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            ltg.b(outputStream2);
        } catch (IOException e6) {
            e = e6;
            outputStream = null;
            str2 = null;
            ReleaseLogUtil.a("HwCommonModelHttps", "postReq postReqRun ", e.getClass().getSimpleName(), ", request failed");
            ltg.b(outputStream);
            ltg.e(inputStream4);
            if (httpResCallback != null) {
                httpResCallback.onFinished(i, str2);
            }
        } catch (NullPointerException e7) {
            e = e7;
            outputStream = null;
            str2 = null;
            ReleaseLogUtil.a("HwCommonModelHttps", "postReq postReqRun ", e.getClass().getSimpleName(), ", request failed");
            ltg.b(outputStream);
            ltg.e(inputStream4);
            if (httpResCallback != null) {
                httpResCallback.onFinished(i, str2);
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
        ltg.e(inputStream4);
        if (httpResCallback != null) {
            httpResCallback.onFinished(i, str2);
        }
    }

    public static String d(String str, HashMap<String, String> map, HashMap<String, String> map2) {
        LogUtil.a("HwCommonModelHttps", "entry Https.postReq");
        if (!TextUtils.isEmpty(str) && map != null && map2 != null) {
            HttpURLConnection httpURLConnectionB = lth.b(str);
            if (!(httpURLConnectionB instanceof HttpsURLConnection)) {
                return "";
            }
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnectionB;
            b(httpsURLConnection);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setUseCaches(false);
            try {
                httpsURLConnection.setRequestMethod("POST");
                ltg.d(httpsURLConnection, map2);
                String strA = ltg.a(map);
                LogUtil.d("HwCommonModelHttps", "postReq-->strBody:", strA);
                return b(httpsURLConnection, strA);
            } catch (ProtocolException e) {
                LogUtil.e("HwCommonModelHttps", e.getMessage());
            }
        }
        return "";
    }

    private static String b(HttpsURLConnection httpsURLConnection, String str) throws Throwable {
        Throwable th;
        InputStream inputStream;
        String str2;
        OutputStream outputStream;
        OutputStream outputStream2 = null;
        InputStream inputStream2 = null;
        InputStream inputStream3 = null;
        outputStream2 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                outputStream = null;
            } else {
                outputStream = httpsURLConnection.getOutputStream();
                try {
                    outputStream.write(str.getBytes("UTF-8"));
                    outputStream.flush();
                } catch (IOException unused) {
                    inputStream = null;
                    str2 = null;
                    outputStream2 = outputStream;
                    try {
                        LogUtil.e("HwCommonModelHttps", "postReq postReqJsonResult IOException,request failed");
                        ltg.b(outputStream2);
                        ltg.e(inputStream);
                        LogUtil.a("HwCommonModelHttps", "exit AchieveHttps.postReq");
                        return str2;
                    } catch (Throwable th2) {
                        th = th2;
                        ltg.b(outputStream2);
                        ltg.e(inputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = inputStream3;
                    outputStream2 = outputStream;
                    ltg.b(outputStream2);
                    ltg.e(inputStream);
                    throw th;
                }
            }
            httpsURLConnection.connect();
            int responseCode = httpsURLConnection.getResponseCode();
            LogUtil.a("HwCommonModelHttps", "postReq postReqJsonResult responseCode:", Integer.valueOf(responseCode));
            if (responseCode == 200) {
                inputStream = httpsURLConnection.getInputStream();
                try {
                    try {
                        str2 = new String(ltg.c(inputStream), "UTF-8");
                        try {
                            LogUtil.d("HwCommonModelHttps", "postReq postReqJsonResult jsonResult:", str2);
                            inputStream2 = inputStream;
                        } catch (IOException unused2) {
                            outputStream2 = outputStream;
                            LogUtil.e("HwCommonModelHttps", "postReq postReqJsonResult IOException,request failed");
                            ltg.b(outputStream2);
                            ltg.e(inputStream);
                        }
                    } catch (IOException unused3) {
                        str2 = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStream3 = inputStream;
                    inputStream = inputStream3;
                    outputStream2 = outputStream;
                    ltg.b(outputStream2);
                    ltg.e(inputStream);
                    throw th;
                }
            } else {
                str2 = null;
            }
            ltg.b(outputStream);
            ltg.e(inputStream2);
        } catch (IOException unused4) {
            inputStream = null;
            str2 = null;
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
        }
        LogUtil.a("HwCommonModelHttps", "exit AchieveHttps.postReq");
        return str2;
    }

    public static void b(HttpsURLConnection httpsURLConnection) {
        if (CommonUtil.cl()) {
            LogUtil.a("HwCommonModelHttps", "this is testVersion");
            return;
        }
        try {
            httpsURLConnection.setSSLSocketFactory(SecureSSLSocketFactoryNew.getInstance(BaseApplication.getContext()));
            httpsURLConnection.setHostnameVerifier(HttpsURLConnection.getDefaultHostnameVerifier());
        } catch (IOException unused) {
            LogUtil.e("HwCommonModelHttps", "initHttpsUrlConnection gets an exception");
        } catch (IllegalAccessException e) {
            e = e;
            LogUtil.e("HwCommonModelHttps", "initHttpsURLConnection exception", e.getMessage());
        } catch (GeneralSecurityException e2) {
            e = e2;
            LogUtil.e("HwCommonModelHttps", "initHttpsURLConnection exception", e.getMessage());
        }
    }
}
