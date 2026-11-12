package com.xiaomi.fitness.sleep.trace;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mi.health.router.business.IntentHelper;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.sleep.behavior.BehaviorConfiguration;
import com.xiaomi.fitness.sleep.behavior.collection.ICollectionTaskManager;
import com.xiaomi.fitness.sleep.behavior.collection.SleepDataCollectController;
import com.xiaomi.fitness.sleep.trace.SleepTracerImpl;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceDatabase;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import com.xiaomi.fitness.sleep.trace.extensions.TraceInternalExtKt;
import com.xiaomi.fitness.sleep.trace.model.UserSleepModel;
import com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil;
import defpackage.b1j;
import defpackage.ow3;
import defpackage.vwi;
import defpackage.wwg;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001KB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001c\u001a\u00020\rH\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u001c\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001c\u0010#\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u00101\u001a\u00020\u000fH\u0016J\b\u00102\u001a\u00020\tH\u0016J@\u00103\u001a\u00020\u000f26\u00104\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\bH\u0016J\u0018\u00105\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016J-\u00106\u001a\u00020\u000f2#\u00104\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u0012\u00107\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010D\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u0003H\u0002J\u0010\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u0003H\u0002J\u0018\u0010I\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u00032\u0006\u0010J\u001a\u00020 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RD\u0010\u0006\u001a8\u00124\u00122\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R1\u0010\u0010\u001a%\u0012!\u0012\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000f0\u00110\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0017\"\u0004\b\u001a\u0010\u001bR$\u0010$\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u001bR$\u0010&\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010,\u001a\u00020+2\u0006\u0010\u0018\u001a\u00020+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u00108\u001a\b\u0012\u0004\u0012\u00020\r09X\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R2\u0010>\u001a\u001a\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0?0\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006L"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTracerImpl;", "Lcom/xiaomi/fitness/sleep/trace/SleepTracerInternal;", "mContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mSleepTraceObservers", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "matchCondition", "", "state", "", "mSleepReportObservers", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "report", "mScheduleEndLock", "Ljava/lang/Object;", "isSupport", "()Z", "value", "isEnable", "setEnable", "(Z)V", "getEnable", "isSleepTracing", "scheduleBegin", "arg", "", "extras", "Landroid/os/Bundle;", "scheduleEnd", "isDeepLightSleepDetectionEnable", "setDeepLightSleepDetectionEnable", "snoreDetectionStatus", "getSnoreDetectionStatus", "()I", "setSnoreDetectionStatus", "(I)V", "", "snoreRequestTime", "getSnoreRequestTime", "()J", "setSnoreRequestTime", "(J)V", "initSleepTrace", "isMaybeSleeping", "addSleepTraceObserver", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "notifySleepState", "addSleepReportObserver", "notifySleepReport", "userAge", "Lkotlin/Function0;", "getUserAge", "()Lkotlin/jvm/functions/Function0;", "setUserAge", "(Lkotlin/jvm/functions/Function0;)V", "stepTimes", "", "getStepTimes", "()Lkotlin/jvm/functions/Function2;", "setStepTimes", "(Lkotlin/jvm/functions/Function2;)V", "registerCleanTask", "application", "createSleepDetectorNotification", "Landroid/app/Notification;", "context", "createChannelIfNeed", "channelId", "ClearExpiredLogWorker", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepTracerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepTracerImpl.kt\ncom/xiaomi/fitness/sleep/trace/SleepTracerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,283:1\n1863#2,2:284\n1863#2,2:286\n*S KotlinDebug\n*F\n+ 1 SleepTracerImpl.kt\ncom/xiaomi/fitness/sleep/trace/SleepTracerImpl\n*L\n179#1:284,2\n190#1:286,2\n*E\n"})
public final class SleepTracerImpl implements SleepTracerInternal {

    @NotNull
    private final Context mContext;

    @NotNull
    private final Object mScheduleEndLock;

    @NotNull
    private final CopyOnWriteArrayList<Function1<SleepReport, Unit>> mSleepReportObservers;

    @NotNull
    private final CopyOnWriteArrayList<Function2<Boolean, Integer, Unit>> mSleepTraceObservers;

    @NotNull
    private volatile Function2<? super Long, ? super Long, ? extends List<Long>> stepTimes;
    public volatile Function0<Integer> userAge;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTracerImpl$ClearExpiredLogWorker;", "Landroidx/work/Worker;", "Landroidx/work/a$a;", "doWork", "()Landroidx/work/a$a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ClearExpiredLogWorker extends Worker {

        @NotNull
        public static final String WORKER_NAME = "name:sleep:db:clear_expired_log";

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClearExpiredLogWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
            super(context, workerParams);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        }

        @Override // androidx.work.Worker
        @NotNull
        public androidx.work.a.AbstractC0080a doWork() {
            try {
                SleepTraceDatabase.Companion companion = SleepTraceDatabase.INSTANCE;
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                companion.get(applicationContext).sleepTraceDao().delete(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(3L));
                androidx.work.a.AbstractC0080a abstractC0080aC = androidx.work.a.AbstractC0080a.c();
                Intrinsics.checkNotNullExpressionValue(abstractC0080aC, "success(...)");
                return abstractC0080aC;
            } catch (Throwable unused) {
                androidx.work.a.AbstractC0080a abstractC0080aB = androidx.work.a.AbstractC0080a.b();
                Intrinsics.checkNotNullExpressionValue(abstractC0080aB, "retry(...)");
                return abstractC0080aB;
            }
        }
    }

    public SleepTracerImpl(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.mSleepTraceObservers = new CopyOnWriteArrayList<>();
        this.mSleepReportObservers = new CopyOnWriteArrayList<>();
        this.mScheduleEndLock = new Object();
        BehaviorConfiguration.INSTANCE.registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: d1n
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                SleepTracerImpl._init_$lambda$2(this.f14968a, sharedPreferences, str);
            }
        });
        this.stepTimes = new Function2() { // from class: e1n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SleepTracerImpl.stepTimes$lambda$7(((Long) obj).longValue(), ((Long) obj2).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(final SleepTracerImpl this$0, SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ApplicationExtKt.isSameProcess(ApplicationExtKt.getApplication(), ":device")) {
            if (Intrinsics.areEqual("deep_light_sleep_detection_enable", str)) {
                if (BehaviorConfiguration.INSTANCE.isDeepLightSleepDetectionEnable()) {
                    return;
                }
                ExecutorHelper.runInBackground(new Runnable() { // from class: b1n
                    @Override // java.lang.Runnable
                    public final void run() {
                        SleepTracerImpl.lambda$2$lambda$0(this.f3692a);
                    }
                });
            } else if (Intrinsics.areEqual("sleep_snore_detection_status", str)) {
                int key_snore_detection_status = BehaviorConfiguration.INSTANCE.getKEY_SNORE_DETECTION_STATUS();
                if (key_snore_detection_status == 0 || key_snore_detection_status == 1) {
                    ExecutorHelper.runInBackground(new Runnable() { // from class: c1n
                        @Override // java.lang.Runnable
                        public final void run() {
                            SleepTracerImpl.lambda$2$lambda$1(this.f4835a);
                        }
                    });
                }
            }
        }
    }

    private final void createChannelIfNeed(Context context, String channelId) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        if (notificationManager.getNotificationChannel(channelId) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(channelId, "sleep", 3);
            notificationChannel.setDescription("");
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private final Notification createSleepDetectorNotification(Context context) {
        createChannelIfNeed(context, "channel:background_service");
        Intent intent = new Intent();
        String packageName = context.getPackageName();
        String packageName2 = context.getPackageName();
        String upperCase = IntentHelper.ACTION_SLEEP.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String strIntern = (packageName2 + ".action." + upperCase).intern();
        Intrinsics.checkNotNullExpressionValue(strIntern, "intern(...)");
        intent.setAction(strIntern).setPackage(packageName);
        intent.putExtra(Constants.EXTRA_MIREF, "notice:sleep_service");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext);
        Notification notificationD = new wwg.e(context, "channel:background_service").u(vwi.f37310a).r(true).p("com.mi.health").s(true).i(PendingIntentExtKt.getActivityPendingIntent(applicationContext, SleepTraceService.INSTANCE.getPENDING_REQUEST_CODE(), intent, 134217728)).k(context.getString(b1j.c)).j(context.getString(b1j.f3687b)).t(-2).d();
        Intrinsics.checkNotNullExpressionValue(notificationD, "build(...)");
        return notificationD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSleepTrace$lambda$4(boolean z, int i) {
        SleepDataCollectController.INSTANCE.handle(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$0(SleepTracerImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TraceInternalExtKt.getInstance(ICollectionTaskManager.INSTANCE).cancelCollecting(this$0.mContext, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(SleepTracerImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TraceInternalExtKt.getInstance(ICollectionTaskManager.INSTANCE).finishCollecting(this$0.mContext, 2, null);
    }

    private final void registerCleanTask(Context application) {
        WorkManager.INSTANCE.getInstance(application).enqueueUniquePeriodicWork(ClearExpiredLogWorker.WORKER_NAME, ExistingPeriodicWorkPolicy.KEEP, new PeriodicWorkRequest.Builder((Class<? extends androidx.work.a>) ClearExpiredLogWorker.class, 1L, TimeUnit.DAYS, 1L, TimeUnit.HOURS).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List stepTimes$lambda$7(long j, long j2) {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void addSleepReportObserver(@NotNull Function1<? super SleepReport, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mSleepReportObservers.add(listener);
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void addSleepTraceObserver(@NotNull Function2<? super Boolean, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mSleepTraceObservers.add(listener);
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public int getEnable() {
        return SleepTraceConfiguration.INSTANCE.getEnable(this.mContext);
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public int getSnoreDetectionStatus() {
        return BehaviorConfiguration.INSTANCE.getKEY_SNORE_DETECTION_STATUS();
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public long getSnoreRequestTime() {
        return BehaviorConfiguration.INSTANCE.getKEY_SNORE_REQUEST_STATUS();
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    @NotNull
    public Function2<Long, Long, List<Long>> getStepTimes() {
        return this.stepTimes;
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    @NotNull
    public Function0<Integer> getUserAge() {
        Function0<Integer> function0 = this.userAge;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAge");
        return null;
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void initSleepTrace() {
        SleepTraceConfiguration.Companion companion = SleepTraceConfiguration.INSTANCE;
        companion.setup(this.mContext);
        UserSleepModel.INSTANCE.prepare(this.mContext);
        ow3.i(this.mContext);
        companion.edit(this.mContext).setDebugMode(true).setForegroundNotification(createSleepDetectorNotification(this.mContext)).apply();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction(ApplicationExtKt.getApplication().getPackageName() + ".action.PROCESS_MESSAGE");
        HandlerThread handlerThread = new HandlerThread("lifecycle");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), null);
        String str = ApplicationExtKt.getApplication().getPackageName() + ".permission.RECEIVER_PROCESS_MESSAGE";
        Intent intentRegisterReceiver = Build.VERSION.SDK_INT >= 33 ? this.mContext.registerReceiver(new SleepTraceReceiver(), intentFilter, str, handler, 2) : this.mContext.registerReceiver(new SleepTraceReceiver(), intentFilter, str, handler);
        StringBuilder sb = new StringBuilder();
        sb.append("initSleepTrace: intent=");
        sb.append(intentRegisterReceiver);
        registerCleanTask(this.mContext);
        addSleepTraceObserver(new Function2() { // from class: a1n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SleepTracerImpl.initSleepTrace$lambda$4(((Boolean) obj).booleanValue(), ((Integer) obj2).intValue());
            }
        });
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public boolean isDeepLightSleepDetectionEnable() {
        return isEnable() && BehaviorConfiguration.INSTANCE.isDeepLightSleepDetectionEnable();
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public boolean isEnable() {
        return isSupport() && SleepTraceConfiguration.INSTANCE.isEnable(this.mContext);
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public boolean isMaybeSleeping() {
        return SleepDataCollectController.INSTANCE.isMaybeSleeping();
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public boolean isSleepTracing() {
        return SleepTraceScheduler.INSTANCE.isSleepTracing(this.mContext);
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public boolean isSupport() {
        return RomUtils.INSTANCE.isMiui();
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracerInternal
    public void notifySleepReport(@Nullable SleepReport report) {
        LogExtKt.logi("notifySleepReport report(" + report + ")");
        Iterator<T> it = this.mSleepReportObservers.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke2(report);
        }
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracerInternal
    public void notifySleepState(boolean matchCondition, int state) {
        Iterator<T> it = this.mSleepTraceObservers.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(Boolean.valueOf(matchCondition), Integer.valueOf(state));
        }
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void scheduleBegin(@Nullable String arg, @Nullable Bundle extras) {
        SleepTraceScheduler.INSTANCE.start(this.mContext);
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void scheduleEnd(@Nullable String arg, @Nullable Bundle extras) {
        boolean z = extras != null && extras.getBoolean("force_stop", false);
        SleepTraceUtil sleepTraceUtil = SleepTraceUtil.INSTANCE;
        sleepTraceUtil.sleepTrace("call schedule end, forceStop: " + z, new Object[0]);
        synchronized (this.mScheduleEndLock) {
            try {
                SleepTraceScheduler sleepTraceScheduler = SleepTraceScheduler.INSTANCE;
                boolean zPerformSleepTracing = sleepTraceScheduler.performSleepTracing(this.mContext, null);
                if (z) {
                    sleepTraceUtil.sleepTrace("force schedule end", new Object[0]);
                    if (zPerformSleepTracing && !sleepTraceScheduler.isDisable(this.mContext)) {
                        sleepTraceScheduler.startGenerateSleepReport(this.mContext);
                    }
                    sleepTraceScheduler.endSleepTrace(this.mContext);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void setDeepLightSleepDetectionEnable(boolean z) {
        LogExtKt.logi("isDeepLightSleepDetectionEnable = " + z);
        BehaviorConfiguration.INSTANCE.setDeepLightSleepDetectionEnable(z);
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void setEnable(boolean z) {
        SleepTraceConfiguration.INSTANCE.edit(this.mContext).setEnable(z).apply();
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void setSnoreDetectionStatus(int i) {
        LogExtKt.logi("snoreDetectionStatus = " + i);
        BehaviorConfiguration.INSTANCE.setKEY_SNORE_DETECTION_STATUS(i);
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void setSnoreRequestTime(long j) {
        LogExtKt.logi("snoreRequestStatus = " + j);
        BehaviorConfiguration.INSTANCE.setKEY_SNORE_REQUEST_STATUS(j);
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void setStepTimes(@NotNull Function2<? super Long, ? super Long, ? extends List<Long>> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.stepTimes = function2;
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void setUserAge(@NotNull Function0<Integer> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.userAge = function0;
    }
}
