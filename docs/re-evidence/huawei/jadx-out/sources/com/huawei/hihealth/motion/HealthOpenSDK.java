package com.huawei.hihealth.motion;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.huawei.common.Constant;
import com.huawei.health.ITrackDataReport;
import com.huawei.health.ITrackSportManager;
import com.huawei.hihealth.motion.service.OpenSDKServiceRegister;
import com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter;
import com.huawei.hihealth.motion.service.stepcounter.NullHwStepCounter;
import com.huawei.hwsmartinteractmgr.ISmartInteract;
import com.huawei.hwsmartinteractmgr.ISmartMsgReadResultListener;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class HealthOpenSDK extends HealthOpenSDKCommon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f12301a = new Object();
    private Context j = null;
    private String g = null;
    private ITrackSportManager f = null;
    private ISmartInteract i = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IExecuteResult f12303c = null;
    private List<TrackLocalToRemoteProxy> l = new ArrayList();
    private HandlerThread m = null;
    private WorkerHandler h = null;
    private IHwStepCounter d = new NullHwStepCounter();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ServiceConnection f12302b = new ServiceConnection() { // from class: com.huawei.hihealth.motion.HealthOpenSDK.4
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.i("HealthOpenSDK", Constant.SERVICE_CONNECT_MESSAGE);
            HealthOpenSDK.this.i = ISmartInteract.Stub.asInterface(iBinder);
            synchronized (HealthOpenSDK.this.f12301a) {
                HealthOpenSDK.this.f12301a.notifyAll();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.i("HealthOpenSDK", "onServiceDisconnected");
            Log.d("HealthOpenSDK", "onServiceDisconnected " + componentName);
            HealthOpenSDK.this.i = null;
            synchronized (HealthOpenSDK.this.f12301a) {
                HealthOpenSDK.this.f12301a.notifyAll();
            }
        }
    };
    ServiceConnection e = new ServiceConnection() { // from class: com.huawei.hihealth.motion.HealthOpenSDK.5
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("HealthOpenSDK", "name : " + componentName + " service " + iBinder);
            HealthOpenSDK.this.f = ITrackSportManager.Stub.asInterface(iBinder);
            if (HealthOpenSDK.this.f == null || HealthOpenSDK.this.f12303c == null) {
                return;
            }
            HealthOpenSDK.this.f12303c.onSuccess(null);
            Log.d("HealthOpenSDK", "Bind Success " + System.currentTimeMillis());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("HealthOpenSDK", "onServiceDisconnected " + componentName);
            HealthOpenSDK.this.f12303c.onServiceException(null);
            HealthOpenSDK.this.h();
            HealthOpenSDK.this.f = null;
        }
    };

    @Override // com.huawei.hihealth.motion.HealthOpenSDKCommon
    @Deprecated
    public int initSDK(Context context, final IExecuteResult iExecuteResult, String str) {
        Log.d("HealthOpenSDK", "deprecated initSDK : " + str + ", ver:" + c() + ", this:" + this);
        if (context == null || iExecuteResult == null) {
            Log.e("HealthOpenSDK", "deprecated initSDK :context == null || cb == null");
            return -2;
        }
        if (this.m != null) {
            Log.e("HealthOpenSDK", "deprecated initSDK :mWorkingThread != null");
            return -3;
        }
        this.j = context.getApplicationContext();
        this.g = str;
        HandlerThread handlerThread = new HandlerThread("health_sdk");
        this.m = handlerThread;
        handlerThread.start();
        this.h = new WorkerHandler(this.m.getLooper());
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.hihealth.motion.HealthOpenSDK.1
            @Override // java.lang.Runnable
            public void run() {
                HealthOpenSDK healthOpenSDK = HealthOpenSDK.this;
                healthOpenSDK.d = (IHwStepCounter) healthOpenSDK.d("hwstepcounter", iExecuteResult);
                Log.i("HealthOpenSDK", "deprecated initSDK handler iHwStepCounter = " + HealthOpenSDK.this.d);
            }
        });
        Log.i("HealthOpenSDK", "deprecated initSDK iHwStepCounter = " + this.d);
        return 0;
    }

    @Override // com.huawei.hihealth.motion.HealthOpenSDKCommon
    public void destorySDK() {
        Log.d("HealthOpenSDK", "destorySDK " + this.g + ", this:" + this);
        if (this.d != null) {
            Log.d("HealthOpenSDK", "destorySDK iHwStepCounter != null");
            this.d = new NullHwStepCounter();
        }
        OpenSDKServiceRegister.a(this);
        if (this.i != null) {
            this.j.unbindService(this.f12302b);
            this.i = null;
        }
        HandlerThread handlerThread = this.m;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.m = null;
        }
        if (this.h != null) {
            this.h = null;
        }
    }

    public String c() {
        Log.d("HealthOpenSDK", "getSDKVersion 2.1.0.100");
        return "2.1.0.100";
    }

    private boolean a(final TrackLocalToRemoteProxy trackLocalToRemoteProxy) {
        Log.d("HealthOpenSDK", "registerTrackingReportInter:" + trackLocalToRemoteProxy + " at:" + System.currentTimeMillis());
        WorkerHandler workerHandler = this.h;
        if (workerHandler == null) {
            return false;
        }
        workerHandler.post(new Runnable() { // from class: com.huawei.hihealth.motion.HealthOpenSDK.2
            @Override // java.lang.Runnable
            public void run() {
                if (HealthOpenSDK.this.f == null || trackLocalToRemoteProxy == null) {
                    return;
                }
                try {
                    HealthOpenSDK.this.f.registerDataCallback(trackLocalToRemoteProxy);
                    HealthOpenSDK.this.l.add(trackLocalToRemoteProxy);
                } catch (Exception e) {
                    Log.w("HealthOpenSDK", "registerTrackCallbackInter : RemoteEx" + e.getMessage());
                }
            }
        });
        return true;
    }

    @Deprecated
    public boolean a(ICommonReport iCommonReport, IExecuteResult iExecuteResult) {
        this.d.registerStepReport(iCommonReport, iExecuteResult);
        return true;
    }

    @Deprecated
    public void e(ICommonReport iCommonReport) {
        this.d.unRegisterStepReport(iCommonReport);
    }

    @Deprecated
    public boolean a(RealStepCallback realStepCallback, int i) {
        this.d.registerRealTimeReport(realStepCallback, i);
        return true;
    }

    @Deprecated
    public boolean e() {
        this.d.unRegisterRealTimeReport();
        return true;
    }

    @Deprecated
    public void e(IFlushResult iFlushResult) {
        this.d.flushCacheToDB(iFlushResult);
    }

    @Deprecated
    public void b(boolean z, IExecuteResult iExecuteResult) {
        this.d.setStepsNotifiEnable(z, iExecuteResult);
    }

    @Deprecated
    public void c(boolean z, IExecuteResult iExecuteResult) {
        this.d.setGoalNotifiEnable(z, iExecuteResult);
    }

    @Deprecated
    public void b(IExecuteResult iExecuteResult) {
        this.d.getNotificationSupport(iExecuteResult);
    }

    @Deprecated
    public void d(IExecuteResult iExecuteResult) {
        this.d.getStepsNotifiState(iExecuteResult);
    }

    @Deprecated
    public void e(IExecuteResult iExecuteResult) {
        this.d.getGoalNotifiState(iExecuteResult);
    }

    public int d() {
        return this.d.getDeviceOriginalClass();
    }

    @Deprecated
    public boolean c(IExecuteResult iExecuteResult) {
        this.d.getTodaySportData(iExecuteResult);
        return true;
    }

    /* JADX INFO: renamed from: com.huawei.hihealth.motion.HealthOpenSDK$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISmartMsgResult f12306c;
        final /* synthetic */ HealthOpenSDK d;

        @Override // java.lang.Runnable
        public void run() {
            if (this.d.i == null) {
                this.d.i();
            }
            try {
                if (this.d.i != null) {
                    this.d.i.checkSmartMsg(1, this.d.new SmartResultLocalToRemote(this.f12306c));
                } else {
                    Log.e("HealthOpenSDK", "bindService fail, mISmartInteract is null");
                    this.f12306c.onResult(-1, null);
                }
            } catch (Exception e) {
                this.f12306c.onResult(-1, null);
                Log.w("HealthOpenSDK", "getSmartMsg : RemoteEx" + e.getMessage());
            }
        }
    }

    @Deprecated
    public boolean a(IExecuteResult iExecuteResult) {
        this.d.getStandSteps(iExecuteResult);
        return true;
    }

    @Deprecated
    public void j(IExecuteResult iExecuteResult) {
        this.d.isNeedPromptKeepAlive(iExecuteResult);
    }

    @Deprecated
    public void a() {
        this.d.makePromptNoSense();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        Log.i("HealthOpenSDK", "bindSmartService");
        Intent intent = new Intent();
        intent.setAction("com.huawei.hwsmartinteractmgr.service.SmartInteractService");
        intent.setPackage(HealthOpensdkClient.e());
        boolean zBindService = this.j.bindService(intent, this.f12302b, 1);
        Log.i("HealthOpenSDK", "bindSmartService end, ret=" + zBindService);
        synchronized (this.f12301a) {
            try {
                this.f12301a.wait(5000L);
            } catch (InterruptedException e) {
                Log.e("HealthOpenSDK", " bindStepService InterruptedException = " + e.getMessage());
            }
        }
        return zBindService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        Intent intent = new Intent();
        intent.setAction("com.huawei.healthcloud.plugintrack.trackSdk.TrackService");
        intent.setPackage(HealthOpensdkClient.e());
        boolean zBindService = this.j.bindService(intent, this.e, 0);
        Log.d("HealthOpenSDK", "Bind Track Service at " + System.currentTimeMillis());
        return zBindService;
    }

    public void e(boolean z) {
        try {
            this.d.switchTrackMonitor(z);
            Log.d("HealthOpenSDK", "switchTrackMonitor " + z);
        } catch (Exception e) {
            Log.w("HealthOpenSDK", "switchTrackMonitor : RemoteEx " + e.getMessage());
        }
    }

    public void b() {
        try {
            this.d.tickTrackDog();
            Log.d("HealthOpenSDK", "tickTrackDog over ");
        } catch (Exception e) {
            Log.w("HealthOpenSDK", "tickTrackDog : RemoteEx " + e.getMessage());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    class WorkerHandler extends Handler {
        public WorkerHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null || message.what != 101) {
                return;
            }
            TrackLocalToRemoteProxy trackLocalToRemoteProxy = (TrackLocalToRemoteProxy) message.obj;
            if (HealthOpenSDK.this.f != null || HealthOpenSDK.this.f()) {
                HealthOpenSDK.this.c(100, trackLocalToRemoteProxy);
            } else if (trackLocalToRemoteProxy != null) {
                trackLocalToRemoteProxy.b(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, TrackLocalToRemoteProxy trackLocalToRemoteProxy) {
        for (int i2 = 0; i2 < i; i2++) {
            if (a(trackLocalToRemoteProxy)) {
                if (trackLocalToRemoteProxy != null) {
                    trackLocalToRemoteProxy.b(true);
                    return;
                }
                return;
            }
            try {
                Log.d("HealthOpenSDK", "Try register sleep:" + System.currentTimeMillis());
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                Log.w("HealthOpenSDK", "tryToRegisterTrack : RemoteEx" + e.getMessage());
            }
        }
        if (trackLocalToRemoteProxy != null) {
            trackLocalToRemoteProxy.b(false);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    class TrackLocalToRemoteProxy extends ITrackDataReport.Stub {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private IExecuteResult f12310c;
        private ICommonReport d;

        public void b(boolean z) {
            IExecuteResult iExecuteResult = this.f12310c;
            if (iExecuteResult != null) {
                if (z) {
                    iExecuteResult.onSuccess(null);
                } else {
                    iExecuteResult.onFailed(null);
                }
            }
        }

        @Override // com.huawei.health.ITrackDataReport
        public void report(Bundle bundle) throws RemoteException {
            ICommonReport iCommonReport = this.d;
            if (iCommonReport != null) {
                iCommonReport.report(bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        List<TrackLocalToRemoteProxy> list = this.l;
        if (list != null) {
            synchronized (list) {
                Log.d("HealthOpenSDK", "cleanTrackProxyList");
                this.l.clear();
            }
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    class SmartResultLocalToRemote extends ISmartMsgReadResultListener.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ISmartMsgResult f12309a;

        public SmartResultLocalToRemote(ISmartMsgResult iSmartMsgResult) {
            this.f12309a = iSmartMsgResult;
        }

        @Override // com.huawei.hwsmartinteractmgr.ISmartMsgReadResultListener
        public void onResult(int i, SmartMsgDbObject smartMsgDbObject) throws RemoteException {
            this.f12309a.onResult(i, smartMsgDbObject);
        }
    }

    public Object d(String str, IExecuteResult iExecuteResult) {
        if (iExecuteResult == null) {
            Log.e("HealthOpenSDK", "getOpenSDKService: cb is null");
            return null;
        }
        this.f12303c = iExecuteResult;
        Log.d("HealthOpenSDK", "getOpenSDKService cb = " + iExecuteResult + ", name = " + str);
        Object objD = OpenSDKServiceRegister.d(this.j, str, this);
        StringBuilder sb = new StringBuilder("getOpenSDKService result = ");
        sb.append(objD);
        Log.d("HealthOpenSDK", sb.toString());
        if (objD != null) {
            boolean zIsServiceReady = ((IServiceReady) objD).isServiceReady();
            Log.i("HealthOpenSDK", "getOpenSDKService: isServiceReady = " + zIsServiceReady);
            if (zIsServiceReady) {
                WorkerHandler workerHandler = this.h;
                if (workerHandler == null) {
                    Log.e("HealthOpenSDK", "mHandler == null");
                    return null;
                }
                workerHandler.post(new Runnable() { // from class: com.huawei.hihealth.motion.HealthOpenSDK.6
                    @Override // java.lang.Runnable
                    public void run() {
                        HealthOpenSDK.this.d((Object) null);
                    }
                });
            }
        }
        return objD;
    }

    public void d(Object obj) {
        Log.i("HealthOpenSDK", "notifyServiceReady");
        IExecuteResult iExecuteResult = this.f12303c;
        if (iExecuteResult != null) {
            iExecuteResult.onSuccess(obj);
        }
    }

    public void b(Object obj) {
        Log.e("HealthOpenSDK", "notifyServiceReady");
        IExecuteResult iExecuteResult = this.f12303c;
        if (iExecuteResult != null) {
            iExecuteResult.onServiceException(obj);
        }
    }
}
