package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ForwardingTimeline extends Timeline {
    protected final Timeline timeline;

    public ForwardingTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getFirstWindowIndex(boolean z14) {
        return this.timeline.getFirstWindowIndex(z14);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getIndexOfPeriod(Object obj) {
        return this.timeline.getIndexOfPeriod(obj);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getLastWindowIndex(boolean z14) {
        return this.timeline.getLastWindowIndex(z14);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getNextWindowIndex(int i14, int i15, boolean z14) {
        return this.timeline.getNextWindowIndex(i14, i15, z14);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Period getPeriod(int i14, Timeline.Period period, boolean z14) {
        return this.timeline.getPeriod(i14, period, z14);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
        return this.timeline.getPeriodCount();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPreviousWindowIndex(int i14, int i15, boolean z14) {
        return this.timeline.getPreviousWindowIndex(i14, i15, z14);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Object getUidOfPeriod(int i14) {
        return this.timeline.getUidOfPeriod(i14);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Window getWindow(int i14, Timeline.Window window, long j8) {
        return this.timeline.getWindow(i14, window, j8);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
        return this.timeline.getWindowCount();
    }
}
