package androidx.media3.effect;

import android.util.Pair;
import androidx.media3.common.GlObjectsProvider;
import androidx.media3.common.GlTextureInfo;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
final class FrameConsumptionManager implements GlShaderProgram.InputListener {
    private final Queue<Pair<GlTextureInfo, Long>> availableFrames = new ArrayDeque();
    private final GlShaderProgram consumingGlShaderProgram;
    private int consumingGlShaderProgramInputCapacity;
    private final GlObjectsProvider glObjectsProvider;
    private final VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor;

    public FrameConsumptionManager(GlObjectsProvider glObjectsProvider, GlShaderProgram glShaderProgram, VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor) {
        this.glObjectsProvider = glObjectsProvider;
        this.consumingGlShaderProgram = glShaderProgram;
        this.videoFrameProcessingTaskExecutor = videoFrameProcessingTaskExecutor;
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public void onReadyToAcceptInputFrame() {
        synchronized (this) {
            final Pair<GlTextureInfo, Long> pairPoll = this.availableFrames.poll();
            if (pairPoll == null) {
                this.consumingGlShaderProgramInputCapacity++;
                return;
            }
            this.videoFrameProcessingTaskExecutor.submit(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.FrameConsumptionManager$$ExternalSyntheticLambda2
                @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
                    this.f$0.m532xd81ce908(pairPoll);
                }
            });
            Pair<GlTextureInfo, Long> pairPeek = this.availableFrames.peek();
            if (pairPeek != null && ((Long) pairPeek.second).longValue() == Long.MIN_VALUE) {
                VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor = this.videoFrameProcessingTaskExecutor;
                GlShaderProgram glShaderProgram = this.consumingGlShaderProgram;
                Objects.requireNonNull(glShaderProgram);
                videoFrameProcessingTaskExecutor.submit(new FrameConsumptionManager$$ExternalSyntheticLambda0(glShaderProgram));
                this.availableFrames.remove();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$onReadyToAcceptInputFrame$0$androidx-media3-effect-FrameConsumptionManager, reason: not valid java name */
    /* synthetic */ void m532xd81ce908(Pair pair) throws VideoFrameProcessingException, GlUtil.GlException {
        this.consumingGlShaderProgram.queueInputFrame(this.glObjectsProvider, (GlTextureInfo) pair.first, ((Long) pair.second).longValue());
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public void onFlush() {
        synchronized (this) {
            this.consumingGlShaderProgramInputCapacity = 0;
            this.availableFrames.clear();
        }
    }

    public void queueInputFrame(final GlTextureInfo glTextureInfo, final long j) {
        synchronized (this) {
            if (this.consumingGlShaderProgramInputCapacity > 0) {
                this.videoFrameProcessingTaskExecutor.submit(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.FrameConsumptionManager$$ExternalSyntheticLambda1
                    @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                    public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
                        this.f$0.m533x6311f25d(glTextureInfo, j);
                    }
                });
                this.consumingGlShaderProgramInputCapacity--;
            } else {
                this.availableFrames.add(Pair.create(glTextureInfo, Long.valueOf(j)));
            }
        }
    }

    /* JADX INFO: renamed from: lambda$queueInputFrame$1$androidx-media3-effect-FrameConsumptionManager, reason: not valid java name */
    /* synthetic */ void m533x6311f25d(GlTextureInfo glTextureInfo, long j) throws VideoFrameProcessingException, GlUtil.GlException {
        this.consumingGlShaderProgram.queueInputFrame(this.glObjectsProvider, glTextureInfo, j);
    }

    public void signalEndOfCurrentStream() {
        synchronized (this) {
            if (!this.availableFrames.isEmpty()) {
                this.availableFrames.add(Pair.create(GlTextureInfo.UNSET, Long.MIN_VALUE));
            } else {
                VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor = this.videoFrameProcessingTaskExecutor;
                GlShaderProgram glShaderProgram = this.consumingGlShaderProgram;
                Objects.requireNonNull(glShaderProgram);
                videoFrameProcessingTaskExecutor.submit(new FrameConsumptionManager$$ExternalSyntheticLambda0(glShaderProgram));
            }
        }
    }

    public int getPendingFrameCount() {
        int size;
        synchronized (this) {
            size = this.availableFrames.size();
        }
        return size;
    }
}
