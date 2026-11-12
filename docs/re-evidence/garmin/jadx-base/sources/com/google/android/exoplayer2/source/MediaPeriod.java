package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface MediaPeriod extends SequenceableLoader {

    public interface Callback extends SequenceableLoader.Callback<MediaPeriod> {
        void onPrepared(MediaPeriod mediaPeriod);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    boolean continueLoading(long j8);

    void discardBuffer(long j8, boolean z14);

    long getAdjustedSeekPositionUs(long j8, SeekParameters seekParameters);

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    long getBufferedPositionUs();

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    long getNextLoadPositionUs();

    default List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return Collections.EMPTY_LIST;
    }

    TrackGroupArray getTrackGroups();

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    boolean isLoading();

    void maybeThrowPrepareError();

    void prepare(Callback callback, long j8);

    long readDiscontinuity();

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    void reevaluateBuffer(long j8);

    long seekToUs(long j8);

    long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j8);
}
