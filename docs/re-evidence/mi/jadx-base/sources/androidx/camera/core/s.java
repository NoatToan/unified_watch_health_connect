package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import defpackage.ch3;
import defpackage.dh3;
import defpackage.g6i;
import defpackage.w0p;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class s {
    public androidx.camera.core.impl.r<?> d;
    public androidx.camera.core.impl.r<?> e;
    public androidx.camera.core.impl.r<?> f;
    public Size g;
    public androidx.camera.core.impl.r<?> h;
    public Rect i;

    @GuardedBy("mCameraLock")
    public CameraInternal j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<d> f1813a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1814b = new Object();
    public c c = c.INACTIVE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SessionConfig f1815k = SessionConfig.a();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1816a;

        static {
            int[] iArr = new int[c.values().length];
            f1816a = iArr;
            try {
                iArr[c.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1816a[c.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface b {
        void a(ch3 ch3Var);

        void onDetach();
    }

    public enum c {
        ACTIVE,
        INACTIVE
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface d {
        void b(s sVar);

        void f(s sVar);

        void k(s sVar);

        void l(s sVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public s(androidx.camera.core.impl.r<?> rVar) {
        this.e = rVar;
        this.f = rVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void A() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.r<?> B(dh3 dh3Var, androidx.camera.core.impl.r.a<?, ?, ?> aVar) {
        return aVar.b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void C() {
        y();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void D() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract Size E(Size size);

    public final void F(d dVar) {
        this.f1813a.remove(dVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void G(Matrix matrix) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void H(Rect rect) {
        this.i = rect;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void I(SessionConfig sessionConfig) {
        this.f1815k = sessionConfig;
        for (DeferrableSurface deferrableSurface : sessionConfig.j()) {
            if (deferrableSurface.e() == null) {
                deferrableSurface.o(getClass());
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void J(Size size) {
        this.g = E(size);
    }

    public final void a(d dVar) {
        this.f1813a.add(dVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int b() {
        return ((androidx.camera.core.impl.k) this.f).q(-1);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Size c() {
        return this.g;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraInternal d() {
        CameraInternal cameraInternal;
        synchronized (this.f1814b) {
            cameraInternal = this.j;
        }
        return cameraInternal;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraControlInternal e() {
        synchronized (this.f1814b) {
            try {
                CameraInternal cameraInternal = this.j;
                if (cameraInternal == null) {
                    return CameraControlInternal.f1712a;
                }
                return cameraInternal.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String f() {
        return ((CameraInternal) g6i.h(d(), "No camera attached to use case: " + this)).c().a();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.r<?> g() {
        return this.f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract androidx.camera.core.impl.r<?> h(boolean z, UseCaseConfigFactory useCaseConfigFactory);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int i() {
        return this.f.m();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String j() {
        return this.f.r("<UnknownUseCase-" + hashCode() + ">");
    }

    @IntRange(from = 0, to = 359)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int k(CameraInternal cameraInternal) {
        return cameraInternal.c().e(m());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SessionConfig l() {
        return this.f1815k;
    }

    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int m() {
        return ((androidx.camera.core.impl.k) this.f).u(0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract androidx.camera.core.impl.r.a<?, ?, ?> n(Config config);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Rect o() {
        return this.i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean p(String str) {
        if (d() == null) {
            return false;
        }
        return Objects.equals(str, f());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.r<?> q(dh3 dh3Var, androidx.camera.core.impl.r<?> rVar, androidx.camera.core.impl.r<?> rVar2) {
        androidx.camera.core.impl.m mVarO;
        if (rVar2 != null) {
            mVarO = androidx.camera.core.impl.m.P(rVar2);
            mVarO.Q(w0p.f37423b);
        } else {
            mVarO = androidx.camera.core.impl.m.O();
        }
        for (Config.a<?> aVar : this.e.h()) {
            mVarO.o(aVar, this.e.i(aVar), this.e.a(aVar));
        }
        if (rVar != null) {
            for (Config.a<?> aVar2 : rVar.h()) {
                if (!aVar2.c().equals(w0p.f37423b.c())) {
                    mVarO.o(aVar2, rVar.i(aVar2), rVar.a(aVar2));
                }
            }
        }
        if (mVarO.f(androidx.camera.core.impl.k.o)) {
            Config.a<Integer> aVar3 = androidx.camera.core.impl.k.l;
            if (mVarO.f(aVar3)) {
                mVarO.Q(aVar3);
            }
        }
        return B(dh3Var, n(mVarO));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void r() {
        this.c = c.ACTIVE;
        u();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void s() {
        this.c = c.INACTIVE;
        u();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void t() {
        Iterator<d> it = this.f1813a.iterator();
        while (it.hasNext()) {
            it.next().k(this);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void u() {
        int i = a.f1816a[this.c.ordinal()];
        if (i == 1) {
            Iterator<d> it = this.f1813a.iterator();
            while (it.hasNext()) {
                it.next().l(this);
            }
        } else {
            if (i != 2) {
                return;
            }
            Iterator<d> it2 = this.f1813a.iterator();
            while (it2.hasNext()) {
                it2.next().f(this);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void v() {
        Iterator<d> it = this.f1813a.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void w(CameraInternal cameraInternal, androidx.camera.core.impl.r<?> rVar, androidx.camera.core.impl.r<?> rVar2) {
        synchronized (this.f1814b) {
            this.j = cameraInternal;
            a(cameraInternal);
        }
        this.d = rVar;
        this.h = rVar2;
        androidx.camera.core.impl.r<?> rVarQ = q(cameraInternal.c(), this.d, this.h);
        this.f = rVarQ;
        b bVarH = rVarQ.H(null);
        if (bVarH != null) {
            bVarH.a(cameraInternal.c());
        }
        x();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void x() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void y() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void z(CameraInternal cameraInternal) {
        A();
        b bVarH = this.f.H(null);
        if (bVarH != null) {
            bVarH.onDetach();
        }
        synchronized (this.f1814b) {
            g6i.a(cameraInternal == this.j);
            F(this.j);
            this.j = null;
        }
        this.g = null;
        this.i = null;
        this.f = this.e;
        this.d = null;
        this.h = null;
    }
}
