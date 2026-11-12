package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.offline.FilteringManifestParser;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.SinglePeriodTimeline;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SsMediaSource extends BaseMediaSource implements Loader.Callback<ParsingLoadable<SsManifest>> {
    private static final int A = 5000;
    private static final long B = 5000000;
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_MS = 30000;
    private final boolean g;
    private final Uri h;
    private final MediaItem.PlaybackProperties i;
    private final MediaItem j;
    private final DataSource.Factory k;
    private final SsChunkSource.Factory l;
    private final CompositeSequenceableLoaderFactory m;
    private final DrmSessionManager n;
    private final LoadErrorHandlingPolicy o;
    private final long p;
    private final MediaSourceEventListener.EventDispatcher q;
    private final ParsingLoadable.Parser<? extends SsManifest> r;
    private final ArrayList<com.google.android.exoplayer2.source.smoothstreaming.a> s;
    private DataSource t;
    private Loader u;
    private LoaderErrorThrower v;

    @Nullable
    private TransferListener w;
    private long x;
    private SsManifest y;
    private Handler z;

    public static final class Factory implements MediaSourceFactory {
        private final SsChunkSource.Factory a;

        @Nullable
        private final DataSource.Factory b;
        private CompositeSequenceableLoaderFactory c;
        private boolean d;
        private DrmSessionManagerProvider e;
        private LoadErrorHandlingPolicy f;
        private long g;

        @Nullable
        private ParsingLoadable.Parser<? extends SsManifest> h;
        private List<StreamKey> i;

        @Nullable
        private Object j;

        public Factory(DataSource.Factory dataSourceFactory) {
            this(new DefaultSsChunkSource.Factory(dataSourceFactory), dataSourceFactory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ DrmSessionManager b(DrmSessionManager drmSessionManager, MediaItem mediaItem) {
            return drmSessionManager;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public int[] getSupportedTypes() {
            return new int[]{1};
        }

        public Factory setCompositeSequenceableLoaderFactory(@Nullable CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory) {
            if (compositeSequenceableLoaderFactory == null) {
                compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
            }
            this.c = compositeSequenceableLoaderFactory;
            return this;
        }

        public Factory setLivePresentationDelayMs(long livePresentationDelayMs) {
            this.g = livePresentationDelayMs;
            return this;
        }

        public Factory setManifestParser(@Nullable ParsingLoadable.Parser<? extends SsManifest> manifestParser) {
            this.h = manifestParser;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public /* bridge */ /* synthetic */ MediaSourceFactory setStreamKeys(@Nullable List streamKeys) {
            return setStreamKeys((List<StreamKey>) streamKeys);
        }

        @Deprecated
        public Factory setTag(@Nullable Object tag) {
            this.j = tag;
            return this;
        }

        public Factory(SsChunkSource.Factory chunkSourceFactory, @Nullable DataSource.Factory manifestDataSourceFactory) {
            this.a = (SsChunkSource.Factory) Assertions.checkNotNull(chunkSourceFactory);
            this.b = manifestDataSourceFactory;
            this.e = new DefaultDrmSessionManagerProvider();
            this.f = new DefaultLoadErrorHandlingPolicy();
            this.g = 30000L;
            this.c = new DefaultCompositeSequenceableLoaderFactory();
            this.i = Collections.emptyList();
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmHttpDataSourceFactory(@Nullable HttpDataSource.Factory drmHttpDataSourceFactory) {
            if (!this.d) {
                ((DefaultDrmSessionManagerProvider) this.e).setDrmHttpDataSourceFactory(drmHttpDataSourceFactory);
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmSessionManager(@Nullable final DrmSessionManager drmSessionManager) {
            if (drmSessionManager == null) {
                setDrmSessionManagerProvider((DrmSessionManagerProvider) null);
            } else {
                setDrmSessionManagerProvider(new DrmSessionManagerProvider() { // from class: me7
                    @Override // com.google.android.exoplayer2.drm.DrmSessionManagerProvider
                    public final DrmSessionManager get(MediaItem mediaItem) {
                        return SsMediaSource.Factory.b(drmSessionManager, mediaItem);
                    }
                });
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmSessionManagerProvider(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
            if (drmSessionManagerProvider != null) {
                this.e = drmSessionManagerProvider;
                this.d = true;
            } else {
                this.e = new DefaultDrmSessionManagerProvider();
                this.d = false;
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmUserAgent(@Nullable String userAgent) {
            if (!this.d) {
                ((DefaultDrmSessionManagerProvider) this.e).setDrmUserAgent(userAgent);
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            }
            this.f = loadErrorHandlingPolicy;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public Factory setStreamKeys(@Nullable List<StreamKey> streamKeys) {
            if (streamKeys == null) {
                streamKeys = Collections.emptyList();
            }
            this.i = streamKeys;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public SsMediaSource createMediaSource(Uri uri) {
            return createMediaSource(new MediaItem.Builder().setUri(uri).build());
        }

        public SsMediaSource createMediaSource(SsManifest manifest) {
            return createMediaSource(manifest, MediaItem.fromUri(Uri.EMPTY));
        }

        public SsMediaSource createMediaSource(SsManifest manifest, MediaItem mediaItem) {
            List<StreamKey> list;
            SsManifest ssManifestCopy = manifest;
            Assertions.checkArgument(!ssManifestCopy.isLive);
            MediaItem.PlaybackProperties playbackProperties = mediaItem.playbackProperties;
            if (playbackProperties != null && !playbackProperties.streamKeys.isEmpty()) {
                list = mediaItem.playbackProperties.streamKeys;
            } else {
                list = this.i;
            }
            if (!list.isEmpty()) {
                ssManifestCopy = ssManifestCopy.copy(list);
            }
            SsManifest ssManifest = ssManifestCopy;
            MediaItem.PlaybackProperties playbackProperties2 = mediaItem.playbackProperties;
            boolean z = playbackProperties2 != null;
            MediaItem mediaItemBuild = mediaItem.buildUpon().setMimeType(MimeTypes.APPLICATION_SS).setUri(z ? mediaItem.playbackProperties.uri : Uri.EMPTY).setTag(z && playbackProperties2.tag != null ? mediaItem.playbackProperties.tag : this.j).setStreamKeys(list).build();
            return new SsMediaSource(mediaItemBuild, ssManifest, null, null, this.a, this.c, this.e.get(mediaItemBuild), this.f, this.g);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public SsMediaSource createMediaSource(MediaItem mediaItem) {
            List<StreamKey> list;
            MediaItem mediaItemBuild = mediaItem;
            Assertions.checkNotNull(mediaItemBuild.playbackProperties);
            ParsingLoadable.Parser ssManifestParser = this.h;
            if (ssManifestParser == null) {
                ssManifestParser = new SsManifestParser();
            }
            if (!mediaItemBuild.playbackProperties.streamKeys.isEmpty()) {
                list = mediaItemBuild.playbackProperties.streamKeys;
            } else {
                list = this.i;
            }
            ParsingLoadable.Parser filteringManifestParser = !list.isEmpty() ? new FilteringManifestParser(ssManifestParser, list) : ssManifestParser;
            MediaItem.PlaybackProperties playbackProperties = mediaItemBuild.playbackProperties;
            boolean z = playbackProperties.tag == null && this.j != null;
            boolean z2 = playbackProperties.streamKeys.isEmpty() && !list.isEmpty();
            if (z && z2) {
                mediaItemBuild = mediaItem.buildUpon().setTag(this.j).setStreamKeys(list).build();
            } else if (z) {
                mediaItemBuild = mediaItem.buildUpon().setTag(this.j).build();
            } else if (z2) {
                mediaItemBuild = mediaItem.buildUpon().setStreamKeys(list).build();
            }
            MediaItem mediaItem2 = mediaItemBuild;
            return new SsMediaSource(mediaItem2, null, this.b, filteringManifestParser, this.a, this.c, this.e.get(mediaItem2), this.f, this.g);
        }
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.smoothstreaming");
    }

    private void b() {
        SinglePeriodTimeline singlePeriodTimeline;
        for (int i = 0; i < this.s.size(); i++) {
            this.s.get(i).f(this.y);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (SsManifest.StreamElement streamElement : this.y.streamElements) {
            if (streamElement.chunkCount > 0) {
                jMax2 = Math.min(jMax2, streamElement.getStartTimeUs(0));
                jMax = Math.max(jMax, streamElement.getStartTimeUs(streamElement.chunkCount - 1) + streamElement.getChunkDurationUs(streamElement.chunkCount - 1));
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j = this.y.isLive ? -9223372036854775807L : 0L;
            SsManifest ssManifest = this.y;
            boolean z = ssManifest.isLive;
            singlePeriodTimeline = new SinglePeriodTimeline(j, 0L, 0L, 0L, true, z, z, (Object) ssManifest, this.j);
        } else {
            SsManifest ssManifest2 = this.y;
            if (ssManifest2.isLive) {
                long j2 = ssManifest2.dvrWindowLengthUs;
                if (j2 != C.TIME_UNSET && j2 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j2);
                }
                long j3 = jMax2;
                long j4 = jMax - j3;
                long jMsToUs = j4 - C.msToUs(this.p);
                if (jMsToUs < B) {
                    jMsToUs = Math.min(B, j4 / 2);
                }
                singlePeriodTimeline = new SinglePeriodTimeline(C.TIME_UNSET, j4, j3, jMsToUs, true, true, true, (Object) this.y, this.j);
            } else {
                long j5 = ssManifest2.durationUs;
                long j6 = j5 != C.TIME_UNSET ? j5 : jMax - jMax2;
                singlePeriodTimeline = new SinglePeriodTimeline(jMax2 + j6, j6, jMax2, 0L, true, false, false, (Object) this.y, this.j);
            }
        }
        refreshSourceInfo(singlePeriodTimeline);
    }

    private void c() {
        if (this.y.isLive) {
            this.z.postDelayed(new Runnable() { // from class: le7
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d();
                }
            }, Math.max(0L, (this.x + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.u.hasFatalError()) {
            return;
        }
        ParsingLoadable parsingLoadable = new ParsingLoadable(this.t, this.h, 4, this.r);
        this.q.loadStarted(new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, this.u.startLoading(parsingLoadable, this, this.o.getMinimumLoadableRetryCount(parsingLoadable.type))), parsingLoadable.type);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
        MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = createEventDispatcher(id);
        com.google.android.exoplayer2.source.smoothstreaming.a aVar = new com.google.android.exoplayer2.source.smoothstreaming.a(this.y, this.l, this.w, this.m, this.n, createDrmEventDispatcher(id), this.o, eventDispatcherCreateEventDispatcher, this.v, allocator);
        this.s.add(aVar);
        return aVar;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.j;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.v.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
        this.w = mediaTransferListener;
        this.n.prepare();
        if (this.g) {
            this.v = new LoaderErrorThrower.Dummy();
            b();
            return;
        }
        this.t = this.k.createDataSource();
        Loader loader = new Loader("SsMediaSource");
        this.u = loader;
        this.v = loader;
        this.z = Util.createHandlerForCurrentLooper();
        d();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((com.google.android.exoplayer2.source.smoothstreaming.a) mediaPeriod).e();
        this.s.remove(mediaPeriod);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.y = this.g ? this.y : null;
        this.t = null;
        this.x = 0L;
        Loader loader = this.u;
        if (loader != null) {
            loader.release();
            this.u = null;
        }
        Handler handler = this.z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.z = null;
        }
        this.n.release();
    }

    private SsMediaSource(MediaItem mediaItem, @Nullable SsManifest manifest, @Nullable DataSource.Factory manifestDataSourceFactory, @Nullable ParsingLoadable.Parser<? extends SsManifest> manifestParser, SsChunkSource.Factory chunkSourceFactory, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long livePresentationDelayMs) {
        Assertions.checkState(manifest == null || !manifest.isLive);
        this.j = mediaItem;
        MediaItem.PlaybackProperties playbackProperties = (MediaItem.PlaybackProperties) Assertions.checkNotNull(mediaItem.playbackProperties);
        this.i = playbackProperties;
        this.y = manifest;
        this.h = playbackProperties.uri.equals(Uri.EMPTY) ? null : Util.fixSmoothStreamingIsmManifestUri(playbackProperties.uri);
        this.k = manifestDataSourceFactory;
        this.r = manifestParser;
        this.l = chunkSourceFactory;
        this.m = compositeSequenceableLoaderFactory;
        this.n = drmSessionManager;
        this.o = loadErrorHandlingPolicy;
        this.p = livePresentationDelayMs;
        this.q = createEventDispatcher(null);
        this.g = manifest != null;
        this.s = new ArrayList<>();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCanceled(ParsingLoadable<SsManifest> loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
        this.o.onLoadTaskConcluded(loadable.loadTaskId);
        this.q.loadCanceled(loadEventInfo, loadable.type);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCompleted(ParsingLoadable<SsManifest> loadable, long elapsedRealtimeMs, long loadDurationMs) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
        this.o.onLoadTaskConcluded(loadable.loadTaskId);
        this.q.loadCompleted(loadEventInfo, loadable.type);
        this.y = loadable.getResult();
        this.x = elapsedRealtimeMs - loadDurationMs;
        b();
        c();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(ParsingLoadable<SsManifest> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
        long retryDelayMsFor = this.o.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(loadable.type), error, errorCount));
        Loader.LoadErrorAction loadErrorActionCreateRetryAction = retryDelayMsFor == C.TIME_UNSET ? Loader.DONT_RETRY_FATAL : Loader.createRetryAction(false, retryDelayMsFor);
        boolean z = !loadErrorActionCreateRetryAction.isRetry();
        this.q.loadError(loadEventInfo, loadable.type, error, z);
        if (z) {
            this.o.onLoadTaskConcluded(loadable.loadTaskId);
        }
        return loadErrorActionCreateRetryAction;
    }
}
