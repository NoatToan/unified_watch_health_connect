package com.xiaomi.hm.health.devicelib;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.huami.bluetooth.profile.ecf.data.AppState;
import com.huami.hid.takepic.TakePicSettingActivity;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportInfo;
import com.xiaomi.hm.health.devicelib.DeviceConnectionStatus;
import com.xmlywind.sdk.common.mta.PointCategory;
import de.greenrobot.event.EventBus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
public class DeviceCenter {
    private static final String s = "android.intent.action.HMCoreService";
    private static final String t = "DeviceCenter";
    private static final int u = 10000;
    private static final int v = 3;
    private static final int w = 10;
    private static DeviceCenter x;
    private static UserData y;
    private IDeviceManagerListener a = null;
    private IDeviceInterface b = null;
    private IPeripheralListener c = null;
    private HMDeviceSource d;
    private HMDeviceSource e;
    private HMDeviceSource f;
    private HMDeviceSource g;
    private int h;
    private HMDeviceSource i;
    private SensorManager j;
    private f k;
    private final e l;
    private Context m;
    private final AtomicBoolean n;
    private Handler o;
    private boolean p;
    private final HashMap<HMDeviceSource, com.xiaomi.hm.health.devicelib.a> q;
    private final ServiceConnection r;

    public static class HR {
        public static final int a = 39;
        public static final int b = 221;

        public static boolean isValid(int i) {
            return i < 221 && i > 39;
        }
    }

    public interface IDeviceManagerListener {
        void onDeInit();

        void onInit();
    }

    public interface IPeripheralListener {
        void onBatteryLevelChanged(int i, HMDeviceSource hMDeviceSource);

        void onConnectionStatusChanged(DeviceConnectionStatus deviceConnectionStatus, HMDeviceSource hMDeviceSource);

        void onHrData(DeviceHr deviceHr);

        void onHrState(DeviceHrEvent deviceHrEvent);

        void onPressureData(PhonePressure phonePressure);

        void onStepData(DeviceStep deviceStep);
    }

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            DeviceCenter.this.x(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            DeviceCenter.this.y();
        }
    }

    public static class b extends Handler {
        private b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            DeviceCenter.x.z(HMDeviceSource.fromValue(message.what), 4, -1);
        }
    }

    public class c implements IDeviceHRCallback {
        public HMDeviceSource a;
        public com.xiaomi.hm.health.devicelib.a b;

        public c(HMDeviceSource hMDeviceSource) {
            this.a = HMDeviceSource.VDEVICE;
            this.b = null;
            this.a = hMDeviceSource;
            this.b = (com.xiaomi.hm.health.devicelib.a) DeviceCenter.this.q.get(this.a);
        }

        @Override // com.xiaomi.hm.health.devicelib.IDeviceHRCallback
        public void onHrChanged(int i) {
            com.xiaomi.hm.health.devicelib.a aVar;
            HMLog.i(DeviceCenter.t, "onHrChanged(" + this.a + "): " + i, new Object[0]);
            DeviceCenter.this.o.removeMessages(this.a.getValue());
            DeviceCenter.this.o.sendEmptyMessageDelayed(this.a.getValue(), 10000L);
            if (HR.isValid(i) && (aVar = this.b) != null) {
                aVar.g(System.currentTimeMillis(), i);
            }
            if (DeviceCenter.this.c != null) {
                DeviceCenter.this.c.onHrData(new DeviceHr(this.a, i));
            } else {
                Log.e(DeviceCenter.t, "DataListener null !!");
            }
        }
    }

    public class e implements SensorEventListener {
        public e() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            Log.i(DeviceCenter.t, "onAccuracyChanged:" + sensor.getName() + ",accuracy:" + i);
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float f = sensorEvent.values[0];
            if (DeviceCenter.this.c != null) {
                DeviceCenter.this.c.onPressureData(new PhonePressure(f));
            } else {
                Log.e(DeviceCenter.t, "DataListener null !!");
            }
        }
    }

    public class f implements SensorEventListener {
        private static final int f = 1000;
        private static final int g = 512;
        private int a = 0;
        private int b = 0;
        private long c = 0;
        private long d = 0;

        public f() {
        }

        public void a() {
            int i = this.b;
            int i2 = this.a;
            if (i < i2) {
                this.b = i2;
                DeviceCenter.this.c.onStepData(new DeviceStep(HMDeviceSource.SENSORHUB, this.b, -1));
            }
            this.a = 0;
            this.b = 0;
        }

        public void b() {
            this.d = SystemClock.elapsedRealtimeNanos();
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            Log.i(DeviceCenter.t, "onAccuracyChanged:" + sensor.getName() + ",accuracy:" + i);
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() != 18 || sensorEvent.timestamp <= this.d) {
                return;
            }
            int i = (int) sensorEvent.values[0];
            this.a += i;
            if (DeviceCenter.this.c == null) {
                Log.e(DeviceCenter.t, "DataListener null !!");
                return;
            }
            if (System.currentTimeMillis() - this.c > 1000) {
                this.c = System.currentTimeMillis();
                Log.i(DeviceCenter.t, "StepSensorDetector newStep:" + i + ",total:" + this.a);
                int i2 = this.a;
                if (i2 - this.b <= 512) {
                    this.b = i2;
                    DeviceCenter.this.c.onStepData(new DeviceStep(HMDeviceSource.SENSORHUB, this.b, -1));
                    return;
                }
                HMLog.i(DeviceCenter.t, "PhoneStepSensor exception!, sensorStep:" + this.a + ",ToAlgoSteps:" + this.b, new Object[0]);
                a();
                DeviceCenter.this.j.unregisterListener(this);
                DeviceCenter.this.k = null;
            }
        }
    }

    private DeviceCenter() {
        HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
        this.d = hMDeviceSource;
        this.e = hMDeviceSource;
        this.f = hMDeviceSource;
        this.g = hMDeviceSource;
        this.h = -1;
        this.i = hMDeviceSource;
        this.k = new f();
        this.l = new e();
        this.m = null;
        this.n = new AtomicBoolean(false);
        this.o = null;
        this.p = false;
        this.q = new HashMap<>();
        this.r = new a();
        this.o = new b();
    }

    private void A() {
        SensorManager sensorManager = (SensorManager) this.m.getSystemService("sensor");
        this.j = sensorManager;
        if (sensorManager == null) {
            Log.i(t, "SensorManager is null!!!");
            return;
        }
        if (this.k == null) {
            this.k = new f();
        }
        Sensor defaultSensor = this.j.getDefaultSensor(18);
        if (defaultSensor != null) {
            this.j.registerListener(this.k, defaultSensor, 2);
            this.k.b();
        } else {
            Log.i(t, "TYPE_STEP_DETECTOR is null!!!");
        }
        Sensor defaultSensor2 = this.j.getDefaultSensor(6);
        if (defaultSensor2 != null) {
            this.j.registerListener(this.l, defaultSensor2, 2);
        } else {
            Log.i(t, "TYPE_PRESSURE is nulll!!!");
        }
    }

    private void B() {
        f fVar = this.k;
        if (fVar != null) {
            fVar.a();
        }
        SensorManager sensorManager = this.j;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.k);
            this.j.unregisterListener(this.l);
        }
    }

    private void C(HMDeviceSource hMDeviceSource, AppState appState) {
        Log.i(t, "syncAppState: " + hMDeviceSource + " " + appState);
        if (hMDeviceSource == null || hMDeviceSource == HMDeviceSource.VDEVICE) {
            return;
        }
        this.b.syncAppState(hMDeviceSource, appState);
    }

    public static DeviceCenter getInstance() {
        if (x == null) {
            x = new DeviceCenter();
        }
        return x;
    }

    public static boolean isHrDevice(HMDeviceSource hMDeviceSource) {
        return q(hMDeviceSource, "hasFeatureRtHr");
    }

    public static boolean isMiliWatch(HMDeviceSource hMDeviceSource) {
        return q(hMDeviceSource, TakePicSettingActivity.KEY_IS_WATCH);
    }

    private void l(HMDeviceSource hMDeviceSource) {
        Log.i(t, "deInitDeviceCallback:" + hMDeviceSource);
        if (hMDeviceSource == HMDeviceSource.VDEVICE) {
            return;
        }
        this.b.setConnectionCallback(hMDeviceSource, null);
        this.b.setBatteryCallback(hMDeviceSource, null);
    }

    private void m() {
        if (hasInit()) {
            l(this.d);
            l(this.e);
            l(this.f);
            l(this.g);
            n(this.d);
            n(this.f);
            n(this.g);
            C(this.g, AppState.StopSport.INSTANCE);
            HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
            this.d = hMDeviceSource;
            this.e = hMDeviceSource;
            this.f = hMDeviceSource;
            this.g = hMDeviceSource;
            this.h = -1;
            this.q.clear();
        }
    }

    private void n(HMDeviceSource hMDeviceSource) {
        if (!isHrDevice(hMDeviceSource)) {
            HMLog.i(t, "not hr device", new Object[0]);
            return;
        }
        this.o.removeMessages(hMDeviceSource.getValue());
        if (hasInit()) {
            this.b.enableRealtimeHeartRate(hMDeviceSource, false, null);
        }
    }

    private void o(HMDeviceSource hMDeviceSource) {
        HMLog.i(t, "enableHrDevice:" + hMDeviceSource, new Object[0]);
        if (!isHrDevice(hMDeviceSource)) {
            HMLog.i(t, "not hr device", new Object[0]);
            return;
        }
        this.o.removeMessages(hMDeviceSource.getValue());
        if (hasInit()) {
            if (!this.b.isConnected(hMDeviceSource)) {
                z(hMDeviceSource, 2, -1);
                return;
            }
            DeviceBattery deviceBattery = this.b.getDeviceBattery(hMDeviceSource);
            if (deviceBattery != null && deviceBattery.getLevel() < 10 && !r(hMDeviceSource)) {
                z(hMDeviceSource, 3, -1);
                this.b.enableRealtimeHeartRate(hMDeviceSource, false, null);
                return;
            }
            com.xiaomi.hm.health.devicelib.a aVar = this.q.get(hMDeviceSource);
            if (aVar == null) {
                this.q.put(hMDeviceSource, new com.xiaomi.hm.health.devicelib.a(-1L));
            } else if (aVar.b() && HR.isValid(aVar.d())) {
                z(hMDeviceSource, 1, this.q.get(hMDeviceSource).d());
            }
            this.o.sendEmptyMessageDelayed(hMDeviceSource.getValue(), 30000L);
            this.b.enableRealtimeHeartRate(hMDeviceSource, true, new c(hMDeviceSource));
        }
    }

    private static boolean p(Context context) {
        if (context == null) {
            return false;
        }
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        return (sensorManager != null ? sensorManager.getDefaultSensor(6) : null) != null;
    }

    private static boolean q(HMDeviceSource hMDeviceSource, String str) {
        try {
            Object objInvoke = Class.forName("com.xiaomi.hm.health.device.HMDeviceConfig").getMethod(str, HMDeviceSource.class).invoke(null, hMDeviceSource);
            if (objInvoke != null) {
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (Exception e2) {
            HMLog.i(t, "hasFeature exception:" + e2.getMessage(), new Object[0]);
        }
        return false;
    }

    private boolean r(HMDeviceSource hMDeviceSource) {
        return hMDeviceSource == HMDeviceSource.MILI_TEMPO || hMDeviceSource == HMDeviceSource.MILI_WUHAN || hMDeviceSource == HMDeviceSource.MILI_PEYTO;
    }

    private void s(final HMDeviceSource hMDeviceSource) {
        Log.i(t, "initDeviceCallback:" + hMDeviceSource);
        if (hMDeviceSource == HMDeviceSource.VDEVICE) {
            return;
        }
        this.b.setBatteryCallback(hMDeviceSource, new IDeviceBatteryCallback() { // from class: z61
            @Override // com.xiaomi.hm.health.devicelib.IDeviceBatteryCallback
            public final void onBatteryLevelChanged(int i) {
                this.a.v(hMDeviceSource, i);
            }
        });
        this.c.onConnectionStatusChanged(this.b.isConnected(hMDeviceSource) ? DeviceConnectionStatus.CONNECTED : DeviceConnectionStatus.CONNECTING, hMDeviceSource);
        this.b.setConnectionCallback(hMDeviceSource, new IDeviceConnectionCallback() { // from class: a71
            @Override // com.xiaomi.hm.health.devicelib.IDeviceConnectionCallback
            public final void onConnectionStateChanged(DeviceConnectionStatus deviceConnectionStatus) {
                this.a.w(hMDeviceSource, deviceConnectionStatus);
            }
        });
    }

    private void t(int... iArr) {
        boolean z;
        boolean zContains;
        boolean zContains2;
        if (hasInit()) {
            boolean z2 = true;
            if (iArr == null || iArr.length <= 0) {
                z = true;
                zContains = true;
                zContains2 = true;
            } else {
                HashSet hashSet = new HashSet();
                for (int i : iArr) {
                    hashSet.add(HMDeviceSource.fromValue(i).getType());
                }
                boolean zContains3 = hashSet.contains(HMDeviceType.MILI);
                zContains = hashSet.contains(HMDeviceType.SHOES);
                zContains2 = hashSet.contains(HMDeviceType.OTHER);
                boolean zContains4 = hashSet.contains(HMDeviceType.HEADSET);
                z2 = zContains3;
                z = zContains4;
            }
            if (z2) {
                HMDeviceSource boundDevice = this.b.getBoundDevice(HMDeviceType.MILI);
                this.d = boundDevice;
                s(boundDevice);
                o(this.d);
            }
            if (zContains) {
                IDeviceInterface iDeviceInterface = this.b;
                HMDeviceType hMDeviceType = HMDeviceType.SHOES;
                this.e = iDeviceInterface.getBoundDevice(hMDeviceType);
                this.h = this.b.getBoundBrandType(hMDeviceType);
                s(this.e);
            }
            if (zContains2) {
                HMDeviceSource boundDevice2 = this.b.getBoundDevice(HMDeviceType.OTHER);
                this.f = boundDevice2;
                s(boundDevice2);
                o(this.f);
            }
            if (z) {
                HMDeviceSource boundDevice3 = this.b.getBoundDevice(HMDeviceType.HEADSET);
                this.g = boundDevice3;
                s(boundDevice3);
                o(this.g);
                C(this.g, AppState.StartSport.INSTANCE);
            }
        }
    }

    private static boolean u(HMDeviceSource hMDeviceSource) {
        return q(hMDeviceSource, "hasFeatureSport");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(HMDeviceSource hMDeviceSource, int i) {
        HMLog.i(t, "onBatteryLevelChanged:" + hMDeviceSource + "," + i, new Object[0]);
        if (isHrDevice(hMDeviceSource) && i < 10 && !r(hMDeviceSource)) {
            z(hMDeviceSource, 3, -1);
            this.b.enableRealtimeHeartRate(hMDeviceSource, false, null);
        }
        this.c.onBatteryLevelChanged(i, hMDeviceSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(HMDeviceSource hMDeviceSource, DeviceConnectionStatus deviceConnectionStatus) {
        HMLog.i(t, "onConnectionStateChanged:" + hMDeviceSource + "," + deviceConnectionStatus, new Object[0]);
        this.c.onConnectionStatusChanged(deviceConnectionStatus, hMDeviceSource);
        if (deviceConnectionStatus != DeviceConnectionStatus.CONNECTED) {
            n(hMDeviceSource);
        } else {
            C(hMDeviceSource, AppState.SportOngoing.INSTANCE);
            o(hMDeviceSource);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(IBinder iBinder) {
        Log.i(t, "onServiceConnected");
        if (!(iBinder instanceof IDeviceInterface)) {
            Log.i(t, "return as not IDeviceInterface");
            return;
        }
        this.b = (IDeviceInterface) iBinder;
        this.n.set(true);
        IDeviceManagerListener iDeviceManagerListener = this.a;
        if (iDeviceManagerListener != null) {
            iDeviceManagerListener.onInit();
        }
        Log.i(t, "onServiceConnected....out");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        Log.i(t, "onServiceDisconnected");
        IDeviceManagerListener iDeviceManagerListener = this.a;
        if (iDeviceManagerListener != null) {
            iDeviceManagerListener.onDeInit();
        }
        this.n.set(false);
        Log.i(t, "onServiceDisconnected...out");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(HMDeviceSource hMDeviceSource, int i, int i2) {
        DeviceHrEvent deviceHrEvent = new DeviceHrEvent(hMDeviceSource, i, -1);
        EventBus.getDefault().post(deviceHrEvent);
        IPeripheralListener iPeripheralListener = this.c;
        if (iPeripheralListener != null) {
            iPeripheralListener.onHrState(deviceHrEvent);
        }
    }

    public synchronized void deInit() {
        Log.i(t, "deInit");
        if (this.p) {
            this.m.unbindService(this.r);
            this.p = false;
        }
        this.n.set(false);
    }

    public int getBandValue() {
        return !hasInit() ? HMDeviceSource.VDEVICE.getValue() : this.b.getBoundDevice(HMDeviceType.MILI).getValue();
    }

    public HMDeviceSource getBoundDevice(HMDeviceType hMDeviceType) {
        return !hasInit() ? HMDeviceSource.VDEVICE : this.b.getBoundDevice(hMDeviceType);
    }

    public String getDeviceId(HMDeviceSource hMDeviceSource) {
        if (hasInit()) {
            return this.b.getDeviceId(hMDeviceSource);
        }
        return null;
    }

    public int getShoeValue() {
        return !hasInit() ? HMDeviceSource.VDEVICE.getValue() : this.b.getBoundDevice(HMDeviceType.SHOES).getValue();
    }

    public UserData getUserData() {
        UserData userData;
        if (hasInit() && (userData = this.b.getUserData()) != null) {
            y = userData;
        }
        Log.d(t, "user data:" + y);
        return y;
    }

    public boolean hasBarometer() {
        return p(this.m);
    }

    public boolean hasBound(HMDeviceSource hMDeviceSource) {
        return hasInit() && this.b.hasBound(hMDeviceSource);
    }

    public boolean hasBoundBand() {
        return hasInit() && this.b.hasBound(HMDeviceType.MILI);
    }

    public boolean hasBoundBandHrDevice() {
        return hasInit() && isHrDevice(this.b.getBoundDevice(HMDeviceType.MILI));
    }

    public boolean hasBoundBlueMonkey() {
        return hasInit() && this.b.hasBound(HMDeviceSource.OTHER_BM);
    }

    public boolean hasBoundHrDevice() {
        return hasInit() && (isHrDevice(this.b.getBoundDevice(HMDeviceType.MILI)) || this.b.hasBound(HMDeviceSource.OTHER_BM));
    }

    public boolean hasBoundShoes() {
        return hasInit() && this.b.hasBound(HMDeviceType.SHOES);
    }

    public boolean hasBoundWatch() {
        return hasInit() && this.b.hasBound(HMDeviceType.WATCH);
    }

    public boolean hasInit() {
        return this.n.get();
    }

    public synchronized void init(Context context, IDeviceManagerListener iDeviceManagerListener) {
        Log.i(t, PointCategory.INIT);
        this.a = iDeviceManagerListener;
        this.m = context.getApplicationContext();
        Intent intent = new Intent(s);
        intent.setPackage(this.m.getPackageName());
        boolean zBindService = this.m.bindService(intent, this.r, 1);
        this.p = zBindService;
        if (!zBindService) {
            this.m.unbindService(this.r);
            this.p = this.m.bindService(intent, this.r, 1);
        }
        if (!this.p) {
            this.m.unbindService(this.r);
            y();
        }
    }

    public boolean isConnected(HMDeviceSource hMDeviceSource) {
        return hasInit() && this.b.isConnected(hMDeviceSource);
    }

    public boolean isConnectedBandDevice() {
        return hasInit() && isConnected(this.b.getBoundDevice(HMDeviceType.MILI));
    }

    public boolean isConnectedHrDevice(HMDeviceType hMDeviceType) {
        if (!hasInit()) {
            return false;
        }
        HMDeviceSource boundDevice = this.b.getBoundDevice(hMDeviceType);
        return isHrDevice(boundDevice) && isConnected(boundDevice);
    }

    public boolean isConnectedShoeDevice() {
        return hasInit() && isConnected(this.b.getBoundDevice(HMDeviceType.SHOES));
    }

    public boolean isSupportStep() {
        if (!hasInit()) {
            return false;
        }
        if (this.b.hasBound(HMDeviceType.MILI) || this.b.hasBound(HMDeviceType.SHOES) || this.b.hasBound(HMDeviceSource.OTHER_BM)) {
            return true;
        }
        SensorManager sensorManager = (SensorManager) this.m.getSystemService("sensor");
        return (sensorManager != null ? sensorManager.getDefaultSensor(18) : null) != null;
    }

    public void pause() {
        Log.i(t, "pause band source:" + this.d + ", shoe source:" + this.e);
        if (hasInit()) {
            HMDeviceSource hMDeviceSource = this.d;
            HMDeviceSource hMDeviceSource2 = HMDeviceSource.VDEVICE;
            if (hMDeviceSource != hMDeviceSource2) {
                this.b.enableRealtimeStep(hMDeviceSource, false, null);
            }
            HMDeviceSource hMDeviceSource3 = this.e;
            if (hMDeviceSource3 != hMDeviceSource2) {
                this.b.enableRealtimeStep(hMDeviceSource3, false, null);
                this.b.enableSixAxis(this.e, false, null);
            }
            HMDeviceSource hMDeviceSource4 = this.f;
            if (hMDeviceSource4 != hMDeviceSource2) {
                this.b.enableRealtimeStep(hMDeviceSource4, false, null);
            }
            B();
        }
    }

    public void resume() {
        Log.i(t, "resume band source:" + this.d + ", shoe source:" + this.e);
        if (hasInit()) {
            HMDeviceSource hMDeviceSource = this.d;
            HMDeviceSource hMDeviceSource2 = HMDeviceSource.VDEVICE;
            if (hMDeviceSource != hMDeviceSource2) {
                this.b.enableRealtimeStep(hMDeviceSource, true, new d(hMDeviceSource));
            }
            HMDeviceSource hMDeviceSource3 = this.e;
            if (hMDeviceSource3 != hMDeviceSource2) {
                this.b.enableRealtimeStep(hMDeviceSource3, true, new d(hMDeviceSource3, this.h));
                this.b.enableSixAxis(this.e, true, null);
            }
            HMDeviceSource hMDeviceSource4 = this.f;
            if (hMDeviceSource4 != hMDeviceSource2) {
                this.b.enableRealtimeStep(hMDeviceSource4, true, new d(hMDeviceSource4));
            }
            A();
        }
    }

    public void sendSportCommand(SportCommand sportCommand, SportInfo sportInfo) {
        if (hasInit() && u(this.d)) {
            this.b.sendSportCommand(this.d, sportCommand, sportInfo);
        }
    }

    public void sendSportConfig(SportConfig sportConfig, IHMSportListener iHMSportListener) {
        if (hasInit() && u(this.d)) {
            this.b.sendSportConfig(this.d, sportConfig, iHMSportListener);
        }
    }

    public void sendVerifyDistanceCommand(HMDeviceSource hMDeviceSource, long j, int i, int i2, HMCallback hMCallback) {
        if (hasInit() && u(hMDeviceSource)) {
            this.b.sendVerifyDistanceCommand(hMDeviceSource, j, i, i2, hMCallback);
        }
    }

    public void setPeripheralListener(IPeripheralListener iPeripheralListener) {
        this.c = iPeripheralListener;
    }

    public void setUserData(UserData userData) {
        y = userData;
    }

    public synchronized void start(int... iArr) {
        Log.i(t, "start:" + Arrays.toString(iArr));
        t(iArr);
        resume();
    }

    public synchronized void stop() {
        Log.i(t, Command.STOP);
        pause();
        m();
    }

    public void vibrateHr(int i, int i2) {
        if (hasInit()) {
            if (!u(this.d)) {
                this.b.vibrateHr(HMDeviceType.MILI, i);
                return;
            }
            SportInfo sportInfo = new SportInfo();
            sportInfo.setHr(i);
            sportInfo.setHrRemindThreshold(i2);
            sendSportCommand(SportCommand.NOTIFY, sportInfo);
        }
    }

    public void vibrateHrSingle(int i) {
        if (hasInit()) {
            this.b.vibrateHr(HMDeviceType.MILI, i);
        }
    }

    public void vibratePace(int i, int i2, int i3) {
        if (hasInit()) {
            if (!u(this.d)) {
                this.b.vibratePace(HMDeviceType.MILI, i2);
                return;
            }
            SportInfo sportInfo = new SportInfo();
            sportInfo.setPace(i);
            sportInfo.setPaceRemindThreshold(i3);
            sendSportCommand(SportCommand.NOTIFY, sportInfo);
        }
    }

    public void vibratePaceSingle(int i) {
        if (hasInit()) {
            this.b.vibratePace(HMDeviceType.MILI, i);
        }
    }

    public void vibrateSpeed(int i, int i2) {
        if (hasInit() && u(this.d)) {
            SportInfo sportInfo = new SportInfo();
            sportInfo.setSpeed(i);
            sportInfo.setSpeedRemindThreshold(i2);
            sendSportCommand(SportCommand.NOTIFY, sportInfo);
        }
    }

    public class d implements IDeviceStepCallback {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private HMDeviceSource f;
        private int g;

        public d(HMDeviceSource hMDeviceSource) {
            this.a = -1;
            this.b = -1;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = HMDeviceSource.MILI;
            this.g = -1;
            this.f = hMDeviceSource;
        }

        @Override // com.xiaomi.hm.health.devicelib.IDeviceStepCallback
        public void onStepChanged(RealtimeStep realtimeStep) {
            int totalStep = realtimeStep.getTotalStep();
            int front = realtimeStep.getFront();
            Log.i(DeviceCenter.t, "DeviceStep onStepChanged:" + this.f + "," + totalStep + "," + front + "," + realtimeStep.getGaitInfo());
            if (this.a == -1) {
                this.a = totalStep;
                this.b = front;
            } else if (this.c > totalStep) {
                this.a = totalStep - this.d;
                this.b = front - this.e;
            }
            Log.i(DeviceCenter.t, "base step:" + this.f + "," + this.a + "," + this.b);
            int i = totalStep - this.a;
            int i2 = front - this.b;
            Log.i(DeviceCenter.t, "DeviceStep current step:" + this.f + "," + i + "," + i2);
            this.c = totalStep;
            this.d = i;
            this.e = i2;
            if (DeviceCenter.this.c != null) {
                DeviceCenter.this.c.onStepData(new DeviceStep(this.f, this.g, i, i2, realtimeStep.getGaitInfo()));
            } else {
                Log.e(DeviceCenter.t, "DataListener null !!");
            }
        }

        public d(HMDeviceSource hMDeviceSource, int i) {
            this.a = -1;
            this.b = -1;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = HMDeviceSource.MILI;
            this.g = -1;
            this.f = hMDeviceSource;
            this.g = i;
        }
    }
}
