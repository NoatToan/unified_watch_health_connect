package com.xiaomi.hm.health.device.setting.viewmodel;

import androidx.p008lifecycle.ViewModelKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.model.HMColorTheme;
import com.xiaomi.hm.health.device.setting.vo.LightColorVo;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
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
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateLightColor$$inlined$safeLaunch$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceFeatureViewModel$updateLightColor$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ DeviceFeatureViewModel d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFeatureViewModel$updateLightColor$$inlined$safeLaunch$1(Continuation continuation, String str, DeviceFeatureViewModel deviceFeatureViewModel) {
        super(2, continuation);
        this.c = str;
        this.d = deviceFeatureViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DeviceFeatureViewModel$updateLightColor$$inlined$safeLaunch$1 deviceFeatureViewModel$updateLightColor$$inlined$safeLaunch$1 = new DeviceFeatureViewModel$updateLightColor$$inlined$safeLaunch$1(continuation, this.c, this.d);
        deviceFeatureViewModel$updateLightColor$$inlined$safeLaunch$1.b = obj;
        return deviceFeatureViewModel$updateLightColor$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceFeatureViewModel$updateLightColor$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        HMColorTheme.Color color;
        HMMiliConfig miliConfig;
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HMLog.i("DeviceFeatureViewModel", "colorTheme: " + this.c, new Object[0]);
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        if (hMPersonInfo != null && (miliConfig = hMPersonInfo.getMiliConfig()) != null) {
            miliConfig.setLightColor(this.c);
        }
        HMColorTheme hMColorTheme = new HMColorTheme(true);
        switch (this.c) {
            case "ORANGE":
                color = HMColorTheme.Color.ORANGE;
                break;
            case "RED":
                color = HMColorTheme.Color.RED;
                break;
            case "BLUE":
                color = HMColorTheme.Color.BLUE;
                break;
            case "GREEN":
                color = HMColorTheme.Color.GREEN;
                break;
            default:
                color = HMColorTheme.Color.BLUE;
                break;
        }
        hMColorTheme.setColor(color);
        HMMiLiDevice hMMiLiDeviceFindDevice = this.d.findDevice();
        if (hMMiLiDeviceFindDevice != null) {
            final DeviceFeatureViewModel deviceFeatureViewModel = this.d;
            final String str = this.c;
            hMMiLiDeviceFindDevice.setColorTheme(hMColorTheme, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateLightColor$1$2

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateLightColor$1$2$onFinish$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int a;
                    public final /* synthetic */ DeviceFeatureViewModel b;
                    public final /* synthetic */ String c;
                    public final /* synthetic */ boolean d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(DeviceFeatureViewModel deviceFeatureViewModel, String str, boolean z, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.b = deviceFeatureViewModel;
                        this.c = str;
                        this.d = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new a(this.b, this.c, this.d, continuation);
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
                        this.b.lightColorLiveData.setValue(new LightColorVo(true, this.c, Boxing.boxBoolean(this.d)));
                        return Unit.INSTANCE;
                    }
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                    onFinish(bool.booleanValue());
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    if (result) {
                        HMPersonInfo.getInstance().saveInfo(2);
                    }
                    e.f(ViewModelKt.getViewModelScope(deviceFeatureViewModel), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateLightColor$1$2$onFinish$$inlined$safeLaunch$1(null, deviceFeatureViewModel, str, result), 2, null);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
