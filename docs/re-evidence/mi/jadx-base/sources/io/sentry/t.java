package io.sentry;

import com.xiaomi.smarthome.homeroom.model.Home;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f21843b;

    @Nullable
    public String c;

    @Nullable
    public String d;

    @Nullable
    public Long e;

    @Nullable
    public Map<String, Object> f;

    public static final class a implements fsd<t> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            t tVar = new t();
            f4hVar.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "package_name":
                        tVar.c = f4hVar.B();
                        break;
                    case "thread_id":
                        tVar.e = f4hVar.j0();
                        break;
                    case "address":
                        tVar.f21843b = f4hVar.B();
                        break;
                    case "class_name":
                        tVar.d = f4hVar.B();
                        break;
                    case "type":
                        tVar.f21842a = f4hVar.nextInt();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            tVar.m(concurrentHashMap);
            f4hVar.endObject();
            return tVar;
        }
    }

    public t() {
    }

    public t(@NotNull t tVar) {
        this.f21842a = tVar.f21842a;
        this.f21843b = tVar.f21843b;
        this.c = tVar.c;
        this.d = tVar.d;
        this.e = tVar.e;
        this.f = io.sentry.util.b.c(tVar.f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.p.a(this.f21843b, ((t) obj).f21843b);
    }

    @Nullable
    public String f() {
        return this.f21843b;
    }

    public int g() {
        return this.f21842a;
    }

    public void h(@Nullable String str) {
        this.f21843b = str;
    }

    public int hashCode() {
        return io.sentry.util.p.b(this.f21843b);
    }

    public void i(@Nullable String str) {
        this.d = str;
    }

    public void j(@Nullable String str) {
        this.c = str;
    }

    public void k(@Nullable Long l) {
        this.e = l;
    }

    public void l(int i) {
        this.f21842a = i;
    }

    public void m(@Nullable Map<String, Object> map) {
        this.f = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("type").d(this.f21842a);
        if (this.f21843b != null) {
            h4hVar.g(Home.JSON_KEY_ADDRESS).c(this.f21843b);
        }
        if (this.c != null) {
            h4hVar.g("package_name").c(this.c);
        }
        if (this.d != null) {
            h4hVar.g("class_name").c(this.d);
        }
        if (this.e != null) {
            h4hVar.g("thread_id").i(this.e);
        }
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
}
