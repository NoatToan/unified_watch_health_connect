package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ClippingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {

    @Nullable
    private MediaPeriod.Callback a;
    private a[] b = new a[0];
    private long c;
    public long d;
    public long e;
    public final MediaPeriod mediaPeriod;

    public final class a implements SampleStream {
        public final SampleStream a;
        private boolean b;

        public a(SampleStream childStream) {
            this.a = childStream;
        }

        public void a() {
            this.b = false;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return !ClippingMediaPeriod.this.b() && this.a.isReady();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
            this.a.maybeThrowError();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
            if (ClippingMediaPeriod.this.b()) {
                return -3;
            }
            if (this.b) {
                buffer.setFlags(4);
                return -4;
            }
            int data = this.a.readData(formatHolder, buffer, readFlags);
            if (data == -5) {
                Format format = (Format) Assertions.checkNotNull(formatHolder.format);
                int i = format.encoderDelay;
                if (i != 0 || format.encoderPadding != 0) {
                    ClippingMediaPeriod clippingMediaPeriod = ClippingMediaPeriod.this;
                    if (clippingMediaPeriod.d != 0) {
                        i = 0;
                    }
                    formatHolder.format = format.buildUpon().setEncoderDelay(i).setEncoderPadding(clippingMediaPeriod.e == Long.MIN_VALUE ? format.encoderPadding : 0).build();
                }
                return -5;
            }
            ClippingMediaPeriod clippingMediaPeriod2 = ClippingMediaPeriod.this;
            long j = clippingMediaPeriod2.e;
            if (j == Long.MIN_VALUE || ((data != -4 || buffer.timeUs < j) && !(data == -3 && clippingMediaPeriod2.getBufferedPositionUs() == Long.MIN_VALUE && !buffer.waitingForKeys))) {
                return data;
            }
            buffer.clear();
            buffer.setFlags(4);
            this.b = true;
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long positionUs) {
            if (ClippingMediaPeriod.this.b()) {
                return -3;
            }
            return this.a.skipData(positionUs);
        }
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean enableInitialDiscontinuity, long startUs, long endUs) {
        this.mediaPeriod = mediaPeriod;
        this.c = enableInitialDiscontinuity ? startUs : C.TIME_UNSET;
        this.d = startUs;
        this.e = endUs;
    }

    private SeekParameters a(long positionUs, SeekParameters seekParameters) {
        long jConstrainValue = Util.constrainValue(seekParameters.toleranceBeforeUs, 0L, positionUs - this.d);
        long j = seekParameters.toleranceAfterUs;
        long j2 = this.e;
        long jConstrainValue2 = Util.constrainValue(j, 0L, j2 == Long.MIN_VALUE ? Long.MAX_VALUE : j2 - positionUs);
        return (jConstrainValue == seekParameters.toleranceBeforeUs && jConstrainValue2 == seekParameters.toleranceAfterUs) ? seekParameters : new SeekParameters(jConstrainValue, jConstrainValue2);
    }

    private static boolean c(long startUs, ExoTrackSelection[] selections) {
        if (startUs != 0) {
            for (ExoTrackSelection exoTrackSelection : selections) {
                if (exoTrackSelection != null) {
                    Format selectedFormat = exoTrackSelection.getSelectedFormat();
                    if (!MimeTypes.allSamplesAreSyncSamples(selectedFormat.sampleMimeType, selectedFormat.codecs)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean b() {
        return this.c != C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long positionUs) {
        return this.mediaPeriod.continueLoading(positionUs);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long positionUs, boolean toKeyframe) {
        this.mediaPeriod.discardBuffer(positionUs, toKeyframe);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
        long j = this.d;
        if (positionUs == j) {
            return j;
        }
        return this.mediaPeriod.getAdjustedSeekPositionUs(positionUs, a(positionUs, seekParameters));
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j = this.e;
            if (j == Long.MIN_VALUE || bufferedPositionUs < j) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j = this.e;
            if (j == Long.MIN_VALUE || nextLoadPositionUs < j) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public /* synthetic */ List getStreamKeys(List list) {
        return com.google.android.exoplayer2.source.a.a(this, list);
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
    public void maybeThrowPrepareError() throws IOException {
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.a)).onPrepared(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long positionUs) {
        this.a = callback;
        this.mediaPeriod.prepare(this, positionUs);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        if (b()) {
            long j = this.c;
            this.c = C.TIME_UNSET;
            long discontinuity = readDiscontinuity();
            return discontinuity != C.TIME_UNSET ? discontinuity : j;
        }
        long discontinuity2 = this.mediaPeriod.readDiscontinuity();
        if (discontinuity2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        boolean z = true;
        Assertions.checkState(discontinuity2 >= this.d);
        long j2 = this.e;
        if (j2 != Long.MIN_VALUE && discontinuity2 > j2) {
            z = false;
        }
        Assertions.checkState(z);
        return discontinuity2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long positionUs) {
        this.mediaPeriod.reevaluateBuffer(positionUs);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long positionUs) {
        this.c = C.TIME_UNSET;
        boolean z = false;
        for (a aVar : this.b) {
            if (aVar != null) {
                aVar.a();
            }
        }
        long jSeekToUs = this.mediaPeriod.seekToUs(positionUs);
        if (jSeekToUs == positionUs) {
            z = true;
        } else if (jSeekToUs >= this.d) {
            long j = this.e;
            if (j == Long.MIN_VALUE || jSeekToUs <= j) {
                z = true;
            }
        }
        Assertions.checkState(z);
        return jSeekToUs;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
        long j;
        boolean z;
        this.b = new a[streams.length];
        SampleStream[] sampleStreamArr = new SampleStream[streams.length];
        int i = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i >= streams.length) {
                break;
            }
            a[] aVarArr = this.b;
            aVarArr[i] = (a) streams[i];
            if (aVarArr[i] != null) {
                sampleStream = aVarArr[i].a;
            }
            sampleStreamArr[i] = sampleStream;
            i++;
        }
        long jSelectTracks = this.mediaPeriod.selectTracks(selections, mayRetainStreamFlags, sampleStreamArr, streamResetFlags, positionUs);
        if (b()) {
            long j2 = this.d;
            if (positionUs == j2 && c(j2, selections)) {
                j = jSelectTracks;
            } else {
                j = C.TIME_UNSET;
            }
        } else {
            j = C.TIME_UNSET;
        }
        this.c = j;
        if (jSelectTracks != positionUs) {
            if (jSelectTracks >= this.d) {
                long j3 = this.e;
                z = j3 == Long.MIN_VALUE || jSelectTracks <= j3;
            }
        }
        Assertions.checkState(z);
        for (int i2 = 0; i2 < streams.length; i2++) {
            if (sampleStreamArr[i2] == null) {
                this.b[i2] = null;
            } else {
                a[] aVarArr2 = this.b;
                if (aVarArr2[i2] == null || aVarArr2[i2].a != sampleStreamArr[i2]) {
                    aVarArr2[i2] = new a(sampleStreamArr[i2]);
                }
            }
            streams[i2] = this.b[i2];
        }
        return jSelectTracks;
    }

    public void updateClipping(long startUs, long endUs) {
        this.d = startUs;
        this.e = endUs;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod source) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.a)).onContinueLoadingRequested(this);
    }
}
