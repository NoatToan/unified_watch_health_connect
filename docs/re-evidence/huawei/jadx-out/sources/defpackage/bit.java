package defpackage;

import android.content.Context;
import com.huawei.appgallery.marketinstallerservice.b.b.e.a;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactory;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes23.dex */
public final class bit {
    private URLConnection e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [bit] */
    public byte[] d(Context context, String str, String str2, String str3) throws Exception {
        Throwable th;
        OutputStream outputStream;
        bil bilVar = new bil();
        ?? inputStream = 0;
        inputStream = 0;
        inputStream = 0;
        inputStream = 0;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                this.e = uRLConnectionOpenConnection;
                if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setRequestMethod("POST");
                }
                URLConnection uRLConnection = this.e;
                if (uRLConnection instanceof HttpsURLConnection) {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
                    httpsURLConnection.setSSLSocketFactory(SecureSSLSocketFactory.getInstance(context));
                    httpsURLConnection.setHostnameVerifier(SecureSSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                }
                this.e.setConnectTimeout(5000);
                this.e.setDoInput(true);
                this.e.setDoOutput(true);
                this.e.setReadTimeout(10000);
                this.e.setDefaultUseCaches(false);
                this.e.setUseCaches(false);
                this.e.setRequestProperty("Content-Type", "application/x-gzip");
                this.e.setRequestProperty("Content-Encoding", Constants.GZIP);
                this.e.setRequestProperty("User-Agent", bix.a(context));
                outputStream = this.e.getOutputStream();
                try {
                    outputStream.write(a.a(str2.getBytes(str3)));
                    outputStream.flush();
                    if (this.e instanceof HttpURLConnection) {
                        bir.e("HTTPUtil", "ResponseCode:" + ((HttpURLConnection) this.e).getResponseCode());
                    }
                    inputStream = this.e.getInputStream();
                    b(this.e, inputStream, bilVar);
                    if (inputStream != 0) {
                        c(inputStream);
                    }
                    if (outputStream != null) {
                        c(outputStream);
                    }
                    URLConnection uRLConnection2 = this.e;
                    if (uRLConnection2 instanceof HttpURLConnection) {
                        ((HttpURLConnection) uRLConnection2).disconnect();
                    }
                    return bilVar.e();
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != 0) {
                        c(inputStream);
                    }
                    if (outputStream != null) {
                        c(outputStream);
                    }
                    URLConnection uRLConnection3 = this.e;
                    if (uRLConnection3 instanceof HttpURLConnection) {
                        ((HttpURLConnection) uRLConnection3).disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = context;
                outputStream = null;
            }
        } catch (IOException e3) {
            throw e3;
        } catch (Exception e4) {
            throw e4;
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
        }
    }

    private void b(URLConnection uRLConnection, InputStream inputStream, bil bilVar) {
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                try {
                    String contentEncoding = uRLConnection.getContentEncoding();
                    bir.c("HTTPUtil", "parseHttpResponse contentType =" + contentEncoding);
                    bufferedInputStream = (Constants.GZIP.equals(contentEncoding) || "z".equals(contentEncoding)) ? new BufferedInputStream(new GZIPInputStream(inputStream)) : new BufferedInputStream(inputStream);
                    byte[] bArr = new byte[65536];
                    do {
                        int i = bufferedInputStream.read(bArr);
                        if (i == -1) {
                            bufferedInputStream.close();
                            return;
                        }
                        bilVar.d(bArr, i);
                    } while (bilVar.d() <= 4194304);
                    bilVar.c();
                    bir.d("HTTPUtil", "File being unzipped is too big.");
                    bufferedInputStream.close();
                } catch (IOException e) {
                    bir.d("HTTPUtil", "parseHttpResponse error!", e);
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                }
            } catch (Throwable th) {
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e2) {
                        bir.d("HTTPUtil", "close error", e2);
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            bir.d("HTTPUtil", "close error", e3);
        }
    }

    private void c(Closeable closeable) {
        StringBuilder sb;
        String string;
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                sb = new StringBuilder("close IO IOException:");
                string = e.toString();
                sb.append(string);
                bir.d("IoUtils", sb.toString());
            } catch (Exception e2) {
                sb = new StringBuilder("close IO execption:");
                string = e2.toString();
                sb.append(string);
                bir.d("IoUtils", sb.toString());
            }
        }
    }
}
