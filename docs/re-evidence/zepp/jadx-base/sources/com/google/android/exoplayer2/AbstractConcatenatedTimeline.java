package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractConcatenatedTimeline extends Timeline {
    private final int d;
    private final ShuffleOrder e;
    private final boolean f;

    public AbstractConcatenatedTimeline(boolean isAtomic, ShuffleOrder shuffleOrder) {
        this.f = isAtomic;
        this.e = shuffleOrder;
        this.d = shuffleOrder.getLength();
    }

    private int f(int childIndex, boolean shuffleModeEnabled) {
        if (shuffleModeEnabled) {
            return this.e.getNextIndex(childIndex);
        }
        if (childIndex < this.d - 1) {
            return childIndex + 1;
        }
        return -1;
    }

    private int g(int childIndex, boolean shuffleModeEnabled) {
        if (shuffleModeEnabled) {
            return this.e.getPreviousIndex(childIndex);
        }
        if (childIndex > 0) {
            return childIndex - 1;
        }
        return -1;
    }

    public static Object getChildPeriodUidFromConcatenatedUid(Object concatenatedUid) {
        return ((Pair) concatenatedUid).second;
    }

    public static Object getChildTimelineUidFromConcatenatedUid(Object concatenatedUid) {
        return ((Pair) concatenatedUid).first;
    }

    public static Object getConcatenatedUid(Object childTimelineUid, Object childPeriodOrWindowUid) {
        return Pair.create(childTimelineUid, childPeriodOrWindowUid);
    }

    public abstract int getChildIndexByChildUid(Object childUid);

    public abstract int getChildIndexByPeriodIndex(int periodIndex);

    public abstract int getChildIndexByWindowIndex(int windowIndex);

    public abstract Object getChildUidByChildIndex(int childIndex);

    public abstract int getFirstPeriodIndexByChildIndex(int childIndex);

    @Override // com.google.android.exoplayer2.Timeline
    public int getFirstWindowIndex(boolean shuffleModeEnabled) {
        if (this.d == 0) {
            return -1;
        }
        if (this.f) {
            shuffleModeEnabled = false;
        }
        int firstIndex = shuffleModeEnabled ? this.e.getFirstIndex() : 0;
        while (getTimelineByChildIndex(firstIndex).isEmpty()) {
            firstIndex = f(firstIndex, shuffleModeEnabled);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return getFirstWindowIndexByChildIndex(firstIndex) + getTimelineByChildIndex(firstIndex).getFirstWindowIndex(shuffleModeEnabled);
    }

    public abstract int getFirstWindowIndexByChildIndex(int childIndex);

    @Override // com.google.android.exoplayer2.Timeline
    public final int getIndexOfPeriod(Object uid) {
        int indexOfPeriod;
        if (!(uid instanceof Pair)) {
            return -1;
        }
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(uid);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(uid);
        int childIndexByChildUid = getChildIndexByChildUid(childTimelineUidFromConcatenatedUid);
        if (childIndexByChildUid == -1 || (indexOfPeriod = getTimelineByChildIndex(childIndexByChildUid).getIndexOfPeriod(childPeriodUidFromConcatenatedUid)) == -1) {
            return -1;
        }
        return getFirstPeriodIndexByChildIndex(childIndexByChildUid) + indexOfPeriod;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getLastWindowIndex(boolean shuffleModeEnabled) {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        if (this.f) {
            shuffleModeEnabled = false;
        }
        int lastIndex = shuffleModeEnabled ? this.e.getLastIndex() : i - 1;
        while (getTimelineByChildIndex(lastIndex).isEmpty()) {
            lastIndex = g(lastIndex, shuffleModeEnabled);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return getFirstWindowIndexByChildIndex(lastIndex) + getTimelineByChildIndex(lastIndex).getLastWindowIndex(shuffleModeEnabled);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getNextWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
        if (this.f) {
            if (repeatMode == 1) {
                repeatMode = 2;
            }
            shuffleModeEnabled = false;
        }
        int childIndexByWindowIndex = getChildIndexByWindowIndex(windowIndex);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int nextWindowIndex = getTimelineByChildIndex(childIndexByWindowIndex).getNextWindowIndex(windowIndex - firstWindowIndexByChildIndex, repeatMode != 2 ? repeatMode : 0, shuffleModeEnabled);
        if (nextWindowIndex != -1) {
            return firstWindowIndexByChildIndex + nextWindowIndex;
        }
        int iF = f(childIndexByWindowIndex, shuffleModeEnabled);
        while (iF != -1 && getTimelineByChildIndex(iF).isEmpty()) {
            iF = f(iF, shuffleModeEnabled);
        }
        if (iF != -1) {
            return getFirstWindowIndexByChildIndex(iF) + getTimelineByChildIndex(iF).getFirstWindowIndex(shuffleModeEnabled);
        }
        if (repeatMode == 2) {
            return getFirstWindowIndex(shuffleModeEnabled);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Period getPeriod(int periodIndex, Timeline.Period period, boolean setIds) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(periodIndex);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByPeriodIndex);
        getTimelineByChildIndex(childIndexByPeriodIndex).getPeriod(periodIndex - getFirstPeriodIndexByChildIndex(childIndexByPeriodIndex), period, setIds);
        period.windowIndex += firstWindowIndexByChildIndex;
        if (setIds) {
            period.uid = getConcatenatedUid(getChildUidByChildIndex(childIndexByPeriodIndex), Assertions.checkNotNull(period.uid));
        }
        return period;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Period getPeriodByUid(Object periodUid, Timeline.Period period) {
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(periodUid);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(periodUid);
        int childIndexByChildUid = getChildIndexByChildUid(childTimelineUidFromConcatenatedUid);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByChildUid);
        getTimelineByChildIndex(childIndexByChildUid).getPeriodByUid(childPeriodUidFromConcatenatedUid, period);
        period.windowIndex += firstWindowIndexByChildIndex;
        period.uid = periodUid;
        return period;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPreviousWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
        if (this.f) {
            if (repeatMode == 1) {
                repeatMode = 2;
            }
            shuffleModeEnabled = false;
        }
        int childIndexByWindowIndex = getChildIndexByWindowIndex(windowIndex);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int previousWindowIndex = getTimelineByChildIndex(childIndexByWindowIndex).getPreviousWindowIndex(windowIndex - firstWindowIndexByChildIndex, repeatMode != 2 ? repeatMode : 0, shuffleModeEnabled);
        if (previousWindowIndex != -1) {
            return firstWindowIndexByChildIndex + previousWindowIndex;
        }
        int iG = g(childIndexByWindowIndex, shuffleModeEnabled);
        while (iG != -1 && getTimelineByChildIndex(iG).isEmpty()) {
            iG = g(iG, shuffleModeEnabled);
        }
        if (iG != -1) {
            return getFirstWindowIndexByChildIndex(iG) + getTimelineByChildIndex(iG).getLastWindowIndex(shuffleModeEnabled);
        }
        if (repeatMode == 2) {
            return getLastWindowIndex(shuffleModeEnabled);
        }
        return -1;
    }

    public abstract Timeline getTimelineByChildIndex(int childIndex);

    @Override // com.google.android.exoplayer2.Timeline
    public final Object getUidOfPeriod(int periodIndex) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(periodIndex);
        return getConcatenatedUid(getChildUidByChildIndex(childIndexByPeriodIndex), getTimelineByChildIndex(childIndexByPeriodIndex).getUidOfPeriod(periodIndex - getFirstPeriodIndexByChildIndex(childIndexByPeriodIndex)));
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Window getWindow(int windowIndex, Timeline.Window window, long defaultPositionProjectionUs) {
        int childIndexByWindowIndex = getChildIndexByWindowIndex(windowIndex);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int firstPeriodIndexByChildIndex = getFirstPeriodIndexByChildIndex(childIndexByWindowIndex);
        getTimelineByChildIndex(childIndexByWindowIndex).getWindow(windowIndex - firstWindowIndexByChildIndex, window, defaultPositionProjectionUs);
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
