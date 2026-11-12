package com.xiaomi.hm.health.device.setting.viewmodel;

import com.xiaomi.hm.health.device.setting.viewmodel.DeviceUpdateCheckerViewModel.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceUpdateCheckerViewModel$startCheck$$inlined$safeLaunch$1", f = "DeviceUpdateCheckerViewModel.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceUpdateCheckerViewModel$startCheck$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ DeviceUpdateCheckerViewModel c;
    public final /* synthetic */ Channel d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceUpdateCheckerViewModel$startCheck$$inlined$safeLaunch$1(Continuation continuation, DeviceUpdateCheckerViewModel deviceUpdateCheckerViewModel, Channel channel) {
        super(2, continuation);
        this.c = deviceUpdateCheckerViewModel;
        this.d = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DeviceUpdateCheckerViewModel$startCheck$$inlined$safeLaunch$1 deviceUpdateCheckerViewModel$startCheck$$inlined$safeLaunch$1 = new DeviceUpdateCheckerViewModel$startCheck$$inlined$safeLaunch$1(continuation, this.c, this.d);
        deviceUpdateCheckerViewModel$startCheck$$inlined$safeLaunch$1.b = obj;
        return deviceUpdateCheckerViewModel$startCheck$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceUpdateCheckerViewModel$startCheck$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceUpdateCheckerViewModel.c cVar = this.c.new c(this.d, null);
                this.a = 1;
                if (TimeoutKt.withTimeout(30000L, cVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (TimeoutCancellationException unused) {
            this.c.getResultLiveData().postValue(DeviceUpdateCheckerViewModel.Result.Timeout.INSTANCE);
        } finally {
            this.c.isChecking = false;
            this.c.resultChannel = null;
        }
        return Unit.INSTANCE;
    }
}
