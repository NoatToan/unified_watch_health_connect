package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzr extends com.google.android.gms.internal.p000authapi.zzd implements zzq {
    public zzr() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzd
    public final boolean dispatchTransaction(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 == 1) {
            zzj();
        } else {
            if (i14 != 2) {
                return false;
            }
            zzk();
        }
        return true;
    }
}
