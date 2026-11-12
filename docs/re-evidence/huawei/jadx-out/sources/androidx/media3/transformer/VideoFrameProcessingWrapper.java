package androidx.media3.transformer;

import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.FrameInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.OnInputFrameProcessedListener;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.effect.Presentation;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes21.dex */
final class VideoFrameProcessingWrapper implements GraphInput {
    private final long initialTimestampOffsetUs;
    private final AtomicLong mediaItemOffsetUs = new AtomicLong();
    final Presentation presentation;
    private final VideoFrameProcessor videoFrameProcessor;

    public VideoFrameProcessingWrapper(VideoFrameProcessor videoFrameProcessor, Presentation presentation, long j) {
        this.videoFrameProcessor = videoFrameProcessor;
        this.initialTimestampOffsetUs = j;
        this.presentation = presentation;
    }

    @Override // androidx.media3.transformer.OnMediaItemChangedListener
    public void onMediaItemChanged(EditedMediaItem editedMediaItem, long j, Format format, boolean z) {
        long durationAfterEffectsApplied = editedMediaItem.getDurationAfterEffectsApplied(j);
        if (format != null) {
            Size decodedSize = getDecodedSize(format);
            this.videoFrameProcessor.registerInputStream(getInputType((String) Assertions.checkNotNull(format.sampleMimeType)), createEffectListWithPresentation(editedMediaItem.effects.videoEffects, this.presentation), new FrameInfo.Builder((ColorInfo) Assertions.checkNotNull(format.colorInfo), decodedSize.getWidth(), decodedSize.getHeight()).setPixelWidthHeightRatio(format.pixelWidthHeightRatio).setOffsetToAddUs(this.initialTimestampOffsetUs + this.mediaItemOffsetUs.get()).build());
        }
        this.mediaItemOffsetUs.addAndGet(durationAfterEffectsApplied);
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public int queueInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator) {
        return this.videoFrameProcessor.queueInputBitmap(bitmap, timestampIterator) ? 1 : 2;
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public void setOnInputFrameProcessedListener(OnInputFrameProcessedListener onInputFrameProcessedListener) {
        this.videoFrameProcessor.setOnInputFrameProcessedListener(onInputFrameProcessedListener);
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public int queueInputTexture(int i, long j) {
        return this.videoFrameProcessor.queueInputTexture(i, j) ? 1 : 2;
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public Surface getInputSurface() {
        return this.videoFrameProcessor.getInputSurface();
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public int getPendingVideoFrameCount() {
        return this.videoFrameProcessor.getPendingInputFrameCount();
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public boolean registerVideoFrame(long j) {
        return this.videoFrameProcessor.registerInputFrame();
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public void signalEndOfVideoInput() {
        this.videoFrameProcessor.signalEndOfInput();
    }

    public void release() {
        this.videoFrameProcessor.release();
    }

    private static Size getDecodedSize(Format format) {
        return new Size(format.rotationDegrees % 180 == 0 ? format.width : format.height, format.rotationDegrees % 180 == 0 ? format.height : format.width);
    }

    private static ImmutableList<Effect> createEffectListWithPresentation(List<Effect> list, Presentation presentation) {
        if (presentation == null) {
            return ImmutableList.copyOf((Collection) list);
        }
        ImmutableList.c cVar = new ImmutableList.c();
        cVar.addAll(list).add(presentation);
        return cVar.build();
    }

    private static int getInputType(String str) {
        if (MimeTypes.isImage(str)) {
            return 2;
        }
        if (str.equals(MimeTypes.VIDEO_RAW)) {
            return 3;
        }
        if (MimeTypes.isVideo(str)) {
            return 1;
        }
        throw new IllegalArgumentException("MIME type not supported " + str);
    }
}
