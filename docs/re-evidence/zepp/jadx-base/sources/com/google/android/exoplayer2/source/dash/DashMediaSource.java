package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.Timeline;
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
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.source.dash.manifest.ServiceDescriptionElement;
import com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement;
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
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.SntpClient;
import com.google.android.exoplayer2.util.Util;
import com.google.android.material.datepicker.UtcDates;
import com.google.common.base.Charsets;
import com.google.common.math.LongMath;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class DashMediaSource extends BaseMediaSource {
    public static final long DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS = 30000;

    @Deprecated
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_MS = 30000;
    public static final String DEFAULT_MEDIA_ID = "DashMediaSource";
    private static final long O = 5000;
    private static final long P = 5000000;
    private static final String Q = "DashMediaSource";

    @Nullable
    private TransferListener A;
    private IOException B;
    private Handler C;
    private MediaItem.LiveConfiguration D;
    private Uri E;
    private Uri F;
    private DashManifest G;
    private boolean H;
    private long I;
    private long J;
    private long K;
    private int L;
    private long M;
    private int N;
    private final MediaItem g;
    private final boolean h;
    private final DataSource.Factory i;
    private final DashChunkSource.Factory j;
    private final CompositeSequenceableLoaderFactory k;
    private final DrmSessionManager l;
    private final LoadErrorHandlingPolicy m;
    private final BaseUrlExclusionList n;
    private final long o;
    private final MediaSourceEventListener.EventDispatcher p;
    private final ParsingLoadable.Parser<? extends DashManifest> q;
    private final e r;
    private final Object s;
    private final SparseArray<DashMediaPeriod> t;
    private final Runnable u;
    private final Runnable v;
    private final PlayerEmsgHandler.PlayerEmsgCallback w;
    private final LoaderErrorThrower x;
    private DataSource y;
    private Loader z;

    public static final class Factory implements MediaSourceFactory {
        private final DashChunkSource.Factory a;

        @Nullable
        private final DataSource.Factory b;
        private boolean c;
        private DrmSessionManagerProvider d;
        private CompositeSequenceableLoaderFactory e;
        private LoadErrorHandlingPolicy f;
        private long g;
        private long h;

        @Nullable
        private ParsingLoadable.Parser<? extends DashManifest> i;
        private List<StreamKey> j;

        @Nullable
        private Object k;

        public Factory(DataSource.Factory dataSourceFactory) {
            this(new DefaultDashChunkSource.Factory(dataSourceFactory), dataSourceFactory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ DrmSessionManager b(DrmSessionManager drmSessionManager, MediaItem mediaItem) {
            return drmSessionManager;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public int[] getSupportedTypes() {
            return new int[]{0};
        }

        public Factory setCompositeSequenceableLoaderFactory(@Nullable CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory) {
            if (compositeSequenceableLoaderFactory == null) {
                compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
            }
            this.e = compositeSequenceableLoaderFactory;
            return this;
        }

        public Factory setFallbackTargetLiveOffsetMs(long fallbackTargetLiveOffsetMs) {
            this.h = fallbackTargetLiveOffsetMs;
            return this;
        }

        @Deprecated
        public Factory setLivePresentationDelayMs(long livePresentationDelayMs, boolean overridesManifest) {
            this.g = overridesManifest ? livePresentationDelayMs : C.TIME_UNSET;
            if (!overridesManifest) {
                setFallbackTargetLiveOffsetMs(livePresentationDelayMs);
            }
            return this;
        }

        public Factory setManifestParser(@Nullable ParsingLoadable.Parser<? extends DashManifest> manifestParser) {
            this.i = manifestParser;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public /* bridge */ /* synthetic */ MediaSourceFactory setStreamKeys(@Nullable List streamKeys) {
            return setStreamKeys((List<StreamKey>) streamKeys);
        }

        @Deprecated
        public Factory setTag(@Nullable Object tag) {
            this.k = tag;
            return this;
        }

        public Factory(DashChunkSource.Factory chunkSourceFactory, @Nullable DataSource.Factory manifestDataSourceFactory) {
            this.a = (DashChunkSource.Factory) Assertions.checkNotNull(chunkSourceFactory);
            this.b = manifestDataSourceFactory;
            this.d = new DefaultDrmSessionManagerProvider();
            this.f = new DefaultLoadErrorHandlingPolicy();
            this.g = C.TIME_UNSET;
            this.h = 30000L;
            this.e = new DefaultCompositeSequenceableLoaderFactory();
            this.j = Collections.emptyList();
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
                setDrmSessionManagerProvider(new DrmSessionManagerProvider() { // from class: q21
                    @Override // com.google.android.exoplayer2.drm.DrmSessionManagerProvider
                    public final DrmSessionManager get(MediaItem mediaItem) {
                        return DashMediaSource.Factory.b(drmSessionManager, mediaItem);
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
            this.f = loadErrorHandlingPolicy;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public Factory setStreamKeys(@Nullable List<StreamKey> streamKeys) {
            if (streamKeys == null) {
                streamKeys = Collections.emptyList();
            }
            this.j = streamKeys;
            return this;
        }

        public DashMediaSource createMediaSource(DashManifest manifest) {
            return createMediaSource(manifest, new MediaItem.Builder().setUri(Uri.EMPTY).setMediaId("DashMediaSource").setMimeType(MimeTypes.APPLICATION_MPD).setStreamKeys(this.j).setTag(this.k).build());
        }

        public DashMediaSource createMediaSource(DashManifest manifest, MediaItem mediaItem) {
            List<StreamKey> list;
            long j;
            DashManifest dashManifestCopy = manifest;
            Assertions.checkArgument(!dashManifestCopy.dynamic);
            MediaItem.PlaybackProperties playbackProperties = mediaItem.playbackProperties;
            if (playbackProperties != null && !playbackProperties.streamKeys.isEmpty()) {
                list = mediaItem.playbackProperties.streamKeys;
            } else {
                list = this.j;
            }
            if (!list.isEmpty()) {
                dashManifestCopy = dashManifestCopy.copy(list);
            }
            DashManifest dashManifest = dashManifestCopy;
            MediaItem.PlaybackProperties playbackProperties2 = mediaItem.playbackProperties;
            boolean z = playbackProperties2 != null;
            boolean z2 = z && playbackProperties2.tag != null;
            boolean z3 = mediaItem.liveConfiguration.targetOffsetMs != C.TIME_UNSET;
            MediaItem.Builder tag = mediaItem.buildUpon().setMimeType(MimeTypes.APPLICATION_MPD).setUri(z ? mediaItem.playbackProperties.uri : Uri.EMPTY).setTag(z2 ? mediaItem.playbackProperties.tag : this.k);
            if (z3) {
                j = mediaItem.liveConfiguration.targetOffsetMs;
            } else {
                j = this.g;
            }
            MediaItem mediaItemBuild = tag.setLiveTargetOffsetMs(j).setStreamKeys(list).build();
            return new DashMediaSource(mediaItemBuild, dashManifest, null, null, this.a, this.e, this.d.get(mediaItemBuild), this.f, this.h, null);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public DashMediaSource createMediaSource(Uri uri) {
            return createMediaSource(new MediaItem.Builder().setUri(uri).setMimeType(MimeTypes.APPLICATION_MPD).setTag(this.k).build());
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public DashMediaSource createMediaSource(MediaItem mediaItem) {
            List<StreamKey> list;
            MediaItem mediaItemBuild = mediaItem;
            Assertions.checkNotNull(mediaItemBuild.playbackProperties);
            ParsingLoadable.Parser dashManifestParser = this.i;
            if (dashManifestParser == null) {
                dashManifestParser = new DashManifestParser();
            }
            if (mediaItemBuild.playbackProperties.streamKeys.isEmpty()) {
                list = this.j;
            } else {
                list = mediaItemBuild.playbackProperties.streamKeys;
            }
            ParsingLoadable.Parser filteringManifestParser = !list.isEmpty() ? new FilteringManifestParser(dashManifestParser, list) : dashManifestParser;
            MediaItem.PlaybackProperties playbackProperties = mediaItemBuild.playbackProperties;
            boolean z = playbackProperties.tag == null && this.k != null;
            boolean z2 = playbackProperties.streamKeys.isEmpty() && !list.isEmpty();
            boolean z3 = mediaItemBuild.liveConfiguration.targetOffsetMs == C.TIME_UNSET && this.g != C.TIME_UNSET;
            if (z || z2 || z3) {
                MediaItem.Builder builderBuildUpon = mediaItem.buildUpon();
                if (z) {
                    builderBuildUpon.setTag(this.k);
                }
                if (z2) {
                    builderBuildUpon.setStreamKeys(list);
                }
                if (z3) {
                    builderBuildUpon.setLiveTargetOffsetMs(this.g);
                }
                mediaItemBuild = builderBuildUpon.build();
            }
            MediaItem mediaItem2 = mediaItemBuild;
            return new DashMediaSource(mediaItem2, null, this.b, filteringManifestParser, this.a, this.e, this.d.get(mediaItem2), this.f, this.h, null);
        }
    }

    public class a implements SntpClient.InitializationCallback {
        public a() {
        }

        @Override // com.google.android.exoplayer2.util.SntpClient.InitializationCallback
        public void onInitializationFailed(IOException error) {
            DashMediaSource.this.v(error);
        }

        @Override // com.google.android.exoplayer2.util.SntpClient.InitializationCallback
        public void onInitialized() {
            DashMediaSource.this.w(SntpClient.getElapsedRealtimeOffsetMs());
        }
    }

    public static final class b extends Timeline {
        private final long d;
        private final long e;
        private final long f;
        private final int g;
        private final long h;
        private final long i;
        private final long j;
        private final DashManifest k;
        private final MediaItem l;

        @Nullable
        private final MediaItem.LiveConfiguration m;

        public b(long presentationStartTimeMs, long windowStartTimeMs, long elapsedRealtimeEpochOffsetMs, int firstPeriodId, long offsetInFirstPeriodUs, long windowDurationUs, long windowDefaultStartPositionUs, DashManifest manifest, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
            Assertions.checkState(manifest.dynamic == (liveConfiguration != null));
            this.d = presentationStartTimeMs;
            this.e = windowStartTimeMs;
            this.f = elapsedRealtimeEpochOffsetMs;
            this.g = firstPeriodId;
            this.h = offsetInFirstPeriodUs;
            this.i = windowDurationUs;
            this.j = windowDefaultStartPositionUs;
            this.k = manifest;
            this.l = mediaItem;
            this.m = liveConfiguration;
        }

        private long f(long defaultPositionProjectionUs) {
            DashSegmentIndex index;
            long j = this.j;
            if (!g(this.k)) {
                return j;
            }
            if (defaultPositionProjectionUs > 0) {
                j += defaultPositionProjectionUs;
                if (j > this.i) {
                    return C.TIME_UNSET;
                }
            }
            long j2 = this.h + j;
            long periodDurationUs = this.k.getPeriodDurationUs(0);
            int i = 0;
            while (i < this.k.getPeriodCount() - 1 && j2 >= periodDurationUs) {
                j2 -= periodDurationUs;
                i++;
                periodDurationUs = this.k.getPeriodDurationUs(i);
            }
            Period period = this.k.getPeriod(i);
            int adaptationSetIndex = period.getAdaptationSetIndex(2);
            return (adaptationSetIndex == -1 || (index = period.adaptationSets.get(adaptationSetIndex).representations.get(0).getIndex()) == null || index.getSegmentCount(periodDurationUs) == 0) ? j : (j + index.getTimeUs(index.getSegmentNum(j2, periodDurationUs))) - j2;
        }

        private static boolean g(DashManifest manifest) {
            return manifest.dynamic && manifest.minUpdatePeriodMs != C.TIME_UNSET && manifest.durationMs == C.TIME_UNSET;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object uid) {
            int iIntValue;
            if ((uid instanceof Integer) && (iIntValue = ((Integer) uid).intValue() - this.g) >= 0 && iIntValue < getPeriodCount()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int periodIndex, Timeline.Period period, boolean setIds) {
            Assertions.checkIndex(periodIndex, 0, getPeriodCount());
            return period.set(setIds ? this.k.getPeriod(periodIndex).id : null, setIds ? Integer.valueOf(this.g + periodIndex) : null, 0, this.k.getPeriodDurationUs(periodIndex), C.msToUs(this.k.getPeriod(periodIndex).startMs - this.k.getPeriod(0).startMs) - this.h);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return this.k.getPeriodCount();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int periodIndex) {
            Assertions.checkIndex(periodIndex, 0, getPeriodCount());
            return Integer.valueOf(this.g + periodIndex);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int windowIndex, Timeline.Window window, long defaultPositionProjectionUs) {
            Assertions.checkIndex(windowIndex, 0, 1);
            long jF = f(defaultPositionProjectionUs);
            Object obj = Timeline.Window.SINGLE_WINDOW_UID;
            MediaItem mediaItem = this.l;
            DashManifest dashManifest = this.k;
            return window.set(obj, mediaItem, dashManifest, this.d, this.e, this.f, true, g(dashManifest), this.m, jF, this.i, 0, getPeriodCount() - 1, this.h);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return 1;
        }
    }

    public final class c implements PlayerEmsgHandler.PlayerEmsgCallback {
        private c() {
        }

        @Override // com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestPublishTimeExpired(long expiredManifestPublishTimeUs) {
            DashMediaSource.this.o(expiredManifestPublishTimeUs);
        }

        @Override // com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestRefreshRequested() {
            DashMediaSource.this.p();
        }

        public /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    public static final class d implements ParsingLoadable.Parser<Long> {
        private static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8)).readLine();
            try {
                Matcher matcher = a.matcher(line);
                if (!matcher.matches()) {
                    String strValueOf = String.valueOf(line);
                    throw ParserException.createForMalformedManifest(strValueOf.length() != 0 ? "Couldn't parse timestamp: ".concat(strValueOf) : new String("Couldn't parse timestamp: "), null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j2 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j * ((((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw ParserException.createForMalformedManifest(null, e);
            }
        }
    }

    public final class e implements Loader.Callback<ParsingLoadable<DashManifest>> {
        private e() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onLoadCanceled(ParsingLoadable<DashManifest> loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
            DashMediaSource.this.q(loadable, elapsedRealtimeMs, loadDurationMs);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onLoadCompleted(ParsingLoadable<DashManifest> loadable, long elapsedRealtimeMs, long loadDurationMs) {
            DashMediaSource.this.r(loadable, elapsedRealtimeMs, loadDurationMs);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<DashManifest> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
            return DashMediaSource.this.s(loadable, elapsedRealtimeMs, loadDurationMs, error, errorCount);
        }

        public /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    public final class g implements Loader.Callback<ParsingLoadable<Long>> {
        private g() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onLoadCanceled(ParsingLoadable<Long> loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
            DashMediaSource.this.q(loadable, elapsedRealtimeMs, loadDurationMs);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onLoadCompleted(ParsingLoadable<Long> loadable, long elapsedRealtimeMs, long loadDurationMs) {
            DashMediaSource.this.t(loadable, elapsedRealtimeMs, loadDurationMs);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<Long> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
            return DashMediaSource.this.u(loadable, elapsedRealtimeMs, loadDurationMs, error);
        }

        public /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    public static final class h implements ParsingLoadable.Parser<Long> {
        private h() {
        }

        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(Util.parseXsDateTime(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.dash");
    }

    public /* synthetic */ DashMediaSource(MediaItem mediaItem, DashManifest dashManifest, DataSource.Factory factory, ParsingLoadable.Parser parser, DashChunkSource.Factory factory2, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j, a aVar) {
        this(mediaItem, dashManifest, factory, parser, factory2, compositeSequenceableLoaderFactory, drmSessionManager, loadErrorHandlingPolicy, j);
    }

    private void A(UtcTimingElement timingElement, ParsingLoadable.Parser<Long> parser) {
        C(new ParsingLoadable(this.y, Uri.parse(timingElement.value), 5, parser), new g(this, null), 1);
    }

    private void B(long delayUntilNextLoadMs) {
        this.C.postDelayed(this.u, delayUntilNextLoadMs);
    }

    private <T> void C(ParsingLoadable<T> loadable, Loader.Callback<ParsingLoadable<T>> callback, int minRetryCount) {
        this.p.loadStarted(new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, this.z.startLoading(loadable, callback, minRetryCount)), loadable.type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        Uri uri;
        this.C.removeCallbacks(this.u);
        if (this.z.hasFatalError()) {
            return;
        }
        if (this.z.isLoading()) {
            this.H = true;
            return;
        }
        synchronized (this.s) {
            uri = this.E;
        }
        this.H = false;
        C(new ParsingLoadable(this.y, uri, 4, this.q), this.r, this.m.getMinimumLoadableRetryCount(4));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    private void E(long nowInWindowUs, long windowDurationUs) {
        long j;
        float f2;
        long jUsToMs = this.g.liveConfiguration.maxOffsetMs;
        if (jUsToMs == C.TIME_UNSET) {
            ServiceDescriptionElement serviceDescriptionElement = this.G.serviceDescription;
            if (serviceDescriptionElement != null) {
                jUsToMs = serviceDescriptionElement.maxOffsetMs;
                if (jUsToMs == C.TIME_UNSET) {
                    jUsToMs = C.usToMs(nowInWindowUs);
                }
            } else {
                jUsToMs = C.usToMs(nowInWindowUs);
            }
        }
        long jUsToMs2 = this.g.liveConfiguration.minOffsetMs;
        if (jUsToMs2 == C.TIME_UNSET) {
            ServiceDescriptionElement serviceDescriptionElement2 = this.G.serviceDescription;
            if (serviceDescriptionElement2 != null) {
                jUsToMs2 = serviceDescriptionElement2.minOffsetMs;
                if (jUsToMs2 == C.TIME_UNSET) {
                    jUsToMs2 = C.usToMs(nowInWindowUs - windowDurationUs);
                    if (jUsToMs2 < 0 && jUsToMs > 0) {
                        jUsToMs2 = 0;
                    }
                    j = this.G.minBufferTimeMs;
                    if (j != C.TIME_UNSET) {
                        jUsToMs2 = Math.min(jUsToMs2 + j, jUsToMs);
                    }
                }
            } else {
                jUsToMs2 = C.usToMs(nowInWindowUs - windowDurationUs);
                if (jUsToMs2 < 0) {
                    jUsToMs2 = 0;
                }
                j = this.G.minBufferTimeMs;
                if (j != C.TIME_UNSET) {
                    jUsToMs2 = Math.min(jUsToMs2 + j, jUsToMs);
                }
            }
        }
        long j2 = jUsToMs2;
        long j3 = this.D.targetOffsetMs;
        if (j3 == C.TIME_UNSET) {
            DashManifest dashManifest = this.G;
            ServiceDescriptionElement serviceDescriptionElement3 = dashManifest.serviceDescription;
            if (serviceDescriptionElement3 != null) {
                long j4 = serviceDescriptionElement3.targetOffsetMs;
                if (j4 != C.TIME_UNSET) {
                    j3 = j4;
                } else {
                    j3 = dashManifest.suggestedPresentationDelayMs;
                    if (j3 == C.TIME_UNSET) {
                        j3 = this.o;
                    }
                }
            } else {
                j3 = dashManifest.suggestedPresentationDelayMs;
                if (j3 == C.TIME_UNSET) {
                    j3 = this.o;
                }
            }
        }
        if (j3 < j2) {
            j3 = j2;
        }
        long jConstrainValue = j3 > jUsToMs ? Util.constrainValue(C.usToMs(nowInWindowUs - Math.min(P, windowDurationUs / 2)), j2, jUsToMs) : j3;
        MediaItem.LiveConfiguration liveConfiguration = this.g.liveConfiguration;
        float f3 = liveConfiguration.minPlaybackSpeed;
        if (f3 == -3.4028235E38f) {
            ServiceDescriptionElement serviceDescriptionElement4 = this.G.serviceDescription;
            f3 = serviceDescriptionElement4 != null ? serviceDescriptionElement4.minPlaybackSpeed : -3.4028235E38f;
        }
        float f4 = liveConfiguration.maxPlaybackSpeed;
        if (f4 == -3.4028235E38f) {
            ServiceDescriptionElement serviceDescriptionElement5 = this.G.serviceDescription;
            if (serviceDescriptionElement5 != null) {
                f4 = serviceDescriptionElement5.maxPlaybackSpeed;
                f2 = f4;
            } else {
                f2 = -3.4028235E38f;
            }
        } else {
            f2 = f4;
        }
        this.D = new MediaItem.LiveConfiguration(jConstrainValue, j2, jUsToMs, f3, f2);
    }

    private static long g(Period period, long periodDurationUs, long nowUnixTimeUs) {
        long jMsToUs = C.msToUs(period.startMs);
        boolean zK = k(period);
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            AdaptationSet adaptationSet = period.adaptationSets.get(i);
            List<Representation> list = adaptationSet.representations;
            if ((!zK || adaptationSet.type != 3) && !list.isEmpty()) {
                DashSegmentIndex index = list.get(0).getIndex();
                if (index == null) {
                    return jMsToUs + periodDurationUs;
                }
                long availableSegmentCount = index.getAvailableSegmentCount(periodDurationUs, nowUnixTimeUs);
                if (availableSegmentCount == 0) {
                    return jMsToUs;
                }
                long firstAvailableSegmentNum = (index.getFirstAvailableSegmentNum(periodDurationUs, nowUnixTimeUs) + availableSegmentCount) - 1;
                jMin = Math.min(jMin, index.getDurationUs(firstAvailableSegmentNum, periodDurationUs) + index.getTimeUs(firstAvailableSegmentNum) + jMsToUs);
            }
        }
        return jMin;
    }

    private static long h(Period period, long periodDurationUs, long nowUnixTimeUs) {
        long jMsToUs = C.msToUs(period.startMs);
        boolean zK = k(period);
        long jMax = jMsToUs;
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            AdaptationSet adaptationSet = period.adaptationSets.get(i);
            List<Representation> list = adaptationSet.representations;
            if ((!zK || adaptationSet.type != 3) && !list.isEmpty()) {
                DashSegmentIndex index = list.get(0).getIndex();
                if (index == null || index.getAvailableSegmentCount(periodDurationUs, nowUnixTimeUs) == 0) {
                    return jMsToUs;
                }
                jMax = Math.max(jMax, index.getTimeUs(index.getFirstAvailableSegmentNum(periodDurationUs, nowUnixTimeUs)) + jMsToUs);
            }
        }
        return jMax;
    }

    private static long i(DashManifest manifest, long nowUnixTimeMs) {
        DashSegmentIndex index;
        int periodCount = manifest.getPeriodCount() - 1;
        Period period = manifest.getPeriod(periodCount);
        long jMsToUs = C.msToUs(period.startMs);
        long periodDurationUs = manifest.getPeriodDurationUs(periodCount);
        long jMsToUs2 = C.msToUs(nowUnixTimeMs);
        long jMsToUs3 = C.msToUs(manifest.availabilityStartTimeMs);
        long jMsToUs4 = C.msToUs(5000L);
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            List<Representation> list = period.adaptationSets.get(i).representations;
            if (!list.isEmpty() && (index = list.get(0).getIndex()) != null) {
                long nextSegmentAvailableTimeUs = ((jMsToUs3 + jMsToUs) + index.getNextSegmentAvailableTimeUs(periodDurationUs, jMsToUs2)) - jMsToUs2;
                if (nextSegmentAvailableTimeUs < jMsToUs4 - com.google.android.exoplayer2.extractor.mp3.b.e || (nextSegmentAvailableTimeUs > jMsToUs4 && nextSegmentAvailableTimeUs < jMsToUs4 + com.google.android.exoplayer2.extractor.mp3.b.e)) {
                    jMsToUs4 = nextSegmentAvailableTimeUs;
                }
            }
        }
        return LongMath.divide(jMsToUs4, 1000L, RoundingMode.CEILING);
    }

    private long j() {
        return Math.min((this.L - 1) * 1000, 5000);
    }

    private static boolean k(Period period) {
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            int i2 = period.adaptationSets.get(i).type;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean l(Period period) {
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            DashSegmentIndex index = period.adaptationSets.get(i).representations.get(0).getIndex();
            if (index == null || index.isExplicit()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        x(false);
    }

    private void n() {
        SntpClient.initialize(this.z, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(IOException error) {
        Log.e("DashMediaSource", "Failed to resolve time offset.", error);
        x(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(long elapsedRealtimeOffsetMs) {
        this.K = elapsedRealtimeOffsetMs;
        x(true);
    }

    private void x(boolean scheduleRefresh) {
        long j;
        long j2;
        for (int i = 0; i < this.t.size(); i++) {
            int iKeyAt = this.t.keyAt(i);
            if (iKeyAt >= this.N) {
                this.t.valueAt(i).u(this.G, iKeyAt - this.N);
            }
        }
        Period period = this.G.getPeriod(0);
        int periodCount = this.G.getPeriodCount() - 1;
        Period period2 = this.G.getPeriod(periodCount);
        long periodDurationUs = this.G.getPeriodDurationUs(periodCount);
        long jMsToUs = C.msToUs(Util.getNowUnixTimeMs(this.K));
        long jH = h(period, this.G.getPeriodDurationUs(0), jMsToUs);
        long jG = g(period2, periodDurationUs, jMsToUs);
        boolean z = this.G.dynamic && !l(period2);
        if (z) {
            long j3 = this.G.timeShiftBufferDepthMs;
            if (j3 != C.TIME_UNSET) {
                jH = Math.max(jH, jG - C.msToUs(j3));
            }
        }
        long j4 = jG - jH;
        DashManifest dashManifest = this.G;
        if (dashManifest.dynamic) {
            Assertions.checkState(dashManifest.availabilityStartTimeMs != C.TIME_UNSET);
            long jMsToUs2 = (jMsToUs - C.msToUs(this.G.availabilityStartTimeMs)) - jH;
            E(jMsToUs2, j4);
            long jUsToMs = this.G.availabilityStartTimeMs + C.usToMs(jH);
            long jMsToUs3 = jMsToUs2 - C.msToUs(this.D.targetOffsetMs);
            long jMin = Math.min(P, j4 / 2);
            j = jUsToMs;
            j2 = jMsToUs3 < jMin ? jMin : jMsToUs3;
        } else {
            j = C.TIME_UNSET;
            j2 = 0;
        }
        long jMsToUs4 = jH - C.msToUs(period.startMs);
        DashManifest dashManifest2 = this.G;
        refreshSourceInfo(new b(dashManifest2.availabilityStartTimeMs, j, this.K, this.N, jMsToUs4, j4, j2, dashManifest2, this.g, dashManifest2.dynamic ? this.D : null));
        if (this.h) {
            return;
        }
        this.C.removeCallbacks(this.v);
        if (z) {
            this.C.postDelayed(this.v, i(this.G, Util.getNowUnixTimeMs(this.K)));
        }
        if (this.H) {
            D();
            return;
        }
        if (scheduleRefresh) {
            DashManifest dashManifest3 = this.G;
            if (dashManifest3.dynamic) {
                long j5 = dashManifest3.minUpdatePeriodMs;
                if (j5 != C.TIME_UNSET) {
                    if (j5 == 0) {
                        j5 = 5000;
                    }
                    B(Math.max(0L, (this.I + j5) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void y(UtcTimingElement timingElement) {
        String str = timingElement.schemeIdUri;
        if (Util.areEqual(str, "urn:mpeg:dash:utc:direct:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:direct:2012")) {
            z(timingElement);
            return;
        }
        if (Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            A(timingElement, new d());
            return;
        }
        if (Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            A(timingElement, new h(null));
        } else if (Util.areEqual(str, "urn:mpeg:dash:utc:ntp:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:ntp:2012")) {
            n();
        } else {
            v(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void z(UtcTimingElement timingElement) {
        try {
            w(Util.parseXsDateTime(timingElement.value) - this.J);
        } catch (ParserException e2) {
            v(e2);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
        int iIntValue = ((Integer) id.periodUid).intValue() - this.N;
        MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = createEventDispatcher(id, this.G.getPeriod(iIntValue).startMs);
        DashMediaPeriod dashMediaPeriod = new DashMediaPeriod(iIntValue + this.N, this.G, this.n, iIntValue, this.j, this.A, this.l, createDrmEventDispatcher(id), this.m, eventDispatcherCreateEventDispatcher, this.K, this.x, allocator, this.k, this.w);
        this.t.put(dashMediaPeriod.a, dashMediaPeriod);
        return dashMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.g;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.x.maybeThrowError();
    }

    public void o(long expiredManifestPublishTimeUs) {
        long j = this.M;
        if (j == C.TIME_UNSET || j < expiredManifestPublishTimeUs) {
            this.M = expiredManifestPublishTimeUs;
        }
    }

    public void p() {
        this.C.removeCallbacks(this.v);
        D();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
        this.A = mediaTransferListener;
        this.l.prepare();
        if (this.h) {
            x(false);
            return;
        }
        this.y = this.i.createDataSource();
        this.z = new Loader("DashMediaSource");
        this.C = Util.createHandlerForCurrentLooper();
        D();
    }

    public void q(ParsingLoadable<?> loadable, long elapsedRealtimeMs, long loadDurationMs) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
        this.m.onLoadTaskConcluded(loadable.loadTaskId);
        this.p.loadCanceled(loadEventInfo, loadable.type);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c9  */
    public void r(ParsingLoadable<DashManifest> loadable, long elapsedRealtimeMs, long loadDurationMs) {
        boolean z;
        int i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
        this.m.onLoadTaskConcluded(loadable.loadTaskId);
        this.p.loadCompleted(loadEventInfo, loadable.type);
        DashManifest result = loadable.getResult();
        DashManifest dashManifest = this.G;
        int periodCount = dashManifest == null ? 0 : dashManifest.getPeriodCount();
        long j = result.getPeriod(0).startMs;
        int i2 = 0;
        while (i2 < periodCount && this.G.getPeriod(i2).startMs < j) {
            i2++;
        }
        if (result.dynamic) {
            if (periodCount - i2 > result.getPeriodCount()) {
                Log.w("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j2 = this.M;
                if (j2 != C.TIME_UNSET) {
                    long j3 = result.publishTimeMs;
                    if (1000 * j3 <= j2) {
                        StringBuilder sb = new StringBuilder(73);
                        sb.append("Loaded stale dynamic manifest: ");
                        sb.append(j3);
                        sb.append(", ");
                        sb.append(j2);
                        Log.w("DashMediaSource", sb.toString());
                    }
                    if (z) {
                        i = this.L;
                        this.L = i + 1;
                        if (i < this.m.getMinimumLoadableRetryCount(loadable.type)) {
                            B(j());
                            return;
                        } else {
                            this.B = new DashManifestStaleException();
                            return;
                        }
                    }
                    this.L = 0;
                }
                z = false;
                if (z) {
                    i = this.L;
                    this.L = i + 1;
                    if (i < this.m.getMinimumLoadableRetryCount(loadable.type)) {
                        B(j());
                        return;
                    } else {
                        this.B = new DashManifestStaleException();
                        return;
                    }
                }
                this.L = 0;
            }
            z = true;
            if (z) {
                i = this.L;
                this.L = i + 1;
                if (i < this.m.getMinimumLoadableRetryCount(loadable.type)) {
                    B(j());
                    return;
                } else {
                    this.B = new DashManifestStaleException();
                    return;
                }
            }
            this.L = 0;
        }
        this.G = result;
        this.H = result.dynamic & this.H;
        this.I = elapsedRealtimeMs - loadDurationMs;
        this.J = elapsedRealtimeMs;
        synchronized (this.s) {
            if (loadable.dataSpec.uri == this.E) {
                Uri uri = this.G.location;
                if (uri == null) {
                    uri = loadable.getUri();
                }
                this.E = uri;
            }
        }
        if (periodCount != 0) {
            this.N += i2;
            x(true);
            return;
        }
        DashManifest dashManifest2 = this.G;
        if (!dashManifest2.dynamic) {
            x(true);
            return;
        }
        UtcTimingElement utcTimingElement = dashManifest2.utcTiming;
        if (utcTimingElement != null) {
            y(utcTimingElement);
        } else {
            n();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        DashMediaPeriod dashMediaPeriod = (DashMediaPeriod) mediaPeriod;
        dashMediaPeriod.q();
        this.t.remove(dashMediaPeriod.a);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.H = false;
        this.y = null;
        Loader loader = this.z;
        if (loader != null) {
            loader.release();
            this.z = null;
        }
        this.I = 0L;
        this.J = 0L;
        this.G = this.h ? this.G : null;
        this.E = this.F;
        this.B = null;
        Handler handler = this.C;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.C = null;
        }
        this.K = C.TIME_UNSET;
        this.L = 0;
        this.M = C.TIME_UNSET;
        this.N = 0;
        this.t.clear();
        this.n.reset();
        this.l.release();
    }

    public void replaceManifestUri(Uri manifestUri) {
        synchronized (this.s) {
            this.E = manifestUri;
            this.F = manifestUri;
        }
    }

    public Loader.LoadErrorAction s(ParsingLoadable<DashManifest> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
        long retryDelayMsFor = this.m.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(loadable.type), error, errorCount));
        Loader.LoadErrorAction loadErrorActionCreateRetryAction = retryDelayMsFor == C.TIME_UNSET ? Loader.DONT_RETRY_FATAL : Loader.createRetryAction(false, retryDelayMsFor);
        boolean z = !loadErrorActionCreateRetryAction.isRetry();
        this.p.loadError(loadEventInfo, loadable.type, error, z);
        if (z) {
            this.m.onLoadTaskConcluded(loadable.loadTaskId);
        }
        return loadErrorActionCreateRetryAction;
    }

    public void t(ParsingLoadable<Long> loadable, long elapsedRealtimeMs, long loadDurationMs) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
        this.m.onLoadTaskConcluded(loadable.loadTaskId);
        this.p.loadCompleted(loadEventInfo, loadable.type);
        w(loadable.getResult().longValue() - elapsedRealtimeMs);
    }

    public Loader.LoadErrorAction u(ParsingLoadable<Long> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error) {
        this.p.loadError(new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded()), loadable.type, error, true);
        this.m.onLoadTaskConcluded(loadable.loadTaskId);
        v(error);
        return Loader.DONT_RETRY;
    }

    public final class f implements LoaderErrorThrower {
        public f() {
        }

        private void a() throws IOException {
            if (DashMediaSource.this.B != null) {
                throw DashMediaSource.this.B;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError() throws IOException {
            DashMediaSource.this.z.maybeThrowError();
            a();
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError(int minRetryCount) throws IOException {
            DashMediaSource.this.z.maybeThrowError(minRetryCount);
            a();
        }
    }

    private DashMediaSource(MediaItem mediaItem, @Nullable DashManifest manifest, @Nullable DataSource.Factory manifestDataSourceFactory, @Nullable ParsingLoadable.Parser<? extends DashManifest> manifestParser, DashChunkSource.Factory chunkSourceFactory, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long fallbackTargetLiveOffsetMs) {
        this.g = mediaItem;
        this.D = mediaItem.liveConfiguration;
        this.E = ((MediaItem.PlaybackProperties) Assertions.checkNotNull(mediaItem.playbackProperties)).uri;
        this.F = mediaItem.playbackProperties.uri;
        this.G = manifest;
        this.i = manifestDataSourceFactory;
        this.q = manifestParser;
        this.j = chunkSourceFactory;
        this.l = drmSessionManager;
        this.m = loadErrorHandlingPolicy;
        this.o = fallbackTargetLiveOffsetMs;
        this.k = compositeSequenceableLoaderFactory;
        this.n = new BaseUrlExclusionList();
        boolean z = manifest != null;
        this.h = z;
        a aVar = null;
        this.p = createEventDispatcher(null);
        this.s = new Object();
        this.t = new SparseArray<>();
        this.w = new c(this, aVar);
        this.M = C.TIME_UNSET;
        this.K = C.TIME_UNSET;
        if (!z) {
            this.r = new e(this, aVar);
            this.x = new f();
            this.u = new Runnable() { // from class: o21
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.D();
                }
            };
            this.v = new Runnable() { // from class: p21
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.m();
                }
            };
            return;
        }
        Assertions.checkState(true ^ manifest.dynamic);
        this.r = null;
        this.u = null;
        this.v = null;
        this.x = new LoaderErrorThrower.Dummy();
    }
}
