package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zaco {
    public static final Status zaa = new Status(8, "The connection to Google Play services was lost");

    @VisibleForTesting
    public final Set<BasePendingResult<?>> a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final v0 b = new w0(this);

    public final void a(BasePendingResult<? extends Result> basePendingResult) {
        this.a.add(basePendingResult);
        basePendingResult.zaa(this.b);
    }

    public final void zaa() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.a.toArray(new BasePendingResult[0])) {
            basePendingResult.zaa((v0) null);
            if (basePendingResult.zaa()) {
                this.a.remove(basePendingResult);
            }
        }
    }
}
