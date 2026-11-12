package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RenderersFactory;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import defpackage.zm;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DownloadHelper {

    @Deprecated
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS;
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT;

    @Deprecated
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_VIEWPORT;
    private final MediaItem.PlaybackProperties a;

    @Nullable
    private final MediaSource b;
    private final DefaultTrackSelector c;
    private final RendererCapabilities[] d;
    private final SparseIntArray e;
    private final Handler f;
    private final Timeline.Window g;
    private boolean h;
    private Callback i;
    private e j;
    private TrackGroupArray[] k;
    private MappingTrackSelector.MappedTrackInfo[] l;
    private List<ExoTrackSelection>[][] m;
    private List<ExoTrackSelection>[][] n;

    public interface Callback {
        void onPrepareError(DownloadHelper helper, IOException e);

        void onPrepared(DownloadHelper helper);
    }

    public static class LiveContentUnsupportedException extends IOException {
    }

    public class a implements VideoRendererEventListener {
        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onDroppedFrames(int i, long j) {
            com.google.android.exoplayer2.video.c.a(this, i, j);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onRenderedFirstFrame(Object obj, long j) {
            com.google.android.exoplayer2.video.c.b(this, obj, j);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoCodecError(Exception exc) {
            com.google.android.exoplayer2.video.c.c(this, exc);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoDecoderInitialized(String str, long j, long j2) {
            com.google.android.exoplayer2.video.c.d(this, str, j, j2);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoDecoderReleased(String str) {
            com.google.android.exoplayer2.video.c.e(this, str);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoDisabled(DecoderCounters decoderCounters) {
            com.google.android.exoplayer2.video.c.f(this, decoderCounters);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoEnabled(DecoderCounters decoderCounters) {
            com.google.android.exoplayer2.video.c.g(this, decoderCounters);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoFrameProcessingOffset(long j, int i) {
            com.google.android.exoplayer2.video.c.h(this, j, i);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoInputFormatChanged(Format format) {
            com.google.android.exoplayer2.video.c.i(this, format);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            com.google.android.exoplayer2.video.c.j(this, format, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            com.google.android.exoplayer2.video.c.k(this, videoSize);
        }
    }

    public class b implements AudioRendererEventListener {
        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioCodecError(Exception exc) {
            com.google.android.exoplayer2.audio.b.a(this, exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioDecoderInitialized(String str, long j, long j2) {
            com.google.android.exoplayer2.audio.b.b(this, str, j, j2);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioDecoderReleased(String str) {
            com.google.android.exoplayer2.audio.b.c(this, str);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioDisabled(DecoderCounters decoderCounters) {
            com.google.android.exoplayer2.audio.b.d(this, decoderCounters);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioEnabled(DecoderCounters decoderCounters) {
            com.google.android.exoplayer2.audio.b.e(this, decoderCounters);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioInputFormatChanged(Format format) {
            com.google.android.exoplayer2.audio.b.f(this, format);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            com.google.android.exoplayer2.audio.b.g(this, format, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioPositionAdvancing(long j) {
            com.google.android.exoplayer2.audio.b.h(this, j);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioSinkError(Exception exc) {
            com.google.android.exoplayer2.audio.b.i(this, exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioUnderrun(int i, long j, long j2) {
            com.google.android.exoplayer2.audio.b.j(this, i, j, j2);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            com.google.android.exoplayer2.audio.b.k(this, z);
        }
    }

    public static final class c extends BaseTrackSelection {

        public static final class a implements ExoTrackSelection.Factory {
            private a() {
            }

            @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
            public ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitions, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
                ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitions.length];
                for (int i = 0; i < definitions.length; i++) {
                    exoTrackSelectionArr[i] = definitions[i] == null ? null : new c(definitions[i].group, definitions[i].tracks);
                }
                return exoTrackSelectionArr;
            }

            public /* synthetic */ a(a aVar) {
                this();
            }
        }

        public c(TrackGroup trackGroup, int[] tracks) {
            super(trackGroup, tracks);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        @Nullable
        public Object getSelectionData() {
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long playbackPositionUs, long bufferedDurationUs, long availableDurationUs, List<? extends MediaChunk> queue, MediaChunkIterator[] mediaChunkIterators) {
        }
    }

    public static final class d implements BandwidthMeter {
        private d() {
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public void addEventListener(Handler eventHandler, BandwidthMeter.EventListener eventListener) {
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public long getBitrateEstimate() {
            return 0L;
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public /* synthetic */ long getTimeToFirstByteEstimateUs() {
            return zm.a(this);
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        @Nullable
        public TransferListener getTransferListener() {
            return null;
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public static final class e implements MediaSource.MediaSourceCaller, MediaPeriod.Callback, Handler.Callback {
        private static final int k = 0;
        private static final int l = 1;
        private static final int m = 2;
        private static final int n = 3;
        private static final int o = 0;
        private static final int p = 1;
        private final MediaSource a;
        private final DownloadHelper b;
        private final Allocator c = new DefaultAllocator(true, 65536);
        private final ArrayList<MediaPeriod> d = new ArrayList<>();
        private final Handler e = Util.createHandlerForCurrentOrMainLooper(new Handler.Callback() { // from class: com.google.android.exoplayer2.offline.b
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.a.b(message);
            }
        });
        private final HandlerThread f;
        private final Handler g;
        public Timeline h;
        public MediaPeriod[] i;
        private boolean j;

        public e(MediaSource mediaSource, DownloadHelper downloadHelper) {
            this.a = mediaSource;
            this.b = downloadHelper;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.f = handlerThread;
            handlerThread.start();
            Handler handlerCreateHandler = Util.createHandler(handlerThread.getLooper(), this);
            this.g = handlerCreateHandler;
            handlerCreateHandler.sendEmptyMessage(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(Message msg) {
            if (this.j) {
                return false;
            }
            int i = msg.what;
            if (i == 0) {
                this.b.s();
                return true;
            }
            if (i != 1) {
                return false;
            }
            d();
            this.b.r((IOException) Util.castNonNull(msg.obj));
            return true;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            if (this.d.contains(mediaPeriod)) {
                this.g.obtainMessage(2, mediaPeriod).sendToTarget();
            }
        }

        public void d() {
            if (this.j) {
                return;
            }
            this.j = true;
            this.g.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message msg) {
            int i = msg.what;
            if (i == 0) {
                this.a.prepareSource(this, null);
                this.g.sendEmptyMessage(1);
                return true;
            }
            int i2 = 0;
            if (i == 1) {
                try {
                    if (this.i == null) {
                        this.a.maybeThrowSourceInfoRefreshError();
                    } else {
                        while (i2 < this.d.size()) {
                            this.d.get(i2).maybeThrowPrepareError();
                            i2++;
                        }
                    }
                    this.g.sendEmptyMessageDelayed(1, 100L);
                } catch (IOException e) {
                    this.e.obtainMessage(1, e).sendToTarget();
                }
                return true;
            }
            if (i == 2) {
                MediaPeriod mediaPeriod = (MediaPeriod) msg.obj;
                if (this.d.contains(mediaPeriod)) {
                    mediaPeriod.continueLoading(0L);
                }
                return true;
            }
            if (i != 3) {
                return false;
            }
            MediaPeriod[] mediaPeriodArr = this.i;
            if (mediaPeriodArr != null) {
                int length = mediaPeriodArr.length;
                while (i2 < length) {
                    this.a.releasePeriod(mediaPeriodArr[i2]);
                    i2++;
                }
            }
            this.a.releaseSource(this);
            this.g.removeCallbacksAndMessages(null);
            this.f.quit();
            return true;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            this.d.remove(mediaPeriod);
            if (this.d.isEmpty()) {
                this.g.removeMessages(1);
                this.e.sendEmptyMessage(0);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
        public void onSourceInfoRefreshed(MediaSource source, Timeline timeline) {
            MediaPeriod[] mediaPeriodArr;
            if (this.h != null) {
                return;
            }
            if (timeline.getWindow(0, new Timeline.Window()).isLive()) {
                this.e.obtainMessage(1, new LiveContentUnsupportedException()).sendToTarget();
                return;
            }
            this.h = timeline;
            this.i = new MediaPeriod[timeline.getPeriodCount()];
            int i = 0;
            while (true) {
                mediaPeriodArr = this.i;
                if (i >= mediaPeriodArr.length) {
                    break;
                }
                MediaPeriod mediaPeriodCreatePeriod = this.a.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(i)), this.c, 0L);
                this.i[i] = mediaPeriodCreatePeriod;
                this.d.add(mediaPeriodCreatePeriod);
                i++;
            }
            for (MediaPeriod mediaPeriod : mediaPeriodArr) {
                mediaPeriod.prepare(this, 0L);
            }
        }
    }

    static {
        DefaultTrackSelector.Parameters parametersBuild = DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT.buildUpon().setForceHighestSupportedBitrate(true).build();
        DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT = parametersBuild;
        DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_VIEWPORT = parametersBuild;
        DEFAULT_TRACK_SELECTOR_PARAMETERS = parametersBuild;
    }

    public DownloadHelper(MediaItem mediaItem, @Nullable MediaSource mediaSource, DefaultTrackSelector.Parameters trackSelectorParameters, RendererCapabilities[] rendererCapabilities) {
        this.a = (MediaItem.PlaybackProperties) Assertions.checkNotNull(mediaItem.playbackProperties);
        this.b = mediaSource;
        a aVar = null;
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(trackSelectorParameters, new c.a(aVar));
        this.c = defaultTrackSelector;
        this.d = rendererCapabilities;
        this.e = new SparseIntArray();
        defaultTrackSelector.init(new TrackSelector.InvalidationListener() { // from class: rc1
            @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
            public final void onTrackSelectionsInvalidated() {
                DownloadHelper.n();
            }
        }, new d(aVar));
        this.f = Util.createHandlerForCurrentOrMainLooper();
        this.g = new Timeline.Window();
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory dataSourceFactory) {
        return createMediaSource(downloadRequest, dataSourceFactory, null);
    }

    @Deprecated
    public static DownloadHelper forDash(Context context, Uri uri, DataSource.Factory dataSourceFactory, RenderersFactory renderersFactory) {
        return forDash(uri, dataSourceFactory, renderersFactory, null, getDefaultTrackSelectorParameters(context));
    }

    @Deprecated
    public static DownloadHelper forHls(Context context, Uri uri, DataSource.Factory dataSourceFactory, RenderersFactory renderersFactory) {
        return forHls(uri, dataSourceFactory, renderersFactory, null, getDefaultTrackSelectorParameters(context));
    }

    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem) {
        Assertions.checkArgument(k((MediaItem.PlaybackProperties) Assertions.checkNotNull(mediaItem.playbackProperties)));
        return forMediaItem(mediaItem, getDefaultTrackSelectorParameters(context), null, null, null);
    }

    @Deprecated
    public static DownloadHelper forProgressive(Context context, Uri uri) {
        return forMediaItem(context, new MediaItem.Builder().setUri(uri).build());
    }

    @Deprecated
    public static DownloadHelper forSmoothStreaming(Uri uri, DataSource.Factory dataSourceFactory, RenderersFactory renderersFactory) {
        return forSmoothStreaming(uri, dataSourceFactory, renderersFactory, null, DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT);
    }

    public static DefaultTrackSelector.Parameters getDefaultTrackSelectorParameters(Context context) {
        return DefaultTrackSelector.Parameters.getDefaults(context).buildUpon().setForceHighestSupportedBitrate(true).build();
    }

    public static RendererCapabilities[] getRendererCapabilities(RenderersFactory renderersFactory) {
        Renderer[] rendererArrCreateRenderers = renderersFactory.createRenderers(Util.createHandlerForCurrentOrMainLooper(), new a(), new b(), new TextOutput() { // from class: qc1
            @Override // com.google.android.exoplayer2.text.TextOutput
            public final void onCues(List list) {
                DownloadHelper.l(list);
            }
        }, new MetadataOutput() { // from class: pc1
            @Override // com.google.android.exoplayer2.metadata.MetadataOutput
            public final void onMetadata(Metadata metadata) {
                DownloadHelper.m(metadata);
            }
        });
        RendererCapabilities[] rendererCapabilitiesArr = new RendererCapabilities[rendererArrCreateRenderers.length];
        for (int i = 0; i < rendererArrCreateRenderers.length; i++) {
            rendererCapabilitiesArr[i] = rendererArrCreateRenderers[i].getCapabilities();
        }
        return rendererCapabilitiesArr;
    }

    @EnsuresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void i() {
        Assertions.checkState(this.h);
    }

    private static MediaSource j(MediaItem mediaItem, DataSource.Factory dataSourceFactory, @Nullable DrmSessionManager drmSessionManager) {
        return new DefaultMediaSourceFactory(dataSourceFactory, ExtractorsFactory.EMPTY).setDrmSessionManager(drmSessionManager).createMediaSource(mediaItem);
    }

    private static boolean k(MediaItem.PlaybackProperties playbackProperties) {
        return Util.inferContentTypeForUriAndMimeType(playbackProperties.uri, playbackProperties.mimeType) == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Metadata metadata) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(IOException iOException) {
        ((Callback) Assertions.checkNotNull(this.i)).onPrepareError(this, iOException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        ((Callback) Assertions.checkNotNull(this.i)).onPrepared(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(Callback callback) {
        callback.onPrepared(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(final IOException error) {
        ((Handler) Assertions.checkNotNull(this.f)).post(new Runnable() { // from class: uc1
            @Override // java.lang.Runnable
            public final void run() {
                this.a.o(error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        Assertions.checkNotNull(this.j);
        Assertions.checkNotNull(this.j.i);
        Assertions.checkNotNull(this.j.h);
        int length = this.j.i.length;
        int length2 = this.d.length;
        this.m = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        this.n = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length2; i2++) {
                this.m[i][i2] = new ArrayList();
                this.n[i][i2] = Collections.unmodifiableList(this.m[i][i2]);
            }
        }
        this.k = new TrackGroupArray[length];
        this.l = new MappingTrackSelector.MappedTrackInfo[length];
        for (int i3 = 0; i3 < length; i3++) {
            this.k[i3] = this.j.i[i3].getTrackGroups();
            this.c.onSelectionActivated(t(i3).info);
            this.l[i3] = (MappingTrackSelector.MappedTrackInfo) Assertions.checkNotNull(this.c.getCurrentMappedTrackInfo());
        }
        u();
        ((Handler) Assertions.checkNotNull(this.f)).post(new Runnable() { // from class: sc1
            @Override // java.lang.Runnable
            public final void run() {
                this.a.p();
            }
        });
    }

    @RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private TrackSelectorResult t(int periodIndex) {
        boolean z;
        try {
            TrackSelectorResult trackSelectorResultSelectTracks = this.c.selectTracks(this.d, this.k[periodIndex], new MediaSource.MediaPeriodId(this.j.h.getUidOfPeriod(periodIndex)), this.j.h);
            for (int i = 0; i < trackSelectorResultSelectTracks.length; i++) {
                ExoTrackSelection exoTrackSelection = trackSelectorResultSelectTracks.selections[i];
                if (exoTrackSelection != null) {
                    List<ExoTrackSelection> list = this.m[periodIndex][i];
                    int i2 = 0;
                    while (true) {
                        if (i2 >= list.size()) {
                            z = false;
                            break;
                        }
                        ExoTrackSelection exoTrackSelection2 = list.get(i2);
                        if (exoTrackSelection2.getTrackGroup() == exoTrackSelection.getTrackGroup()) {
                            this.e.clear();
                            for (int i3 = 0; i3 < exoTrackSelection2.length(); i3++) {
                                this.e.put(exoTrackSelection2.getIndexInTrackGroup(i3), 0);
                            }
                            for (int i4 = 0; i4 < exoTrackSelection.length(); i4++) {
                                this.e.put(exoTrackSelection.getIndexInTrackGroup(i4), 0);
                            }
                            int[] iArr = new int[this.e.size()];
                            for (int i5 = 0; i5 < this.e.size(); i5++) {
                                iArr[i5] = this.e.keyAt(i5);
                            }
                            list.set(i2, new c(exoTrackSelection2.getTrackGroup(), iArr));
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    if (!z) {
                        list.add(exoTrackSelection);
                    }
                }
            }
            return trackSelectorResultSelectTracks;
        } catch (ExoPlaybackException e2) {
            throw new UnsupportedOperationException(e2);
        }
    }

    @RequiresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void u() {
        this.h = true;
    }

    public void addAudioLanguagesToSelection(String... languages) {
        i();
        for (int i = 0; i < this.l.length; i++) {
            DefaultTrackSelector.ParametersBuilder parametersBuilderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT.buildUpon();
            MappingTrackSelector.MappedTrackInfo mappedTrackInfo = this.l[i];
            int rendererCount = mappedTrackInfo.getRendererCount();
            for (int i2 = 0; i2 < rendererCount; i2++) {
                if (mappedTrackInfo.getRendererType(i2) != 1) {
                    parametersBuilderBuildUpon.setRendererDisabled(i2, true);
                }
            }
            for (String str : languages) {
                parametersBuilderBuildUpon.setPreferredAudioLanguage(str);
                addTrackSelection(i, parametersBuilderBuildUpon.build());
            }
        }
    }

    public void addTextLanguagesToSelection(boolean selectUndeterminedTextLanguage, String... languages) {
        i();
        for (int i = 0; i < this.l.length; i++) {
            DefaultTrackSelector.ParametersBuilder parametersBuilderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT.buildUpon();
            MappingTrackSelector.MappedTrackInfo mappedTrackInfo = this.l[i];
            int rendererCount = mappedTrackInfo.getRendererCount();
            for (int i2 = 0; i2 < rendererCount; i2++) {
                if (mappedTrackInfo.getRendererType(i2) != 3) {
                    parametersBuilderBuildUpon.setRendererDisabled(i2, true);
                }
            }
            parametersBuilderBuildUpon.setSelectUndeterminedTextLanguage(selectUndeterminedTextLanguage);
            for (String str : languages) {
                parametersBuilderBuildUpon.setPreferredTextLanguage(str);
                addTrackSelection(i, parametersBuilderBuildUpon.build());
            }
        }
    }

    public void addTrackSelection(int periodIndex, DefaultTrackSelector.Parameters trackSelectorParameters) {
        i();
        this.c.setParameters(trackSelectorParameters);
        t(periodIndex);
    }

    public void addTrackSelectionForSingleRenderer(int periodIndex, int rendererIndex, DefaultTrackSelector.Parameters trackSelectorParameters, List<DefaultTrackSelector.SelectionOverride> overrides) {
        i();
        DefaultTrackSelector.ParametersBuilder parametersBuilderBuildUpon = trackSelectorParameters.buildUpon();
        int i = 0;
        while (i < this.l[periodIndex].getRendererCount()) {
            parametersBuilderBuildUpon.setRendererDisabled(i, i != rendererIndex);
            i++;
        }
        if (overrides.isEmpty()) {
            addTrackSelection(periodIndex, parametersBuilderBuildUpon.build());
            return;
        }
        TrackGroupArray trackGroups = this.l[periodIndex].getTrackGroups(rendererIndex);
        for (int i2 = 0; i2 < overrides.size(); i2++) {
            parametersBuilderBuildUpon.setSelectionOverride(rendererIndex, trackGroups, overrides.get(i2));
            addTrackSelection(periodIndex, parametersBuilderBuildUpon.build());
        }
    }

    public void clearTrackSelections(int periodIndex) {
        i();
        for (int i = 0; i < this.d.length; i++) {
            this.m[periodIndex][i].clear();
        }
    }

    public DownloadRequest getDownloadRequest(@Nullable byte[] data) {
        return getDownloadRequest(this.a.uri.toString(), data);
    }

    @Nullable
    public Object getManifest() {
        if (this.b == null) {
            return null;
        }
        i();
        if (this.j.h.getWindowCount() > 0) {
            return this.j.h.getWindow(0, this.g).manifest;
        }
        return null;
    }

    public MappingTrackSelector.MappedTrackInfo getMappedTrackInfo(int periodIndex) {
        i();
        return this.l[periodIndex];
    }

    public int getPeriodCount() {
        if (this.b == null) {
            return 0;
        }
        i();
        return this.k.length;
    }

    public TrackGroupArray getTrackGroups(int periodIndex) {
        i();
        return this.k[periodIndex];
    }

    public List<ExoTrackSelection> getTrackSelections(int periodIndex, int rendererIndex) {
        i();
        return this.n[periodIndex][rendererIndex];
    }

    public void prepare(final Callback callback) {
        Assertions.checkState(this.i == null);
        this.i = callback;
        MediaSource mediaSource = this.b;
        if (mediaSource != null) {
            this.j = new e(mediaSource, this);
        } else {
            this.f.post(new Runnable() { // from class: tc1
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.q(callback);
                }
            });
        }
    }

    public void release() {
        e eVar = this.j;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void replaceTrackSelections(int periodIndex, DefaultTrackSelector.Parameters trackSelectorParameters) {
        clearTrackSelections(periodIndex);
        addTrackSelection(periodIndex, trackSelectorParameters);
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory dataSourceFactory, @Nullable DrmSessionManager drmSessionManager) {
        return j(downloadRequest.toMediaItem(), dataSourceFactory, drmSessionManager);
    }

    @Deprecated
    public static DownloadHelper forProgressive(Context context, Uri uri, @Nullable String cacheKey) {
        return forMediaItem(context, new MediaItem.Builder().setUri(uri).setCustomCacheKey(cacheKey).build());
    }

    @Deprecated
    public static DownloadHelper forSmoothStreaming(Context context, Uri uri, DataSource.Factory dataSourceFactory, RenderersFactory renderersFactory) {
        return forSmoothStreaming(uri, dataSourceFactory, renderersFactory, null, getDefaultTrackSelectorParameters(context));
    }

    public DownloadRequest getDownloadRequest(String id, @Nullable byte[] data) {
        DownloadRequest.Builder mimeType = new DownloadRequest.Builder(id, this.a.uri).setMimeType(this.a.mimeType);
        MediaItem.DrmConfiguration drmConfiguration = this.a.drmConfiguration;
        DownloadRequest.Builder data2 = mimeType.setKeySetId(drmConfiguration != null ? drmConfiguration.getKeySetId() : null).setCustomCacheKey(this.a.customCacheKey).setData(data);
        if (this.b == null) {
            return data2.build();
        }
        i();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = this.m.length;
        for (int i = 0; i < length; i++) {
            arrayList2.clear();
            int length2 = this.m[i].length;
            for (int i2 = 0; i2 < length2; i2++) {
                arrayList2.addAll(this.m[i][i2]);
            }
            arrayList.addAll(this.j.i[i].getStreamKeys(arrayList2));
        }
        return data2.setStreamKeys(arrayList).build();
    }

    @Deprecated
    public static DownloadHelper forDash(Uri uri, DataSource.Factory dataSourceFactory, RenderersFactory renderersFactory, @Nullable DrmSessionManager drmSessionManager, DefaultTrackSelector.Parameters trackSelectorParameters) {
        return forMediaItem(new MediaItem.Builder().setUri(uri).setMimeType(MimeTypes.APPLICATION_MPD).build(), trackSelectorParameters, renderersFactory, dataSourceFactory, drmSessionManager);
    }

    @Deprecated
    public static DownloadHelper forHls(Uri uri, DataSource.Factory dataSourceFactory, RenderersFactory renderersFactory, @Nullable DrmSessionManager drmSessionManager, DefaultTrackSelector.Parameters trackSelectorParameters) {
        return forMediaItem(new MediaItem.Builder().setUri(uri).setMimeType(MimeTypes.APPLICATION_M3U8).build(), trackSelectorParameters, renderersFactory, dataSourceFactory, drmSessionManager);
    }

    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory dataSourceFactory) {
        return forMediaItem(mediaItem, getDefaultTrackSelectorParameters(context), renderersFactory, dataSourceFactory, null);
    }

    @Deprecated
    public static DownloadHelper forSmoothStreaming(Uri uri, DataSource.Factory dataSourceFactory, RenderersFactory renderersFactory, @Nullable DrmSessionManager drmSessionManager, DefaultTrackSelector.Parameters trackSelectorParameters) {
        return forMediaItem(new MediaItem.Builder().setUri(uri).setMimeType(MimeTypes.APPLICATION_SS).build(), trackSelectorParameters, renderersFactory, dataSourceFactory, drmSessionManager);
    }

    public static DownloadHelper forMediaItem(MediaItem mediaItem, DefaultTrackSelector.Parameters trackSelectorParameters, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory dataSourceFactory) {
        return forMediaItem(mediaItem, trackSelectorParameters, renderersFactory, dataSourceFactory, null);
    }

    public static DownloadHelper forMediaItem(MediaItem mediaItem, DefaultTrackSelector.Parameters trackSelectorParameters, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory dataSourceFactory, @Nullable DrmSessionManager drmSessionManager) {
        boolean zK = k((MediaItem.PlaybackProperties) Assertions.checkNotNull(mediaItem.playbackProperties));
        Assertions.checkArgument(zK || dataSourceFactory != null);
        return new DownloadHelper(mediaItem, zK ? null : j(mediaItem, (DataSource.Factory) Util.castNonNull(dataSourceFactory), drmSessionManager), trackSelectorParameters, renderersFactory != null ? getRendererCapabilities(renderersFactory) : new RendererCapabilities[0]);
    }
}
