package com.google.android.gms.common.util;

import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;
import h7.a;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastJellyBean() {
        return true;
    }

    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastKitKat() {
        return true;
    }

    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastLollipop() {
        return true;
    }

    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastLollipopMR1() {
        return true;
    }

    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastM() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastN() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastO() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastP() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @KeepForSdk
    public static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @KeepForSdk
    public static boolean isAtLeastS() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @KeepForSdk
    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 32;
    }

    @KeepForSdk
    public static boolean isAtLeastT() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @KeepForSdk
    public static boolean isAtLeastU() {
        return Build.VERSION.SDK_INT >= 34;
    }

    @KeepForSdk
    public static boolean isAtLeastV() {
        int i14 = a.f82320a;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 35) {
            return true;
        }
        if (i15 < 34) {
            return false;
        }
        Build.VERSION.CODENAME.getClass();
        return a.a("VanillaIceCream");
    }
}
