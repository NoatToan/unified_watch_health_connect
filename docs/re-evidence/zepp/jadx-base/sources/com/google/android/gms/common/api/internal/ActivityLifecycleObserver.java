package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public abstract class ActivityLifecycleObserver {
    @RecentlyNonNull
    @KeepForSdk
    public static final ActivityLifecycleObserver of(@RecentlyNonNull Activity activity) {
        return new zaa(activity);
    }

    @RecentlyNonNull
    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(@RecentlyNonNull Runnable runnable);
}
