package com.google.android.exoplayer2.upstream.crypto;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class a {
    private a() {
    }

    public static long a(@Nullable String input) {
        long j = 0;
        if (input == null) {
            return 0L;
        }
        for (int i = 0; i < input.length(); i++) {
            long jCharAt = j ^ ((long) input.charAt(i));
            j = jCharAt + (jCharAt << 1) + (jCharAt << 4) + (jCharAt << 5) + (jCharAt << 7) + (jCharAt << 8) + (jCharAt << 40);
        }
        return j;
    }
}
