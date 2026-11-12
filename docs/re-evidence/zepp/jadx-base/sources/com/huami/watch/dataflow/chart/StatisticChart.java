package com.huami.watch.dataflow.chart;

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
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import com.huami.watch.companionlib.R;
import com.huami.watch.dataflow.chart.base.BarChart;
import com.huami.watch.dataflow.chart.util.ChartUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class StatisticChart extends BarChart {
    private static final String Q = "Chart.StatisticChart";
    private static final int R = 8000;
    private static final int S = 480;
    private static final int T = 1000;
    private static final float U = 2.5f;
    private static final float V = 1.5f;
    private static final int W = 80;
    private static final int X = 40;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private float H;
    private float I;
    private Path J;
    private Paint K;
    private Paint L;
    private boolean M;
    private String N;
    private String O;
    private StatisticChartAttr P;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private float h;
    private float i;
    private int j;
    private float k;
    private int l;
    private float m;
    private float n;
    private e o;
    private b p;
    private d q;
    private c r;
    private b s;
    private List<DateItem> t;
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

        /* JADX WARN: Code duplicated, block: B:66:0x0192  */
        /* JADX WARN: Code duplicated, block: B:68:0x01a4  */
        /* JADX WARN: Code duplicated, block: B:69:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:71:0x01b1  */
        /* JADX WARN: Code duplicated, block: B:72:0x01ba  */
        /* JADX WARN: Code duplicated, block: B:75:0x01be  */
        /* JADX WARN: Code duplicated, block: B:78:0x01cb  */
        /* JADX WARN: Code duplicated, block: B:80:0x01d3 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:82:0x01d6  */
        /* JADX WARN: Code duplicated, block: B:84:0x01de  */
        /* JADX WARN: Code duplicated, block: B:86:0x01e5 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:88:0x01e8  */
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
                if (statisticChart.u == 16) {
                    iColorToColor = statisticChart.w;
                    i = statisticChart.x;
                } else if (statisticChart.u == 1) {
                    iColorToColor = statisticChart.A;
                    i = statisticChart.B;
                } else if (statisticChart.u == 256) {
                    iColorToColor = -6042459;
                    i = -9384843;
                } else if (statisticChart.u == 1048576) {
                    iColorToColor = -35261;
                    i = -804510;
                } else if (statisticChart.u == 268435456) {
                    iColorToColor = statisticChart.P.focusColor;
                    i = statisticChart.P.normalColor;
                } else {
                    i = 0;
                    iColorToColor = 0;
                }
                float f11 = statisticChart.m;
                float f12 = statisticChart.n;
                float f13 = rectF.right;
                if (f13 >= f11) {
                    float f14 = rectF.left;
                    if (f14 > f12) {
                        i2 = statisticChart.D;
                        iColorToColor2 = statisticChart.D;
                        i3 = statisticChart.z;
                        iColorToColor3 = statisticChart.z;
                        if (f2 > -1.0f) {
                            i2 = statisticChart.C;
                            i3 = statisticChart.y;
                            i4 = iColorToColor;
                        } else {
                            i4 = i;
                        }
                        if (f3 > -1.0f) {
                            iColorToColor2 = statisticChart.C;
                            iColorToColor3 = statisticChart.y;
                        } else {
                            iColorToColor = i;
                        }
                        if (i4 != iColorToColor) {
                            iColorToColor = ChartUtil.colorToColor(i4, iColorToColor, f);
                        }
                        this.mRenderer.paint.setColor(iColorToColor);
                        if (paint2 != null) {
                            if (statisticChart.u == 16) {
                                if (i3 != iColorToColor3) {
                                    iColorToColor3 = ChartUtil.colorToColor(i3, iColorToColor3, f);
                                }
                                paint2.setColor(iColorToColor3);
                            } else if (statisticChart.u == 1) {
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
                            i5 = statisticChart.D;
                            iColorToColor4 = statisticChart.z;
                            iColorToColor = i;
                        } else if (f6 == 0.0f) {
                            i5 = statisticChart.C;
                            iColorToColor4 = statisticChart.y;
                        } else {
                            float f15 = f6 / fWidth3;
                            iColorToColor = ChartUtil.colorToColor(iColorToColor, i, f15);
                            int iColorToColor5 = ChartUtil.colorToColor(statisticChart.C, statisticChart.D, f15);
                            iColorToColor4 = ChartUtil.colorToColor(statisticChart.y, statisticChart.z, f15);
                            i5 = iColorToColor5;
                        }
                        this.mRenderer.paint.setColor(iColorToColor);
                        if (paint2 != null) {
                            if (statisticChart.u == 16) {
                                paint2.setColor(iColorToColor4);
                            } else if (statisticChart.u == 1) {
                                paint2.setColor(i5);
                            }
                        }
                    }
                } else {
                    i2 = statisticChart.D;
                    iColorToColor2 = statisticChart.D;
                    i3 = statisticChart.z;
                    iColorToColor3 = statisticChart.z;
                    if (f2 > -1.0f) {
                        i2 = statisticChart.C;
                        i3 = statisticChart.y;
                        i4 = iColorToColor;
                    } else {
                        i4 = i;
                    }
                    if (f3 > -1.0f) {
                        iColorToColor2 = statisticChart.C;
                        iColorToColor3 = statisticChart.y;
                    } else {
                        iColorToColor = i;
                    }
                    if (i4 != iColorToColor) {
                        iColorToColor = ChartUtil.colorToColor(i4, iColorToColor, f);
                    }
                    this.mRenderer.paint.setColor(iColorToColor);
                    if (paint2 != null) {
                        if (statisticChart.u == 16) {
                            if (i3 != iColorToColor3) {
                                iColorToColor3 = ChartUtil.colorToColor(i3, iColorToColor3, f);
                            }
                            paint2.setColor(iColorToColor3);
                        } else if (statisticChart.u == 1) {
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

    public static class StatisticChartAttr {
        public int focusColor;
        public int maxValue;
        public int minValue;
        public int mode;
        public int normalColor;
        public int[] valueArrayY;
        public boolean drawLineX = false;
        public boolean drawShadow = true;
        public int mainColor = -1;
        public boolean linearChange = false;
    }

    public static class StatisticHRItem extends BarChart.BarItem implements Comparable<StatisticHRItem> {
        public StatisticHRItem(Context context) {
            super(context);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0062  */
        public void draw(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, float f5) {
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            if (this.needDraw || rectF.height() != 0.0f) {
                StatisticChart statisticChart = (StatisticChart) getParent();
                float f12 = statisticChart.m;
                float f13 = statisticChart.n;
                float f14 = rectF.right;
                if (f14 >= f12) {
                    float f15 = rectF.left;
                    if (f15 > f13) {
                        f6 = statisticChart.I;
                    } else {
                        if (f15 < f12) {
                            f11 = f12 - f15;
                        } else {
                            f11 = f14 > f13 ? f14 - f13 : 0.0f;
                        }
                        float fWidth = rectF.width() / 2.0f;
                        if (f11 >= fWidth) {
                            f6 = statisticChart.I;
                        } else if (f11 == 0.0f) {
                            f6 = statisticChart.H;
                        } else {
                            f6 = statisticChart.H - ((statisticChart.H - statisticChart.I) * (f11 / fWidth));
                        }
                    }
                } else {
                    f6 = statisticChart.I;
                }
                float fCenterX = rectF.centerX();
                float fA = statisticChart.q.a(this.value);
                float fA2 = statisticChart.q.a(this.secondValue);
                int i = this.value;
                int i2 = this.secondValue;
                if (i > i2) {
                    f7 = rectF.top;
                    f8 = rectF.bottom - fA2;
                } else {
                    f7 = rectF.bottom - fA;
                    f8 = rectF.top;
                }
                if (f2 == -1.0f) {
                    f9 = f8;
                    f2 = f7;
                } else {
                    f9 = f2;
                }
                if (f3 == -1.0f) {
                    f10 = f8;
                    f3 = f7;
                } else {
                    f10 = f3;
                }
                if (f2 == -1.0f && f3 == -1.0f) {
                    float f16 = this.mDensity;
                    f9 = f16 * 185.0f;
                    f2 = f16 * 185.0f;
                } else {
                    f7 = f3;
                    f8 = f10;
                }
                float f17 = ((f7 - f2) * f) + f2;
                float f18 = ((f8 - f9) * f) + f9;
                float f19 = f6 * this.mDensity;
                float f20 = (f2 != -1.0f || f3 == -1.0f) ? f19 * f : f19 * (1.0f - f);
                if (i2 <= 0) {
                    this.mRenderer.paint.setColor(statisticChart.F);
                    canvas.drawCircle(fCenterX, f17, f20, this.mRenderer.paint);
                    this.mRenderer.paint.setColor(statisticChart.E);
                    canvas.drawCircle(fCenterX, f17, f20 * 0.5f, this.mRenderer.paint);
                    return;
                }
                this.mRenderer.paint.setColor(statisticChart.F);
                canvas.drawCircle(fCenterX, f17, f20, this.mRenderer.paint);
                this.mRenderer.paint.setColor(-12874497);
                canvas.drawCircle(fCenterX, f18, f20, this.mRenderer.paint);
                this.mRenderer.paint.setColor(statisticChart.E);
                float f21 = f20 * 0.5f;
                canvas.drawCircle(fCenterX, f17, f21, this.mRenderer.paint);
                canvas.drawCircle(fCenterX, f18, f21, this.mRenderer.paint);
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(StatisticHRItem statisticHRItem) {
            return statisticHRItem.index - this.index;
        }

        public void draw(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
            draw(canvas, this.mRect, f, f2, f3, f4, f5);
        }
    }

    public class a extends BarChart.XAxis {
        private final float a;
        private Paint b;
        private Paint c;
        private int d;
        private int e;

        public a(Context context) {
            super(context);
            float f = (this.mDensity * 8.0f) + 0.5f;
            this.a = f;
            TextPaint textPaint = new TextPaint(1);
            this.b = textPaint;
            textPaint.setColor(1275068416);
            this.b.setTextSize(f);
            if (StatisticChart.this.u == 256) {
                e();
                Paint paint = new Paint(1);
                this.c = paint;
                paint.setColor(StatisticChart.this.K(R.color.s3));
                this.c.setStyle(Paint.Style.FILL);
                this.c.setStrokeWidth((this.mDensity * 1.0f) + 0.5f);
                return;
            }
            if (StatisticChart.this.u == 1048576) {
                c();
            } else if (StatisticChart.this.u == 268435456) {
                d();
            } else {
                f();
            }
        }

        private void b(Canvas canvas, RectF rectF) {
            Rect rect = new Rect();
            boolean z = StatisticChart.this.P.drawLineX;
            float f = rectF.left + this.mPaddingLeft;
            if (StatisticChart.this.u == 256) {
                float f2 = rectF.top;
                canvas.drawLine(f, f2, rectF.right - this.mPaddingRight, f2, this.c);
            }
            float f3 = rectF.top;
            float f4 = (this.mDensity * 2.0f) + f3;
            synchronized (StatisticChart.this.t) {
                float fHeight = -1.0f;
                for (DateItem dateItem : StatisticChart.this.t) {
                    if (dateItem.a <= this.offset + ((StatisticChart.this.j - 1) / 2) + 1 && dateItem.a >= (this.offset + ((StatisticChart.this.j - 1) / 2)) - StatisticChart.this.j && dateItem.b != null) {
                        float f5 = (StatisticChart.this.v == 1 ? ((rectF.right - this.mPaddingRight) - ((dateItem.a + 1) * StatisticChart.this.k)) - this.mScroll : ((rectF.right - this.mPaddingRight) + ((dateItem.a - 1) * StatisticChart.this.k)) + this.mScroll) - (((StatisticChart.this.j - 1) / 2) * StatisticChart.this.k);
                        if (dateItem.a == this.offset) {
                            this.b.setColor(this.d);
                        } else {
                            this.b.setColor(this.e);
                        }
                        Paint paint = this.b;
                        String str = dateItem.b;
                        paint.getTextBounds(str, 0, str.length(), rect);
                        float fWidth = f5 + ((StatisticChart.this.k - rect.width()) / 2.0f);
                        if (fHeight == -1.0f) {
                            fHeight = rectF.top + ((this.stroke + rect.height()) / 2.0f);
                        }
                        float fWidth2 = fWidth + (rect.width() / 2);
                        canvas.drawText(dateItem.b, fWidth, fHeight, this.b);
                        if (z) {
                            canvas.drawLine(fWidth2, f3, fWidth2, f4, this.c);
                        }
                    }
                }
            }
        }

        private void d() {
            if (StatisticChart.this.P.mainColor != -1) {
                this.d = StatisticChart.this.P.mainColor;
            } else {
                this.d = -1401708;
            }
            this.e = 1275068416;
        }

        public void a(Canvas canvas, RectF rectF) {
            b(canvas, rectF);
        }

        public void c() {
            this.d = -35261;
            this.e = 1275068416;
        }

        @Override // com.huami.watch.dataflow.chart.base.BaseChart
        public void doScroll(float f) {
            this.offset = -Math.round(this.mScroll / StatisticChart.this.k);
        }

        @Override // com.huami.watch.dataflow.chart.base.BaseChart, com.huami.watch.dataflow.chart.base.Chart
        public void draw(Canvas canvas) {
            a(canvas, this.mRect);
        }

        public void e() {
            if (StatisticChart.this.P.mainColor != -1) {
                this.d = StatisticChart.this.P.mainColor;
            } else {
                this.d = StatisticChart.this.K(R.color.p2);
            }
            this.e = StatisticChart.this.K(R.color.s3);
        }

        public void f() {
            if (StatisticChart.this.P.mainColor != -1) {
                this.d = StatisticChart.this.P.mainColor;
            } else {
                this.d = -11236097;
            }
            this.e = 1275068416;
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

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public boolean itemNeedDraw(BarChart.BarItem barItem) {
            int i = StatisticChart.this.mXAxis.offset;
            return barItem.index >= (i - StatisticChart.this.l) - 1 && barItem.index <= (i + StatisticChart.this.l) + 1;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemOffsetX(RectF rectF, BarChart.BarItem barItem) {
            return StatisticChart.this.v == 1 ? ((StatisticChart.this.l - barItem.index) * StatisticChart.this.k) - StatisticChart.this.mXAxis.getScroll() : ((StatisticChart.this.l + barItem.index) * StatisticChart.this.k) + StatisticChart.this.mXAxis.getScroll();
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemWidth(RectF rectF, BarChart.BarItem barItem) {
            return StatisticChart.this.k - (this.mItemPadding * 2.0f);
        }
    }

    public class c extends e {
        public c(Context context) {
            super(context);
        }
    }

    public class d extends b {
        private Path b;
        private Path c;
        private Paint d;
        private Paint e;
        private Paint f;
        private Paint g;
        private Paint h;
        private int i;

        public d(Context context) {
            super(context);
            this.i = -12874497;
            this.b = new Path();
            this.c = new Path();
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.d.setStrokeWidth(StatisticChart.this.I * this.mDensity);
            this.d.setColor(StatisticChart.this.F);
            Paint paint2 = new Paint();
            this.f = paint2;
            paint2.setStyle(Paint.Style.FILL);
            this.f.setStrokeWidth((this.mDensity * 0.33f) + 0.5f);
            this.f.setColor(870407760);
            TextPaint textPaint = new TextPaint(1);
            this.g = textPaint;
            int i = R.color.s3;
            textPaint.setColor(StatisticChart.this.K(i));
            this.g.setTextSize((this.mDensity * 9.0f) + 0.5f);
            Paint paint3 = new Paint(1);
            this.h = paint3;
            paint3.setColor(StatisticChart.this.K(i));
            this.h.setStyle(Paint.Style.FILL);
            this.h.setStrokeWidth((this.mDensity * 1.0f) + 0.5f);
            Paint paint4 = new Paint(1);
            this.e = paint4;
            paint4.setColor(StatisticChart.this.K(R.color.s38));
            this.e.setStyle(Paint.Style.FILL);
        }

        private void b(Canvas canvas, List<PointF> list, boolean z) {
            int size;
            if (list != null && (size = list.size()) >= 2) {
                this.b.reset();
                this.c.reset();
                PointF pointF = list.get(0);
                this.b.moveTo(pointF.x, pointF.y);
                this.c.moveTo(pointF.x, this.mRect.bottom);
                this.c.lineTo(pointF.x, pointF.y);
                for (int i = 1; i < size; i++) {
                    PointF pointF2 = list.get(i);
                    this.b.lineTo(pointF2.x, pointF2.y);
                    if (StatisticChart.this.P.drawShadow) {
                        this.c.lineTo(pointF2.x, pointF2.y);
                        float f = pointF2.x;
                        canvas.drawLine(f, pointF2.y, f, this.mRect.bottom, this.f);
                    }
                }
                this.c.lineTo(list.get(size - 1).x, this.mRect.bottom);
                if (z) {
                    this.d.setColor(this.i);
                } else {
                    this.d.setColor(StatisticChart.this.F);
                }
                canvas.drawPath(this.b, this.d);
                if (StatisticChart.this.P.drawShadow) {
                    canvas.drawPath(this.c, this.f);
                }
            }
        }

        private void c(Canvas canvas) {
            if (StatisticChart.this.P.valueArrayY != null) {
                Rect rect = new Rect();
                RectF rectF = this.mRect;
                float f = rectF.left;
                float f2 = f + this.mPaddingLeft;
                float f3 = this.mDensity;
                float f4 = f2 - (4.0f * f3);
                canvas.drawRect(0.0f, 0.0f, f, rectF.bottom + (f3 * 30.0f), this.e);
                this.h.setStrokeWidth(this.mDensity * 1.0f);
                RectF rectF2 = this.mRect;
                canvas.drawLine(f2, rectF2.top, f2, rectF2.bottom, this.h);
                this.h.setStrokeWidth(this.mDensity * 0.33f);
                for (int i = 0; i < StatisticChart.this.P.valueArrayY.length; i++) {
                    String strValueOf = String.valueOf(StatisticChart.this.P.valueArrayY[i]);
                    this.g.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
                    float fA = this.mRect.bottom - a(StatisticChart.this.P.valueArrayY[i]);
                    if (!StatisticChart.this.P.drawShadow) {
                        canvas.drawLine(f2, fA, this.mRect.right, fA, this.h);
                    }
                    canvas.drawText(strValueOf, f4 - rect.width(), fA + (rect.height() / 2), this.g);
                }
            }
        }

        public float a(float f) {
            int i = this.mMinItemValue;
            return ((f - i) / (this.mMaxItemValue - i)) * ((this.mRect.height() - this.mPaddingTop) - this.mPaddingBottom);
        }

        @Override // com.huami.watch.dataflow.chart.StatisticChart.b
        public void draw(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
            float f6;
            float f7;
            float f8;
            float f9;
            synchronized (this.mItems) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = this.mItems.size();
                for (int i = 0; i < size; i++) {
                    BarChart.BarItem barItem = (BarChart.BarItem) this.mItems.get(i);
                    if (barItem.needDraw && barItem.value > 0) {
                        float fCenterX = barItem.getRect().centerX();
                        float fA = this.mRect.bottom - a(barItem.value);
                        float fA2 = this.mRect.bottom - a(barItem.secondValue);
                        if (f2 == -1.0f) {
                            f6 = fA;
                            f7 = fA2;
                        } else {
                            f6 = f2;
                            f7 = f6;
                        }
                        if (f3 == -1.0f) {
                            f8 = fA;
                            f9 = fA2;
                        } else {
                            f8 = f3;
                            f9 = f8;
                        }
                        if (f2 == -1.0f && f3 == -1.0f) {
                            f6 = this.mDensity * 185.0f;
                        } else {
                            fA = f8;
                            fA2 = f9;
                        }
                        float f10 = ((fA2 - f7) * f) + f7;
                        arrayList2.add(new PointF(fCenterX, ((fA - f6) * f) + f6));
                        if (barItem.secondValue > 0) {
                            arrayList3.add(new PointF(fCenterX, f10));
                        }
                        arrayList.add(barItem);
                    }
                }
                b(canvas, arrayList2, false);
                b(canvas, arrayList3, true);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((StatisticHRItem) ((BarChart.BarItem) it2.next())).draw(canvas, f, f2, f3, f4, f5);
                }
            }
            c(canvas);
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemHeight(RectF rectF, BarChart.BarItem barItem) {
            int iMax = Math.max(barItem.value, barItem.secondValue);
            int i = this.mMinItemValue;
            return ((iMax - i) / (this.mMaxItemValue - i)) * ((rectF.height() - this.mPaddingTop) - this.mPaddingBottom);
        }

        @Override // com.huami.watch.dataflow.chart.StatisticChart.b, com.huami.watch.dataflow.chart.base.BarChart
        public boolean itemNeedDraw(BarChart.BarItem barItem) {
            int i = StatisticChart.this.mXAxis.offset;
            return barItem.index >= ((i - StatisticChart.this.l) - 1) + (-2) && barItem.index <= ((i + StatisticChart.this.l) + 1) + 2;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
        public void notifyChanged() {
            int i = StatisticChart.this.P.maxValue;
            int i2 = StatisticChart.this.P.minValue;
            for (T t : this.mItems) {
                if (itemNeedDraw(t)) {
                    int iMax = Math.max(t.value, t.secondValue);
                    int iMin = Math.min(t.value, t.secondValue);
                    if (iMin <= 0) {
                        iMin = i2;
                    }
                    if (iMax > i) {
                        int i3 = (((iMax - i) / 30) + 1) * 30;
                        i += i3;
                        i2 -= i3;
                    }
                    if (iMin < i2) {
                        int i4 = (((i2 - iMin) / 30) + 1) * 30;
                        i += i4;
                        i2 -= i4;
                    }
                }
            }
            if (i != this.mMaxItemValue) {
                StatisticChart.this.h = -1.0f;
                StatisticChart.this.J = null;
                setMaxItemValue(i);
                setNeedRealign(true);
            }
            if (i2 != this.mMinItemValue) {
                StatisticChart.this.h = -1.0f;
                StatisticChart.this.J = null;
                setMinItemValue(i2);
                setNeedRealign(true);
            }
            super.notifyChanged();
        }
    }

    public class e extends b {
        public float b;
        public int c;
        private boolean d;

        public e(Context context) {
            super(context);
            this.c = 10;
            this.d = false;
        }

        private float b(float f, int i) {
            float f2 = (f - this.mPaddingTop) - this.mPaddingBottom;
            float f3 = this.mItemBaseHeight;
            float f4 = f2 - f3;
            float f5 = i / this.mMaxItemValue;
            if (f5 > 1.0f) {
                f5 = 1.0f;
            } else if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            return (f4 * f5) + f3;
        }

        public boolean a() {
            return this.d;
        }

        public void c(boolean z) {
            this.d = z;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart
        public float itemHeight(RectF rectF, BarChart.BarItem barItem) {
            if (this.d) {
                return b(rectF.height(), barItem.value);
            }
            int i = barItem.value;
            int i2 = this.mMaxItemValue;
            return i >= i2 ? ((rectF.height() - this.mPaddingTop) - this.mPaddingBottom) - this.mItemBaseHeight : ChartUtil.itemLevelSize(i2, i, this.b, this.c) + this.mItemBaseHeight;
        }

        @Override // com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
        public void onRectChanged(RectF rectF) {
            super.onRectChanged(rectF);
            if (this.d || rectF == null) {
                return;
            }
            this.b = ChartUtil.updateLevelSize(this.mMaxItemValue, ((rectF.height() - this.mPaddingTop) - this.mPaddingBottom) - this.mItemBaseHeight, this.c);
        }
    }

    public StatisticChart(Context context, StatisticChartAttr statisticChartAttr) {
        super(context);
        this.g = -1.0f;
        this.h = -1.0f;
        this.i = -1.0f;
        this.M = true;
        this.P = statisticChartAttr;
        this.u = statisticChartAttr.mode;
        a aVar = new a(context);
        this.mXAxis = aVar;
        aVar.stroke = (int) (this.mDensity * 28.0f);
        aVar.setPadding(this.mPaddingLeft, 0.0f, this.mPaddingRight, 0.0f);
        initChart(context);
        this.t = new ArrayList();
        Paint paint = new Paint();
        this.K = paint;
        paint.setColor(1275068416);
        this.K.setStyle(Paint.Style.STROKE);
        this.K.setStrokeWidth(1.0f);
        Paint paint2 = this.K;
        float f = this.mDensity;
        paint2.setPathEffect(new DashPathEffect(new float[]{4.0f * f, f * 2.0f}, 0.0f));
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        textPaint.setColor(1275068416);
        this.L.setTextSize(this.mDensity * 10.0f);
    }

    private void D(Canvas canvas) {
        int i;
        if (this.M) {
            int i2 = this.u;
            float f = 0.0f;
            if (i2 == 1) {
                float fItemLevelSize = this.g;
                if (fItemLevelSize < 0.0f) {
                    RectF rect = this.o.getRect();
                    int maxItemValue = this.o.getMaxItemValue();
                    fItemLevelSize = rect.bottom;
                    if (maxItemValue > 0) {
                        e eVar = this.o;
                        float f2 = eVar.b;
                        if (f2 > 0.0f) {
                            fItemLevelSize -= ChartUtil.itemLevelSize(maxItemValue, this.d, f2, eVar.c);
                        }
                    }
                    this.g = fItemLevelSize;
                }
                f = fItemLevelSize;
                float f3 = this.mDensity;
                float f4 = 5.3f * f3;
                float f5 = f3 * 10.0f;
                String str = this.d + this.O;
                Rect rect2 = new Rect();
                Paint paint = this.L;
                String str2 = this.N;
                paint.getTextBounds(str2, 0, str2.length(), rect2);
                Rect rect3 = new Rect();
                this.L.getTextBounds(str, 0, str.length(), rect3);
                canvas.drawText(this.N, (this.mRect.right - f5) - rect2.width(), (f - f4) - (rect2.height() / 2), this.L);
                canvas.drawText(str, (this.mRect.right - f5) - rect3.width(), f4 + f + rect3.height(), this.L);
            } else if (i2 == 1048576) {
                this.L.setColor(-2130741693);
                this.K.setColor(-2130741693);
                float fItemLevelSize2 = this.i;
                if (fItemLevelSize2 < 0.0f) {
                    RectF rect4 = this.r.getRect();
                    int maxItemValue2 = this.r.getMaxItemValue();
                    fItemLevelSize2 = rect4.bottom;
                    if (maxItemValue2 > 0) {
                        c cVar = this.r;
                        float f6 = cVar.b;
                        if (f6 > 0.0f) {
                            fItemLevelSize2 -= ChartUtil.itemLevelSize(maxItemValue2, this.f, f6, cVar.c);
                        }
                    }
                    this.i = fItemLevelSize2;
                }
                f = fItemLevelSize2;
                float f7 = this.mDensity;
                float f8 = 5.3f * f7;
                float f9 = f7 * 10.0f;
                String str3 = this.f + this.O;
                Rect rect5 = new Rect();
                Paint paint2 = this.L;
                String str4 = this.N;
                paint2.getTextBounds(str4, 0, str4.length(), rect5);
                Rect rect6 = new Rect();
                this.L.getTextBounds(str3, 0, str3.length(), rect6);
                canvas.drawText(this.N, (this.mRect.right - f9) - rect5.width(), (f - f8) - (rect5.height() / 2), this.L);
                canvas.drawText(str3, (this.mRect.right - f9) - rect6.width(), f8 + f + rect6.height(), this.L);
            } else if (i2 == 256) {
                float f10 = this.h;
                if (f10 < 0.0f) {
                    RectF rect7 = this.q.getRect();
                    int maxItemValue3 = this.q.getMaxItemValue();
                    int minItemValue = this.q.getMinItemValue();
                    float paddingBottom = rect7.bottom - this.q.getPaddingBottom();
                    if (minItemValue > 0 && maxItemValue3 > 0 && (i = this.e) >= minItemValue && i <= maxItemValue3) {
                        paddingBottom -= ((i - minItemValue) / (maxItemValue3 - minItemValue)) * ((rect7.height() - this.q.getPaddingTop()) - this.q.getPaddingBottom());
                    }
                    f = paddingBottom;
                    this.h = f;
                } else {
                    f = f10;
                }
            }
            if (this.J == null) {
                Path path = new Path();
                this.J = path;
                path.moveTo(this.mRect.left, f);
                this.J.lineTo(this.mRect.right, f);
            }
            canvas.drawPath(this.J, this.K);
        }
    }

    private void E(Canvas canvas) {
        RectF rectF = new RectF(this.mRect);
        rectF.left = this.mRect.centerX() - (this.k / 2.0f);
        rectF.right = this.mRect.centerX() + (this.k / 2.0f);
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

    private void F(Context context) {
        c cVar = new c(context);
        this.r = cVar;
        cVar.c(this.P.linearChange);
        this.r.setItemPadding(this.mDensity * 0.83f);
        this.r.setItemBaseHeight((this.mDensity * 1.0f) + 0.5f);
        this.r.setPadding(0.0f, (int) (this.mDensity * 5.0f), 0.0f, 0.0f);
    }

    private void G(Context context) {
        b bVar = new b(context);
        this.s = bVar;
        bVar.setItemBaseHeight((this.mDensity * 1.0f) + 0.5f);
        this.s.setItemPadding(this.mDensity * 0.83f);
        this.s.setMaxItemValue(this.P.maxValue);
        this.s.setMinItemValue(this.P.minValue);
    }

    private void H(Context context) {
        d dVar = new d(context);
        this.q = dVar;
        dVar.setItemPadding(this.mDensity * 0.83f);
    }

    private void I(Context context) {
        b bVar = new b(context);
        this.p = bVar;
        bVar.setItemPadding(this.mDensity * 0.83f);
        this.p.setItemBaseHeight((this.mDensity * 1.0f) + 0.5f);
        this.p.setPadding(0.0f, (int) (this.mDensity * 5.0f), 0.0f, 0.0f);
        setSleepGoal(480);
    }

    private void J(Context context) {
        e eVar = new e(context);
        this.o = eVar;
        eVar.c(this.P.linearChange);
        this.o.setItemPadding(this.mDensity * 0.83f);
        this.o.setItemBaseHeight((this.mDensity * 1.0f) + 0.5f);
        this.o.setPadding(0.0f, (int) (this.mDensity * 5.0f), 0.0f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ColorInt
    public int K(@ColorRes int i) {
        return ContextCompat.getColor(getContext(), i);
    }

    private void L() {
        RectF rectF;
        if (this.j <= 0 || (rectF = this.mRect) == null) {
            return;
        }
        this.k = ((rectF.width() - this.mPaddingLeft) - this.mPaddingRight) / this.j;
        Log.i(Q, "Update Bar Item Width : " + this.k);
        this.m = (float) ((int) (this.mRect.centerX() - (this.k / 2.0f)));
        this.n = (float) ((int) (this.mRect.centerX() + (this.k / 2.0f)));
    }

    private void M(int i) {
        this.b = i;
        this.c = 0;
        Log.i(Q, "MaxValue : " + this.b);
        Log.i(Q, "MinValue : " + this.c);
        this.q.setMaxItemValue(this.b);
        this.q.setMinItemValue(this.c);
    }

    private void N(int i) {
        this.b = 800;
        this.c = 400;
        this.q.setMaxItemValue(800);
        this.q.setMinItemValue(this.c);
        if (i <= 0) {
            return;
        }
        int i2 = this.b;
        if (i > i2) {
            int i3 = (((i - i2) / 100) + 1) * 100;
            this.b = i2 + i3;
            this.c += i3;
        } else {
            int i4 = this.c;
            if (i < i4) {
                int i5 = (((i4 - i) / 100) + 1) * 100;
                this.b = i2 - i5;
                this.c = i4 - i5;
            }
        }
        Log.i(Q, "MaxValue : " + this.b);
        Log.i(Q, "MinValue : " + this.c);
        this.q.setMaxItemValue(this.b);
        this.q.setMinItemValue(this.c);
    }

    private void initChart(Context context) {
        int i = this.u;
        if (i == 1) {
            this.N = context.getString(R.string.goal);
            this.O = context.getString(R.string.unit_step);
            StatisticChartAttr statisticChartAttr = this.P;
            this.A = statisticChartAttr.focusColor;
            this.B = statisticChartAttr.normalColor;
            this.C = -3479563;
            this.D = -10372640;
            J(context);
            return;
        }
        if (i == 16) {
            this.w = -8876545;
            this.x = -4208393;
            this.y = -9545497;
            this.z = -4475923;
            I(context);
            return;
        }
        if (i != 256) {
            if (i != 1048576) {
                if (i != 268435456) {
                    return;
                }
                G(context);
                return;
            } else {
                this.N = context.getString(R.string.goal);
                this.O = context.getString(R.string.unit_calorie);
                F(context);
                return;
            }
        }
        this.E = K(R.color.s5);
        int i2 = this.P.mainColor;
        if (i2 != -1) {
            this.F = i2;
        } else {
            this.F = K(R.color.s30);
        }
        this.H = 6.0f;
        this.I = 4.0f;
        H(context);
    }

    public void clearData() {
        offsetTo(0);
    }

    @Override // com.huami.watch.dataflow.chart.base.BaseChart
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
            if (i3 == i2 && this.mScroll / this.k < i3) {
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
            if (i3 == i2 && (-(this.mScroll / this.k)) < i3) {
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
            float f2 = (-i) * this.k;
            this.mScroll = f2;
            this.mXAxis.scrollTo(f2);
            i3 = this.mXAxis.offset;
            ((StatisticChartView.StatisticChartLoadCallback) this.mLoadCallback).onOverScrolled();
        }
        if (i3 != i2) {
            this.mLoadCallback.loadData(i3, true);
        }
    }

    public void draw(Canvas canvas, float f, float f2, float f3, float f4, float f5, boolean z) {
        this.mXAxis.draw(canvas);
        if (z) {
            return;
        }
        int i = this.u;
        if (i == 16) {
            this.p.draw(canvas, f, f2, f3, f4, f5);
            return;
        }
        if (i == 1) {
            D(canvas);
            this.o.draw(canvas, f, f2, f3, f4, f5);
        } else {
            if (i == 256) {
                this.q.draw(canvas, f, f2, f3, f4, f5);
                return;
            }
            if (i == 1048576) {
                D(canvas);
                this.r.draw(canvas, f, f2, f3, f4, f5);
            } else if (i == 268435456) {
                this.s.draw(canvas, f, f2, f3, f4, f5);
            }
        }
    }

    public void fillCalData(List<StatisticBarItem> list) {
        this.r.fillItems(list);
    }

    public void fillDates(List<DateItem> list) {
        synchronized (this.t) {
            this.t.clear();
            this.t.addAll(list);
        }
    }

    public void fillEcgData(List<StatisticBarItem> list) {
        this.s.fillItems(list);
    }

    public void fillHRtData(List<StatisticHRItem> list) {
        this.q.fillItems(list);
    }

    public void fillSleepData(List<StatisticBarItem> list) {
        this.p.fillItems(list);
    }

    public void fillStepData(List<StatisticBarItem> list) {
        this.o.fillItems(list);
    }

    public int getBarItemCount() {
        return this.j;
    }

    public float getBarItemWidth() {
        return this.k;
    }

    public boolean isShowGoalLine() {
        return this.M;
    }

    public int itemOffset() {
        return this.mXAxis.offset;
    }

    public int justified() {
        int i = (int) (this.mScroll % this.k);
        float fAbs = Math.abs(i);
        float f = this.k;
        if (fAbs > f / 2.0f) {
            return i > 0 ? (int) (-(f - i)) : (int) (f + i);
        }
        return i;
    }

    @Override // com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
    public void notifyChanged() {
        int i = this.u;
        if (i == 256) {
            this.q.notifyChanged();
            return;
        }
        if (i == 16) {
            this.p.notifyChanged();
            return;
        }
        if (i == 1048576) {
            this.r.notifyChanged();
        } else if (i == 268435456) {
            this.s.notifyChanged();
        } else {
            this.o.notifyChanged();
        }
    }

    public int offsetScrolled(float f) {
        int iRound;
        float fCenterX = this.mRect.centerX() - (this.k / 2.0f);
        float fCenterX2 = this.mRect.centerX();
        float f2 = this.k;
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
        float f = i * this.k;
        this.mScroll = f;
        this.mXAxis.scrollTo(f);
    }

    @Override // com.huami.watch.dataflow.chart.base.BarChart, com.huami.watch.dataflow.chart.base.BaseChart
    public void onRectChanged(RectF rectF) {
        super.onRectChanged(rectF);
        L();
        RectF rect = this.mXAxis.getRect();
        int i = this.u;
        if (i == 1) {
            RectF rectF2 = new RectF(rectF);
            rectF2.left = rectF.left + this.mPaddingLeft;
            rectF2.right = rectF.right - this.mPaddingRight;
            rectF2.bottom = rect.top;
            this.o.setRect(rectF2);
            return;
        }
        if (i == 16) {
            RectF rectF3 = new RectF(rectF);
            rectF3.left = rectF.left + this.mPaddingLeft;
            rectF3.right = rectF.right - this.mPaddingRight;
            rectF3.bottom = rect.top;
            this.p.setRect(rectF3);
            return;
        }
        if (i == 256) {
            RectF rectF4 = new RectF(rectF);
            rectF4.left = rectF.left + this.mPaddingLeft;
            rectF4.right = rectF.right - this.mPaddingRight;
            rectF4.bottom = rect.top;
            this.q.setRect(rectF4);
            return;
        }
        if (i == 1048576) {
            RectF rectF5 = new RectF(rectF);
            rectF5.left = rectF.left + this.mPaddingLeft;
            rectF5.right = rectF.right - this.mPaddingRight;
            rectF5.bottom = rect.top;
            this.r.setRect(rectF5);
            return;
        }
        if (i != 268435456) {
            return;
        }
        RectF rectF6 = new RectF(rectF);
        rectF6.left = rectF.left + this.mPaddingLeft;
        rectF6.right = rectF.right - this.mPaddingRight;
        rectF6.bottom = rect.top;
        this.s.setRect(rectF6);
    }

    public void setCalorieGoal(int i, boolean z) {
        c cVar = this.r;
        if (cVar == null) {
            return;
        }
        if (z) {
            cVar.setMaxItemValue((int) ((i >= 1000 ? i : 1000) * U));
        } else {
            cVar.setMaxItemValue(i);
        }
        this.f = i;
        this.i = -1.0f;
        this.J = null;
    }

    public void setHRBase(int i) {
        M(i);
        Log.i(Q, "HR base : " + i);
        this.a = i;
    }

    public void setHRGoal(int i) {
        Log.i(Q, "HRGoal : " + i);
        this.e = i;
        this.h = -1.0f;
        this.J = null;
    }

    public void setLayoutType(int i) {
        this.v = i;
    }

    public void setMode(int i) {
        int color;
        this.u = i;
        Resources resources = getContext().getResources();
        if (i == 1) {
            color = resources.getColor(R.color.bg_mode_step);
        } else if (i == 16) {
            color = resources.getColor(R.color.bg_mode_sleep);
        } else if (i == 256) {
            color = resources.getColor(R.color.bg_mode_weight);
        } else if (i != 1048576) {
            color = i != 268435456 ? 0 : resources.getColor(R.color.bg_mode_ecg);
        } else {
            color = resources.getColor(R.color.bg_mode_step);
        }
        this.G = color & 16777215;
        BarChart.Axis axis = this.mXAxis;
        if (axis instanceof a) {
            if (this.u == 256) {
                ((a) axis).e();
            } else {
                ((a) axis).f();
            }
        }
    }

    public void setShowGoalLine(boolean z) {
        this.M = z;
    }

    public void setSleepGoal(int i) {
        this.p.setMaxItemValue((int) (i * 1.5f));
    }

    public void setStepGoal(int i, boolean z) {
        e eVar = this.o;
        if (eVar == null) {
            return;
        }
        if (z) {
            eVar.setMaxItemValue((int) ((i >= 8000 ? i : 8000) * U));
        } else {
            eVar.setMaxItemValue(i);
        }
        this.d = i;
        this.g = -1.0f;
        this.J = null;
    }

    public void updateBarItemCount(int i) {
        this.j = i;
        Log.i(Q, "Update Bar Item Count : " + i);
        this.l = (this.j + (-1)) / 2;
        L();
    }
}
