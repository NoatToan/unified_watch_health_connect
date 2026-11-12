package androidx.media3.transformer;

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
public final class ExportException extends Exception {
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
    public final CodecInfo codecInfo;
    public final int errorCode;
    public final long timestampMs;
    public static final int ERROR_CODE_MUXING_TIMEOUT = 7002;
    public static final int ERROR_CODE_MUXING_APPEND = 7003;
    static final ImmutableBiMap<String, Integer> NAME_TO_ERROR_CODE = new ImmutableBiMap.c().c("ERROR_CODE_FAILED_RUNTIME_CHECK", 1001).c("ERROR_CODE_IO_UNSPECIFIED", 2000).c("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001).c("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002).c("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003).c("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004).c("ERROR_CODE_IO_FILE_NOT_FOUND", 2005).c("ERROR_CODE_IO_NO_PERMISSION", 2006).c("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007).c("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008).c("ERROR_CODE_DECODER_INIT_FAILED", 3001).c("ERROR_CODE_DECODING_FAILED", 3002).c("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003).c("ERROR_CODE_ENCODER_INIT_FAILED", 4001).c("ERROR_CODE_ENCODING_FAILED", 4002).c("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003).c("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001).c("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001).c("ERROR_CODE_MUXING_FAILED", 7001).c("ERROR_CODE_MUXING_TIMEOUT", Integer.valueOf(ERROR_CODE_MUXING_TIMEOUT)).c("ERROR_CODE_MUXING_APPEND", Integer.valueOf(ERROR_CODE_MUXING_APPEND)).j();

    /* JADX INFO: loaded from: classes3.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    public static final class CodecInfo {
        public final String configurationFormat;
        public final boolean isDecoder;
        public final boolean isVideo;
        public final String name;

        public CodecInfo(String str, boolean z, boolean z2, String str2) {
            this.configurationFormat = str;
            this.isVideo = z;
            this.isDecoder = z2;
            this.name = str2;
        }

        public String toString() {
            return "CodecInfo{type=" + (this.isVideo ? "Video" : "Audio").concat(this.isDecoder ? "Decoder" : "Encoder") + ", configurationFormat=" + this.configurationFormat + ", name=" + this.name + '}';
        }
    }

    public static String getErrorCodeName(int i) {
        return NAME_TO_ERROR_CODE.inverse().getOrDefault(Integer.valueOf(i), "invalid error code");
    }

    public String getErrorCodeName() {
        return getErrorCodeName(this.errorCode);
    }

    public static ExportException createForAssetLoader(Throwable th, int i) {
        return new ExportException("Asset loader error", th, i);
    }

    public static ExportException createForCodec(Throwable th, int i, CodecInfo codecInfo) {
        return new ExportException("Codec exception: " + codecInfo, th, i, codecInfo);
    }

    public static ExportException createForAudioProcessing(AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException, String str) {
        return new ExportException("Audio error: " + str + ", audioFormat=" + unhandledAudioFormatException.inputAudioFormat, unhandledAudioFormatException, 6001);
    }

    static ExportException createForVideoFrameProcessingException(VideoFrameProcessingException videoFrameProcessingException) {
        return new ExportException("Video frame processing error", videoFrameProcessingException, 5001);
    }

    static ExportException createForMuxer(Throwable th, int i) {
        return new ExportException("Muxer error", th, i);
    }

    public static ExportException createForUnexpected(Exception exc) {
        if (exc instanceof RuntimeException) {
            return new ExportException("Unexpected runtime error", exc, 1001);
        }
        return new ExportException("Unexpected error", exc, 1000);
    }

    private ExportException(String str, Throwable th, int i) {
        this(str, th, i, null);
    }

    private ExportException(String str, Throwable th, int i, CodecInfo codecInfo) {
        super(str, th);
        this.errorCode = i;
        this.timestampMs = Clock.DEFAULT.elapsedRealtime();
        this.codecInfo = codecInfo;
    }

    public boolean errorInfoEquals(ExportException exportException) {
        if (this == exportException) {
            return true;
        }
        if (exportException != null && getClass() == exportException.getClass()) {
            Throwable cause = getCause();
            Throwable cause2 = exportException.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!Util.areEqual(cause.getMessage(), cause2.getMessage()) || !Util.areEqual(cause.getClass(), cause2.getClass())) {
                return false;
            }
            if (this.errorCode == exportException.errorCode && Util.areEqual(getMessage(), exportException.getMessage()) && this.timestampMs == exportException.timestampMs) {
                return true;
            }
        }
        return false;
    }
}
