package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.ClippingMediaPeriod;
import com.google.android.exoplayer2.source.EmptySampleStream;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class f0 {
    private static final String p = "MediaPeriodHolder";
    public final MediaPeriod a;
    public final Object b;
    public final SampleStream[] c;
    public boolean d;
    public boolean e;
    public g0 f;
    public boolean g;
    private final boolean[] h;
    private final RendererCapabilities[] i;
    private final TrackSelector j;
    private final MediaSourceList k;

    @Nullable
    private f0 l;
    private TrackGroupArray m;
    private TrackSelectorResult n;
    private long o;

    public f0(RendererCapabilities[] rendererCapabilities, long rendererPositionOffsetUs, TrackSelector trackSelector, Allocator allocator, MediaSourceList mediaSourceList, g0 info, TrackSelectorResult emptyTrackSelectorResult) {
        this.i = rendererCapabilities;
        this.o = rendererPositionOffsetUs;
        this.j = trackSelector;
        this.k = mediaSourceList;
        MediaSource.MediaPeriodId mediaPeriodId = info.a;
        this.b = mediaPeriodId.periodUid;
        this.f = info;
        this.m = TrackGroupArray.EMPTY;
        this.n = emptyTrackSelectorResult;
        this.c = new SampleStream[rendererCapabilities.length];
        this.h = new boolean[rendererCapabilities.length];
        this.a = e(mediaPeriodId, mediaSourceList, allocator, info.b, info.d);
    }

    private void c(SampleStream[] sampleStreams) {
        int i = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.i;
            if (i >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i].getTrackType() == 7 && this.n.isRendererEnabled(i)) {
                sampleStreams[i] = new EmptySampleStream();
            }
            i++;
        }
    }

    private static MediaPeriod e(MediaSource.MediaPeriodId id, MediaSourceList mediaSourceList, Allocator allocator, long startPositionUs, long endPositionUs) {
        MediaPeriod mediaPeriodI = mediaSourceList.i(id, allocator, startPositionUs);
        return endPositionUs != C.TIME_UNSET ? new ClippingMediaPeriod(mediaPeriodI, true, 0L, endPositionUs) : mediaPeriodI;
    }

    private void f() {
        if (!r()) {
            return;
        }
        int i = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.n;
            if (i >= trackSelectorResult.length) {
                return;
            }
            boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i);
            ExoTrackSelection exoTrackSelection = this.n.selections[i];
            if (zIsRendererEnabled && exoTrackSelection != null) {
                exoTrackSelection.disable();
            }
            i++;
        }
    }

    private void g(SampleStream[] sampleStreams) {
        int i = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.i;
            if (i >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i].getTrackType() == 7) {
                sampleStreams[i] = null;
            }
            i++;
        }
    }

    private void h() {
        if (!r()) {
            return;
        }
        int i = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.n;
            if (i >= trackSelectorResult.length) {
                return;
            }
            boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i);
            ExoTrackSelection exoTrackSelection = this.n.selections[i];
            if (zIsRendererEnabled && exoTrackSelection != null) {
                exoTrackSelection.enable();
            }
            i++;
        }
    }

    private boolean r() {
        return this.l == null;
    }

    private static void u(MediaSourceList mediaSourceList, MediaPeriod mediaPeriod) {
        try {
            if (mediaPeriod instanceof ClippingMediaPeriod) {
                mediaSourceList.B(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
            } else {
                mediaSourceList.B(mediaPeriod);
            }
        } catch (RuntimeException e) {
            Log.e(p, "Period release failed.", e);
        }
    }

    public void A() {
        MediaPeriod mediaPeriod = this.a;
        if (mediaPeriod instanceof ClippingMediaPeriod) {
            long j = this.f.d;
            if (j == C.TIME_UNSET) {
                j = Long.MIN_VALUE;
            }
            ((ClippingMediaPeriod) mediaPeriod).updateClipping(0L, j);
        }
    }

    public long a(TrackSelectorResult trackSelectorResult, long positionUs, boolean forceRecreateStreams) {
        return b(trackSelectorResult, positionUs, forceRecreateStreams, new boolean[this.i.length]);
    }

    public long b(TrackSelectorResult newTrackSelectorResult, long positionUs, boolean forceRecreateStreams, boolean[] streamResetFlags) {
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= newTrackSelectorResult.length) {
                break;
            }
            boolean[] zArr = this.h;
            if (forceRecreateStreams || !newTrackSelectorResult.isEquivalent(this.n, i)) {
                z = false;
            }
            zArr[i] = z;
            i++;
        }
        g(this.c);
        f();
        this.n = newTrackSelectorResult;
        h();
        long jSelectTracks = this.a.selectTracks(newTrackSelectorResult.selections, this.h, this.c, streamResetFlags, positionUs);
        c(this.c);
        this.e = false;
        int i2 = 0;
        while (true) {
            SampleStream[] sampleStreamArr = this.c;
            if (i2 >= sampleStreamArr.length) {
                return jSelectTracks;
            }
            if (sampleStreamArr[i2] != null) {
                Assertions.checkState(newTrackSelectorResult.isRendererEnabled(i2));
                if (this.i[i2].getTrackType() != 7) {
                    this.e = true;
                }
            } else {
                Assertions.checkState(newTrackSelectorResult.selections[i2] == null);
            }
            i2++;
        }
    }

    public void d(long rendererPositionUs) {
        Assertions.checkState(r());
        this.a.continueLoading(y(rendererPositionUs));
    }

    public long i() {
        if (!this.d) {
            return this.f.b;
        }
        long bufferedPositionUs = this.e ? this.a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f.e : bufferedPositionUs;
    }

    @Nullable
    public f0 j() {
        return this.l;
    }

    public long k() {
        if (this.d) {
            return this.a.getNextLoadPositionUs();
        }
        return 0L;
    }

    public long l() {
        return this.o;
    }

    public long m() {
        return this.f.b + this.o;
    }

    public TrackGroupArray n() {
        return this.m;
    }

    public TrackSelectorResult o() {
        return this.n;
    }

    public void p(float playbackSpeed, Timeline timeline) throws ExoPlaybackException {
        this.d = true;
        this.m = this.a.getTrackGroups();
        TrackSelectorResult trackSelectorResultV = v(playbackSpeed, timeline);
        g0 g0Var = this.f;
        long jMax = g0Var.b;
        long j = g0Var.e;
        if (j != C.TIME_UNSET && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(trackSelectorResultV, jMax, false);
        long j2 = this.o;
        g0 g0Var2 = this.f;
        this.o = j2 + (g0Var2.b - jA);
        this.f = g0Var2.b(jA);
    }

    public boolean q() {
        return this.d && (!this.e || this.a.getBufferedPositionUs() == Long.MIN_VALUE);
    }

    public void s(long rendererPositionUs) {
        Assertions.checkState(r());
        if (this.d) {
            this.a.reevaluateBuffer(y(rendererPositionUs));
        }
    }

    public void t() {
        f();
        u(this.k, this.a);
    }

    public TrackSelectorResult v(float playbackSpeed, Timeline timeline) throws ExoPlaybackException {
        TrackSelectorResult trackSelectorResultSelectTracks = this.j.selectTracks(this.i, n(), this.f.a, timeline);
        for (ExoTrackSelection exoTrackSelection : trackSelectorResultSelectTracks.selections) {
            if (exoTrackSelection != null) {
                exoTrackSelection.onPlaybackSpeed(playbackSpeed);
            }
        }
        return trackSelectorResultSelectTracks;
    }

    public void w(@Nullable f0 nextMediaPeriodHolder) {
        if (nextMediaPeriodHolder == this.l) {
            return;
        }
        f();
        this.l = nextMediaPeriodHolder;
        h();
    }

    public void x(long rendererPositionOffsetUs) {
        this.o = rendererPositionOffsetUs;
    }

    public long y(long rendererTimeUs) {
        return rendererTimeUs - l();
    }

    public long z(long periodTimeUs) {
        return periodTimeUs + l();
    }
}
