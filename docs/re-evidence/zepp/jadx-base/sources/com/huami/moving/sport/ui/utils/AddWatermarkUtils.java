package com.huami.moving.sport.ui.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.huami.moving.ui.utils.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J&\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u001e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b¨\u0006\u0014"}, d2 = {"Lcom/huami/moving/sport/ui/utils/AddWatermarkUtils;", "", "", "text", "Landroid/graphics/Paint;", "paint", "", "b", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/graphics/Bitmap;", "bitmap", "", "showNoMapGpsTip", "addTextWatermark", "watermark", "addImageWatermark", "<init>", "()V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class AddWatermarkUtils {

    @NotNull
    public static final AddWatermarkUtils INSTANCE = new AddWatermarkUtils();

    private AddWatermarkUtils() {
    }

    private final int a(String text, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(text, 0, text.length(), rect);
        return rect.height();
    }

    private final int b(String text, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(text, 0, text.length(), rect);
        return rect.width();
    }

    @NotNull
    public final Bitmap addImageWatermark(@NotNull Context context, @NotNull Bitmap bitmap, @NotNull Bitmap watermark) {
        int width = bitmap.getWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(watermark, (width - watermark.getWidth()) - ViewUtils.dp2px(context, 10.0f), ViewUtils.dp2px(context, 30.0f), (Paint) null);
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }

    @NotNull
    public final Bitmap addTextWatermark(@NotNull Context context, @NotNull Bitmap bitmap, @NotNull String text, boolean showNoMapGpsTip) {
        int width = bitmap.getWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setTextSize(ViewUtils.sp2px(context, 15.0f));
        canvas.drawText(text, (width - b(text, paint)) / 2, a(text, paint) + ViewUtils.dp2px(context, showNoMapGpsTip ? 42.0f : 6.0f), paint);
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }
}
