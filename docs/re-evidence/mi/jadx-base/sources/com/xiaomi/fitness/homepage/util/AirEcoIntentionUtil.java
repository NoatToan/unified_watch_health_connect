package com.xiaomi.fitness.homepage.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.a;
import com.xiaomi.fit.data.common.data.aireco.AirEcoAccessExtKt;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.DallyGoalItem;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.aireco.SendAirEcoIntentWorker;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/homepage/util/AirEcoIntentionUtil;", "", "<init>", "()V", "TAG", "", "calTarget", "", "standTarget", "mhStrengthTarget", "stepTarget", "stepTwiceTarget", "stepThreeTimesTarget", "mDataChangedReceiver", "com/xiaomi/fitness/homepage/util/AirEcoIntentionUtil$mDataChangedReceiver$1", "Lcom/xiaomi/fitness/homepage/util/AirEcoIntentionUtil$mDataChangedReceiver$1;", "registerHandler", "", "enqueueTimePeriodSendIntentionTask", "getUserRainbowGoal", "sendRainbowPredictionIntentionIfNeed", "registerDataChangedBroadcastReceiver", "analyzeHealthDataAndSendIntentionToAirEcoIfNeed", "sendSleepIntentionIfNeed", "sendRainbowIntentionIfNeed", "getRainbowFinishCount", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAirEcoIntentionUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirEcoIntentionUtil.kt\ncom/xiaomi/fitness/homepage/util/AirEcoIntentionUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,295:1\n1863#2,2:296\n*S KotlinDebug\n*F\n+ 1 AirEcoIntentionUtil.kt\ncom/xiaomi/fitness/homepage/util/AirEcoIntentionUtil\n*L\n91#1:296,2\n*E\n"})
public final class AirEcoIntentionUtil {

    @NotNull
    public static final String TAG = "AirEcoIntentionHandler";
    private static int calTarget;
    private static int mhStrengthTarget;
    private static int standTarget;
    private static int stepTarget;
    private static int stepThreeTimesTarget;
    private static int stepTwiceTarget;

    @NotNull
    public static final AirEcoIntentionUtil INSTANCE = new AirEcoIntentionUtil();

    @NotNull
    private static final AirEcoIntentionUtil$mDataChangedReceiver$1 mDataChangedReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.homepage.util.AirEcoIntentionUtil$mDataChangedReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "recent_data_changed_broadcast")) {
                AirEcoIntentionUtil.INSTANCE.analyzeHealthDataAndSendIntentionToAirEcoIfNeed();
            }
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.fitness.homepage.util.AirEcoIntentionUtil$sendRainbowIntentionIfNeed$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.homepage.util.AirEcoIntentionUtil$sendRainbowIntentionIfNeed$1", f = "AirEcoIntentionUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nAirEcoIntentionUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirEcoIntentionUtil.kt\ncom/xiaomi/fitness/homepage/util/AirEcoIntentionUtil$sendRainbowIntentionIfNeed$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,295:1\n216#2,2:296\n*S KotlinDebug\n*F\n+ 1 AirEcoIntentionUtil.kt\ncom/xiaomi/fitness/homepage/util/AirEcoIntentionUtil$sendRainbowIntentionIfNeed$1\n*L\n218#1:296,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Map<Integer, Pair<Integer, Integer>> itemTypeGoalAndValue = FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRainbowRepository().getDailyReportSync(TimeUtils.getBeginOfToday() / ((long) 1000)).getItemTypeGoalAndValue();
            HealthPrefer healthPrefer = HealthPrefer.INSTANCE;
            int prevStep = healthPrefer.getPrevDynamicGoalModel().getPrevStep();
            int prevCal = healthPrefer.getPrevDynamicGoalModel().getPrevCal();
            int prevStand = healthPrefer.getPrevDynamicGoalModel().getPrevStand();
            int prevMHStrength = healthPrefer.getPrevDynamicGoalModel().getPrevMHStrength();
            for (Map.Entry<Integer, Pair<Integer, Integer>> entry : itemTypeGoalAndValue.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                Pair<Integer, Integer> value = entry.getValue();
                if (iIntValue == 1) {
                    int iIntValue2 = value.getSecond().intValue();
                    HealthPrefer.setPrevDynamicGoal$default(HealthPrefer.INSTANCE, iIntValue2, 0, 0, 0, 0, 30, null);
                    Logger.i(AirEcoIntentionUtil.TAG, "sendRainbowIntentionIfNeed prevStep=" + prevStep + " curtStep=" + iIntValue2 + " stepTarget=" + AirEcoIntentionUtil.stepTarget);
                    int i = 1 + prevStep;
                    int i2 = AirEcoIntentionUtil.stepTarget;
                    if (i > i2 || i2 > iIntValue2) {
                        int i3 = AirEcoIntentionUtil.stepTwiceTarget;
                        if (i > i3 || i3 > iIntValue2) {
                            int i4 = AirEcoIntentionUtil.stepThreeTimesTarget;
                            if (i <= i4 && i4 <= iIntValue2) {
                                AirEcoAccessExtKt.sendNotifyIntentionToAirEcoIfSupportive(new int[]{2}, "AirEcoIntentionHandler GoalType.STEP goal three times complete");
                            }
                        } else {
                            AirEcoAccessExtKt.sendNotifyIntentionToAirEcoIfSupportive(new int[]{2}, "AirEcoIntentionHandler GoalType.STEP goal twice complete");
                        }
                    } else {
                        AirEcoIntentionUtil.INSTANCE.sendRainbowPredictionIntentionIfNeed();
                        AirEcoAccessExtKt.sendNotifyIntentionToAirEcoIfSupportive(new int[]{2}, "AirEcoIntentionHandler GoalType.STEP goal complete");
                        HealthPageExtKt.getInstance(IHealthPage.INSTANCE).sendRevertIntentionToAirEco(3, "sendRainbowIntentionIfNeed");
                    }
                } else if (iIntValue == 2) {
                    int iIntValue3 = value.getSecond().intValue();
                    HealthPrefer.setPrevDynamicGoal$default(HealthPrefer.INSTANCE, 0, iIntValue3, 0, 0, 0, 29, null);
                    Logger.i(AirEcoIntentionUtil.TAG, "sendRainbowIntentionIfNeed prevCal=" + prevCal + " curtCal=" + iIntValue3 + " calTarget=" + AirEcoIntentionUtil.calTarget);
                    int i5 = 1 + prevCal;
                    int i6 = AirEcoIntentionUtil.calTarget;
                    if (i5 <= i6 && i6 <= iIntValue3) {
                        AirEcoIntentionUtil.INSTANCE.sendRainbowPredictionIntentionIfNeed();
                    }
                } else if (iIntValue != 3) {
                    int iIntValue4 = value.getSecond().intValue();
                    Logger.i(AirEcoIntentionUtil.TAG, "sendRainbowIntentionIfNeed prevMHStrength=" + prevMHStrength + " curtMHStrength=" + iIntValue4 + " mhStrengthTarget=" + AirEcoIntentionUtil.mhStrengthTarget);
                    HealthPrefer.setPrevDynamicGoal$default(HealthPrefer.INSTANCE, 0, 0, 0, iIntValue4, 0, 23, null);
                    if (AirEcoIntentionUtil.mhStrengthTarget > 0 && prevMHStrength < AirEcoIntentionUtil.mhStrengthTarget && iIntValue4 >= AirEcoIntentionUtil.mhStrengthTarget) {
                        AirEcoIntentionUtil.INSTANCE.sendRainbowPredictionIntentionIfNeed();
                    }
                } else {
                    int iIntValue5 = value.getSecond().intValue();
                    Logger.i(AirEcoIntentionUtil.TAG, "sendRainbowIntentionIfNeed prevStand=" + prevStand + " curtStand=" + iIntValue5 + " standTarget=" + AirEcoIntentionUtil.standTarget);
                    HealthPrefer.setPrevDynamicGoal$default(HealthPrefer.INSTANCE, 0, 0, iIntValue5, 0, 0, 27, null);
                    if (AirEcoIntentionUtil.standTarget > 0 && prevStand < AirEcoIntentionUtil.standTarget && iIntValue5 >= AirEcoIntentionUtil.standTarget) {
                        AirEcoIntentionUtil.INSTANCE.sendRainbowPredictionIntentionIfNeed();
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.homepage.util.AirEcoIntentionUtil$sendSleepIntentionIfNeed$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.homepage.util.AirEcoIntentionUtil$sendSleepIntentionIfNeed$1", f = "AirEcoIntentionUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C25801(Continuation<? super C25801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25801(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            long j = 1000;
            AllDaySleepReport report = ((ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class)).getReport(null, TimeUtils.getBeginOfToday() / j);
            if (report == null) {
                return Unit.INSTANCE;
            }
            report.getTime();
            List<SleepSegmentReport> sleepSegments = report.getSleepSegments();
            if (sleepSegments == null) {
                return Unit.INSTANCE;
            }
            int size = sleepSegments.size();
            HealthPrefer healthPrefer = HealthPrefer.INSTANCE;
            boolean zIsToday = TimeDateUtil.isToday(healthPrefer.getLAST_SENT_SLEEP_TIMESTAMP_MILLS() / j);
            int prevSleepSegmentCount = healthPrefer.getPrevDynamicGoalModel().getPrevSleepSegmentCount();
            if (!zIsToday) {
                AirEcoAccessExtKt.sendNotifyIntentionToAirEcoIfSupportive(new int[]{0}, "TimestampLastSent Not Today");
                Logger.i(AirEcoIntentionUtil.TAG, "sendSleepIntentionIfNeed new report: sleepReport=" + report + " LAST_SENT_SLEEP_TIMESTAMP_MILLS=" + FitnessDateUtils.getDateStr(healthPrefer.getLAST_SENT_SLEEP_TIMESTAMP_MILLS() / j) + " prevSleepSegmentCount=" + prevSleepSegmentCount);
                HealthPrefer.setPrevDynamicGoal$default(healthPrefer, 0, 0, 0, 0, size, 15, null);
                healthPrefer.setLAST_SENT_SLEEP_TIMESTAMP_MILLS(System.currentTimeMillis());
            } else if (size > prevSleepSegmentCount) {
                AirEcoAccessExtKt.sendNotifyIntentionToAirEcoIfSupportive(new int[]{0}, "TimestampLastSent is Today, New Segment");
                Logger.i(AirEcoIntentionUtil.TAG, "sendSleepIntentionIfNeed new segment: sleepReport=" + report + " LAST_SENT_SLEEP_TIMESTAMP_MILLS=" + FitnessDateUtils.getDateStr(healthPrefer.getLAST_SENT_SLEEP_TIMESTAMP_MILLS() / j) + " prevSleepSegmentCount=" + prevSleepSegmentCount);
                HealthPrefer.setPrevDynamicGoal$default(healthPrefer, 0, 0, 0, 0, size, 15, null);
                healthPrefer.setLAST_SENT_SLEEP_TIMESTAMP_MILLS(System.currentTimeMillis());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private AirEcoIntentionUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void analyzeHealthDataAndSendIntentionToAirEcoIfNeed() {
        sendRainbowIntentionIfNeed();
        sendSleepIntentionIfNeed();
    }

    private final void enqueueTimePeriodSendIntentionTask() {
        WorkManager.INSTANCE.getInstance(ApplicationExtKt.getApplication()).enqueue(new PeriodicWorkRequest.Builder((Class<? extends a>) SendAirEcoIntentWorker.class, 1L, TimeUnit.DAYS, 8L, TimeUnit.HOURS).build());
    }

    private final int getRainbowFinishCount() {
        HealthPrefer healthPrefer = HealthPrefer.INSTANCE;
        int prevStep = healthPrefer.getPrevDynamicGoalModel().getPrevStep();
        int prevCal = healthPrefer.getPrevDynamicGoalModel().getPrevCal();
        int prevStand = healthPrefer.getPrevDynamicGoalModel().getPrevStand();
        int prevMHStrength = healthPrefer.getPrevDynamicGoalModel().getPrevMHStrength();
        int i = prevStep >= stepTarget ? 1 : 0;
        if (prevCal >= calTarget) {
            i++;
        }
        int i2 = mhStrengthTarget;
        if (i2 > 0 && 1 <= i2 && i2 <= prevMHStrength) {
            i++;
        }
        int i3 = standTarget;
        return (i3 <= 0 || 1 > i3 || i3 > prevStand) ? i : i + 1;
    }

    private final void getUserRainbowGoal() {
        List<DallyGoalItem> regularGoalList = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getRegularGoalList();
        if (regularGoalList != null) {
            for (DallyGoalItem dallyGoalItem : regularGoalList) {
                String strValueOf = String.valueOf(dallyGoalItem.getField());
                int target = dallyGoalItem.getTarget();
                if (Intrinsics.areEqual(strValueOf, "4")) {
                    mhStrengthTarget = target;
                }
                if (Intrinsics.areEqual(strValueOf, "2")) {
                    calTarget = target;
                }
                if (Intrinsics.areEqual(strValueOf, "1")) {
                    stepTarget = target;
                    stepTwiceTarget = target * 2;
                    stepThreeTimesTarget = target * 3;
                }
                if (Intrinsics.areEqual(strValueOf, "3")) {
                    standTarget = target;
                }
            }
        }
        Logger.i(TAG, "getUserRainbowGoal stepTarget=" + stepTarget + " standTarget=" + standTarget + " calTarget=" + calTarget + " mhStrengthTarget=" + mhStrengthTarget);
    }

    private final void registerDataChangedBroadcastReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("recent_data_changed_broadcast");
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(mDataChangedReceiver, intentFilter, 2);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(mDataChangedReceiver, intentFilter);
        }
    }

    private final void sendRainbowIntentionIfNeed() {
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendRainbowPredictionIntentionIfNeed() {
        int rainbowFinishCount = getRainbowFinishCount();
        if (1 <= rainbowFinishCount && rainbowFinishCount < 3) {
            AirEcoAccessExtKt.sendNotifyIntentionToAirEcoIfSupportive(new int[]{5}, "AirEcoIntentionHandler rainbow partial complete, rainbowFinishCount=" + rainbowFinishCount);
            HealthPageExtKt.getInstance(IHealthPage.INSTANCE).sendRevertIntentionToAirEco(4, "sendRainbowPredictionIntentionIfNeed");
            return;
        }
        if (rainbowFinishCount == 3) {
            AirEcoAccessExtKt.sendNotifyIntentionToAirEcoIfSupportive(new int[]{1}, "AirEcoIntentionHandler rainbow complete, rainbowFinishCount=" + rainbowFinishCount);
            IHealthPage.Companion companion = IHealthPage.INSTANCE;
            HealthPageExtKt.getInstance(companion).sendRevertIntentionToAirEco(4, "sendRainbowPredictionIntentionIfNeed");
            HealthPageExtKt.getInstance(companion).sendRevertIntentionToAirEco(5, "sendRainbowPredictionIntentionIfNeed");
        }
    }

    private final void sendSleepIntentionIfNeed() {
        AnyExtKt.io$default(null, new C25801(null), 1, null);
    }

    public final void registerHandler() {
        if (AirEcoAccessExtKt.getSupportAirEcoIntentionAccess()) {
            Logger.i(TAG, "registerIntentHandlerToAirEco running");
            enqueueTimePeriodSendIntentionTask();
            long jCurrentTimeMillis = System.currentTimeMillis();
            TimeUtils timeUtils = TimeUtils.INSTANCE;
            HealthPrefer healthPrefer = HealthPrefer.INSTANCE;
            boolean zIsSameDay = timeUtils.isSameDay(healthPrefer.getNOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS(), jCurrentTimeMillis);
            Logger.i(TAG, "registerIntentHandlerToAirEco isSameDay=" + zIsSameDay + " lastRegisteredTimestamp=" + healthPrefer.getNOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS());
            if (!zIsSameDay) {
                AirEcoAccessExtKt.sendNotifyIntentionToAirEcoIfSupportive(new int[]{4, 3}, "AirEcoIntentionHandler !isSameDay");
            }
            registerDataChangedBroadcastReceiver();
            getUserRainbowGoal();
            healthPrefer.setNOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS(System.currentTimeMillis());
        }
    }
}
