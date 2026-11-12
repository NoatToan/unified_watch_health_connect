package com.xiaomi.hm.health.device.setting.viewmodel;

import androidx.p008lifecycle.ViewModelKt;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.network.hmnetwork.properties.Property;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateDeviceUnlockScreen$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceFeatureViewModel$updateDeviceUnlockScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ DeviceFeatureViewModel b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ HMMiLiDevice d;
    public final /* synthetic */ Function0<Unit> e;
    public final /* synthetic */ Function1<Boolean, Unit> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeviceFeatureViewModel$updateDeviceUnlockScreen$1$1(DeviceFeatureViewModel deviceFeatureViewModel, boolean z, HMMiLiDevice hMMiLiDevice, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, Continuation<? super DeviceFeatureViewModel$updateDeviceUnlockScreen$1$1> continuation) {
        super(2, continuation);
        this.b = deviceFeatureViewModel;
        this.c = z;
        this.d = hMMiLiDevice;
        this.e = function0;
        this.f = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DeviceFeatureViewModel$updateDeviceUnlockScreen$1$1(this.b, this.c, this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceFeatureViewModel$updateDeviceUnlockScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean zFromPropertyBoolStr = this.b.e().fromPropertyBoolStr(DeviceXFunctionsKt.getPropertyStoreApi().getProperty(Property.PROPERTY_LOCK_SCREEN_WUHAN, null));
        final boolean z = this.c;
        if (zFromPropertyBoolStr == z) {
            return Unit.INSTANCE;
        }
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) this.d;
        final DeviceFeatureViewModel deviceFeatureViewModel = this.b;
        final Function0<Unit> function0 = this.e;
        final Function1<Boolean, Unit> function1 = this.f;
        hMMiLiProDevice.enableLockScreen(z, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateDeviceUnlockScreen$1$1.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateDeviceUnlockScreen$1$1$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateDeviceUnlockScreen$1$1$1$onFinish$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ Function1<Boolean, Unit> b;
                public final /* synthetic */ boolean c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(Function1<? super Boolean, Unit> function1, boolean z, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.b = function1;
                    this.c = z;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new a(this.b, this.c, continuation);
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
                    this.b.invoke(Boxing.boxBoolean(this.c));
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateDeviceUnlockScreen$1$1$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateDeviceUnlockScreen$1$1$1$onFinish$1$2", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ DeviceFeatureViewModel b;
                public final /* synthetic */ boolean c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(DeviceFeatureViewModel deviceFeatureViewModel, boolean z, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.b = deviceFeatureViewModel;
                    this.c = z;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new b(this.b, this.c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    DeviceXFunctionsKt.getPropertyStoreApi().setProperty(Property.PROPERTY_LOCK_SCREEN_WUHAN, this.b.e().toPropertyBoolStr(this.c));
                    DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
                    this.b.loadDeviceUnLockScreen();
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateDeviceUnlockScreen$1$1$1$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateDeviceUnlockScreen$1$1$1$onStart$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ Function0<Unit> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(Function0<Unit> function0, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.b = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new c(this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.b.invoke();
                    return Unit.INSTANCE;
                }
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                onFinish(bool.booleanValue());
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onStart() {
                e.f(ViewModelKt.getViewModelScope(deviceFeatureViewModel), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateDeviceUnlockScreen$1$1$1$onStart$$inlined$safeLaunch$1(null, function0), 2, null);
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                e.f(ViewModelKt.getViewModelScope(deviceFeatureViewModel), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateDeviceUnlockScreen$1$1$1$onFinish$$inlined$safeLaunch$1(null, result, function1, deviceFeatureViewModel, z), 2, null);
            }
        });
        return Unit.INSTANCE;
    }
}
