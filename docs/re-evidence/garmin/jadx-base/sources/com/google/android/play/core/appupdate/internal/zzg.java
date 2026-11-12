package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzg extends zzb implements zzh {
    public zzg() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // com.google.android.play.core.appupdate.internal.zzb
    public final boolean zza(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 == 2) {
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            zzc(bundle);
            return true;
        }
        if (i14 != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
        zzc.zzb(parcel);
        zzb(bundle2);
        return true;
    }
}
