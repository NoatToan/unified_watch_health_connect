package com.huawei.watchface;

import android.content.Context;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b0 {
    public static boolean a(Context context, String[] strArr) {
        for (String str : strArr) {
            boolean zA = j3.a().a(context, str);
            HwLog.i("CheckAndRequestPermissionUtil", "permissions = " + str + "， hasPermission = " + zA);
            if (!zA) {
                return false;
            }
        }
        return true;
    }
}
