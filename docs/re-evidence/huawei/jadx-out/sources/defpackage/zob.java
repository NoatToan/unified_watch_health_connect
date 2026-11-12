package defpackage;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.log.a;
import lib.android.paypal.com.magnessdk.network.base.MagnesNetworking;

/* JADX INFO: loaded from: classes46.dex */
class zob implements MagnesNetworking {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f54381a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f54383c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f54382b = null;
    private final zoi e = d();
    private Map<String, String> d = new HashMap();

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public void setUri(Uri uri) {
        this.f54381a = uri;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public void setHeader(Map<String, String> map) {
        this.d = map;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public byte[] getResponseContent() {
        return this.f54383c;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public String getPayPalDebugId() {
        return this.f54382b;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public int execute(byte[] bArr) throws Throwable {
        HttpsURLConnection httpsURLConnection;
        BufferedInputStream bufferedInputStream;
        OutputStream outputStream;
        HttpsURLConnection httpsURLConnection2;
        OutputStream outputStream2 = null;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            httpsURLConnection = (HttpsURLConnection) new URL(this.f54381a.toString()).openConnection();
            try {
                httpsURLConnection.setReadTimeout(c.h.a.HTTP_READ_TIMEOUT.a());
                httpsURLConnection.setConnectTimeout(c.h.a.HTTP_CONNECT_TIMEOUT.a());
                httpsURLConnection.setRequestMethod(c.h.b.POST.toString());
                httpsURLConnection.setSSLSocketFactory(this.e);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setFixedLengthStreamingMode(bArr.length);
                for (Map.Entry<String, String> entry : this.d.entrySet()) {
                    httpsURLConnection.setRequestProperty(entry.getKey().toString(), entry.getValue().toString());
                }
                outputStream = httpsURLConnection.getOutputStream();
                try {
                    outputStream.write(bArr);
                    outputStream.flush();
                    int responseCode = httpsURLConnection.getResponseCode();
                    this.f54382b = httpsURLConnection.getHeaderField("correlation-id");
                    if (responseCode == 200) {
                        bufferedInputStream = new BufferedInputStream(httpsURLConnection.getInputStream());
                        try {
                            byte[] bArr2 = new byte[c.h.a.READ_BYTE.a()];
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            while (true) {
                                int i = bufferedInputStream.read(bArr2);
                                if (i == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, i);
                            }
                            this.f54383c = byteArrayOutputStream.toByteArray();
                            bufferedInputStream2 = bufferedInputStream;
                        } catch (Exception e) {
                            e = e;
                            httpsURLConnection2 = httpsURLConnection;
                            try {
                                a.e(getClass(), 3, e);
                                int iA = c.h.EnumC0339c.HTTP_STATUS_FAILED.a();
                                znp.b(getClass(), bufferedInputStream);
                                znp.b(getClass(), outputStream);
                                if (httpsURLConnection2 != null) {
                                    httpsURLConnection2.disconnect();
                                }
                                return iA;
                            } catch (Throwable th) {
                                th = th;
                                httpsURLConnection = httpsURLConnection2;
                                outputStream2 = outputStream;
                                outputStream = outputStream2;
                                znp.b(getClass(), bufferedInputStream);
                                znp.b(getClass(), outputStream);
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            znp.b(getClass(), bufferedInputStream);
                            znp.b(getClass(), outputStream);
                            if (httpsURLConnection != null) {
                                httpsURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } else {
                        this.f54383c = new byte[0];
                    }
                    znp.b(getClass(), bufferedInputStream2);
                    znp.b(getClass(), outputStream);
                    httpsURLConnection.disconnect();
                    return responseCode;
                } catch (Exception e2) {
                    e = e2;
                    bufferedInputStream = null;
                    httpsURLConnection2 = httpsURLConnection;
                    a.e(getClass(), 3, e);
                    int iA2 = c.h.EnumC0339c.HTTP_STATUS_FAILED.a();
                    znp.b(getClass(), bufferedInputStream);
                    znp.b(getClass(), outputStream);
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                    return iA2;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = null;
                    outputStream2 = outputStream;
                    outputStream = outputStream2;
                    znp.b(getClass(), bufferedInputStream);
                    znp.b(getClass(), outputStream);
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                outputStream = null;
            } catch (Throwable th4) {
                th = th4;
                outputStream = null;
            }
        } catch (Exception e4) {
            e = e4;
            httpsURLConnection = null;
            outputStream = null;
        } catch (Throwable th5) {
            th = th5;
            httpsURLConnection = null;
            bufferedInputStream = null;
            outputStream = outputStream2;
            znp.b(getClass(), bufferedInputStream);
            znp.b(getClass(), outputStream);
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            throw th;
        }
    }

    private zoi d() throws SSLException {
        return zoi.c();
    }
}
