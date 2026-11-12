package com.google.android.gms.internal.p000authapi;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* JADX INFO: loaded from: classes3.dex */
public interface zzai extends IInterface {
    void zzc(IStatusCallback iStatusCallback, String str) throws RemoteException;

    void zzc(zzaa zzaaVar, BeginSignInRequest beginSignInRequest) throws RemoteException;

    void zzc(zzae zzaeVar, GetSignInIntentRequest getSignInIntentRequest) throws RemoteException;
}
