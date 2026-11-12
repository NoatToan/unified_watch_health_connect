package com.xiaomi.hm.health.relation.chart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.relation.R;
import com.xiaomi.hm.health.relation.chart.base.BarChart;
import com.xiaomi.hm.health.relation.chart.util.ChartUtil;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class StatisticChart extends BarChart {
    private static final String G = "Chart.StatisticChart";
    private static final int H = 8000;
    private static final int I = 480;
    private static final float J = 2.5f;
    private static final float K = 1.5f;
    private int A;
    private int B;
    private float C;
    private float D;
    private Path E;
    private Paint F;
    private int a;
    private int b;
    private int c;
    private int d;
    private float e;
    private float f;
    private int g;
    private float h;
    private int i;
    private float j;
    private float k;
    private c l;
    private b m;
    private d n;
    private List<DateItem> o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public static class DateItem {
        public int a;
        public String b;
    }

    public static class StatisticBarItem extends BarChart.BarItem {
        public int value1;

        public StatisticBarItem(Context context) {
            super(context);
        }

        public void draw(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
            draw(canvas, this.mRect, f, f2, f3, f4, f5);
        }

        /* JADX WARN: Code duplicated, block: B:60:0x016e  */
        /* JADX WARN: Code duplicated, block: B:62:0x0180  */
        /* JADX WARN: Code duplicated, block: B:63:0x018a  */
        /* JADX WARN: Code duplicated, block: B:65:0x018d  */
        /* JADX WARN: Code duplicated, block: B:66:0x0196  */
        /* JADX WARN: Code duplicated, block: B:69:0x019a  */
        /* JADX WARN: Code duplicated, block: B:72:0x01a7  */
        /* JADX WARN: Code duplicated, block: B:74:0x01af A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:76:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:78:0x01ba  */
        /* JADX WARN: Code duplicated, block: B:80:0x01c1 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:82:0x01c4  */
        public void draw(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, float f5) {
            float fHeight;
            float fHeight2;
            float fHeight3;
            float fHeight4;
            int i;
            int iColorToColor;
            int i2;
            int iColorToColor2;
            int i3;
            int iColorToColor3;
            int i4;
            float f6;
            int iColorToColor4;
            int i5;
            if (this.needDraw || rectF.height() != 0.0f) {
                if (f2 == -1.0f) {
                    fHeight = f3;
                    fHeight2 = f5;
                    fHeight3 = 0.0f;
                    fHeight4 = 0.0f;
                } else {
                    fHeight = rectF.height();
                    fHeight2 = rectF.height() * (this.value1 / this.value);
                    fHeight3 = f2;
                    fHeight4 = f4;
                }
                if (f3 == -1.0f) {
                    fHeight = rectF.height();
                    fHeight2 = rectF.height() * (this.value1 / this.value);
                } else if (f3 == -2.0f) {
                    fHeight3 = rectF.height();
                    fHeight4 = rectF.height() * (this.value1 / this.value);
                    fHeight2 = 0.0f;
                    fHeight = 0.0f;
                } else {
                    fHeight3 = rectF.height();
                    fHeight4 = rectF.height() * (this.value1 / this.value);
                }
                float f7 = fHeight3 + ((fHeight - fHeight3) * f);
                float f8 = fHeight4 + ((fHeight2 - fHeight4) * f);
                float fWidth = rectF.width();
                float fWidth2 = rectF.left + (rectF.width() / 2.0f);
                float f9 = rectF.bottom;
                float f10 = f9 - f7;
                this.mRenderer.paint.setStrokeWidth(fWidth);
                StatisticChart statisticChart = (StatisticChart) getParent();
                Paint paint = null;
                if (this.value1 >= 0 && this.value > 0) {
                    paint = new Paint();
                    paint.setStrokeWidth(fWidth);
                }
                Paint paint2 = paint;
                if (statisticChart.p == 16) {
                    iColorToColor = statisticChart.r;
                    i = statisticChart.s;
                } else if (statisticChart.p == 1) {
                    iColorToColor = statisticChart.v;
                    i = statisticChart.w;
                } else if (statisticChart.p == 256) {
                    iColorToColor = -6042459;
                    i = -9384843;
                } else {
                    i = 0;
                    iColorToColor = 0;
                }
                float f11 = statisticChart.j;
                float f12 = statisticChart.k;
                float f13 = rectF.right;
                if (f13 >= f11) {
                    float f14 = rectF.left;
                    if (f14 > f12) {
                        i2 = statisticChart.y;
                        iColorToColor2 = statisticChart.y;
                        i3 = statisticChart.u;
                        iColorToColor3 = statisticChart.u;
                        if (f2 > -1.0f) {
                            i2 = statisticChart.x;
                            i3 = statisticChart.t;
                            i4 = iColorToColor;
                        } else {
                            i4 = i;
                        }
                        if (f3 > -1.0f) {
                            iColorToColor2 = statisticChart.x;
                            iColorToColor3 = statisticChart.t;
                        } else {
                            iColorToColor = i;
                        }
                        if (i4 != iColorToColor) {
                            iColorToColor = ChartUtil.colorToColor(i4, iColorToColor, f);
                        }
                        this.mRenderer.paint.setColor(iColorToColor);
                        if (paint2 != null) {
                            if (statisticChart.p == 16) {
                                if (i3 != iColorToColor3) {
                                    iColorToColor3 = ChartUtil.colorToColor(i3, iColorToColor3, f);
                                }
                                paint2.setColor(iColorToColor3);
                            } else if (statisticChart.p == 1) {
                                if (i2 != iColorToColor2) {
                                    iColorToColor2 = ChartUtil.colorToColor(i2, iColorToColor2, f);
                                }
                                paint2.setColor(iColorToColor2);
                            }
                        }
                    } else {
                        if (f14 < f11) {
                            f6 = f11 - f14;
                        } else {
                            f6 = f13 > f12 ? f13 - f12 : 0.0f;
                        }
                        float fWidth3 = rectF.width() / 2.0f;
                        if (f6 >= fWidth3) {
                            i5 = statisticChart.y;
                            iColorToColor4 = statisticChart.u;
                            iColorToColor = i;
                        } else if (f6 == 0.0f) {
                            i5 = statisticChart.x;
                            iColorToColor4 = statisticChart.t;
                        } else {
                            float f15 = f6 / fWidth3;
                            iColorToColor = ChartUtil.colorToColor(iColorToColor, i, f15);
                            int iColorToColor5 = ChartUtil.colorToColor(statisticChart.x, statisticChart.y, f15);
                            iColorToColor4 = ChartUtil.colorToColor(statisticChart.t, statisticChart.u, f15);
                            i5 = iColorToColor5;
                        }
                        this.mRenderer.paint.setColor(iColorToColor);
                        if (paint2 != null) {
                            if (statisticChart.p == 16) {
                                paint2.setColor(iColorToColor4);
                            } else if (statisticChart.p == 1) {
                                paint2.setColor(i5);
                            }
                        }
                    }
                } else {
                    i2 = statisticChart.y;
                    iColorToColor2 = statisticChart.y;
                    i3 = statisticChart.u;
                    iColorToColor3 = statisticChart.u;
                    if (f2 > -1.0f) {
                        i2 = statisticChart.x;
                        i3 = statisticChart.t;
                        i4 = iColorToColor;
                    } else {
                        i4 = i;
                    }
                    if (f3 > -1.0f) {
                        iColorToColor2 = statisticChart.x;
                        iColorToColor3 = statisticChart.t;
                    } else {
                        iColorToColor = i;
                    }
                    if (i4 != iColorToColor) {
                        iColorToColor = ChartUtil.colorToColor(i4, iColorToColor, f);
                    }
                    this.mRenderer.paint.setColor(iColorToColor);
                    if (paint2 != null) {
                        if (statisticChart.p == 16) {
                            if (i3 != iColorToColor3) {
                                iColorToColor3 = ChartUtil.colorToColor(i3, iColorToColor3, f);
                            }
                            paint2.setColor(iColorToColor3);
                        } else if (statisticChart.p == 1) {
                            if (i2 != iColorToColor2) {
                                iColorToColor2 = ChartUtil.colorToColor(i2, iColorToColor2, f);
                            }
                            paint2.setColor(iColorToColor2);
                        }
                    }
                }
                canvas.drawLine(fWidth2, f9, fWidth2, f10, this.mRenderer.paint);
                if (paint2 != null) {
                    canvas.drawLine(fWidth2, f9, fWidth2, rectF.bottom - f8, paint2);
                }
            }
        }
    }

    public static class StatisticWeightItem extends BarChart.BarItem implements Comparable<StatisticWeightItem> {
        public StatisticWeightItem(Context context) {
            super(context);
        }

        public void draw(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
            draw(canvas, this.mRect, f, f2, f3, f4, f5);
        }

        @Override // java.lang.Comparable
        public int compareTo(StatisticWeightItem statisticWeightItem) {
            return statisticWeightItem.index - this.index;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0077  */
        public void draw(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, float f5) {
            int iColorToColor;
            float f6;
            float f7;
            if (this.needDraw || rectF.height() != 0.0f) {
                StatisticChart statisticChart = (StatisticChart) getParent();
                float f8 = statisticChart.j;
                float f9 = statisticChart.k;
                float f10 = rectF.right;
                if (f10 >= f8) {
                    float f11 = rectF.left;
                    if (f11 > f9) {
                        iColorToColor = statisticChart.A;
                        f6 = statisticChart.D;
                    } else {
                        if (f11 < f8) {
                            f7 = f8 - f11;
                        } else {
                            f7 = f10 > f9 ? f10 - f9 : 0.0f;
                        }
                        float fWidth = rectF.width() / 2.0f;
                        if (f7 >= fWidth) {
                            iColorToColor = statisticChart.A;
                            f6 = statisticChart.D;
                        } else if (f7 == 0.0f) {
                            iColorToColor = statisticChart.z;
                            f6 = statisticChart.C;
                        } else {
                            float f12 = f7 / fWidth;
                            iColorToColor = ChartUtil.colorToColor(statisticChart.z, statisticChart.A, f12);
                            f6 = statisticChart.C - ((statisticChart.C - statisticChart.D) * f12);
                        }
                    }
                } else {
                    iColorToColor = statisticChart.A;
                    f6 = statisticChart.D;
                }
                this.mRenderer.paint.setColor(iColorToColor);
                float fCenterX = rectF.centerX();
                if (f2 == -1.0f) {
                    f2 = rectF.top;
                }
                if (f3 == -1.0f) {
                    f3 = rectF.top;
                }
                if (f2 == -1.0f && f3 == -1.0f) {
                    f2 = 185.0f * this.mDensity;
                    f3 = rectF.top;
                }
                float f13 = ((f3 - f2) * f) + f2;
                float f14 = f6 * this.mDensity;
                canvas.drawCircle(fCenterX, f13, (f2 != -1.0f || f3 == -1.0f) ? f14 * f : f14 * (1.0f - f), this.mRenderer.paint);
            }
        }
    }

    public class a extends BarChart.XAxis {
        private Paint a;
        private Paint b;

        public a(Context context) {
            super(context);
            TextPaint textPaint = new TextPaint(1);
            this.a = textPaint;
            textPaint.setColor(1711276032);
            Paint paint = new Paint();
            this.b = paint;
            paint.setColor(-855310);
        }

        private void c(Canvas canvas, RectF rectF, float f, float f2, float f3) {
            int i;
            int i2;
            int i3 = StatisticChart.this.B;
            if (f2 > -1.0f) {
                i = (int) (f * 255.0f);
                i2 = (int) (f * 128.0f);
            } else {
                i = 255;
                i2 = 128;
            }
            if (f3 > -1.0f) {
                float f4 = 1.0f - f;
                i2 = (int) (f4 * 128.0f);
                i = (int) (255.0f * f4);
            }
            int i4 = (i << 24) | i3;
            int i5 = (i2 << 24) | 0;
            if (StatisticChart.this.p == 256) {
                this.a.setTextSize(this.mDensity * 15.0f);
            } else {
                this.a.setTextSize(this.mDensity * 9.0f);
            }
            Rect rect = new Rect();
            synchronized (StatisticChart.this.o) {
                for (DateItem dateItem : StatisticChart.this.o) {
                    if (dateItem.a <= this.offset + ((StatisticChart.this.g - 1) / 2) + 1 && dateItem.a >= (this.offset + ((StatisticChart.this.g - 1) / 2)) - StatisticChart.this.g && (StatisticChart.this.p != 256 || dateItem.a == this.offset)) {
                        float f5 = StatisticChart.this.p == 256 ? StatisticChart.this.j : (StatisticChart.this.q == 1 ? ((rectF.right - this.mPaddingRight) - ((dateItem.a + 1) * StatisticChart.this.h)) - this.mScroll : ((rectF.right - this.mPaddingRight) + ((dateItem.a - 1) * StatisticChart.this.h)) + this.mScroll) - (((StatisticChart.this.g - 1) / 2) * StatisticChart.this.h);
                        float f6 = rectF.top;
                        if (dateItem.a == this.offset) {
                            this.a.setColor(i4);
                        } else {
                            this.a.setColor(i5);
                        }
                        Paint paint = this.a;
                        String str = dateItem.b;
                        paint.getTextBounds(str, 0, str.length(), rect);
                        canvas.drawText(dateItem.b, f5 + ((StatisticChart.this.h - rect.width()) / 2.0f), f6 + ((this.stroke + rect.height()) / 2.0f), this.a);
                    }
                }
            }
        }

        public void a(Canvas canvas, float f, float f2, float f3) {
            b(canvas, this.mRect, f, f2, f3);
        }

        public void b(Canvas canvas, RectF rectF, float f, float f2, float f3) {
            if (StatisticChart.this.p == 256) {
                canvas.drawRect(rectF, this.b);
            }
            c(canvas, rectF, f, f2, f3);
        }

        @Override // com.xiaomi.hm.health.relation.chart.base.BaseChart
        public void doScroll(float f) {
            this.offset = -Math.round(this.mScroll / StatisticChart.this.h);
        }
    }

    public class b extends BarChart {
        public b(Context context) {
            super(context);
        }

        public void draw(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
            synchronized (this.mItems) {
                for (T t : this.mItems) {
                    if (t.needDraw) {
                        ((StatisticBarItem) t).draw(canvas, f, f2, f3, f4, f5);
                    }
                }
            }
        }

        @Override // com.xiaomi.hm.health.relation.chart.base.BarChart
        public boolean itemNeedDraw(BarChart.BarItem barItem) {
            int i = StatisticChart.this.mXAxis.offset;
            return barItem.index >= (i - StatisticChart.this.i) - 1 && barItem.index <= (i + StatisticChart.this.i) + 1;
        }

        @Override // com.xiaomi.hm.health.relation.chart.base.BarChart
        public float itemOffsetX(RectF rectF, BarChart.BarItem barItem) {
            return StatisticChart.this.q == 1 ? ((StatisticChart.this.i - barItem.index) * StatisticChart.this.h) - StatisticChart.this.mXAxis.getScroll() : ((StatisticChart.this.i + barItem.index) * StatisticChart.this.h) + StatisticChart.this.mXAxis.getScroll();
        }

        @Override // com.xiaomi.hm.health.relation.chart.base.BarChart
        public float itemWidth(RectF rectF, BarChart.BarItem barItem) {
            return StatisticChart.this.h - (this.mItemPadding * 2.0f);
        }
    }

    public class c extends b {
        private float b;
        private int c;

        public c(Context context) {
            super(context);
            this.c = 10;
        }

        @Override // com.xiaomi.hm.health.relation.chart.base.BarChart
        public float itemHeight(RectF rectF, BarChart.BarItem barItem) {
            int i = barItem.value;
            int i2 = this.mMaxItemValue;
            return i >= i2 ? (rectF.height() - this.mPaddingTop) - this.mPaddingBottom : ChartUtil.itemLevelSize(i2, i, this.b, this.c);
        }

        @Override // com.xiaomi.hm.health.relation.chart.base.BarChart, com.xiaomi.hm.health.relation.chart.base.BaseChart
        public void onRectChanged(RectF rectF) {
            super.onRectChanged(rectF);
            if (rectF != null) {
                this.b = ChartUtil.updateLevelSize(this.mMaxItemValue, (rectF.height() - this.mPaddingTop) - this.mPaddingBottom, this.c);
            }
        }
    }

    public class d extends b {
        private Path b;
        private Paint c;

        public d(Context context) {
            super(context);
            this.b = new Path();
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.c.setStrokeWidth(StatisticChart.this.D * this.mDensity);
            this.c.setColor(StatisticChart.this.A);
        }

        private void a(Canvas canvas, Path path, Paint paint, PointF[] pointFArr) {
            PointF[][] pointFArrB = b(pointFArr, null, null);
            int i = 0;
            PointF[] pointFArr2 = pointFArrB[0];
            PointF[] pointFArr3 = pointFArrB[1];
            PointF pointF = pointFArr[0];
            path.moveTo(pointF.x, pointF.y);
            while (i < pointFArr.length - 1) {
                PointF pointF2 = pointFArr2[i];
                PointF pointF3 = pointFArr3[i];
                i++;
                PointF pointF4 = pointFArr[i];
                path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
            }
            canvas.drawPath(path, paint);
        }

        private PointF[][] b(PointF[] pointFArr, PointF[] pointFArr2, PointF[] pointFArr3) {
            int i;
            if (pointFArr == null) {
                throw new IllegalArgumentException("knots");
            }
            int length = pointFArr.length - 1;
            if (length < 1) {
                throw new IllegalArgumentException("At least two knot points required");
            }
            if (length == 1) {
                PointF[] pointFArr4 = {new PointF()};
                pointFArr4[0].x = ((pointFArr[0].x * 2.0f) + pointFArr[1].x) / 3.0f;
                pointFArr4[0].x = ((pointFArr[0].y * 2.0f) + pointFArr[1].y) / 3.0f;
                PointF[] pointFArr5 = {new PointF()};
                pointFArr5[0].x = (pointFArr4[0].x * 2.0f) - pointFArr[0].x;
                pointFArr5[0].y = (pointFArr4[0].y * 2.0f) - pointFArr[0].y;
                PointF[][] pointFArr6 = (PointF[][]) Array.newInstance((Class<?>) PointF.class, 2, 1);
                pointFArr6[0] = pointFArr4;
                pointFArr6[1] = pointFArr5;
                return pointFArr6;
            }
            float[] fArr = new float[length];
            int i2 = 1;
            while (true) {
                i = length - 1;
                if (i2 >= i) {
                    break;
                }
                int i3 = i2 + 1;
                fArr[i2] = (pointFArr[i2].x * 4.0f) + (pointFArr[i3].x * 2.0f);
                i2 = i3;
            }
            fArr[0] = pointFArr[0].x + (pointFArr[1].x * 2.0f);
            fArr[i] = ((pointFArr[i].x * 8.0f) + pointFArr[length].x) / 2.0f;
            float[] fArrC = c(fArr);
            int i4 = 1;
            while (i4 < i) {
                int i5 = i4 + 1;
                fArr[i4] = (pointFArr[i4].y * 4.0f) + (pointFArr[i5].y * 2.0f);
                i4 = i5;
            }
            fArr[0] = pointFArr[0].y + (pointFArr[1].y * 2.0f);
            fArr[i] = ((pointFArr[i].y * 8.0f) + pointFArr[length].y) / 2.0f;
            float[] fArrC2 = c(fArr);
            PointF[] pointFArr7 = new PointF[length];
            PointF[] pointFArr8 = new PointF[length];
            for (int i6 = 0; i6 < length; i6++) {
                pointFArr7[i6] = new PointF(fArrC[i6], fArrC2[i6]);
                if (i6 < i) {
                    int i7 = i6 + 1;
                    pointFArr8[i6] = new PointF((pointFArr[i7].x * 2.0f) - fArrC[i7], (pointFArr[i7].y * 2.0f) - fArrC2[i7]);
                } else {
                    pointFArr8[i6] = new PointF((pointFArr[length].x + fArrC[i]) / 2.0f, (pointFArr[length].y + fArrC2[i]) / 2.0f);
                }
            }
            PointF[][] pointFArr9 = (PointF[][]) Array.newInstance((Class<?>) PointF.class, 2, length);
            pointFArr9[0] = pointFArr7;
            pointFArr9[1] = pointFArr8;
            return pointFArr9;
        }

        private float[] c(float[] fArr) {
            int length = fArr.length;
            float[] fArr2 = new float[length];
            float[] fArr3 = new float[length];
            float f = 2.0f;
            fArr2[0] = fArr[0] / 2.0f;
            int i = 1;
            while (i < length) {
                fArr3[i] = 1.0f / f;
                f = (i < length + (-1) ? 4.0f : 3.5f) - fArr3[i];
                fArr2[i] = (fArr[i] - fArr2[i - 1]) / f;
                i++;
            }
            for (int i2 = 1; i2 < length; i2++) {
                int i3 = length - i2;
                int i4 = i3 - 1;
                fArr2[i4] = fArr2[i4] - (fArr3[i3] * fArr2[i3]);
            }
            return fArr2;
        }

        @Override // com.xiaomi.hm.health.relation.chart.StatisticChart.b
        public void draw(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
            synchronized (this.mItems) {
                this.b.rewind();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < this.mItems.size(); i++) {
                    BarChart.BarItem barItem = (BarChart.BarItem) this.mItems.get(i);
                    if (barItem.needDraw) {
                        RectF rect = barItem.getRect();
                        float fCenterX = rect.centerX();
                        float f6 = f2 == -1.0f ? rect.top : f2;
                        float f7 = f3 == -1.0f ? rect.top : f3;
                        if (f2 == -1.0f && f3 == -1.0f) {
                            f6 = this.mDensity * 185.0f;
                            f7 = rect.top;
                        }
                        arrayList2.add(new PointF(fCenterX, ((f7 - f6) * f) + f6));
                        arrayList.add(barItem);
                    }
                }
                if (arrayList2.size() > 2) {
                    a(canvas, this.b, this.c, (PointF[]) arrayList2.toArray(new PointF[arrayList2.size()]));
                } else if (arrayList2.size() == 2 && this.mItems.size() == 2) {
                    PointF pointF = (PointF) arrayList2.get(0);
                    this.b.moveTo(pointF.x, pointF.y);
                    PointF pointF2 = (PointF) arrayList2.get(1);
                    this.b.lineTo(pointF2.x, pointF2.y);
                    canvas.drawPath(this.b, this.c);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((StatisticWeightItem) ((BarChart.BarItem) it2.next())).draw(canvas, f, f2, f3, f4, f5);
                }
            }
        }

        @Override // com.xiaomi.hm.health.relation.chart.base.BarChart
        public float itemHeight(RectF rectF, BarChart.BarItem barItem) {
            int i = barItem.value;
            int i2 = this.mMinItemValue;
            return ((i - i2) / (this.mMaxItemValue - i2)) * ((rectF.height() - this.mPaddingTop) - this.mPaddingBottom);
        }

        @Override // com.xiaomi.hm.health.relation.chart.StatisticChart.b, com.xiaomi.hm.health.relation.chart.base.BarChart
        public boolean itemNeedDraw(BarChart.BarItem barItem) {
            int i = StatisticChart.this.mXAxis.offset;
            return barItem.index >= ((i - StatisticChart.this.i) - 1) + (-2) && barItem.index <= ((i + StatisticChart.this.i) + 1) + 2;
        }

        @Override // com.xiaomi.hm.health.relation.chart.base.BarChart, com.xiaomi.hm.health.relation.chart.base.BaseChart
        public void notifyChanged() {
            int i = StatisticChart.this.a;
            int i2 = StatisticChart.this.b;
            for (T t : this.mItems) {
                if (itemNeedDraw(t)) {
                    int i3 = t.value;
                    if (i3 > i) {
                        int i4 = (((i3 - i) / 30) + 1) * 30;
                        i += i4;
                        i2 -= i4;
                    }
                    if (i3 < i2) {
                        int i5 = (((i2 - i3) / 30) + 1) * 30;
                        i += i5;
                        i2 -= i5;
                    }
                }
            }
            if (i != this.mMaxItemValue) {
                StatisticChart.this.f = -1.0f;
                StatisticChart.this.E = null;
                setMaxItemValue(i);
                setNeedRealign(true);
            }
            if (i2 != this.mMinItemValue) {
                StatisticChart.this.f = -1.0f;
                StatisticChart.this.E = null;
                setMinItemValue(i2);
                setNeedRealign(true);
            }
            super.notifyChanged();
        }
    }

    public StatisticChart(Context context) {
        super(context);
        this.e = -1.0f;
        this.f = -1.0f;
        Resources resources = getContext().getResources();
        this.r = resources.getColor(R.color.relatives_main_sleep_focus_color);
        this.s = resources.getColor(R.color.relatives_main_sleep_color);
        this.t = resources.getColor(R.color.relatives_main_deep_sleep_focus_color);
        this.u = resources.getColor(R.color.relatives_main_deep_sleep_color);
        this.v = resources.getColor(R.color.relatives_main_step_focus_color);
        this.w = resources.getColor(R.color.relatives_main_step_color);
        this.x = -3479563;
        this.y = -10372640;
        this.z = -1;
        this.A = -6694193;
        this.C = 5.0f;
        this.D = 1.66f;
        a aVar = new a(context);
        this.mXAxis = aVar;
        aVar.stroke = (int) (this.mDensity * 28.0f);
        aVar.setPadding(this.mPaddingLeft, 0.0f, this.mPaddingRight, 0.0f);
        c cVar = new c(context);
        this.l = cVar;
        cVar.setItemPadding(this.mDensity * 0.83f);
        this.l.setPadding(0.0f, (int) (this.mDensity * 30.0f), 0.0f, 0.0f);
        b bVar = new b(context);
        this.m = bVar;
        bVar.setItemPadding(this.mDensity * 0.83f);
        this.m.setPadding(0.0f, (int) (this.mDensity * 100.0f), 0.0f, 0.0f);
        setSleepGoal(480);
        d dVar = new d(context);
        this.n = dVar;
        dVar.setItemPadding(this.mDensity * 0.83f);
        d dVar2 = this.n;
        float f = this.mDensity;
        dVar2.setPadding(0.0f, (int) (70.0f * f), 0.0f, (int) (f * 30.0f));
        this.o = new ArrayList();
        Paint paint = new Paint();
        this.F = paint;
        paint.setColor(DefaultTimeBar.DEFAULT_UNPLAYED_COLOR);
        this.F.setStyle(Paint.Style.STROKE);
        float f2 = this.mDensity * 0.3334f;
        this.F.setStrokeWidth(f2 < 1.0f ? 1.0f : f2);
        Paint paint2 = this.F;
        float f3 = this.mDensity;
        paint2.setPathEffect(new DashPathEffect(new float[]{4.5f * f3, f3 * J}, 0.0f));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d A[PHI: r0
      0x003d: PHI (r0v7 float) = (r0v1 float), (r0v12 float) binds: [B:16:0x0047, B:5:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    private void D(Canvas canvas) {
        float f;
        int i;
        int i2 = this.p;
        float f2 = 0.0f;
        if (i2 == 1) {
            f = this.e;
            if (f < 0.0f) {
                RectF rect = this.l.getRect();
                int maxItemValue = this.l.getMaxItemValue();
                float fItemLevelSize = rect.bottom;
                if (maxItemValue > 0 && this.l.b > 0.0f) {
                    fItemLevelSize -= ChartUtil.itemLevelSize(maxItemValue, this.c, this.l.b, this.l.c);
                }
                f2 = fItemLevelSize;
                this.e = f2;
            } else {
                f2 = f;
            }
        } else if (i2 == 256) {
            f = this.f;
            if (f < 0.0f) {
                RectF rect2 = this.n.getRect();
                int maxItemValue2 = this.n.getMaxItemValue();
                int minItemValue = this.n.getMinItemValue();
                float paddingBottom = rect2.bottom - this.n.getPaddingBottom();
                if (minItemValue > 0 && maxItemValue2 > 0 && (i = this.d) >= minItemValue && i <= maxItemValue2) {
                    paddingBottom -= ((i - minItemValue) / (maxItemValue2 - minItemValue)) * ((rect2.height() - this.n.getPaddingTop()) - this.n.getPaddingBottom());
                }
                f2 = paddingBottom;
                this.f = f2;
            } else {
                f2 = f;
            }
        }
        if (this.E == null) {
            Path path = new Path();
            this.E = path;
            path.moveTo(this.mRect.left, f2);
            this.E.lineTo(this.mRect.right, f2);
        }
        canvas.drawPath(this.E, this.F);
    }

    private void E(Canvas canvas) {
        RectF rectF = new RectF(this.mRect);
        rectF.left = this.mRect.centerX() - (this.h / 2.0f);
        rectF.right = this.mRect.centerX() + (this.h / 2.0f);
        rectF.bottom = this.mXAxis.getRect().top + 0.5f;
        Path path = new Path();
        path.moveTo(rectF.left + ((rectF.width() - (this.mDensity * 12.0f)) / 2.0f), rectF.bottom);
        path.lineTo(rectF.centerX(), rectF.bottom - (this.mDensity * 6.0f));
        path.lineTo(rectF.right - ((rectF.width() - (this.mDensity * 12.0f)) / 2.0f), rectF.bottom);
        path.close();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-855310);
        canvas.drawPath(path, paint);
    }

    private void F() {
        RectF rectF;
        if (this.g <= 0 || (rectF = this.mRect) == null) {
            return;
        }
        this.h = ((rectF.width() - this.mPaddingLeft) - this.mPaddingRight) / this.g;
        HMLog.i(G, "Update Bar Item Width : " + this.h, new Object[0]);
        this.j = (float) ((int) (this.mRect.centerX() - (this.h / 2.0f)));
        this.k = (float) ((int) (this.mRect.centerX() + (this.h / 2.0f)));
    }

    private void G(int i) {
        int i2 = i + 60;
        this.a = i2;
        int i3 = i - 60;
        this.b = i3;
        if (i2 > 1500) {
            this.a = 1500;
        }
        if (i3 < 0) {
            this.b = 0;
        }
        HMLog.i(G, "MaxValue : " + this.a, new Object[0]);
        HMLog.i(G, "MinValue : " + this.b, new Object[0]);
        this.n.setMaxItemValue(this.a);
        this.n.setMinItemValue(this.b);
    }

    @Override // com.xiaomi.hm.health.relation.chart.base.BaseChart
    public void doScroll(float f) {
        int i;
        if (this.mLoadCallback == null) {
            return;
        }
        BarChart.Axis axis = this.mXAxis;
        int i2 = axis.offset;
        axis.scrollTo(this.mScroll);
        int i3 = this.mXAxis.offset;
        boolean z = false;
        if (f < 0.0f) {
            if (i3 == i2 && this.mScroll / this.h < i3) {
                i3++;
            }
            int i4 = i2;
            for (int i5 = i3; i5 > i2; i5--) {
                if (!this.mLoadCallback.hasData(i5)) {
                    i4 = i5;
                    z = true;
                }
            }
            i = i4 - 1;
        } else {
            if (i3 == i2 && (-(this.mScroll / this.h)) < i3) {
                i3--;
            }
            int i6 = i2;
            for (int i7 = i3; i7 < i2; i7++) {
                if (!this.mLoadCallback.hasData(i7)) {
                    i6 = i7;
                    z = true;
                }
            }
            i = i6 + 1;
        }
        if (z) {
            float f2 = (-i) * this.h;
            this.mScroll = f2;
            this.mXAxis.scrollTo(f2);
            i3 = this.mXAxis.offset;
            ((StatisticChartView.StatisticChartLoadCallback) this.mLoadCallback).onOverScrolled();
        }
        if (i3 != i2) {
            this.mLoadCallback.loadData(i3);
        }
    }

    public void draw(Canvas canvas, float f, float f2, float f3, float f4, float f5, boolean z) {
        ((a) this.mXAxis).a(canvas, f, f2, f3);
        if (!z) {
            int i = this.p;
            if (i == 16) {
                this.m.draw(canvas, f, f2, f3, f4, f5);
            } else if (i == 1) {
                D(canvas);
                this.l.draw(canvas, f, f2, f3, f4, f5);
            } else if (i == 256) {
                if (this.d > 0) {
                    D(canvas);
                }
                this.n.draw(canvas, f, f2, f3, f4, f5);
            }
        }
        if (!z || this.p == 256) {
            E(canvas);
        }
    }

    public void fillDates(List<DateItem> list) {
        synchronized (this.o) {
            this.o.clear();
            this.o.addAll(list);
        }
    }

    public void fillSleepData(List<StatisticBarItem> list) {
        this.m.fillItems(list);
    }

    public void fillStepData(List<StatisticBarItem> list) {
        this.l.fillItems(list);
    }

    public void fillWeightData(List<StatisticWeightItem> list) {
        this.n.fillItems(list);
    }

    public int getBarItemCount() {
        return this.g;
    }

    public int itemOffset() {
        return this.mXAxis.offset;
    }

    public int justified() {
        int i = (int) (this.mScroll % this.h);
        float fAbs = Math.abs(i);
        float f = this.h;
        if (fAbs > f / 2.0f) {
            return i > 0 ? (int) (-(f - i)) : (int) (f + i);
        }
        return i;
    }

    @Override // com.xiaomi.hm.health.relation.chart.base.BarChart, com.xiaomi.hm.health.relation.chart.base.BaseChart
    public void notifyChanged() {
        if (this.p == 256) {
            this.n.notifyChanged();
        } else {
            this.l.notifyChanged();
            this.m.notifyChanged();
        }
    }

    public int offsetScrolled(float f) {
        int iRound;
        float fCenterX = this.mRect.centerX() - (this.h / 2.0f);
        float fCenterX2 = this.mRect.centerX();
        float f2 = this.h;
        float f3 = fCenterX2 + (f2 / 2.0f);
        if (f < fCenterX) {
            iRound = Math.round((((int) ((fCenterX - f) / f2)) + 1) * f2);
        } else {
            if (f <= f3) {
                return 0;
            }
            iRound = Math.round(((-((int) ((f - f3) / f2))) - 1) * f2);
        }
        return -iRound;
    }

    public void offsetTo(int i) {
        float f = i * this.h;
        this.mScroll = f;
        this.mXAxis.scrollTo(f);
    }

    @Override // com.xiaomi.hm.health.relation.chart.base.BarChart, com.xiaomi.hm.health.relation.chart.base.BaseChart
    public void onRectChanged(RectF rectF) {
        super.onRectChanged(rectF);
        F();
        RectF rect = this.mXAxis.getRect();
        RectF rectF2 = new RectF(rectF);
        rectF2.left = rectF.left + this.mPaddingLeft;
        rectF2.right = rectF.right - this.mPaddingRight;
        rectF2.bottom = rect.top;
        this.l.setRect(rectF2);
        RectF rectF3 = new RectF(rectF);
        rectF3.left = rectF.left + this.mPaddingLeft;
        rectF3.right = rectF.right - this.mPaddingRight;
        rectF3.bottom = rect.top;
        this.m.setRect(rectF3);
        RectF rectF4 = new RectF(rectF);
        rectF4.left = rectF.left + this.mPaddingLeft;
        rectF4.right = rectF.right - this.mPaddingRight;
        rectF4.bottom = rect.top;
        this.n.setRect(rectF4);
    }

    public void setMode(int i) {
        int color;
        this.p = i;
        Resources resources = getContext().getResources();
        if (i == 1) {
            color = resources.getColor(R.color.relatives_bg_mode_step);
        } else if (i != 16) {
            color = i != 256 ? 0 : resources.getColor(R.color.relatives_bg_mode_weight);
        } else {
            color = resources.getColor(R.color.relatives_bg_mode_sleep);
        }
        this.B = color & 16777215;
    }

    public void setSleepGoal(int i) {
        this.m.setMaxItemValue((int) (i * 1.5f));
    }

    public void setStepGoal(int i) {
        this.l.setMaxItemValue((int) ((i >= 8000 ? i : 8000) * J));
        this.c = i;
        this.e = -1.0f;
        this.E = null;
    }

    public void updateBarItemCount(int i) {
        this.g = i;
        HMLog.i(G, "Update Bar Item Count : " + i, new Object[0]);
        this.i = (this.g + (-1)) / 2;
        F();
    }
}
