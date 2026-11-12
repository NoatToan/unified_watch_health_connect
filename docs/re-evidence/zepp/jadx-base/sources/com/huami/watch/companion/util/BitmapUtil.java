package com.huami.watch.companion.util;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.watch.util.DeviceCompatibility;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public class BitmapUtil {
    private static boolean a(Context context, Bitmap bitmap, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", MimeTypes.IMAGE_JPEG);
        boolean z = true;
        if (DeviceCompatibility.isQ()) {
            contentValues.put("is_pending", (Integer) 1);
        }
        Uri contentUri = MediaStore.Images.Media.getContentUri("external_primary");
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriInsert = contentResolver.insert(contentUri, contentValues);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, contentResolver.openOutputStream(uriInsert));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            z = false;
        }
        contentValues.clear();
        if (DeviceCompatibility.isQ()) {
            contentValues.put("is_pending", (Integer) 0);
        }
        contentResolver.update(uriInsert, contentValues, null, null);
        if (!DeviceCompatibility.isQ()) {
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uriInsert));
        }
        return z;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0034: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:20:0x0034 */
    public static byte[] bitmapToBase64(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        byte[] bArrEncode;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            if (bitmap != null) {
                try {
                    byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(compressFormat, i, byteArrayOutputStream2);
                        byteArrayOutputStream2.flush();
                        byteArrayOutputStream2.close();
                        bArrEncode = Base64.encode(byteArrayOutputStream2.toByteArray(), 0);
                        byteArrayOutputStream3 = byteArrayOutputStream2;
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                        if (byteArrayOutputStream2 == null) {
                            return null;
                        }
                        try {
                            byteArrayOutputStream2.flush();
                            byteArrayOutputStream2.close();
                            return null;
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            return null;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    byteArrayOutputStream2 = null;
                } catch (Throwable th) {
                    th = th;
                    if (byteArrayOutputStream3 != null) {
                        try {
                            byteArrayOutputStream3.flush();
                            byteArrayOutputStream3.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } else {
                bArrEncode = null;
            }
            if (byteArrayOutputStream3 != null) {
                try {
                    byteArrayOutputStream3.flush();
                    byteArrayOutputStream3.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            return bArrEncode;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream3 = byteArrayOutputStream;
        }
    }

    public static byte[] bmpToByteArray(Bitmap bitmap, boolean z, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        if (z) {
            bitmap.recycle();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byteArray;
    }

    public static int calculateInSampleSize(String str, double d) {
        int i = 1;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(new FileInputStream(str), null, options);
            int i2 = options.outHeight;
            int i3 = options.outWidth;
            int i4 = (int) (((double) i2) / d);
            int i5 = (int) (((double) i3) / d);
            if (i2 > i4 || i3 > i5) {
                int i6 = i2 / 2;
                int i7 = i3 / 2;
                while (i6 / i > i4 && i7 / i > i5) {
                    i *= 2;
                }
            }
        } catch (Exception unused) {
        }
        return i;
    }

    public static Bitmap connectBitmap(Bitmap bitmap, Bitmap bitmap2, boolean z) {
        int width;
        int iMax;
        if (bitmap == null && bitmap2 == null) {
            return null;
        }
        if (bitmap == null) {
            return bitmap2;
        }
        if (bitmap2 == null) {
            return bitmap;
        }
        if (!bitmap.isMutable()) {
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            if (bitmapCopy != null) {
                bitmap.recycle();
            }
            bitmap = bitmapCopy;
        }
        if (z) {
            width = Math.max(bitmap.getWidth(), bitmap2.getWidth());
            iMax = bitmap.getHeight() + bitmap2.getHeight();
        } else {
            width = bitmap.getWidth() + bitmap2.getWidth();
            iMax = Math.max(bitmap.getHeight(), bitmap2.getHeight());
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, iMax, Bitmap.Config.ARGB_4444);
        Paint paint = new Paint();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (z) {
            canvas.drawBitmap(bitmap2, 0.0f, bitmap.getHeight(), paint);
        } else {
            canvas.drawBitmap(bitmap2, bitmap.getWidth(), 0.0f, paint);
        }
        canvas.save();
        canvas.restore();
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() == -1 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static int getBitmapSize(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return Build.VERSION.SDK_INT >= 12 ? bitmap.getByteCount() : bitmap.getRowBytes() * bitmap.getHeight();
    }

    public static Bitmap joinBitmap(Bitmap bitmap, Bitmap bitmap2, float f, float f2) {
        if (bitmap == null && bitmap2 == null) {
            return null;
        }
        if (bitmap == null) {
            return bitmap2;
        }
        if (bitmap2 == null) {
            return bitmap;
        }
        if (!bitmap.isMutable()) {
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            if (bitmapCopy != null) {
                bitmap.recycle();
            }
            bitmap = bitmapCopy;
        }
        Paint paint = new Paint();
        Canvas canvas = new Canvas(bitmap);
        canvas.drawBitmap(bitmap2, f, f2, paint);
        canvas.save();
        canvas.restore();
        return bitmap;
    }

    public static boolean saveBitmapToFile(@NonNull File file, @NonNull Bitmap bitmap, int i) throws Throwable {
        boolean zCompress;
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream2);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    zCompress = false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
        return zCompress;
    }

    public static boolean saveImageToGallery(Context context, Bitmap bitmap) {
        String str = "bind_qr_" + System.currentTimeMillis() + ".jpg";
        if (DeviceCompatibility.isQ()) {
            return a(context, bitmap, str);
        }
        boolean z = true;
        File file = new File(Environment.getExternalStorageDirectory(), "temp");
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            z = false;
        } catch (IOException e2) {
            e2.printStackTrace();
            z = false;
        }
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file2)));
        return z;
    }
}
