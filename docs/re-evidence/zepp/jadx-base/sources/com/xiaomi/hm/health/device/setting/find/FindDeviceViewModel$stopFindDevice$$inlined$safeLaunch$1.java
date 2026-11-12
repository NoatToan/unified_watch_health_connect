package com.xiaomi.hm.health.device.setting.find;

import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
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

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.find.FindDeviceViewModel$stopFindDevice$$inlined$safeLaunch$1", f = "FindDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FindDeviceViewModel$stopFindDevice$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ FindDeviceViewModel c;
    public final /* synthetic */ HMMiLiDevice d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FindDeviceViewModel$stopFindDevice$$inlined$safeLaunch$1(Continuation continuation, FindDeviceViewModel findDeviceViewModel, HMMiLiDevice hMMiLiDevice) {
        super(2, continuation);
        this.c = findDeviceViewModel;
        this.d = hMMiLiDevice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FindDeviceViewModel$stopFindDevice$$inlined$safeLaunch$1 findDeviceViewModel$stopFindDevice$$inlined$safeLaunch$1 = new FindDeviceViewModel$stopFindDevice$$inlined$safeLaunch$1(continuation, this.c, this.d);
        findDeviceViewModel$stopFindDevice$$inlined$safeLaunch$1.b = obj;
        return findDeviceViewModel$stopFindDevice$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FindDeviceViewModel$stopFindDevice$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        IFindDeviceHandler iFindDeviceHandlerE = this.c.e();
        if (iFindDeviceHandlerE != null) {
            iFindDeviceHandlerE.b(this.d);
        }
        return Unit.INSTANCE;
    }
}
