package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import defpackage.ae8;
import defpackage.c8c;
import defpackage.yq5;
import io.sentry.SentryLevel;
import io.sentry.SentryReplayEvent;
import io.sentry.android.core.performance.AppStartMetrics;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 implements ae8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @TestOnly
    public final Context f21609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final r0 f21610b;

    @NotNull
    public final SentryAndroidOptions c;

    @NotNull
    public final Future<y0> d;

    public x0(@NotNull Context context, @NotNull r0 r0Var, @NotNull final SentryAndroidOptions sentryAndroidOptions) {
        this.f21609a = (Context) io.sentry.util.p.c(u0.a(context), "The application context is required.");
        this.f21610b = (r0) io.sentry.util.p.c(r0Var, "The BuildInfoProvider is required.");
        this.c = (SentryAndroidOptions) io.sentry.util.p.c(sentryAndroidOptions, "The options object is required.");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.d = executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.w0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f21602a.f(sentryAndroidOptions);
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    public static void e(@NotNull io.sentry.s sVar) {
        io.sentry.protocol.u uVarI;
        List<io.sentry.protocol.t> listD;
        List<io.sentry.protocol.o> listP0 = sVar.p0();
        if (listP0 == null || listP0.size() <= 1) {
            return;
        }
        io.sentry.protocol.o oVar = listP0.get(listP0.size() - 1);
        if (!"java.lang".equals(oVar.h()) || (uVarI = oVar.i()) == null || (listD = uVarI.d()) == null) {
            return;
        }
        Iterator<io.sentry.protocol.t> it = listD.iterator();
        while (it.hasNext()) {
            if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(it.next().r())) {
                Collections.reverse(listP0);
                return;
            }
        }
    }

    private void g(@NotNull io.sentry.o oVar) {
        String str;
        io.sentry.protocol.j operatingSystem = oVar.C().getOperatingSystem();
        try {
            oVar.C().setOperatingSystem(this.d.get().j());
        } catch (Throwable th) {
            this.c.getLogger().a(SentryLevel.ERROR, "Failed to retrieve os system", th);
        }
        if (operatingSystem != null) {
            String strG = operatingSystem.g();
            if (strG == null || strG.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + strG.trim().toLowerCase(Locale.ROOT);
            }
            oVar.C().put(str, operatingSystem);
        }
    }

    private void h(@NotNull io.sentry.o oVar) {
        io.sentry.protocol.y yVarQ = oVar.Q();
        if (yVarQ == null) {
            yVarQ = new io.sentry.protocol.y();
            oVar.f0(yVarQ);
        }
        if (yVarQ.k() == null) {
            yVarQ.n(d1.a(this.f21609a));
        }
        if (yVarQ.l() == null) {
            yVarQ.o("{{auto}}");
        }
    }

    private void o(@NotNull io.sentry.o oVar) {
        try {
            u0.a aVarL = this.d.get().l();
            if (aVarL != null) {
                for (Map.Entry<String, String> entry : aVarL.a().entrySet()) {
                    oVar.d0(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.c.getLogger().a(SentryLevel.ERROR, "Error getting side loaded info.", th);
        }
    }

    private void p(@NotNull io.sentry.s sVar, @NotNull c8c c8cVar) {
        if (sVar.t0() != null) {
            boolean zI = io.sentry.util.j.i(c8cVar);
            for (io.sentry.protocol.v vVar : sVar.t0()) {
                boolean zD = io.sentry.android.core.internal.util.c.b().d(vVar);
                if (vVar.o() == null) {
                    vVar.r(Boolean.valueOf(zD));
                }
                if (!zI && vVar.p() == null) {
                    vVar.v(Boolean.valueOf(zD));
                }
            }
        }
    }

    private boolean q(@NotNull io.sentry.o oVar, @NotNull c8c c8cVar) {
        if (io.sentry.util.j.u(c8cVar)) {
            return true;
        }
        this.c.getLogger().c(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", oVar.G());
        return false;
    }

    @Override // defpackage.ae8
    @NotNull
    public io.sentry.s a(@NotNull io.sentry.s sVar, @NotNull c8c c8cVar) {
        boolean zQ = q(sVar, c8cVar);
        if (zQ) {
            i(sVar, c8cVar);
            p(sVar, c8cVar);
        }
        k(sVar, true, zQ);
        e(sVar);
        return sVar;
    }

    @Override // defpackage.ae8
    @NotNull
    public io.sentry.protocol.w b(@NotNull io.sentry.protocol.w wVar, @NotNull c8c c8cVar) {
        boolean zQ = q(wVar, c8cVar);
        if (zQ) {
            i(wVar, c8cVar);
        }
        k(wVar, false, zQ);
        return wVar;
    }

    @Override // defpackage.ae8
    @NotNull
    public SentryReplayEvent c(@NotNull SentryReplayEvent sentryReplayEvent, @NotNull c8c c8cVar) {
        boolean zQ = q(sentryReplayEvent, c8cVar);
        if (zQ) {
            i(sentryReplayEvent, c8cVar);
        }
        k(sentryReplayEvent, false, zQ);
        return sentryReplayEvent;
    }

    public final /* synthetic */ y0 f(SentryAndroidOptions sentryAndroidOptions) throws Exception {
        return y0.i(this.f21609a, sentryAndroidOptions);
    }

    public final void i(@NotNull io.sentry.o oVar, @NotNull c8c c8cVar) {
        io.sentry.protocol.a app = oVar.C().getApp();
        if (app == null) {
            app = new io.sentry.protocol.a();
        }
        j(app, c8cVar);
        n(oVar, app);
        oVar.C().setApp(app);
    }

    public final void j(@NotNull io.sentry.protocol.a aVar, @NotNull c8c c8cVar) {
        Boolean boolB;
        aVar.n(u0.c(this.f21609a, this.c.getLogger()));
        io.sentry.android.core.performance.e eVarI = AppStartMetrics.n().i(this.c);
        if (eVarI.p()) {
            aVar.o(yq5.n(eVarI.i()));
        }
        if (io.sentry.util.j.i(c8cVar) || aVar.k() != null || (boolB = q0.a().b()) == null) {
            return;
        }
        aVar.q(Boolean.valueOf(!boolB.booleanValue()));
    }

    public final void k(@NotNull io.sentry.o oVar, boolean z, boolean z2) {
        h(oVar);
        l(oVar, z, z2);
        o(oVar);
    }

    public final void l(@NotNull io.sentry.o oVar, boolean z, boolean z2) {
        if (oVar.C().getDevice() == null) {
            try {
                oVar.C().setDevice(this.d.get().a(z, z2));
            } catch (Throwable th) {
                this.c.getLogger().a(SentryLevel.ERROR, "Failed to retrieve device info", th);
            }
            g(oVar);
        }
    }

    public final void m(@NotNull io.sentry.o oVar, @NotNull String str) {
        if (oVar.E() == null) {
            oVar.T(str);
        }
    }

    public final void n(@NotNull io.sentry.o oVar, @NotNull io.sentry.protocol.a aVar) {
        PackageInfo packageInfoJ = u0.j(this.f21609a, 4096, this.c.getLogger(), this.f21610b);
        if (packageInfoJ != null) {
            m(oVar, u0.l(packageInfoJ, this.f21610b));
            u0.r(packageInfoJ, this.f21610b, aVar);
        }
    }
}
