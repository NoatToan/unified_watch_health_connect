package com.huawei.health.manager;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.IRealStepDataReport;
import com.huawei.health.icommon.IStepReport;
import com.huawei.health.manager.util.Consts;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogicalStepCounter;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class RealTimeStepDataReportHelper implements IStepReport {
    private Context d;
    private LogicalStepCounter f;
    private SensorManager k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f8069c = 0;
    private int h = 0;
    private int i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8068b = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IRealStepDataReport f8067a = null;
    private ExtendHandler e = null;
    private int g = 0;
    private final SensorEventListener j = new SensorEventListener() { // from class: com.huawei.health.manager.RealTimeStepDataReportHelper.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
        }
    };

    static /* synthetic */ int e(RealTimeStepDataReportHelper realTimeStepDataReportHelper) {
        int i = realTimeStepDataReportHelper.g;
        realTimeStepDataReportHelper.g = i + 1;
        return i;
    }

    public RealTimeStepDataReportHelper(Context context) {
        this.f = null;
        this.d = context;
        if (context != null) {
            this.f = LogicalStepCounter.d(context);
            Object systemService = this.d.getSystemService("sensor");
            if (systemService instanceof SensorManager) {
                this.k = (SensorManager) systemService;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.f8067a != null) {
            try {
                LogicalStepCounter logicalStepCounter = this.f;
                if (logicalStepCounter == null) {
                    return;
                }
                if (z) {
                    this.h = logicalStepCounter.a();
                }
                this.f8067a.report(this.h, this.i);
            } catch (RemoteException e) {
                LogUtil.e("Step_RTStepDataRptHlp", "RemoteException", e.getMessage());
            } catch (Exception unused) {
                LogUtil.e("Step_RTStepDataRptHlp", "Exception");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, String str) {
        if (context == null) {
            return;
        }
        String packageName = context.getPackageName();
        LogUtil.a("Step_RTStepDataRptHlp", "sendBroadcast() ", " action == ", str);
        Intent intent = new Intent();
        intent.setPackage(packageName);
        intent.setAction("com.huawei.health.track.broadcast");
        intent.putExtra("command_type", str);
        context.sendBroadcast(intent, Consts.d);
    }

    public boolean b(IRealStepDataReport iRealStepDataReport, int i) {
        if (iRealStepDataReport == null || i < 1000) {
            return false;
        }
        this.f8067a = iRealStepDataReport;
        this.f8068b = i;
        this.e = HandlerCenter.b(new Handler.Callback() { // from class: com.huawei.health.manager.RealTimeStepDataReportHelper.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1000) {
                    if (RealTimeStepDataReportHelper.this.e == null) {
                        ReleaseLogUtil.e("Step_RTStepDataRptHlp", "mExtendHandler is null.");
                        return false;
                    }
                    RealTimeStepDataReportHelper.this.a(TextUtils.equals((String) message.obj, "refresh"));
                    RealTimeStepDataReportHelper.this.e.sendEmptyMessage(1000, RealTimeStepDataReportHelper.this.f8068b);
                    return true;
                }
                if (i2 == 2000) {
                    LogUtil.a("Step_RTStepDataRptHlp", "try recovery Motion track ", Integer.valueOf(RealTimeStepDataReportHelper.this.g));
                    if (RealTimeStepDataReportHelper.this.g >= 3) {
                        return true;
                    }
                    RealTimeStepDataReportHelper realTimeStepDataReportHelper = RealTimeStepDataReportHelper.this;
                    realTimeStepDataReportHelper.c(realTimeStepDataReportHelper.d, "com.huawei.track.restart");
                    RealTimeStepDataReportHelper.e(RealTimeStepDataReportHelper.this);
                    return true;
                }
                if (i2 == 1002) {
                    RealTimeStepDataReportHelper.this.h = message.arg1;
                    return true;
                }
                if (i2 != 1003) {
                    return false;
                }
                RealTimeStepDataReportHelper.this.i = message.arg1;
                return true;
            }
        }, "flush_worker_thread");
        this.i = 0;
        LogicalStepCounter logicalStepCounter = this.f;
        if (logicalStepCounter != null) {
            logicalStepCounter.c(this);
        }
        SensorManager sensorManager = this.k;
        if (sensorManager != null) {
            try {
                ReleaseLogUtil.d("Step_RTStepDataRptHlp", " startReportRealTimeStepData registerListener = ", Boolean.valueOf(sensorManager.registerListener(this.j, sensorManager.getDefaultSensor(19), 0)));
            } catch (RuntimeException unused) {
                ReleaseLogUtil.a("Step_RTStepDataRptHlp", "startReportRealTimeStepData happened exception");
                return false;
            }
        }
        if (this.e != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1000;
            messageObtain.obj = "refresh";
            this.e.sendMessage(messageObtain);
        }
        return true;
    }

    public boolean c() {
        LogUtil.a("Step_RTStepDataRptHlp", "enter stopReportRealTimeStepData.");
        this.f8067a = null;
        this.i = 0;
        ExtendHandler extendHandler = this.e;
        if (extendHandler != null) {
            extendHandler.removeMessages(1000);
            this.e.quit(false);
        }
        LogicalStepCounter logicalStepCounter = this.f;
        if (logicalStepCounter != null) {
            logicalStepCounter.b(this);
        }
        SensorManager sensorManager = this.k;
        if (sensorManager == null) {
            return true;
        }
        sensorManager.unregisterListener(this.j, sensorManager.getDefaultSensor(19));
        return true;
    }

    public void b() {
        ExtendHandler extendHandler = this.e;
        if (extendHandler != null) {
            this.g = 0;
            extendHandler.sendEmptyMessage(2000, 60000L);
        }
    }

    public void a() {
        ExtendHandler extendHandler = this.e;
        if (extendHandler != null) {
            extendHandler.removeMessages(2000);
        }
    }

    public void d() {
        ExtendHandler extendHandler = this.e;
        if (extendHandler != null) {
            extendHandler.removeMessages(2000);
            this.e.sendEmptyMessage(2000, 60000L);
        }
    }

    @Override // com.huawei.health.icommon.IStepReport
    public void onStandStepChanged(int i) {
        if (this.e != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1002;
            messageObtain.arg1 = i;
            this.e.sendMessage(messageObtain);
        }
    }

    @Override // com.huawei.health.icommon.IStepReport
    public void onExtendStepChanged(long j, int i, int i2, int i3) {
        if (this.e != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1003;
            messageObtain.arg1 = i3;
            this.e.sendMessage(messageObtain);
        }
    }

    public void e() {
        SensorManager sensorManager = this.k;
        if (sensorManager != null) {
            boolean zRegisterListener = false;
            try {
                zRegisterListener = sensorManager.registerListener(this.j, sensorManager.getDefaultSensor(19), 0);
            } catch (RuntimeException unused) {
                ReleaseLogUtil.a("Step_RTStepDataRptHlp", "forceRefreshStepCounter happened exception");
            }
            long jA = LogUtil.a(5000, this.f8069c);
            if (jA != -1) {
                ReleaseLogUtil.d("Step_RTStepDataRptHlp", " fRefrushStepCt registerListener=", Boolean.valueOf(zRegisterListener));
                this.f8069c = jA;
            }
            SensorManager sensorManager2 = this.k;
            sensorManager2.unregisterListener(this.j, sensorManager2.getDefaultSensor(19));
            if (ScreenUtil.d()) {
                return;
            }
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                LogUtil.j("Step_RTStepDataRptHlp", "fRefrushStepCt ", e.getMessage());
            }
        }
    }
}
