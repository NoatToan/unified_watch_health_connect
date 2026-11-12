package androidx.media3.effect;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class FrameConsumptionManager$$ExternalSyntheticLambda0 implements VideoFrameProcessingTaskExecutor.Task {
    public final /* synthetic */ GlShaderProgram f$0;

    @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
    public final void run() {
        this.f$0.signalEndOfCurrentInputStream();
    }
}
