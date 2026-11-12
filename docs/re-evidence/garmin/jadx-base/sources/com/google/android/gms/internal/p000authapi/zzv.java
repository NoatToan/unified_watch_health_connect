package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzv extends zzd implements zzu {
    public zzv() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzd
    public final boolean dispatchTransaction(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 == 1) {
            zzc((Status) zze.zzc(parcel, Status.CREATOR), (Credential) zze.zzc(parcel, Credential.CREATOR));
        } else if (i14 == 2) {
            zzc((Status) zze.zzc(parcel, Status.CREATOR));
        } else {
            if (i14 != 3) {
                return false;
            }
            zzc((Status) zze.zzc(parcel, Status.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
