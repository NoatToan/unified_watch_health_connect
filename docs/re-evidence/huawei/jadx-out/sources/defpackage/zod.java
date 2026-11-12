package defpackage;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.log.a;
import lib.android.paypal.com.magnessdk.network.base.MagnesNetworking;

/* JADX INFO: loaded from: classes46.dex */
class zod implements MagnesNetworking {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f54387c;
    private Uri e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f54386b = null;
    private final zoi d = c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f54385a = new HashMap();

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public void setUri(Uri uri) {
        this.e = uri;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public void setHeader(Map<String, String> map) {
        this.f54385a = map;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public byte[] getResponseContent() {
        return this.f54387c;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public String getPayPalDebugId() {
        return this.f54386b;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public int execute(byte[] bArr) throws Throwable {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        BufferedInputStream bufferedInputStream;
        Exception e;
        try {
            httpsURLConnection = (HttpsURLConnection) new URL(this.e.toString()).openConnection();
            try {
                httpsURLConnection.setReadTimeout(c.h.a.HTTP_READ_TIMEOUT.a());
                httpsURLConnection.setConnectTimeout(c.h.a.HTTP_CONNECT_TIMEOUT.a());
                httpsURLConnection.setRequestMethod(c.h.b.GET.toString());
                for (Map.Entry<String, String> entry : this.f54385a.entrySet()) {
                    httpsURLConnection.setRequestProperty(entry.getKey().toString(), entry.getValue().toString());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                this.f54386b = httpsURLConnection.getHeaderField("correlation-id");
                if (responseCode == 200) {
                    bufferedInputStream = new BufferedInputStream(httpsURLConnection.getInputStream());
                    try {
                        try {
                            byte[] bArr2 = new byte[c.h.a.READ_BYTE.a()];
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            while (true) {
                                int i = bufferedInputStream.read(bArr2);
                                if (i == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, i);
                                th = th;
                                znp.b(getClass(), bufferedInputStream);
                                znp.b(getClass(), (Closeable) null);
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                throw th;
                            }
                            this.f54387c = byteArrayOutputStream.toByteArray();
                        } catch (Exception e2) {
                            e = e2;
                            a.e(getClass(), 3, e);
                            int iA = c.h.EnumC0339c.HTTP_STATUS_FAILED.a();
                            znp.b(getClass(), bufferedInputStream);
                            znp.b(getClass(), (Closeable) null);
                            if (httpsURLConnection != null) {
                                httpsURLConnection.disconnect();
                            }
                            return iA;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    this.f54387c = new byte[0];
                    bufferedInputStream = null;
                }
                znp.b(getClass(), bufferedInputStream);
                znp.b(getClass(), (Closeable) null);
                httpsURLConnection.disconnect();
                return responseCode;
            } catch (Exception e3) {
                e = e3;
                bufferedInputStream = null;
                a.e(getClass(), 3, e);
                int iA2 = c.h.EnumC0339c.HTTP_STATUS_FAILED.a();
                znp.b(getClass(), bufferedInputStream);
                znp.b(getClass(), (Closeable) null);
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return iA2;
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
            }
        } catch (Exception e4) {
            e = e4;
            httpsURLConnection = null;
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
            bufferedInputStream = null;
        }
    }

    public zoi c() throws SSLException {
        return zoi.c();
    }
}
