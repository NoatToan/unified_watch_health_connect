package com.google.android.exoplayer2.source.chunk;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.chunk.ChunkSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ChunkSampleStream<T extends ChunkSource> implements SampleStream, SequenceableLoader, Loader.Callback<Chunk>, Loader.ReleaseCallback {
    private static final String w = "ChunkSampleStream";
    private final int[] a;
    private final Format[] b;
    private final boolean[] c;
    private final T d;
    private final SequenceableLoader.Callback<ChunkSampleStream<T>> e;
    private final MediaSourceEventListener.EventDispatcher f;
    private final LoadErrorHandlingPolicy g;
    private final Loader h;
    private final ChunkHolder i;
    private final ArrayList<BaseMediaChunk> j;
    private final List<BaseMediaChunk> k;
    private final SampleQueue l;
    private final SampleQueue[] m;
    private final BaseMediaChunkOutput n;

    @Nullable
    private Chunk o;
    private Format p;
    public final int primaryTrackType;

    @Nullable
    private ReleaseCallback<T> q;
    private long r;
    private long s;
    private int t;

    @Nullable
    private BaseMediaChunk u;
    public boolean v;

    public final class EmbeddedSampleStream implements SampleStream {
        private final SampleQueue a;
        private final int b;
        private boolean c;
        public final ChunkSampleStream<T> parent;

        public EmbeddedSampleStream(ChunkSampleStream<T> parent, SampleQueue sampleQueue, int index) {
            this.parent = parent;
            this.a = sampleQueue;
            this.b = index;
        }

        private void a() {
            if (this.c) {
                return;
            }
            ChunkSampleStream.this.f.downstreamFormatChanged(ChunkSampleStream.this.a[this.b], ChunkSampleStream.this.b[this.b], 0, null, ChunkSampleStream.this.s);
            this.c = true;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return !ChunkSampleStream.this.m() && this.a.isReady(ChunkSampleStream.this.v);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
            if (ChunkSampleStream.this.m()) {
                return -3;
            }
            if (ChunkSampleStream.this.u != null && ChunkSampleStream.this.u.getFirstSampleIndex(this.b + 1) <= this.a.getReadIndex()) {
                return -3;
            }
            a();
            return this.a.read(formatHolder, buffer, readFlags, ChunkSampleStream.this.v);
        }

        public void release() {
            Assertions.checkState(ChunkSampleStream.this.c[this.b]);
            ChunkSampleStream.this.c[this.b] = false;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long positionUs) {
            if (ChunkSampleStream.this.m()) {
                return 0;
            }
            int skipCount = this.a.getSkipCount(positionUs, ChunkSampleStream.this.v);
            if (ChunkSampleStream.this.u != null) {
                skipCount = Math.min(skipCount, ChunkSampleStream.this.u.getFirstSampleIndex(this.b + 1) - this.a.getReadIndex());
            }
            this.a.skip(skipCount);
            if (skipCount > 0) {
                a();
            }
            return skipCount;
        }
    }

    public interface ReleaseCallback<T extends ChunkSource> {
        void onSampleStreamReleased(ChunkSampleStream<T> chunkSampleStream);
    }

    public ChunkSampleStream(int primaryTrackType, @Nullable int[] embeddedTrackTypes, @Nullable Format[] embeddedTrackFormats, T chunkSource, SequenceableLoader.Callback<ChunkSampleStream<T>> callback, Allocator allocator, long positionUs, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher drmEventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher) {
        this.primaryTrackType = primaryTrackType;
        int i = 0;
        embeddedTrackTypes = embeddedTrackTypes == null ? new int[0] : embeddedTrackTypes;
        this.a = embeddedTrackTypes;
        this.b = embeddedTrackFormats == null ? new Format[0] : embeddedTrackFormats;
        this.d = chunkSource;
        this.e = callback;
        this.f = mediaSourceEventDispatcher;
        this.g = loadErrorHandlingPolicy;
        this.h = new Loader(w);
        this.i = new ChunkHolder();
        ArrayList<BaseMediaChunk> arrayList = new ArrayList<>();
        this.j = arrayList;
        this.k = Collections.unmodifiableList(arrayList);
        int length = embeddedTrackTypes.length;
        this.m = new SampleQueue[length];
        this.c = new boolean[length];
        int i2 = length + 1;
        int[] iArr = new int[i2];
        SampleQueue[] sampleQueueArr = new SampleQueue[i2];
        SampleQueue sampleQueueCreateWithDrm = SampleQueue.createWithDrm(allocator, (Looper) Assertions.checkNotNull(Looper.myLooper()), drmSessionManager, drmEventDispatcher);
        this.l = sampleQueueCreateWithDrm;
        iArr[0] = primaryTrackType;
        sampleQueueArr[0] = sampleQueueCreateWithDrm;
        while (i < length) {
            SampleQueue sampleQueueCreateWithoutDrm = SampleQueue.createWithoutDrm(allocator);
            this.m[i] = sampleQueueCreateWithoutDrm;
            int i3 = i + 1;
            sampleQueueArr[i3] = sampleQueueCreateWithoutDrm;
            iArr[i3] = this.a[i];
            i = i3;
        }
        this.n = new BaseMediaChunkOutput(iArr, sampleQueueArr);
        this.r = positionUs;
        this.s = positionUs;
    }

    private void g(int discardToSampleIndex) {
        int iMin = Math.min(p(discardToSampleIndex, 0), this.t);
        if (iMin > 0) {
            Util.removeRange(this.j, 0, iMin);
            this.t -= iMin;
        }
    }

    private void h(int preferredQueueSize) {
        Assertions.checkState(!this.h.isLoading());
        int size = this.j.size();
        while (true) {
            if (preferredQueueSize >= size) {
                preferredQueueSize = -1;
                break;
            } else if (!k(preferredQueueSize)) {
                break;
            } else {
                preferredQueueSize++;
            }
        }
        if (preferredQueueSize == -1) {
            return;
        }
        long j = j().endTimeUs;
        BaseMediaChunk baseMediaChunkI = i(preferredQueueSize);
        if (this.j.isEmpty()) {
            this.r = this.s;
        }
        this.v = false;
        this.f.upstreamDiscarded(this.primaryTrackType, baseMediaChunkI.startTimeUs, j);
    }

    private BaseMediaChunk i(int chunkIndex) {
        BaseMediaChunk baseMediaChunk = this.j.get(chunkIndex);
        ArrayList<BaseMediaChunk> arrayList = this.j;
        Util.removeRange(arrayList, chunkIndex, arrayList.size());
        this.t = Math.max(this.t, this.j.size());
        int i = 0;
        this.l.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(0));
        while (true) {
            SampleQueue[] sampleQueueArr = this.m;
            if (i >= sampleQueueArr.length) {
                return baseMediaChunk;
            }
            SampleQueue sampleQueue = sampleQueueArr[i];
            i++;
            sampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(i));
        }
    }

    private BaseMediaChunk j() {
        ArrayList<BaseMediaChunk> arrayList = this.j;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean k(int mediaChunkIndex) {
        int readIndex;
        BaseMediaChunk baseMediaChunk = this.j.get(mediaChunkIndex);
        if (this.l.getReadIndex() > baseMediaChunk.getFirstSampleIndex(0)) {
            return true;
        }
        int i = 0;
        do {
            SampleQueue[] sampleQueueArr = this.m;
            if (i >= sampleQueueArr.length) {
                return false;
            }
            readIndex = sampleQueueArr[i].getReadIndex();
            i++;
        } while (readIndex <= baseMediaChunk.getFirstSampleIndex(i));
        return true;
    }

    private boolean l(Chunk chunk) {
        return chunk instanceof BaseMediaChunk;
    }

    private void n() {
        int iP = p(this.l.getReadIndex(), this.t - 1);
        while (true) {
            int i = this.t;
            if (i > iP) {
                return;
            }
            this.t = i + 1;
            o(i);
        }
    }

    private void o(int mediaChunkReadIndex) {
        BaseMediaChunk baseMediaChunk = this.j.get(mediaChunkReadIndex);
        Format format = baseMediaChunk.trackFormat;
        if (!format.equals(this.p)) {
            this.f.downstreamFormatChanged(this.primaryTrackType, format, baseMediaChunk.trackSelectionReason, baseMediaChunk.trackSelectionData, baseMediaChunk.startTimeUs);
        }
        this.p = format;
    }

    private int p(int primarySampleIndex, int minChunkIndex) {
        do {
            minChunkIndex++;
            if (minChunkIndex >= this.j.size()) {
                return this.j.size() - 1;
            }
        } while (this.j.get(minChunkIndex).getFirstSampleIndex(0) <= primarySampleIndex);
        return minChunkIndex - 1;
    }

    private void q() {
        this.l.reset();
        for (SampleQueue sampleQueue : this.m) {
            sampleQueue.reset();
        }
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long positionUs) {
        List<BaseMediaChunk> listEmptyList;
        long j;
        if (this.v || this.h.isLoading() || this.h.hasFatalError()) {
            return false;
        }
        boolean zM = m();
        if (zM) {
            listEmptyList = Collections.emptyList();
            j = this.r;
        } else {
            listEmptyList = this.k;
            j = j().endTimeUs;
        }
        this.d.getNextChunk(positionUs, j, listEmptyList, this.i);
        ChunkHolder chunkHolder = this.i;
        boolean z = chunkHolder.endOfStream;
        Chunk chunk = chunkHolder.chunk;
        chunkHolder.clear();
        if (z) {
            this.r = C.TIME_UNSET;
            this.v = true;
            return true;
        }
        if (chunk == null) {
            return false;
        }
        this.o = chunk;
        if (l(chunk)) {
            BaseMediaChunk baseMediaChunk = (BaseMediaChunk) chunk;
            if (zM) {
                long j2 = baseMediaChunk.startTimeUs;
                long j3 = this.r;
                if (j2 != j3) {
                    this.l.setStartTimeUs(j3);
                    for (SampleQueue sampleQueue : this.m) {
                        sampleQueue.setStartTimeUs(this.r);
                    }
                }
                this.r = C.TIME_UNSET;
            }
            baseMediaChunk.init(this.n);
            this.j.add(baseMediaChunk);
        } else if (chunk instanceof InitializationChunk) {
            ((InitializationChunk) chunk).init(this.n);
        }
        this.f.loadStarted(new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, this.h.startLoading(chunk, this, this.g.getMinimumLoadableRetryCount(chunk.type))), chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        return true;
    }

    public void discardBuffer(long positionUs, boolean toKeyframe) {
        if (m()) {
            return;
        }
        int firstIndex = this.l.getFirstIndex();
        this.l.discardTo(positionUs, toKeyframe, true);
        int firstIndex2 = this.l.getFirstIndex();
        if (firstIndex2 > firstIndex) {
            long firstTimestampUs = this.l.getFirstTimestampUs();
            int i = 0;
            while (true) {
                SampleQueue[] sampleQueueArr = this.m;
                if (i >= sampleQueueArr.length) {
                    break;
                }
                sampleQueueArr[i].discardTo(firstTimestampUs, toKeyframe, this.c[i]);
                i++;
            }
        }
        g(firstIndex2);
    }

    public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
        return this.d.getAdjustedSeekPositionUs(positionUs, seekParameters);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        if (this.v) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.r;
        }
        long jMax = this.s;
        BaseMediaChunk baseMediaChunkJ = j();
        if (!baseMediaChunkJ.isLoadCompleted()) {
            if (this.j.size() > 1) {
                ArrayList<BaseMediaChunk> arrayList = this.j;
                baseMediaChunkJ = arrayList.get(arrayList.size() - 2);
            } else {
                baseMediaChunkJ = null;
            }
        }
        if (baseMediaChunkJ != null) {
            jMax = Math.max(jMax, baseMediaChunkJ.endTimeUs);
        }
        return Math.max(jMax, this.l.getLargestQueuedTimestampUs());
    }

    public T getChunkSource() {
        return this.d;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (m()) {
            return this.r;
        }
        if (this.v) {
            return Long.MIN_VALUE;
        }
        return j().endTimeUs;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.h.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public boolean isReady() {
        return !m() && this.l.isReady(this.v);
    }

    public boolean m() {
        return this.r != C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public void maybeThrowError() throws IOException {
        this.h.maybeThrowError();
        this.l.maybeThrowError();
        if (this.h.isLoading()) {
            return;
        }
        this.d.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        this.l.release();
        for (SampleQueue sampleQueue : this.m) {
            sampleQueue.release();
        }
        this.d.release();
        ReleaseCallback<T> releaseCallback = this.q;
        if (releaseCallback != null) {
            releaseCallback.onSampleStreamReleased(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
        if (m()) {
            return -3;
        }
        BaseMediaChunk baseMediaChunk = this.u;
        if (baseMediaChunk != null && baseMediaChunk.getFirstSampleIndex(0) <= this.l.getReadIndex()) {
            return -3;
        }
        n();
        return this.l.read(formatHolder, buffer, readFlags, this.v);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long positionUs) {
        if (this.h.hasFatalError() || m()) {
            return;
        }
        if (!this.h.isLoading()) {
            int preferredQueueSize = this.d.getPreferredQueueSize(positionUs, this.k);
            if (preferredQueueSize < this.j.size()) {
                h(preferredQueueSize);
                return;
            }
            return;
        }
        Chunk chunk = (Chunk) Assertions.checkNotNull(this.o);
        if (!(l(chunk) && k(this.j.size() - 1)) && this.d.shouldCancelLoad(positionUs, chunk, this.k)) {
            this.h.cancelLoading();
            if (l(chunk)) {
                this.u = (BaseMediaChunk) chunk;
            }
        }
    }

    public void release() {
        release(null);
    }

    public void seekToUs(long positionUs) {
        this.s = positionUs;
        if (m()) {
            this.r = positionUs;
            return;
        }
        BaseMediaChunk baseMediaChunk = null;
        int i = 0;
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            BaseMediaChunk baseMediaChunk2 = this.j.get(i2);
            long j = baseMediaChunk2.startTimeUs;
            if (j == positionUs && baseMediaChunk2.clippedStartTimeUs == C.TIME_UNSET) {
                baseMediaChunk = baseMediaChunk2;
                break;
            } else {
                if (j > positionUs) {
                    break;
                }
            }
        }
        if (baseMediaChunk != null ? this.l.seekTo(baseMediaChunk.getFirstSampleIndex(0)) : this.l.seekTo(positionUs, positionUs < getNextLoadPositionUs())) {
            this.t = p(this.l.getReadIndex(), 0);
            SampleQueue[] sampleQueueArr = this.m;
            int length = sampleQueueArr.length;
            while (i < length) {
                sampleQueueArr[i].seekTo(positionUs, true);
                i++;
            }
            return;
        }
        this.r = positionUs;
        this.v = false;
        this.j.clear();
        this.t = 0;
        if (!this.h.isLoading()) {
            this.h.clearFatalError();
            q();
            return;
        }
        this.l.discardToEnd();
        SampleQueue[] sampleQueueArr2 = this.m;
        int length2 = sampleQueueArr2.length;
        while (i < length2) {
            sampleQueueArr2[i].discardToEnd();
            i++;
        }
        this.h.cancelLoading();
    }

    public ChunkSampleStream<T>.EmbeddedSampleStream selectEmbeddedTrack(long positionUs, int trackType) {
        for (int i = 0; i < this.m.length; i++) {
            if (this.a[i] == trackType) {
                Assertions.checkState(!this.c[i]);
                this.c[i] = true;
                this.m[i].seekTo(positionUs, true);
                return new EmbeddedSampleStream(this, this.m[i], i);
            }
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int skipData(long positionUs) {
        if (m()) {
            return 0;
        }
        int skipCount = this.l.getSkipCount(positionUs, this.v);
        BaseMediaChunk baseMediaChunk = this.u;
        if (baseMediaChunk != null) {
            skipCount = Math.min(skipCount, baseMediaChunk.getFirstSampleIndex(0) - this.l.getReadIndex());
        }
        this.l.skip(skipCount);
        n();
        return skipCount;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCanceled(Chunk loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        this.o = null;
        this.u = null;
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
        this.g.onLoadTaskConcluded(loadable.loadTaskId);
        this.f.loadCanceled(loadEventInfo, loadable.type, this.primaryTrackType, loadable.trackFormat, loadable.trackSelectionReason, loadable.trackSelectionData, loadable.startTimeUs, loadable.endTimeUs);
        if (released) {
            return;
        }
        if (m()) {
            q();
        } else if (l(loadable)) {
            i(this.j.size() - 1);
            if (this.j.isEmpty()) {
                this.r = this.s;
            }
        }
        this.e.onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCompleted(Chunk loadable, long elapsedRealtimeMs, long loadDurationMs) {
        this.o = null;
        this.d.onChunkLoadCompleted(loadable);
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
        this.g.onLoadTaskConcluded(loadable.loadTaskId);
        this.f.loadCompleted(loadEventInfo, loadable.type, this.primaryTrackType, loadable.trackFormat, loadable.trackSelectionReason, loadable.trackSelectionData, loadable.startTimeUs, loadable.endTimeUs);
        this.e.onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(Chunk loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        long jBytesLoaded = loadable.bytesLoaded();
        boolean zL = l(loadable);
        int size = this.j.size() - 1;
        boolean z = (jBytesLoaded != 0 && zL && k(size)) ? false : true;
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, jBytesLoaded);
        LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(loadable.type, this.primaryTrackType, loadable.trackFormat, loadable.trackSelectionReason, loadable.trackSelectionData, C.usToMs(loadable.startTimeUs), C.usToMs(loadable.endTimeUs)), error, errorCount);
        if (!this.d.onChunkLoadError(loadable, z, loadErrorInfo, this.g)) {
            loadErrorActionCreateRetryAction = null;
        } else if (z) {
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY;
            if (zL) {
                Assertions.checkState(i(size) == loadable);
                if (this.j.isEmpty()) {
                    this.r = this.s;
                }
            }
        } else {
            Log.w(w, "Ignoring attempt to cancel non-cancelable load.");
            loadErrorActionCreateRetryAction = null;
        }
        if (loadErrorActionCreateRetryAction == null) {
            long retryDelayMsFor = this.g.getRetryDelayMsFor(loadErrorInfo);
            loadErrorActionCreateRetryAction = retryDelayMsFor != C.TIME_UNSET ? Loader.createRetryAction(false, retryDelayMsFor) : Loader.DONT_RETRY_FATAL;
        }
        boolean z2 = !loadErrorActionCreateRetryAction.isRetry();
        this.f.loadError(loadEventInfo, loadable.type, this.primaryTrackType, loadable.trackFormat, loadable.trackSelectionReason, loadable.trackSelectionData, loadable.startTimeUs, loadable.endTimeUs, error, z2);
        if (z2) {
            this.o = null;
            this.g.onLoadTaskConcluded(loadable.loadTaskId);
            this.e.onContinueLoadingRequested(this);
        }
        return loadErrorActionCreateRetryAction;
    }

    public void release(@Nullable ReleaseCallback<T> callback) {
        this.q = callback;
        this.l.preRelease();
        for (SampleQueue sampleQueue : this.m) {
            sampleQueue.preRelease();
        }
        this.h.release(this);
    }
}
