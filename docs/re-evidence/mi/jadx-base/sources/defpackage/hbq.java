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
public final class hbq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f19915a = H();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f19916b = t91.b();
    public static final boolean c = q(Long.TYPE);
    public static final boolean d = q(Integer.TYPE);
    public static final e e = F();
    public static final boolean f = Y();
    public static final boolean g = X();
    public static final long h;
    public static final long i;
    public static final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f19917k;
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final long p;
    public static final long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f19918r;
    public static final long s;
    public static final long t;
    public static final long u;
    public static final int v;
    public static final boolean w;

    public class a implements PrivilegedExceptionAction<Unsafe> {
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

        @Override // hbq.e
        public void c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // hbq.e
        public boolean d(Object obj, long j) {
            return hbq.w ? hbq.u(obj, j) : hbq.v(obj, j);
        }

        @Override // hbq.e
        public byte e(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // hbq.e
        public byte f(Object obj, long j) {
            return hbq.w ? hbq.y(obj, j) : hbq.z(obj, j);
        }

        @Override // hbq.e
        public double g(Object obj, long j) {
            return Double.longBitsToDouble(k(obj, j));
        }

        @Override // hbq.e
        public float h(Object obj, long j) {
            return Float.intBitsToFloat(i(obj, j));
        }

        @Override // hbq.e
        public long j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // hbq.e
        public void n(Object obj, long j, boolean z) {
            if (hbq.w) {
                hbq.N(obj, j, z);
            } else {
                hbq.O(obj, j, z);
            }
        }

        @Override // hbq.e
        public void o(Object obj, long j, byte b2) {
            if (hbq.w) {
                hbq.Q(obj, j, b2);
            } else {
                hbq.R(obj, j, b2);
            }
        }

        @Override // hbq.e
        public void p(Object obj, long j, double d) {
            s(obj, j, Double.doubleToLongBits(d));
        }

        @Override // hbq.e
        public void q(Object obj, long j, float f) {
            r(obj, j, Float.floatToIntBits(f));
        }

        @Override // hbq.e
        public boolean v() {
            return false;
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // hbq.e
        public void c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // hbq.e
        public boolean d(Object obj, long j) {
            return hbq.w ? hbq.u(obj, j) : hbq.v(obj, j);
        }

        @Override // hbq.e
        public byte e(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // hbq.e
        public byte f(Object obj, long j) {
            return hbq.w ? hbq.y(obj, j) : hbq.z(obj, j);
        }

        @Override // hbq.e
        public double g(Object obj, long j) {
            return Double.longBitsToDouble(k(obj, j));
        }

        @Override // hbq.e
        public float h(Object obj, long j) {
            return Float.intBitsToFloat(i(obj, j));
        }

        @Override // hbq.e
        public long j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // hbq.e
        public void n(Object obj, long j, boolean z) {
            if (hbq.w) {
                hbq.N(obj, j, z);
            } else {
                hbq.O(obj, j, z);
            }
        }

        @Override // hbq.e
        public void o(Object obj, long j, byte b2) {
            if (hbq.w) {
                hbq.Q(obj, j, b2);
            } else {
                hbq.R(obj, j, b2);
            }
        }

        @Override // hbq.e
        public void p(Object obj, long j, double d) {
            s(obj, j, Double.doubleToLongBits(d));
        }

        @Override // hbq.e
        public void q(Object obj, long j, float f) {
            r(obj, j, Float.floatToIntBits(f));
        }

        @Override // hbq.e
        public boolean v() {
            return false;
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // hbq.e
        public void c(long j, byte[] bArr, long j2, long j3) {
            this.f19919a.copyMemory((Object) null, j, bArr, hbq.h + j2, j3);
        }

        @Override // hbq.e
        public boolean d(Object obj, long j) {
            return this.f19919a.getBoolean(obj, j);
        }

        @Override // hbq.e
        public byte e(long j) {
            return this.f19919a.getByte(j);
        }

        @Override // hbq.e
        public byte f(Object obj, long j) {
            return this.f19919a.getByte(obj, j);
        }

        @Override // hbq.e
        public double g(Object obj, long j) {
            return this.f19919a.getDouble(obj, j);
        }

        @Override // hbq.e
        public float h(Object obj, long j) {
            return this.f19919a.getFloat(obj, j);
        }

        @Override // hbq.e
        public long j(long j) {
            return this.f19919a.getLong(j);
        }

        @Override // hbq.e
        public void n(Object obj, long j, boolean z) {
            this.f19919a.putBoolean(obj, j, z);
        }

        @Override // hbq.e
        public void o(Object obj, long j, byte b2) {
            this.f19919a.putByte(obj, j, b2);
        }

        @Override // hbq.e
        public void p(Object obj, long j, double d) {
            this.f19919a.putDouble(obj, j, d);
        }

        @Override // hbq.e
        public void q(Object obj, long j, float f) {
            this.f19919a.putFloat(obj, j, f);
        }

        @Override // hbq.e
        public boolean u() {
            if (!super.u()) {
                return false;
            }
            try {
                Class<?> cls = this.f19919a.getClass();
                Class<?> cls2 = Long.TYPE;
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
                hbq.K(th);
                return false;
            }
        }

        @Override // hbq.e
        public boolean v() {
            if (!super.v()) {
                return false;
            }
            try {
                Class<?> cls = this.f19919a.getClass();
                Class<?> cls2 = Long.TYPE;
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
                hbq.K(th);
                return false;
            }
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Unsafe f19919a;

        public e(Unsafe unsafe) {
            this.f19919a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f19919a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f19919a.arrayIndexScale(cls);
        }

        public abstract void c(long j, byte[] bArr, long j2, long j3);

        public abstract boolean d(Object obj, long j);

        public abstract byte e(long j);

        public abstract byte f(Object obj, long j);

        public abstract double g(Object obj, long j);

        public abstract float h(Object obj, long j);

        public final int i(Object obj, long j) {
            return this.f19919a.getInt(obj, j);
        }

        public abstract long j(long j);

        public final long k(Object obj, long j) {
            return this.f19919a.getLong(obj, j);
        }

        public final Object l(Object obj, long j) {
            return this.f19919a.getObject(obj, j);
        }

        public final long m(Field field) {
            return this.f19919a.objectFieldOffset(field);
        }

        public abstract void n(Object obj, long j, boolean z);

        public abstract void o(Object obj, long j, byte b2);

        public abstract void p(Object obj, long j, double d);

        public abstract void q(Object obj, long j, float f);

        public final void r(Object obj, long j, int i) {
            this.f19919a.putInt(obj, j, i);
        }

        public final void s(Object obj, long j, long j2) {
            this.f19919a.putLong(obj, j, j2);
        }

        public final void t(Object obj, long j, Object obj2) {
            this.f19919a.putObject(obj, j, obj2);
        }

        public boolean u() {
            Unsafe unsafe = this.f19919a;
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
                return true;
            } catch (Throwable th) {
                hbq.K(th);
                return false;
            }
        }

        public boolean v() {
            Unsafe unsafe = this.f19919a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return hbq.o() != null;
            } catch (Throwable th) {
                hbq.K(th);
                return false;
            }
        }
    }

    static {
        long jM = m(byte[].class);
        h = jM;
        i = m(boolean[].class);
        j = n(boolean[].class);
        f19917k = m(int[].class);
        l = n(int[].class);
        m = m(long[].class);
        n = n(long[].class);
        o = m(float[].class);
        p = n(float[].class);
        q = m(double[].class);
        f19918r = n(double[].class);
        s = m(Object[].class);
        t = n(Object[].class);
        u = s(o());
        v = (int) (jM & 7);
        w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static double A(Object obj, long j2) {
        return e.g(obj, j2);
    }

    public static float B(Object obj, long j2) {
        return e.h(obj, j2);
    }

    public static int C(Object obj, long j2) {
        return e.i(obj, j2);
    }

    public static long D(long j2) {
        return e.j(j2);
    }

    public static long E(Object obj, long j2) {
        return e.k(obj, j2);
    }

    public static e F() {
        Unsafe unsafe = f19915a;
        if (unsafe == null) {
            return null;
        }
        if (!t91.c()) {
            return new d(unsafe);
        }
        if (c) {
            return new c(unsafe);
        }
        if (d) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object G(Object obj, long j2) {
        return e.l(obj, j2);
    }

    public static Unsafe H() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean I() {
        return g;
    }

    public static boolean J() {
        return f;
    }

    public static void K(Throwable th) {
        Logger.getLogger(hbq.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static long L(Field field) {
        return e.m(field);
    }

    public static void M(Object obj, long j2, boolean z) {
        e.n(obj, j2, z);
    }

    public static void N(Object obj, long j2, boolean z) {
        Q(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    public static void O(Object obj, long j2, boolean z) {
        R(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    public static void P(byte[] bArr, long j2, byte b2) {
        e.o(bArr, h + j2, b2);
    }

    public static void Q(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int iC = C(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        U(obj, j3, ((255 & b2) << i2) | (iC & (~(255 << i2))));
    }

    public static void R(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        U(obj, j3, ((255 & b2) << i2) | (C(obj, j3) & (~(255 << i2))));
    }

    public static void S(Object obj, long j2, double d2) {
        e.p(obj, j2, d2);
    }

    public static void T(Object obj, long j2, float f2) {
        e.q(obj, j2, f2);
    }

    public static void U(Object obj, long j2, int i2) {
        e.r(obj, j2, i2);
    }

    public static void V(Object obj, long j2, long j3) {
        e.s(obj, j2, j3);
    }

    public static void W(Object obj, long j2, Object obj2) {
        e.t(obj, j2, obj2);
    }

    public static boolean X() {
        e eVar = e;
        if (eVar == null) {
            return false;
        }
        return eVar.u();
    }

    public static boolean Y() {
        e eVar = e;
        if (eVar == null) {
            return false;
        }
        return eVar.v();
    }

    public static long k(ByteBuffer byteBuffer) {
        return e.k(byteBuffer, u);
    }

    public static <T> T l(Class<T> cls) {
        try {
            return (T) f19915a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int m(Class<?> cls) {
        if (g) {
            return e.a(cls);
        }
        return -1;
    }

    public static int n(Class<?> cls) {
        if (g) {
            return e.b(cls);
        }
        return -1;
    }

    public static Field o() {
        Field fieldR;
        if (t91.c() && (fieldR = r(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldR;
        }
        Field fieldR2 = r(Buffer.class, Home.JSON_KEY_ADDRESS);
        if (fieldR2 == null || fieldR2.getType() != Long.TYPE) {
            return null;
        }
        return fieldR2;
    }

    public static void p(long j2, byte[] bArr, long j3, long j4) {
        e.c(j2, bArr, j3, j4);
    }

    public static boolean q(Class<?> cls) {
        if (!t91.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f19916b;
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

    public static Field r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long s(Field field) {
        e eVar;
        if (field == null || (eVar = e) == null) {
            return -1L;
        }
        return eVar.m(field);
    }

    public static boolean t(Object obj, long j2) {
        return e.d(obj, j2);
    }

    public static boolean u(Object obj, long j2) {
        return y(obj, j2) != 0;
    }

    public static boolean v(Object obj, long j2) {
        return z(obj, j2) != 0;
    }

    public static byte w(long j2) {
        return e.e(j2);
    }

    public static byte x(byte[] bArr, long j2) {
        return e.f(bArr, h + j2);
    }

    public static byte y(Object obj, long j2) {
        return (byte) ((C(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    public static byte z(Object obj, long j2) {
        return (byte) ((C(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }
}
