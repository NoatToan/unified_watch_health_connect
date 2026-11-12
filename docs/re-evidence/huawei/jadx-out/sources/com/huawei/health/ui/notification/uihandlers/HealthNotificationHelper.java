package com.huawei.health.ui.notification.uihandlers;

import android.content.Context;
import android.os.Bundle;
import com.huawei.health.ui.notification.common.IReporter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.StepsRecord;

/* JADX INFO: loaded from: classes2.dex */
public class HealthNotificationHelper extends IReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f10323a = Boolean.TRUE.toString();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f10324c = Boolean.FALSE.toString();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10325b;
    private IReporter d;
    private IReporter e;

    public HealthNotificationHelper(Context context) {
        this.e = null;
        this.d = null;
        this.f10325b = null;
        context = context == null ? BaseApplication.getContext() : context;
        this.f10325b = context;
        this.e = HealthStepsNotificationHelper.c(context);
        this.d = new HealthGoalNotificationHelper(this.f10325b);
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void onStart(Bundle bundle) {
        super.onStart(bundle);
        if (bundle == null) {
            return;
        }
        String string = bundle.getString("action");
        String string2 = bundle.getString("target");
        LogUtil.d("Step_HealthNotificationHelper", "action:", string, " target:", string2);
        if ("init".equals(string)) {
            d();
            return;
        }
        if ("start".equals(string)) {
            if ("GoalNotification".equals(string2)) {
                this.d.onStart(null);
                return;
            } else if ("StepsNotification".equals(string2)) {
                this.e.onStart(null);
                return;
            } else {
                LogUtil.d("Step_HealthNotificationHelper", "there is none match");
                return;
            }
        }
        if ("stop".equals(string)) {
            if ("GoalNotification".equals(string2)) {
                this.d.onStop();
                return;
            } else if ("StepsNotification".equals(string2)) {
                this.e.onStop();
                return;
            } else {
                LogUtil.d("Step_HealthNotificationHelper", "there is none match");
                return;
            }
        }
        LogUtil.d("Step_HealthNotificationHelper", "there is none match");
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void refresh(StepsRecord stepsRecord) {
        try {
            this.e.onUpdate(stepsRecord);
        } catch (Exception unused) {
            LogUtil.j("Step_HealthNotificationHelper", "stepsNotification refresh exception!!!");
        }
        try {
            this.d.onUpdate(stepsRecord);
        } catch (Exception unused2) {
            LogUtil.j("Step_HealthNotificationHelper", "goalNotification refresh exception!!!");
        }
    }

    private void d() {
        LogUtil.d("Step_HealthNotificationHelper", "initNotification ...");
        String strR = SharedPerferenceUtils.r(this.f10325b);
        String strH = SharedPerferenceUtils.h(this.f10325b);
        LogUtil.d("Step_HealthNotificationHelper", "default statusStepsNotification:", strR, " statusGoalNotification:", strH);
        if (UserInfomation.BIRTHDAY_UNSETED.equals(strR) && UserInfomation.BIRTHDAY_UNSETED.equals(strH)) {
            strR = e();
            strH = a();
            try {
                SharedPerferenceUtils.e(this.f10325b, Boolean.parseBoolean(strR));
                SharedPerferenceUtils.d(this.f10325b, Boolean.parseBoolean(strH));
            } catch (NumberFormatException e) {
                LogUtil.d("Step_HealthNotificationHelper", "NumberFormatException", e.getMessage());
            }
        }
        String str = f10323a;
        if (str.equals(strR)) {
            this.e.onStart(null);
        }
        if (str.equals(strH)) {
            this.d.onStart(null);
        }
    }

    public static String e() {
        if (!CommonUtil.cp() && CommonUtil.bg()) {
            return f10323a;
        }
        return f10324c;
    }

    public static String a() {
        if (CommonUtil.cp()) {
            return f10323a;
        }
        return f10324c;
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void onStop() {
        super.onStop();
        if (this.e.isRunning()) {
            this.e.onStop();
        }
        if (this.d.isRunning()) {
            this.d.onStop();
        }
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void languageChanged() {
        try {
            this.e.onLanguageChanged();
            this.d.onLanguageChanged();
        } catch (Exception unused) {
            LogUtil.j("Step_HealthNotificationHelper", "languageChanged refresh exception!!!");
        }
    }
}
