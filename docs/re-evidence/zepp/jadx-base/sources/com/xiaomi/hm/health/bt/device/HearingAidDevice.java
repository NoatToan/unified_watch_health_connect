package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.huami.bluetooth.profile.channel.module.hearing.HearingAidApi;
import com.huami.bluetooth.profile.channel.module.hearing.HearingBatteryApi;
import com.huami.bluetooth.profile.channel.module.hearing.HearingControllerFactory;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.hearingaid.HearingAidProfile;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.dfu.DfuApi;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareUpgradeTask;
import com.xiaomi.hm.health.bt.profile.dfu.HearingAidDfuTask;
import com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.dfu.NewDfuTask;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeModel;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPData;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPType;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.common.GdspFactory;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.scan.BleScanOption;
import com.xiaomi.hm.health.thirdbind.tencent.QQLogin;
import java.util.Calendar;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b3\u00104J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0013\u001a\u00020\u0006H\u0014J\u001c\u0010\u0018\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HearingAidDevice;", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "", QQLogin.KEY_RESULT, "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "type", "", "V", "U", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "getDeviceType", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/bluetooth/BluetoothDevice;", "device", "Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", "createProfile", "Lcom/xiaomi/hm/health/bt/model/HMStatisticInfo;", "getStatisticInfoInternal", "onDeviceConnected", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "firmwareInfo", "Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;", "callback", "updateFwUpgrade", "Lcom/xiaomi/hm/health/bt/profile/gdsp/HMGDSPType;", "Ljava/util/Calendar;", "calendar", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/HMGDSPData;", "syncGDSP", "Lcom/xiaomi/hm/health/bt/device/hearingaid/HearingAidProfile;", "y", "Lcom/xiaomi/hm/health/bt/device/hearingaid/HearingAidProfile;", "mHearingAidProfile", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidApi;", "z", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidApi;", "getMHearingAidApi", "()Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidApi;", "setMHearingAidApi", "(Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidApi;)V", "mHearingAidApi", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryApi;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryApi;", "getMHearingBatteryApi", "()Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryApi;", "setMHearingBatteryApi", "(Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryApi;)V", "mHearingBatteryApi", "<init>", "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HearingAidDevice extends HMBaseBleDevice {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private HearingBatteryApi mHearingBatteryApi;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private HearingAidProfile mHearingAidProfile;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private HearingAidApi mHearingAidApi;

    public HearingAidDevice(@NotNull Context context, @NotNull BluetoothDevice bluetoothDevice) {
        super(context, new HMBaseBleDevice.e(bluetoothDevice));
        setConnectScanOption(new BleScanOption.Builder().callback(this).needConnectedDevices(false).filterAddress(this.b.a()).scanTimeout(40000).build());
    }

    private final boolean U(HMFirmwareType type) {
        if (type == HMFirmwareType.FIRMWARE_BATCH) {
            return isConnected();
        }
        return type == HMFirmwareType.FIRMWARE_GPS || type == HMFirmwareType.FONT || type == HMFirmwareType.FONT_LATIN || type == HMFirmwareType.RESOURCE || type == HMFirmwareType.RESOURCE_COMPRESS || type == HMFirmwareType.RESOURCE_BASE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(boolean ret, HMFirmwareType type) {
        if (ret && U(type)) {
            updateDeviceInfo(this.mProfile.getDeviceInfo());
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    @NotNull
    public BaseProfile createProfile(@Nullable Context context, @Nullable BluetoothDevice device) {
        HearingAidProfile hearingAidProfile = new HearingAidProfile(context, device, this);
        this.mHearingAidProfile = hearingAidProfile;
        Objects.requireNonNull(hearingAidProfile);
        return hearingAidProfile;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    @NotNull
    public HMDeviceType getDeviceType() {
        return HMDeviceType.HEARING_AID;
    }

    @Nullable
    public final HearingAidApi getMHearingAidApi() {
        return this.mHearingAidApi;
    }

    @Nullable
    public final HearingBatteryApi getMHearingBatteryApi() {
        return this.mHearingBatteryApi;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    @NotNull
    public HMStatisticInfo getStatisticInfoInternal() {
        return new HMStatisticInfo();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnected() {
        super.onDeviceConnected();
        HearingControllerFactory hearingControllerFactory = HearingControllerFactory.INSTANCE;
        HearingAidProfile hearingAidProfile = this.mHearingAidProfile;
        Objects.requireNonNull(hearingAidProfile);
        this.mHearingAidApi = hearingControllerFactory.create(hearingAidProfile);
        HearingAidProfile hearingAidProfile2 = this.mHearingAidProfile;
        Objects.requireNonNull(hearingAidProfile2);
        this.mHearingBatteryApi = hearingControllerFactory.createBatteryApi(hearingAidProfile2);
    }

    public final void setMHearingAidApi(@Nullable HearingAidApi hearingAidApi) {
        this.mHearingAidApi = hearingAidApi;
    }

    public final void setMHearingBatteryApi(@Nullable HearingBatteryApi hearingBatteryApi) {
        this.mHearingBatteryApi = hearingBatteryApi;
    }

    public final void syncGDSP(@NotNull HMGDSPType type, @NotNull Calendar calendar, @NotNull IHMDataCallback<HMGDSPData> callback) {
        if (!isConnected() || getDeviceInfo() == null) {
            callback.onStart();
            callback.onStop(null, new HMDeviceError(3));
        } else {
            GdspFactory gdspFactory = GdspFactory.INSTANCE;
            HearingAidProfile hearingAidProfile = this.mHearingAidProfile;
            Objects.requireNonNull(hearingAidProfile);
            runOnDeviceOnlyThread(gdspFactory.getSingletonTask(hearingAidProfile, calendar, type, getDeviceSource(), getGdspVersion(), callback));
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void updateFwUpgrade(@Nullable final HMFirmwareInfo firmwareInfo, @Nullable final IHMFirmwareUpgradeCallback callback) {
        IFirmwareUpgradeCallback iFirmwareUpgradeCallback = new IFirmwareUpgradeCallback() { // from class: com.xiaomi.hm.health.bt.device.HearingAidDevice$updateFwUpgrade$innerCallback$1
            @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
            public void onError(int errorCode) {
                IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback = callback;
                IFirmwareUpgradeCallback iFirmwareUpgradeCallback2 = iHMFirmwareUpgradeCallback instanceof IFirmwareUpgradeCallback ? (IFirmwareUpgradeCallback) iHMFirmwareUpgradeCallback : null;
                if (iFirmwareUpgradeCallback2 == null) {
                    return;
                }
                iFirmwareUpgradeCallback2.onError(errorCode);
            }

            @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
            public void onFwProgress(@NotNull Progress progress) {
                IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback = callback;
                if (iHMFirmwareUpgradeCallback == null) {
                    return;
                }
                iHMFirmwareUpgradeCallback.onFwProgress(progress);
            }

            @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
            public void onFwStart(int none) {
                IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback = callback;
                if (iHMFirmwareUpgradeCallback == null) {
                    return;
                }
                iHMFirmwareUpgradeCallback.onFwStart(none);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x002d  */
            /* JADX WARN: Code duplicated, block: B:22:0x0039  */
            @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
            public void onFwStop(boolean result) {
                HMFirmwareInfo hMFirmwareInfo = firmwareInfo;
                if ((hMFirmwareInfo == null ? null : hMFirmwareInfo.getContinueUpgradeState()) != HMFirmwareInfo.ContinueUpgradeState.CONTINUE) {
                    HMFirmwareInfo hMFirmwareInfo2 = firmwareInfo;
                    if ((hMFirmwareInfo2 == null ? null : hMFirmwareInfo2.getUpgradeModel()) != UpgradeModel.CONTINUE_UPGRADE) {
                        HearingAidDevice hearingAidDevice = this;
                        HMFirmwareInfo hMFirmwareInfo3 = firmwareInfo;
                        hearingAidDevice.V(result, hMFirmwareInfo3 != null ? hMFirmwareInfo3.getFwType() : null);
                    } else if (firmwareInfo.getContinueModeExtraInfo().isLast()) {
                        this.V(result, firmwareInfo.getFwType());
                    }
                } else if (firmwareInfo.getContinueModeExtraInfo().isLast()) {
                    this.V(result, firmwareInfo.getFwType());
                }
                IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback = callback;
                if (iHMFirmwareUpgradeCallback == null) {
                    return;
                }
                iHMFirmwareUpgradeCallback.onFwStop(result);
            }

            @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
            public void upgradingProgress(@NotNull HMFirmwareType type, @NotNull Progress progress) {
                IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback = callback;
                IFirmwareUpgradeCallback iFirmwareUpgradeCallback2 = iHMFirmwareUpgradeCallback instanceof IFirmwareUpgradeCallback ? (IFirmwareUpgradeCallback) iHMFirmwareUpgradeCallback : null;
                if (iFirmwareUpgradeCallback2 == null) {
                    return;
                }
                iFirmwareUpgradeCallback2.upgradingProgress(type, progress);
            }
        };
        DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            Debug.fi(HMBaseBleDevice.q, "device info is null!!!");
            if (callback != null) {
                callback.onFwStart(0);
            }
            if (callback == null) {
                return;
            }
            callback.onFwStop(false);
            return;
        }
        if (!deviceInfo.getDeviceFeature().hasBase(3)) {
            if (!HMDeviceFeature.c(deviceInfo)) {
                Debug.fi(HMBaseBleDevice.q, "old protocol");
                runOnDeviceOnlyThread(new HMFirmwareUpgradeTask(this.mProfile, firmwareInfo, iFirmwareUpgradeCallback));
                return;
            } else {
                Debug.fi(HMBaseBleDevice.q, "DFU V4");
                if (firmwareInfo == null) {
                    return;
                }
                runOnDeviceOnlyThread(new HearingAidDfuTask(this.mProfile, firmwareInfo, iFirmwareUpgradeCallback));
                return;
            }
        }
        DfuApi dfuApi = getDfuApi();
        if (dfuApi == null) {
            return;
        }
        Debug.fi(HMBaseBleDevice.q, "DFU V5");
        if (firmwareInfo == null) {
            return;
        }
        if (firmwareInfo.getUpgradeModel() == UpgradeModel.BACKGROUND) {
            runOnDeviceMultiThread(new NewDfuTask(dfuApi, firmwareInfo, iFirmwareUpgradeCallback));
        } else {
            runOnDeviceOnlyThread(new NewDfuTask(dfuApi, firmwareInfo, iFirmwareUpgradeCallback));
        }
    }
}
