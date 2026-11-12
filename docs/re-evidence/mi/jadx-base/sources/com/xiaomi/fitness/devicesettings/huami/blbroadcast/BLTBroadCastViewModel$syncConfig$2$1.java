package com.xiaomi.fitness.devicesettings.huami.blbroadcast;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.BluetoothBroadcast;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.blbroadcast.BLTBroadCastViewModel$syncConfig$2$1", f = "BLTBroadCastViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BLTBroadCastViewModel$syncConfig$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ WearableDeviceModel $it;
    int label;
    final /* synthetic */ BLTBroadCastViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BLTBroadCastViewModel$syncConfig$2$1(WearableDeviceModel wearableDeviceModel, boolean z, BLTBroadCastViewModel bLTBroadCastViewModel, Continuation<? super BLTBroadCastViewModel$syncConfig$2$1> continuation) {
        super(2, continuation);
        this.$it = wearableDeviceModel;
        this.$isEnabled = z;
        this.this$0 = bLTBroadCastViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BLTBroadCastViewModel$syncConfig$2$1(this.$it, this.$isEnabled, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean zEnableConnectedAdv = DeviceModelExtKt.enableConnectedAdv(this.$it, this.$isEnabled);
        BluetoothBroadcast bluetoothBroadcast = new BluetoothBroadcast();
        bluetoothBroadcast.setEnable(this.$isEnabled);
        DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
        WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        companion.sendSettingItem(mDeviceModel.getDid(), DeviceSettingConfigKey.KEY_BLUETOOTH_BROADCAST, bluetoothBroadcast);
        return Boxing.boxBoolean(zEnableConnectedAdv);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((BLTBroadCastViewModel$syncConfig$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
