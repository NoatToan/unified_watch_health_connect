package io.sentry;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    @Nullable
    public List<String> A;

    @Nullable
    public Boolean B;

    @Nullable
    public Boolean C;

    @Nullable
    public SentryOptions.g D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f21669b;

    @Nullable
    public String c;

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public Boolean f;

    @Nullable
    public Boolean g;

    @Nullable
    public Boolean h;

    @Nullable
    public Boolean i;

    @Nullable
    public Double j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Double f21670k;

    @Nullable
    public SentryOptions.RequestSize l;

    @Nullable
    public SentryOptions.i n;

    @Nullable
    public String s;

    @Nullable
    public Long t;

    @Nullable
    public Boolean v;

    @Nullable
    public Boolean w;

    @Nullable
    public Boolean y;

    @Nullable
    public Boolean z;

    @NotNull
    public final Map<String, String> m = new ConcurrentHashMap();

    @NotNull
    public final List<String> o = new CopyOnWriteArrayList();

    @NotNull
    public final List<String> p = new CopyOnWriteArrayList();

    @Nullable
    public List<String> q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final List<String> f21671r = new CopyOnWriteArrayList();

    @NotNull
    public final Set<Class<? extends Throwable>> u = new CopyOnWriteArraySet();

    @NotNull
    public Set<String> x = new CopyOnWriteArraySet();

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static c g(@NotNull io.sentry.config.f fVar, @NotNull ILogger iLogger) {
        c cVar = new c();
        cVar.N(fVar.getProperty("dsn"));
        cVar.U(fVar.getProperty("environment"));
        cVar.c0(fVar.getProperty("release"));
        cVar.M(fVar.getProperty("dist"));
        cVar.f0(fVar.getProperty("servername"));
        cVar.S(fVar.c("uncaught.handler.enabled"));
        cVar.Y(fVar.c("uncaught.handler.print-stacktrace"));
        cVar.R(fVar.c("enable-tracing"));
        cVar.h0(fVar.a("traces-sample-rate"));
        cVar.Z(fVar.a("profiles-sample-rate"));
        cVar.L(fVar.c("debug"));
        cVar.P(fVar.c("enable-deduplication"));
        cVar.d0(fVar.c("send-client-reports"));
        String property = fVar.getProperty("max-request-body-size");
        if (property != null) {
            cVar.X(SentryOptions.RequestSize.valueOf(property.toUpperCase(Locale.ROOT)));
        }
        for (Map.Entry<String, String> entry : fVar.getMap("tags").entrySet()) {
            cVar.g0(entry.getKey(), entry.getValue());
        }
        String property2 = fVar.getProperty("proxy.host");
        String property3 = fVar.getProperty("proxy.user");
        String property4 = fVar.getProperty("proxy.pass");
        String strE = fVar.e("proxy.port", "80");
        if (property2 != null) {
            cVar.b0(new SentryOptions.i(property2, strE, property3, property4));
        }
        Iterator<String> it = fVar.b("in-app-includes").iterator();
        while (it.hasNext()) {
            cVar.e(it.next());
        }
        Iterator<String> it2 = fVar.b("in-app-excludes").iterator();
        while (it2.hasNext()) {
            cVar.d(it2.next());
        }
        List<String> listB = fVar.getProperty("trace-propagation-targets") != null ? fVar.b("trace-propagation-targets") : null;
        if (listB == null && fVar.getProperty("tracing-origins") != null) {
            listB = fVar.b("tracing-origins");
        }
        if (listB != null) {
            Iterator<String> it3 = listB.iterator();
            while (it3.hasNext()) {
                cVar.f(it3.next());
            }
        }
        Iterator<String> it4 = fVar.b("context-tags").iterator();
        while (it4.hasNext()) {
            cVar.b(it4.next());
        }
        cVar.a0(fVar.getProperty("proguard-uuid"));
        Iterator<String> it5 = fVar.b("bundle-ids").iterator();
        while (it5.hasNext()) {
            cVar.a(it5.next());
        }
        cVar.V(fVar.d("idle-timeout"));
        cVar.T(fVar.c("enabled"));
        cVar.Q(fVar.c("enable-pretty-serialization-output"));
        cVar.e0(fVar.c("send-modules"));
        cVar.W(fVar.b("ignored-checkins"));
        cVar.O(fVar.c("enable-backpressure-handling"));
        for (String str : fVar.b("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str);
                if (Throwable.class.isAssignableFrom(cls)) {
                    cVar.c(cls);
                } else {
                    iLogger.c(SentryLevel.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str, str);
                }
            } catch (ClassNotFoundException unused) {
                iLogger.c(SentryLevel.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str, str);
            }
        }
        Long lD = fVar.d("cron.default-checkin-margin");
        Long lD2 = fVar.d("cron.default-max-runtime");
        String property5 = fVar.getProperty("cron.default-timezone");
        Long lD3 = fVar.d("cron.default-failure-issue-threshold");
        Long lD4 = fVar.d("cron.default-recovery-threshold");
        if (lD != null || lD2 != null || property5 != null || lD3 != null || lD4 != null) {
            SentryOptions.g gVar = new SentryOptions.g();
            gVar.f(lD);
            gVar.h(lD2);
            gVar.j(property5);
            gVar.g(lD3);
            gVar.i(lD4);
            cVar.K(gVar);
        }
        return cVar;
    }

    @Nullable
    public String A() {
        return this.c;
    }

    @Nullable
    public Boolean B() {
        return this.w;
    }

    @Nullable
    public String C() {
        return this.e;
    }

    @NotNull
    public Map<String, String> D() {
        return this.m;
    }

    @Nullable
    public List<String> E() {
        return this.q;
    }

    @Nullable
    public Double F() {
        return this.j;
    }

    @ApiStatus.Experimental
    @Nullable
    public Boolean G() {
        return this.C;
    }

    @Nullable
    public Boolean H() {
        return this.z;
    }

    @Nullable
    public Boolean I() {
        return this.y;
    }

    @Nullable
    public Boolean J() {
        return this.B;
    }

    @ApiStatus.Experimental
    public void K(@Nullable SentryOptions.g gVar) {
        this.D = gVar;
    }

    public void L(@Nullable Boolean bool) {
        this.g = bool;
    }

    public void M(@Nullable String str) {
        this.d = str;
    }

    public void N(@Nullable String str) {
        this.f21668a = str;
    }

    @ApiStatus.Experimental
    public void O(@Nullable Boolean bool) {
        this.C = bool;
    }

    public void P(@Nullable Boolean bool) {
        this.h = bool;
    }

    public void Q(@Nullable Boolean bool) {
        this.z = bool;
    }

    public void R(@Nullable Boolean bool) {
        this.i = bool;
    }

    public void S(@Nullable Boolean bool) {
        this.f = bool;
    }

    public void T(@Nullable Boolean bool) {
        this.y = bool;
    }

    public void U(@Nullable String str) {
        this.f21669b = str;
    }

    public void V(@Nullable Long l) {
        this.t = l;
    }

    @ApiStatus.Experimental
    public void W(@Nullable List<String> list) {
        this.A = list;
    }

    public void X(@Nullable SentryOptions.RequestSize requestSize) {
        this.l = requestSize;
    }

    public void Y(@Nullable Boolean bool) {
        this.v = bool;
    }

    public void Z(@Nullable Double d) {
        this.f21670k = d;
    }

    public void a(@NotNull String str) {
        this.x.add(str);
    }

    public void a0(@Nullable String str) {
        this.s = str;
    }

    public void b(@NotNull String str) {
        this.f21671r.add(str);
    }

    public void b0(@Nullable SentryOptions.i iVar) {
        this.n = iVar;
    }

    public void c(@NotNull Class<? extends Throwable> cls) {
        this.u.add(cls);
    }

    public void c0(@Nullable String str) {
        this.c = str;
    }

    public void d(@NotNull String str) {
        this.o.add(str);
    }

    public void d0(@Nullable Boolean bool) {
        this.w = bool;
    }

    public void e(@NotNull String str) {
        this.p.add(str);
    }

    public void e0(@Nullable Boolean bool) {
        this.B = bool;
    }

    public void f(@NotNull String str) {
        if (this.q == null) {
            this.q = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.q.add(str);
    }

    public void f0(@Nullable String str) {
        this.e = str;
    }

    public void g0(@NotNull String str, @NotNull String str2) {
        this.m.put(str, str2);
    }

    @NotNull
    public Set<String> h() {
        return this.x;
    }

    public void h0(@Nullable Double d) {
        this.j = d;
    }

    @NotNull
    public List<String> i() {
        return this.f21671r;
    }

    @ApiStatus.Experimental
    @Nullable
    public SentryOptions.g j() {
        return this.D;
    }

    @Nullable
    public Boolean k() {
        return this.g;
    }

    @Nullable
    public String l() {
        return this.d;
    }

    @Nullable
    public String m() {
        return this.f21668a;
    }

    @Nullable
    public Boolean n() {
        return this.h;
    }

    @Nullable
    public Boolean o() {
        return this.i;
    }

    @Nullable
    public Boolean p() {
        return this.f;
    }

    @Nullable
    public String q() {
        return this.f21669b;
    }

    @Nullable
    public Long r() {
        return this.t;
    }

    @ApiStatus.Experimental
    @Nullable
    public List<String> s() {
        return this.A;
    }

    @NotNull
    public Set<Class<? extends Throwable>> t() {
        return this.u;
    }

    @NotNull
    public List<String> u() {
        return this.o;
    }

    @NotNull
    public List<String> v() {
        return this.p;
    }

    @Nullable
    public Boolean w() {
        return this.v;
    }

    @Nullable
    public Double x() {
        return this.f21670k;
    }

    @Nullable
    public String y() {
        return this.s;
    }

    @Nullable
    public SentryOptions.i z() {
        return this.n;
    }
}
