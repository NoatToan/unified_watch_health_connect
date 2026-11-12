package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ProgressiveMediaSource extends BaseMediaSource implements h.b {
    public static final int DEFAULT_LOADING_CHECK_INTERVAL_BYTES = 1048576;
    private final MediaItem g;
    private final MediaItem.PlaybackProperties h;
    private final DataSource.Factory i;
    private final ProgressiveMediaExtractor.Factory j;
    private final DrmSessionManager k;
    private final LoadErrorHandlingPolicy l;
    private final int m;
    private boolean n;
    private long o;
    private boolean p;
    private boolean q;

    @Nullable
    private TransferListener r;

    public static final class Factory implements MediaSourceFactory {
        private final DataSource.Factory a;
        private ProgressiveMediaExtractor.Factory b;
        private boolean c;
        private DrmSessionManagerProvider d;
        private LoadErrorHandlingPolicy e;
        private int f;

        @Nullable
        private String g;

        @Nullable
        private Object h;

        public Factory(DataSource.Factory dataSourceFactory) {
            this(dataSourceFactory, new DefaultExtractorsFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ProgressiveMediaExtractor d(ExtractorsFactory extractorsFactory) {
            return new BundledExtractorsAdapter(extractorsFactory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ DrmSessionManager e(DrmSessionManager drmSessionManager, MediaItem mediaItem) {
            return drmSessionManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ProgressiveMediaExtractor f(ExtractorsFactory extractorsFactory) {
            if (extractorsFactory == null) {
                extractorsFactory = new DefaultExtractorsFactory();
            }
            return new BundledExtractorsAdapter(extractorsFactory);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public int[] getSupportedTypes() {
            return new int[]{4};
        }

        public Factory setContinueLoadingCheckIntervalBytes(int continueLoadingCheckIntervalBytes) {
            this.f = continueLoadingCheckIntervalBytes;
            return this;
        }

        @Deprecated
        public Factory setCustomCacheKey(@Nullable String customCacheKey) {
            this.g = customCacheKey;
            return this;
        }

        @Deprecated
        public Factory setExtractorsFactory(@Nullable final ExtractorsFactory extractorsFactory) {
            this.b = new ProgressiveMediaExtractor.Factory() { // from class: k46
                @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory
                public final ProgressiveMediaExtractor createProgressiveMediaExtractor() {
                    return ProgressiveMediaSource.Factory.f(extractorsFactory);
                }
            };
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* synthetic */ MediaSourceFactory setStreamKeys(List list) {
            return c.b(this, list);
        }

        @Deprecated
        public Factory setTag(@Nullable Object tag) {
            this.h = tag;
            return this;
        }

        public Factory(DataSource.Factory dataSourceFactory, final ExtractorsFactory extractorsFactory) {
            this(dataSourceFactory, new ProgressiveMediaExtractor.Factory() { // from class: j46
                @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory
                public final ProgressiveMediaExtractor createProgressiveMediaExtractor() {
                    return ProgressiveMediaSource.Factory.d(extractorsFactory);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmHttpDataSourceFactory(@Nullable HttpDataSource.Factory drmHttpDataSourceFactory) {
            if (!this.c) {
                ((DefaultDrmSessionManagerProvider) this.d).setDrmHttpDataSourceFactory(drmHttpDataSourceFactory);
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmSessionManager(@Nullable final DrmSessionManager drmSessionManager) {
            if (drmSessionManager == null) {
                setDrmSessionManagerProvider((DrmSessionManagerProvider) null);
            } else {
                setDrmSessionManagerProvider(new DrmSessionManagerProvider() { // from class: i46
                    @Override // com.google.android.exoplayer2.drm.DrmSessionManagerProvider
                    public final DrmSessionManager get(MediaItem mediaItem) {
                        return ProgressiveMediaSource.Factory.e(drmSessionManager, mediaItem);
                    }
                });
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmSessionManagerProvider(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
            if (drmSessionManagerProvider != null) {
                this.d = drmSessionManagerProvider;
                this.c = true;
            } else {
                this.d = new DefaultDrmSessionManagerProvider();
                this.c = false;
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmUserAgent(@Nullable String userAgent) {
            if (!this.c) {
                ((DefaultDrmSessionManagerProvider) this.d).setDrmUserAgent(userAgent);
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            }
            this.e = loadErrorHandlingPolicy;
            return this;
        }

        public Factory(DataSource.Factory dataSourceFactory, ProgressiveMediaExtractor.Factory progressiveMediaExtractorFactory) {
            this.a = dataSourceFactory;
            this.b = progressiveMediaExtractorFactory;
            this.d = new DefaultDrmSessionManagerProvider();
            this.e = new DefaultLoadErrorHandlingPolicy();
            this.f = 1048576;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public ProgressiveMediaSource createMediaSource(Uri uri) {
            return createMediaSource(new MediaItem.Builder().setUri(uri).build());
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public ProgressiveMediaSource createMediaSource(MediaItem mediaItem) {
            Assertions.checkNotNull(mediaItem.playbackProperties);
            MediaItem.PlaybackProperties playbackProperties = mediaItem.playbackProperties;
            boolean z = playbackProperties.tag == null && this.h != null;
            boolean z2 = playbackProperties.customCacheKey == null && this.g != null;
            if (z && z2) {
                mediaItem = mediaItem.buildUpon().setTag(this.h).setCustomCacheKey(this.g).build();
            } else if (z) {
                mediaItem = mediaItem.buildUpon().setTag(this.h).build();
            } else if (z2) {
                mediaItem = mediaItem.buildUpon().setCustomCacheKey(this.g).build();
            }
            MediaItem mediaItem2 = mediaItem;
            return new ProgressiveMediaSource(mediaItem2, this.a, this.b, this.d.get(mediaItem2), this.e, this.f, null);
        }
    }

    public class a extends ForwardingTimeline {
        public a(final ProgressiveMediaSource this$0, Timeline timeline) {
            super(timeline);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int periodIndex, Timeline.Period period, boolean setIds) {
            super.getPeriod(periodIndex, period, setIds);
            period.isPlaceholder = true;
            return period;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int windowIndex, Timeline.Window window, long defaultPositionProjectionUs) {
            super.getWindow(windowIndex, window, defaultPositionProjectionUs);
            window.isPlaceholder = true;
            return window;
        }
    }

    public /* synthetic */ ProgressiveMediaSource(MediaItem mediaItem, DataSource.Factory factory, ProgressiveMediaExtractor.Factory factory2, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i, a aVar) {
        this(mediaItem, factory, factory2, drmSessionManager, loadErrorHandlingPolicy, i);
    }

    private void a() {
        Timeline singlePeriodTimeline = new SinglePeriodTimeline(this.o, this.p, false, this.q, (Object) null, this.g);
        if (this.n) {
            singlePeriodTimeline = new a(this, singlePeriodTimeline);
        }
        refreshSourceInfo(singlePeriodTimeline);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
        DataSource dataSourceCreateDataSource = this.i.createDataSource();
        TransferListener transferListener = this.r;
        if (transferListener != null) {
            dataSourceCreateDataSource.addTransferListener(transferListener);
        }
        return new h(this.h.uri, dataSourceCreateDataSource, this.j.createProgressiveMediaExtractor(), this.k, createDrmEventDispatcher(id), this.l, createEventDispatcher(id), this, allocator, this.h.customCacheKey, this.m);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.g;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.h.b
    public void onSourceInfoRefreshed(long durationUs, boolean isSeekable, boolean isLive) {
        if (durationUs == C.TIME_UNSET) {
            durationUs = this.o;
        }
        if (!this.n && this.o == durationUs && this.p == isSeekable && this.q == isLive) {
            return;
        }
        this.o = durationUs;
        this.p = isSeekable;
        this.q = isLive;
        this.n = false;
        a();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
        this.r = mediaTransferListener;
        this.k.prepare();
        a();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((h) mediaPeriod).H();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.k.release();
    }

    private ProgressiveMediaSource(MediaItem mediaItem, DataSource.Factory dataSourceFactory, ProgressiveMediaExtractor.Factory progressiveMediaExtractorFactory, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadableLoadErrorHandlingPolicy, int continueLoadingCheckIntervalBytes) {
        this.h = (MediaItem.PlaybackProperties) Assertions.checkNotNull(mediaItem.playbackProperties);
        this.g = mediaItem;
        this.i = dataSourceFactory;
        this.j = progressiveMediaExtractorFactory;
        this.k = drmSessionManager;
        this.l = loadableLoadErrorHandlingPolicy;
        this.m = continueLoadingCheckIntervalBytes;
        this.n = true;
        this.o = C.TIME_UNSET;
    }
}
