package io.sentry.protocol;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class f implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Number f21782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f21783b;

    @Nullable
    public Map<String, Object> c;

    public static final class a implements fsd<f> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            Number number = null;
            String strB = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals("unit")) {
                    strB = f4hVar.B();
                } else if (strNextName.equals("value")) {
                    number = (Number) f4hVar.q0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            f4hVar.endObject();
            if (number != null) {
                f fVar = new f(number, strB);
                fVar.a(concurrentHashMap);
                return fVar;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            iLogger.a(SentryLevel.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public f(@NotNull Number number, @Nullable String str) {
        this.f21782a = number;
        this.f21783b = str;
    }

    public void a(@Nullable Map<String, Object> map) {
        this.c = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("value").i(this.f21782a);
        if (this.f21783b != null) {
            h4hVar.g("unit").c(this.f21783b);
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
