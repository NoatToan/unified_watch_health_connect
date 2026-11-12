package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class z5d {
    public static byte[] a(Bitmap bitmap, int i) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static int b(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 > i2 && i7 / i5 > i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public static Bitmap c(Context context, Uri uri, int i, int i2) throws IOException {
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
        inputStreamOpenInputStream.close();
        if (options.outWidth == -1 || options.outHeight == -1) {
            return null;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = b(options, i, i2);
        InputStream inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options2);
        inputStreamOpenInputStream2.close();
        return bitmapDecodeStream;
    }

    public static String d(Uri uri) {
        String strReplaceAll = uri.toString().replaceAll("%2F", "/");
        Matcher matcher = Pattern.compile("/storage.+\\.jpg").matcher(strReplaceAll);
        matcher.matches();
        return matcher.find() ? matcher.group() : strReplaceAll;
    }

    public static int e(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("parseImageDegree: ");
            sb.append(e);
            return 0;
        }
    }

    public static Bitmap f(Bitmap bitmap, int i) {
        Bitmap bitmapCreateBitmap;
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError unused) {
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = bitmap;
        }
        if (bitmap != bitmapCreateBitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }
}
