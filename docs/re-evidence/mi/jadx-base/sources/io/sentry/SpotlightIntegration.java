package io.sentry;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.c8c;
import defpackage.dyc;
import defpackage.evg;
import defpackage.ftc;
import defpackage.hvl;
import defpackage.jul;
import defpackage.ucd;
import defpackage.xug;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.GZIPOutputStream;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class SpotlightIntegration implements ucd, SentryOptions.c, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public SentryOptions f21361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public ILogger f21362b = xug.e();

    @NotNull
    public dyc c = evg.e();

    @Override // io.sentry.SentryOptions.c
    public void a(@NotNull final jul julVar, @Nullable c8c c8cVar) {
        try {
            this.c.submit(new Runnable() { // from class: v6o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36566a.m(julVar);
                }
            });
        } catch (RejectedExecutionException e) {
            this.f21362b.a(SentryLevel.WARNING, "Spotlight envelope submission rejected.", e);
        }
    }

    public final void c(@NotNull HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.c.b(0L);
        SentryOptions sentryOptions = this.f21361a;
        if (sentryOptions == null || sentryOptions.getBeforeEnvelopeCallback() != this) {
            return;
        }
        this.f21361a.setBeforeEnvelopeCallback(null);
    }

    @NotNull
    public final HttpURLConnection d(@NotNull String str) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(HTTP.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty(HTTP.CONN_DIRECTIVE, Constants.EXTRA_CLOSE_TAI);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    @TestOnly
    public String l() {
        SentryOptions sentryOptions = this.f21361a;
        if (sentryOptions == null || sentryOptions.getSpotlightConnectionUrl() == null) {
            return io.sentry.util.r.a() ? "http://10.0.2.2:8969/stream" : "http://localhost:8969/stream";
        }
        return this.f21361a.getSpotlightConnectionUrl();
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m(@NotNull jul julVar) {
        try {
            if (this.f21361a == null) {
                throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
            }
            HttpURLConnection httpURLConnectionD = d(l());
            try {
                OutputStream outputStream = httpURLConnectionD.getOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                    try {
                        this.f21361a.getSerializer().d(julVar, gZIPOutputStream);
                        gZIPOutputStream.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        this.f21362b.c(SentryLevel.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionD.getResponseCode()));
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
                    this.f21362b.a(SentryLevel.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", th5);
                    this.f21362b.c(SentryLevel.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionD.getResponseCode()));
                } finally {
                    this.f21362b.c(SentryLevel.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionD.getResponseCode()));
                    c(httpURLConnectionD);
                }
            }
        } catch (Exception e) {
            this.f21362b.a(SentryLevel.ERROR, "An exception occurred while creating the connection to spotlight.", e);
        }
    }

    @Override // defpackage.ucd
    public void register(@NotNull ftc ftcVar, @NotNull SentryOptions sentryOptions) {
        this.f21361a = sentryOptions;
        this.f21362b = sentryOptions.getLogger();
        if (sentryOptions.getBeforeEnvelopeCallback() != null || !sentryOptions.isEnableSpotlight()) {
            this.f21362b.c(SentryLevel.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
            return;
        }
        this.c = new hvl();
        sentryOptions.setBeforeEnvelopeCallback(this);
        this.f21362b.c(SentryLevel.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
    }
}
