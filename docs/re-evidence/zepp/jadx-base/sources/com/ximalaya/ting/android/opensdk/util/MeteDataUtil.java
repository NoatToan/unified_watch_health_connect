package com.ximalaya.ting.android.opensdk.util;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes22.dex */
public class MeteDataUtil {
    public static String getMetaDataByKey(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(str);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }
}
