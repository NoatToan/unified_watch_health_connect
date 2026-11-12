package io.sentry;

import com.mibi.sdk.component.Constants;
import defpackage.awl;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import defpackage.yq5;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends o implements cud {

    @NotNull
    public Date p;

    @Nullable
    public io.sentry.protocol.h q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public String f21841r;

    @Nullable
    public awl<io.sentry.protocol.v> s;

    @Nullable
    public awl<io.sentry.protocol.o> t;

    @Nullable
    public SentryLevel u;

    @Nullable
    public String v;

    @Nullable
    public List<String> w;

    @Nullable
    public Map<String, Object> x;

    @Nullable
    public Map<String, String> y;

    public static final class a implements fsd<s> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            s sVar = new s();
            o.a aVar = new o.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "fingerprint":
                        List list = (List) f4hVar.q0();
                        if (list == null) {
                            break;
                        } else {
                            sVar.w = list;
                            break;
                        }
                        break;
                    case "threads":
                        f4hVar.beginObject();
                        f4hVar.nextName();
                        sVar.s = new awl(f4hVar.C(iLogger, new io.sentry.protocol.v.a()));
                        f4hVar.endObject();
                        break;
                    case "logger":
                        sVar.f21841r = f4hVar.B();
                        break;
                    case "timestamp":
                        Date dateR = f4hVar.r(iLogger);
                        if (dateR == null) {
                            break;
                        } else {
                            sVar.p = dateR;
                            break;
                        }
                        break;
                    case "level":
                        sVar.u = (SentryLevel) f4hVar.A(iLogger, new SentryLevel.a());
                        break;
                    case "message":
                        sVar.q = (io.sentry.protocol.h) f4hVar.A(iLogger, new io.sentry.protocol.h.a());
                        break;
                    case "modules":
                        sVar.y = io.sentry.util.b.c((Map) f4hVar.q0());
                        break;
                    case "exception":
                        f4hVar.beginObject();
                        f4hVar.nextName();
                        sVar.t = new awl(f4hVar.C(iLogger, new io.sentry.protocol.o.a()));
                        f4hVar.endObject();
                        break;
                    case "transaction":
                        sVar.v = f4hVar.B();
                        break;
                    default:
                        if (!aVar.a(sVar, strNextName, f4hVar, iLogger)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            sVar.H0(concurrentHashMap);
            f4hVar.endObject();
            return sVar;
        }
    }

    public s(@NotNull io.sentry.protocol.p pVar, @NotNull Date date) {
        super(pVar);
        this.p = date;
    }

    public void A0(@Nullable List<String> list) {
        this.w = list != null ? new ArrayList(list) : null;
    }

    public void B0(@Nullable SentryLevel sentryLevel) {
        this.u = sentryLevel;
    }

    public void C0(@Nullable io.sentry.protocol.h hVar) {
        this.q = hVar;
    }

    public void D0(@Nullable Map<String, String> map) {
        this.y = io.sentry.util.b.d(map);
    }

    public void E0(@Nullable List<io.sentry.protocol.v> list) {
        this.s = new awl<>(list);
    }

    public void F0(@NotNull Date date) {
        this.p = date;
    }

    public void G0(@Nullable String str) {
        this.v = str;
    }

    public void H0(@Nullable Map<String, Object> map) {
        this.x = map;
    }

    @Nullable
    public List<io.sentry.protocol.o> p0() {
        awl<io.sentry.protocol.o> awlVar = this.t;
        if (awlVar == null) {
            return null;
        }
        return awlVar.a();
    }

    @Nullable
    public List<String> q0() {
        return this.w;
    }

    @Nullable
    public SentryLevel r0() {
        return this.u;
    }

    @Nullable
    public Map<String, String> s0() {
        return this.y;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("timestamp").j(iLogger, this.p);
        if (this.q != null) {
            h4hVar.g("message").j(iLogger, this.q);
        }
        if (this.f21841r != null) {
            h4hVar.g("logger").c(this.f21841r);
        }
        awl<io.sentry.protocol.v> awlVar = this.s;
        if (awlVar != null && !awlVar.a().isEmpty()) {
            h4hVar.g("threads");
            h4hVar.beginObject();
            h4hVar.g(Constants.KEY_RECHARGE_VALUES).j(iLogger, this.s.a());
            h4hVar.endObject();
        }
        awl<io.sentry.protocol.o> awlVar2 = this.t;
        if (awlVar2 != null && !awlVar2.a().isEmpty()) {
            h4hVar.g("exception");
            h4hVar.beginObject();
            h4hVar.g(Constants.KEY_RECHARGE_VALUES).j(iLogger, this.t.a());
            h4hVar.endObject();
        }
        if (this.u != null) {
            h4hVar.g("level").j(iLogger, this.u);
        }
        if (this.v != null) {
            h4hVar.g("transaction").c(this.v);
        }
        if (this.w != null) {
            h4hVar.g("fingerprint").j(iLogger, this.w);
        }
        if (this.y != null) {
            h4hVar.g("modules").j(iLogger, this.y);
        }
        new o.b().a(this, h4hVar, iLogger);
        Map<String, Object> map = this.x;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.x.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    @Nullable
    public List<io.sentry.protocol.v> t0() {
        awl<io.sentry.protocol.v> awlVar = this.s;
        if (awlVar != null) {
            return awlVar.a();
        }
        return null;
    }

    public Date u0() {
        return (Date) this.p.clone();
    }

    @Nullable
    public String v0() {
        return this.v;
    }

    @Nullable
    public io.sentry.protocol.o w0() {
        awl<io.sentry.protocol.o> awlVar = this.t;
        if (awlVar == null) {
            return null;
        }
        for (io.sentry.protocol.o oVar : awlVar.a()) {
            if (oVar.g() != null && oVar.g().h() != null && !oVar.g().h().booleanValue()) {
                return oVar;
            }
        }
        return null;
    }

    public boolean x0() {
        return w0() != null;
    }

    public boolean y0() {
        awl<io.sentry.protocol.o> awlVar = this.t;
        return (awlVar == null || awlVar.a().isEmpty()) ? false : true;
    }

    public void z0(@Nullable List<io.sentry.protocol.o> list) {
        this.t = new awl<>(list);
    }

    public s(@Nullable Throwable th) {
        this();
        this.j = th;
    }

    public s() {
        this(new io.sentry.protocol.p(), yq5.c());
    }
}
