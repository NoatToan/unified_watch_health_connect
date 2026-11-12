package com.huami.watch.util;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class StringUtil {
    private static final String a = "Util-String";

    @Nullable
    public static String toString(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }
}
