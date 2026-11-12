package com.huami.util.bitmap;

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
import android.util.Log;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
final class a implements BlurBitmapApi {
    private static final String a = "BlurBitmapUtil";
    private static final float b = 0.3f;
    private static final float c = 25.0f;

    private static Bitmap a(Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new LightingColorFilter(-8421505, 0));
        canvas.drawBitmap(bitmap, new Matrix(), paint);
        return bitmap;
    }

    @Override // com.huami.util.bitmap.BlurBitmapApi
    public Bitmap blurBitmap(Context context, Bitmap bitmap) {
        return blurBitmap(context, bitmap, 0.3f, 25.0f);
    }

    @Override // com.huami.util.bitmap.BlurBitmapApi
    @Nullable
    public Bitmap blurBitmap(Context context, Bitmap bitmap, float f, float f2) {
        if (context == null) {
            Log.e(a, "context is null");
            return null;
        }
        if (bitmap == null) {
            Log.e(a, "image is null");
            return null;
        }
        if (f == 0.0f || f > 1.0f) {
            Log.e(a, String.format("scale value error --> [ %f ]", Float.valueOf(f)));
            return null;
        }
        if (f2 == 0.0f || f2 > 25.0f) {
            Log.e(a, String.format("radius value error --> [ %f ]", Float.valueOf(f2)));
            return null;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.3f), Math.round(bitmap.getHeight() * 0.3f), false);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
        RenderScript renderScriptCreate = RenderScript.create(context);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(25.0f);
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
        return a(bitmapCreateBitmap);
    }
}
