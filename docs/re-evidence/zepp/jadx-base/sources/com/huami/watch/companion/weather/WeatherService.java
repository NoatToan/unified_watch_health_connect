package com.huami.watch.companion.weather;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.location.Location;
import com.huami.watch.companion.location.LocationListener;
import com.huami.watch.companion.location.LocationManager;
import com.huami.watch.companion.weather.bean.WeatherCity;
import com.huami.watch.companion.weather.bean.WeatherInfo;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class WeatherService extends Service {
    private static final String i = "Weather-Service";
    private static final int j = 1;
    private static final int k = 2;
    private static final long l = 3660000;
    private static final long m = 3000;
    private static final long n = 3000;
    private static final int o = 2;
    private int a;
    private Handler b = new a();
    private WeatherManager c;
    private LocationManager d;
    private LocationListener e;
    private boolean f;
    private boolean g;
    private Transporter h;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                WeatherService.this.m();
            } else {
                if (i != 2) {
                    return;
                }
                WeatherService.this.o();
            }
        }
    }

    public class b implements LocationListener {
        public b() {
        }

        @Override // com.huami.watch.companion.location.LocationListener
        public void onLocationError(int i) {
            WeatherService.this.c.saveLocation(null);
            if (WeatherService.this.c.isUserCity()) {
                return;
            }
            if (i != 1) {
                WeatherService.this.q();
                WeatherService.this.n(WeatherService.l);
                return;
            }
            WeatherService weatherService = WeatherService.this;
            int i2 = weatherService.a + 1;
            weatherService.a = i2;
            if (i2 <= 2) {
                WeatherService.this.n(3000L);
            } else {
                WeatherService.this.q();
                WeatherService.this.n(WeatherService.l);
            }
        }

        @Override // com.huami.watch.companion.location.LocationListener
        public void onLocationReceived(@NonNull Location location) {
            if (location.getAddress() != null) {
                WeatherService.this.c.saveLocation(location.getAddress().toStringShort());
            }
            if (WeatherService.this.c.isUserCity()) {
                return;
            }
            WeatherService.this.a = 0;
            WeatherService.this.n(WeatherService.l);
        }
    }

    public class c implements WeatherListener {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Transporter b;

        public c(Context context, Transporter transporter) {
            this.a = context;
            this.b = transporter;
        }

        @Override // com.huami.watch.companion.weather.WeatherListener
        public void onReceiveWeather(WeatherInfo weatherInfo) {
            Log.d(WeatherService.i, "On Receive Weather!!", new Object[0]);
            if (DeviceManager.getManager(this.a).isCurrentDeviceBLE()) {
                WeatherWatchExtender.l(this.a, weatherInfo, true, true, WeatherService.this.f, WeatherService.this.g);
            } else {
                WeatherWatchExtender.syncWeatherToWatch(this.a, this.b, weatherInfo, true, true, WeatherService.this.f, WeatherService.this.g);
            }
            if (WeatherService.this.c.isUserCity()) {
                WeatherService.this.r(WeatherService.l);
            }
        }

        @Override // com.huami.watch.companion.weather.WeatherListener
        public void onReceiveWeatherError() {
            Log.w(WeatherService.i, "On Receive Weather Error!!", new Object[0]);
            if (WeatherService.this.c.isUserCity()) {
                WeatherService weatherService = WeatherService.this;
                int i = weatherService.a + 1;
                weatherService.a = i;
                if (i <= 2) {
                    WeatherService.this.r(3000L);
                } else {
                    WeatherService.this.r(WeatherService.l);
                }
            }
        }
    }

    private void k(Context context) {
        this.d = LocationManager.getManager(context);
        b bVar = new b();
        this.e = bVar;
        this.d.addLocationListener(bVar);
    }

    private void l(Context context, Transporter transporter) {
        WeatherManager manager = WeatherManager.getManager(this);
        this.c = manager;
        manager.registerLocationChanged();
        this.c.registerWeatherListener(new c(context, transporter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        Log.d(i, "Request Location!!", new Object[0]);
        this.d.requestLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(long j2) {
        Log.d(i, "Request Location Delay : " + ((j2 / 1000) / 60.0f) + "min", new Object[0]);
        this.b.removeMessages(1);
        this.b.sendEmptyMessageDelayed(1, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        WeatherCity userCity = this.c.getUserCity();
        if (userCity != null) {
            this.c.requestWeatherASync(userCity);
        } else {
            Log.d(i, "Request Weather By LBS!!", new Object[0]);
            m();
        }
    }

    private void p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        WeatherCity weatherCityF = this.c.f();
        if (weatherCityF != null) {
            this.c.requestWeatherASync(weatherCityF);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(long j2) {
        Log.d(i, "Request Weather Delay : " + ((j2 / 1000) / 60.0f) + "min", new Object[0]);
        this.b.removeMessages(2);
        this.b.sendEmptyMessageDelayed(2, j2);
    }

    public static void start(Context context) {
        if (Config.isUserKR(context) && WeatherManager.getManager(context).getUserCity() == null) {
            Log.d(i, "KR user not selected city , abort!", new Object[0]);
            return;
        }
        try {
            context.startService(new Intent(context, (Class<?>) WeatherService.class));
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.h = Transporter.get(this, "com.huami.watch.companion");
        k(this);
        l(this, this.h);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.d.removeLocationListener(this.e);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        Log.d(i, "OnStartCommand : " + intent, new Object[0]);
        this.a = 0;
        r(3000L);
        if (WeatherWatchExtender.isDailyNotificationEnabled(this)) {
            this.f = true;
            p();
        } else {
            this.f = false;
        }
        if (WeatherWatchExtender.isWarningNotificationEnabled(this)) {
            this.g = true;
        } else {
            this.g = false;
        }
        return super.onStartCommand(intent, i2, i3);
    }
}
