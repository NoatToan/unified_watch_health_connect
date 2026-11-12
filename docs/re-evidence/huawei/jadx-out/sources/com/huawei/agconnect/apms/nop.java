package com.huawei.agconnect.apms;

import android.text.TextUtils;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.HttpEntityWrapper;

/* JADX INFO: loaded from: classes22.dex */
public final class nop {
    public static final AgentLog abc = AgentLogManager.getAgentLog();

    public static HttpUriRequest abc(HttpUriRequest httpUriRequest, b bVar) {
        try {
            bVar.lmn(httpUriRequest.getURI().toString());
            bVar.efg(httpUriRequest.getMethod());
            bVar.cde(System.currentTimeMillis());
            bVar.bcd(4);
            if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
                HttpEntityEnclosingRequest httpEntityEnclosingRequest = (HttpEntityEnclosingRequest) httpUriRequest;
                if (httpEntityEnclosingRequest.getEntity() != null) {
                    httpEntityEnclosingRequest.setEntity(new z(httpEntityEnclosingRequest.getEntity(), bVar));
                    return httpUriRequest;
                }
            }
        } catch (Throwable th) {
            def.abc(th, abc.abc("failed to get request info: "), abc);
        }
        return httpUriRequest;
    }

    public static HttpRequest abc(HttpHost httpHost, HttpRequest httpRequest, b bVar) {
        try {
            RequestLine requestLine = httpRequest.getRequestLine();
            if (requestLine != null) {
                bVar.lmn(requestLine.getUri());
                bVar.efg(requestLine.getMethod());
            } else if (httpHost != null) {
                bVar.lmn(httpHost.toURI());
            }
            bVar.cde(System.currentTimeMillis());
            bVar.bcd(4);
            if (httpRequest instanceof HttpEntityEnclosingRequest) {
                HttpEntityEnclosingRequest httpEntityEnclosingRequest = (HttpEntityEnclosingRequest) httpRequest;
                if (httpEntityEnclosingRequest.getEntity() != null) {
                    httpEntityEnclosingRequest.setEntity(new z(httpEntityEnclosingRequest.getEntity(), bVar));
                    return httpRequest;
                }
            }
        } catch (Throwable th) {
            def.abc(th, abc.abc("failed to get http host info: "), abc);
        }
        return httpRequest;
    }

    public static String abc(String str, HttpResponse httpResponse, String str2) {
        try {
            Header[] headers = httpResponse.getHeaders(str);
            if (headers != null && headers.length > 0 && headers[0].getValue() != null) {
                return headers[0].getValue();
            }
        } catch (Throwable unused) {
        }
        return str2;
    }

    public static HttpResponse abc(HttpResponse httpResponse, b bVar) {
        long j;
        try {
            String strAbc = Agent.getAgentConfiguration().abc();
            if (TextUtils.isEmpty(strAbc)) {
                strAbc = "dl-from";
            }
            if (!TextUtils.isEmpty(strAbc)) {
                bVar.abc(abc(strAbc, httpResponse, ""));
            }
            if (httpResponse.getStatusLine() != null) {
                bVar.cde(httpResponse.getStatusLine().getStatusCode());
            }
            bVar.bcd(abc("Content-Type", httpResponse, ""));
            try {
                j = Long.parseLong(abc("Content-Length", httpResponse, ""));
            } catch (Throwable unused) {
                j = 0;
            }
            bVar.def(j);
            if (Agent.isNuwaTracerEnable()) {
                bVar.pqr(abc("network-in", httpResponse, ""));
                bVar.qrs(abc("network-out", httpResponse, ""));
                bVar.mno(abc(HeaderType.X_NUWA_SAMPLE_STATE, httpResponse, "0"));
                bVar.rst(abc(HeaderType.X_NUWA_CALL_SEQ, httpResponse, ""));
            }
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                if (entity instanceof HttpEntityWrapper) {
                    httpResponse.setEntity(new i0(httpResponse, bVar));
                } else {
                    httpResponse.setEntity(new h0(httpResponse, bVar));
                }
                bVar.k();
                d.abc((Object) bVar);
            } else {
                bVar.abc(0L);
                abc(bVar);
            }
        } catch (Throwable th) {
            def.abc(th, abc.abc("failed to get cdn info: "), abc);
        }
        return httpResponse;
    }

    public static void abc(b bVar, Exception exc) {
        bVar.cde(0);
        if (exc != null) {
            bVar.def(exc.toString());
        }
        abc(bVar);
    }

    public static void abc(b bVar) {
        if (bVar == null) {
            return;
        }
        if (bVar.c()) {
            bVar.qpo = v0.abc();
        }
        if (bVar.fed()) {
            return;
        }
        bVar.k();
        a aVarN = bVar.n();
        if (aVarN != null) {
            HttpEvent httpEvent = new HttpEvent(aVarN, "");
            bVar.l();
            pon.cde.add(httpEvent);
        }
    }
}
