package com.xiaomi.hm.health.device.setting.viewmodel;

import androidx.p008lifecycle.ViewModelKt;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.profile.user.LocationExt;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateWearStyleSetting$$inlined$safeLaunch$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceFeatureViewModel$updateWearStyleSetting$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ DeviceFeatureViewModel c;
    public final /* synthetic */ LocationExt.Way d;
    public final /* synthetic */ LocationExt.Wear e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFeatureViewModel$updateWearStyleSetting$$inlined$safeLaunch$1(Continuation continuation, DeviceFeatureViewModel deviceFeatureViewModel, LocationExt.Way way, LocationExt.Wear wear, String str) {
        super(2, continuation);
        this.c = deviceFeatureViewModel;
        this.d = way;
        this.e = wear;
        this.f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DeviceFeatureViewModel$updateWearStyleSetting$$inlined$safeLaunch$1 deviceFeatureViewModel$updateWearStyleSetting$$inlined$safeLaunch$1 = new DeviceFeatureViewModel$updateWearStyleSetting$$inlined$safeLaunch$1(continuation, this.c, this.d, this.e, this.f);
        deviceFeatureViewModel$updateWearStyleSetting$$inlined$safeLaunch$1.b = obj;
        return deviceFeatureViewModel$updateWearStyleSetting$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceFeatureViewModel$updateWearStyleSetting$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        LocationExt locationExt = new LocationExt();
        locationExt.setWay(this.d);
        locationExt.setWear(this.e);
        HMMiLiDevice hMMiLiDeviceFindDevice = this.c.findDevice();
        if (hMMiLiDeviceFindDevice != null) {
            final DeviceFeatureViewModel deviceFeatureViewModel = this.c;
            final String str = this.f;
            hMMiLiDeviceFindDevice.setWearLocation(locationExt, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateWearStyleSetting$1$1$1

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateWearStyleSetting$1$1$1$onFinish$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int a;
                    public final /* synthetic */ String b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(String str, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.b = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new a(this.b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                        if (this.a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        HMPersonInfo.getInstance().getMiliConfig().setWearHand(this.b);
                        HMPersonInfo.getInstance().saveInfo(2);
                        return Unit.INSTANCE;
                    }
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                    onFinish(bool.booleanValue());
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    e.f(ViewModelKt.getViewModelScope(deviceFeatureViewModel), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateWearStyleSetting$1$1$1$onFinish$$inlined$safeLaunch$1(null, result, deviceFeatureViewModel, str), 2, null);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
