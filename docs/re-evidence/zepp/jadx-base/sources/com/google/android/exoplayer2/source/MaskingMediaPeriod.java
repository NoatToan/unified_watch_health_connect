package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class MaskingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    private final long a;
    private final Allocator b;
    private MediaSource c;
    private MediaPeriod d;

    @Nullable
    private MediaPeriod.Callback e;

    @Nullable
    private PrepareListener f;
    private boolean g;
    private long h = C.TIME_UNSET;
    public final MediaSource.MediaPeriodId id;

    public interface PrepareListener {
        void onPrepareComplete(MediaSource.MediaPeriodId mediaPeriodId);

        void onPrepareError(MediaSource.MediaPeriodId mediaPeriodId, IOException exception);
    }

    public MaskingMediaPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long preparePositionUs) {
        this.id = id;
        this.b = allocator;
        this.a = preparePositionUs;
    }

    private long a(long preparePositionUs) {
        long j = this.h;
        return j != C.TIME_UNSET ? j : preparePositionUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long positionUs) {
        MediaPeriod mediaPeriod = this.d;
        return mediaPeriod != null && mediaPeriod.continueLoading(positionUs);
    }

    public void createPeriod(MediaSource.MediaPeriodId id) {
        long jA = a(this.a);
        MediaPeriod mediaPeriodCreatePeriod = ((MediaSource) Assertions.checkNotNull(this.c)).createPeriod(id, this.b, jA);
        this.d = mediaPeriodCreatePeriod;
        if (this.e != null) {
            mediaPeriodCreatePeriod.prepare(this, jA);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long positionUs, boolean toKeyframe) {
        ((MediaPeriod) Util.castNonNull(this.d)).discardBuffer(positionUs, toKeyframe);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
        return ((MediaPeriod) Util.castNonNull(this.d)).getAdjustedSeekPositionUs(positionUs, seekParameters);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return ((MediaPeriod) Util.castNonNull(this.d)).getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return ((MediaPeriod) Util.castNonNull(this.d)).getNextLoadPositionUs();
    }

    public long getPreparePositionOverrideUs() {
        return this.h;
    }

    public long getPreparePositionUs() {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public /* synthetic */ List getStreamKeys(List list) {
        return a.a(this, list);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return ((MediaPeriod) Util.castNonNull(this.d)).getTrackGroups();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        MediaPeriod mediaPeriod = this.d;
        return mediaPeriod != null && mediaPeriod.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        try {
            MediaPeriod mediaPeriod = this.d;
            if (mediaPeriod != null) {
                mediaPeriod.maybeThrowPrepareError();
            } else {
                MediaSource mediaSource = this.c;
                if (mediaSource != null) {
                    mediaSource.maybeThrowSourceInfoRefreshError();
                }
            }
        } catch (IOException e) {
            PrepareListener prepareListener = this.f;
            if (prepareListener == null) {
                throw e;
            }
            if (this.g) {
                return;
            }
            this.g = true;
            prepareListener.onPrepareError(this.id, e);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Util.castNonNull(this.e)).onPrepared(this);
        PrepareListener prepareListener = this.f;
        if (prepareListener != null) {
            prepareListener.onPrepareComplete(this.id);
        }
    }

    public void overridePreparePositionUs(long preparePositionUs) {
        this.h = preparePositionUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long positionUs) {
        this.e = callback;
        MediaPeriod mediaPeriod = this.d;
        if (mediaPeriod != null) {
            mediaPeriod.prepare(this, a(this.a));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        return ((MediaPeriod) Util.castNonNull(this.d)).readDiscontinuity();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long positionUs) {
        ((MediaPeriod) Util.castNonNull(this.d)).reevaluateBuffer(positionUs);
    }

    public void releasePeriod() {
        if (this.d != null) {
            ((MediaSource) Assertions.checkNotNull(this.c)).releasePeriod(this.d);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long positionUs) {
        return ((MediaPeriod) Util.castNonNull(this.d)).seekToUs(positionUs);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
        long j;
        long j2 = this.h;
        if (j2 == C.TIME_UNSET || positionUs != this.a) {
            j = positionUs;
        } else {
            this.h = C.TIME_UNSET;
            j = j2;
        }
        return ((MediaPeriod) Util.castNonNull(this.d)).selectTracks(selections, mayRetainStreamFlags, streams, streamResetFlags, j);
    }

    public void setMediaSource(MediaSource mediaSource) {
        Assertions.checkState(this.c == null);
        this.c = mediaSource;
    }

    public void setPrepareListener(PrepareListener listener) {
        this.f = listener;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod source) {
        ((MediaPeriod.Callback) Util.castNonNull(this.e)).onContinueLoadingRequested(this);
    }
}
