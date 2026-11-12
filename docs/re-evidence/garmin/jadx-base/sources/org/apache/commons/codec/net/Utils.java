package org.apache.commons.codec.net;

import am.j;
import org.apache.commons.codec.DecoderException;

/* JADX INFO: loaded from: classes3.dex */
final class Utils {
    private static final int RADIX = 16;

    public static int digit16(byte b14) throws DecoderException {
        int iDigit = Character.digit((char) b14, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new DecoderException(j.h(b14, "Invalid URL encoding: not a valid digit (radix 16): "));
    }

    public static char hexDigit(int i14) {
        return Character.toUpperCase(Character.forDigit(i14 & 15, 16));
    }
}
