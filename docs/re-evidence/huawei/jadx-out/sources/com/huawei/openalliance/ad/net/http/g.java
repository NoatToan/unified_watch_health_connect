package com.huawei.openalliance.ad.net.http;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.network.base.common.trans.FileBinary;
import com.huawei.hms.network.embedded.j2;
import com.huawei.openalliance.ad.beans.inner.HttpConnection;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.df;
import com.huawei.openalliance.ad.utils.dg;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes12.dex */
class g extends b {
    /* JADX WARN: Code duplicated, block: B:118:0x0229 A[Catch: all -> 0x0259, PHI: r1 r3 r4 r6 r11 r21 r25
      0x0229: PHI (r1v14 java.lang.String) = (r1v11 java.lang.String), (r1v12 java.lang.String), (r1v15 java.lang.String) binds: [B:117:0x0227, B:125:0x0258, B:134:0x0271] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r3v13 ??) = (r3v37 ??), (r3v38 ??), (r3v39 ??) binds: [B:117:0x0227, B:125:0x0258, B:134:0x0271] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r4v5 java.io.BufferedInputStream) = (r4v2 java.io.BufferedInputStream), (r4v3 java.io.BufferedInputStream), (r4v6 java.io.BufferedInputStream) binds: [B:117:0x0227, B:125:0x0258, B:134:0x0271] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r6v13 java.net.HttpURLConnection) = (r6v10 java.net.HttpURLConnection), (r6v11 java.net.HttpURLConnection), (r6v14 java.net.HttpURLConnection) binds: [B:117:0x0227, B:125:0x0258, B:134:0x0271] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r11v12 long) = (r11v10 long), (r11v11 long), (r11v13 long) binds: [B:117:0x0227, B:125:0x0258, B:134:0x0271] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r21v13 java.io.BufferedOutputStream) = (r21v10 java.io.BufferedOutputStream), (r21v11 java.io.BufferedOutputStream), (r21v14 java.io.BufferedOutputStream) binds: [B:117:0x0227, B:125:0x0258, B:134:0x0271] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r25v7 java.util.zip.GZIPInputStream) = (r25v4 java.util.zip.GZIPInputStream), (r25v5 java.util.zip.GZIPInputStream), (r25v8 java.util.zip.GZIPInputStream) binds: [B:117:0x0227, B:125:0x0258, B:134:0x0271] A[DONT_GENERATE, DONT_INLINE], TryCatch #29 {all -> 0x0259, blocks: (B:116:0x020a, B:118:0x0229, B:135:0x0272, B:123:0x023b, B:132:0x0265), top: B:142:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0258  */
    /* JADX WARN: Code duplicated, block: B:134:0x0271  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    @Override // com.huawei.openalliance.ad.net.http.h
    public Response b(e eVar, a aVar) {
        String str;
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        long jCurrentTimeMillis;
        InputStream inputStream;
        int i;
        InputStream inputStream2;
        int i2;
        InputStream inputStream3;
        GZIPInputStream gZIPInputStream;
        InputStream inputStream4;
        InputStream inputStream5;
        ?? r3;
        InputStream inputStream6;
        InputStream inputStream7;
        int i3;
        HttpURLConnection httpURLConnection2;
        Response response = new Response();
        String strA = a(eVar, aVar);
        if (TextUtils.isEmpty(strA)) {
            hw.c("HttpUrlConnectionCaller", "Server url is empty");
            return response;
        }
        boolean z = aVar.j != null && aVar.j.length > 0;
        int i4 = 2;
        ?? r4 = -1;
        i = -1;
        i = -1;
        i = -1;
        i = -1;
        int i5 = -1;
        int i6 = -1;
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                HttpURLConnection httpURLConnectionA = a(strA, aVar, z, eVar);
                try {
                    b(aVar, httpURLConnectionA);
                    str = "http execute encounter %s - http code: %d";
                    strA = "close connection";
                    try {
                        jCurrentTimeMillis = System.currentTimeMillis();
                        if (z) {
                            try {
                                a(aVar, httpURLConnectionA);
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnectionA.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(aVar.j);
                                    bufferedOutputStream2.flush();
                                    bufferedOutputStream = bufferedOutputStream2;
                                } catch (com.huawei.openalliance.ad.exception.d e) {
                                    e = e;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    httpURLConnectionA = httpURLConnectionA;
                                    strA = strA;
                                    httpURLConnection = httpURLConnectionA;
                                    inputStream = null;
                                    gZIPInputStream = null;
                                    inputStream6 = inputStream;
                                    hw.c("HttpUrlConnectionCaller", "http execute encounter SSLConfigException");
                                    response.a((Throwable) e);
                                    r3 = inputStream6;
                                    if (jCurrentTimeMillis > 0) {
                                        r4 = inputStream6;
                                        response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                        r3 = r4;
                                    }
                                    df.a(bufferedOutputStream);
                                    df.a((Closeable) r3);
                                    df.a((Closeable) gZIPInputStream);
                                    df.a((Closeable) bufferedInputStream);
                                    df.a(httpURLConnection);
                                    hw.b("HttpUrlConnectionCaller", strA);
                                    return response;
                                } catch (IOException e2) {
                                    e = e2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    httpURLConnectionA = httpURLConnectionA;
                                    i4 = 2;
                                    strA = strA;
                                    httpURLConnection = httpURLConnectionA;
                                    str = str;
                                    i2 = i5;
                                    inputStream3 = null;
                                    gZIPInputStream = null;
                                    inputStream5 = inputStream3;
                                    Object[] objArr = new Object[i4];
                                    objArr[0] = e.getClass().getSimpleName();
                                    objArr[1] = Integer.valueOf(i2);
                                    hw.c("HttpUrlConnectionCaller", str, objArr);
                                    response.a((Throwable) e);
                                    r3 = inputStream5;
                                    if (jCurrentTimeMillis > 0) {
                                        r4 = inputStream5;
                                        response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                        r3 = r4;
                                    }
                                    df.a(bufferedOutputStream);
                                    df.a((Closeable) r3);
                                    df.a((Closeable) gZIPInputStream);
                                    df.a((Closeable) bufferedInputStream);
                                    df.a(httpURLConnection);
                                    hw.b("HttpUrlConnectionCaller", strA);
                                    return response;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    httpURLConnectionA = httpURLConnectionA;
                                    i4 = 2;
                                    strA = strA;
                                    httpURLConnection = httpURLConnectionA;
                                    i = i6;
                                    inputStream2 = null;
                                    gZIPInputStream = null;
                                    inputStream4 = inputStream2;
                                    Object[] objArr2 = new Object[i4];
                                    objArr2[0] = th.getClass().getSimpleName();
                                    objArr2[1] = Integer.valueOf(i);
                                    hw.c("HttpUrlConnectionCaller", str, objArr2);
                                    response.a(th);
                                    r4 = inputStream4;
                                    r3 = inputStream4;
                                    if (jCurrentTimeMillis > 0) {
                                        response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                        r3 = r4;
                                    }
                                    df.a(bufferedOutputStream);
                                    df.a((Closeable) r3);
                                    df.a((Closeable) gZIPInputStream);
                                    df.a((Closeable) bufferedInputStream);
                                    df.a(httpURLConnection);
                                    hw.b("HttpUrlConnectionCaller", strA);
                                    return response;
                                }
                            } catch (com.huawei.openalliance.ad.exception.d e3) {
                                e = e3;
                                httpURLConnectionA = httpURLConnectionA;
                                strA = strA;
                                bufferedOutputStream = null;
                                httpURLConnection = httpURLConnectionA;
                                inputStream = null;
                                gZIPInputStream = null;
                                inputStream6 = inputStream;
                                hw.c("HttpUrlConnectionCaller", "http execute encounter SSLConfigException");
                                response.a((Throwable) e);
                                r3 = inputStream6;
                                if (jCurrentTimeMillis > 0) {
                                    r4 = inputStream6;
                                    response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                    r3 = r4;
                                }
                                df.a(bufferedOutputStream);
                                df.a((Closeable) r3);
                                df.a((Closeable) gZIPInputStream);
                                df.a((Closeable) bufferedInputStream);
                                df.a(httpURLConnection);
                                hw.b("HttpUrlConnectionCaller", strA);
                                return response;
                            } catch (IOException e4) {
                                e = e4;
                                httpURLConnectionA = httpURLConnectionA;
                                i4 = 2;
                                strA = strA;
                                bufferedOutputStream = null;
                                httpURLConnection = httpURLConnectionA;
                                str = str;
                                i2 = i5;
                                inputStream3 = null;
                                gZIPInputStream = null;
                                inputStream5 = inputStream3;
                                Object[] objArr3 = new Object[i4];
                                objArr3[0] = e.getClass().getSimpleName();
                                objArr3[1] = Integer.valueOf(i2);
                                hw.c("HttpUrlConnectionCaller", str, objArr3);
                                response.a((Throwable) e);
                                r3 = inputStream5;
                                if (jCurrentTimeMillis > 0) {
                                    r4 = inputStream5;
                                    response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                    r3 = r4;
                                }
                                df.a(bufferedOutputStream);
                                df.a((Closeable) r3);
                                df.a((Closeable) gZIPInputStream);
                                df.a((Closeable) bufferedInputStream);
                                df.a(httpURLConnection);
                                hw.b("HttpUrlConnectionCaller", strA);
                                return response;
                            } catch (Throwable th2) {
                                th = th2;
                                httpURLConnectionA = httpURLConnectionA;
                                i4 = 2;
                                strA = strA;
                                bufferedOutputStream = null;
                                httpURLConnection = httpURLConnectionA;
                                i = i6;
                                inputStream2 = null;
                                gZIPInputStream = null;
                                inputStream4 = inputStream2;
                                Object[] objArr4 = new Object[i4];
                                objArr4[0] = th.getClass().getSimpleName();
                                objArr4[1] = Integer.valueOf(i);
                                hw.c("HttpUrlConnectionCaller", str, objArr4);
                                response.a(th);
                                r4 = inputStream4;
                                r3 = inputStream4;
                                if (jCurrentTimeMillis > 0) {
                                    response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                    r3 = r4;
                                }
                                df.a(bufferedOutputStream);
                                df.a((Closeable) r3);
                                df.a((Closeable) gZIPInputStream);
                                df.a((Closeable) bufferedInputStream);
                                df.a(httpURLConnection);
                                hw.b("HttpUrlConnectionCaller", strA);
                                return response;
                            }
                        } else {
                            bufferedOutputStream = null;
                        }
                        try {
                            try {
                                response.a(httpURLConnectionA.getContentLengthLong());
                                int responseCode = httpURLConnectionA.getResponseCode();
                                try {
                                    response.a(responseCode);
                                    InputStream inputStream8 = httpURLConnectionA.getInputStream();
                                    try {
                                        response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                        GZIPInputStream gZIPInputStream2 = a(httpURLConnectionA) ? new GZIPInputStream(inputStream8) : null;
                                        try {
                                            BufferedInputStream bufferedInputStream2 = gZIPInputStream2 != null ? new BufferedInputStream(gZIPInputStream2) : new BufferedInputStream(inputStream8);
                                            try {
                                                gZIPInputStream = gZIPInputStream2;
                                                inputStream7 = inputStream8;
                                                httpURLConnection2 = httpURLConnectionA;
                                                i3 = responseCode;
                                                i4 = 2;
                                                try {
                                                    long jA = a(eVar, aVar, responseCode, bufferedInputStream2, response.c(), response);
                                                    response.b(jA - jCurrentTimeMillis);
                                                    response.d(System.currentTimeMillis() - jA);
                                                    HttpConnection httpConnection = new HttpConnection();
                                                    httpConnection.a("dl-from", httpURLConnection2.getHeaderField("dl-from"));
                                                    response.a(httpConnection);
                                                    response.b(aVar.k);
                                                    df.a(bufferedOutputStream);
                                                    df.a((Closeable) inputStream7);
                                                    df.a((Closeable) gZIPInputStream);
                                                    df.a((Closeable) bufferedInputStream2);
                                                    df.a(httpURLConnection2);
                                                    hw.b("HttpUrlConnectionCaller", strA);
                                                    return response;
                                                } catch (com.huawei.openalliance.ad.exception.d e5) {
                                                    e = e5;
                                                    httpURLConnection = httpURLConnection2;
                                                    bufferedInputStream = bufferedInputStream2;
                                                    inputStream6 = inputStream7;
                                                    hw.c("HttpUrlConnectionCaller", "http execute encounter SSLConfigException");
                                                    response.a((Throwable) e);
                                                    r3 = inputStream6;
                                                    if (jCurrentTimeMillis > 0) {
                                                        r4 = inputStream6;
                                                        response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                                        r3 = r4;
                                                    }
                                                    df.a(bufferedOutputStream);
                                                    df.a((Closeable) r3);
                                                    df.a((Closeable) gZIPInputStream);
                                                    df.a((Closeable) bufferedInputStream);
                                                    df.a(httpURLConnection);
                                                    hw.b("HttpUrlConnectionCaller", strA);
                                                    return response;
                                                } catch (IOException e6) {
                                                    e = e6;
                                                    httpURLConnection = httpURLConnection2;
                                                    bufferedInputStream = bufferedInputStream2;
                                                    inputStream5 = inputStream7;
                                                    i2 = i3;
                                                    Object[] objArr5 = new Object[i4];
                                                    objArr5[0] = e.getClass().getSimpleName();
                                                    objArr5[1] = Integer.valueOf(i2);
                                                    hw.c("HttpUrlConnectionCaller", str, objArr5);
                                                    response.a((Throwable) e);
                                                    r3 = inputStream5;
                                                    if (jCurrentTimeMillis > 0) {
                                                        r4 = inputStream5;
                                                        response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                                        r3 = r4;
                                                    }
                                                    df.a(bufferedOutputStream);
                                                    df.a((Closeable) r3);
                                                    df.a((Closeable) gZIPInputStream);
                                                    df.a((Closeable) bufferedInputStream);
                                                    df.a(httpURLConnection);
                                                    hw.b("HttpUrlConnectionCaller", strA);
                                                    return response;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    httpURLConnection = httpURLConnection2;
                                                    bufferedInputStream = bufferedInputStream2;
                                                    inputStream4 = inputStream7;
                                                    i = i3;
                                                    Object[] objArr6 = new Object[i4];
                                                    objArr6[0] = th.getClass().getSimpleName();
                                                    objArr6[1] = Integer.valueOf(i);
                                                    hw.c("HttpUrlConnectionCaller", str, objArr6);
                                                    response.a(th);
                                                    r4 = inputStream4;
                                                    r3 = inputStream4;
                                                    if (jCurrentTimeMillis > 0) {
                                                        response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                                        r3 = r4;
                                                    }
                                                    df.a(bufferedOutputStream);
                                                    df.a((Closeable) r3);
                                                    df.a((Closeable) gZIPInputStream);
                                                    df.a((Closeable) bufferedInputStream);
                                                    df.a(httpURLConnection);
                                                    hw.b("HttpUrlConnectionCaller", strA);
                                                    return response;
                                                }
                                            } catch (com.huawei.openalliance.ad.exception.d e7) {
                                                e = e7;
                                                gZIPInputStream = gZIPInputStream2;
                                                inputStream7 = inputStream8;
                                                httpURLConnection2 = httpURLConnectionA;
                                            } catch (IOException e8) {
                                                e = e8;
                                                gZIPInputStream = gZIPInputStream2;
                                                inputStream7 = inputStream8;
                                                httpURLConnection2 = httpURLConnectionA;
                                                i3 = responseCode;
                                                i4 = 2;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                gZIPInputStream = gZIPInputStream2;
                                                inputStream7 = inputStream8;
                                                httpURLConnection2 = httpURLConnectionA;
                                                i3 = responseCode;
                                                i4 = 2;
                                            }
                                        } catch (com.huawei.openalliance.ad.exception.d e9) {
                                            e = e9;
                                            gZIPInputStream = gZIPInputStream2;
                                            inputStream7 = inputStream8;
                                            httpURLConnection = httpURLConnectionA;
                                        } catch (IOException e10) {
                                            e = e10;
                                            gZIPInputStream = gZIPInputStream2;
                                            inputStream7 = inputStream8;
                                            i3 = responseCode;
                                            i4 = 2;
                                            httpURLConnection = httpURLConnectionA;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            gZIPInputStream = gZIPInputStream2;
                                            inputStream7 = inputStream8;
                                            i3 = responseCode;
                                            i4 = 2;
                                            httpURLConnection = httpURLConnectionA;
                                        }
                                    } catch (com.huawei.openalliance.ad.exception.d e11) {
                                        e = e11;
                                        strA = strA;
                                        httpURLConnection = httpURLConnectionA;
                                        inputStream = inputStream8;
                                        gZIPInputStream = null;
                                        inputStream6 = inputStream;
                                        hw.c("HttpUrlConnectionCaller", "http execute encounter SSLConfigException");
                                        response.a((Throwable) e);
                                        r3 = inputStream6;
                                        if (jCurrentTimeMillis > 0) {
                                            r4 = inputStream6;
                                            response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                            r3 = r4;
                                        }
                                        df.a(bufferedOutputStream);
                                        df.a((Closeable) r3);
                                        df.a((Closeable) gZIPInputStream);
                                        df.a((Closeable) bufferedInputStream);
                                        df.a(httpURLConnection);
                                        hw.b("HttpUrlConnectionCaller", strA);
                                        return response;
                                    } catch (IOException e12) {
                                        e = e12;
                                        i4 = 2;
                                        strA = strA;
                                        httpURLConnection = httpURLConnectionA;
                                        str = str;
                                        inputStream3 = inputStream8;
                                        i2 = responseCode;
                                        gZIPInputStream = null;
                                        inputStream5 = inputStream3;
                                        Object[] objArr7 = new Object[i4];
                                        objArr7[0] = e.getClass().getSimpleName();
                                        objArr7[1] = Integer.valueOf(i2);
                                        hw.c("HttpUrlConnectionCaller", str, objArr7);
                                        response.a((Throwable) e);
                                        r3 = inputStream5;
                                        if (jCurrentTimeMillis > 0) {
                                            r4 = inputStream5;
                                            response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                            r3 = r4;
                                        }
                                        df.a(bufferedOutputStream);
                                        df.a((Closeable) r3);
                                        df.a((Closeable) gZIPInputStream);
                                        df.a((Closeable) bufferedInputStream);
                                        df.a(httpURLConnection);
                                        hw.b("HttpUrlConnectionCaller", strA);
                                        return response;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        i4 = 2;
                                        strA = strA;
                                        httpURLConnection = httpURLConnectionA;
                                        inputStream2 = inputStream8;
                                        i = responseCode;
                                        gZIPInputStream = null;
                                        inputStream4 = inputStream2;
                                        Object[] objArr8 = new Object[i4];
                                        objArr8[0] = th.getClass().getSimpleName();
                                        objArr8[1] = Integer.valueOf(i);
                                        hw.c("HttpUrlConnectionCaller", str, objArr8);
                                        response.a(th);
                                        r4 = inputStream4;
                                        r3 = inputStream4;
                                        if (jCurrentTimeMillis > 0) {
                                            response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                            r3 = r4;
                                        }
                                        df.a(bufferedOutputStream);
                                        df.a((Closeable) r3);
                                        df.a((Closeable) gZIPInputStream);
                                        df.a((Closeable) bufferedInputStream);
                                        df.a(httpURLConnection);
                                        hw.b("HttpUrlConnectionCaller", strA);
                                        return response;
                                    }
                                } catch (IOException e13) {
                                    e = e13;
                                    httpURLConnectionA = httpURLConnectionA;
                                    i4 = 2;
                                    strA = strA;
                                    i5 = responseCode;
                                    httpURLConnection = httpURLConnectionA;
                                    str = str;
                                    i2 = i5;
                                    inputStream3 = null;
                                    gZIPInputStream = null;
                                    inputStream5 = inputStream3;
                                    Object[] objArr9 = new Object[i4];
                                    objArr9[0] = e.getClass().getSimpleName();
                                    objArr9[1] = Integer.valueOf(i2);
                                    hw.c("HttpUrlConnectionCaller", str, objArr9);
                                    response.a((Throwable) e);
                                    r3 = inputStream5;
                                    if (jCurrentTimeMillis > 0) {
                                        r4 = inputStream5;
                                        response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                        r3 = r4;
                                    }
                                    df.a(bufferedOutputStream);
                                    df.a((Closeable) r3);
                                    df.a((Closeable) gZIPInputStream);
                                    df.a((Closeable) bufferedInputStream);
                                    df.a(httpURLConnection);
                                    hw.b("HttpUrlConnectionCaller", strA);
                                    return response;
                                } catch (Throwable th7) {
                                    th = th7;
                                    httpURLConnectionA = httpURLConnectionA;
                                    i4 = 2;
                                    strA = strA;
                                    i6 = responseCode;
                                    httpURLConnection = httpURLConnectionA;
                                    i = i6;
                                    inputStream2 = null;
                                    gZIPInputStream = null;
                                    inputStream4 = inputStream2;
                                    Object[] objArr10 = new Object[i4];
                                    objArr10[0] = th.getClass().getSimpleName();
                                    objArr10[1] = Integer.valueOf(i);
                                    hw.c("HttpUrlConnectionCaller", str, objArr10);
                                    response.a(th);
                                    r4 = inputStream4;
                                    r3 = inputStream4;
                                    if (jCurrentTimeMillis > 0) {
                                        response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                        r3 = r4;
                                    }
                                    df.a(bufferedOutputStream);
                                    df.a((Closeable) r3);
                                    df.a((Closeable) gZIPInputStream);
                                    df.a((Closeable) bufferedInputStream);
                                    df.a(httpURLConnection);
                                    hw.b("HttpUrlConnectionCaller", strA);
                                    return response;
                                }
                            } catch (com.huawei.openalliance.ad.exception.d e14) {
                                e = e14;
                                httpURLConnectionA = httpURLConnectionA;
                                strA = strA;
                                httpURLConnection = httpURLConnectionA;
                                inputStream = null;
                                gZIPInputStream = null;
                                inputStream6 = inputStream;
                                hw.c("HttpUrlConnectionCaller", "http execute encounter SSLConfigException");
                                response.a((Throwable) e);
                                r3 = inputStream6;
                                if (jCurrentTimeMillis > 0) {
                                    r4 = inputStream6;
                                    response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                    r3 = r4;
                                }
                                df.a(bufferedOutputStream);
                                df.a((Closeable) r3);
                                df.a((Closeable) gZIPInputStream);
                                df.a((Closeable) bufferedInputStream);
                                df.a(httpURLConnection);
                                hw.b("HttpUrlConnectionCaller", strA);
                                return response;
                            }
                        } catch (IOException e15) {
                            e = e15;
                            httpURLConnectionA = httpURLConnectionA;
                            i4 = 2;
                            strA = strA;
                            httpURLConnection = httpURLConnectionA;
                            str = str;
                            i2 = i5;
                            inputStream3 = null;
                            gZIPInputStream = null;
                            inputStream5 = inputStream3;
                            Object[] objArr11 = new Object[i4];
                            objArr11[0] = e.getClass().getSimpleName();
                            objArr11[1] = Integer.valueOf(i2);
                            hw.c("HttpUrlConnectionCaller", str, objArr11);
                            response.a((Throwable) e);
                            r3 = inputStream5;
                            if (jCurrentTimeMillis > 0) {
                                r4 = inputStream5;
                                response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                r3 = r4;
                            }
                            df.a(bufferedOutputStream);
                            df.a((Closeable) r3);
                            df.a((Closeable) gZIPInputStream);
                            df.a((Closeable) bufferedInputStream);
                            df.a(httpURLConnection);
                            hw.b("HttpUrlConnectionCaller", strA);
                            return response;
                        } catch (Throwable th8) {
                            th = th8;
                            httpURLConnectionA = httpURLConnectionA;
                            i4 = 2;
                            strA = strA;
                            httpURLConnection = httpURLConnectionA;
                            i = i6;
                            inputStream2 = null;
                            gZIPInputStream = null;
                            inputStream4 = inputStream2;
                            Object[] objArr12 = new Object[i4];
                            objArr12[0] = th.getClass().getSimpleName();
                            objArr12[1] = Integer.valueOf(i);
                            hw.c("HttpUrlConnectionCaller", str, objArr12);
                            response.a(th);
                            r4 = inputStream4;
                            r3 = inputStream4;
                            if (jCurrentTimeMillis > 0) {
                                response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                r3 = r4;
                            }
                            df.a(bufferedOutputStream);
                            df.a((Closeable) r3);
                            df.a((Closeable) gZIPInputStream);
                            df.a((Closeable) bufferedInputStream);
                            df.a(httpURLConnection);
                            hw.b("HttpUrlConnectionCaller", strA);
                            return response;
                        }
                    } catch (com.huawei.openalliance.ad.exception.d e16) {
                        e = e16;
                        strA = strA;
                        jCurrentTimeMillis = 0;
                        bufferedOutputStream = null;
                        httpURLConnection = httpURLConnectionA;
                        inputStream = null;
                        gZIPInputStream = null;
                        inputStream6 = inputStream;
                        hw.c("HttpUrlConnectionCaller", "http execute encounter SSLConfigException");
                        response.a((Throwable) e);
                        r3 = inputStream6;
                        if (jCurrentTimeMillis > 0) {
                            r4 = inputStream6;
                            response.a(jCurrentTimeMillis, System.currentTimeMillis());
                            r3 = r4;
                        }
                        df.a(bufferedOutputStream);
                        df.a((Closeable) r3);
                        df.a((Closeable) gZIPInputStream);
                        df.a((Closeable) bufferedInputStream);
                        df.a(httpURLConnection);
                        hw.b("HttpUrlConnectionCaller", strA);
                        return response;
                    } catch (IOException e17) {
                        e = e17;
                        strA = strA;
                        jCurrentTimeMillis = 0;
                        bufferedOutputStream = null;
                        httpURLConnection = httpURLConnectionA;
                        str = str;
                        i2 = i5;
                        inputStream3 = null;
                        gZIPInputStream = null;
                        inputStream5 = inputStream3;
                        Object[] objArr13 = new Object[i4];
                        objArr13[0] = e.getClass().getSimpleName();
                        objArr13[1] = Integer.valueOf(i2);
                        hw.c("HttpUrlConnectionCaller", str, objArr13);
                        response.a((Throwable) e);
                        r3 = inputStream5;
                        if (jCurrentTimeMillis > 0) {
                            r4 = inputStream5;
                            response.a(jCurrentTimeMillis, System.currentTimeMillis());
                            r3 = r4;
                        }
                        df.a(bufferedOutputStream);
                        df.a((Closeable) r3);
                        df.a((Closeable) gZIPInputStream);
                        df.a((Closeable) bufferedInputStream);
                        df.a(httpURLConnection);
                        hw.b("HttpUrlConnectionCaller", strA);
                        return response;
                    } catch (Throwable th9) {
                        th = th9;
                        strA = strA;
                        jCurrentTimeMillis = 0;
                        bufferedOutputStream = null;
                        httpURLConnection = httpURLConnectionA;
                        i = i6;
                        inputStream2 = null;
                        gZIPInputStream = null;
                        inputStream4 = inputStream2;
                        Object[] objArr14 = new Object[i4];
                        objArr14[0] = th.getClass().getSimpleName();
                        objArr14[1] = Integer.valueOf(i);
                        hw.c("HttpUrlConnectionCaller", str, objArr14);
                        response.a(th);
                        r4 = inputStream4;
                        r3 = inputStream4;
                        if (jCurrentTimeMillis > 0) {
                            response.a(jCurrentTimeMillis, System.currentTimeMillis());
                            r3 = r4;
                        }
                        df.a(bufferedOutputStream);
                        df.a((Closeable) r3);
                        df.a((Closeable) gZIPInputStream);
                        df.a((Closeable) bufferedInputStream);
                        df.a(httpURLConnection);
                        hw.b("HttpUrlConnectionCaller", strA);
                        return response;
                    }
                } catch (com.huawei.openalliance.ad.exception.d e18) {
                    e = e18;
                    strA = "close connection";
                } catch (IOException e19) {
                    e = e19;
                    str = "http execute encounter %s - http code: %d";
                    strA = "close connection";
                } catch (Throwable th10) {
                    th = th10;
                    str = "http execute encounter %s - http code: %d";
                    strA = "close connection";
                }
            } catch (Throwable th11) {
                df.a(bufferedOutputStream);
                df.a((Closeable) r4);
                df.a((Closeable) gZIPInputStream);
                df.a((Closeable) bufferedInputStream);
                df.a(httpURLConnection);
                hw.b("HttpUrlConnectionCaller", strA);
                throw th11;
            }
        } catch (com.huawei.openalliance.ad.exception.d e20) {
            e = e20;
            strA = "close connection";
            httpURLConnection = null;
            bufferedOutputStream = null;
            jCurrentTimeMillis = 0;
        } catch (IOException e21) {
            e = e21;
            i4 = 2;
            str = "http execute encounter %s - http code: %d";
            strA = "close connection";
            httpURLConnection = null;
            bufferedOutputStream = null;
            jCurrentTimeMillis = 0;
        } catch (Throwable th12) {
            th = th12;
            i4 = 2;
            str = "http execute encounter %s - http code: %d";
            strA = "close connection";
            httpURLConnection = null;
            bufferedOutputStream = null;
            jCurrentTimeMillis = 0;
        }
    }

    private void b(a aVar, HttpURLConnection httpURLConnection) {
        String str;
        if (a(aVar)) {
            str = FileBinary.HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM;
        } else if (aVar.g == null) {
            return;
        } else {
            str = aVar.g;
        }
        httpURLConnection.setRequestProperty("Content-Type", str);
    }

    private boolean a(URLConnection uRLConnection) {
        String headerField = uRLConnection.getHeaderField("Content-Encoding");
        return headerField != null && Constants.GZIP.equalsIgnoreCase(headerField);
    }

    private void a(HttpURLConnection httpURLConnection, a aVar) {
        httpURLConnection.setRequestProperty(j2.v, Constants.GZIP);
        if (a(aVar)) {
            httpURLConnection.setRequestProperty("hw-request-type", b(aVar));
        }
        if (aVar.h == 1) {
            String strJ = com.huawei.openalliance.ad.utils.d.j(this.f19686a);
            if (!TextUtils.isEmpty(strJ)) {
                httpURLConnection.setRequestProperty("User-Agent", strJ);
            }
        }
        if (aVar.f != null) {
            for (Map.Entry<String, String> entry : aVar.f.a().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
    }

    private void a(a aVar, HttpURLConnection httpURLConnection) {
        if (aVar.k) {
            httpURLConnection.setRequestProperty("Content-Encoding", Constants.GZIP);
        }
        if (aVar.j != null) {
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(aVar.j.length));
        }
    }

    private HttpURLConnection a(String str, a aVar, boolean z, e eVar) throws ProtocolException, com.huawei.openalliance.ad.exception.d {
        hw.b("HttpUrlConnectionCaller", "createConnection: %s", dg.h(str));
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        HttpsConfig.a(httpURLConnection, eVar.g, eVar.i);
        httpURLConnection.setRequestMethod(aVar.e);
        httpURLConnection.setConnectTimeout(eVar.f19690b);
        httpURLConnection.setReadTimeout(eVar.f19691c);
        httpURLConnection.setDoOutput(z);
        a(httpURLConnection, aVar);
        return httpURLConnection;
    }

    g(Context context) {
        super(context);
    }
}
