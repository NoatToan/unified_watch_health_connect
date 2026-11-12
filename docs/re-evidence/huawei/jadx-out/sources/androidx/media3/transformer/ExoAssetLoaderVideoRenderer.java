package androidx.media3.transformer;

import android.media.MediaCodec;
import android.view.Surface;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes21.dex */
final class ExoAssetLoaderVideoRenderer extends ExoAssetLoaderBaseRenderer {
    private static final String TAG = "ExoAssetLoaderVideoRenderer";
    private final List<Long> decodeOnlyPresentationTimestamps;
    private final Codec.DecoderFactory decoderFactory;
    private final boolean flattenForSlowMotion;
    private final int hdrMode;
    private int maxDecoderPendingFrameCount;
    private SefSlowMotionFlattener sefVideoSlowMotionFlattener;

    public ExoAssetLoaderVideoRenderer(boolean z, Codec.DecoderFactory decoderFactory, int i, TransformerMediaClock transformerMediaClock, AssetLoader.Listener listener) {
        super(2, transformerMediaClock, listener);
        this.flattenForSlowMotion = z;
        this.decoderFactory = decoderFactory;
        this.hdrMode = i;
        this.decodeOnlyPresentationTimestamps = new ArrayList();
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String getName() {
        return TAG;
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    protected Format overrideInputFormat(Format format) {
        return (this.hdrMode == 3 && ColorInfo.isTransferHdr(format.colorInfo)) ? format.buildUpon().setColorInfo(ColorInfo.SDR_BT709_LIMITED).build() : format;
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    protected Format overrideOutputFormat(Format format) {
        return format.buildUpon().setColorInfo(TransformerUtil.getDecoderOutputColor(TransformerUtil.getValidColor(format.colorInfo), this.hdrMode == 1)).build();
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    protected void onInputFormatRead(Format format) {
        if (this.flattenForSlowMotion) {
            this.sefVideoSlowMotionFlattener = new SefSlowMotionFlattener(format);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    protected void initDecoder(Format format) throws ExportException {
        boolean z;
        Assertions.checkStateNotNull(this.sampleConsumer);
        if (ColorInfo.isTransferHdr(format.colorInfo)) {
            z = this.hdrMode == 1;
        }
        this.decoder = this.decoderFactory.createForVideoDecoding(format, (Surface) Assertions.checkNotNull(this.sampleConsumer.getInputSurface()), z);
        this.maxDecoderPendingFrameCount = this.decoder.getMaxPendingFrameCount();
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    protected boolean shouldDropInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        if (decoderInputBuffer.isEndOfStream()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.data);
        if (this.sefVideoSlowMotionFlattener != null) {
            if (this.sefVideoSlowMotionFlattener.dropOrTransformSample(byteBuffer, decoderInputBuffer.timeUs - this.streamOffsetUs)) {
                byteBuffer.clear();
                return true;
            }
            decoderInputBuffer.timeUs = this.streamOffsetUs + this.sefVideoSlowMotionFlattener.getSamplePresentationTimeUs();
        }
        if (this.decoder == null) {
            decoderInputBuffer.timeUs -= this.streamStartPositionUs;
            if (decoderInputBuffer.timeUs < 0) {
                decoderInputBuffer.clear();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    protected void onDecoderInputReady(DecoderInputBuffer decoderInputBuffer) {
        if (decoderInputBuffer.timeUs < getLastResetPositionUs()) {
            this.decodeOnlyPresentationTimestamps.add(Long.valueOf(decoderInputBuffer.timeUs));
        }
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    @RequiresNonNull({"sampleConsumer", "decoder"})
    protected boolean feedConsumerFromDecoder() throws ExportException {
        if (this.decoder.isEnded()) {
            this.sampleConsumer.signalEndOfVideoInput();
            this.isEnded = true;
            return false;
        }
        MediaCodec.BufferInfo outputBufferInfo = this.decoder.getOutputBufferInfo();
        if (outputBufferInfo == null) {
            return false;
        }
        long j = outputBufferInfo.presentationTimeUs - this.streamStartPositionUs;
        if (j < 0 || isDecodeOnlyBuffer(outputBufferInfo.presentationTimeUs)) {
            this.decoder.releaseOutputBuffer(false);
            return true;
        }
        if (this.sampleConsumer.getPendingVideoFrameCount() == this.maxDecoderPendingFrameCount || !this.sampleConsumer.registerVideoFrame(j)) {
            return false;
        }
        this.decoder.releaseOutputBuffer(j);
        return true;
    }

    private boolean isDecodeOnlyBuffer(long j) {
        int size = this.decodeOnlyPresentationTimestamps.size();
        for (int i = 0; i < size; i++) {
            if (this.decodeOnlyPresentationTimestamps.get(i).longValue() == j) {
                this.decodeOnlyPresentationTimestamps.remove(i);
                return true;
            }
        }
        return false;
    }
}
