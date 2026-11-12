package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class z0 implements Runnable {
    private final x0 a;
    public final /* synthetic */ zal b;

    public z0(zal zalVar, x0 x0Var) {
        this.b = zalVar;
        this.a = x0Var;
    }

    @Override // java.lang.Runnable
    @MainThread
    public final void run() {
        if (this.b.zaa) {
            ConnectionResult connectionResultB = this.a.b();
            if (connectionResultB.hasResolution()) {
                zal zalVar = this.b;
                zalVar.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(zalVar.getActivity(), (PendingIntent) Preconditions.checkNotNull(connectionResultB.getResolution()), this.a.a(), false), 1);
                return;
            }
            zal zalVar2 = this.b;
            if (zalVar2.zac.getErrorResolutionIntent(zalVar2.getActivity(), connectionResultB.getErrorCode(), null) != null) {
                zal zalVar3 = this.b;
                zalVar3.zac.zaa(zalVar3.getActivity(), this.b.mLifecycleFragment, connectionResultB.getErrorCode(), 2, this.b);
            } else {
                if (connectionResultB.getErrorCode() != 18) {
                    this.b.zaa(connectionResultB, this.a.a());
                    return;
                }
                Dialog dialogZaa = GoogleApiAvailability.zaa(this.b.getActivity(), this.b);
                zal zalVar4 = this.b;
                zalVar4.zac.zaa(zalVar4.getActivity().getApplicationContext(), new y0(this, dialogZaa));
            }
        }
    }
}
