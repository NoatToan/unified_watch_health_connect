package com.xmlywind.sdk.common.utils;

import android.graphics.Bitmap;
import com.huami.ad.Constants;
import com.huami.view.basetitle.IdGetter;
import java.io.FileInputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public class i {
    private static final HashMap<String, String> a;

    static {
        HashMap<String, String> map = new HashMap<>();
        a = map;
        map.put("FFD8FF", "jpg");
        map.put("89504E47", "png");
        map.put("47494638", Constants.GIF_PATH);
        map.put("49492A00", "tif");
        map.put("424D", "bmp");
        map.put("41433130", "dwg");
        map.put("38425053", "psd");
        map.put("7B5C727466", "rtf");
        map.put("3C3F786D6C", IdGetter.xml);
        map.put("68746D6C3E", "html");
        map.put("44656C69766572792D646174653A", "eml");
        map.put("D0CF11E0", "doc");
        map.put("5374616E64617264204A", "mdb");
        map.put("252150532D41646F6265", "ps");
        map.put("255044462D312E", "pdf");
        map.put("504B0304", "docx");
        map.put("52617221", "rar");
        map.put("57415645", "wav");
        map.put("41564920", "avi");
        map.put("2E524D46", "rm");
        map.put("000001BA", "mpg");
        map.put("000001B3", "mpg");
        map.put("6D6F6F76", "mov");
        map.put("3026B2758E66CF11", "asf");
        map.put("4D546864", "mid");
        map.put("1F8B08", "gz");
        map.put("4D5A9000", "exe/dll");
        map.put("75736167", "txt");
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

    public static void a(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    private static String b(String str) {
        FileInputStream fileInputStream;
        String strA = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                byte[] bArr = new byte[4];
                fileInputStream.read(bArr, 0, 4);
                strA = a(bArr);
            } catch (Throwable unused) {
                if (fileInputStream != null) {
                }
                return strA;
            }
        } catch (Throwable unused2) {
            fileInputStream = null;
        }
        try {
            fileInputStream.close();
        } catch (Throwable unused3) {
        }
        return strA;
    }
}
