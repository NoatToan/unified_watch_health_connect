package com.huawei.health.ui.notification.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.huawei.health.manager.util.Consts;
import com.huawei.health.ui.notification.constants.UiComponent;
import com.huawei.health.ui.notification.uihandler.UiConfig;
import com.huawei.health.ui.notification.uihandlers.HealthNotificationHelper;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.AsyncInvocationHandler;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.UiHandler;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public class UiNotificationManager implements IUiNotificationManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UiConfig f10310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f10311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private UiHandler f10312c = null;
    private Context e;

    public UiNotificationManager(Context context) {
        this.e = null;
        this.f10311b = null;
        this.f10310a = null;
        if (context != null) {
            this.e = context;
            this.f10311b = new b();
            LogUtil.a("Step_UiNotificationManager", "registerDynamicBroadcastReceiver");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("steps_notify_delete");
            BroadcastManagerUtil.d(this.e, this.f10311b, intentFilter, Consts.d, null);
            this.f10310a = new UiConfig(this.e);
        }
    }

    @Override // com.huawei.health.ui.notification.manager.IUiNotificationManager
    public void resetStepsNotification() {
        String strE = HealthNotificationHelper.e();
        try {
            boolean z = Boolean.parseBoolean(strE);
            LogUtil.a("Step_UiNotificationManager", "resetStepsNotification string:", strE, " defaultConfig:", Boolean.valueOf(z));
            if (z == isGetStepsNotificationState()) {
                return;
            }
            changeStepsNotificationStateAsSync(z);
        } catch (NumberFormatException e) {
            LogUtil.e("Step_UiNotificationManager", "NumberFormatException", e.getMessage());
        }
    }

    @Override // com.huawei.health.ui.notification.manager.IUiNotificationManager
    public void resetGoalNotification() {
        String strA = HealthNotificationHelper.a();
        try {
            boolean z = Boolean.parseBoolean(strA);
            LogUtil.a("Step_UiNotificationManager", "resetGoalNotification str:", strA, " defaultConfig:", Boolean.valueOf(z));
            if (z == isGetGoalNotificationState()) {
                return;
            }
            changeGoalNotificationStateAsSync(z);
        } catch (NumberFormatException e) {
            LogUtil.e("Step_UiNotificationManager", "NumberFormatException", e.getMessage());
        }
    }

    @Override // com.huawei.health.ui.notification.manager.IUiNotificationManager
    public void changeStepsNotificationStateAsUser(boolean z) {
        LogUtil.a("Step_UiNotificationManager", "changeStepsNotificationStateAsUser:", Boolean.valueOf(z));
        e(z);
        b(z);
        UiHandler uiHandler = this.f10312c;
        if (uiHandler != null) {
            uiHandler.c();
        }
    }

    @Override // com.huawei.health.ui.notification.manager.IUiNotificationManager
    public void changeStepsNotificationStateAsSync(boolean z) {
        LogUtil.a("Step_UiNotificationManager", "changeStepsNotificationStateAsSync:", Boolean.valueOf(z));
        b(z);
        UiHandler uiHandler = this.f10312c;
        if (uiHandler != null) {
            uiHandler.c();
        }
    }

    private void e(boolean z) {
        LogUtil.a("Step_UiNotificationManager", "writeToDbStepsNotificationStatus", Boolean.valueOf(z));
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("custom.steps_notification_status");
        hiUserPreference.setValue(Boolean.toString(z));
        HiHealthManager.d(this.e).setUserPreference(hiUserPreference);
    }

    private void a(boolean z) {
        LogUtil.a("Step_UiNotificationManager", "writeToDbGoalNotificationStatus", Boolean.valueOf(z));
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("custom.goal_notification_status");
        hiUserPreference.setValue(Boolean.toString(z));
        HiHealthManager.d(this.e).setUserPreference(hiUserPreference);
    }

    private void b(boolean z) {
        if (z == isGetStepsNotificationState()) {
            LogUtil.j("Step_UiNotificationManager", "changeStepsNotificationState ambious set:", Boolean.valueOf(z));
            return;
        }
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("action", "start");
            bundle.putString("target", "StepsNotification");
            this.f10312c.d(UiComponent.NOTIFICATION, bundle);
        } else {
            bundle.putString("action", "stop");
            bundle.putString("target", "StepsNotification");
            this.f10312c.d(UiComponent.NOTIFICATION, bundle);
        }
    }

    @Override // com.huawei.health.ui.notification.manager.IUiNotificationManager
    public void changeGoalNotificationStateAsUser(boolean z) {
        LogUtil.a("Step_UiNotificationManager", "changeGoalNotificationStateAsUser:", Boolean.valueOf(z));
        a(z);
        d(z);
        UiHandler uiHandler = this.f10312c;
        if (uiHandler != null) {
            uiHandler.c();
        }
    }

    @Override // com.huawei.health.ui.notification.manager.IUiNotificationManager
    public void changeGoalNotificationStateAsSync(boolean z) {
        LogUtil.a("Step_UiNotificationManager", "changeGoalNotificationStateAsSync", Boolean.valueOf(z));
        d(z);
        UiHandler uiHandler = this.f10312c;
        if (uiHandler != null) {
            uiHandler.c();
        }
    }

    private void d(boolean z) {
        if (z == isGetGoalNotificationState()) {
            LogUtil.j("Step_UiNotificationManager", "changeGoalNotificationState ambious set:", Boolean.valueOf(z));
            return;
        }
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("action", "start");
            bundle.putString("target", "GoalNotification");
            this.f10312c.d(UiComponent.NOTIFICATION, bundle);
        } else {
            bundle.putString("action", "stop");
            bundle.putString("target", "GoalNotification");
            this.f10312c.d(UiComponent.NOTIFICATION, bundle);
        }
    }

    @Override // com.huawei.health.ui.notification.manager.IUiNotificationManager
    public boolean isGetStepsNotificationState() {
        String strR = SharedPerferenceUtils.r(this.e);
        if ("true".equals(strR)) {
            return true;
        }
        if ("false".equals(strR)) {
            return false;
        }
        if (UserInfomation.BIRTHDAY_UNSETED.equals(strR)) {
            LogUtil.e("Step_UiNotificationManager", "isGetStepsNotificationState UNSETED");
            return false;
        }
        LogUtil.e("Step_UiNotificationManager", "isGetStepsNotificationState WORRY");
        LogUtil.e("Step_UiNotificationManager", "isGetStepsNotificationState UNKNOWN");
        return false;
    }

    @Override // com.huawei.health.ui.notification.manager.IUiNotificationManager
    public boolean isGetGoalNotificationState() {
        String strH = SharedPerferenceUtils.h(this.e);
        if ("true".equals(strH)) {
            return true;
        }
        if ("false".equals(strH)) {
            return false;
        }
        if (UserInfomation.BIRTHDAY_UNSETED.equals(strH)) {
            LogUtil.e("Step_UiNotificationManager", "isGetGoalNotificationState UNSETED");
            return false;
        }
        LogUtil.e("Step_UiNotificationManager", "isGetStepsNotificationState WORRY");
        LogUtil.e("Step_UiNotificationManager", "isGetGoalNotificationState UNKNOWN");
        return false;
    }

    @Override // com.huawei.health.ui.notification.manager.IUiNotificationManager
    public boolean isGetNotificationSupport() {
        UiConfig uiConfig = this.f10310a;
        if (uiConfig != null) {
            return uiConfig.a();
        }
        return false;
    }

    public void a(UiHandler uiHandler) {
        if (uiHandler == null) {
            LogUtil.e("Step_UiNotificationManager", "uiHandler is null");
        } else {
            this.f10312c = uiHandler;
        }
    }

    @Override // com.huawei.health.ui.notification.manager.IUiNotificationManager
    public void stepsNotificationRemoveAndRebind() {
        if (isGetStepsNotificationState()) {
            b(false);
            b(true);
        }
    }

    public IUiNotificationManager c() {
        Object objNewProxyInstance = Proxy.newProxyInstance(getClass().getClassLoader(), getClass().getInterfaces(), new AsyncInvocationHandler(this));
        if (objNewProxyInstance instanceof IUiNotificationManager) {
            return (IUiNotificationManager) objNewProxyInstance;
        }
        return null;
    }

    class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if (action == null || UiNotificationManager.this.c() == null) {
                    LogUtil.j("Step_UiNotificationManager", "action or Proxy is null");
                } else if ("steps_notify_delete".equals(action)) {
                    UiNotificationManager.this.c().stepsNotificationRemoveAndRebind();
                }
            }
        }
    }
}
