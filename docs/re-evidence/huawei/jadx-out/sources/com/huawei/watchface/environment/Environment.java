package com.huawei.watchface.environment;

import android.R;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.hms.mlsdk.common.AgConnectInfo;
import com.huawei.watchface.q0;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public final class Environment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Application f30141a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f30142b = null;
    public static volatile boolean sIsAarInTheme = false;

    public static Object a(String str) {
        Application application;
        if (TextUtils.isEmpty(str) || (application = f30141a) == null) {
            return null;
        }
        try {
            return application.getSystemService(str);
        } catch (Exception e) {
            HwLog.e(HwLog.TAG, "getSystemService error " + HwLog.printException(e));
            return null;
        }
    }

    public static String b() {
        Application application = f30141a;
        return application == null ? "" : application.getApplicationInfo().packageName;
    }

    public static Context c() {
        Application application = f30141a;
        if (application == null) {
            return null;
        }
        Resources resources = application.getResources();
        int identifier = resources == null ? 0 : resources.getIdentifier("androidhwext:style/Theme.Emui", null, null);
        return identifier == 0 ? new ContextThemeWrapper(f30141a, R.style.Theme.Material) : new ContextThemeWrapper(f30141a, identifier);
    }

    public static void d() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            sIsAarInTheme = false;
        } else {
            sIsAarInTheme = strB.equals(q0.j());
        }
    }

    public static Application getApplicationContext() {
        return f30141a;
    }

    public static void setApplication(Application application) {
        if (f30141a == null) {
            f30141a = application;
        }
        d();
    }

    public static String a() {
        if (TextUtils.isEmpty(f30142b)) {
            f30142b = AGConnectInstance.getInstance().getOptions().getString(AgConnectInfo.AgConnectKey.APPLICATION_ID);
            HwLog.i("Environment", "getHMSAppId: appId: " + f30142b);
        }
        return f30142b;
    }
}
