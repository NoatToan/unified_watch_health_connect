package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes34.dex */
public class g4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14805c = "AllLinkDelayAnalysisHelper";
    public static volatile g4 d = null;
    public static final String e = "network-in";
    public static final String f = "network-out";
    public static final String g = "network-vendor";
    public static final String h = "net-msg-id";
    public static final String i = "NWK";
    public static final char j = ';';
    public static final char k = '(';
    public static final char l = ')';
    public static final String m = "time";
    public static final char n = '/';

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14806a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14807b = false;

    public boolean addQuicTrace() {
        return false;
    }

    public void userSet(boolean z) {
        this.f14807b = z;
    }

    public void traceResponseNetworkKitOutEvent(z2 z2Var) {
        if (this.f14806a) {
            z2Var.traceResponseNetworkKitOutEvent(b());
        } else {
            Logger.v(f14805c, "isEnableAllLinkDelayAnalysis false");
        }
    }

    public void traceResponseNetworkKitInEvent(z2 z2Var) {
        if (this.f14806a) {
            z2Var.traceResponseNetworkKitInEvent(b(), "NWK");
        } else {
            Logger.v(f14805c, "isEnableAllLinkDelayAnalysis false");
        }
    }

    public h1.d traceRequestNetworkKitOutEvent(h1.d dVar) {
        if (!this.f14806a) {
            Logger.v(f14805c, "isEnableAllLinkDelayAnalysis false");
            return dVar;
        }
        Logger.v(f14805c, "[traceRequestNetworkKitOutEvent]before update:" + Headers.of(dVar.getHeaders()).toString());
        Request requestBuild = dVar.newBuilder().removeHeader("network-out").addHeader("network-out", a(dVar.getHeaders(), "network-out", b())).build();
        Logger.v(f14805c, "[traceRequestNetworkKitOutEvent]after update:" + Headers.of(requestBuild.getHeaders()).toString());
        return new h1.d(requestBuild);
    }

    public h1.d traceRequestNetworkKitInEvent(h1.d dVar) {
        if (!this.f14806a) {
            Logger.v(f14805c, "isEnableAllLinkDelayAnalysis false");
            return dVar;
        }
        Logger.v(f14805c, "[traceRequestNetworkKitInEvent]before update:" + Headers.of(dVar.getHeaders()).toString());
        Map<String, List<String>> headers = dVar.getHeaders();
        Request.Builder builderAddHeader = dVar.newBuilder().removeHeader("network-in").addHeader("network-in", a(headers, "network-in", b())).removeHeader(g).addHeader(g, a(headers, g, "NWK"));
        addUUIDWithoutDash(builderAddHeader, headers);
        Request requestBuild = builderAddHeader.build();
        Logger.v(f14805c, "[traceRequestNetworkKitInEvent]after update:" + Headers.of(requestBuild.getHeaders()).toString());
        return new h1.d(requestBuild);
    }

    public String getNetMsgIdFromRequest(h1.d dVar) {
        return (dVar.getHeaders().get("net-msg-id") == null || dVar.getHeaders().get("net-msg-id").size() <= 0) ? "" : dVar.getHeaders().get("net-msg-id").get(0).toString();
    }

    public void enableAllLinkDelayAnalysis(boolean z) {
        this.f14806a = z;
    }

    public void addUUIDWithoutDash(Request.Builder builder, Map<String, List<String>> map) {
        if (map.containsKey("net-msg-id")) {
            return;
        }
        builder.addHeader("net-msg-id", UUID.randomUUID().toString().replaceAll(Constants.LINK, ""));
    }

    public static g4 getInstance() {
        if (d == null) {
            synchronized (g4.class) {
                if (d == null) {
                    d = new g4();
                }
            }
        }
        return d;
    }

    private String b() {
        return "NWK(time/" + a() + l;
    }

    private String a(Map<String, List<String>> map, String str, String str2) {
        for (String str3 : map.keySet()) {
            if (str3 != null && StringUtils.strEquals(str3, str)) {
                if (!TextUtils.isEmpty(map.get(str).toString())) {
                    break;
                }
                String string = map.get(str).toString();
                if (string.indexOf(59) == string.length() - 1) {
                    return string + str2;
                }
                return string + ';' + str2;
            }
        }
        return str2;
    }

    private String a() {
        return u1.parseCurrentUTCTime();
    }
}
