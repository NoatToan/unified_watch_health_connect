package com.huawei.hwauthutil.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes.dex */
public class PackageManagerHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PackageManager f17000c;

    public PackageManagerHelper(Context context) {
        if (context == null) {
            this.f17000c = null;
        } else {
            this.f17000c = context.getPackageManager();
        }
    }

    public int a(String str) {
        PackageManager packageManager = this.f17000c;
        if (packageManager == null) {
            return -1;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 16);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("PackageManagerHelper", "getPackageVersionCode, NameNotFoundException.");
            return 0;
        }
    }
}
