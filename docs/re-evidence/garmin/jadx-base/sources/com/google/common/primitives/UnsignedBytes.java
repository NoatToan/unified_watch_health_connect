package com.google.common.primitives;

import am.j;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import r1.q2;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class UnsignedBytes {
    public static final byte MAX_POWER_OF_TWO = -128;
    public static final byte MAX_VALUE = -1;
    private static final int UNSIGNED_MASK = 255;

    @VisibleForTesting
    public static class LexicographicalComparatorHolder {
        static final String UNSAFE_COMPARATOR_NAME = LexicographicalComparatorHolder.class.getName().concat("$UnsafeComparator");
        static final Comparator<byte[]> BEST_COMPARATOR = getBestComparator();

        public enum PureJavaComparator implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                for (int i14 = 0; i14 < iMin; i14++) {
                    int iCompare = UnsignedBytes.compare(bArr[i14], bArr2[i14]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                return bArr.length - bArr2.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        @VisibleForTesting
        public enum UnsafeComparator implements Comparator<byte[]> {
            INSTANCE;

            static final boolean BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
            static final int BYTE_ARRAY_BASE_OFFSET;
            static final Unsafe theUnsafe;

            static {
                Unsafe unsafe = getUnsafe();
                theUnsafe = unsafe;
                int iArrayBaseOffset = unsafe.arrayBaseOffset(byte[].class);
                BYTE_ARRAY_BASE_OFFSET = iArrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || iArrayBaseOffset % 8 != 0 || unsafe.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            private static Unsafe getUnsafe() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (PrivilegedActionException e4) {
                        q2.v("Could not initialize intrinsics", e4.getCause());
                        return null;
                    }
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.1
                        @Override // java.security.PrivilegedExceptionAction
                        public Unsafe run() throws IllegalAccessException {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                int i14 = iMin & (-8);
                int i15 = 0;
                while (i15 < i14) {
                    Unsafe unsafe = theUnsafe;
                    int i16 = BYTE_ARRAY_BASE_OFFSET;
                    long j8 = i15;
                    long j14 = unsafe.getLong(bArr, ((long) i16) + j8);
                    long j15 = unsafe.getLong(bArr2, ((long) i16) + j8);
                    if (j14 != j15) {
                        if (BIG_ENDIAN) {
                            return Long.compareUnsigned(j14, j15);
                        }
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j14 ^ j15) & (-8);
                        return ((int) ((j14 >>> iNumberOfTrailingZeros) & 255)) - ((int) ((j15 >>> iNumberOfTrailingZeros) & 255));
                    }
                    i15 += 8;
                }
                while (i15 < iMin) {
                    int iCompare = UnsignedBytes.compare(bArr[i15], bArr2[i15]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    i15++;
                }
                return bArr.length - bArr2.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        public static Comparator<byte[]> getBestComparator() {
            try {
                Object[] enumConstants = Class.forName(UNSAFE_COMPARATOR_NAME).getEnumConstants();
                Objects.requireNonNull(enumConstants);
                return (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                return UnsignedBytes.lexicographicalComparatorJavaImpl();
            }
        }
    }

    private UnsignedBytes() {
    }

    @CanIgnoreReturnValue
    public static byte checkedCast(long j8) {
        Preconditions.checkArgument((j8 >> 8) == 0, "out of range: %s", j8);
        return (byte) j8;
    }

    public static int compare(byte b14, byte b15) {
        return toInt(b14) - toInt(b15);
    }

    private static byte flip(byte b14) {
        return (byte) (b14 ^ MAX_POWER_OF_TWO);
    }

    public static String join(String str, byte... bArr) {
        Preconditions.checkNotNull(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder((str.length() + 3) * bArr.length);
        sb3.append(toInt(bArr[0]));
        for (int i14 = 1; i14 < bArr.length; i14++) {
            sb3.append(str);
            sb3.append(toString(bArr[i14]));
        }
        return sb3.toString();
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return LexicographicalComparatorHolder.BEST_COMPARATOR;
    }

    @VisibleForTesting
    public static Comparator<byte[]> lexicographicalComparatorJavaImpl() {
        return LexicographicalComparatorHolder.PureJavaComparator.INSTANCE;
    }

    public static byte max(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        int i14 = toInt(bArr[0]);
        for (int i15 = 1; i15 < bArr.length; i15++) {
            int i16 = toInt(bArr[i15]);
            if (i16 > i14) {
                i14 = i16;
            }
        }
        return (byte) i14;
    }

    public static byte min(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        int i14 = toInt(bArr[0]);
        for (int i15 = 1; i15 < bArr.length; i15++) {
            int i16 = toInt(bArr[i15]);
            if (i16 < i14) {
                i14 = i16;
            }
        }
        return (byte) i14;
    }

    @CanIgnoreReturnValue
    public static byte parseUnsignedByte(String str, int i14) {
        int i15 = Integer.parseInt((String) Preconditions.checkNotNull(str), i14);
        if ((i15 >> 8) == 0) {
            return (byte) i15;
        }
        throw new NumberFormatException(j.h(i15, "out of range: "));
    }

    public static byte saturatedCast(long j8) {
        if (j8 > toInt((byte) -1)) {
            return (byte) -1;
        }
        if (j8 < 0) {
            return (byte) 0;
        }
        return (byte) j8;
    }

    public static void sort(byte[] bArr, int i14, int i15) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i14, i15, bArr.length);
        for (int i16 = i14; i16 < i15; i16++) {
            bArr[i16] = flip(bArr[i16]);
        }
        Arrays.sort(bArr, i14, i15);
        while (i14 < i15) {
            bArr[i14] = flip(bArr[i14]);
            i14++;
        }
    }

    public static void sortDescending(byte[] bArr, int i14, int i15) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i14, i15, bArr.length);
        for (int i16 = i14; i16 < i15; i16++) {
            bArr[i16] = (byte) (bArr[i16] ^ Ascii.DEL);
        }
        Arrays.sort(bArr, i14, i15);
        while (i14 < i15) {
            bArr[i14] = (byte) (bArr[i14] ^ Ascii.DEL);
            i14++;
        }
    }

    public static int toInt(byte b14) {
        return b14 & MAX_VALUE;
    }

    public static String toString(byte b14, int i14) {
        Preconditions.checkArgument(i14 >= 2 && i14 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i14);
        return Integer.toString(toInt(b14), i14);
    }

    public static String toString(byte b14) {
        return toString(b14, 10);
    }

    @CanIgnoreReturnValue
    public static byte parseUnsignedByte(String str) {
        return parseUnsignedByte(str, 10);
    }

    public static void sortDescending(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sortDescending(bArr, 0, bArr.length);
    }

    public static void sort(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sort(bArr, 0, bArr.length);
    }
}
