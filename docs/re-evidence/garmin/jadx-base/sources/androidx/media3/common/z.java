package androidx.media3.common;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface z {

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f8589a;

        public c(o oVar) {
            this.f8589a = oVar;
        }

        public final boolean a(int... iArr) {
            o oVar = this.f8589a;
            oVar.getClass();
            for (int i14 : iArr) {
                if (oVar.f8347a.get(i14)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f8589a.equals(((c) obj).f8589a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f8589a.hashCode();
        }
    }

    public interface d {
        default void F7(g0 g0Var) {
        }

        default void I4(PlaybackException playbackException) {
        }

        default void M0(int i14) {
        }

        default void N0(v vVar) {
        }

        default void P7(t tVar, int i14) {
        }

        default void W5(b bVar) {
        }

        default void Y(w wVar) {
        }

        default void a3(y yVar) {
        }

        default void a6(int i14, e eVar, e eVar2) {
        }

        default void g1(PlaybackException playbackException) {
        }

        default void g2(h0 h0Var) {
        }

        default void k(k0 k0Var) {
        }

        default void n(ea.b bVar) {
        }

        @Deprecated
        default void onCues(List<ea.a> list) {
        }

        default void onIsLoadingChanged(boolean z14) {
        }

        default void onIsPlayingChanged(boolean z14) {
        }

        default void onPlayWhenReadyChanged(boolean z14, int i14) {
        }

        default void onPlaybackStateChanged(int i14) {
        }

        default void onPlaybackSuppressionReasonChanged(int i14) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z14, int i14) {
        }

        default void onRenderedFirstFrame() {
        }

        default void onRepeatModeChanged(int i14) {
        }

        default void onShuffleModeEnabledChanged(boolean z14) {
        }

        default void onSkipSilenceEnabledChanged(boolean z14) {
        }

        default void onSurfaceSizeChanged(int i14, int i15) {
        }

        default void r8(c cVar) {
        }
    }

    void b(y yVar);

    void c(g0 g0Var);

    void clearVideoSurfaceView(SurfaceView surfaceView);

    void clearVideoTextureView(TextureView textureView);

    void d(d dVar);

    void e(d dVar);

    h0 g();

    Looper getApplicationLooper();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    ea.b getCurrentCues();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    d0 getCurrentTimeline();

    int getMediaItemCount();

    v getMediaMetadata();

    boolean getPlayWhenReady();

    y getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    ExoPlaybackException getPlayerError();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    long getTotalBufferedDuration();

    g0 getTrackSelectionParameters();

    k0 getVideoSize();

    boolean hasNextMediaItem();

    boolean hasPreviousMediaItem();

    boolean isCommandAvailable(int i14);

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    boolean isPlaying();

    boolean isPlayingAd();

    void pause();

    void play();

    void prepare();

    void seekBack();

    void seekForward();

    void seekTo(int i14, long j8);

    void seekTo(long j8);

    void seekToDefaultPosition();

    void seekToNext();

    void seekToPrevious();

    void setPlayWhenReady(boolean z14);

    void setPlaybackSpeed(float f14);

    void setRepeatMode(int i14);

    void setShuffleModeEnabled(boolean z14);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVideoTextureView(TextureView textureView);

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f8590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f8592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f8593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f8594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f8595f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f8596g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f8597h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f8598i;

        static {
            fa.z.H(0);
            fa.z.H(1);
            fa.z.H(2);
            fa.z.H(3);
            fa.z.H(4);
            fa.z.H(5);
            fa.z.H(6);
        }

        public e(Object obj, int i14, t tVar, Object obj2, int i15, long j8, long j14, int i16, int i17) {
            this.f8590a = obj;
            this.f8591b = i14;
            this.f8592c = tVar;
            this.f8593d = obj2;
            this.f8594e = i15;
            this.f8595f = j8;
            this.f8596g = j14;
            this.f8597h = i16;
            this.f8598i = i17;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f8591b == eVar.f8591b && this.f8594e == eVar.f8594e && this.f8595f == eVar.f8595f && this.f8596g == eVar.f8596g && this.f8597h == eVar.f8597h && this.f8598i == eVar.f8598i && Objects.equal(this.f8592c, eVar.f8592c) && Objects.equal(this.f8590a, eVar.f8590a) && Objects.equal(this.f8593d, eVar.f8593d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(this.f8590a, Integer.valueOf(this.f8591b), this.f8592c, this.f8593d, Integer.valueOf(this.f8594e), Long.valueOf(this.f8595f), Long.valueOf(this.f8596g), Integer.valueOf(this.f8597h), Integer.valueOf(this.f8598i));
        }

        @Deprecated
        public e(Object obj, int i14, Object obj2, int i15, long j8, long j14, int i16, int i17) {
            this(obj, i14, t.f8437g, obj2, i15, j8, j14, i16, i17);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f8587a;

        static {
            new b(new a().f8588a.b());
            fa.z.H(0);
        }

        private b(o oVar) {
            this.f8587a = oVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f8587a.equals(((b) obj).f8587a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f8587a.hashCode();
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final o.b f8588a;

            private a(b bVar) {
                o.b bVar2 = new o.b();
                this.f8588a = bVar2;
                o oVar = bVar.f8587a;
                for (int i14 = 0; i14 < oVar.f8347a.size(); i14++) {
                    bVar2.a(oVar.a(i14));
                }
            }

            @CanIgnoreReturnValue
            public final void a(int i14, boolean z14) {
                o.b bVar = this.f8588a;
                if (z14) {
                    bVar.a(i14);
                } else {
                    bVar.getClass();
                }
            }

            public a() {
                this.f8588a = new o.b();
            }
        }
    }
}
