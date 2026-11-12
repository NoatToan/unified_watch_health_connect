package com.google.android.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes2.dex */
final class i0 {
    private static final int n = 100;
    private final Timeline.Period a = new Timeline.Period();
    private final Timeline.Window b = new Timeline.Window();

    @Nullable
    private final AnalyticsCollector c;
    private final Handler d;
    private long e;
    private int f;
    private boolean g;

    @Nullable
    private f0 h;

    @Nullable
    private f0 i;

    @Nullable
    private f0 j;
    private int k;

    @Nullable
    private Object l;
    private long m;

    public i0(@Nullable AnalyticsCollector analyticsCollector, Handler analyticsCollectorHandler) {
        this.c = analyticsCollector;
        this.d = analyticsCollectorHandler;
    }

    private static MediaSource.MediaPeriodId B(Timeline timeline, Object periodUid, long positionUs, long windowSequenceNumber, Timeline.Period period) {
        timeline.getPeriodByUid(periodUid, period);
        int adGroupIndexForPositionUs = period.getAdGroupIndexForPositionUs(positionUs);
        return adGroupIndexForPositionUs == -1 ? new MediaSource.MediaPeriodId(periodUid, windowSequenceNumber, period.getAdGroupIndexAfterPositionUs(positionUs)) : new MediaSource.MediaPeriodId(periodUid, adGroupIndexForPositionUs, period.getFirstAdIndexToPlay(adGroupIndexForPositionUs), windowSequenceNumber);
    }

    private long C(Timeline timeline, Object periodUid) {
        int indexOfPeriod;
        int i = timeline.getPeriodByUid(periodUid, this.a).windowIndex;
        Object obj = this.l;
        if (obj != null && (indexOfPeriod = timeline.getIndexOfPeriod(obj)) != -1 && timeline.getPeriod(indexOfPeriod, this.a).windowIndex == i) {
            return this.m;
        }
        for (f0 f0VarJ = this.h; f0VarJ != null; f0VarJ = f0VarJ.j()) {
            if (f0VarJ.b.equals(periodUid)) {
                return f0VarJ.f.a.windowSequenceNumber;
            }
        }
        for (f0 f0VarJ2 = this.h; f0VarJ2 != null; f0VarJ2 = f0VarJ2.j()) {
            int indexOfPeriod2 = timeline.getIndexOfPeriod(f0VarJ2.b);
            if (indexOfPeriod2 != -1 && timeline.getPeriod(indexOfPeriod2, this.a).windowIndex == i) {
                return f0VarJ2.f.a.windowSequenceNumber;
            }
        }
        long j = this.e;
        this.e = 1 + j;
        if (this.h == null) {
            this.l = periodUid;
            this.m = j;
        }
        return j;
    }

    private boolean E(Timeline timeline) {
        f0 f0VarJ = this.h;
        if (f0VarJ == null) {
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(f0VarJ.b);
        while (true) {
            indexOfPeriod = timeline.getNextPeriodIndex(indexOfPeriod, this.a, this.b, this.f, this.g);
            while (f0VarJ.j() != null && !f0VarJ.f.g) {
                f0VarJ = f0VarJ.j();
            }
            f0 f0VarJ2 = f0VarJ.j();
            if (indexOfPeriod == -1 || f0VarJ2 == null || timeline.getIndexOfPeriod(f0VarJ2.b) != indexOfPeriod) {
                break;
            }
            f0VarJ = f0VarJ2;
        }
        boolean z = z(f0VarJ);
        f0VarJ.f = r(timeline, f0VarJ.f);
        return !z;
    }

    private boolean d(long previousDurationUs, long newDurationUs) {
        return previousDurationUs == C.TIME_UNSET || previousDurationUs == newDurationUs;
    }

    private boolean e(g0 oldInfo, g0 newInfo) {
        return oldInfo.b == newInfo.b && oldInfo.a.equals(newInfo.a);
    }

    @Nullable
    private g0 h(l0 playbackInfo) {
        return k(playbackInfo.a, playbackInfo.b, playbackInfo.c, playbackInfo.s);
    }

    @Nullable
    private g0 i(Timeline timeline, f0 mediaPeriodHolder, long rendererPositionUs) {
        long j;
        g0 g0Var = mediaPeriodHolder.f;
        long jL = (mediaPeriodHolder.l() + g0Var.e) - rendererPositionUs;
        if (g0Var.g) {
            long j2 = 0;
            int nextPeriodIndex = timeline.getNextPeriodIndex(timeline.getIndexOfPeriod(g0Var.a.periodUid), this.a, this.b, this.f, this.g);
            if (nextPeriodIndex == -1) {
                return null;
            }
            int i = timeline.getPeriod(nextPeriodIndex, this.a, true).windowIndex;
            Object obj = this.a.uid;
            long j3 = g0Var.a.windowSequenceNumber;
            if (timeline.getWindow(i, this.b).firstPeriodIndex == nextPeriodIndex) {
                Pair<Object, Long> periodPosition = timeline.getPeriodPosition(this.b, this.a, i, C.TIME_UNSET, Math.max(0L, jL));
                if (periodPosition == null) {
                    return null;
                }
                obj = periodPosition.first;
                long jLongValue = ((Long) periodPosition.second).longValue();
                f0 f0VarJ = mediaPeriodHolder.j();
                if (f0VarJ == null || !f0VarJ.b.equals(obj)) {
                    j3 = this.e;
                    this.e = 1 + j3;
                } else {
                    j3 = f0VarJ.f.a.windowSequenceNumber;
                }
                j = jLongValue;
                j2 = C.TIME_UNSET;
            } else {
                j = 0;
            }
            return k(timeline, B(timeline, obj, j, j3, this.a), j2, j);
        }
        MediaSource.MediaPeriodId mediaPeriodId = g0Var.a;
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.a);
        if (!mediaPeriodId.isAd()) {
            int firstAdIndexToPlay = this.a.getFirstAdIndexToPlay(mediaPeriodId.nextAdGroupIndex);
            if (firstAdIndexToPlay != this.a.getAdCountInAdGroup(mediaPeriodId.nextAdGroupIndex)) {
                return l(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay, g0Var.e, mediaPeriodId.windowSequenceNumber);
            }
            return m(timeline, mediaPeriodId.periodUid, n(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex), g0Var.e, mediaPeriodId.windowSequenceNumber);
        }
        int i2 = mediaPeriodId.adGroupIndex;
        int adCountInAdGroup = this.a.getAdCountInAdGroup(i2);
        if (adCountInAdGroup == -1) {
            return null;
        }
        int nextAdIndexToPlay = this.a.getNextAdIndexToPlay(i2, mediaPeriodId.adIndexInAdGroup);
        if (nextAdIndexToPlay < adCountInAdGroup) {
            return l(timeline, mediaPeriodId.periodUid, i2, nextAdIndexToPlay, g0Var.c, mediaPeriodId.windowSequenceNumber);
        }
        long jLongValue2 = g0Var.c;
        if (jLongValue2 == C.TIME_UNSET) {
            Timeline.Window window = this.b;
            Timeline.Period period = this.a;
            Pair<Object, Long> periodPosition2 = timeline.getPeriodPosition(window, period, period.windowIndex, C.TIME_UNSET, Math.max(0L, jL));
            if (periodPosition2 == null) {
                return null;
            }
            jLongValue2 = ((Long) periodPosition2.second).longValue();
        }
        return m(timeline, mediaPeriodId.periodUid, Math.max(n(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex), jLongValue2), g0Var.c, mediaPeriodId.windowSequenceNumber);
    }

    @Nullable
    private g0 k(Timeline timeline, MediaSource.MediaPeriodId id, long requestedContentPositionUs, long startPositionUs) {
        timeline.getPeriodByUid(id.periodUid, this.a);
        return id.isAd() ? l(timeline, id.periodUid, id.adGroupIndex, id.adIndexInAdGroup, requestedContentPositionUs, id.windowSequenceNumber) : m(timeline, id.periodUid, startPositionUs, requestedContentPositionUs, id.windowSequenceNumber);
    }

    private g0 l(Timeline timeline, Object periodUid, int adGroupIndex, int adIndexInAdGroup, long contentPositionUs, long windowSequenceNumber) {
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(periodUid, adGroupIndex, adIndexInAdGroup, windowSequenceNumber);
        long adDurationUs = timeline.getPeriodByUid(mediaPeriodId.periodUid, this.a).getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        long adResumePositionUs = adIndexInAdGroup == this.a.getFirstAdIndexToPlay(adGroupIndex) ? this.a.getAdResumePositionUs() : 0L;
        return new g0(mediaPeriodId, (adDurationUs == C.TIME_UNSET || adResumePositionUs < adDurationUs) ? adResumePositionUs : Math.max(0L, adDurationUs - 1), contentPositionUs, C.TIME_UNSET, adDurationUs, this.a.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex), false, false, false);
    }

    private g0 m(Timeline timeline, Object periodUid, long startPositionUs, long requestedContentPositionUs, long windowSequenceNumber) {
        long jMax = startPositionUs;
        timeline.getPeriodByUid(periodUid, this.a);
        int adGroupIndexAfterPositionUs = this.a.getAdGroupIndexAfterPositionUs(jMax);
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(periodUid, windowSequenceNumber, adGroupIndexAfterPositionUs);
        boolean zS = s(mediaPeriodId);
        boolean zU = u(timeline, mediaPeriodId);
        boolean zT = t(timeline, mediaPeriodId, zS);
        boolean z = adGroupIndexAfterPositionUs != -1 && this.a.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs);
        long adGroupTimeUs = adGroupIndexAfterPositionUs != -1 ? this.a.getAdGroupTimeUs(adGroupIndexAfterPositionUs) : -9223372036854775807L;
        long j = (adGroupTimeUs == C.TIME_UNSET || adGroupTimeUs == Long.MIN_VALUE) ? this.a.durationUs : adGroupTimeUs;
        if (j != C.TIME_UNSET && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        return new g0(mediaPeriodId, jMax, requestedContentPositionUs, adGroupTimeUs, j, z, zS, zU, zT);
    }

    private long n(Timeline timeline, Object periodUid, int adGroupIndex) {
        timeline.getPeriodByUid(periodUid, this.a);
        long adGroupTimeUs = this.a.getAdGroupTimeUs(adGroupIndex);
        return adGroupTimeUs == Long.MIN_VALUE ? this.a.durationUs : adGroupTimeUs + this.a.getContentResumeOffsetUs(adGroupIndex);
    }

    private boolean s(MediaSource.MediaPeriodId id) {
        return !id.isAd() && id.nextAdGroupIndex == -1;
    }

    private boolean t(Timeline timeline, MediaSource.MediaPeriodId id, boolean isLastMediaPeriodInPeriod) {
        int indexOfPeriod = timeline.getIndexOfPeriod(id.periodUid);
        return !timeline.getWindow(timeline.getPeriod(indexOfPeriod, this.a).windowIndex, this.b).isDynamic && timeline.isLastPeriod(indexOfPeriod, this.a, this.b, this.f, this.g) && isLastMediaPeriodInPeriod;
    }

    private boolean u(Timeline timeline, MediaSource.MediaPeriodId id) {
        if (s(id)) {
            return timeline.getWindow(timeline.getPeriodByUid(id.periodUid, this.a).windowIndex, this.b).lastPeriodIndex == timeline.getIndexOfPeriod(id.periodUid);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(ImmutableList.Builder builder, MediaSource.MediaPeriodId mediaPeriodId) {
        this.c.updateMediaPeriodQueueInfo(builder.build(), mediaPeriodId);
    }

    private void x() {
        if (this.c != null) {
            final ImmutableList.Builder builder = ImmutableList.builder();
            for (f0 f0VarJ = this.h; f0VarJ != null; f0VarJ = f0VarJ.j()) {
                builder.add(f0VarJ.f.a);
            }
            f0 f0Var = this.i;
            final MediaSource.MediaPeriodId mediaPeriodId = f0Var == null ? null : f0Var.f.a;
            this.d.post(new Runnable() { // from class: com.google.android.exoplayer2.h0
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.w(builder, mediaPeriodId);
                }
            });
        }
    }

    public MediaSource.MediaPeriodId A(Timeline timeline, Object periodUid, long positionUs) {
        return B(timeline, periodUid, positionUs, C(timeline, periodUid), this.a);
    }

    public boolean D() {
        f0 f0Var = this.j;
        return f0Var == null || (!f0Var.f.i && f0Var.q() && this.j.f.e != C.TIME_UNSET && this.k < 100);
    }

    public boolean F(Timeline timeline, long rendererPositionUs, long maxRendererReadPositionUs) {
        g0 g0VarR;
        f0 f0VarJ = this.h;
        f0 f0Var = null;
        while (f0VarJ != null) {
            g0 g0Var = f0VarJ.f;
            if (f0Var == null) {
                g0VarR = r(timeline, g0Var);
            } else {
                g0 g0VarI = i(timeline, f0Var, rendererPositionUs);
                if (g0VarI == null) {
                    return !z(f0Var);
                }
                if (!e(g0Var, g0VarI)) {
                    return !z(f0Var);
                }
                g0VarR = g0VarI;
            }
            f0VarJ.f = g0VarR.a(g0Var.c);
            if (!d(g0Var.e, g0VarR.e)) {
                f0VarJ.A();
                long j = g0VarR.e;
                return (z(f0VarJ) || (f0VarJ == this.i && !f0VarJ.f.f && ((maxRendererReadPositionUs > Long.MIN_VALUE ? 1 : (maxRendererReadPositionUs == Long.MIN_VALUE ? 0 : -1)) == 0 || (maxRendererReadPositionUs > ((j > C.TIME_UNSET ? 1 : (j == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : f0VarJ.z(j)) ? 1 : (maxRendererReadPositionUs == ((j > C.TIME_UNSET ? 1 : (j == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : f0VarJ.z(j)) ? 0 : -1)) >= 0))) ? false : true;
            }
            f0Var = f0VarJ;
            f0VarJ = f0VarJ.j();
        }
        return true;
    }

    public boolean G(Timeline timeline, int repeatMode) {
        this.f = repeatMode;
        return E(timeline);
    }

    public boolean H(Timeline timeline, boolean shuffleModeEnabled) {
        this.g = shuffleModeEnabled;
        return E(timeline);
    }

    @Nullable
    public f0 b() {
        f0 f0Var = this.h;
        if (f0Var == null) {
            return null;
        }
        if (f0Var == this.i) {
            this.i = f0Var.j();
        }
        this.h.t();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            f0 f0Var2 = this.h;
            this.l = f0Var2.b;
            this.m = f0Var2.f.a.windowSequenceNumber;
        }
        this.h = this.h.j();
        x();
        return this.h;
    }

    public f0 c() {
        f0 f0Var = this.i;
        Assertions.checkState((f0Var == null || f0Var.j() == null) ? false : true);
        this.i = this.i.j();
        x();
        return this.i;
    }

    public void f() {
        if (this.k == 0) {
            return;
        }
        f0 f0VarJ = (f0) Assertions.checkStateNotNull(this.h);
        this.l = f0VarJ.b;
        this.m = f0VarJ.f.a.windowSequenceNumber;
        while (f0VarJ != null) {
            f0VarJ.t();
            f0VarJ = f0VarJ.j();
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        x();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public f0 g(RendererCapabilities[] rendererCapabilities, TrackSelector trackSelector, Allocator allocator, MediaSourceList mediaSourceList, g0 info, TrackSelectorResult emptyTrackSelectorResult) {
        long jL;
        f0 f0Var = this.j;
        if (f0Var != null) {
            jL = (f0Var.l() + this.j.f.e) - info.b;
        } else if (info.a.isAd()) {
            jL = info.c;
            if (jL == C.TIME_UNSET) {
                jL = 0;
            }
        } else {
            jL = 0;
        }
        f0 f0Var2 = new f0(rendererCapabilities, jL, trackSelector, allocator, mediaSourceList, info, emptyTrackSelectorResult);
        f0 f0Var3 = this.j;
        if (f0Var3 != null) {
            f0Var3.w(f0Var2);
        } else {
            this.h = f0Var2;
            this.i = f0Var2;
        }
        this.l = null;
        this.j = f0Var2;
        this.k++;
        x();
        return f0Var2;
    }

    @Nullable
    public f0 j() {
        return this.j;
    }

    @Nullable
    public g0 o(long rendererPositionUs, l0 playbackInfo) {
        f0 f0Var = this.j;
        return f0Var == null ? h(playbackInfo) : i(playbackInfo.a, f0Var, rendererPositionUs);
    }

    @Nullable
    public f0 p() {
        return this.h;
    }

    @Nullable
    public f0 q() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    public g0 r(Timeline timeline, g0 info) {
        long durationUs;
        long j;
        int i;
        boolean zIsServerSideInsertedAdGroup;
        int i2;
        MediaSource.MediaPeriodId mediaPeriodId = info.a;
        boolean zS = s(mediaPeriodId);
        boolean zU = u(timeline, mediaPeriodId);
        boolean zT = t(timeline, mediaPeriodId, zS);
        timeline.getPeriodByUid(info.a.periodUid, this.a);
        long adGroupTimeUs = (mediaPeriodId.isAd() || (i2 = mediaPeriodId.nextAdGroupIndex) == -1) ? -9223372036854775807L : this.a.getAdGroupTimeUs(i2);
        if (!mediaPeriodId.isAd()) {
            if (adGroupTimeUs == C.TIME_UNSET || adGroupTimeUs == Long.MIN_VALUE) {
                durationUs = this.a.getDurationUs();
            } else {
                j = adGroupTimeUs;
            }
            if (mediaPeriodId.isAd()) {
                zIsServerSideInsertedAdGroup = this.a.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
            } else {
                i = mediaPeriodId.nextAdGroupIndex;
                if (i == -1 && this.a.isServerSideInsertedAdGroup(i)) {
                    zIsServerSideInsertedAdGroup = true;
                } else {
                    zIsServerSideInsertedAdGroup = false;
                }
            }
            return new g0(mediaPeriodId, info.b, info.c, adGroupTimeUs, j, zIsServerSideInsertedAdGroup, zS, zU, zT);
        }
        durationUs = this.a.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        j = durationUs;
        if (mediaPeriodId.isAd()) {
            zIsServerSideInsertedAdGroup = this.a.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
        } else {
            i = mediaPeriodId.nextAdGroupIndex;
            if (i == -1) {
                zIsServerSideInsertedAdGroup = false;
            } else {
                zIsServerSideInsertedAdGroup = false;
            }
        }
        return new g0(mediaPeriodId, info.b, info.c, adGroupTimeUs, j, zIsServerSideInsertedAdGroup, zS, zU, zT);
    }

    public boolean v(MediaPeriod mediaPeriod) {
        f0 f0Var = this.j;
        return f0Var != null && f0Var.a == mediaPeriod;
    }

    public void y(long rendererPositionUs) {
        f0 f0Var = this.j;
        if (f0Var != null) {
            f0Var.s(rendererPositionUs);
        }
    }

    public boolean z(f0 mediaPeriodHolder) {
        boolean z = false;
        Assertions.checkState(mediaPeriodHolder != null);
        if (mediaPeriodHolder.equals(this.j)) {
            return false;
        }
        this.j = mediaPeriodHolder;
        while (mediaPeriodHolder.j() != null) {
            mediaPeriodHolder = mediaPeriodHolder.j();
            if (mediaPeriodHolder == this.i) {
                this.i = this.h;
                z = true;
            }
            mediaPeriodHolder.t();
            this.k--;
        }
        this.j.w(null);
        x();
        return z;
    }
}
