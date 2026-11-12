package com.huami.femalehealth.uilib.viewmodel;

import com.huami.calendarview.Calendar;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.calculation.FHCalculation;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.uilib.viewmodel.StatusViewModel.a;
import com.huami.femalehealth.uilib.viewmodel.StatusViewModel.b;
import com.huami.femalehealth.uilib.viewmodel.StatusViewModel.c;
import com.huami.femalehealth.uilib.viewmodel.StatusViewModel.d;
import com.huami.femalehealth.uilib.viewmodel.StatusViewModel.e;
import com.huami.femalehealth.uilib.widget.calendar.CalculationManager;
import com.huami.femalehealth.uilib.widget.calendar.StyleCatch;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/femalehealth/uilib/viewmodel/FHBaseViewModel$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.StatusViewModel$calculation$$inlined$safeLaunch$uilib_release$default$1", f = "StatusViewModel.kt", i = {}, l = {149, 177}, m = "invokeSuspend", n = {}, s = {})
public final class StatusViewModel$calculation$$inlined$safeLaunch$uilib_release$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ StatusViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusViewModel$calculation$$inlined$safeLaunch$uilib_release$default$1(Continuation continuation, StatusViewModel statusViewModel) {
        super(2, continuation);
        this.c = statusViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        StatusViewModel$calculation$$inlined$safeLaunch$uilib_release$default$1 statusViewModel$calculation$$inlined$safeLaunch$uilib_release$default$1 = new StatusViewModel$calculation$$inlined$safeLaunch$uilib_release$default$1(continuation, this.c);
        statusViewModel$calculation$$inlined$safeLaunch$uilib_release$default$1.b = obj;
        return statusViewModel$calculation$$inlined$safeLaunch$uilib_release$default$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((StatusViewModel$calculation$$inlined$safeLaunch$uilib_release$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        CalculationManager calculationManager = CalculationManager.INSTANCE;
        StatusViewModel.a aVar = this.c.new a();
        StatusViewModel.b bVar = this.c.new b(null);
        StatusViewModel.c cVar = this.c.new c();
        this.a = 1;
        if (CalculationManager.putMonthStyle$default(calculationManager, null, aVar, bVar, cVar, this, 1, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (FHCalculation.INSTANCE.getBasicInputValue().getEnablePredict()) {
            DateHelper dateHelper = DateHelper.INSTANCE;
            DateTriple dateTripleOffsetDay = dateHelper.offsetDay(101, AidKt.toMilli(new DateTriple(this.c.now.getYear(), this.c.now.getMonth(), dateHelper.getMonthOfDay(this.c.now.getYear(), this.c.now.getMonth()))).getValue());
            CalculationManager calculationManager2 = CalculationManager.INSTANCE;
            Calendar calendar = this.c.now;
            StyleCatch styleCatch = this.c.styleCatch;
            StatusViewModel.d dVar = this.c.new d(null);
            StatusViewModel.e eVar = this.c.new e();
            this.a = 2;
            if (calculationManager2.predictionMenstruation(calendar, dateTripleOffsetDay, styleCatch, dVar, null, eVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            this.c.b();
        }
        return Unit.INSTANCE;
    }
}
