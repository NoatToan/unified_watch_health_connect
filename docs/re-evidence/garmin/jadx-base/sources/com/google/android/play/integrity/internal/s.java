package com.google.android.play.integrity.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import i3.e5;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53446a;

    public s(String str) {
        this.f53446a = am.j.g(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    private static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(String.valueOf(str2));
                str2 = com.nimbusds.jose.shaded.gson.internal.a.h(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return e5.g(str, " : ", str2);
    }

    public final int a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", f(this.f53446a, str, objArr));
        }
        return 0;
    }

    public final int b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.f53446a, str, objArr));
        }
        return 0;
    }

    public final int c(Throwable th3, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.f53446a, str, objArr), th3);
        }
        return 0;
    }

    public final int d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", f(this.f53446a, str, objArr));
        }
        return 0;
    }

    public final int e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", f(this.f53446a, str, objArr));
        }
        return 0;
    }
}
