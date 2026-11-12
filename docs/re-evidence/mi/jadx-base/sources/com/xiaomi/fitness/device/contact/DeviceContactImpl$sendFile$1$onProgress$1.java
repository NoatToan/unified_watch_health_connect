package com.xiaomi.fitness.device.contact;

import com.xiaomi.fitness.device.contact.export.SyncStateListener;
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
@DebugMetadata(c = "com.xiaomi.fitness.device.contact.DeviceContactImpl$sendFile$1$onProgress$1", f = "DeviceContactImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceContactImpl$sendFile$1$onProgress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $did;
    final /* synthetic */ SyncStateListener $listener;
    final /* synthetic */ int $sentCount;
    final /* synthetic */ int $totalCount;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceContactImpl$sendFile$1$onProgress$1(int i, SyncStateListener syncStateListener, String str, int i2, Continuation<? super DeviceContactImpl$sendFile$1$onProgress$1> continuation) {
        super(2, continuation);
        this.$sentCount = i;
        this.$listener = syncStateListener;
        this.$did = str;
        this.$totalCount = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceContactImpl$sendFile$1$onProgress$1(this.$sentCount, this.$listener, this.$did, this.$totalCount, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$sentCount <= 0) {
            SyncStateListener syncStateListener = this.$listener;
            if (syncStateListener != null) {
                String str = this.$did;
                Intrinsics.checkNotNull(str);
                syncStateListener.onStart(str);
            }
        } else {
            SyncStateListener syncStateListener2 = this.$listener;
            if (syncStateListener2 != null) {
                String str2 = this.$did;
                Intrinsics.checkNotNull(str2);
                syncStateListener2.onSyncing(str2, (this.$sentCount * 100) / this.$totalCount);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceContactImpl$sendFile$1$onProgress$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
