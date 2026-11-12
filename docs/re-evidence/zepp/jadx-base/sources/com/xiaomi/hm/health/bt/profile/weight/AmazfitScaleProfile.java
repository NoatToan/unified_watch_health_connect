package com.xiaomi.hm.health.bt.profile.weight;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.huami.nfc.applet.ConstantKt;
import com.unionpay.tsmservice.data.ResultCode;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.IBaseProfile;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weight/AmazfitScaleProfile;", "Lcom/xiaomi/hm/health/bt/profile/weight/WeightBaseProfile;", "", "initCharacteristics", "Ljava/util/UUID;", "getSyncServiceUUID", "needWaiteBeforeDiscoveryService", "needWaiteBeforeInit", "getSyncCharacteristicUUID", "Lcom/xiaomi/hm/health/bt/profile/weight/IWeightRecordParser;", "getRecordParser", "", "getIdLen", "", "getWifiFirmwareRevision", "Landroid/content/Context;", "ctx", "Landroid/bluetooth/BluetoothDevice;", "device", "Lcom/xiaomi/hm/health/bt/gatt/IGattCallback$IConnectionStateChangeCallback;", "callback", "<init>", "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Lcom/xiaomi/hm/health/bt/gatt/IGattCallback$IConnectionStateChangeCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AmazfitScaleProfile extends WeightBaseProfile {
    private static final UUID A0;
    private static final UUID B0;

    @NotNull
    private static final UUID C0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final UUID w0;
    private static final UUID x0;
    private static final UUID y0;
    private static final UUID z0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R!\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R!\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R!\u0010\n\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R!\u0010\f\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R!\u0010\u000e\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007R!\u0010\u0010\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weight/AmazfitScaleProfile$Companion;", "", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "HISTORY_UUID", "Ljava/util/UUID;", "getHISTORY_UUID", "()Ljava/util/UUID;", "COMPOSITION_SERVICE", "getCOMPOSITION_SERVICE", "SYNC_CHARACTERISTIC_UUID", "getSYNC_CHARACTERISTIC_UUID", "UUID_CHARACTERISTIC_DATE_TIME", "getUUID_CHARACTERISTIC_DATE_TIME", "UUID_BODY_COMPOSITION_FEATURE", "getUUID_BODY_COMPOSITION_FEATURE", "MEASUREMENT_UUID", "getMEASUREMENT_UUID", "UUID_CHARACTERISTIC_FIRMWARE_REVISION", "getUUID_CHARACTERISTIC_FIRMWARE_REVISION", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UUID getCOMPOSITION_SERVICE() {
            return AmazfitScaleProfile.x0;
        }

        public final UUID getHISTORY_UUID() {
            return AmazfitScaleProfile.w0;
        }

        public final UUID getMEASUREMENT_UUID() {
            return AmazfitScaleProfile.B0;
        }

        public final UUID getSYNC_CHARACTERISTIC_UUID() {
            return AmazfitScaleProfile.y0;
        }

        public final UUID getUUID_BODY_COMPOSITION_FEATURE() {
            return AmazfitScaleProfile.A0;
        }

        public final UUID getUUID_CHARACTERISTIC_DATE_TIME() {
            return AmazfitScaleProfile.z0;
        }

        @NotNull
        public final UUID getUUID_CHARACTERISTIC_FIRMWARE_REVISION() {
            return AmazfitScaleProfile.C0;
        }
    }

    static {
        UUID uuidUuid16 = GattUtils.uuid16("FEE0");
        w0 = uuidUuid16;
        x0 = uuidUuid16;
        y0 = GattUtils.uuid128(24);
        z0 = GattUtils.uuid16(ResultCode.ERROR_DETAIL_FORCE_UPDATE);
        A0 = GattUtils.uuid16(ConstantKt.APP_CODE_GUANG_ZHOU);
        B0 = GattUtils.uuid16("0021");
        C0 = GattUtils.uuid16("2A26");
    }

    public AmazfitScaleProfile(@NotNull Context context, @NotNull BluetoothDevice bluetoothDevice, @NotNull IGattCallback.IConnectionStateChangeCallback iConnectionStateChangeCallback) {
        super(context, bluetoothDevice, iConnectionStateChangeCallback);
    }

    @Override // com.xiaomi.hm.health.bt.profile.weight.WeightBaseProfile, com.xiaomi.hm.health.bt.profile.weight.IWeightRecordSync
    public int getIdLen() {
        return 6;
    }

    @Override // com.xiaomi.hm.health.bt.profile.weight.WeightBaseProfile, com.xiaomi.hm.health.bt.profile.weight.IWeightRecordSync
    @NotNull
    public IWeightRecordParser getRecordParser() {
        HMDeviceSource deviceSource;
        DeviceInfo deviceInfo = getDeviceInfo();
        Integer numValueOf = (deviceInfo == null || (deviceSource = deviceInfo.getDeviceSource()) == null) ? null : Integer.valueOf(deviceSource.getValue());
        return new AmazfitScaleRecordParser(numValueOf == null ? HMDeviceSource.VDEVICE.getValue() : numValueOf.intValue(), null, 2, null);
    }

    @Override // com.xiaomi.hm.health.bt.profile.weight.WeightBaseProfile, com.xiaomi.hm.health.bt.profile.weight.IWeightRecordSync
    @NotNull
    public UUID getSyncCharacteristicUUID() {
        return y0;
    }

    @Override // com.xiaomi.hm.health.bt.profile.weight.WeightBaseProfile, com.xiaomi.hm.health.bt.profile.weight.IWeightRecordSync
    @NotNull
    public UUID getSyncServiceUUID() {
        return w0;
    }

    @NotNull
    public final String getWifiFirmwareRevision() {
        try {
            byte[] bArrFilterZero = filterZero(read(getService(IBaseProfile.UUID_SERVICE_DEVICE_SERVICE).getCharacteristic(C0)));
            Debug.fi(BaseProfile.TAG, Intrinsics.stringPlus("firmRevision:", GattUtils.bytesToHexString(bArrFilterZero)));
            if (bArrFilterZero == null) {
                return "";
            }
            if (!(bArrFilterZero.length == 0)) {
                return new Regex("^[vV]").replace(new String(bArrFilterZero, StandardCharsets.UTF_8), "");
            }
            return "";
        } catch (Exception e) {
            Debug.fi(BaseProfile.TAG, Intrinsics.stringPlus("read wifi firmware version failed:", e));
            return "";
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.weight.WeightBaseProfile, com.xiaomi.hm.health.bt.profile.base.BaseProfile, com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean initCharacteristics() {
        super.initCharacteristics();
        BluetoothGattService service = getService(x0);
        if (service == null) {
            return false;
        }
        UUID uuid = z0;
        this.m0 = service.getCharacteristic(uuid);
        return uuid != null;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean needWaiteBeforeDiscoveryService() {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean needWaiteBeforeInit() {
        return false;
    }
}
