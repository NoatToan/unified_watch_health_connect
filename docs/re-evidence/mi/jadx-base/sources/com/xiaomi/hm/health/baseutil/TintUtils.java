package com.xiaomi.hm.health.baseutil;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.ImageView;
import defpackage.k47;
import defpackage.ni4;

/* JADX INFO: loaded from: classes11.dex */
public class TintUtils {
    private static final String TAG = "TintUtils";

    public static Bitmap bitmapGray(Bitmap bitmap, float f) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static Drawable drawableGray(Drawable drawable, float f) {
        drawable.mutate();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(f);
        drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        return drawable;
    }

    public static Drawable getCheckedDrawable(Drawable drawable, int i, int i2) {
        int[] iArr = {i, i2};
        int[][] iArr2 = {new int[]{R.attr.state_checked}, new int[]{-16842912}};
        ColorStateList colorStateList = new ColorStateList(iArr2, iArr);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(iArr2[0], drawable);
        stateListDrawable.addState(iArr2[1], drawable);
        Drawable.ConstantState constantState = stateListDrawable.getConstantState();
        StateListDrawable stateListDrawableNewDrawable = stateListDrawable;
        if (constantState != null) {
            stateListDrawableNewDrawable = constantState.newDrawable();
        }
        Drawable drawableMutate = k47.r(stateListDrawableNewDrawable).mutate();
        k47.o(drawableMutate, colorStateList);
        return drawableMutate;
    }

    public static Drawable getCheckedDrawableResId(Context context, int i, int i2, int i3) {
        return getCheckedDrawable(ni4.e(context, i), ni4.c(context, i2), ni4.c(context, i3));
    }

    public static Drawable getEnableDrawable(Drawable drawable, int i, int i2) {
        int[] iArr = {i, i2};
        int[][] iArr2 = {new int[]{-16842910}, new int[0]};
        ColorStateList colorStateList = new ColorStateList(iArr2, iArr);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(iArr2[0], drawable);
        stateListDrawable.addState(iArr2[1], drawable);
        Drawable.ConstantState constantState = stateListDrawable.getConstantState();
        StateListDrawable stateListDrawableNewDrawable = stateListDrawable;
        if (constantState != null) {
            stateListDrawableNewDrawable = constantState.newDrawable();
        }
        Drawable drawableMutate = k47.r(stateListDrawableNewDrawable).mutate();
        k47.o(drawableMutate, colorStateList);
        return drawableMutate;
    }

    public static Drawable getEnableDrawableResId(Context context, int i, int i2, int i3) {
        return getEnableDrawable(ni4.e(context, i), ni4.c(context, i2), ni4.c(context, i3));
    }

    public static Drawable getPressedDrawable(Drawable drawable, int i, int i2) {
        int[] iArr = {i, i2};
        int[][] iArr2 = {new int[]{R.attr.state_pressed}, new int[0]};
        ColorStateList colorStateList = new ColorStateList(iArr2, iArr);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(iArr2[0], drawable);
        stateListDrawable.addState(iArr2[1], drawable);
        Drawable.ConstantState constantState = stateListDrawable.getConstantState();
        StateListDrawable stateListDrawableNewDrawable = stateListDrawable;
        if (constantState != null) {
            stateListDrawableNewDrawable = constantState.newDrawable();
        }
        Drawable drawableMutate = k47.r(stateListDrawableNewDrawable).mutate();
        k47.o(drawableMutate, colorStateList);
        return drawableMutate;
    }

    public static Drawable getPressedDrawableResId(Context context, int i, int i2, int i3) {
        return getPressedDrawable(ni4.e(context, i), ni4.c(context, i2), ni4.c(context, i3));
    }

    public static Drawable getPressedStateListDrawable(Drawable drawable, int i) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return drawable;
        }
        Drawable drawableMutate = constantState.newDrawable().mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawableMutate);
        stateListDrawable.addState(new int[0], drawable);
        return stateListDrawable;
    }

    public static Drawable tintDrawable(Drawable drawable, ColorStateList colorStateList) {
        Drawable drawableR = k47.r(drawable);
        k47.o(drawableR, colorStateList);
        return drawableR;
    }

    public static Drawable tintDrawable(Context context, int i, ColorStateList colorStateList) {
        Drawable drawableR = k47.r(context.getResources().getDrawable(i));
        k47.o(drawableR, colorStateList);
        return drawableR;
    }

    public static void tintDrawable(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawableR = k47.r(imageView.getDrawable().mutate());
        k47.o(drawableR, colorStateList);
        k47.p(drawableR, PorterDuff.Mode.SRC_IN);
        imageView.setImageDrawable(drawableR);
    }

    public static Drawable tintDrawable(Drawable drawable, int i) {
        Drawable drawableR = k47.r(drawable.mutate());
        k47.n(drawableR, i);
        return drawableR;
    }

    public static void tintDrawable(ImageView imageView, int i) {
        Drawable drawableR = k47.r(imageView.getDrawable().mutate());
        k47.n(drawableR, i);
        k47.p(drawableR, PorterDuff.Mode.SRC_IN);
        imageView.setImageDrawable(drawableR);
    }
}
