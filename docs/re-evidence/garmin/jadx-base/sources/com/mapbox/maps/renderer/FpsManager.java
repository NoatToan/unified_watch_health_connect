package com.mapbox.maps.renderer;

import android.os.Handler;
import cd0.h0;
import com.mapbox.maps.MapboxLogger;
import d53.w;
import j23.t;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u0000 32\u00020\u0001:\u00013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010$\u001a\u00020%H\u0002J\u0006\u0010&\u001a\u00020%J\b\u0010'\u001a\u00020%H\u0002J\u0006\u0010(\u001a\u00020%J\u0010\u0010)\u001a\u00020*2\u0006\u0010!\u001a\u00020\"H\u0002J\u0006\u0010+\u001a\u00020%J\u0018\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020\u00142\b\b\u0002\u0010.\u001a\u00020*J\u000e\u0010/\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u000bJ\u000e\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\u000bJ\u0010\u00102\u001a\u00020%2\u0006\u0010-\u001a\u00020\u0014H\u0002R\u0014\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0004\n\u0002\u0010#¨\u00064"}, d2 = {"Lcom/mapbox/maps/renderer/FpsManager;", "", "handler", "Landroid/os/Handler;", "mapName", "", "(Landroid/os/Handler;Ljava/lang/String;)V", "TAG", "getTAG$annotations", "()V", "choreographerSkips", "", "choreographerTicks", "fpsChangedListener", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "getFpsChangedListener$maps_sdk_release", "()Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setFpsChangedListener$maps_sdk_release", "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V", "frameRenderTimeAccumulatedNs", "", "onRenderingPausedRunnable", "Ljava/lang/Runnable;", "preRenderTimeNs", "previousDrawnFrameIndex", "previousFrameTimeNs", "screenRefreshPeriodNs", "screenRefreshRate", "<set-?>", "skippedNow", "getSkippedNow", "()I", "userRefreshRate", "userToScreenRefreshRateRatio", "", "Ljava/lang/Double;", "calculateFpsAndReset", "", "destroy", "onRenderingPaused", "onSurfaceDestroyed", "performPacing", "", "postRender", "preRender", "frameTimeNs", "recorderStarted", "setScreenRefreshRate", "setUserRefreshRate", "refreshRate", "updateFrameStats", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FpsManager {
    private static final boolean LOG_STATISTICS = false;
    private static final int SCREEN_METRICS_NOT_DEFINED = -1;
    private static final int USER_DEFINED_REFRESH_RATE_NOT_SET = -1;
    public static final int VSYNC_COUNT_TILL_IDLE = 3;
    private final String TAG;
    private int choreographerSkips;
    private int choreographerTicks;
    private OnFpsChangedListener fpsChangedListener;
    private long frameRenderTimeAccumulatedNs;
    private final Handler handler;
    private final Runnable onRenderingPausedRunnable;
    private long preRenderTimeNs;
    private int previousDrawnFrameIndex;
    private long previousFrameTimeNs;
    private long screenRefreshPeriodNs;
    private int screenRefreshRate;
    private int skippedNow;
    private int userRefreshRate;
    private Double userToScreenRefreshRateRatio;
    private static final Object fpsManagerToken = new Object();
    private static final long ONE_SECOND_NS = (long) Math.pow(10.0d, 9.0d);
    private static final long ONE_MILLISECOND_NS = (long) Math.pow(10.0d, 6.0d);

    public FpsManager(Handler handler, String str) {
        handler.getClass();
        str.getClass();
        this.handler = handler;
        this.userRefreshRate = -1;
        this.screenRefreshRate = -1;
        this.screenRefreshPeriodNs = -1L;
        this.previousFrameTimeNs = -1L;
        this.preRenderTimeNs = -1L;
        this.TAG = "Mbgl-FpsManager".concat(!w.J(str) ? "\\".concat(str) : "");
        this.onRenderingPausedRunnable = new h0(this, 23);
    }

    private final void calculateFpsAndReset() {
        int i14 = this.choreographerTicks;
        if (i14 == 0) {
            return;
        }
        OnFpsChangedListener onFpsChangedListener = this.fpsChangedListener;
        if (onFpsChangedListener != null) {
            double d14 = (1.0d - (((double) this.choreographerSkips) / ((double) i14))) * ((double) this.screenRefreshRate);
            onFpsChangedListener.onFpsChanged(d14);
            int i15 = this.choreographerTicks;
            int i16 = this.choreographerSkips;
            if (i15 == i16) {
                String str = this.TAG;
                StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("VSYNC based FPS is ", d14, ", missed ");
                sbA.append(this.choreographerSkips);
                sbA.append(" out of ");
                sbA.append(this.choreographerTicks);
                sbA.append(" VSYNC pulses");
                MapboxLogger.logI(str, sbA.toString());
            } else {
                double d15 = this.frameRenderTimeAccumulatedNs / ((double) (i15 - i16));
                String str2 = this.TAG;
                StringBuilder sbA2 = com.airbnb.lottie.parser.moshi.a.a("VSYNC based FPS is ", d14, ", average core rendering time is ");
                sbA2.append(d15 / ONE_MILLISECOND_NS);
                sbA2.append(" ms (or ");
                x0 x0Var = x0.f105818a;
                sbA2.append(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf((this.screenRefreshPeriodNs / d15) * ((double) this.screenRefreshRate))}, 1)));
                sbA2.append(" FPS), missed ");
                sbA2.append(this.choreographerSkips);
                sbA2.append(" out of ");
                sbA2.append(this.choreographerTicks);
                sbA2.append(" VSYNC pulses");
                MapboxLogger.logI(str2, sbA2.toString());
            }
        }
        this.previousDrawnFrameIndex = 0;
        this.frameRenderTimeAccumulatedNs = 0L;
        this.choreographerTicks = 0;
        this.choreographerSkips = 0;
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    private final void onRenderingPaused() {
        this.handler.removeCallbacksAndMessages(fpsManagerToken);
        calculateFpsAndReset();
        this.previousFrameTimeNs = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRenderingPausedRunnable$lambda$1(FpsManager fpsManager) {
        fpsManager.getClass();
        fpsManager.onRenderingPaused();
    }

    private final boolean performPacing(double userToScreenRefreshRateRatio) {
        int i14 = (int) (((double) this.choreographerTicks) * userToScreenRefreshRateRatio);
        if (i14 > this.previousDrawnFrameIndex) {
            this.previousDrawnFrameIndex = i14;
            return true;
        }
        this.choreographerSkips++;
        return false;
    }

    public static /* synthetic */ boolean preRender$default(FpsManager fpsManager, long j8, boolean z14, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z14 = false;
        }
        return fpsManager.preRender(j8, z14);
    }

    private final void updateFrameStats(long frameTimeNs) {
        this.preRenderTimeNs = System.nanoTime();
        this.skippedNow = 0;
        long j8 = this.previousFrameTimeNs;
        if (j8 != -1) {
            long j14 = frameTimeNs - j8;
            long j15 = this.screenRefreshPeriodNs;
            long j16 = ONE_MILLISECOND_NS;
            if (j14 > j15 + j16) {
                int i14 = (int) ((frameTimeNs - j8) / (j15 + j16));
                this.skippedNow = i14;
                this.choreographerSkips += i14;
            }
        }
        this.previousFrameTimeNs = frameTimeNs;
        this.choreographerTicks = this.skippedNow + 1 + this.choreographerTicks;
    }

    public final void destroy() {
        this.handler.removeCallbacksAndMessages(fpsManagerToken);
        this.fpsChangedListener = null;
    }

    /* JADX INFO: renamed from: getFpsChangedListener$maps_sdk_release, reason: from getter */
    public final OnFpsChangedListener getFpsChangedListener() {
        return this.fpsChangedListener;
    }

    public final int getSkippedNow() {
        return this.skippedNow;
    }

    public final void onSurfaceDestroyed() {
        onRenderingPaused();
    }

    public final void postRender() {
        this.frameRenderTimeAccumulatedNs += System.nanoTime() - this.preRenderTimeNs;
        if (this.choreographerTicks >= this.screenRefreshRate) {
            calculateFpsAndReset();
        } else {
            this.handler.postDelayed(this.onRenderingPausedRunnable, fpsManagerToken, (this.screenRefreshPeriodNs / ONE_MILLISECOND_NS) * ((long) 3));
        }
        this.preRenderTimeNs = -1L;
    }

    public final boolean preRender(long frameTimeNs, boolean recorderStarted) {
        if (this.userToScreenRefreshRateRatio == null && this.fpsChangedListener == null && !recorderStarted) {
            return true;
        }
        this.handler.removeCallbacksAndMessages(fpsManagerToken);
        updateFrameStats(frameTimeNs);
        Double d14 = this.userToScreenRefreshRateRatio;
        if (d14 != null) {
            return performPacing(d14.doubleValue());
        }
        return true;
    }

    public final void setFpsChangedListener$maps_sdk_release(OnFpsChangedListener onFpsChangedListener) {
        this.fpsChangedListener = onFpsChangedListener;
    }

    public final void setScreenRefreshRate(int screenRefreshRate) {
        if (this.screenRefreshRate == screenRefreshRate) {
            return;
        }
        this.screenRefreshRate = screenRefreshRate;
        this.screenRefreshPeriodNs = ONE_SECOND_NS / ((long) screenRefreshRate);
        int i14 = this.userRefreshRate;
        if (i14 != -1) {
            this.userToScreenRefreshRateRatio = Double.valueOf(t.c(((double) i14) / ((double) screenRefreshRate), 0.0d, 1.0d));
            MapboxLogger.logI(this.TAG, "User defined ratio is " + this.userToScreenRefreshRateRatio);
        }
    }

    public final void setUserRefreshRate(int refreshRate) {
        if (this.userRefreshRate != refreshRate) {
            this.userRefreshRate = refreshRate;
            MapboxLogger.logI(this.TAG, "User set max FPS to " + this.userRefreshRate);
            int i14 = this.screenRefreshRate;
            if (i14 != -1) {
                this.userToScreenRefreshRateRatio = Double.valueOf(t.c(((double) this.userRefreshRate) / ((double) i14), 0.0d, 1.0d));
                MapboxLogger.logI(this.TAG, "User defined ratio is " + this.userToScreenRefreshRateRatio);
            }
        }
    }
}
