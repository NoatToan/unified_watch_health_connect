package j1;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import b0.g1;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class w extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SurfaceView f96317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f96318f;

    public class a implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Size f96319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g1 f96320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g1 f96321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a73.f f96322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Size f96323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f96324f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f96325g = false;

        public a() {
        }

        public final boolean a() {
            w wVar = w.this;
            Surface surface = wVar.f96317e.getHolder().getSurface();
            if (this.f96324f || this.f96320b == null || !Objects.equals(this.f96319a, this.f96323e)) {
                return false;
            }
            a73.f fVar = this.f96322d;
            g1 g1Var = this.f96320b;
            Objects.requireNonNull(g1Var);
            g1Var.b(surface, a7.b.getMainExecutor(wVar.f96317e.getContext()), new v(fVar, 0));
            this.f96324f = true;
            wVar.f96291d = true;
            wVar.f();
            return true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i14, int i15, int i16) {
            this.f96323e = new Size(i15, i16);
            a();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            g1 g1Var;
            if (!this.f96325g || (g1Var = this.f96321c) == null) {
                return;
            }
            g1Var.d();
            g1Var.f13915k.b(null);
            this.f96321c = null;
            this.f96325g = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            a73.f fVar;
            boolean z14 = this.f96324f;
            g1 g1Var = this.f96320b;
            if (z14) {
                if (g1Var != null) {
                    Objects.toString(g1Var);
                    this.f96320b.f13917m.a();
                }
            } else if (g1Var != null) {
                Objects.toString(g1Var);
                if (this.f96320b.d() && (fVar = this.f96322d) != null) {
                    fVar.a();
                }
            }
            this.f96325g = true;
            g1 g1Var2 = this.f96320b;
            if (g1Var2 != null) {
                this.f96321c = g1Var2;
            }
            this.f96324f = false;
            this.f96320b = null;
            this.f96322d = null;
            this.f96323e = null;
            this.f96319a = null;
        }
    }

    public w(FrameLayout frameLayout, j jVar) {
        super(frameLayout, jVar);
        this.f96318f = new a();
    }

    @Override // j1.l
    public final View a() {
        return this.f96317e;
    }

    @Override // j1.l
    public final Bitmap b() {
        SurfaceView surfaceView = this.f96317e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f96317e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f96317e.getWidth(), this.f96317e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.f96317e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: j1.u
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i14) {
                semaphore.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS);
            return bitmapCreateBitmap;
        } catch (InterruptedException unused) {
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // j1.l
    public final void c() {
    }

    @Override // j1.l
    public final void d() {
    }

    @Override // j1.l
    public final void e(g1 g1Var, a73.f fVar) {
        SurfaceView surfaceView = this.f96317e;
        boolean zEquals = Objects.equals(this.f96288a, g1Var.f13906b);
        if (surfaceView == null || !zEquals) {
            this.f96288a = g1Var.f13906b;
            FrameLayout frameLayout = this.f96289b;
            frameLayout.getClass();
            this.f96288a.getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.f96317e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.f96288a.getWidth(), this.f96288a.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.f96317e);
            this.f96317e.getHolder().addCallback(this.f96318f);
        }
        Executor mainExecutor = a7.b.getMainExecutor(this.f96317e.getContext());
        g1Var.f13916l.a(new eh2.b(fVar, 24), mainExecutor);
        this.f96317e.post(new fh2.a(this, 8, g1Var, fVar));
    }

    @Override // j1.l
    public final ListenableFuture<Void> g() {
        l0.j.a aVar = l0.j.f107810a;
        return l0.m.c.f107817b;
    }
}
