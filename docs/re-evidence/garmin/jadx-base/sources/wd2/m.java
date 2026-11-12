package wd2;

import android.content.Context;
import android.content.SharedPreferences;
import com.garmin.android.library.livetrack.LivetrackService;
import java.util.Set;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final class m {
    public static final Set<z1> a() {
        g1 g1Var = q.f184563f.c().f184567b;
        if (g1Var != null) {
            LivetrackService livetrackService = g1Var.f184472d;
            Set<z1> setB = livetrackService != null ? livetrackService.b() : p13.l0.f134950a;
            if (setB != null) {
                return setB;
            }
        }
        return p13.l0.f134950a;
    }

    public static final androidx.lifecycle.y0 b() {
        androidx.lifecycle.y0<f<com.garmin.android.library.livetrack.d>> y0Var;
        q qVarC = q.f184563f.c();
        synchronized (qVarC) {
            y0Var = qVarC.f184568c;
        }
        return y0Var;
    }

    public static final void c(l lVar, e23.l<? super m1, Unit> lVar2) {
        lVar.getClass();
        q qVarC = q.f184563f.c();
        ge1.b.T(qVarC, null, null, new s(qVarC, lVar, lVar2, null), 3);
    }

    public static final boolean d(Context context, long j8) {
        context.getClass();
        q.f184563f.c();
        xd2.b1.f190056a.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("livetrack.preferences", 0);
        sharedPreferences.getClass();
        xd2.b1.f190057b = sharedPreferences;
        String strA = xd2.b1.a(j8, "KEY_AUTO_START");
        SharedPreferences sharedPreferences2 = xd2.b1.f190057b;
        if (sharedPreferences2 != null) {
            return sharedPreferences2.getBoolean(strA, false);
        }
        p005kotlin.jvm.internal.s.m("prefs");
        throw null;
    }

    public static final boolean e(long j8) {
        return q.f184563f.c().e(Long.valueOf(j8));
    }

    public static final void f(Context context, Long l14) {
        q qVarC = q.f184563f.c();
        Logger logger = q.f184565h;
        if (logger != null) {
            logger.debug("purgeLivetrackDeviceData: deviceUnitId: " + l14);
        }
        ge1.b.T(qVarC, null, null, new z(context, l14, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:5:0x0008, B:7:0x0010, B:9:0x0014, B:12:0x001d, B:14:0x0025, B:16:0x0029, B:19:0x0031, B:21:0x0035, B:23:0x0039, B:10:0x0019, B:24:0x0042, B:26:0x0046, B:27:0x004b), top: B:32:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:5:0x0008, B:7:0x0010, B:9:0x0014, B:12:0x001d, B:14:0x0025, B:16:0x0029, B:19:0x0031, B:21:0x0035, B:23:0x0039, B:10:0x0019, B:24:0x0042, B:26:0x0046, B:27:0x004b), top: B:32:0x0008 }] */
    public static final void g(Context context, xy0.a aVar) {
        Logger logger;
        LivetrackService livetrackService;
        q qVarC = q.f184563f.c();
        synchronized (qVarC) {
            try {
                qVarC.f184570e = true;
                g1 g1Var = qVarC.f184567b;
                if (g1Var == null) {
                    logger = q.f184565h;
                    if (logger != null) {
                        logger.debug("shutdownLivetrack: no sessions in progress");
                    }
                    ge1.b.T(qVarC, null, null, new a0(context, null), 3);
                } else {
                    LivetrackService livetrackService2 = g1Var.f184472d;
                    Set<z1> setB = livetrackService2 != null ? livetrackService2.b() : p13.l0.f134950a;
                    if (setB == null || setB.isEmpty()) {
                        logger = q.f184565h;
                        if (logger != null) {
                            logger.debug("shutdownLivetrack: no sessions in progress");
                        }
                        ge1.b.T(qVarC, null, null, new a0(context, null), 3);
                    } else {
                        Logger logger2 = q.f184565h;
                        if (logger2 != null) {
                            logger2.debug("shutdownLivetrack: stopping all sessions");
                        }
                        g1 g1Var2 = qVarC.f184567b;
                        if (g1Var2 != null && (livetrackService = g1Var2.f184472d) != null) {
                            ge1.b.T(livetrackService, null, null, new com.garmin.android.library.livetrack.g(livetrackService, aVar, null), 3);
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static final void h(long j8, com.garmin.android.library.livetrack.i iVar) {
        LivetrackService livetrackService;
        iVar.getClass();
        q qVarC = q.f184563f.c();
        synchronized (qVarC) {
            try {
                g1 g1Var = qVarC.f184567b;
                if (g1Var != null && (livetrackService = g1Var.f184472d) != null) {
                    livetrackService.j(j8, iVar);
                }
                if (qVarC.f184567b == null) {
                    Logger logger = q.f184565h;
                    if (logger != null) {
                        logger.debug("Nothing to stop, shutting down");
                    }
                    ge1.b.T(qVarC, null, null, new c0(null), 3);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static final void i(long j8, a2 a2Var) {
        fe2.p1 p1Var;
        String str;
        Boolean bool;
        g1 g1Var = q.f184563f.c().f184567b;
        if (g1Var != null) {
            if (!g1Var.d()) {
                g1Var.f184471c.error("updateLivetrackSession: Not foreground started");
                return;
            }
            LivetrackService livetrackService = g1Var.f184472d;
            if (livetrackService != null) {
                Logger logger = livetrackService.f50162b;
                ge2.e eVar = a2Var.f184385b;
                logger.debug("Update livetrack session for " + j8 + ": settings = " + eVar);
                fe2.p1 p1Var2 = livetrackService.f50167g.get(j8);
                if (eVar == null || (bool = eVar.f77024c) == null) {
                    p1Var = p1Var2;
                } else {
                    boolean zBooleanValue = bool.booleanValue();
                    ge2.e eVar2 = new ge2.e(null, null, bool, null, null, null, null, 123, null);
                    l lVar = livetrackService.f50164d;
                    if (lVar == null) {
                        p005kotlin.jvm.internal.s.m("applicationDelegate");
                        throw null;
                    }
                    ge1.b.T(livetrackService, null, null, new d1(livetrackService, j8, eVar2, lVar, null), 3);
                    b1 b1Var = new b1(p1Var2, zBooleanValue, livetrackService, j8, eVar2, null);
                    p1Var = p1Var2;
                    livetrackService = livetrackService;
                    ge1.b.T(livetrackService, null, null, b1Var, 3);
                }
                z1 z1Var = a2Var.f184384a;
                if (z1Var == null || (str = z1Var.f184694b) == null) {
                    return;
                }
                ge1.b.T(livetrackService, null, null, new c1(p1Var, str, null), 3);
                l lVar2 = livetrackService.f50164d;
                if (lVar2 != null) {
                    livetrackService.m(lVar2.f().e());
                } else {
                    p005kotlin.jvm.internal.s.m("applicationDelegate");
                    throw null;
                }
            }
        }
    }
}
