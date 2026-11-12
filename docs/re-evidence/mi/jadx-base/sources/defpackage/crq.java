package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.video.DummySurface;

/* JADX INFO: loaded from: classes4.dex */
public final class crq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tw9 f14651a = new tw9();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WindowManager f14652b;
    public final b c;
    public final a d;
    public boolean e;
    public Surface f;
    public float g;
    public float h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f14653k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    @RequiresApi(17)
    public final class a implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayManager f14654a;

        public a(DisplayManager displayManager) {
            this.f14654a = displayManager;
        }

        public void a() {
            this.f14654a.registerDisplayListener(this, wlq.x());
        }

        public void b() {
            this.f14654a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                crq.this.r();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    public static final class b implements Choreographer.FrameCallback, Handler.Callback {
        public static final b f = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f14656a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f14657b;
        public final HandlerThread c;
        public Choreographer d;
        public int e;

        public b() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.c = handlerThread;
            handlerThread.start();
            Handler handlerW = wlq.w(handlerThread.getLooper(), this);
            this.f14657b = handlerW;
            handlerW.sendEmptyMessage(0);
        }

        public static b d() {
            return f;
        }

        public void a() {
            this.f14657b.sendEmptyMessage(1);
        }

        public final void b() {
            int i = this.e + 1;
            this.e = i;
            if (i == 1) {
                ((Choreographer) rk1.e(this.d)).postFrameCallback(this);
            }
        }

        public final void c() {
            this.d = Choreographer.getInstance();
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.f14656a = j;
            ((Choreographer) rk1.e(this.d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f14657b.sendEmptyMessage(2);
        }

        public final void f() {
            int i = this.e - 1;
            this.e = i;
            if (i == 0) {
                ((Choreographer) rk1.e(this.d)).removeFrameCallback(this);
                this.f14656a = -9223372036854775807L;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c();
                return true;
            }
            if (i == 1) {
                b();
                return true;
            }
            if (i != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public crq(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.f14652b = (WindowManager) context.getSystemService("window");
        } else {
            this.f14652b = null;
        }
        if (this.f14652b != null) {
            this.d = wlq.f38110a >= 17 ? f((Context) rk1.e(context)) : null;
            this.c = b.d();
        } else {
            this.d = null;
            this.c = null;
        }
        this.f14653k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.g = -1.0f;
        this.j = 1.0f;
    }

    public static boolean c(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    public static long e(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    @RequiresApi(30)
    public static void q(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            toe.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public long b(long j) {
        long j2;
        if (this.p == -1 || !this.f14651a.e()) {
            j2 = j;
        } else {
            long jA = this.q + ((long) ((this.f14651a.a() * (this.m - this.p)) / this.j));
            if (c(j, jA)) {
                j2 = jA;
            } else {
                p();
                j2 = j;
            }
        }
        this.n = this.m;
        this.o = j2;
        b bVar = this.c;
        if (bVar == null || this.f14653k == -9223372036854775807L) {
            return j2;
        }
        long j3 = bVar.f14656a;
        return j3 == -9223372036854775807L ? j2 : e(j2, j3, this.f14653k) - this.l;
    }

    public final void d() {
        Surface surface;
        if (wlq.f38110a < 30 || (surface = this.f) == null || this.i == 0.0f) {
            return;
        }
        this.i = 0.0f;
        q(surface, 0.0f);
    }

    @RequiresApi(17)
    public final a f(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    @TargetApi(17)
    public void g() {
        if (this.f14652b != null) {
            a aVar = this.d;
            if (aVar != null) {
                aVar.b();
            }
            ((b) rk1.e(this.c)).e();
        }
    }

    @TargetApi(17)
    public void h() {
        if (this.f14652b != null) {
            ((b) rk1.e(this.c)).a();
            a aVar = this.d;
            if (aVar != null) {
                aVar.a();
            }
            r();
        }
    }

    public void i(float f) {
        this.g = f;
        this.f14651a.g();
        s();
    }

    public void j(long j) {
        long j2 = this.n;
        if (j2 != -1) {
            this.p = j2;
            this.q = this.o;
        }
        this.m++;
        this.f14651a.f(j * 1000);
        s();
    }

    public void k(float f) {
        this.j = f;
        p();
        t(false);
    }

    public void l() {
        p();
    }

    public void m() {
        this.e = true;
        p();
        t(false);
    }

    public void n() {
        this.e = false;
        d();
    }

    public void o(Surface surface) {
        if (surface instanceof DummySurface) {
            surface = null;
        }
        if (this.f == surface) {
            return;
        }
        d();
        this.f = surface;
        t(true);
    }

    public final void p() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    public final void r() {
        Display defaultDisplay = ((WindowManager) rk1.e(this.f14652b)).getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.f14653k = refreshRate;
            this.l = (refreshRate * 80) / 100;
        } else {
            toe.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f14653k = -9223372036854775807L;
            this.l = -9223372036854775807L;
        }
    }

    public final void s() {
        if (wlq.f38110a < 30 || this.f == null) {
            return;
        }
        float fB = this.f14651a.e() ? this.f14651a.b() : this.g;
        float f = this.h;
        if (fB == f) {
            return;
        }
        if (fB != -1.0f && f != -1.0f) {
            if (Math.abs(fB - this.h) < ((!this.f14651a.e() || this.f14651a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fB == -1.0f && this.f14651a.c() < 30) {
            return;
        }
        this.h = fB;
        t(false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    public final void t(boolean z) {
        Surface surface;
        float f;
        if (wlq.f38110a < 30 || (surface = this.f) == null) {
            return;
        }
        if (this.e) {
            float f2 = this.h;
            if (f2 != -1.0f) {
                f = f2 * this.j;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.i != f) {
            this.i = f;
            q(surface, f);
        }
    }
}
