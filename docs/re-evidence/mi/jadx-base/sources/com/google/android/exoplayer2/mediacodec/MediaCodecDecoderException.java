package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.decoder.DecoderException;
import defpackage.wlq;

/* JADX INFO: loaded from: classes4.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final c codecInfo;
    public final String diagnosticInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    public MediaCodecDecoderException(Throwable th, c cVar) {
        String strValueOf = String.valueOf(cVar == null ? null : cVar.f7979a);
        super(strValueOf.length() != 0 ? "Decoder failed: ".concat(strValueOf) : new String("Decoder failed: "), th);
        this.codecInfo = cVar;
        this.diagnosticInfo = wlq.f38110a >= 21 ? getDiagnosticInfoV21(th) : null;
    }

    @RequiresApi(21)
    private static String getDiagnosticInfoV21(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
