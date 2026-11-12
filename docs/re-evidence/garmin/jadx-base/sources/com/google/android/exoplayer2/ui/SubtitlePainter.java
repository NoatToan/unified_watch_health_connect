package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes14.dex */
final class SubtitlePainter {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private static final String TAG = "SubtitlePainter";
    private int backgroundColor;
    private final Paint bitmapPaint;
    private Rect bitmapRect;
    private float bottomPaddingFraction;
    private Bitmap cueBitmap;
    private float cueBitmapHeight;
    private float cueLine;
    private int cueLineAnchor;
    private int cueLineType;
    private float cuePosition;
    private int cuePositionAnchor;
    private float cueSize;
    private CharSequence cueText;
    private Layout.Alignment cueTextAlignment;
    private float cueTextSizePx;
    private float defaultTextSizePx;
    private int edgeColor;
    private StaticLayout edgeLayout;
    private int edgeType;
    private int foregroundColor;
    private final float outlineWidth;
    private int parentBottom;
    private int parentLeft;
    private int parentRight;
    private int parentTop;
    private final float shadowOffset;
    private final float shadowRadius;
    private final float spacingAdd;
    private final float spacingMult;
    private StaticLayout textLayout;
    private int textLeft;
    private int textPaddingX;
    private final TextPaint textPaint;
    private int textTop;
    private int windowColor;
    private final Paint windowPaint;

    public SubtitlePainter(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{android.R.attr.lineSpacingExtra, android.R.attr.lineSpacingMultiplier}, 0, 0);
        this.spacingAdd = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.spacingMult = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.outlineWidth = fRound;
        this.shadowRadius = fRound;
        this.shadowOffset = fRound;
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.windowPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.bitmapPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean areCharSequencesEqual(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    private void drawBitmapLayout(Canvas canvas) {
        canvas.drawBitmap(this.cueBitmap, (Rect) null, this.bitmapRect, this.bitmapPaint);
    }

    private void drawLayout(Canvas canvas, boolean z14) {
        if (z14) {
            drawTextLayout(canvas);
            return;
        }
        Assertions.checkNotNull(this.bitmapRect);
        Assertions.checkNotNull(this.cueBitmap);
        drawBitmapLayout(canvas);
    }

    private void drawTextLayout(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.textLayout;
        StaticLayout staticLayout2 = this.edgeLayout;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.textLeft, this.textTop);
        if (Color.alpha(this.windowColor) > 0) {
            this.windowPaint.setColor(this.windowColor);
            canvas2 = canvas;
            canvas2.drawRect(-this.textPaddingX, 0.0f, staticLayout.getWidth() + this.textPaddingX, staticLayout.getHeight(), this.windowPaint);
        } else {
            canvas2 = canvas;
        }
        int i14 = this.edgeType;
        if (i14 == 1) {
            this.textPaint.setStrokeJoin(Paint.Join.ROUND);
            this.textPaint.setStrokeWidth(this.outlineWidth);
            this.textPaint.setColor(this.edgeColor);
            this.textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i14 == 2) {
            TextPaint textPaint = this.textPaint;
            float f14 = this.shadowRadius;
            float f15 = this.shadowOffset;
            textPaint.setShadowLayer(f14, f15, f15, this.edgeColor);
        } else if (i14 == 3 || i14 == 4) {
            boolean z14 = i14 == 3;
            int i15 = z14 ? -1 : this.edgeColor;
            int i16 = z14 ? this.edgeColor : -1;
            float f16 = this.shadowRadius / 2.0f;
            this.textPaint.setColor(this.foregroundColor);
            this.textPaint.setStyle(Paint.Style.FILL);
            float f17 = -f16;
            this.textPaint.setShadowLayer(this.shadowRadius, f17, f17, i15);
            staticLayout2.draw(canvas2);
            this.textPaint.setShadowLayer(this.shadowRadius, f16, f16, i16);
        }
        this.textPaint.setColor(this.foregroundColor);
        this.textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    private void setupBitmapLayout() {
        int iRound;
        float f14;
        int i14;
        float f15;
        Bitmap bitmap = this.cueBitmap;
        int i15 = this.parentRight;
        int i16 = this.parentLeft;
        int i17 = this.parentBottom;
        int i18 = this.parentTop;
        float f16 = i15 - i16;
        float f17 = (this.cuePosition * f16) + i16;
        float f18 = i17 - i18;
        float f19 = (this.cueLine * f18) + i18;
        int iRound2 = Math.round(f16 * this.cueSize);
        float f22 = this.cueBitmapHeight;
        if (f22 != -3.4028235E38f) {
            iRound = Math.round(f18 * f22);
        } else {
            iRound = Math.round((bitmap.getHeight() / bitmap.getWidth()) * iRound2);
        }
        int i19 = this.cuePositionAnchor;
        if (i19 != 2) {
            if (i19 == 1) {
                f14 = iRound2 / 2;
            }
            int iRound3 = Math.round(f17);
            i14 = this.cueLineAnchor;
            if (i14 == 2) {
                if (i14 == 1) {
                    f15 = iRound / 2;
                }
                int iRound4 = Math.round(f19);
                this.bitmapRect = new Rect(iRound3, iRound4, iRound2 + iRound3, iRound + iRound4);
            }
            f15 = iRound;
            f19 -= f15;
            int iRound5 = Math.round(f19);
            this.bitmapRect = new Rect(iRound3, iRound5, iRound2 + iRound3, iRound + iRound5);
        }
        f14 = iRound2;
        f17 -= f14;
        int iRound6 = Math.round(f17);
        i14 = this.cueLineAnchor;
        if (i14 == 2) {
            if (i14 == 1) {
                f15 = iRound / 2;
            }
            int iRound7 = Math.round(f19);
            this.bitmapRect = new Rect(iRound6, iRound7, iRound2 + iRound6, iRound + iRound7);
        }
        f15 = iRound;
        f19 -= f15;
        int iRound8 = Math.round(f19);
        this.bitmapRect = new Rect(iRound6, iRound8, iRound2 + iRound6, iRound + iRound8);
    }

    private void setupTextLayout() {
        int iMax;
        int iMin;
        int iRound;
        CharSequence charSequence = this.cueText;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.cueText);
        int i14 = this.parentRight - this.parentLeft;
        int i15 = this.parentBottom - this.parentTop;
        this.textPaint.setTextSize(this.defaultTextSizePx);
        int i16 = (int) ((this.defaultTextSizePx * INNER_PADDING_RATIO) + 0.5f);
        int i17 = i16 * 2;
        int i18 = i14 - i17;
        float f14 = this.cueSize;
        float f15 = -3.4028235E38f;
        if (f14 != -3.4028235E38f) {
            i18 = (int) (i18 * f14);
        }
        int i19 = i18;
        String str = TAG;
        if (i19 <= 0) {
            Log.w(TAG, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.cueTextSizePx > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.cueTextSizePx), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.edgeType == 1) {
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class);
            int length = foregroundColorSpanArr.length;
            int i24 = 0;
            while (i24 < length) {
                spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i24]);
                i24++;
                f15 = f15;
            }
        }
        float f16 = f15;
        if (Color.alpha(this.backgroundColor) > 0) {
            int i25 = this.edgeType;
            if (i25 == 0 || i25 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.cueTextAlignment;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i19, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLayout = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.textLayout.getLineCount();
        int iMax2 = 0;
        int i26 = 0;
        while (i26 < lineCount) {
            iMax2 = Math.max((int) Math.ceil(this.textLayout.getLineWidth(i26)), iMax2);
            i26++;
            str = str;
        }
        String str2 = str;
        if (this.cueSize == f16 || iMax2 >= i19) {
            i19 = iMax2;
        }
        int i27 = i19 + i17;
        float f17 = this.cuePosition;
        if (f17 != f16) {
            int iRound2 = Math.round(i14 * f17);
            int i28 = this.parentLeft;
            int i29 = iRound2 + i28;
            int i30 = this.cuePositionAnchor;
            if (i30 == 1) {
                i29 = ((i29 * 2) - i27) / 2;
            } else if (i30 == 2) {
                i29 -= i27;
            }
            iMax = Math.max(i29, i28);
            iMin = Math.min(i27 + iMax, this.parentRight);
        } else {
            iMax = ((i14 - i27) / 2) + this.parentLeft;
            iMin = iMax + i27;
        }
        int i34 = iMin - iMax;
        if (i34 <= 0) {
            Log.w(str2, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f18 = this.cueLine;
        if (f18 != f16) {
            if (this.cueLineType == 0) {
                iRound = Math.round(i15 * f18) + this.parentTop;
                int i35 = this.cueLineAnchor;
                if (i35 == 2) {
                    iRound -= height;
                } else if (i35 == 1) {
                    iRound = ((iRound * 2) - height) / 2;
                }
            } else {
                int lineBottom = this.textLayout.getLineBottom(0) - this.textLayout.getLineTop(0);
                float f19 = this.cueLine;
                if (f19 >= 0.0f) {
                    iRound = Math.round(f19 * lineBottom) + this.parentTop;
                } else {
                    iRound = Math.round((f19 + 1.0f) * lineBottom) + this.parentBottom;
                    iRound -= height;
                }
            }
            int i36 = iRound + height;
            int i37 = this.parentBottom;
            if (i36 > i37) {
                iRound = i37 - height;
            } else {
                int i38 = this.parentTop;
                if (iRound < i38) {
                    iRound = i38;
                }
            }
        } else {
            iRound = (this.parentBottom - height) - ((int) (i15 * this.bottomPaddingFraction));
        }
        this.textLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i34, alignment2, this.spacingMult, this.spacingAdd, true);
        this.edgeLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, i34, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLeft = iMax;
        this.textTop = iRound;
        this.textPaddingX = i16;
    }

    public void draw(Cue cue, CaptionStyleCompat captionStyleCompat, float f14, float f15, float f16, Canvas canvas, int i14, int i15, int i16, int i17) {
        int i18;
        boolean z14 = cue.bitmap == null;
        if (!z14) {
            i18 = -16777216;
        } else if (TextUtils.isEmpty(cue.text)) {
            return;
        } else {
            i18 = cue.windowColorSet ? cue.windowColor : captionStyleCompat.windowColor;
        }
        if (areCharSequencesEqual(this.cueText, cue.text) && Util.areEqual(this.cueTextAlignment, cue.textAlignment) && this.cueBitmap == cue.bitmap && this.cueLine == cue.line && this.cueLineType == cue.lineType && Util.areEqual(Integer.valueOf(this.cueLineAnchor), Integer.valueOf(cue.lineAnchor)) && this.cuePosition == cue.position && Util.areEqual(Integer.valueOf(this.cuePositionAnchor), Integer.valueOf(cue.positionAnchor)) && this.cueSize == cue.size && this.cueBitmapHeight == cue.bitmapHeight && this.foregroundColor == captionStyleCompat.foregroundColor && this.backgroundColor == captionStyleCompat.backgroundColor && this.windowColor == i18 && this.edgeType == captionStyleCompat.edgeType && this.edgeColor == captionStyleCompat.edgeColor && Util.areEqual(this.textPaint.getTypeface(), captionStyleCompat.typeface) && this.defaultTextSizePx == f14 && this.cueTextSizePx == f15 && this.bottomPaddingFraction == f16 && this.parentLeft == i14 && this.parentTop == i15 && this.parentRight == i16 && this.parentBottom == i17) {
            drawLayout(canvas, z14);
            return;
        }
        this.cueText = cue.text;
        this.cueTextAlignment = cue.textAlignment;
        this.cueBitmap = cue.bitmap;
        this.cueLine = cue.line;
        this.cueLineType = cue.lineType;
        this.cueLineAnchor = cue.lineAnchor;
        this.cuePosition = cue.position;
        this.cuePositionAnchor = cue.positionAnchor;
        this.cueSize = cue.size;
        this.cueBitmapHeight = cue.bitmapHeight;
        this.foregroundColor = captionStyleCompat.foregroundColor;
        this.backgroundColor = captionStyleCompat.backgroundColor;
        this.windowColor = i18;
        this.edgeType = captionStyleCompat.edgeType;
        this.edgeColor = captionStyleCompat.edgeColor;
        this.textPaint.setTypeface(captionStyleCompat.typeface);
        this.defaultTextSizePx = f14;
        this.cueTextSizePx = f15;
        this.bottomPaddingFraction = f16;
        this.parentLeft = i14;
        this.parentTop = i15;
        this.parentRight = i16;
        this.parentBottom = i17;
        if (z14) {
            Assertions.checkNotNull(this.cueText);
            setupTextLayout();
        } else {
            Assertions.checkNotNull(this.cueBitmap);
            setupBitmapLayout();
        }
        drawLayout(canvas, z14);
    }
}
