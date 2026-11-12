package io.sentry;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import defpackage.yq5;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class Session implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Date f21356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Date f21357b;

    @NotNull
    public final AtomicInteger c;

    @Nullable
    public final String d;

    @Nullable
    public final UUID e;

    @Nullable
    public Boolean f;

    @NotNull
    public State g;

    @Nullable
    public Long h;

    @Nullable
    public Double i;

    @Nullable
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f21358k;

    @Nullable
    public final String l;

    @NotNull
    public final String m;

    @Nullable
    public String n;

    @NotNull
    public final Object o;

    @Nullable
    public Map<String, Object> p;

    public enum State {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public static final class a implements fsd<Session> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(SentryLevel.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Session a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            String strB;
            f4hVar.beginObject();
            Integer numH0 = null;
            State stateValueOf = null;
            Date dateR = null;
            Date dateR2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            String strB2 = null;
            UUID uuidFromString = null;
            Boolean boolT = null;
            Long lJ0 = null;
            Double dW = null;
            String strB3 = null;
            String strB4 = null;
            String str = null;
            String strB5 = null;
            String strB6 = null;
            while (true) {
                String strB7 = str;
                String str2 = strB4;
                String str3 = strB3;
                Double d = dW;
                if (f4hVar.peek() != JsonToken.NAME) {
                    if (stateValueOf == null) {
                        throw c("status", iLogger);
                    }
                    if (dateR == null) {
                        throw c("started", iLogger);
                    }
                    if (numH0 == null) {
                        throw c("errors", iLogger);
                    }
                    if (strB5 == null) {
                        throw c("release", iLogger);
                    }
                    Session session = new Session(stateValueOf, dateR, dateR2, numH0.intValue(), strB2, uuidFromString, boolT, lJ0, d, str3, str2, strB7, strB5, strB6);
                    session.o(concurrentHashMap);
                    f4hVar.endObject();
                    return session;
                }
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "duration":
                        dW = f4hVar.W();
                        str = strB7;
                        strB4 = str2;
                        strB3 = str3;
                        break;
                    case "started":
                        dateR = f4hVar.r(iLogger);
                        str = strB7;
                        strB4 = str2;
                        strB3 = str3;
                        dW = d;
                        break;
                    case "errors":
                        numH0 = f4hVar.h0();
                        str = strB7;
                        strB4 = str2;
                        strB3 = str3;
                        dW = d;
                        break;
                    case "status":
                        String strC = io.sentry.util.u.c(f4hVar.B());
                        if (strC != null) {
                            stateValueOf = State.valueOf(strC);
                        }
                        str = strB7;
                        strB4 = str2;
                        strB3 = str3;
                        dW = d;
                        break;
                    case "did":
                        strB2 = f4hVar.B();
                        str = strB7;
                        strB4 = str2;
                        strB3 = str3;
                        dW = d;
                        break;
                    case "seq":
                        lJ0 = f4hVar.j0();
                        str = strB7;
                        strB4 = str2;
                        strB3 = str3;
                        dW = d;
                        break;
                    case "sid":
                        try {
                            strB = f4hVar.B();
                            try {
                                uuidFromString = UUID.fromString(strB);
                            } catch (IllegalArgumentException unused) {
                                iLogger.c(SentryLevel.ERROR, "%s sid is not valid.", strB);
                            }
                            break;
                        } catch (IllegalArgumentException unused2) {
                            strB = null;
                        }
                        str = strB7;
                        strB4 = str2;
                        strB3 = str3;
                        dW = d;
                        break;
                    case "init":
                        boolT = f4hVar.t();
                        str = strB7;
                        strB4 = str2;
                        strB3 = str3;
                        dW = d;
                        break;
                    case "timestamp":
                        dateR2 = f4hVar.r(iLogger);
                        str = strB7;
                        strB4 = str2;
                        strB3 = str3;
                        dW = d;
                        break;
                    case "attrs":
                        f4hVar.beginObject();
                        strB4 = str2;
                        strB3 = str3;
                        while (f4hVar.peek() == JsonToken.NAME) {
                            String strNextName2 = f4hVar.nextName();
                            strNextName2.hashCode();
                            switch (strNextName2) {
                                case "environment":
                                    strB7 = f4hVar.B();
                                    break;
                                case "release":
                                    strB5 = f4hVar.B();
                                    break;
                                case "ip_address":
                                    strB3 = f4hVar.B();
                                    break;
                                case "user_agent":
                                    strB4 = f4hVar.B();
                                    break;
                                default:
                                    f4hVar.skipValue();
                                    break;
                            }
                        }
                        f4hVar.endObject();
                        str = strB7;
                        dW = d;
                        break;
                    case "abnormal_mechanism":
                        strB6 = f4hVar.B();
                        str = strB7;
                        strB4 = str2;
                        strB3 = str3;
                        dW = d;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        str = strB7;
                        strB4 = str2;
                        strB3 = str3;
                        dW = d;
                        break;
                }
            }
        }
    }

    public Session(@NotNull State state, @NotNull Date date, @Nullable Date date2, int i, @Nullable String str, @Nullable UUID uuid, @Nullable Boolean bool, @Nullable Long l, @Nullable Double d, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @Nullable String str6) {
        this.o = new Object();
        this.g = state;
        this.f21356a = date;
        this.f21357b = date2;
        this.c = new AtomicInteger(i);
        this.d = str;
        this.e = uuid;
        this.f = bool;
        this.h = l;
        this.i = d;
        this.j = str2;
        this.f21358k = str3;
        this.l = str4;
        this.m = str5;
        this.n = str6;
    }

    public final double a(@NotNull Date date) {
        return Math.abs(date.getTime() - this.f21356a.getTime()) / 1000.0d;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Session clone() {
        return new Session(this.g, this.f21356a, this.f21357b, this.c.get(), this.d, this.e, this.f, this.h, this.i, this.j, this.f21358k, this.l, this.m, this.n);
    }

    public void c() {
        d(yq5.c());
    }

    public void d(@Nullable Date date) {
        synchronized (this.o) {
            try {
                this.f = null;
                if (this.g == State.Ok) {
                    this.g = State.Exited;
                }
                if (date != null) {
                    this.f21357b = date;
                } else {
                    this.f21357b = yq5.c();
                }
                Date date2 = this.f21357b;
                if (date2 != null) {
                    this.i = Double.valueOf(a(date2));
                    this.h = Long.valueOf(i(this.f21357b));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int e() {
        return this.c.get();
    }

    @Nullable
    public String f() {
        return this.n;
    }

    @Nullable
    public Boolean g() {
        return this.f;
    }

    @NotNull
    public String h() {
        return this.m;
    }

    public final long i(@NotNull Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    @Nullable
    public UUID j() {
        return this.e;
    }

    @Nullable
    public Date k() {
        Date date = this.f21356a;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    @NotNull
    public State l() {
        return this.g;
    }

    public boolean m() {
        return this.g != State.Ok;
    }

    @ApiStatus.Internal
    public void n() {
        this.f = Boolean.TRUE;
    }

    public void o(@Nullable Map<String, Object> map) {
        this.p = map;
    }

    public boolean p(@Nullable State state, @Nullable String str, boolean z) {
        return q(state, str, z, null);
    }

    public boolean q(@Nullable State state, @Nullable String str, boolean z, @Nullable String str2) {
        boolean z2;
        boolean z3;
        synchronized (this.o) {
            z2 = true;
            if (state != null) {
                try {
                    this.g = state;
                    z3 = true;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                z3 = false;
            }
            if (str != null) {
                this.f21358k = str;
                z3 = true;
            }
            if (z) {
                this.c.addAndGet(1);
                z3 = true;
            }
            if (str2 != null) {
                this.n = str2;
            } else {
                z2 = z3;
            }
            if (z2) {
                this.f = null;
                Date dateC = yq5.c();
                this.f21357b = dateC;
                if (dateC != null) {
                    this.h = Long.valueOf(i(dateC));
                }
            }
        }
        return z2;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.e != null) {
            h4hVar.g("sid").c(this.e.toString());
        }
        if (this.d != null) {
            h4hVar.g("did").c(this.d);
        }
        if (this.f != null) {
            h4hVar.g("init").k(this.f);
        }
        h4hVar.g("started").j(iLogger, this.f21356a);
        h4hVar.g("status").j(iLogger, this.g.name().toLowerCase(Locale.ROOT));
        if (this.h != null) {
            h4hVar.g("seq").i(this.h);
        }
        h4hVar.g("errors").d(this.c.intValue());
        if (this.i != null) {
            h4hVar.g("duration").i(this.i);
        }
        if (this.f21357b != null) {
            h4hVar.g("timestamp").j(iLogger, this.f21357b);
        }
        if (this.n != null) {
            h4hVar.g("abnormal_mechanism").j(iLogger, this.n);
        }
        h4hVar.g("attrs");
        h4hVar.beginObject();
        h4hVar.g("release").j(iLogger, this.m);
        if (this.l != null) {
            h4hVar.g("environment").j(iLogger, this.l);
        }
        if (this.j != null) {
            h4hVar.g("ip_address").j(iLogger, this.j);
        }
        if (this.f21358k != null) {
            h4hVar.g("user_agent").j(iLogger, this.f21358k);
        }
        h4hVar.endObject();
        Map<String, Object> map = this.p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.p.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public Session(@Nullable String str, @Nullable io.sentry.protocol.y yVar, @Nullable String str2, @NotNull String str3) {
        this(State.Ok, yq5.c(), yq5.c(), 0, str, UUID.randomUUID(), Boolean.TRUE, null, null, yVar != null ? yVar.l() : null, null, str2, str3, null);
    }
}
