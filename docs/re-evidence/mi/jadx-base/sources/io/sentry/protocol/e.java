package io.sentry.protocol;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f21781b;

    @Nullable
    public String c;

    @Nullable
    public String d;

    @Nullable
    public Integer e;

    @Nullable
    public String f;

    @Nullable
    public Boolean g;

    @Nullable
    public String h;

    @Nullable
    public String i;

    @Nullable
    public Map<String, Object> j;

    public static final class a implements fsd<e> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            e eVar = new e();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "npot_support":
                        eVar.i = f4hVar.B();
                        break;
                    case "vendor_id":
                        eVar.c = f4hVar.B();
                        break;
                    case "multi_threaded_rendering":
                        eVar.g = f4hVar.t();
                        break;
                    case "id":
                        eVar.f21781b = f4hVar.h0();
                        break;
                    case "name":
                        eVar.f21780a = f4hVar.B();
                        break;
                    case "vendor_name":
                        eVar.d = f4hVar.B();
                        break;
                    case "version":
                        eVar.h = f4hVar.B();
                        break;
                    case "api_type":
                        eVar.f = f4hVar.B();
                        break;
                    case "memory_size":
                        eVar.e = f4hVar.h0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            eVar.j(concurrentHashMap);
            f4hVar.endObject();
            return eVar;
        }
    }

    public e() {
    }

    public e(@NotNull e eVar) {
        this.f21780a = eVar.f21780a;
        this.f21781b = eVar.f21781b;
        this.c = eVar.c;
        this.d = eVar.d;
        this.e = eVar.e;
        this.f = eVar.f;
        this.g = eVar.g;
        this.h = eVar.h;
        this.i = eVar.i;
        this.j = io.sentry.util.b.c(eVar.j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return io.sentry.util.p.a(this.f21780a, eVar.f21780a) && io.sentry.util.p.a(this.f21781b, eVar.f21781b) && io.sentry.util.p.a(this.c, eVar.c) && io.sentry.util.p.a(this.d, eVar.d) && io.sentry.util.p.a(this.e, eVar.e) && io.sentry.util.p.a(this.f, eVar.f) && io.sentry.util.p.a(this.g, eVar.g) && io.sentry.util.p.a(this.h, eVar.h) && io.sentry.util.p.a(this.i, eVar.i);
    }

    public int hashCode() {
        return io.sentry.util.p.b(this.f21780a, this.f21781b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public void j(@Nullable Map<String, Object> map) {
        this.j = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21780a != null) {
            h4hVar.g("name").c(this.f21780a);
        }
        if (this.f21781b != null) {
            h4hVar.g("id").i(this.f21781b);
        }
        if (this.c != null) {
            h4hVar.g("vendor_id").c(this.c);
        }
        if (this.d != null) {
            h4hVar.g("vendor_name").c(this.d);
        }
        if (this.e != null) {
            h4hVar.g("memory_size").i(this.e);
        }
        if (this.f != null) {
            h4hVar.g("api_type").c(this.f);
        }
        if (this.g != null) {
            h4hVar.g("multi_threaded_rendering").k(this.g);
        }
        if (this.h != null) {
            h4hVar.g("version").c(this.h);
        }
        if (this.i != null) {
            h4hVar.g("npot_support").c(this.i);
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
}
