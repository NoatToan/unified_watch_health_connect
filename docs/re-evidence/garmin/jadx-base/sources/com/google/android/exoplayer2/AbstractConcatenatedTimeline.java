package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractConcatenatedTimeline extends Timeline {
    private final int childCount;
    private final boolean isAtomic;
    private final ShuffleOrder shuffleOrder;

    public AbstractConcatenatedTimeline(boolean z14, ShuffleOrder shuffleOrder) {
        this.isAtomic = z14;
        this.shuffleOrder = shuffleOrder;
        this.childCount = shuffleOrder.getLength();
    }

    public static Object getChildPeriodUidFromConcatenatedUid(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object getChildTimelineUidFromConcatenatedUid(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object getConcatenatedUid(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int getNextChildIndex(int i14, boolean z14) {
        if (z14) {
            return this.shuffleOrder.getNextIndex(i14);
        }
        if (i14 < this.childCount - 1) {
            return i14 + 1;
        }
        return -1;
    }

    private int getPreviousChildIndex(int i14, boolean z14) {
        if (z14) {
            return this.shuffleOrder.getPreviousIndex(i14);
        }
        if (i14 > 0) {
            return i14 - 1;
        }
        return -1;
    }

    public abstract int getChildIndexByChildUid(Object obj);

    public abstract int getChildIndexByPeriodIndex(int i14);

    public abstract int getChildIndexByWindowIndex(int i14);

    public abstract Object getChildUidByChildIndex(int i14);

    public abstract int getFirstPeriodIndexByChildIndex(int i14);

    @Override // com.google.android.exoplayer2.Timeline
    public int getFirstWindowIndex(boolean z14) {
        if (this.childCount == 0) {
            return -1;
        }
        if (this.isAtomic) {
            z14 = false;
        }
        int firstIndex = z14 ? this.shuffleOrder.getFirstIndex() : 0;
        while (getTimelineByChildIndex(firstIndex).isEmpty()) {
            firstIndex = getNextChildIndex(firstIndex, z14);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return getTimelineByChildIndex(firstIndex).getFirstWindowIndex(z14) + getFirstWindowIndexByChildIndex(firstIndex);
    }

    public abstract int getFirstWindowIndexByChildIndex(int i14);

    @Override // com.google.android.exoplayer2.Timeline
    public final int getIndexOfPeriod(Object obj) {
        int indexOfPeriod;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int childIndexByChildUid = getChildIndexByChildUid(childTimelineUidFromConcatenatedUid);
        if (childIndexByChildUid == -1 || (indexOfPeriod = getTimelineByChildIndex(childIndexByChildUid).getIndexOfPeriod(childPeriodUidFromConcatenatedUid)) == -1) {
            return -1;
        }
        return getFirstPeriodIndexByChildIndex(childIndexByChildUid) + indexOfPeriod;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getLastWindowIndex(boolean z14) {
        int i14 = this.childCount;
        if (i14 == 0) {
            return -1;
        }
        if (this.isAtomic) {
            z14 = false;
        }
        int lastIndex = z14 ? this.shuffleOrder.getLastIndex() : i14 - 1;
        while (getTimelineByChildIndex(lastIndex).isEmpty()) {
            lastIndex = getPreviousChildIndex(lastIndex, z14);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return getTimelineByChildIndex(lastIndex).getLastWindowIndex(z14) + getFirstWindowIndexByChildIndex(lastIndex);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getNextWindowIndex(int i14, int i15, boolean z14) {
        if (this.isAtomic) {
            if (i15 == 1) {
                i15 = 2;
            }
            z14 = false;
        }
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i14);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int nextWindowIndex = getTimelineByChildIndex(childIndexByWindowIndex).getNextWindowIndex(i14 - firstWindowIndexByChildIndex, i15 != 2 ? i15 : 0, z14);
        if (nextWindowIndex != -1) {
            return firstWindowIndexByChildIndex + nextWindowIndex;
        }
        int nextChildIndex = getNextChildIndex(childIndexByWindowIndex, z14);
        while (nextChildIndex != -1 && getTimelineByChildIndex(nextChildIndex).isEmpty()) {
            nextChildIndex = getNextChildIndex(nextChildIndex, z14);
        }
        if (nextChildIndex != -1) {
            return getTimelineByChildIndex(nextChildIndex).getFirstWindowIndex(z14) + getFirstWindowIndexByChildIndex(nextChildIndex);
        }
        if (i15 == 2) {
            return getFirstWindowIndex(z14);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Period getPeriod(int i14, Timeline.Period period, boolean z14) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i14);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByPeriodIndex);
        getTimelineByChildIndex(childIndexByPeriodIndex).getPeriod(i14 - getFirstPeriodIndexByChildIndex(childIndexByPeriodIndex), period, z14);
        period.windowIndex += firstWindowIndexByChildIndex;
        if (z14) {
            period.uid = getConcatenatedUid(getChildUidByChildIndex(childIndexByPeriodIndex), Assertions.checkNotNull(period.uid));
        }
        return period;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int childIndexByChildUid = getChildIndexByChildUid(childTimelineUidFromConcatenatedUid);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByChildUid);
        getTimelineByChildIndex(childIndexByChildUid).getPeriodByUid(childPeriodUidFromConcatenatedUid, period);
        period.windowIndex += firstWindowIndexByChildIndex;
        period.uid = obj;
        return period;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPreviousWindowIndex(int i14, int i15, boolean z14) {
        if (this.isAtomic) {
            if (i15 == 1) {
                i15 = 2;
            }
            z14 = false;
        }
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i14);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int previousWindowIndex = getTimelineByChildIndex(childIndexByWindowIndex).getPreviousWindowIndex(i14 - firstWindowIndexByChildIndex, i15 != 2 ? i15 : 0, z14);
        if (previousWindowIndex != -1) {
            return firstWindowIndexByChildIndex + previousWindowIndex;
        }
        int previousChildIndex = getPreviousChildIndex(childIndexByWindowIndex, z14);
        while (previousChildIndex != -1 && getTimelineByChildIndex(previousChildIndex).isEmpty()) {
            previousChildIndex = getPreviousChildIndex(previousChildIndex, z14);
        }
        if (previousChildIndex != -1) {
            return getTimelineByChildIndex(previousChildIndex).getLastWindowIndex(z14) + getFirstWindowIndexByChildIndex(previousChildIndex);
        }
        if (i15 == 2) {
            return getLastWindowIndex(z14);
        }
        return -1;
    }

    public abstract Timeline getTimelineByChildIndex(int i14);

    @Override // com.google.android.exoplayer2.Timeline
    public final Object getUidOfPeriod(int i14) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i14);
        return getConcatenatedUid(getChildUidByChildIndex(childIndexByPeriodIndex), getTimelineByChildIndex(childIndexByPeriodIndex).getUidOfPeriod(i14 - getFirstPeriodIndexByChildIndex(childIndexByPeriodIndex)));
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Window getWindow(int i14, Timeline.Window window, long j8) {
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i14);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int firstPeriodIndexByChildIndex = getFirstPeriodIndexByChildIndex(childIndexByWindowIndex);
        getTimelineByChildIndex(childIndexByWindowIndex).getWindow(i14 - firstWindowIndexByChildIndex, window, j8);
        Object childUidByChildIndex = getChildUidByChildIndex(childIndexByWindowIndex);
        if (!Timeline.Window.SINGLE_WINDOW_UID.equals(window.uid)) {
            childUidByChildIndex = getConcatenatedUid(childUidByChildIndex, window.uid);
        }
        window.uid = childUidByChildIndex;
        window.firstPeriodIndex += firstPeriodIndexByChildIndex;
        window.lastPeriodIndex += firstPeriodIndexByChildIndex;
        return window;
    }
}
