package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import i3.e5;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public class Storage {
    private static final Lock zaa = new ReentrantLock();

    @GuardedBy("sLk")
    private static Storage zab;
    private final Lock zac = new ReentrantLock();

    @GuardedBy("mLk")
    private final SharedPreferences zad;

    public Storage(Context context) {
        this.zad = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @KeepForSdk
    public static Storage getInstance(Context context) {
        Preconditions.checkNotNull(context);
        zaa.lock();
        try {
            if (zab == null) {
                zab = new Storage(context.getApplicationContext());
            }
            return zab;
        } finally {
            zaa.unlock();
        }
    }

    private static final String zae(String str, String str2) {
        return e5.g(str, ":", str2);
    }

    @KeepForSdk
    public void clear() {
        this.zac.lock();
        try {
            this.zad.edit().clear().apply();
        } finally {
            this.zac.unlock();
        }
    }

    @KeepForSdk
    public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        String strZaa;
        String strZaa2 = zaa("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strZaa2) && (strZaa = zaa(zae("googleSignInAccount", strZaa2))) != null) {
            try {
                return GoogleSignInAccount.zab(strZaa);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @KeepForSdk
    public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        String strZaa;
        String strZaa2 = zaa("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strZaa2) && (strZaa = zaa(zae("googleSignInOptions", strZaa2))) != null) {
            try {
                return GoogleSignInOptions.zab(strZaa);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @KeepForSdk
    public String getSavedRefreshToken() {
        return zaa("refreshToken");
    }

    @KeepForSdk
    public void saveDefaultGoogleSignInAccount(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        zad("defaultGoogleSignInAccount", googleSignInAccount.zac());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String strZac = googleSignInAccount.zac();
        zad(zae("googleSignInAccount", strZac), googleSignInAccount.zad());
        zad(zae("googleSignInOptions", strZac), googleSignInOptions.zaf());
    }

    public final String zaa(String str) {
        this.zac.lock();
        try {
            return this.zad.getString(str, null);
        } finally {
            this.zac.unlock();
        }
    }

    public final void zab(String str) {
        this.zac.lock();
        try {
            this.zad.edit().remove(str).apply();
        } finally {
            this.zac.unlock();
        }
    }

    public final void zac() {
        String strZaa = zaa("defaultGoogleSignInAccount");
        zab("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strZaa)) {
            return;
        }
        zab(zae("googleSignInAccount", strZaa));
        zab(zae("googleSignInOptions", strZaa));
    }

    public final void zad(String str, String str2) {
        this.zac.lock();
        try {
            this.zad.edit().putString(str, str2).apply();
        } finally {
            this.zac.unlock();
        }
    }
}
