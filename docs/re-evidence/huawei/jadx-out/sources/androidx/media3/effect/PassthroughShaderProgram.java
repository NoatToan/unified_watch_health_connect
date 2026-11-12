package androidx.media3.effect;

import androidx.media3.common.GlObjectsProvider;
import androidx.media3.common.GlTextureInfo;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.Assertions;
import defpackage.aqx;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes21.dex */
public class PassthroughShaderProgram implements GlShaderProgram {
    private GlShaderProgram.InputListener inputListener = new GlShaderProgram.InputListener() { // from class: androidx.media3.effect.PassthroughShaderProgram.1
    };
    private GlShaderProgram.OutputListener outputListener = new GlShaderProgram.OutputListener() { // from class: androidx.media3.effect.PassthroughShaderProgram.2
    };
    private GlShaderProgram.ErrorListener errorListener = new GlShaderProgram.ErrorListener() { // from class: androidx.media3.effect.PassthroughShaderProgram$$ExternalSyntheticLambda0
        @Override // androidx.media3.effect.GlShaderProgram.ErrorListener
        public final void onError(VideoFrameProcessingException videoFrameProcessingException) {
            PassthroughShaderProgram.lambda$new$0(videoFrameProcessingException);
        }
    };
    private Executor errorListenerExecutor = aqx.e();
    private int texIdInUse = -1;

    static /* synthetic */ void lambda$new$0(VideoFrameProcessingException videoFrameProcessingException) {
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setInputListener(GlShaderProgram.InputListener inputListener) {
        this.inputListener = inputListener;
        if (this.texIdInUse == -1) {
            inputListener.onReadyToAcceptInputFrame();
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setOutputListener(GlShaderProgram.OutputListener outputListener) {
        this.outputListener = outputListener;
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setErrorListener(Executor executor, GlShaderProgram.ErrorListener errorListener) {
        this.errorListenerExecutor = executor;
        this.errorListener = errorListener;
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void queueInputFrame(GlObjectsProvider glObjectsProvider, GlTextureInfo glTextureInfo, long j) {
        this.texIdInUse = glTextureInfo.texId;
        this.outputListener.onOutputFrameAvailable(glTextureInfo, j);
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void releaseOutputFrame(GlTextureInfo glTextureInfo) {
        Assertions.checkState(glTextureInfo.texId == this.texIdInUse);
        this.texIdInUse = -1;
        this.inputListener.onInputFrameProcessed(glTextureInfo);
        this.inputListener.onReadyToAcceptInputFrame();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void signalEndOfCurrentInputStream() {
        this.outputListener.onCurrentOutputStreamEnded();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void flush() {
        this.texIdInUse = -1;
        this.inputListener.onFlush();
        this.inputListener.onReadyToAcceptInputFrame();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void release() throws VideoFrameProcessingException {
        this.texIdInUse = -1;
    }

    protected final GlShaderProgram.InputListener getInputListener() {
        return this.inputListener;
    }

    protected final void onError(final Exception exc) {
        this.errorListenerExecutor.execute(new Runnable() { // from class: androidx.media3.effect.PassthroughShaderProgram$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m539lambda$onError$1$androidxmedia3effectPassthroughShaderProgram(exc);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onError$1$androidx-media3-effect-PassthroughShaderProgram, reason: not valid java name */
    /* synthetic */ void m539lambda$onError$1$androidxmedia3effectPassthroughShaderProgram(Exception exc) {
        this.errorListener.onError(VideoFrameProcessingException.from(exc));
    }
}
