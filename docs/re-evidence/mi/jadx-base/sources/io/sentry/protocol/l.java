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
public final class l implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Map<String, String> f21796b;

    @Nullable
    public Integer c;

    @Nullable
    public Long d;

    @Nullable
    public Object e;

    @Nullable
    public Map<String, Object> f;

    public static final class a implements fsd<l> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            l lVar = new l();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "status_code":
                        lVar.c = f4hVar.h0();
                        break;
                    case "data":
                        lVar.e = f4hVar.q0();
                        break;
                    case "headers":
                        Map map = (Map) f4hVar.q0();
                        if (map == null) {
                            break;
                        } else {
                            lVar.f21796b = io.sentry.util.b.c(map);
                            break;
                        }
                        break;
                    case "cookies":
                        lVar.f21795a = f4hVar.B();
                        break;
                    case "body_size":
                        lVar.d = f4hVar.j0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            lVar.f(concurrentHashMap);
            f4hVar.endObject();
            return lVar;
        }
    }

    public l() {
    }

    public l(@NotNull l lVar) {
        this.f21795a = lVar.f21795a;
        this.f21796b = io.sentry.util.b.c(lVar.f21796b);
        this.f = io.sentry.util.b.c(lVar.f);
        this.c = lVar.c;
        this.d = lVar.d;
        this.e = lVar.e;
    }

    public void f(@Nullable Map<String, Object> map) {
        this.f = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21795a != null) {
            h4hVar.g("cookies").c(this.f21795a);
        }
        if (this.f21796b != null) {
            h4hVar.g("headers").j(iLogger, this.f21796b);
        }
        if (this.c != null) {
            h4hVar.g("status_code").j(iLogger, this.c);
        }
        if (this.d != null) {
            h4hVar.g("body_size").j(iLogger, this.d);
        }
        if (this.e != null) {
            h4hVar.g("data").j(iLogger, this.e);
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
