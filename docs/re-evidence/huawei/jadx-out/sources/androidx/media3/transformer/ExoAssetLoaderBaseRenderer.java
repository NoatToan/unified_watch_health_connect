package androidx.media3.transformer;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.MediaClock;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.MediaSource;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes21.dex */
abstract class ExoAssetLoaderBaseRenderer extends BaseRenderer {
    private final AssetLoader.Listener assetLoaderListener;
    protected Codec decoder;
    private final DecoderInputBuffer decoderInputBuffer;
    private boolean hasPendingConsumerInput;
    private Format inputFormat;
    protected boolean isEnded;
    private boolean isRunning;
    private final TransformerMediaClock mediaClock;
    private Format outputFormat;
    protected SampleConsumer sampleConsumer;
    private boolean shouldInitDecoder;
    protected long streamOffsetUs;
    protected long streamStartPositionUs;

    @RequiresNonNull({"sampleConsumer", "decoder"})
    protected abstract boolean feedConsumerFromDecoder() throws ExportException;

    @EnsuresNonNull({"decoder"})
    protected abstract void initDecoder(Format format) throws ExportException;

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    protected void onDecoderInputReady(DecoderInputBuffer decoderInputBuffer) {
    }

    protected void onInputFormatRead(Format format) {
    }

    protected Format overrideInputFormat(Format format) {
        return format;
    }

    protected Format overrideOutputFormat(Format format) {
        return format;
    }

    protected abstract boolean shouldDropInputBuffer(DecoderInputBuffer decoderInputBuffer);

    public ExoAssetLoaderBaseRenderer(int i, TransformerMediaClock transformerMediaClock, AssetLoader.Listener listener) {
        super(i);
        this.mediaClock = transformerMediaClock;
        this.assetLoaderListener = listener;
        this.decoderInputBuffer = new DecoderInputBuffer(0);
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(Format format) {
        return RendererCapabilities.create(MimeTypes.getTrackType(format.sampleMimeType) == getTrackType() ? 4 : 0);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public MediaClock getMediaClock() {
        return this.mediaClock;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.isEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) {
        try {
            if (this.isRunning && !isEnded() && readInputFormatAndInitDecoderIfNeeded()) {
                if (this.decoder != null) {
                    do {
                    } while ((ensureSampleConsumerInitialized() ? feedConsumerFromDecoder() : false) | feedDecoderFromInput());
                } else if (ensureSampleConsumerInitialized()) {
                    while (feedConsumerFromInput()) {
                    }
                }
            }
        } catch (ExportException e) {
            this.isRunning = false;
            this.assetLoaderListener.onError(e);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        this.streamStartPositionUs = j;
        this.streamOffsetUs = j2;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z, boolean z2) {
        this.mediaClock.updateTimeForTrackType(getTrackType(), 0L);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStarted() {
        this.isRunning = true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStopped() {
        this.isRunning = false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onReset() {
        Codec codec = this.decoder;
        if (codec != null) {
            codec.release();
        }
    }

    @EnsuresNonNullIf(expression = {"inputFormat"}, result = true)
    private boolean readInputFormatAndInitDecoderIfNeeded() throws ExportException {
        Format format = this.inputFormat;
        if (format != null && !this.shouldInitDecoder) {
            return true;
        }
        if (format == null) {
            FormatHolder formatHolder = getFormatHolder();
            if (readSource(formatHolder, this.decoderInputBuffer, 2) != -5) {
                return false;
            }
            Format formatOverrideInputFormat = overrideInputFormat((Format) Assertions.checkNotNull(formatHolder.format));
            this.inputFormat = formatOverrideInputFormat;
            onInputFormatRead(formatOverrideInputFormat);
            this.shouldInitDecoder = this.assetLoaderListener.onTrackAdded(this.inputFormat, 3);
        }
        if (this.shouldInitDecoder) {
            if (TransformerUtil.getProcessedTrackType(this.inputFormat.sampleMimeType) == 2 && !ensureSampleConsumerInitialized()) {
                return false;
            }
            initDecoder(this.inputFormat);
            this.shouldInitDecoder = false;
        }
        return true;
    }

    @EnsuresNonNullIf(expression = {"sampleConsumer"}, result = true)
    @RequiresNonNull({"inputFormat"})
    private boolean ensureSampleConsumerInitialized() throws ExportException {
        if (this.sampleConsumer != null) {
            return true;
        }
        if (this.outputFormat == null) {
            if (this.decoder != null && TransformerUtil.getProcessedTrackType(this.inputFormat.sampleMimeType) == 1) {
                Format outputFormat = this.decoder.getOutputFormat();
                if (outputFormat == null) {
                    return false;
                }
                this.outputFormat = overrideOutputFormat(outputFormat);
            } else {
                this.outputFormat = overrideOutputFormat(this.inputFormat);
            }
        }
        SampleConsumer sampleConsumerOnOutputFormat = this.assetLoaderListener.onOutputFormat(this.outputFormat);
        if (sampleConsumerOnOutputFormat == null) {
            return false;
        }
        this.sampleConsumer = sampleConsumerOnOutputFormat;
        return true;
    }

    @RequiresNonNull({"decoder"})
    private boolean feedDecoderFromInput() throws ExportException {
        if (!this.decoder.maybeDequeueInputBuffer(this.decoderInputBuffer) || !readInput(this.decoderInputBuffer)) {
            return false;
        }
        if (shouldDropInputBuffer(this.decoderInputBuffer)) {
            return true;
        }
        onDecoderInputReady(this.decoderInputBuffer);
        this.decoder.queueInputBuffer(this.decoderInputBuffer);
        return true;
    }

    @RequiresNonNull({"sampleConsumer"})
    private boolean feedConsumerFromInput() {
        DecoderInputBuffer inputBuffer = this.sampleConsumer.getInputBuffer();
        if (inputBuffer == null) {
            return false;
        }
        if (!this.hasPendingConsumerInput) {
            if (!readInput(inputBuffer)) {
                return false;
            }
            if (shouldDropInputBuffer(inputBuffer)) {
                return true;
            }
            this.hasPendingConsumerInput = true;
        }
        boolean zIsEndOfStream = inputBuffer.isEndOfStream();
        if (!this.sampleConsumer.queueInputBuffer()) {
            return false;
        }
        this.hasPendingConsumerInput = false;
        this.isEnded = zIsEndOfStream;
        return !zIsEndOfStream;
    }

    private boolean readInput(DecoderInputBuffer decoderInputBuffer) {
        int source = readSource(getFormatHolder(), decoderInputBuffer, 0);
        if (source == -5) {
            throw new IllegalStateException("Format changes are not supported.");
        }
        if (source != -4) {
            return false;
        }
        decoderInputBuffer.flip();
        if (decoderInputBuffer.isEndOfStream()) {
            return true;
        }
        this.mediaClock.updateTimeForTrackType(getTrackType(), decoderInputBuffer.timeUs);
        return true;
    }
}
