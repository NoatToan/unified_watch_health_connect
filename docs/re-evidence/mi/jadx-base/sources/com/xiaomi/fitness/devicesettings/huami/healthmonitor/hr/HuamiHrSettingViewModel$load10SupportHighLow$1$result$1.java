package com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
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
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingViewModel$load10SupportHighLow$1$result$1", f = "HuamiHrSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HuamiHrSettingViewModel$load10SupportHighLow$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ HuamiHrSettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuamiHrSettingViewModel$load10SupportHighLow$1$result$1(HuamiHrSettingViewModel huamiHrSettingViewModel, Continuation<? super HuamiHrSettingViewModel$load10SupportHighLow$1$result$1> continuation) {
        super(2, continuation);
        this.this$0 = huamiHrSettingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HuamiHrSettingViewModel$load10SupportHighLow$1$result$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        WearableDeviceModel deviceModel = this.this$0.getDeviceModel();
        return Boxing.boxBoolean(deviceModel != null ? DeviceModelExtKt.supportHrDetection(deviceModel) : false);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((HuamiHrSettingViewModel$load10SupportHighLow$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
