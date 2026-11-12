package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class Storage {
    private static final Lock c = new ReentrantLock();

    @Nullable
    @GuardedBy("sLk")
    private static Storage d;
    private final Lock a = new ReentrantLock();

    @GuardedBy("mLk")
    private final SharedPreferences b;

    @VisibleForTesting
    private Storage(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @Nullable
    @VisibleForTesting
    private final GoogleSignInAccount a(@Nullable String str) {
        String strE;
        if (!TextUtils.isEmpty(str) && (strE = e(d("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.zaa(strE);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private final void b(String str, String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }

    @Nullable
    @VisibleForTesting
    private final GoogleSignInOptions c(@Nullable String str) {
        String strE;
        if (!TextUtils.isEmpty(str) && (strE = e(d("googleSignInOptions", str))) != null) {
            try {
                return GoogleSignInOptions.zaa(strE);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private static String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @Nullable
    private final String e(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    private final void f(String str) {
        this.a.lock();
        try {
            this.b.edit().remove(str).apply();
        } finally {
            this.a.unlock();
        }
    }

    @RecentlyNonNull
    @KeepForSdk
    public static Storage getInstance(@RecentlyNonNull Context context) {
        Preconditions.checkNotNull(context);
        c.lock();
        try {
            if (d == null) {
                d = new Storage(context.getApplicationContext());
            }
            return d;
        } finally {
            c.unlock();
        }
    }

    @KeepForSdk
    public void clear() {
        this.a.lock();
        try {
            this.b.edit().clear().apply();
        } finally {
            this.a.unlock();
        }
    }

    @RecentlyNullable
    @KeepForSdk
    public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        return a(e("defaultGoogleSignInAccount"));
    }

    @RecentlyNullable
    @KeepForSdk
    public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        return c(e("defaultGoogleSignInAccount"));
    }

    @RecentlyNullable
    @KeepForSdk
    public String getSavedRefreshToken() {
        return e("refreshToken");
    }

    @KeepForSdk
    public void saveDefaultGoogleSignInAccount(@RecentlyNonNull GoogleSignInAccount googleSignInAccount, @RecentlyNonNull GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        b("defaultGoogleSignInAccount", googleSignInAccount.zaa());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String strZaa = googleSignInAccount.zaa();
        b(d("googleSignInAccount", strZaa), googleSignInAccount.zab());
        b(d("googleSignInOptions", strZaa), googleSignInOptions.zaa());
    }

    public final void zaa() {
        String strE = e("defaultGoogleSignInAccount");
        f("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        f(d("googleSignInAccount", strE));
        f(d("googleSignInOptions", strE));
    }
}
