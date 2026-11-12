package com.xiaomi.fitness.repo.sleep;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.daily.SleepAssistItemInfo;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudSleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudSleepSegment;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimedValue;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.DayNightSleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.FitnessDataParser;
import com.xiaomi.fit.fitness.parser.data.AllDaySleepParseData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.persist.server.data.RelativeDataModel;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fit.fitness.sleep.algo.MiDevSleepAlgo;
import com.xiaomi.fit.fitness.sleep.algo.stage.data.SleepRateArray;
import com.xiaomi.fit.fitness.sleep.algo.stage.data.SleepStageSummary;
import com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy;
import com.xiaomi.fitness.aggregation.health.dao.TimeZoneUtil;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.fitness.repo.sleep.SleepBiz;
import com.xiaomi.fitness.repo.sleep.utils.DayNightSleepConverter;
import com.xiaomi.fitness.repo.sleep.utils.DaySleepReportUtils;
import com.xiaomi.fitness.repo.sleep.utils.SleepAggregateUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J<\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00112\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019H\u0016J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019J&\u0010\u001e\u001a\u00020\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!H\u0002J\u001e\u0010\"\u001a\u00020#2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\b\b\u0002\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u001dJ*\u0010\"\u001a\u00020#2\u0006\u0010(\u001a\u00020\u001d2\b\b\u0002\u0010)\u001a\u00020%2\b\b\u0002\u0010$\u001a\u00020%H\u0082@¢\u0006\u0002\u0010*J&\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020-2\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020!H\u0082@¢\u0006\u0002\u0010/J0\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u001a2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020!H\u0002J4\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!080\u001a2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020!H\u0002J\u000e\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/repo/sleep/SleepBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "dbGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDbGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dbGetter$delegate", "Lkotlin/Lazy;", "convertServerAggregateReport", "time", "", CloudContract.COL_VIEW_TAG, "dataModel", "Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;", "splitDailyReport", "sid", "timestamp", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "convertToSleepSegmentList", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "computeDaySleepReport", "segSleepLists", "tzInSec", "", "getSleepSegAssistInfo", "", "getBreathRateInfo", "", "getSleepSnoreDecibelInfo", "segReport", "segSleep", "getSnoreInfo", "(Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fillBreathRateDetailIfNeed", "sleep", "Lcom/xiaomi/fit/fitness/parser/data/AllDaySleepParseData;", "offset", "(Lcom/xiaomi/fit/fitness/parser/data/AllDaySleepParseData;Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateHrOrSpo2OrBreathRate", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "sleepInfo", "Lcom/xiaomi/fit/data/common/data/daily/SleepAssistItemInfo;", "bedTime", "wakeupTime", CloudContract.COL_ZONE_OFFSET, "aggregateDetailHrOrSpo2", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimedValue;", "checkSleepDailyReportUpgrade", "allDaySleepReport", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepBiz.kt\ncom/xiaomi/fitness/repo/sleep/SleepBiz\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,433:1\n1863#2,2:434\n216#3,2:436\n216#3,2:438\n216#3,2:444\n216#3,2:446\n37#4:440\n36#4,3:441\n37#4:448\n36#4,3:449\n*S KotlinDebug\n*F\n+ 1 SleepBiz.kt\ncom/xiaomi/fitness/repo/sleep/SleepBiz\n*L\n55#1:434,2\n120#1:436,2\n132#1:438,2\n328#1:444,2\n345#1:446,2\n290#1:440\n290#1:441,3\n429#1:448\n429#1:449,3\n*E\n"})
public final class SleepBiz extends BaseProcessBiz<AllDaySleepReport> {

    @NotNull
    private final String TAG = "SleepBiz";

    /* JADX INFO: renamed from: dbGetter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dbGetter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fim
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepBiz.dbGetter_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.SleepBiz$fillBreathRateDetailIfNeed$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.SleepBiz", f = "SleepBiz.kt", i = {0, 0, 0}, l = {262}, m = "fillBreathRateDetailIfNeed", n = {"this", "segSleep", "offset"}, s = {"L$0", "L$1", "I$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepBiz.this.fillBreathRateDetailIfNeed(null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.SleepBiz$getSleepSegAssistInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.SleepBiz$getSleepSegAssistInfo$1", f = "SleepBiz.kt", i = {}, l = {171, 173}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $getBreathRateInfo;
        final /* synthetic */ List<SleepSegmentReport> $segSleepLists;
        Object L$0;
        int label;
        final /* synthetic */ SleepBiz this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28451(List<SleepSegmentReport> list, SleepBiz sleepBiz, boolean z, Continuation<? super C28451> continuation) {
            super(2, continuation);
            this.$segSleepLists = list;
            this.this$0 = sleepBiz;
            this.$getBreathRateInfo = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C28451(this.$segSleepLists, this.this$0, this.$getBreathRateInfo, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator<SleepSegmentReport> it;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    it = (Iterator) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            it = this.$segSleepLists.iterator();
            while (it.hasNext()) {
                SleepSegmentReport next = it.next();
                SleepBiz sleepBiz = this.this$0;
                boolean z = this.$getBreathRateInfo;
                this.L$0 = it;
                this.label = 1;
                if (SleepBiz.getSleepSegAssistInfo$default(sleepBiz, next, false, z, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.L$0 = null;
            this.label = 2;
            if (AwaitKt.joinAll(new Job[0], this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.SleepBiz$getSleepSegAssistInfo$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.SleepBiz", f = "SleepBiz.kt", i = {0, 0, 0, 0}, l = {209, 250}, m = "getSleepSegAssistInfo", n = {"this", "segSleep", "dataId", "getBreathRateInfo"}, s = {"L$0", "L$1", "L$2", "Z$0"})
    public static final class AnonymousClass2 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepBiz.this.getSleepSegAssistInfo(null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.SleepBiz$getSleepSnoreDecibelInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.SleepBiz$getSleepSnoreDecibelInfo$1", f = "SleepBiz.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SleepSegmentReport $segReport;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28461(SleepSegmentReport sleepSegmentReport, Continuation<? super C28461> continuation) {
            super(2, continuation);
            this.$segReport = sleepSegmentReport;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepBiz.this.new C28461(this.$segReport, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepBiz sleepBiz = SleepBiz.this;
                SleepSegmentReport sleepSegmentReport = this.$segReport;
                this.label = 1;
                if (SleepBiz.getSleepSegAssistInfo$default(sleepBiz, sleepSegmentReport, true, false, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final List<TimedValue<Integer>> aggregateDetailHrOrSpo2(SleepAssistItemInfo sleepInfo, long bedTime, long wakeupTime, int zoneOffset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        short count = sleepInfo.getCount();
        long firstRecordTime = sleepInfo.getFirstRecordTime() + ((long) zoneOffset);
        Number[] values = sleepInfo.getValues();
        short sampleUnit = sleepInfo.getSampleUnit();
        ArrayList arrayList = new ArrayList();
        if (sampleUnit == 0) {
            Logger.i("aggregateDetailHrOrSpo2Error", "sampleUnit " + ((int) sampleUnit));
            return arrayList;
        }
        for (int i = 0; i < count; i++) {
            long j = ((long) (sampleUnit * i)) + firstRecordTime;
            int iIntValue = values[i].intValue();
            if (j >= bedTime && iIntValue > 0) {
                if (j > wakeupTime) {
                    break;
                }
                linkedHashMap.put(Long.valueOf(j), Integer.valueOf(iIntValue));
            }
        }
        long progressionLastElement = ProgressionUtilKt.getProgressionLastElement(bedTime, wakeupTime, 60L);
        if (bedTime <= progressionLastElement) {
            long j2 = bedTime;
            while (true) {
                long j3 = sampleUnit;
                long j4 = (j3 * ((j2 - firstRecordTime) / j3)) + firstRecordTime;
                Integer num = (Integer) linkedHashMap.get(Long.valueOf(j4));
                arrayList.add((j4 > j2 || j2 > j4 + 60) ? new TimedValue(j2, 0) : new TimedValue(j2, Integer.valueOf(num != null ? num.intValue() : 0)));
                if (j2 == progressionLastElement) {
                    break;
                }
                j2 += 60;
            }
        }
        if (arrayList.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "no valid record(" + sleepInfo + ")");
            return arrayList;
        }
        FitnessLogUtils.d(getTAG(), "sleep assist info(" + CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, null, 0, null, null, 60, null) + ")");
        return arrayList;
    }

    private final List<TimesDataRecordInt> aggregateHrOrSpo2OrBreathRate(SleepAssistItemInfo sleepInfo, long bedTime, long wakeupTime, int zoneOffset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        short count = sleepInfo.getCount();
        long firstRecordTime = sleepInfo.getFirstRecordTime() + ((long) zoneOffset);
        Number[] values = sleepInfo.getValues();
        short sampleUnit = sleepInfo.getSampleUnit();
        for (int i = 0; i < count; i++) {
            long j = ((long) (sampleUnit * i)) + firstRecordTime;
            int iIntValue = values[i].intValue();
            if (j >= bedTime && iIntValue > 0) {
                if (j > wakeupTime) {
                    break;
                }
                linkedHashMap.put(Long.valueOf(j), Integer.valueOf(iIntValue));
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long j2 = 1800;
            long jLongValue = (((((Number) entry.getKey()).longValue() - bedTime) / j2) * j2) + bedTime;
            List arrayList = (List) linkedHashMap2.get(Long.valueOf(jLongValue));
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap2.put(Long.valueOf(jLongValue), arrayList);
            }
            if (!arrayList.contains(entry.getValue())) {
                arrayList.add(entry.getValue());
            }
        }
        if (linkedHashMap2.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "no valid record(" + sleepInfo + ")");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            arrayList2.add(new TimesDataRecordInt(((Number) entry2.getKey()).longValue(), CollectionsKt___CollectionsKt.toIntArray((Collection) entry2.getValue())));
        }
        FitnessLogUtils.d(getTAG(), "sleep assist info(" + CollectionsKt___CollectionsKt.joinToString$default(arrayList2, ",", PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, null, 0, null, null, 60, null) + ")");
        return arrayList2;
    }

    private final AllDaySleepReport computeDaySleepReport(List<SleepSegmentReport> segSleepLists, long time, int tzInSec) {
        return DaySleepReportUtils.INSTANCE.computeDaySleepReport(SleepAggregateUtils.INSTANCE.aggregateDaySleep(segSleepLists), time, tzInSec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataGetter dbGetter_delegate$lambda$0() {
        return FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object fillBreathRateDetailIfNeed(AllDaySleepParseData allDaySleepParseData, SleepSegmentReport sleepSegmentReport, int i, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        SleepSegmentReport sleepSegmentReport2;
        int i2;
        SleepBiz sleepBiz;
        SleepSegmentReport sleepSegmentReport3;
        int i3;
        List list;
        int i4;
        SleepBiz sleepBiz2;
        List list2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i5 = anonymousClass1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i5 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object sleep = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = anonymousClass1.label;
        if (i6 == 0) {
            ResultKt.throwOnFailure(sleep);
            try {
                MiDevSleepAlgo companion = MiDevSleepAlgo.INSTANCE.getInstance();
                byte[] sleepSrcBytes = allDaySleepParseData.getSleepSrcBytes();
                Intrinsics.checkNotNull(sleepSrcBytes);
                anonymousClass1.L$0 = this;
                sleepSegmentReport2 = sleepSegmentReport;
                try {
                    anonymousClass1.L$1 = sleepSegmentReport2;
                    i2 = i;
                    try {
                        anonymousClass1.I$0 = i2;
                        anonymousClass1.label = 1;
                        sleep = companion.parseSleep(sleepSrcBytes, anonymousClass1);
                        if (sleep == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sleepBiz = this;
                        sleepSegmentReport3 = sleepSegmentReport2;
                        i3 = i2;
                    } catch (Throwable th) {
                        th = th;
                        sleepBiz = this;
                        FitnessLogUtils.e(sleepBiz.getTAG(), "getSleepSegAssistInfo parse breathRate exception", th);
                        list = null;
                        sleepSegmentReport3 = sleepSegmentReport2;
                        i4 = i2;
                        sleepBiz2 = sleepBiz;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i2 = i;
                    sleepBiz = this;
                    FitnessLogUtils.e(sleepBiz.getTAG(), "getSleepSegAssistInfo parse breathRate exception", th);
                    list = null;
                    sleepSegmentReport3 = sleepSegmentReport2;
                    i4 = i2;
                    sleepBiz2 = sleepBiz;
                    FitnessLogUtils.i(sleepBiz2.getTAG(), "getSleepSegAssistInfo parse breathRate sleepList " + list);
                    list2 = list;
                    if (list2 != null) {
                    }
                    return Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                th = th3;
                sleepSegmentReport2 = sleepSegmentReport;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = anonymousClass1.I$0;
            sleepSegmentReport3 = (SleepSegmentReport) anonymousClass1.L$1;
            sleepBiz = (SleepBiz) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(sleep);
            } catch (Throwable th4) {
                th = th4;
                i2 = i3;
                sleepSegmentReport2 = sleepSegmentReport3;
                FitnessLogUtils.e(sleepBiz.getTAG(), "getSleepSegAssistInfo parse breathRate exception", th);
                list = null;
                sleepSegmentReport3 = sleepSegmentReport2;
                i4 = i2;
                sleepBiz2 = sleepBiz;
            }
        }
        list = (List) sleep;
        sleepBiz2 = sleepBiz;
        i4 = i3;
        FitnessLogUtils.i(sleepBiz2.getTAG(), "getSleepSegAssistInfo parse breathRate sleepList " + list);
        list2 = list;
        if (list2 != null || list2.isEmpty()) {
            return Unit.INSTANCE;
        }
        SleepRateArray sleepRateArray = ((SleepStageSummary) list.get(0)).breathRateArray;
        byte[] bArr = sleepRateArray != null ? sleepRateArray.valueArray : null;
        FitnessLogUtils.i(sleepBiz2.getTAG(), "getSleepSegAssistInfo breathRate " + sleepRateArray);
        if (sleepRateArray != null && sleepRateArray.count > 0 && sleepRateArray.bedTimeSecond > 0 && bArr != null) {
            if (!(bArr.length == 0)) {
                ArrayList arrayList = new ArrayList();
                int i7 = sleepRateArray.count;
                int i8 = 0;
                while (i8 < i7) {
                    arrayList.add(Boxing.boxInt((i8 < 0 || i8 >= bArr.length) ? (byte) 0 : bArr[i8]));
                    i8++;
                }
                SleepAssistItemInfo sleepAssistItemInfo = new SleepAssistItemInfo(sleepRateArray.bedTimeSecond, (short) 60, (short) sleepRateArray.count, (Number[]) arrayList.toArray(new Number[0]));
                FitnessLogUtils.i(sleepBiz2.getTAG(), "allDaySleep src breath rate (" + sleepAssistItemInfo + ")");
                sleepSegmentReport3.setBreathRateRecords(sleepBiz2.aggregateHrOrSpo2OrBreathRate(sleepAssistItemInfo, sleepSegmentReport3.getBedTime(), sleepSegmentReport3.getWakeupTime(), i4));
            }
        }
        return Unit.INSTANCE;
    }

    private final FitnessDataGetter getDbGetter() {
        return (FitnessDataGetter) this.dbGetter.getValue();
    }

    public static /* synthetic */ void getSleepSegAssistInfo$default(SleepBiz sleepBiz, List list, boolean z, int i, Object obj) throws InterruptedException {
        if ((i & 2) != 0) {
            z = false;
        }
        sleepBiz.getSleepSegAssistInfo(list, z);
    }

    public final void checkSleepDailyReportUpgrade(@NotNull AllDaySleepReport allDaySleepReport) {
        Intrinsics.checkNotNullParameter(allDaySleepReport, "allDaySleepReport");
        Integer scoreOutperformedPercent = allDaySleepReport.getScoreOutperformedPercent();
        FitnessLogUtils.i(getTAG(), "checkSleepDailyReportUpgrade " + allDaySleepReport.getTime() + ";" + FitnessDateUtils.getDateStr(allDaySleepReport.getTime()) + ";outperformedPercent=" + scoreOutperformedPercent + ";");
        List<SleepSegmentReport> sleepSegments = allDaySleepReport.getSleepSegments();
        if (sleepSegments == null || sleepSegments.isEmpty() || scoreOutperformedPercent != null) {
            return;
        }
        long jNormalizeTime = TimeZoneUtil.INSTANCE.normalizeTime(allDaySleepReport.getTime());
        long seconds = jNormalizeTime + TimeUnit.DAYS.toSeconds(1L);
        RepositoryManager companion = RepositoryManager.INSTANCE.getInstance();
        HomeDataType homeDataType = HomeDataType.SLEEP;
        Collection reportListForSummary = companion.getRepositoryByType(homeDataType).getReportListForSummary(null, "days", jNormalizeTime, seconds);
        FitnessLogUtils.i(getTAG(), "sleepSummaryUpgrade-reportListForSummary " + jNormalizeTime + " " + seconds + " result: " + reportListForSummary);
        FitnessDailyReportDaoProxy fitnessDailyReportDaoProxy = FitnessDailyReportDaoProxy.INSTANCE;
        DailyBasicReport[] dailyBasicReportArr = (DailyBasicReport[]) reportListForSummary.toArray(new DailyBasicReport[0]);
        fitnessDailyReportDaoProxy.insert(homeDataType, (DailyBasicReport[]) Arrays.copyOf(dailyBasicReportArr, dailyBasicReportArr.length));
    }

    @NotNull
    public final List<SleepSegmentReport> convertToSleepSegmentList(@NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry<String, ? extends List<? extends DailyRecordItem>> entry : itemMap.entrySet()) {
            String key = entry.getKey();
            int iHashCode = key.hashCode();
            if (iHashCode != -376109039) {
                if (iHashCode != 109522647) {
                    if (iHashCode == 1878059136 && key.equals(FitnessPersistKey.NightSleep)) {
                        List<? extends DailyRecordItem> value = entry.getValue();
                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.DayNightSleepReport>");
                        arrayList2.addAll(value);
                    }
                } else if (key.equals("sleep")) {
                    List<? extends DailyRecordItem> value2 = entry.getValue();
                    Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport>");
                    arrayList3.addAll(value2);
                }
            } else if (key.equals(FitnessPersistKey.DaytimeSleep)) {
                List<? extends DailyRecordItem> value3 = entry.getValue();
                Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.DayNightSleepReport>");
                arrayList.addAll(value3);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.addAll(DayNightSleepConverter.INSTANCE.convertDaytimeSleepReport((DayNightSleepReport) it.next()));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            SleepSegmentReport sleepSegmentReportConvertNightSleepReport = DayNightSleepConverter.INSTANCE.convertNightSleepReport((DayNightSleepReport) it2.next());
            if (sleepSegmentReportConvertNightSleepReport != null) {
                arrayList3.add(sleepSegmentReportConvertNightSleepReport);
            }
        }
        return arrayList3;
    }

    public final void getSleepSegAssistInfo(@NotNull List<SleepSegmentReport> segSleepLists, boolean getBreathRateInfo) throws InterruptedException {
        Intrinsics.checkNotNullParameter(segSleepLists, "segSleepLists");
        BuildersKt__BuildersKt.runBlocking$default(null, new C28451(segSleepLists, this, getBreathRateInfo, null), 1, null);
    }

    public final void getSleepSnoreDecibelInfo(@NotNull SleepSegmentReport segReport) {
        Intrinsics.checkNotNullParameter(segReport, "segReport");
        BuildersKt__BuildersKt.runBlocking$default(null, new C28461(segReport, null), 1, null);
    }

    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ AllDaySleepReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object getSleepSegAssistInfo(SleepSegmentReport sleepSegmentReport, boolean z, boolean z2, Continuation<? super Unit> continuation) {
        AnonymousClass2 anonymousClass2;
        FitnessDataId fitnessDataIdBuild;
        SleepSegmentReport sleepSegmentReport2;
        boolean z3;
        SleepBiz sleepBiz;
        if (continuation instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) continuation;
            int i = anonymousClass2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new AnonymousClass2(continuation);
            }
        } else {
            anonymousClass2 = new AnonymousClass2(continuation);
        }
        Object fDSStoreData = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z4 = anonymousClass2.Z$0;
                fitnessDataIdBuild = (FitnessDataId) anonymousClass2.L$2;
                SleepSegmentReport sleepSegmentReport3 = (SleepSegmentReport) anonymousClass2.L$1;
                SleepBiz sleepBiz2 = (SleepBiz) anonymousClass2.L$0;
                ResultKt.throwOnFailure(fDSStoreData);
                z3 = z4;
                sleepBiz = sleepBiz2;
                sleepSegmentReport2 = sleepSegmentReport3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(fDSStoreData);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(fDSStoreData);
        if (sleepSegmentReport.getVersion() != null) {
            Integer version = sleepSegmentReport.getVersion();
            Intrinsics.checkNotNull(version);
            if (version.intValue() > 0) {
                if (sleepSegmentReport.getSid() == null) {
                    FitnessLogUtils.i(getTAG(), "getSleepSegAssistInfo: sid is null, abort(" + z + ")");
                    return Unit.INSTANCE;
                }
                if (!z && !sleepSegmentReport.hasStageData()) {
                    FitnessLogUtils.i(getTAG(), "getSleepSegAssistInfo, not has stage(" + z + ")");
                    return Unit.INSTANCE;
                }
                FitnessDataId.Builder builderFileType = new FitnessDataId.Builder().timeStampInSec(sleepSegmentReport.getProtoTime() <= 0 ? sleepSegmentReport.getWakeupTime() : sleepSegmentReport.getProtoTime()).timeZoneIn15Min(sleepSegmentReport.getTzIn15Min()).dailyType(8).fileType(0);
                Integer version2 = sleepSegmentReport.getVersion();
                Intrinsics.checkNotNull(version2);
                fitnessDataIdBuild = builderFileType.version(version2.intValue()).build();
                FitnessDataGetter dbGetter = getDbGetter();
                String sid = sleepSegmentReport.getSid();
                Intrinsics.checkNotNull(sid);
                anonymousClass2.L$0 = this;
                sleepSegmentReport2 = sleepSegmentReport;
                anonymousClass2.L$1 = sleepSegmentReport2;
                anonymousClass2.L$2 = fitnessDataIdBuild;
                z3 = z2;
                anonymousClass2.Z$0 = z3;
                anonymousClass2.label = 1;
                fDSStoreData = dbGetter.getFDSStoreData(sid, fitnessDataIdBuild, anonymousClass2);
                if (fDSStoreData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sleepBiz = this;
            }
        }
        FitnessLogUtils.i(getTAG(), "getSleepSegAssistInfo: invalid version(" + z + ")");
        return Unit.INSTANCE;
        byte[] bArr = (byte[]) fDSStoreData;
        if (bArr == null || bArr.length == 0) {
            return Unit.INSTANCE;
        }
        FitnessParseResult dailyData = FitnessDataParser.INSTANCE.parseDailyData(bArr, 8, 0);
        if ((dailyData != null ? dailyData.getAllDaySleepReport() : null) == null) {
            FitnessLogUtils.i(sleepBiz.getTAG(), "getSleepSegAssistInfo: no sleep info");
            return Unit.INSTANCE;
        }
        AllDaySleepParseData allDaySleepReport = dailyData.getAllDaySleepReport();
        int tzOffsetInSec = fitnessDataIdBuild.getTzOffsetInSec() - FitnessDateUtils.getCurrentTZOffsetInSec();
        Intrinsics.checkNotNull(allDaySleepReport);
        if (allDaySleepReport.getHrInfo() != null) {
            FitnessLogUtils.i(sleepBiz.getTAG(), "allDaySleep src hr(" + allDaySleepReport.getHrInfo() + ")");
            SleepAssistItemInfo hrInfo = allDaySleepReport.getHrInfo();
            Intrinsics.checkNotNull(hrInfo);
            SleepBiz sleepBiz3 = sleepBiz;
            sleepSegmentReport2.setHrRecords(sleepBiz3.aggregateHrOrSpo2OrBreathRate(hrInfo, sleepSegmentReport2.getBedTime(), sleepSegmentReport2.getWakeupTime(), tzOffsetInSec));
            SleepAssistItemInfo hrInfo2 = allDaySleepReport.getHrInfo();
            Intrinsics.checkNotNull(hrInfo2);
            sleepSegmentReport2.setHrDetailRecords(sleepBiz3.aggregateDetailHrOrSpo2(hrInfo2, sleepSegmentReport2.getBedTime(), sleepSegmentReport2.getWakeupTime(), tzOffsetInSec));
        }
        if (allDaySleepReport.getSpo2Info() != null) {
            FitnessLogUtils.i(sleepBiz.getTAG(), "allDaySleep src spo2(" + allDaySleepReport.getSpo2Info() + ")");
            SleepAssistItemInfo spo2Info = allDaySleepReport.getSpo2Info();
            Intrinsics.checkNotNull(spo2Info);
            SleepBiz sleepBiz4 = sleepBiz;
            sleepSegmentReport2.setSpo2Records(sleepBiz4.aggregateHrOrSpo2OrBreathRate(spo2Info, sleepSegmentReport2.getBedTime(), sleepSegmentReport2.getWakeupTime(), tzOffsetInSec));
            SleepAssistItemInfo spo2Info2 = allDaySleepReport.getSpo2Info();
            Intrinsics.checkNotNull(spo2Info2);
            sleepSegmentReport2.setSpo2DetailRecords(sleepBiz4.aggregateDetailHrOrSpo2(spo2Info2, sleepSegmentReport2.getBedTime(), sleepSegmentReport2.getWakeupTime(), tzOffsetInSec));
        }
        if (allDaySleepReport.getSnoreDecibelInfo() != null) {
            SleepAssistItemInfo snoreDecibelInfo = allDaySleepReport.getSnoreDecibelInfo();
            sleepSegmentReport2.setSnoreRecordInfo(snoreDecibelInfo != null ? snoreDecibelInfo.computeVisibleSnoreDecibelArray(tzOffsetInSec) : null);
        }
        if (z3 && allDaySleepReport.getSleepSrcDataLen() > 0 && allDaySleepReport.getSleepSrcBytes() != null) {
            anonymousClass2.L$0 = null;
            anonymousClass2.L$1 = null;
            anonymousClass2.L$2 = null;
            anonymousClass2.label = 2;
            if (sleepBiz.fillBreathRateDetailIfNeed(allDaySleepReport, sleepSegmentReport2, tzOffsetInSec, anonymousClass2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        FitnessLogUtils.i(sleepBiz.getTAG(), "getSleepSegAssistInfo jump fill breath rate info enable:(" + z3 + ");length(" + allDaySleepReport.getSleepSrcDataLen() + ")");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object getSleepSegAssistInfo$default(SleepBiz sleepBiz, SleepSegmentReport sleepSegmentReport, boolean z, boolean z2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return sleepBiz.getSleepSegAssistInfo(sleepSegmentReport, z, z2, continuation);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public AllDaySleepReport convertServerAggregateReport(long time, @NotNull String viewTag, @Nullable RelativeDataModel dataModel) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        if (dataModel == null) {
            return new AllDaySleepReport(time, viewTag);
        }
        CloudSleepReport cloudSleepReport = (CloudSleepReport) FitnessPersistUtils.INSTANCE.fromJson(dataModel.getValue(), CloudSleepReport.class);
        if (cloudSleepReport == null) {
            return new AllDaySleepReport(time, viewTag);
        }
        ArrayList arrayList = new ArrayList();
        List<CloudSleepSegment> details = cloudSleepReport.getDetails();
        if (details != null) {
            for (CloudSleepSegment cloudSleepSegment : details) {
                SleepSegmentReport.Builder builderSleepDuration = new SleepSegmentReport.Builder().bedTime(cloudSleepSegment.getBedTime()).wakeupTime(cloudSleepSegment.getWakeTime()).tzOffsetIn15Min(Integer.valueOf(cloudSleepSegment.getTimeZone())).sleepDuration(cloudSleepSegment.getDuration());
                Integer deepDuration = cloudSleepSegment.getDeepDuration();
                SleepSegmentReport.Builder builderDeepSleepDuration = builderSleepDuration.deepSleepDuration(deepDuration != null ? deepDuration.intValue() : 0);
                Integer lightDuration = cloudSleepSegment.getLightDuration();
                SleepSegmentReport.Builder builderLightSleepDuration = builderDeepSleepDuration.lightSleepDuration(lightDuration != null ? lightDuration.intValue() : 0);
                Integer remDuration = cloudSleepSegment.getRemDuration();
                SleepSegmentReport.Builder builderRemDuration = builderLightSleepDuration.remDuration(remDuration != null ? remDuration.intValue() : 0);
                Integer wakeDuration = cloudSleepSegment.getWakeDuration();
                SleepSegmentReport.Builder builderWakeDuration = builderRemDuration.wakeDuration(wakeDuration != null ? wakeDuration.intValue() : 0);
                Integer wakeCount = cloudSleepSegment.getWakeCount();
                SleepSegmentReport.Builder builderWakeCount = builderWakeDuration.wakeCount(wakeCount != null ? wakeCount.intValue() : 0);
                if (cloudSleepReport.getAvgHr() != null) {
                    Integer avgHr = cloudSleepReport.getAvgHr();
                    int iIntValue = avgHr != null ? avgHr.intValue() : 0;
                    Integer maxHr = cloudSleepReport.getMaxHr();
                    int iIntValue2 = maxHr != null ? maxHr.intValue() : 0;
                    Integer minHr = cloudSleepReport.getMinHr();
                    builderWakeCount.hr(iIntValue, iIntValue2, minHr != null ? minHr.intValue() : 0);
                }
                if (cloudSleepReport.getAvgSpo2() != null) {
                    Integer avgSpo2 = cloudSleepReport.getAvgSpo2();
                    int iIntValue3 = avgSpo2 != null ? avgSpo2.intValue() : 0;
                    Integer maxSpo2 = cloudSleepReport.getMaxSpo2();
                    int iIntValue4 = maxSpo2 != null ? maxSpo2.intValue() : 0;
                    Integer minSpo2 = cloudSleepReport.getMinSpo2();
                    builderWakeCount.spo2(iIntValue3, iIntValue4, minSpo2 != null ? minSpo2.intValue() : 0);
                }
                arrayList.add(builderWakeCount.build());
            }
        }
        AllDaySleepReport allDaySleepReport = new AllDaySleepReport(time, viewTag);
        allDaySleepReport.setTotalDuration(cloudSleepReport.getTotalDuration());
        Integer sleepDeepDuration = cloudSleepReport.getSleepDeepDuration();
        allDaySleepReport.setDeepDuration(sleepDeepDuration != null ? sleepDeepDuration.intValue() : 0);
        Integer sleepLightDuration = cloudSleepReport.getSleepLightDuration();
        allDaySleepReport.setLightDuration(sleepLightDuration != null ? sleepLightDuration.intValue() : 0);
        allDaySleepReport.setAwakeDuration(cloudSleepReport.getSleepAwakeDuration());
        allDaySleepReport.setRemDuration(cloudSleepReport.getSleepRemDuration());
        Integer sleepStage = cloudSleepReport.getSleepStage();
        allDaySleepReport.setStage(sleepStage != null ? sleepStage.intValue() : 0);
        Integer sleepScore = cloudSleepReport.getSleepScore();
        allDaySleepReport.setScore(sleepScore != null ? sleepScore.intValue() : 0);
        Integer longSleepEvaluation = cloudSleepReport.getLongSleepEvaluation();
        allDaySleepReport.setLongSleepCommentCode(longSleepEvaluation != null ? longSleepEvaluation.intValue() : 0);
        Integer daySleepEvaluation = cloudSleepReport.getDaySleepEvaluation();
        allDaySleepReport.setCommentCode(daySleepEvaluation != null ? daySleepEvaluation.intValue() : 0);
        allDaySleepReport.setAvgHr(cloudSleepReport.getAvgHr());
        allDaySleepReport.setMaxHr(cloudSleepReport.getMaxHr());
        allDaySleepReport.setMinHr(cloudSleepReport.getMinHr());
        allDaySleepReport.setAvgSpo2(cloudSleepReport.getAvgSpo2());
        allDaySleepReport.setMaxSpo2(cloudSleepReport.getMaxSpo2());
        allDaySleepReport.setMinSpo2(cloudSleepReport.getMinSpo2());
        allDaySleepReport.setSleepSegments(arrayList);
        return allDaySleepReport;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public AllDaySleepReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        Logger.i(getTAG(), "splitDailyReport viewTag " + viewTag + " " + timestamp);
        if (itemMap.isEmpty()) {
            return new AllDaySleepReport(timestamp, viewTag);
        }
        List<SleepSegmentReport> listConvertToSleepSegmentList = convertToSleepSegmentList(itemMap);
        if (TextUtils.equals(viewTag, "days") || TextUtils.equals(viewTag, "home")) {
            return computeDaySleepReport(listConvertToSleepSegmentList, timestamp, TextUtils.equals(viewTag, "days") ? 0 : FitnessDateUtils.getCurrentTZOffsetInSec());
        }
        Map<Long, List<T>> mapGroupByDay = groupByDay(timestamp, listConvertToSleepSegmentList, null);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapGroupByDay.entrySet()) {
            arrayList.add(computeDaySleepReport((List) entry.getValue(), ((Number) entry.getKey()).longValue(), 0));
        }
        return DaySleepReportUtils.INSTANCE.computeWeeklySleepReport(arrayList, timestamp, viewTag);
    }
}
