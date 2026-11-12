package com.nimbusds.jose.shaded.gson.internal;

import vb.h;

/* JADX INFO: renamed from: com.nimbusds.jose.shaded.gson.internal.$Gson$Preconditions, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C$Gson$Preconditions {
    private C$Gson$Preconditions() {
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
