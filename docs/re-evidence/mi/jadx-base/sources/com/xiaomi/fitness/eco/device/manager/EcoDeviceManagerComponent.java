package com.xiaomi.fitness.eco.device.manager;

import android.app.Application;
import android.os.RemoteException;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.eco.EcoApiCallConfig;
import com.xiaomi.eco.api.EcoApiCallManager;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.connect.export.EcoConnectStateObserver;
import com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerComponent;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoInstanceExtKt;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceInfoUpdater;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl;
import com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.response.ApiException;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0012H\u0007J\b\u0010\u0015\u001a\u00020\u0010H\u0007J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0007J\u001c\u0010\u0018\u001a\u00020\u00102\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00100\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0002J\b\u0010\u001f\u001a\u00020\u0010H\u0002J\b\u0010 \u001a\u00020\u0010H\u0002J\b\u0010!\u001a\u00020\u0010H\u0007J\b\u0010\"\u001a\u00020\u0010H\u0007R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/EcoDeviceManagerComponent;", "", "<init>", "()V", "mEcoProductManager", "Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerRemoteInternal;", "getMEcoProductManager", "()Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerRemoteInternal;", "mEcoProductManager$delegate", "Lkotlin/Lazy;", "mEcoDeviceManager", "Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl;", "getMEcoDeviceManager", "()Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl;", "mEcoDeviceManager$delegate", "startConnectProcess", "", "application", "Landroid/app/Application;", "initConnect", "context", "updateDevices", "tryToRequestDevice", "requestDeviceWhenMainCreated", "updateDevicesIfLogin", "loginListener", "Lkotlin/Function1;", "", "mRequestLastTime", "", "requestDevices", "clearAll", "updateDeviceIfHaveRegion", "loadDeviceCache", "requestDeviceWhenMainResume", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "EcoDeviceManager")
public final class EcoDeviceManagerComponent {

    @NotNull
    public static final String TAG = "EcoDeviceManagerComponent";
    private long mRequestLastTime;

    /* JADX INFO: renamed from: mEcoProductManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mEcoProductManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wr7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoDeviceManagerComponent.mEcoProductManager_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: mEcoDeviceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mEcoDeviceManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xr7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoDeviceManagerComponent.mEcoDeviceManager_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerComponent$loadDeviceCache$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerComponent$loadDeviceCache$1", f = "EcoDeviceManagerComponent.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceManagerComponent.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoDeviceManagerRemoteImpl mEcoDeviceManager = EcoDeviceManagerComponent.this.getMEcoDeviceManager();
                this.label = 1;
                if (mEcoDeviceManager.initDeviceModelsByCache(this) == coroutine_suspended) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void clearAll() throws RemoteException {
        getMEcoProductManager().clear();
        getMEcoDeviceManager().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EcoDeviceManagerRemoteImpl getMEcoDeviceManager() {
        return (EcoDeviceManagerRemoteImpl) this.mEcoDeviceManager.getValue();
    }

    private final EcoProductManagerRemoteInternal getMEcoProductManager() {
        return (EcoProductManagerRemoteInternal) this.mEcoProductManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoDeviceManagerRemoteImpl mEcoDeviceManager_delegate$lambda$1() {
        return EcoInstanceExtKt.getInstance(EcoDeviceManagerRemoteImpl.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoProductManagerRemoteInternal mEcoProductManager_delegate$lambda$0() {
        return EcoInstanceExtKt.getInstance(EcoProductManagerRemoteInternal.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDeviceWhenMainResume$lambda$6(EcoDeviceManagerComponent this$0, String activity, String lifecycle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (StringsKt__StringsJVMKt.startsWith$default(activity, AppManager.INSTANCE.getInstance().getMainActivity(), false, 2, null) && Intrinsics.areEqual(lifecycle, LifecycleConstantKt.ON_RESUME)) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this$0.mRequestLastTime;
            Logger.i("EcoDeviceManagerComponent", "request device when main resume, diffTime=" + jCurrentTimeMillis);
            if (jCurrentTimeMillis >= Constants.TIME_OFFSET) {
                this$0.tryToRequestDevice();
            }
        }
        return Unit.INSTANCE;
    }

    private final void requestDevices() {
        getMEcoDeviceManager().requestDeviceList(new Function1() { // from class: rr7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoDeviceManagerComponent.requestDevices$lambda$2(this.f32819a, (List) obj);
            }
        }, new Function1() { // from class: sr7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoDeviceManagerComponent.requestDevices$lambda$3(this.f33906a, (ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDevices$lambda$2(EcoDeviceManagerComponent this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        EcoDevicePreference.INSTANCE.setREQUEST_DEVICE_LAST_TIME(System.currentTimeMillis());
        this$0.mRequestLastTime = System.currentTimeMillis();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDevices$lambda$3(EcoDeviceManagerComponent this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        EcoDevicePreference.INSTANCE.setREQUEST_DEVICE_LAST_TIME(0L);
        this$0.mRequestLastTime = 0L;
        return Unit.INSTANCE;
    }

    private final void tryToRequestDevice() {
        if (NetworkExtKt.isNetworkAvailable()) {
            updateDeviceIfHaveRegion();
        } else {
            NetworkExtKt.registerConnectChangeListener(new Function1<Boolean, Unit>() { // from class: com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerComponent$tryToRequestDevice$networkListener$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public void invoke(boolean isConnect) {
                    if (isConnect) {
                        this.this$0.updateDeviceIfHaveRegion();
                        NetworkExtKt.unregisterConnectChangeListener(this);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDeviceIfHaveRegion() {
        final Function1<? super Boolean, Unit> function1 = new Function1() { // from class: tr7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoDeviceManagerComponent.updateDeviceIfHaveRegion$lambda$4(this.f34957a, ((Boolean) obj).booleanValue());
            }
        };
        RegionManager.Companion companion = RegionManager.INSTANCE;
        String currentRegion = RegionExtKt.getInstance(companion).getCurrentRegion();
        EcoDeviceModelExtKt.loge$default("current region is " + currentRegion, null, 2, null);
        if (currentRegion.length() > 0) {
            updateDevicesIfLogin(function1);
        }
        RegionExtKt.getInstance(companion).addRegionChangeListener(new Function2() { // from class: ur7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EcoDeviceManagerComponent.updateDeviceIfHaveRegion$lambda$5(this.f36047a, function1, (String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateDeviceIfHaveRegion$lambda$4(EcoDeviceManagerComponent this$0, boolean z) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            EcoDeviceModelExtKt.logi("login success, and requestDeviceList");
            this$0.requestDevices();
        } else {
            EcoDeviceModelExtKt.logi("logout success, and clear device");
            this$0.clearAll();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateDeviceIfHaveRegion$lambda$5(EcoDeviceManagerComponent this$0, Function1 loginListener, String old, String str) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(loginListener, "$loginListener");
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(str, "new");
        EcoDeviceModelExtKt.logi("The region has changed from " + old + " to " + str + ", and reset device list");
        this$0.clearAll();
        this$0.updateDevicesIfLogin(loginListener);
        return Unit.INSTANCE;
    }

    private final void updateDevicesIfLogin(Function1<? super Boolean, Unit> loginListener) {
        AccountManager accountManagerExtKt = AccountManagerExtKt.getInstance(AccountManager.INSTANCE);
        if (accountManagerExtKt.isLogin()) {
            requestDevices();
        }
        accountManagerExtKt.addAccountListener(loginListener);
    }

    @ComponentTask(multiProcess = true, notLaterThan = 2, processName = ":device")
    public final void initConnect(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        EcoConnectStateObserver.INSTANCE.register();
        EcoApiCallManager.INSTANCE.config(EcoApiCallConfigImplKt.newInstance(EcoApiCallConfig.INSTANCE));
    }

    @ComponentTask(notLaterThan = 4, processName = ":device")
    public final void loadDeviceCache() {
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }

    @ComponentTask(notLaterThan = 10, processName = ":device")
    public final void requestDeviceWhenMainCreated() {
        tryToRequestDevice();
    }

    @ComponentTask(notLaterThan = 4, processName = ":device")
    public final void requestDeviceWhenMainResume() {
        if (!RomUtils.INSTANCE.isMiui()) {
            tryToRequestDevice();
        }
        AppManager.INSTANCE.getInstance().registerLifecycleListener(new Function2() { // from class: vr7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EcoDeviceManagerComponent.requestDeviceWhenMainResume$lambda$6(this.f37153a, (String) obj, (String) obj2);
            }
        });
    }

    @ComponentTask(name = "EcoConnectProcess", notLaterThan = 11, onMainThread = false)
    public final void startConnectProcess(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        EcoConnectStateObserver.INSTANCE.register();
    }

    @ComponentTask(notEarlierThan = 2, notLaterThan = 4, processName = ":device")
    public final void updateDevices() {
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).addDeviceStatusListener(EcoDeviceInfoUpdater.INSTANCE);
    }
}
