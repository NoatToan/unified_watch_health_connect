package com.huawei.agconnect.apms.instrument.okhttp2;

import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.b;
import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.def;
import com.huawei.agconnect.apms.e;
import com.huawei.agconnect.apms.e0;
import com.huawei.agconnect.apms.f;
import com.huawei.agconnect.apms.g0;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.o;
import com.huawei.agconnect.apms.wvu;
import com.huawei.agconnect.apms.y;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.OkUrlFactory;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes22.dex */
public class OkHttp2Instrumentation {
    private static final String CACHED_RESPONSE_CLASS = "com.squareup.okhttp.Cache$CacheResponseBody";
    private static final AgentLog LOG = AgentLogManager.getAgentLog();

    private OkHttp2Instrumentation() {
    }

    private static void addNuwaHeaderId(Request.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(builder.build().header("net-msg-id"))) {
            builder.addHeader("net-msg-id", str);
        }
        if (TextUtils.isEmpty(builder.build().header(HeaderType.X_NUWA_SPAN_ID))) {
            builder.addHeader(HeaderType.X_NUWA_SPAN_ID, str2);
        }
        if (TextUtils.isEmpty(builder.build().header(HeaderType.X_NUWA_MICROSERVICE_NAME))) {
            builder.addHeader(HeaderType.X_NUWA_MICROSERVICE_NAME, HiAnalyticsManager.APM_EVENT_ID);
        }
    }

    public static ResponseBody body(Response response) {
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null && !Agent.isDisabled()) {
            try {
                if (responseBodyBody instanceof e0) {
                    e0 e0Var = (e0) responseBodyBody;
                    if (CACHED_RESPONSE_CLASS.equalsIgnoreCase(e0Var.abc().getClass().getName())) {
                        return e0Var.abc();
                    }
                }
            } catch (Throwable th) {
                def.abc(th, abc.abc("skipping APMS OkHttp2 proxy: "), LOG);
            }
        }
        return responseBodyBody;
    }

    public static Request build(Request.Builder builder) {
        if (Agent.isDisabled()) {
            return builder.build();
        }
        try {
            if (Agent.isNuwaTracerEnable()) {
                addNuwaHeaderId(builder, o.bcd(), o.abc());
            }
            return new y(builder).build();
        } catch (Throwable th) {
            AgentLog agentLog = LOG;
            StringBuilder sbAbc = abc.abc("skipping APMS OkHttp2 proxy: ");
            sbAbc.append(th.getMessage());
            agentLog.warn(sbAbc.toString());
            return builder.build();
        }
    }

    public static Response.Builder newBuilder(Response.Builder builder) {
        if (Agent.isDisabled()) {
            return builder;
        }
        try {
            return new g0(builder);
        } catch (Throwable th) {
            def.abc(th, abc.abc("skipping APMS OkHttp2 proxy: "), LOG);
            return builder;
        }
    }

    public static Call newCall(OkHttpClient okHttpClient, Request request) {
        if (Agent.isDisabled()) {
            return okHttpClient.newCall(request);
        }
        try {
            b bVar = new b();
            bVar.bcd(1);
            bVar.cde(System.currentTimeMillis());
            if (Agent.isNuwaTracerEnable()) {
                bVar.opq(getValueFromHeader(request, "net-msg-id"));
                bVar.nop(getValueFromHeader(request, HeaderType.X_NUWA_SPAN_ID));
            }
            return new wvu(okHttpClient, request, bVar);
        } catch (Throwable th) {
            AgentLog agentLog = LOG;
            StringBuilder sbAbc = abc.abc("skipping APMS OkHttp2 proxy: ");
            sbAbc.append(th.getMessage());
            agentLog.warn(sbAbc.toString());
            return okHttpClient.newCall(request);
        }
    }

    public static HttpURLConnection open(OkUrlFactory okUrlFactory, URL url) {
        HttpURLConnection httpURLConnectionOpen = okUrlFactory.open(url);
        if (Agent.isDisabled()) {
            return httpURLConnectionOpen;
        }
        try {
            return (ProxyConfig.MATCH_HTTPS.equals(url.getProtocol()) && (httpURLConnectionOpen instanceof HttpsURLConnection)) ? new f((HttpsURLConnection) httpURLConnectionOpen) : new e(httpURLConnectionOpen);
        } catch (Throwable th) {
            def.abc(th, abc.abc("skipping APMS OkHttp2 proxy: "), LOG);
            return httpURLConnectionOpen;
        }
    }

    private static String getValueFromHeader(Request request, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strHeader = request.header(str);
        return TextUtils.isEmpty(strHeader) ? "" : strHeader;
    }

    public static Response.Builder body(Response.Builder builder, ResponseBody responseBody) {
        if (Agent.isDisabled()) {
            return builder.body(responseBody);
        }
        try {
            return new g0(builder).body(responseBody);
        } catch (Throwable th) {
            AgentLog agentLog = LOG;
            StringBuilder sbAbc = abc.abc("skipping APMS OkHttp2 proxy: ");
            sbAbc.append(th.getMessage());
            agentLog.warn(sbAbc.toString());
            return builder.body(responseBody);
        }
    }
}
