package com.github.mikephil.charting.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.charting.formatter.DefaultValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Utils {
    public static final double DEG2RAD = 0.017453292519943295d;
    public static final float FDEG2RAD = 0.017453292f;
    private static int mMaximumFlingVelocity = 8000;
    private static DisplayMetrics mMetrics = null;
    private static int mMinimumFlingVelocity = 50;
    public static final double DOUBLE_EPSILON = Double.longBitsToDouble(1);
    public static final float FLOAT_EPSILON = Float.intBitsToFloat(1);
    private static Rect mCalcTextHeightRect = new Rect();
    private static Paint.FontMetrics mFontMetrics = new Paint.FontMetrics();
    private static Rect mCalcTextSizeRect = new Rect();
    private static final int[] POW_10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    private static ValueFormatter mDefaultValueFormatter = generateDefaultValueFormatter();
    private static Rect mDrawableBoundsCache = new Rect();
    private static Rect mDrawTextRectBuffer = new Rect();
    private static Paint.FontMetrics mFontMetricsBuffer = new Paint.FontMetrics();

    public static int calcTextHeight(Paint paint, String str) {
        Rect rect = mCalcTextHeightRect;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static void calcTextSize(Paint paint, String str, FSize fSize) {
        Rect rect = mCalcTextSizeRect;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        fSize.width = rect.width();
        fSize.height = rect.height();
    }

    public static int calcTextWidth(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    public static float convertDpToPixel(float f14) {
        DisplayMetrics displayMetrics = mMetrics;
        return displayMetrics == null ? f14 : f14 * displayMetrics.density;
    }

    public static int[] convertIntegers(List<Integer> list) {
        int[] iArr = new int[list.size()];
        copyIntegers(list, iArr);
        return iArr;
    }

    public static float convertPixelsToDp(float f14) {
        DisplayMetrics displayMetrics = mMetrics;
        return displayMetrics == null ? f14 : f14 / displayMetrics.density;
    }

    public static String[] convertStrings(List<String> list) {
        int size = list.size();
        String[] strArr = new String[size];
        for (int i14 = 0; i14 < size; i14++) {
            strArr[i14] = list.get(i14);
        }
        return strArr;
    }

    public static void copyIntegers(List<Integer> list, int[] iArr) {
        int length = iArr.length < list.size() ? iArr.length : list.size();
        for (int i14 = 0; i14 < length; i14++) {
            iArr[i14] = list.get(i14).intValue();
        }
    }

    public static void copyStrings(List<String> list, String[] strArr) {
        int length = strArr.length < list.size() ? strArr.length : list.size();
        for (int i14 = 0; i14 < length; i14++) {
            strArr[i14] = list.get(i14);
        }
    }

    public static void drawImage(Canvas canvas, Drawable drawable, int i14, int i15, int i16, int i17) {
        MPPointF mPPointF = MPPointF.getInstance();
        mPPointF.f52828x = i14 - (i16 / 2);
        mPPointF.f52829y = i15 - (i17 / 2);
        drawable.copyBounds(mDrawableBoundsCache);
        Rect rect = mDrawableBoundsCache;
        int i18 = rect.left;
        int i19 = rect.top;
        drawable.setBounds(i18, i19, i18 + i16, i16 + i19);
        int iSave = canvas.save();
        canvas.translate(mPPointF.f52828x, mPPointF.f52829y);
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public static void drawMultilineText(Canvas canvas, StaticLayout staticLayout, float f14, float f15, TextPaint textPaint, MPPointF mPPointF, float f16) {
        float fontMetrics = textPaint.getFontMetrics(mFontMetricsBuffer);
        float width = staticLayout.getWidth();
        float lineCount = staticLayout.getLineCount() * fontMetrics;
        float f17 = 0.0f - mDrawTextRectBuffer.left;
        float f18 = lineCount + 0.0f;
        Paint.Align textAlign = textPaint.getTextAlign();
        textPaint.setTextAlign(Paint.Align.LEFT);
        if (f16 != 0.0f) {
            float f19 = f17 - (width * 0.5f);
            float f22 = f18 - (lineCount * 0.5f);
            if (mPPointF.f52828x != 0.5f || mPPointF.f52829y != 0.5f) {
                FSize sizeOfRotatedRectangleByDegrees = getSizeOfRotatedRectangleByDegrees(width, lineCount, f16);
                f14 -= (mPPointF.f52828x - 0.5f) * sizeOfRotatedRectangleByDegrees.width;
                f15 -= (mPPointF.f52829y - 0.5f) * sizeOfRotatedRectangleByDegrees.height;
                FSize.recycleInstance(sizeOfRotatedRectangleByDegrees);
            }
            canvas.save();
            canvas.translate(f14, f15);
            canvas.rotate(f16);
            canvas.translate(f19, f22);
            staticLayout.draw(canvas);
            canvas.restore();
        } else {
            float f24 = mPPointF.f52828x;
            if (f24 != 0.0f || mPPointF.f52829y != 0.0f) {
                f17 -= width * f24;
                f18 -= lineCount * mPPointF.f52829y;
            }
            canvas.save();
            canvas.translate(f17 + f14, f18 + f15);
            staticLayout.draw(canvas);
            canvas.restore();
        }
        textPaint.setTextAlign(textAlign);
    }

    public static void drawXAxisValue(Canvas canvas, String str, float f14, float f15, Paint paint, MPPointF mPPointF, float f16) {
        float fontMetrics = paint.getFontMetrics(mFontMetricsBuffer);
        paint.getTextBounds(str, 0, str.length(), mDrawTextRectBuffer);
        float fWidth = 0.0f - mDrawTextRectBuffer.left;
        float f17 = (-mFontMetricsBuffer.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (f16 != 0.0f) {
            float fWidth2 = fWidth - (mDrawTextRectBuffer.width() * 0.5f);
            float f18 = f17 - (fontMetrics * 0.5f);
            if (mPPointF.f52828x != 0.5f || mPPointF.f52829y != 0.5f) {
                FSize sizeOfRotatedRectangleByDegrees = getSizeOfRotatedRectangleByDegrees(mDrawTextRectBuffer.width(), fontMetrics, f16);
                f14 -= (mPPointF.f52828x - 0.5f) * sizeOfRotatedRectangleByDegrees.width;
                f15 -= (mPPointF.f52829y - 0.5f) * sizeOfRotatedRectangleByDegrees.height;
                FSize.recycleInstance(sizeOfRotatedRectangleByDegrees);
            }
            canvas.save();
            canvas.translate(f14, f15);
            canvas.rotate(f16);
            canvas.drawText(str, fWidth2, f18, paint);
            canvas.restore();
        } else {
            if (mPPointF.f52828x != 0.0f || mPPointF.f52829y != 0.0f) {
                fWidth -= mDrawTextRectBuffer.width() * mPPointF.f52828x;
                f17 -= fontMetrics * mPPointF.f52829y;
            }
            canvas.drawText(str, fWidth + f14, f17 + f15, paint);
        }
        paint.setTextAlign(textAlign);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    public static String formatNumber(float f14, int i14, boolean z14, char c14) {
        boolean z15;
        float f15 = f14;
        int i15 = 35;
        char[] cArr = new char[35];
        if (f15 == 0.0f) {
            return "0";
        }
        int i16 = 0;
        boolean z16 = f15 < 1.0f && f15 > -1.0f;
        if (f15 < 0.0f) {
            f15 = -f15;
            z15 = true;
        } else {
            z15 = false;
        }
        int[] iArr = POW_10;
        int length = i14 > iArr.length ? iArr.length - 1 : i14;
        long jRound = Math.round(f15 * iArr[length]);
        int i17 = 34;
        boolean z17 = false;
        while (true) {
            if (jRound == 0 && i16 >= length + 1) {
                break;
            }
            char[] cArr2 = cArr;
            int i18 = (int) (jRound % 10);
            jRound /= 10;
            int i19 = i17 - 1;
            cArr2[i17] = (char) (i18 + 48);
            int i24 = i16 + 1;
            if (i24 == length) {
                i17 -= 2;
                cArr2[i19] = CoreConstants.COMMA_CHAR;
                i16 += 2;
                z17 = true;
            } else if (!z14 || jRound == 0 || i24 <= length) {
                i16 = i24;
                i17 = i19;
            } else if (z17) {
                if ((i24 - length) % 4 == 0) {
                    i17 -= 2;
                    cArr2[i19] = c14;
                    i16 += 2;
                } else {
                    i16 = i24;
                    i17 = i19;
                }
            } else if ((i24 - length) % 4 == 3) {
                i17 -= 2;
                cArr2[i19] = c14;
                i16 += 2;
            } else {
                i16 = i24;
                i17 = i19;
            }
            cArr = cArr2;
            i15 = 35;
        }
        if (z16) {
            cArr[i17] = '0';
            i16++;
            i17--;
        }
        if (z15) {
            cArr[i17] = '-';
            i16++;
        }
        int i25 = i15 - i16;
        return String.valueOf(cArr, i25, 35 - i25);
    }

    private static ValueFormatter generateDefaultValueFormatter() {
        return new DefaultValueFormatter(1);
    }

    public static int getDecimals(float f14) {
        float fRoundToNextSignificant = roundToNextSignificant(f14);
        if (Float.isInfinite(fRoundToNextSignificant)) {
            return 0;
        }
        return ((int) Math.ceil(-Math.log10(fRoundToNextSignificant))) + 2;
    }

    public static ValueFormatter getDefaultValueFormatter() {
        return mDefaultValueFormatter;
    }

    public static float getLineHeight(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public static float getLineSpacing(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    public static int getMaximumFlingVelocity() {
        return mMaximumFlingVelocity;
    }

    public static int getMinimumFlingVelocity() {
        return mMinimumFlingVelocity;
    }

    public static float getNormalizedAngle(float f14) {
        while (f14 < 0.0f) {
            f14 += 360.0f;
        }
        return f14 % 360.0f;
    }

    public static void getPosition(MPPointF mPPointF, float f14, float f15, MPPointF mPPointF2) {
        double d14 = f14;
        double d15 = f15;
        mPPointF2.f52828x = (float) ((Math.cos(Math.toRadians(d15)) * d14) + ((double) mPPointF.f52828x));
        mPPointF2.f52829y = (float) ((Math.sin(Math.toRadians(d15)) * d14) + ((double) mPPointF.f52829y));
    }

    public static int getSDKInt() {
        return Build.VERSION.SDK_INT;
    }

    public static FSize getSizeOfRotatedRectangleByDegrees(FSize fSize, float f14) {
        return getSizeOfRotatedRectangleByRadians(fSize.width, fSize.height, f14 * 0.017453292f);
    }

    public static FSize getSizeOfRotatedRectangleByRadians(float f14, float f15, float f16) {
        double d14 = f16;
        return FSize.getInstance(Math.abs(((float) Math.sin(d14)) * f15) + Math.abs(((float) Math.cos(d14)) * f14), Math.abs(f15 * ((float) Math.cos(d14))) + Math.abs(f14 * ((float) Math.sin(d14))));
    }

    public static void init(Context context) {
        if (context == null) {
            mMinimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
            mMaximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            mMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
            mMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            mMetrics = context.getResources().getDisplayMetrics();
        }
    }

    public static double nextUp(double d14) {
        if (d14 == Double.POSITIVE_INFINITY) {
            return d14;
        }
        double d15 = d14 + 0.0d;
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d15) + (d15 >= 0.0d ? 1L : -1L));
    }

    @SuppressLint({"NewApi"})
    public static void postInvalidateOnAnimation(View view2) {
        view2.postInvalidateOnAnimation();
    }

    public static float roundToNextSignificant(double d14) {
        if (Double.isInfinite(d14) || Double.isNaN(d14) || d14 == 0.0d) {
            return 0.0f;
        }
        float fPow = (float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d14 < 0.0d ? -d14 : d14))));
        return Math.round(d14 * ((double) fPow)) / fPow;
    }

    public static void velocityTrackerPointerUpCleanUpIfNecessary(MotionEvent motionEvent, VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float xVelocity = velocityTracker.getXVelocity(pointerId);
        float yVelocity = velocityTracker.getYVelocity(pointerId);
        int pointerCount = motionEvent.getPointerCount();
        for (int i14 = 0; i14 < pointerCount; i14++) {
            if (i14 != actionIndex) {
                int pointerId2 = motionEvent.getPointerId(i14);
                if ((velocityTracker.getYVelocity(pointerId2) * yVelocity) + (velocityTracker.getXVelocity(pointerId2) * xVelocity) < 0.0f) {
                    velocityTracker.clear();
                    return;
                }
            }
        }
    }

    public static float getLineHeight(Paint paint) {
        return getLineHeight(paint, mFontMetrics);
    }

    public static float getLineSpacing(Paint paint) {
        return getLineSpacing(paint, mFontMetrics);
    }

    public static FSize getSizeOfRotatedRectangleByDegrees(float f14, float f15, float f16) {
        return getSizeOfRotatedRectangleByRadians(f14, f15, f16 * 0.017453292f);
    }

    public static FSize calcTextSize(Paint paint, String str) {
        FSize fSize = FSize.getInstance(0.0f, 0.0f);
        calcTextSize(paint, str, fSize);
        return fSize;
    }

    public static MPPointF getPosition(MPPointF mPPointF, float f14, float f15) {
        MPPointF mPPointF2 = MPPointF.getInstance(0.0f, 0.0f);
        getPosition(mPPointF, f14, f15, mPPointF2);
        return mPPointF2;
    }

    @Deprecated
    public static void init(Resources resources) {
        mMetrics = resources.getDisplayMetrics();
        mMinimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
        mMaximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
    }

    public static FSize getSizeOfRotatedRectangleByRadians(FSize fSize, float f14) {
        return getSizeOfRotatedRectangleByRadians(fSize.width, fSize.height, f14);
    }

    public static void drawMultilineText(Canvas canvas, String str, float f14, float f15, TextPaint textPaint, FSize fSize, MPPointF mPPointF, float f16) {
        drawMultilineText(canvas, new StaticLayout(str, 0, str.length(), textPaint, (int) Math.max(Math.ceil(fSize.width), 1.0d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false), f14, f15, textPaint, mPPointF, f16);
    }

    public static String formatNumber(float f14, int i14, boolean z14) {
        return formatNumber(f14, i14, z14, '.');
    }
}
