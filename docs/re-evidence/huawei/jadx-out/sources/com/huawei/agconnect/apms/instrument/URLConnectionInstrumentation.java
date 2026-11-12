package com.huawei.agconnect.apms.instrument;

import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.def;
import com.huawei.agconnect.apms.e;
import com.huawei.agconnect.apms.f;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes22.dex */
public class URLConnectionInstrumentation {
    private static final AgentLog LOG = AgentLogManager.getAgentLog();

    private URLConnectionInstrumentation() {
    }

    private static URLConnection getURLConnection(URLConnection uRLConnection) {
        if (uRLConnection != null && !Agent.isDisabled()) {
            try {
                if (uRLConnection instanceof HttpsURLConnection) {
                    return new f((HttpsURLConnection) uRLConnection);
                }
                if (uRLConnection instanceof HttpURLConnection) {
                    return new e((HttpURLConnection) uRLConnection);
                }
            } catch (Throwable th) {
                def.abc(th, abc.abc("skipping APMS URLConnection proxy: "), LOG);
            }
        }
        return uRLConnection;
    }

    public static URLConnection openConnection(URLConnection uRLConnection) {
        return getURLConnection(uRLConnection);
    }

    public static URLConnection openConnectionWithProxy(URLConnection uRLConnection) {
        return getURLConnection(uRLConnection);
    }
}
