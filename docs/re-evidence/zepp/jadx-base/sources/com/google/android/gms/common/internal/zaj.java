package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes3.dex */
public final class zaj {
    private final SparseIntArray a;
    private GoogleApiAvailabilityLight b;

    public zaj() {
        this(GoogleApiAvailability.getInstance());
    }

    public final int zaa(@NonNull Context context, @NonNull Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int iIsGooglePlayServicesAvailable = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int iZaa = zaa(context, minApkVersion);
        if (iZaa != -1) {
            return iZaa;
        }
        int i = 0;
        while (true) {
            if (i >= this.a.size()) {
                iIsGooglePlayServicesAvailable = iZaa;
                break;
            }
            int iKeyAt = this.a.keyAt(i);
            if (iKeyAt > minApkVersion && this.a.get(iKeyAt) == 0) {
                break;
            }
            i++;
        }
        if (iIsGooglePlayServicesAvailable == -1) {
            iIsGooglePlayServicesAvailable = this.b.isGooglePlayServicesAvailable(context, minApkVersion);
        }
        this.a.put(minApkVersion, iIsGooglePlayServicesAvailable);
        return iIsGooglePlayServicesAvailable;
    }

    public zaj(@NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.a = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.b = googleApiAvailabilityLight;
    }

    public final int zaa(Context context, int i) {
        return this.a.get(i, -1);
    }

    public final void zaa() {
        this.a.clear();
    }
}
