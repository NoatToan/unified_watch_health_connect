package com.huawei.hihealth.motion.service.stepcounter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.huawei.health.IDaemonRemoteManager;
import com.huawei.hihealth.motion.HealthOpensdkClient;
import com.huawei.hihealth.motion.ICommonReport;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hihealth.motion.IFlushResult;
import com.huawei.hihealth.motion.IServiceReady;
import com.huawei.hihealth.motion.RealStepCallback;
import com.huawei.hihealth.motion.common.AsyncInvocationHandler;
import com.huawei.hihealth.motion.common.ServiceRef;
import com.huawei.hihealth.motion.util.ExecuteResultLocalToRemote;
import com.huawei.hihealth.motion.util.RealStepReportProxy;
import com.huawei.hihealth.motion.util.ResultLocalToRemote;
import com.huawei.hihealth.motion.util.StepLocalToRemoteProxy;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HwStepCounter implements IHwStepCounter, IServiceReady {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static IExecuteResult f12322c;
    private static HwStepCounter e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f12323a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12324b = false;
    private ServiceRef<IDaemonRemoteManager> j = null;
    private List<StepLocalToRemoteProxy> h = new ArrayList();
    private List<RealStepReportProxyRecord> d = new ArrayList();

    public static IHwStepCounter b(Context context, IExecuteResult iExecuteResult) {
        synchronized (HwStepCounter.class) {
            HwStepCounter hwStepCounter = e;
            if (hwStepCounter != null) {
                return (IHwStepCounter) Proxy.newProxyInstance(hwStepCounter.getClass().getClassLoader(), e.getClass().getInterfaces(), new AsyncInvocationHandler(e));
            }
            if (context == null) {
                return null;
            }
            HwStepCounter hwStepCounter2 = new HwStepCounter();
            e = hwStepCounter2;
            f12322c = iExecuteResult;
            IHwStepCounter iHwStepCounter = (IHwStepCounter) Proxy.newProxyInstance(hwStepCounter2.getClass().getClassLoader(), e.getClass().getInterfaces(), new AsyncInvocationHandler(e));
            iHwStepCounter.init(context.getApplicationContext());
            return iHwStepCounter;
        }
    }

    private HwStepCounter() {
    }

    @Override // com.huawei.hihealth.motion.IServiceReady
    public boolean isServiceReady() {
        return this.f12324b;
    }

    static class RealStepReportProxyRecord {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RealStepReportProxy f12326c;
        int d;

        RealStepReportProxyRecord(RealStepReportProxy realStepReportProxy, int i) {
            this.f12326c = realStepReportProxy;
            this.d = i;
        }
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void init(Context context) {
        this.f12323a = context;
        Log.d("HealthOpenSDK_HSC", "bindStepService ...");
        Intent intent = new Intent();
        intent.setPackage(HealthOpensdkClient.e());
        intent.setClassName(HealthOpensdkClient.e(), "com.huawei.health.manager.DaemonService");
        this.j = new ServiceRef<IDaemonRemoteManager>(this.f12323a, intent, true) { // from class: com.huawei.hihealth.motion.service.stepcounter.HwStepCounter.1
            @Override // com.huawei.hihealth.motion.common.ServiceRef
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public IDaemonRemoteManager transf(IBinder iBinder) {
                return IDaemonRemoteManager.Stub.asInterface(iBinder);
            }

            @Override // com.huawei.hihealth.motion.common.ServiceRef
            public void onRebind() {
                int i;
                synchronized (HwStepCounter.this.h) {
                    for (int i2 = 0; i2 < HwStepCounter.this.h.size(); i2++) {
                        HwStepCounter hwStepCounter = HwStepCounter.this;
                        hwStepCounter.a((StepLocalToRemoteProxy) hwStepCounter.h.get(i2));
                    }
                }
                synchronized (HwStepCounter.this.d) {
                    for (i = 0; i < HwStepCounter.this.d.size(); i++) {
                        HwStepCounter hwStepCounter2 = HwStepCounter.this;
                        hwStepCounter2.e(((RealStepReportProxyRecord) hwStepCounter2.d.get(i)).f12326c, ((RealStepReportProxyRecord) HwStepCounter.this.d.get(i)).d);
                    }
                }
            }

            @Override // com.huawei.hihealth.motion.common.ServiceRef
            public void onServiceReady() {
                HwStepCounter.this.f12324b = true;
                if (HwStepCounter.f12322c != null) {
                    HwStepCounter.f12322c.onSuccess(null);
                }
            }

            @Override // com.huawei.hihealth.motion.common.ServiceRef
            public void onServiceFailed() {
                if (HwStepCounter.f12322c != null) {
                    HwStepCounter.f12322c.onFailed(null);
                }
            }

            @Override // com.huawei.hihealth.motion.common.ServiceRef
            public void onServiceException() {
                HwStepCounter.this.f12324b = false;
                if (HwStepCounter.f12322c != null) {
                    HwStepCounter.f12322c.onServiceException(null);
                }
            }
        };
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void setUserInfo(Bundle bundle, IExecuteResult iExecuteResult) {
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager != null) {
            try {
                iDaemonRemoteManager.setUserInfo(bundle);
                if (iExecuteResult != null) {
                    iExecuteResult.onSuccess(null);
                }
                Log.d("HealthOpenSDK_HSC", "setUserInfo success");
                return;
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "setUserInfo : RemoteEx" + e2.getMessage());
            }
        }
        if (iExecuteResult != null) {
            iExecuteResult.onFailed(null);
        }
        Log.d("HealthOpenSDK_HSC", "setUserInfo failed");
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void setStepsNotifiEnable(boolean z, IExecuteResult iExecuteResult) {
        Log.d("HealthOpenSDK_HSC", "setStepsNotifiEnable " + z);
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager != null) {
            try {
                iDaemonRemoteManager.setStepsNotifiEnable(z);
                if (iExecuteResult != null) {
                    iExecuteResult.onSuccess(null);
                }
                Log.d("HealthOpenSDK_HSC", "setStepsNotifiEnable success");
                return;
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "setStepsNotifiEnable : RemoteEx" + e2.getMessage());
            }
        }
        if (iExecuteResult != null) {
            iExecuteResult.onFailed(null);
        }
        Log.d("HealthOpenSDK_HSC", "setStepsNotifiEnable failed");
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void flushCacheToDB(IFlushResult iFlushResult) {
        Log.d("HealthOpenSDK_HSC", "flushCacheToDB ");
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager == null) {
            if (iFlushResult != null) {
                iFlushResult.onServiceException(null);
            }
        } else {
            try {
                iDaemonRemoteManager.flushCacheToDB(new ResultLocalToRemote(iFlushResult));
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "flushCacheToDB : RemoteEx" + e2.getMessage());
            }
        }
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void setGoalNotifiEnable(boolean z, IExecuteResult iExecuteResult) {
        Log.d("HealthOpenSDK_HSC", "setGoalNotifiEnable " + z);
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager != null) {
            try {
                iDaemonRemoteManager.setGoalNotifiEnable(z);
                if (iExecuteResult != null) {
                    iExecuteResult.onSuccess(null);
                }
                Log.d("HealthOpenSDK_HSC", "setGoalNotifiEnable success");
                return;
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "setGoalNotifiEnable : RemoteEx" + e2.getMessage());
            }
        }
        if (iExecuteResult != null) {
            iExecuteResult.onFailed(null);
        }
        Log.d("HealthOpenSDK_HSC", "setGoalNotifiEnable failed");
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void registerStepReport(ICommonReport iCommonReport, IExecuteResult iExecuteResult) {
        Log.d("HealthOpenSDK_HSC", "registerStepReport " + iCommonReport);
        if (b(iCommonReport) != null) {
            Log.w("HealthOpenSDK_HSC", "registerStepReport report already exists!");
            return;
        }
        StepLocalToRemoteProxy stepLocalToRemoteProxy = new StepLocalToRemoteProxy(iCommonReport);
        if (a(stepLocalToRemoteProxy)) {
            synchronized (this.h) {
                this.h.add(stepLocalToRemoteProxy);
            }
            iExecuteResult.onSuccess(null);
            return;
        }
        iExecuteResult.onFailed(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(StepLocalToRemoteProxy stepLocalToRemoteProxy) {
        Log.d("HealthOpenSDK_HSC", "registerStepReportInner " + stepLocalToRemoteProxy);
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager == null) {
            return false;
        }
        try {
            return iDaemonRemoteManager.registerStepReportCallback(stepLocalToRemoteProxy);
        } catch (Exception e2) {
            Log.w("HealthOpenSDK_HSC", "registerStepCallbackInter : RemoteEx" + e2.getMessage());
            return false;
        }
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void unRegisterStepReport(ICommonReport iCommonReport) {
        Log.d("HealthOpenSDK_HSC", "unRegisterStepReport " + iCommonReport);
        StepLocalToRemoteProxy stepLocalToRemoteProxyB = b(iCommonReport);
        if (stepLocalToRemoteProxyB != null && e(stepLocalToRemoteProxyB)) {
            synchronized (this.h) {
                this.h.remove(stepLocalToRemoteProxyB);
            }
        }
    }

    private boolean e(StepLocalToRemoteProxy stepLocalToRemoteProxy) {
        Log.d("HealthOpenSDK_HSC", "unRegisterStepReportInner " + stepLocalToRemoteProxy);
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager == null) {
            return false;
        }
        try {
            return iDaemonRemoteManager.unRegisterStepReportCallback(stepLocalToRemoteProxy);
        } catch (Exception e2) {
            Log.w("HealthOpenSDK_HSC", "unRegisterStepReport : RemoteEx" + e2.getMessage());
            return false;
        }
    }

    private StepLocalToRemoteProxy b(ICommonReport iCommonReport) {
        synchronized (this.h) {
            for (int i = 0; i < this.h.size(); i++) {
                if (this.h.get(i).isScameLocalCallback(iCommonReport)) {
                    return this.h.get(i);
                }
            }
            return null;
        }
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void registerRealTimeReport(RealStepCallback realStepCallback, int i) {
        Log.d("HealthOpenSDK_HSC", "registerRealTimeReport ...");
        if (realStepCallback == null) {
            return;
        }
        RealStepReportProxy realStepReportProxy = new RealStepReportProxy(realStepCallback);
        if (e(realStepReportProxy, i)) {
            synchronized (this.d) {
                this.d.add(new RealStepReportProxyRecord(realStepReportProxy, i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(RealStepReportProxy realStepReportProxy, int i) {
        Log.d("HealthOpenSDK_HSC", "registerRealTimeReportInner ...");
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        boolean zRegisterRealTimeStepReport = false;
        if (iDaemonRemoteManager != null) {
            try {
                zRegisterRealTimeStepReport = iDaemonRemoteManager.registerRealTimeStepReport(realStepReportProxy, i);
                Log.d("HealthOpenSDK_HSC", "registerRealTimeReport reporter：" + realStepReportProxy);
                return zRegisterRealTimeStepReport;
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "registerRealTimeReport : RemoteEx" + e2.getMessage());
                return zRegisterRealTimeStepReport;
            }
        }
        Log.w("HealthOpenSDK_HSC", "registerRealTimeReport : mDaemonRemoteManager = null");
        return false;
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void unRegisterRealTimeReport() {
        if (d()) {
            synchronized (this.d) {
                this.d.clear();
            }
        }
    }

    private boolean d() {
        Log.d("HealthOpenSDK_HSC", "unRegisterRealTimeReportInner");
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager != null) {
            try {
                return iDaemonRemoteManager.unRegisterRealTimeStepReport();
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "unRegisterRealTimeReport : RemoteEx" + e2.getMessage());
                return false;
            }
        }
        Log.w("HealthOpenSDK_HSC", "unRegisterRealTimeReport : mDaemonRemoteManager = null");
        return false;
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void getNotificationSupport(IExecuteResult iExecuteResult) {
        Log.d("HealthOpenSDK_HSC", "getNotificationSupport");
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager != null) {
            try {
                Bundle bundle = new Bundle();
                boolean notificationSupport = iDaemonRemoteManager.getNotificationSupport();
                bundle.putBoolean("notificationSupport", notificationSupport);
                if (iExecuteResult != null) {
                    iExecuteResult.onSuccess(bundle);
                }
                Log.d("HealthOpenSDK_HSC", "getNotificationSupport success: " + notificationSupport);
                return;
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "setNotificationEnable : RemoteEx" + e2.getMessage());
            }
        }
        if (iExecuteResult != null) {
            iExecuteResult.onFailed(null);
        }
        Log.d("HealthOpenSDK_HSC", "getNotificationSupport failed");
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void getStepsNotifiState(IExecuteResult iExecuteResult) {
        Log.d("HealthOpenSDK_HSC", "getStepsNotifiState");
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager != null) {
            try {
                Bundle bundle = new Bundle();
                boolean stepsNotifiState = iDaemonRemoteManager.getStepsNotifiState();
                bundle.putBoolean("stepsNotifiState", stepsNotifiState);
                if (iExecuteResult != null) {
                    iExecuteResult.onSuccess(bundle);
                }
                Log.d("HealthOpenSDK_HSC", "getStepsNotifiState success: " + stepsNotifiState);
                return;
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "getStepsNotifiState : RemoteEx" + e2.getMessage());
            }
        }
        if (iExecuteResult != null) {
            iExecuteResult.onFailed(null);
        }
        Log.d("HealthOpenSDK_HSC", "getStepsNotifiState failed");
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void getGoalNotifiState(IExecuteResult iExecuteResult) {
        Log.d("HealthOpenSDK_HSC", "getGoalNotifiState");
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager != null) {
            try {
                Bundle bundle = new Bundle();
                boolean goalNotifiState = iDaemonRemoteManager.getGoalNotifiState();
                bundle.putBoolean("goalNotifiState", goalNotifiState);
                if (iExecuteResult != null) {
                    iExecuteResult.onSuccess(bundle);
                }
                Log.d("HealthOpenSDK_HSC", "getGoalNotifiState success: " + goalNotifiState);
                return;
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "getGoalNotifiState : RemoteEx" + e2.getMessage());
            }
        }
        if (iExecuteResult != null) {
            iExecuteResult.onFailed(null);
        }
        Log.d("HealthOpenSDK_HSC", "getGoalNotifiState failed");
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void setStepCounterSwitchStatus(boolean z) {
        Log.d("HealthOpenSDK_HSC", "setStepCounterSwitchStatus " + z);
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager != null) {
            try {
                iDaemonRemoteManager.setStepCounterSwitchStatus(z);
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "setStepCounterSwitchStatus : RemoteEx" + e2.getMessage());
            }
        }
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public boolean getStepCounterSwitchStatus() {
        Log.d("HealthOpenSDK_HSC", "getStepCounterSwitchStatus");
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager == null) {
            return false;
        }
        try {
            return iDaemonRemoteManager.getStepCounterSwitchStatus();
        } catch (Exception e2) {
            Log.w("HealthOpenSDK_HSC", "setStepCounterSwitchStatus : RemoteEx" + e2.getMessage());
            return false;
        }
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public int getStepCounterClass() {
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        int stepCounterClass = 3;
        if (iDaemonRemoteManager != null) {
            try {
                stepCounterClass = iDaemonRemoteManager.getStepCounterClass();
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "getStepCounterClass : RemoteEx" + e2.getMessage());
            }
            Log.d("HealthOpenSDK_HSC", "getStepCounterClass result=" + stepCounterClass);
        }
        return stepCounterClass;
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void getSleepData(IExecuteResult iExecuteResult) {
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        Log.d("HealthOpenSDK_HSC", "mDaemonRemoteManager:" + iDaemonRemoteManager);
        try {
            iDaemonRemoteManager.getSleepData(new ExecuteResultLocalToRemote(iExecuteResult));
        } catch (Exception e2) {
            Log.w("HealthOpenSDK_HSC", "getSleepData : RemoteEx" + e2.getMessage());
        }
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void getTodaySportData(IExecuteResult iExecuteResult) {
        try {
            this.j.get().getTodaySportData(new ExecuteResultLocalToRemote(iExecuteResult));
        } catch (Exception e2) {
            Log.w("HealthOpenSDK_HSC", "getTodaySportData : RemoteEx" + e2.getMessage());
        }
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void getStandSteps(IExecuteResult iExecuteResult) {
        Log.d("HealthOpenSDK_HSC", "getStandSteps callback:" + iExecuteResult);
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager != null) {
            try {
                iDaemonRemoteManager.getStandSteps(new ExecuteResultLocalToRemote(iExecuteResult));
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "getStandSteps : Exception " + e2.getMessage());
            }
        }
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void getDebugInfo(IExecuteResult iExecuteResult) {
        Log.d("HealthOpenSDK_HSC", "getDebugInfo callback:" + iExecuteResult);
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager != null) {
            try {
                iDaemonRemoteManager.getDebugInfo(new ExecuteResultLocalToRemote(iExecuteResult));
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "getDebugInfo : RemoteEx" + e2.getMessage());
            }
        }
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void isNeedPromptKeepAlive(IExecuteResult iExecuteResult) {
        Log.d("HealthOpenSDK_HSC", "isNeedPromptKeepAlive callback:" + iExecuteResult);
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager == null) {
            Log.w("HealthOpenSDK_HSC", "isNeedPromptKeepAlive remote null,return");
            return;
        }
        try {
            iDaemonRemoteManager.isNeedPromptKeepAlive(new ExecuteResultLocalToRemote(iExecuteResult));
        } catch (Exception e2) {
            Log.w("HealthOpenSDK_HSC", "isNeedPromptKeepAlive : RemoteEx" + e2.getMessage());
        }
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void makePromptNoSense() {
        Log.d("HealthOpenSDK_HSC", "makePromptNoSense");
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager == null) {
            Log.w("HealthOpenSDK_HSC", "makePromptNoSense remote null,return");
            return;
        }
        try {
            iDaemonRemoteManager.makePromptNoSense();
        } catch (Exception e2) {
            Log.w("HealthOpenSDK_HSC", "makePromptNoSense : RemoteEx" + e2.getMessage());
        }
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void notifyUserInfoChanged(IExecuteResult iExecuteResult) {
        Log.d("HealthOpenSDK_HSC", "notifyUserInfoChanged ");
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager != null) {
            try {
                iDaemonRemoteManager.notifyUserInfoChanged();
                if (iExecuteResult != null) {
                    iExecuteResult.onSuccess(null);
                }
                Log.d("HealthOpenSDK_HSC", "notifyUserInfoChanged success");
                return;
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "notifyUserInfoChanged : RemoteEx" + e2.getMessage());
            }
        }
        if (iExecuteResult != null) {
            iExecuteResult.onFailed(null);
        }
        Log.d("HealthOpenSDK_HSC", "notifyUserInfoChanged failed");
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void tickTrackDog() {
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager != null) {
            try {
                iDaemonRemoteManager.tickTrackDog();
                Log.d("HealthOpenSDK_HSC", "tickTrackDog over ");
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "tickTrackDog : RemoteEx " + e2.getMessage());
            }
        }
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public void switchTrackMonitor(boolean z) {
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        if (iDaemonRemoteManager != null) {
            try {
                iDaemonRemoteManager.switchTrackMonitor(z);
                Log.d("HealthOpenSDK_HSC", "switchTrackMonitor " + z);
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "switchTrackMonitor : RemoteEx " + e2.getMessage());
            }
        }
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter
    public int getDeviceOriginalClass() {
        IDaemonRemoteManager iDaemonRemoteManager = this.j.get();
        int deviceOriginalClass = 3;
        if (iDaemonRemoteManager != null) {
            try {
                deviceOriginalClass = iDaemonRemoteManager.getDeviceOriginalClass();
            } catch (Exception e2) {
                Log.w("HealthOpenSDK_HSC", "getDeviceOriginalClass : RemoteEx" + e2.getMessage());
            }
            Log.d("HealthOpenSDK_HSC", "getDeviceOriginalClass result=" + deviceOriginalClass);
        }
        return deviceOriginalClass;
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.Releasable
    public void release() {
        Log.i("HealthOpenSDK_HSC", "release");
        synchronized (this.h) {
            for (int i = 0; i < this.h.size(); i++) {
                e(this.h.get(i));
            }
            this.h.clear();
        }
        synchronized (this.d) {
            if (this.d.size() != 0) {
                d();
                this.d.clear();
            }
        }
        this.j.release();
    }

    public static void b() {
        synchronized (HwStepCounter.class) {
            IHwStepCounter iHwStepCounterB = b(null, null);
            if (iHwStepCounterB == null) {
                Log.w("HealthOpenSDK_HSC", "no instance need release");
                e = null;
                f12322c = null;
            } else {
                iHwStepCounterB.release();
                e = null;
                f12322c = null;
            }
        }
    }
}
