package com.huawei.hms.support.hwid.common.e;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* JADX INFO: loaded from: classes34.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f16637a;

    public static boolean a(Context context) {
        if (context == null) {
            e.c("SDKUtil", "context is null", true);
            return false;
        }
        Boolean bool = f16637a;
        if (bool != null && !bool.booleanValue()) {
            e.a("SDKUtil", "isPhoneStillInLockMode is already false", true);
            return false;
        }
        UserManager userManager = (UserManager) context.getApplicationContext().getSystemService(UserManager.class);
        if (userManager == null) {
            e.c("SDKUtil", "userManager is null.", true);
            return false;
        }
        if (!userManager.isUserUnlocked()) {
            e.c("SDKUtil", "isPhoneStillInLockMode true", true);
            f16637a = true;
        } else {
            f16637a = false;
            e.a("SDKUtil", "isPhoneStillInLockMode false", true);
        }
        e.c("SDKUtil", "Build.VERSION.SDK_INT : " + Build.VERSION.SDK_INT + " isPhoneStillInLockMode " + f16637a, true);
        Boolean bool2 = f16637a;
        return bool2 != null && bool2.booleanValue();
    }
}
