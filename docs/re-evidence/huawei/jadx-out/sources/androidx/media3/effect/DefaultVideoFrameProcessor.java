package androidx.media3.effect;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.FrameInfo;
import androidx.media3.common.GlObjectsProvider;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.OnInputFrameProcessedListener;
import androidx.media3.common.SurfaceInfo;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.common.util.Util;
import com.bumptech.glide.Registry;
import com.google.common.collect.ImmutableList;
import defpackage.amn;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultVideoFrameProcessor implements VideoFrameProcessor {
    private static final String TAG = "DefaultFrameProcessor";
    public static final int WORKING_COLOR_SPACE_DEFAULT = 0;
    public static final int WORKING_COLOR_SPACE_LINEAR = 2;
    public static final int WORKING_COLOR_SPACE_ORIGINAL = 1;
    private final Context context;
    private final EGLDisplay eglDisplay;
    private final FinalShaderProgramWrapper finalShaderProgramWrapper;
    private final GlObjectsProvider glObjectsProvider;
    private volatile boolean inputStreamEnded;
    private final ConditionVariable inputStreamRegisteredCondition;
    private final InputSwitcher inputSwitcher;
    private final VideoFrameProcessor.Listener listener;
    private final Executor listenerExecutor;
    private volatile FrameInfo nextInputFrameInfo;
    private final ColorInfo outputColorInfo;
    private InputStreamInfo pendingInputStreamInfo;
    private boolean registeredFirstInputStream;
    private final boolean renderFramesAutomatically;
    private final VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor;
    private final List<Effect> activeEffects = new ArrayList();
    private final Object lock = new Object();
    private final List<GlShaderProgram> intermediateGlShaderPrograms = new ArrayList();

    /* JADX INFO: loaded from: classes21.dex */
    public interface ReleaseOutputTextureCallback {
        void release(long j);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface WorkingColorSpace {
    }

    static {
        MediaLibraryInfo.registerModule("media3.effect");
    }

    public static final class Factory implements VideoFrameProcessor.Factory {
        private static final String THREAD_NAME = "Effect:DefaultVideoFrameProcessor:GlThread";
        private final ExecutorService executorService;
        private final boolean experimentalAdjustSurfaceTextureTransformationMatrix;
        private final boolean experimentalRepeatInputBitmapWithoutResampling;
        private final GlObjectsProvider glObjectsProvider;
        private final boolean repeatLastRegisteredFrame;
        private final int sdrWorkingColorSpace;
        private final int textureOutputCapacity;
        private final GlTextureProducer.Listener textureOutputListener;

        public static final class Builder {
            private ExecutorService executorService;
            private boolean experimentalAdjustSurfaceTextureTransformationMatrix;
            private boolean experimentalRepeatInputBitmapWithoutResampling;
            private GlObjectsProvider glObjectsProvider;
            private boolean requireRegisteringAllInputFrames;
            private int sdrWorkingColorSpace;
            private int textureOutputCapacity;
            private GlTextureProducer.Listener textureOutputListener;

            public Builder() {
                this.sdrWorkingColorSpace = 0;
                this.requireRegisteringAllInputFrames = true;
            }

            private Builder(Factory factory) {
                this.sdrWorkingColorSpace = factory.sdrWorkingColorSpace;
                this.executorService = factory.executorService;
                this.glObjectsProvider = factory.glObjectsProvider;
                this.textureOutputListener = factory.textureOutputListener;
                this.textureOutputCapacity = factory.textureOutputCapacity;
                this.requireRegisteringAllInputFrames = !factory.repeatLastRegisteredFrame;
                this.experimentalAdjustSurfaceTextureTransformationMatrix = factory.experimentalAdjustSurfaceTextureTransformationMatrix;
                this.experimentalRepeatInputBitmapWithoutResampling = factory.experimentalRepeatInputBitmapWithoutResampling;
            }

            public Builder setSdrWorkingColorSpace(int i) {
                this.sdrWorkingColorSpace = i;
                return this;
            }

            public Builder setRequireRegisteringAllInputFrames(boolean z) {
                this.requireRegisteringAllInputFrames = z;
                return this;
            }

            public Builder setGlObjectsProvider(GlObjectsProvider glObjectsProvider) {
                this.glObjectsProvider = glObjectsProvider;
                return this;
            }

            public Builder setExecutorService(ExecutorService executorService) {
                this.executorService = executorService;
                return this;
            }

            public Builder setTextureOutput(GlTextureProducer.Listener listener, int i) {
                this.textureOutputListener = listener;
                Assertions.checkArgument(i >= 1);
                this.textureOutputCapacity = i;
                return this;
            }

            public Builder setExperimentalAdjustSurfaceTextureTransformationMatrix(boolean z) {
                this.experimentalAdjustSurfaceTextureTransformationMatrix = z;
                return this;
            }

            public Builder setExperimentalRepeatInputBitmapWithoutResampling(boolean z) {
                this.experimentalRepeatInputBitmapWithoutResampling = z;
                return this;
            }

            public Factory build() {
                int i = this.sdrWorkingColorSpace;
                boolean z = this.requireRegisteringAllInputFrames;
                GlObjectsProvider defaultGlObjectsProvider = this.glObjectsProvider;
                if (defaultGlObjectsProvider == null) {
                    defaultGlObjectsProvider = new DefaultGlObjectsProvider();
                }
                return new Factory(i, !z, defaultGlObjectsProvider, this.executorService, this.textureOutputListener, this.textureOutputCapacity, this.experimentalAdjustSurfaceTextureTransformationMatrix, this.experimentalRepeatInputBitmapWithoutResampling);
            }
        }

        private Factory(int i, boolean z, GlObjectsProvider glObjectsProvider, ExecutorService executorService, GlTextureProducer.Listener listener, int i2, boolean z2, boolean z3) {
            this.sdrWorkingColorSpace = i;
            this.repeatLastRegisteredFrame = z;
            this.glObjectsProvider = glObjectsProvider;
            this.executorService = executorService;
            this.textureOutputListener = listener;
            this.textureOutputCapacity = i2;
            this.experimentalAdjustSurfaceTextureTransformationMatrix = z2;
            this.experimentalRepeatInputBitmapWithoutResampling = z3;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Factory
        public DefaultVideoFrameProcessor create(final Context context, final DebugViewProvider debugViewProvider, final ColorInfo colorInfo, final boolean z, final Executor executor, final VideoFrameProcessor.Listener listener) throws VideoFrameProcessingException {
            ExecutorService executorServiceNewSingleThreadExecutor = this.executorService;
            boolean z2 = executorServiceNewSingleThreadExecutor == null;
            if (executorServiceNewSingleThreadExecutor == null) {
                executorServiceNewSingleThreadExecutor = Util.newSingleThreadExecutor(THREAD_NAME);
            }
            Objects.requireNonNull(listener);
            final VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor = new VideoFrameProcessingTaskExecutor(executorServiceNewSingleThreadExecutor, z2, new VideoFrameProcessingTaskExecutor.ErrorListener() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$Factory$$ExternalSyntheticLambda0
                @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.ErrorListener
                public final void onError(VideoFrameProcessingException videoFrameProcessingException) {
                    listener.onError(videoFrameProcessingException);
                }
            });
            try {
                return (DefaultVideoFrameProcessor) executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$Factory$$ExternalSyntheticLambda1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f$0.m512x7d446e8(context, debugViewProvider, colorInfo, z, videoFrameProcessingTaskExecutor, executor, listener);
                    }
                }).get();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new VideoFrameProcessingException(e);
            } catch (ExecutionException e2) {
                throw new VideoFrameProcessingException(e2);
            }
        }

        /* JADX INFO: renamed from: lambda$create$0$androidx-media3-effect-DefaultVideoFrameProcessor$Factory, reason: not valid java name */
        /* synthetic */ DefaultVideoFrameProcessor m512x7d446e8(Context context, DebugViewProvider debugViewProvider, ColorInfo colorInfo, boolean z, VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor, Executor executor, VideoFrameProcessor.Listener listener) throws Exception {
            return DefaultVideoFrameProcessor.createOpenGlObjectsAndFrameProcessor(context, debugViewProvider, colorInfo, this.sdrWorkingColorSpace, z, videoFrameProcessingTaskExecutor, executor, listener, this.glObjectsProvider, this.textureOutputListener, this.textureOutputCapacity, this.repeatLastRegisteredFrame, this.experimentalAdjustSurfaceTextureTransformationMatrix, this.experimentalRepeatInputBitmapWithoutResampling);
        }
    }

    private DefaultVideoFrameProcessor(Context context, GlObjectsProvider glObjectsProvider, EGLDisplay eGLDisplay, InputSwitcher inputSwitcher, final VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor, final VideoFrameProcessor.Listener listener, final Executor executor, FinalShaderProgramWrapper finalShaderProgramWrapper, boolean z, ColorInfo colorInfo) {
        this.context = context;
        this.glObjectsProvider = glObjectsProvider;
        this.eglDisplay = eGLDisplay;
        this.inputSwitcher = inputSwitcher;
        this.videoFrameProcessingTaskExecutor = videoFrameProcessingTaskExecutor;
        this.listener = listener;
        this.listenerExecutor = executor;
        this.renderFramesAutomatically = z;
        this.outputColorInfo = colorInfo;
        this.finalShaderProgramWrapper = finalShaderProgramWrapper;
        ConditionVariable conditionVariable = new ConditionVariable();
        this.inputStreamRegisteredCondition = conditionVariable;
        conditionVariable.open();
        finalShaderProgramWrapper.setOnInputStreamProcessedListener(new FinalShaderProgramWrapper.OnInputStreamProcessedListener() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda7
            @Override // androidx.media3.effect.FinalShaderProgramWrapper.OnInputStreamProcessedListener
            public final void onInputStreamProcessed() {
                this.f$0.m508lambda$new$1$androidxmedia3effectDefaultVideoFrameProcessor(executor, listener, videoFrameProcessingTaskExecutor);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$new$1$androidx-media3-effect-DefaultVideoFrameProcessor, reason: not valid java name */
    /* synthetic */ void m508lambda$new$1$androidxmedia3effectDefaultVideoFrameProcessor(Executor executor, final VideoFrameProcessor.Listener listener, VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor) {
        if (this.inputStreamEnded) {
            Objects.requireNonNull(listener);
            executor.execute(new Runnable() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    listener.onEnded();
                }
            });
            DebugTraceUtil.logEvent(DebugTraceUtil.COMPONENT_VFP, DebugTraceUtil.EVENT_SIGNAL_ENDED, Long.MIN_VALUE);
        } else {
            synchronized (this.lock) {
                final InputStreamInfo inputStreamInfo = this.pendingInputStreamInfo;
                if (inputStreamInfo != null) {
                    videoFrameProcessingTaskExecutor.submit(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda10
                        @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                        public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
                            this.f$0.m507lambda$new$0$androidxmedia3effectDefaultVideoFrameProcessor(inputStreamInfo);
                        }
                    });
                    this.pendingInputStreamInfo = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-media3-effect-DefaultVideoFrameProcessor, reason: not valid java name */
    /* synthetic */ void m507lambda$new$0$androidxmedia3effectDefaultVideoFrameProcessor(InputStreamInfo inputStreamInfo) throws VideoFrameProcessingException, GlUtil.GlException {
        configureEffects(inputStreamInfo, false);
    }

    public VideoFrameProcessingTaskExecutor getTaskExecutor() {
        return this.videoFrameProcessingTaskExecutor;
    }

    public void setInputDefaultBufferSize(int i, int i2) {
        this.inputSwitcher.setInputDefaultBufferSize(i, i2);
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public boolean queueInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator) {
        boolean z = false;
        if (!this.inputStreamRegisteredCondition.isOpen()) {
            return false;
        }
        if (ColorInfo.isTransferHdr(this.outputColorInfo)) {
            if (Util.SDK_INT >= 34 && bitmap.hasGainmap()) {
                z = true;
            }
            Assertions.checkArgument(z, "VideoFrameProcessor configured for HDR output, but either received SDR input, or is on an API level that doesn't support gainmaps. SDR to HDR tonemapping is not supported.");
        }
        FrameInfo frameInfo = (FrameInfo) Assertions.checkNotNull(this.nextInputFrameInfo);
        this.inputSwitcher.activeTextureManager().queueInputBitmap(bitmap, new FrameInfo.Builder(frameInfo).setOffsetToAddUs(frameInfo.offsetToAddUs).build(), timestampIterator);
        return true;
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public boolean queueInputTexture(int i, long j) {
        if (!this.inputStreamRegisteredCondition.isOpen()) {
            return false;
        }
        this.inputSwitcher.activeTextureManager().queueInputTexture(i, j);
        return true;
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public void setOnInputFrameProcessedListener(OnInputFrameProcessedListener onInputFrameProcessedListener) {
        this.inputSwitcher.setOnInputFrameProcessedListener(onInputFrameProcessedListener);
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public Surface getInputSurface() {
        return this.inputSwitcher.getInputSurface();
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public void registerInputStream(int i, List<Effect> list, FrameInfo frameInfo) {
        DebugTraceUtil.logEvent(DebugTraceUtil.COMPONENT_VFP, DebugTraceUtil.EVENT_REGISTER_NEW_INPUT_STREAM, frameInfo.offsetToAddUs, "InputType %s - %dx%d", getInputTypeString(i), Integer.valueOf(frameInfo.width), Integer.valueOf(frameInfo.height));
        this.nextInputFrameInfo = adjustForPixelWidthHeightRatio(frameInfo);
        try {
            this.inputStreamRegisteredCondition.block();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m509x7604a15(e);
                }
            });
        }
        synchronized (this.lock) {
            final InputStreamInfo inputStreamInfo = new InputStreamInfo(i, list, frameInfo);
            if (!this.registeredFirstInputStream) {
                this.registeredFirstInputStream = true;
                this.inputStreamRegisteredCondition.close();
                this.videoFrameProcessingTaskExecutor.submit(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda3
                    @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                    public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
                        this.f$0.m510x4aeb67d6(inputStreamInfo);
                    }
                });
            } else {
                this.pendingInputStreamInfo = inputStreamInfo;
                this.inputStreamRegisteredCondition.close();
                this.inputSwitcher.activeTextureManager().signalEndOfCurrentInputStream();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$registerInputStream$2$androidx-media3-effect-DefaultVideoFrameProcessor, reason: not valid java name */
    /* synthetic */ void m509x7604a15(InterruptedException interruptedException) {
        this.listener.onError(VideoFrameProcessingException.from(interruptedException));
    }

    /* JADX INFO: renamed from: lambda$registerInputStream$3$androidx-media3-effect-DefaultVideoFrameProcessor, reason: not valid java name */
    /* synthetic */ void m510x4aeb67d6(InputStreamInfo inputStreamInfo) throws VideoFrameProcessingException, GlUtil.GlException {
        configureEffects(inputStreamInfo, true);
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public boolean registerInputFrame() {
        Assertions.checkState(!this.inputStreamEnded);
        Assertions.checkStateNotNull(this.nextInputFrameInfo, "registerInputStream must be called before registering input frames");
        if (!this.inputStreamRegisteredCondition.isOpen()) {
            return false;
        }
        this.inputSwitcher.activeTextureManager().registerInputFrame(this.nextInputFrameInfo);
        return true;
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public int getPendingInputFrameCount() {
        if (this.inputSwitcher.hasActiveInput()) {
            return this.inputSwitcher.activeTextureManager().getPendingFrameCount();
        }
        return 0;
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public void setOutputSurfaceInfo(SurfaceInfo surfaceInfo) {
        this.finalShaderProgramWrapper.setOutputSurfaceInfo(surfaceInfo);
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public void renderOutputFrame(final long j) {
        Assertions.checkState(!this.renderFramesAutomatically, "Calling this method is not allowed when renderFramesAutomatically is enabled");
        this.videoFrameProcessingTaskExecutor.submitWithHighPriority(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda8
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
                this.f$0.m511x31657506(j);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$renderOutputFrame$4$androidx-media3-effect-DefaultVideoFrameProcessor, reason: not valid java name */
    /* synthetic */ void m511x31657506(long j) throws VideoFrameProcessingException, GlUtil.GlException {
        this.finalShaderProgramWrapper.renderOutputFrame(this.glObjectsProvider, j);
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public void signalEndOfInput() {
        DebugTraceUtil.logEvent(DebugTraceUtil.COMPONENT_VFP, DebugTraceUtil.EVENT_RECEIVE_END_OF_ALL_INPUT, Long.MIN_VALUE);
        Assertions.checkState(!this.inputStreamEnded);
        this.inputStreamEnded = true;
        this.inputSwitcher.signalEndOfInputStream();
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public void flush() {
        if (this.inputSwitcher.hasActiveInput()) {
            try {
                this.videoFrameProcessingTaskExecutor.flush();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                TextureManager textureManagerActiveTextureManager = this.inputSwitcher.activeTextureManager();
                textureManagerActiveTextureManager.releaseAllRegisteredFrames();
                textureManagerActiveTextureManager.setOnFlushCompleteListener(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda4
                    @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                    public final void run() {
                        countDownLatch.countDown();
                    }
                });
                VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor = this.videoFrameProcessingTaskExecutor;
                final FinalShaderProgramWrapper finalShaderProgramWrapper = this.finalShaderProgramWrapper;
                Objects.requireNonNull(finalShaderProgramWrapper);
                videoFrameProcessingTaskExecutor.submit(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda5
                    @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                    public final void run() {
                        finalShaderProgramWrapper.flush();
                    }
                });
                countDownLatch.await();
                textureManagerActiveTextureManager.setOnFlushCompleteListener(null);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public void release() {
        try {
            this.videoFrameProcessingTaskExecutor.release(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda0
                @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                public final void run() {
                    this.f$0.releaseGlObjects();
                }
            });
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }

    private FrameInfo adjustForPixelWidthHeightRatio(FrameInfo frameInfo) {
        if (frameInfo.pixelWidthHeightRatio > 1.0f) {
            return new FrameInfo.Builder(frameInfo).setWidth((int) (frameInfo.width * frameInfo.pixelWidthHeightRatio)).setPixelWidthHeightRatio(1.0f).build();
        }
        return frameInfo.pixelWidthHeightRatio < 1.0f ? new FrameInfo.Builder(frameInfo).setHeight((int) (frameInfo.height / frameInfo.pixelWidthHeightRatio)).setPixelWidthHeightRatio(1.0f).build() : frameInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DefaultVideoFrameProcessor createOpenGlObjectsAndFrameProcessor(Context context, DebugViewProvider debugViewProvider, ColorInfo colorInfo, int i, boolean z, VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor, Executor executor, VideoFrameProcessor.Listener listener, GlObjectsProvider glObjectsProvider, GlTextureProducer.Listener listener2, int i2, boolean z2, boolean z3, boolean z4) throws VideoFrameProcessingException, GlUtil.GlException {
        int[] iArr;
        EGLDisplay defaultEglDisplay = GlUtil.getDefaultEglDisplay();
        if (ColorInfo.isTransferHdr(colorInfo)) {
            iArr = GlUtil.EGL_CONFIG_ATTRIBUTES_RGBA_1010102;
        } else {
            iArr = GlUtil.EGL_CONFIG_ATTRIBUTES_RGBA_8888;
        }
        Pair<EGLContext, EGLSurface> pairCreateFocusedEglContextWithFallback = createFocusedEglContextWithFallback(glObjectsProvider, defaultEglDisplay, iArr);
        ColorInfo colorInfoBuild = (ColorInfo.isTransferHdr(colorInfo) || i == 2) ? colorInfo.buildUpon().setColorTransfer(1).setHdrStaticInfo(null).build() : colorInfo;
        Objects.requireNonNull(listener);
        return new DefaultVideoFrameProcessor(context, glObjectsProvider, defaultEglDisplay, new InputSwitcher(context, colorInfoBuild, glObjectsProvider, videoFrameProcessingTaskExecutor, executor, new DefaultVideoFrameProcessor$$ExternalSyntheticLambda6(listener), i, z2, z3, z4), videoFrameProcessingTaskExecutor, listener, executor, new FinalShaderProgramWrapper(context, defaultEglDisplay, (EGLContext) pairCreateFocusedEglContextWithFallback.first, (EGLSurface) pairCreateFocusedEglContextWithFallback.second, debugViewProvider, colorInfo, videoFrameProcessingTaskExecutor, executor, listener, listener2, i2, i, z), z, colorInfo);
    }

    private static ImmutableList<GlShaderProgram> createGlShaderPrograms(Context context, List<Effect> list, ColorInfo colorInfo, FinalShaderProgramWrapper finalShaderProgramWrapper) throws VideoFrameProcessingException {
        ImmutableList.c cVar = new ImmutableList.c();
        ImmutableList.c cVar2 = new ImmutableList.c();
        ImmutableList.c cVar3 = new ImmutableList.c();
        for (int i = 0; i < list.size(); i++) {
            Effect effect = list.get(i);
            Assertions.checkArgument(effect instanceof GlEffect, "DefaultVideoFrameProcessor only supports GlEffects");
            GlEffect glEffect = (GlEffect) effect;
            if (glEffect instanceof GlMatrixTransformation) {
                cVar2.add((GlMatrixTransformation) glEffect);
            } else if (glEffect instanceof RgbMatrix) {
                cVar3.add((RgbMatrix) glEffect);
            } else {
                ImmutableList immutableListBuild = cVar2.build();
                ImmutableList immutableListBuild2 = cVar3.build();
                boolean zIsTransferHdr = ColorInfo.isTransferHdr(colorInfo);
                if (!immutableListBuild.isEmpty() || !immutableListBuild2.isEmpty()) {
                    cVar.add(DefaultShaderProgram.create(context, immutableListBuild, immutableListBuild2, zIsTransferHdr));
                    cVar2 = new ImmutableList.c();
                    cVar3 = new ImmutableList.c();
                }
                cVar.add(glEffect.toGlShaderProgram(context, zIsTransferHdr));
            }
        }
        finalShaderProgramWrapper.setMatrixTransformations(cVar2.build(), cVar3.build());
        return cVar.build();
    }

    private static void chainShaderProgramsWithListeners(GlObjectsProvider glObjectsProvider, List<GlShaderProgram> list, FinalShaderProgramWrapper finalShaderProgramWrapper, VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor, VideoFrameProcessor.Listener listener, Executor executor) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(finalShaderProgramWrapper);
        int i = 0;
        while (i < arrayList.size() - 1) {
            GlShaderProgram glShaderProgram = (GlShaderProgram) arrayList.get(i);
            i++;
            GlShaderProgram glShaderProgram2 = (GlShaderProgram) arrayList.get(i);
            ChainingGlShaderProgramListener chainingGlShaderProgramListener = new ChainingGlShaderProgramListener(glObjectsProvider, glShaderProgram, glShaderProgram2, videoFrameProcessingTaskExecutor);
            glShaderProgram.setOutputListener(chainingGlShaderProgramListener);
            Objects.requireNonNull(listener);
            glShaderProgram.setErrorListener(executor, new DefaultVideoFrameProcessor$$ExternalSyntheticLambda6(listener));
            glShaderProgram2.setInputListener(chainingGlShaderProgramListener);
        }
    }

    private static String getInputTypeString(int i) {
        if (i == 1) {
            return "Surface";
        }
        if (i == 2) {
            return Registry.BUCKET_BITMAP;
        }
        if (i == 3) {
            return "Texture ID";
        }
        throw new IllegalArgumentException(String.valueOf(i));
    }

    private void configureEffects(final InputStreamInfo inputStreamInfo, boolean z) throws VideoFrameProcessingException {
        checkColors(inputStreamInfo.frameInfo.colorInfo, this.outputColorInfo);
        if (z || !this.activeEffects.equals(inputStreamInfo.effects)) {
            if (!this.intermediateGlShaderPrograms.isEmpty()) {
                for (int i = 0; i < this.intermediateGlShaderPrograms.size(); i++) {
                    this.intermediateGlShaderPrograms.get(i).release();
                }
                this.intermediateGlShaderPrograms.clear();
            }
            this.intermediateGlShaderPrograms.addAll(createGlShaderPrograms(this.context, inputStreamInfo.effects, this.outputColorInfo, this.finalShaderProgramWrapper));
            this.inputSwitcher.setDownstreamShaderProgram((GlShaderProgram) amn.a(this.intermediateGlShaderPrograms, this.finalShaderProgramWrapper));
            chainShaderProgramsWithListeners(this.glObjectsProvider, this.intermediateGlShaderPrograms, this.finalShaderProgramWrapper, this.videoFrameProcessingTaskExecutor, this.listener, this.listenerExecutor);
            this.activeEffects.clear();
            this.activeEffects.addAll(inputStreamInfo.effects);
        }
        this.inputSwitcher.switchToInput(inputStreamInfo.inputType, inputStreamInfo.frameInfo);
        this.inputStreamRegisteredCondition.open();
        this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m506x192e2b67(inputStreamInfo);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$configureEffects$5$androidx-media3-effect-DefaultVideoFrameProcessor, reason: not valid java name */
    /* synthetic */ void m506x192e2b67(InputStreamInfo inputStreamInfo) {
        this.listener.onInputStreamRegistered(inputStreamInfo.inputType, inputStreamInfo.effects, inputStreamInfo.frameInfo);
    }

    private static void checkColors(ColorInfo colorInfo, ColorInfo colorInfo2) throws VideoFrameProcessingException {
        boolean z = true;
        if (ColorInfo.isTransferHdr(colorInfo)) {
            Assertions.checkArgument(colorInfo.colorSpace == 6);
        }
        if (ColorInfo.isTransferHdr(colorInfo) || ColorInfo.isTransferHdr(colorInfo2)) {
            try {
                if (GlUtil.getContextMajorVersion() != 3) {
                    throw new VideoFrameProcessingException("OpenGL ES 3.0 context support is required for HDR input or output.");
                }
            } catch (GlUtil.GlException e) {
                throw VideoFrameProcessingException.from(e);
            }
        }
        Assertions.checkArgument(colorInfo.isDataSpaceValid());
        Assertions.checkArgument(colorInfo.colorTransfer != 1);
        Assertions.checkArgument(colorInfo2.isDataSpaceValid());
        Assertions.checkArgument(colorInfo2.colorTransfer != 1);
        if (ColorInfo.isTransferHdr(colorInfo) != ColorInfo.isTransferHdr(colorInfo2)) {
            if (!isSupportedToneMapping(colorInfo, colorInfo2) && !isUltraHdr(colorInfo, colorInfo2)) {
                z = false;
            }
            Assertions.checkArgument(z);
        }
    }

    private static boolean isSupportedToneMapping(ColorInfo colorInfo, ColorInfo colorInfo2) {
        if (colorInfo.colorSpace == 6 && colorInfo2.colorSpace != 6 && ColorInfo.isTransferHdr(colorInfo)) {
            return colorInfo2.colorTransfer == 10 || colorInfo2.colorTransfer == 3;
        }
        return false;
    }

    private static boolean isUltraHdr(ColorInfo colorInfo, ColorInfo colorInfo2) {
        return colorInfo.equals(ColorInfo.SRGB_BT709_FULL) && colorInfo2.colorSpace == 6 && ColorInfo.isTransferHdr(colorInfo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseGlObjects() {
        try {
            try {
                this.inputSwitcher.release();
                for (int i = 0; i < this.intermediateGlShaderPrograms.size(); i++) {
                    this.intermediateGlShaderPrograms.get(i).release();
                }
                this.finalShaderProgramWrapper.release();
            } catch (Exception e) {
                Log.e(TAG, "Error releasing shader program", e);
            }
        } finally {
            try {
                this.glObjectsProvider.release(this.eglDisplay);
            } catch (GlUtil.GlException e2) {
                Log.e(TAG, "Error releasing GL objects", e2);
            }
        }
    }

    private static Pair<EGLContext, EGLSurface> createFocusedEglContextWithFallback(GlObjectsProvider glObjectsProvider, EGLDisplay eGLDisplay, int[] iArr) throws GlUtil.GlException {
        if (Util.SDK_INT < 29) {
            return createFocusedEglContext(glObjectsProvider, eGLDisplay, 2, iArr);
        }
        try {
            return createFocusedEglContext(glObjectsProvider, eGLDisplay, 3, iArr);
        } catch (GlUtil.GlException unused) {
            return createFocusedEglContext(glObjectsProvider, eGLDisplay, 2, iArr);
        }
    }

    private static Pair<EGLContext, EGLSurface> createFocusedEglContext(GlObjectsProvider glObjectsProvider, EGLDisplay eGLDisplay, int i, int[] iArr) throws GlUtil.GlException {
        EGLContext eGLContextCreateEglContext = glObjectsProvider.createEglContext(eGLDisplay, i, iArr);
        return Pair.create(eGLContextCreateEglContext, glObjectsProvider.createFocusedPlaceholderEglSurface(eGLContextCreateEglContext, eGLDisplay));
    }

    static final class InputStreamInfo {
        public final List<Effect> effects;
        public final FrameInfo frameInfo;
        public final int inputType;

        public InputStreamInfo(int i, List<Effect> list, FrameInfo frameInfo) {
            this.inputType = i;
            this.effects = list;
            this.frameInfo = frameInfo;
        }
    }
}
