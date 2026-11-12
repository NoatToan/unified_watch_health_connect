package com.xiaomi.fitness.devicesettings.huami.screenwake;

import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.settingitem.settingitem.LiftWristBrightView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.screenwake.ScreenWakeForHuamiViewModel$syncConfig$2$1", f = "ScreenWakeForHuamiViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenWakeForHuamiViewModel$syncConfig$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ WearableDeviceModel $it;
    final /* synthetic */ LiftWristBrightView $wristConfig;
    int label;
    final /* synthetic */ ScreenWakeForHuamiViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenWakeForHuamiViewModel$syncConfig$2$1(WearableDeviceModel wearableDeviceModel, ScreenWakeForHuamiViewModel screenWakeForHuamiViewModel, LiftWristBrightView liftWristBrightView, Continuation<? super ScreenWakeForHuamiViewModel$syncConfig$2$1> continuation) {
        super(2, continuation);
        this.$it = wearableDeviceModel;
        this.this$0 = screenWakeForHuamiViewModel;
        this.$wristConfig = liftWristBrightView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScreenWakeForHuamiViewModel$syncConfig$2$1(this.$it, this.this$0, this.$wristConfig, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(DeviceModelExtKt.isL66(this.$it) ? com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.writeSettingSync(this.$it, this.this$0.convertToDisplayAndBrightnessV2(this.$wristConfig)) : com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.enableWristBright(this.$it, this.this$0.convertToLiftWristConfig(this.$wristConfig)));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((ScreenWakeForHuamiViewModel$syncConfig$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
