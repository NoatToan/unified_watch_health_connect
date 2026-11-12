package com.xiaomi.hm.health.device.sport;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.huami.devicex.DeviceXBuilder;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.sportlib.locate.ILocationInfoListener;
import com.huami.mifit.sportlib.locate.InnerLocationProvider;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.SdkVersionUtil;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportGpsPoint;
import com.xiaomi.hm.health.bt.profile.sport.SportInfo;
import com.xiaomi.hm.health.bt.profile.sport.SportKind;
import com.xiaomi.hm.health.bt.profile.sport.SportTemperature;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.service.residentnoti.ResidentNotificationManager;
import com.xiaomi.hm.health.device.service.residentnoti.notify.GpsSportNotify;
import com.xiaomi.hm.health.device.sport.DeviceSportManager;
import com.xiaomi.hm.health.locweather.model.RealtimeWeatherInfo;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import de.greenrobot.event.EventBus;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
public class DeviceSportManager implements IHMSportListener {
    private static final String m = "DeviceSportManager";
    private static DeviceSportManager n;
    private SensorManager a = null;
    private f b = new f();
    private d c = new d();
    private AtomicInteger d = new AtomicInteger(-1);
    private Context e = null;
    private HMDeviceType f = null;
    private HMMiLiProDevice g = null;
    private AtomicBoolean h = new AtomicBoolean(true);
    private AtomicBoolean i = new AtomicBoolean(false);
    private SportConfig j = null;
    private final Lazy<DeviceManagerApi> k = KoinJavaComponent.inject(DeviceManagerApi.class);
    private InnerLocationProvider l;

    public class a extends HMCallback {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            LogKit.w2f(DeviceSportManager.m, "sendGpsState:" + z);
        }
    }

    public class b extends HMCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            LogKit.d(DeviceSportManager.m, "sendGpsPoint:" + z);
        }
    }

    public class c extends HMCallback {
        public c() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            LogKit.w2f(DeviceSportManager.m, "sendStop:" + z);
        }
    }

    public class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action) && "android.location.PROVIDERS_CHANGED".equals(action)) {
                LogKit.w2f(DeviceSportManager.m, "isGpsOpen:" + DeviceSportManager.this.k(context));
                DeviceSportManager.this.x();
            }
        }
    }

    public class e implements ILocationInfoListener {
        private e() {
        }

        @Override // com.huami.mifit.sportlib.locate.ILocationInfoListener
        public void onLocationChanged(Location location) {
            DeviceSportManager.this.p(location);
        }
    }

    public class f implements SensorEventListener {
        private f() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            LogKit.w2f(DeviceSportManager.m, "onAccuracyChanged:" + sensor.getName() + ",accuracy:" + i);
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            DeviceSportManager.this.d.getAndSet((int) (sensorEvent.values[0] * 100.0f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DeviceSportManager() {
    }

    private SportGpsPoint f(Location location) {
        SportGpsPoint sportGpsPoint = new SportGpsPoint();
        sportGpsPoint.setLongitude((int) (location.getLongitude() * 3000000.0d));
        sportGpsPoint.setLatitude((int) (location.getLatitude() * 3000000.0d));
        sportGpsPoint.setAltitude((int) (location.getAltitude() * 100.0d));
        sportGpsPoint.setSpeed((long) (location.getSpeed() * 10.0f));
        sportGpsPoint.setTimestamp(location.getTime());
        sportGpsPoint.setCourse((int) (location.getBearing() * 10.0f));
        sportGpsPoint.setBarometer(this.d.get());
        LogKit.d(m, "gpsPoint:" + sportGpsPoint);
        return sportGpsPoint;
    }

    private void g() {
        InnerLocationProvider innerLocationProvider = this.l;
        if (innerLocationProvider != null) {
            try {
                innerLocationProvider.releaseLocationByMonitor(InnerLocationProvider.LISTENER_KEY_FOR_DEVICE);
            } catch (Exception e2) {
                LogKit.w2f(m, "Monitor cancelLocation exception:" + e2.getMessage());
            }
        }
    }

    public static synchronized DeviceSportManager get() {
        if (n == null) {
            n = new DeviceSportManager();
        }
        return n;
    }

    private SportTemperature h() {
        RealtimeWeatherInfo realtimeWeatherInfo;
        WeatherInfos weatherInfo = DeviceXFunctionsKt.getWeatherApi().getWeatherInfo();
        if (weatherInfo == null || (realtimeWeatherInfo = weatherInfo.getRealtimeWeatherInfo()) == null) {
            return null;
        }
        int currentTemperature = realtimeWeatherInfo.getCurrentTemperature();
        int i = 2;
        if (currentTemperature > 35) {
            i = 1;
        } else if (currentTemperature >= 2) {
            i = 0;
        }
        return new SportTemperature(i, 0, currentTemperature);
    }

    private boolean i() {
        if (Build.VERSION.SDK_INT > 30) {
            return (ContextCompat.checkSelfPermission(this.e, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(this.e, "android.permission.ACCESS_COARSE_LOCATION") == 0 || ContextCompat.checkSelfPermission(this.e, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) ? false : true;
        }
        return SdkVersionUtil.isQ() && ContextCompat.checkSelfPermission(this.e, "android.permission.ACCESS_BACKGROUND_LOCATION") != 0;
    }

    private void j() {
        try {
            LogKit.w2f(m, "init locationProvider");
            this.l = InnerLocationProvider.INSTANCE.getInstance(this.e);
            this.l.startOrInitLocationMonitorFromDevice(new e());
        } catch (Exception e2) {
            LogKit.w2f(m, "init locationProvider Error:" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        return locationManager != null && locationManager.isProviderEnabled("gps");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l(Exception exc) {
        return "Unregister gps status listener exception:" + exc.getMessage();
    }

    private boolean m() {
        return (ContextCompat.checkSelfPermission(this.e, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(this.e, "android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
    }

    private void n(Context context) {
        context.registerReceiver(this.c, new IntentFilter("android.location.PROVIDERS_CHANGED"));
    }

    private void o(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        if (sensorManager == null) {
            LogKit.w2f(m, "SensorManager is null!!!");
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(6);
        if (defaultSensor != null) {
            this.a.registerListener(this.b, defaultSensor, 2);
        } else {
            LogKit.w2f(m, "TYPE_PRESSURE is nulll!!!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Location location) {
        if (k(this.e)) {
            if (DeviceXBuilder.INSTANCE.isDebug()) {
                LogKit.w2f(m, "sendGpsPoint: time" + location.getTime() + ",lat:" + location.getLatitude() + ", long:" + location.getLongitude());
            }
            LogKit.w2f(m, "sendGpsPoint: time" + location.getTime() + ", alt:" + location.getAltitude());
            SportInfo sportInfo = new SportInfo();
            if (this.h.get()) {
                LogKit.w2f(m, "locate success");
                sportInfo.setGpsState(1);
                this.h.getAndSet(false);
            }
            sportInfo.setGpsPoint(f(location));
            this.g.sendSportCommandPiece(SportCommand.SHOW, sportInfo, new b());
        }
    }

    private void q(int i) {
        LogKit.w2f(m, "sendGpsState:" + i);
        SportInfo sportInfo = new SportInfo();
        sportInfo.setGpsState(i);
        this.g.sendSportCommandPiece(SportCommand.SHOW, sportInfo, new a());
    }

    private void r() {
        SportTemperature sportTemperatureH = h();
        if (sportTemperatureH == null) {
            return;
        }
        SportInfo sportInfo = new SportInfo();
        sportInfo.setSportTemperature(sportTemperatureH);
        this.g.sendSportCommandPiece(SportCommand.NOTIFY, sportInfo, new HMCallback());
    }

    private void s() {
        this.g.sendSportCommandPiece(SportCommand.STOP, null, new c());
    }

    private synchronized void t() {
        LogKit.w2f(m, "start in");
        this.h.getAndSet(true);
        n(this.e);
        o(this.e);
        j();
        EventBus.getDefault().register(this);
        this.i.set(true);
        ResidentNotificationManager.showNotification(GpsSportNotify.INSTANCE);
        LogKit.w2f(m, "start out");
    }

    private synchronized void u() {
        LogKit.w2f(m, "stop in");
        g();
        v(this.e);
        w();
        EventBus.getDefault().unregister(this);
        this.i.set(false);
        ResidentNotificationManager.cancelNotification(GpsSportNotify.INSTANCE);
        LogKit.w2f(m, "stop out");
    }

    private void v(Context context) {
        d dVar = this.c;
        if (dVar == null) {
            return;
        }
        try {
            context.unregisterReceiver(dVar);
        } catch (Exception e2) {
            HMLog.warn(m, new Function0() { // from class: h91
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceSportManager.l(e2);
                }
            });
        }
    }

    private void w() {
        SensorManager sensorManager;
        f fVar = this.b;
        if (fVar == null || (sensorManager = this.a) == null) {
            return;
        }
        sensorManager.unregisterListener(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (!k(this.e)) {
            LogKit.w2f(m, "location service closed!!!");
            q(4);
        } else if (m()) {
            LogKit.w2f(m, "location permission not granted!!!");
            q(3);
        } else if (i()) {
            LogKit.w2f(m, "background location permission not granted!!!");
            q(5);
        } else {
            q(2);
            this.h.getAndSet(true);
        }
    }

    public void init(Context context, HMDeviceType hMDeviceType) {
        init(context, hMDeviceType, new SportConfig(SportKind.OUTDOOR, 1, true));
    }

    public boolean isDeviceGpsSport() {
        return this.i.get();
    }

    public void onEvent(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        LogKit.w2f(m, "onEvent:" + hMDeviceConnectionEvent);
        if (hMDeviceConnectionEvent.getDeviceType() == this.f && !hMDeviceConnectionEvent.isConnected() && this.j.isNeedGps()) {
            u();
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.sport.IHMSportListener
    public void onSportCommand(SportCommand sportCommand) {
        if (sportCommand != SportCommand.START && sportCommand == SportCommand.STOP) {
            if (this.j.isNeedGps()) {
                u();
            }
            s();
        }
    }

    public void init(Context context, HMDeviceType hMDeviceType, SportConfig sportConfig) {
        this.e = context;
        this.f = hMDeviceType;
        this.j = sportConfig;
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) this.k.getValue().getDevice(this.f);
        this.g = hMMiLiProDevice;
        hMMiLiProDevice.sendSportConfig(this.j, this, new HMCallback());
        r();
        if (this.j.isNeedGps()) {
            x();
            t();
        }
    }
}
