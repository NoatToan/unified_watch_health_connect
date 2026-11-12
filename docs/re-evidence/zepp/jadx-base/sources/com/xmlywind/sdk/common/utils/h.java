package com.xmlywind.sdk.common.utils;

import com.huami.ad.Constants;
import com.xmlywind.logger.SigmobLog;
import java.io.FileInputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public class h {
    private static final HashMap<String, String> a;

    static {
        HashMap<String, String> map = new HashMap<>();
        a = map;
        map.put("FFD8", "jpg");
        map.put("8950", "png");
        map.put("4749", Constants.GIF_PATH);
        map.put("4949", "tif");
        map.put("424D", "bmp");
        map.put("5745", "webp");
    }

    public static String a(String str) {
        return a.get(b(str));
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String upperCase = Integer.toHexString(b & 255).toUpperCase();
            if (upperCase.length() < 2) {
                sb.append(0);
            }
            sb.append(upperCase);
        }
        return sb.toString();
    }

    public static String b(String str) {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                byte[] bArr = new byte[2];
                fileInputStream2.read(bArr, 0, 2);
                String strA = a(bArr);
                if (strA.equals("5249")) {
                    fileInputStream2.skip(6L);
                    fileInputStream2.read(bArr, 0, 2);
                    strA = a(bArr);
                }
                try {
                    fileInputStream2.close();
                    return strA;
                } catch (Throwable unused) {
                    return strA;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                try {
                    SigmobLog.e(th.getMessage());
                    return null;
                } finally {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
