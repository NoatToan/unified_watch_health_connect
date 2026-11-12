package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.GuardedBy;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.g;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.m;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import defpackage.adp;
import defpackage.cj8;
import defpackage.dh3;
import defpackage.g6i;
import defpackage.li3;
import defpackage.n6d;
import defpackage.oah;
import defpackage.p2d;
import defpackage.r5d;
import defpackage.w0p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class g extends s {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final d p = new d();
    public static final Boolean q = null;
    public final h l;
    public final Object m;

    @GuardedBy("mAnalysisLock")
    public a n;
    public DeferrableSurface o;

    public interface a {
        void analyze(m mVar);

        @cj8
        default int getTargetCoordinateSystem() {
            return 0;
        }

        @cj8
        default Size getTargetResolutionOverride() {
            return null;
        }

        @cj8
        default void updateTransform(Matrix matrix) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface b {
    }

    public static final class c implements androidx.camera.core.impl.r.a<g, androidx.camera.core.impl.h, c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.camera.core.impl.m f1702a;

        public c() {
            this(androidx.camera.core.impl.m.O());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static c d(Config config) {
            return new c(androidx.camera.core.impl.m.P(config));
        }

        @Override // defpackage.zj8
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.impl.l a() {
            return this.f1702a;
        }

        public g c() {
            if (a().d(androidx.camera.core.impl.k.l, null) == null || a().d(androidx.camera.core.impl.k.o, null) == null) {
                return new g(b());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        @Override // androidx.camera.core.impl.r.a
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.camera.core.impl.h b() {
            return new androidx.camera.core.impl.h(androidx.camera.core.impl.n.M(this.f1702a));
        }

        public c f(int i) {
            a().z(androidx.camera.core.impl.h.A, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c g(Size size) {
            a().z(androidx.camera.core.impl.k.p, size);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c h(int i) {
            a().z(androidx.camera.core.impl.r.w, Integer.valueOf(i));
            return this;
        }

        public c i(int i) {
            a().z(androidx.camera.core.impl.k.l, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c j(Class<g> cls) {
            a().z(w0p.c, cls);
            if (a().d(w0p.f37423b, null) == null) {
                k(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c k(String str) {
            a().z(w0p.f37423b, str);
            return this;
        }

        public c l(Size size) {
            a().z(androidx.camera.core.impl.k.o, size);
            return this;
        }

        public c m(int i) {
            a().z(androidx.camera.core.impl.k.m, Integer.valueOf(i));
            return this;
        }

        public c(androidx.camera.core.impl.m mVar) {
            this.f1702a = mVar;
            Class cls = (Class) mVar.d(w0p.c, null);
            if (cls == null || cls.equals(g.class)) {
                j(g.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Size f1703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final androidx.camera.core.impl.h f1704b;

        static {
            Size size = new Size(GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 480);
            f1703a = size;
            f1704b = new c().g(size).h(1).i(0).b();
        }

        public androidx.camera.core.impl.h a() {
            return f1704b;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface e {
    }

    public g(androidx.camera.core.impl.h hVar) {
        super(hVar);
        this.m = new Object();
        if (((androidx.camera.core.impl.h) g()).K(0) == 1) {
            this.l = new p2d();
        } else {
            this.l = new i(hVar.y(li3.b()));
        }
        this.l.u(S());
        this.l.v(U());
    }

    public static /* synthetic */ void V(q qVar, q qVar2) {
        qVar.l();
        if (qVar2 != null) {
            qVar2.l();
        }
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void A() {
        N();
        this.l.j();
    }

    @Override // androidx.camera.core.s
    @OptIn(markerClass = {cj8.class})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.r<?> B(dh3 dh3Var, androidx.camera.core.impl.r.a<?, ?, ?> aVar) {
        Size targetResolutionOverride;
        Boolean boolR = R();
        boolean zA = dh3Var.f().a(oah.class);
        h hVar = this.l;
        if (boolR != null) {
            zA = boolR.booleanValue();
        }
        hVar.t(zA);
        synchronized (this.m) {
            try {
                a aVar2 = this.n;
                targetResolutionOverride = aVar2 != null ? aVar2.getTargetResolutionOverride() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (targetResolutionOverride != null) {
            aVar.a().z(androidx.camera.core.impl.k.o, targetResolutionOverride);
        }
        return aVar.b();
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Size E(Size size) {
        I(O(f(), (androidx.camera.core.impl.h) g(), size).m());
        return size;
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void G(Matrix matrix) {
        this.l.y(matrix);
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void H(Rect rect) {
        super.H(rect);
        this.l.z(rect);
    }

    public void N() {
        adp.a();
        DeferrableSurface deferrableSurface = this.o;
        if (deferrableSurface != null) {
            deferrableSurface.c();
            this.o = null;
        }
    }

    public SessionConfig.b O(final String str, final androidx.camera.core.impl.h hVar, final Size size) {
        adp.a();
        Executor executor = (Executor) g6i.g(hVar.y(li3.b()));
        boolean z = true;
        int iQ = P() == 1 ? Q() : 4;
        final q qVar = hVar.M() != null ? new q(hVar.M().a(size.getWidth(), size.getHeight(), i(), iQ, 0L)) : new q(r5d.a(size.getWidth(), size.getHeight(), i(), iQ));
        boolean zT = d() != null ? T(d()) : false;
        int height = zT ? size.getHeight() : size.getWidth();
        int width = zT ? size.getWidth() : size.getHeight();
        int i = S() == 2 ? 1 : 35;
        boolean z2 = i() == 35 && S() == 2;
        if (i() != 35 || ((d() == null || k(d()) == 0) && !Boolean.TRUE.equals(R()))) {
            z = false;
        }
        final q qVar2 = (z2 || z) ? new q(r5d.a(height, width, i, qVar.c())) : null;
        if (qVar2 != null) {
            this.l.w(qVar2);
        }
        Z();
        qVar.d(this.l, executor);
        SessionConfig.b bVarO = SessionConfig.b.o(hVar);
        DeferrableSurface deferrableSurface = this.o;
        if (deferrableSurface != null) {
            deferrableSurface.c();
        }
        n6d n6dVar = new n6d(qVar.a(), size, i());
        this.o = n6dVar;
        n6dVar.i().addListener(new Runnable() { // from class: l2d
            @Override // java.lang.Runnable
            public final void run() {
                g.V(qVar, qVar2);
            }
        }, li3.d());
        bVarO.k(this.o);
        bVarO.f(new SessionConfig.c() { // from class: m2d
            @Override // androidx.camera.core.impl.SessionConfig.c
            public final void a(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                this.f25675a.W(str, hVar, size, sessionConfig, sessionError);
            }
        });
        return bVarO;
    }

    public int P() {
        return ((androidx.camera.core.impl.h) g()).K(0);
    }

    public int Q() {
        return ((androidx.camera.core.impl.h) g()).L(6);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Boolean R() {
        return ((androidx.camera.core.impl.h) g()).N(q);
    }

    public int S() {
        return ((androidx.camera.core.impl.h) g()).O(1);
    }

    public final boolean T(CameraInternal cameraInternal) {
        return U() && k(cameraInternal) % 180 != 0;
    }

    public boolean U() {
        return ((androidx.camera.core.impl.h) g()).P(Boolean.FALSE).booleanValue();
    }

    public final /* synthetic */ void W(String str, androidx.camera.core.impl.h hVar, Size size, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        N();
        this.l.g();
        if (p(str)) {
            I(O(str, hVar, size).m());
            t();
        }
    }

    public void Y(Executor executor, final a aVar) {
        synchronized (this.m) {
            try {
                this.l.s(executor, new a() { // from class: k2d
                    @Override // androidx.camera.core.g.a
                    public final void analyze(m mVar) {
                        aVar.analyze(mVar);
                    }
                });
                if (this.n == null) {
                    r();
                }
                this.n = aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Z() {
        CameraInternal cameraInternalD = d();
        if (cameraInternalD != null) {
            this.l.x(k(cameraInternalD));
        }
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.r<?> h(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config configA = useCaseConfigFactory.a(UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS, 1);
        if (z) {
            configA = Config.G(configA, p.a());
        }
        if (configA == null) {
            return null;
        }
        return n(configA).b();
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.r.a<?, ?, ?> n(Config config) {
        return c.d(config);
    }

    public String toString() {
        return "ImageAnalysis:" + j();
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void x() {
        this.l.f();
    }
}
