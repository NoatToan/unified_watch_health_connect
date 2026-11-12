package com.google.android.exoplayer2.trackselection;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class AdaptiveTrackSelection extends BaseTrackSelection {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.7f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MAX_HEIGHT_TO_DISCARD = 719;
    public static final int DEFAULT_MAX_WIDTH_TO_DISCARD = 1279;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    private static final long MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 1000;
    private static final String TAG = "AdaptiveTrackSelection";
    private final ImmutableList<AdaptationCheckpoint> adaptationCheckpoints;
    private final float bandwidthFraction;
    private final BandwidthMeter bandwidthMeter;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    private final Clock clock;
    private MediaChunk lastBufferEvaluationMediaChunk;
    private long lastBufferEvaluationMs;
    private final long maxDurationForQualityDecreaseUs;
    private final int maxHeightToDiscard;
    private final int maxWidthToDiscard;
    private final long minDurationForQualityIncreaseUs;
    private final long minDurationToRetainAfterDiscardUs;
    private float playbackSpeed;
    private int reason;
    private int selectedIndex;

    public static final class AdaptationCheckpoint {
        public final long allocatedBandwidth;
        public final long totalBandwidth;

        public AdaptationCheckpoint(long j8, long j14) {
            this.totalBandwidth = j8;
            this.allocatedBandwidth = j14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdaptationCheckpoint)) {
                return false;
            }
            AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) obj;
            return this.totalBandwidth == adaptationCheckpoint.totalBandwidth && this.allocatedBandwidth == adaptationCheckpoint.allocatedBandwidth;
        }

        public int hashCode() {
            return (((int) this.totalBandwidth) * 31) + ((int) this.allocatedBandwidth);
        }
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i14, BandwidthMeter bandwidthMeter, long j8, long j14, long j15, int i15, int i16, float f14, float f15, List<AdaptationCheckpoint> list, Clock clock) {
        long j16;
        super(trackGroup, iArr, i14);
        if (j15 < j8) {
            Log.w(TAG, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j16 = j8;
        } else {
            j16 = j15;
        }
        this.bandwidthMeter = bandwidthMeter;
        this.minDurationForQualityIncreaseUs = j8 * 1000;
        this.maxDurationForQualityDecreaseUs = j14 * 1000;
        this.minDurationToRetainAfterDiscardUs = j16 * 1000;
        this.maxWidthToDiscard = i15;
        this.maxHeightToDiscard = i16;
        this.bandwidthFraction = f14;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f15;
        this.adaptationCheckpoints = ImmutableList.copyOf((Collection) list);
        this.clock = clock;
        this.playbackSpeed = 1.0f;
        this.reason = 0;
        this.lastBufferEvaluationMs = C.TIME_UNSET;
    }

    private static void addCheckpoint(List<ImmutableList.Builder<AdaptationCheckpoint>> list, long[] jArr) {
        long j8 = 0;
        for (long j14 : jArr) {
            j8 += j14;
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            ImmutableList.Builder<AdaptationCheckpoint> builder = list.get(i14);
            if (builder != null) {
                builder.add(new AdaptationCheckpoint(j8, jArr[i14]));
            }
        }
    }

    private int determineIdealSelectedIndex(long j8, long j14) {
        long allocatedBandwidth = getAllocatedBandwidth(j14);
        int i14 = 0;
        for (int i15 = 0; i15 < this.length; i15++) {
            if (j8 == Long.MIN_VALUE || !isBlacklisted(i15, j8)) {
                Format format = getFormat(i15);
                if (canSelectFormat(format, format.bitrate, allocatedBandwidth)) {
                    return i15;
                }
                i14 = i15;
            }
        }
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList<ImmutableList<AdaptationCheckpoint>> getAdaptationCheckpoints(ExoTrackSelection.Definition[] definitionArr) {
        ArrayList arrayList = new ArrayList();
        for (ExoTrackSelection.Definition definition : definitionArr) {
            if (definition == null || definition.tracks.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.Builder builder = ImmutableList.builder();
                builder.add(new AdaptationCheckpoint(0L, 0L));
                arrayList.add(builder);
            }
        }
        long[][] sortedTrackBitrates = getSortedTrackBitrates(definitionArr);
        int[] iArr = new int[sortedTrackBitrates.length];
        long[] jArr = new long[sortedTrackBitrates.length];
        for (int i14 = 0; i14 < sortedTrackBitrates.length; i14++) {
            long[] jArr2 = sortedTrackBitrates[i14];
            jArr[i14] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        addCheckpoint(arrayList, jArr);
        ImmutableList<Integer> switchOrder = getSwitchOrder(sortedTrackBitrates);
        for (int i15 = 0; i15 < switchOrder.size(); i15++) {
            int iIntValue = switchOrder.get(i15).intValue();
            int i16 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i16;
            jArr[iIntValue] = sortedTrackBitrates[iIntValue][i16];
            addCheckpoint(arrayList, jArr);
        }
        for (int i17 = 0; i17 < definitionArr.length; i17++) {
            if (arrayList.get(i17) != null) {
                jArr[i17] = jArr[i17] * 2;
            }
        }
        addCheckpoint(arrayList, jArr);
        ImmutableList.Builder builder2 = ImmutableList.builder();
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            ImmutableList.Builder builder3 = (ImmutableList.Builder) arrayList.get(i18);
            builder2.add(builder3 == null ? ImmutableList.of() : builder3.build());
        }
        return builder2.build();
    }

    private long getAllocatedBandwidth(long j8) {
        long totalAllocatableBandwidth = getTotalAllocatableBandwidth(j8);
        if (this.adaptationCheckpoints.isEmpty()) {
            return totalAllocatableBandwidth;
        }
        int i14 = 1;
        while (i14 < this.adaptationCheckpoints.size() - 1 && this.adaptationCheckpoints.get(i14).totalBandwidth < totalAllocatableBandwidth) {
            i14++;
        }
        AdaptationCheckpoint adaptationCheckpoint = this.adaptationCheckpoints.get(i14 - 1);
        AdaptationCheckpoint adaptationCheckpoint2 = this.adaptationCheckpoints.get(i14);
        long j14 = adaptationCheckpoint.totalBandwidth;
        float f14 = (totalAllocatableBandwidth - j14) / (adaptationCheckpoint2.totalBandwidth - j14);
        long j15 = adaptationCheckpoint.allocatedBandwidth;
        return j15 + ((long) (f14 * (adaptationCheckpoint2.allocatedBandwidth - j15)));
    }

    private long getLastChunkDurationUs(List<? extends MediaChunk> list) {
        if (list.isEmpty()) {
            return C.TIME_UNSET;
        }
        MediaChunk mediaChunk = (MediaChunk) Iterables.getLast(list);
        long j8 = mediaChunk.startTimeUs;
        if (j8 != C.TIME_UNSET) {
            long j14 = mediaChunk.endTimeUs;
            if (j14 != C.TIME_UNSET) {
                return j14 - j8;
            }
        }
        return C.TIME_UNSET;
    }

    private long getNextChunkDurationUs(MediaChunkIterator[] mediaChunkIteratorArr, List<? extends MediaChunk> list) {
        int i14 = this.selectedIndex;
        if (i14 < mediaChunkIteratorArr.length && mediaChunkIteratorArr[i14].next()) {
            MediaChunkIterator mediaChunkIterator = mediaChunkIteratorArr[this.selectedIndex];
            return mediaChunkIterator.getChunkEndTimeUs() - mediaChunkIterator.getChunkStartTimeUs();
        }
        for (MediaChunkIterator mediaChunkIterator2 : mediaChunkIteratorArr) {
            if (mediaChunkIterator2.next()) {
                return mediaChunkIterator2.getChunkEndTimeUs() - mediaChunkIterator2.getChunkStartTimeUs();
            }
        }
        return getLastChunkDurationUs(list);
    }

    private static long[][] getSortedTrackBitrates(ExoTrackSelection.Definition[] definitionArr) {
        long[][] jArr = new long[definitionArr.length][];
        for (int i14 = 0; i14 < definitionArr.length; i14++) {
            ExoTrackSelection.Definition definition = definitionArr[i14];
            if (definition == null) {
                jArr[i14] = new long[0];
            } else {
                jArr[i14] = new long[definition.tracks.length];
                int i15 = 0;
                while (true) {
                    int[] iArr = definition.tracks;
                    if (i15 >= iArr.length) {
                        break;
                    }
                    jArr[i14][i15] = definition.group.getFormat(iArr[i15]).bitrate;
                    i15++;
                }
                Arrays.sort(jArr[i14]);
            }
        }
        return jArr;
    }

    private static ImmutableList<Integer> getSwitchOrder(long[][] jArr) {
        Multimap multimapBuild = MultimapBuilder.treeKeys().arrayListValues().build();
        for (int i14 = 0; i14 < jArr.length; i14++) {
            long[] jArr2 = jArr[i14];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i15 = 0;
                while (true) {
                    long[] jArr3 = jArr[i14];
                    double dLog = 0.0d;
                    if (i15 >= jArr3.length) {
                        break;
                    }
                    long j8 = jArr3[i15];
                    if (j8 != -1) {
                        dLog = Math.log(j8);
                    }
                    dArr[i15] = dLog;
                    i15++;
                }
                int i16 = length - 1;
                double d14 = dArr[i16] - dArr[0];
                int i17 = 0;
                while (i17 < i16) {
                    double d15 = dArr[i17];
                    i17++;
                    multimapBuild.put(Double.valueOf(d14 == 0.0d ? 1.0d : (((d15 + dArr[i17]) * 0.5d) - dArr[0]) / d14), Integer.valueOf(i14));
                }
            }
        }
        return ImmutableList.copyOf(multimapBuild.values());
    }

    private long getTotalAllocatableBandwidth(long j8) {
        long bitrateEstimate = (long) (this.bandwidthMeter.getBitrateEstimate() * this.bandwidthFraction);
        long timeToFirstByteEstimateUs = this.bandwidthMeter.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == C.TIME_UNSET || j8 == C.TIME_UNSET) {
            return (long) (bitrateEstimate / this.playbackSpeed);
        }
        float f14 = j8;
        return (long) ((bitrateEstimate * Math.max((f14 / this.playbackSpeed) - timeToFirstByteEstimateUs, 0.0f)) / f14);
    }

    private long minDurationForQualityIncreaseUs(long j8, long j14) {
        if (j8 == C.TIME_UNSET) {
            return this.minDurationForQualityIncreaseUs;
        }
        if (j14 != C.TIME_UNSET) {
            j8 -= j14;
        }
        return Math.min((long) (j8 * this.bufferedFractionToLiveEdgeForQualityIncrease), this.minDurationForQualityIncreaseUs);
    }

    public boolean canSelectFormat(Format format, int i14, long j8) {
        return ((long) i14) <= j8;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void disable() {
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void enable() {
        this.lastBufferEvaluationMs = C.TIME_UNSET;
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j8, List<? extends MediaChunk> list) {
        int i14;
        int i15;
        long jElapsedRealtime = this.clock.elapsedRealtime();
        if (!shouldEvaluateQueueSize(jElapsedRealtime, list)) {
            return list.size();
        }
        this.lastBufferEvaluationMs = jElapsedRealtime;
        this.lastBufferEvaluationMediaChunk = list.isEmpty() ? null : (MediaChunk) Iterables.getLast(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(list.get(size - 1).startTimeUs - j8, this.playbackSpeed);
        long minDurationToRetainAfterDiscardUs = getMinDurationToRetainAfterDiscardUs();
        if (playoutDurationForMediaDuration >= minDurationToRetainAfterDiscardUs) {
            Format format = getFormat(determineIdealSelectedIndex(jElapsedRealtime, getLastChunkDurationUs(list)));
            for (int i16 = 0; i16 < size; i16++) {
                MediaChunk mediaChunk = list.get(i16);
                Format format2 = mediaChunk.trackFormat;
                if (Util.getPlayoutDurationForMediaDuration(mediaChunk.startTimeUs - j8, this.playbackSpeed) >= minDurationToRetainAfterDiscardUs && format2.bitrate < format.bitrate && (i14 = format2.height) != -1 && i14 <= this.maxHeightToDiscard && (i15 = format2.width) != -1 && i15 <= this.maxWidthToDiscard && i14 < format.height) {
                    return i16;
                }
            }
        }
        return size;
    }

    public long getMinDurationToRetainAfterDiscardUs() {
        return this.minDurationToRetainAfterDiscardUs;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public Object getSelectionData() {
        return null;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f14) {
        this.playbackSpeed = f14;
    }

    public boolean shouldEvaluateQueueSize(long j8, List<? extends MediaChunk> list) {
        long j14 = this.lastBufferEvaluationMs;
        if (j14 == C.TIME_UNSET || j8 - j14 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((MediaChunk) Iterables.getLast(list)).equals(this.lastBufferEvaluationMediaChunk)) ? false : true;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j8, long j14, long j15, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long jElapsedRealtime = this.clock.elapsedRealtime();
        long nextChunkDurationUs = getNextChunkDurationUs(mediaChunkIteratorArr, list);
        int i14 = this.reason;
        if (i14 == 0) {
            this.reason = 1;
            this.selectedIndex = determineIdealSelectedIndex(jElapsedRealtime, nextChunkDurationUs);
            return;
        }
        int i15 = this.selectedIndex;
        int iIndexOf = list.isEmpty() ? -1 : indexOf(((MediaChunk) Iterables.getLast(list)).trackFormat);
        if (iIndexOf != -1) {
            i14 = ((MediaChunk) Iterables.getLast(list)).trackSelectionReason;
            i15 = iIndexOf;
        }
        int iDetermineIdealSelectedIndex = determineIdealSelectedIndex(jElapsedRealtime, nextChunkDurationUs);
        if (!isBlacklisted(i15, jElapsedRealtime)) {
            Format format = getFormat(i15);
            Format format2 = getFormat(iDetermineIdealSelectedIndex);
            long jMinDurationForQualityIncreaseUs = minDurationForQualityIncreaseUs(j15, nextChunkDurationUs);
            int i16 = format2.bitrate;
            int i17 = format.bitrate;
            if ((i16 > i17 && j14 < jMinDurationForQualityIncreaseUs) || (i16 < i17 && j14 >= this.maxDurationForQualityDecreaseUs)) {
                iDetermineIdealSelectedIndex = i15;
            }
        }
        if (iDetermineIdealSelectedIndex != i15) {
            i14 = 3;
        }
        this.reason = i14;
        this.selectedIndex = iDetermineIdealSelectedIndex;
    }

    public static class Factory implements ExoTrackSelection.Factory {
        private final float bandwidthFraction;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final Clock clock;
        private final int maxDurationForQualityDecreaseMs;
        private final int maxHeightToDiscard;
        private final int maxWidthToDiscard;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;

        public Factory(int i14, int i15, int i16, int i17, int i18, float f14, float f15, Clock clock) {
            this.minDurationForQualityIncreaseMs = i14;
            this.maxDurationForQualityDecreaseMs = i15;
            this.minDurationToRetainAfterDiscardMs = i16;
            this.maxWidthToDiscard = i17;
            this.maxHeightToDiscard = i18;
            this.bandwidthFraction = f14;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f15;
            this.clock = clock;
        }

        public AdaptiveTrackSelection createAdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i14, BandwidthMeter bandwidthMeter, ImmutableList<AdaptationCheckpoint> immutableList) {
            return new AdaptiveTrackSelection(trackGroup, iArr, i14, bandwidthMeter, this.minDurationForQualityIncreaseMs, this.maxDurationForQualityDecreaseMs, this.minDurationToRetainAfterDiscardMs, this.maxWidthToDiscard, this.maxHeightToDiscard, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, immutableList, this.clock);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0015  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
        public final ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            BandwidthMeter bandwidthMeter2;
            ExoTrackSelection exoTrackSelectionCreateAdaptiveTrackSelection;
            ImmutableList adaptationCheckpoints = AdaptiveTrackSelection.getAdaptationCheckpoints(definitionArr);
            ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
            int i14 = 0;
            while (i14 < definitionArr.length) {
                ExoTrackSelection.Definition definition = definitionArr[i14];
                if (definition != null) {
                    int[] iArr = definition.tracks;
                    if (iArr.length == 0) {
                        bandwidthMeter2 = bandwidthMeter;
                    } else {
                        int length = iArr.length;
                        TrackGroup trackGroup = definition.group;
                        if (length == 1) {
                            exoTrackSelectionCreateAdaptiveTrackSelection = new FixedTrackSelection(trackGroup, iArr[0], definition.type);
                            bandwidthMeter2 = bandwidthMeter;
                        } else {
                            bandwidthMeter2 = bandwidthMeter;
                            exoTrackSelectionCreateAdaptiveTrackSelection = createAdaptiveTrackSelection(trackGroup, iArr, definition.type, bandwidthMeter2, (ImmutableList) adaptationCheckpoints.get(i14));
                        }
                        exoTrackSelectionArr[i14] = exoTrackSelectionCreateAdaptiveTrackSelection;
                    }
                } else {
                    bandwidthMeter2 = bandwidthMeter;
                }
                i14++;
                bandwidthMeter = bandwidthMeter2;
            }
            return exoTrackSelectionArr;
        }

        public Factory(int i14, int i15, int i16, float f14) {
            this(i14, i15, i16, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, f14, 0.75f, Clock.DEFAULT);
        }

        public Factory(int i14, int i15, int i16, int i17, int i18, float f14) {
            this(i14, i15, i16, i17, i18, f14, 0.75f, Clock.DEFAULT);
        }

        public Factory(int i14, int i15, int i16, float f14, float f15, Clock clock) {
            this(i14, i15, i16, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, f14, f15, clock);
        }

        public Factory() {
            this(10000, 25000, 25000, 0.7f);
        }
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter) {
        this(trackGroup, iArr, 0, bandwidthMeter, AbstractComponentTracker.LINGERING_TIMEOUT, 25000L, 25000L, DEFAULT_MAX_WIDTH_TO_DISCARD, DEFAULT_MAX_HEIGHT_TO_DISCARD, 0.7f, 0.75f, ImmutableList.of(), Clock.DEFAULT);
    }
}
