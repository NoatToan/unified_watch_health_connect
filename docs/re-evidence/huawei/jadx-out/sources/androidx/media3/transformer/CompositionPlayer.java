package androidx.media3.transformer;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.PreviewingVideoGraph;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.Util;
import androidx.media3.effect.PreviewingSingleInputVideoGraph;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.image.ImageDecoder;
import androidx.media3.exoplayer.source.ConcatenatingMediaSource2;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.ExternalLoader;
import androidx.media3.exoplayer.source.MergingMediaSource;
import androidx.media3.exoplayer.source.SilenceMediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import androidx.media3.exoplayer.util.EventLogger;
import androidx.media3.exoplayer.video.CompositingVideoSinkProvider;
import androidx.media3.exoplayer.video.VideoFrameReleaseControl;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aqt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class CompositionPlayer extends SimpleBasePlayer implements CompositionPlayerInternal.Listener, CompositingVideoSinkProvider.Listener, SurfaceHolder.Callback {
    private static final int MAX_SUPPORTED_SEQUENCES = 2;
    private static final String TAG = "CompositionPlayer";
    private final HandlerWrapper applicationHandler;
    private final Clock clock;
    private Composition composition;
    private long compositionDurationUs;
    private final HandlerWrapper compositionInternalListenerHandler;
    private CompositionPlayerInternal compositionPlayerInternal;
    private final Context context;
    private Surface displaySurface;
    private final ExternalLoader externalImageLoader;
    private final AudioSink finalAudioSink;
    private final ImageDecoder.Factory imageDecoderFactory;
    private boolean playWhenReady;
    private int playWhenReadyChangeReason;
    private PlaybackException playbackException;
    private int playbackState;
    private HandlerThread playbackThread;
    private final List<ExoPlayer> players;
    private ImmutableList<SimpleBasePlayer.MediaItemData> playlist;
    private final PreviewingVideoGraph.Factory previewingVideoGraphFactory;
    private boolean renderedFirstFrame;
    private SurfaceHolder surfaceHolder;
    private Object videoOutput;
    private Size videoOutputSize;
    private static final Player.Commands AVAILABLE_COMMANDS = new Player.Commands.Builder().addAll(1, 2, 3, 5, 11, 12, 16, 17, 27, 22, 24, 32).build();
    private static final int[] SUPPORTED_LISTENER_EVENTS = {4, 5, 10, 11};

    @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
    public void onFrameDropped(CompositingVideoSinkProvider compositingVideoSinkProvider) {
    }

    @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
    public void onVideoSizeChanged(CompositingVideoSinkProvider compositingVideoSinkProvider, VideoSize videoSize) {
    }

    public static final class Builder {
        private AudioSink audioSink;
        private boolean built;
        private final Context context;
        private ExternalLoader externalImageLoader;
        private Looper looper;
        private PreviewingVideoGraph.Factory previewingVideoGraphFactory;
        private ImageDecoder.Factory imageDecoderFactory = ImageDecoder.Factory.DEFAULT;
        private Clock clock = Clock.DEFAULT;

        public Builder(Context context) {
            this.context = context.getApplicationContext();
        }

        public Builder setLooper(Looper looper) {
            this.looper = looper;
            return this;
        }

        public Builder setAudioSink(AudioSink audioSink) {
            this.audioSink = audioSink;
            return this;
        }

        public Builder setExternalImageLoader(ExternalLoader externalLoader) {
            this.externalImageLoader = externalLoader;
            return this;
        }

        public Builder setImageDecoderFactory(ImageDecoder.Factory factory) {
            this.imageDecoderFactory = factory;
            return this;
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public Builder setPreviewingVideoGraphFactory(PreviewingVideoGraph.Factory factory) {
            this.previewingVideoGraphFactory = factory;
            return this;
        }

        public CompositionPlayer build() {
            Assertions.checkState(!this.built);
            if (this.looper == null) {
                this.looper = (Looper) Assertions.checkStateNotNull(Looper.myLooper());
            }
            if (this.audioSink == null) {
                this.audioSink = new DefaultAudioSink.Builder(this.context).build();
            }
            if (this.previewingVideoGraphFactory == null) {
                this.previewingVideoGraphFactory = new PreviewingSingleInputVideoGraph.Factory();
            }
            CompositionPlayer compositionPlayer = new CompositionPlayer(this);
            this.built = true;
            return compositionPlayer;
        }
    }

    private CompositionPlayer(Builder builder) {
        super((Looper) Assertions.checkNotNull(builder.looper), builder.clock);
        this.context = builder.context;
        Clock clock = builder.clock;
        this.clock = clock;
        this.applicationHandler = clock.createHandler(builder.looper, null);
        this.finalAudioSink = (AudioSink) Assertions.checkNotNull(builder.audioSink);
        this.externalImageLoader = builder.externalImageLoader;
        this.imageDecoderFactory = builder.imageDecoderFactory;
        this.previewingVideoGraphFactory = (PreviewingVideoGraph.Factory) Assertions.checkNotNull(builder.previewingVideoGraphFactory);
        this.compositionInternalListenerHandler = clock.createHandler(builder.looper, null);
        this.players = new ArrayList();
        this.compositionDurationUs = C.TIME_UNSET;
        this.playbackState = 1;
    }

    public void setComposition(Composition composition) {
        verifyApplicationThread();
        Assertions.checkArgument(!composition.sequences.isEmpty() && composition.sequences.size() <= 2);
        Assertions.checkState(this.composition == null);
        setCompositionInternal(composition);
        Object obj = this.videoOutput;
        if (obj != null) {
            if (obj instanceof SurfaceHolder) {
                setVideoSurfaceHolderInternal((SurfaceHolder) obj);
            } else if (obj instanceof SurfaceView) {
                setVideoSurfaceHolderInternal(((SurfaceView) obj).getHolder());
            } else if (obj instanceof Surface) {
                setVideoSurfaceInternal((Surface) obj, (Size) Assertions.checkNotNull(this.videoOutputSize));
            } else {
                throw new IllegalStateException(this.videoOutput.getClass().toString());
            }
        }
        this.composition = composition;
    }

    public void setVideoSurface(Surface surface, Size size) {
        this.videoOutput = surface;
        this.videoOutputSize = size;
        setVideoSurfaceInternal(surface, size);
    }

    @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
    public void onFirstFrameRendered(CompositingVideoSinkProvider compositingVideoSinkProvider) {
        this.applicationHandler.post(new Runnable() { // from class: androidx.media3.transformer.CompositionPlayer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m671x1dcb8f93();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onFirstFrameRendered$0$androidx-media3-transformer-CompositionPlayer, reason: not valid java name */
    /* synthetic */ void m671x1dcb8f93() {
        this.renderedFirstFrame = true;
        invalidateState();
    }

    @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
    public void onError(CompositingVideoSinkProvider compositingVideoSinkProvider, final VideoFrameProcessingException videoFrameProcessingException) {
        this.applicationHandler.post(new Runnable() { // from class: androidx.media3.transformer.CompositionPlayer$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m670lambda$onError$1$androidxmedia3transformerCompositionPlayer(videoFrameProcessingException);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onError$1$androidx-media3-transformer-CompositionPlayer, reason: not valid java name */
    /* synthetic */ void m670lambda$onError$1$androidxmedia3transformerCompositionPlayer(VideoFrameProcessingException videoFrameProcessingException) {
        maybeUpdatePlaybackError("error from video sink provider", videoFrameProcessingException, 7001);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.videoOutputSize = new Size(surfaceHolder.getSurfaceFrame().width(), surfaceHolder.getSurfaceFrame().height());
        setVideoSurfaceInternal(surfaceHolder.getSurface(), this.videoOutputSize);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        maybeSetOutputSurfaceInfo(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        clearVideoSurfaceInternal();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public SimpleBasePlayer.State getState() {
        int i = this.playbackState;
        updatePlaybackState();
        if (i != 3 && this.playbackState == 3 && this.playWhenReady) {
            for (int i2 = 0; i2 < this.players.size(); i2++) {
                this.players.get(i2).setPlayWhenReady(true);
            }
        } else if (i == 3 && this.playWhenReady && this.playbackState == 2) {
            for (int i3 = 0; i3 < this.players.size(); i3++) {
                this.players.get(i3).setPlayWhenReady(false);
            }
        }
        SimpleBasePlayer.State.Builder newlyRenderedFirstFrame = new SimpleBasePlayer.State.Builder().setAvailableCommands(AVAILABLE_COMMANDS).setPlaybackState(this.playbackState).setPlayerError(this.playbackException).setPlayWhenReady(this.playWhenReady, this.playWhenReadyChangeReason).setContentPositionMs(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.transformer.CompositionPlayer$$ExternalSyntheticLambda1
            @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
            public final long get() {
                return this.f$0.getContentPositionMs();
            }
        }).setContentBufferedPositionMs(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.transformer.CompositionPlayer$$ExternalSyntheticLambda2
            @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
            public final long get() {
                return this.f$0.getBufferedPositionMs();
            }
        }).setTotalBufferedDurationMs(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.transformer.CompositionPlayer$$ExternalSyntheticLambda3
            @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
            public final long get() {
                return this.f$0.getTotalBufferedDurationMs();
            }
        }).setNewlyRenderedFirstFrame(getRenderedFirstFrameAndReset());
        ImmutableList<SimpleBasePlayer.MediaItemData> immutableList = this.playlist;
        if (immutableList != null) {
            newlyRenderedFirstFrame.setPlaylist(immutableList);
        }
        return newlyRenderedFirstFrame.build();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handlePrepare() {
        Assertions.checkStateNotNull(this.composition, "No composition set");
        if (this.playbackState != 1) {
            return aqt.e();
        }
        for (int i = 0; i < this.players.size(); i++) {
            this.players.get(i).prepare();
        }
        return aqt.e();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSetPlayWhenReady(boolean z) {
        this.playWhenReady = z;
        this.playWhenReadyChangeReason = 1;
        if (this.playbackState == 3) {
            for (int i = 0; i < this.players.size(); i++) {
                this.players.get(i).setPlayWhenReady(z);
            }
        }
        return aqt.e();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleStop() {
        for (int i = 0; i < this.players.size(); i++) {
            this.players.get(i).stop();
        }
        return aqt.e();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleRelease() {
        if (this.composition == null) {
            return aqt.e();
        }
        Assertions.checkState(((HandlerThread) Assertions.checkStateNotNull(this.playbackThread)).isAlive());
        for (int i = 0; i < this.players.size(); i++) {
            this.players.get(i).release();
        }
        ((CompositionPlayerInternal) Assertions.checkStateNotNull(this.compositionPlayerInternal)).release();
        removeSurfaceCallbacks();
        this.compositionInternalListenerHandler.removeCallbacksAndMessages(null);
        this.displaySurface = null;
        ((HandlerThread) Assertions.checkStateNotNull(this.playbackThread)).quitSafely();
        this.applicationHandler.removeCallbacksAndMessages(null);
        return aqt.e();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleClearVideoOutput(Object obj) {
        Assertions.checkArgument(Util.areEqual(obj, this.videoOutput));
        this.videoOutput = null;
        if (this.composition == null) {
            return aqt.e();
        }
        removeSurfaceCallbacks();
        clearVideoSurfaceInternal();
        return aqt.e();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSetVideoOutput(Object obj) {
        boolean z = obj instanceof SurfaceHolder;
        if (!z && !(obj instanceof SurfaceView)) {
            throw new UnsupportedOperationException(obj.getClass().toString());
        }
        this.videoOutput = obj;
        if (this.composition == null) {
            return aqt.e();
        }
        if (z) {
            setVideoSurfaceHolderInternal((SurfaceHolder) obj);
        } else {
            setVideoSurfaceHolderInternal(((SurfaceView) obj).getHolder());
        }
        return aqt.e();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSetVolume(float f) {
        this.finalAudioSink.setVolume(Util.constrainValue(f, 0.0f, 1.0f));
        return aqt.e();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSeek(int i, long j, int i2) {
        CompositionPlayerInternal compositionPlayerInternal = (CompositionPlayerInternal) Assertions.checkStateNotNull(this.compositionPlayerInternal);
        compositionPlayerInternal.startSeek(j);
        for (int i3 = 0; i3 < this.players.size(); i3++) {
            this.players.get(i3).seekTo(j);
        }
        compositionPlayerInternal.endSeek();
        return aqt.e();
    }

    @Override // androidx.media3.transformer.CompositionPlayerInternal.Listener
    public void onError(String str, Exception exc, int i) {
        maybeUpdatePlaybackError(str, exc, i);
    }

    private void updatePlaybackState() {
        if (this.players.isEmpty() || this.playbackException != null) {
            this.playbackState = 1;
            return;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.players.size(); i4++) {
            int playbackState = this.players.get(i4).getPlaybackState();
            if (playbackState == 1) {
                i++;
            } else if (playbackState == 2) {
                i2++;
            } else if (playbackState == 3) {
                continue;
            } else {
                if (playbackState != 4) {
                    throw new IllegalStateException(String.valueOf(playbackState));
                }
                i3++;
            }
        }
        if (i > 0) {
            this.playbackState = 1;
            return;
        }
        if (i2 > 0) {
            this.playbackState = 2;
        } else if (i3 == this.players.size()) {
            this.playbackState = 4;
        } else {
            this.playbackState = 3;
        }
    }

    private void setCompositionInternal(Composition composition) {
        SequencePlayerRenderersWrapper sequencePlayerRenderersWrapperCreateForAudio;
        this.compositionDurationUs = getCompositionDurationUs(composition);
        HandlerThread handlerThread = new HandlerThread("CompositionPlaybackThread", -16);
        this.playbackThread = handlerThread;
        handlerThread.start();
        PreviewAudioPipeline previewAudioPipeline = new PreviewAudioPipeline(new DefaultAudioMixer.Factory(), composition.effects.audioProcessors, (AudioSink) Assertions.checkNotNull(this.finalAudioSink));
        CompositingVideoSinkProvider compositingVideoSinkProviderBuild = new CompositingVideoSinkProvider.Builder(this.context, new VideoFrameReleaseControl(this.context, new CompositionFrameTimingEvaluator(), 0L)).setPreviewingVideoGraphFactory((PreviewingVideoGraph.Factory) Assertions.checkNotNull(this.previewingVideoGraphFactory)).setClock(this.clock).build();
        compositingVideoSinkProviderBuild.addListener(this);
        int i = 0;
        while (i < composition.sequences.size()) {
            EditedMediaItemSequence editedMediaItemSequence = composition.sequences.get(i);
            if (i == 0) {
                sequencePlayerRenderersWrapperCreateForAudio = SequencePlayerRenderersWrapper.create(this.context, editedMediaItemSequence, previewAudioPipeline, compositingVideoSinkProviderBuild, this.imageDecoderFactory);
            } else {
                sequencePlayerRenderersWrapperCreateForAudio = SequencePlayerRenderersWrapper.createForAudio(this.context, editedMediaItemSequence, previewAudioPipeline);
            }
            ExoPlayer.Builder clock = new ExoPlayer.Builder(this.context).setLooper(getApplicationLooper()).setPlaybackLooper(this.playbackThread.getLooper()).setRenderersFactory(sequencePlayerRenderersWrapperCreateForAudio).setHandleAudioBecomingNoisy(true).setClock(this.clock);
            if (i == 0) {
                clock.setTrackSelector(new CompositionTrackSelector(this.context));
            }
            ExoPlayer exoPlayerBuild = clock.build();
            exoPlayerBuild.addListener(new PlayerListener(i));
            exoPlayerBuild.addAnalyticsListener(new EventLogger());
            setPlayerSequence(exoPlayerBuild, editedMediaItemSequence, i == 0);
            this.players.add(exoPlayerBuild);
            if (i == 0) {
                invalidateState();
                this.playlist = createPlaylist();
            }
            i++;
        }
        this.compositionPlayerInternal = new CompositionPlayerInternal(this.playbackThread.getLooper(), this.clock, previewAudioPipeline, compositingVideoSinkProviderBuild, this, this.compositionInternalListenerHandler);
    }

    private void setPlayerSequence(ExoPlayer exoPlayer, EditedMediaItemSequence editedMediaItemSequence, boolean z) {
        ConcatenatingMediaSource2.Builder builderUseDefaultMediaSourceFactory = new ConcatenatingMediaSource2.Builder().useDefaultMediaSourceFactory(this.context);
        for (int i = 0; i < editedMediaItemSequence.editedMediaItems.size(); i++) {
            EditedMediaItem editedMediaItem = editedMediaItemSequence.editedMediaItems.get(i);
            Assertions.checkArgument(editedMediaItem.durationUs != C.TIME_UNSET);
            long presentationDurationUs = editedMediaItem.getPresentationDurationUs();
            if (z) {
                DefaultMediaSourceFactory defaultMediaSourceFactory = new DefaultMediaSourceFactory(this.context);
                ExternalLoader externalLoader = this.externalImageLoader;
                if (externalLoader != null) {
                    defaultMediaSourceFactory.setExternalImageLoader(externalLoader);
                }
                builderUseDefaultMediaSourceFactory.add(new MergingMediaSource(defaultMediaSourceFactory.createMediaSource(editedMediaItem.mediaItem), new SilenceMediaSource(editedMediaItem.durationUs)), Util.usToMs(presentationDurationUs));
            } else {
                builderUseDefaultMediaSourceFactory.add(editedMediaItem.mediaItem, Util.usToMs(presentationDurationUs));
            }
        }
        exoPlayer.setMediaSource(builderUseDefaultMediaSourceFactory.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getContentPositionMs() {
        return this.players.isEmpty() ? C.TIME_UNSET : this.players.get(0).getContentPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBufferedPositionMs() {
        if (this.players.isEmpty()) {
            return 0L;
        }
        long jMin = 2147483647L;
        for (int i = 0; i < this.players.size(); i++) {
            jMin = Math.min(jMin, this.players.get(i).getBufferedPosition());
        }
        return jMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getTotalBufferedDurationMs() {
        if (this.players.isEmpty()) {
            return 0L;
        }
        long jMin = 2147483647L;
        for (int i = 0; i < this.players.size(); i++) {
            jMin = Math.min(jMin, this.players.get(i).getTotalBufferedDuration());
        }
        return jMin;
    }

    private boolean getRenderedFirstFrameAndReset() {
        boolean z = this.renderedFirstFrame;
        this.renderedFirstFrame = false;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeUpdatePlaybackError(String str, Exception exc, int i) {
        if (this.playbackException == null) {
            this.playbackException = new PlaybackException(str, exc, i);
            for (int i2 = 0; i2 < this.players.size(); i2++) {
                this.players.get(i2).stop();
            }
            invalidateState();
            return;
        }
        Log.w(TAG, str, exc);
    }

    private void setVideoSurfaceHolderInternal(SurfaceHolder surfaceHolder) {
        removeSurfaceCallbacks();
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            Size size = new Size(surfaceHolder.getSurfaceFrame().width(), surfaceHolder.getSurfaceFrame().height());
            this.videoOutputSize = size;
            setVideoSurfaceInternal(surface, size);
            return;
        }
        clearVideoSurfaceInternal();
    }

    private void setVideoSurfaceInternal(Surface surface, Size size) {
        this.displaySurface = surface;
        maybeSetOutputSurfaceInfo(size.getWidth(), size.getHeight());
    }

    private void maybeSetOutputSurfaceInfo(int i, int i2) {
        CompositionPlayerInternal compositionPlayerInternal;
        Surface surface = this.displaySurface;
        if (i == 0 || i2 == 0 || surface == null || (compositionPlayerInternal = this.compositionPlayerInternal) == null) {
            return;
        }
        compositionPlayerInternal.setOutputSurfaceInfo(surface, new Size(i, i2));
    }

    private void clearVideoSurfaceInternal() {
        this.displaySurface = null;
        CompositionPlayerInternal compositionPlayerInternal = this.compositionPlayerInternal;
        if (compositionPlayerInternal != null) {
            compositionPlayerInternal.clearOutputSurface();
        }
    }

    private void removeSurfaceCallbacks() {
        SurfaceHolder surfaceHolder = this.surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this);
            this.surfaceHolder = null;
        }
    }

    private ImmutableList<SimpleBasePlayer.MediaItemData> createPlaylist() {
        Assertions.checkNotNull(Boolean.valueOf(this.compositionDurationUs != C.TIME_UNSET));
        return ImmutableList.of(new SimpleBasePlayer.MediaItemData.Builder("CompositionTimeline").setMediaItem(MediaItem.EMPTY).setDurationUs(this.compositionDurationUs).build());
    }

    private static long getCompositionDurationUs(Composition composition) {
        Assertions.checkState(!composition.sequences.isEmpty());
        long sequenceDurationUs = getSequenceDurationUs(composition.sequences.get(0));
        for (int i = 0; i < composition.sequences.size(); i++) {
            long sequenceDurationUs2 = getSequenceDurationUs(composition.sequences.get(i));
            Assertions.checkArgument(sequenceDurationUs == sequenceDurationUs2, Util.formatInvariant("Non-matching sequence durations. First sequence duration: %d us, sequence [%d] duration: %d us", Long.valueOf(sequenceDurationUs), Integer.valueOf(i), Long.valueOf(sequenceDurationUs2)));
        }
        return sequenceDurationUs;
    }

    private static long getSequenceDurationUs(EditedMediaItemSequence editedMediaItemSequence) {
        long presentationDurationUs = 0;
        for (int i = 0; i < editedMediaItemSequence.editedMediaItems.size(); i++) {
            presentationDurationUs += editedMediaItemSequence.editedMediaItems.get(i).getPresentationDurationUs();
        }
        Assertions.checkState(presentationDurationUs > 0, String.valueOf(presentationDurationUs));
        return presentationDurationUs;
    }

    static final class CompositionFrameTimingEvaluator implements VideoFrameReleaseControl.FrameTimingEvaluator {
        private static final long FRAME_LATE_THRESHOLD_US = -30000;
        private static final long FRAME_RELEASE_THRESHOLD_US = 100000;

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
        public boolean shouldDropFrame(long j, long j2, boolean z) {
            return j < FRAME_LATE_THRESHOLD_US && !z;
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
        public boolean shouldForceReleaseFrame(long j, long j2) {
            return j < FRAME_LATE_THRESHOLD_US && j2 > 100000;
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
        public boolean shouldIgnoreFrame(long j, long j2, long j3, boolean z, boolean z2) {
            return false;
        }

        private CompositionFrameTimingEvaluator() {
        }
    }

    final class PlayerListener implements Player.Listener {
        private final int playerIndex;

        public PlayerListener(int i) {
            this.playerIndex = i;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(CompositionPlayer.SUPPORTED_LISTENER_EVENTS)) {
                CompositionPlayer.this.invalidateState();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(boolean z, int i) {
            CompositionPlayer.this.playWhenReadyChangeReason = i;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(PlaybackException playbackException) {
            CompositionPlayer.this.maybeUpdatePlaybackError("error from player " + this.playerIndex, playbackException, playbackException.errorCode);
        }
    }

    static final class CompositionTrackSelector extends DefaultTrackSelector {
        private static final String SILENCE_AUDIO_TRACK_GROUP_ID = "1:";

        public CompositionTrackSelector(Context context) {
            super(context);
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector
        public Pair<ExoTrackSelection.Definition, Integer> selectAudioTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, DefaultTrackSelector.Parameters parameters) throws ExoPlaybackException {
            int i = 0;
            while (true) {
                if (i >= mappedTrackInfo.getRendererCount()) {
                    i = -1;
                    break;
                }
                if (mappedTrackInfo.getRendererType(i) == 1) {
                    break;
                }
                i++;
            }
            Assertions.checkState(i != -1);
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
            if (trackGroups.length > 1) {
                boolean z = false;
                int i2 = -1;
                for (int i3 = 0; i3 < trackGroups.length; i3++) {
                    if (trackGroups.get(i3).id.startsWith(SILENCE_AUDIO_TRACK_GROUP_ID)) {
                        i2 = i3;
                    } else {
                        for (int i4 = 0; i4 < trackGroups.get(i3).length; i4++) {
                            z |= RendererCapabilities.getFormatSupport(iArr[i][i3][i4]) == 4;
                        }
                    }
                }
                Assertions.checkState(i2 != -1);
                if (z) {
                    iArr[i][trackGroups.length - 1][0] = RendererCapabilities.create(0);
                }
            }
            return super.selectAudioTrack(mappedTrackInfo, iArr, iArr2, parameters);
        }
    }
}
