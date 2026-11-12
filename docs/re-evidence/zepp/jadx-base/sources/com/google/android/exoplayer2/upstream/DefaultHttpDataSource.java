package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Predicate;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.loopj.android.http.AsyncHttpClient;
import com.xiaomi.hm.health.bodyfat.slimming.constants.LoseWeightPropertyKey;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultHttpDataSource extends BaseDataSource implements HttpDataSource {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final String t = "DefaultHttpDataSource";
    private static final int u = 20;
    private static final int v = 307;
    private static final int w = 308;
    private static final long x = 2048;
    private final boolean e;
    private final int f;
    private final int g;

    @Nullable
    private final String h;

    @Nullable
    private final HttpDataSource.RequestProperties i;
    private final HttpDataSource.RequestProperties j;
    private final boolean k;

    @Nullable
    private Predicate<String> l;

    @Nullable
    private DataSpec m;

    @Nullable
    private HttpURLConnection n;

    @Nullable
    private InputStream o;
    private boolean p;
    private int q;
    private long r;
    private long s;

    public static final class Factory implements HttpDataSource.Factory {

        @Nullable
        private TransferListener b;

        @Nullable
        private Predicate<String> c;

        @Nullable
        private String d;
        private boolean g;
        private boolean h;
        private final HttpDataSource.RequestProperties a = new HttpDataSource.RequestProperties();
        private int e = 8000;
        private int f = 8000;

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        @Deprecated
        public final HttpDataSource.RequestProperties getDefaultRequestProperties() {
            return this.a;
        }

        public Factory setAllowCrossProtocolRedirects(boolean allowCrossProtocolRedirects) {
            this.g = allowCrossProtocolRedirects;
            return this;
        }

        public Factory setConnectTimeoutMs(int connectTimeoutMs) {
            this.e = connectTimeoutMs;
            return this;
        }

        public Factory setContentTypePredicate(@Nullable Predicate<String> contentTypePredicate) {
            this.c = contentTypePredicate;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        public /* bridge */ /* synthetic */ HttpDataSource.Factory setDefaultRequestProperties(Map defaultRequestProperties) {
            return setDefaultRequestProperties((Map<String, String>) defaultRequestProperties);
        }

        public Factory setKeepPostFor302Redirects(boolean keepPostFor302Redirects) {
            this.h = keepPostFor302Redirects;
            return this;
        }

        public Factory setReadTimeoutMs(int readTimeoutMs) {
            this.f = readTimeoutMs;
            return this;
        }

        public Factory setTransferListener(@Nullable TransferListener transferListener) {
            this.b = transferListener;
            return this;
        }

        public Factory setUserAgent(@Nullable String userAgent) {
            this.d = userAgent;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        public final Factory setDefaultRequestProperties(Map<String, String> defaultRequestProperties) {
            this.a.clearAndSet(defaultRequestProperties);
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public DefaultHttpDataSource createDataSource() {
            DefaultHttpDataSource defaultHttpDataSource = new DefaultHttpDataSource(this.d, this.e, this.f, this.g, this.a, this.c, this.h);
            TransferListener transferListener = this.b;
            if (transferListener != null) {
                defaultHttpDataSource.addTransferListener(transferListener);
            }
            return defaultHttpDataSource;
        }
    }

    private void c() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e(t, "Unexpected error while disconnecting", e);
            }
            this.n = null;
        }
    }

    private URL d(URL originalUrl, @Nullable String location, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        if (location == null) {
            throw new HttpDataSource.HttpDataSourceException("Null location redirect", dataSpec, 2001, 1);
        }
        try {
            URL url = new URL(originalUrl, location);
            String protocol = url.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                String strValueOf = String.valueOf(protocol);
                throw new HttpDataSource.HttpDataSourceException(strValueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(strValueOf) : new String("Unsupported protocol redirect: "), dataSpec, 2001, 1);
            }
            if (this.e || protocol.equals(originalUrl.getProtocol())) {
                return url;
            }
            String protocol2 = originalUrl.getProtocol();
            StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 41 + protocol.length());
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new HttpDataSource.HttpDataSourceException(sb.toString(), dataSpec, 2001, 1);
        } catch (MalformedURLException e) {
            throw new HttpDataSource.HttpDataSourceException(e, dataSpec, 2001, 1);
        }
    }

    private static boolean e(HttpURLConnection connection) {
        return AsyncHttpClient.ENCODING_GZIP.equalsIgnoreCase(connection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection f(DataSpec dataSpec) throws IOException {
        URL url = new URL(dataSpec.uri.toString());
        int i = dataSpec.httpMethod;
        byte[] bArr = dataSpec.httpBody;
        long j = dataSpec.position;
        long j2 = dataSpec.length;
        boolean zIsFlagSet = dataSpec.isFlagSet(1);
        if (!this.e && !this.k) {
            return g(url, i, bArr, j, j2, zIsFlagSet, true, dataSpec.httpRequestHeaders);
        }
        URL urlD = url;
        int i2 = i;
        byte[] bArr2 = bArr;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 > 20) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Too many redirects: ");
                sb.append(i4);
                throw new HttpDataSource.HttpDataSourceException(new NoRouteToHostException(sb.toString()), dataSpec, 2001, 1);
            }
            int i5 = i2;
            long j3 = j;
            URL url2 = urlD;
            long j4 = j2;
            HttpURLConnection httpURLConnectionG = g(urlD, i2, bArr2, j, j2, zIsFlagSet, false, dataSpec.httpRequestHeaders);
            int responseCode = httpURLConnectionG.getResponseCode();
            String headerField = httpURLConnectionG.getHeaderField("Location");
            if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionG.disconnect();
                urlD = d(url2, headerField, dataSpec);
                i2 = i5;
            } else {
                if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionG;
                }
                httpURLConnectionG.disconnect();
                if (this.k && responseCode == 302) {
                    i2 = i5;
                } else {
                    bArr2 = null;
                    i2 = 1;
                }
                urlD = d(url2, headerField, dataSpec);
            }
            i3 = i4;
            j = j3;
            j2 = j4;
        }
    }

    private HttpURLConnection g(URL url, int httpMethod, @Nullable byte[] httpBody, long position, long length, boolean allowGzip, boolean followRedirects, Map<String, String> requestParameters) throws IOException {
        HttpURLConnection httpURLConnectionI = i(url);
        httpURLConnectionI.setConnectTimeout(this.f);
        httpURLConnectionI.setReadTimeout(this.g);
        HashMap map = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.i;
        if (requestProperties != null) {
            map.putAll(requestProperties.getSnapshot());
        }
        map.putAll(this.j.getSnapshot());
        map.putAll(requestParameters);
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnectionI.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strBuildRangeRequestHeader = HttpUtil.buildRangeRequestHeader(position, length);
        if (strBuildRangeRequestHeader != null) {
            httpURLConnectionI.setRequestProperty("Range", strBuildRangeRequestHeader);
        }
        String str = this.h;
        if (str != null) {
            httpURLConnectionI.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionI.setRequestProperty("Accept-Encoding", allowGzip ? AsyncHttpClient.ENCODING_GZIP : LoseWeightPropertyKey.IDENTITY);
        httpURLConnectionI.setInstanceFollowRedirects(followRedirects);
        httpURLConnectionI.setDoOutput(httpBody != null);
        httpURLConnectionI.setRequestMethod(DataSpec.getStringForHttpMethod(httpMethod));
        if (httpBody != null) {
            httpURLConnectionI.setFixedLengthStreamingMode(httpBody.length);
            httpURLConnectionI.connect();
            OutputStream outputStream = httpURLConnectionI.getOutputStream();
            outputStream.write(httpBody);
            outputStream.close();
        } else {
            httpURLConnectionI.connect();
        }
        return httpURLConnectionI;
    }

    private static void h(@Nullable HttpURLConnection connection, long bytesRemaining) {
        int i;
        if (connection == null || (i = Util.SDK_INT) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = connection.getInputStream();
            if (bytesRemaining == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (bytesRemaining <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) Assertions.checkNotNull(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    private int j(byte[] buffer, int offset, int readLength) throws IOException {
        if (readLength == 0) {
            return 0;
        }
        long j = this.r;
        if (j != -1) {
            long j2 = j - this.s;
            if (j2 == 0) {
                return -1;
            }
            readLength = (int) Math.min(readLength, j2);
        }
        int i = ((InputStream) Util.castNonNull(this.o)).read(buffer, offset, readLength);
        if (i == -1) {
            return -1;
        }
        this.s += (long) i;
        bytesTransferred(i);
        return i;
    }

    private void k(long bytesToSkip, DataSpec dataSpec) throws IOException {
        if (bytesToSkip == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (bytesToSkip > 0) {
            int i = ((InputStream) Util.castNonNull(this.o)).read(bArr, 0, (int) Math.min(bytesToSkip, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource.HttpDataSourceException(new InterruptedIOException(), dataSpec, 2000, 1);
            }
            if (i == -1) {
                throw new HttpDataSource.HttpDataSourceException(dataSpec, 2008, 1);
            }
            bytesToSkip -= (long) i;
            bytesTransferred(i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearAllRequestProperties() {
        this.j.clear();
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearRequestProperty(String name) {
        Assertions.checkNotNull(name);
        this.j.remove(name);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws HttpDataSource.HttpDataSourceException {
        try {
            InputStream inputStream = this.o;
            if (inputStream != null) {
                long j = this.r;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.s;
                }
                h(this.n, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new HttpDataSource.HttpDataSourceException(e, (DataSpec) Util.castNonNull(this.m), 2000, 3);
                }
            }
            this.o = null;
            c();
            if (this.p) {
                this.p = false;
                transferEnded();
            }
        } catch (Throwable th) {
            this.o = null;
            c();
            if (this.p) {
                this.p = false;
                transferEnded();
            }
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public int getResponseCode() {
        int i;
        if (this.n == null || (i = this.q) <= 0) {
            return -1;
        }
        return i;
    }

    @Override // com.google.android.exoplayer2.upstream.BaseDataSource, com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.n;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @VisibleForTesting
    public HttpURLConnection i(URL url) throws IOException {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        byte[] byteArray;
        this.m = dataSpec;
        long j = 0;
        this.s = 0L;
        this.r = 0L;
        transferInitializing(dataSpec);
        try {
            HttpURLConnection httpURLConnectionF = f(dataSpec);
            this.n = httpURLConnectionF;
            this.q = httpURLConnectionF.getResponseCode();
            String responseMessage = httpURLConnectionF.getResponseMessage();
            int i = this.q;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionF.getHeaderFields();
                if (this.q == 416) {
                    if (dataSpec.position == HttpUtil.getDocumentSize(httpURLConnectionF.getHeaderField("Content-Range"))) {
                        this.p = true;
                        transferStarted(dataSpec);
                        long j2 = dataSpec.length;
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionF.getErrorStream();
                try {
                    byteArray = errorStream != null ? Util.toByteArray(errorStream) : Util.EMPTY_BYTE_ARRAY;
                } catch (IOException unused) {
                    byteArray = Util.EMPTY_BYTE_ARRAY;
                }
                byte[] bArr = byteArray;
                c();
                throw new HttpDataSource.InvalidResponseCodeException(this.q, responseMessage, this.q == 416 ? new DataSourceException(2008) : null, headerFields, dataSpec, bArr);
            }
            String contentType = httpURLConnectionF.getContentType();
            Predicate<String> predicate = this.l;
            if (predicate != null && !predicate.apply(contentType)) {
                c();
                throw new HttpDataSource.InvalidContentTypeException(contentType, dataSpec);
            }
            if (this.q == 200) {
                long j3 = dataSpec.position;
                if (j3 != 0) {
                    j = j3;
                }
            }
            boolean zE = e(httpURLConnectionF);
            if (zE) {
                this.r = dataSpec.length;
            } else {
                long j4 = dataSpec.length;
                if (j4 != -1) {
                    this.r = j4;
                } else {
                    long contentLength = HttpUtil.getContentLength(httpURLConnectionF.getHeaderField("Content-Length"), httpURLConnectionF.getHeaderField("Content-Range"));
                    this.r = contentLength != -1 ? contentLength - j : -1L;
                }
            }
            try {
                this.o = httpURLConnectionF.getInputStream();
                if (zE) {
                    this.o = new GZIPInputStream(this.o);
                }
                this.p = true;
                transferStarted(dataSpec);
                try {
                    k(j, dataSpec);
                    return this.r;
                } catch (IOException e) {
                    c();
                    if (e instanceof HttpDataSource.HttpDataSourceException) {
                        throw ((HttpDataSource.HttpDataSourceException) e);
                    }
                    throw new HttpDataSource.HttpDataSourceException(e, dataSpec, 2000, 1);
                }
            } catch (IOException e2) {
                c();
                throw new HttpDataSource.HttpDataSourceException(e2, dataSpec, 2000, 1);
            }
        } catch (IOException e3) {
            c();
            throw HttpDataSource.HttpDataSourceException.createForIOException(e3, dataSpec, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) throws HttpDataSource.HttpDataSourceException {
        try {
            return j(buffer, offset, length);
        } catch (IOException e) {
            throw HttpDataSource.HttpDataSourceException.createForIOException(e, (DataSpec) Util.castNonNull(this.m), 2);
        }
    }

    @Deprecated
    public void setContentTypePredicate(@Nullable Predicate<String> contentTypePredicate) {
        this.l = contentTypePredicate;
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void setRequestProperty(String name, String value) {
        Assertions.checkNotNull(name);
        Assertions.checkNotNull(value);
        this.j.set(name, value);
    }

    @Deprecated
    public DefaultHttpDataSource() {
        this(null, 8000, 8000);
    }

    @Deprecated
    public DefaultHttpDataSource(@Nullable String userAgent) {
        this(userAgent, 8000, 8000);
    }

    @Deprecated
    public DefaultHttpDataSource(@Nullable String userAgent, int connectTimeoutMillis, int readTimeoutMillis) {
        this(userAgent, connectTimeoutMillis, readTimeoutMillis, false, null);
    }

    @Deprecated
    public DefaultHttpDataSource(@Nullable String userAgent, int connectTimeoutMillis, int readTimeoutMillis, boolean allowCrossProtocolRedirects, @Nullable HttpDataSource.RequestProperties defaultRequestProperties) {
        this(userAgent, connectTimeoutMillis, readTimeoutMillis, allowCrossProtocolRedirects, defaultRequestProperties, null, false);
    }

    private DefaultHttpDataSource(@Nullable String userAgent, int connectTimeoutMillis, int readTimeoutMillis, boolean allowCrossProtocolRedirects, @Nullable HttpDataSource.RequestProperties defaultRequestProperties, @Nullable Predicate<String> contentTypePredicate, boolean keepPostFor302Redirects) {
        super(true);
        this.h = userAgent;
        this.f = connectTimeoutMillis;
        this.g = readTimeoutMillis;
        this.e = allowCrossProtocolRedirects;
        this.i = defaultRequestProperties;
        this.l = contentTypePredicate;
        this.j = new HttpDataSource.RequestProperties();
        this.k = keepPostFor302Redirects;
    }
}
