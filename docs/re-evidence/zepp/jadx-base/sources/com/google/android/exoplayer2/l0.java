package com.google.android.exoplayer2;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class l0 {
    private static final MediaSource.MediaPeriodId t = new MediaSource.MediaPeriodId(new Object());
    public final Timeline a;
    public final MediaSource.MediaPeriodId b;
    public final long c;
    public final long d;
    public final int e;

    @Nullable
    public final ExoPlaybackException f;
    public final boolean g;
    public final TrackGroupArray h;
    public final TrackSelectorResult i;
    public final List<Metadata> j;
    public final MediaSource.MediaPeriodId k;
    public final boolean l;
    public final int m;
    public final PlaybackParameters n;
    public final boolean o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public l0(Timeline timeline, MediaSource.MediaPeriodId periodId, long requestedContentPositionUs, long discontinuityStartPositionUs, int playbackState, @Nullable ExoPlaybackException playbackError, boolean isLoading, TrackGroupArray trackGroups, TrackSelectorResult trackSelectorResult, List<Metadata> staticMetadata, MediaSource.MediaPeriodId loadingMediaPeriodId, boolean playWhenReady, int playbackSuppressionReason, PlaybackParameters playbackParameters, long bufferedPositionUs, long totalBufferedDurationUs, long positionUs, boolean offloadSchedulingEnabled, boolean sleepingForOffload) {
        this.a = timeline;
        this.b = periodId;
        this.c = requestedContentPositionUs;
        this.d = discontinuityStartPositionUs;
        this.e = playbackState;
        this.f = playbackError;
        this.g = isLoading;
        this.h = trackGroups;
        this.i = trackSelectorResult;
        this.j = staticMetadata;
        this.k = loadingMediaPeriodId;
        this.l = playWhenReady;
        this.m = playbackSuppressionReason;
        this.n = playbackParameters;
        this.q = bufferedPositionUs;
        this.r = totalBufferedDurationUs;
        this.s = positionUs;
        this.o = offloadSchedulingEnabled;
        this.p = sleepingForOffload;
    }

    public static l0 k(TrackSelectorResult emptyTrackSelectorResult) {
        Timeline timeline = Timeline.EMPTY;
        MediaSource.MediaPeriodId mediaPeriodId = t;
        return new l0(timeline, mediaPeriodId, C.TIME_UNSET, 0L, 1, null, false, TrackGroupArray.EMPTY, emptyTrackSelectorResult, ImmutableList.of(), mediaPeriodId, false, 0, PlaybackParameters.DEFAULT, 0L, 0L, 0L, false, false);
    }

    public static MediaSource.MediaPeriodId l() {
        return t;
    }

    @CheckResult
    public l0 a(boolean isLoading) {
        return new l0(this.a, this.b, this.c, this.d, this.e, this.f, isLoading, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    @CheckResult
    public l0 b(MediaSource.MediaPeriodId loadingMediaPeriodId) {
        return new l0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, loadingMediaPeriodId, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    @CheckResult
    public l0 c(MediaSource.MediaPeriodId periodId, long positionUs, long requestedContentPositionUs, long discontinuityStartPositionUs, long totalBufferedDurationUs, TrackGroupArray trackGroups, TrackSelectorResult trackSelectorResult, List<Metadata> staticMetadata) {
        return new l0(this.a, periodId, requestedContentPositionUs, discontinuityStartPositionUs, this.e, this.f, this.g, trackGroups, trackSelectorResult, staticMetadata, this.k, this.l, this.m, this.n, this.q, totalBufferedDurationUs, positionUs, this.o, this.p);
    }

    @CheckResult
    public l0 d(boolean offloadSchedulingEnabled) {
        return new l0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, offloadSchedulingEnabled, this.p);
    }

    @CheckResult
    public l0 e(boolean playWhenReady, int playbackSuppressionReason) {
        return new l0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, playWhenReady, playbackSuppressionReason, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    @CheckResult
    public l0 f(@Nullable ExoPlaybackException playbackError) {
        return new l0(this.a, this.b, this.c, this.d, this.e, playbackError, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    @CheckResult
    public l0 g(PlaybackParameters playbackParameters) {
        return new l0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, playbackParameters, this.q, this.r, this.s, this.o, this.p);
    }

    @CheckResult
    public l0 h(int playbackState) {
        return new l0(this.a, this.b, this.c, this.d, playbackState, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    @CheckResult
    public l0 i(boolean sleepingForOffload) {
        return new l0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, sleepingForOffload);
    }

    @CheckResult
    public l0 j(Timeline timeline) {
        return new l0(timeline, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }
}
