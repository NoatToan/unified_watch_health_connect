package com.ximalaya.ting.android.opensdk.httputil.util;

import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
public class BASE64Encoder {
    private static final String DEFAULT_ENCODING = "UTF-8";
    private static final char LAST2BYTE = (char) Integer.parseInt("00000011", 2);
    private static final char LAST4BYTE = (char) Integer.parseInt("00001111", 2);
    private static final char LAST6BYTE = (char) Integer.parseInt("00111111", 2);
    private static final char LEAD6BYTE = (char) Integer.parseInt("11111100", 2);
    private static final char LEAD4BYTE = (char) Integer.parseInt("11110000", 2);
    private static final char LEAD2BYTE = (char) Integer.parseInt("11000000", 2);
    private static final char[] ENCODE_TABLE = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', JsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    public static String encode(String str) throws UnsupportedEncodingException {
        return encode(str.getBytes("UTF-8"));
    }

    public static String encode(byte[] bArr) {
        int i;
        int i2;
        StringBuffer stringBuffer = new StringBuffer(((int) (((double) bArr.length) * 1.34d)) + 3);
        int i3 = 0;
        char c = 0;
        for (int i4 = 0; i4 < bArr.length; i4++) {
            i3 %= 8;
            while (i3 < 8) {
                if (i3 == 0) {
                    i = ((char) (bArr[i4] & LEAD6BYTE)) >>> 2;
                } else if (i3 != 2) {
                    if (i3 == 4) {
                        c = (char) (((char) (bArr[i4] & LAST4BYTE)) << 2);
                        int i5 = i4 + 1;
                        if (i5 < bArr.length) {
                            i2 = (bArr[i5] & LEAD2BYTE) >>> 6;
                            i = c | i2;
                        }
                    } else if (i3 == 6) {
                        c = (char) (((char) (bArr[i4] & LAST2BYTE)) << 4);
                        int i6 = i4 + 1;
                        if (i6 < bArr.length) {
                            i2 = (bArr[i6] & LEAD4BYTE) >>> 4;
                            i = c | i2;
                        }
                    }
                    stringBuffer.append(ENCODE_TABLE[c]);
                    i3 += 6;
                } else {
                    i = bArr[i4] & LAST6BYTE;
                }
                c = (char) i;
                stringBuffer.append(ENCODE_TABLE[c]);
                i3 += 6;
            }
        }
        if (stringBuffer.length() % 4 != 0) {
            for (int length = 4 - (stringBuffer.length() % 4); length > 0; length--) {
                stringBuffer.append(SearchCriteria.EQ);
            }
        }
        return stringBuffer.toString();
    }
}
