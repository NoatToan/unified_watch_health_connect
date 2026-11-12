package org.apache.commons.codec.net;

import am.j;
import java.nio.charset.Charset;
import java.util.Objects;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
abstract class RFC1522Codec {
    protected static final String POSTFIX = "?=";
    protected static final String PREFIX = "=?";
    protected static final char SEP = '?';
    protected final Charset charset;

    public RFC1522Codec(Charset charset) {
        Objects.requireNonNull(charset, "charset");
        this.charset = charset;
    }

    public String decodeText(String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        if (!str.startsWith(PREFIX) || !str.endsWith(POSTFIX)) {
            throw new DecoderException("RFC 1522 violation: malformed encoded content");
        }
        int length = str.length() - 2;
        int iIndexOf = str.indexOf(63, 2);
        if (iIndexOf == length) {
            throw new DecoderException("RFC 1522 violation: charset token not found");
        }
        String strSubstring = str.substring(2, iIndexOf);
        if (strSubstring.isEmpty()) {
            throw new DecoderException("RFC 1522 violation: charset not specified");
        }
        int i14 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(63, i14);
        if (iIndexOf2 == length) {
            throw new DecoderException("RFC 1522 violation: encoding token not found");
        }
        String strSubstring2 = str.substring(i14, iIndexOf2);
        if (!getEncoding().equalsIgnoreCase(strSubstring2)) {
            throw new DecoderException(j.m("This codec cannot decode ", strSubstring2, " encoded content"));
        }
        int i15 = iIndexOf2 + 1;
        return new String(doDecoding(StringUtils.getBytesUsAscii(str.substring(i15, str.indexOf(63, i15)))), strSubstring);
    }

    public abstract byte[] doDecoding(byte[] bArr);

    public abstract byte[] doEncoding(byte[] bArr);

    public String encodeText(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return PREFIX + charset + SEP + getEncoding() + SEP + StringUtils.newStringUsAscii(doEncoding(str.getBytes(charset))) + POSTFIX;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public String getDefaultCharset() {
        return this.charset.name();
    }

    public abstract String getEncoding();

    public String encodeText(String str, String str2) {
        if (str == null) {
            return null;
        }
        return encodeText(str, Charset.forName(str2));
    }
}
