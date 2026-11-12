package com.huawei.hianalytics.visual;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f11672a = "";

    /* JADX WARN: Code duplicated, block: B:23:0x0033 A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #0 {Exception -> 0x0037, blocks: (B:5:0x0004, B:7:0x0008, B:21:0x0029, B:23:0x0033, B:8:0x000b, B:10:0x000f, B:12:0x0013, B:14:0x0017, B:15:0x001e, B:17:0x0022), top: B:29:0x0004 }] */
    public static Activity a(Context context, View view) {
        Activity activity;
        Object tag;
        Activity activity2 = null;
        if (context == null) {
            return null;
        }
        try {
            if (!(context instanceof Activity)) {
                if (context instanceof ContextWrapper) {
                    while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                    }
                }
                if (activity2 == null && view != null) {
                    tag = view.getTag(R.id.hianalytics_activity_view_user_tag);
                    if (tag instanceof Activity) {
                        return (Activity) tag;
                    }
                }
                return activity2;
            }
            activity = (Activity) context;
            activity2 = activity;
            if (activity2 == null) {
                tag = view.getTag(R.id.hianalytics_activity_view_user_tag);
                if (tag instanceof Activity) {
                    return (Activity) tag;
                }
            }
            return activity2;
        } catch (Exception e) {
            d0.a(e, new StringBuilder("fail to acquire activity from context, ex: "), "PageUtils");
            return activity2;
        }
    }

    public static JSONObject b(Activity activity) {
        JSONObject jSONObject = new JSONObject();
        if (activity != null) {
            try {
                jSONObject.put("$page_name", activity.getClass().getCanonicalName());
                jSONObject.put("$page_title", a(activity));
                return jSONObject;
            } catch (Exception e) {
                d0.a(e, new StringBuilder("fail to acquire page name and title, ex: "), "PageUtils");
            }
        }
        return jSONObject;
    }

    public static String a(Activity activity) {
        Class clsA;
        Object objInvoke;
        CharSequence charSequence;
        String string = "";
        if (activity == null) {
            return "";
        }
        if (!TextUtils.isEmpty(activity.getTitle())) {
            string = activity.getTitle().toString();
        }
        String string2 = null;
        try {
            ActionBar actionBar = activity.getActionBar();
            if (actionBar != null) {
                if (!TextUtils.isEmpty(actionBar.getTitle())) {
                    string2 = actionBar.getTitle().toString();
                }
            } else {
                try {
                    clsA = i1.a("android.support.v7.app.AppCompatActivity");
                } catch (Exception unused) {
                    clsA = null;
                }
                if (clsA == null) {
                    try {
                        clsA = i1.a("androidx.appcompat.app.AppCompatActivity");
                    } catch (Exception unused2) {
                    }
                }
                if (clsA != null && clsA.isInstance(activity) && (objInvoke = activity.getClass().getMethod("getSupportActionBar", new Class[0]).invoke(activity, new Object[0])) != null && (charSequence = (CharSequence) objInvoke.getClass().getMethod("getTitle", new Class[0]).invoke(objInvoke, new Object[0])) != null) {
                    string2 = charSequence.toString();
                }
            }
        } catch (Exception unused3) {
        }
        if (!TextUtils.isEmpty(string2)) {
            string = string2;
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            PackageManager packageManager = activity.getPackageManager();
            if (packageManager == null) {
                return string;
            }
            ActivityInfo activityInfo = packageManager.getActivityInfo(activity.getComponentName(), 0);
            return !TextUtils.isEmpty(activityInfo.loadLabel(packageManager)) ? activityInfo.loadLabel(packageManager).toString() : string;
        } catch (Exception e) {
            d0.a(e, new StringBuilder("fail to acquire activity title, ex: "), "PageUtils");
            return string;
        }
    }
}
