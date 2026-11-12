package com.google.android.exoplayer2.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.facebook.internal.ServerProtocol;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoFrameReleaseHelper {
    private static final String q = "VideoFrameReleaseHelper";
    private static final long r = 5000000000L;
    private static final float s = 0.02f;
    private static final float t = 1.0f;
    private static final int u = 30;
    private static final long v = 500;
    private static final long w = 20000000;
    private static final long x = 80;
    private final com.google.android.exoplayer2.video.a a = new com.google.android.exoplayer2.video.a();

    @Nullable
    private final DisplayHelper b;

    @Nullable
    private final c c;
    private boolean d;

    @Nullable
    private Surface e;
    private float f;
    private float g;
    private float h;
    private float i;
    private long j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;

    public interface DisplayHelper {

        public interface Listener {
            void onDefaultDisplayChanged(@Nullable Display defaultDisplay);
        }

        void a(Listener listener);

        void unregister();
    }

    public static final class a implements DisplayHelper {
        private final WindowManager a;

        private a(WindowManager windowManager) {
            this.a = windowManager;
        }

        @Nullable
        public static DisplayHelper b(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new a(windowManager);
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void a(DisplayHelper.Listener listener) {
            listener.onDefaultDisplayChanged(this.a.getDefaultDisplay());
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void unregister() {
        }
    }

    @RequiresApi(17)
    public static final class b implements DisplayHelper, DisplayManager.DisplayListener {
        private final DisplayManager a;

        @Nullable
        private DisplayHelper.Listener b;

        private b(DisplayManager displayManager) {
            this.a = displayManager;
        }

        private Display b() {
            return this.a.getDisplay(0);
        }

        @Nullable
        public static DisplayHelper c(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService(ServerProtocol.DIALOG_PARAM_DISPLAY);
            if (displayManager != null) {
                return new b(displayManager);
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void a(DisplayHelper.Listener listener) {
            this.b = listener;
            this.a.registerDisplayListener(this, Util.createHandlerForCurrentLooper());
            listener.onDefaultDisplayChanged(b());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int displayId) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int displayId) {
            DisplayHelper.Listener listener = this.b;
            if (listener == null || displayId != 0) {
                return;
            }
            listener.onDefaultDisplayChanged(b());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int displayId) {
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void unregister() {
            this.a.unregisterDisplayListener(this);
            this.b = null;
        }
    }

    public static final class c implements Choreographer.FrameCallback, Handler.Callback {
        private static final int f = 0;
        private static final int g = 1;
        private static final int h = 2;
        private static final c i = new c();
        public volatile long a = C.TIME_UNSET;
        private final Handler b;
        private final HandlerThread c;
        private Choreographer d;
        private int e;

        private c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.c = handlerThread;
            handlerThread.start();
            Handler handlerCreateHandler = Util.createHandler(handlerThread.getLooper(), this);
            this.b = handlerCreateHandler;
            handlerCreateHandler.sendEmptyMessage(0);
        }

        private void b() {
            int i2 = this.e + 1;
            this.e = i2;
            if (i2 == 1) {
                ((Choreographer) Assertions.checkNotNull(this.d)).postFrameCallback(this);
            }
        }

        private void c() {
            this.d = Choreographer.getInstance();
        }

        public static c d() {
            return i;
        }

        private void f() {
            int i2 = this.e - 1;
            this.e = i2;
            if (i2 == 0) {
                ((Choreographer) Assertions.checkNotNull(this.d)).removeFrameCallback(this);
                this.a = C.TIME_UNSET;
            }
        }

        public void a() {
            this.b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long vsyncTimeNs) {
            this.a = vsyncTimeNs;
            ((Choreographer) Assertions.checkNotNull(this.d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                c();
                return true;
            }
            if (i2 == 1) {
                b();
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public VideoFrameReleaseHelper(@Nullable Context context) {
        DisplayHelper displayHelperE = e(context);
        this.b = displayHelperE;
        this.c = displayHelperE != null ? c.d() : null;
        this.j = C.TIME_UNSET;
        this.k = C.TIME_UNSET;
        this.f = -1.0f;
        this.i = 1.0f;
    }

    private static boolean b(long unadjustedReleaseTimeNs, long adjustedReleaseTimeNs) {
        return Math.abs(unadjustedReleaseTimeNs - adjustedReleaseTimeNs) <= w;
    }

    private void c() {
        Surface surface;
        if (Util.SDK_INT < 30 || (surface = this.e) == null || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        g(surface, 0.0f);
    }

    private static long d(long releaseTime, long sampledVsyncTime, long vsyncDuration) {
        long j;
        long j2 = sampledVsyncTime + (((releaseTime - sampledVsyncTime) / vsyncDuration) * vsyncDuration);
        if (releaseTime <= j2) {
            j = j2 - vsyncDuration;
        } else {
            j2 = vsyncDuration + j2;
            j = j2;
        }
        return j2 - releaseTime < releaseTime - j ? j2 : j;
    }

    @Nullable
    private static DisplayHelper e(@Nullable Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        DisplayHelper displayHelperC = Util.SDK_INT >= 17 ? b.c(applicationContext) : null;
        return displayHelperC == null ? a.b(applicationContext) : displayHelperC;
    }

    private void f() {
        this.l = 0L;
        this.o = -1L;
        this.m = -1L;
    }

    @RequiresApi(30)
    private static void g(Surface surface, float frameRate) {
        try {
            surface.setFrameRate(frameRate, frameRate == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            Log.e(q, "Failed to call Surface.setFrameRate", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(@Nullable Display defaultDisplay) {
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.j = refreshRate;
            this.k = (refreshRate * 80) / 100;
        } else {
            Log.w(q, "Unable to query display refresh rate");
            this.j = C.TIME_UNSET;
            this.k = C.TIME_UNSET;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    private void i() {
        if (Util.SDK_INT < 30 || this.e == null) {
            return;
        }
        float fB = this.a.e() ? this.a.b() : this.f;
        float f = this.g;
        if (fB == f) {
            return;
        }
        boolean z = true;
        if (fB != -1.0f && f != -1.0f) {
            if (Math.abs(fB - this.g) < (this.a.e() && (this.a.d() > r ? 1 : (this.a.d() == r ? 0 : -1)) >= 0 ? s : 1.0f)) {
                z = false;
            }
        } else if (fB == -1.0f && this.a.c() < 30) {
            z = false;
        }
        if (z) {
            this.g = fB;
            j(false);
        }
    }

    private void j(boolean isNewSurface) {
        Surface surface;
        if (Util.SDK_INT < 30 || (surface = this.e) == null) {
            return;
        }
        float f = 0.0f;
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = this.i * f2;
            }
        }
        if (isNewSurface || this.h != f) {
            this.h = f;
            g(surface, f);
        }
    }

    public long adjustReleaseTime(long releaseTimeNs) {
        long j;
        if (this.o == -1 || !this.a.e()) {
            j = releaseTimeNs;
        } else {
            long jA = this.p + ((long) ((this.a.a() * (this.l - this.o)) / this.i));
            if (b(releaseTimeNs, jA)) {
                j = jA;
            } else {
                f();
                j = releaseTimeNs;
            }
        }
        this.m = this.l;
        this.n = j;
        c cVar = this.c;
        if (cVar == null || this.j == C.TIME_UNSET) {
            return j;
        }
        long j2 = cVar.a;
        return j2 == C.TIME_UNSET ? j : d(j, j2, this.j) - this.k;
    }

    public void onDisabled() {
        DisplayHelper displayHelper = this.b;
        if (displayHelper != null) {
            displayHelper.unregister();
            ((c) Assertions.checkNotNull(this.c)).e();
        }
    }

    public void onEnabled() {
        if (this.b != null) {
            ((c) Assertions.checkNotNull(this.c)).a();
            this.b.a(new DisplayHelper.Listener() { // from class: oa8
                @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener
                public final void onDefaultDisplayChanged(Display display) {
                    this.a.h(display);
                }
            });
        }
    }

    public void onFormatChanged(float formatFrameRate) {
        this.f = formatFrameRate;
        this.a.g();
        i();
    }

    public void onNextFrame(long framePresentationTimeUs) {
        long j = this.m;
        if (j != -1) {
            this.o = j;
            this.p = this.n;
        }
        this.l++;
        this.a.f(framePresentationTimeUs * 1000);
        i();
    }

    public void onPlaybackSpeed(float playbackSpeed) {
        this.i = playbackSpeed;
        f();
        j(false);
    }

    public void onPositionReset() {
        f();
    }

    public void onStarted() {
        this.d = true;
        f();
        j(false);
    }

    public void onStopped() {
        this.d = false;
        c();
    }

    public void onSurfaceChanged(@Nullable Surface surface) {
        if (surface instanceof DummySurface) {
            surface = null;
        }
        if (this.e == surface) {
            return;
        }
        c();
        this.e = surface;
        j(true);
    }
}
