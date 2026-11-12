package defpackage;

import io.sentry.ILogger;
import io.sentry.SentryOptions;
import io.sentry.e;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.protocol.p;
import io.sentry.protocol.y;
import io.sentry.s;
import io.sentry.util.u;
import io.sentry.v;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Experimental
public final class ox1 {

    @NotNull
    public static final Integer e = 8192;

    @NotNull
    public static final Integer f = 64;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f29777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f29778b;
    public boolean c;

    @NotNull
    public final ILogger d;

    @ApiStatus.Internal
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final List<String> f29779a = Arrays.asList("sentry-trace_id", "sentry-public_key", "sentry-release", "sentry-user_id", "sentry-environment", "sentry-user_segment", "sentry-transaction", "sentry-sample_rate", "sentry-sampled", "sentry-replay_id");
    }

    @ApiStatus.Internal
    public ox1(@NotNull ILogger iLogger) {
        this(new HashMap(), null, true, iLogger);
    }

    @ApiStatus.Internal
    @NotNull
    public static ox1 b(@NotNull s sVar, @NotNull SentryOptions sentryOptions) {
        ox1 ox1Var = new ox1(sentryOptions.getLogger());
        v trace = sVar.C().getTrace();
        ox1Var.C(trace != null ? trace.k().toString() : null);
        ox1Var.x(sentryOptions.retrieveParsedDsn().a());
        ox1Var.y(sVar.J());
        ox1Var.w(sVar.F());
        y yVarQ = sVar.Q();
        ox1Var.E(yVarQ != null ? k(yVarQ) : null);
        ox1Var.D(sVar.v0());
        ox1Var.A(null);
        ox1Var.B(null);
        Object obj = sVar.C().get(Contexts.REPLAY_ID);
        if (obj != null && !obj.toString().equals(p.f21803b.toString())) {
            ox1Var.z(obj.toString());
            sVar.C().remove(Contexts.REPLAY_ID);
        }
        ox1Var.a();
        return ox1Var;
    }

    @Deprecated
    @Nullable
    public static String k(@NotNull y yVar) {
        if (yVar.m() != null) {
            return yVar.m();
        }
        Map<String, String> mapJ = yVar.j();
        if (mapJ != null) {
            return mapJ.get("segment");
        }
        return null;
    }

    public static boolean q(@Nullable TransactionNameSource transactionNameSource) {
        return (transactionNameSource == null || TransactionNameSource.URL.equals(transactionNameSource)) ? false : true;
    }

    @Nullable
    public static Double s(@Nullable qkp qkpVar) {
        if (qkpVar == null) {
            return null;
        }
        return qkpVar.c();
    }

    @Nullable
    public static String t(@Nullable Double d) {
        if (io.sentry.util.s.e(d, false)) {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT)).format(d);
        }
        return null;
    }

    @Nullable
    public static Boolean u(@Nullable qkp qkpVar) {
        if (qkpVar == null) {
            return null;
        }
        return qkpVar.d();
    }

    @ApiStatus.Internal
    public void A(@Nullable String str) {
        v("sentry-sample_rate", str);
    }

    @ApiStatus.Internal
    public void B(@Nullable String str) {
        v("sentry-sampled", str);
    }

    @ApiStatus.Internal
    public void C(@Nullable String str) {
        v("sentry-trace_id", str);
    }

    @ApiStatus.Internal
    public void D(@Nullable String str) {
        v("sentry-transaction", str);
    }

    @ApiStatus.Internal
    @Deprecated
    public void E(@Nullable String str) {
        v("sentry-user_segment", str);
    }

    @ApiStatus.Internal
    public void F(@NotNull e eVar, @NotNull SentryOptions sentryOptions) {
        idi idiVarV = eVar.v();
        y yVarG = eVar.g();
        p pVarL = eVar.l();
        C(idiVarV.e().toString());
        x(sentryOptions.retrieveParsedDsn().a());
        y(sentryOptions.getRelease());
        w(sentryOptions.getEnvironment());
        if (!p.f21803b.equals(pVarL)) {
            z(pVarL.toString());
        }
        E(yVarG != null ? k(yVarG) : null);
        D(null);
        A(null);
        B(null);
    }

    @ApiStatus.Internal
    public void G(@NotNull wzc wzcVar, @Nullable y yVar, @Nullable p pVar, @NotNull SentryOptions sentryOptions, @Nullable qkp qkpVar) {
        C(wzcVar.d().k().toString());
        x(sentryOptions.retrieveParsedDsn().a());
        y(sentryOptions.getRelease());
        w(sentryOptions.getEnvironment());
        E(yVar != null ? k(yVar) : null);
        D(q(wzcVar.k()) ? wzcVar.getName() : null);
        if (pVar != null && !p.f21803b.equals(pVar)) {
            z(pVar.toString());
        }
        A(t(s(qkpVar)));
        B(u.g(u(qkpVar)));
    }

    @ApiStatus.Internal
    @Nullable
    public io.sentry.y H() {
        String strL = l();
        String strG = g();
        String strE = e();
        if (strL == null || strE == null) {
            return null;
        }
        io.sentry.y yVar = new io.sentry.y(new p(strL), strE, f(), d(), o(), p(), m(), h(), j(), strG == null ? null : new p(strG));
        yVar.b(n());
        return yVar;
    }

    @ApiStatus.Internal
    public void a() {
        this.c = false;
    }

    @ApiStatus.Internal
    @Nullable
    public String c(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.f29777a.get(str);
    }

    @ApiStatus.Internal
    @Nullable
    public String d() {
        return c("sentry-environment");
    }

    @ApiStatus.Internal
    @Nullable
    public String e() {
        return c("sentry-public_key");
    }

    @ApiStatus.Internal
    @Nullable
    public String f() {
        return c("sentry-release");
    }

    @ApiStatus.Internal
    @Nullable
    public String g() {
        return c("sentry-replay_id");
    }

    @ApiStatus.Internal
    @Nullable
    public String h() {
        return c("sentry-sample_rate");
    }

    @ApiStatus.Internal
    @Nullable
    public Double i() {
        String strH = h();
        if (strH != null) {
            try {
                double d = Double.parseDouble(strH);
                if (io.sentry.util.s.e(Double.valueOf(d), false)) {
                    return Double.valueOf(d);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @ApiStatus.Internal
    @Nullable
    public String j() {
        return c("sentry-sampled");
    }

    @ApiStatus.Internal
    @Nullable
    public String l() {
        return c("sentry-trace_id");
    }

    @ApiStatus.Internal
    @Nullable
    public String m() {
        return c("sentry-transaction");
    }

    @ApiStatus.Internal
    @NotNull
    public Map<String, Object> n() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : this.f29777a.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!a.f29779a.contains(key) && value != null) {
                concurrentHashMap.put(key.replaceFirst("sentry-", ""), value);
            }
        }
        return concurrentHashMap;
    }

    @ApiStatus.Internal
    @Nullable
    public String o() {
        return c("sentry-user_id");
    }

    @ApiStatus.Internal
    @Deprecated
    @Nullable
    public String p() {
        return c("sentry-user_segment");
    }

    @ApiStatus.Internal
    public boolean r() {
        return this.c;
    }

    @ApiStatus.Internal
    public void v(@NotNull String str, @Nullable String str2) {
        if (this.c) {
            this.f29777a.put(str, str2);
        }
    }

    @ApiStatus.Internal
    public void w(@Nullable String str) {
        v("sentry-environment", str);
    }

    @ApiStatus.Internal
    public void x(@Nullable String str) {
        v("sentry-public_key", str);
    }

    @ApiStatus.Internal
    public void y(@Nullable String str) {
        v("sentry-release", str);
    }

    @ApiStatus.Internal
    public void z(@Nullable String str) {
        v("sentry-replay_id", str);
    }

    @ApiStatus.Internal
    public ox1(@NotNull ox1 ox1Var) {
        this(ox1Var.f29777a, ox1Var.f29778b, ox1Var.c, ox1Var.d);
    }

    @ApiStatus.Internal
    public ox1(@NotNull Map<String, String> map, @Nullable String str, boolean z, @NotNull ILogger iLogger) {
        this.f29777a = map;
        this.d = iLogger;
        this.c = z;
        this.f29778b = str;
    }
}
