package androidx.camera.core;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import defpackage.adp;
import defpackage.dh3;
import defpackage.li3;
import defpackage.r4d;
import defpackage.w0p;
import defpackage.we3;
import defpackage.yai;
import defpackage.ye3;
import defpackage.ze3;
import defpackage.zj3;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o extends s {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final c f1787r = new c();
    public static final Executor s = li3.d();
    public d l;
    public Executor m;
    public DeferrableSurface n;

    @VisibleForTesting
    public r o;
    public boolean p;
    public Size q;

    public class a extends we3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r4d f1788a;

        public a(r4d r4dVar) {
            this.f1788a = r4dVar;
        }

        @Override // defpackage.we3
        public void b(ye3 ye3Var) {
            super.b(ye3Var);
            if (this.f1788a.a(new ze3(ye3Var))) {
                o.this.v();
            }
        }
    }

    public static final class b implements androidx.camera.core.impl.r.a<o, androidx.camera.core.impl.o, b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.camera.core.impl.m f1790a;

        public b() {
            this(androidx.camera.core.impl.m.O());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static b d(Config config) {
            return new b(androidx.camera.core.impl.m.P(config));
        }

        @Override // defpackage.zj8
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.impl.l a() {
            return this.f1790a;
        }

        public o c() {
            if (a().d(androidx.camera.core.impl.k.l, null) == null || a().d(androidx.camera.core.impl.k.o, null) == null) {
                return new o(b());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        @Override // androidx.camera.core.impl.r.a
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.camera.core.impl.o b() {
            return new androidx.camera.core.impl.o(androidx.camera.core.impl.n.M(this.f1790a));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public b f(int i) {
            a().z(androidx.camera.core.impl.r.w, Integer.valueOf(i));
            return this;
        }

        public b g(int i) {
            a().z(androidx.camera.core.impl.k.l, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public b h(Class<o> cls) {
            a().z(w0p.c, cls);
            if (a().d(w0p.f37423b, null) == null) {
                i(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public b i(String str) {
            a().z(w0p.f37423b, str);
            return this;
        }

        public b j(Size size) {
            a().z(androidx.camera.core.impl.k.o, size);
            return this;
        }

        public b(androidx.camera.core.impl.m mVar) {
            this.f1790a = mVar;
            Class cls = (Class) mVar.d(w0p.c, null);
            if (cls == null || cls.equals(o.class)) {
                h(o.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.camera.core.impl.o f1791a = new b().f(2).g(0).b();

        public androidx.camera.core.impl.o a() {
            return f1791a;
        }
    }

    public interface d {
        void a(r rVar);
    }

    public o(androidx.camera.core.impl.o oVar) {
        super(oVar);
        this.m = s;
        this.p = false;
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void A() {
        DeferrableSurface deferrableSurface = this.n;
        if (deferrableSurface != null) {
            deferrableSurface.c();
        }
        this.o = null;
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.r<?> B(dh3 dh3Var, androidx.camera.core.impl.r.a<?, ?, ?> aVar) {
        if (aVar.a().d(androidx.camera.core.impl.o.B, null) != null) {
            aVar.a().z(androidx.camera.core.impl.j.f1737k, 35);
        } else {
            aVar.a().z(androidx.camera.core.impl.j.f1737k, 34);
        }
        return aVar.b();
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Size E(Size size) {
        this.q = size;
        U(f(), (androidx.camera.core.impl.o) g(), this.q);
        return size;
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void H(Rect rect) {
        super.H(rect);
        R();
    }

    public SessionConfig.b M(final String str, final androidx.camera.core.impl.o oVar, final Size size) {
        adp.a();
        SessionConfig.b bVarO = SessionConfig.b.o(oVar);
        zj3 zj3VarK = oVar.K(null);
        DeferrableSurface deferrableSurface = this.n;
        if (deferrableSurface != null) {
            deferrableSurface.c();
        }
        r rVar = new r(size, d(), oVar.M(false));
        this.o = rVar;
        if (Q()) {
            R();
        } else {
            this.p = true;
        }
        if (zj3VarK != null) {
            androidx.camera.core.impl.f.a aVar = new androidx.camera.core.impl.f.a();
            final HandlerThread handlerThread = new HandlerThread("CameraX-preview_processing");
            handlerThread.start();
            String string = Integer.toString(aVar.hashCode());
            yai yaiVar = new yai(size.getWidth(), size.getHeight(), oVar.m(), new Handler(handlerThread.getLooper()), aVar, zj3VarK, rVar.k(), string);
            bVarO.d(yaiVar.r());
            yaiVar.i().addListener(new Runnable() { // from class: s7i
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quitSafely();
                }
            }, li3.a());
            this.n = yaiVar;
            bVarO.l(string, Integer.valueOf(aVar.getId()));
        } else {
            r4d r4dVarL = oVar.L(null);
            if (r4dVarL != null) {
                bVarO.d(new a(r4dVarL));
            }
            this.n = rVar.k();
        }
        bVarO.k(this.n);
        bVarO.f(new SessionConfig.c() { // from class: t7i
            @Override // androidx.camera.core.impl.SessionConfig.c
            public final void a(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                this.f34421a.O(str, oVar, size, sessionConfig, sessionError);
            }
        });
        return bVarO;
    }

    public final Rect N(Size size) {
        if (o() != null) {
            return o();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    public final /* synthetic */ void O(String str, androidx.camera.core.impl.o oVar, Size size, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        if (p(str)) {
            I(M(str, oVar, size).m());
            t();
        }
    }

    public final boolean Q() {
        final r rVar = this.o;
        final d dVar = this.l;
        if (dVar == null || rVar == null) {
            return false;
        }
        this.m.execute(new Runnable() { // from class: u7i
            @Override // java.lang.Runnable
            public final void run() {
                dVar.a(rVar);
            }
        });
        return true;
    }

    public final void R() {
        CameraInternal cameraInternalD = d();
        d dVar = this.l;
        Rect rectN = N(this.q);
        r rVar = this.o;
        if (cameraInternalD == null || dVar == null || rectN == null) {
            return;
        }
        rVar.x(r.g.d(rectN, k(cameraInternalD), b()));
    }

    public void S(d dVar) {
        T(s, dVar);
    }

    public void T(Executor executor, d dVar) {
        adp.a();
        if (dVar == null) {
            this.l = null;
            s();
            return;
        }
        this.l = dVar;
        this.m = executor;
        r();
        if (this.p) {
            if (Q()) {
                R();
                this.p = false;
                return;
            }
            return;
        }
        if (c() != null) {
            U(f(), (androidx.camera.core.impl.o) g(), c());
            t();
        }
    }

    public final void U(String str, androidx.camera.core.impl.o oVar, Size size) {
        I(M(str, oVar, size).m());
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.r<?> h(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config configA = useCaseConfigFactory.a(UseCaseConfigFactory.CaptureType.PREVIEW, 1);
        if (z) {
            configA = Config.G(configA, f1787r.a());
        }
        if (configA == null) {
            return null;
        }
        return n(configA).b();
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.r.a<?, ?, ?> n(Config config) {
        return b.d(config);
    }

    public String toString() {
        return "Preview:" + j();
    }
}
