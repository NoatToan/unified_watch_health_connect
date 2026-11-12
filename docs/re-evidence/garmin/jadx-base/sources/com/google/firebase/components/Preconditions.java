package com.google.firebase.components;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j20.x;

/* JADX INFO: loaded from: classes2.dex */
public final class Preconditions {
    public static void checkArgument(boolean z14, String str) {
        if (z14) {
            return;
        }
        vb.h.s(str);
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str) {
        if (t7 != null) {
            return t7;
        }
        x.l(str);
        return null;
    }

    public static void checkState(boolean z14, String str) {
        if (z14) {
            return;
        }
        vb.h.z(str);
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7) {
        t7.getClass();
        return t7;
    }
}
