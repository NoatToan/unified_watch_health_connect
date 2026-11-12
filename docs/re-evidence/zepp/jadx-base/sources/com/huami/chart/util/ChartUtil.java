package com.huami.chart.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.ChartDataList;

/* JADX INFO: loaded from: classes6.dex */
public class ChartUtil {
    public static float calculateTextHeight(Paint paint, String str) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static float calculateTextWidth(Paint paint, String str) {
        return paint.measureText(str);
    }

    public static float dp2px(Context context, float f) {
        return context.getResources().getDisplayMetrics().density * f;
    }

    public static Index getMultiLineCurrentDownIndex(HMChart hMChart, ChartDataList chartDataList) {
        if (hMChart == null || chartDataList == null) {
            return null;
        }
        return hMChart.getHmDataCacheCenter().getMultiIndexByPosition((hMChart.getInteractiveManager().getxOffset() + hMChart.getInteractiveManager().getCurrentDownX()) / hMChart.getInteractiveManager().getScaleFactorX(), 0.0f, chartDataList);
    }

    public static Index getPointLineCurrentDownIndex(HMChart hMChart, ChartDataList chartDataList) {
        return getMultiLineCurrentDownIndex(hMChart, chartDataList);
    }

    public static boolean isEquals(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static boolean isRtl(HMChart hMChart) {
        return (hMChart == null || hMChart.getParent() == null || hMChart.isIgnoreRTL() || hMChart.getParent().getLayoutDirection() != 1) ? false : true;
    }

    public static int sp2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static Bitmap tintBitmap(Bitmap bitmap, int i) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }
}
