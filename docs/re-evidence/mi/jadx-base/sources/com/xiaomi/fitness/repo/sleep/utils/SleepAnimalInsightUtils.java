package com.xiaomi.fitness.repo.sleep.utils;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalInsightReport;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fit.fitness.persist.server.data.FitnessRequestParamKt;
import com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy;
import com.xiaomi.fitness.repo.sleep.SleepSegmentExtKt;
import com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils;
import com.xiaomi.fitness.repo.stress.StressBiz;
import defpackage.gmf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\u000bJ(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\b0\u000eH\u0002J4\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\b0\u00072\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\b0\u000eH\u0002J4\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\b0\u00072\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\b0\u000eH\u0002J\u001c\u0010\u0015\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\bH\u0002J\"\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\b0\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002J4\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\b0\u000e2\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\b0\u000eH\u0002J(\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\bH\u0002J(\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/repo/sleep/utils/SleepAnimalInsightUtils;", "", "<init>", "()V", "TAG", "", "getInsightReport", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalInsightReport;", "animalReport", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "getSleepIndicatorLiveData", "sleepReportFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "getStrengthIndicatorLiveData", "", "bedTimeFlow", "getStressIndicatorLiveData", "computeSleepIndicator", "sleepMap", "getSampleSleepReportFlow", "getSampleSleepBedTime", "computeStressIndicator", "bedTimeMap", "computeStrengthIndicator", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepAnimalInsightUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAnimalInsightUtils.kt\ncom/xiaomi/fitness/repo/sleep/utils/SleepAnimalInsightUtils\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n53#2:188\n55#2:192\n53#2:193\n55#2:197\n53#2:198\n55#2:202\n53#2:207\n55#2:211\n53#2:212\n55#2:216\n50#3:189\n55#3:191\n50#3:194\n55#3:196\n50#3:199\n55#3:201\n50#3:208\n55#3:210\n50#3:213\n55#3:215\n107#4:190\n107#4:195\n107#4:200\n107#4:209\n107#4:214\n216#5:203\n217#5:206\n216#5:217\n217#5:220\n216#5:221\n217#5:224\n1863#6,2:204\n1863#6,2:218\n1863#6,2:222\n*S KotlinDebug\n*F\n+ 1 SleepAnimalInsightUtils.kt\ncom/xiaomi/fitness/repo/sleep/utils/SleepAnimalInsightUtils\n*L\n65#1:188\n65#1:192\n72#1:193\n72#1:197\n79#1:198\n79#1:202\n114#1:207\n114#1:211\n124#1:212\n124#1:216\n65#1:189\n65#1:191\n72#1:194\n72#1:196\n79#1:199\n79#1:201\n114#1:208\n114#1:210\n124#1:213\n124#1:215\n65#1:190\n72#1:195\n79#1:200\n114#1:209\n124#1:214\n90#1:203\n90#1:206\n143#1:217\n143#1:220\n172#1:221\n172#1:224\n95#1:204,2\n157#1:218,2\n180#1:222,2\n*E\n"})
public final class SleepAnimalInsightUtils {

    @NotNull
    public static final SleepAnimalInsightUtils INSTANCE = new SleepAnimalInsightUtils();

    @NotNull
    private static final String TAG = "SleepAnimalInsightUtils";

    private SleepAnimalInsightUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepAnimalInsightReport computeSleepIndicator(Map<Long, AllDaySleepReport> sleepMap) {
        SleepAnimalInsightReport sleepAnimalInsightReport = new SleepAnimalInsightReport(null, null, null, null, null, 31, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry<Long, AllDaySleepReport> entry : sleepMap.entrySet()) {
            List<SleepSegmentReport> sleepSegments = entry.getValue().getSleepSegments();
            List<SleepSegmentReport> list = sleepSegments;
            if (list != null && !list.isEmpty()) {
                List<SleepSegmentReport> listFilterLongSleepBedBetween20to7 = SleepSegmentExtKt.filterLongSleepBedBetween20to7(sleepSegments, entry.getValue().getTime());
                ArrayList arrayList = new ArrayList();
                for (SleepSegmentReport sleepSegmentReport : listFilterLongSleepBedBetween20to7) {
                    arrayList.add(new Pair(Long.valueOf(sleepSegmentReport.getBedTime()), Long.valueOf(sleepSegmentReport.getWakeupTime())));
                }
                linkedHashMap.put(entry.getKey(), arrayList);
                linkedHashMap2.put(entry.getKey(), Integer.valueOf(SleepSegmentExtKt.sumWakeCount(listFilterLongSleepBedBetween20to7)));
                linkedHashMap3.put(entry.getKey(), Integer.valueOf(SleepSegmentExtKt.sumSleepDuration(SleepSegmentExtKt.filterNapBedBetween7to20(sleepSegments, entry.getValue().getTime()))));
            }
        }
        sleepAnimalInsightReport.setScheduleMap(linkedHashMap);
        sleepAnimalInsightReport.setAwakeCountMap(linkedHashMap2);
        sleepAnimalInsightReport.setNapMap(linkedHashMap3);
        return sleepAnimalInsightReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Long, Integer> computeStrengthIndicator(Map<Long, Long> bedTimeMap) {
        long seconds = TimeUnit.HOURS.toSeconds(2L);
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Long, Long> entry : bedTimeMap.entrySet()) {
            long jLongValue = entry.getValue().longValue();
            List<DailyRecordItem> list = DailyRecordDaoUtils.INSTANCE.getTheDailyItems(null, jLongValue - seconds, jLongValue, currentTZOffsetInSec, "intensity").get("intensity");
            List<DailyRecordItem> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(Long.valueOf(((DailyRecordItem) it.next()).getTimestamp()));
                }
                linkedHashMap.put(entry.getKey(), Integer.valueOf(linkedHashSet.size()));
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Long, Integer> computeStressIndicator(Map<Long, Long> bedTimeMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        StressBiz stressBiz = new StressBiz();
        for (Map.Entry<Long, Long> entry : bedTimeMap.entrySet()) {
            long jLongValue = entry.getKey().longValue() - FitnessRequestParamKt.getONE_DAY_TIME_IN_SEC();
            if (entry.getValue().longValue() < entry.getKey().longValue()) {
                linkedHashMap.put(entry.getKey(), Integer.valueOf(stressBiz.splitDailyReport((String) null, "home", jLongValue, (Map<String, ? extends List<? extends DailyRecordItem>>) DailyRecordDaoUtils.INSTANCE.getAllDailyRecord(HomeDataType.STRESS, null, jLongValue, entry.getValue().longValue(), currentTZOffsetInSec)).getAvgStress()));
            } else {
                long time = 0;
                for (DailyStressReport dailyStressReport : FitnessDailyReportDaoProxy.INSTANCE.queryDailyReportListSync(HomeDataType.STRESS, jLongValue, entry.getKey().longValue())) {
                    StressItem latestStressRecord = dailyStressReport.getLatestStressRecord();
                    if ((latestStressRecord != null ? latestStressRecord.getTime() : 0L) > time) {
                        StressItem latestStressRecord2 = dailyStressReport.getLatestStressRecord();
                        time = latestStressRecord2 != null ? latestStressRecord2.getTime() : 0L;
                        linkedHashMap.put(entry.getKey(), Integer.valueOf(dailyStressReport.getAvgStress()));
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getInsightReport$lambda$0(gmf mediatorLiveData, SleepAnimalInsightReport sleepAnimalInsightReport) {
        Intrinsics.checkNotNullParameter(mediatorLiveData, "$mediatorLiveData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sleep_indicator", sleepAnimalInsightReport);
        mediatorLiveData.setValue(linkedHashMap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getInsightReport$lambda$1(gmf mediatorLiveData, Map map) {
        Intrinsics.checkNotNullParameter(mediatorLiveData, "$mediatorLiveData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SleepAnimalInsightReport sleepAnimalInsightReport = new SleepAnimalInsightReport(null, null, null, null, null, 31, null);
        sleepAnimalInsightReport.setStressMap(map);
        linkedHashMap.put("stress_indicator", sleepAnimalInsightReport);
        mediatorLiveData.setValue(linkedHashMap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getInsightReport$lambda$2(gmf mediatorLiveData, Map map) {
        Intrinsics.checkNotNullParameter(mediatorLiveData, "$mediatorLiveData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SleepAnimalInsightReport sleepAnimalInsightReport = new SleepAnimalInsightReport(null, null, null, null, null, 31, null);
        sleepAnimalInsightReport.setStrengthMap(map);
        linkedHashMap.put("strength_indicator", sleepAnimalInsightReport);
        mediatorLiveData.setValue(linkedHashMap);
        return Unit.INSTANCE;
    }

    private final Flow<Map<Long, Long>> getSampleSleepBedTime(final Flow<? extends Map<Long, AllDaySleepReport>> sleepReportFlow) {
        return new Flow<Map<Long, Long>>() { // from class: com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getSampleSleepBedTime$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getSampleSleepBedTime$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SleepAnimalInsightUtils.kt\ncom/xiaomi/fitness/repo/sleep/utils/SleepAnimalInsightUtils\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,222:1\n54#2:223\n125#3,2:224\n127#3,8:227\n135#3:236\n216#4:226\n217#4:235\n*S KotlinDebug\n*F\n+ 1 SleepAnimalInsightUtils.kt\ncom/xiaomi/fitness/repo/sleep/utils/SleepAnimalInsightUtils\n*L\n126#1:226\n126#1:235\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getSampleSleepBedTime$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getSampleSleepBedTime$$inlined$map$1$2", f = "SleepAnimalInsightUtils.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            List<SleepSegmentReport> sleepSegments = ((AllDaySleepReport) entry.getValue()).getSleepSegments();
                            List<SleepSegmentReport> list = sleepSegments;
                            if (list != null && !list.isEmpty()) {
                                List<SleepSegmentReport> listFilterLongSleepBedBetween20to7 = SleepSegmentExtKt.filterLongSleepBedBetween20to7(sleepSegments, ((AllDaySleepReport) entry.getValue()).getTime());
                                if (!listFilterLongSleepBedBetween20to7.isEmpty()) {
                                    linkedHashMap.put(entry.getKey(), Boxing.boxLong(((SleepSegmentReport) CollectionsKt___CollectionsKt.sorted(listFilterLongSleepBedBetween20to7).get(0)).getBedTime()));
                                }
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Map<Long, Long>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = sleepReportFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    private final Flow<Map<Long, AllDaySleepReport>> getSampleSleepReportFlow(SleepAnimalReport animalReport) {
        final Flow flowQueryDailyReportList = FitnessDailyReportDaoProxy.INSTANCE.queryDailyReportList(HomeDataType.SLEEP, animalReport.getSampleDates(), FitnessDateUtils.getCurrentTZOffsetInSec());
        return new Flow<Map<Long, AllDaySleepReport>>() { // from class: com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getSampleSleepReportFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getSampleSleepReportFlow$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SleepAnimalInsightUtils.kt\ncom/xiaomi/fitness/repo/sleep/utils/SleepAnimalInsightUtils\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n54#2:223\n115#3,2:224\n117#3,2:227\n119#3:230\n1863#4:226\n1864#4:229\n*S KotlinDebug\n*F\n+ 1 SleepAnimalInsightUtils.kt\ncom/xiaomi/fitness/repo/sleep/utils/SleepAnimalInsightUtils\n*L\n116#1:226\n116#1:229\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getSampleSleepReportFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getSampleSleepReportFlow$$inlined$map$1$2", f = "SleepAnimalInsightUtils.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (AllDaySleepReport allDaySleepReport : (List) obj) {
                            linkedHashMap.put(Boxing.boxLong(allDaySleepReport.getTime()), allDaySleepReport);
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Map<Long, AllDaySleepReport>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowQueryDailyReportList.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    private final LiveData<SleepAnimalInsightReport> getSleepIndicatorLiveData(final Flow<? extends Map<Long, AllDaySleepReport>> sleepReportFlow) {
        return FlowLiveDataConversions.asLiveData$default(new Flow<SleepAnimalInsightReport>() { // from class: com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getSleepIndicatorLiveData$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getSleepIndicatorLiveData$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SleepAnimalInsightUtils.kt\ncom/xiaomi/fitness/repo/sleep/utils/SleepAnimalInsightUtils\n*L\n1#1,222:1\n54#2:223\n66#3,2:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getSleepIndicatorLiveData$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getSleepIndicatorLiveData$$inlined$map$1$2", f = "SleepAnimalInsightUtils.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        FitnessLogUtils.i("SleepAnimalInsightUtils", "getSleepIndicatorLiveData: computeSleepIndicator");
                        SleepAnimalInsightReport sleepAnimalInsightReportComputeSleepIndicator = SleepAnimalInsightUtils.INSTANCE.computeSleepIndicator((Map) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(sleepAnimalInsightReportComputeSleepIndicator, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super SleepAnimalInsightReport> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = sleepReportFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO(), 0L, 2, (Object) null);
    }

    private final LiveData<Map<Long, Integer>> getStrengthIndicatorLiveData(final Flow<? extends Map<Long, Long>> bedTimeFlow) {
        return FlowLiveDataConversions.asLiveData$default(new Flow<Map<Long, ? extends Integer>>() { // from class: com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getStrengthIndicatorLiveData$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getStrengthIndicatorLiveData$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SleepAnimalInsightUtils.kt\ncom/xiaomi/fitness/repo/sleep/utils/SleepAnimalInsightUtils\n*L\n1#1,222:1\n54#2:223\n73#3,2:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getStrengthIndicatorLiveData$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getStrengthIndicatorLiveData$$inlined$map$1$2", f = "SleepAnimalInsightUtils.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        FitnessLogUtils.i("SleepAnimalInsightUtils", "getStrengthIndicatorLiveData: computeStrengthIndicator");
                        Map mapComputeStrengthIndicator = SleepAnimalInsightUtils.INSTANCE.computeStrengthIndicator((Map) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(mapComputeStrengthIndicator, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Map<Long, ? extends Integer>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = bedTimeFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO(), 0L, 2, (Object) null);
    }

    private final LiveData<Map<Long, Integer>> getStressIndicatorLiveData(final Flow<? extends Map<Long, Long>> bedTimeFlow) {
        return FlowLiveDataConversions.asLiveData$default(new Flow<Map<Long, ? extends Integer>>() { // from class: com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getStressIndicatorLiveData$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getStressIndicatorLiveData$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SleepAnimalInsightUtils.kt\ncom/xiaomi/fitness/repo/sleep/utils/SleepAnimalInsightUtils\n*L\n1#1,222:1\n54#2:223\n80#3,2:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getStressIndicatorLiveData$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils$getStressIndicatorLiveData$$inlined$map$1$2", f = "SleepAnimalInsightUtils.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        FitnessLogUtils.i("SleepAnimalInsightUtils", "getStressIndicatorLiveData: computeStressIndicator");
                        Map mapComputeStressIndicator = SleepAnimalInsightUtils.INSTANCE.computeStressIndicator((Map) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(mapComputeStressIndicator, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Map<Long, ? extends Integer>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = bedTimeFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO(), 0L, 2, (Object) null);
    }

    @NotNull
    public final LiveData<Map<String, SleepAnimalInsightReport>> getInsightReport(@NotNull SleepAnimalReport animalReport) {
        Intrinsics.checkNotNullParameter(animalReport, "animalReport");
        final gmf gmfVar = new gmf();
        if (animalReport.getAnimal() != null) {
            Flow<Map<Long, AllDaySleepReport>> sampleSleepReportFlow = getSampleSleepReportFlow(animalReport);
            gmfVar.addSource(getSleepIndicatorLiveData(sampleSleepReportFlow), new SleepAnimalInsightUtils$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lgm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepAnimalInsightUtils.getInsightReport$lambda$0(gmfVar, (SleepAnimalInsightReport) obj);
                }
            }));
            Flow<Map<Long, Long>> sampleSleepBedTime = getSampleSleepBedTime(sampleSleepReportFlow);
            gmfVar.addSource(getStressIndicatorLiveData(sampleSleepBedTime), new SleepAnimalInsightUtils$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mgm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepAnimalInsightUtils.getInsightReport$lambda$1(gmfVar, (Map) obj);
                }
            }));
            gmfVar.addSource(getStrengthIndicatorLiveData(sampleSleepBedTime), new SleepAnimalInsightUtils$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ngm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepAnimalInsightUtils.getInsightReport$lambda$2(gmfVar, (Map) obj);
                }
            }));
            return gmfVar;
        }
        FitnessLogUtils.w(TAG, "getInsightReport: no animal(" + animalReport + ")");
        gmfVar.setValue(MapsKt__MapsKt.emptyMap());
        return gmfVar;
    }
}
