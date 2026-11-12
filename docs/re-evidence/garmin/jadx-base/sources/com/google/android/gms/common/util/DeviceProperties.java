package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.androidbrowserhelper.trusted.ChromeOsSupport;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public final class DeviceProperties {
    private static Boolean zza;
    private static Boolean zzb;
    private static Boolean zzc;
    private static Boolean zzd;
    private static Boolean zze;
    private static Boolean zzf;
    private static Boolean zzg;
    private static Boolean zzh;
    private static Boolean zzi;
    private static Boolean zzj;
    private static Boolean zzk;
    private static Boolean zzl;
    private static Boolean zzm;
    private static Boolean zzn;
    private static Boolean zzo;
    private static Boolean zzp;
    private static Boolean zzq;

    private DeviceProperties() {
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isAuto(Context context) {
        return zze(context.getPackageManager());
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isBstar(Context context) {
        if (zzo == null) {
            boolean z14 = false;
            if (PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z14 = true;
            }
            zzo = Boolean.valueOf(z14);
        }
        return zzo.booleanValue();
    }

    @KeepForSdk
    public static boolean isFoldable(Context context) {
        if (zzd == null) {
            boolean z14 = false;
            if (PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle")) {
                z14 = true;
            }
            zzd = Boolean.valueOf(z14);
        }
        return zzd.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(Context context) {
        if (zzh == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z14 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z14 = true;
            }
            zzh = Boolean.valueOf(z14);
        }
        return zzh.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    @KeepForSdk
    public static boolean isPhone(Context context) {
        if (zza == null) {
            boolean z14 = true;
            if (!isFoldable(context)) {
                if (isTablet(context) || isWearable(context) || zzd(context)) {
                    z14 = false;
                } else {
                    if (zzk == null) {
                        zzk = Boolean.valueOf(context.getPackageManager().hasSystemFeature(ChromeOsSupport.ARC_FEATURE));
                    }
                    if (zzk.booleanValue() || isAuto(context) || isTv(context)) {
                        z14 = false;
                    } else {
                        if (zzn == null) {
                            zzn = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                        }
                        if (zzn.booleanValue() || isBstar(context) || isXr(context)) {
                            z14 = false;
                        } else {
                            if (zzq == null) {
                                zzq = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.desktop.gms"));
                            }
                            if (zzq.booleanValue()) {
                                z14 = false;
                            }
                        }
                    }
                }
            }
            zza = Boolean.valueOf(z14);
        }
        return zza.booleanValue();
    }

    @KeepForSdk
    public static boolean isPhoneGo(Context context) {
        ActivityManager activityManager;
        boolean z14 = false;
        if (context == null) {
            return false;
        }
        if (zzb == null) {
            if (isPhone(context)) {
                if (zzi == null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
                    zzi = Boolean.valueOf(activityManager.isLowRamDevice());
                }
                if (Objects.equal(zzi, Boolean.TRUE)) {
                    z14 = true;
                }
            }
            zzb = Boolean.valueOf(z14);
        }
        return zzb.booleanValue();
    }

    @KeepForSdk
    public static boolean isSevenInchTablet(Context context) {
        return zza(context.getResources());
    }

    @KeepForSdk
    public static boolean isSidewinder(Context context) {
        return zzc(context);
    }

    @KeepForSdk
    public static boolean isTablet(Resources resources) {
        if (resources == null) {
            return false;
        }
        if (zzc == null) {
            zzc = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || zza(resources));
        }
        return zzc.booleanValue();
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isTv(Context context) {
        return zzf(context.getPackageManager());
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        int i14 = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isWearable(Context context) {
        return zzb(context.getPackageManager());
    }

    @KeepForSdk
    @TargetApi(26)
    public static boolean isWearableWithoutPlayStore(Context context) {
        if (isWearable(context) && !PlatformVersion.isAtLeastN()) {
            return true;
        }
        if (zzc(context)) {
            return !PlatformVersion.isAtLeastO() || PlatformVersion.isAtLeastR();
        }
        return false;
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isXr(Context context) {
        return zzg(context.getPackageManager());
    }

    public static boolean zza(Resources resources) {
        boolean z14 = false;
        if (resources == null) {
            return false;
        }
        if (zze == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z14 = true;
            }
            zze = Boolean.valueOf(z14);
        }
        return zze.booleanValue();
    }

    @SideEffectFree
    public static boolean zzb(PackageManager packageManager) {
        if (zzf == null) {
            zzf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return zzf.booleanValue();
    }

    public static boolean zzc(Context context) {
        if (zzg == null) {
            zzg = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return zzg.booleanValue();
    }

    public static boolean zzd(Context context) {
        if (zzj == null) {
            zzj = Boolean.valueOf(PlatformVersion.isAtLeastO() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return zzj.booleanValue();
    }

    @SideEffectFree
    public static boolean zze(PackageManager packageManager) {
        if (zzl == null) {
            boolean z14 = false;
            if (PlatformVersion.isAtLeastO() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z14 = true;
            }
            zzl = Boolean.valueOf(z14);
        }
        return zzl.booleanValue();
    }

    @SideEffectFree
    public static boolean zzf(PackageManager packageManager) {
        if (zzm == null) {
            boolean z14 = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback") && !packageManager.hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE")) {
                z14 = false;
            }
            zzm = Boolean.valueOf(z14);
        }
        return zzm.booleanValue();
    }

    @SideEffectFree
    public static boolean zzg(PackageManager packageManager) {
        if (zzp == null) {
            zzp = Boolean.valueOf(packageManager.hasSystemFeature("android.software.xr.api.spatial"));
        }
        return zzp.booleanValue();
    }

    @KeepForSdk
    public static boolean isTablet(Context context) {
        return isTablet(context.getResources());
    }
}
