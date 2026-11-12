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
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: loaded from: classes19.dex */
public class TintUtils {
    private static final String a = "TintUtils";

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

    public static Drawable getCheckedDrawable(Drawable drawable, @ColorInt int i, @ColorInt int i2) {
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
        Drawable drawableMutate = DrawableCompat.wrap(stateListDrawableNewDrawable).mutate();
        DrawableCompat.setTintList(drawableMutate, colorStateList);
        return drawableMutate;
    }

    public static Drawable getCheckedDrawableResId(Context context, @DrawableRes int i, @ColorRes int i2, @ColorRes int i3) {
        return getCheckedDrawable(ContextCompat.getDrawable(context, i), ContextCompat.getColor(context, i2), ContextCompat.getColor(context, i3));
    }

    public static Drawable getEnableDrawable(Drawable drawable, @ColorInt int i, @ColorInt int i2) {
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
        Drawable drawableMutate = DrawableCompat.wrap(stateListDrawableNewDrawable).mutate();
        DrawableCompat.setTintList(drawableMutate, colorStateList);
        return drawableMutate;
    }

    public static Drawable getEnableDrawableResId(Context context, @DrawableRes int i, @ColorRes int i2, @ColorRes int i3) {
        return getEnableDrawable(ContextCompat.getDrawable(context, i), ContextCompat.getColor(context, i2), ContextCompat.getColor(context, i3));
    }

    public static Drawable getPressedDrawable(Drawable drawable, @ColorInt int i, @ColorInt int i2) {
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
        Drawable drawableMutate = DrawableCompat.wrap(stateListDrawableNewDrawable).mutate();
        DrawableCompat.setTintList(drawableMutate, colorStateList);
        return drawableMutate;
    }

    public static Drawable getPressedDrawableResId(Context context, @DrawableRes int i, @ColorRes int i2, @ColorRes int i3) {
        return getPressedDrawable(ContextCompat.getDrawable(context, i), ContextCompat.getColor(context, i2), ContextCompat.getColor(context, i3));
    }

    public static Drawable getPressedStateListDrawable(Drawable drawable, @ColorInt int i) {
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
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTintList(drawableWrap, colorStateList);
        return drawableWrap;
    }

    public static Drawable tintDrawable(Context context, @DrawableRes int i, ColorStateList colorStateList) {
        Drawable drawableWrap = DrawableCompat.wrap(context.getResources().getDrawable(i));
        DrawableCompat.setTintList(drawableWrap, colorStateList);
        return drawableWrap;
    }

    public static void tintDrawable(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawableWrap = DrawableCompat.wrap(imageView.getDrawable().mutate());
        DrawableCompat.setTintList(drawableWrap, colorStateList);
        DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
        imageView.setImageDrawable(drawableWrap);
    }

    public static Drawable tintDrawable(Drawable drawable, @ColorInt int i) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        DrawableCompat.setTint(drawableWrap, i);
        return drawableWrap;
    }

    public static void tintDrawable(ImageView imageView, @ColorInt int i) {
        Drawable drawableWrap = DrawableCompat.wrap(imageView.getDrawable().mutate());
        DrawableCompat.setTint(drawableWrap, i);
        DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
        imageView.setImageDrawable(drawableWrap);
    }
}
