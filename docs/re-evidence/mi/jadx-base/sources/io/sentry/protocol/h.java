package io.sentry.protocol;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f21787b;

    @Nullable
    public List<String> c;

    @Nullable
    public Map<String, Object> d;

    public static final class a implements fsd<h> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            h hVar = new h();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "params":
                        List list = (List) f4hVar.q0();
                        if (list == null) {
                            break;
                        } else {
                            hVar.c = list;
                            break;
                        }
                        break;
                    case "message":
                        hVar.f21787b = f4hVar.B();
                        break;
                    case "formatted":
                        hVar.f21786a = f4hVar.B();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            hVar.f(concurrentHashMap);
            f4hVar.endObject();
            return hVar;
        }
    }

    public void d(@Nullable String str) {
        this.f21786a = str;
    }

    public void e(@Nullable String str) {
        this.f21787b = str;
    }

    public void f(@Nullable Map<String, Object> map) {
        this.d = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21786a != null) {
            h4hVar.g("formatted").c(this.f21786a);
        }
        if (this.f21787b != null) {
            h4hVar.g("message").c(this.f21787b);
        }
        List<String> list = this.c;
        if (list != null && !list.isEmpty()) {
            h4hVar.g("params").j(iLogger, this.c);
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
