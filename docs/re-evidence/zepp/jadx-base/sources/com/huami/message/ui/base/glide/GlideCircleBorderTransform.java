package com.huami.message.ui.base.glide;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.security.MessageDigest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J(\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0015\u001a\u00020\tH\u0016R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010 \u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/huami/message/ui/base/glide/GlideCircleBorderTransform;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "bitmapPool", "Landroid/graphics/Bitmap;", "source", "a", "pool", "toTransform", "", "outWidth", "outHeight", "transform", "Ljava/security/MessageDigest;", "messageDigest", "", "updateDiskCacheKey", "", "o", "", "equals", "hashCode", "", "F", "borderWidth", "b", LogUtil.I, "borderColor", "", "kotlin.jvm.PlatformType", "c", "Ljava/lang/String;", "ID", "Landroid/graphics/Paint;", GoogleApiAvailabilityLight.a, "Landroid/graphics/Paint;", "mBorderPaint", "<init>", "(FI)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class GlideCircleBorderTransform extends BitmapTransformation {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float borderWidth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int borderColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String ID = GlideCircleBorderTransform.class.getName();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Paint mBorderPaint;

    public GlideCircleBorderTransform(float f, int i) {
        this.borderWidth = f;
        this.borderColor = i;
        Paint paint = new Paint();
        this.mBorderPaint = paint;
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(f);
        paint.setDither(true);
    }

    private final Bitmap a(BitmapPool bitmapPool, Bitmap source) {
        int iMin = Math.min(source.getWidth(), source.getHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(source, (source.getWidth() - iMin) / 2, (source.getHeight() - iMin) / 2, iMin, iMin);
        Bitmap bitmapCreateBitmap2 = bitmapPool.get(iMin, iMin, Bitmap.Config.ARGB_8888);
        if (bitmapCreateBitmap2 == null) {
            bitmapCreateBitmap2 = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        float f = iMin / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        canvas.drawCircle(f, f, f - (this.borderWidth / 2), this.mBorderPaint);
        return bitmapCreateBitmap2;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(@Nullable Object o) {
        return o instanceof GlideCircleBorderTransform;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.ID.hashCode();
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    @NotNull
    public Bitmap transform(@NotNull BitmapPool pool, @NotNull Bitmap toTransform, int outWidth, int outHeight) {
        return a(pool, toTransform);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NotNull MessageDigest messageDigest) {
        messageDigest.update(this.ID.getBytes(Key.CHARSET));
    }
}
