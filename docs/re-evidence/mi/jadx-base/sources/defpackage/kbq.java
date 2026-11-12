package defpackage;

import com.xiaomi.smarthome.homeroom.model.Home;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class kbq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f23697a = Logger.getLogger(kbq.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f23698b = F();
    public static final Class<?> c = w91.b();
    public static final boolean d = o(Long.TYPE);
    public static final boolean e = o(Integer.TYPE);
    public static final e f = D();
    public static final boolean g = V();
    public static final boolean h = U();
    public static final long i;
    public static final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f23699k;
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final long p;
    public static final long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f23700r;
    public static final long s;
    public static final long t;
    public static final long u;
    public static final long v;
    public static final int w;
    public static final boolean x;

    public static class a implements PrivilegedExceptionAction<Unsafe> {
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
            return null;
        }
    }

    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // kbq.e
        public void c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // kbq.e
        public boolean d(Object obj, long j) {
            return kbq.x ? kbq.s(obj, j) : kbq.t(obj, j);
        }

        @Override // kbq.e
        public byte e(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // kbq.e
        public byte f(Object obj, long j) {
            return kbq.x ? kbq.w(obj, j) : kbq.x(obj, j);
        }

        @Override // kbq.e
        public double g(Object obj, long j) {
            return Double.longBitsToDouble(k(obj, j));
        }

        @Override // kbq.e
        public float h(Object obj, long j) {
            return Float.intBitsToFloat(i(obj, j));
        }

        @Override // kbq.e
        public long j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // kbq.e
        public void n(Object obj, long j, boolean z) {
            if (kbq.x) {
                kbq.K(obj, j, z);
            } else {
                kbq.L(obj, j, z);
            }
        }

        @Override // kbq.e
        public void o(Object obj, long j, byte b2) {
            if (kbq.x) {
                kbq.N(obj, j, b2);
            } else {
                kbq.O(obj, j, b2);
            }
        }

        @Override // kbq.e
        public void p(Object obj, long j, double d) {
            s(obj, j, Double.doubleToLongBits(d));
        }

        @Override // kbq.e
        public void q(Object obj, long j, float f) {
            r(obj, j, Float.floatToIntBits(f));
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // kbq.e
        public void c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // kbq.e
        public boolean d(Object obj, long j) {
            return kbq.x ? kbq.s(obj, j) : kbq.t(obj, j);
        }

        @Override // kbq.e
        public byte e(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // kbq.e
        public byte f(Object obj, long j) {
            return kbq.x ? kbq.w(obj, j) : kbq.x(obj, j);
        }

        @Override // kbq.e
        public double g(Object obj, long j) {
            return Double.longBitsToDouble(k(obj, j));
        }

        @Override // kbq.e
        public float h(Object obj, long j) {
            return Float.intBitsToFloat(i(obj, j));
        }

        @Override // kbq.e
        public long j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // kbq.e
        public void n(Object obj, long j, boolean z) {
            if (kbq.x) {
                kbq.K(obj, j, z);
            } else {
                kbq.L(obj, j, z);
            }
        }

        @Override // kbq.e
        public void o(Object obj, long j, byte b2) {
            if (kbq.x) {
                kbq.N(obj, j, b2);
            } else {
                kbq.O(obj, j, b2);
            }
        }

        @Override // kbq.e
        public void p(Object obj, long j, double d) {
            s(obj, j, Double.doubleToLongBits(d));
        }

        @Override // kbq.e
        public void q(Object obj, long j, float f) {
            r(obj, j, Float.floatToIntBits(f));
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // kbq.e
        public void c(long j, byte[] bArr, long j2, long j3) {
            this.f23701a.copyMemory((Object) null, j, bArr, kbq.i + j2, j3);
        }

        @Override // kbq.e
        public boolean d(Object obj, long j) {
            return this.f23701a.getBoolean(obj, j);
        }

        @Override // kbq.e
        public byte e(long j) {
            return this.f23701a.getByte(j);
        }

        @Override // kbq.e
        public byte f(Object obj, long j) {
            return this.f23701a.getByte(obj, j);
        }

        @Override // kbq.e
        public double g(Object obj, long j) {
            return this.f23701a.getDouble(obj, j);
        }

        @Override // kbq.e
        public float h(Object obj, long j) {
            return this.f23701a.getFloat(obj, j);
        }

        @Override // kbq.e
        public long j(long j) {
            return this.f23701a.getLong(j);
        }

        @Override // kbq.e
        public void n(Object obj, long j, boolean z) {
            this.f23701a.putBoolean(obj, j, z);
        }

        @Override // kbq.e
        public void o(Object obj, long j, byte b2) {
            this.f23701a.putByte(obj, j, b2);
        }

        @Override // kbq.e
        public void p(Object obj, long j, double d) {
            this.f23701a.putDouble(obj, j, d);
        }

        @Override // kbq.e
        public void q(Object obj, long j, float f) {
            this.f23701a.putFloat(obj, j, f);
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Unsafe f23701a;

        public e(Unsafe unsafe) {
            this.f23701a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f23701a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f23701a.arrayIndexScale(cls);
        }

        public abstract void c(long j, byte[] bArr, long j2, long j3);

        public abstract boolean d(Object obj, long j);

        public abstract byte e(long j);

        public abstract byte f(Object obj, long j);

        public abstract double g(Object obj, long j);

        public abstract float h(Object obj, long j);

        public final int i(Object obj, long j) {
            return this.f23701a.getInt(obj, j);
        }

        public abstract long j(long j);

        public final long k(Object obj, long j) {
            return this.f23701a.getLong(obj, j);
        }

        public final Object l(Object obj, long j) {
            return this.f23701a.getObject(obj, j);
        }

        public final long m(Field field) {
            return this.f23701a.objectFieldOffset(field);
        }

        public abstract void n(Object obj, long j, boolean z);

        public abstract void o(Object obj, long j, byte b2);

        public abstract void p(Object obj, long j, double d);

        public abstract void q(Object obj, long j, float f);

        public final void r(Object obj, long j, int i) {
            this.f23701a.putInt(obj, j, i);
        }

        public final void s(Object obj, long j, long j2) {
            this.f23701a.putLong(obj, j, j2);
        }

        public final void t(Object obj, long j, Object obj2) {
            this.f23701a.putObject(obj, j, obj2);
        }
    }

    static {
        long jK = k(byte[].class);
        i = jK;
        j = k(boolean[].class);
        f23699k = l(boolean[].class);
        l = k(int[].class);
        m = l(int[].class);
        n = k(long[].class);
        o = l(long[].class);
        p = k(float[].class);
        q = l(float[].class);
        f23700r = k(double[].class);
        s = l(double[].class);
        t = k(Object[].class);
        u = l(Object[].class);
        v = q(m());
        w = (int) (jK & 7);
        x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int A(Object obj, long j2) {
        return f.i(obj, j2);
    }

    public static long B(long j2) {
        return f.j(j2);
    }

    public static long C(Object obj, long j2) {
        return f.k(obj, j2);
    }

    public static e D() {
        Unsafe unsafe = f23698b;
        if (unsafe == null) {
            return null;
        }
        if (!w91.c()) {
            return new d(unsafe);
        }
        if (d) {
            return new c(unsafe);
        }
        if (e) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object E(Object obj, long j2) {
        return f.l(obj, j2);
    }

    public static Unsafe F() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean G() {
        return h;
    }

    public static boolean H() {
        return g;
    }

    public static long I(Field field) {
        return f.m(field);
    }

    public static void J(Object obj, long j2, boolean z) {
        f.n(obj, j2, z);
    }

    public static void K(Object obj, long j2, boolean z) {
        N(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    public static void L(Object obj, long j2, boolean z) {
        O(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    public static void M(byte[] bArr, long j2, byte b2) {
        f.o(bArr, i + j2, b2);
    }

    public static void N(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int iA = A(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        R(obj, j3, ((255 & b2) << i2) | (iA & (~(255 << i2))));
    }

    public static void O(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        R(obj, j3, ((255 & b2) << i2) | (A(obj, j3) & (~(255 << i2))));
    }

    public static void P(Object obj, long j2, double d2) {
        f.p(obj, j2, d2);
    }

    public static void Q(Object obj, long j2, float f2) {
        f.q(obj, j2, f2);
    }

    public static void R(Object obj, long j2, int i2) {
        f.r(obj, j2, i2);
    }

    public static void S(Object obj, long j2, long j3) {
        f.s(obj, j2, j3);
    }

    public static void T(Object obj, long j2, Object obj2) {
        f.t(obj, j2, obj2);
    }

    public static boolean U() {
        Unsafe unsafe = f23698b;
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
            if (w91.c()) {
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
            f23697a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    public static boolean V() {
        Unsafe unsafe = f23698b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m() == null) {
                return false;
            }
            if (w91.c()) {
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
            f23697a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    public static long i(ByteBuffer byteBuffer) {
        return f.k(byteBuffer, v);
    }

    public static <T> T j(Class<T> cls) {
        try {
            return (T) f23698b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int k(Class<?> cls) {
        if (h) {
            return f.a(cls);
        }
        return -1;
    }

    public static int l(Class<?> cls) {
        if (h) {
            return f.b(cls);
        }
        return -1;
    }

    public static Field m() {
        Field fieldP;
        if (w91.c() && (fieldP = p(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldP;
        }
        Field fieldP2 = p(Buffer.class, Home.JSON_KEY_ADDRESS);
        if (fieldP2 == null || fieldP2.getType() != Long.TYPE) {
            return null;
        }
        return fieldP2;
    }

    public static void n(long j2, byte[] bArr, long j3, long j4) {
        f.c(j2, bArr, j3, j4);
    }

    public static boolean o(Class<?> cls) {
        if (!w91.c()) {
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

    public static Field p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long q(Field field) {
        e eVar;
        if (field == null || (eVar = f) == null) {
            return -1L;
        }
        return eVar.m(field);
    }

    public static boolean r(Object obj, long j2) {
        return f.d(obj, j2);
    }

    public static boolean s(Object obj, long j2) {
        return w(obj, j2) != 0;
    }

    public static boolean t(Object obj, long j2) {
        return x(obj, j2) != 0;
    }

    public static byte u(long j2) {
        return f.e(j2);
    }

    public static byte v(byte[] bArr, long j2) {
        return f.f(bArr, i + j2);
    }

    public static byte w(Object obj, long j2) {
        return (byte) ((A(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    public static byte x(Object obj, long j2) {
        return (byte) ((A(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static double y(Object obj, long j2) {
        return f.g(obj, j2);
    }

    public static float z(Object obj, long j2) {
        return f.h(obj, j2);
    }
}
