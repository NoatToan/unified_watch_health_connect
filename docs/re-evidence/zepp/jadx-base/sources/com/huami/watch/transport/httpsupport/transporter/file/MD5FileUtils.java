package com.huami.watch.transport.httpsupport.transporter.file;

import com.huami.watch.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes9.dex */
public class MD5FileUtils {
    private static final String a = "FwUpgrade-Md5FileUtils";
    public static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static MessageDigest messagedigest;

    static {
        messagedigest = null;
        try {
            messagedigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            Log.i(a, "MD5FileUtil messagedigest初始化失败", new Object[0]);
        }
    }

    private static void a(byte b, StringBuffer stringBuffer) {
        char[] cArr = hexDigits;
        char c = cArr[(b & 240) >> 4];
        char c2 = cArr[b & 15];
        stringBuffer.append(c);
        stringBuffer.append(c2);
    }

    private static String b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    private static String c(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        for (int i3 = i; i3 < i + i2; i3++) {
            a(bArr[i3], stringBuffer);
        }
        return stringBuffer.toString();
    }

    public static String getFileMD5String(File file) {
        try {
            messagedigest.update(new FileInputStream(file).getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length()));
            return b(messagedigest.digest());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getMD5String(String str) {
        return getMD5String(str.getBytes());
    }

    public static String getMD5String(byte[] bArr) {
        messagedigest.update(bArr);
        return b(messagedigest.digest());
    }
}
