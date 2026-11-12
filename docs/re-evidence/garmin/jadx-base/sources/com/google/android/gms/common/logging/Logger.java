package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public class Logger {
    private final String zza;
    private final String zzb;
    private final GmsLogger zzc;
    private final int zzd;

    @KeepForSdk
    public Logger(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            string = sb3.toString();
        }
        this.zzb = string;
        this.zza = str;
        this.zzc = new GmsLogger(str);
        int i14 = 2;
        while (i14 <= 7 && !Log.isLoggable(this.zza, i14)) {
            i14++;
        }
        this.zzd = i14;
    }

    @KeepForSdk
    public void d(String str, Object... objArr) {
        if (isLoggable(3)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    public void e(String str, Throwable th3, Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public String format(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.zzb.concat(str);
    }

    @KeepForSdk
    public String getTag() {
        return this.zza;
    }

    @KeepForSdk
    public void i(String str, Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public boolean isLoggable(int i14) {
        return this.zzd <= i14;
    }

    @KeepForSdk
    public void v(String str, Throwable th3, Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    public void w(String str, Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public void wtf(String str, Throwable th3, Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public void e(String str, Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public void wtf(Throwable th3) {
    }

    @KeepForSdk
    public void v(String str, Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }
}
