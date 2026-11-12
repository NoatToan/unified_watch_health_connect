package com.xiaomi.fitness;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.sp.FitnessDataPreference;
import com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer;
import com.xiaomi.fit.fitness.sync.export.di.FitnessSyncExtKt;
import com.xiaomi.fitness.MiuiFunctionComponent;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.utils.NotificationPermission;
import com.xiaomi.fitness.cache.sp.SpExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.motion.recognition.MotionRecognizer;
import com.xiaomi.fitness.motion.recognition.extensions.RecognizerExtKt;
import com.xiaomi.fitness.motionrecognize.MiuiMotionSyncer;
import com.xiaomi.fitness.sleep.MiuiSleepSyncer;
import com.xiaomi.fitness.sleep.trace.SleepTraceConfiguration;
import com.xiaomi.fitness.sleep.trace.SleepTracer;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import com.xiaomi.fitness.sleep.trace.extensions.TraceExtKt;
import com.xiaomi.fitness.step.MiuiStepSyncer;
import com.xiaomi.fitness.steps.PhoneStepsProvider;
import com.xiaomi.fitness.steps.StepItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/MiuiFunctionComponent;", "", "<init>", "()V", "fitnessSyncer", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "getFitnessSyncer", "()Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "fitnessSyncer$delegate", "Lkotlin/Lazy;", "TAG", "", "stepSyncer", "Lcom/xiaomi/fitness/step/MiuiStepSyncer;", "getStepSyncer", "()Lcom/xiaomi/fitness/step/MiuiStepSyncer;", "stepSyncer$delegate", "sleepSyncer", "Lcom/xiaomi/fitness/sleep/MiuiSleepSyncer;", "getSleepSyncer", "()Lcom/xiaomi/fitness/sleep/MiuiSleepSyncer;", "sleepSyncer$delegate", "motionSyncer", "Lcom/xiaomi/fitness/motionrecognize/MiuiMotionSyncer;", "getMotionSyncer", "()Lcom/xiaomi/fitness/motionrecognize/MiuiMotionSyncer;", "motionSyncer$delegate", "initFunctions", "", "app", "Landroid/app/Application;", "initMiuiFun", "initMotionRecognizeWhenAlarmEnable", "initMotionRecognize", "instance", "Lcom/xiaomi/fitness/motion/recognition/MotionRecognizer;", "initSleepTraceWhenAlarmEnable", "initSleepTrace", "isSleepEnable", "", "initStepProvider", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "MiuiFitnessFunction")
@SourceDebugExtension({"SMAP\nMiuiFunctionComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiuiFunctionComponent.kt\ncom/xiaomi/fitness/MiuiFunctionComponent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,258:1\n1557#2:259\n1628#2,3:260\n*S KotlinDebug\n*F\n+ 1 MiuiFunctionComponent.kt\ncom/xiaomi/fitness/MiuiFunctionComponent\n*L\n178#1:259\n178#1:260,3\n*E\n"})
public final class MiuiFunctionComponent {

    /* JADX INFO: renamed from: fitnessSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fitnessSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: x5g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiuiFunctionComponent.fitnessSyncer_delegate$lambda$0();
        }
    });

    @NotNull
    private final String TAG = "MiuiFunctionComponent";

    /* JADX INFO: renamed from: stepSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy stepSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: y5g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiuiFunctionComponent.stepSyncer_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: sleepSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: z5g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiuiFunctionComponent.sleepSyncer_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: motionSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy motionSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: a6g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiuiFunctionComponent.motionSyncer_delegate$lambda$3();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessSyncer fitnessSyncer_delegate$lambda$0() {
        return FitnessSyncExtKt.getInstance(FitnessSyncer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FitnessSyncer getFitnessSyncer() {
        return (FitnessSyncer) this.fitnessSyncer.getValue();
    }

    private final MiuiMotionSyncer getMotionSyncer() {
        return (MiuiMotionSyncer) this.motionSyncer.getValue();
    }

    private final MiuiSleepSyncer getSleepSyncer() {
        return (MiuiSleepSyncer) this.sleepSyncer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MiuiStepSyncer getStepSyncer() {
        return (MiuiStepSyncer) this.stepSyncer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFunctions$lambda$4(MiuiFunctionComponent this$0, Application app, SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(app, "$app");
        String str2 = this$0.TAG;
        final RegionPreference regionPreference = RegionPreference.INSTANCE;
        FitnessLogUtils.i(str2, "region change " + str + " value " + regionPreference.getPRIVACY_AGREE());
        if (Intrinsics.areEqual(str, SpExtKt.getKey(new MutablePropertyReference0Impl(regionPreference) { // from class: com.xiaomi.fitness.MiuiFunctionComponent$initFunctions$1$1
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Boolean.valueOf(((RegionPreference) this.receiver).getPRIVACY_AGREE());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((RegionPreference) this.receiver).setPRIVACY_AGREE(((Boolean) obj).booleanValue());
            }
        }))) {
            FitnessLogUtils.i(this$0.TAG, "privacy value change " + regionPreference.getPRIVACY_AGREE());
            if (regionPreference.getPRIVACY_AGREE()) {
                this$0.initMiuiFun(app);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFunctions$lambda$5(MiuiFunctionComponent this$0, Application app, SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(app, "$app");
        final FitnessDataPreference fitnessDataPreference = FitnessDataPreference.INSTANCE;
        if (Intrinsics.areEqual(str, SpExtKt.getKey(new MutablePropertyReference0Impl(fitnessDataPreference) { // from class: com.xiaomi.fitness.MiuiFunctionComponent$initFunctions$2$1
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Boolean.valueOf(((FitnessDataPreference) this.receiver).getACTIVITY_RECOGNITION_PERMISSION());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((FitnessDataPreference) this.receiver).setACTIVITY_RECOGNITION_PERMISSION(((Boolean) obj).booleanValue());
            }
        }))) {
            FitnessLogUtils.i(this$0.TAG, "recognition value change " + fitnessDataPreference.getGetRecognitionPermission());
            if (fitnessDataPreference.getGetRecognitionPermission()) {
                this$0.initStepProvider(app);
            }
        }
    }

    private final void initMiuiFun(Application app) {
        if (!AppUtil.INSTANCE.supportMiuiFunction() && !RomUtils.isBlackShark()) {
            FitnessLogUtils.i(this.TAG, "not support  MIUI functions");
            return;
        }
        FitnessLogUtils.i(this.TAG, "init MIUI Functions（isBlackShark=" + RomUtils.isBlackShark() + "）");
        if (!RomUtils.isHyperOS(app) || Build.VERSION.SDK_INT < 35 || FitnessDataPreference.INSTANCE.getGetRecognitionPermission()) {
            initStepProvider(app);
        }
        initSleepTraceWhenAlarmEnable(app);
        initMotionRecognizeWhenAlarmEnable(app);
    }

    private final void initMotionRecognize(Application app, MotionRecognizer instance) {
        if (instance.isEnable()) {
            long todayZeroTimeInSec = FitnessDateUtils.getTodayZeroTimeInSec() * ((long) 1000);
            TimeUnit timeUnit = TimeUnit.HOURS;
            SleepTraceConfiguration.Companion companion = SleepTraceConfiguration.INSTANCE;
            long millis = timeUnit.toMillis(companion.getEarliestSleepHourOfDay());
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            long millis2 = millis + timeUnit2.toMillis(companion.getEarliestSleepMin());
            long millis3 = timeUnit.toMillis(companion.getEarliestWakeHourOfDay() + 24) + timeUnit2.toMillis(companion.getEarliestWakeMin());
            long j = todayZeroTimeInSec + millis2;
            long j2 = todayZeroTimeInSec + millis3;
            FitnessLogUtils.i(this.TAG, "initMotionRecognize: sleepTime = " + j + ", wakeTime = " + j2);
            instance.initialize(app, j, j2);
            instance.setStart(true);
            instance.setOnRecognizeListener(new Function1() { // from class: b6g
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MiuiFunctionComponent.initMotionRecognize$lambda$7(this.f3861a, (List) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initMotionRecognize$lambda$7(MiuiFunctionComponent this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this$0.TAG, "no scene motion result");
            return Unit.INSTANCE;
        }
        this$0.getMotionSyncer().onReceiverMotionResult(list);
        return Unit.INSTANCE;
    }

    private final void initMotionRecognizeWhenAlarmEnable(final Application app) {
        final MotionRecognizer recognizerExtKt = RecognizerExtKt.getInstance(MotionRecognizer.INSTANCE);
        NotificationPermission.INSTANCE.registerListener(new Function2() { // from class: w5g
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MiuiFunctionComponent.initMotionRecognizeWhenAlarmEnable$lambda$6(this.f37634a, app, recognizerExtKt, (Boolean) obj, (Boolean) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initMotionRecognizeWhenAlarmEnable$lambda$6(MiuiFunctionComponent this$0, Application app, MotionRecognizer instance, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(app, "$app");
        Intrinsics.checkNotNullParameter(instance, "$instance");
        if (bool2 == null) {
            return Unit.INSTANCE;
        }
        if (bool2.booleanValue()) {
            this$0.initMotionRecognize(app, instance);
        } else {
            instance.setEnable(false);
        }
        return Unit.INSTANCE;
    }

    private final void initSleepTrace(Application app) {
        if (isSleepEnable()) {
            FitnessLogUtils.i(this.TAG, "initSleepTrace");
            SleepTracer traceExtKt = TraceExtKt.getInstance(SleepTracer.INSTANCE);
            traceExtKt.initSleepTrace();
            traceExtKt.addSleepReportObserver(new Function1() { // from class: c6g
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MiuiFunctionComponent.initSleepTrace$lambda$9(this.f4986a, (SleepReport) obj);
                }
            });
            traceExtKt.setUserAge(new Function0() { // from class: d6g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(MiuiFunctionComponent.initSleepTrace$lambda$10(this.f15138a));
                }
            });
            traceExtKt.setStepTimes(new Function2() { // from class: e6g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MiuiFunctionComponent.initSleepTrace$lambda$12(this.f16312a, ((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int initSleepTrace$lambda$10(MiuiFunctionComponent this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int age = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getAge();
        FitnessLogUtils.i(this$0.TAG, "userAge:" + age);
        return age;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List initSleepTrace$lambda$12(MiuiFunctionComponent this$0, long j, long j2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<StepItem> steps = PhoneStepsProvider.INSTANCE.getSteps(j, j2, 0);
        FitnessLogUtils.i(this$0.TAG, "steps size:" + steps.size());
        List<StepItem> list = steps;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((StepItem) it.next()).getBeginTime()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSleepTrace$lambda$9(MiuiFunctionComponent this$0, SleepReport sleepReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(this$0.TAG, "SleepReport: " + sleepReport);
        if (sleepReport != null) {
            this$0.getSleepSyncer().onReceiveMiuiSleep(sleepReport);
        }
        return Unit.INSTANCE;
    }

    private final void initSleepTraceWhenAlarmEnable(final Application app) {
        NotificationPermission.INSTANCE.registerListener(new Function2() { // from class: s5g
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MiuiFunctionComponent.initSleepTraceWhenAlarmEnable$lambda$8(this.f33318a, app, (Boolean) obj, (Boolean) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSleepTraceWhenAlarmEnable$lambda$8(MiuiFunctionComponent this$0, Application app, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(app, "$app");
        FitnessLogUtils.i(this$0.TAG, "initSleepTraceWhenAlarmEnable " + bool2);
        if (bool2 == null) {
            return Unit.INSTANCE;
        }
        if (bool2.booleanValue()) {
            this$0.initSleepTrace(app);
        } else {
            TraceExtKt.getInstance(SleepTracer.INSTANCE).setEnable(false);
        }
        return Unit.INSTANCE;
    }

    private final void initStepProvider(Application app) {
        try {
            PhoneStepsProvider phoneStepsProvider = PhoneStepsProvider.INSTANCE;
            boolean zSupported = phoneStepsProvider.supported();
            boolean stepProviderValid = phoneStepsProvider.getStepProviderValid(app);
            FitnessLogUtils.i(this.TAG, "initStepProvider supported " + zSupported + " ,stepProviderValid " + stepProviderValid + " ");
            if (zSupported && stepProviderValid) {
                phoneStepsProvider.setObserver(new Function0() { // from class: t5g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MiuiFunctionComponent.initStepProvider$lambda$13(this.f34338a);
                    }
                });
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("recent_data_changed_broadcast");
                intentFilter.addAction(FitnessDataConstants.WIDGET_TRIGGER_REQUEST_STEP);
                intentFilter.addAction(FitnessDataConstants.WIDGET_TRIGGER_SYNC_REQUEST);
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.MiuiFunctionComponent$initStepProvider$broadcastReceiver$1
                    /* JADX WARN: Code duplicated, block: B:22:0x003e  */
                    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
                    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
                    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
                    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        String uri;
                        String str;
                        String action = intent != null ? intent.getAction() : null;
                        if (action != null) {
                            int iHashCode = action.hashCode();
                            if (iHashCode != 1452082165) {
                                if (iHashCode != 1484986885) {
                                    String str2 = this.this$0.TAG;
                                    if (intent != null) {
                                        uri = intent.toUri(0);
                                    } else {
                                        uri = null;
                                    }
                                    FitnessLogUtils.i(str2, "onReceive " + uri);
                                    if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, FitnessDataConstants.WIDGET_TRIGGER_REQUEST_STEP)) {
                                        str = "widget trigger";
                                    } else {
                                        str = "onServerSyncFinished";
                                    }
                                    this.this$0.getStepSyncer().doRequestSteps(str);
                                    return;
                                }
                                String str3 = this.this$0.TAG;
                                if (intent != null) {
                                    uri = intent.toUri(0);
                                } else {
                                    uri = null;
                                }
                                FitnessLogUtils.i(str3, "onReceive " + uri);
                                if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, FitnessDataConstants.WIDGET_TRIGGER_REQUEST_STEP)) {
                                    str = "widget trigger";
                                } else {
                                    str = "onServerSyncFinished";
                                }
                                this.this$0.getStepSyncer().doRequestSteps(str);
                                return;
                            }
                            if (action.equals(FitnessDataConstants.WIDGET_TRIGGER_SYNC_REQUEST)) {
                                FitnessLogUtils.i(this.this$0.TAG, "onReceive " + (intent != null ? intent.toUri(0) : null));
                                this.this$0.getFitnessSyncer().triggerDataSyncByWidget(true);
                                return;
                            }
                        }
                        Logger.w(this.this$0.TAG, "Unknown action received: " + (intent != null ? intent.getAction() : null));
                    }
                };
                if (Build.VERSION.SDK_INT >= 33) {
                    ApplicationExtKt.getApplication().registerReceiver(broadcastReceiver, intentFilter, 2);
                } else {
                    ApplicationExtKt.getApplication().registerReceiver(broadcastReceiver, intentFilter);
                }
            }
        } catch (Exception e) {
            Logger.e(this.TAG, "initStepProvider exception " + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initStepProvider$lambda$13(MiuiFunctionComponent this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(this$0.TAG, "PhoneStepsProvider observer callback");
        this$0.getStepSyncer().doRequestSteps("onStepChanged");
        return Unit.INSTANCE;
    }

    private final boolean isSleepEnable() {
        SleepTracer.Companion companion = SleepTracer.INSTANCE;
        int enable = TraceExtKt.getInstance(companion).getEnable();
        if (enable != -1) {
            return enable == 1;
        }
        String localCountry = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry();
        boolean z = !(localCountry == null || localCountry.length() == 0);
        TraceExtKt.getInstance(companion).setEnable(z);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MiuiMotionSyncer motionSyncer_delegate$lambda$3() {
        return new MiuiMotionSyncer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MiuiSleepSyncer sleepSyncer_delegate$lambda$2() {
        return new MiuiSleepSyncer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MiuiStepSyncer stepSyncer_delegate$lambda$1() {
        return new MiuiStepSyncer(ApplicationExtKt.getApplication());
    }

    @ComponentTask(notLaterThan = 2, processName = ":device")
    public final void initFunctions(@NotNull final Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        RegionPreference regionPreference = RegionPreference.INSTANCE;
        regionPreference.registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: u5g
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                MiuiFunctionComponent.initFunctions$lambda$4(this.f35416a, app, sharedPreferences, str);
            }
        });
        if (regionPreference.getPRIVACY_AGREE()) {
            initMiuiFun(app);
        }
        if (!RomUtils.isHyperOS(app) || Build.VERSION.SDK_INT < 35) {
            return;
        }
        FitnessDataPreference fitnessDataPreference = FitnessDataPreference.INSTANCE;
        fitnessDataPreference.registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: v5g
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                MiuiFunctionComponent.initFunctions$lambda$5(this.f36501a, app, sharedPreferences, str);
            }
        });
        if (fitnessDataPreference.getGetRecognitionPermission()) {
            initStepProvider(app);
        }
    }
}
