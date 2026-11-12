package com.amap.api.col.p0003sl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.TextOptions;

/* JADX INFO: loaded from: classes21.dex */
public final class cs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Paint f2321a = new Paint();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Rect f2322b = new Rect();

    public static float a(int i, boolean z) {
        if (z) {
            if (i != 1) {
                return i != 2 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }
        if (i != 8) {
            return i != 16 ? 0.5f : 1.0f;
        }
        return 0.0f;
    }

    public static MarkerOptions a(TextOptions textOptions) {
        if (textOptions == null) {
            return null;
        }
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(textOptions.getPosition());
        markerOptions.visible(textOptions.isVisible());
        markerOptions.zIndex(textOptions.getZIndex());
        markerOptions.rotateAngle(textOptions.getRotate());
        markerOptions.icon(b(textOptions));
        markerOptions.anchor(a(textOptions.getAlignX(), true), a(textOptions.getAlignY(), false));
        return markerOptions;
    }

    public static BitmapDescriptor b(TextOptions textOptions) {
        if (textOptions == null) {
            return null;
        }
        f2321a.setTypeface(textOptions.getTypeface());
        f2321a.setSubpixelText(true);
        f2321a.setAntiAlias(true);
        f2321a.setStrokeWidth(5.0f);
        f2321a.setStrokeCap(Paint.Cap.ROUND);
        f2321a.setTextSize(textOptions.getFontSize());
        f2321a.setTextAlign(Paint.Align.CENTER);
        f2321a.setColor(textOptions.getFontColor());
        Paint.FontMetrics fontMetrics = f2321a.getFontMetrics();
        int i = (int) (fontMetrics.descent - fontMetrics.ascent);
        int i2 = (int) (((i - fontMetrics.bottom) - fontMetrics.top) / 2.0f);
        if (textOptions.getText() != null) {
            f2321a.getTextBounds(textOptions.getText(), 0, textOptions.getText().length(), f2322b);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(f2322b.width() + 6, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(textOptions.getBackgroundColor());
        if (textOptions.getText() != null) {
            canvas.drawText(textOptions.getText(), f2322b.centerX() + 3, i2, f2321a);
        }
        return BitmapDescriptorFactory.fromBitmap(bitmapCreateBitmap);
    }
}
