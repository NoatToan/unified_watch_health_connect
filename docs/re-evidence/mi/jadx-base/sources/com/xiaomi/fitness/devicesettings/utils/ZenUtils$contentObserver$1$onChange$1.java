package com.xiaomi.fitness.devicesettings.utils;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
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
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.utils.ZenUtils$contentObserver$1$onChange$1", f = "ZenUtils.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
public final class ZenUtils$contentObserver$1$onChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public ZenUtils$contentObserver$1$onChange$1(Continuation<? super ZenUtils$contentObserver$1$onChange$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ZenUtils$contentObserver$1$onChange$1(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String did;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ZenUtils zenUtils = ZenUtils.INSTANCE;
            boolean zIsZenModeOpen = zenUtils.isZenModeOpen();
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
            if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
                did = "";
            }
            boolean zIsZenModeOpen2 = deviceSettingsPreference.isZenModeOpen(did);
            boolean z = ZenUtils.preValue != zIsZenModeOpen;
            Logger.i(ZenUtils.sTag, "contentObserver isSame:" + z + "  preValue:" + ZenUtils.preValue + " zenModeOpen:" + zIsZenModeOpen + " isZenSyncOpen:" + zIsZenModeOpen2);
            if (ZenUtils.preValue != zIsZenModeOpen && zIsZenModeOpen2) {
                Logger.i(ZenUtils.sTag, "contentObserver syncZenModeMode");
                this.label = 1;
                if (zenUtils.postSyncZenMode(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ZenUtils$contentObserver$1$onChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
