package com.google.protobuf;

import com.facebook.appevents.integrity.IntegrityManager;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class UnsafeUtil {
    private static final Unsafe a = R();
    private static final Class<?> b = com.google.protobuf.a.b();
    private static final boolean c = q(Long.TYPE);
    private static final boolean d = q(Integer.TYPE);
    private static final b e = N();
    private static final boolean f = t0();
    private static final boolean g = s0();
    public static final long h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final long n;
    private static final long o;
    private static final long p;
    private static final long q;
    private static final long r;
    private static final long s;
    private static final long t;
    private static final long u;
    private static final int v = 8;
    private static final int w = 7;
    private static final int x;
    public static final boolean y;

    public static final class Android32MemoryAccessor extends b {
        private static final long SMALL_ADDRESS_MASK = -1;

        public Android32MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        private static int smallAddress(long j) {
            return (int) (j & (-1));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void copyMemory(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public boolean getBoolean(Object obj, long j) {
            return UnsafeUtil.y ? UnsafeUtil.w(obj, j) : UnsafeUtil.x(obj, j);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public byte getByte(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public double getDouble(Object obj, long j) {
            return Double.longBitsToDouble(getLong(obj, j));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public float getFloat(Object obj, long j) {
            return Float.intBitsToFloat(getInt(obj, j));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public int getInt(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public long getLong(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public Object getStaticObject(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putBoolean(Object obj, long j, boolean z) {
            if (UnsafeUtil.y) {
                UnsafeUtil.Z(obj, j, z);
            } else {
                UnsafeUtil.a0(obj, j, z);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putByte(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putDouble(Object obj, long j, double d) {
            putLong(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putFloat(Object obj, long j, float f) {
            putInt(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putInt(long j, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putLong(long j, long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void copyMemory(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public byte getByte(Object obj, long j) {
            return UnsafeUtil.y ? UnsafeUtil.B(obj, j) : UnsafeUtil.C(obj, j);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putByte(Object obj, long j, byte b) {
            if (UnsafeUtil.y) {
                UnsafeUtil.e0(obj, j, b);
            } else {
                UnsafeUtil.f0(obj, j, b);
            }
        }
    }

    public static final class Android64MemoryAccessor extends b {
        public Android64MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void copyMemory(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public boolean getBoolean(Object obj, long j) {
            return UnsafeUtil.y ? UnsafeUtil.w(obj, j) : UnsafeUtil.x(obj, j);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public byte getByte(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public double getDouble(Object obj, long j) {
            return Double.longBitsToDouble(getLong(obj, j));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public float getFloat(Object obj, long j) {
            return Float.intBitsToFloat(getInt(obj, j));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public int getInt(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public long getLong(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public Object getStaticObject(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putBoolean(Object obj, long j, boolean z) {
            if (UnsafeUtil.y) {
                UnsafeUtil.Z(obj, j, z);
            } else {
                UnsafeUtil.a0(obj, j, z);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putByte(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putDouble(Object obj, long j, double d) {
            putLong(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putFloat(Object obj, long j, float f) {
            putInt(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putInt(long j, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putLong(long j, long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void copyMemory(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public byte getByte(Object obj, long j) {
            return UnsafeUtil.y ? UnsafeUtil.B(obj, j) : UnsafeUtil.C(obj, j);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putByte(Object obj, long j, byte b) {
            if (UnsafeUtil.y) {
                UnsafeUtil.e0(obj, j, b);
            } else {
                UnsafeUtil.f0(obj, j, b);
            }
        }
    }

    public static final class JvmMemoryAccessor extends b {
        public JvmMemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void copyMemory(long j, byte[] bArr, long j2, long j3) {
            this.unsafe.copyMemory((Object) null, j, bArr, UnsafeUtil.h + j2, j3);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public boolean getBoolean(Object obj, long j) {
            return this.unsafe.getBoolean(obj, j);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public byte getByte(long j) {
            return this.unsafe.getByte(j);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public double getDouble(Object obj, long j) {
            return this.unsafe.getDouble(obj, j);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public float getFloat(Object obj, long j) {
            return this.unsafe.getFloat(obj, j);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public int getInt(long j) {
            return this.unsafe.getInt(j);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public long getLong(long j) {
            return this.unsafe.getLong(j);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public Object getStaticObject(java.lang.reflect.Field field) {
            return getObject(this.unsafe.staticFieldBase(field), this.unsafe.staticFieldOffset(field));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putBoolean(Object obj, long j, boolean z) {
            this.unsafe.putBoolean(obj, j, z);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putByte(long j, byte b) {
            this.unsafe.putByte(j, b);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putDouble(Object obj, long j, double d) {
            this.unsafe.putDouble(obj, j, d);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putFloat(Object obj, long j, float f) {
            this.unsafe.putFloat(obj, j, f);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putInt(long j, int i) {
            this.unsafe.putInt(j, i);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putLong(long j, long j2) {
            this.unsafe.putLong(j, j2);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void copyMemory(byte[] bArr, long j, long j2, long j3) {
            this.unsafe.copyMemory(bArr, UnsafeUtil.h + j, (Object) null, j2, j3);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public byte getByte(Object obj, long j) {
            return this.unsafe.getByte(obj, j);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putByte(Object obj, long j, byte b) {
            this.unsafe.putByte(obj, j, b);
        }
    }

    public static class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws Exception {
            for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    public static abstract class b {
        public Unsafe unsafe;

        public b(Unsafe unsafe) {
            this.unsafe = unsafe;
        }

        public final int arrayBaseOffset(Class<?> cls) {
            return this.unsafe.arrayBaseOffset(cls);
        }

        public final int arrayIndexScale(Class<?> cls) {
            return this.unsafe.arrayIndexScale(cls);
        }

        public abstract void copyMemory(long j, byte[] bArr, long j2, long j3);

        public abstract void copyMemory(byte[] bArr, long j, long j2, long j3);

        public abstract boolean getBoolean(Object obj, long j);

        public abstract byte getByte(long j);

        public abstract byte getByte(Object obj, long j);

        public abstract double getDouble(Object obj, long j);

        public abstract float getFloat(Object obj, long j);

        public abstract int getInt(long j);

        public final int getInt(Object obj, long j) {
            return this.unsafe.getInt(obj, j);
        }

        public abstract long getLong(long j);

        public final long getLong(Object obj, long j) {
            return this.unsafe.getLong(obj, j);
        }

        public final Object getObject(Object obj, long j) {
            return this.unsafe.getObject(obj, j);
        }

        public abstract Object getStaticObject(java.lang.reflect.Field field);

        public final long objectFieldOffset(java.lang.reflect.Field field) {
            return this.unsafe.objectFieldOffset(field);
        }

        public abstract void putBoolean(Object obj, long j, boolean z);

        public abstract void putByte(long j, byte b);

        public abstract void putByte(Object obj, long j, byte b);

        public abstract void putDouble(Object obj, long j, double d);

        public abstract void putFloat(Object obj, long j, float f);

        public abstract void putInt(long j, int i);

        public final void putInt(Object obj, long j, int i) {
            this.unsafe.putInt(obj, j, i);
        }

        public abstract void putLong(long j, long j2);

        public final void putLong(Object obj, long j, long j2) {
            this.unsafe.putLong(obj, j, j2);
        }

        public final void putObject(Object obj, long j, Object obj2) {
            this.unsafe.putObject(obj, j, obj2);
        }
    }

    static {
        long jK = k(byte[].class);
        h = jK;
        i = k(boolean[].class);
        j = l(boolean[].class);
        k = k(int[].class);
        l = l(int[].class);
        m = k(long[].class);
        n = l(long[].class);
        o = k(float[].class);
        p = l(float[].class);
        q = k(double[].class);
        r = l(double[].class);
        s = k(Object[].class);
        t = l(Object[].class);
        u = s(m());
        x = (int) (7 & jK);
        y = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private UnsafeUtil() {
    }

    public static byte A(byte[] bArr, long j2) {
        return e.getByte(bArr, h + j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte B(Object obj, long j2) {
        return (byte) ((I(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte C(Object obj, long j2) {
        return (byte) ((I(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static double D(Object obj, long j2) {
        return e.getDouble(obj, j2);
    }

    public static double E(double[] dArr, long j2) {
        return e.getDouble(dArr, q + (j2 * r));
    }

    public static float F(Object obj, long j2) {
        return e.getFloat(obj, j2);
    }

    public static float G(float[] fArr, long j2) {
        return e.getFloat(fArr, o + (j2 * p));
    }

    public static int H(long j2) {
        return e.getInt(j2);
    }

    public static int I(Object obj, long j2) {
        return e.getInt(obj, j2);
    }

    public static int J(int[] iArr, long j2) {
        return e.getInt(iArr, k + (j2 * l));
    }

    public static long K(long j2) {
        return e.getLong(j2);
    }

    public static long L(Object obj, long j2) {
        return e.getLong(obj, j2);
    }

    public static long M(long[] jArr, long j2) {
        return e.getLong(jArr, m + (j2 * n));
    }

    private static b N() {
        Unsafe unsafe = a;
        if (unsafe == null) {
            return null;
        }
        if (!com.google.protobuf.a.c()) {
            return new JvmMemoryAccessor(unsafe);
        }
        if (c) {
            return new Android64MemoryAccessor(unsafe);
        }
        if (d) {
            return new Android32MemoryAccessor(unsafe);
        }
        return null;
    }

    public static Object O(Object obj, long j2) {
        return e.getObject(obj, j2);
    }

    public static Object P(Object[] objArr, long j2) {
        return e.getObject(objArr, s + (j2 * t));
    }

    public static Object Q(java.lang.reflect.Field field) {
        return e.getStaticObject(field);
    }

    public static Unsafe R() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean S() {
        return g;
    }

    public static boolean T() {
        return f;
    }

    public static boolean U() {
        return c;
    }

    public static int V(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        if (i2 < 0 || i3 < 0 || i4 < 0 || i2 + i4 > bArr.length || i3 + i4 > bArr2.length) {
            throw new IndexOutOfBoundsException();
        }
        int i5 = 0;
        if (g) {
            for (int i6 = (x + i2) & 7; i5 < i4 && (i6 & 7) != 0; i6++) {
                if (bArr[i2 + i5] != bArr2[i3 + i5]) {
                    return i5;
                }
                i5++;
            }
            int i7 = ((i4 - i5) & (-8)) + i5;
            while (i5 < i7) {
                long j2 = h;
                long j3 = i5;
                long jL = L(bArr, ((long) i2) + j2 + j3);
                long jL2 = L(bArr2, j2 + ((long) i3) + j3);
                if (jL != jL2) {
                    return i5 + t(jL, jL2);
                }
                i5 += 8;
            }
        }
        while (i5 < i4) {
            if (bArr[i2 + i5] != bArr2[i3 + i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static long W(java.lang.reflect.Field field) {
        return e.objectFieldOffset(field);
    }

    public static void X(Object obj, long j2, boolean z) {
        e.putBoolean(obj, j2, z);
    }

    public static void Y(boolean[] zArr, long j2, boolean z) {
        e.putBoolean(zArr, i + (j2 * j), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z(Object obj, long j2, boolean z) {
        e0(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a0(Object obj, long j2, boolean z) {
        f0(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    public static void b0(long j2, byte b2) {
        e.putByte(j2, b2);
    }

    public static void c0(Object obj, long j2, byte b2) {
        e.putByte(obj, j2, b2);
    }

    public static void d0(byte[] bArr, long j2, byte b2) {
        e.putByte(bArr, h + j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e0(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int I = I(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        l0(obj, j3, ((255 & b2) << i2) | (I & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f0(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        l0(obj, j3, ((255 & b2) << i2) | (I(obj, j3) & (~(255 << i2))));
    }

    public static void g0(Object obj, long j2, double d2) {
        e.putDouble(obj, j2, d2);
    }

    public static void h0(double[] dArr, long j2, double d2) {
        e.putDouble(dArr, q + (j2 * r), d2);
    }

    public static long i(ByteBuffer byteBuffer) {
        return e.getLong(byteBuffer, u);
    }

    public static void i0(Object obj, long j2, float f2) {
        e.putFloat(obj, j2, f2);
    }

    public static <T> T j(Class<T> cls) {
        try {
            return (T) a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void j0(float[] fArr, long j2, float f2) {
        e.putFloat(fArr, o + (j2 * p), f2);
    }

    private static int k(Class<?> cls) {
        if (g) {
            return e.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void k0(long j2, int i2) {
        e.putInt(j2, i2);
    }

    private static int l(Class<?> cls) {
        if (g) {
            return e.arrayIndexScale(cls);
        }
        return -1;
    }

    public static void l0(Object obj, long j2, int i2) {
        e.putInt(obj, j2, i2);
    }

    private static java.lang.reflect.Field m() {
        java.lang.reflect.Field fieldR;
        if (com.google.protobuf.a.c() && (fieldR = r(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldR;
        }
        java.lang.reflect.Field fieldR2 = r(Buffer.class, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        if (fieldR2 == null || fieldR2.getType() != Long.TYPE) {
            return null;
        }
        return fieldR2;
    }

    public static void m0(int[] iArr, long j2, int i2) {
        e.putInt(iArr, k + (j2 * l), i2);
    }

    public static void n(long j2, byte[] bArr, long j3, long j4) {
        e.copyMemory(j2, bArr, j3, j4);
    }

    public static void n0(long j2, long j3) {
        e.putLong(j2, j3);
    }

    public static void o(byte[] bArr, long j2, long j3, long j4) {
        e.copyMemory(bArr, j2, j3, j4);
    }

    public static void o0(Object obj, long j2, long j3) {
        e.putLong(obj, j2, j3);
    }

    public static void p(byte[] bArr, long j2, byte[] bArr2, long j3, long j4) {
        System.arraycopy(bArr, (int) j2, bArr2, (int) j3, (int) j4);
    }

    public static void p0(long[] jArr, long j2, long j3) {
        e.putLong(jArr, m + (j2 * n), j3);
    }

    private static boolean q(Class<?> cls) {
        if (!com.google.protobuf.a.c()) {
            return false;
        }
        try {
            Class<?> cls2 = b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void q0(Object obj, long j2, Object obj2) {
        e.putObject(obj, j2, obj2);
    }

    private static java.lang.reflect.Field r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void r0(Object[] objArr, long j2, Object obj) {
        e.putObject(objArr, s + (j2 * t), obj);
    }

    private static long s(java.lang.reflect.Field field) {
        b bVar;
        if (field == null || (bVar = e) == null) {
            return -1L;
        }
        return bVar.objectFieldOffset(field);
    }

    private static boolean s0() {
        Unsafe unsafe = a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (com.google.protobuf.a.c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger.getLogger(UnsafeUtil.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static int t(long j2, long j3) {
        return (y ? Long.numberOfLeadingZeros(j2 ^ j3) : Long.numberOfTrailingZeros(j2 ^ j3)) >> 3;
    }

    private static boolean t0() {
        Unsafe unsafe = a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m() == null) {
                return false;
            }
            if (com.google.protobuf.a.c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            Logger.getLogger(UnsafeUtil.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    public static boolean u(Object obj, long j2) {
        return e.getBoolean(obj, j2);
    }

    public static boolean v(boolean[] zArr, long j2) {
        return e.getBoolean(zArr, i + (j2 * j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean w(Object obj, long j2) {
        return B(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean x(Object obj, long j2) {
        return C(obj, j2) != 0;
    }

    public static byte y(long j2) {
        return e.getByte(j2);
    }

    public static byte z(Object obj, long j2) {
        return e.getByte(obj, j2);
    }
}
