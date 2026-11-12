package io.sentry.transport;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.iok;
import defpackage.jul;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o {
    public static final Charset e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Proxy f21866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final iok f21867b;

    @NotNull
    public final SentryOptions c;

    @NotNull
    public final z d;

    public o(@NotNull SentryOptions sentryOptions, @NotNull iok iokVar, @NotNull z zVar) {
        this(sentryOptions, iokVar, m.a(), zVar);
    }

    public final void a(@NotNull HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    @NotNull
    public final HttpURLConnection b() throws IOException {
        HttpURLConnection httpURLConnectionE = e();
        for (Map.Entry<String, String> entry : this.f21867b.a().entrySet()) {
            httpURLConnectionE.setRequestProperty(entry.getKey(), entry.getValue());
        }
        httpURLConnectionE.setRequestMethod("POST");
        httpURLConnectionE.setDoOutput(true);
        httpURLConnectionE.setRequestProperty(HTTP.CONTENT_ENCODING, "gzip");
        httpURLConnectionE.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnectionE.setRequestProperty("Accept", "application/json");
        httpURLConnectionE.setRequestProperty(HTTP.CONN_DIRECTIVE, Constants.EXTRA_CLOSE_TAI);
        httpURLConnectionE.setConnectTimeout(this.c.getConnectionTimeoutMillis());
        httpURLConnectionE.setReadTimeout(this.c.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = this.c.getSslSocketFactory();
        if ((httpURLConnectionE instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnectionE).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnectionE.connect();
        return httpURLConnectionE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @NotNull
    public final String c(@NotNull HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
                try {
                    StringBuilder sb = new StringBuilder();
                    boolean z = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z) {
                            sb.append("\n");
                        }
                        sb.append(line);
                        z = false;
                        if (errorStream != null) {
                            try {
                                errorStream.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                    String string = sb.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (errorStream != null) {
                    errorStream.close();
                }
                throw th4;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    public final boolean d(int i) {
        return i == 200;
    }

    @NotNull
    public HttpURLConnection e() throws IOException {
        return (HttpURLConnection) (this.f21866a == null ? this.f21867b.b().openConnection() : this.f21867b.b().openConnection(this.f21866a));
    }

    @NotNull
    public final b0 f(@NotNull HttpURLConnection httpURLConnection) {
        try {
            int responseCode = httpURLConnection.getResponseCode();
            i(httpURLConnection, responseCode);
            if (d(responseCode)) {
                this.c.getLogger().c(SentryLevel.DEBUG, "Envelope sent successfully.", new Object[0]);
                return b0.e();
            }
            ILogger logger = this.c.getLogger();
            SentryLevel sentryLevel = SentryLevel.ERROR;
            logger.c(sentryLevel, "Request failed, API returned %s", Integer.valueOf(responseCode));
            if (this.c.isDebug()) {
                this.c.getLogger().c(sentryLevel, "%s", c(httpURLConnection));
            }
            return b0.b(responseCode);
        } catch (IOException e2) {
            this.c.getLogger().b(SentryLevel.ERROR, e2, "Error reading and logging the response stream", new Object[0]);
            return b0.a();
        } finally {
            a(httpURLConnection);
        }
    }

    @Nullable
    public final Proxy g(@Nullable SentryOptions.i iVar) {
        if (iVar != null) {
            String strC = iVar.c();
            String strA = iVar.a();
            if (strC != null && strA != null) {
                try {
                    return new Proxy(iVar.d() != null ? iVar.d() : Proxy.Type.HTTP, new InetSocketAddress(strA, Integer.parseInt(strC)));
                } catch (NumberFormatException e2) {
                    this.c.getLogger().b(SentryLevel.ERROR, e2, "Failed to parse Sentry Proxy port: " + iVar.c() + ". Proxy is ignored", new Object[0]);
                }
            }
        }
        return null;
    }

    @NotNull
    public b0 h(@NotNull jul julVar) throws IOException {
        HttpURLConnection httpURLConnectionB = b();
        try {
            OutputStream outputStream = httpURLConnectionB.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.c.getSerializer().d(julVar, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                this.c.getLogger().b(SentryLevel.ERROR, th5, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
            } catch (Throwable th6) {
                f(httpURLConnectionB);
                throw th6;
            }
        }
        return f(httpURLConnectionB);
    }

    public void i(@NotNull HttpURLConnection httpURLConnection, int i) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.d.N(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i);
    }

    public o(@NotNull SentryOptions sentryOptions, @NotNull iok iokVar, @NotNull m mVar, @NotNull z zVar) {
        this.f21867b = iokVar;
        this.c = sentryOptions;
        this.d = zVar;
        Proxy proxyG = g(sentryOptions.getProxy());
        this.f21866a = proxyG;
        if (proxyG == null || sentryOptions.getProxy() == null) {
            return;
        }
        String strE = sentryOptions.getProxy().e();
        String strB = sentryOptions.getProxy().b();
        if (strE == null || strB == null) {
            return;
        }
        mVar.b(new v(strE, strB));
    }
}
