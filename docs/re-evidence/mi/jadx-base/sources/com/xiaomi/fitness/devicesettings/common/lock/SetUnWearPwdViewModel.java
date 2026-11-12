package com.xiaomi.fitness.devicesettings.common.lock;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.lock.SetUnWearPwdViewModel;
import com.xiaomi.fitness.nfc.export.NfcManager;
import com.xiaomi.fitness.nfc.export.NfcManagerExtKt;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.UnwearSetting;
import defpackage.bg4;
import defpackage.j5h;
import defpackage.na4;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.ua1;
import defpackage.v4h;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005J\u001a\u0010\u0011\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u0013J\u001a\u0010\u0015\u001a\u00020\r2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0013J\u001a\u0010\u0017\u001a\u00020\r2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0013J\"\u0010\u0019\u001a\u00020\r2\u001a\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\r0\u001bJ\u0018\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u001cJ\u0006\u0010$\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/lock/SetUnWearPwdViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "isRequired", "", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "setIsRequired", "checkPin", "pinStatus", "Lkotlin/Function1;", "", "checkCRSCode", "needUpdateCrc", "checkCRSStatus", "setSeSuc", "clearSE", "clearSuc", "Lkotlin/Function2;", "", "setUnWearResult", "Landroidx/lifecycle/MutableLiveData;", "getSetUnWearResult", "()Landroidx/lifecycle/MutableLiveData;", "setUnWearEnable", "enable", "password", "setUnWearSetting", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SetUnWearPwdViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "SetUnWearPwdViewModel";
    private boolean isRequired;

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: c0m
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SetUnWearPwdViewModel.mDeviceModel_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<Boolean> setUnWearResult = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.lock.SetUnWearPwdViewModel$checkCRSCode$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.lock.SetUnWearPwdViewModel$checkCRSCode$1", f = "SetUnWearPwdViewModel.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HuamiApiCaller $huamiApiCaller;
        final /* synthetic */ Function1<Boolean, Unit> $needUpdateCrc;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Boolean, Unit> function1, HuamiApiCaller huamiApiCaller, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$needUpdateCrc = function1;
            this.$huamiApiCaller = huamiApiCaller;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$needUpdateCrc, this.$huamiApiCaller, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                SetUnWearPwdViewModel$checkCRSCode$1$updateCrc$1 setUnWearPwdViewModel$checkCRSCode$1$updateCrc$1 = new SetUnWearPwdViewModel$checkCRSCode$1$updateCrc$1(this.$huamiApiCaller, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, setUnWearPwdViewModel$checkCRSCode$1$updateCrc$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$needUpdateCrc.invoke2(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.lock.SetUnWearPwdViewModel$checkCRSStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.lock.SetUnWearPwdViewModel$checkCRSStatus$1", f = "SetUnWearPwdViewModel.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HuamiApiCaller $huamiApiCaller;
        final /* synthetic */ Function1<Boolean, Unit> $setSeSuc;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.lock.SetUnWearPwdViewModel$checkCRSStatus$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.lock.SetUnWearPwdViewModel$checkCRSStatus$1$1", f = "SetUnWearPwdViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ HuamiApiCaller $huamiApiCaller;
            final /* synthetic */ Function1<Boolean, Unit> $setSeSuc;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04861(Function1<? super Boolean, Unit> function1, HuamiApiCaller huamiApiCaller, Continuation<? super C04861> continuation) {
                super(2, continuation);
                this.$setSeSuc = function1;
                this.$huamiApiCaller = huamiApiCaller;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(Function1 function1, HuamiApiCaller huamiApiCaller, boolean z) {
                Intrinsics.checkNotNull(Boolean.valueOf(z), "null cannot be cast to non-null type kotlin.Boolean");
                boolean z2 = false;
                if (!z) {
                    if (huamiApiCaller != null && huamiApiCaller.setPasswordInteraction()) {
                        z2 = true;
                    }
                    function1.invoke2(Boolean.valueOf(z2));
                } else if (NfcManagerExtKt.getInstance(NfcManager.INSTANCE).mipayPrepare()) {
                    if (huamiApiCaller != null && huamiApiCaller.setPasswordInteraction()) {
                        z2 = true;
                    }
                    function1.invoke2(Boolean.valueOf(z2));
                } else {
                    function1.invoke2(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04861(this.$setSeSuc, this.$huamiApiCaller, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                NfcManager nfcManagerExtKt = NfcManagerExtKt.getInstance(NfcManager.INSTANCE);
                final Function1<Boolean, Unit> function1 = this.$setSeSuc;
                final HuamiApiCaller huamiApiCaller = this.$huamiApiCaller;
                nfcManagerExtKt.checkCRSStatus(new Function1() { // from class: com.xiaomi.fitness.devicesettings.common.lock.a
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return SetUnWearPwdViewModel.C21431.C04861.invokeSuspend$lambda$0(function1, huamiApiCaller, ((Boolean) obj2).booleanValue());
                    }
                });
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21431(Function1<? super Boolean, Unit> function1, HuamiApiCaller huamiApiCaller, Continuation<? super C21431> continuation) {
            super(2, continuation);
            this.$setSeSuc = function1;
            this.$huamiApiCaller = huamiApiCaller;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C21431(this.$setSeSuc, this.$huamiApiCaller, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04861 c04861 = new C04861(this.$setSeSuc, this.$huamiApiCaller, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04861, this) == coroutine_suspended) {
                    return coroutine_suspended;
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
            return ((C21431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.lock.SetUnWearPwdViewModel$checkPin$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.lock.SetUnWearPwdViewModel$checkPin$1", f = "SetUnWearPwdViewModel.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Integer, Unit> $pinStatus;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.lock.SetUnWearPwdViewModel$checkPin$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.lock.SetUnWearPwdViewModel$checkPin$1$1", f = "SetUnWearPwdViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Integer, Unit> $pinStatus;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04871(Function1<? super Integer, Unit> function1, Continuation<? super C04871> continuation) {
                super(2, continuation);
                this.$pinStatus = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(Function1 function1, int i) {
                function1.invoke2(Integer.valueOf(i));
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04871(this.$pinStatus, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                NfcManager nfcManagerExtKt = NfcManagerExtKt.getInstance(NfcManager.INSTANCE);
                final Function1<Integer, Unit> function1 = this.$pinStatus;
                nfcManagerExtKt.pinStatus(new Function1() { // from class: com.xiaomi.fitness.devicesettings.common.lock.b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return SetUnWearPwdViewModel.C21441.C04871.invokeSuspend$lambda$0(function1, ((Integer) obj2).intValue());
                    }
                });
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21441(Function1<? super Integer, Unit> function1, Continuation<? super C21441> continuation) {
            super(2, continuation);
            this.$pinStatus = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C21441(this.$pinStatus, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04871 c04871 = new C04871(this.$pinStatus, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04871, this) == coroutine_suspended) {
                    return coroutine_suspended;
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
            return ((C21441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearSE$lambda$1(v4h emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        emitter.onNext(Boolean.valueOf(NfcManagerExtKt.getInstance(NfcManager.INSTANCE).mipayClearSE()));
        emitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearSE$lambda$2(Function2 clearSuc, Boolean bool) {
        Intrinsics.checkNotNullParameter(clearSuc, "$clearSuc");
        Intrinsics.checkNotNull(bool);
        clearSuc.invoke(bool, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearSE$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearSE$lambda$4(Function2 clearSuc, Throwable th) {
        Intrinsics.checkNotNullParameter(clearSuc, "$clearSuc");
        clearSuc.invoke(Boolean.FALSE, th.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearSE$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    private final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void checkCRSCode(@NotNull Function1<? super Boolean, Unit> needUpdateCrc) {
        Intrinsics.checkNotNullParameter(needUpdateCrc, "needUpdateCrc");
        if (getMDeviceModel() == null) {
            return;
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(needUpdateCrc, deviceManagerExtKt.getHuaMiApiCaller(DeviceModelExtKt.getMac(mDeviceModel)), null), 3, null);
    }

    public final void checkCRSStatus(@NotNull Function1<? super Boolean, Unit> setSeSuc) {
        Intrinsics.checkNotNullParameter(setSeSuc, "setSeSuc");
        if (getMDeviceModel() == null) {
            return;
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21431(setSeSuc, deviceManagerExtKt.getHuaMiApiCaller(DeviceModelExtKt.getMac(mDeviceModel)), null), 3, null);
    }

    public final void checkPin(@NotNull Function1<? super Integer, Unit> pinStatus) {
        Intrinsics.checkNotNullParameter(pinStatus, "pinStatus");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21441(pinStatus, null), 3, null);
    }

    public final void clearSE(@NotNull final Function2<? super Boolean, ? super String, Unit> clearSuc) {
        Intrinsics.checkNotNullParameter(clearSuc, "clearSuc");
        o4h o4hVarH = o4h.f(new j5h() { // from class: d0m
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                SetUnWearPwdViewModel.clearSE$lambda$1(v4hVar);
            }
        }).S(ofl.c()).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: e0m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SetUnWearPwdViewModel.clearSE$lambda$2(clearSuc, (Boolean) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: f0m
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SetUnWearPwdViewModel.clearSE$lambda$3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: g0m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SetUnWearPwdViewModel.clearSE$lambda$4(clearSuc, (Throwable) obj);
            }
        };
        new na4().a(o4hVarH.O(bg4Var, new bg4() { // from class: h0m
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SetUnWearPwdViewModel.clearSE$lambda$5(function2, obj);
            }
        }));
    }

    @NotNull
    public final MutableLiveData<Boolean> getSetUnWearResult() {
        return this.setUnWearResult;
    }

    public final void setIsRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }

    public final void setUnWearEnable(boolean enable, @Nullable String password) {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SetUnWearPwdViewModel$setUnWearEnable$1$1(mDeviceModel, this, enable, password, null), 3, null);
        }
    }

    public final void setUnWearSetting() {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel != null) {
            UnwearSetting unwearSetting = new UnwearSetting();
            unwearSetting.setEnable(true);
            DeviceSettingManager.INSTANCE.getInstance().sendSettingItem(mDeviceModel.getDid(), DeviceSettingConfigKey.KEY_UNWAER_SETTING, unwearSetting);
        }
    }
}
