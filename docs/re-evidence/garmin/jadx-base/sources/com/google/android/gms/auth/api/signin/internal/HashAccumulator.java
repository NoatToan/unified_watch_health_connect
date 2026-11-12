package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public class HashAccumulator {
    private int zaa = 1;

    @CanIgnoreReturnValue
    @KeepForSdk
    public HashAccumulator addObject(Object obj) {
        this.zaa = (this.zaa * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    public int hash() {
        return this.zaa;
    }

    @CanIgnoreReturnValue
    public final HashAccumulator zaa(boolean z14) {
        this.zaa = (this.zaa * 31) + (z14 ? 1 : 0);
        return this;
    }
}
