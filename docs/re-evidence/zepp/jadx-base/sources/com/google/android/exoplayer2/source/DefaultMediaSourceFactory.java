package com.google.android.exoplayer2.source;

import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {
    private static final String l = "DefaultMediaSourceFactory";
    private final DataSource.Factory a;
    private final SparseArray<MediaSourceFactory> b;
    private final int[] c;

    @Nullable
    private AdsLoaderProvider d;

    @Nullable
    private AdViewProvider e;

    @Nullable
    private LoadErrorHandlingPolicy f;
    private long g;
    private long h;
    private long i;
    private float j;
    private float k;

    public interface AdsLoaderProvider {
        @Nullable
        AdsLoader getAdsLoader(MediaItem.AdsConfiguration adsConfiguration);
    }

    public DefaultMediaSourceFactory(Context context) {
        this(new DefaultDataSourceFactory(context));
    }

    private static SparseArray<MediaSourceFactory> a(DataSource.Factory dataSourceFactory, ExtractorsFactory extractorsFactory) {
        SparseArray<MediaSourceFactory> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (MediaSourceFactory) DashMediaSource.Factory.class.asSubclass(MediaSourceFactory.class).getConstructor(DataSource.Factory.class).newInstance(dataSourceFactory));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (MediaSourceFactory) SsMediaSource.Factory.class.asSubclass(MediaSourceFactory.class).getConstructor(DataSource.Factory.class).newInstance(dataSourceFactory));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (MediaSourceFactory) HlsMediaSource.Factory.class.asSubclass(MediaSourceFactory.class).getConstructor(DataSource.Factory.class).newInstance(dataSourceFactory));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (MediaSourceFactory) RtspMediaSource.Factory.class.asSubclass(MediaSourceFactory.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new ProgressiveMediaSource.Factory(dataSourceFactory, extractorsFactory));
        return sparseArray;
    }

    private static MediaSource b(MediaItem mediaItem, MediaSource mediaSource) {
        MediaItem.ClippingProperties clippingProperties = mediaItem.clippingProperties;
        long j = clippingProperties.startPositionMs;
        if (j == 0 && clippingProperties.endPositionMs == Long.MIN_VALUE && !clippingProperties.relativeToDefaultPosition) {
            return mediaSource;
        }
        long jMsToUs = C.msToUs(j);
        long jMsToUs2 = C.msToUs(mediaItem.clippingProperties.endPositionMs);
        MediaItem.ClippingProperties clippingProperties2 = mediaItem.clippingProperties;
        return new ClippingMediaSource(mediaSource, jMsToUs, jMsToUs2, !clippingProperties2.startsAtKeyFrame, clippingProperties2.relativeToLiveWindow, clippingProperties2.relativeToDefaultPosition);
    }

    private MediaSource c(MediaItem mediaItem, MediaSource mediaSource) {
        Assertions.checkNotNull(mediaItem.playbackProperties);
        MediaItem.AdsConfiguration adsConfiguration = mediaItem.playbackProperties.adsConfiguration;
        if (adsConfiguration == null) {
            return mediaSource;
        }
        AdsLoaderProvider adsLoaderProvider = this.d;
        AdViewProvider adViewProvider = this.e;
        if (adsLoaderProvider == null || adViewProvider == null) {
            Log.w(l, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return mediaSource;
        }
        AdsLoader adsLoader = adsLoaderProvider.getAdsLoader(adsConfiguration);
        if (adsLoader == null) {
            Log.w(l, "Playing media without ads, as no AdsLoader was provided.");
            return mediaSource;
        }
        DataSpec dataSpec = new DataSpec(adsConfiguration.adTagUri);
        Object obj = adsConfiguration.adsId;
        return new AdsMediaSource(mediaSource, dataSpec, obj != null ? obj : ImmutableList.of((Uri) mediaItem.mediaId, mediaItem.playbackProperties.uri, adsConfiguration.adTagUri), this, adsLoader, adViewProvider);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public /* synthetic */ MediaSource createMediaSource(Uri uri) {
        return c.a(this, uri);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public MediaSource createMediaSource(MediaItem mediaItem) {
        Assertions.checkNotNull(mediaItem.playbackProperties);
        MediaItem.PlaybackProperties playbackProperties = mediaItem.playbackProperties;
        int iInferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(playbackProperties.uri, playbackProperties.mimeType);
        MediaSourceFactory mediaSourceFactory = this.b.get(iInferContentTypeForUriAndMimeType);
        StringBuilder sb = new StringBuilder(68);
        sb.append("No suitable media source factory found for content type: ");
        sb.append(iInferContentTypeForUriAndMimeType);
        Assertions.checkNotNull(mediaSourceFactory, sb.toString());
        MediaItem.LiveConfiguration liveConfiguration = mediaItem.liveConfiguration;
        if ((liveConfiguration.targetOffsetMs == C.TIME_UNSET && this.g != C.TIME_UNSET) || ((liveConfiguration.minPlaybackSpeed == -3.4028235E38f && this.j != -3.4028235E38f) || ((liveConfiguration.maxPlaybackSpeed == -3.4028235E38f && this.k != -3.4028235E38f) || ((liveConfiguration.minOffsetMs == C.TIME_UNSET && this.h != C.TIME_UNSET) || (liveConfiguration.maxOffsetMs == C.TIME_UNSET && this.i != C.TIME_UNSET))))) {
            MediaItem.Builder builderBuildUpon = mediaItem.buildUpon();
            long j = mediaItem.liveConfiguration.targetOffsetMs;
            if (j == C.TIME_UNSET) {
                j = this.g;
            }
            MediaItem.Builder liveTargetOffsetMs = builderBuildUpon.setLiveTargetOffsetMs(j);
            float f = mediaItem.liveConfiguration.minPlaybackSpeed;
            if (f == -3.4028235E38f) {
                f = this.j;
            }
            MediaItem.Builder liveMinPlaybackSpeed = liveTargetOffsetMs.setLiveMinPlaybackSpeed(f);
            float f2 = mediaItem.liveConfiguration.maxPlaybackSpeed;
            if (f2 == -3.4028235E38f) {
                f2 = this.k;
            }
            MediaItem.Builder liveMaxPlaybackSpeed = liveMinPlaybackSpeed.setLiveMaxPlaybackSpeed(f2);
            long j2 = mediaItem.liveConfiguration.minOffsetMs;
            if (j2 == C.TIME_UNSET) {
                j2 = this.h;
            }
            MediaItem.Builder liveMinOffsetMs = liveMaxPlaybackSpeed.setLiveMinOffsetMs(j2);
            long j3 = mediaItem.liveConfiguration.maxOffsetMs;
            if (j3 == C.TIME_UNSET) {
                j3 = this.i;
            }
            mediaItem = liveMinOffsetMs.setLiveMaxOffsetMs(j3).build();
        }
        MediaSource mediaSourceCreateMediaSource = mediaSourceFactory.createMediaSource(mediaItem);
        List<MediaItem.Subtitle> list = ((MediaItem.PlaybackProperties) Util.castNonNull(mediaItem.playbackProperties)).subtitles;
        if (!list.isEmpty()) {
            MediaSource[] mediaSourceArr = new MediaSource[list.size() + 1];
            int i = 0;
            mediaSourceArr[0] = mediaSourceCreateMediaSource;
            SingleSampleMediaSource.Factory loadErrorHandlingPolicy = new SingleSampleMediaSource.Factory(this.a).setLoadErrorHandlingPolicy(this.f);
            while (i < list.size()) {
                int i2 = i + 1;
                mediaSourceArr[i2] = loadErrorHandlingPolicy.createMediaSource(list.get(i), C.TIME_UNSET);
                i = i2;
            }
            mediaSourceCreateMediaSource = new MergingMediaSource(mediaSourceArr);
        }
        return c(mediaItem, b(mediaItem, mediaSourceCreateMediaSource));
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public int[] getSupportedTypes() {
        int[] iArr = this.c;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public DefaultMediaSourceFactory setAdViewProvider(@Nullable AdViewProvider adViewProvider) {
        this.e = adViewProvider;
        return this;
    }

    public DefaultMediaSourceFactory setAdsLoaderProvider(@Nullable AdsLoaderProvider adsLoaderProvider) {
        this.d = adsLoaderProvider;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMaxOffsetMs(long liveMaxOffsetMs) {
        this.i = liveMaxOffsetMs;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMaxSpeed(float maxSpeed) {
        this.k = maxSpeed;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMinOffsetMs(long liveMinOffsetMs) {
        this.h = liveMinOffsetMs;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMinSpeed(float minSpeed) {
        this.j = minSpeed;
        return this;
    }

    public DefaultMediaSourceFactory setLiveTargetOffsetMs(long liveTargetOffsetMs) {
        this.g = liveTargetOffsetMs;
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    @Deprecated
    public /* bridge */ /* synthetic */ MediaSourceFactory setStreamKeys(@Nullable List streamKeys) {
        return setStreamKeys((List<StreamKey>) streamKeys);
    }

    public DefaultMediaSourceFactory(Context context, ExtractorsFactory extractorsFactory) {
        this(new DefaultDataSourceFactory(context), extractorsFactory);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public DefaultMediaSourceFactory setDrmHttpDataSourceFactory(@Nullable HttpDataSource.Factory drmHttpDataSourceFactory) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.valueAt(i).setDrmHttpDataSourceFactory(drmHttpDataSourceFactory);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public DefaultMediaSourceFactory setDrmSessionManager(@Nullable DrmSessionManager drmSessionManager) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.valueAt(i).setDrmSessionManager(drmSessionManager);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public DefaultMediaSourceFactory setDrmSessionManagerProvider(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.valueAt(i).setDrmSessionManagerProvider(drmSessionManagerProvider);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public DefaultMediaSourceFactory setDrmUserAgent(@Nullable String userAgent) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.valueAt(i).setDrmUserAgent(userAgent);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public DefaultMediaSourceFactory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.f = loadErrorHandlingPolicy;
        for (int i = 0; i < this.b.size(); i++) {
            this.b.valueAt(i).setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    @Deprecated
    public DefaultMediaSourceFactory setStreamKeys(@Nullable List<StreamKey> streamKeys) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.valueAt(i).setStreamKeys(streamKeys);
        }
        return this;
    }

    public DefaultMediaSourceFactory(DataSource.Factory dataSourceFactory) {
        this(dataSourceFactory, new DefaultExtractorsFactory());
    }

    public DefaultMediaSourceFactory(DataSource.Factory dataSourceFactory, ExtractorsFactory extractorsFactory) {
        this.a = dataSourceFactory;
        SparseArray<MediaSourceFactory> sparseArrayA = a(dataSourceFactory, extractorsFactory);
        this.b = sparseArrayA;
        this.c = new int[sparseArrayA.size()];
        for (int i = 0; i < this.b.size(); i++) {
            this.c[i] = this.b.keyAt(i);
        }
        this.g = C.TIME_UNSET;
        this.h = C.TIME_UNSET;
        this.i = C.TIME_UNSET;
        this.j = -3.4028235E38f;
        this.k = -3.4028235E38f;
    }
}
