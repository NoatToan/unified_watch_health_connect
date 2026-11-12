package com.xiaomi.smarthome.library.crypto;

import android.text.TextUtils;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public class MD5Util {
    public static String MD5_32(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            StringBuilder sb = new StringBuilder();
            messageDigest.update(str.getBytes(), 0, str.length());
            for (byte b2 : messageDigest.digest()) {
                sb.append(byte2Hex(b2));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private static String byte2Hex(byte b2) {
        int i = (b2 & 127) + (b2 < 0 ? 128 : 0);
        StringBuilder sb = new StringBuilder();
        sb.append(i < 16 ? "0" : "");
        sb.append(Integer.toHexString(i).toLowerCase());
        return sb.toString();
    }

    public static byte[] getBytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static String getFileMD5(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            byte[] bArr = new byte[4096];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    fileInputStream.close();
                    return String.format("%32s", new BigInteger(1, messageDigest.digest()).toString(16)).replace(' ', '0');
                }
                messageDigest.update(bArr, 0, i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String getMd5Digest(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            messageDigest.update(getBytes(str));
            return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
