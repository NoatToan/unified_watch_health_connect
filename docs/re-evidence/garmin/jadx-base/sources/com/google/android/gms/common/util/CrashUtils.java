package com.google.android.gms.common.util;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public final class CrashUtils {
    private static final String[] zza = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @KeepForSdk
    public static boolean addDynamiteErrorToDropBox(Context context, Throwable th3) {
        try {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(th3);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
