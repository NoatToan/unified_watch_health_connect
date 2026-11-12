package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class LifecycleActivity {
    private final Object a;

    public LifecycleActivity(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.a = activity;
    }

    @NonNull
    public final Activity zza() {
        return (Activity) this.a;
    }

    @NonNull
    public final FragmentActivity zzb() {
        return (FragmentActivity) this.a;
    }

    public final boolean zzc() {
        return this.a instanceof Activity;
    }

    public final boolean zzd() {
        return this.a instanceof FragmentActivity;
    }

    @KeepForSdk
    public LifecycleActivity(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
