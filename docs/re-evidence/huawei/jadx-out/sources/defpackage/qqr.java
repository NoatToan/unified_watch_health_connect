package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.TransformationUtils;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes16.dex */
public class qqr extends CenterCrop {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f46683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f46684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46685c = true;
    private float d;
    private float e;
    private float j;

    @Override // com.bumptech.glide.load.resource.bitmap.CenterCrop, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }

    public qqr(Context context, int i) {
        this.f46684b = i;
    }

    public qqr(float f, float f2, float f3, float f4) {
        this.f46683a = f;
        this.j = f2;
        this.e = f3;
        this.d = f4;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.CenterCrop, com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        if (this.f46685c) {
            return TransformationUtils.roundedCorners(bitmapPool, bitmap, this.f46683a, this.j, this.d, this.e);
        }
        return a(bitmapPool, super.transform(bitmapPool, bitmap, i, i2));
    }

    private Bitmap a(BitmapPool bitmapPool, Bitmap bitmap) {
        if (bitmap == null || bitmapPool == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = bitmapPool.get(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        float f = this.f46684b;
        canvas.drawRoundRect(rectF, f, f, paint);
        return bitmapCreateBitmap;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.CenterCrop, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.CenterCrop, com.bumptech.glide.load.Key
    public int hashCode() {
        return super.hashCode();
    }
}
