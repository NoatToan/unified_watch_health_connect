package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import i3.e5;
import j20.x;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class CollectPreconditions {
    public static void checkEntryNotNull(Object obj, Object obj2) {
        if (obj == null) {
            x.l(e5.f(obj2, "null key in entry: null="));
        } else {
            if (obj2 != null) {
                return;
            }
            x.l(org.apache.commons.lang3.e.f("null value in entry: ", "=null", obj));
        }
    }

    @CanIgnoreReturnValue
    public static long checkNonnegative(long j8, String str) {
        if (j8 >= 0) {
            return j8;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + j8);
    }

    public static void checkPositive(int i14, String str) {
        if (i14 > 0) {
            return;
        }
        vb.h.s(vb.h.h(i14, str, " must be positive but was: "));
    }

    public static void checkRemove(boolean z14) {
        Preconditions.checkState(z14, "no calls to next() since the last call to remove()");
    }

    @CanIgnoreReturnValue
    public static int checkNonnegative(int i14, String str) {
        if (i14 >= 0) {
            return i14;
        }
        vb.h.s(vb.h.h(i14, str, " cannot be negative but was: "));
        return 0;
    }
}
