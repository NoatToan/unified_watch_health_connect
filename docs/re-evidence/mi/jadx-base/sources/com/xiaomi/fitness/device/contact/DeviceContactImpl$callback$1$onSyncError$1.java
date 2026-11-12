package com.xiaomi.fitness.device.contact;

import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.extensions.DeviceSyncExtKt;
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
@DebugMetadata(c = "com.xiaomi.fitness.device.contact.DeviceContactImpl$callback$1$onSyncError$1", f = "DeviceContactImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceContactImpl$callback$1$onSyncError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OnSyncCallback $callback;
    final /* synthetic */ int $code;
    final /* synthetic */ String $did;
    final /* synthetic */ int $originType;
    final /* synthetic */ int $type;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceContactImpl$callback$1$onSyncError$1(int i, String str, int i2, OnSyncCallback onSyncCallback, int i3, Continuation<? super DeviceContactImpl$callback$1$onSyncError$1> continuation) {
        super(2, continuation);
        this.$type = i;
        this.$did = str;
        this.$code = i2;
        this.$callback = onSyncCallback;
        this.$originType = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceContactImpl$callback$1$onSyncError$1(this.$type, this.$did, this.$code, this.$callback, this.$originType, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DeviceSyncExtKt.logi("Type(" + this.$type + ") call error did=" + this.$did + ", code=" + this.$code);
        OnSyncCallback onSyncCallback = this.$callback;
        if (onSyncCallback != null) {
            onSyncCallback.onError(this.$did, this.$originType, this.$code);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceContactImpl$callback$1$onSyncError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
