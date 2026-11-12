package com.huami.bloodpressure_ui.month;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.bigdata.statistics.bloodpressure.BloodPressureDateData;
import com.huami.bigdata.statistics.bloodpressure.BloodPressureStatistics;
import com.huami.bigdata.statistics.core.resource.Resource;
import com.huami.bigdata.statistics.core.resource.ResourceKt;
import com.huami.bloodpressure_core.dc.bigdata.BloodPressureBigDataUserCaseDelegate;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import com.huami.bloodpressure_ui.base.BaseBloodPressureViewModel;
import com.huami.bloodpressure_ui.chart.BloodPressureEmptyStyleStatus;
import com.huami.bloodpressure_ui.ext.TimeEx;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.c;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/bloodpressure_ui/month/BloodPressureMonthViewModel;", "Lcom/huami/bloodpressure_ui/base/BaseBloodPressureViewModel;", "", "timeStamp", "", "loadData", "Lcom/huami/bloodpressure_core/dc/bigdata/BloodPressureBigDataUserCaseDelegate;", "h", "Lcom/huami/bloodpressure_core/dc/bigdata/BloodPressureBigDataUserCaseDelegate;", "iBloodPressureBigDataUseCase", "<init>", "(Lcom/huami/bloodpressure_core/dc/bigdata/BloodPressureBigDataUserCaseDelegate;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureMonthViewModel extends BaseBloodPressureViewModel {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final BloodPressureBigDataUserCaseDelegate iBloodPressureBigDataUseCase;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_ui.month.BloodPressureMonthViewModel$loadData$1", f = "BloodPressureMonthViewModel.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureMonthViewModel.this.new a(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ArrayList arrayList;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BloodPressureBigDataUserCaseDelegate bloodPressureBigDataUserCaseDelegate = BloodPressureMonthViewModel.this.iBloodPressureBigDataUseCase;
                long j = this.c;
                this.a = 1;
                obj = bloodPressureBigDataUserCaseDelegate.getMonth(j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BloodPressureStatistics bloodPressureStatistics = (BloodPressureStatistics) ResourceKt.getOrNull((Resource) obj);
            MutableLiveData mutableLiveData = BloodPressureMonthViewModel.this.get_analyseList();
            if (bloodPressureStatistics == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                arrayList.add(Boxing.boxInt(c.roundToInt(bloodPressureStatistics.getAvgSbp())));
                arrayList.add(Boxing.boxInt(c.roundToInt(bloodPressureStatistics.getAvgDbp())));
            }
            mutableLiveData.postValue(arrayList);
            List<BloodPressureDateData> dataArray = bloodPressureStatistics != null ? bloodPressureStatistics.getDataArray() : null;
            if (dataArray != null && !dataArray.isEmpty()) {
                z = false;
            }
            if (z) {
                MutableLiveData mutableLiveData2 = BloodPressureMonthViewModel.this.get_headStatus();
                TimeFormatEx timeFormatEx = TimeFormatEx.INSTANCE;
                mutableLiveData2.postValue(new BloodPressureEmptyStyleStatus(timeFormatEx.formatTimeYMD(this.c) + " - " + timeFormatEx.formatTimeYMD(this.d), false, null, 4, null));
            }
            BloodPressureMonthViewModel.this.get_bigDataChartList().postValue(dataArray);
            return Unit.INSTANCE;
        }
    }

    public BloodPressureMonthViewModel(@NotNull BloodPressureBigDataUserCaseDelegate bloodPressureBigDataUserCaseDelegate) {
        this.iBloodPressureBigDataUseCase = bloodPressureBigDataUserCaseDelegate;
    }

    @Override // com.huami.bloodpressure_ui.base.BaseBloodPressureViewModel
    public void loadData(long timeStamp) {
        TimeEx timeEx = TimeEx.INSTANCE;
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(timeEx.getFirstDayOfMonthTime(timeStamp), timeEx.getLastDayOfMonthTime(timeStamp), null), 2, null);
    }
}
