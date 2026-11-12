package com.huawei.openalliance.ad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes12.dex */
public final class un {
    public static byte[] a(Context context, uk ukVar, int i) {
        byte[] bArr = new byte[0];
        if (ukVar != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Bitmap bitmapA = a(context, ukVar);
                if (bitmapA == null) {
                    com.huawei.openalliance.ad.utils.df.a(byteArrayOutputStream);
                    return bArr;
                }
                Bitmap bitmapA2 = a(bitmapA);
                int i2 = 100;
                bitmapA2.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                while (byteArrayOutputStream.toByteArray().length > i) {
                    byteArrayOutputStream.reset();
                    bitmapA2.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                    i2 -= 5;
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                com.huawei.openalliance.ad.utils.df.a(byteArrayOutputStream);
                return byteArray;
            } catch (Throwable th) {
                try {
                    hw.c("ShareUtil", "get bitmap arr failed, cause: %s", th.getClass().getSimpleName());
                } finally {
                    com.huawei.openalliance.ad.utils.df.a(byteArrayOutputStream);
                }
            }
        }
        return bArr;
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            hw.c("ShareUtil", "class not fount %s", str);
            return false;
        }
    }

    public static String a(String str, int i) {
        return (TextUtils.isEmpty(str) || str.length() <= i) ? str : str.substring(0, i);
    }

    private static Bitmap a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == height) {
            return bitmap;
        }
        int iMin = Math.min(width, height);
        return Bitmap.createBitmap(bitmap, (width - iMin) / 2, (height - iMin) / 2, iMin, iMin);
    }

    public static Bitmap a(Context context, String str) {
        sn snVar = new sn();
        snVar.d(str);
        snVar.b(false);
        return (Bitmap) com.huawei.openalliance.ad.utils.dj.a(new uh(new sl(context, snVar)), 2000L, null);
    }

    private static Bitmap a(Context context, uk ukVar) {
        Bitmap bitmapA = a(context, ukVar.a());
        return bitmapA == null ? BitmapFactory.decodeStream(context.getResources().openRawResource(ukVar.e())) : bitmapA;
    }
}
