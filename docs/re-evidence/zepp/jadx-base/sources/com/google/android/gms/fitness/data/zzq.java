package com.google.android.gms.fitness.data;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DeviceProperties;

/* JADX INFO: loaded from: classes3.dex */
public final class zzq {

    @Nullable
    private static String a = null;
    private static int b = -1;

    private static boolean a(Context context) {
        try {
            return ((TelephonyManager) Preconditions.checkNotNull((TelephonyManager) context.getSystemService("phone"))).getPhoneType() != 0;
        } catch (Resources.NotFoundException e) {
            Log.e("Fitness", "Unable to determine type of device, assuming phone.", e);
            return true;
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String zza(Context context) {
        String str = a;
        if (str != null) {
            return str;
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        a = string;
        return string;
    }

    public static int zzb(Context context) {
        if (b == -1) {
            if (DeviceProperties.isWearable(context)) {
                b = 3;
            } else {
                boolean z = false;
                if (DeviceProperties.isTv(context) || DeviceProperties.isAuto(context)) {
                    b = 0;
                } else {
                    if (DeviceProperties.isTablet(context.getResources()) && !a(context)) {
                        b = 2;
                    } else {
                        String str = Build.PRODUCT;
                        if (!TextUtils.isEmpty(str) && str.startsWith("glass_")) {
                            z = true;
                        }
                        if (z) {
                            b = 6;
                        } else {
                            b = 1;
                        }
                    }
                }
            }
        }
        return b;
    }
}
