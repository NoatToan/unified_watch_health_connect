package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes2.dex */
public final class SinglePeriodTimeline extends Timeline {
    private static final Object q = new Object();
    private static final MediaItem r = new MediaItem.Builder().setMediaId("SinglePeriodTimeline").setUri(Uri.EMPTY).build();
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    @Nullable
    private final Object n;

    @Nullable
    private final MediaItem o;

    @Nullable
    private final MediaItem.LiveConfiguration p;

    @Deprecated
    public SinglePeriodTimeline(long durationUs, boolean isSeekable, boolean isDynamic, boolean isLive, @Nullable Object manifest, @Nullable Object tag) {
        this(durationUs, durationUs, 0L, 0L, isSeekable, isDynamic, isLive, manifest, tag);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getIndexOfPeriod(Object uid) {
        return q.equals(uid) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Period getPeriod(int periodIndex, Timeline.Period period, boolean setIds) {
        Assertions.checkIndex(periodIndex, 0, 1);
        return period.set(null, setIds ? q : null, 0, this.g, -this.i);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Object getUidOfPeriod(int periodIndex) {
        Assertions.checkIndex(periodIndex, 0, 1);
        return q;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x0012, B:5:0x0016, B:7:0x001c, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Window getWindow(int windowIndex, Timeline.Window window, long defaultPositionProjectionUs) {
        long j;
        Assertions.checkIndex(windowIndex, 0, 1);
        long j2 = this.j;
        boolean z = this.l;
        if (!z || this.m || defaultPositionProjectionUs == 0) {
            j = j2;
        } else {
            long j3 = this.h;
            if (j3 != C.TIME_UNSET) {
                j2 += defaultPositionProjectionUs;
                if (j2 <= j3) {
                    j = j2;
                }
            }
            j = -9223372036854775807L;
        }
        return window.set(Timeline.Window.SINGLE_WINDOW_UID, this.o, this.n, this.d, this.e, this.f, this.k, z, this.p, j, this.h, 0, 0, this.i);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
        return 1;
    }

    public SinglePeriodTimeline(long durationUs, boolean isSeekable, boolean isDynamic, boolean useLiveConfiguration, @Nullable Object manifest, MediaItem mediaItem) {
        this(durationUs, durationUs, 0L, 0L, isSeekable, isDynamic, useLiveConfiguration, manifest, mediaItem);
    }

    @Deprecated
    public SinglePeriodTimeline(long periodDurationUs, long windowDurationUs, long windowPositionInPeriodUs, long windowDefaultStartPositionUs, boolean isSeekable, boolean isDynamic, boolean isLive, @Nullable Object manifest, @Nullable Object tag) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, periodDurationUs, windowDurationUs, windowPositionInPeriodUs, windowDefaultStartPositionUs, isSeekable, isDynamic, isLive, manifest, tag);
    }

    public SinglePeriodTimeline(long periodDurationUs, long windowDurationUs, long windowPositionInPeriodUs, long windowDefaultStartPositionUs, boolean isSeekable, boolean isDynamic, boolean useLiveConfiguration, @Nullable Object manifest, MediaItem mediaItem) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, periodDurationUs, windowDurationUs, windowPositionInPeriodUs, windowDefaultStartPositionUs, isSeekable, isDynamic, false, manifest, mediaItem, useLiveConfiguration ? mediaItem.liveConfiguration : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public SinglePeriodTimeline(long presentationStartTimeMs, long windowStartTimeMs, long elapsedRealtimeEpochOffsetMs, long periodDurationUs, long windowDurationUs, long windowPositionInPeriodUs, long windowDefaultStartPositionUs, boolean isSeekable, boolean isDynamic, boolean isLive, @Nullable Object manifest, @Nullable Object tag) {
        MediaItem mediaItem = r;
        this(presentationStartTimeMs, windowStartTimeMs, elapsedRealtimeEpochOffsetMs, periodDurationUs, windowDurationUs, windowPositionInPeriodUs, windowDefaultStartPositionUs, isSeekable, isDynamic, false, manifest, mediaItem.buildUpon().setTag(tag).build(), isLive ? mediaItem.liveConfiguration : null);
    }

    @Deprecated
    public SinglePeriodTimeline(long presentationStartTimeMs, long windowStartTimeMs, long elapsedRealtimeEpochOffsetMs, long periodDurationUs, long windowDurationUs, long windowPositionInPeriodUs, long windowDefaultStartPositionUs, boolean isSeekable, boolean isDynamic, @Nullable Object manifest, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
        this(presentationStartTimeMs, windowStartTimeMs, elapsedRealtimeEpochOffsetMs, periodDurationUs, windowDurationUs, windowPositionInPeriodUs, windowDefaultStartPositionUs, isSeekable, isDynamic, false, manifest, mediaItem, liveConfiguration);
    }

    public SinglePeriodTimeline(long presentationStartTimeMs, long windowStartTimeMs, long elapsedRealtimeEpochOffsetMs, long periodDurationUs, long windowDurationUs, long windowPositionInPeriodUs, long windowDefaultStartPositionUs, boolean isSeekable, boolean isDynamic, boolean suppressPositionProjection, @Nullable Object manifest, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
        this.d = presentationStartTimeMs;
        this.e = windowStartTimeMs;
        this.f = elapsedRealtimeEpochOffsetMs;
        this.g = periodDurationUs;
        this.h = windowDurationUs;
        this.i = windowPositionInPeriodUs;
        this.j = windowDefaultStartPositionUs;
        this.k = isSeekable;
        this.l = isDynamic;
        this.m = suppressPositionProjection;
        this.n = manifest;
        this.o = (MediaItem) Assertions.checkNotNull(mediaItem);
        this.p = liveConfiguration;
    }
}
