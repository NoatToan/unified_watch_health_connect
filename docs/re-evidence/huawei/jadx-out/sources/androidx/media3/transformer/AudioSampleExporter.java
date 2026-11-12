package androidx.media3.transformer;

import android.media.MediaCodec;
import androidx.media3.common.Format;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.effect.DebugTraceUtil;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes21.dex */
final class AudioSampleExporter extends SampleExporter {
    private final AudioGraph audioGraph;
    private final Codec encoder;
    private final AudioProcessor.AudioFormat encoderInputAudioFormat;
    private final DecoderInputBuffer encoderInputBuffer;
    private final DecoderInputBuffer encoderOutputBuffer;
    private long encoderTotalInputBytes;
    private final AudioGraphInput firstInput;
    private final Format firstInputFormat;
    private boolean returnedFirstInput;

    public AudioSampleExporter(Format format, Format format2, TransformationRequest transformationRequest, EditedMediaItem editedMediaItem, ImmutableList<AudioProcessor> immutableList, AudioMixer.Factory factory, Codec.EncoderFactory encoderFactory, MuxerWrapper muxerWrapper, FallbackListener fallbackListener) throws ExportException {
        String str;
        super(format, muxerWrapper);
        AudioGraph audioGraph = new AudioGraph(factory, immutableList);
        this.audioGraph = audioGraph;
        this.firstInputFormat = format2;
        this.firstInput = audioGraph.registerInput(editedMediaItem, format2);
        AudioProcessor.AudioFormat outputAudioFormat = audioGraph.getOutputAudioFormat();
        this.encoderInputAudioFormat = outputAudioFormat;
        Assertions.checkState(!outputAudioFormat.equals(AudioProcessor.AudioFormat.NOT_SET));
        Format.Builder builder = new Format.Builder();
        if (transformationRequest.audioMimeType != null) {
            str = transformationRequest.audioMimeType;
        } else {
            str = (String) Assertions.checkNotNull(format.sampleMimeType);
        }
        Format formatBuild = builder.setSampleMimeType(str).setSampleRate(outputAudioFormat.sampleRate).setChannelCount(outputAudioFormat.channelCount).setPcmEncoding(outputAudioFormat.encoding).setCodecs(format2.codecs).build();
        Codec codecCreateForAudioEncoding = encoderFactory.createForAudioEncoding(formatBuild.buildUpon().setSampleMimeType(findSupportedMimeTypeForEncoderAndMuxer(formatBuild, muxerWrapper.getSupportedSampleMimeTypes(1))).build());
        this.encoder = codecCreateForAudioEncoding;
        this.encoderInputBuffer = new DecoderInputBuffer(0);
        this.encoderOutputBuffer = new DecoderInputBuffer(0);
        fallbackListener.onTransformationRequestFinalized(createFallbackTransformationRequest(transformationRequest, formatBuild, codecCreateForAudioEncoding.getConfigurationFormat()));
    }

    @Override // androidx.media3.transformer.SampleExporter
    public AudioGraphInput getInput(EditedMediaItem editedMediaItem, Format format, int i) throws ExportException {
        if (!this.returnedFirstInput) {
            this.returnedFirstInput = true;
            Assertions.checkState(format.equals(this.firstInputFormat));
            return this.firstInput;
        }
        return this.audioGraph.registerInput(editedMediaItem, format);
    }

    @Override // androidx.media3.transformer.SampleExporter
    public void release() {
        this.audioGraph.reset();
        this.encoder.release();
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected boolean processDataUpToMuxer() throws ExportException {
        ByteBuffer output = this.audioGraph.getOutput();
        if (!this.encoder.maybeDequeueInputBuffer(this.encoderInputBuffer)) {
            return false;
        }
        if (this.audioGraph.isEnded()) {
            DebugTraceUtil.logEvent(DebugTraceUtil.COMPONENT_AUDIO_GRAPH, DebugTraceUtil.EVENT_OUTPUT_ENDED, Long.MIN_VALUE);
            queueEndOfStreamToEncoder();
            return false;
        }
        if (!output.hasRemaining()) {
            return false;
        }
        feedEncoder(output);
        return true;
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected Format getMuxerInputFormat() throws ExportException {
        return this.encoder.getOutputFormat();
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected DecoderInputBuffer getMuxerInputBuffer() throws ExportException {
        this.encoderOutputBuffer.data = this.encoder.getOutputBuffer();
        if (this.encoderOutputBuffer.data == null) {
            return null;
        }
        this.encoderOutputBuffer.timeUs = ((MediaCodec.BufferInfo) Assertions.checkNotNull(this.encoder.getOutputBufferInfo())).presentationTimeUs;
        this.encoderOutputBuffer.setFlags(1);
        return this.encoderOutputBuffer;
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected void releaseMuxerInputBuffer() throws ExportException {
        this.encoder.releaseOutputBuffer(false);
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected boolean isMuxerInputEnded() {
        return this.encoder.isEnded();
    }

    private void feedEncoder(ByteBuffer byteBuffer) throws ExportException {
        ByteBuffer byteBuffer2 = (ByteBuffer) Assertions.checkNotNull(this.encoderInputBuffer.data);
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + byteBuffer2.capacity()));
        byteBuffer2.put(byteBuffer);
        this.encoderInputBuffer.timeUs = getOutputAudioDurationUs();
        this.encoderTotalInputBytes += (long) byteBuffer2.position();
        this.encoderInputBuffer.setFlags(0);
        this.encoderInputBuffer.flip();
        byteBuffer.limit(iLimit);
        this.encoder.queueInputBuffer(this.encoderInputBuffer);
    }

    private void queueEndOfStreamToEncoder() throws ExportException {
        Assertions.checkState(((ByteBuffer) Assertions.checkNotNull(this.encoderInputBuffer.data)).position() == 0);
        this.encoderInputBuffer.timeUs = getOutputAudioDurationUs();
        this.encoderInputBuffer.addFlag(4);
        this.encoderInputBuffer.flip();
        this.encoder.queueInputBuffer(this.encoderInputBuffer);
    }

    @Pure
    private static TransformationRequest createFallbackTransformationRequest(TransformationRequest transformationRequest, Format format, Format format2) {
        return Util.areEqual(format.sampleMimeType, format2.sampleMimeType) ? transformationRequest : transformationRequest.buildUpon().setAudioMimeType(format2.sampleMimeType).build();
    }

    private long getOutputAudioDurationUs() {
        return ((this.encoderTotalInputBytes / ((long) this.encoderInputAudioFormat.bytesPerFrame)) * 1000000) / ((long) this.encoderInputAudioFormat.sampleRate);
    }
}
