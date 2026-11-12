package com.xiaomi.fitness.sync;

import android.app.Notification;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FusionLocationRequestKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.keep_alive.KeepAliveService;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.sync.WeatherLocationService;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.i1j;
import defpackage.kah;
import defpackage.x8r;
import defpackage.zwi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\"\u0010\u0011\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0004R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sync/WeatherLocationService;", "Landroid/app/Service;", "<init>", "()V", "mHandler", "Landroid/os/Handler;", "mTimeoutRunnable", "Ljava/lang/Runnable;", "mCommandNum", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", LifecycleConstantKt.ON_DESTROY, "onStartCommand", "flags", "startId", "startForeground", "stopForegroundInternal", "force", "", "LocationHelper", "Companion", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeatherLocationService extends Service {

    @NotNull
    public static final String ACTION_START = "com.xiaomi.wearable.home.devices.ble.sync.WeatherLocationService.START";

    @NotNull
    public static final String BROADCAST_ACTION = "com.xiaomi.wearable.home.devices.ble.sync.WeatherLocationService.BROADCAST";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int NOTIFICATION_ID = 1002;

    @NotNull
    private static final String PARAM_ALTITUDE = "altitude";

    @NotNull
    private static final String PARAM_ERROR_MSG = "error_msg";

    @NotNull
    public static final String PARAM_IS_HIGHACCURACY = "is_highaccuracy";

    @NotNull
    private static final String PARAM_LATITUDE = "latitude";

    @NotNull
    private static final String PARAM_LONGITUDE = "longitude";

    @NotNull
    private static final String PARAM_RESULT = "result";

    @NotNull
    private static final String TAG = "WeatherLocationService";
    private static final int TIMEOUT = 60000;

    @NotNull
    public static final String WEATHERTAG = "Wearable.weather";
    private int mCommandNum;

    @NotNull
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    @NotNull
    private final Runnable mTimeoutRunnable = new Runnable() { // from class: z8r
        @Override // java.lang.Runnable
        public final void run() {
            WeatherLocationService.mTimeoutRunnable$lambda$0(this.f41034a);
        }
    };

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/sync/WeatherLocationService$Companion;", "", "Landroid/content/Context;", "context", "", "highAccuracy", "Lkah;", "onWeatherLocationCallback", "", "requestLocation", "(Landroid/content/Context;ZLkah;)V", "", "TAG", "Ljava/lang/String;", "WEATHERTAG", "ACTION_START", "BROADCAST_ACTION", "PARAM_IS_HIGHACCURACY", "PARAM_RESULT", "PARAM_LONGITUDE", "PARAM_LATITUDE", "PARAM_ALTITUDE", "PARAM_ERROR_MSG", "", "NOTIFICATION_ID", "I", "TIMEOUT", "<init>", "()V", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void requestLocation(@NotNull Context context, boolean highAccuracy, @NotNull kah onWeatherLocationCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(onWeatherLocationCallback, "onWeatherLocationCallback");
            Logger.i("Wearable.weather", "WeatherLocationService.requestLocation  highAccuracy:" + highAccuracy);
            new LocationHelper(context, highAccuracy, onWeatherLocationCallback).request();
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/sync/WeatherLocationService$LocationHelper;", "", "", "request", "()V", BroadcastsKt.SILENT_PUSHING_STOP, "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "", "mIsHighAccuracy", "Z", "Lkah;", "mOnWeatherLocationCallback", "Lkah;", "Landroid/content/BroadcastReceiver;", "mBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "mHasStopped", "Landroid/os/Handler;", "mHandle", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "mRunnable", "Ljava/lang/Runnable;", "onWeatherLocationCallback", "<init>", "(Landroid/content/Context;ZLkah;)V", "Companion", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class LocationHelper {

        @NotNull
        private static final String TAG = "LocationHelper";
        private static final int TIMEOUT = 60000;

        @NotNull
        private final BroadcastReceiver mBroadcastReceiver;

        @NotNull
        private final Context mContext;

        @NotNull
        private final Handler mHandle;
        private boolean mHasStopped;
        private final boolean mIsHighAccuracy;

        @NotNull
        private final kah mOnWeatherLocationCallback;

        @NotNull
        private final Runnable mRunnable;

        public LocationHelper(@NotNull Context mContext, boolean z, @NotNull kah onWeatherLocationCallback) {
            Intrinsics.checkNotNullParameter(mContext, "mContext");
            Intrinsics.checkNotNullParameter(onWeatherLocationCallback, "onWeatherLocationCallback");
            this.mContext = mContext;
            this.mIsHighAccuracy = z;
            this.mOnWeatherLocationCallback = onWeatherLocationCallback;
            this.mHandle = new Handler(Looper.getMainLooper());
            this.mRunnable = new Runnable() { // from class: a9r
                @Override // java.lang.Runnable
                public final void run() {
                    WeatherLocationService.LocationHelper.mRunnable$lambda$0(this.f808a);
                }
            };
            this.mBroadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.sync.WeatherLocationService.LocationHelper.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(intent, "intent");
                    Logger.i("Wearable.weather", "LocationHelper.onReceive " + this);
                    if (LocationHelper.this.mHasStopped) {
                        Logger.e("Wearable.weather", "LocationHelper.onReceive  has stopped, error");
                        return;
                    }
                    boolean booleanExtra = intent.getBooleanExtra(WeatherLocationService.PARAM_IS_HIGHACCURACY, false);
                    if (LocationHelper.this.mIsHighAccuracy != booleanExtra) {
                        Logger.i("Wearable.weather", "LocationHelper.onReceive  accuracy not match  mHighAccuracy:" + LocationHelper.this.mIsHighAccuracy + "  isHighAccuracy:" + booleanExtra);
                        return;
                    }
                    if (intent.getBooleanExtra("result", false)) {
                        double doubleExtra = intent.getDoubleExtra("longitude", 0.0d);
                        double doubleExtra2 = intent.getDoubleExtra("latitude", 0.0d);
                        double doubleExtra3 = intent.getDoubleExtra("altitude", 0.0d);
                        Logger.i("Wearable.weather", "LocationHelper.onReceive  success  longitude:" + doubleExtra + "  latitude:" + doubleExtra2 + "  altitude:" + doubleExtra3);
                        LocationHelper.this.mOnWeatherLocationCallback.locationSuccess(doubleExtra2, doubleExtra, doubleExtra3);
                    } else {
                        String stringExtra = intent.getStringExtra(WeatherLocationService.PARAM_ERROR_MSG);
                        Logger.i("Wearable.weather", "LocationHelper.onReceive  fail  msg:" + stringExtra);
                        LocationHelper.this.mOnWeatherLocationCallback.locationFail(stringExtra);
                    }
                    LocationHelper.this.stop();
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void mRunnable$lambda$0(LocationHelper this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Logger.i("Wearable.weather", "LocationHelper.run  timeout");
            this$0.mOnWeatherLocationCallback.locationFail("time out");
            this$0.stop();
        }

        public final void request() {
            Logger.i("Wearable.weather", "LocationHelper.request  receiver:" + this.mBroadcastReceiver);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(WeatherLocationService.BROADCAST_ACTION);
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                this.mContext.registerReceiver(this.mBroadcastReceiver, intentFilter, 2);
            } else {
                this.mContext.registerReceiver(this.mBroadcastReceiver, intentFilter);
            }
            try {
                Intent intent = new Intent(this.mContext, (Class<?>) WeatherLocationService.class);
                intent.setAction(WeatherLocationService.ACTION_START);
                intent.putExtra(WeatherLocationService.PARAM_IS_HIGHACCURACY, this.mIsHighAccuracy);
                boolean zIsForeground = ApplicationExtKt.isForeground(ApplicationExtKt.getApplication());
                Logger.i("Wearable.weather", "request location, isForeground: " + zIsForeground);
                if (!zIsForeground && i >= 29) {
                    Logger.i("Wearable.weather", "check if has bg location permission: " + PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ACCESS_BACKGROUND_LOCATION"));
                }
                Logger.i("Wearable.weather", "LocationHelper.request  startService  startForegroundService");
                if (i < 33 || FusionLocationRequestKt.isHasLocationPermission()) {
                    this.mContext.startForegroundService(intent);
                    this.mHandle.postDelayed(this.mRunnable, 60000L);
                } else {
                    Unit unit = Unit.INSTANCE;
                    Logger.i("Wearable.weather", "LocationHelper.request  fail to start service");
                    this.mOnWeatherLocationCallback.locationFail("fail start service");
                    this.mContext.unregisterReceiver(this.mBroadcastReceiver);
                }
            } catch (Throwable unused) {
                Logger.i("Wearable.weather", "LocationHelper.request  startService");
            }
        }

        public final void stop() {
            Logger.i("Wearable.weather", "LocationHelper.stop  receiver" + this.mBroadcastReceiver);
            this.mHasStopped = true;
            this.mHandle.removeCallbacks(this.mRunnable);
            try {
                this.mContext.unregisterReceiver(this.mBroadcastReceiver);
            } catch (Throwable th) {
                Logger.e("Wearable.weather", "LocationHelper.stop  unregisterReceiver error", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mTimeoutRunnable$lambda$0(WeatherLocationService this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i("Wearable.weather", "WeatherLocationService.mTimeoutRunnable");
        this$0.stopForegroundInternal(true);
    }

    private final void startForeground() {
        Logger.i("Wearable.weather", "WeatherLocationService.startForeground");
        KeepAliveService.Companion companion = KeepAliveService.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion.addNotificationChannel(applicationContext);
        Context applicationContext2 = getApplicationContext();
        Notification.Builder builder = new Notification.Builder(applicationContext2);
        builder.setSmallIcon(zwi.f41754b);
        builder.setLargeIcon(BitmapFactory.decodeResource(applicationContext2.getResources(), zwi.f41753a));
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String string = (wearableDeviceModel == null || !DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.ATMO_PRESURE)) ? applicationContext2.getString(i1j.e) : applicationContext2.getString(i1j.d);
        Intrinsics.checkNotNull(string);
        builder.setTicker(string);
        builder.setContentTitle(applicationContext2.getString(i1j.c));
        builder.setContentText(string);
        int i = Build.VERSION.SDK_INT;
        builder.setChannelId(KeepAliveService.CHANNEL_ID);
        builder.setOngoing(true);
        builder.setGroup("com.mi.health");
        Notification notificationBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        try {
            if (i < 34) {
                startForeground(1002, notificationBuild);
            } else if (PermissionsUtil.INSTANCE.checkPermission("android.permission.ACCESS_FINE_LOCATION")) {
                startForeground(1002, notificationBuild, 8);
            } else {
                Logger.i(TAG, "startForeground: lost permission");
            }
        } catch (Throwable th) {
            Logger.i("Wearable.weather", "WeatherLocationService.startForeground  exception", th);
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        Logger.i("Wearable.weather", "WeatherLocationService.onCreate");
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Logger.i("Wearable.weather", "WeatherLocationService.onDestroy");
        super.onDestroy();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        if (intent == null) {
            Logger.i("Wearable.weather", "WeatherLocationService.onStartCommand intent is null , stopForeground");
            stopForeground(true);
            return 3;
        }
        final boolean booleanExtra = intent.getBooleanExtra(PARAM_IS_HIGHACCURACY, false);
        int i = this.mCommandNum + 1;
        this.mCommandNum = i;
        Logger.i("Wearable.weather", "WeatherLocationService.onStartCommand  isHighAccuracy:" + booleanExtra + "  commandNum:" + i);
        startForeground();
        x8r x8rVarD = x8r.d(this);
        Intrinsics.checkNotNullExpressionValue(x8rVarD, "getInstance(...)");
        x8rVarD.a(booleanExtra);
        boolean weather_location_by_android = ConfigPreference.INSTANCE.getWEATHER_LOCATION_BY_ANDROID();
        Logger.i(TAG, "config : " + weather_location_by_android);
        x8rVarD.b(weather_location_by_android, new kah() { // from class: com.xiaomi.fitness.sync.WeatherLocationService.onStartCommand.1
            @Override // defpackage.kah
            public void locationFail(String errorMsg) {
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                if (WeatherLocationService.this.mCommandNum > 0) {
                    WeatherLocationService.this.mCommandNum--;
                }
                Logger.i("Wearable.weather", "WeatherLocationService.locationFail  errorMsg:" + errorMsg + "  commandNum:" + WeatherLocationService.this.mCommandNum);
                Intent intent2 = new Intent();
                intent2.setPackage(WeatherLocationService.this.getPackageName());
                intent2.setAction(WeatherLocationService.BROADCAST_ACTION);
                intent2.putExtra(WeatherLocationService.PARAM_IS_HIGHACCURACY, booleanExtra);
                intent2.putExtra("result", false);
                intent2.putExtra(WeatherLocationService.PARAM_ERROR_MSG, errorMsg);
                WeatherLocationService.this.sendBroadcast(intent2);
                WeatherLocationService.this.stopForegroundInternal(false);
            }

            @Override // defpackage.kah
            public void locationSuccess(double latitude, double longitude, double altitude) {
                if (WeatherLocationService.this.mCommandNum > 0) {
                    WeatherLocationService.this.mCommandNum--;
                }
                Logger.i("Wearable.weather", "WeatherLocationService.locationSuccess   longitude:" + longitude + "  latitude:" + latitude + "  altitude:" + altitude + "  commandNum:" + WeatherLocationService.this.mCommandNum);
                Intent intent2 = new Intent();
                intent2.setPackage(WeatherLocationService.this.getPackageName());
                intent2.setAction(WeatherLocationService.BROADCAST_ACTION);
                intent2.putExtra(WeatherLocationService.PARAM_IS_HIGHACCURACY, booleanExtra);
                intent2.putExtra("result", true);
                intent2.putExtra("latitude", latitude);
                intent2.putExtra("longitude", longitude);
                intent2.putExtra("altitude", altitude);
                WeatherLocationService.this.sendBroadcast(intent2);
                WeatherLocationService.this.stopForegroundInternal(false);
            }
        });
        this.mHandler.removeCallbacks(this.mTimeoutRunnable);
        this.mHandler.postDelayed(this.mTimeoutRunnable, 60000L);
        Logger.i("Wearable.weather", "WeatherLocationService.onStartCommand  end");
        return 1;
    }

    public final void stopForegroundInternal(boolean force) {
        if (this.mCommandNum != 0 && force) {
            Logger.i("Wearable.weather", "WeatherLocationService.stopForeground  force mCommandNum to 0");
            this.mCommandNum = 0;
        }
        if (this.mCommandNum != 0) {
            Logger.i("Wearable.weather", "WeatherLocationService.stopForeground  mCommandNum is not 0，just return");
            return;
        }
        Logger.i("Wearable.weather", "WeatherLocationService.stopForeground  stop");
        this.mHandler.removeCallbacks(this.mTimeoutRunnable);
        stopForeground(true);
    }
}
