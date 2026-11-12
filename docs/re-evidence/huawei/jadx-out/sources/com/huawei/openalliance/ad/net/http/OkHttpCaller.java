package com.huawei.openalliance.ad.net.http;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.network.base.common.trans.FileBinary;
import com.huawei.hms.network.embedded.j2;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.beans.inner.HttpConnection;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.ag;
import com.huawei.openalliance.ad.utils.da;
import com.huawei.openalliance.ad.utils.df;
import com.huawei.openalliance.ad.utils.dg;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import okhttp3.ConnectionPool;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes12.dex */
class OkHttpCaller extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static OkHttpClient f19678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static OkHttpClient f19679c;
    private static OkHttpClient d;
    private static i e;
    private static final byte[] f = new byte[0];

    @Override // com.huawei.openalliance.ad.net.http.h
    public Response b(e eVar, a aVar) {
        Response responseA = a(eVar, aVar, false);
        hw.b("OkHttpCaller", "dnserror:" + responseA.e());
        if (!responseA.e() || a(eVar.h, aVar.b())) {
            return responseA;
        }
        String strD = responseA.d();
        Response responseA2 = a(eVar, aVar, true);
        responseA2.c(1);
        responseA2.a(strD);
        if (responseA2.e()) {
            da.a().d(Uri.parse(aVar.a() ? aVar.b() : new f.a().a(eVar.h, aVar.c()).a(aVar.i).a().c()).getHost());
        }
        return responseA2;
    }

    private boolean a(okhttp3.Response response) {
        return Constants.GZIP.equalsIgnoreCase(response.header("Content-Encoding"));
    }

    private boolean a(Context context, String str) {
        if ("dnkeeperServer".equalsIgnoreCase(str)) {
            return true;
        }
        return str != null && str.equalsIgnoreCase(context.getString(R.string.hiad_dnkeeperServer));
    }

    private void a(Request.Builder builder, a aVar) {
        builder.addHeader(j2.v, Constants.GZIP);
        if (a(aVar)) {
            builder.addHeader("hw-request-type", b(aVar));
        }
        if (aVar.h == 1) {
            String strJ = com.huawei.openalliance.ad.utils.d.j(this.f19686a);
            if (!TextUtils.isEmpty(strJ)) {
                builder.removeHeader("User-Agent").addHeader("User-Agent", strJ);
            }
        }
        if (aVar.f != null) {
            for (Map.Entry<String, String> entry : aVar.f.a().entrySet()) {
                builder.addHeader(entry.getKey(), entry.getValue());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    private void a(a aVar, Request.Builder builder) {
        String str;
        if (aVar.k) {
            builder.addHeader("Content-Encoding", Constants.GZIP);
        }
        if (!a(aVar)) {
            if (aVar.g != null) {
                hw.a("OkHttpCaller", "content type: %s", aVar.g);
                str = aVar.g;
            }
            if (aVar.j != null) {
                builder.addHeader("Content-Length", String.valueOf(aVar.j.length));
            }
        }
        hw.a("OkHttpCaller", "content type stream.");
        builder.removeHeader("Content-Type");
        str = FileBinary.HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM;
        builder.addHeader("Content-Type", str);
        if (aVar.j != null) {
            builder.addHeader("Content-Length", String.valueOf(aVar.j.length));
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00ae A[Catch: all -> 0x00bc, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:10:0x000f, B:19:0x00ae, B:24:0x00ba, B:20:0x00b1, B:22:0x00b5, B:23:0x00b8, B:12:0x0013, B:17:0x0086, B:16:0x006b, B:13:0x0060), top: B:31:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00b1 A[Catch: all -> 0x00bc, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:10:0x000f, B:19:0x00ae, B:24:0x00ba, B:20:0x00b1, B:22:0x00b5, B:23:0x00b8, B:12:0x0013, B:17:0x0086, B:16:0x006b, B:13:0x0060), top: B:31:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00b5 A[Catch: all -> 0x00bc, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:10:0x000f, B:19:0x00ae, B:24:0x00ba, B:20:0x00b1, B:22:0x00b5, B:23:0x00b8, B:12:0x0013, B:17:0x0086, B:16:0x006b, B:13:0x0060), top: B:31:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00b8 A[Catch: all -> 0x00bc, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:10:0x000f, B:19:0x00ae, B:24:0x00ba, B:20:0x00b1, B:22:0x00b5, B:23:0x00b8, B:12:0x0013, B:17:0x0086, B:16:0x006b, B:13:0x0060), top: B:31:0x0003, inners: #0 }] */
    private static OkHttpClient a(e eVar, boolean z) {
        OkHttpClient okHttpClient;
        synchronized (f) {
            if (f19678b == null || d == null || f19679c == null || e == null) {
                OkHttpClient.Builder builderProtocols = new OkHttpClient.Builder().connectionPool(new ConnectionPool(8, 10L, TimeUnit.MINUTES)).readTimeout(eVar.f19691c, TimeUnit.MILLISECONDS).connectTimeout(eVar.f19690b, TimeUnit.MILLISECONDS).protocols(Collections.unmodifiableList(Arrays.asList(Protocol.HTTP_2, Protocol.HTTP_1_1)));
                i iVarA = HttpCallerFactory.a();
                e = iVarA;
                iVarA.a(builderProtocols);
                HttpsConfig.a(builderProtocols, false, eVar.i);
                try {
                    builderProtocols.dispatcher(builderProtocols.createDispatcher(Protocol.HTTP_2));
                } catch (Throwable th) {
                    hw.c("OkHttpCaller", "create dispatcher error, " + th.getClass().getSimpleName());
                }
                f19678b = builderProtocols.build();
                f19679c = builderProtocols.dns(new l(eVar.h, true)).build();
                OkHttpClient.Builder builderNewBuilder = f19678b.newBuilder();
                HttpsConfig.a(builderNewBuilder, true, false);
                d = builderNewBuilder.build();
                if (z) {
                    okHttpClient = f19679c;
                } else if (eVar.g) {
                    okHttpClient = d;
                } else {
                    okHttpClient = f19678b;
                }
            } else if (z) {
                okHttpClient = f19679c;
            } else if (eVar.g) {
                okHttpClient = d;
            } else {
                okHttpClient = f19678b;
            }
            throw th;
        }
        return okHttpClient;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0353 A[Catch: all -> 0x03a2, PHI: r3 r4 r20 r23 r25
      0x0353: PHI (r3v9 okhttp3.Response) = (r3v8 okhttp3.Response), (r3v10 okhttp3.Response) binds: [B:182:0x03bc, B:160:0x0351] A[DONT_GENERATE, DONT_INLINE]
      0x0353: PHI (r4v10 long) = (r4v9 long), (r4v11 long) binds: [B:182:0x03bc, B:160:0x0351] A[DONT_GENERATE, DONT_INLINE]
      0x0353: PHI (r20v4 java.io.BufferedInputStream) = (r20v3 java.io.BufferedInputStream), (r20v5 java.io.BufferedInputStream) binds: [B:182:0x03bc, B:160:0x0351] A[DONT_GENERATE, DONT_INLINE]
      0x0353: PHI (r23v4 java.io.InputStream) = (r23v3 java.io.InputStream), (r23v5 java.io.InputStream) binds: [B:182:0x03bc, B:160:0x0351] A[DONT_GENERATE, DONT_INLINE]
      0x0353: PHI (r25v3 java.util.zip.GZIPInputStream) = (r25v2 java.util.zip.GZIPInputStream), (r25v4 java.util.zip.GZIPInputStream) binds: [B:182:0x03bc, B:160:0x0351] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x03a2, blocks: (B:159:0x032f, B:161:0x0353, B:183:0x03bd, B:168:0x036b, B:170:0x038c, B:171:0x0393, B:173:0x0399, B:180:0x03af), top: B:188:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x038c A[Catch: all -> 0x03a2, TryCatch #0 {all -> 0x03a2, blocks: (B:159:0x032f, B:161:0x0353, B:183:0x03bd, B:168:0x036b, B:170:0x038c, B:171:0x0393, B:173:0x0399, B:180:0x03af), top: B:188:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0399 A[Catch: all -> 0x03a2, TryCatch #0 {all -> 0x03a2, blocks: (B:159:0x032f, B:161:0x0353, B:183:0x03bd, B:168:0x036b, B:170:0x038c, B:171:0x0393, B:173:0x0399, B:180:0x03af), top: B:188:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x03bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x03d6: INVOKE (r20 I:java.io.Closeable) STATIC call: com.huawei.openalliance.ad.utils.df.a(java.io.Closeable):void A[MD:(java.io.Closeable):void (m)], block:B:186:0x03d0 */
    /* JADX WARN: Not initialized variable reg: 23, insn: 0x03d0: INVOKE (r23 I:java.io.Closeable) STATIC call: com.huawei.openalliance.ad.utils.df.a(java.io.Closeable):void A[MD:(java.io.Closeable):void (m)], block:B:186:0x03d0 */
    /* JADX WARN: Not initialized variable reg: 25, insn: 0x03d3: INVOKE (r25 I:java.io.Closeable) STATIC call: com.huawei.openalliance.ad.utils.df.a(java.io.Closeable):void A[MD:(java.io.Closeable):void (m)], block:B:186:0x03d0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable, okhttp3.Request$Builder] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    private Response a(e eVar, a aVar, boolean z) {
        int i;
        boolean z2;
        long j;
        Closeable closeableA;
        Closeable closeableA2;
        Closeable closeableA3;
        long j2;
        long j3;
        long jCurrentTimeMillis;
        okhttp3.Response response;
        boolean z3;
        int i2;
        String str;
        BufferedInputStream bufferedInputStream;
        InputStream inputStreamByteStream;
        GZIPInputStream gZIPInputStream;
        int i3;
        int i4;
        int i5;
        ?? r6;
        long j4;
        boolean z4;
        boolean z5;
        int i6;
        okhttp3.Response response2;
        okhttp3.Response response3;
        okhttp3.Response response4;
        okhttp3.Response response5;
        okhttp3.Response response6;
        long j5;
        int i7;
        String str2 = "http execute encounter %s - http code: %d";
        String str3 = "http execute encounter SSLConfigException";
        String strA = a(eVar, aVar);
        hw.b("OkHttpCaller", "execute url: %s", dg.h(strA));
        Response response7 = new Response();
        if (TextUtils.isEmpty(strA)) {
            hw.c("OkHttpCaller", "Server url is empty");
            return response7;
        }
        boolean z6 = aVar.j != null && aVar.j.length > 0;
        ?? Url = new Request.Builder().url(strA);
        a((Request.Builder) Url, aVar);
        if (z6) {
            a(aVar, (Request.Builder) Url);
            Url.post(RequestBody.create(MediaType.parse(c(aVar)), aVar.j));
        }
        try {
            try {
                try {
                    try {
                        Request requestBuild = Url.build();
                        try {
                            if (hw.a()) {
                                try {
                                    try {
                                        String strB = c.b(requestBuild.headers().toMultimap());
                                        try {
                                            boolean z7 = aVar.k;
                                            String str4 = z6 ? new String(aVar.j, "UTF-8") : null;
                                            Object[] objArr = new Object[4];
                                            objArr[0] = strA;
                                            objArr[1] = strB;
                                            i6 = 2;
                                            try {
                                                objArr[2] = Boolean.valueOf(z7);
                                                objArr[3] = str4;
                                                hw.a("OkHttpCaller", "execute, url:%s, headers:%s, bodyGzip:%s, body:%s", objArr);
                                            } catch (IOException e2) {
                                                e = e2;
                                                i = i6;
                                                z2 = true;
                                                j3 = 0;
                                                z3 = z2;
                                                jCurrentTimeMillis = j3;
                                                response = null;
                                                i2 = -1;
                                                z5 = z3;
                                                i5 = i2;
                                                j4 = jCurrentTimeMillis;
                                                bufferedInputStream = null;
                                                inputStreamByteStream = null;
                                                z4 = z5;
                                                gZIPInputStream = null;
                                                r6 = z4;
                                                Object[] objArr2 = new Object[i];
                                                objArr2[0] = e.getClass().getSimpleName();
                                                objArr2[r6] = Integer.valueOf(i5);
                                                hw.c("OkHttpCaller", str2, objArr2);
                                                j.a("OkHttpCaller", "http execute encounter IOException", e);
                                                response7.a((Throwable) e);
                                                if (j4 > 0) {
                                                    response7.a(j4, System.currentTimeMillis());
                                                }
                                                if (ag.a(e)) {
                                                    hw.c("OkHttpCaller", "dns error");
                                                    response7.a((boolean) r6);
                                                }
                                                df.a((Closeable) inputStreamByteStream);
                                                df.a((Closeable) gZIPInputStream);
                                                df.a((Closeable) bufferedInputStream);
                                                df.a(response);
                                                hw.b("OkHttpCaller", "end request");
                                                return response7;
                                            } catch (Throwable th) {
                                                th = th;
                                                i = i6;
                                                j2 = 0;
                                                jCurrentTimeMillis = j2;
                                                response = null;
                                                i4 = -1;
                                                i3 = i4;
                                                j = jCurrentTimeMillis;
                                                bufferedInputStream = null;
                                                inputStreamByteStream = null;
                                                gZIPInputStream = null;
                                                Object[] objArr3 = new Object[i];
                                                objArr3[0] = th.getClass().getSimpleName();
                                                objArr3[1] = Integer.valueOf(i3);
                                                hw.c("OkHttpCaller", str2, objArr3);
                                                j.a("OkHttpCaller", "http execute encounter Exception", th);
                                                response7.a(th);
                                                if (j > 0) {
                                                    response7.a(j, System.currentTimeMillis());
                                                }
                                                df.a((Closeable) inputStreamByteStream);
                                                df.a((Closeable) gZIPInputStream);
                                                df.a((Closeable) bufferedInputStream);
                                                df.a(response);
                                                hw.b("OkHttpCaller", "end request");
                                                return response7;
                                            }
                                        } catch (IOException e3) {
                                            e = e3;
                                            i6 = 2;
                                            i = i6;
                                            z2 = true;
                                            j3 = 0;
                                            z3 = z2;
                                            jCurrentTimeMillis = j3;
                                            response = null;
                                            i2 = -1;
                                            z5 = z3;
                                            i5 = i2;
                                            j4 = jCurrentTimeMillis;
                                            bufferedInputStream = null;
                                            inputStreamByteStream = null;
                                            z4 = z5;
                                            gZIPInputStream = null;
                                            r6 = z4;
                                            Object[] objArr4 = new Object[i];
                                            objArr4[0] = e.getClass().getSimpleName();
                                            objArr4[r6] = Integer.valueOf(i5);
                                            hw.c("OkHttpCaller", str2, objArr4);
                                            j.a("OkHttpCaller", "http execute encounter IOException", e);
                                            response7.a((Throwable) e);
                                            if (j4 > 0) {
                                                response7.a(j4, System.currentTimeMillis());
                                            }
                                            if (ag.a(e)) {
                                                hw.c("OkHttpCaller", "dns error");
                                                response7.a((boolean) r6);
                                            }
                                            df.a((Closeable) inputStreamByteStream);
                                            df.a((Closeable) gZIPInputStream);
                                            df.a((Closeable) bufferedInputStream);
                                            df.a(response);
                                            hw.b("OkHttpCaller", "end request");
                                            return response7;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        i6 = 2;
                                        i = i6;
                                        j2 = 0;
                                        jCurrentTimeMillis = j2;
                                        response = null;
                                        i4 = -1;
                                        i3 = i4;
                                        j = jCurrentTimeMillis;
                                        bufferedInputStream = null;
                                        inputStreamByteStream = null;
                                        gZIPInputStream = null;
                                        Object[] objArr5 = new Object[i];
                                        objArr5[0] = th.getClass().getSimpleName();
                                        objArr5[1] = Integer.valueOf(i3);
                                        hw.c("OkHttpCaller", str2, objArr5);
                                        j.a("OkHttpCaller", "http execute encounter Exception", th);
                                        response7.a(th);
                                        if (j > 0) {
                                            response7.a(j, System.currentTimeMillis());
                                        }
                                        df.a((Closeable) inputStreamByteStream);
                                        df.a((Closeable) gZIPInputStream);
                                        df.a((Closeable) bufferedInputStream);
                                        df.a(response);
                                        hw.b("OkHttpCaller", "end request");
                                        return response7;
                                    }
                                } catch (IOException e4) {
                                    e = e4;
                                    i = 2;
                                    z2 = true;
                                    j3 = 0;
                                    z3 = z2;
                                    jCurrentTimeMillis = j3;
                                    response = null;
                                    i2 = -1;
                                    z5 = z3;
                                    i5 = i2;
                                    j4 = jCurrentTimeMillis;
                                    bufferedInputStream = null;
                                    inputStreamByteStream = null;
                                    z4 = z5;
                                    gZIPInputStream = null;
                                    r6 = z4;
                                    Object[] objArr6 = new Object[i];
                                    objArr6[0] = e.getClass().getSimpleName();
                                    objArr6[r6] = Integer.valueOf(i5);
                                    hw.c("OkHttpCaller", str2, objArr6);
                                    j.a("OkHttpCaller", "http execute encounter IOException", e);
                                    response7.a((Throwable) e);
                                    if (j4 > 0) {
                                        response7.a(j4, System.currentTimeMillis());
                                    }
                                    if (ag.a(e)) {
                                        hw.c("OkHttpCaller", "dns error");
                                        response7.a((boolean) r6);
                                    }
                                    df.a((Closeable) inputStreamByteStream);
                                    df.a((Closeable) gZIPInputStream);
                                    df.a((Closeable) bufferedInputStream);
                                    df.a(response);
                                    hw.b("OkHttpCaller", "end request");
                                    return response7;
                                }
                            } else {
                                i6 = 2;
                            }
                            jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                okhttp3.Response responseExecute = a(eVar, z).newCall(requestBuild).execute();
                                try {
                                    try {
                                        if (hw.a()) {
                                            try {
                                                hw.a("OkHttpCaller", "okResponse: %s", responseExecute);
                                            } catch (IOException e5) {
                                                e = e5;
                                                i = 2;
                                                response = responseExecute;
                                                str2 = "http execute encounter %s - http code: %d";
                                                i2 = -1;
                                                z5 = true;
                                                i5 = i2;
                                                j4 = jCurrentTimeMillis;
                                                bufferedInputStream = null;
                                                inputStreamByteStream = null;
                                                z4 = z5;
                                                gZIPInputStream = null;
                                                r6 = z4;
                                                Object[] objArr7 = new Object[i];
                                                objArr7[0] = e.getClass().getSimpleName();
                                                objArr7[r6] = Integer.valueOf(i5);
                                                hw.c("OkHttpCaller", str2, objArr7);
                                                j.a("OkHttpCaller", "http execute encounter IOException", e);
                                                response7.a((Throwable) e);
                                                if (j4 > 0) {
                                                    response7.a(j4, System.currentTimeMillis());
                                                }
                                                if (ag.a(e)) {
                                                    hw.c("OkHttpCaller", "dns error");
                                                    response7.a((boolean) r6);
                                                }
                                                df.a((Closeable) inputStreamByteStream);
                                                df.a((Closeable) gZIPInputStream);
                                                df.a((Closeable) bufferedInputStream);
                                                df.a(response);
                                                hw.b("OkHttpCaller", "end request");
                                                return response7;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                i = 2;
                                                response = responseExecute;
                                                i4 = -1;
                                                i3 = i4;
                                                j = jCurrentTimeMillis;
                                                bufferedInputStream = null;
                                                inputStreamByteStream = null;
                                                gZIPInputStream = null;
                                                Object[] objArr8 = new Object[i];
                                                objArr8[0] = th.getClass().getSimpleName();
                                                objArr8[1] = Integer.valueOf(i3);
                                                hw.c("OkHttpCaller", str2, objArr8);
                                                j.a("OkHttpCaller", "http execute encounter Exception", th);
                                                response7.a(th);
                                                if (j > 0) {
                                                    response7.a(j, System.currentTimeMillis());
                                                }
                                                df.a((Closeable) inputStreamByteStream);
                                                df.a((Closeable) gZIPInputStream);
                                                df.a((Closeable) bufferedInputStream);
                                                df.a(response);
                                                hw.b("OkHttpCaller", "end request");
                                                return response7;
                                            }
                                        }
                                        ResponseBody responseBodyBody = responseExecute.body();
                                        response7.a(responseBodyBody.getContentLength());
                                        int iCode = responseExecute.code();
                                        try {
                                            if (8 == ag.a(iCode)) {
                                                response7.a(true);
                                            }
                                            response7.a(iCode);
                                            inputStreamByteStream = responseBodyBody.byteStream();
                                            try {
                                                response7.a(jCurrentTimeMillis, System.currentTimeMillis());
                                                boolean zA = a(responseExecute);
                                                if (hw.a()) {
                                                    response5 = responseExecute;
                                                    try {
                                                        hw.a("OkHttpCaller", "isGzipInput: %s", Boolean.valueOf(zA));
                                                    } catch (com.huawei.openalliance.ad.exception.d e6) {
                                                        e = e6;
                                                        response4 = response5;
                                                        response = response4;
                                                        str = "http execute encounter SSLConfigException";
                                                        j = jCurrentTimeMillis;
                                                        bufferedInputStream = null;
                                                        gZIPInputStream = null;
                                                        hw.c("OkHttpCaller", str);
                                                        j.a("OkHttpCaller", str, e);
                                                        response7.a((Throwable) e);
                                                        if (j > 0) {
                                                            response7.a(j, System.currentTimeMillis());
                                                        }
                                                        df.a((Closeable) inputStreamByteStream);
                                                        df.a((Closeable) gZIPInputStream);
                                                        df.a((Closeable) bufferedInputStream);
                                                        df.a(response);
                                                        hw.b("OkHttpCaller", "end request");
                                                        return response7;
                                                    } catch (IOException e7) {
                                                        e = e7;
                                                        response3 = response5;
                                                        inputStreamByteStream = inputStreamByteStream;
                                                        i = 2;
                                                        i5 = iCode;
                                                        response = response3;
                                                        str2 = "http execute encounter %s - http code: %d";
                                                        j4 = jCurrentTimeMillis;
                                                        z4 = true;
                                                        bufferedInputStream = null;
                                                        gZIPInputStream = null;
                                                        r6 = z4;
                                                        Object[] objArr9 = new Object[i];
                                                        objArr9[0] = e.getClass().getSimpleName();
                                                        objArr9[r6] = Integer.valueOf(i5);
                                                        hw.c("OkHttpCaller", str2, objArr9);
                                                        j.a("OkHttpCaller", "http execute encounter IOException", e);
                                                        response7.a((Throwable) e);
                                                        if (j4 > 0) {
                                                            response7.a(j4, System.currentTimeMillis());
                                                        }
                                                        if (ag.a(e)) {
                                                            hw.c("OkHttpCaller", "dns error");
                                                            response7.a((boolean) r6);
                                                        }
                                                        df.a((Closeable) inputStreamByteStream);
                                                        df.a((Closeable) gZIPInputStream);
                                                        df.a((Closeable) bufferedInputStream);
                                                        df.a(response);
                                                        hw.b("OkHttpCaller", "end request");
                                                        return response7;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        response2 = response5;
                                                        inputStreamByteStream = inputStreamByteStream;
                                                        str2 = "http execute encounter %s - http code: %d";
                                                        i = 2;
                                                        i3 = iCode;
                                                        response = response2;
                                                        j = jCurrentTimeMillis;
                                                        bufferedInputStream = null;
                                                        gZIPInputStream = null;
                                                        Object[] objArr10 = new Object[i];
                                                        objArr10[0] = th.getClass().getSimpleName();
                                                        objArr10[1] = Integer.valueOf(i3);
                                                        hw.c("OkHttpCaller", str2, objArr10);
                                                        j.a("OkHttpCaller", "http execute encounter Exception", th);
                                                        response7.a(th);
                                                        if (j > 0) {
                                                            response7.a(j, System.currentTimeMillis());
                                                        }
                                                        df.a((Closeable) inputStreamByteStream);
                                                        df.a((Closeable) gZIPInputStream);
                                                        df.a((Closeable) bufferedInputStream);
                                                        df.a(response);
                                                        hw.b("OkHttpCaller", "end request");
                                                        return response7;
                                                    }
                                                } else {
                                                    response5 = responseExecute;
                                                }
                                                GZIPInputStream gZIPInputStream2 = zA ? new GZIPInputStream(inputStreamByteStream) : null;
                                                try {
                                                    BufferedInputStream bufferedInputStream2 = gZIPInputStream2 != null ? new BufferedInputStream(gZIPInputStream2) : new BufferedInputStream(inputStreamByteStream);
                                                    try {
                                                        gZIPInputStream = gZIPInputStream2;
                                                        response6 = response5;
                                                        j5 = jCurrentTimeMillis;
                                                        i7 = iCode;
                                                        str2 = "http execute encounter %s - http code: %d";
                                                        i = 2;
                                                        inputStreamByteStream = inputStreamByteStream;
                                                        try {
                                                            long jA = a(eVar, aVar, iCode, bufferedInputStream2, response7.c(), response7);
                                                            response7.b(jA - j5);
                                                            response7.d(System.currentTimeMillis() - jA);
                                                            HttpConnection httpConnectionA = e.a(requestBuild);
                                                            httpConnectionA.a("dl-from", response6.header("dl-from"));
                                                            response7.a(httpConnectionA);
                                                            response7.b(aVar.k);
                                                            df.a((Closeable) inputStreamByteStream);
                                                            df.a((Closeable) gZIPInputStream);
                                                            df.a((Closeable) bufferedInputStream2);
                                                            df.a(response6);
                                                            hw.b("OkHttpCaller", "end request");
                                                            return response7;
                                                        } catch (com.huawei.openalliance.ad.exception.d e8) {
                                                            e = e8;
                                                            response = response6;
                                                            bufferedInputStream = bufferedInputStream2;
                                                            str = "http execute encounter SSLConfigException";
                                                            j = j5;
                                                            hw.c("OkHttpCaller", str);
                                                            j.a("OkHttpCaller", str, e);
                                                            response7.a((Throwable) e);
                                                            if (j > 0) {
                                                                response7.a(j, System.currentTimeMillis());
                                                            }
                                                            df.a((Closeable) inputStreamByteStream);
                                                            df.a((Closeable) gZIPInputStream);
                                                            df.a((Closeable) bufferedInputStream);
                                                            df.a(response);
                                                            hw.b("OkHttpCaller", "end request");
                                                            return response7;
                                                        } catch (IOException e9) {
                                                            e = e9;
                                                            i5 = i7;
                                                            response = response6;
                                                            bufferedInputStream = bufferedInputStream2;
                                                            str2 = str2;
                                                            j4 = j5;
                                                            r6 = 1;
                                                            Object[] objArr11 = new Object[i];
                                                            objArr11[0] = e.getClass().getSimpleName();
                                                            objArr11[r6] = Integer.valueOf(i5);
                                                            hw.c("OkHttpCaller", str2, objArr11);
                                                            j.a("OkHttpCaller", "http execute encounter IOException", e);
                                                            response7.a((Throwable) e);
                                                            if (j4 > 0) {
                                                                response7.a(j4, System.currentTimeMillis());
                                                            }
                                                            if (ag.a(e)) {
                                                                hw.c("OkHttpCaller", "dns error");
                                                                response7.a((boolean) r6);
                                                            }
                                                            df.a((Closeable) inputStreamByteStream);
                                                            df.a((Closeable) gZIPInputStream);
                                                            df.a((Closeable) bufferedInputStream);
                                                            df.a(response);
                                                            hw.b("OkHttpCaller", "end request");
                                                            return response7;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            i3 = i7;
                                                            response = response6;
                                                            bufferedInputStream = bufferedInputStream2;
                                                            j = j5;
                                                            Object[] objArr12 = new Object[i];
                                                            objArr12[0] = th.getClass().getSimpleName();
                                                            objArr12[1] = Integer.valueOf(i3);
                                                            hw.c("OkHttpCaller", str2, objArr12);
                                                            j.a("OkHttpCaller", "http execute encounter Exception", th);
                                                            response7.a(th);
                                                            if (j > 0) {
                                                                response7.a(j, System.currentTimeMillis());
                                                            }
                                                            df.a((Closeable) inputStreamByteStream);
                                                            df.a((Closeable) gZIPInputStream);
                                                            df.a((Closeable) bufferedInputStream);
                                                            df.a(response);
                                                            hw.b("OkHttpCaller", "end request");
                                                            return response7;
                                                        }
                                                    } catch (com.huawei.openalliance.ad.exception.d e10) {
                                                        e = e10;
                                                        gZIPInputStream = gZIPInputStream2;
                                                        j5 = jCurrentTimeMillis;
                                                        inputStreamByteStream = inputStreamByteStream;
                                                        response6 = response5;
                                                    } catch (IOException e11) {
                                                        e = e11;
                                                        response6 = response5;
                                                        gZIPInputStream = gZIPInputStream2;
                                                        j5 = jCurrentTimeMillis;
                                                        inputStreamByteStream = inputStreamByteStream;
                                                        i7 = iCode;
                                                        str2 = "http execute encounter %s - http code: %d";
                                                        i = 2;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        response6 = response5;
                                                        gZIPInputStream = gZIPInputStream2;
                                                        j5 = jCurrentTimeMillis;
                                                        inputStreamByteStream = inputStreamByteStream;
                                                        i7 = iCode;
                                                        str2 = "http execute encounter %s - http code: %d";
                                                        i = 2;
                                                    }
                                                } catch (com.huawei.openalliance.ad.exception.d e12) {
                                                    e = e12;
                                                    gZIPInputStream = gZIPInputStream2;
                                                    inputStreamByteStream = inputStreamByteStream;
                                                    response = response5;
                                                    str = "http execute encounter SSLConfigException";
                                                    j = jCurrentTimeMillis;
                                                    bufferedInputStream = null;
                                                } catch (IOException e13) {
                                                    e = e13;
                                                    gZIPInputStream = gZIPInputStream2;
                                                    inputStreamByteStream = inputStreamByteStream;
                                                    i = 2;
                                                    i5 = iCode;
                                                    response = response5;
                                                    str2 = "http execute encounter %s - http code: %d";
                                                    j4 = jCurrentTimeMillis;
                                                    r6 = 1;
                                                    bufferedInputStream = null;
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    gZIPInputStream = gZIPInputStream2;
                                                    inputStreamByteStream = inputStreamByteStream;
                                                    str2 = "http execute encounter %s - http code: %d";
                                                    i = 2;
                                                    i3 = iCode;
                                                    response = response5;
                                                    j = jCurrentTimeMillis;
                                                    bufferedInputStream = null;
                                                }
                                            } catch (com.huawei.openalliance.ad.exception.d e14) {
                                                e = e14;
                                                response4 = responseExecute;
                                            } catch (IOException e15) {
                                                e = e15;
                                                response3 = responseExecute;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                response2 = responseExecute;
                                            }
                                        } catch (IOException e16) {
                                            e = e16;
                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                            i = 2;
                                            i2 = iCode;
                                            response = responseExecute;
                                            str2 = "http execute encounter %s - http code: %d";
                                            z5 = true;
                                            i5 = i2;
                                            j4 = jCurrentTimeMillis;
                                            bufferedInputStream = null;
                                            inputStreamByteStream = null;
                                            z4 = z5;
                                            gZIPInputStream = null;
                                            r6 = z4;
                                            Object[] objArr13 = new Object[i];
                                            objArr13[0] = e.getClass().getSimpleName();
                                            objArr13[r6] = Integer.valueOf(i5);
                                            hw.c("OkHttpCaller", str2, objArr13);
                                            j.a("OkHttpCaller", "http execute encounter IOException", e);
                                            response7.a((Throwable) e);
                                            if (j4 > 0) {
                                                response7.a(j4, System.currentTimeMillis());
                                            }
                                            if (ag.a(e)) {
                                                hw.c("OkHttpCaller", "dns error");
                                                response7.a((boolean) r6);
                                            }
                                            df.a((Closeable) inputStreamByteStream);
                                            df.a((Closeable) gZIPInputStream);
                                            df.a((Closeable) bufferedInputStream);
                                            df.a(response);
                                            hw.b("OkHttpCaller", "end request");
                                            return response7;
                                        } catch (Throwable th9) {
                                            th = th9;
                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                            str2 = "http execute encounter %s - http code: %d";
                                            i = 2;
                                            i4 = iCode;
                                            response = responseExecute;
                                            i3 = i4;
                                            j = jCurrentTimeMillis;
                                            bufferedInputStream = null;
                                            inputStreamByteStream = null;
                                            gZIPInputStream = null;
                                            Object[] objArr14 = new Object[i];
                                            objArr14[0] = th.getClass().getSimpleName();
                                            objArr14[1] = Integer.valueOf(i3);
                                            hw.c("OkHttpCaller", str2, objArr14);
                                            j.a("OkHttpCaller", "http execute encounter Exception", th);
                                            response7.a(th);
                                            if (j > 0) {
                                                response7.a(j, System.currentTimeMillis());
                                            }
                                            df.a((Closeable) inputStreamByteStream);
                                            df.a((Closeable) gZIPInputStream);
                                            df.a((Closeable) bufferedInputStream);
                                            df.a(response);
                                            hw.b("OkHttpCaller", "end request");
                                            return response7;
                                        }
                                    } catch (com.huawei.openalliance.ad.exception.d e17) {
                                        e = e17;
                                        str3 = "http execute encounter SSLConfigException";
                                        response = responseExecute;
                                        j = jCurrentTimeMillis;
                                        str = str3;
                                        bufferedInputStream = null;
                                        inputStreamByteStream = null;
                                        gZIPInputStream = null;
                                        hw.c("OkHttpCaller", str);
                                        j.a("OkHttpCaller", str, e);
                                        response7.a((Throwable) e);
                                        if (j > 0) {
                                            response7.a(j, System.currentTimeMillis());
                                        }
                                        df.a((Closeable) inputStreamByteStream);
                                        df.a((Closeable) gZIPInputStream);
                                        df.a((Closeable) bufferedInputStream);
                                        df.a(response);
                                        hw.b("OkHttpCaller", "end request");
                                        return response7;
                                    }
                                } catch (IOException e18) {
                                    e = e18;
                                    i = i6;
                                } catch (Throwable th10) {
                                    th = th10;
                                    i = i6;
                                }
                            } catch (com.huawei.openalliance.ad.exception.d e19) {
                                e = e19;
                                j = jCurrentTimeMillis;
                                response = null;
                                str = str3;
                                bufferedInputStream = null;
                                inputStreamByteStream = null;
                                gZIPInputStream = null;
                                hw.c("OkHttpCaller", str);
                                j.a("OkHttpCaller", str, e);
                                response7.a((Throwable) e);
                                if (j > 0) {
                                    response7.a(j, System.currentTimeMillis());
                                }
                                df.a((Closeable) inputStreamByteStream);
                                df.a((Closeable) gZIPInputStream);
                                df.a((Closeable) bufferedInputStream);
                                df.a(response);
                                hw.b("OkHttpCaller", "end request");
                                return response7;
                            } catch (IOException e20) {
                                e = e20;
                                i = i6;
                                str2 = "http execute encounter %s - http code: %d";
                                j3 = jCurrentTimeMillis;
                                z3 = true;
                                jCurrentTimeMillis = j3;
                                response = null;
                                i2 = -1;
                                z5 = z3;
                                i5 = i2;
                                j4 = jCurrentTimeMillis;
                                bufferedInputStream = null;
                                inputStreamByteStream = null;
                                z4 = z5;
                                gZIPInputStream = null;
                                r6 = z4;
                                Object[] objArr15 = new Object[i];
                                objArr15[0] = e.getClass().getSimpleName();
                                objArr15[r6] = Integer.valueOf(i5);
                                hw.c("OkHttpCaller", str2, objArr15);
                                j.a("OkHttpCaller", "http execute encounter IOException", e);
                                response7.a((Throwable) e);
                                if (j4 > 0) {
                                    response7.a(j4, System.currentTimeMillis());
                                }
                                if (ag.a(e)) {
                                    hw.c("OkHttpCaller", "dns error");
                                    response7.a((boolean) r6);
                                }
                                df.a((Closeable) inputStreamByteStream);
                                df.a((Closeable) gZIPInputStream);
                                df.a((Closeable) bufferedInputStream);
                                df.a(response);
                                hw.b("OkHttpCaller", "end request");
                                return response7;
                            } catch (Throwable th11) {
                                th = th11;
                                str2 = "http execute encounter %s - http code: %d";
                                i = i6;
                                j2 = jCurrentTimeMillis;
                                jCurrentTimeMillis = j2;
                                response = null;
                                i4 = -1;
                                i3 = i4;
                                j = jCurrentTimeMillis;
                                bufferedInputStream = null;
                                inputStreamByteStream = null;
                                gZIPInputStream = null;
                                Object[] objArr16 = new Object[i];
                                objArr16[0] = th.getClass().getSimpleName();
                                objArr16[1] = Integer.valueOf(i3);
                                hw.c("OkHttpCaller", str2, objArr16);
                                j.a("OkHttpCaller", "http execute encounter Exception", th);
                                response7.a(th);
                                if (j > 0) {
                                    response7.a(j, System.currentTimeMillis());
                                }
                                df.a((Closeable) inputStreamByteStream);
                                df.a((Closeable) gZIPInputStream);
                                df.a((Closeable) bufferedInputStream);
                                df.a(response);
                                hw.b("OkHttpCaller", "end request");
                                return response7;
                            }
                        } catch (IOException e21) {
                            e = e21;
                            i = 2;
                        }
                    } catch (Throwable th12) {
                        df.a(closeableA);
                        df.a(closeableA2);
                        df.a(closeableA3);
                        df.a((Closeable) Url);
                        hw.b("OkHttpCaller", "end request");
                        throw th12;
                    }
                } catch (com.huawei.openalliance.ad.exception.d e22) {
                    e = e22;
                    j = 0;
                }
            } catch (IOException e23) {
                e = e23;
                z2 = true;
                i = 2;
            }
        } catch (Throwable th13) {
            th = th13;
            i = 2;
        }
    }

    OkHttpCaller(Context context) {
        super(context);
    }
}
