package com.xiaomi.fitness.notify.extension;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.notify.extension.DeviceModelExtKt$getHuaMiInCall$1$inCall$1", f = "DeviceModelExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceModelExtKt$getHuaMiInCall$1$inCall$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InCall>, Object> {
    final /* synthetic */ WearableDeviceModel $this_getHuaMiInCall;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceModelExtKt$getHuaMiInCall$1$inCall$1(WearableDeviceModel wearableDeviceModel, Continuation<? super DeviceModelExtKt$getHuaMiInCall$1$inCall$1> continuation) {
        super(2, continuation);
        this.$this_getHuaMiInCall = wearableDeviceModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceModelExtKt$getHuaMiInCall$1$inCall$1(this.$this_getHuaMiInCall, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(this.$this_getHuaMiInCall.getDid(), DeviceSettingConfigKey.KEY_INCALL).valueToObject(InCall.class);
        if (objValueToObject instanceof InCall) {
            return (InCall) objValueToObject;
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InCall> continuation) {
        return ((DeviceModelExtKt$getHuaMiInCall$1$inCall$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
