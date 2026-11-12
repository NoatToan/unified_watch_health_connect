package io.sentry.clientreport;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class f implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f21699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f21700b;

    @NotNull
    public final Long c;

    @Nullable
    public Map<String, Object> d;

    public static final class a implements fsd<f> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(SentryLevel.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            String strB = null;
            String strB2 = null;
            Long lJ0 = null;
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "quantity":
                        lJ0 = f4hVar.j0();
                        break;
                    case "reason":
                        strB = f4hVar.B();
                        break;
                    case "category":
                        strB2 = f4hVar.B();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        f4hVar.l0(iLogger, map, strNextName);
                        break;
                }
            }
            f4hVar.endObject();
            if (strB == null) {
                throw c("reason", iLogger);
            }
            if (strB2 == null) {
                throw c("category", iLogger);
            }
            if (lJ0 == null) {
                throw c("quantity", iLogger);
            }
            f fVar = new f(strB, strB2, lJ0);
            fVar.d(map);
            return fVar;
        }
    }

    public f(@NotNull String str, @NotNull String str2, @NotNull Long l) {
        this.f21699a = str;
        this.f21700b = str2;
        this.c = l;
    }

    @NotNull
    public String a() {
        return this.f21700b;
    }

    @NotNull
    public Long b() {
        return this.c;
    }

    @NotNull
    public String c() {
        return this.f21699a;
    }

    public void d(@Nullable Map<String, Object> map) {
        this.d = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("reason").c(this.f21699a);
        h4hVar.g("category").c(this.f21700b);
        h4hVar.g("quantity").i(this.c);
        Map<String, Object> map = this.d;
        if (map != null) {
            for (String str : map.keySet()) {
                h4hVar.g(str).j(iLogger, this.d.get(str));
            }
        }
        h4hVar.endObject();
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.f21699a + "', category='" + this.f21700b + "', quantity=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
