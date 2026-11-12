package com.xiaomi.hm.health.bt.profile.auth;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.huami.identity.auth.alexa.ConstantsKt;
import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AppAuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.NewProtocolSuccess;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.ProtocolAuthError;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"NewApi"})
public class HMProAuthProfile extends HMBaseProfile implements IGattCallback.INotifyCallback {
    public static final int AUTH_API_LEVEL_LOW = 9;
    public static final int AUTH_AVOID_SPITE_BINDING_DENY = 65;
    public static final int AUTH_ENC_NOT_MATCH = 8;
    public static final int AUTH_INVALID_LEN = 6;
    public static final int AUTH_INVALID_STATE = 2;
    public static final int AUTH_KEY_NOT_FOUND = 7;
    public static final int AUTH_OPERATION_FAILED = 4;
    public static final int AUTH_SPORT_ONGOING = 5;
    public static final int AUTH_STATE_UNKNOWN = 0;
    public static final int AUTH_SUCCESS = 1;
    public static final int AUTH_UNKNOW_CMD = 3;
    public static final UUID UUID_CHARACTERISTIC_AUTH_CONTROL_POINT = GattUtils.uuid128(9);
    private static final byte n = 0;
    public static final byte o = -128;
    public static final int p = 1;
    private final byte b;
    private final byte c;
    private final byte d;
    private final byte e;
    private final byte f;
    private final byte g;
    private BluetoothGattCharacteristic h;
    private byte[] i;
    private byte j;
    private byte[] k;
    private byte l;
    private Feature m;

    public HMProAuthProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.b = (byte) 1;
        this.c = (byte) 2;
        this.d = (byte) 3;
        this.e = (byte) 4;
        this.f = (byte) 5;
        this.g = (byte) 6;
        this.h = null;
        this.i = null;
        this.j = HMBleConfig.APP_ID;
        this.k = null;
        this.l = (byte) 0;
        this.m = null;
    }

    private boolean c(String key) {
        byte[] bArrMd5 = md5("" + System.currentTimeMillis());
        if (bArrMd5 == null || bArrMd5.length != 16) {
            Debug.fi(HMBaseProfile.TAG, "wrong data from random create!!!");
            return false;
        }
        byte[] bArrMd6 = md5(key);
        if (bArrMd6 == null || bArrMd6.length != 16) {
            Debug.fi(HMBaseProfile.TAG, "wrong key!!!");
            return false;
        }
        byte[] bArrO = o(bArrMd5);
        if (bArrO == null || bArrO.length != 16) {
            Debug.fi(HMBaseProfile.TAG, "wrong chip from device!!!");
            return false;
        }
        byte[] bArrEncrypt = encrypt(bArrMd5, bArrMd6);
        if (bArrEncrypt != null && bArrEncrypt.length == 16) {
            return Arrays.equals(bArrO, bArrEncrypt) && m();
        }
        Debug.fi(HMBaseProfile.TAG, "wrong chip from local encrypt!!!");
        return false;
    }

    public static byte[] d(String macAddress, byte[] random) {
        if (!BluetoothAdapter.checkBluetoothAddress(macAddress) || random == null || random.length == 0) {
            return null;
        }
        String[] strArrSplit = macAddress.split(":");
        byte[] bArr = new byte[strArrSplit.length + random.length];
        int i = 0;
        while (i < strArrSplit.length) {
            bArr[i] = Integer.decode("0x" + strArrSplit[i]).byteValue();
            i++;
        }
        System.arraycopy(random, 0, bArr, i, random.length);
        return bArr;
    }

    private AuthResult i(byte[] chip) {
        byte[] bArr = new byte[18];
        bArr[0] = (byte) (this.l | 3);
        bArr[1] = this.j;
        System.arraycopy(chip, 0, bArr, 2, 16);
        HMNotifyResponse hMNotifyResponseJ = j(bArr);
        if (hMNotifyResponseJ == null) {
            return new AuthResult(0, AppAuthError.AUTHORIZE_FAIL);
        }
        byte code = hMNotifyResponseJ.getCode();
        return code == 1 ? new AuthResult(1, NewProtocolSuccess.INSTANCE) : new AuthResult(code, new ProtocolAuthError(code));
    }

    private HMNotifyResponse j(byte[] cmd) {
        Debug.fi(HMBaseProfile.TAG, "sendChipCommand: " + GattUtils.bytesToHexString(cmd));
        this.i = null;
        if (!write(this.h, cmd)) {
            Debug.fi(HMBaseProfile.TAG, "write cmd failed!!!");
            return null;
        }
        if (this.i == null) {
            waiting(this.h, 30000);
        }
        byte[] bArr = this.i;
        if (bArr == null || bArr.length < 3) {
            return null;
        }
        return HMNotifyResponse.parse(bArr);
    }

    private HMNotifyResponse k(byte[] cmd) {
        Debug.fi(HMBaseProfile.TAG, "sendCommand:" + GattUtils.bytesToHexString(cmd));
        this.i = null;
        if (!write(this.h, cmd)) {
            Debug.fi(HMBaseProfile.TAG, "write cmd failed!!!");
            return null;
        }
        if (this.i == null) {
            waiting(this.h, 30000);
        }
        return HMNotifyResponse.parse(this.i);
    }

    private boolean l(byte[] cmd) {
        Debug.fi(HMBaseProfile.TAG, "sendCommandWithNoResponse:" + GattUtils.bytesToHexString(cmd));
        boolean zWrite = write(this.h, cmd);
        Debug.fi(HMBaseProfile.TAG, "write cmd ret:" + zWrite);
        return zWrite;
    }

    private boolean m() {
        HMNotifyResponse hMNotifyResponseK = k(new byte[]{5});
        return hMNotifyResponseK != null && hMNotifyResponseK.isSuccess((byte) 5);
    }

    private AuthResult n(byte[] key) {
        Debug.i(HMBaseProfile.TAG, "key:" + GattUtils.bytesToHexString(key));
        if (key == null || key.length != 16) {
            return new AuthResult(0, AppAuthError.KEY_ERROR);
        }
        byte[] bArr = new byte[18];
        bArr[0] = 1;
        bArr[1] = this.j;
        System.arraycopy(key, 0, bArr, 2, 16);
        this.i = null;
        return l(bArr) ? new AuthResult(1, NewProtocolSuccess.INSTANCE) : new AuthResult(0, AppAuthError.SEND_NO_RESPONSE_KEY_FAIL);
    }

    private byte[] o(byte[] random) {
        byte[] bArr = new byte[18];
        bArr[0] = 4;
        bArr[1] = this.j;
        System.arraycopy(random, 0, bArr, 2, 16);
        HMNotifyResponse hMNotifyResponseK = k(bArr);
        if (hMNotifyResponseK == null || !hMNotifyResponseK.isSuccess((byte) 4)) {
            return null;
        }
        return hMNotifyResponseK.getData();
    }

    private boolean q(byte[] chip) {
        byte[] bArr = new byte[18];
        bArr[0] = 6;
        bArr[1] = this.j;
        System.arraycopy(chip, 0, bArr, 2, 16);
        HMNotifyResponse hMNotifyResponseK = k(bArr);
        return hMNotifyResponseK != null && hMNotifyResponseK.isSuccess((byte) 6);
    }

    public static byte[] u(byte[] data) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ConstantsKt.ALGORITHM_SHA_256);
            messageDigest.update(data);
            return messageDigest.digest();
        } catch (Exception e) {
            Debug.fi(HMBaseProfile.TAG, "sha256 Exception:" + e.getMessage());
            return null;
        }
    }

    public AuthResult auth(String key) {
        Debug.fi(HMBaseProfile.TAG, "auth:" + key);
        byte[] random = getRandom();
        this.k = random;
        Debug.i(HMBaseProfile.TAG, "random:" + GattUtils.bytesToHexString(random));
        if (random == null || random.length != 16) {
            Debug.fi(HMBaseProfile.TAG, "wrong data from device!!!");
            return new AuthResult(0, AppAuthError.REQUEST_RANDOM_FAIL);
        }
        byte[] bArrMd5 = md5(key);
        Debug.i(HMBaseProfile.TAG, "key:" + GattUtils.bytesToHexString(bArrMd5));
        if (bArrMd5 == null || bArrMd5.length != 16) {
            Debug.fi(HMBaseProfile.TAG, "wrong key!!!");
            return new AuthResult(0, AppAuthError.MD5_FAIL);
        }
        byte[] bArrEncrypt = encrypt(random, bArrMd5);
        Debug.i(HMBaseProfile.TAG, "encrypt:" + GattUtils.bytesToHexString(bArrEncrypt));
        if (bArrEncrypt != null && bArrEncrypt.length == 16) {
            return i(bArrEncrypt);
        }
        Debug.fi(HMBaseProfile.TAG, "wrong chip from local encrypt!!!");
        return new AuthResult(0, AppAuthError.ENCRYPT_FAIL);
    }

    public AuthResult b(byte[] bytesOfKey) {
        Debug.fi(HMBaseProfile.TAG, "auth:" + GattUtils.bytesToHexString(bytesOfKey));
        byte[] random = getRandom();
        this.k = random;
        Debug.i(HMBaseProfile.TAG, "random:" + GattUtils.bytesToHexString(random));
        if (random == null || random.length != 16) {
            Debug.fi(HMBaseProfile.TAG, "wrong data from device!!!");
            return new AuthResult(0, AppAuthError.REQUEST_RANDOM_FAIL);
        }
        byte[] bArrEncrypt = encrypt(random, bytesOfKey);
        Debug.i(HMBaseProfile.TAG, "encrypt:" + GattUtils.bytesToHexString(bArrEncrypt));
        if (bArrEncrypt != null && bArrEncrypt.length == 16) {
            return i(bArrEncrypt);
        }
        Debug.fi(HMBaseProfile.TAG, "wrong chip from local encrypt!!!");
        return new AuthResult(0, AppAuthError.ENCRYPT_FAIL);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.h;
        return bluetoothGattCharacteristic == null || unregisterNotification(bluetoothGattCharacteristic);
    }

    public AuthProfileInfo e() {
        byte[] originResponseData;
        HMNotifyResponse hMNotifyResponseK = k(new byte[]{1, this.j});
        if (hMNotifyResponseK == null || (originResponseData = hMNotifyResponseK.getOriginResponseData()) == null || originResponseData.length < 4 || originResponseData[0] != 16 || (originResponseData[1] & 255) != 1 || originResponseData[2] != -127) {
            return null;
        }
        AuthProfileInfo authProfileInfo = new AuthProfileInfo();
        if (originResponseData.length == 4) {
            authProfileInfo.setVersion(originResponseData[3] & 255);
        } else if (originResponseData.length == 20) {
            authProfileInfo.setVersion(originResponseData[3] & 15);
            authProfileInfo.setAlgorithm((originResponseData[3] >> 4) & 15);
            byte[] bArr = new byte[16];
            System.arraycopy(originResponseData, 4, bArr, 0, 16);
            authProfileInfo.setPublicKeyHash(bArr);
        }
        return authProfileInfo;
    }

    public byte[] f() {
        return this.k;
    }

    public AuthResult g() {
        if (this.i == null) {
            waiting(this.h, 30000);
        }
        HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse(this.i);
        if (hMNotifyResponse == null || hMNotifyResponse.getCmd() != 1) {
            return new AuthResult(3, AppAuthError.VERIFY_NOT_RESPONSE);
        }
        byte code = hMNotifyResponse.getCode();
        return code == 1 ? new AuthResult(1, NewProtocolSuccess.INSTANCE) : new AuthResult(code, new ProtocolAuthError(code));
    }

    public byte[] getRandom() {
        byte[] bArr;
        byte b = (byte) (this.l | 2);
        Feature feature = this.m;
        if (feature == null || !feature.hasBase(2)) {
            bArr = new byte[]{b, this.j, 2};
        } else {
            int i = HMBleConfig.API_LEVEL;
            bArr = new byte[]{b, this.j, 2, (byte) (i & 255), (byte) ((i >> 8) & 255)};
        }
        HMNotifyResponse hMNotifyResponseK = k(bArr);
        if (hMNotifyResponseK != null && hMNotifyResponseK.isSuccess(b)) {
            return hMNotifyResponseK.getData();
        }
        HMNotifyResponse hMNotifyResponseK2 = k(new byte[]{b, this.j});
        if (hMNotifyResponseK2 == null || !hMNotifyResponseK2.isSuccess(b)) {
            return null;
        }
        return hMNotifyResponseK2.getData();
    }

    public AuthResult h(String key) {
        Debug.fi(HMBaseProfile.TAG, "pairWithNoResponse:" + key);
        byte[] bArrMd5 = md5(key);
        if (bArrMd5 == null || bArrMd5.length != 16) {
            Debug.fi(HMBaseProfile.TAG, "wrong key!!!");
            return new AuthResult(0, AppAuthError.KEY_ERROR);
        }
        this.i = null;
        return n(bArrMd5);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        UUID uuid = HMBaseProfile.UUID_SERVICE_MILI_SECONDARY_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            service = getService(HMBaseProfile.UUID_SERVICE_MILI_SERVICE);
        }
        if (service == null) {
            Debug.fi(HMBaseProfile.TAG, uuid + " is null!!!");
            return false;
        }
        UUID uuid2 = UUID_CHARACTERISTIC_AUTH_CONTROL_POINT;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.h = characteristic;
        if (characteristic != null) {
            if (registerNotification(characteristic, this)) {
                return true;
            }
            Debug.fi(HMBaseProfile.TAG, "registerNotification m_CharAuth failed!!!");
            return false;
        }
        Debug.fi(HMBaseProfile.TAG, uuid2 + " is null!!!");
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
    public void notify(byte[] value) {
        Debug.fi(HMBaseProfile.TAG, "notify:" + GattUtils.bytesToHexString(value));
        this.i = value;
        watingNotify(this.h);
    }

    public AuthResult p(byte[] sign, byte[] flagBytes) {
        this.i = null;
        byte[] bArr = new byte[sign.length + flagBytes.length + 2];
        bArr[0] = -125;
        bArr[1] = this.j;
        System.arraycopy(sign, 0, bArr, 2, sign.length);
        System.arraycopy(flagBytes, 0, bArr, sign.length + 2, flagBytes.length);
        if (!patchWrite(bArr, 4)) {
            Debug.fi(HMBaseProfile.TAG, "AUTH patchWrite failed!!!");
            return new AuthResult(2, AppAuthError.VERIFY_SIGNATURE_FAIL);
        }
        if (this.i == null) {
            waiting(this.h, 15000);
        }
        byte[] bArr2 = this.i;
        if (bArr2 == null) {
            return new AuthResult(2, AppAuthError.VERIFY_SIGNATURE_FAIL);
        }
        HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse(bArr2);
        if (hMNotifyResponse == null) {
            return new AuthResult(2, AppAuthError.VERIFY_SIGNATURE_FAIL);
        }
        if (!hMNotifyResponse.isSuccess(bArr[0])) {
            return new AuthResult(2, new ProtocolAuthError(hMNotifyResponse.getCode()));
        }
        this.i = null;
        return new AuthResult(1, NewProtocolSuccess.INSTANCE);
    }

    public void r(byte appId) {
        this.j = appId;
    }

    public void s(byte flag) {
        this.l = flag;
    }

    public boolean selfTest() {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattService service = getService(HMBaseProfile.UUID_SERVICE_MILI_SERVICE);
        if (service == null || (characteristic = service.getCharacteristic(UUID.fromString("00000003-0000-3512-2118-0009af100700"))) == null) {
            return false;
        }
        return write(characteristic, new byte[]{4, 1});
    }

    public void t(Feature feature) {
        this.m = feature;
    }

    public boolean unbind(String key) {
        Debug.fi(HMBaseProfile.TAG, "unbind:" + key);
        byte[] random = getRandom();
        this.k = random;
        Debug.i(HMBaseProfile.TAG, "random:" + GattUtils.bytesToHexString(random));
        if (random == null || random.length != 16) {
            Debug.fi(HMBaseProfile.TAG, "wrong data from device!!!");
            return false;
        }
        byte[] bArrHexStringToBytes = this.l == -128 ? GattUtils.hexStringToBytes(key) : md5(key);
        Debug.i(HMBaseProfile.TAG, "key:" + GattUtils.bytesToHexString(bArrHexStringToBytes));
        if (bArrHexStringToBytes == null || bArrHexStringToBytes.length != 16) {
            Debug.fi(HMBaseProfile.TAG, "wrong key!!!");
            return false;
        }
        byte[] bArrEncrypt = encrypt(random, bArrHexStringToBytes);
        Debug.i(HMBaseProfile.TAG, "encrypt:" + GattUtils.bytesToHexString(bArrEncrypt));
        if (bArrEncrypt != null && bArrEncrypt.length == 16) {
            return q(bArrEncrypt);
        }
        Debug.fi(HMBaseProfile.TAG, "wrong chip from local encrypt!!!");
        return false;
    }
}
