package com.xiaomi.hm.health.locweather;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
public class WeatherTimer {
    private static final String c = "WeatherTimer";
    private static final String d = "com.xiaomi.hm.health.WAKE_UP";
    private static final int e = 4500000;
    private static final int f = 30000;
    private static final long g = 3000000;
    private PowerManager.WakeLock a;
    private final AtomicBoolean b;

    public class a extends BroadcastReceiver {
        public final /* synthetic */ IWeatherSettingCallback a;

        public a(IWeatherSettingCallback iWeatherSettingCallback) {
            this.a = iWeatherSettingCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(IWeatherSettingCallback iWeatherSettingCallback) {
            HMLog.i(WeatherTimer.c, "wakeup receiver onReceive, foreground: " + iWeatherSettingCallback.isForeground(), new Object[0]);
            if (System.currentTimeMillis() - LocWeatherKeeper.getLastTimerStamp() < WeatherTimer.g) {
                HMLog.i(WeatherTimer.c, "50分钟内不允许重复请求定位", new Object[0]);
                WeatherTimer.this.b.set(false);
                return;
            }
            LocWeatherKeeper.setLastTimerStamp(System.currentTimeMillis());
            boolean zShouldRequestLocation = iWeatherSettingCallback.shouldRequestLocation();
            boolean z = iWeatherSettingCallback.needAqi() || iWeatherSettingCallback.needForecast() || iWeatherSettingCallback.needDeviceWeather();
            HMLog.i(WeatherTimer.c, "supportWeatherService: " + z + ", needRequestLocation: " + zShouldRequestLocation, new Object[0]);
            if (zShouldRequestLocation && z) {
                if (!iWeatherSettingCallback.isForeground() && WeatherTimer.this.a != null) {
                    WeatherTimer.this.a.acquire(30000L);
                }
                LocWeatherManager.getInstance().requestLocation();
            } else {
                HMLog.i(WeatherTimer.c, "locWeather no need.", new Object[0]);
            }
            WeatherTimer.this.b.set(false);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!WeatherTimer.d.equals(intent.getAction())) {
                HMLog.i(WeatherTimer.c, "not wake up action!", new Object[0]);
            } else if (WeatherTimer.this.b.compareAndSet(false, true)) {
                final IWeatherSettingCallback iWeatherSettingCallback = this.a;
                LocWeatherManager.x(new Runnable() { // from class: com.xiaomi.hm.health.locweather.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b(iWeatherSettingCallback);
                    }
                });
            }
        }
    }

    public static class b {
        private static final WeatherTimer a = new WeatherTimer();

        private b() {
        }
    }

    private WeatherTimer() {
        this.b = new AtomicBoolean(false);
    }

    public static WeatherTimer getInstance() {
        return b.a;
    }

    public void c() {
        AlarmManager alarmManager = (AlarmManager) ConfigurationHolder.getContext().getSystemService("alarm");
        if (alarmManager != null) {
            PendingIntent broadcast = PendingIntent.getBroadcast(ConfigurationHolder.getContext(), 0, new Intent(d), Build.VERSION.SDK_INT >= 23 ? 201326592 : AMapEngineUtils.HALF_MAX_P20_WIDTH);
            alarmManager.cancel(broadcast);
            alarmManager.setInexactRepeating(2, SystemClock.elapsedRealtime(), 4500000L, broadcast);
        }
    }

    public void d() {
        PowerManager powerManager = (PowerManager) ConfigurationHolder.getContext().getSystemService("power");
        if (powerManager != null) {
            this.a = powerManager.newWakeLock(1, "LocWeather");
        }
    }

    public void e(IWeatherSettingCallback iWeatherSettingCallback) {
        ConfigurationHolder.getContext().registerReceiver(new a(iWeatherSettingCallback), new IntentFilter(d));
    }

    public void releaseWakeLock() {
        PowerManager.WakeLock wakeLock = this.a;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        this.a.release();
    }
}
