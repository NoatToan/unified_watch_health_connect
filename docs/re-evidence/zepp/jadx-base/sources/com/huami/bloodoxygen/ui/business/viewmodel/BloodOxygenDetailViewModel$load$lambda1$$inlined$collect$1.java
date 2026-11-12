package com.huami.bloodoxygen.ui.business.viewmodel;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.huami.bigdata.statistics.bloodoxygen.BloodOxygenStatistics;
import com.huami.bigdata.statistics.core.resource.Resource;
import com.huami.bigdata.statistics.core.resource.ResourceKt;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.usecase.bigdata.GetClickSpo2BigDataUseCase;
import com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailViewModel.b;
import com.huami.bloodoxygen.ui.utils.ChartDataHelper;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailViewModel$load$lambda-1$$inlined$collect$1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public final class BloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1 implements FlowCollector<List<? extends ClickMeasuredSpo2>> {
    public final /* synthetic */ BloodOxygenDetailViewModel a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ long d;

    /* JADX INFO: renamed from: com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailViewModel$load$lambda-1$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1", "emit"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailViewModel$load$lambda-1$$inlined$collect$1", f = "BloodOxygenDetailViewModel.kt", i = {0, 1, 2, 3}, l = {135, 136, 137, 138}, m = "emit", n = {"this", "this", "this", "this"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return BloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1.this.emit(null, this);
        }
    }

    public BloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1(BloodOxygenDetailViewModel bloodOxygenDetailViewModel, String str, Context context, long j) {
        this.a = bloodOxygenDetailViewModel;
        this.b = str;
        this.c = context;
        this.d = j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(List<? extends ClickMeasuredSpo2> list, @NotNull Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        BloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1 bloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1;
        Resource resource;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.b = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object week = anonymousClass1.a;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.b;
        if (i2 == 0) {
            ResultKt.throwOnFailure(week);
            HMLog.info$default(null, this.a.new b(list), 1, null);
            int i3 = BloodOxygenDetailViewModel.WhenMappings.$EnumSwitchMapping$0[this.a.timeMode.ordinal()];
            if (i3 == 1) {
                GetClickSpo2BigDataUseCase getClickSpo2BigDataUseCase = this.a.clickSpo2BigDataUseCase;
                String str = this.b;
                anonymousClass1.d = this;
                anonymousClass1.b = 1;
                week = getClickSpo2BigDataUseCase.getWeek(str, anonymousClass1);
                if (week == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1 = this;
                resource = (Resource) week;
            } else if (i3 == 2) {
                GetClickSpo2BigDataUseCase getClickSpo2BigDataUseCase2 = this.a.clickSpo2BigDataUseCase;
                String str2 = this.b;
                anonymousClass1.d = this;
                anonymousClass1.b = 2;
                week = getClickSpo2BigDataUseCase2.getMonth(str2, anonymousClass1);
                if (week == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1 = this;
                resource = (Resource) week;
            } else if (i3 != 3) {
                GetClickSpo2BigDataUseCase getClickSpo2BigDataUseCase3 = this.a.clickSpo2BigDataUseCase;
                String str3 = this.b;
                anonymousClass1.d = this;
                anonymousClass1.b = 4;
                week = getClickSpo2BigDataUseCase3.getDay(str3, anonymousClass1);
                if (week == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1 = this;
                resource = (Resource) week;
            } else {
                GetClickSpo2BigDataUseCase getClickSpo2BigDataUseCase4 = this.a.clickSpo2BigDataUseCase;
                String str4 = this.b;
                anonymousClass1.d = this;
                anonymousClass1.b = 3;
                week = getClickSpo2BigDataUseCase4.getYear(str4, anonymousClass1);
                if (week == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1 = this;
                resource = (Resource) week;
            }
        } else if (i2 == 1) {
            bloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1 = (BloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1) anonymousClass1.d;
            ResultKt.throwOnFailure(week);
            resource = (Resource) week;
        } else if (i2 == 2) {
            bloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1 = (BloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1) anonymousClass1.d;
            ResultKt.throwOnFailure(week);
            resource = (Resource) week;
        } else if (i2 == 3) {
            bloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1 = (BloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1) anonymousClass1.d;
            ResultKt.throwOnFailure(week);
            resource = (Resource) week;
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1 = (BloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1) anonymousClass1.d;
            ResultKt.throwOnFailure(week);
            resource = (Resource) week;
        }
        BloodOxygenStatistics bloodOxygenStatistics = (BloodOxygenStatistics) ResourceKt.getOrNull(resource);
        if (bloodOxygenStatistics == null) {
            bloodOxygenStatistics = new BloodOxygenStatistics(0, 0, 0.0d, 0, 15, null);
        }
        HMLog.info$default(null, new BloodOxygenDetailViewModel.c(bloodOxygenStatistics), 1, null);
        bloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1.a.getChartBuilderLiveData().postValue(ChartDataHelper.INSTANCE.getChartParams(bloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1.c, bloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1.d, bloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1.a.timeMode, bloodOxygenStatistics.getDataArray()));
        bloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1.a.getStatisticsLiveData().postValue(bloodOxygenStatistics);
        return Unit.INSTANCE;
    }
}
