package androidx.media3.transformer;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.effect.DebugTraceUtil;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes21.dex */
public final class DefaultCodec implements Codec {
    public static final int DEFAULT_PCM_ENCODING = 2;
    private static final String TAG = "DefaultCodec";
    private final Format configurationFormat;
    private final MediaFormat configurationMediaFormat;
    private int inputBufferIndex;
    private boolean inputStreamEnded;
    private final Surface inputSurface;
    private final boolean isDecoder;
    private final boolean isVideo;
    private final int maxPendingFrameCount;
    private final MediaCodec mediaCodec;
    private ByteBuffer outputBuffer;
    private int outputBufferIndex;
    private final MediaCodec.BufferInfo outputBufferInfo;
    private Format outputFormat;
    private boolean outputStreamEnded;
    private final AtomicBoolean videoOutputStarted;

    public DefaultCodec(Context context, Format format, MediaFormat mediaFormat, String str, boolean z, Surface surface) throws ExportException {
        Exception exc;
        MediaCodec mediaCodecCreateByCodecName;
        int i;
        this.configurationFormat = format;
        this.configurationMediaFormat = mediaFormat;
        this.isDecoder = z;
        boolean zIsVideo = MimeTypes.isVideo((String) Assertions.checkNotNull(format.sampleMimeType));
        this.isVideo = zIsVideo;
        this.outputBufferInfo = new MediaCodec.BufferInfo();
        this.inputBufferIndex = -1;
        this.outputBufferIndex = -1;
        this.videoOutputStarted = new AtomicBoolean();
        DebugTraceUtil.logCodecEvent(z, zIsVideo, DebugTraceUtil.EVENT_INPUT_FORMAT, C.TIME_UNSET, "%s", format);
        boolean zIsSdrToneMappingEnabled = isSdrToneMappingEnabled(mediaFormat);
        Surface surfaceCreateInputSurface = null;
        try {
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                configureCodec(mediaCodecCreateByCodecName, mediaFormat, z, surface);
                if (zIsSdrToneMappingEnabled) {
                    Assertions.checkArgument(isSdrToneMappingEnabled(mediaCodecCreateByCodecName.getInputFormat()), "Tone-mapping requested but not supported by the decoder.");
                }
                if (zIsVideo && !z) {
                    surfaceCreateInputSurface = mediaCodecCreateByCodecName.createInputSurface();
                }
                startCodec(mediaCodecCreateByCodecName);
                this.mediaCodec = mediaCodecCreateByCodecName;
                this.inputSurface = surfaceCreateInputSurface;
                this.maxPendingFrameCount = Util.getMaxPendingFramesCountForMediaCodecDecoders(context);
            } catch (Exception e) {
                exc = e;
                Log.d(TAG, "MediaCodec error", exc);
                if (surfaceCreateInputSurface != null) {
                    surfaceCreateInputSurface.release();
                }
                if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                if ((exc instanceof IOException) || (exc instanceof MediaCodec.CodecException)) {
                    i = z ? 3001 : 4001;
                } else {
                    i = exc instanceof IllegalArgumentException ? z ? 3003 : 4003 : 1001;
                }
                throw createExportException(mediaFormat, this.isVideo, z, exc, i, str);
            }
        } catch (Exception e2) {
            exc = e2;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // androidx.media3.transformer.Codec
    public Format getConfigurationFormat() {
        return this.configurationFormat;
    }

    @Override // androidx.media3.transformer.Codec
    public Surface getInputSurface() {
        return (Surface) Assertions.checkStateNotNull(this.inputSurface);
    }

    @Override // androidx.media3.transformer.Codec
    public int getMaxPendingFrameCount() {
        return this.maxPendingFrameCount;
    }

    @Override // androidx.media3.transformer.Codec
    @EnsuresNonNullIf(expression = {"#1.data"}, result = true)
    public boolean maybeDequeueInputBuffer(DecoderInputBuffer decoderInputBuffer) throws ExportException {
        if (this.inputStreamEnded) {
            return false;
        }
        if (this.inputBufferIndex < 0) {
            try {
                int iDequeueInputBuffer = this.mediaCodec.dequeueInputBuffer(0L);
                this.inputBufferIndex = iDequeueInputBuffer;
                if (iDequeueInputBuffer < 0) {
                    return false;
                }
                try {
                    decoderInputBuffer.data = this.mediaCodec.getInputBuffer(iDequeueInputBuffer);
                    decoderInputBuffer.clear();
                } catch (RuntimeException e) {
                    Log.d(TAG, "MediaCodec error", e);
                    throw createExportException(e);
                }
            } catch (RuntimeException e2) {
                Log.d(TAG, "MediaCodec error", e2);
                throw createExportException(e2);
            }
        }
        Assertions.checkNotNull(decoderInputBuffer.data);
        return true;
    }

    @Override // androidx.media3.transformer.Codec
    public void queueInputBuffer(DecoderInputBuffer decoderInputBuffer) throws ExportException {
        int iPosition;
        int iRemaining;
        int i;
        int i2;
        boolean z = true;
        Assertions.checkState(!this.inputStreamEnded, "Input buffer can not be queued after the input stream has ended.");
        int i3 = 0;
        if (decoderInputBuffer.data == null || !decoderInputBuffer.data.hasRemaining()) {
            iPosition = 0;
            iRemaining = 0;
        } else {
            iPosition = decoderInputBuffer.data.position();
            iRemaining = decoderInputBuffer.data.remaining();
        }
        long j = decoderInputBuffer.timeUs;
        if (decoderInputBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            debugTraceLogEvent(DebugTraceUtil.EVENT_INPUT_ENDED, Long.MIN_VALUE);
            if (this.isDecoder) {
                if (decoderInputBuffer.data != null && decoderInputBuffer.data.hasRemaining()) {
                    z = false;
                }
                Assertions.checkState(z);
                j = 0;
                iRemaining = 0;
            } else {
                i3 = iPosition;
            }
            i2 = 4;
            i = i3;
        } else {
            i = iPosition;
            i2 = 0;
        }
        int i4 = iRemaining;
        long j2 = j;
        try {
            this.mediaCodec.queueInputBuffer(this.inputBufferIndex, i, i4, j2, i2);
            debugTraceLogEvent(DebugTraceUtil.EVENT_ACCEPTED_INPUT, j2, "bytes=%s", Integer.valueOf(i4));
            this.inputBufferIndex = -1;
            decoderInputBuffer.data = null;
        } catch (RuntimeException e) {
            Log.d(TAG, "MediaCodec error", e);
            throw createExportException(e);
        }
    }

    @Override // androidx.media3.transformer.Codec
    public void signalEndOfInputStream() throws ExportException {
        if (!this.videoOutputStarted.get()) {
            try {
                Thread.sleep(30L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        debugTraceLogEvent(DebugTraceUtil.EVENT_INPUT_ENDED, Long.MIN_VALUE);
        try {
            this.mediaCodec.signalEndOfInputStream();
        } catch (RuntimeException e) {
            Log.d(TAG, "MediaCodec error", e);
            throw createExportException(e);
        }
    }

    @Override // androidx.media3.transformer.Codec
    public Format getOutputFormat() throws ExportException {
        maybeDequeueOutputBuffer(false);
        return this.outputFormat;
    }

    @Override // androidx.media3.transformer.Codec
    public ByteBuffer getOutputBuffer() throws ExportException {
        if (!maybeDequeueOutputBuffer(true)) {
            return null;
        }
        debugTraceLogEvent(DebugTraceUtil.EVENT_PRODUCED_OUTPUT, this.outputBufferInfo.presentationTimeUs, "bytesOutput=%s", Integer.valueOf(this.outputBufferInfo.size));
        return this.outputBuffer;
    }

    @Override // androidx.media3.transformer.Codec
    public MediaCodec.BufferInfo getOutputBufferInfo() throws ExportException {
        if (maybeDequeueOutputBuffer(false)) {
            return this.outputBufferInfo;
        }
        return null;
    }

    @Override // androidx.media3.transformer.Codec
    public void releaseOutputBuffer(boolean z) throws ExportException {
        releaseOutputBuffer(z, ((MediaCodec.BufferInfo) Assertions.checkStateNotNull(this.outputBufferInfo)).presentationTimeUs);
    }

    @Override // androidx.media3.transformer.Codec
    public void releaseOutputBuffer(long j) throws ExportException {
        releaseOutputBuffer(true, j);
    }

    protected void releaseOutputBuffer(boolean z, long j) throws ExportException {
        this.outputBuffer = null;
        try {
            if (z) {
                this.mediaCodec.releaseOutputBuffer(this.outputBufferIndex, 1000 * j);
                debugTraceLogEvent(DebugTraceUtil.EVENT_PRODUCED_OUTPUT, j);
            } else {
                this.mediaCodec.releaseOutputBuffer(this.outputBufferIndex, false);
            }
            this.outputBufferIndex = -1;
        } catch (RuntimeException e) {
            Log.d(TAG, "MediaCodec error", e);
            throw createExportException(e);
        }
    }

    @Override // androidx.media3.transformer.Codec
    public boolean isEnded() {
        return this.outputStreamEnded && this.outputBufferIndex == -1;
    }

    @Override // androidx.media3.transformer.Codec
    public void release() {
        this.outputBuffer = null;
        Surface surface = this.inputSurface;
        if (surface != null) {
            surface.release();
        }
        this.mediaCodec.release();
    }

    @Override // androidx.media3.transformer.Codec
    public String getName() {
        return Util.SDK_INT >= 29 ? Api29.getCanonicalName(this.mediaCodec) : this.mediaCodec.getName();
    }

    MediaFormat getConfigurationMediaFormat() {
        return this.configurationMediaFormat;
    }

    private boolean maybeDequeueOutputBuffer(boolean z) throws ExportException {
        if (this.outputBufferIndex >= 0) {
            return true;
        }
        if (this.outputStreamEnded) {
            return false;
        }
        try {
            int iDequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(this.outputBufferInfo, 0L);
            this.outputBufferIndex = iDequeueOutputBuffer;
            if (iDequeueOutputBuffer < 0) {
                if (iDequeueOutputBuffer == -2) {
                    this.outputFormat = convertToFormat(this.mediaCodec.getOutputFormat(), this.isDecoder, this.configurationFormat.metadata);
                    if (this.isDecoder && Objects.equals(this.configurationFormat.sampleMimeType, MimeTypes.AUDIO_RAW)) {
                        this.outputFormat = this.outputFormat.buildUpon().setChannelCount(this.configurationFormat.channelCount).setPcmEncoding(this.configurationFormat.pcmEncoding).build();
                    }
                    if (!this.isDecoder && this.isVideo) {
                        this.videoOutputStarted.set(true);
                    }
                    debugTraceLogEvent(DebugTraceUtil.EVENT_OUTPUT_FORMAT, this.outputBufferInfo.presentationTimeUs, "%s", this.outputFormat);
                }
                return false;
            }
            if ((this.outputBufferInfo.flags & 4) != 0) {
                this.outputStreamEnded = true;
                debugTraceLogEvent(DebugTraceUtil.EVENT_OUTPUT_ENDED, Long.MIN_VALUE);
                if (this.outputBufferInfo.size == 0) {
                    releaseOutputBuffer(false);
                    return false;
                }
                this.outputBufferInfo.flags &= -5;
            }
            if ((this.outputBufferInfo.flags & 2) != 0) {
                releaseOutputBuffer(false);
                return false;
            }
            if (z) {
                try {
                    ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(this.mediaCodec.getOutputBuffer(this.outputBufferIndex));
                    this.outputBuffer = byteBuffer;
                    byteBuffer.position(this.outputBufferInfo.offset);
                    this.outputBuffer.limit(this.outputBufferInfo.offset + this.outputBufferInfo.size);
                } catch (RuntimeException e) {
                    Log.d(TAG, "MediaCodec error", e);
                    throw createExportException(e);
                }
            }
            return true;
        } catch (RuntimeException e2) {
            Log.d(TAG, "MediaCodec error", e2);
            throw createExportException(e2);
        }
    }

    private ExportException createExportException(Exception exc) {
        MediaFormat mediaFormat = this.configurationMediaFormat;
        boolean z = this.isVideo;
        boolean z2 = this.isDecoder;
        return createExportException(mediaFormat, z, z2, exc, z2 ? 3002 : 4002, getName());
    }

    private static ExportException createExportException(MediaFormat mediaFormat, boolean z, boolean z2, Exception exc, int i, String str) {
        return ExportException.createForCodec(exc, i, new ExportException.CodecInfo(mediaFormat.toString(), z, z2, str));
    }

    private static Format convertToFormat(MediaFormat mediaFormat, boolean z, Metadata metadata) {
        Format formatCreateFormatFromMediaFormat = MediaFormatUtil.createFormatFromMediaFormat(mediaFormat);
        Format.Builder metadata2 = formatCreateFormatFromMediaFormat.buildUpon().setMetadata(metadata);
        if (z && formatCreateFormatFromMediaFormat.pcmEncoding == -1 && Objects.equals(formatCreateFormatFromMediaFormat.sampleMimeType, MimeTypes.AUDIO_RAW)) {
            metadata2.setPcmEncoding(2);
        }
        return metadata2.build();
    }

    private static void configureCodec(MediaCodec mediaCodec, MediaFormat mediaFormat, boolean z, Surface surface) {
        TraceUtil.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, !z ? 1 : 0);
        TraceUtil.endSection();
    }

    private static void startCodec(MediaCodec mediaCodec) {
        TraceUtil.beginSection("startCodec");
        mediaCodec.start();
        TraceUtil.endSection();
    }

    private static boolean isSdrToneMappingEnabled(MediaFormat mediaFormat) {
        return Util.SDK_INT >= 31 && MediaFormatUtil.getInteger(mediaFormat, "color-transfer-request", 0) == 3;
    }

    private void debugTraceLogEvent(String str, long j) {
        debugTraceLogEvent(str, j, "", new Object[0]);
    }

    private void debugTraceLogEvent(String str, long j, String str2, Object... objArr) {
        DebugTraceUtil.logCodecEvent(this.isDecoder, this.isVideo, str, j, str2, objArr);
    }

    static final class Api29 {
        private Api29() {
        }

        public static String getCanonicalName(MediaCodec mediaCodec) {
            return mediaCodec.getCanonicalName();
        }
    }
}
