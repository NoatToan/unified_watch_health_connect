package com.xiaomi.market.sdk;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class PkgUtils {
    private static final String TAG = "PkgUtils";

    public static String queryDefaultPackageForIntent(Intent intent) {
        Iterator<ResolveInfo> it2 = queryIntentActivities(intent, 0).iterator();
        while (it2.hasNext()) {
            ActivityInfo activityInfo = it2.next().activityInfo;
            if (activityInfo.enabled && activityInfo.exported) {
                return activityInfo.packageName;
            }
        }
        return null;
    }

    public static List<ResolveInfo> queryIntentActivities(Intent intent, int i) {
        List<ResolveInfo> listQueryIntentActivities;
        try {
            listQueryIntentActivities = AppGlobal.getPackageManager().queryIntentActivities(intent, i);
        } catch (Exception e) {
            Log.e(TAG, e.getMessage(), e);
            listQueryIntentActivities = null;
        }
        return listQueryIntentActivities != null ? listQueryIntentActivities : new ArrayList();
    }
}
