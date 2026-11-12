package com.huawei.health.manager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.IDaemonRemoteManager;
import com.huawei.health.IRealStepDataReport;
import com.huawei.health.IResultCallback;
import com.huawei.health.IStepDataReport;
import com.huawei.health.icommon.ISimpleResultCallback;
import com.huawei.health.icommon.LocalStepDataReport;
import com.huawei.health.manager.util.RemoteCallerFilter;
import com.huawei.health.ui.notification.IUiManager;
import com.huawei.health.ui.notification.UiManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.AuthorizationUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.LogicalStepCounter;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.StepCounterSupport;
import health.compact.a.StepCounterSupportUtils;
import health.compact.a.StepsRecord;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class StepCounterRemoteProxy extends IDaemonRemoteManager.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LogicalStepCounter f8073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LocalReportProxy f8074b;
    private RealTimeStepDataReportHelper d;
    private LogicalInitCallback e;
    private DaemonService f;
    private IUiManager j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8075c = false;
    private RemoteCallbackList<IStepDataReport> g = new RemoteCallbackList<IStepDataReport>() { // from class: com.huawei.health.manager.StepCounterRemoteProxy.1
        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(IStepDataReport iStepDataReport) {
            super.onCallbackDied(iStepDataReport);
            LogUtil.a("Step_CounterRemoteProxy", "RemoteCallbackList unregister when onCallbackDied");
            unregister(iStepDataReport);
        }
    };

    private int a(int i, int i2, int i3) {
        if (i < 390 || i2 < 120 || i3 > 2) {
            return (i < 330 || i2 < 90 || i2 >= 120 || i3 > 3) ? 1 : 2;
        }
        return 3;
    }

    public StepCounterRemoteProxy(DaemonService daemonService) {
        this.f8074b = new LocalReportProxy();
        this.e = new LogicalInitCallback();
        ReleaseLogUtil.c("Step_CounterRemoteProxy", "StepCounterRemoteProxy");
        this.f = daemonService;
        LogicalStepCounter logicalStepCounterD = LogicalStepCounter.d(daemonService);
        this.f8073a = logicalStepCounterD;
        logicalStepCounterD.c(this.f8074b);
        this.d = new RealTimeStepDataReportHelper(this.f);
        this.f8073a.c(this.e);
        UiManager uiManager = new UiManager(this.f);
        this.f8073a.e(uiManager.d());
        uiManager.a();
        this.j = uiManager.b();
    }

    @Override // com.huawei.health.IDaemonRemoteManager.Stub, android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (!RemoteCallerFilter.d()) {
            throw new RemoteException("hw permission check failed");
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public String getVersion() throws RemoteException {
        return "1.0.0.0";
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public void setStepCounterSwitchStatus(boolean z) throws RemoteException {
        LogUtil.d("Step_CounterRemoteProxy", "setStepCounterSwitchStatus status=", Boolean.valueOf(z));
        LogicalStepCounter logicalStepCounter = this.f8073a;
        if (logicalStepCounter == null || !this.f8075c) {
            return;
        }
        if (z) {
            logicalStepCounter.n();
        } else {
            logicalStepCounter.t();
        }
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public boolean getStepCounterSwitchStatus() throws RemoteException {
        boolean zG = this.f8073a.g();
        LogUtil.a("Step_CounterRemoteProxy", "getStepCounterSwitchStatus result= ", Boolean.valueOf(zG));
        return zG;
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public boolean isStepCounterWorking() throws RemoteException {
        LogicalStepCounter logicalStepCounter = this.f8073a;
        if (logicalStepCounter != null) {
            return logicalStepCounter.l();
        }
        return false;
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public int getStepCounterClass() throws RemoteException {
        return StepCounterSupport.b(this.f);
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public int getDeviceOriginalClass() throws RemoteException {
        return StepCounterSupport.c(this.f);
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public int getStepCountAuthPermission() throws RemoteException {
        boolean zC = AuthorizationUtils.c(BaseApplication.b());
        boolean zE = StepCounterSupportUtils.e(BaseApplication.b());
        if (zC) {
            return !zE ? -2 : 0;
        }
        return -1;
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public boolean registerStepReportCallback(IStepDataReport iStepDataReport) throws RemoteException {
        boolean zRegister = iStepDataReport != null ? this.g.register(iStepDataReport) : false;
        LogicalStepCounter logicalStepCounter = this.f8073a;
        if (logicalStepCounter != null) {
            logicalStepCounter.c(this.f8074b);
        }
        ReleaseLogUtil.c("Step_CounterRemoteProxy", "registerStepReportCallback ret = ", Boolean.valueOf(zRegister), "callback == null:", Boolean.valueOf(iStepDataReport == null), "mLogicalStepCounter == null", Boolean.valueOf(this.f8073a == null));
        return zRegister;
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public boolean unRegisterStepReportCallback(IStepDataReport iStepDataReport) throws RemoteException {
        boolean zUnregister = iStepDataReport != null ? this.g.unregister(iStepDataReport) : false;
        ReleaseLogUtil.c("Step_CounterRemoteProxy", "unRegisterStepReportCallback ret = ", Boolean.valueOf(zUnregister));
        return zUnregister;
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public boolean registerRealTimeStepReport(IRealStepDataReport iRealStepDataReport, int i) throws RemoteException {
        RealTimeStepDataReportHelper realTimeStepDataReportHelper = this.d;
        if (realTimeStepDataReportHelper != null) {
            return realTimeStepDataReportHelper.b(iRealStepDataReport, i);
        }
        return false;
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public boolean unRegisterRealTimeStepReport() throws RemoteException {
        RealTimeStepDataReportHelper realTimeStepDataReportHelper = this.d;
        if (realTimeStepDataReportHelper != null) {
            return realTimeStepDataReportHelper.c();
        }
        return false;
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public void setBaseData(long j, int i, int i2, int i3) throws RemoteException {
        LogUtil.d("Step_CounterRemoteProxy", "setBaseData");
        LogicalStepCounter logicalStepCounter = this.f8073a;
        if (logicalStepCounter != null) {
            logicalStepCounter.e(j, i, i2, i3);
        }
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public void setStepsNotifiEnable(boolean z) throws RemoteException {
        LogUtil.d("Step_CounterRemoteProxy", "setNotificationEnable status=", Boolean.valueOf(z));
        IUiManager iUiManager = this.j;
        if (iUiManager != null) {
            iUiManager.changeStepsNotificationStateAsUser(z);
        }
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public void setGoalNotifiEnable(boolean z) throws RemoteException {
        LogUtil.d("Step_CounterRemoteProxy", "setNotificationEnable status=", Boolean.valueOf(z));
        IUiManager iUiManager = this.j;
        if (iUiManager != null) {
            iUiManager.changeGoalNotificationStateAsUser(z);
        }
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public boolean getStepsNotifiState() throws RemoteException {
        IUiManager iUiManager = this.j;
        boolean zIsGetStepsNotificationState = iUiManager != null ? iUiManager.isGetStepsNotificationState() : false;
        LogUtil.a("Step_CounterRemoteProxy", "isGetStepsNotificationState result= ", Boolean.valueOf(zIsGetStepsNotificationState));
        return zIsGetStepsNotificationState;
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public boolean getGoalNotifiState() throws RemoteException {
        IUiManager iUiManager = this.j;
        boolean zIsGetGoalNotificationState = iUiManager != null ? iUiManager.isGetGoalNotificationState() : false;
        LogUtil.a("Step_CounterRemoteProxy", "isGetGoalNotificationState result= ", Boolean.valueOf(zIsGetGoalNotificationState));
        return zIsGetGoalNotificationState;
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public void flushCacheToDB(IResultCallback iResultCallback) throws RemoteException {
        if (this.f8073a == null) {
            return;
        }
        this.f8073a.d(iResultCallback != null ? new SimpleResultCallbackProxy(iResultCallback) : null, true);
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public void setNotificationEnable(boolean z) {
        IUiManager iUiManager = this.j;
        if (iUiManager != null) {
            iUiManager.changeStepsNotificationStateAsUser(true);
        }
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public boolean isNotificationShown() {
        IUiManager iUiManager = this.j;
        return iUiManager != null && iUiManager.isGetNotificationSupport() && this.j.isGetStepsNotificationState();
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public void setUserInfo(Bundle bundle) throws RemoteException {
        LogicalStepCounter logicalStepCounter = this.f8073a;
        if (logicalStepCounter != null) {
            logicalStepCounter.e(bundle);
        }
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public void getSleepData(IResultCallback iResultCallback) {
        ReleaseLogUtil.c("Step_CounterRemoteProxy", "getSleepData callback");
        if (iResultCallback == null || this.f8073a == null) {
            return;
        }
        HashMap map = new HashMap(16);
        this.f8073a.d(map);
        d(iResultCallback, map);
    }

    private void d(IResultCallback iResultCallback, Map<String, Object> map) {
        try {
            if (map.size() < 7) {
                LogUtil.a("Step_CounterRemoteProxy", "getSleepData sleepDataMap.size() =", Integer.valueOf(map.size()));
                iResultCallback.onFailed(null);
            } else {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putInt("sleep_start_time", Integer.parseInt(String.valueOf(map.get("sleep_start_time"))));
                    bundle.putInt("sleep_end_time", Integer.parseInt(String.valueOf(map.get("sleep_end_time"))));
                    bundle.putInt("sleep_duration_sum", Integer.parseInt(String.valueOf(map.get("sleep_duration_sum"))));
                    bundle.putInt("sleep_deep_duration", Integer.parseInt(String.valueOf(map.get("sleep_deep_duration"))));
                    bundle.putInt("sleep_shallow_duration", Integer.parseInt(String.valueOf(map.get("sleep_shallow_duration"))));
                    bundle.putInt("sleep_wake_duration", Integer.parseInt(String.valueOf(map.get("sleep_wake_duration"))));
                    bundle.putInt("sleep_wake_count", Integer.parseInt(String.valueOf(map.get("sleep_wake_count"))));
                    try {
                        try {
                            bundle.putInt("sleep_quality", a(Integer.parseInt(String.valueOf(map.get("sleep_duration_sum"))), Integer.parseInt(String.valueOf(map.get("sleep_deep_duration"))), Integer.parseInt(String.valueOf(map.get("sleep_wake_count")))));
                            iResultCallback.onSuccess(bundle);
                        } catch (NumberFormatException e) {
                            e = e;
                            LogUtil.j("Step_CounterRemoteProxy", "getSleepData NumberFormatException", e.getMessage());
                            iResultCallback.onFailed(null);
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                        LogUtil.j("Step_CounterRemoteProxy", "getSleepData RemoteException", e.getMessage());
                    }
                } catch (NumberFormatException e3) {
                    e = e3;
                }
            }
        } catch (RemoteException e4) {
            e = e4;
        }
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public boolean getNotificationSupport() {
        IUiManager iUiManager = this.j;
        if (iUiManager != null) {
            return iUiManager.isGetNotificationSupport();
        }
        return false;
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public void getTodaySportData(IResultCallback iResultCallback) {
        LogUtil.d("Step_CounterRemoteProxy", "getTodaySportData callback");
        if (iResultCallback != null) {
            LogicalStepCounter logicalStepCounter = this.f8073a;
            if (logicalStepCounter != null) {
                try {
                    iResultCallback.onSuccess(logicalStepCounter.f());
                    return;
                } catch (RemoteException e) {
                    LogUtil.j("Step_CounterRemoteProxy", e.getMessage());
                    return;
                }
            }
            try {
                iResultCallback.onFailed(null);
            } catch (RemoteException e2) {
                LogUtil.j("Step_CounterRemoteProxy", e2.getMessage());
            }
        }
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public void getDebugInfo(IResultCallback iResultCallback) throws RemoteException {
        LogUtil.d("Step_CounterRemoteProxy", "getDebugInfo callback");
        if (iResultCallback != null) {
            LogicalStepCounter logicalStepCounter = this.f8073a;
            if (logicalStepCounter != null) {
                try {
                    iResultCallback.onSuccess(logicalStepCounter.e());
                    return;
                } catch (RemoteException e) {
                    LogUtil.j("Step_CounterRemoteProxy", e.getMessage());
                    return;
                }
            }
            try {
                iResultCallback.onFailed(null);
            } catch (RemoteException e2) {
                LogUtil.j("Step_CounterRemoteProxy", e2.getMessage());
            }
        }
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public void isNeedPromptKeepAlive(IResultCallback iResultCallback) throws RemoteException {
        LogUtil.d("Step_CounterRemoteProxy", "isNeedPromptKeepAlive callback");
        if (iResultCallback == null) {
            LogUtil.j("Step_CounterRemoteProxy", "isNeedPromptKeepAlive callback null,", "warning!!!(can not given the result via callback) return");
            return;
        }
        if (this.f8073a == null) {
            LogUtil.j("Step_CounterRemoteProxy", "isNeedPromptKeepAlive mLogicalStepCounter null,", "warning!!!(can not invoke function) return");
            iResultCallback.onFailed(null);
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isNeedPromptKeepAlive", this.f8073a.h());
            iResultCallback.onSuccess(bundle);
        } catch (RemoteException e) {
            LogUtil.j("Step_CounterRemoteProxy", e.getMessage());
        }
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public void makePromptNoSense() throws RemoteException {
        LogUtil.a("Step_CounterRemoteProxy", "makePromptNoSense");
        LogicalStepCounter logicalStepCounter = this.f8073a;
        if (logicalStepCounter == null) {
            LogUtil.j("Step_CounterRemoteProxy", "mLogicalStepCounter null,makePromptNoSense failed,return");
        } else {
            logicalStepCounter.m();
        }
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public void getStandSteps(final IResultCallback iResultCallback) throws RemoteException {
        LogUtil.d("Step_CounterRemoteProxy", "getStandSteps callback");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.manager.StepCounterRemoteProxy.2
            @Override // java.lang.Runnable
            public void run() {
                int iA;
                if (StepCounterRemoteProxy.this.d == null || StepCounterRemoteProxy.this.f8073a == null) {
                    iA = -1;
                } else {
                    StepCounterRemoteProxy.this.d.e();
                    iA = StepCounterRemoteProxy.this.f8073a.a();
                }
                if (iResultCallback != null) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putInt("standSteps", iA);
                        iResultCallback.onSuccess(bundle);
                    } catch (RemoteException e) {
                        LogUtil.j("Step_CounterRemoteProxy", e.getMessage());
                    }
                }
            }
        });
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public void notifyUserInfoChanged() throws RemoteException {
        LogUtil.a("Step_CounterRemoteProxy", "notifyUserInfoChanged ");
        LogicalStepCounter logicalStepCounter = this.f8073a;
        if (logicalStepCounter != null) {
            logicalStepCounter.o();
        }
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public void switchTrackMonitor(boolean z) {
        LogUtil.a("Step_CounterRemoteProxy", "switchTrackMonitor ", Boolean.valueOf(z));
        RealTimeStepDataReportHelper realTimeStepDataReportHelper = this.d;
        if (realTimeStepDataReportHelper == null) {
            return;
        }
        if (z) {
            realTimeStepDataReportHelper.b();
        } else {
            realTimeStepDataReportHelper.a();
        }
    }

    @Override // com.huawei.health.IDaemonRemoteManager
    public void tickTrackDog() {
        LogUtil.a("Step_CounterRemoteProxy", "tickTrackDog ", this.d);
        RealTimeStepDataReportHelper realTimeStepDataReportHelper = this.d;
        if (realTimeStepDataReportHelper != null) {
            realTimeStepDataReportHelper.d();
        }
    }

    public void dealBroadcastEvents(Intent intent) {
        if (intent != null) {
            LogUtil.a("Step_CounterRemoteProxy", "dealBroadcastEvents ", intent);
            LogicalStepCounter logicalStepCounter = this.f8073a;
            if (logicalStepCounter != null) {
                logicalStepCounter.b(intent);
                return;
            }
            return;
        }
        LogUtil.a("Step_CounterRemoteProxy", "dealBroadcastEvents intent = null");
    }

    public void release() {
        IUiManager iUiManager = this.j;
        if (iUiManager != null) {
            iUiManager.release();
        }
        LogicalStepCounter logicalStepCounter = this.f8073a;
        if (logicalStepCounter != null) {
            logicalStepCounter.d();
        }
    }

    class LocalReportProxy implements LocalStepDataReport {
        private LocalReportProxy() {
        }

        @Override // com.huawei.health.icommon.LocalStepDataReport
        public void report(StepsRecord stepsRecord) {
            int iBeginBroadcast;
            if (stepsRecord == null) {
                return;
            }
            synchronized (this) {
                try {
                    try {
                        iBeginBroadcast = StepCounterRemoteProxy.this.g.beginBroadcast();
                    } catch (IllegalStateException e) {
                        LogUtil.j("Step_CounterRemoteProxy", "report state not reade", e.getMessage());
                        iBeginBroadcast = 0;
                    }
                    LogUtil.g("Step_CounterRemoteProxy", "Report client count ", Integer.valueOf(iBeginBroadcast));
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            try {
                                ((IStepDataReport) StepCounterRemoteProxy.this.g.getBroadcastItem(i)).report(stepsRecord.a());
                            } catch (NullPointerException e2) {
                                ReleaseLogUtil.b("Step_CounterRemoteProxy", "report remote", LogAnonymous.b(e2));
                            }
                        } catch (RemoteException unused) {
                            LogUtil.j("Step_CounterRemoteProxy", "report remote exception...");
                        }
                    }
                    try {
                        StepCounterRemoteProxy.this.g.finishBroadcast();
                    } catch (IllegalStateException e3) {
                        LogUtil.j("Step_CounterRemoteProxy", "report state not reade", e3.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    class LogicalInitCallback implements ISimpleResultCallback {
        private LogicalInitCallback() {
        }

        @Override // com.huawei.health.icommon.ISimpleResultCallback
        public void onSuccess(Bundle bundle) {
            StepCounterRemoteProxy.this.f8075c = true;
            if (StepCounterRemoteProxy.this.f8073a.g()) {
                StepCounterRemoteProxy.this.f8073a.n();
            }
        }

        @Override // com.huawei.health.icommon.ISimpleResultCallback
        public void onFailed(Bundle bundle) {
            StepCounterRemoteProxy.this.f8075c = false;
            LogUtil.j("Step_CounterRemoteProxy", "init onfailed try to startStepCounter,may failed");
            if (StepCounterRemoteProxy.this.f8073a.g()) {
                StepCounterRemoteProxy.this.f8073a.n();
            }
        }
    }

    static class SimpleResultCallbackProxy implements ISimpleResultCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private IResultCallback f8079c;

        SimpleResultCallbackProxy(IResultCallback iResultCallback) {
            this.f8079c = iResultCallback;
        }

        @Override // com.huawei.health.icommon.ISimpleResultCallback
        public void onSuccess(Bundle bundle) {
            IResultCallback iResultCallback = this.f8079c;
            if (iResultCallback != null) {
                try {
                    iResultCallback.onSuccess(bundle);
                } catch (RemoteException e) {
                    LogUtil.j("Step_CounterRemoteProxy", e.getMessage());
                }
            }
        }

        @Override // com.huawei.health.icommon.ISimpleResultCallback
        public void onFailed(Bundle bundle) {
            IResultCallback iResultCallback = this.f8079c;
            if (iResultCallback != null) {
                try {
                    iResultCallback.onFailed(bundle);
                } catch (RemoteException e) {
                    LogUtil.j("Step_CounterRemoteProxy", e.getMessage());
                }
            }
        }
    }
}
