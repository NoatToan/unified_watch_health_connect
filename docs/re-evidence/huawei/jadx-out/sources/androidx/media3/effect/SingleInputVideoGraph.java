package androidx.media3.effect;

import android.content.Context;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.FrameInfo;
import androidx.media3.common.SurfaceInfo;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.util.Assertions;
import defpackage.aqx;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SingleInputVideoGraph implements VideoGraph {
    private final Context context;
    private final DebugViewProvider debugViewProvider;
    private volatile boolean hasProducedFrameWithTimestampZero;
    private final long initialTimestampOffsetUs;
    private int inputIndex;
    private boolean isEnded;
    private final VideoGraph.Listener listener;
    private final Executor listenerExecutor;
    private final ColorInfo outputColorInfo;
    private SurfaceInfo outputSurfaceInfo;
    private final Presentation presentation;
    private boolean released;
    private final boolean renderFramesAutomatically;
    private VideoFrameProcessor videoFrameProcessor;
    private final VideoFrameProcessor.Factory videoFrameProcessorFactory;

    @Override // androidx.media3.common.VideoGraph
    public void initialize() {
    }

    public SingleInputVideoGraph(Context context, VideoFrameProcessor.Factory factory, ColorInfo colorInfo, VideoGraph.Listener listener, DebugViewProvider debugViewProvider, Executor executor, VideoCompositorSettings videoCompositorSettings, boolean z, Presentation presentation, long j) {
        Assertions.checkState(VideoCompositorSettings.DEFAULT.equals(videoCompositorSettings), "SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings");
        this.context = context;
        this.videoFrameProcessorFactory = factory;
        this.outputColorInfo = colorInfo;
        this.listener = listener;
        this.debugViewProvider = debugViewProvider;
        this.listenerExecutor = executor;
        this.renderFramesAutomatically = z;
        this.presentation = presentation;
        this.initialTimestampOffsetUs = j;
        this.inputIndex = -1;
    }

    @Override // androidx.media3.common.VideoGraph
    public void registerInput(int i) throws VideoFrameProcessingException {
        Assertions.checkStateNotNull(Boolean.valueOf(this.videoFrameProcessor == null && !this.released));
        Assertions.checkState(this.inputIndex == -1);
        this.inputIndex = i;
        VideoFrameProcessor videoFrameProcessorCreate = this.videoFrameProcessorFactory.create(this.context, this.debugViewProvider, this.outputColorInfo, this.renderFramesAutomatically, aqx.e(), new AnonymousClass1());
        this.videoFrameProcessor = videoFrameProcessorCreate;
        SurfaceInfo surfaceInfo = this.outputSurfaceInfo;
        if (surfaceInfo != null) {
            videoFrameProcessorCreate.setOutputSurfaceInfo(surfaceInfo);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.effect.SingleInputVideoGraph$1, reason: invalid class name */
    class AnonymousClass1 implements VideoFrameProcessor.Listener {
        private long lastProcessedFramePresentationTimeUs;

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onInputStreamRegistered(int i, List<Effect> list, FrameInfo frameInfo) {
        }

        AnonymousClass1() {
        }

        /* JADX INFO: renamed from: lambda$onOutputSizeChanged$0$androidx-media3-effect-SingleInputVideoGraph$1, reason: not valid java name */
        /* synthetic */ void m544xade93702(int i, int i2) {
            SingleInputVideoGraph.this.listener.onOutputSizeChanged(i, i2);
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onOutputSizeChanged(final int i, final int i2) {
            SingleInputVideoGraph.this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.SingleInputVideoGraph$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m544xade93702(i, i2);
                }
            });
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onOutputFrameAvailableForRendering(final long j) {
            if (SingleInputVideoGraph.this.isEnded) {
                onError(new VideoFrameProcessingException("onOutputFrameAvailableForRendering() received after onEnded()"));
                return;
            }
            if (j == 0) {
                SingleInputVideoGraph.this.hasProducedFrameWithTimestampZero = true;
            }
            this.lastProcessedFramePresentationTimeUs = j;
            SingleInputVideoGraph.this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.SingleInputVideoGraph$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m543xef658d3b(j);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onOutputFrameAvailableForRendering$1$androidx-media3-effect-SingleInputVideoGraph$1, reason: not valid java name */
        /* synthetic */ void m543xef658d3b(long j) {
            SingleInputVideoGraph.this.listener.onOutputFrameAvailableForRendering(j);
        }

        /* JADX INFO: renamed from: lambda$onError$2$androidx-media3-effect-SingleInputVideoGraph$1, reason: not valid java name */
        /* synthetic */ void m542lambda$onError$2$androidxmedia3effectSingleInputVideoGraph$1(VideoFrameProcessingException videoFrameProcessingException) {
            SingleInputVideoGraph.this.listener.onError(videoFrameProcessingException);
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onError(final VideoFrameProcessingException videoFrameProcessingException) {
            SingleInputVideoGraph.this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.SingleInputVideoGraph$1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m542lambda$onError$2$androidxmedia3effectSingleInputVideoGraph$1(videoFrameProcessingException);
                }
            });
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onEnded() {
            if (!SingleInputVideoGraph.this.isEnded) {
                SingleInputVideoGraph.this.isEnded = true;
                SingleInputVideoGraph.this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.SingleInputVideoGraph$1$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m541lambda$onEnded$3$androidxmedia3effectSingleInputVideoGraph$1();
                    }
                });
            } else {
                onError(new VideoFrameProcessingException("onEnded() received multiple times"));
            }
        }

        /* JADX INFO: renamed from: lambda$onEnded$3$androidx-media3-effect-SingleInputVideoGraph$1, reason: not valid java name */
        /* synthetic */ void m541lambda$onEnded$3$androidxmedia3effectSingleInputVideoGraph$1() {
            SingleInputVideoGraph.this.listener.onEnded(this.lastProcessedFramePresentationTimeUs);
        }
    }

    @Override // androidx.media3.common.VideoGraph
    public VideoFrameProcessor getProcessor(int i) {
        int i2 = this.inputIndex;
        Assertions.checkArgument(i2 != -1 && i2 == i);
        return (VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor);
    }

    @Override // androidx.media3.common.VideoGraph
    public void setOutputSurfaceInfo(SurfaceInfo surfaceInfo) {
        this.outputSurfaceInfo = surfaceInfo;
        VideoFrameProcessor videoFrameProcessor = this.videoFrameProcessor;
        if (videoFrameProcessor != null) {
            videoFrameProcessor.setOutputSurfaceInfo(surfaceInfo);
        }
    }

    @Override // androidx.media3.common.VideoGraph
    public boolean hasProducedFrameWithTimestampZero() {
        return this.hasProducedFrameWithTimestampZero;
    }

    @Override // androidx.media3.common.VideoGraph
    public void release() {
        if (this.released) {
            return;
        }
        VideoFrameProcessor videoFrameProcessor = this.videoFrameProcessor;
        if (videoFrameProcessor != null) {
            videoFrameProcessor.release();
            this.videoFrameProcessor = null;
        }
        this.released = true;
    }

    protected int getInputIndex() {
        return this.inputIndex;
    }

    protected long getInitialTimestampOffsetUs() {
        return this.initialTimestampOffsetUs;
    }

    protected Presentation getPresentation() {
        return this.presentation;
    }
}
