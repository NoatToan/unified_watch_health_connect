package com.google.android.exoplayer2.trackselection;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
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

/* JADX INFO: loaded from: classes3.dex */
public class AdaptiveTrackSelection extends BaseTrackSelection {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.7f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    private static final String r = "AdaptiveTrackSelection";
    private static final long s = 1000;
    private final BandwidthMeter e;
    private final long f;
    private final long g;
    private final long h;
    private final float i;
    private final float j;
    private final ImmutableList<AdaptationCheckpoint> k;
    private final Clock l;
    private float m;
    private int n;
    private int o;
    private long p;

    @Nullable
    private MediaChunk q;

    public static final class AdaptationCheckpoint {
        public final long allocatedBandwidth;
        public final long totalBandwidth;

        public AdaptationCheckpoint(long totalBandwidth, long allocatedBandwidth) {
            this.totalBandwidth = totalBandwidth;
            this.allocatedBandwidth = allocatedBandwidth;
        }

        public boolean equals(@Nullable Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof AdaptationCheckpoint)) {
                return false;
            }
            AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) o;
            return this.totalBandwidth == adaptationCheckpoint.totalBandwidth && this.allocatedBandwidth == adaptationCheckpoint.allocatedBandwidth;
        }

        public int hashCode() {
            return (((int) this.totalBandwidth) * 31) + ((int) this.allocatedBandwidth);
        }
    }

    public static class Factory implements ExoTrackSelection.Factory {
        private final int a;
        private final int b;
        private final int c;
        private final float d;
        private final float e;
        private final Clock f;

        public Factory() {
            this(10000, 25000, 25000, 0.7f, 0.75f, Clock.DEFAULT);
        }

        public AdaptiveTrackSelection createAdaptiveTrackSelection(TrackGroup group, int[] tracks, int type, BandwidthMeter bandwidthMeter, ImmutableList<AdaptationCheckpoint> adaptationCheckpoints) {
            return new AdaptiveTrackSelection(group, tracks, type, bandwidthMeter, this.a, this.b, this.c, this.d, this.e, adaptationCheckpoints, this.f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
        public final ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitions, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            ImmutableList immutableListF = AdaptiveTrackSelection.f(definitions);
            ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitions.length];
            for (int i = 0; i < definitions.length; i++) {
                ExoTrackSelection.Definition definition = definitions[i];
                if (definition != null) {
                    int[] iArr = definition.tracks;
                    if (iArr.length != 0) {
                        exoTrackSelectionArr[i] = iArr.length == 1 ? new FixedTrackSelection(definition.group, iArr[0], definition.type) : createAdaptiveTrackSelection(definition.group, iArr, definition.type, bandwidthMeter, (ImmutableList) immutableListF.get(i));
                    }
                }
            }
            return exoTrackSelectionArr;
        }

        public Factory(int minDurationForQualityIncreaseMs, int maxDurationForQualityDecreaseMs, int minDurationToRetainAfterDiscardMs, float bandwidthFraction) {
            this(minDurationForQualityIncreaseMs, maxDurationForQualityDecreaseMs, minDurationToRetainAfterDiscardMs, bandwidthFraction, 0.75f, Clock.DEFAULT);
        }

        public Factory(int minDurationForQualityIncreaseMs, int maxDurationForQualityDecreaseMs, int minDurationToRetainAfterDiscardMs, float bandwidthFraction, float bufferedFractionToLiveEdgeForQualityIncrease, Clock clock) {
            this.a = minDurationForQualityIncreaseMs;
            this.b = maxDurationForQualityDecreaseMs;
            this.c = minDurationToRetainAfterDiscardMs;
            this.d = bandwidthFraction;
            this.e = bufferedFractionToLiveEdgeForQualityIncrease;
            this.f = clock;
        }
    }

    public AdaptiveTrackSelection(TrackGroup group, int[] tracks, BandwidthMeter bandwidthMeter) {
        this(group, tracks, 0, bandwidthMeter, 10000L, 25000L, 25000L, 0.7f, 0.75f, ImmutableList.of(), Clock.DEFAULT);
    }

    private static void d(List<ImmutableList.Builder<AdaptationCheckpoint>> checkPointBuilders, long[] checkpointBitrates) {
        long j = 0;
        for (long j2 : checkpointBitrates) {
            j += j2;
        }
        for (int i = 0; i < checkPointBuilders.size(); i++) {
            ImmutableList.Builder<AdaptationCheckpoint> builder = checkPointBuilders.get(i);
            if (builder != null) {
                builder.add(new AdaptationCheckpoint(j, checkpointBitrates[i]));
            }
        }
    }

    private int e(long nowMs, long chunkDurationUs) {
        long jG = g(chunkDurationUs);
        int i = 0;
        for (int i2 = 0; i2 < this.length; i2++) {
            if (nowMs == Long.MIN_VALUE || !isBlacklisted(i2, nowMs)) {
                Format format = getFormat(i2);
                if (canSelectFormat(format, format.bitrate, jG)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList<ImmutableList<AdaptationCheckpoint>> f(ExoTrackSelection.Definition[] definitions) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < definitions.length; i++) {
            if (definitions[i] == null || definitions[i].tracks.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.Builder builder = ImmutableList.builder();
                builder.add(new AdaptationCheckpoint(0L, 0L));
                arrayList.add(builder);
            }
        }
        long[][] jArrJ = j(definitions);
        int[] iArr = new int[jArrJ.length];
        long[] jArr = new long[jArrJ.length];
        for (int i2 = 0; i2 < jArrJ.length; i2++) {
            jArr[i2] = jArrJ[i2].length == 0 ? 0L : jArrJ[i2][0];
        }
        d(arrayList, jArr);
        ImmutableList<Integer> immutableListK = k(jArrJ);
        for (int i3 = 0; i3 < immutableListK.size(); i3++) {
            int iIntValue = immutableListK.get(i3).intValue();
            int i4 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i4;
            jArr[iIntValue] = jArrJ[iIntValue][i4];
            d(arrayList, jArr);
        }
        for (int i5 = 0; i5 < definitions.length; i5++) {
            if (arrayList.get(i5) != null) {
                jArr[i5] = jArr[i5] * 2;
            }
        }
        d(arrayList, jArr);
        ImmutableList.Builder builder2 = ImmutableList.builder();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ImmutableList.Builder builder3 = (ImmutableList.Builder) arrayList.get(i6);
            builder2.add(builder3 == null ? ImmutableList.of() : builder3.build());
        }
        return builder2.build();
    }

    private long g(long chunkDurationUs) {
        long jL = l(chunkDurationUs);
        if (this.k.isEmpty()) {
            return jL;
        }
        int i = 1;
        while (i < this.k.size() - 1 && this.k.get(i).totalBandwidth < jL) {
            i++;
        }
        AdaptationCheckpoint adaptationCheckpoint = this.k.get(i - 1);
        AdaptationCheckpoint adaptationCheckpoint2 = this.k.get(i);
        long j = adaptationCheckpoint.totalBandwidth;
        float f = (jL - j) / (adaptationCheckpoint2.totalBandwidth - j);
        long j2 = adaptationCheckpoint.allocatedBandwidth;
        return j2 + ((long) (f * (adaptationCheckpoint2.allocatedBandwidth - j2)));
    }

    private long h(List<? extends MediaChunk> queue) {
        if (queue.isEmpty()) {
            return C.TIME_UNSET;
        }
        MediaChunk mediaChunk = (MediaChunk) Iterables.getLast(queue);
        long j = mediaChunk.startTimeUs;
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j2 = mediaChunk.endTimeUs;
        return j2 != C.TIME_UNSET ? j2 - j : C.TIME_UNSET;
    }

    private long i(MediaChunkIterator[] mediaChunkIterators, List<? extends MediaChunk> queue) {
        int i = this.n;
        if (i < mediaChunkIterators.length && mediaChunkIterators[i].next()) {
            MediaChunkIterator mediaChunkIterator = mediaChunkIterators[this.n];
            return mediaChunkIterator.getChunkEndTimeUs() - mediaChunkIterator.getChunkStartTimeUs();
        }
        for (MediaChunkIterator mediaChunkIterator2 : mediaChunkIterators) {
            if (mediaChunkIterator2.next()) {
                return mediaChunkIterator2.getChunkEndTimeUs() - mediaChunkIterator2.getChunkStartTimeUs();
            }
        }
        return h(queue);
    }

    private static long[][] j(ExoTrackSelection.Definition[] definitions) {
        long[][] jArr = new long[definitions.length][];
        for (int i = 0; i < definitions.length; i++) {
            ExoTrackSelection.Definition definition = definitions[i];
            if (definition == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[definition.tracks.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = definition.tracks;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    jArr[i][i2] = definition.group.getFormat(iArr[i2]).bitrate;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    private static ImmutableList<Integer> k(long[][] trackBitrates) {
        Multimap multimapBuild = MultimapBuilder.treeKeys().arrayListValues().build();
        for (int i = 0; i < trackBitrates.length; i++) {
            if (trackBitrates[i].length > 1) {
                int length = trackBitrates[i].length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    double dLog = 0.0d;
                    if (i2 >= trackBitrates[i].length) {
                        break;
                    }
                    if (trackBitrates[i][i2] != -1) {
                        dLog = Math.log(trackBitrates[i][i2]);
                    }
                    dArr[i2] = dLog;
                    i2++;
                }
                int i3 = length - 1;
                double d = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d2 = dArr[i4];
                    i4++;
                    multimapBuild.put(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i4]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i));
                }
            }
        }
        return ImmutableList.copyOf(multimapBuild.values());
    }

    private long l(long chunkDurationUs) {
        long bitrateEstimate = (long) (this.e.getBitrateEstimate() * this.i);
        long timeToFirstByteEstimateUs = this.e.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == C.TIME_UNSET || chunkDurationUs == C.TIME_UNSET) {
            return (long) (bitrateEstimate / this.m);
        }
        float f = chunkDurationUs;
        return (long) ((bitrateEstimate * Math.max((f / this.m) - timeToFirstByteEstimateUs, 0.0f)) / f);
    }

    private long m(long availableDurationUs) {
        return (availableDurationUs > C.TIME_UNSET ? 1 : (availableDurationUs == C.TIME_UNSET ? 0 : -1)) != 0 && (availableDurationUs > this.f ? 1 : (availableDurationUs == this.f ? 0 : -1)) <= 0 ? (long) (availableDurationUs * this.j) : this.f;
    }

    public boolean canSelectFormat(Format format, int trackBitrate, long effectiveBitrate) {
        return ((long) trackBitrate) <= effectiveBitrate;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @CallSuper
    public void disable() {
        this.q = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @CallSuper
    public void enable() {
        this.p = C.TIME_UNSET;
        this.q = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long playbackPositionUs, List<? extends MediaChunk> queue) {
        int i;
        int i2;
        long jElapsedRealtime = this.l.elapsedRealtime();
        if (!shouldEvaluateQueueSize(jElapsedRealtime, queue)) {
            return queue.size();
        }
        this.p = jElapsedRealtime;
        this.q = queue.isEmpty() ? null : (MediaChunk) Iterables.getLast(queue);
        if (queue.isEmpty()) {
            return 0;
        }
        int size = queue.size();
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(queue.get(size - 1).startTimeUs - playbackPositionUs, this.m);
        long minDurationToRetainAfterDiscardUs = getMinDurationToRetainAfterDiscardUs();
        if (playoutDurationForMediaDuration < minDurationToRetainAfterDiscardUs) {
            return size;
        }
        Format format = getFormat(e(jElapsedRealtime, h(queue)));
        for (int i3 = 0; i3 < size; i3++) {
            MediaChunk mediaChunk = queue.get(i3);
            Format format2 = mediaChunk.trackFormat;
            if (Util.getPlayoutDurationForMediaDuration(mediaChunk.startTimeUs - playbackPositionUs, this.m) >= minDurationToRetainAfterDiscardUs && format2.bitrate < format.bitrate && (i = format2.height) != -1 && i < 720 && (i2 = format2.width) != -1 && i2 < 1280 && i < format.height) {
                return i3;
            }
        }
        return size;
    }

    public long getMinDurationToRetainAfterDiscardUs() {
        return this.h;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.n;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @Nullable
    public Object getSelectionData() {
        return null;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.o;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float playbackSpeed) {
        this.m = playbackSpeed;
    }

    public boolean shouldEvaluateQueueSize(long nowMs, List<? extends MediaChunk> queue) {
        long j = this.p;
        return j == C.TIME_UNSET || nowMs - j >= 1000 || !(queue.isEmpty() || ((MediaChunk) Iterables.getLast(queue)).equals(this.q));
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long playbackPositionUs, long bufferedDurationUs, long availableDurationUs, List<? extends MediaChunk> queue, MediaChunkIterator[] mediaChunkIterators) {
        long jElapsedRealtime = this.l.elapsedRealtime();
        long jI = i(mediaChunkIterators, queue);
        int i = this.o;
        if (i == 0) {
            this.o = 1;
            this.n = e(jElapsedRealtime, jI);
            return;
        }
        int i2 = this.n;
        int iIndexOf = queue.isEmpty() ? -1 : indexOf(((MediaChunk) Iterables.getLast(queue)).trackFormat);
        if (iIndexOf != -1) {
            i = ((MediaChunk) Iterables.getLast(queue)).trackSelectionReason;
            i2 = iIndexOf;
        }
        int iE = e(jElapsedRealtime, jI);
        if (!isBlacklisted(i2, jElapsedRealtime)) {
            Format format = getFormat(i2);
            Format format2 = getFormat(iE);
            if ((format2.bitrate > format.bitrate && bufferedDurationUs < m(availableDurationUs)) || (format2.bitrate < format.bitrate && bufferedDurationUs >= this.g)) {
                iE = i2;
            }
        }
        if (iE != i2) {
            i = 3;
        }
        this.o = i;
        this.n = iE;
    }

    public AdaptiveTrackSelection(TrackGroup group, int[] tracks, int type, BandwidthMeter bandwidthMeter, long minDurationForQualityIncreaseMs, long maxDurationForQualityDecreaseMs, long minDurationToRetainAfterDiscardMs, float bandwidthFraction, float bufferedFractionToLiveEdgeForQualityIncrease, List<AdaptationCheckpoint> adaptationCheckpoints, Clock clock) {
        super(group, tracks, type);
        if (minDurationToRetainAfterDiscardMs < minDurationForQualityIncreaseMs) {
            Log.w(r, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            minDurationToRetainAfterDiscardMs = minDurationForQualityIncreaseMs;
        }
        this.e = bandwidthMeter;
        this.f = minDurationForQualityIncreaseMs * 1000;
        this.g = maxDurationForQualityDecreaseMs * 1000;
        this.h = minDurationToRetainAfterDiscardMs * 1000;
        this.i = bandwidthFraction;
        this.j = bufferedFractionToLiveEdgeForQualityIncrease;
        this.k = ImmutableList.copyOf((Collection) adaptationCheckpoints);
        this.l = clock;
        this.m = 1.0f;
        this.o = 0;
        this.p = C.TIME_UNSET;
    }
}
