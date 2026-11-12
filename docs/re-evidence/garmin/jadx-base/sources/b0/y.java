package b0;

import android.os.Handler;
import androidx.camera.core.impl.a2;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.f2;
import androidx.camera.core.impl.w1;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class y implements m0.m<x> {
    public static final androidx.camera.core.impl.h O = androidx.camera.core.impl.x0.a.a(androidx.camera.core.impl.j0.a.class, "camerax.core.appConfig.cameraFactoryProvider");
    public static final androidx.camera.core.impl.h P = androidx.camera.core.impl.x0.a.a(androidx.camera.core.impl.i0.a.class, "camerax.core.appConfig.deviceSurfaceManagerProvider");
    public static final androidx.camera.core.impl.h Q = androidx.camera.core.impl.x0.a.a(c3.c.class, "camerax.core.appConfig.useCaseConfigFactoryProvider");
    public static final androidx.camera.core.impl.h R = androidx.camera.core.impl.x0.a.a(Executor.class, "camerax.core.appConfig.cameraExecutor");
    public static final androidx.camera.core.impl.h S = androidx.camera.core.impl.x0.a.a(Handler.class, "camerax.core.appConfig.schedulerHandler");
    public static final androidx.camera.core.impl.h T;
    public static final androidx.camera.core.impl.h U;
    public static final androidx.camera.core.impl.h V;
    public static final androidx.camera.core.impl.h W;
    public static final androidx.camera.core.impl.h X;
    public static final androidx.camera.core.impl.h Y;
    public static final androidx.camera.core.impl.h Z;
    public final a2 N;

    public interface b {
        y getCameraXConfig();
    }

    static {
        Class cls = Integer.TYPE;
        T = androidx.camera.core.impl.x0.a.a(cls, "camerax.core.appConfig.minimumLoggingLevel");
        U = androidx.camera.core.impl.x0.a.a(t.class, "camerax.core.appConfig.availableCamerasLimiter");
        V = androidx.camera.core.impl.x0.a.a(Long.TYPE, "camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming");
        W = androidx.camera.core.impl.x0.a.a(x0.class, "camerax.core.appConfig.cameraProviderInitRetryPolicy");
        X = androidx.camera.core.impl.x0.a.a(f2.class, "camerax.core.appConfig.quirksSettings");
        Y = androidx.camera.core.impl.x0.a.a(cls, "camerax.core.appConfig.configImplType");
        Z = androidx.camera.core.impl.x0.a.a(Boolean.TYPE, "camerax.core.appConfig.repeatingStreamForced");
    }

    public y(a2 a2Var) {
        this.N = a2Var;
    }

    public final t T() {
        return (t) this.N.f(U, null);
    }

    public final androidx.camera.core.impl.j0.a U() {
        return (androidx.camera.core.impl.j0.a) this.N.f(O, null);
    }

    public final long V() {
        return ((Long) this.N.f(V, -1L)).longValue();
    }

    public final androidx.camera.core.impl.i0.a W() {
        return (androidx.camera.core.impl.i0.a) this.N.f(P, null);
    }

    public final c3.c X() {
        return (c3.c) this.N.f(Q, null);
    }

    @Override // androidx.camera.core.impl.j2
    public final androidx.camera.core.impl.x0 getConfig() {
        return this.N;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w1 f14121a;

        private a(w1 w1Var) {
            this.f14121a = w1Var;
            androidx.camera.core.impl.h hVar = m0.m.L;
            Class cls = (Class) w1Var.f(hVar, null);
            if (cls != null && !cls.equals(x.class)) {
                c22.t.i("Invalid target class configuration for ", this, ": ", cls);
                throw null;
            }
            w1Var.X(hVar, x.class);
            androidx.camera.core.impl.h hVar2 = m0.m.K;
            if (w1Var.f(hVar2, null) == null) {
                w1Var.X(hVar2, x.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        public a() {
            this(w1.U());
        }
    }
}
