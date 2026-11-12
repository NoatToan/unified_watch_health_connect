package com.xiaomi.fitness.extensions;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u001a2\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\u0011"}, d2 = {"drawBitmapRelative", "", "Landroid/graphics/Canvas;", "layoutDirection", "", "bitmap", "Landroid/graphics/Bitmap;", "left", "", "top", "paint", "Landroid/graphics/Paint;", "drawTextRelative", "text", "", "x", "y", "widget_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CanvasExtendKt {
    public static final void drawBitmapRelative(@NotNull Canvas canvas, int i, @NotNull Bitmap bitmap, float f, float f2, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (i == 0) {
            canvas.drawBitmap(bitmap, f, f2, paint);
        } else if (i != 1) {
            canvas.drawBitmap(bitmap, f, f2, paint);
        } else {
            canvas.drawBitmap(bitmap, -f, f2, paint);
        }
    }

    public static final void drawTextRelative(@NotNull Canvas canvas, int i, @NotNull String text, float f, float f2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (i == 0) {
            canvas.drawText(text, f, f2, paint);
        } else if (i != 1) {
            canvas.drawText(text, f, f2, paint);
        } else {
            canvas.drawText(text, -f, f2, paint);
        }
    }
}
