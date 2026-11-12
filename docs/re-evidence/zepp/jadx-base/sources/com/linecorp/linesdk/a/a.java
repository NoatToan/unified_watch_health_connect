package com.linecorp.linesdk.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes18.dex */
public final class a {

    @NonNull
    private final Context a;

    @NonNull
    private final String b;

    @NonNull
    private final com.linecorp.a.a.a.b c;

    public a(@NonNull Context context, @NonNull String str) {
        this(context.getApplicationContext(), str, c.a());
    }

    @Nullable
    private String c(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.c.b(this.a, str);
    }

    private long d(@Nullable String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.valueOf(this.c.b(this.a, str)).longValue();
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void a() {
        this.a.getSharedPreferences(this.b, 0).edit().clear().apply();
    }

    @Nullable
    public final d b() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences(this.b, 0);
        try {
            String strC = c(sharedPreferences.getString("accessToken", null));
            long jD = d(sharedPreferences.getString("expiresIn", null));
            long jD2 = d(sharedPreferences.getString("issuedClientTime", null));
            if (TextUtils.isEmpty(strC) || jD == -1 || jD2 == -1) {
                return null;
            }
            String strC2 = c(sharedPreferences.getString("refreshToken", null));
            if (strC2 == null) {
                strC2 = "";
            }
            return new d(strC, jD, jD2, strC2);
        } catch (com.linecorp.a.a.a.a unused) {
            a();
            return null;
        }
    }

    @VisibleForTesting
    private a(@NonNull Context context, @NonNull String str, @NonNull com.linecorp.a.a.a.b bVar) {
        this.a = context;
        this.b = "com.linecorp.linesdk.accesstoken." + str;
        this.c = bVar;
    }

    public final void a(@NonNull d dVar) {
        this.a.getSharedPreferences(this.b, 0).edit().putString("accessToken", b(dVar.a)).putString("expiresIn", a(dVar.b)).putString("issuedClientTime", a(dVar.c)).putString("refreshToken", b(dVar.d)).apply();
    }

    @NonNull
    private String b(@NonNull String str) {
        return this.c.a(this.a, str);
    }

    @NonNull
    private String a(long j) {
        return this.c.a(this.a, String.valueOf(j));
    }
}
