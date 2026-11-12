package org.acra.http;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.loopj.android.http.AsyncHttpClient;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.acra.ACRA;
import org.acra.config.ConfigUtils;
import org.acra.config.CoreConfiguration;
import org.acra.config.HttpSenderConfiguration;
import org.acra.log.ACRALog;
import org.acra.security.KeyStoreHelper;
import org.acra.security.ProtocolSocketFactoryWrapper;
import org.acra.sender.HttpSender;
import org.acra.util.IOUtils;

/* JADX INFO: loaded from: classes23.dex */
public abstract class BaseHttpRequest<T> implements HttpRequest<T> {
    private final CoreConfiguration a;
    private final Context b;
    private final HttpSender.Method c;
    private final String d;
    private final String e;
    private final int f;
    private final int g;
    private final Map<String, String> h;
    private final HttpSenderConfiguration i;

    public BaseHttpRequest(@NonNull CoreConfiguration coreConfiguration, @NonNull Context context, @NonNull HttpSender.Method method, @Nullable String str, @Nullable String str2, int i, int i2, @Nullable Map<String, String> map) {
        this.a = coreConfiguration;
        this.b = context;
        this.c = method;
        this.d = str;
        this.e = str2;
        this.f = i;
        this.g = i2;
        this.h = map;
        this.i = (HttpSenderConfiguration) ConfigUtils.getPluginConfiguration(coreConfiguration, HttpSenderConfiguration.class);
    }

    public void configureHeaders(@NonNull HttpURLConnection httpURLConnection, @Nullable String str, @Nullable String str2, @Nullable Map<String, String> map, @NonNull T t) throws IOException {
        httpURLConnection.setRequestProperty("User-Agent", String.format("Android ACRA %1$s", "5.7.0"));
        httpURLConnection.setRequestProperty("Accept", "text/html,application/xml,application/json,application/xhtml+xml,text/html;q=0.9,text/plain;q=0.8,image/png,*/*;q=0.5");
        httpURLConnection.setRequestProperty("Content-Type", getContentType(this.b, t));
        if (str != null && str2 != null) {
            String str3 = new String(Base64.encode((str + JsonLexerKt.COLON + str2).getBytes("UTF-8"), 2), "UTF-8");
            StringBuilder sb = new StringBuilder();
            sb.append("Basic ");
            sb.append(str3);
            httpURLConnection.setRequestProperty("Authorization", sb.toString());
        }
        if (this.i.compress()) {
            httpURLConnection.setRequestProperty("Content-Encoding", AsyncHttpClient.ENCODING_GZIP);
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
    }

    public void configureHttps(@NonNull HttpsURLConnection httpsURLConnection) throws GeneralSecurityException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(KeyStoreHelper.getKeyStore(this.b, this.a));
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
        httpsURLConnection.setSSLSocketFactory(new ProtocolSocketFactoryWrapper(sSLContext.getSocketFactory(), this.i.tlsProtocols()));
    }

    public void configureTimeouts(@NonNull HttpURLConnection httpURLConnection, int i, int i2) {
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i2);
    }

    @NonNull
    public HttpURLConnection createConnection(@NonNull URL url) throws IOException {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    @NonNull
    public abstract String getContentType(@NonNull Context context, @NonNull T t);

    public void handleResponse(int i, String str) throws IOException {
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "Request response : " + i + " : " + str);
        }
        if (i >= 200 && i < 300) {
            ACRA.log.i(ACRA.LOG_TAG, "Request received by server");
            return;
        }
        if (i == 408 || i >= 500) {
            ACRA.log.w(ACRA.LOG_TAG, "Could not send ACRA Post responseCode=" + i + " message=" + str);
            throw new IOException("Host returned error code " + i);
        }
        if (i >= 400) {
            ACRA.log.w(ACRA.LOG_TAG, i + ": Client error - request will be discarded");
            return;
        }
        ACRA.log.w(ACRA.LOG_TAG, "Could not send ACRA Post - request will be discarded. responseCode=" + i + " message=" + str);
    }

    @Override // org.acra.http.HttpRequest
    public void send(@NonNull URL url, @NonNull T t) throws IOException {
        HttpURLConnection httpURLConnectionCreateConnection = createConnection(url);
        if (httpURLConnectionCreateConnection instanceof HttpsURLConnection) {
            try {
                configureHttps((HttpsURLConnection) httpURLConnectionCreateConnection);
            } catch (GeneralSecurityException e) {
                ACRA.log.e(ACRA.LOG_TAG, "Could not configure SSL for ACRA request to " + url, e);
            }
        }
        configureTimeouts(httpURLConnectionCreateConnection, this.f, this.g);
        configureHeaders(httpURLConnectionCreateConnection, this.d, this.e, this.h, t);
        if (ACRA.DEV_LOGGING) {
            ACRALog aCRALog = ACRA.log;
            String str = ACRA.LOG_TAG;
            aCRALog.d(str, "Sending request to " + url);
            ACRA.log.d(str, "Http " + this.c.name() + " content : ");
            ACRA.log.d(str, t.toString());
        }
        try {
            writeContent(httpURLConnectionCreateConnection, this.c, t);
            handleResponse(httpURLConnectionCreateConnection.getResponseCode(), httpURLConnectionCreateConnection.getResponseMessage());
            httpURLConnectionCreateConnection.disconnect();
        } catch (SocketTimeoutException e2) {
            if (!this.i.dropReportsOnTimeout()) {
                throw e2;
            }
            Log.w(ACRA.LOG_TAG, "Dropped report due to timeout");
        }
    }

    public abstract void write(OutputStream outputStream, @NonNull T t) throws IOException;

    public void writeContent(@NonNull HttpURLConnection httpURLConnection, @NonNull HttpSender.Method method, @NonNull T t) throws IOException {
        httpURLConnection.setRequestMethod(method.name());
        httpURLConnection.setDoOutput(true);
        System.setProperty("http.keepAlive", "false");
        httpURLConnection.connect();
        OutputStream gZIPOutputStream = this.i.compress() ? new GZIPOutputStream(httpURLConnection.getOutputStream(), 8192) : new BufferedOutputStream(httpURLConnection.getOutputStream());
        try {
            write(gZIPOutputStream, t);
            gZIPOutputStream.flush();
        } finally {
            IOUtils.safeClose(gZIPOutputStream);
        }
    }
}
