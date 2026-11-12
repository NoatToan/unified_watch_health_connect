package com.huami.femalehealth.uilib.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel.x;
import com.huami.femalehealth.uilib.widget.calendar.CalculationManager;
import com.huami.femalehealth.uilib.widget.calendar.StyleCatch;
import com.huami.femalehealth.uilib.widget.calendar.content.BaseCardContentStyle;
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
@DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$refreshCardContent$$inlined$safeLaunch$uilib_release$default$1", f = "FemaleHealthViewModel.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
public final class FemaleHealthViewModel$refreshCardContent$$inlined$safeLaunch$uilib_release$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ DateTriple c;
    public final /* synthetic */ FemaleHealthViewModel d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FemaleHealthViewModel$refreshCardContent$$inlined$safeLaunch$uilib_release$default$1(Continuation continuation, DateTriple dateTriple, FemaleHealthViewModel femaleHealthViewModel) {
        super(2, continuation);
        this.c = dateTriple;
        this.d = femaleHealthViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FemaleHealthViewModel$refreshCardContent$$inlined$safeLaunch$uilib_release$default$1 femaleHealthViewModel$refreshCardContent$$inlined$safeLaunch$uilib_release$default$1 = new FemaleHealthViewModel$refreshCardContent$$inlined$safeLaunch$uilib_release$default$1(continuation, this.c, this.d);
        femaleHealthViewModel$refreshCardContent$$inlined$safeLaunch$uilib_release$default$1.b = obj;
        return femaleHealthViewModel$refreshCardContent$$inlined$safeLaunch$uilib_release$default$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FemaleHealthViewModel$refreshCardContent$$inlined$safeLaunch$uilib_release$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableLiveData mutableLiveData;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DateTriple dateTriple = this.c;
            if (dateTriple != null) {
                MutableLiveData<String> stateCardContentLiveData = this.d.getStateCardContentLiveData();
                CalculationManager calculationManager = CalculationManager.INSTANCE;
                StyleCatch styleCatch = this.d.styleCatch;
                BaseCardContentStyle baseCardContentStyleLongStyle$uilib_release = BaseCardContentStyle.INSTANCE.longStyle$uilib_release();
                FemaleHealthViewModel.x xVar = this.d.new x(null);
                this.b = dateTriple;
                this.e = stateCardContentLiveData;
                this.a = 1;
                Object detailsContent = calculationManager.getDetailsContent(dateTriple, styleCatch, baseCardContentStyleLongStyle$uilib_release, xVar, this);
                if (detailsContent == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = stateCardContentLiveData;
                obj = detailsContent;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mutableLiveData = (MutableLiveData) this.e;
        ResultKt.throwOnFailure(obj);
        mutableLiveData.postValue(((Triple) obj).getSecond());
        return Unit.INSTANCE;
    }
}
