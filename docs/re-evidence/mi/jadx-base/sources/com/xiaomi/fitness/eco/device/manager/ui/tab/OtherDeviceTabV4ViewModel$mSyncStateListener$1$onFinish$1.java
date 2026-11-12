package com.xiaomi.fitness.eco.device.manager.ui.tab;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabV4ViewModel$mSyncStateListener$1$onFinish$1", f = "OtherDeviceTabV4ViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OtherDeviceTabV4ViewModel$mSyncStateListener$1$onFinish$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $did;
    int label;
    final /* synthetic */ OtherDeviceTabV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtherDeviceTabV4ViewModel$mSyncStateListener$1$onFinish$1(OtherDeviceTabV4ViewModel otherDeviceTabV4ViewModel, String str, Continuation<? super OtherDeviceTabV4ViewModel$mSyncStateListener$1$onFinish$1> continuation) {
        super(2, continuation);
        this.this$0 = otherDeviceTabV4ViewModel;
        this.$did = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OtherDeviceTabV4ViewModel$mSyncStateListener$1$onFinish$1(this.this$0, this.$did, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.updateConnectStatus(this.$did, null, false, 7);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OtherDeviceTabV4ViewModel$mSyncStateListener$1$onFinish$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
