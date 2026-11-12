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
public final class k implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f21793b;

    @Nullable
    public String c;

    @Nullable
    public Object d;

    @Nullable
    public String e;

    @Nullable
    public Map<String, String> f;

    @Nullable
    public Map<String, String> g;

    @Nullable
    public Long h;

    @Nullable
    public Map<String, String> i;

    @Nullable
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f21794k;

    @Nullable
    public Map<String, Object> l;

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
                    case "fragment":
                        kVar.j = f4hVar.B();
                        break;
                    case "method":
                        kVar.f21793b = f4hVar.B();
                        break;
                    case "env":
                        Map map = (Map) f4hVar.q0();
                        if (map == null) {
                            break;
                        } else {
                            kVar.g = io.sentry.util.b.c(map);
                            break;
                        }
                        break;
                    case "url":
                        kVar.f21792a = f4hVar.B();
                        break;
                    case "data":
                        kVar.d = f4hVar.q0();
                        break;
                    case "other":
                        Map map2 = (Map) f4hVar.q0();
                        if (map2 == null) {
                            break;
                        } else {
                            kVar.i = io.sentry.util.b.c(map2);
                            break;
                        }
                        break;
                    case "headers":
                        Map map3 = (Map) f4hVar.q0();
                        if (map3 == null) {
                            break;
                        } else {
                            kVar.f = io.sentry.util.b.c(map3);
                            break;
                        }
                        break;
                    case "cookies":
                        kVar.e = f4hVar.B();
                        break;
                    case "body_size":
                        kVar.h = f4hVar.j0();
                        break;
                    case "query_string":
                        kVar.c = f4hVar.B();
                        break;
                    case "api_target":
                        kVar.f21794k = f4hVar.B();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            kVar.m(concurrentHashMap);
            f4hVar.endObject();
            return kVar;
        }
    }

    public k() {
    }

    public k(@NotNull k kVar) {
        this.f21792a = kVar.f21792a;
        this.e = kVar.e;
        this.f21793b = kVar.f21793b;
        this.c = kVar.c;
        this.f = io.sentry.util.b.c(kVar.f);
        this.g = io.sentry.util.b.c(kVar.g);
        this.i = io.sentry.util.b.c(kVar.i);
        this.l = io.sentry.util.b.c(kVar.l);
        this.d = kVar.d;
        this.j = kVar.j;
        this.h = kVar.h;
        this.f21794k = kVar.f21794k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return io.sentry.util.p.a(this.f21792a, kVar.f21792a) && io.sentry.util.p.a(this.f21793b, kVar.f21793b) && io.sentry.util.p.a(this.c, kVar.c) && io.sentry.util.p.a(this.e, kVar.e) && io.sentry.util.p.a(this.f, kVar.f) && io.sentry.util.p.a(this.g, kVar.g) && io.sentry.util.p.a(this.h, kVar.h) && io.sentry.util.p.a(this.j, kVar.j) && io.sentry.util.p.a(this.f21794k, kVar.f21794k);
    }

    public int hashCode() {
        return io.sentry.util.p.b(this.f21792a, this.f21793b, this.c, this.e, this.f, this.g, this.h, this.j, this.f21794k);
    }

    @Nullable
    public Map<String, String> l() {
        return this.f;
    }

    public void m(@Nullable Map<String, Object> map) {
        this.l = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21792a != null) {
            h4hVar.g("url").c(this.f21792a);
        }
        if (this.f21793b != null) {
            h4hVar.g("method").c(this.f21793b);
        }
        if (this.c != null) {
            h4hVar.g("query_string").c(this.c);
        }
        if (this.d != null) {
            h4hVar.g("data").j(iLogger, this.d);
        }
        if (this.e != null) {
            h4hVar.g("cookies").c(this.e);
        }
        if (this.f != null) {
            h4hVar.g("headers").j(iLogger, this.f);
        }
        if (this.g != null) {
            h4hVar.g("env").j(iLogger, this.g);
        }
        if (this.i != null) {
            h4hVar.g("other").j(iLogger, this.i);
        }
        if (this.j != null) {
            h4hVar.g("fragment").j(iLogger, this.j);
        }
        if (this.h != null) {
            h4hVar.g("body_size").j(iLogger, this.h);
        }
        if (this.f21794k != null) {
            h4hVar.g("api_target").j(iLogger, this.f21794k);
        }
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
}
