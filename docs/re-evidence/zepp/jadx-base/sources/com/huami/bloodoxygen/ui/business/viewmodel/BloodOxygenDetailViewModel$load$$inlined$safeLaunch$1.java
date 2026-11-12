package com.huami.bloodoxygen.ui.business.viewmodel;

import android.content.Context;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.ui.utils.TimeUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/bloodoxygen/ui/coroutines/ExtKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailViewModel$load$$inlined$safeLaunch$1", f = "BloodOxygenDetailViewModel.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
public final class BloodOxygenDetailViewModel$load$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ BloodOxygenDetailViewModel c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Context f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodOxygenDetailViewModel$load$$inlined$safeLaunch$1(Continuation continuation, BloodOxygenDetailViewModel bloodOxygenDetailViewModel, long j, String str, Context context) {
        super(2, continuation);
        this.c = bloodOxygenDetailViewModel;
        this.d = j;
        this.e = str;
        this.f = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BloodOxygenDetailViewModel$load$$inlined$safeLaunch$1 bloodOxygenDetailViewModel$load$$inlined$safeLaunch$1 = new BloodOxygenDetailViewModel$load$$inlined$safeLaunch$1(continuation, this.c, this.d, this.e, this.f);
        bloodOxygenDetailViewModel$load$$inlined$safeLaunch$1.b = obj;
        return bloodOxygenDetailViewModel$load$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BloodOxygenDetailViewModel$load$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        long firstDayOfWeekTime;
        long lastDayOfWeekTime;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = BloodOxygenDetailViewModel.WhenMappings.$EnumSwitchMapping$0[this.c.com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment.TIME_MODE java.lang.String.ordinal()];
            if (i2 == 1) {
                TimeUtils timeUtils = TimeUtils.INSTANCE;
                firstDayOfWeekTime = timeUtils.getFirstDayOfWeekTime(this.d);
                lastDayOfWeekTime = timeUtils.getLastDayOfWeekTime(this.d);
            } else if (i2 == 2) {
                TimeUtils timeUtils2 = TimeUtils.INSTANCE;
                firstDayOfWeekTime = timeUtils2.getFirstDayOfMonthTime(this.d);
                lastDayOfWeekTime = timeUtils2.getLastDayOfMonthTime(this.d);
            } else if (i2 != 3) {
                TimeUtils timeUtils3 = TimeUtils.INSTANCE;
                firstDayOfWeekTime = timeUtils3.getDayStartTime(this.d);
                lastDayOfWeekTime = timeUtils3.getDayEndTime(this.d);
            } else {
                TimeUtils timeUtils4 = TimeUtils.INSTANCE;
                firstDayOfWeekTime = timeUtils4.getFirstDayOfYearTime(this.d);
                lastDayOfWeekTime = timeUtils4.getLastDayOfYearTime(this.d);
            }
            long j = firstDayOfWeekTime;
            Flow<List<ClickMeasuredSpo2>> flowExecute = this.c.getLocalClickSpo2ListFlowUseCase.execute(j, lastDayOfWeekTime);
            BloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1 bloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1 = new BloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1(this.c, this.e, this.f, j);
            this.a = 1;
            if (flowExecute.collect(bloodOxygenDetailViewModel$load$lambda1$$inlined$collect$1, this) == coroutine_suspended) {
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
}
