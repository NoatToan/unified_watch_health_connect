package defpackage;

import androidx.webkit.ProxyConfig;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactoryNew;
import com.huawei.secure.android.common.ssl.hostname.StrictHostnameVerifier;
import com.huawei.ui.main.stories.lightcloud.service.LightCloudHttpCallBack;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes19.dex */
public class vsh {
    private static volatile ExecutorService e;

    public static void d(final String str, final String str2, final LightCloudHttpCallBack lightCloudHttpCallBack) {
        LogUtil.a("UIDV_HttpUtil", "pullRefresh");
        if (str == null || "".equals(str)) {
            LogUtil.j("UIDV_HttpUtil", "url is null");
            return;
        }
        if (e == null || e.isShutdown()) {
            LogUtil.a("UIDV_HttpUtil", "new executorService");
            e = Executors.newSingleThreadExecutor();
        }
        e.execute(new Runnable() { // from class: vsh.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                vsh.b(str, str2, lightCloudHttpCallBack);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, String str2, LightCloudHttpCallBack lightCloudHttpCallBack) throws Throwable {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        OutputStreamWriter outputStreamWriter;
        PrintWriter printWriter;
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        int responseCode;
        InputStream inputStream2;
        HttpURLConnection httpURLConnectionC;
        PrintWriter printWriter2;
        String str3 = "";
        LogUtil.a("UIDV_HttpUtil", "doPostReq");
        int i = -1;
        try {
            LogUtil.d("UIDV_HttpUtil", "param = ", str2);
            httpURLConnectionC = c(str);
            try {
                if (httpURLConnectionC == null) {
                    LogUtil.j("UIDV_HttpUtil", "urlConnection is null");
                    vsi.c(httpURLConnectionC);
                    vsi.c((OutputStreamWriter) null);
                    vsi.d((PrintWriter) null);
                    vsi.a((InputStreamReader) null);
                    vsi.c((InputStream) null);
                    vsi.c((OutputStream) null);
                    lightCloudHttpCallBack.onResponce(-1, "");
                    return;
                }
                if (str2 == null || "".equals(str2.trim())) {
                    LogUtil.j("UIDV_HttpUtil", "parm is null");
                    outputStream = null;
                    outputStreamWriter = null;
                    printWriter = null;
                } else {
                    outputStream = httpURLConnectionC.getOutputStream();
                    try {
                        outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
                        try {
                            printWriter = new PrintWriter(outputStreamWriter);
                            try {
                                printWriter.print(str2);
                                printWriter.flush();
                            } catch (IOException e2) {
                                e = e2;
                                responseCode = -1;
                                inputStream2 = null;
                                inputStreamReader = null;
                                try {
                                    ReleaseLogUtil.a("UIDV_HttpUtil", "doPostReq ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                                    vsi.c(httpURLConnectionC);
                                    vsi.c(outputStreamWriter);
                                    vsi.d(printWriter);
                                    vsi.a(inputStreamReader);
                                    vsi.c(inputStream2);
                                    vsi.c(outputStream);
                                    lightCloudHttpCallBack.onResponce(-1, str3);
                                } catch (Throwable th) {
                                    th = th;
                                    inputStream = inputStream2;
                                    httpURLConnection = httpURLConnectionC;
                                    i = responseCode;
                                    vsi.c(httpURLConnection);
                                    vsi.c(outputStreamWriter);
                                    vsi.d(printWriter);
                                    vsi.a(inputStreamReader);
                                    vsi.c(inputStream);
                                    vsi.c(outputStream);
                                    lightCloudHttpCallBack.onResponce(i, str3);
                                    throw th;
                                }
                            } catch (NullPointerException e3) {
                                e = e3;
                                responseCode = -1;
                                inputStream2 = null;
                                inputStreamReader = null;
                                ReleaseLogUtil.a("UIDV_HttpUtil", "doPostReq ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                                vsi.c(httpURLConnectionC);
                                vsi.c(outputStreamWriter);
                                vsi.d(printWriter);
                                vsi.a(inputStreamReader);
                                vsi.c(inputStream2);
                                vsi.c(outputStream);
                                lightCloudHttpCallBack.onResponce(-1, str3);
                            } catch (Throwable th2) {
                                th = th2;
                                printWriter2 = printWriter;
                                inputStream = null;
                                inputStreamReader = null;
                                printWriter = printWriter2;
                                httpURLConnection = httpURLConnectionC;
                                vsi.c(httpURLConnection);
                                vsi.c(outputStreamWriter);
                                vsi.d(printWriter);
                                vsi.a(inputStreamReader);
                                vsi.c(inputStream);
                                vsi.c(outputStream);
                                lightCloudHttpCallBack.onResponce(i, str3);
                                throw th;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            printWriter = null;
                            responseCode = -1;
                            inputStream2 = null;
                            inputStreamReader = null;
                            ReleaseLogUtil.a("UIDV_HttpUtil", "doPostReq ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                            vsi.c(httpURLConnectionC);
                            vsi.c(outputStreamWriter);
                            vsi.d(printWriter);
                            vsi.a(inputStreamReader);
                            vsi.c(inputStream2);
                            vsi.c(outputStream);
                            lightCloudHttpCallBack.onResponce(-1, str3);
                        } catch (NullPointerException e5) {
                            e = e5;
                            printWriter = null;
                            responseCode = -1;
                            inputStream2 = null;
                            inputStreamReader = null;
                            ReleaseLogUtil.a("UIDV_HttpUtil", "doPostReq ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                            vsi.c(httpURLConnectionC);
                            vsi.c(outputStreamWriter);
                            vsi.d(printWriter);
                            vsi.a(inputStreamReader);
                            vsi.c(inputStream2);
                            vsi.c(outputStream);
                            lightCloudHttpCallBack.onResponce(-1, str3);
                        } catch (Throwable th3) {
                            th = th3;
                            printWriter = null;
                            printWriter2 = printWriter;
                            inputStream = null;
                            inputStreamReader = null;
                            printWriter = printWriter2;
                            httpURLConnection = httpURLConnectionC;
                            vsi.c(httpURLConnection);
                            vsi.c(outputStreamWriter);
                            vsi.d(printWriter);
                            vsi.a(inputStreamReader);
                            vsi.c(inputStream);
                            vsi.c(outputStream);
                            lightCloudHttpCallBack.onResponce(i, str3);
                            throw th;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        outputStreamWriter = null;
                        printWriter = null;
                        responseCode = -1;
                        inputStream2 = null;
                        inputStreamReader = null;
                        ReleaseLogUtil.a("UIDV_HttpUtil", "doPostReq ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                        vsi.c(httpURLConnectionC);
                        vsi.c(outputStreamWriter);
                        vsi.d(printWriter);
                        vsi.a(inputStreamReader);
                        vsi.c(inputStream2);
                        vsi.c(outputStream);
                        lightCloudHttpCallBack.onResponce(-1, str3);
                    } catch (NullPointerException e7) {
                        e = e7;
                        outputStreamWriter = null;
                        printWriter = null;
                        responseCode = -1;
                        inputStream2 = null;
                        inputStreamReader = null;
                        ReleaseLogUtil.a("UIDV_HttpUtil", "doPostReq ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                        vsi.c(httpURLConnectionC);
                        vsi.c(outputStreamWriter);
                        vsi.d(printWriter);
                        vsi.a(inputStreamReader);
                        vsi.c(inputStream2);
                        vsi.c(outputStream);
                        lightCloudHttpCallBack.onResponce(-1, str3);
                    } catch (Throwable th4) {
                        th = th4;
                        outputStreamWriter = null;
                        printWriter = null;
                        printWriter2 = printWriter;
                        inputStream = null;
                        inputStreamReader = null;
                        printWriter = printWriter2;
                        httpURLConnection = httpURLConnectionC;
                        vsi.c(httpURLConnection);
                        vsi.c(outputStreamWriter);
                        vsi.d(printWriter);
                        vsi.a(inputStreamReader);
                        vsi.c(inputStream);
                        vsi.c(outputStream);
                        lightCloudHttpCallBack.onResponce(i, str3);
                        throw th;
                    }
                }
                httpURLConnectionC.connect();
                responseCode = httpURLConnectionC.getResponseCode();
                try {
                    inputStream = httpURLConnectionC.getInputStream();
                    try {
                        InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream, "UTF-8");
                        try {
                            str3 = "" + a(inputStreamReader2);
                            LogUtil.d("UIDV_HttpUtil", "result = ", str3);
                            vsi.c(httpURLConnectionC);
                            vsi.c(outputStreamWriter);
                            vsi.d(printWriter);
                            vsi.a(inputStreamReader2);
                            vsi.c(inputStream);
                            vsi.c(outputStream);
                            lightCloudHttpCallBack.onResponce(responseCode, str3);
                        } catch (IOException e8) {
                            e = e8;
                            inputStreamReader = inputStreamReader2;
                            inputStream2 = inputStream;
                            ReleaseLogUtil.a("UIDV_HttpUtil", "doPostReq ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                            vsi.c(httpURLConnectionC);
                            vsi.c(outputStreamWriter);
                            vsi.d(printWriter);
                            vsi.a(inputStreamReader);
                            vsi.c(inputStream2);
                            vsi.c(outputStream);
                            lightCloudHttpCallBack.onResponce(-1, str3);
                        } catch (NullPointerException e9) {
                            e = e9;
                            inputStreamReader = inputStreamReader2;
                            inputStream2 = inputStream;
                            ReleaseLogUtil.a("UIDV_HttpUtil", "doPostReq ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                            vsi.c(httpURLConnectionC);
                            vsi.c(outputStreamWriter);
                            vsi.d(printWriter);
                            vsi.a(inputStreamReader);
                            vsi.c(inputStream2);
                            vsi.c(outputStream);
                            lightCloudHttpCallBack.onResponce(-1, str3);
                        } catch (Throwable th5) {
                            th = th5;
                            inputStreamReader = inputStreamReader2;
                            printWriter2 = printWriter;
                            i = responseCode;
                            printWriter = printWriter2;
                            httpURLConnection = httpURLConnectionC;
                            vsi.c(httpURLConnection);
                            vsi.c(outputStreamWriter);
                            vsi.d(printWriter);
                            vsi.a(inputStreamReader);
                            vsi.c(inputStream);
                            vsi.c(outputStream);
                            lightCloudHttpCallBack.onResponce(i, str3);
                            throw th;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        inputStream2 = inputStream;
                        inputStreamReader = null;
                        ReleaseLogUtil.a("UIDV_HttpUtil", "doPostReq ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                        vsi.c(httpURLConnectionC);
                        vsi.c(outputStreamWriter);
                        vsi.d(printWriter);
                        vsi.a(inputStreamReader);
                        vsi.c(inputStream2);
                        vsi.c(outputStream);
                        lightCloudHttpCallBack.onResponce(-1, str3);
                    } catch (NullPointerException e11) {
                        e = e11;
                        inputStream2 = inputStream;
                        inputStreamReader = null;
                        ReleaseLogUtil.a("UIDV_HttpUtil", "doPostReq ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                        vsi.c(httpURLConnectionC);
                        vsi.c(outputStreamWriter);
                        vsi.d(printWriter);
                        vsi.a(inputStreamReader);
                        vsi.c(inputStream2);
                        vsi.c(outputStream);
                        lightCloudHttpCallBack.onResponce(-1, str3);
                    } catch (Throwable th6) {
                        th = th6;
                        printWriter2 = printWriter;
                        i = responseCode;
                        inputStreamReader = null;
                        printWriter = printWriter2;
                        httpURLConnection = httpURLConnectionC;
                        vsi.c(httpURLConnection);
                        vsi.c(outputStreamWriter);
                        vsi.d(printWriter);
                        vsi.a(inputStreamReader);
                        vsi.c(inputStream);
                        vsi.c(outputStream);
                        lightCloudHttpCallBack.onResponce(i, str3);
                        throw th;
                    }
                } catch (IOException e12) {
                    e = e12;
                    inputStream = null;
                    inputStream2 = inputStream;
                    inputStreamReader = null;
                    ReleaseLogUtil.a("UIDV_HttpUtil", "doPostReq ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                    vsi.c(httpURLConnectionC);
                    vsi.c(outputStreamWriter);
                    vsi.d(printWriter);
                    vsi.a(inputStreamReader);
                    vsi.c(inputStream2);
                    vsi.c(outputStream);
                    lightCloudHttpCallBack.onResponce(-1, str3);
                } catch (NullPointerException e13) {
                    e = e13;
                    inputStream = null;
                    inputStream2 = inputStream;
                    inputStreamReader = null;
                    ReleaseLogUtil.a("UIDV_HttpUtil", "doPostReq ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                    vsi.c(httpURLConnectionC);
                    vsi.c(outputStreamWriter);
                    vsi.d(printWriter);
                    vsi.a(inputStreamReader);
                    vsi.c(inputStream2);
                    vsi.c(outputStream);
                    lightCloudHttpCallBack.onResponce(-1, str3);
                } catch (Throwable th7) {
                    th = th7;
                    i = responseCode;
                    printWriter2 = printWriter;
                    inputStream = null;
                    inputStreamReader = null;
                    printWriter = printWriter2;
                    httpURLConnection = httpURLConnectionC;
                    vsi.c(httpURLConnection);
                    vsi.c(outputStreamWriter);
                    vsi.d(printWriter);
                    vsi.a(inputStreamReader);
                    vsi.c(inputStream);
                    vsi.c(outputStream);
                    lightCloudHttpCallBack.onResponce(i, str3);
                    throw th;
                }
            } catch (IOException e14) {
                e = e14;
                outputStream = null;
                outputStreamWriter = null;
                printWriter = null;
                responseCode = -1;
                inputStream2 = null;
                inputStreamReader = null;
                ReleaseLogUtil.a("UIDV_HttpUtil", "doPostReq ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                vsi.c(httpURLConnectionC);
                vsi.c(outputStreamWriter);
                vsi.d(printWriter);
                vsi.a(inputStreamReader);
                vsi.c(inputStream2);
                vsi.c(outputStream);
                lightCloudHttpCallBack.onResponce(-1, str3);
            } catch (NullPointerException e15) {
                e = e15;
                outputStream = null;
                outputStreamWriter = null;
                printWriter = null;
                responseCode = -1;
                inputStream2 = null;
                inputStreamReader = null;
                ReleaseLogUtil.a("UIDV_HttpUtil", "doPostReq ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                vsi.c(httpURLConnectionC);
                vsi.c(outputStreamWriter);
                vsi.d(printWriter);
                vsi.a(inputStreamReader);
                vsi.c(inputStream2);
                vsi.c(outputStream);
                lightCloudHttpCallBack.onResponce(-1, str3);
            } catch (Throwable th8) {
                th = th8;
                outputStream = null;
            }
        } catch (IOException e16) {
            e = e16;
            responseCode = -1;
            inputStream2 = null;
            httpURLConnectionC = null;
            outputStream = null;
            outputStreamWriter = null;
            printWriter = null;
            inputStreamReader = null;
            ReleaseLogUtil.a("UIDV_HttpUtil", "doPostReq ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
            vsi.c(httpURLConnectionC);
            vsi.c(outputStreamWriter);
            vsi.d(printWriter);
            vsi.a(inputStreamReader);
            vsi.c(inputStream2);
            vsi.c(outputStream);
            lightCloudHttpCallBack.onResponce(-1, str3);
        } catch (NullPointerException e17) {
            e = e17;
            responseCode = -1;
            inputStream2 = null;
            httpURLConnectionC = null;
            outputStream = null;
            outputStreamWriter = null;
            printWriter = null;
            inputStreamReader = null;
            ReleaseLogUtil.a("UIDV_HttpUtil", "doPostReq ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
            vsi.c(httpURLConnectionC);
            vsi.c(outputStreamWriter);
            vsi.d(printWriter);
            vsi.a(inputStreamReader);
            vsi.c(inputStream2);
            vsi.c(outputStream);
            lightCloudHttpCallBack.onResponce(-1, str3);
        } catch (Throwable th9) {
            th = th9;
            httpURLConnection = null;
            outputStream = null;
            outputStreamWriter = null;
            printWriter = null;
            inputStream = null;
            inputStreamReader = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v30, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    private static HttpURLConnection c(String str) {
        CertificateException e2;
        ?? r6;
        NoSuchAlgorithmException e3;
        KeyStoreException e4;
        KeyManagementException e5;
        IllegalAccessException e6;
        ?? r7;
        ?? r8;
        ?? r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        try {
            URL url = new URL(str);
            if (ProxyConfig.MATCH_HTTPS.equals(url.getProtocol().toLowerCase(Locale.ENGLISH))) {
                LogUtil.a("UIDV_HttpUtil", ProxyConfig.MATCH_HTTPS);
                r6 = (HttpsURLConnection) url.openConnection();
                try {
                    r6.setSSLSocketFactory(SecureSSLSocketFactoryNew.getInstance(BaseApplication.getContext()));
                    r6.setHostnameVerifier(new StrictHostnameVerifier());
                    r8 = r6;
                } catch (IOException unused) {
                    LogUtil.e("UIDV_HttpUtil", "IOException");
                    r7 = r6;
                    return r7;
                } catch (IllegalAccessException e7) {
                    e6 = e7;
                    LogUtil.e("UIDV_HttpUtil", "IllegalAccessException:", e6.getMessage());
                    r7 = r6;
                    return r7;
                } catch (KeyManagementException e8) {
                    e5 = e8;
                    LogUtil.e("UIDV_HttpUtil", "KeyManagementException:", e5.getMessage());
                    r7 = r6;
                    return r7;
                } catch (KeyStoreException e9) {
                    e4 = e9;
                    LogUtil.e("UIDV_HttpUtil", "KeyStoreException:", e4.getMessage());
                    r7 = r6;
                    return r7;
                } catch (NoSuchAlgorithmException e10) {
                    e3 = e10;
                    LogUtil.e("UIDV_HttpUtil", "NoSuchAlgorithmException:", e3.getMessage());
                    r7 = r6;
                    return r7;
                } catch (CertificateException e11) {
                    e2 = e11;
                    LogUtil.e("UIDV_HttpUtil", "CertificateException:", e2.getMessage());
                    r7 = r6;
                    return r7;
                }
            } else {
                r8 = (HttpURLConnection) url.openConnection();
            }
            r2 = r8;
            r2.setRequestMethod("POST");
            r2.setRequestProperty("Content-Type", "application/json");
            r2.setUseCaches(false);
            r2.setDoInput(true);
            r2.setDoOutput(true);
            r2.setReadTimeout(10000);
            r2.setConnectTimeout(10000);
            return r2;
        } catch (IOException unused2) {
            r6 = r2;
        } catch (IllegalAccessException e12) {
            e6 = e12;
            r6 = r2;
        } catch (KeyManagementException e13) {
            e5 = e13;
            r6 = r2;
        } catch (KeyStoreException e14) {
            e4 = e14;
            r6 = r2;
        } catch (NoSuchAlgorithmException e15) {
            e3 = e15;
            r6 = r2;
        } catch (CertificateException e16) {
            e2 = e16;
            r6 = r2;
        }
    }

    private static String a(InputStreamReader inputStreamReader) {
        char[] cArr = new char[1024];
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            try {
                int i2 = inputStreamReader.read(cArr, 0, 1024);
                if (i2 == -1) {
                    break;
                }
                sb.append(cArr, 0, i2);
                i += i2;
            } catch (IOException e2) {
                LogUtil.a("UIDV_HttpUtil", "ResourceManagerHelper postRequest result e:", e2.getMessage());
            }
        } while (i <= 31459280);
        return sb.toString();
    }
}
