package com.xiaomi.hm.health.bt.classic;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.huami.identity.auth.alexa.ConstantsKt;
import com.huami.network.hmnetwork.utils.a;
import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.auth.AuthProfileInfo;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes19.dex */
@SuppressLint({"NewApi"})
public class HMProAuthProfile implements IGattCallback.INotifyCallback {
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
    public static final int AUTH_USING_BY_OTHER = 254;
    public static final int NOTIFY_TIMEOUT = 5000;
    public static final int PAIR_TIMEOUT = 30000;
    private static final String m = "HMProAuthProfile";
    private static final byte n = 0;
    public static final byte o = -128;
    public static final int p = 1;
    private ITransport k;
    private final byte a = 1;
    private final byte b = 2;
    private final byte c = 3;
    private final byte d = 4;
    private final byte e = 5;
    private final byte f = 6;
    private byte[] g = null;
    private byte h = HMBleConfig.APP_ID;
    private byte[] i = null;
    private byte j = 0;
    private CountDownLatch l = null;

    public HMProAuthProfile(ITransport transport) {
        this.k = null;
        this.k = transport;
    }

    private boolean b(String key) {
        byte[] bArrMd5 = md5("" + System.currentTimeMillis());
        if (bArrMd5 == null || bArrMd5.length != 16) {
            Debug.fi(m, "wrong data from random create!!!");
            return false;
        }
        byte[] bArrMd6 = md5(key);
        if (bArrMd6 == null || bArrMd6.length != 16) {
            Debug.fi(m, "wrong key!!!");
            return false;
        }
        byte[] bArrM = m(bArrMd5);
        if (bArrM == null || bArrM.length != 16) {
            Debug.fi(m, "wrong chip from device!!!");
            return false;
        }
        byte[] bArrEncrypt = encrypt(bArrMd5, bArrMd6);
        if (bArrEncrypt != null && bArrEncrypt.length == 16) {
            return Arrays.equals(bArrM, bArrEncrypt) && k();
        }
        Debug.fi(m, "wrong chip from local encrypt!!!");
        return false;
    }

    public static byte[] c(String macAddress, byte[] random) {
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

    private int h(byte[] chip) {
        byte[] bArr = new byte[18];
        bArr[0] = (byte) (this.j | 3);
        bArr[1] = this.h;
        System.arraycopy(chip, 0, bArr, 2, 16);
        HMNotifyResponse hMNotifyResponseI = i(bArr);
        if (hMNotifyResponseI == null) {
            return 0;
        }
        return hMNotifyResponseI.getCode();
    }

    private HMNotifyResponse i(byte[] cmd) {
        Debug.fi(m, "sendCommand:" + GattUtils.bytesToHexString(cmd));
        return this.k.sendCommandWithResponse(Protocol.AUTH_CP, cmd, 30000);
    }

    private boolean j(byte[] cmd) {
        Debug.fi(m, "sendCommandWithNoResponse:" + GattUtils.bytesToHexString(cmd));
        boolean zSendCommandNoResponse = this.k.sendCommandNoResponse(Protocol.AUTH_CP, cmd);
        Debug.fi(m, "write cmd ret:" + zSendCommandNoResponse);
        return zSendCommandNoResponse;
    }

    private boolean k() {
        HMNotifyResponse hMNotifyResponseI = i(new byte[]{5});
        return hMNotifyResponseI != null && hMNotifyResponseI.isSuccess((byte) 5);
    }

    private boolean l(byte[] key) {
        Debug.i(m, "key:" + GattUtils.bytesToHexString(key));
        if (key == null || key.length != 16) {
            return false;
        }
        byte[] bArr = new byte[18];
        bArr[0] = 1;
        bArr[1] = this.h;
        System.arraycopy(key, 0, bArr, 2, 16);
        this.g = null;
        return j(bArr);
    }

    private byte[] m(byte[] random) {
        byte[] bArr = new byte[18];
        bArr[0] = 4;
        bArr[1] = this.h;
        System.arraycopy(random, 0, bArr, 2, 16);
        HMNotifyResponse hMNotifyResponseI = i(bArr);
        if (hMNotifyResponseI == null || !hMNotifyResponseI.isSuccess((byte) 4)) {
            return null;
        }
        return hMNotifyResponseI.getData();
    }

    private boolean o(byte[] chip) {
        byte[] bArr = new byte[18];
        bArr[0] = 6;
        bArr[1] = this.h;
        System.arraycopy(chip, 0, bArr, 2, 16);
        HMNotifyResponse hMNotifyResponseI = i(bArr);
        return hMNotifyResponseI != null && hMNotifyResponseI.isSuccess((byte) 6);
    }

    public static byte[] r(byte[] data) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ConstantsKt.ALGORITHM_SHA_256);
            messageDigest.update(data);
            return messageDigest.digest();
        } catch (Exception e) {
            Debug.fi(m, "sha256 Exception:" + e.getMessage());
            return null;
        }
    }

    public int a(byte[] bytesOfKey) {
        Debug.fi(m, "auth:" + GattUtils.bytesToHexString(bytesOfKey));
        byte[] random = getRandom();
        this.i = random;
        Debug.i(m, "random:" + GattUtils.bytesToHexString(random));
        if (random == null || random.length != 16) {
            Debug.fi(m, "wrong data from device!!!");
            return 0;
        }
        byte[] bArrEncrypt = encrypt(random, bytesOfKey);
        Debug.i(m, "encrypt:" + GattUtils.bytesToHexString(bArrEncrypt));
        if (bArrEncrypt != null && bArrEncrypt.length == 16) {
            return h(bArrEncrypt);
        }
        Debug.fi(m, "wrong chip from local encrypt!!!");
        return 0;
    }

    public int auth(String key) {
        Debug.fi(m, "auth:" + key);
        byte[] random = getRandom();
        this.i = random;
        Debug.i(m, "random:" + GattUtils.bytesToHexString(random));
        if (random == null || random.length != 16) {
            Debug.fi(m, "wrong data from device!!!");
            return 0;
        }
        byte[] bArrMd5 = md5(key);
        Debug.i(m, "key:" + GattUtils.bytesToHexString(bArrMd5));
        if (bArrMd5 == null || bArrMd5.length != 16) {
            Debug.fi(m, "wrong key!!!");
            return 0;
        }
        byte[] bArrEncrypt = encrypt(random, bArrMd5);
        Debug.i(m, "encrypt:" + GattUtils.bytesToHexString(bArrEncrypt));
        if (bArrEncrypt != null && bArrEncrypt.length == 16) {
            return h(bArrEncrypt);
        }
        Debug.fi(m, "wrong chip from local encrypt!!!");
        return 0;
    }

    public AuthProfileInfo d() {
        byte[] originResponseData;
        HMNotifyResponse hMNotifyResponseI = i(new byte[]{1, this.h});
        if (hMNotifyResponseI == null || (originResponseData = hMNotifyResponseI.getOriginResponseData()) == null || originResponseData.length < 4 || originResponseData[0] != 16 || (originResponseData[1] & 255) != 1 || originResponseData[2] != -127) {
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

    public boolean deInit() {
        return true;
    }

    public byte[] e() {
        return this.i;
    }

    public byte[] encrypt(byte[] src, byte[] key) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, a.a);
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] bArrDoFinal = cipher.doFinal(src);
            Debug.i(m, "chip value:" + GattUtils.bytesToHexString(bArrDoFinal));
            return bArrDoFinal;
        } catch (Exception e) {
            Debug.i(m, "Exception:" + e.getMessage());
            return null;
        }
    }

    public int f() {
        HMNotifyResponse hMNotifyResponse;
        CountDownLatch countDownLatch = this.l;
        if (countDownLatch != null) {
            try {
                countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                Debug.fi(m, "pairGetResponse:" + e.getMessage());
            }
            this.l = null;
        }
        this.k.unregisterNotification(Protocol.AUTH_CP);
        byte[] bArr = this.g;
        if (bArr == null || (hMNotifyResponse = HMNotifyResponse.parse(bArr)) == null || hMNotifyResponse.getCmd() != 1) {
            return 0;
        }
        return hMNotifyResponse.getCode();
    }

    public boolean g(String key) {
        Debug.fi(m, "pairWithNoResponse:" + key);
        byte[] bArrMd5 = md5(key);
        if (bArrMd5 == null || bArrMd5.length != 16) {
            Debug.fi(m, "wrong key!!!");
            return false;
        }
        this.g = null;
        this.l = new CountDownLatch(1);
        this.k.registerNotification(Protocol.AUTH_CP, this);
        return l(bArrMd5);
    }

    public BluetoothDevice getDevice() {
        return this.k.getDevice();
    }

    public byte[] getRandom() {
        byte b = (byte) (this.j | 2);
        HMNotifyResponse hMNotifyResponseI = i(new byte[]{b, this.h, 2});
        if (hMNotifyResponseI != null && hMNotifyResponseI.isSuccess(b)) {
            return hMNotifyResponseI.getData();
        }
        HMNotifyResponse hMNotifyResponseI2 = i(new byte[]{b, this.h});
        if (hMNotifyResponseI2 == null || !hMNotifyResponseI2.isSuccess(b)) {
            return null;
        }
        return hMNotifyResponseI2.getData();
    }

    public boolean init() {
        return true;
    }

    public byte[] md5(String key) {
        try {
            return MessageDigest.getInstance("MD5").digest(key.getBytes(Charset.defaultCharset()));
        } catch (Exception e) {
            Debug.i(m, "Exception:" + e.getMessage());
            return null;
        }
    }

    public boolean n(byte[] sign, byte[] flagBytes) {
        this.g = null;
        byte[] bArr = new byte[sign.length + flagBytes.length + 2];
        boolean z = false;
        bArr[0] = -125;
        bArr[1] = this.h;
        System.arraycopy(sign, 0, bArr, 2, sign.length);
        System.arraycopy(flagBytes, 0, bArr, sign.length + 2, flagBytes.length);
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse = this.k.sendCommandWithResponse(Protocol.AUTH_CP, bArr, 5000);
        if (hMNotifyResponseSendCommandWithResponse != null && hMNotifyResponseSendCommandWithResponse.isSuccess(bArr[0])) {
            z = true;
        }
        this.g = null;
        return z;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
    public void notify(byte[] value) {
        Debug.fi(m, "notify:" + GattUtils.bytesToHexString(value));
        this.g = value;
        CountDownLatch countDownLatch = this.l;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public void p(byte appId) {
        this.h = appId;
    }

    public void q(byte flag) {
        this.j = flag;
    }

    public boolean unbind(String key) {
        Debug.fi(m, "unbind:" + key);
        byte[] random = getRandom();
        this.i = random;
        Debug.i(m, "random:" + GattUtils.bytesToHexString(random));
        if (random == null || random.length != 16) {
            Debug.fi(m, "wrong data from device!!!");
            return false;
        }
        byte[] bArrHexStringToBytes = this.j == -128 ? GattUtils.hexStringToBytes(key) : md5(key);
        Debug.i(m, "key:" + GattUtils.bytesToHexString(bArrHexStringToBytes));
        if (bArrHexStringToBytes == null || bArrHexStringToBytes.length != 16) {
            Debug.fi(m, "wrong key!!!");
            return false;
        }
        byte[] bArrEncrypt = encrypt(random, bArrHexStringToBytes);
        Debug.i(m, "encrypt:" + GattUtils.bytesToHexString(bArrEncrypt));
        if (bArrEncrypt != null && bArrEncrypt.length == 16) {
            return o(bArrEncrypt);
        }
        Debug.fi(m, "wrong chip from local encrypt!!!");
        return false;
    }
}
