package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Timeline implements Bundleable {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    public static final Timeline EMPTY = new a();
    public static final Bundleable.Creator<Timeline> CREATOR = new Bundleable.Creator() { // from class: vo7
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return Timeline.b(bundle);
        }
    };

    public static final class Period implements Bundleable {
        public static final Bundleable.Creator<Period> CREATOR = new Bundleable.Creator() { // from class: wo7
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return Timeline.Period.c(bundle);
            }
        };
        private static final int b = 0;
        private static final int c = 1;
        private static final int d = 2;
        private static final int e = 3;
        private static final int f = 4;
        private AdPlaybackState a = AdPlaybackState.NONE;
        public long durationUs;

        @Nullable
        public Object id;
        public boolean isPlaceholder;
        public long positionInWindowUs;

        @Nullable
        public Object uid;
        public int windowIndex;

        /* JADX INFO: Access modifiers changed from: private */
        public static Period c(Bundle bundle) {
            int i = bundle.getInt(d(0), 0);
            long j = bundle.getLong(d(1), C.TIME_UNSET);
            long j2 = bundle.getLong(d(2), 0L);
            boolean z = bundle.getBoolean(d(3));
            Bundle bundle2 = bundle.getBundle(d(4));
            AdPlaybackState adPlaybackState = bundle2 != null ? (AdPlaybackState) AdPlaybackState.CREATOR.fromBundle(bundle2) : AdPlaybackState.NONE;
            Period period = new Period();
            period.set(null, null, i, j, j2, adPlaybackState, z);
            return period;
        }

        private static String d(int field) {
            return Integer.toString(field, 36);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Period.class.equals(obj.getClass())) {
                return false;
            }
            Period period = (Period) obj;
            return Util.areEqual(this.id, period.id) && Util.areEqual(this.uid, period.uid) && this.windowIndex == period.windowIndex && this.durationUs == period.durationUs && this.positionInWindowUs == period.positionInWindowUs && this.isPlaceholder == period.isPlaceholder && Util.areEqual(this.a, period.a);
        }

        public int getAdCountInAdGroup(int adGroupIndex) {
            return this.a.getAdGroup(adGroupIndex).count;
        }

        public long getAdDurationUs(int adGroupIndex, int adIndexInAdGroup) {
            AdPlaybackState.AdGroup adGroup = this.a.getAdGroup(adGroupIndex);
            return adGroup.count != -1 ? adGroup.durationsUs[adIndexInAdGroup] : C.TIME_UNSET;
        }

        public int getAdGroupCount() {
            return this.a.adGroupCount;
        }

        public int getAdGroupIndexAfterPositionUs(long positionUs) {
            return this.a.getAdGroupIndexAfterPositionUs(positionUs, this.durationUs);
        }

        public int getAdGroupIndexForPositionUs(long positionUs) {
            return this.a.getAdGroupIndexForPositionUs(positionUs, this.durationUs);
        }

        public long getAdGroupTimeUs(int adGroupIndex) {
            return this.a.getAdGroup(adGroupIndex).timeUs;
        }

        public long getAdResumePositionUs() {
            return this.a.adResumePositionUs;
        }

        @Nullable
        public Object getAdsId() {
            return this.a.adsId;
        }

        public long getContentResumeOffsetUs(int adGroupIndex) {
            return this.a.getAdGroup(adGroupIndex).contentResumeOffsetUs;
        }

        public long getDurationMs() {
            return C.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public int getFirstAdIndexToPlay(int adGroupIndex) {
            return this.a.getAdGroup(adGroupIndex).getFirstAdIndexToPlay();
        }

        public int getNextAdIndexToPlay(int adGroupIndex, int lastPlayedAdIndex) {
            return this.a.getAdGroup(adGroupIndex).getNextAdIndexToPlay(lastPlayedAdIndex);
        }

        public long getPositionInWindowMs() {
            return C.usToMs(this.positionInWindowUs);
        }

        public long getPositionInWindowUs() {
            return this.positionInWindowUs;
        }

        public int getRemovedAdGroupCount() {
            return this.a.removedAdGroupCount;
        }

        public boolean hasPlayedAdGroup(int adGroupIndex) {
            return !this.a.getAdGroup(adGroupIndex).hasUnplayedAds();
        }

        public int hashCode() {
            Object obj = this.id;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.uid;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.windowIndex) * 31;
            long j = this.durationUs;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.positionInWindowUs;
            return ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31) + this.a.hashCode();
        }

        public boolean isServerSideInsertedAdGroup(int adGroupIndex) {
            return this.a.getAdGroup(adGroupIndex).isServerSideInserted;
        }

        public Period set(@Nullable Object id, @Nullable Object uid, int windowIndex, long durationUs, long positionInWindowUs) {
            return set(id, uid, windowIndex, durationUs, positionInWindowUs, AdPlaybackState.NONE, false);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(d(0), this.windowIndex);
            bundle.putLong(d(1), this.durationUs);
            bundle.putLong(d(2), this.positionInWindowUs);
            bundle.putBoolean(d(3), this.isPlaceholder);
            bundle.putBundle(d(4), this.a.toBundle());
            return bundle;
        }

        public Period set(@Nullable Object id, @Nullable Object uid, int windowIndex, long durationUs, long positionInWindowUs, AdPlaybackState adPlaybackState, boolean isPlaceholder) {
            this.id = id;
            this.uid = uid;
            this.windowIndex = windowIndex;
            this.durationUs = durationUs;
            this.positionInWindowUs = positionInWindowUs;
            this.a = adPlaybackState;
            this.isPlaceholder = isPlaceholder;
            return this;
        }
    }

    public static final class RemotableTimeline extends Timeline {
        private final ImmutableList<Window> d;
        private final ImmutableList<Period> e;
        private final int[] f;
        private final int[] g;

        public RemotableTimeline(ImmutableList<Window> windows, ImmutableList<Period> periods, int[] shuffledWindowIndices) {
            Assertions.checkArgument(windows.size() == shuffledWindowIndices.length);
            this.d = windows;
            this.e = periods;
            this.f = shuffledWindowIndices;
            this.g = new int[shuffledWindowIndices.length];
            for (int i = 0; i < shuffledWindowIndices.length; i++) {
                this.g[shuffledWindowIndices[i]] = i;
            }
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getFirstWindowIndex(boolean shuffleModeEnabled) {
            if (isEmpty()) {
                return -1;
            }
            if (shuffleModeEnabled) {
                return this.f[0];
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object uid) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getLastWindowIndex(boolean shuffleModeEnabled) {
            if (isEmpty()) {
                return -1;
            }
            return shuffleModeEnabled ? this.f[getWindowCount() - 1] : getWindowCount() - 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getNextWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
            if (repeatMode == 1) {
                return windowIndex;
            }
            if (windowIndex != getLastWindowIndex(shuffleModeEnabled)) {
                return shuffleModeEnabled ? this.f[this.g[windowIndex] + 1] : windowIndex + 1;
            }
            if (repeatMode == 2) {
                return getFirstWindowIndex(shuffleModeEnabled);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Period getPeriod(int periodIndex, Period period, boolean setIds) {
            Period period2 = this.e.get(periodIndex);
            period.set(period2.id, period2.uid, period2.windowIndex, period2.durationUs, period2.positionInWindowUs, period2.a, period2.isPlaceholder);
            return period;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return this.e.size();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPreviousWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
            if (repeatMode == 1) {
                return windowIndex;
            }
            if (windowIndex != getFirstWindowIndex(shuffleModeEnabled)) {
                return shuffleModeEnabled ? this.f[this.g[windowIndex] - 1] : windowIndex - 1;
            }
            if (repeatMode == 2) {
                return getLastWindowIndex(shuffleModeEnabled);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int periodIndex) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Window getWindow(int windowIndex, Window window, long defaultPositionProjectionUs) {
            Window window2 = this.d.get(windowIndex);
            window.set(window2.uid, window2.mediaItem, window2.manifest, window2.presentationStartTimeMs, window2.windowStartTimeMs, window2.elapsedRealtimeEpochOffsetMs, window2.isSeekable, window2.isDynamic, window2.liveConfiguration, window2.defaultPositionUs, window2.durationUs, window2.firstPeriodIndex, window2.lastPeriodIndex, window2.positionInFirstPeriodUs);
            window.isPlaceholder = window2.isPlaceholder;
            return window;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return this.d.size();
        }
    }

    public static final class Window implements Bundleable {
        private static final int c = 1;
        private static final int d = 2;
        private static final int e = 3;
        private static final int f = 4;
        private static final int g = 5;
        private static final int h = 6;
        private static final int i = 7;
        private static final int j = 8;
        private static final int k = 9;
        private static final int l = 10;
        private static final int m = 11;
        private static final int n = 12;
        private static final int o = 13;
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

        @Nullable
        public MediaItem.LiveConfiguration liveConfiguration;

        @Nullable
        public Object manifest;
        public long positionInFirstPeriodUs;
        public long presentationStartTimeMs;

        @Nullable
        @Deprecated
        public Object tag;
        public long windowStartTimeMs;
        public static final Object SINGLE_WINDOW_UID = new Object();
        private static final Object a = new Object();
        private static final MediaItem b = new MediaItem.Builder().setMediaId("com.google.android.exoplayer2.Timeline").setUri(Uri.EMPTY).build();
        public static final Bundleable.Creator<Window> CREATOR = new Bundleable.Creator() { // from class: xo7
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return Timeline.Window.c(bundle);
            }
        };
        public Object uid = SINGLE_WINDOW_UID;
        public MediaItem mediaItem = b;

        /* JADX INFO: Access modifiers changed from: private */
        public static Window c(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(d(1));
            MediaItem mediaItem = bundle2 != null ? (MediaItem) MediaItem.CREATOR.fromBundle(bundle2) : null;
            long j2 = bundle.getLong(d(2), C.TIME_UNSET);
            long j3 = bundle.getLong(d(3), C.TIME_UNSET);
            long j4 = bundle.getLong(d(4), C.TIME_UNSET);
            boolean z = bundle.getBoolean(d(5), false);
            boolean z2 = bundle.getBoolean(d(6), false);
            Bundle bundle3 = bundle.getBundle(d(7));
            MediaItem.LiveConfiguration liveConfiguration = bundle3 != null ? (MediaItem.LiveConfiguration) MediaItem.LiveConfiguration.CREATOR.fromBundle(bundle3) : null;
            boolean z3 = bundle.getBoolean(d(8), false);
            long j5 = bundle.getLong(d(9), 0L);
            long j6 = bundle.getLong(d(10), C.TIME_UNSET);
            int i2 = bundle.getInt(d(11), 0);
            int i3 = bundle.getInt(d(12), 0);
            long j7 = bundle.getLong(d(13), 0L);
            Window window = new Window();
            window.set(a, mediaItem, null, j2, j3, j4, z, z2, liveConfiguration, j5, j6, i2, i3, j7);
            window.isPlaceholder = z3;
            return window;
        }

        private static String d(int field) {
            return Integer.toString(field, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle e(boolean excludeMediaItem) {
            Bundle bundle = new Bundle();
            bundle.putBundle(d(1), (excludeMediaItem ? MediaItem.EMPTY : this.mediaItem).toBundle());
            bundle.putLong(d(2), this.presentationStartTimeMs);
            bundle.putLong(d(3), this.windowStartTimeMs);
            bundle.putLong(d(4), this.elapsedRealtimeEpochOffsetMs);
            bundle.putBoolean(d(5), this.isSeekable);
            bundle.putBoolean(d(6), this.isDynamic);
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            if (liveConfiguration != null) {
                bundle.putBundle(d(7), liveConfiguration.toBundle());
            }
            bundle.putBoolean(d(8), this.isPlaceholder);
            bundle.putLong(d(9), this.defaultPositionUs);
            bundle.putLong(d(10), this.durationUs);
            bundle.putInt(d(11), this.firstPeriodIndex);
            bundle.putInt(d(12), this.lastPeriodIndex);
            bundle.putLong(d(13), this.positionInFirstPeriodUs);
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Window.class.equals(obj.getClass())) {
                return false;
            }
            Window window = (Window) obj;
            return Util.areEqual(this.uid, window.uid) && Util.areEqual(this.mediaItem, window.mediaItem) && Util.areEqual(this.manifest, window.manifest) && Util.areEqual(this.liveConfiguration, window.liveConfiguration) && this.presentationStartTimeMs == window.presentationStartTimeMs && this.windowStartTimeMs == window.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == window.elapsedRealtimeEpochOffsetMs && this.isSeekable == window.isSeekable && this.isDynamic == window.isDynamic && this.isPlaceholder == window.isPlaceholder && this.defaultPositionUs == window.defaultPositionUs && this.durationUs == window.durationUs && this.firstPeriodIndex == window.firstPeriodIndex && this.lastPeriodIndex == window.lastPeriodIndex && this.positionInFirstPeriodUs == window.positionInFirstPeriodUs;
        }

        public long getCurrentUnixTimeMs() {
            return Util.getNowUnixTimeMs(this.elapsedRealtimeEpochOffsetMs);
        }

        public long getDefaultPositionMs() {
            return C.usToMs(this.defaultPositionUs);
        }

        public long getDefaultPositionUs() {
            return this.defaultPositionUs;
        }

        public long getDurationMs() {
            return C.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public long getPositionInFirstPeriodMs() {
            return C.usToMs(this.positionInFirstPeriodUs);
        }

        public long getPositionInFirstPeriodUs() {
            return this.positionInFirstPeriodUs;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.uid.hashCode()) * 31) + this.mediaItem.hashCode()) * 31;
            Object obj = this.manifest;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int iHashCode3 = (iHashCode2 + (liveConfiguration != null ? liveConfiguration.hashCode() : 0)) * 31;
            long j2 = this.presentationStartTimeMs;
            int i2 = (iHashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.windowStartTimeMs;
            int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.elapsedRealtimeEpochOffsetMs;
            int i4 = (((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31) + (this.isPlaceholder ? 1 : 0)) * 31;
            long j5 = this.defaultPositionUs;
            int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.durationUs;
            int i6 = (((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.firstPeriodIndex) * 31) + this.lastPeriodIndex) * 31;
            long j7 = this.positionInFirstPeriodUs;
            return i6 + ((int) (j7 ^ (j7 >>> 32)));
        }

        public boolean isLive() {
            Assertions.checkState(this.isLive == (this.liveConfiguration != null));
            return this.liveConfiguration != null;
        }

        public Window set(Object uid, @Nullable MediaItem mediaItem, @Nullable Object manifest, long presentationStartTimeMs, long windowStartTimeMs, long elapsedRealtimeEpochOffsetMs, boolean isSeekable, boolean isDynamic, @Nullable MediaItem.LiveConfiguration liveConfiguration, long defaultPositionUs, long durationUs, int firstPeriodIndex, int lastPeriodIndex, long positionInFirstPeriodUs) {
            MediaItem.PlaybackProperties playbackProperties;
            this.uid = uid;
            this.mediaItem = mediaItem != null ? mediaItem : b;
            this.tag = (mediaItem == null || (playbackProperties = mediaItem.playbackProperties) == null) ? null : playbackProperties.tag;
            this.manifest = manifest;
            this.presentationStartTimeMs = presentationStartTimeMs;
            this.windowStartTimeMs = windowStartTimeMs;
            this.elapsedRealtimeEpochOffsetMs = elapsedRealtimeEpochOffsetMs;
            this.isSeekable = isSeekable;
            this.isDynamic = isDynamic;
            this.isLive = liveConfiguration != null;
            this.liveConfiguration = liveConfiguration;
            this.defaultPositionUs = defaultPositionUs;
            this.durationUs = durationUs;
            this.firstPeriodIndex = firstPeriodIndex;
            this.lastPeriodIndex = lastPeriodIndex;
            this.positionInFirstPeriodUs = positionInFirstPeriodUs;
            this.isPlaceholder = false;
            return this;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            return e(false);
        }
    }

    public class a extends Timeline {
        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object uid) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Period getPeriod(int periodIndex, Period period, boolean setIds) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int periodIndex) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Window getWindow(int windowIndex, Window window, long defaultPositionProjectionUs) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Timeline b(Bundle bundle) {
        ImmutableList immutableListC = c(Window.CREATOR, BundleUtil.getBinder(bundle, e(0)));
        ImmutableList immutableListC2 = c(Period.CREATOR, BundleUtil.getBinder(bundle, e(1)));
        int[] intArray = bundle.getIntArray(e(2));
        if (intArray == null) {
            intArray = d(immutableListC.size());
        }
        return new RemotableTimeline(immutableListC, immutableListC2, intArray);
    }

    private static <T extends Bundleable> ImmutableList<T> c(Bundleable.Creator<T> creator, @Nullable IBinder binder) {
        if (binder == null) {
            return ImmutableList.of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList<Bundle> list = BundleListRetriever.getList(binder);
        for (int i = 0; i < list.size(); i++) {
            builder.add(creator.fromBundle(list.get(i)));
        }
        return builder.build();
    }

    private static int[] d(int n) {
        int[] iArr = new int[n];
        for (int i = 0; i < n; i++) {
            iArr[i] = i;
        }
        return iArr;
    }

    private static String e(int field) {
        return Integer.toString(field, 36);
    }

    public boolean equals(@Nullable Object obj) {
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
        for (int i = 0; i < getWindowCount(); i++) {
            if (!getWindow(i, window).equals(timeline.getWindow(i, window2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < getPeriodCount(); i2++) {
            if (!getPeriod(i2, period, true).equals(timeline.getPeriod(i2, period2, true))) {
                return false;
            }
        }
        return true;
    }

    public int getFirstWindowIndex(boolean shuffleModeEnabled) {
        return isEmpty() ? -1 : 0;
    }

    public abstract int getIndexOfPeriod(Object uid);

    public int getLastWindowIndex(boolean shuffleModeEnabled) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public final int getNextPeriodIndex(int periodIndex, Period period, Window window, int repeatMode, boolean shuffleModeEnabled) {
        int i = getPeriod(periodIndex, period).windowIndex;
        if (getWindow(i, window).lastPeriodIndex != periodIndex) {
            return periodIndex + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i, repeatMode, shuffleModeEnabled);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, window).firstPeriodIndex;
    }

    public int getNextWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
        if (repeatMode == 0) {
            if (windowIndex == getLastWindowIndex(shuffleModeEnabled)) {
                return -1;
            }
            return windowIndex + 1;
        }
        if (repeatMode == 1) {
            return windowIndex;
        }
        if (repeatMode == 2) {
            return windowIndex == getLastWindowIndex(shuffleModeEnabled) ? getFirstWindowIndex(shuffleModeEnabled) : windowIndex + 1;
        }
        throw new IllegalStateException();
    }

    public final Period getPeriod(int periodIndex, Period period) {
        return getPeriod(periodIndex, period, false);
    }

    public abstract Period getPeriod(int periodIndex, Period period, boolean setIds);

    public Period getPeriodByUid(Object periodUid, Period period) {
        return getPeriod(getIndexOfPeriod(periodUid), period, true);
    }

    public abstract int getPeriodCount();

    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int windowIndex, long windowPositionUs) {
        return (Pair) Assertions.checkNotNull(getPeriodPosition(window, period, windowIndex, windowPositionUs, 0L));
    }

    public int getPreviousWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
        if (repeatMode == 0) {
            if (windowIndex == getFirstWindowIndex(shuffleModeEnabled)) {
                return -1;
            }
            return windowIndex - 1;
        }
        if (repeatMode == 1) {
            return windowIndex;
        }
        if (repeatMode == 2) {
            return windowIndex == getFirstWindowIndex(shuffleModeEnabled) ? getLastWindowIndex(shuffleModeEnabled) : windowIndex - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object getUidOfPeriod(int periodIndex);

    public final Window getWindow(int windowIndex, Window window) {
        return getWindow(windowIndex, window, 0L);
    }

    public abstract Window getWindow(int windowIndex, Window window, long defaultPositionProjectionUs);

    public abstract int getWindowCount();

    public int hashCode() {
        Window window = new Window();
        Period period = new Period();
        int windowCount = 217 + getWindowCount();
        for (int i = 0; i < getWindowCount(); i++) {
            windowCount = (windowCount * 31) + getWindow(i, window).hashCode();
        }
        int periodCount = (windowCount * 31) + getPeriodCount();
        for (int i2 = 0; i2 < getPeriodCount(); i2++) {
            periodCount = (periodCount * 31) + getPeriod(i2, period, true).hashCode();
        }
        return periodCount;
    }

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public final boolean isLastPeriod(int periodIndex, Period period, Window window, int repeatMode, boolean shuffleModeEnabled) {
        return getNextPeriodIndex(periodIndex, period, window, repeatMode, shuffleModeEnabled) == -1;
    }

    public final Bundle toBundle(boolean excludeMediaItems) {
        ArrayList arrayList = new ArrayList();
        int windowCount = getWindowCount();
        Window window = new Window();
        for (int i = 0; i < windowCount; i++) {
            arrayList.add(getWindow(i, window, 0L).e(excludeMediaItems));
        }
        ArrayList arrayList2 = new ArrayList();
        int periodCount = getPeriodCount();
        Period period = new Period();
        for (int i2 = 0; i2 < periodCount; i2++) {
            arrayList2.add(getPeriod(i2, period, false).toBundle());
        }
        int[] iArr = new int[windowCount];
        if (windowCount > 0) {
            iArr[0] = getFirstWindowIndex(true);
        }
        for (int i3 = 1; i3 < windowCount; i3++) {
            iArr[i3] = getNextWindowIndex(iArr[i3 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        BundleUtil.putBinder(bundle, e(0), new BundleListRetriever(arrayList));
        BundleUtil.putBinder(bundle, e(1), new BundleListRetriever(arrayList2));
        bundle.putIntArray(e(2), iArr);
        return bundle;
    }

    @Nullable
    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int windowIndex, long windowPositionUs, long defaultPositionProjectionUs) {
        Assertions.checkIndex(windowIndex, 0, getWindowCount());
        getWindow(windowIndex, window, defaultPositionProjectionUs);
        if (windowPositionUs == C.TIME_UNSET) {
            windowPositionUs = window.getDefaultPositionUs();
            if (windowPositionUs == C.TIME_UNSET) {
                return null;
            }
        }
        int i = window.firstPeriodIndex;
        getPeriod(i, period);
        while (i < window.lastPeriodIndex && period.positionInWindowUs != windowPositionUs) {
            int i2 = i + 1;
            if (getPeriod(i2, period).positionInWindowUs > windowPositionUs) {
                break;
            }
            i = i2;
        }
        getPeriod(i, period, true);
        return Pair.create(Assertions.checkNotNull(period.uid), Long.valueOf(windowPositionUs - period.positionInWindowUs));
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public final Bundle toBundle() {
        return toBundle(false);
    }
}
