package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes6.dex */
@ThreadSafe
public class qw5 extends r10 {
    public boolean e;
    public final SSLSocketFactory f;
    public Proxy g;

    public qw5(int i, int i2, int i3) {
        this(i, i2, i3, true);
    }

    public final InputStream h(HttpURLConnection httpURLConnection, int i) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        return i > 0 ? new g53(inputStream, d()) : inputStream;
    }

    public HttpURLConnection i(URL url) throws IOException {
        Proxy proxy = this.g;
        return proxy != null ? (HttpURLConnection) url.openConnection(proxy) : (HttpURLConnection) url.openConnection();
    }

    public lqk j(URL url) throws IOException {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnectionI = i(url);
                httpURLConnectionI.setConnectTimeout(a());
                httpURLConnectionI.setReadTimeout(c());
                SSLSocketFactory sSLSocketFactory = this.f;
                if (sSLSocketFactory != null && (httpURLConnectionI instanceof HttpsURLConnection)) {
                    ((HttpsURLConnection) httpURLConnectionI).setSSLSocketFactory(sSLSocketFactory);
                }
                if (b() != null && !b().isEmpty()) {
                    for (Map.Entry<String, List<String>> entry : b().entrySet()) {
                        Iterator<String> it = entry.getValue().iterator();
                        while (it.hasNext()) {
                            httpURLConnectionI.addRequestProperty(entry.getKey(), it.next());
                        }
                    }
                }
                InputStream inputStreamH = h(httpURLConnectionI, d());
                try {
                    String strB = evc.b(inputStreamH, StandardCharsets.UTF_8);
                    if (inputStreamH != null) {
                        inputStreamH.close();
                    }
                    int responseCode = httpURLConnectionI.getResponseCode();
                    String responseMessage = httpURLConnectionI.getResponseMessage();
                    if (responseCode <= 299 && responseCode >= 200) {
                        lqk lqkVar = new lqk(strB, httpURLConnectionI.getContentType());
                        if (this.e) {
                            httpURLConnectionI.disconnect();
                        }
                        return lqkVar;
                    }
                    throw new IOException("HTTP " + responseCode + ": " + responseMessage);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (inputStreamH != null) {
                            try {
                                inputStreamH.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                if (this.e && 0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th4;
            }
        } catch (ClassCastException e) {
            throw new IOException("Couldn't open HTTP(S) connection: " + e.getMessage(), e);
        }
    }

    public void k(Proxy proxy) {
        this.g = proxy;
    }

    public qw5(int i, int i2, int i3, boolean z) {
        this(i, i2, i3, z, null);
    }

    public qw5(int i, int i2, int i3, boolean z, SSLSocketFactory sSLSocketFactory) {
        super(i, i2, i3);
        this.e = z;
        this.f = sSLSocketFactory;
    }
}
