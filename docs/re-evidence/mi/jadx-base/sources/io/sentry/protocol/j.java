package io.sentry.protocol;

import com.xiaomi.onetrack.OneTrack;
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
public final class j implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f21791b;

    @Nullable
    public String c;

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public Boolean f;

    @Nullable
    public Map<String, Object> g;

    public static final class a implements fsd<j> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            j jVar = new j();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "rooted":
                        jVar.f = f4hVar.t();
                        break;
                    case "raw_description":
                        jVar.c = f4hVar.B();
                        break;
                    case "name":
                        jVar.f21790a = f4hVar.B();
                        break;
                    case "build":
                        jVar.d = f4hVar.B();
                        break;
                    case "version":
                        jVar.f21791b = f4hVar.B();
                        break;
                    case "kernel_version":
                        jVar.e = f4hVar.B();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            jVar.l(concurrentHashMap);
            f4hVar.endObject();
            return jVar;
        }
    }

    public j() {
    }

    public j(@NotNull j jVar) {
        this.f21790a = jVar.f21790a;
        this.f21791b = jVar.f21791b;
        this.c = jVar.c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f = jVar.f;
        this.g = io.sentry.util.b.c(jVar.g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return io.sentry.util.p.a(this.f21790a, jVar.f21790a) && io.sentry.util.p.a(this.f21791b, jVar.f21791b) && io.sentry.util.p.a(this.c, jVar.c) && io.sentry.util.p.a(this.d, jVar.d) && io.sentry.util.p.a(this.e, jVar.e) && io.sentry.util.p.a(this.f, jVar.f);
    }

    @Nullable
    public String g() {
        return this.f21790a;
    }

    public void h(@Nullable String str) {
        this.d = str;
    }

    public int hashCode() {
        return io.sentry.util.p.b(this.f21790a, this.f21791b, this.c, this.d, this.e, this.f);
    }

    public void i(@Nullable String str) {
        this.e = str;
    }

    public void j(@Nullable String str) {
        this.f21790a = str;
    }

    public void k(@Nullable Boolean bool) {
        this.f = bool;
    }

    public void l(@Nullable Map<String, Object> map) {
        this.g = map;
    }

    public void m(@Nullable String str) {
        this.f21791b = str;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21790a != null) {
            h4hVar.g("name").c(this.f21790a);
        }
        if (this.f21791b != null) {
            h4hVar.g("version").c(this.f21791b);
        }
        if (this.c != null) {
            h4hVar.g("raw_description").c(this.c);
        }
        if (this.d != null) {
            h4hVar.g(OneTrack.Param.BUILD).c(this.d);
        }
        if (this.e != null) {
            h4hVar.g("kernel_version").c(this.e);
        }
        if (this.f != null) {
            h4hVar.g("rooted").k(this.f);
        }
        Map<String, Object> map = this.g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.g.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }
}
