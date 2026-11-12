package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.BaseNCodec;

/* JADX INFO: loaded from: classes3.dex */
public class BCodec extends RFC1522Codec implements StringEncoder, StringDecoder {
    private static final CodecPolicy DECODING_POLICY_DEFAULT = CodecPolicy.LENIENT;
    private final CodecPolicy decodingPolicy;

    public BCodec(String str) {
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
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be decoded using BCodec");
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public byte[] doDecoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new Base64(0, BaseNCodec.getChunkSeparator(), false, this.decodingPolicy).decode(bArr);
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public byte[] doEncoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeBase64(bArr);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be encoded using BCodec");
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
        return "B";
    }

    public boolean isStrictDecoding() {
        return this.decodingPolicy == CodecPolicy.STRICT;
    }

    public BCodec(Charset charset) {
        this(charset, DECODING_POLICY_DEFAULT);
    }

    public BCodec(Charset charset, CodecPolicy codecPolicy) {
        super(charset);
        this.decodingPolicy = codecPolicy;
    }

    public BCodec() {
        this(StandardCharsets.UTF_8);
    }

    @Override // org.apache.commons.codec.StringDecoder
    public String decode(String str) throws DecoderException {
        try {
            return decodeText(str);
        } catch (UnsupportedEncodingException | IllegalArgumentException e4) {
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
