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
public final class b implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f21775b;

    @Nullable
    public Map<String, Object> c;

    public static final class a implements fsd<b> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals("name")) {
                    bVar.f21774a = f4hVar.B();
                } else if (strNextName.equals("version")) {
                    bVar.f21775b = f4hVar.B();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            bVar.c(concurrentHashMap);
            f4hVar.endObject();
            return bVar;
        }
    }

    public b() {
    }

    public b(@NotNull b bVar) {
        this.f21774a = bVar.f21774a;
        this.f21775b = bVar.f21775b;
        this.c = io.sentry.util.b.c(bVar.c);
    }

    public void c(@Nullable Map<String, Object> map) {
        this.c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return io.sentry.util.p.a(this.f21774a, bVar.f21774a) && io.sentry.util.p.a(this.f21775b, bVar.f21775b);
    }

    public int hashCode() {
        return io.sentry.util.p.b(this.f21774a, this.f21775b);
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21774a != null) {
            h4hVar.g("name").c(this.f21774a);
        }
        if (this.f21775b != null) {
            h4hVar.g("version").c(this.f21775b);
        }
        Map<String, Object> map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.c.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }
}
