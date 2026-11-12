package com.huawei.health.ui.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.health.icommon.LocalStepDataReport;
import com.huawei.health.ui.notification.manager.IUiNotificationManager;
import com.huawei.health.ui.notification.manager.UiNotificationManager;
import com.huawei.health.ui.notification.manager.UiWidgetManager;
import com.huawei.health.ui.notification.sync.UiSyncManager;
import com.huawei.health.ui.notification.uihandler.UiConfig;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.AsyncInvocationHandler;
import health.compact.a.StepsRecord;
import health.compact.a.UiHandler;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public class UiManager implements IUiManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10305a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private UiHandler f10307c;
    private BroadcastReceiver e = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UiSyncManager f10306b = null;
    private IUiNotificationManager d = null;
    private UiWidgetManager g = null;

    public UiManager(Context context) {
        this.f10307c = null;
        this.f10305a = context;
        this.f10307c = new UiHandler(new UiConfig(context));
    }

    public IUiManager b() {
        Object objNewProxyInstance = Proxy.newProxyInstance(getClass().getClassLoader(), getClass().getInterfaces(), new AsyncInvocationHandler(this));
        if (!(objNewProxyInstance instanceof IUiManager)) {
            LogUtil.a("Step_UiManager", "getProxy object is not instanceof IUiManager");
            return null;
        }
        return (IUiManager) objNewProxyInstance;
    }

    @Override // com.huawei.health.ui.notification.IUiManager
    public void release() {
        BroadcastReceiver broadcastReceiver;
        if (this.f10305a == null || (broadcastReceiver = this.e) == null) {
            return;
        }
        BroadcastManager.l(broadcastReceiver);
    }

    @Override // com.huawei.health.ui.notification.IUiManager
    public void changeStepsNotificationStateAsUser(boolean z) {
        IUiNotificationManager iUiNotificationManager = this.d;
        if (iUiNotificationManager != null) {
            iUiNotificationManager.changeStepsNotificationStateAsUser(z);
        }
    }

    @Override // com.huawei.health.ui.notification.IUiManager
    public void changeGoalNotificationStateAsUser(boolean z) {
        IUiNotificationManager iUiNotificationManager = this.d;
        if (iUiNotificationManager != null) {
            iUiNotificationManager.changeGoalNotificationStateAsUser(z);
        }
    }

    @Override // com.huawei.health.ui.notification.IUiManager
    public boolean isGetStepsNotificationState() {
        IUiNotificationManager iUiNotificationManager = this.d;
        if (iUiNotificationManager != null) {
            return iUiNotificationManager.isGetStepsNotificationState();
        }
        return false;
    }

    @Override // com.huawei.health.ui.notification.IUiManager
    public boolean isGetGoalNotificationState() {
        IUiNotificationManager iUiNotificationManager = this.d;
        if (iUiNotificationManager != null) {
            return iUiNotificationManager.isGetGoalNotificationState();
        }
        return false;
    }

    @Override // com.huawei.health.ui.notification.IUiManager
    public boolean isGetNotificationSupport() {
        IUiNotificationManager iUiNotificationManager = this.d;
        if (iUiNotificationManager != null) {
            return iUiNotificationManager.isGetNotificationSupport();
        }
        return false;
    }

    @Override // com.huawei.health.ui.notification.IUiManager
    public void localChanged() {
        UiHandler uiHandler = this.f10307c;
        if (uiHandler != null) {
            uiHandler.b();
            this.f10307c.c();
        }
    }

    class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if (action == null || UiManager.this.b() == null) {
                    LogUtil.j("Step_UiManager", "action or Proxy is null");
                } else if ("android.intent.action.LOCALE_CHANGED".equals(action)) {
                    UiManager.this.b().localChanged();
                }
            }
        }
    }

    public LocalStepDataReport d() {
        UiHandler uiHandler = this.f10307c;
        if (uiHandler == null) {
            LogUtil.j("Step_UiManager", "mUiHandler is null");
            return null;
        }
        return new b(uiHandler);
    }

    public void a() {
        UiNotificationManager uiNotificationManager = new UiNotificationManager(this.f10305a);
        uiNotificationManager.a(this.f10307c);
        this.d = uiNotificationManager.c();
        UiWidgetManager uiWidgetManager = new UiWidgetManager(this.f10305a);
        this.g = uiWidgetManager;
        uiWidgetManager.b(this.f10307c);
        this.e = new a();
        LogUtil.a("Step_UiManager", "registerDynamicBroadcastReceiver");
        if (this.f10305a != null) {
            BroadcastManager.c(this.e);
            UiSyncManager uiSyncManager = new UiSyncManager(this.f10305a);
            this.f10306b = uiSyncManager;
            uiSyncManager.d(this.d);
        }
    }

    @Override // com.huawei.health.ui.notification.IUiManager
    public void updateStepRecord(StepsRecord stepsRecord) {
        UiHandler uiHandler = this.f10307c;
        if (uiHandler != null) {
            uiHandler.e(stepsRecord);
        }
    }

    class b implements LocalStepDataReport {
        b(UiHandler uiHandler) {
            UiManager.this.f10307c = uiHandler;
        }

        @Override // com.huawei.health.icommon.LocalStepDataReport
        public void report(StepsRecord stepsRecord) {
            if (stepsRecord == null || UiManager.this.b() == null) {
                LogUtil.a("Step_UiManager", "record or Proxy is null");
            } else {
                UiManager.this.b().updateStepRecord(stepsRecord);
            }
        }
    }
}
