package ja;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.d0;
import androidx.media3.common.g0;
import androidx.media3.common.k0;
import androidx.media3.common.t;
import androidx.media3.common.v;
import androidx.media3.common.w;
import androidx.media3.common.y;
import androidx.media3.common.z;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import bm.h0;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import j20.x;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m implements ja.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.c f97984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0.b f97985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0.c f97986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f97987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray<b.a> f97988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fa.j<b> f97989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z f97990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fa.i f97991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f97992i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0.b f97993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImmutableList<androidx.media3.exoplayer.source.j.b> f97994b = ImmutableList.of();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImmutableMap<androidx.media3.exoplayer.source.j.b, d0> f97995c = ImmutableMap.of();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.media3.exoplayer.source.j.b f97996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public androidx.media3.exoplayer.source.j.b f97997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public androidx.media3.exoplayer.source.j.b f97998f;

        public a(d0.b bVar) {
            this.f97993a = bVar;
        }

        public static androidx.media3.exoplayer.source.j.b b(z zVar, ImmutableList<androidx.media3.exoplayer.source.j.b> immutableList, androidx.media3.exoplayer.source.j.b bVar, d0.b bVar2) {
            d0 currentTimeline = zVar.getCurrentTimeline();
            int currentPeriodIndex = zVar.getCurrentPeriodIndex();
            Object objL = currentTimeline.p() ? null : currentTimeline.l(currentPeriodIndex);
            int iB = (zVar.isPlayingAd() || currentTimeline.p()) ? -1 : currentTimeline.f(currentPeriodIndex, bVar2, false).b(fa.z.O(zVar.getCurrentPosition()) - bVar2.f8191e);
            for (int i14 = 0; i14 < immutableList.size(); i14++) {
                androidx.media3.exoplayer.source.j.b bVar3 = immutableList.get(i14);
                if (c(bVar3, objL, zVar.isPlayingAd(), zVar.getCurrentAdGroupIndex(), zVar.getCurrentAdIndexInAdGroup(), iB)) {
                    return bVar3;
                }
            }
            if (immutableList.isEmpty() && bVar != null && c(bVar, objL, zVar.isPlayingAd(), zVar.getCurrentAdGroupIndex(), zVar.getCurrentAdIndexInAdGroup(), iB)) {
                return bVar;
            }
            return null;
        }

        public static boolean c(androidx.media3.exoplayer.source.j.b bVar, Object obj, boolean z14, int i14, int i15, int i16) {
            Object obj2 = bVar.f9519a;
            int i17 = bVar.f9520b;
            if (!obj2.equals(obj)) {
                return false;
            }
            if (z14 && i17 == i14 && bVar.f9521c == i15) {
                return true;
            }
            return !z14 && i17 == -1 && bVar.f9523e == i16;
        }

        public final void a(ImmutableMap.Builder<androidx.media3.exoplayer.source.j.b, d0> builder, androidx.media3.exoplayer.source.j.b bVar, d0 d0Var) {
            if (bVar == null) {
                return;
            }
            if (d0Var.b(bVar.f9519a) != -1) {
                builder.put(bVar, d0Var);
                return;
            }
            d0 d0Var2 = this.f97995c.get(bVar);
            if (d0Var2 != null) {
                builder.put(bVar, d0Var2);
            }
        }

        public final void d(d0 d0Var) {
            ImmutableList<androidx.media3.exoplayer.source.j.b> immutableList;
            ImmutableMap.Builder<androidx.media3.exoplayer.source.j.b, d0> builder = ImmutableMap.builder();
            if (this.f97994b.isEmpty()) {
                a(builder, this.f97997e, d0Var);
                if (!Objects.equal(this.f97998f, this.f97997e)) {
                    a(builder, this.f97998f, d0Var);
                }
                if (!Objects.equal(this.f97996d, this.f97997e) && !Objects.equal(this.f97996d, this.f97998f)) {
                    a(builder, this.f97996d, d0Var);
                }
            } else {
                int i14 = 0;
                while (true) {
                    int size = this.f97994b.size();
                    immutableList = this.f97994b;
                    if (i14 >= size) {
                        break;
                    }
                    a(builder, immutableList.get(i14), d0Var);
                    i14++;
                }
                if (!immutableList.contains(this.f97996d)) {
                    a(builder, this.f97996d, d0Var);
                }
            }
            this.f97995c = builder.buildOrThrow();
        }
    }

    public m(fa.c cVar) {
        cVar.getClass();
        this.f97984a = cVar;
        int i14 = fa.z.f70071a;
        Looper looperMyLooper = Looper.myLooper();
        this.f97989f = new fa.j<>(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, cVar, new x(18));
        d0.b bVar = new d0.b();
        this.f97985b = bVar;
        this.f97986c = new d0.c();
        this.f97987d = new a(bVar);
        this.f97988e = new SparseArray<>();
    }

    @Override // ja.a
    public final void A(androidx.media3.exoplayer.g gVar) {
        b.a aVarR = r(this.f97987d.f97997e);
        u(aVarR, 1020, new f(aVarR, gVar, 0));
    }

    @Override // ja.a
    public final void C(androidx.media3.exoplayer.g gVar) {
        b.a aVarT = t();
        u(aVarT, 1007, new f(aVarT, gVar, 1));
    }

    @Override // androidx.media3.common.z.d
    public final void F7(g0 g0Var) {
        b.a aVarO = o();
        u(aVarO, 19, new x(aVarO, g0Var, 7));
    }

    @Override // ja.a
    public final void G(androidx.media3.common.q qVar, androidx.media3.exoplayer.h hVar) {
        b.a aVarT = t();
        u(aVarT, 1009, new j(aVarT, qVar, hVar, 1));
    }

    @Override // ja.a
    public final void I(androidx.media3.exoplayer.g gVar) {
        b.a aVarR = r(this.f97987d.f97997e);
        u(aVarR, 1013, new f(aVarR, gVar, 2));
    }

    @Override // androidx.media3.common.z.d
    public final void I4(PlaybackException playbackException) {
        androidx.media3.exoplayer.source.j.b bVar;
        b.a aVarO = (!(playbackException instanceof ExoPlaybackException) || (bVar = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? o() : r(bVar);
        u(aVarO, 10, new x(aVarO, playbackException, 14));
    }

    @Override // ja.a
    public final void L8(final int i14, final int i15, final boolean z14) {
        final b.a aVarT = t();
        u(aVarT, 1033, new fa.j.a() { // from class: ja.k
            @Override // fa.j.a
            public final void invoke(Object obj) {
                ((b) obj).F(aVarT, i14, i15, z14);
            }
        });
    }

    @Override // androidx.media3.common.z.d
    public final void M0(int i14) {
        z zVar = this.f97990g;
        zVar.getClass();
        a aVar = this.f97987d;
        aVar.f97996d = a.b(zVar, aVar.f97994b, aVar.f97997e, aVar.f97993a);
        aVar.d(zVar.getCurrentTimeline());
        b.a aVarO = o();
        u(aVarO, 0, new i(aVarO, i14, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ja.a
    public final void M3(ImmutableList immutableList, androidx.media3.exoplayer.source.j.b bVar) {
        z zVar = this.f97990g;
        zVar.getClass();
        a aVar = this.f97987d;
        aVar.getClass();
        aVar.f97994b = ImmutableList.copyOf((Collection) immutableList);
        if (!immutableList.isEmpty()) {
            aVar.f97997e = (androidx.media3.exoplayer.source.j.b) immutableList.get(0);
            bVar.getClass();
            aVar.f97998f = bVar;
        }
        if (aVar.f97996d == null) {
            aVar.f97996d = a.b(zVar, aVar.f97994b, aVar.f97997e, aVar.f97993a);
        }
        aVar.d(zVar.getCurrentTimeline());
    }

    @Override // androidx.media3.common.z.d
    public final void N0(v vVar) {
        b.a aVarO = o();
        u(aVarO, 14, new x(aVarO, vVar, 6));
    }

    @Override // ja.a
    public final void P(AudioSink.a aVar) {
        b.a aVarT = t();
        u(aVarT, 1031, new l(aVarT, aVar, 0));
    }

    @Override // androidx.media3.common.z.d
    public final void P7(t tVar, int i14) {
        b.a aVarO = o();
        u(aVarO, 1, new i(aVarO, tVar, i14));
    }

    @Override // ja.a
    public final void S(AudioSink.a aVar) {
        b.a aVarT = t();
        u(aVarT, 1032, new l(aVarT, aVar, 1));
    }

    @Override // ja.a
    public final void V4(b bVar) {
        bVar.getClass();
        this.f97989f.a(bVar);
    }

    @Override // androidx.media3.common.z.d
    public final void W5(z.b bVar) {
        b.a aVarO = o();
        u(aVarO, 13, new x(aVarO, bVar, 10));
    }

    @Override // androidx.media3.common.z.d
    public final void Y(w wVar) {
        b.a aVarO = o();
        u(aVarO, 28, new hc0.c(13, aVarO, wVar));
    }

    @Override // androidx.media3.exoplayer.drm.b
    public final void a(int i14, androidx.media3.exoplayer.source.j.b bVar) {
        b.a aVarS = s(i14, bVar);
        u(aVarS, 1023, new e(aVarS, 3));
    }

    @Override // androidx.media3.common.z.d
    public final void a3(y yVar) {
        b.a aVarO = o();
        u(aVarO, 12, new hc0.c(11, aVarO, yVar));
    }

    @Override // androidx.media3.common.z.d
    public final void a6(int i14, z.e eVar, z.e eVar2) {
        if (i14 == 1) {
            this.f97992i = false;
        }
        z zVar = this.f97990g;
        zVar.getClass();
        a aVar = this.f97987d;
        aVar.f97996d = a.b(zVar, aVar.f97994b, aVar.f97997e, aVar.f97993a);
        b.a aVarO = o();
        u(aVarO, 11, new com.google.android.exoplayer2.analytics.t(aVarO, i14, eVar, eVar2, 2));
    }

    @Override // androidx.media3.exoplayer.drm.b
    public final void b(int i14, androidx.media3.exoplayer.source.j.b bVar) {
        b.a aVarS = s(i14, bVar);
        u(aVarS, 1027, new e(aVarS, 0));
    }

    @Override // androidx.media3.exoplayer.source.k
    public final void c(int i14, androidx.media3.exoplayer.source.j.b bVar, sa.i iVar, sa.j jVar) {
        b.a aVarS = s(i14, bVar);
        u(aVarS, 1002, new x(aVarS, iVar, jVar, 19));
    }

    @Override // androidx.media3.exoplayer.source.k
    public final void d(int i14, androidx.media3.exoplayer.source.j.b bVar, sa.i iVar, sa.j jVar, IOException iOException, boolean z14) {
        b.a aVarS = s(i14, bVar);
        u(aVarS, 1003, new h0(aVarS, iVar, jVar, iOException, z14));
    }

    @Override // androidx.media3.exoplayer.source.k
    public final void e(int i14, androidx.media3.exoplayer.source.j.b bVar, sa.j jVar) {
        b.a aVarS = s(i14, bVar);
        u(aVarS, 1004, new d(aVarS, jVar, 1));
    }

    @Override // androidx.media3.exoplayer.drm.b
    public final void f(int i14, androidx.media3.exoplayer.source.j.b bVar) {
        b.a aVarS = s(i14, bVar);
        u(aVarS, 1025, new e(aVarS, 2));
    }

    @Override // ja.a
    public final void f5() {
        fa.i iVar = this.f97991h;
        fa.a.f(iVar);
        iVar.post(new eh2.b(this, 26));
    }

    @Override // androidx.media3.exoplayer.source.k
    public final void g(int i14, androidx.media3.exoplayer.source.j.b bVar, sa.j jVar) {
        b.a aVarS = s(i14, bVar);
        u(aVarS, 1005, new d(aVarS, jVar, 0));
    }

    @Override // androidx.media3.common.z.d
    public final void g1(PlaybackException playbackException) {
        androidx.media3.exoplayer.source.j.b bVar;
        b.a aVarO = (!(playbackException instanceof ExoPlaybackException) || (bVar = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? o() : r(bVar);
        u(aVarO, 10, new hc0.c(14, aVarO, playbackException));
    }

    @Override // androidx.media3.common.z.d
    public final void g2(androidx.media3.common.h0 h0Var) {
        b.a aVarO = o();
        u(aVarO, 2, new hc0.c(12, aVarO, h0Var));
    }

    @Override // androidx.media3.exoplayer.source.k
    public final void h(int i14, androidx.media3.exoplayer.source.j.b bVar, sa.i iVar, sa.j jVar) {
        b.a aVarS = s(i14, bVar);
        u(aVarS, 1001, new x(aVarS, iVar, jVar, 20));
    }

    @Override // androidx.media3.exoplayer.source.k
    public final void i(int i14, androidx.media3.exoplayer.source.j.b bVar, sa.i iVar, sa.j jVar) {
        b.a aVarS = s(i14, bVar);
        u(aVarS, 1000, new x(aVarS, iVar, jVar, 9));
    }

    @Override // androidx.media3.exoplayer.drm.b
    public final void j(int i14, androidx.media3.exoplayer.source.j.b bVar, int i15) {
        b.a aVarS = s(i14, bVar);
        u(aVarS, 1022, new i(aVarS, i15, 5));
    }

    @Override // androidx.media3.common.z.d
    public final void k(k0 k0Var) {
        b.a aVarT = t();
        u(aVarT, 25, new hc0.c(17, aVarT, k0Var));
    }

    @Override // androidx.media3.exoplayer.drm.b
    public final void l(int i14, androidx.media3.exoplayer.source.j.b bVar) {
        b.a aVarS = s(i14, bVar);
        u(aVarS, 1026, new e(aVarS, 1));
    }

    @Override // androidx.media3.exoplayer.drm.b
    public final void m(int i14, androidx.media3.exoplayer.source.j.b bVar, Exception exc) {
        b.a aVarS = s(i14, bVar);
        u(aVarS, 1024, new hc0.c(16, aVarS, exc));
    }

    @Override // androidx.media3.common.z.d
    public final void n(ea.b bVar) {
        b.a aVarO = o();
        u(aVarO, 27, new x(aVarO, bVar, 5));
    }

    @Override // ja.a
    public final void notifySeekStarted() {
        if (this.f97992i) {
            return;
        }
        b.a aVarO = o();
        this.f97992i = true;
        u(aVarO, -1, new x(aVarO, 21));
    }

    public final b.a o() {
        return r(this.f97987d.f97996d);
    }

    @Override // ja.a
    public final void onAudioCodecError(Exception exc) {
        b.a aVarT = t();
        u(aVarT, 1029, new x(aVarT, exc, 16));
    }

    @Override // ja.a
    public final void onAudioDecoderInitialized(String str, long j8, long j14) {
        b.a aVarT = t();
        u(aVarT, 1008, new h(aVarT, str, j14, j8, 1));
    }

    @Override // ja.a
    public final void onAudioDecoderReleased(String str) {
        b.a aVarT = t();
        u(aVarT, 1012, new h(aVarT, str, 0));
    }

    @Override // ja.a
    public final void onAudioPositionAdvancing(long j8) {
        b.a aVarT = t();
        u(aVarT, 1010, new x(aVarT, j8));
    }

    @Override // ja.a
    public final void onAudioSinkError(Exception exc) {
        b.a aVarT = t();
        u(aVarT, 1014, new x(aVarT, exc, 17));
    }

    @Override // ja.a
    public final void onAudioUnderrun(int i14, long j8, long j14) {
        b.a aVarT = t();
        u(aVarT, 1011, new com.google.android.exoplayer2.analytics.e(aVarT, i14, j8, j14, 2));
    }

    @Override // xa.c.a
    public final void onBandwidthSample(int i14, long j8, long j14) {
        a aVar = this.f97987d;
        b.a aVarR = r(aVar.f97994b.isEmpty() ? null : (androidx.media3.exoplayer.source.j.b) Iterables.getLast(aVar.f97994b));
        u(aVarR, 1006, new c(aVarR, i14, j8, j14));
    }

    @Override // androidx.media3.common.z.d
    public final void onCues(List<ea.a> list) {
        b.a aVarO = o();
        u(aVarO, 27, new androidx.media3.exoplayer.w(aVarO, list));
    }

    @Override // ja.a
    public final void onDroppedFrames(int i14, long j8) {
        b.a aVarR = r(this.f97987d.f97997e);
        u(aVarR, 1018, new i(i14, j8, aVarR));
    }

    @Override // androidx.media3.common.z.d
    public final void onIsLoadingChanged(boolean z14) {
        b.a aVarO = o();
        u(aVarO, 3, new g(aVarO, z14, 0));
    }

    @Override // androidx.media3.common.z.d
    public final void onIsPlayingChanged(boolean z14) {
        b.a aVarO = o();
        u(aVarO, 7, new g(aVarO, z14, 1));
    }

    @Override // androidx.media3.common.z.d
    public final void onPlayWhenReadyChanged(boolean z14, int i14) {
        b.a aVarO = o();
        u(aVarO, 5, new com.google.android.exoplayer2.analytics.i(aVarO, z14, i14, 3));
    }

    @Override // androidx.media3.common.z.d
    public final void onPlaybackStateChanged(int i14) {
        b.a aVarO = o();
        u(aVarO, 4, new i(aVarO, i14, 4));
    }

    @Override // androidx.media3.common.z.d
    public final void onPlaybackSuppressionReasonChanged(int i14) {
        b.a aVarO = o();
        u(aVarO, 6, new i(aVarO, i14, 2));
    }

    @Override // androidx.media3.common.z.d
    public final void onPlayerStateChanged(boolean z14, int i14) {
        b.a aVarO = o();
        u(aVarO, -1, new x(aVarO, z14, i14));
    }

    @Override // ja.a
    public final void onRenderedFirstFrame(Object obj, long j8) {
        b.a aVarT = t();
        u(aVarT, 26, new hc0.c(aVarT, obj, j8));
    }

    @Override // androidx.media3.common.z.d
    public final void onRepeatModeChanged(int i14) {
        b.a aVarO = o();
        u(aVarO, 8, new i(aVarO, i14, 6));
    }

    @Override // androidx.media3.common.z.d
    public final void onShuffleModeEnabledChanged(boolean z14) {
        b.a aVarO = o();
        u(aVarO, 9, new g(aVarO, z14, 2));
    }

    @Override // androidx.media3.common.z.d
    public final void onSkipSilenceEnabledChanged(boolean z14) {
        b.a aVarT = t();
        u(aVarT, 23, new g(aVarT, z14, 3));
    }

    @Override // androidx.media3.common.z.d
    public final void onSurfaceSizeChanged(int i14, int i15) {
        b.a aVarT = t();
        u(aVarT, 24, new com.google.android.exoplayer2.analytics.m(aVarT, i14, i15, 2));
    }

    @Override // ja.a
    public final void onVideoCodecError(Exception exc) {
        b.a aVarT = t();
        u(aVarT, 1030, new x(aVarT, exc, 11));
    }

    @Override // ja.a
    public final void onVideoDecoderInitialized(String str, long j8, long j14) {
        b.a aVarT = t();
        u(aVarT, 1016, new h(aVarT, str, j14, j8, 3));
    }

    @Override // ja.a
    public final void onVideoDecoderReleased(String str) {
        b.a aVarT = t();
        u(aVarT, 1019, new h(aVarT, str, 2));
    }

    @Override // ja.a
    public final void onVideoFrameProcessingOffset(long j8, int i14) {
        b.a aVarR = r(this.f97987d.f97997e);
        u(aVarR, 1021, new x(i14, j8, aVarR));
    }

    @Override // ja.a
    public final void p(androidx.media3.exoplayer.g gVar) {
        b.a aVarT = t();
        u(aVarT, 1015, new f(aVarT, gVar, 3));
    }

    public final b.a q(d0 d0Var, int i14, androidx.media3.exoplayer.source.j.b bVar) {
        androidx.media3.exoplayer.source.j.b bVar2 = d0Var.p() ? null : bVar;
        long jElapsedRealtime = this.f97984a.elapsedRealtime();
        boolean z14 = d0Var.equals(this.f97990g.getCurrentTimeline()) && i14 == this.f97990g.getCurrentMediaItemIndex();
        long jY = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z14) {
                jY = this.f97990g.getContentPosition();
            } else if (!d0Var.p()) {
                jY = fa.z.Y(d0Var.m(i14, this.f97986c, 0L).f8207l);
            }
        } else if (z14 && this.f97990g.getCurrentAdGroupIndex() == bVar2.f9520b && this.f97990g.getCurrentAdIndexInAdGroup() == bVar2.f9521c) {
            jY = this.f97990g.getCurrentPosition();
        }
        return new b.a(jElapsedRealtime, d0Var, i14, bVar2, jY, this.f97990g.getCurrentTimeline(), this.f97990g.getCurrentMediaItemIndex(), this.f97987d.f97996d, this.f97990g.getCurrentPosition(), this.f97990g.getTotalBufferedDuration());
    }

    public final b.a r(androidx.media3.exoplayer.source.j.b bVar) {
        this.f97990g.getClass();
        d0 d0Var = bVar == null ? null : this.f97987d.f97995c.get(bVar);
        if (bVar != null && d0Var != null) {
            return q(d0Var, d0Var.g(bVar.f9519a, this.f97985b).f8189c, bVar);
        }
        int currentMediaItemIndex = this.f97990g.getCurrentMediaItemIndex();
        d0 currentTimeline = this.f97990g.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.o()) {
            currentTimeline = d0.f8186a;
        }
        return q(currentTimeline, currentMediaItemIndex, null);
    }

    @Override // androidx.media3.common.z.d
    public final void r8(z.c cVar) {
    }

    public final b.a s(int i14, androidx.media3.exoplayer.source.j.b bVar) {
        this.f97990g.getClass();
        if (bVar != null) {
            return this.f97987d.f97995c.get(bVar) != null ? r(bVar) : q(d0.f8186a, i14, bVar);
        }
        d0 currentTimeline = this.f97990g.getCurrentTimeline();
        if (i14 >= currentTimeline.o()) {
            currentTimeline = d0.f8186a;
        }
        return q(currentTimeline, i14, null);
    }

    @Override // ja.a
    public final void s2(z zVar, Looper looper) {
        fa.a.d(this.f97990g == null || this.f97987d.f97994b.isEmpty());
        zVar.getClass();
        this.f97990g = zVar;
        this.f97991h = this.f97984a.createHandler(looper, null);
        this.f97989f = this.f97989f.b(looper, new hc0.c(15, this, zVar));
    }

    public final b.a t() {
        return r(this.f97987d.f97998f);
    }

    public final void u(b.a aVar, int i14, fa.j.a<b> aVar2) {
        this.f97988e.put(i14, aVar);
        this.f97989f.f(i14, aVar2);
    }

    @Override // ja.a
    public final void z(androidx.media3.common.q qVar, androidx.media3.exoplayer.h hVar) {
        b.a aVarT = t();
        u(aVarT, 1017, new j(aVarT, qVar, hVar, 0));
    }

    @Override // androidx.media3.common.z.d
    public final void onRenderedFirstFrame() {
    }
}
