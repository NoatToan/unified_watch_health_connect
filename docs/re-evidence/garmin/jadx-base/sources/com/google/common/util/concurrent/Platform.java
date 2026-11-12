package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
final class Platform {
    private Platform() {
    }

    public static boolean isInstanceOfThrowableClass(Throwable th3, Class<? extends Throwable> cls) {
        return cls.isInstance(th3);
    }

    public static void restoreInterruptIfIsInterruptedException(Throwable th3) {
        Preconditions.checkNotNull(th3);
        if (th3 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
