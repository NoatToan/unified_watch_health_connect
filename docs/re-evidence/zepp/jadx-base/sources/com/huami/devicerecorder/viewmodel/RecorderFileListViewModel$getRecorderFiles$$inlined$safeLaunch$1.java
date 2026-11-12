package com.huami.devicerecorder.viewmodel;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/devicerecorder/model/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.devicerecorder.viewmodel.RecorderFileListViewModel$getRecorderFiles$$inlined$safeLaunch$1", f = "RecorderFileListViewModel.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
public final class RecorderFileListViewModel$getRecorderFiles$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ RecorderFileListViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecorderFileListViewModel$getRecorderFiles$$inlined$safeLaunch$1(Continuation continuation, RecorderFileListViewModel recorderFileListViewModel) {
        super(2, continuation);
        this.c = recorderFileListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RecorderFileListViewModel$getRecorderFiles$$inlined$safeLaunch$1 recorderFileListViewModel$getRecorderFiles$$inlined$safeLaunch$1 = new RecorderFileListViewModel$getRecorderFiles$$inlined$safeLaunch$1(continuation, this.c);
        recorderFileListViewModel$getRecorderFiles$$inlined$safeLaunch$1.b = obj;
        return recorderFileListViewModel$getRecorderFiles$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((RecorderFileListViewModel$getRecorderFiles$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RecorderFileListViewModel recorderFileListViewModel = this.c;
            this.a = 1;
            if (recorderFileListViewModel.c(this) == coroutine_suspended) {
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
