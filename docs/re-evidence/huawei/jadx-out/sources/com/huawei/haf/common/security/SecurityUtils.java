package com.huawei.haf.common.security;

import android.util.Base64;
import com.huawei.haf.common.utils.CommonConstant;
import com.huawei.haf.common.utils.HexUtils;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class SecurityUtils {
    private SecurityUtils() {
    }

    public static String c(String str) {
        if (str != null) {
            try {
                return HexUtils.c(a(str.getBytes(StandardCharsets.UTF_8), "SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                LogUtil.d("HAF_SecurityUtils", "getSha256ForHex ex=", LogUtil.c(e));
                return "";
            }
        }
        return "";
    }

    public static String d(File file) {
        return a(file, (byte[]) null, false);
    }

    public static String a(File file, byte[] bArr, boolean z) {
        if (file != null && file.exists()) {
            try {
                return HexUtils.e(a(file, bArr, "SHA-256"), z);
            } catch (IOException | NoSuchAlgorithmException e) {
                LogUtil.d("HAF_SecurityUtils", "getSha256ForHex ex=", LogUtil.c(e));
                return "";
            }
        }
        return "";
    }

    public static String b(String str) {
        return a(str, 10);
    }

    public static String e(String str) {
        return a(str, 2);
    }

    private static String a(String str, int i) {
        if (str != null) {
            try {
                return Base64.encodeToString(a(str.getBytes(StandardCharsets.UTF_8), "SHA-256"), i);
            } catch (NoSuchAlgorithmException e) {
                LogUtil.d("HAF_SecurityUtils", "getSha256ForBase64 ex=", LogUtil.c(e));
                return "";
            }
        }
        return "";
    }

    public static byte[] a(String str) {
        if (str != null) {
            try {
                return a(str.getBytes(StandardCharsets.UTF_8), "SHA-256");
            } catch (NoSuchAlgorithmException e) {
                LogUtil.d("HAF_SecurityUtils", "getSha256 ex=", LogUtil.c(e));
            }
        }
        return CommonConstant.f5922c;
    }

    public static byte[] a(byte[] bArr, String str) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(str).digest(bArr);
    }

    public static byte[] a(File file, byte[] bArr, String str) throws NoSuchAlgorithmException, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArrB = b(fileInputStream, bArr, str);
            fileInputStream.close();
            return bArrB;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] b(InputStream inputStream, byte[] bArr, String str) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        DigestInputStream digestInputStream = new DigestInputStream(inputStream, messageDigest);
        try {
            do {
            } while (digestInputStream.read(new byte[8192]) != -1);
            digestInputStream.close();
            if (bArr != null && bArr.length > 0) {
                messageDigest.update(bArr);
            }
            return messageDigest.digest();
        } catch (Throwable th) {
            try {
                digestInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
