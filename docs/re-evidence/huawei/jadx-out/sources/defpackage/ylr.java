package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes46.dex */
public class ylr {
    public static byte[] d(Bitmap bitmap) {
        if (bitmap == null) {
            yit.b("BitmapUtil", "getBytesByBitmap bitmap == null");
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
            yit.b("BitmapUtil", "The bitmap can't be reconstructed by passing a corresponding inputstream to BitmapFactory.");
            return new byte[0];
        }
        return byteArrayOutputStream.toByteArray();
    }
}
