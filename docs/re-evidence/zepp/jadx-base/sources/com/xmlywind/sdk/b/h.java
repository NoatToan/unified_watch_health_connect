package com.xmlywind.sdk.b;

import android.text.TextUtils;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.Constants;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class h implements p {
    private final com.xmlywind.sdk.b.c.c a;
    private final com.xmlywind.sdk.b.b.b b;
    private q c;
    private HttpURLConnection d;
    private InputStream e;

    public h(h hVar) {
        this.c = hVar.c;
        this.a = hVar.a;
        this.b = hVar.b;
    }

    public h(String str) {
        this(str, com.xmlywind.sdk.b.c.d.a());
    }

    public h(String str, com.xmlywind.sdk.b.c.c cVar) {
        this(str, cVar, new com.xmlywind.sdk.b.b.a());
    }

    public h(String str, com.xmlywind.sdk.b.c.c cVar, com.xmlywind.sdk.b.b.b bVar) {
        this.a = (com.xmlywind.sdk.b.c.c) l.a(cVar);
        this.b = (com.xmlywind.sdk.b.b.b) l.a(bVar);
        q qVarA = cVar.a(str);
        this.c = qVarA == null ? new q(str, ParserMinimalBase.MIN_INT_L, o.a(str)) : qVarA;
    }

    private long a(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    private long a(HttpURLConnection httpURLConnection, long j, int i) {
        long jA = a(httpURLConnection);
        if (i == 200) {
            return jA;
        }
        return i == 206 ? jA + j : this.c.b;
    }

    private HttpURLConnection a(long j, int i) throws n, IOException {
        String str;
        HttpURLConnection httpURLConnection;
        boolean z;
        String headerField = this.c.a;
        int i2 = 0;
        do {
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
            SigmobLog.d(sb.toString());
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(headerField).openConnection()));
            a(httpURLConnection, headerField);
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
                throw new n("Too many redirects: " + i2);
            }
        } while (z);
        return httpURLConnection;
    }

    private void a(HttpURLConnection httpURLConnection, String str) {
        for (Map.Entry<String, String> entry : this.b.a(str).entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    private void e() throws Throwable {
        HttpURLConnection httpURLConnectionA;
        SigmobLog.d("Read content info from " + this.c.a);
        InputStream inputStream = null;
        try {
            httpURLConnectionA = a(0L, 10000);
            try {
                try {
                    long jA = a(httpURLConnectionA);
                    String contentType = httpURLConnectionA.getContentType();
                    inputStream = httpURLConnectionA.getInputStream();
                    try {
                        q qVar = new q(this.c.a, jA, contentType);
                        this.c = qVar;
                        this.a.a(qVar.a, qVar);
                        SigmobLog.d("Source info fetched: " + this.c);
                        o.a(inputStream);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream;
                        httpURLConnectionA = httpURLConnectionA;
                        o.a(inputStream);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    SigmobLog.e("Error fetching info from " + this.c.a, e);
                    o.a((Closeable) null);
                    if (httpURLConnectionA == null) {
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                o.a(inputStream);
                if (httpURLConnectionA != null) {
                    httpURLConnectionA.disconnect();
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            httpURLConnectionA = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnectionA = null;
        }
        httpURLConnectionA.disconnect();
    }

    @Override // com.xmlywind.sdk.b.p
    public int a(byte[] bArr) throws n {
        InputStream inputStream = this.e;
        if (inputStream == null) {
            throw new n("Error reading data from " + this.c.a + ": connection is absent!");
        }
        try {
            return inputStream.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e) {
            throw new j("Reading source " + this.c.a + " is interrupted", e);
        } catch (IOException e2) {
            throw new n("Error reading data from " + this.c.a, e2);
        }
    }

    @Override // com.xmlywind.sdk.b.p
    public long a() {
        long j;
        synchronized (this) {
            if (this.c.b == ParserMinimalBase.MIN_INT_L) {
                e();
            }
            j = this.c.b;
        }
        return j;
    }

    @Override // com.xmlywind.sdk.b.p
    public void a(long j) throws n {
        try {
            HttpURLConnection httpURLConnectionA = a(j, -1);
            this.d = httpURLConnectionA;
            String contentType = httpURLConnectionA.getContentType();
            this.e = new BufferedInputStream(this.d.getInputStream(), 8192);
            HttpURLConnection httpURLConnection = this.d;
            q qVar = new q(this.c.a, a(httpURLConnection, j, httpURLConnection.getResponseCode()), contentType);
            this.c = qVar;
            this.a.a(qVar.a, qVar);
        } catch (IOException e) {
            throw new n("Error opening connection for " + this.c.a + " with offset " + j, e);
        }
    }

    @Override // com.xmlywind.sdk.b.p
    public void b() {
        HttpURLConnection httpURLConnection = this.d;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException e) {
                SigmobLog.e("Error closing connection correctly. Should happen only on Android L. If anybody know how to fix it, please visit https://github.com/danikula/AndroidVideoCache/issues/88. Until good solution is not know, just ignore this issue :(", e);
            } catch (IllegalArgumentException e2) {
                e = e2;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            } catch (NullPointerException e3) {
                e = e3;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            }
        }
    }

    public String c() {
        String str;
        synchronized (this) {
            if (TextUtils.isEmpty(this.c.c)) {
                e();
            }
            str = this.c.c;
        }
        return str;
    }

    public String d() {
        return this.c.a;
    }

    public String toString() {
        return "HttpUrlSource{sourceInfo='" + this.c + com.alipay.sdk.m.u.i.d;
    }
}
