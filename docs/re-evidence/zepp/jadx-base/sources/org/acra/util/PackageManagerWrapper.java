package org.acra.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.acra.ACRA;

/* JADX INFO: loaded from: classes23.dex */
public final class PackageManagerWrapper {

    @NonNull
    private final Context a;

    public PackageManagerWrapper(@NonNull Context context) {
        this.a = context;
    }

    @Nullable
    public PackageInfo getPackageInfo() {
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(this.a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            ACRA.log.w(ACRA.LOG_TAG, "Failed to find PackageInfo for current App : " + this.a.getPackageName());
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    public boolean hasPermission(@NonNull String str) {
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        try {
            return packageManager.checkPermission(str, this.a.getPackageName()) == 0;
        } catch (Exception unused) {
            return false;
        }
    }
}
