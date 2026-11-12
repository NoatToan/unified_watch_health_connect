package com.github.mikephil.chartingv2.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
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
import com.garmin.device.ble.BleCommunicationException;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.formatter.DefaultValueFormatter;
import com.github.mikephil.chartingv2.formatter.ValueFormatter;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class Utils {
    public static final double DEG2RAD = 0.017453292519943295d;
    public static final float FDEG2RAD = 0.017453292f;
    private static final int[] POW_10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    private static Rect mDrawTextRectBuffer = new Rect();
    private static Paint.FontMetrics mFontMetricsBuffer = new Paint.FontMetrics();
    private static int mMaximumFlingVelocity = 8000;
    private static DisplayMetrics mMetrics = null;
    private static int mMinimumFlingVelocity = 50;

    public static int calcTextHeight(Paint paint, String str) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static FSize calcTextSize(Paint paint, String str) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return new FSize(rect.width(), rect.height());
    }

    public static int calcTextWidth(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    public static float convertDpToPixel(float f14) {
        DisplayMetrics displayMetrics = mMetrics;
        return displayMetrics == null ? f14 : (displayMetrics.densityDpi / 160.0f) * f14;
    }

    public static int[] convertIntegers(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr[i14] = list.get(i14).intValue();
        }
        return iArr;
    }

    public static float convertPixelsToDp(float f14) {
        DisplayMetrics displayMetrics = mMetrics;
        return displayMetrics == null ? f14 : f14 / (displayMetrics.densityDpi / 160.0f);
    }

    public static String[] convertStrings(List<String> list) {
        int size = list.size();
        String[] strArr = new String[size];
        for (int i14 = 0; i14 < size; i14++) {
            strArr[i14] = list.get(i14);
        }
        return strArr;
    }

    public static void drawMultilineText(Canvas canvas, StaticLayout staticLayout, float f14, float f15, TextPaint textPaint, PointF pointF, float f16) {
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
            if (pointF.x != 0.5f || pointF.y != 0.5f) {
                FSize sizeOfRotatedRectangleByDegrees = getSizeOfRotatedRectangleByDegrees(width, lineCount, f16);
                f14 -= (pointF.x - 0.5f) * sizeOfRotatedRectangleByDegrees.width;
                f15 -= (pointF.y - 0.5f) * sizeOfRotatedRectangleByDegrees.height;
            }
            canvas.save();
            canvas.translate(f14, f15);
            canvas.rotate(f16);
            canvas.translate(f19, f22);
            staticLayout.draw(canvas);
            canvas.restore();
        } else {
            float f24 = pointF.x;
            if (f24 != 0.0f || pointF.y != 0.0f) {
                f17 -= width * f24;
                f18 -= lineCount * pointF.y;
            }
            canvas.save();
            canvas.translate(f17 + f14, f18 + f15);
            staticLayout.draw(canvas);
            canvas.restore();
        }
        textPaint.setTextAlign(textAlign);
    }

    public static void drawText(Canvas canvas, String str, float f14, float f15, Paint paint, PointF pointF, float f16) {
        paint.getTextBounds(str, 0, str.length(), mDrawTextRectBuffer);
        float fHeight = mDrawTextRectBuffer.height();
        float fWidth = 0.0f - mDrawTextRectBuffer.left;
        float f17 = fHeight + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (f16 != 0.0f) {
            float fWidth2 = fWidth - (mDrawTextRectBuffer.width() * 0.5f);
            float f18 = f17 - (fHeight * 0.5f);
            if (pointF.x != 0.5f || pointF.y != 0.5f) {
                FSize sizeOfRotatedRectangleByDegrees = getSizeOfRotatedRectangleByDegrees(mDrawTextRectBuffer.width(), fHeight, f16);
                f14 -= (pointF.x - 0.5f) * sizeOfRotatedRectangleByDegrees.width;
                f15 -= (pointF.y - 0.5f) * sizeOfRotatedRectangleByDegrees.height;
            }
            canvas.save();
            canvas.translate(f14, f15);
            canvas.rotate(f16);
            canvas.drawText(str, fWidth2, f18, paint);
            canvas.restore();
        } else {
            if (pointF.x != 0.0f || pointF.y != 0.0f) {
                fWidth -= mDrawTextRectBuffer.width() * pointF.x;
                f17 -= fHeight * pointF.y;
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

    public static int getClosestDataSetIndex(List<SelectionDetail> list, float f14, YAxis.AxisDependency axisDependency) {
        int i14 = BleCommunicationException.UNSPECIFIED_FAILURE;
        float f15 = Float.MAX_VALUE;
        for (int i15 = 0; i15 < list.size(); i15++) {
            SelectionDetail selectionDetail = list.get(i15);
            if (axisDependency == null || selectionDetail.dataSet.getAxisDependency() == axisDependency) {
                float fAbs = Math.abs(selectionDetail.val - f14);
                if (fAbs < f15) {
                    i14 = list.get(i15).dataSetIndex;
                    f15 = fAbs;
                }
            }
        }
        return i14;
    }

    public static int getDecimals(float f14) {
        return ((int) Math.ceil(-Math.log10(roundToNextSignificant(f14)))) + 2;
    }

    public static float getLineHeight(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public static float getLineSpacing(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    public static int getMaximumFlingVelocity() {
        return mMaximumFlingVelocity;
    }

    public static float getMinimumDistance(List<SelectionDetail> list, float f14, YAxis.AxisDependency axisDependency) {
        float f15 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            SelectionDetail selectionDetail = list.get(i14);
            if (selectionDetail.dataSet.getAxisDependency() == axisDependency) {
                float fAbs = Math.abs(selectionDetail.val - f14);
                if (fAbs < f15) {
                    f15 = fAbs;
                }
            }
        }
        return f15;
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

    public static PointF getPosition(PointF pointF, float f14, float f15) {
        double d14 = f14;
        double d15 = f15;
        return new PointF((float) ((Math.cos(Math.toRadians(d15)) * d14) + ((double) pointF.x)), (float) ((Math.sin(Math.toRadians(d15)) * d14) + ((double) pointF.y)));
    }

    public static int getSDKInt() {
        return Build.VERSION.SDK_INT;
    }

    public static FSize getSizeOfRotatedRectangleByDegrees(FSize fSize, float f14) {
        return getSizeOfRotatedRectangleByRadians(fSize.width, fSize.height, f14 * 0.017453292f);
    }

    public static FSize getSizeOfRotatedRectangleByRadians(float f14, float f15, float f16) {
        double d14 = f16;
        return new FSize(Math.abs(((float) Math.sin(d14)) * f15) + Math.abs(((float) Math.cos(d14)) * f14), Math.abs(f15 * ((float) Math.cos(d14))) + Math.abs(f14 * ((float) Math.sin(d14))));
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

    public static boolean needsDefaultFormatter(ValueFormatter valueFormatter) {
        return valueFormatter == null || (valueFormatter instanceof DefaultValueFormatter);
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

    public static FSize getSizeOfRotatedRectangleByDegrees(float f14, float f15, float f16) {
        return getSizeOfRotatedRectangleByRadians(f14, f15, f16 * 0.017453292f);
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

    public static void drawMultilineText(Canvas canvas, String str, float f14, float f15, TextPaint textPaint, FSize fSize, PointF pointF, float f16) {
        drawMultilineText(canvas, new StaticLayout(str, 0, str.length(), textPaint, (int) Math.max(Math.ceil(fSize.width), 1.0d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false), f14, f15, textPaint, pointF, f16);
    }

    public static String formatNumber(float f14, int i14, boolean z14) {
        return formatNumber(f14, i14, z14, '.');
    }
}
