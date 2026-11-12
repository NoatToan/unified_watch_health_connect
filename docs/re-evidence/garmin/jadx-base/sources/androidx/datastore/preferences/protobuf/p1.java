package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f6799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f6800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f6801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f6802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f6803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f6804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f6805g;

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

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final boolean c(Object obj, long j8) {
            return p1.f6805g ? p1.b(obj, j8) : p1.c(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final double d(Object obj, long j8) {
            return Double.longBitsToDouble(g(obj, j8));
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final float e(Object obj, long j8) {
            return Float.intBitsToFloat(f(obj, j8));
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final void j(Object obj, long j8, boolean z14) {
            if (p1.f6805g) {
                p1.k(obj, j8, z14 ? (byte) 1 : (byte) 0);
            } else {
                p1.l(obj, j8, z14 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final void k(Object obj, long j8, byte b14) {
            if (p1.f6805g) {
                p1.k(obj, j8, b14);
            } else {
                p1.l(obj, j8, b14);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final void l(Object obj, long j8, double d14) {
            o(obj, j8, Double.doubleToLongBits(d14));
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final void m(Object obj, long j8, float f14) {
            n(obj, j8, Float.floatToIntBits(f14));
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final boolean r() {
            return false;
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final boolean c(Object obj, long j8) {
            return p1.f6805g ? p1.b(obj, j8) : p1.c(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final double d(Object obj, long j8) {
            return Double.longBitsToDouble(g(obj, j8));
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final float e(Object obj, long j8) {
            return Float.intBitsToFloat(f(obj, j8));
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final void j(Object obj, long j8, boolean z14) {
            if (p1.f6805g) {
                p1.k(obj, j8, z14 ? (byte) 1 : (byte) 0);
            } else {
                p1.l(obj, j8, z14 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final void k(Object obj, long j8, byte b14) {
            if (p1.f6805g) {
                p1.k(obj, j8, b14);
            } else {
                p1.l(obj, j8, b14);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final void l(Object obj, long j8, double d14) {
            o(obj, j8, Double.doubleToLongBits(d14));
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final void m(Object obj, long j8, float f14) {
            n(obj, j8, Float.floatToIntBits(f14));
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final boolean r() {
            return false;
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final boolean c(Object obj, long j8) {
            return this.f6806a.getBoolean(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final double d(Object obj, long j8) {
            return this.f6806a.getDouble(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final float e(Object obj, long j8) {
            return this.f6806a.getFloat(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final void j(Object obj, long j8, boolean z14) {
            this.f6806a.putBoolean(obj, j8, z14);
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final void k(Object obj, long j8, byte b14) {
            this.f6806a.putByte(obj, j8, b14);
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final void l(Object obj, long j8, double d14) {
            this.f6806a.putDouble(obj, j8, d14);
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final void m(Object obj, long j8, float f14) {
            this.f6806a.putFloat(obj, j8, f14);
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f6806a.getClass();
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
                p1.a(th3);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public final boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f6806a.getClass();
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
                p1.a(th3);
                return false;
            }
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Unsafe f6806a;

        public e(Unsafe unsafe) {
            this.f6806a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f6806a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f6806a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j8);

        public abstract double d(Object obj, long j8);

        public abstract float e(Object obj, long j8);

        public final int f(Object obj, long j8) {
            return this.f6806a.getInt(obj, j8);
        }

        public final long g(Object obj, long j8) {
            return this.f6806a.getLong(obj, j8);
        }

        public final Object h(Object obj, long j8) {
            return this.f6806a.getObject(obj, j8);
        }

        public final long i(Field field) {
            return this.f6806a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j8, boolean z14);

        public abstract void k(Object obj, long j8, byte b14);

        public abstract void l(Object obj, long j8, double d14);

        public abstract void m(Object obj, long j8, float f14);

        public final void n(Object obj, long j8, int i14) {
            this.f6806a.putInt(obj, j8, i14);
        }

        public final void o(Object obj, long j8, long j14) {
            this.f6806a.putLong(obj, j8, j14);
        }

        public final void p(Object obj, long j8, Object obj2) {
            this.f6806a.putObject(obj, j8, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f6806a;
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
                p1.a(th3);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f6806a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return p1.g() != null;
            } catch (Throwable th3) {
                p1.a(th3);
                return false;
            }
        }
    }

    static {
        Unsafe unsafeI = i();
        f6799a = unsafeI;
        f6800b = androidx.datastore.preferences.protobuf.d.f6691a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        e dVar = null;
        if (unsafeI != null) {
            if (!androidx.datastore.preferences.protobuf.d.a()) {
                dVar = new d(unsafeI);
            } else if (zH) {
                dVar = new c(unsafeI);
            } else if (zH2) {
                dVar = new b(unsafeI);
            }
        }
        f6801c = dVar;
        f6802d = dVar == null ? false : dVar.r();
        f6803e = dVar == null ? false : dVar.q();
        f6804f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && dVar != null) {
            dVar.i(fieldG);
        }
        f6805g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private p1() {
    }

    public static void a(Throwable th3) {
        Logger.getLogger(p1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th3);
    }

    public static boolean b(Object obj, long j8) {
        return ((byte) ((f6801c.f(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(Object obj, long j8) {
        return ((byte) ((f6801c.f(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255)) != 0;
    }

    public static <T> T d(Class<T> cls) {
        try {
            return (T) f6799a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            l2.p(e4);
            return null;
        }
    }

    public static int e(Class<?> cls) {
        if (f6803e) {
            return f6801c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f6803e) {
            f6801c.b(cls);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (androidx.datastore.preferences.protobuf.d.a()) {
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

    public static boolean h(Class<?> cls) {
        if (!androidx.datastore.preferences.protobuf.d.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f6800b;
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j8, byte b14) {
        f6801c.k(bArr, f6804f + j8, b14);
    }

    public static void k(Object obj, long j8, byte b14) {
        long j14 = (-4) & j8;
        int iF = f6801c.f(obj, j14);
        int i14 = ((~((int) j8)) & 3) << 3;
        m(obj, j14, ((255 & b14) << i14) | (iF & (~(255 << i14))));
    }

    public static void l(Object obj, long j8, byte b14) {
        long j14 = (-4) & j8;
        int i14 = (((int) j8) & 3) << 3;
        m(obj, j14, ((255 & b14) << i14) | (f6801c.f(obj, j14) & (~(255 << i14))));
    }

    public static void m(Object obj, long j8, int i14) {
        f6801c.n(obj, j8, i14);
    }

    public static void n(Object obj, long j8, long j14) {
        f6801c.o(obj, j8, j14);
    }

    public static void o(Object obj, long j8, Object obj2) {
        f6801c.p(obj, j8, obj2);
    }
}
