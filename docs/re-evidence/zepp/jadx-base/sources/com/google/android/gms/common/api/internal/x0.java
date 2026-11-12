package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class x0 {
    private final int a;
    private final ConnectionResult b;

    public x0(ConnectionResult connectionResult, int i) {
        Preconditions.checkNotNull(connectionResult);
        this.b = connectionResult;
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final ConnectionResult b() {
        return this.b;
    }
}
