package com.google.android.exoplayer2.source;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MaskingMediaSource extends CompositeMediaSource<Void> {
    private final MediaSource j;
    private final boolean k;
    private final Timeline.Window l;
    private final Timeline.Period m;
    private a n;

    @Nullable
    private MaskingMediaPeriod o;
    private boolean p;
    private boolean q;
    private boolean r;

    @VisibleForTesting
    public static final class PlaceholderTimeline extends Timeline {
        private final MediaItem d;

        public PlaceholderTimeline(MediaItem mediaItem) {
            this.d = mediaItem;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object uid) {
            return uid == a.f ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int periodIndex, Timeline.Period period, boolean setIds) {
            period.set(setIds ? 0 : null, setIds ? a.f : null, 0, C.TIME_UNSET, 0L, AdPlaybackState.NONE, true);
            return period;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int periodIndex) {
            return a.f;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int windowIndex, Timeline.Window window, long defaultPositionProjectionUs) {
            window.set(Timeline.Window.SINGLE_WINDOW_UID, this.d, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
            window.isPlaceholder = true;
            return window;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return 1;
        }
    }

    public static final class a extends ForwardingTimeline {
        public static final Object f = new Object();

        @Nullable
        private final Object d;

        @Nullable
        private final Object e;

        private a(Timeline timeline, @Nullable Object replacedInternalWindowUid, @Nullable Object replacedInternalPeriodUid) {
            super(timeline);
            this.d = replacedInternalWindowUid;
            this.e = replacedInternalPeriodUid;
        }

        public static a h(MediaItem mediaItem) {
            return new a(new PlaceholderTimeline(mediaItem), Timeline.Window.SINGLE_WINDOW_UID, f);
        }

        public static a i(Timeline timeline, @Nullable Object firstWindowUid, @Nullable Object firstPeriodUid) {
            return new a(timeline, firstWindowUid, firstPeriodUid);
        }

        public a g(Timeline timeline) {
            return new a(timeline, this.d, this.e);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object uid) {
            Object obj;
            Timeline timeline = this.timeline;
            if (f.equals(uid) && (obj = this.e) != null) {
                uid = obj;
            }
            return timeline.getIndexOfPeriod(uid);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int periodIndex, Timeline.Period period, boolean setIds) {
            this.timeline.getPeriod(periodIndex, period, setIds);
            if (Util.areEqual(period.uid, this.e) && setIds) {
                period.uid = f;
            }
            return period;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int periodIndex) {
            Object uidOfPeriod = this.timeline.getUidOfPeriod(periodIndex);
            return Util.areEqual(uidOfPeriod, this.e) ? f : uidOfPeriod;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int windowIndex, Timeline.Window window, long defaultPositionProjectionUs) {
            this.timeline.getWindow(windowIndex, window, defaultPositionProjectionUs);
            if (Util.areEqual(window.uid, this.d)) {
                window.uid = Timeline.Window.SINGLE_WINDOW_UID;
            }
            return window;
        }

        public Timeline j() {
            return this.timeline;
        }
    }

    public MaskingMediaSource(MediaSource mediaSource, boolean useLazyPreparation) {
        this.j = mediaSource;
        this.k = useLazyPreparation && mediaSource.isSingleWindow();
        this.l = new Timeline.Window();
        this.m = new Timeline.Period();
        Timeline initialTimeline = mediaSource.getInitialTimeline();
        if (initialTimeline == null) {
            this.n = a.h(mediaSource.getMediaItem());
        } else {
            this.n = a.i(initialTimeline, null, null);
            this.r = true;
        }
    }

    private Object c(Object internalPeriodUid) {
        return (this.n.e == null || !this.n.e.equals(internalPeriodUid)) ? internalPeriodUid : a.f;
    }

    private Object d(Object externalPeriodUid) {
        return (this.n.e == null || !externalPeriodUid.equals(a.f)) ? externalPeriodUid : this.n.e;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private void e(long preparePositionOverrideUs) {
        MaskingMediaPeriod maskingMediaPeriod = this.o;
        int indexOfPeriod = this.n.getIndexOfPeriod(maskingMediaPeriod.id.periodUid);
        if (indexOfPeriod == -1) {
            return;
        }
        long j = this.n.getPeriod(indexOfPeriod, this.m).durationUs;
        if (j != C.TIME_UNSET && preparePositionOverrideUs >= j) {
            preparePositionOverrideUs = Math.max(0L, j - 1);
        }
        maskingMediaPeriod.overridePreparePositionUs(preparePositionOverrideUs);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.j.getMediaItem();
    }

    public Timeline getTimeline() {
        return this.n;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
        super.prepareSourceInternal(mediaTransferListener);
        if (this.k) {
            return;
        }
        this.p = true;
        prepareChildSource(null, this.j);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((MaskingMediaPeriod) mediaPeriod).releasePeriod();
        if (mediaPeriod == this.o) {
            this.o = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.q = false;
        this.p = false;
        super.releaseSourceInternal();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MaskingMediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
        MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(id, allocator, startPositionUs);
        maskingMediaPeriod.setMediaSource(this.j);
        if (this.q) {
            maskingMediaPeriod.createPeriod(id.copyWithPeriodUid(d(id.periodUid)));
        } else {
            this.o = maskingMediaPeriod;
            if (!this.p) {
                this.p = true;
                prepareChildSource(null, this.j);
            }
        }
        return maskingMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Void id, MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId.copyWithPeriodUid(c(mediaPeriodId.periodUid));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void b(Void id, MediaSource mediaSource, Timeline newTimeline) {
        long j;
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid;
        if (this.q) {
            this.n = this.n.g(newTimeline);
            MaskingMediaPeriod maskingMediaPeriod = this.o;
            if (maskingMediaPeriod != null) {
                e(maskingMediaPeriod.getPreparePositionOverrideUs());
            }
        } else {
            if (!newTimeline.isEmpty()) {
                newTimeline.getWindow(0, this.l);
                long defaultPositionUs = this.l.getDefaultPositionUs();
                Object obj = this.l.uid;
                MaskingMediaPeriod maskingMediaPeriod2 = this.o;
                if (maskingMediaPeriod2 != null) {
                    long preparePositionUs = maskingMediaPeriod2.getPreparePositionUs();
                    this.n.getPeriodByUid(this.o.id.periodUid, this.m);
                    long positionInWindowUs = this.m.getPositionInWindowUs() + preparePositionUs;
                    if (positionInWindowUs != this.n.getWindow(0, this.l).getDefaultPositionUs()) {
                        j = positionInWindowUs;
                    } else {
                        j = defaultPositionUs;
                    }
                } else {
                    j = defaultPositionUs;
                }
                Pair<Object, Long> periodPosition = newTimeline.getPeriodPosition(this.l, this.m, 0, j);
                Object obj2 = periodPosition.first;
                long jLongValue = ((Long) periodPosition.second).longValue();
                this.n = this.r ? this.n.g(newTimeline) : a.i(newTimeline, obj, obj2);
                MaskingMediaPeriod maskingMediaPeriod3 = this.o;
                if (maskingMediaPeriod3 != null) {
                    e(jLongValue);
                    MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod3.id;
                    mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(d(mediaPeriodId.periodUid));
                }
                this.r = true;
                this.q = true;
                refreshSourceInfo(this.n);
                if (mediaPeriodIdCopyWithPeriodUid != null) {
                    ((MaskingMediaPeriod) Assertions.checkNotNull(this.o)).createPeriod(mediaPeriodIdCopyWithPeriodUid);
                }
            }
            this.n = this.r ? this.n.g(newTimeline) : a.i(newTimeline, Timeline.Window.SINGLE_WINDOW_UID, a.f);
        }
        mediaPeriodIdCopyWithPeriodUid = null;
        this.r = true;
        this.q = true;
        refreshSourceInfo(this.n);
        if (mediaPeriodIdCopyWithPeriodUid != null) {
            ((MaskingMediaPeriod) Assertions.checkNotNull(this.o)).createPeriod(mediaPeriodIdCopyWithPeriodUid);
        }
    }
}
