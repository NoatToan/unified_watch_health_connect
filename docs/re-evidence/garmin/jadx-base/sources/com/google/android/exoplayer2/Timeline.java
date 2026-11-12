package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.InlineMe;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Timeline implements Bundleable {
    private static final int FIELD_PERIODS = 1;
    private static final int FIELD_SHUFFLED_WINDOW_INDICES = 2;
    private static final int FIELD_WINDOWS = 0;
    public static final Timeline EMPTY = new Timeline() { // from class: com.google.android.exoplayer2.Timeline.1
        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Period getPeriod(int i14, Period period, boolean z14) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i14) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Window getWindow(int i14, Window window, long j8) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return 0;
        }
    };
    public static final Bundleable.Creator<Timeline> CREATOR = new v(24);

    public static final class RemotableTimeline extends Timeline {
        private final ImmutableList<Period> periods;
        private final int[] shuffledWindowIndices;
        private final int[] windowIndicesInShuffled;
        private final ImmutableList<Window> windows;

        public RemotableTimeline(ImmutableList<Window> immutableList, ImmutableList<Period> immutableList2, int[] iArr) {
            Assertions.checkArgument(immutableList.size() == iArr.length);
            this.windows = immutableList;
            this.periods = immutableList2;
            this.shuffledWindowIndices = iArr;
            this.windowIndicesInShuffled = new int[iArr.length];
            for (int i14 = 0; i14 < iArr.length; i14++) {
                this.windowIndicesInShuffled[iArr[i14]] = i14;
            }
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getFirstWindowIndex(boolean z14) {
            if (isEmpty()) {
                return -1;
            }
            if (z14) {
                return this.shuffledWindowIndices[0];
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getLastWindowIndex(boolean z14) {
            if (isEmpty()) {
                return -1;
            }
            return z14 ? this.shuffledWindowIndices[getWindowCount() - 1] : getWindowCount() - 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getNextWindowIndex(int i14, int i15, boolean z14) {
            if (i15 == 1) {
                return i14;
            }
            if (i14 != getLastWindowIndex(z14)) {
                return z14 ? this.shuffledWindowIndices[this.windowIndicesInShuffled[i14] + 1] : i14 + 1;
            }
            if (i15 == 2) {
                return getFirstWindowIndex(z14);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Period getPeriod(int i14, Period period, boolean z14) {
            Period period2 = this.periods.get(i14);
            period.set(period2.f52879id, period2.uid, period2.windowIndex, period2.durationUs, period2.positionInWindowUs, period2.adPlaybackState, period2.isPlaceholder);
            return period;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return this.periods.size();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPreviousWindowIndex(int i14, int i15, boolean z14) {
            if (i15 == 1) {
                return i14;
            }
            if (i14 != getFirstWindowIndex(z14)) {
                return z14 ? this.shuffledWindowIndices[this.windowIndicesInShuffled[i14] - 1] : i14 - 1;
            }
            if (i15 == 2) {
                return getLastWindowIndex(z14);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i14) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Window getWindow(int i14, Window window, long j8) {
            Window window2 = this.windows.get(i14);
            window.set(window2.uid, window2.mediaItem, window2.manifest, window2.presentationStartTimeMs, window2.windowStartTimeMs, window2.elapsedRealtimeEpochOffsetMs, window2.isSeekable, window2.isDynamic, window2.liveConfiguration, window2.defaultPositionUs, window2.durationUs, window2.firstPeriodIndex, window2.lastPeriodIndex, window2.positionInFirstPeriodUs);
            window.isPlaceholder = window2.isPlaceholder;
            return window;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return this.windows.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Timeline fromBundle(Bundle bundle) {
        ImmutableList immutableListFromBundleListRetriever = fromBundleListRetriever(Window.CREATOR, BundleUtil.getBinder(bundle, keyForField(0)));
        ImmutableList immutableListFromBundleListRetriever2 = fromBundleListRetriever(Period.CREATOR, BundleUtil.getBinder(bundle, keyForField(1)));
        int[] intArray = bundle.getIntArray(keyForField(2));
        if (intArray == null) {
            intArray = generateUnshuffledIndices(immutableListFromBundleListRetriever.size());
        }
        return new RemotableTimeline(immutableListFromBundleListRetriever, immutableListFromBundleListRetriever2, intArray);
    }

    private static <T extends Bundleable> ImmutableList<T> fromBundleListRetriever(Bundleable.Creator<T> creator, IBinder iBinder) {
        if (iBinder == null) {
            return ImmutableList.of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList<Bundle> list = BundleListRetriever.getList(iBinder);
        for (int i14 = 0; i14 < list.size(); i14++) {
            builder.add(creator.fromBundle(list.get(i14)));
        }
        return builder.build();
    }

    private static int[] generateUnshuffledIndices(int i14) {
        int[] iArr = new int[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            iArr[i15] = i15;
        }
        return iArr;
    }

    private static String keyForField(int i14) {
        return Integer.toString(i14, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.getWindowCount() != getWindowCount() || timeline.getPeriodCount() != getPeriodCount()) {
            return false;
        }
        Window window = new Window();
        Period period = new Period();
        Window window2 = new Window();
        Period period2 = new Period();
        for (int i14 = 0; i14 < getWindowCount(); i14++) {
            if (!getWindow(i14, window).equals(timeline.getWindow(i14, window2))) {
                return false;
            }
        }
        for (int i15 = 0; i15 < getPeriodCount(); i15++) {
            if (!getPeriod(i15, period, true).equals(timeline.getPeriod(i15, period2, true))) {
                return false;
            }
        }
        return true;
    }

    public int getFirstWindowIndex(boolean z14) {
        return isEmpty() ? -1 : 0;
    }

    public abstract int getIndexOfPeriod(Object obj);

    public int getLastWindowIndex(boolean z14) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public final int getNextPeriodIndex(int i14, Period period, Window window, int i15, boolean z14) {
        int i16 = getPeriod(i14, period).windowIndex;
        if (getWindow(i16, window).lastPeriodIndex != i14) {
            return i14 + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i16, i15, z14);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, window).firstPeriodIndex;
    }

    public int getNextWindowIndex(int i14, int i15, boolean z14) {
        if (i15 == 0) {
            if (i14 == getLastWindowIndex(z14)) {
                return -1;
            }
            return i14 + 1;
        }
        if (i15 == 1) {
            return i14;
        }
        if (i15 == 2) {
            return i14 == getLastWindowIndex(z14) ? getFirstWindowIndex(z14) : i14 + 1;
        }
        j20.x.h();
        return 0;
    }

    public final Period getPeriod(int i14, Period period) {
        return getPeriod(i14, period, false);
    }

    public abstract Period getPeriod(int i14, Period period, boolean z14);

    public Period getPeriodByUid(Object obj, Period period) {
        return getPeriod(getIndexOfPeriod(obj), period, true);
    }

    public abstract int getPeriodCount();

    @InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int i14, long j8) {
        return getPeriodPositionUs(window, period, i14, j8);
    }

    public final Pair<Object, Long> getPeriodPositionUs(Window window, Period period, int i14, long j8, long j14) {
        Assertions.checkIndex(i14, 0, getWindowCount());
        getWindow(i14, window, j14);
        if (j8 == C.TIME_UNSET) {
            j8 = window.getDefaultPositionUs();
            if (j8 == C.TIME_UNSET) {
                return null;
            }
        }
        int i15 = window.firstPeriodIndex;
        getPeriod(i15, period);
        while (i15 < window.lastPeriodIndex && period.positionInWindowUs != j8) {
            int i16 = i15 + 1;
            if (getPeriod(i16, period).positionInWindowUs > j8) {
                break;
            }
            i15 = i16;
        }
        getPeriod(i15, period, true);
        long jMin = j8 - period.positionInWindowUs;
        long j15 = period.durationUs;
        if (j15 != C.TIME_UNSET) {
            jMin = Math.min(jMin, j15 - 1);
        }
        return Pair.create(Assertions.checkNotNull(period.uid), Long.valueOf(Math.max(0L, jMin)));
    }

    public int getPreviousWindowIndex(int i14, int i15, boolean z14) {
        if (i15 == 0) {
            if (i14 == getFirstWindowIndex(z14)) {
                return -1;
            }
            return i14 - 1;
        }
        if (i15 == 1) {
            return i14;
        }
        if (i15 == 2) {
            return i14 == getFirstWindowIndex(z14) ? getLastWindowIndex(z14) : i14 - 1;
        }
        j20.x.h();
        return 0;
    }

    public abstract Object getUidOfPeriod(int i14);

    public final Window getWindow(int i14, Window window) {
        return getWindow(i14, window, 0L);
    }

    public abstract Window getWindow(int i14, Window window, long j8);

    public abstract int getWindowCount();

    public int hashCode() {
        Window window = new Window();
        Period period = new Period();
        int windowCount = getWindowCount() + 217;
        for (int i14 = 0; i14 < getWindowCount(); i14++) {
            windowCount = (windowCount * 31) + getWindow(i14, window).hashCode();
        }
        int periodCount = getPeriodCount() + (windowCount * 31);
        for (int i15 = 0; i15 < getPeriodCount(); i15++) {
            periodCount = (periodCount * 31) + getPeriod(i15, period, true).hashCode();
        }
        return periodCount;
    }

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public final boolean isLastPeriod(int i14, Period period, Window window, int i15, boolean z14) {
        return getNextPeriodIndex(i14, period, window, i15, z14) == -1;
    }

    public final Bundle toBundle(boolean z14) {
        ArrayList arrayList = new ArrayList();
        int windowCount = getWindowCount();
        Window window = new Window();
        for (int i14 = 0; i14 < windowCount; i14++) {
            arrayList.add(getWindow(i14, window, 0L).toBundle(z14));
        }
        ArrayList arrayList2 = new ArrayList();
        int periodCount = getPeriodCount();
        Period period = new Period();
        for (int i15 = 0; i15 < periodCount; i15++) {
            arrayList2.add(getPeriod(i15, period, false).toBundle());
        }
        int[] iArr = new int[windowCount];
        if (windowCount > 0) {
            iArr[0] = getFirstWindowIndex(true);
        }
        for (int i16 = 1; i16 < windowCount; i16++) {
            iArr[i16] = getNextWindowIndex(iArr[i16 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        BundleUtil.putBinder(bundle, keyForField(0), new BundleListRetriever(arrayList));
        BundleUtil.putBinder(bundle, keyForField(1), new BundleListRetriever(arrayList2));
        bundle.putIntArray(keyForField(2), iArr);
        return bundle;
    }

    @InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int i14, long j8, long j14) {
        return getPeriodPositionUs(window, period, i14, j8, j14);
    }

    public static final class Period implements Bundleable {
        public static final Bundleable.Creator<Period> CREATOR = new v(25);
        private static final int FIELD_AD_PLAYBACK_STATE = 4;
        private static final int FIELD_DURATION_US = 1;
        private static final int FIELD_PLACEHOLDER = 3;
        private static final int FIELD_POSITION_IN_WINDOW_US = 2;
        private static final int FIELD_WINDOW_INDEX = 0;
        private AdPlaybackState adPlaybackState = AdPlaybackState.NONE;
        public long durationUs;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public Object f52879id;
        public boolean isPlaceholder;
        public long positionInWindowUs;
        public Object uid;
        public int windowIndex;

        /* JADX INFO: Access modifiers changed from: private */
        public static Period fromBundle(Bundle bundle) {
            int i14 = bundle.getInt(keyForField(0), 0);
            long j8 = bundle.getLong(keyForField(1), C.TIME_UNSET);
            long j14 = bundle.getLong(keyForField(2), 0L);
            boolean z14 = bundle.getBoolean(keyForField(3));
            Bundle bundle2 = bundle.getBundle(keyForField(4));
            AdPlaybackState adPlaybackState = bundle2 != null ? (AdPlaybackState) AdPlaybackState.CREATOR.fromBundle(bundle2) : AdPlaybackState.NONE;
            Period period = new Period();
            period.set(null, null, i14, j8, j14, adPlaybackState, z14);
            return period;
        }

        private static String keyForField(int i14) {
            return Integer.toString(i14, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Period.class.equals(obj.getClass())) {
                Period period = (Period) obj;
                if (Util.areEqual(this.f52879id, period.f52879id) && Util.areEqual(this.uid, period.uid) && this.windowIndex == period.windowIndex && this.durationUs == period.durationUs && this.positionInWindowUs == period.positionInWindowUs && this.isPlaceholder == period.isPlaceholder && Util.areEqual(this.adPlaybackState, period.adPlaybackState)) {
                    return true;
                }
            }
            return false;
        }

        public int getAdCountInAdGroup(int i14) {
            return this.adPlaybackState.getAdGroup(i14).count;
        }

        public long getAdDurationUs(int i14, int i15) {
            AdPlaybackState.AdGroup adGroup = this.adPlaybackState.getAdGroup(i14);
            return adGroup.count != -1 ? adGroup.durationsUs[i15] : C.TIME_UNSET;
        }

        public int getAdGroupCount() {
            return this.adPlaybackState.adGroupCount;
        }

        public int getAdGroupIndexAfterPositionUs(long j8) {
            return this.adPlaybackState.getAdGroupIndexAfterPositionUs(j8, this.durationUs);
        }

        public int getAdGroupIndexForPositionUs(long j8) {
            return this.adPlaybackState.getAdGroupIndexForPositionUs(j8, this.durationUs);
        }

        public long getAdGroupTimeUs(int i14) {
            return this.adPlaybackState.getAdGroup(i14).timeUs;
        }

        public long getAdResumePositionUs() {
            return this.adPlaybackState.adResumePositionUs;
        }

        public int getAdState(int i14, int i15) {
            AdPlaybackState.AdGroup adGroup = this.adPlaybackState.getAdGroup(i14);
            if (adGroup.count != -1) {
                return adGroup.states[i15];
            }
            return 0;
        }

        public Object getAdsId() {
            return this.adPlaybackState.adsId;
        }

        public long getContentResumeOffsetUs(int i14) {
            return this.adPlaybackState.getAdGroup(i14).contentResumeOffsetUs;
        }

        public long getDurationMs() {
            return Util.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public int getFirstAdIndexToPlay(int i14) {
            return this.adPlaybackState.getAdGroup(i14).getFirstAdIndexToPlay();
        }

        public int getNextAdIndexToPlay(int i14, int i15) {
            return this.adPlaybackState.getAdGroup(i14).getNextAdIndexToPlay(i15);
        }

        public long getPositionInWindowMs() {
            return Util.usToMs(this.positionInWindowUs);
        }

        public long getPositionInWindowUs() {
            return this.positionInWindowUs;
        }

        public int getRemovedAdGroupCount() {
            return this.adPlaybackState.removedAdGroupCount;
        }

        public boolean hasPlayedAdGroup(int i14) {
            return !this.adPlaybackState.getAdGroup(i14).hasUnplayedAds();
        }

        public int hashCode() {
            Object obj = this.f52879id;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.uid;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.windowIndex) * 31;
            long j8 = this.durationUs;
            int i14 = (iHashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
            long j14 = this.positionInWindowUs;
            return this.adPlaybackState.hashCode() + ((((i14 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31);
        }

        public boolean isServerSideInsertedAdGroup(int i14) {
            return this.adPlaybackState.getAdGroup(i14).isServerSideInserted;
        }

        public Period set(Object obj, Object obj2, int i14, long j8, long j14) {
            return set(obj, obj2, i14, j8, j14, AdPlaybackState.NONE, false);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(keyForField(0), this.windowIndex);
            bundle.putLong(keyForField(1), this.durationUs);
            bundle.putLong(keyForField(2), this.positionInWindowUs);
            bundle.putBoolean(keyForField(3), this.isPlaceholder);
            bundle.putBundle(keyForField(4), this.adPlaybackState.toBundle());
            return bundle;
        }

        public Period set(Object obj, Object obj2, int i14, long j8, long j14, AdPlaybackState adPlaybackState, boolean z14) {
            this.f52879id = obj;
            this.uid = obj2;
            this.windowIndex = i14;
            this.durationUs = j8;
            this.positionInWindowUs = j14;
            this.adPlaybackState = adPlaybackState;
            this.isPlaceholder = z14;
            return this;
        }
    }

    public final Pair<Object, Long> getPeriodPositionUs(Window window, Period period, int i14, long j8) {
        return (Pair) Assertions.checkNotNull(getPeriodPositionUs(window, period, i14, j8, 0L));
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public final Bundle toBundle() {
        return toBundle(false);
    }

    public static final class Window implements Bundleable {
        private static final int FIELD_DEFAULT_POSITION_US = 9;
        private static final int FIELD_DURATION_US = 10;
        private static final int FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS = 4;
        private static final int FIELD_FIRST_PERIOD_INDEX = 11;
        private static final int FIELD_IS_DYNAMIC = 6;
        private static final int FIELD_IS_PLACEHOLDER = 8;
        private static final int FIELD_IS_SEEKABLE = 5;
        private static final int FIELD_LAST_PERIOD_INDEX = 12;
        private static final int FIELD_LIVE_CONFIGURATION = 7;
        private static final int FIELD_MEDIA_ITEM = 1;
        private static final int FIELD_POSITION_IN_FIRST_PERIOD_US = 13;
        private static final int FIELD_PRESENTATION_START_TIME_MS = 2;
        private static final int FIELD_WINDOW_START_TIME_MS = 3;
        public long defaultPositionUs;
        public long durationUs;
        public long elapsedRealtimeEpochOffsetMs;
        public int firstPeriodIndex;
        public boolean isDynamic;

        @Deprecated
        public boolean isLive;
        public boolean isPlaceholder;
        public boolean isSeekable;
        public int lastPeriodIndex;
        public MediaItem.LiveConfiguration liveConfiguration;
        public Object manifest;
        public long positionInFirstPeriodUs;
        public long presentationStartTimeMs;

        @Deprecated
        public Object tag;
        public long windowStartTimeMs;
        public static final Object SINGLE_WINDOW_UID = new Object();
        private static final Object FAKE_WINDOW_UID = new Object();
        private static final MediaItem EMPTY_MEDIA_ITEM = new MediaItem.Builder().setMediaId("com.google.android.exoplayer2.Timeline").setUri(Uri.EMPTY).build();
        public static final Bundleable.Creator<Window> CREATOR = new v(26);
        public Object uid = SINGLE_WINDOW_UID;
        public MediaItem mediaItem = EMPTY_MEDIA_ITEM;

        /* JADX INFO: Access modifiers changed from: private */
        public static Window fromBundle(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(keyForField(1));
            MediaItem mediaItem = bundle2 != null ? (MediaItem) MediaItem.CREATOR.fromBundle(bundle2) : null;
            long j8 = bundle.getLong(keyForField(2), C.TIME_UNSET);
            long j14 = bundle.getLong(keyForField(3), C.TIME_UNSET);
            long j15 = bundle.getLong(keyForField(4), C.TIME_UNSET);
            boolean z14 = bundle.getBoolean(keyForField(5), false);
            boolean z15 = bundle.getBoolean(keyForField(6), false);
            Bundle bundle3 = bundle.getBundle(keyForField(7));
            MediaItem.LiveConfiguration liveConfiguration = bundle3 != null ? (MediaItem.LiveConfiguration) MediaItem.LiveConfiguration.CREATOR.fromBundle(bundle3) : null;
            boolean z16 = bundle.getBoolean(keyForField(8), false);
            long j16 = bundle.getLong(keyForField(9), 0L);
            long j17 = bundle.getLong(keyForField(10), C.TIME_UNSET);
            int i14 = bundle.getInt(keyForField(11), 0);
            int i15 = bundle.getInt(keyForField(12), 0);
            long j18 = bundle.getLong(keyForField(13), 0L);
            Window window = new Window();
            window.set(FAKE_WINDOW_UID, mediaItem, null, j8, j14, j15, z14, z15, liveConfiguration, j16, j17, i14, i15, j18);
            window.isPlaceholder = z16;
            return window;
        }

        private static String keyForField(int i14) {
            return Integer.toString(i14, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle toBundle(boolean z14) {
            Bundle bundle = new Bundle();
            bundle.putBundle(keyForField(1), (z14 ? MediaItem.EMPTY : this.mediaItem).toBundle());
            bundle.putLong(keyForField(2), this.presentationStartTimeMs);
            bundle.putLong(keyForField(3), this.windowStartTimeMs);
            bundle.putLong(keyForField(4), this.elapsedRealtimeEpochOffsetMs);
            bundle.putBoolean(keyForField(5), this.isSeekable);
            bundle.putBoolean(keyForField(6), this.isDynamic);
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            if (liveConfiguration != null) {
                bundle.putBundle(keyForField(7), liveConfiguration.toBundle());
            }
            bundle.putBoolean(keyForField(8), this.isPlaceholder);
            bundle.putLong(keyForField(9), this.defaultPositionUs);
            bundle.putLong(keyForField(10), this.durationUs);
            bundle.putInt(keyForField(11), this.firstPeriodIndex);
            bundle.putInt(keyForField(12), this.lastPeriodIndex);
            bundle.putLong(keyForField(13), this.positionInFirstPeriodUs);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Window.class.equals(obj.getClass())) {
                Window window = (Window) obj;
                if (Util.areEqual(this.uid, window.uid) && Util.areEqual(this.mediaItem, window.mediaItem) && Util.areEqual(this.manifest, window.manifest) && Util.areEqual(this.liveConfiguration, window.liveConfiguration) && this.presentationStartTimeMs == window.presentationStartTimeMs && this.windowStartTimeMs == window.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == window.elapsedRealtimeEpochOffsetMs && this.isSeekable == window.isSeekable && this.isDynamic == window.isDynamic && this.isPlaceholder == window.isPlaceholder && this.defaultPositionUs == window.defaultPositionUs && this.durationUs == window.durationUs && this.firstPeriodIndex == window.firstPeriodIndex && this.lastPeriodIndex == window.lastPeriodIndex && this.positionInFirstPeriodUs == window.positionInFirstPeriodUs) {
                    return true;
                }
            }
            return false;
        }

        public long getCurrentUnixTimeMs() {
            return Util.getNowUnixTimeMs(this.elapsedRealtimeEpochOffsetMs);
        }

        public long getDefaultPositionMs() {
            return Util.usToMs(this.defaultPositionUs);
        }

        public long getDefaultPositionUs() {
            return this.defaultPositionUs;
        }

        public long getDurationMs() {
            return Util.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public long getPositionInFirstPeriodMs() {
            return Util.usToMs(this.positionInFirstPeriodUs);
        }

        public long getPositionInFirstPeriodUs() {
            return this.positionInFirstPeriodUs;
        }

        public int hashCode() {
            int iHashCode = (this.mediaItem.hashCode() + ((this.uid.hashCode() + 217) * 31)) * 31;
            Object obj = this.manifest;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int iHashCode3 = (iHashCode2 + (liveConfiguration != null ? liveConfiguration.hashCode() : 0)) * 31;
            long j8 = this.presentationStartTimeMs;
            int i14 = (iHashCode3 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
            long j14 = this.windowStartTimeMs;
            int i15 = (i14 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
            long j15 = this.elapsedRealtimeEpochOffsetMs;
            int i16 = (((((((i15 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31) + (this.isPlaceholder ? 1 : 0)) * 31;
            long j16 = this.defaultPositionUs;
            int i17 = (i16 + ((int) (j16 ^ (j16 >>> 32)))) * 31;
            long j17 = this.durationUs;
            int i18 = (((((i17 + ((int) (j17 ^ (j17 >>> 32)))) * 31) + this.firstPeriodIndex) * 31) + this.lastPeriodIndex) * 31;
            long j18 = this.positionInFirstPeriodUs;
            return i18 + ((int) (j18 ^ (j18 >>> 32)));
        }

        public boolean isLive() {
            Assertions.checkState(this.isLive == (this.liveConfiguration != null));
            return this.liveConfiguration != null;
        }

        public Window set(Object obj, MediaItem mediaItem, Object obj2, long j8, long j14, long j15, boolean z14, boolean z15, MediaItem.LiveConfiguration liveConfiguration, long j16, long j17, int i14, int i15, long j18) {
            MediaItem.LocalConfiguration localConfiguration;
            this.uid = obj;
            this.mediaItem = mediaItem != null ? mediaItem : EMPTY_MEDIA_ITEM;
            this.tag = (mediaItem == null || (localConfiguration = mediaItem.localConfiguration) == null) ? null : localConfiguration.tag;
            this.manifest = obj2;
            this.presentationStartTimeMs = j8;
            this.windowStartTimeMs = j14;
            this.elapsedRealtimeEpochOffsetMs = j15;
            this.isSeekable = z14;
            this.isDynamic = z15;
            this.isLive = liveConfiguration != null;
            this.liveConfiguration = liveConfiguration;
            this.defaultPositionUs = j16;
            this.durationUs = j17;
            this.firstPeriodIndex = i14;
            this.lastPeriodIndex = i15;
            this.positionInFirstPeriodUs = j18;
            this.isPlaceholder = false;
            return this;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            return toBundle(false);
        }
    }
}
