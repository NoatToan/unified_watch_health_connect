package com.xiaomi.fitness.rn.sdk;

import com.xiaomi.fitness.devicesettings.bluttooth.wearmode.SwitchWearModeViewModel;
import com.xiaomi.smarthome.core.entity.net.NetError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 176)
@DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSDKCompat$http$1$onFailure$1", f = "MiJiaSDKCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MiJiaSDKCompat$http$1$onFailure$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NetError $error;
    final /* synthetic */ Function2<Integer, String, Unit> $onError;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MiJiaSDKCompat$http$1$onFailure$1(NetError netError, Function2<? super Integer, ? super String, Unit> function2, Continuation<? super MiJiaSDKCompat$http$1$onFailure$1> continuation) {
        super(2, continuation);
        this.$error = netError;
        this.$onError = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiJiaSDKCompat$http$1$onFailure$1(this.$error, this.$onError, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        NetError netError = this.$error;
        if (netError != null) {
            this.$onError.invoke(Boxing.boxInt(netError.getCode()), this.$error.getDetail());
        } else {
            this.$onError.invoke(Boxing.boxInt(SwitchWearModeViewModel.EXIT_ACCESSORY_MODE), null);
        }
        return Unit.INSTANCE;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        NetError netError = this.$error;
        if (netError != null) {
            this.$onError.invoke(Integer.valueOf(netError.getCode()), this.$error.getDetail());
        } else {
            this.$onError.invoke(Integer.valueOf(SwitchWearModeViewModel.EXIT_ACCESSORY_MODE), null);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MiJiaSDKCompat$http$1$onFailure$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
