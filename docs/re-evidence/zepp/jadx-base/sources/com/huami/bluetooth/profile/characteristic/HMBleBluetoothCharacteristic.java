package com.huami.bluetooth.profile.characteristic;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xmlywind.sdk.common.mta.PointCategory;
import defpackage.to2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001#B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB!\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u001e¢\u0006\u0004\b\u001c\u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u00168F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/huami/bluetooth/profile/characteristic/HMBleBluetoothCharacteristic;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseProfile;", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "", PointCategory.INIT, "deInit", "Lcom/huami/bluetooth/profile/characteristic/DataCallback;", "callback", "registerNotification", "unregisterNotification", "", "data", "", "timeout", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "sendCommandWithResponse", "sendCommandNoResponse", "read", "Lcom/huami/bluetooth/profile/characteristic/HMGattCharacteristic;", "b", "Lcom/huami/bluetooth/profile/characteristic/HMGattCharacteristic;", "char", "Landroid/bluetooth/BluetoothGattCharacteristic;", "getCharacteristic", "()Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/huami/bluetooth/profile/characteristic/HMGattCharacteristic;Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;)V", "Ljava/util/UUID;", "serviceUuid", "charUuid", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/UUID;Ljava/util/UUID;)V", "c", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMBleBluetoothCharacteristic extends HMBaseProfile implements BluetoothCharacteristic {

    @NotNull
    private static final Companion c = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HMGattCharacteristic char;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/bluetooth/profile/characteristic/HMBleBluetoothCharacteristic$Companion;", "", "<init>", "()V", Characteristic.TAG, "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0018B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/characteristic/HMBleBluetoothCharacteristic$Companion$Characteristic;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseProfile;", "Lcom/huami/bluetooth/profile/characteristic/HMGattCharacteristic;", "", PointCategory.INIT, "deInit", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "serviceUuid", "c", "charUuid", "Landroid/bluetooth/BluetoothGattCharacteristic;", GoogleApiAvailabilityLight.a, "Landroid/bluetooth/BluetoothGattCharacteristic;", "_characteristic", "getCharacteristic", "()Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/UUID;Ljava/util/UUID;)V", "e", "a", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Characteristic extends HMBaseProfile implements HMGattCharacteristic {

            @Deprecated
            @NotNull
            public static final String TAG = "Characteristic";

            @NotNull
            private static final a e = new a(null);

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private final UUID serviceUuid;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            private final UUID charUuid;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @Nullable
            private BluetoothGattCharacteristic _characteristic;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/bluetooth/profile/characteristic/HMBleBluetoothCharacteristic$Companion$Characteristic$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
            public static final class a {
                private a() {
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public Characteristic(@NotNull GattPeripheral gattPeripheral, @NotNull UUID uuid, @NotNull UUID uuid2) {
                super(gattPeripheral);
                this.serviceUuid = uuid;
                this.charUuid = uuid2;
            }

            @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
            public boolean deInit() {
                Debug.fi(TAG, "De-init " + this.serviceUuid + " characteristic " + this.charUuid + ": " + this._characteristic);
                this._characteristic = null;
                return true;
            }

            @Override // com.huami.bluetooth.profile.characteristic.HMGattCharacteristic
            @Nullable
            /* JADX INFO: renamed from: getCharacteristic, reason: from getter */
            public BluetoothGattCharacteristic get_characteristic() {
                return this._characteristic;
            }

            @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
            public boolean init() {
                BluetoothGattService service = getService(this.serviceUuid);
                this._characteristic = service == null ? null : service.getCharacteristic(this.charUuid);
                Debug.fi(TAG, "Init " + this.serviceUuid + " characteristic " + this.charUuid + ": " + this._characteristic);
                return get_characteristic() != null;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HMBleBluetoothCharacteristic(@NotNull HMGattCharacteristic hMGattCharacteristic, @NotNull GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.char = hMGattCharacteristic;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        return this.char.deInit();
    }

    @Nullable
    public final BluetoothGattCharacteristic getCharacteristic() {
        return this.char.get_characteristic();
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        return this.char.init();
    }

    @Override // com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    @Nullable
    public byte[] read() {
        return BluetoothCharacteristic.DefaultImpls.read(this);
    }

    @Override // com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean registerNotification(@NotNull DataCallback callback) {
        BluetoothGattCharacteristic characteristic = getCharacteristic();
        if (characteristic == null) {
            return false;
        }
        return registerNotification(characteristic, new to2(callback));
    }

    @Override // com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean sendCommandNoResponse(@NotNull byte[] data) {
        BluetoothGattCharacteristic characteristic = getCharacteristic();
        if (characteristic == null) {
            return false;
        }
        return sendCommandWithNoResponse(characteristic, data);
    }

    @Override // com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    @Nullable
    public HMNotifyResponse sendCommandWithResponse(@NotNull byte[] bArr) {
        return BluetoothCharacteristic.DefaultImpls.sendCommandWithResponse(this, bArr);
    }

    @Override // com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean unregisterNotification() {
        BluetoothGattCharacteristic characteristic = getCharacteristic();
        if (characteristic == null) {
            return true;
        }
        return unregisterNotification(characteristic);
    }

    @Override // com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    @Nullable
    public byte[] read(int timeout) {
        BluetoothGattCharacteristic characteristic = getCharacteristic();
        if (characteristic == null) {
            return null;
        }
        return read(characteristic);
    }

    @Override // com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    @Nullable
    public HMNotifyResponse sendCommandWithResponse(@NotNull byte[] data, int timeout) {
        BluetoothGattCharacteristic characteristic = getCharacteristic();
        if (characteristic == null) {
            return null;
        }
        return sendCommandWithResponse(characteristic, data, timeout);
    }

    public HMBleBluetoothCharacteristic(@NotNull GattPeripheral gattPeripheral, @NotNull UUID uuid, @NotNull UUID uuid2) {
        this(new Companion.Characteristic(gattPeripheral, uuid, uuid2), gattPeripheral);
    }
}
