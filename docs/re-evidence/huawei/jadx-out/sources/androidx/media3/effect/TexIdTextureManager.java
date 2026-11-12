package androidx.media3.effect;

import androidx.media3.common.FrameInfo;
import androidx.media3.common.GlObjectsProvider;
import androidx.media3.common.GlTextureInfo;
import androidx.media3.common.OnInputFrameProcessedListener;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.GlUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class TexIdTextureManager extends TextureManager {
    private FrameConsumptionManager frameConsumptionManager;
    private OnInputFrameProcessedListener frameProcessedListener;
    private final GlObjectsProvider glObjectsProvider;
    private FrameInfo inputFrameInfo;

    @Override // androidx.media3.effect.TextureManager
    public void release() {
    }

    public TexIdTextureManager(GlObjectsProvider glObjectsProvider, VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor) {
        super(videoFrameProcessingTaskExecutor);
        this.glObjectsProvider = glObjectsProvider;
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public void onReadyToAcceptInputFrame() {
        Assertions.checkNotNull(this.frameConsumptionManager);
        VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor = this.videoFrameProcessingTaskExecutor;
        final FrameConsumptionManager frameConsumptionManager = this.frameConsumptionManager;
        Objects.requireNonNull(frameConsumptionManager);
        videoFrameProcessingTaskExecutor.submit(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.TexIdTextureManager$$ExternalSyntheticLambda3
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() {
                frameConsumptionManager.onReadyToAcceptInputFrame();
            }
        });
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public void onInputFrameProcessed(final GlTextureInfo glTextureInfo) {
        this.videoFrameProcessingTaskExecutor.submit(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.TexIdTextureManager$$ExternalSyntheticLambda2
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
                this.f$0.m545x4089f4fb(glTextureInfo);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onInputFrameProcessed$0$androidx-media3-effect-TexIdTextureManager, reason: not valid java name */
    /* synthetic */ void m545x4089f4fb(GlTextureInfo glTextureInfo) throws VideoFrameProcessingException, GlUtil.GlException {
        ((OnInputFrameProcessedListener) Assertions.checkNotNull(this.frameProcessedListener)).onInputFrameProcessed(glTextureInfo.texId, GlUtil.createGlSyncFence());
    }

    @Override // androidx.media3.effect.TextureManager
    public void setSamplingGlShaderProgram(GlShaderProgram glShaderProgram) {
        this.frameConsumptionManager = new FrameConsumptionManager(this.glObjectsProvider, glShaderProgram, this.videoFrameProcessingTaskExecutor);
    }

    @Override // androidx.media3.effect.TextureManager
    public void queueInputTexture(final int i, final long j) {
        final FrameInfo frameInfo = (FrameInfo) Assertions.checkNotNull(this.inputFrameInfo);
        Assertions.checkNotNull(this.frameProcessedListener);
        this.videoFrameProcessingTaskExecutor.submit(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.TexIdTextureManager$$ExternalSyntheticLambda1
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
                this.f$0.m546x6f71c964(i, frameInfo, j);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$queueInputTexture$1$androidx-media3-effect-TexIdTextureManager, reason: not valid java name */
    /* synthetic */ void m546x6f71c964(int i, FrameInfo frameInfo, long j) throws VideoFrameProcessingException, GlUtil.GlException {
        ((FrameConsumptionManager) Assertions.checkNotNull(this.frameConsumptionManager)).queueInputFrame(new GlTextureInfo(i, -1, -1, frameInfo.width, frameInfo.height), j);
        DebugTraceUtil.logEvent(DebugTraceUtil.COMPONENT_VFP, DebugTraceUtil.EVENT_QUEUE_TEXTURE, j, "%dx%d", Integer.valueOf(frameInfo.width), Integer.valueOf(frameInfo.height));
    }

    @Override // androidx.media3.effect.TextureManager
    public void setOnInputFrameProcessedListener(OnInputFrameProcessedListener onInputFrameProcessedListener) {
        this.frameProcessedListener = onInputFrameProcessedListener;
    }

    @Override // androidx.media3.effect.TextureManager
    public void setInputFrameInfo(FrameInfo frameInfo) {
        this.inputFrameInfo = frameInfo;
    }

    @Override // androidx.media3.effect.TextureManager
    public int getPendingFrameCount() {
        return ((FrameConsumptionManager) Assertions.checkNotNull(this.frameConsumptionManager)).getPendingFrameCount();
    }

    @Override // androidx.media3.effect.TextureManager
    public void signalEndOfCurrentInputStream() {
        this.videoFrameProcessingTaskExecutor.submit(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.TexIdTextureManager$$ExternalSyntheticLambda0
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
                this.f$0.m547x4d1e00ea();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$signalEndOfCurrentInputStream$2$androidx-media3-effect-TexIdTextureManager, reason: not valid java name */
    /* synthetic */ void m547x4d1e00ea() throws VideoFrameProcessingException, GlUtil.GlException {
        ((FrameConsumptionManager) Assertions.checkNotNull(this.frameConsumptionManager)).signalEndOfCurrentStream();
        DebugTraceUtil.logEvent(DebugTraceUtil.COMPONENT_TEX_ID_TEXTURE_MANAGER, DebugTraceUtil.EVENT_SIGNAL_EOS, Long.MIN_VALUE);
    }

    @Override // androidx.media3.effect.TextureManager
    protected void flush() throws VideoFrameProcessingException {
        synchronized (this) {
            ((FrameConsumptionManager) Assertions.checkNotNull(this.frameConsumptionManager)).onFlush();
            super.flush();
        }
    }
}
