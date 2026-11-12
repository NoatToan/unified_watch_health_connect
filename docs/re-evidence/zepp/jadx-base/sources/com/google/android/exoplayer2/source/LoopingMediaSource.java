package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class LoopingMediaSource extends CompositeMediaSource<Void> {
    private final MaskingMediaSource j;
    private final int k;
    private final Map<MediaSource.MediaPeriodId, MediaSource.MediaPeriodId> l;
    private final Map<MediaPeriod, MediaSource.MediaPeriodId> m;

    public static final class a extends ForwardingTimeline {
        public a(Timeline timeline) {
            super(timeline);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public int getNextWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
            int nextWindowIndex = this.timeline.getNextWindowIndex(windowIndex, repeatMode, shuffleModeEnabled);
            return nextWindowIndex == -1 ? getFirstWindowIndex(shuffleModeEnabled) : nextWindowIndex;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public int getPreviousWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
            int previousWindowIndex = this.timeline.getPreviousWindowIndex(windowIndex, repeatMode, shuffleModeEnabled);
            return previousWindowIndex == -1 ? getLastWindowIndex(shuffleModeEnabled) : previousWindowIndex;
        }
    }

    public static final class b extends AbstractConcatenatedTimeline {
        private final Timeline g;
        private final int h;
        private final int i;
        private final int j;

        public b(Timeline childTimeline, int loopCount) {
            super(false, new ShuffleOrder.UnshuffledShuffleOrder(loopCount));
            this.g = childTimeline;
            int periodCount = childTimeline.getPeriodCount();
            this.h = periodCount;
            this.i = childTimeline.getWindowCount();
            this.j = loopCount;
            if (periodCount > 0) {
                Assertions.checkState(loopCount <= Integer.MAX_VALUE / periodCount, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getChildIndexByChildUid(Object childUid) {
            if (childUid instanceof Integer) {
                return ((Integer) childUid).intValue();
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getChildIndexByPeriodIndex(int periodIndex) {
            return periodIndex / this.h;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getChildIndexByWindowIndex(int windowIndex) {
            return windowIndex / this.i;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public Object getChildUidByChildIndex(int childIndex) {
            return Integer.valueOf(childIndex);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getFirstPeriodIndexByChildIndex(int childIndex) {
            return childIndex * this.h;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getFirstWindowIndexByChildIndex(int childIndex) {
            return childIndex * this.i;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return this.h * this.j;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public Timeline getTimelineByChildIndex(int childIndex) {
            return this.g;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return this.i * this.j;
        }
    }

    public LoopingMediaSource(MediaSource childSource) {
        this(childSource, Integer.MAX_VALUE);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
        if (this.k == Integer.MAX_VALUE) {
            return this.j.createPeriod(id, allocator, startPositionUs);
        }
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = id.copyWithPeriodUid(AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(id.periodUid));
        this.l.put(mediaPeriodIdCopyWithPeriodUid, id);
        MaskingMediaPeriod maskingMediaPeriodCreatePeriod = this.j.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, startPositionUs);
        this.m.put(maskingMediaPeriodCreatePeriod, mediaPeriodIdCopyWithPeriodUid);
        return maskingMediaPeriodCreatePeriod;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    @Nullable
    public Timeline getInitialTimeline() {
        return this.k != Integer.MAX_VALUE ? new b(this.j.getTimeline(), this.k) : new a(this.j.getTimeline());
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.j.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public boolean isSingleWindow() {
        return false;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
        super.prepareSourceInternal(mediaTransferListener);
        prepareChildSource(null, this.j);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        this.j.releasePeriod(mediaPeriod);
        MediaSource.MediaPeriodId mediaPeriodIdRemove = this.m.remove(mediaPeriod);
        if (mediaPeriodIdRemove != null) {
            this.l.remove(mediaPeriodIdRemove);
        }
    }

    public LoopingMediaSource(MediaSource childSource, int loopCount) {
        Assertions.checkArgument(loopCount > 0);
        this.j = new MaskingMediaSource(childSource, false);
        this.k = loopCount;
        this.l = new HashMap();
        this.m = new HashMap();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Void id, MediaSource.MediaPeriodId mediaPeriodId) {
        return this.k != Integer.MAX_VALUE ? this.l.get(mediaPeriodId) : mediaPeriodId;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void b(Void id, MediaSource mediaSource, Timeline timeline) {
        refreshSourceInfo(this.k != Integer.MAX_VALUE ? new b(timeline, this.k) : new a(timeline));
    }
}
