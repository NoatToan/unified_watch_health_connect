package com.google.android.gms.auth.api.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public class GoogleSignInResult implements Result {
    private Status a;

    @Nullable
    private GoogleSignInAccount b;

    public GoogleSignInResult(@Nullable GoogleSignInAccount googleSignInAccount, @NonNull Status status) {
        this.b = googleSignInAccount;
        this.a = status;
    }

    @Nullable
    public GoogleSignInAccount getSignInAccount() {
        return this.b;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    public Status getStatus() {
        return this.a;
    }

    public boolean isSuccess() {
        return this.a.isSuccess();
    }
}
