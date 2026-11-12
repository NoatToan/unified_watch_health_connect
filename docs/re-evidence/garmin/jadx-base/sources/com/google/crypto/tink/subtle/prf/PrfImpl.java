package com.google.crypto.tink.subtle.prf;

import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
public class PrfImpl implements Prf {
    private final StreamingPrf prfStreamer;

    private PrfImpl(StreamingPrf streamingPrf) {
        this.prfStreamer = streamingPrf;
    }

    private static byte[] readBytesFromStream(InputStream inputStream, int i14) throws GeneralSecurityException {
        try {
            byte[] bArr = new byte[i14];
            int i15 = 0;
            while (i15 < i14) {
                int i16 = inputStream.read(bArr, i15, i14 - i15);
                if (i16 <= 0) {
                    throw new GeneralSecurityException("Provided StreamingPrf terminated before providing requested number of bytes.");
                }
                i15 += i16;
            }
            return bArr;
        } catch (IOException e4) {
            throw new GeneralSecurityException(e4);
        }
    }

    public static PrfImpl wrap(StreamingPrf streamingPrf) {
        return new PrfImpl(streamingPrf);
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] bArr, int i14) throws GeneralSecurityException {
        if (bArr == null) {
            a.t("Invalid input provided.");
            return null;
        }
        if (i14 > 0) {
            return readBytesFromStream(this.prfStreamer.computePrf(bArr), i14);
        }
        a.t("Invalid outputLength specified.");
        return null;
    }
}
