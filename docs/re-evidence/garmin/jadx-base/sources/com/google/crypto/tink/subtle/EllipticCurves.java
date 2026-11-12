package com.google.crypto.tink.subtle;

import com.google.android.gms.internal.measurement.a;
import com.google.common.primitives.UnsignedBytes;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes2.dex */
public final class EllipticCurves {

    /* JADX INFO: renamed from: com.google.crypto.tink.subtle.EllipticCurves$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType;

        static {
            int[] iArr = new int[CurveType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType = iArr;
            try {
                iArr[CurveType.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[CurveType.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[CurveType.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[PointFormatType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType = iArr2;
            try {
                iArr2[PointFormatType.UNCOMPRESSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[PointFormatType.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum CurveType {
        NIST_P256,
        NIST_P384,
        NIST_P521
    }

    public enum EcdsaEncoding {
        IEEE_P1363,
        DER
    }

    public enum PointFormatType {
        UNCOMPRESSED,
        COMPRESSED,
        DO_NOT_USE_CRUNCHY_UNCOMPRESSED
    }

    public static void checkPointOnCurve(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger modulus = getModulus(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            a.t("point is at infinity");
            return;
        }
        if (affineX.signum() == -1 || affineX.compareTo(modulus) >= 0) {
            a.t("x is out of range");
            return;
        }
        if (affineY.signum() == -1 || affineY.compareTo(modulus) >= 0) {
            a.t("y is out of range");
        } else {
            if (affineY.multiply(affineY).mod(modulus).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(modulus))) {
                return;
            }
            a.t("Point is not on curve");
        }
    }

    public static void checkPublicKey(ECPublicKey eCPublicKey) throws GeneralSecurityException {
        checkPointOnCurve(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    public static byte[] computeSharedSecret(ECPrivateKey eCPrivateKey, ECPoint eCPoint) throws GeneralSecurityException {
        checkPointOnCurve(eCPoint, eCPrivateKey.getParams().getCurve());
        PublicKey publicKeyGeneratePublic = EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCPrivateKey.getParams()));
        KeyAgreement engineFactory = EngineFactory.KEY_AGREEMENT.getInstance("ECDH");
        engineFactory.init(eCPrivateKey);
        try {
            engineFactory.doPhase(publicKeyGeneratePublic, true);
            byte[] bArrGenerateSecret = engineFactory.generateSecret();
            validateSharedSecret(bArrGenerateSecret, eCPrivateKey);
            return bArrGenerateSecret;
        } catch (IllegalStateException e4) {
            throw new GeneralSecurityException(e4.toString());
        }
    }

    @Deprecated
    public static ECPoint ecPointDecode(EllipticCurve ellipticCurve, PointFormatType pointFormatType, byte[] bArr) {
        return pointDecode(ellipticCurve, pointFormatType, bArr);
    }

    public static byte[] ecdsaDer2Ieee(byte[] bArr, int i14) throws GeneralSecurityException {
        if (!isValidDerEncoding(bArr)) {
            a.t("Invalid DER encoding");
            return null;
        }
        byte[] bArr2 = new byte[i14];
        int i15 = (bArr[1] & UnsignedBytes.MAX_VALUE) >= 128 ? 3 : 2;
        int i16 = i15 + 1;
        int i17 = i15 + 2;
        int i18 = bArr[i16];
        int i19 = bArr[i17] == 0 ? 1 : 0;
        System.arraycopy(bArr, i17 + i19, bArr2, ((i14 / 2) - i18) + i19, i18 - i19);
        int i24 = i18 + 1 + i17;
        int i25 = i24 + 1;
        int i26 = bArr[i24];
        int i27 = bArr[i25] != 0 ? 0 : 1;
        System.arraycopy(bArr, i25 + i27, bArr2, (i14 - i26) + i27, i26 - i27);
        return bArr2;
    }

    public static byte[] ecdsaIeee2Der(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        int i14;
        if (bArr.length % 2 != 0 || bArr.length == 0 || bArr.length > 132) {
            a.t("Invalid IEEE_P1363 encoding");
            return null;
        }
        byte[] minimalSignedNumber = toMinimalSignedNumber(Arrays.copyOf(bArr, bArr.length / 2));
        byte[] minimalSignedNumber2 = toMinimalSignedNumber(Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length));
        int length = minimalSignedNumber.length + 4 + minimalSignedNumber2.length;
        if (length >= 128) {
            bArr2 = new byte[length + 3];
            bArr2[0] = 48;
            bArr2[1] = -127;
            bArr2[2] = (byte) length;
            i14 = 3;
        } else {
            bArr2 = new byte[length + 2];
            bArr2[0] = 48;
            bArr2[1] = (byte) length;
            i14 = 2;
        }
        int i15 = i14 + 1;
        bArr2[i14] = 2;
        int i16 = i14 + 2;
        bArr2[i15] = (byte) minimalSignedNumber.length;
        System.arraycopy(minimalSignedNumber, 0, bArr2, i16, minimalSignedNumber.length);
        int length2 = i16 + minimalSignedNumber.length;
        bArr2[length2] = 2;
        bArr2[length2 + 1] = (byte) minimalSignedNumber2.length;
        System.arraycopy(minimalSignedNumber2, 0, bArr2, length2 + 2, minimalSignedNumber2.length);
        return bArr2;
    }

    public static int encodingSizeInBytes(EllipticCurve ellipticCurve, PointFormatType pointFormatType) throws GeneralSecurityException {
        int iFieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int i14 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[pointFormatType.ordinal()];
        if (i14 == 1) {
            return (iFieldSizeInBytes * 2) + 1;
        }
        if (i14 == 2) {
            return iFieldSizeInBytes * 2;
        }
        if (i14 == 3) {
            return iFieldSizeInBytes + 1;
        }
        a.t("unknown EC point format");
        return 0;
    }

    public static int fieldSizeInBits(EllipticCurve ellipticCurve) {
        return getModulus(ellipticCurve).subtract(BigInteger.ONE).bitLength();
    }

    public static int fieldSizeInBytes(EllipticCurve ellipticCurve) {
        return (fieldSizeInBits(ellipticCurve) + 7) / 8;
    }

    public static KeyPair generateKeyPair(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator engineFactory = EngineFactory.KEY_PAIR_GENERATOR.getInstance("EC");
        engineFactory.initialize(eCParameterSpec);
        return engineFactory.generateKeyPair();
    }

    public static ECParameterSpec getCurveSpec(CurveType curveType) throws NoSuchAlgorithmException {
        int i14 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[curveType.ordinal()];
        if (i14 == 1) {
            return getNistP256Params();
        }
        if (i14 == 2) {
            return getNistP384Params();
        }
        if (i14 == 3) {
            return getNistP521Params();
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + curveType);
    }

    public static ECPrivateKey getEcPrivateKey(CurveType curveType, byte[] bArr) throws NoSuchAlgorithmException {
        return (ECPrivateKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), getCurveSpec(curveType)));
    }

    public static ECPublicKey getEcPublicKey(CurveType curveType, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec curveSpec = getCurveSpec(curveType);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        checkPointOnCurve(eCPoint, curveSpec.getCurve());
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, curveSpec));
    }

    public static BigInteger getModulus(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        a.t("Only curves over prime order fields are supported");
        return null;
    }

    private static ECParameterSpec getNistCurveSpec(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    public static ECParameterSpec getNistP256Params() {
        return getNistCurveSpec("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    }

    public static ECParameterSpec getNistP384Params() {
        return getNistCurveSpec("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    }

    public static ECParameterSpec getNistP521Params() {
        return getNistCurveSpec("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
    }

    public static BigInteger getY(BigInteger bigInteger, boolean z14, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger modulus = getModulus(ellipticCurve);
        BigInteger bigIntegerModSqrt = modSqrt(bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(modulus), modulus);
        return z14 != bigIntegerModSqrt.testBit(0) ? modulus.subtract(bigIntegerModSqrt).mod(modulus) : bigIntegerModSqrt;
    }

    public static boolean isNistEcParameterSpec(ECParameterSpec eCParameterSpec) {
        return isSameEcParameterSpec(eCParameterSpec, getNistP256Params()) || isSameEcParameterSpec(eCParameterSpec, getNistP384Params()) || isSameEcParameterSpec(eCParameterSpec, getNistP521Params());
    }

    public static boolean isSameEcParameterSpec(ECParameterSpec eCParameterSpec, ECParameterSpec eCParameterSpec2) {
        return eCParameterSpec.getCurve().equals(eCParameterSpec2.getCurve()) && eCParameterSpec.getGenerator().equals(eCParameterSpec2.getGenerator()) && eCParameterSpec.getOrder().equals(eCParameterSpec2.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec2.getCofactor();
    }

    public static boolean isValidDerEncoding(byte[] bArr) {
        int i14;
        int i15;
        int i16;
        int i17;
        if (bArr.length < 8 || bArr[0] != 48) {
            return false;
        }
        int i18 = bArr[1] & UnsignedBytes.MAX_VALUE;
        if (i18 == 129) {
            i18 = bArr[2] & UnsignedBytes.MAX_VALUE;
            if (i18 < 128) {
                return false;
            }
            i14 = 2;
        } else {
            if (i18 == 128 || i18 > 129) {
                return false;
            }
            i14 = 1;
        }
        if (i18 != (bArr.length - 1) - i14 || bArr[i14 + 1] != 2 || (i17 = (i16 = i14 + 3 + (i15 = bArr[i14 + 2] & UnsignedBytes.MAX_VALUE)) + 1) >= bArr.length || i15 == 0) {
            return false;
        }
        int i19 = i14 + 3;
        byte b14 = bArr[i19];
        if ((b14 & UnsignedBytes.MAX_VALUE) >= 128) {
            return false;
        }
        if ((i15 > 1 && b14 == 0 && (bArr[i14 + 4] & UnsignedBytes.MAX_VALUE) < 128) || bArr[i19 + i15] != 2) {
            return false;
        }
        int i24 = bArr[i17] & UnsignedBytes.MAX_VALUE;
        if (i16 + 2 + i24 != bArr.length || i24 == 0) {
            return false;
        }
        byte b15 = bArr[i14 + 5 + i15];
        if ((b15 & UnsignedBytes.MAX_VALUE) >= 128) {
            return false;
        }
        return i24 <= 1 || b15 != 0 || (bArr[(i14 + 6) + i15] & UnsignedBytes.MAX_VALUE) >= 128;
    }

    public static BigInteger modSqrt(BigInteger bigInteger, BigInteger bigInteger2) throws GeneralSecurityException {
        BigInteger bigIntegerModPow;
        if (bigInteger2.signum() != 1) {
            e.t("p must be positive");
            return null;
        }
        BigInteger bigIntegerMod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (bigIntegerMod.equals(bigInteger3)) {
            return bigInteger3;
        }
        int i14 = 0;
        if (bigInteger2.testBit(0) && bigInteger2.testBit(1)) {
            bigIntegerModPow = bigIntegerMod.modPow(bigInteger2.add(BigInteger.ONE).shiftRight(2), bigInteger2);
        } else if (!bigInteger2.testBit(0) || bigInteger2.testBit(1)) {
            bigIntegerModPow = null;
        } else {
            BigInteger bigIntegerAdd = BigInteger.ONE;
            BigInteger bigIntegerShiftRight = bigInteger2.subtract(bigIntegerAdd).shiftRight(1);
            while (true) {
                BigInteger bigIntegerMod2 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod).mod(bigInteger2);
                if (bigIntegerMod2.equals(BigInteger.ZERO)) {
                    return bigIntegerAdd;
                }
                BigInteger bigIntegerModPow2 = bigIntegerMod2.modPow(bigIntegerShiftRight, bigInteger2);
                BigInteger bigIntegerMod3 = BigInteger.ONE;
                if (bigIntegerModPow2.add(bigIntegerMod3).equals(bigInteger2)) {
                    BigInteger bigIntegerShiftRight2 = bigInteger2.add(bigIntegerMod3).shiftRight(1);
                    BigInteger bigIntegerMod4 = bigIntegerAdd;
                    for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                        BigInteger bigIntegerMultiply = bigIntegerMod4.multiply(bigIntegerMod3);
                        bigIntegerMod4 = bigIntegerMod4.multiply(bigIntegerMod4).add(bigIntegerMod3.multiply(bigIntegerMod3).mod(bigInteger2).multiply(bigIntegerMod2)).mod(bigInteger2);
                        BigInteger bigIntegerMod5 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigInteger2);
                        if (bigIntegerShiftRight2.testBit(iBitLength)) {
                            BigInteger bigIntegerMod6 = bigIntegerMod4.multiply(bigIntegerAdd).add(bigIntegerMod5.multiply(bigIntegerMod2)).mod(bigInteger2);
                            bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerMod5).add(bigIntegerMod4).mod(bigInteger2);
                            bigIntegerMod4 = bigIntegerMod6;
                        } else {
                            bigIntegerMod3 = bigIntegerMod5;
                        }
                    }
                    bigIntegerModPow = bigIntegerMod4;
                    break;
                }
                if (!bigIntegerModPow2.equals(bigIntegerMod3)) {
                    e.t("p is not prime");
                    return null;
                }
                bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod3);
                i14++;
                if (i14 == 128 && !bigInteger2.isProbablePrime(80)) {
                    e.t("p is not prime");
                    return null;
                }
            }
        }
        if (bigIntegerModPow == null || bigIntegerModPow.multiply(bigIntegerModPow).mod(bigInteger2).compareTo(bigIntegerMod) == 0) {
            return bigIntegerModPow;
        }
        a.t("Could not find a modular square root");
        return null;
    }

    public static ECPoint pointDecode(EllipticCurve ellipticCurve, PointFormatType pointFormatType, byte[] bArr) throws GeneralSecurityException {
        int iFieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int i14 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[pointFormatType.ordinal()];
        boolean z14 = false;
        if (i14 == 1) {
            if (bArr.length != (iFieldSizeInBytes * 2) + 1) {
                a.t("invalid point size");
                return null;
            }
            if (bArr[0] != 4) {
                a.t("invalid point format");
                return null;
            }
            int i15 = iFieldSizeInBytes + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i15)), new BigInteger(1, Arrays.copyOfRange(bArr, i15, bArr.length)));
            checkPointOnCurve(eCPoint, ellipticCurve);
            return eCPoint;
        }
        if (i14 == 2) {
            if (bArr.length != iFieldSizeInBytes * 2) {
                a.t("invalid point size");
                return null;
            }
            ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, iFieldSizeInBytes)), new BigInteger(1, Arrays.copyOfRange(bArr, iFieldSizeInBytes, bArr.length)));
            checkPointOnCurve(eCPoint2, ellipticCurve);
            return eCPoint2;
        }
        if (i14 != 3) {
            a.k(pointFormatType, "invalid format:");
            return null;
        }
        BigInteger modulus = getModulus(ellipticCurve);
        if (bArr.length != iFieldSizeInBytes + 1) {
            a.t("compressed point has wrong length");
            return null;
        }
        byte b14 = bArr[0];
        if (b14 != 2) {
            if (b14 != 3) {
                a.t("invalid format");
                return null;
            }
            z14 = true;
        }
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
        if (bigInteger.signum() != -1 && bigInteger.compareTo(modulus) < 0) {
            return new ECPoint(bigInteger, getY(bigInteger, z14, ellipticCurve));
        }
        a.t("x is out of range");
        return null;
    }

    public static byte[] pointEncode(EllipticCurve ellipticCurve, PointFormatType pointFormatType, ECPoint eCPoint) throws GeneralSecurityException {
        checkPointOnCurve(eCPoint, ellipticCurve);
        int iFieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int i14 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[pointFormatType.ordinal()];
        if (i14 == 1) {
            int i15 = (iFieldSizeInBytes * 2) + 1;
            byte[] bArr = new byte[i15];
            byte[] byteArray = eCPoint.getAffineX().toByteArray();
            byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
            System.arraycopy(byteArray2, 0, bArr, i15 - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr, (iFieldSizeInBytes + 1) - byteArray.length, byteArray.length);
            bArr[0] = 4;
            return bArr;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                a.k(pointFormatType, "invalid format:");
                return null;
            }
            int i16 = iFieldSizeInBytes + 1;
            byte[] bArr2 = new byte[i16];
            byte[] byteArray3 = eCPoint.getAffineX().toByteArray();
            System.arraycopy(byteArray3, 0, bArr2, i16 - byteArray3.length, byteArray3.length);
            bArr2[0] = (byte) (eCPoint.getAffineY().testBit(0) ? 3 : 2);
            return bArr2;
        }
        int i17 = iFieldSizeInBytes * 2;
        byte[] bArr3 = new byte[i17];
        byte[] byteArray4 = eCPoint.getAffineX().toByteArray();
        if (byteArray4.length > iFieldSizeInBytes) {
            byteArray4 = Arrays.copyOfRange(byteArray4, byteArray4.length - iFieldSizeInBytes, byteArray4.length);
        }
        byte[] byteArray5 = eCPoint.getAffineY().toByteArray();
        if (byteArray5.length > iFieldSizeInBytes) {
            byteArray5 = Arrays.copyOfRange(byteArray5, byteArray5.length - iFieldSizeInBytes, byteArray5.length);
        }
        System.arraycopy(byteArray5, 0, bArr3, i17 - byteArray5.length, byteArray5.length);
        System.arraycopy(byteArray4, 0, bArr3, iFieldSizeInBytes - byteArray4.length, byteArray4.length);
        return bArr3;
    }

    private static byte[] toMinimalSignedNumber(byte[] bArr) {
        int length = 0;
        while (length < bArr.length && bArr[length] == 0) {
            length++;
        }
        if (length == bArr.length) {
            length = bArr.length - 1;
        }
        int i14 = (bArr[length] & UnsignedBytes.MAX_POWER_OF_TWO) == 128 ? 1 : 0;
        byte[] bArr2 = new byte[(bArr.length - length) + i14];
        System.arraycopy(bArr, length, bArr2, i14, bArr.length - length);
        return bArr2;
    }

    public static void validatePublicKey(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        validatePublicKeySpec(eCPublicKey, eCPrivateKey);
        checkPointOnCurve(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    public static void validatePublicKeySpec(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            if (isSameEcParameterSpec(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e4) {
            throw new GeneralSecurityException(e4.toString());
        }
    }

    private static void validateSharedSecret(byte[] bArr, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        EllipticCurve curve = eCPrivateKey.getParams().getCurve();
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.signum() == -1 || bigInteger.compareTo(getModulus(curve)) >= 0) {
            a.t("shared secret is out of range");
        } else {
            getY(bigInteger, true, curve);
        }
    }

    public static KeyPair generateKeyPair(CurveType curveType) {
        return generateKeyPair(getCurveSpec(curveType));
    }

    public static ECPrivateKey getEcPrivateKey(byte[] bArr) {
        return (ECPrivateKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePrivate(new PKCS8EncodedKeySpec(bArr));
    }

    public static ECPublicKey getEcPublicKey(CurveType curveType, PointFormatType pointFormatType, byte[] bArr) {
        return getEcPublicKey(getCurveSpec(curveType), pointFormatType, bArr);
    }

    public static ECPublicKey getEcPublicKey(ECParameterSpec eCParameterSpec, PointFormatType pointFormatType, byte[] bArr) {
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new ECPublicKeySpec(pointDecode(eCParameterSpec.getCurve(), pointFormatType, bArr), eCParameterSpec));
    }

    public static ECPublicKey getEcPublicKey(byte[] bArr) {
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new X509EncodedKeySpec(bArr));
    }

    public static byte[] computeSharedSecret(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        validatePublicKeySpec(eCPublicKey, eCPrivateKey);
        return computeSharedSecret(eCPrivateKey, eCPublicKey.getW());
    }

    public static byte[] pointEncode(CurveType curveType, PointFormatType pointFormatType, ECPoint eCPoint) {
        return pointEncode(getCurveSpec(curveType).getCurve(), pointFormatType, eCPoint);
    }

    public static ECPoint pointDecode(CurveType curveType, PointFormatType pointFormatType, byte[] bArr) {
        return pointDecode(getCurveSpec(curveType).getCurve(), pointFormatType, bArr);
    }
}
