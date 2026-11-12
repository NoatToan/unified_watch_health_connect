package androidx.health.platform.client.proto;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f7813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f7814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f7815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f7816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f7817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f7818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f7819g;

    public class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final boolean c(Object obj, long j8) {
            if (y2.f7819g) {
                return y2.h(obj, j8) != 0;
            }
            return y2.i(obj, j8) != 0;
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final byte d(Object obj, long j8) {
            return y2.f7819g ? y2.h(obj, j8) : y2.i(obj, j8);
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final double e(Object obj, long j8) {
            return Double.longBitsToDouble(h(obj, j8));
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final float f(Object obj, long j8) {
            return Float.intBitsToFloat(g(obj, j8));
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final void k(Object obj, long j8, boolean z14) {
            if (y2.f7819g) {
                y2.l(obj, j8, z14 ? (byte) 1 : (byte) 0);
            } else {
                y2.m(obj, j8, z14 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final void l(Object obj, long j8, byte b14) {
            if (y2.f7819g) {
                y2.l(obj, j8, b14);
            } else {
                y2.m(obj, j8, b14);
            }
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final void m(Object obj, long j8, double d14) {
            p(obj, j8, Double.doubleToLongBits(d14));
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final void n(Object obj, long j8, float f14) {
            o(obj, j8, Float.floatToIntBits(f14));
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final boolean s() {
            return false;
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final boolean c(Object obj, long j8) {
            if (y2.f7819g) {
                return y2.h(obj, j8) != 0;
            }
            return y2.i(obj, j8) != 0;
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final byte d(Object obj, long j8) {
            return y2.f7819g ? y2.h(obj, j8) : y2.i(obj, j8);
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final double e(Object obj, long j8) {
            return Double.longBitsToDouble(h(obj, j8));
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final float f(Object obj, long j8) {
            return Float.intBitsToFloat(g(obj, j8));
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final void k(Object obj, long j8, boolean z14) {
            if (y2.f7819g) {
                y2.l(obj, j8, z14 ? (byte) 1 : (byte) 0);
            } else {
                y2.m(obj, j8, z14 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final void l(Object obj, long j8, byte b14) {
            if (y2.f7819g) {
                y2.l(obj, j8, b14);
            } else {
                y2.m(obj, j8, b14);
            }
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final void m(Object obj, long j8, double d14) {
            p(obj, j8, Double.doubleToLongBits(d14));
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final void n(Object obj, long j8, float f14) {
            o(obj, j8, Float.floatToIntBits(f14));
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final boolean s() {
            return false;
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final boolean c(Object obj, long j8) {
            return this.f7820a.getBoolean(obj, j8);
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final byte d(Object obj, long j8) {
            return this.f7820a.getByte(obj, j8);
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final double e(Object obj, long j8) {
            return this.f7820a.getDouble(obj, j8);
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final float f(Object obj, long j8) {
            return this.f7820a.getFloat(obj, j8);
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final void k(Object obj, long j8, boolean z14) {
            this.f7820a.putBoolean(obj, j8, z14);
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final void l(Object obj, long j8, byte b14) {
            this.f7820a.putByte(obj, j8, b14);
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final void m(Object obj, long j8, double d14) {
            this.f7820a.putDouble(obj, j8, d14);
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final void n(Object obj, long j8, float f14) {
            this.f7820a.putFloat(obj, j8, f14);
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f7820a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th3) {
                y2.a(th3);
                return false;
            }
        }

        @Override // androidx.health.platform.client.proto.y2.e
        public final boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                Class<?> cls = this.f7820a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th3) {
                y2.a(th3);
                return false;
            }
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Unsafe f7820a;

        public e(Unsafe unsafe) {
            this.f7820a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f7820a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f7820a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j8);

        public abstract byte d(Object obj, long j8);

        public abstract double e(Object obj, long j8);

        public abstract float f(Object obj, long j8);

        public final int g(Object obj, long j8) {
            return this.f7820a.getInt(obj, j8);
        }

        public final long h(Object obj, long j8) {
            return this.f7820a.getLong(obj, j8);
        }

        public final Object i(Object obj, long j8) {
            return this.f7820a.getObject(obj, j8);
        }

        public final long j(Field field) {
            return this.f7820a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j8, boolean z14);

        public abstract void l(Object obj, long j8, byte b14);

        public abstract void m(Object obj, long j8, double d14);

        public abstract void n(Object obj, long j8, float f14);

        public final void o(Object obj, long j8, int i14) {
            this.f7820a.putInt(obj, j8, i14);
        }

        public final void p(Object obj, long j8, long j14) {
            this.f7820a.putLong(obj, j8, j14);
        }

        public final void q(Object obj, long j8, Object obj2) {
            this.f7820a.putObject(obj, j8, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f7820a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th3) {
                y2.a(th3);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f7820a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return y2.e() != null;
            } catch (Throwable th3) {
                y2.a(th3);
                return false;
            }
        }
    }

    static {
        Unsafe unsafeJ = j();
        f7813a = unsafeJ;
        f7814b = androidx.health.platform.client.proto.d.f7574a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        e dVar = null;
        if (unsafeJ != null) {
            if (!androidx.health.platform.client.proto.d.a()) {
                dVar = new d(unsafeJ);
            } else if (zF) {
                dVar = new c(unsafeJ);
            } else if (zF2) {
                dVar = new b(unsafeJ);
            }
        }
        f7815c = dVar;
        f7816d = dVar == null ? false : dVar.s();
        f7817e = dVar == null ? false : dVar.r();
        f7818f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        if (fieldE != null && dVar != null) {
            dVar.j(fieldE);
        }
        f7819g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private y2() {
    }

    public static void a(Throwable th3) {
        Logger.getLogger(y2.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th3);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return (T) f7813a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            yc.l2.p(e4);
            return null;
        }
    }

    public static int c(Class<?> cls) {
        if (f7817e) {
            return f7815c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f7817e) {
            f7815c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (androidx.health.platform.client.proto.d.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean f(Class<?> cls) {
        if (!androidx.health.platform.client.proto.d.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f7814b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
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

    public static byte g(byte[] bArr, long j8) {
        return f7815c.d(bArr, f7818f + j8);
    }

    public static byte h(Object obj, long j8) {
        return (byte) ((f7815c.g(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j8) {
        return (byte) ((f7815c.g(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j8, byte b14) {
        f7815c.l(bArr, f7818f + j8, b14);
    }

    public static void l(Object obj, long j8, byte b14) {
        long j14 = (-4) & j8;
        int iG = f7815c.g(obj, j14);
        int i14 = ((~((int) j8)) & 3) << 3;
        n(obj, j14, ((255 & b14) << i14) | (iG & (~(255 << i14))));
    }

    public static void m(Object obj, long j8, byte b14) {
        long j14 = (-4) & j8;
        int i14 = (((int) j8) & 3) << 3;
        n(obj, j14, ((255 & b14) << i14) | (f7815c.g(obj, j14) & (~(255 << i14))));
    }

    public static void n(Object obj, long j8, int i14) {
        f7815c.o(obj, j8, i14);
    }

    public static void o(Object obj, long j8, long j14) {
        f7815c.p(obj, j8, j14);
    }

    public static void p(Object obj, long j8, Object obj2) {
        f7815c.q(obj, j8, obj2);
    }
}
