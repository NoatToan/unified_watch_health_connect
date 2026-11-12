package com.xiaomi.fitness.eco.device.contact;

import com.xiaomi.fitness.eco.device.contact.export.EcoSyncStateListener;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.eco.device.contact.EcoDeviceContactImpl$sendFile$1$onComplete$1", f = "EcoDeviceContactImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EcoDeviceContactImpl$sendFile$1$onComplete$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $did;
    final /* synthetic */ EcoSyncStateListener $listener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcoDeviceContactImpl$sendFile$1$onComplete$1(EcoSyncStateListener ecoSyncStateListener, String str, Continuation<? super EcoDeviceContactImpl$sendFile$1$onComplete$1> continuation) {
        super(2, continuation);
        this.$listener = ecoSyncStateListener;
        this.$did = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EcoDeviceContactImpl$sendFile$1$onComplete$1(this.$listener, this.$did, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EcoSyncStateListener ecoSyncStateListener = this.$listener;
        if (ecoSyncStateListener != null) {
            String str = this.$did;
            Intrinsics.checkNotNull(str);
            ecoSyncStateListener.onFinish(str, 0);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EcoDeviceContactImpl$sendFile$1$onComplete$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
