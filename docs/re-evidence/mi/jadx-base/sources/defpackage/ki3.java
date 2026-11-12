package defpackage;

import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.l;
import androidx.camera.core.impl.m;
import androidx.camera.core.impl.n;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ki3 implements w0p<ji3> {
    public static final Config.a<ah3.a> A = Config.a.a("camerax.core.appConfig.cameraFactoryProvider", ah3.a.class);
    public static final Config.a<vg3.a> B = Config.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", vg3.a.class);
    public static final Config.a<UseCaseConfigFactory.b> C = Config.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", UseCaseConfigFactory.b.class);
    public static final Config.a<Executor> D = Config.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);
    public static final Config.a<Handler> E = Config.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);
    public static final Config.a<Integer> F = Config.a.a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);
    public static final Config.a<xh3> G = Config.a.a("camerax.core.appConfig.availableCamerasLimiter", xh3.class);
    public final n z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f23869a;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public a() {
            this(m.O());
        }

        public ki3 a() {
            return new ki3(n.M(this.f23869a));
        }

        public final l b() {
            return this.f23869a;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public a c(ah3.a aVar) {
            b().z(ki3.A, aVar);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public a d(vg3.a aVar) {
            b().z(ki3.B, aVar);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public a e(Class<ji3> cls) {
            b().z(w0p.c, cls);
            if (b().d(w0p.f37423b, null) == null) {
                f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public a f(String str) {
            b().z(w0p.f37423b, str);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public a g(UseCaseConfigFactory.b bVar) {
            b().z(ki3.C, bVar);
            return this;
        }

        public a(m mVar) {
            this.f23869a = mVar;
            Class cls = (Class) mVar.d(w0p.c, null);
            if (cls == null || cls.equals(ji3.class)) {
                e(ji3.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public interface b {
        ki3 getCameraXConfig();
    }

    public ki3(n nVar) {
        this.z = nVar;
    }

    public xh3 K(xh3 xh3Var) {
        return (xh3) this.z.d(G, xh3Var);
    }

    public Executor L(Executor executor) {
        return (Executor) this.z.d(D, executor);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ah3.a M(ah3.a aVar) {
        return (ah3.a) this.z.d(A, aVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public vg3.a N(vg3.a aVar) {
        return (vg3.a) this.z.d(B, aVar);
    }

    public Handler O(Handler handler) {
        return (Handler) this.z.d(E, handler);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfigFactory.b P(UseCaseConfigFactory.b bVar) {
        return (UseCaseConfigFactory.b) this.z.d(C, bVar);
    }

    @Override // androidx.camera.core.impl.p
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Config e() {
        return this.z;
    }
}
