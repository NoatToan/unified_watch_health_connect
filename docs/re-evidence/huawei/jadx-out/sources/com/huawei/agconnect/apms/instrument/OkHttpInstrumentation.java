package com.huawei.agconnect.apms.instrument;

import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.def;
import com.huawei.agconnect.apms.e;
import com.huawei.agconnect.apms.f;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes22.dex */
public class OkHttpInstrumentation {
    private static final AgentLog LOG = AgentLogManager.getAgentLog();

    private static HttpURLConnection getHttpURLConnection(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null && !Agent.isDisabled()) {
            try {
                return httpURLConnection instanceof HttpsURLConnection ? new f((HttpsURLConnection) httpURLConnection) : new e(httpURLConnection);
            } catch (Throwable th) {
                def.abc(th, abc.abc("skipping APMS OkHttp proxy: "), LOG);
            }
        }
        return httpURLConnection;
    }

    public static HttpURLConnection open(HttpURLConnection httpURLConnection) {
        return getHttpURLConnection(httpURLConnection);
    }

    public static HttpURLConnection openWithProxy(HttpURLConnection httpURLConnection) {
        return getHttpURLConnection(httpURLConnection);
    }

    public static HttpURLConnection urlFactoryOpen(HttpURLConnection httpURLConnection) {
        return getHttpURLConnection(httpURLConnection);
    }
}
