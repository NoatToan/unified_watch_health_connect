package com.xiaomi.ai.transport;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.xiaomi.ai.api.Network;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.b.f;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import com.xiaomi.mipush.sdk.Constants;
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

/* JADX INFO: loaded from: classes18.dex */
public class b {
    private com.xiaomi.ai.core.a a;
    private String b;
    private String d;
    private String e;
    private long f;
    private OkHttpClient g;
    private com.xiaomi.ai.core.d i;
    private int c = -1;
    private boolean h = false;
    private boolean j = false;

    public b(com.xiaomi.ai.core.a aVar, String str) {
        this.a = aVar;
        this.d = str;
        Logger.b("HttpDns", "init url:" + str + ", channel type:" + aVar.getChannelType());
        e(str);
        if (this.a.getAivsConfig().getBoolean(AivsConfig.Connection.ENABLE_HTTP_DNS, true)) {
            this.g = new OkHttpClient.Builder().connectTimeout(this.a.getAivsConfig().getInt(AivsConfig.Connection.CONNECT_TIMEOUT), TimeUnit.SECONDS).build();
            if (this.a.getChannelType().equals("ws") && this.a.getAivsConfig().getBoolean(AivsConfig.Connection.ENABLE_HORSE_RACE, true)) {
                this.i = new com.xiaomi.ai.core.d(this.a, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayNode a(ObjectNode objectNode, String str) {
        if (!objectNode.path(str).isObject()) {
            return null;
        }
        ObjectNode objectNode2 = (ObjectNode) objectNode.path(str);
        if (!objectNode2.path(this.b).isArray()) {
            return null;
        }
        ArrayNode arrayNode = (ArrayNode) objectNode2.path(this.b);
        if (arrayNode.size() > 0) {
            return arrayNode;
        }
        return null;
    }

    private void a(String str, String str2, String str3) {
        String strA = this.a.getListener().a(this.a, str3);
        ObjectNode objectNodeCreateObjectNode = null;
        if (!f.a(strA)) {
            try {
                ObjectNode objectNode = (ObjectNode) APIUtils.getObjectMapper().readTree(strA);
                if (objectNode != null) {
                    try {
                        if (objectNode.size() > 32) {
                            Logger.c("HttpDns", "writeHttpDnsCache: dns cache size over limit, clear all");
                            objectNode.removeAll();
                        }
                    } catch (IOException e) {
                        e = e;
                        objectNodeCreateObjectNode = objectNode;
                        Logger.d("HttpDns", Logger.throwableToString(e));
                        this.a.getListener().b(this.a, str3);
                    }
                }
                objectNodeCreateObjectNode = objectNode;
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (objectNodeCreateObjectNode == null) {
            objectNodeCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
        }
        objectNodeCreateObjectNode.put(f(str), str2);
        this.a.getListener().a(this.a, str3, objectNodeCreateObjectNode.toString());
    }

    private String c(String str, String str2) {
        String strA = this.a.getListener().a(this.a, str2);
        Logger.a("HttpDns", "readHttpDnsCache at " + str2 + ", networkType:" + str + ", httpDnsCache:" + strA);
        if (f.a(strA)) {
            return null;
        }
        try {
            ObjectNode objectNode = (ObjectNode) APIUtils.getObjectMapper().readTree(strA);
            if (objectNode.hasNonNull(f(str))) {
                return objectNode.get(f(str)).asText();
            }
        } catch (IOException e) {
            Logger.d("HttpDns", Logger.throwableToString(e));
            this.a.getListener().b(this.a, str2);
        }
        return null;
    }

    private void c(final String str) {
        Logger.b("HttpDns", "getOnlineIp: networkType:" + str);
        if (this.g == null) {
            return;
        }
        String strA = this.a.getListener().a(this.a, "last_refresh_http_dns_at");
        if (!f.a(strA)) {
            long j = Long.parseLong(strA) + ((long) (this.a.getAivsConfig().getInt(AivsConfig.Connection.REFRESH_HTTP_DNS_INTERVAL, 300) * 1000));
            if (System.currentTimeMillis() < j) {
                Logger.b("HttpDns", "frequency limited, wait until " + new Date(j).toString());
                return;
            }
        }
        this.a.getListener().a(this.a, "last_refresh_http_dns_at", String.valueOf(System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder("https://resolver.mi.xiaomi.com/gslb/");
        sb.append("?protocol=");
        sb.append(this.a.getChannelType());
        sb.append(com.alipay.sdk.m.s.a.l);
        sb.append("list=");
        sb.append(this.b);
        sb.append("&did=");
        sb.append(this.a.getClientInfo().getDeviceId().get());
        Logger.b("HttpDns", "getOnlineIp: requestURL=" + sb.toString());
        FirebasePerfOkHttpClient.enqueue(this.g.newCall(new Request.Builder().url(sb.toString()).get().build()), new Callback() { // from class: com.xiaomi.ai.transport.b.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                Logger.d("HttpDns", Logger.throwableToString(iOException));
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                ObjectNode objectNode;
                ArrayNode arrayNodeA;
                String str2;
                ArrayNode arrayNodeA2;
                if (response != null) {
                    try {
                        if (response.isSuccessful()) {
                            String strString = response.body().string();
                            Logger.a("HttpDns", "getOnlineIp: response body=" + strString);
                            if (!f.a(strString) && (objectNode = (ObjectNode) APIUtils.getObjectMapper().readTree(strString)) != null && objectNode.path("R").isObject()) {
                                ObjectNode objectNode2 = (ObjectNode) objectNode.path("R");
                                if (Network.NetworkType.DATA.name().equals(str)) {
                                    arrayNodeA = b.this.a(objectNode2, "wap");
                                    str2 = "getOnlineIp: save network type wap";
                                } else {
                                    arrayNodeA = b.this.a(objectNode2, "wifi");
                                    str2 = "getOnlineIp: save network type wifi";
                                }
                                Logger.a("HttpDns", str2);
                                if (arrayNodeA != null) {
                                    if (b.this.a.getChannelType().equals("xmd")) {
                                        b.this.a(arrayNodeA, true, str, "xmd_dns_cache");
                                    } else {
                                        b.this.a(arrayNodeA, true, str, "http_dns_cache");
                                        if (b.this.i != null) {
                                            b.this.i.a(str);
                                        }
                                    }
                                }
                                if (b.this.a.getChannelType().equals("ws") && b.this.a.getAivsConfig().getBoolean(AivsConfig.Connection.ENABLE_IPV6_HTTP_DNS) && objectNode2.path("ipv6").isObject() && (arrayNodeA2 = b.this.a(objectNode2, "ipv6")) != null) {
                                    Logger.a("HttpDns", "getOnlineIp: save network type ipv6");
                                    b.this.a(arrayNodeA2, true, str, "ipv6_http_dns_cache");
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    } catch (Exception e) {
                        Logger.d("HttpDns", Logger.throwableToString(e));
                        return;
                    }
                }
                Logger.d("HttpDns", "getOnlineIp: response=" + response);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String d(String str) {
        String str2;
        String strAsText;
        boolean zA;
        String str3 = "HttpDns";
        if (this.a.getChannelType().equals("xmd")) {
            str2 = "xmd_dns_cache";
        } else {
            str2 = "http_dns_cache";
            if (this.a.getAivsConfig().getBoolean(AivsConfig.Connection.ENABLE_IPV6_HTTP_DNS)) {
                boolean zE = this.a.getListener().e();
                if (!this.h && zE) {
                    str2 = "ipv6_http_dns_cache";
                }
                Logger.b("HttpDns", "getLocalIp: networkType:" + str + ", ipv6Available:" + zE + ",mIpv6ConnectFailed:" + this.h);
            }
        }
        String strC = c(str, str2);
        if (!f.a(strC)) {
            try {
                ObjectNode objectNode = (ObjectNode) APIUtils.getObjectMapper().readTree(strC);
                this.f = objectNode.path("expire_at").asLong();
                if (System.currentTimeMillis() > this.f + 10000) {
                    Logger.c("HttpDns", "getLocalIp: local dns expired, mExpireAt=" + this.f);
                    str3 = str3;
                } else if (objectNode.path("dns").isArray()) {
                    ArrayNode arrayNode = (ArrayNode) objectNode.path("dns");
                    if (arrayNode.size() > 0 && !(zA = f.a((strAsText = arrayNode.get(0).asText())))) {
                        str3 = str3;
                        str3 = str3;
                        str3 = zA;
                        return strAsText;
                    }
                }
                str3 = str3;
                str3 = str3;
                str3 = zA;
                str3 = str3;
                str3 = str3;
                str3 = str3;
            } catch (Exception e) {
                Logger.d(str3, Logger.throwableToString(e));
                Logger.d(str3, "getLocalIp:parse local ip failed: " + strC);
            }
        }
        b(str, str2);
        return null;
    }

    private void e(String str) {
        if (f.a(str)) {
            throw new IllegalArgumentException("url=" + str);
        }
        try {
            URI uri = new URI(str);
            this.b = uri.getHost();
            if (uri.getPort() != -1) {
                this.c = uri.getPort();
            }
            Logger.b("HttpDns", "parse: host=" + this.b + ", port=" + this.c);
        } catch (URISyntaxException e) {
            Logger.d("HttpDns", Logger.throwableToString(e));
            throw new IllegalArgumentException("url=" + str);
        }
    }

    private String f(String str) {
        return this.b + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + g(str);
    }

    private String g(String str) {
        if (!Network.NetworkType.WIFI.name().equals(str)) {
            return "not-wifi";
        }
        String strD = this.a.getListener().d();
        return f.a(strD) ? "unknown-wifi-ssid" : strD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArrayNode a(String str, String str2) {
        ArrayNode arrayNode;
        int size;
        String str3 = "HttpDns";
        String strC = c(str2, str);
        if (!f.a(strC)) {
            try {
                ObjectNode objectNode = (ObjectNode) APIUtils.getObjectMapper().readTree(strC);
                this.f = objectNode.path("expire_at").asLong();
                if (System.currentTimeMillis() > this.f + 10000) {
                    Logger.c("HttpDns", "getLocalIp: local dns expired, mExpireAt=" + this.f);
                    str3 = str3;
                } else if (objectNode.path("dns").isArray() && (size = (arrayNode = (ArrayNode) objectNode.path("dns")).size()) > 0) {
                    str3 = str3;
                    str3 = size;
                    return arrayNode;
                }
                str3 = str3;
                str3 = size;
                str3 = str3;
            } catch (Exception e) {
                Logger.d(str3, Logger.throwableToString(e));
                Logger.d(str3, "getLocalIp:parse local ip failed: " + strC);
            }
        }
        b(str2, str);
        return null;
    }

    public String a() {
        return this.b;
    }

    public String a(String str) {
        if (!this.a.getAivsConfig().getBoolean(AivsConfig.Connection.ENABLE_HTTP_DNS, true) || this.d.startsWith("wss://")) {
            Logger.b("HttpDns", "getDnsUrl: httpdns is disabled");
            return this.d;
        }
        Logger.b("HttpDns", "getDnsUrl: networkType:" + str);
        synchronized (b.class) {
            String strD = d(str);
            if (strD == null) {
                this.e = null;
                c(str);
                Logger.b("HttpDns", "getDnsUrl:  local dns failed, use default dns");
                return this.d;
            }
            Logger.b("HttpDns", "getDnsUrl: localIp=" + strD);
            this.e = strD;
            if (this.c == -1) {
                return this.d.replaceFirst(this.b, strD);
            }
            return this.d.replaceFirst(this.b + ":" + this.c, strD);
        }
    }

    public void a(ArrayNode arrayNode, boolean z, String str, String str2) {
        long jCurrentTimeMillis;
        Logger.a("HttpDns", "saveDns: networkType:" + str);
        ObjectNode objectNodeCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
        objectNodeCreateObjectNode.set("dns", arrayNode);
        if (z) {
            jCurrentTimeMillis = System.currentTimeMillis() + (((long) this.a.getAivsConfig().getInt(AivsConfig.Connection.HTTP_DNS_EXPIRE_IN)) * 1000);
            this.f = jCurrentTimeMillis;
        } else {
            jCurrentTimeMillis = this.f;
        }
        objectNodeCreateObjectNode.put("expire_at", jCurrentTimeMillis);
        Logger.b("HttpDns", "saveDns:" + objectNodeCreateObjectNode.toString());
        a(str, objectNodeCreateObjectNode.toString(), str2);
    }

    public void b(String str) {
        String str2;
        if (this.e == null) {
            return;
        }
        Logger.b("HttpDns", "discardDns: networkType:" + str);
        synchronized (b.class) {
            if (this.a.getChannelType().equals("xmd")) {
                str2 = "xmd_dns_cache";
            } else if (this.a.getAivsConfig().getBoolean(AivsConfig.Connection.ENABLE_IPV6_HTTP_DNS) && this.e.contains("[") && this.e.contains("]")) {
                str2 = "ipv6_http_dns_cache";
                this.h = true;
                Logger.d("HttpDns", "connect ipv6 address " + this.e + " failed!");
            } else {
                str2 = "http_dns_cache";
            }
            String strC = c(str, str2);
            if (f.a(strC)) {
                return;
            }
            try {
                ObjectNode objectNode = (ObjectNode) APIUtils.getObjectMapper().readTree(strC);
                if (!objectNode.path("dns").isArray()) {
                    b(str, str2);
                    return;
                }
                ArrayNode arrayNode = (ArrayNode) objectNode.path("dns");
                for (int i = 0; i < arrayNode.size(); i++) {
                    if (this.e.equals(arrayNode.get(i).asText())) {
                        Logger.b("HttpDns", "discardDns: remove " + this.e);
                        arrayNode.remove(i);
                        if (arrayNode.size() > 0) {
                            a(arrayNode, false, str, str2);
                        } else {
                            if (this.a.getChannelType().equals("xmd")) {
                                this.a.getListener().a(this.a, "xmd_ws_expire_at", String.valueOf((System.currentTimeMillis() / 1000) + 86400));
                                Logger.b("HttpDns", "switch from xmd to ws next time");
                                this.j = true;
                            }
                            b(str, str2);
                        }
                        this.e = null;
                        break;
                    }
                }
                com.xiaomi.ai.core.d dVar = this.i;
                if (dVar != null) {
                    dVar.a(str);
                }
            } catch (IOException e) {
                Logger.d("HttpDns", Logger.throwableToString(e));
            }
        }
    }

    public void b(String str, String str2) {
        String strA = this.a.getListener().a(this.a, str2);
        if (f.a(strA)) {
            return;
        }
        try {
            ObjectNode objectNode = (ObjectNode) APIUtils.getObjectMapper().readTree(strA);
            if (objectNode != null) {
                objectNode.remove(f(str));
                this.a.getListener().a(this.a, str2, objectNode.toString());
            }
        } catch (IOException e) {
            Logger.d("HttpDns", Logger.throwableToString(e));
            this.a.getListener().b(this.a, str2);
        }
    }

    public boolean b() {
        return this.j;
    }

    public void c() {
        this.j = false;
    }

    public String d() {
        return this.d;
    }
}
