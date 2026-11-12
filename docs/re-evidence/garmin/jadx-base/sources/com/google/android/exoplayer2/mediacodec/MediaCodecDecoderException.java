package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes13.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final MediaCodecInfo codecInfo;
    public final String diagnosticInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    public MediaCodecDecoderException(Throwable th3, MediaCodecInfo mediaCodecInfo) {
        String strValueOf = String.valueOf(mediaCodecInfo == null ? null : mediaCodecInfo.name);
        super(strValueOf.length() != 0 ? "Decoder failed: ".concat(strValueOf) : new String("Decoder failed: "), th3);
        this.codecInfo = mediaCodecInfo;
        this.diagnosticInfo = Util.SDK_INT >= 21 ? getDiagnosticInfoV21(th3) : null;
    }

    private static String getDiagnosticInfoV21(Throwable th3) {
        if (th3 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th3).getDiagnosticInfo();
        }
        return null;
    }
}
