package com.huawei.openalliance.ad.net.http;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.network.base.common.RequestBodyProviders;
import com.huawei.hms.network.base.common.trans.FileBinary;
import com.huawei.hms.network.embedded.j2;
import com.huawei.hms.network.embedded.w;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.openalliance.ad.cd;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.ag;
import com.huawei.openalliance.ad.utils.cb;
import com.huawei.openalliance.ad.utils.df;
import com.huawei.openalliance.ad.utils.dg;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class k extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HttpClient f19703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HttpClient f19704c;
    private static final byte[] d = new byte[0];

    /* JADX WARN: Code duplicated, block: B:106:0x0225 A[Catch: all -> 0x026d, PHI: r4 r6 r13
      0x0225: PHI (r4v7 java.io.InputStream) = (r4v6 java.io.InputStream), (r4v8 java.io.InputStream) binds: [B:122:0x027e, B:105:0x0223] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r6v2 java.io.InputStream) = (r6v1 java.io.InputStream), (r6v3 java.io.InputStream) binds: [B:122:0x027e, B:105:0x0223] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r13v4 long) = (r13v3 long), (r13v5 long) binds: [B:122:0x027e, B:105:0x0223] A[DONT_GENERATE, DONT_INLINE], TryCatch #8 {all -> 0x026d, blocks: (B:104:0x0205, B:106:0x0225, B:123:0x027f, B:109:0x022e, B:111:0x0253, B:112:0x025a, B:114:0x0260, B:115:0x0269, B:120:0x0272), top: B:130:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0253 A[Catch: all -> 0x026d, TryCatch #8 {all -> 0x026d, blocks: (B:104:0x0205, B:106:0x0225, B:123:0x027f, B:109:0x022e, B:111:0x0253, B:112:0x025a, B:114:0x0260, B:115:0x0269, B:120:0x0272), top: B:130:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0260 A[Catch: all -> 0x026d, TryCatch #8 {all -> 0x026d, blocks: (B:104:0x0205, B:106:0x0225, B:123:0x027f, B:109:0x022e, B:111:0x0253, B:112:0x025a, B:114:0x0260, B:115:0x0269, B:120:0x0272), top: B:130:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:122:0x027e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.huawei.hms.network.httpclient.Request, java.io.Closeable] */
    @Override // com.huawei.openalliance.ad.net.http.h
    public Response b(e eVar, a aVar) {
        Submit submit;
        InputStream inputStream;
        InputStream inputStream2;
        int i;
        InputStream inputStream3;
        Response response = new Response();
        HttpClient httpClientB = b(eVar);
        if (httpClientB == 0) {
            hw.c("NetworkKitCaller", "create httpClient failed.");
            return response;
        }
        String strA = a(eVar, aVar);
        hw.b("NetworkKitCaller", "execute url: %s", dg.h(strA));
        if (TextUtils.isEmpty(strA)) {
            hw.c("NetworkKitCaller", "Server url is empty");
            return response;
        }
        boolean z = aVar.j != null && aVar.j.length > 0;
        Request.Builder builderNewRequest = httpClientB.newRequest();
        builderNewRequest.method(aVar.e);
        builderNewRequest.url(strA);
        a(builderNewRequest, aVar, z);
        if (z) {
            builderNewRequest.requestBody(RequestBodyProviders.create(c(aVar), aVar.j));
        }
        ?? Build = builderNewRequest.removeHeader(j2.v).build();
        InputStream inputStream4 = null;
        if (hw.a()) {
            hw.a("NetworkKitCaller", "execute, url:%s, headers:%s, bodyGzip:%s, body:%s", strA, c.b(Build.getHeaders()), Boolean.valueOf(aVar.k), z ? new String(aVar.j, "UTF-8") : null);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = -1;
        try {
            try {
                try {
                    try {
                        Submit submitNewSubmit = httpClientB.newSubmit(Build);
                        try {
                            com.huawei.hms.network.httpclient.Response<ResponseBody> responseExecute = submitNewSubmit.execute();
                            int code = responseExecute.getCode();
                            try {
                                hw.b("NetworkKitCaller", "httpclient_execute response code: " + code);
                                ResponseBody body = responseExecute.getBody();
                                if (8 == ag.a(code)) {
                                    try {
                                        response.a(true);
                                    } catch (IOException e) {
                                        e = e;
                                        i2 = code;
                                        inputStream = null;
                                    } catch (Throwable th) {
                                        th = th;
                                        i2 = code;
                                        code = i2;
                                        inputStream = null;
                                        hw.c("NetworkKitCaller", "http execute encounter %s - http code: %d", th.getClass().getSimpleName(), Integer.valueOf(code));
                                        response.a(th);
                                        if (jCurrentTimeMillis > 0) {
                                            response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                        }
                                        df.a((Closeable) inputStream);
                                        df.a((Closeable) inputStream4);
                                        hw.b("NetworkKitCaller", "end request");
                                        return response;
                                    }
                                }
                                response.a(code);
                                response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                if (body == null) {
                                    hw.c("NetworkKitCaller", "response error, no response body");
                                    df.a((Closeable) null);
                                    df.a((Closeable) null);
                                    hw.b("NetworkKitCaller", "end request");
                                    return response;
                                }
                                response.a(body.getContentLength());
                                inputStream = body.getInputStream();
                                try {
                                    boolean zA = a(responseExecute);
                                    if (hw.a()) {
                                        try {
                                            hw.a("NetworkKitCaller", "isGzipInput: %s", Boolean.valueOf(zA));
                                        } catch (com.huawei.openalliance.ad.exception.d e2) {
                                            e = e2;
                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                            hw.c("NetworkKitCaller", "http execute encounter SSLConfigException");
                                            response.a(e);
                                            if (jCurrentTimeMillis > 0) {
                                                response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                            }
                                            df.a((Closeable) inputStream);
                                            df.a((Closeable) inputStream4);
                                            hw.b("NetworkKitCaller", "end request");
                                            return response;
                                        } catch (IOException e3) {
                                            e = e3;
                                            i2 = code;
                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                            hw.c("NetworkKitCaller", "http execute encounter %s - http code: %d", th.getClass().getSimpleName(), Integer.valueOf(code));
                                            response.a(th);
                                            if (jCurrentTimeMillis > 0) {
                                                response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                            }
                                            df.a((Closeable) inputStream);
                                            df.a((Closeable) inputStream4);
                                            hw.b("NetworkKitCaller", "end request");
                                            return response;
                                        }
                                    }
                                    InputStream bufferedInputStream = new BufferedInputStream(inputStream);
                                    try {
                                        inputStream3 = bufferedInputStream;
                                        inputStream2 = inputStream;
                                        i = code;
                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                        try {
                                            long jA = a(eVar, aVar, code, inputStream3, response.c(), response);
                                            response.b(jA - jCurrentTimeMillis);
                                            response.d(System.currentTimeMillis() - jA);
                                            response.b(aVar.k);
                                            RequestFinishedInfo requestFinishedInfo = submitNewSubmit.getRequestFinishedInfo();
                                            if (requestFinishedInfo != null && requestFinishedInfo.getMetrics() != null) {
                                                hw.b("NetworkKitCaller", "req protocol: %s", requestFinishedInfo.getMetrics().getProtocol());
                                                hw.a("NetworkKitCaller", "req url: %s", requestFinishedInfo.getUrl());
                                                hw.a("NetworkKitCaller", "req delay: %s", Long.valueOf(requestFinishedInfo.getMetricsTime() == null ? -1L : requestFinishedInfo.getMetricsTime().getTotalTime()));
                                            }
                                            df.a((Closeable) inputStream2);
                                            df.a((Closeable) inputStream3);
                                            hw.b("NetworkKitCaller", "end request");
                                            return response;
                                        } catch (com.huawei.openalliance.ad.exception.d e4) {
                                            e = e4;
                                            inputStream4 = inputStream3;
                                            inputStream = inputStream2;
                                            hw.c("NetworkKitCaller", "http execute encounter SSLConfigException");
                                            response.a(e);
                                            if (jCurrentTimeMillis > 0) {
                                                response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                            }
                                            df.a((Closeable) inputStream);
                                            df.a((Closeable) inputStream4);
                                            hw.b("NetworkKitCaller", "end request");
                                            return response;
                                        } catch (IOException e5) {
                                            e = e5;
                                            inputStream4 = inputStream3;
                                            submit = submitNewSubmit;
                                            inputStream = inputStream2;
                                            i2 = i;
                                            hw.c("NetworkKitCaller", "http execute encounter IOException: %s - http code: %d", e.getClass().getSimpleName(), Integer.valueOf(i2));
                                            j.a("NetworkKitCaller", "http execute encounter IOException", e);
                                            response.a((Throwable) e);
                                            if (jCurrentTimeMillis > 0) {
                                                response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                            }
                                            if (ag.a(e)) {
                                                hw.c("NetworkKitCaller", "dns error");
                                                response.a(true);
                                            }
                                            a(submit);
                                            df.a((Closeable) inputStream);
                                            df.a((Closeable) inputStream4);
                                            hw.b("NetworkKitCaller", "end request");
                                            return response;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            inputStream4 = inputStream3;
                                            inputStream = inputStream2;
                                            code = i;
                                            hw.c("NetworkKitCaller", "http execute encounter %s - http code: %d", th.getClass().getSimpleName(), Integer.valueOf(code));
                                            response.a(th);
                                            if (jCurrentTimeMillis > 0) {
                                                response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                            }
                                            df.a((Closeable) inputStream);
                                            df.a((Closeable) inputStream4);
                                            hw.b("NetworkKitCaller", "end request");
                                            return response;
                                        }
                                    } catch (com.huawei.openalliance.ad.exception.d e6) {
                                        e = e6;
                                        inputStream3 = bufferedInputStream;
                                        inputStream2 = inputStream;
                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                    } catch (IOException e7) {
                                        e = e7;
                                        inputStream3 = bufferedInputStream;
                                        inputStream2 = inputStream;
                                        i = code;
                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        inputStream3 = bufferedInputStream;
                                        inputStream2 = inputStream;
                                        i = code;
                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                    }
                                } catch (com.huawei.openalliance.ad.exception.d e8) {
                                    e = e8;
                                    inputStream2 = inputStream;
                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                } catch (IOException e9) {
                                    e = e9;
                                    inputStream2 = inputStream;
                                    i = code;
                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStream2 = inputStream;
                                    i = code;
                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                }
                            } catch (IOException e10) {
                                e = e10;
                                i2 = code;
                                inputStream = null;
                            } catch (Throwable th6) {
                                th = th6;
                                i2 = code;
                                code = i2;
                                inputStream = null;
                                hw.c("NetworkKitCaller", "http execute encounter %s - http code: %d", th.getClass().getSimpleName(), Integer.valueOf(code));
                                response.a(th);
                                if (jCurrentTimeMillis > 0) {
                                    response.a(jCurrentTimeMillis, System.currentTimeMillis());
                                }
                                df.a((Closeable) inputStream);
                                df.a((Closeable) inputStream4);
                                hw.b("NetworkKitCaller", "end request");
                                return response;
                            }
                        } catch (IOException e11) {
                            e = e11;
                        }
                        submit = submitNewSubmit;
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (com.huawei.openalliance.ad.exception.d e12) {
                    e = e12;
                    jCurrentTimeMillis = jCurrentTimeMillis;
                    inputStream = null;
                }
            } catch (IOException e13) {
                e = e13;
                jCurrentTimeMillis = jCurrentTimeMillis;
                submit = null;
                inputStream = null;
            }
            hw.c("NetworkKitCaller", "http execute encounter IOException: %s - http code: %d", e.getClass().getSimpleName(), Integer.valueOf(i2));
            j.a("NetworkKitCaller", "http execute encounter IOException", e);
            response.a((Throwable) e);
            if (jCurrentTimeMillis > 0) {
                response.a(jCurrentTimeMillis, System.currentTimeMillis());
            }
            if (ag.a(e)) {
                hw.c("NetworkKitCaller", "dns error");
                response.a(true);
            }
            a(submit);
            df.a((Closeable) inputStream);
            df.a((Closeable) inputStream4);
            hw.b("NetworkKitCaller", "end request");
            return response;
        } catch (Throwable th8) {
            df.a((Closeable) Build);
            df.a((Closeable) null);
            hw.b("NetworkKitCaller", "end request");
            throw th8;
        }
    }

    public void a(e eVar) {
        Log.i("NetworkKitCaller", "preCreateHttpClient.");
        try {
            b(eVar);
        } catch (Throwable th) {
            hw.c("NetworkKitCaller", "preCreateHttpClient error: %s", th.getClass().getSimpleName());
        }
    }

    public void a(Submit submit) {
        RequestFinishedInfo requestFinishedInfo;
        RequestFinishedInfo.Metrics metrics;
        if (submit == null || (requestFinishedInfo = submit.getRequestFinishedInfo()) == null || (metrics = requestFinishedInfo.getMetrics()) == null) {
            return;
        }
        hw.b("NetworkKitCaller", "DnsType: %s", metrics.getDnsType());
        if (w.l.equalsIgnoreCase(metrics.getDnsType()) || "HTTPDNS".equalsIgnoreCase(metrics.getDnsType())) {
            hw.b("NetworkKitCaller", "grs forceExpire");
            cd.a(this.f19686a).b();
        }
    }

    private HttpClient b(e eVar) {
        synchronized (d) {
            if (f19703b == null || f19704c == null) {
                HttpClient.Builder builderEnableQuic = cb.a(this.f19686a, eVar.j).readTimeout(eVar.f19691c).connectTimeout(eVar.f19690b).enableQuic(eVar.j);
                HttpsConfig.a(builderEnableQuic, false, eVar.i);
                f19703b = builderEnableQuic.build();
                HttpClient.Builder builderEnableQuic2 = cb.a(this.f19686a, eVar.j).readTimeout(eVar.f19691c).connectTimeout(eVar.f19690b).enableQuic(eVar.j);
                HttpsConfig.a(builderEnableQuic2, true, false);
                f19704c = builderEnableQuic2.build();
            }
        }
        return eVar.g ? f19704c : f19703b;
    }

    private boolean a(com.huawei.hms.network.httpclient.Response<ResponseBody> response) {
        Map<String, List<String>> headers = response.getHeaders();
        if (headers == null || headers.size() <= 0) {
            return false;
        }
        List<String> list = headers.get("Content-Encoding");
        if (list == null) {
            list = headers.get("Content-Encoding".toLowerCase(Locale.ENGLISH));
        }
        if (list == null) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (Constants.GZIP.equalsIgnoreCase(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    private void a(Request.Builder builder, a aVar, boolean z) {
        String str;
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
        if (z) {
            if (aVar.k) {
                builder.addHeader("Content-Encoding", Constants.GZIP);
            }
            if (!a(aVar)) {
                if (aVar.g != null) {
                    hw.a("NetworkKitCaller", "content type: %s", aVar.g);
                    str = aVar.g;
                }
                if (aVar.j != null) {
                    builder.addHeader("Content-Length", String.valueOf(aVar.j.length));
                }
            }
            hw.a("NetworkKitCaller", "content type stream.");
            builder.removeHeader("Content-Type");
            str = FileBinary.HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM;
            builder.addHeader("Content-Type", str);
            if (aVar.j != null) {
                builder.addHeader("Content-Length", String.valueOf(aVar.j.length));
            }
        }
    }

    public k(Context context) {
        super(context);
    }
}
