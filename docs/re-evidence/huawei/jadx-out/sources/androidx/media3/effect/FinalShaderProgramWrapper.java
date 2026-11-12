package androidx.media3.effect;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.GlObjectsProvider;
import androidx.media3.common.GlTextureInfo;
import androidx.media3.common.SurfaceInfo;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class FinalShaderProgramWrapper implements GlShaderProgram, GlTextureProducer {
    private static final int SURFACE_INPUT_CAPACITY = 1;
    private static final String TAG = "FinalShaderWrapper";
    private final Context context;
    private SurfaceView debugSurfaceView;
    private SurfaceViewWrapper debugSurfaceViewWrapper;
    private final DebugViewProvider debugViewProvider;
    private DefaultShaderProgram defaultShaderProgram;
    private final EGLContext eglContext;
    private final EGLDisplay eglDisplay;
    private int inputHeight;
    private int inputWidth;
    private boolean isInputStreamEndedWithPendingAvailableFrames;
    private boolean matrixTransformationsChanged;
    private OnInputStreamProcessedListener onInputStreamProcessedListener;
    private final ColorInfo outputColorInfo;
    private EGLSurface outputEglSurface;
    private int outputHeight;
    private Size outputSizeBeforeSurfaceTransformation;
    private SurfaceInfo outputSurfaceInfo;
    private boolean outputSurfaceInfoChanged;
    private final TexturePool outputTexturePool;
    private final LongArrayQueue outputTextureTimestamps;
    private int outputWidth;
    private final EGLSurface placeholderSurface;
    private final boolean renderFramesAutomatically;
    private final int sdrWorkingColorSpace;
    private final LongArrayQueue syncObjects;
    private final GlTextureProducer.Listener textureOutputListener;
    private final VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor;
    private final VideoFrameProcessor.Listener videoFrameProcessorListener;
    private final Executor videoFrameProcessorListenerExecutor;
    private final List<GlMatrixTransformation> matrixTransformations = new ArrayList();
    private final List<RgbMatrix> rgbMatrices = new ArrayList();
    private GlShaderProgram.InputListener inputListener = new GlShaderProgram.InputListener() { // from class: androidx.media3.effect.FinalShaderProgramWrapper.1
    };
    private final Queue<Pair<GlTextureInfo, Long>> availableFrames = new ConcurrentLinkedQueue();

    interface OnInputStreamProcessedListener {
        void onInputStreamProcessed();
    }

    public FinalShaderProgramWrapper(Context context, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, DebugViewProvider debugViewProvider, ColorInfo colorInfo, VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor, Executor executor, VideoFrameProcessor.Listener listener, GlTextureProducer.Listener listener2, int i, int i2, boolean z) {
        this.context = context;
        this.eglDisplay = eGLDisplay;
        this.eglContext = eGLContext;
        this.placeholderSurface = eGLSurface;
        this.debugViewProvider = debugViewProvider;
        this.outputColorInfo = colorInfo;
        this.videoFrameProcessingTaskExecutor = videoFrameProcessingTaskExecutor;
        this.videoFrameProcessorListenerExecutor = executor;
        this.videoFrameProcessorListener = listener;
        this.textureOutputListener = listener2;
        this.sdrWorkingColorSpace = i2;
        this.renderFramesAutomatically = z;
        this.outputTexturePool = new TexturePool(ColorInfo.isTransferHdr(colorInfo), i);
        this.outputTextureTimestamps = new LongArrayQueue(i);
        this.syncObjects = new LongArrayQueue(i);
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setInputListener(GlShaderProgram.InputListener inputListener) {
        this.inputListener = inputListener;
        for (int i = 0; i < getInputCapacity(); i++) {
            inputListener.onReadyToAcceptInputFrame();
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setOutputListener(GlShaderProgram.OutputListener outputListener) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setErrorListener(Executor executor, GlShaderProgram.ErrorListener errorListener) {
        throw new UnsupportedOperationException();
    }

    public void setOnInputStreamProcessedListener(OnInputStreamProcessedListener onInputStreamProcessedListener) {
        this.onInputStreamProcessedListener = onInputStreamProcessedListener;
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void signalEndOfCurrentInputStream() {
        if (this.availableFrames.isEmpty()) {
            ((OnInputStreamProcessedListener) Assertions.checkNotNull(this.onInputStreamProcessedListener)).onInputStreamProcessed();
            this.isInputStreamEndedWithPendingAvailableFrames = false;
        } else {
            Assertions.checkState(!this.renderFramesAutomatically);
            this.isInputStreamEndedWithPendingAvailableFrames = true;
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void queueInputFrame(GlObjectsProvider glObjectsProvider, GlTextureInfo glTextureInfo, final long j) {
        this.videoFrameProcessorListenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.FinalShaderProgramWrapper$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m526xc3ae7029(j);
            }
        });
        if (this.textureOutputListener == null) {
            if (this.renderFramesAutomatically) {
                renderFrame(glObjectsProvider, glTextureInfo, j, j * 1000);
            } else {
                this.availableFrames.add(Pair.create(glTextureInfo, Long.valueOf(j)));
            }
            this.inputListener.onReadyToAcceptInputFrame();
            return;
        }
        Assertions.checkState(this.outputTexturePool.freeTextureCount() > 0);
        renderFrame(glObjectsProvider, glTextureInfo, j, j * 1000);
    }

    /* JADX INFO: renamed from: lambda$queueInputFrame$0$androidx-media3-effect-FinalShaderProgramWrapper, reason: not valid java name */
    /* synthetic */ void m526xc3ae7029(long j) {
        this.videoFrameProcessorListener.onOutputFrameAvailableForRendering(j);
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void releaseOutputFrame(GlTextureInfo glTextureInfo) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.effect.GlTextureProducer
    public void releaseOutputTexture(final long j) {
        this.videoFrameProcessingTaskExecutor.submit(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.FinalShaderProgramWrapper$$ExternalSyntheticLambda7
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
                this.f$0.m527x4945a9af(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: releaseOutputTextureInternal, reason: merged with bridge method [inline-methods] */
    public void m527x4945a9af(long j) throws GlUtil.GlException {
        Assertions.checkState(this.textureOutputListener != null);
        while (this.outputTexturePool.freeTextureCount() < this.outputTexturePool.capacity() && this.outputTextureTimestamps.element() <= j) {
            this.outputTexturePool.freeTexture();
            this.outputTextureTimestamps.remove();
            GlUtil.deleteSyncObject(this.syncObjects.remove());
            this.inputListener.onReadyToAcceptInputFrame();
        }
    }

    public void setMatrixTransformations(List<GlMatrixTransformation> list, List<RgbMatrix> list2) {
        this.matrixTransformations.clear();
        this.matrixTransformations.addAll(list);
        this.rgbMatrices.clear();
        this.rgbMatrices.addAll(list2);
        this.matrixTransformationsChanged = true;
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void flush() {
        if (this.textureOutputListener != null) {
            this.outputTexturePool.freeAllTextures();
            this.outputTextureTimestamps.clear();
            this.syncObjects.clear();
        }
        this.availableFrames.clear();
        this.isInputStreamEndedWithPendingAvailableFrames = false;
        DefaultShaderProgram defaultShaderProgram = this.defaultShaderProgram;
        if (defaultShaderProgram != null) {
            defaultShaderProgram.flush();
        }
        this.inputListener.onFlush();
        for (int i = 0; i < getInputCapacity(); i++) {
            this.inputListener.onReadyToAcceptInputFrame();
        }
    }

    private int getInputCapacity() {
        if (this.textureOutputListener == null) {
            return 1;
        }
        return this.outputTexturePool.freeTextureCount();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void release() throws VideoFrameProcessingException {
        synchronized (this) {
            DefaultShaderProgram defaultShaderProgram = this.defaultShaderProgram;
            if (defaultShaderProgram != null) {
                defaultShaderProgram.release();
            }
            try {
                this.outputTexturePool.deleteAllTextures();
                GlUtil.destroyEglSurface(this.eglDisplay, this.outputEglSurface);
                GlUtil.checkGlError();
            } catch (GlUtil.GlException e) {
                throw new VideoFrameProcessingException(e);
            }
        }
    }

    public void renderOutputFrame(GlObjectsProvider glObjectsProvider, long j) {
        if (this.textureOutputListener != null) {
            return;
        }
        Assertions.checkState(!this.renderFramesAutomatically);
        Pair<GlTextureInfo, Long> pairRemove = this.availableFrames.remove();
        renderFrame(glObjectsProvider, (GlTextureInfo) pairRemove.first, ((Long) pairRemove.second).longValue(), j);
        if (this.availableFrames.isEmpty() && this.isInputStreamEndedWithPendingAvailableFrames) {
            ((OnInputStreamProcessedListener) Assertions.checkNotNull(this.onInputStreamProcessedListener)).onInputStreamProcessed();
            this.isInputStreamEndedWithPendingAvailableFrames = false;
        }
    }

    public void setOutputSurfaceInfo(final SurfaceInfo surfaceInfo) {
        try {
            this.videoFrameProcessingTaskExecutor.invoke(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.FinalShaderProgramWrapper$$ExternalSyntheticLambda2
                @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
                    this.f$0.m530xc87a44c9(surfaceInfo);
                }
            });
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.videoFrameProcessorListenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.FinalShaderProgramWrapper$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m531xba23eae8(e);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$setOutputSurfaceInfo$3$androidx-media3-effect-FinalShaderProgramWrapper, reason: not valid java name */
    /* synthetic */ void m531xba23eae8(InterruptedException interruptedException) {
        this.videoFrameProcessorListener.onError(VideoFrameProcessingException.from(interruptedException));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setOutputSurfaceInfoInternal, reason: merged with bridge method [inline-methods] */
    public void m530xc87a44c9(SurfaceInfo surfaceInfo) {
        synchronized (this) {
            if (this.textureOutputListener != null) {
                return;
            }
            if (Util.areEqual(this.outputSurfaceInfo, surfaceInfo)) {
                return;
            }
            SurfaceInfo surfaceInfo2 = this.outputSurfaceInfo;
            if (surfaceInfo2 != null && (surfaceInfo == null || !surfaceInfo2.surface.equals(surfaceInfo.surface))) {
                destroyOutputEglSurface();
            }
            SurfaceInfo surfaceInfo3 = this.outputSurfaceInfo;
            this.outputSurfaceInfoChanged = (surfaceInfo3 != null && surfaceInfo != null && surfaceInfo3.width == surfaceInfo.width && this.outputSurfaceInfo.height == surfaceInfo.height && this.outputSurfaceInfo.orientationDegrees == surfaceInfo.orientationDegrees) ? false : true;
            this.outputSurfaceInfo = surfaceInfo;
        }
    }

    private void destroyOutputEglSurface() {
        synchronized (this) {
            if (this.outputEglSurface == null) {
                return;
            }
            try {
                try {
                    GlUtil.focusEglSurface(this.eglDisplay, this.eglContext, this.placeholderSurface, 1, 1);
                    GlUtil.destroyEglSurface(this.eglDisplay, this.outputEglSurface);
                } catch (GlUtil.GlException e) {
                    this.videoFrameProcessorListenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.FinalShaderProgramWrapper$$ExternalSyntheticLambda6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m524xa967c1db(e);
                        }
                    });
                }
                this.outputEglSurface = null;
            } catch (Throwable th) {
                this.outputEglSurface = null;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: lambda$destroyOutputEglSurface$4$androidx-media3-effect-FinalShaderProgramWrapper, reason: not valid java name */
    /* synthetic */ void m524xa967c1db(GlUtil.GlException glException) {
        this.videoFrameProcessorListener.onError(VideoFrameProcessingException.from(glException));
    }

    private void renderFrame(GlObjectsProvider glObjectsProvider, GlTextureInfo glTextureInfo, final long j, long j2) {
        synchronized (this) {
            try {
                if (j2 != -2) {
                    try {
                        if (ensureConfigured(glObjectsProvider, glTextureInfo.width, glTextureInfo.height)) {
                            if (this.outputSurfaceInfo != null) {
                                renderFrameToOutputSurface(glTextureInfo, j, j2);
                            } else if (this.textureOutputListener != null) {
                                renderFrameToOutputTexture(glTextureInfo, j);
                            }
                            if (this.debugSurfaceViewWrapper != null && this.defaultShaderProgram != null) {
                                renderFrameToDebugSurface(glObjectsProvider, glTextureInfo, j);
                            }
                            this.inputListener.onInputFrameProcessed(glTextureInfo);
                            return;
                        }
                    } catch (VideoFrameProcessingException e) {
                        e = e;
                        this.videoFrameProcessorListenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.FinalShaderProgramWrapper$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.m528x77006aa1(e, j);
                            }
                        });
                    } catch (GlUtil.GlException e2) {
                        e = e2;
                        this.videoFrameProcessorListenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.FinalShaderProgramWrapper$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.m528x77006aa1(e, j);
                            }
                        });
                    }
                }
                this.inputListener.onInputFrameProcessed(glTextureInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: lambda$renderFrame$5$androidx-media3-effect-FinalShaderProgramWrapper, reason: not valid java name */
    /* synthetic */ void m528x77006aa1(Exception exc, long j) {
        this.videoFrameProcessorListener.onError(VideoFrameProcessingException.from(exc, j));
    }

    private void renderFrameToOutputSurface(GlTextureInfo glTextureInfo, long j, long j2) throws VideoFrameProcessingException, GlUtil.GlException {
        synchronized (this) {
            EGLSurface eGLSurface = (EGLSurface) Assertions.checkNotNull(this.outputEglSurface);
            SurfaceInfo surfaceInfo = (SurfaceInfo) Assertions.checkNotNull(this.outputSurfaceInfo);
            DefaultShaderProgram defaultShaderProgram = (DefaultShaderProgram) Assertions.checkNotNull(this.defaultShaderProgram);
            GlUtil.focusEglSurface(this.eglDisplay, this.eglContext, eGLSurface, surfaceInfo.width, surfaceInfo.height);
            GlUtil.clearFocusedBuffers();
            defaultShaderProgram.drawFrame(glTextureInfo.texId, j);
            EGLDisplay eGLDisplay = this.eglDisplay;
            if (j2 == -1) {
                j2 = System.nanoTime();
            }
            EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j2);
            EGL14.eglSwapBuffers(this.eglDisplay, eGLSurface);
            DebugTraceUtil.logEvent(DebugTraceUtil.COMPONENT_VFP, DebugTraceUtil.EVENT_RENDERED_TO_OUTPUT_SURFACE, j);
        }
    }

    private void renderFrameToOutputTexture(GlTextureInfo glTextureInfo, long j) throws VideoFrameProcessingException, GlUtil.GlException {
        GlTextureInfo glTextureInfoUseTexture = this.outputTexturePool.useTexture();
        this.outputTextureTimestamps.add(j);
        GlUtil.focusFramebufferUsingCurrentContext(glTextureInfoUseTexture.fboId, glTextureInfoUseTexture.width, glTextureInfoUseTexture.height);
        GlUtil.clearFocusedBuffers();
        ((DefaultShaderProgram) Assertions.checkNotNull(this.defaultShaderProgram)).drawFrame(glTextureInfo.texId, j);
        long jCreateGlSyncFence = GlUtil.createGlSyncFence();
        this.syncObjects.add(jCreateGlSyncFence);
        ((GlTextureProducer.Listener) Assertions.checkNotNull(this.textureOutputListener)).onTextureRendered(this, glTextureInfoUseTexture, j, jCreateGlSyncFence);
    }

    private boolean ensureConfigured(GlObjectsProvider glObjectsProvider, int i, int i2) throws VideoFrameProcessingException, GlUtil.GlException {
        int width;
        int height;
        synchronized (this) {
            boolean z = true;
            boolean z2 = (this.inputWidth == i && this.inputHeight == i2 && this.outputSizeBeforeSurfaceTransformation != null) ? false : true;
            if (z2) {
                this.inputWidth = i;
                this.inputHeight = i2;
                final Size sizeConfigureAndGetOutputSize = MatrixUtils.configureAndGetOutputSize(i, i2, this.matrixTransformations);
                if (!Util.areEqual(this.outputSizeBeforeSurfaceTransformation, sizeConfigureAndGetOutputSize)) {
                    this.outputSizeBeforeSurfaceTransformation = sizeConfigureAndGetOutputSize;
                    this.videoFrameProcessorListenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.FinalShaderProgramWrapper$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m525x24326e21(sizeConfigureAndGetOutputSize);
                        }
                    });
                }
            }
            Assertions.checkNotNull(this.outputSizeBeforeSurfaceTransformation);
            SurfaceInfo surfaceInfo = this.outputSurfaceInfo;
            if (surfaceInfo == null && this.textureOutputListener == null) {
                if (this.outputEglSurface != null) {
                    z = false;
                }
                Assertions.checkState(z);
                DefaultShaderProgram defaultShaderProgram = this.defaultShaderProgram;
                if (defaultShaderProgram != null) {
                    defaultShaderProgram.release();
                    this.defaultShaderProgram = null;
                }
                Log.w(TAG, "Output surface and size not set, dropping frame.");
                return false;
            }
            if (surfaceInfo == null) {
                width = this.outputSizeBeforeSurfaceTransformation.getWidth();
            } else {
                width = surfaceInfo.width;
            }
            this.outputWidth = width;
            SurfaceInfo surfaceInfo2 = this.outputSurfaceInfo;
            if (surfaceInfo2 == null) {
                height = this.outputSizeBeforeSurfaceTransformation.getHeight();
            } else {
                height = surfaceInfo2.height;
            }
            this.outputHeight = height;
            SurfaceInfo surfaceInfo3 = this.outputSurfaceInfo;
            if (surfaceInfo3 != null && this.outputEglSurface == null) {
                this.outputEglSurface = glObjectsProvider.createEglSurface(this.eglDisplay, surfaceInfo3.surface, this.outputColorInfo.colorTransfer, this.renderFramesAutomatically);
            }
            if (this.textureOutputListener != null) {
                this.outputTexturePool.ensureConfigured(glObjectsProvider, this.outputWidth, this.outputHeight);
            }
            SurfaceView debugPreviewSurfaceView = this.debugViewProvider.getDebugPreviewSurfaceView(this.outputWidth, this.outputHeight);
            if (debugPreviewSurfaceView != null && !Util.areEqual(this.debugSurfaceView, debugPreviewSurfaceView)) {
                this.debugSurfaceViewWrapper = new SurfaceViewWrapper(this.eglDisplay, this.eglContext, debugPreviewSurfaceView, this.outputColorInfo.colorTransfer);
            }
            this.debugSurfaceView = debugPreviewSurfaceView;
            DefaultShaderProgram defaultShaderProgram2 = this.defaultShaderProgram;
            if (defaultShaderProgram2 != null && (this.outputSurfaceInfoChanged || z2 || this.matrixTransformationsChanged)) {
                defaultShaderProgram2.release();
                this.defaultShaderProgram = null;
                this.outputSurfaceInfoChanged = false;
                this.matrixTransformationsChanged = false;
            }
            if (this.defaultShaderProgram == null) {
                SurfaceInfo surfaceInfo4 = this.outputSurfaceInfo;
                this.defaultShaderProgram = createDefaultShaderProgram(surfaceInfo4 == null ? 0 : surfaceInfo4.orientationDegrees, this.outputWidth, this.outputHeight);
                this.outputSurfaceInfoChanged = false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: lambda$ensureConfigured$6$androidx-media3-effect-FinalShaderProgramWrapper, reason: not valid java name */
    /* synthetic */ void m525x24326e21(Size size) {
        this.videoFrameProcessorListener.onOutputSizeChanged(size.getWidth(), size.getHeight());
    }

    private DefaultShaderProgram createDefaultShaderProgram(int i, int i2, int i3) throws VideoFrameProcessingException {
        DefaultShaderProgram defaultShaderProgramCreateApplyingOetf;
        synchronized (this) {
            ImmutableList.c cVarAddAll = new ImmutableList.c().addAll(this.matrixTransformations);
            if (i != 0) {
                cVarAddAll.add(new ScaleAndRotateTransformation.Builder().setRotationDegrees(i).build());
            }
            cVarAddAll.add(Presentation.createForWidthAndHeight(i2, i3, 0));
            defaultShaderProgramCreateApplyingOetf = DefaultShaderProgram.createApplyingOetf(this.context, cVarAddAll.build(), this.rgbMatrices, this.outputColorInfo, this.sdrWorkingColorSpace);
            Size sizeConfigure = defaultShaderProgramCreateApplyingOetf.configure(this.inputWidth, this.inputHeight);
            SurfaceInfo surfaceInfo = this.outputSurfaceInfo;
            if (surfaceInfo != null) {
                SurfaceInfo surfaceInfo2 = (SurfaceInfo) Assertions.checkNotNull(surfaceInfo);
                Assertions.checkState(sizeConfigure.getWidth() == surfaceInfo2.width);
                Assertions.checkState(sizeConfigure.getHeight() == surfaceInfo2.height);
            }
        }
        return defaultShaderProgramCreateApplyingOetf;
    }

    private void renderFrameToDebugSurface(GlObjectsProvider glObjectsProvider, final GlTextureInfo glTextureInfo, final long j) {
        final DefaultShaderProgram defaultShaderProgram = (DefaultShaderProgram) Assertions.checkNotNull(this.defaultShaderProgram);
        final SurfaceViewWrapper surfaceViewWrapper = (SurfaceViewWrapper) Assertions.checkNotNull(this.debugSurfaceViewWrapper);
        try {
            ((SurfaceViewWrapper) Assertions.checkNotNull(surfaceViewWrapper)).maybeRenderToSurfaceView(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.FinalShaderProgramWrapper$$ExternalSyntheticLambda5
                @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
                    this.f$0.m529x33fdd2a(defaultShaderProgram, surfaceViewWrapper, glTextureInfo, j);
                }
            }, glObjectsProvider);
        } catch (VideoFrameProcessingException | GlUtil.GlException e) {
            Log.d(TAG, "Error rendering to debug preview", e);
        }
    }

    /* JADX INFO: renamed from: lambda$renderFrameToDebugSurface$7$androidx-media3-effect-FinalShaderProgramWrapper, reason: not valid java name */
    /* synthetic */ void m529x33fdd2a(DefaultShaderProgram defaultShaderProgram, SurfaceViewWrapper surfaceViewWrapper, GlTextureInfo glTextureInfo, long j) throws VideoFrameProcessingException, GlUtil.GlException {
        GlUtil.clearFocusedBuffers();
        if (this.sdrWorkingColorSpace == 2) {
            int outputColorTransfer = defaultShaderProgram.getOutputColorTransfer();
            defaultShaderProgram.setOutputColorTransfer(surfaceViewWrapper.outputColorTransfer);
            defaultShaderProgram.drawFrame(glTextureInfo.texId, j);
            defaultShaderProgram.setOutputColorTransfer(outputColorTransfer);
            return;
        }
        defaultShaderProgram.drawFrame(glTextureInfo.texId, j);
    }

    static final class SurfaceViewWrapper implements SurfaceHolder.Callback {
        private final EGLContext eglContext;
        private final EGLDisplay eglDisplay;
        private EGLSurface eglSurface;
        private int height;
        public final int outputColorTransfer;
        private Surface surface;
        private int width;

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public SurfaceViewWrapper(EGLDisplay eGLDisplay, EGLContext eGLContext, SurfaceView surfaceView, int i) {
            this.eglDisplay = eGLDisplay;
            this.eglContext = eGLContext;
            if (i == 7 && Util.SDK_INT < 34) {
                i = 6;
            }
            this.outputColorTransfer = i;
            surfaceView.getHolder().addCallback(this);
            this.surface = surfaceView.getHolder().getSurface();
            this.width = surfaceView.getWidth();
            this.height = surfaceView.getHeight();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            synchronized (this) {
                this.width = i2;
                this.height = i3;
                Surface surface = surfaceHolder.getSurface();
                Surface surface2 = this.surface;
                if (surface2 == null || !surface2.equals(surface)) {
                    this.surface = surface;
                    this.eglSurface = null;
                }
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            synchronized (this) {
                this.surface = null;
                this.eglSurface = null;
                this.width = -1;
                this.height = -1;
            }
        }

        public void maybeRenderToSurfaceView(VideoFrameProcessingTaskExecutor.Task task, GlObjectsProvider glObjectsProvider) throws VideoFrameProcessingException, GlUtil.GlException {
            synchronized (this) {
                Surface surface = this.surface;
                if (surface == null) {
                    return;
                }
                if (this.eglSurface == null) {
                    this.eglSurface = glObjectsProvider.createEglSurface(this.eglDisplay, surface, this.outputColorTransfer, false);
                }
                EGLSurface eGLSurface = this.eglSurface;
                GlUtil.focusEglSurface(this.eglDisplay, this.eglContext, eGLSurface, this.width, this.height);
                task.run();
                EGL14.eglSwapBuffers(this.eglDisplay, eGLSurface);
                GLES20.glFinish();
            }
        }
    }
}
