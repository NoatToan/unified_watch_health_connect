package com.autonavi.base.ae.gmap.glyph;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.autonavi.base.amap.mapcore.tools.GLConvertUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class GlyphLoader {
    public static long createGlyphLoader() {
        return nativeCreateGlyphLoader();
    }

    private static String decodeUnicode(short s) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append((char) s);
        return stringBuffer.toString();
    }

    public static void destroyGlyphLoader(long j) {
        nativeDestroyGlyphLoader(j);
    }

    private static FontMetricsRequestParam genFontMetricsParam(byte[] bArr) {
        FontMetricsRequestParam fontMetricsRequestParam = new FontMetricsRequestParam();
        fontMetricsRequestParam.fFontSize = GLConvertUtil.getInt(bArr, 0) * 0.001f;
        fontMetricsRequestParam.nFontStyleCode = GLConvertUtil.getInt(bArr, 4);
        int i = 12;
        if (1 == GLConvertUtil.getInt(bArr, 8)) {
            int i2 = GLConvertUtil.getInt(bArr, 12);
            fontMetricsRequestParam.strName = new String(bArr, 16, i2);
            i = i2 + 16;
        }
        fontMetricsRequestParam.languageArr = new String(bArr, i + 4, GLConvertUtil.getInt(bArr, i));
        return fontMetricsRequestParam;
    }

    private static GlyphRequestParam genGlyphRequestParam(byte[] bArr) {
        GlyphRequestParam glyphRequestParam = new GlyphRequestParam();
        int i = GLConvertUtil.getInt(bArr, 0);
        glyphRequestParam.strBuffer = new String(bArr, 4, i);
        int i2 = i + 4;
        Font font = new Font();
        font.nFontStyleCode = GLConvertUtil.getInt(bArr, i2);
        int i3 = i2 + 4;
        font.nFontSize = GLConvertUtil.getInt(bArr, i3);
        int i4 = i3 + 4;
        int i5 = GLConvertUtil.getInt(bArr, i4);
        int i6 = i4 + 4;
        font.strName = new String(bArr, i6, i5);
        int i7 = i6 + i5;
        FontMetrics fontMetrics = new FontMetrics();
        int i8 = GLConvertUtil.getInt(bArr, i7);
        int i9 = i7 + 4;
        fontMetrics.fAscent = i8 * 0.001f;
        int i10 = GLConvertUtil.getInt(bArr, i9);
        int i11 = i9 + 4;
        fontMetrics.fDescent = i10 * 0.001f;
        int i12 = GLConvertUtil.getInt(bArr, i11);
        int i13 = i11 + 4;
        fontMetrics.fLeading = i12 * 0.001f;
        int i14 = GLConvertUtil.getInt(bArr, i13);
        int i15 = i13 + 4;
        fontMetrics.fHeight = i14 * 0.001f;
        font.fontMetrics = fontMetrics;
        glyphRequestParam.font = font;
        glyphRequestParam.drawingMode = GLConvertUtil.getInt(bArr, i15);
        int i16 = i15 + 4;
        int i17 = GLConvertUtil.getInt(bArr, i16);
        int i18 = i16 + 4;
        glyphRequestParam.strokeWidth = i17 * 0.001f;
        int i19 = GLConvertUtil.getInt(bArr, i18);
        int i20 = i18 + 4;
        glyphRequestParam.languageArr = new String(bArr, i20, i19);
        int i21 = GLConvertUtil.getInt(bArr, i20);
        int i22 = i20 + 4;
        if (1 == i21) {
            GlyphMetrics glyphMetrics = new GlyphMetrics();
            glyphMetrics.nWidth = GLConvertUtil.getInt(bArr, i22);
            int i23 = i22 + 4;
            glyphMetrics.nHeight = GLConvertUtil.getInt(bArr, i23);
            int i24 = i23 + 4;
            int i25 = GLConvertUtil.getInt(bArr, i24);
            int i26 = i24 + 4;
            glyphMetrics.fLeft = i25 * 0.001f;
            glyphMetrics.fTop = GLConvertUtil.getInt(bArr, i26) * 0.001f;
            glyphMetrics.fAdvance = GLConvertUtil.getInt(bArr, i26 + 4) * 0.001f;
            glyphRequestParam.fGlyphMetrics = glyphMetrics;
        }
        return glyphRequestParam;
    }

    private static FontMetrics getFontMetrics(byte[] bArr) {
        FontMetricsRequestParam fontMetricsRequestParamGenFontMetricsParam = genFontMetricsParam(bArr);
        Paint.FontMetrics fontMetrics = newTextPaint(new FontStyle(fontMetricsRequestParamGenFontMetricsParam.nFontStyleCode), fontMetricsRequestParamGenFontMetricsParam.fFontSize, fontMetricsRequestParamGenFontMetricsParam.languageArr, false, 0.0f).getFontMetrics();
        FontMetrics fontMetrics2 = new FontMetrics();
        fontMetrics2.bSuccess = true;
        fontMetrics2.fAscent = Math.abs(fontMetrics.ascent);
        fontMetrics2.fDescent = Math.abs(fontMetrics.descent);
        fontMetrics2.fLeading = Math.abs(fontMetrics.leading);
        fontMetrics2.fHeight = Math.abs(fontMetrics.ascent) + Math.abs(fontMetrics.descent);
        return fontMetrics2;
    }

    private static GlyphMetrics getGlyphMetrics(byte[] bArr) {
        GlyphRequestParam glyphRequestParamGenGlyphRequestParam = genGlyphRequestParam(bArr);
        return loadGlyphMetrics(glyphRequestParamGenGlyphRequestParam.strBuffer, new FontStyle(glyphRequestParamGenGlyphRequestParam.font.nFontStyleCode), glyphRequestParamGenGlyphRequestParam.font.nFontSize, glyphRequestParamGenGlyphRequestParam.languageArr, glyphRequestParamGenGlyphRequestParam.drawingMode == 1, glyphRequestParamGenGlyphRequestParam.strokeWidth);
    }

    private static GlyphRaster getGlyphRaster(byte[] bArr) {
        GlyphRequestParam glyphRequestParamGenGlyphRequestParam = genGlyphRequestParam(bArr);
        return loadGlyphRaster(glyphRequestParamGenGlyphRequestParam.strBuffer, new FontStyle(glyphRequestParamGenGlyphRequestParam.font.nFontStyleCode), glyphRequestParamGenGlyphRequestParam.font.nFontSize, glyphRequestParamGenGlyphRequestParam.languageArr, glyphRequestParamGenGlyphRequestParam.drawingMode == 1, glyphRequestParamGenGlyphRequestParam.strokeWidth);
    }

    private static GlyphMetrics loadGlyphMetrics(String str, FontStyle fontStyle, float f, String str2, boolean z, float f2) {
        GlyphMetrics glyphMetrics = new GlyphMetrics();
        if (fontStyle == null || TextUtils.isEmpty(str)) {
            return glyphMetrics;
        }
        try {
            TextPaint textPaintNewTextPaint = newTextPaint(fontStyle, f, str2, z, f2);
            Rect rect = new Rect();
            textPaintNewTextPaint.getTextBounds(str, 0, str.length(), rect);
            if (rect.width() == 0 && rect.height() == 0) {
                float fMeasureText = textPaintNewTextPaint.measureText(" ", 0, 1);
                float fAbs = Math.abs(textPaintNewTextPaint.getFontMetrics().ascent) + Math.abs(textPaintNewTextPaint.getFontMetrics().descent);
                rect.top = 0;
                rect.left = 0;
                rect.right = (int) fMeasureText;
                rect.bottom = (int) fAbs;
            }
            if (z && f2 > 0.0f) {
                float f3 = f2 / 2.0f;
                rect.top = (int) (rect.top - f3);
                rect.left = (int) (rect.left - f3);
                rect.right = (int) (rect.right + f3);
                rect.bottom = (int) (rect.bottom + f3);
            }
            glyphMetrics.bSuccess = true;
            glyphMetrics.fLeft = rect.left;
            glyphMetrics.fTop = Math.abs(textPaintNewTextPaint.getFontMetrics().ascent) - Math.abs(rect.top);
            glyphMetrics.nWidth = rect.width();
            glyphMetrics.nHeight = rect.height();
            glyphMetrics.fAdvance = textPaintNewTextPaint.measureText(str);
        } catch (Exception unused) {
            glyphMetrics.bSuccess = false;
        }
        return glyphMetrics;
    }

    private static GlyphRaster loadGlyphRaster(String str, FontStyle fontStyle, float f, String str2, boolean z, float f2) {
        GlyphRaster glyphRaster = new GlyphRaster();
        if (fontStyle == null || TextUtils.isEmpty(str)) {
            return glyphRaster;
        }
        try {
            TextPaint textPaintNewTextPaint = newTextPaint(fontStyle, f, str2, z, f2);
            Rect rect = new Rect();
            textPaintNewTextPaint.getTextBounds(str, 0, str.length(), rect);
            if (rect.width() == 0 && rect.height() == 0) {
                float fMeasureText = textPaintNewTextPaint.measureText(" ", 0, 1);
                float fAbs = Math.abs(textPaintNewTextPaint.getFontMetrics().ascent) + Math.abs(textPaintNewTextPaint.getFontMetrics().descent);
                rect.right = (int) fMeasureText;
                rect.bottom = (int) fAbs;
                rect.left = 0;
                rect.top = 0;
            }
            if (z && f2 > 0.0f) {
                float f3 = f2 / 2.0f;
                rect.top = (int) (rect.top - f3);
                rect.left = (int) (rect.left - f3);
                rect.right = (int) (rect.right + f3);
                rect.bottom = (int) (rect.bottom + f3);
            }
            if (!rect.isEmpty()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ALPHA_8);
                new Canvas(bitmapCreateBitmap).drawText(str, 0 - rect.left, 0 - rect.top, textPaintNewTextPaint);
                int iWidth = rect.width() * rect.height();
                byte[] bArr = new byte[iWidth];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                glyphRaster.bitmapWidth = rect.width();
                glyphRaster.bitmapHeight = rect.height();
                glyphRaster.bitmapPixelMode = 0;
                glyphRaster.bitmapSize = iWidth;
                bitmapCreateBitmap.copyPixelsToBuffer(byteBufferWrap);
                bitmapCreateBitmap.recycle();
                glyphRaster.bitmapBuffer = bArr;
                glyphRaster.bSuccess = true;
            }
        } catch (Exception unused) {
            glyphRaster.bSuccess = false;
        }
        return glyphRaster;
    }

    private static native long nativeCreateGlyphLoader();

    private static native void nativeDestroyGlyphLoader(long j);

    private static TextPaint newTextPaint(FontStyle fontStyle, float f, String str, boolean z, float f2) {
        boolean z2;
        TextPaint textPaint = new TextPaint();
        if (fontStyle == null) {
            return textPaint;
        }
        textPaint.setColor(-1);
        int i = 1;
        textPaint.setAntiAlias(true);
        textPaint.setFilterBitmap(true);
        textPaint.setTextSize(f);
        textPaint.setTextAlign(Paint.Align.LEFT);
        if (z) {
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(f2);
        } else {
            textPaint.setStyle(Paint.Style.FILL);
        }
        int slant = fontStyle.getSlant();
        boolean z3 = slant != 0 && (slant == 1 || slant == 2);
        switch (fontStyle.getWeight()) {
            case 0:
            case 100:
            case 200:
            case 300:
            case 400:
            default:
                z2 = false;
                break;
            case 500:
            case 600:
            case 700:
            case 800:
            case 900:
            case 1000:
                z2 = true;
                break;
        }
        if (z2 && z3) {
            i = 3;
        } else if (!z2) {
            i = z3 ? 2 : 0;
        }
        textPaint.setTypeface(str.isEmpty() ? Typeface.create(Typeface.DEFAULT, i) : Typeface.create(str, i));
        return textPaint;
    }

    private static String decodeUnicode(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
