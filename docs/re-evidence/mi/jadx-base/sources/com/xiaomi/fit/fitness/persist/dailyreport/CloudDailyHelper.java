package com.xiaomi.fit.fitness.persist.dailyreport;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudCaloriesReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudHMStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudKey;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudSleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudSleepSegment;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudSpo2Report;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudStepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudStressReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.StressScaleItem;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.distribute.DailyHrDistribute;
import com.xiaomi.fit.fitness.export.data.item.AbnormalHrItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.persist.dailyreport.CloudDailyHelper;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateFitnessData;
import com.xiaomi.fit.fitness.persist.dailyreport.utils.DataCloudUtilKt;
import com.xiaomi.fit.fitness.persist.server.FitnessDataRequest;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u0014H\u0002J*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u0014H\u0002J*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u0014H\u0002J*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u0014H\u0002J*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u0014H\u0002J*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u0014H\u0002J*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u0014H\u0002J*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u0014H\u0002J3\u0010\u001e\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00152\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/dailyreport/CloudDailyHelper;", "", "<init>", "()V", "TAG", "", "mFitnessRequest", "Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "getMFitnessRequest", "()Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "mFitnessRequest$delegate", "Lkotlin/Lazy;", "pushCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "fitnessDailyDataUpCloud", "", "convertSteps", "", "Lcom/xiaomi/fit/fitness/persist/dailyreport/bean/AggregateFitnessData;", "dataMap", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "convertCalories", "convertSleep", "convertHr", "convertStress", "convertSpo2", "convertIntensity", "convertValidStand", "getAggregateData", "time", "", "value", "type", "sid", "(Ljava/lang/Long;Ljava/lang/String;Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;Ljava/lang/String;)Lcom/xiaomi/fit/fitness/persist/dailyreport/bean/AggregateFitnessData;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCloudDailyHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudDailyHelper.kt\ncom/xiaomi/fit/fitness/persist/dailyreport/CloudDailyHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,345:1\n1863#2,2:346\n1863#2,2:348\n1863#2:350\n1863#2,2:351\n1864#2:353\n1863#2,2:354\n1863#2,2:356\n1863#2,2:358\n1863#2,2:360\n1863#2,2:362\n*S KotlinDebug\n*F\n+ 1 CloudDailyHelper.kt\ncom/xiaomi/fit/fitness/persist/dailyreport/CloudDailyHelper\n*L\n88#1:346,2\n114#1:348,2\n137#1:350\n144#1:351,2\n137#1:353\n199#1:354,2\n230#1:356,2\n264#1:358,2\n292#1:360,2\n314#1:362,2\n*E\n"})
public final class CloudDailyHelper {

    @NotNull
    private static final String TAG = "CloudDailyHelper";

    @NotNull
    public static final CloudDailyHelper INSTANCE = new CloudDailyHelper();

    /* JADX INFO: renamed from: mFitnessRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mFitnessRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: d24
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CloudDailyHelper.mFitnessRequest_delegate$lambda$0();
        }
    });

    @NotNull
    private static AtomicInteger pushCount = new AtomicInteger();

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.dailyreport.CloudDailyHelper$fitnessDailyDataUpCloud$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.dailyreport.CloudDailyHelper$fitnessDailyDataUpCloud$1", f = "CloudDailyHelper.kt", i = {0, 0}, l = {62}, m = "invokeSuspend", n = {"dataMap", "hasData"}, s = {"L$0", "I$0"})
    @SourceDebugExtension({"SMAP\nCloudDailyHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudDailyHelper.kt\ncom/xiaomi/fit/fitness/persist/dailyreport/CloudDailyHelper$fitnessDailyDataUpCloud$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,345:1\n216#2:346\n217#2:349\n1863#3,2:347\n*S KotlinDebug\n*F\n+ 1 CloudDailyHelper.kt\ncom/xiaomi/fit/fitness/persist/dailyreport/CloudDailyHelper$fitnessDailyDataUpCloud$1\n*L\n66#1:346\n66#1:349\n67#1:347,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:12:0x0050 A[LOOP:2: B:9:0x0028->B:12:0x0050, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:15:0x008d  */
        /* JADX WARN: Code duplicated, block: B:21:0x009b  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:65:0x0102  */
        /* JADX WARN: Code duplicated, block: B:67:0x0112 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:90:0x0062 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0110 -> B:68:0x0113). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:15:0x008d
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 391
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.persist.dailyreport.CloudDailyHelper.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private CloudDailyHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AggregateFitnessData> convertCalories(Map<HomeDataType, ? extends List<? extends DailyBasicReport>> dataMap) {
        List<? extends DailyBasicReport> list = dataMap.get(HomeDataType.CALORIE);
        List<? extends DailyBasicReport> list2 = list instanceof List ? list : null;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            DailyCalorieReport dailyCalorieReport = (DailyCalorieReport) it.next();
            int calories = dailyCalorieReport.getCalories();
            Long timeInZero = dailyCalorieReport.getTimeInZero();
            if (calories > 0 && DataCloudUtilKt.isInvalidTime(timeInZero)) {
                AggregateFitnessData aggregateData = INSTANCE.getAggregateData(timeInZero, FitnessPersistUtils.INSTANCE.toJson(new CloudCaloriesReport(calories)), HomeDataType.CALORIE, dailyCalorieReport.getSid());
                arrayList.add(aggregateData);
                FitnessLogUtils.d(TAG, "convertCalories data=" + aggregateData);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AggregateFitnessData> convertHr(Map<HomeDataType, ? extends List<? extends DailyBasicReport>> dataMap) {
        List<? extends DailyBasicReport> list = dataMap.get(HomeDataType.HR);
        Integer num = null;
        List<? extends DailyBasicReport> list2 = list instanceof List ? list : null;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            DailyHrReport dailyHrReport = (DailyHrReport) it.next();
            int maxHr = dailyHrReport.getMaxHr();
            Long timeInZero = dailyHrReport.getTimeInZero();
            DailyHrDistribute hrDistribute = dailyHrReport.getHrDistribute();
            if (maxHr > 0 && DataCloudUtilKt.isInvalidTime(timeInZero)) {
                int avgHr = dailyHrReport.getAvgHr();
                int minHr = dailyHrReport.getMinHr();
                List<AbnormalHrItem> abnormalHrRecords = dailyHrReport.getAbnormalHrRecords();
                AggregateFitnessData aggregateData = INSTANCE.getAggregateData(timeInZero, FitnessPersistUtils.INSTANCE.toJson(new CloudHrReport(avgHr, maxHr, minHr, abnormalHrRecords != null ? abnormalHrRecords.size() : 0, dailyHrReport.getRestHr(), dailyHrReport.getLatestHrRecord(), hrDistribute != null ? Integer.valueOf(hrDistribute.getExtreme()) : num, hrDistribute != null ? Integer.valueOf(hrDistribute.getAnaerobic()) : num, hrDistribute != null ? Integer.valueOf(hrDistribute.getAerobic()) : num, hrDistribute != null ? Integer.valueOf(hrDistribute.getFatBurn()) : num, hrDistribute != null ? Integer.valueOf(hrDistribute.getWarmUp()) : num)), HomeDataType.HR, dailyHrReport.getSid());
                arrayList.add(aggregateData);
                FitnessLogUtils.d(TAG, "convertHr data=" + aggregateData);
            }
            it = it;
            num = null;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AggregateFitnessData> convertIntensity(Map<HomeDataType, ? extends List<? extends DailyBasicReport>> dataMap) {
        List<? extends DailyBasicReport> list = dataMap.get(HomeDataType.MH_STRENGTH);
        List<? extends DailyBasicReport> list2 = list instanceof List ? list : null;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            DailyMHStrengthReport dailyMHStrengthReport = (DailyMHStrengthReport) it.next();
            int duration = dailyMHStrengthReport.getDuration();
            Long timeInZero = dailyMHStrengthReport.getTimeInZero();
            if (duration > 0 && DataCloudUtilKt.isInvalidTime(timeInZero)) {
                AggregateFitnessData aggregateData = INSTANCE.getAggregateData(timeInZero, FitnessPersistUtils.INSTANCE.toJson(new CloudHMStrengthReport(duration)), HomeDataType.MH_STRENGTH, dailyMHStrengthReport.getSid());
                arrayList.add(aggregateData);
                FitnessLogUtils.d(TAG, "convertIntensity data=" + aggregateData);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AggregateFitnessData> convertSleep(Map<HomeDataType, ? extends List<? extends DailyBasicReport>> dataMap) {
        List<? extends DailyBasicReport> list = dataMap.get(HomeDataType.SLEEP);
        List<? extends DailyBasicReport> list2 = list instanceof List ? list : null;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            AllDaySleepReport allDaySleepReport = (AllDaySleepReport) it.next();
            int totalDuration = allDaySleepReport.getTotalDuration();
            Long timeInZero = allDaySleepReport.getTimeInZero();
            if (totalDuration > 0 && DataCloudUtilKt.isInvalidTime(timeInZero)) {
                ArrayList arrayList2 = new ArrayList();
                List<SleepSegmentReport> sleepSegments = allDaySleepReport.getSleepSegments();
                if (sleepSegments == null) {
                    return null;
                }
                for (SleepSegmentReport sleepSegmentReport : sleepSegments) {
                    arrayList2.add(new CloudSleepSegment(sleepSegmentReport.getBedTime(), sleepSegmentReport.getWakeupTime(), sleepSegmentReport.getTzIn15Min(), sleepSegmentReport.getSleepDuration(), sleepSegmentReport.getAvgHr(), sleepSegmentReport.getMaxHr(), sleepSegmentReport.getMinHr(), sleepSegmentReport.getAvgSpo2(), sleepSegmentReport.getMaxSpo2(), sleepSegmentReport.getMinSpo2(), Integer.valueOf(sleepSegmentReport.getDeepDuration()), Integer.valueOf(sleepSegmentReport.getLightDuration()), sleepSegmentReport.getRemDuration(), sleepSegmentReport.getWakeDuration(), sleepSegmentReport.getWakeCount()));
                }
                CloudSleepReport cloudSleepReport = new CloudSleepReport(totalDuration, arrayList2);
                cloudSleepReport.setSleepDeepDuration(Integer.valueOf(allDaySleepReport.getDeepDuration()));
                cloudSleepReport.setSleepLightDuration(Integer.valueOf(allDaySleepReport.getLightDuration()));
                cloudSleepReport.setSleepAwakeDuration(allDaySleepReport.getAwakeDuration());
                cloudSleepReport.setSleepRemDuration(allDaySleepReport.getRemDuration());
                cloudSleepReport.setSleepStage(Integer.valueOf(allDaySleepReport.getStage()));
                cloudSleepReport.setSleepScore(Integer.valueOf(allDaySleepReport.getScore()));
                cloudSleepReport.setLongSleepEvaluation(Integer.valueOf(allDaySleepReport.getLongSleepCommentCode()));
                cloudSleepReport.setDaySleepEvaluation(Integer.valueOf(allDaySleepReport.getCommentCode()));
                cloudSleepReport.setAvgHr(allDaySleepReport.getAvgHr());
                cloudSleepReport.setMaxHr(allDaySleepReport.getMaxHr());
                cloudSleepReport.setMinHr(allDaySleepReport.getMinHr());
                cloudSleepReport.setAvgSpo2(allDaySleepReport.getAvgSpo2());
                cloudSleepReport.setMaxSpo2(allDaySleepReport.getMaxSpo2());
                cloudSleepReport.setMinSpo2(allDaySleepReport.getMinSpo2());
                AggregateFitnessData aggregateData = INSTANCE.getAggregateData(timeInZero, FitnessPersistUtils.INSTANCE.toJson(cloudSleepReport), HomeDataType.SLEEP, allDaySleepReport.getSid());
                arrayList.add(aggregateData);
                FitnessLogUtils.d(TAG, "convertSleep data=" + aggregateData);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AggregateFitnessData> convertSpo2(Map<HomeDataType, ? extends List<? extends DailyBasicReport>> dataMap) {
        List<? extends DailyBasicReport> list = dataMap.get(HomeDataType.SPO2);
        List<? extends DailyBasicReport> list2 = list instanceof List ? list : null;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            DailySpo2Report dailySpo2Report = (DailySpo2Report) it.next();
            int maxSpo2 = dailySpo2Report.getMaxSpo2();
            Long timeInZero = dailySpo2Report.getTimeInZero();
            if (maxSpo2 > 0 && DataCloudUtilKt.isInvalidTime(timeInZero)) {
                AggregateFitnessData aggregateData = INSTANCE.getAggregateData(timeInZero, FitnessPersistUtils.INSTANCE.toJson(new CloudSpo2Report(maxSpo2, dailySpo2Report.getMinSpo2(), dailySpo2Report.getAvgSpo2(), dailySpo2Report.getLackTimes(), dailySpo2Report.getLatestSpoRecord())), HomeDataType.SPO2, dailySpo2Report.getSid());
                arrayList.add(aggregateData);
                FitnessLogUtils.d(TAG, "convertSpo2 data=" + aggregateData);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AggregateFitnessData> convertSteps(Map<HomeDataType, ? extends List<? extends DailyBasicReport>> dataMap) {
        List<? extends DailyBasicReport> list = dataMap.get(HomeDataType.STEP);
        List<? extends DailyBasicReport> list2 = list instanceof List ? list : null;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            DailyStepReport dailyStepReport = (DailyStepReport) it.next();
            int steps = dailyStepReport.getSteps();
            Long timeInZero = dailyStepReport.getTimeInZero();
            if (steps > 0 && DataCloudUtilKt.isInvalidTime(timeInZero)) {
                AggregateFitnessData aggregateData = INSTANCE.getAggregateData(timeInZero, FitnessPersistUtils.INSTANCE.toJson(new CloudStepReport(steps, dailyStepReport.getDistance(), dailyStepReport.getCalories())), HomeDataType.STEP, dailyStepReport.getSid());
                arrayList.add(aggregateData);
                FitnessLogUtils.d(TAG, "convertSteps data=" + aggregateData);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AggregateFitnessData> convertStress(Map<HomeDataType, ? extends List<? extends DailyBasicReport>> dataMap) {
        List<? extends DailyBasicReport> list = dataMap.get(HomeDataType.STRESS);
        List<? extends DailyBasicReport> list2 = list instanceof List ? list : null;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            DailyStressReport dailyStressReport = (DailyStressReport) it.next();
            int maxStress = dailyStressReport.getMaxStress();
            Long timeInZero = dailyStressReport.getTimeInZero();
            if (maxStress > 0 && DataCloudUtilKt.isInvalidTime(timeInZero)) {
                AggregateFitnessData aggregateData = INSTANCE.getAggregateData(timeInZero, FitnessPersistUtils.INSTANCE.toJson(new CloudStressReport(dailyStressReport.getAvgStress(), maxStress, dailyStressReport.getMinStress(), new StressScaleItem(dailyStressReport.getDurationRelaxStress(), dailyStressReport.getDurationLightStress(), dailyStressReport.getDurationMediumStress(), dailyStressReport.getDurationHeavyStress()))), HomeDataType.STRESS, dailyStressReport.getSid());
                arrayList.add(aggregateData);
                FitnessLogUtils.d(TAG, "convertStress data=" + aggregateData);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AggregateFitnessData> convertValidStand(Map<HomeDataType, ? extends List<? extends DailyBasicReport>> dataMap) {
        List<? extends DailyBasicReport> list = dataMap.get(HomeDataType.VALID_STAND);
        List<? extends DailyBasicReport> list2 = list instanceof List ? list : null;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            DailyStandReport dailyStandReport = (DailyStandReport) it.next();
            int standCount = dailyStandReport.getStandCount();
            Long timeInZero = dailyStandReport.getTimeInZero();
            if (standCount > 0 && DataCloudUtilKt.isInvalidTime(timeInZero)) {
                AggregateFitnessData aggregateData = INSTANCE.getAggregateData(timeInZero, FitnessPersistUtils.INSTANCE.toJson(new CloudStandReport(standCount)), HomeDataType.VALID_STAND, dailyStandReport.getSid());
                arrayList.add(aggregateData);
                FitnessLogUtils.d(TAG, "convertValidStand data=" + aggregateData);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fitnessDailyDataUpCloud$lambda$1(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        it.printStackTrace();
        Unit unit = Unit.INSTANCE;
        FitnessLogUtils.e(TAG, "fitnessDailyDataUpCloud exception**" + unit);
        pushCount.getAndDecrement();
        return unit;
    }

    private final AggregateFitnessData getAggregateData(Long time, String value, HomeDataType type, String sid) {
        return new AggregateFitnessData(DataCloudUtilKt.getRequestTag(type), CloudKey.INSTANCE.getCloudRequestKey(type), time != null ? time.longValue() : 0L, value, 0, sid, null, 64, null);
    }

    public static /* synthetic */ AggregateFitnessData getAggregateData$default(CloudDailyHelper cloudDailyHelper, Long l, String str, HomeDataType homeDataType, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return cloudDailyHelper.getAggregateData(l, str, homeDataType, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FitnessDataRequest getMFitnessRequest() {
        return (FitnessDataRequest) mFitnessRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRequest mFitnessRequest_delegate$lambda$0() {
        return new FitnessDataRequest();
    }

    public final void fitnessDailyDataUpCloud() {
        if (!DataCloudUtilKt.isEnable()) {
            FitnessLogUtils.i(TAG, "fitnessDailyDataUpCloud abort due to cloud sync switch close");
        } else {
            if (pushCount.get() > 0) {
                return;
            }
            pushCount.getAndIncrement();
            ScopeExtKt.scopeNet(Dispatchers.getIO(), new AnonymousClass1(null)).m503catch(new Function2() { // from class: e24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CloudDailyHelper.fitnessDailyDataUpCloud$lambda$1((AndroidScope) obj, (Throwable) obj2);
                }
            });
        }
    }
}
