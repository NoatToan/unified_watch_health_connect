package androidx.media3.transformer;

import android.content.Context;
import android.media.MediaCodec;
import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.SurfaceInfo;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.effect.VideoCompositorSettings;
import defpackage.aqx;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes21.dex */
final class VideoSampleExporter extends SampleExporter {
    private static final String TAG = "VideoSampleExporter";
    private final DecoderInputBuffer encoderOutputBuffer;
    private final EncoderWrapper encoderWrapper;
    private volatile long finalFramePresentationTimeUs;
    private boolean hasMuxedTimestampZero;
    private final long initialTimestampOffsetUs;
    private final TransformerVideoGraph videoGraph;

    public VideoSampleExporter(Context context, Format format, TransformationRequest transformationRequest, VideoCompositorSettings videoCompositorSettings, List<Effect> list, VideoFrameProcessor.Factory factory, Codec.EncoderFactory encoderFactory, MuxerWrapper muxerWrapper, Consumer<ExportException> consumer, FallbackListener fallbackListener, DebugViewProvider debugViewProvider, long j, boolean z) throws ExportException {
        ColorInfo colorInfoBuild;
        TransformerVideoGraph.Factory factory2;
        super(format, muxerWrapper);
        this.initialTimestampOffsetUs = j;
        this.finalFramePresentationTimeUs = C.TIME_UNSET;
        ColorInfo colorInfo = (ColorInfo) Assertions.checkNotNull(format.colorInfo);
        if (colorInfo.colorTransfer != 2) {
            colorInfoBuild = colorInfo;
        } else if (Objects.equals(format.sampleMimeType, MimeTypes.IMAGE_JPEG_R)) {
            colorInfoBuild = new ColorInfo.Builder().setColorSpace(6).setColorTransfer(7).setColorRange(1).build();
        } else {
            colorInfoBuild = ColorInfo.SDR_BT709_LIMITED;
        }
        EncoderWrapper encoderWrapper = new EncoderWrapper(encoderFactory, format.buildUpon().setColorInfo(colorInfoBuild).build(), muxerWrapper.getSupportedSampleMimeTypes(2), transformationRequest, fallbackListener);
        this.encoderWrapper = encoderWrapper;
        this.encoderOutputBuffer = new DecoderInputBuffer(0);
        ColorInfo colorInfo2 = (encoderWrapper.getHdrModeAfterFallback() == 2 && ColorInfo.isTransferHdr(colorInfo)) ? ColorInfo.SDR_BT709_LIMITED : colorInfoBuild;
        try {
            if (z) {
                factory2 = new TransformerMultipleInputVideoGraph.Factory();
            } else {
                factory2 = new TransformerSingleInputVideoGraph.Factory(factory);
            }
            VideoGraphWrapper videoGraphWrapper = new VideoGraphWrapper(context, factory2, colorInfo2, consumer, debugViewProvider, videoCompositorSettings, list);
            this.videoGraph = videoGraphWrapper;
            videoGraphWrapper.initialize();
        } catch (VideoFrameProcessingException e) {
            throw ExportException.createForVideoFrameProcessingException(e);
        }
    }

    @Override // androidx.media3.transformer.SampleExporter
    public GraphInput getInput(EditedMediaItem editedMediaItem, Format format, int i) throws ExportException {
        try {
            return this.videoGraph.createInput(i);
        } catch (VideoFrameProcessingException e) {
            throw ExportException.createForVideoFrameProcessingException(e);
        }
    }

    @Override // androidx.media3.transformer.SampleExporter
    public void release() {
        this.videoGraph.release();
        this.encoderWrapper.release();
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected Format getMuxerInputFormat() throws ExportException {
        return this.encoderWrapper.getOutputFormat();
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected DecoderInputBuffer getMuxerInputBuffer() throws ExportException {
        this.encoderOutputBuffer.data = this.encoderWrapper.getOutputBuffer();
        if (this.encoderOutputBuffer.data == null) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) Assertions.checkNotNull(this.encoderWrapper.getOutputBufferInfo());
        if (bufferInfo.presentationTimeUs == 0) {
            if (this.videoGraph.hasProducedFrameWithTimestampZero() == this.hasMuxedTimestampZero && this.finalFramePresentationTimeUs != C.TIME_UNSET && bufferInfo.size > 0) {
                bufferInfo.presentationTimeUs = this.finalFramePresentationTimeUs;
            } else {
                this.hasMuxedTimestampZero = true;
            }
        }
        this.encoderOutputBuffer.timeUs = bufferInfo.presentationTimeUs;
        this.encoderOutputBuffer.setFlags(bufferInfo.flags);
        return this.encoderOutputBuffer;
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected void releaseMuxerInputBuffer() throws ExportException {
        this.encoderWrapper.releaseOutputBuffer(false);
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected boolean isMuxerInputEnded() {
        return this.encoderWrapper.isEnded();
    }

    static final class EncoderWrapper {
        private static final String DEFAULT_OUTPUT_MIME_TYPE = "video/hevc";
        private volatile Codec encoder;
        private final Codec.EncoderFactory encoderFactory;
        private SurfaceInfo encoderSurfaceInfo;
        private final FallbackListener fallbackListener;
        private final int hdrModeAfterFallback;
        private final Format inputFormat;
        private final List<String> muxerSupportedMimeTypes;
        private volatile int outputRotationDegrees;
        private volatile boolean releaseEncoder;
        private final String requestedOutputMimeType;
        private final TransformationRequest transformationRequest;

        public EncoderWrapper(Codec.EncoderFactory encoderFactory, Format format, List<String> list, TransformationRequest transformationRequest, FallbackListener fallbackListener) {
            Assertions.checkArgument(format.colorInfo != null);
            this.encoderFactory = encoderFactory;
            this.inputFormat = format;
            this.muxerSupportedMimeTypes = list;
            this.transformationRequest = transformationRequest;
            this.fallbackListener = fallbackListener;
            Pair<String, Integer> requestedOutputMimeTypeAndHdrModeAfterFallback = getRequestedOutputMimeTypeAndHdrModeAfterFallback(format, transformationRequest);
            this.requestedOutputMimeType = (String) requestedOutputMimeTypeAndHdrModeAfterFallback.first;
            this.hdrModeAfterFallback = ((Integer) requestedOutputMimeTypeAndHdrModeAfterFallback.second).intValue();
        }

        private static Pair<String, Integer> getRequestedOutputMimeTypeAndHdrModeAfterFallback(Format format, TransformationRequest transformationRequest) {
            String str = (String) Assertions.checkNotNull(format.sampleMimeType);
            if (transformationRequest.videoMimeType != null) {
                str = transformationRequest.videoMimeType;
            } else if (MimeTypes.isImage(str)) {
                str = "video/hevc";
            }
            return TransformerUtil.getOutputMimeTypeAndHdrModeAfterFallback(transformationRequest.hdrMode, str, format.colorInfo);
        }

        public int getHdrModeAfterFallback() {
            return this.hdrModeAfterFallback;
        }

        public SurfaceInfo getSurfaceInfo(int i, int i2) throws ExportException {
            if (this.releaseEncoder) {
                return null;
            }
            SurfaceInfo surfaceInfo = this.encoderSurfaceInfo;
            if (surfaceInfo != null) {
                return surfaceInfo;
            }
            if (i < i2) {
                this.outputRotationDegrees = 90;
            } else {
                i2 = i;
                i = i2;
            }
            if (this.inputFormat.rotationDegrees % 180 == this.outputRotationDegrees % 180) {
                this.outputRotationDegrees = this.inputFormat.rotationDegrees;
            }
            Format formatBuild = new Format.Builder().setWidth(i2).setHeight(i).setRotationDegrees(0).setFrameRate(this.inputFormat.frameRate).setSampleMimeType(this.requestedOutputMimeType).setColorInfo(getSupportedInputColor()).setCodecs(this.inputFormat.codecs).build();
            this.encoder = this.encoderFactory.createForVideoEncoding(formatBuild.buildUpon().setSampleMimeType(SampleExporter.findSupportedMimeTypeForEncoderAndMuxer(formatBuild, this.muxerSupportedMimeTypes)).build());
            Format configurationFormat = this.encoder.getConfigurationFormat();
            this.fallbackListener.onTransformationRequestFinalized(createSupportedTransformationRequest(this.transformationRequest, this.outputRotationDegrees != 0, formatBuild, configurationFormat, this.hdrModeAfterFallback));
            this.encoderSurfaceInfo = new SurfaceInfo(this.encoder.getInputSurface(), configurationFormat.width, configurationFormat.height, this.outputRotationDegrees);
            if (this.releaseEncoder) {
                this.encoder.release();
            }
            return this.encoderSurfaceInfo;
        }

        private ColorInfo getSupportedInputColor() {
            if (ColorInfo.isTransferHdr(this.inputFormat.colorInfo) && this.hdrModeAfterFallback != 0) {
                return ColorInfo.SDR_BT709_LIMITED;
            }
            if (ColorInfo.SRGB_BT709_FULL.equals(this.inputFormat.colorInfo)) {
                return ColorInfo.SDR_BT709_LIMITED;
            }
            return (ColorInfo) Assertions.checkNotNull(this.inputFormat.colorInfo);
        }

        @Pure
        private static TransformationRequest createSupportedTransformationRequest(TransformationRequest transformationRequest, boolean z, Format format, Format format2, int i) {
            TransformationRequest.Builder builderBuildUpon = transformationRequest.buildUpon();
            if (transformationRequest.hdrMode != i) {
                builderBuildUpon.setHdrMode(i);
            }
            if (!Util.areEqual(format.sampleMimeType, format2.sampleMimeType)) {
                builderBuildUpon.setVideoMimeType(format2.sampleMimeType);
            }
            if (z) {
                if (format.width != format2.width) {
                    builderBuildUpon.setResolution(format2.width);
                }
            } else if (format.height != format2.height) {
                builderBuildUpon.setResolution(format2.height);
            }
            return builderBuildUpon.build();
        }

        public void signalEndOfInputStream() throws ExportException {
            if (this.encoder != null) {
                this.encoder.signalEndOfInputStream();
            }
        }

        public Format getOutputFormat() throws ExportException {
            if (this.encoder == null) {
                return null;
            }
            Format outputFormat = this.encoder.getOutputFormat();
            return (outputFormat == null || this.outputRotationDegrees == 0) ? outputFormat : outputFormat.buildUpon().setRotationDegrees(this.outputRotationDegrees).build();
        }

        public ByteBuffer getOutputBuffer() throws ExportException {
            if (this.encoder != null) {
                return this.encoder.getOutputBuffer();
            }
            return null;
        }

        public MediaCodec.BufferInfo getOutputBufferInfo() throws ExportException {
            if (this.encoder != null) {
                return this.encoder.getOutputBufferInfo();
            }
            return null;
        }

        public void releaseOutputBuffer(boolean z) throws ExportException {
            if (this.encoder != null) {
                this.encoder.releaseOutputBuffer(z);
            }
        }

        public boolean isEnded() {
            return this.encoder != null && this.encoder.isEnded();
        }

        public void release() {
            if (this.encoder != null) {
                this.encoder.release();
            }
            this.releaseEncoder = true;
        }
    }

    final class VideoGraphWrapper implements TransformerVideoGraph, VideoGraph.Listener {
        private final Consumer<ExportException> errorConsumer;
        private final TransformerVideoGraph videoGraph;

        @Override // androidx.media3.common.VideoGraph.Listener
        public void onOutputFrameAvailableForRendering(long j) {
        }

        public VideoGraphWrapper(Context context, TransformerVideoGraph.Factory factory, ColorInfo colorInfo, Consumer<ExportException> consumer, DebugViewProvider debugViewProvider, VideoCompositorSettings videoCompositorSettings, List<Effect> list) throws VideoFrameProcessingException {
            this.errorConsumer = consumer;
            this.videoGraph = factory.create(context, colorInfo, debugViewProvider, this, aqx.e(), videoCompositorSettings, list, VideoSampleExporter.this.initialTimestampOffsetUs);
        }

        @Override // androidx.media3.common.VideoGraph.Listener
        public void onOutputSizeChanged(int i, int i2) {
            SurfaceInfo surfaceInfo;
            try {
                surfaceInfo = VideoSampleExporter.this.encoderWrapper.getSurfaceInfo(i, i2);
            } catch (ExportException e) {
                this.errorConsumer.accept(e);
                surfaceInfo = null;
            }
            setOutputSurfaceInfo(surfaceInfo);
        }

        @Override // androidx.media3.common.VideoGraph.Listener
        public void onEnded(long j) {
            VideoSampleExporter.this.finalFramePresentationTimeUs = j;
            try {
                VideoSampleExporter.this.encoderWrapper.signalEndOfInputStream();
            } catch (ExportException e) {
                this.errorConsumer.accept(e);
            }
        }

        @Override // androidx.media3.common.VideoGraph.Listener
        public void onError(VideoFrameProcessingException videoFrameProcessingException) {
            this.errorConsumer.accept(ExportException.createForVideoFrameProcessingException(videoFrameProcessingException));
        }

        @Override // androidx.media3.common.VideoGraph
        public void initialize() throws VideoFrameProcessingException {
            this.videoGraph.initialize();
        }

        @Override // androidx.media3.common.VideoGraph
        public void registerInput(int i) throws VideoFrameProcessingException {
            this.videoGraph.registerInput(i);
        }

        @Override // androidx.media3.common.VideoGraph
        public VideoFrameProcessor getProcessor(int i) {
            return this.videoGraph.getProcessor(i);
        }

        @Override // androidx.media3.transformer.TransformerVideoGraph
        public GraphInput createInput(int i) throws VideoFrameProcessingException {
            return this.videoGraph.createInput(i);
        }

        @Override // androidx.media3.common.VideoGraph
        public void setOutputSurfaceInfo(SurfaceInfo surfaceInfo) {
            this.videoGraph.setOutputSurfaceInfo(surfaceInfo);
        }

        @Override // androidx.media3.common.VideoGraph
        public boolean hasProducedFrameWithTimestampZero() {
            return this.videoGraph.hasProducedFrameWithTimestampZero();
        }

        @Override // androidx.media3.common.VideoGraph
        public void release() {
            this.videoGraph.release();
        }
    }
}
