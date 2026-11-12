package com.google.android.gms.internal.p000authapi;

import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class zzg implements CredentialRequestResult {
    private final Status a;

    @Nullable
    private final Credential b;

    public zzg(Status status, @Nullable Credential credential) {
        this.a = status;
        this.b = credential;
    }

    public static zzg zzc(Status status) {
        return new zzg(status, null);
    }

    @Override // com.google.android.gms.auth.api.credentials.CredentialRequestResult
    @Nullable
    public final Credential getCredential() {
        return this.b;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.a;
    }
}
