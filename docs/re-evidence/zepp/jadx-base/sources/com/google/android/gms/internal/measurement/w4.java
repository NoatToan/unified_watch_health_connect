package com.google.android.gms.internal.measurement;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class w4 {
    private static final Unsafe a;
    private static final Class<?> b;
    private static final boolean c;
    private static final boolean d;
    private static final v4 e;
    private static final boolean f;
    private static final boolean g;
    public static final long h;
    public static final boolean i;

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    static {
        Unsafe unsafe;
        boolean z;
        Unsafe unsafe2;
        boolean z2;
        v4 v4Var;
        Unsafe unsafeL = l();
        a = unsafeL;
        b = f2.a();
        Class<?> cls = Long.TYPE;
        boolean zA = A(cls);
        c = zA;
        boolean zA2 = A(Integer.TYPE);
        d = zA2;
        v4 t4Var = null;
        if (unsafeL != null) {
            if (zA) {
                t4Var = new u4(unsafeL);
            } else if (zA2) {
                t4Var = new t4(unsafeL);
            }
        }
        e = t4Var;
        if (t4Var == null || (unsafe = t4Var.a) == null) {
            z = false;
        } else {
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                if (b() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                m(th);
            }
        }
        f = z;
        v4 v4Var2 = e;
        if (v4Var2 == null || (unsafe2 = v4Var2.a) == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls3 = unsafe2.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("arrayBaseOffset", Class.class);
                cls3.getMethod("arrayIndexScale", Class.class);
                Class<?> cls4 = Long.TYPE;
                cls3.getMethod("getInt", Object.class, cls4);
                cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                cls3.getMethod("getLong", Object.class, cls4);
                cls3.getMethod("putLong", Object.class, cls4, cls4);
                cls3.getMethod("getObject", Object.class, cls4);
                cls3.getMethod("putObject", Object.class, cls4, Object.class);
                z2 = true;
            } catch (Throwable th2) {
                m(th2);
                z2 = false;
            }
        }
        g = z2;
        h = E(byte[].class);
        E(boolean[].class);
        a(boolean[].class);
        E(int[].class);
        a(int[].class);
        E(long[].class);
        a(long[].class);
        E(float[].class);
        a(float[].class);
        E(double[].class);
        a(double[].class);
        E(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (v4Var = e) != null) {
            v4Var.l(fieldB);
        }
        i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private w4() {
    }

    public static boolean A(Class<?> cls) {
        int i2 = f2.a;
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

    public static boolean B(Object obj, long j) {
        return e.g(obj, j);
    }

    public static boolean C() {
        return g;
    }

    public static boolean D() {
        return f;
    }

    private static int E(Class<?> cls) {
        if (g) {
            return e.h(cls);
        }
        return -1;
    }

    private static int a(Class<?> cls) {
        if (g) {
            return e.i(cls);
        }
        return -1;
    }

    private static Field b() {
        int i2 = f2.a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    private static Field c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        v4 v4Var = e;
        int iJ = v4Var.j(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        v4Var.n(obj, j2, ((255 & b2) << i2) | (iJ & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        v4 v4Var = e;
        int i2 = (((int) j) & 3) << 3;
        v4Var.n(obj, j2, ((255 & b2) << i2) | (v4Var.j(obj, j2) & (~(255 << i2))));
    }

    public static double f(Object obj, long j) {
        return e.a(obj, j);
    }

    public static float g(Object obj, long j) {
        return e.b(obj, j);
    }

    public static int h(Object obj, long j) {
        return e.j(obj, j);
    }

    public static long i(Object obj, long j) {
        return e.k(obj, j);
    }

    public static <T> T j(Class<T> cls) {
        try {
            return (T) a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object k(Object obj, long j) {
        return e.m(obj, j);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new s4());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void m(Throwable th) {
        Logger.getLogger(w4.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void r(Object obj, long j, boolean z) {
        e.c(obj, j, z);
    }

    public static void s(byte[] bArr, long j, byte b2) {
        e.d(bArr, h + j, b2);
    }

    public static void t(Object obj, long j, double d2) {
        e.e(obj, j, d2);
    }

    public static void u(Object obj, long j, float f2) {
        e.f(obj, j, f2);
    }

    public static void v(Object obj, long j, int i2) {
        e.n(obj, j, i2);
    }

    public static void w(Object obj, long j, long j2) {
        e.o(obj, j, j2);
    }

    public static void x(Object obj, long j, Object obj2) {
        e.p(obj, j, obj2);
    }

    public static /* synthetic */ boolean y(Object obj, long j) {
        return ((byte) ((e.j(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean z(Object obj, long j) {
        return ((byte) ((e.j(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
