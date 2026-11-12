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
public final class y implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f21825b;

    @Nullable
    public String c;

    @Deprecated
    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public String f;

    @Nullable
    public d g;

    @Nullable
    public Map<String, String> h;

    @Nullable
    public Map<String, Object> i;

    public static final class a implements fsd<y> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            y yVar = new y();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "username":
                        yVar.c = f4hVar.B();
                        break;
                    case "id":
                        yVar.f21825b = f4hVar.B();
                        break;
                    case "geo":
                        yVar.g = new d.a().a(f4hVar, iLogger);
                        break;
                    case "data":
                        yVar.h = io.sentry.util.b.c((Map) f4hVar.q0());
                        break;
                    case "name":
                        yVar.f = f4hVar.B();
                        break;
                    case "email":
                        yVar.f21824a = f4hVar.B();
                        break;
                    case "other":
                        if (yVar.h != null && !yVar.h.isEmpty()) {
                            break;
                        } else {
                            yVar.h = io.sentry.util.b.c((Map) f4hVar.q0());
                            break;
                        }
                        break;
                    case "ip_address":
                        yVar.e = f4hVar.B();
                        break;
                    case "segment":
                        yVar.d = f4hVar.B();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            yVar.p(concurrentHashMap);
            f4hVar.endObject();
            return yVar;
        }
    }

    public y() {
    }

    public y(@NotNull y yVar) {
        this.f21824a = yVar.f21824a;
        this.c = yVar.c;
        this.f21825b = yVar.f21825b;
        this.e = yVar.e;
        this.d = yVar.d;
        this.f = yVar.f;
        this.g = yVar.g;
        this.h = io.sentry.util.b.c(yVar.h);
        this.i = io.sentry.util.b.c(yVar.i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return io.sentry.util.p.a(this.f21824a, yVar.f21824a) && io.sentry.util.p.a(this.f21825b, yVar.f21825b) && io.sentry.util.p.a(this.c, yVar.c) && io.sentry.util.p.a(this.d, yVar.d) && io.sentry.util.p.a(this.e, yVar.e);
    }

    public int hashCode() {
        return io.sentry.util.p.b(this.f21824a, this.f21825b, this.c, this.d, this.e);
    }

    @Nullable
    public Map<String, String> j() {
        return this.h;
    }

    @Nullable
    public String k() {
        return this.f21825b;
    }

    @Nullable
    public String l() {
        return this.e;
    }

    @Deprecated
    @Nullable
    public String m() {
        return this.d;
    }

    public void n(@Nullable String str) {
        this.f21825b = str;
    }

    public void o(@Nullable String str) {
        this.e = str;
    }

    public void p(@Nullable Map<String, Object> map) {
        this.i = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21824a != null) {
            h4hVar.g("email").c(this.f21824a);
        }
        if (this.f21825b != null) {
            h4hVar.g("id").c(this.f21825b);
        }
        if (this.c != null) {
            h4hVar.g("username").c(this.c);
        }
        if (this.d != null) {
            h4hVar.g("segment").c(this.d);
        }
        if (this.e != null) {
            h4hVar.g("ip_address").c(this.e);
        }
        if (this.f != null) {
            h4hVar.g("name").c(this.f);
        }
        if (this.g != null) {
            h4hVar.g("geo");
            this.g.serialize(h4hVar, iLogger);
        }
        if (this.h != null) {
            h4hVar.g("data").j(iLogger, this.h);
        }
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
}
