package com.xiaomi.hm.health.bt.profile.feature;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.huami.bluetooth.profile.channel.module.device_feature.DeviceFeatureModule;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.IBaseProfile;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericCommand;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericProfile;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericResponse;
import java.util.BitSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public class HMFeatureProfile extends HMBaseProfile {
    private static final UUID b = GattUtils.uuid128(20);

    public HMFeatureProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
    }

    public static Feature fromByteArray(byte[] featureBytes) {
        int i;
        Feature feature = new Feature();
        feature.setAllDatas(featureBytes);
        int i2 = featureBytes[0];
        int i3 = featureBytes[1];
        feature.setVersion(i2);
        feature.setGroup(i3);
        if ((i3 & 1) != 0) {
            int i4 = featureBytes[2];
            byte[] bArr = new byte[i4];
            System.arraycopy(featureBytes, 3, bArr, 0, i4);
            i = 3 + i4;
            feature.a(1, BitSet.valueOf(bArr));
        } else {
            i = 2;
        }
        if ((i3 & 2) != 0) {
            int i5 = i + 1;
            int i6 = featureBytes[i];
            byte[] bArr2 = new byte[i6];
            System.arraycopy(featureBytes, i5, bArr2, 0, i6);
            i = i6 + i5;
            feature.a(2, BitSet.valueOf(bArr2));
        }
        if ((i3 & 4) != 0) {
            int i7 = i + 1;
            int i8 = featureBytes[i];
            byte[] bArr3 = new byte[i8];
            System.arraycopy(featureBytes, i7, bArr3, 0, i8);
            i = i8 + i7;
            feature.a(4, BitSet.valueOf(bArr3));
        }
        if ((i3 & 8) != 0) {
            int i9 = i + 1;
            int i10 = featureBytes[i] / 2;
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i9 + 1;
                feature.add(i11, (featureBytes[i9] & 255) | ((featureBytes[i12] & 255) << 8));
                i11++;
                i9 = i12 + 1;
            }
            i = i9;
        }
        if ((i3 & 16) != 0) {
            int i13 = i + 1;
            int i14 = featureBytes[i];
            byte[] bArr4 = new byte[i14];
            System.arraycopy(featureBytes, i13, bArr4, 0, i14);
            feature.a(16, BitSet.valueOf(bArr4));
        }
        return feature;
    }

    public static Feature getFeature(BaseProfile baseProfile) {
        if (!baseProfile.supportModule(DeviceFeatureModule.class)) {
            return getFeature((GattPeripheral) baseProfile);
        }
        DeviceFeatureModule deviceFeatureModule = (DeviceFeatureModule) baseProfile.getChannelModule(DeviceFeatureModule.class);
        if (deviceFeatureModule != null) {
            return deviceFeatureModule.getFeature();
        }
        return null;
    }

    public static BluetoothGattCharacteristic getFeatureCharacteristic(GattPeripheral gattPeripheral) {
        if (gattPeripheral == null) {
            Debug.fi(HMBaseProfile.TAG, "gattPeripheral is null!!!");
            return null;
        }
        UUID uuid = IBaseProfile.UUID_SERVICE_DEVICE_SERVICE;
        BluetoothGattService service = gattPeripheral.getService(uuid);
        if (service == null) {
            Debug.fi(HMBaseProfile.TAG, uuid + " is null!!!");
            return null;
        }
        UUID uuid2 = b;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        if (characteristic == null) {
            Debug.fi(HMBaseProfile.TAG, uuid2 + " is null!!!");
        }
        return characteristic;
    }

    public static boolean isSupport(BaseProfile baseProfile) {
        return baseProfile.supportModule(DeviceFeatureModule.class) || isSupport((GattPeripheral) baseProfile);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        return true;
    }

    public static boolean isSupport(GattPeripheral gattPeripheral) {
        return getFeatureCharacteristic(gattPeripheral) != null;
    }

    public static Feature getFeature(GattPeripheral gattPeripheral) {
        BluetoothGattCharacteristic featureCharacteristic = getFeatureCharacteristic(gattPeripheral);
        if (featureCharacteristic == null) {
            Debug.fi(HMBaseProfile.TAG, "device feature characteristic is null!!!");
            return null;
        }
        HMGenericResponse hMGenericResponseWrite = HMGenericProfile.write(gattPeripheral, featureCharacteristic, new HMGenericCommand(15));
        if (hMGenericResponseWrite != null && hMGenericResponseWrite.isCommandSuccess()) {
            byte[] bArrCommandResponseData = hMGenericResponseWrite.commandResponseData();
            Debug.i(HMBaseProfile.TAG, "featureBytes:" + GattUtils.bytesToHexString(bArrCommandResponseData));
            if (bArrCommandResponseData != null && bArrCommandResponseData.length >= 2) {
                return fromByteArray(bArrCommandResponseData);
            }
            Debug.fi(HMBaseProfile.TAG, "wrong data of device feature response!!!");
            return null;
        }
        Debug.fi(HMBaseProfile.TAG, "get device feature command failed!!!");
        return null;
    }
}
