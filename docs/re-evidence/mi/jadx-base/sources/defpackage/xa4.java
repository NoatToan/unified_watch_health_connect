package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.os.Environment;
import android.util.Pair;
import coil.util.Utils;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class xa4 {
    public final int a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i > i3 || i2 > i4) {
            int i6 = i / 2;
            int i7 = i2 / 2;
            while (i6 / i5 >= i3 && i7 / i5 >= i4) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public final Pair<Integer, Integer> b(int i, int i2, int i3, int i4) {
        if (i > i3) {
            i2 = (int) (i2 * (i3 / i));
            i = i3;
        }
        if (i2 > i4) {
            i = (int) (i * (i4 / i2));
        } else {
            i4 = i2;
        }
        return Pair.create(Integer.valueOf(i), Integer.valueOf(i4));
    }

    public File c(Context context, ReadableMap readableMap, String str, BitmapFactory.Options options) throws IOException {
        Integer numValueOf = readableMap.hasKey("compressImageMaxWidth") ? Integer.valueOf(readableMap.getInt("compressImageMaxWidth")) : null;
        Integer numValueOf2 = readableMap.hasKey("compressImageMaxHeight") ? Integer.valueOf(readableMap.getInt("compressImageMaxHeight")) : null;
        Double dValueOf = readableMap.hasKey("compressImageQuality") ? Double.valueOf(readableMap.getDouble("compressImageQuality")) : null;
        boolean z = dValueOf == null || dValueOf.doubleValue() == 1.0d;
        boolean z2 = numValueOf == null || numValueOf.intValue() >= options.outWidth;
        boolean z3 = numValueOf2 == null || numValueOf2.intValue() >= options.outHeight;
        List listAsList = Arrays.asList(Utils.MIME_TYPE_JPEG, "image/jpg", "image/png", "image/gif", "image/tiff");
        String str2 = options.outMimeType;
        boolean z4 = str2 != null && listAsList.contains(str2.toLowerCase());
        if (z && z2 && z3 && z4) {
            return new File(str);
        }
        int iDoubleValue = dValueOf != null ? (int) (dValueOf.doubleValue() * 100.0d) : 100;
        StringBuilder sb = new StringBuilder();
        sb.append("Compressing image with quality ");
        sb.append(iDoubleValue);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(options.outWidth);
        }
        if (numValueOf2 == null) {
            numValueOf2 = Integer.valueOf(options.outHeight);
        }
        return e(context, str, options.outWidth, options.outHeight, numValueOf.intValue(), numValueOf2.intValue(), iDoubleValue);
    }

    public synchronized void d(Activity activity, ReadableMap readableMap, String str, String str2, Promise promise) {
        promise.resolve(str);
    }

    public File e(Context context, String str, int i, int i2, int i3, int i4, int i5) throws IOException {
        Bitmap bitmapDecodeFile;
        Pair<Integer, Integer> pairB = b(i, i2, i3, i4);
        int iIntValue = ((Integer) pairB.first).intValue();
        int iIntValue2 = ((Integer) pairB.second).intValue();
        if (i > i3 || i2 > i4) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = a(i, i2, iIntValue, iIntValue2);
            bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        } else {
            bitmapDecodeFile = BitmapFactory.decodeFile(str);
        }
        String attribute = new ExifInterface(str).getAttribute("Orientation");
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, iIntValue, iIntValue2, true);
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        File file = new File(externalFilesDir, UUID.randomUUID() + ".jpg");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, i5, bufferedOutputStream);
        if (f(attribute)) {
            ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
            exifInterface.setAttribute("Orientation", attribute);
            exifInterface.saveAttributes();
        }
        bufferedOutputStream.close();
        bitmapCreateScaledBitmap.recycle();
        return file;
    }

    public final boolean f(String str) {
        return (str.equals(String.valueOf(1)) || str.equals(String.valueOf(0))) ? false : true;
    }
}
