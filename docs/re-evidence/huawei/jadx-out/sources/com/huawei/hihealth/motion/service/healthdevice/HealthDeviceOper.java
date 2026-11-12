package com.huawei.hihealth.motion.service.healthdevice;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.huawei.health.IHealthDeviceOperManager;
import com.huawei.hihealth.motion.HealthOpensdkClient;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hihealth.motion.IServiceReady;
import com.huawei.hihealth.motion.common.AsyncInvocationHandler;
import com.huawei.hihealth.motion.common.ServiceRef;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public class HealthDeviceOper implements IHealthDeviceOper, IServiceReady {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static IExecuteResult f12317c;
    private static HealthDeviceOper d;
    private HandlerThread h = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WorkerHandler f12319b = null;
    private String e = null;
    private boolean f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f12318a = null;
    private ServiceRef<IHealthDeviceOperManager> j = null;

    public static IHealthDeviceOper e(Context context, IExecuteResult iExecuteResult) {
        synchronized (HealthDeviceOper.class) {
            HealthDeviceOper healthDeviceOper = d;
            if (healthDeviceOper != null) {
                return (IHealthDeviceOper) Proxy.newProxyInstance(healthDeviceOper.getClass().getClassLoader(), d.getClass().getInterfaces(), new AsyncInvocationHandler(d));
            }
            if (context == null) {
                return null;
            }
            HealthDeviceOper healthDeviceOper2 = new HealthDeviceOper();
            d = healthDeviceOper2;
            f12317c = iExecuteResult;
            IHealthDeviceOper iHealthDeviceOper = (IHealthDeviceOper) Proxy.newProxyInstance(healthDeviceOper2.getClass().getClassLoader(), d.getClass().getInterfaces(), new AsyncInvocationHandler(d));
            iHealthDeviceOper.init(context.getApplicationContext());
            return iHealthDeviceOper;
        }
    }

    @Override // com.huawei.hihealth.motion.IServiceReady
    public boolean isServiceReady() {
        return this.f;
    }

    class WorkerHandler extends Handler {
        public WorkerHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null || message.what != 1) {
                return;
            }
            HealthDeviceOper healthDeviceOper = HealthDeviceOper.this;
            healthDeviceOper.holdDevice(healthDeviceOper.e);
        }
    }

    private HealthDeviceOper() {
        e();
    }

    private void e() {
        HandlerThread handlerThread = new HandlerThread("Health_sdk");
        this.h = handlerThread;
        handlerThread.start();
        this.f12319b = new WorkerHandler(this.h.getLooper());
    }

    @Override // com.huawei.hihealth.motion.service.healthdevice.IHealthDeviceOper
    public void init(Context context) {
        this.f12318a = context;
        Log.d("healthOpenSDK_HealthDeviceOper", "HealthDeviceOper bindDaemonService...");
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.device.oper");
        intent.setPackage(HealthOpensdkClient.e());
        intent.setClassName(HealthOpensdkClient.e(), "com.huawei.health.manager.DaemonService");
        this.j = new ServiceRef<IHealthDeviceOperManager>(this.f12318a, intent) { // from class: com.huawei.hihealth.motion.service.healthdevice.HealthDeviceOper.1
            @Override // com.huawei.hihealth.motion.common.ServiceRef
            public void onRebind() {
            }

            @Override // com.huawei.hihealth.motion.common.ServiceRef
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public IHealthDeviceOperManager transf(IBinder iBinder) {
                return IHealthDeviceOperManager.Stub.asInterface(iBinder);
            }

            @Override // com.huawei.hihealth.motion.common.ServiceRef
            public void onServiceReady() {
                HealthDeviceOper.this.f = true;
                if (HealthDeviceOper.f12317c != null) {
                    HealthDeviceOper.f12317c.onSuccess(null);
                }
            }

            @Override // com.huawei.hihealth.motion.common.ServiceRef
            public void onServiceFailed() {
                if (HealthDeviceOper.f12317c != null) {
                    HealthDeviceOper.f12317c.onFailed(null);
                }
            }

            @Override // com.huawei.hihealth.motion.common.ServiceRef
            public void onServiceException() {
                HealthDeviceOper.this.f = false;
                if (HealthDeviceOper.f12317c != null) {
                    HealthDeviceOper.f12317c.onServiceException(null);
                }
            }
        };
    }

    @Override // com.huawei.hihealth.motion.service.healthdevice.IHealthDeviceOper
    public void holdDevice(String str) {
        Log.d("healthOpenSDK_HealthDeviceOper", "HealthDeviceOper holdDevice()");
        this.e = str;
        WorkerHandler workerHandler = this.f12319b;
        if (workerHandler != null && workerHandler.hasMessages(1)) {
            this.f12319b.removeMessages(1);
        }
        IHealthDeviceOperManager iHealthDeviceOperManager = this.j.get();
        if (iHealthDeviceOperManager != null) {
            try {
                iHealthDeviceOperManager.holdDevice(str);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            WorkerHandler workerHandler2 = this.f12319b;
            if (workerHandler2 != null) {
                workerHandler2.sendEmptyMessageDelayed(1, 10000L);
            }
        }
    }

    @Override // com.huawei.hihealth.motion.service.healthdevice.IHealthDeviceOper
    public void releaseDevice(String str) {
        Log.d("healthOpenSDK_HealthDeviceOper", "HealthDeviceOper releaseDevice()");
        WorkerHandler workerHandler = this.f12319b;
        if (workerHandler != null && workerHandler.hasMessages(1)) {
            this.f12319b.removeMessages(1);
        }
        IHealthDeviceOperManager iHealthDeviceOperManager = this.j.get();
        if (iHealthDeviceOperManager != null) {
            try {
                iHealthDeviceOperManager.releaseDevice(str);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.huawei.hihealth.motion.service.stepcounter.Releasable
    public void release() {
        Log.d("healthOpenSDK_HealthDeviceOper", "release() ...");
        HandlerThread handlerThread = this.h;
        if (handlerThread != null) {
            handlerThread.quit();
            try {
                this.h.join(100L);
            } catch (InterruptedException unused) {
                Log.e("healthOpenSDK_HealthDeviceOper", "worker thread couldnt join");
            }
            this.h = null;
            WorkerHandler workerHandler = this.f12319b;
            if (workerHandler != null) {
                workerHandler.removeCallbacksAndMessages(null);
                this.f12319b = null;
            }
        }
        this.j.release();
    }

    public static void c() {
        synchronized (HealthDeviceOper.class) {
            IHealthDeviceOper iHealthDeviceOperE = e(null, null);
            if (iHealthDeviceOperE == null) {
                Log.w("healthOpenSDK_HealthDeviceOper", "no instance need release");
                d = null;
                f12317c = null;
            } else {
                iHealthDeviceOperE.release();
                d = null;
                f12317c = null;
            }
        }
    }
}
