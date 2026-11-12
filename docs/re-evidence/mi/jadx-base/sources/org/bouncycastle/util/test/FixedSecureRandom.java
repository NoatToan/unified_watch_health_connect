package org.bouncycastle.util.test;

import defpackage.h7c;
import defpackage.zgh;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public class FixedSecureRandom extends SecureRandom {
    private static final boolean isAndroidStyle;
    private static final boolean isClasspathStyle;
    private static final boolean isRegularStyle;
    private byte[] _data;
    private int _index;
    private static BigInteger REGULAR = new BigInteger("01020304ffffffff0506070811111111", 16);
    private static BigInteger ANDROID = new BigInteger("1111111105060708ffffffff01020304", 16);
    private static BigInteger CLASSPATH = new BigInteger("3020104ffffffff05060708111111", 16);

    public static class a extends e {
        public a(int i, byte[] bArr) {
            super(FixedSecureRandom.expandToBitLength(i, bArr));
        }

        public a(byte[] bArr) {
            super(bArr);
        }
    }

    public static class b extends e {
        public b(byte[] bArr) {
            super(bArr);
        }
    }

    public static class c extends Provider {
        public c() {
            super("BCFIPS_FIXED_RNG", 1.0d, "BCFIPS Fixed Secure Random Provider");
        }
    }

    public static class d extends SecureRandom {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f29525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f29526b;

        public d() {
            super(null, new c());
            this.f29525a = h7c.a("01020304ffffffff0506070811111111");
            this.f29526b = 0;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public void nextBytes(byte[] bArr) {
            System.arraycopy(this.f29525a, this.f29526b, bArr, 0, bArr.length);
            this.f29526b += bArr.length;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f29527a;

        public e(byte[] bArr) {
            this.f29527a = bArr;
        }
    }

    static {
        BigInteger bigInteger = new BigInteger(128, new d());
        BigInteger bigInteger2 = new BigInteger(120, new d());
        isAndroidStyle = bigInteger.equals(ANDROID);
        isRegularStyle = bigInteger.equals(REGULAR);
        isClasspathStyle = bigInteger2.equals(CLASSPATH);
    }

    public FixedSecureRandom(byte[] bArr) {
        this(new e[]{new b(bArr)});
    }

    private static b[] buildDataArray(byte[][] bArr) {
        b[] bVarArr = new b[bArr.length];
        for (int i = 0; i != bArr.length; i++) {
            bVarArr[i] = new b(bArr[i]);
        }
        return bVarArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] expandToBitLength(int i, byte[] bArr) {
        int i2;
        int i3;
        int i4 = (i + 7) / 8;
        if (i4 <= bArr.length) {
            if (isAndroidStyle && i < bArr.length * 8 && (i2 = i % 8) != 0) {
                zgh.d(zgh.a(bArr, 0) << (8 - i2), bArr, 0);
            }
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, 0, bArr2, i4 - bArr.length, bArr.length);
        if (isAndroidStyle && (i3 = i % 8) != 0) {
            zgh.d(zgh.a(bArr2, 0) << (8 - i3), bArr2, 0);
        }
        return bArr2;
    }

    private int nextValue() {
        byte[] bArr = this._data;
        int i = this._index;
        this._index = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        nextBytes(bArr);
        return bArr;
    }

    public boolean isExhausted() {
        return this._index == this._data.length;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        System.arraycopy(this._data, this._index, bArr, 0, bArr.length);
        this._index += bArr.length;
    }

    @Override // java.util.Random
    public int nextInt() {
        return (nextValue() << 24) | (nextValue() << 16) | (nextValue() << 8) | nextValue();
    }

    @Override // java.util.Random
    public long nextLong() {
        return (((long) nextValue()) << 56) | (((long) nextValue()) << 48) | (((long) nextValue()) << 40) | (((long) nextValue()) << 32) | (((long) nextValue()) << 24) | (((long) nextValue()) << 16) | (((long) nextValue()) << 8) | ((long) nextValue());
    }

    public FixedSecureRandom(e[] eVarArr) {
        super(null, new c());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        if (!isRegularStyle) {
            if (!isAndroidStyle) {
                throw new IllegalStateException("Unrecognized BigInteger implementation");
            }
            for (int i2 = 0; i2 != eVarArr.length; i2++) {
                try {
                    e eVar = eVarArr[i2];
                    if (eVar instanceof a) {
                        byte[] bArr = eVar.f29527a;
                        int length = bArr.length - (bArr.length % 4);
                        int i3 = 0;
                        while (i3 < length) {
                            i3 += 4;
                            byteArrayOutputStream.write(bArr, bArr.length - i3, 4);
                        }
                        if (bArr.length - length != 0) {
                            for (int i4 = 0; i4 != 4 - (bArr.length - length); i4++) {
                                byteArrayOutputStream.write(0);
                            }
                        }
                        for (int i5 = 0; i5 != bArr.length - length; i5++) {
                            byteArrayOutputStream.write(bArr[length + i5]);
                        }
                    } else {
                        byteArrayOutputStream.write(eVar.f29527a);
                    }
                } catch (IOException unused) {
                    throw new IllegalArgumentException("can't save value source.");
                }
            }
        } else if (isClasspathStyle) {
            while (i != eVarArr.length) {
                try {
                    e eVar2 = eVarArr[i];
                    if (eVar2 instanceof a) {
                        byte[] bArr2 = eVar2.f29527a;
                        int length2 = bArr2.length - (bArr2.length % 4);
                        for (int length3 = (bArr2.length - length2) - 1; length3 >= 0; length3--) {
                            byteArrayOutputStream.write(bArr2[length3]);
                        }
                        for (int length4 = bArr2.length - length2; length4 < bArr2.length; length4 += 4) {
                            byteArrayOutputStream.write(bArr2, length4, 4);
                        }
                    } else {
                        byteArrayOutputStream.write(eVar2.f29527a);
                    }
                    i++;
                } catch (IOException unused2) {
                    throw new IllegalArgumentException("can't save value source.");
                }
            }
        } else {
            while (i != eVarArr.length) {
                try {
                    byteArrayOutputStream.write(eVarArr[i].f29527a);
                    i++;
                } catch (IOException unused3) {
                    throw new IllegalArgumentException("can't save value source.");
                }
            }
        }
        this._data = byteArrayOutputStream.toByteArray();
    }

    public FixedSecureRandom(byte[][] bArr) {
        this(buildDataArray(bArr));
    }
}
