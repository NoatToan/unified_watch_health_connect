package com.xiaomi.hm.health.bt.profile.user;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.usernew.IUserInfoProfile;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
public class HMUserProfile extends HMBaseProfile implements IUserInfoProfile {
    private static final int c = 300;
    private static final int d = 30;
    private UUID b;

    public HMUserProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.b = GattUtils.uuid128(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(AtomicReference atomicReference, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.i(HMBaseProfile.TAG, "user info:" + GattUtils.bytesToHexString(bArr));
        atomicReference.getAndSet(d(bArr));
        countDownLatch.countDown();
    }

    private UserInfoExt d(byte[] value) {
        if (value == null || value.length < 1) {
            return null;
        }
        UserInfoExt userInfoExt = new UserInfoExt();
        byte b = value[0];
        byte b2 = value[1];
        int i = 3;
        byte b3 = value[2];
        if ((UserInfoFlag.BIRTH.getValue() & b) != 0) {
            userInfoExt.setBirthDate(new BirthDateExt((short) ((value[3] & 255) | ((value[4] & 255) << 8)), value[5], value[6]));
            i = 7;
        }
        if ((UserInfoFlag.GENDER.getValue() & b) != 0) {
            userInfoExt.setGender(GenderExt.fromValue(value[i]));
            i++;
        }
        if ((UserInfoFlag.HEIGHT.getValue() & b) != 0) {
            int i2 = i + 1;
            userInfoExt.setHeight((short) ((value[i] & 255) | ((value[i2] & 255) << 8)));
            i = i2 + 1;
        }
        if ((UserInfoFlag.WEIGHT.getValue() & b) != 0) {
            int i3 = i + 1;
            userInfoExt.setWeight((short) (((value[i] & 255) | ((value[i3] & 255) << 8)) / 200));
            i = i3 + 1;
        }
        if ((UserInfoFlag.GOAL.getValue() & b) != 0) {
            int i4 = i + 1;
            int i5 = i4 + 1;
            int i6 = (value[i] & 255) | ((value[i4] & 255) << 8);
            int i7 = i5 + 1;
            userInfoExt.setGoal(i6 | ((value[i5] & 255) << 16) | ((value[i7] & 255) << 24));
            i = i7 + 1;
        }
        if ((b & UserInfoFlag.UID.getValue()) != 0) {
            int i8 = i + 1;
            int i9 = i8 + 1;
            userInfoExt.setUid(((value[i9 + 1] & 255) << 24) | (value[i] & 255) | ((value[i8] & 255) << 8) | ((value[i9] & 255) << 16));
        }
        return userInfoExt;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.usernew.IUserInfoProfile
    public UserInfoExt getUserInfo(@Nullable HMDeviceSource source) {
        BluetoothGattCharacteristic userinfoCharacteristic = getUserinfoCharacteristic();
        if (userinfoCharacteristic == null) {
            return null;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference();
        if (!registerNotification(userinfoCharacteristic, new IGattCallback.INotifyCallback() { // from class: jo3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.c(atomicReference, countDownLatch, bArr);
            }
        })) {
            Debug.fi(HMBaseProfile.TAG, "registerNotification user info failed!!!");
            return null;
        }
        byte[] bArr = {UserInfoFlag.BASE.getValue(), UserInfoFlag.READ.getValue(), 0};
        Debug.i(HMBaseProfile.TAG, "get user info cmd:" + GattUtils.bytesToHexString(bArr));
        if (write(userinfoCharacteristic, bArr)) {
            try {
                countDownLatch.await(15000L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
            unregisterNotification(userinfoCharacteristic);
            return (UserInfoExt) atomicReference.get();
        }
        unregisterNotification(userinfoCharacteristic);
        Debug.fi(HMBaseProfile.TAG, "write user info failed!!!");
        return null;
    }

    public BluetoothGattCharacteristic getUserinfoCharacteristic() {
        UUID uuid = HMBaseProfile.UUID_SERVICE_MILI_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            Debug.fi(HMBaseProfile.TAG, uuid + " is null!");
            return null;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.b);
        if (characteristic != null) {
            return characteristic;
        }
        Debug.fi(HMBaseProfile.TAG, this.b + " is null!");
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.usernew.IUserInfoProfile
    public boolean setGoal(int goal) {
        Debug.i(HMBaseProfile.TAG, "profile set goal: " + goal);
        BluetoothGattCharacteristic userinfoCharacteristic = getUserinfoCharacteristic();
        if (userinfoCharacteristic == null) {
            return false;
        }
        byte[] bArr = {UserInfoFlag.GOAL.getValue(), UserInfoFlag.WRITE.getValue(), 0, (byte) (goal & 255), (byte) ((goal >> 8) & 255), (byte) ((goal >> 16) & 255), (byte) ((goal >> 24) & 255)};
        Debug.i(HMBaseProfile.TAG, "cmd:" + GattUtils.bytesToHexString(bArr));
        return write(userinfoCharacteristic, bArr);
    }

    public boolean setHRRange(int high, int low) {
        BluetoothGattCharacteristic userinfoCharacteristic = getUserinfoCharacteristic();
        if (userinfoCharacteristic == null) {
            Debug.fi(HMBaseProfile.TAG, "set hr range failed");
            return false;
        }
        if (high < 30 || low < 30 || high > 300 || low > 300) {
            Debug.fi(HMBaseProfile.TAG, "set hr range failed, height = " + high + "; low = " + low);
            return false;
        }
        byte[] bArr = {-128, 1, 0, (byte) high, (byte) low};
        boolean zWrite = write(userinfoCharacteristic, bArr);
        Debug.fi(HMBaseProfile.TAG, "set hr range result = " + zWrite + "; cmd: " + GattUtils.bytesToHexString(bArr));
        return zWrite;
    }

    @Override // com.xiaomi.hm.health.bt.profile.usernew.IUserInfoProfile
    public boolean setLocation(@NotNull LocationExt location) {
        BluetoothGattCharacteristic userinfoCharacteristic = getUserinfoCharacteristic();
        if (userinfoCharacteristic == null) {
            return false;
        }
        byte[] bArr = {UserInfoFlag.LOCATION.getValue(), UserInfoFlag.WRITE.getValue(), 0, (byte) ((location.getWay().getValue() << 7) | location.getWear().getValue())};
        Debug.i(HMBaseProfile.TAG, "cmd:" + GattUtils.bytesToHexString(bArr));
        return write(userinfoCharacteristic, bArr);
    }

    @Override // com.xiaomi.hm.health.bt.profile.usernew.IUserInfoProfile
    public boolean setUserInfo(@NotNull UserInfoExt info) {
        BluetoothGattCharacteristic userinfoCharacteristic = getUserinfoCharacteristic();
        if (userinfoCharacteristic == null) {
            return false;
        }
        byte[] bArrBytesOfUserInfo = ProfileUtils.bytesOfUserInfo(info);
        Debug.i(HMBaseProfile.TAG, "cmd:" + GattUtils.bytesToHexString(bArrBytesOfUserInfo));
        return write(userinfoCharacteristic, bArrBytesOfUserInfo);
    }
}
