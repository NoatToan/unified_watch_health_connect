package com.google.androidbrowserhelper.trusted;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class TwaProviderPicker {
    private static final String TAG = "TWAProviderPicker";
    private static String sPackageNameForTesting;

    public static class Action {
        public final int launchMode;
        public final String provider;

        public Action(int i14, String str) {
            this.launchMode = i14;
            this.provider = str;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LaunchMode {
        public static final int BROWSER = 2;
        public static final int CUSTOM_TAB = 1;
        public static final int TRUSTED_WEB_ACTIVITY = 0;
    }

    private static Map<String, Integer> getLaunchModesForCustomTabsServices(PackageManager packageManager) {
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64);
        HashMap map = new HashMap();
        for (ResolveInfo resolveInfo : listQueryIntentServices) {
            String str = resolveInfo.serviceInfo.packageName;
            int i14 = 0;
            if (ChromeLegacyUtils.supportsTrustedWebActivities(packageManager, str)) {
                map.put(str, 0);
            } else {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.hasCategory("androidx.browser.trusted.category.TrustedWebActivities")) {
                    i14 = 1;
                }
                map.put(str, Integer.valueOf(i14 ^ 1));
            }
        }
        return map;
    }

    public static Action pickProvider(PackageManager packageManager) {
        String str = null;
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
        String str2 = sPackageNameForTesting;
        if (str2 != null) {
            data.setPackage(str2);
        }
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(data, 65536);
        listQueryIntentActivities.addAll(packageManager.queryIntentActivities(data, 131072));
        Map<String, Integer> launchModesForCustomTabsServices = getLaunchModesForCustomTabsServices(packageManager);
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        String str3 = null;
        while (it.hasNext()) {
            String str4 = it.next().activityInfo.packageName;
            int iIntValue = launchModesForCustomTabsServices.containsKey(str4) ? launchModesForCustomTabsServices.get(str4).intValue() : 2;
            if (iIntValue == 0) {
                return new Action(0, str4);
            }
            if (iIntValue != 1) {
                if (iIntValue == 2 && str3 == null) {
                    str3 = str4;
                }
            } else if (str == null) {
                str = str4;
            }
        }
        return str != null ? new Action(1, str) : new Action(2, str3);
    }

    public static void restrictToPackageForTesting(String str) {
        sPackageNameForTesting = str;
    }
}
