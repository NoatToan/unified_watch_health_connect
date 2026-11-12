package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public class bvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f4656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f4657b;
    public cvr c;
    public Handler d;
    public final Random e = new Random();
    public volatile boolean f = false;
    public volatile boolean g = false;
    public Runnable h = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bvr.this.i();
        }
    }

    public class b implements Runnable {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bitmap f4660a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f4661b;

            public a(Bitmap bitmap, long j) {
                this.f4660a = bitmap;
                this.f4661b = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (bvr.this.f4657b != null) {
                    bvr.this.f4657b.a(this.f4660a);
                }
                zxr.a("BlurManager", "BlurTransformation:total spend:" + (System.nanoTime() - this.f4661b) + " ns");
                zxr.a("BlurManager", "resultBitmap:width:" + this.f4660a.getWidth() + "--height:" + this.f4660a.getHeight());
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmapA;
            if (bvr.this.f) {
                return;
            }
            bvr.this.f = true;
            long jNanoTime = System.nanoTime();
            bvr.this.c.c();
            try {
                bitmapA = bvr.this.c.a();
            } catch (Exception e) {
                e.printStackTrace();
                bvr.this.f = false;
                bitmapA = null;
            }
            bvr.this.g = true;
            if (bitmapA != null && bvr.this.f4656a != null) {
                bvr.this.f4656a.post(new a(bitmapA, jNanoTime));
            }
            bvr.this.f = false;
        }
    }

    public interface c {
        void a(Bitmap bitmap);
    }

    public void h(View view, c cVar) {
        this.f4656a = view;
        this.f4657b = cVar;
        j();
    }

    public final boolean i() {
        Handler handler;
        if (this.c != null && (handler = this.d) != null) {
            handler.post(new b());
        }
        return true;
    }

    public final void j() {
        l();
        cvr cvrVar = new cvr("blur", this.f4656a);
        this.c = cvrVar;
        cvrVar.start();
        Handler handler = new Handler(this.c.getLooper());
        this.d = handler;
        if (this.f4656a != null) {
            handler.postDelayed(this.h, 1500L);
        }
    }

    public void k() {
        l();
    }

    public final void l() {
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.d = null;
        }
        cvr cvrVar = this.c;
        if (cvrVar != null) {
            cvrVar.quit();
            this.c = null;
        }
    }
}
