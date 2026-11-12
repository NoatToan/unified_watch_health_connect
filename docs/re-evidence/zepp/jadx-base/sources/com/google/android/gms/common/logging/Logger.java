package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class Logger {
    private final String a;
    private final String b;
    private final GmsLogger c;
    private final int d;

    @KeepForSdk
    public Logger(@NonNull String str, @NonNull String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(JsonLexerKt.BEGIN_LIST);
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.b = string;
        this.a = str;
        this.c = new GmsLogger(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.a, i)) {
            i++;
        }
        this.d = i;
    }

    @KeepForSdk
    public void d(@NonNull String str, @Nullable Object... objArr) {
        if (isLoggable(3)) {
            Log.d(this.a, format(str, objArr));
        }
    }

    @KeepForSdk
    public void e(@NonNull String str, @NonNull Throwable th, @Nullable Object... objArr) {
        Log.e(this.a, format(str, objArr), th);
    }

    @NonNull
    @KeepForSdk
    public String format(@NonNull String str, @Nullable Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }

    @NonNull
    @KeepForSdk
    public String getTag() {
        return this.a;
    }

    @KeepForSdk
    public void i(@NonNull String str, @Nullable Object... objArr) {
        Log.i(this.a, format(str, objArr));
    }

    @KeepForSdk
    public boolean isLoggable(int i) {
        return this.d <= i;
    }

    @KeepForSdk
    public void v(@NonNull String str, @NonNull Throwable th, @Nullable Object... objArr) {
        if (isLoggable(2)) {
            Log.v(this.a, format(str, objArr), th);
        }
    }

    @KeepForSdk
    public void w(@NonNull String str, @Nullable Object... objArr) {
        Log.w(this.a, format(str, objArr));
    }

    @KeepForSdk
    public void wtf(@NonNull String str, @NonNull Throwable th, @Nullable Object... objArr) {
        Log.wtf(this.a, format(str, objArr), th);
    }

    @KeepForSdk
    public void e(@NonNull String str, @Nullable Object... objArr) {
        Log.e(this.a, format(str, objArr));
    }

    @KeepForSdk
    public void wtf(@NonNull Throwable th) {
        Log.wtf(this.a, th);
    }

    @KeepForSdk
    public void v(@NonNull String str, @Nullable Object... objArr) {
        if (isLoggable(2)) {
            Log.v(this.a, format(str, objArr));
        }
    }
}
