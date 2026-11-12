package defpackage;

import com.xiaomi.ai.api.Network;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.onetrack.api.b;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public class c9s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gt3 f5093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5094b;
    public String d;
    public String e;
    public long f;
    public OkHttpClient g;
    public e9s i;
    public int c = -1;
    public boolean h = false;

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5095a;

        public a(String str) {
            this.f5095a = str;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            wpe.e("HttpDns", wpe.o(iOException));
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            c4h c4hVar;
            mj1 mj1VarA;
            String str;
            mj1 mj1VarA2;
            if (response != null) {
                try {
                    if (response.isSuccessful()) {
                        String strString = response.body().string();
                        wpe.b("HttpDns", "getOnlineIp: response body=" + strString);
                        if (!yrs.b(strString) && (c4hVar = (c4h) APIUtils.getObjectMapper().readTree(strString)) != null && c4hVar.T("R").H()) {
                            c4h c4hVar2 = (c4h) c4hVar.T("R");
                            if (Network.NetworkType.DATA.name().equals(this.f5095a)) {
                                mj1VarA = c9s.this.a(c4hVar2, "wap");
                                str = "getOnlineIp: save network type wap";
                            } else {
                                mj1VarA = c9s.this.a(c4hVar2, "wifi");
                                str = "getOnlineIp: save network type wifi";
                            }
                            wpe.b("HttpDns", str);
                            if (mj1VarA != null) {
                                if (c9s.this.f5093a.getChannelType().equals("xmd")) {
                                    c9s.this.f(mj1VarA, true, this.f5095a, "xmd_dns_cache");
                                } else {
                                    c9s.this.f(mj1VarA, true, this.f5095a, "http_dns_cache");
                                    if (c9s.this.i != null) {
                                        c9s.this.i.c(this.f5095a);
                                    }
                                }
                            }
                            if (c9s.this.f5093a.getChannelType().equals("ws") && c9s.this.f5093a.getAivsConfig().b("connection.enable_ipv6_http_dns") && c4hVar2.T("ipv6").H() && (mj1VarA2 = c9s.this.a(c4hVar2, "ipv6")) != null) {
                                wpe.b("HttpDns", "getOnlineIp: save network type ipv6");
                                c9s.this.f(mj1VarA2, true, this.f5095a, "ipv6_http_dns_cache");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } catch (Exception e) {
                    wpe.e("HttpDns", wpe.o(e));
                    return;
                }
            }
            wpe.e("HttpDns", "getOnlineIp: response=" + response);
        }
    }

    public c9s(gt3 gt3Var, String str) {
        this.f5093a = gt3Var;
        this.d = str;
        wpe.h("HttpDns", "init url:" + str + ", channel type:" + gt3Var.getChannelType());
        r(str);
        if (this.f5093a.getAivsConfig().c("connection.enable_http_dns", true)) {
            this.g = new OkHttpClient.Builder().connectTimeout(this.f5093a.getAivsConfig().e("connection.connect_timeout"), TimeUnit.SECONDS).build();
            if (this.f5093a.getChannelType().equals("ws") && this.f5093a.getAivsConfig().c("connection.enable_horse_race", true)) {
                this.i = new e9s(this.f5093a, this);
            }
        }
    }

    public final mj1 a(c4h c4hVar, String str) {
        if (!c4hVar.T(str).H()) {
            return null;
        }
        c4h c4hVar2 = (c4h) c4hVar.T(str);
        if (!c4hVar2.T(this.f5094b).C()) {
            return null;
        }
        mj1 mj1Var = (mj1) c4hVar2.T(this.f5094b);
        if (mj1Var.size() > 0) {
            return mj1Var;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mj1 c(String str, String str2) {
        mj1 mj1Var;
        int size;
        String str3 = "HttpDns";
        String strL = l(str2, str);
        if (!yrs.b(strL)) {
            try {
                c4h c4hVar = (c4h) APIUtils.getObjectMapper().readTree(strL);
                this.f = c4hVar.T("expire_at").j();
                if (System.currentTimeMillis() > this.f + 10000) {
                    wpe.k("HttpDns", "getLocalIp: local dns expired, mExpireAt=" + this.f);
                    str3 = str3;
                } else if (c4hVar.T(b.P).C() && (size = (mj1Var = (mj1) c4hVar.T(b.P)).size()) > 0) {
                    str3 = str3;
                    str3 = size;
                    return mj1Var;
                }
                str3 = str3;
                str3 = size;
                str3 = str3;
            } catch (Exception e) {
                wpe.e(str3, wpe.o(e));
                wpe.e(str3, "getLocalIp:parse local ip failed: " + strL);
            }
        }
        n(str2, str);
        return null;
    }

    public String e() {
        return this.f5094b;
    }

    public void f(mj1 mj1Var, boolean z, String str, String str2) {
        long jCurrentTimeMillis;
        wpe.b("HttpDns", "saveDns: networkType:" + str);
        c4h c4hVarCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
        c4hVarCreateObjectNode.q0(b.P, mj1Var);
        if (z) {
            jCurrentTimeMillis = System.currentTimeMillis() + (((long) this.f5093a.getAivsConfig().e("connection.http_dns_expire_in")) * 1000);
            this.f = jCurrentTimeMillis;
        } else {
            jCurrentTimeMillis = this.f;
        }
        c4hVarCreateObjectNode.h0("expire_at", jCurrentTimeMillis);
        wpe.h("HttpDns", "saveDns:" + c4hVarCreateObjectNode.toString());
        h(str, c4hVarCreateObjectNode.toString(), str2);
    }

    public void g(String str) {
        String str2;
        if (this.e == null) {
            return;
        }
        wpe.h("HttpDns", "discardDns: networkType:" + str);
        synchronized (c9s.class) {
            try {
                if (this.f5093a.getChannelType().equals("xmd")) {
                    str2 = "xmd_dns_cache";
                } else if (this.f5093a.getAivsConfig().b("connection.enable_ipv6_http_dns") && this.e.contains("[") && this.e.contains("]")) {
                    str2 = "ipv6_http_dns_cache";
                    this.h = true;
                    wpe.e("HttpDns", "connect ipv6 address " + this.e + " failed!");
                } else {
                    str2 = "http_dns_cache";
                }
                String strL = l(str, str2);
                if (yrs.b(strL)) {
                    return;
                }
                try {
                    c4h c4hVar = (c4h) APIUtils.getObjectMapper().readTree(strL);
                    if (!c4hVar.T(b.P).C()) {
                        n(str, str2);
                        return;
                    }
                    mj1 mj1Var = (mj1) c4hVar.T(b.P);
                    for (int i = 0; i < mj1Var.size(); i++) {
                        if (this.e.equals(mj1Var.i0(i).l())) {
                            wpe.h("HttpDns", "discardDns: remove " + this.e);
                            mj1Var.j0(i);
                            if (mj1Var.size() > 0) {
                                f(mj1Var, false, str, str2);
                            } else {
                                if (this.f5093a.getChannelType().equals("xmd")) {
                                    this.f5093a.getListener().onWrite(this.f5093a, "xmd_ws_expire_at", String.valueOf((System.currentTimeMillis() / 1000) + ((long) RepositoryManager.GAP_A_DAY)));
                                    wpe.h("HttpDns", "switch from xmd to ws next time");
                                }
                                n(str, str2);
                            }
                            this.e = null;
                            break;
                        }
                    }
                    e9s e9sVar = this.i;
                    if (e9sVar != null) {
                        e9sVar.c(str);
                    }
                } catch (Exception e) {
                    wpe.e("HttpDns", wpe.o(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(String str, String str2, String str3) {
        String strOnRead = this.f5093a.getListener().onRead(this.f5093a, str3);
        c4h c4hVarCreateObjectNode = null;
        if (!yrs.b(strOnRead)) {
            try {
                c4h c4hVar = (c4h) APIUtils.getObjectMapper().readTree(strOnRead);
                if (c4hVar != null) {
                    try {
                        if (c4hVar.size() > 32) {
                            wpe.k("HttpDns", "writeHttpDnsCache: dns cache size over limit, clear all");
                            c4hVar.o0();
                        }
                    } catch (IOException e) {
                        e = e;
                        c4hVarCreateObjectNode = c4hVar;
                        wpe.e("HttpDns", wpe.o(e));
                        this.f5093a.getListener().onRemove(this.f5093a, str3);
                    }
                }
                c4hVarCreateObjectNode = c4hVar;
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (c4hVarCreateObjectNode == null) {
            c4hVarCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
        }
        c4hVarCreateObjectNode.j0(q(str), str2);
        this.f5093a.getListener().onWrite(this.f5093a, str3, c4hVarCreateObjectNode.toString());
    }

    public String j() {
        return this.d;
    }

    public String k(String str) {
        wpe.h("HttpDns", "getDnsUrl: networkType:" + str);
        if (!this.f5093a.getAivsConfig().c("connection.enable_http_dns", true) || this.d.startsWith("wss://")) {
            wpe.h("HttpDns", "getDnsUrl: httpdns is disabled");
            return this.d;
        }
        synchronized (c9s.class) {
            try {
                String strM = m(str);
                if (strM == null) {
                    this.e = null;
                    o(str);
                    wpe.h("HttpDns", "getDnsUrl:  local dns failed, use default dns");
                    return this.d;
                }
                wpe.h("HttpDns", "getDnsUrl: localIp=" + strM);
                this.e = strM;
                if (this.c == -1) {
                    return this.d.replaceFirst(this.f5094b, strM);
                }
                return this.d.replaceFirst(this.f5094b + ":" + this.c, strM);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String l(String str, String str2) {
        String strOnRead = this.f5093a.getListener().onRead(this.f5093a, str2);
        wpe.b("HttpDns", "readHttpDnsCache at " + str2 + ", networkType:" + str + ", httpDnsCache:" + strOnRead);
        if (yrs.b(strOnRead)) {
            return null;
        }
        try {
            c4h c4hVar = (c4h) APIUtils.getObjectMapper().readTree(strOnRead);
            if (c4hVar.A(q(str))) {
                return c4hVar.w(q(str)).l();
            }
        } catch (Exception e) {
            wpe.e("HttpDns", wpe.o(e));
            this.f5093a.getListener().onRemove(this.f5093a, str2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String m(String str) {
        String str2;
        String strL;
        boolean zB;
        String str3 = "HttpDns";
        if (this.f5093a.getChannelType().equals("xmd")) {
            str2 = "xmd_dns_cache";
        } else {
            String str4 = "http_dns_cache";
            if (this.f5093a.getAivsConfig().b("connection.enable_ipv6_http_dns")) {
                boolean zIpv6Available = this.f5093a.getListener().ipv6Available();
                if (!this.h && zIpv6Available) {
                    str4 = "ipv6_http_dns_cache";
                }
                wpe.h("HttpDns", "getLocalIp: networkType:" + str + ", ipv6Available:" + zIpv6Available + ",mIpv6ConnectFailed:" + this.h);
            }
            str2 = str4;
        }
        String strL2 = l(str, str2);
        if (!yrs.b(strL2)) {
            try {
                c4h c4hVar = (c4h) APIUtils.getObjectMapper().readTree(strL2);
                this.f = c4hVar.T("expire_at").j();
                if (System.currentTimeMillis() > this.f + 10000) {
                    wpe.k("HttpDns", "getLocalIp: local dns expired, mExpireAt=" + this.f);
                    str3 = str3;
                } else if (c4hVar.T(b.P).C()) {
                    mj1 mj1Var = (mj1) c4hVar.T(b.P);
                    if (mj1Var.size() > 0 && !(zB = yrs.b((strL = mj1Var.i0(0).l())))) {
                        str3 = str3;
                        str3 = str3;
                        str3 = zB;
                        return strL;
                    }
                }
                str3 = str3;
                str3 = str3;
                str3 = zB;
                str3 = str3;
                str3 = str3;
                str3 = str3;
            } catch (Exception e) {
                wpe.e(str3, wpe.o(e));
                wpe.e(str3, "getLocalIp:parse local ip failed: " + strL2);
            }
        }
        n(str, str2);
        return null;
    }

    public void n(String str, String str2) {
        String strOnRead = this.f5093a.getListener().onRead(this.f5093a, str2);
        if (yrs.b(strOnRead)) {
            return;
        }
        try {
            c4h c4hVar = (c4h) APIUtils.getObjectMapper().readTree(strOnRead);
            if (c4hVar != null) {
                c4hVar.n0(q(str));
                this.f5093a.getListener().onWrite(this.f5093a, str2, c4hVar.toString());
            }
        } catch (IOException e) {
            wpe.e("HttpDns", wpe.o(e));
            this.f5093a.getListener().onRemove(this.f5093a, str2);
        }
    }

    public final void o(String str) {
        wpe.h("HttpDns", "getOnlineIp: networkType:" + str);
        if (this.g == null) {
            return;
        }
        String strOnRead = this.f5093a.getListener().onRead(this.f5093a, "last_refresh_http_dns_at");
        if (!yrs.b(strOnRead)) {
            long j = Long.parseLong(strOnRead) + ((long) (this.f5093a.getAivsConfig().f("connection.refresh_http_dns_interval", 30) * 1000));
            if (System.currentTimeMillis() < j) {
                wpe.h("HttpDns", "frequency limited, wait until " + new Date(j).toString());
                return;
            }
        }
        this.f5093a.getListener().onWrite(this.f5093a, "last_refresh_http_dns_at", String.valueOf(System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder("https://resolver.mi.xiaomi.com/gslb/");
        sb.append("?protocol=");
        sb.append(this.f5093a.getChannelType());
        sb.append(gv5.CONNECT_STR);
        sb.append("list=");
        sb.append(this.f5094b);
        sb.append("&did=");
        sb.append(this.f5093a.getClientInfo().getDeviceId().b());
        wpe.b("HttpDns", "getOnlineIp: requestURL=" + sb.toString());
        this.g.newCall(new Request.Builder().url(sb.toString()).get().build()).enqueue(new a(str));
    }

    public final String p(String str) {
        if (!Network.NetworkType.WIFI.name().equals(str)) {
            return "not-wifi";
        }
        String strOnGetSSID = this.f5093a.getListener().onGetSSID();
        return yrs.b(strOnGetSSID) ? "unknown-wifi-ssid" : strOnGetSSID;
    }

    public final String q(String str) {
        return this.f5094b + "-" + str + "-" + p(str);
    }

    public final void r(String str) {
        if (yrs.b(str)) {
            throw new IllegalArgumentException("url=" + str);
        }
        try {
            URI uri = new URI(str);
            this.f5094b = uri.getHost();
            if (uri.getPort() != -1) {
                this.c = uri.getPort();
            }
            wpe.h("HttpDns", "parse: host=" + this.f5094b + ", port=" + this.c);
        } catch (URISyntaxException e) {
            wpe.e("HttpDns", wpe.o(e));
            throw new IllegalArgumentException("url=" + str);
        }
    }
}
