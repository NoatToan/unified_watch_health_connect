package com.xiaomi.smarthome.screenshot;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ScreenshotUtils {
    private ScreenshotUtils() {
    }

    public static final Bitmap compressBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int i = 100;
        while (byteArrayOutputStream.toByteArray().length / 1024 > 100 && (i = i - 10) >= 10) {
        }
        return BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
    }

    public static final Bitmap getScreenshot(View view) {
        if (view == null) {
            return null;
        }
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(loadBitmapFromView(view, true));
        view.setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    public static Bitmap loadBitmapFromView(View view, boolean z) {
        if (view == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static final Bitmap mergeBitmap(List<Bitmap> list, int i) {
        return mergeBitmap(list, i, 0);
    }

    public static final void saveBitmap(Bitmap bitmap, String str) throws Throwable {
        if (bitmap == null || TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                        fileOutputStream2.close();
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        if (fileOutputStream == null) {
                        } else {
                            fileOutputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    public static final Bitmap mergeBitmap(List<Bitmap> list, int i, int i2) {
        Rect rect;
        RectF rectF;
        if (list == null || list.size() <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(list.get(0).getWidth(), i, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Bitmap bitmap = list.get(i3);
            float height = bitmap.getHeight() * i3;
            if (i3 != size - 1 || i2 <= 0) {
                rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                rectF = new RectF(0.0f, height, bitmap.getWidth(), bitmap.getHeight() + height);
            } else {
                rect = new Rect(0, bitmap.getHeight() - i2, bitmap.getWidth(), bitmap.getHeight());
                rectF = new RectF(0.0f, height, bitmap.getWidth(), i2 + height);
            }
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        }
        return bitmapCreateBitmap;
    }
}
