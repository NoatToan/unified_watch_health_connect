package com.huami.treadmill.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.TransformationUtils;
import com.huami.tools.analytics.DbUtils;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J*\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0014R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/treadmill/util/GlideRoundTransform;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "pool", "Landroid/graphics/Bitmap;", "source", "a", "", "getId", "Ljava/security/MessageDigest;", "messageDigest", "", "updateDiskCacheKey", "toTransform", "", "outWidth", "outHeight", "transform", "", "F", "radius", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "corner", "<init>", "(Landroid/content/Context;F)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class GlideRoundTransform extends BitmapTransformation {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float radius;

    public GlideRoundTransform(@NotNull Context context, float f) {
        this.radius = DensityUtils.INSTANCE.dip2px(context, f);
    }

    private final Bitmap a(BitmapPool pool, Bitmap source) {
        if (source == null) {
            return null;
        }
        Bitmap bitmap = pool.get(source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(source, tileMode, tileMode));
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, source.getWidth(), source.getHeight());
        float f = this.radius;
        canvas.drawRoundRect(rectF, f, f, paint);
        return bitmap;
    }

    @Nullable
    public final String getId() {
        return Intrinsics.stringPlus(GlideRoundTransform.class.getName(), Integer.valueOf(c.roundToInt(this.radius)));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    @Nullable
    public Bitmap transform(@NotNull BitmapPool pool, @NotNull Bitmap toTransform, int outWidth, int outHeight) {
        return a(pool, TransformationUtils.centerCrop(pool, toTransform, outWidth, outHeight));
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NotNull MessageDigest messageDigest) {
    }
}
