package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class o0 extends AbstractConcatenatedTimeline {
    private final int g;
    private final int h;
    private final int[] i;
    private final int[] j;
    private final Timeline[] k;
    private final Object[] l;
    private final HashMap<Object, Integer> m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Collection<? extends j0> mediaSourceInfoHolders, ShuffleOrder shuffleOrder) {
        super(false, shuffleOrder);
        int windowCount = 0;
        int size = mediaSourceInfoHolders.size();
        this.i = new int[size];
        this.j = new int[size];
        this.k = new Timeline[size];
        this.l = new Object[size];
        this.m = new HashMap<>();
        int periodCount = 0;
        int i = 0;
        for (j0 j0Var : mediaSourceInfoHolders) {
            this.k[i] = j0Var.a();
            this.j[i] = windowCount;
            this.i[i] = periodCount;
            windowCount += this.k[i].getWindowCount();
            periodCount += this.k[i].getPeriodCount();
            this.l[i] = j0Var.getUid();
            this.m.put(this.l[i], Integer.valueOf(i));
            i++;
        }
        this.g = windowCount;
        this.h = periodCount;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public int getChildIndexByChildUid(Object childUid) {
        Integer num = this.m.get(childUid);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public int getChildIndexByPeriodIndex(int periodIndex) {
        return Util.binarySearchFloor(this.i, periodIndex + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public int getChildIndexByWindowIndex(int windowIndex) {
        return Util.binarySearchFloor(this.j, windowIndex + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public Object getChildUidByChildIndex(int childIndex) {
        return this.l[childIndex];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public int getFirstPeriodIndexByChildIndex(int childIndex) {
        return this.i[childIndex];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public int getFirstWindowIndexByChildIndex(int childIndex) {
        return this.j[childIndex];
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
        return this.h;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public Timeline getTimelineByChildIndex(int childIndex) {
        return this.k[childIndex];
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
        return this.g;
    }

    public List<Timeline> h() {
        return Arrays.asList(this.k);
    }
}
