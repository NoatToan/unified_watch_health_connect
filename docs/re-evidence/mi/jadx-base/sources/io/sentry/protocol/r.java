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
public final class r implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f21808b;

    @Nullable
    public String c;

    @Nullable
    public Map<String, Object> d;

    public static final class a implements fsd<r> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            r rVar = new r();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "raw_description":
                        rVar.c = f4hVar.B();
                        break;
                    case "name":
                        rVar.f21807a = f4hVar.B();
                        break;
                    case "version":
                        rVar.f21808b = f4hVar.B();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            rVar.g(concurrentHashMap);
            f4hVar.endObject();
            return rVar;
        }
    }

    public r() {
    }

    public r(@NotNull r rVar) {
        this.f21807a = rVar.f21807a;
        this.f21808b = rVar.f21808b;
        this.c = rVar.c;
        this.d = io.sentry.util.b.c(rVar.d);
    }

    @Nullable
    public String d() {
        return this.f21807a;
    }

    @Nullable
    public String e() {
        return this.f21808b;
    }

    public void f(@Nullable String str) {
        this.f21807a = str;
    }

    public void g(@Nullable Map<String, Object> map) {
        this.d = map;
    }

    public void h(@Nullable String str) {
        this.f21808b = str;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21807a != null) {
            h4hVar.g("name").c(this.f21807a);
        }
        if (this.f21808b != null) {
            h4hVar.g("version").c(this.f21808b);
        }
        if (this.c != null) {
            h4hVar.g("raw_description").c(this.c);
        }
        Map<String, Object> map = this.d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.d.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }
}
