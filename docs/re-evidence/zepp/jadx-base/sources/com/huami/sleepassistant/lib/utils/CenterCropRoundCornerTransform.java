package com.huami.sleepassistant.lib.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J*\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014R\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/sleepassistant/lib/utils/CenterCropRoundCornerTransform;", "Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "pool", "Landroid/graphics/Bitmap;", "source", "a", "toTransform", "", "outWidth", "outHeight", "transform", "c", LogUtil.I, "radius", "<init>", "(I)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class CenterCropRoundCornerTransform extends CenterCrop {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int radius;

    public CenterCropRoundCornerTransform(int i) {
        this.radius = i;
    }

    private final Bitmap a(BitmapPool pool, Bitmap source) {
        if (source == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = pool.get(source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888);
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(source, tileMode, tileMode));
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, source.getWidth(), source.getHeight());
        int i = this.radius;
        canvas.drawRoundRect(rectF, i, i, paint);
        return bitmapCreateBitmap;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.CenterCrop, com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    @Nullable
    public Bitmap transform(@NotNull BitmapPool pool, @NotNull Bitmap toTransform, int outWidth, int outHeight) {
        return a(pool, super.transform(pool, toTransform, outWidth, outHeight));
    }
}
