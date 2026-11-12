package com.xiaomi.fitness.health.weight;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.repository.IWeightRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.record.BodyComposition;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.weight.WeightViewModel;
import com.xiaomi.fitness.util.HealthUtil;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00170\u0016J2\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00190\u00162\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\u001e\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00190!0\u0016J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u001eH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/health/weight/WeightViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "<init>", "()V", "mDataRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IWeightRepository;", "getMDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IWeightRepository;", "mDataRepo$delegate", "Lkotlin/Lazy;", "addWeight", "", "weightTimeStamp", "", "weight", "", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "deleteRecord", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "queryAllRecords", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "queryStatisticWeightRecord", "", "beginInSecond", "composition", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/BodyComposition;", "leftOffset", "", "rightOffset", "queryWeightLatestDetail", "", "requestMonthGroupData", "endTimeSecond", "limit", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightViewModel extends BasicDataViewModel {

    @NotNull
    public static final String TAG = "WeightViewModel";

    /* JADX INFO: renamed from: mDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ehr
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WeightViewModel.mDataRepo_delegate$lambda$0(this.f16658a);
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.weight.WeightViewModel$addWeight$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.weight.WeightViewModel$addWeight$1", f = "WeightViewModel.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $weight;
        final /* synthetic */ long $weightTimeStamp;
        int label;
        final /* synthetic */ WeightViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, long j, WeightViewModel weightViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$weight = f;
            this.$weightTimeStamp = j;
            this.this$0 = weightViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$weight, this.$weightTimeStamp, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Float fBoxFloat;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                float height = HealthUtil.getHeight();
                if (height > 0.0f) {
                    fBoxFloat = Boxing.boxFloat(this.$weight / ((float) Math.pow(height / 100, 2.0d)));
                } else {
                    fBoxFloat = null;
                }
                WeightItem weightItem = new WeightItem(this.$weightTimeStamp, this.$weight, fBoxFloat);
                weightItem.setSid("xiaomiwear_app_manually");
                IWeightRepository mDataRepo = this.this$0.getMDataRepo();
                this.label = 1;
                if (mDataRepo.addRecord(weightItem, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.weight.WeightViewModel$addWeight$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.weight.WeightViewModel$addWeight$2", f = "WeightViewModel.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WeightItem $weightItem;
        int label;
        final /* synthetic */ WeightViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WeightItem weightItem, WeightViewModel weightViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$weightItem = weightItem;
            this.this$0 = weightViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$weightItem, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.$weightItem.setSid("xiaomiwear_app_manually");
                IWeightRepository mDataRepo = this.this$0.getMDataRepo();
                WeightItem weightItem = this.$weightItem;
                this.label = 1;
                if (mDataRepo.addRecord(weightItem, this) == coroutine_suspended) {
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
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.weight.WeightViewModel$deleteRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.weight.WeightViewModel$deleteRecord$1", f = "WeightViewModel.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DailyRecordItem $record;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25721(DailyRecordItem dailyRecordItem, Continuation<? super C25721> continuation) {
            super(2, continuation);
            this.$record = dailyRecordItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WeightViewModel.this.new C25721(this.$record, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IWeightRepository mDataRepo = WeightViewModel.this.getMDataRepo();
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
            return ((C25721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.weight.WeightViewModel$requestMonthGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.weight.WeightViewModel$requestMonthGroupData$1", f = "WeightViewModel.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25731(long j, int i, Continuation<? super C25731> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WeightViewModel.this.new C25731(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IWeightRepository mDataRepo = WeightViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = IWeightRepository.DefaultImpls.getWeightByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
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
            WeightViewModel.this.setHasMore(!map.isEmpty());
            Logger.i(WeightViewModel.TAG, "requestMonthData endTime " + this.$endTimeSecond + ";size " + map.size());
            WeightViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IWeightRepository getMDataRepo() {
        return (IWeightRepository) this.mDataRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IWeightRepository mDataRepo_delegate$lambda$0(WeightViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (IWeightRepository) this$0.getRepo(IWeightRepository.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAllRecords$lambda$1(WeightViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMDataRepo().getAllRecordDetailPagingSource(null);
    }

    public final void addWeight(long weightTimeStamp, float weight) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(weight, weightTimeStamp, this, null), 2, null);
    }

    public final void deleteRecord(@Nullable DailyRecordItem record) {
        if (record == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25721(record, null), 2, null);
    }

    @NotNull
    public final LiveData<PagingData<WeightItem>> queryAllRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: ghr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WeightViewModel.queryAllRecords$lambda$1(this.f19012a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<List<WeightItem>> queryStatisticWeightRecord(long beginInSecond, @NotNull BodyComposition composition, int leftOffset, int rightOffset) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        return getMDataRepo().getBodyCompositionList(composition, beginInSecond, FitnessDateUtils.getCurrentTZOffsetInSec(), leftOffset, rightOffset);
    }

    @NotNull
    public final LiveData<Map<BodyComposition, List<WeightItem>>> queryWeightLatestDetail() {
        ArrayList arrayList = new ArrayList();
        ListExtKt.add(arrayList, BodyComposition.WEIGHT);
        ListExtKt.add(arrayList, BodyComposition.BODY_FAT_RATE);
        ListExtKt.add(arrayList, BodyComposition.MUSCLE_RATE);
        return getMDataRepo().getBodyCompositionList(arrayList, System.currentTimeMillis() / ((long) 1000), FitnessDateUtils.getCurrentTZOffsetInSec(), 2, 0);
    }

    @Override // com.xiaomi.fitness.base.BasicDataViewModel
    public void requestMonthGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25731(endTimeSecond, limit, null), 2, null);
    }

    public final void addWeight(@NotNull WeightItem weightItem) {
        Intrinsics.checkNotNullParameter(weightItem, "weightItem");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass2(weightItem, this, null), 2, null);
    }
}
