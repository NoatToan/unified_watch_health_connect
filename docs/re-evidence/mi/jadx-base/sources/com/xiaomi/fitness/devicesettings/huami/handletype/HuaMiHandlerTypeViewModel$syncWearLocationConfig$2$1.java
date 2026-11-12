package com.xiaomi.fitness.devicesettings.huami.handletype;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.WearHand;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.handletype.HuaMiHandlerTypeViewModel$syncWearLocationConfig$2$1", f = "HuaMiHandlerTypeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nHuaMiHandlerTypeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuaMiHandlerTypeViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/handletype/HuaMiHandlerTypeViewModel$syncWearLocationConfig$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1#2:83\n*E\n"})
public final class HuaMiHandlerTypeViewModel$syncWearLocationConfig$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ WearableDeviceModel $it;
    final /* synthetic */ WearHand.Way $way;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuaMiHandlerTypeViewModel$syncWearLocationConfig$2$1(WearableDeviceModel wearableDeviceModel, WearHand.Way way, Continuation<? super HuaMiHandlerTypeViewModel$syncWearLocationConfig$2$1> continuation) {
        super(2, continuation);
        this.$it = wearableDeviceModel;
        this.$way = way;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HuaMiHandlerTypeViewModel$syncWearLocationConfig$2$1(this.$it, this.$way, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean wearLocation = DeviceModelExtKt.setWearLocation(this.$it, this.$way == WearHand.Way.LEFT_HAND);
        WearHand wearHand = new WearHand();
        wearHand.setWay(this.$way);
        DeviceSettingManager.INSTANCE.getInstance().sendSettingItem(this.$it.getDid(), DeviceSettingConfigKey.KEY_WEARHAND, wearHand);
        return Boxing.boxBoolean(wearLocation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((HuaMiHandlerTypeViewModel$syncWearLocationConfig$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
