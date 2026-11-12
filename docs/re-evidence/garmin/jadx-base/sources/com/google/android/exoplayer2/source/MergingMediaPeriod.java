package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
final class MergingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    private MediaPeriod.Callback callback;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final MediaPeriod[] periods;
    private TrackGroupArray trackGroups;
    private final ArrayList<MediaPeriod> childrenPendingPreparation = new ArrayList<>();
    private final HashMap<TrackGroup, TrackGroup> childTrackGroupByMergedTrackGroup = new HashMap<>();
    private final IdentityHashMap<SampleStream, Integer> streamPeriodIndices = new IdentityHashMap<>();
    private MediaPeriod[] enabledPeriods = new MediaPeriod[0];

    public static final class TimeOffsetMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
        private MediaPeriod.Callback callback;
        private final MediaPeriod mediaPeriod;
        private final long timeOffsetUs;

        public TimeOffsetMediaPeriod(MediaPeriod mediaPeriod, long j8) {
            this.mediaPeriod = mediaPeriod;
            this.timeOffsetUs = j8;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long j8) {
            return this.mediaPeriod.continueLoading(j8 - this.timeOffsetUs);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long j8, boolean z14) {
            this.mediaPeriod.discardBuffer(j8 - this.timeOffsetUs, z14);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j8, SeekParameters seekParameters) {
            return this.mediaPeriod.getAdjustedSeekPositionUs(j8 - this.timeOffsetUs, seekParameters) + this.timeOffsetUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
            long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
            if (bufferedPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return bufferedPositionUs + this.timeOffsetUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return nextLoadPositionUs + this.timeOffsetUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
            return this.mediaPeriod.getStreamKeys(list);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return this.mediaPeriod.getTrackGroups();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
            return this.mediaPeriod.isLoading();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() {
            this.mediaPeriod.maybeThrowPrepareError();
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long j8) {
            this.callback = callback;
            this.mediaPeriod.prepare(this, j8 - this.timeOffsetUs);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
            long discontinuity = this.mediaPeriod.readDiscontinuity();
            return discontinuity == C.TIME_UNSET ? C.TIME_UNSET : discontinuity + this.timeOffsetUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long j8) {
            this.mediaPeriod.reevaluateBuffer(j8 - this.timeOffsetUs);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long j8) {
            return this.mediaPeriod.seekToUs(j8 - this.timeOffsetUs) + this.timeOffsetUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j8) {
            SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
            int i14 = 0;
            while (true) {
                SampleStream childStream = null;
                if (i14 >= sampleStreamArr.length) {
                    break;
                }
                TimeOffsetSampleStream timeOffsetSampleStream = (TimeOffsetSampleStream) sampleStreamArr[i14];
                if (timeOffsetSampleStream != null) {
                    childStream = timeOffsetSampleStream.getChildStream();
                }
                sampleStreamArr2[i14] = childStream;
                i14++;
            }
            long jSelectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j8 - this.timeOffsetUs);
            for (int i15 = 0; i15 < sampleStreamArr.length; i15++) {
                SampleStream sampleStream = sampleStreamArr2[i15];
                if (sampleStream == null) {
                    sampleStreamArr[i15] = null;
                } else {
                    SampleStream sampleStream2 = sampleStreamArr[i15];
                    if (sampleStream2 == null || ((TimeOffsetSampleStream) sampleStream2).getChildStream() != sampleStream) {
                        sampleStreamArr[i15] = new TimeOffsetSampleStream(sampleStream, this.timeOffsetUs);
                    }
                }
            }
            return jSelectTracks + this.timeOffsetUs;
        }
    }

    public static final class TimeOffsetSampleStream implements SampleStream {
        private final SampleStream sampleStream;
        private final long timeOffsetUs;

        public TimeOffsetSampleStream(SampleStream sampleStream, long j8) {
            this.sampleStream = sampleStream;
            this.timeOffsetUs = j8;
        }

        public SampleStream getChildStream() {
            return this.sampleStream;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return this.sampleStream.isReady();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() {
            this.sampleStream.maybeThrowError();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i14) {
            int data = this.sampleStream.readData(formatHolder, decoderInputBuffer, i14);
            if (data == -4) {
                decoderInputBuffer.timeUs = Math.max(0L, decoderInputBuffer.timeUs + this.timeOffsetUs);
            }
            return data;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j8) {
            return this.sampleStream.skipData(j8 - this.timeOffsetUs);
        }
    }

    public MergingMediaPeriod(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, long[] jArr, MediaPeriod... mediaPeriodArr) {
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.periods = mediaPeriodArr;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(new SequenceableLoader[0]);
        for (int i14 = 0; i14 < mediaPeriodArr.length; i14++) {
            long j8 = jArr[i14];
            if (j8 != 0) {
                this.periods[i14] = new TimeOffsetMediaPeriod(mediaPeriodArr[i14], j8);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j8) {
        if (this.childrenPendingPreparation.isEmpty()) {
            return this.compositeSequenceableLoader.continueLoading(j8);
        }
        int size = this.childrenPendingPreparation.size();
        for (int i14 = 0; i14 < size; i14++) {
            this.childrenPendingPreparation.get(i14).continueLoading(j8);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j8, boolean z14) {
        for (MediaPeriod mediaPeriod : this.enabledPeriods) {
            mediaPeriod.discardBuffer(j8, z14);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j8, SeekParameters seekParameters) {
        MediaPeriod[] mediaPeriodArr = this.enabledPeriods;
        return (mediaPeriodArr.length > 0 ? mediaPeriodArr[0] : this.periods[0]).getAdjustedSeekPositionUs(j8, seekParameters);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    public MediaPeriod getChildPeriod(int i14) {
        MediaPeriod mediaPeriod = this.periods[i14];
        return mediaPeriod instanceof TimeOffsetMediaPeriod ? ((TimeOffsetMediaPeriod) mediaPeriod).mediaPeriod : mediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return (TrackGroupArray) Assertions.checkNotNull(this.trackGroups);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() {
        for (MediaPeriod mediaPeriod : this.periods) {
            mediaPeriod.maybeThrowPrepareError();
        }
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.childrenPendingPreparation.remove(mediaPeriod);
        if (!this.childrenPendingPreparation.isEmpty()) {
            return;
        }
        int i14 = 0;
        for (MediaPeriod mediaPeriod2 : this.periods) {
            i14 += mediaPeriod2.getTrackGroups().length;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i14];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.periods;
            if (i15 >= mediaPeriodArr.length) {
                this.trackGroups = new TrackGroupArray(trackGroupArr);
                ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
                return;
            }
            TrackGroupArray trackGroups = mediaPeriodArr[i15].getTrackGroups();
            int i17 = trackGroups.length;
            int i18 = 0;
            while (i18 < i17) {
                TrackGroup trackGroup = trackGroups.get(i18);
                String str = trackGroup.f53055id;
                StringBuilder sb3 = new StringBuilder(v.a(12, str));
                sb3.append(i15);
                sb3.append(":");
                sb3.append(str);
                TrackGroup trackGroupCopyWithId = trackGroup.copyWithId(sb3.toString());
                this.childTrackGroupByMergedTrackGroup.put(trackGroupCopyWithId, trackGroup);
                trackGroupArr[i16] = trackGroupCopyWithId;
                i18++;
                i16++;
            }
            i15++;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j8) {
        this.callback = callback;
        Collections.addAll(this.childrenPendingPreparation, this.periods);
        for (MediaPeriod mediaPeriod : this.periods) {
            mediaPeriod.prepare(this, j8);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        long j8 = -9223372036854775807L;
        for (MediaPeriod mediaPeriod : this.enabledPeriods) {
            long discontinuity = mediaPeriod.readDiscontinuity();
            if (discontinuity == C.TIME_UNSET) {
                if (j8 != C.TIME_UNSET && mediaPeriod.seekToUs(j8) != j8) {
                    vb.h.z("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j8 == C.TIME_UNSET) {
                for (MediaPeriod mediaPeriod2 : this.enabledPeriods) {
                    if (mediaPeriod2 == mediaPeriod) {
                        break;
                    }
                    if (mediaPeriod2.seekToUs(discontinuity) != discontinuity) {
                        vb.h.z("Unexpected child seekToUs result.");
                        return 0L;
                    }
                }
                j8 = discontinuity;
            } else if (discontinuity != j8) {
                vb.h.z("Conflicting discontinuities.");
                return 0L;
            }
        }
        return j8;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j8) {
        this.compositeSequenceableLoader.reevaluateBuffer(j8);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j8) {
        long jSeekToUs = this.enabledPeriods[0].seekToUs(j8);
        int i14 = 1;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.enabledPeriods;
            if (i14 >= mediaPeriodArr.length) {
                return jSeekToUs;
            }
            if (mediaPeriodArr[i14].seekToUs(jSeekToUs) != jSeekToUs) {
                vb.h.z("Unexpected child seekToUs result.");
                return 0L;
            }
            i14++;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j8) {
        int[] iArr = new int[exoTrackSelectionArr.length];
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        for (int i14 = 0; i14 < exoTrackSelectionArr.length; i14++) {
            SampleStream sampleStream = sampleStreamArr[i14];
            Integer num = sampleStream == null ? null : this.streamPeriodIndices.get(sampleStream);
            iArr[i14] = num == null ? -1 : num.intValue();
            iArr2[i14] = -1;
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i14];
            if (exoTrackSelection != null) {
                TrackGroup trackGroup = (TrackGroup) Assertions.checkNotNull(this.childTrackGroupByMergedTrackGroup.get(exoTrackSelection.getTrackGroup()));
                int i15 = 0;
                while (true) {
                    MediaPeriod[] mediaPeriodArr = this.periods;
                    if (i15 >= mediaPeriodArr.length) {
                        break;
                    }
                    if (mediaPeriodArr[i15].getTrackGroups().indexOf(trackGroup) != -1) {
                        iArr2[i14] = i15;
                        break;
                    }
                    i15++;
                }
            }
        }
        this.streamPeriodIndices.clear();
        int length = exoTrackSelectionArr.length;
        SampleStream[] sampleStreamArr2 = new SampleStream[length];
        SampleStream[] sampleStreamArr3 = new SampleStream[exoTrackSelectionArr.length];
        ExoTrackSelection[] exoTrackSelectionArr2 = new ExoTrackSelection[exoTrackSelectionArr.length];
        ArrayList arrayList = new ArrayList(this.periods.length);
        long j14 = j8;
        int i16 = 0;
        while (i16 < this.periods.length) {
            for (int i17 = 0; i17 < exoTrackSelectionArr.length; i17++) {
                sampleStreamArr3[i17] = iArr[i17] == i16 ? sampleStreamArr[i17] : null;
                if (iArr2[i17] == i16) {
                    ExoTrackSelection exoTrackSelection2 = (ExoTrackSelection) Assertions.checkNotNull(exoTrackSelectionArr[i17]);
                    exoTrackSelectionArr2[i17] = new ForwardingTrackSelection(exoTrackSelection2, (TrackGroup) Assertions.checkNotNull(this.childTrackGroupByMergedTrackGroup.get(exoTrackSelection2.getTrackGroup())));
                } else {
                    exoTrackSelectionArr2[i17] = null;
                }
            }
            int i18 = i16;
            long jSelectTracks = this.periods[i16].selectTracks(exoTrackSelectionArr2, zArr, sampleStreamArr3, zArr2, j14);
            if (i18 == 0) {
                j14 = jSelectTracks;
            } else if (jSelectTracks != j14) {
                vb.h.z("Children enabled at different positions.");
                return 0L;
            }
            boolean z14 = false;
            for (int i19 = 0; i19 < exoTrackSelectionArr.length; i19++) {
                if (iArr2[i19] == i18) {
                    SampleStream sampleStream2 = (SampleStream) Assertions.checkNotNull(sampleStreamArr3[i19]);
                    sampleStreamArr2[i19] = sampleStreamArr3[i19];
                    this.streamPeriodIndices.put(sampleStream2, Integer.valueOf(i18));
                    z14 = true;
                } else if (iArr[i19] == i18) {
                    Assertions.checkState(sampleStreamArr3[i19] == null);
                }
            }
            if (z14) {
                arrayList.add(this.periods[i18]);
            }
            i16 = i18 + 1;
        }
        System.arraycopy(sampleStreamArr2, 0, sampleStreamArr, 0, length);
        MediaPeriod[] mediaPeriodArr2 = (MediaPeriod[]) arrayList.toArray(new MediaPeriod[0]);
        this.enabledPeriods = mediaPeriodArr2;
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(mediaPeriodArr2);
        return j14;
    }

    public static final class ForwardingTrackSelection implements ExoTrackSelection {
        private final TrackGroup trackGroup;
        private final ExoTrackSelection trackSelection;

        public ForwardingTrackSelection(ExoTrackSelection exoTrackSelection, TrackGroup trackGroup) {
            this.trackSelection = exoTrackSelection;
            this.trackGroup = trackGroup;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public boolean blacklist(int i14, long j8) {
            return this.trackSelection.blacklist(i14, j8);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void disable() {
            this.trackSelection.disable();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void enable() {
            this.trackSelection.enable();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int evaluateQueueSize(long j8, List<? extends MediaChunk> list) {
            return this.trackSelection.evaluateQueueSize(j8, list);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public Format getFormat(int i14) {
            return this.trackSelection.getFormat(i14);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int getIndexInTrackGroup(int i14) {
            return this.trackSelection.getIndexInTrackGroup(i14);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public Format getSelectedFormat() {
            return this.trackSelection.getSelectedFormat();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return this.trackSelection.getSelectedIndex();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndexInTrackGroup() {
            return this.trackSelection.getSelectedIndexInTrackGroup();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public Object getSelectionData() {
            return this.trackSelection.getSelectionData();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return this.trackSelection.getSelectionReason();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public TrackGroup getTrackGroup() {
            return this.trackGroup;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int getType() {
            return this.trackSelection.getType();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int indexOf(Format format) {
            return this.trackSelection.indexOf(format);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public boolean isBlacklisted(int i14, long j8) {
            return this.trackSelection.isBlacklisted(i14, j8);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int length() {
            return this.trackSelection.length();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onDiscontinuity() {
            this.trackSelection.onDiscontinuity();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onPlayWhenReadyChanged(boolean z14) {
            this.trackSelection.onPlayWhenReadyChanged(z14);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onPlaybackSpeed(float f14) {
            this.trackSelection.onPlaybackSpeed(f14);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onRebuffer() {
            this.trackSelection.onRebuffer();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public boolean shouldCancelChunkLoad(long j8, Chunk chunk, List<? extends MediaChunk> list) {
            return this.trackSelection.shouldCancelChunkLoad(j8, chunk, list);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j8, long j14, long j15, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
            this.trackSelection.updateSelectedTrack(j8, j14, j15, list, mediaChunkIteratorArr);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int indexOf(int i14) {
            return this.trackSelection.indexOf(i14);
        }
    }
}
