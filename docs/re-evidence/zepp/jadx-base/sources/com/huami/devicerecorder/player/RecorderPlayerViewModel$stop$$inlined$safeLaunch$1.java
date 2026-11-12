package com.huami.devicerecorder.player;

import com.huami.devicerecorder.model.PlayItemData;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/devicerecorder/model/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.devicerecorder.player.RecorderPlayerViewModel$stop$$inlined$safeLaunch$1", f = "RecorderPlayerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RecorderPlayerViewModel$stop$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ IRecorderPlayer.IPlayerCallback c;
    public final /* synthetic */ PlayItemData d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecorderPlayerViewModel$stop$$inlined$safeLaunch$1(Continuation continuation, IRecorderPlayer.IPlayerCallback iPlayerCallback, PlayItemData playItemData) {
        super(2, continuation);
        this.c = iPlayerCallback;
        this.d = playItemData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RecorderPlayerViewModel$stop$$inlined$safeLaunch$1 recorderPlayerViewModel$stop$$inlined$safeLaunch$1 = new RecorderPlayerViewModel$stop$$inlined$safeLaunch$1(continuation, this.c, this.d);
        recorderPlayerViewModel$stop$$inlined$safeLaunch$1.b = obj;
        return recorderPlayerViewModel$stop$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((RecorderPlayerViewModel$stop$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        IRecorderPlayer.IPlayerCallback iPlayerCallback = this.c;
        if (iPlayerCallback != null) {
            iPlayerCallback.onStop(this.d);
        }
        return Unit.INSTANCE;
    }
}
