package io.sentry.rrweb;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.util.p;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends b implements cud {

    @NotNull
    public String c;
    public int d;
    public int e;

    @Nullable
    public Map<String, Object> f;

    @Nullable
    public Map<String, Object> g;

    public static final class a implements fsd<d> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            d dVar = new d();
            b.a aVar = new b.a();
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals("data")) {
                    c(dVar, f4hVar, iLogger);
                } else if (!aVar.a(dVar, strNextName, f4hVar, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    f4hVar.l0(iLogger, map, strNextName);
                }
            }
            dVar.m(map);
            f4hVar.endObject();
            return dVar;
        }

        public final void c(@NotNull d dVar, @NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "height":
                        Integer numH0 = f4hVar.h0();
                        dVar.d = numH0 != null ? numH0.intValue() : 0;
                        break;
                    case "href":
                        String strB = f4hVar.B();
                        if (strB == null) {
                            strB = "";
                        }
                        dVar.c = strB;
                        break;
                    case "width":
                        Integer numH1 = f4hVar.h0();
                        dVar.e = numH1 != null ? numH1.intValue() : 0;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            dVar.k(concurrentHashMap);
            f4hVar.endObject();
        }
    }

    public d() {
        super(RRWebEventType.Meta);
        this.c = "";
    }

    private void j(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("href").c(this.c);
        h4hVar.g("height").d(this.d);
        h4hVar.g("width").d(this.e);
        Map<String, Object> map = this.f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        d dVar = (d) obj;
        return this.d == dVar.d && this.e == dVar.e && p.a(this.c, dVar.c);
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return p.b(Integer.valueOf(super.hashCode()), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e));
    }

    public void k(@Nullable Map<String, Object> map) {
        this.g = map;
    }

    public void l(int i) {
        this.d = i;
    }

    public void m(@Nullable Map<String, Object> map) {
        this.f = map;
    }

    public void n(int i) {
        this.e = i;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        new b.C0972b().a(this, h4hVar, iLogger);
        h4hVar.g("data");
        j(h4hVar, iLogger);
        h4hVar.endObject();
    }
}
