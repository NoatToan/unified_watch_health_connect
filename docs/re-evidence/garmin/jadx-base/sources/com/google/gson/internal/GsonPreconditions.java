package com.google.gson.internal;

import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class GsonPreconditions {
    private GsonPreconditions() {
        throw new UnsupportedOperationException();
    }

    public static void checkArgument(boolean z14) {
        if (z14) {
            return;
        }
        h.w();
    }

    @Deprecated
    public static <T> T checkNotNull(T t7) {
        t7.getClass();
        return t7;
    }
}
