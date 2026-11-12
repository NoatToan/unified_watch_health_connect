package com.google.android.gms.auth;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {
    private final int b;

    public GooglePlayServicesAvailabilityException(int i, String str, Intent intent) {
        super(str, intent);
        this.b = i;
    }

    public int getConnectionStatusCode() {
        return this.b;
    }
}
