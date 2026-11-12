package com.xiaomi.onetrack.util;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.accountsdk.account.AccountIntent;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13996a = "PermissionUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f13997b = "android.permission.READ_PRIVILEGED_PHONE_STATE";
    private static Set<String> c;

    static {
        try {
            HashSet hashSet = new HashSet();
            c = hashSet;
            hashSet.add(PluginPackageConstant.RN_DIR_A);
            c.add("com.miui.analytics");
            c.add("com.miui.cit");
            c.add(AccountIntent.PACKAGE_NAME_FIND_DEVICE);
            c.add(Constants.PACKAGE_NAME_SECURITYCENTER);
            c.add(Constants.SETTINGS_PACKAGE);
            c.add("com.android.vending");
            c.add("com.google.android.gms");
            c.add("com.xiaomi.factory.mmi");
            c.add("com.miui.qr");
            c.add(MedicalIdEditActivity.SYSTEM_CONTACT_PACKAGE);
            c.add("com.qualcomm.qti.autoregistration");
            c.add("com.miui.tsmclient");
            c.add("com.miui.sekeytool");
            c.add("com.android.updater");
            if (!"cn_chinamobile".equals(ab.a("ro.miui.cust_variant")) && !"cn_chinatelecom".equals(ab.a("ro.miui.cust_variant"))) {
                return;
            }
            c.add("com.mobiletools.systemhelper");
            c.add("com.miui.dmregservice");
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("static initializer: ");
            sb.append(e.toString());
        }
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            return a(context, "android.permission.READ_PHONE_STATE");
        }
        if (a()) {
            return a(com.xiaomi.onetrack.f.a.e()) && a(context, "android.permission.READ_PRIVILEGED_PHONE_STATE");
        }
        return a(context, "android.permission.READ_PRIVILEGED_PHONE_STATE");
    }

    public static boolean b(Context context) {
        return Build.VERSION.SDK_INT < 29 ? a(context, "android.permission.READ_PHONE_STATE") : a(context, "android.permission.READ_PRIVILEGED_PHONE_STATE");
    }

    private static boolean a() {
        try {
            return q.a() && !q.h() && "1".equals(ab.a("ro.miui.restrict_imei"));
        } catch (Exception e) {
            p.b(f13996a, "isRestrictIMEI " + e.toString());
            return false;
        }
    }

    private static boolean a(String str) {
        Set<String> set;
        return (TextUtils.isEmpty(str) || (set = c) == null || !set.contains(str)) ? false : true;
    }

    private static boolean a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
