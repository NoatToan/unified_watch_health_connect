package com.huawei.openalliance.ad.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class b {
    private static Activity b(Context context) {
        String str;
        if (context != null) {
            int i = 0;
            while (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                i++;
                if (i > 5) {
                    str = "ana_tag getActivity loop too much times, return";
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            return null;
        }
        str = "ana_tag getActivity context is null, return";
        hw.d("ActivityUtils", str);
        return null;
    }

    public static String a(Object obj) {
        String str;
        if (obj == null) {
            str = "ana_tag getActivityName obj is null, return";
        } else {
            if (obj instanceof View) {
                return a(((View) obj).getContext());
            }
            str = "ana_tag  getActivityName activityname is not view";
        }
        hw.d("ActivityUtils", str);
        return null;
    }

    public static String a(Context context) {
        Activity activityB = b(context);
        if (activityB != null) {
            hw.a("ActivityUtils", "ana_tag  getActivityLocalClassName LocalClassName = %s", activityB.getLocalClassName());
            return activityB.getLocalClassName();
        }
        hw.d("ActivityUtils", "ana_tag  getActivityLocalClassName LocalClassName is null");
        return "";
    }
}
