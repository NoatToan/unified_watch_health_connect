package ohos.ace.adapter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes46.dex */
public class DownloadManager {
    private static final String DEFAULT_CHARSET = "UTF-8";
    private static final int DEFAULT_TIME_OUT = 5000;
    private static final String LOG_TAG = "DownloadManager";
    private static final int UNIT_BYTE_LENGTH = 1024;
    private static volatile boolean isSslInited = false;
    private static final Object LOCK = new Object();
    private static final byte[] NULL_BYTE = new byte[0];

    private DownloadManager() {
    }

    static class AceX509TrustManager implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        private AceX509TrustManager() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static byte[] download(String str) {
        initSsl();
        byte[] bArr = new byte[1024];
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                ALog.e(LOG_TAG, "not http or https url");
                return NULL_BYTE;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestProperty("charset", "UTF-8");
            httpURLConnection.setRequestProperty("User-agent", "Ace");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.connect();
            InputStream inputStream = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        while (true) {
                            int i = inputStream2.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                                return byteArray;
                            } catch (IOException e) {
                                ALog.e(LOG_TAG, "InputStream close err:" + e.getMessage());
                            }
                        }
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                } catch (IOException e2) {
                    ALog.e(LOG_TAG, "read or write data err:" + e2.getMessage());
                    byte[] bArr2 = NULL_BYTE;
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException e3) {
                            ALog.e(LOG_TAG, "InputStream close err:" + e3.getMessage());
                        }
                    }
                    return bArr2;
                }
            } catch (Throwable th4) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        ALog.e(LOG_TAG, "InputStream close err:" + e4.getMessage());
                    }
                }
                throw th4;
            }
        } catch (IOException e5) {
            ALog.e(LOG_TAG, "request data err:" + e5.getMessage());
            return NULL_BYTE;
        } catch (SecurityException e6) {
            ALog.e(LOG_TAG, "security err:" + e6.getMessage());
            return NULL_BYTE;
        }
    }

    private static void initSsl() {
        if (isSslInited) {
            return;
        }
        synchronized (LOCK) {
            if (isSslInited) {
                return;
            }
            try {
                SSLContext sSLContext = SSLContext.getInstance("SSL");
                sSLContext.init(null, new TrustManager[]{new AceX509TrustManager()}, new SecureRandom());
                HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() { // from class: ohos.ace.adapter.DownloadManager.1
                    @Override // javax.net.ssl.HostnameVerifier
                    public boolean verify(String str, SSLSession sSLSession) {
                        return (str == null || str.isEmpty()) ? false : true;
                    }
                });
                HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
                isSslInited = true;
            } catch (KeyManagementException | NoSuchAlgorithmException e) {
                ALog.e(LOG_TAG, "init SSL error:" + e.getMessage());
            }
        }
    }
}
