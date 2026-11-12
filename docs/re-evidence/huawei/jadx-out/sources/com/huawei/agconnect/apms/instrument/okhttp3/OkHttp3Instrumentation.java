package com.huawei.agconnect.apms.instrument.okhttp3;

import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.b;
import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.def;
import com.huawei.agconnect.apms.e;
import com.huawei.agconnect.apms.f;
import com.huawei.agconnect.apms.f0;
import com.huawei.agconnect.apms.ihg;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.o;
import com.huawei.agconnect.apms.xwv;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.OkUrlFactory;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes22.dex */
public class OkHttp3Instrumentation {
    private static final AgentLog LOG = AgentLogManager.getAgentLog();
    private static final String OKHTTP3_LISTENER_TAG = "okhttp3.RealCall";
    private static final String OKHTTP4_4_LISTENER_TAG = "okhttp3.internal.connection.RealCall";
    private static final String OKHTTP4_TRANSMITTER_TAG = "okhttp3.internal.connection.Transmitter";

    public static final class abc {
        public static final Class abc;

        static {
            Class<?> cls;
            try {
                try {
                    cls = Class.forName(OkHttp3Instrumentation.OKHTTP3_LISTENER_TAG);
                } catch (ClassNotFoundException unused) {
                    cls = Class.forName(OkHttp3Instrumentation.OKHTTP4_4_LISTENER_TAG);
                }
            } catch (ClassNotFoundException unused2) {
                OkHttp3Instrumentation.LOG.warn("cannot found target class, some network metrics cannot be collected.");
                cls = null;
            }
            if (cls != null) {
                OkHttp3Instrumentation.LOG.debug("enhance network metrics initialization succeeded.");
            }
            abc = cls;
        }
    }

    public static final class bcd {
        public static final Class abc;

        static {
            Class<?> cls;
            try {
                cls = Class.forName(OkHttp3Instrumentation.OKHTTP4_TRANSMITTER_TAG);
            } catch (Throwable unused) {
                cls = null;
            }
            abc = cls;
        }
    }

    private OkHttp3Instrumentation() {
    }

    private static void addEventListenerAndInject(Call call, b bVar) {
        Class listenerParentClazz;
        try {
            listenerParentClazz = getListenerParentClazz();
            if (listenerParentClazz == null) {
                return;
            }
            try {
                Field declaredField = listenerParentClazz.getDeclaredField("eventListener");
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                setListenerProxy(call, declaredField, bVar);
            } catch (Throwable th) {
                th = th;
                try {
                    if (tryAddEventListenerToTransmitter(call, listenerParentClazz, bVar)) {
                        return;
                    }
                    LOG.error(th.getMessage());
                } catch (Throwable th2) {
                    LOG.error(th2.getMessage());
                }
            }
        } catch (Throwable th3) {
            th = th3;
            listenerParentClazz = null;
        }
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

    public static Response.Builder body(Response.Builder builder, ResponseBody responseBody) {
        if (Agent.isDisabled()) {
            return builder.body(responseBody);
        }
        try {
            return new f0(builder).body(responseBody);
        } catch (Throwable th) {
            AgentLog agentLog = LOG;
            StringBuilder sbAbc = com.huawei.agconnect.apms.abc.abc("skipping APMS OkHttp3 proxy: ");
            sbAbc.append(th.getMessage());
            agentLog.warn(sbAbc.toString());
            return builder.body(responseBody);
        }
    }

    public static Request build(Request.Builder builder) {
        if (Agent.isDisabled()) {
            return builder.build();
        }
        try {
            if (Agent.isNuwaTracerEnable()) {
                addNuwaHeaderId(builder, o.bcd(), o.abc());
            }
            return builder.build();
        } catch (Throwable th) {
            AgentLog agentLog = LOG;
            StringBuilder sbAbc = com.huawei.agconnect.apms.abc.abc("skipping APMS OkHttp3 proxy: ");
            sbAbc.append(th.getMessage());
            agentLog.warn(sbAbc.toString());
            return builder.build();
        }
    }

    private static Class getListenerParentClazz() {
        return abc.abc;
    }

    private static Class getTransmitterClazz() {
        return bcd.abc;
    }

    public static Response.Builder newBuilder(Response.Builder builder) {
        if (Agent.isDisabled()) {
            return builder;
        }
        try {
            return new f0(builder);
        } catch (Throwable th) {
            def.abc(th, com.huawei.agconnect.apms.abc.abc("skipping APMS OkHttp3 proxy: "), LOG);
            return builder;
        }
    }

    public static Call newCall(OkHttpClient okHttpClient, Request request) {
        if (Agent.isDisabled()) {
            return okHttpClient.newCall(request);
        }
        try {
            b bVar = new b();
            bVar.ijk(getValueFromHeader(request, "sessionId"));
            bVar.hij(getValueFromHeader(request, "interactionId"));
            bVar.jkl(getValueFromHeader(request, "traceId"));
            if (Agent.isNuwaTracerEnable()) {
                bVar.opq(getValueFromHeader(request, "net-msg-id"));
                bVar.nop(getValueFromHeader(request, HeaderType.X_NUWA_SPAN_ID));
            }
            Call callNewCall = okHttpClient.newCall(request);
            addEventListenerAndInject(callNewCall, bVar);
            bVar.bcd(2);
            return new xwv(request, callNewCall, bVar);
        } catch (Throwable th) {
            AgentLog agentLog = LOG;
            StringBuilder sbAbc = com.huawei.agconnect.apms.abc.abc("skipping APMS OkHttp3 proxy: ");
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
            def.abc(th, com.huawei.agconnect.apms.abc.abc("skipping APMS OkHttp3 proxy: "), LOG);
            return httpURLConnectionOpen;
        }
    }

    private static void setListenerProxy(Object obj, Field field, b bVar) {
        try {
            field.set(obj, new ihg((EventListener) field.get(obj), bVar));
        } catch (Throwable th) {
            LOG.error(th.getMessage());
        }
    }

    private static boolean tryAddEventListenerToTransmitter(Call call, Class cls, b bVar) {
        if (call != null && cls != null && bVar != null) {
            Class transmitterClazz = getTransmitterClazz();
            try {
                Field declaredField = cls.getDeclaredField("transmitter");
                Field declaredField2 = transmitterClazz.getDeclaredField("eventListener");
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                if (!declaredField2.isAccessible()) {
                    declaredField2.setAccessible(true);
                }
                try {
                    setListenerProxy(declaredField.get(call), declaredField2, bVar);
                    return true;
                } catch (Throwable th) {
                    bVar.def(th.getMessage());
                    LOG.error(th.getMessage());
                    return false;
                }
            } catch (NoSuchFieldException e) {
                bVar.def(e.getMessage());
                LOG.error(e.getMessage());
            }
        }
        return false;
    }

    private static String getValueFromHeader(Request request, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strHeader = request.header(str);
        return TextUtils.isEmpty(strHeader) ? "" : strHeader;
    }
}
