package rx.internal.util.unsafe;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes11.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f154926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f154927b;

    static {
        f154927b = System.getProperty("rx.unsafe-disable") != null;
        Unsafe unsafe = null;
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (Unsafe) declaredField.get(null);
        } catch (Throwable unused) {
        }
        f154926a = unsafe;
    }

    private s() {
        throw new IllegalStateException("No instances!");
    }

    public static long a(Class<?> cls, String str) {
        try {
            return f154926a.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e4) {
            InternalError internalError = new InternalError();
            internalError.initCause(e4);
            throw internalError;
        }
    }
}
