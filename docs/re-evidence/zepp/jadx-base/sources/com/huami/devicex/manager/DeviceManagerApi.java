package com.huami.devicex.manager;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.widget.ImageView;
import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.account.ui.bind.PhoneBindActivity;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.setting.life.DeviceRestoreEventGetter;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H&J#\u0010\n\u001a\u00020\t2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H&¢\u0006\u0004\b\n\u0010\rJ\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u000e\u001a\u00020\u0002H'J\b\u0010\u000f\u001a\u00020\u0002H&J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0010H&J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0010H&J \u0010 \u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H&J\u001c\u0010$\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010&\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010\u0012H&J\u0018\u0010*\u001a\u00020\t2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0019H&J\b\u0010+\u001a\u00020\u0016H&J\b\u0010,\u001a\u00020\tH&J\b\u0010-\u001a\u00020\u0016H&J\u001a\u0010/\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\tH&J\u0010\u0010/\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u00100\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H&J\u0010\u00102\u001a\u00020\u00162\u0006\u00101\u001a\u00020\tH&J\u0012\u00103\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u00104\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u00108\u001a\u0004\u0018\u0001072\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\u0012H&J\u0010\u0010:\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u000209H&J\u0012\u0010;\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u000209H&J,\u0010?\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020=j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0002`>2\u0006\u0010<\u001a\u00020\u0002H&J\u0010\u0010@\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010A\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010B\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010C\u001a\u00020\tH&J\b\u0010D\u001a\u00020\tH&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0012\u0010E\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H&J\u0018\u0010G\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0012H&J\u0010\u0010H\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0010H&J\u001a\u0010I\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0012H&J\b\u0010J\u001a\u00020\u0016H&J\u0018\u0010L\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020K2\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010M\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0006H&J\n\u0010N\u001a\u0004\u0018\u00010\u0004H&J\b\u0010O\u001a\u00020\tH&J\u0010\u0010P\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010Q\u001a\u0004\u0018\u0001072\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010R\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010S\u001a\u00020\tH&J\b\u0010T\u001a\u00020\tH&J\b\u0010U\u001a\u00020\tH&J\u0010\u0010V\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010W\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010X\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0010H&J\u0012\u0010Y\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010[\u001a\u0004\u0018\u00010Z2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010]\u001a\u00020\u00162\u0006\u0010\\\u001a\u00020\tH&J\u0014\u0010^\u001a\u0004\u0018\u00010\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&J\b\u0010`\u001a\u00020_H&¨\u0006a"}, d2 = {"Lcom/huami/devicex/manager/DeviceManagerApi;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDevice", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getBoundDeviceSource", "source", "", "hasBound", "", "sources", "([Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)Z", "getMajorDeviceType", "getMajorDeviceTypeNew", "Lcom/xiaomi/hm/health/databases/model/Device;", "getBindInfo", "", "getBoundDeviceFirmwareVersion", "hasBoundAnyDevice", "device", "", "unbindDevice", "getBoundDeviceAddress", "", "getActiveStatus", "bleDevice", "dbDevice", "bindDevice", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "firmware", "freshFirmwareCached", "Landroid/widget/ImageView;", "imageView", "deviceSource", "updateDeviceImg", "ids", "setUploadDeviceIds", "Landroid/app/Activity;", "activity", PhoneBindActivity.EXTRA_BIND_TYPE, "checkConnectedWatchDevice", "saveBaseStep", "isSupportSensorHub", "checkforBindSensorhub", "isBackground", "startSyncData", "isActive", "resetDialogStatus", "resetEarbudSetting", "getBoundDeviceId", "getHardwareVersion", "isLeft", "deviceId", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "getEarbudBattery", "Lcom/huami/watch/companion/device/Device;", "getWatchDeviceSource", "toMifitDevice", "deviceType", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getBoundDevices", "disableDevice", "enableDevice", "isConnected", "isBluetoothSupportAndDisable", "isBluetoothEnable", "isUseWearCompanionName", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME, "updateDisplayName", "updateDevice", "getBindDevice", "refreshMozartDeviceState", "Landroid/bluetooth/BluetoothDevice;", "isBoundDevice", "getConflictDevice", "getMiliDevice", "supportHealthDetect", "destroyDevice", "getBatteryInfo", "isSyncingData", "startSyncBoltGpsData", "startSyncGpsData", "supportPressure", "getDeviceBound", "getBoundDeviceHrFirmwareVersion", "createBleDevice", "createDevice", "Lcom/xiaomi/hm/health/bt/profile/base/RealtimeStep;", "getRealtimeStep", "fromBind", "onTreadmillConnected", "getCurrentSessionId", "Lcom/xiaomi/hm/health/device/setting/life/DeviceRestoreEventGetter;", "getDeviceRestoreInfoGetter", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DeviceManagerApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void startSyncData$default(DeviceManagerApi deviceManagerApi, HMDeviceType hMDeviceType, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSyncData");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            deviceManagerApi.startSyncData(hMDeviceType, z);
        }
    }

    void bindDevice(@NotNull HMBaseDevice bleDevice, @NotNull Device dbDevice);

    boolean checkConnectedWatchDevice(@NotNull Activity activity, int bindType);

    void checkforBindSensorhub();

    @Nullable
    HMBaseDevice createBleDevice(@NotNull Device device);

    @Nullable
    HMBaseDevice createDevice(@NotNull HMDeviceType type);

    void destroyDevice(@NotNull HMDeviceType type);

    void disableDevice(@NotNull HMDeviceType type);

    void enableDevice(@NotNull Device device, @Nullable HMBaseDevice bleDevice);

    void freshFirmwareCached(@NotNull HMDeviceType type, @NotNull String address, @NotNull String firmware);

    int getActiveStatus(@NotNull HMDeviceType type);

    @Nullable
    BatteryInfo getBatteryInfo(@NotNull HMDeviceType type);

    @Nullable
    Device getBindDevice(@NotNull HMDeviceType type, @NotNull String address);

    @Nullable
    Device getBindInfo(@NotNull HMDeviceType type);

    @Nullable
    String getBoundDeviceAddress(@NotNull HMDeviceType type);

    @Nullable
    String getBoundDeviceFirmwareVersion(@NotNull HMDeviceType type);

    @Nullable
    String getBoundDeviceHrFirmwareVersion(@NotNull HMDeviceType type);

    @Nullable
    String getBoundDeviceId(@NotNull HMDeviceType type);

    @NotNull
    HMDeviceSource getBoundDeviceSource(@Nullable HMDeviceType type);

    @NotNull
    HashMap<String, HMDeviceType> getBoundDevices(@NotNull HMDeviceType deviceType);

    @NotNull
    Device getConflictDevice(@NotNull HMDeviceSource source);

    @Nullable
    String getCurrentSessionId(@Nullable HMDeviceSource source);

    @Nullable
    HMBaseDevice getDevice();

    @Nullable
    HMBaseDevice getDevice(@Nullable HMDeviceType type);

    @NotNull
    Device getDeviceBound(@NotNull HMDeviceType type);

    @NotNull
    DeviceRestoreEventGetter getDeviceRestoreInfoGetter();

    @Nullable
    BatteryInfo getEarbudBattery(boolean isLeft, @NotNull String deviceId);

    @NotNull
    String getHardwareVersion(@NotNull HMDeviceType type);

    @Deprecated(message = "Method outdated", replaceWith = @ReplaceWith(expression = "getMajorDeviceTypeNew()", imports = {}))
    @NotNull
    HMDeviceType getMajorDeviceType();

    @NotNull
    HMDeviceType getMajorDeviceTypeNew();

    @Nullable
    HMBaseDevice getMiliDevice();

    @Nullable
    RealtimeStep getRealtimeStep(@NotNull HMDeviceType type);

    @NotNull
    HMDeviceSource getWatchDeviceSource(@NotNull com.huami.watch.companion.device.Device device);

    boolean hasBound(@NotNull HMDeviceSource source);

    boolean hasBound(@NotNull HMDeviceType type);

    boolean hasBound(@NotNull HMDeviceSource... sources);

    boolean hasBoundAnyDevice(@NotNull HMDeviceSource source);

    boolean hasBoundAnyDevice(@NotNull HMDeviceType type);

    boolean isActive(@Nullable Device device);

    boolean isBluetoothEnable();

    boolean isBluetoothSupportAndDisable();

    boolean isBoundDevice(@NotNull BluetoothDevice device, @NotNull HMDeviceSource source);

    boolean isConnected(@NotNull HMDeviceType type);

    boolean isSupportSensorHub();

    boolean isSyncingData(@NotNull HMDeviceType type);

    boolean isUseWearCompanionName(@Nullable Device device);

    void onTreadmillConnected(boolean fromBind);

    void refreshMozartDeviceState();

    void resetEarbudSetting(boolean resetDialogStatus);

    void saveBaseStep();

    void setUploadDeviceIds(@Nullable String ids);

    boolean startSyncBoltGpsData();

    void startSyncData(@NotNull HMDeviceType type);

    void startSyncData(@NotNull HMDeviceType type, boolean isBackground);

    boolean startSyncGpsData();

    boolean supportHealthDetect();

    boolean supportPressure();

    @Nullable
    Device toMifitDevice(@NotNull com.huami.watch.companion.device.Device device);

    void unbindDevice(@NotNull HMDeviceType type);

    void unbindDevice(@NotNull Device device);

    void updateDevice(@NotNull Device device);

    void updateDeviceImg(@Nullable ImageView imageView, @Nullable HMDeviceSource deviceSource);

    boolean updateDisplayName(@NotNull HMDeviceType type, @NotNull String displayName);
}
