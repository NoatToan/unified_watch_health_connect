package com.xiaomi.hm.health.device.setting.viewmodel;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateStartDayOfWeek$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceFeatureViewModel$updateStartDayOfWeek$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ DeviceFeatureViewModel b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFeatureViewModel$updateStartDayOfWeek$1$1(DeviceFeatureViewModel deviceFeatureViewModel, int i, Continuation<? super DeviceFeatureViewModel$updateStartDayOfWeek$1$1> continuation) {
        super(2, continuation);
        this.b = deviceFeatureViewModel;
        this.c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DeviceFeatureViewModel$updateStartDayOfWeek$1$1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceFeatureViewModel$updateStartDayOfWeek$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HMMiLiDevice hMMiLiDeviceFindDevice = this.b.findDevice();
        if (hMMiLiDeviceFindDevice == null) {
            return Unit.INSTANCE;
        }
        if (hMMiLiDeviceFindDevice instanceof HMMiLiProDevice) {
            HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) hMMiLiDeviceFindDevice;
            if (hMMiLiProDevice.isConnected()) {
                hMMiLiProDevice.setStartDayOfWeek((byte) this.c, new HMCallback<Object>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateStartDayOfWeek$1$1.1
                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(boolean result) {
                        HMLog.i("updateStartDayOfWeek", "result ---> " + result, new Object[0]);
                    }
                });
                this.b.loadStartDayOfWeekSetting();
            }
        }
        return Unit.INSTANCE;
    }
}
