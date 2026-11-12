package com.huawei.agconnect.apms.instrument.apacheclient;

import android.text.TextUtils;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.b;
import com.huawei.agconnect.apms.bcd;
import com.huawei.agconnect.apms.c;
import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.j0;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.nop;
import com.huawei.agconnect.apms.o;
import java.io.IOException;
import java.net.URL;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes22.dex */
public class ApacheClientInstrumentation {
    private static final AgentLog LOG = AgentLogManager.getAgentLog();

    private static void addNuwaTraceIdToHeaderAndEvent(HttpRequest httpRequest, b bVar) {
        String strBcd = o.bcd();
        String strAbc = o.abc();
        if (Agent.isNuwaTracerEnable()) {
            if (TextUtils.isEmpty(getInfoFromRequestHeaders("net-msg-id", httpRequest))) {
                httpRequest.addHeader("net-msg-id", strBcd);
            }
            if (TextUtils.isEmpty(getInfoFromRequestHeaders(HeaderType.X_NUWA_SPAN_ID, httpRequest))) {
                httpRequest.addHeader(HeaderType.X_NUWA_SPAN_ID, strAbc);
            }
            if (TextUtils.isEmpty(getInfoFromRequestHeaders(HeaderType.X_NUWA_MICROSERVICE_NAME, httpRequest))) {
                httpRequest.addHeader(HeaderType.X_NUWA_MICROSERVICE_NAME, HiAnalyticsManager.APM_EVENT_ID);
            }
            bVar.opq(strBcd);
            bVar.nop(strAbc);
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        if (Agent.isDisabled()) {
            return (T) httpClient.execute(httpUriRequest, responseHandler);
        }
        b bVar = new b();
        addNuwaTraceIdToHeaderAndEvent(httpUriRequest, bVar);
        prepareDnsInfo(httpUriRequest, bVar);
        try {
            return (T) httpClient.execute(warp(httpUriRequest, bVar), warp(responseHandler, bVar));
        } catch (IOException e) {
            nop.abc(bVar, e);
            throw e;
        }
    }

    private static String getInfoFromRequestHeaders(String str, HttpRequest httpRequest) {
        try {
            Header[] headers = httpRequest.getHeaders(str);
            return (headers == null || headers.length <= 0 || headers[0].getValue() == null) ? "" : headers[0].getValue();
        } catch (Throwable unused) {
        }
        return "";
    }

    private static void prepareDnsInfo(HttpRequest httpRequest, b bVar) {
        String host;
        if (httpRequest == null || httpRequest.getRequestLine() == null) {
            return;
        }
        try {
            String uri = httpRequest.getRequestLine().getUri();
            try {
                host = new URL(uri).getHost();
            } catch (Throwable th) {
                LOG.warn(uri + " dns resolve failed, detail: " + th.getMessage());
                host = "";
            }
            if (TextUtils.isEmpty(host)) {
                return;
            }
            c.abc(host, bVar);
        } catch (Throwable th2) {
            bcd.abc(th2, abc.abc(" dns resolve failed, detail: "), LOG);
        }
    }

    private static HttpUriRequest warp(HttpUriRequest httpUriRequest, b bVar) {
        return nop.abc(httpUriRequest, bVar);
    }

    private static HttpRequest warp(HttpHost httpHost, HttpRequest httpRequest, b bVar) {
        return nop.abc(httpHost, httpRequest, bVar);
    }

    private static HttpResponse warp(HttpResponse httpResponse, b bVar) {
        return nop.abc(httpResponse, bVar);
    }

    private static <T> ResponseHandler<? extends T> warp(ResponseHandler<? extends T> responseHandler, b bVar) {
        AgentLog agentLog = nop.abc;
        return new j0(responseHandler, bVar);
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        if (Agent.isDisabled()) {
            return (T) httpClient.execute(httpHost, httpRequest, responseHandler);
        }
        b bVar = new b();
        addNuwaTraceIdToHeaderAndEvent(httpRequest, bVar);
        prepareDnsInfo(httpRequest, bVar);
        try {
            return (T) httpClient.execute(httpHost, warp(httpHost, httpRequest, bVar), warp(responseHandler, bVar));
        } catch (IOException e) {
            nop.abc(bVar, e);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        if (Agent.isDisabled()) {
            return (T) httpClient.execute(httpUriRequest, responseHandler, httpContext);
        }
        b bVar = new b();
        addNuwaTraceIdToHeaderAndEvent(httpUriRequest, bVar);
        prepareDnsInfo(httpUriRequest, bVar);
        try {
            return (T) httpClient.execute(warp(httpUriRequest, bVar), warp(responseHandler, bVar), httpContext);
        } catch (IOException e) {
            nop.abc(bVar, e);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        if (Agent.isDisabled()) {
            return (T) httpClient.execute(httpHost, httpRequest, responseHandler, httpContext);
        }
        b bVar = new b();
        addNuwaTraceIdToHeaderAndEvent(httpRequest, bVar);
        prepareDnsInfo(httpRequest, bVar);
        try {
            return (T) httpClient.execute(httpHost, warp(httpHost, httpRequest, bVar), warp(responseHandler, bVar), httpContext);
        } catch (IOException e) {
            nop.abc(bVar, e);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        if (Agent.isDisabled()) {
            return httpClient.execute(httpUriRequest);
        }
        b bVar = new b();
        addNuwaTraceIdToHeaderAndEvent(httpUriRequest, bVar);
        prepareDnsInfo(httpUriRequest, bVar);
        try {
            return warp(httpClient.execute(warp(httpUriRequest, bVar)), bVar);
        } catch (IOException e) {
            nop.abc(bVar, e);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        if (Agent.isDisabled()) {
            return httpClient.execute(httpHost, httpRequest);
        }
        b bVar = new b();
        addNuwaTraceIdToHeaderAndEvent(httpRequest, bVar);
        prepareDnsInfo(httpRequest, bVar);
        try {
            return warp(httpClient.execute(httpHost, warp(httpHost, httpRequest, bVar)), bVar);
        } catch (IOException e) {
            nop.abc(bVar, e);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        if (Agent.isDisabled()) {
            return httpClient.execute(httpUriRequest, httpContext);
        }
        b bVar = new b();
        addNuwaTraceIdToHeaderAndEvent(httpUriRequest, bVar);
        prepareDnsInfo(httpUriRequest, bVar);
        try {
            return warp(httpClient.execute(warp(httpUriRequest, bVar), httpContext), bVar);
        } catch (IOException e) {
            nop.abc(bVar, e);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        if (Agent.isDisabled()) {
            return httpClient.execute(httpHost, httpRequest, httpContext);
        }
        b bVar = new b();
        addNuwaTraceIdToHeaderAndEvent(httpRequest, bVar);
        prepareDnsInfo(httpRequest, bVar);
        try {
            return warp(httpClient.execute(httpHost, warp(httpHost, httpRequest, bVar), httpContext), bVar);
        } catch (IOException e) {
            nop.abc(bVar, e);
            throw e;
        }
    }
}
