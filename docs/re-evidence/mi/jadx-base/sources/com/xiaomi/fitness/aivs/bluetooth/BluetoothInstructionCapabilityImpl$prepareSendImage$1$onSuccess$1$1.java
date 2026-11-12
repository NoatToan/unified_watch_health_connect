package com.xiaomi.fitness.aivs.bluetooth;

import android.graphics.Bitmap;
import defpackage.e11;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.aivs.bluetooth.BluetoothInstructionCapabilityImpl$prepareSendImage$1$onSuccess$1$1", f = "BluetoothInstructionCapabilityImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BluetoothInstructionCapabilityImpl$prepareSendImage$1$onSuccess$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ e11 $it;
    int label;
    final /* synthetic */ BluetoothInstructionCapabilityImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothInstructionCapabilityImpl$prepareSendImage$1$onSuccess$1$1(BluetoothInstructionCapabilityImpl bluetoothInstructionCapabilityImpl, e11 e11Var, Bitmap bitmap, Continuation<? super BluetoothInstructionCapabilityImpl$prepareSendImage$1$onSuccess$1$1> continuation) {
        super(2, continuation);
        this.this$0 = bluetoothInstructionCapabilityImpl;
        this.$it = e11Var;
        this.$bitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BluetoothInstructionCapabilityImpl$prepareSendImage$1$onSuccess$1$1(this.this$0, this.$it, this.$bitmap, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.trySendImage(this.$it, this.$bitmap);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BluetoothInstructionCapabilityImpl$prepareSendImage$1$onSuccess$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
