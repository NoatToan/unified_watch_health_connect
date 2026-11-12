package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class d implements MediaPeriod, MediaPeriod.Callback {
    private final MediaPeriod[] a;
    private final CompositeSequenceableLoaderFactory c;

    @Nullable
    private MediaPeriod.Callback e;

    @Nullable
    private TrackGroupArray f;
    private SequenceableLoader h;
    private final ArrayList<MediaPeriod> d = new ArrayList<>();
    private final IdentityHashMap<SampleStream, Integer> b = new IdentityHashMap<>();
    private MediaPeriod[] g = new MediaPeriod[0];

    public static final class a implements MediaPeriod, MediaPeriod.Callback {
        private final MediaPeriod a;
        private final long b;
        private MediaPeriod.Callback c;

        public a(MediaPeriod mediaPeriod, long timeOffsetUs) {
            this.a = mediaPeriod;
            this.b = timeOffsetUs;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onContinueLoadingRequested(MediaPeriod source) {
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.c)).onContinueLoadingRequested(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long positionUs) {
            return this.a.continueLoading(positionUs - this.b);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long positionUs, boolean toKeyframe) {
            this.a.discardBuffer(positionUs - this.b, toKeyframe);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
            return this.a.getAdjustedSeekPositionUs(positionUs - this.b, seekParameters) + this.b;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
            long bufferedPositionUs = this.a.getBufferedPositionUs();
            if (bufferedPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.b + bufferedPositionUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            long nextLoadPositionUs = this.a.getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.b + nextLoadPositionUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public List<StreamKey> getStreamKeys(List<ExoTrackSelection> trackSelections) {
            return this.a.getStreamKeys(trackSelections);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return this.a.getTrackGroups();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
            return this.a.isLoading();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() throws IOException {
            this.a.maybeThrowPrepareError();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.c)).onPrepared(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long positionUs) {
            this.c = callback;
            this.a.prepare(this, positionUs - this.b);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
            long discontinuity = this.a.readDiscontinuity();
            return discontinuity == C.TIME_UNSET ? C.TIME_UNSET : this.b + discontinuity;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long positionUs) {
            this.a.reevaluateBuffer(positionUs - this.b);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long positionUs) {
            return this.a.seekToUs(positionUs - this.b) + this.b;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
            SampleStream[] sampleStreamArr = new SampleStream[streams.length];
            int i = 0;
            while (true) {
                SampleStream sampleStreamA = null;
                if (i >= streams.length) {
                    break;
                }
                b bVar = (b) streams[i];
                if (bVar != null) {
                    sampleStreamA = bVar.a();
                }
                sampleStreamArr[i] = sampleStreamA;
                i++;
            }
            long jSelectTracks = this.a.selectTracks(selections, mayRetainStreamFlags, sampleStreamArr, streamResetFlags, positionUs - this.b);
            for (int i2 = 0; i2 < streams.length; i2++) {
                SampleStream sampleStream = sampleStreamArr[i2];
                if (sampleStream == null) {
                    streams[i2] = null;
                } else if (streams[i2] == null || ((b) streams[i2]).a() != sampleStream) {
                    streams[i2] = new b(sampleStream, this.b);
                }
            }
            return jSelectTracks + this.b;
        }
    }

    public static final class b implements SampleStream {
        private final SampleStream a;
        private final long b;

        public b(SampleStream sampleStream, long timeOffsetUs) {
            this.a = sampleStream;
            this.b = timeOffsetUs;
        }

        public SampleStream a() {
            return this.a;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return this.a.isReady();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
            this.a.maybeThrowError();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
            int data = this.a.readData(formatHolder, buffer, readFlags);
            if (data == -4) {
                buffer.timeUs = Math.max(0L, buffer.timeUs + this.b);
            }
            return data;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long positionUs) {
            return this.a.skipData(positionUs - this.b);
        }
    }

    public d(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, long[] periodTimeOffsetsUs, MediaPeriod... periods) {
        this.c = compositeSequenceableLoaderFactory;
        this.a = periods;
        this.h = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(new SequenceableLoader[0]);
        for (int i = 0; i < periods.length; i++) {
            if (periodTimeOffsetsUs[i] != 0) {
                this.a[i] = new a(periods[i], periodTimeOffsetsUs[i]);
            }
        }
    }

    public MediaPeriod a(int index) {
        MediaPeriod[] mediaPeriodArr = this.a;
        return mediaPeriodArr[index] instanceof a ? ((a) mediaPeriodArr[index]).a : mediaPeriodArr[index];
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onContinueLoadingRequested(MediaPeriod ignored) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.e)).onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long positionUs) {
        if (this.d.isEmpty()) {
            return this.h.continueLoading(positionUs);
        }
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            this.d.get(i).continueLoading(positionUs);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long positionUs, boolean toKeyframe) {
        for (MediaPeriod mediaPeriod : this.g) {
            mediaPeriod.discardBuffer(positionUs, toKeyframe);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
        MediaPeriod[] mediaPeriodArr = this.g;
        return (mediaPeriodArr.length > 0 ? mediaPeriodArr[0] : this.a[0]).getAdjustedSeekPositionUs(positionUs, seekParameters);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.h.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.h.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public /* synthetic */ List getStreamKeys(List list) {
        return com.google.android.exoplayer2.source.a.a(this, list);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return (TrackGroupArray) Assertions.checkNotNull(this.f);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.h.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        for (MediaPeriod mediaPeriod : this.a) {
            mediaPeriod.maybeThrowPrepareError();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod preparedPeriod) {
        this.d.remove(preparedPeriod);
        if (this.d.isEmpty()) {
            int i = 0;
            for (MediaPeriod mediaPeriod : this.a) {
                i += mediaPeriod.getTrackGroups().length;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i];
            int i2 = 0;
            for (MediaPeriod mediaPeriod2 : this.a) {
                TrackGroupArray trackGroups = mediaPeriod2.getTrackGroups();
                int i3 = trackGroups.length;
                int i4 = 0;
                while (i4 < i3) {
                    trackGroupArr[i2] = trackGroups.get(i4);
                    i4++;
                    i2++;
                }
            }
            this.f = new TrackGroupArray(trackGroupArr);
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.e)).onPrepared(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long positionUs) {
        this.e = callback;
        Collections.addAll(this.d, this.a);
        for (MediaPeriod mediaPeriod : this.a) {
            mediaPeriod.prepare(this, positionUs);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        long j = -9223372036854775807L;
        for (MediaPeriod mediaPeriod : this.g) {
            long discontinuity = mediaPeriod.readDiscontinuity();
            if (discontinuity == C.TIME_UNSET) {
                if (j != C.TIME_UNSET && mediaPeriod.seekToUs(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == C.TIME_UNSET) {
                for (MediaPeriod mediaPeriod2 : this.g) {
                    if (mediaPeriod2 == mediaPeriod) {
                        break;
                    }
                    if (mediaPeriod2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = discontinuity;
            } else if (discontinuity != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long positionUs) {
        this.h.reevaluateBuffer(positionUs);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long positionUs) {
        long jSeekToUs = this.g[0].seekToUs(positionUs);
        int i = 1;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.g;
            if (i >= mediaPeriodArr.length) {
                return jSeekToUs;
            }
            if (mediaPeriodArr[i].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
        int[] iArr = new int[selections.length];
        int[] iArr2 = new int[selections.length];
        for (int i = 0; i < selections.length; i++) {
            Integer num = streams[i] == null ? null : this.b.get(streams[i]);
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            if (selections[i] != null) {
                TrackGroup trackGroup = selections[i].getTrackGroup();
                int i2 = 0;
                while (true) {
                    MediaPeriod[] mediaPeriodArr = this.a;
                    if (i2 >= mediaPeriodArr.length) {
                        break;
                    }
                    if (mediaPeriodArr[i2].getTrackGroups().indexOf(trackGroup) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        this.b.clear();
        int length = selections.length;
        SampleStream[] sampleStreamArr = new SampleStream[length];
        SampleStream[] sampleStreamArr2 = new SampleStream[selections.length];
        ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[selections.length];
        ArrayList arrayList = new ArrayList(this.a.length);
        long j = positionUs;
        int i3 = 0;
        while (i3 < this.a.length) {
            for (int i4 = 0; i4 < selections.length; i4++) {
                sampleStreamArr2[i4] = iArr[i4] == i3 ? streams[i4] : null;
                exoTrackSelectionArr[i4] = iArr2[i4] == i3 ? selections[i4] : null;
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            ExoTrackSelection[] exoTrackSelectionArr2 = exoTrackSelectionArr;
            long jSelectTracks = this.a[i3].selectTracks(exoTrackSelectionArr, mayRetainStreamFlags, sampleStreamArr2, streamResetFlags, j);
            if (i5 == 0) {
                j = jSelectTracks;
            } else if (jSelectTracks != j) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < selections.length; i6++) {
                if (iArr2[i6] == i5) {
                    SampleStream sampleStream = (SampleStream) Assertions.checkNotNull(sampleStreamArr2[i6]);
                    sampleStreamArr[i6] = sampleStreamArr2[i6];
                    this.b.put(sampleStream, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    Assertions.checkState(sampleStreamArr2[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.a[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            exoTrackSelectionArr = exoTrackSelectionArr2;
        }
        System.arraycopy(sampleStreamArr, 0, streams, 0, length);
        MediaPeriod[] mediaPeriodArr2 = (MediaPeriod[]) arrayList.toArray(new MediaPeriod[0]);
        this.g = mediaPeriodArr2;
        this.h = this.c.createCompositeSequenceableLoader(mediaPeriodArr2);
        return j;
    }
}
