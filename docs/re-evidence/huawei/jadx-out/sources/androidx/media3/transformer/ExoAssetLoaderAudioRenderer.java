package androidx.media3.transformer;

import android.media.MediaCodec;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes21.dex */
final class ExoAssetLoaderAudioRenderer extends ExoAssetLoaderBaseRenderer {
    private static final String TAG = "ExoAssetLoaderAudioRenderer";
    private final Codec.DecoderFactory decoderFactory;
    private boolean hasPendingConsumerInput;

    public ExoAssetLoaderAudioRenderer(Codec.DecoderFactory decoderFactory, TransformerMediaClock transformerMediaClock, AssetLoader.Listener listener) {
        super(1, transformerMediaClock, listener);
        this.decoderFactory = decoderFactory;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String getName() {
        return TAG;
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    protected void initDecoder(Format format) throws ExportException {
        this.decoder = this.decoderFactory.createForAudioDecoding(format);
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    protected boolean shouldDropInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        if (decoderInputBuffer.isEndOfStream()) {
            return false;
        }
        decoderInputBuffer.timeUs -= this.streamStartPositionUs;
        if (this.decoder == null || decoderInputBuffer.timeUs >= 0) {
            return false;
        }
        decoderInputBuffer.clear();
        return true;
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    @RequiresNonNull({"sampleConsumer", "decoder"})
    protected boolean feedConsumerFromDecoder() throws ExportException {
        DecoderInputBuffer inputBuffer = this.sampleConsumer.getInputBuffer();
        if (inputBuffer == null) {
            return false;
        }
        if (!this.hasPendingConsumerInput) {
            if (this.decoder.isEnded()) {
                ((ByteBuffer) Assertions.checkNotNull(inputBuffer.data)).limit(0);
                inputBuffer.addFlag(4);
                this.isEnded = this.sampleConsumer.queueInputBuffer();
                return false;
            }
            ByteBuffer outputBuffer = this.decoder.getOutputBuffer();
            if (outputBuffer == null) {
                return false;
            }
            inputBuffer.ensureSpaceForWrite(outputBuffer.limit());
            inputBuffer.data.put(outputBuffer).flip();
            MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) Assertions.checkNotNull(this.decoder.getOutputBufferInfo());
            inputBuffer.timeUs = bufferInfo.presentationTimeUs;
            inputBuffer.setFlags(bufferInfo.flags);
            this.decoder.releaseOutputBuffer(false);
            this.hasPendingConsumerInput = true;
        }
        if (!this.sampleConsumer.queueInputBuffer()) {
            return false;
        }
        this.hasPendingConsumerInput = false;
        return true;
    }
}
