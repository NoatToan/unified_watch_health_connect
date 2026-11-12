package com.xiaomi.hm.health.bt.profile.healthdevice.remind;

import com.huami.bluetooth.profile.cmdrequest.DataBuilder;
import com.huami.bluetooth.profile.devicectrl.BleDeviceController;
import com.huami.bluetooth.profile.heathdevice.HealthECFCommand;
import com.huami.bluetooth.profile.heathdevice.HealthECFExtendCommand;
import com.huami.bluetooth.profile.heathdevice.RemindCommand;
import com.huami.bluetooth.profile.heathdevice.RemindOperation;
import com.huami.bluetooth.profile.heathdevice.RemindType;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.model.SimpleTime;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.milipro.IMiLiProProfile;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\rJ\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0012J\u0016\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0016J\u0014\u0010\u001b\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u000e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/HealthDeviceCmdHandler;", "Lcom/huami/bluetooth/profile/devicectrl/BleDeviceController;", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand;", "a", "b", "", "enable", "setHRRemind", "Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/DrinkWaterConfig;", "config", "setDrinkWaterRemind", "Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/CommonRemindConfig;", "setRemind", "Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "type", "enableRemind", "Lcom/xiaomi/hm/health/bt/model/HMSedentaryConfig;", "setSedentaryRemind", "Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/HMMeasureRemind;", "setMeasureECGRemind", "Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/ScreenLockConfig;", "setLockScreenConfig", "", "Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/MotorParam;", "params", "setMotorParams", "", "time", "setNBEndTime", "enableContinueSpo2Monitor", "enableFallDownRemind", "uploadSuccess", "syncFallDownEventUpload", "auth", "setUpEcgUserAuth", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HealthDeviceCmdHandler extends BleDeviceController {

    @NotNull
    private static final String d = "RemindController";

    public HealthDeviceCmdHandler(@NotNull GattPeripheral gattPeripheral) {
        super(gattPeripheral, HMBaseProfile.UUID_SERVICE_MILI_SERVICE, IMiLiProProfile.UUID_CHARACTERISTIC_CONTROL_POINT);
    }

    private final RemindCommand a(DeviceInfo deviceInfo) {
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        if (HMDeviceFeature.hasFeatureJHS(deviceSource)) {
            return ProfileUtils.isValidFirmware(deviceInfo, "V1.0.7.86") ? RemindCommand.DrinkWaterV2.INSTANCE : RemindCommand.DrinkWaterV1.INSTANCE;
        }
        return deviceSource == HMDeviceSource.MILI_QINLING_S2 ? RemindCommand.DrinkWaterV1.INSTANCE : RemindCommand.DrinkWater.INSTANCE;
    }

    private final RemindCommand b(DeviceInfo deviceInfo) {
        if (HMDeviceFeature.hasFeatureJHS(deviceInfo.getDeviceSource())) {
            return ProfileUtils.isValidFirmware(deviceInfo, "V1.0.7.86") ? RemindCommand.EcgMeasureRemindV2.INSTANCE : RemindCommand.EcgMeasureRemindV1.INSTANCE;
        }
        return RemindCommand.EcgMeasureRemind.INSTANCE;
    }

    public final boolean enableContinueSpo2Monitor(boolean enable) {
        DataBuilder dataBuilder = new DataBuilder();
        DataBuilder.addByte$default(dataBuilder, enable ? (byte) 1 : (byte) 0, 0, 2, null);
        HealthECFExtendCommand.EnableSpoMonitor enableSpoMonitor = HealthECFExtendCommand.EnableSpoMonitor.INSTANCE;
        boolean zSendECFCommand = sendECFCommand(enableSpoMonitor, dataBuilder);
        Debug.fi(d, "enable continue Spo2 monitor cmd code = " + enableSpoMonitor + "; and data = " + dataBuilder + "; result = " + zSendECFCommand);
        return zSendECFCommand;
    }

    public final boolean enableFallDownRemind(boolean enable) {
        HealthECFExtendCommand.FallDownRemind fallDownRemind = HealthECFExtendCommand.FallDownRemind.INSTANCE;
        boolean zSendECFCommand = sendECFCommand(fallDownRemind, new byte[]{enable ? (byte) 1 : (byte) 0});
        Debug.fi(d, "enableFallDownRemind cmd code = " + fallDownRemind + "; and enable = " + enable + "; result = " + zSendECFCommand);
        return zSendECFCommand;
    }

    public final boolean enableRemind(@NotNull RemindType type, boolean enable) {
        DataBuilder dataBuilderAddOperation = DataBuilder.addByte$default(new DataBuilder(), (byte) 0, 0, 2, null).addOperation(enable ? RemindOperation.Enable.INSTANCE : RemindOperation.Disable.INSTANCE).addOperation(RemindOperation.OnOff.INSTANCE).addBytes(0, 0, 0, 0, 0, 0).addOperation(type);
        RemindCommand.Reminder reminder = RemindCommand.Reminder.INSTANCE;
        boolean zSendCommandNoResponse = sendCommandNoResponse(reminder, dataBuilderAddOperation);
        Debug.fi(d, "enableRemind cmd code = " + reminder + " and data = " + dataBuilderAddOperation + " result = " + zSendCommandNoResponse);
        return zSendCommandNoResponse;
    }

    public final boolean setDrinkWaterRemind(@NotNull DeviceInfo deviceInfo, @NotNull DrinkWaterConfig config) {
        SimpleTime invalidTime;
        if (deviceInfo.getDeviceSource() == HMDeviceSource.MILI_QINLING_S2 && !ProfileUtils.isValidFirmware(deviceInfo, "V1.0.0.62")) {
            return false;
        }
        RemindCommand remindCommandA = a(deviceInfo);
        SimpleTime startTime = config.getStartTime();
        byte hour = startTime == null ? (byte) 0 : startTime.getHour();
        SimpleTime startTime2 = config.getStartTime();
        byte minute = startTime2 == null ? (byte) 0 : startTime2.getMinute();
        SimpleTime stopTime = config.getStopTime();
        byte hour2 = stopTime == null ? (byte) 0 : stopTime.getHour();
        SimpleTime stopTime2 = config.getStopTime();
        DataBuilder dataBuilderAddInt$default = DataBuilder.addInt$default(DataBuilder.addByte$default(new DataBuilder(), config.getEnable() ? (byte) 1 : (byte) 0, 0, 2, null).addBytes(hour, minute).addBytes(hour2, stopTime2 == null ? (byte) 0 : stopTime2.getMinute()), config.getInterval(), 0, 2, null);
        if ((remindCommandA instanceof RemindCommand.DrinkWater) && (invalidTime = config.getInvalidTime()) != null) {
            DataBuilder.addInt$default(dataBuilderAddInt$default, invalidTime.getYear(), 0, 2, null).addBytes(invalidTime.getMonth(), invalidTime.getDay(), invalidTime.getHour(), invalidTime.getMinute());
        }
        boolean zSendCommandNoResponse = sendCommandNoResponse(remindCommandA, dataBuilderAddInt$default);
        Debug.fi(d, "enableDrinkWaterRemind cmd code = " + remindCommandA + " and data = " + dataBuilderAddInt$default + " result = " + zSendCommandNoResponse);
        return zSendCommandNoResponse;
    }

    public final boolean setHRRemind(boolean enable) {
        DataBuilder dataBuilder = new DataBuilder();
        DataBuilder.addByte$default(DataBuilder.addByte$default(dataBuilder, (byte) 0, 0, 2, null), enable ? (byte) 1 : (byte) 0, 0, 2, null).addBytes(16, 0, 0, 0, 0, 0, 0, 0);
        RemindCommand.Reminder reminder = RemindCommand.Reminder.INSTANCE;
        boolean zSendCommandNoResponse = sendCommandNoResponse(reminder, dataBuilder);
        Debug.fi(d, "enableHRRemind cmd = " + reminder + " data = " + dataBuilder + " result = " + zSendCommandNoResponse);
        return zSendCommandNoResponse;
    }

    public final boolean setLockScreenConfig(@NotNull ScreenLockConfig config) {
        DataBuilder dataBuilder = new DataBuilder();
        if (config.getAllDayLock()) {
            dataBuilder.addBytes(0, 0, 0, 0);
        } else {
            dataBuilder.addBytes(1, (byte) config.getStartM(), (byte) config.getStopH(), (byte) config.getStopM());
        }
        DataBuilder.addByte$default(dataBuilder, config.getEnable() ? (byte) 1 : (byte) 0, 0, 2, null);
        return sendECFCommand(HealthECFCommand.LockScreenConfig.INSTANCE, dataBuilder);
    }

    public final boolean setMeasureECGRemind(@NotNull DeviceInfo deviceInfo, @NotNull HMMeasureRemind config) {
        DataBuilder dataBuilder = new DataBuilder();
        dataBuilder.addBytes(config.getStartH1(), config.getStartM1(), config.getStartH2(), config.getStartM2(), config.getStatus());
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        if (deviceSource == HMDeviceSource.MILI_QINLING_1S || deviceSource == HMDeviceSource.MILI_QINLING) {
            SimpleTime invalidTime = config.getInvalidTime();
            int year = invalidTime == null ? 0 : invalidTime.getYear();
            SimpleTime invalidTime2 = config.getInvalidTime();
            byte month = invalidTime2 == null ? (byte) 0 : invalidTime2.getMonth();
            SimpleTime invalidTime3 = config.getInvalidTime();
            byte day = invalidTime3 == null ? (byte) 0 : invalidTime3.getDay();
            SimpleTime invalidTime4 = config.getInvalidTime();
            byte hour = invalidTime4 == null ? (byte) 0 : invalidTime4.getHour();
            SimpleTime invalidTime5 = config.getInvalidTime();
            DataBuilder.addInt$default(dataBuilder, year, 0, 2, null).addBytes(month, day, hour, invalidTime5 == null ? (byte) 0 : invalidTime5.getMinute());
        }
        RemindCommand remindCommandB = b(deviceInfo);
        boolean zSendECFCommand = sendECFCommand(remindCommandB, dataBuilder);
        Debug.fi(d, "setMeasureECGRemind cmd code = " + remindCommandB + " and data = " + dataBuilder + " result = " + zSendECFCommand);
        return zSendECFCommand;
    }

    public final boolean setMotorParams(@NotNull List<MotorParam> params) {
        DataBuilder dataBuilder = new DataBuilder();
        boolean z = false;
        if (!(params instanceof Collection) || !params.isEmpty()) {
            for (MotorParam motorParam : params) {
                dataBuilder.reset();
                DataBuilder.addInt$default(DataBuilder.addInt$default(DataBuilder.addInt$default(dataBuilder.addBytes(motorParam.getVibrationMode(), motorParam.getCount(), motorParam.getTotalCount()), motorParam.getActiveInterval(), 0, 2, null), motorParam.getInactiveInterval(), 0, 2, null), motorParam.getDelay(), 0, 2, null).addInt(motorParam.getGenericFlag(), 4).addInt(motorParam.getRemindTypeFlag(), 4);
                HealthECFCommand.SetMotorConfig setMotorConfig = HealthECFCommand.SetMotorConfig.INSTANCE;
                boolean zSendECFCommand = sendECFCommand(setMotorConfig, dataBuilder);
                Debug.fi(d, "setMotorParams cmd code = " + setMotorConfig + " and data = " + dataBuilder + " result = " + zSendECFCommand);
                if (!zSendECFCommand) {
                    z = true;
                    break;
                }
            }
        }
        return !z;
    }

    public final boolean setNBEndTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        byte[] bArrBytesOfTime = ProfileUtils.bytesOfTime(calendar);
        HealthECFExtendCommand.SetNbEndTime setNbEndTime = HealthECFExtendCommand.SetNbEndTime.INSTANCE;
        boolean zSendECFCommand = sendECFCommand(setNbEndTime, bArrBytesOfTime);
        Debug.fi(d, "setNBEndTime cmd code = " + setNbEndTime + " and data = " + ((Object) GattUtils.bytesToHexString(bArrBytesOfTime)) + " result = " + zSendECFCommand);
        return zSendECFCommand;
    }

    public final boolean setRemind(@NotNull DeviceInfo deviceInfo, @NotNull CommonRemindConfig config) {
        config.adjustConfig(deviceInfo);
        SimpleTime startTime = config.getStartTime();
        int year = startTime == null ? 0 : startTime.getYear();
        SimpleTime startTime2 = config.getStartTime();
        byte month = startTime2 == null ? (byte) 0 : startTime2.getMonth();
        SimpleTime startTime3 = config.getStartTime();
        byte day = startTime3 == null ? (byte) 0 : startTime3.getDay();
        SimpleTime startTime4 = config.getStartTime();
        byte hour = startTime4 == null ? (byte) 0 : startTime4.getHour();
        SimpleTime startTime5 = config.getStartTime();
        DataBuilder dataBuilderAddOperation = DataBuilder.addInt$default(DataBuilder.addByte$default(new DataBuilder(), config.getIndex(), 0, 2, null).addOperation(config.getEnable() ? RemindOperation.Enable.INSTANCE.add(RemindOperation.EnableMonday.INSTANCE).add(RemindOperation.EnableTuesday.INSTANCE).add(RemindOperation.EnableWednesday.INSTANCE).add(RemindOperation.EnableThursday.INSTANCE).add(RemindOperation.EnableFriday.INSTANCE).add(RemindOperation.EnableSaturday.INSTANCE) : RemindOperation.Disable.INSTANCE).addOperation(config.getEnable() ? RemindOperation.EnableSunday.INSTANCE : RemindOperation.Disable.INSTANCE), year, 0, 2, null).addBytes(month, day, hour, startTime5 == null ? (byte) 0 : startTime5.getMinute()).addOperation(config.getType());
        if (config.getSupportInvalidTime()) {
            SimpleTime invalidTime = config.getInvalidTime();
            int year2 = invalidTime == null ? 0 : invalidTime.getYear();
            SimpleTime invalidTime2 = config.getInvalidTime();
            byte month2 = invalidTime2 == null ? (byte) 0 : invalidTime2.getMonth();
            SimpleTime invalidTime3 = config.getInvalidTime();
            byte day2 = invalidTime3 == null ? (byte) 0 : invalidTime3.getDay();
            SimpleTime invalidTime4 = config.getInvalidTime();
            byte hour2 = invalidTime4 == null ? (byte) 0 : invalidTime4.getHour();
            SimpleTime invalidTime5 = config.getInvalidTime();
            DataBuilder.addInt$default(dataBuilderAddOperation, year2, 0, 2, null).addBytes(month2, day2, hour2, invalidTime5 == null ? (byte) 0 : invalidTime5.getMinute());
        }
        RemindCommand.Reminder reminder = RemindCommand.Reminder.INSTANCE;
        boolean zSendCommandNoResponse = sendCommandNoResponse(reminder, dataBuilderAddOperation);
        Debug.fi(d, "setRemind cmd code = " + reminder + " and data = " + dataBuilderAddOperation + " result = " + zSendCommandNoResponse);
        return zSendCommandNoResponse;
    }

    public final boolean setSedentaryRemind(@NotNull HMSedentaryConfig config) {
        SimpleTime invalidTime = config.getInvalidTime();
        int year = invalidTime == null ? 0 : invalidTime.getYear();
        SimpleTime invalidTime2 = config.getInvalidTime();
        byte month = invalidTime2 == null ? (byte) 0 : invalidTime2.getMonth();
        SimpleTime invalidTime3 = config.getInvalidTime();
        byte day = invalidTime3 == null ? (byte) 0 : invalidTime3.getDay();
        SimpleTime invalidTime4 = config.getInvalidTime();
        byte hour = invalidTime4 == null ? (byte) 0 : invalidTime4.getHour();
        SimpleTime invalidTime5 = config.getInvalidTime();
        DataBuilder dataBuilderAddBytes = DataBuilder.addInt$default(DataBuilder.addInt$default(new DataBuilder().addOperation(config.isEnable() ? RemindOperation.Enable.INSTANCE : RemindOperation.Disable.INSTANCE), config.getInterval(), 0, 2, null).addBytes(config.getStartHour(), config.getStartMinutes()).addBytes(config.getStopHour(), config.getStopMinutes()).addBytes(config.getStartHour2(), config.getStartMinutes2()).addBytes(config.getStopHour2(), config.getStopMinutes2()), year, 0, 2, null).addBytes(month, day, hour, invalidTime5 == null ? (byte) 0 : invalidTime5.getMinute());
        RemindCommand.SedentaryRemind sedentaryRemind = RemindCommand.SedentaryRemind.INSTANCE;
        boolean zSendECFCommand = sendECFCommand(sedentaryRemind, dataBuilderAddBytes);
        Debug.fi(d, "setSedentaryRemind cmd code = " + sedentaryRemind + " and data = " + dataBuilderAddBytes + " result = " + zSendECFCommand);
        return zSendECFCommand;
    }

    public final boolean setUpEcgUserAuth(boolean auth) {
        boolean zSendECFCommand = sendECFCommand(HealthECFExtendCommand.AuthEcg.INSTANCE, new byte[]{auth ? (byte) 1 : (byte) 0});
        Debug.fi(d, "setUpEcgUserAuth auth: " + auth + " and result: " + zSendECFCommand);
        return zSendECFCommand;
    }

    public final boolean syncFallDownEventUpload(boolean uploadSuccess) {
        HealthECFExtendCommand.FallDownEventUpload fallDownEventUpload = HealthECFExtendCommand.FallDownEventUpload.INSTANCE;
        boolean zSendECFCommand = sendECFCommand(fallDownEventUpload, new byte[]{uploadSuccess ? (byte) 1 : (byte) 0});
        Debug.fi(d, "syncFallDownEventUpload cmd code = " + fallDownEventUpload + "; and enable = " + uploadSuccess + "; result = " + zSendECFCommand);
        return zSendECFCommand;
    }
}
