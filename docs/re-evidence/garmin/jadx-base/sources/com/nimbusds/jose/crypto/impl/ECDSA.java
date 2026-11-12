package com.nimbusds.jose.crypto.impl;

import com.mapbox.maps.p;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECParameterTable;
import com.nimbusds.jose.util.ByteUtils;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECKey;
import java.security.spec.ECParameterSpec;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class ECDSA {
    private ECDSA() {
    }

    public static void ensureLegalSignature(byte[] bArr, JWSAlgorithm jWSAlgorithm) throws JOSEException {
        if (ByteUtils.isZeroFilled(bArr)) {
            p.p("Blank signature");
            return;
        }
        Set<Curve> setForJWSAlgorithm = Curve.forJWSAlgorithm(jWSAlgorithm);
        if (setForJWSAlgorithm == null || setForJWSAlgorithm.size() > 1) {
            p.m(jWSAlgorithm, "Unsupported JWS algorithm: ");
            return;
        }
        Curve next = setForJWSAlgorithm.iterator().next();
        ECParameterSpec eCParameterSpec = ECParameterTable.get(next);
        if (eCParameterSpec == null) {
            p.m(next, "Unsupported curve: ");
            return;
        }
        int signatureByteArrayLength = getSignatureByteArrayLength(jWSAlgorithm);
        if (getSignatureByteArrayLength(jWSAlgorithm) != bArr.length) {
            p.p("Illegal signature length");
            return;
        }
        int i14 = signatureByteArrayLength / 2;
        BigInteger bigInteger = new BigInteger(1, ByteUtils.subArray(bArr, 0, i14));
        BigInteger bigInteger2 = new BigInteger(1, ByteUtils.subArray(bArr, i14, i14));
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (bigInteger2.equals(bigInteger3) || bigInteger.equals(bigInteger3)) {
            p.p("S and R must not be 0");
            return;
        }
        BigInteger order = eCParameterSpec.getOrder();
        if (order.compareTo(bigInteger) < 1 || order.compareTo(bigInteger2) < 1) {
            p.p("S and R must not exceed N");
        } else if (bigInteger.mod(order).equals(bigInteger3) || bigInteger2.mod(order).equals(bigInteger3)) {
            p.p("R or S mod N != 0 check failed");
        }
    }

    public static int getSignatureByteArrayLength(JWSAlgorithm jWSAlgorithm) throws JOSEException {
        if (jWSAlgorithm.equals(JWSAlgorithm.ES256) || jWSAlgorithm.equals(JWSAlgorithm.ES256K)) {
            return 64;
        }
        if (jWSAlgorithm.equals(JWSAlgorithm.ES384)) {
            return 96;
        }
        if (jWSAlgorithm.equals(JWSAlgorithm.ES512)) {
            return 132;
        }
        throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, ECDSAProvider.SUPPORTED_ALGORITHMS));
    }

    public static Signature getSignerAndVerifier(JWSAlgorithm jWSAlgorithm, Provider provider) throws JOSEException {
        String str = "SHA256withECDSA";
        if (!jWSAlgorithm.equals(JWSAlgorithm.ES256) && !jWSAlgorithm.equals(JWSAlgorithm.ES256K)) {
            if (jWSAlgorithm.equals(JWSAlgorithm.ES384)) {
                str = "SHA384withECDSA";
            } else {
                if (!jWSAlgorithm.equals(JWSAlgorithm.ES512)) {
                    throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, ECDSAProvider.SUPPORTED_ALGORITHMS));
                }
                str = "SHA512withECDSA";
            }
        }
        try {
            return provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str);
        } catch (NoSuchAlgorithmException e4) {
            throw new JOSEException("Unsupported ECDSA algorithm: " + e4.getMessage(), e4);
        }
    }

    public static JWSAlgorithm resolveAlgorithm(Curve curve) throws JOSEException {
        if (curve == null) {
            p.p("The EC key curve is not supported, must be P-256, P-384 or P-521");
            return null;
        }
        if (Curve.P_256.equals(curve)) {
            return JWSAlgorithm.ES256;
        }
        if (Curve.SECP256K1.equals(curve)) {
            return JWSAlgorithm.ES256K;
        }
        if (Curve.P_384.equals(curve)) {
            return JWSAlgorithm.ES384;
        }
        if (Curve.P_521.equals(curve)) {
            return JWSAlgorithm.ES512;
        }
        p.m(curve, "Unexpected curve: ");
        return null;
    }

    public static byte[] transcodeSignatureToConcat(byte[] bArr, int i14) throws JOSEException {
        int i15;
        if (bArr.length < 8 || bArr[0] != 48) {
            p.p("Invalid ECDSA signature format");
            return null;
        }
        byte b14 = bArr[1];
        if (b14 > 0) {
            i15 = 2;
        } else {
            if (b14 != -127) {
                p.p("Invalid ECDSA signature format");
                return null;
            }
            i15 = 3;
        }
        int i16 = bArr[i15 + 1];
        int i17 = i16;
        while (i17 > 0 && bArr[((i15 + 2) + i16) - i17] == 0) {
            i17--;
        }
        int i18 = i15 + 2 + i16;
        int i19 = bArr[i18 + 1];
        int i24 = i19;
        while (i24 > 0 && bArr[((i18 + 2) + i19) - i24] == 0) {
            i24--;
        }
        int iMax = Math.max(Math.max(i17, i24), i14 / 2);
        int i25 = bArr[i15 - 1];
        if ((i25 & 255) != bArr.length - i15 || (i25 & 255) != i16 + 4 + i19 || bArr[i15] != 2 || bArr[i18] != 2) {
            p.p("Invalid ECDSA signature format");
            return null;
        }
        int i26 = iMax * 2;
        byte[] bArr2 = new byte[i26];
        System.arraycopy(bArr, i18 - i17, bArr2, iMax - i17, i17);
        System.arraycopy(bArr, ((i18 + 2) + i19) - i24, bArr2, i26 - i24, i24);
        return bArr2;
    }

    public static byte[] transcodeSignatureToDER(byte[] bArr) throws Exception {
        byte[] bArr2;
        try {
            int length = bArr.length / 2;
            int i14 = length;
            while (i14 > 0 && bArr[length - i14] == 0) {
                i14--;
            }
            int i15 = length - i14;
            int i16 = bArr[i15] < 0 ? i14 + 1 : i14;
            int i17 = length;
            while (i17 > 0 && bArr[(length * 2) - i17] == 0) {
                i17--;
            }
            int i18 = (length * 2) - i17;
            int i19 = bArr[i18] < 0 ? i17 + 1 : i17;
            int i24 = i16 + 4 + i19;
            if (i24 > 255) {
                throw new JOSEException("Invalid ECDSA signature format");
            }
            int i25 = 1;
            if (i24 < 128) {
                bArr2 = new byte[i16 + 6 + i19];
            } else {
                bArr2 = new byte[i16 + 7 + i19];
                bArr2[1] = -127;
                i25 = 2;
            }
            bArr2[0] = 48;
            bArr2[i25] = (byte) i24;
            bArr2[i25 + 1] = 2;
            bArr2[i25 + 2] = (byte) i16;
            int i26 = i25 + 3 + i16;
            System.arraycopy(bArr, i15, bArr2, i26 - i14, i14);
            bArr2[i26] = 2;
            bArr2[i26 + 1] = (byte) i19;
            System.arraycopy(bArr, i18, bArr2, ((i26 + 2) + i19) - i17, i17);
            return bArr2;
        } catch (Exception e4) {
            if (e4 instanceof JOSEException) {
                throw e4;
            }
            throw new JOSEException(e4.getMessage(), e4);
        }
    }

    public static JWSAlgorithm resolveAlgorithm(ECKey eCKey) {
        return resolveAlgorithm(Curve.forECParameterSpec(eCKey.getParams()));
    }
}
