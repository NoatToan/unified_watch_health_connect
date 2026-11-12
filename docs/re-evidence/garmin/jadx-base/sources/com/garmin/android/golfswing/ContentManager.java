package com.garmin.android.golfswing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import tn.k;

/* JADX INFO: loaded from: classes11.dex */
public class ContentManager {
    private static String mResourcesPath = "";
    private static Context sContext;

    public static byte[] decodeTexture(InputStream inputStream) {
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
        int width = bitmapDecodeStream.getWidth();
        int height = bitmapDecodeStream.getHeight();
        int i14 = width * height;
        int[] iArr = new int[i14];
        bitmapDecodeStream.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i14 * 4];
        for (int i15 = 0; i15 < height; i15++) {
            for (int i16 = 0; i16 < width; i16++) {
                int i17 = (i15 * width) + i16;
                int i18 = iArr[i17];
                int i19 = i17 * 4;
                bArr[i19] = (byte) ((i18 >> 16) & 255);
                bArr[i19 + 1] = (byte) ((i18 >> 8) & 255);
                bArr[i19 + 2] = (byte) (i18 & 255);
                bArr[i19 + 3] = (byte) ((i18 >> 24) & 255);
            }
        }
        try {
            inputStream.close();
        } catch (Exception unused) {
        }
        return bArr;
    }

    public static String findResource(String str, String str2) {
        String strG = k.g(str, str2);
        String strG2 = k.g(Environment.getExternalStorageDirectory().getAbsolutePath(), "/GolfResources");
        File file = new File(strG2);
        String str3 = "";
        if (!file.isDirectory() && !file.exists()) {
            return "";
        }
        try {
            File[] fileArrListFiles = file.listFiles();
            for (int i14 = 0; i14 < fileArrListFiles.length; i14++) {
                if (fileArrListFiles[i14].isFile()) {
                    String name = fileArrListFiles[i14].getName();
                    if (name.compareToIgnoreCase(strG) == 0) {
                        str3 = strG2 + "/" + name;
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return str3;
    }

    public static void initialize(Context context) {
        sContext = context;
    }

    public static byte[] loadModel(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        String strFindResource = findResource(str, ".obj");
        if (strFindResource.length() > 0) {
            try {
                FileInputStream fileInputStream = new FileInputStream(strFindResource);
                while (true) {
                    int i14 = fileInputStream.read(bArr, 0, 1024);
                    if (i14 <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i14);
                }
                fileInputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        } else {
            InputStream inputStreamOpenRawResource = sContext.getResources().openRawResource(sContext.getResources().getIdentifier(str, "raw", sContext.getPackageName()));
            while (true) {
                try {
                    int i15 = inputStreamOpenRawResource.read(bArr, 0, 1024);
                    if (i15 <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i15);
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            }
            inputStreamOpenRawResource.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] loadTexture(String str) {
        String strFindResource = findResource(str, ".png");
        if (strFindResource.length() > 0) {
            try {
                return decodeTexture(new FileInputStream(strFindResource));
            } catch (Exception unused) {
                return null;
            }
        }
        return decodeTexture(sContext.getResources().openRawResource(sContext.getResources().getIdentifier(str, "raw", sContext.getPackageName())));
    }
}
