package defpackage;

import com.braintreepayments.api.HttpResponseParser;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes21.dex */
class ut {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLSocketFactory f50528a;
    private final HttpResponseParser e;

    ut(SSLSocketFactory sSLSocketFactory, HttpResponseParser httpResponseParser) {
        this.e = httpResponseParser;
        if (sSLSocketFactory != null) {
            this.f50528a = sSLSocketFactory;
            return;
        }
        try {
            this.f50528a = ux.d();
        } catch (SSLException unused) {
            this.f50528a = null;
        }
    }

    tv d(tr trVar) throws Exception {
        if (trVar.j() == null) {
            throw new IllegalArgumentException("Path cannot be null");
        }
        URL urlG = trVar.g();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = (HttpURLConnection) urlG.openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.f50528a;
            if (sSLSocketFactory == null) {
                throw new SSLException("SSLSocketFactory was not set or failed to initialize");
            }
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        String strC = trVar.c();
        httpURLConnection.setRequestMethod(strC);
        httpURLConnection.setReadTimeout(trVar.f());
        httpURLConnection.setConnectTimeout(trVar.b());
        for (Map.Entry<String, String> entry : trVar.a().entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        if (strC != null && strC.equals("POST")) {
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(trVar.e());
            outputStream.flush();
            outputStream.close();
            trVar.d();
        }
        try {
            return new tv(this.e.parse(httpURLConnection.getResponseCode(), httpURLConnection), new tx(jCurrentTimeMillis, System.currentTimeMillis()));
        } finally {
            httpURLConnection.disconnect();
        }
    }
}
