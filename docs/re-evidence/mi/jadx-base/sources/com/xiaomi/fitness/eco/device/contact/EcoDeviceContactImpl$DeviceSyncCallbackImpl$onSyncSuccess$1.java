package com.xiaomi.fitness.eco.device.contact;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import defpackage.xzi;
import java.util.List;
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
@DebugMetadata(c = "com.xiaomi.fitness.eco.device.contact.EcoDeviceContactImpl$DeviceSyncCallbackImpl$onSyncSuccess$1", f = "EcoDeviceContactImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EcoDeviceContactImpl$DeviceSyncCallbackImpl$onSyncSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $did;
    final /* synthetic */ Object $result;
    final /* synthetic */ int $type;
    int label;
    final /* synthetic */ EcoDeviceContactImpl this$0;
    final /* synthetic */ EcoDeviceContactImpl.DeviceSyncCallbackImpl this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcoDeviceContactImpl$DeviceSyncCallbackImpl$onSyncSuccess$1(EcoDeviceContactImpl ecoDeviceContactImpl, String str, int i, Object obj, EcoDeviceContactImpl.DeviceSyncCallbackImpl deviceSyncCallbackImpl, Continuation<? super EcoDeviceContactImpl$DeviceSyncCallbackImpl$onSyncSuccess$1> continuation) {
        super(2, continuation);
        this.this$0 = ecoDeviceContactImpl;
        this.$did = str;
        this.$type = i;
        this.$result = obj;
        this.this$1 = deviceSyncCallbackImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EcoDeviceContactImpl$DeviceSyncCallbackImpl$onSyncSuccess$1(this.this$0, this.$did, this.$type, this.$result, this.this$1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) this.this$0.mDeviceManager.getDeviceModel(this.$did);
        this.this$0.getMEcoSyncObservers().dispatchResult(this.$did, this.$type, true, this.$result);
        this.this$0.getSyncTypeArray().put(this.$type, 1);
        EcoDeviceContactImpl ecoDeviceContactImpl = this.this$0;
        List list = ecoDeviceContactImpl.mSyncTypes;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSyncTypes");
            list = null;
        }
        if (ecoDeviceContactImpl.isSyncFinish(list)) {
            this.this$0.doOnSyncFinish(ecoDeviceModel, this.this$1.isAuto, true);
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), xzi.c);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EcoDeviceContactImpl$DeviceSyncCallbackImpl$onSyncSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
