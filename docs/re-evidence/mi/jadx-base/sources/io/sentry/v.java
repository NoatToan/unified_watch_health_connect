package io.sentry;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import defpackage.qkp;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public class v implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final io.sentry.protocol.p f21907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final w f21908b;

    @Nullable
    public final w c;

    @Nullable
    public transient qkp d;

    @NotNull
    public String e;

    @Nullable
    public String f;

    @Nullable
    public SpanStatus g;

    @NotNull
    public Map<String, String> h;

    @Nullable
    public String i;

    @Nullable
    public Map<String, Object> j;

    public static final class a implements fsd<v> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public v a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            String strNextString = null;
            io.sentry.protocol.p pVarA = null;
            w wVarB = null;
            w wVar = null;
            ConcurrentHashMap concurrentHashMap = null;
            String strNextString2 = null;
            SpanStatus spanStatus = null;
            String strNextString3 = null;
            Map<String, String> mapC = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "span_id":
                        wVarB = new w.a().a(f4hVar, iLogger);
                        break;
                    case "parent_span_id":
                        wVar = (w) f4hVar.A(iLogger, new w.a());
                        break;
                    case "description":
                        strNextString2 = f4hVar.nextString();
                        break;
                    case "origin":
                        strNextString3 = f4hVar.nextString();
                        break;
                    case "status":
                        spanStatus = (SpanStatus) f4hVar.A(iLogger, new SpanStatus.a());
                        break;
                    case "op":
                        strNextString = f4hVar.nextString();
                        break;
                    case "tags":
                        mapC = io.sentry.util.b.c((Map) f4hVar.q0());
                        break;
                    case "trace_id":
                        pVarA = new io.sentry.protocol.p.a().a(f4hVar, iLogger);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            if (pVarA == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.a(SentryLevel.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (wVarB == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                iLogger.a(SentryLevel.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            v vVar = new v(pVarA, wVarB, strNextString == null ? "" : strNextString, wVar, null);
            vVar.l(strNextString2);
            vVar.o(spanStatus);
            vVar.m(strNextString3);
            if (mapC != null) {
                vVar.h = mapC;
            }
            vVar.p(concurrentHashMap);
            f4hVar.endObject();
            return vVar;
        }
    }

    public v(@NotNull io.sentry.protocol.p pVar, @NotNull w wVar, @NotNull String str, @Nullable w wVar2, @Nullable qkp qkpVar) {
        this(pVar, wVar, wVar2, str, null, qkpVar, null, "manual");
    }

    @Nullable
    public String a() {
        return this.f;
    }

    @NotNull
    public String b() {
        return this.e;
    }

    @Nullable
    public String c() {
        return this.i;
    }

    @TestOnly
    @Nullable
    public w d() {
        return this.c;
    }

    @Nullable
    public Boolean e() {
        qkp qkpVar = this.d;
        if (qkpVar == null) {
            return null;
        }
        return qkpVar.b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f21907a.equals(vVar.f21907a) && this.f21908b.equals(vVar.f21908b) && io.sentry.util.p.a(this.c, vVar.c) && this.e.equals(vVar.e) && io.sentry.util.p.a(this.f, vVar.f) && this.g == vVar.g;
    }

    @Nullable
    public Boolean f() {
        qkp qkpVar = this.d;
        if (qkpVar == null) {
            return null;
        }
        return qkpVar.d();
    }

    @Nullable
    public qkp g() {
        return this.d;
    }

    @NotNull
    public w h() {
        return this.f21908b;
    }

    public int hashCode() {
        return io.sentry.util.p.b(this.f21907a, this.f21908b, this.c, this.e, this.f, this.g);
    }

    @Nullable
    public SpanStatus i() {
        return this.g;
    }

    @NotNull
    public Map<String, String> j() {
        return this.h;
    }

    @NotNull
    public io.sentry.protocol.p k() {
        return this.f21907a;
    }

    public void l(@Nullable String str) {
        this.f = str;
    }

    public void m(@Nullable String str) {
        this.i = str;
    }

    @ApiStatus.Internal
    public void n(@Nullable qkp qkpVar) {
        this.d = qkpVar;
    }

    public void o(@Nullable SpanStatus spanStatus) {
        this.g = spanStatus;
    }

    public void p(@Nullable Map<String, Object> map) {
        this.j = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("trace_id");
        this.f21907a.serialize(h4hVar, iLogger);
        h4hVar.g("span_id");
        this.f21908b.serialize(h4hVar, iLogger);
        if (this.c != null) {
            h4hVar.g("parent_span_id");
            this.c.serialize(h4hVar, iLogger);
        }
        h4hVar.g("op").c(this.e);
        if (this.f != null) {
            h4hVar.g("description").c(this.f);
        }
        if (this.g != null) {
            h4hVar.g("status").j(iLogger, this.g);
        }
        if (this.i != null) {
            h4hVar.g("origin").j(iLogger, this.i);
        }
        if (!this.h.isEmpty()) {
            h4hVar.g("tags").j(iLogger, this.h);
        }
        Map<String, Object> map = this.j;
        if (map != null) {
            for (String str : map.keySet()) {
                h4hVar.g(str).j(iLogger, this.j.get(str));
            }
        }
        h4hVar.endObject();
    }

    public v(@NotNull String str) {
        this(new io.sentry.protocol.p(), new w(), str, null, null);
    }

    @ApiStatus.Internal
    public v(@NotNull io.sentry.protocol.p pVar, @NotNull w wVar, @Nullable w wVar2, @NotNull String str, @Nullable String str2, @Nullable qkp qkpVar, @Nullable SpanStatus spanStatus, @Nullable String str3) {
        this.h = new ConcurrentHashMap();
        this.i = "manual";
        this.f21907a = (io.sentry.protocol.p) io.sentry.util.p.c(pVar, "traceId is required");
        this.f21908b = (w) io.sentry.util.p.c(wVar, "spanId is required");
        this.e = (String) io.sentry.util.p.c(str, "operation is required");
        this.c = wVar2;
        this.d = qkpVar;
        this.f = str2;
        this.g = spanStatus;
        this.i = str3;
    }

    public v(@NotNull v vVar) {
        this.h = new ConcurrentHashMap();
        this.i = "manual";
        this.f21907a = vVar.f21907a;
        this.f21908b = vVar.f21908b;
        this.c = vVar.c;
        this.d = vVar.d;
        this.e = vVar.e;
        this.f = vVar.f;
        this.g = vVar.g;
        Map<String, String> mapC = io.sentry.util.b.c(vVar.h);
        if (mapC != null) {
            this.h = mapC;
        }
    }
}
