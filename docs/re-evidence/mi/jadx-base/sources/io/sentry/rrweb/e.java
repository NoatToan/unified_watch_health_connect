package io.sentry.rrweb;

import com.miui.tsmclient.net.TSMAuthContants;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends b implements cud {

    @NotNull
    public String c;

    @Nullable
    public String d;

    @Nullable
    public String e;
    public double f;
    public double g;

    @Nullable
    public Map<String, Object> h;

    @Nullable
    public Map<String, Object> i;

    @Nullable
    public Map<String, Object> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Map<String, Object> f21838k;

    public static final class a implements fsd<e> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            e eVar = new e();
            b.a aVar = new b.a();
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals("data")) {
                    c(eVar, f4hVar, iLogger);
                } else if (!aVar.a(eVar, strNextName, f4hVar, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    f4hVar.l0(iLogger, map, strNextName);
                }
            }
            eVar.v(map);
            f4hVar.endObject();
            return eVar;
        }

        public final void c(@NotNull e eVar, @NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals(TSMAuthContants.PARAM_PAYLOAD)) {
                    d(eVar, f4hVar, iLogger);
                } else if (strNextName.equals("tag")) {
                    String strB = f4hVar.B();
                    if (strB == null) {
                        strB = "";
                    }
                    eVar.c = strB;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            eVar.p(concurrentHashMap);
            f4hVar.endObject();
        }

        public final void d(@NotNull e eVar, @NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "description":
                        eVar.e = f4hVar.B();
                        break;
                    case "endTimestamp":
                        eVar.g = f4hVar.nextDouble();
                        break;
                    case "startTimestamp":
                        eVar.f = f4hVar.nextDouble();
                        break;
                    case "op":
                        eVar.d = f4hVar.B();
                        break;
                    case "data":
                        Map mapC = io.sentry.util.b.c((Map) f4hVar.q0());
                        if (mapC == null) {
                            break;
                        } else {
                            eVar.h = mapC;
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            eVar.t(concurrentHashMap);
            f4hVar.endObject();
        }
    }

    public e() {
        super(RRWebEventType.Custom);
        this.c = "performanceSpan";
    }

    private void m(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("tag").c(this.c);
        h4hVar.g(TSMAuthContants.PARAM_PAYLOAD);
        n(h4hVar, iLogger);
        Map<String, Object> map = this.f21838k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21838k.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    private void n(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.d != null) {
            h4hVar.g("op").c(this.d);
        }
        if (this.e != null) {
            h4hVar.g("description").c(this.e);
        }
        h4hVar.g("startTimestamp").j(iLogger, BigDecimal.valueOf(this.f));
        h4hVar.g("endTimestamp").j(iLogger, BigDecimal.valueOf(this.g));
        if (this.h != null) {
            h4hVar.g("data").j(iLogger, this.h);
        }
        Map<String, Object> map = this.j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.j.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public void o(@Nullable Map<String, Object> map) {
        this.h = map == null ? null : new ConcurrentHashMap(map);
    }

    public void p(@Nullable Map<String, Object> map) {
        this.f21838k = map;
    }

    public void q(@Nullable String str) {
        this.e = str;
    }

    public void r(double d) {
        this.g = d;
    }

    public void s(@Nullable String str) {
        this.d = str;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        new b.C0972b().a(this, h4hVar, iLogger);
        h4hVar.g("data");
        m(h4hVar, iLogger);
        Map<String, Object> map = this.i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.i.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public void t(@Nullable Map<String, Object> map) {
        this.j = map;
    }

    public void u(double d) {
        this.f = d;
    }

    public void v(@Nullable Map<String, Object> map) {
        this.i = map;
    }
}
