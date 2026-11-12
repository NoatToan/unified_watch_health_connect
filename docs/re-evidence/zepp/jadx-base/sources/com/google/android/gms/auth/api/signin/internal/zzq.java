package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
public final class zzq {

    @Nullable
    private static zzq d;

    @VisibleForTesting
    private Storage a;

    @Nullable
    @VisibleForTesting
    private GoogleSignInAccount b;

    @Nullable
    @VisibleForTesting
    private GoogleSignInOptions c;

    private zzq(Context context) {
        Storage storage = Storage.getInstance(context);
        this.a = storage;
        this.b = storage.getSavedDefaultGoogleSignInAccount();
        this.c = this.a.getSavedDefaultGoogleSignInOptions();
    }

    private static synchronized zzq a(Context context) {
        zzq zzqVar = d;
        if (zzqVar != null) {
            return zzqVar;
        }
        zzq zzqVar2 = new zzq(context);
        d = zzqVar2;
        return zzqVar2;
    }

    public static synchronized zzq zzd(@NonNull Context context) {
        return a(context.getApplicationContext());
    }

    public final synchronized void clear() {
        this.a.clear();
        this.b = null;
        this.c = null;
    }

    public final synchronized void zzc(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.a.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
        this.b = googleSignInAccount;
        this.c = googleSignInOptions;
    }

    @Nullable
    public final synchronized GoogleSignInAccount zzr() {
        return this.b;
    }

    @Nullable
    public final synchronized GoogleSignInOptions zzs() {
        return this.c;
    }
}
