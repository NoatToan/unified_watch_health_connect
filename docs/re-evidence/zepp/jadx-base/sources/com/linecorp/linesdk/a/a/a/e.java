package com.linecorp.linesdk.a.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.mipush.sdk.Constants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
final class e {

    @Nullable
    private final PackageInfo a;

    @NonNull
    private final String b;

    @Nullable
    private String c;

    public e(@NonNull Context context, @NonNull String str) {
        this.a = a(context);
        this.b = str;
    }

    @Nullable
    private static PackageInfo a(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            throw null;
        }
    }

    @NonNull
    public final String b() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        PackageInfo packageInfo = this.a;
        String str2 = packageInfo == null ? "UNK" : packageInfo.packageName;
        String str3 = packageInfo != null ? packageInfo.versionName : "UNK";
        Locale locale = Locale.getDefault();
        String str4 = str2 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str3 + " ChannelSDK/" + this.b + " (Linux; U; Android " + Build.VERSION.RELEASE + "; " + locale.getLanguage() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + locale.getCountry() + "; " + Build.MODEL + " Build/" + Build.ID + ")";
        this.c = str4;
        return str4;
    }
}
