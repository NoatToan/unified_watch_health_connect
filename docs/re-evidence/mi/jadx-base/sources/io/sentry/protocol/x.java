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
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class x implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f21822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Map<String, Object> f21823b;

    public static final class a implements fsd<x> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            String strB = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals("source")) {
                    strB = f4hVar.B();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            x xVar = new x(strB);
            xVar.a(concurrentHashMap);
            f4hVar.endObject();
            return xVar;
        }
    }

    public x(@Nullable String str) {
        this.f21822a = str;
    }

    public void a(@Nullable Map<String, Object> map) {
        this.f21823b = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21822a != null) {
            h4hVar.g("source").j(iLogger, this.f21822a);
        }
        Map<String, Object> map = this.f21823b;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21823b.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }
}
