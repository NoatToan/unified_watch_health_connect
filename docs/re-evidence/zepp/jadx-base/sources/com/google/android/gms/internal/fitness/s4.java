package com.google.android.gms.internal.fitness;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class s4 {
    private static final Logger a = Logger.getLogger(s4.class.getName());
    private static final Unsafe b;
    private static final Class<?> c;
    private static final boolean d;
    private static final boolean e;
    private static final c f;
    private static final boolean g;
    private static final boolean h;
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
    private static final long v;
    private static final int w;
    public static final boolean x;

    public static final class a extends c {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final void a(Object obj, long j, double d) {
            d(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final void b(Object obj, long j, float f) {
            c(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final void e(Object obj, long j, boolean z) {
            if (s4.x) {
                s4.l(obj, j, z);
            } else {
                s4.n(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final void f(Object obj, long j, byte b) {
            if (s4.x) {
                s4.b(obj, j, b);
            } else {
                s4.k(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final boolean i(Object obj, long j) {
            return s4.x ? s4.J(obj, j) : s4.K(obj, j);
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final float j(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final double k(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final byte l(Object obj, long j) {
            return s4.x ? s4.H(obj, j) : s4.I(obj, j);
        }
    }

    public static final class b extends c {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final void a(Object obj, long j, double d) {
            d(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final void b(Object obj, long j, float f) {
            c(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final void e(Object obj, long j, boolean z) {
            if (s4.x) {
                s4.l(obj, j, z);
            } else {
                s4.n(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final void f(Object obj, long j, byte b) {
            if (s4.x) {
                s4.b(obj, j, b);
            } else {
                s4.k(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final boolean i(Object obj, long j) {
            return s4.x ? s4.J(obj, j) : s4.K(obj, j);
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final float j(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final double k(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final byte l(Object obj, long j) {
            return s4.x ? s4.H(obj, j) : s4.I(obj, j);
        }
    }

    public static abstract class c {
        public Unsafe a;

        public c(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract void a(Object obj, long j, double d);

        public abstract void b(Object obj, long j, float f);

        public final void c(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void d(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public abstract void e(Object obj, long j, boolean z);

        public abstract void f(Object obj, long j, byte b);

        public final int g(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long h(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public abstract boolean i(Object obj, long j);

        public abstract float j(Object obj, long j);

        public abstract double k(Object obj, long j);

        public abstract byte l(Object obj, long j);
    }

    public static final class d extends c {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final void a(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final void b(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final void e(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final void f(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final boolean i(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final float j(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final double k(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.fitness.s4.c
        public final byte l(Object obj, long j) {
            return this.a.getByte(obj, j);
        }
    }

    static {
        Unsafe unsafeS = s();
        b = unsafeS;
        c = w1.b();
        boolean zB = B(Long.TYPE);
        d = zB;
        boolean zB2 = B(Integer.TYPE);
        e = zB2;
        c dVar = null;
        if (unsafeS != null) {
            if (!w1.a()) {
                dVar = new d(unsafeS);
            } else if (zB) {
                dVar = new a(unsafeS);
            } else if (zB2) {
                dVar = new b(unsafeS);
            }
        }
        f = dVar;
        g = u();
        h = t();
        long jY = y(byte[].class);
        i = jY;
        j = y(boolean[].class);
        k = z(boolean[].class);
        l = y(int[].class);
        m = z(int[].class);
        n = y(long[].class);
        o = z(long[].class);
        p = y(float[].class);
        q = z(float[].class);
        r = y(double[].class);
        s = z(double[].class);
        t = y(Object[].class);
        u = z(Object[].class);
        Field fieldV = v();
        v = (fieldV == null || dVar == null) ? -1L : dVar.a.objectFieldOffset(fieldV);
        w = (int) (7 & jY);
        x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private s4() {
    }

    public static int A(Object obj, long j2) {
        return f.g(obj, j2);
    }

    private static boolean B(Class<?> cls) {
        if (!w1.a()) {
            return false;
        }
        try {
            Class<?> cls2 = c;
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

    public static long C(Object obj, long j2) {
        return f.h(obj, j2);
    }

    public static boolean D(Object obj, long j2) {
        return f.i(obj, j2);
    }

    public static float E(Object obj, long j2) {
        return f.j(obj, j2);
    }

    public static double F(Object obj, long j2) {
        return f.k(obj, j2);
    }

    public static Object G(Object obj, long j2) {
        return f.a.getObject(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte H(Object obj, long j2) {
        return (byte) (A(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte I(Object obj, long j2) {
        return (byte) (A(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean J(Object obj, long j2) {
        return H(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean K(Object obj, long j2) {
        return I(obj, j2) != 0;
    }

    public static byte a(byte[] bArr, long j2) {
        return f.l(bArr, i + j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int iA = A(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        e(obj, j3, ((255 & b2) << i2) | (iA & (~(255 << i2))));
    }

    public static void c(Object obj, long j2, double d2) {
        f.a(obj, j2, d2);
    }

    public static void d(Object obj, long j2, float f2) {
        f.b(obj, j2, f2);
    }

    public static void e(Object obj, long j2, int i2) {
        f.c(obj, j2, i2);
    }

    public static void f(Object obj, long j2, long j3) {
        f.d(obj, j2, j3);
    }

    public static void g(Object obj, long j2, Object obj2) {
        f.a.putObject(obj, j2, obj2);
    }

    public static void h(Object obj, long j2, boolean z) {
        f.e(obj, j2, z);
    }

    public static void i(byte[] bArr, long j2, byte b2) {
        f.f(bArr, i + j2, b2);
    }

    private static Field j(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        e(obj, j3, ((255 & b2) << i2) | (A(obj, j3) & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(Object obj, long j2, boolean z) {
        b(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(Object obj, long j2, boolean z) {
        k(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    public static boolean q() {
        return h;
    }

    public static boolean r() {
        return g;
    }

    public static Unsafe s() {
        try {
            return (Unsafe) AccessController.doPrivileged(new r4());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean t() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (w1.a()) {
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
            Logger logger = a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean u() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (v() == null) {
                return false;
            }
            if (w1.a()) {
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
            Logger logger = a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static Field v() {
        Field fieldJ;
        if (w1.a() && (fieldJ = j(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldJ;
        }
        Field fieldJ2 = j(Buffer.class, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        if (fieldJ2 == null || fieldJ2.getType() != Long.TYPE) {
            return null;
        }
        return fieldJ2;
    }

    public static <T> T x(Class<T> cls) {
        try {
            return (T) b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static int y(Class<?> cls) {
        if (h) {
            return f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int z(Class<?> cls) {
        if (h) {
            return f.a.arrayIndexScale(cls);
        }
        return -1;
    }
}
