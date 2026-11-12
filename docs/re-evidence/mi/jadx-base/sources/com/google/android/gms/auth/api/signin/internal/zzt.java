package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzt extends com.google.android.gms.internal.p001authapi.zzd implements zzs {
    public zzt() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p001authapi.zzd
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                zzc((GoogleSignInAccount) com.google.android.gms.internal.p001authapi.zze.zzc(parcel, GoogleSignInAccount.CREATOR), (Status) com.google.android.gms.internal.p001authapi.zze.zzc(parcel, Status.CREATOR));
                break;
            case 102:
                zze((Status) com.google.android.gms.internal.p001authapi.zze.zzc(parcel, Status.CREATOR));
                break;
            case 103:
                zzf((Status) com.google.android.gms.internal.p001authapi.zze.zzc(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
