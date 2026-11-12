package com.huawei.ui.commonui.linechart.common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.qmh;
import defpackage.qmn;
import defpackage.qmp;
import defpackage.qnj;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes16.dex */
public class HwHealthXAxisRenderer extends XAxisRenderer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f23673b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23674a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f23675c;
    private boolean d;
    private HwHealthBaseBarLineChart e;
    private int f;
    private Sorption g;
    private float h;
    private float i;
    private boolean j;

    public enum Sorption {
        Y_OFFSET_CEIL,
        Y_OFFSET_FLOOR
    }

    public HwHealthXAxisRenderer(Context context, HwHealthBaseBarLineChart hwHealthBaseBarLineChart, ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, xAxis, transformer);
        this.f23675c = null;
        this.e = null;
        this.j = false;
        this.d = false;
        this.h = Float.MAX_VALUE;
        this.i = -3.4028235E38f;
        this.g = Sorption.Y_OFFSET_CEIL;
        this.f = 0;
        this.f23674a = -1;
        this.f23675c = context;
        this.e = hwHealthBaseBarLineChart;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxisValues(float f, float f2) {
        if (!this.d) {
            super.computeAxisValues(f, f2);
            return;
        }
        int i = 0;
        this.mAxis.mDecimals = 0;
        float f3 = f2 - 0.0f;
        if (f3 < 60.0f) {
            this.mAxis.mEntries = new float[]{0.0f};
            computeSize();
            return;
        }
        float f4 = f2 / 60.0f;
        if (f3 <= 300.0f) {
            double d2 = f4;
            this.mAxis.mEntryCount = ((int) Math.floor(d2)) + 1;
            this.mAxis.mEntries = new float[this.mAxis.mEntryCount];
            while (i <= ((int) Math.floor(d2))) {
                this.mAxis.mEntries[i] = i * 60;
                i++;
            }
            computeSize();
            return;
        }
        double dFloor = ((int) Math.floor(f4 / 5.0f)) / 5.0f;
        int iFloor = ((int) Math.floor(dFloor)) * 5;
        int iCeil = ((int) Math.ceil(dFloor)) * 5;
        if (Math.abs((iFloor == 0 ? 0 : (int) Math.ceil(Math.ceil(f4) / ((double) iFloor))) - 6) > Math.abs((iCeil == 0 ? 0 : (int) Math.ceil(Math.ceil(f4) / ((double) iCeil))) - 6)) {
            iFloor = iCeil;
        }
        int iFloor2 = iFloor == 0 ? 0 : (int) Math.floor(f4 / iFloor);
        this.mAxis.mEntryCount = iFloor2 + 1;
        this.mAxis.mEntries = new float[this.mAxis.mEntryCount];
        while (i <= iFloor2) {
            this.mAxis.mEntries[i] = i * iFloor * 60;
            i++;
        }
        computeSize();
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public void drawLabels(Canvas canvas, float f, MPPointF mPPointF) {
        if ((this.mAxis instanceof qmn) && ((qmn) this.mAxis).d()) {
            return;
        }
        if (this.mAxis.mAxisMaximum - this.mAxis.mAxisMinimum < 60.0f && this.j) {
            d(canvas, f, mPPointF);
        } else {
            a(canvas, f, mPPointF);
        }
    }

    public void d(boolean z) {
        this.j = z;
    }

    public void a(boolean z) {
        this.d = z;
    }

    private void d(Canvas canvas, float f, MPPointF mPPointF) {
        String string;
        float f2 = this.mViewPortHandler.getContentRect().left;
        float f3 = this.mViewPortHandler.getContentRect().right;
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        String strE = UnitUtil.e(0.0d, 1, 0);
        Resources resources = this.f23675c.getResources();
        if (resources == null) {
            string = "--";
        } else {
            string = resources.getString(R.string.IDS_hwh_motiontrack_detail_chart_less_1);
        }
        String str = string;
        float fCalcTextWidth = Utils.calcTextWidth(this.mAxisLabelPaint, strE);
        float fCalcTextWidth2 = Utils.calcTextWidth(this.mAxisLabelPaint, str);
        if (!qmh.e(this.f23675c)) {
            float f4 = f2 + (fCalcTextWidth / 2.0f);
            float f5 = f3 - (fCalcTextWidth2 / 2.0f);
            drawLabel(canvas, strE, f4, c(f4, f, strE), mPPointF, labelRotationAngle);
            drawLabel(canvas, str, f5, c(f5, f, str), mPPointF, labelRotationAngle);
            return;
        }
        float f6 = f3 - (fCalcTextWidth / 2.0f);
        float f7 = f2 + (fCalcTextWidth2 / 2.0f);
        drawLabel(canvas, strE, f6, c(f6, f, strE), mPPointF, labelRotationAngle);
        drawLabel(canvas, str, f7, c(f7, f, str), mPPointF, labelRotationAngle);
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public void drawLabel(Canvas canvas, String str, float f, float f2, MPPointF mPPointF, float f3) {
        String str2;
        boolean zE = e(str);
        float textSize = this.mXAxis.getTextSize();
        String[] strArrC = c(str);
        if (zE && (str2 = strArrC[0]) != null && strArrC[1] != null) {
            Utils.drawXAxisValue(canvas, str2, f, f2 - 38.0f, this.mAxisLabelPaint, mPPointF, f3);
            Utils.drawXAxisValue(canvas, strArrC[1], f, ((f2 + textSize) + 2.0f) - 38.0f, this.mAxisLabelPaint, mPPointF, f3);
        } else {
            Utils.drawXAxisValue(canvas, str, f, f2, this.mAxisLabelPaint, mPPointF, f3);
        }
    }

    private void a(d dVar) {
        int alpha = this.mAxisLabelPaint.getAlpha();
        this.mAxisLabelPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        this.mAxisLabelPaint.setAlpha(HeartRateThresholdConfig.HEART_RATE_LIMIT);
        float textSize = this.mXAxis.getTextSize();
        boolean zE = e(dVar.f23682c);
        String[] strArrC = c(dVar.f23682c);
        if (zE && strArrC[0] != null && strArrC[1] != null) {
            Utils.drawXAxisValue(dVar.e, strArrC[0], dVar.f23680a, dVar.j - 38.0f, this.mAxisLabelPaint, dVar.f23681b, dVar.d);
            Utils.drawXAxisValue(dVar.e, strArrC[1], dVar.f23680a, ((dVar.j + textSize) + 2.0f) - 38.0f, this.mAxisLabelPaint, dVar.f23681b, dVar.d);
        } else {
            Utils.drawXAxisValue(dVar.e, dVar.f23682c, dVar.f23680a, dVar.j, this.mAxisLabelPaint, dVar.f23681b, dVar.d);
        }
        this.mAxisLabelPaint.setTypeface(this.mAxisLabelPaint.getTypeface());
        this.mAxisLabelPaint.setAlpha(alpha);
    }

    private boolean c() {
        return this.f23675c.getResources().getConfiguration().locale.getLanguage().endsWith("bo");
    }

    private boolean e(String str) {
        if (str != null && !str.equals("") && str.length() > 7) {
            this.f++;
        }
        return c() && this.f > 0;
    }

    private String[] c(String str) {
        String[] strArr = new String[2];
        if (str != null && !str.equals("") && str.length() > 7) {
            strArr[0] = str.substring(0, 4);
            strArr[1] = str.substring(4);
        }
        return strArr;
    }

    private float c(float f, String str, Paint paint) {
        if (str == null || paint == null) {
            LogUtil.j("HwHealthXAxisRenderer", "text or paint is invalid");
            return 0.0f;
        }
        if (Math.abs(this.i + Float.MAX_VALUE) < 1.0E-6d) {
            return Utils.convertDpToPixel(3.0f);
        }
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(-3.4028235E38f, 0.0f));
        arrayList.add(new c(-112.0f, 6.25f));
        arrayList.add(new c(-84.0f, 18.75f));
        arrayList.add(new c(-56.0f, 33.333332f));
        arrayList.add(new c(-28.0f, 44.444443f));
        arrayList.add(new c(0.0f, 50.0f));
        arrayList.add(new c(28.0f, 44.444443f));
        arrayList.add(new c(56.0f, 33.333332f));
        arrayList.add(new c(84.0f, 18.75f));
        arrayList.add(new c(112.0f, 6.25f));
        arrayList.add(new c(140.0f, 0.0f));
        arrayList.add(new c(Float.MAX_VALUE, 0.0f));
        float fWidth = f - (rect.width() * 0.5f);
        float fWidth2 = f + (rect.width() * 0.5f);
        float f2 = this.i;
        float f3 = fWidth - f2;
        if ((fWidth2 - f2) * f3 < 0.0f) {
            return d(arrayList, 0.0f);
        }
        float fD = d(arrayList, Math.abs(f3));
        float fD2 = d(arrayList, Math.abs(fWidth2 - this.i));
        return fD >= fD2 ? fD : fD2;
    }

    private float a(float f, String str, Paint paint) {
        return c(f, str, paint) + this.e.acquireLayout().j();
    }

    private float d(List<c> list, float f) {
        ListIterator<c> listIterator = list.listIterator();
        float f2 = 0.0f;
        while (listIterator.hasNext()) {
            c next = listIterator.next();
            if (!listIterator.hasNext()) {
                break;
            }
            c cVar = list.get(listIterator.nextIndex());
            if (f > next.d && f <= cVar.d) {
                f2 = (((cVar.f23679c - next.f23679c) / (cVar.d - next.d)) * (f - next.d)) + next.f23679c;
            }
        }
        return f2;
    }

    public Sorption b() {
        return this.g;
    }

    static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f23679c;
        float d;

        c(float f, float f2) {
            this.d = f;
            this.f23679c = f2;
        }
    }

    public void e(Sorption sorption) {
        this.g = sorption;
    }

    public void d(int i) {
        this.f23674a = i;
    }

    protected void a(Canvas canvas, float f, MPPointF mPPointF) {
        float fAbs;
        float f2;
        String str;
        String str2;
        a aVar;
        float f3;
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        boolean zIsCenterAxisLabelsEnabled = this.mXAxis.isCenterAxisLabelsEnabled();
        int i = this.mXAxis.mEntryCount * 2;
        float[] fArr = new float[i];
        d(zIsCenterAxisLabelsEnabled, fArr);
        this.mTrans.pointValuesToPixel(fArr);
        a aVar2 = f23673b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a aVar3 = aVar2;
        float f4 = 0.0f;
        String str3 = "";
        int i2 = 0;
        boolean z = true;
        float f5 = Float.MAX_VALUE;
        while (i2 < i && i2 < this.mXAxis.mEntries.length * 2) {
            float fE = fArr[i2];
            int i3 = i2 / 2;
            if (i3 < this.mXAxis.mEntries.length && this.mViewPortHandler.isInBoundsX(fE)) {
                String formattedValue = this.mXAxis.getValueFormatter().getFormattedValue(this.mXAxis.mEntries[i3], this.mXAxis);
                if (this.mXAxis.isAvoidFirstLastClippingEnabled()) {
                    fE = e(i2, fE, formattedValue);
                }
                float f6 = fE;
                if (Math.abs(f6 - this.i) < f5 || i3 == this.f23674a) {
                    fAbs = Math.abs(this.i - f6);
                    f2 = f6;
                    str = formattedValue;
                    str2 = str;
                    aVar = new a(canvas, f6, f, mPPointF, z, this.mXAxis.mEntries[i3], labelRotationAngle);
                    f3 = f2;
                } else {
                    f2 = f6;
                    str2 = str3;
                    aVar = aVar3;
                    fAbs = f5;
                    str = formattedValue;
                    f3 = f4;
                }
                arrayList.add(new d(canvas, str, f2, c(f2, f, str), mPPointF, labelRotationAngle));
                if (i3 < this.mXAxis.mEntries.length) {
                    arrayList2.add(new a(canvas, f2, f, mPPointF, z, this.mXAxis.mEntries[i3], labelRotationAngle));
                    z = false;
                }
                f5 = fAbs;
                f4 = f3;
                str3 = str2;
                aVar3 = aVar;
            } else {
                i2 = i2;
                i = i;
                fArr = fArr;
            }
            i2 += 2;
            i = i;
            fArr = fArr;
        }
        boolean z2 = (((double) Math.abs(this.i + Float.MAX_VALUE)) <= 1.0E-6d || !this.e.isMarkerViewEnable()) ? this.f23674a >= 0 : true;
        String str4 = str3;
        float f7 = f4;
        b(z2, canvas, str4, f4, f, mPPointF, labelRotationAngle, aVar3);
        e(canvas, f);
        d(f, f7, str4, arrayList, z2);
        d(f7, arrayList2, z2);
    }

    private void d(float f, List<a> list, boolean z) {
        for (a aVar : list) {
            if (!z || !qnj.a(aVar.f, f)) {
                c(aVar);
            }
        }
    }

    private void d(float f, float f2, String str, List<d> list, boolean z) {
        for (d dVar : list) {
            if (!z || !qnj.a(dVar.f23680a, f2) || !qnj.a(dVar.j, c(f2, f, str))) {
                drawLabel(dVar.e, dVar.f23682c, dVar.f23680a, dVar.j, dVar.f23681b, dVar.d);
            }
        }
    }

    private void d(boolean z, float[] fArr) {
        for (int i = 0; i < fArr.length; i += 2) {
            if (z) {
                fArr[i] = this.mXAxis.mCenteredEntries[i / 2];
            } else {
                fArr[i] = this.mXAxis.mEntries[i / 2];
            }
        }
    }

    private void e(a aVar) {
        if (aVar != f23673b) {
            Typeface typeface = this.mAxisLabelPaint.getTypeface();
            int alpha = this.mAxisLabelPaint.getAlpha();
            this.mAxisLabelPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
            this.mAxisLabelPaint.setAlpha(HeartRateThresholdConfig.HEART_RATE_LIMIT);
            c(aVar);
            this.mAxisLabelPaint.setTypeface(typeface);
            this.mAxisLabelPaint.setAlpha(alpha);
        }
    }

    private float e(int i, float f, String str) {
        if (i != (this.mXAxis.mEntryCount * 2) - 2 || this.mXAxis.mEntryCount <= 1) {
            return i == 0 ? f + (Utils.calcTextWidth(this.mAxisLabelPaint, str) / 2.0f) : f;
        }
        float fCalcTextWidth = Utils.calcTextWidth(this.mAxisLabelPaint, str);
        return (fCalcTextWidth <= this.mViewPortHandler.offsetRight() * 2.0f || f + fCalcTextWidth <= this.mViewPortHandler.getChartWidth()) ? f : f - (fCalcTextWidth / 2.0f);
    }

    private void b(boolean z, Canvas canvas, String str, float f, float f2, MPPointF mPPointF, float f3, a aVar) {
        if (z) {
            a(new d(canvas, str, f, c(f, f2, str), mPPointF, f3));
            e(aVar);
        }
    }

    private void d(boolean z, a aVar, IAxisValueFormatter iAxisValueFormatter, float f) {
        if (z || !aVar.f23678c) {
            return;
        }
        HwHealthBaseScrollBarLineChart.g gVar = (HwHealthBaseScrollBarLineChart.g) iAxisValueFormatter;
        String strC = gVar.c(aVar.d, this.mXAxis, true);
        float fCalcTextHeight = Utils.calcTextHeight(this.mAxisLabelPaint, strC) + Utils.convertDpToPixel(6.0f);
        float f2 = 720;
        this.mTrans.pointValuesToPixel(new float[]{aVar.d - f2, 0.0f, aVar.d + f2, 0.0f});
        if (gVar.d(aVar.d)) {
            if (!e(aVar.f)) {
                drawLabel(aVar.f23677b, strC, this.h, c(aVar.f, f, strC) - fCalcTextHeight, aVar.e, aVar.f23676a);
                return;
            } else {
                drawLabel(aVar.f23677b, strC, aVar.f, c(aVar.f, f, strC) - fCalcTextHeight, aVar.e, aVar.f23676a);
                return;
            }
        }
        drawLabel(aVar.f23677b, strC, this.h, c(aVar.f, f, strC) - fCalcTextHeight, aVar.e, aVar.f23676a);
    }

    private void c(boolean z, a aVar, HwHealthBaseScrollBarLineChart.h hVar) {
        if (z || !aVar.f23678c) {
            return;
        }
        String strD = hVar.d(aVar.d, this.mXAxis, true);
        float fCalcTextHeight = Utils.calcTextHeight(this.mAxisLabelPaint, strD) + Utils.convertDpToPixel(6.0f);
        float f = 720;
        this.mTrans.pointValuesToPixel(new float[]{aVar.d - f, 0.0f, aVar.d + f, 0.0f});
        if (hVar.b(aVar.d)) {
            if (!e(aVar.f)) {
                drawLabel(aVar.f23677b, strD, this.h, c(aVar.f, aVar.i, strD) - fCalcTextHeight, aVar.e, aVar.f23676a);
                return;
            } else {
                drawLabel(aVar.f23677b, strD, aVar.f, c(aVar.f, aVar.i, strD) - fCalcTextHeight, aVar.e, aVar.f23676a);
                return;
            }
        }
        drawLabel(aVar.f23677b, strD, this.h, c(aVar.f, aVar.i, strD) - fCalcTextHeight, aVar.e, aVar.f23676a);
    }

    private void e(Canvas canvas, float f) {
        if (this.e.getGlobalPointFlag()) {
            Paint paint = new Paint(1);
            paint.setColor(this.e.getGlobalPointColor());
            paint.setAntiAlias(true);
            if (!qmh.e(this.f23675c)) {
                float fG = this.e.acquireChartAnchor().g();
                float fConvertDpToPixel = Utils.convertDpToPixel(26.0f);
                canvas.drawCircle(fG - fConvertDpToPixel, c(this.e.acquireChartAnchor().g() - Utils.convertDpToPixel(26.0f), f, "") + Utils.convertDpToPixel(5.0f), Utils.convertDpToPixel(2.0f), paint);
                return;
            }
            float f2 = this.e.acquireChartAnchor().f();
            float fConvertDpToPixel2 = Utils.convertDpToPixel(26.0f);
            canvas.drawCircle(f2 + fConvertDpToPixel2, c(this.e.acquireChartAnchor().f() + Utils.convertDpToPixel(26.0f), f, "") + Utils.convertDpToPixel(5.0f), Utils.convertDpToPixel(2.0f), paint);
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f23680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        MPPointF f23681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f23682c;
        float d;
        Canvas e;
        float j;

        d(Canvas canvas, String str, float f, float f2, MPPointF mPPointF, float f3) {
            this.e = canvas;
            this.f23682c = str;
            this.f23680a = f;
            this.j = f2;
            this.f23681b = mPPointF;
            this.d = f3;
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f23676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Canvas f23677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f23678c;
        float d;
        MPPointF e;
        float f;
        float i;

        a() {
        }

        a(Canvas canvas, float f, float f2, MPPointF mPPointF, boolean z, float f3, float f4) {
            this.f23677b = canvas;
            this.f = f;
            this.i = f2;
            this.e = mPPointF;
            this.f23678c = z;
            this.d = f3;
            this.f23676a = f4;
        }
    }

    private void c(a aVar) {
        IAxisValueFormatter valueFormatter = this.mXAxis.getValueFormatter();
        if (this instanceof qmp) {
            if (valueFormatter instanceof HwHealthBaseScrollBarLineChart.g) {
                a(aVar);
            } else if (valueFormatter instanceof HwHealthBaseScrollBarLineChart.h) {
                b(aVar);
            }
        }
    }

    private void a(a aVar) {
        float f;
        IAxisValueFormatter valueFormatter = this.mXAxis.getValueFormatter();
        if (Math.abs(this.h - aVar.f) > 1.0E-6d) {
            this.h = aVar.f;
        }
        if (!(valueFormatter instanceof HwHealthBaseScrollBarLineChart.g)) {
            LogUtil.j("HwHealthXAxisRenderer", "drawUpperLabelsForWeek valueFormatter not instanceof UnixWeekAxisValueFormatter");
            return;
        }
        boolean z = false;
        String strC = ((HwHealthBaseScrollBarLineChart.g) valueFormatter).c(aVar.d, this.mXAxis, false);
        if (c() && this.f > 0) {
            f = aVar.i - 38.0f;
        } else {
            f = aVar.i;
        }
        if (!TextUtils.isEmpty(strC)) {
            float fCalcTextHeight = Utils.calcTextHeight(this.mAxisLabelPaint, strC) + Utils.convertDpToPixel(6.0f);
            if (!TextUtils.isEmpty(strC)) {
                if (e(aVar.f)) {
                    drawLabel(aVar.f23677b, strC, this.h, c(aVar.f, f, strC) - fCalcTextHeight, aVar.e, aVar.f23676a);
                } else {
                    drawLabel(aVar.f23677b, strC, aVar.f, c(aVar.f, f, strC) - fCalcTextHeight, aVar.e, aVar.f23676a);
                }
                z = true;
            }
        }
        d(z, aVar, valueFormatter, f);
    }

    private void b(a aVar) {
        if (!(this.mXAxis.getValueFormatter() instanceof HwHealthBaseScrollBarLineChart.h)) {
            LogUtil.j("HwHealthXAxisRenderer", "drawUpperLabelsForYear getValueFormatter not instanceof UnixYearAxisValueFormatter");
            return;
        }
        HwHealthBaseScrollBarLineChart.h hVar = (HwHealthBaseScrollBarLineChart.h) this.mXAxis.getValueFormatter();
        if (Math.abs(this.h - aVar.f) > 1.0E-6d) {
            this.h = aVar.f;
        }
        boolean z = false;
        String strD = hVar.d(aVar.d, this.mXAxis, false);
        if (!TextUtils.isEmpty(strD)) {
            float fCalcTextHeight = Utils.calcTextHeight(this.mAxisLabelPaint, strD) + Utils.convertDpToPixel(6.0f);
            if (!TextUtils.isEmpty(strD)) {
                if (e(aVar.f)) {
                    drawLabel(aVar.f23677b, strD, this.h, c(aVar.f, aVar.i, strD) - fCalcTextHeight, aVar.e, aVar.f23676a);
                } else {
                    drawLabel(aVar.f23677b, strD, aVar.f, c(aVar.f, aVar.i, strD) - fCalcTextHeight, aVar.e, aVar.f23676a);
                }
                z = true;
            }
        }
        c(z, aVar, hVar);
    }

    private boolean e(float f) {
        if (qmh.e(this.f23675c)) {
            return f > this.h;
        }
        return f < this.h;
    }

    private float c(float f, float f2, String str) {
        if (this.g == Sorption.Y_OFFSET_CEIL) {
            return f2 + this.e.acquireLayout().i();
        }
        if (this.g != Sorption.Y_OFFSET_FLOOR) {
            return f2;
        }
        return ((f2 - a(f, str, this.mAxisLabelPaint)) - this.mXAxis.mLabelHeight) - Utils.convertDpToPixel(2.5f);
    }

    public void b(float f) {
        this.i = f;
    }
}
