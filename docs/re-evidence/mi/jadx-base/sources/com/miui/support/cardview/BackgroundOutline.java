package com.miui.support.cardview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.Keep;
import androidx.annotation.RequiresApi;
import defpackage.d4j;

/* JADX INFO: loaded from: classes.dex */
@Keep
@RequiresApi(21)
@TargetApi(21)
public class BackgroundOutline extends ViewOutlineProvider {
    private float mAlpha;

    public BackgroundOutline(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, d4j.f15078b);
        this.mAlpha = typedArrayObtainStyledAttributes.getFloat(d4j.c, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return;
        }
        view.getBackground().getOutline(outline);
        outline.setAlpha(this.mAlpha);
    }

    public BackgroundOutline of(float f) {
        return new BackgroundOutline(f);
    }

    private BackgroundOutline(float f) {
        this.mAlpha = f;
    }
}
