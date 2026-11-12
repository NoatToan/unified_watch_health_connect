package io.sentry;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import defpackage.hvg;
import defpackage.wzc;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class k implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f21732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f21733b;

    @NotNull
    public String c;

    @NotNull
    public Long d;

    @Nullable
    public Long e;

    @NotNull
    public Long f;

    @Nullable
    public Long g;

    @Nullable
    public Map<String, Object> h;

    public static final class a implements fsd<k> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            k kVar = new k();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "relative_start_ns":
                        Long lJ0 = f4hVar.j0();
                        if (lJ0 == null) {
                            break;
                        } else {
                            kVar.d = lJ0;
                            break;
                        }
                        break;
                    case "relative_end_ns":
                        Long lJ1 = f4hVar.j0();
                        if (lJ1 == null) {
                            break;
                        } else {
                            kVar.e = lJ1;
                            break;
                        }
                        break;
                    case "id":
                        String strB = f4hVar.B();
                        if (strB == null) {
                            break;
                        } else {
                            kVar.f21732a = strB;
                            break;
                        }
                        break;
                    case "name":
                        String strB2 = f4hVar.B();
                        if (strB2 == null) {
                            break;
                        } else {
                            kVar.c = strB2;
                            break;
                        }
                        break;
                    case "trace_id":
                        String strB3 = f4hVar.B();
                        if (strB3 == null) {
                            break;
                        } else {
                            kVar.f21733b = strB3;
                            break;
                        }
                        break;
                    case "relative_cpu_end_ms":
                        Long lJ2 = f4hVar.j0();
                        if (lJ2 == null) {
                            break;
                        } else {
                            kVar.g = lJ2;
                            break;
                        }
                        break;
                    case "relative_cpu_start_ms":
                        Long lJ3 = f4hVar.j0();
                        if (lJ3 == null) {
                            break;
                        } else {
                            kVar.f = lJ3;
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
            kVar.l(concurrentHashMap);
            f4hVar.endObject();
            return kVar;
        }
    }

    public k() {
        this(hvg.s(), 0L, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f21732a.equals(kVar.f21732a) && this.f21733b.equals(kVar.f21733b) && this.c.equals(kVar.c) && this.d.equals(kVar.d) && this.f.equals(kVar.f) && io.sentry.util.p.a(this.g, kVar.g) && io.sentry.util.p.a(this.e, kVar.e) && io.sentry.util.p.a(this.h, kVar.h);
    }

    @NotNull
    public String h() {
        return this.f21732a;
    }

    public int hashCode() {
        return io.sentry.util.p.b(this.f21732a, this.f21733b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @NotNull
    public String i() {
        return this.c;
    }

    @NotNull
    public String j() {
        return this.f21733b;
    }

    public void k(@NotNull Long l, @NotNull Long l2, @NotNull Long l3, @NotNull Long l4) {
        if (this.e == null) {
            this.e = Long.valueOf(l.longValue() - l2.longValue());
            this.d = Long.valueOf(this.d.longValue() - l2.longValue());
            this.g = Long.valueOf(l3.longValue() - l4.longValue());
            this.f = Long.valueOf(this.f.longValue() - l4.longValue());
        }
    }

    public void l(@Nullable Map<String, Object> map) {
        this.h = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("id").j(iLogger, this.f21732a);
        h4hVar.g("trace_id").j(iLogger, this.f21733b);
        h4hVar.g("name").j(iLogger, this.c);
        h4hVar.g("relative_start_ns").j(iLogger, this.d);
        h4hVar.g("relative_end_ns").j(iLogger, this.e);
        h4hVar.g("relative_cpu_start_ms").j(iLogger, this.f);
        h4hVar.g("relative_cpu_end_ms").j(iLogger, this.g);
        Map<String, Object> map = this.h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.h.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public k(@NotNull wzc wzcVar, @NotNull Long l, @NotNull Long l2) {
        this.f21732a = wzcVar.i().toString();
        this.f21733b = wzcVar.d().k().toString();
        this.c = wzcVar.getName().isEmpty() ? "unknown" : wzcVar.getName();
        this.d = l;
        this.f = l2;
    }
}
