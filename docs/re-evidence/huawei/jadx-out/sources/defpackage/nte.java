package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactoryNew;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes11.dex */
public class nte {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ExecutorService f43679c;

    public static void e(final String str, final HashMap<String, String> map, final HashMap<String, String> map2, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("SMART_HttpUtil", "pullRefresh");
        if (CommonUtil.ca()) {
            LogUtil.a("SMART_HttpUtil", "storeDemo no smart");
            iBaseResponseCallback.a(-1, "");
        } else if (b(str, map, map2)) {
            if (f43679c == null || f43679c.isShutdown()) {
                f43679c = Executors.newSingleThreadExecutor();
            }
            f43679c.execute(new Runnable() { // from class: nte.5
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    nte.d(str, map, map2, iBaseResponseCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, HashMap<String, String> map, HashMap<String, String> map2, IBaseResponseCallback iBaseResponseCallback) throws Throwable {
        LogUtil.a("SMART_HttpUtil", "doPostReq");
        c(str, map, map2, iBaseResponseCallback);
    }

    private static int c(String str, HashMap<String, String> map, HashMap<String, String> map2, IBaseResponseCallback iBaseResponseCallback) throws Throwable {
        LogUtil.a("SMART_HttpUtil", "entry Https.postReq");
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                if (!e(str)) {
                    if (httpURLConnection == null) {
                        return -1;
                    }
                    e((HttpsURLConnection) httpURLConnection);
                }
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                try {
                    httpURLConnection.setRequestMethod("POST");
                    d(httpURLConnection, map2);
                    d(a(map), httpURLConnection, iBaseResponseCallback);
                    return 200;
                } catch (ProtocolException e) {
                    LogUtil.e("SMART_HttpUtil", e.getMessage());
                    return -1;
                }
            } catch (IOException unused) {
                LogUtil.a("SMART_HttpUtil", "IOException");
                return -1;
            }
        } catch (MalformedURLException unused2) {
            LogUtil.e("SMART_HttpUtil", "postHttpsReq MalformedURLException");
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    private static void d(String str, HttpURLConnection httpURLConnection, IBaseResponseCallback iBaseResponseCallback) throws Throwable {
        OutputStream outputStream;
        InputStream inputStream;
        String strA;
        int i = -1;
        OutputStream outputStream2 = null;
        InputStream inputStream2 = null;
        String str2 = null;
        try {
            try {
                if (TextUtils.isEmpty(str)) {
                    outputStream = null;
                } else {
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
                        outputStream.flush();
                    } catch (IOException e) {
                        e = e;
                        inputStream = null;
                        ReleaseLogUtil.a("SMART_HttpUtil", "postRequest ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                        b(outputStream, inputStream);
                        httpURLConnection.disconnect();
                        if (iBaseResponseCallback != null) {
                            iBaseResponseCallback.a(i, str2);
                        }
                        LogUtil.a("SMART_HttpUtil", "exit AchieveHttps.postReq");
                    } catch (NullPointerException e2) {
                        e = e2;
                        inputStream = null;
                        ReleaseLogUtil.a("SMART_HttpUtil", "postRequest ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                        b(outputStream, inputStream);
                        httpURLConnection.disconnect();
                        if (iBaseResponseCallback != null) {
                            iBaseResponseCallback.a(i, str2);
                        }
                        LogUtil.a("SMART_HttpUtil", "exit AchieveHttps.postReq");
                    } catch (Throwable th) {
                        th = th;
                        outputStream2 = outputStream;
                        b(outputStream2, 0);
                        httpURLConnection.disconnect();
                        throw th;
                    }
                }
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                LogUtil.a("SMART_HttpUtil", "postReq-->respCode:", Integer.valueOf(responseCode));
                if (responseCode == 200) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        strA = a(d(inputStream));
                        i = responseCode;
                        inputStream2 = inputStream;
                    } catch (IOException e3) {
                        e = e3;
                        ReleaseLogUtil.a("SMART_HttpUtil", "postRequest ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                        b(outputStream, inputStream);
                        httpURLConnection.disconnect();
                    } catch (NullPointerException e4) {
                        e = e4;
                        ReleaseLogUtil.a("SMART_HttpUtil", "postRequest ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
                        b(outputStream, inputStream);
                        httpURLConnection.disconnect();
                    }
                } else {
                    strA = null;
                }
                b(outputStream, inputStream2);
                httpURLConnection.disconnect();
                str2 = strA;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
            outputStream = null;
            inputStream = null;
            ReleaseLogUtil.a("SMART_HttpUtil", "postRequest ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
            b(outputStream, inputStream);
            httpURLConnection.disconnect();
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(i, str2);
            }
            LogUtil.a("SMART_HttpUtil", "exit AchieveHttps.postReq");
        } catch (NullPointerException e6) {
            e = e6;
            outputStream = null;
            inputStream = null;
            ReleaseLogUtil.a("SMART_HttpUtil", "postRequest ", e.getClass().getSimpleName(), ": ", LogAnonymous.b(e));
            b(outputStream, inputStream);
            httpURLConnection.disconnect();
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(i, str2);
            }
            LogUtil.a("SMART_HttpUtil", "exit AchieveHttps.postReq");
        } catch (Throwable th3) {
            th = th3;
            b(outputStream2, 0);
            httpURLConnection.disconnect();
            throw th;
        }
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i, str2);
        }
        LogUtil.a("SMART_HttpUtil", "exit AchieveHttps.postReq");
    }

    private static String a(byte[] bArr) {
        String str = new String(bArr, StandardCharsets.UTF_8);
        LogUtil.d("SMART_HttpUtil", "postReq, jsonResult:", str);
        return str;
    }

    private static void d(HttpURLConnection httpURLConnection, HashMap<String, String> map) {
        if (httpURLConnection == null) {
            LogUtil.a("SMART_HttpUtil", "connection null, return");
            return;
        }
        if (map == null || map.isEmpty()) {
            LogUtil.a("SMART_HttpUtil", "mapHeader null, return");
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                httpURLConnection.setRequestProperty(key, value);
            }
        }
    }

    private static String a(HashMap<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(1024);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key)) {
                stringBuffer.append("&").append(key).append("=").append(value);
            }
        }
        String strTrim = stringBuffer.toString().trim();
        return (strTrim == null || strTrim.length() <= 1) ? strTrim : strTrim.substring(1);
    }

    private static boolean e(String str) {
        String strSubstring;
        int iIndexOf;
        if (!TextUtils.isEmpty(str) && str.contains(":") && (iIndexOf = str.indexOf(":")) > 0) {
            strSubstring = str.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        LogUtil.a("SMART_HttpUtil", "protocol:", strSubstring);
        return "http".equalsIgnoreCase(strSubstring);
    }

    private static byte[] d(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int i = 0;
        do {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i2);
            i += i2;
        } while (i <= 31459280);
        byteArrayOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    private static void e(HttpsURLConnection httpsURLConnection) {
        SecureSSLSocketFactoryNew secureSSLSocketFactoryNew;
        try {
            secureSSLSocketFactoryNew = SecureSSLSocketFactoryNew.getInstance(BaseApplication.getContext());
        } catch (IOException unused) {
            LogUtil.e("SMART_HttpUtil", "initHttpsUrlConnection IOException");
            secureSSLSocketFactoryNew = null;
        } catch (IllegalAccessException unused2) {
            LogUtil.e("SMART_HttpUtil", "initHttpsUrlConnection IllegalAccessException");
            secureSSLSocketFactoryNew = null;
        } catch (KeyManagementException | SSLException unused3) {
            LogUtil.e("SMART_HttpUtil", "initHttpsUrlConnection KeyManagementException or SSLException");
            secureSSLSocketFactoryNew = null;
        } catch (KeyStoreException unused4) {
            LogUtil.e("SMART_HttpUtil", "initHttpsUrlConnection KeyStoreException");
            secureSSLSocketFactoryNew = null;
        } catch (NoSuchAlgorithmException unused5) {
            LogUtil.e("SMART_HttpUtil", "initHttpsUrlConnection NoSuchAlgorithmException");
            secureSSLSocketFactoryNew = null;
        } catch (CertificateException unused6) {
            LogUtil.e("SMART_HttpUtil", "initHttpsUrlConnection CertificateException");
            secureSSLSocketFactoryNew = null;
        }
        if (secureSSLSocketFactoryNew != null) {
            httpsURLConnection.setSSLSocketFactory(secureSSLSocketFactoryNew);
        }
        try {
            httpsURLConnection.setHostnameVerifier(SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
        } catch (IllegalArgumentException unused7) {
            LogUtil.e("SMART_HttpUtil", "Fail to set DefaultHostnameVerifier!");
        }
    }

    private static boolean b(String str, HashMap<String, String> map, HashMap<String, String> map2) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("SMART_HttpUtil", "url is null");
            z = false;
        } else {
            z = true;
        }
        if (map == null || map.isEmpty()) {
            LogUtil.a("SMART_HttpUtil", "mapParam is null");
            z = false;
        }
        if (map2 != null && !map2.isEmpty()) {
            return z;
        }
        LogUtil.a("SMART_HttpUtil", "mapHeader is null");
        return false;
    }

    private static void b(OutputStream outputStream, InputStream inputStream) {
        FileUtils.a(outputStream);
        FileUtils.a(inputStream);
    }
}
