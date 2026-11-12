package com.xiaomi.hm.health.device.setting.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.PasswordInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.device.setting.vo.DevicePwdVo;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadDevicePwdSetting$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceFeatureViewModel$loadDevicePwdSetting$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ DeviceFeatureViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFeatureViewModel$loadDevicePwdSetting$1$1(DeviceFeatureViewModel deviceFeatureViewModel, Continuation<? super DeviceFeatureViewModel$loadDevicePwdSetting$1$1> continuation) {
        super(2, continuation);
        this.b = deviceFeatureViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DeviceFeatureViewModel$loadDevicePwdSetting$1$1(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceFeatureViewModel$loadDevicePwdSetting$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DeviceInfo deviceInfo;
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HMMiLiDevice hMMiLiDeviceFindDevice = this.b.findDevice();
        if (hMMiLiDeviceFindDevice != null && (deviceInfo = hMMiLiDeviceFindDevice.getDeviceInfo()) != null) {
            final boolean z = deviceInfo.getFirmwareVersion() > ProfileUtils.getVersionCodeFromVersionName(this.b.notSupportVersion);
            if (hMMiLiDeviceFindDevice instanceof HMMiLiProDevice) {
                final DeviceFeatureViewModel deviceFeatureViewModel = this.b;
                ((HMMiLiProDevice) hMMiLiDeviceFindDevice).getPassword(new HMCallback<PasswordInfo>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadDevicePwdSetting$1$1.1

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadDevicePwdSetting$1$1$1$a */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadDevicePwdSetting$1$1$1$onFinish$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public int a;
                        public final /* synthetic */ DeviceFeatureViewModel b;
                        public final /* synthetic */ boolean c;
                        public final /* synthetic */ PasswordInfo d;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(DeviceFeatureViewModel deviceFeatureViewModel, boolean z, PasswordInfo passwordInfo, Continuation<? super a> continuation) {
                            super(2, continuation);
                            this.b = deviceFeatureViewModel;
                            this.c = z;
                            this.d = passwordInfo;
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
                            MutableLiveData mutableLiveData = this.b.devicePwdSettingLiveData;
                            boolean z = this.c;
                            PasswordInfo passwordInfo = this.d;
                            PasswordInfo passwordInfo2 = null;
                            if (passwordInfo != null) {
                                if (passwordInfo.getState() != 0) {
                                    passwordInfo = null;
                                }
                                passwordInfo2 = passwordInfo;
                            }
                            mutableLiveData.postValue(new DevicePwdVo(z, passwordInfo2));
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(@Nullable PasswordInfo t) {
                        e.f(ViewModelKt.getViewModelScope(deviceFeatureViewModel), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadDevicePwdSetting$1$1$1$onFinish$$inlined$safeLaunch$1(null, deviceFeatureViewModel, z, t), 2, null);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
