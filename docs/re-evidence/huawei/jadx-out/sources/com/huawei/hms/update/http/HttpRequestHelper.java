package com.huawei.hms.update.http;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactoryNew;
import com.huawei.secure.android.common.ssl.hostname.StrictHostnameVerifier;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes34.dex */
public class HttpRequestHelper implements IHttpRequestHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HttpsURLConnection f16708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f16709b = -1;

    private void a(String str, Context context) throws IOException {
        if (this.f16709b == 0) {
            HMSLog.e("HttpRequestHelper", "Not allowed to repeat open http(s) connection.");
        }
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        if (uRLConnectionOpenConnection == null) {
            HMSLog.i("HttpRequestHelper", "urlConnection is null");
            return;
        }
        if (!(uRLConnectionOpenConnection instanceof HttpsURLConnection)) {
            HMSLog.i("HttpRequestHelper", "current request is http not allow connection");
            this.f16708a = null;
            return;
        }
        this.f16708a = (HttpsURLConnection) uRLConnectionOpenConnection;
        try {
            SecureSSLSocketFactoryNew secureSSLSocketFactoryNew = SecureSSLSocketFactoryNew.getInstance(context, EncryptUtil.genSecureRandom());
            if (secureSSLSocketFactoryNew != null) {
                this.f16708a.setSSLSocketFactory(secureSSLSocketFactoryNew);
            }
            this.f16708a.setSSLSocketFactory(secureSSLSocketFactoryNew);
            this.f16708a.setHostnameVerifier(new StrictHostnameVerifier());
            this.f16708a.setConnectTimeout(30000);
            this.f16708a.setReadTimeout(30000);
            this.f16708a.setDoInput(true);
            this.f16708a.setDoOutput(true);
            this.f16708a.setUseCaches(false);
            this.f16708a.setInstanceFollowRedirects(true);
            this.f16709b = 0;
        } catch (IOException | IllegalAccessException | IllegalArgumentException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            HMSLog.e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
            throw new IOException("Failed to create SSLSocketFactory.");
        }
    }

    @Override // com.huawei.hms.update.http.IHttpRequestHelper
    public void cancel() {
        this.f16709b = 1;
    }

    @Override // com.huawei.hms.update.http.IHttpRequestHelper
    public void close() {
        this.f16709b = -1;
        HttpsURLConnection httpsURLConnection = this.f16708a;
        if (httpsURLConnection != null) {
            httpsURLConnection.disconnect();
        }
    }

    @Override // com.huawei.hms.update.http.IHttpRequestHelper
    public int get(String str, OutputStream outputStream, Context context) throws IOException, CanceledException {
        return get(str, outputStream, 0, 0, context);
    }

    @Override // com.huawei.hms.update.http.IHttpRequestHelper
    public int post(String str, InputStream inputStream, OutputStream outputStream, Context context) throws Throwable {
        Throwable th;
        OutputStream outputStream2;
        InputStream inputStream2 = null;
        try {
            a(str, context);
            HttpsURLConnection httpsURLConnection = this.f16708a;
            if (httpsURLConnection == null) {
                HMSLog.i("HttpRequestHelper", "mConnection is null");
                IOUtils.closeQuietly((InputStream) null);
                IOUtils.closeQuietly((OutputStream) null);
                return -1;
            }
            httpsURLConnection.setRequestMethod("POST");
            outputStream2 = this.f16708a.getOutputStream();
            try {
                a(inputStream, outputStream2);
                outputStream2.flush();
                int responseCode = this.f16708a.getResponseCode();
                if (responseCode == 200 && outputStream != null) {
                    inputStream2 = this.f16708a.getInputStream();
                    a(new BufferedInputStream(inputStream2, 4096), outputStream);
                    outputStream.flush();
                }
                IOUtils.closeQuietly(inputStream2);
                IOUtils.closeQuietly(outputStream2);
                return responseCode;
            } catch (Throwable th2) {
                th = th2;
                IOUtils.closeQuietly(inputStream2);
                IOUtils.closeQuietly(outputStream2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = null;
        }
    }

    @Override // com.huawei.hms.update.http.IHttpRequestHelper
    public int get(String str, OutputStream outputStream, int i, int i2, Context context) throws IOException, CanceledException {
        InputStream inputStream = null;
        try {
            a(str, context);
            HttpsURLConnection httpsURLConnection = this.f16708a;
            if (httpsURLConnection == null) {
                HMSLog.i("HttpRequestHelper", "mConnection is null");
                return -1;
            }
            httpsURLConnection.setRequestMethod("GET");
            if (i > 0) {
                this.f16708a.addRequestProperty("Range", "bytes=" + i + Constants.LINK + i2);
            }
            int responseCode = this.f16708a.getResponseCode();
            if ((i > 0 && responseCode == 206) || (i <= 0 && responseCode == 200)) {
                inputStream = this.f16708a.getInputStream();
                a(new BufferedInputStream(inputStream, 4096), outputStream);
                if (outputStream != null) {
                    outputStream.flush();
                }
            }
            return responseCode;
        } finally {
            IOUtils.closeQuietly((InputStream) null);
        }
    }

    private void a(InputStream inputStream, OutputStream outputStream) throws IOException, CanceledException {
        if (inputStream != null && outputStream != null) {
            byte[] bArr = new byte[4096];
            do {
                int i = inputStream.read(bArr);
                if (-1 == i) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i);
                }
            } while (this.f16709b != 1);
            throw new CanceledException("HTTP(s) request was canceled.");
        }
        HMSLog.w("HttpRequestHelper", "input or output is null");
    }
}
