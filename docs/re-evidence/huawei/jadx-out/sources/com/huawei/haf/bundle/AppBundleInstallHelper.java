package com.huawei.haf.bundle;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes2.dex */
public final class AppBundleInstallHelper {
    private AppBundleInstallHelper() {
    }

    public static void loadResources(Activity activity, Resources resources) {
        AppBundle.e().loadResources(activity, resources);
    }

    public static void loadResources(Service service) {
        AppBundle.e().loadResources(service);
    }

    public static void loadResources(BroadcastReceiver broadcastReceiver, Context context) {
        AppBundle.e().loadResources(broadcastReceiver, context);
    }

    public static void loadLibrary(Context context, String str) {
        AppBundle.e().loadLibrary(context, str);
    }
}
