package com.xiaomi.hm.health.watchfacestore;

import android.bluetooth.BluetoothAdapter;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.device.WFProgress;
import com.huami.watchfacesstore.device.WatchFaceState;
import com.huami.watchfacesstore.device.WatchFaceStatus;
import com.huami.watchfacesstore.device.channel.IDeviceManager;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeStatus;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.agps.HMAgpsUpgradeManager;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.firmware.FwUpgradeFeature;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010\u0010\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J \u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u000bH\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020\u000bH\u0016J\n\u0010#\u001a\u0004\u0018\u00010\u0007H\u0016J7\u0010-\u001a\u00020*2\u0006\u0010$\u001a\u00020\u00072%\u0010,\u001a!\u0012\u0013\u0012\u00110&¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020*0%j\u0002`+H\u0016R\u001e\u00102\u001a\n /*\u0004\u0018\u00010.0.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/xiaomi/hm/health/watchfacestore/WFDeviceManager;", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "", "isBluetoothEnable", "isConnected", "isSyncingData", "isAgpsUpgrading", "", "fwVersionName", "isFwSupport", "isSilentTransmitting", "", "batteryLowValue", "checkBattery", "", "watchFaceIds", "deleteWatchFaceIds", "", "getAllWatchFaceIds", "currentId", "destId", "destSize", "replaceWatchFace", "id", "setWatchFaceById", "getBatteryLevel", "getCurrentWatchFaceId", "()Ljava/lang/Integer;", "getDfuState", "isSupportQueryStorageState", "", "dialSize", "dialId", "getStorageStateSync", "getDeviceFamilyValue", "getCurrentDeviceSn", "watchFacePath", "Lkotlin/Function1;", "Lcom/huami/watchfacesstore/device/WatchFaceState;", "Lkotlin/ParameterName;", "name", "state", "", "Lcom/huami/watchfacesstore/device/OnSyncResultCallBack;", "onSyncResultCallBack", "syncWatchFace", "Lcom/xiaomi/hm/health/device/HMDeviceManager;", "kotlin.jvm.PlatformType", "a", "Lcom/xiaomi/hm/health/device/HMDeviceManager;", "mHMDeviceManager", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WFDeviceManager implements IDeviceManager {

    @NotNull
    private static final String b = "WFDeviceManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HMDeviceManager mHMDeviceManager = HMDeviceManager.getInstance();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Integer> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<Integer> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "getAllWatchFaceIds " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Integer a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Integer num) {
            super(0);
            this.a = num;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "getCurrentWatchFaceId: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, long j2) {
            super(0);
            this.a = j;
            this.b = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "dialSize: " + this.a + " dialId: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "setWatchFaceById " + this.a;
        }
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    public boolean checkBattery(int batteryLowValue) {
        HMDeviceManager hMDeviceManager = this.mHMDeviceManager;
        BatteryInfo batteryInfo = hMDeviceManager.getBatteryInfo(hMDeviceManager.getMajorDeviceType());
        return batteryInfo == null || batteryInfo.getLevel() > batteryLowValue;
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    public boolean deleteWatchFaceIds(@NotNull List<Integer> watchFaceIds) {
        HMDeviceType majorDeviceType = this.mHMDeviceManager.getMajorDeviceType();
        HMBaseDevice device = this.mHMDeviceManager.getDevice(majorDeviceType);
        if (majorDeviceType != HMDeviceType.MILI) {
            return false;
        }
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        return ((HMMiLiProDevice) device).deleteDialsSync(new ArrayList<>(watchFaceIds));
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    @NotNull
    public int[] getAllWatchFaceIds() {
        HMDeviceType majorDeviceType = this.mHMDeviceManager.getMajorDeviceType();
        HMBaseDevice device = this.mHMDeviceManager.getDevice(majorDeviceType);
        if (majorDeviceType != HMDeviceType.MILI) {
            return new int[0];
        }
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        List<Integer> watchFacesAllSync = ((HMMiLiProDevice) device).getWatchFacesAllSync();
        HMLog.info(b, new a(watchFacesAllSync));
        return CollectionsKt___CollectionsKt.toIntArray(watchFacesAllSync);
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    public int getBatteryLevel() {
        HMDeviceManager hMDeviceManager = this.mHMDeviceManager;
        BatteryInfo batteryInfo = hMDeviceManager.getBatteryInfo(hMDeviceManager.getMajorDeviceType());
        if (batteryInfo == null) {
            return -1;
        }
        return batteryInfo.getLevel();
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    @Nullable
    public String getCurrentDeviceSn() {
        Device bindInfo = this.mHMDeviceManager.getBindInfo(this.mHMDeviceManager.getMajorDeviceType());
        if (bindInfo == null) {
            return null;
        }
        return bindInfo.getSn();
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    @Nullable
    public Integer getCurrentWatchFaceId() {
        HMDeviceType majorDeviceType = this.mHMDeviceManager.getMajorDeviceType();
        HMBaseDevice device = this.mHMDeviceManager.getDevice(majorDeviceType);
        if (majorDeviceType != HMDeviceType.MILI) {
            return null;
        }
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        Integer skinIdSync = ((HMMiLiProDevice) device).getSkinIdSync();
        HMLog.info(b, new b(skinIdSync));
        return skinIdSync;
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    public int getDeviceFamilyValue() {
        return this.mHMDeviceManager.getMajorDeviceType().getValue();
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    public int getDfuState() {
        HMDeviceType majorDeviceType = this.mHMDeviceManager.getMajorDeviceType();
        HMBaseDevice device = this.mHMDeviceManager.getDevice(majorDeviceType);
        if (majorDeviceType != HMDeviceType.MILI) {
            return 0;
        }
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        return ((HMMiLiProDevice) device).getDfuStateSync().getState();
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    public boolean getStorageStateSync(long dialSize, long dialId) {
        HMLog.info(b, new c(dialSize, dialId));
        HMDeviceType majorDeviceType = this.mHMDeviceManager.getMajorDeviceType();
        HMBaseDevice device = this.mHMDeviceManager.getDevice(majorDeviceType);
        if (majorDeviceType != HMDeviceType.MILI) {
            return false;
        }
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        return ((HMMiLiProDevice) device).getStorageStateSync(dialSize, dialId);
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    public boolean isAgpsUpgrading() {
        return HMAgpsUpgradeManager.getAgpsProgress() != null;
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    public boolean isBluetoothEnable() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    public boolean isConnected() {
        HMDeviceManager hMDeviceManager = this.mHMDeviceManager;
        HMBaseDevice device = hMDeviceManager.getDevice(hMDeviceManager.getMajorDeviceType());
        if (device == null) {
            return false;
        }
        return device.isConnected();
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    public boolean isFwSupport(@Nullable String fwVersionName) {
        HMDeviceManager hMDeviceManager = this.mHMDeviceManager;
        return WatchSkinUtils.isFwSupport(hMDeviceManager.getBoundDeviceSource(hMDeviceManager.getMajorDeviceType()), fwVersionName);
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    public boolean isSilentTransmitting() {
        HMDeviceType majorDeviceType = this.mHMDeviceManager.getMajorDeviceType();
        HMBaseDevice device = this.mHMDeviceManager.getDevice(majorDeviceType);
        if (majorDeviceType != HMDeviceType.MILI || !FwUpgradeFeature.INSTANCE.supportSilentUpgrade(majorDeviceType)) {
            return false;
        }
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        return ((HMMiLiProDevice) device).getDfuV5UpgradeStatusSync() != UpgradeStatus.IDLE;
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    public boolean isSupportQueryStorageState() {
        return HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(15);
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    public boolean isSyncingData() {
        return new SyncStatusApiFactory().create(this.mHMDeviceManager.getMajorDeviceType()).isSyncingData();
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    public boolean replaceWatchFace(int currentId, int destId, int destSize) {
        HMDeviceType majorDeviceType = this.mHMDeviceManager.getMajorDeviceType();
        HMBaseDevice device = this.mHMDeviceManager.getDevice(majorDeviceType);
        if (majorDeviceType != HMDeviceType.MILI) {
            return false;
        }
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        return ((HMMiLiProDevice) device).replaceDial(currentId, destId, destSize);
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    public boolean setWatchFaceById(int id) {
        HMLog.info(b, new d(id));
        HMDeviceType majorDeviceType = this.mHMDeviceManager.getMajorDeviceType();
        HMBaseDevice device = this.mHMDeviceManager.getDevice(majorDeviceType);
        if (majorDeviceType != HMDeviceType.MILI) {
            return false;
        }
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        return ((HMMiLiProDevice) device).setWatchFaceSync(id);
    }

    @Override // com.huami.watchfacesstore.device.channel.IDeviceManager
    public void syncWatchFace(@NotNull String watchFacePath, @NotNull final Function1<? super WatchFaceState, Unit> onSyncResultCallBack) {
        HMDeviceType majorDeviceType = this.mHMDeviceManager.getMajorDeviceType();
        HMBaseDevice device = this.mHMDeviceManager.getDevice(majorDeviceType);
        if (majorDeviceType == HMDeviceType.MILI) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            if (device == null) {
                return;
            }
            device.updateFwUpgrade(new HMFirmwareInfo(watchFacePath, HMFirmwareType.FIRMWARE_DIAL), new IFirmwareUpgradeCallback() { // from class: com.xiaomi.hm.health.watchfacestore.WFDeviceManager.syncWatchFace.1

                /* JADX INFO: renamed from: com.xiaomi.hm.health.watchfacestore.WFDeviceManager$syncWatchFace$1$a */
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
                        return "表盘同步失败：errorCode: " + this.a;
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.watchfacestore.WFDeviceManager$syncWatchFace$1$b */
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
                        return "表盘同步完成：result: " + this.a;
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.watchfacestore.WFDeviceManager$syncWatchFace$1$c */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class c extends Lambda implements Function0<String> {
                    public final /* synthetic */ Progress a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public c(Progress progress) {
                        super(0);
                        this.a = progress;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        Progress progress = this.a;
                        return "表盘启用进度：total:" + progress.total + " progress:" + progress.progress;
                    }
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Integer] */
                @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
                public void onError(int errorCode) {
                    WatchFaceState watchFaceState;
                    HMLog.error$default(WFDeviceManager.b, null, null, new a(errorCode), 6, null);
                    objectRef.element = Integer.valueOf(errorCode);
                    if (errorCode != 48) {
                        switch (errorCode) {
                            case 32:
                                watchFaceState = new WatchFaceState(WatchFaceStatus.SPORT_ONGOING, null, 2, null);
                                break;
                            case 33:
                                watchFaceState = new WatchFaceState(WatchFaceStatus.TIME_ONGOING, null, 2, null);
                                break;
                            case 34:
                                watchFaceState = new WatchFaceState(WatchFaceStatus.BATTERY_LOW, null, 2, null);
                                break;
                            default:
                                watchFaceState = new WatchFaceState(WatchFaceStatus.FAIL, null, 2, null);
                                break;
                        }
                    } else {
                        watchFaceState = new WatchFaceState(WatchFaceStatus.MUSIC_ONGOING, null, 2, null);
                    }
                    onSyncResultCallBack.invoke(watchFaceState);
                }

                @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
                public void onFwProgress(@NotNull Progress progress) {
                    onSyncResultCallBack.invoke(new WatchFaceState(WatchFaceStatus.SYNCING, new WFProgress(progress.total, progress.progress)));
                }

                @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
                public void onFwStart(int none) {
                    onSyncResultCallBack.invoke(new WatchFaceState(WatchFaceStatus.SYNCING, null, 2, null));
                }

                @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
                public void onFwStop(boolean result) {
                    HMLog.debug(WFDeviceManager.b, new b(result));
                    if (result) {
                        onSyncResultCallBack.invoke(new WatchFaceState(WatchFaceStatus.SUCCESS, null, 2, null));
                    } else if (objectRef.element == null) {
                        onSyncResultCallBack.invoke(new WatchFaceState(WatchFaceStatus.FAIL, null, 2, null));
                    }
                }

                @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
                public void upgradingProgress(@NotNull HMFirmwareType type, @NotNull Progress progress) {
                    HMLog.debug(WFDeviceManager.b, new c(progress));
                    onSyncResultCallBack.invoke(new WatchFaceState(WatchFaceStatus.USING, new WFProgress(progress.total, progress.progress)));
                }
            });
        }
    }
}
