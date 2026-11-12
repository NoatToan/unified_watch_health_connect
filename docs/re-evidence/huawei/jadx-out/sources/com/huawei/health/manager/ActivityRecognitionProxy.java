package com.huawei.health.manager;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.hihonor.android.location.activityrecognition.HwActivityRecognitionEvent;
import com.huawei.aifitness.mobilesensor.AlgSensorListener;
import com.huawei.aifitness.mobilesensor.MobileSensorManager;
import com.huawei.android.location.activityrecognition.HwActivityChangedEvent;
import com.huawei.android.location.activityrecognition.HwActivityChangedExtendEvent;
import com.huawei.android.location.activityrecognition.HwActivityRecognition;
import com.huawei.android.location.activityrecognition.HwActivityRecognitionExtendEvent;
import com.huawei.android.location.activityrecognition.HwActivityRecognitionHardwareSink;
import com.huawei.android.location.activityrecognition.HwActivityRecognitionServiceConnection;
import com.huawei.android.location.activityrecognition.HwEnvironmentChangedEvent;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.icommon.ISimpleResultCallback;
import com.huawei.health.manager.util.AlarmManagerUtils;
import com.huawei.health.manager.util.Consts;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ppt;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LogAnonymous;
import health.compact.a.LogicalStepCounter;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPerferenceUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityRecognitionProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AlarmManagerUtils f8017b;
    private PowerManager.WakeLock e;
    private HwActivityRecognition f;
    private com.hihonor.android.location.activityrecognition.HwActivityRecognition i;
    private PowerManager j;
    private SportStatusDetectManager l;
    private final SensorEventListener k = new SensorEventListener() { // from class: com.huawei.health.manager.ActivityRecognitionProxy.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
        }
    };
    private boolean h = false;
    private int o = 40;
    private int m = 180;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f8018c = null;
    private Runnable n = null;
    private boolean g = false;
    private SportStatusDetectManager.AutoRecognizeStatus d = SportStatusDetectManager.AutoRecognizeStatus.IDLE;

    public ActivityRecognitionProxy(Context context) {
        this.f8017b = null;
        if (context != null) {
            this.f8016a = context;
            this.f8017b = new AlarmManagerUtils(context);
            if (CommonUtil.bj()) {
                this.i = new com.hihonor.android.location.activityrecognition.HwActivityRecognition(this.f8016a);
            } else {
                try {
                    this.f = new HwActivityRecognition(this.f8016a);
                } catch (NoClassDefFoundError unused) {
                    ReleaseLogUtil.b("Track_ActRecogProxy", "init HwActivityRecognition error");
                }
            }
            Object systemService = this.f8016a.getSystemService("power");
            if (systemService instanceof PowerManager) {
                this.j = (PowerManager) systemService;
            }
            PowerManager powerManager = this.j;
            if (powerManager != null) {
                this.e = powerManager.newWakeLock(1, "Health_AutoTrack");
            }
        }
    }

    public void d() {
        boolean zC = AuthorizationUtils.c(this.f8016a);
        d(zC);
        if (CommonUtil.bj()) {
            a(zC);
        } else {
            c(zC);
            b(zC);
        }
    }

    private void b(final boolean z) {
        if (ppt.a()) {
            this.l = new SportStatusDetectManager(new TriggerSportInterface() { // from class: com.huawei.health.manager.ActivityRecognitionProxy.2
                @Override // com.huawei.health.manager.TriggerSportInterface
                public void startWalking(Bundle bundle) {
                    ReleaseLogUtil.c("Track_ActRecogProxy", "startWalking");
                    ActivityRecognitionProxy activityRecognitionProxy = ActivityRecognitionProxy.this;
                    activityRecognitionProxy.a(activityRecognitionProxy.f8016a, "com.huawei.health.track.fastwalking", bundle);
                }

                @Override // com.huawei.health.manager.TriggerSportInterface
                public void startRunning(Bundle bundle) {
                    ReleaseLogUtil.c("Track_ActRecogProxy", "startRunning");
                    ActivityRecognitionProxy activityRecognitionProxy = ActivityRecognitionProxy.this;
                    activityRecognitionProxy.a(activityRecognitionProxy.f8016a, "com.huawei.health.track.running", bundle);
                }

                @Override // com.huawei.health.manager.TriggerSportInterface
                public void endSport() {
                    ReleaseLogUtil.c("Track_ActRecogProxy", "end sport");
                    ActivityRecognitionProxy activityRecognitionProxy = ActivityRecognitionProxy.this;
                    activityRecognitionProxy.d(activityRecognitionProxy.f8016a, "com.huawei.health.AUTO_TRACK_END");
                }
            });
            try {
                MobileSensorManager.getInstance().initSensor(BaseApplication.b(), new AlgSensorListener() { // from class: com.huawei.health.manager.ActivityRecognitionProxy.3
                    @Override // com.huawei.aifitness.mobilesensor.AlgSensorListener
                    public void getAlgResult(int i) {
                        SportStatusDetectManager.AutoRecognizeStatus autoRecognizeStatus;
                        if (z) {
                            if (i == 2) {
                                ReleaseLogUtil.c("Track_ActRecogProxy", "sensor enter run");
                                autoRecognizeStatus = SportStatusDetectManager.AutoRecognizeStatus.RUN;
                            } else if (i == 1) {
                                ReleaseLogUtil.c("Track_ActRecogProxy", "sensor enter WALK");
                                autoRecognizeStatus = SportStatusDetectManager.AutoRecognizeStatus.WALK;
                            } else {
                                ReleaseLogUtil.c("Track_ActRecogProxy", "sensor enter IDLE");
                                autoRecognizeStatus = SportStatusDetectManager.AutoRecognizeStatus.IDLE;
                            }
                            ActivityRecognitionProxy.this.d = autoRecognizeStatus;
                            ActivityRecognitionProxy.this.l.a(autoRecognizeStatus);
                        }
                    }
                });
            } catch (Throwable th) {
                ReleaseLogUtil.b("Track_ActRecogProxy", "initSensor error", LogAnonymous.b(th));
            }
        }
    }

    private void d(boolean z) {
        if (!z) {
            LogUtil.j("Track_ActRecogProxy", "initArStateListener is not authorized");
            return;
        }
        String[] strArrD = SharedPerferenceUtils.d(this.f8016a);
        if (strArrD != null) {
            try {
                if (strArrD.length >= 3) {
                    boolean z2 = Boolean.parseBoolean(strArrD[0]);
                    this.h = z2;
                    ReleaseLogUtil.c("Track_ActRecogProxy", "mIsEnableAutoTrack status: ", Boolean.valueOf(z2));
                    if (this.h) {
                        int i = Integer.parseInt(strArrD[1]);
                        int i2 = Integer.parseInt(strArrD[2]);
                        AlarmManagerUtils alarmManagerUtils = this.f8017b;
                        if (alarmManagerUtils != null) {
                            alarmManagerUtils.d(i, i2);
                        }
                        this.o = i;
                        this.m = i2;
                    }
                }
            } catch (NumberFormatException e) {
                LogUtil.e("Track_ActRecogProxy", "initConfig NumberFormatException ", e.getMessage());
            }
        }
    }

    private void c(final boolean z) {
        HwActivityRecognition hwActivityRecognition = this.f;
        if (hwActivityRecognition == null) {
            ReleaseLogUtil.c("Track_ActRecogProxy", "connectWithArModule mHwActivityRecognition is null");
            return;
        }
        try {
            hwActivityRecognition.e(new HwActivityRecognitionHardwareSink() { // from class: com.huawei.health.manager.ActivityRecognitionProxy.4
                @Override // com.huawei.android.location.activityrecognition.HwActivityRecognitionHardwareSink
                public void onActivityExtendChanged(HwActivityChangedExtendEvent hwActivityChangedExtendEvent) {
                }

                @Override // com.huawei.android.location.activityrecognition.HwActivityRecognitionHardwareSink
                public void onEnvironmentChanged(HwEnvironmentChangedEvent hwEnvironmentChangedEvent) {
                }

                @Override // com.huawei.android.location.activityrecognition.HwActivityRecognitionHardwareSink
                public void onActivityChanged(HwActivityChangedEvent hwActivityChangedEvent) {
                    ActivityRecognitionProxy.this.e(hwActivityChangedEvent, z);
                }
            }, new HwActivityRecognitionServiceConnection() { // from class: com.huawei.health.manager.ActivityRecognitionProxy.5
                @Override // com.huawei.android.location.activityrecognition.HwActivityRecognitionServiceConnection
                public void onServiceConnected() {
                    ActivityRecognitionProxy.this.b();
                }

                @Override // com.huawei.android.location.activityrecognition.HwActivityRecognitionServiceConnection
                public void onServiceDisconnected() {
                    if (ActivityRecognitionProxy.this.h) {
                        LogUtil.a("Track_ActRecogProxy", "HwActivityRecognition onServiceDisconnected");
                        if (ppt.a()) {
                            return;
                        }
                        ActivityRecognitionProxy activityRecognitionProxy = ActivityRecognitionProxy.this;
                        activityRecognitionProxy.d(activityRecognitionProxy.f8016a, "com.huawei.health.AUTO_TRACK_END");
                    }
                }
            });
            LogUtil.a("Track_ActRecogProxy", "connectWithArModule finished ");
        } catch (SecurityException e) {
            LogUtil.a("Track_ActRecogProxy", "connectArModule SecurityException", e.getMessage());
        }
    }

    private void a(final boolean z) {
        try {
            this.i.d(new com.hihonor.android.location.activityrecognition.HwActivityRecognitionHardwareSink() { // from class: com.huawei.health.manager.ActivityRecognitionProxy.6
                @Override // com.hihonor.android.location.activityrecognition.HwActivityRecognitionHardwareSink
                public void onActivityExtendChanged(com.hihonor.android.location.activityrecognition.HwActivityChangedExtendEvent hwActivityChangedExtendEvent) {
                }

                @Override // com.hihonor.android.location.activityrecognition.HwActivityRecognitionHardwareSink
                public void onEnvironmentChanged(com.hihonor.android.location.activityrecognition.HwEnvironmentChangedEvent hwEnvironmentChangedEvent) {
                }

                @Override // com.hihonor.android.location.activityrecognition.HwActivityRecognitionHardwareSink
                public void onActivityChanged(com.hihonor.android.location.activityrecognition.HwActivityChangedEvent hwActivityChangedEvent) {
                    ActivityRecognitionProxy.this.b(hwActivityChangedEvent, z);
                }
            }, new com.hihonor.android.location.activityrecognition.HwActivityRecognitionServiceConnection() { // from class: com.huawei.health.manager.ActivityRecognitionProxy.7
                @Override // com.hihonor.android.location.activityrecognition.HwActivityRecognitionServiceConnection
                public void onServiceConnected() {
                    ActivityRecognitionProxy.this.t();
                    ActivityRecognitionProxy.this.j();
                }

                @Override // com.hihonor.android.location.activityrecognition.HwActivityRecognitionServiceConnection
                public void onServiceDisconnected() {
                    if (ActivityRecognitionProxy.this.h) {
                        LogUtil.a("Track_ActRecogProxy", "HnActivityRecognition onServiceDisconnected");
                        ActivityRecognitionProxy activityRecognitionProxy = ActivityRecognitionProxy.this;
                        activityRecognitionProxy.d(activityRecognitionProxy.f8016a, "com.huawei.health.AUTO_TRACK_END");
                    }
                }
            });
            LogUtil.a("Track_ActRecogProxy", "connectWithHnArModule finished ");
        } catch (SecurityException e) {
            LogUtil.a("Track_ActRecogProxy", "connectWithHnArModule SecurityException", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.hihonor.android.location.activityrecognition.HwActivityChangedEvent hwActivityChangedEvent, boolean z) {
        if (!z) {
            LogUtil.j("Track_ActRecogProxy", "connectWithHnArModule onActivityChanged is not authorized");
            return;
        }
        if (this.h) {
            if (hwActivityChangedEvent == null) {
                LogUtil.a("Track_ActRecogProxy", "connectWithHnArModule hwActivityChangedEvent == null");
                return;
            }
            Iterator<HwActivityRecognitionEvent> it = hwActivityChangedEvent.getActivityRecognitionEvents().iterator();
            while (it.hasNext()) {
                d(it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (!this.h) {
            LogUtil.j("Track_ActRecogProxy", "connectWithHnArModule disconnectService");
            this.i.b();
        } else {
            LogUtil.a("Track_ActRecogProxy", "connectWithHnArModule HwActivityRecognitionServiceConnection onServiceConnected()");
            this.i.d("android.activity_recognition.running", 1, 30000000000L);
            this.i.d("android.activity_recognition.running", 2, 30000000000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        t();
        if (!this.h) {
            LogUtil.j("Track_ActRecogProxy", "connectWithArModule disconnectService");
            this.f.a();
            return;
        }
        LogUtil.a("Track_ActRecogProxy", "HwActivityRecognitionServiceConnection onServiceConnected()");
        this.f.b("android.activity_recognition.running", 1, 30000000000L);
        this.f.b("android.activity_recognition.running", 2, 30000000000L);
        if (ppt.a()) {
            this.f.b("android.activity_recognition.walking", 1, 30000000000L);
            this.f.b("android.activity_recognition.walking", 2, 30000000000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HwActivityChangedEvent hwActivityChangedEvent, boolean z) {
        if (ppt.a()) {
            return;
        }
        if (!z) {
            LogUtil.j("Track_ActRecogProxy", "connectWithArModule onActivityChanged is not authorized");
            return;
        }
        if (this.h) {
            if (hwActivityChangedEvent == null) {
                LogUtil.a("Track_ActRecogProxy", "hwActivityChangedEvent == null");
                return;
            }
            Iterator<com.huawei.android.location.activityrecognition.HwActivityRecognitionEvent> it = hwActivityChangedEvent.getActivityRecognitionEvents().iterator();
            while (it.hasNext()) {
                e(it.next());
            }
        }
    }

    private void a() {
        if (this.g) {
            this.g = false;
            q();
            d(this.f8016a, "com.huawei.health.AUTO_TRACK_END");
        }
        if (CommonUtil.bj()) {
            this.i.b();
        } else {
            HwActivityRecognition hwActivityRecognition = this.f;
            if (hwActivityRecognition != null) {
                hwActivityRecognition.a();
            }
            e();
        }
        LogUtil.a("Track_ActRecogProxy", "disconnectWithArModule finished ");
    }

    private void e() {
        if (ppt.a()) {
            try {
                MobileSensorManager.getInstance().closeSensor(this.f8016a);
            } catch (Throwable th) {
                ReleaseLogUtil.b("Track_ActRecogProxy", "closeSensor error", LogAnonymous.b(th));
            }
            SportStatusDetectManager sportStatusDetectManager = this.l;
            if (sportStatusDetectManager != null) {
                sportStatusDetectManager.a(SportStatusDetectManager.AutoRecognizeStatus.IDLE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (CommonUtil.bj()) {
            if (this.i == null) {
                LogUtil.j("Track_ActRecogProxy", "mHnActivityRecognition is null.");
                return;
            }
            if ((!CommonUtil.as() || CommonUtil.ch()) && !CommonUtil.bd()) {
                return;
            }
            int iJ = this.i.j();
            LogUtil.a("Track_ActRecogProxy", "getHnArModuleAbility supportedModule = ", Integer.valueOf(iJ));
            b(iJ);
            return;
        }
        if (this.f == null) {
            LogUtil.j("Track_ActRecogProxy", "mHwActivityRecognition is null.");
            return;
        }
        if ((!CommonUtil.as() || CommonUtil.ch()) && !CommonUtil.bd()) {
            return;
        }
        int iG = this.f.g();
        LogUtil.a("Track_ActRecogProxy", "getArModuleAbility supportedModule = ", Integer.valueOf(iG));
        b(iG);
    }

    private void b(int i) {
        if (i == 1 || i == 3) {
            KeyValDbManager.d(this.f8016a).c("SUPPORT_AR_ABILITY", "1", null);
        } else {
            KeyValDbManager.d(this.f8016a).c("SUPPORT_AR_ABILITY", "0", null);
        }
    }

    private void e(com.huawei.android.location.activityrecognition.HwActivityRecognitionEvent hwActivityRecognitionEvent) {
        String activity = hwActivityRecognitionEvent.getActivity();
        activity.hashCode();
        if (activity.equals("android.activity_recognition.walking")) {
            a(hwActivityRecognitionEvent);
        } else if (activity.equals("android.activity_recognition.running")) {
            b(hwActivityRecognitionEvent);
        } else {
            LogUtil.j("Track_ActRecogProxy", "processActivityChange is default");
        }
    }

    private void b(com.huawei.android.location.activityrecognition.HwActivityRecognitionEvent hwActivityRecognitionEvent) {
        int eventType = hwActivityRecognitionEvent.getEventType();
        if (eventType != 1) {
            if (eventType == 2) {
                h();
                return;
            } else {
                LogUtil.j("Track_ActRecogProxy", "processActivityChange ACTIVITY_RUNNING ", "invalid event type");
                return;
            }
        }
        LogUtil.a("Track_ActRecogProxy", "onActivityChanged enter running");
        AlarmManagerUtils alarmManagerUtils = this.f8017b;
        if (alarmManagerUtils != null) {
            alarmManagerUtils.b(AlarmManagerUtils.SportTypeUtils.STATE_ENTER_RUNNING);
        }
    }

    private void a(com.huawei.android.location.activityrecognition.HwActivityRecognitionEvent hwActivityRecognitionEvent) {
        int eventType = hwActivityRecognitionEvent.getEventType();
        if (eventType == 1) {
            LogUtil.a("Track_ActRecogProxy", "onActivityChanged enter fast walking");
            AlarmManagerUtils alarmManagerUtils = this.f8017b;
            if (alarmManagerUtils != null) {
                alarmManagerUtils.b(AlarmManagerUtils.SportTypeUtils.STATE_ENTER_WALKING);
                return;
            }
            return;
        }
        if (eventType == 2) {
            LogUtil.a("Track_ActRecogProxy", "onActivityChanged exit fast walking");
            AlarmManagerUtils alarmManagerUtils2 = this.f8017b;
            if (alarmManagerUtils2 != null) {
                alarmManagerUtils2.b(AlarmManagerUtils.SportTypeUtils.STATE_EXIT_WALKING);
                return;
            }
            return;
        }
        LogUtil.j("Track_ActRecogProxy", "processActivityChange ACTIVITY_FAST_WALKING ", "invalid event type");
    }

    private void d(HwActivityRecognitionEvent hwActivityRecognitionEvent) {
        LogUtil.a("Track_ActRecogProxy", "processHnActivityChange enter ");
        if ("android.activity_recognition.running".equals(hwActivityRecognitionEvent.getActivity())) {
            if (hwActivityRecognitionEvent.getEventType() == 1) {
                LogUtil.a("Track_ActRecogProxy", "processHnActivityChange enter running");
                AlarmManagerUtils alarmManagerUtils = this.f8017b;
                if (alarmManagerUtils != null) {
                    alarmManagerUtils.b(AlarmManagerUtils.SportTypeUtils.STATE_ENTER_RUNNING);
                    return;
                }
                return;
            }
            if (hwActivityRecognitionEvent.getEventType() == 2) {
                h();
                return;
            } else {
                LogUtil.a("Track_ActRecogProxy", "processHnActivityChange ACTIVITY_RUNNING ", "invalid event type");
                return;
            }
        }
        LogUtil.a("Track_ActRecogProxy", "processHnActivityChange ", "invalid activity");
    }

    private void h() {
        LogUtil.a("Track_ActRecogProxy", "onActivityChanged exit running");
        g();
        AlarmManagerUtils alarmManagerUtils = this.f8017b;
        if (alarmManagerUtils != null) {
            alarmManagerUtils.b(AlarmManagerUtils.SportTypeUtils.STATE_EXIT_RUNNING);
            if (this.g) {
                d(this.f8016a, "com.huawei.health.track.exit_running");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, String str) {
        try {
            if (context == null) {
                LogUtil.a("Track_ActRecogProxy", "sendBroadcast ", "context is null");
                return;
            }
            String packageName = context.getPackageName();
            LogUtil.a("Track_ActRecogProxy", "sendBroadcast() ", " action == ", "com.huawei.health.track.broadcast", " ,msg == ", str);
            Intent intent = new Intent();
            intent.setPackage(packageName);
            intent.setAction("com.huawei.health.track.broadcast");
            intent.putExtra("command_type", str);
            context.sendBroadcast(intent, Consts.d);
            c(str);
        } catch (Exception e) {
            ReleaseLogUtil.b("Track_ActRecogProxy", "sendBroadcast exception:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, Bundle bundle) {
        try {
            if (context == null) {
                LogUtil.a("Track_ActRecogProxy", "sendBroadcast ", "context is null");
                return;
            }
            String packageName = context.getPackageName();
            LogUtil.a("Track_ActRecogProxy", "sendBroadcast() ", " action == ", "com.huawei.health.track.broadcast", " ,msg == ", str);
            Intent intent = new Intent();
            intent.setPackage(packageName);
            intent.setAction("com.huawei.health.track.broadcast");
            intent.putExtra("command_type", str);
            intent.putExtra("paramsBundle", bundle);
            context.sendBroadcast(intent, Consts.d);
            c(str);
        } catch (RuntimeException e) {
            ReleaseLogUtil.b("Track_ActRecogProxy", "sendBroadcast RuntimeException", ExceptionUtils.c(e));
        }
    }

    private void c(String str) {
        if ("com.huawei.health.track.running".equals(str) || "com.huawei.health.track.fastwalking".equals(str)) {
            this.g = true;
            CommonUtil.bj();
            j("android.activity_recognition.running");
        } else if ("com.huawei.health.AUTO_TRACK_END".equals(str)) {
            this.g = false;
            q();
        } else {
            LogUtil.a("Track_ActRecogProxy", "autoTrackHeartBeat ", "invalid msg");
        }
    }

    private void j(final String str) {
        LogUtil.a("Track_ActRecogProxy", "startAutoTrackHeartBeat", str);
        this.f8018c = new Handler();
        Runnable runnable = new Runnable() { // from class: com.huawei.health.manager.ActivityRecognitionProxy.8
            @Override // java.lang.Runnable
            public void run() {
                if (ActivityRecognitionProxy.this.f8018c == null) {
                    return;
                }
                if (ActivityRecognitionProxy.this.h && !ActivityRecognitionProxy.this.a(str)) {
                    LogUtil.a("Track_ActRecogProxy", "startAutoTrackHeartBeat");
                    ActivityRecognitionProxy.this.f8017b.e();
                }
                ActivityRecognitionProxy.this.f8018c.postDelayed(this, 60000L);
            }
        };
        this.n = runnable;
        this.f8018c.postDelayed(runnable, 60000L);
    }

    private void q() {
        Runnable runnable;
        LogUtil.a("Track_ActRecogProxy", "stopAutoTrackHeartBeat");
        Handler handler = this.f8018c;
        if (handler != null && (runnable = this.n) != null) {
            handler.removeCallbacks(runnable);
        }
        this.n = null;
        this.f8018c = null;
    }

    public boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        boolean zC = AuthorizationUtils.c(this.f8016a);
        if (!zC) {
            LogUtil.a("Track_ActRecogProxy", "isAuthorized", Boolean.valueOf(zC));
            return true;
        }
        if (action != null) {
            LogUtil.j("Track_ActRecogProxy", "processAlarmEvent ", action);
            if ("SEND_START_BROADCAST".equals(action)) {
                m();
                return true;
            }
            if ("SEND_STOP_WALK_BROADCAST".equals(action) || "SEND_STOP_BROADCAST".equals(action)) {
                p();
            } else {
                if ("com.huawei.health.track.config".equals(action)) {
                    b(intent);
                    return true;
                }
                if ("SEND_START_WALK_BROADCAST".equals(action)) {
                    n();
                    return true;
                }
                if ("STOP_DETECT_SPORT".equals(action)) {
                    s();
                    return true;
                }
                if ("SEND_ENTER_PRE_SPORT_BROADCAST".equals(action)) {
                    i();
                    return true;
                }
                if ("SEND_END_RECOGNIZE_BROADCAST".equals(action)) {
                    l();
                    return true;
                }
                if ("SEND_END_PRE_STOP_BROADCAST".equals(action)) {
                    o();
                    return true;
                }
                if ("SEND_ENTER_PRE_STOP_BROADCAST".equals(action)) {
                    k();
                    return true;
                }
                if (!"SEND_EXIT_PRE_SPORT_BROADCAST".equals(action)) {
                    return false;
                }
                e(intent.getIntExtra("type", SportStatusDetectManager.AutoRecognizeStatus.RUN.getStatus()));
                return true;
            }
        }
        return true;
    }

    private void i() {
        if (this.h && f()) {
            ReleaseLogUtil.c("Track_ActRecogProxy", "## processEnterPreSportBroadcast mCurStatus ", Integer.valueOf(this.d.getStatus()));
            e(SportStatusDetectManager.AutoRecognizeStatus.RUN);
        }
    }

    private void n() {
        if (this.h && f()) {
            ReleaseLogUtil.c("Track_ActRecogProxy", "## processAlarmEvent ");
            a("android.activity_recognition.walking");
            if (ppt.a()) {
                SportStatusDetectManager sportStatusDetectManager = this.l;
                if (sportStatusDetectManager == null) {
                    ReleaseLogUtil.c("Track_ActRecogProxy", "## mSportStatusDetectManager is null");
                    return;
                }
                sportStatusDetectManager.a(SportStatusDetectManager.AutoRecognizeStatus.WALK);
            } else {
                d(this.f8016a, "com.huawei.health.track.fastwalking");
            }
            a(10000L);
        }
    }

    private void e(int i) {
        if (this.h && f()) {
            if (i == SportStatusDetectManager.AutoRecognizeStatus.RUN.getStatus()) {
                e(SportStatusDetectManager.AutoRecognizeStatus.RUN);
            } else {
                e(SportStatusDetectManager.AutoRecognizeStatus.WALK);
            }
            ReleaseLogUtil.c("Track_ActRecogProxy", "## processExitPreSportBroadcast ", Integer.valueOf(i));
        }
    }

    private void e(SportStatusDetectManager.AutoRecognizeStatus autoRecognizeStatus) {
        SportStatusDetectManager sportStatusDetectManager = this.l;
        if (sportStatusDetectManager == null) {
            ReleaseLogUtil.c("Track_ActRecogProxy", "## changeSportStatus mSportStatusDetectManager is null");
        } else {
            sportStatusDetectManager.a(autoRecognizeStatus);
            a(10000L);
        }
    }

    private void l() {
        if (this.h && f()) {
            ReleaseLogUtil.c("Track_ActRecogProxy", "## processExitRecognizeBroadcast ", Integer.valueOf(this.d.getStatus()));
            e(SportStatusDetectManager.AutoRecognizeStatus.END_CALCULATE);
        }
    }

    private void s() {
        if (this.h && f()) {
            ReleaseLogUtil.c("Track_ActRecogProxy", "## processStopDetect ");
            e(SportStatusDetectManager.AutoRecognizeStatus.IDLE);
        }
    }

    private void k() {
        if (this.h && f()) {
            ReleaseLogUtil.c("Track_ActRecogProxy", "## processExitPreSportStopBroadcast ");
            e(SportStatusDetectManager.AutoRecognizeStatus.IDLE);
        }
    }

    private void o() {
        if (this.h && f()) {
            ReleaseLogUtil.c("Track_ActRecogProxy", "## processExitPreStopBroadcast ", Integer.valueOf(this.d.getStatus()));
            e(this.d);
        }
    }

    private void m() {
        if (this.h && f()) {
            ReleaseLogUtil.c("Track_ActRecogProxy", "## processAlarmEvent ");
            CommonUtil.bj();
            a("android.activity_recognition.running");
            if (ppt.a()) {
                SportStatusDetectManager sportStatusDetectManager = this.l;
                if (sportStatusDetectManager == null) {
                    ReleaseLogUtil.c("Track_ActRecogProxy", "## processStartBroadcast manager is null");
                    return;
                }
                sportStatusDetectManager.a(SportStatusDetectManager.AutoRecognizeStatus.RUN);
            } else {
                d(this.f8016a, "com.huawei.health.track.running");
            }
            a(10000L);
        }
    }

    private void p() {
        c();
        g();
        ReleaseLogUtil.c("Track_ActRecogProxy", "enter stop");
        if (ppt.a()) {
            SportStatusDetectManager sportStatusDetectManager = this.l;
            if (sportStatusDetectManager == null) {
                ReleaseLogUtil.c("Track_ActRecogProxy", "## processStopBroadcast manager is null");
                return;
            } else {
                sportStatusDetectManager.a(SportStatusDetectManager.AutoRecognizeStatus.IDLE);
                return;
            }
        }
        d(this.f8016a, "com.huawei.health.AUTO_TRACK_END");
    }

    private void b(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("autotrack_enable", this.h);
        int intExtra = intent.getIntExtra("start_delay", this.o);
        int intExtra2 = intent.getIntExtra("stop_delay", this.m);
        boolean zC = AuthorizationUtils.c(this.f8016a);
        if (booleanExtra && !this.h && zC) {
            if (CommonUtil.bj()) {
                a(zC);
            } else {
                c(zC);
                b(zC);
            }
        } else if (booleanExtra || !this.h) {
            ReleaseLogUtil.c("Track_ActRecogProxy", "processUpdateAutoTrack ", "isAuthorized", Boolean.valueOf(zC));
        } else {
            a();
        }
        ReleaseLogUtil.c("Track_ActRecogProxy", "change startDelay ", Integer.valueOf(intExtra), " stopDelay ", Integer.valueOf(intExtra2), " state ", Boolean.valueOf(booleanExtra));
        AlarmManagerUtils alarmManagerUtils = this.f8017b;
        if (alarmManagerUtils != null) {
            alarmManagerUtils.d(intExtra, intExtra2);
        }
        SharedPerferenceUtils.a(this.f8016a, booleanExtra, intExtra, intExtra2);
        if (this.h != booleanExtra) {
            this.h = booleanExtra;
        }
        LogUtil.a("Track_ActRecogProxy", "processUpdateAutoTrack mIsEnableAutoTrack status: ", Boolean.valueOf(this.h));
    }

    private void c() {
        PowerManager.WakeLock wakeLock = this.e;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        LogUtil.a("Track_ActRecogProxy", "WakeLock release");
        this.e.release();
    }

    private void a(long j) {
        LogUtil.a("Track_ActRecogProxy", "WakeLock acquire");
        this.e.acquire(j);
    }

    private boolean f() {
        boolean zIsProviderEnabled;
        boolean zIsProviderEnabled2;
        Context context = this.f8016a;
        if (context == null) {
            return false;
        }
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager != null) {
            zIsProviderEnabled = locationManager.isProviderEnabled(GeocodeSearch.GPS);
            zIsProviderEnabled2 = locationManager.isProviderEnabled("GpsMockProvider");
        } else {
            zIsProviderEnabled = false;
            zIsProviderEnabled2 = false;
        }
        return locationManager != null && (zIsProviderEnabled || zIsProviderEnabled2);
    }

    private void g() {
        Context context = this.f8016a;
        if (context == null) {
            LogUtil.a("Track_ActRecogProxy", "flushStepCounterData ", "mContext is null");
            return;
        }
        if (context.getSystemService("sensor") instanceof SensorManager) {
            SensorManager sensorManager = (SensorManager) this.f8016a.getSystemService("sensor");
            LogUtil.a("Track_ActRecogProxy", "flushStepCounterData manager is ", sensorManager);
            if (sensorManager != null) {
                try {
                    ReleaseLogUtil.c("Track_ActRecogProxy", " flushStepCounterData registerListener = ", Boolean.valueOf(sensorManager.registerListener(this.k, sensorManager.getDefaultSensor(19), 0)));
                    sensorManager.unregisterListener(this.k, sensorManager.getDefaultSensor(19));
                } catch (RuntimeException unused) {
                    ReleaseLogUtil.b("Track_ActRecogProxy", "flushStepCounterData happened exception");
                    return;
                }
            }
            LogicalStepCounter.d(this.f8016a).b((ISimpleResultCallback) null);
            return;
        }
        LogUtil.a("Track_ActRecogProxy", "object invalid type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        if (CommonUtil.bj()) {
            if (this.i != null) {
                return e(str).booleanValue();
            }
            return false;
        }
        if (this.f != null) {
            return b(str).booleanValue();
        }
        return false;
    }

    private Boolean e(String str) {
        return Boolean.valueOf(d(str));
    }

    private Boolean b(String str) {
        return Boolean.valueOf(d(str));
    }

    private boolean d(String str) {
        if (CommonUtil.bj()) {
            com.hihonor.android.location.activityrecognition.HwActivityChangedExtendEvent hwActivityChangedExtendEventC = this.i.c();
            if (hwActivityChangedExtendEventC != null) {
                return b(str, hwActivityChangedExtendEventC);
            }
            return false;
        }
        HwActivityChangedExtendEvent hwActivityChangedExtendEventI = this.f.i();
        if (hwActivityChangedExtendEventI != null) {
            return b(str, hwActivityChangedExtendEventI);
        }
        return false;
    }

    private boolean b(String str, HwActivityChangedExtendEvent hwActivityChangedExtendEvent) {
        for (HwActivityRecognitionExtendEvent hwActivityRecognitionExtendEvent : hwActivityChangedExtendEvent.getActivityRecognitionExtendEvents()) {
            if (str.equals(hwActivityRecognitionExtendEvent.getActivity())) {
                LogUtil.a("Track_ActRecogProxy", "curState is ", str);
                return true;
            }
            LogUtil.a("Track_ActRecogProxy", "curState is ", hwActivityRecognitionExtendEvent.getActivity());
        }
        return false;
    }

    private boolean b(String str, com.hihonor.android.location.activityrecognition.HwActivityChangedExtendEvent hwActivityChangedExtendEvent) {
        for (com.hihonor.android.location.activityrecognition.HwActivityRecognitionExtendEvent hwActivityRecognitionExtendEvent : hwActivityChangedExtendEvent.getActivityRecognitionExtendEvents()) {
            if (str.equals(hwActivityRecognitionExtendEvent.getActivity())) {
                LogUtil.a("Track_ActRecogProxy", "mHnActivityRecognition curState is ", str);
                return true;
            }
            LogUtil.a("Track_ActRecogProxy", "mHnActivityRecognition curState is ", hwActivityRecognitionExtendEvent.getActivity());
        }
        return false;
    }
}
