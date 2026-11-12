package com.xiaomi.fitness.rn.share.viewmodel;

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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.rn.share.viewmodel.DeviceShareDetailViewModel$loadDeviceShareList$2$1", f = "DeviceShareDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceShareDetailViewModel$loadDeviceShareList$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $code;
    final /* synthetic */ Function2<Integer, String, Unit> $error;
    final /* synthetic */ String $msg;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeviceShareDetailViewModel$loadDeviceShareList$2$1(Function2<? super Integer, ? super String, Unit> function2, int i, String str, Continuation<? super DeviceShareDetailViewModel$loadDeviceShareList$2$1> continuation) {
        super(2, continuation);
        this.$error = function2;
        this.$code = i;
        this.$msg = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceShareDetailViewModel$loadDeviceShareList$2$1(this.$error, this.$code, this.$msg, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$error.invoke(Boxing.boxInt(this.$code), this.$msg);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceShareDetailViewModel$loadDeviceShareList$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
