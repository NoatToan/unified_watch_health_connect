package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import fa.z;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final d codecInfo;
    public final String diagnosticInfo;
    public final int errorCode;

    public MediaCodecDecoderException(Throwable th3, d dVar) {
        StringBuilder sb3 = new StringBuilder("Decoder failed: ");
        sb3.append(dVar == null ? null : dVar.f9270a);
        super(sb3.toString(), th3);
        this.codecInfo = dVar;
        String diagnosticInfo = th3 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th3).getDiagnosticInfo() : null;
        this.diagnosticInfo = diagnosticInfo;
        this.errorCode = z.f70071a >= 23 ? getErrorCodeV23(th3) : z.u(diagnosticInfo);
    }

    private static int getErrorCodeV23(Throwable th3) {
        if (th3 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th3).getErrorCode();
        }
        return 0;
    }
}
