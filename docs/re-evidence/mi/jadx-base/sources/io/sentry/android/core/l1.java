package io.sentry.android.core;

import android.os.Looper;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import defpackage.ae8;
import defpackage.c8c;
import io.sentry.MeasurementUnit;
import io.sentry.SpanStatus;
import io.sentry.android.core.performance.AppStartMetrics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class l1 implements ae8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21542a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f21543b;

    @NotNull
    public final SentryAndroidOptions c;

    public l1(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull h hVar) {
        this.c = (SentryAndroidOptions) io.sentry.util.p.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f21543b = (h) io.sentry.util.p.c(hVar, "ActivityFramesTracker is required");
    }

    public static boolean f(double d, @NotNull io.sentry.protocol.s sVar) {
        return d >= sVar.f().doubleValue() && (sVar.g() == null || d <= sVar.g().doubleValue());
    }

    @NotNull
    public static io.sentry.protocol.s h(@NotNull io.sentry.android.core.performance.e eVar, @Nullable io.sentry.w wVar, @NotNull io.sentry.protocol.p pVar, @NotNull String str) {
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(Looper.getMainLooper().getThread().getId()));
        map.put("thread.name", FaceSchema.FACE_PAGE_MAIN);
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        return new io.sentry.protocol.s(Double.valueOf(eVar.l()), Double.valueOf(eVar.h()), pVar, new io.sentry.w(), wVar, str, eVar.b(), SpanStatus.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), null, map);
    }

    @Override // defpackage.ae8
    @Nullable
    public io.sentry.s a(@NotNull io.sentry.s sVar, @NotNull c8c c8cVar) {
        return sVar;
    }

    @Override // defpackage.ae8
    @NotNull
    public synchronized io.sentry.protocol.w b(@NotNull io.sentry.protocol.w wVar, @NotNull c8c c8cVar) {
        Map<String, io.sentry.protocol.f> mapQ;
        try {
            if (!this.c.isTracingEnabled()) {
                return wVar;
            }
            if (e(wVar)) {
                if (!this.f21542a) {
                    long jC = AppStartMetrics.n().i(this.c).c();
                    if (jC != 0) {
                        wVar.o0().put(AppStartMetrics.n().j() == AppStartMetrics.AppStartType.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.f(Float.valueOf(jC), MeasurementUnit.Duration.MILLISECOND.apiName()));
                        d(AppStartMetrics.n(), wVar);
                        this.f21542a = true;
                    }
                }
                io.sentry.protocol.a app = wVar.C().getApp();
                if (app == null) {
                    app = new io.sentry.protocol.a();
                    wVar.C().setApp(app);
                }
                app.s(AppStartMetrics.n().j() == AppStartMetrics.AppStartType.COLD ? "cold" : "warm");
            }
            g(wVar);
            io.sentry.protocol.p pVarG = wVar.G();
            io.sentry.v trace = wVar.C().getTrace();
            if (pVarG != null && trace != null && trace.b().contentEquals("ui.load") && (mapQ = this.f21543b.q(pVarG)) != null) {
                wVar.o0().putAll(mapQ);
            }
            return wVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d(@NotNull AppStartMetrics appStartMetrics, @NotNull io.sentry.protocol.w wVar) {
        io.sentry.v trace;
        io.sentry.w wVarE;
        if (appStartMetrics.j() == AppStartMetrics.AppStartType.COLD && (trace = wVar.C().getTrace()) != null) {
            io.sentry.protocol.p pVarK = trace.k();
            Iterator<io.sentry.protocol.s> it = wVar.q0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    wVarE = null;
                    break;
                }
                io.sentry.protocol.s next = it.next();
                if (next.d().contentEquals("app.start.cold")) {
                    wVarE = next.e();
                    break;
                }
            }
            long jL = appStartMetrics.l();
            io.sentry.android.core.performance.e eVarH = appStartMetrics.h();
            if (eVarH.p() && Math.abs(jL - eVarH.m()) <= 10000) {
                io.sentry.android.core.performance.e eVar = new io.sentry.android.core.performance.e();
                eVar.w(eVarH.m());
                eVar.u(eVarH.k());
                eVar.x(jL);
                eVar.s("Process Initialization");
                wVar.q0().add(h(eVar, wVarE, pVarK, "process.load"));
            }
            List<io.sentry.android.core.performance.e> listM = appStartMetrics.m();
            if (!listM.isEmpty()) {
                Iterator<io.sentry.android.core.performance.e> it2 = listM.iterator();
                while (it2.hasNext()) {
                    wVar.q0().add(h(it2.next(), wVarE, pVarK, "contentprovider.load"));
                }
            }
            io.sentry.android.core.performance.e eVarK = appStartMetrics.k();
            if (eVarK.r()) {
                wVar.q0().add(h(eVarK, wVarE, pVarK, "application.load"));
            }
            List<io.sentry.android.core.performance.b> listE = appStartMetrics.e();
            if (listE.isEmpty()) {
                return;
            }
            for (io.sentry.android.core.performance.b bVar : listE) {
                if (bVar.b().p() && bVar.b().r()) {
                    wVar.q0().add(h(bVar.b(), wVarE, pVarK, "activity.load"));
                }
                if (bVar.c().p() && bVar.c().r()) {
                    wVar.q0().add(h(bVar.c(), wVarE, pVarK, "activity.load"));
                }
            }
        }
    }

    public final boolean e(@NotNull io.sentry.protocol.w wVar) {
        for (io.sentry.protocol.s sVar : wVar.q0()) {
            if (sVar.d().contentEquals("app.start.cold") || sVar.d().contentEquals("app.start.warm")) {
                return true;
            }
        }
        io.sentry.v trace = wVar.C().getTrace();
        return trace != null && (trace.b().equals("app.start.cold") || trace.b().equals("app.start.warm"));
    }

    public final void g(io.sentry.protocol.w wVar) {
        Object obj;
        io.sentry.protocol.s sVar = null;
        io.sentry.protocol.s sVar2 = null;
        for (io.sentry.protocol.s sVar3 : wVar.q0()) {
            if ("ui.load.initial_display".equals(sVar3.d())) {
                sVar = sVar3;
            } else if ("ui.load.full_display".equals(sVar3.d())) {
                sVar2 = sVar3;
            }
            if (sVar != null && sVar2 != null) {
                break;
            }
        }
        if (sVar == null && sVar2 == null) {
            return;
        }
        for (io.sentry.protocol.s sVar4 : wVar.q0()) {
            if (sVar4 != sVar && sVar4 != sVar2) {
                Map<String, Object> mapB = sVar4.b();
                boolean z = false;
                boolean z2 = sVar != null && f(sVar4.f().doubleValue(), sVar) && (mapB == null || (obj = mapB.get("thread.name")) == null || FaceSchema.FACE_PAGE_MAIN.equals(obj));
                if (sVar2 != null && f(sVar4.f().doubleValue(), sVar2)) {
                    z = true;
                }
                if (z2 || z) {
                    Map<String, Object> mapB2 = sVar4.b();
                    if (mapB2 == null) {
                        mapB2 = new ConcurrentHashMap<>();
                        sVar4.h(mapB2);
                    }
                    if (z2) {
                        mapB2.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z) {
                        mapB2.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }
}
