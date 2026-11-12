package com.xiaomi.hm.health.device.setting.viewmodel;

import androidx.p008lifecycle.ViewModelKt;
import com.huami.devicex.R;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMDisplayType;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateTimeDisplayStyle$$inlined$safeLaunch$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceFeatureViewModel$updateTimeDisplayStyle$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ DeviceFeatureViewModel c;
    public final /* synthetic */ HMDisplayType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFeatureViewModel$updateTimeDisplayStyle$$inlined$safeLaunch$1(Continuation continuation, DeviceFeatureViewModel deviceFeatureViewModel, HMDisplayType hMDisplayType) {
        super(2, continuation);
        this.c = deviceFeatureViewModel;
        this.d = hMDisplayType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DeviceFeatureViewModel$updateTimeDisplayStyle$$inlined$safeLaunch$1 deviceFeatureViewModel$updateTimeDisplayStyle$$inlined$safeLaunch$1 = new DeviceFeatureViewModel$updateTimeDisplayStyle$$inlined$safeLaunch$1(continuation, this.c, this.d);
        deviceFeatureViewModel$updateTimeDisplayStyle$$inlined$safeLaunch$1.b = obj;
        return deviceFeatureViewModel$updateTimeDisplayStyle$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceFeatureViewModel$updateTimeDisplayStyle$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.b;
        HMMiLiDevice hMMiLiDeviceFindDevice = this.c.findDevice();
        if (hMMiLiDeviceFindDevice != null && (hMMiLiDeviceFindDevice instanceof HMMiLiProDevice)) {
            final HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
            final HMMiliConfig miliConfig = hMPersonInfo.getMiliConfig();
            final Deferred deferredB = e.b(coroutineScope, null, null, new DeviceFeatureViewModel$updateTimeDisplayStyle$1$onSaveFn$1(this.d, miliConfig, null), 3, null);
            HMDisplayType hMDisplayType = this.d;
            final DeviceFeatureViewModel deviceFeatureViewModel = this.c;
            ((HMMiLiProDevice) hMMiLiDeviceFindDevice).setDisplayType(hMDisplayType, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateTimeDisplayStyle$1$1

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateTimeDisplayStyle$1$1$onFinish$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {459}, m = "invokeSuspend", n = {}, s = {})
                public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int a;
                    public final /* synthetic */ Deferred<Function0<Unit>> b;
                    public final /* synthetic */ HMMiliConfig c;
                    public final /* synthetic */ DeviceFeatureViewModel d;
                    public final /* synthetic */ HMPersonInfo e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public a(Deferred<? extends Function0<Unit>> deferred, HMMiliConfig hMMiliConfig, DeviceFeatureViewModel deviceFeatureViewModel, HMPersonInfo hMPersonInfo, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.b = deferred;
                        this.c = hMMiliConfig;
                        this.d = deviceFeatureViewModel;
                        this.e = hMPersonInfo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new a(this.b, this.c, this.d, this.e, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                        int i = this.a;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Deferred<Function0<Unit>> deferred = this.b;
                            this.a = 1;
                            obj = deferred.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        ((Function0) obj).getA();
                        this.c.setTimePanelLang(this.d.e().getSystemLang());
                        this.e.saveInfo(2);
                        return Unit.INSTANCE;
                    }
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                    onFinish(bool.booleanValue());
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean isSuccess) {
                    if (!isSuccess) {
                        CustomToast.makeText(deviceFeatureViewModel.com.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String, R.string.alarm_save_failed, 0).show();
                        return;
                    }
                    e.f(ViewModelKt.getViewModelScope(deviceFeatureViewModel), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateTimeDisplayStyle$1$1$onFinish$$inlined$safeLaunch$1(null, deferredB, miliConfig, deviceFeatureViewModel, hMPersonInfo), 2, null);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
