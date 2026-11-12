package com.huami.core.device.wifi_settings.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004JN\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013J0\u0010\u0019\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/core/device/wifi_settings/utils/ViewUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", Constant.PAI_KEY_DAILY_PAI, "dp2px", "sp", "sp2px", "Landroid/graphics/Canvas;", "canvas", "x", "y", AnimatorViewWrapper.SCALE, "", "horizonCenter", "verticalCenter", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Paint;", "paint", "", "drawBitmapCenter", "", "text", "drawTextCenter", "Landroid/graphics/drawable/Drawable;", "drawable", "drawable2Bitmap", "<init>", "()V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class ViewUtils {

    @NotNull
    public static final ViewUtils INSTANCE = new ViewUtils();

    private ViewUtils() {
    }

    public final float dp2px(@NotNull Context context, float dp) {
        return TypedValue.applyDimension(1, dp, context.getResources().getDisplayMetrics());
    }

    public final void drawBitmapCenter(@NotNull Canvas canvas, float x, float y, float scale, boolean horizonCenter, boolean verticalCenter, @NotNull Bitmap bitmap, @Nullable Paint paint) {
        if (horizonCenter) {
            x -= (bitmap.getWidth() * scale) / 2;
        }
        if (verticalCenter) {
            y -= (bitmap.getHeight() * scale) / 2;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(scale, scale);
        matrix.postTranslate(x, y);
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    public final void drawTextCenter(@NotNull Canvas canvas, float x, float y, @NotNull String text, @Nullable Paint paint) {
        if (paint == null) {
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i = fontMetricsInt.bottom;
        canvas.drawText(text, x, y + (((i - fontMetricsInt.top) / 2) - i), paint);
    }

    @NotNull
    public final Bitmap drawable2Bitmap(@NotNull Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        Bitmap bitmapCreateBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final float sp2px(@NotNull Context context, float sp) {
        return TypedValue.applyDimension(2, sp, context.getResources().getDisplayMetrics());
    }
}
