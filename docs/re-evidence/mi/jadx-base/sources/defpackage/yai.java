package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.f;
import androidx.camera.core.m;
import androidx.camera.core.n;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class yai extends DeferrableSurface {
    public final Object m;
    public final p5d.a n;

    @GuardedBy("mLock")
    public boolean o;
    public final Size p;

    @GuardedBy("mLock")
    public final n q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @GuardedBy("mLock")
    public final Surface f39990r;
    public final Handler s;
    public final f t;

    @GuardedBy("mLock")
    public final zj3 u;
    public final we3 v;
    public final DeferrableSurface w;
    public String x;

    public class a implements jua<Surface> {
        public a() {
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            synchronized (yai.this.m) {
                yai.this.u.a(surface, 1);
            }
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
            zpe.d("ProcessingSurfaceTextur", "Failed to extract Listenable<Surface>.", th);
        }
    }

    public yai(int i, int i2, int i3, Handler handler, f fVar, zj3 zj3Var, DeferrableSurface deferrableSurface, String str) {
        super(new Size(i, i2), i3);
        this.m = new Object();
        p5d.a aVar = new p5d.a() { // from class: wai
            @Override // p5d.a
            public final void a(p5d p5dVar) {
                this.f37771a.t(p5dVar);
            }
        };
        this.n = aVar;
        this.o = false;
        Size size = new Size(i, i2);
        this.p = size;
        if (handler != null) {
            this.s = handler;
        } else {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("Creating a ProcessingSurface requires a non-null Handler, or be created  on a thread with a Looper.");
            }
            this.s = new Handler(looperMyLooper);
        }
        ScheduledExecutorService scheduledExecutorServiceE = li3.e(this.s);
        n nVar = new n(i, i2, i3, 2);
        this.q = nVar;
        nVar.d(aVar, scheduledExecutorServiceE);
        this.f39990r = nVar.a();
        this.v = nVar.n();
        this.u = zj3Var;
        zj3Var.c(size);
        this.t = fVar;
        this.w = deferrableSurface;
        this.x = str;
        oua.b(deferrableSurface.h(), new a(), li3.a());
        i().addListener(new Runnable() { // from class: xai
            @Override // java.lang.Runnable
            public final void run() {
                this.f38916a.u();
            }
        }, li3.a());
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public lhe<Surface> n() {
        lhe<Surface> lheVarH;
        synchronized (this.m) {
            lheVarH = oua.h(this.f39990r);
        }
        return lheVarH;
    }

    public we3 r() {
        we3 we3Var;
        synchronized (this.m) {
            try {
                if (this.o) {
                    throw new IllegalStateException("ProcessingSurface already released!");
                }
                we3Var = this.v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return we3Var;
    }

    @GuardedBy("mLock")
    public void s(p5d p5dVar) {
        m mVarE;
        if (this.o) {
            return;
        }
        try {
            mVarE = p5dVar.e();
        } catch (IllegalStateException e) {
            zpe.d("ProcessingSurfaceTextur", "Failed to acquire next image.", e);
            mVarE = null;
        }
        if (mVarE == null) {
            return;
        }
        q4d q4dVarH = mVarE.H();
        if (q4dVarH == null) {
            mVarE.close();
            return;
        }
        Integer num = (Integer) q4dVarH.a().c(this.x);
        if (num == null) {
            mVarE.close();
            return;
        }
        if (this.t.getId() == num.intValue()) {
            hem hemVar = new hem(mVarE, this.x);
            this.u.d(hemVar);
            hemVar.c();
        } else {
            zpe.k("ProcessingSurfaceTextur", "ImageProxyBundle does not contain this id: " + num);
            mVarE.close();
        }
    }

    public final /* synthetic */ void t(p5d p5dVar) {
        synchronized (this.m) {
            s(p5dVar);
        }
    }

    public final void u() {
        synchronized (this.m) {
            try {
                if (this.o) {
                    return;
                }
                this.q.close();
                this.f39990r.release();
                this.w.c();
                this.o = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
