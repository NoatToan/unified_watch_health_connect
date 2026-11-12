package com.xiaomi.hm.health.baseutil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public class BlurBitmapUtil {
    private static final float BITMAP_SCALE = 0.3f;
    private static final float BLUR_RADIUS = 25.0f;

    public static Bitmap blurBitmap(Context context, Bitmap bitmap) {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.3f), Math.round(bitmap.getHeight() * 0.3f), false);
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
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        renderScriptCreate.destroy();
        return darkenBitmap(bitmapCreateBitmap);
    }

    private static Bitmap darkenBitmap(Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new LightingColorFilter(-8421505, 0));
        canvas.drawBitmap(bitmap, new Matrix(), paint);
        return bitmap;
    }
}
