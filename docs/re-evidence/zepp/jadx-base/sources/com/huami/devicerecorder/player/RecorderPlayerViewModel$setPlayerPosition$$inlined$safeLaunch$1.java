package com.huami.devicerecorder.player;

import com.huami.devicerecorder.model.PlayItemData;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/devicerecorder/model/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.devicerecorder.player.RecorderPlayerViewModel$setPlayerPosition$$inlined$safeLaunch$1", f = "RecorderPlayerViewModel.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
public final class RecorderPlayerViewModel$setPlayerPosition$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ RecorderPlayerViewModel c;
    public final /* synthetic */ PlayItemData d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecorderPlayerViewModel$setPlayerPosition$$inlined$safeLaunch$1(Continuation continuation, RecorderPlayerViewModel recorderPlayerViewModel, PlayItemData playItemData, int i) {
        super(2, continuation);
        this.c = recorderPlayerViewModel;
        this.d = playItemData;
        this.e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RecorderPlayerViewModel$setPlayerPosition$$inlined$safeLaunch$1 recorderPlayerViewModel$setPlayerPosition$$inlined$safeLaunch$1 = new RecorderPlayerViewModel$setPlayerPosition$$inlined$safeLaunch$1(continuation, this.c, this.d, this.e);
        recorderPlayerViewModel$setPlayerPosition$$inlined$safeLaunch$1.b = obj;
        return recorderPlayerViewModel$setPlayerPosition$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((RecorderPlayerViewModel$setPlayerPosition$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(this.c.currentItem, this.d)) {
                HMLog.info(RecorderPlayerViewModel.TAG, new RecorderPlayerViewModel.j(this.e, this.d));
                HMMusicPlayer hMMusicPlayerB = this.c.b();
                int i2 = this.e;
                this.a = 1;
                obj = hMMusicPlayerB.setPosition(i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                HMLog.info(RecorderPlayerViewModel.TAG, new RecorderPlayerViewModel.k(this.d, this.c));
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (((Boolean) obj).booleanValue()) {
            this.d.setPosition(this.e);
        }
        return Unit.INSTANCE;
    }
}
