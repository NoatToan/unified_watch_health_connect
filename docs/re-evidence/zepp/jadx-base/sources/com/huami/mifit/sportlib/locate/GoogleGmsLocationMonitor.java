package com.huami.mifit.sportlib.locate;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.mifit.sportlib.locate.GoogleGmsLocationMonitor;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.mifit.sportlib.utils.FunctionSwitcher;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b*\u0001(\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/huami/mifit/sportlib/locate/GoogleGmsLocationMonitor;", "Lcom/huami/mifit/sportlib/locate/ILocationMonitor;", "", "c", "requestLocation", "releaseLocation", "", "listenerKey", "", "hasRegisterLocationListener", "Lcom/huami/mifit/sportlib/locate/ILocationInfoListener;", "locationListener", "registerLocationListener", "unregisterLocationListener", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/text/SimpleDateFormat;", "b", "Ljava/text/SimpleDateFormat;", "sdf", "Ljava/lang/String;", "extraName", "Lcom/google/android/gms/location/FusedLocationProviderClient;", GoogleApiAvailabilityLight.a, "Lcom/google/android/gms/location/FusedLocationProviderClient;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/LocationRequest;", "e", "Lcom/google/android/gms/location/LocationRequest;", "locationRequest", "Ljava/util/concurrent/ConcurrentHashMap;", "f", "Ljava/util/concurrent/ConcurrentHashMap;", "listeners", "Ljava/util/concurrent/atomic/AtomicInteger;", "g", "Ljava/util/concurrent/atomic/AtomicInteger;", "refCount", "com/huami/mifit/sportlib/locate/GoogleGmsLocationMonitor$locationCallback$1", "h", "Lcom/huami/mifit/sportlib/locate/GoogleGmsLocationMonitor$locationCallback$1;", "locationCallback", "<init>", "(Landroid/content/Context;)V", "Companion", "sportlib_release"}, k = 1, mv = {1, 5, 1})
public final class GoogleGmsLocationMonitor implements ILocationMonitor {
    public static final int MIN_INTERVAL_TIME = 1000;

    @NotNull
    public static final String TAG = "GoogleGmsLocationMonitor";

    @Nullable
    private static volatile GoogleGmsLocationMonitor j;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private SimpleDateFormat sdf;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String extraName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private FusedLocationProviderClient fusedLocationProviderClient;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private LocationRequest locationRequest;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<String, ILocationInfoListener> listeners = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final AtomicInteger refCount = new AtomicInteger(0);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private GoogleGmsLocationMonitor$locationCallback$1 locationCallback = new LocationCallback() { // from class: com.huami.mifit.sportlib.locate.GoogleGmsLocationMonitor$locationCallback$1

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private long lastTime;

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(@NotNull LocationResult locationResult) {
            super.onLocationResult(locationResult);
            Location lastLocation = locationResult.getLastLocation();
            if (lastLocation == null) {
                return;
            }
            GoogleGmsLocationMonitor googleGmsLocationMonitor = this.b;
            if (lastLocation.getAccuracy() >= 80.0f) {
                LogKit.w2f(GoogleGmsLocationMonitor.TAG, "location Accuracy:" + lastLocation.getAccuracy() + ", LOW by: " + lastLocation.getProvider());
            }
            if (lastLocation.getTime() - this.lastTime <= 500) {
                LogKit.w2f(GoogleGmsLocationMonitor.TAG, "onLocationResult location time interval is too short curr:" + lastLocation.getTime() + ",last:" + this.lastTime);
                return;
            }
            this.lastTime = lastLocation.getTime();
            if (GoogleGmsLocationMonitor.i) {
                SimpleDateFormat simpleDateFormat = googleGmsLocationMonitor.sdf;
                Objects.requireNonNull(simpleDateFormat);
                String str = simpleDateFormat.format(new Date()) + "," + lastLocation.getProvider() + "," + lastLocation.getLatitude() + "," + lastLocation.getLongitude() + "," + lastLocation.getAltitude() + "," + lastLocation.getSpeed() + " ," + lastLocation.getBearing() + "," + (lastLocation.getTime() / ((long) 1000)) + "," + lastLocation.getAccuracy();
                if (Build.VERSION.SDK_INT >= 26) {
                    str = str + "," + lastLocation.getVerticalAccuracyMeters() + ", " + lastLocation.getSpeedAccuracyMetersPerSecond() + " , " + lastLocation.getBearingAccuracyDegrees();
                }
                LogKit.privacyLog(googleGmsLocationMonitor.extraName, str);
            }
            Iterator it2 = googleGmsLocationMonitor.listeners.keySet().iterator();
            while (it2.hasNext()) {
                ILocationInfoListener iLocationInfoListener = (ILocationInfoListener) googleGmsLocationMonitor.listeners.get((String) it2.next());
                if (iLocationInfoListener != null) {
                    iLocationInfoListener.onLocationChanged(lastLocation);
                }
            }
        }
    };

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean i = FunctionSwitcher.isSupportRecordKeyData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/mifit/sportlib/locate/GoogleGmsLocationMonitor$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/mifit/sportlib/locate/GoogleGmsLocationMonitor;", "getInstance", "", "deinit", DefaultSettingsSpiCall.n, "Lcom/huami/mifit/sportlib/locate/GoogleGmsLocationMonitor;", "()Lcom/huami/mifit/sportlib/locate/GoogleGmsLocationMonitor;", "setInstance", "(Lcom/huami/mifit/sportlib/locate/GoogleGmsLocationMonitor;)V", "", "MIN_INTERVAL_TIME", LogUtil.I, "", "TAG", "Ljava/lang/String;", "", "isPrivacyDebug", "Z", "<init>", "()V", "sportlib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void deinit() {
            setInstance(null);
        }

        @Nullable
        public final GoogleGmsLocationMonitor getInstance() {
            return GoogleGmsLocationMonitor.j;
        }

        public final void setInstance(@Nullable GoogleGmsLocationMonitor googleGmsLocationMonitor) {
            GoogleGmsLocationMonitor.j = googleGmsLocationMonitor;
        }

        @NotNull
        public final GoogleGmsLocationMonitor getInstance(@NotNull Context context) {
            if (getInstance() == null) {
                synchronized (Reflection.getOrCreateKotlinClass(GoogleGmsLocationMonitor.class)) {
                    Companion companion = GoogleGmsLocationMonitor.INSTANCE;
                    if (companion.getInstance() == null) {
                        companion.setInstance(new GoogleGmsLocationMonitor(context.getApplicationContext()));
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return getInstance();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.huami.mifit.sportlib.locate.GoogleGmsLocationMonitor$locationCallback$1] */
    public GoogleGmsLocationMonitor(@NotNull Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Task task) {
        if (task.isSuccessful()) {
            LogKit.w2f(TAG, "Location Callback removed.");
        } else {
            LogKit.w2f(TAG, "Failed to remove Location Callback.");
        }
    }

    private final void c() {
        this.fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this.context);
        LocationRequest locationRequestCreate = LocationRequest.create();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        locationRequestCreate.setInterval(timeUnit.toMillis(1L));
        locationRequestCreate.setFastestInterval(timeUnit.toMillis(1L));
        locationRequestCreate.setMaxWaitTime(TimeUnit.MINUTES.toMillis(1L));
        locationRequestCreate.setPriority(FunctionSwitcher.isSupportSuperUser ? 102 : 100);
        Unit unit = Unit.INSTANCE;
        this.locationRequest = locationRequestCreate;
        if (ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_FINE_LOCATION") != 0 && ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            LogKit.w2f(TAG, "NO ACCESS_FINE_LOCATION Permission");
            return;
        }
        FusedLocationProviderClient fusedLocationProviderClient = this.fusedLocationProviderClient;
        Objects.requireNonNull(fusedLocationProviderClient);
        LocationRequest locationRequest = this.locationRequest;
        Objects.requireNonNull(locationRequest);
        fusedLocationProviderClient.requestLocationUpdates(locationRequest, this.locationCallback, Looper.getMainLooper());
    }

    @Override // com.huami.mifit.sportlib.locate.ILocationMonitor
    public boolean hasRegisterLocationListener(@Nullable String listenerKey) {
        ConcurrentHashMap<String, ILocationInfoListener> concurrentHashMap = this.listeners;
        Objects.requireNonNull(concurrentHashMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return concurrentHashMap.containsKey(listenerKey);
    }

    @Override // com.huami.mifit.sportlib.locate.ILocationMonitor
    public void registerLocationListener(@Nullable String listenerKey, @NotNull ILocationInfoListener locationListener) {
        ConcurrentHashMap<String, ILocationInfoListener> concurrentHashMap = this.listeners;
        Objects.requireNonNull(concurrentHashMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        if (!(!concurrentHashMap.containsKey(listenerKey))) {
            throw new IllegalArgumentException("duplicate key".toString());
        }
        if (listenerKey == null) {
            return;
        }
        this.listeners.put(listenerKey, locationListener);
    }

    @Override // com.huami.mifit.sportlib.locate.ILocationMonitor
    public void releaseLocation() {
        int iDecrementAndGet = this.refCount.decrementAndGet();
        if (iDecrementAndGet == 0) {
            FusedLocationProviderClient fusedLocationProviderClient = this.fusedLocationProviderClient;
            Objects.requireNonNull(fusedLocationProviderClient);
            fusedLocationProviderClient.removeLocationUpdates(this.locationCallback).addOnCompleteListener(new OnCompleteListener() { // from class: eh2
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    GoogleGmsLocationMonitor.b(task);
                }
            });
        }
        if (iDecrementAndGet != 0) {
            LogKit.w2f(TAG, "refcount -- not release Client");
        } else {
            INSTANCE.deinit();
            LogKit.w2f(TAG, "finally release client");
        }
    }

    @Override // com.huami.mifit.sportlib.locate.ILocationMonitor
    public void requestLocation() {
        if (ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_FINE_LOCATION") != 0 && ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            LogKit.w2f(TAG, "NO ACCESS_FINE_LOCATION Permission");
            return;
        }
        LogKit.w2f(TAG, "try to requestGoogleGmsLocation");
        if (i) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TrainingDateUtils.PATTERN_YMD_HMSS, Locale.ENGLISH);
            this.sdf = simpleDateFormat;
            Objects.requireNonNull(simpleDateFormat);
            String str = "requestAmapLocation" + simpleDateFormat.format(new Date());
            this.extraName = str;
            LogKit.privacyLog(str, "requestGoogleGmsLocationphoneTime,provider,latitude,longitude,altitude,speed,course,timestamp,horizontalAccuracy,verticalAccuracy,speedAccuracy,courseAccuracy");
        }
        if (this.refCount.incrementAndGet() <= 1) {
            c();
        }
    }

    @Override // com.huami.mifit.sportlib.locate.ILocationMonitor
    public void unregisterLocationListener(@Nullable String listenerKey) {
        ConcurrentHashMap<String, ILocationInfoListener> concurrentHashMap = this.listeners;
        Objects.requireNonNull(concurrentHashMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        if (!concurrentHashMap.containsKey(listenerKey)) {
            throw new IllegalArgumentException("no existed key".toString());
        }
        ConcurrentHashMap<String, ILocationInfoListener> concurrentHashMap2 = this.listeners;
        Objects.requireNonNull(concurrentHashMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        TypeIntrinsics.asMutableMap(concurrentHashMap2).remove(listenerKey);
    }
}
