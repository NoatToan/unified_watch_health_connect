package com.xiaomi.fitness.health.hrm;

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
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalHrItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.hrm.HrmViewModel;
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
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u0015J\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0019J\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0\u0019J\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001d0\u0019J\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001d0\u0019J\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0019J\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001d0\u0019J\u0010\u0010'\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010)J\u0018\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020\u0017J\u0018\u0010-\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020\u0017J\u0018\u0010.\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020\u0017J\u0018\u0010/\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020\u0017J\u0018\u00100\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020\u0017R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/HrmViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "<init>", "()V", "mDataRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IHeartRateRepository;", "getMDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IHeartRateRepository;", "mDataRepo$delegate", "Lkotlin/Lazy;", "liveData", "Landroidx/lifecycle/MutableLiveData;", "", "getLiveData", "()Landroidx/lifecycle/MutableLiveData;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "insertHrmRecord", "time", "", "hrm", "", "queryRestingHrmRecords", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "beginInSecond", "queryAllRecords", "Landroidx/paging/PagingData;", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "queryAbnormalHrRecords", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalHrItem;", "queryAbnormalHighHrRecords", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "queryAbnormalLowHrRecords", "queryAllManuallyAddedHrRecords", "queryExceptionFibRecords", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;", "deleteRecord", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "requestMonthFibGroupData", "endTimeSecond", "limit", "requestMonthManualGroupData", "requestMonthHighGroupData", "requestMonthLowGroupData", "requestHrAndPaceGroupData", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HrmViewModel extends BasicDataViewModel {

    @NotNull
    public static final String TAG = "HrmViewModel";

    /* JADX INFO: renamed from: mDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bfc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HrmViewModel.mDataRepo_delegate$lambda$0(this.f4148a);
        }
    });

    @NotNull
    private final MutableLiveData<Boolean> liveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.hrm.HrmViewModel$deleteRecord$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.hrm.HrmViewModel$deleteRecord$1", f = "HrmViewModel.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
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
            return HrmViewModel.this.new AnonymousClass1(this.$record, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IHeartRateRepository mDataRepo = HrmViewModel.this.getMDataRepo();
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.hrm.HrmViewModel$insertHrmRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.hrm.HrmViewModel$insertHrmRecord$1", f = "HrmViewModel.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $hrm;
        final /* synthetic */ long $time;
        int label;
        final /* synthetic */ HrmViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24701(long j, int i, HrmViewModel hrmViewModel, Continuation<? super C24701> continuation) {
            super(2, continuation);
            this.$time = j;
            this.$hrm = i;
            this.this$0 = hrmViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24701(this.$time, this.$hrm, this.this$0, continuation);
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
            return ((C24701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.hrm.HrmViewModel$requestHrAndPaceGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.hrm.HrmViewModel$requestHrAndPaceGroupData$1", f = "HrmViewModel.kt", i = {}, l = {SportReportBaseParser.ReportType.oxygenConcentration}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24711(long j, int i, Continuation<? super C24711> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HrmViewModel.this.new C24711(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IHeartRateRepository mDataRepo = HrmViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = IHeartRateRepository.DefaultImpls.getLactateThresholdFibByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
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
            HrmViewModel.this.setHasMore(!map.isEmpty());
            Logger.i("HrmViewModel", "requestHrAndPaceGroupData endTime " + this.$endTimeSecond + ";size " + map.size());
            HrmViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.hrm.HrmViewModel$requestMonthFibGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.hrm.HrmViewModel$requestMonthFibGroupData$1", f = "HrmViewModel.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24721(long j, int i, Continuation<? super C24721> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HrmViewModel.this.new C24721(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IHeartRateRepository mDataRepo = HrmViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = IHeartRateRepository.DefaultImpls.getManualAbnormalFibByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
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
            HrmViewModel.this.setHasMore(!map.isEmpty());
            Logger.i("HrmViewModel", "requestMonthFibGroupData endTime " + this.$endTimeSecond + ";size " + map.size());
            HrmViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.hrm.HrmViewModel$requestMonthHighGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.hrm.HrmViewModel$requestMonthHighGroupData$1", f = "HrmViewModel.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24731(long j, int i, Continuation<? super C24731> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HrmViewModel.this.new C24731(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IHeartRateRepository mDataRepo = HrmViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = IHeartRateRepository.DefaultImpls.getManualAbnormalHrHighByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
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
            HrmViewModel.this.setHasMore(!map.isEmpty());
            Logger.i("HrmViewModel", "requestMonthHighGroupData endTime " + this.$endTimeSecond + ";size " + map.size());
            HrmViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.hrm.HrmViewModel$requestMonthLowGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.hrm.HrmViewModel$requestMonthLowGroupData$1", f = "HrmViewModel.kt", i = {}, l = {SportReportBaseParser.ReportType.entryTime}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24741(long j, int i, Continuation<? super C24741> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HrmViewModel.this.new C24741(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IHeartRateRepository mDataRepo = HrmViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = IHeartRateRepository.DefaultImpls.getManualAbnormalHrLowByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
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
            HrmViewModel.this.setHasMore(!map.isEmpty());
            Logger.i("HrmViewModel", "requestMonthLowGroupData endTime " + this.$endTimeSecond + ";size " + map.size());
            HrmViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.hrm.HrmViewModel$requestMonthManualGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.hrm.HrmViewModel$requestMonthManualGroupData$1", f = "HrmViewModel.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24751(long j, int i, Continuation<? super C24751> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HrmViewModel.this.new C24751(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IHeartRateRepository mDataRepo = HrmViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = IHeartRateRepository.DefaultImpls.getManualHrByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
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
            HrmViewModel.this.setHasMore(!map.isEmpty());
            Logger.i("HrmViewModel", "requestMonthManualGroupData endTime " + this.$endTimeSecond + ";size " + map.size());
            HrmViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IHeartRateRepository getMDataRepo() {
        return (IHeartRateRepository) this.mDataRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IHeartRateRepository mDataRepo_delegate$lambda$0(HrmViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (IHeartRateRepository) this$0.getRepo(IHeartRateRepository.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAbnormalHighHrRecords$lambda$3(HrmViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return IHeartRateRepository.DefaultImpls.getAllAbnormalHrHighDetailPagingSource$default(this$0.getMDataRepo(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAbnormalHrRecords$lambda$2(HrmViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return IHeartRateRepository.DefaultImpls.getAllAbnormalHrDetailPagingSource$default(this$0.getMDataRepo(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAbnormalLowHrRecords$lambda$4(HrmViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return IHeartRateRepository.DefaultImpls.getAllAbnormalHrLowDetailPagingSource$default(this$0.getMDataRepo(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAllManuallyAddedHrRecords$lambda$5(HrmViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return IPagingSourceRepository.DefaultImpls.getAllRecordDetailPagingSource$default(this$0.getMDataRepo(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAllRecords$lambda$1(HrmViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMDataRepo().getAllRecordDetailPagingSource(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryExceptionFibRecords$lambda$6(HrmViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return IHeartRateRepository.DefaultImpls.getAllAbnormalFibDetailPagingSource$default(this$0.getMDataRepo(), null, 1, null);
    }

    public static /* synthetic */ void requestHrAndPaceGroupData$default(HrmViewModel hrmViewModel, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 60;
        }
        hrmViewModel.requestHrAndPaceGroupData(j, i);
    }

    public static /* synthetic */ void requestMonthFibGroupData$default(HrmViewModel hrmViewModel, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 60;
        }
        hrmViewModel.requestMonthFibGroupData(j, i);
    }

    public static /* synthetic */ void requestMonthHighGroupData$default(HrmViewModel hrmViewModel, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 60;
        }
        hrmViewModel.requestMonthHighGroupData(j, i);
    }

    public static /* synthetic */ void requestMonthLowGroupData$default(HrmViewModel hrmViewModel, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 60;
        }
        hrmViewModel.requestMonthLowGroupData(j, i);
    }

    public static /* synthetic */ void requestMonthManualGroupData$default(HrmViewModel hrmViewModel, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 60;
        }
        hrmViewModel.requestMonthManualGroupData(j, i);
    }

    @Override // com.xiaomi.fitness.base.BasicDataViewModel, com.xiaomi.fitness.baseui.AbsViewModel
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
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24701(time, hrm, this, null), 2, null);
    }

    @NotNull
    public final LiveData<PagingData<SegmentItem>> queryAbnormalHighHrRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: ffc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrmViewModel.queryAbnormalHighHrRecords$lambda$3(this.f17730a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<PagingData<AbnormalHrItem>> queryAbnormalHrRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: afc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrmViewModel.queryAbnormalHrRecords$lambda$2(this.f946a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<PagingData<SegmentItem>> queryAbnormalLowHrRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: efc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrmViewModel.queryAbnormalLowHrRecords$lambda$4(this.f16588a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<PagingData<HrItem>> queryAllManuallyAddedHrRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: zec
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrmViewModel.queryAllManuallyAddedHrRecords$lambda$5(this.f41190a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<PagingData<HrItem>> queryAllRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: dfc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrmViewModel.queryAllRecords$lambda$1(this.f15479a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<PagingData<AbnormalFibItem>> queryExceptionFibRecords() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: cfc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrmViewModel.queryExceptionFibRecords$lambda$6(this.f5277a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<DailyHrReport> queryRestingHrmRecords(long beginInSecond) {
        return getMDataRepo().getMonthRestHrReport(beginInSecond);
    }

    public final void requestHrAndPaceGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24711(endTimeSecond, limit, null), 2, null);
    }

    public final void requestMonthFibGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24721(endTimeSecond, limit, null), 2, null);
    }

    public final void requestMonthHighGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24731(endTimeSecond, limit, null), 2, null);
    }

    public final void requestMonthLowGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24741(endTimeSecond, limit, null), 2, null);
    }

    public final void requestMonthManualGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24751(endTimeSecond, limit, null), 2, null);
    }
}
