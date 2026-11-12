package com.huawei.health.ui.notification.uihandlers;

import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import com.huawei.health.ui.notification.common.IReporter;
import com.huawei.health.ui.widget.HealthSportWidget;
import com.huawei.health.ui.widget.HonorWidgetProvider;
import com.huawei.health.ui.widget.XiaomiWidgetProvider;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.NotificationUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StepsRecord;

/* JADX INFO: loaded from: classes2.dex */
public class HealthWidgetHelper extends IReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10335a = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f10336c;

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void languageChanged() {
    }

    public HealthWidgetHelper(Context context) {
        this.f10336c = context;
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void onStart(Bundle bundle) {
        super.onStart(bundle);
        if (this.f10336c == null) {
            LogUtil.e("Step_HealthWidgetHelper", " mContext is null");
            return;
        }
        if (NotificationUtil.c()) {
            this.f10335a = Settings.Secure.getInt(this.f10336c.getContentResolver(), "launcher_background_color", 2);
        } else {
            this.f10335a = Settings.System.getInt(this.f10336c.getContentResolver(), "launcher_background_color", 2);
        }
        LogUtil.a("Step_HealthWidgetHelper", " mBackgroundColorType : ", Integer.valueOf(this.f10335a));
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void refresh(StepsRecord stepsRecord) {
        if (stepsRecord == null) {
            return;
        }
        d(stepsRecord);
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void onStop() {
        super.onStop();
    }

    private void d(StepsRecord stepsRecord) {
        if (stepsRecord == null) {
            LogUtil.j("Step_HealthWidgetHelper", "record is null");
            return;
        }
        Bundle bundleA = stepsRecord.a();
        bundleA.putInt("KEY_BG_COLOR_TYPE", this.f10335a);
        if (this.f10336c != null) {
            synchronized (HealthWidgetHelper.class) {
                LogUtil.a("Step_HealthWidgetHelper", "Data Changed! refreshWidget start! bundle= ", bundleA);
                HealthSportWidget.d(this.f10336c, bundleA);
                HonorWidgetProvider.d(this.f10336c, bundleA);
                XiaomiWidgetProvider.refreshWidget(this.f10336c, bundleA, "HealthWidgetHelper.sendWidgetBroadcast()");
                SharedPreferenceManager.c("last_refresh_module_id", "last_refresh_key", System.currentTimeMillis());
            }
        }
    }
}
