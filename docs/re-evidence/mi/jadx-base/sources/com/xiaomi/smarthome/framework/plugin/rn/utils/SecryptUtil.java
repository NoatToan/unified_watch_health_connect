package com.xiaomi.smarthome.framework.plugin.rn.utils;

import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public class SecryptUtil {
    private static final int READ_SIZE = 4096;

    private static String convertHashToString(byte[] bArr) {
        String str = "";
        for (byte b2 : bArr) {
            str = str + Integer.toString((b2 & 255) + 256, 16).substring(1);
        }
        return str.toLowerCase();
    }

    public static String fileSegmentToSHA1(RandomAccessFile randomAccessFile, int i, int i2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
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
            return convertHashToString(messageDigest.digest());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String fileToSHA1(String str) throws Throwable {
        FileInputStream fileInputStream;
        int i;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                byte[] bArr = new byte[4096];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                do {
                    i = fileInputStream.read(bArr);
                    if (i > 0) {
                        messageDigest.update(bArr, 0, i);
                    }
                } while (i != -1);
                String strConvertHashToString = convertHashToString(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return strConvertHashToString;
            } catch (Exception unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
