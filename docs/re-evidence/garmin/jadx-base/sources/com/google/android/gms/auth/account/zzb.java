package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzb extends com.google.android.gms.internal.auth.zzb implements zza {
    public zzb() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean dispatchTransaction(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 == 1) {
            zzc((Account) com.google.android.gms.internal.auth.zzc.zza(parcel, Account.CREATOR));
        } else {
            if (i14 != 2) {
                return false;
            }
            zza(com.google.android.gms.internal.auth.zzc.zza(parcel));
        }
        return true;
    }
}
