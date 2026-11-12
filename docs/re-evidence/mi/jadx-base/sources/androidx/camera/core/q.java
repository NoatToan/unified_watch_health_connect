package androidx.camera.core;

import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.m;
import defpackage.eem;
import defpackage.p5d;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class q implements p5d {

    @GuardedBy("mLock")
    public final p5d d;
    public final Surface e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1802a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f1803b = 0;

    @GuardedBy("mLock")
    public boolean c = false;
    public final f.a f = new f.a() { // from class: c9l
        @Override // androidx.camera.core.f.a
        public final void f(m mVar) {
            this.f5088a.j(mVar);
        }
    };

    public q(p5d p5dVar) {
        this.d = p5dVar;
        this.e = p5dVar.a();
    }

    @Override // defpackage.p5d
    public Surface a() {
        Surface surfaceA;
        synchronized (this.f1802a) {
            surfaceA = this.d.a();
        }
        return surfaceA;
    }

    @Override // defpackage.p5d
    public int b() {
        int iB;
        synchronized (this.f1802a) {
            iB = this.d.b();
        }
        return iB;
    }

    @Override // defpackage.p5d
    public int c() {
        int iC;
        synchronized (this.f1802a) {
            iC = this.d.c();
        }
        return iC;
    }

    @Override // defpackage.p5d
    public void close() {
        synchronized (this.f1802a) {
            try {
                Surface surface = this.e;
                if (surface != null) {
                    surface.release();
                }
                this.d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.p5d
    public void d(final p5d.a aVar, Executor executor) {
        synchronized (this.f1802a) {
            this.d.d(new p5d.a() { // from class: b9l
                @Override // p5d.a
                public final void a(p5d p5dVar) {
                    this.f3954a.k(aVar, p5dVar);
                }
            }, executor);
        }
    }

    @Override // defpackage.p5d
    public m e() {
        m mVarM;
        synchronized (this.f1802a) {
            mVarM = m(this.d.e());
        }
        return mVarM;
    }

    @Override // defpackage.p5d
    public m g() {
        m mVarM;
        synchronized (this.f1802a) {
            mVarM = m(this.d.g());
        }
        return mVarM;
    }

    @Override // defpackage.p5d
    public int getHeight() {
        int height;
        synchronized (this.f1802a) {
            height = this.d.getHeight();
        }
        return height;
    }

    @Override // defpackage.p5d
    public int getWidth() {
        int width;
        synchronized (this.f1802a) {
            width = this.d.getWidth();
        }
        return width;
    }

    @Override // defpackage.p5d
    public void h() {
        synchronized (this.f1802a) {
            this.d.h();
        }
    }

    public final /* synthetic */ void j(m mVar) {
        synchronized (this.f1802a) {
            try {
                int i = this.f1803b - 1;
                this.f1803b = i;
                if (this.c && i == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void k(p5d.a aVar, p5d p5dVar) {
        aVar.a(this);
    }

    public void l() {
        synchronized (this.f1802a) {
            try {
                this.c = true;
                this.d.h();
                if (this.f1803b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @GuardedBy("mLock")
    public final m m(m mVar) {
        if (mVar == null) {
            return null;
        }
        this.f1803b++;
        eem eemVar = new eem(mVar);
        eemVar.addOnImageCloseListener(this.f);
        return eemVar;
    }
}
