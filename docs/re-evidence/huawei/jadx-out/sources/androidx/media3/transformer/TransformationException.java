package androidx.media3.transformer;

import androidx.media3.common.Format;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableBiMap;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes21.dex */
@Deprecated
public final class TransformationException extends Exception {
    public static final int ERROR_CODE_AUDIO_PROCESSING_FAILED = 6001;
    public static final int ERROR_CODE_DECODER_INIT_FAILED = 3001;
    public static final int ERROR_CODE_DECODING_FAILED = 3002;
    public static final int ERROR_CODE_DECODING_FORMAT_UNSUPPORTED = 3003;
    public static final int ERROR_CODE_ENCODER_INIT_FAILED = 4001;
    public static final int ERROR_CODE_ENCODING_FAILED = 4002;
    public static final int ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED = 4003;
    public static final int ERROR_CODE_FAILED_RUNTIME_CHECK = 1001;
    public static final int ERROR_CODE_IO_BAD_HTTP_STATUS = 2004;
    public static final int ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED = 2007;
    public static final int ERROR_CODE_IO_FILE_NOT_FOUND = 2005;
    public static final int ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE = 2003;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_FAILED = 2001;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT = 2002;
    public static final int ERROR_CODE_IO_NO_PERMISSION = 2006;
    public static final int ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE = 2008;
    public static final int ERROR_CODE_IO_UNSPECIFIED = 2000;
    public static final int ERROR_CODE_MUXING_FAILED = 7001;
    public static final int ERROR_CODE_UNSPECIFIED = 1000;
    public static final int ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED = 5001;
    static final ImmutableBiMap<String, Integer> NAME_TO_ERROR_CODE = new ImmutableBiMap.c().c("ERROR_CODE_FAILED_RUNTIME_CHECK", 1001).c("ERROR_CODE_IO_UNSPECIFIED", 2000).c("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001).c("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002).c("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003).c("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004).c("ERROR_CODE_IO_FILE_NOT_FOUND", 2005).c("ERROR_CODE_IO_NO_PERMISSION", 2006).c("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007).c("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008).c("ERROR_CODE_DECODER_INIT_FAILED", 3001).c("ERROR_CODE_DECODING_FAILED", 3002).c("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003).c("ERROR_CODE_ENCODER_INIT_FAILED", 4001).c("ERROR_CODE_ENCODING_FAILED", 4002).c("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003).c("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001).c("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001).c("ERROR_CODE_MUXING_FAILED", 7001).j();
    public final int errorCode;
    public final long timestampMs;

    /* JADX INFO: loaded from: classes3.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    public static String getErrorCodeName(int i) {
        return NAME_TO_ERROR_CODE.inverse().getOrDefault(Integer.valueOf(i), "invalid error code");
    }

    public String getErrorCodeName() {
        return getErrorCodeName(this.errorCode);
    }

    public static TransformationException createForAssetLoader(Throwable th, int i) {
        return new TransformationException("Asset loader error", th, i);
    }

    public static TransformationException createForCodec(Throwable th, int i, boolean z, boolean z2, Format format) {
        return createForCodec(th, i, z, z2, "format=" + format);
    }

    public static TransformationException createForCodec(Throwable th, int i, boolean z, boolean z2, String str) {
        return new TransformationException((z ? "Video" : "Audio").concat(z2 ? "Decoder" : "Encoder") + " error: " + str, th, i);
    }

    public static TransformationException createForAudioProcessing(Throwable th, AudioProcessor.AudioFormat audioFormat) {
        return new TransformationException("Audio processing error, audio_format=" + audioFormat, th, 6001);
    }

    static TransformationException createForVideoFrameProcessingException(VideoFrameProcessingException videoFrameProcessingException, int i) {
        return new TransformationException("Video frame processing error", videoFrameProcessingException, i);
    }

    static TransformationException createForMuxer(Throwable th, int i) {
        return new TransformationException("Muxer error", th, i);
    }

    public static TransformationException createForUnexpected(Exception exc) {
        if (exc instanceof RuntimeException) {
            return new TransformationException("Unexpected runtime error", exc, 1001);
        }
        return new TransformationException("Unexpected error", exc, 1000);
    }

    private TransformationException(String str, Throwable th, int i) {
        super(str, th);
        this.errorCode = i;
        this.timestampMs = Clock.DEFAULT.elapsedRealtime();
    }

    TransformationException(ExportException exportException) {
        super(exportException.getMessage(), exportException.getCause());
        this.errorCode = exportException.errorCode;
        this.timestampMs = exportException.timestampMs;
    }

    public boolean errorInfoEquals(TransformationException transformationException) {
        if (this == transformationException) {
            return true;
        }
        if (transformationException != null && getClass() == transformationException.getClass()) {
            Throwable cause = getCause();
            Throwable cause2 = transformationException.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!Util.areEqual(cause.getMessage(), cause2.getMessage()) || !Util.areEqual(cause.getClass(), cause2.getClass())) {
                return false;
            }
            if (this.errorCode == transformationException.errorCode && Util.areEqual(getMessage(), transformationException.getMessage()) && this.timestampMs == transformationException.timestampMs) {
                return true;
            }
        }
        return false;
    }
}
