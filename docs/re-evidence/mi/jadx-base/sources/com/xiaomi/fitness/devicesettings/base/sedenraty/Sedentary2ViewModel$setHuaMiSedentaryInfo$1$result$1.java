package com.xiaomi.fitness.devicesettings.base.sedenraty;

import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import defpackage.xc6;
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
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.sedenraty.Sedentary2ViewModel$setHuaMiSedentaryInfo$1$result$1", f = "Sedentary2ViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Sedentary2ViewModel$setHuaMiSedentaryInfo$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ Sedentary2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sedentary2ViewModel$setHuaMiSedentaryInfo$1$result$1(Sedentary2ViewModel sedentary2ViewModel, Continuation<? super Sedentary2ViewModel$setHuaMiSedentaryInfo$1$result$1> continuation) {
        super(2, continuation);
        this.this$0 = sedentary2ViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Sedentary2ViewModel$setHuaMiSedentaryInfo$1$result$1(this.this$0, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0097  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WearableDeviceModel deviceModel;
        WearableDeviceModel deviceModel2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        WearableDeviceModel deviceModel3 = this.this$0.getDeviceModel();
        Intrinsics.checkNotNull(deviceModel3);
        boolean z = true;
        if (DeviceModelExtKt.isL66(deviceModel3)) {
            xc6.d("setHuaMiSedentaryInfo l66");
            StandAlertConfig huaMiSedentaryConfig = this.this$0.getSedentaryModel().getHuaMiSedentaryConfig(this.this$0.getIsSupportBreakTime());
            WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
            WearableDeviceModel deviceModel4 = this.this$0.getDeviceModel();
            Intrinsics.checkNotNull(deviceModel4);
            HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel4));
            boolean zSyncStandAlertConfig = huaMiApiCaller != null ? huaMiApiCaller.syncStandAlertConfig(huaMiSedentaryConfig) : false;
            Logger.i(this.this$0.getTAG(), "L66 syncStandAlertConfig enable = " + huaMiSedentaryConfig.getEnable() + ", res = " + zSyncStandAlertConfig);
            if (zSyncStandAlertConfig && (deviceModel2 = this.this$0.getDeviceModel()) != null) {
                DeviceSettingManager.INSTANCE.getInstance().sendSettingItem(deviceModel2.getDid(), DeviceSettingConfigKey.KEY_SEDENTARY_REMIND, this.this$0.convertSedentary2Config(huaMiSedentaryConfig));
            }
            if (!zSyncStandAlertConfig) {
                z = false;
            }
        } else {
            xc6.d("setHuaMiSedentaryInfo not l66");
            HMSedentaryConfig hMSedentaryConfig = this.this$0.getSedentaryModel().getHMSedentaryConfig();
            WearableDeviceManager deviceManagerExtKt2 = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
            WearableDeviceModel deviceModel5 = this.this$0.getDeviceModel();
            Intrinsics.checkNotNull(deviceModel5);
            HuamiApiCaller huaMiApiCaller2 = deviceManagerExtKt2.getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel5));
            boolean sedentary = huaMiApiCaller2 != null ? huaMiApiCaller2.setSedentary(hMSedentaryConfig) : false;
            if (sedentary && (deviceModel = this.this$0.getDeviceModel()) != null) {
                DeviceSettingManager.INSTANCE.getInstance().sendSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KEY_SEDENTARY_REMIND, this.this$0.convertSedentary2Config(hMSedentaryConfig));
            }
            if (!sedentary) {
                z = false;
            }
        }
        return Boxing.boxBoolean(z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((Sedentary2ViewModel$setHuaMiSedentaryInfo$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
