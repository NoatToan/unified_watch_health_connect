package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
final class h implements MediaPeriod, ExtractorOutput, Loader.Callback<a>, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener {
    private static final long M = 10000;
    private static final Map<String, String> N = p();
    private static final Format O = new Format.Builder().setId("icy").setSampleMimeType(MimeTypes.APPLICATION_ICY).build();
    private boolean A;
    private boolean C;
    private boolean D;
    private int E;
    private long G;
    private boolean I;
    private int J;
    private boolean K;
    private boolean L;
    private final Uri a;
    private final DataSource b;
    private final DrmSessionManager c;
    private final LoadErrorHandlingPolicy d;
    private final MediaSourceEventListener.EventDispatcher e;
    private final DrmSessionEventListener.EventDispatcher f;
    private final b g;
    private final Allocator h;

    @Nullable
    private final String i;
    private final long j;
    private final ProgressiveMediaExtractor l;

    @Nullable
    private MediaPeriod.Callback q;

    @Nullable
    private IcyHeaders r;
    private boolean u;
    private boolean v;
    private boolean w;
    private e x;
    private SeekMap y;
    private final Loader k = new Loader("ProgressiveMediaPeriod");
    private final ConditionVariable m = new ConditionVariable();
    private final Runnable n = new Runnable() { // from class: com.google.android.exoplayer2.source.e
        @Override // java.lang.Runnable
        public final void run() {
            this.a.x();
        }
    };
    private final Runnable o = new Runnable() { // from class: com.google.android.exoplayer2.source.f
        @Override // java.lang.Runnable
        public final void run() {
            this.a.v();
        }
    };
    private final Handler p = Util.createHandlerForCurrentLooper();
    private d[] t = new d[0];
    private SampleQueue[] s = new SampleQueue[0];
    private long H = C.TIME_UNSET;
    private long F = -1;
    private long z = C.TIME_UNSET;
    private int B = 1;

    public final class a implements Loader.Loadable, IcyDataSource.Listener {
        private final Uri b;
        private final StatsDataSource c;
        private final ProgressiveMediaExtractor d;
        private final ExtractorOutput e;
        private final ConditionVariable f;
        private volatile boolean h;
        private long j;

        @Nullable
        private TrackOutput m;
        private boolean n;
        private final PositionHolder g = new PositionHolder();
        private boolean i = true;
        private long l = -1;
        private final long a = LoadEventInfo.getNewId();
        private DataSpec k = g(0);

        public a(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, ExtractorOutput extractorOutput, ConditionVariable loadCondition) {
            this.b = uri;
            this.c = new StatsDataSource(dataSource);
            this.d = progressiveMediaExtractor;
            this.e = extractorOutput;
            this.f = loadCondition;
        }

        private DataSpec g(long position) {
            return new DataSpec.Builder().setUri(this.b).setPosition(position).setKey(h.this.i).setFlags(6).setHttpRequestHeaders(h.N).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(long position, long timeUs) {
            this.g.position = position;
            this.j = timeUs;
            this.i = true;
            this.n = false;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
            this.h = true;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x00fb */
        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void load() throws IOException {
            int i = 0;
            while (i == 0 && !this.h) {
                long j = this.g.position;
                DataSpec dataSpecG = g(j);
                this.k = dataSpecG;
                long jOpen = this.c.open(dataSpecG);
                this.l = jOpen;
                if (jOpen != -1) {
                    this.l = jOpen + j;
                }
                h.this.r = IcyHeaders.parse(this.c.getResponseHeaders());
                DataReader icyDataSource = this.c;
                if (h.this.r != null && h.this.r.metadataInterval != -1) {
                    icyDataSource = new IcyDataSource(this.c, h.this.r.metadataInterval, this);
                    TrackOutput trackOutputS = h.this.s();
                    this.m = trackOutputS;
                    trackOutputS.format(h.O);
                }
                long currentInputPosition = j;
                this.d.init(icyDataSource, this.b, this.c.getResponseHeaders(), j, this.l, this.e);
                if (h.this.r != null) {
                    this.d.disableSeekingOnMp3Streams();
                }
                if (this.i) {
                    this.d.seek(currentInputPosition, this.j);
                    this.i = false;
                }
                while (true) {
                    long j2 = currentInputPosition;
                    while (true) {
                        if (i != 0 || this.h) {
                            break;
                        }
                        try {
                            this.f.block();
                            i = this.d.read(this.g);
                            currentInputPosition = this.d.getCurrentInputPosition();
                            if (currentInputPosition > h.this.j + j2) {
                                this.f.close();
                                h.this.p.post(h.this.o);
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                }
                if (i == 1) {
                    i = 0;
                } else if (this.d.getCurrentInputPosition() != -1) {
                    this.g.position = this.d.getCurrentInputPosition();
                }
                Util.closeQuietly(this.c);
            }
        }

        @Override // com.google.android.exoplayer2.source.IcyDataSource.Listener
        public void onIcyMetadata(ParsableByteArray metadata) {
            long jMax = !this.n ? this.j : Math.max(h.this.r(), this.j);
            int iBytesLeft = metadata.bytesLeft();
            TrackOutput trackOutput = (TrackOutput) Assertions.checkNotNull(this.m);
            trackOutput.sampleData(metadata, iBytesLeft);
            trackOutput.sampleMetadata(jMax, 1, iBytesLeft, 0, null);
            this.n = true;
        }
    }

    public interface b {
        void onSourceInfoRefreshed(long durationUs, boolean isSeekable, boolean isLive);
    }

    public final class c implements SampleStream {
        private final int a;

        public c(int track) {
            this.a = track;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return h.this.u(this.a);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
            h.this.B(this.a);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
            return h.this.G(this.a, formatHolder, buffer, readFlags);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long positionUs) {
            return h.this.K(this.a, positionUs);
        }
    }

    public static final class d {
        public final int a;
        public final boolean b;

        public d(int id, boolean isIcyTrack) {
            this.a = id;
            this.b = isIcyTrack;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public int hashCode() {
            return (this.a * 31) + (this.b ? 1 : 0);
        }
    }

    public static final class e {
        public final TrackGroupArray a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;

        public e(TrackGroupArray tracks, boolean[] trackIsAudioVideoFlags) {
            this.a = tracks;
            this.b = trackIsAudioVideoFlags;
            int i = tracks.length;
            this.c = new boolean[i];
            this.d = new boolean[i];
        }
    }

    public h(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher drmEventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher, b listener, Allocator allocator, @Nullable String customCacheKey, int continueLoadingCheckIntervalBytes) {
        this.a = uri;
        this.b = dataSource;
        this.c = drmSessionManager;
        this.f = drmEventDispatcher;
        this.d = loadErrorHandlingPolicy;
        this.e = mediaSourceEventDispatcher;
        this.g = listener;
        this.h = allocator;
        this.i = customCacheKey;
        this.j = continueLoadingCheckIntervalBytes;
        this.l = progressiveMediaExtractor;
    }

    private TrackOutput F(d id) {
        int length = this.s.length;
        for (int i = 0; i < length; i++) {
            if (id.equals(this.t[i])) {
                return this.s[i];
            }
        }
        SampleQueue sampleQueueCreateWithDrm = SampleQueue.createWithDrm(this.h, this.p.getLooper(), this.c, this.f);
        sampleQueueCreateWithDrm.setUpstreamFormatChangeListener(this);
        int i2 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.t, i2);
        dVarArr[length] = id;
        this.t = (d[]) Util.castNonNullTypeArray(dVarArr);
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.s, i2);
        sampleQueueArr[length] = sampleQueueCreateWithDrm;
        this.s = (SampleQueue[]) Util.castNonNullTypeArray(sampleQueueArr);
        return sampleQueueCreateWithDrm;
    }

    private boolean I(boolean[] trackIsAudioVideoFlags, long positionUs) {
        int length = this.s.length;
        for (int i = 0; i < length; i++) {
            if (!this.s[i].seekTo(positionUs, false) && (trackIsAudioVideoFlags[i] || !this.w)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void w(SeekMap seekMap) {
        this.y = this.r == null ? seekMap : new SeekMap.Unseekable(C.TIME_UNSET);
        this.z = seekMap.getDurationUs();
        boolean z = this.F == -1 && seekMap.getDurationUs() == C.TIME_UNSET;
        this.A = z;
        this.B = z ? 7 : 1;
        this.g.onSourceInfoRefreshed(this.z, seekMap.isSeekable(), this.A);
        if (this.v) {
            return;
        }
        x();
    }

    private void L() {
        a aVar = new a(this.a, this.b, this.l, this, this.m);
        if (this.v) {
            Assertions.checkState(t());
            long j = this.z;
            if (j != C.TIME_UNSET && this.H > j) {
                this.K = true;
                this.H = C.TIME_UNSET;
                return;
            }
            aVar.h(((SeekMap) Assertions.checkNotNull(this.y)).getSeekPoints(this.H).first.position, this.H);
            for (SampleQueue sampleQueue : this.s) {
                sampleQueue.setStartTimeUs(this.H);
            }
            this.H = C.TIME_UNSET;
        }
        this.J = q();
        this.e.loadStarted(new LoadEventInfo(aVar.a, aVar.k, this.k.startLoading(aVar, this, this.d.getMinimumLoadableRetryCount(this.B))), 1, -1, null, 0, null, aVar.j, this.z);
    }

    private boolean M() {
        return this.D || t();
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void m() {
        Assertions.checkState(this.v);
        Assertions.checkNotNull(this.x);
        Assertions.checkNotNull(this.y);
    }

    private boolean n(a loadable, int currentExtractedSampleCount) {
        SeekMap seekMap;
        if (this.F != -1 || ((seekMap = this.y) != null && seekMap.getDurationUs() != C.TIME_UNSET)) {
            this.J = currentExtractedSampleCount;
            return true;
        }
        if (this.v && !M()) {
            this.I = true;
            return false;
        }
        this.D = this.v;
        this.G = 0L;
        this.J = 0;
        for (SampleQueue sampleQueue : this.s) {
            sampleQueue.reset();
        }
        loadable.h(0L, 0L);
        return true;
    }

    private void o(a loadable) {
        if (this.F == -1) {
            this.F = loadable.l;
        }
    }

    private static Map<String, String> p() {
        HashMap map = new HashMap();
        map.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        return Collections.unmodifiableMap(map);
    }

    private int q() {
        int writeIndex = 0;
        for (SampleQueue sampleQueue : this.s) {
            writeIndex += sampleQueue.getWriteIndex();
        }
        return writeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long r() {
        long jMax = Long.MIN_VALUE;
        for (SampleQueue sampleQueue : this.s) {
            jMax = Math.max(jMax, sampleQueue.getLargestQueuedTimestampUs());
        }
        return jMax;
    }

    private boolean t() {
        return this.H != C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        if (this.L) {
            return;
        }
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.q)).onContinueLoadingRequested(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (this.L || this.v || !this.u || this.y == null) {
            return;
        }
        for (SampleQueue sampleQueue : this.s) {
            if (sampleQueue.getUpstreamFormat() == null) {
                return;
            }
        }
        this.m.close();
        int length = this.s.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            Format formatBuild = (Format) Assertions.checkNotNull(this.s[i].getUpstreamFormat());
            String str = formatBuild.sampleMimeType;
            boolean zIsAudio = MimeTypes.isAudio(str);
            boolean z = zIsAudio || MimeTypes.isVideo(str);
            zArr[i] = z;
            this.w = z | this.w;
            IcyHeaders icyHeaders = this.r;
            if (icyHeaders != null) {
                if (zIsAudio || this.t[i].b) {
                    Metadata metadata = formatBuild.metadata;
                    formatBuild = formatBuild.buildUpon().setMetadata(metadata == null ? new Metadata(icyHeaders) : metadata.copyWithAppendedEntries(icyHeaders)).build();
                }
                if (zIsAudio && formatBuild.averageBitrate == -1 && formatBuild.peakBitrate == -1 && icyHeaders.bitrate != -1) {
                    formatBuild = formatBuild.buildUpon().setAverageBitrate(icyHeaders.bitrate).build();
                }
            }
            trackGroupArr[i] = new TrackGroup(formatBuild.copyWithExoMediaCryptoType(this.c.getExoMediaCryptoType(formatBuild)));
        }
        this.x = new e(new TrackGroupArray(trackGroupArr), zArr);
        this.v = true;
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.q)).onPrepared(this);
    }

    private void y(int track) {
        m();
        e eVar = this.x;
        boolean[] zArr = eVar.d;
        if (zArr[track]) {
            return;
        }
        Format format = eVar.a.get(track).getFormat(0);
        this.e.downstreamFormatChanged(MimeTypes.getTrackType(format.sampleMimeType), format, 0, null, this.G);
        zArr[track] = true;
    }

    private void z(int track) {
        m();
        boolean[] zArr = this.x.b;
        if (this.I && zArr[track]) {
            if (this.s[track].isReady(false)) {
                return;
            }
            this.H = 0L;
            this.I = false;
            this.D = true;
            this.G = 0L;
            this.J = 0;
            for (SampleQueue sampleQueue : this.s) {
                sampleQueue.reset();
            }
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.q)).onContinueLoadingRequested(this);
        }
    }

    public void A() throws IOException {
        this.k.maybeThrowError(this.d.getMinimumLoadableRetryCount(this.B));
    }

    public void B(int sampleQueueIndex) throws IOException {
        this.s[sampleQueueIndex].maybeThrowError();
        A();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void onLoadCanceled(a loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        StatsDataSource statsDataSource = loadable.c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.a, loadable.k, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), elapsedRealtimeMs, loadDurationMs, statsDataSource.getBytesRead());
        this.d.onLoadTaskConcluded(loadable.a);
        this.e.loadCanceled(loadEventInfo, 1, -1, null, 0, null, loadable.j, this.z);
        if (released) {
            return;
        }
        o(loadable);
        for (SampleQueue sampleQueue : this.s) {
            sampleQueue.reset();
        }
        if (this.E > 0) {
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.q)).onContinueLoadingRequested(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void onLoadCompleted(a loadable, long elapsedRealtimeMs, long loadDurationMs) {
        SeekMap seekMap;
        if (this.z == C.TIME_UNSET && (seekMap = this.y) != null) {
            boolean zIsSeekable = seekMap.isSeekable();
            long jR = r();
            long j = jR == Long.MIN_VALUE ? 0L : jR + 10000;
            this.z = j;
            this.g.onSourceInfoRefreshed(j, zIsSeekable, this.A);
        }
        StatsDataSource statsDataSource = loadable.c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.a, loadable.k, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), elapsedRealtimeMs, loadDurationMs, statsDataSource.getBytesRead());
        this.d.onLoadTaskConcluded(loadable.a);
        this.e.loadCompleted(loadEventInfo, 1, -1, null, 0, null, loadable.j, this.z);
        o(loadable);
        this.K = true;
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.q)).onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Loader.LoadErrorAction onLoadError(a loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        o(loadable);
        StatsDataSource statsDataSource = loadable.c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.a, loadable.k, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), elapsedRealtimeMs, loadDurationMs, statsDataSource.getBytesRead());
        long retryDelayMsFor = this.d.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(1, -1, null, 0, null, C.usToMs(loadable.j), C.usToMs(this.z)), error, errorCount));
        if (retryDelayMsFor == C.TIME_UNSET) {
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY_FATAL;
        } else {
            int iQ = q();
            loadErrorActionCreateRetryAction = n(loadable, iQ) ? Loader.createRetryAction(iQ > this.J, retryDelayMsFor) : Loader.DONT_RETRY;
        }
        boolean z = !loadErrorActionCreateRetryAction.isRetry();
        this.e.loadError(loadEventInfo, 1, -1, null, 0, null, loadable.j, this.z, error, z);
        if (z) {
            this.d.onLoadTaskConcluded(loadable.a);
        }
        return loadErrorActionCreateRetryAction;
    }

    public int G(int sampleQueueIndex, FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
        if (M()) {
            return -3;
        }
        y(sampleQueueIndex);
        int i = this.s[sampleQueueIndex].read(formatHolder, buffer, readFlags, this.K);
        if (i == -3) {
            z(sampleQueueIndex);
        }
        return i;
    }

    public void H() {
        if (this.v) {
            for (SampleQueue sampleQueue : this.s) {
                sampleQueue.preRelease();
            }
        }
        this.k.release(this);
        this.p.removeCallbacksAndMessages(null);
        this.q = null;
        this.L = true;
    }

    public int K(int track, long positionUs) {
        if (M()) {
            return 0;
        }
        y(track);
        SampleQueue sampleQueue = this.s[track];
        int skipCount = sampleQueue.getSkipCount(positionUs, this.K);
        sampleQueue.skip(skipCount);
        if (skipCount == 0) {
            z(track);
        }
        return skipCount;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long playbackPositionUs) {
        if (this.K || this.k.hasFatalError() || this.I) {
            return false;
        }
        if (this.v && this.E == 0) {
            return false;
        }
        boolean zOpen = this.m.open();
        if (this.k.isLoading()) {
            return zOpen;
        }
        L();
        return true;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long positionUs, boolean toKeyframe) {
        m();
        if (t()) {
            return;
        }
        boolean[] zArr = this.x.c;
        int length = this.s.length;
        for (int i = 0; i < length; i++) {
            this.s[i].discardTo(positionUs, toKeyframe, zArr[i]);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
        this.u = true;
        this.p.post(this.n);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
        m();
        if (!this.y.isSeekable()) {
            return 0L;
        }
        SeekMap.SeekPoints seekPoints = this.y.getSeekPoints(positionUs);
        return seekParameters.resolveSeekPositionUs(positionUs, seekPoints.first.timeUs, seekPoints.second.timeUs);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long jR;
        m();
        boolean[] zArr = this.x.b;
        if (this.K) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.H;
        }
        if (this.w) {
            int length = this.s.length;
            jR = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.s[i].isLastSampleQueued()) {
                    jR = Math.min(jR, this.s[i].getLargestQueuedTimestampUs());
                }
            }
        } else {
            jR = Long.MAX_VALUE;
        }
        if (jR == Long.MAX_VALUE) {
            jR = r();
        }
        return jR == Long.MIN_VALUE ? this.G : jR;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (this.E == 0) {
            return Long.MIN_VALUE;
        }
        return getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public /* synthetic */ List getStreamKeys(List list) {
        return com.google.android.exoplayer2.source.a.a(this, list);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        m();
        return this.x.a;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.k.isLoading() && this.m.isOpen();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        A();
        if (this.K && !this.v) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (SampleQueue sampleQueue : this.s) {
            sampleQueue.release();
        }
        this.l.release();
    }

    @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
        this.p.post(this.n);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long positionUs) {
        this.q = callback;
        this.m.open();
        L();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        if (!this.D) {
            return C.TIME_UNSET;
        }
        if (!this.K && q() <= this.J) {
            return C.TIME_UNSET;
        }
        this.D = false;
        return this.G;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long positionUs) {
    }

    public TrackOutput s() {
        return F(new d(0, true));
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(final SeekMap seekMap) {
        this.p.post(new Runnable() { // from class: com.google.android.exoplayer2.source.g
            @Override // java.lang.Runnable
            public final void run() {
                this.a.w(seekMap);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long positionUs) {
        m();
        boolean[] zArr = this.x.b;
        if (!this.y.isSeekable()) {
            positionUs = 0;
        }
        int i = 0;
        this.D = false;
        this.G = positionUs;
        if (t()) {
            this.H = positionUs;
            return positionUs;
        }
        if (this.B != 7 && I(zArr, positionUs)) {
            return positionUs;
        }
        this.I = false;
        this.H = positionUs;
        this.K = false;
        if (this.k.isLoading()) {
            SampleQueue[] sampleQueueArr = this.s;
            int length = sampleQueueArr.length;
            while (i < length) {
                sampleQueueArr[i].discardToEnd();
                i++;
            }
            this.k.cancelLoading();
        } else {
            this.k.clearFatalError();
            SampleQueue[] sampleQueueArr2 = this.s;
            int length2 = sampleQueueArr2.length;
            while (i < length2) {
                sampleQueueArr2[i].reset();
                i++;
            }
        }
        return positionUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
        m();
        e eVar = this.x;
        TrackGroupArray trackGroupArray = eVar.a;
        boolean[] zArr = eVar.c;
        int i = this.E;
        int i2 = 0;
        for (int i3 = 0; i3 < selections.length; i3++) {
            if (streams[i3] != null && (selections[i3] == null || !mayRetainStreamFlags[i3])) {
                int i4 = ((c) streams[i3]).a;
                Assertions.checkState(zArr[i4]);
                this.E--;
                zArr[i4] = false;
                streams[i3] = null;
            }
        }
        boolean z = !this.C ? positionUs == 0 : i != 0;
        for (int i5 = 0; i5 < selections.length; i5++) {
            if (streams[i5] == null && selections[i5] != null) {
                ExoTrackSelection exoTrackSelection = selections[i5];
                Assertions.checkState(exoTrackSelection.length() == 1);
                Assertions.checkState(exoTrackSelection.getIndexInTrackGroup(0) == 0);
                int iIndexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
                Assertions.checkState(!zArr[iIndexOf]);
                this.E++;
                zArr[iIndexOf] = true;
                streams[i5] = new c(iIndexOf);
                streamResetFlags[i5] = true;
                if (!z) {
                    SampleQueue sampleQueue = this.s[iIndexOf];
                    z = (sampleQueue.seekTo(positionUs, true) || sampleQueue.getReadIndex() == 0) ? false : true;
                }
            }
        }
        if (this.E == 0) {
            this.I = false;
            this.D = false;
            if (this.k.isLoading()) {
                SampleQueue[] sampleQueueArr = this.s;
                int length = sampleQueueArr.length;
                while (i2 < length) {
                    sampleQueueArr[i2].discardToEnd();
                    i2++;
                }
                this.k.cancelLoading();
            } else {
                SampleQueue[] sampleQueueArr2 = this.s;
                int length2 = sampleQueueArr2.length;
                while (i2 < length2) {
                    sampleQueueArr2[i2].reset();
                    i2++;
                }
            }
        } else if (z) {
            positionUs = seekToUs(positionUs);
            while (i2 < streams.length) {
                if (streams[i2] != null) {
                    streamResetFlags[i2] = true;
                }
                i2++;
            }
        }
        this.C = true;
        return positionUs;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public TrackOutput track(int id, int type) {
        return F(new d(id, false));
    }

    public boolean u(int track) {
        return !M() && this.s[track].isReady(this.K);
    }
}
