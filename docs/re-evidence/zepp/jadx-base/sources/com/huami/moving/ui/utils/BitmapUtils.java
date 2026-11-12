package com.huami.moving.ui.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class BitmapUtils {
    private static final String a = "BitmapUtils";

    private BitmapUtils() {
    }

    public static int calculateInSampleSize(int i, int i2, BitmapFactory.Options options) {
        double dFloor;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (i4 <= i2 && i3 <= i) {
            return 1;
        }
        if (i2 == 0) {
            dFloor = Math.floor(i3 / i);
        } else {
            if (i != 0) {
                return Math.max((int) Math.floor(i4 / i2), (int) Math.floor(i3 / i));
            }
            dFloor = Math.floor(i4 / i2);
        }
        return (int) dFloor;
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
        if (z) {
            width = Math.max(bitmap.getWidth(), bitmap2.getWidth());
            iMax = bitmap.getHeight() + bitmap2.getHeight();
        } else {
            width = bitmap.getWidth() + bitmap2.getWidth();
            iMax = Math.max(bitmap.getHeight(), bitmap2.getHeight());
        }
        HMLog.d(a, "pic2 isRecycle==" + bitmap2.isRecycled() + ",pic1==" + bitmap.isRecycled(), new Object[0]);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, iMax, Bitmap.Config.ARGB_8888);
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
        return bitmapCreateBitmap;
    }

    public static Bitmap createOvalBitmapWithIconCenterInside(Bitmap bitmap, int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Paint paint = new Paint(1);
        paint.setColor(i2);
        Paint paint2 = new Paint(1);
        float f = i;
        canvas.drawOval(new RectF(0.0f, 0.0f, f, f), paint);
        canvas.drawBitmap(bitmap, (i - width) / 2, (i - height) / 2, paint2);
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public static Bitmap createOvalBitmapWithText(String str, float f) {
        int i = (int) (10.0f * f);
        int i2 = (int) ((f * 15.0f) + 0.5f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setTextSize(i);
        paint.setTextAlign(Paint.Align.CENTER);
        Paint paint2 = new Paint(1);
        paint2.setColor(Color.argb(255, 32, 35, 61));
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i3 = ((i2 - fontMetricsInt.bottom) - fontMetricsInt.top) / 2;
        float f2 = i2;
        canvas.drawOval(new RectF(0.0f, 0.0f, f2, f2), paint2);
        canvas.drawText(str, f2 / 2.0f, i3, paint);
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public static Bitmap decodeBitmapFromByteArray(byte[] bArr, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        int iRound = i3 > i2 ? Math.round(i3 / i2) : 1;
        if (i4 / iRound > i) {
            iRound = Math.round(i4 / i);
        }
        options.inSampleSize = iRound;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    public static Bitmap decodeBitmapFromFile(String str) {
        return BitmapFactory.decodeFile(str, new BitmapFactory.Options());
    }

    public static Bitmap decodeSampledBitmapFromFile(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = calculateInSampleSize(i, i2, options);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static void displayRoundImage(Context context, String str, ImageView imageView) {
        Glide.with(context).load(str).apply(RequestOptions.bitmapTransform(new CircleCrop())).into(imageView);
    }

    public static Bitmap getScaleBitmap(Bitmap bitmap, int i) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        float f = i / width;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Bitmap getUnViewBitmap(View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static Bitmap getViewBitmap(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getDrawingCache(true));
        view.setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    public static Bitmap getViewGroupBitmap(ViewGroup viewGroup) {
        int height = 0;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            height += viewGroup.getChildAt(i).getHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewGroup.getWidth(), height, Bitmap.Config.ARGB_8888);
        viewGroup.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static Bitmap joinBitmap(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        if (bitmap == null && bitmap2 == null) {
            return null;
        }
        if (bitmap == null) {
            return bitmap2;
        }
        if (bitmap2 == null) {
            return bitmap;
        }
        HMLog.d(a, "pic2 isRecycle==" + bitmap2.isRecycled() + ",pic1==" + bitmap.isRecycled(), new Object[0]);
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Paint paint = new Paint();
        Canvas canvas = new Canvas(bitmapCopy);
        canvas.drawBitmap(bitmap2, (float) i, (float) i2, paint);
        canvas.save();
        canvas.restore();
        return bitmapCopy;
    }

    public static Bitmap joinConnectBitmap(Bitmap bitmap, Bitmap bitmap2, boolean z, int i, int i2) {
        return joinConnectBitmap(bitmap, bitmap2, z, i, i2, Color.parseColor("#00000000"));
    }

    public static boolean saveBitmapToFile(String str, Bitmap bitmap, int i) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                boolean zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
                try {
                    fileOutputStream.close();
                    return zCompress;
                } catch (IOException unused) {
                    return zCompress;
                }
            } catch (Exception unused2) {
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th3) {
            fileOutputStream = null;
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    public static boolean saveBitmapToFileWithOptimizeCompress(String str, Bitmap bitmap) throws Throwable {
        Bitmap bitmapCreateScaledBitmap;
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        boolean zCompress = false;
        if (bitmap.getWidth() > 1280 && bitmap.getHeight() > 1280 && (bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 1280, 1280, false)) != null) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            bitmap = bitmapCreateScaledBitmap;
        }
        int allocationByteCount = bitmap.getAllocationByteCount() > 4194304 ? (int) ((4194304 / bitmap.getAllocationByteCount()) * 100.0f) : 100;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, allocationByteCount, fileOutputStream2);
                    fileOutputStream2.close();
                } catch (Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    return zCompress;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused3) {
            }
        } catch (Exception unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return zCompress;
    }

    public static boolean saveBitmapToPngFile(String str, Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        boolean zCompress = false;
        if (!TextUtils.isEmpty(str) && bitmap != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        zCompress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                    } catch (Exception unused) {
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        return zCompress;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (Exception unused4) {
            } catch (Throwable th3) {
                fileOutputStream = null;
                th = th3;
            }
        }
        return zCompress;
    }

    public static Bitmap joinConnectBitmap(Bitmap bitmap, Bitmap bitmap2, boolean z, int i, int i2, int i3) {
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
        if (z) {
            width = Math.max(bitmap.getWidth(), bitmap2.getWidth());
            iMax = bitmap2.getHeight() + i2;
        } else {
            width = bitmap2.getWidth() + i;
            iMax = Math.max(bitmap.getHeight(), bitmap2.getHeight());
        }
        HMLog.d(a, "pic2 isRecycle==" + bitmap2.isRecycled() + ",pic1==" + bitmap.isRecycled(), new Object[0]);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, iMax, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(i3);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (z) {
            canvas.drawBitmap(bitmap2, 0.0f, i2, paint);
        } else {
            canvas.drawBitmap(bitmap2, i, 0.0f, paint);
        }
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }
}
