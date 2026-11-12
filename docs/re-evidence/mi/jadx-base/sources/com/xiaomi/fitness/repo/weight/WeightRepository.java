package com.xiaomi.fitness.repo.weight;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.repository.IWeightRepository;
import com.xiaomi.fit.fitness.export.api.repository.PagingSourceParams;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyWeightReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.BodyComposition;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0010¢\u0006\u0002\b\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J!\u0010\u000f\u001a\u00020\f2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0010\"\u00020\u000eH\u0014¢\u0006\u0002\u0010\u0011J<\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016JN\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u001e0\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J6\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002J\u001e\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00150\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J0\u0010%\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016J\b\u0010+\u001a\u00020,H\u0016J@\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u001e2\u0006\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u000202H\u0096@¢\u0006\u0002\u00103R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/repo/weight/WeightRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyWeightReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IWeightRepository;", "<init>", "()V", "biz", "Lcom/xiaomi/fitness/repo/weight/WeightBiz;", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "doRecordAdd", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "doDeleteRecord", "", "([Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "getBodyCompositionList", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "composition", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/BodyComposition;", "beginInSecond", "", "zoneOffsetInSec", "", "leftOffset", "rightOffset", "", "compositions", "getCompositionWeightRecord", "getAllRecordDetailPagingSource", "Landroidx/paging/PagingSource;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "mergeTargetReport", "sid", "", CloudContract.COL_VIEW_TAG, "startTimestamp", "srcReportList", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getWeightByMonthGroup", "startTime", "endTime", "limit", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightRepository extends BaseRepository<DailyWeightReport> implements IWeightRepository {

    @NotNull
    private final WeightBiz biz = new WeightBiz();

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.weight.WeightRepository$getBodyCompositionList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.weight.WeightRepository$getBodyCompositionList$1", f = "WeightRepository.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends WeightItem>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $beginInSecond;
        final /* synthetic */ BodyComposition $composition;
        final /* synthetic */ int $leftOffset;
        final /* synthetic */ int $rightOffset;
        final /* synthetic */ int $zoneOffsetInSec;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BodyComposition bodyComposition, long j, int i, int i2, int i3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$composition = bodyComposition;
            this.$beginInSecond = j;
            this.$zoneOffsetInSec = i;
            this.$leftOffset = i2;
            this.$rightOffset = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = WeightRepository.this.new AnonymousClass1(this.$composition, this.$beginInSecond, this.$zoneOffsetInSec, this.$leftOffset, this.$rightOffset, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends WeightItem>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<WeightItem>>) flowCollector, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                List compositionWeightRecord = WeightRepository.this.getCompositionWeightRecord(this.$composition, this.$beginInSecond, this.$zoneOffsetInSec, this.$leftOffset, this.$rightOffset);
                this.label = 1;
                if (flowCollector.emit(compositionWeightRecord, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super List<WeightItem>> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.weight.WeightRepository$getBodyCompositionList$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/BodyComposition;", "", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.weight.WeightRepository$getBodyCompositionList$2", f = "WeightRepository.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super Map<BodyComposition, ? extends List<? extends WeightItem>>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $beginInSecond;
        final /* synthetic */ List<BodyComposition> $compositions;
        final /* synthetic */ int $leftOffset;
        final /* synthetic */ int $rightOffset;
        final /* synthetic */ int $zoneOffsetInSec;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ WeightRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends BodyComposition> list, WeightRepository weightRepository, long j, int i, int i2, int i3, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$compositions = list;
            this.this$0 = weightRepository;
            this.$beginInSecond = j;
            this.$zoneOffsetInSec = i;
            this.$leftOffset = i2;
            this.$rightOffset = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$0(WeightItem weightItem, WeightItem weightItem2) {
            return Intrinsics.compare(weightItem2.getTime(), weightItem.getTime());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$1(Function2 function2, Object obj, Object obj2) {
            return ((Number) function2.invoke(obj, obj2)).intValue();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$compositions, this.this$0, this.$beginInSecond, this.$zoneOffsetInSec, this.$leftOffset, this.$rightOffset, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Map<BodyComposition, ? extends List<? extends WeightItem>>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Map<BodyComposition, ? extends List<WeightItem>>>) flowCollector, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (BodyComposition bodyComposition : this.$compositions) {
                    List compositionWeightRecord = this.this$0.getCompositionWeightRecord(bodyComposition, this.$beginInSecond, this.$zoneOffsetInSec, this.$leftOffset, this.$rightOffset);
                    final Function2 function2 = new Function2() { // from class: com.xiaomi.fitness.repo.weight.a
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return Integer.valueOf(WeightRepository.AnonymousClass2.invokeSuspend$lambda$0((WeightItem) obj2, (WeightItem) obj3));
                        }
                    };
                    Collections.sort(compositionWeightRecord, new Comparator() { // from class: com.xiaomi.fitness.repo.weight.b
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            return WeightRepository.AnonymousClass2.invokeSuspend$lambda$1(function2, obj2, obj3);
                        }
                    });
                    linkedHashMap.put(bodyComposition, compositionWeightRecord);
                }
                this.label = 1;
                if (flowCollector.emit(linkedHashMap, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Map<BodyComposition, ? extends List<WeightItem>>> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.weight.WeightRepository$getWeightByMonthGroup$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.weight.WeightRepository", f = "WeightRepository.kt", i = {0}, l = {123}, m = "getWeightByMonthGroup", n = {"this"}, s = {"L$0"})
    public static final class C28671 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28671(Continuation<? super C28671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WeightRepository.this.getWeightByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<WeightItem> getCompositionWeightRecord(BodyComposition composition, long beginInSecond, int zoneOffsetInSec, int leftOffset, int rightOffset) {
        List listGroupRecordByDay = this.biz.groupRecordByDay(DailyRecordDaoUtils.INSTANCE.getWeightDayRecords(composition, beginInSecond, zoneOffsetInSec, leftOffset, rightOffset));
        Intrinsics.checkNotNull(listGroupRecordByDay, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.WeightItem>");
        return listGroupRecordByDay;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doDeleteRecord(@NotNull DailyRecordItem... record) {
        Intrinsics.checkNotNullParameter(record, "record");
        getDbWriter().deleteWeight((DailyRecordItem[]) Arrays.copyOf(record, record.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doRecordAdd(@NotNull DailyRecordItem record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (record instanceof WeightItem) {
            FitnessDataRecorder dbWriter = getDbWriter();
            String sid = record.getSid();
            Intrinsics.checkNotNull(sid);
            dbWriter.recordWeight(sid, getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond(), record);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IPagingSourceRepository
    @NotNull
    public PagingSource<Long, WeightItem> getAllRecordDetailPagingSource(@Nullable PagingSourceParams params) {
        return new WeightRecordDataSource(params);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyWeightReport> getBiz$fitness_data_core_chinaProductRelease() {
        return this.biz;
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IWeightRepository
    @NotNull
    public LiveData<List<WeightItem>> getBodyCompositionList(@NotNull BodyComposition composition, long beginInSecond, int zoneOffsetInSec, int leftOffset, int rightOffset) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        return FlowLiveDataConversions.asLiveData$default(FlowKt.flow(new AnonymousClass1(composition, beginInSecond, zoneOffsetInSec, leftOffset, rightOffset, null)), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.WEIGHT;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.IWeightRepository
    @Nullable
    public Object getWeightByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<WeightItem>>> continuation) {
        C28671 c28671;
        WeightRepository weightRepository;
        if (continuation instanceof C28671) {
            c28671 = (C28671) continuation;
            int i2 = c28671.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28671.label = i2 - Integer.MIN_VALUE;
            } else {
                c28671 = new C28671(continuation);
            }
        } else {
            c28671 = new C28671(continuation);
        }
        C28671 c28672 = c28671;
        Object limitedDataRecord = c28672.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28672.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(limitedDataRecord);
            DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
            int curTimeZoneOffsetInSecond = getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
            c28672.L$0 = this;
            c28672.label = 1;
            limitedDataRecord = dailyRecordDaoUtils.getLimitedDataRecord("weight", (String) null, j, j2, curTimeZoneOffsetInSecond, i, z, c28672);
            if (limitedDataRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
            weightRepository = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            weightRepository = (WeightRepository) c28672.L$0;
            ResultKt.throwOnFailure(limitedDataRecord);
        }
        Object objGroupByMonth = weightRepository.getBiz$fitness_data_core_chinaProductRelease().groupByMonth((List) limitedDataRecord);
        Intrinsics.checkNotNull(objGroupByMonth, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Long, kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.WeightItem>>");
        return objGroupByMonth;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyWeightReport>) list);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public DailyWeightReport mergeTargetReport(@Nullable String sid, @NotNull String viewTag, long startTimestamp, @NotNull List<DailyWeightReport> srcReportList) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(srcReportList, "srcReportList");
        return srcReportList.isEmpty() ? new DailyWeightReport(startTimestamp, viewTag) : srcReportList.get(0);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IWeightRepository
    @NotNull
    public LiveData<Map<BodyComposition, List<WeightItem>>> getBodyCompositionList(@NotNull List<? extends BodyComposition> compositions, long beginInSecond, int zoneOffsetInSec, int leftOffset, int rightOffset) {
        Intrinsics.checkNotNullParameter(compositions, "compositions");
        return FlowLiveDataConversions.asLiveData$default(FlowKt.flow(new AnonymousClass2(compositions, this, beginInSecond, zoneOffsetInSec, leftOffset, rightOffset, null)), (CoroutineContext) null, 0L, 3, (Object) null);
    }
}
