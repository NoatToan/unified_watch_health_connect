package com.huami.watch.companion.util;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.huami.watch.util.FilesUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.StorageUtil;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes16.dex */
public class AvatarTools {
    private static final String a = "AvatarTools";
    private static final int b = 800;

    public class a implements Comparator<File> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            try {
                String name = file.getName();
                String name2 = file.getName();
                String[] strArrSplit = name.split("_");
                String[] strArrSplit2 = name2.split("_");
                if (strArrSplit != null && strArrSplit2 != null && strArrSplit[0] != null && strArrSplit2[0] != null) {
                    long j = Long.parseLong(strArrSplit[0]) - Long.parseLong(strArrSplit2[0]);
                    if (j > 0) {
                        return -1;
                    }
                    return j == 0 ? 0 : 1;
                }
            } catch (Exception unused) {
            }
            return -1;
        }
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 > i2 && i7 / i5 > i) {
                i5 *= 2;
            }
            for (long j = (i4 * i3) / i5; j > i * i2 * 2; j /= 2) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public static String checkSourceDuplicate(Context context, String str) {
        File watchFaceBgDir = StorageUtil.getWatchFaceBgDir(context);
        if (watchFaceBgDir != null && watchFaceBgDir.exists() && watchFaceBgDir.isDirectory()) {
            File[] fileArrListFiles = watchFaceBgDir.listFiles();
            Arrays.sort(fileArrListFiles, new a());
            for (File file : fileArrListFiles) {
                String name = file.getName();
                Log.d(a, name, new Object[0]);
                if (!file.isDirectory() && name.contains(Md5FileUtils.getMD5String(str))) {
                    String absolutePath = file.getAbsolutePath();
                    Log.d(a, "source is duplicate.", new Object[0]);
                    return absolutePath;
                }
            }
        }
        return null;
    }

    public static void clearCropFiles(Context context) {
        Log.d(a, "Clear all crop files.", new Object[0]);
        File watchFaceBgDir = StorageUtil.getWatchFaceBgDir(context);
        if (watchFaceBgDir != null && watchFaceBgDir.exists() && watchFaceBgDir.isDirectory()) {
            FilesUtil.delete(watchFaceBgDir);
        }
    }

    public static Bitmap clipToRoundBitmap(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Log.d(a, "round bitmap w=" + bitmap.getWidth() + ", h=" + bitmap.getHeight(), new Object[0]);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect();
        RectF rectF = new RectF();
        if (bitmap.getWidth() > bitmap.getHeight()) {
            rect.left = (bitmap.getWidth() - iMin) / 2;
            rect.top = 0;
            rect.right = bitmap.getWidth() - rect.left;
            rect.bottom = bitmap.getHeight();
        } else if (bitmap.getWidth() < bitmap.getHeight()) {
            rect.left = 0;
            rect.top = (bitmap.getHeight() - iMin) / 2;
            rect.right = bitmap.getWidth();
            rect.bottom = bitmap.getHeight() - rect.top;
        } else {
            rect.left = 0;
            rect.top = 0;
            rect.right = bitmap.getWidth();
            rect.bottom = bitmap.getHeight();
        }
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        float f = iMin;
        rectF.right = f;
        rectF.bottom = f;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-16777216);
        float f2 = (iMin / 2) - 1;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rectF, paint);
        return Bitmap.createScaledBitmap(bitmapCreateBitmap, i, i2, true);
    }

    public static Bitmap decodeBitmapFromFileDescriptor(FileDescriptor fileDescriptor, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }

    public static Bitmap decodeFile(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap bitmapDecodeStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BitmapFactory.decodeStream(fileInputStream, null, options);
            fileInputStream.close();
            int i = options.outHeight;
            int iPow = (i > 800 || options.outWidth > 800) ? (int) Math.pow(2.0d, (int) Math.round(Math.log(800.0d / ((double) Math.max(i, options.outWidth))) / Math.log(0.5d))) : 1;
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = iPow;
            FileInputStream fileInputStream2 = new FileInputStream(file);
            bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream2, null, options2);
            fileInputStream2.close();
            return bitmapDecodeStream;
        } catch (Exception e) {
            e.printStackTrace();
            return bitmapDecodeStream;
        }
    }

    public static Bitmap decodeSampledBitmapFromFile(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap decodeUriAsBitmap(Context context, Uri uri) {
        try {
            return BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Drawable getAvatarDrawableFromUri(Context context, Uri uri) {
        Bitmap bitmapDecodeUriAsBitmap = decodeUriAsBitmap(context, uri);
        RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(context.getResources(), bitmapDecodeUriAsBitmap);
        roundedBitmapDrawableCreate.setCornerRadius(bitmapDecodeUriAsBitmap.getHeight() / 2.0f);
        return roundedBitmapDrawableCreate;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Cursor cursorQuery;
        ?? r7 = 0;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            cursorQuery.close();
                            return string;
                        }
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        Log.e(a, "GetDataColumnFail", e, new Object[0]);
                        if (cursorQuery != null) {
                        }
                        return null;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                th = th;
                r7 = context;
                if (r7 != 0) {
                    r7.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r7 != 0) {
                r7.close();
            }
            throw th;
        }
        return null;
    }

    public static Uri getImageUri(Context context) {
        return StorageUtil.getFileUri(context, StorageUtil.getImageCaptureFile(context));
    }

    public static Uri getWatchFaceCroppedImageUri(Context context, Uri uri) {
        return StorageUtil.toUri(StorageUtil.getWatchFaceBgFile(context, System.currentTimeMillis() + "_" + Md5FileUtils.getMD5String(uri.toString()) + "_" + StorageUtil.WATCH_FACE_BG_NAME));
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
