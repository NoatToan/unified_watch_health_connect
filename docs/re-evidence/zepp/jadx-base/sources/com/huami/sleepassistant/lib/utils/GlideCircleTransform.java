package com.huami.sleepassistant.lib.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import java.security.MessageDigest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class GlideCircleTransform extends BitmapTransformation {
    private static Bitmap a(BitmapPool pool, Bitmap source) {
        if (source == null) {
            return null;
        }
        int iMin = Math.min(source.getWidth(), source.getHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(source, (source.getWidth() - iMin) / 2, (source.getHeight() - iMin) / 2, iMin, iMin);
        Bitmap bitmap = pool.get(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        float f = iMin / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        return bitmap;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(@NotNull BitmapPool pool, @NotNull Bitmap toTransform, int outWidth, int outHeight) {
        return a(pool, toTransform);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NotNull MessageDigest messageDigest) {
    }
}
