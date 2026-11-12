package com.xiaomi.fitness.devicesettings.common.lock;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.UnwearSetting;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/settingitem/settingitem/UnwearSetting;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.lock.UnWearSettingViewModel$getUnWearSettings$1$1$unwearSetting$1", f = "UnWearSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nUnWearSettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnWearSettingViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/lock/UnWearSettingViewModel$getUnWearSettings$1$1$unwearSetting$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n1#2:193\n*E\n"})
public final class UnWearSettingViewModel$getUnWearSettings$1$1$unwearSetting$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UnwearSetting>, Object> {
    int label;
    final /* synthetic */ UnWearSettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnWearSettingViewModel$getUnWearSettings$1$1$unwearSetting$1(UnWearSettingViewModel unWearSettingViewModel, Continuation<? super UnWearSettingViewModel$getUnWearSettings$1$1$unwearSetting$1> continuation) {
        super(2, continuation);
        this.this$0 = unWearSettingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnWearSettingViewModel$getUnWearSettings$1$1$unwearSetting$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
        WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        Object objValueToObject = companion.readSettingItem(mDeviceModel.getDid(), DeviceSettingConfigKey.KEY_UNWAER_SETTING).valueToObject(UnwearSetting.class);
        return objValueToObject != null ? (UnwearSetting) objValueToObject : new UnwearSetting();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UnwearSetting> continuation) {
        return ((UnWearSettingViewModel$getUnWearSettings$1$1$unwearSetting$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
