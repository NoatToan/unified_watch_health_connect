package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public final class CallbackExecutor {
    private CallbackExecutor() {
    }

    @KeepForSdk
    public static ExecutorService executorService() {
        return zzi.zza;
    }
}
