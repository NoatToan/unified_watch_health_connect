package io.sentry.rrweb;

import com.miui.tsmclient.net.TSMAuthContants;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends b implements cud {

    @NotNull
    public String c;
    public double d;

    @Nullable
    public String e;

    @Nullable
    public String f;

    @Nullable
    public String g;

    @Nullable
    public SentryLevel h;

    @Nullable
    public Map<String, Object> i;

    @Nullable
    public Map<String, Object> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Map<String, Object> f21833k;

    @Nullable
    public Map<String, Object> l;

    /* JADX INFO: renamed from: io.sentry.rrweb.a$a, reason: collision with other inner class name */
    public static final class C0971a implements fsd<a> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            a aVar = new a();
            b.a aVar2 = new b.a();
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals("data")) {
                    c(aVar, f4hVar, iLogger);
                } else if (!aVar2.a(aVar, strNextName, f4hVar, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    f4hVar.l0(iLogger, map, strNextName);
                }
            }
            aVar.z(map);
            f4hVar.endObject();
            return aVar;
        }

        public final void c(@NotNull a aVar, @NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals(TSMAuthContants.PARAM_PAYLOAD)) {
                    d(aVar, f4hVar, iLogger);
                } else if (strNextName.equals("tag")) {
                    String strB = f4hVar.B();
                    if (strB == null) {
                        strB = "";
                    }
                    aVar.c = strB;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            aVar.v(concurrentHashMap);
            f4hVar.endObject();
        }

        public final void d(@NotNull a aVar, @NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "data":
                        Map mapC = io.sentry.util.b.c((Map) f4hVar.q0());
                        if (mapC == null) {
                            break;
                        } else {
                            aVar.i = mapC;
                            break;
                        }
                        break;
                    case "type":
                        aVar.e = f4hVar.B();
                        break;
                    case "category":
                        aVar.f = f4hVar.B();
                        break;
                    case "timestamp":
                        aVar.d = f4hVar.nextDouble();
                        break;
                    case "level":
                        try {
                            aVar.h = new SentryLevel.a().a(f4hVar, iLogger);
                            break;
                        } catch (Exception e) {
                            iLogger.b(SentryLevel.DEBUG, e, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        aVar.g = f4hVar.B();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            aVar.y(concurrentHashMap);
            f4hVar.endObject();
        }
    }

    public a() {
        super(RRWebEventType.Custom);
        this.c = "breadcrumb";
    }

    @Nullable
    public String n() {
        return this.f;
    }

    @Nullable
    public Map<String, Object> o() {
        return this.i;
    }

    public final void p(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("tag").c(this.c);
        h4hVar.g(TSMAuthContants.PARAM_PAYLOAD);
        q(h4hVar, iLogger);
        Map<String, Object> map = this.l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.l.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public final void q(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.e != null) {
            h4hVar.g("type").c(this.e);
        }
        h4hVar.g("timestamp").j(iLogger, BigDecimal.valueOf(this.d));
        if (this.f != null) {
            h4hVar.g("category").c(this.f);
        }
        if (this.g != null) {
            h4hVar.g("message").c(this.g);
        }
        if (this.h != null) {
            h4hVar.g("level").j(iLogger, this.h);
        }
        if (this.i != null) {
            h4hVar.g("data").j(iLogger, this.i);
        }
        Map<String, Object> map = this.f21833k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21833k.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public void r(double d) {
        this.d = d;
    }

    public void s(@Nullable String str) {
        this.e = str;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        new b.C0972b().a(this, h4hVar, iLogger);
        h4hVar.g("data");
        p(h4hVar, iLogger);
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

    public void t(@Nullable String str) {
        this.f = str;
    }

    public void u(@Nullable Map<String, Object> map) {
        this.i = map == null ? null : new ConcurrentHashMap(map);
    }

    public void v(@Nullable Map<String, Object> map) {
        this.l = map;
    }

    public void w(@Nullable SentryLevel sentryLevel) {
        this.h = sentryLevel;
    }

    public void x(@Nullable String str) {
        this.g = str;
    }

    public void y(@Nullable Map<String, Object> map) {
        this.f21833k = map;
    }

    public void z(@Nullable Map<String, Object> map) {
        this.j = map;
    }
}
