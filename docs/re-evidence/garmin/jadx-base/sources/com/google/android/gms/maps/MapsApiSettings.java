package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.zzcc;

/* JADX INFO: loaded from: classes14.dex */
public final class MapsApiSettings {
    private static final String zza = "MapsApiSettings";

    private MapsApiSettings() {
    }

    public static void addInternalUsageAttributionId(Context context, String str) {
        try {
            zzcc.zza(context, null).zzk(ObjectWrapper.wrap(context), str);
        } catch (RemoteException | GooglePlayServicesNotAvailableException unused) {
        }
    }
}
