package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.BitSet;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes3.dex */
public class QCodec extends RFC1522Codec implements StringEncoder, StringDecoder {
    private static final BitSet PRINTABLE_CHARS;
    private static final byte SPACE = 32;
    private static final byte UNDERSCORE = 95;
    private boolean encodeBlanks;

    static {
        BitSet bitSet = new BitSet(256);
        PRINTABLE_CHARS = bitSet;
        bitSet.set(32);
        bitSet.set(33);
        bitSet.set(34);
        bitSet.set(35);
        bitSet.set(36);
        bitSet.set(37);
        bitSet.set(38);
        bitSet.set(39);
        bitSet.set(40);
        bitSet.set(41);
        bitSet.set(42);
        bitSet.set(43);
        bitSet.set(44);
        bitSet.set(45);
        bitSet.set(46);
        bitSet.set(47);
        for (int i14 = 48; i14 <= 57; i14++) {
            PRINTABLE_CHARS.set(i14);
        }
        BitSet bitSet2 = PRINTABLE_CHARS;
        bitSet2.set(58);
        bitSet2.set(59);
        bitSet2.set(60);
        bitSet2.set(62);
        bitSet2.set(64);
        for (int i15 = 65; i15 <= 90; i15++) {
            PRINTABLE_CHARS.set(i15);
        }
        BitSet bitSet3 = PRINTABLE_CHARS;
        bitSet3.set(91);
        bitSet3.set(92);
        bitSet3.set(93);
        bitSet3.set(94);
        bitSet3.set(96);
        for (int i16 = 97; i16 <= 122; i16++) {
            PRINTABLE_CHARS.set(i16);
        }
        BitSet bitSet4 = PRINTABLE_CHARS;
        bitSet4.set(123);
        bitSet4.set(124);
        bitSet4.set(125);
        bitSet4.set(126);
    }

    public QCodec(String str) {
        this(Charset.forName(str));
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be decoded using Q codec");
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public byte[] doDecoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        for (byte b14 : bArr) {
            if (b14 == 95) {
                byte[] bArr2 = new byte[bArr.length];
                for (int i14 = 0; i14 < bArr.length; i14++) {
                    byte b15 = bArr[i14];
                    if (b15 != 95) {
                        bArr2[i14] = b15;
                    } else {
                        bArr2[i14] = 32;
                    }
                }
                return QuotedPrintableCodec.decodeQuotedPrintable(bArr2);
            }
        }
        return QuotedPrintableCodec.decodeQuotedPrintable(bArr);
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public byte[] doEncoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArrEncodeQuotedPrintable = QuotedPrintableCodec.encodeQuotedPrintable(PRINTABLE_CHARS, bArr);
        if (this.encodeBlanks) {
            for (int i14 = 0; i14 < bArrEncodeQuotedPrintable.length; i14++) {
                if (bArrEncodeQuotedPrintable[i14] == 32) {
                    bArrEncodeQuotedPrintable[i14] = UNDERSCORE;
                }
            }
        }
        return bArrEncodeQuotedPrintable;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be encoded using Q codec");
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public /* bridge */ /* synthetic */ Charset getCharset() {
        return super.getCharset();
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public /* bridge */ /* synthetic */ String getDefaultCharset() {
        return super.getDefaultCharset();
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public String getEncoding() {
        return "Q";
    }

    public boolean isEncodeBlanks() {
        return this.encodeBlanks;
    }

    public void setEncodeBlanks(boolean z14) {
        this.encodeBlanks = z14;
    }

    public QCodec(Charset charset) {
        super(charset);
    }

    public QCodec() {
        this(StandardCharsets.UTF_8);
    }

    @Override // org.apache.commons.codec.StringDecoder
    public String decode(String str) throws DecoderException {
        try {
            return decodeText(str);
        } catch (UnsupportedEncodingException e4) {
            throw new DecoderException(e4.getMessage(), e4);
        }
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return encode(str, getCharset());
    }

    public String encode(String str, Charset charset) {
        return encodeText(str, charset);
    }

    public String encode(String str, String str2) throws EncoderException {
        try {
            return encodeText(str, str2);
        } catch (UnsupportedCharsetException e4) {
            throw new EncoderException(e4.getMessage(), e4);
        }
    }
}
