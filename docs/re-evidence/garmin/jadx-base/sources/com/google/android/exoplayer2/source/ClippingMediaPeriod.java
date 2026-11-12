package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes14.dex */
public final class ClippingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    private MediaPeriod.Callback callback;
    private ClippingMediaSource.IllegalClippingException clippingError;
    long endUs;
    public final MediaPeriod mediaPeriod;
    private long pendingInitialDiscontinuityPositionUs;
    private ClippingSampleStream[] sampleStreams = new ClippingSampleStream[0];
    long startUs;

    public final class ClippingSampleStream implements SampleStream {
        public final SampleStream childStream;
        private boolean sentEos;

        public ClippingSampleStream(SampleStream sampleStream) {
            this.childStream = sampleStream;
        }

        public void clearSentEos() {
            this.sentEos = false;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return !ClippingMediaPeriod.this.isPendingInitialDiscontinuity() && this.childStream.isReady();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() {
            this.childStream.maybeThrowError();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i14) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            if (this.sentEos) {
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            int data = this.childStream.readData(formatHolder, decoderInputBuffer, i14);
            if (data == -5) {
                Format format = (Format) Assertions.checkNotNull(formatHolder.format);
                int i15 = format.encoderDelay;
                if (i15 != 0 || format.encoderPadding != 0) {
                    ClippingMediaPeriod clippingMediaPeriod = ClippingMediaPeriod.this;
                    if (clippingMediaPeriod.startUs != 0) {
                        i15 = 0;
                    }
                    formatHolder.format = format.buildUpon().setEncoderDelay(i15).setEncoderPadding(clippingMediaPeriod.endUs == Long.MIN_VALUE ? format.encoderPadding : 0).build();
                }
                return -5;
            }
            ClippingMediaPeriod clippingMediaPeriod2 = ClippingMediaPeriod.this;
            long j8 = clippingMediaPeriod2.endUs;
            if (j8 == Long.MIN_VALUE || ((data != -4 || decoderInputBuffer.timeUs < j8) && !(data == -3 && clippingMediaPeriod2.getBufferedPositionUs() == Long.MIN_VALUE && !decoderInputBuffer.waitingForKeys))) {
                return data;
            }
            decoderInputBuffer.clear();
            decoderInputBuffer.setFlags(4);
            this.sentEos = true;
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j8) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            return this.childStream.skipData(j8);
        }
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean z14, long j8, long j14) {
        this.mediaPeriod = mediaPeriod;
        this.pendingInitialDiscontinuityPositionUs = z14 ? j8 : C.TIME_UNSET;
        this.startUs = j8;
        this.endUs = j14;
    }

    private SeekParameters clipSeekParameters(long j8, SeekParameters seekParameters) {
        long jConstrainValue = Util.constrainValue(seekParameters.toleranceBeforeUs, 0L, j8 - this.startUs);
        long j14 = seekParameters.toleranceAfterUs;
        long j15 = this.endUs;
        long jConstrainValue2 = Util.constrainValue(j14, 0L, j15 == Long.MIN_VALUE ? Long.MAX_VALUE : j15 - j8);
        return (jConstrainValue == seekParameters.toleranceBeforeUs && jConstrainValue2 == seekParameters.toleranceAfterUs) ? seekParameters : new SeekParameters(jConstrainValue, jConstrainValue2);
    }

    private static boolean shouldKeepInitialDiscontinuity(long j8, ExoTrackSelection[] exoTrackSelectionArr) {
        if (j8 != 0) {
            for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
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

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j8) {
        return this.mediaPeriod.continueLoading(j8);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j8, boolean z14) {
        this.mediaPeriod.discardBuffer(j8, z14);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j8, SeekParameters seekParameters) {
        long j14 = this.startUs;
        if (j8 == j14) {
            return j14;
        }
        return this.mediaPeriod.getAdjustedSeekPositionUs(j8, clipSeekParameters(j8, seekParameters));
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j8 = this.endUs;
            if (j8 == Long.MIN_VALUE || bufferedPositionUs < j8) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j8 = this.endUs;
            if (j8 == Long.MIN_VALUE || nextLoadPositionUs < j8) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    public boolean isPendingInitialDiscontinuity() {
        return this.pendingInitialDiscontinuityPositionUs != C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws ClippingMediaSource.IllegalClippingException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        if (this.clippingError != null) {
            return;
        }
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j8) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j8);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        if (isPendingInitialDiscontinuity()) {
            long j8 = this.pendingInitialDiscontinuityPositionUs;
            this.pendingInitialDiscontinuityPositionUs = C.TIME_UNSET;
            long discontinuity = readDiscontinuity();
            return discontinuity != C.TIME_UNSET ? discontinuity : j8;
        }
        long discontinuity2 = this.mediaPeriod.readDiscontinuity();
        if (discontinuity2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        Assertions.checkState(discontinuity2 >= this.startUs);
        long j14 = this.endUs;
        Assertions.checkState(j14 == Long.MIN_VALUE || discontinuity2 <= j14);
        return discontinuity2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j8) {
        this.mediaPeriod.reevaluateBuffer(j8);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j8) {
        this.pendingInitialDiscontinuityPositionUs = C.TIME_UNSET;
        boolean z14 = false;
        for (ClippingSampleStream clippingSampleStream : this.sampleStreams) {
            if (clippingSampleStream != null) {
                clippingSampleStream.clearSentEos();
            }
        }
        long jSeekToUs = this.mediaPeriod.seekToUs(j8);
        if (jSeekToUs == j8) {
            z14 = true;
        } else if (jSeekToUs >= this.startUs) {
            long j14 = this.endUs;
            if (j14 == Long.MIN_VALUE || jSeekToUs <= j14) {
                z14 = true;
            }
        }
        Assertions.checkState(z14);
        return jSeekToUs;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j8) {
        long j14;
        boolean z14;
        this.sampleStreams = new ClippingSampleStream[sampleStreamArr.length];
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i14 = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i14 >= sampleStreamArr.length) {
                break;
            }
            ClippingSampleStream[] clippingSampleStreamArr = this.sampleStreams;
            ClippingSampleStream clippingSampleStream = (ClippingSampleStream) sampleStreamArr[i14];
            clippingSampleStreamArr[i14] = clippingSampleStream;
            if (clippingSampleStream != null) {
                sampleStream = clippingSampleStream.childStream;
            }
            sampleStreamArr2[i14] = sampleStream;
            i14++;
        }
        long jSelectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j8);
        if (isPendingInitialDiscontinuity()) {
            long j15 = this.startUs;
            if (j8 == j15 && shouldKeepInitialDiscontinuity(j15, exoTrackSelectionArr)) {
                j14 = jSelectTracks;
            } else {
                j14 = C.TIME_UNSET;
            }
        } else {
            j14 = C.TIME_UNSET;
        }
        this.pendingInitialDiscontinuityPositionUs = j14;
        if (jSelectTracks != j8) {
            if (jSelectTracks >= this.startUs) {
                long j16 = this.endUs;
                z14 = j16 == Long.MIN_VALUE || jSelectTracks <= j16;
            }
        }
        Assertions.checkState(z14);
        for (int i15 = 0; i15 < sampleStreamArr.length; i15++) {
            SampleStream sampleStream2 = sampleStreamArr2[i15];
            ClippingSampleStream[] clippingSampleStreamArr2 = this.sampleStreams;
            if (sampleStream2 == null) {
                clippingSampleStreamArr2[i15] = null;
            } else {
                ClippingSampleStream clippingSampleStream2 = clippingSampleStreamArr2[i15];
                if (clippingSampleStream2 == null || clippingSampleStream2.childStream != sampleStream2) {
                    clippingSampleStreamArr2[i15] = new ClippingSampleStream(sampleStream2);
                }
            }
            sampleStreamArr[i15] = this.sampleStreams[i15];
        }
        return jSelectTracks;
    }

    public void setClippingError(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.clippingError = illegalClippingException;
    }

    public void updateClipping(long j8, long j14) {
        this.startUs = j8;
        this.endUs = j14;
    }
}
