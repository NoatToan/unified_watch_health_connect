package io.sentry.protocol;

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
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f21805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f21806b;

    @Nullable
    public Map<String, Object> c;

    public static final class a implements fsd<q> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals("name")) {
                    strNextString = f4hVar.nextString();
                } else if (strNextName.equals("version")) {
                    strNextString2 = f4hVar.nextString();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    f4hVar.l0(iLogger, map, strNextName);
                }
            }
            f4hVar.endObject();
            if (strNextString == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.a(SentryLevel.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strNextString2 != null) {
                q qVar = new q(strNextString, strNextString2);
                qVar.a(map);
                return qVar;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
            iLogger.a(SentryLevel.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public q(@NotNull String str, @NotNull String str2) {
        this.f21805a = (String) io.sentry.util.p.c(str, "name is required.");
        this.f21806b = (String) io.sentry.util.p.c(str2, "version is required.");
    }

    public void a(@Nullable Map<String, Object> map) {
        this.c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return Objects.equals(this.f21805a, qVar.f21805a) && Objects.equals(this.f21806b, qVar.f21806b);
    }

    public int hashCode() {
        return Objects.hash(this.f21805a, this.f21806b);
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("name").c(this.f21805a);
        h4hVar.g("version").c(this.f21806b);
        Map<String, Object> map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                h4hVar.g(str).j(iLogger, this.c.get(str));
            }
        }
        h4hVar.endObject();
    }
}
