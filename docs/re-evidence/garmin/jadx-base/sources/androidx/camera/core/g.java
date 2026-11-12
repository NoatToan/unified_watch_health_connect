package androidx.camera.core;

import a0.h;
import android.view.Surface;
import androidx.camera.core.impl.o1;
import b0.b1;
import b0.k0;
import h0.t0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class g implements o1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o1 f5458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Surface f5459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f5460f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5455a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5456b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5457c = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k0 f5461g = new k0(this, 1);

    public g(o1 o1Var) {
        this.f5458d = o1Var;
        this.f5459e = o1Var.getSurface();
    }

    @Override // androidx.camera.core.impl.o1
    public final e a() {
        b1 b1Var;
        synchronized (this.f5455a) {
            e eVarA = this.f5458d.a();
            if (eVarA != null) {
                this.f5456b++;
                b1Var = new b1(eVarA);
                b1Var.a(this.f5461g);
            } else {
                b1Var = null;
            }
        }
        return b1Var;
    }

    @Override // androidx.camera.core.impl.o1
    public final e b() {
        b1 b1Var;
        synchronized (this.f5455a) {
            e eVarB = this.f5458d.b();
            if (eVarB != null) {
                this.f5456b++;
                b1Var = new b1(eVarB);
                b1Var.a(this.f5461g);
            } else {
                b1Var = null;
            }
        }
        return b1Var;
    }

    @Override // androidx.camera.core.impl.o1
    public final void c() {
        synchronized (this.f5455a) {
            this.f5458d.c();
        }
    }

    @Override // androidx.camera.core.impl.o1
    public final void close() {
        synchronized (this.f5455a) {
            try {
                Surface surface = this.f5459e;
                if (surface != null) {
                    surface.release();
                }
                this.f5458d.close();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.camera.core.impl.o1
    public final void d(o1.a aVar, Executor executor) {
        synchronized (this.f5455a) {
            this.f5458d.d(new h(6, this, aVar), executor);
        }
    }

    public final void e() {
        synchronized (this.f5455a) {
            try {
                this.f5457c = true;
                this.f5458d.c();
                if (this.f5456b == 0) {
                    close();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.camera.core.impl.o1
    public final int f() {
        int iF;
        synchronized (this.f5455a) {
            iF = this.f5458d.f();
        }
        return iF;
    }

    @Override // androidx.camera.core.impl.o1
    public final int g() {
        int iG;
        synchronized (this.f5455a) {
            iG = this.f5458d.g();
        }
        return iG;
    }

    @Override // androidx.camera.core.impl.o1
    public final int getHeight() {
        int height;
        synchronized (this.f5455a) {
            height = this.f5458d.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.o1
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f5455a) {
            surface = this.f5458d.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.o1
    public final int getWidth() {
        int width;
        synchronized (this.f5455a) {
            width = this.f5458d.getWidth();
        }
        return width;
    }
}
