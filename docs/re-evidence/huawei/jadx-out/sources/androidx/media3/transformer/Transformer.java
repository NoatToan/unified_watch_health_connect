package androidx.media3.transformer;

import android.content.Context;
import android.os.Looper;
import androidx.media3.common.C;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Util;
import androidx.media3.effect.DebugTraceUtil;
import androidx.media3.effect.DefaultVideoFrameProcessor;
import androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda0;
import androidx.media3.muxer.Muxer;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aqt;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public final class Transformer {
    public static final long DEFAULT_MAX_DELAY_BETWEEN_MUXER_SAMPLES_MS = 10000;
    public static final int PROGRESS_STATE_AVAILABLE = 2;
    public static final int PROGRESS_STATE_NOT_STARTED = 0;

    @Deprecated
    public static final int PROGRESS_STATE_NO_TRANSFORMATION = 0;
    public static final int PROGRESS_STATE_UNAVAILABLE = 3;
    public static final int PROGRESS_STATE_WAITING_FOR_AVAILABILITY = 1;
    private static final int TRANSFORMER_STATE_COPY_OUTPUT = 4;
    private static final int TRANSFORMER_STATE_PROCESS_AUDIO = 3;
    private static final int TRANSFORMER_STATE_PROCESS_FULL_INPUT = 0;
    private static final int TRANSFORMER_STATE_PROCESS_MEDIA_START = 5;
    private static final int TRANSFORMER_STATE_PROCESS_REMAINING_VIDEO = 2;
    private static final int TRANSFORMER_STATE_REMUX_PROCESSED_VIDEO = 1;
    private static final int TRANSFORMER_STATE_REMUX_REMAINING_MEDIA = 6;
    private final HandlerWrapper applicationHandler;
    private final AssetLoader.Factory assetLoaderFactory;
    private final AudioMixer.Factory audioMixerFactory;
    private final ImmutableList<AudioProcessor> audioProcessors;
    private final Clock clock;
    private final ComponentListener componentListener;
    private Composition composition;
    private final Context context;
    private ListenableFuture<Void> copyOutputFuture;
    private final DebugViewProvider debugViewProvider;
    private final Codec.EncoderFactory encoderFactory;
    private final ExportResult.Builder exportResultBuilder;
    private final boolean fileStartsOnVideoFrameEnabled;
    private final boolean flattenForSlowMotion;
    private ListenableFuture<TransmuxTranscodeHelper.ResumeMetadata> getResumeMetadataFuture;
    private final ListenerSet<Listener> listeners;
    private final Looper looper;
    private final long maxDelayBetweenMuxerSamplesMs;
    private Mp4Info mediaItemInfo;
    private final Muxer.Factory muxerFactory;
    private String oldFilePath;
    private String outputFilePath;
    private final boolean removeAudio;
    private final boolean removeVideo;
    private MuxerWrapper remuxingMuxerWrapper;
    private TransmuxTranscodeHelper.ResumeMetadata resumeMetadata;
    private final TransformationRequest transformationRequest;
    private TransformerInternal transformerInternal;
    private int transformerState;
    private final boolean trimOptimizationEnabled;
    private final ImmutableList<Effect> videoEffects;
    private final VideoFrameProcessor.Factory videoFrameProcessorFactory;

    /* JADX INFO: loaded from: classes3.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProgressState {
    }

    static {
        MediaLibraryInfo.registerModule("media3.transformer");
    }

    public static final class Builder {
        private AssetLoader.Factory assetLoaderFactory;
        private String audioMimeType;
        private AudioMixer.Factory audioMixerFactory;
        private ImmutableList<AudioProcessor> audioProcessors;
        private Clock clock;
        private final Context context;
        private DebugViewProvider debugViewProvider;
        private Codec.EncoderFactory encoderFactory;
        private boolean fileStartsOnVideoFrameEnabled;
        private boolean flattenForSlowMotion;
        private ListenerSet<Listener> listeners;
        private Looper looper;
        private long maxDelayBetweenMuxerSamplesMs;
        private Muxer.Factory muxerFactory;
        private boolean removeAudio;
        private boolean removeVideo;
        private TransformationRequest transformationRequest;
        private boolean trimOptimizationEnabled;
        private ImmutableList<Effect> videoEffects;
        private VideoFrameProcessor.Factory videoFrameProcessorFactory;
        private String videoMimeType;

        static /* synthetic */ void lambda$new$0(Listener listener, FlagSet flagSet) {
        }

        static /* synthetic */ void lambda$setClock$2(Listener listener, FlagSet flagSet) {
        }

        static /* synthetic */ void lambda$setLooper$1(Listener listener, FlagSet flagSet) {
        }

        public Builder(Context context) {
            Context applicationContext = context.getApplicationContext();
            this.context = applicationContext;
            this.maxDelayBetweenMuxerSamplesMs = 10000L;
            this.audioProcessors = ImmutableList.of();
            this.videoEffects = ImmutableList.of();
            this.audioMixerFactory = new DefaultAudioMixer.Factory();
            this.videoFrameProcessorFactory = new DefaultVideoFrameProcessor.Factory.Builder().build();
            this.encoderFactory = new DefaultEncoderFactory.Builder(applicationContext).build();
            this.muxerFactory = new DefaultMuxer.Factory();
            this.looper = Util.getCurrentOrMainLooper();
            this.debugViewProvider = DebugViewProvider.NONE;
            this.clock = Clock.DEFAULT;
            this.listeners = new ListenerSet<>(this.looper, this.clock, new ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.transformer.Transformer$Builder$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
                public final void invoke(Object obj, FlagSet flagSet) {
                    Transformer.Builder.lambda$new$0((Transformer.Listener) obj, flagSet);
                }
            });
        }

        private Builder(Transformer transformer) {
            this.context = transformer.context;
            this.audioMimeType = transformer.transformationRequest.audioMimeType;
            this.videoMimeType = transformer.transformationRequest.videoMimeType;
            this.transformationRequest = transformer.transformationRequest;
            this.audioProcessors = transformer.audioProcessors;
            this.videoEffects = transformer.videoEffects;
            this.removeAudio = transformer.removeAudio;
            this.removeVideo = transformer.removeVideo;
            this.trimOptimizationEnabled = transformer.trimOptimizationEnabled;
            this.fileStartsOnVideoFrameEnabled = transformer.fileStartsOnVideoFrameEnabled;
            this.maxDelayBetweenMuxerSamplesMs = transformer.maxDelayBetweenMuxerSamplesMs;
            this.listeners = transformer.listeners;
            this.assetLoaderFactory = transformer.assetLoaderFactory;
            this.audioMixerFactory = transformer.audioMixerFactory;
            this.videoFrameProcessorFactory = transformer.videoFrameProcessorFactory;
            this.encoderFactory = transformer.encoderFactory;
            this.muxerFactory = transformer.muxerFactory;
            this.looper = transformer.looper;
            this.debugViewProvider = transformer.debugViewProvider;
            this.clock = transformer.clock;
        }

        public Builder setAudioMimeType(String str) {
            String strNormalizeMimeType = MimeTypes.normalizeMimeType(str);
            Assertions.checkArgument(MimeTypes.isAudio(strNormalizeMimeType), "Not an audio MIME type: " + strNormalizeMimeType);
            this.audioMimeType = strNormalizeMimeType;
            return this;
        }

        public Builder setVideoMimeType(String str) {
            String strNormalizeMimeType = MimeTypes.normalizeMimeType(str);
            Assertions.checkArgument(MimeTypes.isVideo(strNormalizeMimeType), "Not a video MIME type: " + strNormalizeMimeType);
            this.videoMimeType = strNormalizeMimeType;
            return this;
        }

        @Deprecated
        public Builder setTransformationRequest(TransformationRequest transformationRequest) {
            this.transformationRequest = transformationRequest;
            return this;
        }

        @Deprecated
        public Builder setAudioProcessors(List<AudioProcessor> list) {
            this.audioProcessors = ImmutableList.copyOf((Collection) list);
            return this;
        }

        @Deprecated
        public Builder setVideoEffects(List<Effect> list) {
            this.videoEffects = ImmutableList.copyOf((Collection) list);
            return this;
        }

        @Deprecated
        public Builder setRemoveAudio(boolean z) {
            this.removeAudio = z;
            return this;
        }

        @Deprecated
        public Builder setRemoveVideo(boolean z) {
            this.removeVideo = z;
            return this;
        }

        @Deprecated
        public Builder setFlattenForSlowMotion(boolean z) {
            this.flattenForSlowMotion = z;
            return this;
        }

        public Builder experimentalSetTrimOptimizationEnabled(boolean z) {
            this.trimOptimizationEnabled = z;
            return this;
        }

        public Builder setEnsureFileStartsOnVideoFrameEnabled(boolean z) {
            this.fileStartsOnVideoFrameEnabled = z;
            return this;
        }

        public Builder setMaxDelayBetweenMuxerSamplesMs(long j) {
            this.maxDelayBetweenMuxerSamplesMs = j;
            return this;
        }

        @Deprecated
        public Builder setListener(Listener listener) {
            this.listeners.clear();
            this.listeners.add(listener);
            return this;
        }

        public Builder addListener(Listener listener) {
            this.listeners.add(listener);
            return this;
        }

        public Builder removeListener(Listener listener) {
            this.listeners.remove(listener);
            return this;
        }

        public Builder removeAllListeners() {
            this.listeners.clear();
            return this;
        }

        public Builder setAssetLoaderFactory(AssetLoader.Factory factory) {
            this.assetLoaderFactory = factory;
            return this;
        }

        public Builder setAudioMixerFactory(AudioMixer.Factory factory) {
            this.audioMixerFactory = factory;
            return this;
        }

        public Builder setVideoFrameProcessorFactory(VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
            return this;
        }

        public Builder setEncoderFactory(Codec.EncoderFactory encoderFactory) {
            this.encoderFactory = encoderFactory;
            return this;
        }

        public Builder setMuxerFactory(Muxer.Factory factory) {
            this.muxerFactory = factory;
            return this;
        }

        public Builder setLooper(Looper looper) {
            this.looper = looper;
            this.listeners = this.listeners.copy(looper, new ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.transformer.Transformer$Builder$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
                public final void invoke(Object obj, FlagSet flagSet) {
                    Transformer.Builder.lambda$setLooper$1((Transformer.Listener) obj, flagSet);
                }
            });
            return this;
        }

        public Builder setDebugViewProvider(DebugViewProvider debugViewProvider) {
            this.debugViewProvider = debugViewProvider;
            return this;
        }

        Builder setClock(Clock clock) {
            this.clock = clock;
            this.listeners = this.listeners.copy(this.looper, clock, new ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.transformer.Transformer$Builder$$ExternalSyntheticLambda2
                @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
                public final void invoke(Object obj, FlagSet flagSet) {
                    Transformer.Builder.lambda$setClock$2((Transformer.Listener) obj, flagSet);
                }
            });
            return this;
        }

        public Transformer build() {
            TransformationRequest.Builder builderBuildUpon;
            TransformationRequest transformationRequest = this.transformationRequest;
            if (transformationRequest == null) {
                builderBuildUpon = new TransformationRequest.Builder();
            } else {
                builderBuildUpon = transformationRequest.buildUpon();
            }
            String str = this.audioMimeType;
            if (str != null) {
                builderBuildUpon.setAudioMimeType(str);
            }
            String str2 = this.videoMimeType;
            if (str2 != null) {
                builderBuildUpon.setVideoMimeType(str2);
            }
            TransformationRequest transformationRequestBuild = builderBuildUpon.build();
            this.transformationRequest = transformationRequestBuild;
            if (transformationRequestBuild.audioMimeType != null) {
                checkSampleMimeType(this.transformationRequest.audioMimeType);
            }
            if (this.transformationRequest.videoMimeType != null) {
                checkSampleMimeType(this.transformationRequest.videoMimeType);
            }
            return new Transformer(this.context, this.transformationRequest, this.audioProcessors, this.videoEffects, this.removeAudio, this.removeVideo, this.flattenForSlowMotion, this.trimOptimizationEnabled, this.fileStartsOnVideoFrameEnabled, this.maxDelayBetweenMuxerSamplesMs, this.listeners, this.assetLoaderFactory, this.audioMixerFactory, this.videoFrameProcessorFactory, this.encoderFactory, this.muxerFactory, this.looper, this.debugViewProvider, this.clock);
        }

        private void checkSampleMimeType(String str) {
            Assertions.checkState(this.muxerFactory.getSupportedSampleMimeTypes(MimeTypes.getTrackType(str)).contains(str), "Unsupported sample MIME type " + str);
        }
    }

    public interface Listener {
        @Deprecated
        default void onFallbackApplied(MediaItem mediaItem, TransformationRequest transformationRequest, TransformationRequest transformationRequest2) {
        }

        @Deprecated
        default void onTransformationCompleted(MediaItem mediaItem) {
        }

        @Deprecated
        default void onTransformationError(MediaItem mediaItem, Exception exc) {
        }

        @Deprecated
        default void onTransformationCompleted(MediaItem mediaItem, TransformationResult transformationResult) {
            onTransformationCompleted(mediaItem);
        }

        default void onCompleted(Composition composition, ExportResult exportResult) {
            onTransformationCompleted(composition.sequences.get(0).editedMediaItems.get(0).mediaItem, new TransformationResult.Builder(exportResult).build());
        }

        @Deprecated
        default void onTransformationError(MediaItem mediaItem, TransformationException transformationException) {
            onTransformationError(mediaItem, (Exception) transformationException);
        }

        @Deprecated
        default void onTransformationError(MediaItem mediaItem, TransformationResult transformationResult, TransformationException transformationException) {
            onTransformationError(mediaItem, transformationException);
        }

        default void onError(Composition composition, ExportResult exportResult, ExportException exportException) {
            onTransformationError(composition.sequences.get(0).editedMediaItems.get(0).mediaItem, new TransformationResult.Builder(exportResult).build(), new TransformationException(exportException));
        }

        default void onFallbackApplied(Composition composition, TransformationRequest transformationRequest, TransformationRequest transformationRequest2) {
            onFallbackApplied(composition.sequences.get(0).editedMediaItems.get(0).mediaItem, transformationRequest, transformationRequest2);
        }
    }

    private Transformer(Context context, TransformationRequest transformationRequest, ImmutableList<AudioProcessor> immutableList, ImmutableList<Effect> immutableList2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, ListenerSet<Listener> listenerSet, AssetLoader.Factory factory, AudioMixer.Factory factory2, VideoFrameProcessor.Factory factory3, Codec.EncoderFactory encoderFactory, Muxer.Factory factory4, Looper looper, DebugViewProvider debugViewProvider, Clock clock) {
        Assertions.checkState((z && z2) ? false : true, "Audio and video cannot both be removed.");
        this.context = context;
        this.transformationRequest = transformationRequest;
        this.audioProcessors = immutableList;
        this.videoEffects = immutableList2;
        this.removeAudio = z;
        this.removeVideo = z2;
        this.flattenForSlowMotion = z3;
        this.trimOptimizationEnabled = z4;
        this.fileStartsOnVideoFrameEnabled = z5;
        this.maxDelayBetweenMuxerSamplesMs = j;
        this.listeners = listenerSet;
        this.assetLoaderFactory = factory;
        this.audioMixerFactory = factory2;
        this.videoFrameProcessorFactory = factory3;
        this.encoderFactory = encoderFactory;
        this.muxerFactory = factory4;
        this.looper = looper;
        this.debugViewProvider = debugViewProvider;
        this.clock = clock;
        this.transformerState = 0;
        this.applicationHandler = clock.createHandler(looper, null);
        this.componentListener = new ComponentListener();
        this.exportResultBuilder = new ExportResult.Builder();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    @Deprecated
    public void setListener(Listener listener) {
        verifyApplicationThread();
        this.listeners.clear();
        this.listeners.add(listener);
    }

    public void addListener(Listener listener) {
        verifyApplicationThread();
        this.listeners.add(listener);
    }

    public void removeListener(Listener listener) {
        verifyApplicationThread();
        this.listeners.remove(listener);
    }

    public void removeAllListeners() {
        verifyApplicationThread();
        this.listeners.clear();
    }

    public void start(Composition composition, String str) {
        verifyApplicationThread();
        initialize(composition, str);
        if (!this.trimOptimizationEnabled || isMultiAsset()) {
            startInternal(composition, new MuxerWrapper(str, this.muxerFactory, this.componentListener, 0, this.fileStartsOnVideoFrameEnabled, null, this.maxDelayBetweenMuxerSamplesMs), this.componentListener, 0L, false);
        } else {
            processMediaBeforeFirstSyncSampleAfterTrimStartTime();
        }
    }

    public void start(EditedMediaItem editedMediaItem, String str) {
        start(new Composition.Builder(new EditedMediaItemSequence(editedMediaItem, new EditedMediaItem[0]), new EditedMediaItemSequence[0]).build(), str);
    }

    public void start(MediaItem mediaItem, String str) {
        if (!mediaItem.clippingConfiguration.equals(MediaItem.ClippingConfiguration.UNSET) && this.flattenForSlowMotion) {
            throw new IllegalArgumentException("Clipping is not supported when slow motion flattening is requested");
        }
        start(new EditedMediaItem.Builder(mediaItem).setRemoveAudio(this.removeAudio).setRemoveVideo(this.removeVideo).setFlattenForSlowMotion(this.flattenForSlowMotion).setEffects(new Effects(this.audioProcessors, this.videoEffects)).build(), str);
    }

    @Deprecated
    public void startTransformation(MediaItem mediaItem, String str) {
        start(mediaItem, str);
    }

    public Looper getApplicationLooper() {
        return this.looper;
    }

    public int getProgress(ProgressHolder progressHolder) {
        verifyApplicationThread();
        if (isExportResumed()) {
            return 3;
        }
        if (isExportTrimOptimization()) {
            return getTrimOptimizationProgress(progressHolder);
        }
        TransformerInternal transformerInternal = this.transformerInternal;
        if (transformerInternal == null) {
            return 0;
        }
        return transformerInternal.getProgress(progressHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isExportResumed() {
        int i = this.transformerState;
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isExportTrimOptimization() {
        int i = this.transformerState;
        return i == 5 || i == 6;
    }

    private int getTrimOptimizationProgress(ProgressHolder progressHolder) {
        int progress;
        if (this.mediaItemInfo == null) {
            return 1;
        }
        float f = (this.mediaItemInfo.firstSyncSampleTimestampUsAfterTimeUs - ((Composition) Assertions.checkNotNull(this.composition)).sequences.get(0).editedMediaItems.get(0).mediaItem.clippingConfiguration.startPositionUs) / this.mediaItemInfo.durationUs;
        if (this.transformerState == 5) {
            TransformerInternal transformerInternal = this.transformerInternal;
            if (transformerInternal == null || (progress = transformerInternal.getProgress(progressHolder)) == 0 || progress == 1) {
                return 1;
            }
            if (progress == 2) {
                progressHolder.progress = Math.round(progressHolder.progress * f);
                return 2;
            }
            if (progress == 3) {
                return 3;
            }
            throw new IllegalStateException();
        }
        float f2 = 100.0f * f;
        TransformerInternal transformerInternal2 = this.transformerInternal;
        if (transformerInternal2 == null) {
            progressHolder.progress = Math.round(f2);
            return 2;
        }
        int progress2 = transformerInternal2.getProgress(progressHolder);
        if (progress2 == 0 || progress2 == 1) {
            progressHolder.progress = Math.round(f2);
            return 2;
        }
        if (progress2 == 2) {
            progressHolder.progress = Math.round(f2 + ((1.0f - f) * progressHolder.progress));
            return 2;
        }
        if (progress2 == 3) {
            return 3;
        }
        throw new IllegalStateException();
    }

    public void cancel() {
        verifyApplicationThread();
        TransformerInternal transformerInternal = this.transformerInternal;
        if (transformerInternal == null) {
            return;
        }
        try {
            transformerInternal.cancel();
            this.transformerInternal = null;
            ListenableFuture<TransmuxTranscodeHelper.ResumeMetadata> listenableFuture = this.getResumeMetadataFuture;
            if (listenableFuture != null && !listenableFuture.isDone()) {
                this.getResumeMetadataFuture.cancel(false);
            }
            ListenableFuture<Void> listenableFuture2 = this.copyOutputFuture;
            if (listenableFuture2 == null || listenableFuture2.isDone()) {
                return;
            }
            this.copyOutputFuture.cancel(false);
        } catch (Throwable th) {
            this.transformerInternal = null;
            throw th;
        }
    }

    public void resume(Composition composition, String str, String str2) {
        verifyApplicationThread();
        initialize(composition, str);
        this.oldFilePath = str2;
        remuxProcessedVideo();
    }

    private void initialize(Composition composition, String str) {
        this.composition = composition;
        this.outputFilePath = str;
        this.exportResultBuilder.reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processFullInput() {
        this.transformerState = 0;
        startInternal((Composition) Assertions.checkNotNull(this.composition), new MuxerWrapper((String) Assertions.checkNotNull(this.outputFilePath), this.muxerFactory, this.componentListener, 0, false, null, this.maxDelayBetweenMuxerSamplesMs), this.componentListener, 0L, false);
    }

    private void remuxProcessedVideo() {
        this.transformerState = 1;
        ListenableFuture<TransmuxTranscodeHelper.ResumeMetadata> resumeMetadataAsync = TransmuxTranscodeHelper.getResumeMetadataAsync(this.context, (String) Assertions.checkNotNull(this.oldFilePath), (Composition) Assertions.checkNotNull(this.composition));
        this.getResumeMetadataFuture = resumeMetadataAsync;
        FutureCallback<TransmuxTranscodeHelper.ResumeMetadata> futureCallback = new FutureCallback<TransmuxTranscodeHelper.ResumeMetadata>() { // from class: androidx.media3.transformer.Transformer.1
            @Override // com.google.common.util.concurrent.FutureCallback
            public void onSuccess(TransmuxTranscodeHelper.ResumeMetadata resumeMetadata) {
                if (resumeMetadata.lastSyncSampleTimestampUs == C.TIME_UNSET || resumeMetadata.lastSyncSampleTimestampUs == 0) {
                    Transformer.this.processFullInput();
                    return;
                }
                Transformer.this.resumeMetadata = resumeMetadata;
                Transformer transformer = Transformer.this;
                transformer.remuxingMuxerWrapper = new MuxerWrapper((String) Assertions.checkNotNull(transformer.outputFilePath), Transformer.this.muxerFactory, Transformer.this.componentListener, 1, false, resumeMetadata.videoFormat, Transformer.this.maxDelayBetweenMuxerSamplesMs);
                Transformer transformer2 = Transformer.this;
                transformer2.startInternal(TransmuxTranscodeHelper.createVideoOnlyComposition(transformer2.oldFilePath, resumeMetadata.lastSyncSampleTimestampUs), (MuxerWrapper) Assertions.checkNotNull(Transformer.this.remuxingMuxerWrapper), Transformer.this.componentListener, 0L, true);
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(Throwable th) {
                Transformer.this.processFullInput();
            }
        };
        HandlerWrapper handlerWrapper = this.applicationHandler;
        Objects.requireNonNull(handlerWrapper);
        aqt.e(resumeMetadataAsync, futureCallback, new CompositingVideoSinkProvider$$ExternalSyntheticLambda0(handlerWrapper));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processRemainingVideo() {
        this.transformerState = 2;
        Composition compositionBuildUponComposition = TransmuxTranscodeHelper.buildUponComposition((Composition) Assertions.checkNotNull(this.composition), true, false, this.resumeMetadata);
        Assertions.checkNotNull(this.remuxingMuxerWrapper);
        this.remuxingMuxerWrapper.changeToAppendMode();
        startInternal(compositionBuildUponComposition, this.remuxingMuxerWrapper, this.componentListener, ((TransmuxTranscodeHelper.ResumeMetadata) Assertions.checkNotNull(this.resumeMetadata)).lastSyncSampleTimestampUs, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processAudio() {
        this.transformerState = 3;
        startInternal(TransmuxTranscodeHelper.createAudioTranscodeAndVideoTransmuxComposition((Composition) Assertions.checkNotNull(this.composition), (String) Assertions.checkNotNull(this.outputFilePath)), new MuxerWrapper((String) Assertions.checkNotNull(this.oldFilePath), this.muxerFactory, this.componentListener, 0, false, null, this.maxDelayBetweenMuxerSamplesMs), this.componentListener, 0L, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void copyOutput() {
        this.transformerState = 4;
        ListenableFuture<Void> listenableFutureCopyFileAsync = TransmuxTranscodeHelper.copyFileAsync(new File((String) Assertions.checkNotNull(this.oldFilePath)), new File((String) Assertions.checkNotNull(this.outputFilePath)));
        this.copyOutputFuture = listenableFutureCopyFileAsync;
        FutureCallback<Void> futureCallback = new FutureCallback<Void>() { // from class: androidx.media3.transformer.Transformer.2
            @Override // com.google.common.util.concurrent.FutureCallback
            public void onSuccess(Void r1) {
                Transformer.this.onExportCompletedWithSuccess();
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(Throwable th) {
                Transformer.this.onExportCompletedWithError(ExportException.createForUnexpected(new IOException("Copy output task failed for the resumed export", th)));
            }
        };
        HandlerWrapper handlerWrapper = this.applicationHandler;
        Objects.requireNonNull(handlerWrapper);
        aqt.e(listenableFutureCopyFileAsync, futureCallback, new CompositingVideoSinkProvider$$ExternalSyntheticLambda0(handlerWrapper));
    }

    private void processMediaBeforeFirstSyncSampleAfterTrimStartTime() {
        this.transformerState = 5;
        final EditedMediaItem editedMediaItem = ((Composition) Assertions.checkNotNull(this.composition)).sequences.get(0).editedMediaItems.get(0);
        final long j = editedMediaItem.mediaItem.clippingConfiguration.startPositionUs;
        final long j2 = editedMediaItem.mediaItem.clippingConfiguration.endPositionUs;
        ListenableFuture<Mp4Info> mp4Info = TransmuxTranscodeHelper.getMp4Info(this.context, ((MediaItem.LocalConfiguration) Assertions.checkNotNull(editedMediaItem.mediaItem.localConfiguration)).uri.toString(), j);
        FutureCallback<Mp4Info> futureCallback = new FutureCallback<Mp4Info>() { // from class: androidx.media3.transformer.Transformer.3
            @Override // com.google.common.util.concurrent.FutureCallback
            public void onSuccess(Mp4Info mp4Info2) {
                if (mp4Info2.firstSyncSampleTimestampUsAfterTimeUs == C.TIME_UNSET) {
                    Transformer.this.exportResultBuilder.setOptimizationResult(4);
                    Transformer.this.processFullInput();
                    return;
                }
                if (mp4Info2.firstSyncSampleTimestampUsAfterTimeUs != Long.MIN_VALUE) {
                    long j3 = j2;
                    if (j3 == Long.MIN_VALUE || j3 >= mp4Info2.firstSyncSampleTimestampUsAfterTimeUs) {
                        if (mp4Info2.firstSyncSampleTimestampUsAfterTimeUs - j <= ((mp4Info2.audioFormat == null || mp4Info2.audioFormat.sampleRate == -1) ? 0L : Util.sampleCountToDurationUs(1024L, mp4Info2.audioFormat.sampleRate))) {
                            Transformer transformer = Transformer.this;
                            transformer.composition = TransmuxTranscodeHelper.buildUponCompositionForTrimOptimization(transformer.composition, mp4Info2.firstSyncSampleTimestampUsAfterTimeUs, j2, mp4Info2.durationUs, true, false);
                            Transformer.this.exportResultBuilder.setOptimizationResult(2);
                            Transformer.this.processFullInput();
                            return;
                        }
                        Transformer transformer2 = Transformer.this;
                        transformer2.remuxingMuxerWrapper = new MuxerWrapper((String) Assertions.checkNotNull(transformer2.outputFilePath), Transformer.this.muxerFactory, Transformer.this.componentListener, 1, false, mp4Info2.videoFormat, Transformer.this.maxDelayBetweenMuxerSamplesMs);
                        if (TransformerUtil.shouldTranscodeVideo((Format) Assertions.checkNotNull(mp4Info2.videoFormat), Transformer.this.composition, 0, Transformer.this.transformationRequest, Transformer.this.encoderFactory, Transformer.this.remuxingMuxerWrapper) || (mp4Info2.audioFormat != null && TransformerUtil.shouldTranscodeAudio(mp4Info2.audioFormat, Transformer.this.composition, 0, Transformer.this.transformationRequest, Transformer.this.encoderFactory, Transformer.this.remuxingMuxerWrapper))) {
                            Transformer.this.remuxingMuxerWrapper = null;
                            Transformer.this.exportResultBuilder.setOptimizationResult(3);
                            Transformer.this.processFullInput();
                            return;
                        } else {
                            Transformer.this.mediaItemInfo = mp4Info2;
                            TransformerUtil.maybeSetMuxerWrapperAdditionalRotationDegrees(Transformer.this.remuxingMuxerWrapper, editedMediaItem.effects.videoEffects, (Format) Assertions.checkNotNull(mp4Info2.videoFormat));
                            Composition compositionBuildUponCompositionForTrimOptimization = TransmuxTranscodeHelper.buildUponCompositionForTrimOptimization(Transformer.this.composition, j, mp4Info2.firstSyncSampleTimestampUsAfterTimeUs, mp4Info2.durationUs, false, true);
                            Transformer transformer3 = Transformer.this;
                            transformer3.startInternal(compositionBuildUponCompositionForTrimOptimization, (MuxerWrapper) Assertions.checkNotNull(transformer3.remuxingMuxerWrapper), Transformer.this.componentListener, 0L, false);
                            return;
                        }
                    }
                }
                Transformer.this.exportResultBuilder.setOptimizationResult(2);
                Transformer.this.processFullInput();
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(Throwable th) {
                Transformer.this.exportResultBuilder.setOptimizationResult(5);
                Transformer.this.processFullInput();
            }
        };
        HandlerWrapper handlerWrapper = this.applicationHandler;
        Objects.requireNonNull(handlerWrapper);
        aqt.e(mp4Info, futureCallback, new CompositingVideoSinkProvider$$ExternalSyntheticLambda0(handlerWrapper));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void remuxRemainingMedia() {
        this.transformerState = 6;
        EditedMediaItem editedMediaItem = ((Composition) Assertions.checkNotNull(this.composition)).sequences.get(0).editedMediaItems.get(0);
        Mp4Info mp4Info = (Mp4Info) Assertions.checkNotNull(this.mediaItemInfo);
        long j = editedMediaItem.mediaItem.clippingConfiguration.startPositionUs;
        Composition compositionBuildUponCompositionForTrimOptimization = TransmuxTranscodeHelper.buildUponCompositionForTrimOptimization(this.composition, mp4Info.firstSyncSampleTimestampUsAfterTimeUs, editedMediaItem.mediaItem.clippingConfiguration.endPositionUs, mp4Info.durationUs, true, true);
        Assertions.checkNotNull(this.remuxingMuxerWrapper);
        this.remuxingMuxerWrapper.changeToAppendMode();
        startInternal(compositionBuildUponCompositionForTrimOptimization, this.remuxingMuxerWrapper, this.componentListener, mp4Info.firstSyncSampleTimestampUsAfterTimeUs - j, false);
    }

    private boolean isMultiAsset() {
        return ((Composition) Assertions.checkNotNull(this.composition)).sequences.size() > 1 || this.composition.sequences.get(0).editedMediaItems.size() > 1;
    }

    private void verifyApplicationThread() {
        if (Looper.myLooper() != this.looper) {
            throw new IllegalStateException("Transformer is accessed on the wrong thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInternal(Composition composition, MuxerWrapper muxerWrapper, ComponentListener componentListener, long j, boolean z) {
        Assertions.checkState(this.transformerInternal == null, "There is already an export in progress.");
        TransformationRequest transformationRequestBuild = this.transformationRequest;
        if (composition.hdrMode != 0) {
            transformationRequestBuild = transformationRequestBuild.buildUpon().setHdrMode(composition.hdrMode).build();
        }
        TransformationRequest transformationRequest = transformationRequestBuild;
        FallbackListener fallbackListener = new FallbackListener(composition, this.listeners, this.applicationHandler, transformationRequest);
        AssetLoader.Factory defaultAssetLoaderFactory = this.assetLoaderFactory;
        if (z || defaultAssetLoaderFactory == null) {
            Context context = this.context;
            defaultAssetLoaderFactory = new DefaultAssetLoaderFactory(context, new DefaultDecoderFactory(context), this.clock);
        }
        DebugTraceUtil.reset();
        TransformerInternal transformerInternal = new TransformerInternal(this.context, composition, transformationRequest, defaultAssetLoaderFactory, this.audioMixerFactory, this.videoFrameProcessorFactory, this.encoderFactory, muxerWrapper, componentListener, fallbackListener, this.applicationHandler, this.debugViewProvider, this.clock, j);
        this.transformerInternal = transformerInternal;
        transformerInternal.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExportCompletedWithSuccess() {
        this.listeners.queueEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.transformer.Transformer$$ExternalSyntheticLambda1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                this.f$0.m681xbb46ef5((Transformer.Listener) obj);
            }
        });
        this.listeners.flushEvents();
        this.transformerState = 0;
    }

    /* JADX INFO: renamed from: lambda$onExportCompletedWithSuccess$0$androidx-media3-transformer-Transformer, reason: not valid java name */
    /* synthetic */ void m681xbb46ef5(Listener listener) {
        listener.onCompleted((Composition) Assertions.checkNotNull(this.composition), this.exportResultBuilder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExportCompletedWithError(final ExportException exportException) {
        this.listeners.queueEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.transformer.Transformer$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                this.f$0.m680x46be917b(exportException, (Transformer.Listener) obj);
            }
        });
        this.listeners.flushEvents();
        this.transformerState = 0;
    }

    /* JADX INFO: renamed from: lambda$onExportCompletedWithError$1$androidx-media3-transformer-Transformer, reason: not valid java name */
    /* synthetic */ void m680x46be917b(ExportException exportException, Listener listener) {
        listener.onError((Composition) Assertions.checkNotNull(this.composition), this.exportResultBuilder.build(), exportException);
    }

    final class ComponentListener implements TransformerInternal.Listener, MuxerWrapper.Listener {
        private ComponentListener() {
        }

        @Override // androidx.media3.transformer.TransformerInternal.Listener
        public void onCompleted(ImmutableList<ExportResult.ProcessedInput> immutableList, String str, String str2) {
            Transformer.this.exportResultBuilder.addProcessedInputs(immutableList);
            if (str != null) {
                Transformer.this.exportResultBuilder.setAudioEncoderName(str);
            }
            if (str2 != null) {
                Transformer.this.exportResultBuilder.setVideoEncoderName(str2);
            }
            Transformer.this.transformerInternal = null;
            if (Transformer.this.transformerState == 1) {
                Transformer.this.processRemainingVideo();
                return;
            }
            if (Transformer.this.transformerState == 2) {
                Transformer.this.remuxingMuxerWrapper = null;
                Transformer.this.processAudio();
                return;
            }
            if (Transformer.this.transformerState == 3) {
                Transformer.this.copyOutput();
                return;
            }
            if (Transformer.this.transformerState == 5) {
                Transformer.this.remuxRemainingMedia();
            } else {
                if (Transformer.this.transformerState == 6) {
                    Transformer.this.mediaItemInfo = null;
                    Transformer.this.exportResultBuilder.setOptimizationResult(1);
                    Transformer.this.onExportCompletedWithSuccess();
                    return;
                }
                Transformer.this.onExportCompletedWithSuccess();
            }
        }

        @Override // androidx.media3.transformer.TransformerInternal.Listener
        public void onError(ImmutableList<ExportResult.ProcessedInput> immutableList, String str, String str2, ExportException exportException) {
            if (exportException.errorCode != 7003 || (!Transformer.this.isExportTrimOptimization() && !Transformer.this.isExportResumed())) {
                Transformer.this.exportResultBuilder.addProcessedInputs(immutableList);
                if (str != null) {
                    Transformer.this.exportResultBuilder.setAudioEncoderName(str);
                }
                if (str2 != null) {
                    Transformer.this.exportResultBuilder.setVideoEncoderName(str2);
                }
                Transformer.this.exportResultBuilder.setExportException(exportException);
                Transformer.this.transformerInternal = null;
                Transformer.this.onExportCompletedWithError(exportException);
                return;
            }
            Transformer.this.remuxingMuxerWrapper = null;
            Transformer.this.transformerInternal = null;
            Transformer.this.exportResultBuilder.reset();
            Transformer.this.exportResultBuilder.setOptimizationResult(6);
            Transformer.this.processFullInput();
        }

        @Override // androidx.media3.transformer.MuxerWrapper.Listener
        public void onTrackEnded(int i, Format format, int i2, int i3) {
            if (i == 1) {
                Transformer.this.exportResultBuilder.setAudioMimeType(format.sampleMimeType).setAverageAudioBitrate(i2);
                if (format.channelCount != -1) {
                    Transformer.this.exportResultBuilder.setChannelCount(format.channelCount);
                }
                if (format.sampleRate != -1) {
                    Transformer.this.exportResultBuilder.setSampleRate(format.sampleRate);
                    return;
                }
                return;
            }
            if (i == 2) {
                Transformer.this.exportResultBuilder.setVideoMimeType(format.sampleMimeType).setAverageVideoBitrate(i2).setColorInfo(format.colorInfo).setVideoFrameCount(i3);
                if (format.height != -1) {
                    Transformer.this.exportResultBuilder.setHeight(format.height);
                }
                if (format.width != -1) {
                    Transformer.this.exportResultBuilder.setWidth(format.width);
                }
            }
        }

        @Override // androidx.media3.transformer.MuxerWrapper.Listener
        public void onEnded(long j, long j2) {
            Transformer.this.exportResultBuilder.setDurationMs(j).setFileSizeBytes(j2);
            ((TransformerInternal) Assertions.checkNotNull(Transformer.this.transformerInternal)).endWithCompletion();
        }

        @Override // androidx.media3.transformer.MuxerWrapper.Listener
        public void onError(ExportException exportException) {
            ((TransformerInternal) Assertions.checkNotNull(Transformer.this.transformerInternal)).endWithException(exportException);
        }
    }
}
