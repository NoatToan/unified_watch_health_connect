package com.xiaomi.smarthome.core.server.internal.bluetooth;

import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.device.bluetooth.security.BLECipher;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.library.common.util.RandUtils;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothHelper {
    public static byte[] MD5_12(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            messageDigest.update(str.getBytes(), 0, str.length());
            byte[] bArrDigest = messageDigest.digest();
            int length = bArrDigest.length;
            if (length < 12) {
                return ByteUtils.EMPTY_BYTES;
            }
            int i = length / 2;
            return Arrays.copyOfRange(bArrDigest, i - 6, i + 6);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static boolean checkBindStyle(int i) {
        int bindStyle = getBindStyle(i);
        return bindStyle == 1 || bindStyle == 2;
    }

    public static byte[] generateToken() {
        return MD5_12(String.format("token.%d.%f", Long.valueOf(System.currentTimeMillis()), Double.valueOf(RandUtils.randFloat())));
    }

    public static int getBindStyle(int i) {
        return getBindStyle(BluetoothService.getBleCoreProvider().getModelByProductId(i));
    }

    public static int getProductId(String str) {
        int propProductId = BluetoothCache.getPropProductId(str);
        if (propProductId <= 0) {
            String propModel = BluetoothCache.getPropModel(str);
            if (!TextUtils.isEmpty(propModel)) {
                return BluetoothService.getBleCoreProvider().getProductIdByModel(propModel);
            }
        }
        return propProductId;
    }

    public static byte[] mixA(String str, int i) {
        return BLECipher.mixA(BluetoothCache.getPropSMac(str), i);
    }

    public static byte[] mixB(String str, int i) {
        return BLECipher.mixB(BluetoothCache.getPropSMac(str), i);
    }

    public static int getBindStyle(String str) {
        return BluetoothService.getBleCoreProvider().getBluetoothBindStyle(str);
    }
}
