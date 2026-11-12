package com.xiaomi.hm.health.relation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes21.dex */
public class Blur {
    private static final String a = "Blur";

    @SuppressLint({"NewApi"})
    public static Bitmap fastblur(Context context, Bitmap bitmap, int i) {
        Bitmap bitmapCopy;
        if (bitmap.isMutable()) {
            bitmapCopy = bitmap;
        } else {
            bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
            if (bitmapCopy == null) {
                return null;
            }
            HMLog.i(a, "Copy inBitmap for outBitmap!!", new Object[0]);
        }
        RenderScript renderScriptCreate = RenderScript.create(context);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        scriptIntrinsicBlurCreate.setRadius(i);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        allocationCreateTyped.copyTo(bitmapCopy);
        return bitmapCopy;
    }
}
