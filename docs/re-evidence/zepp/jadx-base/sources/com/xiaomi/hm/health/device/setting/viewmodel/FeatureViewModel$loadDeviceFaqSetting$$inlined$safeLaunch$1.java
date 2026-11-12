package com.xiaomi.hm.health.device.setting.viewmodel;

import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$loadDeviceFaqSetting$$inlined$safeLaunch$1", f = "FeatureViewModel.kt", i = {}, l = {64, 66}, m = "invokeSuspend", n = {}, s = {})
public final class FeatureViewModel$loadDeviceFaqSetting$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ FeatureViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureViewModel$loadDeviceFaqSetting$$inlined$safeLaunch$1(Continuation continuation, FeatureViewModel featureViewModel) {
        super(2, continuation);
        this.c = featureViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FeatureViewModel$loadDeviceFaqSetting$$inlined$safeLaunch$1 featureViewModel$loadDeviceFaqSetting$$inlined$safeLaunch$1 = new FeatureViewModel$loadDeviceFaqSetting$$inlined$safeLaunch$1(continuation, this.c);
        featureViewModel$loadDeviceFaqSetting$$inlined$safeLaunch$1.b = obj;
        return featureViewModel$loadDeviceFaqSetting$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FeatureViewModel$loadDeviceFaqSetting$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.a = 1;
        if (DelayKt.delay(1000L, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        HMBaseDevice hMBaseDeviceFindDevice = this.c.findDevice();
        if (hMBaseDeviceFindDevice != null) {
            CoroutineDispatcher io2 = Dispatchers.getIO();
            FeatureViewModel.f fVar = new FeatureViewModel.f(hMBaseDeviceFindDevice, this.c, null);
            this.a = 2;
            if (BuildersKt.withContext(io2, fVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
