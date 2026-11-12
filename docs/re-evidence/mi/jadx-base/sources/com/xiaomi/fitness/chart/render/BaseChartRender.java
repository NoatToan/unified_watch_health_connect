package com.xiaomi.fitness.chart.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseLineChartData;
import com.xiaomi.fitness.chart.entrys.FingerBSList;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.PhysicalStatusEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.LocalLanguageUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.a52;
import defpackage.aji;
import defpackage.eu3;
import defpackage.gv5;
import defpackage.hrl;
import defpackage.jak;
import defpackage.o8p;
import defpackage.onq;
import defpackage.sf2;
import defpackage.vfe;
import defpackage.x44;
import defpackage.xr5;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseChartRender<T extends RecyclerBarEntry, E extends a52> {
    protected E mBarChartAttrs;
    protected Paint mBarChartPaint;
    protected Paint mBarChartPointTypePaint;
    protected Paint mBarChartStrokePaint;
    protected onq mBarChartValueFormatter;
    protected Paint mHighLightBigPaint;
    protected Paint mHighLightDescPaint;
    public List<Drawable> mHighLightDrawableList;
    protected Paint mHighLightLinePaint;
    protected Paint mHighLightPointTypePaint;
    protected Paint mHighLightSmallPaint;
    protected onq mHighLightValueFormatter;
    protected Paint mTextPaint;

    public enum LayoutParameters {
        START_PADDING(DisplayUtil.dip2px(16.0f)),
        END_PADDING(DisplayUtil.dip2px(16.0f)),
        RECT_BOTTOM(DisplayUtil.dip2px(10.0f)),
        TXT_LINE_GAP(DisplayUtil.dip2px(5.0f)),
        RECT_MARGIN_TOP(DisplayUtil.dip2px(8.0f)),
        RECT_MARGIN_BOTTOM(DisplayUtil.dip2px(8.0f));

        private final float defaultValue;
        private float value;

        LayoutParameters(float f) {
            this.defaultValue = f;
            this.value = f;
        }

        public float getValue() {
            return this.value;
        }

        public void resetValue() {
            this.value = this.defaultValue;
        }

        public void setValue(float f) {
            this.value = f;
        }
    }

    public BaseChartRender(E e, onq onqVar) {
        this.mBarChartAttrs = e;
        this.mHighLightValueFormatter = onqVar;
        initBarChartPaint();
        initTextPaint();
        initHighLightPaint();
    }

    private void drawPhysicalStatusValueStr(Canvas canvas, String str, String str2, RectF rectF) {
        String[] strArrSplit = str.split(gv5.CONNECT_VALUE_STR);
        String[] strArrSplit2 = new String[0];
        if (str2 != null && str2.length() > 0) {
            strArrSplit2 = str2.split(gv5.CONNECT_VALUE_STR);
        }
        boolean z = strArrSplit2.length > 0;
        float fDip2px = rectF.left + DisplayUtil.dip2px(16.0f);
        float fDip2px2 = (((rectF.bottom - DisplayUtil.dip2px(8.0f)) - 8.0f) - o8p.i(this.mHighLightDescPaint)) - 2.0f;
        float f = fDip2px2 + 8.0f;
        float fI = z ? (fDip2px2 - o8p.i(this.mHighLightSmallPaint)) + 8.0f : f;
        for (int i = 0; i < strArrSplit.length; i++) {
            float fMax = Math.max(this.mHighLightBigPaint.measureText(strArrSplit[i]), this.mHighLightSmallPaint.measureText(strArrSplit2[i]));
            fDip2px += fMax;
            if (i > 0) {
                fDip2px += DisplayUtil.dip2px(16.0f);
            }
            float f2 = fDip2px - fMax;
            canvas.drawText(strArrSplit[i], f2, fI, this.mHighLightBigPaint);
            canvas.drawText(strArrSplit2[i], f2, f, this.mHighLightSmallPaint);
        }
    }

    private void drawPointsType(Canvas canvas, int i, String str, float f, float f2) {
        this.mBarChartPointTypePaint.setColor(getPointTypeBgColor(i));
        this.mHighLightPointTypePaint.setColor(getPointTypeTextColor(i));
        float f3 = this.mBarChartAttrs.e / 3.0f;
        RectF rectF = new RectF();
        float fDip2px = DisplayUtil.dip2px(3.0f);
        rectF.set(f, f2 - DisplayUtil.dip2px(14.0f), this.mHighLightPointTypePaint.measureText(str) + f + (2.0f * fDip2px), f2);
        canvas.drawRoundRect(rectF, f3, f3, this.mBarChartPointTypePaint);
        canvas.drawText(str, rectF.left + fDip2px, f2 - DisplayUtil.dip2px(4.0f), this.mHighLightPointTypePaint);
    }

    private void drawTwoValueStr(Canvas canvas, String str, String str2, RectF rectF) {
        float f;
        float fI;
        int i;
        int i2;
        float fMeasureText;
        String[] strArrSplit = str.split(gv5.CONNECT_VALUE_STR);
        int i3 = 0;
        String[] strArrSplit2 = new String[0];
        if (str2 != null && str2.length() > 0) {
            strArrSplit2 = str2.split(gv5.CONNECT_VALUE_STR);
        }
        String[] strArr = strArrSplit2;
        boolean z = strArr.length > 0;
        float fDip2px = rectF.left + DisplayUtil.dip2px(16.0f);
        float f2 = 8.0f;
        float fDip2px2 = (((rectF.bottom - DisplayUtil.dip2px(8.0f)) - 8.0f) - o8p.i(this.mHighLightDescPaint)) - 2.0f;
        float f3 = fDip2px2 + 8.0f;
        if (z) {
            fI = (fDip2px2 - o8p.i(this.mHighLightDescPaint)) - 8.0f;
            f = 4.0f + fI;
        } else {
            f = f3;
            fI = fDip2px2;
        }
        float f4 = 0.0f;
        float f5 = 0.0f;
        while (true) {
            i = 3;
            if (i3 >= strArrSplit.length) {
                break;
            }
            if (AppUtil.isRTLDirection()) {
                if (i3 == 3) {
                    fDip2px += DisplayUtil.dip2px(f2);
                    f5 = fDip2px;
                }
                int i4 = i3 % 3;
                if (i4 == 0) {
                    float fMeasureText2 = this.mHighLightBigPaint.measureText(strArrSplit[i3]);
                    fDip2px += fMeasureText2;
                    canvas.drawText(strArrSplit[i3], fDip2px - fMeasureText2, fI, this.mHighLightBigPaint);
                } else if (i4 == 1) {
                    fMeasureText = this.mHighLightSmallPaint.measureText(strArrSplit[i3]);
                    fDip2px += fMeasureText + 6.0f;
                    canvas.drawText(strArrSplit[i3], fDip2px - fMeasureText, f, this.mHighLightSmallPaint);
                    f4 = fMeasureText;
                } else {
                    float fMeasureText3 = this.mHighLightSmallPaint.measureText(strArrSplit[i3]);
                    float f6 = ((fDip2px + fMeasureText3) - f4) - fMeasureText3;
                    canvas.drawText(strArrSplit[i3], f6, (f + 6.0f) - o8p.i(this.mHighLightSmallPaint), this.mHighLightSmallPaint);
                    fDip2px = f6 + Math.max(fMeasureText3, f4);
                    f5 = f5;
                }
            } else {
                if (i3 == 3) {
                    fDip2px += DisplayUtil.dip2px(8.0f);
                    f5 = fDip2px;
                }
                int i5 = i3 % 3;
                if (i5 == 0) {
                    float fMeasureText4 = this.mHighLightBigPaint.measureText(strArrSplit[i3]);
                    fDip2px += fMeasureText4;
                    canvas.drawText(strArrSplit[i3], fDip2px - fMeasureText4, fI, this.mHighLightBigPaint);
                } else if (i5 == 1) {
                    fMeasureText = this.mHighLightSmallPaint.measureText(strArrSplit[i3]);
                    fDip2px += fMeasureText + 6.0f;
                    canvas.drawText(strArrSplit[i3], fDip2px - fMeasureText, f, this.mHighLightSmallPaint);
                    f4 = fMeasureText;
                } else {
                    float fMeasureText5 = this.mHighLightSmallPaint.measureText(strArrSplit[i3]);
                    float f7 = ((fDip2px + fMeasureText5) - f4) - fMeasureText5;
                    canvas.drawText(strArrSplit[i3], f7, (f + 6.0f) - o8p.i(this.mHighLightSmallPaint), this.mHighLightSmallPaint);
                    fDip2px = f7 + Math.max(fMeasureText5, f4);
                }
            }
            i3++;
            fI = fI;
            f2 = 8.0f;
        }
        float fDip2px3 = rectF.left + DisplayUtil.dip2px(16.0f);
        int i6 = 0;
        int pointTypeByString = 0;
        while (i6 < strArr.length) {
            if (AppUtil.isRTLDirection()) {
                if (i6 == i) {
                    fDip2px3 = f5;
                }
                int i7 = i6 % 3;
                if (i7 == 0) {
                    float fMeasureText6 = this.mHighLightDescPaint.measureText(strArr[i6]);
                    fDip2px3 += fMeasureText6;
                    canvas.drawText(strArr[i6], fDip2px3 - fMeasureText6, fDip2px2, this.mHighLightDescPaint);
                    i2 = i;
                } else if (i7 == 2) {
                    float fMeasureText7 = this.mHighLightDescPaint.measureText(strArr[i6]);
                    float f8 = fDip2px3 + fMeasureText7 + 8.0f;
                    i2 = i;
                    drawPointsType(canvas, pointTypeByString, strArr[i6], f8 - fMeasureText7, f3);
                    fDip2px3 = f8;
                } else {
                    i2 = i;
                    pointTypeByString = getPointTypeByString(strArr[i6]);
                }
            } else {
                i2 = i;
                if (i6 == i2) {
                    fDip2px3 = f5;
                }
                int i8 = i6 % 3;
                if (i8 == 0) {
                    float fMeasureText8 = this.mHighLightDescPaint.measureText(strArr[i6]);
                    fDip2px3 += fMeasureText8;
                    canvas.drawText(strArr[i6], fDip2px3 - fMeasureText8, fDip2px2, this.mHighLightDescPaint);
                } else if (i8 == 2) {
                    float fMeasureText9 = this.mHighLightDescPaint.measureText(strArr[i6]);
                    float f9 = fDip2px3 + fMeasureText9 + 8.0f;
                    drawPointsType(canvas, pointTypeByString, strArr[i6], f9 - fMeasureText9, f3);
                    fDip2px3 = f9;
                } else {
                    pointTypeByString = getPointTypeByString(strArr[i6]);
                }
                i6++;
                i = i2;
            }
            i6++;
            i = i2;
        }
    }

    private float drawValueStr(Canvas canvas, RectF rectF, String str, String str2, String str3) {
        float value;
        float value2;
        float value3 = (rectF.bottom - LayoutParameters.RECT_MARGIN_BOTTOM.getValue()) - o8p.a(this.mHighLightDescPaint, str3);
        String[] strArrSplit = str.split(gv5.CONNECT_VALUE_STR);
        String[] strArrSplit2 = new String[0];
        if (str2 != null && str2.length() > 0) {
            strArrSplit2 = str2.split(gv5.CONNECT_VALUE_STR);
        }
        boolean z = strArrSplit2.length > 0;
        float fDip2px = rectF.left + DisplayUtil.dip2px(16.0f);
        float fB = value3 - o8p.b(this.mHighLightDescPaint, str3);
        float fA = fB - o8p.a(this.mHighLightBigPaint, str);
        LayoutParameters layoutParameters = LayoutParameters.TXT_LINE_GAP;
        float value4 = fA - layoutParameters.getValue();
        float fA2 = (fB - o8p.a(this.mHighLightSmallPaint, str)) - layoutParameters.getValue();
        if (fA2 <= value4) {
            value4 = fA2;
        }
        if (z) {
            float fMax = value4 - Math.max(o8p.b(this.mHighLightBigPaint, str2), o8p.b(this.mHighLightSmallPaint, str2));
            value2 = fMax - layoutParameters.getValue();
            value = fMax - layoutParameters.getValue();
        } else {
            value = value4;
            value2 = value;
        }
        float fMin = Math.min(value2 - o8p.c(this.mHighLightBigPaint, str), value - o8p.c(this.mHighLightSmallPaint, str));
        rectF.top = fMin - LayoutParameters.RECT_MARGIN_TOP.getValue();
        float f = this.mBarChartAttrs.e;
        canvas.drawRoundRect(rectF, f, f, this.mBarChartPaint);
        canvas.drawText(str3, rectF.left + LayoutParameters.START_PADDING.getValue(), value3, this.mHighLightDescPaint);
        for (int i = 0; i < strArrSplit.length; i++) {
            if (AppUtil.isRTLDirection()) {
                if (i % 2 == 0) {
                    float fMeasureText = this.mHighLightSmallPaint.measureText(strArrSplit[i]);
                    fDip2px += 6.0f + fMeasureText;
                    canvas.drawText(strArrSplit[i], fDip2px - fMeasureText, value, this.mHighLightSmallPaint);
                } else {
                    float fMeasureText2 = this.mHighLightBigPaint.measureText(strArrSplit[i]);
                    fDip2px += fMeasureText2;
                    canvas.drawText(strArrSplit[i], fDip2px - fMeasureText2, value2, this.mHighLightBigPaint);
                }
            } else if (i % 2 == 0) {
                float fMeasureText3 = this.mHighLightBigPaint.measureText(strArrSplit[i]);
                fDip2px += fMeasureText3;
                canvas.drawText(strArrSplit[i], fDip2px - fMeasureText3, value2, this.mHighLightBigPaint);
            } else {
                float fMeasureText4 = this.mHighLightSmallPaint.measureText(strArrSplit[i]);
                fDip2px += 6.0f + fMeasureText4;
                canvas.drawText(strArrSplit[i], fDip2px - fMeasureText4, value, this.mHighLightSmallPaint);
            }
        }
        float fDip2px2 = rectF.left + DisplayUtil.dip2px(16.0f);
        for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
            if (AppUtil.isRTLDirection()) {
                if (i2 % 2 == 0) {
                    float fMeasureText5 = this.mHighLightSmallPaint.measureText(strArrSplit2[i2]);
                    fDip2px2 += fMeasureText5 + 6.0f;
                    canvas.drawText(strArrSplit2[i2], fDip2px2 - fMeasureText5, value4, this.mHighLightSmallPaint);
                } else {
                    float fMeasureText6 = this.mHighLightBigPaint.measureText(strArrSplit2[i2]);
                    fDip2px2 += fMeasureText6;
                    canvas.drawText(strArrSplit2[i2], fDip2px2 - fMeasureText6, value4, this.mHighLightBigPaint);
                }
            } else if (i2 % 2 == 0) {
                float fMeasureText7 = this.mHighLightBigPaint.measureText(strArrSplit2[i2]);
                fDip2px2 += fMeasureText7;
                canvas.drawText(strArrSplit2[i2], fDip2px2 - fMeasureText7, value4, this.mHighLightBigPaint);
            } else {
                float fMeasureText8 = this.mHighLightSmallPaint.measureText(strArrSplit2[i2]);
                fDip2px2 += fMeasureText8 + 6.0f;
                canvas.drawText(strArrSplit2[i2], fDip2px2 - fMeasureText8, value4, this.mHighLightSmallPaint);
            }
        }
        return fMin;
    }

    private int findRangeIndex(List<Pair<Float, Float>> list, Float f) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        if (f.floatValue() > list.get(0).getSecond().floatValue()) {
            return 0;
        }
        for (int i = 0; i < list.size(); i++) {
            Pair<Float, Float> pair = list.get(i);
            if (f.floatValue() >= pair.getFirst().floatValue() && f.floatValue() <= pair.getSecond().floatValue()) {
                return i;
            }
        }
        return list.size() - 1;
    }

    private int getPointTypeBgColor(int i) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return x44.a(aji.n);
                    }
                }
            }
            return x44.a(aji.m);
        }
        return x44.a(aji.l);
    }

    private int getPointTypeByString(String str) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    b2 = 0;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    b2 = 1;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    b2 = 2;
                }
                break;
            case 53:
                if (str.equals(UserConfig.KEY_DEVICE_LITE_SORT_GROUP)) {
                    b2 = 3;
                }
                break;
        }
        switch (b2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 5;
            default:
                return 0;
        }
    }

    private int getPointTypeTextColor(int i) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return x44.a(aji.q);
                    }
                }
            }
            return x44.a(aji.p);
        }
        return x44.a(aji.o);
    }

    /* JADX WARN: Incorrect types in method signature: <E:Lsf2;>(Landroid/graphics/RectF;Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;Landroidx/recyclerview/widget/RecyclerView;TE;F)[F */
    private float[] getSegmentChartPoints(RectF rectF, SegmentBarEntry segmentBarEntry, RecyclerView recyclerView, sf2 sf2Var, float f) {
        List<hrl> list = segmentBarEntry.rectValueModelList;
        int size = list.size();
        float[] fArr = new float[size * 4];
        for (int i = 0; i < size; i++) {
            hrl hrlVar = list.get(i);
            float f2 = hrlVar.f20377a;
            float f3 = hrlVar.f20378b;
            float fQ = jak.q(recyclerView, sf2Var, this.mBarChartAttrs, f2);
            float fQ2 = jak.q(recyclerView, sf2Var, this.mBarChartAttrs, f3);
            int i2 = i * 4;
            fArr[i2] = f;
            float f4 = rectF.bottom;
            fArr[i2 + 1] = f4 - fQ;
            fArr[i2 + 2] = f;
            fArr[i2 + 3] = f4 - fQ2;
        }
        return fArr;
    }

    private float getTxtX(float f, String str) {
        return f - (this.mTextPaint.measureText(str) / 2.0f);
    }

    public float computeValueStrWidth(String str) {
        String[] strArrSplit = str.split(gv5.CONNECT_VALUE_STR);
        float fMeasureText = 0.0f;
        for (int i = 0; i < strArrSplit.length; i++) {
            fMeasureText += AppUtil.isRTLDirection() ? i % 2 == 0 ? this.mHighLightSmallPaint.measureText(strArrSplit[i]) : this.mHighLightBigPaint.measureText(strArrSplit[i]) : i % 2 == 0 ? this.mHighLightBigPaint.measureText(strArrSplit[i]) : this.mHighLightSmallPaint.measureText(strArrSplit[i]);
        }
        return fMeasureText;
    }

    /* JADX WARN: Incorrect types in method signature: <E:Lsf2;>(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;TE;JJ)V */
    public void drawAbnormalHighLight(Canvas canvas, RecyclerView recyclerView, sf2 sf2Var, long j, long j2) {
        float[] fArr;
        if (this.mBarChartAttrs.C) {
            int childCount = recyclerView.getChildCount();
            float paddingLeft = recyclerView.getPaddingLeft();
            float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            long j3 = j2 - j;
            int i = 0;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
                String barLabel = this.mHighLightValueFormatter.getBarLabel(recyclerBarEntry);
                if (recyclerBarEntry.isSelected() && !TextUtils.isEmpty(barLabel)) {
                    RectF rectFD = eu3.d(childAt, recyclerView, sf2Var, this.mBarChartAttrs, recyclerBarEntry);
                    float fWidth = rectFD.width();
                    float f = ((recyclerBarEntry.timestamp - j) / j3) * (width - paddingLeft);
                    float f2 = fWidth / 2.0f;
                    if (f < f2) {
                        f = f2;
                    }
                    float f3 = f + paddingLeft;
                    rectFD.left = f3;
                    rectFD.right = f3 + fWidth;
                    float f4 = f3 + f2;
                    RectF rectFDrawHighLightValue2 = drawHighLightValue2(canvas, barLabel, f4, recyclerView, recyclerBarEntry);
                    if ((this.mBarChartAttrs instanceof vfe) || (recyclerBarEntry instanceof SegmentBarEntry) || (recyclerBarEntry instanceof MaxMinEntry)) {
                        fArr = new float[]{f4, rectFDrawHighLightValue2.bottom, f4, (childAt.getBottom() - recyclerView.getPaddingBottom()) - this.mBarChartAttrs.f625a};
                    } else {
                        fArr = new float[]{f4, rectFD.top, f4, rectFDrawHighLightValue2.bottom};
                    }
                    canvas.drawLines(fArr, this.mHighLightLinePaint);
                }
                i++;
                j3 = j3;
            }
        }
    }

    public RectF drawBloodSugarHighLight(Canvas canvas, String str, float f, RecyclerView recyclerView, T t) {
        float paddingTop = recyclerView.getPaddingTop();
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        String[] strArrSplit = str.split(gv5.CONNECT_STR);
        float fAbs = Math.abs(f - paddingLeft);
        float fAbs2 = Math.abs(width - f);
        float fDip2px = DisplayUtil.dip2px(16.0f);
        float fDip2px2 = paddingTop + DisplayUtil.dip2px(10.0f);
        DisplayUtil.dip2px(3.0f);
        DisplayUtil.dip2px(6.0f);
        float fDip2px3 = DisplayUtil.dip2px(8.0f);
        int length = strArrSplit.length;
        RectF rectF = new RectF();
        if (length != 3) {
            return rectF;
        }
        String str2 = strArrSplit[0];
        String[] strArrSplit2 = str2.split(gv5.CONNECT_VALUE_STR);
        if (strArrSplit2.length != 6) {
            return rectF;
        }
        String str3 = strArrSplit2[0];
        String str4 = strArrSplit2[1];
        String str5 = strArrSplit[1];
        String str6 = strArrSplit[2];
        float fMax = Math.max((computeValueStrWidth(str3 + gv5.CONNECT_VALUE_STR + str4) * 2.0f) + DisplayUtil.dip2px(13.0f), this.mHighLightSmallPaint.measureText(str6)) + fDip2px + fDip2px;
        float f2 = fMax / 2.0f;
        float fDip2px4 = fDip2px2 - ((float) DisplayUtil.dip2px(84.0f));
        this.mBarChartPaint.setColor(x44.a(aji.x));
        float f3 = this.mBarChartAttrs.e;
        if (fAbs <= f2) {
            rectF.set(paddingLeft, fDip2px4, fMax + paddingLeft, fDip2px2);
        } else if (fAbs2 <= f2) {
            rectF.set(width - fMax, fDip2px4, width, fDip2px2);
        } else {
            rectF.set(f - f2, fDip2px4, f + f2, fDip2px2);
        }
        canvas.drawRoundRect(rectF, f3, f3, this.mBarChartPaint);
        float f4 = (rectF.bottom - fDip2px3) - 8.0f;
        drawTwoValueStr(canvas, str2, str5, rectF);
        canvas.drawText(str6, rectF.left + fDip2px, f4, this.mHighLightDescPaint);
        return rectF;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
    /* JADX WARN: Incorrect types in method signature: <E:Lsf2;>(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;TE;)V */
    public void drawHighLight(Canvas canvas, RecyclerView recyclerView, sf2 sf2Var) {
        int i;
        int i2;
        Boolean bool;
        String str;
        float f;
        float[] fArr;
        int i3 = 3;
        if (this.mBarChartAttrs.C) {
            int childCount = recyclerView.getChildCount();
            Boolean bool2 = Boolean.FALSE;
            int i4 = 0;
            while (i4 < childCount) {
                View childAt = recyclerView.getChildAt(i4);
                RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
                String barLabel = this.mHighLightValueFormatter.getBarLabel(recyclerBarEntry);
                if (!recyclerBarEntry.isSelected() || (TextUtils.isEmpty(barLabel) && !(recyclerBarEntry instanceof BloodGlucoseEntry))) {
                    i = i3;
                    i2 = 1;
                } else {
                    float left = childAt.getLeft() + (childAt.getWidth() / 2.0f);
                    if (recyclerBarEntry instanceof BloodGlucoseEntry) {
                        BloodGlucoseEntry bloodGlucoseEntry = (BloodGlucoseEntry) recyclerBarEntry;
                        float selectX = bloodGlucoseEntry.getSelectX();
                        if (selectX != -1.0f) {
                            List<Pair<Float, Float>> item = bloodGlucoseEntry.getItem();
                            int iFindRangeIndex = bloodGlucoseEntry.findRangeIndex(selectX);
                            if (iFindRangeIndex == -1) {
                                return;
                            }
                            float fFloatValue = item.get(iFindRangeIndex).getFirst().floatValue() + ((item.get(iFindRangeIndex).getSecond().floatValue() - item.get(iFindRangeIndex).getFirst().floatValue()) / 2.0f);
                            String bloodGlucoseLabel = this.mHighLightValueFormatter.getBloodGlucoseLabel(bloodGlucoseEntry, iFindRangeIndex);
                            if (TextUtils.isEmpty(bloodGlucoseLabel)) {
                                return;
                            }
                            String[] strArrSplit = bloodGlucoseLabel.split(gv5.CONNECT_STR);
                            if (strArrSplit.length == i3) {
                                bool2 = Boolean.TRUE;
                            }
                            if (strArrSplit.length < 2) {
                                return;
                            }
                            BloodGlucoseLineChartData bloodGlucoseLineChartData = bloodGlucoseEntry.getValues().get(iFindRangeIndex);
                            recyclerBarEntry.drawableType = bloodGlucoseLineChartData.getDrawableType();
                            recyclerBarEntry.levelType = bloodGlucoseLineChartData.getLevelType();
                            recyclerBarEntry.levelValue = bloodGlucoseLineChartData.getLevelStingRes();
                            if (bloodGlucoseEntry.getHighLightType() == 2) {
                                FingerBSList fingerBSList = bloodGlucoseEntry.getFingerBSList().get(iFindRangeIndex);
                                recyclerBarEntry.levelType = fingerBSList.getLevelType();
                                recyclerBarEntry.levelValue = fingerBSList.getLevelStingRes();
                            }
                            bool = bool2;
                            f = fFloatValue;
                            str = bloodGlucoseLabel;
                        } else {
                            bool = bool2;
                            str = barLabel;
                            f = left;
                        }
                    } else {
                        bool = bool2;
                        str = barLabel;
                        f = left;
                    }
                    RectF rectFF = eu3.f(childAt, recyclerView, sf2Var, this.mBarChartAttrs, recyclerBarEntry);
                    new RectF();
                    RectF rectFDrawBloodSugarHighLight = bool.booleanValue() ? drawBloodSugarHighLight(canvas, str, f, recyclerView, recyclerBarEntry) : drawHighLightValue2(canvas, str, f, recyclerView, recyclerBarEntry);
                    if ((this.mBarChartAttrs instanceof vfe) || (recyclerBarEntry instanceof SegmentBarEntry) || (recyclerBarEntry instanceof MaxMinEntry)) {
                        i2 = 1;
                        i = 3;
                        fArr = new float[]{f, rectFDrawBloodSugarHighLight.bottom, f, (childAt.getBottom() - recyclerView.getPaddingBottom()) - this.mBarChartAttrs.f625a};
                    } else {
                        fArr = new float[]{f, rectFF.top, f, rectFDrawBloodSugarHighLight.bottom};
                        i = 3;
                        i2 = 1;
                    }
                    canvas.drawLines(fArr, this.mHighLightLinePaint);
                    bool2 = bool;
                }
                i4 += i2;
                i3 = i;
            }
        }
    }

    public RectF drawHighLightPhysicalStatusValue(Canvas canvas, String str, float f, RecyclerView recyclerView, T t) {
        float paddingTop = recyclerView.getPaddingTop();
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        String[] strArrSplit = str.split(gv5.CONNECT_STR);
        float fAbs = Math.abs(f - paddingLeft);
        float fAbs2 = Math.abs(width - f);
        RectF rectF = new RectF();
        if (!(t instanceof PhysicalStatusEntry)) {
            return rectF;
        }
        PhysicalStatusEntry physicalStatusEntry = (PhysicalStatusEntry) t;
        String str2 = "" + physicalStatusEntry.d;
        String str3 = "" + physicalStatusEntry.e;
        String str4 = strArrSplit[0];
        String str5 = physicalStatusEntry.c == -1 ? "--" : "" + physicalStatusEntry.c;
        String str6 = strArrSplit[1];
        String str7 = physicalStatusEntry.f11760a == -1 ? "--" : "" + physicalStatusEntry.f11760a;
        String str8 = strArrSplit[2];
        String dateMMddFormat = TimeDateUtil.getDateMMddFormat(physicalStatusEntry.timestamp);
        float fDip2px = DisplayUtil.dip2px(16.0f);
        float fDip2px2 = paddingTop + DisplayUtil.dip2px(this.mBarChartAttrs.I0);
        float fDip2px3 = DisplayUtil.dip2px(8.0f);
        String str9 = str7;
        float fMax = Math.max(this.mHighLightBigPaint.measureText(str7) + this.mHighLightBigPaint.measureText("") + this.mHighLightBigPaint.measureText(str5) + this.mHighLightBigPaint.measureText(str2), this.mHighLightSmallPaint.measureText(str8) + this.mHighLightSmallPaint.measureText("") + this.mHighLightSmallPaint.measureText(str6) + this.mHighLightSmallPaint.measureText(str3)) + fDip2px + fDip2px + (fDip2px * 3.0f);
        if (t.levelType > -1) {
            fMax = fMax + DisplayUtil.dip2px(3.0f) + this.mHighLightPointTypePaint.measureText(t.levelValue);
        }
        float f2 = fMax / 2.0f;
        float fDip2px4 = fDip2px2 - DisplayUtil.dip2px(76.0f);
        this.mBarChartPaint.setColor(x44.a(aji.x));
        float f3 = this.mBarChartAttrs.e;
        if (fAbs <= f2) {
            rectF.set(paddingLeft, fDip2px4, fMax + paddingLeft, fDip2px2);
        } else if (fAbs2 <= f2) {
            rectF.set(width - fMax, fDip2px4, width, fDip2px2);
        } else {
            rectF.set(f - f2, fDip2px4, f + f2, fDip2px2);
        }
        canvas.drawRoundRect(rectF, f3, f3, this.mBarChartPaint);
        float f4 = (rectF.bottom - fDip2px3) - 8.0f;
        drawPhysicalStatusValueStr(canvas, str2 + gv5.CONNECT_VALUE_STR + str9 + gv5.CONNECT_VALUE_STR + str5, str3 + gv5.CONNECT_VALUE_STR + str8 + gv5.CONNECT_VALUE_STR + str6, rectF);
        canvas.drawText(dateMMddFormat, rectF.left + fDip2px, f4, this.mHighLightDescPaint);
        return rectF;
    }

    public RectF drawHighLightValue(Canvas canvas, String str, float f, RecyclerView recyclerView, int i) {
        float paddingTop = recyclerView.getPaddingTop();
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        String[] strArrSplit = str.split(gv5.CONNECT_STR);
        float fAbs = Math.abs(f - paddingLeft);
        float fAbs2 = Math.abs(width - f);
        float fDip2px = DisplayUtil.dip2px(10.0f);
        float fDip2px2 = DisplayUtil.dip2px(10.0f);
        float fDip2px3 = DisplayUtil.dip2px(16.0f);
        float fDip2px4 = DisplayUtil.dip2px(3.0f);
        String str2 = AppUtil.isRTLDirection() ? strArrSplit[1] : strArrSplit[0];
        String str3 = AppUtil.isRTLDirection() ? strArrSplit[0] : strArrSplit[1];
        float fMeasureText = this.mHighLightSmallPaint.measureText(str2);
        float fMeasureText2 = this.mHighLightSmallPaint.measureText(str3);
        float fI = o8p.i(this.mHighLightSmallPaint) + (fDip2px4 * 2.0f);
        float f2 = fMeasureText2 + fMeasureText + fDip2px + fDip2px2 + fDip2px3;
        float f3 = f2 / 2.0f;
        String str4 = str3;
        float f4 = paddingTop - fI;
        RectF rectF = new RectF();
        String str5 = str2;
        this.mBarChartPaint.setColor(x44.a(aji.e));
        float f5 = this.mBarChartAttrs.e;
        if (fAbs <= f3) {
            rectF.set(paddingLeft, f4, f2 + paddingLeft, paddingTop);
        } else if (fAbs2 <= f3) {
            rectF.set(width - f2, f4, width, paddingTop);
        } else {
            rectF.set(f - f3, f4, f + f3, paddingTop);
        }
        canvas.drawRoundRect(rectF, f5, f5, this.mBarChartPaint);
        float f6 = (fDip2px4 * 3.0f) + f4;
        float f7 = rectF.left + fDip2px;
        float f8 = fMeasureText + f7;
        float f9 = fI + f6;
        RectF rectF2 = new RectF(f7, f6, f8, f9);
        this.mHighLightSmallPaint.setTextAlign(Paint.Align.LEFT);
        Paint.FontMetrics fontMetrics = this.mHighLightSmallPaint.getFontMetrics();
        float fCenterY = (int) (rectF2.centerY() + ((fontMetrics.top + fontMetrics.bottom) / 2.0f));
        canvas.drawText(str5, rectF.left + fDip2px, fCenterY, this.mHighLightSmallPaint);
        float f10 = (fDip2px3 / 2.0f) + f8;
        canvas.drawLines(new float[]{f10, f4 + DisplayUtil.dip2px(6.0f), f10, paddingTop - DisplayUtil.dip2px(6.0f)}, this.mHighLightSmallPaint);
        canvas.drawText(str4, new RectF(f8 + fDip2px3, f6, rectF.right - fDip2px2, f9).left, fCenterY, this.mHighLightSmallPaint);
        return rectF;
    }

    public RectF drawHighLightValue2(Canvas canvas, String str, float f, RecyclerView recyclerView, T t) {
        String str2;
        int i;
        float paddingTop = recyclerView.getPaddingTop();
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        String[] strArrSplit = str.split(gv5.CONNECT_STR);
        float fAbs = Math.abs(f - paddingLeft);
        float fAbs2 = Math.abs(width - f);
        LayoutParameters layoutParameters = LayoutParameters.START_PADDING;
        layoutParameters.setValue(DisplayUtil.dip2px(16.0f));
        LayoutParameters layoutParameters2 = LayoutParameters.END_PADDING;
        layoutParameters2.setValue(DisplayUtil.dip2px(16.0f));
        LayoutParameters layoutParameters3 = LayoutParameters.RECT_BOTTOM;
        layoutParameters3.setValue(paddingTop - DisplayUtil.dip2px(10.0f));
        LayoutParameters.TXT_LINE_GAP.setValue(DisplayUtil.dip2px(5.0f));
        LayoutParameters.RECT_MARGIN_TOP.setValue(DisplayUtil.dip2px(8.0f));
        LayoutParameters layoutParameters4 = LayoutParameters.RECT_MARGIN_BOTTOM;
        layoutParameters4.setValue(DisplayUtil.dip2px(8.0f));
        int length = strArrSplit.length;
        RectF rectF = new RectF();
        if (length == 1) {
            return rectF;
        }
        boolean z = length == 3;
        String str3 = strArrSplit[0];
        String str4 = strArrSplit[1];
        if (z) {
            str2 = strArrSplit[2];
        } else {
            str4 = null;
            str2 = str4;
        }
        float fComputeValueStrWidth = computeValueStrWidth(str3);
        if (z) {
            fComputeValueStrWidth = Math.max(fComputeValueStrWidth, computeValueStrWidth(str4));
        }
        float fMeasureText = this.mHighLightSmallPaint.measureText(str2);
        float fMax = Math.max(fComputeValueStrWidth, fMeasureText) + layoutParameters.getValue() + layoutParameters2.getValue();
        float f2 = fComputeValueStrWidth;
        if (t.levelType > -1) {
            fMax = fMax + DisplayUtil.dip2px(3.0f) + this.mHighLightPointTypePaint.measureText(t.levelValue);
        }
        float f3 = fMax / 2.0f;
        float fDip2px = DisplayUtil.dip2px(59.0f);
        if (z) {
            fDip2px = DisplayUtil.dip2px(90.0f);
        }
        float value = layoutParameters3.getValue() - fDip2px;
        String str5 = str2;
        this.mBarChartPaint.setColor(x44.a(aji.x));
        if (fAbs <= f3) {
            rectF.set(paddingLeft, value, paddingLeft + fMax, layoutParameters3.getValue());
        } else if (fAbs2 <= f3) {
            rectF.set(width - fMax, value, width, layoutParameters3.getValue());
        } else {
            rectF.set(f - f3, value, f + f3, layoutParameters3.getValue());
        }
        drawValueStr(canvas, rectF, str3, str4, str5);
        int i2 = t.levelType;
        if (i2 != -1) {
            drawPointsType(canvas, i2, t.levelValue, rectF.left + fMeasureText + layoutParameters.getValue(), rectF.bottom - layoutParameters4.getValue());
        }
        List<Drawable> list = this.mHighLightDrawableList;
        if (list != null && (i = t.drawableType) > 0 && i <= list.size()) {
            Drawable drawable = this.mHighLightDrawableList.get(t.drawableType - 1);
            int value2 = (int) (rectF.left + f2 + layoutParameters.getValue() + DisplayUtil.dip2px(6.0f));
            int minimumWidth = drawable.getMinimumWidth() + value2;
            int value3 = (int) (layoutParameters3.getValue() - DisplayUtil.dip2px(25.0f));
            drawable.setBounds(value2, value3 - drawable.getMinimumHeight(), minimumWidth, value3);
            drawable.draw(canvas);
        }
        return rectF;
    }

    /* JADX WARN: Incorrect types in method signature: <E:Lsf2;>(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;TE;)V */
    public void drawPhysicalStatusHighLight(Canvas canvas, RecyclerView recyclerView, sf2 sf2Var) {
        if (this.mBarChartAttrs.C) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
                String barLabel = this.mHighLightValueFormatter.getBarLabel(recyclerBarEntry);
                if (recyclerBarEntry.isSelected() && (!TextUtils.isEmpty(barLabel) || (recyclerBarEntry instanceof BloodGlucoseEntry))) {
                    float left = childAt.getLeft() + (childAt.getWidth() / 2.0f);
                    RectF rectFF = eu3.f(childAt, recyclerView, sf2Var, this.mBarChartAttrs, recyclerBarEntry);
                    new RectF();
                    RectF rectFDrawHighLightPhysicalStatusValue = drawHighLightPhysicalStatusValue(canvas, barLabel, left, recyclerView, recyclerBarEntry);
                    canvas.drawLines(((this.mBarChartAttrs instanceof vfe) || (recyclerBarEntry instanceof SegmentBarEntry) || (recyclerBarEntry instanceof MaxMinEntry)) ? new float[]{left, rectFDrawHighLightPhysicalStatusValue.bottom, left, (childAt.getBottom() - recyclerView.getPaddingBottom()) - this.mBarChartAttrs.f625a} : new float[]{left, rectFF.top, left, rectFDrawHighLightPhysicalStatusValue.bottom}, this.mHighLightLinePaint);
                }
            }
        }
    }

    public boolean drawText(Canvas canvas, float f, float f2, String str, float f3, float f4, Paint paint) {
        float fMeasureText = paint.measureText(str);
        float txtX = getTxtX(f3, str);
        float f5 = txtX + fMeasureText;
        int length = str.length();
        if (xr5.k(f5, f)) {
            return true;
        }
        if (txtX < f && f5 > f) {
            canvas.drawText(str, str.length() - ((int) ((str.length() * (f5 - f)) / fMeasureText)), length, Math.max(txtX, f), f4, paint);
            return false;
        }
        if (xr5.a(txtX, f) && xr5.k(f5, f2)) {
            canvas.drawText(str, 0, length, txtX, f4, paint);
            return false;
        }
        if (txtX > f2 || f5 <= f2) {
            return false;
        }
        float txtX2 = getTxtX(f3, str);
        canvas.drawText(str, 0, (int) ((str.length() * (f2 - txtX2)) / fMeasureText), txtX2, f4, paint);
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: <E:Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;>(TE;)I */
    public abstract int getChartColor(RecyclerBarEntry recyclerBarEntry);

    public void initBarChartPaint() {
        Paint paint = new Paint();
        this.mBarChartPaint = paint;
        paint.reset();
        this.mBarChartPaint.setAntiAlias(true);
        Paint paint2 = this.mBarChartPaint;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.mBarChartPaint.setStrokeWidth(8.0f);
        this.mBarChartPaint.setColor(this.mBarChartAttrs.g0);
        Paint paint3 = new Paint();
        this.mBarChartStrokePaint = paint3;
        paint3.reset();
        this.mBarChartStrokePaint.setAntiAlias(true);
        this.mBarChartStrokePaint.setStyle(Paint.Style.STROKE);
        this.mBarChartStrokePaint.setColor(this.mBarChartAttrs.g0);
        Paint paint4 = new Paint();
        this.mBarChartPointTypePaint = paint4;
        paint4.reset();
        this.mBarChartPointTypePaint.setAntiAlias(true);
        this.mBarChartPointTypePaint.setStyle(style);
        this.mBarChartPointTypePaint.setStrokeWidth(8.0f);
    }

    public void initHighLightPaint() {
        Paint paint = new Paint();
        this.mHighLightBigPaint = paint;
        paint.reset();
        this.mHighLightBigPaint.setAntiAlias(true);
        this.mHighLightBigPaint.setColor(x44.a(aji.e0));
        float f = this.mBarChartAttrs.B0;
        if (f > 0.0f) {
            this.mHighLightBigPaint.setTextSize(f);
        } else {
            int iDip2px = DisplayUtil.dip2px(24.0f);
            LocalLanguageUtil localLanguageUtil = LocalLanguageUtil.INSTANCE;
            if (localLanguageUtil.languageGerman() || localLanguageUtil.languageGreek() || localLanguageUtil.languageGreek()) {
                iDip2px = DisplayUtil.dip2px(18.0f);
            }
            this.mHighLightBigPaint.setTextSize(iDip2px);
        }
        this.mHighLightBigPaint.setTypeface(Typeface.create("mipro-regular", 1));
        Paint paint2 = new Paint();
        this.mHighLightSmallPaint = paint2;
        paint2.reset();
        this.mHighLightSmallPaint.setAntiAlias(true);
        this.mHighLightSmallPaint.setColor(x44.a(aji.e0));
        float f2 = this.mBarChartAttrs.C0;
        if (f2 > 0.0f) {
            this.mHighLightSmallPaint.setTextSize(f2);
        } else {
            this.mHighLightSmallPaint.setTextSize(DisplayUtil.dip2px(12.0f));
        }
        this.mHighLightSmallPaint.setTextAlign(Paint.Align.LEFT);
        this.mHighLightSmallPaint.setTypeface(Typeface.create("mipro-regular", 1));
        Paint paint3 = new Paint();
        this.mHighLightDescPaint = paint3;
        paint3.reset();
        this.mHighLightDescPaint.setAntiAlias(true);
        this.mHighLightDescPaint.setColor(x44.a(aji.i0));
        this.mHighLightDescPaint.setTextSize(DisplayUtil.dip2px(12.0f));
        this.mHighLightDescPaint.setTypeface(Typeface.create("mipro-regular", 0));
        Paint paint4 = new Paint();
        this.mHighLightLinePaint = paint4;
        paint4.reset();
        this.mHighLightLinePaint.setAntiAlias(true);
        this.mHighLightLinePaint.setStyle(Paint.Style.STROKE);
        this.mHighLightLinePaint.setStrokeWidth(3.0f);
        this.mHighLightLinePaint.setColor(this.mBarChartAttrs.z0);
        Paint paint5 = new Paint();
        this.mHighLightPointTypePaint = paint5;
        paint5.reset();
        this.mHighLightPointTypePaint.setAntiAlias(true);
        this.mHighLightPointTypePaint.setTypeface(Typeface.create("mipro-regular", 0));
        this.mHighLightPointTypePaint.setTextSize(DisplayUtil.dip2px(9.0f));
    }

    public void initTextPaint() {
        Paint paint = new Paint();
        this.mTextPaint = paint;
        paint.reset();
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setStyle(Paint.Style.FILL);
        this.mTextPaint.setStrokeWidth(1.0f);
        this.mTextPaint.setColor(this.mBarChartAttrs.k0);
        this.mTextPaint.setTextSize(DisplayUtil.dip2px(12.0f));
    }

    public void setHighLightValueFormatter(onq onqVar) {
        this.mHighLightValueFormatter = onqVar;
    }

    public BaseChartRender(E e, onq onqVar, onq onqVar2) {
        this.mBarChartAttrs = e;
        this.mBarChartValueFormatter = onqVar;
        this.mHighLightValueFormatter = onqVar2;
        initBarChartPaint();
        initTextPaint();
        initHighLightPaint();
    }

    public BaseChartRender(E e) {
        this.mBarChartAttrs = e;
        initBarChartPaint();
        initTextPaint();
        initHighLightPaint();
    }
}
