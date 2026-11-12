package com.huami.mifit.sportlib.services;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.PowerManager;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huami.mifit.sportlib.GPSSportApplication;
import com.huami.mifit.sportlib.IServiceObtain;
import com.huami.mifit.sportlib.LocationListener;
import com.huami.mifit.sportlib.LocationProvider;
import com.huami.mifit.sportlib.callback.IServiceDataCallback;
import com.huami.mifit.sportlib.callback.IServiceSportCallback;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.mifit.sportlib.locate.GPSSignal;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.services.util.SportNotification;
import com.huami.mifit.sportlib.services.util.SportServiceHelper;
import com.huami.mifit.sportlib.tts.RunningPlayer;
import com.huami.mifit.sportlib.utils.FunctionSwitcher;
import com.huami.mifit.sportlib.utils.LocationChecker;
import com.huami.mifit.sportlib.utils.MapUtil;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes11.dex */
public class SubGPSSportService extends Service {
    public static final String s = "RService";
    private static final String t = "SubGPSSportService";
    private static boolean u = false;
    private static final String v = "sport-service";
    private IServiceDataCallback a;
    private IServiceSportCallback b;
    private PowerManager h;
    private final b c = new b();
    private com.huami.mifit.sportlib.services.a d = null;
    private a e = null;
    private Context f = null;
    private PowerManager.WakeLock g = null;
    private c i = null;
    private int j = 0;
    private long k = -1;
    private volatile long l = 0;
    private Timer m = null;
    private e n = null;
    private LocationProvider o = null;
    private boolean p = false;
    private String q = "android.intent.action.USER_PRESENT";
    private int r = -1;

    public static class PhoneCallingReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action) && "android.intent.action.PHONE_STATE".equals(action)) {
                String stringExtra = intent.getStringExtra("state");
                SubGPSSportService.u = TelephonyManager.EXTRA_STATE_RINGING.equals(stringExtra) || TelephonyManager.EXTRA_STATE_OFFHOOK.equals(stringExtra);
                LogKit.w2f(SubGPSSportService.t, "isPhoneRinging ==" + SubGPSSportService.u);
                if (!GPSDataController.getInstance().isRunning() || RunningPlayer.getInstance() == null) {
                    return;
                }
                RunningPlayer.getInstance().updatePhoneRinging(SubGPSSportService.u);
            }
        }
    }

    public final class a extends LocationListener.Stub {
        private Location d;
        private double e;
        private double f;
        private double g;
        private double h;
        private final int i;
        private final int j;
        private final int k;
        private int l;

        private a() {
            this.e = Math.random() * 3.141592653589793d * 2.0d;
            this.f = 1.0E-4d;
            this.h = 0.5235987755982988d;
            this.i = -1;
            this.j = 0;
            this.k = 1;
            this.l = -1;
        }

        private Location a(Location location) {
            if (this.d == null) {
                this.d = location;
            }
            this.e += (this.h * Math.random()) - (this.h / 2.0d);
            if (Math.random() > 0.2d) {
                double d = this.f;
                this.g = (0.2d * d) + (d * 0.8d * Math.random());
            }
            Location location2 = this.d;
            location2.setLatitude(location2.getLatitude() + (Math.sin(this.e) * this.g));
            Location location3 = this.d;
            location3.setLongitude(location3.getLongitude() + (Math.cos(this.e) * this.g));
            Location location4 = this.d;
            location4.setAltitude((location4.getAltitude() + 0.5d) - Math.random());
            this.d.setAccuracy(location.getAccuracy());
            this.d.setTime(location.getTime());
            this.d.setBearing((float) this.e);
            this.d.setSpeed(location.getSpeed());
            return this.d;
        }

        private void b(int i) {
            if (SubGPSSportService.this.k <= 0) {
                this.l = -1;
                return;
            }
            int i2 = 0;
            if (LocationChecker.isGPSLocationSupported(SubGPSSportService.this.getApplicationContext()) && GPSSignal.SignalLevel.isAvailable(i)) {
                i2 = 1;
            }
            int i3 = this.l;
            this.l = i2;
        }

        private void onGPSSignalChanged(int i) {
            SubGPSSportService.this.d.b(i);
            b(i);
        }

        @Override // com.huami.mifit.sportlib.LocationListener
        public void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }
            onGPSSignalChanged(GPSSignal.getSignalLevel(location.getAccuracy()));
            if (!FunctionSwitcher.isSupportSuperUser && location.isFromMockProvider()) {
                LogKit.w2f(SubGPSSportService.t, "gps-delta onLocationChanged mock gps provider");
                return;
            }
            if (DataTypeSource.isCreateTestPoint()) {
                location = a(location);
            }
            GPSDataController.getInstance().sendGpsData(location.getTime(), location.getLatitude(), location.getLongitude(), (float) location.getAltitude(), (int) location.getAccuracy(), location.getSpeed());
            GPSPoint gPSPoint = null;
            try {
                if (DataTypeSource.isDrawRealGPSLine()) {
                    gPSPoint = new GPSPoint(location);
                    SubGPSSportService.this.a.onTestLocationChanged(gPSPoint);
                }
                if (SubGPSSportService.this.b != null) {
                    if (gPSPoint == null) {
                        gPSPoint = new GPSPoint(location);
                    }
                    SubGPSSportService.this.b.onInaccuracyLocationChanged(gPSPoint);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            if (SubGPSSportService.this.j < 1) {
                MapUtil.initFirstLocationPoint(new GPSPoint(location.getLatitude(), location.getLongitude()));
            }
        }

        @Override // com.huami.mifit.sportlib.LocationListener
        public void onLocationError(int i, String str) throws RemoteException {
            LogKit.w2f(SubGPSSportService.t, "Location error: " + str);
        }
    }

    public static final class b extends Handler {
        public static final int a = 3;

        private b() {
        }

        public void a() {
            removeMessages(3);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
        }
    }

    public final class c extends BroadcastReceiver {
        private c() {
        }

        public IntentFilter a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            return intentFilter;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                return;
            }
            if ("android.intent.action.SCREEN_ON".equals(action) || "android.intent.action.USER_PRESENT".equals(action) || "android.intent.action.SCREEN_OFF".equals(action)) {
                if (SubGPSSportService.this.b != null) {
                    try {
                        SubGPSSportService.this.b.onScreenStatusChanged(action, SubGPSSportService.this.q);
                    } catch (Exception e) {
                        LogKit.w2f(SubGPSSportService.s, "onScreenStatusChanged:" + e.toString());
                    }
                }
                SubGPSSportService.this.q = action;
            }
            if (SubGPSSportService.this.k > 0 && !"android.intent.action.SCREEN_ON".equals(action)) {
                if (!"android.intent.action.USER_PRESENT".equals(action)) {
                    if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        LogKit.w2f(SubGPSSportService.s, "BringToFront>> ACTION_SCREEN_OFF");
                    }
                } else {
                    if (SportServiceHelper.isSportingForeground(SubGPSSportService.this.f, new String[0])) {
                        return;
                    }
                    LogKit.w2f(SubGPSSportService.s, "BringToFront>> ACTION_USER_PRESENT");
                    SubGPSSportService.this.z();
                }
            }
        }
    }

    public final class d extends IServiceObtain.Stub {
        private d() {
        }

        private void d() {
            SportNotification.getInstance().setForegroundRunning(SubGPSSportService.this);
            SubGPSSportService.this.G(true);
        }

        private void e() {
            if (SubGPSSportService.this.d != null) {
                SubGPSSportService.this.d.c();
            }
            SubGPSSportService.this.G(false);
            SportNotification.getInstance().cancelForgroundRunning(SubGPSSportService.this);
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void changeSportType(int i) throws RemoteException {
            SubGPSSportService.this.r = i;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public String getGPSProvider() throws RemoteException {
            return "gps";
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public int getGPSSignalLevel() throws RemoteException {
            return SubGPSSportService.this.d == null ? GPSSignal.SignalLevel.DEFAULT.getValue() : SubGPSSportService.this.d.a();
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public int getSportState() throws RemoteException {
            return SubGPSSportService.this.j;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public int getSportType() throws RemoteException {
            return SubGPSSportService.this.r;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public long getTickerTimeInMillisecond() throws RemoteException {
            return SubGPSSportService.this.l;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public long getTrackId() throws RemoteException {
            return SubGPSSportService.this.k;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public int getUserOpState() throws RemoteException {
            return -1;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void pauseSport(int i) throws RemoteException {
            SubGPSSportService.this.A();
            SubGPSSportService.this.j = 2;
            GPSDataController.getInstance().pause(i);
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void recoverRun(long j) throws RemoteException {
            SubGPSSportService.this.k = j;
            d();
            SubGPSSportService.this.l = GPSDataController.getInstance().recoverRun(SubGPSSportService.this.r, j, SubGPSSportService.this.a, SubGPSSportService.this.b);
            SubGPSSportService.this.j = 1;
            SubGPSSportService.this.D();
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void registerDataCallback(IServiceDataCallback iServiceDataCallback) throws RemoteException {
            SubGPSSportService.this.a = iServiceDataCallback;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void registerSportCallback(IServiceSportCallback iServiceSportCallback) throws RemoteException {
            SubGPSSportService.this.b = iServiceSportCallback;
            SubGPSSportService.this.d.d(SubGPSSportService.this.b);
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void restoreGpsLine() throws RemoteException {
            GPSDataController.getInstance().restoreGpsLine();
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void resumeSport(int i) throws RemoteException {
            SubGPSSportService.this.j = 3;
            GPSDataController.getInstance().resume(i);
            SubGPSSportService.this.D();
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void setLocationProvider(LocationProvider locationProvider) throws RemoteException {
            if (SubGPSSportService.this.p) {
                return;
            }
            SubGPSSportService.this.o = locationProvider;
            SubGPSSportService.this.C();
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public long startSport(int i) throws RemoteException {
            SubGPSSportService.this.k = System.currentTimeMillis() / 1000;
            d();
            GPSDataController.getInstance().start(i, SubGPSSportService.this.k, SubGPSSportService.this.a, SubGPSSportService.this.b);
            SubGPSSportService.this.j = 1;
            SubGPSSportService.this.l = 0L;
            SubGPSSportService.this.D();
            return SubGPSSportService.this.k;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void stopSport(int i) throws RemoteException {
            if (SubGPSSportService.this.j == 4) {
                LogKit.w2f(SubGPSSportService.t, "sport has stopped");
                return;
            }
            SubGPSSportService.this.k = -1L;
            SubGPSSportService.this.A();
            e();
            SubGPSSportService.this.j = 4;
            GPSDataController.getInstance().stop(i);
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void verifyIndoorDistance(int i) throws RemoteException {
        }
    }

    public final class e extends TimerTask {
        private long c;
        private boolean a = false;
        private final long d = 30000;
        private long b = System.currentTimeMillis();

        public e() {
        }

        public void a() {
            this.a = true;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (this.a) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            SubGPSSportService.this.l += jCurrentTimeMillis - this.b;
            this.b = jCurrentTimeMillis;
            GPSDataController.getInstance().sendTickerData(SubGPSSportService.this.l);
            if (SubGPSSportService.this.l - this.c > 30000) {
                this.c = SubGPSSportService.this.l;
                LogKit.w2f(SubGPSSportService.s, "BringToFront>> TimeTickerTask delta=" + this.c);
                if (SportServiceHelper.isSportingForeground(SubGPSSportService.this.f, new String[0])) {
                    return;
                }
                "android.intent.action.SCREEN_OFF".equals(SubGPSSportService.this.q);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        Timer timer = this.m;
        if (timer != null) {
            timer.cancel();
            this.m = null;
        }
        e eVar = this.n;
        if (eVar != null) {
            eVar.a();
            this.n.cancel();
            this.n = null;
        }
    }

    private void B() {
        c cVar = new c();
        this.i = cVar;
        registerReceiver(cVar, cVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.p) {
            return;
        }
        try {
            this.p = true;
            this.o.startLocation(this.e);
        } catch (Exception unused) {
            LogKit.w2f(t, "Monitor cancelLocation exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        A();
        this.m = new Timer();
        e eVar = new e();
        this.n = eVar;
        this.m.schedule(eVar, 0L, 500L);
    }

    private void E() {
        this.p = false;
        LocationProvider locationProvider = this.o;
        if (locationProvider != null) {
            try {
                locationProvider.stopLocation();
            } catch (Exception unused) {
                LogKit.w2f(t, "Monitor cancelLocation exception");
            }
        }
    }

    private void F() {
        c cVar = this.i;
        if (cVar != null) {
            unregisterReceiver(cVar);
            this.i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(boolean z) {
        PowerManager.WakeLock wakeLock = this.g;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                this.g.release();
            }
            this.g = null;
        }
        if (z) {
            PowerManager.WakeLock wakeLockNewWakeLock = this.h.newWakeLock(1, "Mifit-Runner");
            this.g = wakeLockNewWakeLock;
            if (wakeLockNewWakeLock != null) {
                wakeLockNewWakeLock.acquire();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (u) {
            return;
        }
        SportServiceHelper.bringSportToFront(this.f, GPSSportApplication.getSportMainClass());
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        LogKit.w2f(s, "sportService onBind ");
        this.c.removeMessages(3);
        this.c.sendEmptyMessage(3);
        return new d();
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f = getApplicationContext();
        this.d = new com.huami.mifit.sportlib.services.a();
        u = false;
        this.h = (PowerManager) this.f.getSystemService("power");
        this.e = new a();
        RunningPlayer.init(getApplicationContext());
        LogKit.w2f(s, "sportService onCreate");
        B();
        G(false);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.c.a();
        E();
        G(false);
        RunningPlayer.destroy();
        F();
        MapUtil.initFirstLocationPoint(null);
        super.onDestroy();
        LogKit.w2f(s, " onDestroy ");
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        LogKit.w2f(s, "sportService onLowMemory");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        LogKit.w2f(s, "sportService onStartCommand");
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        LogKit.w2f(s, "sportService onTaskRemoved");
        SportNotification.getInstance().cancelForgroundRunning(this);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        LogKit.w2f(s, "sportService onTrimMemory level=" + i);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        LogKit.w2f(s, "sportService onUnbind");
        return super.onUnbind(intent);
    }
}
