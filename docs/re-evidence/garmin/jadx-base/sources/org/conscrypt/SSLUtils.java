package org.conscrypt;

import am.j;
import com.google.common.primitives.UnsignedBytes;
import i3.e5;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.commons.lang3.BooleanUtils;
import tn.k;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
final class SSLUtils {
    private static final String KEY_TYPE_EC = "EC";
    private static final String KEY_TYPE_RSA = "RSA";
    private static final int MAX_ENCRYPTION_OVERHEAD_DIFF = 2147483561;
    private static final int MAX_ENCRYPTION_OVERHEAD_LENGTH = 86;
    private static final int MAX_PROTOCOL_LENGTH = 255;
    static final boolean USE_ENGINE_SOCKET_BY_DEFAULT = Boolean.parseBoolean(System.getProperty("org.conscrypt.useEngineSocketByDefault", BooleanUtils.TRUE));
    private static final Charset US_ASCII = Charset.forName("US-ASCII");

    public static final class EngineStates {
        static final int STATE_CLOSED = 8;
        static final int STATE_CLOSED_INBOUND = 6;
        static final int STATE_CLOSED_OUTBOUND = 7;
        static final int STATE_HANDSHAKE_COMPLETED = 3;
        static final int STATE_HANDSHAKE_STARTED = 2;
        static final int STATE_MODE_SET = 1;
        static final int STATE_NEW = 0;
        static final int STATE_READY = 5;
        static final int STATE_READY_HANDSHAKE_CUT_THROUGH = 4;

        private EngineStates() {
        }
    }

    public enum SessionType {
        OPEN_SSL(1),
        OPEN_SSL_WITH_OCSP(2),
        OPEN_SSL_WITH_TLS_SCT(3);

        final int value;

        SessionType(int i14) {
            this.value = i14;
        }

        public static boolean isSupportedType(int i14) {
            return i14 == OPEN_SSL.value || i14 == OPEN_SSL_WITH_OCSP.value || i14 == OPEN_SSL_WITH_TLS_SCT.value;
        }
    }

    private SSLUtils() {
    }

    public static int calculateOutNetBufSize(int i14) {
        return Math.min(16709, Math.min(MAX_ENCRYPTION_OVERHEAD_DIFF, i14) + 86);
    }

    public static String[] concat(String[]... strArr) {
        int length = 0;
        for (String[] strArr2 : strArr) {
            length += strArr2.length;
        }
        String[] strArr3 = new String[length];
        int length2 = 0;
        for (String[] strArr4 : strArr) {
            System.arraycopy(strArr4, 0, strArr3, length2, strArr4.length);
            length2 += strArr4.length;
        }
        return strArr3;
    }

    public static String[] decodeProtocols(byte[] bArr) {
        if (bArr.length == 0) {
            return EmptyArray.STRING;
        }
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i15 < bArr.length) {
            byte b14 = bArr[i15];
            if (b14 < 0 || b14 > bArr.length - i15) {
                StringBuilder sbJ = e5.j(b14, i15, "Protocol has invalid length (", " at position ", "): ");
                sbJ.append(bArr.length < 50 ? Arrays.toString(bArr) : j.q(new StringBuilder(), bArr.length, " byte array"));
                throw new IllegalArgumentException(sbJ.toString());
            }
            i16++;
            i15 += b14 + 1;
        }
        String[] strArr = new String[i16];
        int i17 = 0;
        while (i14 < bArr.length) {
            byte b15 = bArr[i14];
            int i18 = i17 + 1;
            strArr[i17] = b15 > 0 ? new String(bArr, i14 + 1, b15, US_ASCII) : "";
            i14 += b15 + 1;
            i17 = i18;
        }
        return strArr;
    }

    private static X509Certificate decodeX509Certificate(CertificateFactory certificateFactory, byte[] bArr) {
        return certificateFactory != null ? (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArr)) : OpenSSLX509Certificate.fromX509Der(bArr);
    }

    public static X509Certificate[] decodeX509CertificateChain(byte[][] bArr) {
        CertificateFactory certificateFactory = getCertificateFactory();
        int length = bArr.length;
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        for (int i14 = 0; i14 < length; i14++) {
            x509CertificateArr[i14] = decodeX509Certificate(certificateFactory, bArr[i14]);
        }
        return x509CertificateArr;
    }

    public static byte[] encodeProtocols(String[] strArr) {
        if (strArr == null) {
            h.s("protocols array must be non-null");
            return null;
        }
        if (strArr.length == 0) {
            return EmptyArray.BYTE;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < strArr.length; i15++) {
            String str = strArr[i15];
            if (str == null) {
                h.s(e0.f(i15, "protocol[", "] is null"));
                return null;
            }
            int length = str.length();
            if (length == 0 || length > 255) {
                h.s(k.e(i15, length, "protocol[", "] has invalid length: "));
                return null;
            }
            i14 += length + 1;
        }
        byte[] bArr = new byte[i14];
        int i16 = 0;
        for (String str2 : strArr) {
            int length2 = str2.length();
            bArr[i16] = (byte) length2;
            i16++;
            int i17 = 0;
            while (i17 < length2) {
                char cCharAt = str2.charAt(i17);
                if (cCharAt > 127) {
                    throw new IllegalArgumentException("Protocol contains invalid character: " + cCharAt + "(protocol=" + str2 + ")");
                }
                bArr[i16] = (byte) cCharAt;
                i17++;
                i16++;
            }
        }
        return bArr;
    }

    public static byte[][] encodeSubjectX509Principals(X509Certificate[] x509CertificateArr) {
        byte[][] bArr = new byte[x509CertificateArr.length][];
        for (int i14 = 0; i14 < x509CertificateArr.length; i14++) {
            bArr[i14] = x509CertificateArr[i14].getSubjectX500Principal().getEncoded();
        }
        return bArr;
    }

    private static CertificateFactory getCertificateFactory() {
        try {
            return CertificateFactory.getInstance("X.509");
        } catch (CertificateException unused) {
            return null;
        }
    }

    public static String getClientKeyType(byte b14) {
        if (b14 == 1) {
            return KEY_TYPE_RSA;
        }
        if (b14 != 64) {
            return null;
        }
        return KEY_TYPE_EC;
    }

    public static String getClientKeyTypeFromSignatureAlg(int i14) {
        int iSSL_get_signature_algorithm_key_type = NativeCrypto.SSL_get_signature_algorithm_key_type(i14);
        if (iSSL_get_signature_algorithm_key_type == 6) {
            return KEY_TYPE_RSA;
        }
        if (iSSL_get_signature_algorithm_key_type != 408) {
            return null;
        }
        return KEY_TYPE_EC;
    }

    public static int getEncryptedPacketLength(ByteBuffer[] byteBufferArr, int i14) {
        ByteBuffer byteBuffer = byteBufferArr[i14];
        if (byteBuffer.remaining() >= 5) {
            return getEncryptedPacketLength(byteBuffer);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        while (true) {
            int i15 = i14 + 1;
            ByteBuffer byteBuffer2 = byteBufferArr[i14];
            int iPosition = byteBuffer2.position();
            int iLimit = byteBuffer2.limit();
            if (byteBuffer2.remaining() > byteBufferAllocate.remaining()) {
                byteBuffer2.limit(byteBufferAllocate.remaining() + iPosition);
            }
            try {
                byteBufferAllocate.put(byteBuffer2);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                if (!byteBufferAllocate.hasRemaining()) {
                    byteBufferAllocate.flip();
                    return getEncryptedPacketLength(byteBufferAllocate);
                }
                i14 = i15;
            } catch (Throwable th3) {
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th3;
            }
        }
    }

    public static String getServerX509KeyType(long j8) {
        String strSSL_CIPHER_get_kx_name = NativeCrypto.SSL_CIPHER_get_kx_name(j8);
        if (strSSL_CIPHER_get_kx_name.equals(KEY_TYPE_RSA) || strSSL_CIPHER_get_kx_name.equals("DHE_RSA") || strSSL_CIPHER_get_kx_name.equals("ECDHE_RSA")) {
            return KEY_TYPE_RSA;
        }
        if (strSSL_CIPHER_get_kx_name.equals("ECDHE_ECDSA")) {
            return KEY_TYPE_EC;
        }
        return null;
    }

    public static Set<String> getSupportedClientKeyTypes(byte[] bArr, int[] iArr) {
        HashSet hashSet = new HashSet(bArr.length);
        for (byte b14 : bArr) {
            String clientKeyType = getClientKeyType(b14);
            if (clientKeyType != null) {
                hashSet.add(clientKeyType);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(iArr.length);
        for (int i14 : iArr) {
            String clientKeyTypeFromSignatureAlg = getClientKeyTypeFromSignatureAlg(i14);
            if (clientKeyTypeFromSignatureAlg != null) {
                linkedHashSet.add(clientKeyTypeFromSignatureAlg);
            }
        }
        if (bArr.length <= 0 || iArr.length <= 0) {
            return iArr.length > 0 ? linkedHashSet : hashSet;
        }
        linkedHashSet.retainAll(hashSet);
        return linkedHashSet;
    }

    public static javax.security.cert.X509Certificate[] toCertificateChain(X509Certificate[] x509CertificateArr) throws Throwable {
        try {
            javax.security.cert.X509Certificate[] x509CertificateArr2 = new javax.security.cert.X509Certificate[x509CertificateArr.length];
            for (int i14 = 0; i14 < x509CertificateArr.length; i14++) {
                x509CertificateArr2[i14] = javax.security.cert.X509Certificate.getInstance(x509CertificateArr[i14].getEncoded());
            }
            return x509CertificateArr2;
        } catch (CertificateEncodingException e4) {
            Throwable sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e4.getMessage());
            sSLPeerUnverifiedException.initCause(sSLPeerUnverifiedException);
            throw sSLPeerUnverifiedException;
        } catch (javax.security.cert.CertificateException e14) {
            Throwable sSLPeerUnverifiedException2 = new SSLPeerUnverifiedException(e14.getMessage());
            sSLPeerUnverifiedException2.initCause(sSLPeerUnverifiedException2);
            throw sSLPeerUnverifiedException2;
        }
    }

    public static byte[] toProtocolBytes(String str) {
        if (str == null) {
            return null;
        }
        return str.getBytes(US_ASCII);
    }

    public static String toProtocolString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, US_ASCII);
    }

    public static SSLException toSSLException(Throwable th3) {
        return th3 instanceof SSLException ? (SSLException) th3 : new SSLException(th3);
    }

    public static SSLHandshakeException toSSLHandshakeException(Throwable th3) {
        return th3 instanceof SSLHandshakeException ? (SSLHandshakeException) th3 : (SSLHandshakeException) new SSLHandshakeException(th3.getMessage()).initCause(th3);
    }

    private static short unsignedByte(byte b14) {
        return (short) (b14 & UnsignedBytes.MAX_VALUE);
    }

    private static int unsignedShort(short s8) {
        return s8 & 65535;
    }

    private static int getEncryptedPacketLength(ByteBuffer byteBuffer) {
        int iUnsignedShort;
        int iPosition = byteBuffer.position();
        switch (unsignedByte(byteBuffer.get(iPosition))) {
            case 20:
            case 21:
            case 22:
            case 23:
                if (unsignedByte(byteBuffer.get(iPosition + 1)) == 3 && (iUnsignedShort = unsignedShort(byteBuffer.getShort(iPosition + 3)) + 5) > 5) {
                    return iUnsignedShort;
                }
                return -1;
            default:
                return -1;
        }
    }
}
