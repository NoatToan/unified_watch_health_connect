package com.mapbox.maps.text;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes3.dex */
@Keep
class LocalGlyphRasterizer {
    private final Canvas canvas;
    private final FontMetrics fontMetrics;
    private final GlyphMetrics glyphMetrics;
    private final Paint paint;
    private boolean useSystemFont;
    private final float sdfScale = 2.0f;
    private final int borderSize = Math.round(6.0f);
    private final Rect bounds = new Rect();

    @Keep
    public class FontMetrics {
        float ascender;
        float descender;
        int fontID;

        private FontMetrics() {
        }
    }

    @Keep
    public class GlyphMetrics {
        float advance;
        float ascender;
        float descender;
        Bitmap glyphBitmap;
        float height;
        float left;
        float top;
        float width;

        private GlyphMetrics() {
        }
    }

    public LocalGlyphRasterizer() {
        this.glyphMetrics = new GlyphMetrics();
        this.fontMetrics = new FontMetrics();
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        paint.setTextSize(48.0f);
        this.canvas = new Canvas();
        this.useSystemFont = false;
    }

    public FontMetrics getFontMetrics(String str, boolean z14) {
        boolean z15 = this.useSystemFont;
        Paint paint = this.paint;
        if (z15) {
            paint.setTypeface(z14 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        } else {
            paint.setTypeface(Typeface.create(str, z14 ? 1 : 0));
        }
        Paint.FontMetrics fontMetrics = this.paint.getFontMetrics();
        this.fontMetrics.ascender = Math.abs(fontMetrics.top) / 2.0f;
        this.fontMetrics.descender = Math.abs(fontMetrics.bottom) / 2.0f;
        this.fontMetrics.fontID = this.paint.getTypeface().hashCode();
        return this.fontMetrics;
    }

    public GlyphMetrics getGlyphMetrics(String str, boolean z14, char c14) {
        String strValueOf = String.valueOf(c14);
        boolean z15 = this.useSystemFont;
        Paint paint = this.paint;
        if (z15) {
            paint.setTypeface(z14 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        } else {
            paint.setTypeface(Typeface.create(str, z14 ? 1 : 0));
        }
        this.paint.getTextBounds(strValueOf, 0, 1, this.bounds);
        GlyphMetrics glyphMetrics = this.glyphMetrics;
        Rect rect = this.bounds;
        glyphMetrics.left = rect.left / 2.0f;
        glyphMetrics.width = rect.width() / 2.0f;
        this.glyphMetrics.height = this.bounds.height() / 2.0f;
        this.glyphMetrics.top = Math.abs(this.bounds.top) / 2.0f;
        this.glyphMetrics.advance = this.paint.measureText(strValueOf, 0, 1) / 2.0f;
        if (this.bounds.width() > 0 && this.bounds.height() > 0) {
            this.glyphMetrics.glyphBitmap = Bitmap.createBitmap((this.borderSize * 2) + this.bounds.width(), (this.borderSize * 2) + this.bounds.height(), Bitmap.Config.ARGB_8888);
            this.canvas.setBitmap(this.glyphMetrics.glyphBitmap);
            int i14 = this.borderSize;
            Rect rect2 = this.bounds;
            float f14 = i14 - rect2.left;
            float f15 = i14 - rect2.top;
            this.canvas.drawColor(-1);
            this.canvas.drawText(strValueOf, f14, f15, this.paint);
        }
        return this.glyphMetrics;
    }

    public void useSystemFont() {
        this.useSystemFont = true;
    }
}
