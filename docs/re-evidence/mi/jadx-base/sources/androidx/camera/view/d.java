package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.camera.core.r;
import androidx.camera.view.d;
import androidx.core.util.Consumer;
import defpackage.g6i;
import defpackage.lhe;
import defpackage.ni4;
import defpackage.oua;
import defpackage.zpe;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class d extends c {
    public SurfaceView e;
    public final b f;
    public c.a g;

    @RequiresApi(24)
    public static class a {
        public static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    @RequiresApi(21)
    public class b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Size f1858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r f1859b;
        public Size c;
        public boolean d = false;

        public b() {
        }

        public final boolean b() {
            Size size;
            return (this.d || this.f1859b == null || (size = this.f1858a) == null || !size.equals(this.c)) ? false : true;
        }

        public final void c() {
            if (this.f1859b != null) {
                zpe.a("SurfaceViewImpl", "Request canceled: " + this.f1859b);
                this.f1859b.y();
            }
        }

        public final void d() {
            if (this.f1859b != null) {
                zpe.a("SurfaceViewImpl", "Surface invalidated " + this.f1859b);
                this.f1859b.k().c();
            }
        }

        public final /* synthetic */ void e(r.f fVar) {
            zpe.a("SurfaceViewImpl", "Safe to release surface.");
            d.this.o();
        }

        public void f(r rVar) {
            c();
            this.f1859b = rVar;
            Size sizeL = rVar.l();
            this.f1858a = sizeL;
            this.d = false;
            if (g()) {
                return;
            }
            zpe.a("SurfaceViewImpl", "Wait for new Surface creation.");
            d.this.e.getHolder().setFixedSize(sizeL.getWidth(), sizeL.getHeight());
        }

        public final boolean g() {
            Surface surface = d.this.e.getHolder().getSurface();
            if (!b()) {
                return false;
            }
            zpe.a("SurfaceViewImpl", "Surface set on Preview.");
            this.f1859b.v(surface, ni4.h(d.this.e.getContext()), new Consumer() { // from class: rqo
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.f32807a.e((r.f) obj);
                }
            });
            this.d = true;
            d.this.f();
            return true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            zpe.a("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
            this.c = new Size(i2, i3);
            g();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            zpe.a("SurfaceViewImpl", "Surface created.");
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            zpe.a("SurfaceViewImpl", "Surface destroyed.");
            if (this.d) {
                d();
            } else {
                c();
            }
            this.d = false;
            this.f1859b = null;
            this.c = null;
            this.f1858a = null;
        }
    }

    public d(FrameLayout frameLayout, androidx.camera.view.b bVar) {
        super(frameLayout, bVar);
        this.f = new b();
    }

    public static /* synthetic */ void m(int i) {
        if (i == 0) {
            zpe.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
            return;
        }
        zpe.c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
    }

    @Override // androidx.camera.view.c
    public View b() {
        return this.e;
    }

    @Override // androidx.camera.view.c
    @RequiresApi(24)
    public Bitmap c() {
        SurfaceView surfaceView = this.e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.e.getHolder().getSurface().isValid()) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.e.getWidth(), this.e.getHeight(), Bitmap.Config.ARGB_8888);
        a.a(this.e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: qqo
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                d.m(i);
            }
        }, this.e.getHandler());
        return bitmapCreateBitmap;
    }

    @Override // androidx.camera.view.c
    public void d() {
    }

    @Override // androidx.camera.view.c
    public void e() {
    }

    @Override // androidx.camera.view.c
    public void g(final r rVar, c.a aVar) {
        this.f1856a = rVar.l();
        this.g = aVar;
        l();
        rVar.i(ni4.h(this.e.getContext()), new Runnable() { // from class: oqo
            @Override // java.lang.Runnable
            public final void run() {
                this.f29397a.o();
            }
        });
        this.e.post(new Runnable() { // from class: pqo
            @Override // java.lang.Runnable
            public final void run() {
                this.f30653a.n(rVar);
            }
        });
    }

    @Override // androidx.camera.view.c
    public lhe<Void> i() {
        return oua.h(null);
    }

    public void l() {
        g6i.g(this.f1857b);
        g6i.g(this.f1856a);
        SurfaceView surfaceView = new SurfaceView(this.f1857b.getContext());
        this.e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f1856a.getWidth(), this.f1856a.getHeight()));
        this.f1857b.removeAllViews();
        this.f1857b.addView(this.e);
        this.e.getHolder().addCallback(this.f);
    }

    public final /* synthetic */ void n(r rVar) {
        this.f.f(rVar);
    }

    public void o() {
        c.a aVar = this.g;
        if (aVar != null) {
            aVar.a();
            this.g = null;
        }
    }
}
