package com.huawei.wallet.proxy.utils;

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class WearActivityManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<Activity> f30041b = new ArrayList();

    public static void b(Activity activity) {
        synchronized (WearActivityManager.class) {
            f30041b.add(activity);
        }
    }

    public static void b(String str) {
        synchronized (WearActivityManager.class) {
            if (!TextUtils.isEmpty(str)) {
                for (Activity activity : f30041b) {
                    if (str.equals(activity.getClass().getName())) {
                        activity.finish();
                    }
                }
            }
        }
    }
}
