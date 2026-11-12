package com.huami.watch.dataflow.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.huami.chart.template.ColorTemplate;
import com.huami.watch.companion.util.ChartTimeUtil;
import com.huami.watch.dataflow.chart.base.BarChart;
import com.huami.watch.dataflow.chart.base.ColorRenderer;
import com.huami.watch.dataflow.chart.base.Renderer;
import com.huami.watch.dataflow.chart.util.ChartUtil;
import com.huami.watch.util.I18nUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class DynamicDetailChart extends BarChart {
    private static final float A = 145.0f;
    private static final int B = 250;
    private static final int C = 50;
    private static final int D = 300;
    private static final int E = 8000;
    private static final int F = 110;
    private static final int G = 220;
    private static final int H = 3000;
    private static final float I = 5.0f;
    private static final float J = 5.0f;
    private static final String x = "Chart.DynamicDetailChart";
    private static final int y = 1100;
    private static final float z = 145.0f;
    private DynamicSleepBarChart a;
    private DynamicStepBarChart b;
    private DynamicHRBarChart c;
    private DynamicSportBarChart d;
    private DynamicLineChart e;
    private DynamicCalorieBarChart f;
    private DynamicTargetBarChart g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private Paint n;
    private Paint o;
    private boolean p;
    private int q;
    private SportChartAttr r;
    private SportChartAttr s;
    private LineChartAttr t;
    private TargetChartAttr u;
    private SleepChartAttr v;
    private boolean w;

    public class DynamicCalorieBarChart extends b {
        private float b;
        private int c;
        private float d;
        private Renderer e;
        private Renderer f;
        private Renderer g;

        public DynamicCalorieBarChart(Context context) {
            super(context);
            this.c = 10;
            this.e = new ColorRenderer(-35261);
            this.f = new ColorRenderer(ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR);
            this.g = new ColorRenderer(-1712080542);
        }

        private void a(RectF rectF) {
            if (rectF != null) {
                this.d = b(rectF);
                this.b = ChartUtil.updateLevelSize(this.mMaxItemValue, (((rectF.height() - this.mPaddingTop) - this.mPaddingBottom) - this.mItemBaseHeight) - this.d, this.c);
                this.e.paint.setStrokeWidth(this.d);
                this.g.paint.setStrokeWidth(this.d);
                this.f.paint.setStrokeWidth(this.d);
            }
        }

        private float b(RectF rectF) {
            return (((rectF.width() - this.mPaddingLeft) - this.mPaddingRight) / itemsCount()) - (this.mItemPadding * 2.0f);
        }

        public int calcIndex(float f) {
            if (f < 0.0f) {
                return -1;
            }
            float fWidth = (this.mRect.width() - this.mPaddingLeft) - this.mPaddingRight;
            int iItemsCount = itemsCount();
            int i = (int) (((f - this.mPaddingLeft) * iItemsCount) / fWidth);
            return i >= iItemsCount ? iItemsCount - 1 : i;
        }

        @Override // com.huami.watch.dataflow.chart.DynamicDetailChart.b, com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
        public void draw(Canvas canvas, RectF rectF, float f) {
            synchronized (this.mItems) {
                int size = this.mItems.size();
                int i = 0;
                for (T t : this.mItems) {
                    float f2 = 1.0f;
                    if (f == 1.0f || f == 0.0f) {
                        f2 = f;
                    } else {
                        float f3 = f / (1.0f - ((i * 0.6f) / size));
                        if (f3 <= 1.0f) {
                            f2 = f3;
                        }
                    }
                    RectF rectF2 = new RectF();
                    if (t.value > 0) {
                        RectF rectF3 = t.mRect;
                        rectF2.left = rectF3.left;
                        float f4 = rectF3.bottom;
                        rectF2.top = f4;
                        rectF2.right = rectF3.right;
                        rectF2.bottom = ((f4 - (rectF3.height() * f2)) - (this.mDensity * 2.0f)) + 0.5f;
                        canvas.drawRect(rectF2, this.e.paint);
                    } else {
                        RectF rectF4 = t.mRect;
                        rectF2.left = rectF4.left;
                        float f5 = rectF4.bottom;
                        rectF2.top = f5;
                        rectF2.right = rectF4.right;
                        rectF2.bottom = ((f5 - (rectF4.height() * f2)) - (this.mDensity * 2.0f)) + 0.5f;
                        canvas.drawRect(rectF2, this.g.paint);
                    }
                    if (t.index == DynamicDetailChart.this.q && t.value > 0) {
                        RectF rectF5 = t.mRect;
                        rectF2.left = rectF5.left;
                        rectF2.top = (rectF5.top - (this.mDensity * 2.0f)) + 0.5f;
                        rectF2.right = rectF5.right;
                        rectF2.bottom = rectF5.bottom * f2;
                        canvas.drawRect(rectF2, this.f.paint);
                    }
                    i++;
                }
            }
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemHeight(RectF rectF, BarChart.BarItem barItem) {
            int i = barItem.value;
            int i2 = this.mMaxItemValue;
            return i >= i2 ? (((rectF.height() - this.mPaddingTop) - this.mPaddingBottom) - this.mItemBaseHeight) - this.d : ChartUtil.itemLevelSize(i2, i, this.b, this.c) + this.mItemBaseHeight;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemOffsetX(RectF rectF, BarChart.BarItem barItem) {
            return ((((rectF.width() - this.mPaddingLeft) - this.mPaddingRight) / itemsCount()) * (barItem.index - DynamicDetailChart.this.h)) + this.mPaddingLeft;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemWidth(RectF rectF, BarChart.BarItem barItem) {
            return this.d;
        }

        @Override // com.huami.watch.dataflow.chart.base.BaseChart
        public int itemsCount() {
            return ((DynamicDetailChart.this.i - DynamicDetailChart.this.h) + 1) / DynamicDetailChart.this.m;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
        public void onItemsChanged(List<BarChart.BarItem> list) {
            super.onItemsChanged(list);
            this.mMaxItemValue = ChartUtil.updateMaxItemValue(list, 0, 300);
            DynamicDetailChart.this.j = 0;
            DynamicDetailChart.this.k = 23;
            DynamicDetailChart.this.h = 0;
            DynamicDetailChart.this.i = 23;
            DynamicDetailChart.this.mXAxis.notifyChanged();
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public void realignItems(RectF rectF, List<? extends BarChart.BarItem> list) {
            a(this.mRect);
            super.realignItems(rectF, list);
        }
    }

    public static class DynamicDetailBarItem extends BarChart.BarItem {
        public int mode;
        public int target;

        public DynamicDetailBarItem(Context context) {
            super(context);
        }
    }

    public class DynamicHRBarChart extends b {
        private Renderer b;
        private Renderer c;
        private Renderer d;
        private Renderer e;
        private Renderer f;
        private Renderer g;
        private Renderer h;
        private Renderer i;

        public DynamicHRBarChart(Context context) {
            super(context);
            this.b = new ColorRenderer(-614761, -1605772);
            this.c = new ColorRenderer(-334754, -337634);
            this.d = new ColorRenderer(-10101628, -9378145);
            this.e = new ColorRenderer(-8659730, -9842712);
            this.f = new ColorRenderer(-9721601, -7880705);
            this.g = new ColorRenderer(-1578515, -2236443);
            this.h = new ColorRenderer(-4543493, -6320139);
            this.i = new ColorRenderer(ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR);
        }

        private int e() {
            return ((DynamicDetailChart.this.i - DynamicDetailChart.this.h) + 1) / DynamicDetailChart.this.m;
        }

        public float a(RectF rectF, int i) {
            float fHeight = (rectF.height() - this.mPaddingTop) - this.mPaddingBottom;
            if (i <= 0) {
                return 0.0f;
            }
            return (i / this.mMaxItemValue) * fHeight;
        }

        public float b(RectF rectF) {
            if (rectF == null) {
                return 0.0f;
            }
            return ((((rectF.width() - this.mPaddingLeft) - this.mPaddingRight) / e()) - (this.mItemPadding * 2.0f)) + 1.0f;
        }

        public void c(Canvas canvas, List<Float> list, Paint paint) {
            float[] fArr = new float[list.size()];
            for (int i = 0; i < list.size(); i++) {
                fArr[i] = list.get(i).floatValue();
            }
            canvas.drawLines(fArr, paint);
        }

        public int calcIndex(float f) {
            if (f < 0.0f) {
                return -1;
            }
            int iE = e();
            float fWidth = this.mRect.width();
            float f2 = this.mPaddingLeft;
            int i = (int) (((f - f2) * iE) / ((fWidth - f2) - this.mPaddingRight));
            return i >= iE ? iE - 1 : i;
        }

        public void d(Canvas canvas, List<Float> list) {
            if (DynamicDetailChart.this.q < 0) {
                return;
            }
            float[] fArr = new float[list.size()];
            for (int i = 0; i < list.size(); i++) {
                fArr[i] = list.get(i).floatValue();
            }
            switch (((DynamicDetailBarItem) ((BarChart.BarItem) this.mItems.get(DynamicDetailChart.this.q))).mode) {
                case 0:
                    this.i.paint.setColor(-2080723);
                    break;
                case 1:
                    this.i.paint.setColor(-19200);
                    break;
                case 2:
                    this.i.paint.setColor(-14366898);
                    break;
                case 3:
                    this.i.paint.setColor(-14303517);
                    break;
                case 4:
                    this.i.paint.setColor(-12874497);
                    break;
                case 5:
                    this.i.paint.setColor(-3947581);
                    break;
                case 6:
                    this.i.paint.setColor(-6593571);
                    break;
            }
            canvas.drawLines(fArr, this.i.paint);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.huami.watch.dataflow.chart.DynamicDetailChart.b, com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
        public void draw(Canvas canvas, RectF rectF, float f) {
            ArrayList arrayList;
            ArrayList arrayList2;
            float f2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            int i;
            ArrayList arrayList5;
            ArrayList arrayList6;
            if (DynamicDetailChart.this.p) {
                return;
            }
            synchronized (this.mItems) {
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = new ArrayList();
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = new ArrayList();
                ArrayList arrayList20 = new ArrayList();
                ArrayList arrayList21 = arrayList8;
                ArrayList arrayList22 = new ArrayList();
                int size = this.mItems.size();
                ArrayList arrayList23 = arrayList7;
                Iterator it2 = this.mItems.iterator();
                ArrayList arrayList24 = arrayList10;
                int i2 = 0;
                while (it2.hasNext()) {
                    Iterator it3 = it2;
                    BarChart.BarItem barItem = (BarChart.BarItem) it2.next();
                    if (f == 1.0f || f == 0.0f) {
                        arrayList = arrayList9;
                        arrayList2 = arrayList18;
                        f2 = f;
                    } else {
                        arrayList = arrayList9;
                        arrayList2 = arrayList18;
                        f2 = f / (1.0f - ((i2 * 0.6f) / size));
                        if (f2 > 1.0f) {
                            f2 = 1.0f;
                        }
                    }
                    int i3 = i2 + 1;
                    switch (((DynamicDetailBarItem) barItem).mode) {
                        case 0:
                            arrayList20 = arrayList20;
                            arrayList3 = arrayList2;
                            size = size;
                            arrayList4 = arrayList;
                            i = i3;
                            ArrayList arrayList25 = arrayList24;
                            if (barItem.index % 2 != 0) {
                                arrayList24 = arrayList25;
                                arrayList23 = arrayList23;
                                arrayList5 = arrayList21;
                                f(arrayList5, barItem.mRect, f2);
                            } else {
                                arrayList24 = arrayList25;
                                ArrayList arrayList26 = arrayList23;
                                f(arrayList26, barItem.mRect, f2);
                                arrayList23 = arrayList26;
                                arrayList5 = arrayList21;
                            }
                            break;
                        case 1:
                            arrayList20 = arrayList20;
                            arrayList3 = arrayList2;
                            if (barItem.index % 2 == 0) {
                                arrayList4 = arrayList;
                                f(arrayList4, barItem.mRect, f2);
                                i = i3;
                            } else {
                                size = size;
                                arrayList4 = arrayList;
                                i = i3;
                                ArrayList arrayList27 = arrayList24;
                                f(arrayList27, barItem.mRect, f2);
                                arrayList24 = arrayList27;
                            }
                            arrayList5 = arrayList21;
                            break;
                        case 2:
                            if (barItem.index % 2 == 0) {
                                f(arrayList17, barItem.mRect, f2);
                                arrayList3 = arrayList2;
                            } else {
                                arrayList3 = arrayList2;
                                f(arrayList3, barItem.mRect, f2);
                            }
                            arrayList4 = arrayList;
                            i = i3;
                            arrayList5 = arrayList21;
                            break;
                        case 3:
                            if (barItem.index % 2 == 0) {
                                f(arrayList11, barItem.mRect, f2);
                            } else {
                                f(arrayList12, barItem.mRect, f2);
                            }
                            arrayList3 = arrayList2;
                            arrayList4 = arrayList;
                            i = i3;
                            arrayList5 = arrayList21;
                            break;
                        case 4:
                            if (barItem.index % 2 == 0) {
                                f(arrayList19, barItem.mRect, f2);
                            } else {
                                f(arrayList20, barItem.mRect, f2);
                            }
                            arrayList3 = arrayList2;
                            arrayList4 = arrayList;
                            i = i3;
                            arrayList5 = arrayList21;
                            break;
                        case 5:
                            if (barItem.index % 2 == 0) {
                                f(arrayList13, barItem.mRect, f2);
                            } else {
                                f(arrayList14, barItem.mRect, f2);
                            }
                            arrayList3 = arrayList2;
                            arrayList4 = arrayList;
                            i = i3;
                            arrayList5 = arrayList21;
                            break;
                        case 6:
                            if (barItem.index % 2 == 0) {
                                f(arrayList15, barItem.mRect, f2);
                            } else {
                                f(arrayList16, barItem.mRect, f2);
                            }
                            arrayList3 = arrayList2;
                            arrayList4 = arrayList;
                            i = i3;
                            arrayList5 = arrayList21;
                            break;
                        default:
                            arrayList3 = arrayList2;
                            arrayList4 = arrayList;
                            i = i3;
                            arrayList5 = arrayList21;
                            break;
                    }
                    arrayList21 = arrayList5;
                    if (barItem.index == DynamicDetailChart.this.q) {
                        arrayList6 = arrayList22;
                        f(arrayList6, barItem.mRect, f2);
                    } else {
                        arrayList6 = arrayList22;
                    }
                    arrayList18 = arrayList3;
                    arrayList9 = arrayList4;
                    arrayList22 = arrayList6;
                    arrayList20 = arrayList20;
                    it2 = it3;
                    i2 = i;
                    size = size;
                }
                c(canvas, arrayList13, this.g.paint);
                c(canvas, arrayList14, this.g.deepPaint);
                c(canvas, arrayList15, this.h.paint);
                c(canvas, arrayList16, this.h.deepPaint);
                c(canvas, arrayList19, this.f.paint);
                c(canvas, arrayList20, this.f.deepPaint);
                c(canvas, arrayList11, this.e.paint);
                c(canvas, arrayList12, this.e.deepPaint);
                c(canvas, arrayList17, this.d.paint);
                c(canvas, arrayList18, this.d.deepPaint);
                c(canvas, arrayList9, this.c.paint);
                c(canvas, arrayList24, this.c.deepPaint);
                c(canvas, arrayList23, this.b.paint);
                c(canvas, arrayList21, this.b.deepPaint);
                d(canvas, arrayList22);
            }
        }

        public void f(List<Float> list, RectF rectF, float f) {
            list.add(Float.valueOf(rectF.left));
            list.add(Float.valueOf(rectF.bottom));
            list.add(Float.valueOf(rectF.left));
            list.add(Float.valueOf(rectF.bottom - (rectF.height() * f)));
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemHeight(RectF rectF, BarChart.BarItem barItem) {
            return a(rectF, barItem.value);
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemOffsetX(RectF rectF, BarChart.BarItem barItem) {
            return ((((rectF.width() - this.mPaddingLeft) - this.mPaddingRight) / e()) * (barItem.index - DynamicDetailChart.this.h)) + this.mPaddingLeft;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemWidth(RectF rectF, BarChart.BarItem barItem) {
            return 0.0f;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
        public void onItemsChanged(List<BarChart.BarItem> list) {
            super.onItemsChanged(list);
            this.mMaxItemValue = ChartUtil.updateMaxItemValue(list, 0, 250);
            DynamicDetailChart.this.j = 0;
            DynamicDetailChart.this.k = 23;
            DynamicDetailChart.this.h = 0;
            DynamicDetailChart.this.i = 1439;
            if (DynamicDetailChart.this.w) {
                DynamicDetailChart.this.i = 119;
            }
            DynamicDetailChart.this.mXAxis.notifyChanged();
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public void realignItems(RectF rectF, List<? extends BarChart.BarItem> list) {
            super.realignItems(rectF, list);
            float fB = b(this.mRect);
            this.b.paint.setStrokeWidth(fB);
            this.b.deepPaint.setStrokeWidth(fB);
            this.c.paint.setStrokeWidth(fB);
            this.c.deepPaint.setStrokeWidth(fB);
            this.b.paint.setStrokeWidth(fB);
            this.b.deepPaint.setStrokeWidth(fB);
            this.e.paint.setStrokeWidth(fB);
            this.e.deepPaint.setStrokeWidth(fB);
            this.g.paint.setStrokeWidth(fB);
            this.g.deepPaint.setStrokeWidth(fB);
            this.d.paint.setStrokeWidth(fB);
            this.d.deepPaint.setStrokeWidth(fB);
            this.f.paint.setStrokeWidth(fB);
            this.f.deepPaint.setStrokeWidth(fB);
            this.h.paint.setStrokeWidth(fB);
            this.h.deepPaint.setStrokeWidth(fB);
            this.i.paint.setStrokeWidth(fB);
        }
    }

    public class DynamicLineChart extends b {
        private Path b;
        private Paint c;
        private Paint d;
        private Paint e;
        private float f;
        private Path g;
        private Paint h;

        public DynamicLineChart(Context context) {
            super(context);
            if (DynamicDetailChart.this.t == null) {
                DynamicDetailChart.this.t = new LineChartAttr();
            }
            this.b = new Path();
            this.f = this.mDensity * 4.0f;
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint(1);
            this.e = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.e.setStrokeWidth(this.mDensity * 3.0f);
            this.e.setColor(DynamicDetailChart.this.t.pathColor);
            Paint paint3 = new Paint(1);
            this.d = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            this.d.setStrokeWidth((float) (((double) this.mDensity) * 0.33d));
            this.d.setColor(DynamicDetailChart.this.t.verticalLineColor);
            this.g = new Path();
            Paint paint4 = new Paint(1);
            this.h = paint4;
            paint4.setStyle(Paint.Style.FILL);
        }

        private void b(Canvas canvas, List<PointF> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                PointF pointF = list.get(i);
                this.c.setColor(DynamicDetailChart.this.t.circleOuterColor);
                canvas.drawCircle(pointF.x, pointF.y, this.f, this.c);
                this.c.setColor(DynamicDetailChart.this.t.circleInnerColor);
                canvas.drawCircle(pointF.x, pointF.y, this.f / 2.0f, this.c);
            }
        }

        private int c() {
            return ((DynamicDetailChart.this.i - DynamicDetailChart.this.h) + 1) / DynamicDetailChart.this.m;
        }

        public float a(RectF rectF, int i) {
            float fHeight = (rectF.height() - this.mPaddingTop) - this.mPaddingBottom;
            if (i <= 0) {
                return 0.0f;
            }
            return (i / this.mMaxItemValue) * fHeight;
        }

        @Override // com.huami.watch.dataflow.chart.DynamicDetailChart.b, com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
        public void draw(Canvas canvas, RectF rectF, float f) {
            boolean z;
            float f2;
            ArrayList arrayList = new ArrayList();
            this.b.reset();
            this.g.reset();
            synchronized (this.mItems) {
                int iC = c();
                int i = 0;
                for (int i2 = 0; i2 < iC; i2++) {
                    float offsetX = getOffsetX(rectF, i2);
                    canvas.drawLine(offsetX, rectF.top, offsetX, rectF.bottom, this.d);
                }
                int size = this.mItems.size();
                float f3 = 0.0f;
                float f4 = 0.0f;
                boolean z2 = false;
                int i3 = 0;
                while (i < size) {
                    BarChart.BarItem barItem = (BarChart.BarItem) this.mItems.get(i);
                    float offsetX2 = getOffsetX(rectF, barItem.index);
                    float fA = rectF.bottom - a(rectF, barItem.value);
                    float f5 = this.f;
                    float f6 = fA + f5;
                    float f7 = f3;
                    float f8 = rectF.bottom;
                    if (f6 > f8) {
                        fA = f8 - f5;
                    }
                    float f9 = fA - f5;
                    float f10 = rectF.top;
                    if (f9 < f10) {
                        fA = f10 + f5;
                    }
                    if (z2) {
                        z = z2;
                        f2 = f7;
                    } else {
                        f2 = fA;
                        z = true;
                    }
                    if (f2 < fA) {
                        f2 = fA;
                    }
                    arrayList.add(new PointF(offsetX2, fA));
                    if (i == 0 || Math.abs(barItem.index - i3) > 1) {
                        this.b.moveTo(offsetX2, fA);
                        if (i != 0) {
                            this.g.lineTo(f4, rectF.bottom);
                        }
                        this.g.moveTo(offsetX2, rectF.bottom);
                        this.g.lineTo(offsetX2, fA);
                    } else {
                        this.b.lineTo(offsetX2, fA);
                        this.g.lineTo(offsetX2, fA);
                    }
                    if (i == size - 1) {
                        this.g.lineTo(offsetX2, rectF.bottom);
                    }
                    i3 = barItem.index;
                    i++;
                    f3 = f2;
                    f4 = offsetX2;
                    z2 = z;
                }
                if (DynamicDetailChart.this.t.showShadow) {
                    this.h.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF.bottom, DynamicDetailChart.this.t.shadowStartColor, DynamicDetailChart.this.t.shadowEndColor, Shader.TileMode.CLAMP));
                    canvas.drawPath(this.g, this.h);
                }
                canvas.drawPath(this.b, this.e);
                b(canvas, arrayList);
            }
        }

        public float getOffsetX(RectF rectF, int i) {
            return (((((rectF.width() - this.mPaddingLeft) - this.mPaddingRight) - (this.f * 2.0f)) / (c() - 1)) * (i - DynamicDetailChart.this.h)) + this.mPaddingLeft + this.f;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemHeight(RectF rectF, BarChart.BarItem barItem) {
            return a(rectF, barItem.value);
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemOffsetX(RectF rectF, BarChart.BarItem barItem) {
            return ((((rectF.width() - this.mPaddingLeft) - this.mPaddingRight) / c()) * (barItem.index - DynamicDetailChart.this.h)) + this.mPaddingLeft;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemWidth(RectF rectF, BarChart.BarItem barItem) {
            return 0.0f;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
        public void onItemsChanged(List<BarChart.BarItem> list) {
            super.onItemsChanged(list);
            this.mMaxItemValue = ChartUtil.updateMaxItemValue(list, 0, DynamicDetailChart.this.t.maxValue);
            DynamicDetailChart dynamicDetailChart = DynamicDetailChart.this;
            dynamicDetailChart.h = dynamicDetailChart.t.startTime;
            DynamicDetailChart dynamicDetailChart2 = DynamicDetailChart.this;
            dynamicDetailChart2.i = dynamicDetailChart2.t.endTime - 1;
            this.e.setColor(DynamicDetailChart.this.t.pathColor);
            this.d.setColor(DynamicDetailChart.this.t.verticalLineColor);
            DynamicDetailChart.this.mXAxis.notifyChanged();
        }
    }

    public class DynamicSleepBarChart extends b {
        public DynamicSleepBarChart(Context context) {
            super(context);
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemHeight(RectF rectF, BarChart.BarItem barItem) {
            int i = barItem.value;
            if (i != 3 && i != 2 && i != 1 && i != 4) {
                return 0.0f;
            }
            float f = this.mDensity;
            return f * 145.0f;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemOffsetX(RectF rectF, BarChart.BarItem barItem) {
            if (barItem.index > DynamicDetailChart.this.i || barItem.index < DynamicDetailChart.this.h || DynamicDetailChart.this.h == DynamicDetailChart.this.i) {
                return 0.0f;
            }
            return ((((rectF.width() - this.mPaddingLeft) - this.mPaddingRight) / ((DynamicDetailChart.this.i - DynamicDetailChart.this.h) + 1)) * (barItem.index - DynamicDetailChart.this.h)) + this.mPaddingLeft;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemWidth(RectF rectF, BarChart.BarItem barItem) {
            if (barItem.index > DynamicDetailChart.this.i || barItem.index < DynamicDetailChart.this.h || DynamicDetailChart.this.h == DynamicDetailChart.this.i) {
                return 0.0f;
            }
            float fWidth = ((((rectF.width() - this.mPaddingLeft) - this.mPaddingRight) / ((DynamicDetailChart.this.i - DynamicDetailChart.this.h) + 1)) * barItem.scope) - (this.mItemPadding * 2.0f);
            float f = this.mDensity;
            return fWidth < f * 1.0f ? f * 1.0f : fWidth;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
        public void onItemsChanged(List<BarChart.BarItem> list) {
            if (DynamicDetailChart.this.h == DynamicDetailChart.this.i) {
                return;
            }
            super.onItemsChanged(list);
        }
    }

    public class DynamicSportBarChart extends b {
        private static final int r = 8;
        private Path b;
        private Path c;
        private Paint d;
        private Paint e;
        private Paint f;
        private Paint g;
        private Paint h;
        private float i;
        private float j;
        private float k;
        private boolean l;
        private Path m;
        private List<DynamicDetailBarItem> n;
        private int o;
        private boolean p;

        public DynamicSportBarChart(Context context) {
            super(context);
            this.l = false;
            this.o = -1;
            this.p = false;
            this.c = new Path();
            this.b = new Path();
            Paint paint = new Paint(1);
            this.e = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.e.setStrokeWidth(this.mDensity * 1.0f);
            this.e.setColor(DynamicDetailChart.this.r.chartColor);
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL);
            this.d.setStrokeWidth((this.mDensity * 1.0f) + 0.5f);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, (this.mDensity * 205.0f) + 0.5f, DynamicDetailChart.this.r.shadowStartColor, DynamicDetailChart.this.r.shadowEndColor, Shader.TileMode.CLAMP);
            this.p = DynamicDetailChart.this.r.valueArrayX != null;
            Paint paint3 = new Paint(1);
            this.h = paint3;
            paint3.setStyle(Paint.Style.FILL);
            if (DynamicDetailChart.this.r.supportSecondChart) {
                Paint paint4 = new Paint(1);
                this.f = paint4;
                paint4.setStyle(Paint.Style.STROKE);
                this.f.setStrokeWidth(this.mDensity * 1.0f);
                this.m = new Path();
                Paint paint5 = new Paint(1);
                this.g = paint5;
                paint5.setStyle(Paint.Style.STROKE);
                this.g.setStrokeWidth((this.mDensity * 1.0f) + 0.5f);
                if (this.p) {
                    this.g.setColor(-16777216);
                } else {
                    this.g.setColor(-1);
                }
                Paint paint6 = this.g;
                float f = this.mDensity;
                paint6.setPathEffect(new DashPathEffect(new float[]{4.0f * f, f * 2.0f}, 0.0f));
                linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, (this.mDensity * 250.0f) + 0.5f, DynamicDetailChart.this.r.shadowStartColor, DynamicDetailChart.this.r.shadowEndColor, Shader.TileMode.CLAMP);
            }
            this.d.setShader(linearGradient);
        }

        private void c(Canvas canvas, PointF[] pointFArr) {
            float f = this.mRect.bottom + (this.mDensity * 8.0f);
            float fJ = j(8);
            this.e.setStyle(Paint.Style.STROKE);
            int i = 0;
            PointF pointF = pointFArr[0];
            this.b.moveTo(pointF.x, f);
            this.b.lineTo(pointF.x, pointF.y);
            this.c.moveTo(pointF.x, pointF.y);
            while (i < pointFArr.length - 1) {
                PointF pointF2 = pointFArr[i];
                i++;
                PointF pointF3 = pointFArr[i];
                float f2 = pointF3.x;
                float f3 = pointF2.x;
                if (f2 - f3 > fJ) {
                    this.b.lineTo(f3, f);
                    this.b.lineTo(pointF3.x, f);
                    this.b.lineTo(pointF3.x, pointF3.y);
                    this.c.moveTo(pointF3.x, pointF3.y);
                } else {
                    this.b.quadTo(f3, pointF2.y, f2, pointF3.y);
                    this.c.quadTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y);
                }
            }
            this.b.lineTo(pointFArr[pointFArr.length - 1].x, f);
            canvas.drawPath(this.b, this.d);
            canvas.drawPath(this.c, this.e);
        }

        private void d(Canvas canvas, RectF rectF) {
            if (DynamicDetailChart.this.p) {
                return;
            }
            this.e.setColor(DynamicDetailChart.this.r.chartColor);
            this.b.rewind();
            this.c.rewind();
            ArrayList arrayList = new ArrayList();
            int size = this.mItems.size();
            synchronized (this.mItems) {
                this.e.setStyle(Paint.Style.FILL);
                for (int i = 0; i < size; i++) {
                    BarChart.BarItem barItem = (BarChart.BarItem) this.mItems.get(i);
                    arrayList.add(new PointF(itemOffsetX(rectF, barItem), rectF.bottom - a(rectF, barItem.sportValue)));
                }
                PointF[] pointFArr = (PointF[]) arrayList.toArray(new PointF[arrayList.size()]);
                if (this.p) {
                    e(canvas, rectF, pointFArr);
                } else if (arrayList.size() > 2) {
                    c(canvas, pointFArr);
                }
            }
        }

        private void e(Canvas canvas, RectF rectF, PointF[] pointFArr) {
            float f = this.mDensity * 3.0f;
            this.e.setStyle(Paint.Style.FILL);
            for (int i = 0; i < pointFArr.length; i++) {
                if (i == 0) {
                    this.c.moveTo(pointFArr[i].x, pointFArr[i].y);
                } else {
                    this.c.lineTo(pointFArr[i].x, pointFArr[i].y);
                }
                this.e.setColor(DynamicDetailChart.this.r.chartColor);
                canvas.drawCircle(pointFArr[i].x, pointFArr[i].y, f, this.e);
            }
            this.e.setStyle(Paint.Style.STROKE);
            this.e.setColor(DynamicDetailChart.this.r.chartColor);
            canvas.drawPath(this.c, this.e);
        }

        private void f(Canvas canvas, RectF rectF) {
            if (DynamicDetailChart.this.s == null || this.n == null) {
                return;
            }
            this.f.setColor(DynamicDetailChart.this.s.chartColor);
            this.m.rewind();
            ArrayList arrayList = new ArrayList();
            synchronized (this.n) {
                for (int i = 0; i < this.n.size(); i++) {
                    DynamicDetailBarItem dynamicDetailBarItem = this.n.get(i);
                    arrayList.add(new PointF(itemOffsetX(rectF, dynamicDetailBarItem), rectF.bottom - b(rectF, dynamicDetailBarItem.sportValue)));
                }
                if (arrayList.size() > 2) {
                    g(canvas, (PointF[]) arrayList.toArray(new PointF[arrayList.size()]));
                }
            }
        }

        private void g(Canvas canvas, PointF[] pointFArr) {
            float fJ = j(8);
            int i = 0;
            PointF pointF = pointFArr[0];
            this.m.moveTo(pointF.x, pointF.y);
            while (i < pointFArr.length - 1) {
                PointF pointF2 = pointFArr[i];
                i++;
                PointF pointF3 = pointFArr[i];
                float f = pointF3.x;
                float f2 = pointF2.x;
                if (f - f2 > fJ) {
                    this.m.moveTo(f, pointF3.y);
                } else {
                    this.m.quadTo(f2, pointF2.y, f, pointF3.y);
                }
            }
            canvas.drawPath(this.m, this.f);
        }

        private void h(Canvas canvas, RectF rectF) {
            float fItemOffsetX;
            float fA;
            float f = this.mDensity * 3.0f;
            if (this.mItems != null && DynamicDetailChart.this.r != null) {
                int size = this.mItems.size();
                if (DynamicDetailChart.this.q < 0 || DynamicDetailChart.this.q >= size) {
                    fItemOffsetX = -1.0f;
                    fA = -1.0f;
                } else {
                    BarChart.BarItem barItem = (BarChart.BarItem) this.mItems.get(DynamicDetailChart.this.q);
                    fItemOffsetX = itemOffsetX(rectF, barItem);
                    fA = rectF.bottom - a(rectF, barItem.sportValue);
                }
                if (fItemOffsetX != -1.0f && fA != -1.0f) {
                    float f2 = this.p ? 0.0f : 10.0f * this.mDensity;
                    Path path = new Path();
                    path.moveTo(fItemOffsetX, rectF.bottom + f2);
                    path.lineTo(fItemOffsetX, fA);
                    canvas.drawPath(path, this.g);
                    this.h.setColor(DynamicDetailChart.this.r.chartColor);
                    canvas.drawCircle(fItemOffsetX, fA, f, this.h);
                    this.h.setColor(-1);
                    canvas.drawCircle(fItemOffsetX, fA, f / 2.0f, this.h);
                }
            }
            if (this.n == null || DynamicDetailChart.this.s == null) {
                return;
            }
            int size2 = this.n.size();
            int i = this.o;
            if (i < 0 || i >= size2) {
                return;
            }
            DynamicDetailBarItem dynamicDetailBarItem = this.n.get(i);
            float fItemOffsetX2 = itemOffsetX(rectF, dynamicDetailBarItem);
            float fB = rectF.bottom - b(rectF, dynamicDetailBarItem.sportValue);
            if (fItemOffsetX2 == -1.0f || fB == -1.0f) {
                return;
            }
            this.h.setColor(DynamicDetailChart.this.s.chartColor);
            canvas.drawCircle(fItemOffsetX2, fB, f, this.h);
        }

        private int i() {
            return (DynamicDetailChart.this.i - DynamicDetailChart.this.h) + 1;
        }

        private float j(int i) {
            return (((this.mRect.width() - this.mPaddingLeft) - this.mPaddingRight) * i) / 200.0f;
        }

        public float a(RectF rectF, float f) {
            float f2;
            float fHeight = (rectF.height() - this.mPaddingTop) - this.mPaddingBottom;
            if (this.l) {
                float f3 = this.j;
                float f4 = this.k;
                f2 = f3 - f4;
                f -= f4;
            } else {
                f2 = this.j;
            }
            return f2 == 0.0f ? fHeight : Math.abs((f / f2) * fHeight);
        }

        public float b(RectF rectF, float f) {
            float f2;
            if (DynamicDetailChart.this.s == null) {
                return 0.0f;
            }
            float fHeight = (rectF.height() - this.mPaddingTop) - this.mPaddingBottom;
            if (this.l) {
                f2 = DynamicDetailChart.this.s.maxSportValue - DynamicDetailChart.this.s.minSportValue;
                f -= DynamicDetailChart.this.s.minSportValue;
            } else {
                f2 = DynamicDetailChart.this.s.maxSportValue;
            }
            return f2 == 0.0f ? fHeight : Math.abs((f / f2) * fHeight);
        }

        public int calcIndex(float f) {
            RectF rectF = this.mRect;
            float f2 = f - rectF.left;
            if (f2 < 0.0f) {
                return -1;
            }
            float fWidth = rectF.width();
            float f3 = this.mPaddingLeft;
            float fI = ((f2 - f3) * i()) / ((fWidth - f3) - this.mPaddingRight);
            int size = this.mItems.size();
            for (int i = 0; i < size; i++) {
                if (fI <= ((BarChart.BarItem) this.mItems.get(i)).scope) {
                    return i;
                }
            }
            return -1;
        }

        public int calcSecondChartIndex(float f) {
            List<DynamicDetailBarItem> list;
            int size;
            float f2 = f - this.mRect.left;
            if (f2 < 0.0f || (list = this.n) == null || (size = list.size()) == 0) {
                return -1;
            }
            float fWidth = this.mRect.width();
            float f3 = this.mPaddingLeft;
            float fI = ((f2 - f3) * i()) / ((fWidth - f3) - this.mPaddingRight);
            for (int i = 0; i < size; i++) {
                if (fI <= this.n.get(i).scope) {
                    return i;
                }
            }
            return -1;
        }

        @Override // com.huami.watch.dataflow.chart.DynamicDetailChart.b, com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
        public void draw(Canvas canvas, RectF rectF, float f) {
            d(canvas, rectF);
            if (DynamicDetailChart.this.r.supportSecondChart) {
                f(canvas, rectF);
            }
            h(canvas, rectF);
        }

        public float getAvgSportValue() {
            return this.i;
        }

        public float getMaxSportValue() {
            return this.j;
        }

        public float getMinSportValue() {
            return this.k;
        }

        public BarChart.BarItem getSecondChartItem(int i) {
            List<DynamicDetailBarItem> list = this.n;
            if (list == null) {
                return null;
            }
            int size = list.size();
            if (i < 0 || i >= size) {
                return null;
            }
            return this.n.get(i);
        }

        public float getSecondChartValue(int i) {
            List<DynamicDetailBarItem> list = this.n;
            if (list == null) {
                return -2.1474836E9f;
            }
            int size = list.size();
            if (i < 0 || i >= size) {
                return -2.1474836E9f;
            }
            return this.n.get(i).sportValue;
        }

        public boolean getSupportNegative() {
            return this.l;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemHeight(RectF rectF, BarChart.BarItem barItem) {
            return a(rectF, barItem.sportValue);
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemOffsetX(RectF rectF, BarChart.BarItem barItem) {
            return ((((rectF.width() - this.mPaddingLeft) - this.mPaddingRight) / i()) * (barItem.scope - DynamicDetailChart.this.h)) + this.mPaddingLeft + rectF.left;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemWidth(RectF rectF, BarChart.BarItem barItem) {
            return 0.0f;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
        public void onItemsChanged(List<BarChart.BarItem> list) {
            super.onItemsChanged(list);
            DynamicDetailChart.this.mXAxis.notifyChanged();
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public void realignItems(RectF rectF, List<? extends BarChart.BarItem> list) {
            super.realignItems(rectF, list);
        }

        public void setAvgSportValue(float f) {
            this.i = f;
        }

        public void setMaxSportValue(float f) {
            this.j = f;
        }

        public void setMinSportValue(float f) {
            this.k = f;
        }

        public void setSecondChartData(List<DynamicDetailBarItem> list) {
            this.n = list;
        }

        public void setSecondChartSelectedIndex(int i) {
            this.o = i;
        }

        public void setSupportNegative(boolean z) {
            this.l = z;
        }
    }

    public class DynamicStepBarChart extends b {
        private float b;
        private int c;
        private float d;
        private Renderer e;
        private Renderer f;
        private Renderer g;

        public DynamicStepBarChart(Context context) {
            super(context);
            this.c = 10;
            ColorRenderer colorRenderer = new ColorRenderer(-11236097);
            this.e = colorRenderer;
            colorRenderer.paint.setStrokeCap(Paint.Cap.ROUND);
            ColorRenderer colorRenderer2 = new ColorRenderer(ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR);
            this.f = colorRenderer2;
            colorRenderer2.paint.setStrokeCap(Paint.Cap.ROUND);
            ColorRenderer colorRenderer3 = new ColorRenderer(-1722512129);
            this.g = colorRenderer3;
            colorRenderer3.paint.setStrokeCap(Paint.Cap.ROUND);
        }

        private void a(RectF rectF) {
            if (rectF != null) {
                this.d = b(rectF);
                this.b = ChartUtil.updateLevelSize(this.mMaxItemValue, (((rectF.height() - this.mPaddingTop) - this.mPaddingBottom) - this.mItemBaseHeight) - this.d, this.c);
                this.e.paint.setStrokeWidth(this.d);
                this.g.paint.setStrokeWidth(this.d);
                this.f.paint.setStrokeWidth(this.d);
            }
        }

        private float b(RectF rectF) {
            return (((rectF.width() - this.mPaddingLeft) - this.mPaddingRight) / itemsCount()) - (this.mItemPadding * 2.0f);
        }

        public int calcIndex(float f) {
            if (f < 0.0f) {
                return -1;
            }
            float fWidth = (this.mRect.width() - this.mPaddingLeft) - this.mPaddingRight;
            int iItemsCount = itemsCount();
            int i = (int) (((f - this.mPaddingLeft) * iItemsCount) / fWidth);
            return i >= iItemsCount ? iItemsCount - 1 : i;
        }

        @Override // com.huami.watch.dataflow.chart.DynamicDetailChart.b, com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
        public void draw(Canvas canvas, RectF rectF, float f) {
            synchronized (this.mItems) {
                int size = this.mItems.size();
                int i = size * 4;
                float[] fArr = new float[i];
                float[] fArr2 = new float[i];
                float[] fArr3 = new float[i];
                int i2 = 0;
                float f2 = 0.6f;
                for (T t : this.mItems) {
                    float f3 = 1.0f;
                    if (f == 1.0f || f == 0.0f) {
                        f3 = f;
                    } else {
                        float f4 = f / (1.0f - ((i2 * f2) / size));
                        if (f4 <= 1.0f) {
                            f3 = f4;
                        }
                    }
                    if (t.value > 0) {
                        int i3 = i2 * 4;
                        RectF rectF2 = t.mRect;
                        float f5 = rectF2.left;
                        fArr[i3] = f5;
                        float f6 = rectF2.bottom;
                        fArr[i3 + 1] = f6;
                        fArr[i3 + 2] = f5;
                        fArr[i3 + 3] = f6 - (rectF2.height() * f3);
                    } else {
                        int i4 = i2 * 4;
                        RectF rectF3 = t.mRect;
                        float f7 = rectF3.left;
                        fArr2[i4] = f7;
                        float f8 = rectF3.bottom;
                        fArr2[i4 + 1] = f8;
                        fArr2[i4 + 2] = f7;
                        fArr2[i4 + 3] = f8 - rectF3.height();
                    }
                    if (t.index == DynamicDetailChart.this.q && t.value > 0) {
                        int i5 = i2 * 4;
                        RectF rectF4 = t.mRect;
                        float f9 = rectF4.left;
                        fArr3[i5] = f9;
                        float f10 = rectF4.bottom;
                        fArr3[i5 + 1] = f10;
                        fArr3[i5 + 2] = f9;
                        fArr3[i5 + 3] = f10 - (rectF4.height() * f3);
                    }
                    i2++;
                    f2 = 0.6f;
                }
                canvas.drawLines(fArr, this.e.paint);
                canvas.drawLines(fArr2, this.g.paint);
                canvas.drawLines(fArr3, this.f.paint);
            }
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemHeight(RectF rectF, BarChart.BarItem barItem) {
            int i = barItem.value;
            int i2 = this.mMaxItemValue;
            return i >= i2 ? (((rectF.height() - this.mPaddingTop) - this.mPaddingBottom) - this.mItemBaseHeight) - this.d : ChartUtil.itemLevelSize(i2, i, this.b, this.c) + this.mItemBaseHeight;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemOffsetX(RectF rectF, BarChart.BarItem barItem) {
            return ((((rectF.width() - this.mPaddingLeft) - this.mPaddingRight) / itemsCount()) * (barItem.index - DynamicDetailChart.this.h)) + this.mPaddingLeft;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemWidth(RectF rectF, BarChart.BarItem barItem) {
            return this.d;
        }

        @Override // com.huami.watch.dataflow.chart.base.BaseChart
        public int itemsCount() {
            return ((DynamicDetailChart.this.i - DynamicDetailChart.this.h) + 1) / DynamicDetailChart.this.m;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
        public void onItemsChanged(List<BarChart.BarItem> list) {
            super.onItemsChanged(list);
            this.mMaxItemValue = ChartUtil.updateMaxItemValue(list, 0, 1100);
            DynamicDetailChart.this.j = 0;
            DynamicDetailChart.this.k = 23;
            DynamicDetailChart.this.h = 0;
            DynamicDetailChart.this.i = 1439;
            DynamicDetailChart.this.mXAxis.notifyChanged();
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public void realignItems(RectF rectF, List<? extends BarChart.BarItem> list) {
            a(this.mRect);
            super.realignItems(rectF, list);
        }
    }

    public class DynamicTargetBarChart extends b {
        private float b;
        private Renderer c;
        private Renderer d;
        private Renderer e;
        private Renderer f;

        public DynamicTargetBarChart(Context context) {
            super(context);
            if (DynamicDetailChart.this.u == null) {
                DynamicDetailChart.this.u = new TargetChartAttr();
            }
            this.b = (this.mDensity * 9.0f) + 0.5f;
        }

        private void c(Canvas canvas, BarChart.BarItem barItem) {
            RectF rectF = new RectF();
            RectF rectF2 = barItem.mRect;
            rectF.left = rectF2.left;
            rectF.top = 0.0f;
            rectF.right = rectF2.right;
            rectF.bottom = rectF2.bottom;
            canvas.drawRect(rectF, this.d.paint);
        }

        private void d(Canvas canvas, DynamicDetailBarItem dynamicDetailBarItem) {
            RectF rectF = new RectF();
            RectF rectF2 = dynamicDetailBarItem.mRect;
            rectF.left = rectF2.left;
            rectF.top = rectF2.top;
            rectF.right = rectF2.right;
            rectF.bottom = rectF2.bottom;
            if (dynamicDetailBarItem.value > dynamicDetailBarItem.target) {
                this.e.paint.setColor(DynamicDetailChart.this.u.mNormalColor);
            } else {
                this.e.paint.setColor(DynamicDetailChart.this.u.mTargetColor);
            }
            canvas.drawRect(rectF, this.e.paint);
        }

        private void e(Canvas canvas, DynamicDetailBarItem dynamicDetailBarItem) {
            RectF rectF = new RectF();
            RectF rectF2 = dynamicDetailBarItem.mRect;
            rectF.left = rectF2.left;
            float f = rectF2.bottom;
            rectF.top = f - ((f / this.mMaxItemValue) * dynamicDetailBarItem.target);
            rectF.right = rectF2.right;
            rectF.bottom = f;
            canvas.drawRect(rectF, this.f.paint);
        }

        @Override // com.huami.watch.dataflow.chart.DynamicDetailChart.b, com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
        public void draw(Canvas canvas, RectF rectF, float f) {
            synchronized (this.mItems) {
                for (T t : this.mItems) {
                    DynamicDetailBarItem dynamicDetailBarItem = (DynamicDetailBarItem) t;
                    c(canvas, t);
                    if (dynamicDetailBarItem.value > 0) {
                        d(canvas, dynamicDetailBarItem);
                        if (dynamicDetailBarItem.value > dynamicDetailBarItem.target) {
                            e(canvas, dynamicDetailBarItem);
                        }
                    }
                }
            }
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemHeight(RectF rectF, BarChart.BarItem barItem) {
            float fHeight = (rectF.height() - this.mPaddingTop) - this.mPaddingBottom;
            int i = barItem.value;
            if (i <= 0) {
                return 0.0f;
            }
            return (i / this.mMaxItemValue) * fHeight;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemOffsetX(RectF rectF, BarChart.BarItem barItem) {
            float fWidth = (rectF.width() - this.mPaddingLeft) - this.mPaddingRight;
            float f = barItem.index - DynamicDetailChart.this.h;
            return (this.b * f) + (((fWidth - (this.b * itemsCount())) / (itemsCount() - 1)) * f) + this.mPaddingLeft;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemWidth(RectF rectF, BarChart.BarItem barItem) {
            return this.b;
        }

        @Override // com.huami.watch.dataflow.chart.base.BaseChart
        public int itemsCount() {
            return ((DynamicDetailChart.this.i - DynamicDetailChart.this.h) + 1) / DynamicDetailChart.this.m;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
        public void onItemsChanged(List<BarChart.BarItem> list) {
            super.onItemsChanged(list);
            this.mMaxItemValue = ChartUtil.updateMaxItemValue(list, 0, DynamicDetailChart.this.u.maxValue);
            DynamicDetailChart.this.h = 0;
            DynamicDetailChart.this.i = 6;
            this.c = new ColorRenderer(DynamicDetailChart.this.u.mBottomColor);
            this.d = new ColorRenderer(DynamicDetailChart.this.u.mEmptyColor);
            this.e = new ColorRenderer(DynamicDetailChart.this.u.mNormalColor);
            this.f = new ColorRenderer(DynamicDetailChart.this.u.mTargetColor);
            DynamicDetailChart.this.mXAxis.notifyChanged();
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public void realignItems(RectF rectF, List<? extends BarChart.BarItem> list) {
            super.realignItems(rectF, list);
        }
    }

    public static class LineChartAttr {
        public int startTime;
        public int shadowStartColor = 1290819913;
        public int shadowEndColor = 15751497;
        public int verticalLineColor = -1184275;
        public int pathColor = SupportMenu.CATEGORY_MASK;
        public int circleInnerColor = -1;
        public int circleOuterColor = SupportMenu.CATEGORY_MASK;
        public boolean showShadow = false;
        public int endTime = 10;
        public int maxValue = 250;
    }

    public static class SleepChartAttr {
        public boolean showSleepTime = true;
    }

    public static class SportChartAttr {
        public float avgSportValue;
        public int chartColor;
        public int endTime;
        public String[] labelArrayY;
        public float maxSportValue;
        public float minSportValue;
        public float[] regionArray;
        public String[] regionColorArray;
        public int shadowEndColor;
        public int shadowStartColor;
        public int startTime;
        public String unitYName;
        public float[] valueArrayX;
        public float[] valueArrayY;
        public String tips = "";
        public String unitXName = "";
        public boolean supportNegative = true;
        public boolean supportSecondChart = false;
    }

    public static class TargetChartAttr {
        public int mBottomColor = -7880961;
        public int mEmptyColor = -723465;
        public int mNormalColor = -13148205;
        public int mTargetColor = -11371273;
        public int maxValue = 8000;
    }

    public class a extends BarChart.XAxis {
        private int a;
        private float b;
        private Paint c;
        private Paint d;

        public a(Context context) {
            super(context);
            this.a = 0;
            this.value = 24;
            this.offset = 0;
            TextPaint textPaint = new TextPaint(1);
            this.c = textPaint;
            textPaint.setColor(-6710887);
            int i = DynamicDetailChart.this.l;
            float f = 12.0f;
            if (i != 1) {
                if (i != 16) {
                    if (i == 4096) {
                        if (DynamicDetailChart.this.m == 1) {
                            this.c.setColor(-1728053248);
                        } else {
                            f = 10.0f;
                        }
                        Paint paint = new Paint(1);
                        this.d = paint;
                        paint.setColor(1289838160);
                        this.d.setStyle(Paint.Style.FILL);
                        this.d.setStrokeWidth((this.mDensity * 1.0f) + 0.5f);
                        if (!DynamicDetailChart.this.w) {
                            float f2 = this.mDensity;
                            setPadding(20.0f * f2, 0.0f, f2 * 10.0f, 0.0f);
                        }
                    } else if (i == 65536) {
                        Paint paint2 = new Paint(1);
                        this.d = paint2;
                        paint2.setColor(1728053247);
                        this.d.setStyle(Paint.Style.FILL);
                        this.d.setStrokeWidth(this.mDensity * 1.0f);
                        setPadding(0.0f, 0.0f, this.mDensity * 10.0f, 0.0f);
                    } else if (i == 1048576) {
                        float f3 = this.mDensity;
                        setPadding(f3 * 5.0f, 0.0f, f3 * 5.0f, 0.0f);
                    }
                } else if (!DynamicDetailChart.this.w) {
                    float f4 = this.mDensity;
                    setPadding(f4 * 1.0f, 0.0f, f4 * 1.0f, 0.0f);
                }
                this.c.setTextSize((f * this.mDensity) + 0.5f);
            }
            float f5 = this.mDensity;
            setPadding(f5 * 5.0f, 0.0f, f5 * 5.0f, 0.0f);
            f = 10.0f;
            this.c.setTextSize((f * this.mDensity) + 0.5f);
        }

        private void d(Canvas canvas, RectF rectF) {
            Rect rect = new Rect();
            float f = rectF.left + (this.mDensity * 6.0f);
            float fCenterY = rectF.centerY() - 0.5f;
            if (DynamicDetailChart.this.w) {
                f = rectF.left;
            }
            String time = ChartTimeUtil.formatTime(this.mContext, 0, true);
            this.c.getTextBounds(time, 0, time.length(), rect);
            rect.offset((int) f, (int) (fCenterY + (rect.height() / 2)));
            ChartUtil.drawTextCenter(canvas, new RectF(rect), time, this.c);
            float fCenterX = rectF.centerX();
            float fCenterY2 = rectF.centerY();
            if (DynamicDetailChart.this.w) {
                fCenterX = rectF.centerX();
            }
            String time2 = ChartTimeUtil.formatTime(this.mContext, 720, true);
            this.c.getTextBounds(time2, 0, time2.length(), rect);
            rect.offset((int) (fCenterX - (rect.width() / 2)), (int) (fCenterY2 + (rect.height() / 2)));
            ChartUtil.drawTextCenter(canvas, new RectF(rect), time2, this.c);
            float f2 = rectF.right - (this.mDensity * 12.0f);
            float fCenterY3 = rectF.centerY() - 0.5f;
            if (DynamicDetailChart.this.w) {
                f2 = rectF.right - (this.mDensity * 1.0f);
            }
            String time3 = ChartTimeUtil.formatTime(this.mContext, 1439, true);
            this.c.getTextBounds(time3, 0, time3.length(), rect);
            rect.offset((int) (f2 - rect.width()), (int) (fCenterY3 + (rect.height() / 2)));
            ChartUtil.drawTextCenter(canvas, new RectF(rect), time3, this.c);
        }

        private void e(Canvas canvas, RectF rectF) {
            float f;
            int iWidth;
            float fWidth;
            if (DynamicDetailChart.this.j == DynamicDetailChart.this.k) {
                return;
            }
            boolean z = DynamicDetailChart.this.m == 1;
            Rect rect = new Rect();
            float f2 = (this.mDensity * 4.0f) + 0.5f;
            float strokeWidth = this.d.getStrokeWidth();
            int i = !z ? ((DynamicDetailChart.this.k - DynamicDetailChart.this.j) + 1) / 6 : (DynamicDetailChart.this.k - DynamicDetailChart.this.j) + 1;
            float f3 = rectF.left;
            float f4 = rectF.top;
            canvas.drawLine(f3, f4 + strokeWidth, rectF.right - this.mPaddingRight, f4 + strokeWidth, this.d);
            int i2 = 0;
            while (i2 <= i) {
                String time24Hour = i2 == i ? "23:59" : ChartTimeUtil.formatTime24Hour((z ? i2 : i2 * 6) * 60);
                this.c.getTextBounds(time24Hour, 0, time24Hour.length(), rect);
                float fHeight = ((this.stroke + rect.height()) / 2.0f) + rectF.top;
                if (i2 == i) {
                    fWidth = (rectF.right - this.mPaddingRight) - rect.width();
                    float f5 = rectF.right;
                    float f6 = this.mPaddingRight;
                    float f7 = strokeWidth / 2.0f;
                    float f8 = rectF.top;
                    canvas.drawLine((f5 - f6) - f7, f8 + strokeWidth, (f5 - f6) - f7, f8 + f2 + strokeWidth, this.d);
                } else {
                    if (z) {
                        f = (i2 * this.b) + rectF.left + this.mPaddingLeft;
                        iWidth = rect.width() / 2;
                    } else {
                        f = (i2 * this.b * 6.0f) + rectF.left + this.mPaddingLeft;
                        iWidth = rect.width() / 2;
                    }
                    fWidth = f - iWidth;
                    canvas.drawLine(fWidth + (rect.width() / 2), rectF.top + strokeWidth, fWidth + (rect.width() / 2), rectF.top + f2 + strokeWidth, this.d);
                }
                canvas.drawText(time24Hour, fWidth, fHeight, this.c);
                i2++;
            }
        }

        private void f(Canvas canvas, RectF rectF) {
            float f;
            RectF rectF2 = rectF;
            if (DynamicDetailChart.this.h == DynamicDetailChart.this.i) {
                return;
            }
            int i = 1;
            Paint paint = new Paint(1);
            paint.setColor(-575491406);
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeWidth(this.mDensity * 0.33f);
            float strokeWidth = this.d.getStrokeWidth();
            float f2 = this.mDensity * 8.0f;
            float f3 = this.mPaddingLeft + rectF2.left;
            float f4 = rectF2.right - this.mPaddingRight;
            float f5 = rectF2.top + strokeWidth;
            canvas.drawLine(f3, f5, f4, f5, this.d);
            int length = DynamicDetailChart.this.r.valueArrayX.length - 1;
            int i2 = ((DynamicDetailChart.this.k - DynamicDetailChart.this.j) + 1) / length;
            float f6 = (this.mDensity * 4.0f) + 0.5f;
            Rect rect = new Rect();
            Locale locale = Locale.getDefault();
            float f7 = 0.0f;
            int i3 = 0;
            float f8 = 0.0f;
            int i4 = 0;
            while (i4 <= length) {
                float f9 = (i2 * i4 * this.b) + rectF2.left + this.mPaddingLeft;
                if (i4 > 0) {
                    Object[] objArr = new Object[i];
                    objArr[i3] = Float.valueOf(DynamicDetailChart.this.r.valueArrayX[i4]);
                    String str = String.format(locale, "%.2f", objArr);
                    this.c.getTextBounds(str, i3, str.length(), rect);
                    float fHeight = rectF2.top + strokeWidth + rect.height() + f2;
                    canvas.drawText(str, f9 - rect.width(), fHeight, this.c);
                    f = fHeight;
                } else {
                    f = f8;
                }
                if (i4 == length) {
                    f9 = rectF2.right - this.mPaddingRight;
                }
                float f10 = f9;
                float f11 = rectF2.top;
                canvas.drawLine(f10, f11 + strokeWidth, f10, f11 + f6 + strokeWidth, this.d);
                i4++;
                rectF2 = rectF;
                f8 = f;
                locale = locale;
                f7 = f10;
                i3 = 0;
                i = 1;
            }
            if (TextUtils.isEmpty(DynamicDetailChart.this.r.unitXName)) {
                return;
            }
            this.c.getTextBounds(DynamicDetailChart.this.r.unitXName, 0, DynamicDetailChart.this.r.unitXName.length(), rect);
            canvas.drawText(DynamicDetailChart.this.r.unitXName, f7 - rect.width(), f8 + (this.mDensity * 16.0f), this.c);
        }

        private void g(Canvas canvas, RectF rectF) {
            if (DynamicDetailChart.this.h == DynamicDetailChart.this.i) {
                return;
            }
            float strokeWidth = this.d.getStrokeWidth();
            float f = this.mDensity;
            float f2 = (4.0f * f) + 0.5f;
            float f3 = f * 8.0f;
            float f4 = rectF.left + this.mPaddingLeft;
            float f5 = rectF.right - this.mPaddingRight;
            float f6 = rectF.top + strokeWidth + (f * 8.0f);
            canvas.drawLine(f4, f6, f5, f6, this.d);
            int i = ((DynamicDetailChart.this.k - DynamicDetailChart.this.j) + 1) / 3;
            Rect rect = new Rect();
            int i2 = 0;
            while (i2 <= 3) {
                int i3 = i * i2;
                float f7 = (i3 * this.b) + rectF.left + this.mPaddingLeft;
                if (i2 > 0) {
                    String formatDurationTime = ChartTimeUtil.getFormatDurationTime(i3);
                    this.c.getTextBounds(formatDurationTime, 0, formatDurationTime.length(), rect);
                    canvas.drawText(formatDurationTime, f7 - rect.width(), rect.height() + f6 + f3, this.c);
                }
                float f8 = i2 == 3 ? rectF.right - this.mPaddingRight : f7;
                canvas.drawLine(f8, f6, f8, f6 + f2, this.d);
                i2++;
            }
        }

        private void h(Canvas canvas, RectF rectF) {
            if (DynamicDetailChart.this.h == DynamicDetailChart.this.i || DynamicDetailChart.this.s.labelArrayY == null) {
                return;
            }
            RectF rect = DynamicDetailChart.this.d.getRect();
            float f = this.mPaddingRight;
            float fB = rectF.top - DynamicDetailChart.this.d.b(rect, DynamicDetailChart.this.s.maxSportValue);
            float strokeWidth = (this.mDensity * 8.0f) + rectF.top + this.d.getStrokeWidth();
            float f2 = rect.right;
            canvas.drawLine(f2 - f, fB, f2 - f, strokeWidth, this.d);
            Rect rect2 = new Rect();
            int length = DynamicDetailChart.this.s.labelArrayY.length;
            float f3 = this.mDensity * 4.0f;
            String str = DynamicDetailChart.this.s.unitYName;
            if (!TextUtils.isEmpty(str)) {
                this.c.getTextBounds(str, 0, str.length(), rect2);
                canvas.drawText(str, (rectF.right - this.mPaddingRight) + f3, rect.top, this.c);
            }
            float f4 = rectF.right;
            float f5 = this.mPaddingRight;
            float f6 = f4 - f5;
            float f7 = this.mDensity;
            float f8 = f6 + (4.0f * f7);
            float f9 = (f4 - f5) + (f7 * 6.0f);
            int i = 0;
            while (i < length) {
                this.c.getTextBounds(DynamicDetailChart.this.s.labelArrayY[i], 0, DynamicDetailChart.this.s.labelArrayY[i].length(), rect2);
                float fB2 = rectF.top - DynamicDetailChart.this.d.b(rect, DynamicDetailChart.this.s.valueArrayY[i]);
                int i2 = i;
                canvas.drawLine(f6, fB2, f8, fB2, this.d);
                canvas.drawText(DynamicDetailChart.this.s.labelArrayY[i2], f9, fB2 + (rect2.height() / 2), this.c);
                i = i2 + 1;
            }
        }

        private void i(Canvas canvas, RectF rectF) {
            if (DynamicDetailChart.this.h == DynamicDetailChart.this.i) {
                return;
            }
            Rect rect = new Rect();
            float f = rectF.left + (this.mDensity * 6.0f);
            float fCenterY = rectF.centerY() - 0.5f;
            if (DynamicDetailChart.this.w) {
                f = rectF.left;
            }
            String time = ChartTimeUtil.formatTime(this.mContext, DynamicDetailChart.this.h, true);
            this.c.getTextBounds(time, 0, time.length(), rect);
            rect.offset((int) f, (int) (fCenterY + (rect.height() / 2)));
            ChartUtil.drawTextCenter(canvas, new RectF(rect), time, this.c);
            float f2 = rectF.right - (this.mDensity * 12.0f);
            float fCenterY2 = rectF.centerY() - 0.5f;
            if (DynamicDetailChart.this.w) {
                f2 = rectF.right - (this.mDensity * 1.0f);
            }
            String time2 = ChartTimeUtil.formatTime(this.mContext, DynamicDetailChart.this.i, true);
            this.c.getTextBounds(time2, 0, time2.length(), rect);
            rect.offset((int) (f2 - rect.width()), (int) (fCenterY2 + (rect.height() / 2)));
            ChartUtil.drawTextCenter(canvas, new RectF(rect), time2, this.c);
        }

        private void j(Canvas canvas, RectF rectF) {
            if (DynamicDetailChart.this.j == DynamicDetailChart.this.k) {
                return;
            }
            Rect rect = new Rect();
            int i = (DynamicDetailChart.this.k - DynamicDetailChart.this.j) + 1;
            int i2 = Integer.MIN_VALUE;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = DynamicDetailChart.this.j + i3;
                if (i4 < 0) {
                    i4 += 24;
                }
                if (i4 % 2 == 0 && i4 != i2) {
                    float f = this.mScroll;
                    float f2 = this.b;
                    float f3 = (f / f2) % 1.0f != 0.0f ? f % f2 : 0.0f;
                    String strValueOf = String.valueOf(i4);
                    this.c.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
                    canvas.drawText(strValueOf, ((i3 * this.b) - (rect.width() / 2)) + rectF.left + this.mPaddingLeft + f3, ((this.stroke + rect.height()) / 2.0f) + rectF.top, this.c);
                    i2 = i4;
                }
            }
        }

        private void k(Canvas canvas, RectF rectF) {
            if (DynamicDetailChart.this.h == DynamicDetailChart.this.i) {
                return;
            }
            for (BarChart.BarItem barItem : DynamicDetailChart.this.g.getItems()) {
                DynamicDetailBarItem dynamicDetailBarItem = (DynamicDetailBarItem) barItem;
                int i = dynamicDetailBarItem.value;
                if (i > 0) {
                    if (i >= dynamicDetailBarItem.target) {
                        Path path = new Path();
                        RectF rectF2 = barItem.mRect;
                        path.moveTo(rectF2.left + 2.0f, rectF2.bottom + (DynamicDetailChart.this.g.b / 2.0f));
                        path.lineTo(barItem.mRect.left + (DynamicDetailChart.this.g.b / 3.0f), (barItem.mRect.bottom + DynamicDetailChart.this.g.b) - 4.0f);
                        RectF rectF3 = barItem.mRect;
                        path.lineTo(rectF3.right - 2.0f, (float) (((double) ((rectF3.bottom + DynamicDetailChart.this.g.b) - (this.mDensity * 7.0f))) - 0.5d));
                        DynamicDetailChart.this.g.c.paint.setStyle(Paint.Style.STROKE);
                        DynamicDetailChart.this.g.c.paint.setStrokeWidth(8.0f);
                        canvas.drawPath(path, DynamicDetailChart.this.g.c.paint);
                    } else {
                        DynamicDetailChart.this.g.c.paint.setStyle(Paint.Style.FILL);
                        DynamicDetailChart.this.g.c.paint.setStrokeWidth(0.0f);
                        canvas.drawCircle(barItem.mRect.left + (DynamicDetailChart.this.g.b / 2.0f), (barItem.mRect.bottom + DynamicDetailChart.this.g.b) - (DynamicDetailChart.this.g.b / 2.0f), (float) ((((double) this.mDensity) * 1.5d) + 0.5d), DynamicDetailChart.this.g.c.paint);
                    }
                }
            }
        }

        private void l(Canvas canvas, RectF rectF) {
            if (DynamicDetailChart.this.h == DynamicDetailChart.this.i || DynamicDetailChart.this.r.labelArrayY == null) {
                return;
            }
            RectF rect = DynamicDetailChart.this.d.getRect();
            float strokeWidth = this.mPaddingLeft - (this.d.getStrokeWidth() / 2.0f);
            float f = this.mDensity;
            float f2 = strokeWidth + (0.5f * f);
            canvas.drawLine(rect.left + f2, rectF.top - DynamicDetailChart.this.d.a(rect, DynamicDetailChart.this.r.maxSportValue), rectF.left + f2, rectF.top + (f * 1.0f) + (this.mDensity * 8.0f), this.d);
            float f3 = this.mPaddingLeft - (this.mDensity * 8.0f);
            Rect rect2 = new Rect();
            float f4 = I18nUtil.isCN(getContext()) ? 0.0f : 17.0f * this.mDensity;
            if (DynamicDetailChart.this.r.supportSecondChart) {
                String str = DynamicDetailChart.this.r.unitYName;
                if (!TextUtils.isEmpty(str)) {
                    this.c.getTextBounds(str, 0, str.length(), rect2);
                    canvas.drawText(str, ((rectF.left + f4) + f3) - rect2.width(), rect.top, this.c);
                }
            }
            float f5 = rectF.left + this.mPaddingLeft;
            float f6 = f5 - (this.mDensity * 4.0f);
            int length = DynamicDetailChart.this.r.labelArrayY.length;
            for (int i = 0; i < length; i++) {
                this.c.getTextBounds(DynamicDetailChart.this.r.labelArrayY[i], 0, DynamicDetailChart.this.r.labelArrayY[i].length(), rect2);
                float fWidth = (rectF.left + f3) - rect2.width();
                float fA = rectF.top - DynamicDetailChart.this.d.a(rect, DynamicDetailChart.this.r.valueArrayY[i]);
                canvas.drawText(DynamicDetailChart.this.r.labelArrayY[i], fWidth, (rect2.height() / 2) + fA, this.c);
                canvas.drawLine(f6, fA, f5, fA, this.d);
            }
        }

        private void m(Canvas canvas, RectF rectF) {
            String strValueOf;
            if (DynamicDetailChart.this.h == DynamicDetailChart.this.i || DynamicDetailChart.this.r.labelArrayY == null) {
                return;
            }
            Paint paint = new Paint(1);
            paint.setColor(-290278734);
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeWidth(this.mDensity * 0.33f);
            Path path = new Path();
            RectF rect = DynamicDetailChart.this.d.getRect();
            Rect rect2 = new Rect();
            float f = this.mPaddingLeft;
            float f2 = this.mDensity;
            float f3 = f - (8.0f * f2);
            float f4 = f2 * 1.0f;
            float f5 = f2 * 3.0f;
            int length = DynamicDetailChart.this.r.valueArrayY.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                if (DynamicDetailChart.this.r.valueArrayY[i2] > 0.0f) {
                    strValueOf = "+" + ((int) DynamicDetailChart.this.r.valueArrayY[i2]);
                } else {
                    strValueOf = String.valueOf((int) DynamicDetailChart.this.r.valueArrayY[i2]);
                }
                this.c.getTextBounds(strValueOf, i, strValueOf.length(), rect2);
                float f6 = rectF.right - this.mPaddingRight;
                float fA = rectF.top - DynamicDetailChart.this.d.a(rect, DynamicDetailChart.this.r.valueArrayY[i2]);
                int i3 = length;
                float f7 = f5;
                canvas.drawText(strValueOf, f6 + f5, (rect2.height() / 2) + fA, this.c);
                if (DynamicDetailChart.this.r.valueArrayY[i2] == DynamicDetailChart.this.r.avgSportValue) {
                    float f8 = fA + f4;
                    path.moveTo(f6, f8);
                    path.lineTo(rectF.left - this.mPaddingLeft, f8);
                    canvas.drawPath(path, DynamicDetailChart.this.n);
                } else {
                    if (i2 > 0) {
                        float f9 = fA + f4;
                        canvas.drawLine(f6, f9, rectF.left - this.mPaddingLeft, f9, paint);
                    }
                    i2++;
                    length = i3;
                    f5 = f7;
                    path = path;
                    i = 0;
                }
                i2++;
                length = i3;
                f5 = f7;
                path = path;
                i = 0;
            }
            if (DynamicDetailChart.this.r.regionArray == null) {
                return;
            }
            int length2 = DynamicDetailChart.this.r.labelArrayY.length;
            paint.setStrokeWidth(this.mDensity * 4.0f);
            float strokeWidth = (rectF.left + this.mPaddingLeft) - (paint.getStrokeWidth() / 2.0f);
            int i4 = 0;
            while (i4 < length2) {
                String str = DynamicDetailChart.this.r.labelArrayY[i4];
                this.c.getTextBounds(str, 0, str.length(), rect2);
                int i5 = i4 + 1;
                canvas.drawText(str, (rectF.left + f3) - rect2.width(), (rectF.top - DynamicDetailChart.this.d.a(rect, (DynamicDetailChart.this.r.regionArray[i4] + DynamicDetailChart.this.r.regionArray[i5]) / 2.0f)) + (rect2.height() / 2), this.c);
                float fA2 = (rectF.top - DynamicDetailChart.this.d.a(rect, DynamicDetailChart.this.r.regionArray[i4])) + f4;
                float fA3 = rectF.top - DynamicDetailChart.this.d.a(rect, DynamicDetailChart.this.r.regionArray[i5]);
                paint.setColor(Color.parseColor(DynamicDetailChart.this.r.regionColorArray[i4]));
                canvas.drawLine(strokeWidth, fA2, strokeWidth, fA3, paint);
                i4 = i5;
            }
        }

        public int b() {
            return this.offset / this.value;
        }

        public float c() {
            return o() ? ((-b()) * p()) + (this.b * this.a) : (-b()) * p();
        }

        @Override // com.huami.watch.dataflow.chart.base.BaseChart
        public void doScroll(float f) {
            this.offset = (-((int) (this.mScroll / this.b))) + this.a;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart.XAxis, com.huami.watch.dataflow.chart.base.BaseChart
        public void draw(Canvas canvas, RectF rectF, float f) {
            if (DynamicDetailChart.this.l == 16) {
                if (DynamicDetailChart.this.v == null || DynamicDetailChart.this.v.showSleepTime) {
                    i(canvas, rectF);
                    return;
                }
                return;
            }
            if (DynamicDetailChart.this.l == 1) {
                j(canvas, rectF);
                return;
            }
            if (DynamicDetailChart.this.l == 1048576) {
                d(canvas, rectF);
                return;
            }
            if (DynamicDetailChart.this.l == 4096) {
                if (DynamicDetailChart.this.w) {
                    return;
                }
                e(canvas, rectF);
            } else if (DynamicDetailChart.this.l != 65536) {
                if (DynamicDetailChart.this.l == 2097152) {
                    k(canvas, rectF);
                }
            } else {
                if (DynamicDetailChart.this.r.valueArrayX != null) {
                    f(canvas, rectF);
                    m(canvas, rectF);
                    return;
                }
                g(canvas, rectF);
                l(canvas, rectF);
                if (DynamicDetailChart.this.s != null) {
                    h(canvas, rectF);
                }
            }
        }

        public float n() {
            return this.a * this.b;
        }

        @Override // com.huami.watch.dataflow.chart.base.BaseChart
        public void notifyChanged() {
            if (this.mRect == null || DynamicDetailChart.this.j == DynamicDetailChart.this.k) {
                return;
            }
            this.b = ((this.mRect.width() - this.mPaddingLeft) - this.mPaddingRight) / ((DynamicDetailChart.this.k - DynamicDetailChart.this.j) + 1);
        }

        public boolean o() {
            float f = this.mScroll;
            int i = this.a;
            float f2 = this.b;
            return f - (((float) i) * f2) < 0.0f && (f - (((float) i) * f2)) % p() < 0.0f;
        }

        @Override // com.huami.watch.dataflow.chart.base.BaseChart
        public void onRectChanged(RectF rectF) {
            s();
        }

        public float p() {
            return this.b * this.value;
        }

        public float q() {
            return this.mScroll - (this.a * this.b);
        }

        public float r() {
            int i = (-this.offset) % this.value;
            if (o()) {
                int i2 = -this.offset;
                int i3 = this.value;
                i = (i2 % i3) + i3;
            }
            float f = this.b;
            return (i * f) + (this.mScroll % f);
        }

        public void s() {
            float f = (this.a - this.offset) * this.b;
            this.mScroll = f;
            DynamicDetailChart.this.mScroll = f;
        }
    }

    public class b extends BarChart {
        public String mEmptyText;
        public Paint mTxtPaint;

        public b(Context context) {
            super(context);
            TextPaint textPaint = new TextPaint(1);
            this.mTxtPaint = textPaint;
            textPaint.setColor(-1728053248);
            this.mTxtPaint.setTextSize((this.mDensity * 12.0f) + 0.5f);
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
        public void draw(Canvas canvas, RectF rectF, float f) {
            if (DynamicDetailChart.this.p) {
                return;
            }
            synchronized (this.mItems) {
                int size = this.mItems.size();
                int i = 0;
                for (T t : this.mItems) {
                    float f2 = 1.0f;
                    if (f == 1.0f || f == 0.0f) {
                        f2 = f;
                    } else {
                        float f3 = f / (1.0f - ((i * 0.6f) / size));
                        if (f3 <= 1.0f) {
                            f2 = f3;
                        }
                    }
                    t.draw(canvas, f2);
                    i++;
                }
            }
        }

        public void drawTips(Canvas canvas, RectF rectF) {
            if (TextUtils.isEmpty(this.mEmptyText)) {
                return;
            }
            Rect rect = new Rect();
            Paint paint = this.mTxtPaint;
            String str = this.mEmptyText;
            paint.getTextBounds(str, 0, str.length(), rect);
            canvas.drawText(this.mEmptyText, (rectF.width() - rect.width()) / 2.0f, (rectF.height() - rect.height()) / 2.0f, this.mTxtPaint);
        }

        public void setEmptyText(String str) {
            this.mEmptyText = str;
        }
    }

    public DynamicDetailChart(Context context, int i, int i2) {
        super(context);
        this.m = 9;
        this.q = -1;
        this.w = false;
        this.l = i;
        this.m = i2;
    }

    private void E(Canvas canvas) {
        RectF rect = this.c.getRect();
        Rect rect2 = new Rect();
        float f = (this.mDensity * 5.0f) + 0.5f;
        float fA = rect.bottom - this.c.a(rect, 110);
        String strValueOf = String.valueOf(110);
        this.o.getTextBounds(strValueOf, 0, strValueOf.length(), rect2);
        canvas.drawText(strValueOf, this.mRect.left, (rect2.height() / 2) + fA, this.o);
        float paddingRight = this.mRect.right - this.c.getPaddingRight();
        Path path = new Path();
        path.moveTo(this.mRect.left + rect2.width() + f, fA);
        if (paddingRight > 3000.0f) {
            float f2 = paddingRight - 3000.0f;
            path.lineTo(f2, fA);
            canvas.drawPath(path, this.n);
            Path path2 = new Path();
            path2.moveTo(f2, fA);
            path2.lineTo(paddingRight, fA);
            canvas.drawPath(path2, this.n);
        } else {
            path.lineTo(paddingRight, fA);
            canvas.drawPath(path, this.n);
        }
        float fA2 = rect.bottom - this.c.a(rect, 220);
        String strValueOf2 = String.valueOf(220);
        this.o.getTextBounds(strValueOf2, 0, strValueOf2.length(), rect2);
        canvas.drawText(strValueOf2, this.mRect.left, (rect2.height() / 2) + fA2, this.o);
        Path path3 = new Path();
        path3.moveTo(this.mRect.left + rect2.width() + f, fA2);
        if (paddingRight <= 3000.0f) {
            path3.lineTo(paddingRight, fA2);
            canvas.drawPath(path3, this.n);
            return;
        }
        float f3 = paddingRight - 3000.0f;
        path3.lineTo(f3, fA2);
        canvas.drawPath(path3, this.n);
        Path path4 = new Path();
        path4.moveTo(f3, fA2);
        path4.lineTo(paddingRight, fA2);
        canvas.drawPath(path4, this.n);
    }

    private void F(Canvas canvas, float f) {
        if (f <= 0.0f) {
            return;
        }
        RectF rect = this.d.getRect();
        float fA = rect.bottom - this.d.a(rect, f);
        float paddingRight = this.mRect.right - this.d.getPaddingRight();
        Path path = new Path();
        path.moveTo(this.mRect.left + this.d.getPaddingLeft(), fA);
        path.lineTo(paddingRight, fA);
        canvas.drawPath(path, this.n);
    }

    private void G(Context context) {
        DynamicCalorieBarChart dynamicCalorieBarChart = new DynamicCalorieBarChart(context);
        this.f = dynamicCalorieBarChart;
        float f = this.mDensity;
        dynamicCalorieBarChart.setPadding(f * 5.0f, 14.0f * f, f * 5.0f, 0.0f);
        this.f.setItemBaseHeight(0.01f);
        this.f.setMaxItemValue(300);
        this.f.setItemPadding(this.mDensity * 0.5f);
    }

    private void H(Context context) {
        DynamicHRBarChart dynamicHRBarChart = new DynamicHRBarChart(context);
        this.c = dynamicHRBarChart;
        dynamicHRBarChart.setMaxItemValue(250);
        if (!this.w) {
            DynamicHRBarChart dynamicHRBarChart2 = this.c;
            float f = this.mDensity;
            dynamicHRBarChart2.setPadding(20.0f * f, 0.0f, f * 10.0f, 0.0f);
        }
        Paint paint = new Paint();
        this.n = paint;
        paint.setColor(1275068416);
        this.n.setStyle(Paint.Style.STROKE);
        this.n.setStrokeWidth(1.0f);
        Paint paint2 = this.n;
        float f2 = this.mDensity;
        paint2.setPathEffect(new DashPathEffect(new float[]{4.0f * f2, f2 * 2.0f}, 0.0f));
        TextPaint textPaint = new TextPaint(1);
        this.o = textPaint;
        textPaint.setColor(1275068416);
        this.o.setTextSize(this.mDensity * 10.0f);
    }

    private void I(Context context) {
        this.e = new DynamicLineChart(context);
        LineChartAttr lineChartAttr = this.t;
        this.h = lineChartAttr.startTime;
        this.i = lineChartAttr.endTime - 1;
    }

    private void J(Context context) {
        DynamicSleepBarChart dynamicSleepBarChart = new DynamicSleepBarChart(context);
        this.a = dynamicSleepBarChart;
        if (this.w) {
            return;
        }
        float f = this.mDensity;
        dynamicSleepBarChart.setPadding(f * 8.0f, 5.0f * f, f * 8.0f, 0.0f);
    }

    private void K(Context context) {
        DynamicSportBarChart dynamicSportBarChart = new DynamicSportBarChart(context);
        this.d = dynamicSportBarChart;
        dynamicSportBarChart.setMaxSportValue(this.r.maxSportValue);
        this.d.setMinSportValue(this.r.minSportValue);
        this.d.setAvgSportValue(this.r.avgSportValue);
        this.d.setSupportNegative(this.r.supportNegative);
        SportChartAttr sportChartAttr = this.r;
        int i = sportChartAttr.startTime;
        this.h = i;
        int i2 = sportChartAttr.endTime - 1;
        this.i = i2;
        this.j = i;
        this.k = i2;
        DynamicSportBarChart dynamicSportBarChart2 = this.d;
        float f = this.mDensity;
        dynamicSportBarChart2.setPadding(f * 0.0f, 15.0f * f, f * 10.0f, 0.0f);
        Paint paint = new Paint();
        this.n = paint;
        paint.setColor(-9079435);
        this.n.setStyle(Paint.Style.STROKE);
        this.n.setStrokeWidth(1.0f);
        Paint paint2 = this.n;
        float f2 = this.mDensity;
        paint2.setPathEffect(new DashPathEffect(new float[]{4.0f * f2, f2 * 2.0f}, 0.0f));
    }

    private void L(Context context) {
        DynamicStepBarChart dynamicStepBarChart = new DynamicStepBarChart(context);
        this.b = dynamicStepBarChart;
        float f = this.mDensity;
        dynamicStepBarChart.setPadding(f * 5.0f, 14.0f * f, f * 5.0f, 0.0f);
        this.b.setItemBaseHeight(0.01f);
        this.b.setMaxItemValue(1100);
        this.b.setItemPadding(this.mDensity * 0.5f);
    }

    private void M(Context context) {
        this.g = new DynamicTargetBarChart(context);
    }

    public void addCalorieData(ArrayList<DynamicDetailBarItem> arrayList) {
        DynamicCalorieBarChart dynamicCalorieBarChart = this.f;
        if (dynamicCalorieBarChart != null) {
            dynamicCalorieBarChart.addItems(arrayList);
        }
    }

    public void addHRData(List<DynamicDetailBarItem> list) {
        DynamicHRBarChart dynamicHRBarChart = this.c;
        if (dynamicHRBarChart != null) {
            dynamicHRBarChart.addItems(list);
        }
    }

    public void addLineChartData(List<DynamicDetailBarItem> list) {
        DynamicLineChart dynamicLineChart = this.e;
        if (dynamicLineChart != null) {
            dynamicLineChart.addItems(list);
        }
    }

    public void addSleepData(List<DynamicDetailBarItem> list) {
        DynamicSleepBarChart dynamicSleepBarChart = this.a;
        if (dynamicSleepBarChart != null) {
            dynamicSleepBarChart.addItems(list);
            this.a.sortItems();
        }
    }

    public void addSportData(List<DynamicDetailBarItem> list) {
        DynamicSportBarChart dynamicSportBarChart = this.d;
        if (dynamicSportBarChart != null) {
            dynamicSportBarChart.addItems(list);
        }
    }

    public void addStepData(List<DynamicDetailBarItem> list) {
        DynamicStepBarChart dynamicStepBarChart = this.b;
        if (dynamicStepBarChart != null) {
            dynamicStepBarChart.addItems(list);
        }
    }

    public void addTargetData(ArrayList<DynamicDetailBarItem> arrayList) {
        DynamicTargetBarChart dynamicTargetBarChart = this.g;
        if (dynamicTargetBarChart != null) {
            dynamicTargetBarChart.addItems(arrayList);
        }
    }

    public void clearCalorieData() {
        DynamicCalorieBarChart dynamicCalorieBarChart = this.f;
        if (dynamicCalorieBarChart != null) {
            dynamicCalorieBarChart.clearItems();
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.f.notifyChanged();
        }
    }

    public void clearHRData() {
        DynamicHRBarChart dynamicHRBarChart = this.c;
        if (dynamicHRBarChart != null) {
            dynamicHRBarChart.clearItems();
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.c.notifyChanged();
        }
    }

    public void clearLineChartData() {
        DynamicLineChart dynamicLineChart = this.e;
        if (dynamicLineChart != null) {
            dynamicLineChart.clearItems();
            this.e.notifyChanged();
        }
    }

    public void clearSleepData() {
        DynamicSleepBarChart dynamicSleepBarChart = this.a;
        if (dynamicSleepBarChart != null) {
            dynamicSleepBarChart.clearItems();
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.a.notifyChanged();
        }
    }

    public void clearSportData() {
        DynamicSportBarChart dynamicSportBarChart = this.d;
        if (dynamicSportBarChart != null) {
            dynamicSportBarChart.clearItems();
            this.d.notifyChanged();
        }
    }

    public void clearStepData() {
        DynamicStepBarChart dynamicStepBarChart = this.b;
        if (dynamicStepBarChart != null) {
            dynamicStepBarChart.clearItems();
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.b.notifyChanged();
        }
    }

    public void clearTargetData() {
        DynamicTargetBarChart dynamicTargetBarChart = this.g;
        if (dynamicTargetBarChart != null) {
            dynamicTargetBarChart.clearItems();
            this.h = 0;
            this.i = 0;
            this.g.notifyChanged();
        }
    }

    @Override // com.huami.watch.dataflow.chart.base.BaseChart
    public void doScroll(float f) {
        if (this.mLoadCallback == null) {
            return;
        }
        a aVar = (a) this.mXAxis;
        if (this.mScroll > 0.0f) {
            this.mScroll = 0.0f;
        }
        if (this.mScroll < aVar.n()) {
            this.mScroll = aVar.n();
        }
        aVar.scrollTo(this.mScroll);
    }

    @Override // com.huami.watch.dataflow.chart.base.BaseChart, com.huami.watch.dataflow.chart.base.Chart
    public void draw(Canvas canvas, float f) {
        if (!getContainer().notDrawBars()) {
            int i = this.l;
            if (i == 1) {
                this.b.draw(canvas, f);
            } else if (i == 16) {
                this.a.draw(canvas, f);
            } else if (i == 256) {
                this.e.draw(canvas, f);
            } else if (i == 4096) {
                if (!this.w) {
                    E(canvas);
                }
                this.c.draw(canvas, f);
            } else if (i == 65536) {
                F(canvas, this.r.avgSportValue);
                this.d.draw(canvas, f);
            } else if (i == 1048576) {
                this.f.draw(canvas, f);
            } else if (i == 2097152) {
                this.g.draw(canvas, f);
            }
        }
        super.draw(canvas, f);
    }

    public void fillSleepData(List<BarChart.BarItem> list) {
        DynamicSleepBarChart dynamicSleepBarChart = this.a;
        if (dynamicSleepBarChart != null) {
            dynamicSleepBarChart.fillItems(list);
        }
    }

    public void fillStepData(List<DynamicDetailBarItem> list) {
        DynamicStepBarChart dynamicStepBarChart = this.b;
        if (dynamicStepBarChart != null) {
            dynamicStepBarChart.fillItems(list);
        }
    }

    public BarChart getCalChart() {
        return this.f;
    }

    public float getEdgeLength() {
        return ((a) this.mXAxis).n();
    }

    public int getEndTimeIndex() {
        return this.i;
    }

    public BarChart getHRChart() {
        return this.c;
    }

    public SportChartAttr getSecondSportChartAttr() {
        return this.s;
    }

    public BarChart getSleepChart() {
        return this.a;
    }

    public BarChart getSportChart() {
        return this.d;
    }

    public SportChartAttr getSportChartAttr() {
        return this.r;
    }

    public int getStartTimeIndex() {
        return this.h;
    }

    public BarChart getStepChart() {
        return this.b;
    }

    public BarChart getTargetChart() {
        return this.g;
    }

    public void initChart(Context context) {
        a aVar = new a(context);
        this.mXAxis = aVar;
        if (this.w) {
            aVar.stroke = (int) (this.mDensity * 14.0f);
        } else {
            aVar.stroke = (int) (this.mDensity * 28.0f);
        }
        int i = this.l;
        if (i == 1) {
            L(context);
            return;
        }
        if (i == 16) {
            J(context);
            return;
        }
        if (i == 256) {
            I(context);
            return;
        }
        if (i == 4096) {
            H(context);
        } else if (i == 1048576) {
            G(context);
        } else {
            if (i != 2097152) {
                return;
            }
            M(context);
        }
    }

    public boolean isDataAllZeroFlag() {
        return this.p;
    }

    public void justifyStartEndTimeIndex(int i) {
        int i2 = this.k;
        int i3 = this.j;
        int i4 = i - 1;
        if (i2 - i3 < i4) {
            int i5 = i3 + i4;
            this.k = i5;
            if (i5 > 23) {
                this.k = 23;
                this.j = 23 - i4;
            }
            this.h = this.j * 60;
            this.i = this.k * 60;
        }
        ((a) this.mXAxis).notifyChanged();
    }

    @Override // com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
    public void notifyChanged() {
        int i = this.l;
        if (i == 1) {
            this.b.notifyChanged();
            return;
        }
        if (i == 16) {
            this.a.notifyChanged();
            return;
        }
        if (i == 256) {
            this.e.notifyChanged();
            return;
        }
        if (i == 4096) {
            this.c.notifyChanged();
            return;
        }
        if (i == 65536) {
            this.d.notifyChanged();
        } else if (i == 1048576) {
            this.f.notifyChanged();
        } else {
            if (i != 2097152) {
                return;
            }
            this.g.notifyChanged();
        }
    }

    @Override // com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
    public void onRectChanged(RectF rectF) {
        super.onRectChanged(rectF);
        RectF rect = this.mXAxis.getRect();
        RectF rectF2 = new RectF(rectF);
        int i = this.l;
        if (i == 1) {
            rectF2.bottom = rect.top;
            this.b.setRect(rectF2);
            return;
        }
        if (i == 16) {
            SleepChartAttr sleepChartAttr = this.v;
            if (sleepChartAttr == null || sleepChartAttr.showSleepTime) {
                rectF2.bottom = rect.top;
            }
            this.a.setRect(rectF2);
            return;
        }
        if (i == 256) {
            if (!this.w) {
                rectF2.bottom = rect.top;
            }
            this.e.setRect(rectF2);
            return;
        }
        if (i == 4096) {
            if (!this.w) {
                rectF2.bottom = rect.top;
            }
            this.c.setRect(rectF2);
        } else if (i == 65536) {
            rectF2.bottom = rect.top;
            this.d.setRect(rectF2);
        } else if (i == 1048576) {
            rectF2.bottom = rect.top;
            this.f.setRect(rectF2);
        } else {
            if (i != 2097152) {
                return;
            }
            rectF2.bottom = rect.top;
            this.g.setRect(rectF2);
        }
    }

    public void setDataAllZeroFlag(boolean z2) {
        this.p = z2;
    }

    public void setHREmptyText(String str) {
        DynamicHRBarChart dynamicHRBarChart = this.c;
        if (dynamicHRBarChart != null) {
            dynamicHRBarChart.setEmptyText(str);
        }
    }

    public void setIsPreview(boolean z2) {
        this.w = z2;
    }

    public void setLineChartAttr(LineChartAttr lineChartAttr) {
        this.t = lineChartAttr;
    }

    public void setMode(int i) {
        this.l = i;
    }

    public void setOffset(int i) {
        a aVar = (a) this.mXAxis;
        aVar.a = i;
        aVar.offset = 0;
        aVar.s();
    }

    public void setSecondSportChartAttr(SportChartAttr sportChartAttr) {
        this.s = sportChartAttr;
    }

    public void setSecondSportChartData(List<DynamicDetailBarItem> list) {
        this.d.setSecondChartData(list);
    }

    public void setSelectedIndex(int i) {
        this.q = i;
    }

    public void setSleepChartAttr(SleepChartAttr sleepChartAttr) {
        this.v = sleepChartAttr;
    }

    public void setSleepEmptyText(String str) {
        DynamicSleepBarChart dynamicSleepBarChart = this.a;
        if (dynamicSleepBarChart != null) {
            dynamicSleepBarChart.setEmptyText(str);
        }
    }

    public void setStartEndTimeIndex(int i, int i2) {
        this.h = i;
        this.i = i2;
        this.j = i / 60;
        this.k = i2 / 60;
        if (i == i2) {
            justifyStartEndTimeIndex(8);
        }
    }

    public void setStepEmptyText(String str) {
        DynamicStepBarChart dynamicStepBarChart = this.b;
        if (dynamicStepBarChart != null) {
            dynamicStepBarChart.setEmptyText(str);
        }
    }

    public void setTargetChartAttr(TargetChartAttr targetChartAttr) {
        this.u = targetChartAttr;
    }

    public DynamicDetailChart(Context context, SportChartAttr sportChartAttr) {
        super(context);
        this.m = 9;
        this.q = -1;
        this.w = false;
        this.r = sportChartAttr;
        this.l = 65536;
        this.m = 1;
        a aVar = new a(context);
        this.mXAxis = aVar;
        aVar.stroke = (int) (this.mDensity * 28.0f);
        K(context);
    }
}
