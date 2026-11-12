package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RestrictTo;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b@\u0010AJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0007R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u001e\u0010\u001f\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u001c\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\u0015R\u0016\u00105\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\u001aR\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u0002068B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010>¨\u0006B"}, d2 = {"Lcom/facebook/appevents/internal/ActivityLifecycleTracker;", "", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "", "appId", "", "startTracking", "", "isInBackground", "isTracking", "Ljava/util/UUID;", "getCurrentSessionGuid", "Landroid/app/Activity;", "activity", "onActivityCreated", "onActivityResumed", GoogleApiAvailabilityLight.a, "c", "a", "getCurrentActivity", "Ljava/lang/String;", "TAG", "b", "INCORRECT_IMPL_WARNING", "", "J", "INTERRUPTION_THRESHOLD_MILLISECONDS", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ScheduledExecutorService;", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledFuture;", "e", "Ljava/util/concurrent/ScheduledFuture;", "currentFuture", "f", "Ljava/lang/Object;", "currentFutureLock", "Ljava/util/concurrent/atomic/AtomicInteger;", "g", "Ljava/util/concurrent/atomic/AtomicInteger;", "foregroundActivityCount", "Lcom/facebook/appevents/internal/SessionInfo;", "h", "Lcom/facebook/appevents/internal/SessionInfo;", "currentSession", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tracking", z.j, hl.k, "currentActivityAppearTime", "", "l", LogUtil.I, "activityReferences", "Ljava/lang/ref/WeakReference;", "m", "Ljava/lang/ref/WeakReference;", "currActivity", "()I", "sessionTimeoutInSeconds", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ActivityLifecycleTracker {

    @NotNull
    public static final ActivityLifecycleTracker INSTANCE = new ActivityLifecycleTracker();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String INCORRECT_IMPL_WARNING = "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final long INTERRUPTION_THRESHOLD_MILLISECONDS = 1000;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final ScheduledExecutorService singleThreadExecutor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static volatile ScheduledFuture<?> currentFuture;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final Object currentFutureLock;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final AtomicInteger foregroundActivityCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static volatile SessionInfo currentSession;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final AtomicBoolean tracking;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static String appId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static long currentActivityAppearTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static int activityReferences;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static WeakReference<Activity> currActivity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements Runnable {
        public static final a a = new a();

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (ActivityLifecycleTracker.access$getCurrentSession$p(ActivityLifecycleTracker.INSTANCE) == null) {
                    ActivityLifecycleTracker.currentSession = SessionInfo.INSTANCE.getStoredSessionInfo();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements Runnable {
        public final /* synthetic */ long a;
        public final /* synthetic */ String b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                    if (ActivityLifecycleTracker.access$getCurrentSession$p(activityLifecycleTracker) == null) {
                        ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(b.this.a), null, null, 4, null);
                    }
                    if (ActivityLifecycleTracker.access$getForegroundActivityCount$p(activityLifecycleTracker).get() <= 0) {
                        SessionLogger.logDeactivateApp(b.this.b, ActivityLifecycleTracker.access$getCurrentSession$p(activityLifecycleTracker), ActivityLifecycleTracker.access$getAppId$p(activityLifecycleTracker));
                        SessionInfo.INSTANCE.clearSavedSessionFromDisk();
                        ActivityLifecycleTracker.currentSession = null;
                    }
                    synchronized (ActivityLifecycleTracker.access$getCurrentFutureLock$p(activityLifecycleTracker)) {
                        ActivityLifecycleTracker.currentFuture = null;
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }

        public b(long j, String str) {
            this.a = j;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                if (ActivityLifecycleTracker.access$getCurrentSession$p(activityLifecycleTracker) == null) {
                    ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(this.a), null, null, 4, null);
                }
                SessionInfo sessionInfoAccess$getCurrentSession$p = ActivityLifecycleTracker.access$getCurrentSession$p(activityLifecycleTracker);
                if (sessionInfoAccess$getCurrentSession$p != null) {
                    sessionInfoAccess$getCurrentSession$p.setSessionLastEventTime(Long.valueOf(this.a));
                }
                if (ActivityLifecycleTracker.access$getForegroundActivityCount$p(activityLifecycleTracker).get() <= 0) {
                    a aVar = new a();
                    synchronized (ActivityLifecycleTracker.access$getCurrentFutureLock$p(activityLifecycleTracker)) {
                        ActivityLifecycleTracker.currentFuture = ActivityLifecycleTracker.access$getSingleThreadExecutor$p(activityLifecycleTracker).schedule(aVar, activityLifecycleTracker.b(), TimeUnit.SECONDS);
                        Unit unit = Unit.INSTANCE;
                    }
                }
                long jAccess$getCurrentActivityAppearTime$p = ActivityLifecycleTracker.access$getCurrentActivityAppearTime$p(activityLifecycleTracker);
                AutomaticAnalyticsLogger.logActivityTimeSpentEvent(this.b, jAccess$getCurrentActivityAppearTime$p > 0 ? (this.a - jAccess$getCurrentActivityAppearTime$p) / ((long) 1000) : 0L);
                SessionInfo sessionInfoAccess$getCurrentSession$p2 = ActivityLifecycleTracker.access$getCurrentSession$p(activityLifecycleTracker);
                if (sessionInfoAccess$getCurrentSession$p2 != null) {
                    sessionInfoAccess$getCurrentSession$p2.writeSessionToDisk();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c implements Runnable {
        public final /* synthetic */ long a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Context c;

        public c(long j, String str, Context context) {
            this.a = j;
            this.b = str;
            this.c = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SessionInfo sessionInfoAccess$getCurrentSession$p;
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                SessionInfo sessionInfoAccess$getCurrentSession$p2 = ActivityLifecycleTracker.access$getCurrentSession$p(activityLifecycleTracker);
                Long sessionLastEventTime = sessionInfoAccess$getCurrentSession$p2 != null ? sessionInfoAccess$getCurrentSession$p2.getSessionLastEventTime() : null;
                if (ActivityLifecycleTracker.access$getCurrentSession$p(activityLifecycleTracker) == null) {
                    ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(this.a), null, null, 4, null);
                    SessionLogger.logActivateApp(this.b, null, ActivityLifecycleTracker.access$getAppId$p(activityLifecycleTracker), this.c);
                } else if (sessionLastEventTime != null) {
                    long jLongValue = this.a - sessionLastEventTime.longValue();
                    if (jLongValue > activityLifecycleTracker.b() * 1000) {
                        SessionLogger.logDeactivateApp(this.b, ActivityLifecycleTracker.access$getCurrentSession$p(activityLifecycleTracker), ActivityLifecycleTracker.access$getAppId$p(activityLifecycleTracker));
                        SessionLogger.logActivateApp(this.b, null, ActivityLifecycleTracker.access$getAppId$p(activityLifecycleTracker), this.c);
                        ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(this.a), null, null, 4, null);
                    } else if (jLongValue > 1000 && (sessionInfoAccess$getCurrentSession$p = ActivityLifecycleTracker.access$getCurrentSession$p(activityLifecycleTracker)) != null) {
                        sessionInfoAccess$getCurrentSession$p.incrementInterruptionCount();
                    }
                }
                SessionInfo sessionInfoAccess$getCurrentSession$p3 = ActivityLifecycleTracker.access$getCurrentSession$p(activityLifecycleTracker);
                if (sessionInfoAccess$getCurrentSession$p3 != null) {
                    sessionInfoAccess$getCurrentSession$p3.setSessionLastEventTime(Long.valueOf(this.a));
                }
                SessionInfo sessionInfoAccess$getCurrentSession$p4 = ActivityLifecycleTracker.access$getCurrentSession$p(activityLifecycleTracker);
                if (sessionInfoAccess$getCurrentSession$p4 != null) {
                    sessionInfoAccess$getCurrentSession$p4.writeSessionToDisk();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", io.flutter.plugins.firebase.crashlytics.Constants.ENABLED, "", "onCompleted", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d implements FeatureManager.Callback {
        public static final d a = new d();

        @Override // com.facebook.internal.FeatureManager.Callback
        public final void onCompleted(boolean z) {
            if (z) {
                CodelessManager.enable();
            } else {
                CodelessManager.disable();
            }
        }
    }

    static {
        String canonicalName = ActivityLifecycleTracker.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        TAG = canonicalName;
        singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
        currentFutureLock = new Object();
        foregroundActivityCount = new AtomicInteger(0);
        tracking = new AtomicBoolean(false);
    }

    private ActivityLifecycleTracker() {
    }

    private final void a() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (currentFutureLock) {
            if (currentFuture != null && (scheduledFuture = currentFuture) != null) {
                scheduledFuture.cancel(false);
            }
            currentFuture = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ int access$getActivityReferences$p(ActivityLifecycleTracker activityLifecycleTracker) {
        return activityReferences;
    }

    public static final /* synthetic */ String access$getAppId$p(ActivityLifecycleTracker activityLifecycleTracker) {
        return appId;
    }

    public static final /* synthetic */ long access$getCurrentActivityAppearTime$p(ActivityLifecycleTracker activityLifecycleTracker) {
        return currentActivityAppearTime;
    }

    public static final /* synthetic */ Object access$getCurrentFutureLock$p(ActivityLifecycleTracker activityLifecycleTracker) {
        return currentFutureLock;
    }

    public static final /* synthetic */ SessionInfo access$getCurrentSession$p(ActivityLifecycleTracker activityLifecycleTracker) {
        return currentSession;
    }

    public static final /* synthetic */ AtomicInteger access$getForegroundActivityCount$p(ActivityLifecycleTracker activityLifecycleTracker) {
        return foregroundActivityCount;
    }

    public static final /* synthetic */ ScheduledExecutorService access$getSingleThreadExecutor$p(ActivityLifecycleTracker activityLifecycleTracker) {
        return singleThreadExecutor;
    }

    public static final /* synthetic */ String access$getTAG$p(ActivityLifecycleTracker activityLifecycleTracker) {
        return TAG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b() {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        return appSettingsWithoutQuery != null ? appSettingsWithoutQuery.getSessionTimeoutInSeconds() : Constants.getDefaultAppEventsSessionTimeoutInSeconds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Activity activity) {
        CodelessManager.onActivityDestroyed(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Activity activity) {
        AtomicInteger atomicInteger = foregroundActivityCount;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(TAG, INCORRECT_IMPL_WARNING);
        }
        a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String activityName = Utility.getActivityName(activity);
        CodelessManager.onActivityPaused(activity);
        singleThreadExecutor.execute(new b(jCurrentTimeMillis, activityName));
    }

    @JvmStatic
    @Nullable
    public static final Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = currActivity;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @JvmStatic
    @Nullable
    public static final UUID getCurrentSessionGuid() {
        SessionInfo sessionInfo;
        if (currentSession == null || (sessionInfo = currentSession) == null) {
            return null;
        }
        return sessionInfo.getSessionId();
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean isInBackground() {
        return activityReferences == 0;
    }

    @JvmStatic
    public static final boolean isTracking() {
        return tracking.get();
    }

    @JvmStatic
    public static final void onActivityCreated(@Nullable Activity activity) {
        singleThreadExecutor.execute(a.a);
    }

    @JvmStatic
    public static final void onActivityResumed(@NotNull Activity activity) {
        currActivity = new WeakReference<>(activity);
        foregroundActivityCount.incrementAndGet();
        INSTANCE.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        currentActivityAppearTime = jCurrentTimeMillis;
        String activityName = Utility.getActivityName(activity);
        CodelessManager.onActivityResumed(activity);
        MetadataIndexer.onActivityResumed(activity);
        SuggestedEventsManager.trackActivity(activity);
        InAppPurchaseManager.startTracking();
        singleThreadExecutor.execute(new c(jCurrentTimeMillis, activityName, activity.getApplicationContext()));
    }

    @JvmStatic
    public static final void startTracking(@NotNull Application application, @Nullable String appId2) {
        if (tracking.compareAndSet(false, true)) {
            FeatureManager.checkFeature(FeatureManager.Feature.CodelessEvents, d.a);
            appId = appId2;
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker.startTracking.2
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
                    Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$getTAG$p(ActivityLifecycleTracker.INSTANCE), "onActivityCreated");
                    AppEventUtility.assertIsMainThread();
                    ActivityLifecycleTracker.onActivityCreated(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(@NotNull Activity activity) {
                    Logger.Companion companion = Logger.INSTANCE;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                    companion.log(loggingBehavior, ActivityLifecycleTracker.access$getTAG$p(activityLifecycleTracker), "onActivityDestroyed");
                    activityLifecycleTracker.c(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(@NotNull Activity activity) {
                    Logger.Companion companion = Logger.INSTANCE;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                    companion.log(loggingBehavior, ActivityLifecycleTracker.access$getTAG$p(activityLifecycleTracker), "onActivityPaused");
                    AppEventUtility.assertIsMainThread();
                    activityLifecycleTracker.d(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(@NotNull Activity activity) {
                    Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$getTAG$p(ActivityLifecycleTracker.INSTANCE), "onActivityResumed");
                    AppEventUtility.assertIsMainThread();
                    ActivityLifecycleTracker.onActivityResumed(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
                    Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$getTAG$p(ActivityLifecycleTracker.INSTANCE), "onActivitySaveInstanceState");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(@NotNull Activity activity) {
                    ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                    ActivityLifecycleTracker.activityReferences = ActivityLifecycleTracker.access$getActivityReferences$p(activityLifecycleTracker) + 1;
                    Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$getTAG$p(activityLifecycleTracker), "onActivityStarted");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(@NotNull Activity activity) {
                    Logger.Companion companion = Logger.INSTANCE;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                    companion.log(loggingBehavior, ActivityLifecycleTracker.access$getTAG$p(activityLifecycleTracker), "onActivityStopped");
                    AppEventsLogger.INSTANCE.onContextStop();
                    ActivityLifecycleTracker.activityReferences = ActivityLifecycleTracker.access$getActivityReferences$p(activityLifecycleTracker) - 1;
                }
            });
        }
    }
}
