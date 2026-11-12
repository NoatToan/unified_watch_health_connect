package com.huawei.health.manager;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.IBinder;
import android.telephony.TelephonyManager;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.health.fwk.BaseStepCounter;
import com.huawei.health.manager.util.TimeUtil;
import health.compact.a.DaemonServiceSpUtils;
import health.compact.a.EmuiBuild;
import health.compact.a.HarmonyBuild;
import health.compact.a.HnStandStepCounter;
import health.compact.a.HwStandStepCounter;
import health.compact.a.LogUtil;
import health.compact.a.LogicalStepCounter;
import health.compact.a.MagicBuild;
import health.compact.a.ProcessAliveMonitor;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.StepCounterSupport;

/* JADX INFO: loaded from: classes2.dex */
public class PreDaemonService extends Service implements SensorEventListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f8066c;
    private SensorManager g = null;
    private int d = -1;
    private boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BaseStepCounter f8065b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MyServiceConnection f8064a = new MyServiceConnection();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        if (sensorEvent == null || sensorEvent.sensor.getType() != 19 || (fArr = sensorEvent.values) == null || fArr.length == 0) {
            return;
        }
        int i = (int) fArr[0];
        LogUtil.b("Step_PreDaemonService", "onSensorChanged: ", Integer.valueOf(i));
        if (this.d == -1) {
            this.d = i;
        }
        if (i - this.d > 10) {
            c();
            Intent intent = new Intent(this, (Class<?>) DaemonService.class);
            intent.setPackage(this.f8066c.getPackageName());
            LogicalStepCounter.d(this.f8066c).e(i - this.d);
            try {
                startService(intent);
            } catch (IllegalStateException e) {
                LogUtil.e("Step_PreDaemonService", "PreDaemonService onSensorChanged", e.getMessage());
            } catch (SecurityException e2) {
                LogUtil.e("Step_PreDaemonService", "PreDaemonService onSensorChanged", e2.getMessage());
            }
            stopSelf();
        }
    }

    private void c() {
        ProcessAliveMonitor.c(this).e();
        SharedPerferenceUtils.c(this);
        DaemonServiceSpUtils.d(this);
    }

    @Override // android.app.Service
    public void onCreate() {
        LogUtil.b("Step_PreDaemonService", "init ...");
        super.onCreate();
        Context applicationContext = getApplicationContext();
        this.f8066c = applicationContext;
        if (SharedPerferenceUtils.p(applicationContext)) {
            if (SharedPerferenceUtils.t(this) == 0) {
                SharedPerferenceUtils.e((Context) this, (int) TimeUtil.e(System.currentTimeMillis()));
            }
            if (!e()) {
                ReleaseLogUtil.d("Step_PreDaemonService", "this system not support pre Step.");
                return;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ReleaseLogUtil.d("Step_PreDaemonService", "this system not support pre Step.");
                return;
            }
            Object systemService = getSystemService("sensor");
            if (systemService instanceof SensorManager) {
                LogUtil.b("Step_PreDaemonService", "onCreate object is not instanceof SensorManager");
                SensorManager sensorManager = (SensorManager) systemService;
                this.g = sensorManager;
                try {
                    ReleaseLogUtil.c("Step_PreDaemonService", "onCreate registerListener ", Boolean.valueOf(sensorManager.registerListener(this, sensorManager.getDefaultSensor(19), 0)));
                } catch (RuntimeException unused) {
                    ReleaseLogUtil.b("Step_PreDaemonService", "onCreate happened exception");
                }
            }
            if (b(this.f8066c)) {
                return;
            }
            Intent intentE = StepCounterSupport.e(this);
            try {
                if (intentE != null) {
                    this.e = bindService(intentE, this.f8064a, 1);
                } else {
                    LogUtil.b("Step_PreDaemonService", "intent =null");
                }
            } catch (SecurityException e) {
                LogUtil.b("Step_PreDaemonService", e.getMessage());
            }
        }
    }

    public static boolean e() {
        return EmuiBuild.b() || EmuiBuild.f36544b || HarmonyBuild.e;
    }

    private boolean b(Context context) {
        return SystemInfo.e(true) || !e(context);
    }

    private boolean e(Context context) {
        if (context == null) {
            LogUtil.d("Step_PreDaemonService", "isTelephonyEnable() context is null!!");
            return false;
        }
        Object systemService = context.getSystemService("phone");
        return (systemService instanceof TelephonyManager) && ((TelephonyManager) systemService).getPhoneType() != 0;
    }

    @Override // android.app.Service
    public void onDestroy() {
        LogUtil.b("Step_PreDaemonService", "onDestroy");
        super.onDestroy();
        if (SharedPerferenceUtils.p(this.f8066c)) {
            if (!e()) {
                ReleaseLogUtil.d("Step_PreDaemonService", "this system not support pre Step.");
                return;
            }
            SensorManager sensorManager = this.g;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
            if (this.e) {
                unbindService(this.f8064a);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        LogUtil.b("Step_PreDaemonService", "Not yet implemented");
        return null;
    }

    class MyServiceConnection implements ServiceConnection {
        private MyServiceConnection() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str = Build.BRAND;
            PreDaemonService.this.f8065b = new HwStandStepCounter(iBinder);
            if ("HONOR".equalsIgnoreCase(str) && MagicBuild.f36615a && MagicBuild.f36616b >= 33) {
                PreDaemonService.this.f8065b = new HnStandStepCounter(iBinder);
            }
            PreDaemonService.this.f8065b.openStepCounter();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (PreDaemonService.this.f8065b != null) {
                PreDaemonService.this.f8065b = null;
                ReleaseLogUtil.c("Step_PreDaemonService", "MyServiceConnection onServiceDisconnected ");
            }
        }
    }
}
