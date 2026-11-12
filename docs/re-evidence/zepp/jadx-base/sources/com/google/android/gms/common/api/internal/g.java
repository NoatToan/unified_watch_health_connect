package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
final class g extends s {
    private final /* synthetic */ ConnectionResult b;
    private final /* synthetic */ d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, zaaw zaawVar, ConnectionResult connectionResult) {
        super(zaawVar);
        this.c = dVar;
        this.b = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.s
    @GuardedBy("mLock")
    public final void a() {
        this.c.c.j(this.b);
    }
}
