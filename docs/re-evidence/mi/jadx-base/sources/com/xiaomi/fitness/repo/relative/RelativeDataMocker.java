package com.xiaomi.fitness.repo.relative;

import android.text.TextUtils;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyWeightReport;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.repo.relative.RelativeDataMocker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010J4\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u00100\u0012\"\b\b\u0000\u0010\u0013*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J.\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001eH\u0002J\"\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010 \u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/repo/relative/RelativeDataMocker;", "", "<init>", "()V", "random", "Lkotlin/random/Random;", "getRandom", "()Lkotlin/random/Random;", "random$delegate", "Lkotlin/Lazy;", "getHomeData", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "dataTypes", "", "getDetailData", "Lkotlinx/coroutines/flow/Flow;", "T", "homeType", "startTime", "", "endTime", "mockRainbowReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "time", "tag", "", "map", "", "mockHomeData", "dataType", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RelativeDataMocker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final RelativeDataMocker instance = new RelativeDataMocker();

    /* JADX INFO: renamed from: random$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy random = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ugk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RelativeDataMocker.random_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/repo/relative/RelativeDataMocker$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/repo/relative/RelativeDataMocker;", "getInstance", "()Lcom/xiaomi/fitness/repo/relative/RelativeDataMocker;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RelativeDataMocker getInstance() {
            return RelativeDataMocker.instance;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.HR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.SPO2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeDataType.STEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeDataType.CALORIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeDataType.VALID_STAND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomeDataType.MH_STRENGTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomeDataType.SLEEP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HomeDataType.BLOOD_PRESSURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HomeDataType.WEIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HomeDataType.RAINBOW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.relative.RelativeDataMocker$getDetailData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "T", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.relative.RelativeDataMocker$getDetailData$1", f = "RelativeDataMocker.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1<T> extends SuspendLambda implements Function2<FlowCollector<? super List<? extends T>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTime;
        final /* synthetic */ HomeDataType $homeType;
        final /* synthetic */ long $startTime;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RelativeDataMocker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, long j2, RelativeDataMocker relativeDataMocker, HomeDataType homeDataType, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$startTime = j;
            this.$endTime = j2;
            this.this$0 = relativeDataMocker;
            this.$homeType = homeDataType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$startTime, this.$endTime, this.this$0, this.$homeType, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                ArrayList arrayList = new ArrayList();
                for (long seconds = this.$startTime; seconds < this.$endTime; seconds += TimeUnit.DAYS.toSeconds(1L)) {
                    DailyBasicReport dailyBasicReportMockHomeData = this.this$0.mockHomeData(this.$homeType, seconds, "days");
                    if (dailyBasicReportMockHomeData != null) {
                        arrayList.add(dailyBasicReportMockHomeData);
                    }
                }
                this.label = 1;
                if (flowCollector.emit(arrayList, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super List<? extends T>> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.relative.RelativeDataMocker$getHomeData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.relative.RelativeDataMocker$getHomeData$1", f = "RelativeDataMocker.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRelativeDataMocker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeDataMocker.kt\ncom/xiaomi/fitness/repo/relative/RelativeDataMocker$getHomeData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n1863#2,2:179\n*S KotlinDebug\n*F\n+ 1 RelativeDataMocker.kt\ncom/xiaomi/fitness/repo/relative/RelativeDataMocker$getHomeData$1\n*L\n31#1:179,2\n*E\n"})
    public static final class C28401 extends SuspendLambda implements Function2<LiveDataScope<Map<HomeDataType, ? extends DailyBasicReport>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<HomeDataType> $dataTypes;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RelativeDataMocker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28401(List<? extends HomeDataType> list, RelativeDataMocker relativeDataMocker, Continuation<? super C28401> continuation) {
            super(2, continuation);
            this.$dataTypes = list;
            this.this$0 = relativeDataMocker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C28401 c28401 = new C28401(this.$dataTypes, this.this$0, continuation);
            c28401.L$0 = obj;
            return c28401;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<Map<HomeDataType, DailyBasicReport>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C28401) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                long todayZeroTimeInSec = FitnessDateUtils.getTodayZeroTimeInSec();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<HomeDataType> list = this.$dataTypes;
                RelativeDataMocker relativeDataMocker = this.this$0;
                for (HomeDataType homeDataType : list) {
                    DailyBasicReport dailyBasicReportMockHomeData = relativeDataMocker.mockHomeData(homeDataType, todayZeroTimeInSec, "home");
                    if (dailyBasicReportMockHomeData != null) {
                        linkedHashMap.put(homeDataType, dailyBasicReportMockHomeData);
                    }
                }
                linkedHashMap.put(HomeDataType.RAINBOW, this.this$0.mockRainbowReport(todayZeroTimeInSec, "home", linkedHashMap));
                this.label = 1;
                if (liveDataScope.emit(linkedHashMap, this) == coroutine_suspended) {
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
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<Map<HomeDataType, ? extends DailyBasicReport>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<Map<HomeDataType, DailyBasicReport>>) liveDataScope, continuation);
        }
    }

    private final Random getRandom() {
        return (Random) this.random.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DailyBasicReport mockHomeData(HomeDataType dataType, long time, String tag) {
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        switch (WhenMappings.$EnumSwitchMapping$0[dataType.ordinal()]) {
            case 1:
                DailyHrReport dailyHrReport = new DailyHrReport(time, tag);
                dailyHrReport.setLatestHrRecord(new HrItem(jCurrentTimeMillis, getRandom().nextInt(60, 150)));
                dailyHrReport.setRestHr(Integer.valueOf(getRandom().nextInt(50, 60)));
                dailyHrReport.setMinHr(getRandom().nextInt(70, 90));
                dailyHrReport.setMaxHr(getRandom().nextInt(150, 180));
                dailyHrReport.setAvgHr(getRandom().nextInt(150, 180));
                return dailyHrReport;
            case 2:
                DailySpo2Report dailySpo2Report = new DailySpo2Report(time, tag);
                dailySpo2Report.setLatestSpoRecord(new Spo2Item(jCurrentTimeMillis, getRandom().nextInt(90, 100)));
                dailySpo2Report.setMaxSpo2(getRandom().nextInt(98, 100));
                dailySpo2Report.setMinSpo2(getRandom().nextInt(90, 94));
                dailySpo2Report.setAvgSpo2(getRandom().nextInt(94, 98));
                return dailySpo2Report;
            case 3:
                return new DailyStepReport(time, tag, getRandom().nextInt(1000, 5000), getRandom().nextInt(600, 2000), getRandom().nextInt(50, 200), CollectionsKt__CollectionsKt.emptyList());
            case 4:
                return new DailyCalorieReport(time, tag, getRandom().nextInt(50, 200), CollectionsKt__CollectionsKt.emptyList());
            case 5:
                return new DailyStandReport(time, tag, CollectionsKt__CollectionsKt.emptyList(), getRandom().nextInt(1, 24));
            case 6:
                return new DailyMHStrengthReport(time, tag, CollectionsKt__CollectionsKt.emptyList(), getRandom().nextInt(10, 40));
            case 7:
                AllDaySleepReport allDaySleepReport = new AllDaySleepReport(time, tag);
                allDaySleepReport.setTotalDuration(getRandom().nextInt(400, 500));
                allDaySleepReport.setScore(getRandom().nextInt(60, 100));
                allDaySleepReport.setStage(getRandom().nextInt(1, 4));
                return allDaySleepReport;
            case 8:
                DailyBloodPressureReport dailyBloodPressureReport = new DailyBloodPressureReport(time, tag);
                dailyBloodPressureReport.setLatestRecord(new BloodPressureItem(time, getRandom().nextInt(100, 150), getRandom().nextInt(50, 100)));
                return dailyBloodPressureReport;
            case 9:
                DailyWeightReport dailyWeightReport = new DailyWeightReport(time, tag);
                WeightItem weightItem = new WeightItem(time, getRandom().nextInt(70, 120) / 1.0f, null, null, null, null, null, null, null, null, 1020, null);
                weightItem.setBmi(Float.valueOf(getRandom().nextInt(150, 300) / 10.0f));
                dailyWeightReport.setWeightRecordList(Collections.singletonList(weightItem));
                List<WeightItem> weightRecordList = dailyWeightReport.getWeightRecordList();
                dailyWeightReport.setPreDayWeightItem(weightRecordList != null ? weightRecordList.get(0) : null);
                return dailyWeightReport;
            case 10:
                if (TextUtils.equals(tag, "home")) {
                    return null;
                }
                return mockRainbowReport(time, tag, null);
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DailyGoalReport mockRainbowReport(long time, String tag, Map<HomeDataType, DailyBasicReport> map) {
        DailyBasicReport dailyBasicReportMockHomeData = map != null ? map.get(HomeDataType.STEP) : null;
        DailyBasicReport dailyBasicReportMockHomeData2 = map != null ? map.get(HomeDataType.CALORIE) : null;
        DailyBasicReport dailyBasicReportMockHomeData3 = map != null ? map.get(HomeDataType.VALID_STAND) : null;
        ArrayList arrayList = new ArrayList();
        if (dailyBasicReportMockHomeData == null) {
            dailyBasicReportMockHomeData = mockHomeData(HomeDataType.STEP, time, tag);
        }
        if (dailyBasicReportMockHomeData != null) {
            arrayList.add(new GoalItem(1, 6000, ((DailyStepReport) dailyBasicReportMockHomeData).getSteps()));
        }
        if (dailyBasicReportMockHomeData2 == null) {
            dailyBasicReportMockHomeData2 = mockHomeData(HomeDataType.CALORIE, time, tag);
        }
        if (dailyBasicReportMockHomeData2 != null) {
            arrayList.add(new GoalItem(2, 400, ((DailyCalorieReport) dailyBasicReportMockHomeData2).getCalories()));
        }
        if (dailyBasicReportMockHomeData3 == null) {
            dailyBasicReportMockHomeData3 = mockHomeData(HomeDataType.VALID_STAND, time, tag);
        }
        if (dailyBasicReportMockHomeData3 != null) {
            arrayList.add(new GoalItem(3, 12, ((DailyStandReport) dailyBasicReportMockHomeData3).getStandCount()));
        }
        return new DailyGoalReport(time, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Random random_delegate$lambda$0() {
        return RandomKt.Random(System.currentTimeMillis());
    }

    @NotNull
    public final <T extends DailyBasicReport> Flow<List<T>> getDetailData(@NotNull HomeDataType homeType, long startTime, long endTime) {
        Intrinsics.checkNotNullParameter(homeType, "homeType");
        return FlowKt.flow(new AnonymousClass1(startTime, endTime, this, homeType, null));
    }

    @NotNull
    public final LiveData<Map<HomeDataType, DailyBasicReport>> getHomeData(@NotNull List<? extends HomeDataType> dataTypes) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C28401(dataTypes, this, null), 3, (Object) null);
    }
}
