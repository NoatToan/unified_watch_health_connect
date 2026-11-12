package com.google.android.gms.fitness;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.PlatformVersion;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
public final class zzg implements Api.ApiOptions.HasGoogleSignInAccountOptions {

    @Nullable
    private final GoogleSignInAccount a;

    public zzg(Context context, GoogleSignInAccount googleSignInAccount) {
        if ("<<default account>>".equals(googleSignInAccount.getEmail())) {
            if (PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google")) {
                this.a = null;
                return;
            }
        }
        this.a = googleSignInAccount;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != this) {
            return (obj instanceof zzg) && Objects.equal(((zzg) obj).a, this.a);
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions
    @Nullable
    public final GoogleSignInAccount getGoogleSignInAccount() {
        return this.a;
    }

    public final int hashCode() {
        GoogleSignInAccount googleSignInAccount = this.a;
        if (googleSignInAccount != null) {
            return googleSignInAccount.hashCode();
        }
        return 0;
    }
}
