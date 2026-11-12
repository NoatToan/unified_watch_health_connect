package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.SinglePeriodTimeline;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.FilteringHlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaSource extends BaseMediaSource implements HlsPlaylistTracker.PrimaryPlaylistListener {
    public static final int METADATA_TYPE_EMSG = 3;
    public static final int METADATA_TYPE_ID3 = 1;
    private final HlsExtractorFactory g;
    private final MediaItem.PlaybackProperties h;
    private final HlsDataSourceFactory i;
    private final CompositeSequenceableLoaderFactory j;
    private final DrmSessionManager k;
    private final LoadErrorHandlingPolicy l;
    private final boolean m;
    private final int n;
    private final boolean o;
    private final HlsPlaylistTracker p;
    private final long q;
    private final MediaItem r;
    private MediaItem.LiveConfiguration s;

    @Nullable
    private TransferListener t;

    public static final class Factory implements MediaSourceFactory {
        private final HlsDataSourceFactory a;
        private HlsExtractorFactory b;
        private HlsPlaylistParserFactory c;
        private HlsPlaylistTracker.Factory d;
        private CompositeSequenceableLoaderFactory e;
        private boolean f;
        private DrmSessionManagerProvider g;
        private LoadErrorHandlingPolicy h;
        private boolean i;
        private int j;
        private boolean k;
        private List<StreamKey> l;

        @Nullable
        private Object m;
        private long n;

        public Factory(DataSource.Factory dataSourceFactory) {
            this(new DefaultHlsDataSourceFactory(dataSourceFactory));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ DrmSessionManager b(DrmSessionManager drmSessionManager, MediaItem mediaItem) {
            return drmSessionManager;
        }

        @VisibleForTesting
        public Factory c(long elapsedRealTimeOffsetMs) {
            this.n = elapsedRealTimeOffsetMs;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public int[] getSupportedTypes() {
            return new int[]{2};
        }

        public Factory setAllowChunklessPreparation(boolean allowChunklessPreparation) {
            this.i = allowChunklessPreparation;
            return this;
        }

        public Factory setCompositeSequenceableLoaderFactory(@Nullable CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory) {
            if (compositeSequenceableLoaderFactory == null) {
                compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
            }
            this.e = compositeSequenceableLoaderFactory;
            return this;
        }

        public Factory setExtractorFactory(@Nullable HlsExtractorFactory extractorFactory) {
            if (extractorFactory == null) {
                extractorFactory = HlsExtractorFactory.DEFAULT;
            }
            this.b = extractorFactory;
            return this;
        }

        public Factory setMetadataType(int metadataType) {
            this.j = metadataType;
            return this;
        }

        public Factory setPlaylistParserFactory(@Nullable HlsPlaylistParserFactory playlistParserFactory) {
            if (playlistParserFactory == null) {
                playlistParserFactory = new DefaultHlsPlaylistParserFactory();
            }
            this.c = playlistParserFactory;
            return this;
        }

        public Factory setPlaylistTrackerFactory(@Nullable HlsPlaylistTracker.Factory playlistTrackerFactory) {
            if (playlistTrackerFactory == null) {
                playlistTrackerFactory = DefaultHlsPlaylistTracker.FACTORY;
            }
            this.d = playlistTrackerFactory;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public /* bridge */ /* synthetic */ MediaSourceFactory setStreamKeys(@Nullable List streamKeys) {
            return setStreamKeys((List<StreamKey>) streamKeys);
        }

        @Deprecated
        public Factory setTag(@Nullable Object tag) {
            this.m = tag;
            return this;
        }

        public Factory setUseSessionKeys(boolean useSessionKeys) {
            this.k = useSessionKeys;
            return this;
        }

        public Factory(HlsDataSourceFactory hlsDataSourceFactory) {
            this.a = (HlsDataSourceFactory) Assertions.checkNotNull(hlsDataSourceFactory);
            this.g = new DefaultDrmSessionManagerProvider();
            this.c = new DefaultHlsPlaylistParserFactory();
            this.d = DefaultHlsPlaylistTracker.FACTORY;
            this.b = HlsExtractorFactory.DEFAULT;
            this.h = new DefaultLoadErrorHandlingPolicy();
            this.e = new DefaultCompositeSequenceableLoaderFactory();
            this.j = 1;
            this.l = Collections.emptyList();
            this.n = C.TIME_UNSET;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmHttpDataSourceFactory(@Nullable HttpDataSource.Factory drmHttpDataSourceFactory) {
            if (!this.f) {
                ((DefaultDrmSessionManagerProvider) this.g).setDrmHttpDataSourceFactory(drmHttpDataSourceFactory);
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmSessionManager(@Nullable final DrmSessionManager drmSessionManager) {
            if (drmSessionManager == null) {
                setDrmSessionManagerProvider((DrmSessionManagerProvider) null);
            } else {
                setDrmSessionManagerProvider(new DrmSessionManagerProvider() { // from class: b24
                    @Override // com.google.android.exoplayer2.drm.DrmSessionManagerProvider
                    public final DrmSessionManager get(MediaItem mediaItem) {
                        return HlsMediaSource.Factory.b(drmSessionManager, mediaItem);
                    }
                });
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmSessionManagerProvider(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
            if (drmSessionManagerProvider != null) {
                this.g = drmSessionManagerProvider;
                this.f = true;
            } else {
                this.g = new DefaultDrmSessionManagerProvider();
                this.f = false;
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmUserAgent(@Nullable String userAgent) {
            if (!this.f) {
                ((DefaultDrmSessionManagerProvider) this.g).setDrmUserAgent(userAgent);
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            }
            this.h = loadErrorHandlingPolicy;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public Factory setStreamKeys(@Nullable List<StreamKey> streamKeys) {
            if (streamKeys == null) {
                streamKeys = Collections.emptyList();
            }
            this.l = streamKeys;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public HlsMediaSource createMediaSource(Uri uri) {
            return createMediaSource(new MediaItem.Builder().setUri(uri).setMimeType(MimeTypes.APPLICATION_M3U8).build());
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public HlsMediaSource createMediaSource(MediaItem mediaItem) {
            List<StreamKey> list;
            MediaItem mediaItemBuild = mediaItem;
            Assertions.checkNotNull(mediaItemBuild.playbackProperties);
            HlsPlaylistParserFactory filteringHlsPlaylistParserFactory = this.c;
            if (mediaItemBuild.playbackProperties.streamKeys.isEmpty()) {
                list = this.l;
            } else {
                list = mediaItemBuild.playbackProperties.streamKeys;
            }
            if (!list.isEmpty()) {
                filteringHlsPlaylistParserFactory = new FilteringHlsPlaylistParserFactory(filteringHlsPlaylistParserFactory, list);
            }
            MediaItem.PlaybackProperties playbackProperties = mediaItemBuild.playbackProperties;
            boolean z = playbackProperties.tag == null && this.m != null;
            boolean z2 = playbackProperties.streamKeys.isEmpty() && !list.isEmpty();
            if (z && z2) {
                mediaItemBuild = mediaItem.buildUpon().setTag(this.m).setStreamKeys(list).build();
            } else if (z) {
                mediaItemBuild = mediaItem.buildUpon().setTag(this.m).build();
            } else if (z2) {
                mediaItemBuild = mediaItem.buildUpon().setStreamKeys(list).build();
            }
            MediaItem mediaItem2 = mediaItemBuild;
            HlsDataSourceFactory hlsDataSourceFactory = this.a;
            HlsExtractorFactory hlsExtractorFactory = this.b;
            CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory = this.e;
            DrmSessionManager drmSessionManager = this.g.get(mediaItem2);
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.h;
            return new HlsMediaSource(mediaItem2, hlsDataSourceFactory, hlsExtractorFactory, compositeSequenceableLoaderFactory, drmSessionManager, loadErrorHandlingPolicy, this.d.createTracker(this.a, loadErrorHandlingPolicy, filteringHlsPlaylistParserFactory), this.n, this.i, this.j, this.k);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MetadataType {
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.hls");
    }

    private SinglePeriodTimeline a(HlsMediaPlaylist playlist, long presentationStartTimeMs, long windowStartTimeMs, HlsManifest manifest) {
        long initialStartTimeUs = playlist.startTimeUs - this.p.getInitialStartTimeUs();
        long j = playlist.hasEndTag ? initialStartTimeUs + playlist.durationUs : -9223372036854775807L;
        long jE = e(playlist);
        long j2 = this.s.targetOffsetMs;
        h(Util.constrainValue(j2 != C.TIME_UNSET ? C.msToUs(j2) : g(playlist, jE), jE, playlist.durationUs + jE));
        return new SinglePeriodTimeline(presentationStartTimeMs, windowStartTimeMs, C.TIME_UNSET, j, playlist.durationUs, initialStartTimeUs, f(playlist, jE), true, !playlist.hasEndTag, playlist.playlistType == 2 && playlist.hasPositiveStartOffset, manifest, this.r, this.s);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    private SinglePeriodTimeline b(HlsMediaPlaylist playlist, long presentationStartTimeMs, long windowStartTimeMs, HlsManifest manifest) {
        long j;
        if (playlist.startOffsetUs == C.TIME_UNSET || playlist.segments.isEmpty()) {
            j = 0;
        } else if (playlist.preciseStart) {
            j = playlist.startOffsetUs;
        } else {
            long j2 = playlist.startOffsetUs;
            if (j2 == playlist.durationUs) {
                j = playlist.startOffsetUs;
            } else {
                j = d(playlist.segments, j2).relativeStartTimeUs;
            }
        }
        long j3 = playlist.durationUs;
        return new SinglePeriodTimeline(presentationStartTimeMs, windowStartTimeMs, C.TIME_UNSET, j3, j3, 0L, j, true, false, true, manifest, this.r, null);
    }

    @Nullable
    private static HlsMediaPlaylist.Part c(List<HlsMediaPlaylist.Part> parts, long positionUs) {
        HlsMediaPlaylist.Part part = null;
        for (int i = 0; i < parts.size(); i++) {
            HlsMediaPlaylist.Part part2 = parts.get(i);
            long j = part2.relativeStartTimeUs;
            if (j > positionUs || !part2.isIndependent) {
                if (j > positionUs) {
                    break;
                }
            } else {
                part = part2;
            }
        }
        return part;
    }

    private static HlsMediaPlaylist.Segment d(List<HlsMediaPlaylist.Segment> segments, long positionUs) {
        return segments.get(Util.binarySearchFloor((List<? extends Comparable<? super Long>>) segments, Long.valueOf(positionUs), true, true));
    }

    private long e(HlsMediaPlaylist playlist) {
        if (playlist.hasProgramDateTime) {
            return C.msToUs(Util.getNowUnixTimeMs(this.q)) - playlist.getEndTimeUs();
        }
        return 0L;
    }

    private long f(HlsMediaPlaylist playlist, long liveEdgeOffsetUs) {
        long jMsToUs = playlist.startOffsetUs;
        if (jMsToUs == C.TIME_UNSET) {
            jMsToUs = (playlist.durationUs + liveEdgeOffsetUs) - C.msToUs(this.s.targetOffsetMs);
        }
        if (playlist.preciseStart) {
            return jMsToUs;
        }
        HlsMediaPlaylist.Part partC = c(playlist.trailingParts, jMsToUs);
        if (partC != null) {
            return partC.relativeStartTimeUs;
        }
        if (playlist.segments.isEmpty()) {
            return 0L;
        }
        HlsMediaPlaylist.Segment segmentD = d(playlist.segments, jMsToUs);
        HlsMediaPlaylist.Part partC2 = c(segmentD.parts, jMsToUs);
        return partC2 != null ? partC2.relativeStartTimeUs : segmentD.relativeStartTimeUs;
    }

    private static long g(HlsMediaPlaylist playlist, long liveEdgeOffsetUs) {
        long j;
        HlsMediaPlaylist.ServerControl serverControl = playlist.serverControl;
        long j2 = playlist.startOffsetUs;
        if (j2 != C.TIME_UNSET) {
            j = playlist.durationUs - j2;
        } else {
            long j3 = serverControl.partHoldBackUs;
            if (j3 == C.TIME_UNSET || playlist.partTargetDurationUs == C.TIME_UNSET) {
                long j4 = serverControl.holdBackUs;
                j = j4 != C.TIME_UNSET ? j4 : playlist.targetDurationUs * 3;
            } else {
                j = j3;
            }
        }
        return j + liveEdgeOffsetUs;
    }

    private void h(long targetLiveOffsetUs) {
        long jUsToMs = C.usToMs(targetLiveOffsetUs);
        if (jUsToMs != this.s.targetOffsetMs) {
            this.s = this.r.buildUpon().setLiveTargetOffsetMs(jUsToMs).build().liveConfiguration;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
        MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = createEventDispatcher(id);
        return new HlsMediaPeriod(this.g, this.p, this.i, this.t, this.k, createDrmEventDispatcher(id), this.l, eventDispatcherCreateEventDispatcher, allocator, this.j, this.m, this.n, this.o);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.r;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.p.maybeThrowPrimaryPlaylistRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener
    public void onPrimaryPlaylistRefreshed(HlsMediaPlaylist mediaPlaylist) {
        long jUsToMs = mediaPlaylist.hasProgramDateTime ? C.usToMs(mediaPlaylist.startTimeUs) : -9223372036854775807L;
        int i = mediaPlaylist.playlistType;
        long j = (i == 2 || i == 1) ? jUsToMs : -9223372036854775807L;
        HlsManifest hlsManifest = new HlsManifest((HlsMasterPlaylist) Assertions.checkNotNull(this.p.getMasterPlaylist()), mediaPlaylist);
        refreshSourceInfo(this.p.isLive() ? a(mediaPlaylist, j, jUsToMs, hlsManifest) : b(mediaPlaylist, j, jUsToMs, hlsManifest));
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
        this.t = mediaTransferListener;
        this.k.prepare();
        this.p.start(this.h.uri, createEventDispatcher(null), this);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((HlsMediaPeriod) mediaPeriod).release();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.p.stop();
        this.k.release();
    }

    private HlsMediaSource(MediaItem mediaItem, HlsDataSourceFactory dataSourceFactory, HlsExtractorFactory extractorFactory, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistTracker playlistTracker, long elapsedRealTimeOffsetMs, boolean allowChunklessPreparation, int metadataType, boolean useSessionKeys) {
        this.h = (MediaItem.PlaybackProperties) Assertions.checkNotNull(mediaItem.playbackProperties);
        this.r = mediaItem;
        this.s = mediaItem.liveConfiguration;
        this.i = dataSourceFactory;
        this.g = extractorFactory;
        this.j = compositeSequenceableLoaderFactory;
        this.k = drmSessionManager;
        this.l = loadErrorHandlingPolicy;
        this.p = playlistTracker;
        this.q = elapsedRealTimeOffsetMs;
        this.m = allowChunklessPreparation;
        this.n = metadataType;
        this.o = useSessionKeys;
    }
}
