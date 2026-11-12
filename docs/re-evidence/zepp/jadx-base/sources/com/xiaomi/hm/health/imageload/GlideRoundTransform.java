package com.xiaomi.hm.health.imageload;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes21.dex */
public class GlideRoundTransform extends GlideTransformation {
    private float a;
    private boolean b;

    public GlideRoundTransform() {
        this(4.0f);
    }

    private Bitmap a(BitmapPool bitmapPool, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = bitmapPool.get(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), this.b ? this.a * bitmap.getWidth() : this.a, this.b ? this.a * bitmap.getWidth() : this.a, paint);
        return bitmapCreateBitmap;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        return a(bitmapPool, bitmap);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }

    public GlideRoundTransform(float f) {
        this.a = 0.0f;
        this.b = false;
        this.a = Resources.getSystem().getDisplayMetrics().density * f;
    }

    public GlideRoundTransform(float f, boolean z) {
        this.a = 0.0f;
        this.b = false;
        if (z) {
            this.a = f;
            this.b = true;
        } else {
            this.a = Resources.getSystem().getDisplayMetrics().density * f;
        }
    }
}
