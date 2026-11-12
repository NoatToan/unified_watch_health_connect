package androidx.media3.effect;

import android.graphics.Bitmap;
import androidx.media3.common.FrameInfo;
import androidx.media3.common.GlObjectsProvider;
import androidx.media3.common.GlTextureInfo;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.Util$$ExternalSyntheticApiModelOutline0;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
final class BitmapTextureManager extends TextureManager {
    private boolean currentInputStreamEnded;
    private GlTextureInfo currentSdrGlTextureInfo;
    private int downstreamShaderProgramCapacity;
    private final GlObjectsProvider glObjectsProvider;
    private boolean isNextFrameInTexture;
    private final Queue<BitmapFrameSequenceInfo> pendingBitmaps;
    private RepeatingGainmapShaderProgram repeatingGainmapShaderProgram;
    private final boolean signalRepeatingSequence;

    @Override // androidx.media3.effect.TextureManager
    public int getPendingFrameCount() {
        return 0;
    }

    public BitmapTextureManager(GlObjectsProvider glObjectsProvider, VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor, boolean z) {
        super(videoFrameProcessingTaskExecutor);
        this.glObjectsProvider = glObjectsProvider;
        this.pendingBitmaps = new LinkedBlockingQueue();
        this.signalRepeatingSequence = z;
    }

    @Override // androidx.media3.effect.TextureManager
    public void setSamplingGlShaderProgram(GlShaderProgram glShaderProgram) {
        Assertions.checkState(glShaderProgram instanceof RepeatingGainmapShaderProgram);
        this.downstreamShaderProgramCapacity = 0;
        this.repeatingGainmapShaderProgram = (RepeatingGainmapShaderProgram) glShaderProgram;
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public void onReadyToAcceptInputFrame() {
        this.videoFrameProcessingTaskExecutor.submit(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.BitmapTextureManager$$ExternalSyntheticLambda3
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
                this.f$0.m499x5ebd0098();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onReadyToAcceptInputFrame$0$androidx-media3-effect-BitmapTextureManager, reason: not valid java name */
    /* synthetic */ void m499x5ebd0098() throws VideoFrameProcessingException, GlUtil.GlException {
        this.downstreamShaderProgramCapacity++;
        maybeQueueToShaderProgram();
    }

    @Override // androidx.media3.effect.TextureManager
    public void queueInputBitmap(final Bitmap bitmap, final FrameInfo frameInfo, final TimestampIterator timestampIterator) {
        this.videoFrameProcessingTaskExecutor.submit(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.BitmapTextureManager$$ExternalSyntheticLambda6
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
                this.f$0.m500xfa552d11(bitmap, frameInfo, timestampIterator);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$queueInputBitmap$1$androidx-media3-effect-BitmapTextureManager, reason: not valid java name */
    /* synthetic */ void m500xfa552d11(Bitmap bitmap, FrameInfo frameInfo, TimestampIterator timestampIterator) throws VideoFrameProcessingException, GlUtil.GlException {
        setupBitmap(bitmap, frameInfo, timestampIterator);
        this.currentInputStreamEnded = false;
    }

    @Override // androidx.media3.effect.TextureManager
    public void signalEndOfCurrentInputStream() {
        this.videoFrameProcessingTaskExecutor.submit(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.BitmapTextureManager$$ExternalSyntheticLambda4
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
                this.f$0.m502x7939514b();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$signalEndOfCurrentInputStream$2$androidx-media3-effect-BitmapTextureManager, reason: not valid java name */
    /* synthetic */ void m502x7939514b() throws VideoFrameProcessingException, GlUtil.GlException {
        if (this.pendingBitmaps.isEmpty()) {
            ((RepeatingGainmapShaderProgram) Assertions.checkNotNull(this.repeatingGainmapShaderProgram)).signalEndOfCurrentInputStream();
            DebugTraceUtil.logEvent(DebugTraceUtil.COMPONENT_BITMAP_TEXTURE_MANAGER, DebugTraceUtil.EVENT_SIGNAL_EOS, Long.MIN_VALUE);
        } else {
            this.currentInputStreamEnded = true;
        }
    }

    @Override // androidx.media3.effect.TextureManager
    public void release() {
        this.videoFrameProcessingTaskExecutor.submit(new VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.BitmapTextureManager$$ExternalSyntheticLambda5
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
                this.f$0.m501lambda$release$3$androidxmedia3effectBitmapTextureManager();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$release$3$androidx-media3-effect-BitmapTextureManager, reason: not valid java name */
    /* synthetic */ void m501lambda$release$3$androidxmedia3effectBitmapTextureManager() throws VideoFrameProcessingException, GlUtil.GlException {
        GlTextureInfo glTextureInfo = this.currentSdrGlTextureInfo;
        if (glTextureInfo != null) {
            glTextureInfo.release();
        }
        this.pendingBitmaps.clear();
    }

    private void setupBitmap(Bitmap bitmap, FrameInfo frameInfo, TimestampIterator timestampIterator) throws VideoFrameProcessingException {
        Assertions.checkArgument(timestampIterator.hasNext(), "Bitmap queued but no timestamps provided.");
        this.pendingBitmaps.add(new BitmapFrameSequenceInfo(bitmap, frameInfo, timestampIterator));
        maybeQueueToShaderProgram();
    }

    private void maybeQueueToShaderProgram() throws VideoFrameProcessingException {
        if (this.pendingBitmaps.isEmpty() || this.downstreamShaderProgramCapacity == 0) {
            return;
        }
        BitmapFrameSequenceInfo bitmapFrameSequenceInfoElement = this.pendingBitmaps.element();
        FrameInfo frameInfo = bitmapFrameSequenceInfoElement.frameInfo;
        TimestampIterator timestampIterator = bitmapFrameSequenceInfoElement.inStreamOffsetsUs;
        Assertions.checkState(bitmapFrameSequenceInfoElement.inStreamOffsetsUs.hasNext());
        long next = bitmapFrameSequenceInfoElement.frameInfo.offsetToAddUs + timestampIterator.next();
        if (!this.isNextFrameInTexture) {
            this.isNextFrameInTexture = true;
            updateCurrentGlTextureInfo(frameInfo, bitmapFrameSequenceInfoElement.bitmap);
        }
        this.downstreamShaderProgramCapacity--;
        ((RepeatingGainmapShaderProgram) Assertions.checkNotNull(this.repeatingGainmapShaderProgram)).queueInputFrame(this.glObjectsProvider, (GlTextureInfo) Assertions.checkNotNull(this.currentSdrGlTextureInfo), next);
        DebugTraceUtil.logEvent(DebugTraceUtil.COMPONENT_VFP, DebugTraceUtil.EVENT_QUEUE_BITMAP, next, "%dx%d", Integer.valueOf(frameInfo.width), Integer.valueOf(frameInfo.height));
        if (bitmapFrameSequenceInfoElement.inStreamOffsetsUs.hasNext()) {
            return;
        }
        this.isNextFrameInTexture = false;
        this.pendingBitmaps.remove().bitmap.recycle();
        if (this.pendingBitmaps.isEmpty() && this.currentInputStreamEnded) {
            ((RepeatingGainmapShaderProgram) Assertions.checkNotNull(this.repeatingGainmapShaderProgram)).signalEndOfCurrentInputStream();
            DebugTraceUtil.logEvent(DebugTraceUtil.COMPONENT_BITMAP_TEXTURE_MANAGER, DebugTraceUtil.EVENT_SIGNAL_EOS, Long.MIN_VALUE);
            this.currentInputStreamEnded = false;
        }
    }

    @Override // androidx.media3.effect.TextureManager
    protected void flush() throws VideoFrameProcessingException {
        this.pendingBitmaps.clear();
        this.isNextFrameInTexture = false;
        this.currentInputStreamEnded = false;
        this.downstreamShaderProgramCapacity = 0;
        GlTextureInfo glTextureInfo = this.currentSdrGlTextureInfo;
        if (glTextureInfo != null) {
            try {
                glTextureInfo.release();
                this.currentSdrGlTextureInfo = null;
            } catch (GlUtil.GlException e) {
                throw VideoFrameProcessingException.from(e);
            }
        }
        super.flush();
    }

    private void updateCurrentGlTextureInfo(FrameInfo frameInfo, Bitmap bitmap) throws VideoFrameProcessingException {
        try {
            GlTextureInfo glTextureInfo = this.currentSdrGlTextureInfo;
            if (glTextureInfo != null) {
                glTextureInfo.release();
            }
            this.currentSdrGlTextureInfo = new GlTextureInfo(GlUtil.createTexture(bitmap), -1, -1, frameInfo.width, frameInfo.height);
            if (Util.SDK_INT >= 34 && bitmap.hasGainmap()) {
                ((RepeatingGainmapShaderProgram) Assertions.checkNotNull(this.repeatingGainmapShaderProgram)).setGainmap(Util$$ExternalSyntheticApiModelOutline0.m477m(Assertions.checkNotNull(bitmap.getGainmap())));
            }
            if (this.signalRepeatingSequence) {
                ((RepeatingGainmapShaderProgram) Assertions.checkNotNull(this.repeatingGainmapShaderProgram)).signalNewRepeatingFrameSequence();
            }
        } catch (GlUtil.GlException e) {
            throw VideoFrameProcessingException.from(e);
        }
    }

    static final class BitmapFrameSequenceInfo {
        public final Bitmap bitmap;
        private final FrameInfo frameInfo;
        private final TimestampIterator inStreamOffsetsUs;

        public BitmapFrameSequenceInfo(Bitmap bitmap, FrameInfo frameInfo, TimestampIterator timestampIterator) {
            this.bitmap = bitmap;
            this.frameInfo = frameInfo;
            this.inStreamOffsetsUs = timestampIterator;
        }
    }
}
