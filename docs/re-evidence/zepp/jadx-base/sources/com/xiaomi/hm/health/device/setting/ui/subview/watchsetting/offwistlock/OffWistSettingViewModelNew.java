package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.offwistlock;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.screenlock.ScreenLockAndPassword;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.SettingsExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\b\u001a\u00020\u0003R\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/offwistlock/OffWistSettingViewModelNew;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "", "querySettings", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/screenlock/ScreenLockAndPassword;", "screenLockAndPassword", "setSettings", "closePassword", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "a", "Lkotlin/Lazy;", "getDeviceCenter", "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "getOffWistLiveData", "()Landroidx/lifecycle/MutableLiveData;", "offWistLiveData", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingVo;", "c", "getLoadingLiveData", "loadingLiveData", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OffWistSettingViewModelNew extends ViewModel implements KoinComponentAdapter {

    @NotNull
    private static final String d = "OffWistSettingViewModelNew";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceCenter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ScreenLockAndPassword> offWistLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LoadingVo> loadingLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.offwistlock.OffWistSettingViewModelNew$closePassword$1", f = "OffWistSettingViewModelNew.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.offwistlock.OffWistSettingViewModelNew$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0858a extends Lambda implements Function0<String> {
            public static final C0858a a = new C0858a();

            public C0858a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "closePassword settingsModule null";
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OffWistSettingViewModelNew.this.new a(continuation);
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
                LoadingVo.INSTANCE.postStartMsg(OffWistSettingViewModelNew.this.getLoadingLiveData(), DeviceXFunctionsKt.getString(R.string.saving));
                HMBaseDevice device = OffWistSettingViewModelNew.this.getDeviceCenter().getDevice();
                SettingsModule settingsModule = device == null ? null : (SettingsModule) device.getChannelModule(SettingsModule.class);
                if (settingsModule == null) {
                    HMLog.error$default(OffWistSettingViewModelNew.d, null, null, C0858a.a, 6, null);
                    return Unit.INSTANCE;
                }
                ScreenLockAndPassword screenLockAndPassword = new ScreenLockAndPassword();
                screenLockAndPassword.setSwitch(Boxing.boxBoolean(false));
                Unit unit = Unit.INSTANCE;
                this.a = 1;
                obj = SettingsExtsKt.write(settingsModule, screenLockAndPassword, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                ScreenLockAndPassword value = OffWistSettingViewModelNew.this.getOffWistLiveData().getValue();
                if (value != null) {
                    OffWistSettingViewModelNew offWistSettingViewModelNew = OffWistSettingViewModelNew.this;
                    value.setSwitch(Boxing.boxBoolean(false));
                    offWistSettingViewModelNew.getOffWistLiveData().postValue(value);
                }
                LoadingVo.INSTANCE.postSuccessMsg(OffWistSettingViewModelNew.this.getLoadingLiveData(), DeviceXFunctionsKt.getString(R.string.save_success));
            } else {
                LoadingVo.INSTANCE.postFailMsg(OffWistSettingViewModelNew.this.getLoadingLiveData(), DeviceXFunctionsKt.getString(R.string.save_failed));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.offwistlock.OffWistSettingViewModelNew$querySettings$1", f = "OffWistSettingViewModelNew.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "querySettings settingsModule null";
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OffWistSettingViewModelNew.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMBaseDevice device = OffWistSettingViewModelNew.this.getDeviceCenter().getDevice();
                SettingsModule settingsModule = device == null ? null : (SettingsModule) device.getChannelModule(SettingsModule.class);
                if (settingsModule == null) {
                    HMLog.error$default(OffWistSettingViewModelNew.d, null, null, a.a, 6, null);
                    return Unit.INSTANCE;
                }
                SettingsGroupType settingsGroupType = SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD;
                this.a = 1;
                obj = WatchSettingExtsKt.query$default(settingsModule, settingsGroupType, false, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ScreenLockAndPassword screenLockAndPassword = obj instanceof ScreenLockAndPassword ? (ScreenLockAndPassword) obj : null;
            if (screenLockAndPassword != null) {
                OffWistSettingViewModelNew offWistSettingViewModelNew = OffWistSettingViewModelNew.this;
                ScreenLockAndPassword value = offWistSettingViewModelNew.getOffWistLiveData().getValue();
                if (value != null) {
                    value.setSwitch(screenLockAndPassword.getSwitch());
                }
                ScreenLockAndPassword value2 = offWistSettingViewModelNew.getOffWistLiveData().getValue();
                if (value2 != null) {
                    value2.setPassword(screenLockAndPassword.getPassword());
                }
                offWistSettingViewModelNew.setSettings(offWistSettingViewModelNew.getOffWistLiveData().getValue());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "screenLockAndPassword null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.offwistlock.OffWistSettingViewModelNew$setSettings$2", f = "OffWistSettingViewModelNew.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ScreenLockAndPassword c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ScreenLockAndPassword screenLockAndPassword, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = screenLockAndPassword;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OffWistSettingViewModelNew.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OffWistSettingViewModelNew.this.getOffWistLiveData().postValue(this.c);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OffWistSettingViewModelNew() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceCenter = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceCenter>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.offwistlock.OffWistSettingViewModelNew$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.DeviceCenter, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceCenter getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), qualifier, objArr);
            }
        });
        this.offWistLiveData = new MutableLiveData<>();
        this.loadingLiveData = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceCenter getDeviceCenter() {
        return (DeviceCenter) this.deviceCenter.getValue();
    }

    public final void closePassword() {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<LoadingVo> getLoadingLiveData() {
        return this.loadingLiveData;
    }

    @NotNull
    public final MutableLiveData<ScreenLockAndPassword> getOffWistLiveData() {
        return this.offWistLiveData;
    }

    public final void querySettings() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(null), 2, null);
    }

    public final void setSettings(@Nullable ScreenLockAndPassword screenLockAndPassword) {
        if (screenLockAndPassword == null) {
            HMLog.error$default(d, null, null, c.a, 6, null);
        } else {
            e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(screenLockAndPassword, null), 2, null);
        }
    }
}
