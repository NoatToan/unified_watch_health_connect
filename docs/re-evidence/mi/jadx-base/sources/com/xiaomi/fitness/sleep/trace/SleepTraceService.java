package com.xiaomi.fitness.sleep.trace;

import android.app.AppOpsManager;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import androidx.collection.ArraySet;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.sleep.trace.SleepTraceService;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil;
import com.xiaomi.fitness.sleep.trace.util.TradingSession;
import defpackage.b1j;
import defpackage.vwi;
import defpackage.wwg;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0017J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0007J\b\u0010\u0017\u001a\u00020\fH\u0017J\u0012\u0010\u0018\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0015J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\fH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\fH\u0003J\u0012\u0010\u001f\u001a\u00020 2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010!\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\"\u001a\u00020#H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0018\u00010\nR\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTraceService;", "Lcom/xiaomi/fitness/sleep/trace/SafetyIntentService;", "<init>", "()V", "mRunningCategorySet", "", "", "mTradingSession", "Lcom/xiaomi/fitness/sleep/trace/util/TradingSession;", "mDaemonSession", "Lcom/xiaomi/fitness/sleep/trace/util/TradingSession$Session;", "onCreate", "", LifecycleConstantKt.ON_START, "intent", "Landroid/content/Intent;", "startId", "", "checkPermissions", "context", "Landroid/content/Context;", "packageName", "op", LifecycleConstantKt.ON_DESTROY, "onHandleIntent", "beginServiceDaemon", "ctx", "endServiceDaemon", "obtainRestorePendingIntent", "Landroid/app/PendingIntent;", "switchToForeground", "isCategoryEnqueued", "", "dequeueCategory", "createDefaultNotification", "Landroid/app/Notification;", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepTraceService extends SafetyIntentService {

    @NotNull
    private static final String ACTION_RESTORE_WRAPPER = "action.RESTORE_WRAPPER";

    @NotNull
    private static final String ACTION_STUB = "action.STUB";

    @NotNull
    private static final String EXTRA_INNER_INTENT = "extra_inner_intent";
    public static final int FOREGROUND_NOTICE_ID = 99001;

    @NotNull
    public static final String PREFIX_SERVICES_SLEEPS_CATEGORY = "category.";

    @NotNull
    private static final String SESSION_SLEEP_DAEMON = "session:sleep:daemon";

    @NotNull
    private static final String SESSION_SLEEP_SERVICE = "session:sleep:service";

    @Nullable
    private TradingSession.Session mDaemonSession;

    @NotNull
    private final Set<String> mRunningCategorySet;

    @Nullable
    private TradingSession mTradingSession;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int PENDING_REQUEST_CODE = 1510922759;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTraceService$Companion;", "", "<init>", "()V", "FOREGROUND_NOTICE_ID", "", "PENDING_REQUEST_CODE", "getPENDING_REQUEST_CODE", "()I", "PREFIX_SERVICES_SLEEPS_CATEGORY", "", "ACTION_RESTORE_WRAPPER", "SESSION_SLEEP_SERVICE", "EXTRA_INNER_INTENT", "ACTION_STUB", "SESSION_SLEEP_DAEMON", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getPENDING_REQUEST_CODE() {
            return SleepTraceService.PENDING_REQUEST_CODE;
        }
    }

    public SleepTraceService() {
        super("SleepTraceService");
        this.mRunningCategorySet = new ArraySet(0, 1, null);
    }

    private final void beginServiceDaemon(final Context ctx) {
        TradingSession tradingSession = this.mTradingSession;
        Intrinsics.checkNotNull(tradingSession);
        this.mDaemonSession = tradingSession.require(SESSION_SLEEP_DAEMON);
        ExecutorHelper.runInWorker(new Runnable() { // from class: y0n
            @Override // java.lang.Runnable
            public final void run() {
                SleepTraceService.beginServiceDaemon$lambda$0(this.f39655a, ctx);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginServiceDaemon$lambda$0(SleepTraceService this$0, Context ctx) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ctx, "$ctx");
        TradingSession.Session session = this$0.mDaemonSession;
        Intrinsics.checkNotNull(session);
        PendingIntent restoreIntent = SleepTraceScheduler.INSTANCE.getRestoreIntent(ctx);
        Intrinsics.checkNotNull(restoreIntent);
        session.beginTransaction(restoreIntent);
    }

    private final Notification createDefaultNotification() {
        PendingIntent activityPendingIntent$default;
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        String packageName = getPackageName();
        NotificationChannel notificationChannel = new NotificationChannel(packageName, packageName, 2);
        notificationChannel.enableLights(false);
        notificationChannel.enableVibration(false);
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        Context applicationContext = getApplicationContext();
        if (launchIntentForPackage != null) {
            launchIntentForPackage.putExtra(Constants.EXTRA_MIREF, "notice:sleep_service");
            Intrinsics.checkNotNull(applicationContext);
            activityPendingIntent$default = PendingIntentExtKt.getActivityPendingIntent$default(applicationContext, PENDING_REQUEST_CODE, launchIntentForPackage, 0, 4, null);
        } else {
            activityPendingIntent$default = null;
        }
        Notification notificationD = new wwg.e(this, packageName).u(vwi.f37310a).r(true).i(activityPendingIntent$default).p("com.mi.health").s(true).k(getString(b1j.c)).j(getString(b1j.d)).t(-2).d();
        Intrinsics.checkNotNullExpressionValue(notificationD, "build(...)");
        return notificationD;
    }

    private final void dequeueCategory(Intent intent) {
        Set<String> categories = intent.getCategories();
        if (categories == null || categories.isEmpty()) {
            return;
        }
        synchronized (this.mRunningCategorySet) {
            try {
                for (String str : categories) {
                    Intrinsics.checkNotNull(str);
                    if (StringsKt__StringsJVMKt.startsWith$default(str, PREFIX_SERVICES_SLEEPS_CATEGORY, false, 2, null)) {
                        this.mRunningCategorySet.remove(str);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void endServiceDaemon() {
        ExecutorHelper.runInWorker(new Runnable() { // from class: z0n
            @Override // java.lang.Runnable
            public final void run() {
                SleepTraceService.endServiceDaemon$lambda$1(this.f40759a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endServiceDaemon$lambda$1(SleepTraceService this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            TradingSession.Session session = this$0.mDaemonSession;
            if (session != null) {
                session.endTransaction();
            }
        } catch (Exception unused) {
        } finally {
            this$0.mDaemonSession = null;
        }
    }

    private final boolean isCategoryEnqueued(Intent intent) {
        boolean z;
        Set<String> categories = intent != null ? intent.getCategories() : null;
        if (categories == null || categories.isEmpty()) {
            return false;
        }
        synchronized (this.mRunningCategorySet) {
            try {
                int size = this.mRunningCategorySet.size();
                for (String str : categories) {
                    Intrinsics.checkNotNull(str);
                    if (StringsKt__StringsJVMKt.startsWith$default(str, PREFIX_SERVICES_SLEEPS_CATEGORY, false, 2, null)) {
                        this.mRunningCategorySet.add(str);
                    }
                }
                z = this.mRunningCategorySet.size() == size;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    private final PendingIntent obtainRestorePendingIntent(Intent intent, Context ctx) {
        Intent intentPutExtra = new Intent(ctx, (Class<?>) SleepTraceService.class).setAction(ACTION_RESTORE_WRAPPER).putExtra(EXTRA_INNER_INTENT, intent).putExtra(ActionManager.EXTRA_INTENT_TIMESTAMP, System.currentTimeMillis());
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return PendingIntentExtKt.getForegroundServicePendingIntent$default(ctx, 0, intentPutExtra, 0, 4, null);
    }

    private final void switchToForeground() {
        try {
            Notification foregroundNotification = SleepTraceConfiguration.INSTANCE.getForegroundNotification();
            if (foregroundNotification == null) {
                foregroundNotification = createDefaultNotification();
            }
            if (Build.VERSION.SDK_INT >= 34) {
                Application application = getApplication();
                Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                String packageName = AppUtil.getApp().getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                startForeground(FOREGROUND_NOTICE_ID, foregroundNotification, (PermissionsUtil.INSTANCE.checkPermission("android.permission.RECORD_AUDIO") && checkPermissions(application, packageName, "android:record_audio") == 0) ? 1073741952 : 1073741824);
            } else {
                startForeground(FOREGROUND_NOTICE_ID, foregroundNotification);
            }
            SleepTraceUtil.INSTANCE.sleepTrace("switch to foreground, use custom notice : " + (foregroundNotification != null), new Object[0]);
        } catch (Exception e) {
            SleepTraceUtil.INSTANCE.sleepTrace("Service switchToForeground error " + e + ", cause: " + e.getCause(), new Object[0]);
        }
    }

    @RequiresApi(24)
    public final int checkPermissions(@NotNull Context context, @NotNull String packageName, @NotNull String op) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(op, "op");
        try {
            int packageUid = context.getPackageManager().getPackageUid(packageName, 0);
            Object systemService = context.getSystemService("appops");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
            return ((AppOpsManager) systemService).checkOp(op, packageUid, packageName);
        } catch (SecurityException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // com.xiaomi.fitness.sleep.trace.SafetyIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        SleepTraceUtil.INSTANCE.sleepTrace(">>>Sleep service created", new Object[0]);
        switchToForeground();
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNull(applicationContext);
        this.mTradingSession = new TradingSession(applicationContext);
        beginServiceDaemon(applicationContext);
    }

    @Override // com.xiaomi.fitness.sleep.trace.SafetyIntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        TradingSession tradingSession = this.mTradingSession;
        Intrinsics.checkNotNull(tradingSession);
        tradingSession.release(SESSION_SLEEP_SERVICE);
        stopForeground(true);
        SleepTraceUtil.INSTANCE.sleepTrace("<<<Sleep service destroy", new Object[0]);
    }

    @Override // com.xiaomi.fitness.sleep.trace.SafetyIntentService
    public void onHandleIntent(@Nullable Intent intent) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LogExtKt.logi("onHandleIntent, action:" + (intent != null ? intent.getAction() : null) + ", timestamp:" + (intent != null ? Long.valueOf(intent.getLongExtra(ActionManager.EXTRA_INTENT_TIMESTAMP, 0L)) : null));
        try {
            try {
                endServiceDaemon();
                if (intent != null && !Intrinsics.areEqual(ACTION_STUB, intent.getAction())) {
                    Context applicationContext = getApplicationContext();
                    TradingSession tradingSession = this.mTradingSession;
                    Intrinsics.checkNotNull(tradingSession);
                    TradingSession.Session sessionRequire = tradingSession.require(SESSION_SLEEP_SERVICE);
                    Intrinsics.checkNotNull(applicationContext);
                    sessionRequire.beginTransaction(obtainRestorePendingIntent(intent, applicationContext));
                    try {
                        ActionManager.INSTANCE.getInstance().postAction(applicationContext, intent).get(5L, TimeUnit.MINUTES);
                    } catch (InterruptedException e) {
                        SleepTraceUtil.INSTANCE.sleepTrace("Service interrupt " + e + ", cause: " + e.getCause(), new Object[0]);
                    } catch (ExecutionException e2) {
                        SleepTraceUtil.INSTANCE.sleepTrace("Service interrupt " + e2 + ", cause: " + e2.getCause(), new Object[0]);
                    } catch (TimeoutException e3) {
                        SleepTraceUtil.INSTANCE.sleepTrace("Service interrupt " + e3 + ", cause: " + e3.getCause(), new Object[0]);
                    }
                    dequeueCategory(intent);
                    sessionRequire.endTransaction();
                }
            } catch (Exception e4) {
                SleepTraceUtil.INSTANCE.sleepTrace("Service has error " + e4 + ", cause: " + e4.getCause(), new Object[0]);
                e4.printStackTrace();
            }
        } finally {
            SystemClock.sleep(RangesKt___RangesKt.coerceAtLeast(((long) 1000) - (SystemClock.elapsedRealtime() - jElapsedRealtime), 0L));
        }
    }

    @Override // com.xiaomi.fitness.sleep.trace.SafetyIntentService, android.app.Service
    public void onStart(@Nullable Intent intent, int startId) throws PackageManager.NameNotFoundException {
        SleepTraceUtil sleepTraceUtil = SleepTraceUtil.INSTANCE;
        sleepTraceUtil.sleepTrace(">>>Sleep service onStart(" + (intent != null ? intent.getAction() : null) + ") at " + (intent != null ? Long.valueOf(intent.getLongExtra(ActionManager.EXTRA_INTENT_TIMESTAMP, 0L)) : null), new Object[0]);
        switchToForeground();
        boolean zCheckPermission = PermissionsUtil.INSTANCE.checkPermission("android.permission.RECORD_AUDIO");
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        String packageName = AppUtil.getApp().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        sleepTraceUtil.sleepTrace("performStartTask: startRecording checkPermissions " + checkPermissions(application, packageName, "android:record_audio") + "  " + zCheckPermission, new Object[0]);
        if (intent != null && Intrinsics.areEqual(ACTION_RESTORE_WRAPPER, intent.getAction())) {
            intent = (Intent) intent.getParcelableExtra(EXTRA_INNER_INTENT);
        }
        super.onStart(intent, startId);
    }
}
