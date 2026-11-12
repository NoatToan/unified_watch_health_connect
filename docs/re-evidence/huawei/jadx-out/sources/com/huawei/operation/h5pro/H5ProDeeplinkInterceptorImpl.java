package com.huawei.operation.h5pro;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.h5pro.webkit.H5ProDeeplinkManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.R;
import defpackage.qrs;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes.dex */
public class H5ProDeeplinkInterceptorImpl implements H5ProDeeplinkManager.H5ProDeeplinkInterceptor {
    private static final String TAG = "H5PRO_H5ProDeeplinkInterceptorImpl";

    @Override // com.huawei.health.h5pro.webkit.H5ProDeeplinkManager.H5ProDeeplinkInterceptor
    public boolean jumpFromDeeplink(Context context, String str, String str2) {
        LogUtil.a(TAG, "deeplink:", CommonUtil.n(str), ",packageName:", str2);
        return interceptTelDeeplink(context, str);
    }

    private boolean interceptTelDeeplink(Context context, String str) {
        Activity activityJ;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "deeplink is null");
            return false;
        }
        Uri uri = Uri.parse(str);
        if (!"tel".equals(uri.getScheme())) {
            return false;
        }
        if (context instanceof Activity) {
            activityJ = (Activity) context;
        } else {
            activityJ = BaseApplication.j();
        }
        if (activityJ == null) {
            LogUtil.j(TAG, "h5Activity is null");
            return false;
        }
        PackageManager packageManager = activityJ.getPackageManager();
        if (packageManager == null) {
            LogUtil.j(TAG, "packageManager is null");
            return false;
        }
        Intent intent = new Intent("android.intent.action.DIAL", uri);
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null) {
            LogUtil.j(TAG, "resolveInfo is null");
            return false;
        }
        ComponentName componentName = new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name);
        intent.setComponent(componentName);
        showLaunchAgreeDialog(activityJ, intent, componentName);
        return true;
    }

    private void showLaunchAgreeDialog(final Activity activity, final Intent intent, final ComponentName componentName) {
        activity.runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.H5ProDeeplinkInterceptorImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                H5ProDeeplinkInterceptorImpl.lambda$showLaunchAgreeDialog$0(intent, componentName, activity);
            }
        });
    }

    static /* synthetic */ void lambda$showLaunchAgreeDialog$0(Intent intent, ComponentName componentName, Activity activity) {
        LogUtil.j(TAG, "showLaunchAgreeDialog");
        qrs.c(intent, componentName.getPackageName(), activity, activity.getString(R.string.IDS_hwh_phone));
    }
}
