package com.google.crypto.tink.subtle;

import com.google.android.gms.internal.measurement.a;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class Ed25519 {
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SECRET_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;
    private static final CachedXYT CACHED_NEUTRAL = new CachedXYT(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final PartialXYZT NEUTRAL = new PartialXYZT(new XYZ(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] GROUP_ORDER = {-19, -45, -11, 92, Ascii.SUB, 99, Ascii.DC2, 88, -42, -100, -9, -94, -34, -7, -34, Ascii.DC4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Ascii.DLE};

    private static void add(PartialXYZT partialXYZT, XYZT xyzt, CachedXYT cachedXYT) {
        long[] jArr = new long[10];
        long[] jArr2 = partialXYZT.xyz.f53634x;
        XYZ xyz = xyzt.xyz;
        Field25519.sum(jArr2, xyz.f53635y, xyz.f53634x);
        long[] jArr3 = partialXYZT.xyz.f53635y;
        XYZ xyz2 = xyzt.xyz;
        Field25519.sub(jArr3, xyz2.f53635y, xyz2.f53634x);
        long[] jArr4 = partialXYZT.xyz.f53635y;
        Field25519.mult(jArr4, jArr4, cachedXYT.yMinusX);
        XYZ xyz3 = partialXYZT.xyz;
        Field25519.mult(xyz3.f53636z, xyz3.f53634x, cachedXYT.yPlusX);
        Field25519.mult(partialXYZT.f53633t, xyzt.f53637t, cachedXYT.t2d);
        cachedXYT.multByZ(partialXYZT.xyz.f53634x, xyzt.xyz.f53636z);
        long[] jArr5 = partialXYZT.xyz.f53634x;
        Field25519.sum(jArr, jArr5, jArr5);
        XYZ xyz4 = partialXYZT.xyz;
        Field25519.sub(xyz4.f53634x, xyz4.f53636z, xyz4.f53635y);
        XYZ xyz5 = partialXYZT.xyz;
        long[] jArr6 = xyz5.f53635y;
        Field25519.sum(jArr6, xyz5.f53636z, jArr6);
        Field25519.sum(partialXYZT.xyz.f53636z, jArr, partialXYZT.f53633t);
        long[] jArr7 = partialXYZT.f53633t;
        Field25519.sub(jArr7, jArr, jArr7);
    }

    private static XYZ doubleScalarMultVarTime(byte[] bArr, XYZT xyzt, byte[] bArr2) {
        CachedXYZT[] cachedXYZTArr = new CachedXYZT[8];
        cachedXYZTArr[0] = new CachedXYZT(xyzt);
        PartialXYZT partialXYZT = new PartialXYZT();
        doubleXYZT(partialXYZT, xyzt);
        XYZT xyzt2 = new XYZT(partialXYZT);
        for (int i14 = 1; i14 < 8; i14++) {
            add(partialXYZT, xyzt2, cachedXYZTArr[i14 - 1]);
            cachedXYZTArr[i14] = new CachedXYZT(new XYZT(partialXYZT));
        }
        byte[] bArrSlide = slide(bArr);
        byte[] bArrSlide2 = slide(bArr2);
        PartialXYZT partialXYZT2 = new PartialXYZT(NEUTRAL);
        XYZT xyzt3 = new XYZT();
        int i15 = 255;
        while (i15 >= 0 && bArrSlide[i15] == 0 && bArrSlide2[i15] == 0) {
            i15--;
        }
        while (i15 >= 0) {
            doubleXYZ(partialXYZT2, new XYZ(partialXYZT2));
            byte b14 = bArrSlide[i15];
            if (b14 > 0) {
                add(partialXYZT2, XYZT.fromPartialXYZT(xyzt3, partialXYZT2), cachedXYZTArr[bArrSlide[i15] / 2]);
            } else if (b14 < 0) {
                sub(partialXYZT2, XYZT.fromPartialXYZT(xyzt3, partialXYZT2), cachedXYZTArr[(-bArrSlide[i15]) / 2]);
            }
            byte b15 = bArrSlide2[i15];
            if (b15 > 0) {
                add(partialXYZT2, XYZT.fromPartialXYZT(xyzt3, partialXYZT2), Ed25519Constants.B2[bArrSlide2[i15] / 2]);
            } else if (b15 < 0) {
                sub(partialXYZT2, XYZT.fromPartialXYZT(xyzt3, partialXYZT2), Ed25519Constants.B2[(-bArrSlide2[i15]) / 2]);
            }
            i15--;
        }
        return new XYZ(partialXYZT2);
    }

    private static void doubleXYZ(PartialXYZT partialXYZT, XYZ xyz) {
        long[] jArr = new long[10];
        Field25519.square(partialXYZT.xyz.f53634x, xyz.f53634x);
        Field25519.square(partialXYZT.xyz.f53636z, xyz.f53635y);
        Field25519.square(partialXYZT.f53633t, xyz.f53636z);
        long[] jArr2 = partialXYZT.f53633t;
        Field25519.sum(jArr2, jArr2, jArr2);
        Field25519.sum(partialXYZT.xyz.f53635y, xyz.f53634x, xyz.f53635y);
        Field25519.square(jArr, partialXYZT.xyz.f53635y);
        XYZ xyz2 = partialXYZT.xyz;
        Field25519.sum(xyz2.f53635y, xyz2.f53636z, xyz2.f53634x);
        XYZ xyz3 = partialXYZT.xyz;
        long[] jArr3 = xyz3.f53636z;
        Field25519.sub(jArr3, jArr3, xyz3.f53634x);
        XYZ xyz4 = partialXYZT.xyz;
        Field25519.sub(xyz4.f53634x, jArr, xyz4.f53635y);
        long[] jArr4 = partialXYZT.f53633t;
        Field25519.sub(jArr4, jArr4, partialXYZT.xyz.f53636z);
    }

    private static void doubleXYZT(PartialXYZT partialXYZT, XYZT xyzt) {
        doubleXYZ(partialXYZT, xyzt.xyz);
    }

    private static int eq(int i14, int i15) {
        int i16 = (~(i14 ^ i15)) & 255;
        int i17 = i16 & (i16 << 4);
        int i18 = i17 & (i17 << 2);
        return ((i18 & (i18 << 1)) >> 7) & 1;
    }

    public static byte[] getHashedScalar(byte[] bArr) throws GeneralSecurityException {
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(MessageDigestAlgorithms.SHA_512);
        engineFactory.update(bArr, 0, 32);
        byte[] bArrDigest = engineFactory.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        byte b14 = (byte) (bArrDigest[31] & Ascii.DEL);
        bArrDigest[31] = b14;
        bArrDigest[31] = (byte) (b14 | SignedBytes.MAX_POWER_OF_TWO);
        return bArrDigest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getLsb(long[] jArr) {
        return Field25519.contract(jArr)[0] & 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNonZeroVarTime(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        Field25519.reduceCoefficients(jArr2);
        for (byte b14 : Field25519.contract(jArr2)) {
            if (b14 != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSmallerThanGroupOrder(byte[] bArr) {
        for (int i14 = 31; i14 >= 0; i14--) {
            int i15 = bArr[i14] & UnsignedBytes.MAX_VALUE;
            int i16 = GROUP_ORDER[i14] & UnsignedBytes.MAX_VALUE;
            if (i15 != i16) {
                return i15 < i16;
            }
        }
        return false;
    }

    private static long load3(byte[] bArr, int i14) {
        return (((long) (bArr[i14 + 2] & UnsignedBytes.MAX_VALUE)) << 16) | (((long) bArr[i14]) & 255) | (((long) (bArr[i14 + 1] & UnsignedBytes.MAX_VALUE)) << 8);
    }

    private static long load4(byte[] bArr, int i14) {
        return (((long) (bArr[i14 + 3] & UnsignedBytes.MAX_VALUE)) << 24) | load3(bArr, i14);
    }

    private static void mulAdd(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        long jLoad3 = load3(bArr2, 0) & 2097151;
        long jLoad4 = (load4(bArr2, 2) >> 5) & 2097151;
        long jLoad5 = (load3(bArr2, 5) >> 2) & 2097151;
        long jLoad6 = (load4(bArr2, 7) >> 7) & 2097151;
        long jLoad7 = (load4(bArr2, 10) >> 4) & 2097151;
        long jLoad8 = (load3(bArr2, 13) >> 1) & 2097151;
        long jLoad9 = (load4(bArr2, 15) >> 6) & 2097151;
        long jLoad10 = (load3(bArr2, 18) >> 3) & 2097151;
        long jLoad11 = load3(bArr2, 21) & 2097151;
        long jLoad12 = (load4(bArr2, 23) >> 5) & 2097151;
        long jLoad13 = (load3(bArr2, 26) >> 2) & 2097151;
        long jLoad14 = load4(bArr2, 28) >> 7;
        long jLoad15 = load3(bArr3, 0) & 2097151;
        long jLoad16 = (load4(bArr3, 2) >> 5) & 2097151;
        long jLoad17 = (load3(bArr3, 5) >> 2) & 2097151;
        long jLoad18 = (load4(bArr3, 7) >> 7) & 2097151;
        long jLoad19 = (load4(bArr3, 10) >> 4) & 2097151;
        long jLoad20 = (load3(bArr3, 13) >> 1) & 2097151;
        long jLoad21 = (load4(bArr3, 15) >> 6) & 2097151;
        long jLoad22 = (load3(bArr3, 18) >> 3) & 2097151;
        long jLoad23 = load3(bArr3, 21) & 2097151;
        long jLoad24 = (load4(bArr3, 23) >> 5) & 2097151;
        long jLoad25 = (load3(bArr3, 26) >> 2) & 2097151;
        long jLoad26 = load4(bArr3, 28) >> 7;
        long jLoad27 = load3(bArr4, 0) & 2097151;
        long jLoad28 = (load4(bArr4, 2) >> 5) & 2097151;
        long jLoad29 = (load3(bArr4, 5) >> 2) & 2097151;
        long jLoad30 = (load4(bArr4, 7) >> 7) & 2097151;
        long jLoad31 = (load4(bArr4, 10) >> 4) & 2097151;
        long jLoad32 = (load3(bArr4, 13) >> 1) & 2097151;
        long jLoad33 = (load4(bArr4, 15) >> 6) & 2097151;
        long jLoad34 = (load3(bArr4, 18) >> 3) & 2097151;
        long jLoad35 = load3(bArr4, 21) & 2097151;
        long j8 = (jLoad3 * jLoad15) + jLoad27;
        long j14 = (jLoad4 * jLoad15) + (jLoad3 * jLoad16) + jLoad28;
        long j15 = (jLoad5 * jLoad15) + (jLoad4 * jLoad16) + (jLoad3 * jLoad17) + jLoad29;
        long j16 = (jLoad6 * jLoad15) + (jLoad5 * jLoad16) + (jLoad4 * jLoad17) + (jLoad3 * jLoad18) + jLoad30;
        long j17 = (jLoad7 * jLoad15) + (jLoad6 * jLoad16) + (jLoad5 * jLoad17) + (jLoad4 * jLoad18) + (jLoad3 * jLoad19) + jLoad31;
        long j18 = (jLoad8 * jLoad15) + (jLoad7 * jLoad16) + (jLoad6 * jLoad17) + (jLoad5 * jLoad18) + (jLoad4 * jLoad19) + (jLoad3 * jLoad20) + jLoad32;
        long j19 = (jLoad9 * jLoad15) + (jLoad8 * jLoad16) + (jLoad7 * jLoad17) + (jLoad6 * jLoad18) + (jLoad5 * jLoad19) + (jLoad4 * jLoad20) + (jLoad3 * jLoad21) + jLoad33;
        long j24 = (jLoad10 * jLoad15) + (jLoad9 * jLoad16) + (jLoad8 * jLoad17) + (jLoad7 * jLoad18) + (jLoad6 * jLoad19) + (jLoad5 * jLoad20) + (jLoad4 * jLoad21) + (jLoad3 * jLoad22) + jLoad34;
        long j25 = (jLoad11 * jLoad15) + (jLoad10 * jLoad16) + (jLoad9 * jLoad17) + (jLoad8 * jLoad18) + (jLoad7 * jLoad19) + (jLoad6 * jLoad20) + (jLoad5 * jLoad21) + (jLoad4 * jLoad22) + (jLoad3 * jLoad23) + jLoad35;
        long jLoad36 = (jLoad12 * jLoad15) + (jLoad11 * jLoad16) + (jLoad10 * jLoad17) + (jLoad9 * jLoad18) + (jLoad8 * jLoad19) + (jLoad7 * jLoad20) + (jLoad6 * jLoad21) + (jLoad5 * jLoad22) + (jLoad4 * jLoad23) + (jLoad3 * jLoad24) + ((load4(bArr4, 23) >> 5) & 2097151);
        long jLoad37 = (jLoad13 * jLoad15) + (jLoad12 * jLoad16) + (jLoad11 * jLoad17) + (jLoad10 * jLoad18) + (jLoad9 * jLoad19) + (jLoad8 * jLoad20) + (jLoad7 * jLoad21) + (jLoad6 * jLoad22) + (jLoad5 * jLoad23) + (jLoad4 * jLoad24) + (jLoad3 * jLoad25) + ((load3(bArr4, 26) >> 2) & 2097151);
        long j26 = jLoad15 * jLoad14;
        long jLoad38 = j26 + (jLoad13 * jLoad16) + (jLoad12 * jLoad17) + (jLoad11 * jLoad18) + (jLoad10 * jLoad19) + (jLoad9 * jLoad20) + (jLoad8 * jLoad21) + (jLoad7 * jLoad22) + (jLoad6 * jLoad23) + (jLoad5 * jLoad24) + (jLoad4 * jLoad25) + (jLoad3 * jLoad26) + (load4(bArr4, 28) >> 7);
        long j27 = (jLoad16 * jLoad14) + (jLoad13 * jLoad17) + (jLoad12 * jLoad18) + (jLoad11 * jLoad19) + (jLoad10 * jLoad20) + (jLoad9 * jLoad21) + (jLoad8 * jLoad22) + (jLoad7 * jLoad23) + (jLoad6 * jLoad24) + (jLoad5 * jLoad25) + (jLoad4 * jLoad26);
        long j28 = jLoad17 * jLoad14;
        long j29 = j28 + (jLoad13 * jLoad18) + (jLoad12 * jLoad19) + (jLoad11 * jLoad20) + (jLoad10 * jLoad21) + (jLoad9 * jLoad22) + (jLoad8 * jLoad23) + (jLoad7 * jLoad24) + (jLoad6 * jLoad25) + (jLoad5 * jLoad26);
        long j34 = jLoad18 * jLoad14;
        long j35 = j34 + (jLoad13 * jLoad19) + (jLoad12 * jLoad20) + (jLoad11 * jLoad21) + (jLoad10 * jLoad22) + (jLoad9 * jLoad23) + (jLoad8 * jLoad24) + (jLoad7 * jLoad25) + (jLoad6 * jLoad26);
        long j36 = jLoad19 * jLoad14;
        long j37 = j36 + (jLoad13 * jLoad20) + (jLoad12 * jLoad21) + (jLoad11 * jLoad22) + (jLoad10 * jLoad23) + (jLoad9 * jLoad24) + (jLoad8 * jLoad25) + (jLoad7 * jLoad26);
        long j38 = jLoad20 * jLoad14;
        long j39 = j38 + (jLoad13 * jLoad21) + (jLoad12 * jLoad22) + (jLoad11 * jLoad23) + (jLoad10 * jLoad24) + (jLoad9 * jLoad25) + (jLoad8 * jLoad26);
        long j44 = jLoad21 * jLoad14;
        long j45 = j44 + (jLoad13 * jLoad22) + (jLoad12 * jLoad23) + (jLoad11 * jLoad24) + (jLoad10 * jLoad25) + (jLoad9 * jLoad26);
        long j46 = jLoad22 * jLoad14;
        long j47 = j46 + (jLoad13 * jLoad23) + (jLoad12 * jLoad24) + (jLoad11 * jLoad25) + (jLoad10 * jLoad26);
        long j48 = jLoad23 * jLoad14;
        long j49 = j48 + (jLoad13 * jLoad24) + (jLoad12 * jLoad25) + (jLoad11 * jLoad26);
        long j54 = (jLoad24 * jLoad14) + (jLoad13 * jLoad25) + (jLoad12 * jLoad26);
        long j55 = jLoad25 * jLoad14;
        long j56 = jLoad14 * jLoad26;
        long j57 = (j8 + 1048576) >> 21;
        long j58 = j14 + j57;
        long j59 = j8 - (j57 << 21);
        long j64 = (j15 + 1048576) >> 21;
        long j65 = j16 + j64;
        long j66 = j15 - (j64 << 21);
        long j67 = (j17 + 1048576) >> 21;
        long j68 = j18 + j67;
        long j69 = j17 - (j67 << 21);
        long j74 = (j19 + 1048576) >> 21;
        long j75 = j24 + j74;
        long j76 = j19 - (j74 << 21);
        long j77 = (j25 + 1048576) >> 21;
        long j78 = jLoad36 + j77;
        long j79 = j25 - (j77 << 21);
        long j84 = (jLoad37 + 1048576) >> 21;
        long j85 = jLoad38 + j84;
        long j86 = jLoad37 - (j84 << 21);
        long j87 = (j27 + 1048576) >> 21;
        long j88 = j29 + j87;
        long j89 = j27 - (j87 << 21);
        long j93 = (j35 + 1048576) >> 21;
        long j94 = j37 + j93;
        long j95 = j35 - (j93 << 21);
        long j96 = (j39 + 1048576) >> 21;
        long j97 = j45 + j96;
        long j98 = j39 - (j96 << 21);
        long j99 = (j47 + 1048576) >> 21;
        long j100 = j49 + j99;
        long j101 = j47 - (j99 << 21);
        long j102 = (j54 + 1048576) >> 21;
        long j103 = j55 + (jLoad13 * jLoad26) + j102;
        long j104 = j54 - (j102 << 21);
        long j105 = (j56 + 1048576) >> 21;
        long j106 = (j58 + 1048576) >> 21;
        long j107 = j66 + j106;
        long j108 = j58 - (j106 << 21);
        long j109 = (j65 + 1048576) >> 21;
        long j110 = j69 + j109;
        long j111 = j65 - (j109 << 21);
        long j112 = (j68 + 1048576) >> 21;
        long j113 = j76 + j112;
        long j114 = j68 - (j112 << 21);
        long j115 = (j75 + 1048576) >> 21;
        long j116 = j79 + j115;
        long j117 = j75 - (j115 << 21);
        long j118 = (j78 + 1048576) >> 21;
        long j119 = j86 + j118;
        long j120 = j78 - (j118 << 21);
        long j121 = (j85 + 1048576) >> 21;
        long j122 = j89 + j121;
        long j123 = j85 - (j121 << 21);
        long j124 = (j88 + 1048576) >> 21;
        long j125 = j95 + j124;
        long j126 = j88 - (j124 << 21);
        long j127 = (j94 + 1048576) >> 21;
        long j128 = j98 + j127;
        long j129 = j94 - (j127 << 21);
        long j130 = (j97 + 1048576) >> 21;
        long j131 = j101 + j130;
        long j132 = j97 - (j130 << 21);
        long j133 = (j100 + 1048576) >> 21;
        long j134 = j104 + j133;
        long j135 = j100 - (j133 << 21);
        long j136 = (j103 + 1048576) >> 21;
        long j137 = (j56 - (j105 << 21)) + j136;
        long j138 = j103 - (j136 << 21);
        long j139 = (j105 * 666643) + j123;
        long j140 = (j105 * 470296) + j122;
        long j141 = (j105 * 654183) + j126;
        long j142 = j125 - (j105 * 997805);
        long j143 = (j105 * 136657) + j129;
        long j144 = j128 - (j105 * 683901);
        long j145 = (j137 * 470296) + j139;
        long j146 = (j137 * 654183) + j140;
        long j147 = j143 - (j137 * 683901);
        long j148 = (j138 * 470296) + (j137 * 666643) + j119;
        long j149 = (j138 * 654183) + j145;
        long j150 = (j138 * 136657) + (j141 - (j137 * 997805));
        long j151 = ((j137 * 136657) + j142) - (j138 * 683901);
        long j152 = (j134 * 654183) + j148;
        long j153 = (j135 * 654183) + (j134 * 470296) + (j138 * 666643) + j120;
        long j154 = (j135 * 136657) + (j149 - (j134 * 997805));
        long j155 = ((j134 * 136657) + (j146 - (j138 * 997805))) - (j135 * 683901);
        long j156 = (j131 * 666643) + j113;
        long j157 = (j131 * 654183) + (j135 * 470296) + (j134 * 666643) + j116;
        long j158 = (j131 * 136657) + (j152 - (j135 * 997805));
        long j159 = (j156 + 1048576) >> 21;
        long j160 = (j131 * 470296) + (j135 * 666643) + j117 + j159;
        long j161 = j156 - (j159 << 21);
        long j162 = (j157 + 1048576) >> 21;
        long j163 = (j153 - (j131 * 997805)) + j162;
        long j164 = j157 - (j162 << 21);
        long j165 = (j158 + 1048576) >> 21;
        long j166 = (j154 - (j131 * 683901)) + j165;
        long j167 = j158 - (j165 << 21);
        long j168 = (j155 + 1048576) >> 21;
        long j169 = (j150 - (j134 * 683901)) + j168;
        long j170 = j155 - (j168 << 21);
        long j171 = (j151 + 1048576) >> 21;
        long j172 = j147 + j171;
        long j173 = j151 - (j171 << 21);
        long j174 = (j144 + 1048576) >> 21;
        long j175 = j132 + j174;
        long j176 = j144 - (j174 << 21);
        long j177 = (j160 + 1048576) >> 21;
        long j178 = j164 + j177;
        long j179 = j160 - (j177 << 21);
        long j180 = (j163 + 1048576) >> 21;
        long j181 = j167 + j180;
        long j182 = j163 - (j180 << 21);
        long j183 = (j166 + 1048576) >> 21;
        long j184 = j170 + j183;
        long j185 = j166 - (j183 << 21);
        long j186 = (j169 + 1048576) >> 21;
        long j187 = j173 + j186;
        long j188 = j169 - (j186 << 21);
        long j189 = (j172 + 1048576) >> 21;
        long j190 = j176 + j189;
        long j191 = j172 - (j189 << 21);
        long j192 = (j175 * 470296) + j161;
        long j193 = (j175 * 654183) + j179;
        long j194 = j178 - (j175 * 997805);
        long j195 = (j175 * 136657) + j182;
        long j196 = j181 - (j175 * 683901);
        long j197 = (j190 * 470296) + (j175 * 666643) + j114;
        long j198 = (j190 * 654183) + j192;
        long j199 = j193 - (j190 * 997805);
        long j200 = (j190 * 136657) + j194;
        long j201 = j195 - (j190 * 683901);
        long j202 = (j191 * 470296) + (j190 * 666643) + j110;
        long j203 = (j191 * 654183) + j197;
        long j204 = j198 - (j191 * 997805);
        long j205 = (j191 * 136657) + j199;
        long j206 = j200 - (j191 * 683901);
        long j207 = (j187 * 654183) + j202;
        long j208 = (j187 * 136657) + j204;
        long j209 = j205 - (j187 * 683901);
        long j210 = (j188 * 470296) + (j187 * 666643) + j107;
        long j211 = (j188 * 654183) + (j187 * 470296) + (j191 * 666643) + j111;
        long j212 = j207 - (j188 * 997805);
        long j213 = (j188 * 136657) + (j203 - (j187 * 997805));
        long j214 = j208 - (j188 * 683901);
        long j215 = (j184 * 666643) + j59;
        long j216 = (j184 * 654183) + j210;
        long j217 = (j184 * 136657) + j212;
        long j218 = (j215 + 1048576) >> 21;
        long j219 = (j184 * 470296) + (j188 * 666643) + j108 + j218;
        long j220 = j215 - (j218 << 21);
        long j221 = (j216 + 1048576) >> 21;
        long j222 = (j211 - (j184 * 997805)) + j221;
        long j223 = j216 - (j221 << 21);
        long j224 = (j217 + 1048576) >> 21;
        long j225 = (j213 - (j184 * 683901)) + j224;
        long j226 = j217 - (j224 << 21);
        long j227 = (j214 + 1048576) >> 21;
        long j228 = j209 + j227;
        long j229 = j214 - (j227 << 21);
        long j230 = (j206 + 1048576) >> 21;
        long j231 = j201 + j230;
        long j232 = j206 - (j230 << 21);
        long j233 = (j196 + 1048576) >> 21;
        long j234 = j185 + j233;
        long j235 = j196 - (j233 << 21);
        long j236 = (j219 + 1048576) >> 21;
        long j237 = j223 + j236;
        long j238 = j219 - (j236 << 21);
        long j239 = (j222 + 1048576) >> 21;
        long j240 = j226 + j239;
        long j241 = j222 - (j239 << 21);
        long j242 = (j225 + 1048576) >> 21;
        long j243 = j229 + j242;
        long j244 = j225 - (j242 << 21);
        long j245 = (j228 + 1048576) >> 21;
        long j246 = j232 + j245;
        long j247 = j228 - (j245 << 21);
        long j248 = (j231 + 1048576) >> 21;
        long j249 = j235 + j248;
        long j250 = j231 - (j248 << 21);
        long j251 = (j234 + 1048576) >> 21;
        long j252 = j234 - (j251 << 21);
        long j253 = (j251 * 666643) + j220;
        long j254 = (j251 * 470296) + j238;
        long j255 = (j251 * 654183) + j237;
        long j256 = j241 - (j251 * 997805);
        long j257 = (j251 * 136657) + j240;
        long j258 = j244 - (j251 * 683901);
        long j259 = j253 >> 21;
        long j260 = j254 + j259;
        long j261 = j253 - (j259 << 21);
        long j262 = j260 >> 21;
        long j263 = j255 + j262;
        long j264 = j260 - (j262 << 21);
        long j265 = j263 >> 21;
        long j266 = j256 + j265;
        long j267 = j263 - (j265 << 21);
        long j268 = j266 >> 21;
        long j269 = j257 + j268;
        long j270 = j266 - (j268 << 21);
        long j271 = j269 >> 21;
        long j272 = j258 + j271;
        long j273 = j269 - (j271 << 21);
        long j274 = j272 >> 21;
        long j275 = j243 + j274;
        long j276 = j272 - (j274 << 21);
        long j277 = j275 >> 21;
        long j278 = j247 + j277;
        long j279 = j275 - (j277 << 21);
        long j280 = j278 >> 21;
        long j281 = j246 + j280;
        long j282 = j278 - (j280 << 21);
        long j283 = j281 >> 21;
        long j284 = j250 + j283;
        long j285 = j281 - (j283 << 21);
        long j286 = j284 >> 21;
        long j287 = j249 + j286;
        long j288 = j284 - (j286 << 21);
        long j289 = j287 >> 21;
        long j290 = j252 + j289;
        long j291 = j287 - (j289 << 21);
        long j292 = j290 >> 21;
        long j293 = j290 - (j292 << 21);
        long j294 = (666643 * j292) + j261;
        long j295 = (470296 * j292) + j264;
        long j296 = (654183 * j292) + j267;
        long j297 = j270 - (997805 * j292);
        long j298 = (136657 * j292) + j273;
        long j299 = j276 - (j292 * 683901);
        long j300 = j294 >> 21;
        long j301 = j295 + j300;
        long j302 = j294 - (j300 << 21);
        long j303 = j301 >> 21;
        long j304 = j296 + j303;
        long j305 = j301 - (j303 << 21);
        long j306 = j304 >> 21;
        long j307 = j297 + j306;
        long j308 = j304 - (j306 << 21);
        long j309 = j307 >> 21;
        long j310 = j298 + j309;
        long j311 = j307 - (j309 << 21);
        long j312 = j310 >> 21;
        long j313 = j299 + j312;
        long j314 = j310 - (j312 << 21);
        long j315 = j313 >> 21;
        long j316 = j279 + j315;
        long j317 = j313 - (j315 << 21);
        long j318 = j316 >> 21;
        long j319 = j282 + j318;
        long j320 = j316 - (j318 << 21);
        long j321 = j319 >> 21;
        long j322 = j285 + j321;
        long j323 = j319 - (j321 << 21);
        long j324 = j322 >> 21;
        long j325 = j288 + j324;
        long j326 = j322 - (j324 << 21);
        long j327 = j325 >> 21;
        long j328 = j291 + j327;
        long j329 = j325 - (j327 << 21);
        long j330 = j328 >> 21;
        long j331 = j293 + j330;
        long j332 = j328 - (j330 << 21);
        bArr[0] = (byte) j302;
        bArr[1] = (byte) (j302 >> 8);
        bArr[2] = (byte) ((j302 >> 16) | (j305 << 5));
        bArr[3] = (byte) (j305 >> 3);
        bArr[4] = (byte) (j305 >> 11);
        bArr[5] = (byte) ((j305 >> 19) | (j308 << 2));
        bArr[6] = (byte) (j308 >> 6);
        bArr[7] = (byte) ((j308 >> 14) | (j311 << 7));
        bArr[8] = (byte) (j311 >> 1);
        bArr[9] = (byte) (j311 >> 9);
        bArr[10] = (byte) ((j311 >> 17) | (j314 << 4));
        bArr[11] = (byte) (j314 >> 4);
        bArr[12] = (byte) (j314 >> 12);
        bArr[13] = (byte) ((j314 >> 20) | (j317 << 1));
        bArr[14] = (byte) (j317 >> 7);
        bArr[15] = (byte) ((j317 >> 15) | (j320 << 6));
        bArr[16] = (byte) (j320 >> 2);
        bArr[17] = (byte) (j320 >> 10);
        bArr[18] = (byte) ((j320 >> 18) | (j323 << 3));
        bArr[19] = (byte) (j323 >> 5);
        bArr[20] = (byte) (j323 >> 13);
        bArr[21] = (byte) j326;
        bArr[22] = (byte) (j326 >> 8);
        bArr[23] = (byte) ((j326 >> 16) | (j329 << 5));
        bArr[24] = (byte) (j329 >> 3);
        bArr[25] = (byte) (j329 >> 11);
        bArr[26] = (byte) ((j329 >> 19) | (j332 << 2));
        bArr[27] = (byte) (j332 >> 6);
        bArr[28] = (byte) ((j332 >> 14) | (j331 << 7));
        bArr[29] = (byte) (j331 >> 1);
        bArr[30] = (byte) (j331 >> 9);
        bArr[31] = (byte) (j331 >> 17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void neg(long[] jArr, long[] jArr2) {
        for (int i14 = 0; i14 < jArr2.length; i14++) {
            jArr[i14] = -jArr2[i14];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void pow2252m3(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        Field25519.square(jArr3, jArr2);
        Field25519.square(jArr4, jArr3);
        Field25519.square(jArr4, jArr4);
        Field25519.mult(jArr4, jArr2, jArr4);
        Field25519.mult(jArr3, jArr3, jArr4);
        Field25519.square(jArr3, jArr3);
        Field25519.mult(jArr3, jArr4, jArr3);
        Field25519.square(jArr4, jArr3);
        for (int i14 = 1; i14 < 5; i14++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr3, jArr4, jArr3);
        Field25519.square(jArr4, jArr3);
        for (int i15 = 1; i15 < 10; i15++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr4, jArr4, jArr3);
        Field25519.square(jArr5, jArr4);
        for (int i16 = 1; i16 < 20; i16++) {
            Field25519.square(jArr5, jArr5);
        }
        Field25519.mult(jArr4, jArr5, jArr4);
        Field25519.square(jArr4, jArr4);
        for (int i17 = 1; i17 < 10; i17++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr3, jArr4, jArr3);
        Field25519.square(jArr4, jArr3);
        for (int i18 = 1; i18 < 50; i18++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr4, jArr4, jArr3);
        Field25519.square(jArr5, jArr4);
        for (int i19 = 1; i19 < 100; i19++) {
            Field25519.square(jArr5, jArr5);
        }
        Field25519.mult(jArr4, jArr5, jArr4);
        Field25519.square(jArr4, jArr4);
        for (int i24 = 1; i24 < 50; i24++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr3, jArr4, jArr3);
        Field25519.square(jArr3, jArr3);
        Field25519.square(jArr3, jArr3);
        Field25519.mult(jArr, jArr3, jArr2);
    }

    private static void reduce(byte[] bArr) {
        long jLoad3 = load3(bArr, 0) & 2097151;
        long jLoad4 = (load4(bArr, 2) >> 5) & 2097151;
        long jLoad5 = (load3(bArr, 5) >> 2) & 2097151;
        long jLoad6 = (load4(bArr, 7) >> 7) & 2097151;
        long jLoad7 = (load4(bArr, 10) >> 4) & 2097151;
        long jLoad8 = (load3(bArr, 13) >> 1) & 2097151;
        long jLoad9 = (load4(bArr, 15) >> 6) & 2097151;
        long jLoad10 = (load3(bArr, 18) >> 3) & 2097151;
        long jLoad11 = load3(bArr, 21) & 2097151;
        long jLoad12 = (load4(bArr, 23) >> 5) & 2097151;
        long jLoad13 = (load3(bArr, 26) >> 2) & 2097151;
        long jLoad14 = (load4(bArr, 28) >> 7) & 2097151;
        long jLoad15 = (load4(bArr, 31) >> 4) & 2097151;
        long jLoad16 = (load3(bArr, 34) >> 1) & 2097151;
        long jLoad17 = (load4(bArr, 36) >> 6) & 2097151;
        long jLoad18 = (load3(bArr, 39) >> 3) & 2097151;
        long jLoad19 = load3(bArr, 42) & 2097151;
        long jLoad20 = (load4(bArr, 44) >> 5) & 2097151;
        long jLoad21 = (load3(bArr, 47) >> 2) & 2097151;
        long jLoad22 = (load4(bArr, 49) >> 7) & 2097151;
        long jLoad23 = (load4(bArr, 52) >> 4) & 2097151;
        long jLoad24 = (load3(bArr, 55) >> 1) & 2097151;
        long jLoad25 = (load4(bArr, 57) >> 6) & 2097151;
        long jLoad26 = load4(bArr, 60) >> 3;
        long j8 = (jLoad26 * 666643) + jLoad14;
        long j14 = (jLoad26 * 470296) + jLoad15;
        long j15 = (jLoad26 * 654183) + jLoad16;
        long j16 = jLoad17 - (jLoad26 * 997805);
        long j17 = (jLoad26 * 136657) + jLoad18;
        long j18 = jLoad19 - (jLoad26 * 683901);
        long j19 = (jLoad25 * 666643) + jLoad13;
        long j24 = (jLoad25 * 470296) + j8;
        long j25 = (jLoad25 * 654183) + j14;
        long j26 = j15 - (jLoad25 * 997805);
        long j27 = (jLoad25 * 136657) + j16;
        long j28 = j17 - (jLoad25 * 683901);
        long j29 = (jLoad24 * 666643) + jLoad12;
        long j34 = (jLoad24 * 470296) + j19;
        long j35 = (jLoad24 * 654183) + j24;
        long j36 = j25 - (jLoad24 * 997805);
        long j37 = (jLoad24 * 136657) + j26;
        long j38 = j27 - (jLoad24 * 683901);
        long j39 = (jLoad23 * 666643) + jLoad11;
        long j44 = (jLoad23 * 470296) + j29;
        long j45 = (jLoad23 * 654183) + j34;
        long j46 = j35 - (jLoad23 * 997805);
        long j47 = (jLoad23 * 136657) + j36;
        long j48 = j37 - (jLoad23 * 683901);
        long j49 = (jLoad22 * 666643) + jLoad10;
        long j54 = (jLoad22 * 470296) + j39;
        long j55 = (jLoad22 * 654183) + j44;
        long j56 = j45 - (jLoad22 * 997805);
        long j57 = (jLoad22 * 136657) + j46;
        long j58 = j47 - (jLoad22 * 683901);
        long j59 = (jLoad21 * 666643) + jLoad9;
        long j64 = (jLoad21 * 470296) + j49;
        long j65 = (jLoad21 * 654183) + j54;
        long j66 = j55 - (jLoad21 * 997805);
        long j67 = (jLoad21 * 136657) + j56;
        long j68 = j57 - (jLoad21 * 683901);
        long j69 = (j59 + 1048576) >> 21;
        long j74 = j64 + j69;
        long j75 = j59 - (j69 << 21);
        long j76 = (j65 + 1048576) >> 21;
        long j77 = j66 + j76;
        long j78 = j65 - (j76 << 21);
        long j79 = (j67 + 1048576) >> 21;
        long j84 = j68 + j79;
        long j85 = j67 - (j79 << 21);
        long j86 = (j58 + 1048576) >> 21;
        long j87 = j48 + j86;
        long j88 = j58 - (j86 << 21);
        long j89 = (j38 + 1048576) >> 21;
        long j93 = j28 + j89;
        long j94 = j38 - (j89 << 21);
        long j95 = (j18 + 1048576) >> 21;
        long j96 = jLoad20 + j95;
        long j97 = j18 - (j95 << 21);
        long j98 = (j74 + 1048576) >> 21;
        long j99 = j78 + j98;
        long j100 = j74 - (j98 << 21);
        long j101 = (j77 + 1048576) >> 21;
        long j102 = j85 + j101;
        long j103 = j77 - (j101 << 21);
        long j104 = (j84 + 1048576) >> 21;
        long j105 = j88 + j104;
        long j106 = j84 - (j104 << 21);
        long j107 = (j87 + 1048576) >> 21;
        long j108 = j94 + j107;
        long j109 = j87 - (j107 << 21);
        long j110 = (j93 + 1048576) >> 21;
        long j111 = j97 + j110;
        long j112 = j93 - (j110 << 21);
        long j113 = (j96 * 666643) + jLoad8;
        long j114 = (j96 * 470296) + j75;
        long j115 = (j96 * 654183) + j100;
        long j116 = j99 - (j96 * 997805);
        long j117 = (j96 * 136657) + j103;
        long j118 = j102 - (j96 * 683901);
        long j119 = (j111 * 666643) + jLoad7;
        long j120 = (j111 * 470296) + j113;
        long j121 = (j111 * 654183) + j114;
        long j122 = j115 - (j111 * 997805);
        long j123 = (j111 * 136657) + j116;
        long j124 = j117 - (j111 * 683901);
        long j125 = (j112 * 666643) + jLoad6;
        long j126 = (j112 * 470296) + j119;
        long j127 = (j112 * 654183) + j120;
        long j128 = (j112 * 136657) + j122;
        long j129 = j123 - (j112 * 683901);
        long j130 = (j108 * 666643) + jLoad5;
        long j131 = (j108 * 470296) + j125;
        long j132 = (j108 * 654183) + j126;
        long j133 = (j108 * 136657) + (j121 - (j112 * 997805));
        long j134 = (j109 * 666643) + jLoad4;
        long j135 = (j109 * 470296) + j130;
        long j136 = (j109 * 654183) + j131;
        long j137 = j132 - (j109 * 997805);
        long j138 = (j109 * 136657) + (j127 - (j108 * 997805));
        long j139 = j133 - (j109 * 683901);
        long j140 = (j105 * 666643) + jLoad3;
        long j141 = (j105 * 470296) + j134;
        long j142 = (j105 * 654183) + j135;
        long j143 = j136 - (j105 * 997805);
        long j144 = (j105 * 136657) + j137;
        long j145 = j138 - (j105 * 683901);
        long j146 = (j140 + 1048576) >> 21;
        long j147 = j141 + j146;
        long j148 = j140 - (j146 << 21);
        long j149 = (j142 + 1048576) >> 21;
        long j150 = j143 + j149;
        long j151 = j142 - (j149 << 21);
        long j152 = (j144 + 1048576) >> 21;
        long j153 = j145 + j152;
        long j154 = j144 - (j152 << 21);
        long j155 = (j139 + 1048576) >> 21;
        long j156 = (j128 - (j108 * 683901)) + j155;
        long j157 = j139 - (j155 << 21);
        long j158 = (j129 + 1048576) >> 21;
        long j159 = j124 + j158;
        long j160 = j129 - (j158 << 21);
        long j161 = (j118 + 1048576) >> 21;
        long j162 = j106 + j161;
        long j163 = j118 - (j161 << 21);
        long j164 = (j147 + 1048576) >> 21;
        long j165 = j151 + j164;
        long j166 = j147 - (j164 << 21);
        long j167 = (j150 + 1048576) >> 21;
        long j168 = j154 + j167;
        long j169 = j150 - (j167 << 21);
        long j170 = (j153 + 1048576) >> 21;
        long j171 = j157 + j170;
        long j172 = j153 - (j170 << 21);
        long j173 = (j156 + 1048576) >> 21;
        long j174 = j160 + j173;
        long j175 = j156 - (j173 << 21);
        long j176 = (j159 + 1048576) >> 21;
        long j177 = j163 + j176;
        long j178 = j159 - (j176 << 21);
        long j179 = (j162 + 1048576) >> 21;
        long j180 = (j179 * 666643) + j148;
        long j181 = (j179 * 136657) + j168;
        long j182 = j180 >> 21;
        long j183 = (j179 * 470296) + j166 + j182;
        long j184 = j180 - (j182 << 21);
        long j185 = j183 >> 21;
        long j186 = (j179 * 654183) + j165 + j185;
        long j187 = j183 - (j185 << 21);
        long j188 = j186 >> 21;
        long j189 = (j169 - (j179 * 997805)) + j188;
        long j190 = j186 - (j188 << 21);
        long j191 = j189 >> 21;
        long j192 = j181 + j191;
        long j193 = j189 - (j191 << 21);
        long j194 = j192 >> 21;
        long j195 = (j172 - (j179 * 683901)) + j194;
        long j196 = j192 - (j194 << 21);
        long j197 = j195 >> 21;
        long j198 = j171 + j197;
        long j199 = j195 - (j197 << 21);
        long j200 = j198 >> 21;
        long j201 = j175 + j200;
        long j202 = j198 - (j200 << 21);
        long j203 = j201 >> 21;
        long j204 = j174 + j203;
        long j205 = j201 - (j203 << 21);
        long j206 = j204 >> 21;
        long j207 = j178 + j206;
        long j208 = j204 - (j206 << 21);
        long j209 = j207 >> 21;
        long j210 = j177 + j209;
        long j211 = j207 - (j209 << 21);
        long j212 = j210 >> 21;
        long j213 = (j162 - (j179 << 21)) + j212;
        long j214 = j210 - (j212 << 21);
        long j215 = j213 >> 21;
        long j216 = j213 - (j215 << 21);
        long j217 = (666643 * j215) + j184;
        long j218 = (654183 * j215) + j190;
        long j219 = j193 - (997805 * j215);
        long j220 = (136657 * j215) + j196;
        long j221 = j199 - (j215 * 683901);
        long j222 = j217 >> 21;
        long j223 = (470296 * j215) + j187 + j222;
        long j224 = j217 - (j222 << 21);
        long j225 = j223 >> 21;
        long j226 = j218 + j225;
        long j227 = j223 - (j225 << 21);
        long j228 = j226 >> 21;
        long j229 = j219 + j228;
        long j230 = j226 - (j228 << 21);
        long j231 = j229 >> 21;
        long j232 = j220 + j231;
        long j233 = j229 - (j231 << 21);
        long j234 = j232 >> 21;
        long j235 = j221 + j234;
        long j236 = j232 - (j234 << 21);
        long j237 = j235 >> 21;
        long j238 = j202 + j237;
        long j239 = j235 - (j237 << 21);
        long j240 = j238 >> 21;
        long j241 = j205 + j240;
        long j242 = j238 - (j240 << 21);
        long j243 = j241 >> 21;
        long j244 = j208 + j243;
        long j245 = j241 - (j243 << 21);
        long j246 = j244 >> 21;
        long j247 = j211 + j246;
        long j248 = j244 - (j246 << 21);
        long j249 = j247 >> 21;
        long j250 = j214 + j249;
        long j251 = j247 - (j249 << 21);
        long j252 = j250 >> 21;
        long j253 = j216 + j252;
        long j254 = j250 - (j252 << 21);
        bArr[0] = (byte) j224;
        bArr[1] = (byte) (j224 >> 8);
        bArr[2] = (byte) ((j224 >> 16) | (j227 << 5));
        bArr[3] = (byte) (j227 >> 3);
        bArr[4] = (byte) (j227 >> 11);
        bArr[5] = (byte) ((j227 >> 19) | (j230 << 2));
        bArr[6] = (byte) (j230 >> 6);
        bArr[7] = (byte) ((j230 >> 14) | (j233 << 7));
        bArr[8] = (byte) (j233 >> 1);
        bArr[9] = (byte) (j233 >> 9);
        bArr[10] = (byte) ((j233 >> 17) | (j236 << 4));
        bArr[11] = (byte) (j236 >> 4);
        bArr[12] = (byte) (j236 >> 12);
        bArr[13] = (byte) ((j236 >> 20) | (j239 << 1));
        bArr[14] = (byte) (j239 >> 7);
        bArr[15] = (byte) ((j239 >> 15) | (j242 << 6));
        bArr[16] = (byte) (j242 >> 2);
        bArr[17] = (byte) (j242 >> 10);
        bArr[18] = (byte) ((j242 >> 18) | (j245 << 3));
        bArr[19] = (byte) (j245 >> 5);
        bArr[20] = (byte) (j245 >> 13);
        bArr[21] = (byte) j248;
        bArr[22] = (byte) (j248 >> 8);
        bArr[23] = (byte) ((j248 >> 16) | (j251 << 5));
        bArr[24] = (byte) (j251 >> 3);
        bArr[25] = (byte) (j251 >> 11);
        bArr[26] = (byte) ((j251 >> 19) | (j254 << 2));
        bArr[27] = (byte) (j254 >> 6);
        bArr[28] = (byte) ((j254 >> 14) | (j253 << 7));
        bArr[29] = (byte) (j253 >> 1);
        bArr[30] = (byte) (j253 >> 9);
        bArr[31] = (byte) (j253 >> 17);
    }

    private static XYZ scalarMultWithBase(byte[] bArr) {
        int i14;
        byte[] bArr2 = new byte[64];
        int i15 = 0;
        while (true) {
            if (i15 >= 32) {
                break;
            }
            int i16 = i15 * 2;
            bArr2[i16] = (byte) (bArr[i15] & Ascii.SI);
            bArr2[i16 + 1] = (byte) (((bArr[i15] & UnsignedBytes.MAX_VALUE) >> 4) & 15);
            i15++;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < 63) {
            byte b14 = (byte) (bArr2[i17] + i18);
            bArr2[i17] = b14;
            int i19 = (b14 + 8) >> 4;
            bArr2[i17] = (byte) (b14 - (i19 << 4));
            i17++;
            i18 = i19;
        }
        bArr2[63] = (byte) (bArr2[63] + i18);
        PartialXYZT partialXYZT = new PartialXYZT(NEUTRAL);
        XYZT xyzt = new XYZT();
        for (i14 = 1; i14 < 64; i14 += 2) {
            CachedXYT cachedXYT = new CachedXYT(CACHED_NEUTRAL);
            select(cachedXYT, i14 / 2, bArr2[i14]);
            add(partialXYZT, XYZT.fromPartialXYZT(xyzt, partialXYZT), cachedXYT);
        }
        XYZ xyz = new XYZ();
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        for (int i24 = 0; i24 < 64; i24 += 2) {
            CachedXYT cachedXYT2 = new CachedXYT(CACHED_NEUTRAL);
            select(cachedXYT2, i24 / 2, bArr2[i24]);
            add(partialXYZT, XYZT.fromPartialXYZT(xyzt, partialXYZT), cachedXYT2);
        }
        XYZ xyz2 = new XYZ(partialXYZT);
        if (xyz2.isOnCurve()) {
            return xyz2;
        }
        h.z("arithmetic error in scalar multiplication");
        return null;
    }

    public static byte[] scalarMultWithBaseToBytes(byte[] bArr) {
        return scalarMultWithBase(bArr).toBytes();
    }

    private static void select(CachedXYT cachedXYT, int i14, byte b14) {
        int i15 = (b14 & UnsignedBytes.MAX_VALUE) >> 7;
        int i16 = b14 - (((-i15) & b14) << 1);
        CachedXYT[][] cachedXYTArr = Ed25519Constants.B_TABLE;
        cachedXYT.copyConditional(cachedXYTArr[i14][0], eq(i16, 1));
        cachedXYT.copyConditional(cachedXYTArr[i14][1], eq(i16, 2));
        cachedXYT.copyConditional(cachedXYTArr[i14][2], eq(i16, 3));
        cachedXYT.copyConditional(cachedXYTArr[i14][3], eq(i16, 4));
        cachedXYT.copyConditional(cachedXYTArr[i14][4], eq(i16, 5));
        cachedXYT.copyConditional(cachedXYTArr[i14][5], eq(i16, 6));
        cachedXYT.copyConditional(cachedXYTArr[i14][6], eq(i16, 7));
        cachedXYT.copyConditional(cachedXYTArr[i14][7], eq(i16, 8));
        long[] jArrCopyOf = Arrays.copyOf(cachedXYT.yMinusX, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(cachedXYT.yPlusX, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(cachedXYT.t2d, 10);
        neg(jArrCopyOf3, jArrCopyOf3);
        cachedXYT.copyConditional(new CachedXYT(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i15);
    }

    public static byte[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(MessageDigestAlgorithms.SHA_512);
        engineFactory.update(bArr3, 32, 32);
        engineFactory.update(bArrCopyOfRange);
        byte[] bArrDigest = engineFactory.digest();
        reduce(bArrDigest);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(scalarMultWithBase(bArrDigest).toBytes(), 0, 32);
        engineFactory.reset();
        engineFactory.update(bArrCopyOfRange2);
        engineFactory.update(bArr2);
        engineFactory.update(bArrCopyOfRange);
        byte[] bArrDigest2 = engineFactory.digest();
        reduce(bArrDigest2);
        byte[] bArr4 = new byte[32];
        mulAdd(bArr4, bArrDigest2, bArr3, bArrDigest);
        return Bytes.concat(bArrCopyOfRange2, bArr4);
    }

    private static byte[] slide(byte[] bArr) {
        int i14;
        byte[] bArr2 = new byte[256];
        for (int i15 = 0; i15 < 256; i15++) {
            bArr2[i15] = (byte) (1 & ((bArr[i15 >> 3] & UnsignedBytes.MAX_VALUE) >> (i15 & 7)));
        }
        for (int i16 = 0; i16 < 256; i16++) {
            if (bArr2[i16] != 0) {
                for (int i17 = 1; i17 <= 6 && (i14 = i16 + i17) < 256; i17++) {
                    byte b14 = bArr2[i14];
                    if (b14 != 0) {
                        byte b15 = bArr2[i16];
                        if ((b14 << i17) + b15 > 15) {
                            if (b15 - (b14 << i17) < -15) {
                                break;
                            }
                            bArr2[i16] = (byte) (b15 - (b14 << i17));
                            while (i14 < 256) {
                                if (bArr2[i14] == 0) {
                                    bArr2[i14] = 1;
                                    break;
                                }
                                bArr2[i14] = 0;
                                i14++;
                            }
                        } else {
                            bArr2[i16] = (byte) (b15 + (b14 << i17));
                            bArr2[i14] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static void sub(PartialXYZT partialXYZT, XYZT xyzt, CachedXYT cachedXYT) {
        long[] jArr = new long[10];
        long[] jArr2 = partialXYZT.xyz.f53634x;
        XYZ xyz = xyzt.xyz;
        Field25519.sum(jArr2, xyz.f53635y, xyz.f53634x);
        long[] jArr3 = partialXYZT.xyz.f53635y;
        XYZ xyz2 = xyzt.xyz;
        Field25519.sub(jArr3, xyz2.f53635y, xyz2.f53634x);
        long[] jArr4 = partialXYZT.xyz.f53635y;
        Field25519.mult(jArr4, jArr4, cachedXYT.yPlusX);
        XYZ xyz3 = partialXYZT.xyz;
        Field25519.mult(xyz3.f53636z, xyz3.f53634x, cachedXYT.yMinusX);
        Field25519.mult(partialXYZT.f53633t, xyzt.f53637t, cachedXYT.t2d);
        cachedXYT.multByZ(partialXYZT.xyz.f53634x, xyzt.xyz.f53636z);
        long[] jArr5 = partialXYZT.xyz.f53634x;
        Field25519.sum(jArr, jArr5, jArr5);
        XYZ xyz4 = partialXYZT.xyz;
        Field25519.sub(xyz4.f53634x, xyz4.f53636z, xyz4.f53635y);
        XYZ xyz5 = partialXYZT.xyz;
        long[] jArr6 = xyz5.f53635y;
        Field25519.sum(jArr6, xyz5.f53636z, jArr6);
        Field25519.sub(partialXYZT.xyz.f53636z, jArr, partialXYZT.f53633t);
        long[] jArr7 = partialXYZT.f53633t;
        Field25519.sum(jArr7, jArr, jArr7);
    }

    public static boolean verify(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr2.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 32, 64);
        if (!isSmallerThanGroupOrder(bArrCopyOfRange)) {
            return false;
        }
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(MessageDigestAlgorithms.SHA_512);
        engineFactory.update(bArr2, 0, 32);
        engineFactory.update(bArr3);
        engineFactory.update(bArr);
        byte[] bArrDigest = engineFactory.digest();
        reduce(bArrDigest);
        byte[] bytes = doubleScalarMultVarTime(bArrDigest, XYZT.fromBytesNegateVarTime(bArr3), bArrCopyOfRange).toBytes();
        for (int i14 = 0; i14 < 32; i14++) {
            if (bytes[i14] != bArr2[i14]) {
                return false;
            }
        }
        return true;
    }

    public static class XYZT {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final long[] f53637t;
        final XYZ xyz;

        public XYZT() {
            this(new XYZ(), new long[10]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static XYZT fromBytesNegateVarTime(byte[] bArr) throws GeneralSecurityException {
            long[] jArr = new long[10];
            long[] jArrExpand = Field25519.expand(bArr);
            long[] jArr2 = new long[10];
            jArr2[0] = 1;
            long[] jArr3 = new long[10];
            long[] jArr4 = new long[10];
            long[] jArr5 = new long[10];
            long[] jArr6 = new long[10];
            long[] jArr7 = new long[10];
            Field25519.square(jArr4, jArrExpand);
            Field25519.mult(jArr5, jArr4, Ed25519Constants.D);
            Field25519.sub(jArr4, jArr4, jArr2);
            Field25519.sum(jArr5, jArr5, jArr2);
            long[] jArr8 = new long[10];
            Field25519.square(jArr8, jArr5);
            Field25519.mult(jArr8, jArr8, jArr5);
            Field25519.square(jArr, jArr8);
            Field25519.mult(jArr, jArr, jArr5);
            Field25519.mult(jArr, jArr, jArr4);
            Ed25519.pow2252m3(jArr, jArr);
            Field25519.mult(jArr, jArr, jArr8);
            Field25519.mult(jArr, jArr, jArr4);
            Field25519.square(jArr6, jArr);
            Field25519.mult(jArr6, jArr6, jArr5);
            Field25519.sub(jArr7, jArr6, jArr4);
            if (Ed25519.isNonZeroVarTime(jArr7)) {
                Field25519.sum(jArr7, jArr6, jArr4);
                if (Ed25519.isNonZeroVarTime(jArr7)) {
                    a.t("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    return null;
                }
                Field25519.mult(jArr, jArr, Ed25519Constants.SQRTM1);
            }
            if (!Ed25519.isNonZeroVarTime(jArr) && ((bArr[31] & UnsignedBytes.MAX_VALUE) >> 7) != 0) {
                a.t("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                return null;
            }
            if (Ed25519.getLsb(jArr) == ((bArr[31] & UnsignedBytes.MAX_VALUE) >> 7)) {
                Ed25519.neg(jArr, jArr);
            }
            Field25519.mult(jArr3, jArr, jArrExpand);
            return new XYZT(new XYZ(jArr, jArrExpand, jArr2), jArr3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static XYZT fromPartialXYZT(XYZT xyzt, PartialXYZT partialXYZT) {
            Field25519.mult(xyzt.xyz.f53634x, partialXYZT.xyz.f53634x, partialXYZT.f53633t);
            long[] jArr = xyzt.xyz.f53635y;
            XYZ xyz = partialXYZT.xyz;
            Field25519.mult(jArr, xyz.f53635y, xyz.f53636z);
            Field25519.mult(xyzt.xyz.f53636z, partialXYZT.xyz.f53636z, partialXYZT.f53633t);
            long[] jArr2 = xyzt.f53637t;
            XYZ xyz2 = partialXYZT.xyz;
            Field25519.mult(jArr2, xyz2.f53634x, xyz2.f53635y);
            return xyzt;
        }

        public XYZT(XYZ xyz, long[] jArr) {
            this.xyz = xyz;
            this.f53637t = jArr;
        }

        public XYZT(PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }
    }

    public static class PartialXYZT {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final long[] f53633t;
        final XYZ xyz;

        public PartialXYZT(PartialXYZT partialXYZT) {
            this.xyz = new XYZ(partialXYZT.xyz);
            this.f53633t = Arrays.copyOf(partialXYZT.f53633t, 10);
        }

        public PartialXYZT(XYZ xyz, long[] jArr) {
            this.xyz = xyz;
            this.f53633t = jArr;
        }

        public PartialXYZT() {
            this(new XYZ(), new long[10]);
        }
    }

    public static class CachedXYT {
        final long[] t2d;
        final long[] yMinusX;
        final long[] yPlusX;

        public CachedXYT(CachedXYT cachedXYT) {
            this.yPlusX = Arrays.copyOf(cachedXYT.yPlusX, 10);
            this.yMinusX = Arrays.copyOf(cachedXYT.yMinusX, 10);
            this.t2d = Arrays.copyOf(cachedXYT.t2d, 10);
        }

        public void copyConditional(CachedXYT cachedXYT, int i14) {
            Curve25519.copyConditional(this.yPlusX, cachedXYT.yPlusX, i14);
            Curve25519.copyConditional(this.yMinusX, cachedXYT.yMinusX, i14);
            Curve25519.copyConditional(this.t2d, cachedXYT.t2d, i14);
        }

        public void multByZ(long[] jArr, long[] jArr2) {
            System.arraycopy(jArr2, 0, jArr, 0, 10);
        }

        public CachedXYT(long[] jArr, long[] jArr2, long[] jArr3) {
            this.yPlusX = jArr;
            this.yMinusX = jArr2;
            this.t2d = jArr3;
        }

        public CachedXYT() {
            this(new long[10], new long[10], new long[10]);
        }
    }

    public static class XYZ {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final long[] f53634x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final long[] f53635y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final long[] f53636z;

        public XYZ(XYZ xyz) {
            this.f53634x = Arrays.copyOf(xyz.f53634x, 10);
            this.f53635y = Arrays.copyOf(xyz.f53635y, 10);
            this.f53636z = Arrays.copyOf(xyz.f53636z, 10);
        }

        public static XYZ fromPartialXYZT(XYZ xyz, PartialXYZT partialXYZT) {
            Field25519.mult(xyz.f53634x, partialXYZT.xyz.f53634x, partialXYZT.f53633t);
            long[] jArr = xyz.f53635y;
            XYZ xyz2 = partialXYZT.xyz;
            Field25519.mult(jArr, xyz2.f53635y, xyz2.f53636z);
            Field25519.mult(xyz.f53636z, partialXYZT.xyz.f53636z, partialXYZT.f53633t);
            return xyz;
        }

        public boolean isOnCurve() {
            long[] jArr = new long[10];
            Field25519.square(jArr, this.f53634x);
            long[] jArr2 = new long[10];
            Field25519.square(jArr2, this.f53635y);
            long[] jArr3 = new long[10];
            Field25519.square(jArr3, this.f53636z);
            long[] jArr4 = new long[10];
            Field25519.square(jArr4, jArr3);
            long[] jArr5 = new long[10];
            Field25519.sub(jArr5, jArr2, jArr);
            Field25519.mult(jArr5, jArr5, jArr3);
            long[] jArr6 = new long[10];
            Field25519.mult(jArr6, jArr, jArr2);
            Field25519.mult(jArr6, jArr6, Ed25519Constants.D);
            Field25519.sum(jArr6, jArr4);
            Field25519.reduce(jArr6, jArr6);
            return Bytes.equal(Field25519.contract(jArr5), Field25519.contract(jArr6));
        }

        public byte[] toBytes() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            Field25519.inverse(jArr, this.f53636z);
            Field25519.mult(jArr2, this.f53634x, jArr);
            Field25519.mult(jArr3, this.f53635y, jArr);
            byte[] bArrContract = Field25519.contract(jArr3);
            bArrContract[31] = (byte) ((Ed25519.getLsb(jArr2) << 7) ^ bArrContract[31]);
            return bArrContract;
        }

        public XYZ(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f53634x = jArr;
            this.f53635y = jArr2;
            this.f53636z = jArr3;
        }

        public XYZ() {
            this(new long[10], new long[10], new long[10]);
        }

        public XYZ(PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }
    }

    public static class CachedXYZT extends CachedXYT {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final long[] f53632z;

        public CachedXYZT(XYZT xyzt) {
            this();
            long[] jArr = this.yPlusX;
            XYZ xyz = xyzt.xyz;
            Field25519.sum(jArr, xyz.f53635y, xyz.f53634x);
            long[] jArr2 = this.yMinusX;
            XYZ xyz2 = xyzt.xyz;
            Field25519.sub(jArr2, xyz2.f53635y, xyz2.f53634x);
            System.arraycopy(xyzt.xyz.f53636z, 0, this.f53632z, 0, 10);
            Field25519.mult(this.t2d, xyzt.f53637t, Ed25519Constants.D2);
        }

        @Override // com.google.crypto.tink.subtle.Ed25519.CachedXYT
        public void multByZ(long[] jArr, long[] jArr2) {
            Field25519.mult(jArr, jArr2, this.f53632z);
        }

        public CachedXYZT() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        public CachedXYZT(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
            super(jArr, jArr2, jArr4);
            this.f53632z = jArr3;
        }
    }
}
