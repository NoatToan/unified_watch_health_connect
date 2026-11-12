package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.base.common.MediaType;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import com.huawei.operation.utils.Constants;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes34.dex */
public class e4 implements d1 {
    public static final String g = "URLConnectionRequestTask";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f4 f14721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h1.d f14722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HttpURLConnection f14723c;
    public c4 d = new c4();
    public volatile boolean e;
    public boolean f;

    @Override // com.huawei.hms.network.embedded.d1
    public e3 getConnectionInfo() {
        return null;
    }

    @Override // com.huawei.hms.network.embedded.d1
    public void setRcEventListener(z2 z2Var) {
    }

    @Override // com.huawei.hms.network.embedded.d1
    public h1.d request() {
        return this.f14722b;
    }

    @Override // com.huawei.hms.network.embedded.d1
    public boolean isExecuted() {
        boolean z;
        synchronized (this) {
            z = this.f;
        }
        return z;
    }

    @Override // com.huawei.hms.network.embedded.d1
    public boolean isCanceled() {
        return this.e;
    }

    @Override // com.huawei.hms.network.embedded.d1
    public RequestFinishedInfo getRequestFinishedInfo() {
        return this.d.getRequestFinishedInfo();
    }

    @Override // com.huawei.hms.network.embedded.d1
    public h1.f<ResponseBody> execute(h1.d dVar, WebSocket webSocket) throws Exception {
        Logger.i(g, "the request has used the URLConnection!");
        if (webSocket != null) {
            Logger.w(g, "URLConnection can't use websocket");
            throw t0.d("URLConnection can't use websocket");
        }
        this.d.a(dVar.getUrl());
        try {
            synchronized (this) {
                if (this.f) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f = true;
            }
            if (this.e) {
                throw t0.a("Canceled");
            }
            this.f14722b = dVar;
            this.f14723c = a(this.d, dVar);
            if (this.e) {
                this.f14723c.disconnect();
                throw t0.a("Canceled");
            }
            h1.f<ResponseBody> fVar = new h1.f<>(a(this.d, this.f14723c));
            this.d.a(fVar);
            return fVar;
        } catch (Exception e) {
            this.d.a(e);
            throw e;
        }
    }

    @Override // com.huawei.hms.network.embedded.d1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public d1 m1384clone() {
        return new e4(this.f14721a);
    }

    @Override // com.huawei.hms.network.embedded.d1
    public void cancel() {
        this.e = true;
    }

    private void a(HttpURLConnection httpURLConnection, Headers headers) {
        if (httpURLConnection == null || headers == null) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < headers.size(); i++) {
            String strName = headers.name(i);
            httpURLConnection.addRequestProperty(strName, headers.value(i));
            if (!z && StringUtils.toLowerCase(strName).equals(FeedbackWebConstants.USER_AGENT)) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        httpURLConnection.addRequestProperty("User-Agent", j1.getUserAgent(ContextHolder.getAppContext()));
    }

    private Map<String, List<String>> a(Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            map2.put(TextUtils.isEmpty(entry.getKey()) ? Constants.NULL : entry.getKey(), entry.getValue());
        }
        return map2;
    }

    private HttpURLConnection a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) (this.f14721a.getProxy() != null ? url.openConnection(this.f14721a.getProxy()) : url.openConnection());
        if (!(httpURLConnection instanceof HttpsURLConnection)) {
            return httpURLConnection;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
        httpsURLConnection.setSSLSocketFactory(this.f14721a.getSslSocketFactory());
        httpsURLConnection.setHostnameVerifier(this.f14721a.getHostnameVerifier());
        return httpsURLConnection;
    }

    private HttpURLConnection a(c4 c4Var, h1.d dVar) throws IOException {
        URL url = new URL(dVar.getUrl());
        c4Var.b(url.getHost());
        HttpURLConnection httpURLConnectionA = a(url);
        c4Var.a(url.getHost(), "", "", this);
        c4Var.c();
        a(httpURLConnectionA, Headers.of(dVar.getHeaders()));
        httpURLConnectionA.setConnectTimeout(dVar.getNetConfig().getConnectTimeout());
        httpURLConnectionA.setReadTimeout(dVar.getNetConfig().getReadTimeout());
        httpURLConnectionA.setDoInput(true);
        httpURLConnectionA.setRequestMethod(dVar.getMethod());
        c4Var.b();
        if (dVar.getBody() == null) {
            return httpURLConnectionA;
        }
        c4Var.a();
        httpURLConnectionA.setDoOutput(true);
        httpURLConnectionA.setRequestProperty("Content-Type", dVar.getBody().contentType());
        OutputStream outputStream = null;
        try {
            if (dVar.getBody().contentLength() != -1) {
                httpURLConnectionA.setFixedLengthStreamingMode((int) dVar.getBody().contentLength());
            }
            Logger.i(g, "maybe you should override the RequestBody's contentLength() ");
            outputStream = httpURLConnectionA.getOutputStream();
            dVar.getBody().writeTo(outputStream);
            outputStream.flush();
            return httpURLConnectionA;
        } finally {
            IoUtils.closeSecure(outputStream);
        }
    }

    private Response<ResponseBody> a(c4 c4Var, HttpURLConnection httpURLConnection) throws IOException {
        int responseCode = httpURLConnection.getResponseCode();
        if (this.e) {
            httpURLConnection.disconnect();
            throw t0.a("Canceled");
        }
        c4Var.e();
        u0.b bVar = new u0.b();
        Map<String, List<String>> mapA = a(httpURLConnection.getHeaderFields());
        c4Var.a(mapA);
        c4Var.d();
        f1.b bVar2 = new f1.b();
        String contentType = httpURLConnection.getContentType();
        String url = null;
        MediaType mediaType = contentType != null ? MediaType.parse(contentType) : null;
        bVar2.inputStream(responseCode >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream()).contentLength(httpURLConnection.getContentLength()).contentType(contentType).charSet(mediaType != null ? mediaType.charset() : null);
        f1 f1VarBuild = bVar2.build();
        c4Var.b(f1VarBuild.getContentLength());
        if (this.f14722b != null) {
            url = httpURLConnection.getURL() == null ? this.f14722b.getUrl() : httpURLConnection.getURL().toString();
        }
        bVar.body(new h1.g(f1VarBuild)).code(responseCode).message(httpURLConnection.getResponseMessage()).url(url).headers(mapA);
        if (!this.e) {
            return bVar.build();
        }
        httpURLConnection.disconnect();
        throw t0.a("Canceled");
    }

    public e4(f4 f4Var) {
        this.f14721a = f4Var;
    }
}
