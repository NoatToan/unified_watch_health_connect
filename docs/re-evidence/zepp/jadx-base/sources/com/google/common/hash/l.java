package com.google.common.hash;

import com.google.common.primitives.Longs;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class l {
    private static final c a;
    public static final /* synthetic */ boolean b = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b implements c {
        private static final /* synthetic */ b[] $VALUES;
        public static final b INSTANCE;

        public static enum a extends b {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.hash.l.c
            public long a(byte[] bArr, int i) {
                return Longs.fromBytes(bArr[i + 7], bArr[i + 6], bArr[i + 5], bArr[i + 4], bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
            }

            @Override // com.google.common.hash.l.c
            public void b(byte[] bArr, int i, long j) {
                long j2 = 255;
                for (int i2 = 0; i2 < 8; i2++) {
                    bArr[i + i2] = (byte) ((j & j2) >> (i2 * 8));
                    j2 <<= 8;
                }
            }
        }

        static {
            a aVar = new a("INSTANCE", 0);
            INSTANCE = aVar;
            $VALUES = new b[]{aVar};
        }

        private b(String str, int i) {
            super(str, i);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public interface c {
        long a(byte[] bArr, int i);

        void b(byte[] bArr, int i, long j);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class d implements c {
        private static final /* synthetic */ d[] $VALUES;
        private static final int BYTE_ARRAY_BASE_OFFSET;
        public static final d UNSAFE_BIG_ENDIAN;
        public static final d UNSAFE_LITTLE_ENDIAN;
        private static final Unsafe theUnsafe;

        public static enum a extends d {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.hash.l.c
            public long a(byte[] bArr, int i) {
                return d.theUnsafe.getLong(bArr, ((long) i) + ((long) d.BYTE_ARRAY_BASE_OFFSET));
            }

            @Override // com.google.common.hash.l.c
            public void b(byte[] bArr, int i, long j) {
                d.theUnsafe.putLong(bArr, ((long) i) + ((long) d.BYTE_ARRAY_BASE_OFFSET), j);
            }
        }

        public static enum b extends d {
            public b(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.hash.l.c
            public long a(byte[] bArr, int i) {
                return Long.reverseBytes(d.theUnsafe.getLong(bArr, ((long) i) + ((long) d.BYTE_ARRAY_BASE_OFFSET)));
            }

            @Override // com.google.common.hash.l.c
            public void b(byte[] bArr, int i, long j) {
                d.theUnsafe.putLong(bArr, ((long) i) + ((long) d.BYTE_ARRAY_BASE_OFFSET), Long.reverseBytes(j));
            }
        }

        public static class c implements PrivilegedExceptionAction<Unsafe> {
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
        }

        static {
            a aVar = new a("UNSAFE_LITTLE_ENDIAN", 0);
            UNSAFE_LITTLE_ENDIAN = aVar;
            b bVar = new b("UNSAFE_BIG_ENDIAN", 1);
            UNSAFE_BIG_ENDIAN = bVar;
            $VALUES = new d[]{aVar, bVar};
            Unsafe unsafeF = f();
            theUnsafe = unsafeF;
            BYTE_ARRAY_BASE_OFFSET = unsafeF.arrayBaseOffset(byte[].class);
            if (unsafeF.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
            }
        }

        private d(String str, int i) {
            super(str, i);
        }

        private static Unsafe f() {
            try {
                try {
                    return Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new c());
            }
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    static {
        c cVar = b.INSTANCE;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                cVar = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? d.UNSAFE_LITTLE_ENDIAN : d.UNSAFE_BIG_ENDIAN;
            }
        } catch (Throwable unused) {
        }
        a = cVar;
    }

    private l() {
    }

    public static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long b(byte[] bArr, int i) {
        return a.a(bArr, i);
    }

    public static long c(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, 8);
        long j = 0;
        for (int i3 = 0; i3 < iMin; i3++) {
            j |= (((long) bArr[i + i3]) & 255) << (i3 * 8);
        }
        return j;
    }

    public static void d(byte[] bArr, int i, long j) {
        a.b(bArr, i, j);
    }

    public static boolean e() {
        return a instanceof d;
    }
}
