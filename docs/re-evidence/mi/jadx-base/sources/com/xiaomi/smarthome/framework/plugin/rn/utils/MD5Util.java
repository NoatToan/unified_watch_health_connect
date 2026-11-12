package com.xiaomi.smarthome.framework.plugin.rn.utils;

import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.ExceptionsKt__ExceptionsKt;

/* JADX INFO: loaded from: classes2.dex */
public class MD5Util {
    private static final int READ_SIZE = 4096;

    public static String MD5_16(String str) {
        return MD5_32(str).subSequence(8, 24).toString();
    }

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

    public static byte[] MD5_4_bytes(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            messageDigest.update(str.getBytes(), 0, str.length());
            return Arrays.copyOfRange(messageDigest.digest(), 6, 10);
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
            MiJiaLog.writeLogOnAll(LogType.PLUGIN, "MD5Util", ExceptionsKt__ExceptionsKt.stackTraceToString(th));
            return "";
        }
    }

    public static String getFileSegmentMD5(RandomAccessFile randomAccessFile, int i, int i2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            int i3 = i;
            int i4 = 4096;
            int i5 = 0;
            int i6 = 0;
            while (i5 != -1 && i6 < i2) {
                int i7 = i2 - i6;
                if (i7 < 4096) {
                    i4 = i7;
                }
                if (i4 <= 0) {
                    break;
                }
                byte[] bArr = new byte[i4];
                randomAccessFile.seek(i3);
                int i8 = randomAccessFile.read(bArr, 0, i4);
                if (i8 > 0) {
                    messageDigest.update(bArr, 0, i8);
                }
                i6 += i4;
                i3 = i + i6;
                i5 = i8;
            }
            return String.format("%32s", new BigInteger(1, messageDigest.digest()).toString(16)).replace(' ', '0');
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String getMd5Digest(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            messageDigest.update(getBytes(str));
            return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
