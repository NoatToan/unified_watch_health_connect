package com.huawei.ui.device.activity.notification.impl;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.NaviCallback;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import defpackage.qxg;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class NotificationPretreatmentServiceImpl implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        ReleaseLogUtil.b("NotificationPretreatmentServiceImpl", "onPretreatment path is ", guidepost.o());
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.e("NotificationPretreatmentServiceImpl", "uri is null");
            return false;
        }
        String path = uriO.getPath();
        LogUtil.b("NotificationPretreatmentServiceImpl", "path is ", path);
        if ("/router/notificationTip".equals(path)) {
            c(context);
        } else if ("/router/appNotificationSetting".equals(path)) {
            String queryParameter = uriO.getQueryParameter("package");
            if (!TextUtils.isEmpty(queryParameter)) {
                c(context, queryParameter);
            }
        }
        return false;
    }

    private void c(Context context, String str) {
        LogUtil.b("NotificationPretreatmentServiceImpl", "packageName is ", str);
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", str);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent2.setData(Uri.parse("package:" + str));
            context.startActivity(intent2);
        }
        a("/router/appNotificationSetting");
    }

    private void c(final Context context) {
        final Activity activity;
        final Activity activity2;
        String strE = qxg.e();
        Activity[] activityArrE = BaseApplication.e();
        Activity activity3 = null;
        if (activityArrE == null) {
            activity = activity3;
            activity2 = activity;
            break;
        }
        int length = activityArrE.length - 1;
        Activity activity4 = null;
        while (true) {
            if (length < 0) {
                activity2 = null;
                activity = activity4;
                break;
            }
            activity4 = activityArrE[length];
            if ((activity4 instanceof WebViewActivity) && TextUtils.equals(((WebViewActivity) activity4).getUrl(), strE)) {
                LogUtil.e("NotificationPretreatmentServiceImpl", "cannot jump to the same page");
                activity3 = activity4;
                activity = activity3;
                activity2 = activity;
                break;
            }
            length--;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("url", strE);
        bundle.putInt(Constants.JUMP_MODE_KEY, 0);
        HandlerExecutor.c(new Runnable() { // from class: qyj
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c(bundle, activity, context, activity2);
            }
        });
    }

    public /* synthetic */ void c(Bundle bundle, Activity activity, Context context, final Activity activity2) {
        Guidepost guidepostD = AppRouter.c("/PluginOperation/WebViewActivity").d(bundle);
        Context context2 = activity;
        if (activity == null) {
            context2 = context;
        }
        guidepostD.a(context2, new NaviCallback() { // from class: qyg
            @Override // com.huawei.haf.router.NaviCallback
            public final void onArrival(Guidepost guidepost) {
                this.d.e(activity2, guidepost);
            }
        });
        LogUtil.b("NotificationPretreatmentServiceImpl", "AppRouter start jumpToTipPage:", Thread.currentThread().getName());
    }

    public /* synthetic */ void e(Activity activity, Guidepost guidepost) {
        LogUtil.b("NotificationPretreatmentServiceImpl", "onArrival:");
        if (activity != null && !activity.isDestroyed()) {
            activity.finish();
        }
        a("/router/notificationTip");
    }

    public void a(String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(BleConstants.KEY_PATH, str);
        OpAnalyticsUtil.getInstance().setEvent(OperationKey.HEALTH_APP_DEVICE_DEEPLINK.value(), linkedHashMap);
    }
}
