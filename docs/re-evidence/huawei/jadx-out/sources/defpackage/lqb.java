package defpackage;

import android.text.TextUtils;
import com.huawei.hms.framework.network.restclient.hwhttp.Response;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactoryNew;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.SharedPreferenceManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lqb {
    public static HttpsURLConnection c(String str) {
        HttpsURLConnection httpsURLConnection = null;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                    HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) uRLConnectionOpenConnection;
                    try {
                        httpsURLConnection2.setConnectTimeout(5000);
                        httpsURLConnection2.setReadTimeout(5000);
                        httpsURLConnection = httpsURLConnection2;
                    } catch (IOException unused) {
                        httpsURLConnection = httpsURLConnection2;
                        LogUtil.e("AGR_HttpUtils", "httpURLConnection open failed");
                        return httpsURLConnection;
                    }
                }
                if (httpsURLConnection != null) {
                    try {
                        httpsURLConnection.setRequestMethod("POST");
                        return httpsURLConnection;
                    } catch (ProtocolException unused2) {
                        LogUtil.e("AGR_HttpUtils", "ProtocolException");
                    }
                }
                return httpsURLConnection;
            } catch (IOException unused3) {
            }
        } catch (MalformedURLException unused4) {
            LogUtil.e("AGR_HttpUtils", "MalformedURLException");
            return null;
        }
    }

    public static void e(HttpsURLConnection httpsURLConnection) {
        if (httpsURLConnection == null) {
            LogUtil.a("AGR_HttpUtils", "initHttpsURLConnection httpsURLConnection is null");
            return;
        }
        if (CommonUtil.cl()) {
            LogUtil.a("AGR_HttpUtils", "this is testversion...");
            httpsURLConnection.setHostnameVerifier(c());
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, e(), new SecureRandom());
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                return;
            } catch (KeyManagementException unused) {
                LogUtil.e("AGR_HttpUtils", "initHttpsURLConnection KeyManagementException");
                return;
            } catch (NoSuchAlgorithmException unused2) {
                LogUtil.e("AGR_HttpUtils", "initHttpsURLConnection NoSuchAlgorithmException");
                return;
            }
        }
        try {
            SecureSSLSocketFactoryNew secureSSLSocketFactoryNew = SecureSSLSocketFactoryNew.getInstance(BaseApplication.getContext());
            httpsURLConnection.setHostnameVerifier(HttpsURLConnection.getDefaultHostnameVerifier());
            if (secureSSLSocketFactoryNew != null) {
                httpsURLConnection.setSSLSocketFactory(secureSSLSocketFactoryNew);
            }
        } catch (IOException unused3) {
            LogUtil.e("AGR_HttpUtils", " IOException");
        } catch (IllegalAccessException unused4) {
            LogUtil.e("AGR_HttpUtils", " IllegalAccessException");
        } catch (KeyManagementException unused5) {
            LogUtil.e("AGR_HttpUtils", " KeyManagementException");
        } catch (KeyStoreException unused6) {
            LogUtil.e("AGR_HttpUtils", " KeyStoreException");
        } catch (NoSuchAlgorithmException unused7) {
            LogUtil.e("AGR_HttpUtils", " NoSuchAlgorithmException");
        } catch (CertificateException unused8) {
            LogUtil.e("AGR_HttpUtils", " CertificateException");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [javax.net.ssl.HttpsURLConnection] */
    public static String c(String str, String str2) {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        ?? r2 = 0;
        try {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("AGR_HttpUtils", "postData url is empty");
                return null;
            }
            try {
                httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                try {
                    httpsURLConnection.setSSLSocketFactory(SecureSSLSocketFactoryNew.getInstance(BaseApplication.getContext()));
                    httpsURLConnection.setHostnameVerifier(HttpsURLConnection.getDefaultHostnameVerifier());
                    String strC = c(httpsURLConnection, str2);
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    return strC;
                } catch (IOException | IllegalAccessException | GeneralSecurityException unused) {
                    LogUtil.e("AGR_HttpUtils", "postData GeneralSecurityException|IOException|IllegalAccessException");
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    return null;
                }
            } catch (IOException | IllegalAccessException | GeneralSecurityException unused2) {
                httpsURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                if (r2 != 0) {
                    r2.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            r2 = str;
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    private static String c(HttpURLConnection httpURLConnection, String str) throws Throwable {
        Throwable th;
        ?? r10;
        Exception e;
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        OutputStream outputStream;
        InputStream inputStream2;
        String string;
        if ("1".equals(SharedPreferenceManager.e(BaseApplication.getContext(), "developeroptions", "developerswitch"))) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "app_enter_module", "app_environment_change_url");
            if (!TextUtils.isEmpty(strE) && httpURLConnection != null) {
                httpURLConnection.setRequestProperty("Device-Id", strE);
            }
        }
        ?? r0 = 5000;
        ?? r3 = 0;
        r3 = 0;
        InputStreamReader inputStreamReader2 = null;
        r3 = 0;
        try {
            try {
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestMethod("POST");
                if (str == null || str.trim().isEmpty()) {
                    outputStream = null;
                } else {
                    httpURLConnection.setDoOutput(true);
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
                        outputStream.flush();
                        outputStream = outputStream;
                    } catch (IOException e2) {
                        e = e2;
                        e = e;
                        inputStream = null;
                        inputStreamReader = null;
                        LogUtil.e("AGR_HttpUtils", "postData ", e.getClass().getSimpleName(), " ex = ", e.getMessage(), ", cause = ", e.getCause());
                        IoUtils.c(inputStreamReader);
                        IoUtils.c(outputStream);
                        IoUtils.c(inputStream);
                        return null;
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        e = e;
                        inputStream = null;
                        inputStreamReader = null;
                        LogUtil.e("AGR_HttpUtils", "postData ", e.getClass().getSimpleName(), " ex = ", e.getMessage(), ", cause = ", e.getCause());
                        IoUtils.c(inputStreamReader);
                        IoUtils.c(outputStream);
                        IoUtils.c(inputStream);
                        return null;
                    } catch (NullPointerException e4) {
                        e = e4;
                        e = e;
                        inputStream = null;
                        inputStreamReader = null;
                        LogUtil.e("AGR_HttpUtils", "postData ", e.getClass().getSimpleName(), " ex = ", e.getMessage(), ", cause = ", e.getCause());
                        IoUtils.c(inputStreamReader);
                        IoUtils.c(outputStream);
                        IoUtils.c(inputStream);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        r10 = 0;
                        r0 = outputStream;
                        IoUtils.c(r3);
                        IoUtils.c(r0);
                        IoUtils.c(r10);
                        throw th;
                    }
                }
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                        try {
                            StringBuilder sb = new StringBuilder(1024);
                            char[] cArr = new char[1024];
                            while (true) {
                                int i = inputStreamReader.read(cArr, 0, 1024);
                                if (i == -1) {
                                    break;
                                }
                                sb.append(cArr, 0, i);
                            }
                            inputStreamReader2 = inputStreamReader;
                            string = sb.toString();
                            inputStream2 = inputStream;
                        } catch (IOException e5) {
                            e = e5;
                            LogUtil.e("AGR_HttpUtils", "postData ", e.getClass().getSimpleName(), " ex = ", e.getMessage(), ", cause = ", e.getCause());
                            IoUtils.c(inputStreamReader);
                            IoUtils.c(outputStream);
                            IoUtils.c(inputStream);
                            return null;
                        } catch (IllegalArgumentException e6) {
                            e = e6;
                            LogUtil.e("AGR_HttpUtils", "postData ", e.getClass().getSimpleName(), " ex = ", e.getMessage(), ", cause = ", e.getCause());
                            IoUtils.c(inputStreamReader);
                            IoUtils.c(outputStream);
                            IoUtils.c(inputStream);
                            return null;
                        } catch (NullPointerException e7) {
                            e = e7;
                            LogUtil.e("AGR_HttpUtils", "postData ", e.getClass().getSimpleName(), " ex = ", e.getMessage(), ", cause = ", e.getCause());
                            IoUtils.c(inputStreamReader);
                            IoUtils.c(outputStream);
                            IoUtils.c(inputStream);
                            return null;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        e = e;
                        inputStreamReader = null;
                        LogUtil.e("AGR_HttpUtils", "postData ", e.getClass().getSimpleName(), " ex = ", e.getMessage(), ", cause = ", e.getCause());
                        IoUtils.c(inputStreamReader);
                        IoUtils.c(outputStream);
                        IoUtils.c(inputStream);
                        return null;
                    } catch (IllegalArgumentException e9) {
                        e = e9;
                        e = e;
                        inputStreamReader = null;
                        LogUtil.e("AGR_HttpUtils", "postData ", e.getClass().getSimpleName(), " ex = ", e.getMessage(), ", cause = ", e.getCause());
                        IoUtils.c(inputStreamReader);
                        IoUtils.c(outputStream);
                        IoUtils.c(inputStream);
                        return null;
                    } catch (NullPointerException e10) {
                        e = e10;
                        e = e;
                        inputStreamReader = null;
                        LogUtil.e("AGR_HttpUtils", "postData ", e.getClass().getSimpleName(), " ex = ", e.getMessage(), ", cause = ", e.getCause());
                        IoUtils.c(inputStreamReader);
                        IoUtils.c(outputStream);
                        IoUtils.c(inputStream);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        r0 = outputStream;
                        r10 = inputStream;
                        IoUtils.c(r3);
                        IoUtils.c(r0);
                        IoUtils.c(r10);
                        throw th;
                    }
                } else {
                    inputStream2 = null;
                    string = null;
                }
                IoUtils.c(inputStreamReader2);
                IoUtils.c(outputStream);
                IoUtils.c(inputStream2);
                return string;
            } catch (Throwable th4) {
                th = th4;
                r3 = str;
                r10 = httpURLConnection;
            }
        } catch (IOException e11) {
            e = e11;
            e = e;
            inputStream = null;
            inputStreamReader = null;
            outputStream = null;
            LogUtil.e("AGR_HttpUtils", "postData ", e.getClass().getSimpleName(), " ex = ", e.getMessage(), ", cause = ", e.getCause());
            IoUtils.c(inputStreamReader);
            IoUtils.c(outputStream);
            IoUtils.c(inputStream);
            return null;
        } catch (IllegalArgumentException e12) {
            e = e12;
            e = e;
            inputStream = null;
            inputStreamReader = null;
            outputStream = null;
            LogUtil.e("AGR_HttpUtils", "postData ", e.getClass().getSimpleName(), " ex = ", e.getMessage(), ", cause = ", e.getCause());
            IoUtils.c(inputStreamReader);
            IoUtils.c(outputStream);
            IoUtils.c(inputStream);
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            e = e;
            inputStream = null;
            inputStreamReader = null;
            outputStream = null;
            LogUtil.e("AGR_HttpUtils", "postData ", e.getClass().getSimpleName(), " ex = ", e.getMessage(), ", cause = ", e.getCause());
            IoUtils.c(inputStreamReader);
            IoUtils.c(outputStream);
            IoUtils.c(inputStream);
            return null;
        } catch (Throwable th5) {
            th = th5;
            r10 = 0;
            r0 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    public static boolean d(String str, String str2) {
        Exception e;
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("AGR_HttpUtils", "downloadFile url or filePath is empty");
            return false;
        }
        String strC = CommonUtil.c(str2);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("AGR_HttpUtils", "downloadFile safeFilePath is empty");
            return false;
        }
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            try {
                httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                try {
                    httpsURLConnection.setSSLSocketFactory(SecureSSLSocketFactoryNew.getInstance(BaseApplication.getContext()));
                    httpsURLConnection.setHostnameVerifier(HttpsURLConnection.getDefaultHostnameVerifier());
                    boolean zD = d(httpsURLConnection, strC);
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    return zD;
                } catch (IOException e2) {
                    e = e2;
                    httpsURLConnection2 = httpsURLConnection;
                    LogUtil.e("AGR_HttpUtils", "downloadFile GeneralSecurityException|IOException|IllegalAccessException exception = ", e.getMessage(), ", cause = ", e.getCause());
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                    return false;
                } catch (ClassCastException e3) {
                    e = e3;
                    httpsURLConnection2 = httpsURLConnection;
                    LogUtil.e("AGR_HttpUtils", "downloadFile GeneralSecurityException|IOException|IllegalAccessException exception = ", e.getMessage(), ", cause = ", e.getCause());
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                    return false;
                } catch (IllegalAccessException e4) {
                    e = e4;
                    httpsURLConnection2 = httpsURLConnection;
                    LogUtil.e("AGR_HttpUtils", "downloadFile GeneralSecurityException|IOException|IllegalAccessException exception = ", e.getMessage(), ", cause = ", e.getCause());
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                    return false;
                } catch (GeneralSecurityException e5) {
                    e = e5;
                    httpsURLConnection2 = httpsURLConnection;
                    LogUtil.e("AGR_HttpUtils", "downloadFile GeneralSecurityException|IOException|IllegalAccessException exception = ", e.getMessage(), ", cause = ", e.getCause());
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                httpsURLConnection = httpsURLConnection2;
            }
        } catch (IOException | ClassCastException | IllegalAccessException | GeneralSecurityException e6) {
            e = e6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.Closeable] */
    private static boolean d(HttpURLConnection httpURLConnection, String str) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException e;
        ?? r6;
        FileOutputStream fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        ?? r3 = 0;
        try {
            try {
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setRequestMethod("GET");
                if (httpURLConnection.getResponseCode() == 200) {
                    File file = new File(str);
                    e(file, true);
                    httpURLConnection = httpURLConnection.getInputStream();
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = httpURLConnection.read(bArr);
                                if (i != -1) {
                                    fileOutputStream3.write(bArr, 0, i);
                                } else {
                                    fileOutputStream3.flush();
                                    IoUtils.c(httpURLConnection);
                                    IoUtils.c(fileOutputStream3);
                                    return true;
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                            fileOutputStream2 = fileOutputStream3;
                            LogUtil.e("AGR_HttpUtils", "download IOException", e.getMessage());
                            IoUtils.c(httpURLConnection);
                            IoUtils.c(fileOutputStream2);
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream2 = fileOutputStream3;
                            r6 = httpURLConnection;
                        }
                    } catch (IOException e3) {
                        e = e3;
                    }
                } else {
                    IoUtils.c(null);
                    IoUtils.c(fileOutputStream2);
                    return false;
                }
            } catch (Throwable th3) {
                th = th3;
                r6 = httpURLConnection;
            }
        } catch (IOException e4) {
            e = e4;
            httpURLConnection = 0;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        FileOutputStream fileOutputStream4 = fileOutputStream2;
        r3 = r6;
        fileOutputStream = fileOutputStream4;
        IoUtils.c(r3);
        IoUtils.c(fileOutputStream);
        throw th;
    }

    private static void e(File file, boolean z) throws IOException {
        if (z ? file.exists() : file.exists() & file.isFile()) {
            LogUtil.a("AGR_HttpUtils", "initializeDestFile isDeleteFile = ", Boolean.valueOf(file.delete()));
        }
        if (file.getParentFile() != null && !file.getParentFile().exists()) {
            LogUtil.a("AGR_HttpUtils", "initializeDestFile isMkdirFile = ", Boolean.valueOf(file.getParentFile().mkdirs()));
        }
        if (file.isFile()) {
            return;
        }
        LogUtil.a("AGR_HttpUtils", "initializeDestFile isCreateNewFile = ", Boolean.valueOf(file.createNewFile()));
    }

    private static TrustManager[] e() {
        return new TrustManager[]{new X509TrustManager() { // from class: lqb.2
            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                LogUtil.a("AGR_HttpUtils", "checkClientTrusted enter ");
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                if (x509CertificateArr == null || x509CertificateArr.length <= 0) {
                    LogUtil.e("AGR_HttpUtils", "check server trusted error");
                } else {
                    try {
                        x509CertificateArr[0].checkValidity();
                    } catch (CertificateException unused) {
                        throw new CertificateException("Certificate not valid or trusted.");
                    }
                }
            }
        }};
    }

    public static final HostnameVerifier c() {
        return new HostnameVerifier() { // from class: lqb.1
            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str, SSLSession sSLSession) {
                return !TextUtils.isEmpty(str);
            }
        };
    }

    public static void c(HttpURLConnection httpURLConnection, HashMap<String, String> map) {
        if (httpURLConnection == null || map == null || map.size() <= 0 || (r5 = map.entrySet().iterator()) == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                httpURLConnection.setRequestProperty(String.valueOf(key), String.valueOf(value));
                LogUtil.d("AGR_HttpUtils", "setHeader-->key:" + String.valueOf(key) + ",value:" + String.valueOf(value));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.ByteArrayOutputStream] */
    public static byte[] e(InputStream inputStream) throws Exception {
        ?? byteArrayOutputStream;
        byte[] byteArray = new byte[0];
        ?? r4 = 0;
        ?? r5 = 0;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    if (inputStream != null) {
                        int i = inputStream.read(bArr);
                        while (i != -1) {
                            byteArrayOutputStream.write(bArr, 0, i);
                            i = inputStream.read(bArr);
                        }
                        byteArrayOutputStream.flush();
                    }
                    byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                        r4 = bArr;
                    } catch (IOException unused) {
                        LogUtil.e("AGR_HttpUtils", "IOException byteArrayOutputStream close error");
                        r4 = bArr;
                    }
                } catch (IOException unused2) {
                    r5 = byteArrayOutputStream;
                    LogUtil.e("AGR_HttpUtils", "IOException error");
                    r4 = r5;
                    if (r5 != 0) {
                        try {
                            r5.close();
                            r4 = r5;
                        } catch (IOException unused3) {
                            LogUtil.e("AGR_HttpUtils", "IOException byteArrayOutputStream close error");
                            r4 = r5;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (byteArrayOutputStream != 0) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused4) {
                            LogUtil.e("AGR_HttpUtils", "IOException byteArrayOutputStream close error");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = r4;
            }
        } catch (IOException unused5) {
        }
        return byteArray;
    }

    public static void a(String str, JSONObject jSONObject, ResultCallback<String> resultCallback) {
        if (TextUtils.isEmpty(str) || jSONObject == null || resultCallback == null) {
            LogUtil.j("AGR_HttpUtils", "post() url is null or object or callback is null");
        } else {
            oet.d().c(str, b(), jSONObject.toString(), String.class, resultCallback);
        }
    }

    public static Response b(String str, JSONObject jSONObject) throws IOException {
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            LogUtil.j("AGR_HttpUtils", "post() url or object is null");
            return new Response.Builder().build();
        }
        return (Response) oet.d().e(str, b(), jSONObject.toString(), Response.class);
    }

    private static Map<String, String> b() {
        HashMap map = new HashMap();
        if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            map.put("x-huid", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        }
        map.put("x-version", CommonUtil.c(BaseApplication.getContext()));
        map.put("Content-Type", "application/json; charset=utf-8");
        return map;
    }
}
