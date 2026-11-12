package com.danikula.videocache;

import android.text.TextUtils;
import com.alipay.sdk.m.u.i;
import com.danikula.videocache.headers.EmptyHeadersInjector;
import com.danikula.videocache.headers.HeaderInjector;
import com.danikula.videocache.sourcestorage.SourceInfoStorage;
import com.danikula.videocache.sourcestorage.SourceInfoStorageFactory;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.xmlywind.sdk.common.Constants;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes2.dex */
public class HttpUrlSource implements Source {
    private static final Logger f = LoggerFactory.getLogger("HttpUrlSource");
    private static final int g = 5;
    private final SourceInfoStorage a;
    private final HeaderInjector b;
    private SourceInfo c;
    private HttpURLConnection d;
    private InputStream e;

    public HttpUrlSource(String str) {
        this(str, SourceInfoStorageFactory.newEmptySourceInfoStorage());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.net.HttpURLConnection] */
    private void a() throws Throwable {
        HttpURLConnection httpURLConnectionD;
        Logger logger = f;
        logger.debug("Read content info from " + this.c.url);
        ?? r1 = 0;
        InputStream inputStream = null;
        try {
            try {
                httpURLConnectionD = d(0L, 10000);
                try {
                    long jB = b(httpURLConnectionD);
                    String contentType = httpURLConnectionD.getContentType();
                    inputStream = httpURLConnectionD.getInputStream();
                    SourceInfo sourceInfo = new SourceInfo(this.c.url, jB, contentType);
                    this.c = sourceInfo;
                    this.a.put(sourceInfo.url, sourceInfo);
                    logger.debug("Source info fetched: " + this.c);
                    ProxyCacheUtils.c(inputStream);
                    r1 = httpURLConnectionD;
                } catch (IOException e) {
                    e = e;
                    f.error("Error fetching info from " + this.c.url, (Throwable) e);
                    ProxyCacheUtils.c(inputStream);
                    r1 = httpURLConnectionD;
                    if (httpURLConnectionD == null) {
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                ProxyCacheUtils.c(inputStream);
                if (r1 != 0) {
                    r1.disconnect();
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            httpURLConnectionD = null;
        } catch (Throwable th2) {
            th = th2;
            r1 = 0;
            ProxyCacheUtils.c(inputStream);
            if (r1 != 0) {
                r1.disconnect();
            }
            throw th;
        }
        r1.disconnect();
    }

    private long b(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    private void c(HttpURLConnection httpURLConnection, String str) {
        for (Map.Entry<String, String> entry : this.b.addHeaders(str).entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    private HttpURLConnection d(long j, int i) throws IOException, ProxyCacheException {
        String str;
        HttpURLConnection httpURLConnection;
        boolean z;
        String headerField = this.c.url;
        int i2 = 0;
        do {
            Logger logger = f;
            StringBuilder sb = new StringBuilder();
            sb.append("Open connection ");
            if (j > 0) {
                str = " with offset " + j;
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(" to ");
            sb.append(headerField);
            logger.debug(sb.toString());
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(headerField).openConnection()));
            c(httpURLConnection, headerField);
            if (j > 0) {
                httpURLConnection.setRequestProperty("Range", Constants.RANGE_PARAMS + j + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            }
            if (i > 0) {
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(i);
            }
            int responseCode = httpURLConnection.getResponseCode();
            z = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z) {
                headerField = httpURLConnection.getHeaderField("Location");
                i2++;
                httpURLConnection.disconnect();
            }
            if (i2 > 5) {
                throw new ProxyCacheException("Too many redirects: " + i2);
            }
        } while (z);
        return httpURLConnection;
    }

    private long e(HttpURLConnection httpURLConnection, long j, int i) throws IOException {
        long jB = b(httpURLConnection);
        if (i == 200) {
            return jB;
        }
        return i == 206 ? jB + j : this.c.length;
    }

    @Override // com.danikula.videocache.Source
    public void close() throws ProxyCacheException {
        HttpURLConnection httpURLConnection = this.d;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException e) {
                f.error("Error closing connection correctly. Should happen only on Android L. If anybody know how to fix it, please visit https://github.com/danikula/AndroidVideoCache/issues/88. Until good solution is not know, just ignore this issue :(", (Throwable) e);
            } catch (IllegalArgumentException e2) {
                e = e2;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            } catch (NullPointerException e3) {
                e = e3;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            }
        }
    }

    public synchronized String getMime() throws ProxyCacheException {
        if (TextUtils.isEmpty(this.c.mime)) {
            a();
        }
        return this.c.mime;
    }

    public String getUrl() {
        return this.c.url;
    }

    @Override // com.danikula.videocache.Source
    public synchronized long length() throws ProxyCacheException {
        if (this.c.length == ParserMinimalBase.MIN_INT_L) {
            a();
        }
        return this.c.length;
    }

    @Override // com.danikula.videocache.Source
    public void open(long j) throws ProxyCacheException {
        try {
            HttpURLConnection httpURLConnectionD = d(j, -1);
            this.d = httpURLConnectionD;
            String contentType = httpURLConnectionD.getContentType();
            this.e = new BufferedInputStream(this.d.getInputStream(), 8192);
            HttpURLConnection httpURLConnection = this.d;
            SourceInfo sourceInfo = new SourceInfo(this.c.url, e(httpURLConnection, j, httpURLConnection.getResponseCode()), contentType);
            this.c = sourceInfo;
            this.a.put(sourceInfo.url, sourceInfo);
        } catch (IOException e) {
            throw new ProxyCacheException("Error opening connection for " + this.c.url + " with offset " + j, e);
        }
    }

    @Override // com.danikula.videocache.Source
    public int read(byte[] bArr) throws ProxyCacheException {
        InputStream inputStream = this.e;
        if (inputStream == null) {
            throw new ProxyCacheException("Error reading data from " + this.c.url + ": connection is absent!");
        }
        try {
            return inputStream.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e) {
            throw new InterruptedProxyCacheException("Reading source " + this.c.url + " is interrupted", e);
        } catch (IOException e2) {
            throw new ProxyCacheException("Error reading data from " + this.c.url, e2);
        }
    }

    public String toString() {
        return "HttpUrlSource{sourceInfo='" + this.c + i.d;
    }

    public HttpUrlSource(String str, SourceInfoStorage sourceInfoStorage) {
        this(str, sourceInfoStorage, new EmptyHeadersInjector());
    }

    public HttpUrlSource(String str, SourceInfoStorage sourceInfoStorage, HeaderInjector headerInjector) {
        this.a = (SourceInfoStorage) Preconditions.checkNotNull(sourceInfoStorage);
        this.b = (HeaderInjector) Preconditions.checkNotNull(headerInjector);
        SourceInfo sourceInfo = sourceInfoStorage.get(str);
        this.c = sourceInfo == null ? new SourceInfo(str, ParserMinimalBase.MIN_INT_L, ProxyCacheUtils.f(str)) : sourceInfo;
    }

    public HttpUrlSource(HttpUrlSource httpUrlSource) {
        this.c = httpUrlSource.c;
        this.a = httpUrlSource.a;
        this.b = httpUrlSource.b;
    }
}
