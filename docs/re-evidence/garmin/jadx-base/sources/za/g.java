package za;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import com.google.android.exoplayer2.C;
import com.google.firebase.messaging.Constants;
import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za.a f203193a = new za.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f203194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f203195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f203196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f203197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f203198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f203199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f203200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f203201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f203202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f203203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f203204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f203205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f203206n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f203207o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f203208p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f203209q;

    public final class a implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayManager f203210a;

        public a(DisplayManager displayManager) {
            this.f203210a = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i14) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i14) {
            if (i14 == 0) {
                g.a(g.this, this.f203210a.getDisplay(0));
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i14) {
        }
    }

    public static final class b implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f203212e = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f203213a = C.TIME_UNSET;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f203214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Choreographer f203215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f203216d;

        private b() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i14 = z.f70071a;
            Handler handler = new Handler(looper, this);
            this.f203214b = handler;
            handler.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j8) {
            this.f203213a = j8;
            Choreographer choreographer = this.f203215c;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i14 = message.what;
            if (i14 == 1) {
                try {
                    this.f203215c = Choreographer.getInstance();
                    return true;
                } catch (RuntimeException e4) {
                    fa.k.h("Vsync sampling disabled due to platform error", e4);
                    return true;
                }
            }
            if (i14 == 2) {
                Choreographer choreographer = this.f203215c;
                if (choreographer != null) {
                    int i15 = this.f203216d + 1;
                    this.f203216d = i15;
                    if (i15 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
            } else {
                if (i14 != 3) {
                    return false;
                }
                Choreographer choreographer2 = this.f203215c;
                if (choreographer2 != null) {
                    int i16 = this.f203216d - 1;
                    this.f203216d = i16;
                    if (i16 == 0) {
                        choreographer2.removeFrameCallback(this);
                        this.f203213a = C.TIME_UNSET;
                        return true;
                    }
                }
            }
            return true;
        }
    }

    public g(Context context) {
        DisplayManager displayManager;
        a aVar = (context == null || (displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)) == null) ? null : new a(displayManager);
        this.f203194b = aVar;
        this.f203195c = aVar != null ? b.f203212e : null;
        this.f203203k = C.TIME_UNSET;
        this.f203204l = C.TIME_UNSET;
        this.f203198f = -1.0f;
        this.f203201i = 1.0f;
        this.f203202j = 0;
    }

    public static void a(g gVar, Display display) {
        gVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            gVar.f203203k = refreshRate;
            gVar.f203204l = (refreshRate * 80) / 100;
        } else {
            fa.k.g("Unable to query display refresh rate");
            gVar.f203203k = C.TIME_UNSET;
            gVar.f203204l = C.TIME_UNSET;
        }
    }

    public final void b() {
        Surface surface;
        if (z.f70071a < 30 || (surface = this.f203197e) == null || this.f203202j == Integer.MIN_VALUE || this.f203200h == 0.0f) {
            return;
        }
        this.f203200h = 0.0f;
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e4) {
            fa.k.d("Failed to call Surface.setFrameRate", e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public final void c() {
        float f14;
        float f15;
        if (z.f70071a < 30 || this.f203197e == null) {
            return;
        }
        za.a aVar = this.f203193a;
        if (!aVar.f203154a.a()) {
            f14 = this.f203198f;
        } else if (aVar.f203154a.a()) {
            za.a.C3791a c3791a = aVar.f203154a;
            long j8 = c3791a.f203163e;
            f14 = (float) (1.0E9d / (j8 != 0 ? c3791a.f203164f / j8 : 0L));
        } else {
            f14 = -1.0f;
        }
        float f16 = this.f203199g;
        if (f14 == f16) {
            return;
        }
        if (f14 != -1.0f && f16 != -1.0f) {
            if (aVar.f203154a.a()) {
                if ((aVar.f203154a.a() ? aVar.f203154a.f203164f : C.TIME_UNSET) >= 5000000000L) {
                    f15 = 0.02f;
                } else {
                    f15 = 1.0f;
                }
            } else {
                f15 = 1.0f;
            }
            if (Math.abs(f14 - this.f203199g) < f15) {
                return;
            }
        } else if (f14 == -1.0f && aVar.f203158e < 30) {
            return;
        }
        this.f203199g = f14;
        d(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    public final void d(boolean z14) {
        Surface surface;
        float f14;
        if (z.f70071a < 30 || (surface = this.f203197e) == null || this.f203202j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f203196d) {
            float f15 = this.f203199g;
            if (f15 != -1.0f) {
                f14 = f15 * this.f203201i;
            } else {
                f14 = 0.0f;
            }
        } else {
            f14 = 0.0f;
        }
        if (z14 || this.f203200h != f14) {
            this.f203200h = f14;
            try {
                surface.setFrameRate(f14, f14 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e4) {
                fa.k.d("Failed to call Surface.setFrameRate", e4);
            }
        }
    }
}
