package org.apache.commons.codec.net;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public class QuotedPrintableCodec implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder {
    private static final byte CR = 13;
    private static final byte ESCAPE_CHAR = 61;
    private static final byte LF = 10;
    private static final int MIN_BYTES = 3;
    private static final BitSet PRINTABLE_CHARS = new BitSet(256);
    private static final int SAFE_LENGTH = 73;
    private static final byte SPACE = 32;
    private static final byte TAB = 9;
    private final Charset charset;
    private final boolean strict;

    static {
        for (int i14 = 33; i14 <= 60; i14++) {
            PRINTABLE_CHARS.set(i14);
        }
        for (int i15 = 62; i15 <= 126; i15++) {
            PRINTABLE_CHARS.set(i15);
        }
        BitSet bitSet = PRINTABLE_CHARS;
        bitSet.set(9);
        bitSet.set(32);
    }

    public QuotedPrintableCodec(String str) {
        this(Charset.forName(str), false);
    }

    public static final byte[] decodeQuotedPrintable(byte[] bArr) throws DecoderException {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i14 = 0;
        while (i14 < bArr.length) {
            byte b14 = bArr[i14];
            if (b14 == 61) {
                int i15 = i14 + 1;
                try {
                    byte b15 = bArr[i15];
                    if (b15 == 13) {
                        i14 = i15;
                    } else {
                        i14 += 2;
                        byteArrayOutputStream.write((char) ((Utils.digit16(b15) << 4) + Utils.digit16(bArr[i14])));
                    }
                } catch (ArrayIndexOutOfBoundsException e4) {
                    throw new DecoderException("Invalid quoted-printable encoding", e4);
                }
            } else if (b14 != 13 && b14 != 10) {
                byteArrayOutputStream.write(b14);
            }
            i14++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static int encodeByte(int i14, boolean z14, ByteArrayOutputStream byteArrayOutputStream) {
        if (z14) {
            return encodeQuotedPrintable(i14, byteArrayOutputStream);
        }
        byteArrayOutputStream.write(i14);
        return 1;
    }

    public static final byte[] encodeQuotedPrintable(BitSet bitSet, byte[] bArr, boolean z14) {
        int i14;
        if (bArr == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = PRINTABLE_CHARS;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        if (!z14) {
            int length2 = bArr.length;
            for (int i15 = 0; i15 < length2; i15++) {
                int i16 = bArr[i15];
                if (i16 < 0) {
                    i16 += 256;
                }
                if (bitSet.get(i16)) {
                    byteArrayOutputStream.write(i16);
                } else {
                    encodeQuotedPrintable(i16, byteArrayOutputStream);
                }
            }
        } else {
            if (length < 3) {
                return null;
            }
            int iEncodeByte = 1;
            int i17 = 0;
            while (true) {
                i14 = length - 3;
                if (i17 >= i14) {
                    break;
                }
                int unsignedOctet = getUnsignedOctet(i17, bArr);
                if (iEncodeByte < 73) {
                    iEncodeByte += encodeByte(unsignedOctet, !bitSet.get(unsignedOctet), byteArrayOutputStream);
                } else {
                    encodeByte(unsignedOctet, !bitSet.get(unsignedOctet) || isWhitespace(unsignedOctet), byteArrayOutputStream);
                    byteArrayOutputStream.write(61);
                    byteArrayOutputStream.write(13);
                    byteArrayOutputStream.write(10);
                    iEncodeByte = 1;
                }
                i17++;
            }
            int unsignedOctet2 = getUnsignedOctet(i14, bArr);
            if (iEncodeByte + encodeByte(unsignedOctet2, !bitSet.get(unsignedOctet2) || (isWhitespace(unsignedOctet2) && iEncodeByte > 68), byteArrayOutputStream) > 71) {
                byteArrayOutputStream.write(61);
                byteArrayOutputStream.write(13);
                byteArrayOutputStream.write(10);
            }
            int i18 = length - 2;
            int i19 = i18;
            while (i19 < length) {
                int unsignedOctet3 = getUnsignedOctet(i19, bArr);
                encodeByte(unsignedOctet3, !bitSet.get(unsignedOctet3) || (i19 > i18 && isWhitespace(unsignedOctet3)), byteArrayOutputStream);
                i19++;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static int getUnsignedOctet(int i14, byte[] bArr) {
        byte b14 = bArr[i14];
        return b14 < 0 ? b14 + 256 : b14;
    }

    private static boolean isWhitespace(int i14) {
        return i14 == 32 || i14 == 9;
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be quoted-printable decoded");
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be quoted-printable encoded");
    }

    public Charset getCharset() {
        return this.charset;
    }

    public String getDefaultCharset() {
        return this.charset.name();
    }

    public QuotedPrintableCodec(boolean z14) {
        this(StandardCharsets.UTF_8, z14);
    }

    public QuotedPrintableCodec(Charset charset) {
        this(charset, false);
    }

    public QuotedPrintableCodec(Charset charset, boolean z14) {
        this.charset = charset;
        this.strict = z14;
    }

    public QuotedPrintableCodec() {
        this(StandardCharsets.UTF_8, false);
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        return decodeQuotedPrintable(bArr);
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return encodeQuotedPrintable(PRINTABLE_CHARS, bArr, this.strict);
    }

    @Override // org.apache.commons.codec.StringDecoder
    public String decode(String str) {
        return decode(str, getCharset());
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return encode(str, getCharset());
    }

    public String decode(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return new String(decode(StringUtils.getBytesUsAscii(str)), charset);
    }

    public String encode(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return StringUtils.newStringUsAscii(encode(str.getBytes(charset)));
    }

    public String decode(String str, String str2) {
        if (str == null) {
            return null;
        }
        return new String(decode(StringUtils.getBytesUsAscii(str)), str2);
    }

    public String encode(String str, String str2) {
        if (str == null) {
            return null;
        }
        return StringUtils.newStringUsAscii(encode(str.getBytes(str2)));
    }

    public static final byte[] encodeQuotedPrintable(BitSet bitSet, byte[] bArr) {
        return encodeQuotedPrintable(bitSet, bArr, false);
    }

    private static final int encodeQuotedPrintable(int i14, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(61);
        char cHexDigit = Utils.hexDigit(i14 >> 4);
        char cHexDigit2 = Utils.hexDigit(i14);
        byteArrayOutputStream.write(cHexDigit);
        byteArrayOutputStream.write(cHexDigit2);
        return 3;
    }
}
