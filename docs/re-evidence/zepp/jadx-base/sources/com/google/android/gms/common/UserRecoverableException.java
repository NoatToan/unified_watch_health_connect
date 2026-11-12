package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class UserRecoverableException extends Exception {
    private final Intent a;

    public UserRecoverableException(@NonNull String str, @NonNull Intent intent) {
        super(str);
        this.a = intent;
    }

    @NonNull
    public Intent getIntent() {
        return new Intent(this.a);
    }
}
