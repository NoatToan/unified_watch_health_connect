package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
final class e implements BaseGmsClient.ConnectionProgressReportCallbacks {
    private final WeakReference<zaaf> a;
    private final Api<?> b;
    private final boolean c;

    public e(zaaf zaafVar, Api<?> api, boolean z) {
        this.a = new WeakReference<>(zaafVar);
        this.b = api;
        this.c = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
        zaaf zaafVar = this.a.get();
        if (zaafVar == null) {
            return;
        }
        Preconditions.checkState(Looper.myLooper() == zaafVar.a.n.getLooper(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        zaafVar.b.lock();
        try {
            if (zaafVar.l(0)) {
                if (!connectionResult.isSuccess()) {
                    zaafVar.k(connectionResult, this.b, this.c);
                }
                if (zaafVar.q()) {
                    zaafVar.r();
                }
            }
        } finally {
            zaafVar.b.unlock();
        }
    }
}
