package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.NaviCallback;
import com.huawei.health.interactor.MainInteractors;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.AuthorizationUtils;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes8.dex */
public final class gvd {
    public static boolean b(Context context) {
        return !LoginInit.getInstance(context).isBrowseMode();
    }

    public static boolean c(Context context) {
        return AuthorizationUtils.c(context);
    }

    public static boolean c(Guidepost guidepost) {
        boolean z = guidepost.d().getBoolean("needLogin", false);
        return z ? z : AppRouterUtils.d(guidepost);
    }

    public static boolean e(Guidepost guidepost) {
        return AppRouterUtils.c(guidepost);
    }

    public static boolean b(Guidepost guidepost) {
        return AppRouterUtils.e(guidepost) && !MainInteractors.e();
    }

    public static Uri e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return Uri.parse("huaweischeme://healthapp" + str);
        }
        return Uri.parse("huaweischeme://healthapp" + str + "?" + str2);
    }

    public static Uri a(Guidepost guidepost) {
        Uri uriO = guidepost.o();
        return uriO == null ? e(guidepost.l(), null) : uriO;
    }

    public static String a(String str) {
        int iIndexOf;
        return (!str.contains("?") || (iIndexOf = str.indexOf("?")) <= 0) ? str : str.substring(0, iIndexOf);
    }

    public static void a(Context context) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setClassName(context, "com.huawei.health.MainActivity");
        intent.setFlags(536870912);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        } else {
            intent.addFlags(67108864);
        }
        context.startActivity(intent);
        LogUtil.b("Login_RouterUtils", "startMainActivity flags=0x", Integer.toHexString(intent.getFlags()), ", topActivity=", BaseApplication.j());
    }

    public static void d(Guidepost guidepost, NaviCallback naviCallback, boolean z) {
        Context contextE = guidepost.e();
        Intent intent = new Intent();
        intent.setPackage(contextE.getPackageName());
        intent.setClassName(contextE, "com.huawei.health.MainActivity");
        intent.setData(a(guidepost));
        intent.putExtra("needLogin", z);
        AppRouterUtils.e(intent, guidepost, naviCallback);
        intent.setFlags(536870912);
        if (!(contextE instanceof Activity)) {
            intent.addFlags(268435456);
        } else {
            intent.addFlags(67108864);
        }
        contextE.startActivity(intent);
        LogUtil.b("Login_RouterUtils", "startMainActivity targetPath=", guidepost.l(), ", flags=0x", Integer.toHexString(intent.getFlags()), ", topActivity=", BaseApplication.j());
    }

    public static Uri c(Intent intent) {
        if (intent == null) {
            return null;
        }
        Uri data = AppRouterUtils.a(intent) ? intent.getData() : null;
        if (data == null || !"/home/main".equals(data.getPath())) {
            return data;
        }
        return null;
    }

    public static void a(Context context, Uri uri, Intent intent) {
        if (intent == null) {
            LogUtil.e("Login_RouterUtils", "jumpToDeepLinkTarget intent == null");
        } else if (intent.getBooleanExtra("needLogin", false)) {
            boolean zB = b(context);
            boolean zC = c(context);
            if (!zB || !zC) {
                LogUtil.b("Login_RouterUtils", "jumpToDeepLinkTarget return, isLogined=", Boolean.valueOf(zB), ", isAuthorizationStatus=", Boolean.valueOf(zC));
                return;
            }
        }
        if (AppRouterUtils.a(intent)) {
            AppRouterUtils.b(context, intent);
        } else {
            AppRouter.e(uri).b(context);
            LogUtil.b("Login_RouterUtils", "jumpToDeepLinkTarget uri=", uri);
        }
    }
}
