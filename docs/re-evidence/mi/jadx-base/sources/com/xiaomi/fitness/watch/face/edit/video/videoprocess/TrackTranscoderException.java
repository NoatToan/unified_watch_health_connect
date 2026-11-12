package com.xiaomi.fitness.watch.face.edit.video.videoprocess;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import androidx.annotation.RequiresApi;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class TrackTranscoderException extends MediaTransformationException {
    private static final String CODEC_IN_RELEASED_STATE_ERROR_TEXT = "Codecs are in released state.";
    private static final String DECODER_CONFIGURATION_ERROR_TEXT = "Failed to configure decoder codec.";
    private static final String DECODER_FORMAT_NOT_FOUND_ERROR_TEXT = "Failed to create decoder codec.";
    private static final String DECODER_NOT_FOUND_ERROR_TEXT = "No decoder found.";
    private static final String DECODER_NOT_PROVIDED_TEXT = "Decoder is not provided";
    private static final String ENCODER_CONFIGURATION_ERROR_TEXT = "Failed to configure encoder codec.";
    private static final String ENCODER_FORMAT_NOT_FOUND_ERROR_TEXT = "Failed to create encoder codec.";
    private static final String ENCODER_NOT_FOUND_ERROR_TEXT = "No encoder found.";
    private static final String ENCODER_NOT_PROVIDED_TEXT = "Encoder is not provided";
    private static final String INTERNAL_CODEC_ERROR_TEXT = "Internal codec error occurred.";
    private static final String NO_FRAME_AVAILABLE_ERROR_TEXT = "No frame available for specified tag";
    private static final String NO_TRACKS_FOUND_ERROR_TEXT = "No tracks found.";
    private static final String RENDERER_NOT_PROVIDED_TEXT = "Renderer is not provided";
    private static final String SOURCE_TRACK_MIME_TYPE_NOT_FOUND_ERROR_TEXT = "Mime type not found for the source track.";
    private static final String TAG = "com.xiaomi.fitness.watch.face.edit.video.videoprocess.TrackTranscoderException";
    private final Error error;
    private final MediaCodec mediaCodec;
    private final MediaCodecList mediaCodecList;
    private final MediaFormat mediaFormat;

    public enum Error {
        DECODER_FORMAT_NOT_FOUND(TrackTranscoderException.DECODER_FORMAT_NOT_FOUND_ERROR_TEXT),
        DECODER_CONFIGURATION_ERROR(TrackTranscoderException.DECODER_CONFIGURATION_ERROR_TEXT),
        ENCODER_FORMAT_NOT_FOUND(TrackTranscoderException.ENCODER_FORMAT_NOT_FOUND_ERROR_TEXT),
        ENCODER_CONFIGURATION_ERROR(TrackTranscoderException.ENCODER_CONFIGURATION_ERROR_TEXT),
        DECODER_NOT_FOUND(TrackTranscoderException.DECODER_NOT_FOUND_ERROR_TEXT),
        ENCODER_NOT_FOUND(TrackTranscoderException.ENCODER_NOT_FOUND_ERROR_TEXT),
        CODEC_IN_RELEASED_STATE(TrackTranscoderException.CODEC_IN_RELEASED_STATE_ERROR_TEXT),
        SOURCE_TRACK_MIME_TYPE_NOT_FOUND(TrackTranscoderException.SOURCE_TRACK_MIME_TYPE_NOT_FOUND_ERROR_TEXT),
        NO_TRACKS_FOUND(TrackTranscoderException.NO_TRACKS_FOUND_ERROR_TEXT),
        INTERNAL_CODEC_ERROR(TrackTranscoderException.INTERNAL_CODEC_ERROR_TEXT),
        NO_FRAME_AVAILABLE(TrackTranscoderException.NO_FRAME_AVAILABLE_ERROR_TEXT),
        DECODER_NOT_PROVIDED(TrackTranscoderException.DECODER_NOT_PROVIDED_TEXT),
        ENCODER_NOT_PROVIDED(TrackTranscoderException.ENCODER_NOT_PROVIDED_TEXT),
        RENDERER_NOT_PROVIDED(TrackTranscoderException.RENDERER_NOT_PROVIDED_TEXT);

        private final String message;

        Error(String str) {
            this.message = str;
        }
    }

    public TrackTranscoderException(Error error) {
        this(error, null, null, null);
    }

    private String convertMediaCodecInfoToString(MediaCodec mediaCodec) {
        try {
            return convertMediaCodecInfoToString(mediaCodec.getCodecInfo());
        } catch (IllegalStateException unused) {
            return "";
        }
    }

    private String convertMediaCodecListToString(MediaCodecList mediaCodecList) {
        StringBuilder sb = new StringBuilder();
        try {
            for (MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
                if (mediaCodecInfo != null) {
                    sb.append('\n');
                    sb.append(convertMediaCodecInfoToString(mediaCodecInfo));
                }
            }
        } catch (IllegalStateException unused) {
        }
        return sb.toString();
    }

    @RequiresApi(21)
    private String getExceptionDiagnosticInfo(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }

    public Error getError() {
        return this.error;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.error.message;
    }

    @Override // com.xiaomi.fitness.watch.face.edit.video.videoprocess.MediaTransformationException, java.lang.Throwable
    public String toString() {
        String str = super.toString() + '\n';
        if (this.mediaFormat != null) {
            str = str + "Media format: " + this.mediaFormat.toString() + '\n';
        }
        if (this.mediaCodec != null) {
            str = str + "Selected media codec info: " + convertMediaCodecInfoToString(this.mediaCodec) + '\n';
        }
        if (this.mediaCodecList != null) {
            str = str + "Available media codec info list (Name, IsEncoder, Supported Types): " + convertMediaCodecListToString(this.mediaCodecList);
        }
        if (getCause() == null) {
            return str;
        }
        return str + "Diagnostic info: " + getExceptionDiagnosticInfo(getCause());
    }

    public TrackTranscoderException(Error error, Throwable th) {
        this(error, null, null, null, th);
    }

    public TrackTranscoderException(Error error, MediaFormat mediaFormat, MediaCodec mediaCodec, MediaCodecList mediaCodecList) {
        this(error, mediaFormat, mediaCodec, mediaCodecList, null);
    }

    private String convertMediaCodecInfoToString(MediaCodecInfo mediaCodecInfo) {
        return "MediaCodecInfo: " + mediaCodecInfo.getName() + ',' + mediaCodecInfo.isEncoder() + ',' + Arrays.asList(mediaCodecInfo.getSupportedTypes()).toString();
    }

    public TrackTranscoderException(Error error, MediaFormat mediaFormat, MediaCodec mediaCodec, MediaCodecList mediaCodecList, Throwable th) {
        super(th);
        this.error = error;
        this.mediaFormat = mediaFormat;
        this.mediaCodec = mediaCodec;
        this.mediaCodecList = mediaCodecList;
    }
}
