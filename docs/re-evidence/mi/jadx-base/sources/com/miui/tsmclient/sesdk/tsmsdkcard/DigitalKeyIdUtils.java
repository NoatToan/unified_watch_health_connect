package com.miui.tsmclient.sesdk.tsmsdkcard;

import android.os.Build;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.Coder;
import com.xiaomi.digitalkey.wearable.utils.ByteUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes6.dex */
class DigitalKeyIdUtils {
    public static String createDigitalKeyId(byte[] bArr) {
        return Coder.bytesToHexString(createKeyId(getDeviceOemId(), ByteUtils.clone(bArr, 0, 2)));
    }

    private static byte[] createKeyId(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 2 || bArr2.length != 2) {
            LogUtils.e("createKeyId parameter is invalid");
            return null;
        }
        byte[] bArrConcatenate = ByteUtils.concatenate(bArr, bArr2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date());
        int iNextInt = new Random().nextInt(Integer.MAX_VALUE);
        byte[] bytes = (str + iNextInt).getBytes();
        LogUtils.d("createKeyId timeStr=" + str + ", randomNumber=" + iNextInt + ", content=" + ByteUtils.toHexString(bytes));
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM);
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            LogUtils.d("createKeyId digest=" + ByteUtils.toHexString(bArrDigest));
            byte[] bArr3 = new byte[12];
            System.arraycopy(bArrDigest, bArrDigest.length - 12, bArr3, 0, 12);
            byte[] bArrConcatenate2 = ByteUtils.concatenate(bArrConcatenate, bArr3);
            LogUtils.d("createKeyId --> keyId : " + ByteUtils.toHexString(bArrConcatenate2));
            return bArrConcatenate2;
        } catch (NoSuchAlgorithmException e) {
            LogUtils.e("createKeyId NoSuchAlgorithmException", e);
            return null;
        }
    }

    private static byte[] createMiKeyId(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z) {
        if (bArr.length != 2 || bArr2.length != 2) {
            LogUtils.e("createMiKeyId parameter is invalid");
            return null;
        }
        byte[] bArrConcatenate = ByteUtils.concatenate(bArr, bArr2);
        if (bArr3 == null || bArr3.length < 3) {
            LogUtils.e("createMiKeyId vehicleId is invalid: " + ByteUtils.toHexString(bArr3));
            return null;
        }
        byte[] bArr4 = {bArr3[bArr3.length - 3], bArr3[bArr3.length - 2], bArr3[bArr3.length - 1]};
        Date date = new Date();
        byte[] bArrFromHexString = ByteUtils.fromHexString(generateTimestamp(date));
        if (bArrFromHexString.length != 5) {
            LogUtils.e("createMiKeyId timeStamp is invalid: " + ByteUtils.toHexString(bArr3));
            return null;
        }
        byte b2 = (byte) (((z ? 1 : 2) << 4) | 1);
        byte[] bArr5 = new byte[8];
        new Random().nextBytes(bArr5);
        String str = "brand:" + Build.BRAND + " device:" + Build.DEVICE + " sdk:" + Build.VERSION.SDK_INT + " time:" + generateTimestampLong(date) + " -- " + ByteUtils.toHexString(bArr5);
        LogUtils.d("createMiKeyId vehicleIdLastBytes=" + ByteUtils.toHexString(bArr4) + ", timeStamp" + ByteUtils.toHexString(bArrFromHexString) + ", userByte=" + String.format("%02x", Byte.valueOf(b2)) + ", infoStr=" + str);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM);
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            LogUtils.d("createMiKeyId digest=" + ByteUtils.toHexString(bArrDigest));
            byte[] bArrConcat = ByteUtils.concat(bArrConcatenate, bArr4, bArrFromHexString, new byte[]{b2}, ByteUtils.clone(bArrDigest, bArrDigest.length - 3, 3));
            LogUtils.d("createMiKeyId --> keyId : " + ByteUtils.toHexString(bArrConcat));
            return bArrConcat;
        } catch (NoSuchAlgorithmException e) {
            LogUtils.e("createMiKeyId NoSuchAlgorithmException", e);
            return null;
        }
    }

    private static String generateTimestamp(Date date) {
        return new SimpleDateFormat("yyMMddHHmm", Locale.US).format(date);
    }

    private static String generateTimestampLong(Date date) {
        return new SimpleDateFormat("yyMMddHHmmssSSS", Locale.US).format(date);
    }

    private static byte[] getDeviceOemId() {
        return new byte[]{0, 1};
    }

    private static boolean isMiCarOemId(byte[] bArr) {
        return "002F".equals(ByteUtils.toHexString(bArr));
    }
}
