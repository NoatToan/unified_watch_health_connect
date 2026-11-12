package com.huami.module.homepage.sync;

import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicestylepower.DeviceStyle;
import com.huami.devicestylepower.IPowerAndStyleManager;
import com.huami.module.homepage.sync.manager.IDeviceRomUpdateManager;
import com.huami.module.homepage.sync.manager.IDeviceSyncManager;
import com.huami.module.homepage.sync.manager.RomEntry;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR!\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/huami/module/homepage/sync/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "", "startSyncData", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Lcom/huami/devicestylepower/DeviceStyle;", "getPowerAndStyle", "updatePrimaryDeviceType", "", "immediatelySyncDevice", "releaseDeviceManager", "initDeviceManager", "deviceIsConnected", "checkRomUpdate", "startRomUpdate", "skipRomUpdate", "Landroidx/fragment/app/FragmentActivity;", "activity", "loadOldRomUpdate", "Lcom/huami/module/homepage/sync/manager/IDeviceSyncManager;", "a", "Lcom/huami/module/homepage/sync/manager/IDeviceSyncManager;", "deviceManager", "Lcom/huami/module/homepage/sync/manager/IDeviceRomUpdateManager;", "b", "Lcom/huami/module/homepage/sync/manager/IDeviceRomUpdateManager;", "romUpdateManager", "Lcom/huami/devicestylepower/IPowerAndStyleManager;", "c", "Lcom/huami/devicestylepower/IPowerAndStyleManager;", "powerManager", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/module/homepage/sync/manager/RomEntry;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "getRomUpdate", "()Landroidx/lifecycle/MutableLiveData;", "romUpdate", "<init>", "(Lcom/huami/module/homepage/sync/manager/IDeviceSyncManager;Lcom/huami/module/homepage/sync/manager/IDeviceRomUpdateManager;Lcom/huami/devicestylepower/IPowerAndStyleManager;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class HomeViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDeviceSyncManager deviceManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IDeviceRomUpdateManager romUpdateManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IPowerAndStyleManager powerManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<RomEntry> romUpdate = new MutableLiveData<>(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.sync.HomeViewModel$checkRomUpdate$1", f = "HomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HomeViewModel.this.new a(continuation);
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
            HomeViewModel.this.getRomUpdate().postValue(HomeViewModel.this.romUpdateManager.checkRomUpdate());
            return Unit.INSTANCE;
        }
    }

    public HomeViewModel(@NotNull IDeviceSyncManager iDeviceSyncManager, @NotNull IDeviceRomUpdateManager iDeviceRomUpdateManager, @NotNull IPowerAndStyleManager iPowerAndStyleManager) {
        this.deviceManager = iDeviceSyncManager;
        this.romUpdateManager = iDeviceRomUpdateManager;
        this.powerManager = iPowerAndStyleManager;
    }

    public final void checkRomUpdate() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public final boolean deviceIsConnected(@NotNull HMDeviceType type) {
        return this.deviceManager.deviceIsConnected(type);
    }

    @Nullable
    public final DeviceStyle getPowerAndStyle(@NotNull HMDeviceType type) {
        return this.powerManager.powerAndStyle(type.getValue());
    }

    @NotNull
    public final MutableLiveData<RomEntry> getRomUpdate() {
        return this.romUpdate;
    }

    public final boolean immediatelySyncDevice(@NotNull HMDeviceType type) {
        return this.deviceManager.immediatelySyncDevice(type);
    }

    public final void initDeviceManager() {
        this.deviceManager.initDeviceSyncManager();
    }

    public final void loadOldRomUpdate(@NotNull FragmentActivity activity) {
        this.romUpdateManager.showUpdateRomOldDialog(activity);
    }

    public final void releaseDeviceManager() {
        this.deviceManager.releaseDeviceSyncManager();
    }

    public final void skipRomUpdate() {
        this.romUpdateManager.skipRomUpdate();
    }

    public final void startRomUpdate() {
        this.romUpdateManager.startRomUpdate();
    }

    public final void startSyncData() {
        this.deviceManager.startSyncDeviceData();
    }

    public final void updatePrimaryDeviceType() {
        this.deviceManager.updatePrimaryDeviceType();
    }
}
