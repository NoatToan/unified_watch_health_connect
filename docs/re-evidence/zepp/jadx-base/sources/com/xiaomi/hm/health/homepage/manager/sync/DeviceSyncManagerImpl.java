package com.xiaomi.hm.health.homepage.manager.sync;

import android.content.Context;
import android.os.Build;
import com.huami.koinstartup.KoinAdapterKt;
import com.huami.lib.v2.ZeppPermissionManagerKt;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.module.homepage.sync.manager.IDeviceSyncManager;
import com.huami.module.homepage.sync.status.BatteryChangeEvent;
import com.huami.module.homepage.sync.status.ConnectFailSyncEvent;
import com.huami.module.homepage.sync.status.ConnectedSyncEvent;
import com.huami.module.homepage.sync.status.ConnectingSyncEvent;
import com.huami.module.homepage.sync.status.ErrorCode;
import com.huami.module.homepage.sync.status.MajorSyncErrorEvent;
import com.huami.module.homepage.sync.status.PrimaryDeviceUpdateEvent;
import com.huami.module.homepage.sync.status.RomUpdateEvent;
import com.huami.module.homepage.sync.status.SyncEvent;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.wallet.accessdoor.utils.AccessDoorUI;
import com.huami.wallet.ui.utils.WalletUI;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceFreeTask;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUtils;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.homepage.manager.powerstyle.WatchPowerHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u0019\u001a\u00020\u0002H\u0016J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aR\u0016\u0010 \u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/homepage/manager/sync/DeviceSyncManagerImpl;", "Lcom/huami/module/homepage/sync/manager/IDeviceSyncManager;", "", "initDeviceSyncManager", "releaseDeviceSyncManager", "", "", "getBoundAndActivateDeviceSource", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "deviceIsConnected", "bluetoothEnable", "getPrimaryDeviceType", "isPrimaryDevice", "startSyncDeviceData", "hasBluetoothPermission", "syncData", "deviceConnectedExactly", "immediatelySyncDevice", "needSyncGpsData$app_midongPlayRelease", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceType;)Z", "needSyncGpsData", "checkFwAndFree", "checkFwUpgrade", "updatePrimaryDeviceType", "", "errorCode", "Lcom/huami/module/homepage/sync/status/ErrorCode;", "handleErrorCode", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "primaryDeviceType", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceSyncManagerImpl implements IDeviceSyncManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private HMDeviceType primaryDeviceType = HMDeviceType.VDevice;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            iArr[HMDeviceType.MILI.ordinal()] = 1;
            iArr[HMDeviceType.SENSORHUB.ordinal()] = 2;
            iArr[HMDeviceType.SHOES.ordinal()] = 3;
            iArr[HMDeviceType.WATCH.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "DeviceSyncManager---> fw update status:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMDeviceType hMDeviceType) {
            super(0);
            this.a = hMDeviceType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "DeviceSyncManager---> 优先连接上的设备：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMDeviceType hMDeviceType) {
            super(0);
            this.a = hMDeviceType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "DeviceSyncManager---> " + this.a + " 开始同步数据";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMDeviceType hMDeviceType) {
            super(0);
            this.a = hMDeviceType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "DeviceSyncManager---> " + this.a + " 不需要立马同步数据";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Integer, Unit> {
        public e() {
            super(1);
        }

        public final void a(int i) {
            DeviceSyncManagerImpl.this.notify(new BatteryChangeEvent(HMDeviceType.WATCH, i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "DeviceSyncManager---> start sync data:" + DeviceSyncManagerImpl.this.primaryDeviceType;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "DeviceSyncManager---> bluetooth is off.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "DeviceSyncManager---> no bluetooth permission.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "DeviceSyncManager---> 主设备 " + DeviceSyncManagerImpl.this.primaryDeviceType + " 已连接";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "DeviceSyncManager---> sync watch network error";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "DeviceSyncManager---> 主设备 " + DeviceSyncManagerImpl.this.primaryDeviceType + " 正在连接中...";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(HMDeviceType hMDeviceType) {
            super(0);
            this.a = hMDeviceType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "DeviceSyncManager---> 主设备未连接上，但存在其他优先连接上的设备：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(HMDeviceType hMDeviceType) {
            super(0);
            this.a = hMDeviceType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "DeviceSyncManager---> start sync " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "DeviceSyncManager---> updatePrimaryDeviceType:" + DeviceSyncManagerImpl.this.primaryDeviceType;
        }
    }

    public final boolean bluetoothEnable() {
        return HMDeviceManager.getInstance().isBluetoothEnable();
    }

    public final boolean checkFwAndFree(@NotNull HMDeviceType type) {
        boolean zCheckFwUpgrade = checkFwUpgrade(type);
        HMLog.info("HomePage", new a(zCheckFwUpgrade));
        if (!zCheckFwUpgrade) {
            new HMDeviceFreeTask().execute(type);
        }
        return zCheckFwUpgrade;
    }

    public final boolean checkFwUpgrade(@NotNull HMDeviceType type) {
        if (HMFwOnlineManager.shouldCheckFwAuto(type)) {
            return (HMFwOnlineUpgradeManager.SUPPORT_CLOUD_FW_UPGRADE && HMFwOnlineUpgradeManager.getInstance().useOnline(type)) ? HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(BraceletApp.getContext(), type, false) : HMFwUpgradeManager.getInstance().checkFwUpgrade(BraceletApp.getContext(), type, false);
        }
        return false;
    }

    public final void deviceConnectedExactly(@NotNull HMDeviceType type) {
        if (HMDeviceManager.getInstance().getBoundDeviceSource(type) == HMDeviceSource.WATCH_AMAZFIT) {
            notify(RomUpdateEvent.INSTANCE);
        }
        HMDeviceType priorityConnectedDeviceType = HMDeviceManager.getInstance().getPriorityConnectedDeviceType();
        if (priorityConnectedDeviceType != null) {
            if (!(priorityConnectedDeviceType != HMDeviceType.SENSORHUB)) {
                priorityConnectedDeviceType = null;
            }
            if (priorityConnectedDeviceType != null) {
                HMLog.info("HomePage", new b(priorityConnectedDeviceType));
                this.primaryDeviceType = priorityConnectedDeviceType;
                notify(new PrimaryDeviceUpdateEvent(priorityConnectedDeviceType));
            }
        }
        if (this.primaryDeviceType == HMDeviceType.HEADSET) {
            notify(new ConnectedSyncEvent(type, false));
            return;
        }
        if (!immediatelySyncDevice(type)) {
            HMLog.info("HomePage", new d(type));
            if (isPrimaryDevice(type)) {
                notify(new ConnectedSyncEvent(type, false));
            }
            checkFwUpgrade(type);
            return;
        }
        if (type == HMDeviceType.WEIGHT) {
            if (isPrimaryDevice(type)) {
                notify(new ConnectedSyncEvent(type, true));
            }
            syncData(type);
        } else if (!GPSDataController.getInstance().isRunning() && !WalletUI.getInstance().isInWallet() && !AccessDoorUI.getInstance().isInAccessDoor()) {
            HMLog.info("HomePage", new c(type));
            syncData(type);
        } else if (isPrimaryDevice(type)) {
            notify(new ConnectedSyncEvent(type, false));
        }
    }

    @Override // com.huami.module.homepage.sync.manager.IDeviceSyncManager
    public boolean deviceIsConnected(@NotNull HMDeviceType type) {
        return HMDeviceManager.getInstance().isConnected(type);
    }

    @Override // com.huami.module.homepage.sync.manager.IDeviceSyncManager
    @NotNull
    public List<String> getBoundAndActivateDeviceSource() {
        ArrayList arrayList = new ArrayList();
        for (Device device : HMDeviceManager.getDeviceListOrdered()) {
            if (HMDeviceManager.getInstance().hasBound(HMDeviceSource.fromValue(device.getDevice_source().intValue()))) {
                arrayList.add(String.valueOf(device.getDevice_source()));
            }
        }
        return arrayList;
    }

    @NotNull
    public final HMDeviceType getPrimaryDeviceType() {
        return this.primaryDeviceType;
    }

    @NotNull
    public final ErrorCode handleErrorCode(int errorCode) {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(this.primaryDeviceType);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.primaryDeviceType.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return ErrorCode.TYPE_SENSORHUB_SYNC_FAILED;
            }
            if (i2 != 3) {
                return i2 != 4 ? ErrorCode.ERROR_OTHER : ErrorCode.TYPE_WATCH_SYNC_FAILED;
            }
            return ErrorCode.TYPE_SHOES_SYNC_FAILED;
        }
        if (errorCode == 5 && HMDeviceConfig.hasFeatureSportOrTimer(boundDeviceSource)) {
            return ErrorCode.TYPE_SPORT_WATCH_SYNC_FAILED;
        }
        if (errorCode == 6 && HMDeviceConfig.supportMusicControl(boundDeviceSource)) {
            return ErrorCode.TYPE_MUSIC_ALIVE_FAILED;
        }
        return HMDeviceConfig.hasBoundWatch() ? ErrorCode.TYPE_WATCH_SYNC_FAILED : ErrorCode.TYPE_MILI_SYNC_FAILED;
    }

    public final boolean hasBluetoothPermission() {
        return Build.VERSION.SDK_INT < 31 || ZeppPermissionManagerKt.hasPermission((Context) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null), "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_ADVERTISE");
    }

    @Override // com.huami.module.homepage.sync.manager.IDeviceSyncManager
    public boolean immediatelySyncDevice(@NotNull HMDeviceType type) {
        if (type != HMDeviceType.VDevice && type != HMDeviceType.SENSORHUB) {
            if (type == HMDeviceType.WEIGHT || !HMDeviceManager.getInstance().isConnected(type)) {
                return true;
            }
            if (System.currentTimeMillis() - HMDeviceManager.getInstance().getBoundDeviceSyncTime(type).getTimeInMillis() > 120000) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huami.module.homepage.sync.manager.IDeviceSyncManager
    public void initDeviceSyncManager() {
        DeviceEventListener.INSTANCE.getInstance().init(this);
        WatchPowerHelper.INSTANCE.init(new e());
        updatePrimaryDeviceType();
    }

    public final boolean isPrimaryDevice(@NotNull HMDeviceType type) {
        return type == this.primaryDeviceType;
    }

    public final boolean needSyncGpsData$app_midongPlayRelease(@NotNull HMDeviceType type) {
        if (type == HMDeviceType.SENSORHUB || type == HMDeviceType.VDevice || type == HMDeviceType.HEADSET || type == HMDeviceType.EARBUD || type == HMDeviceType.WEIGHT) {
            return false;
        }
        return HMDeviceManager.getInstance().startSyncGpsData();
    }

    @Override // com.huami.module.homepage.sync.manager.IDeviceSyncManager
    public void notify(@NotNull SyncEvent syncEvent) {
        IDeviceSyncManager.DefaultImpls.notify(this, syncEvent);
    }

    @Override // com.huami.module.homepage.sync.manager.IDeviceSyncManager
    public void releaseDeviceSyncManager() {
        DeviceEventListener.INSTANCE.getInstance().release();
        WatchPowerHelper.INSTANCE.release();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    @Override // com.huami.module.homepage.sync.manager.IDeviceSyncManager
    public void startSyncDeviceData() {
        HMLog.info("HomePage", new f());
        updatePrimaryDeviceType();
        HMDeviceType hMDeviceType = this.primaryDeviceType;
        if (hMDeviceType == HMDeviceType.VDevice) {
            notify(new ConnectFailSyncEvent(hMDeviceType, ErrorCode.TYPE_NO_DEVICE));
            return;
        }
        if (!HMDeviceManager.getInstance().isBluetoothEnable() && this.primaryDeviceType != HMDeviceType.SENSORHUB) {
            HMLog.info("HomePage", g.a);
            notify(new ConnectFailSyncEvent(this.primaryDeviceType, ErrorCode.TYPE_BLUETOOTH_OFF));
            return;
        }
        if (!hasBluetoothPermission()) {
            HMLog.info("HomePage", h.a);
            notify(new ConnectFailSyncEvent(this.primaryDeviceType, ErrorCode.ERROR_NO_BLUETOOTH));
            return;
        }
        if (HMDeviceManager.getInstance().isConnected(this.primaryDeviceType)) {
            HMLog.info("HomePage", new i());
            notify(new ConnectedSyncEvent(this.primaryDeviceType, true));
            syncData(this.primaryDeviceType);
        } else {
            HMDeviceType priorityConnectedDeviceType = HMDeviceManager.getInstance().getPriorityConnectedDeviceType();
            if (priorityConnectedDeviceType != null) {
                if (!(priorityConnectedDeviceType != HMDeviceType.SENSORHUB)) {
                    priorityConnectedDeviceType = null;
                }
            } else {
                priorityConnectedDeviceType = null;
            }
            if (priorityConnectedDeviceType == null) {
                HMDeviceType hMDeviceType2 = this.primaryDeviceType;
                HMDeviceType hMDeviceType3 = HMDeviceType.WATCH;
                if (hMDeviceType2 != hMDeviceType3) {
                    HMLog.info("HomePage", new k());
                    if (hasBluetoothPermission()) {
                        notify(new ConnectingSyncEvent(this.primaryDeviceType));
                    } else {
                        notify(new ConnectFailSyncEvent(this.primaryDeviceType, ErrorCode.ERROR_NO_BLUETOOTH));
                    }
                } else {
                    if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
                        HMLog.info("HomePage", j.a);
                        notify(new MajorSyncErrorEvent(ErrorCode.ERROR_NETWORK));
                        return;
                    }
                    syncData(hMDeviceType3);
                }
            } else {
                HMLog.info("HomePage", new l(priorityConnectedDeviceType));
                this.primaryDeviceType = priorityConnectedDeviceType;
                notify(new PrimaryDeviceUpdateEvent(priorityConnectedDeviceType));
                notify(new ConnectedSyncEvent(this.primaryDeviceType, true));
                syncData(this.primaryDeviceType);
            }
        }
        HMDeviceType hMDeviceType4 = this.primaryDeviceType;
        HMDeviceType hMDeviceType5 = HMDeviceType.EARBUD;
        if (hMDeviceType4 == hMDeviceType5 || !HMDeviceManager.getInstance().isConnected(hMDeviceType5)) {
            return;
        }
        syncData(hMDeviceType5);
    }

    public final void syncData(@NotNull HMDeviceType type) {
        if (HMFwUtils.allowDataSync(type) && (type != HMDeviceType.EARBUD || HMFwUtils.allowEarbudDataSync())) {
            HMLog.info("HomePage", new m(type));
            HMDeviceManager.getInstance().startSyncData(type, false);
        } else if (type == this.primaryDeviceType) {
            notify(new MajorSyncErrorEvent(ErrorCode.ERROR_FORBIDDEN_SYNC_DATA));
        }
    }

    @Override // com.huami.module.homepage.sync.manager.IDeviceSyncManager
    public void updatePrimaryDeviceType() {
        HMDeviceType majorDeviceTypeNew = HMDeviceManager.getInstance().getMajorDeviceTypeNew();
        this.primaryDeviceType = majorDeviceTypeNew;
        notify(new PrimaryDeviceUpdateEvent(majorDeviceTypeNew));
        HMLog.info("HomePage", new n());
    }
}
