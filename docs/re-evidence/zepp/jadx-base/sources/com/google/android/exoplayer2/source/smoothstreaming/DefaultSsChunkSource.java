package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Track;
import com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.BundledChunkExtractor;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.chunk.ChunkHolder;
import com.google.android.exoplayer2.source.chunk.ContainerMediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionUtil;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultSsChunkSource implements SsChunkSource {
    private final LoaderErrorThrower a;
    private final int b;
    private final ChunkExtractor[] c;
    private final DataSource d;
    private ExoTrackSelection e;
    private SsManifest f;
    private int g;

    @Nullable
    private IOException h;

    public static final class Factory implements SsChunkSource.Factory {
        private final DataSource.Factory a;

        public Factory(DataSource.Factory dataSourceFactory) {
            this.a = dataSourceFactory;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.SsChunkSource.Factory
        public SsChunkSource createChunkSource(LoaderErrorThrower manifestLoaderErrorThrower, SsManifest manifest, int streamElementIndex, ExoTrackSelection trackSelection, @Nullable TransferListener transferListener) {
            DataSource dataSourceCreateDataSource = this.a.createDataSource();
            if (transferListener != null) {
                dataSourceCreateDataSource.addTransferListener(transferListener);
            }
            return new DefaultSsChunkSource(manifestLoaderErrorThrower, manifest, streamElementIndex, trackSelection, dataSourceCreateDataSource);
        }
    }

    public static final class a extends BaseMediaChunkIterator {
        private final SsManifest.StreamElement d;
        private final int e;

        public a(SsManifest.StreamElement streamElement, int trackIndex, int chunkIndex) {
            super(chunkIndex, streamElement.chunkCount - 1);
            this.d = streamElement;
            this.e = trackIndex;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            return getChunkStartTimeUs() + this.d.getChunkDurationUs((int) getCurrentIndex());
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.d.getStartTimeUs((int) getCurrentIndex());
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            checkInBounds();
            return new DataSpec(this.d.buildRequestUri(this.e, (int) getCurrentIndex()));
        }
    }

    public DefaultSsChunkSource(LoaderErrorThrower manifestLoaderErrorThrower, SsManifest manifest, int streamElementIndex, ExoTrackSelection trackSelection, DataSource dataSource) {
        this.a = manifestLoaderErrorThrower;
        this.f = manifest;
        this.b = streamElementIndex;
        this.e = trackSelection;
        this.d = dataSource;
        SsManifest.StreamElement streamElement = manifest.streamElements[streamElementIndex];
        this.c = new ChunkExtractor[trackSelection.length()];
        int i = 0;
        while (i < this.c.length) {
            int indexInTrackGroup = trackSelection.getIndexInTrackGroup(i);
            Format format = streamElement.formats[indexInTrackGroup];
            TrackEncryptionBox[] trackEncryptionBoxArr = format.drmInitData != null ? ((SsManifest.ProtectionElement) Assertions.checkNotNull(manifest.protectionElement)).trackEncryptionBoxes : null;
            int i2 = streamElement.type;
            int i3 = i;
            this.c[i3] = new BundledChunkExtractor(new FragmentedMp4Extractor(3, null, new Track(indexInTrackGroup, i2, streamElement.timescale, C.TIME_UNSET, manifest.durationUs, format, 0, trackEncryptionBoxArr, i2 == 2 ? 4 : 0, null, null)), streamElement.type, format);
            i = i3 + 1;
        }
    }

    private static MediaChunk a(Format format, DataSource dataSource, Uri uri, int chunkIndex, long chunkStartTimeUs, long chunkEndTimeUs, long chunkSeekTimeUs, int trackSelectionReason, @Nullable Object trackSelectionData, ChunkExtractor chunkExtractor) {
        return new ContainerMediaChunk(dataSource, new DataSpec(uri), format, trackSelectionReason, trackSelectionData, chunkStartTimeUs, chunkEndTimeUs, chunkSeekTimeUs, C.TIME_UNSET, chunkIndex, 1, chunkStartTimeUs, chunkExtractor);
    }

    private long b(long playbackPositionUs) {
        SsManifest ssManifest = this.f;
        if (!ssManifest.isLive) {
            return C.TIME_UNSET;
        }
        SsManifest.StreamElement streamElement = ssManifest.streamElements[this.b];
        int i = streamElement.chunkCount - 1;
        return (streamElement.getStartTimeUs(i) + streamElement.getChunkDurationUs(i)) - playbackPositionUs;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
        SsManifest.StreamElement streamElement = this.f.streamElements[this.b];
        int chunkIndex = streamElement.getChunkIndex(positionUs);
        long startTimeUs = streamElement.getStartTimeUs(chunkIndex);
        return seekParameters.resolveSeekPositionUs(positionUs, startTimeUs, (startTimeUs >= positionUs || chunkIndex >= streamElement.chunkCount + (-1)) ? startTimeUs : streamElement.getStartTimeUs(chunkIndex + 1));
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public final void getNextChunk(long playbackPositionUs, long loadPositionUs, List<? extends MediaChunk> queue, ChunkHolder out) {
        int nextChunkIndex;
        long j = loadPositionUs;
        if (this.h != null) {
            return;
        }
        SsManifest ssManifest = this.f;
        SsManifest.StreamElement streamElement = ssManifest.streamElements[this.b];
        if (streamElement.chunkCount == 0) {
            out.endOfStream = !ssManifest.isLive;
            return;
        }
        if (queue.isEmpty()) {
            nextChunkIndex = streamElement.getChunkIndex(j);
        } else {
            nextChunkIndex = (int) (queue.get(queue.size() - 1).getNextChunkIndex() - ((long) this.g));
            if (nextChunkIndex < 0) {
                this.h = new BehindLiveWindowException();
                return;
            }
        }
        if (nextChunkIndex >= streamElement.chunkCount) {
            out.endOfStream = !this.f.isLive;
            return;
        }
        long j2 = j - playbackPositionUs;
        long jB = b(playbackPositionUs);
        int length = this.e.length();
        MediaChunkIterator[] mediaChunkIteratorArr = new MediaChunkIterator[length];
        for (int i = 0; i < length; i++) {
            mediaChunkIteratorArr[i] = new a(streamElement, this.e.getIndexInTrackGroup(i), nextChunkIndex);
        }
        this.e.updateSelectedTrack(playbackPositionUs, j2, jB, queue, mediaChunkIteratorArr);
        long startTimeUs = streamElement.getStartTimeUs(nextChunkIndex);
        long chunkDurationUs = startTimeUs + streamElement.getChunkDurationUs(nextChunkIndex);
        if (!queue.isEmpty()) {
            j = C.TIME_UNSET;
        }
        long j3 = j;
        int i2 = nextChunkIndex + this.g;
        int selectedIndex = this.e.getSelectedIndex();
        out.chunk = a(this.e.getSelectedFormat(), this.d, streamElement.buildRequestUri(this.e.getIndexInTrackGroup(selectedIndex), nextChunkIndex), i2, startTimeUs, chunkDurationUs, j3, this.e.getSelectionReason(), this.e.getSelectionData(), this.c[selectedIndex]);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public int getPreferredQueueSize(long playbackPositionUs, List<? extends MediaChunk> queue) {
        return (this.h != null || this.e.length() < 2) ? queue.size() : this.e.evaluateQueueSize(playbackPositionUs, queue);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void maybeThrowError() throws IOException {
        IOException iOException = this.h;
        if (iOException != null) {
            throw iOException;
        }
        this.a.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void onChunkLoadCompleted(Chunk chunk) {
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public boolean onChunkLoadError(Chunk chunk, boolean cancelable, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor = loadErrorHandlingPolicy.getFallbackSelectionFor(TrackSelectionUtil.createFallbackOptions(this.e), loadErrorInfo);
        if (cancelable && fallbackSelectionFor != null && fallbackSelectionFor.type == 2) {
            ExoTrackSelection exoTrackSelection = this.e;
            if (exoTrackSelection.blacklist(exoTrackSelection.indexOf(chunk.trackFormat), fallbackSelectionFor.exclusionDurationMs)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void release() {
        for (ChunkExtractor chunkExtractor : this.c) {
            chunkExtractor.release();
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public boolean shouldCancelLoad(long playbackPositionUs, Chunk loadingChunk, List<? extends MediaChunk> queue) {
        if (this.h != null) {
            return false;
        }
        return this.e.shouldCancelChunkLoad(playbackPositionUs, loadingChunk, queue);
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.SsChunkSource
    public void updateManifest(SsManifest newManifest) {
        SsManifest.StreamElement[] streamElementArr = this.f.streamElements;
        int i = this.b;
        SsManifest.StreamElement streamElement = streamElementArr[i];
        int i2 = streamElement.chunkCount;
        SsManifest.StreamElement streamElement2 = newManifest.streamElements[i];
        if (i2 == 0 || streamElement2.chunkCount == 0) {
            this.g += i2;
        } else {
            int i3 = i2 - 1;
            long startTimeUs = streamElement.getStartTimeUs(i3) + streamElement.getChunkDurationUs(i3);
            long startTimeUs2 = streamElement2.getStartTimeUs(0);
            if (startTimeUs <= startTimeUs2) {
                this.g += i2;
            } else {
                this.g += streamElement.getChunkIndex(startTimeUs2);
            }
        }
        this.f = newManifest;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.SsChunkSource
    public void updateTrackSelection(ExoTrackSelection trackSelection) {
        this.e = trackSelection;
    }
}
