package io.netty.util.internal.shaded.org.jctools.util;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsafeRefArrayAccess {
    public static final long REF_ARRAY_BASE;
    public static final int REF_ELEMENT_SHIFT;

    static {
        Unsafe unsafe = UnsafeAccess.UNSAFE;
        int iArrayIndexScale = unsafe.arrayIndexScale(Object[].class);
        if (4 == iArrayIndexScale) {
            REF_ELEMENT_SHIFT = 2;
        } else {
            if (8 != iArrayIndexScale) {
                throw new IllegalStateException("Unknown pointer size");
            }
            REF_ELEMENT_SHIFT = 3;
        }
        REF_ARRAY_BASE = unsafe.arrayBaseOffset(Object[].class);
    }

    public static long calcElementOffset(long j) {
        return REF_ARRAY_BASE + (j << REF_ELEMENT_SHIFT);
    }

    public static <E> E lpElement(E[] eArr, long j) {
        return (E) UnsafeAccess.UNSAFE.getObject(eArr, j);
    }

    public static <E> E lvElement(E[] eArr, long j) {
        return (E) UnsafeAccess.UNSAFE.getObjectVolatile(eArr, j);
    }

    public static <E> void soElement(E[] eArr, long j, E e) {
        UnsafeAccess.UNSAFE.putOrderedObject(eArr, j, e);
    }

    public static <E> void spElement(E[] eArr, long j, E e) {
        UnsafeAccess.UNSAFE.putObject(eArr, j, e);
    }
}
