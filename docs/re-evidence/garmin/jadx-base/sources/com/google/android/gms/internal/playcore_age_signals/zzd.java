package com.google.android.gms.internal.playcore_age_signals;

import am.j;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.nimbusds.jose.shaded.gson.internal.a;
import i3.e5;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public final class zzd {
    private final String zza;

    public zzd(String str) {
        this.zza = j.g(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    private static String zze(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(String.valueOf(str2));
                str2 = a.h(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return e5.g(str, " : ", str2);
    }

    public final int zza(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", zze(this.zza, "onError(%d)", objArr));
        }
        return 0;
    }

    public final int zzb(Throwable th3, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", zze(this.zza, str, objArr), th3);
        }
        return 0;
    }

    public final int zzc(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzd(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }
}
