package com.huawei.health.ui.notification.sync;

import android.content.Context;
import com.huawei.health.icommon.BaseSyncManager;
import com.huawei.health.ui.notification.manager.IUiNotificationManager;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.StepNotificationByHardWareUtils;

/* JADX INFO: loaded from: classes2.dex */
public class UiSyncManager extends BaseSyncManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f10315c;
    private IUiNotificationManager d;

    public UiSyncManager(Context context) {
        super(context);
        this.d = null;
        this.f10315c = context;
    }

    @Override // com.huawei.health.icommon.BaseSyncManager
    public boolean handleWorkerMessage(int i) {
        if (i != 7) {
            return false;
        }
        a();
        return true;
    }

    private void a() {
        if (this.d != null) {
            c();
            e();
        }
    }

    private void e() {
        HiUserPreference userPreference = HiHealthManager.d(this.f10315c).getUserPreference("custom.goal_notification_status");
        if (userPreference == null) {
            LogUtil.j("Step_UiSyncManager", "syncGoalNotification hiUserPreference is null");
            this.d.resetGoalNotification();
            return;
        }
        String value = userPreference.getValue();
        LogUtil.a("Step_UiSyncManager", "syncGoalNotification:", value);
        if (value == null || "".equals(value.trim())) {
            LogUtil.j("Step_UiSyncManager", "syncGoalNotification hiUserPreference no value");
            this.d.resetGoalNotification();
        } else {
            try {
                this.d.changeGoalNotificationStateAsSync(Boolean.parseBoolean(value));
            } catch (NumberFormatException e) {
                LogUtil.j("Step_UiSyncManager", "NumberFormatException", e.getMessage());
            }
        }
    }

    private void c() {
        HiUserPreference userPreference = HiHealthManager.d(this.f10315c).getUserPreference("custom.steps_notification_status");
        if (userPreference == null) {
            LogUtil.j("Step_UiSyncManager", "syncStepsNotification hiUserPreference is null");
            this.d.resetStepsNotification();
            return;
        }
        String value = userPreference.getValue();
        LogUtil.a("Step_UiSyncManager", "syncStepsNotification:", value);
        if (value == null || "".equals(value.trim())) {
            LogUtil.j("Step_UiSyncManager", "syncStepsNotification hiUserPreference no value");
            this.d.resetStepsNotification();
        } else if (!StepNotificationByHardWareUtils.d()) {
            LogUtil.a("Step_UiSyncManager", "syncStepsNotification isMtkPlatform is MTK");
        } else {
            this.d.changeStepsNotificationStateAsSync(Boolean.parseBoolean(value));
        }
    }

    public void d(IUiNotificationManager iUiNotificationManager) {
        if (iUiNotificationManager == null) {
            LogUtil.e("Step_UiSyncManager", "manager is null");
        } else {
            this.d = iUiNotificationManager;
        }
    }
}
