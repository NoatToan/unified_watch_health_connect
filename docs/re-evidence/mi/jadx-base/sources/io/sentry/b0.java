package io.sentry;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.p f21663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f21664b;

    @Nullable
    public String c;

    @Nullable
    public String d;

    @Nullable
    public Map<String, Object> e;

    public static final class a implements fsd<b0> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b0 a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            io.sentry.protocol.p pVarA = null;
            String strB = null;
            String strB2 = null;
            String strB3 = null;
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "comments":
                        strB3 = f4hVar.B();
                        break;
                    case "name":
                        strB = f4hVar.B();
                        break;
                    case "email":
                        strB2 = f4hVar.B();
                        break;
                    case "event_id":
                        pVarA = new io.sentry.protocol.p.a().a(f4hVar, iLogger);
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
            if (pVarA != null) {
                b0 b0Var = new b0(pVarA, strB, strB2, strB3);
                b0Var.a(map);
                return b0Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            iLogger.a(SentryLevel.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public b0(io.sentry.protocol.p pVar, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f21663a = pVar;
        this.f21664b = str;
        this.c = str2;
        this.d = str3;
    }

    public void a(@Nullable Map<String, Object> map) {
        this.e = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("event_id");
        this.f21663a.serialize(h4hVar, iLogger);
        if (this.f21664b != null) {
            h4hVar.g("name").c(this.f21664b);
        }
        if (this.c != null) {
            h4hVar.g("email").c(this.c);
        }
        if (this.d != null) {
            h4hVar.g("comments").c(this.d);
        }
        Map<String, Object> map = this.e;
        if (map != null) {
            for (String str : map.keySet()) {
                h4hVar.g(str).j(iLogger, this.e.get(str));
            }
        }
        h4hVar.endObject();
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.f21663a + ", name='" + this.f21664b + "', email='" + this.c + "', comments='" + this.d + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
