package com.huami.chart.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "resId", "", "targetWidth", "targetHeight", "Landroid/graphics/Bitmap;", "changeShimmerBgBitmapSize", "chart_release"}, k = 2, mv = {1, 5, 1})
public final class ShimmerHelperKt {
    @NotNull
    public static final Bitmap changeShimmerBgBitmapSize(@NotNull Context context, int i, float f, float f2) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i);
        int width = bitmapDecodeResource.getWidth();
        int height = bitmapDecodeResource.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(f / width, f2 / height);
        return Bitmap.createBitmap(bitmapDecodeResource, 0, 0, width, height, matrix, true);
    }
}
