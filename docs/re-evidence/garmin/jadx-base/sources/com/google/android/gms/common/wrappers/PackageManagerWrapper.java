package com.google.android.gms.common.wrappers;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import k7.d;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public class PackageManagerWrapper {
    protected final Context zza;

    public PackageManagerWrapper(Context context) {
        this.zza = context;
    }

    @KeepForSdk
    public int checkCallingOrSelfPermission(String str) {
        return this.zza.checkCallingOrSelfPermission(str);
    }

    @KeepForSdk
    public int checkPermission(String str, String str2) {
        return this.zza.getPackageManager().checkPermission(str, str2);
    }

    @KeepForSdk
    public ApplicationInfo getApplicationInfo(String str, int i14) {
        return this.zza.getPackageManager().getApplicationInfo(str, i14);
    }

    @KeepForSdk
    public CharSequence getApplicationLabel(String str) {
        Context context = this.zza;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @KeepForSdk
    public d<CharSequence, Drawable> getApplicationLabelAndIcon(String str) throws PackageManager.NameNotFoundException {
        Context context = this.zza;
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
        return new d<>(context.getPackageManager().getApplicationLabel(applicationInfo), context.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @KeepForSdk
    public PackageInfo getPackageInfo(String str, int i14) {
        return this.zza.getPackageManager().getPackageInfo(str, i14);
    }

    @KeepForSdk
    public String[] getPackagesForUid(int i14) {
        return this.zza.getPackageManager().getPackagesForUid(i14);
    }

    @KeepForSdk
    public boolean isCallerInstantApp() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.isInstantApp(this.zza);
        }
        if (!PlatformVersion.isAtLeastO()) {
            return false;
        }
        Context context = this.zza;
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    public final boolean zza(int i14, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.zza.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i14, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
