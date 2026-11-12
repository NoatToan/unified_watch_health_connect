package io.sentry;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.protocol.Contexts;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Experimental
public final class y implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final io.sentry.protocol.p f21925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f21926b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;

    @Nullable
    public final String f;

    @Nullable
    public final String g;

    @Nullable
    public final String h;

    @Nullable
    public final String i;

    @Nullable
    public final io.sentry.protocol.p j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Map<String, Object> f21927k;

    public static final class b implements fsd<y> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(SentryLevel.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Code duplicated, block: B:77:0x013d A[PHI: r4
          0x013d: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String) binds: [B:72:0x012c, B:75:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            String str;
            String strB;
            f4hVar.beginObject();
            c cVar = null;
            String strA = null;
            io.sentry.protocol.p pVarA = null;
            String strB2 = null;
            String strNextString = null;
            String strB3 = null;
            String strB4 = null;
            String strB5 = null;
            String strB6 = null;
            String strB7 = null;
            io.sentry.protocol.p pVarA2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (true) {
                io.sentry.protocol.p pVar = pVarA2;
                String str2 = strB7;
                if (f4hVar.peek() != JsonToken.NAME) {
                    if (pVarA == null) {
                        throw c("trace_id", iLogger);
                    }
                    if (strNextString == null) {
                        throw c("public_key", iLogger);
                    }
                    if (cVar == null) {
                        str = strA;
                        strB = strB2;
                    } else {
                        if (strA == null) {
                            strA = cVar.a();
                        }
                        if (strB2 == null) {
                            strB = cVar.b();
                            str = strA;
                        } else {
                            str = strA;
                            strB = strB2;
                        }
                    }
                    y yVar = new y(pVarA, strNextString, strB3, strB4, str, strB, strB5, strB6, str2, pVar);
                    yVar.b(concurrentHashMap);
                    f4hVar.endObject();
                    return yVar;
                }
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "user_segment":
                        strB2 = f4hVar.B();
                        pVarA2 = pVar;
                        strB7 = str2;
                        break;
                    case "replay_id":
                        pVarA2 = new io.sentry.protocol.p.a().a(f4hVar, iLogger);
                        strB7 = str2;
                        break;
                    case "user_id":
                        strA = f4hVar.B();
                        pVarA2 = pVar;
                        strB7 = str2;
                        break;
                    case "environment":
                        strB4 = f4hVar.B();
                        pVarA2 = pVar;
                        strB7 = str2;
                        break;
                    case "user":
                        cVar = (c) f4hVar.A(iLogger, new c.a());
                        pVarA2 = pVar;
                        strB7 = str2;
                        break;
                    case "sample_rate":
                        strB6 = f4hVar.B();
                        pVarA2 = pVar;
                        strB7 = str2;
                        break;
                    case "release":
                        strB3 = f4hVar.B();
                        pVarA2 = pVar;
                        strB7 = str2;
                        break;
                    case "trace_id":
                        pVarA = new io.sentry.protocol.p.a().a(f4hVar, iLogger);
                        pVarA2 = pVar;
                        strB7 = str2;
                        break;
                    case "sampled":
                        strB7 = f4hVar.B();
                        pVarA2 = pVar;
                        break;
                    case "public_key":
                        strNextString = f4hVar.nextString();
                        pVarA2 = pVar;
                        strB7 = str2;
                        break;
                    case "transaction":
                        strB5 = f4hVar.B();
                        pVarA2 = pVar;
                        strB7 = str2;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        pVarA2 = pVar;
                        strB7 = str2;
                        break;
                }
            }
        }
    }

    @Deprecated
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f21928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f21929b;

        @Nullable
        public Map<String, Object> c;

        public static final class a implements fsd<c> {
            @Override // defpackage.fsd
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
                f4hVar.beginObject();
                String strB = null;
                String strB2 = null;
                ConcurrentHashMap concurrentHashMap = null;
                while (f4hVar.peek() == JsonToken.NAME) {
                    String strNextName = f4hVar.nextName();
                    strNextName.hashCode();
                    if (strNextName.equals("id")) {
                        strB = f4hVar.B();
                    } else if (strNextName.equals("segment")) {
                        strB2 = f4hVar.B();
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                    }
                }
                c cVar = new c(strB, strB2);
                cVar.c(concurrentHashMap);
                f4hVar.endObject();
                return cVar;
            }
        }

        @Nullable
        public String a() {
            return this.f21928a;
        }

        @Deprecated
        @Nullable
        public String b() {
            return this.f21929b;
        }

        public void c(@Nullable Map<String, Object> map) {
            this.c = map;
        }

        public c(@Nullable String str, @Nullable String str2) {
            this.f21928a = str;
            this.f21929b = str2;
        }
    }

    public y(@NotNull io.sentry.protocol.p pVar, @NotNull String str) {
        this(pVar, str, null, null, null, null, null, null, null);
    }

    @Nullable
    public String a() {
        return this.h;
    }

    public void b(@Nullable Map<String, Object> map) {
        this.f21927k = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("trace_id").j(iLogger, this.f21925a);
        h4hVar.g("public_key").c(this.f21926b);
        if (this.c != null) {
            h4hVar.g("release").c(this.c);
        }
        if (this.d != null) {
            h4hVar.g("environment").c(this.d);
        }
        if (this.e != null) {
            h4hVar.g("user_id").c(this.e);
        }
        if (this.f != null) {
            h4hVar.g("user_segment").c(this.f);
        }
        if (this.g != null) {
            h4hVar.g("transaction").c(this.g);
        }
        if (this.h != null) {
            h4hVar.g("sample_rate").c(this.h);
        }
        if (this.i != null) {
            h4hVar.g("sampled").c(this.i);
        }
        if (this.j != null) {
            h4hVar.g(Contexts.REPLAY_ID).j(iLogger, this.j);
        }
        Map<String, Object> map = this.f21927k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21927k.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public y(@NotNull io.sentry.protocol.p pVar, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable io.sentry.protocol.p pVar2) {
        this(pVar, str, str2, str3, str4, null, str5, str6, str7, pVar2);
    }

    @Deprecated
    public y(@NotNull io.sentry.protocol.p pVar, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable io.sentry.protocol.p pVar2) {
        this.f21925a = pVar;
        this.f21926b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = pVar2;
    }
}
