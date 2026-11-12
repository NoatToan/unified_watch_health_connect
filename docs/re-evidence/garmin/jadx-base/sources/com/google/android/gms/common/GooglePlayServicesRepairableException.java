package com.google.android.gms.common;

import android.content.Intent;

/* JADX INFO: loaded from: classes14.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i14, String str, Intent intent) {
        super(str, intent);
        this.zza = i14;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
