package com.huawei.phoneservice.websurvey.utils;

import android.app.Activity;

/* JADX INFO: loaded from: classes41.dex */
public class c {
    public static boolean b(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
