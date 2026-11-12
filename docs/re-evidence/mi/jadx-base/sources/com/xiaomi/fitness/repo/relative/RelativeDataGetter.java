package com.xiaomi.fitness.repo.relative;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.google.gson.Gson;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
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
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudCaloriesReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudHMStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudKey;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudSleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudSleepSegment;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudSpo2Report;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudStepReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.distribute.DailyHrDistribute;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.persist.dailyreport.utils.DataCloudUtilKt;
import com.xiaomi.fit.fitness.persist.server.FitnessDataRequest;
import com.xiaomi.fit.fitness.persist.server.data.GetDetailDataParam;
import com.xiaomi.fit.fitness.persist.server.data.GetRelativeDataResult;
import com.xiaomi.fit.fitness.persist.server.data.RelativeDataModel;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.relative.RelativeDataGetter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 22\u00020\u0001:\u00012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019JF\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001c0\u00190\u001b\"\b\b\u0000\u0010\u001c*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0014H\u0002J8\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00102\n\b\u0002\u0010,\u001a\u0004\u0018\u00010!H\u0082@¢\u0006\u0002\u0010-J*\u0010.\u001a\u0004\u0018\u00010\u00152\u0006\u0010#\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020!H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/repo/relative/RelativeDataGetter;", "", "<init>", "()V", "mGson", "Lcom/google/gson/Gson;", "getMGson", "()Lcom/google/gson/Gson;", "mGson$delegate", "Lkotlin/Lazy;", "request", "Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "getRequest", "()Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "request$delegate", "mockRelativeData", "", "getHomeData", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "relativeId", "", "dataTypes", "", "getFitnessReport", "Lkotlinx/coroutines/flow/Flow;", "T", "homeType", "startTime", "endTime", CloudContract.COL_VIEW_TAG, "", "isGetSourceData", "homeDataType", "getRelativeFitnessData", "", "resultList", "", "Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;", "param", "Lcom/xiaomi/fit/fitness/persist/server/data/GetDetailDataParam;", "isGetSrcData", "nextKey", "(Ljava/util/List;Lcom/xiaomi/fit/fitness/persist/server/data/GetDetailDataParam;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processRelativeFitnessData", "time", "tag", "value", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRelativeDataGetter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeDataGetter.kt\ncom/xiaomi/fitness/repo/relative/RelativeDataGetter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,284:1\n1863#2,2:285\n*S KotlinDebug\n*F\n+ 1 RelativeDataGetter.kt\ncom/xiaomi/fitness/repo/relative/RelativeDataGetter\n*L\n223#1:285,2\n*E\n"})
public final class RelativeDataGetter {

    @NotNull
    private static final String TAG = "RelativeDataGetter";
    private final boolean mockRelativeData;

    /* JADX INFO: renamed from: mGson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rgk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RelativeDataGetter.mGson_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: request$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy request = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sgk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RelativeDataGetter.request_delegate$lambda$1();
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.BLOOD_PRESSURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeDataType.WOMEN_HEALTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeDataType.HR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeDataType.SPO2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomeDataType.RAINBOW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomeDataType.STEP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HomeDataType.CALORIE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HomeDataType.VALID_STAND.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HomeDataType.MH_STRENGTH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HomeDataType.SLEEP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.relative.RelativeDataGetter$getFitnessReport$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "T", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.relative.RelativeDataGetter$getFitnessReport$1", f = "RelativeDataGetter.kt", i = {0, 0, 0, 1}, l = {98, 104, 107}, m = "invokeSuspend", n = {"$this$flow", "reportList", "cloudResultList", "$this$flow"}, s = {"L$0", "L$1", "L$2", "L$0"})
    @SourceDebugExtension({"SMAP\nRelativeDataGetter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeDataGetter.kt\ncom/xiaomi/fitness/repo/relative/RelativeDataGetter$getFitnessReport$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n1863#2:285\n1864#2:287\n1#3:286\n*S KotlinDebug\n*F\n+ 1 RelativeDataGetter.kt\ncom/xiaomi/fitness/repo/relative/RelativeDataGetter$getFitnessReport$1\n*L\n99#1:285\n99#1:287\n*E\n"})
    public static final class AnonymousClass1<T> extends SuspendLambda implements Function2<FlowCollector<? super List<? extends T>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ HomeDataType $homeType;
        final /* synthetic */ GetDetailDataParam $param;
        final /* synthetic */ int $tzOffset;
        final /* synthetic */ String $viewTag;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GetDetailDataParam getDetailDataParam, HomeDataType homeDataType, int i, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$param = getDetailDataParam;
            this.$homeType = homeDataType;
            this.$tzOffset = i;
            this.$viewTag = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = RelativeDataGetter.this.new AnonymousClass1(this.$param, this.$homeType, this.$tzOffset, this.$viewTag, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0091 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:11:0x0026, B:25:0x007d, B:26:0x008b, B:28:0x0091, B:30:0x00ac, B:32:0x00b2), top: B:42:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:30:0x00ac A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:11:0x0026, B:25:0x007d, B:26:0x008b, B:28:0x0091, B:30:0x00ac, B:32:0x00b2), top: B:42:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00c1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00de A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:49:0x00af A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List listEmptyList;
            List list;
            FlowCollector flowCollector;
            List<RelativeDataModel> list2;
            int i;
            RelativeDataGetter relativeDataGetter;
            HomeDataType homeDataType;
            String str;
            DailyBasicReport dailyBasicReportProcessRelativeFitnessData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            ?? r1 = 1;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                    try {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        RelativeDataGetter relativeDataGetter2 = RelativeDataGetter.this;
                        GetDetailDataParam getDetailDataParam = this.$param;
                        boolean zIsGetSourceData = relativeDataGetter2.isGetSourceData(this.$homeType);
                        this.L$0 = flowCollector2;
                        this.L$1 = arrayList;
                        this.L$2 = arrayList2;
                        this.label = 1;
                        if (RelativeDataGetter.getRelativeFitnessData$default(relativeDataGetter2, arrayList2, getDetailDataParam, zIsGetSourceData, null, this, 8, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list = arrayList;
                        flowCollector = flowCollector2;
                        list2 = arrayList2;
                        i = this.$tzOffset;
                        relativeDataGetter = RelativeDataGetter.this;
                        homeDataType = this.$homeType;
                        str = this.$viewTag;
                        for (RelativeDataModel relativeDataModel : list2) {
                            dailyBasicReportProcessRelativeFitnessData = relativeDataGetter.processRelativeFitnessData(homeDataType, relativeDataModel.getTime() - ((long) i), str, relativeDataModel.getValue());
                            if (dailyBasicReportProcessRelativeFitnessData != null) {
                                list.add(dailyBasicReportProcessRelativeFitnessData);
                            }
                        }
                        this.L$0 = flowCollector;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 2;
                        if (flowCollector.emit(list, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e) {
                        e = e;
                        r1 = flowCollector2;
                        FitnessLogUtils.e(RelativeDataGetter.TAG, "getDetailReport", e);
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        if (r1.emit(listEmptyList, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (i2 == 1) {
                    list2 = (List) this.L$2;
                    List list3 = (List) this.L$1;
                    FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        list = list3;
                        flowCollector = flowCollector3;
                        i = this.$tzOffset;
                        relativeDataGetter = RelativeDataGetter.this;
                        homeDataType = this.$homeType;
                        str = this.$viewTag;
                        while (r0.hasNext()) {
                            dailyBasicReportProcessRelativeFitnessData = relativeDataGetter.processRelativeFitnessData(homeDataType, relativeDataModel.getTime() - ((long) i), str, relativeDataModel.getValue());
                            if (dailyBasicReportProcessRelativeFitnessData != null) {
                                list.add(dailyBasicReportProcessRelativeFitnessData);
                            }
                        }
                        this.L$0 = flowCollector;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 2;
                        if (flowCollector.emit(list, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        r1 = flowCollector3;
                        FitnessLogUtils.e(RelativeDataGetter.TAG, "getDetailReport", e);
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        if (r1.emit(listEmptyList, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e3) {
                e = e3;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super List<? extends T>> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.relative.RelativeDataGetter$getHomeData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.relative.RelativeDataGetter$getHomeData$1", f = "RelativeDataGetter.kt", i = {0, 1}, l = {54, 65, 68}, m = "invokeSuspend", n = {"$this$liveData", "$this$liveData"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nRelativeDataGetter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeDataGetter.kt\ncom/xiaomi/fitness/repo/relative/RelativeDataGetter$getHomeData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n1863#2:285\n1864#2:287\n1#3:286\n*S KotlinDebug\n*F\n+ 1 RelativeDataGetter.kt\ncom/xiaomi/fitness/repo/relative/RelativeDataGetter$getHomeData$1\n*L\n58#1:285\n58#1:287\n*E\n"})
    public static final class C28381 extends SuspendLambda implements Function2<LiveDataScope<Map<HomeDataType, ? extends DailyBasicReport>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<HomeDataType> $dataTypes;
        final /* synthetic */ long $relativeId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RelativeDataGetter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28381(List<? extends HomeDataType> list, RelativeDataGetter relativeDataGetter, long j, Continuation<? super C28381> continuation) {
            super(2, continuation);
            this.$dataTypes = list;
            this.this$0 = relativeDataGetter;
            this.$relativeId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C28381 c28381 = new C28381(this.$dataTypes, this.this$0, this.$relativeId, continuation);
            c28381.L$0 = obj;
            return c28381;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<Map<HomeDataType, DailyBasicReport>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C28381) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0081 A[Catch: Exception -> 0x003a, TryCatch #2 {Exception -> 0x003a, blocks: (B:16:0x0034, B:27:0x0064, B:28:0x007b, B:30:0x0081, B:32:0x00ce, B:34:0x00d4), top: B:49:0x0034 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00ce A[Catch: Exception -> 0x003a, TryCatch #2 {Exception -> 0x003a, blocks: (B:16:0x0034, B:27:0x0064, B:28:0x007b, B:30:0x0081, B:32:0x00ce, B:34:0x00d4), top: B:49:0x0034 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00df A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x0104 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:53:0x00d1 A[SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:30:0x0081, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object relativeLatestData;
            LiveDataScope liveDataScope2;
            int currentTZOffsetInSec;
            LinkedHashMap linkedHashMap;
            RelativeDataGetter relativeDataGetter;
            HomeDataType homeDataType;
            DailyBasicReport dailyBasicReportProcessRelativeFitnessData;
            Map mapEmptyMap;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope3 = (LiveDataScope) this.L$0;
                try {
                    if (CloudKey.INSTANCE.convertToCloudDataKeys(this.$dataTypes) == null) {
                        throw new IllegalStateException("no valid data key".toString());
                    }
                    FitnessDataRequest request = this.this$0.getRequest();
                    long j = this.$relativeId;
                    this.L$0 = liveDataScope3;
                    this.label = 1;
                    relativeLatestData = request.getRelativeLatestData(j, this);
                    if (relativeLatestData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    liveDataScope2 = liveDataScope3;
                    currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
                    linkedHashMap = new LinkedHashMap();
                    List<RelativeDataModel> dataList = ((GetRelativeDataResult) relativeLatestData).getDataList();
                    relativeDataGetter = this.this$0;
                    for (RelativeDataModel relativeDataModel : dataList) {
                        long time = (relativeDataModel.getTime() + ((long) relativeDataModel.getZoneOffsetInSec())) - ((long) currentTZOffsetInSec);
                        homeDataType = CloudKey.INSTANCE.getHomeDataType(relativeDataModel.getKey());
                        FitnessLogUtils.d(RelativeDataGetter.TAG, "processRelativeFitnessData:" + homeDataType + "-" + relativeDataModel.getValue());
                        dailyBasicReportProcessRelativeFitnessData = relativeDataGetter.processRelativeFitnessData(homeDataType, time, "home", relativeDataModel.getValue());
                        if (dailyBasicReportProcessRelativeFitnessData != null) {
                            linkedHashMap.put(homeDataType, dailyBasicReportProcessRelativeFitnessData);
                        }
                    }
                    this.L$0 = liveDataScope2;
                    this.label = 2;
                    if (liveDataScope2.emit(linkedHashMap, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e) {
                    e = e;
                    liveDataScope = liveDataScope3;
                    FitnessLogUtils.e(RelativeDataGetter.TAG, "getHomeData", e);
                    mapEmptyMap = MapsKt__MapsKt.emptyMap();
                    this.L$0 = null;
                    this.label = 3;
                    if (liveDataScope.emit(mapEmptyMap, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                liveDataScope2 = (LiveDataScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    relativeLatestData = obj;
                    currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
                    linkedHashMap = new LinkedHashMap();
                    List<RelativeDataModel> dataList2 = ((GetRelativeDataResult) relativeLatestData).getDataList();
                    relativeDataGetter = this.this$0;
                    while (r0.hasNext()) {
                        long time2 = (relativeDataModel.getTime() + ((long) relativeDataModel.getZoneOffsetInSec())) - ((long) currentTZOffsetInSec);
                        homeDataType = CloudKey.INSTANCE.getHomeDataType(relativeDataModel.getKey());
                        FitnessLogUtils.d(RelativeDataGetter.TAG, "processRelativeFitnessData:" + homeDataType + "-" + relativeDataModel.getValue());
                        dailyBasicReportProcessRelativeFitnessData = relativeDataGetter.processRelativeFitnessData(homeDataType, time2, "home", relativeDataModel.getValue());
                        if (dailyBasicReportProcessRelativeFitnessData != null) {
                            linkedHashMap.put(homeDataType, dailyBasicReportProcessRelativeFitnessData);
                        }
                    }
                    this.L$0 = liveDataScope2;
                    this.label = 2;
                    if (liveDataScope2.emit(linkedHashMap, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e2) {
                    e = e2;
                    liveDataScope = liveDataScope2;
                    FitnessLogUtils.e(RelativeDataGetter.TAG, "getHomeData", e);
                    mapEmptyMap = MapsKt__MapsKt.emptyMap();
                    this.L$0 = null;
                    this.label = 3;
                    if (liveDataScope.emit(mapEmptyMap, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 2) {
                liveDataScope = (LiveDataScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e3) {
                    e = e3;
                    FitnessLogUtils.e(RelativeDataGetter.TAG, "getHomeData", e);
                    mapEmptyMap = MapsKt__MapsKt.emptyMap();
                    this.L$0 = null;
                    this.label = 3;
                    if (liveDataScope.emit(mapEmptyMap, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 3) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.relative.RelativeDataGetter$getRelativeFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.relative.RelativeDataGetter", f = "RelativeDataGetter.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {132, 133, 138}, m = "getRelativeFitnessData", n = {"this", "resultList", "param", "isGetSrcData", "this", "resultList", "param", "isGetSrcData"}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0"})
    public static final class C28391 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C28391(Continuation<? super C28391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeDataGetter.this.getRelativeFitnessData(null, null, false, null, this);
        }
    }

    private RelativeDataGetter() {
    }

    private final Gson getMGson() {
        return (Gson) this.mGson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object getRelativeFitnessData(List<RelativeDataModel> list, GetDetailDataParam getDetailDataParam, boolean z, String str, Continuation<? super Unit> continuation) {
        C28391 c28391;
        RelativeDataGetter relativeDataGetter;
        GetRelativeDataResult getRelativeDataResult;
        String nextKey;
        if (continuation instanceof C28391) {
            c28391 = (C28391) continuation;
            int i = c28391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28391.label = i - Integer.MIN_VALUE;
            } else {
                c28391 = new C28391(continuation);
            }
        } else {
            c28391 = new C28391(continuation);
        }
        C28391 c28392 = c28391;
        Object relativeAggregatedData = c28392.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28392.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(relativeAggregatedData);
            getDetailDataParam.setNextKey(str);
            if (z) {
                FitnessDataRequest request = getRequest();
                c28392.L$0 = this;
                c28392.L$1 = list;
                c28392.L$2 = getDetailDataParam;
                c28392.Z$0 = z;
                c28392.label = 1;
                relativeAggregatedData = request.getRelativeFitnessData(getDetailDataParam, c28392);
                if (relativeAggregatedData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                relativeDataGetter = this;
                getRelativeDataResult = (GetRelativeDataResult) relativeAggregatedData;
                GetDetailDataParam getDetailDataParam2 = getDetailDataParam;
                boolean z2 = z;
                RelativeDataGetter relativeDataGetter2 = relativeDataGetter;
                list.addAll(getRelativeDataResult.getDataList());
                nextKey = getRelativeDataResult.getNextKey();
                if (nextKey != null) {
                }
                return Unit.INSTANCE;
            }
            FitnessDataRequest request2 = getRequest();
            c28392.L$0 = this;
            c28392.L$1 = list;
            c28392.L$2 = getDetailDataParam;
            c28392.Z$0 = z;
            c28392.label = 2;
            relativeAggregatedData = request2.getRelativeAggregatedData(getDetailDataParam, c28392);
            if (relativeAggregatedData == coroutine_suspended) {
                return coroutine_suspended;
            }
            relativeDataGetter = this;
            getRelativeDataResult = (GetRelativeDataResult) relativeAggregatedData;
            GetDetailDataParam getDetailDataParam3 = getDetailDataParam;
            boolean z3 = z;
            RelativeDataGetter relativeDataGetter3 = relativeDataGetter;
            list.addAll(getRelativeDataResult.getDataList());
            nextKey = getRelativeDataResult.getNextKey();
            if (nextKey != null) {
            }
            return Unit.INSTANCE;
        }
        if (i2 == 1) {
            z = c28392.Z$0;
            getDetailDataParam = (GetDetailDataParam) c28392.L$2;
            list = (List) c28392.L$1;
            relativeDataGetter = (RelativeDataGetter) c28392.L$0;
            ResultKt.throwOnFailure(relativeAggregatedData);
            getRelativeDataResult = (GetRelativeDataResult) relativeAggregatedData;
            GetDetailDataParam getDetailDataParam4 = getDetailDataParam;
            boolean z4 = z;
            RelativeDataGetter relativeDataGetter4 = relativeDataGetter;
            list.addAll(getRelativeDataResult.getDataList());
            nextKey = getRelativeDataResult.getNextKey();
            if (nextKey != null) {
            }
            return Unit.INSTANCE;
        }
        if (i2 == 2) {
            z = c28392.Z$0;
            getDetailDataParam = (GetDetailDataParam) c28392.L$2;
            list = (List) c28392.L$1;
            relativeDataGetter = (RelativeDataGetter) c28392.L$0;
            ResultKt.throwOnFailure(relativeAggregatedData);
            getRelativeDataResult = (GetRelativeDataResult) relativeAggregatedData;
            GetDetailDataParam getDetailDataParam5 = getDetailDataParam;
            boolean z5 = z;
            RelativeDataGetter relativeDataGetter5 = relativeDataGetter;
            list.addAll(getRelativeDataResult.getDataList());
            nextKey = getRelativeDataResult.getNextKey();
            if (nextKey != null || nextKey.length() == 0) {
                return Unit.INSTANCE;
            }
            String nextKey2 = getRelativeDataResult.getNextKey();
            c28392.L$0 = null;
            c28392.L$1 = null;
            c28392.L$2 = null;
            c28392.label = 3;
            if (relativeDataGetter5.getRelativeFitnessData(list, getDetailDataParam5, z5, nextKey2, c28392) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(relativeAggregatedData);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object getRelativeFitnessData$default(RelativeDataGetter relativeDataGetter, List list, GetDetailDataParam getDetailDataParam, boolean z, String str, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        return relativeDataGetter.getRelativeFitnessData(list, getDetailDataParam, z, str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FitnessDataRequest getRequest() {
        return (FitnessDataRequest) this.request.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isGetSourceData(HomeDataType homeDataType) {
        int i = WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$0() {
        return new Gson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DailyBasicReport processRelativeFitnessData(HomeDataType homeDataType, long time, String tag, String value) {
        switch (WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()]) {
            case 1:
                BloodPressureItem bloodPressureItem = (BloodPressureItem) getMGson().fromJson(value, BloodPressureItem.class);
                DailyBloodPressureReport dailyBloodPressureReport = new DailyBloodPressureReport(time, tag);
                dailyBloodPressureReport.setLatestRecord(bloodPressureItem);
                return dailyBloodPressureReport;
            case 2:
                WeightItem weightItem = (WeightItem) getMGson().fromJson(value, WeightItem.class);
                DailyWeightReport dailyWeightReport = new DailyWeightReport(time, tag);
                dailyWeightReport.setWeightRecordList(Collections.singletonList(weightItem));
                return dailyWeightReport;
            case 3:
            default:
                return null;
            case 4:
                CloudHrReport cloudHrReport = (CloudHrReport) getMGson().fromJson(value, CloudHrReport.class);
                DailyHrReport dailyHrReport = new DailyHrReport(time, tag, cloudHrReport.getAvgRestHr(), cloudHrReport.getAvgHr(), cloudHrReport.getMaxHr(), cloudHrReport.getMinHr(), CollectionsKt__CollectionsKt.emptyList(), null, null, null, 896, null);
                dailyHrReport.setLatestHrRecord(cloudHrReport.getLatestHr());
                if (cloudHrReport.getWarmUpHrDuration() != null || cloudHrReport.getFatBurningHrDuration() != null || cloudHrReport.getAnaerobicHrDuration() != null || cloudHrReport.getAerobicHrDuration() != null || cloudHrReport.getExtremeHrDuration() != null) {
                    DailyHrDistribute dailyHrDistribute = new DailyHrDistribute();
                    Integer extremeHrDuration = cloudHrReport.getExtremeHrDuration();
                    dailyHrDistribute.setExtremeDuration(extremeHrDuration != null ? extremeHrDuration.intValue() : 0);
                    Integer anaerobicHrDuration = cloudHrReport.getAnaerobicHrDuration();
                    dailyHrDistribute.setAnaerobicDuration(anaerobicHrDuration != null ? anaerobicHrDuration.intValue() : 0);
                    Integer aerobicHrDuration = cloudHrReport.getAerobicHrDuration();
                    dailyHrDistribute.setAerobicDuration(aerobicHrDuration != null ? aerobicHrDuration.intValue() : 0);
                    Integer fatBurningHrDuration = cloudHrReport.getFatBurningHrDuration();
                    dailyHrDistribute.setFatBurningDuration(fatBurningHrDuration != null ? fatBurningHrDuration.intValue() : 0);
                    Integer warmUpHrDuration = cloudHrReport.getWarmUpHrDuration();
                    dailyHrDistribute.setWarmUpDuration(warmUpHrDuration != null ? warmUpHrDuration.intValue() : 0);
                    dailyHrReport.setHrDistribute(dailyHrDistribute);
                }
                return dailyHrReport;
            case 5:
                CloudSpo2Report cloudSpo2Report = (CloudSpo2Report) getMGson().fromJson(value, CloudSpo2Report.class);
                DailySpo2Report dailySpo2Report = new DailySpo2Report(time, tag, cloudSpo2Report.getAvgSpo2(), cloudSpo2Report.getMaxSpo2(), cloudSpo2Report.getMinSpo2(), 0, CollectionsKt__CollectionsKt.emptyList());
                dailySpo2Report.setLatestSpoRecord(cloudSpo2Report.getLatestSpo2());
                return dailySpo2Report;
            case 6:
                return (DailyBasicReport) getMGson().fromJson(value, DailyGoalReport.class);
            case 7:
                CloudStepReport cloudStepReport = (CloudStepReport) getMGson().fromJson(value, CloudStepReport.class);
                return new DailyStepReport(time, tag, cloudStepReport.getSteps(), cloudStepReport.getDistance(), cloudStepReport.getCalories(), CollectionsKt__CollectionsKt.emptyList());
            case 8:
                return new DailyCalorieReport(time, tag, ((CloudCaloriesReport) getMGson().fromJson(value, CloudCaloriesReport.class)).getCalories(), CollectionsKt__CollectionsKt.emptyList());
            case 9:
                return new DailyStandReport(time, tag, CollectionsKt__CollectionsKt.emptyList(), ((CloudStandReport) getMGson().fromJson(value, CloudStandReport.class)).getCount());
            case 10:
                return new DailyMHStrengthReport(time, tag, CollectionsKt__CollectionsKt.emptyList(), ((CloudHMStrengthReport) getMGson().fromJson(value, CloudHMStrengthReport.class)).getDuration());
            case 11:
                CloudSleepReport cloudSleepReport = (CloudSleepReport) getMGson().fromJson(value, CloudSleepReport.class);
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
                AllDaySleepReport allDaySleepReport = new AllDaySleepReport(time, tag);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRequest request_delegate$lambda$1() {
        return FitnessDataRequest.INSTANCE.getInstance();
    }

    @NotNull
    public final <T extends DailyBasicReport> Flow<List<T>> getFitnessReport(long relativeId, @NotNull HomeDataType homeType, long startTime, long endTime, @NotNull String viewTag) {
        Intrinsics.checkNotNullParameter(homeType, "homeType");
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        if (this.mockRelativeData) {
            return RelativeDataMocker.INSTANCE.getInstance().getDetailData(homeType, startTime, endTime);
        }
        String cloudRequestKey = CloudKey.INSTANCE.getCloudRequestKey(homeType);
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        long j = currentTZOffsetInSec;
        GetDetailDataParam getDetailDataParam = new GetDetailDataParam(relativeId, cloudRequestKey, startTime + j, endTime + j, null, null, null, null, 240, null);
        getDetailDataParam.setTag(DataCloudUtilKt.getRequestTag(homeType));
        return FlowKt.flow(new AnonymousClass1(getDetailDataParam, homeType, currentTZOffsetInSec, viewTag, null));
    }

    @NotNull
    public final LiveData<Map<HomeDataType, DailyBasicReport>> getHomeData(long relativeId, @NotNull List<? extends HomeDataType> dataTypes) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        return this.mockRelativeData ? RelativeDataMocker.INSTANCE.getInstance().getHomeData(dataTypes) : CoroutineLiveDataKt.liveData$default(Dispatchers.getIO(), 0L, new C28381(dataTypes, this, relativeId, null), 2, (Object) null);
    }
}
