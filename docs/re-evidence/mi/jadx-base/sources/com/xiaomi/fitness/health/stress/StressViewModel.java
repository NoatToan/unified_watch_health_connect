package com.xiaomi.fitness.health.stress;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.api.repository.IDevicesListRepository;
import com.xiaomi.fit.fitness.export.api.repository.IStressRepository;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.FitnessDeviceItem;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.stress.StressViewModel;
import com.xiaomi.fitness.statistics.StatConstants;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J$\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bJ\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/health/stress/StressViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "<init>", "()V", "mDataRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IStressRepository;", "getMDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IStressRepository;", "mDataRepo$delegate", "Lkotlin/Lazy;", "mDeviceRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IDevicesListRepository;", "getMDeviceRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IDevicesListRepository;", "mDeviceRepo$delegate", "queryAllRecords", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "deleteRecord", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "queryDeviceList", "", "Lcom/xiaomi/fit/fitness/export/data/item/FitnessDeviceItem;", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "requestMonthGroupData", "endTimeSecond", "limit", "", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StressViewModel extends BasicDataViewModel {

    @NotNull
    public static final String TAG = "StressViewModel";

    /* JADX INFO: renamed from: mDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tko
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StressViewModel.mDataRepo_delegate$lambda$0(this.f34800a);
        }
    });

    /* JADX INFO: renamed from: mDeviceRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: uko
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StressViewModel.mDeviceRepo_delegate$lambda$1(this.f35892a);
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.stress.StressViewModel$deleteRecord$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.stress.StressViewModel$deleteRecord$1", f = "StressViewModel.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
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
            return StressViewModel.this.new AnonymousClass1(this.$record, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IStressRepository mDataRepo = StressViewModel.this.getMDataRepo();
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.stress.StressViewModel$requestMonthGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.stress.StressViewModel$requestMonthGroupData$1", f = "StressViewModel.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25481(long j, int i, Continuation<? super C25481> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StressViewModel.this.new C25481(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IStressRepository mDataRepo = StressViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = IStressRepository.DefaultImpls.getManualStressByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
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
            StressViewModel.this.setHasMore(!map.isEmpty());
            Logger.i(StressViewModel.TAG, "requestMonthData endTime " + this.$endTimeSecond + ";size " + map.size());
            StressViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IStressRepository getMDataRepo() {
        return (IStressRepository) this.mDataRepo.getValue();
    }

    private final IDevicesListRepository getMDeviceRepo() {
        return (IDevicesListRepository) this.mDeviceRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IStressRepository mDataRepo_delegate$lambda$0(StressViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (IStressRepository) this$0.getRepo(IStressRepository.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IDevicesListRepository mDeviceRepo_delegate$lambda$1(StressViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getRepoProvider().getDevicesListRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAllRecords$lambda$2(StressViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMDataRepo().getAllRecordDetailPagingSource(null);
    }

    public final void deleteRecord(@Nullable DailyRecordItem record) {
        if (record == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(record, null), 2, null);
    }

    @NotNull
    public final LiveData<PagingData<StressItem>> queryAllRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: vko
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StressViewModel.queryAllRecords$lambda$2(this.f36985a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<List<FitnessDeviceItem>> queryDeviceList(long start, long end) {
        return FlowLiveDataConversions.asLiveData$default(getMDeviceRepo().getDevicesList(HomeDataType.STRESS, start, end), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @Override // com.xiaomi.fitness.base.BasicDataViewModel
    public void requestMonthGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25481(endTimeSecond, limit, null), 2, null);
    }
}
