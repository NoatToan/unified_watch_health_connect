package com.huami.femalehealth.uilib.viewmodel;

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
@DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$coroutineReRenderPrediction$$inlined$safeLaunch$uilib_release$default$1", f = "FemaleHealthViewModel.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
public final class FemaleHealthViewModel$coroutineReRenderPrediction$$inlined$safeLaunch$uilib_release$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ FemaleHealthViewModel c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FemaleHealthViewModel$coroutineReRenderPrediction$$inlined$safeLaunch$uilib_release$default$1(Continuation continuation, FemaleHealthViewModel femaleHealthViewModel, int i, int i2) {
        super(2, continuation);
        this.c = femaleHealthViewModel;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FemaleHealthViewModel$coroutineReRenderPrediction$$inlined$safeLaunch$uilib_release$default$1 femaleHealthViewModel$coroutineReRenderPrediction$$inlined$safeLaunch$uilib_release$default$1 = new FemaleHealthViewModel$coroutineReRenderPrediction$$inlined$safeLaunch$uilib_release$default$1(continuation, this.c, this.d, this.e);
        femaleHealthViewModel$coroutineReRenderPrediction$$inlined$safeLaunch$uilib_release$default$1.b = obj;
        return femaleHealthViewModel$coroutineReRenderPrediction$$inlined$safeLaunch$uilib_release$default$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FemaleHealthViewModel$coroutineReRenderPrediction$$inlined$safeLaunch$uilib_release$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FemaleHealthViewModel femaleHealthViewModel = this.c;
            int i2 = this.d;
            int i3 = this.e;
            this.a = 1;
            if (femaleHealthViewModel.k(i2, i3, this) == coroutine_suspended) {
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
