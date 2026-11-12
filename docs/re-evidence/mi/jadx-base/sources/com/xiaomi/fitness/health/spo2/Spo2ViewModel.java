package com.xiaomi.fitness.health.spo2;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.api.repository.ISpo2Repository;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.spo2.Spo2ViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/health/spo2/Spo2ViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "<init>", "()V", "mDataRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/ISpo2Repository;", "getMDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ISpo2Repository;", "mDataRepo$delegate", "Lkotlin/Lazy;", "queryAllManuallyMeasuredRecords", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "queryAllSpo2ExtremeLowRecords", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "deleteRecord", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "requestLowMonthGroupData", "endTimeSecond", "", "limit", "", "requestManualMonthGroupData", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Spo2ViewModel extends BasicDataViewModel {

    @NotNull
    public static final String TAG = "Spo2ViewModel";

    /* JADX INFO: renamed from: mDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: w8n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Spo2ViewModel.mDataRepo_delegate$lambda$0(this.f37727a);
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.spo2.Spo2ViewModel$deleteRecord$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.spo2.Spo2ViewModel$deleteRecord$1", f = "Spo2ViewModel.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DailyRecordItem $record;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DailyRecordItem dailyRecordItem, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$record = dailyRecordItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Spo2ViewModel.this.new AnonymousClass1(this.$record, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ISpo2Repository mDataRepo = Spo2ViewModel.this.getMDataRepo();
                DailyRecordItem[] dailyRecordItemArr = {this.$record};
                this.label = 1;
                if (mDataRepo.deleteRecord(dailyRecordItemArr, this) == coroutine_suspended) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.spo2.Spo2ViewModel$requestLowMonthGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.spo2.Spo2ViewModel$requestLowMonthGroupData$1", f = "Spo2ViewModel.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25451(long j, int i, Continuation<? super C25451> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Spo2ViewModel.this.new C25451(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ISpo2Repository mDataRepo = Spo2ViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = ISpo2Repository.DefaultImpls.getAbnormalSpo2LowByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Map<Long, List<DailyRecordItem>> map = (Map) obj;
            Spo2ViewModel.this.setHasMore(!map.isEmpty());
            Logger.i(Spo2ViewModel.TAG, "requestMonthData endTime " + this.$endTimeSecond + ";size " + map.size());
            Spo2ViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.spo2.Spo2ViewModel$requestManualMonthGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.spo2.Spo2ViewModel$requestManualMonthGroupData$1", f = "Spo2ViewModel.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25461(long j, int i, Continuation<? super C25461> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Spo2ViewModel.this.new C25461(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ISpo2Repository mDataRepo = Spo2ViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = ISpo2Repository.DefaultImpls.getManualSpo2ByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Map<Long, List<DailyRecordItem>> map = (Map) obj;
            Spo2ViewModel.this.setHasMore(!map.isEmpty());
            Logger.i(Spo2ViewModel.TAG, "requestMonthData endTime " + this.$endTimeSecond + ";size " + map.size());
            Spo2ViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISpo2Repository getMDataRepo() {
        return (ISpo2Repository) this.mDataRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ISpo2Repository mDataRepo_delegate$lambda$0(Spo2ViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (ISpo2Repository) this$0.getRepo(ISpo2Repository.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAllManuallyMeasuredRecords$lambda$1(Spo2ViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMDataRepo().getAllRecordDetailPagingSource(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAllSpo2ExtremeLowRecords$lambda$2(Spo2ViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ISpo2Repository.DefaultImpls.getAllSpo2AbnormalRecords$default(this$0.getMDataRepo(), null, 1, null);
    }

    public static /* synthetic */ void requestLowMonthGroupData$default(Spo2ViewModel spo2ViewModel, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 60;
        }
        spo2ViewModel.requestLowMonthGroupData(j, i);
    }

    public static /* synthetic */ void requestManualMonthGroupData$default(Spo2ViewModel spo2ViewModel, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 60;
        }
        spo2ViewModel.requestManualMonthGroupData(j, i);
    }

    public final void deleteRecord(@Nullable DailyRecordItem record) {
        if (record == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(record, null), 2, null);
    }

    @NotNull
    public final LiveData<PagingData<Spo2Item>> queryAllManuallyMeasuredRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: x8n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Spo2ViewModel.queryAllManuallyMeasuredRecords$lambda$1(this.f38866a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<PagingData<SegmentItem>> queryAllSpo2ExtremeLowRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: y8n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Spo2ViewModel.queryAllSpo2ExtremeLowRecords$lambda$2(this.f39936a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public final void requestLowMonthGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25451(endTimeSecond, limit, null), 2, null);
    }

    public final void requestManualMonthGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25461(endTimeSecond, limit, null), 2, null);
    }
}
