package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class k implements MediaPeriod, Loader.Callback<c> {
    private static final String o = "SingleSampleMediaPeriod";
    private static final int p = 1024;
    private final DataSpec a;
    private final DataSource.Factory b;

    @Nullable
    private final TransferListener c;
    private final LoadErrorHandlingPolicy d;
    private final MediaSourceEventListener.EventDispatcher e;
    private final TrackGroupArray f;
    private final long h;
    public final Format j;
    public final boolean k;
    public boolean l;
    public byte[] m;
    public int n;
    private final ArrayList<b> g = new ArrayList<>();
    public final Loader i = new Loader(o);

    public final class b implements SampleStream {
        private static final int d = 0;
        private static final int e = 1;
        private static final int f = 2;
        private int a;
        private boolean b;

        private b() {
        }

        private void a() {
            if (this.b) {
                return;
            }
            k.this.e.downstreamFormatChanged(MimeTypes.getTrackType(k.this.j.sampleMimeType), k.this.j, 0, null, 0L);
            this.b = true;
        }

        public void b() {
            if (this.a == 2) {
                this.a = 1;
            }
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return k.this.l;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
            k kVar = k.this;
            if (kVar.k) {
                return;
            }
            kVar.i.maybeThrowError();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
            a();
            k kVar = k.this;
            boolean z = kVar.l;
            if (z && kVar.m == null) {
                this.a = 2;
            }
            int i = this.a;
            if (i == 2) {
                buffer.addFlag(4);
                return -4;
            }
            if ((readFlags & 2) != 0 || i == 0) {
                formatHolder.format = kVar.j;
                this.a = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            Assertions.checkNotNull(kVar.m);
            buffer.addFlag(1);
            buffer.timeUs = 0L;
            if ((readFlags & 4) == 0) {
                buffer.ensureSpaceForWrite(k.this.n);
                ByteBuffer byteBuffer = buffer.data;
                k kVar2 = k.this;
                byteBuffer.put(kVar2.m, 0, kVar2.n);
            }
            if ((readFlags & 1) == 0) {
                this.a = 2;
            }
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long positionUs) {
            a();
            if (positionUs <= 0 || this.a == 2) {
                return 0;
            }
            this.a = 2;
            return 1;
        }
    }

    public static final class c implements Loader.Loadable {
        public final long a = LoadEventInfo.getNewId();
        public final DataSpec b;
        private final StatsDataSource c;

        @Nullable
        private byte[] d;

        public c(DataSpec dataSpec, DataSource dataSource) {
            this.b = dataSpec;
            this.c = new StatsDataSource(dataSource);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws IOException {
            this.c.resetBytesRead();
            try {
                this.c.open(this.b);
                int i = 0;
                while (i != -1) {
                    int bytesRead = (int) this.c.getBytesRead();
                    byte[] bArr = this.d;
                    if (bArr == null) {
                        this.d = new byte[1024];
                    } else if (bytesRead == bArr.length) {
                        this.d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    StatsDataSource statsDataSource = this.c;
                    byte[] bArr2 = this.d;
                    i = statsDataSource.read(bArr2, bytesRead, bArr2.length - bytesRead);
                }
            } finally {
                Util.closeQuietly(this.c);
            }
        }
    }

    public k(DataSpec dataSpec, DataSource.Factory dataSourceFactory, @Nullable TransferListener transferListener, Format format, long durationUs, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher, boolean treatLoadErrorsAsEndOfStream) {
        this.a = dataSpec;
        this.b = dataSourceFactory;
        this.c = transferListener;
        this.j = format;
        this.h = durationUs;
        this.d = loadErrorHandlingPolicy;
        this.e = eventDispatcher;
        this.k = treatLoadErrorsAsEndOfStream;
        this.f = new TrackGroupArray(new TrackGroup(format));
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onLoadCanceled(c loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        StatsDataSource statsDataSource = loadable.c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.a, loadable.b, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), elapsedRealtimeMs, loadDurationMs, statsDataSource.getBytesRead());
        this.d.onLoadTaskConcluded(loadable.a);
        this.e.loadCanceled(loadEventInfo, 1, -1, null, 0, null, 0L, this.h);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onLoadCompleted(c loadable, long elapsedRealtimeMs, long loadDurationMs) {
        this.n = (int) loadable.c.getBytesRead();
        this.m = (byte[]) Assertions.checkNotNull(loadable.d);
        this.l = true;
        StatsDataSource statsDataSource = loadable.c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.a, loadable.b, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), elapsedRealtimeMs, loadDurationMs, this.n);
        this.d.onLoadTaskConcluded(loadable.a);
        this.e.loadCompleted(loadEventInfo, 1, -1, this.j, 0, null, 0L, this.h);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long positionUs) {
        if (this.l || this.i.isLoading() || this.i.hasFatalError()) {
            return false;
        }
        DataSource dataSourceCreateDataSource = this.b.createDataSource();
        TransferListener transferListener = this.c;
        if (transferListener != null) {
            dataSourceCreateDataSource.addTransferListener(transferListener);
        }
        c cVar = new c(this.a, dataSourceCreateDataSource);
        this.e.loadStarted(new LoadEventInfo(cVar.a, this.a, this.i.startLoading(cVar, this, this.d.getMinimumLoadableRetryCount(1))), 1, -1, this.j, 0, null, 0L, this.h);
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Loader.LoadErrorAction onLoadError(c loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        StatsDataSource statsDataSource = loadable.c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.a, loadable.b, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), elapsedRealtimeMs, loadDurationMs, statsDataSource.getBytesRead());
        long retryDelayMsFor = this.d.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(1, -1, this.j, 0, null, 0L, C.usToMs(this.h)), error, errorCount));
        boolean z = retryDelayMsFor == C.TIME_UNSET || errorCount >= this.d.getMinimumLoadableRetryCount(1);
        if (this.k && z) {
            Log.w(o, "Loading failed, treating as end-of-stream.", error);
            this.l = true;
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY;
        } else {
            loadErrorActionCreateRetryAction = retryDelayMsFor != C.TIME_UNSET ? Loader.createRetryAction(false, retryDelayMsFor) : Loader.DONT_RETRY_FATAL;
        }
        Loader.LoadErrorAction loadErrorAction = loadErrorActionCreateRetryAction;
        boolean z2 = !loadErrorAction.isRetry();
        this.e.loadError(loadEventInfo, 1, -1, this.j, 0, null, 0L, this.h, error, z2);
        if (z2) {
            this.d.onLoadTaskConcluded(loadable.a);
        }
        return loadErrorAction;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long positionUs, boolean toKeyframe) {
    }

    public void e() {
        this.i.release();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
        return positionUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.l ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return (this.l || this.i.isLoading()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public /* synthetic */ List getStreamKeys(List list) {
        return com.google.android.exoplayer2.source.a.a(this, list);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.i.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long positionUs) {
        callback.onPrepared(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long positionUs) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long positionUs) {
        for (int i = 0; i < this.g.size(); i++) {
            this.g.get(i).b();
        }
        return positionUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
        for (int i = 0; i < selections.length; i++) {
            if (streams[i] != null && (selections[i] == null || !mayRetainStreamFlags[i])) {
                this.g.remove(streams[i]);
                streams[i] = null;
            }
            if (streams[i] == null && selections[i] != null) {
                b bVar = new b();
                this.g.add(bVar);
                streams[i] = bVar;
                streamResetFlags[i] = true;
            }
        }
        return positionUs;
    }
}
