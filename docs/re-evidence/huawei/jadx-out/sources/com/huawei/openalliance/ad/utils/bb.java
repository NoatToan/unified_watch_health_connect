package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.BaseObj;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class bb {
    private static void a(BaseObj baseObj) {
        if (baseObj != null) {
            baseObj.destroy();
        }
    }

    public static Drawable a(Context context, Drawable drawable, float f, float f2) {
        String str;
        Drawable drawableA = null;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            drawableA = a(context, a(context, bd.a(drawable), f, f2));
            hw.a("BlurUtil", "blurDrawable: duration %s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            return drawableA;
        } catch (OutOfMemoryError unused) {
            str = "OOM blur image";
            hw.c("BlurUtil", str);
            return drawableA;
        } catch (Throwable th) {
            str = "blur drawable exception " + th.getClass().getSimpleName();
            hw.c("BlurUtil", str);
            return drawableA;
        }
    }

    private static Drawable a(Context context, Bitmap bitmap) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009a A[DONT_GENERATE] */
    private static Bitmap a(Context context, Bitmap bitmap, float f, float f2) {
        Object th;
        Bitmap bitmapCreateScaledBitmap;
        Allocation allocation;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate;
        Allocation allocationCreateFromBitmap;
        if (f <= 0.0f || f > 25.0f || f2 < 1.0f) {
            throw new IllegalArgumentException("ensure blurRadius in (0, 25] and scaleRatio >= 1");
        }
        RenderScript renderScript = null;
        Allocation allocationCreateTyped = null;
        try {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() / f2), Math.round(bitmap.getHeight() / f2), false);
            try {
                RenderScript renderScriptCreate = RenderScript.create(context);
                try {
                    scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    try {
                        allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                        try {
                            allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                            scriptIntrinsicBlurCreate.setRadius(f);
                            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                            allocationCreateTyped.copyTo(bitmapCreateScaledBitmap);
                            a(allocationCreateFromBitmap);
                            a(allocationCreateTyped);
                            a(scriptIntrinsicBlurCreate);
                            if (renderScriptCreate != null) {
                                renderScriptCreate.destroy();
                            }
                            return bitmapCreateScaledBitmap;
                        } catch (Throwable th2) {
                            th = th2;
                            Allocation allocation2 = allocationCreateTyped;
                            renderScript = renderScriptCreate;
                            allocation = allocation2;
                            try {
                                hw.c("BlurUtil", "blur drawable exception" + th.getClass().getSimpleName());
                                return bitmapCreateScaledBitmap;
                            } finally {
                                a(allocationCreateFromBitmap);
                                a(allocation);
                                a(scriptIntrinsicBlurCreate);
                                if (renderScript != null) {
                                    renderScript.destroy();
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        allocationCreateFromBitmap = null;
                        renderScript = renderScriptCreate;
                        allocation = null;
                        hw.c("BlurUtil", "blur drawable exception" + th.getClass().getSimpleName());
                        return bitmapCreateScaledBitmap;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    scriptIntrinsicBlurCreate = null;
                }
            } catch (Throwable th5) {
                th = th5;
                allocation = null;
                scriptIntrinsicBlurCreate = null;
                allocationCreateFromBitmap = null;
                hw.c("BlurUtil", "blur drawable exception" + th.getClass().getSimpleName());
                return bitmapCreateScaledBitmap;
            }
        } catch (Throwable th6) {
            th = th6;
            bitmapCreateScaledBitmap = null;
        }
    }
}
