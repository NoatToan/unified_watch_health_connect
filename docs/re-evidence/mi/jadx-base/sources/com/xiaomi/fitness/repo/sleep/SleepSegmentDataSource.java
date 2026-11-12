package com.xiaomi.fitness.repo.sleep;

import com.xiaomi.fit.fitness.FitnessDataUtils;
import com.xiaomi.fit.fitness.export.api.repository.PagingSourceParams;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.repo.BaseDataSource;
import com.xiaomi.fitness.repo.sleep.SleepSegmentDataSource;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J<\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/repo/sleep/SleepSegmentDataSource;", "Lcom/xiaomi/fitness/repo/BaseDataSource;", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "<init>", "(Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;)V", "sleepBiz", "Lcom/xiaomi/fitness/repo/sleep/SleepBiz;", "getSleepBiz", "()Lcom/xiaomi/fitness/repo/sleep/SleepBiz;", "sleepBiz$delegate", "Lkotlin/Lazy;", "getDataRecord", "", "startTime", "", "endTime", "zoneOffsetInSec", "", "pageSize", "reverse", "", "(JJIIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepSegmentDataSource extends BaseDataSource<SleepSegmentReport> {

    /* JADX INFO: renamed from: sleepBiz$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepBiz;

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.SleepSegmentDataSource$getDataRecord$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.SleepSegmentDataSource", f = "SleepSegmentDataSource.kt", i = {0}, l = {22}, m = "getDataRecord", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
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
            return SleepSegmentDataSource.this.getDataRecord(0L, 0L, 0, 0, false, this);
        }
    }

    public SleepSegmentDataSource(@Nullable PagingSourceParams pagingSourceParams) {
        super(pagingSourceParams);
        this.sleepBiz = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: axm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepSegmentDataSource.sleepBiz_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getDataRecord$lambda$1(SleepSegmentReport sleepSegmentReport, SleepSegmentReport sleepSegmentReport2) {
        return (int) (sleepSegmentReport2.getTimestamp() - sleepSegmentReport.getTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getDataRecord$lambda$2(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final SleepBiz getSleepBiz() {
        return (SleepBiz) this.sleepBiz.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepBiz sleepBiz_delegate$lambda$0() {
        return new SleepBiz();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fitness.repo.BaseDataSource
    @Nullable
    public Object getDataRecord(long j, long j2, int i, int i2, boolean z, @NotNull Continuation<? super List<SleepSegmentReport>> continuation) {
        AnonymousClass1 anonymousClass1;
        SleepSegmentDataSource sleepSegmentDataSource;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object limitedDataRecord = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = anonymousClass2.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(limitedDataRecord);
            DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
            HomeDataType homeDataType = HomeDataType.SLEEP;
            anonymousClass2.L$0 = this;
            anonymousClass2.label = 1;
            limitedDataRecord = dailyRecordDaoUtils.getLimitedDataRecord(homeDataType, (String) null, j, j2, i, i2, z, anonymousClass2);
            if (limitedDataRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
            sleepSegmentDataSource = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sleepSegmentDataSource = (SleepSegmentDataSource) anonymousClass2.L$0;
            ResultKt.throwOnFailure(limitedDataRecord);
        }
        Map<String, ? extends List<? extends DailyRecordItem>> map = (Map) limitedDataRecord;
        if (map.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<SleepSegmentReport> listConvertToSleepSegmentList = sleepSegmentDataSource.getSleepBiz().convertToSleepSegmentList(map);
        FitnessDataUtils.INSTANCE.sleepSegmentToLocalTime(listConvertToSleepSegmentList);
        final Function2 function2 = new Function2() { // from class: ywm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(SleepSegmentDataSource.getDataRecord$lambda$1((SleepSegmentReport) obj, (SleepSegmentReport) obj2));
            }
        };
        Collections.sort(listConvertToSleepSegmentList, new Comparator() { // from class: zwm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SleepSegmentDataSource.getDataRecord$lambda$2(function2, obj, obj2);
            }
        });
        return listConvertToSleepSegmentList;
    }
}
