package com.xiaomi.fitness.device.contact;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
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
@DebugMetadata(c = "com.xiaomi.fitness.device.contact.DeviceContactImpl$WidgetDeviceSyncCallbackImpl$onSyncSuccess$1", f = "DeviceContactImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceContactImpl$WidgetDeviceSyncCallbackImpl$onSyncSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $did;
    final /* synthetic */ Object $result;
    final /* synthetic */ int $type;
    int label;
    final /* synthetic */ DeviceContactImpl this$0;
    final /* synthetic */ DeviceContactImpl.WidgetDeviceSyncCallbackImpl this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceContactImpl$WidgetDeviceSyncCallbackImpl$onSyncSuccess$1(DeviceContactImpl deviceContactImpl, String str, int i, Object obj, DeviceContactImpl.WidgetDeviceSyncCallbackImpl widgetDeviceSyncCallbackImpl, Continuation<? super DeviceContactImpl$WidgetDeviceSyncCallbackImpl$onSyncSuccess$1> continuation) {
        super(2, continuation);
        this.this$0 = deviceContactImpl;
        this.$did = str;
        this.$type = i;
        this.$result = obj;
        this.this$1 = widgetDeviceSyncCallbackImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceContactImpl$WidgetDeviceSyncCallbackImpl$onSyncSuccess$1(this.this$0, this.$did, this.$type, this.$result, this.this$1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) this.this$0.mWearableDeviceManager.getDeviceModel(this.$did);
        this.this$0.getSyncObservers().dispatchResult(this.$did, this.$type, true, this.$result);
        this.this$0.getSyncTypeArray().put(this.$type, 1);
        DeviceContactImpl deviceContactImpl = this.this$0;
        List list = deviceContactImpl.mSyncTypes;
        List list2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSyncTypes");
            list = null;
        }
        if (deviceContactImpl.isSyncFinish(list)) {
            DeviceContactImpl deviceContactImpl2 = this.this$0;
            List list3 = deviceContactImpl2.mSyncTypes;
            if (list3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSyncTypes");
            } else {
                list2 = list3;
            }
            if (deviceContactImpl2.isSyncSuccess(list2)) {
                this.this$0.doOnSyncFinish(wearableDeviceModel, this.this$1.isAuto, true);
            } else {
                this.this$0.doOnSyncFinish(wearableDeviceModel, this.this$1.isAuto, false);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceContactImpl$WidgetDeviceSyncCallbackImpl$onSyncSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
