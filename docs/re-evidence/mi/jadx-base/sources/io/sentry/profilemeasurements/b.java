package io.sentry.profilemeasurements;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.util.p;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class b implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Map<String, Object> f21762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f21763b;
    public double c;

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
                if (strNextName.equals("elapsed_since_start_ns")) {
                    String strB = f4hVar.B();
                    if (strB != null) {
                        bVar.f21763b = strB;
                    }
                } else if (strNextName.equals("value")) {
                    Double dW = f4hVar.W();
                    if (dW != null) {
                        bVar.c = dW.doubleValue();
                    }
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
        this(0L, 0);
    }

    public void c(@Nullable Map<String, Object> map) {
        this.f21762a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return p.a(this.f21762a, bVar.f21762a) && this.f21763b.equals(bVar.f21763b) && this.c == bVar.c;
    }

    public int hashCode() {
        return p.b(this.f21762a, this.f21763b, Double.valueOf(this.c));
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("value").j(iLogger, Double.valueOf(this.c));
        h4hVar.g("elapsed_since_start_ns").j(iLogger, this.f21763b);
        Map<String, Object> map = this.f21762a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21762a.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public b(@NotNull Long l, @NotNull Number number) {
        this.f21763b = l.toString();
        this.c = number.doubleValue();
    }
}
