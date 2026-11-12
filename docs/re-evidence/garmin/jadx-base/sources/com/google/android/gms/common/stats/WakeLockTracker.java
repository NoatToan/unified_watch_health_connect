package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
@Deprecated
public class WakeLockTracker {
    private static final WakeLockTracker zza = new WakeLockTracker();

    @KeepForSdk
    public static WakeLockTracker getInstance() {
        return zza;
    }

    @KeepForSdk
    public void registerAcquireEvent(Context context, Intent intent, String str, String str2, String str3, int i14, String str4) {
    }

    @KeepForSdk
    public void registerDeadlineEvent(Context context, String str, String str2, String str3, int i14, List<String> list, boolean z14, long j8) {
    }

    @KeepForSdk
    public void registerEvent(Context context, String str, int i14, String str2, String str3, String str4, int i15, List<String> list) {
    }

    @KeepForSdk
    public void registerEvent(Context context, String str, int i14, String str2, String str3, String str4, int i15, List<String> list, long j8) {
    }

    @KeepForSdk
    public void registerReleaseEvent(Context context, Intent intent) {
    }
}
