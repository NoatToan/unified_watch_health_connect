package com.huami.treadmill.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/huami/treadmill/util/BlurBitmapUtil;", "", "Landroid/graphics/Bitmap;", "bm", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "image", "blurBitmap", "", "F", "BITMAP_SCALE", "b", "BLUR_RADIUS", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class BlurBitmapUtil {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final float BITMAP_SCALE = 0.3f;

    @NotNull
    public static final BlurBitmapUtil INSTANCE = new BlurBitmapUtil();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static float BLUR_RADIUS = 20.0f;

    private BlurBitmapUtil() {
    }

    private final Bitmap a(Bitmap bm) {
        Canvas canvas = new Canvas(bm);
        Paint paint = new Paint();
        paint.setColorFilter(new LightingColorFilter(-8421505, 0));
        canvas.drawBitmap(bm, new Matrix(), paint);
        return bm;
    }

    @NotNull
    public final Bitmap blurBitmap(@Nullable Context context, @NotNull Bitmap image) {
        SportDataHelper.Companion companion = SportDataHelper.INSTANCE;
        if (companion.getInstance().getMIsRouterLine()) {
            BLUR_RADIUS = 25.0f;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(image, Math.round(image.getWidth() * 0.3f), Math.round(image.getHeight() * 0.3f), false);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
        RenderScript renderScriptCreate = RenderScript.create(context);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(BLUR_RADIUS);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        if (!bitmapCreateScaledBitmap.isRecycled()) {
            bitmapCreateScaledBitmap.recycle();
        }
        if (!image.isRecycled()) {
            image.recycle();
        }
        renderScriptCreate.destroy();
        if (companion.getInstance().getMIsRouterLine()) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap2.eraseColor(Color.parseColor("#96000000"));
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, new Paint());
            canvas.save();
            canvas.restore();
        }
        return a(bitmapCreateBitmap);
    }
}
