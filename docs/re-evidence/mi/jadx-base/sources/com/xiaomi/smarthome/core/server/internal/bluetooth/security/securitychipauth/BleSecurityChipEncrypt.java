package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth;

import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.SecurityChipUtil;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: loaded from: classes10.dex */
public class BleSecurityChipEncrypt {
    private static Map<String, EncryptCounter> mCounterMap = new HashMap();

    public static class EncryptCounter {
        private short mAppHighCounter;
        private short mAppLowCounter;
        private short mDevHighCounter;
        private short mDevLowCounter;

        public void addAppLowCounter() {
            short s = this.mAppLowCounter;
            int i = (s & ShortCompanionObject.MIN_VALUE) >> 15;
            short s2 = (short) (s + 1);
            this.mAppLowCounter = s2;
            if (i != ((s2 & ShortCompanionObject.MIN_VALUE) >> 15)) {
                this.mAppHighCounter = (short) (this.mAppHighCounter + 1);
            }
        }

        public short getAppLowCounter() {
            return this.mAppLowCounter;
        }

        public byte[] getAppNonce() {
            short s = this.mAppLowCounter;
            short s2 = this.mAppHighCounter;
            return new byte[]{(byte) (s & 255), (byte) (s >> 8), (byte) (s2 & 255), (byte) (s2 >> 8)};
        }

        public byte[] getDevNonce() {
            short s = this.mDevLowCounter;
            short s2 = this.mDevHighCounter;
            return new byte[]{(byte) (s & 255), (byte) (s >> 8), (byte) (s2 & 255), (byte) (s2 >> 8)};
        }

        public void resetAllCounter() {
            this.mAppHighCounter = (short) 0;
            this.mAppLowCounter = (short) 0;
            this.mDevHighCounter = (short) 0;
            this.mDevLowCounter = (short) 0;
        }

        public void updateDevLowCounter(short s) {
            int i = (this.mDevLowCounter & ShortCompanionObject.MIN_VALUE) >> 15;
            int i2 = (Short.MIN_VALUE & s) >> 15;
            this.mDevLowCounter = s;
            if (i != i2) {
                this.mDevHighCounter = (short) (this.mDevHighCounter + 1);
            }
        }
    }

    private static boolean checkRuntime(String str, byte[] bArr) {
        if (!BluetoothUtils.isBleDeviceConnected(str)) {
            BluetoothMyLogger.e(str + " is not connected");
            return false;
        }
        if (bArr != null && bArr.length == 64) {
            return true;
        }
        BluetoothMyLogger.e(str + " sessionKey is null or invalid");
        return false;
    }

    public static synchronized void decrypt(String str, byte[] bArr, BleReadResponse bleReadResponse) {
        byte[] propSessionKeyBytes = BluetoothCache.getPropSessionKeyBytes(str);
        if (!checkRuntime(str, propSessionKeyBytes)) {
            invokeResponse(bleReadResponse, -1, null);
            return;
        }
        if (bArr != null && bArr.length > 2) {
            if (propSessionKeyBytes != null && propSessionKeyBytes.length != 0) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(propSessionKeyBytes, 0, 16);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(propSessionKeyBytes, 32, 36);
                short s = (short) ((bArr[1] << 8) | (bArr[0] & 255));
                byte[] bArr2 = new byte[bArr.length - 2];
                System.arraycopy(bArr, 2, bArr2, 0, bArr.length - 2);
                EncryptCounter encryptCounter = getEncryptCounter(str);
                encryptCounter.updateDevLowCounter(s);
                byte[] bArr3 = new byte[12];
                System.arraycopy(bArrCopyOfRange2, 0, bArr3, 0, 4);
                System.arraycopy(encryptCounter.getDevNonce(), 0, bArr3, 8, 4);
                invokeResponse(bleReadResponse, 0, SecurityChipUtil.AESDecrypt(bArrCopyOfRange, bArr3, bArr2));
                return;
            }
            invokeResponse(bleReadResponse, -1, null);
            return;
        }
        invokeResponse(bleReadResponse, -1, null);
    }

    public static synchronized void encrypt(String str, byte[] bArr, BleReadResponse bleReadResponse) {
        byte[] propSessionKeyBytes = BluetoothCache.getPropSessionKeyBytes(str);
        if (!checkRuntime(str, propSessionKeyBytes)) {
            invokeResponse(bleReadResponse, -1, null);
            return;
        }
        if (propSessionKeyBytes != null && propSessionKeyBytes.length != 0) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(propSessionKeyBytes, 16, 32);
            byte[] bArr2 = new byte[12];
            System.arraycopy(Arrays.copyOfRange(propSessionKeyBytes, 36, 40), 0, bArr2, 0, 4);
            EncryptCounter encryptCounter = getEncryptCounter(str);
            short appLowCounter = encryptCounter.getAppLowCounter();
            System.arraycopy(encryptCounter.getAppNonce(), 0, bArr2, 8, 4);
            byte[] bArrAESEncrypt = SecurityChipUtil.AESEncrypt(bArrCopyOfRange, bArr2, bArr);
            if (bArrAESEncrypt == null) {
                invokeResponse(bleReadResponse, -1, null);
            } else {
                encryptCounter.addAppLowCounter();
                short s = (short) (65535 & appLowCounter);
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(bArrAESEncrypt.length + 2).order(ByteOrder.LITTLE_ENDIAN);
                byteBufferOrder.putShort(s);
                byteBufferOrder.put(bArrAESEncrypt);
                invokeResponse(bleReadResponse, 0, byteBufferOrder.array());
            }
            return;
        }
        invokeResponse(bleReadResponse, -1, null);
    }

    private static EncryptCounter getEncryptCounter(String str) {
        EncryptCounter encryptCounter = mCounterMap.get(str);
        if (encryptCounter != null) {
            return encryptCounter;
        }
        EncryptCounter encryptCounter2 = new EncryptCounter();
        mCounterMap.put(str, encryptCounter2);
        return encryptCounter2;
    }

    private static void invokeResponse(BleReadResponse bleReadResponse, int i, byte[] bArr) {
        if (bleReadResponse != null) {
            bleReadResponse.onResponse(i, bArr);
        }
    }

    public static void resetEncryptCounter(String str) {
        EncryptCounter encryptCounter = mCounterMap.get(str);
        if (encryptCounter != null) {
            encryptCounter.resetAllCounter();
        }
    }
}
