package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.accountsdk.request.SimpleRequest;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.fk1;
import defpackage.fxp;
import defpackage.h6i;
import defpackage.ihc;
import defpackage.m62;
import defpackage.rk1;
import defpackage.toe;
import defpackage.wlq;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes4.dex */
public class e extends m62 implements HttpDataSource {
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public final HttpDataSource.c i;
    public final HttpDataSource.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h6i<String> f8429k;
    public com.google.android.exoplayer2.upstream.b l;
    public HttpURLConnection m;
    public InputStream n;
    public boolean o;
    public int p;
    public long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f8430r;

    public static final class b implements HttpDataSource.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public fxp f8432b;
        public h6i<String> c;
        public String d;
        public boolean g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HttpDataSource.c f8431a = new HttpDataSource.c();
        public int e = 8000;
        public int f = 8000;

        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0205a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a() {
            e eVar = new e(this.d, this.e, this.f, this.g, this.f8431a, this.c);
            fxp fxpVar = this.f8432b;
            if (fxpVar != null) {
                eVar.f(fxpVar);
            }
            return eVar;
        }

        public b c(String str) {
            this.d = str;
            return this;
        }
    }

    public e(String str, int i, int i2, boolean z, HttpDataSource.c cVar, h6i<String> h6iVar) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = z;
        this.i = cVar;
        this.f8429k = h6iVar;
        this.j = new HttpDataSource.c();
    }

    public static void A(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection == null || (i = wlq.f38110a) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) rk1.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    private int C(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.q;
        if (j != -1) {
            long j2 = j - this.f8430r;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = ((InputStream) wlq.j(this.n)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.f8430r += (long) i3;
        r(i3);
        return i3;
    }

    private boolean D(long j) throws IOException {
        if (j == 0) {
            return true;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i = ((InputStream) wlq.j(this.n)).read(bArr, 0, (int) Math.min(j, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (i == -1) {
                return false;
            }
            j -= (long) i;
            r(i);
        }
        return true;
    }

    private void v() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                toe.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.m = null;
        }
    }

    public static URL w(URL url, String str) throws IOException {
        if (str == null) {
            throw new ProtocolException("Null location redirect");
        }
        URL url2 = new URL(url, str);
        String protocol = url2.getProtocol();
        if (Constants.URI_SCHEME.equals(protocol) || "http".equals(protocol)) {
            return url2;
        }
        String strValueOf = String.valueOf(protocol);
        throw new ProtocolException(strValueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(strValueOf) : new String("Unsupported protocol redirect: "));
    }

    public static boolean x(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(HTTP.CONTENT_ENCODING));
    }

    @VisibleForTesting
    public HttpURLConnection B(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(com.google.android.exoplayer2.upstream.b bVar) throws HttpDataSource.HttpDataSourceException {
        byte[] bArrS0;
        this.l = bVar;
        long j = 0;
        this.f8430r = 0L;
        this.q = 0L;
        t(bVar);
        try {
            HttpURLConnection httpURLConnectionY = y(bVar);
            this.m = httpURLConnectionY;
            try {
                this.p = httpURLConnectionY.getResponseCode();
                String responseMessage = httpURLConnectionY.getResponseMessage();
                int i = this.p;
                if (i < 200 || i > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionY.getHeaderFields();
                    if (this.p == 416) {
                        if (bVar.g == ihc.c(httpURLConnectionY.getHeaderField("Content-Range"))) {
                            this.o = true;
                            u(bVar);
                            long j2 = bVar.h;
                            if (j2 != -1) {
                                return j2;
                            }
                            return 0L;
                        }
                    }
                    InputStream errorStream = httpURLConnectionY.getErrorStream();
                    try {
                        bArrS0 = errorStream != null ? wlq.S0(errorStream) : wlq.f;
                    } catch (IOException unused) {
                        bArrS0 = wlq.f;
                    }
                    v();
                    HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(this.p, responseMessage, headerFields, bVar, bArrS0);
                    if (this.p != 416) {
                        throw invalidResponseCodeException;
                    }
                    invalidResponseCodeException.initCause(new DataSourceException(0));
                    throw invalidResponseCodeException;
                }
                String contentType = httpURLConnectionY.getContentType();
                h6i<String> h6iVar = this.f8429k;
                if (h6iVar != null && !h6iVar.apply(contentType)) {
                    v();
                    throw new HttpDataSource.InvalidContentTypeException(contentType, bVar);
                }
                if (this.p == 200) {
                    long j3 = bVar.g;
                    if (j3 != 0) {
                        j = j3;
                    }
                }
                boolean zX = x(httpURLConnectionY);
                if (zX) {
                    this.q = bVar.h;
                } else {
                    long j4 = bVar.h;
                    if (j4 != -1) {
                        this.q = j4;
                    } else {
                        long jB = ihc.b(httpURLConnectionY.getHeaderField(HTTP.CONTENT_LEN), httpURLConnectionY.getHeaderField("Content-Range"));
                        this.q = jB != -1 ? jB - j : -1L;
                    }
                }
                try {
                    this.n = httpURLConnectionY.getInputStream();
                    if (zX) {
                        this.n = new GZIPInputStream(this.n);
                    }
                    this.o = true;
                    u(bVar);
                    try {
                        if (D(j)) {
                            return this.q;
                        }
                        throw new DataSourceException(0);
                    } catch (IOException e) {
                        v();
                        throw new HttpDataSource.HttpDataSourceException(e, bVar, 1);
                    }
                } catch (IOException e2) {
                    v();
                    throw new HttpDataSource.HttpDataSourceException(e2, bVar, 1);
                }
            } catch (IOException e3) {
                v();
                throw new HttpDataSource.HttpDataSourceException("Unable to connect", e3, bVar, 1);
            }
        } catch (IOException e4) {
            String message = e4.getMessage();
            if (message == null || !fk1.e(message).matches("cleartext http traffic.*not permitted.*")) {
                throw new HttpDataSource.HttpDataSourceException("Unable to connect", e4, bVar, 1);
            }
            throw new HttpDataSource.CleartextNotPermittedException(e4, bVar);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws HttpDataSource.HttpDataSourceException {
        try {
            InputStream inputStream = this.n;
            if (inputStream != null) {
                long j = this.q;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f8430r;
                }
                A(this.m, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new HttpDataSource.HttpDataSourceException(e, (com.google.android.exoplayer2.upstream.b) wlq.j(this.l), 3);
                }
            }
            this.n = null;
            v();
            if (this.o) {
                this.o = false;
                s();
            }
        } catch (Throwable th) {
            this.n = null;
            v();
            if (this.o) {
                this.o = false;
                s();
            }
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> d() {
        HttpURLConnection httpURLConnection = this.m;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri h() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // defpackage.zm5
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource.HttpDataSourceException {
        try {
            return C(bArr, i, i2);
        } catch (IOException e) {
            throw new HttpDataSource.HttpDataSourceException(e, (com.google.android.exoplayer2.upstream.b) wlq.j(this.l), 2);
        }
    }

    public final HttpURLConnection y(com.google.android.exoplayer2.upstream.b bVar) throws IOException {
        com.google.android.exoplayer2.upstream.b bVar2 = bVar;
        URL url = new URL(bVar2.f8404a.toString());
        int i = bVar2.c;
        byte[] bArr = bVar2.d;
        long j = bVar2.g;
        long j2 = bVar2.h;
        int i2 = 1;
        boolean zD = bVar2.d(1);
        if (!this.e) {
            return z(url, i, bArr, j, j2, zD, true, bVar2.e);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 > 20) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Too many redirects: ");
                sb.append(i4);
                throw new NoRouteToHostException(sb.toString());
            }
            byte[] bArr2 = bArr;
            int i5 = i2;
            long j3 = j2;
            long j4 = j;
            HttpURLConnection httpURLConnectionZ = z(url, i, bArr, j, j2, zD, false, bVar2.e);
            int responseCode = httpURLConnectionZ.getResponseCode();
            String headerField = httpURLConnectionZ.getHeaderField(SimpleRequest.LOCATION);
            if ((i == i5 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionZ.disconnect();
                url = w(url, headerField);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionZ;
                }
                httpURLConnectionZ.disconnect();
                url = w(url, headerField);
                bArr2 = null;
                i = i5;
            }
            i3 = i4;
            i2 = i5;
            bArr = bArr2;
            j2 = j3;
            j = j4;
            bVar2 = bVar;
        }
    }

    public final HttpURLConnection z(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionB = B(url);
        httpURLConnectionB.setConnectTimeout(this.f);
        httpURLConnectionB.setReadTimeout(this.g);
        HashMap map2 = new HashMap();
        HttpDataSource.c cVar = this.i;
        if (cVar != null) {
            map2.putAll(cVar.a());
        }
        map2.putAll(this.j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionB.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = ihc.a(j, j2);
        if (strA != null) {
            httpURLConnectionB.setRequestProperty("Range", strA);
        }
        String str = this.h;
        if (str != null) {
            httpURLConnectionB.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionB.setRequestProperty("Accept-Encoding", z ? "gzip" : HTTP.IDENTITY_CODING);
        httpURLConnectionB.setInstanceFollowRedirects(z2);
        httpURLConnectionB.setDoOutput(bArr != null);
        httpURLConnectionB.setRequestMethod(com.google.android.exoplayer2.upstream.b.c(i));
        if (bArr != null) {
            httpURLConnectionB.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionB.connect();
            OutputStream outputStream = httpURLConnectionB.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionB.connect();
        }
        return httpURLConnectionB;
    }
}
