package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
class o {
    private static final o d = new o(true, null, null);
    public final boolean a;

    @Nullable
    public final String b;

    @Nullable
    public final Throwable c;

    public o(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.a = z;
        this.b = str;
        this.c = th;
    }

    public static o b() {
        return d;
    }

    public static o c(@NonNull String str) {
        return new o(false, str, null);
    }

    public static o d(@NonNull String str, @NonNull Throwable th) {
        return new o(false, str, th);
    }

    @Nullable
    public String a() {
        return this.b;
    }

    public final void e() {
        if (this.a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
