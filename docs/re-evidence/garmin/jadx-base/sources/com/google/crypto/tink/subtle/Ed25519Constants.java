package com.google.crypto.tink.subtle;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
final class Ed25519Constants {
    static final Ed25519.CachedXYT[] B2;
    static final Ed25519.CachedXYT[][] B_TABLE;
    static final long[] D;
    static final long[] D2;
    private static final BigInteger D2_BI;
    private static final BigInteger D_BI;
    private static final BigInteger P_BI;
    static final long[] SQRTM1;
    private static final BigInteger SQRTM1_BI;

    public static class Point {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private BigInteger f53638x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private BigInteger f53639y;

        private Point() {
        }
    }

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        P_BI = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        D_BI = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        D2_BI = bigIntegerMod2;
        BigInteger bigIntegerModPow = BigInteger.valueOf(2L).modPow(bigIntegerSubtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        SQRTM1_BI = bigIntegerModPow;
        Point point = new Point();
        point.f53639y = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        point.f53638x = recoverX(point.f53639y);
        D = Field25519.expand(toLittleEndian(bigIntegerMod));
        D2 = Field25519.expand(toLittleEndian(bigIntegerMod2));
        SQRTM1 = Field25519.expand(toLittleEndian(bigIntegerModPow));
        B_TABLE = (Ed25519.CachedXYT[][]) Array.newInstance((Class<?>) Ed25519.CachedXYT.class, 32, 8);
        Point pointEdwards = point;
        for (int i14 = 0; i14 < 32; i14++) {
            Point pointEdwards2 = pointEdwards;
            for (int i15 = 0; i15 < 8; i15++) {
                B_TABLE[i14][i15] = getCachedXYT(pointEdwards2);
                pointEdwards2 = edwards(pointEdwards2, pointEdwards);
            }
            for (int i16 = 0; i16 < 8; i16++) {
                pointEdwards = edwards(pointEdwards, pointEdwards);
            }
        }
        Point pointEdwards3 = edwards(point, point);
        B2 = new Ed25519.CachedXYT[8];
        for (int i17 = 0; i17 < 8; i17++) {
            B2[i17] = getCachedXYT(point);
            point = edwards(point, pointEdwards3);
        }
    }

    private static Point edwards(Point point, Point point2) {
        Point point3 = new Point();
        BigInteger bigIntegerMultiply = D_BI.multiply(point.f53638x.multiply(point2.f53638x).multiply(point.f53639y).multiply(point2.f53639y));
        BigInteger bigInteger = P_BI;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = point.f53638x.multiply(point2.f53639y).add(point2.f53638x.multiply(point.f53639y));
        BigInteger bigInteger2 = BigInteger.ONE;
        point3.f53638x = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        point3.f53639y = point.f53639y.multiply(point2.f53639y).add(point.f53638x.multiply(point2.f53638x)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return point3;
    }

    private static Ed25519.CachedXYT getCachedXYT(Point point) {
        BigInteger bigIntegerAdd = point.f53639y.add(point.f53638x);
        BigInteger bigInteger = P_BI;
        return new Ed25519.CachedXYT(Field25519.expand(toLittleEndian(bigIntegerAdd.mod(bigInteger))), Field25519.expand(toLittleEndian(point.f53639y.subtract(point.f53638x).mod(bigInteger))), Field25519.expand(toLittleEndian(D2_BI.multiply(point.f53638x).multiply(point.f53639y).mod(bigInteger))));
    }

    private static BigInteger recoverX(BigInteger bigInteger) {
        BigInteger bigIntegerPow = bigInteger.pow(2);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerPow.subtract(bigInteger2);
        BigInteger bigIntegerAdd = D_BI.multiply(bigInteger.pow(2)).add(bigInteger2);
        BigInteger bigInteger3 = P_BI;
        BigInteger bigIntegerMultiply = bigIntegerSubtract.multiply(bigIntegerAdd.modInverse(bigInteger3));
        BigInteger bigIntegerModPow = bigIntegerMultiply.modPow(bigInteger3.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger3);
        if (!bigIntegerModPow.pow(2).subtract(bigIntegerMultiply).mod(bigInteger3).equals(BigInteger.ZERO)) {
            bigIntegerModPow = bigIntegerModPow.multiply(SQRTM1_BI).mod(bigInteger3);
        }
        return bigIntegerModPow.testBit(0) ? bigInteger3.subtract(bigIntegerModPow) : bigIntegerModPow;
    }

    private static byte[] toLittleEndian(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i14 = 0; i14 < 16; i14++) {
            byte b14 = bArr[i14];
            int i15 = 31 - i14;
            bArr[i14] = bArr[i15];
            bArr[i15] = b14;
        }
        return bArr;
    }
}
