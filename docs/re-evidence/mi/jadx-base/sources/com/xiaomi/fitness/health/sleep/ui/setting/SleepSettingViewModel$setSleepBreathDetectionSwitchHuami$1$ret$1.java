package com.xiaomi.fitness.health.sleep.ui.setting;

import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel$setSleepBreathDetectionSwitchHuami$1$ret$1", f = "SleepSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SleepSettingViewModel$setSleepBreathDetectionSwitchHuami$1$ret$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ boolean $switch;
    int label;
    final /* synthetic */ SleepSettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepSettingViewModel$setSleepBreathDetectionSwitchHuami$1$ret$1(SleepSettingViewModel sleepSettingViewModel, boolean z, Continuation<? super SleepSettingViewModel$setSleepBreathDetectionSwitchHuami$1$ret$1> continuation) {
        super(2, continuation);
        this.this$0 = sleepSettingViewModel;
        this.$switch = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepSettingViewModel$setSleepBreathDetectionSwitchHuami$1$ret$1(this.this$0, this.$switch, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel wearableDeviceModel = this.this$0.device;
        Intrinsics.checkNotNull(wearableDeviceModel);
        HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
        return Boxing.boxBoolean(huaMiApiCaller != null ? huaMiApiCaller.enableOsa(this.$switch) : false);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((SleepSettingViewModel$setSleepBreathDetectionSwitchHuami$1$ret$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
