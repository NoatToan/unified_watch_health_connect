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
public final class d implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f21779b;

    @Nullable
    public String c;

    @Nullable
    public Map<String, Object> d;

    public static final class a implements fsd<d> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            d dVar = new d();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "region":
                        dVar.c = f4hVar.B();
                        break;
                    case "city":
                        dVar.f21778a = f4hVar.B();
                        break;
                    case "country_code":
                        dVar.f21779b = f4hVar.B();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            dVar.d(concurrentHashMap);
            f4hVar.endObject();
            return dVar;
        }
    }

    public void d(@Nullable Map<String, Object> map) {
        this.d = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21778a != null) {
            h4hVar.g("city").c(this.f21778a);
        }
        if (this.f21779b != null) {
            h4hVar.g("country_code").c(this.f21779b);
        }
        if (this.c != null) {
            h4hVar.g("region").c(this.c);
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
