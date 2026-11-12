package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecDecoderException extends DecoderException {

    @Nullable
    public final MediaCodecInfo codecInfo;

    @Nullable
    public final String diagnosticInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    public MediaCodecDecoderException(Throwable cause, @Nullable MediaCodecInfo codecInfo) {
        String strValueOf = String.valueOf(codecInfo == null ? null : codecInfo.name);
        super(strValueOf.length() != 0 ? "Decoder failed: ".concat(strValueOf) : new String("Decoder failed: "), cause);
        this.codecInfo = codecInfo;
        this.diagnosticInfo = Util.SDK_INT >= 21 ? a(cause) : null;
    }

    @Nullable
    @RequiresApi(21)
    private static String a(Throwable cause) {
        if (cause instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) cause).getDiagnosticInfo();
        }
        return null;
    }
}
