package com.xiaomi.fitness.repo.stress;

import com.xiaomi.fit.fitness.export.api.repository.PagingSourceParams;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.repo.BaseDataSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J<\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/repo/stress/StressAbnormalDataSource;", "Lcom/xiaomi/fitness/repo/BaseDataSource;", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "<init>", "(Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;)V", "getDataRecord", "", "startTime", "", "endTime", "zoneOffsetInSec", "", "pageSize", "reverse", "", "(JJIIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StressAbnormalDataSource extends BaseDataSource<SegmentItem> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.stress.StressAbnormalDataSource$getDataRecord$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.stress.StressAbnormalDataSource", f = "StressAbnormalDataSource.kt", i = {}, l = {19}, m = "getDataRecord", n = {}, s = {})
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
            return StressAbnormalDataSource.this.getDataRecord(0L, 0L, 0, 0, false, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StressAbnormalDataSource() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fitness.repo.BaseDataSource
    @Nullable
    public Object getDataRecord(long j, long j2, int i, int i2, boolean z, @NotNull Continuation<? super List<SegmentItem>> continuation) {
        AnonymousClass1 anonymousClass1;
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
            anonymousClass2.label = 1;
            limitedDataRecord = dailyRecordDaoUtils.getLimitedDataRecord(FitnessPersistKey.AbnormalStress, (String) null, j, j2, i, i2, z, anonymousClass2);
            if (limitedDataRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(limitedDataRecord);
        }
        Intrinsics.checkNotNull(limitedDataRecord, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AbnormalRecordItem>");
        return (List) limitedDataRecord;
    }

    public /* synthetic */ StressAbnormalDataSource(PagingSourceParams pagingSourceParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pagingSourceParams);
    }

    public StressAbnormalDataSource(@Nullable PagingSourceParams pagingSourceParams) {
        super(pagingSourceParams);
    }
}
