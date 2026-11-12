package com.huami.android.zxing;

import android.graphics.Bitmap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes5.dex */
public class QrCodeUtils {
    private static final int a = -16777216;
    private static final int b = -1;
    private static Gson c;

    private QrCodeUtils() {
    }

    public static Gson createGson() {
        if (c == null) {
            synchronized (QrCodeUtils.class) {
                if (c == null) {
                    c = new GsonBuilder().create();
                }
            }
        }
        return c;
    }

    public static Bitmap createQRCode(String str, int i) throws WriterException {
        new Hashtable().put(EncodeHintType.CHARACTER_SET, "utf-8");
        BitMatrix bitMatrixEncode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, i, i);
        int width = bitMatrixEncode.getWidth();
        int height = bitMatrixEncode.getHeight();
        int[] iArr = new int[width * height];
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                if (bitMatrixEncode.get(i3, i2)) {
                    iArr[(i2 * width) + i3] = -16777216;
                } else {
                    iArr[(i2 * width) + i3] = -1;
                }
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmapCreateBitmap;
    }

    public static Bitmap encodeAsBitmap(Object obj, int i) throws WriterException {
        EnumMap enumMap;
        if (obj == null) {
            return null;
        }
        String json = createGson().toJson(obj);
        String strGuessAppropriateEncoding = guessAppropriateEncoding(json);
        if (strGuessAppropriateEncoding != null) {
            EnumMap enumMap2 = new EnumMap(EncodeHintType.class);
            enumMap2.put(EncodeHintType.CHARACTER_SET, strGuessAppropriateEncoding);
            enumMap = enumMap2;
        } else {
            enumMap = null;
        }
        try {
            BitMatrix bitMatrixEncode = new MultiFormatWriter().encode(json, BarcodeFormat.QR_CODE, i, i, enumMap);
            int width = bitMatrixEncode.getWidth();
            int height = bitMatrixEncode.getHeight();
            int[] iArr = new int[width * height];
            for (int i2 = 0; i2 < height; i2++) {
                int i3 = i2 * width;
                for (int i4 = 0; i4 < width; i4++) {
                    iArr[i3 + i4] = bitMatrixEncode.get(i4, i2) ? -16777216 : 0;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            return bitmapCreateBitmap;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String guessAppropriateEncoding(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) > 255) {
                return "UTF-8";
            }
        }
        return null;
    }
}
