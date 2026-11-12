package com.google.android.exoplayer2.source.smoothstreaming;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class a implements MediaPeriod, SequenceableLoader.Callback<ChunkSampleStream<SsChunkSource>> {
    private final SsChunkSource.Factory a;

    @Nullable
    private final TransferListener b;
    private final LoaderErrorThrower c;
    private final DrmSessionManager d;
    private final DrmSessionEventListener.EventDispatcher e;
    private final LoadErrorHandlingPolicy f;
    private final MediaSourceEventListener.EventDispatcher g;
    private final Allocator h;
    private final TrackGroupArray i;
    private final CompositeSequenceableLoaderFactory j;

    @Nullable
    private MediaPeriod.Callback k;
    private SsManifest l;
    private ChunkSampleStream<SsChunkSource>[] m;
    private SequenceableLoader n;

    public a(SsManifest manifest, SsChunkSource.Factory chunkSourceFactory, @Nullable TransferListener transferListener, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher drmEventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher, LoaderErrorThrower manifestLoaderErrorThrower, Allocator allocator) {
        this.l = manifest;
        this.a = chunkSourceFactory;
        this.b = transferListener;
        this.c = manifestLoaderErrorThrower;
        this.d = drmSessionManager;
        this.e = drmEventDispatcher;
        this.f = loadErrorHandlingPolicy;
        this.g = mediaSourceEventDispatcher;
        this.h = allocator;
        this.j = compositeSequenceableLoaderFactory;
        this.i = b(manifest, drmSessionManager);
        ChunkSampleStream<SsChunkSource>[] chunkSampleStreamArrC = c(0);
        this.m = chunkSampleStreamArrC;
        this.n = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(chunkSampleStreamArrC);
    }

    private ChunkSampleStream<SsChunkSource> a(ExoTrackSelection selection, long positionUs) {
        int iIndexOf = this.i.indexOf(selection.getTrackGroup());
        return new ChunkSampleStream<>(this.l.streamElements[iIndexOf].type, null, null, this.a.createChunkSource(this.c, this.l, iIndexOf, selection, this.b), this, this.h, positionUs, this.d, this.e, this.f, this.g);
    }

    private static TrackGroupArray b(SsManifest manifest, DrmSessionManager drmSessionManager) {
        TrackGroup[] trackGroupArr = new TrackGroup[manifest.streamElements.length];
        int i = 0;
        while (true) {
            SsManifest.StreamElement[] streamElementArr = manifest.streamElements;
            if (i >= streamElementArr.length) {
                return new TrackGroupArray(trackGroupArr);
            }
            Format[] formatArr = streamElementArr[i].formats;
            Format[] formatArr2 = new Format[formatArr.length];
            for (int i2 = 0; i2 < formatArr.length; i2++) {
                Format format = formatArr[i2];
                formatArr2[i2] = format.copyWithExoMediaCryptoType(drmSessionManager.getExoMediaCryptoType(format));
            }
            trackGroupArr[i] = new TrackGroup(formatArr2);
            i++;
        }
    }

    private static ChunkSampleStream<SsChunkSource>[] c(int length) {
        return new ChunkSampleStream[length];
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long positionUs) {
        return this.n.continueLoading(positionUs);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onContinueLoadingRequested(ChunkSampleStream<SsChunkSource> sampleStream) {
        this.k.onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long positionUs, boolean toKeyframe) {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.m) {
            chunkSampleStream.discardBuffer(positionUs, toKeyframe);
        }
    }

    public void e() {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.m) {
            chunkSampleStream.release();
        }
        this.k = null;
    }

    public void f(SsManifest manifest) {
        this.l = manifest;
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.m) {
            ((SsChunkSource) chunkSampleStream.getChunkSource()).updateManifest(manifest);
        }
        this.k.onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.m) {
            if (chunkSampleStream.primaryTrackType == 2) {
                return chunkSampleStream.getAdjustedSeekPositionUs(positionUs, seekParameters);
            }
        }
        return positionUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.n.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.n.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> trackSelections) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < trackSelections.size(); i++) {
            ExoTrackSelection exoTrackSelection = trackSelections.get(i);
            int iIndexOf = this.i.indexOf(exoTrackSelection.getTrackGroup());
            for (int i2 = 0; i2 < exoTrackSelection.length(); i2++) {
                arrayList.add(new StreamKey(iIndexOf, exoTrackSelection.getIndexInTrackGroup(i2)));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.i;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.n.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        this.c.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long positionUs) {
        this.k = callback;
        callback.onPrepared(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long positionUs) {
        this.n.reevaluateBuffer(positionUs);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long positionUs) {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.m) {
            chunkSampleStream.seekToUs(positionUs);
        }
        return positionUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < selections.length; i++) {
            if (streams[i] != null) {
                ChunkSampleStream chunkSampleStream = (ChunkSampleStream) streams[i];
                if (selections[i] == null || !mayRetainStreamFlags[i]) {
                    chunkSampleStream.release();
                    streams[i] = null;
                } else {
                    ((SsChunkSource) chunkSampleStream.getChunkSource()).updateTrackSelection(selections[i]);
                    arrayList.add(chunkSampleStream);
                }
            }
            if (streams[i] == null && selections[i] != null) {
                ChunkSampleStream<SsChunkSource> chunkSampleStreamA = a(selections[i], positionUs);
                arrayList.add(chunkSampleStreamA);
                streams[i] = chunkSampleStreamA;
                streamResetFlags[i] = true;
            }
        }
        ChunkSampleStream<SsChunkSource>[] chunkSampleStreamArrC = c(arrayList.size());
        this.m = chunkSampleStreamArrC;
        arrayList.toArray(chunkSampleStreamArrC);
        this.n = this.j.createCompositeSequenceableLoader(this.m);
        return positionUs;
    }
}
