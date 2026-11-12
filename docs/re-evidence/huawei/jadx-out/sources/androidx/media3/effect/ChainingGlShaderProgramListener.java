package androidx.media3.effect;

import androidx.media3.common.GlObjectsProvider;
import androidx.media3.common.GlTextureInfo;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class ChainingGlShaderProgramListener implements GlShaderProgram.InputListener, GlShaderProgram.OutputListener {
    private final FrameConsumptionManager frameConsumptionManager;
    private final GlShaderProgram producingGlShaderProgram;
    private final VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor;

    public ChainingGlShaderProgramListener(GlObjectsProvider glObjectsProvider, GlShaderProgram glShaderProgram, GlShaderProgram glShaderProgram2, VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor) {
        this.producingGlShaderProgram = glShaderProgram;
        this.frameConsumptionManager = new FrameConsumptionManager(glObjectsProvider, glShaderProgram2, videoFrameProcessingTaskExecutor);
        this.videoFrameProcessingTaskExecutor = videoFrameProcessingTaskExecutor;
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public void onReadyToAcceptInputFrame() {
        synchronized (this) {
            this.frameConsumptionManager.onReadyToAcceptInputFrame();
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public void onInputFrameProcessed(final GlTextureInfo glTextureInfo) {
        this.videoFrameProcessingTaskExecutor.submit(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.ChainingGlShaderProgramListener$$ExternalSyntheticLambda0
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
                this.f$0.m503xbbe1aa34(glTextureInfo);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onInputFrameProcessed$0$androidx-media3-effect-ChainingGlShaderProgramListener, reason: not valid java name */
    /* synthetic */ void m503xbbe1aa34(GlTextureInfo glTextureInfo) throws VideoFrameProcessingException, GlUtil.GlException {
        this.producingGlShaderProgram.releaseOutputFrame(glTextureInfo);
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public void onFlush() {
        synchronized (this) {
            this.frameConsumptionManager.onFlush();
            VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor = this.videoFrameProcessingTaskExecutor;
            final GlShaderProgram glShaderProgram = this.producingGlShaderProgram;
            Objects.requireNonNull(glShaderProgram);
            videoFrameProcessingTaskExecutor.submit(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.ChainingGlShaderProgramListener$$ExternalSyntheticLambda1
                @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                public final void run() {
                    glShaderProgram.flush();
                }
            });
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram.OutputListener
    public void onOutputFrameAvailable(GlTextureInfo glTextureInfo, long j) {
        synchronized (this) {
            this.frameConsumptionManager.queueInputFrame(glTextureInfo, j);
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram.OutputListener
    public void onCurrentOutputStreamEnded() {
        synchronized (this) {
            this.frameConsumptionManager.signalEndOfCurrentStream();
        }
    }
}
