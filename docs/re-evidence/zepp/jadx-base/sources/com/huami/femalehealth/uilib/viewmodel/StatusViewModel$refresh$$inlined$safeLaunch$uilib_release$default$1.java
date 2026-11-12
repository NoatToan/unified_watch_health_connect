package com.huami.femalehealth.uilib.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.uilib.helper.ExtKt;
import com.huami.femalehealth.uilib.viewmodel.StatusViewModel.i;
import com.huami.femalehealth.uilib.widget.calendar.CalculationManager;
import com.huami.femalehealth.uilib.widget.calendar.StyleCatch;
import com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
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
@DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.StatusViewModel$refresh$$inlined$safeLaunch$uilib_release$default$1", f = "StatusViewModel.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
public final class StatusViewModel$refresh$$inlined$safeLaunch$uilib_release$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ StatusViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusViewModel$refresh$$inlined$safeLaunch$uilib_release$default$1(Continuation continuation, StatusViewModel statusViewModel) {
        super(2, continuation);
        this.c = statusViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        StatusViewModel$refresh$$inlined$safeLaunch$uilib_release$default$1 statusViewModel$refresh$$inlined$safeLaunch$uilib_release$default$1 = new StatusViewModel$refresh$$inlined$safeLaunch$uilib_release$default$1(continuation, this.c);
        statusViewModel$refresh$$inlined$safeLaunch$uilib_release$default$1.b = obj;
        return statusViewModel$refresh$$inlined$safeLaunch$uilib_release$default$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((StatusViewModel$refresh$$inlined$safeLaunch$uilib_release$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableLiveData mutableLiveData;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.c.getRefreshLiveData().postValue(ExtKt.toDateTriple(this.c.now));
            MutableLiveData<Triple<CalendarPeriodStyle, String, Object>> currentStyleLiveData = this.c.getCurrentStyleLiveData();
            CalculationManager calculationManager = CalculationManager.INSTANCE;
            DateTriple dateTriple = ExtKt.toDateTriple(this.c.now);
            StyleCatch styleCatch = this.c.styleCatch;
            BaseCardContentStyle baseCardContentStyleLongStyle$uilib_release = BaseCardContentStyle.INSTANCE.longStyle$uilib_release();
            StatusViewModel.i iVar = this.c.new i(null);
            this.b = currentStyleLiveData;
            this.a = 1;
            Object detailsContent = calculationManager.getDetailsContent(dateTriple, styleCatch, baseCardContentStyleLongStyle$uilib_release, iVar, this);
            if (detailsContent == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableLiveData = currentStyleLiveData;
            obj = detailsContent;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) this.b;
            ResultKt.throwOnFailure(obj);
        }
        mutableLiveData.postValue(obj);
        return Unit.INSTANCE;
    }
}
