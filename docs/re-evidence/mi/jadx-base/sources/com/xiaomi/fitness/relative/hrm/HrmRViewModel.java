package com.xiaomi.fitness.relative.hrm;

import android.os.Bundle;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository;
import com.xiaomi.fit.fitness.export.api.repository.IPagingSourceRepository;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalHrItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.relative.base.BasicRelativeDataViewModel;
import com.xiaomi.fitness.relative.hrm.HrmRViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019J\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\u0019J\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001a0\u0019J\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001a0\u0019J\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019J\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0019J\u0010\u0010$\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010&R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/relative/hrm/HrmRViewModel;", "Lcom/xiaomi/fitness/relative/base/BasicRelativeDataViewModel;", "<init>", "()V", "mDataRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IHeartRateRepository;", "getMDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IHeartRateRepository;", "mDataRepo$delegate", "Lkotlin/Lazy;", "liveData", "Landroidx/lifecycle/MutableLiveData;", "", "getLiveData", "()Landroidx/lifecycle/MutableLiveData;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "insertHrmRecord", "time", "", "hrm", "", "queryAllRecords", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "queryAbnormalHrRecords", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalHrItem;", "queryAbnormalHighHrRecords", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "queryAbnormalLowHrRecords", "queryAllManuallyAddedHrRecords", "queryExceptionFibRecords", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;", "deleteRecord", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HrmRViewModel extends BasicRelativeDataViewModel {

    @NotNull
    public static final String TAG = "HrmViewModel";

    /* JADX INFO: renamed from: mDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rec
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HrmRViewModel.mDataRepo_delegate$lambda$0(this.f32469a);
        }
    });

    @NotNull
    private final MutableLiveData<Boolean> liveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.hrm.HrmRViewModel$deleteRecord$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.hrm.HrmRViewModel$deleteRecord$1", f = "HrmRViewModel.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
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
            return HrmRViewModel.this.new AnonymousClass1(this.$record, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IHeartRateRepository mDataRepo = HrmRViewModel.this.getMDataRepo();
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.hrm.HrmRViewModel$insertHrmRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.hrm.HrmRViewModel$insertHrmRecord$1", f = "HrmRViewModel.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $hrm;
        final /* synthetic */ long $time;
        int label;
        final /* synthetic */ HrmRViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27551(long j, int i, HrmRViewModel hrmRViewModel, Continuation<? super C27551> continuation) {
            super(2, continuation);
            this.$time = j;
            this.$hrm = i;
            this.this$0 = hrmRViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27551(this.$time, this.$hrm, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HrItem hrItem = new HrItem(this.$time, this.$hrm);
                hrItem.setZoneOffsetInSec(Boxing.boxInt(FitnessDateUtils.getCurrentTZOffsetInSec()));
                hrItem.setSid("xiaomiwear_app_manually");
                IHeartRateRepository mDataRepo = this.this$0.getMDataRepo();
                this.label = 1;
                if (mDataRepo.addRecord(hrItem, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.getLiveData().postValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IHeartRateRepository getMDataRepo() {
        return (IHeartRateRepository) this.mDataRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IHeartRateRepository mDataRepo_delegate$lambda$0(HrmRViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (IHeartRateRepository) this$0.getRepo(IHeartRateRepository.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAbnormalHighHrRecords$lambda$3(HrmRViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return IHeartRateRepository.DefaultImpls.getAllAbnormalHrHighDetailPagingSource$default(this$0.getMDataRepo(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAbnormalHrRecords$lambda$2(HrmRViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return IHeartRateRepository.DefaultImpls.getAllAbnormalHrDetailPagingSource$default(this$0.getMDataRepo(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAbnormalLowHrRecords$lambda$4(HrmRViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return IHeartRateRepository.DefaultImpls.getAllAbnormalHrLowDetailPagingSource$default(this$0.getMDataRepo(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAllManuallyAddedHrRecords$lambda$5(HrmRViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return IPagingSourceRepository.DefaultImpls.getAllRecordDetailPagingSource$default(this$0.getMDataRepo(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAllRecords$lambda$1(HrmRViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMDataRepo().getAllRecordDetailPagingSource(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryExceptionFibRecords$lambda$6(HrmRViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return IHeartRateRepository.DefaultImpls.getAllAbnormalFibDetailPagingSource$default(this$0.getMDataRepo(), null, 1, null);
    }

    @Override // com.xiaomi.fitness.relative.base.BasicRelativeDataViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void deleteRecord(@Nullable DailyRecordItem record) {
        if (record == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(record, null), 2, null);
        Logger.d("HrmViewModel", "deleteRecord " + record);
    }

    @NotNull
    public final MutableLiveData<Boolean> getLiveData() {
        return this.liveData;
    }

    public final void insertHrmRecord(long time, int hrm) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C27551(time, hrm, this, null), 2, null);
    }

    @NotNull
    public final LiveData<PagingData<SegmentItem>> queryAbnormalHighHrRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: oec
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrmRViewModel.queryAbnormalHighHrRecords$lambda$3(this.f29067a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<PagingData<AbnormalHrItem>> queryAbnormalHrRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: lec
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrmRViewModel.queryAbnormalHrRecords$lambda$2(this.f24969a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<PagingData<SegmentItem>> queryAbnormalLowHrRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: qec
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrmRViewModel.queryAbnormalLowHrRecords$lambda$4(this.f31436a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<PagingData<HrItem>> queryAllManuallyAddedHrRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: pec
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrmRViewModel.queryAllManuallyAddedHrRecords$lambda$5(this.f30317a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<PagingData<HrItem>> queryAllRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: nec
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrmRViewModel.queryAllRecords$lambda$1(this.f27849a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<PagingData<AbnormalFibItem>> queryExceptionFibRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: mec
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrmRViewModel.queryExceptionFibRecords$lambda$6(this.f26070a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }
}
