package com.xiaomi.fitness.health.bloodpressure;

import androidx.health.connect.client.records.OvulationTestRecord;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.api.repository.IBloodPressureRepository;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel;
import com.xiaomi.fitness.health.bloodpressure.repository.IBloodPressurePreRepository;
import com.xiaomi.fitness.sport_eco.SportConstants;
import defpackage.tz2;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b.\u0010/J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/health/bloodpressure/BloodPressureViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "", "key", "Landroidx/lifecycle/LiveData;", "Ltz2;", "getMeasureRemindDataLiveData", "(Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "", "dataMap", "", "updateRemindConfig", "(Ljava/util/Map;)V", "", "low", OvulationTestRecord.Result.HIGH, DailyReportKey.pulse, "", SportConstants.KEY_TIMESTAMP, "insertBloodPressureRecord", "(IILjava/lang/Integer;J)V", "Landroidx/paging/PagingData;", "Lcom/xiaomi/fit/fitness/export/data/item/BloodPressureItem;", "queryAllRecords", "()Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "record", "deleteRecord", "(Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "endTimeSecond", "limit", "requestMonthGroupData", "(JI)V", "Lcom/xiaomi/fitness/health/bloodpressure/repository/IBloodPressurePreRepository;", "mPrefRepo", "Lcom/xiaomi/fitness/health/bloodpressure/repository/IBloodPressurePreRepository;", "getMPrefRepo", "()Lcom/xiaomi/fitness/health/bloodpressure/repository/IBloodPressurePreRepository;", "setMPrefRepo", "(Lcom/xiaomi/fitness/health/bloodpressure/repository/IBloodPressurePreRepository;)V", "Lcom/xiaomi/fit/fitness/export/api/repository/IBloodPressureRepository;", "mDataRepo$delegate", "Lkotlin/Lazy;", "getMDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IBloodPressureRepository;", "mDataRepo", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodPressureViewModel extends BasicDataViewModel {

    /* JADX INFO: renamed from: mDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: t03
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BloodPressureViewModel.mDataRepo_delegate$lambda$0(this.f34160a);
        }
    });
    public IBloodPressurePreRepository mPrefRepo;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel$deleteRecord$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel$deleteRecord$1", f = "BloodPressureViewModel.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
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
            return BloodPressureViewModel.this.new AnonymousClass1(this.$record, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IBloodPressureRepository mDataRepo = BloodPressureViewModel.this.getMDataRepo();
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel$insertBloodPressureRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel$insertBloodPressureRecord$1", f = "BloodPressureViewModel.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $high;
        final /* synthetic */ int $low;
        final /* synthetic */ Integer $pulse;
        final /* synthetic */ long $timeStamp;
        int label;
        final /* synthetic */ BloodPressureViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24121(long j, int i, int i2, Integer num, BloodPressureViewModel bloodPressureViewModel, Continuation<? super C24121> continuation) {
            super(2, continuation);
            this.$timeStamp = j;
            this.$high = i;
            this.$low = i2;
            this.$pulse = num;
            this.this$0 = bloodPressureViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24121(this.$timeStamp, this.$high, this.$low, this.$pulse, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BloodPressureItem bloodPressureItem = new BloodPressureItem(this.$timeStamp, this.$high, this.$low);
                bloodPressureItem.setPulse(this.$pulse);
                bloodPressureItem.setSid("xiaomiwear_app_manually");
                IBloodPressureRepository mDataRepo = this.this$0.getMDataRepo();
                this.label = 1;
                if (mDataRepo.addRecord(bloodPressureItem, this) == coroutine_suspended) {
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
            return ((C24121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel$requestMonthGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel$requestMonthGroupData$1", f = "BloodPressureViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24131(long j, int i, Continuation<? super C24131> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BloodPressureViewModel.this.new C24131(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IBloodPressureRepository mDataRepo = BloodPressureViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = IBloodPressureRepository.DefaultImpls.getBloodPressureByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
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
            BloodPressureViewModel.this.setHasMore(!map.isEmpty());
            Logger.i("BloodPressureViewModel", "requestMonthData endTime " + this.$endTimeSecond + ";size " + map.size());
            BloodPressureViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IBloodPressureRepository getMDataRepo() {
        return (IBloodPressureRepository) this.mDataRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IBloodPressureRepository mDataRepo_delegate$lambda$0(BloodPressureViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (IBloodPressureRepository) this$0.getRepo(IBloodPressureRepository.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAllRecords$lambda$1(BloodPressureViewModel this$0) {
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
    public final IBloodPressurePreRepository getMPrefRepo() {
        IBloodPressurePreRepository iBloodPressurePreRepository = this.mPrefRepo;
        if (iBloodPressurePreRepository != null) {
            return iBloodPressurePreRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPrefRepo");
        return null;
    }

    @NotNull
    public final LiveData<tz2> getMeasureRemindDataLiveData(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getMPrefRepo().getMeasureRemindDataLiveData(key);
    }

    public final void insertBloodPressureRecord(int low, int high, @Nullable Integer pulse, long timeStamp) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24121(timeStamp, high, low, pulse, this, null), 2, null);
    }

    @NotNull
    public final LiveData<PagingData<BloodPressureItem>> queryAllRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: u03
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BloodPressureViewModel.queryAllRecords$lambda$1(this.f35234a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @Override // com.xiaomi.fitness.base.BasicDataViewModel
    public void requestMonthGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24131(endTimeSecond, limit, null), 2, null);
    }

    public final void setMPrefRepo(@NotNull IBloodPressurePreRepository iBloodPressurePreRepository) {
        Intrinsics.checkNotNullParameter(iBloodPressurePreRepository, "<set-?>");
        this.mPrefRepo = iBloodPressurePreRepository;
    }

    public final void updateRemindConfig(@NotNull Map<String, ? extends tz2> dataMap) {
        Intrinsics.checkNotNullParameter(dataMap, "dataMap");
        getMPrefRepo().updateRemindConfig(dataMap);
    }
}
