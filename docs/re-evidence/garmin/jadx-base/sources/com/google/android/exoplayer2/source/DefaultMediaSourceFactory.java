package com.google.android.exoplayer2.source;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.text.SubtitleDecoderFactory;
import com.google.android.exoplayer2.text.SubtitleExtractor;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import yc.l2;

/* JADX INFO: loaded from: classes14.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {
    private static final String TAG = "DMediaSourceFactory";
    private AdViewProvider adViewProvider;
    private AdsLoader.Provider adsLoaderProvider;
    private final DataSource.Factory dataSourceFactory;
    private final DelegateFactoryLoader delegateFactoryLoader;
    private long liveMaxOffsetMs;
    private float liveMaxSpeed;
    private long liveMinOffsetMs;
    private float liveMinSpeed;
    private long liveTargetOffsetMs;
    private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private MediaSource.Factory serverSideAdInsertionMediaSourceFactory;
    private boolean useProgressiveMediaSourceForSubtitles;

    @Deprecated
    public interface AdsLoaderProvider extends AdsLoader.Provider {
    }

    public static final class DelegateFactoryLoader {
        private final DataSource.Factory dataSourceFactory;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private final ExtractorsFactory extractorsFactory;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private final Map<Integer, Supplier<MediaSource.Factory>> mediaSourceFactorySuppliers = new HashMap();
        private final Set<Integer> supportedTypes = new HashSet();
        private final Map<Integer, MediaSource.Factory> mediaSourceFactories = new HashMap();

        public DelegateFactoryLoader(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
            this.dataSourceFactory = factory;
            this.extractorsFactory = extractorsFactory;
        }

        private void ensureAllSuppliersAreLoaded() {
            maybeLoadSupplier(0);
            maybeLoadSupplier(1);
            maybeLoadSupplier(2);
            maybeLoadSupplier(3);
            maybeLoadSupplier(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ MediaSource.Factory lambda$maybeLoadSupplier$0(Class cls) {
            return DefaultMediaSourceFactory.newInstance(cls, this.dataSourceFactory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ MediaSource.Factory lambda$maybeLoadSupplier$1(Class cls) {
            return DefaultMediaSourceFactory.newInstance(cls, this.dataSourceFactory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ MediaSource.Factory lambda$maybeLoadSupplier$2(Class cls) {
            return DefaultMediaSourceFactory.newInstance(cls, this.dataSourceFactory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ MediaSource.Factory lambda$maybeLoadSupplier$4() {
            return new ProgressiveMediaSource.Factory(this.dataSourceFactory, this.extractorsFactory);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0080  */
        private Supplier<MediaSource.Factory> maybeLoadSupplier(int i14) {
            Supplier<MediaSource.Factory> supplier;
            Supplier<MediaSource.Factory> supplier2;
            if (this.mediaSourceFactorySuppliers.containsKey(Integer.valueOf(i14))) {
                return this.mediaSourceFactorySuppliers.get(Integer.valueOf(i14));
            }
            final int i15 = 0;
            Supplier<MediaSource.Factory> supplier3 = null;
            try {
                if (i14 != 0) {
                    final int i16 = 1;
                    if (i14 != 1) {
                        final int i17 = 2;
                        if (i14 == 2) {
                            final Class<? extends U> clsAsSubclass = Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                            supplier2 = new Supplier(this) { // from class: com.google.android.exoplayer2.source.d

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ DefaultMediaSourceFactory.DelegateFactoryLoader f53072b;

                                {
                                    this.f53072b = this;
                                }

                                @Override // com.google.common.base.Supplier
                                public final Object get() {
                                    switch (i17) {
                                        case 0:
                                            return this.f53072b.lambda$maybeLoadSupplier$0(clsAsSubclass);
                                        case 1:
                                            return this.f53072b.lambda$maybeLoadSupplier$1(clsAsSubclass);
                                        default:
                                            return this.f53072b.lambda$maybeLoadSupplier$2(clsAsSubclass);
                                    }
                                }
                            };
                        } else if (i14 == 3) {
                            final GenericDeclaration genericDeclarationAsSubclass = Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                            supplier = new Supplier() { // from class: com.google.android.exoplayer2.source.e
                                @Override // com.google.common.base.Supplier
                                public final Object get() {
                                    switch (i15) {
                                        case 0:
                                            return DefaultMediaSourceFactory.access$000((Class) genericDeclarationAsSubclass);
                                        default:
                                            return ((DefaultMediaSourceFactory.DelegateFactoryLoader) genericDeclarationAsSubclass).lambda$maybeLoadSupplier$4();
                                    }
                                }
                            };
                        } else if (i14 == 4) {
                            supplier3 = new Supplier() { // from class: com.google.android.exoplayer2.source.e
                                @Override // com.google.common.base.Supplier
                                public final Object get() {
                                    switch (i16) {
                                        case 0:
                                            return DefaultMediaSourceFactory.access$000((Class) this);
                                        default:
                                            return ((DefaultMediaSourceFactory.DelegateFactoryLoader) this).lambda$maybeLoadSupplier$4();
                                    }
                                }
                            };
                        }
                        this.mediaSourceFactorySuppliers.put(Integer.valueOf(i14), supplier3);
                        if (supplier3 != null) {
                            this.supportedTypes.add(Integer.valueOf(i14));
                        }
                        return supplier3;
                    }
                    final Class<? extends U> clsAsSubclass2 = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                    supplier2 = new Supplier(this) { // from class: com.google.android.exoplayer2.source.d

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ DefaultMediaSourceFactory.DelegateFactoryLoader f53072b;

                        {
                            this.f53072b = this;
                        }

                        @Override // com.google.common.base.Supplier
                        public final Object get() {
                            switch (i16) {
                                case 0:
                                    return this.f53072b.lambda$maybeLoadSupplier$0(clsAsSubclass2);
                                case 1:
                                    return this.f53072b.lambda$maybeLoadSupplier$1(clsAsSubclass2);
                                default:
                                    return this.f53072b.lambda$maybeLoadSupplier$2(clsAsSubclass2);
                            }
                        }
                    };
                    supplier3 = supplier2;
                    this.mediaSourceFactorySuppliers.put(Integer.valueOf(i14), supplier3);
                    if (supplier3 != null) {
                        this.supportedTypes.add(Integer.valueOf(i14));
                    }
                    return supplier3;
                }
                final Class<? extends U> clsAsSubclass3 = Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                supplier = new Supplier(this) { // from class: com.google.android.exoplayer2.source.d

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ DefaultMediaSourceFactory.DelegateFactoryLoader f53072b;

                    {
                        this.f53072b = this;
                    }

                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        switch (i15) {
                            case 0:
                                return this.f53072b.lambda$maybeLoadSupplier$0(clsAsSubclass3);
                            case 1:
                                return this.f53072b.lambda$maybeLoadSupplier$1(clsAsSubclass3);
                            default:
                                return this.f53072b.lambda$maybeLoadSupplier$2(clsAsSubclass3);
                        }
                    }
                };
                supplier3 = supplier;
            } catch (ClassNotFoundException unused) {
            }
            this.mediaSourceFactorySuppliers.put(Integer.valueOf(i14), supplier3);
            if (supplier3 != null) {
                this.supportedTypes.add(Integer.valueOf(i14));
            }
            return supplier3;
        }

        public MediaSource.Factory getMediaSourceFactory(int i14) {
            MediaSource.Factory factory = this.mediaSourceFactories.get(Integer.valueOf(i14));
            if (factory != null) {
                return factory;
            }
            Supplier<MediaSource.Factory> supplierMaybeLoadSupplier = maybeLoadSupplier(i14);
            if (supplierMaybeLoadSupplier == null) {
                return null;
            }
            MediaSource.Factory factory2 = supplierMaybeLoadSupplier.get();
            DrmSessionManagerProvider drmSessionManagerProvider = this.drmSessionManagerProvider;
            if (drmSessionManagerProvider != null) {
                factory2.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
            if (loadErrorHandlingPolicy != null) {
                factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
            this.mediaSourceFactories.put(Integer.valueOf(i14), factory2);
            return factory2;
        }

        public int[] getSupportedTypes() {
            ensureAllSuppliersAreLoaded();
            return Ints.toArray(this.supportedTypes);
        }

        public void setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
        }

        public void setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
        }
    }

    public static final class UnknownSubtitlesExtractor implements Extractor {
        private final Format format;

        public UnknownSubtitlesExtractor(Format format) {
            this.format = format;
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public void init(ExtractorOutput extractorOutput) {
            TrackOutput trackOutputTrack = extractorOutput.track(0, 3);
            extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
            extractorOutput.endTracks();
            trackOutputTrack.format(this.format.buildUpon().setSampleMimeType(MimeTypes.TEXT_UNKNOWN).setCodecs(this.format.sampleMimeType).build());
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
            return extractorInput.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public void release() {
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public void seek(long j8, long j14) {
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public boolean sniff(ExtractorInput extractorInput) {
            return true;
        }
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
        this.dataSourceFactory = factory;
        this.delegateFactoryLoader = new DelegateFactoryLoader(factory, extractorsFactory);
        this.liveTargetOffsetMs = C.TIME_UNSET;
        this.liveMinOffsetMs = C.TIME_UNSET;
        this.liveMaxOffsetMs = C.TIME_UNSET;
        this.liveMinSpeed = -3.4028235E38f;
        this.liveMaxSpeed = -3.4028235E38f;
    }

    public static /* synthetic */ MediaSource.Factory access$000(Class cls) {
        return newInstance(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$createMediaSource$0(Format format) {
        SubtitleDecoderFactory subtitleDecoderFactory = SubtitleDecoderFactory.DEFAULT;
        return new Extractor[]{subtitleDecoderFactory.supportsFormat(format) ? new SubtitleExtractor(subtitleDecoderFactory.createDecoder(format), format) : new UnknownSubtitlesExtractor(format)};
    }

    private static MediaSource maybeClipMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
        MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
        long j8 = clippingConfiguration.startPositionMs;
        if (j8 == 0 && clippingConfiguration.endPositionMs == Long.MIN_VALUE && !clippingConfiguration.relativeToDefaultPosition) {
            return mediaSource;
        }
        long jMsToUs = Util.msToUs(j8);
        long jMsToUs2 = Util.msToUs(mediaItem.clippingConfiguration.endPositionMs);
        MediaItem.ClippingConfiguration clippingConfiguration2 = mediaItem.clippingConfiguration;
        return new ClippingMediaSource(mediaSource, jMsToUs, jMsToUs2, !clippingConfiguration2.startsAtKeyFrame, clippingConfiguration2.relativeToLiveWindow, clippingConfiguration2.relativeToDefaultPosition);
    }

    private MediaSource maybeWrapWithAdsMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        MediaItem.AdsConfiguration adsConfiguration = mediaItem.localConfiguration.adsConfiguration;
        if (adsConfiguration == null) {
            return mediaSource;
        }
        AdsLoader.Provider provider = this.adsLoaderProvider;
        AdViewProvider adViewProvider = this.adViewProvider;
        if (provider == null || adViewProvider == null) {
            Log.w(TAG, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return mediaSource;
        }
        AdsLoader adsLoader = provider.getAdsLoader(adsConfiguration);
        if (adsLoader == null) {
            Log.w(TAG, "Playing media without ads, as no AdsLoader was provided.");
            return mediaSource;
        }
        DataSpec dataSpec = new DataSpec(adsConfiguration.adTagUri);
        Object objOf = adsConfiguration.adsId;
        if (objOf == null) {
            objOf = ImmutableList.of((Uri) mediaItem.mediaId, mediaItem.localConfiguration.uri, adsConfiguration.adTagUri);
        }
        return new AdsMediaSource(mediaSource, dataSpec, objOf, this, adsLoader, adViewProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls, DataSource.Factory factory) {
        try {
            return cls.getConstructor(DataSource.Factory.class).newInstance(factory);
        } catch (Exception e4) {
            l2.p(e4);
            return null;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public MediaSource createMediaSource(MediaItem mediaItem) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        String scheme = mediaItem.localConfiguration.uri.getScheme();
        if (scheme != null && scheme.equals(C.SSAI_SCHEME)) {
            return ((MediaSource.Factory) Assertions.checkNotNull(this.serverSideAdInsertionMediaSourceFactory)).createMediaSource(mediaItem);
        }
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        int iInferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType);
        MediaSource.Factory mediaSourceFactory = this.delegateFactoryLoader.getMediaSourceFactory(iInferContentTypeForUriAndMimeType);
        StringBuilder sb3 = new StringBuilder(68);
        sb3.append("No suitable media source factory found for content type: ");
        sb3.append(iInferContentTypeForUriAndMimeType);
        Assertions.checkStateNotNull(mediaSourceFactory, sb3.toString());
        MediaItem.LiveConfiguration.Builder builderBuildUpon = mediaItem.liveConfiguration.buildUpon();
        if (mediaItem.liveConfiguration.targetOffsetMs == C.TIME_UNSET) {
            builderBuildUpon.setTargetOffsetMs(this.liveTargetOffsetMs);
        }
        if (mediaItem.liveConfiguration.minPlaybackSpeed == -3.4028235E38f) {
            builderBuildUpon.setMinPlaybackSpeed(this.liveMinSpeed);
        }
        if (mediaItem.liveConfiguration.maxPlaybackSpeed == -3.4028235E38f) {
            builderBuildUpon.setMaxPlaybackSpeed(this.liveMaxSpeed);
        }
        if (mediaItem.liveConfiguration.minOffsetMs == C.TIME_UNSET) {
            builderBuildUpon.setMinOffsetMs(this.liveMinOffsetMs);
        }
        if (mediaItem.liveConfiguration.maxOffsetMs == C.TIME_UNSET) {
            builderBuildUpon.setMaxOffsetMs(this.liveMaxOffsetMs);
        }
        MediaItem.LiveConfiguration liveConfigurationBuild = builderBuildUpon.build();
        if (!liveConfigurationBuild.equals(mediaItem.liveConfiguration)) {
            mediaItem = mediaItem.buildUpon().setLiveConfiguration(liveConfigurationBuild).build();
        }
        MediaSource mediaSourceCreateMediaSource = mediaSourceFactory.createMediaSource(mediaItem);
        ImmutableList<MediaItem.SubtitleConfiguration> immutableList = ((MediaItem.LocalConfiguration) Util.castNonNull(mediaItem.localConfiguration)).subtitleConfigurations;
        if (!immutableList.isEmpty()) {
            MediaSource[] mediaSourceArr = new MediaSource[immutableList.size() + 1];
            mediaSourceArr[0] = mediaSourceCreateMediaSource;
            for (int i14 = 0; i14 < immutableList.size(); i14++) {
                if (this.useProgressiveMediaSourceForSubtitles) {
                    final Format formatBuild = new Format.Builder().setSampleMimeType(immutableList.get(i14).mimeType).setLanguage(immutableList.get(i14).language).setSelectionFlags(immutableList.get(i14).selectionFlags).setRoleFlags(immutableList.get(i14).roleFlags).setLabel(immutableList.get(i14).label).setId(immutableList.get(i14).f52875id).build();
                    mediaSourceArr[i14 + 1] = new ProgressiveMediaSource.Factory(this.dataSourceFactory, new ExtractorsFactory() { // from class: com.google.android.exoplayer2.source.c
                        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
                        public final Extractor[] createExtractors() {
                            return DefaultMediaSourceFactory.lambda$createMediaSource$0(formatBuild);
                        }
                    }).setLoadErrorHandlingPolicy(this.loadErrorHandlingPolicy).createMediaSource(MediaItem.fromUri(immutableList.get(i14).uri.toString()));
                } else {
                    mediaSourceArr[i14 + 1] = new SingleSampleMediaSource.Factory(this.dataSourceFactory).setLoadErrorHandlingPolicy(this.loadErrorHandlingPolicy).createMediaSource(immutableList.get(i14), C.TIME_UNSET);
                }
            }
            mediaSourceCreateMediaSource = new MergingMediaSource(mediaSourceArr);
        }
        return maybeWrapWithAdsMediaSource(mediaItem, maybeClipMediaSource(mediaItem, mediaSourceCreateMediaSource));
    }

    public DefaultMediaSourceFactory experimentalUseProgressiveMediaSourceForSubtitles(boolean z14) {
        this.useProgressiveMediaSourceForSubtitles = z14;
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public int[] getSupportedTypes() {
        return this.delegateFactoryLoader.getSupportedTypes();
    }

    public DefaultMediaSourceFactory setAdViewProvider(AdViewProvider adViewProvider) {
        this.adViewProvider = adViewProvider;
        return this;
    }

    public DefaultMediaSourceFactory setAdsLoaderProvider(AdsLoader.Provider provider) {
        this.adsLoaderProvider = provider;
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public DefaultMediaSourceFactory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        this.delegateFactoryLoader.setDrmSessionManagerProvider(drmSessionManagerProvider);
        return this;
    }

    public DefaultMediaSourceFactory setLiveMaxOffsetMs(long j8) {
        this.liveMaxOffsetMs = j8;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMaxSpeed(float f14) {
        this.liveMaxSpeed = f14;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMinOffsetMs(long j8) {
        this.liveMinOffsetMs = j8;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMinSpeed(float f14) {
        this.liveMinSpeed = f14;
        return this;
    }

    public DefaultMediaSourceFactory setLiveTargetOffsetMs(long j8) {
        this.liveTargetOffsetMs = j8;
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public DefaultMediaSourceFactory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.delegateFactoryLoader.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
        return this;
    }

    public DefaultMediaSourceFactory setServerSideAdInsertionMediaSourceFactory(MediaSource.Factory factory) {
        this.serverSideAdInsertionMediaSourceFactory = factory;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e4) {
            l2.p(e4);
            return null;
        }
    }

    public DefaultMediaSourceFactory(Context context, ExtractorsFactory extractorsFactory) {
        this(new DefaultDataSource.Factory(context), extractorsFactory);
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory) {
        this(factory, new DefaultExtractorsFactory());
    }

    public DefaultMediaSourceFactory(Context context) {
        this(new DefaultDataSource.Factory(context));
    }
}
