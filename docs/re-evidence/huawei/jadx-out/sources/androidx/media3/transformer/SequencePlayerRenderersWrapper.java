package androidx.media3.transformer;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ConstantRateTimestampIterator;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import androidx.media3.exoplayer.image.ImageDecoder;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.image.ImageRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.video.CompositingVideoSinkProvider;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.exoplayer.video.VideoFrameReleaseControl;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.VideoSinkProvider;
import com.google.common.collect.ImmutableList;
import defpackage.amn;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes21.dex */
final class SequencePlayerRenderersWrapper implements RenderersFactory {
    private static final int DEFAULT_FRAME_RATE = 30;
    private final CompositingVideoSinkProvider compositingVideoSinkProvider;
    private final Context context;
    private final ImageDecoder.Factory imageDecoderFactory;
    private final PreviewAudioPipeline previewAudioPipeline;
    private final EditedMediaItemSequence sequence;

    public static SequencePlayerRenderersWrapper create(Context context, EditedMediaItemSequence editedMediaItemSequence, PreviewAudioPipeline previewAudioPipeline, CompositingVideoSinkProvider compositingVideoSinkProvider, ImageDecoder.Factory factory) {
        return new SequencePlayerRenderersWrapper(context, editedMediaItemSequence, previewAudioPipeline, compositingVideoSinkProvider, factory);
    }

    public static SequencePlayerRenderersWrapper createForAudio(Context context, EditedMediaItemSequence editedMediaItemSequence, PreviewAudioPipeline previewAudioPipeline) {
        return new SequencePlayerRenderersWrapper(context, editedMediaItemSequence, previewAudioPipeline, null, null);
    }

    private SequencePlayerRenderersWrapper(Context context, EditedMediaItemSequence editedMediaItemSequence, PreviewAudioPipeline previewAudioPipeline, CompositingVideoSinkProvider compositingVideoSinkProvider, ImageDecoder.Factory factory) {
        this.context = context;
        this.sequence = editedMediaItemSequence;
        this.previewAudioPipeline = previewAudioPipeline;
        this.compositingVideoSinkProvider = compositingVideoSinkProvider;
        this.imageDecoderFactory = factory;
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SequenceAudioRenderer(this.context, this, handler, audioRendererEventListener, this.previewAudioPipeline.createInput()));
        if (this.compositingVideoSinkProvider != null) {
            arrayList.add(new SequenceVideoRenderer((Context) Assertions.checkStateNotNull(this.context), handler, videoRendererEventListener, this));
            arrayList.add(new SequenceImageRenderer(this));
        }
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getOffsetToCompositionTimeUs(int i, long j) {
        long presentationDurationUs = -j;
        if (i == 0) {
            presentationDurationUs -= this.sequence.editedMediaItems.get(0).mediaItem.clippingConfiguration.startPositionUs;
        }
        for (int i2 = 0; i2 < i; i2++) {
            presentationDurationUs += this.sequence.editedMediaItems.get(i2).getPresentationDurationUs();
        }
        return presentationDurationUs;
    }

    static final class SequenceAudioRenderer extends MediaCodecAudioRenderer {
        private final AudioGraphInputAudioSink audioSink;
        private EditedMediaItem pendingEditedMediaItem;
        private long pendingOffsetToCompositionTimeUs;
        private final SequencePlayerRenderersWrapper sequencePlayerRenderersWrapper;

        public SequenceAudioRenderer(Context context, SequencePlayerRenderersWrapper sequencePlayerRenderersWrapper, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioGraphInputAudioSink audioGraphInputAudioSink) {
            super(context, MediaCodecSelector.DEFAULT, handler, audioRendererEventListener, audioGraphInputAudioSink);
            this.sequencePlayerRenderersWrapper = sequencePlayerRenderersWrapper;
            this.audioSink = audioGraphInputAudioSink;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
        public void render(long j, long j2) throws ExoPlaybackException {
            super.render(j, j2);
            do {
                try {
                } catch (AudioSink.ConfigurationException | AudioSink.InitializationException | AudioSink.WriteException | ExportException e) {
                    throw createRendererException(e, null, 5002);
                }
            } while (this.sequencePlayerRenderersWrapper.previewAudioPipeline.processData());
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
        public void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException {
            Assertions.checkState(getTimeline().getWindowCount() == 1);
            int indexOfPeriod = getTimeline().getIndexOfPeriod(mediaPeriodId.periodUid);
            this.pendingEditedMediaItem = this.sequencePlayerRenderersWrapper.sequence.editedMediaItems.get(indexOfPeriod);
            this.pendingOffsetToCompositionTimeUs = this.sequencePlayerRenderersWrapper.getOffsetToCompositionTimeUs(indexOfPeriod, j2);
            super.onStreamChanged(formatArr, j, j2, mediaPeriodId);
        }

        @Override // androidx.media3.exoplayer.audio.MediaCodecAudioRenderer, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
        public void onProcessedStreamChange() {
            super.onProcessedStreamChange();
            onMediaItemChanged();
        }

        @Override // androidx.media3.exoplayer.audio.MediaCodecAudioRenderer, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
        public void onPositionReset(long j, boolean z) throws ExoPlaybackException {
            super.onPositionReset(j, z);
            onMediaItemChanged();
        }

        private void onMediaItemChanged() {
            EditedMediaItem editedMediaItem = (EditedMediaItem) Assertions.checkStateNotNull(this.pendingEditedMediaItem);
            this.audioSink.onMediaItemChanged(editedMediaItem, this.pendingOffsetToCompositionTimeUs, editedMediaItem == amn.a(this.sequencePlayerRenderersWrapper.sequence.editedMediaItems));
        }
    }

    static final class SequenceVideoRenderer extends MediaCodecVideoRenderer {
        private long offsetToCompositionTimeUs;
        private ImmutableList<Effect> pendingEffect;
        private final SequencePlayerRenderersWrapper sequencePlayerRenderersWrapper;
        private final VideoSink videoSink;

        public SequenceVideoRenderer(Context context, Handler handler, VideoRendererEventListener videoRendererEventListener, SequencePlayerRenderersWrapper sequencePlayerRenderersWrapper) {
            super(context, MediaCodecAdapter.Factory.getDefault(context), MediaCodecSelector.DEFAULT, 5000L, false, handler, videoRendererEventListener, 50, 30.0f, (VideoSinkProvider) Assertions.checkStateNotNull(sequencePlayerRenderersWrapper.compositingVideoSinkProvider));
            this.sequencePlayerRenderersWrapper = sequencePlayerRenderersWrapper;
            this.videoSink = ((CompositingVideoSinkProvider) Assertions.checkStateNotNull(sequencePlayerRenderersWrapper.compositingVideoSinkProvider)).getSink();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
        public void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException {
            Assertions.checkState(getTimeline().getWindowCount() == 1);
            super.onStreamChanged(formatArr, j, j2, mediaPeriodId);
            int indexOfPeriod = getTimeline().getIndexOfPeriod(mediaPeriodId.periodUid);
            this.offsetToCompositionTimeUs = this.sequencePlayerRenderersWrapper.getOffsetToCompositionTimeUs(indexOfPeriod, j2);
            this.pendingEffect = this.sequencePlayerRenderersWrapper.sequence.editedMediaItems.get(indexOfPeriod).effects.videoEffects;
        }

        @Override // androidx.media3.exoplayer.video.MediaCodecVideoRenderer
        public long getBufferTimestampAdjustmentUs() {
            return this.offsetToCompositionTimeUs;
        }

        @Override // androidx.media3.exoplayer.video.MediaCodecVideoRenderer
        public void onReadyToRegisterVideoSinkInputStream() {
            ImmutableList<Effect> immutableList = this.pendingEffect;
            if (immutableList != null) {
                this.videoSink.setPendingVideoEffects(immutableList);
                this.pendingEffect = null;
            }
        }
    }

    static final class SequenceImageRenderer extends ImageRenderer {
        private final CompositingVideoSinkProvider compositingVideoSinkProvider;
        private EditedMediaItem editedMediaItem;
        private boolean inputStreamPendingRegistration;
        private boolean mayRenderStartOfStream;
        private long offsetToCompositionTimeUs;
        private ExoPlaybackException pendingExoPlaybackException;
        private final SequencePlayerRenderersWrapper sequencePlayerRenderersWrapper;
        private long streamOffsetUs;
        private ConstantRateTimestampIterator timestampIterator;
        private ImmutableList<Effect> videoEffects;
        private final VideoFrameReleaseControl videoFrameReleaseControl;
        private final VideoSink videoSink;

        static /* synthetic */ void lambda$onEnabled$0(Runnable runnable) {
        }

        public SequenceImageRenderer(SequencePlayerRenderersWrapper sequencePlayerRenderersWrapper) {
            super((ImageDecoder.Factory) Assertions.checkStateNotNull(sequencePlayerRenderersWrapper.imageDecoderFactory), ImageOutput.NO_OP);
            this.sequencePlayerRenderersWrapper = sequencePlayerRenderersWrapper;
            CompositingVideoSinkProvider compositingVideoSinkProvider = (CompositingVideoSinkProvider) Assertions.checkStateNotNull(sequencePlayerRenderersWrapper.compositingVideoSinkProvider);
            this.compositingVideoSinkProvider = compositingVideoSinkProvider;
            this.videoSink = compositingVideoSinkProvider.getSink();
            this.videoFrameReleaseControl = (VideoFrameReleaseControl) Assertions.checkStateNotNull(compositingVideoSinkProvider.getVideoFrameReleaseControl());
            this.videoEffects = ImmutableList.of();
            this.streamOffsetUs = C.TIME_UNSET;
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer, androidx.media3.exoplayer.BaseRenderer
        public void onEnabled(boolean z, boolean z2) throws ExoPlaybackException {
            super.onEnabled(z, z2);
            this.mayRenderStartOfStream = z2;
            this.videoSink.onRendererEnabled(z2);
            if (z) {
                this.videoFrameReleaseControl.join(false);
            }
            if (!this.videoSink.isInitialized()) {
                Format formatBuild = new Format.Builder().build();
                try {
                    this.videoSink.initialize(formatBuild);
                } catch (VideoSink.VideoSinkException e) {
                    throw createRendererException(e, formatBuild, 7000);
                }
            }
            this.videoSink.setListener(VideoSink.Listener.NO_OP, new Executor() { // from class: androidx.media3.transformer.SequencePlayerRenderersWrapper$SequenceImageRenderer$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    SequencePlayerRenderersWrapper.SequenceImageRenderer.lambda$onEnabled$0(runnable);
                }
            });
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer, androidx.media3.exoplayer.BaseRenderer
        public void onDisabled() {
            super.onDisabled();
            this.videoSink.onRendererDisabled();
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer, androidx.media3.exoplayer.Renderer
        public boolean isEnded() {
            if (!super.isEnded() || !this.videoSink.isEnded()) {
                return false;
            }
            ConstantRateTimestampIterator constantRateTimestampIterator = this.timestampIterator;
            return constantRateTimestampIterator == null || !constantRateTimestampIterator.hasNext();
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer, androidx.media3.exoplayer.Renderer
        public boolean isReady() {
            if (super.isReady()) {
                return !this.mayRenderStartOfStream || this.videoSink.isReady();
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer, androidx.media3.exoplayer.BaseRenderer
        public void onReset() {
            super.onReset();
            this.pendingExoPlaybackException = null;
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer, androidx.media3.exoplayer.BaseRenderer
        public void onPositionReset(long j, boolean z) throws ExoPlaybackException {
            this.videoSink.flush(true);
            super.onPositionReset(j, z);
            this.timestampIterator = createTimestampIterator(j);
            if (z) {
                this.videoFrameReleaseControl.join(false);
            }
        }

        @Override // androidx.media3.exoplayer.BaseRenderer
        public void onStarted() throws ExoPlaybackException {
            super.onStarted();
            this.videoSink.onRendererStarted();
        }

        @Override // androidx.media3.exoplayer.BaseRenderer
        public void onStopped() {
            super.onStopped();
            this.videoSink.onRendererStopped();
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer, androidx.media3.exoplayer.BaseRenderer
        public void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException {
            Assertions.checkState(getTimeline().getWindowCount() == 1);
            super.onStreamChanged(formatArr, j, j2, mediaPeriodId);
            this.streamOffsetUs = j2;
            int indexOfPeriod = getTimeline().getIndexOfPeriod(mediaPeriodId.periodUid);
            this.editedMediaItem = this.sequencePlayerRenderersWrapper.sequence.editedMediaItems.get(indexOfPeriod);
            this.offsetToCompositionTimeUs = this.sequencePlayerRenderersWrapper.getOffsetToCompositionTimeUs(indexOfPeriod, j2);
            this.timestampIterator = createTimestampIterator(j);
            this.videoEffects = this.editedMediaItem.effects.videoEffects;
            this.inputStreamPendingRegistration = true;
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer, androidx.media3.exoplayer.Renderer
        public void render(long j, long j2) throws ExoPlaybackException {
            ExoPlaybackException exoPlaybackException = this.pendingExoPlaybackException;
            if (exoPlaybackException != null) {
                this.pendingExoPlaybackException = null;
                throw exoPlaybackException;
            }
            super.render(j, j2);
            this.compositingVideoSinkProvider.render(j, j2);
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer
        public boolean processOutputBuffer(long j, long j2, Bitmap bitmap, long j3) {
            if (this.inputStreamPendingRegistration) {
                Assertions.checkState(this.streamOffsetUs != C.TIME_UNSET);
                this.videoSink.setPendingVideoEffects(this.videoEffects);
                this.videoSink.setStreamOffsetAndAdjustmentUs(this.streamOffsetUs, this.offsetToCompositionTimeUs);
                this.videoSink.registerInputStream(2, new Format.Builder().setSampleMimeType(MimeTypes.IMAGE_RAW).setWidth(bitmap.getWidth()).setHeight(bitmap.getHeight()).setColorInfo(ColorInfo.SRGB_BT709_FULL).setFrameRate(30.0f).build());
                this.inputStreamPendingRegistration = false;
            }
            return this.videoSink.queueBitmap(bitmap, (TimestampIterator) Assertions.checkStateNotNull(this.timestampIterator));
        }

        private ConstantRateTimestampIterator createTimestampIterator(long j) {
            long j2 = this.streamOffsetUs;
            long j3 = this.offsetToCompositionTimeUs + j2;
            return new ConstantRateTimestampIterator(j3 + (j - j2), j3 + ((EditedMediaItem) Assertions.checkNotNull(this.editedMediaItem)).getPresentationDurationUs(), 30.0f);
        }
    }
}
