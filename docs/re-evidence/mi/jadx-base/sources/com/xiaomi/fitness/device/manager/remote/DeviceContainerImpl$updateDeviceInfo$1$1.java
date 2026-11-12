package com.xiaomi.fitness.device.manager.remote;

import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.dao.DeviceDao;
import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
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
@DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$updateDeviceInfo$1$1", f = "DeviceContainerImpl.kt", i = {}, l = {338}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceContainerImpl$updateDeviceInfo$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WearableDevice $device;
    int label;
    final /* synthetic */ DeviceContainerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceContainerImpl$updateDeviceInfo$1$1(DeviceContainerImpl deviceContainerImpl, WearableDevice wearableDevice, Continuation<? super DeviceContainerImpl$updateDeviceInfo$1$1> continuation) {
        super(2, continuation);
        this.this$0 = deviceContainerImpl;
        this.$device = wearableDevice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceContainerImpl$updateDeviceInfo$1$1(this.this$0, this.$device, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DeviceDao deviceDao = this.this$0.mDeviceDao;
            WearableDevice wearableDevice = this.$device;
            this.label = 1;
            obj = deviceDao.update(wearableDevice, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        DeviceModelExtKt.logi("update device info success " + ((Number) obj).intValue());
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceContainerImpl$updateDeviceInfo$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
