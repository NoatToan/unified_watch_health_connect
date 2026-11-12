package com.xiaomi.fitness.repo.lactatethreshold;

import com.xiaomi.fit.fitness.export.api.repository.ILactateThresholdRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPhysicalStatusReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import com.xiaomi.fitness.repo.lactatethreshold.LactateThresholdRepository;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016J@\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u00152\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0010¢\u0006\u0002\b\u001fJ\b\u0010 \u001a\u00020!H\u0016JH\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00130\u00152\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010%R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/repo/lactatethreshold/LactateThresholdRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyLactateThresholdReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/ILactateThresholdRepository;", "<init>", "()V", "biz", "Lcom/xiaomi/fitness/repo/lactatethreshold/LactateThresholdBiz;", "getBiz", "()Lcom/xiaomi/fitness/repo/lactatethreshold/LactateThresholdBiz;", "biz$delegate", "Lkotlin/Lazy;", "mergeTargetReport", "sid", "", CloudContract.COL_VIEW_TAG, "startTimestamp", "", "srcReportList", "", "getLactateThresholdGroup", "", "Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;", "startTime", "endTime", "limit", "", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getRecordByMonthGroup", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "persistKey", "(Ljava/lang/String;JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LactateThresholdRepository extends BaseRepository<DailyPhysicalStatusReport> implements ILactateThresholdRepository {

    /* JADX INFO: renamed from: biz$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy biz = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: p2e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LactateThresholdRepository.biz_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.lactatethreshold.LactateThresholdRepository$getLactateThresholdGroup$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.lactatethreshold.LactateThresholdRepository", f = "LactateThresholdRepository.kt", i = {}, l = {41}, m = "getLactateThresholdGroup", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
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
            return LactateThresholdRepository.this.getLactateThresholdGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.lactatethreshold.LactateThresholdRepository$getRecordByMonthGroup$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.lactatethreshold.LactateThresholdRepository", f = "LactateThresholdRepository.kt", i = {0}, l = {57}, m = "getRecordByMonthGroup", n = {"this"}, s = {"L$0"})
    public static final class C28371 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28371(Continuation<? super C28371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LactateThresholdRepository.this.getRecordByMonthGroup(null, 0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LactateThresholdBiz biz_delegate$lambda$0() {
        return new LactateThresholdBiz();
    }

    private final LactateThresholdBiz getBiz() {
        return (LactateThresholdBiz) this.biz.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object getRecordByMonthGroup(String str, long j, long j2, int i, boolean z, Continuation<? super Map<Long, ? extends List<? extends DailyRecordItem>>> continuation) {
        C28371 c28371;
        LactateThresholdRepository lactateThresholdRepository;
        if (continuation instanceof C28371) {
            c28371 = (C28371) continuation;
            int i2 = c28371.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28371.label = i2 - Integer.MIN_VALUE;
            } else {
                c28371 = new C28371(continuation);
            }
        } else {
            c28371 = new C28371(continuation);
        }
        C28371 c28372 = c28371;
        Object limitedDataRecord = c28372.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28372.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(limitedDataRecord);
            DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
            int curTimeZoneOffsetInSecond = getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
            c28372.L$0 = this;
            c28372.label = 1;
            limitedDataRecord = dailyRecordDaoUtils.getLimitedDataRecord(str, (String) null, j, j2, curTimeZoneOffsetInSecond, i, z, c28372);
            if (limitedDataRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
            lactateThresholdRepository = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lactateThresholdRepository = (LactateThresholdRepository) c28372.L$0;
            ResultKt.throwOnFailure(limitedDataRecord);
        }
        return lactateThresholdRepository.getBiz$fitness_data_core_chinaProductRelease().groupByMonth((List) limitedDataRecord);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyPhysicalStatusReport> getBiz$fitness_data_core_chinaProductRelease() {
        return getBiz();
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.LACTATE_THRESHOLD;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.ILactateThresholdRepository
    @Nullable
    public Object getLactateThresholdGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<LactateThresholdItem>>> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object recordByMonthGroup = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass2.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(recordByMonthGroup);
            anonymousClass2.label = 1;
            recordByMonthGroup = getRecordByMonthGroup("lactate_threshold", j, j2, i, z, anonymousClass2);
            if (recordByMonthGroup == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(recordByMonthGroup);
        }
        Intrinsics.checkNotNull(recordByMonthGroup, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Long, kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem>>");
        return (Map) recordByMonthGroup;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyPhysicalStatusReport>) list);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public DailyPhysicalStatusReport mergeTargetReport(@Nullable String sid, @NotNull String viewTag, long startTimestamp, @NotNull List<DailyPhysicalStatusReport> srcReportList) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(srcReportList, "srcReportList");
        return srcReportList.isEmpty() ? new DailyPhysicalStatusReport(startTimestamp) : new DailyPhysicalStatusReport(startTimestamp);
    }
}
