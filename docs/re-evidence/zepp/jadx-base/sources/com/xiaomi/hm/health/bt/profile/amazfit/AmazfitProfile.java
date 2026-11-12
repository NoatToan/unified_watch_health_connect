package com.xiaomi.hm.health.bt.profile.amazfit;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.IBaseProfile;
import com.xiaomi.hm.health.bt.profile.mili.IMiLiProfile;
import com.xiaomi.hm.health.bt.profile.mili.MiLiProfile;
import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;

/* JADX INFO: loaded from: classes10.dex */
public class AmazfitProfile extends MiLiProfile {
    public static final int INVALID_UID_CRC = 65535;
    private static final String S0 = "AmazfitProfile";

    public AmazfitProfile(Context context, BluetoothDevice device, IGattCallback.IConnectionStateChangeCallback connCB) {
        super(context, device, connCB);
    }

    private int u0(long longUid) {
        return ((int) (longUid >> 32)) | ((int) longUid);
    }

    @Override // com.xiaomi.hm.health.bt.profile.mili.MiLiProfile
    public HMStatisticInfo getStatisticInfo() {
        BluetoothGattCharacteristic characteristic;
        HMStatisticInfo hMStatisticInfo = new HMStatisticInfo();
        BluetoothGattService service = getService(IBaseProfile.UUID_SERVICE_MILI_SERVICE);
        if (service == null || (characteristic = service.getCharacteristic(IMiLiProfile.UUID_CHARACTERISTIC_STATISTICS)) == null) {
            return hMStatisticInfo;
        }
        byte[] bArr = read(characteristic);
        if (bArr == null || bArr.length < 9) {
            Debug.fi(S0, "getStatistics failed");
            return null;
        }
        hMStatisticInfo.setPercentOfLowLatency(bArr[0] & 255);
        hMStatisticInfo.setPercentOfMedLatency(bArr[1] & 255);
        hMStatisticInfo.setPercentOfHigLatency(bArr[2] & 255);
        hMStatisticInfo.setAvePowerWaste(((bArr[4] & 255) << 8) | (bArr[3] & 255));
        hMStatisticInfo.setAdcOffset(((bArr[6] & 255) << 8) | (bArr[5] & 255));
        hMStatisticInfo.setAdc(((bArr[8] & 255) << 8) | (bArr[7] & 255));
        if (bArr.length >= 11) {
            hMStatisticInfo.setExceptionOfSensor(((bArr[10] & 255) << 8) | (bArr[9] & 255));
        }
        if (bArr.length == 20) {
            hMStatisticInfo.setRebootCount(((bArr[14] & 255) << 24) | ((bArr[13] & 255) << 16) | ((bArr[12] & 255) << 8) | (bArr[11] & 255));
            hMStatisticInfo.setMcuStatus(bArr[15] & 255);
            hMStatisticInfo.setNoSleepTime((bArr[16] & 255) | ((bArr[19] & 255) << 24) | ((bArr[18] & 255) << 16) | ((bArr[17] & 255) << 8));
        }
        return hMStatisticInfo;
    }

    public int getUserId() {
        Debug.trace();
        byte[] bArr = read(this.mCharUserInfo);
        if (bArr == null || bArr.length == 0) {
            Debug.fi(S0, "getUserId return INVALID_UID_CRC");
            return 65535;
        }
        Debug.fi(S0, "getUserId hex:" + GattUtils.bytesToHexString(bArr));
        return bArr[0] & 255;
    }

    @Override // com.xiaomi.hm.health.bt.profile.mili.MiLiProfile
    public boolean setUserInfo(UserInfo info) {
        Debug.trace();
        byte[] bArr = new byte[20];
        int iU0 = u0(info.uid);
        bArr[0] = (byte) (iU0 & 255);
        bArr[1] = (byte) ((iU0 >> 8) & 255);
        bArr[2] = (byte) ((iU0 >> 16) & 255);
        bArr[3] = (byte) ((iU0 >> 24) & 255);
        bArr[4] = info.gender;
        bArr[5] = info.age;
        bArr[6] = info.height;
        bArr[7] = info.weight;
        DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            Debug.fi(S0, "getDeviceInfo return null in setUserInfo function!!!");
            return false;
        }
        Debug.fi(S0, "device info : " + deviceInfo);
        bArr[8] = info.type;
        bArr[9] = (byte) (deviceInfo.getFeature() & 255);
        bArr[10] = (byte) (deviceInfo.getAppearance() & 255);
        if (deviceInfo.isAmazfit()) {
            bArr[11] = 0;
            int userId = getUserId();
            if (userId != 65535) {
                byte[] bArr2 = new byte[4];
                System.arraycopy(bArr, 0, bArr2, 0, 4);
                int iCrc8 = GattUtils.crc8(bArr2);
                Debug.fi(S0, "deviceUidCrc:" + userId + ",newUidCrc:" + iCrc8);
                if (iCrc8 != userId) {
                    bArr[11] = 1;
                }
            }
        } else {
            byte[] bArr3 = info.alias;
            System.arraycopy(bArr3, 0, bArr, 11, bArr3.length <= 9 ? bArr3.length : 9);
        }
        byte[] bArr4 = new byte[19];
        System.arraycopy(bArr, 0, bArr4, 0, 19);
        int iCrc9 = GattUtils.crc8(bArr4);
        String address = getDevice().getAddress();
        bArr[19] = (byte) (iCrc9 ^ Integer.decode("0x" + address.substring(address.length() - 2)).intValue());
        boolean zWrite = write(this.mCharUserInfo, bArr);
        if (!zWrite) {
            Debug.fi(S0, "setUserInfo failed");
        }
        return zWrite;
    }
}
