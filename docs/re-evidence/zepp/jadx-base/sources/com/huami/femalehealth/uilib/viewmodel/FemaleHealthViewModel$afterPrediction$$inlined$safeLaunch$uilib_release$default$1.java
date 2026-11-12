package com.huami.femalehealth.uilib.viewmodel;

import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/femalehealth/uilib/viewmodel/FHBaseViewModel$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$afterPrediction$$inlined$safeLaunch$uilib_release$default$1", f = "FemaleHealthViewModel.kt", i = {0}, l = {155}, m = "invokeSuspend", n = {"start$iv"}, s = {"J$0"})
public final class FemaleHealthViewModel$afterPrediction$$inlined$safeLaunch$uilib_release$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ FemaleHealthViewModel c;
    public final /* synthetic */ DateTriple d;
    public long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FemaleHealthViewModel$afterPrediction$$inlined$safeLaunch$uilib_release$default$1(Continuation continuation, FemaleHealthViewModel femaleHealthViewModel, DateTriple dateTriple) {
        super(2, continuation);
        this.c = femaleHealthViewModel;
        this.d = dateTriple;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FemaleHealthViewModel$afterPrediction$$inlined$safeLaunch$uilib_release$default$1 femaleHealthViewModel$afterPrediction$$inlined$safeLaunch$uilib_release$default$1 = new FemaleHealthViewModel$afterPrediction$$inlined$safeLaunch$uilib_release$default$1(continuation, this.c, this.d);
        femaleHealthViewModel$afterPrediction$$inlined$safeLaunch$uilib_release$default$1.b = obj;
        return femaleHealthViewModel$afterPrediction$$inlined$safeLaunch$uilib_release$default$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FemaleHealthViewModel$afterPrediction$$inlined$safeLaunch$uilib_release$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        long j;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.e = jCurrentTimeMillis;
            this.a = 1;
            if (DelayKt.delay(200L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.e;
            ResultKt.throwOnFailure(obj);
        }
        this.c.m(this.d);
        HMLog.info("FemaleHealthViewModel", new FemaleHealthViewModel.a(System.currentTimeMillis() - j));
        return Unit.INSTANCE;
    }
}
