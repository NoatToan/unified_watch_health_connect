package rx.internal.util.unsafe;

import java.util.Iterator;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a<E> extends b<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f154915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f154916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f154917e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f154918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E[] f154919b;

    static {
        int iIntValue = Integer.getInteger("sparse.shift", 0).intValue();
        f154915c = iIntValue;
        Unsafe unsafe = s.f154926a;
        int iArrayIndexScale = unsafe.arrayIndexScale(Object[].class);
        if (4 == iArrayIndexScale) {
            f154917e = iIntValue + 2;
        } else {
            if (8 != iArrayIndexScale) {
                vb.h.z("Unknown pointer size");
                return;
            }
            f154917e = iIntValue + 3;
        }
        f154916d = unsafe.arrayBaseOffset(Object[].class) + (32 << (f154917e - iIntValue));
    }

    public a(int i14) {
        int iA = c.a(i14);
        this.f154918a = iA - 1;
        this.f154919b = (E[]) new Object[(iA << f154915c) + 64];
    }

    public static Object b(Object[] objArr, long j8) {
        return s.f154926a.getObject(objArr, j8);
    }

    public static Object c(Object[] objArr, long j8) {
        return s.f154926a.getObjectVolatile(objArr, j8);
    }

    public static void d(Object[] objArr, long j8, Object obj) {
        s.f154926a.putOrderedObject(objArr, j8, obj);
    }

    public static void e(Object[] objArr, long j8, Object obj) {
        s.f154926a.putObject(objArr, j8, obj);
    }

    public final long a(long j8) {
        return f154916d + ((j8 & this.f154918a) << f154917e);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
}
