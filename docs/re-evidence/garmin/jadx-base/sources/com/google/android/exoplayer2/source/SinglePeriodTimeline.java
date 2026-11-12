package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes14.dex */
public final class SinglePeriodTimeline extends Timeline {
    private final long elapsedRealtimeEpochOffsetMs;
    private final boolean isDynamic;
    private final boolean isSeekable;
    private final MediaItem.LiveConfiguration liveConfiguration;
    private final Object manifest;
    private final MediaItem mediaItem;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;
    private final boolean suppressPositionProjection;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;
    private static final Object UID = new Object();
    private static final MediaItem MEDIA_ITEM = new MediaItem.Builder().setMediaId("SinglePeriodTimeline").setUri(Uri.EMPTY).build();

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public SinglePeriodTimeline(long j8, long j14, long j15, long j16, long j17, long j18, long j19, boolean z14, boolean z15, boolean z16, Object obj, Object obj2) {
        MediaItem mediaItem = MEDIA_ITEM;
        this(j8, j14, j15, j16, j17, j18, j19, z14, z15, false, obj, mediaItem.buildUpon().setTag(obj2).build(), z16 ? mediaItem.liveConfiguration : null);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getIndexOfPeriod(Object obj) {
        return UID.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Period getPeriod(int i14, Timeline.Period period, boolean z14) {
        Assertions.checkIndex(i14, 0, 1);
        return period.set(null, z14 ? UID : null, 0, this.periodDurationUs, -this.windowPositionInPeriodUs);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Object getUidOfPeriod(int i14) {
        Assertions.checkIndex(i14, 0, 1);
        return UID;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Window getWindow(int i14, Timeline.Window window, long j8) {
        long j14;
        Assertions.checkIndex(i14, 0, 1);
        long j15 = this.windowDefaultStartPositionUs;
        boolean z14 = this.isDynamic;
        if (!z14 || this.suppressPositionProjection || j8 == 0) {
            j14 = j15;
        } else {
            long j16 = this.windowDurationUs;
            if (j16 != C.TIME_UNSET) {
                j15 += j8;
                if (j15 <= j16) {
                    j14 = j15;
                }
            }
            j14 = -9223372036854775807L;
        }
        return window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, z14, this.liveConfiguration, j14, this.windowDurationUs, 0, 0, this.windowPositionInPeriodUs);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
        return 1;
    }

    public SinglePeriodTimeline(long j8, boolean z14, boolean z15, boolean z16, Object obj, MediaItem mediaItem) {
        this(j8, j8, 0L, 0L, z14, z15, z16, obj, mediaItem);
    }

    @Deprecated
    public SinglePeriodTimeline(long j8, long j14, long j15, long j16, boolean z14, boolean z15, boolean z16, Object obj, Object obj2) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j8, j14, j15, j16, z14, z15, z16, obj, obj2);
    }

    public SinglePeriodTimeline(long j8, long j14, long j15, long j16, boolean z14, boolean z15, boolean z16, Object obj, MediaItem mediaItem) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j8, j14, j15, j16, z14, z15, false, obj, mediaItem, z16 ? mediaItem.liveConfiguration : null);
    }

    @Deprecated
    public SinglePeriodTimeline(long j8, boolean z14, boolean z15, boolean z16, Object obj, Object obj2) {
        this(j8, j8, 0L, 0L, z14, z15, z16, obj, obj2);
    }

    @Deprecated
    public SinglePeriodTimeline(long j8, long j14, long j15, long j16, long j17, long j18, long j19, boolean z14, boolean z15, Object obj, MediaItem mediaItem, MediaItem.LiveConfiguration liveConfiguration) {
        this(j8, j14, j15, j16, j17, j18, j19, z14, z15, false, obj, mediaItem, liveConfiguration);
    }

    public SinglePeriodTimeline(long j8, long j14, long j15, long j16, long j17, long j18, long j19, boolean z14, boolean z15, boolean z16, Object obj, MediaItem mediaItem, MediaItem.LiveConfiguration liveConfiguration) {
        this.presentationStartTimeMs = j8;
        this.windowStartTimeMs = j14;
        this.elapsedRealtimeEpochOffsetMs = j15;
        this.periodDurationUs = j16;
        this.windowDurationUs = j17;
        this.windowPositionInPeriodUs = j18;
        this.windowDefaultStartPositionUs = j19;
        this.isSeekable = z14;
        this.isDynamic = z15;
        this.suppressPositionProjection = z16;
        this.manifest = obj;
        this.mediaItem = (MediaItem) Assertions.checkNotNull(mediaItem);
        this.liveConfiguration = liveConfiguration;
    }
}
