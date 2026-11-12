package com.huami.pai.ext;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0016\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n\u001a\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005\u001a\u0012\u0010\u0011\u001a\u00020\b*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u0012\u0010\u0012\u001a\u00020\b*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u0014\u0010\u0015\u001a\u00020\b*\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\u001a\u0016\u0010\u0017\u001a\u00020\b*\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\bH\u0000\u001a\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\n2\u0006\u0010\u0018\u001a\u00020\bH\u0000¨\u0006\u001b"}, d2 = {"Landroid/view/View;", "", "show", "", "setVisible", "", Constant.PAI_KEY_DAILY_PAI, "dip2px", "", WorkoutExercises.DIP, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "sp", "sp2px", "Landroid/graphics/Paint;", "", "str", "getStrWidth", "getStrHeight", "", "alpha", "addAlpha", "colorRes", "color", "drawableId", "Landroid/graphics/Bitmap;", "getBitmapFromVectorDrawable", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class ViewExKt {
    public static final int addAlpha(int i, double d) {
        return Color.argb((int) (((double) ((i >> 24) & 255)) * d), (i >> 16) & 255, (i >> 8) & 255, i & 255);
    }

    public static final int color(@NotNull Context context, @ColorRes int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    public static final float dip2px(@NotNull View view, float f) {
        return TypedValue.applyDimension(1, f, view.getContext().getResources().getDisplayMetrics());
    }

    @Nullable
    public static final Bitmap getBitmapFromVectorDrawable(@NotNull Context context, int i) {
        Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 21) {
            drawable = DrawableCompat.wrap(drawable).mutate();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        return bitmapCreateBitmap;
    }

    public static final int getStrHeight(@NotNull Paint paint, @NotNull String str) {
        if (str.length() == 0) {
            return 0;
        }
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static final int getStrWidth(@NotNull Paint paint, @NotNull String str) {
        if (str.length() == 0) {
            return 0;
        }
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }

    public static final void setVisible(@NotNull View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public static final float sp2px(@NotNull Context context, float f) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    public static final float dip2px(int i, @NotNull Context context) {
        return (i * context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}
