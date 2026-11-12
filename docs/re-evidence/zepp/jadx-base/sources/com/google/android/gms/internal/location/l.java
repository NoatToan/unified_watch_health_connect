package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationSettingsResult;

/* JADX INFO: loaded from: classes3.dex */
final class l extends zzan {
    private BaseImplementation.ResultHolder<LocationSettingsResult> a;

    public l(BaseImplementation.ResultHolder<LocationSettingsResult> resultHolder) {
        Preconditions.checkArgument(resultHolder != null, "listener can't be null.");
        this.a = resultHolder;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(LocationSettingsResult locationSettingsResult) throws RemoteException {
        this.a.setResult(locationSettingsResult);
        this.a = null;
    }
}
