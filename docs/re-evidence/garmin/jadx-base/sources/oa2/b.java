package oa2;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f131086a = "GDI#".concat(b.class.getSimpleName());

    public static void a(Context context, String str, String str2, Bundle bundle) {
        if (context != null) {
            e(context, str, str2, d(context), bundle);
        }
    }

    public static void b(Context context, String str, String str2, Bundle bundle) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        Intent intent = new Intent(str);
        intent.putExtras(bundle);
        if (TextUtils.isEmpty(str2)) {
            str2 = f131086a;
        }
        LoggerFactory.getLogger(str2).debug("Local broadcasting " + intent.getAction() + StringUtils.SPACE + intent.getExtras());
        z9.a.a(context).c(intent);
    }

    @Deprecated
    public static void c(Context context, String str, String str2, Bundle bundle) {
        if (context != null) {
            e(context, str, str2, null, bundle);
        }
    }

    public static String d(Context context) {
        return context.getPackageName() + ".permission.RECEIVE_BROADCASTS";
    }

    public static void e(Context context, String str, String str2, String str3, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (bundle != null) {
            if (str3 == null) {
                bundle.putString("com.garmin.android.deviceinterface.utils.EXTRA_SOURCE_PACKAGE", context.getPackageName());
            }
            intent.putExtras(bundle);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            intent.setPackage(context.getPackageName());
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = f131086a;
        }
        LoggerFactory.getLogger(str2).debug("Global broadcasting " + intent.getAction() + StringUtils.SPACE + intent.getExtras());
        context.sendBroadcast(intent, str3);
    }
}
