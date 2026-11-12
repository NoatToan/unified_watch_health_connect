package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class HashAccumulator {

    @VisibleForTesting
    private static int b = 31;
    private int a = 1;

    @RecentlyNonNull
    @KeepForSdk
    public HashAccumulator addObject(@Nullable Object obj) {
        this.a = (b * this.a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    public int hash() {
        return this.a;
    }

    @RecentlyNonNull
    public final HashAccumulator zaa(boolean z) {
        this.a = (b * this.a) + (z ? 1 : 0);
        return this;
    }
}
