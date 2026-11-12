package com.xiaomi.hm.health.device.watch_skin.watchskincoroutine;

import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.dfu.DfuState;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.watch_skin.DialBitmapProcessorFactory;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinUtils;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.m;
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

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b)\u0010*J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J \u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u001a\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0002J.\u0010\u001d\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001bR\u0019\u0010\"\u001a\u00020\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u001d\u0010(\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/watchskincoroutine/WatchSkinViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "", "bgPath", "skinPath", "", z.j, "", "a", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuState;", "dfuState", "c", "i", "source", "dialPath", "g", hl.k, "b", "path", "h", "fwVersion", "e", "Lcom/xiaomi/hm/health/device/watch_skin/watchskincoroutine/IDialInfoReader;", "dialInfoReader", "syncWatchSkin", "Lcom/xiaomi/hm/health/device/watch_skin/watchskincoroutine/WatchSkinLiveData;", "Lcom/xiaomi/hm/health/device/watch_skin/watchskincoroutine/WatchSkinLiveData;", "getWatchSkinLiveData", "()Lcom/xiaomi/hm/health/device/watch_skin/watchskincoroutine/WatchSkinLiveData;", "watchSkinLiveData", "Lcom/xiaomi/hm/health/device/watch_skin/watchskincoroutine/IDialInfoReader;", "Lcom/huami/devicex/manager/DeviceManagerApi;", "Lkotlin/Lazy;", "f", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchSkinViewModel extends ViewModel implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WatchSkinLiveData watchSkinLiveData = new WatchSkinLiveData();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private IDialInfoReader dialInfoReader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

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
            return "此时已经生成了目标bmp，开始组装表盘文件~";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "handleDialWithBg: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.watch_skin.watchskincoroutine.WatchSkinViewModel$syncWatchSkin$1", f = "WatchSkinViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

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
                return "can't sync skin for no device connected.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchSkinViewModel.this.new c(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Exception {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WatchSkinViewModel.this.getWatchSkinLiveData().postValue(new WatchSkinState(WatchSkinError.START, null, 2, null));
            DeviceManagerApi deviceManagerApiF = WatchSkinViewModel.this.f();
            HMDeviceType hMDeviceType = HMDeviceType.MILI;
            HMDeviceSource boundDeviceSource = deviceManagerApiF.getBoundDeviceSource(hMDeviceType);
            if (!WatchSkinViewModel.this.e(boundDeviceSource, this.c)) {
                return Unit.INSTANCE;
            }
            HMBaseDevice device = WatchSkinViewModel.this.f().getDevice(hMDeviceType);
            HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
            if (!WatchSkinViewModel.this.b(hMMiLiProDevice)) {
                HMLog.info("WatchSkinViewModel", a.a);
                WatchSkinViewModel.this.getWatchSkinLiveData().postValue(new WatchSkinState(WatchSkinError.FAIL, null, 2, null));
                return Unit.INSTANCE;
            }
            if (hMMiLiProDevice == null) {
                return Unit.INSTANCE;
            }
            if (!WatchSkinViewModel.this.a()) {
                return Unit.INSTANCE;
            }
            if (!WatchSkinViewModel.this.c(hMMiLiProDevice.getDfuStateSync())) {
                return Unit.INSTANCE;
            }
            WatchSkinViewModel.this.j(boundDeviceSource, hMMiLiProDevice, this.d, this.e);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchSkinViewModel() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.watch_skin.watchskincoroutine.WatchSkinViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a() {
        BatteryInfo batteryInfo = f().getBatteryInfo(HMDeviceType.MILI);
        if (batteryInfo == null || batteryInfo.getLevel() > 10) {
            return true;
        }
        getWatchSkinLiveData().postValue(new WatchSkinState(WatchSkinError.BATTERY_LOW, null, 2, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(HMMiLiProDevice device) {
        return device != null && device.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(DfuState dfuState) {
        int state = dfuState.getState();
        if (state == 32) {
            this.watchSkinLiveData.postValue(new WatchSkinState(WatchSkinError.SPORT_ONGOING, null, 2, null));
            return false;
        }
        if (state == 33) {
            this.watchSkinLiveData.postValue(new WatchSkinState(WatchSkinError.TIME_ONGOING, null, 2, null));
            return false;
        }
        if (state != 48) {
            return true;
        }
        this.watchSkinLiveData.postValue(new WatchSkinState(WatchSkinError.MUSIC_ONGOING, null, 2, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(HMDeviceSource deviceSource, String fwVersion) {
        if (WatchSkinUtils.isFwSupport(deviceSource, fwVersion)) {
            return true;
        }
        this.watchSkinLiveData.postValue(new WatchSkinState(WatchSkinError.FW_LOW, null, 2, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi f() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final String g(HMDeviceSource source, String bgPath, String dialPath) throws Exception {
        DialBitmapProcessorFactory.Companion companion = DialBitmapProcessorFactory.INSTANCE;
        String strProcess = companion.createBitmapProcessor(source).process(bgPath);
        HMLog.info("WatchSkinViewModel", a.a);
        return companion.createEmbedProcessor(source, strProcess, null).process(dialPath);
    }

    private final boolean h(HMMiLiProDevice device, String path) {
        if (!i()) {
            return true;
        }
        IDialInfoReader iDialInfoReader = this.dialInfoReader;
        Objects.requireNonNull(iDialInfoReader);
        Long[] dialInfo = iDialInfoReader.readDialInfo(path);
        Long l = dialInfo[0];
        Long l2 = dialInfo[1];
        if (l == null || l2 == null || device.getStorageStateSync(l2.longValue(), l.longValue())) {
            return true;
        }
        this.watchSkinLiveData.postValue(new WatchSkinState(WatchSkinError.STORAGE_FULL, null, 2, null));
        return false;
    }

    private final boolean i() {
        return HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(HMDeviceSource deviceSource, HMMiLiProDevice device, String bgPath, String skinPath) throws Exception {
        if (!(bgPath == null || m.isBlank(bgPath))) {
            try {
                skinPath = g(deviceSource, bgPath, skinPath);
            } catch (Exception e) {
                HMLog.info("WatchSkinViewModel", new b(e));
                skinPath = null;
            }
        }
        if (skinPath == null || m.isBlank(skinPath)) {
            this.watchSkinLiveData.postValue(new WatchSkinState(WatchSkinError.FAIL, null, 2, null));
        } else if (h(device, skinPath)) {
            k(device, skinPath);
        }
    }

    private final void k(HMMiLiProDevice device, String skinPath) {
        final WatchSkinState watchSkinState = new WatchSkinState(WatchSkinError.START, null, 2, null);
        device.updateFwUpgrade(new HMFirmwareInfo(skinPath, HMFirmwareType.FIRMWARE_DIAL), new IHMFirmwareUpgradeCallback() { // from class: com.xiaomi.hm.health.device.watch_skin.watchskincoroutine.WatchSkinViewModel$syncSkinInternal$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ int a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(int i) {
                    super(0);
                    this.a = i;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "watch sync start, " + this.a;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "watch sync stop, result: " + this.a;
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
            public void onFwProgress(@NotNull Progress progress) {
                WatchSkinLiveData watchSkinLiveData = this.a.getWatchSkinLiveData();
                WatchSkinState watchSkinState2 = watchSkinState;
                watchSkinState2.setProgress(progress);
                Unit unit = Unit.INSTANCE;
                watchSkinLiveData.postValue(watchSkinState2);
            }

            @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
            public void onFwStart(int none) {
                HMLog.info("WatchSkinViewModel", new a(none));
            }

            @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
            public void onFwStop(boolean result) {
                HMLog.info("WatchSkinViewModel", new b(result));
                this.a.getWatchSkinLiveData().postValue(new WatchSkinState(result ? WatchSkinError.SUCCESS : WatchSkinError.FAIL, null, 2, null));
            }
        });
    }

    public static /* synthetic */ void syncWatchSkin$default(WatchSkinViewModel watchSkinViewModel, String str, String str2, String str3, IDialInfoReader iDialInfoReader, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            iDialInfoReader = new DefaultDialInfoReader();
        }
        watchSkinViewModel.syncWatchSkin(str, str2, str3, iDialInfoReader);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final WatchSkinLiveData getWatchSkinLiveData() {
        return this.watchSkinLiveData;
    }

    public final void syncWatchSkin(@Nullable String fwVersion, @Nullable String bgPath, @NotNull String skinPath, @NotNull IDialInfoReader dialInfoReader) {
        this.dialInfoReader = dialInfoReader;
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(fwVersion, bgPath, skinPath, null), 2, null);
    }
}
