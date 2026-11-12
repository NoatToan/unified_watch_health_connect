package com.huami.mifit.sportlib.locate;

import android.content.Context;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.mifit.sportlib.utils.FunctionSwitcher;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class AmapLocationMonitor implements ILocationMonitor {
    private static final String j = "AmapLocationMonitor";
    private static volatile AmapLocationMonitor k = null;
    private static final int l = 1000;
    private final Context a;
    private boolean d;
    private SimpleDateFormat e;
    private String f;
    private AMapLocationClient b = null;
    private AMapLocationClientOption c = null;
    private Map<String, ILocationInfoListener> g = new ConcurrentHashMap();
    private AtomicInteger h = new AtomicInteger(0);
    private AMapLocationListener i = new a();

    public class a implements AMapLocationListener {
        private long a = 0;

        public a() {
        }

        @Override // com.amap.api.location.AMapLocationListener
        public void onLocationChanged(AMapLocation aMapLocation) {
            if (aMapLocation != null) {
                if (aMapLocation.getErrorCode() != 0) {
                    LogKit.w2f("AmapError", "AMapLocationListener location Error, ErrCode:" + aMapLocation.getErrorCode() + ", errInfo:" + aMapLocation.getErrorInfo());
                    return;
                }
                if (aMapLocation.getAccuracy() >= 80.0f) {
                    LogKit.w2f(AmapLocationMonitor.j, "AMapLocationListener location Accuracy:" + aMapLocation.getAccuracy() + ", LOW by:" + aMapLocation.getProvider());
                }
                if (aMapLocation.getTime() - this.a <= 500) {
                    LogKit.w2f(AmapLocationMonitor.j, "AMapLocationListener location time interval is too short curr:" + aMapLocation.getTime() + ",last:" + this.a);
                    return;
                }
                this.a = aMapLocation.getTime();
                if (AmapLocationMonitor.this.d) {
                    String str = AmapLocationMonitor.this.e.format(new Date()) + "," + aMapLocation.getProvider() + "," + aMapLocation.getLatitude() + "," + aMapLocation.getLongitude() + "," + aMapLocation.getAltitude() + "," + aMapLocation.getSpeed() + "," + aMapLocation.getBearing() + "," + (aMapLocation.getTime() / 1000) + "," + aMapLocation.getAccuracy();
                    if (Build.VERSION.SDK_INT >= 26) {
                        str = str + "," + aMapLocation.getVerticalAccuracyMeters() + "," + aMapLocation.getSpeedAccuracyMetersPerSecond() + "," + aMapLocation.getBearingAccuracyDegrees();
                    }
                    LogKit.privacyLog(AmapLocationMonitor.this.f, str);
                }
                if (AmapLocationMonitor.this.g != null) {
                    Iterator it2 = AmapLocationMonitor.this.g.keySet().iterator();
                    while (it2.hasNext()) {
                        ILocationInfoListener iLocationInfoListener = (ILocationInfoListener) AmapLocationMonitor.this.g.get((String) it2.next());
                        if (iLocationInfoListener != null) {
                            iLocationInfoListener.onLocationChanged(aMapLocation);
                        }
                    }
                }
            }
        }
    }

    private AmapLocationMonitor(Context context) {
        this.d = false;
        this.a = context;
        this.d = FunctionSwitcher.isSupportRecordKeyData;
    }

    private void e() {
        k = null;
    }

    private void f() {
        this.c = new AMapLocationClientOption();
        AMapLocationClient aMapLocationClient = new AMapLocationClient(this.a);
        this.b = aMapLocationClient;
        aMapLocationClient.setLocationListener(this.i);
        if (FunctionSwitcher.isSupportSuperUser) {
            this.c.setLocationMode(AMapLocationClientOption.AMapLocationMode.Device_Sensors);
            this.c.setMockEnable(true);
        } else {
            this.c.setLocationPurpose(AMapLocationClientOption.AMapLocationPurpose.Sport);
        }
        this.c.setNeedAddress(false);
        this.c.setInterval(1000L);
        this.c.setGpsFirst(true);
        this.b.setLocationOption(this.c);
        this.b.stopLocation();
        this.b.startLocation();
    }

    public static AmapLocationMonitor getInstance(Context context) {
        if (k == null) {
            synchronized (AmapLocationMonitor.class) {
                if (k == null) {
                    k = new AmapLocationMonitor(context);
                }
            }
        }
        return k;
    }

    @Override // com.huami.mifit.sportlib.locate.ILocationMonitor
    public boolean hasRegisterLocationListener(@Nullable String str) {
        return this.g.containsKey(str);
    }

    @Override // com.huami.mifit.sportlib.locate.ILocationMonitor
    public void registerLocationListener(String str, ILocationInfoListener iLocationInfoListener) {
        if (this.g.containsKey(str)) {
            throw new IllegalArgumentException("duplicate key");
        }
        this.g.put(str, iLocationInfoListener);
    }

    @Override // com.huami.mifit.sportlib.locate.ILocationMonitor
    public void releaseLocation() {
        int iDecrementAndGet = this.h.decrementAndGet();
        AMapLocationClient aMapLocationClient = this.b;
        if (aMapLocationClient != null && iDecrementAndGet == 0) {
            if (aMapLocationClient.isStarted()) {
                this.b.stopLocation();
            }
            this.b.unRegisterLocationListener(this.i);
            this.b.onDestroy();
        }
        if (iDecrementAndGet != 0) {
            LogKit.w2f(j, "refcount -- not release Client");
        } else {
            e();
            LogKit.w2f(j, "finally release client");
        }
    }

    public void requestAmapLocation() {
        if (ContextCompat.checkSelfPermission(this.a, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            LogKit.w2f(j, "NO ACCESS_FINE_LOCATION Permission");
            return;
        }
        LogKit.w2f(j, "try to requestAmapLocation");
        if (this.d) {
            this.e = new SimpleDateFormat(TrainingDateUtils.PATTERN_YMD_HMSS, Locale.ENGLISH);
            String str = "requestAmapLocation" + this.e.format(new Date());
            this.f = str;
            LogKit.privacyLog(str, "requestAmapLocationphoneTime,provider,latitude,longitude,altitude,speed,course,timestamp,horizontalAccuracy,verticalAccuracy,speedAccuracy,courseAccuracy");
        }
        if (this.h.incrementAndGet() <= 1) {
            f();
        }
    }

    @Override // com.huami.mifit.sportlib.locate.ILocationMonitor
    public void requestLocation() {
        if (ContextCompat.checkSelfPermission(this.a, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            LogKit.w2f(j, "NO ACCESS_FINE_LOCATION Permission");
            return;
        }
        LogKit.w2f(j, "try to requestAmapLocation");
        if (this.d) {
            this.e = new SimpleDateFormat(TrainingDateUtils.PATTERN_YMD_HMSS, Locale.ENGLISH);
            String str = "requestAmapLocation" + this.e.format(new Date());
            this.f = str;
            LogKit.privacyLog(str, "requestAmapLocationphoneTime,provider,latitude,longitude,altitude,speed,course,timestamp,horizontalAccuracy,verticalAccuracy,speedAccuracy,courseAccuracy");
        }
        if (this.h.incrementAndGet() <= 1) {
            f();
        }
    }

    @Override // com.huami.mifit.sportlib.locate.ILocationMonitor
    public void unregisterLocationListener(String str) {
        if (!this.g.containsKey(str)) {
            throw new IllegalArgumentException("no existed key");
        }
        this.g.remove(str);
    }
}
