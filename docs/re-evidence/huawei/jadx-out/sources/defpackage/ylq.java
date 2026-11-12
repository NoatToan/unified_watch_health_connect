package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes20.dex */
public final class ylq {
    private static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f53624c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private static char[] c(byte[] bArr, boolean z) {
        return b(bArr, z ? f53624c : d);
    }

    private static char[] b(byte[] bArr, char[] cArr) {
        int i = 0;
        char[] cArr2 = new char[0];
        if (bArr == null) {
            yis.c("HexUtil", "encodeHex dataByte is null");
            return cArr2;
        }
        if (cArr == null) {
            yis.c("HexUtil", "encodeHex toDigits is null");
            return cArr2;
        }
        if (bArr.length > 65535) {
            yis.c("HexUtil", "encodeHex dataByte's length is too large");
            return cArr2;
        }
        int length = bArr.length;
        char[] cArr3 = new char[length << 1];
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            cArr3[i] = cArr[(b2 & 240) >>> 4];
            cArr3[i + 1] = cArr[b2 & 15];
            i2++;
            i += 2;
        }
        return cArr3;
    }

    public static String b(byte[] bArr, boolean z) {
        return new String(c(bArr, z));
    }

    public static String d(File file) {
        FileInputStream fileInputStream;
        if (file == null) {
            yis.c("HexUtil", "getFileShaHex file is null");
            return null;
        }
        if (!file.exists()) {
            yis.c("HexUtil", "getFileShaHex file not exit");
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException unused) {
            yis.c("HexUtil", "getFileShaHex FileNotFoundException");
            fileInputStream = null;
        }
        try {
            if (fileInputStream == null) {
                return null;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] bArr = new byte[4096];
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    messageDigest.update(bArr, 0, 0);
                } else {
                    messageDigest.update(bArr, 0, i);
                    while (true) {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i2);
                    }
                }
                String strB = b(messageDigest.digest(), true);
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                    yis.c("HexUtil", "getFileShaHex IOException");
                }
                return strB;
            } catch (IOException unused3) {
                yis.c("HexUtil", "getFileShaHex IOException");
                try {
                    fileInputStream.close();
                    return "";
                } catch (IOException unused4) {
                    yis.c("HexUtil", "getFileShaHex IOException");
                    return "";
                }
            } catch (NoSuchAlgorithmException unused5) {
                yis.c("HexUtil", "getFileShaHex NoSuchAlgorithmException");
                fileInputStream.close();
                return "";
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (IOException unused6) {
                yis.c("HexUtil", "getFileShaHex IOException");
            }
            throw th;
        }
    }
}
