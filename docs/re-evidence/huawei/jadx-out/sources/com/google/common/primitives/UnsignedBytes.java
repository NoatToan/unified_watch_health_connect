package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class UnsignedBytes {
    public static int c(byte b2) {
        return b2 & 255;
    }

    public static byte a(long j) {
        Preconditions.checkArgument((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static int e(byte b2, byte b3) {
        return c(b2) - c(b3);
    }

    static Comparator<byte[]> b() {
        return LexicographicalComparatorHolder.PureJavaComparator.INSTANCE;
    }

    /* JADX INFO: loaded from: classes21.dex */
    static class LexicographicalComparatorHolder {
        static final String d = LexicographicalComparatorHolder.class.getName() + "$UnsafeComparator";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final Comparator<byte[]> f4628c = d();

        LexicographicalComparatorHolder() {
        }

        enum UnsafeComparator implements Comparator<byte[]> {
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
                    } catch (PrivilegedActionException e) {
                        throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                    }
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.4
                        @Override // java.security.PrivilegedExceptionAction
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public Unsafe run() throws Exception {
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
                int i = 0;
                while (i < (iMin & (-8))) {
                    Unsafe unsafe = theUnsafe;
                    long j = ((long) BYTE_ARRAY_BASE_OFFSET) + ((long) i);
                    long j2 = unsafe.getLong(bArr, j);
                    long j3 = unsafe.getLong(bArr2, j);
                    if (j2 != j3) {
                        if (BIG_ENDIAN) {
                            return UnsignedLongs.c(j2, j3);
                        }
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2 ^ j3) & (-8);
                        return ((int) ((j2 >>> iNumberOfTrailingZeros) & 255)) - ((int) ((j3 >>> iNumberOfTrailingZeros) & 255));
                    }
                    i += 8;
                }
                while (i < iMin) {
                    int iE = UnsignedBytes.e(bArr[i], bArr2[i]);
                    if (iE != 0) {
                        return iE;
                    }
                    i++;
                }
                return bArr.length - bArr2.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        enum PureJavaComparator implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                for (int i = 0; i < iMin; i++) {
                    int iE = UnsignedBytes.e(bArr[i], bArr2[i]);
                    if (iE != 0) {
                        return iE;
                    }
                }
                return bArr.length - bArr2.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        static Comparator<byte[]> d() {
            try {
                return (Comparator) ((Object[]) Objects.requireNonNull(Class.forName(d).getEnumConstants()))[0];
            } catch (Throwable unused) {
                return UnsignedBytes.b();
            }
        }
    }
}
