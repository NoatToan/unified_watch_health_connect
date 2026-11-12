package io.netty.util.internal.shaded.org.jctools.queues;

import io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess;

/* JADX INFO: loaded from: classes2.dex */
final class LinkedArrayQueueUtil {
    private LinkedArrayQueueUtil() {
    }

    public static int length(Object[] objArr) {
        return objArr.length;
    }

    public static long modifiedCalcElementOffset(long j, long j2) {
        return UnsafeRefArrayAccess.REF_ARRAY_BASE + ((j & j2) << (UnsafeRefArrayAccess.REF_ELEMENT_SHIFT - 1));
    }

    public static long nextArrayOffset(Object[] objArr) {
        return UnsafeRefArrayAccess.REF_ARRAY_BASE + (((long) (length(objArr) - 1)) << UnsafeRefArrayAccess.REF_ELEMENT_SHIFT);
    }
}
