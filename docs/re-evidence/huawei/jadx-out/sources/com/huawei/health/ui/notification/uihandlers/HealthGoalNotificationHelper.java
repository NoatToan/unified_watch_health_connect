package com.huawei.health.ui.notification.uihandlers;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.huawei.health.manager.util.TimeUtil;
import com.huawei.health.ui.notification.common.IReporter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.plugindaemon.R;
import com.huawei.threecircle.manager.WheelChairStateManager;
import defpackage.lsb;
import defpackage.npt;
import health.compact.a.LogAnonymous;
import health.compact.a.NotificationHelper;
import health.compact.a.NotificationUtil;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.StepsRecord;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class HealthGoalNotificationHelper extends IReporter implements WheelChairStateManager.SwitchStateListener {
    private Context e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10321b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Notification.Builder f10322c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10320a = -1;
    private int d = -1;

    public HealthGoalNotificationHelper(Context context) {
        this.e = context;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002f A[Catch: NumberFormatException -> 0x003b, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x003b, blocks: (B:4:0x0012, B:6:0x0016, B:8:0x0026, B:9:0x002f), top: B:21:0x0012 }] */
    @Override // com.huawei.health.ui.notification.common.IReporter
    public void onStart(Bundle bundle) {
        super.onStart(bundle);
        SharedPerferenceUtils.d(this.e, true);
        String[] strArrG = SharedPerferenceUtils.g(this.e);
        if (strArrG != null) {
            try {
                if (strArrG.length >= 2 && TimeUtil.d(Long.parseLong(strArrG[0]), System.currentTimeMillis())) {
                    this.f10321b = Boolean.parseBoolean(strArrG[1]);
                } else {
                    this.f10321b = false;
                    SharedPerferenceUtils.a(this.e, System.currentTimeMillis(), false);
                }
            } catch (NumberFormatException e) {
                LogUtil.j("Step_HlthGoalNotifHlp", "numberFormatException", e.getMessage());
                this.f10321b = false;
                SharedPerferenceUtils.a(this.e, System.currentTimeMillis(), false);
            }
        } else {
            this.f10321b = false;
            SharedPerferenceUtils.a(this.e, System.currentTimeMillis(), false);
        }
        if (!this.f10321b || WheelChairStateManager.a().d()) {
            a();
        }
        WheelChairStateManager.a().b((WheelChairStateManager.SwitchStateListener) this);
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void refresh(StepsRecord stepsRecord) {
        if (stepsRecord == null) {
            LogUtil.j("Step_HlthGoalNotifHlp", "Invalid param");
            return;
        }
        if (stepsRecord.h <= 0) {
            LogUtil.j("Step_HlthGoalNotifHlp", "Refresh failed,invalidate target");
            return;
        }
        if (WheelChairStateManager.a().d()) {
            LogUtil.a("Step_HlthGoalNotifHlp", "refresh isSwitchOn");
            return;
        }
        if (this.d == -1) {
            ReleaseLogUtil.d("Step_HlthGoalNotifHlp", npt.d("target init target ", Integer.valueOf(stepsRecord.h)));
            this.d = stepsRecord.h;
        } else if (stepsRecord.h != this.d) {
            ReleaseLogUtil.d("Step_HlthGoalNotifHlp", npt.d("target changed target ", Integer.valueOf(stepsRecord.h)));
            this.d = stepsRecord.h;
            this.f10321b = false;
            SharedPerferenceUtils.a(this.e, System.currentTimeMillis(), false);
            a();
        }
        if (stepsRecord.f < this.f10320a) {
            this.f10321b = false;
            ReleaseLogUtil.d("Step_HlthGoalNotifHlp", npt.d("next day:", MedalConstants.EVENT_STEPS, LogAnonymous.d(stepsRecord.f), "mLastReport", LogAnonymous.d(this.f10320a)));
            SharedPerferenceUtils.a(this.e, System.currentTimeMillis(), false);
            a();
        }
        this.f10320a = stepsRecord.f;
        if (stepsRecord.f < stepsRecord.h || this.f10321b) {
            return;
        }
        this.f10321b = true;
        SharedPerferenceUtils.a(this.e, System.currentTimeMillis(), true);
        b();
        e(stepsRecord.f, stepsRecord.h);
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void onStop() {
        super.onStop();
        a();
        SharedPerferenceUtils.d(this.e, false);
        WheelChairStateManager.a().c((WheelChairStateManager.SwitchStateListener) this);
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void languageChanged() {
        a();
    }

    private void a() {
        LogUtil.a("Step_HlthGoalNotifHlp", "closeNotification...");
        this.f10320a = -1;
        NotificationUtil.a(this.e, 10011);
        lsb.d().e(20210605);
    }

    private Notification b() {
        LogUtil.a("Step_HlthGoalNotifHlp", "createHealthNotification()");
        if (this.f10322c == null) {
            Notification.Builder builderC = lsb.d().c();
            this.f10322c = builderC;
            NotificationHelper.e(this.e, builderC);
            this.f10322c.setShowWhen(true);
            this.f10322c.setContentIntent(lsb.a(this.e));
            this.f10322c.setAutoCancel(true);
        }
        this.f10322c.setWhen(System.currentTimeMillis());
        Notification notificationBuild = this.f10322c.build();
        notificationBuild.contentIntent = lsb.a(this.e);
        Intent intent = new Intent("goal_notify_delete");
        intent.setPackage(this.e.getPackageName());
        notificationBuild.deleteIntent = PendingIntent.getBroadcast(this.e, 10011, intent, 201326592);
        notificationBuild.priority = 0;
        notificationBuild.flags |= 16;
        return notificationBuild;
    }

    public void e(String str, String str2) {
        if (this.f10322c == null) {
            LogUtil.j("Step_HlthGoalNotifHlp", "updateHealthNotification builder null,not update");
            return;
        }
        if (WheelChairStateManager.a().d()) {
            LogUtil.j("Step_HlthGoalNotifHlp", "updateHealthNotification isSwitchOn");
            a();
            return;
        }
        String strC = NotificationUtil.c(this.e, str2);
        this.f10322c.setContentTitle(strC).setContentText(e());
        LogUtil.a("Step_HlthGoalNotifHlp", "rebuild notification");
        lsb.d().c(10011, this.f10322c.build());
        lsb.d().e(20210605);
    }

    public void e(int i, int i2) {
        ReleaseLogUtil.d("Step_HlthGoalNotifHlp", npt.d("updateHealthNotification: ", "steps = ", LogAnonymous.d(i)));
        e(i + "", NotificationUtil.c(Integer.valueOf(i2), "###"));
    }

    private String e() {
        Context context = this.e;
        if (context != null) {
            try {
                return context.getString(R.string.IDS_plugindameon_hw_show_goal_completed_string);
            } catch (Resources.NotFoundException e) {
                LogUtil.e("Step_HlthGoalNotifHlp", "loadDayData() Exception", e.getMessage());
                return "";
            }
        }
        return "";
    }

    @Override // com.huawei.threecircle.manager.WheelChairStateManager.SwitchStateListener
    public void onSwitchStateChanged(boolean z) {
        LogUtil.a("Step_HlthGoalNotifHlp", "onSwitchStateChanged isOn", Boolean.valueOf(z));
        if (z) {
            a();
        }
    }
}
