package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.openalliance.ad.hw;
import java.util.HashSet;

/* JADX INFO: loaded from: classes12.dex */
public class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static aa f20332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f20333b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f20334c;
    private String d = "0";

    public int c() {
        if ("4".equalsIgnoreCase(this.d)) {
            return 8;
        }
        return "1".equalsIgnoreCase(this.d) ? 5 : 4;
    }

    public boolean b() {
        return "4".equalsIgnoreCase(a(this.f20334c).a());
    }

    public String a() {
        return this.d;
    }

    private void d() {
        String str;
        PackageManager packageManager = this.f20334c.getPackageManager();
        if (packageManager == null) {
            hw.d("DeviceTypeUtil", "packageManager is null.");
            return;
        }
        try {
            FeatureInfo[] systemAvailableFeatures = packageManager.getSystemAvailableFeatures();
            HashSet hashSet = new HashSet();
            if (systemAvailableFeatures != null) {
                for (FeatureInfo featureInfo : systemAvailableFeatures) {
                    if (!TextUtils.isEmpty(featureInfo.name)) {
                        hw.a("DeviceTypeUtil", "add feature:" + featureInfo.name);
                        hashSet.add(featureInfo.name);
                    }
                }
            }
            if (hashSet.contains("com.huawei.software.features.handset") || hashSet.contains("com.hihonor.software.features.handset")) {
                str = "0";
            } else if (hashSet.contains("com.huawei.software.features.pad") || hashSet.contains("com.hihonor.software.features.pad")) {
                str = "1";
            } else if (hashSet.contains("com.huawei.software.features.mobiletv") || hashSet.contains("com.hihonor.software.features.mobiletv")) {
                str = "5";
            } else if (hashSet.contains("com.huawei.software.features.tv") || hashSet.contains("com.hihonor.software.features.tv")) {
                str = "4";
            } else {
                if (!hashSet.contains("com.huawei.software.features.kidwatch") && !hashSet.contains("com.hihonor.software.features.kidwatch")) {
                    if (hashSet.contains("com.huawei.software.features.watch") || hashSet.contains("com.hihonor.software.features.watch")) {
                        str = "2";
                    } else {
                        String strA = dk.a("ro.build.characteristics");
                        hw.b("DeviceTypeUtil", "characteristics:" + strA);
                        a(strA);
                    }
                    hw.b("DeviceTypeUtil", "type is:" + this.d);
                }
                str = "3";
            }
            this.d = str;
        } catch (Throwable th) {
            hw.c("DeviceTypeUtil", "get device type error:" + th.getClass().getSimpleName());
        }
        hw.b("DeviceTypeUtil", "type is:" + this.d);
    }

    private static aa b(Context context) {
        aa aaVar;
        synchronized (f20333b) {
            if (f20332a == null) {
                f20332a = new aa(context);
            }
            aaVar = f20332a;
        }
        return aaVar;
    }

    private void a(String str) {
        String str2;
        if (str.equals("default")) {
            str2 = "0";
        } else if (str.equals("tablet")) {
            str2 = "1";
        } else if (!str.equals("tv")) {
            return;
        } else {
            str2 = "4";
        }
        this.d = str2;
    }

    public static aa a(Context context) {
        return b(context);
    }

    private aa(Context context) {
        this.f20334c = context.getApplicationContext();
        d();
    }
}
