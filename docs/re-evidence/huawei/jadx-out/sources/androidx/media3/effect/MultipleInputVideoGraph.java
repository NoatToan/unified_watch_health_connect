package androidx.media3.effect;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.SparseArray;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.FrameInfo;
import androidx.media3.common.GlObjectsProvider;
import androidx.media3.common.GlTextureInfo;
import androidx.media3.common.OnInputFrameProcessedListener;
import androidx.media3.common.SurfaceInfo;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import defpackage.aqx;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes21.dex */
public abstract class MultipleInputVideoGraph implements VideoGraph {
    private static final int COMPOSITOR_TEXTURE_OUTPUT_CAPACITY = 1;
    private static final int PRE_COMPOSITOR_TEXTURE_OUTPUT_CAPACITY = 2;
    private static final long RELEASE_WAIT_TIME_MS = 1000;
    private static final String SHARED_EXECUTOR_NAME = "Effect:MultipleInputVideoGraph:Thread";
    private static final String TAG = "MultiInputVG";
    private final List<Effect> compositionEffects;
    private VideoFrameProcessor compositionVideoFrameProcessor;
    private boolean compositionVideoFrameProcessorInputStreamRegistered;
    private boolean compositionVideoFrameProcessorInputStreamRegistrationCompleted;
    private boolean compositorEnded;
    private final SparseArray<CompositorOutputTextureRelease> compositorOutputTextureReleases;
    private final Queue<CompositorOutputTextureInfo> compositorOutputTextures;
    private final Context context;
    private final DebugViewProvider debugViewProvider;
    private final SingleContextGlObjectsProvider glObjectsProvider;
    private volatile boolean hasProducedFrameWithTimestampZero;
    private final long initialTimestampOffsetUs;
    private final VideoGraph.Listener listener;
    private final Executor listenerExecutor;
    private final ColorInfo outputColorInfo;
    private boolean released;
    private final ExecutorService sharedExecutorService;
    private VideoCompositor videoCompositor;
    private final VideoCompositorSettings videoCompositorSettings;
    private final DefaultVideoFrameProcessor.Factory videoFrameProcessorFactory;
    private long lastRenderedPresentationTimeUs = C.TIME_UNSET;
    private final SparseArray<VideoFrameProcessor> preProcessors = new SparseArray<>();

    public MultipleInputVideoGraph(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, VideoCompositorSettings videoCompositorSettings, List<Effect> list, long j) {
        this.context = context;
        this.outputColorInfo = colorInfo;
        this.debugViewProvider = debugViewProvider;
        this.listener = listener;
        this.listenerExecutor = executor;
        this.videoCompositorSettings = videoCompositorSettings;
        this.compositionEffects = new ArrayList(list);
        this.initialTimestampOffsetUs = j;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Util.newSingleThreadScheduledExecutor(SHARED_EXECUTOR_NAME);
        this.sharedExecutorService = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        SingleContextGlObjectsProvider singleContextGlObjectsProvider = new SingleContextGlObjectsProvider();
        this.glObjectsProvider = singleContextGlObjectsProvider;
        this.videoFrameProcessorFactory = new DefaultVideoFrameProcessor.Factory.Builder().setSdrWorkingColorSpace(2).setGlObjectsProvider(singleContextGlObjectsProvider).setExecutorService(scheduledExecutorServiceNewSingleThreadScheduledExecutor).build();
        this.compositorOutputTextures = new ArrayDeque();
        this.compositorOutputTextureReleases = new SparseArray<>();
    }

    @Override // androidx.media3.common.VideoGraph
    public void initialize() throws VideoFrameProcessingException {
        Assertions.checkState(this.preProcessors.size() == 0 && this.videoCompositor == null && this.compositionVideoFrameProcessor == null && !this.released);
        DefaultVideoFrameProcessor defaultVideoFrameProcessorCreate = this.videoFrameProcessorFactory.create(this.context, this.debugViewProvider, this.outputColorInfo, true, aqx.e(), (VideoFrameProcessor.Listener) new AnonymousClass1());
        this.compositionVideoFrameProcessor = defaultVideoFrameProcessorCreate;
        defaultVideoFrameProcessorCreate.setOnInputFrameProcessedListener(new OnInputFrameProcessedListener() { // from class: androidx.media3.effect.MultipleInputVideoGraph$$ExternalSyntheticLambda1
            @Override // androidx.media3.common.OnInputFrameProcessedListener
            public final void onInputFrameProcessed(int i, long j) {
                this.f$0.onCompositionVideoFrameProcessorInputFrameProcessed(i, j);
            }
        });
        this.videoCompositor = new DefaultVideoCompositor(this.context, this.glObjectsProvider, this.videoCompositorSettings, this.sharedExecutorService, new VideoCompositor.Listener() { // from class: androidx.media3.effect.MultipleInputVideoGraph.2
            @Override // androidx.media3.effect.VideoCompositor.Listener
            public void onError(VideoFrameProcessingException videoFrameProcessingException) {
                MultipleInputVideoGraph.this.handleVideoFrameProcessingException(videoFrameProcessingException);
            }

            @Override // androidx.media3.effect.VideoCompositor.Listener
            public void onEnded() {
                MultipleInputVideoGraph.this.onVideoCompositorEnded();
            }
        }, new GlTextureProducer.Listener() { // from class: androidx.media3.effect.MultipleInputVideoGraph$$ExternalSyntheticLambda2
            @Override // androidx.media3.effect.GlTextureProducer.Listener
            public final void onTextureRendered(GlTextureProducer glTextureProducer, GlTextureInfo glTextureInfo, long j, long j2) {
                this.f$0.processCompositorOutputTexture(glTextureProducer, glTextureInfo, j, j2);
            }
        }, 1);
    }

    /* JADX INFO: renamed from: androidx.media3.effect.MultipleInputVideoGraph$1, reason: invalid class name */
    class AnonymousClass1 implements VideoFrameProcessor.Listener {
        AnonymousClass1() {
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onInputStreamRegistered(int i, List<Effect> list, FrameInfo frameInfo) {
            MultipleInputVideoGraph.this.compositionVideoFrameProcessorInputStreamRegistrationCompleted = true;
            MultipleInputVideoGraph.this.queueCompositionOutputInternal();
        }

        /* JADX INFO: renamed from: lambda$onOutputSizeChanged$0$androidx-media3-effect-MultipleInputVideoGraph$1, reason: not valid java name */
        /* synthetic */ void m538xc532563a(int i, int i2) {
            MultipleInputVideoGraph.this.listener.onOutputSizeChanged(i, i2);
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onOutputSizeChanged(final int i, final int i2) {
            MultipleInputVideoGraph.this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.MultipleInputVideoGraph$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m538xc532563a(i, i2);
                }
            });
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onOutputFrameAvailableForRendering(long j) {
            if (j == 0) {
                MultipleInputVideoGraph.this.hasProducedFrameWithTimestampZero = true;
            }
            MultipleInputVideoGraph.this.lastRenderedPresentationTimeUs = j;
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onError(VideoFrameProcessingException videoFrameProcessingException) {
            MultipleInputVideoGraph.this.handleVideoFrameProcessingException(videoFrameProcessingException);
        }

        /* JADX INFO: renamed from: lambda$onEnded$1$androidx-media3-effect-MultipleInputVideoGraph$1, reason: not valid java name */
        /* synthetic */ void m537x17819a51() {
            MultipleInputVideoGraph.this.listener.onEnded(MultipleInputVideoGraph.this.lastRenderedPresentationTimeUs);
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onEnded() {
            MultipleInputVideoGraph.this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.MultipleInputVideoGraph$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m537x17819a51();
                }
            });
        }
    }

    @Override // androidx.media3.common.VideoGraph
    public void registerInput(final int i) throws VideoFrameProcessingException {
        Assertions.checkState(!Util.contains(this.preProcessors, i));
        ((VideoCompositor) Assertions.checkNotNull(this.videoCompositor)).registerInputSource(i);
        this.preProcessors.put(i, this.videoFrameProcessorFactory.buildUpon().setTextureOutput(new GlTextureProducer.Listener() { // from class: androidx.media3.effect.MultipleInputVideoGraph$$ExternalSyntheticLambda3
            @Override // androidx.media3.effect.GlTextureProducer.Listener
            public final void onTextureRendered(GlTextureProducer glTextureProducer, GlTextureInfo glTextureInfo, long j, long j2) throws VideoFrameProcessingException, GlUtil.GlException {
                this.f$0.m535x9edd0dd9(i, glTextureProducer, glTextureInfo, j, j2);
            }
        }, 2).build().create(this.context, DebugViewProvider.NONE, this.outputColorInfo, true, this.listenerExecutor, new VideoFrameProcessor.Listener() { // from class: androidx.media3.effect.MultipleInputVideoGraph.3
            @Override // androidx.media3.common.VideoFrameProcessor.Listener
            public void onInputStreamRegistered(int i2, List<Effect> list, FrameInfo frameInfo) {
            }

            @Override // androidx.media3.common.VideoFrameProcessor.Listener
            public void onOutputFrameAvailableForRendering(long j) {
            }

            @Override // androidx.media3.common.VideoFrameProcessor.Listener
            public void onOutputSizeChanged(int i2, int i3) {
            }

            @Override // androidx.media3.common.VideoFrameProcessor.Listener
            public void onError(VideoFrameProcessingException videoFrameProcessingException) {
                MultipleInputVideoGraph.this.handleVideoFrameProcessingException(videoFrameProcessingException);
            }

            @Override // androidx.media3.common.VideoFrameProcessor.Listener
            public void onEnded() {
                MultipleInputVideoGraph.this.onPreProcessingVideoFrameProcessorEnded(i);
            }
        }));
    }

    /* JADX INFO: renamed from: lambda$registerInput$0$androidx-media3-effect-MultipleInputVideoGraph, reason: not valid java name */
    /* synthetic */ void m535x9edd0dd9(int i, GlTextureProducer glTextureProducer, GlTextureInfo glTextureInfo, long j, long j2) throws VideoFrameProcessingException, GlUtil.GlException {
        queuePreProcessingOutputToCompositor(i, glTextureProducer, glTextureInfo, j);
    }

    @Override // androidx.media3.common.VideoGraph
    public VideoFrameProcessor getProcessor(int i) {
        Assertions.checkState(Util.contains(this.preProcessors, i));
        return this.preProcessors.get(i);
    }

    @Override // androidx.media3.common.VideoGraph
    public void setOutputSurfaceInfo(SurfaceInfo surfaceInfo) {
        ((VideoFrameProcessor) Assertions.checkNotNull(this.compositionVideoFrameProcessor)).setOutputSurfaceInfo(surfaceInfo);
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
        for (int i = 0; i < this.preProcessors.size(); i++) {
            SparseArray<VideoFrameProcessor> sparseArray = this.preProcessors;
            sparseArray.get(sparseArray.keyAt(i)).release();
        }
        this.preProcessors.clear();
        VideoCompositor videoCompositor = this.videoCompositor;
        if (videoCompositor != null) {
            videoCompositor.release();
            this.videoCompositor = null;
        }
        VideoFrameProcessor videoFrameProcessor = this.compositionVideoFrameProcessor;
        if (videoFrameProcessor != null) {
            videoFrameProcessor.release();
            this.compositionVideoFrameProcessor = null;
        }
        try {
            if (this.glObjectsProvider.singleEglContext != null) {
                GlUtil.destroyEglContext(GlUtil.getDefaultEglDisplay(), this.glObjectsProvider.singleEglContext);
            }
        } catch (GlUtil.GlException e) {
            Log.e(TAG, "Error releasing GL context", e);
        }
        this.sharedExecutorService.shutdown();
        try {
            this.sharedExecutorService.awaitTermination(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.MultipleInputVideoGraph$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m536lambda$release$1$androidxmedia3effectMultipleInputVideoGraph(e2);
                }
            });
        }
        this.released = true;
    }

    /* JADX INFO: renamed from: lambda$release$1$androidx-media3-effect-MultipleInputVideoGraph, reason: not valid java name */
    /* synthetic */ void m536lambda$release$1$androidxmedia3effectMultipleInputVideoGraph(InterruptedException interruptedException) {
        this.listener.onError(VideoFrameProcessingException.from(interruptedException));
    }

    protected long getInitialTimestampOffsetUs() {
        return this.initialTimestampOffsetUs;
    }

    private void queuePreProcessingOutputToCompositor(int i, GlTextureProducer glTextureProducer, GlTextureInfo glTextureInfo, long j) {
        DebugTraceUtil.logEvent(DebugTraceUtil.COMPONENT_VFP, DebugTraceUtil.EVENT_OUTPUT_TEXTURE_RENDERED, j);
        ((VideoCompositor) Assertions.checkNotNull(this.videoCompositor)).queueInputTexture(i, glTextureProducer, glTextureInfo, this.outputColorInfo, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processCompositorOutputTexture(GlTextureProducer glTextureProducer, GlTextureInfo glTextureInfo, long j, long j2) {
        Assertions.checkStateNotNull(this.compositionVideoFrameProcessor);
        Assertions.checkState(!this.compositorEnded);
        DebugTraceUtil.logEvent(DebugTraceUtil.COMPONENT_COMPOSITOR, DebugTraceUtil.EVENT_OUTPUT_TEXTURE_RENDERED, j);
        this.compositorOutputTextures.add(new CompositorOutputTextureInfo(glTextureInfo, j, null));
        this.compositorOutputTextureReleases.put(glTextureInfo.texId, new CompositorOutputTextureRelease(glTextureProducer, j));
        if (!this.compositionVideoFrameProcessorInputStreamRegistered) {
            ((VideoFrameProcessor) Assertions.checkNotNull(this.compositionVideoFrameProcessor)).registerInputStream(3, this.compositionEffects, new FrameInfo.Builder(this.outputColorInfo, glTextureInfo.width, glTextureInfo.height).build());
            this.compositionVideoFrameProcessorInputStreamRegistered = true;
        } else {
            queueCompositionOutputInternal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCompositionVideoFrameProcessorInputFrameProcessed(int i, long j) {
        Assertions.checkState(Util.contains(this.compositorOutputTextureReleases, i));
        this.compositorOutputTextureReleases.get(i).release();
        this.compositorOutputTextureReleases.remove(i);
        queueCompositionOutputInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPreProcessingVideoFrameProcessorEnded(int i) {
        ((VideoCompositor) Assertions.checkNotNull(this.videoCompositor)).signalEndOfInputSource(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onVideoCompositorEnded() {
        this.compositorEnded = true;
        if (this.compositorOutputTextures.isEmpty()) {
            ((VideoFrameProcessor) Assertions.checkNotNull(this.compositionVideoFrameProcessor)).signalEndOfInput();
        } else {
            queueCompositionOutputInternal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queueCompositionOutputInternal() {
        CompositorOutputTextureInfo compositorOutputTextureInfoPeek;
        Assertions.checkStateNotNull(this.compositionVideoFrameProcessor);
        if (this.compositionVideoFrameProcessorInputStreamRegistrationCompleted && (compositorOutputTextureInfoPeek = this.compositorOutputTextures.peek()) != null) {
            Assertions.checkState(((VideoFrameProcessor) Assertions.checkNotNull(this.compositionVideoFrameProcessor)).queueInputTexture(compositorOutputTextureInfoPeek.glTextureInfo.texId, compositorOutputTextureInfoPeek.presentationTimeUs));
            this.compositorOutputTextures.remove();
            if (this.compositorEnded && this.compositorOutputTextures.isEmpty()) {
                ((VideoFrameProcessor) Assertions.checkNotNull(this.compositionVideoFrameProcessor)).signalEndOfInput();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleVideoFrameProcessingException(final Exception exc) {
        this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.MultipleInputVideoGraph$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m534x39739ffc(exc);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$handleVideoFrameProcessingException$2$androidx-media3-effect-MultipleInputVideoGraph, reason: not valid java name */
    /* synthetic */ void m534x39739ffc(Exception exc) {
        VideoFrameProcessingException videoFrameProcessingExceptionFrom;
        VideoGraph.Listener listener = this.listener;
        if (exc instanceof VideoFrameProcessingException) {
            videoFrameProcessingExceptionFrom = (VideoFrameProcessingException) exc;
        } else {
            videoFrameProcessingExceptionFrom = VideoFrameProcessingException.from(exc);
        }
        listener.onError(videoFrameProcessingExceptionFrom);
    }

    static final class CompositorOutputTextureInfo {
        public final GlTextureInfo glTextureInfo;
        public final long presentationTimeUs;

        /* synthetic */ CompositorOutputTextureInfo(GlTextureInfo glTextureInfo, long j, AnonymousClass1 anonymousClass1) {
            this(glTextureInfo, j);
        }

        private CompositorOutputTextureInfo(GlTextureInfo glTextureInfo, long j) {
            this.glTextureInfo = glTextureInfo;
            this.presentationTimeUs = j;
        }
    }

    static final class CompositorOutputTextureRelease {
        private final long presentationTimeUs;
        private final GlTextureProducer textureProducer;

        public CompositorOutputTextureRelease(GlTextureProducer glTextureProducer, long j) {
            this.textureProducer = glTextureProducer;
            this.presentationTimeUs = j;
        }

        public void release() {
            this.textureProducer.releaseOutputTexture(this.presentationTimeUs);
        }
    }

    static final class SingleContextGlObjectsProvider implements GlObjectsProvider {
        private final GlObjectsProvider glObjectsProvider = new DefaultGlObjectsProvider();
        private EGLContext singleEglContext;

        @Override // androidx.media3.common.GlObjectsProvider
        public void release(EGLDisplay eGLDisplay) {
        }

        @Override // androidx.media3.common.GlObjectsProvider
        public EGLContext createEglContext(EGLDisplay eGLDisplay, int i, int[] iArr) throws GlUtil.GlException {
            if (this.singleEglContext == null) {
                this.singleEglContext = this.glObjectsProvider.createEglContext(eGLDisplay, i, iArr);
            }
            return this.singleEglContext;
        }

        @Override // androidx.media3.common.GlObjectsProvider
        public EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws GlUtil.GlException {
            return this.glObjectsProvider.createEglSurface(eGLDisplay, obj, i, z);
        }

        @Override // androidx.media3.common.GlObjectsProvider
        public EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil.GlException {
            return this.glObjectsProvider.createFocusedPlaceholderEglSurface(eGLContext, eGLDisplay);
        }

        @Override // androidx.media3.common.GlObjectsProvider
        public GlTextureInfo createBuffersForTexture(int i, int i2, int i3) throws GlUtil.GlException {
            return this.glObjectsProvider.createBuffersForTexture(i, i2, i3);
        }
    }
}
