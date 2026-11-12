package com.xiaomi.fitness.health.temperature;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.api.repository.ITemperatureRepository;
import com.xiaomi.fit.fitness.export.api.repository.ITemperatureTrendRepository;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureTrendItem;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.temperature.TemperatureViewModel;
import com.xiaomi.fitness.sport_eco.SportConstants;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0016\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001fJ\u0018\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0016J\u0016\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u001bR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/health/temperature/TemperatureViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "<init>", "()V", "mDataRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/ITemperatureRepository;", "getMDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ITemperatureRepository;", "mDataRepo$delegate", "Lkotlin/Lazy;", "tempTrendRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/ITemperatureTrendRepository;", "getTempTrendRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ITemperatureTrendRepository;", "tempTrendRepo$delegate", "temperatureTrendData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureTrendItem;", "getTemperatureTrendData", "()Landroidx/lifecycle/MutableLiveData;", "deleteRecord", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "insertBloodPressureRecord", SportConstants.KEY_TIMESTAMP, "", "value", "", "queryAllRecords", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;", "requestMonthGroupData", "endTimeSecond", "limit", "", "queryTemperatureTrend", "startTime", "endTime", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TemperatureViewModel extends BasicDataViewModel {

    /* JADX INFO: renamed from: mDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: k4p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TemperatureViewModel.mDataRepo_delegate$lambda$0(this.f23443a);
        }
    });

    /* JADX INFO: renamed from: tempTrendRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tempTrendRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: l4p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TemperatureViewModel.tempTrendRepo_delegate$lambda$1(this.f24666a);
        }
    });

    @NotNull
    private final MutableLiveData<List<TemperatureTrendItem>> temperatureTrendData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.temperature.TemperatureViewModel$deleteRecord$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.temperature.TemperatureViewModel$deleteRecord$1", f = "TemperatureViewModel.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
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
            return TemperatureViewModel.this.new AnonymousClass1(this.$record, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ITemperatureRepository mDataRepo = TemperatureViewModel.this.getMDataRepo();
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.temperature.TemperatureViewModel$insertBloodPressureRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.temperature.TemperatureViewModel$insertBloodPressureRecord$1", f = "TemperatureViewModel.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $timeStamp;
        final /* synthetic */ float $value;
        int label;
        final /* synthetic */ TemperatureViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25491(long j, float f, TemperatureViewModel temperatureViewModel, Continuation<? super C25491> continuation) {
            super(2, continuation);
            this.$timeStamp = j;
            this.$value = f;
            this.this$0 = temperatureViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25491(this.$timeStamp, this.$value, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TemperatureItem temperatureItem = new TemperatureItem(this.$timeStamp, null, Boxing.boxFloat(this.$value));
                temperatureItem.setSid("xiaomiwear_app_manually");
                ITemperatureRepository mDataRepo = this.this$0.getMDataRepo();
                this.label = 1;
                if (mDataRepo.addRecord(temperatureItem, this) == coroutine_suspended) {
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
            return ((C25491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.temperature.TemperatureViewModel$queryTemperatureTrend$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.temperature.TemperatureViewModel$queryTemperatureTrend$1", f = "TemperatureViewModel.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTime;
        final /* synthetic */ long $startTime;
        int label;
        final /* synthetic */ TemperatureViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25501(long j, long j2, TemperatureViewModel temperatureViewModel, Continuation<? super C25501> continuation) {
            super(2, continuation);
            this.$startTime = j;
            this.$endTime = j2;
            this.this$0 = temperatureViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25501(this.$startTime, this.$endTime, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object temperatureTrendData$default;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Logger.i("TemperatureViewModel", "queryTemperatureTrend before startTime:" + this.$startTime + "; endTime:" + this.$endTime);
                ITemperatureTrendRepository tempTrendRepo = this.this$0.getTempTrendRepo();
                long j = this.$startTime;
                long j2 = this.$endTime;
                this.label = 1;
                temperatureTrendData$default = ITemperatureTrendRepository.DefaultImpls.getTemperatureTrendData$default(tempTrendRepo, j, j2, 0, false, this, 12, null);
                if (temperatureTrendData$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                temperatureTrendData$default = obj;
            }
            List<TemperatureTrendItem> list = (List) temperatureTrendData$default;
            Logger.i("TemperatureViewModel", "queryTemperatureTrend after  startTime:" + this.$startTime + "; endTime:" + this.$endTime + "; size:" + list.size() + "; resultData:" + list);
            this.this$0.getTemperatureTrendData().postValue(list);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.temperature.TemperatureViewModel$requestMonthGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.temperature.TemperatureViewModel$requestMonthGroupData$1", f = "TemperatureViewModel.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25511(long j, int i, Continuation<? super C25511> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TemperatureViewModel.this.new C25511(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ITemperatureRepository mDataRepo = TemperatureViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = ITemperatureRepository.DefaultImpls.getTemperatureByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
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
            TemperatureViewModel.this.setHasMore(!map.isEmpty());
            Logger.i("TemperatureViewModel", "requestMonthData endTime " + this.$endTimeSecond + ";size " + map.size());
            TemperatureViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ITemperatureRepository getMDataRepo() {
        return (ITemperatureRepository) this.mDataRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ITemperatureTrendRepository getTempTrendRepo() {
        return (ITemperatureTrendRepository) this.tempTrendRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ITemperatureRepository mDataRepo_delegate$lambda$0(TemperatureViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (ITemperatureRepository) this$0.getRepo(ITemperatureRepository.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAllRecords$lambda$2(TemperatureViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMDataRepo().getAllRecordDetailPagingSource(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ITemperatureTrendRepository tempTrendRepo_delegate$lambda$1(TemperatureViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (ITemperatureTrendRepository) this$0.getRepo(ITemperatureTrendRepository.class);
    }

    public final void deleteRecord(@Nullable DailyRecordItem record) {
        if (record == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(record, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<List<TemperatureTrendItem>> getTemperatureTrendData() {
        return this.temperatureTrendData;
    }

    public final void insertBloodPressureRecord(long timeStamp, float value) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25491(timeStamp, value, this, null), 2, null);
    }

    @NotNull
    public final LiveData<PagingData<TemperatureItem>> queryAllRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: m4p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TemperatureViewModel.queryAllRecords$lambda$2(this.f25753a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public final void queryTemperatureTrend(long startTime, long endTime) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25501(startTime, endTime, this, null), 2, null);
    }

    @Override // com.xiaomi.fitness.base.BasicDataViewModel
    public void requestMonthGroupData(long endTimeSecond, int limit) {
        super.requestMonthGroupData(endTimeSecond, limit);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25511(endTimeSecond, limit, null), 2, null);
    }
}
