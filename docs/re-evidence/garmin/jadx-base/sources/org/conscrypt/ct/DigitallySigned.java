package org.conscrypt.ct;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import n23.j;

/* JADX INFO: loaded from: classes3.dex */
public class DigitallySigned {
    private final HashAlgorithm hashAlgorithm;
    private final byte[] signature;
    private final SignatureAlgorithm signatureAlgorithm;

    public enum HashAlgorithm {
        NONE,
        MD5,
        SHA1,
        SHA224,
        SHA256,
        SHA384,
        SHA512;

        private static HashAlgorithm[] values = values();

        public static HashAlgorithm valueOf(int i14) {
            try {
                return values[i14];
            } catch (IndexOutOfBoundsException e4) {
                j.w(am.j.h(i14, "Invalid hash algorithm "), e4);
                return null;
            }
        }
    }

    public enum SignatureAlgorithm {
        ANONYMOUS,
        RSA,
        DSA,
        ECDSA;

        private static SignatureAlgorithm[] values = values();

        public static SignatureAlgorithm valueOf(int i14) {
            try {
                return values[i14];
            } catch (IndexOutOfBoundsException e4) {
                j.w(am.j.h(i14, "Invalid signature algorithm "), e4);
                return null;
            }
        }
    }

    public DigitallySigned(int i14, int i15, byte[] bArr) {
        this(HashAlgorithm.valueOf(i14), SignatureAlgorithm.valueOf(i15), bArr);
    }

    public static DigitallySigned decode(InputStream inputStream) throws SerializationException {
        try {
            return new DigitallySigned(Serialization.readNumber(inputStream, 1), Serialization.readNumber(inputStream, 1), Serialization.readVariableBytes(inputStream, 2));
        } catch (IllegalArgumentException e4) {
            throw new SerializationException(e4);
        }
    }

    public String getAlgorithm() {
        return this.hashAlgorithm + "with" + this.signatureAlgorithm;
    }

    public HashAlgorithm getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public byte[] getSignature() {
        return this.signature;
    }

    public SignatureAlgorithm getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public DigitallySigned(HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm, byte[] bArr) {
        this.hashAlgorithm = hashAlgorithm;
        this.signatureAlgorithm = signatureAlgorithm;
        this.signature = bArr;
    }

    public static DigitallySigned decode(byte[] bArr) {
        return decode(new ByteArrayInputStream(bArr));
    }
}
