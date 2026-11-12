package com.huami.femalehealth.uilib.viewmodel;

import com.huami.femalehealth.logiclib.repo.MenstruationRepo;
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
@DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel$clearFemaleData$$inlined$safeLaunch$uilib_release$default$1", f = "FemaleMifitViewModel.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
public final class FemaleMifitViewModel$clearFemaleData$$inlined$safeLaunch$uilib_release$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ FemaleMifitViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FemaleMifitViewModel$clearFemaleData$$inlined$safeLaunch$uilib_release$default$1(Continuation continuation, FemaleMifitViewModel femaleMifitViewModel) {
        super(2, continuation);
        this.c = femaleMifitViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FemaleMifitViewModel$clearFemaleData$$inlined$safeLaunch$uilib_release$default$1 femaleMifitViewModel$clearFemaleData$$inlined$safeLaunch$uilib_release$default$1 = new FemaleMifitViewModel$clearFemaleData$$inlined$safeLaunch$uilib_release$default$1(continuation, this.c);
        femaleMifitViewModel$clearFemaleData$$inlined$safeLaunch$uilib_release$default$1.b = obj;
        return femaleMifitViewModel$clearFemaleData$$inlined$safeLaunch$uilib_release$default$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FemaleMifitViewModel$clearFemaleData$$inlined$safeLaunch$uilib_release$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MenstruationRepo menstruationRepo = this.c.menstruationRepo;
            this.a = 1;
            if (MenstruationRepo.clearLocalMenstruation$default(menstruationRepo, false, this, 1, null) == coroutine_suspended) {
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
