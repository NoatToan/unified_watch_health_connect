package com.xiaomi.hm.health.datautil;

import android.app.Activity;
import com.huami.components.devicestatus.DeviceStatusDataSource;
import com.huami.components.devicestatus.DeviceStatusDelegate;
import com.huami.components.devicestatus.DeviceStatusNavigator;
import com.huami.tools.log.HMLog;
import com.huami.wallet.accessdoor.utils.AccessDoorUI;
import com.huami.wallet.ui.utils.WalletUI;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.datautil.WalletDataUtil;
import com.xiaomi.hm.health.device.HMDeviceHelperActivity;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.NfcDeviceConfigKt;
import com.xiaomi.hm.health.device.agps.HMAgpsUpgradeManager;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.nfc.DoorDeviceStatusStringProvider;
import com.xiaomi.hm.health.nfc.WalletDeviceStatusStringProvider;
import de.greenrobot.event.EventBus;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class WalletDataUtil {
    private static final String DC_TAG = "Wallet-DeviceConnection";
    private static volatile WalletDataUtil instance;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.datautil.WalletDataUtil$1, reason: invalid class name */
    public class AnonymousClass1 implements DeviceStatusDataSource {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$startSyncData$0(HMDeviceType hMDeviceType) {
            return "startSyncData  type:" + hMDeviceType;
        }

        @Override // com.huami.components.devicestatus.DeviceStatusDataSource
        public int getSyncAGPSProgress() {
            Progress agpsProgress;
            HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceManager.getInstance().getMajorDeviceType());
            if (device == null || !(device instanceof HMMiLiProDevice) || (agpsProgress = HMAgpsUpgradeManager.getAgpsProgress()) == null) {
                return -1;
            }
            return agpsProgress.getPercent();
        }

        @Override // com.huami.components.devicestatus.DeviceStatusDataSource
        public int getSyncDataProgress() {
            Progress progress;
            HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceManager.getInstance().getMajorDeviceType());
            if (device == null || (progress = device.getSyncStatus().getProgress()) == null) {
                return -1;
            }
            return progress.getPercent();
        }

        @Override // com.huami.components.devicestatus.DeviceStatusDataSource
        public boolean hasBoundExpectedDevice() {
            return NfcDeviceConfigKt.hasFeatureNfc();
        }

        @Override // com.huami.components.devicestatus.DeviceStatusDataSource
        public boolean isConnectedExpectedDevice() {
            return HMDeviceManager.getInstance().isConnected(HMDeviceManager.getInstance().getMajorDeviceType());
        }

        @Override // com.huami.components.devicestatus.DeviceStatusDataSource
        public boolean isExpectedDeviceType(int deviceType) {
            return deviceType == HMDeviceType.MILI.getValue() || deviceType == HMDeviceType.WATCH.getValue();
        }

        @Override // com.huami.components.devicestatus.DeviceStatusDataSource
        public boolean isSyncFailed() {
            HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceManager.getInstance().getMajorDeviceType());
            return (device == null || device.getSyncStatus().getProgress() != null || device.getSyncStatus().getError().getError() == 0) ? false : true;
        }

        @Override // com.huami.components.devicestatus.DeviceStatusDataSource
        public void startSyncData() {
            final HMDeviceType majorDeviceType = HMDeviceManager.getInstance().getMajorDeviceType();
            HMLog.info(WalletDataUtil.DC_TAG, new Function0() { // from class: com.xiaomi.hm.health.datautil.a
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return WalletDataUtil.AnonymousClass1.lambda$startSyncData$0(majorDeviceType);
                }
            });
            HMDeviceManager.getInstance().startSyncData(majorDeviceType);
        }
    }

    private DeviceStatusDataSource generateDeviceStatusDataSource() {
        return new AnonymousClass1();
    }

    public static WalletDataUtil getInstance() {
        if (instance == null) {
            synchronized (WalletDataUtil.class) {
                if (instance == null) {
                    instance = new WalletDataUtil();
                }
            }
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onEventMainThread$10(boolean z, HMDeviceSyncDataEvent hMDeviceSyncDataEvent) {
        return "onStopSyncData() hasError:" + z + ", error:" + hMDeviceSyncDataEvent.getError() + ", device type: " + hMDeviceSyncDataEvent.getDeviceType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onEventMainThread$12() {
        return "onStartSyncAGPS()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onEventMainThread$13(int i) {
        return "onSynchronizingAGPS() percent:" + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onEventMainThread$14(boolean z) {
        return "onStopSyncAGPS() hasError:" + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onEventMainThread$3() {
        return "onConnected()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onEventMainThread$4() {
        return "onConnecting()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onEventMainThread$5() {
        return "onDisconnected()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onEventMainThread$6() {
        return "onConnectingTimeout()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onEventMainThread$8(HMDeviceSyncDataEvent hMDeviceSyncDataEvent) {
        return "onStartSyncData() device type:  " + hMDeviceSyncDataEvent.getDeviceType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onEventMainThread$9(int i, HMDeviceSyncDataEvent hMDeviceSyncDataEvent) {
        return "onSynchronizingData() percent:" + i + ", device type: " + hMDeviceSyncDataEvent.getDeviceType();
    }

    public void init() {
        WalletUI.getInstance().setCanDeleteCard(false);
        DeviceStatusDelegate.getInstance().setDataSource(generateDeviceStatusDataSource());
        WalletUI.getInstance().setDeviceStatusStringProvider(new WalletDeviceStatusStringProvider());
        WalletUI.getInstance().setDeviceStatusNavigator(new DeviceStatusNavigator() { // from class: ad8
            @Override // com.huami.components.devicestatus.DeviceStatusNavigator
            public final void goToHelpPage(Activity activity) {
                HMDeviceHelperActivity.show(activity, 0, 1);
            }
        });
        AccessDoorUI.getInstance().setDeviceStatusStringProvider(new DoorDeviceStatusStringProvider());
        AccessDoorUI.getInstance().setDeviceStatusNavigator(new DeviceStatusNavigator() { // from class: uc8
            @Override // com.huami.components.devicestatus.DeviceStatusNavigator
            public final void goToHelpPage(Activity activity) {
                HMDeviceHelperActivity.show(activity, 0, 1);
            }
        });
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    public void onEventMainThread(final HMDeviceConnectionEvent event) {
        HMLog.debug(DC_TAG, new Function0() { // from class: dd8
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return String.valueOf(event);
            }
        });
        if (event.isConnected()) {
            DeviceStatusDelegate.getInstance().onConnected(event.getDeviceType().getValue());
            HMLog.info(DC_TAG, new Function0() { // from class: zc8
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return WalletDataUtil.lambda$onEventMainThread$3();
                }
            });
            return;
        }
        if (event.isConnecting()) {
            DeviceStatusDelegate.getInstance().onConnecting(event.getDeviceType().getValue());
            HMLog.info(DC_TAG, new Function0() { // from class: xc8
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return WalletDataUtil.lambda$onEventMainThread$4();
                }
            });
        } else if (event.isDisconnected()) {
            DeviceStatusDelegate.getInstance().onDisconnected(event.getDeviceType().getValue());
            HMLog.info(DC_TAG, new Function0() { // from class: yc8
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return WalletDataUtil.lambda$onEventMainThread$5();
                }
            });
        } else if (event.isConnectingTimeout()) {
            DeviceStatusDelegate.getInstance().onConnectingTimeout(event.getDeviceType().getValue());
            HMLog.info(DC_TAG, new Function0() { // from class: wc8
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return WalletDataUtil.lambda$onEventMainThread$6();
                }
            });
        }
    }

    public void onEventMainThread(final HMDeviceSyncDataEvent event) {
        HMLog.debug(DC_TAG, new Function0() { // from class: fd8
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return String.valueOf(event);
            }
        });
        if (event.isStart()) {
            DeviceStatusDelegate.getInstance().onStartSyncData(event.getDeviceType().getValue());
            HMLog.info(DC_TAG, new Function0() { // from class: gd8
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return WalletDataUtil.lambda$onEventMainThread$8(event);
                }
            });
        } else if (event.isProgress()) {
            final int percent = event.getProgress().getPercent();
            DeviceStatusDelegate.getInstance().onSynchronizingData(event.getDeviceType().getValue(), percent);
            HMLog.info(DC_TAG, new Function0() { // from class: cd8
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return WalletDataUtil.lambda$onEventMainThread$9(percent, event);
                }
            });
        } else if (event.isStop()) {
            final boolean z = !event.getResult();
            DeviceStatusDelegate.getInstance().onStopSyncData(event.getDeviceType().getValue(), z);
            HMLog.info(DC_TAG, new Function0() { // from class: id8
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return WalletDataUtil.lambda$onEventMainThread$10(z, event);
                }
            });
        }
    }

    public void onEventMainThread(final HMDeviceFwUpgradeEvent event) {
        HMLog.debug(DC_TAG, new Function0() { // from class: ed8
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return String.valueOf(event);
            }
        });
        if (event.getFirmwareType() == HMFirmwareType.FIRMWARE_GPS_CEP || event.getFirmwareType() == HMFirmwareType.FIRMWARE_GPS_NMEA) {
            if (event.isStart()) {
                DeviceStatusDelegate.getInstance().onStartSyncAGPS(event.getDeviceType().getValue());
                HMLog.info(DC_TAG, new Function0() { // from class: vc8
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return WalletDataUtil.lambda$onEventMainThread$12();
                    }
                });
            } else if (event.isProgress()) {
                final int percent = event.getProgress().getPercent();
                DeviceStatusDelegate.getInstance().onSynchronizingAGPS(event.getDeviceType().getValue(), percent);
                HMLog.info(DC_TAG, new Function0() { // from class: bd8
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return WalletDataUtil.lambda$onEventMainThread$13(percent);
                    }
                });
            } else if (event.isStop()) {
                final boolean z = !event.getResult();
                DeviceStatusDelegate.getInstance().onStopSyncAGPS(event.getDeviceType().getValue(), z);
                HMLog.info(DC_TAG, new Function0() { // from class: hd8
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return WalletDataUtil.lambda$onEventMainThread$14(z);
                    }
                });
            }
        }
    }
}
