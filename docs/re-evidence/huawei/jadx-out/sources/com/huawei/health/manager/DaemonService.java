package com.huawei.health.manager;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.icommon.SportIntensity;
import com.huawei.health.manager.backwork.StepInitWorkManager;
import com.huawei.health.manager.reconnect.ReconnectManager;
import com.huawei.health.manager.util.TimeUtil;
import com.huawei.health.manager.util.UploadStaticAlarmUtil;
import com.huawei.health.widget.YOYOWidgetProvider;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.threecircle.manager.WheelChairStateManager;
import defpackage.gsa;
import defpackage.lsl;
import health.compact.a.ApplicationLazyLoad;
import health.compact.a.BluetoothMonitor;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.DaemonServiceSpUtils;
import health.compact.a.DeviceUtil;
import health.compact.a.DfxMonitorCenter;
import health.compact.a.EnvironmentInfo;
import health.compact.a.HiCommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LogAnonymous;
import health.compact.a.LogSensor;
import health.compact.a.MigrationManager;
import health.compact.a.ProcessAliveMonitor;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.StepNotificationByHardWareUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class DaemonService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f8034a;
    private BroadcastReceiver e;
    private ExitByUserBroadcastReceiver i;
    private MainProcessStatusReceiver j;
    private StepCounterRemoteProxy g = null;
    private ActivityRecognitionProxy d = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthDeviceOperateRemoteProxy f8036c = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8035b = false;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ApplicationLazyLoad.a();
        j();
        long jB = SharedPerferenceUtils.b(this);
        ReleaseLogUtil.d("Step_DaemonService", "onCreate SHUTDOWN UTC:", Long.valueOf(jB), " current:", Long.valueOf(System.currentTimeMillis()));
        if (Math.abs(System.currentTimeMillis() - jB) < 10000) {
            ReleaseLogUtil.d("Step_DaemonService", "onCreate stop self");
            Process.killProcess(Process.myPid());
        } else {
            SharedPerferenceUtils.a((Context) this, 0L);
        }
        DfxMonitorCenter.b();
        if (!"Athene4".equals(SharedPerferenceUtils.aa(this))) {
            MigrationManager.c(this);
        }
        if (SharedPerferenceUtils.t(this) == 0) {
            SharedPerferenceUtils.e((Context) this, (int) TimeUtil.e(System.currentTimeMillis()));
        }
        SharedPerferenceUtils.e(this, String.valueOf(System.currentTimeMillis()));
        this.g = new StepCounterRemoteProxy(this);
        BluetoothMonitor.d().b();
        g();
        UploadStaticAlarmUtil.d(this, lsl.r(System.currentTimeMillis()) + 86100000 + UploadStaticAlarmUtil.f8153c);
        UploadStaticAlarmUtil.c(this, lsl.r(System.currentTimeMillis()) + 84000000 + UploadStaticAlarmUtil.d);
        o();
        if (SharedPerferenceUtils.af(this)) {
            DeviceUtil.d(this, true, null);
        }
        i();
        if (SystemInfo.j()) {
            YOYOWidgetProvider.d(this);
            YOYOWidgetProvider.b(this);
            ReleaseLogUtil.d("Step_DaemonService", "onCreate HonorYoyoWidgetProvider");
        }
        gsa.e(this);
        if (!CommonUtil.bg()) {
            ThirdLoginDataStorageUtil.getAccessTokenFromDb();
        }
        a();
    }

    private void a() {
        b();
        h();
        ReconnectManager.d().b();
        f();
        StepInitWorkManager.e();
        WheelChairStateManager.a().c();
    }

    private void i() {
        this.e = new SportIntensityReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("DOWNLOAD_INTENSITY_FILE");
        BroadcastManagerUtil.d(BaseApplication.b(), this.e, intentFilter);
        this.f8034a = new LoginSuccessReceiver();
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.huawei.plugin.account.login");
        BroadcastManagerUtil.d(BaseApplication.b(), this.f8034a, intentFilter2);
    }

    private void f() {
        if (this.j == null) {
            this.j = new MainProcessStatusReceiver();
        }
        BroadcastManager.a(this.j);
    }

    private void j() {
        if (EnvironmentInfo.g()) {
            Context contextB = BaseApplication.b();
            if (TextUtils.isEmpty(DaemonServiceSpUtils.a(contextB))) {
                DaemonServiceSpUtils.b(contextB, !(DaemonServiceSpUtils.b(contextB) || SharedPerferenceUtils.af(contextB)));
            }
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    class SportIntensityReceiver extends BroadcastReceiver {
        private SportIntensityReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ReleaseLogUtil.d("Step_DaemonService", "SportIntensityReceiver received");
            if (intent == null || !"DOWNLOAD_INTENSITY_FILE".equals(intent.getAction())) {
                return;
            }
            SportIntensity.a(DaemonService.this.getApplicationContext()).e();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    class LoginSuccessReceiver extends BroadcastReceiver {
        private LoginSuccessReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ReleaseLogUtil.d("Step_DaemonService", "LoginSuccessReceiver received");
            if (intent == null) {
                ReleaseLogUtil.a("Step_DaemonService", "LoginSuccessReceiver intent is null");
            } else if ("com.huawei.plugin.account.login".equals(intent.getAction()) && SystemInfo.j()) {
                YOYOWidgetProvider.d(BaseApplication.b());
                YOYOWidgetProvider.b(BaseApplication.b());
                ReleaseLogUtil.d("Step_DaemonService", "LoginSuccessReceiver HonorYoyoWidgetProvider");
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.d("Step_DaemonService", "onDestroy");
        WheelChairStateManager.b();
        BluetoothMonitor.d().a();
        if (this.e != null) {
            BroadcastManagerUtil.d(BaseApplication.b(), this.e);
            this.e = null;
        }
        if (this.f8034a != null) {
            BroadcastManagerUtil.d(BaseApplication.b(), this.f8034a);
            this.f8034a = null;
        }
        if (SystemInfo.j()) {
            YOYOWidgetProvider.d(this);
            ReleaseLogUtil.d("Step_DaemonService", "unregisterSportData HonorYoyoWidgetProvider");
        }
        gsa.b(this);
        this.g.release();
        Process.killProcess(Process.myPid());
        if (this.i != null) {
            LogUtil.a("Step_DaemonService", "onDestroy unregisterReceiverPackage()");
            BroadcastManagerUtil.d(getApplicationContext(), this.i);
            this.i = null;
        }
        if (this.j != null) {
            LogUtil.a("Step_DaemonService", "onDestroy unregister mMainProcessStatusReceiver");
            BroadcastManager.m(this.j);
            this.j = null;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            return this.g;
        }
        ReleaseLogUtil.d("Step_DaemonService", "onBind ", intent.getAction());
        String action = intent.getAction();
        if ("com.huawei.health.device.oper".equals(action)) {
            LogUtil.d("Step_DaemonService", "intent.getAction === ", action);
            if (this.f8036c == null) {
                this.f8036c = new HealthDeviceOperateRemoteProxy(this);
            }
            return this.f8036c;
        }
        return this.g;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            super.onStartCommand(intent, i, i2);
            if (intent == null || !"account_sync".equals(intent.getStringExtra("START_SOURCE_KEY"))) {
                ReleaseLogUtil.d("Step_DaemonService", "onStartCommand from other");
            } else {
                ReleaseLogUtil.d("Step_DaemonService", "onStartCommand from accountSync");
            }
            e(intent);
            if (intent != null && this.g != null) {
                if (intent.hasExtra("THE_MAIN_UI_START_DAEMON_SERVICE")) {
                    ReleaseLogUtil.d("Step_DaemonService", "onStartCommand from ui");
                    d(intent);
                } else if (intent.hasExtra("flushLog")) {
                    ReleaseLogUtil.d("Step_DaemonService", "onStartCommand flush log");
                    c(intent);
                } else if (ThirdLoginDataStorageUtil.START_DAEMON_FOR_REFRESH_TOKEN.equals(intent.getAction())) {
                    ReleaseLogUtil.d("Step_DaemonService", "onStartCommand refresh token");
                    if (Boolean.parseBoolean(KeyValDbManager.d(BaseApplication.b()).c("key_wether_to_auth")) && LoginInit.getInstance(BaseApplication.b()).getIsLogined()) {
                        LoginInit.getInstance(BaseApplication.b()).refreshAccessToken(null);
                    }
                } else if (!"com.huawei.daemonservice".equals(intent.getAction())) {
                    ReleaseLogUtil.d("Step_DaemonService", "onStartCommand else:", intent.getAction());
                } else {
                    if (!f(intent) && !a(intent)) {
                        ReleaseLogUtil.d("Step_DaemonService", "onStartCommand ACTION_START_DAEMON_SERVICE else");
                    }
                    ReleaseLogUtil.d("Step_DaemonService", "onStartCommand start sync");
                    return 1;
                }
                if (!b(intent)) {
                    this.g.dealBroadcastEvents(intent);
                }
                ReconnectManager.d().b(this);
                return 1;
            }
            ReleaseLogUtil.e("Step_DaemonService", "onStartCommand intent/mStepCounterProxy is null");
            return 1;
        } catch (BadParcelableException e) {
            LogUtil.e("Step_DaemonService", "onStartCommand BadParcelableException = ", e.getMessage());
        } catch (ClassCastException e2) {
            LogUtil.e("Step_DaemonService", "onStartCommand ClassCastException = ", e2.getMessage());
        } catch (Exception e3) {
            ReleaseLogUtil.a("Step_DaemonService", "onStartCommand Exception = ", LogAnonymous.b(e3));
        }
    }

    private void e(Intent intent) {
        String stringExtra;
        if (!this.f8035b) {
            if (!intent.hasExtra("START_SOURCE_KEY")) {
                stringExtra = "UNKNOW";
            } else {
                stringExtra = intent.getStringExtra("START_SOURCE_KEY");
            }
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("brand", String.valueOf(Build.BRAND));
            linkedHashMap.put("androidOS", String.valueOf(Build.VERSION.SDK_INT));
            linkedHashMap.put("devModel", Build.MODEL);
            linkedHashMap.put("isHw", String.valueOf(CommonUtil.bg()));
            linkedHashMap.put("source", stringExtra);
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_ACCOUNT_SYNC_DAEMON_2129047.value(), linkedHashMap);
            if ("account_sync".equals(stringExtra)) {
                ReleaseLogUtil.d("Step_DaemonService", "reportAccountSyncSuccess");
            }
        }
        this.f8035b = true;
    }

    private boolean f(Intent intent) {
        if (!intent.hasExtra("startSyncData")) {
            LogUtil.a("Step_DaemonService", "not startSyncData");
            return false;
        }
        LogUtil.a("Step_DaemonService", "startSyncData");
        DeviceUtil.e();
        return true;
    }

    private boolean a(Intent intent) {
        if (!intent.hasExtra("phoneServiceStarted")) {
            LogUtil.a("Step_DaemonService", "not phoneServiceStarted");
            return false;
        }
        LogUtil.a("Step_DaemonService", "phoneServiceStarted");
        ReconnectManager.d().e(this);
        return true;
    }

    private void d(Intent intent) {
        if (!intent.getBooleanExtra("THE_MAIN_UI_START_DAEMON_SERVICE", false) || DaemonServiceSpUtils.b(this)) {
            return;
        }
        e();
    }

    private void e() {
        ProcessAliveMonitor.c(this).e();
        SharedPerferenceUtils.c(this);
        DaemonServiceSpUtils.d(this);
    }

    private void c(Intent intent) {
        try {
            if (intent.getBooleanExtra("flushLog", false)) {
                c();
            }
        } catch (ClassCastException e) {
            LogUtil.e("Step_DaemonService", "isNeedFlushLog exception = ", e.getMessage());
        } catch (Exception e2) {
            LogUtil.e("Step_DaemonService", "isNeedFlushLog Exception = ", LogAnonymous.b(e2));
        }
    }

    private void c() {
        LogUtil.a();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.huawei.health.manager.DaemonService.1
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.h();
            }
        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        LogSensor.e();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.huawei.health.manager.DaemonService.2
            @Override // java.lang.Runnable
            public void run() {
                LogSensor.a();
            }
        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    private void g() {
        ThreadPoolManager.c().a("setArModuleAbility", new Runnable() { // from class: com.huawei.health.manager.DaemonService$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8037a.d();
            }
        });
        ActivityRecognitionProxy activityRecognitionProxy = new ActivityRecognitionProxy(this);
        this.d = activityRecognitionProxy;
        activityRecognitionProxy.d();
    }

    private boolean b(Intent intent) {
        ActivityRecognitionProxy activityRecognitionProxy = this.d;
        if (activityRecognitionProxy != null) {
            return activityRecognitionProxy.a(intent);
        }
        return false;
    }

    private void o() {
        Intent intent = new Intent(this, (Class<?>) PreDaemonService.class);
        intent.setPackage(getPackageName());
        try {
            stopService(intent);
        } catch (IllegalStateException | SecurityException e) {
            LogUtil.e("Step_DaemonService", LogAnonymous.b(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void d() {
        if ((CommonUtil.bg() && CommonUtil.ch()) || CommonUtil.bd()) {
            if (StepNotificationByHardWareUtils.a("sensor.activity_recognition")) {
                KeyValDbManager.d(BaseApplication.b()).c("SUPPORT_AR_ABILITY", "1", null);
            } else {
                KeyValDbManager.d(BaseApplication.b()).c("SUPPORT_AR_ABILITY", "0", null);
            }
        }
    }

    private void b() {
        LogUtil.a("Step_DaemonService", "enter cancelOneHourSyncAlarm.");
        AlarmManager alarmManagerM = CommonUtil.m();
        if (alarmManagerM != null) {
            alarmManagerM.cancel(PendingIntent.getBroadcast(BaseApplication.b(), 0, new Intent("com.huawei.hihealth.action_one_hour_sync"), 67108864));
            ReleaseLogUtil.d("Step_DaemonService", "cancelOneHourSyncAlarm success.");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class ExitByUserBroadcastReceiver extends BroadcastReceiver {
        private ExitByUserBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"com.huawei.health.user.exit".equals(intent.getAction())) {
                return;
            }
            LogUtil.a("ExitByUserBroadcastReceiver", "### exit by user");
            Process.killProcess(Process.myPid());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class MainProcessStatusReceiver extends BroadcastReceiver {
        private MainProcessStatusReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra("processName");
            boolean booleanExtra = intent.getBooleanExtra("isRunning", false);
            LogUtil.a("MainProcessStatusReceiver", "processName: ", stringExtra, " isRunning: ", Boolean.valueOf(booleanExtra), " time: ", Long.valueOf(intent.getLongExtra("time", 0L)));
            if ("com.huawei.health".equals(stringExtra)) {
                HiCommonUtil.d = booleanExtra;
            }
        }
    }

    private void h() {
        LogUtil.a("Step_DaemonService", "registerExitBroadcast enter!");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.user.exit");
        ExitByUserBroadcastReceiver exitByUserBroadcastReceiver = new ExitByUserBroadcastReceiver();
        this.i = exitByUserBroadcastReceiver;
        BroadcastManagerUtil.d(this, exitByUserBroadcastReceiver, intentFilter);
    }
}
