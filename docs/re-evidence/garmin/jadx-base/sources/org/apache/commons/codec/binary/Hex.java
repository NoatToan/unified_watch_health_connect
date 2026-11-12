package org.apache.commons.codec.binary;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* JADX INFO: loaded from: classes3.dex */
public class Hex implements BinaryEncoder, BinaryDecoder {
    public static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;
    public static final String DEFAULT_CHARSET_NAME = CharEncoding.UTF_8;
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final Charset charset;

    public Hex() {
        this.charset = DEFAULT_CHARSET;
    }

    public static int decodeHex(char[] cArr, byte[] bArr, int i14) throws DecoderException {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new DecoderException("Odd number of characters.");
        }
        int i15 = length >> 1;
        if (bArr.length - i14 < i15) {
            throw new DecoderException("Output array is not large enough to accommodate decoded data.");
        }
        int i16 = 0;
        while (i16 < length) {
            int i17 = i16 + 1;
            int digit = (toDigit(cArr[i16], i16) << 4) | toDigit(cArr[i17], i17);
            i16 += 2;
            bArr[i14] = (byte) (digit & 255);
            i14++;
        }
        return i15;
    }

    private static char[] encodeHex(byte[] bArr, int i14, int i15, char[] cArr, char[] cArr2, int i16) {
        for (int i17 = i14; i17 < i14 + i15; i17++) {
            int i18 = i16 + 1;
            byte b14 = bArr[i17];
            cArr2[i16] = cArr[(b14 & 240) >>> 4];
            i16 += 2;
            cArr2[i18] = cArr[b14 & Ascii.SI];
        }
        return cArr2;
    }

    public static String encodeHexString(byte[] bArr) {
        return new String(encodeHex(bArr));
    }

    private static char[] toAlphabet(boolean z14) {
        return z14 ? DIGITS_LOWER : DIGITS_UPPER;
    }

    private static byte[] toByteArray(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            byte[] bArrArray = byteBuffer.array();
            if (iRemaining == bArrArray.length) {
                byteBuffer.position(iRemaining);
                return bArrArray;
            }
        }
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static int toDigit(char c14, int i14) throws DecoderException {
        int iDigit = Character.digit(c14, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new DecoderException("Illegal hexadecimal character " + c14 + " at index " + i14);
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj instanceof String) {
            return decode(((String) obj).toCharArray());
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof ByteBuffer) {
            return decode((ByteBuffer) obj);
        }
        try {
            return decodeHex((char[]) obj);
        } catch (ClassCastException e4) {
            throw new DecoderException(e4.getMessage(), e4);
        }
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        byte[] byteArray;
        if (obj instanceof String) {
            byteArray = ((String) obj).getBytes(getCharset());
        } else if (obj instanceof ByteBuffer) {
            byteArray = toByteArray((ByteBuffer) obj);
        } else {
            try {
                byteArray = (byte[]) obj;
            } catch (ClassCastException e4) {
                throw new EncoderException(e4.getMessage(), e4);
            }
        }
        return encodeHex(byteArray);
    }

    public Charset getCharset() {
        return this.charset;
    }

    public String getCharsetName() {
        return this.charset.name();
    }

    public String toString() {
        return super.toString() + "[charsetName=" + this.charset + "]";
    }

    public Hex(Charset charset) {
        this.charset = charset;
    }

    public Hex(String str) {
        this(Charset.forName(str));
    }

    public static String encodeHexString(byte[] bArr, boolean z14) {
        return new String(encodeHex(bArr, z14));
    }

    public static String encodeHexString(ByteBuffer byteBuffer) {
        return new String(encodeHex(byteBuffer));
    }

    public static String encodeHexString(ByteBuffer byteBuffer, boolean z14) {
        return new String(encodeHex(byteBuffer, z14));
    }

    public static char[] encodeHex(byte[] bArr, boolean z14) {
        return encodeHex(bArr, toAlphabet(z14));
    }

    public static char[] encodeHex(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        return encodeHex(bArr, 0, length, cArr, new char[length << 1], 0);
    }

    public static char[] encodeHex(byte[] bArr, int i14, int i15, boolean z14) {
        return encodeHex(bArr, i14, i15, toAlphabet(z14), new char[i15 << 1], 0);
    }

    public static void encodeHex(byte[] bArr, int i14, int i15, boolean z14, char[] cArr, int i16) {
        encodeHex(bArr, i14, i15, toAlphabet(z14), cArr, i16);
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, true);
    }

    public static char[] encodeHex(ByteBuffer byteBuffer) {
        return encodeHex(byteBuffer, true);
    }

    public static char[] encodeHex(ByteBuffer byteBuffer, boolean z14) {
        return encodeHex(byteBuffer, toAlphabet(z14));
    }

    public static char[] encodeHex(ByteBuffer byteBuffer, char[] cArr) {
        return encodeHex(toByteArray(byteBuffer), cArr);
    }

    public byte[] encode(ByteBuffer byteBuffer) {
        return encodeHexString(byteBuffer).getBytes(getCharset());
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return encodeHexString(bArr).getBytes(getCharset());
    }

    public byte[] decode(ByteBuffer byteBuffer) {
        return decodeHex(new String(toByteArray(byteBuffer), getCharset()).toCharArray());
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        return decodeHex(new String(bArr, getCharset()).toCharArray());
    }

    public static byte[] decodeHex(char[] cArr) throws DecoderException {
        byte[] bArr = new byte[cArr.length >> 1];
        decodeHex(cArr, bArr, 0);
        return bArr;
    }

    public static byte[] decodeHex(String str) {
        return decodeHex(str.toCharArray());
    }
}
