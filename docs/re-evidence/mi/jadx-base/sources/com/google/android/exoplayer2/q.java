package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import defpackage.aop;
import defpackage.d96;
import defpackage.erq;
import defpackage.h55;
import defpackage.j4h;
import defpackage.j63;
import defpackage.j8p;
import defpackage.jn1;
import defpackage.n0i;
import defpackage.nh8;
import defpackage.ph8;
import defpackage.stf;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface q {

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f8062b = new a().e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nh8 f8063a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final nh8.b f8064a = new nh8.b();

            public a a(int i) {
                this.f8064a.a(i);
                return this;
            }

            public a b(b bVar) {
                this.f8064a.b(bVar.f8063a);
                return this;
            }

            public a c(int... iArr) {
                this.f8064a.c(iArr);
                return this;
            }

            public a d(int i, boolean z) {
                this.f8064a.d(i, z);
                return this;
            }

            public b e() {
                return new b(this.f8064a.e());
            }
        }

        public boolean b(int i) {
            return this.f8063a.a(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f8063a.equals(((b) obj).f8063a);
            }
            return false;
        }

        public int hashCode() {
            return this.f8063a.hashCode();
        }

        public b(nh8 nh8Var) {
            this.f8063a = nh8Var;
        }
    }

    @Deprecated
    public interface c {
        default void onAvailableCommandsChanged(b bVar) {
        }

        default void onEvents(q qVar, d dVar) {
        }

        default void onIsLoadingChanged(boolean z) {
        }

        default void onIsPlayingChanged(boolean z) {
        }

        @Deprecated
        default void onLoadingChanged(boolean z) {
        }

        default void onMediaItemTransition(m mVar, int i) {
        }

        default void onMediaMetadataChanged(n nVar) {
        }

        default void onPlayWhenReadyChanged(boolean z, int i) {
        }

        default void onPlaybackParametersChanged(n0i n0iVar) {
        }

        default void onPlaybackStateChanged(int i) {
        }

        default void onPlaybackSuppressionReasonChanged(int i) {
        }

        default void onPlayerError(ExoPlaybackException exoPlaybackException) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z, int i) {
        }

        @Deprecated
        default void onPositionDiscontinuity(int i) {
        }

        default void onRepeatModeChanged(int i) {
        }

        @Deprecated
        default void onSeekProcessed() {
        }

        default void onShuffleModeEnabledChanged(boolean z) {
        }

        default void onStaticMetadataChanged(List<Metadata> list) {
        }

        default void onTimelineChanged(v vVar, int i) {
        }

        default void onTracksChanged(TrackGroupArray trackGroupArray, aop aopVar) {
        }

        default void onPositionDiscontinuity(f fVar, f fVar2, int i) {
        }

        @Deprecated
        default void onTimelineChanged(v vVar, Object obj, int i) {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nh8 f8065a;

        public d(nh8 nh8Var) {
            this.f8065a = nh8Var;
        }

        public boolean a(int i) {
            return this.f8065a.a(i);
        }

        public boolean b(int... iArr) {
            return this.f8065a.b(iArr);
        }
    }

    public interface e extends erq, jn1, j8p, stf, d96, c {
        default void onCues(List<h55> list) {
        }

        @Override // defpackage.stf
        default void onMetadata(Metadata metadata) {
        }
    }

    public static final class f {
        public static final j63<f> i = new ph8();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f8066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8067b;
        public final Object c;
        public final int d;
        public final long e;
        public final long f;
        public final int g;
        public final int h;

        public f(Object obj, int i2, Object obj2, int i3, long j, long j2, int i4, int i5) {
            this.f8066a = obj;
            this.f8067b = i2;
            this.c = obj2;
            this.d = i3;
            this.e = j;
            this.f = j2;
            this.g = i4;
            this.h = i5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f8067b == fVar.f8067b && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f && this.g == fVar.g && this.h == fVar.h && j4h.a(this.f8066a, fVar.f8066a) && j4h.a(this.c, fVar.c);
        }

        public int hashCode() {
            return j4h.b(this.f8066a, Integer.valueOf(this.f8067b), this.c, Integer.valueOf(this.d), Integer.valueOf(this.f8067b), Long.valueOf(this.e), Long.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h));
        }
    }

    List<h55> A();

    int B();

    v C();

    Looper D();

    void E(TextureView textureView);

    aop F();

    void G(int i, long j);

    b H();

    void I(m mVar);

    long J();

    void K(e eVar);

    int L();

    long M();

    int N();

    void O(SurfaceView surfaceView);

    boolean P();

    boolean a();

    long b();

    n0i c();

    void d(n0i n0iVar);

    void f(e eVar);

    void g(List<m> list, boolean z);

    long getCurrentPosition();

    long getDuration();

    int getPlaybackState();

    int getRepeatMode();

    void h(SurfaceView surfaceView);

    @Deprecated
    void i(c cVar);

    boolean isPlaying();

    ExoPlaybackException j();

    int k();

    boolean l(int i);

    TrackGroupArray m();

    boolean n();

    void o(boolean z);

    @Deprecated
    void p(boolean z);

    void pause();

    void play();

    void prepare();

    long q();

    int r();

    void release();

    void s(TextureView textureView);

    void seekTo(long j);

    void setRepeatMode(int i);

    void stop();

    @Deprecated
    void t(c cVar);

    int u();

    long v();

    List<Metadata> w();

    boolean x();

    int y();

    void z(boolean z);
}
